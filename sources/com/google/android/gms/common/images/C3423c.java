package com.google.android.gms.common.images;

import android.graphics.drawable.Drawable;
import com.google.android.gms.common.images.ImageManager.C3417a;
import com.google.android.gms.common.internal.C3504r;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.common.images.c */
public final class C3423c extends C3421a {

    /* renamed from: c */
    private WeakReference<C3417a> f9913c;

    public final int hashCode() {
        return C3504r.m12548a(this.f9910a);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C3423c)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        C3423c cVar = (C3423c) obj;
        C3417a aVar = (C3417a) this.f9913c.get();
        C3417a aVar2 = (C3417a) cVar.f9913c.get();
        return aVar2 != null && aVar != null && C3504r.m12550a(aVar2, aVar) && C3504r.m12550a(cVar.f9910a, this.f9910a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo13447a(Drawable drawable, boolean z, boolean z2, boolean z3) {
        if (!z2) {
            C3417a aVar = (C3417a) this.f9913c.get();
            if (aVar != null) {
                aVar.mo13435a(this.f9910a.f9912a, drawable, z3);
            }
        }
    }
}
