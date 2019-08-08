package com.google.android.gms.internal.ads;

import java.util.HashMap;

public final class ahu extends afu<Integer, Long> {

    /* renamed from: a */
    public Long f11090a;

    /* renamed from: b */
    public Long f11091b;

    /* renamed from: c */
    public Long f11092c;

    /* renamed from: d */
    public Long f11093d;

    /* renamed from: e */
    public Long f11094e;

    /* renamed from: f */
    public Long f11095f;

    /* renamed from: g */
    public Long f11096g;

    /* renamed from: h */
    public Long f11097h;

    /* renamed from: i */
    public Long f11098i;

    /* renamed from: j */
    public Long f11099j;

    /* renamed from: k */
    public Long f11100k;

    public ahu() {
    }

    public ahu(String str) {
        mo14272a(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final HashMap<Integer, Long> mo14271a() {
        HashMap<Integer, Long> hashMap = new HashMap<>();
        hashMap.put(Integer.valueOf(0), this.f11090a);
        hashMap.put(Integer.valueOf(1), this.f11091b);
        hashMap.put(Integer.valueOf(2), this.f11092c);
        hashMap.put(Integer.valueOf(3), this.f11093d);
        hashMap.put(Integer.valueOf(4), this.f11094e);
        hashMap.put(Integer.valueOf(5), this.f11095f);
        hashMap.put(Integer.valueOf(6), this.f11096g);
        hashMap.put(Integer.valueOf(7), this.f11097h);
        hashMap.put(Integer.valueOf(8), this.f11098i);
        hashMap.put(Integer.valueOf(9), this.f11099j);
        hashMap.put(Integer.valueOf(10), this.f11100k);
        return hashMap;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo14272a(String str) {
        HashMap b = m14030b(str);
        if (b != null) {
            this.f11090a = (Long) b.get(Integer.valueOf(0));
            this.f11091b = (Long) b.get(Integer.valueOf(1));
            this.f11092c = (Long) b.get(Integer.valueOf(2));
            this.f11093d = (Long) b.get(Integer.valueOf(3));
            this.f11094e = (Long) b.get(Integer.valueOf(4));
            this.f11095f = (Long) b.get(Integer.valueOf(5));
            this.f11096g = (Long) b.get(Integer.valueOf(6));
            this.f11097h = (Long) b.get(Integer.valueOf(7));
            this.f11098i = (Long) b.get(Integer.valueOf(8));
            this.f11099j = (Long) b.get(Integer.valueOf(9));
            this.f11100k = (Long) b.get(Integer.valueOf(10));
        }
    }
}
