package com.facebook.ads.internal.view.p104d;

import android.util.SparseArray;

/* renamed from: com.facebook.ads.internal.view.d.a */
public class C2034a {

    /* renamed from: a */
    private final SparseArray<int[]> f6438a = new SparseArray<>();

    /* renamed from: a */
    public void mo8249a(int i, int[] iArr) {
        this.f6438a.put(i, iArr);
    }

    /* renamed from: a */
    public int[] mo8250a(int i) {
        return (int[]) this.f6438a.get(i);
    }

    /* renamed from: b */
    public boolean mo8251b(int i) {
        return this.f6438a.indexOfKey(i) >= 0;
    }
}
