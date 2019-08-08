package com.google.android.exoplayer2.extractor.mp4;

import android.util.Log;
import android.util.Pair;
import com.google.android.exoplayer2.C2793C;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.audio.Ac3Util;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.extractor.GaplessInfoHolder;
import com.google.android.exoplayer2.extractor.mp4.FixedSampleSizeRechunker.Results;
import com.google.android.exoplayer2.extractor.p132ts.PsExtractor;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.Metadata.Entry;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.CodecSpecificDataUtil;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

final class AtomParsers {
    private static final int MAX_GAPLESS_TRIM_SIZE_SAMPLES = 3;
    private static final String TAG = "AtomParsers";
    private static final int TYPE_clcp = Util.getIntegerCodeForString("clcp");
    private static final int TYPE_meta = Util.getIntegerCodeForString("meta");
    private static final int TYPE_sbtl = Util.getIntegerCodeForString("sbtl");
    private static final int TYPE_soun = Util.getIntegerCodeForString("soun");
    private static final int TYPE_subt = Util.getIntegerCodeForString("subt");
    private static final int TYPE_text = Util.getIntegerCodeForString(MimeTypes.BASE_TYPE_TEXT);
    private static final int TYPE_vide = Util.getIntegerCodeForString("vide");

    private static final class ChunkIterator {
        private final ParsableByteArray chunkOffsets;
        private final boolean chunkOffsetsAreLongs;
        public int index;
        public final int length;
        private int nextSamplesPerChunkChangeIndex;
        public int numSamples;
        public long offset;
        private int remainingSamplesPerChunkChanges;
        private final ParsableByteArray stsc;

        public ChunkIterator(ParsableByteArray parsableByteArray, ParsableByteArray parsableByteArray2, boolean z) {
            this.stsc = parsableByteArray;
            this.chunkOffsets = parsableByteArray2;
            this.chunkOffsetsAreLongs = z;
            parsableByteArray2.setPosition(12);
            this.length = parsableByteArray2.readUnsignedIntToInt();
            parsableByteArray.setPosition(12);
            this.remainingSamplesPerChunkChanges = parsableByteArray.readUnsignedIntToInt();
            boolean z2 = true;
            if (parsableByteArray.readInt() != 1) {
                z2 = false;
            }
            Assertions.checkState(z2, "first_chunk must be 1");
            this.index = -1;
        }

        public boolean moveNext() {
            long j;
            int i = this.index + 1;
            this.index = i;
            if (i == this.length) {
                return false;
            }
            if (this.chunkOffsetsAreLongs) {
                j = this.chunkOffsets.readUnsignedLongToLong();
            } else {
                j = this.chunkOffsets.readUnsignedInt();
            }
            this.offset = j;
            if (this.index == this.nextSamplesPerChunkChangeIndex) {
                this.numSamples = this.stsc.readUnsignedIntToInt();
                this.stsc.skipBytes(4);
                int i2 = this.remainingSamplesPerChunkChanges - 1;
                this.remainingSamplesPerChunkChanges = i2;
                this.nextSamplesPerChunkChangeIndex = i2 > 0 ? this.stsc.readUnsignedIntToInt() - 1 : -1;
            }
            return true;
        }
    }

    private interface SampleSizeBox {
        int getSampleCount();

        boolean isFixedSampleSize();

        int readNextSampleSize();
    }

    private static final class StsdData {
        public static final int STSD_HEADER_SIZE = 8;
        public Format format;
        public int nalUnitLengthFieldLength;
        public int requiredSampleTransformation = 0;
        public final TrackEncryptionBox[] trackEncryptionBoxes;

        public StsdData(int i) {
            this.trackEncryptionBoxes = new TrackEncryptionBox[i];
        }
    }

    static final class StszSampleSizeBox implements SampleSizeBox {
        private final ParsableByteArray data;
        private final int fixedSampleSize = this.data.readUnsignedIntToInt();
        private final int sampleCount = this.data.readUnsignedIntToInt();

        public StszSampleSizeBox(LeafAtom leafAtom) {
            this.data = leafAtom.data;
            this.data.setPosition(12);
        }

        public int getSampleCount() {
            return this.sampleCount;
        }

        public int readNextSampleSize() {
            return this.fixedSampleSize == 0 ? this.data.readUnsignedIntToInt() : this.fixedSampleSize;
        }

        public boolean isFixedSampleSize() {
            return this.fixedSampleSize != 0;
        }
    }

    static final class Stz2SampleSizeBox implements SampleSizeBox {
        private int currentByte;
        private final ParsableByteArray data;
        private final int fieldSize = (this.data.readUnsignedIntToInt() & 255);
        private final int sampleCount = this.data.readUnsignedIntToInt();
        private int sampleIndex;

        public boolean isFixedSampleSize() {
            return false;
        }

        public Stz2SampleSizeBox(LeafAtom leafAtom) {
            this.data = leafAtom.data;
            this.data.setPosition(12);
        }

        public int getSampleCount() {
            return this.sampleCount;
        }

        public int readNextSampleSize() {
            if (this.fieldSize == 8) {
                return this.data.readUnsignedByte();
            }
            if (this.fieldSize == 16) {
                return this.data.readUnsignedShort();
            }
            int i = this.sampleIndex;
            this.sampleIndex = i + 1;
            if (i % 2 != 0) {
                return this.currentByte & 15;
            }
            this.currentByte = this.data.readUnsignedByte();
            return (this.currentByte & PsExtractor.VIDEO_STREAM_MASK) >> 4;
        }
    }

    private static final class TkhdData {
        /* access modifiers changed from: private */
        public final long duration;
        /* access modifiers changed from: private */

        /* renamed from: id */
        public final int f8630id;
        /* access modifiers changed from: private */
        public final int rotationDegrees;

        public TkhdData(int i, long j, int i2) {
            this.f8630id = i;
            this.duration = j;
            this.rotationDegrees = i2;
        }
    }

    public static final class UnhandledEditListException extends ParserException {
    }

    public static Track parseTrak(ContainerAtom containerAtom, LeafAtom leafAtom, long j, DrmInitData drmInitData, boolean z, boolean z2) throws ParserException {
        long j2;
        LeafAtom leafAtom2;
        long[] jArr;
        long[] jArr2;
        Track track;
        ContainerAtom containerAtom2 = containerAtom;
        ContainerAtom containerAtomOfType = containerAtom2.getContainerAtomOfType(Atom.TYPE_mdia);
        int parseHdlr = parseHdlr(containerAtomOfType.getLeafAtomOfType(Atom.TYPE_hdlr).data);
        if (parseHdlr == -1) {
            return null;
        }
        TkhdData parseTkhd = parseTkhd(containerAtom2.getLeafAtomOfType(Atom.TYPE_tkhd).data);
        long j3 = C2793C.TIME_UNSET;
        if (j == C2793C.TIME_UNSET) {
            j2 = parseTkhd.duration;
            leafAtom2 = leafAtom;
        } else {
            leafAtom2 = leafAtom;
            j2 = j;
        }
        long parseMvhd = parseMvhd(leafAtom2.data);
        if (j2 != C2793C.TIME_UNSET) {
            j3 = Util.scaleLargeTimestamp(j2, 1000000, parseMvhd);
        }
        long j4 = j3;
        ContainerAtom containerAtomOfType2 = containerAtomOfType.getContainerAtomOfType(Atom.TYPE_minf).getContainerAtomOfType(Atom.TYPE_stbl);
        Pair parseMdhd = parseMdhd(containerAtomOfType.getLeafAtomOfType(Atom.TYPE_mdhd).data);
        StsdData parseStsd = parseStsd(containerAtomOfType2.getLeafAtomOfType(Atom.TYPE_stsd).data, parseTkhd.f8630id, parseTkhd.rotationDegrees, (String) parseMdhd.second, drmInitData, z2);
        if (!z) {
            Pair parseEdts = parseEdts(containerAtom2.getContainerAtomOfType(Atom.TYPE_edts));
            jArr = (long[]) parseEdts.second;
            jArr2 = (long[]) parseEdts.first;
        } else {
            jArr2 = null;
            jArr = null;
        }
        if (parseStsd.format == null) {
            track = null;
        } else {
            int access$100 = parseTkhd.f8630id;
            long longValue = ((Long) parseMdhd.first).longValue();
            Format format = parseStsd.format;
            int i = parseStsd.requiredSampleTransformation;
            TrackEncryptionBox[] trackEncryptionBoxArr = parseStsd.trackEncryptionBoxes;
            int i2 = parseStsd.nalUnitLengthFieldLength;
            track = new Track(access$100, parseHdlr, longValue, parseMvhd, j4, format, i, trackEncryptionBoxArr, i2, jArr2, jArr);
        }
        return track;
    }

