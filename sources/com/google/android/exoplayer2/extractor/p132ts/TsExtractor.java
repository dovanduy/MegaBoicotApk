package com.google.android.exoplayer2.extractor.p132ts;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import com.google.android.exoplayer2.C2793C;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.ExtractorsFactory;
import com.google.android.exoplayer2.extractor.PositionHolder;
import com.google.android.exoplayer2.extractor.SeekMap.Unseekable;
import com.google.android.exoplayer2.extractor.p132ts.TsPayloadReader.DvbSubtitleInfo;
import com.google.android.exoplayer2.extractor.p132ts.TsPayloadReader.EsInfo;
import com.google.android.exoplayer2.extractor.p132ts.TsPayloadReader.Factory;
import com.google.android.exoplayer2.extractor.p132ts.TsPayloadReader.TrackIdGenerator;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.ParsableBitArray;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.TimestampAdjuster;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.exoplayer2.extractor.ts.TsExtractor */
public final class TsExtractor implements Extractor {
    /* access modifiers changed from: private */
    public static final long AC3_FORMAT_IDENTIFIER = ((long) Util.getIntegerCodeForString("AC-3"));
    private static final int BUFFER_SIZE = 9400;
    /* access modifiers changed from: private */
    public static final long E_AC3_FORMAT_IDENTIFIER = ((long) Util.getIntegerCodeForString("EAC3"));
    public static final ExtractorsFactory FACTORY = new ExtractorsFactory() {
        public Extractor[] createExtractors() {
            return new Extractor[]{new TsExtractor()};
        }
    };
    /* access modifiers changed from: private */
    public static final long HEVC_FORMAT_IDENTIFIER = ((long) Util.getIntegerCodeForString("HEVC"));
    private static final int MAX_PID_PLUS_ONE = 8192;
    public static final int MODE_HLS = 2;
    public static final int MODE_MULTI_PMT = 0;
    public static final int MODE_SINGLE_PMT = 1;
    private static final int SNIFF_TS_PACKET_COUNT = 5;
    private static final int TS_PACKET_SIZE = 188;
    private static final int TS_PAT_PID = 0;
    public static final int TS_STREAM_TYPE_AAC_ADTS = 15;
    public static final int TS_STREAM_TYPE_AAC_LATM = 17;
    public static final int TS_STREAM_TYPE_AC3 = 129;
    public static final int TS_STREAM_TYPE_DTS = 138;
    public static final int TS_STREAM_TYPE_DVBSUBS = 89;
    public static final int TS_STREAM_TYPE_E_AC3 = 135;
    public static final int TS_STREAM_TYPE_H262 = 2;
    public static final int TS_STREAM_TYPE_H264 = 27;
    public static final int TS_STREAM_TYPE_H265 = 36;
    public static final int TS_STREAM_TYPE_HDMV_DTS = 130;
    public static final int TS_STREAM_TYPE_ID3 = 21;
    public static final int TS_STREAM_TYPE_MPA = 3;
    public static final int TS_STREAM_TYPE_MPA_LSF = 4;
    public static final int TS_STREAM_TYPE_SPLICE_INFO = 134;
    private static final int TS_SYNC_BYTE = 71;
    private int bytesSinceLastSync;
    private final SparseIntArray continuityCounters;
    /* access modifiers changed from: private */
    public TsPayloadReader id3Reader;
    /* access modifiers changed from: private */
    public final int mode;
    /* access modifiers changed from: private */
    public ExtractorOutput output;
    /* access modifiers changed from: private */
    public final Factory payloadReaderFactory;
    /* access modifiers changed from: private */
    public int remainingPmts;
    /* access modifiers changed from: private */
    public final List<TimestampAdjuster> timestampAdjusters;
    /* access modifiers changed from: private */
    public final SparseBooleanArray trackIds;
    /* access modifiers changed from: private */
    public boolean tracksEnded;
    private final ParsableByteArray tsPacketBuffer;
    /* access modifiers changed from: private */
    public final SparseArray<TsPayloadReader> tsPayloadReaders;

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.google.android.exoplayer2.extractor.ts.TsExtractor$Mode */
    public @interface Mode {
    }

