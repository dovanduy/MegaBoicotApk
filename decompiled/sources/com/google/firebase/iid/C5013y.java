package com.google.firebase.iid;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.support.p017v4.p023d.C0398m;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Queue;
import javax.annotation.concurrent.GuardedBy;

/* renamed from: com.google.firebase.iid.y */
public final class C5013y {

    /* renamed from: b */
    private static C5013y f16277b;

    /* renamed from: a */
    final Queue<Intent> f16278a = new ArrayDeque();
    @GuardedBy("serviceClassNames")

    /* renamed from: c */
    private final C0398m<String, String> f16279c = new C0398m<>();

    /* renamed from: d */
    private Boolean f16280d = null;

    /* renamed from: e */
    private final Queue<Intent> f16281e = new ArrayDeque();

    /* renamed from: a */
    public static synchronized C5013y m21739a() {
        C5013y yVar;
        synchronized (C5013y.class) {
            if (f16277b == null) {
                f16277b = new C5013y();
            }
            yVar = f16277b;
        }
        return yVar;
    }

    private C5013y() {
    }

    /* renamed from: a */
    public static PendingIntent m21738a(Context context, int i, Intent intent, int i2) {
        return PendingIntent.getBroadcast(context, i, m21741b(context, "com.google.firebase.MESSAGING_EVENT", intent), 1073741824);
    }

    /* renamed from: a */
    public static void m21740a(Context context, Intent intent) {
        context.sendBroadcast(m21741b(context, "com.google.firebase.INSTANCE_ID_EVENT", intent));
    }

    /* renamed from: b */
    public static void m21742b(Context context, Intent intent) {
        context.sendBroadcast(m21741b(context, "com.google.firebase.MESSAGING_EVENT", intent));
    }

    /* renamed from: b */
    private static Intent m21741b(Context context, String str, Intent intent) {
        Intent intent2 = new Intent(context, FirebaseInstanceIdReceiver.class);
        intent2.setAction(str);
        intent2.putExtra("wrapped_intent", intent);
        return intent2;
    }

    /* renamed from: b */
    public final Intent mo17972b() {
        return (Intent) this.f16281e.poll();
    }

