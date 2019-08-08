package com.facebook.share.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.facebook.share.model.ShareContent;

public class ShareFeedContent extends ShareContent<ShareFeedContent, Object> {
    public static final Creator<ShareFeedContent> CREATOR = new Creator<ShareFeedContent>() {
        /* renamed from: a */
        public ShareFeedContent createFromParcel(Parcel parcel) {
            return new ShareFeedContent(parcel);
        }

        /* renamed from: a */
        public ShareFeedContent[] newArray(int i) {
            return new ShareFeedContent[i];
        }
    };

    /* renamed from: a */
    private final String f8297a;

    /* renamed from: b */
    private final String f8298b;

    /* renamed from: c */
    private final String f8299c;

    /* renamed from: d */
    private final String f8300d;

    /* renamed from: e */
    private final String f8301e;

    /* renamed from: f */
    private final String f8302f;

    /* renamed from: g */
    private final String f8303g;

    public int describeContents() {
        return 0;
    }

    ShareFeedContent(Parcel parcel) {
        super(parcel);
        this.f8297a = parcel.readString();
        this.f8298b = parcel.readString();
        this.f8299c = parcel.readString();
        this.f8300d = parcel.readString();
        this.f8301e = parcel.readString();
        this.f8302f = parcel.readString();
        this.f8303g = parcel.readString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.f8297a);
        parcel.writeString(this.f8298b);
        parcel.writeString(this.f8299c);
        parcel.writeString(this.f8300d);
        parcel.writeString(this.f8301e);
        parcel.writeString(this.f8302f);
        parcel.writeString(this.f8303g);
    }
}
