package com.facebook.share.model;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class ShareMessengerGenericTemplateElement implements ShareModel {
    public static final Creator<ShareMessengerGenericTemplateElement> CREATOR = new Creator<ShareMessengerGenericTemplateElement>() {
        /* renamed from: a */
        public ShareMessengerGenericTemplateElement createFromParcel(Parcel parcel) {
            return new ShareMessengerGenericTemplateElement(parcel);
        }

        /* renamed from: a */
        public ShareMessengerGenericTemplateElement[] newArray(int i) {
            return new ShareMessengerGenericTemplateElement[i];
        }
    };

    /* renamed from: a */
    private final String f8457a;

    /* renamed from: b */
    private final String f8458b;

    /* renamed from: c */
    private final Uri f8459c;

    /* renamed from: d */
    private final ShareMessengerActionButton f8460d;

    /* renamed from: e */
    private final ShareMessengerActionButton f8461e;

    public int describeContents() {
        return 0;
    }

    ShareMessengerGenericTemplateElement(Parcel parcel) {
        this.f8457a = parcel.readString();
        this.f8458b = parcel.readString();
        this.f8459c = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.f8460d = (ShareMessengerActionButton) parcel.readParcelable(ShareMessengerActionButton.class.getClassLoader());
        this.f8461e = (ShareMessengerActionButton) parcel.readParcelable(ShareMessengerActionButton.class.getClassLoader());
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f8457a);
        parcel.writeString(this.f8458b);
        parcel.writeParcelable(this.f8459c, i);
        parcel.writeParcelable(this.f8460d, i);
        parcel.writeParcelable(this.f8461e, i);
    }
}
