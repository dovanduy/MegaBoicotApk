package com.google.android.exoplayer2.extractor.mp4;

import android.util.Log;
import android.util.Pair;
import android.util.SparseArray;
import com.appnext.base.p046b.C1245d;
import com.google.android.exoplayer2.C2793C;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.drm.DrmInitData.SchemeData;
import com.google.android.exoplayer2.extractor.ChunkIndex;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.ExtractorsFactory;
import com.google.android.exoplayer2.extractor.PositionHolder;
import com.google.android.exoplayer2.extractor.SeekMap;
import com.google.android.exoplayer2.extractor.SeekMap.Unseekable;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.extractor.p132ts.PsExtractor;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.NalUnitUtil;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.TimestampAdjuster;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

public final class FragmentedMp4Extractor implements Extractor {
    private static final Format EMSG_FORMAT = Format.createSampleFormat(null, MimeTypes.APPLICATION_EMSG, Long.MAX_VALUE);
    public static final ExtractorsFactory FACTORY = new ExtractorsFactory() {
        public Extractor[] createExtractors() {
            return new Extractor[]{new FragmentedMp4Extractor()};
        }
    };
    public static final int FLAG_ENABLE_EMSG_TRACK = 4;
    private static final int FLAG_SIDELOADED = 8;
    public static final int FLAG_WORKAROUND_EVERY_VIDEO_FRAME_IS_SYNC_FRAME = 1;
    public static final int FLAG_WORKAROUND_IGNORE_EDIT_LISTS = 16;
    public static final int FLAG_WORKAROUND_IGNORE_TFDT_BOX = 2;
    private static final byte[] PIFF_SAMPLE_ENCRYPTION_BOX_EXTENDED_TYPE = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
    private static final int SAMPLE_GROUP_TYPE_seig = Util.getIntegerCodeForString("seig");
    private static final int STATE_READING_ATOM_HEADER = 0;
    private static final int STATE_READING_ATOM_PAYLOAD = 1;
    private static final int STATE_READING_ENCRYPTION_DATA = 2;
    private static final int STATE_READING_SAMPLE_CONTINUE = 4;
    private static final int STATE_READING_SAMPLE_START = 3;
    private static final String TAG = "FragmentedMp4Extractor";
    private final TrackOutput additionalEmsgTrackOutput;
    private ParsableByteArray atomData;
    private final ParsableByteArray atomHeader;
    private int atomHeaderBytesRead;
    private long atomSize;
    private int atomType;
    private TrackOutput[] cea608TrackOutputs;
    private final List<Format> closedCaptionFormats;
    private final ArrayDeque<ContainerAtom> containerAtoms;
    private TrackBundle currentTrackBundle;
    private long durationUs;
    private TrackOutput[] emsgTrackOutputs;
    private long endOfMdatPosition;
    private final byte[] extendedTypeScratch;
    private ExtractorOutput extractorOutput;
    private final int flags;
    private boolean haveOutputSeekMap;
    private final ParsableByteArray nalBuffer;
    private final ParsableByteArray nalPrefix;
    private final ParsableByteArray nalStartCode;
    private int parserState;
    private int pendingMetadataSampleBytes;
    private final ArrayDeque<MetadataSampleInfo> pendingMetadataSampleInfos;
    private long pendingSeekTimeUs;
    private boolean processSeiNalUnitPayload;
    private int sampleBytesWritten;
    private int sampleCurrentNalBytesRemaining;
    private int sampleSize;
    private long segmentIndexEarliestPresentationTimeUs;
    private final DrmInitData sideloadedDrmInitData;
    private final Track sideloadedTrack;
    private final TimestampAdjuster timestampAdjuster;
    private final SparseArray<TrackBundle> trackBundles;

    @Retention(RetentionPolicy.SOURCE)
    public @interface Flags {
    }

    private static final class MetadataSampleInfo {
        public final long presentationTimeDeltaUs;
        public final int size;

        public MetadataSampleInfo(long j, int i) {
            this.presentationTimeDeltaUs = j;
            this.size = i;
        }
    }

    private static final class TrackBundle {
        public int currentSampleInTrackRun;
        public int currentSampleIndex;
        public int currentTrackRunIndex;
        private final ParsableByteArray defaultInitializationVector = new ParsableByteArray();
        public DefaultSampleValues defaultSampleValues;
        private final ParsableByteArray encryptionSignalByte = new ParsableByteArray(1);
        public int firstSampleToOutputIndex;
        public final TrackFragment fragment = new TrackFragment();
        public final TrackOutput output;
        public Track track;

        public TrackBundle(TrackOutput trackOutput) {
            this.output = trackOutput;
        }

        public void init(Track track2, DefaultSampleValues defaultSampleValues2) {
            this.track = (Track) Assertions.checkNotNull(track2);
            this.defaultSampleValues = (DefaultSampleValues) Assertions.checkNotNull(defaultSampleValues2);
            this.output.format(track2.format);
            reset();
        }

        public void updateDrmInitData(DrmInitData drmInitData) {
            TrackEncryptionBox sampleDescriptionEncryptionBox = this.track.getSampleDescriptionEncryptionBox(this.fragment.header.sampleDescriptionIndex);
            this.output.format(this.track.format.copyWithDrmInitData(drmInitData.copyWithSchemeType(sampleDescriptionEncryptionBox != null ? sampleDescriptionEncryptionBox.schemeType : null)));
        }

        public void reset() {
            this.fragment.reset();
            this.currentSampleIndex = 0;
            this.currentTrackRunIndex = 0;
            this.currentSampleInTrackRun = 0;
            this.firstSampleToOutputIndex = 0;
        }

        public void seek(long j) {
            long usToMs = C2793C.usToMs(j);
            int i = this.currentSampleIndex;
            while (i < this.fragment.sampleCount && this.fragment.getSamplePresentationTime(i) < usToMs) {
                if (this.fragment.sampleIsSyncFrameTable[i]) {
                    this.firstSampleToOutputIndex = i;
                }
                i++;
            }
        }

        public boolean next() {
            this.currentSampleIndex++;
            this.currentSampleInTrackRun++;
            if (this.currentSampleInTrackRun != this.fragment.trunLength[this.currentTrackRunIndex]) {
                return true;
            }
            this.currentTrackRunIndex++;
            this.currentSampleInTrackRun = 0;
            return false;
        }

        public int outputSampleEncryptionData() {
            ParsableByteArray parsableByteArray;
            int i;
            if (!this.fragment.definesEncryptionData) {
                return 0;
            }
            TrackEncryptionBox encryptionBox = getEncryptionBox();
            if (encryptionBox.initializationVectorSize != 0) {
                parsableByteArray = this.fragment.sampleEncryptionData;
                i = encryptionBox.initializationVectorSize;
            } else {
                byte[] bArr = encryptionBox.defaultInitializationVector;
                this.defaultInitializationVector.reset(bArr, bArr.length);
                parsableByteArray = this.defaultInitializationVector;
                i = bArr.length;
            }
            boolean z = this.fragment.sampleHasSubsampleEncryptionTable[this.currentSampleIndex];
            this.encryptionSignalByte.data[0] = (byte) ((z ? 128 : 0) | i);
            this.encryptionSignalByte.setPosition(0);
            this.output.sampleData(this.encryptionSignalByte, 1);
            this.output.sampleData(parsableByteArray, i);
            if (!z) {
                return 1 + i;
            }
            ParsableByteArray parsableByteArray2 = this.fragment.sampleEncryptionData;
            int readUnsignedShort = parsableByteArray2.readUnsignedShort();
            parsableByteArray2.skipBytes(-2);
            int i2 = 2 + (6 * readUnsignedShort);
            this.output.sampleData(parsableByteArray2, i2);
            return 1 + i + i2;
        }

        /* access modifiers changed from: private */
        public void skipSampleEncryptionData() {
            if (this.fragment.definesEncryptionData) {
                ParsableByteArray parsableByteArray = this.fragment.sampleEncryptionData;
                TrackEncryptionBox encryptionBox = getEncryptionBox();
                if (encryptionBox.initializationVectorSize != 0) {
                    parsableByteArray.skipBytes(encryptionBox.initializationVectorSize);
                }
                if (this.fragment.sampleHasSubsampleEncryptionTable[this.currentSampleIndex]) {
                    parsableByteArray.skipBytes(6 * parsableByteArray.readUnsignedShort());
                }
            }
        }

