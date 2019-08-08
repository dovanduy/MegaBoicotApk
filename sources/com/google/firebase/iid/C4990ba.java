package com.google.firebase.iid;

import android.util.Base64;
import com.google.android.gms.common.internal.C3504r;
import java.security.KeyPair;

/* renamed from: com.google.firebase.iid.ba */
final class C4990ba {

    /* renamed from: a */
    private final KeyPair f16232a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final long f16233b;

    C4990ba(KeyPair keyPair, long j) {
        this.f16232a = keyPair;
        this.f16233b = j;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final KeyPair mo17939a() {
        return this.f16232a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C4990ba)) {
            return false;
        }
        C4990ba baVar = (C4990ba) obj;
        if (this.f16233b != baVar.f16233b || !this.f16232a.getPublic().equals(baVar.f16232a.getPublic()) || !this.f16232a.getPrivate().equals(baVar.f16232a.getPrivate())) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C3504r.m12548a(this.f16232a.getPublic(), this.f16232a.getPrivate(), Long.valueOf(this.f16233b));
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final String m21686b() {
        return Base64.encodeToString(this.f16232a.getPublic().getEncoded(), 11);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public final String m21689c() {
        return Base64.encodeToString(this.f16232a.getPrivate().getEncoded(), 11);
    }
}
