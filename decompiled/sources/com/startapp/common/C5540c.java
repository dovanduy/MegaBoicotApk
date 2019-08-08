package com.startapp.common;

import android.content.Context;
import android.os.Looper;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;

/* renamed from: com.startapp.common.c */
/* compiled from: StartAppSDK */
public class C5540c {

    /* renamed from: a */
    private static volatile C5540c f17618a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public volatile String f17619b = "e106";

    /* renamed from: c */
    private PhoneStateListener f17620c = new PhoneStateListener() {
        /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
            return;
         */
        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x002f */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onSignalStrengthsChanged(android.telephony.SignalStrength r5) {
            /*
                r4 = this;
                int r0 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x0037 }
                r1 = 23
                if (r0 < r1) goto L_0x0014
                com.startapp.common.c r0 = com.startapp.common.C5540c.this     // Catch:{ Exception -> 0x0037 }
                int r5 = r5.getLevel()     // Catch:{ Exception -> 0x0037 }
                java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ Exception -> 0x0037 }
                r0.f17619b = r5     // Catch:{ Exception -> 0x0037 }
                goto L_0x003e
            L_0x0014:
                java.lang.Class<android.telephony.SignalStrength> r0 = android.telephony.SignalStrength.class
                java.lang.String r1 = "getLevel"
                r2 = 0
                java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch:{ NoSuchMethodException -> 0x002f }
                java.lang.reflect.Method r0 = r0.getMethod(r1, r3)     // Catch:{ NoSuchMethodException -> 0x002f }
                com.startapp.common.c r1 = com.startapp.common.C5540c.this     // Catch:{ NoSuchMethodException -> 0x002f }
                java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ NoSuchMethodException -> 0x002f }
                java.lang.Object r5 = r0.invoke(r5, r2)     // Catch:{ NoSuchMethodException -> 0x002f }
                java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ NoSuchMethodException -> 0x002f }
                r1.f17619b = r5     // Catch:{ NoSuchMethodException -> 0x002f }
                goto L_0x003e
            L_0x002f:
                com.startapp.common.c r5 = com.startapp.common.C5540c.this     // Catch:{ Exception -> 0x0037 }
                java.lang.String r0 = "e104"
                r5.f17619b = r0     // Catch:{ Exception -> 0x0037 }
                goto L_0x003e
            L_0x0037:
                com.startapp.common.c r5 = com.startapp.common.C5540c.this
                java.lang.String r0 = "e105"
                r5.f17619b = r0
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.startapp.common.C5540c.C55422.onSignalStrengthsChanged(android.telephony.SignalStrength):void");
        }
    };

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m23649c(Context context) {
        m23646a(context, 256);
    }

    /* renamed from: a */
    public void mo20524a(Context context) {
        m23646a(context, 0);
    }

    /* renamed from: a */
    private void m23646a(Context context, int i) {
        ((TelephonyManager) context.getSystemService("phone")).listen(this.f17620c, i);
    }

    /* renamed from: b */
    public static void m23648b(final Context context) {
        if (f17618a == null) {
            f17618a = new C5540c();
            new Thread(new Runnable() {
                public void run() {
                    Looper.prepare();
                    try {
                        C5540c.m23644a().m23649c(context);
                    } catch (Throwable unused) {
                        C5540c.m23644a().f17619b = "e107";
                    }
                    Looper.loop();
                }
            }).start();
        }
    }

    /* renamed from: a */
    public static C5540c m23644a() {
        return f17618a;
    }

    /* renamed from: b */
    public String mo20525b() {
        return this.f17619b;
    }
}
