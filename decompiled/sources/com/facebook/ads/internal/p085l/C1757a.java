package com.facebook.ads.internal.p085l;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.facebook.ads.internal.l.a */
public class C1757a {

    /* renamed from: a */
    private static SensorManager f5506a;

    /* renamed from: b */
    private static Sensor f5507b;

    /* renamed from: c */
    private static Sensor f5508c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static volatile float[] f5509d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static volatile float[] f5510e;

    /* renamed from: f */
    private static Map<String, String> f5511f = new ConcurrentHashMap();

    /* renamed from: g */
    private static String[] f5512g = {"x", "y", "z"};

    /* renamed from: h */
    private static SensorEventListener f5513h;

    /* renamed from: i */
    private static SensorEventListener f5514i;

    /* renamed from: com.facebook.ads.internal.l.a$a */
    private static class C1759a implements SensorEventListener {
        private C1759a() {
        }

        public void onAccuracyChanged(Sensor sensor, int i) {
        }

        public void onSensorChanged(SensorEvent sensorEvent) {
            C1757a.f5509d = sensorEvent.values;
            C1757a.m7296d();
        }
    }

    /* renamed from: com.facebook.ads.internal.l.a$b */
    private static class C1760b implements SensorEventListener {
        private C1760b() {
        }

        public void onAccuracyChanged(Sensor sensor, int i) {
        }

        public void onSensorChanged(SensorEvent sensorEvent) {
            C1757a.f5510e = sensorEvent.values;
            C1757a.m7297e();
        }
    }

