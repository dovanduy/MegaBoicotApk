package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class AppGroupCreationContent implements ShareModel {
    public static final Creator<AppGroupCreationContent> CREATOR = new Creator<AppGroupCreationContent>() {
        /* renamed from: a */
        public AppGroupCreationContent createFromParcel(Parcel parcel) {
            return new AppGroupCreationContent(parcel);
        }

        /* renamed from: a */
        public AppGroupCreationContent[] newArray(int i) {
            return new AppGroupCreationContent[i];
        }
    };

    /* renamed from: a */
    private final String f8407a;

    /* renamed from: b */
    private final String f8408b;

    /* renamed from: c */
    private C2714a f8409c;

    /* renamed from: com.facebook.share.model.AppGroupCreationContent$a */
    public enum C2714a {
        Open,
        Closed
    }

    public int describeContents() {
        return 0;
    }

    AppGroupCreationContent(Parcel parcel) {
        this.f8407a = parcel.readString();
        this.f8408b = parcel.readString();
        this.f8409c = (C2714a) parcel.readSerializable();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f8407a);
        parcel.writeString(this.f8408b);
        parcel.writeSerializable(this.f8409c);
    }
}
