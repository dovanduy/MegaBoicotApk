package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C3513t;
import java.util.Iterator;

/* renamed from: com.google.android.gms.measurement.internal.c */
public final class C4795c {

    /* renamed from: a */
    final String f15572a;

    /* renamed from: b */
    final String f15573b;

    /* renamed from: c */
    final long f15574c;

    /* renamed from: d */
    final long f15575d;

    /* renamed from: e */
    final zzad f15576e;

    /* renamed from: f */
    private final String f15577f;

    private C4795c(C4764aw awVar, String str, String str2, String str3, long j, long j2, zzad zzad) {
        C3513t.m12627a(str2);
        C3513t.m12627a(str3);
        C3513t.m12625a(zzad);
        this.f15572a = str2;
        this.f15573b = str3;
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        this.f15577f = str;
        this.f15574c = j;
        this.f15575d = j2;
        if (this.f15575d != 0 && this.f15575d > this.f15574c) {
            awVar.mo17158r().mo17754i().mo17765a("Event created with reverse previous/current timestamps. appId, name", C4893r.m21360a(str2), C4893r.m21360a(str3));
        }
        this.f15576e = zzad;
    }

    C4795c(C4764aw awVar, String str, String str2, String str3, long j, long j2, Bundle bundle) {
        zzad zzad;
        C3513t.m12627a(str2);
        C3513t.m12627a(str3);
        this.f15572a = str2;
        this.f15573b = str3;
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        this.f15577f = str;
        this.f15574c = j;
        this.f15575d = j2;
        if (this.f15575d != 0 && this.f15575d > this.f15574c) {
            awVar.mo17158r().mo17754i().mo17764a("Event created with reverse previous/current timestamps. appId", C4893r.m21360a(str2));
        }
        if (bundle == null || bundle.isEmpty()) {
            zzad = new zzad(new Bundle());
        } else {
            Bundle bundle2 = new Bundle(bundle);
            Iterator it = bundle2.keySet().iterator();
            while (it.hasNext()) {
                String str4 = (String) it.next();
                if (str4 == null) {
                    awVar.mo17158r().mo17761y_().mo17763a("Param name can't be null");
                    it.remove();
                } else {
                    Object a = awVar.mo17248j().mo17488a(str4, bundle2.get(str4));
                    if (a == null) {
                        awVar.mo17158r().mo17754i().mo17764a("Param value can't be null", awVar.mo17249k().mo17747b(str4));
                        it.remove();
                    } else {
                        awVar.mo17248j().mo17491a(bundle2, str4, a);
                    }
                }
            }
            zzad = new zzad(bundle2);
        }
        this.f15576e = zzad;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final C4795c mo17306a(C4764aw awVar, long j) {
        C4795c cVar = new C4795c(awVar, this.f15577f, this.f15572a, this.f15573b, this.f15574c, j, this.f15576e);
        return cVar;
    }

    public final String toString() {
        String str = this.f15572a;
        String str2 = this.f15573b;
        String valueOf = String.valueOf(this.f15576e);
        StringBuilder sb = new StringBuilder(33 + String.valueOf(str).length() + String.valueOf(str2).length() + String.valueOf(valueOf).length());
        sb.append("Event{appId='");
        sb.append(str);
        sb.append("', name='");
        sb.append(str2);
        sb.append("', params=");
        sb.append(valueOf);
        sb.append('}');
        return sb.toString();
    }
}