    /* renamed from: a */
    public static Map<String, String> m7289a() {
        HashMap hashMap = new HashMap();
        hashMap.putAll(f5511f);
        m7291a((Map<String, String>) hashMap);
        return hashMap;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0104, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00a0  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized void m7290a(android.content.Context r8) {
        /*
            java.lang.Class<com.facebook.ads.internal.l.a> r0 = com.facebook.ads.internal.p085l.C1757a.class
            monitor-enter(r0)
            android.app.ActivityManager$MemoryInfo r1 = new android.app.ActivityManager$MemoryInfo     // Catch:{ all -> 0x0105 }
            r1.<init>()     // Catch:{ all -> 0x0105 }
            java.lang.String r2 = "activity"
            java.lang.Object r2 = r8.getSystemService(r2)     // Catch:{ all -> 0x0105 }
            android.app.ActivityManager r2 = (android.app.ActivityManager) r2     // Catch:{ all -> 0x0105 }
            r2.getMemoryInfo(r1)     // Catch:{ all -> 0x0105 }
            java.util.Map<java.lang.String, java.lang.String> r2 = f5511f     // Catch:{ all -> 0x0105 }
            java.lang.String r3 = "available_memory"
            long r4 = r1.availMem     // Catch:{ all -> 0x0105 }
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x0105 }
            r2.put(r3, r4)     // Catch:{ all -> 0x0105 }
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0105 }
            r3 = 16
            if (r2 < r3) goto L_0x0033
            java.util.Map<java.lang.String, java.lang.String> r2 = f5511f     // Catch:{ all -> 0x0105 }
            java.lang.String r3 = "total_memory"
            long r4 = r1.totalMem     // Catch:{ all -> 0x0105 }
            java.lang.String r1 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x0105 }
            r2.put(r3, r1)     // Catch:{ all -> 0x0105 }
        L_0x0033:
            java.io.File r1 = android.os.Environment.getDataDirectory()     // Catch:{ all -> 0x0105 }
            android.os.StatFs r2 = new android.os.StatFs     // Catch:{ all -> 0x0105 }
            java.lang.String r1 = r1.getPath()     // Catch:{ all -> 0x0105 }
            r2.<init>(r1)     // Catch:{ all -> 0x0105 }
            int r1 = r2.getBlockSize()     // Catch:{ all -> 0x0105 }
            long r3 = (long) r1     // Catch:{ all -> 0x0105 }
            int r1 = r2.getAvailableBlocks()     // Catch:{ all -> 0x0105 }
            long r1 = (long) r1     // Catch:{ all -> 0x0105 }
            java.util.Map<java.lang.String, java.lang.String> r5 = f5511f     // Catch:{ all -> 0x0105 }
            java.lang.String r6 = "free_space"
            long r1 = r1 * r3
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x0105 }
            r5.put(r6, r1)     // Catch:{ all -> 0x0105 }
            android.content.IntentFilter r1 = new android.content.IntentFilter     // Catch:{ all -> 0x0105 }
            java.lang.String r2 = "android.intent.action.BATTERY_CHANGED"
            r1.<init>(r2)     // Catch:{ all -> 0x0105 }
            r2 = 0
            android.content.Intent r1 = r8.registerReceiver(r2, r1)     // Catch:{ all -> 0x0105 }
            r3 = 1
            if (r1 != 0) goto L_0x0066
            goto L_0x00a5
        L_0x0066:
            java.lang.String r4 = "level"
            r5 = -1
            int r4 = r1.getIntExtra(r4, r5)     // Catch:{ all -> 0x0105 }
            java.lang.String r6 = "scale"
            int r6 = r1.getIntExtra(r6, r5)     // Catch:{ all -> 0x0105 }
            java.lang.String r7 = "status"
            int r1 = r1.getIntExtra(r7, r5)     // Catch:{ all -> 0x0105 }
            r5 = 2
            if (r1 == r5) goto L_0x0082
            r5 = 5
            if (r1 != r5) goto L_0x0080
            goto L_0x0082
        L_0x0080:
            r1 = 0
            goto L_0x0083
        L_0x0082:
            r1 = r3
        L_0x0083:
            r5 = 0
            if (r6 <= 0) goto L_0x008c
            float r4 = (float) r4     // Catch:{ all -> 0x0105 }
            float r5 = (float) r6     // Catch:{ all -> 0x0105 }
            float r4 = r4 / r5
            r5 = 1120403456(0x42c80000, float:100.0)
            float r5 = r5 * r4
        L_0x008c:
            java.util.Map<java.lang.String, java.lang.String> r4 = f5511f     // Catch:{ all -> 0x0105 }
            java.lang.String r6 = "battery"
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x0105 }
            r4.put(r6, r5)     // Catch:{ all -> 0x0105 }
            java.util.Map<java.lang.String, java.lang.String> r4 = f5511f     // Catch:{ all -> 0x0105 }
            java.lang.String r5 = "charging"
            if (r1 == 0) goto L_0x00a0
            java.lang.String r1 = "1"
            goto L_0x00a2
        L_0x00a0:
            java.lang.String r1 = "0"
        L_0x00a2:
            r4.put(r5, r1)     // Catch:{ all -> 0x0105 }
        L_0x00a5:
            android.hardware.SensorManager r1 = f5506a     // Catch:{ all -> 0x0105 }
            if (r1 != 0) goto L_0x00b9
            java.lang.String r1 = "sensor"
            java.lang.Object r8 = r8.getSystemService(r1)     // Catch:{ all -> 0x0105 }
            android.hardware.SensorManager r8 = (android.hardware.SensorManager) r8     // Catch:{ all -> 0x0105 }
            f5506a = r8     // Catch:{ all -> 0x0105 }
            android.hardware.SensorManager r8 = f5506a     // Catch:{ all -> 0x0105 }
            if (r8 != 0) goto L_0x00b9
            monitor-exit(r0)
            return
        L_0x00b9:
            android.hardware.Sensor r8 = f5507b     // Catch:{ all -> 0x0105 }
            if (r8 != 0) goto L_0x00c5
            android.hardware.SensorManager r8 = f5506a     // Catch:{ all -> 0x0105 }
            android.hardware.Sensor r8 = r8.getDefaultSensor(r3)     // Catch:{ all -> 0x0105 }
            f5507b = r8     // Catch:{ all -> 0x0105 }
        L_0x00c5:
            android.hardware.Sensor r8 = f5508c     // Catch:{ all -> 0x0105 }
            if (r8 != 0) goto L_0x00d2
            android.hardware.SensorManager r8 = f5506a     // Catch:{ all -> 0x0105 }
            r1 = 4
            android.hardware.Sensor r8 = r8.getDefaultSensor(r1)     // Catch:{ all -> 0x0105 }
            f5508c = r8     // Catch:{ all -> 0x0105 }
        L_0x00d2:
            android.hardware.SensorEventListener r8 = f5513h     // Catch:{ all -> 0x0105 }
            r1 = 3
            if (r8 != 0) goto L_0x00eb
            com.facebook.ads.internal.l.a$a r8 = new com.facebook.ads.internal.l.a$a     // Catch:{ all -> 0x0105 }
            r8.<init>()     // Catch:{ all -> 0x0105 }
            f5513h = r8     // Catch:{ all -> 0x0105 }
            android.hardware.Sensor r8 = f5507b     // Catch:{ all -> 0x0105 }
            if (r8 == 0) goto L_0x00eb
            android.hardware.SensorManager r8 = f5506a     // Catch:{ all -> 0x0105 }
            android.hardware.SensorEventListener r3 = f5513h     // Catch:{ all -> 0x0105 }
            android.hardware.Sensor r4 = f5507b     // Catch:{ all -> 0x0105 }
            r8.registerListener(r3, r4, r1)     // Catch:{ all -> 0x0105 }
        L_0x00eb:
            android.hardware.SensorEventListener r8 = f5514i     // Catch:{ all -> 0x0105 }
            if (r8 != 0) goto L_0x0103
            com.facebook.ads.internal.l.a$b r8 = new com.facebook.ads.internal.l.a$b     // Catch:{ all -> 0x0105 }
            r8.<init>()     // Catch:{ all -> 0x0105 }
            f5514i = r8     // Catch:{ all -> 0x0105 }
            android.hardware.Sensor r8 = f5508c     // Catch:{ all -> 0x0105 }
            if (r8 == 0) goto L_0x0103
            android.hardware.SensorManager r8 = f5506a     // Catch:{ all -> 0x0105 }
            android.hardware.SensorEventListener r2 = f5514i     // Catch:{ all -> 0x0105 }
            android.hardware.Sensor r3 = f5508c     // Catch:{ all -> 0x0105 }
            r8.registerListener(r2, r3, r1)     // Catch:{ all -> 0x0105 }
        L_0x0103:
            monitor-exit(r0)
            return
        L_0x0105:
            r8 = move-exception
            monitor-exit(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.p085l.C1757a.m7290a(android.content.Context):void");
    }

    /* renamed from: a */
    private static void m7291a(Map<String, String> map) {
        float[] fArr = f5509d;
        float[] fArr2 = f5510e;
        if (fArr != null) {
            int min = Math.min(f5512g.length, fArr.length);
            for (int i = 0; i < min; i++) {
                StringBuilder sb = new StringBuilder();
                sb.append("accelerometer_");
                sb.append(f5512g[i]);
                map.put(sb.toString(), String.valueOf(fArr[i]));
            }
        }
        if (fArr2 != null) {
            int min2 = Math.min(f5512g.length, fArr2.length);
            for (int i2 = 0; i2 < min2; i2++) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("rotation_");
                sb2.append(f5512g[i2]);
                map.put(sb2.toString(), String.valueOf(fArr2[i2]));
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static synchronized void m7296d() {
        synchronized (C1757a.class) {
            if (f5506a != null) {
                f5506a.unregisterListener(f5513h);
            }
            f5513h = null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static synchronized void m7297e() {
        synchronized (C1757a.class) {
            if (f5506a != null) {
                f5506a.unregisterListener(f5514i);
            }
            f5514i = null;
        }
    }
}