        private TrackEncryptionBox getEncryptionBox() {
            int i = this.fragment.header.sampleDescriptionIndex;
            if (this.fragment.trackEncryptionBox != null) {
                return this.fragment.trackEncryptionBox;
            }
            return this.track.getSampleDescriptionEncryptionBox(i);
        }
    }

    public void release() {
    }

    public FragmentedMp4Extractor() {
        this(0);
    }

    public FragmentedMp4Extractor(int i) {
        this(i, null);
    }

    public FragmentedMp4Extractor(int i, TimestampAdjuster timestampAdjuster2) {
        this(i, timestampAdjuster2, null, null);
    }

    public FragmentedMp4Extractor(int i, TimestampAdjuster timestampAdjuster2, Track track, DrmInitData drmInitData) {
        this(i, timestampAdjuster2, track, drmInitData, Collections.emptyList());
    }

    public FragmentedMp4Extractor(int i, TimestampAdjuster timestampAdjuster2, Track track, DrmInitData drmInitData, List<Format> list) {
        this(i, timestampAdjuster2, track, drmInitData, list, null);
    }

    public FragmentedMp4Extractor(int i, TimestampAdjuster timestampAdjuster2, Track track, DrmInitData drmInitData, List<Format> list, TrackOutput trackOutput) {
        this.flags = i | (track != null ? 8 : 0);
        this.timestampAdjuster = timestampAdjuster2;
        this.sideloadedTrack = track;
        this.sideloadedDrmInitData = drmInitData;
        this.closedCaptionFormats = Collections.unmodifiableList(list);
        this.additionalEmsgTrackOutput = trackOutput;
        this.atomHeader = new ParsableByteArray(16);
        this.nalStartCode = new ParsableByteArray(NalUnitUtil.NAL_START_CODE);
        this.nalPrefix = new ParsableByteArray(5);
        this.nalBuffer = new ParsableByteArray();
        this.extendedTypeScratch = new byte[16];
        this.containerAtoms = new ArrayDeque<>();
        this.pendingMetadataSampleInfos = new ArrayDeque<>();
        this.trackBundles = new SparseArray<>();
        this.durationUs = C2793C.TIME_UNSET;
        this.pendingSeekTimeUs = C2793C.TIME_UNSET;
        this.segmentIndexEarliestPresentationTimeUs = C2793C.TIME_UNSET;
        enterReadingAtomHeaderState();
    }

    public boolean sniff(ExtractorInput extractorInput) throws IOException, InterruptedException {
        return Sniffer.sniffFragmented(extractorInput);
    }

    public void init(ExtractorOutput extractorOutput2) {
        this.extractorOutput = extractorOutput2;
        if (this.sideloadedTrack != null) {
            TrackBundle trackBundle = new TrackBundle(extractorOutput2.track(0, this.sideloadedTrack.type));
            trackBundle.init(this.sideloadedTrack, new DefaultSampleValues(0, 0, 0, 0));
            this.trackBundles.put(0, trackBundle);
            maybeInitExtraTracks();
            this.extractorOutput.endTracks();
        }
    }

    public void seek(long j, long j2) {
        int size = this.trackBundles.size();
        for (int i = 0; i < size; i++) {
            ((TrackBundle) this.trackBundles.valueAt(i)).reset();
        }
        this.pendingMetadataSampleInfos.clear();
        this.pendingMetadataSampleBytes = 0;
        this.pendingSeekTimeUs = j2;
        this.containerAtoms.clear();
        enterReadingAtomHeaderState();
    }

    public int read(ExtractorInput extractorInput, PositionHolder positionHolder) throws IOException, InterruptedException {
        while (true) {
            switch (this.parserState) {
                case 0:
                    if (readAtomHeader(extractorInput)) {
                        break;
                    } else {
                        return -1;
                    }
                case 1:
                    readAtomPayload(extractorInput);
                    break;
                case 2:
                    readEncryptionData(extractorInput);
                    break;
                default:
                    if (!readSample(extractorInput)) {
                        break;
                    } else {
                        return 0;
                    }
            }
        }
    }

    private void enterReadingAtomHeaderState() {
        this.parserState = 0;
        this.atomHeaderBytesRead = 0;
    }

    private boolean readAtomHeader(ExtractorInput extractorInput) throws IOException, InterruptedException {
        if (this.atomHeaderBytesRead == 0) {
            if (!extractorInput.readFully(this.atomHeader.data, 0, 8, true)) {
                return false;
            }
            this.atomHeaderBytesRead = 8;
            this.atomHeader.setPosition(0);
            this.atomSize = this.atomHeader.readUnsignedInt();
            this.atomType = this.atomHeader.readInt();
        }
        if (this.atomSize == 1) {
            extractorInput.readFully(this.atomHeader.data, 8, 8);
            this.atomHeaderBytesRead += 8;
            this.atomSize = this.atomHeader.readUnsignedLongToLong();
        } else if (this.atomSize == 0) {
            long length = extractorInput.getLength();
            if (length == -1 && !this.containerAtoms.isEmpty()) {
                length = ((ContainerAtom) this.containerAtoms.peek()).endPosition;
            }
            if (length != -1) {
                this.atomSize = (length - extractorInput.getPosition()) + ((long) this.atomHeaderBytesRead);
            }
        }
        if (this.atomSize < ((long) this.atomHeaderBytesRead)) {
            throw new ParserException("Atom size less than header length (unsupported).");
        }
        long position = extractorInput.getPosition() - ((long) this.atomHeaderBytesRead);
        if (this.atomType == Atom.TYPE_moof) {
            int size = this.trackBundles.size();
            for (int i = 0; i < size; i++) {
                TrackFragment trackFragment = ((TrackBundle) this.trackBundles.valueAt(i)).fragment;
                trackFragment.atomPosition = position;
                trackFragment.auxiliaryDataPosition = position;
                trackFragment.dataPosition = position;
            }
        }
        if (this.atomType == Atom.TYPE_mdat) {
            this.currentTrackBundle = null;
            this.endOfMdatPosition = position + this.atomSize;
            if (!this.haveOutputSeekMap) {
                this.extractorOutput.seekMap(new Unseekable(this.durationUs, position));
                this.haveOutputSeekMap = true;
            }
            this.parserState = 2;
            return true;
        }
        if (shouldParseContainerAtom(this.atomType)) {
            long position2 = (extractorInput.getPosition() + this.atomSize) - 8;
            this.containerAtoms.push(new ContainerAtom(this.atomType, position2));
            if (this.atomSize == ((long) this.atomHeaderBytesRead)) {
                processAtomEnded(position2);
            } else {
                enterReadingAtomHeaderState();
            }
        } else if (shouldParseLeafAtom(this.atomType)) {
            if (this.atomHeaderBytesRead != 8) {
                throw new ParserException("Leaf atom defines extended atom size (unsupported).");
            } else if (this.atomSize > 2147483647L) {
                throw new ParserException("Leaf atom with length > 2147483647 (unsupported).");
            } else {
                this.atomData = new ParsableByteArray((int) this.atomSize);
                System.arraycopy(this.atomHeader.data, 0, this.atomData.data, 0, 8);
                this.parserState = 1;
            }
        } else if (this.atomSize > 2147483647L) {
            throw new ParserException("Skipping atom with length > 2147483647 (unsupported).");
        } else {
            this.atomData = null;
            this.parserState = 1;
        }
        return true;
    }

    private void readAtomPayload(ExtractorInput extractorInput) throws IOException, InterruptedException {
        int i = ((int) this.atomSize) - this.atomHeaderBytesRead;
        if (this.atomData != null) {
            extractorInput.readFully(this.atomData.data, 8, i);
            onLeafAtomRead(new LeafAtom(this.atomType, this.atomData), extractorInput.getPosition());
        } else {
            extractorInput.skipFully(i);
        }
        processAtomEnded(extractorInput.getPosition());
    }

