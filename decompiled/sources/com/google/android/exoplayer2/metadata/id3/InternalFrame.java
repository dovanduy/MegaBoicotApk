package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;

public final class InternalFrame extends Id3Frame {
    public static final Creator<InternalFrame> CREATOR = new Creator<InternalFrame>() {
        public InternalFrame createFromParcel(Parcel parcel) {
            return new InternalFrame(parcel);
        }

        public InternalFrame[] newArray(int i) {
            return new InternalFrame[i];
        }
    };

    /* renamed from: ID */
    public static final String f8640ID = "----";
    public final String description;
    public final String domain;
    public final String text;

    public InternalFrame(String str, String str2, String str3) {
        super(f8640ID);
        this.domain = str;
        this.description = str2;
        this.text = str3;
    }

    InternalFrame(Parcel parcel) {
        super(f8640ID);
        this.domain = (String) Assertions.checkNotNull(parcel.readString());
        this.description = (String) Assertions.checkNotNull(parcel.readString());
        this.text = (String) Assertions.checkNotNull(parcel.readString());
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        InternalFrame internalFrame = (InternalFrame) obj;
        if (!Util.areEqual(this.description, internalFrame.description) || !Util.areEqual(this.domain, internalFrame.domain) || !Util.areEqual(this.text, internalFrame.text)) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        int i = 0;
        int hashCode = 31 * (((527 + (this.domain != null ? this.domain.hashCode() : 0)) * 31) + (this.description != null ? this.description.hashCode() : 0));
        if (this.text != null) {
            i = this.text.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f8639id);
        sb.append(": domain=");
        sb.append(this.domain);
        sb.append(", description=");
        sb.append(this.description);
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f8639id);
        parcel.writeString(this.domain);
        parcel.writeString(this.text);
    }
}
