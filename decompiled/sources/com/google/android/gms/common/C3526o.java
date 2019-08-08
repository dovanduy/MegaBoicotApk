package com.google.android.gms.common;

import android.content.Context;
import android.os.RemoteException;
import android.os.StrictMode;
import android.os.StrictMode.ThreadPolicy;
import android.util.Log;
import com.google.android.gms.common.internal.C3461av;
import com.google.android.gms.common.internal.C3462aw;
import com.google.android.gms.common.internal.C3513t;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.DynamiteModule.C3606a;
import com.google.android.gms.p137b.C3238b;
import java.util.concurrent.Callable;
import javax.annotation.CheckReturnValue;

@CheckReturnValue
/* renamed from: com.google.android.gms.common.o */
final class C3526o {

    /* renamed from: a */
    private static volatile C3461av f10093a;

    /* renamed from: b */
    private static final Object f10094b = new Object();

    /* renamed from: c */
    private static Context f10095c;

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0019, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static synchronized void m12656a(android.content.Context r2) {
        /*
            java.lang.Class<com.google.android.gms.common.o> r0 = com.google.android.gms.common.C3526o.class
            monitor-enter(r0)
            android.content.Context r1 = f10095c     // Catch:{ all -> 0x001a }
            if (r1 != 0) goto L_0x0011
            if (r2 == 0) goto L_0x0018
            android.content.Context r2 = r2.getApplicationContext()     // Catch:{ all -> 0x001a }
            f10095c = r2     // Catch:{ all -> 0x001a }
            monitor-exit(r0)
            return
        L_0x0011:
            java.lang.String r2 = "GoogleCertificates"
            java.lang.String r1 = "GoogleCertificates has been initialized already"
            android.util.Log.w(r2, r1)     // Catch:{ all -> 0x001a }
        L_0x0018:
            monitor-exit(r0)
            return
        L_0x001a:
            r2 = move-exception
            monitor-exit(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.C3526o.m12656a(android.content.Context):void");
    }

    /* renamed from: a */
    static C3573x m12654a(String str, C3528q qVar, boolean z, boolean z2) {
        ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            return m12657b(str, qVar, z, false);
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    /* renamed from: b */
    private static C3573x m12657b(String str, C3528q qVar, boolean z, boolean z2) {
        try {
            if (f10093a == null) {
                C3513t.m12625a(f10095c);
                synchronized (f10094b) {
                    if (f10093a == null) {
                        f10093a = C3462aw.m12387a(DynamiteModule.m12874a(f10095c, DynamiteModule.f10252d, "com.google.android.gms.googlecertificates").mo13744a("com.google.android.gms.common.GoogleCertificatesImpl"));
                    }
                }
            }
            C3513t.m12625a(f10095c);
            try {
                if (f10093a.mo13525a(new zzk(str, qVar, z, z2), C3238b.m11573a(f10095c.getPackageManager()))) {
                    return C3573x.m12785a();
                }
                return C3573x.m12788a((Callable<String>) new C3527p<String>(z, str, qVar));
            } catch (RemoteException e) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
                return C3573x.m12787a("module call", e);
            }
        } catch (C3606a e2) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e2);
            String str2 = "module init: ";
            String valueOf = String.valueOf(e2.getMessage());
            return C3573x.m12787a(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), e2);
        }
    }

    /* renamed from: a */
    static final /* synthetic */ String m12655a(boolean z, String str, C3528q qVar) throws Exception {
        boolean z2 = false;
        if (!z && m12657b(str, qVar, true, false).f10196a) {
            z2 = true;
        }
        return C3573x.m12789a(str, qVar, z, z2);
    }
}
