package com.facebook.share.model;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;

public class CameraEffectTextures implements ShareModel {
    public static final Creator<CameraEffectTextures> CREATOR = new Creator<CameraEffectTextures>() {
        /* renamed from: a */
        public CameraEffectTextures createFromParcel(Parcel parcel) {
            return new CameraEffectTextures(parcel);
        }

        /* renamed from: a */
        public CameraEffectTextures[] newArray(int i) {
            return new CameraEffectTextures[i];
        }
    };
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Bundle f8415a;

    /* renamed from: com.facebook.share.model.CameraEffectTextures$a */
    public static class C2718a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public Bundle f8416a = new Bundle();

        /* renamed from: a */
        public C2718a mo9452a(CameraEffectTextures cameraEffectTextures) {
            if (cameraEffectTextures != null) {
                this.f8416a.putAll(cameraEffectTextures.f8415a);
            }
            return this;
        }

        /* renamed from: a */
        public C2718a mo9451a(Parcel parcel) {
            return mo9452a((CameraEffectTextures) parcel.readParcelable(CameraEffectTextures.class.getClassLoader()));
        }

        /* renamed from: a */
        public CameraEffectTextures mo9453a() {
            return new CameraEffectTextures(this);
        }
    }

    public int describeContents() {
        return 0;
    }

    private CameraEffectTextures(C2718a aVar) {
        this.f8415a = aVar.f8416a;
    }

    CameraEffectTextures(Parcel parcel) {
        this.f8415a = parcel.readBundle(getClass().getClassLoader());
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.f8415a);
    }
}