    private void processAtomEnded(long j) throws ParserException {
        while (!this.containerAtoms.isEmpty() && ((ContainerAtom) this.containerAtoms.peek()).endPosition == j) {
            onContainerAtomRead((ContainerAtom) this.containerAtoms.pop());
        }
        enterReadingAtomHeaderState();
    }

    private void onLeafAtomRead(LeafAtom leafAtom, long j) throws ParserException {
        if (!this.containerAtoms.isEmpty()) {
            ((ContainerAtom) this.containerAtoms.peek()).add(leafAtom);
        } else if (leafAtom.type == Atom.TYPE_sidx) {
            Pair parseSidx = parseSidx(leafAtom.data, j);
            this.segmentIndexEarliestPresentationTimeUs = ((Long) parseSidx.first).longValue();
            this.extractorOutput.seekMap((SeekMap) parseSidx.second);
            this.haveOutputSeekMap = true;
        } else if (leafAtom.type == Atom.TYPE_emsg) {
            onEmsgLeafAtomRead(leafAtom.data);
        }
    }

    private void onContainerAtomRead(ContainerAtom containerAtom) throws ParserException {
        if (containerAtom.type == Atom.TYPE_moov) {
            onMoovContainerAtomRead(containerAtom);
        } else if (containerAtom.type == Atom.TYPE_moof) {
            onMoofContainerAtomRead(containerAtom);
        } else if (!this.containerAtoms.isEmpty()) {
            ((ContainerAtom) this.containerAtoms.peek()).add(containerAtom);
        }
    }

    private void onMoovContainerAtomRead(ContainerAtom containerAtom) throws ParserException {
        DrmInitData drmInitData;
        int i;
        int i2;
        ContainerAtom containerAtom2 = containerAtom;
        int i3 = 0;
        boolean z = true;
        Assertions.checkState(this.sideloadedTrack == null, "Unexpected moov box.");
        if (this.sideloadedDrmInitData != null) {
            drmInitData = this.sideloadedDrmInitData;
        } else {
            drmInitData = getDrmInitDataFromAtoms(containerAtom2.leafChildren);
        }
        ContainerAtom containerAtomOfType = containerAtom2.getContainerAtomOfType(Atom.TYPE_mvex);
        SparseArray sparseArray = new SparseArray();
        int size = containerAtomOfType.leafChildren.size();
        long j = -9223372036854775807L;
        for (int i4 = 0; i4 < size; i4++) {
            LeafAtom leafAtom = (LeafAtom) containerAtomOfType.leafChildren.get(i4);
            if (leafAtom.type == Atom.TYPE_trex) {
                Pair parseTrex = parseTrex(leafAtom.data);
                sparseArray.put(((Integer) parseTrex.first).intValue(), parseTrex.second);
            } else if (leafAtom.type == Atom.TYPE_mehd) {
                j = parseMehd(leafAtom.data);
            }
        }
        SparseArray sparseArray2 = new SparseArray();
        int size2 = containerAtom2.containerChildren.size();
        int i5 = 0;
        while (i5 < size2) {
            ContainerAtom containerAtom3 = (ContainerAtom) containerAtom2.containerChildren.get(i5);
            if (containerAtom3.type == Atom.TYPE_trak) {
                i = i5;
                i2 = size2;
                Track parseTrak = AtomParsers.parseTrak(containerAtom3, containerAtom2.getLeafAtomOfType(Atom.TYPE_mvhd), j, drmInitData, (this.flags & 16) != 0, false);
                if (parseTrak != null) {
                    sparseArray2.put(parseTrak.f8631id, parseTrak);
                }
            } else {
                i = i5;
                i2 = size2;
            }
            i5 = i + 1;
            size2 = i2;
        }
        int size3 = sparseArray2.size();
        if (this.trackBundles.size() == 0) {
            while (i3 < size3) {
                Track track = (Track) sparseArray2.valueAt(i3);
                TrackBundle trackBundle = new TrackBundle(this.extractorOutput.track(i3, track.type));
                trackBundle.init(track, getDefaultSampleValues(sparseArray, track.f8631id));
                this.trackBundles.put(track.f8631id, trackBundle);
                this.durationUs = Math.max(this.durationUs, track.durationUs);
                i3++;
            }
            maybeInitExtraTracks();
            this.extractorOutput.endTracks();
            return;
        }
        if (this.trackBundles.size() != size3) {
            z = false;
        }
        Assertions.checkState(z);
        while (i3 < size3) {
            Track track2 = (Track) sparseArray2.valueAt(i3);
            ((TrackBundle) this.trackBundles.get(track2.f8631id)).init(track2, getDefaultSampleValues(sparseArray, track2.f8631id));
            i3++;
        }
    }

    private DefaultSampleValues getDefaultSampleValues(SparseArray<DefaultSampleValues> sparseArray, int i) {
        if (sparseArray.size() == 1) {
            return (DefaultSampleValues) sparseArray.valueAt(0);
        }
        return (DefaultSampleValues) Assertions.checkNotNull(sparseArray.get(i));
    }

    private void onMoofContainerAtomRead(ContainerAtom containerAtom) throws ParserException {
        DrmInitData drmInitData;
        parseMoof(containerAtom, this.trackBundles, this.flags, this.extendedTypeScratch);
        if (this.sideloadedDrmInitData != null) {
            drmInitData = null;
        } else {
            drmInitData = getDrmInitDataFromAtoms(containerAtom.leafChildren);
        }
        if (drmInitData != null) {
            int size = this.trackBundles.size();
            for (int i = 0; i < size; i++) {
                ((TrackBundle) this.trackBundles.valueAt(i)).updateDrmInitData(drmInitData);
            }
        }
        if (this.pendingSeekTimeUs != C2793C.TIME_UNSET) {
            int size2 = this.trackBundles.size();
            for (int i2 = 0; i2 < size2; i2++) {
                ((TrackBundle) this.trackBundles.valueAt(i2)).seek(this.pendingSeekTimeUs);
            }
            this.pendingSeekTimeUs = C2793C.TIME_UNSET;
        }
    }

    private void maybeInitExtraTracks() {
        int i;
        if (this.emsgTrackOutputs == null) {
            this.emsgTrackOutputs = new TrackOutput[2];
            if (this.additionalEmsgTrackOutput != null) {
                this.emsgTrackOutputs[0] = this.additionalEmsgTrackOutput;
                i = 1;
            } else {
                i = 0;
            }
            if ((this.flags & 4) != 0) {
                int i2 = i + 1;
                this.emsgTrackOutputs[i] = this.extractorOutput.track(this.trackBundles.size(), 4);
                i = i2;
            }
            this.emsgTrackOutputs = (TrackOutput[]) Arrays.copyOf(this.emsgTrackOutputs, i);
            for (TrackOutput format : this.emsgTrackOutputs) {
                format.format(EMSG_FORMAT);
            }
        }
        if (this.cea608TrackOutputs == null) {
            this.cea608TrackOutputs = new TrackOutput[this.closedCaptionFormats.size()];
            for (int i3 = 0; i3 < this.cea608TrackOutputs.length; i3++) {
                TrackOutput track = this.extractorOutput.track(this.trackBundles.size() + 1 + i3, 3);
                track.format((Format) this.closedCaptionFormats.get(i3));
                this.cea608TrackOutputs[i3] = track;
            }
        }
    }

    private void onEmsgLeafAtomRead(ParsableByteArray parsableByteArray) {
        TrackOutput[] trackOutputArr;
        if (this.emsgTrackOutputs != null && this.emsgTrackOutputs.length != 0) {
            parsableByteArray.setPosition(12);
            int bytesLeft = parsableByteArray.bytesLeft();
            parsableByteArray.readNullTerminatedString();
            parsableByteArray.readNullTerminatedString();
            long scaleLargeTimestamp = Util.scaleLargeTimestamp(parsableByteArray.readUnsignedInt(), 1000000, parsableByteArray.readUnsignedInt());
            for (TrackOutput trackOutput : this.emsgTrackOutputs) {
                parsableByteArray.setPosition(12);
                trackOutput.sampleData(parsableByteArray, bytesLeft);
            }
            if (this.segmentIndexEarliestPresentationTimeUs != C2793C.TIME_UNSET) {
                long j = this.segmentIndexEarliestPresentationTimeUs + scaleLargeTimestamp;
                if (this.timestampAdjuster != null) {
                    j = this.timestampAdjuster.adjustSampleTimestamp(j);
                }
                for (TrackOutput sampleMetadata : this.emsgTrackOutputs) {
                    sampleMetadata.sampleMetadata(j, 1, bytesLeft, 0, null);
                }
            } else {
                this.pendingMetadataSampleInfos.addLast(new MetadataSampleInfo(scaleLargeTimestamp, bytesLeft));
                this.pendingMetadataSampleBytes += bytesLeft;
            }
        }
    }