    /* renamed from: com.google.android.exoplayer2.extractor.ts.TsExtractor$PatReader */
    private class PatReader implements SectionPayloadReader {
        private final ParsableBitArray patScratch = new ParsableBitArray(new byte[4]);

        public void init(TimestampAdjuster timestampAdjuster, ExtractorOutput extractorOutput, TrackIdGenerator trackIdGenerator) {
        }

        public PatReader() {
        }

        public void consume(ParsableByteArray parsableByteArray) {
            if (parsableByteArray.readUnsignedByte() == 0) {
                parsableByteArray.skipBytes(7);
                int bytesLeft = parsableByteArray.bytesLeft() / 4;
                for (int i = 0; i < bytesLeft; i++) {
                    parsableByteArray.readBytes(this.patScratch, 4);
                    int readBits = this.patScratch.readBits(16);
                    this.patScratch.skipBits(3);
                    if (readBits == 0) {
                        this.patScratch.skipBits(13);
                    } else {
                        int readBits2 = this.patScratch.readBits(13);
                        TsExtractor.this.tsPayloadReaders.put(readBits2, new SectionReader(new PmtReader(readBits2)));
                        TsExtractor.this.remainingPmts = TsExtractor.this.remainingPmts + 1;
                    }
                }
                if (TsExtractor.this.mode != 2) {
                    TsExtractor.this.tsPayloadReaders.remove(0);
                }
            }
        }
    }

    /* renamed from: com.google.android.exoplayer2.extractor.ts.TsExtractor$PmtReader */
    private class PmtReader implements SectionPayloadReader {
        private static final int TS_PMT_DESC_AC3 = 106;
        private static final int TS_PMT_DESC_DTS = 123;
        private static final int TS_PMT_DESC_DVBSUBS = 89;
        private static final int TS_PMT_DESC_EAC3 = 122;
        private static final int TS_PMT_DESC_ISO639_LANG = 10;
        private static final int TS_PMT_DESC_REGISTRATION = 5;
        private final int pid;
        private final ParsableBitArray pmtScratch = new ParsableBitArray(new byte[5]);
        private final SparseIntArray trackIdToPidScratch = new SparseIntArray();
        private final SparseArray<TsPayloadReader> trackIdToReaderScratch = new SparseArray<>();

        public void init(TimestampAdjuster timestampAdjuster, ExtractorOutput extractorOutput, TrackIdGenerator trackIdGenerator) {
        }

        public PmtReader(int i) {
            this.pid = i;
        }

