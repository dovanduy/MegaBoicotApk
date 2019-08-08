package com.google.android.exoplayer2.source.dash;

import com.google.android.exoplayer2.C2793C;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.FormatHolder;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.metadata.emsg.EventMessageEncoder;
import com.google.android.exoplayer2.source.SampleStream;
import com.google.android.exoplayer2.source.dash.manifest.EventStream;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;

final class EventSampleStream implements SampleStream {
    private int currentIndex;
    private final EventMessageEncoder eventMessageEncoder = new EventMessageEncoder();
    private EventStream eventStream;
    private boolean eventStreamAppendable;
    private long[] eventTimesUs;
    private boolean isFormatSentDownstream;
    private long pendingSeekPositionUs = C2793C.TIME_UNSET;
    private final Format upstreamFormat;

    public boolean isReady() {
        return true;
    }

    public void maybeThrowError() throws IOException {
    }

    public EventSampleStream(EventStream eventStream2, Format format, boolean z) {
        this.upstreamFormat = format;
        this.eventStream = eventStream2;
        this.eventTimesUs = eventStream2.presentationTimesUs;
        updateEventStream(eventStream2, z);
    }

    public String eventStreamId() {
        return this.eventStream.mo11222id();
    }

    public void updateEventStream(EventStream eventStream2, boolean z) {
        long j = this.currentIndex == 0 ? -9223372036854775807L : this.eventTimesUs[this.currentIndex - 1];
        this.eventStreamAppendable = z;
        this.eventStream = eventStream2;
        this.eventTimesUs = eventStream2.presentationTimesUs;
        if (this.pendingSeekPositionUs != C2793C.TIME_UNSET) {
            seekToUs(this.pendingSeekPositionUs);
        } else if (j != C2793C.TIME_UNSET) {
            this.currentIndex = Util.binarySearchCeil(this.eventTimesUs, j, false, false);
        }
    }

    public void seekToUs(long j) {
        boolean z = false;
        this.currentIndex = Util.binarySearchCeil(this.eventTimesUs, j, true, false);
        if (this.eventStreamAppendable && this.currentIndex == this.eventTimesUs.length) {
            z = true;
        }
        if (!z) {
            j = C2793C.TIME_UNSET;
        }
        this.pendingSeekPositionUs = j;
    }

    public int readData(FormatHolder formatHolder, DecoderInputBuffer decoderInputBuffer, boolean z) {
        if (z || !this.isFormatSentDownstream) {
            formatHolder.format = this.upstreamFormat;
            this.isFormatSentDownstream = true;
            return -5;
        } else if (this.currentIndex != this.eventTimesUs.length) {
            int i = this.currentIndex;
            this.currentIndex = i + 1;
            byte[] encode = this.eventMessageEncoder.encode(this.eventStream.events[i], this.eventStream.timescale);
            if (encode == null) {
                return -3;
            }
            decoderInputBuffer.ensureSpaceForWrite(encode.length);
            decoderInputBuffer.setFlags(1);
            decoderInputBuffer.data.put(encode);
            decoderInputBuffer.timeUs = this.eventTimesUs[i];
            return -4;
        } else if (this.eventStreamAppendable) {
            return -3;
        } else {
            decoderInputBuffer.setFlags(4);
            return -4;
        }
    }

    public int skipData(long j) {
        int max = Math.max(this.currentIndex, Util.binarySearchCeil(this.eventTimesUs, j, true, false));
        int i = max - this.currentIndex;
        this.currentIndex = max;
        return i;
    }
}