    public static TrackSampleTable parseStbl(Track track, ContainerAtom containerAtom, GaplessInfoHolder gaplessInfoHolder) throws ParserException {
        SampleSizeBox sampleSizeBox;
        boolean z;
        int i;
        int i2;
        int i3;
        long j;
        int[] iArr;
        long[] jArr;
        int i4;
        int[] iArr2;
        long[] jArr2;
        long j2;
        int[] iArr3;
        int[] iArr4;
        int i5;
        long[] jArr3;
        long[] jArr4;
        int[] iArr5;
        long[] jArr5;
        int i6;
        int[] iArr6;
        int i7;
        SampleSizeBox sampleSizeBox2;
        int i8;
        int i9;
        int i10;
        ParsableByteArray parsableByteArray;
        int i11;
        Track track2 = track;
        ContainerAtom containerAtom2 = containerAtom;
        GaplessInfoHolder gaplessInfoHolder2 = gaplessInfoHolder;
        LeafAtom leafAtomOfType = containerAtom2.getLeafAtomOfType(Atom.TYPE_stsz);
        if (leafAtomOfType != null) {
            sampleSizeBox = new StszSampleSizeBox(leafAtomOfType);
        } else {
            LeafAtom leafAtomOfType2 = containerAtom2.getLeafAtomOfType(Atom.TYPE_stz2);
            if (leafAtomOfType2 == null) {
                throw new ParserException("Track has no sample table size information");
            }
            sampleSizeBox = new Stz2SampleSizeBox(leafAtomOfType2);
        }
        int sampleCount = sampleSizeBox.getSampleCount();
        if (sampleCount == 0) {
            TrackSampleTable trackSampleTable = new TrackSampleTable(track2, new long[0], new int[0], 0, new long[0], new int[0], C2793C.TIME_UNSET);
            return trackSampleTable;
        }
        LeafAtom leafAtomOfType3 = containerAtom2.getLeafAtomOfType(Atom.TYPE_stco);
        if (leafAtomOfType3 == null) {
            leafAtomOfType3 = containerAtom2.getLeafAtomOfType(Atom.TYPE_co64);
            z = true;
        } else {
            z = false;
        }
        ParsableByteArray parsableByteArray2 = leafAtomOfType3.data;
        ParsableByteArray parsableByteArray3 = containerAtom2.getLeafAtomOfType(Atom.TYPE_stsc).data;
        ParsableByteArray parsableByteArray4 = containerAtom2.getLeafAtomOfType(Atom.TYPE_stts).data;
        LeafAtom leafAtomOfType4 = containerAtom2.getLeafAtomOfType(Atom.TYPE_stss);
        ParsableByteArray parsableByteArray5 = leafAtomOfType4 != null ? leafAtomOfType4.data : null;
        LeafAtom leafAtomOfType5 = containerAtom2.getLeafAtomOfType(Atom.TYPE_ctts);
        ParsableByteArray parsableByteArray6 = leafAtomOfType5 != null ? leafAtomOfType5.data : null;
        ChunkIterator chunkIterator = new ChunkIterator(parsableByteArray3, parsableByteArray2, z);
        parsableByteArray4.setPosition(12);
        int readUnsignedIntToInt = parsableByteArray4.readUnsignedIntToInt() - 1;
        int readUnsignedIntToInt2 = parsableByteArray4.readUnsignedIntToInt();
        int readUnsignedIntToInt3 = parsableByteArray4.readUnsignedIntToInt();
        if (parsableByteArray6 != null) {
            parsableByteArray6.setPosition(12);
            i = parsableByteArray6.readUnsignedIntToInt();
        } else {
            i = 0;
        }
        int i12 = -1;
        if (parsableByteArray5 != null) {
            parsableByteArray5.setPosition(12);
            i2 = parsableByteArray5.readUnsignedIntToInt();
            if (i2 > 0) {
                i12 = parsableByteArray5.readUnsignedIntToInt() - 1;
            } else {
                parsableByteArray5 = null;
            }
        } else {
            i2 = 0;
        }
        long j3 = 0;
        if (!(sampleSizeBox.isFixedSampleSize() && MimeTypes.AUDIO_RAW.equals(track2.format.sampleMimeType) && readUnsignedIntToInt == 0 && i == 0 && i2 == 0)) {
            long[] jArr6 = new long[sampleCount];
            int[] iArr7 = new int[sampleCount];
            long[] jArr7 = new long[sampleCount];
            int i13 = i2;
            iArr = new int[sampleCount];
            int i14 = readUnsignedIntToInt;
            int i15 = readUnsignedIntToInt2;
            ParsableByteArray parsableByteArray7 = parsableByteArray4;
            int i16 = readUnsignedIntToInt3;
            int i17 = i12;
            long j4 = 0;
            int i18 = i13;
            int i19 = 0;
            int i20 = 0;
            int i21 = 0;
            int i22 = 0;
            int i23 = 0;
            int i24 = i;
            long j5 = 0;
            while (i20 < sampleCount) {
                while (i22 == 0) {
                    int i25 = sampleCount;
                    Assertions.checkState(chunkIterator.moveNext());
                    int i26 = i18;
                    int i27 = i16;
                    long j6 = chunkIterator.offset;
                    i22 = chunkIterator.numSamples;
                    j4 = j6;
                    sampleCount = i25;
                    i18 = i26;
                    i16 = i27;
                }
                int i28 = sampleCount;
                int i29 = i18;
                int i30 = i16;
                if (parsableByteArray6 != null) {
                    while (i21 == 0 && i24 > 0) {
                        i21 = parsableByteArray6.readUnsignedIntToInt();
                        i23 = parsableByteArray6.readInt();
                        i24--;
                    }
                    i21--;
                }
                int i31 = i23;
                jArr6[i20] = j4;
                iArr7[i20] = sampleSizeBox.readNextSampleSize();
                if (iArr7[i20] > i19) {
                    i19 = iArr7[i20];
                }
                jArr7[i20] = j5 + ((long) i31);
                iArr[i20] = parsableByteArray5 == null ? 1 : 0;
                if (i20 == i17) {
                    iArr[i20] = 1;
                    i8 = i29 - 1;
                    if (i8 > 0) {
                        i17 = parsableByteArray5.readUnsignedIntToInt() - 1;
                    }
                    i9 = i17;
                    i7 = i31;
                    sampleSizeBox2 = sampleSizeBox;
                } else {
                    i9 = i17;
                    i7 = i31;
                    sampleSizeBox2 = sampleSizeBox;
                    i8 = i29;
                }
                int i32 = i30;
                long j7 = j5 + ((long) i32);
                i15--;
                if (i15 == 0) {
                    i11 = i14;
                    if (i11 > 0) {
                        parsableByteArray = parsableByteArray7;
                        int readUnsignedIntToInt4 = parsableByteArray.readUnsignedIntToInt();
                        i10 = parsableByteArray.readInt();
                        i14 = i11 - 1;
                        i15 = readUnsignedIntToInt4;
                        long j8 = j4 + ((long) iArr7[i20]);
                        i22--;
                        i20++;
                        i17 = i9;
                        i18 = i8;
                        i16 = i10;
                        j4 = j8;
                        sampleCount = i28;
                        j5 = j7;
                        i23 = i7;
                        parsableByteArray7 = parsableByteArray;
                        sampleSizeBox = sampleSizeBox2;
                    } else {
                        parsableByteArray = parsableByteArray7;
                    }
                } else {
                    parsableByteArray = parsableByteArray7;
                    i11 = i14;
                }
                i10 = i32;
                i14 = i11;
                long j82 = j4 + ((long) iArr7[i20]);
                i22--;
                i20++;
                i17 = i9;
                i18 = i8;
                i16 = i10;
                j4 = j82;
                sampleCount = i28;
                j5 = j7;
                i23 = i7;
                parsableByteArray7 = parsableByteArray;
                sampleSizeBox = sampleSizeBox2;
            }
            i3 = sampleCount;
            int i33 = i18;
            int i34 = i14;
            j = j5 + ((long) i23);
            Assertions.checkArgument(i21 == 0);
            while (i24 > 0) {
                Assertions.checkArgument(parsableByteArray6.readUnsignedIntToInt() == 0);
                parsableByteArray6.readInt();
                i24--;
            }
            if (i33 == 0 && i15 == 0 && i22 == 0 && i34 == 0) {
                i4 = i19;
                track2 = track;
            } else {
                String str = TAG;
                StringBuilder sb = new StringBuilder();
                sb.append("Inconsistent stbl box for track ");
                i4 = i19;
                track2 = track;
                sb.append(track2.f8631id);
                sb.append(": remainingSynchronizationSamples ");
                sb.append(i33);
                sb.append(", remainingSamplesAtTimestampDelta ");
                sb.append(i15);
                sb.append(", remainingSamplesInChunk ");
                sb.append(i22);
                sb.append(", remainingTimestampDeltaChanges ");
                sb.append(i34);
                Log.w(str, sb.toString());
            }
            jArr2 = jArr6;
            jArr = jArr7;
            iArr2 = iArr7;
        } else {
            i3 = sampleCount;
            long[] jArr8 = new long[chunkIterator.length];
            int[] iArr8 = new int[chunkIterator.length];
            while (chunkIterator.moveNext()) {
                jArr8[chunkIterator.index] = chunkIterator.offset;
                iArr8[chunkIterator.index] = chunkIterator.numSamples;
            }
            Results rechunk = FixedSampleSizeRechunker.rechunk(Util.getPcmFrameSize(track2.format.pcmEncoding, track2.format.channelCount), jArr8, iArr8, (long) readUnsignedIntToInt3);
            jArr2 = rechunk.offsets;
            iArr2 = rechunk.sizes;
            i4 = rechunk.maximumSize;
            jArr = rechunk.timestamps;
            iArr = rechunk.flags;
            j = rechunk.duration;
        }
        long scaleLargeTimestamp = Util.scaleLargeTimestamp(j, 1000000, track2.timescale);
        if (track2.editListDurations != null) {
            GaplessInfoHolder gaplessInfoHolder3 = gaplessInfoHolder;
            if (!gaplessInfoHolder.hasGaplessInfo()) {
                if (track2.editListDurations.length == 1 && track2.type == 1 && jArr.length >= 2) {
                    long j9 = track2.editListMediaTimes[0];
                    long j10 = scaleLargeTimestamp;
                    long scaleLargeTimestamp2 = j9 + Util.scaleLargeTimestamp(track2.editListDurations[0], track2.timescale, track2.movieTimescale);
                    if (canApplyEditWithGaplessInfo(jArr, j, j9, scaleLargeTimestamp2)) {
                        long j11 = j - scaleLargeTimestamp2;
                        long scaleLargeTimestamp3 = Util.scaleLargeTimestamp(j9 - jArr[0], (long) track2.format.sampleRate, track2.timescale);
                        long scaleLargeTimestamp4 = Util.scaleLargeTimestamp(j11, (long) track2.format.sampleRate, track2.timescale);
                        if (!(scaleLargeTimestamp3 == 0 && scaleLargeTimestamp4 == 0) && scaleLargeTimestamp3 <= 2147483647L && scaleLargeTimestamp4 <= 2147483647L) {
                            gaplessInfoHolder3.encoderDelay = (int) scaleLargeTimestamp3;
                            gaplessInfoHolder3.encoderPadding = (int) scaleLargeTimestamp4;
                            Util.scaleLargeTimestampsInPlace(jArr, 1000000, track2.timescale);
                            TrackSampleTable trackSampleTable2 = new TrackSampleTable(track2, jArr2, iArr2, i4, jArr, iArr, j10);
                            return trackSampleTable2;
                        }
                    }
                }
                if (track2.editListDurations.length == 1 && track2.editListDurations[0] == 0) {
                    long j12 = track2.editListMediaTimes[0];
                    for (int i35 = 0; i35 < jArr.length; i35++) {
                        jArr[i35] = Util.scaleLargeTimestamp(jArr[i35] - j12, 1000000, track2.timescale);
                    }
                    TrackSampleTable trackSampleTable3 = new TrackSampleTable(track2, jArr2, iArr2, i4, jArr, iArr, Util.scaleLargeTimestamp(j - j12, 1000000, track2.timescale));
                    return trackSampleTable3;
                }
                boolean z2 = track2.type == 1;
                int i36 = 0;
                boolean z3 = false;
                int i37 = 0;
                int i38 = 0;
                while (true) {
                    j2 = -1;
                    if (i36 >= track2.editListDurations.length) {
                        break;
                    }
                    long j13 = track2.editListMediaTimes[i36];
                    if (j13 != -1) {
                        iArr6 = iArr2;
                        i6 = i4;
                        long scaleLargeTimestamp5 = Util.scaleLargeTimestamp(track2.editListDurations[i36], track2.timescale, track2.movieTimescale);
                        int binarySearchCeil = Util.binarySearchCeil(jArr, j13, true, true);
                        jArr5 = jArr2;
                        int binarySearchCeil2 = Util.binarySearchCeil(jArr, j13 + scaleLargeTimestamp5, z2, false);
                        i37 += binarySearchCeil2 - binarySearchCeil;
                        boolean z4 = i38 != binarySearchCeil;
                        i38 = binarySearchCeil2;
                        z3 = z4 | z3;
                    } else {
                        jArr5 = jArr2;
                        iArr6 = iArr2;
                        i6 = i4;
                    }
                    i36++;
                    iArr2 = iArr6;
                    i4 = i6;
                    jArr2 = jArr5;
                    track2 = track;
                }
                long[] jArr9 = jArr2;
                int[] iArr9 = iArr2;
                int i39 = i4;
                boolean z5 = (i37 != i3) | z3;
                long[] jArr10 = z5 ? new long[i37] : jArr9;
                int[] iArr10 = z5 ? new int[i37] : iArr9;
                if (z5) {
                    i39 = 0;
                }
                int[] iArr11 = z5 ? new int[i37] : iArr;
                long[] jArr11 = new long[i37];
                Track track3 = track;
                int i40 = 0;
                int i41 = 0;
                while (i40 < track3.editListDurations.length) {
                    long j14 = track3.editListMediaTimes[i40];
                    long j15 = track3.editListDurations[i40];
                    if (j14 != j2) {
                        jArr3 = jArr11;
                        i5 = i40;
                        long scaleLargeTimestamp6 = j14 + Util.scaleLargeTimestamp(j15, track3.timescale, track3.movieTimescale);
                        int binarySearchCeil3 = Util.binarySearchCeil(jArr, j14, true, true);
                        int binarySearchCeil4 = Util.binarySearchCeil(jArr, scaleLargeTimestamp6, z2, false);
                        if (z5) {
                            int i42 = binarySearchCeil4 - binarySearchCeil3;
                            jArr4 = jArr9;
                            System.arraycopy(jArr4, binarySearchCeil3, jArr10, i41, i42);
                            iArr5 = iArr9;
                            System.arraycopy(iArr5, binarySearchCeil3, iArr10, i41, i42);
                            System.arraycopy(iArr, binarySearchCeil3, iArr11, i41, i42);
                        } else {
                            iArr5 = iArr9;
                            jArr4 = jArr9;
                        }
                        if (binarySearchCeil3 < binarySearchCeil4) {
                            if ((iArr11[i41] & 1) == 0) {
                                Log.w(TAG, "Ignoring edit list: edit does not start with a sync sample.");
                                throw new UnhandledEditListException();
                            }
                        }
                        int i43 = i41;
                        int i44 = i39;
                        while (binarySearchCeil3 < binarySearchCeil4) {
                            int[] iArr12 = iArr;
                            int[] iArr13 = iArr11;
                            long j16 = j14;
                            jArr3[i43] = Util.scaleLargeTimestamp(j3, 1000000, track3.movieTimescale) + Util.scaleLargeTimestamp(jArr[binarySearchCeil3] - j14, 1000000, track3.timescale);
                            if (z5 && iArr10[i43] > i44) {
                                i44 = iArr5[binarySearchCeil3];
                            }
                            i43++;
                            binarySearchCeil3++;
                            iArr = iArr12;
                            iArr11 = iArr13;
                            j14 = j16;
                        }
                        iArr4 = iArr;
                        iArr3 = iArr11;
                        i39 = i44;
                        i41 = i43;
                    } else {
                        iArr4 = iArr;
                        iArr3 = iArr11;
                        jArr3 = jArr11;
                        i5 = i40;
                        iArr5 = iArr9;
                        jArr4 = jArr9;
                    }
                    i40 = i5 + 1;
                    j3 += j15;
                    iArr9 = iArr5;
                    jArr9 = jArr4;
                    jArr11 = jArr3;
                    iArr = iArr4;
                    iArr11 = iArr3;
                    j2 = -1;
                }
                TrackSampleTable trackSampleTable4 = new TrackSampleTable(track3, jArr10, iArr10, i39, jArr11, iArr11, Util.scaleLargeTimestamp(j3, 1000000, track3.timescale));
                return trackSampleTable4;
            }
        }
        long[] jArr12 = jArr2;
        int i45 = i4;
        int[] iArr14 = iArr;
        long j17 = scaleLargeTimestamp;
        Track track4 = track2;
        int[] iArr15 = iArr2;
        Util.scaleLargeTimestampsInPlace(jArr, 1000000, track4.timescale);
        TrackSampleTable trackSampleTable5 = new TrackSampleTable(track4, jArr12, iArr15, i45, jArr, iArr14, j17);
        return trackSampleTable5;
    }

