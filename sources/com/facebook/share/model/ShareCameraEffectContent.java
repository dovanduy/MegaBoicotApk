package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.facebook.share.model.CameraEffectArguments.C2716a;
import com.facebook.share.model.CameraEffectTextures.C2718a;

public class ShareCameraEffectContent extends ShareContent<ShareCameraEffectContent, Object> {
    public static final Creator<ShareCameraEffectContent> CREATOR = new Creator<ShareCameraEffectContent>() {
        /* renamed from: a */
        public ShareCameraEffectContent createFromParcel(Parcel parcel) {
            return new ShareCameraEffectContent(parcel);
        }

        /* renamed from: a */
        public ShareCameraEffectContent[] newArray(int i) {
            return new ShareCameraEffectContent[i];
        }
    };

    /* renamed from: a */
    private String f8432a;

    /* renamed from: b */
    private CameraEffectArguments f8433b;

    /* renamed from: c */
    private CameraEffectTextures f8434c;

    ShareCameraEffectContent(Parcel parcel) {
        super(parcel);
        this.f8432a = parcel.readString();
        this.f8433b = new C2716a().mo9442a(parcel).mo9444a();
        this.f8434c = new C2718a().mo9451a(parcel).mo9453a();
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.f8432a);
        parcel.writeParcelable(this.f8433b, 0);
        parcel.writeParcelable(this.f8434c, 0);
    }
}
