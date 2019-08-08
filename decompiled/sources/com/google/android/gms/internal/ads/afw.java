package com.google.android.gms.internal.ads;

import java.util.HashMap;

public final class afw extends afu<Integer, Object> {

    /* renamed from: a */
    public String f10766a;

    /* renamed from: b */
    public long f10767b;

    /* renamed from: c */
    public String f10768c;

    /* renamed from: d */
    public String f10769d;

    /* renamed from: e */
    public String f10770e;

    public afw() {
        this.f10766a = "E";
        this.f10767b = -1;
        this.f10768c = "E";
        this.f10769d = "E";
        this.f10770e = "E";
    }

    public afw(String str) {
        this();
        mo14272a(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final HashMap<Integer, Object> mo14271a() {
        HashMap<Integer, Object> hashMap = new HashMap<>();
        hashMap.put(Integer.valueOf(0), this.f10766a);
        hashMap.put(Integer.valueOf(4), this.f10770e);
        hashMap.put(Integer.valueOf(3), this.f10769d);
        hashMap.put(Integer.valueOf(2), this.f10768c);
        hashMap.put(Integer.valueOf(1), Long.valueOf(this.f10767b));
        return hashMap;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo14272a(String str) {
        HashMap b = m14030b(str);
        if (b != null) {
            this.f10766a = b.get(Integer.valueOf(0)) == null ? "E" : (String) b.get(Integer.valueOf(0));
            this.f10767b = b.get(Integer.valueOf(1)) == null ? -1 : ((Long) b.get(Integer.valueOf(1))).longValue();
            this.f10768c = b.get(Integer.valueOf(2)) == null ? "E" : (String) b.get(Integer.valueOf(2));
            this.f10769d = b.get(Integer.valueOf(3)) == null ? "E" : (String) b.get(Integer.valueOf(3));
            this.f10770e = b.get(Integer.valueOf(4)) == null ? "E" : (String) b.get(Integer.valueOf(4));
        }
    }
}
