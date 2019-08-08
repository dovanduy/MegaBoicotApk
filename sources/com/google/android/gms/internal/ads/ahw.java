package com.google.android.gms.internal.ads;

import java.util.HashMap;

public final class ahw extends afu<Integer, Long> {

    /* renamed from: a */
    public Long f11102a;

    /* renamed from: b */
    public Long f11103b;

    /* renamed from: c */
    public Long f11104c;

    public ahw() {
    }

    public ahw(String str) {
        mo14272a(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final HashMap<Integer, Long> mo14271a() {
        HashMap<Integer, Long> hashMap = new HashMap<>();
        hashMap.put(Integer.valueOf(0), this.f11102a);
        hashMap.put(Integer.valueOf(1), this.f11103b);
        hashMap.put(Integer.valueOf(2), this.f11104c);
        return hashMap;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo14272a(String str) {
        HashMap b = m14030b(str);
        if (b != null) {
            this.f11102a = (Long) b.get(Integer.valueOf(0));
            this.f11103b = (Long) b.get(Integer.valueOf(1));
            this.f11104c = (Long) b.get(Integer.valueOf(2));
        }
    }
}
