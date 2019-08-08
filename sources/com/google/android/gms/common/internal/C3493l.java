package com.google.android.gms.common.internal;

import android.content.Context;
import android.util.SparseIntArray;
import com.google.android.gms.common.C3405c;
import com.google.android.gms.common.C3407d;
import com.google.android.gms.common.api.C3244a.C3255f;

/* renamed from: com.google.android.gms.common.internal.l */
public class C3493l {

    /* renamed from: a */
    private final SparseIntArray f10074a;

    /* renamed from: b */
    private C3407d f10075b;

    public C3493l() {
        this(C3405c.m12234a());
    }

    public C3493l(C3407d dVar) {
        this.f10074a = new SparseIntArray();
        C3513t.m12625a(dVar);
        this.f10075b = dVar;
    }

    /* renamed from: a */
    public int mo13607a(Context context, C3255f fVar) {
        C3513t.m12625a(context);
        C3513t.m12625a(fVar);
        if (!fVar.mo13102k()) {
            return 0;
        }
        int f = fVar.mo13019f();
        int i = this.f10074a.get(f, -1);
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        while (true) {
            if (i2 >= this.f10074a.size()) {
                break;
            }
            int keyAt = this.f10074a.keyAt(i2);
            if (keyAt > f && this.f10074a.get(keyAt) == 0) {
                i = 0;
                break;
            }
            i2++;
        }
        if (i == -1) {
            i = this.f10075b.mo13408b(context, f);
        }
        this.f10074a.put(f, i);
        return i;
    }

    /* renamed from: a */
    public void mo13608a() {
        this.f10074a.clear();
    }
}
