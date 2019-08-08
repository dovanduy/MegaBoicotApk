package com.google.android.gms.common;

import android.util.Log;
import com.google.android.gms.common.util.C3545a;
import com.google.android.gms.common.util.C3558j;
import java.util.concurrent.Callable;
import javax.annotation.CheckReturnValue;
import javax.annotation.Nullable;

@CheckReturnValue
/* renamed from: com.google.android.gms.common.x */
class C3573x {

    /* renamed from: b */
    private static final C3573x f10195b = new C3573x(true, null, null);

    /* renamed from: a */
    final boolean f10196a;

    /* renamed from: c */
    private final String f10197c;

    /* renamed from: d */
    private final Throwable f10198d;

    C3573x(boolean z, @Nullable String str, @Nullable Throwable th) {
        this.f10196a = z;
        this.f10197c = str;
        this.f10198d = th;
    }

    /* renamed from: a */
    static C3573x m12785a() {
        return f10195b;
    }

    /* renamed from: a */
    static C3573x m12788a(Callable<String> callable) {
        return new C3575z(callable);
    }

    /* renamed from: a */
    static C3573x m12786a(String str) {
        return new C3573x(false, str, null);
    }

    /* renamed from: a */
    static C3573x m12787a(String str, Throwable th) {
        return new C3573x(false, str, th);
    }

    /* access modifiers changed from: 0000 */
    @Nullable
    /* renamed from: b */
    public String mo13700b() {
        return this.f10197c;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final void mo13701c() {
        if (!this.f10196a && Log.isLoggable("GoogleCertificatesRslt", 3)) {
            if (this.f10198d != null) {
                Log.d("GoogleCertificatesRslt", mo13700b(), this.f10198d);
                return;
            }
            Log.d("GoogleCertificatesRslt", mo13700b());
        }
    }

    /* renamed from: a */
    static String m12789a(String str, C3528q qVar, boolean z, boolean z2) {
        return String.format("%s: pkg=%s, sha1=%s, atk=%s, ver=%s", new Object[]{z2 ? "debug cert rejected" : "not whitelisted", str, C3558j.m12754a(C3545a.m12716a("SHA-1").digest(qVar.mo13629c())), Boolean.valueOf(z), "12451009.false"});
    }
}