    /* renamed from: a */
    public final int mo17971a(Context context, String str, Intent intent) {
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            String str2 = "FirebaseInstanceId";
            String str3 = "Starting service: ";
            String valueOf = String.valueOf(str);
            Log.d(str2, valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
        }
        char c = 65535;
        int hashCode = str.hashCode();
        if (hashCode != -842411455) {
            if (hashCode == 41532704 && str.equals("com.google.firebase.MESSAGING_EVENT")) {
                c = 1;
            }
        } else if (str.equals("com.google.firebase.INSTANCE_ID_EVENT")) {
            c = 0;
        }
        switch (c) {
            case 0:
                this.f16278a.offer(intent);
                break;
            case 1:
                this.f16281e.offer(intent);
                break;
            default:
                String str4 = "FirebaseInstanceId";
                String str5 = "Unknown service action: ";
                String valueOf2 = String.valueOf(str);
                Log.w(str4, valueOf2.length() != 0 ? str5.concat(valueOf2) : new String(str5));
                return 500;
        }
        Intent intent2 = new Intent(str);
        intent2.setPackage(context.getPackageName());
        return m21743c(context, intent2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:43:0x00dc A[Catch:{ SecurityException -> 0x013a, IllegalStateException -> 0x0111 }] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00f3 A[Catch:{ SecurityException -> 0x013a, IllegalStateException -> 0x0111 }] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00f8 A[Catch:{ SecurityException -> 0x013a, IllegalStateException -> 0x0111 }] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0105 A[Catch:{ SecurityException -> 0x013a, IllegalStateException -> 0x0111 }] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x010f  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int m21743c(android.content.Context r7, android.content.Intent r8) {
        /*
            r6 = this;
            android.support.v4.d.m<java.lang.String, java.lang.String> r0 = r6.f16279c
            monitor-enter(r0)
            android.support.v4.d.m<java.lang.String, java.lang.String> r1 = r6.f16279c     // Catch:{ all -> 0x0145 }
            java.lang.String r2 = r8.getAction()     // Catch:{ all -> 0x0145 }
            java.lang.Object r1 = r1.get(r2)     // Catch:{ all -> 0x0145 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x0145 }
            monitor-exit(r0)     // Catch:{ all -> 0x0145 }
            r0 = 0
            if (r1 != 0) goto L_0x00ac
            android.content.pm.PackageManager r1 = r7.getPackageManager()
            android.content.pm.ResolveInfo r1 = r1.resolveService(r8, r0)
            if (r1 == 0) goto L_0x00a4
            android.content.pm.ServiceInfo r2 = r1.serviceInfo
            if (r2 != 0) goto L_0x0023
            goto L_0x00a4
        L_0x0023:
            android.content.pm.ServiceInfo r1 = r1.serviceInfo
            java.lang.String r2 = r7.getPackageName()
            java.lang.String r3 = r1.packageName
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x006d
            java.lang.String r2 = r1.name
            if (r2 != 0) goto L_0x0036
            goto L_0x006d
        L_0x0036:
            java.lang.String r1 = r1.name
            java.lang.String r2 = "."
            boolean r2 = r1.startsWith(r2)
            if (r2 == 0) goto L_0x005c
            java.lang.String r2 = r7.getPackageName()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r1 = java.lang.String.valueOf(r1)
            int r3 = r1.length()
            if (r3 == 0) goto L_0x0057
            java.lang.String r1 = r2.concat(r1)
            goto L_0x005c
        L_0x0057:
            java.lang.String r1 = new java.lang.String
            r1.<init>(r2)
        L_0x005c:
            android.support.v4.d.m<java.lang.String, java.lang.String> r2 = r6.f16279c
            monitor-enter(r2)
            android.support.v4.d.m<java.lang.String, java.lang.String> r3 = r6.f16279c     // Catch:{ all -> 0x006a }
            java.lang.String r4 = r8.getAction()     // Catch:{ all -> 0x006a }
            r3.put(r4, r1)     // Catch:{ all -> 0x006a }
            monitor-exit(r2)     // Catch:{ all -> 0x006a }
            goto L_0x00ac
        L_0x006a:
            r7 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x006a }
            throw r7
        L_0x006d:
            java.lang.String r2 = "FirebaseInstanceId"
            java.lang.String r3 = r1.packageName
            java.lang.String r1 = r1.name
            r4 = 94
            java.lang.String r5 = java.lang.String.valueOf(r3)
            int r5 = r5.length()
            int r4 = r4 + r5
            java.lang.String r5 = java.lang.String.valueOf(r1)
            int r5 = r5.length()
            int r4 = r4 + r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r4)
            java.lang.String r4 = "Error resolving target intent service, skipping classname enforcement. Resolved service was: "
            r5.append(r4)
            r5.append(r3)
            java.lang.String r3 = "/"
            r5.append(r3)
            r5.append(r1)
            java.lang.String r1 = r5.toString()
            android.util.Log.e(r2, r1)
            goto L_0x00d8
        L_0x00a4:
            java.lang.String r1 = "FirebaseInstanceId"
            java.lang.String r2 = "Failed to resolve target intent service, skipping classname enforcement"
            android.util.Log.e(r1, r2)
            goto L_0x00d8
        L_0x00ac:
            java.lang.String r2 = "FirebaseInstanceId"
            r3 = 3
            boolean r2 = android.util.Log.isLoggable(r2, r3)
            if (r2 == 0) goto L_0x00d1
            java.lang.String r2 = "FirebaseInstanceId"
            java.lang.String r3 = "Restricting intent to a specific service: "
            java.lang.String r4 = java.lang.String.valueOf(r1)
            int r5 = r4.length()
            if (r5 == 0) goto L_0x00c8
            java.lang.String r3 = r3.concat(r4)
            goto L_0x00ce
        L_0x00c8:
            java.lang.String r4 = new java.lang.String
            r4.<init>(r3)
            r3 = r4
        L_0x00ce:
            android.util.Log.d(r2, r3)
        L_0x00d1:
            java.lang.String r2 = r7.getPackageName()
            r8.setClassName(r2, r1)
        L_0x00d8:
            java.lang.Boolean r1 = r6.f16280d     // Catch:{ SecurityException -> 0x013a, IllegalStateException -> 0x0111 }
            if (r1 != 0) goto L_0x00eb
            java.lang.String r1 = "android.permission.WAKE_LOCK"
            int r1 = r7.checkCallingOrSelfPermission(r1)     // Catch:{ SecurityException -> 0x013a, IllegalStateException -> 0x0111 }
            if (r1 != 0) goto L_0x00e5
            r0 = 1
        L_0x00e5:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ SecurityException -> 0x013a, IllegalStateException -> 0x0111 }
            r6.f16280d = r0     // Catch:{ SecurityException -> 0x013a, IllegalStateException -> 0x0111 }
        L_0x00eb:
            java.lang.Boolean r0 = r6.f16280d     // Catch:{ SecurityException -> 0x013a, IllegalStateException -> 0x0111 }
            boolean r0 = r0.booleanValue()     // Catch:{ SecurityException -> 0x013a, IllegalStateException -> 0x0111 }
            if (r0 == 0) goto L_0x00f8
            android.content.ComponentName r7 = android.support.p017v4.content.WakefulBroadcastReceiver.m1235a_(r7, r8)     // Catch:{ SecurityException -> 0x013a, IllegalStateException -> 0x0111 }
            goto L_0x0103
        L_0x00f8:
            android.content.ComponentName r7 = r7.startService(r8)     // Catch:{ SecurityException -> 0x013a, IllegalStateException -> 0x0111 }
            java.lang.String r8 = "FirebaseInstanceId"
            java.lang.String r0 = "Missing wake lock permission, service start may be delayed"
            android.util.Log.d(r8, r0)     // Catch:{ SecurityException -> 0x013a, IllegalStateException -> 0x0111 }
        L_0x0103:
            if (r7 != 0) goto L_0x010f
            java.lang.String r7 = "FirebaseInstanceId"
            java.lang.String r8 = "Error while delivering the message: ServiceIntent not found."
            android.util.Log.e(r7, r8)     // Catch:{ SecurityException -> 0x013a, IllegalStateException -> 0x0111 }
            r7 = 404(0x194, float:5.66E-43)
            return r7
        L_0x010f:
            r7 = -1
            return r7
        L_0x0111:
            r7 = move-exception
            java.lang.String r8 = "FirebaseInstanceId"
            java.lang.String r7 = java.lang.String.valueOf(r7)
            r0 = 45
            java.lang.String r1 = java.lang.String.valueOf(r7)
            int r1 = r1.length()
            int r0 = r0 + r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r0 = "Failed to start service while in background: "
            r1.append(r0)
            r1.append(r7)
            java.lang.String r7 = r1.toString()
            android.util.Log.e(r8, r7)
            r7 = 402(0x192, float:5.63E-43)
            return r7
        L_0x013a:
            r7 = move-exception
            java.lang.String r8 = "FirebaseInstanceId"
            java.lang.String r0 = "Error while delivering the message to the serviceIntent"
            android.util.Log.e(r8, r0, r7)
            r7 = 401(0x191, float:5.62E-43)
            return r7
        L_0x0145:
            r7 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0145 }
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.C5013y.m21743c(android.content.Context, android.content.Intent):int");
    }
}