        public void consume(ParsableByteArray parsableByteArray) {
            TimestampAdjuster timestampAdjuster;
            TsPayloadReader tsPayloadReader;
            ParsableByteArray parsableByteArray2 = parsableByteArray;
            if (parsableByteArray.readUnsignedByte() == 2) {
                int i = 0;
                if (TsExtractor.this.mode == 1 || TsExtractor.this.mode == 2 || TsExtractor.this.remainingPmts == 1) {
                    timestampAdjuster = (TimestampAdjuster) TsExtractor.this.timestampAdjusters.get(0);
                } else {
                    timestampAdjuster = new TimestampAdjuster(((TimestampAdjuster) TsExtractor.this.timestampAdjusters.get(0)).getFirstSampleTimestampUs());
                    TsExtractor.this.timestampAdjusters.add(timestampAdjuster);
                }
                parsableByteArray2.skipBytes(2);
                int readUnsignedShort = parsableByteArray.readUnsignedShort();
                int i2 = 5;
                parsableByteArray2.skipBytes(5);
                parsableByteArray2.readBytes(this.pmtScratch, 2);
                int i3 = 4;
                this.pmtScratch.skipBits(4);
                parsableByteArray2.skipBytes(this.pmtScratch.readBits(12));
                if (TsExtractor.this.mode == 2 && TsExtractor.this.id3Reader == null) {
                    TsExtractor.this.id3Reader = TsExtractor.this.payloadReaderFactory.createPayloadReader(21, new EsInfo(21, null, null, new byte[0]));
                    TsExtractor.this.id3Reader.init(timestampAdjuster, TsExtractor.this.output, new TrackIdGenerator(readUnsignedShort, 21, TsExtractor.MAX_PID_PLUS_ONE));
                }
                this.trackIdToReaderScratch.clear();
                this.trackIdToPidScratch.clear();
                int bytesLeft = parsableByteArray.bytesLeft();
                while (bytesLeft > 0) {
                    parsableByteArray2.readBytes(this.pmtScratch, i2);
                    int readBits = this.pmtScratch.readBits(8);
                    this.pmtScratch.skipBits(3);
                    int readBits2 = this.pmtScratch.readBits(13);
                    this.pmtScratch.skipBits(i3);
                    int readBits3 = this.pmtScratch.readBits(12);
                    EsInfo readEsInfo = readEsInfo(parsableByteArray2, readBits3);
                    if (readBits == 6) {
                        readBits = readEsInfo.streamType;
                    }
                    bytesLeft -= readBits3 + 5;
                    int i4 = TsExtractor.this.mode == 2 ? readBits : readBits2;
                    if (!TsExtractor.this.trackIds.get(i4)) {
                        if (TsExtractor.this.mode == 2 && readBits == 21) {
                            tsPayloadReader = TsExtractor.this.id3Reader;
                        } else {
                            tsPayloadReader = TsExtractor.this.payloadReaderFactory.createPayloadReader(readBits, readEsInfo);
                        }
                        if (TsExtractor.this.mode != 2 || readBits2 < this.trackIdToPidScratch.get(i4, TsExtractor.MAX_PID_PLUS_ONE)) {
                            this.trackIdToPidScratch.put(i4, readBits2);
                            this.trackIdToReaderScratch.put(i4, tsPayloadReader);
                        }
                    }
                    i2 = 5;
                    i3 = 4;
                }
                int size = this.trackIdToPidScratch.size();
                for (int i5 = 0; i5 < size; i5++) {
                    int keyAt = this.trackIdToPidScratch.keyAt(i5);
                    TsExtractor.this.trackIds.put(keyAt, true);
                    TsPayloadReader tsPayloadReader2 = (TsPayloadReader) this.trackIdToReaderScratch.valueAt(i5);
                    if (tsPayloadReader2 != null) {
                        if (tsPayloadReader2 != TsExtractor.this.id3Reader) {
                            tsPayloadReader2.init(timestampAdjuster, TsExtractor.this.output, new TrackIdGenerator(readUnsignedShort, keyAt, TsExtractor.MAX_PID_PLUS_ONE));
                        }
                        TsExtractor.this.tsPayloadReaders.put(this.trackIdToPidScratch.valueAt(i5), tsPayloadReader2);
                    }
                }
                if (TsExtractor.this.mode != 2) {
                    TsExtractor.this.tsPayloadReaders.remove(this.pid);
                    TsExtractor tsExtractor = TsExtractor.this;
                    if (TsExtractor.this.mode != 1) {
                        i = TsExtractor.this.remainingPmts - 1;
                    }
                    tsExtractor.remainingPmts = i;
                    if (TsExtractor.this.remainingPmts == 0) {
                        TsExtractor.this.output.endTracks();
                        TsExtractor.this.tracksEnded = true;
                    }
                } else if (!TsExtractor.this.tracksEnded) {
                    TsExtractor.this.output.endTracks();
                    TsExtractor.this.remainingPmts = 0;
                    TsExtractor.this.tracksEnded = true;
                }
            }
        }

