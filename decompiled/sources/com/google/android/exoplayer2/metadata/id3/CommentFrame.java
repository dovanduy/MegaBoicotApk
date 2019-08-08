package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.exoplayer2.util.Util;

public final class CommentFrame extends Id3Frame {
    public static final Creator<CommentFrame> CREATOR = new Creator<CommentFrame>() {
        public CommentFrame createFromParcel(Parcel parcel) {
            return new CommentFrame(parcel);
        }

        public CommentFrame[] newArray(int i) {
            return new CommentFrame[i];
        }
    };

    /* renamed from: ID */
    public static final String f8637ID = "COMM";
    public final String description;
    public final String language;
    public final String text;

    public CommentFrame(String str, String str2, String str3) {
        super(f8637ID);
        this.language = str;
        this.description = str2;
        this.text = str3;
    }

    CommentFrame(Parcel parcel) {
        super(f8637ID);
        this.language = parcel.readString();
        this.description = parcel.readString();
        this.text = parcel.readString();
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CommentFrame commentFrame = (CommentFrame) obj;
        if (!Util.areEqual(this.description, commentFrame.description) || !Util.areEqual(this.language, commentFrame.language) || !Util.areEqual(this.text, commentFrame.text)) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        int i = 0;
        int hashCode = 31 * (((527 + (this.language != null ? this.language.hashCode() : 0)) * 31) + (this.description != null ? this.description.hashCode() : 0));
        if (this.text != null) {
            i = this.text.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f8639id);
        sb.append(": language=");
        sb.append(this.language);
        sb.append(", description=");
        sb.append(this.description);
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f8639id);
        parcel.writeString(this.language);
        parcel.writeString(this.text);
    }
}