package com.google.firebase.iid;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.support.p017v4.p023d.C0398m;
import android.util.Log;
import com.google.android.gms.p143d.C3584h;
import com.google.android.gms.p143d.C3587j;
import com.google.firebase.iid.zzl.C5015a;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.annotation.concurrent.GuardedBy;

/* renamed from: com.google.firebase.iid.w */
final class C5011w {

    /* renamed from: a */
    private static int f16268a;

    /* renamed from: b */
    private static PendingIntent f16269b;
    @GuardedBy("responseCallbacks")

    /* renamed from: c */
    private final C0398m<String, C3584h<Bundle>> f16270c = new C0398m<>();

    /* renamed from: d */
    private final Context f16271d;

    /* renamed from: e */
    private final C5005q f16272e;

    /* renamed from: f */
    private Messenger f16273f;

    /* renamed from: g */
    private Messenger f16274g;

    /* renamed from: h */
    private zzl f16275h;

    public C5011w(Context context, C5005q qVar) {
        this.f16271d = context;
        this.f16272e = qVar;
        this.f16273f = new Messenger(new C5012x(this, Looper.getMainLooper()));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m21732a(Message message) {
        if (message == null || !(message.obj instanceof Intent)) {
            Log.w("FirebaseInstanceId", "Dropping invalid message");
        } else {
            Intent intent = (Intent) message.obj;
            intent.setExtrasClassLoader(new C5015a());
            if (intent.hasExtra("google.messenger")) {
                Parcelable parcelableExtra = intent.getParcelableExtra("google.messenger");
                if (parcelableExtra instanceof zzl) {
                    this.f16275h = (zzl) parcelableExtra;
                }
                if (parcelableExtra instanceof Messenger) {
                    this.f16274g = (Messenger) parcelableExtra;
                }
            }
            Intent intent2 = (Intent) message.obj;
            String action = intent2.getAction();
            if (!"com.google.android.c2dm.intent.REGISTRATION".equals(action)) {
                if (Log.isLoggable("FirebaseInstanceId", 3)) {
                    String str = "FirebaseInstanceId";
                    String str2 = "Unexpected response action: ";
                    String valueOf = String.valueOf(action);
                    Log.d(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
                }
                return;
            }
            String stringExtra = intent2.getStringExtra("registration_id");
            if (stringExtra == null) {
                stringExtra = intent2.getStringExtra("unregistered");
            }
            if (stringExtra == null) {
                String stringExtra2 = intent2.getStringExtra("error");
                if (stringExtra2 == null) {
                    String valueOf2 = String.valueOf(intent2.getExtras());
                    StringBuilder sb = new StringBuilder(49 + String.valueOf(valueOf2).length());
                    sb.append("Unexpected response, no error or registration id ");
                    sb.append(valueOf2);
                    Log.w("FirebaseInstanceId", sb.toString());
                } else {
                    if (Log.isLoggable("FirebaseInstanceId", 3)) {
                        String str3 = "FirebaseInstanceId";
                        String str4 = "Received InstanceID error ";
                        String valueOf3 = String.valueOf(stringExtra2);
                        Log.d(str3, valueOf3.length() != 0 ? str4.concat(valueOf3) : new String(str4));
                    }
                    if (stringExtra2.startsWith("|")) {
                        String[] split = stringExtra2.split("\\|");
                        if (split.length <= 2 || !"ID".equals(split[1])) {
                            String str5 = "FirebaseInstanceId";
                            String str6 = "Unexpected structured response ";
                            String valueOf4 = String.valueOf(stringExtra2);
                            Log.w(str5, valueOf4.length() != 0 ? str6.concat(valueOf4) : new String(str6));
                        } else {
                            String str7 = split[2];
                            String str8 = split[3];
                            if (str8.startsWith(":")) {
                                str8 = str8.substring(1);
                            }
                            m21734a(str7, intent2.putExtra("error", str8).getExtras());
                        }
                    } else {
                        synchronized (this.f16270c) {
                            for (int i = 0; i < this.f16270c.size(); i++) {
                                m21734a((String) this.f16270c.mo1399b(i), intent2.getExtras());
                            }
                        }
                    }
                }
            } else {
                Matcher matcher = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)").matcher(stringExtra);
                if (!matcher.matches()) {
                    if (Log.isLoggable("FirebaseInstanceId", 3)) {
                        String str9 = "FirebaseInstanceId";
                        String str10 = "Unexpected response string: ";
                        String valueOf5 = String.valueOf(stringExtra);
                        Log.d(str9, valueOf5.length() != 0 ? str10.concat(valueOf5) : new String(str10));
                    }
                    return;
                }
                String group = matcher.group(1);
                String group2 = matcher.group(2);
                Bundle extras = intent2.getExtras();
                extras.putString("registration_id", group2);
                m21734a(group, extras);
            }
        }
    }

    /* renamed from: a */
    private static synchronized void m21731a(Context context, Intent intent) {
        synchronized (C5011w.class) {
            if (f16269b == null) {
                Intent intent2 = new Intent();
                intent2.setPackage("com.google.example.invalidpackage");
                f16269b = PendingIntent.getBroadcast(context, 0, intent2, 0);
            }
            intent.putExtra("app", f16269b);
        }
    }

    /* renamed from: a */
    private final void m21734a(String str, Bundle bundle) {
        synchronized (this.f16270c) {
            C3584h hVar = (C3584h) this.f16270c.remove(str);
            if (hVar == null) {
                String str2 = "FirebaseInstanceId";
                String str3 = "Missing callback for ";
                String valueOf = String.valueOf(str);
                Log.w(str2, valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
                return;
            }
            hVar.mo13722a(bundle);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final Bundle mo17969a(Bundle bundle) throws IOException {
        if (this.f16272e.mo17966d() < 12000000) {
            return m21735b(bundle);
        }
        try {
            return (Bundle) C3587j.m12818a(C4993e.m21695a(this.f16271d).mo17943b(1, bundle));
        } catch (InterruptedException | ExecutionException e) {
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                String valueOf = String.valueOf(e);
                StringBuilder sb = new StringBuilder(22 + String.valueOf(valueOf).length());
                sb.append("Error making request: ");
                sb.append(valueOf);
                Log.d("FirebaseInstanceId", sb.toString());
            }
            if (!(e.getCause() instanceof C5003o) || ((C5003o) e.getCause()).mo17962a() != 4) {
                return null;
            }
            return m21735b(bundle);
        }
    }

    /* renamed from: b */
    private final Bundle m21735b(Bundle bundle) throws IOException {
        Bundle c = m21736c(bundle);
        if (c == null || !c.containsKey("google.messenger")) {
            return c;
        }
        Bundle c2 = m21736c(bundle);
        if (c2 == null || !c2.containsKey("google.messenger")) {
            return c2;
        }
        return null;
    }

    /* renamed from: a */
    private static synchronized String m21730a() {
        String num;
        synchronized (C5011w.class) {
            int i = f16268a;
            f16268a = i + 1;
            num = Integer.toString(i);
        }
        return num;
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x00f7 A[SYNTHETIC] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final android.os.Bundle m21736c(android.os.Bundle r9) throws java.io.IOException {
        /*
            r8 = this;
            java.lang.String r0 = m21730a()
            com.google.android.gms.d.h r1 = new com.google.android.gms.d.h
            r1.<init>()
            android.support.v4.d.m<java.lang.String, com.google.android.gms.d.h<android.os.Bundle>> r2 = r8.f16270c
            monitor-enter(r2)
            android.support.v4.d.m<java.lang.String, com.google.android.gms.d.h<android.os.Bundle>> r3 = r8.f16270c     // Catch:{ all -> 0x0126 }
            r3.put(r0, r1)     // Catch:{ all -> 0x0126 }
            monitor-exit(r2)     // Catch:{ all -> 0x0126 }
            com.google.firebase.iid.q r2 = r8.f16272e
            int r2 = r2.mo17963a()
            if (r2 != 0) goto L_0x0022
            java.io.IOException r9 = new java.io.IOException
            java.lang.String r0 = "MISSING_INSTANCEID_SERVICE"
            r9.<init>(r0)
            throw r9
        L_0x0022:
            android.content.Intent r2 = new android.content.Intent
            r2.<init>()
            java.lang.String r3 = "com.google.android.gms"
            r2.setPackage(r3)
            com.google.firebase.iid.q r3 = r8.f16272e
            int r3 = r3.mo17963a()
            r4 = 2
            if (r3 != r4) goto L_0x003b
            java.lang.String r3 = "com.google.iid.TOKEN_REQUEST"
            r2.setAction(r3)
            goto L_0x0040
        L_0x003b:
            java.lang.String r3 = "com.google.android.c2dm.intent.REGISTER"
            r2.setAction(r3)
        L_0x0040:
            r2.putExtras(r9)
            android.content.Context r9 = r8.f16271d
            m21731a(r9, r2)
            java.lang.String r9 = "kid"
            r3 = 5
            java.lang.String r5 = java.lang.String.valueOf(r0)
            int r5 = r5.length()
            int r3 = r3 + r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r3)
            java.lang.String r3 = "|ID|"
            r5.append(r3)
            r5.append(r0)
            java.lang.String r3 = "|"
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            r2.putExtra(r9, r3)
            java.lang.String r9 = "FirebaseInstanceId"
            r3 = 3
            boolean r9 = android.util.Log.isLoggable(r9, r3)
            if (r9 == 0) goto L_0x009f
            java.lang.String r9 = "FirebaseInstanceId"
            android.os.Bundle r5 = r2.getExtras()
            java.lang.String r5 = java.lang.String.valueOf(r5)
            r6 = 8
            java.lang.String r7 = java.lang.String.valueOf(r5)
            int r7 = r7.length()
            int r6 = r6 + r7
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>(r6)
            java.lang.String r6 = "Sending "
            r7.append(r6)
            r7.append(r5)
            java.lang.String r5 = r7.toString()
            android.util.Log.d(r9, r5)
        L_0x009f:
            java.lang.String r9 = "google.messenger"
            android.os.Messenger r5 = r8.f16273f
            r2.putExtra(r9, r5)
            android.os.Messenger r9 = r8.f16274g
            if (r9 != 0) goto L_0x00ae
            com.google.firebase.iid.zzl r9 = r8.f16275h
            if (r9 == 0) goto L_0x00d3
        L_0x00ae:
            android.os.Message r9 = android.os.Message.obtain()
            r9.obj = r2
            android.os.Messenger r5 = r8.f16274g     // Catch:{ RemoteException -> 0x00c4 }
            if (r5 == 0) goto L_0x00be
            android.os.Messenger r5 = r8.f16274g     // Catch:{ RemoteException -> 0x00c4 }
            r5.send(r9)     // Catch:{ RemoteException -> 0x00c4 }
            goto L_0x00e6
        L_0x00be:
            com.google.firebase.iid.zzl r5 = r8.f16275h     // Catch:{ RemoteException -> 0x00c4 }
            r5.mo17983a(r9)     // Catch:{ RemoteException -> 0x00c4 }
            goto L_0x00e6
        L_0x00c4:
            java.lang.String r9 = "FirebaseInstanceId"
            boolean r9 = android.util.Log.isLoggable(r9, r3)
            if (r9 == 0) goto L_0x00d3
            java.lang.String r9 = "FirebaseInstanceId"
            java.lang.String r3 = "Messenger failed, fallback to startService"
            android.util.Log.d(r9, r3)
        L_0x00d3:
            com.google.firebase.iid.q r9 = r8.f16272e
            int r9 = r9.mo17963a()
            if (r9 != r4) goto L_0x00e1
            android.content.Context r9 = r8.f16271d
            r9.sendBroadcast(r2)
            goto L_0x00e6
        L_0x00e1:
            android.content.Context r9 = r8.f16271d
            r9.startService(r2)
        L_0x00e6:
            com.google.android.gms.d.g r9 = r1.mo13720a()     // Catch:{ InterruptedException | TimeoutException -> 0x010a, ExecutionException -> 0x0103 }
            r1 = 30000(0x7530, double:1.4822E-319)
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ InterruptedException | TimeoutException -> 0x010a, ExecutionException -> 0x0103 }
            java.lang.Object r9 = com.google.android.gms.p143d.C3587j.m12819a(r9, r1, r3)     // Catch:{ InterruptedException | TimeoutException -> 0x010a, ExecutionException -> 0x0103 }
            android.os.Bundle r9 = (android.os.Bundle) r9     // Catch:{ InterruptedException | TimeoutException -> 0x010a, ExecutionException -> 0x0103 }
            android.support.v4.d.m<java.lang.String, com.google.android.gms.d.h<android.os.Bundle>> r1 = r8.f16270c
            monitor-enter(r1)
            android.support.v4.d.m<java.lang.String, com.google.android.gms.d.h<android.os.Bundle>> r2 = r8.f16270c     // Catch:{ all -> 0x00fe }
            r2.remove(r0)     // Catch:{ all -> 0x00fe }
            monitor-exit(r1)     // Catch:{ all -> 0x00fe }
            return r9
        L_0x00fe:
            r9 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x00fe }
            throw r9
        L_0x0101:
            r9 = move-exception
            goto L_0x0119
        L_0x0103:
            r9 = move-exception
            java.io.IOException r1 = new java.io.IOException     // Catch:{ all -> 0x0101 }
            r1.<init>(r9)     // Catch:{ all -> 0x0101 }
            throw r1     // Catch:{ all -> 0x0101 }
        L_0x010a:
            java.lang.String r9 = "FirebaseInstanceId"
            java.lang.String r1 = "No response"
            android.util.Log.w(r9, r1)     // Catch:{ all -> 0x0101 }
            java.io.IOException r9 = new java.io.IOException     // Catch:{ all -> 0x0101 }
            java.lang.String r1 = "TIMEOUT"
            r9.<init>(r1)     // Catch:{ all -> 0x0101 }
            throw r9     // Catch:{ all -> 0x0101 }
        L_0x0119:
            android.support.v4.d.m<java.lang.String, com.google.android.gms.d.h<android.os.Bundle>> r1 = r8.f16270c
            monitor-enter(r1)
            android.support.v4.d.m<java.lang.String, com.google.android.gms.d.h<android.os.Bundle>> r2 = r8.f16270c     // Catch:{ all -> 0x0123 }
            r2.remove(r0)     // Catch:{ all -> 0x0123 }
            monitor-exit(r1)     // Catch:{ all -> 0x0123 }
            throw r9
        L_0x0123:
            r9 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0123 }
            throw r9
        L_0x0126:
            r9 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0126 }
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.C5011w.m21736c(android.os.Bundle):android.os.Bundle");
    }
}