    public static Metadata parseUdta(LeafAtom leafAtom, boolean z) {
        if (z) {
            return null;
        }
        ParsableByteArray parsableByteArray = leafAtom.data;
        parsableByteArray.setPosition(8);
        while (parsableByteArray.bytesLeft() >= 8) {
            int position = parsableByteArray.getPosition();
            int readInt = parsableByteArray.readInt();
            if (parsableByteArray.readInt() == Atom.TYPE_meta) {
                parsableByteArray.setPosition(position);
                return parseMetaAtom(parsableByteArray, position + readInt);
            }
            parsableByteArray.skipBytes(readInt - 8);
        }
        return null;
    }

    private static Metadata parseMetaAtom(ParsableByteArray parsableByteArray, int i) {
        parsableByteArray.skipBytes(12);
        while (parsableByteArray.getPosition() < i) {
            int position = parsableByteArray.getPosition();
            int readInt = parsableByteArray.readInt();
            if (parsableByteArray.readInt() == Atom.TYPE_ilst) {
                parsableByteArray.setPosition(position);
                return parseIlst(parsableByteArray, position + readInt);
            }
            parsableByteArray.skipBytes(readInt - 8);
        }
        return null;
    }

    private static Metadata parseIlst(ParsableByteArray parsableByteArray, int i) {
        parsableByteArray.skipBytes(8);
        ArrayList arrayList = new ArrayList();
        while (parsableByteArray.getPosition() < i) {
            Entry parseIlstElement = MetadataUtil.parseIlstElement(parsableByteArray);
            if (parseIlstElement != null) {
                arrayList.add(parseIlstElement);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new Metadata((List<? extends Entry>) arrayList);
    }

    private static long parseMvhd(ParsableByteArray parsableByteArray) {
        int i = 8;
        parsableByteArray.setPosition(8);
        if (Atom.parseFullAtomVersion(parsableByteArray.readInt()) != 0) {
            i = 16;
        }
        parsableByteArray.skipBytes(i);
        return parsableByteArray.readUnsignedInt();
    }

    private static TkhdData parseTkhd(ParsableByteArray parsableByteArray) {
        boolean z;
        int i = 8;
        parsableByteArray.setPosition(8);
        int parseFullAtomVersion = Atom.parseFullAtomVersion(parsableByteArray.readInt());
        parsableByteArray.skipBytes(parseFullAtomVersion == 0 ? 8 : 16);
        int readInt = parsableByteArray.readInt();
        parsableByteArray.skipBytes(4);
        int position = parsableByteArray.getPosition();
        if (parseFullAtomVersion == 0) {
            i = 4;
        }
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i3 >= i) {
                z = true;
                break;
            } else if (parsableByteArray.data[position + i3] != -1) {
                z = false;
                break;
            } else {
                i3++;
            }
        }
        long j = C2793C.TIME_UNSET;
        if (z) {
            parsableByteArray.skipBytes(i);
        } else {
            long readUnsignedInt = parseFullAtomVersion == 0 ? parsableByteArray.readUnsignedInt() : parsableByteArray.readUnsignedLongToLong();
            if (readUnsignedInt != 0) {
                j = readUnsignedInt;
            }
        }
        parsableByteArray.skipBytes(16);
        int readInt2 = parsableByteArray.readInt();
        int readInt3 = parsableByteArray.readInt();
        parsableByteArray.skipBytes(4);
        int readInt4 = parsableByteArray.readInt();
        int readInt5 = parsableByteArray.readInt();
        if (readInt2 == 0 && readInt3 == 65536 && readInt4 == -65536 && readInt5 == 0) {
            i2 = 90;
        } else if (readInt2 == 0 && readInt3 == -65536 && readInt4 == 65536 && readInt5 == 0) {
            i2 = 270;
        } else if (readInt2 == -65536 && readInt3 == 0 && readInt4 == 0 && readInt5 == -65536) {
            i2 = 180;
        }
        return new TkhdData(readInt, j, i2);
    }

