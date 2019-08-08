package com.google.android.gms.internal.ads;

import java.util.HashMap;

public final class ahm extends afu<Integer, Long> {

    /* renamed from: a */
    public Long f11054a;

    /* renamed from: b */
    public Long f11055b;

    public ahm() {
    }

    public ahm(String str) {
        mo14272a(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final HashMap<Integer, Long> mo14271a() {
        HashMap<Integer, Long> hashMap = new HashMap<>();
        hashMap.put(Integer.valueOf(0), this.f11054a);
        hashMap.put(Integer.valueOf(1), this.f11055b);
        return hashMap;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo14272a(String str) {
        HashMap b = m14030b(str);
        if (b != null) {
            this.f11054a = (Long) b.get(Integer.valueOf(0));
            this.f11055b = (Long) b.get(Integer.valueOf(1));
        }
    }
}