    private static Pair<Integer, DefaultSampleValues> parseTrex(ParsableByteArray parsableByteArray) {
        parsableByteArray.setPosition(12);
        return Pair.create(Integer.valueOf(parsableByteArray.readInt()), new DefaultSampleValues(parsableByteArray.readUnsignedIntToInt() - 1, parsableByteArray.readUnsignedIntToInt(), parsableByteArray.readUnsignedIntToInt(), parsableByteArray.readInt()));
    }

    private static long parseMehd(ParsableByteArray parsableByteArray) {
        parsableByteArray.setPosition(8);
        return Atom.parseFullAtomVersion(parsableByteArray.readInt()) == 0 ? parsableByteArray.readUnsignedInt() : parsableByteArray.readUnsignedLongToLong();
    }

    private static void parseMoof(ContainerAtom containerAtom, SparseArray<TrackBundle> sparseArray, int i, byte[] bArr) throws ParserException {
        int size = containerAtom.containerChildren.size();
        for (int i2 = 0; i2 < size; i2++) {
            ContainerAtom containerAtom2 = (ContainerAtom) containerAtom.containerChildren.get(i2);
            if (containerAtom2.type == Atom.TYPE_traf) {
                parseTraf(containerAtom2, sparseArray, i, bArr);
            }
        }
    }

    private static void parseTraf(ContainerAtom containerAtom, SparseArray<TrackBundle> sparseArray, int i, byte[] bArr) throws ParserException {
        TrackBundle parseTfhd = parseTfhd(containerAtom.getLeafAtomOfType(Atom.TYPE_tfhd).data, sparseArray);
        if (parseTfhd != null) {
            TrackFragment trackFragment = parseTfhd.fragment;
            long j = trackFragment.nextFragmentDecodeTime;
            parseTfhd.reset();
            if (containerAtom.getLeafAtomOfType(Atom.TYPE_tfdt) != null && (i & 2) == 0) {
                j = parseTfdt(containerAtom.getLeafAtomOfType(Atom.TYPE_tfdt).data);
            }
            parseTruns(containerAtom, parseTfhd, j, i);
            TrackEncryptionBox sampleDescriptionEncryptionBox = parseTfhd.track.getSampleDescriptionEncryptionBox(trackFragment.header.sampleDescriptionIndex);
            LeafAtom leafAtomOfType = containerAtom.getLeafAtomOfType(Atom.TYPE_saiz);
            if (leafAtomOfType != null) {
                parseSaiz(sampleDescriptionEncryptionBox, leafAtomOfType.data, trackFragment);
            }
            LeafAtom leafAtomOfType2 = containerAtom.getLeafAtomOfType(Atom.TYPE_saio);
            if (leafAtomOfType2 != null) {
                parseSaio(leafAtomOfType2.data, trackFragment);
            }
            LeafAtom leafAtomOfType3 = containerAtom.getLeafAtomOfType(Atom.TYPE_senc);
            if (leafAtomOfType3 != null) {
                parseSenc(leafAtomOfType3.data, trackFragment);
            }
            LeafAtom leafAtomOfType4 = containerAtom.getLeafAtomOfType(Atom.TYPE_sbgp);
            LeafAtom leafAtomOfType5 = containerAtom.getLeafAtomOfType(Atom.TYPE_sgpd);
            if (!(leafAtomOfType4 == null || leafAtomOfType5 == null)) {
                parseSgpd(leafAtomOfType4.data, leafAtomOfType5.data, sampleDescriptionEncryptionBox != null ? sampleDescriptionEncryptionBox.schemeType : null, trackFragment);
            }
            int size = containerAtom.leafChildren.size();
            for (int i2 = 0; i2 < size; i2++) {
                LeafAtom leafAtom = (LeafAtom) containerAtom.leafChildren.get(i2);
                if (leafAtom.type == Atom.TYPE_uuid) {
                    parseUuid(leafAtom.data, trackFragment, bArr);
                }
            }
        }
    }

