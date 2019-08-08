package com.startapp.android.publish.ads.list3d;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.animation.AnimationUtils;

/* compiled from: StartAppSDK */
public abstract class Dynamics implements Parcelable {

    /* renamed from: a */
    protected float f16538a;

    /* renamed from: b */
    protected float f16539b;

    /* renamed from: c */
    protected float f16540c = Float.MAX_VALUE;

    /* renamed from: d */
    protected float f16541d = -3.4028235E38f;

    /* renamed from: e */
    protected long f16542e = 0;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo18965a(int i);

    public int describeContents() {
        return 0;
    }

    public Dynamics() {
    }

    public Dynamics(Parcel parcel) {
        this.f16538a = parcel.readFloat();
        this.f16539b = parcel.readFloat();
        this.f16540c = parcel.readFloat();
        this.f16541d = parcel.readFloat();
        this.f16542e = AnimationUtils.currentAnimationTimeMillis();
    }

    /* renamed from: a */
    public void mo18964a(float f, float f2, long j) {
        this.f16539b = f2;
        this.f16538a = f;
        this.f16542e = j;
    }

    /* renamed from: a */
    public float mo18961a() {
        return this.f16538a;
    }

    /* renamed from: b */
    public float mo18968b() {
        return this.f16539b;
    }

    /* renamed from: a */
    public boolean mo18967a(float f, float f2) {
        boolean z = Math.abs(this.f16539b) < f;
        boolean z2 = this.f16538a - f2 < this.f16540c && this.f16538a + f2 > this.f16541d;
        if (!z || !z2) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public void mo18963a(float f) {
        this.f16540c = f;
    }

    /* renamed from: b */
    public void mo18969b(float f) {
        this.f16541d = f;
    }

    /* renamed from: a */
    public void mo18966a(long j) {
        if (this.f16542e != 0) {
            int i = (int) (j - this.f16542e);
            if (i > 50) {
                i = 50;
            }
            mo18965a(i);
        }
        this.f16542e = j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public float mo18970c() {
        if (this.f16538a > this.f16540c) {
            return this.f16540c - this.f16538a;
        }
        if (this.f16538a < this.f16541d) {
            return this.f16541d - this.f16538a;
        }
        return 0.0f;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.f16538a);
        parcel.writeFloat(this.f16539b);
        parcel.writeFloat(this.f16540c);
        parcel.writeFloat(this.f16541d);
    }

    /* renamed from: a */
    public void mo18962a(double d) {
        this.f16538a = (float) (((double) this.f16538a) * d);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Position: [");
        sb.append(this.f16538a);
        sb.append("], Velocity:[");
        sb.append(this.f16539b);
        sb.append("], MaxPos: [");
        sb.append(this.f16540c);
        sb.append("], mMinPos: [");
        sb.append(this.f16541d);
        sb.append("] LastTime:[");
        sb.append(this.f16542e);
        sb.append("]");
        return sb.toString();
    }
}
