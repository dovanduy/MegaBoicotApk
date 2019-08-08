package com.google.android.gms.internal.ads;

import java.util.HashMap;

public final class aha extends afu<Integer, Long> {

    /* renamed from: a */
    public long f11037a;

    /* renamed from: b */
    public long f11038b;

    public aha() {
        this.f11037a = -1;
        this.f11038b = -1;
    }

    public aha(String str) {
        this();
        mo14272a(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final HashMap<Integer, Long> mo14271a() {
        HashMap<Integer, Long> hashMap = new HashMap<>();
        hashMap.put(Integer.valueOf(0), Long.valueOf(this.f11037a));
        hashMap.put(Integer.valueOf(1), Long.valueOf(this.f11038b));
        return hashMap;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo14272a(String str) {
        HashMap b = m14030b(str);
        if (b != null) {
            this.f11037a = ((Long) b.get(Integer.valueOf(0))).longValue();
            this.f11038b = ((Long) b.get(Integer.valueOf(1))).longValue();
        }
    }
}
