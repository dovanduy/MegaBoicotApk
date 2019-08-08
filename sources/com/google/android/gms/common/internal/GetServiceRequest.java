package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.C3407d;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.C3494m.C3495a;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3511b;

public class GetServiceRequest extends AbstractSafeParcelable {
    public static final Creator<GetServiceRequest> CREATOR = new C3452am();

    /* renamed from: a */
    String f9927a;

    /* renamed from: b */
    IBinder f9928b;

    /* renamed from: c */
    Scope[] f9929c;

    /* renamed from: d */
    Bundle f9930d;

    /* renamed from: e */
    Account f9931e;

    /* renamed from: f */
    Feature[] f9932f;

    /* renamed from: g */
    Feature[] f9933g;

    /* renamed from: h */
    private final int f9934h;

    /* renamed from: i */
    private final int f9935i;

    /* renamed from: j */
    private int f9936j;

    /* renamed from: k */
    private boolean f9937k;

    public GetServiceRequest(int i) {
        this.f9934h = 4;
        this.f9936j = C3407d.f9849b;
        this.f9935i = i;
        this.f9937k = true;
    }

    GetServiceRequest(int i, int i2, int i3, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, Feature[] featureArr, Feature[] featureArr2, boolean z) {
        this.f9934h = i;
        this.f9935i = i2;
        this.f9936j = i3;
        if ("com.google.android.gms".equals(str)) {
            this.f9927a = "com.google.android.gms";
        } else {
            this.f9927a = str;
        }
        if (i < 2) {
            Account account2 = null;
            if (iBinder != null) {
                account2 = C3425a.m12329a(C3495a.m12537a(iBinder));
            }
            this.f9931e = account2;
        } else {
            this.f9928b = iBinder;
            this.f9931e = account;
        }
        this.f9929c = scopeArr;
        this.f9930d = bundle;
        this.f9932f = featureArr;
        this.f9933g = featureArr2;
        this.f9937k = z;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C3511b.m12595a(parcel);
        C3511b.m12599a(parcel, 1, this.f9934h);
        C3511b.m12599a(parcel, 2, this.f9935i);
        C3511b.m12599a(parcel, 3, this.f9936j);
        C3511b.m12609a(parcel, 4, this.f9927a, false);
        C3511b.m12602a(parcel, 5, this.f9928b, false);
        C3511b.m12614a(parcel, 6, (T[]) this.f9929c, i, false);
        C3511b.m12601a(parcel, 7, this.f9930d, false);
        C3511b.m12604a(parcel, 8, (Parcelable) this.f9931e, i, false);
        C3511b.m12614a(parcel, 10, (T[]) this.f9932f, i, false);
        C3511b.m12614a(parcel, 11, (T[]) this.f9933g, i, false);
        C3511b.m12612a(parcel, 12, this.f9937k);
        C3511b.m12596a(parcel, a);
    }
}
