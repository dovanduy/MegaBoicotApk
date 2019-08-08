package com.google.android.gms.ads.internal;

import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.internal.ads.aoq;
import com.google.android.gms.internal.ads.aru;
import com.google.android.gms.internal.ads.zzang;
import com.google.android.gms.internal.ads.zzjj;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: com.google.android.gms.ads.internal.av */
final class C3024av {

    /* renamed from: a */
    private final String f8799a;

    /* renamed from: b */
    private final Map<String, String> f8800b = new TreeMap();

    /* renamed from: c */
    private String f8801c;

    /* renamed from: d */
    private String f8802d;

    public C3024av(String str) {
        this.f8799a = str;
    }

    /* renamed from: a */
    public final String mo12516a() {
        return this.f8802d;
    }

    /* renamed from: a */
    public final void mo12517a(zzjj zzjj, zzang zzang) {
        this.f8801c = zzjj.f14534j.f14556a;
        Bundle bundle = zzjj.f14537m != null ? zzjj.f14537m.getBundle(AdMobAdapter.class.getName()) : null;
        if (bundle != null) {
            String str = (String) aoq.m14620f().mo14695a(aru.f11932cy);
            for (String str2 : bundle.keySet()) {
                if (str.equals(str2)) {
                    this.f8802d = bundle.getString(str2);
                } else if (str2.startsWith("csa_")) {
                    this.f8800b.put(str2.substring(4), bundle.getString(str2));
                }
            }
            this.f8800b.put("SDKVersion", zzang.f14505a);
        }
    }

    /* renamed from: b */
    public final String mo12518b() {
        return this.f8801c;
    }

    /* renamed from: c */
    public final String mo12519c() {
        return this.f8799a;
    }

    /* renamed from: d */
    public final Map<String, String> mo12520d() {
        return this.f8800b;
    }
}