        private EsInfo readEsInfo(ParsableByteArray parsableByteArray, int i) {
            int position = parsableByteArray.getPosition();
            int i2 = i + position;
            String str = null;
            int i3 = -1;
            List list = null;
            while (parsableByteArray.getPosition() < i2) {
                int readUnsignedByte = parsableByteArray.readUnsignedByte();
                int position2 = parsableByteArray.getPosition() + parsableByteArray.readUnsignedByte();
                if (readUnsignedByte == 5) {
                    long readUnsignedInt = parsableByteArray.readUnsignedInt();
                    if (readUnsignedInt != TsExtractor.AC3_FORMAT_IDENTIFIER) {
                        if (readUnsignedInt != TsExtractor.E_AC3_FORMAT_IDENTIFIER) {
                            if (readUnsignedInt == TsExtractor.HEVC_FORMAT_IDENTIFIER) {
                                i3 = 36;
                            }
                            parsableByteArray.skipBytes(position2 - parsableByteArray.getPosition());
                        }
                        i3 = 135;
                        parsableByteArray.skipBytes(position2 - parsableByteArray.getPosition());
                    }
                } else if (readUnsignedByte != 106) {
                    if (readUnsignedByte != TS_PMT_DESC_EAC3) {
                        if (readUnsignedByte == TS_PMT_DESC_DTS) {
                            i3 = TsExtractor.TS_STREAM_TYPE_DTS;
                        } else if (readUnsignedByte == 10) {
                            str = parsableByteArray.readString(3).trim();
                        } else if (readUnsignedByte == 89) {
                            ArrayList arrayList = new ArrayList();
                            while (parsableByteArray.getPosition() < position2) {
                                String trim = parsableByteArray.readString(3).trim();
                                int readUnsignedByte2 = parsableByteArray.readUnsignedByte();
                                byte[] bArr = new byte[4];
                                parsableByteArray.readBytes(bArr, 0, 4);
                                arrayList.add(new DvbSubtitleInfo(trim, readUnsignedByte2, bArr));
                            }
                            list = arrayList;
                            i3 = 89;
                        }
                        parsableByteArray.skipBytes(position2 - parsableByteArray.getPosition());
                    }
                    i3 = 135;
                    parsableByteArray.skipBytes(position2 - parsableByteArray.getPosition());
                }
                i3 = 129;
                parsableByteArray.skipBytes(position2 - parsableByteArray.getPosition());
            }
            parsableByteArray.setPosition(i2);
            return new EsInfo(i3, str, list, Arrays.copyOfRange(parsableByteArray.data, position, i2));
        }
    }

    public void release() {
    }

    public TsExtractor() {
        this(0);
    }

    public TsExtractor(int i) {
        this(1, i);
    }

    public TsExtractor(int i, int i2) {
        this(i, new TimestampAdjuster(0), new DefaultTsPayloadReaderFactory(i2));
    }

    public TsExtractor(int i, TimestampAdjuster timestampAdjuster, Factory factory) {
        this.payloadReaderFactory = (Factory) Assertions.checkNotNull(factory);
        this.mode = i;
        if (i == 1 || i == 2) {
            this.timestampAdjusters = Collections.singletonList(timestampAdjuster);
        } else {
            this.timestampAdjusters = new ArrayList();
            this.timestampAdjusters.add(timestampAdjuster);
        }
        this.tsPacketBuffer = new ParsableByteArray(new byte[BUFFER_SIZE], 0);
        this.trackIds = new SparseBooleanArray();
        this.tsPayloadReaders = new SparseArray<>();
        this.continuityCounters = new SparseIntArray();
        resetPayloadReaders();
    }

    public boolean sniff(ExtractorInput extractorInput) throws IOException, InterruptedException {
        byte[] bArr = this.tsPacketBuffer.data;
        extractorInput.peekFully(bArr, 0, 940);
        int i = 0;
        while (i < TS_PACKET_SIZE) {
            int i2 = 0;
            while (i2 != 5) {
                if (bArr[(i2 * TS_PACKET_SIZE) + i] != 71) {
                    i++;
                } else {
                    i2++;
                }
            }
            extractorInput.skipFully(i);
            return true;
        }
        return false;
    }

    public void init(ExtractorOutput extractorOutput) {
        this.output = extractorOutput;
        extractorOutput.seekMap(new Unseekable(C2793C.TIME_UNSET));
    }