    private static int parseHdlr(ParsableByteArray parsableByteArray) {
        parsableByteArray.setPosition(16);
        int readInt = parsableByteArray.readInt();
        if (readInt == TYPE_soun) {
            return 1;
        }
        if (readInt == TYPE_vide) {
            return 2;
        }
        if (readInt == TYPE_text || readInt == TYPE_sbtl || readInt == TYPE_subt || readInt == TYPE_clcp) {
            return 3;
        }
        return readInt == TYPE_meta ? 4 : -1;
    }

    private static Pair<Long, String> parseMdhd(ParsableByteArray parsableByteArray) {
        int i = 8;
        parsableByteArray.setPosition(8);
        int parseFullAtomVersion = Atom.parseFullAtomVersion(parsableByteArray.readInt());
        parsableByteArray.skipBytes(parseFullAtomVersion == 0 ? 8 : 16);
        long readUnsignedInt = parsableByteArray.readUnsignedInt();
        if (parseFullAtomVersion == 0) {
            i = 4;
        }
        parsableByteArray.skipBytes(i);
        int readUnsignedShort = parsableByteArray.readUnsignedShort();
        StringBuilder sb = new StringBuilder();
        sb.append("");
        sb.append((char) (((readUnsignedShort >> 10) & 31) + 96));
        sb.append((char) (((readUnsignedShort >> 5) & 31) + 96));
        sb.append((char) ((readUnsignedShort & 31) + 96));
        return Pair.create(Long.valueOf(readUnsignedInt), sb.toString());
    }

