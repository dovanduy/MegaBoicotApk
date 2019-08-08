package com.google.android.exoplayer2.source.hls;

import android.util.Pair;
import com.google.android.exoplayer2.C2793C;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.extractor.DefaultExtractorInput;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.Metadata.Entry;
import com.google.android.exoplayer2.metadata.id3.Id3Decoder;
import com.google.android.exoplayer2.metadata.id3.PrivFrame;
import com.google.android.exoplayer2.source.chunk.MediaChunk;
import com.google.android.exoplayer2.source.hls.playlist.HlsMasterPlaylist.HlsUrl;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.TimestampAdjuster;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

final class HlsMediaChunk extends MediaChunk {
    private static final String PRIV_TIMESTAMP_FRAME_OWNER = "com.apple.streaming.transportStreamTimestamp";
    private static final AtomicInteger uidSource = new AtomicInteger();
    private int bytesLoaded;
    public final int discontinuitySequenceNumber;
    private final Extractor extractor;
    private final boolean hasGapTag;
    public final HlsUrl hlsUrl;
    private final ParsableByteArray id3Data;
    private final Id3Decoder id3Decoder;
    private boolean id3TimestampPeeked;
    private final DataSource initDataSource;
    private final DataSpec initDataSpec;
    private boolean initLoadCompleted;
    private int initSegmentBytesLoaded;
    private final boolean isEncrypted = (this.dataSource instanceof Aes128DataSource);
    private final boolean isMasterTimestampSource;
    private final boolean isPackedAudioExtractor;
    private volatile boolean loadCanceled;
    private volatile boolean loadCompleted;
    private HlsSampleStreamWrapper output;
    private final boolean reusingExtractor;
    private final boolean shouldSpliceIn;
    private final TimestampAdjuster timestampAdjuster;
    public final int uid;

    public HlsMediaChunk(HlsExtractorFactory hlsExtractorFactory, DataSource dataSource, DataSpec dataSpec, DataSpec dataSpec2, HlsUrl hlsUrl2, List<Format> list, int i, Object obj, long j, long j2, long j3, int i2, boolean z, boolean z2, TimestampAdjuster timestampAdjuster2, HlsMediaChunk hlsMediaChunk, DrmInitData drmInitData, byte[] bArr, byte[] bArr2) {
        Extractor extractor2;
        DataSpec dataSpec3;
        DataSpec dataSpec4 = dataSpec2;
        HlsUrl hlsUrl3 = hlsUrl2;
        HlsMediaChunk hlsMediaChunk2 = hlsMediaChunk;
        int i3 = i2;
        super(buildDataSource(dataSource, bArr, bArr2), dataSpec, hlsUrl3.format, i, obj, j, j2, j3);
        this.discontinuitySequenceNumber = i3;
        this.initDataSpec = dataSpec4;
        this.hlsUrl = hlsUrl3;
        this.isMasterTimestampSource = z2;
        TimestampAdjuster timestampAdjuster3 = timestampAdjuster2;
        this.timestampAdjuster = timestampAdjuster3;
        this.hasGapTag = z;
        boolean z3 = true;
        HlsMediaChunk hlsMediaChunk3 = hlsMediaChunk;
        if (hlsMediaChunk3 != null) {
            this.shouldSpliceIn = hlsMediaChunk3.hlsUrl != hlsUrl3;
            extractor2 = (hlsMediaChunk3.discontinuitySequenceNumber != i3 || this.shouldSpliceIn) ? null : hlsMediaChunk3.extractor;
            dataSpec3 = dataSpec;
        } else {
            this.shouldSpliceIn = false;
            dataSpec3 = dataSpec;
            extractor2 = null;
        }
        Pair createExtractor = hlsExtractorFactory.createExtractor(extractor2, dataSpec3.uri, this.trackFormat, list, drmInitData, timestampAdjuster3);
        this.extractor = (Extractor) createExtractor.first;
        this.isPackedAudioExtractor = ((Boolean) createExtractor.second).booleanValue();
        this.reusingExtractor = this.extractor == extractor2;
        if (!this.reusingExtractor || dataSpec4 == null) {
            z3 = false;
        }
        this.initLoadCompleted = z3;
        if (!this.isPackedAudioExtractor) {
            this.id3Decoder = null;
            this.id3Data = null;
        } else if (hlsMediaChunk3 == null || hlsMediaChunk3.id3Data == null) {
            this.id3Decoder = new Id3Decoder();
            this.id3Data = new ParsableByteArray(10);
        } else {
            this.id3Decoder = hlsMediaChunk3.id3Decoder;
            this.id3Data = hlsMediaChunk3.id3Data;
        }
        this.initDataSource = dataSource;
        this.uid = uidSource.getAndIncrement();
    }

