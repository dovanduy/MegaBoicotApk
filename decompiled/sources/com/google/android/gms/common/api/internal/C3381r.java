package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.C3260b;
import com.google.android.gms.common.api.C3270g.C3271a;
import com.google.android.gms.common.api.C3391k;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.p143d.C3584h;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.WeakHashMap;

/* renamed from: com.google.android.gms.common.api.internal.r */
public final class C3381r {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Map<BasePendingResult<?>, Boolean> f9796a = Collections.synchronizedMap(new WeakHashMap());

    /* renamed from: b */
    private final Map<C3584h<?>, Boolean> f9797b = Collections.synchronizedMap(new WeakHashMap());

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo13364a(BasePendingResult<? extends C3391k> basePendingResult, boolean z) {
        this.f9796a.put(basePendingResult, Boolean.valueOf(z));
        basePendingResult.mo13155a((C3271a) new C3382s(this, basePendingResult));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo13365a() {
        return !this.f9796a.isEmpty() || !this.f9797b.isEmpty();
    }

    /* renamed from: b */
    public final void mo13366b() {
        m12137a(false, C3360d.f9738a);
    }

    /* renamed from: c */
    public final void mo13367c() {
        m12137a(true, C3327bv.f9643a);
    }

    /* renamed from: a */
    private final void m12137a(boolean z, Status status) {
        HashMap hashMap;
        HashMap hashMap2;
        synchronized (this.f9796a) {
            hashMap = new HashMap(this.f9796a);
        }
        synchronized (this.f9797b) {
            hashMap2 = new HashMap(this.f9797b);
        }
        for (Entry entry : hashMap.entrySet()) {
            if (z || ((Boolean) entry.getValue()).booleanValue()) {
                ((BasePendingResult) entry.getKey()).mo13163c(status);
            }
        }
        for (Entry entry2 : hashMap2.entrySet()) {
            if (z || ((Boolean) entry2.getValue()).booleanValue()) {
                ((C3584h) entry2.getKey()).mo13723b((Exception) new C3260b(status));
            }
        }
    }
}
