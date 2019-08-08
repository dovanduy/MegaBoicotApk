package com.facebook.share.model;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class ShareMessengerMediaTemplateContent extends ShareContent<ShareMessengerMediaTemplateContent, Object> {
    public static final Creator<ShareMessengerMediaTemplateContent> CREATOR = new Creator<ShareMessengerMediaTemplateContent>() {
        /* renamed from: a */
        public ShareMessengerMediaTemplateContent createFromParcel(Parcel parcel) {
            return new ShareMessengerMediaTemplateContent(parcel);
        }

        /* renamed from: a */
        public ShareMessengerMediaTemplateContent[] newArray(int i) {
            return new ShareMessengerMediaTemplateContent[i];
        }
    };

    /* renamed from: a */
    private final C2732a f8462a;

    /* renamed from: b */
    private final String f8463b;

    /* renamed from: c */
    private final Uri f8464c;

    /* renamed from: d */
    private final ShareMessengerActionButton f8465d;

    /* renamed from: com.facebook.share.model.ShareMessengerMediaTemplateContent$a */
    public enum C2732a {
        IMAGE,
        VIDEO
    }

    public int describeContents() {
        return 0;
    }

    ShareMessengerMediaTemplateContent(Parcel parcel) {
        super(parcel);
        this.f8462a = (C2732a) parcel.readSerializable();
        this.f8463b = parcel.readString();
        this.f8464c = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.f8465d = (ShareMessengerActionButton) parcel.readParcelable(ShareMessengerActionButton.class.getClassLoader());
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeSerializable(this.f8462a);
        parcel.writeString(this.f8463b);
        parcel.writeParcelable(this.f8464c, i);
        parcel.writeParcelable(this.f8465d, i);
    }
}
