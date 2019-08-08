package com.google.android.exoplayer2.extractor;

import com.facebook.ads.AdError;
import com.google.android.exoplayer2.extractor.p132ts.PsExtractor;
import com.google.android.exoplayer2.util.MimeTypes;

public final class MpegAudioHeader {
    private static final int[] BITRATE_V1_L1 = {32, 64, 96, 128, 160, PsExtractor.AUDIO_STREAM, 224, 256, 288, 320, 352, 384, 416, 448};
    private static final int[] BITRATE_V1_L2 = {32, 48, 56, 64, 80, 96, 112, 128, 160, PsExtractor.AUDIO_STREAM, 224, 256, 320, 384};
    private static final int[] BITRATE_V1_L3 = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, PsExtractor.AUDIO_STREAM, 224, 256, 320};
    private static final int[] BITRATE_V2 = {8, 16, 24, 32, 40, 48, 56, 64, 80, 96, 112, 128, 144, 160};
    private static final int[] BITRATE_V2_L1 = {32, 48, 56, 64, 80, 96, 112, 128, 144, 160, 176, PsExtractor.AUDIO_STREAM, 224, 256};
    public static final int MAX_FRAME_SIZE_BYTES = 4096;
    private static final String[] MIME_TYPE_BY_LAYER = {MimeTypes.AUDIO_MPEG_L1, MimeTypes.AUDIO_MPEG_L2, MimeTypes.AUDIO_MPEG};
    private static final int[] SAMPLING_RATE_V1 = {44100, 48000, 32000};
    public int bitrate;
    public int channels;
    public int frameSize;
    public String mimeType;
    public int sampleRate;
    public int samplesPerFrame;
    public int version;

    public static int getFrameSize(int i) {
        if ((i & -2097152) != -2097152) {
            return -1;
        }
        int i2 = (i >>> 19) & 3;
        if (i2 == 1) {
            return -1;
        }
        int i3 = (i >>> 17) & 3;
        if (i3 == 0) {
            return -1;
        }
        int i4 = (i >>> 12) & 15;
        if (i4 == 0 || i4 == 15) {
            return -1;
        }
        int i5 = (i >>> 10) & 3;
        if (i5 == 3) {
            return -1;
        }
        int i6 = SAMPLING_RATE_V1[i5];
        if (i2 == 2) {
            i6 /= 2;
        } else if (i2 == 0) {
            i6 /= 4;
        }
        int i7 = (i >>> 9) & 1;
        if (i3 == 3) {
            return (((12000 * (i2 == 3 ? BITRATE_V1_L1[i4 - 1] : BITRATE_V2_L1[i4 - 1])) / i6) + i7) * 4;
        }
        int i8 = i2 == 3 ? i3 == 2 ? BITRATE_V1_L2[i4 - 1] : BITRATE_V1_L3[i4 - 1] : BITRATE_V2[i4 - 1];
        int i9 = 144000;
        if (i2 == 3) {
            return ((144000 * i8) / i6) + i7;
        }
        if (i3 == 1) {
            i9 = DefaultOggSeeker.MATCH_RANGE;
        }
        return ((i9 * i8) / i6) + i7;
    }

    public static boolean populateHeader(int i, MpegAudioHeader mpegAudioHeader) {
        int i2;
        int i3;
        int i4;
        int i5;
        if ((i & -2097152) != -2097152) {
            return false;
        }
        int i6 = (i >>> 19) & 3;
        if (i6 == 1) {
            return false;
        }
        int i7 = (i >>> 17) & 3;
        if (i7 == 0) {
            return false;
        }
        int i8 = (i >>> 12) & 15;
        if (i8 == 0 || i8 == 15) {
            return false;
        }
        int i9 = (i >>> 10) & 3;
        if (i9 == 3) {
            return false;
        }
        int i10 = SAMPLING_RATE_V1[i9];
        if (i6 == 2) {
            i10 /= 2;
        } else if (i6 == 0) {
            i10 /= 4;
        }
        int i11 = i10;
        int i12 = (i >>> 9) & 1;
        int i13 = 1152;
        if (i7 == 3) {
            i4 = i6 == 3 ? BITRATE_V1_L1[i8 - 1] : BITRATE_V2_L1[i8 - 1];
            i2 = 384;
            i3 = (((12000 * i4) / i11) + i12) * 4;
        } else {
            int i14 = 144000;
            if (i6 == 3) {
                i5 = i7 == 2 ? BITRATE_V1_L2[i8 - 1] : BITRATE_V1_L3[i8 - 1];
                i3 = ((144000 * i5) / i11) + i12;
            } else {
                i5 = BITRATE_V2[i8 - 1];
                if (i7 == 1) {
                    i13 = 576;
                }
                if (i7 == 1) {
                    i14 = DefaultOggSeeker.MATCH_RANGE;
                }
                i3 = ((i14 * i5) / i11) + i12;
            }
            i2 = i13;
        }
        mpegAudioHeader.setValues(i6, MIME_TYPE_BY_LAYER[3 - i7], i3, i11, ((i >> 6) & 3) == 3 ? 1 : 2, i4 * AdError.NETWORK_ERROR_CODE, i2);
        return true;
    }

    private void setValues(int i, String str, int i2, int i3, int i4, int i5, int i6) {
        this.version = i;
        this.mimeType = str;
        this.frameSize = i2;
        this.sampleRate = i3;
        this.channels = i4;
        this.bitrate = i5;
        this.samplesPerFrame = i6;
    }
}