    private static StsdData parseStsd(ParsableByteArray parsableByteArray, int i, int i2, String str, DrmInitData drmInitData, boolean z) throws ParserException {
        ParsableByteArray parsableByteArray2 = parsableByteArray;
        parsableByteArray2.setPosition(12);
        int readInt = parsableByteArray.readInt();
        StsdData stsdData = new StsdData(readInt);
        for (int i3 = 0; i3 < readInt; i3++) {
            int position = parsableByteArray.getPosition();
            int readInt2 = parsableByteArray.readInt();
            Assertions.checkArgument(readInt2 > 0, "childAtomSize should be positive");
            int readInt3 = parsableByteArray.readInt();
            if (readInt3 == Atom.TYPE_avc1 || readInt3 == Atom.TYPE_avc3 || readInt3 == Atom.TYPE_encv || readInt3 == Atom.TYPE_mp4v || readInt3 == Atom.TYPE_hvc1 || readInt3 == Atom.TYPE_hev1 || readInt3 == Atom.TYPE_s263 || readInt3 == Atom.TYPE_vp08 || readInt3 == Atom.TYPE_vp09) {
                parseVideoSampleEntry(parsableByteArray2, readInt3, position, readInt2, i, i2, drmInitData, stsdData, i3);
            } else if (readInt3 == Atom.TYPE_mp4a || readInt3 == Atom.TYPE_enca || readInt3 == Atom.TYPE_ac_3 || readInt3 == Atom.TYPE_ec_3 || readInt3 == Atom.TYPE_dtsc || readInt3 == Atom.TYPE_dtse || readInt3 == Atom.TYPE_dtsh || readInt3 == Atom.TYPE_dtsl || readInt3 == Atom.TYPE_samr || readInt3 == Atom.TYPE_sawb || readInt3 == Atom.TYPE_lpcm || readInt3 == Atom.TYPE_sowt || readInt3 == Atom.TYPE__mp3 || readInt3 == Atom.TYPE_alac) {
                parseAudioSampleEntry(parsableByteArray2, readInt3, position, readInt2, i, str, z, drmInitData, stsdData, i3);
            } else if (readInt3 == Atom.TYPE_TTML || readInt3 == Atom.TYPE_tx3g || readInt3 == Atom.TYPE_wvtt || readInt3 == Atom.TYPE_stpp || readInt3 == Atom.TYPE_c608) {
                parseTextSampleEntry(parsableByteArray2, readInt3, position, readInt2, i, str, stsdData);
            } else if (readInt3 == Atom.TYPE_camm) {
                stsdData.format = Format.createSampleFormat(Integer.toString(i), MimeTypes.APPLICATION_CAMERA_MOTION, null, -1, null);
            }
            parsableByteArray2.setPosition(position + readInt2);
        }
        return stsdData;
    }

    private static void parseTextSampleEntry(ParsableByteArray parsableByteArray, int i, int i2, int i3, int i4, String str, StsdData stsdData) throws ParserException {
        String str2;
        String str3;
        ParsableByteArray parsableByteArray2 = parsableByteArray;
        int i5 = i;
        StsdData stsdData2 = stsdData;
        parsableByteArray2.setPosition(i2 + 8 + 8);
        List list = null;
        long j = Long.MAX_VALUE;
        if (i5 == Atom.TYPE_TTML) {
            str2 = MimeTypes.APPLICATION_TTML;
        } else if (i5 == Atom.TYPE_tx3g) {
            String str4 = MimeTypes.APPLICATION_TX3G;
            int i6 = (i3 - 8) - 8;
            byte[] bArr = new byte[i6];
            parsableByteArray2.readBytes(bArr, 0, i6);
            list = Collections.singletonList(bArr);
            str3 = str4;
            stsdData2.format = Format.createTextSampleFormat(Integer.toString(i4), str3, null, -1, 0, str, -1, null, j, list);
        } else if (i5 == Atom.TYPE_wvtt) {
            str2 = MimeTypes.APPLICATION_MP4VTT;
        } else if (i5 == Atom.TYPE_stpp) {
            str2 = MimeTypes.APPLICATION_TTML;
            j = 0;
        } else if (i5 == Atom.TYPE_c608) {
            str2 = MimeTypes.APPLICATION_MP4CEA608;
            stsdData2.requiredSampleTransformation = 1;
        } else {
            throw new IllegalStateException();
        }
        str3 = str2;
        stsdData2.format = Format.createTextSampleFormat(Integer.toString(i4), str3, null, -1, 0, str, -1, null, j, list);
    }

