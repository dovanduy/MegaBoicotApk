package com.facebook.share.model;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;

public class CameraEffectArguments implements ShareModel {
    public static final Creator<CameraEffectArguments> CREATOR = new Creator<CameraEffectArguments>() {
        /* renamed from: a */
        public CameraEffectArguments createFromParcel(Parcel parcel) {
            return new CameraEffectArguments(parcel);
        }

        /* renamed from: a */
        public CameraEffectArguments[] newArray(int i) {
            return new CameraEffectArguments[i];
        }
    };
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Bundle f8413a;

    /* renamed from: com.facebook.share.model.CameraEffectArguments$a */
    public static class C2716a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public Bundle f8414a = new Bundle();

        /* renamed from: a */
        public C2716a mo9443a(CameraEffectArguments cameraEffectArguments) {
            if (cameraEffectArguments != null) {
                this.f8414a.putAll(cameraEffectArguments.f8413a);
            }
            return this;
        }

        /* renamed from: a */
        public C2716a mo9442a(Parcel parcel) {
            return mo9443a((CameraEffectArguments) parcel.readParcelable(CameraEffectArguments.class.getClassLoader()));
        }

        /* renamed from: a */
        public CameraEffectArguments mo9444a() {
            return new CameraEffectArguments(this);
        }
    }

    public int describeContents() {
        return 0;
    }

    private CameraEffectArguments(C2716a aVar) {
        this.f8413a = aVar.f8414a;
    }

    CameraEffectArguments(Parcel parcel) {
        this.f8413a = parcel.readBundle(getClass().getClassLoader());
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.f8413a);
    }
}
