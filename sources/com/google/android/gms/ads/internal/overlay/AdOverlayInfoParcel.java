package com.google.android.gms.ads.internal.overlay;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.ads.internal.gmsg.C3081k;
import com.google.android.gms.ads.internal.gmsg.C3083m;
import com.google.android.gms.ads.internal.zzaq;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3511b;
import com.google.android.gms.internal.ads.C3718cm;
import com.google.android.gms.internal.ads.C4089qe;
import com.google.android.gms.internal.ads.anw;
import com.google.android.gms.internal.ads.zzang;
import com.google.android.gms.p137b.C3235a.C3236a;
import com.google.android.gms.p137b.C3238b;

@C3718cm
public final class AdOverlayInfoParcel extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Creator<AdOverlayInfoParcel> CREATOR = new C3116l();

    /* renamed from: a */
    public final zzc f9063a;

    /* renamed from: b */
    public final anw f9064b;

    /* renamed from: c */
    public final C3117m f9065c;

    /* renamed from: d */
    public final C4089qe f9066d;

    /* renamed from: e */
    public final C3083m f9067e;

    /* renamed from: f */
    public final String f9068f;

    /* renamed from: g */
    public final boolean f9069g;

    /* renamed from: h */
    public final String f9070h;

    /* renamed from: i */
    public final C3123s f9071i;

    /* renamed from: j */
    public final int f9072j;

    /* renamed from: k */
    public final int f9073k;

    /* renamed from: l */
    public final String f9074l;

    /* renamed from: m */
    public final zzang f9075m;

    /* renamed from: n */
    public final String f9076n;

    /* renamed from: o */
    public final zzaq f9077o;

    /* renamed from: p */
    public final C3081k f9078p;

    AdOverlayInfoParcel(zzc zzc, IBinder iBinder, IBinder iBinder2, IBinder iBinder3, IBinder iBinder4, String str, boolean z, String str2, IBinder iBinder5, int i, int i2, String str3, zzang zzang, String str4, zzaq zzaq, IBinder iBinder6) {
        this.f9063a = zzc;
        this.f9064b = (anw) C3238b.m11574a(C3236a.m11572a(iBinder));
        this.f9065c = (C3117m) C3238b.m11574a(C3236a.m11572a(iBinder2));
        this.f9066d = (C4089qe) C3238b.m11574a(C3236a.m11572a(iBinder3));
        this.f9078p = (C3081k) C3238b.m11574a(C3236a.m11572a(iBinder6));
        this.f9067e = (C3083m) C3238b.m11574a(C3236a.m11572a(iBinder4));
        this.f9068f = str;
        this.f9069g = z;
        this.f9070h = str2;
        this.f9071i = (C3123s) C3238b.m11574a(C3236a.m11572a(iBinder5));
        this.f9072j = i;
        this.f9073k = i2;
        this.f9074l = str3;
        this.f9075m = zzang;
        this.f9076n = str4;
        this.f9077o = zzaq;
    }

    public AdOverlayInfoParcel(zzc zzc, anw anw, C3117m mVar, C3123s sVar, zzang zzang) {
        this.f9063a = zzc;
        this.f9064b = anw;
        this.f9065c = mVar;
        this.f9066d = null;
        this.f9078p = null;
        this.f9067e = null;
        this.f9068f = null;
        this.f9069g = false;
        this.f9070h = null;
        this.f9071i = sVar;
        this.f9072j = -1;
        this.f9073k = 4;
        this.f9074l = null;
        this.f9075m = zzang;
        this.f9076n = null;
        this.f9077o = null;
    }

    public AdOverlayInfoParcel(anw anw, C3117m mVar, C3081k kVar, C3083m mVar2, C3123s sVar, C4089qe qeVar, boolean z, int i, String str, zzang zzang) {
        this.f9063a = null;
        this.f9064b = anw;
        this.f9065c = mVar;
        this.f9066d = qeVar;
        this.f9078p = kVar;
        this.f9067e = mVar2;
        this.f9068f = null;
        this.f9069g = z;
        this.f9070h = null;
        this.f9071i = sVar;
        this.f9072j = i;
        this.f9073k = 3;
        this.f9074l = str;
        this.f9075m = zzang;
        this.f9076n = null;
        this.f9077o = null;
    }

    public AdOverlayInfoParcel(anw anw, C3117m mVar, C3081k kVar, C3083m mVar2, C3123s sVar, C4089qe qeVar, boolean z, int i, String str, String str2, zzang zzang) {
        this.f9063a = null;
        this.f9064b = anw;
        this.f9065c = mVar;
        this.f9066d = qeVar;
        this.f9078p = kVar;
        this.f9067e = mVar2;
        this.f9068f = str2;
        this.f9069g = z;
        this.f9070h = str;
        this.f9071i = sVar;
        this.f9072j = i;
        this.f9073k = 3;
        this.f9074l = null;
        this.f9075m = zzang;
        this.f9076n = null;
        this.f9077o = null;
    }

    public AdOverlayInfoParcel(anw anw, C3117m mVar, C3123s sVar, C4089qe qeVar, int i, zzang zzang, String str, zzaq zzaq) {
        this.f9063a = null;
        this.f9064b = anw;
        this.f9065c = mVar;
        this.f9066d = qeVar;
        this.f9078p = null;
        this.f9067e = null;
        this.f9068f = null;
        this.f9069g = false;
        this.f9070h = null;
        this.f9071i = sVar;
        this.f9072j = i;
        this.f9073k = 1;
        this.f9074l = null;
        this.f9075m = zzang;
        this.f9076n = str;
        this.f9077o = zzaq;
    }

    public AdOverlayInfoParcel(anw anw, C3117m mVar, C3123s sVar, C4089qe qeVar, boolean z, int i, zzang zzang) {
        this.f9063a = null;
        this.f9064b = anw;
        this.f9065c = mVar;
        this.f9066d = qeVar;
        this.f9078p = null;
        this.f9067e = null;
        this.f9068f = null;
        this.f9069g = z;
        this.f9070h = null;
        this.f9071i = sVar;
        this.f9072j = i;
        this.f9073k = 2;
        this.f9074l = null;
        this.f9075m = zzang;
        this.f9076n = null;
        this.f9077o = null;
    }

    /* renamed from: a */
    public static AdOverlayInfoParcel m11171a(Intent intent) {
        try {
            Bundle bundleExtra = intent.getBundleExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
            bundleExtra.setClassLoader(AdOverlayInfoParcel.class.getClassLoader());
            return (AdOverlayInfoParcel) bundleExtra.getParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static void m11172a(Intent intent, AdOverlayInfoParcel adOverlayInfoParcel) {
        Bundle bundle = new Bundle(1);
        bundle.putParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", adOverlayInfoParcel);
        intent.putExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", bundle);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3511b.m12595a(parcel);
        C3511b.m12604a(parcel, 2, (Parcelable) this.f9063a, i, false);
        C3511b.m12602a(parcel, 3, C3238b.m11573a(this.f9064b).asBinder(), false);
        C3511b.m12602a(parcel, 4, C3238b.m11573a(this.f9065c).asBinder(), false);
        C3511b.m12602a(parcel, 5, C3238b.m11573a(this.f9066d).asBinder(), false);
        C3511b.m12602a(parcel, 6, C3238b.m11573a(this.f9067e).asBinder(), false);
        C3511b.m12609a(parcel, 7, this.f9068f, false);
        C3511b.m12612a(parcel, 8, this.f9069g);
        C3511b.m12609a(parcel, 9, this.f9070h, false);
        C3511b.m12602a(parcel, 10, C3238b.m11573a(this.f9071i).asBinder(), false);
        C3511b.m12599a(parcel, 11, this.f9072j);
        C3511b.m12599a(parcel, 12, this.f9073k);
        C3511b.m12609a(parcel, 13, this.f9074l, false);
        C3511b.m12604a(parcel, 14, (Parcelable) this.f9075m, i, false);
        C3511b.m12609a(parcel, 16, this.f9076n, false);
        C3511b.m12604a(parcel, 17, (Parcelable) this.f9077o, i, false);
        C3511b.m12602a(parcel, 18, C3238b.m11573a(this.f9078p).asBinder(), false);
        C3511b.m12596a(parcel, a);
    }
}
