package com.google.android.gms.common;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.C3458as;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3511b;
import com.google.android.gms.p137b.C3235a;
import com.google.android.gms.p137b.C3238b;
import javax.annotation.Nullable;

public final class zzk extends AbstractSafeParcelable {
    public static final Creator<zzk> CREATOR = new C3572w();

    /* renamed from: a */
    private final String f10200a;
    @Nullable

    /* renamed from: b */
    private final C3528q f10201b;

    /* renamed from: c */
    private final boolean f10202c;

    /* renamed from: d */
    private final boolean f10203d;

    zzk(String str, @Nullable IBinder iBinder, boolean z, boolean z2) {
        this.f10200a = str;
        this.f10201b = m12793a(iBinder);
        this.f10202c = z;
        this.f10203d = z2;
    }

    zzk(String str, @Nullable C3528q qVar, boolean z, boolean z2) {
        this.f10200a = str;
        this.f10201b = qVar;
        this.f10202c = z;
        this.f10203d = z2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        IBinder iBinder;
        int a = C3511b.m12595a(parcel);
        C3511b.m12609a(parcel, 1, this.f10200a, false);
        if (this.f10201b == null) {
            Log.w("GoogleCertificatesQuery", "certificate binder is null");
            iBinder = null;
        } else {
            iBinder = this.f10201b.asBinder();
        }
        C3511b.m12602a(parcel, 2, iBinder, false);
        C3511b.m12612a(parcel, 3, this.f10202c);
        C3511b.m12612a(parcel, 4, this.f10203d);
        C3511b.m12596a(parcel, a);
    }

    @Nullable
    /* renamed from: a */
    private static C3528q m12793a(@Nullable IBinder iBinder) {
        byte[] bArr;
        C3529r rVar = null;
        if (iBinder == null) {
            return null;
        }
        try {
            C3235a a = C3458as.m12379a(iBinder).mo13519a();
            if (a == null) {
                bArr = null;
            } else {
                bArr = (byte[]) C3238b.m11574a(a);
            }
            if (bArr != null) {
                rVar = new C3529r(bArr);
            } else {
                Log.e("GoogleCertificatesQuery", "Could not unwrap certificate");
            }
            return rVar;
        } catch (RemoteException e) {
            Log.e("GoogleCertificatesQuery", "Could not unwrap certificate", e);
            return null;
        }
    }
}
