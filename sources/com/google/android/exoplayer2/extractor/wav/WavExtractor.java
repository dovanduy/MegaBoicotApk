package com.google.android.exoplayer2.extractor.wav;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.ExtractorsFactory;
import com.google.android.exoplayer2.extractor.PositionHolder;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.util.MimeTypes;
import java.io.IOException;

public final class WavExtractor implements Extractor {
    public static final ExtractorsFactory FACTORY = new ExtractorsFactory() {
        public Extractor[] createExtractors() {
            return new Extractor[]{new WavExtractor()};
        }
    };
    private static final int MAX_INPUT_SIZE = 32768;
    private int bytesPerFrame;
    private ExtractorOutput extractorOutput;
    private int pendingBytes;
    private TrackOutput trackOutput;
    private WavHeader wavHeader;

    public void release() {
    }

    public boolean sniff(ExtractorInput extractorInput) throws IOException, InterruptedException {
        return WavHeaderReader.peek(extractorInput) != null;
    }

    public void init(ExtractorOutput extractorOutput2) {
        this.extractorOutput = extractorOutput2;
        this.trackOutput = extractorOutput2.track(0, 1);
        this.wavHeader = null;
        extractorOutput2.endTracks();
    }

    public void seek(long j, long j2) {
        this.pendingBytes = 0;
    }

    public int read(ExtractorInput extractorInput, PositionHolder positionHolder) throws IOException, InterruptedException {
        ExtractorInput extractorInput2 = extractorInput;
        if (this.wavHeader == null) {
            this.wavHeader = WavHeaderReader.peek(extractorInput);
            if (this.wavHeader == null) {
                throw new ParserException("Unsupported or unrecognized wav header.");
            }
            this.trackOutput.format(Format.createAudioSampleFormat(null, MimeTypes.AUDIO_RAW, null, this.wavHeader.getBitrate(), MAX_INPUT_SIZE, this.wavHeader.getNumChannels(), this.wavHeader.getSampleRateHz(), this.wavHeader.getEncoding(), null, null, 0, null));
            this.bytesPerFrame = this.wavHeader.getBytesPerFrame();
        }
        if (!this.wavHeader.hasDataBounds()) {
            WavHeaderReader.skipToData(extractorInput2, this.wavHeader);
            this.extractorOutput.seekMap(this.wavHeader);
        }
        int sampleData = this.trackOutput.sampleData(extractorInput2, MAX_INPUT_SIZE - this.pendingBytes, true);
        if (sampleData != -1) {
            this.pendingBytes += sampleData;
        }
        int i = this.pendingBytes / this.bytesPerFrame;
        if (i > 0) {
            long timeUs = this.wavHeader.getTimeUs(extractorInput.getPosition() - ((long) this.pendingBytes));
            int i2 = i * this.bytesPerFrame;
            this.pendingBytes -= i2;
            this.trackOutput.sampleMetadata(timeUs, 1, i2, this.pendingBytes, null);
        }
        if (sampleData == -1) {
            return -1;
        }
        return 0;
    }
}
