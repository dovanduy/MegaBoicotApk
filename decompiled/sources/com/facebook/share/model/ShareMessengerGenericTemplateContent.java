package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class ShareMessengerGenericTemplateContent extends ShareContent<ShareMessengerGenericTemplateContent, Object> {
    public static final Creator<ShareMessengerGenericTemplateContent> CREATOR = new Creator<ShareMessengerGenericTemplateContent>() {
        /* renamed from: a */
        public ShareMessengerGenericTemplateContent createFromParcel(Parcel parcel) {
            return new ShareMessengerGenericTemplateContent(parcel);
        }

        /* renamed from: a */
        public ShareMessengerGenericTemplateContent[] newArray(int i) {
            return new ShareMessengerGenericTemplateContent[i];
        }
    };

    /* renamed from: a */
    private final boolean f8451a;

    /* renamed from: b */
    private final C2729a f8452b;

    /* renamed from: c */
    private final ShareMessengerGenericTemplateElement f8453c;

    /* renamed from: com.facebook.share.model.ShareMessengerGenericTemplateContent$a */
    public enum C2729a {
        HORIZONTAL,
        SQUARE
    }

    public int describeContents() {
        return 0;
    }

    ShareMessengerGenericTemplateContent(Parcel parcel) {
        super(parcel);
        this.f8451a = parcel.readByte() != 0;
        this.f8452b = (C2729a) parcel.readSerializable();
        this.f8453c = (ShareMessengerGenericTemplateElement) parcel.readParcelable(ShareMessengerGenericTemplateElement.class.getClassLoader());
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeByte(this.f8451a ? (byte) 1 : 0);
        parcel.writeSerializable(this.f8452b);
        parcel.writeParcelable(this.f8453c, i);
    }
}
