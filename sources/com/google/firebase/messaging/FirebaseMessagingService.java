package com.google.firebase.messaging;

import android.app.PendingIntent;
import android.app.PendingIntent.CanceledException;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.google.firebase.iid.C5013y;
import com.google.firebase.iid.zzb;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;

public class FirebaseMessagingService extends zzb {

    /* renamed from: b */
    private static final Queue<String> f16293b = new ArrayDeque(10);

    /* renamed from: a */
    public void mo17989a() {
    }

    /* renamed from: a */
    public void mo17990a(RemoteMessage remoteMessage) {
    }

    /* renamed from: a */
    public void mo17991a(String str) {
    }

    /* renamed from: a */
    public void mo17992a(String str, Exception exc) {
    }

    /* renamed from: b */
    public void mo17993b(String str) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Intent mo17901a(Intent intent) {
        return C5013y.m21739a().mo17972b();
    }

    /* renamed from: c */
    public final boolean mo17980c(Intent intent) {
        if (!"com.google.firebase.messaging.NOTIFICATION_OPEN".equals(intent.getAction())) {
            return false;
        }
        PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra("pending_intent");
        if (pendingIntent != null) {
            try {
                pendingIntent.send();
            } catch (CanceledException unused) {
                Log.e("FirebaseMessaging", "Notification pending intent canceled");
            }
        }
        if (C5017b.m21778e(intent)) {
            C5017b.m21775b(intent);
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00f7, code lost:
        if (r0.equals("send_event") == false) goto L_0x0118;
     */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x011c  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x012f  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x014c  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0156  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x015a  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo17903b(android.content.Intent r10) {
        /*
            r9 = this;
            java.lang.String r0 = r10.getAction()
            java.lang.String r1 = "com.google.android.c2dm.intent.RECEIVE"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L_0x0059
            java.lang.String r1 = "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0015
            goto L_0x0059
        L_0x0015:
            java.lang.String r1 = "com.google.firebase.messaging.NOTIFICATION_DISMISS"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0027
            boolean r0 = com.google.firebase.messaging.C5017b.m21778e(r10)
            if (r0 == 0) goto L_0x0058
            com.google.firebase.messaging.C5017b.m21776c(r10)
            return
        L_0x0027:
            java.lang.String r1 = "com.google.firebase.messaging.NEW_TOKEN"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0039
            java.lang.String r0 = "token"
            java.lang.String r10 = r10.getStringExtra(r0)
            r9.mo17993b(r10)
            return
        L_0x0039:
            java.lang.String r0 = "FirebaseMessaging"
            java.lang.String r1 = "Unknown intent action: "
            java.lang.String r10 = r10.getAction()
            java.lang.String r10 = java.lang.String.valueOf(r10)
            int r2 = r10.length()
            if (r2 == 0) goto L_0x0050
            java.lang.String r10 = r1.concat(r10)
            goto L_0x0055
        L_0x0050:
            java.lang.String r10 = new java.lang.String
            r10.<init>(r1)
        L_0x0055:
            android.util.Log.d(r0, r10)
        L_0x0058:
            return
        L_0x0059:
            java.lang.String r0 = "google.message_id"
            java.lang.String r0 = r10.getStringExtra(r0)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            r2 = 2
            if (r1 == 0) goto L_0x006c
            r1 = 0
            com.google.android.gms.d.g r1 = com.google.android.gms.p143d.C3587j.m12817a(r1)
            goto L_0x007e
        L_0x006c:
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            java.lang.String r3 = "google.message_id"
            r1.putString(r3, r0)
            com.google.firebase.iid.e r3 = com.google.firebase.iid.C4993e.m21695a(r9)
            com.google.android.gms.d.g r1 = r3.mo17942a(r2, r1)
        L_0x007e:
            boolean r3 = android.text.TextUtils.isEmpty(r0)
            r4 = 1
            r5 = 3
            r6 = 0
            if (r3 == 0) goto L_0x0089
        L_0x0087:
            r0 = r6
            goto L_0x00cb
        L_0x0089:
            java.util.Queue<java.lang.String> r3 = f16293b
            boolean r3 = r3.contains(r0)
            if (r3 == 0) goto L_0x00b6
            java.lang.String r3 = "FirebaseMessaging"
            boolean r3 = android.util.Log.isLoggable(r3, r5)
            if (r3 == 0) goto L_0x00b4
            java.lang.String r3 = "FirebaseMessaging"
            java.lang.String r7 = "Received duplicate message: "
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r8 = r0.length()
            if (r8 == 0) goto L_0x00ac
            java.lang.String r0 = r7.concat(r0)
            goto L_0x00b1
        L_0x00ac:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r7)
        L_0x00b1:
            android.util.Log.d(r3, r0)
        L_0x00b4:
            r0 = r4
            goto L_0x00cb
        L_0x00b6:
            java.util.Queue<java.lang.String> r3 = f16293b
            int r3 = r3.size()
            r7 = 10
            if (r3 < r7) goto L_0x00c5
            java.util.Queue<java.lang.String> r3 = f16293b
            r3.remove()
        L_0x00c5:
            java.util.Queue<java.lang.String> r3 = f16293b
            r3.add(r0)
            goto L_0x0087
        L_0x00cb:
            if (r0 != 0) goto L_0x019e
            java.lang.String r0 = "message_type"
            java.lang.String r0 = r10.getStringExtra(r0)
            if (r0 != 0) goto L_0x00d7
            java.lang.String r0 = "gcm"
        L_0x00d7:
            r3 = -1
            int r7 = r0.hashCode()
            r8 = -2062414158(0xffffffff85120eb2, float:-6.867586E-36)
            if (r7 == r8) goto L_0x010e
            r4 = 102161(0x18f11, float:1.43158E-40)
            if (r7 == r4) goto L_0x0104
            r4 = 814694033(0x308f3e91, float:1.0422402E-9)
            if (r7 == r4) goto L_0x00fa
            r4 = 814800675(0x3090df23, float:1.0540798E-9)
            if (r7 == r4) goto L_0x00f1
            goto L_0x0118
        L_0x00f1:
            java.lang.String r4 = "send_event"
            boolean r4 = r0.equals(r4)
            if (r4 == 0) goto L_0x0118
            goto L_0x0119
        L_0x00fa:
            java.lang.String r2 = "send_error"
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L_0x0118
            r2 = r5
            goto L_0x0119
        L_0x0104:
            java.lang.String r2 = "gcm"
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L_0x0118
            r2 = r6
            goto L_0x0119
        L_0x010e:
            java.lang.String r2 = "deleted_messages"
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L_0x0118
            r2 = r4
            goto L_0x0119
        L_0x0118:
            r2 = r3
        L_0x0119:
            switch(r2) {
                case 0: goto L_0x015a;
                case 1: goto L_0x0156;
                case 2: goto L_0x014c;
                case 3: goto L_0x012f;
                default: goto L_0x011c;
            }
        L_0x011c:
            java.lang.String r10 = "FirebaseMessaging"
            java.lang.String r2 = "Received message with unknown type: "
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r3 = r0.length()
            if (r3 == 0) goto L_0x0196
            java.lang.String r0 = r2.concat(r0)
            goto L_0x019b
        L_0x012f:
            java.lang.String r0 = "google.message_id"
            java.lang.String r0 = r10.getStringExtra(r0)
            if (r0 != 0) goto L_0x013d
            java.lang.String r0 = "message_id"
            java.lang.String r0 = r10.getStringExtra(r0)
        L_0x013d:
            com.google.firebase.messaging.d r2 = new com.google.firebase.messaging.d
            java.lang.String r3 = "error"
            java.lang.String r10 = r10.getStringExtra(r3)
            r2.<init>(r10)
            r9.mo17992a(r0, r2)
            goto L_0x019e
        L_0x014c:
            java.lang.String r0 = "google.message_id"
            java.lang.String r10 = r10.getStringExtra(r0)
            r9.mo17991a(r10)
            goto L_0x019e
        L_0x0156:
            r9.mo17989a()
            goto L_0x019e
        L_0x015a:
            boolean r0 = com.google.firebase.messaging.C5017b.m21778e(r10)
            if (r0 == 0) goto L_0x0163
            com.google.firebase.messaging.C5017b.m21773a(r10)
        L_0x0163:
            android.os.Bundle r0 = r10.getExtras()
            if (r0 != 0) goto L_0x016e
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
        L_0x016e:
            java.lang.String r2 = "android.support.content.wakelockid"
            r0.remove(r2)
            boolean r2 = com.google.firebase.messaging.C5021e.m21784a(r0)
            if (r2 == 0) goto L_0x018d
            com.google.firebase.messaging.e r2 = new com.google.firebase.messaging.e
            r2.<init>(r9)
            boolean r2 = r2.mo17996c(r0)
            if (r2 != 0) goto L_0x019e
            boolean r2 = com.google.firebase.messaging.C5017b.m21778e(r10)
            if (r2 == 0) goto L_0x018d
            com.google.firebase.messaging.C5017b.m21777d(r10)
        L_0x018d:
            com.google.firebase.messaging.RemoteMessage r10 = new com.google.firebase.messaging.RemoteMessage
            r10.<init>(r0)
            r9.mo17990a(r10)
            goto L_0x019e
        L_0x0196:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r2)
        L_0x019b:
            android.util.Log.w(r10, r0)
        L_0x019e:
            r2 = 1
            java.util.concurrent.TimeUnit r10 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x01a6 }
            com.google.android.gms.p143d.C3587j.m12819a(r1, r2, r10)     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x01a6 }
            return
        L_0x01a6:
            r10 = move-exception
            java.lang.String r0 = "FirebaseMessaging"
            java.lang.String r10 = java.lang.String.valueOf(r10)
            r1 = 20
            java.lang.String r2 = java.lang.String.valueOf(r10)
            int r2 = r2.length()
            int r1 = r1 + r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r1)
            java.lang.String r1 = "Message ack failed: "
            r2.append(r1)
            r2.append(r10)
            java.lang.String r10 = r2.toString()
            android.util.Log.w(r0, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.FirebaseMessagingService.mo17903b(android.content.Intent):void");
    }

    /* renamed from: a */
    static void m21763a(Bundle bundle) {
        Iterator it = bundle.keySet().iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (str != null && str.startsWith("google.c.")) {
                it.remove();
            }
        }
    }
}