    private static void parseTruns(ContainerAtom containerAtom, TrackBundle trackBundle, long j, int i) {
        List<LeafAtom> list = containerAtom.leafChildren;
        int size = list.size();
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            LeafAtom leafAtom = (LeafAtom) list.get(i4);
            if (leafAtom.type == Atom.TYPE_trun) {
                ParsableByteArray parsableByteArray = leafAtom.data;
                parsableByteArray.setPosition(12);
                int readUnsignedIntToInt = parsableByteArray.readUnsignedIntToInt();
                if (readUnsignedIntToInt > 0) {
                    i3 += readUnsignedIntToInt;
                    i2++;
                }
            }
        }
        trackBundle.currentTrackRunIndex = 0;
        trackBundle.currentSampleInTrackRun = 0;
        trackBundle.currentSampleIndex = 0;
        trackBundle.fragment.initTables(i2, i3);
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < size; i7++) {
            LeafAtom leafAtom2 = (LeafAtom) list.get(i7);
            if (leafAtom2.type == Atom.TYPE_trun) {
                int i8 = i5 + 1;
                i6 = parseTrun(trackBundle, i5, j, i, leafAtom2.data, i6);
                i5 = i8;
            }
        }
    }

    private static void parseSaiz(TrackEncryptionBox trackEncryptionBox, ParsableByteArray parsableByteArray, TrackFragment trackFragment) throws ParserException {
        int i;
        int i2 = trackEncryptionBox.initializationVectorSize;
        parsableByteArray.setPosition(8);
        boolean z = true;
        if ((Atom.parseFullAtomFlags(parsableByteArray.readInt()) & 1) == 1) {
            parsableByteArray.skipBytes(8);
        }
        int readUnsignedByte = parsableByteArray.readUnsignedByte();
        int readUnsignedIntToInt = parsableByteArray.readUnsignedIntToInt();
        if (readUnsignedIntToInt != trackFragment.sampleCount) {
            StringBuilder sb = new StringBuilder();
            sb.append("Length mismatch: ");
            sb.append(readUnsignedIntToInt);
            sb.append(", ");
            sb.append(trackFragment.sampleCount);
            throw new ParserException(sb.toString());
        }
        if (readUnsignedByte == 0) {
            boolean[] zArr = trackFragment.sampleHasSubsampleEncryptionTable;
            i = 0;
            for (int i3 = 0; i3 < readUnsignedIntToInt; i3++) {
                int readUnsignedByte2 = parsableByteArray.readUnsignedByte();
                i += readUnsignedByte2;
                zArr[i3] = readUnsignedByte2 > i2;
            }
        } else {
            if (readUnsignedByte <= i2) {
                z = false;
            }
            i = 0 + (readUnsignedByte * readUnsignedIntToInt);
            Arrays.fill(trackFragment.sampleHasSubsampleEncryptionTable, 0, readUnsignedIntToInt, z);
        }
        trackFragment.initEncryptionData(i);
    }

    private static void parseSaio(ParsableByteArray parsableByteArray, TrackFragment trackFragment) throws ParserException {
        parsableByteArray.setPosition(8);
        int readInt = parsableByteArray.readInt();
        if ((Atom.parseFullAtomFlags(readInt) & 1) == 1) {
            parsableByteArray.skipBytes(8);
        }
        int readUnsignedIntToInt = parsableByteArray.readUnsignedIntToInt();
        if (readUnsignedIntToInt != 1) {
            StringBuilder sb = new StringBuilder();
            sb.append("Unexpected saio entry count: ");
            sb.append(readUnsignedIntToInt);
            throw new ParserException(sb.toString());
        }
        trackFragment.auxiliaryDataPosition += Atom.parseFullAtomVersion(readInt) == 0 ? parsableByteArray.readUnsignedInt() : parsableByteArray.readUnsignedLongToLong();
    }

    private static TrackBundle parseTfhd(ParsableByteArray parsableByteArray, SparseArray<TrackBundle> sparseArray) {
        parsableByteArray.setPosition(8);
        int parseFullAtomFlags = Atom.parseFullAtomFlags(parsableByteArray.readInt());
        TrackBundle trackBundle = getTrackBundle(sparseArray, parsableByteArray.readInt());
        if (trackBundle == null) {
            return null;
        }
        if ((parseFullAtomFlags & 1) != 0) {
            long readUnsignedLongToLong = parsableByteArray.readUnsignedLongToLong();
            trackBundle.fragment.dataPosition = readUnsignedLongToLong;
            trackBundle.fragment.auxiliaryDataPosition = readUnsignedLongToLong;
        }
        DefaultSampleValues defaultSampleValues = trackBundle.defaultSampleValues;
        trackBundle.fragment.header = new DefaultSampleValues((parseFullAtomFlags & 2) != 0 ? parsableByteArray.readUnsignedIntToInt() - 1 : defaultSampleValues.sampleDescriptionIndex, (parseFullAtomFlags & 8) != 0 ? parsableByteArray.readUnsignedIntToInt() : defaultSampleValues.duration, (parseFullAtomFlags & 16) != 0 ? parsableByteArray.readUnsignedIntToInt() : defaultSampleValues.size, (parseFullAtomFlags & 32) != 0 ? parsableByteArray.readUnsignedIntToInt() : defaultSampleValues.flags);
        return trackBundle;
    }

    private static TrackBundle getTrackBundle(SparseArray<TrackBundle> sparseArray, int i) {
        if (sparseArray.size() == 1) {
            return (TrackBundle) sparseArray.valueAt(0);
        }
        return (TrackBundle) sparseArray.get(i);
    }

    private static long parseTfdt(ParsableByteArray parsableByteArray) {
        parsableByteArray.setPosition(8);
        return Atom.parseFullAtomVersion(parsableByteArray.readInt()) == 1 ? parsableByteArray.readUnsignedLongToLong() : parsableByteArray.readUnsignedInt();
    }

    private static int parseTrun(TrackBundle trackBundle, int i, long j, int i2, ParsableByteArray parsableByteArray, int i3) {
        boolean z;
        int[] iArr;
        long j2;
        boolean z2;
        int i4;
        boolean z3;
        boolean z4;
        TrackBundle trackBundle2 = trackBundle;
        parsableByteArray.setPosition(8);
        int parseFullAtomFlags = Atom.parseFullAtomFlags(parsableByteArray.readInt());
        Track track = trackBundle2.track;
        TrackFragment trackFragment = trackBundle2.fragment;
        DefaultSampleValues defaultSampleValues = trackFragment.header;
        trackFragment.trunLength[i] = parsableByteArray.readUnsignedIntToInt();
        trackFragment.trunDataPosition[i] = trackFragment.dataPosition;
        if ((parseFullAtomFlags & 1) != 0) {
            long[] jArr = trackFragment.trunDataPosition;
            jArr[i] = jArr[i] + ((long) parsableByteArray.readInt());
        }
        boolean z5 = (parseFullAtomFlags & 4) != 0;
        int i5 = defaultSampleValues.flags;
        if (z5) {
            i5 = parsableByteArray.readUnsignedIntToInt();
        }
        boolean z6 = (parseFullAtomFlags & 256) != 0;
        boolean z7 = (parseFullAtomFlags & 512) != 0;
        boolean z8 = (parseFullAtomFlags & C1245d.f3947iP) != 0;
        boolean z9 = (parseFullAtomFlags & 2048) != 0;
        long j3 = 0;
        if (track.editListDurations != null && track.editListDurations.length == 1 && track.editListDurations[0] == 0) {
            j3 = Util.scaleLargeTimestamp(track.editListMediaTimes[0], 1000, track.timescale);
        }
        int[] iArr2 = trackFragment.sampleSizeTable;
        int[] iArr3 = trackFragment.sampleCompositionTimeOffsetTable;
        long[] jArr2 = trackFragment.sampleDecodingTimeTable;
        int i6 = i5;
        boolean[] zArr = trackFragment.sampleIsSyncFrameTable;
        int[] iArr4 = iArr2;
        boolean z10 = track.type == 2 && (i2 & 1) != 0;
        int i7 = i3 + trackFragment.trunLength[i];
        long[] jArr3 = jArr2;
        long j4 = j3;
        long j5 = track.timescale;
        if (i > 0) {
            z = z10;
            iArr = iArr3;
            j2 = trackFragment.nextFragmentDecodeTime;
        } else {
            z = z10;
            iArr = iArr3;
            j2 = j;
        }
        int i8 = i3;
        while (i8 < i7) {
            int readUnsignedIntToInt = z6 ? parsableByteArray.readUnsignedIntToInt() : defaultSampleValues.duration;
            int readUnsignedIntToInt2 = z7 ? parsableByteArray.readUnsignedIntToInt() : defaultSampleValues.size;
            if (i8 == 0 && z5) {
                z2 = z5;
                i4 = i6;
            } else if (z8) {
                i4 = parsableByteArray.readInt();
                z2 = z5;
            } else {
                z2 = z5;
                i4 = defaultSampleValues.flags;
            }
            if (z9) {
                z3 = z9;
                iArr[i8] = (int) ((((long) parsableByteArray.readInt()) * 1000) / j5);
                z4 = false;
            } else {
                z3 = z9;
                z4 = false;
                iArr[i8] = 0;
            }
            jArr3[i8] = Util.scaleLargeTimestamp(j2, 1000, j5) - j4;
            iArr4[i8] = readUnsignedIntToInt2;
            zArr[i8] = (((i4 >> 16) & 1) != 0 || (z && i8 != 0)) ? z4 : true;
            i8++;
            j2 += (long) readUnsignedIntToInt;
            z5 = z2;
            z9 = z3;
            ParsableByteArray parsableByteArray2 = parsableByteArray;
        }
        trackFragment.nextFragmentDecodeTime = j2;
        return i7;
    }

    private static void parseUuid(ParsableByteArray parsableByteArray, TrackFragment trackFragment, byte[] bArr) throws ParserException {
        parsableByteArray.setPosition(8);
        parsableByteArray.readBytes(bArr, 0, 16);
        if (Arrays.equals(bArr, PIFF_SAMPLE_ENCRYPTION_BOX_EXTENDED_TYPE)) {
            parseSenc(parsableByteArray, 16, trackFragment);
        }
    }

    private static void parseSenc(ParsableByteArray parsableByteArray, TrackFragment trackFragment) throws ParserException {
        parseSenc(parsableByteArray, 0, trackFragment);
    }

    private static void parseSenc(ParsableByteArray parsableByteArray, int i, TrackFragment trackFragment) throws ParserException {
        parsableByteArray.setPosition(8 + i);
        int parseFullAtomFlags = Atom.parseFullAtomFlags(parsableByteArray.readInt());
        if ((parseFullAtomFlags & 1) != 0) {
            throw new ParserException("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z = (parseFullAtomFlags & 2) != 0;
        int readUnsignedIntToInt = parsableByteArray.readUnsignedIntToInt();
        if (readUnsignedIntToInt != trackFragment.sampleCount) {
            StringBuilder sb = new StringBuilder();
            sb.append("Length mismatch: ");
            sb.append(readUnsignedIntToInt);
            sb.append(", ");
            sb.append(trackFragment.sampleCount);
            throw new ParserException(sb.toString());
        }
        Arrays.fill(trackFragment.sampleHasSubsampleEncryptionTable, 0, readUnsignedIntToInt, z);
        trackFragment.initEncryptionData(parsableByteArray.bytesLeft());
        trackFragment.fillEncryptionData(parsableByteArray);
    }

    private static void parseSgpd(ParsableByteArray parsableByteArray, ParsableByteArray parsableByteArray2, String str, TrackFragment trackFragment) throws ParserException {
        byte[] bArr;
        parsableByteArray.setPosition(8);
        int readInt = parsableByteArray.readInt();
        if (parsableByteArray.readInt() == SAMPLE_GROUP_TYPE_seig) {
            if (Atom.parseFullAtomVersion(readInt) == 1) {
                parsableByteArray.skipBytes(4);
            }
            if (parsableByteArray.readInt() != 1) {
                throw new ParserException("Entry count in sbgp != 1 (unsupported).");
            }
            parsableByteArray2.setPosition(8);
            int readInt2 = parsableByteArray2.readInt();
            if (parsableByteArray2.readInt() == SAMPLE_GROUP_TYPE_seig) {
                int parseFullAtomVersion = Atom.parseFullAtomVersion(readInt2);
                if (parseFullAtomVersion == 1) {
                    if (parsableByteArray2.readUnsignedInt() == 0) {
                        throw new ParserException("Variable length description in sgpd found (unsupported)");
                    }
                } else if (parseFullAtomVersion >= 2) {
                    parsableByteArray2.skipBytes(4);
                }
                if (parsableByteArray2.readUnsignedInt() != 1) {
                    throw new ParserException("Entry count in sgpd != 1 (unsupported).");
                }
                parsableByteArray2.skipBytes(1);
                int readUnsignedByte = parsableByteArray2.readUnsignedByte();
                int i = (readUnsignedByte & PsExtractor.VIDEO_STREAM_MASK) >> 4;
                int i2 = readUnsignedByte & 15;
                boolean z = parsableByteArray2.readUnsignedByte() == 1;
                if (z) {
                    int readUnsignedByte2 = parsableByteArray2.readUnsignedByte();
                    byte[] bArr2 = new byte[16];
                    parsableByteArray2.readBytes(bArr2, 0, bArr2.length);
                    if (!z || readUnsignedByte2 != 0) {
                        bArr = null;
                    } else {
                        int readUnsignedByte3 = parsableByteArray2.readUnsignedByte();
                        byte[] bArr3 = new byte[readUnsignedByte3];
                        parsableByteArray2.readBytes(bArr3, 0, readUnsignedByte3);
                        bArr = bArr3;
                    }
                    trackFragment.definesEncryptionData = true;
                    TrackEncryptionBox trackEncryptionBox = new TrackEncryptionBox(z, str, readUnsignedByte2, bArr2, i, i2, bArr);
                    trackFragment.trackEncryptionBox = trackEncryptionBox;
                }
            }
        }
    }

    private static Pair<Long, ChunkIndex> parseSidx(ParsableByteArray parsableByteArray, long j) throws ParserException {
        long readUnsignedLongToLong;
        long readUnsignedLongToLong2;
        ParsableByteArray parsableByteArray2 = parsableByteArray;
        parsableByteArray2.setPosition(8);
        int parseFullAtomVersion = Atom.parseFullAtomVersion(parsableByteArray.readInt());
        parsableByteArray2.skipBytes(4);
        long readUnsignedInt = parsableByteArray.readUnsignedInt();
        if (parseFullAtomVersion == 0) {
            readUnsignedLongToLong = parsableByteArray.readUnsignedInt();
            readUnsignedLongToLong2 = j + parsableByteArray.readUnsignedInt();
        } else {
            readUnsignedLongToLong = parsableByteArray.readUnsignedLongToLong();
            readUnsignedLongToLong2 = j + parsableByteArray.readUnsignedLongToLong();
        }
        long j2 = readUnsignedLongToLong;
        long j3 = readUnsignedLongToLong2;
        long scaleLargeTimestamp = Util.scaleLargeTimestamp(j2, 1000000, readUnsignedInt);
        parsableByteArray2.skipBytes(2);
        int readUnsignedShort = parsableByteArray.readUnsignedShort();
        int[] iArr = new int[readUnsignedShort];
        long[] jArr = new long[readUnsignedShort];
        long[] jArr2 = new long[readUnsignedShort];
        long[] jArr3 = new long[readUnsignedShort];
        long j4 = j2;
        int i = 0;
        long j5 = scaleLargeTimestamp;
        while (i < readUnsignedShort) {
            int readInt = parsableByteArray.readInt();
            if ((Integer.MIN_VALUE & readInt) != 0) {
                throw new ParserException("Unhandled indirect reference");
            }
            long readUnsignedInt2 = parsableByteArray.readUnsignedInt();
            iArr[i] = readInt & Integer.MAX_VALUE;
            jArr[i] = j3;
            jArr3[i] = j5;
            long j6 = j4 + readUnsignedInt2;
            long[] jArr4 = jArr3;
            long[] jArr5 = jArr;
            long[] jArr6 = jArr2;
            long j7 = scaleLargeTimestamp;
            long scaleLargeTimestamp2 = Util.scaleLargeTimestamp(j6, 1000000, readUnsignedInt);
            jArr6[i] = scaleLargeTimestamp2 - jArr4[i];
            parsableByteArray2.skipBytes(4);
            long j8 = j3 + ((long) iArr[i]);
            i++;
            jArr2 = jArr6;
            j3 = j8;
            jArr = jArr5;
            scaleLargeTimestamp = j7;
            j4 = j6;
            j5 = scaleLargeTimestamp2;
            jArr3 = jArr4;
        }
        return Pair.create(Long.valueOf(scaleLargeTimestamp), new ChunkIndex(iArr, jArr, jArr2, jArr3));
    }

    private void readEncryptionData(ExtractorInput extractorInput) throws IOException, InterruptedException {
        int size = this.trackBundles.size();
        TrackBundle trackBundle = null;
        long j = Long.MAX_VALUE;
        for (int i = 0; i < size; i++) {
            TrackFragment trackFragment = ((TrackBundle) this.trackBundles.valueAt(i)).fragment;
            if (trackFragment.sampleEncryptionDataNeedsFill && trackFragment.auxiliaryDataPosition < j) {
                long j2 = trackFragment.auxiliaryDataPosition;
                trackBundle = (TrackBundle) this.trackBundles.valueAt(i);
                j = j2;
            }
        }
        if (trackBundle == null) {
            this.parserState = 3;
            return;
        }
        int position = (int) (j - extractorInput.getPosition());
        if (position < 0) {
            throw new ParserException("Offset to encryption data was negative.");
        }
        extractorInput.skipFully(position);
        trackBundle.fragment.fillEncryptionData(extractorInput);
    }

    /* JADX WARNING: type inference failed for: r7v0 */
    /* JADX WARNING: type inference failed for: r7v1, types: [int] */
    /* JADX WARNING: type inference failed for: r7v2 */
    /* JADX WARNING: type inference failed for: r7v3 */
    /* JADX WARNING: type inference failed for: r3v31, types: [boolean] */
    /* JADX WARNING: type inference failed for: r3v37 */
    /* JADX WARNING: type inference failed for: r3v41 */
    /* JADX WARNING: type inference failed for: r7v6 */
    /* JADX WARNING: type inference failed for: r7v7 */
    /* JADX WARNING: type inference failed for: r7v8 */
    /* JADX WARNING: type inference failed for: r7v9 */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r7v2
      assigns: []
      uses: []
      mth insns count: 219
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
    	at jadx.core.ProcessClass.process(ProcessClass.java:35)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Unknown variable types count: 5 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean readSample(com.google.android.exoplayer2.extractor.ExtractorInput r19) throws java.io.IOException, java.lang.InterruptedException {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            int r2 = r0.parserState
            r3 = 0
            r4 = 3
            r5 = 4
            r6 = 1
            r7 = 0
            if (r2 != r4) goto L_0x00a5
            com.google.android.exoplayer2.extractor.mp4.FragmentedMp4Extractor$TrackBundle r2 = r0.currentTrackBundle
            if (r2 != 0) goto L_0x0051
            android.util.SparseArray<com.google.android.exoplayer2.extractor.mp4.FragmentedMp4Extractor$TrackBundle> r2 = r0.trackBundles
            com.google.android.exoplayer2.extractor.mp4.FragmentedMp4Extractor$TrackBundle r2 = getNextFragmentRun(r2)
            if (r2 != 0) goto L_0x0033
            long r2 = r0.endOfMdatPosition
            long r4 = r19.getPosition()
            long r8 = r2 - r4
            int r2 = (int) r8
            if (r2 >= 0) goto L_0x002c
            com.google.android.exoplayer2.ParserException r1 = new com.google.android.exoplayer2.ParserException
            java.lang.String r2 = "Offset to end of mdat was negative."
            r1.<init>(r2)
            throw r1
        L_0x002c:
            r1.skipFully(r2)
            r18.enterReadingAtomHeaderState()
            return r7
        L_0x0033:
            com.google.android.exoplayer2.extractor.mp4.TrackFragment r8 = r2.fragment
            long[] r8 = r8.trunDataPosition
            int r9 = r2.currentTrackRunIndex
            r9 = r8[r9]
            long r11 = r19.getPosition()
            long r13 = r9 - r11
            int r8 = (int) r13
            if (r8 >= 0) goto L_0x004c
            java.lang.String r8 = "FragmentedMp4Extractor"
            java.lang.String r9 = "Ignoring negative offset to sample data."
            android.util.Log.w(r8, r9)
            r8 = r7
        L_0x004c:
            r1.skipFully(r8)
            r0.currentTrackBundle = r2
        L_0x0051:
            com.google.android.exoplayer2.extractor.mp4.FragmentedMp4Extractor$TrackBundle r2 = r0.currentTrackBundle
            com.google.android.exoplayer2.extractor.mp4.TrackFragment r2 = r2.fragment
            int[] r2 = r2.sampleSizeTable
            com.google.android.exoplayer2.extractor.mp4.FragmentedMp4Extractor$TrackBundle r8 = r0.currentTrackBundle
            int r8 = r8.currentSampleIndex
            r2 = r2[r8]
            r0.sampleSize = r2
            com.google.android.exoplayer2.extractor.mp4.FragmentedMp4Extractor$TrackBundle r2 = r0.currentTrackBundle
            int r2 = r2.currentSampleIndex
            com.google.android.exoplayer2.extractor.mp4.FragmentedMp4Extractor$TrackBundle r8 = r0.currentTrackBundle
            int r8 = r8.firstSampleToOutputIndex
            if (r2 >= r8) goto L_0x0080
            int r2 = r0.sampleSize
            r1.skipFully(r2)
            com.google.android.exoplayer2.extractor.mp4.FragmentedMp4Extractor$TrackBundle r1 = r0.currentTrackBundle
            r1.skipSampleEncryptionData()
            com.google.android.exoplayer2.extractor.mp4.FragmentedMp4Extractor$TrackBundle r1 = r0.currentTrackBundle
            boolean r1 = r1.next()
            if (r1 != 0) goto L_0x007d
            r0.currentTrackBundle = r3
        L_0x007d:
            r0.parserState = r4
            return r6
        L_0x0080:
            com.google.android.exoplayer2.extractor.mp4.FragmentedMp4Extractor$TrackBundle r2 = r0.currentTrackBundle
            com.google.android.exoplayer2.extractor.mp4.Track r2 = r2.track
            int r2 = r2.sampleTransformation
            if (r2 != r6) goto L_0x0092
            int r2 = r0.sampleSize
            r8 = 8
            int r2 = r2 - r8
            r0.sampleSize = r2
            r1.skipFully(r8)
        L_0x0092:
            com.google.android.exoplayer2.extractor.mp4.FragmentedMp4Extractor$TrackBundle r2 = r0.currentTrackBundle
            int r2 = r2.outputSampleEncryptionData()
            r0.sampleBytesWritten = r2
            int r2 = r0.sampleSize
            int r8 = r0.sampleBytesWritten
            int r2 = r2 + r8
            r0.sampleSize = r2
            r0.parserState = r5
            r0.sampleCurrentNalBytesRemaining = r7
        L_0x00a5:
            com.google.android.exoplayer2.extractor.mp4.FragmentedMp4Extractor$TrackBundle r2 = r0.currentTrackBundle
            com.google.android.exoplayer2.extractor.mp4.TrackFragment r2 = r2.fragment
            com.google.android.exoplayer2.extractor.mp4.FragmentedMp4Extractor$TrackBundle r8 = r0.currentTrackBundle
            com.google.android.exoplayer2.extractor.mp4.Track r8 = r8.track
            com.google.android.exoplayer2.extractor.mp4.FragmentedMp4Extractor$TrackBundle r9 = r0.currentTrackBundle
            com.google.android.exoplayer2.extractor.TrackOutput r10 = r9.output
            com.google.android.exoplayer2.extractor.mp4.FragmentedMp4Extractor$TrackBundle r9 = r0.currentTrackBundle
            int r9 = r9.currentSampleIndex
            long r11 = r2.getSamplePresentationTime(r9)
            r13 = 1000(0x3e8, double:4.94E-321)
            long r11 = r11 * r13
            com.google.android.exoplayer2.util.TimestampAdjuster r13 = r0.timestampAdjuster
            if (r13 == 0) goto L_0x00c6
            com.google.android.exoplayer2.util.TimestampAdjuster r13 = r0.timestampAdjuster
            long r11 = r13.adjustSampleTimestamp(r11)
        L_0x00c6:
            r14 = r11
            int r11 = r8.nalUnitLengthFieldLength
            if (r11 == 0) goto L_0x0188
            com.google.android.exoplayer2.util.ParsableByteArray r11 = r0.nalPrefix
            byte[] r11 = r11.data
            r11[r7] = r7
            r11[r6] = r7
            r12 = 2
            r11[r12] = r7
            int r12 = r8.nalUnitLengthFieldLength
            int r12 = r12 + r6
            int r13 = r8.nalUnitLengthFieldLength
            int r13 = 4 - r13
        L_0x00dd:
            int r4 = r0.sampleBytesWritten
            int r3 = r0.sampleSize
            if (r4 >= r3) goto L_0x019e
            int r3 = r0.sampleCurrentNalBytesRemaining
            if (r3 != 0) goto L_0x012a
            r1.readFully(r11, r13, r12)
            com.google.android.exoplayer2.util.ParsableByteArray r3 = r0.nalPrefix
            r3.setPosition(r7)
            com.google.android.exoplayer2.util.ParsableByteArray r3 = r0.nalPrefix
            int r3 = r3.readUnsignedIntToInt()
            int r3 = r3 - r6
            r0.sampleCurrentNalBytesRemaining = r3
            com.google.android.exoplayer2.util.ParsableByteArray r3 = r0.nalStartCode
            r3.setPosition(r7)
            com.google.android.exoplayer2.util.ParsableByteArray r3 = r0.nalStartCode
            r10.sampleData(r3, r5)
            com.google.android.exoplayer2.util.ParsableByteArray r3 = r0.nalPrefix
            r10.sampleData(r3, r6)
            com.google.android.exoplayer2.extractor.TrackOutput[] r3 = r0.cea608TrackOutputs
            int r3 = r3.length
            if (r3 <= 0) goto L_0x011a
            com.google.android.exoplayer2.Format r3 = r8.format
            java.lang.String r3 = r3.sampleMimeType
            byte r4 = r11[r5]
            boolean r3 = com.google.android.exoplayer2.util.NalUnitUtil.isNalUnitSei(r3, r4)
            if (r3 == 0) goto L_0x011a
            r3 = r6
            goto L_0x011b
        L_0x011a:
            r3 = r7
        L_0x011b:
            r0.processSeiNalUnitPayload = r3
            int r3 = r0.sampleBytesWritten
            int r3 = r3 + 5
            r0.sampleBytesWritten = r3
            int r3 = r0.sampleSize
            int r3 = r3 + r13
            r0.sampleSize = r3
            r3 = 0
            goto L_0x00dd
        L_0x012a:
            boolean r3 = r0.processSeiNalUnitPayload
            if (r3 == 0) goto L_0x0171
            com.google.android.exoplayer2.util.ParsableByteArray r3 = r0.nalBuffer
            int r4 = r0.sampleCurrentNalBytesRemaining
            r3.reset(r4)
            com.google.android.exoplayer2.util.ParsableByteArray r3 = r0.nalBuffer
            byte[] r3 = r3.data
            int r4 = r0.sampleCurrentNalBytesRemaining
            r1.readFully(r3, r7, r4)
            com.google.android.exoplayer2.util.ParsableByteArray r3 = r0.nalBuffer
            int r4 = r0.sampleCurrentNalBytesRemaining
            r10.sampleData(r3, r4)
            int r3 = r0.sampleCurrentNalBytesRemaining
            com.google.android.exoplayer2.util.ParsableByteArray r4 = r0.nalBuffer
            byte[] r4 = r4.data
            com.google.android.exoplayer2.util.ParsableByteArray r5 = r0.nalBuffer
            int r5 = r5.limit()
            int r4 = com.google.android.exoplayer2.util.NalUnitUtil.unescapeStream(r4, r5)
            com.google.android.exoplayer2.util.ParsableByteArray r5 = r0.nalBuffer
            java.lang.String r6 = "video/hevc"
            com.google.android.exoplayer2.Format r7 = r8.format
            java.lang.String r7 = r7.sampleMimeType
            boolean r6 = r6.equals(r7)
            r5.setPosition(r6)
            com.google.android.exoplayer2.util.ParsableByteArray r5 = r0.nalBuffer
            r5.setLimit(r4)
            com.google.android.exoplayer2.util.ParsableByteArray r4 = r0.nalBuffer
            com.google.android.exoplayer2.extractor.TrackOutput[] r5 = r0.cea608TrackOutputs
            com.google.android.exoplayer2.text.cea.CeaUtil.consume(r14, r4, r5)
            goto L_0x0178
        L_0x0171:
            int r3 = r0.sampleCurrentNalBytesRemaining
            r4 = 0
            int r3 = r10.sampleData(r1, r3, r4)
        L_0x0178:
            int r4 = r0.sampleBytesWritten
            int r4 = r4 + r3
            r0.sampleBytesWritten = r4
            int r4 = r0.sampleCurrentNalBytesRemaining
            int r4 = r4 - r3
            r0.sampleCurrentNalBytesRemaining = r4
            r3 = 0
            r5 = 4
            r6 = 1
            r7 = 0
            goto L_0x00dd
        L_0x0188:
            int r3 = r0.sampleBytesWritten
            int r4 = r0.sampleSize
            if (r3 >= r4) goto L_0x019e
            int r3 = r0.sampleSize
            int r4 = r0.sampleBytesWritten
            int r3 = r3 - r4
            r4 = 0
            int r3 = r10.sampleData(r1, r3, r4)
            int r5 = r0.sampleBytesWritten
            int r5 = r5 + r3
            r0.sampleBytesWritten = r5
            goto L_0x0188
        L_0x019e:
            boolean[] r1 = r2.sampleIsSyncFrameTable
            boolean r1 = r1[r9]
            boolean r3 = r2.definesEncryptionData
            if (r3 == 0) goto L_0x01be
            r3 = 1073741824(0x40000000, float:2.0)
            r1 = r1 | r3
            com.google.android.exoplayer2.extractor.mp4.TrackEncryptionBox r3 = r2.trackEncryptionBox
            if (r3 == 0) goto L_0x01b0
            com.google.android.exoplayer2.extractor.mp4.TrackEncryptionBox r2 = r2.trackEncryptionBox
            goto L_0x01b8
        L_0x01b0:
            com.google.android.exoplayer2.extractor.mp4.DefaultSampleValues r2 = r2.header
            int r2 = r2.sampleDescriptionIndex
            com.google.android.exoplayer2.extractor.mp4.TrackEncryptionBox r2 = r8.getSampleDescriptionEncryptionBox(r2)
        L_0x01b8:
            com.google.android.exoplayer2.extractor.TrackOutput$CryptoData r3 = r2.cryptoData
            r13 = r1
            r16 = r3
            goto L_0x01c1
        L_0x01be:
            r13 = r1
            r16 = 0
        L_0x01c1:
            int r1 = r0.sampleSize
            r2 = 0
            r11 = r14
            r3 = r14
            r14 = r1
            r15 = r2
            r10.sampleMetadata(r11, r13, r14, r15, r16)
            r0.outputPendingMetadataSamples(r3)
            com.google.android.exoplayer2.extractor.mp4.FragmentedMp4Extractor$TrackBundle r1 = r0.currentTrackBundle
            boolean r1 = r1.next()
            if (r1 != 0) goto L_0x01d9
            r1 = 0
            r0.currentTrackBundle = r1
        L_0x01d9:
            r1 = 3
            r0.parserState = r1
            r1 = 1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.extractor.mp4.FragmentedMp4Extractor.readSample(com.google.android.exoplayer2.extractor.ExtractorInput):boolean");
    }

    private void outputPendingMetadataSamples(long j) {
        while (!this.pendingMetadataSampleInfos.isEmpty()) {
            MetadataSampleInfo metadataSampleInfo = (MetadataSampleInfo) this.pendingMetadataSampleInfos.removeFirst();
            this.pendingMetadataSampleBytes -= metadataSampleInfo.size;
            long j2 = j + metadataSampleInfo.presentationTimeDeltaUs;
            if (this.timestampAdjuster != null) {
                j2 = this.timestampAdjuster.adjustSampleTimestamp(j2);
            }
            for (TrackOutput sampleMetadata : this.emsgTrackOutputs) {
                sampleMetadata.sampleMetadata(j2, 1, metadataSampleInfo.size, this.pendingMetadataSampleBytes, null);
            }
        }
    }

    private static TrackBundle getNextFragmentRun(SparseArray<TrackBundle> sparseArray) {
        int size = sparseArray.size();
        TrackBundle trackBundle = null;
        long j = Long.MAX_VALUE;
        for (int i = 0; i < size; i++) {
            TrackBundle trackBundle2 = (TrackBundle) sparseArray.valueAt(i);
            if (trackBundle2.currentTrackRunIndex != trackBundle2.fragment.trunCount) {
                long j2 = trackBundle2.fragment.trunDataPosition[trackBundle2.currentTrackRunIndex];
                if (j2 < j) {
                    trackBundle = trackBundle2;
                    j = j2;
                }
            }
        }
        return trackBundle;
    }

    private static DrmInitData getDrmInitDataFromAtoms(List<LeafAtom> list) {
        int size = list.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            LeafAtom leafAtom = (LeafAtom) list.get(i);
            if (leafAtom.type == Atom.TYPE_pssh) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] bArr = leafAtom.data.data;
                UUID parseUuid = PsshAtomUtil.parseUuid(bArr);
                if (parseUuid == null) {
                    Log.w(TAG, "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList.add(new SchemeData(parseUuid, MimeTypes.VIDEO_MP4, bArr));
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new DrmInitData((List<SchemeData>) arrayList);
    }

    private static boolean shouldParseLeafAtom(int i) {
        return i == Atom.TYPE_hdlr || i == Atom.TYPE_mdhd || i == Atom.TYPE_mvhd || i == Atom.TYPE_sidx || i == Atom.TYPE_stsd || i == Atom.TYPE_tfdt || i == Atom.TYPE_tfhd || i == Atom.TYPE_tkhd || i == Atom.TYPE_trex || i == Atom.TYPE_trun || i == Atom.TYPE_pssh || i == Atom.TYPE_saiz || i == Atom.TYPE_saio || i == Atom.TYPE_senc || i == Atom.TYPE_uuid || i == Atom.TYPE_sbgp || i == Atom.TYPE_sgpd || i == Atom.TYPE_elst || i == Atom.TYPE_mehd || i == Atom.TYPE_emsg;
    }

    private static boolean shouldParseContainerAtom(int i) {
        return i == Atom.TYPE_moov || i == Atom.TYPE_trak || i == Atom.TYPE_mdia || i == Atom.TYPE_minf || i == Atom.TYPE_stbl || i == Atom.TYPE_moof || i == Atom.TYPE_traf || i == Atom.TYPE_mvex || i == Atom.TYPE_edts;
    }
}
