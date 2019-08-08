package com.facebook.share.model;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class ShareMessengerURLActionButton extends ShareMessengerActionButton {
    public static final Creator<ShareMessengerURLActionButton> CREATOR = new Creator<ShareMessengerURLActionButton>() {
        /* renamed from: a */
        public ShareMessengerURLActionButton createFromParcel(Parcel parcel) {
            return new ShareMessengerURLActionButton(parcel);
        }

        /* renamed from: a */
        public ShareMessengerURLActionButton[] newArray(int i) {
            return new ShareMessengerURLActionButton[i];
        }
    };

    /* renamed from: a */
    private final Uri f8471a;

    /* renamed from: b */
    private final Uri f8472b;

    /* renamed from: c */
    private final boolean f8473c;

    /* renamed from: d */
    private final boolean f8474d;

    /* renamed from: e */
    private final C2735a f8475e;

    /* renamed from: com.facebook.share.model.ShareMessengerURLActionButton$a */
    public enum C2735a {
        WebviewHeightRatioFull,
        WebviewHeightRatioTall,
        WebviewHeightRatioCompact
    }

    ShareMessengerURLActionButton(Parcel parcel) {
        super(parcel);
        this.f8471a = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        boolean z = false;
        this.f8473c = parcel.readByte() != 0;
        this.f8472b = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.f8475e = (C2735a) parcel.readSerializable();
        if (parcel.readByte() != 0) {
            z = true;
        }
        this.f8474d = z;
    }
}
