package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;

public class ShareHashtag implements ShareModel {
    public static final Creator<ShareHashtag> CREATOR = new Creator<ShareHashtag>() {
        /* renamed from: a */
        public ShareHashtag createFromParcel(Parcel parcel) {
            return new ShareHashtag(parcel);
        }

        /* renamed from: a */
        public ShareHashtag[] newArray(int i) {
            return new ShareHashtag[i];
        }
    };

    /* renamed from: a */
    private final String f8441a;

    /* renamed from: com.facebook.share.model.ShareHashtag$a */
    public static class C2724a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public String f8442a;

        /* renamed from: a */
        public C2724a mo9475a(String str) {
            this.f8442a = str;
            return this;
        }

        /* renamed from: a */
        public C2724a mo9474a(ShareHashtag shareHashtag) {
            return shareHashtag == null ? this : mo9475a(shareHashtag.mo9466a());
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public C2724a mo9473a(Parcel parcel) {
            return mo9474a((ShareHashtag) parcel.readParcelable(ShareHashtag.class.getClassLoader()));
        }

        /* renamed from: a */
        public ShareHashtag mo9476a() {
            return new ShareHashtag(this);
        }
    }

    public int describeContents() {
        return 0;
    }

    private ShareHashtag(C2724a aVar) {
        this.f8441a = aVar.f8442a;
    }

    ShareHashtag(Parcel parcel) {
        this.f8441a = parcel.readString();
    }

    /* renamed from: a */
    public String mo9466a() {
        return this.f8441a;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f8441a);
    }
}
