package com.startapp.android.publish.adsCommon.p189i;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.p038a.p039a.p040a.p041a.C1059a;
import com.p038a.p039a.p040a.p041a.C1059a.C1060a;
import com.startapp.common.p193a.C5518g;
import java.util.concurrent.CountDownLatch;

/* renamed from: com.startapp.android.publish.adsCommon.i.a */
/* compiled from: StartAppSDK */
public class C5405a {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static CountDownLatch f17289a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static volatile C5408b f17290b;

    /* renamed from: com.startapp.android.publish.adsCommon.i.a$a */
    /* compiled from: StartAppSDK */
    private static final class C5407a implements ServiceConnection {

        /* renamed from: a */
        private String f17291a;

        private C5407a(String str) {
            this.f17291a = str;
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            C1059a a = C1060a.m4918a(iBinder);
            Bundle bundle = new Bundle();
            bundle.putString("package_name", this.f17291a);
            try {
                C5405a.f17290b = new C5408b(a.mo5405a(bundle));
            } catch (RemoteException e) {
                C5518g.m23564a("PlayReferrer", 5, "InstallReferrerServiceConnection.onServiceConnected", e);
            }
            C5405a.f17289a.countDown();
        }

        public void onServiceDisconnected(ComponentName componentName) {
            C5518g.m23563a("PlayReferrer", 5, "InstallReferrerServiceConnection.onServiceDisconnected");
            C5405a.f17289a.countDown();
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:16|17|18|19) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x0070 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.startapp.android.publish.adsCommon.p189i.C5408b m23074a(android.content.Context r6) {
        /*
            com.startapp.android.publish.adsCommon.i.b r0 = f17290b
            if (r0 != 0) goto L_0x0092
            java.util.concurrent.CountDownLatch r0 = new java.util.concurrent.CountDownLatch     // Catch:{ Throwable -> 0x007c }
            r1 = 1
            r0.<init>(r1)     // Catch:{ Throwable -> 0x007c }
            f17289a = r0     // Catch:{ Throwable -> 0x007c }
            com.startapp.android.publish.adsCommon.i.a$a r0 = new com.startapp.android.publish.adsCommon.i.a$a     // Catch:{ Throwable -> 0x007c }
            java.lang.String r2 = r6.getPackageName()     // Catch:{ Throwable -> 0x007c }
            r3 = 0
            r0.<init>(r2)     // Catch:{ Throwable -> 0x007c }
            android.content.Intent r2 = new android.content.Intent     // Catch:{ Throwable -> 0x007c }
            java.lang.String r3 = "com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE"
            r2.<init>(r3)     // Catch:{ Throwable -> 0x007c }
            android.content.ComponentName r3 = new android.content.ComponentName     // Catch:{ Throwable -> 0x007c }
            java.lang.String r4 = "com.android.vending"
            java.lang.String r5 = "com.google.android.finsky.externalreferrer.GetInstallReferrerService"
            r3.<init>(r4, r5)     // Catch:{ Throwable -> 0x007c }
            r2.setComponent(r3)     // Catch:{ Throwable -> 0x007c }
            android.content.pm.PackageManager r3 = r6.getPackageManager()     // Catch:{ Throwable -> 0x007c }
            r4 = 0
            java.util.List r3 = r3.queryIntentServices(r2, r4)     // Catch:{ Throwable -> 0x007c }
            if (r3 == 0) goto L_0x0092
            boolean r5 = r3.isEmpty()     // Catch:{ Throwable -> 0x007c }
            if (r5 != 0) goto L_0x0092
            java.lang.Object r3 = r3.get(r4)     // Catch:{ Throwable -> 0x007c }
            android.content.pm.ResolveInfo r3 = (android.content.pm.ResolveInfo) r3     // Catch:{ Throwable -> 0x007c }
            android.content.pm.ServiceInfo r4 = r3.serviceInfo     // Catch:{ Throwable -> 0x007c }
            if (r4 == 0) goto L_0x0092
            android.content.pm.ServiceInfo r4 = r3.serviceInfo     // Catch:{ Throwable -> 0x007c }
            java.lang.String r4 = r4.packageName     // Catch:{ Throwable -> 0x007c }
            android.content.pm.ServiceInfo r3 = r3.serviceInfo     // Catch:{ Throwable -> 0x007c }
            java.lang.String r3 = r3.name     // Catch:{ Throwable -> 0x007c }
            java.lang.String r5 = "com.android.vending"
            boolean r4 = r5.equals(r4)     // Catch:{ Throwable -> 0x007c }
            if (r4 == 0) goto L_0x0092
            if (r3 == 0) goto L_0x0092
            boolean r3 = m23077b(r6)     // Catch:{ Throwable -> 0x007c }
            if (r3 == 0) goto L_0x0092
            android.content.Intent r3 = new android.content.Intent     // Catch:{ Throwable -> 0x007c }
            r3.<init>(r2)     // Catch:{ Throwable -> 0x007c }
            boolean r1 = r6.bindService(r3, r0, r1)     // Catch:{ Throwable -> 0x007c }
            if (r1 == 0) goto L_0x0074
            java.util.concurrent.CountDownLatch r1 = f17289a     // Catch:{ InterruptedException -> 0x0070 }
            r2 = 1
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ InterruptedException -> 0x0070 }
            r1.await(r2, r4)     // Catch:{ InterruptedException -> 0x0070 }
        L_0x0070:
            r6.unbindService(r0)     // Catch:{ Throwable -> 0x007c }
            goto L_0x0092
        L_0x0074:
            java.lang.Exception r0 = new java.lang.Exception     // Catch:{ Throwable -> 0x007c }
            java.lang.String r1 = "failed to connect to referrer service"
            r0.<init>(r1)     // Catch:{ Throwable -> 0x007c }
            throw r0     // Catch:{ Throwable -> 0x007c }
        L_0x007c:
            r0 = move-exception
            java.lang.String r1 = "PlayReferrer"
            r2 = 5
            java.lang.String r3 = "getReferrerDetails"
            com.startapp.common.p193a.C5518g.m23564a(r1, r2, r3, r0)
            com.startapp.android.publish.adsCommon.f.d r1 = com.startapp.android.publish.adsCommon.p182f.C5376d.EXCEPTION
            java.lang.String r2 = "getReferrerDetails"
            java.lang.String r0 = r0.getMessage()
            java.lang.String r3 = ""
            com.startapp.android.publish.adsCommon.p182f.C5378f.m23016a(r6, r1, r2, r0, r3)
        L_0x0092:
            com.startapp.android.publish.adsCommon.i.b r6 = f17290b
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.android.publish.adsCommon.p189i.C5405a.m23074a(android.content.Context):com.startapp.android.publish.adsCommon.i.b");
    }

    /* renamed from: b */
    private static boolean m23077b(Context context) {
        boolean z = false;
        try {
            if (context.getPackageManager().getPackageInfo("com.android.vending", 128).versionCode >= 80837300) {
                z = true;
            }
            return z;
        } catch (NameNotFoundException unused) {
            return false;
        }
    }
}