    /* JADX WARNING: Removed duplicated region for block: B:74:0x014a A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x014b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void parseVideoSampleEntry(com.google.android.exoplayer2.util.ParsableByteArray r22, int r23, int r24, int r25, int r26, int r27, com.google.android.exoplayer2.drm.DrmInitData r28, com.google.android.exoplayer2.extractor.mp4.AtomParsers.StsdData r29, int r30) throws com.google.android.exoplayer2.ParserException {
        /*
            r0 = r22
            r1 = r24
            r2 = r25
            r3 = r28
            r4 = r29
            int r5 = r1 + 8
            int r5 = r5 + 8
            r0.setPosition(r5)
            r5 = 16
            r0.skipBytes(r5)
            int r11 = r22.readUnsignedShort()
            int r12 = r22.readUnsignedShort()
            r5 = 50
            r0.skipBytes(r5)
            int r5 = r22.getPosition()
            int r6 = com.google.android.exoplayer2.extractor.mp4.Atom.TYPE_encv
            r7 = 0
            r8 = r23
            if (r8 != r6) goto L_0x0055
            android.util.Pair r6 = parseSampleEntryEncryptionData(r0, r1, r2)
            if (r6 == 0) goto L_0x0052
            java.lang.Object r8 = r6.first
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            if (r3 != 0) goto L_0x0040
            r3 = r7
            goto L_0x004a
        L_0x0040:
            java.lang.Object r9 = r6.second
            com.google.android.exoplayer2.extractor.mp4.TrackEncryptionBox r9 = (com.google.android.exoplayer2.extractor.mp4.TrackEncryptionBox) r9
            java.lang.String r9 = r9.schemeType
            com.google.android.exoplayer2.drm.DrmInitData r3 = r3.copyWithSchemeType(r9)
        L_0x004a:
            com.google.android.exoplayer2.extractor.mp4.TrackEncryptionBox[] r9 = r4.trackEncryptionBoxes
            java.lang.Object r6 = r6.second
            com.google.android.exoplayer2.extractor.mp4.TrackEncryptionBox r6 = (com.google.android.exoplayer2.extractor.mp4.TrackEncryptionBox) r6
            r9[r30] = r6
        L_0x0052:
            r0.setPosition(r5)
        L_0x0055:
            r20 = r3
            r3 = -1
            r9 = 1065353216(0x3f800000, float:1.0)
            r18 = r3
            r14 = r7
            r17 = r14
            r16 = r9
            r3 = 0
        L_0x0062:
            int r9 = r5 - r1
            if (r9 >= r2) goto L_0x0148
            r0.setPosition(r5)
            int r9 = r22.getPosition()
            int r10 = r22.readInt()
            if (r10 != 0) goto L_0x007c
            int r13 = r22.getPosition()
            int r13 = r13 - r1
            if (r13 != r2) goto L_0x007c
            goto L_0x0148
        L_0x007c:
            if (r10 <= 0) goto L_0x0080
            r15 = 1
            goto L_0x0081
        L_0x0080:
            r15 = 0
        L_0x0081:
            java.lang.String r6 = "childAtomSize should be positive"
            com.google.android.exoplayer2.util.Assertions.checkArgument(r15, r6)
            int r6 = r22.readInt()
            int r15 = com.google.android.exoplayer2.extractor.mp4.Atom.TYPE_avcC
            r13 = 3
            if (r6 != r15) goto L_0x00b0
            if (r7 != 0) goto L_0x0093
            r6 = 1
            goto L_0x0094
        L_0x0093:
            r6 = 0
        L_0x0094:
            com.google.android.exoplayer2.util.Assertions.checkState(r6)
            java.lang.String r7 = "video/avc"
            int r9 = r9 + 8
            r0.setPosition(r9)
            com.google.android.exoplayer2.video.AvcConfig r6 = com.google.android.exoplayer2.video.AvcConfig.parse(r22)
            java.util.List<byte[]> r14 = r6.initializationData
            int r9 = r6.nalUnitLengthFieldLength
            r4.nalUnitLengthFieldLength = r9
            if (r3 != 0) goto L_0x0145
            float r6 = r6.pixelWidthAspectRatio
            r16 = r6
            goto L_0x0145
        L_0x00b0:
            int r15 = com.google.android.exoplayer2.extractor.mp4.Atom.TYPE_hvcC
            if (r6 != r15) goto L_0x00cf
            if (r7 != 0) goto L_0x00b8
            r6 = 1
            goto L_0x00b9
        L_0x00b8:
            r6 = 0
        L_0x00b9:
            com.google.android.exoplayer2.util.Assertions.checkState(r6)
            java.lang.String r7 = "video/hevc"
            int r9 = r9 + 8
            r0.setPosition(r9)
            com.google.android.exoplayer2.video.HevcConfig r6 = com.google.android.exoplayer2.video.HevcConfig.parse(r22)
            java.util.List<byte[]> r14 = r6.initializationData
            int r6 = r6.nalUnitLengthFieldLength
            r4.nalUnitLengthFieldLength = r6
            goto L_0x0145
        L_0x00cf:
            int r15 = com.google.android.exoplayer2.extractor.mp4.Atom.TYPE_vpcC
            if (r6 != r15) goto L_0x00e7
            if (r7 != 0) goto L_0x00d7
            r6 = 1
            goto L_0x00d8
        L_0x00d7:
            r6 = 0
        L_0x00d8:
            com.google.android.exoplayer2.util.Assertions.checkState(r6)
            int r6 = com.google.android.exoplayer2.extractor.mp4.Atom.TYPE_vp08
            if (r8 != r6) goto L_0x00e4
            java.lang.String r6 = "video/x-vnd.on2.vp8"
        L_0x00e1:
            r7 = r6
            goto L_0x0145
        L_0x00e4:
            java.lang.String r6 = "video/x-vnd.on2.vp9"
            goto L_0x00e1
        L_0x00e7:
            int r15 = com.google.android.exoplayer2.extractor.mp4.Atom.TYPE_d263
            if (r6 != r15) goto L_0x00f6
            if (r7 != 0) goto L_0x00ef
            r6 = 1
            goto L_0x00f0
        L_0x00ef:
            r6 = 0
        L_0x00f0:
            com.google.android.exoplayer2.util.Assertions.checkState(r6)
            java.lang.String r7 = "video/3gpp"
            goto L_0x0145
        L_0x00f6:
            int r15 = com.google.android.exoplayer2.extractor.mp4.Atom.TYPE_esds
            if (r6 != r15) goto L_0x0111
            if (r7 != 0) goto L_0x00fe
            r6 = 1
            goto L_0x00ff
        L_0x00fe:
            r6 = 0
        L_0x00ff:
            com.google.android.exoplayer2.util.Assertions.checkState(r6)
            android.util.Pair r6 = parseEsdsFromParent(r0, r9)
            java.lang.Object r7 = r6.first
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r6 = r6.second
            java.util.List r14 = java.util.Collections.singletonList(r6)
            goto L_0x0145
        L_0x0111:
            int r15 = com.google.android.exoplayer2.extractor.mp4.Atom.TYPE_pasp
            if (r6 != r15) goto L_0x011b
            float r16 = parsePaspFromParent(r0, r9)
            r3 = 1
            goto L_0x0145
        L_0x011b:
            int r15 = com.google.android.exoplayer2.extractor.mp4.Atom.TYPE_sv3d
            if (r6 != r15) goto L_0x0124
            byte[] r17 = parseProjFromParent(r0, r9, r10)
            goto L_0x0145
        L_0x0124:
            int r9 = com.google.android.exoplayer2.extractor.mp4.Atom.TYPE_st3d
            if (r6 != r9) goto L_0x0145
            int r6 = r22.readUnsignedByte()
            r0.skipBytes(r13)
            if (r6 != 0) goto L_0x0145
            int r6 = r22.readUnsignedByte()
            switch(r6) {
                case 0: goto L_0x0143;
                case 1: goto L_0x0140;
                case 2: goto L_0x013c;
                case 3: goto L_0x0139;
                default: goto L_0x0138;
            }
        L_0x0138:
            goto L_0x0145
        L_0x0139:
            r18 = r13
            goto L_0x0145
        L_0x013c:
            r6 = 2
            r18 = r6
            goto L_0x0145
        L_0x0140:
            r18 = 1
            goto L_0x0145
        L_0x0143:
            r18 = 0
        L_0x0145:
            int r5 = r5 + r10
            goto L_0x0062
        L_0x0148:
            if (r7 != 0) goto L_0x014b
            return
        L_0x014b:
            java.lang.String r6 = java.lang.Integer.toString(r26)
            r8 = 0
            r9 = -1
            r10 = -1
            r13 = -1082130432(0xffffffffbf800000, float:-1.0)
            r19 = 0
            r15 = r27
            com.google.android.exoplayer2.Format r0 = com.google.android.exoplayer2.Format.createVideoSampleFormat(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            r4.format = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.extractor.mp4.AtomParsers.parseVideoSampleEntry(com.google.android.exoplayer2.util.ParsableByteArray, int, int, int, int, int, com.google.android.exoplayer2.drm.DrmInitData, com.google.android.exoplayer2.extractor.mp4.AtomParsers$StsdData, int):void");
    }

    private static Pair<long[], long[]> parseEdts(ContainerAtom containerAtom) {
        if (containerAtom != null) {
            LeafAtom leafAtomOfType = containerAtom.getLeafAtomOfType(Atom.TYPE_elst);
            if (leafAtomOfType != null) {
                ParsableByteArray parsableByteArray = leafAtomOfType.data;
                parsableByteArray.setPosition(8);
                int parseFullAtomVersion = Atom.parseFullAtomVersion(parsableByteArray.readInt());
                int readUnsignedIntToInt = parsableByteArray.readUnsignedIntToInt();
                long[] jArr = new long[readUnsignedIntToInt];
                long[] jArr2 = new long[readUnsignedIntToInt];
                for (int i = 0; i < readUnsignedIntToInt; i++) {
                    jArr[i] = parseFullAtomVersion == 1 ? parsableByteArray.readUnsignedLongToLong() : parsableByteArray.readUnsignedInt();
                    jArr2[i] = parseFullAtomVersion == 1 ? parsableByteArray.readLong() : (long) parsableByteArray.readInt();
                    if (parsableByteArray.readShort() != 1) {
                        throw new IllegalArgumentException("Unsupported media rate.");
                    }
                    parsableByteArray.skipBytes(2);
                }
                return Pair.create(jArr, jArr2);
            }
        }
        return Pair.create(null, null);
    }

    private static float parsePaspFromParent(ParsableByteArray parsableByteArray, int i) {
        parsableByteArray.setPosition(i + 8);
        return ((float) parsableByteArray.readUnsignedIntToInt()) / ((float) parsableByteArray.readUnsignedIntToInt());
    }

    private static void parseAudioSampleEntry(ParsableByteArray parsableByteArray, int i, int i2, int i3, int i4, String str, boolean z, DrmInitData drmInitData, StsdData stsdData, int i5) throws ParserException {
        int i6;
        int i7;
        int i8;
        List list;
        String str2;
        int i9;
        int i10;
        DrmInitData drmInitData2;
        boolean z2;
        int i11;
        byte[] bArr;
        StsdData stsdData2;
        int i12;
        String str3;
        byte[] bArr2;
        int i13;
        int i14;
        ParsableByteArray parsableByteArray2 = parsableByteArray;
        int i15 = i2;
        int i16 = i3;
        String str4 = str;
        DrmInitData drmInitData3 = drmInitData;
        StsdData stsdData3 = stsdData;
        int i17 = 8;
        parsableByteArray2.setPosition(i15 + 8 + 8);
        boolean z3 = false;
        if (z) {
            i6 = parsableByteArray.readUnsignedShort();
            parsableByteArray2.skipBytes(6);
        } else {
            parsableByteArray2.skipBytes(8);
            i6 = 0;
        }
        int i18 = 2;
        if (i6 == 0 || i6 == 1) {
            int readUnsignedShort = parsableByteArray.readUnsignedShort();
            parsableByteArray2.skipBytes(6);
            i8 = parsableByteArray.readUnsignedFixedPoint1616();
            if (i6 == 1) {
                parsableByteArray2.skipBytes(16);
            }
            i7 = readUnsignedShort;
        } else if (i6 == 2) {
            parsableByteArray2.skipBytes(16);
            i8 = (int) Math.round(parsableByteArray.readDouble());
            i7 = parsableByteArray.readUnsignedIntToInt();
            parsableByteArray2.skipBytes(20);
        } else {
            return;
        }
        int position = parsableByteArray.getPosition();
        int i19 = i;
        if (i19 == Atom.TYPE_enca) {
            Pair parseSampleEntryEncryptionData = parseSampleEntryEncryptionData(parsableByteArray2, i15, i16);
            if (parseSampleEntryEncryptionData != null) {
                i19 = ((Integer) parseSampleEntryEncryptionData.first).intValue();
                if (drmInitData3 == null) {
                    drmInitData3 = null;
                } else {
                    drmInitData3 = drmInitData3.copyWithSchemeType(((TrackEncryptionBox) parseSampleEntryEncryptionData.second).schemeType);
                }
                stsdData3.trackEncryptionBoxes[i5] = (TrackEncryptionBox) parseSampleEntryEncryptionData.second;
            }
            parsableByteArray2.setPosition(position);
        }
        DrmInitData drmInitData4 = drmInitData3;
        String str5 = i19 == Atom.TYPE_ac_3 ? MimeTypes.AUDIO_AC3 : i19 == Atom.TYPE_ec_3 ? MimeTypes.AUDIO_E_AC3 : i19 == Atom.TYPE_dtsc ? MimeTypes.AUDIO_DTS : (i19 == Atom.TYPE_dtsh || i19 == Atom.TYPE_dtsl) ? MimeTypes.AUDIO_DTS_HD : i19 == Atom.TYPE_dtse ? MimeTypes.AUDIO_DTS_EXPRESS : i19 == Atom.TYPE_samr ? MimeTypes.AUDIO_AMR_NB : i19 == Atom.TYPE_sawb ? MimeTypes.AUDIO_AMR_WB : (i19 == Atom.TYPE_lpcm || i19 == Atom.TYPE_sowt) ? MimeTypes.AUDIO_RAW : i19 == Atom.TYPE__mp3 ? MimeTypes.AUDIO_MPEG : i19 == Atom.TYPE_alac ? MimeTypes.AUDIO_ALAC : null;
        String str6 = str5;
        int i20 = i8;
        int i21 = i7;
        int i22 = position;
        byte[] bArr3 = null;
        while (i22 - i15 < i16) {
            parsableByteArray2.setPosition(i22);
            int readInt = parsableByteArray.readInt();
            Assertions.checkArgument(readInt > 0 ? true : z3, "childAtomSize should be positive");
            int readInt2 = parsableByteArray.readInt();
            if (readInt2 == Atom.TYPE_esds || (z && readInt2 == Atom.TYPE_wave)) {
                byte[] bArr4 = bArr3;
                String str7 = str6;
                i11 = i22;
                drmInitData2 = drmInitData4;
                z2 = z3;
                i9 = i17;
                stsdData2 = stsdData3;
                i10 = 2;
                if (readInt2 == Atom.TYPE_esds) {
                    i12 = i11;
                } else {
                    i12 = findEsdsPosition(parsableByteArray2, i11, readInt);
                }
                if (i12 != -1) {
                    Pair parseEsdsFromParent = parseEsdsFromParent(parsableByteArray2, i12);
                    str3 = (String) parseEsdsFromParent.first;
                    bArr = (byte[]) parseEsdsFromParent.second;
                    if (MimeTypes.AUDIO_AAC.equals(str3)) {
                        Pair parseAacAudioSpecificConfig = CodecSpecificDataUtil.parseAacAudioSpecificConfig(bArr);
                        i20 = ((Integer) parseAacAudioSpecificConfig.first).intValue();
                        i21 = ((Integer) parseAacAudioSpecificConfig.second).intValue();
                    }
                } else {
                    str3 = str7;
                    bArr = bArr4;
                }
                str2 = str3;
            } else {
                if (readInt2 == Atom.TYPE_dac3) {
                    parsableByteArray2.setPosition(i17 + i22);
                    stsdData3.format = Ac3Util.parseAc3AnnexFFormat(parsableByteArray2, Integer.toString(i4), str4, drmInitData4);
                } else if (readInt2 == Atom.TYPE_dec3) {
                    parsableByteArray2.setPosition(i17 + i22);
                    stsdData3.format = Ac3Util.parseEAc3AnnexFFormat(parsableByteArray2, Integer.toString(i4), str4, drmInitData4);
                } else {
                    if (readInt2 == Atom.TYPE_ddts) {
                        i13 = readInt;
                        str2 = str6;
                        i14 = i22;
                        drmInitData2 = drmInitData4;
                        bArr2 = bArr3;
                        i10 = 2;
                        i9 = i17;
                        stsdData2 = stsdData3;
                        stsdData2.format = Format.createAudioSampleFormat(Integer.toString(i4), str6, null, -1, -1, i21, i20, null, drmInitData2, 0, str4);
                    } else {
                        i13 = readInt;
                        bArr2 = bArr3;
                        str2 = str6;
                        i14 = i22;
                        drmInitData2 = drmInitData4;
                        i9 = i17;
                        stsdData2 = stsdData3;
                        i10 = 2;
                        if (readInt2 == Atom.TYPE_alac) {
                            readInt = i13;
                            bArr = new byte[readInt];
                            i11 = i14;
                            parsableByteArray2.setPosition(i11);
                            z2 = false;
                            parsableByteArray2.readBytes(bArr, 0, readInt);
                        }
                    }
                    readInt = i13;
                    i11 = i14;
                    z2 = false;
                    bArr = bArr2;
                }
                bArr2 = bArr3;
                str2 = str6;
                i11 = i22;
                drmInitData2 = drmInitData4;
                z2 = z3;
                i9 = i17;
                stsdData2 = stsdData3;
                i10 = 2;
                bArr = bArr2;
            }
            i22 = i11 + readInt;
            stsdData3 = stsdData2;
            bArr3 = bArr;
            z3 = z2;
            drmInitData4 = drmInitData2;
            i18 = i10;
            i17 = i9;
            str6 = str2;
            i16 = i3;
        }
        byte[] bArr5 = bArr3;
        String str8 = str6;
        DrmInitData drmInitData5 = drmInitData4;
        int i23 = i18;
        StsdData stsdData4 = stsdData3;
        if (stsdData4.format == null) {
            String str9 = str8;
            if (str9 != null) {
                int i24 = MimeTypes.AUDIO_RAW.equals(str9) ? i23 : -1;
                String num = Integer.toString(i4);
                byte[] bArr6 = bArr5;
                if (bArr6 == null) {
                    list = null;
                } else {
                    list = Collections.singletonList(bArr6);
                }
                stsdData4.format = Format.createAudioSampleFormat(num, str9, null, -1, -1, i21, i20, i24, list, drmInitData5, 0, str4);
            }
        }
    }

    private static int findEsdsPosition(ParsableByteArray parsableByteArray, int i, int i2) {
        int position = parsableByteArray.getPosition();
        while (position - i < i2) {
            parsableByteArray.setPosition(position);
            int readInt = parsableByteArray.readInt();
            Assertions.checkArgument(readInt > 0, "childAtomSize should be positive");
            if (parsableByteArray.readInt() == Atom.TYPE_esds) {
                return position;
            }
            position += readInt;
        }
        return -1;
    }

    private static Pair<String, byte[]> parseEsdsFromParent(ParsableByteArray parsableByteArray, int i) {
        parsableByteArray.setPosition(i + 8 + 4);
        parsableByteArray.skipBytes(1);
        parseExpandableClassSize(parsableByteArray);
        parsableByteArray.skipBytes(2);
        int readUnsignedByte = parsableByteArray.readUnsignedByte();
        if ((readUnsignedByte & 128) != 0) {
            parsableByteArray.skipBytes(2);
        }
        if ((readUnsignedByte & 64) != 0) {
            parsableByteArray.skipBytes(parsableByteArray.readUnsignedShort());
        }
        if ((readUnsignedByte & 32) != 0) {
            parsableByteArray.skipBytes(2);
        }
        parsableByteArray.skipBytes(1);
        parseExpandableClassSize(parsableByteArray);
        String mimeTypeFromMp4ObjectType = MimeTypes.getMimeTypeFromMp4ObjectType(parsableByteArray.readUnsignedByte());
        if (MimeTypes.AUDIO_MPEG.equals(mimeTypeFromMp4ObjectType) || MimeTypes.AUDIO_DTS.equals(mimeTypeFromMp4ObjectType) || MimeTypes.AUDIO_DTS_HD.equals(mimeTypeFromMp4ObjectType)) {
            return Pair.create(mimeTypeFromMp4ObjectType, null);
        }
        parsableByteArray.skipBytes(12);
        parsableByteArray.skipBytes(1);
        int parseExpandableClassSize = parseExpandableClassSize(parsableByteArray);
        byte[] bArr = new byte[parseExpandableClassSize];
        parsableByteArray.readBytes(bArr, 0, parseExpandableClassSize);
        return Pair.create(mimeTypeFromMp4ObjectType, bArr);
    }

    private static Pair<Integer, TrackEncryptionBox> parseSampleEntryEncryptionData(ParsableByteArray parsableByteArray, int i, int i2) {
        int position = parsableByteArray.getPosition();
        while (position - i < i2) {
            parsableByteArray.setPosition(position);
            int readInt = parsableByteArray.readInt();
            Assertions.checkArgument(readInt > 0, "childAtomSize should be positive");
            if (parsableByteArray.readInt() == Atom.TYPE_sinf) {
                Pair<Integer, TrackEncryptionBox> parseCommonEncryptionSinfFromParent = parseCommonEncryptionSinfFromParent(parsableByteArray, position, readInt);
                if (parseCommonEncryptionSinfFromParent != null) {
                    return parseCommonEncryptionSinfFromParent;
                }
            }
            position += readInt;
        }
        return null;
    }

    static Pair<Integer, TrackEncryptionBox> parseCommonEncryptionSinfFromParent(ParsableByteArray parsableByteArray, int i, int i2) {
        int i3 = i + 8;
        int i4 = -1;
        String str = null;
        Object obj = null;
        int i5 = 0;
        while (i3 - i < i2) {
            parsableByteArray.setPosition(i3);
            int readInt = parsableByteArray.readInt();
            int readInt2 = parsableByteArray.readInt();
            if (readInt2 == Atom.TYPE_frma) {
                obj = Integer.valueOf(parsableByteArray.readInt());
            } else if (readInt2 == Atom.TYPE_schm) {
                parsableByteArray.skipBytes(4);
                str = parsableByteArray.readString(4);
            } else if (readInt2 == Atom.TYPE_schi) {
                i4 = i3;
                i5 = readInt;
            }
            i3 += readInt;
        }
        if (!C2793C.CENC_TYPE_cenc.equals(str) && !C2793C.CENC_TYPE_cbc1.equals(str) && !C2793C.CENC_TYPE_cens.equals(str) && !C2793C.CENC_TYPE_cbcs.equals(str)) {
            return null;
        }
        boolean z = true;
        Assertions.checkArgument(obj != null, "frma atom is mandatory");
        Assertions.checkArgument(i4 != -1, "schi atom is mandatory");
        TrackEncryptionBox parseSchiFromParent = parseSchiFromParent(parsableByteArray, i4, i5, str);
        if (parseSchiFromParent == null) {
            z = false;
        }
        Assertions.checkArgument(z, "tenc atom is mandatory");
        return Pair.create(obj, parseSchiFromParent);
    }

    private static TrackEncryptionBox parseSchiFromParent(ParsableByteArray parsableByteArray, int i, int i2, String str) {
        int i3;
        int i4;
        int i5 = i + 8;
        while (true) {
            byte[] bArr = null;
            if (i5 - i >= i2) {
                return null;
            }
            parsableByteArray.setPosition(i5);
            int readInt = parsableByteArray.readInt();
            if (parsableByteArray.readInt() == Atom.TYPE_tenc) {
                int parseFullAtomVersion = Atom.parseFullAtomVersion(parsableByteArray.readInt());
                parsableByteArray.skipBytes(1);
                if (parseFullAtomVersion == 0) {
                    parsableByteArray.skipBytes(1);
                    i4 = 0;
                    i3 = 0;
                } else {
                    int readUnsignedByte = parsableByteArray.readUnsignedByte();
                    i3 = readUnsignedByte & 15;
                    i4 = (readUnsignedByte & PsExtractor.VIDEO_STREAM_MASK) >> 4;
                }
                boolean z = parsableByteArray.readUnsignedByte() == 1;
                int readUnsignedByte2 = parsableByteArray.readUnsignedByte();
                byte[] bArr2 = new byte[16];
                parsableByteArray.readBytes(bArr2, 0, bArr2.length);
                if (z && readUnsignedByte2 == 0) {
                    int readUnsignedByte3 = parsableByteArray.readUnsignedByte();
                    bArr = new byte[readUnsignedByte3];
                    parsableByteArray.readBytes(bArr, 0, readUnsignedByte3);
                }
                TrackEncryptionBox trackEncryptionBox = new TrackEncryptionBox(z, str, readUnsignedByte2, bArr2, i4, i3, bArr);
                return trackEncryptionBox;
            }
            i5 += readInt;
        }
    }

    private static byte[] parseProjFromParent(ParsableByteArray parsableByteArray, int i, int i2) {
        int i3 = i + 8;
        while (i3 - i < i2) {
            parsableByteArray.setPosition(i3);
            int readInt = parsableByteArray.readInt();
            if (parsableByteArray.readInt() == Atom.TYPE_proj) {
                return Arrays.copyOfRange(parsableByteArray.data, i3, readInt + i3);
            }
            i3 += readInt;
        }
        return null;
    }

    private static int parseExpandableClassSize(ParsableByteArray parsableByteArray) {
        int readUnsignedByte = parsableByteArray.readUnsignedByte();
        int i = readUnsignedByte & 127;
        while ((readUnsignedByte & 128) == 128) {
            readUnsignedByte = parsableByteArray.readUnsignedByte();
            i = (i << 7) | (readUnsignedByte & 127);
        }
        return i;
    }

    private static boolean canApplyEditWithGaplessInfo(long[] jArr, long j, long j2, long j3) {
        int length = jArr.length - 1;
        int constrainValue = Util.constrainValue(3, 0, length);
        int constrainValue2 = Util.constrainValue(jArr.length - 3, 0, length);
        if (jArr[0] > j2 || j2 >= jArr[constrainValue] || jArr[constrainValue2] >= j3 || j3 > j) {
            return false;
        }
        return true;
    }

    private AtomParsers() {
    }
}
