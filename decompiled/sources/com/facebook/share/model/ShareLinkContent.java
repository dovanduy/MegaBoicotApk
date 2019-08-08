package com.facebook.share.model;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class ShareLinkContent extends ShareContent<ShareLinkContent, Object> {
    public static final Creator<ShareLinkContent> CREATOR = new Creator<ShareLinkContent>() {
        /* renamed from: a */
        public ShareLinkContent createFromParcel(Parcel parcel) {
            return new ShareLinkContent(parcel);
        }

        /* renamed from: a */
        public ShareLinkContent[] newArray(int i) {
            return new ShareLinkContent[i];
        }
    };
    @Deprecated

    /* renamed from: a */
    private final String f8443a;
    @Deprecated

    /* renamed from: b */
    private final String f8444b;
    @Deprecated

    /* renamed from: c */
    private final Uri f8445c;

    /* renamed from: d */
    private final String f8446d;

    public int describeContents() {
        return 0;
    }

    ShareLinkContent(Parcel parcel) {
        super(parcel);
        this.f8443a = parcel.readString();
        this.f8444b = parcel.readString();
        this.f8445c = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.f8446d = parcel.readString();
    }

    /* renamed from: c */
    public String mo9477c() {
        return this.f8446d;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.f8443a);
        parcel.writeString(this.f8444b);
        parcel.writeParcelable(this.f8445c, 0);
        parcel.writeString(this.f8446d);
    }
}
