package com.google.android.exoplayer2;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.util.Util;
import com.google.android.exoplayer2.video.ColorInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class Format implements Parcelable {
    public static final Creator<Format> CREATOR = new Creator<Format>() {
        public Format createFromParcel(Parcel parcel) {
            return new Format(parcel);
        }

        public Format[] newArray(int i) {
            return new Format[i];
        }
    };
    public static final int NO_VALUE = -1;
    public static final long OFFSET_SAMPLE_RELATIVE = Long.MAX_VALUE;
    public final int accessibilityChannel;
    public final int bitrate;
    public final int channelCount;
    public final String codecs;
    public final ColorInfo colorInfo;
    public final String containerMimeType;
    public final DrmInitData drmInitData;
    public final int encoderDelay;
    public final int encoderPadding;
    public final float frameRate;
    private int hashCode;
    public final int height;

    /* renamed from: id */
    public final String f8626id;
    public final List<byte[]> initializationData;
    public final String language;
    public final int maxInputSize;
    public final Metadata metadata;
    public final int pcmEncoding;
    public final float pixelWidthHeightRatio;
    public final byte[] projectionData;
    public final int rotationDegrees;
    public final String sampleMimeType;
    public final int sampleRate;
    public final int selectionFlags;
    public final int stereoMode;
    public final long subsampleOffsetUs;
    public final int width;

    public int describeContents() {
        return 0;
    }

    public static Format createVideoContainerFormat(String str, String str2, String str3, String str4, int i, int i2, int i3, float f, List<byte[]> list, int i4) {
        Format format = new Format(str, str2, str3, str4, i, -1, i2, i3, f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, i4, null, -1, Long.MAX_VALUE, list, null, null);
        return format;
    }

    public static Format createVideoSampleFormat(String str, String str2, String str3, int i, int i2, int i3, int i4, float f, List<byte[]> list, DrmInitData drmInitData2) {
        return createVideoSampleFormat(str, str2, str3, i, i2, i3, i4, f, list, -1, -1.0f, drmInitData2);
    }

    public static Format createVideoSampleFormat(String str, String str2, String str3, int i, int i2, int i3, int i4, float f, List<byte[]> list, int i5, float f2, DrmInitData drmInitData2) {
        return createVideoSampleFormat(str, str2, str3, i, i2, i3, i4, f, list, i5, f2, null, -1, null, drmInitData2);
    }

    public static Format createVideoSampleFormat(String str, String str2, String str3, int i, int i2, int i3, int i4, float f, List<byte[]> list, int i5, float f2, byte[] bArr, int i6, ColorInfo colorInfo2, DrmInitData drmInitData2) {
        Format format = new Format(str, null, str2, str3, i, i2, i3, i4, f, i5, f2, bArr, i6, colorInfo2, -1, -1, -1, -1, -1, 0, null, -1, Long.MAX_VALUE, list, drmInitData2, null);
        return format;
    }

    public static Format createAudioContainerFormat(String str, String str2, String str3, String str4, int i, int i2, int i3, List<byte[]> list, int i4, String str5) {
        Format format = new Format(str, str2, str3, str4, i, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, i2, i3, -1, -1, -1, i4, str5, -1, Long.MAX_VALUE, list, null, null);
        return format;
    }

    public static Format createAudioSampleFormat(String str, String str2, String str3, int i, int i2, int i3, int i4, List<byte[]> list, DrmInitData drmInitData2, int i5, String str4) {
        return createAudioSampleFormat(str, str2, str3, i, i2, i3, i4, -1, list, drmInitData2, i5, str4);
    }

    public static Format createAudioSampleFormat(String str, String str2, String str3, int i, int i2, int i3, int i4, int i5, List<byte[]> list, DrmInitData drmInitData2, int i6, String str4) {
        return createAudioSampleFormat(str, str2, str3, i, i2, i3, i4, i5, -1, -1, list, drmInitData2, i6, str4, null);
    }

    public static Format createAudioSampleFormat(String str, String str2, String str3, int i, int i2, int i3, int i4, int i5, int i6, int i7, List<byte[]> list, DrmInitData drmInitData2, int i8, String str4, Metadata metadata2) {
        Format format = new Format(str, null, str2, str3, i, i2, -1, -1, -1.0f, -1, -1.0f, null, -1, null, i3, i4, i5, i6, i7, i8, str4, -1, Long.MAX_VALUE, list, drmInitData2, metadata2);
        return format;
    }

    public static Format createTextContainerFormat(String str, String str2, String str3, String str4, int i, int i2, String str5) {
        return createTextContainerFormat(str, str2, str3, str4, i, i2, str5, -1);
    }

    public static Format createTextContainerFormat(String str, String str2, String str3, String str4, int i, int i2, String str5, int i3) {
        Format format = new Format(str, str2, str3, str4, i, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, i2, str5, i3, Long.MAX_VALUE, null, null, null);
        return format;
    }

    public static Format createTextSampleFormat(String str, String str2, int i, String str3) {
        return createTextSampleFormat(str, str2, i, str3, null);
    }

    public static Format createTextSampleFormat(String str, String str2, int i, String str3, DrmInitData drmInitData2) {
        return createTextSampleFormat(str, str2, null, -1, i, str3, -1, drmInitData2, Long.MAX_VALUE, Collections.emptyList());
    }

    public static Format createTextSampleFormat(String str, String str2, String str3, int i, int i2, String str4, int i3, DrmInitData drmInitData2) {
        return createTextSampleFormat(str, str2, str3, i, i2, str4, i3, drmInitData2, Long.MAX_VALUE, Collections.emptyList());
    }

    public static Format createTextSampleFormat(String str, String str2, String str3, int i, int i2, String str4, DrmInitData drmInitData2, long j) {
        return createTextSampleFormat(str, str2, str3, i, i2, str4, -1, drmInitData2, j, Collections.emptyList());
    }

    public static Format createTextSampleFormat(String str, String str2, String str3, int i, int i2, String str4, int i3, DrmInitData drmInitData2, long j, List<byte[]> list) {
        Format format = new Format(str, null, str2, str3, i, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, i2, str4, i3, j, list, drmInitData2, null);
        return format;
    }

    public static Format createImageSampleFormat(String str, String str2, String str3, int i, int i2, List<byte[]> list, String str4, DrmInitData drmInitData2) {
        Format format = new Format(str, null, str2, str3, i, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, i2, str4, -1, Long.MAX_VALUE, list, drmInitData2, null);
        return format;
    }

    public static Format createContainerFormat(String str, String str2, String str3, String str4, int i, int i2, String str5) {
        Format format = new Format(str, str2, str3, str4, i, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, i2, str5, -1, Long.MAX_VALUE, null, null, null);
        return format;
    }

    public static Format createSampleFormat(String str, String str2, long j) {
        Format format = new Format(str, null, str2, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, null, -1, j, null, null, null);
        return format;
    }

    public static Format createSampleFormat(String str, String str2, String str3, int i, DrmInitData drmInitData2) {
        Format format = new Format(str, null, str2, str3, i, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, null, -1, Long.MAX_VALUE, null, drmInitData2, null);
        return format;
    }

    Format(String str, String str2, String str3, String str4, int i, int i2, int i3, int i4, float f, int i5, float f2, byte[] bArr, int i6, ColorInfo colorInfo2, int i7, int i8, int i9, int i10, int i11, int i12, String str5, int i13, long j, List<byte[]> list, DrmInitData drmInitData2, Metadata metadata2) {
        this.f8626id = str;
        this.containerMimeType = str2;
        this.sampleMimeType = str3;
        this.codecs = str4;
        this.bitrate = i;
        this.maxInputSize = i2;
        this.width = i3;
        this.height = i4;
        this.frameRate = f;
        int i14 = i5;
        if (i14 == -1) {
            i14 = 0;
        }
        this.rotationDegrees = i14;
        this.pixelWidthHeightRatio = f2 == -1.0f ? 1.0f : f2;
        this.projectionData = bArr;
        this.stereoMode = i6;
        this.colorInfo = colorInfo2;
        this.channelCount = i7;
        this.sampleRate = i8;
        this.pcmEncoding = i9;
        int i15 = i10;
        if (i15 == -1) {
            i15 = 0;
        }
        this.encoderDelay = i15;
        int i16 = i11;
        if (i16 == -1) {
            i16 = 0;
        }
        this.encoderPadding = i16;
        this.selectionFlags = i12;
        this.language = str5;
        this.accessibilityChannel = i13;
        this.subsampleOffsetUs = j;
        this.initializationData = list == null ? Collections.emptyList() : list;
        this.drmInitData = drmInitData2;
        this.metadata = metadata2;
    }

    Format(Parcel parcel) {
        this.f8626id = parcel.readString();
        this.containerMimeType = parcel.readString();
        this.sampleMimeType = parcel.readString();
        this.codecs = parcel.readString();
        this.bitrate = parcel.readInt();
        this.maxInputSize = parcel.readInt();
        this.width = parcel.readInt();
        this.height = parcel.readInt();
        this.frameRate = parcel.readFloat();
        this.rotationDegrees = parcel.readInt();
        this.pixelWidthHeightRatio = parcel.readFloat();
        this.projectionData = Util.readBoolean(parcel) ? parcel.createByteArray() : null;
        this.stereoMode = parcel.readInt();
        this.colorInfo = (ColorInfo) parcel.readParcelable(ColorInfo.class.getClassLoader());
        this.channelCount = parcel.readInt();
        this.sampleRate = parcel.readInt();
        this.pcmEncoding = parcel.readInt();
        this.encoderDelay = parcel.readInt();
        this.encoderPadding = parcel.readInt();
        this.selectionFlags = parcel.readInt();
        this.language = parcel.readString();
        this.accessibilityChannel = parcel.readInt();
        this.subsampleOffsetUs = parcel.readLong();
        int readInt = parcel.readInt();
        this.initializationData = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            this.initializationData.add(parcel.createByteArray());
        }
        this.drmInitData = (DrmInitData) parcel.readParcelable(DrmInitData.class.getClassLoader());
        this.metadata = (Metadata) parcel.readParcelable(Metadata.class.getClassLoader());
    }

    public Format copyWithMaxInputSize(int i) {
        String str = this.f8626id;
        String str2 = this.containerMimeType;
        String str3 = this.sampleMimeType;
        String str4 = this.codecs;
        int i2 = this.bitrate;
        int i3 = this.width;
        int i4 = this.height;
        float f = this.frameRate;
        int i5 = this.rotationDegrees;
        float f2 = this.pixelWidthHeightRatio;
        byte[] bArr = this.projectionData;
        int i6 = this.stereoMode;
        ColorInfo colorInfo2 = this.colorInfo;
        int i7 = this.channelCount;
        int i8 = this.sampleRate;
        ColorInfo colorInfo3 = colorInfo2;
        int i9 = this.pcmEncoding;
        int i10 = this.encoderDelay;
        int i11 = this.encoderPadding;
        int i12 = this.selectionFlags;
        String str5 = this.language;
        int i13 = i6;
        int i14 = this.accessibilityChannel;
        long j = this.subsampleOffsetUs;
        List<byte[]> list = this.initializationData;
        int i15 = i7;
        int i16 = i;
        DrmInitData drmInitData2 = this.drmInitData;
        int i17 = i13;
        int i18 = i9;
        int i19 = i10;
        int i20 = i11;
        int i21 = i12;
        String str6 = str5;
        int i22 = i14;
        ColorInfo colorInfo4 = colorInfo3;
        Format format = new Format(str, str2, str3, str4, i2, i16, i3, i4, f, i5, f2, bArr, i17, colorInfo4, i15, i8, i18, i19, i20, i21, str6, i22, j, list, drmInitData2, this.metadata);
        return format;
    }

    public Format copyWithSubsampleOffsetUs(long j) {
        String str = this.f8626id;
        String str2 = this.containerMimeType;
        String str3 = this.sampleMimeType;
        String str4 = this.codecs;
        int i = this.bitrate;
        int i2 = this.maxInputSize;
        int i3 = this.width;
        int i4 = this.height;
        float f = this.frameRate;
        int i5 = this.rotationDegrees;
        float f2 = this.pixelWidthHeightRatio;
        byte[] bArr = this.projectionData;
        int i6 = this.stereoMode;
        ColorInfo colorInfo2 = this.colorInfo;
        ColorInfo colorInfo3 = colorInfo2;
        ColorInfo colorInfo4 = colorInfo3;
        long j2 = j;
        Format format = new Format(str, str2, str3, str4, i, i2, i3, i4, f, i5, f2, bArr, i6, colorInfo4, this.channelCount, this.sampleRate, this.pcmEncoding, this.encoderDelay, this.encoderPadding, this.selectionFlags, this.language, this.accessibilityChannel, j2, this.initializationData, this.drmInitData, this.metadata);
        return format;
    }

    public Format copyWithContainerInfo(String str, String str2, String str3, int i, int i2, int i3, int i4, String str4) {
        String str5 = this.containerMimeType;
        int i5 = this.maxInputSize;
        float f = this.frameRate;
        int i6 = this.rotationDegrees;
        float f2 = this.pixelWidthHeightRatio;
        byte[] bArr = this.projectionData;
        int i7 = this.stereoMode;
        ColorInfo colorInfo2 = this.colorInfo;
        int i8 = this.channelCount;
        int i9 = this.sampleRate;
        int i10 = this.pcmEncoding;
        int i11 = this.encoderDelay;
        int i12 = this.encoderPadding;
        int i13 = this.accessibilityChannel;
        int i14 = i7;
        ColorInfo colorInfo3 = colorInfo2;
        long j = this.subsampleOffsetUs;
        List<byte[]> list = this.initializationData;
        long j2 = j;
        DrmInitData drmInitData2 = this.drmInitData;
        int i15 = i13;
        int i16 = i12;
        int i17 = i11;
        int i18 = i10;
        int i19 = i9;
        int i20 = i8;
        long j3 = j2;
        int i21 = i14;
        DrmInitData drmInitData3 = drmInitData2;
        ColorInfo colorInfo4 = colorInfo3;
        int i22 = i4;
        String str6 = str4;
        Format format = new Format(str, str5, str2, str3, i, i5, i2, i3, f, i6, f2, bArr, i21, colorInfo4, i20, i19, i18, i17, i16, i22, str6, i15, j3, list, drmInitData3, this.metadata);
        return format;
    }

    public Format copyWithManifestFormatInfo(Format format) {
        Format format2 = format;
        if (this == format2) {
            return this;
        }
        String str = format2.f8626id;
        String str2 = this.codecs == null ? format2.codecs : this.codecs;
        int i = this.bitrate == -1 ? format2.bitrate : this.bitrate;
        float f = this.frameRate == -1.0f ? format2.frameRate : this.frameRate;
        int i2 = this.selectionFlags | format2.selectionFlags;
        String str3 = this.language == null ? format2.language : this.language;
        DrmInitData createSessionCreationData = DrmInitData.createSessionCreationData(format2.drmInitData, this.drmInitData);
        Format format3 = new Format(str, this.containerMimeType, this.sampleMimeType, str2, i, this.maxInputSize, this.width, this.height, f, this.rotationDegrees, this.pixelWidthHeightRatio, this.projectionData, this.stereoMode, this.colorInfo, this.channelCount, this.sampleRate, this.pcmEncoding, this.encoderDelay, this.encoderPadding, i2, str3, this.accessibilityChannel, this.subsampleOffsetUs, this.initializationData, createSessionCreationData, this.metadata);
        return format3;
    }

    public Format copyWithGaplessInfo(int i, int i2) {
        String str = this.f8626id;
        String str2 = this.containerMimeType;
        String str3 = this.sampleMimeType;
        String str4 = this.codecs;
        int i3 = this.bitrate;
        int i4 = this.maxInputSize;
        int i5 = this.width;
        int i6 = this.height;
        float f = this.frameRate;
        int i7 = this.rotationDegrees;
        float f2 = this.pixelWidthHeightRatio;
        byte[] bArr = this.projectionData;
        int i8 = this.stereoMode;
        ColorInfo colorInfo2 = this.colorInfo;
        int i9 = this.channelCount;
        ColorInfo colorInfo3 = colorInfo2;
        int i10 = this.sampleRate;
        int i11 = this.pcmEncoding;
        int i12 = this.selectionFlags;
        String str5 = this.language;
        int i13 = i8;
        int i14 = this.accessibilityChannel;
        long j = this.subsampleOffsetUs;
        List<byte[]> list = this.initializationData;
        DrmInitData drmInitData2 = this.drmInitData;
        int i15 = i13;
        int i16 = i10;
        int i17 = i11;
        int i18 = i12;
        String str6 = str5;
        int i19 = i14;
        ColorInfo colorInfo4 = colorInfo3;
        int i20 = i;
        int i21 = i2;
        Format format = new Format(str, str2, str3, str4, i3, i4, i5, i6, f, i7, f2, bArr, i15, colorInfo4, i9, i16, i17, i20, i21, i18, str6, i19, j, list, drmInitData2, this.metadata);
        return format;
    }

    public Format copyWithDrmInitData(DrmInitData drmInitData2) {
        String str = this.f8626id;
        String str2 = this.containerMimeType;
        String str3 = this.sampleMimeType;
        String str4 = this.codecs;
        int i = this.bitrate;
        int i2 = this.maxInputSize;
        int i3 = this.width;
        int i4 = this.height;
        float f = this.frameRate;
        int i5 = this.rotationDegrees;
        float f2 = this.pixelWidthHeightRatio;
        byte[] bArr = this.projectionData;
        int i6 = this.stereoMode;
        ColorInfo colorInfo2 = this.colorInfo;
        int i7 = this.channelCount;
        ColorInfo colorInfo3 = colorInfo2;
        int i8 = this.sampleRate;
        int i9 = this.pcmEncoding;
        int i10 = this.encoderDelay;
        int i11 = this.encoderPadding;
        int i12 = this.selectionFlags;
        String str5 = this.language;
        int i13 = i6;
        int i14 = this.accessibilityChannel;
        long j = this.subsampleOffsetUs;
        List<byte[]> list = this.initializationData;
        int i15 = i13;
        List<byte[]> list2 = list;
        int i16 = i8;
        int i17 = i9;
        int i18 = i10;
        int i19 = i11;
        int i20 = i12;
        String str6 = str5;
        int i21 = i14;
        ColorInfo colorInfo4 = colorInfo3;
        Format format = new Format(str, str2, str3, str4, i, i2, i3, i4, f, i5, f2, bArr, i15, colorInfo4, i7, i16, i17, i18, i19, i20, str6, i21, j, list2, drmInitData2, this.metadata);
        return format;
    }

    public Format copyWithMetadata(Metadata metadata2) {
        String str = this.f8626id;
        String str2 = this.containerMimeType;
        String str3 = this.sampleMimeType;
        String str4 = this.codecs;
        int i = this.bitrate;
        int i2 = this.maxInputSize;
        int i3 = this.width;
        int i4 = this.height;
        float f = this.frameRate;
        int i5 = this.rotationDegrees;
        float f2 = this.pixelWidthHeightRatio;
        byte[] bArr = this.projectionData;
        int i6 = this.stereoMode;
        ColorInfo colorInfo2 = this.colorInfo;
        int i7 = this.channelCount;
        ColorInfo colorInfo3 = colorInfo2;
        int i8 = this.sampleRate;
        int i9 = this.pcmEncoding;
        int i10 = this.encoderDelay;
        int i11 = this.encoderPadding;
        int i12 = this.selectionFlags;
        String str5 = this.language;
        int i13 = i6;
        int i14 = this.accessibilityChannel;
        long j = this.subsampleOffsetUs;
        List<byte[]> list = this.initializationData;
        int i15 = i13;
        List<byte[]> list2 = list;
        int i16 = i8;
        int i17 = i9;
        int i18 = i10;
        int i19 = i11;
        int i20 = i12;
        String str6 = str5;
        int i21 = i14;
        ColorInfo colorInfo4 = colorInfo3;
        Format format = new Format(str, str2, str3, str4, i, i2, i3, i4, f, i5, f2, bArr, i15, colorInfo4, i7, i16, i17, i18, i19, i20, str6, i21, j, list2, this.drmInitData, metadata2);
        return format;
    }

    public Format copyWithRotationDegrees(int i) {
        String str = this.f8626id;
        String str2 = this.containerMimeType;
        String str3 = this.sampleMimeType;
        String str4 = this.codecs;
        int i2 = this.bitrate;
        int i3 = this.maxInputSize;
        int i4 = this.width;
        int i5 = this.height;
        float f = this.frameRate;
        float f2 = this.pixelWidthHeightRatio;
        byte[] bArr = this.projectionData;
        int i6 = this.stereoMode;
        ColorInfo colorInfo2 = this.colorInfo;
        int i7 = this.channelCount;
        int i8 = this.sampleRate;
        ColorInfo colorInfo3 = colorInfo2;
        int i9 = this.pcmEncoding;
        int i10 = this.encoderDelay;
        int i11 = this.encoderPadding;
        int i12 = this.selectionFlags;
        String str5 = this.language;
        int i13 = i6;
        int i14 = this.accessibilityChannel;
        long j = this.subsampleOffsetUs;
        List<byte[]> list = this.initializationData;
        int i15 = i7;
        int i16 = i;
        DrmInitData drmInitData2 = this.drmInitData;
        int i17 = i13;
        int i18 = i9;
        int i19 = i10;
        int i20 = i11;
        int i21 = i12;
        String str6 = str5;
        int i22 = i14;
        ColorInfo colorInfo4 = colorInfo3;
        Format format = new Format(str, str2, str3, str4, i2, i3, i4, i5, f, i16, f2, bArr, i17, colorInfo4, i15, i8, i18, i19, i20, i21, str6, i22, j, list, drmInitData2, this.metadata);
        return format;
    }

    public int getPixelCount() {
        if (this.width == -1 || this.height == -1) {
            return -1;
        }
        return this.height * this.width;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Format(");
        sb.append(this.f8626id);
        sb.append(", ");
        sb.append(this.containerMimeType);
        sb.append(", ");
        sb.append(this.sampleMimeType);
        sb.append(", ");
        sb.append(this.bitrate);
        sb.append(", ");
        sb.append(this.language);
        sb.append(", [");
        sb.append(this.width);
        sb.append(", ");
        sb.append(this.height);
        sb.append(", ");
        sb.append(this.frameRate);
        sb.append("], [");
        sb.append(this.channelCount);
        sb.append(", ");
        sb.append(this.sampleRate);
        sb.append("])");
        return sb.toString();
    }

    public int hashCode() {
        if (this.hashCode == 0) {
            int i = 0;
            int hashCode2 = 31 * (((((((((((((((((((((((527 + (this.f8626id == null ? 0 : this.f8626id.hashCode())) * 31) + (this.containerMimeType == null ? 0 : this.containerMimeType.hashCode())) * 31) + (this.sampleMimeType == null ? 0 : this.sampleMimeType.hashCode())) * 31) + (this.codecs == null ? 0 : this.codecs.hashCode())) * 31) + this.bitrate) * 31) + this.width) * 31) + this.height) * 31) + this.channelCount) * 31) + this.sampleRate) * 31) + (this.language == null ? 0 : this.language.hashCode())) * 31) + this.accessibilityChannel) * 31) + (this.drmInitData == null ? 0 : this.drmInitData.hashCode()));
            if (this.metadata != null) {
                i = this.metadata.hashCode();
            }
            this.hashCode = hashCode2 + i;
        }
        return this.hashCode;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Format format = (Format) obj;
        if (!(this.bitrate == format.bitrate && this.maxInputSize == format.maxInputSize && this.width == format.width && this.height == format.height && this.frameRate == format.frameRate && this.rotationDegrees == format.rotationDegrees && this.pixelWidthHeightRatio == format.pixelWidthHeightRatio && this.stereoMode == format.stereoMode && this.channelCount == format.channelCount && this.sampleRate == format.sampleRate && this.pcmEncoding == format.pcmEncoding && this.encoderDelay == format.encoderDelay && this.encoderPadding == format.encoderPadding && this.subsampleOffsetUs == format.subsampleOffsetUs && this.selectionFlags == format.selectionFlags && Util.areEqual(this.f8626id, format.f8626id) && Util.areEqual(this.language, format.language) && this.accessibilityChannel == format.accessibilityChannel && Util.areEqual(this.containerMimeType, format.containerMimeType) && Util.areEqual(this.sampleMimeType, format.sampleMimeType) && Util.areEqual(this.codecs, format.codecs) && Util.areEqual(this.drmInitData, format.drmInitData) && Util.areEqual(this.metadata, format.metadata) && Util.areEqual(this.colorInfo, format.colorInfo) && Arrays.equals(this.projectionData, format.projectionData) && initializationDataEquals(format))) {
            z = false;
        }
        return z;
    }

    public boolean initializationDataEquals(Format format) {
        if (this.initializationData.size() != format.initializationData.size()) {
            return false;
        }
        for (int i = 0; i < this.initializationData.size(); i++) {
            if (!Arrays.equals((byte[]) this.initializationData.get(i), (byte[]) format.initializationData.get(i))) {
                return false;
            }
        }
        return true;
    }

    public static String toLogString(Format format) {
        if (format == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("id=");
        sb.append(format.f8626id);
        sb.append(", mimeType=");
        sb.append(format.sampleMimeType);
        if (format.bitrate != -1) {
            sb.append(", bitrate=");
            sb.append(format.bitrate);
        }
        if (!(format.width == -1 || format.height == -1)) {
            sb.append(", res=");
            sb.append(format.width);
            sb.append("x");
            sb.append(format.height);
        }
        if (format.frameRate != -1.0f) {
            sb.append(", fps=");
            sb.append(format.frameRate);
        }
        if (format.channelCount != -1) {
            sb.append(", channels=");
            sb.append(format.channelCount);
        }
        if (format.sampleRate != -1) {
            sb.append(", sample_rate=");
            sb.append(format.sampleRate);
        }
        if (format.language != null) {
            sb.append(", language=");
            sb.append(format.language);
        }
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f8626id);
        parcel.writeString(this.containerMimeType);
        parcel.writeString(this.sampleMimeType);
        parcel.writeString(this.codecs);
        parcel.writeInt(this.bitrate);
        parcel.writeInt(this.maxInputSize);
        parcel.writeInt(this.width);
        parcel.writeInt(this.height);
        parcel.writeFloat(this.frameRate);
        parcel.writeInt(this.rotationDegrees);
        parcel.writeFloat(this.pixelWidthHeightRatio);
        Util.writeBoolean(parcel, this.projectionData != null);
        if (this.projectionData != null) {
            parcel.writeByteArray(this.projectionData);
        }
        parcel.writeInt(this.stereoMode);
        parcel.writeParcelable(this.colorInfo, i);
        parcel.writeInt(this.channelCount);
        parcel.writeInt(this.sampleRate);
        parcel.writeInt(this.pcmEncoding);
        parcel.writeInt(this.encoderDelay);
        parcel.writeInt(this.encoderPadding);
        parcel.writeInt(this.selectionFlags);
        parcel.writeString(this.language);
        parcel.writeInt(this.accessibilityChannel);
        parcel.writeLong(this.subsampleOffsetUs);
        int size = this.initializationData.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeByteArray((byte[]) this.initializationData.get(i2));
        }
        parcel.writeParcelable(this.drmInitData, 0);
        parcel.writeParcelable(this.metadata, 0);
    }
}
