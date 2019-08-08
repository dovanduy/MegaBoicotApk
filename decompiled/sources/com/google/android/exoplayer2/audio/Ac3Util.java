package com.google.android.exoplayer2.audio;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.extractor.p132ts.PsExtractor;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.ParsableBitArray;
import com.google.android.exoplayer2.util.ParsableByteArray;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.ByteBuffer;

public final class Ac3Util {
    private static final int AC3_SYNCFRAME_AUDIO_SAMPLE_COUNT = 1536;
    private static final int AUDIO_SAMPLES_PER_AUDIO_BLOCK = 256;
    private static final int[] BITRATE_BY_HALF_FRMSIZECOD = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, PsExtractor.AUDIO_STREAM, 224, AUDIO_SAMPLES_PER_AUDIO_BLOCK, 320, 384, 448, 512, 576, 640};
    private static final int[] BLOCKS_PER_SYNCFRAME_BY_NUMBLKSCOD = {1, 2, 3, 6};
    private static final int[] CHANNEL_COUNT_BY_ACMOD = {2, 1, 2, 3, 3, 4, 4, 5};
    private static final int[] SAMPLE_RATE_BY_FSCOD = {48000, 44100, 32000};
    private static final int[] SAMPLE_RATE_BY_FSCOD2 = {24000, 22050, 16000};
    private static final int[] SYNCFRAME_SIZE_WORDS_BY_HALF_FRMSIZECOD_44_1 = {69, 87, 104, 121, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};
    public static final int TRUEHD_RECHUNK_SAMPLE_COUNT = 16;
    public static final int TRUEHD_SYNCFRAME_PREFIX_LENGTH = 10;

    public static final class SyncFrameInfo {
        public static final int STREAM_TYPE_TYPE0 = 0;
        public static final int STREAM_TYPE_TYPE1 = 1;
        public static final int STREAM_TYPE_TYPE2 = 2;
        public static final int STREAM_TYPE_UNDEFINED = -1;
        public final int channelCount;
        public final int frameSize;
        public final String mimeType;
        public final int sampleCount;
        public final int sampleRate;
        public final int streamType;

        @Retention(RetentionPolicy.SOURCE)
        public @interface StreamType {
        }

        private SyncFrameInfo(String str, int i, int i2, int i3, int i4, int i5) {
            this.mimeType = str;
            this.streamType = i;
            this.channelCount = i2;
            this.sampleRate = i3;
            this.frameSize = i4;
            this.sampleCount = i5;
        }
    }

    public static int getAc3SyncframeAudioSampleCount() {
        return AC3_SYNCFRAME_AUDIO_SAMPLE_COUNT;
    }

    public static Format parseAc3AnnexFFormat(ParsableByteArray parsableByteArray, String str, String str2, DrmInitData drmInitData) {
        int i = SAMPLE_RATE_BY_FSCOD[(parsableByteArray.readUnsignedByte() & PsExtractor.AUDIO_STREAM) >> 6];
        int readUnsignedByte = parsableByteArray.readUnsignedByte();
        int i2 = CHANNEL_COUNT_BY_ACMOD[(readUnsignedByte & 56) >> 3];
        if ((readUnsignedByte & 4) != 0) {
            i2++;
        }
        return Format.createAudioSampleFormat(str, MimeTypes.AUDIO_AC3, null, -1, -1, i2, i, null, drmInitData, 0, str2);
    }

    public static Format parseEAc3AnnexFFormat(ParsableByteArray parsableByteArray, String str, String str2, DrmInitData drmInitData) {
        ParsableByteArray parsableByteArray2 = parsableByteArray;
        parsableByteArray2.skipBytes(2);
        int i = SAMPLE_RATE_BY_FSCOD[(parsableByteArray2.readUnsignedByte() & PsExtractor.AUDIO_STREAM) >> 6];
        int readUnsignedByte = parsableByteArray2.readUnsignedByte();
        int i2 = CHANNEL_COUNT_BY_ACMOD[(readUnsignedByte & 14) >> 1];
        if ((readUnsignedByte & 1) != 0) {
            i2++;
        }
        if (((parsableByteArray2.readUnsignedByte() & 30) >> 1) > 0 && (2 & parsableByteArray2.readUnsignedByte()) != 0) {
            i2 += 2;
        }
        int i3 = i2;
        String str3 = MimeTypes.AUDIO_E_AC3;
        if (parsableByteArray2.bytesLeft() > 0 && (parsableByteArray2.readUnsignedByte() & 1) != 0) {
            str3 = MimeTypes.AUDIO_E_AC3_JOC;
        }
        return Format.createAudioSampleFormat(str, str3, null, -1, -1, i3, i, null, drmInitData, 0, str2);
    }

    public static SyncFrameInfo parseAc3SyncframeInfo(ParsableBitArray parsableBitArray) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        String str;
        int i6;
        int i7;
        int i8;
        ParsableBitArray parsableBitArray2 = parsableBitArray;
        int position = parsableBitArray.getPosition();
        parsableBitArray2.skipBits(40);
        boolean z = parsableBitArray2.readBits(5) == 16;
        parsableBitArray2.setPosition(position);
        int i9 = -1;
        if (z) {
            parsableBitArray2.skipBits(16);
            switch (parsableBitArray2.readBits(2)) {
                case 0:
                    i9 = 0;
                    break;
                case 1:
                    i9 = 1;
                    break;
                case 2:
                    i9 = 2;
                    break;
            }
            parsableBitArray2.skipBits(3);
            int readBits = (parsableBitArray2.readBits(11) + 1) * 2;
            int readBits2 = parsableBitArray2.readBits(2);
            if (readBits2 == 3) {
                i6 = 6;
                i3 = SAMPLE_RATE_BY_FSCOD2[parsableBitArray2.readBits(2)];
                i7 = 3;
            } else {
                i7 = parsableBitArray2.readBits(2);
                i6 = BLOCKS_PER_SYNCFRAME_BY_NUMBLKSCOD[i7];
                i3 = SAMPLE_RATE_BY_FSCOD[readBits2];
            }
            i2 = AUDIO_SAMPLES_PER_AUDIO_BLOCK * i6;
            int readBits3 = parsableBitArray2.readBits(3);
            boolean readBit = parsableBitArray.readBit();
            i = CHANNEL_COUNT_BY_ACMOD[readBits3] + (readBit ? 1 : 0);
            parsableBitArray2.skipBits(10);
            if (parsableBitArray.readBit()) {
                parsableBitArray2.skipBits(8);
            }
            if (readBits3 == 0) {
                parsableBitArray2.skipBits(5);
                if (parsableBitArray.readBit()) {
                    parsableBitArray2.skipBits(8);
                }
            }
            if (i9 == 1 && parsableBitArray.readBit()) {
                parsableBitArray2.skipBits(16);
            }
            if (parsableBitArray.readBit()) {
                if (readBits3 > 2) {
                    parsableBitArray2.skipBits(2);
                }
                if ((readBits3 & 1) != 0 && readBits3 > 2) {
                    parsableBitArray2.skipBits(6);
                }
                if ((readBits3 & 4) != 0) {
                    parsableBitArray2.skipBits(6);
                }
                if (readBit && parsableBitArray.readBit()) {
                    parsableBitArray2.skipBits(5);
                }
                if (i9 == 0) {
                    if (parsableBitArray.readBit()) {
                        parsableBitArray2.skipBits(6);
                    }
                    if (readBits3 == 0 && parsableBitArray.readBit()) {
                        parsableBitArray2.skipBits(6);
                    }
                    if (parsableBitArray.readBit()) {
                        parsableBitArray2.skipBits(6);
                    }
                    int readBits4 = parsableBitArray2.readBits(2);
                    if (readBits4 == 1) {
                        parsableBitArray2.skipBits(5);
                    } else if (readBits4 == 2) {
                        parsableBitArray2.skipBits(12);
                    } else if (readBits4 == 3) {
                        int readBits5 = parsableBitArray2.readBits(5);
                        if (parsableBitArray.readBit()) {
                            parsableBitArray2.skipBits(5);
                            if (parsableBitArray.readBit()) {
                                parsableBitArray2.skipBits(4);
                            }
                            if (parsableBitArray.readBit()) {
                                parsableBitArray2.skipBits(4);
                            }
                            if (parsableBitArray.readBit()) {
                                parsableBitArray2.skipBits(4);
                            }
                            if (parsableBitArray.readBit()) {
                                parsableBitArray2.skipBits(4);
                            }
                            if (parsableBitArray.readBit()) {
                                parsableBitArray2.skipBits(4);
                            }
                            if (parsableBitArray.readBit()) {
                                parsableBitArray2.skipBits(4);
                            }
                            if (parsableBitArray.readBit()) {
                                parsableBitArray2.skipBits(4);
                            }
                            if (parsableBitArray.readBit()) {
                                if (parsableBitArray.readBit()) {
                                    parsableBitArray2.skipBits(4);
                                }
                                if (parsableBitArray.readBit()) {
                                    parsableBitArray2.skipBits(4);
                                }
                            }
                        }
                        if (parsableBitArray.readBit()) {
                            parsableBitArray2.skipBits(5);
                            if (parsableBitArray.readBit()) {
                                parsableBitArray2.skipBits(7);
                                if (parsableBitArray.readBit()) {
                                    parsableBitArray2.skipBits(8);
                                }
                            }
                        }
                        parsableBitArray2.skipBits((readBits5 + 2) * 8);
                        parsableBitArray.byteAlign();
                    }
                    if (readBits3 < 2) {
                        if (parsableBitArray.readBit()) {
                            parsableBitArray2.skipBits(14);
                        }
                        if (readBits3 == 0 && parsableBitArray.readBit()) {
                            parsableBitArray2.skipBits(14);
                        }
                    }
                    if (parsableBitArray.readBit()) {
                        if (i7 == 0) {
                            parsableBitArray2.skipBits(5);
                        } else {
                            for (int i10 = 0; i10 < i6; i10++) {
                                if (parsableBitArray.readBit()) {
                                    parsableBitArray2.skipBits(5);
                                }
                            }
                        }
                    }
                }
            }
            if (parsableBitArray.readBit()) {
                parsableBitArray2.skipBits(5);
                if (readBits3 == 2) {
                    parsableBitArray2.skipBits(4);
                }
                if (readBits3 >= 6) {
                    parsableBitArray2.skipBits(2);
                }
                if (parsableBitArray.readBit()) {
                    parsableBitArray2.skipBits(8);
                }
                if (readBits3 == 0 && parsableBitArray.readBit()) {
                    parsableBitArray2.skipBits(8);
                }
                i8 = 3;
                if (readBits2 < 3) {
                    parsableBitArray.skipBit();
                }
            } else {
                i8 = 3;
            }
            if (i9 == 0 && i7 != i8) {
                parsableBitArray.skipBit();
            }
            if (i9 == 2 && (i7 == i8 || parsableBitArray.readBit())) {
                parsableBitArray2.skipBits(6);
            }
            String str2 = MimeTypes.AUDIO_E_AC3;
            if (parsableBitArray.readBit() && parsableBitArray2.readBits(6) == 1 && parsableBitArray2.readBits(8) == 1) {
                str2 = MimeTypes.AUDIO_E_AC3_JOC;
            }
            i5 = i9;
            str = str2;
            i4 = readBits;
        } else {
            String str3 = MimeTypes.AUDIO_AC3;
            parsableBitArray2.skipBits(32);
            int readBits6 = parsableBitArray2.readBits(2);
            int ac3SyncframeSize = getAc3SyncframeSize(readBits6, parsableBitArray2.readBits(6));
            parsableBitArray2.skipBits(8);
            int readBits7 = parsableBitArray2.readBits(3);
            if (!((readBits7 & 1) == 0 || readBits7 == 1)) {
                parsableBitArray2.skipBits(2);
            }
            if ((readBits7 & 4) != 0) {
                parsableBitArray2.skipBits(2);
            }
            if (readBits7 == 2) {
                parsableBitArray2.skipBits(2);
            }
            i3 = SAMPLE_RATE_BY_FSCOD[readBits6];
            i2 = AC3_SYNCFRAME_AUDIO_SAMPLE_COUNT;
            i = CHANNEL_COUNT_BY_ACMOD[readBits7] + (parsableBitArray.readBit() ? 1 : 0);
            i5 = -1;
            str = str3;
            i4 = ac3SyncframeSize;
        }
        SyncFrameInfo syncFrameInfo = new SyncFrameInfo(str, i5, i, i3, i4, i2);
        return syncFrameInfo;
    }

    public static int parseAc3SyncframeSize(byte[] bArr) {
        if (bArr.length < 5) {
            return -1;
        }
        return getAc3SyncframeSize((bArr[4] & 192) >> 6, bArr[4] & 63);
    }

    public static int parseEAc3SyncframeAudioSampleCount(ByteBuffer byteBuffer) {
        int i = 6;
        if (((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3) {
            i = BLOCKS_PER_SYNCFRAME_BY_NUMBLKSCOD[(byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4];
        }
        return AUDIO_SAMPLES_PER_AUDIO_BLOCK * i;
    }

    public static int findTrueHdSyncframeOffset(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit() - 10;
        for (int i = position; i <= limit; i++) {
            if ((byteBuffer.getInt(i + 4) & -16777217) == -1167101192) {
                return i - position;
            }
        }
        return -1;
    }

    public static int parseTrueHdSyncframeAudioSampleCount(byte[] bArr) {
        boolean z = false;
        if (bArr[4] != -8 || bArr[5] != 114 || bArr[6] != 111 || (bArr[7] & 254) != 186) {
            return 0;
        }
        if ((bArr[7] & 255) == 187) {
            z = true;
        }
        return 40 << ((bArr[z ? (char) 9 : 8] >> 4) & 7);
    }

    public static int parseTrueHdSyncframeAudioSampleCount(ByteBuffer byteBuffer, int i) {
        return 40 << ((byteBuffer.get((byteBuffer.position() + i) + ((byteBuffer.get((byteBuffer.position() + i) + 7) & 255) == 187 ? 9 : 8)) >> 4) & 7);
    }

    private static int getAc3SyncframeSize(int i, int i2) {
        int i3 = i2 / 2;
        if (i < 0 || i >= SAMPLE_RATE_BY_FSCOD.length || i2 < 0 || i3 >= SYNCFRAME_SIZE_WORDS_BY_HALF_FRMSIZECOD_44_1.length) {
            return -1;
        }
        int i4 = SAMPLE_RATE_BY_FSCOD[i];
        if (i4 == 44100) {
            return 2 * (SYNCFRAME_SIZE_WORDS_BY_HALF_FRMSIZECOD_44_1[i3] + (i2 % 2));
        }
        int i5 = BITRATE_BY_HALF_FRMSIZECOD[i3];
        return i4 == 32000 ? 6 * i5 : 4 * i5;
    }

    private Ac3Util() {
    }
}