    public void init(HlsSampleStreamWrapper hlsSampleStreamWrapper) {
        this.output = hlsSampleStreamWrapper;
        hlsSampleStreamWrapper.init(this.uid, this.shouldSpliceIn, this.reusingExtractor);
        if (!this.reusingExtractor) {
            this.extractor.init(hlsSampleStreamWrapper);
        }
    }

    public boolean isLoadCompleted() {
        return this.loadCompleted;
    }

    public long bytesLoaded() {
        return (long) this.bytesLoaded;
    }

    public void cancelLoad() {
        this.loadCanceled = true;
    }

    public void load() throws IOException, InterruptedException {
        maybeLoadInitData();
        if (!this.loadCanceled) {
            if (!this.hasGapTag) {
                loadMedia();
            }
            this.loadCompleted = true;
        }
    }

    private void maybeLoadInitData() throws IOException, InterruptedException {
        DefaultExtractorInput defaultExtractorInput;
        if (!this.initLoadCompleted && this.initDataSpec != null) {
            DataSpec subrange = this.initDataSpec.subrange((long) this.initSegmentBytesLoaded);
            try {
                defaultExtractorInput = new DefaultExtractorInput(this.initDataSource, subrange.absoluteStreamPosition, this.initDataSource.open(subrange));
                int i = 0;
                while (i == 0) {
                    if (this.loadCanceled) {
                        break;
                    }
                    i = this.extractor.read(defaultExtractorInput, null);
                }
                this.initSegmentBytesLoaded = (int) (defaultExtractorInput.getPosition() - this.initDataSpec.absoluteStreamPosition);
                Util.closeQuietly(this.initDataSource);
                this.initLoadCompleted = true;
            } catch (Throwable th) {
                Util.closeQuietly(this.initDataSource);
                throw th;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0061 A[Catch:{ all -> 0x0082, all -> 0x00a4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0068 A[Catch:{ all -> 0x0082, all -> 0x00a4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x006f A[Catch:{ all -> 0x0082, all -> 0x00a4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0076 A[SYNTHETIC, Splitter:B:26:0x0076] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x001c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void loadMedia() throws java.io.IOException, java.lang.InterruptedException {
        /*
            r13 = this;
            boolean r0 = r13.isEncrypted
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x000e
            com.google.android.exoplayer2.upstream.DataSpec r0 = r13.dataSpec
            int r3 = r13.bytesLoaded
            if (r3 == 0) goto L_0x0017
            r3 = r1
            goto L_0x0018
        L_0x000e:
            com.google.android.exoplayer2.upstream.DataSpec r0 = r13.dataSpec
            int r3 = r13.bytesLoaded
            long r3 = (long) r3
            com.google.android.exoplayer2.upstream.DataSpec r0 = r0.subrange(r3)
        L_0x0017:
            r3 = r2
        L_0x0018:
            boolean r4 = r13.isMasterTimestampSource
            if (r4 != 0) goto L_0x0022
            com.google.android.exoplayer2.util.TimestampAdjuster r4 = r13.timestampAdjuster
            r4.waitUntilInitialized()
            goto L_0x0038
        L_0x0022:
            com.google.android.exoplayer2.util.TimestampAdjuster r4 = r13.timestampAdjuster
            long r4 = r4.getFirstSampleTimestampUs()
            r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 != 0) goto L_0x0038
            com.google.android.exoplayer2.util.TimestampAdjuster r4 = r13.timestampAdjuster
            long r5 = r13.startTimeUs
            r4.setFirstSampleTimestampUs(r5)
        L_0x0038:
            com.google.android.exoplayer2.extractor.DefaultExtractorInput r4 = new com.google.android.exoplayer2.extractor.DefaultExtractorInput     // Catch:{ all -> 0x00a4 }
            com.google.android.exoplayer2.upstream.DataSource r8 = r13.dataSource     // Catch:{ all -> 0x00a4 }
            long r9 = r0.absoluteStreamPosition     // Catch:{ all -> 0x00a4 }
            com.google.android.exoplayer2.upstream.DataSource r5 = r13.dataSource     // Catch:{ all -> 0x00a4 }
            long r11 = r5.open(r0)     // Catch:{ all -> 0x00a4 }
            r7 = r4
            r7.<init>(r8, r9, r11)     // Catch:{ all -> 0x00a4 }
            boolean r0 = r13.isPackedAudioExtractor     // Catch:{ all -> 0x00a4 }
            if (r0 == 0) goto L_0x006d
            boolean r0 = r13.id3TimestampPeeked     // Catch:{ all -> 0x00a4 }
            if (r0 != 0) goto L_0x006d
            long r5 = r13.peekId3PrivTimestamp(r4)     // Catch:{ all -> 0x00a4 }
            r13.id3TimestampPeeked = r1     // Catch:{ all -> 0x00a4 }
            com.google.android.exoplayer2.source.hls.HlsSampleStreamWrapper r0 = r13.output     // Catch:{ all -> 0x00a4 }
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r1 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r1 == 0) goto L_0x0068
            com.google.android.exoplayer2.util.TimestampAdjuster r1 = r13.timestampAdjuster     // Catch:{ all -> 0x00a4 }
            long r5 = r1.adjustTsTimestamp(r5)     // Catch:{ all -> 0x00a4 }
            goto L_0x006a
        L_0x0068:
            long r5 = r13.startTimeUs     // Catch:{ all -> 0x00a4 }
        L_0x006a:
            r0.setSampleOffsetUs(r5)     // Catch:{ all -> 0x00a4 }
        L_0x006d:
            if (r3 == 0) goto L_0x0074
            int r0 = r13.bytesLoaded     // Catch:{ all -> 0x00a4 }
            r4.skipFully(r0)     // Catch:{ all -> 0x00a4 }
        L_0x0074:
            if (r2 != 0) goto L_0x0091
            boolean r0 = r13.loadCanceled     // Catch:{ all -> 0x0082 }
            if (r0 != 0) goto L_0x0091
            com.google.android.exoplayer2.extractor.Extractor r0 = r13.extractor     // Catch:{ all -> 0x0082 }
            r1 = 0
            int r2 = r0.read(r4, r1)     // Catch:{ all -> 0x0082 }
            goto L_0x0074
        L_0x0082:
            r0 = move-exception
            long r1 = r4.getPosition()     // Catch:{ all -> 0x00a4 }
            com.google.android.exoplayer2.upstream.DataSpec r3 = r13.dataSpec     // Catch:{ all -> 0x00a4 }
            long r3 = r3.absoluteStreamPosition     // Catch:{ all -> 0x00a4 }
            long r5 = r1 - r3
            int r1 = (int) r5     // Catch:{ all -> 0x00a4 }
            r13.bytesLoaded = r1     // Catch:{ all -> 0x00a4 }
            throw r0     // Catch:{ all -> 0x00a4 }
        L_0x0091:
            long r0 = r4.getPosition()     // Catch:{ all -> 0x00a4 }
            com.google.android.exoplayer2.upstream.DataSpec r2 = r13.dataSpec     // Catch:{ all -> 0x00a4 }
            long r2 = r2.absoluteStreamPosition     // Catch:{ all -> 0x00a4 }
            long r4 = r0 - r2
            int r0 = (int) r4     // Catch:{ all -> 0x00a4 }
            r13.bytesLoaded = r0     // Catch:{ all -> 0x00a4 }
            com.google.android.exoplayer2.upstream.DataSource r0 = r13.dataSource
            com.google.android.exoplayer2.util.Util.closeQuietly(r0)
            return
        L_0x00a4:
            r0 = move-exception
            com.google.android.exoplayer2.upstream.DataSource r1 = r13.dataSource
            com.google.android.exoplayer2.util.Util.closeQuietly(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.hls.HlsMediaChunk.loadMedia():void");
    }

    private long peekId3PrivTimestamp(ExtractorInput extractorInput) throws IOException, InterruptedException {
        extractorInput.resetPeekPosition();
        if (!extractorInput.peekFully(this.id3Data.data, 0, 10, true)) {
            return C2793C.TIME_UNSET;
        }
        this.id3Data.reset(10);
        if (this.id3Data.readUnsignedInt24() != Id3Decoder.ID3_TAG) {
            return C2793C.TIME_UNSET;
        }
        this.id3Data.skipBytes(3);
        int readSynchSafeInt = this.id3Data.readSynchSafeInt();
        int i = readSynchSafeInt + 10;
        if (i > this.id3Data.capacity()) {
            byte[] bArr = this.id3Data.data;
            this.id3Data.reset(i);
            System.arraycopy(bArr, 0, this.id3Data.data, 0, 10);
        }
        if (!extractorInput.peekFully(this.id3Data.data, 10, readSynchSafeInt, true)) {
            return C2793C.TIME_UNSET;
        }
        Metadata decode = this.id3Decoder.decode(this.id3Data.data, readSynchSafeInt);
        if (decode == null) {
            return C2793C.TIME_UNSET;
        }
        int length = decode.length();
        for (int i2 = 0; i2 < length; i2++) {
            Entry entry = decode.get(i2);
            if (entry instanceof PrivFrame) {
                PrivFrame privFrame = (PrivFrame) entry;
                if (PRIV_TIMESTAMP_FRAME_OWNER.equals(privFrame.owner)) {
                    System.arraycopy(privFrame.privateData, 0, this.id3Data.data, 0, 8);
                    this.id3Data.reset(8);
                    return this.id3Data.readLong() & 8589934591L;
                }
            }
        }
        return C2793C.TIME_UNSET;
    }

    private static DataSource buildDataSource(DataSource dataSource, byte[] bArr, byte[] bArr2) {
        return bArr != null ? new Aes128DataSource(dataSource, bArr, bArr2) : dataSource;
    }
}
