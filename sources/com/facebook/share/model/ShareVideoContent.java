package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.facebook.share.model.SharePhoto.C2742a;
import com.facebook.share.model.ShareVideo.C2745a;

public final class ShareVideoContent extends ShareContent<ShareVideoContent, Object> implements ShareModel {
    public static final Creator<ShareVideoContent> CREATOR = new Creator<ShareVideoContent>() {
        /* renamed from: a */
        public ShareVideoContent createFromParcel(Parcel parcel) {
            return new ShareVideoContent(parcel);
        }

        /* renamed from: a */
        public ShareVideoContent[] newArray(int i) {
            return new ShareVideoContent[i];
        }
    };

    /* renamed from: a */
    private final String f8495a;

    /* renamed from: b */
    private final String f8496b;

    /* renamed from: c */
    private final SharePhoto f8497c;

    /* renamed from: d */
    private final ShareVideo f8498d;

    public int describeContents() {
        return 0;
    }

    ShareVideoContent(Parcel parcel) {
        super(parcel);
        this.f8495a = parcel.readString();
        this.f8496b = parcel.readString();
        C2742a b = new C2742a().mo9556b(parcel);
        if (b.mo9549a() == null && b.mo9555b() == null) {
            this.f8497c = null;
        } else {
            this.f8497c = b.mo9557c();
        }
        this.f8498d = new C2745a().mo9570b(parcel).mo9569a();
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.f8495a);
        parcel.writeString(this.f8496b);
        parcel.writeParcelable(this.f8497c, 0);
        parcel.writeParcelable(this.f8498d, 0);
    }
}
