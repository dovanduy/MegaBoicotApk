package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.exoplayer2.util.Util;
import java.util.Arrays;

public final class ApicFrame extends Id3Frame {
    public static final Creator<ApicFrame> CREATOR = new Creator<ApicFrame>() {
        public ApicFrame createFromParcel(Parcel parcel) {
            return new ApicFrame(parcel);
        }

        public ApicFrame[] newArray(int i) {
            return new ApicFrame[i];
        }
    };

    /* renamed from: ID */
    public static final String f8634ID = "APIC";
    public final String description;
    public final String mimeType;
    public final byte[] pictureData;
    public final int pictureType;

    public ApicFrame(String str, String str2, int i, byte[] bArr) {
        super(f8634ID);
        this.mimeType = str;
        this.description = str2;
        this.pictureType = i;
        this.pictureData = bArr;
    }

    ApicFrame(Parcel parcel) {
        super(f8634ID);
        this.mimeType = parcel.readString();
        this.description = parcel.readString();
        this.pictureType = parcel.readInt();
        this.pictureData = parcel.createByteArray();
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ApicFrame apicFrame = (ApicFrame) obj;
        if (this.pictureType != apicFrame.pictureType || !Util.areEqual(this.mimeType, apicFrame.mimeType) || !Util.areEqual(this.description, apicFrame.description) || !Arrays.equals(this.pictureData, apicFrame.pictureData)) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        int i = 0;
        int hashCode = (((527 + this.pictureType) * 31) + (this.mimeType != null ? this.mimeType.hashCode() : 0)) * 31;
        if (this.description != null) {
            i = this.description.hashCode();
        }
        return (31 * (hashCode + i)) + Arrays.hashCode(this.pictureData);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f8639id);
        sb.append(": mimeType=");
        sb.append(this.mimeType);
        sb.append(", description=");
        sb.append(this.description);
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mimeType);
        parcel.writeString(this.description);
        parcel.writeInt(this.pictureType);
        parcel.writeByteArray(this.pictureData);
    }
}
