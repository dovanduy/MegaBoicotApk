package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;

/* renamed from: com.google.android.gms.common.internal.j */
public abstract class C3490j {

    /* renamed from: a */
    private static final Object f10064a = new Object();

    /* renamed from: b */
    private static C3490j f10065b;

    /* renamed from: com.google.android.gms.common.internal.j$a */
    protected static final class C3491a {

        /* renamed from: a */
        private final String f10066a;

        /* renamed from: b */
        private final String f10067b;

        /* renamed from: c */
        private final ComponentName f10068c = null;

        /* renamed from: d */
        private final int f10069d;

        public C3491a(String str, String str2, int i) {
            this.f10066a = C3513t.m12627a(str);
            this.f10067b = C3513t.m12627a(str2);
            this.f10069d = i;
        }

        public final String toString() {
            return this.f10066a == null ? this.f10068c.flattenToString() : this.f10066a;
        }

        /* renamed from: a */
        public final String mo13601a() {
            return this.f10067b;
        }

        /* renamed from: b */
        public final ComponentName mo13602b() {
            return this.f10068c;
        }

        /* renamed from: c */
        public final int mo13603c() {
            return this.f10069d;
        }

        /* renamed from: a */
        public final Intent mo13600a(Context context) {
            if (this.f10066a != null) {
                return new Intent(this.f10066a).setPackage(this.f10067b);
            }
            return new Intent().setComponent(this.f10068c);
        }

        public final int hashCode() {
            return C3504r.m12548a(this.f10066a, this.f10067b, this.f10068c, Integer.valueOf(this.f10069d));
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C3491a)) {
                return false;
            }
            C3491a aVar = (C3491a) obj;
            return C3504r.m12550a(this.f10066a, aVar.f10066a) && C3504r.m12550a(this.f10067b, aVar.f10067b) && C3504r.m12550a(this.f10068c, aVar.f10068c) && this.f10069d == aVar.f10069d;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract boolean mo13500a(C3491a aVar, ServiceConnection serviceConnection, String str);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo13501b(C3491a aVar, ServiceConnection serviceConnection, String str);

    /* renamed from: a */
    public static C3490j m12526a(Context context) {
        synchronized (f10064a) {
            if (f10065b == null) {
                f10065b = new C3453an(context.getApplicationContext());
            }
        }
        return f10065b;
    }

    /* renamed from: a */
    public final void mo13599a(String str, String str2, int i, ServiceConnection serviceConnection, String str3) {
        mo13501b(new C3491a(str, str2, i), serviceConnection, str3);
    }
}