    public void seek(long j, long j2) {
        int size = this.timestampAdjusters.size();
        for (int i = 0; i < size; i++) {
            ((TimestampAdjuster) this.timestampAdjusters.get(i)).reset();
        }
        this.tsPacketBuffer.reset();
        this.continuityCounters.clear();
        resetPayloadReaders();
        this.bytesSinceLastSync = 0;
    }

    public int read(ExtractorInput extractorInput, PositionHolder positionHolder) throws IOException, InterruptedException {
        byte[] bArr = this.tsPacketBuffer.data;
        if (9400 - this.tsPacketBuffer.getPosition() < TS_PACKET_SIZE) {
            int bytesLeft = this.tsPacketBuffer.bytesLeft();
            if (bytesLeft > 0) {
                System.arraycopy(bArr, this.tsPacketBuffer.getPosition(), bArr, 0, bytesLeft);
            }
            this.tsPacketBuffer.reset(bArr, bytesLeft);
        }
        while (this.tsPacketBuffer.bytesLeft() < TS_PACKET_SIZE) {
            int limit = this.tsPacketBuffer.limit();
            int read = extractorInput.read(bArr, limit, 9400 - limit);
            if (read == -1) {
                return -1;
            }
            this.tsPacketBuffer.setLimit(limit + read);
        }
        int limit2 = this.tsPacketBuffer.limit();
        int position = this.tsPacketBuffer.getPosition();
        int i = position;
        while (i < limit2 && bArr[i] != 71) {
            i++;
        }
        this.tsPacketBuffer.setPosition(i);
        int i2 = i + TS_PACKET_SIZE;
        if (i2 > limit2) {
            this.bytesSinceLastSync += i - position;
            if (this.mode != 2 || this.bytesSinceLastSync <= 376) {
                return 0;
            }
            throw new ParserException("Cannot find sync byte. Most likely not a Transport Stream.");
        }
        this.bytesSinceLastSync = 0;
        int readInt = this.tsPacketBuffer.readInt();
        if ((8388608 & readInt) != 0) {
            this.tsPacketBuffer.setPosition(i2);
            return 0;
        }
        boolean z = (4194304 & readInt) != 0;
        int i3 = (2096896 & readInt) >> 8;
        boolean z2 = (readInt & 32) != 0;
        TsPayloadReader tsPayloadReader = (readInt & 16) != 0 ? (TsPayloadReader) this.tsPayloadReaders.get(i3) : null;
        if (tsPayloadReader == null) {
            this.tsPacketBuffer.setPosition(i2);
            return 0;
        }
        if (this.mode != 2) {
            int i4 = readInt & 15;
            int i5 = this.continuityCounters.get(i3, i4 - 1);
            this.continuityCounters.put(i3, i4);
            if (i5 == i4) {
                this.tsPacketBuffer.setPosition(i2);
                return 0;
            } else if (i4 != ((i5 + 1) & 15)) {
                tsPayloadReader.seek();
            }
        }
        if (z2) {
            this.tsPacketBuffer.skipBytes(this.tsPacketBuffer.readUnsignedByte());
        }
        this.tsPacketBuffer.setLimit(i2);
        tsPayloadReader.consume(this.tsPacketBuffer, z);
        this.tsPacketBuffer.setLimit(limit2);
        this.tsPacketBuffer.setPosition(i2);
        return 0;
    }

    private void resetPayloadReaders() {
        this.trackIds.clear();
        this.tsPayloadReaders.clear();
        SparseArray createInitialPayloadReaders = this.payloadReaderFactory.createInitialPayloadReaders();
        int size = createInitialPayloadReaders.size();
        for (int i = 0; i < size; i++) {
            this.tsPayloadReaders.put(createInitialPayloadReaders.keyAt(i), createInitialPayloadReaders.valueAt(i));
        }
        this.tsPayloadReaders.put(0, new SectionReader(new PatReader()));
        this.id3Reader = null;
    }
}
