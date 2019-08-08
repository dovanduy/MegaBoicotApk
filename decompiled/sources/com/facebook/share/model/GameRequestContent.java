package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.List;

public final class GameRequestContent implements ShareModel {
    public static final Creator<GameRequestContent> CREATOR = new Creator<GameRequestContent>() {
        /* renamed from: a */
        public GameRequestContent createFromParcel(Parcel parcel) {
            return new GameRequestContent(parcel);
        }

        /* renamed from: a */
        public GameRequestContent[] newArray(int i) {
            return new GameRequestContent[i];
        }
    };

    /* renamed from: a */
    private final String f8417a;

    /* renamed from: b */
    private final List<String> f8418b;

    /* renamed from: c */
    private final String f8419c;

    /* renamed from: d */
    private final String f8420d;

    /* renamed from: e */
    private final C2720a f8421e;

    /* renamed from: f */
    private final String f8422f;

    /* renamed from: g */
    private final C2721b f8423g;

    /* renamed from: h */
    private final List<String> f8424h;

    /* renamed from: com.facebook.share.model.GameRequestContent$a */
    public enum C2720a {
        SEND,
        ASKFOR,
        TURN
    }

    /* renamed from: com.facebook.share.model.GameRequestContent$b */
    public enum C2721b {
        APP_USERS,
        APP_NON_USERS
    }

    public int describeContents() {
        return 0;
    }

    GameRequestContent(Parcel parcel) {
        this.f8417a = parcel.readString();
        this.f8418b = parcel.createStringArrayList();
        this.f8419c = parcel.readString();
        this.f8420d = parcel.readString();
        this.f8421e = (C2720a) parcel.readSerializable();
        this.f8422f = parcel.readString();
        this.f8423g = (C2721b) parcel.readSerializable();
        this.f8424h = parcel.createStringArrayList();
        parcel.readStringList(this.f8424h);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f8417a);
        parcel.writeStringList(this.f8418b);
        parcel.writeString(this.f8419c);
        parcel.writeString(this.f8420d);
        parcel.writeSerializable(this.f8421e);
        parcel.writeString(this.f8422f);
        parcel.writeSerializable(this.f8423g);
        parcel.writeStringList(this.f8424h);
    }
}
