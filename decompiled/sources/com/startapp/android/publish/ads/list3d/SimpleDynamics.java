package com.startapp.android.publish.ads.list3d;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

/* compiled from: StartAppSDK */
class SimpleDynamics extends Dynamics implements Parcelable {
    public static final Creator<SimpleDynamics> CREATOR = new Creator<SimpleDynamics>() {
        /* renamed from: a */
        public SimpleDynamics createFromParcel(Parcel parcel) {
            return new SimpleDynamics(parcel);
        }

        /* renamed from: a */
        public SimpleDynamics[] newArray(int i) {
            return new SimpleDynamics[i];
        }
    };

    /* renamed from: f */
    private float f16580f;

    /* renamed from: g */
    private float f16581g;

    public int describeContents() {
        return 0;
    }

    public SimpleDynamics(float f, float f2) {
        this.f16580f = f;
        this.f16581g = f2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo18965a(int i) {
        this.f16539b += mo18970c() * this.f16581g;
        this.f16538a += (this.f16539b * ((float) i)) / 1000.0f;
        this.f16539b *= this.f16580f;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeFloat(this.f16580f);
        parcel.writeFloat(this.f16581g);
    }

    public SimpleDynamics(Parcel parcel) {
        super(parcel);
        this.f16580f = parcel.readFloat();
        this.f16581g = parcel.readFloat();
    }

    /* renamed from: a */
    public void mo18962a(double d) {
        super.mo18962a(d);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", Friction: [");
        sb.append(this.f16580f);
        sb.append("], Snap:[");
        sb.append(this.f16581g);
        sb.append("]");
        return sb.toString();
    }
}
