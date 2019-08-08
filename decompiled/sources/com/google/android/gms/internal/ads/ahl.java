package com.google.android.gms.internal.ads;

import java.util.HashMap;

public final class ahl extends afu<Integer, Object> {

    /* renamed from: a */
    public Long f11051a;

    /* renamed from: b */
    public Boolean f11052b;

    /* renamed from: c */
    public Boolean f11053c;

    public ahl() {
    }

    public ahl(String str) {
        mo14272a(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final HashMap<Integer, Object> mo14271a() {
        HashMap<Integer, Object> hashMap = new HashMap<>();
        hashMap.put(Integer.valueOf(0), this.f11051a);
        hashMap.put(Integer.valueOf(1), this.f11052b);
        hashMap.put(Integer.valueOf(2), this.f11053c);
        return hashMap;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo14272a(String str) {
        HashMap b = m14030b(str);
        if (b != null) {
            this.f11051a = (Long) b.get(Integer.valueOf(0));
            this.f11052b = (Boolean) b.get(Integer.valueOf(1));
            this.f11053c = (Boolean) b.get(Integer.valueOf(2));
        }
    }
}
