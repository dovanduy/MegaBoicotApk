package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.facebook.share.model.ShareOpenGraphAction.C2737a;

public final class ShareOpenGraphContent extends ShareContent<ShareOpenGraphContent, Object> {
    public static final Creator<ShareOpenGraphContent> CREATOR = new Creator<ShareOpenGraphContent>() {
        /* renamed from: a */
        public ShareOpenGraphContent createFromParcel(Parcel parcel) {
            return new ShareOpenGraphContent(parcel);
        }

        /* renamed from: a */
        public ShareOpenGraphContent[] newArray(int i) {
            return new ShareOpenGraphContent[i];
        }
    };

    /* renamed from: a */
    private final ShareOpenGraphAction f8480a;

    /* renamed from: b */
    private final String f8481b;

    public int describeContents() {
        return 0;
    }

    ShareOpenGraphContent(Parcel parcel) {
        super(parcel);
        this.f8480a = new C2737a().mo9520a(parcel).mo9523a();
        this.f8481b = parcel.readString();
    }

    /* renamed from: c */
    public ShareOpenGraphAction mo9525c() {
        return this.f8480a;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.f8480a, 0);
        parcel.writeString(this.f8481b);
    }
}
