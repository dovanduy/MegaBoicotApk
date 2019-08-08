package com.google.firebase.iid;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.p143d.C3584h;

/* renamed from: com.google.firebase.iid.n */
abstract class C5002n<T> {

    /* renamed from: a */
    final int f16252a;

    /* renamed from: b */
    final C3584h<T> f16253b = new C3584h<>();

    /* renamed from: c */
    final int f16254c;

    /* renamed from: d */
    final Bundle f16255d;

    C5002n(int i, int i2, Bundle bundle) {
        this.f16252a = i;
        this.f16254c = i2;
        this.f16255d = bundle;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract void mo17957a(Bundle bundle);

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract boolean mo17958a();

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo17960a(T t) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(this);
            String valueOf2 = String.valueOf(t);
            StringBuilder sb = new StringBuilder(16 + String.valueOf(valueOf).length() + String.valueOf(valueOf2).length());
            sb.append("Finishing ");
            sb.append(valueOf);
            sb.append(" with ");
            sb.append(valueOf2);
            Log.d("MessengerIpcClient", sb.toString());
        }
        this.f16253b.mo13722a(t);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo17959a(C5003o oVar) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(this);
            String valueOf2 = String.valueOf(oVar);
            StringBuilder sb = new StringBuilder(14 + String.valueOf(valueOf).length() + String.valueOf(valueOf2).length());
            sb.append("Failing ");
            sb.append(valueOf);
            sb.append(" with ");
            sb.append(valueOf2);
            Log.d("MessengerIpcClient", sb.toString());
        }
        this.f16253b.mo13721a((Exception) oVar);
    }

    public String toString() {
        int i = this.f16254c;
        int i2 = this.f16252a;
        boolean a = mo17958a();
        StringBuilder sb = new StringBuilder(55);
        sb.append("Request { what=");
        sb.append(i);
        sb.append(" id=");
        sb.append(i2);
        sb.append(" oneWay=");
        sb.append(a);
        sb.append("}");
        return sb.toString();
    }
}
