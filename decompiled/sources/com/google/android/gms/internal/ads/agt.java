package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.util.LinkedList;

public abstract class agt implements ags {

    /* renamed from: a */
    protected static volatile ahn f10998a;

    /* renamed from: b */
    protected MotionEvent f10999b;

    /* renamed from: c */
    protected LinkedList<MotionEvent> f11000c = new LinkedList<>();

    /* renamed from: d */
    protected long f11001d = 0;

    /* renamed from: e */
    protected long f11002e = 0;

    /* renamed from: f */
    protected long f11003f = 0;

    /* renamed from: g */
    protected long f11004g = 0;

    /* renamed from: h */
    protected long f11005h = 0;

    /* renamed from: i */
    protected long f11006i = 0;

    /* renamed from: j */
    protected long f11007j = 0;

    /* renamed from: k */
    protected double f11008k;

    /* renamed from: l */
    protected float f11009l;

    /* renamed from: m */
    protected float f11010m;

    /* renamed from: n */
    protected float f11011n;

    /* renamed from: o */
    protected float f11012o;

    /* renamed from: p */
    protected boolean f11013p = false;

    /* renamed from: q */
    protected DisplayMetrics f11014q;

    /* renamed from: r */
    private double f11015r;

    /* renamed from: s */
    private double f11016s;

    /* renamed from: t */
    private boolean f11017t = false;

    protected agt(Context context) {
        try {
            if (((Boolean) aoq.m14620f().mo14695a(aru.f11840bL)).booleanValue()) {
                afx.m14041a();
            } else {
                aht.m14155a(f10998a);
            }
            this.f11014q = context.getResources().getDisplayMetrics();
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    private final String m14071a(Context context, String str, boolean z, View view, Activity activity, byte[] bArr) {
        C4378zo zoVar;
        int i;
        if (z) {
            try {
                zoVar = mo14280a(context, view, activity);
                this.f11017t = true;
            } catch (UnsupportedEncodingException | GeneralSecurityException unused) {
                i = 7;
                return Integer.toString(i);
            } catch (Throwable unused2) {
                i = 3;
                return Integer.toString(i);
            }
        } else {
            zoVar = mo14281a(context, null);
        }
        if (zoVar != null) {
            if (zoVar.mo14264d() != 0) {
                return afx.m14038a(zoVar, str);
            }
        }
        return Integer.toString(5);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract long mo14279a(StackTraceElement[] stackTraceElementArr) throws ahk;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract C4378zo mo14280a(Context context, View view, Activity activity);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract C4378zo mo14281a(Context context, C4274wk wkVar);

    /* renamed from: a */
    public final String mo12624a(Context context) {
        if (ahv.m14162a()) {
            if (((Boolean) aoq.m14620f().mo14695a(aru.f11842bN)).booleanValue()) {
                throw new IllegalStateException("The caller must not be called from the UI thread.");
            }
        }
        return m14071a(context, null, false, null, null, null);
    }

    /* renamed from: a */
    public final String mo12625a(Context context, String str, View view) {
        return mo12626a(context, str, view, null);
    }

    /* renamed from: a */
    public final String mo12626a(Context context, String str, View view, Activity activity) {
        return m14071a(context, str, true, view, activity, null);
    }

    /* renamed from: a */
    public final void mo12627a(int i, int i2, int i3) {
        MotionEvent motionEvent;
        if (this.f10999b != null) {
            this.f10999b.recycle();
        }
        if (this.f11014q != null) {
            motionEvent = MotionEvent.obtain(0, (long) i3, 1, this.f11014q.density * ((float) i), this.f11014q.density * ((float) i2), 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
        } else {
            motionEvent = null;
        }
        this.f10999b = motionEvent;
        this.f11013p = false;
    }

    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo12628a(android.view.MotionEvent r13) {
        /*
            r12 = this;
            boolean r0 = r12.f11017t
            r1 = 0
            if (r0 == 0) goto L_0x0035
            r2 = 0
            r12.f11004g = r2
            r12.f11003f = r2
            r12.f11002e = r2
            r12.f11001d = r2
            r12.f11005h = r2
            r12.f11007j = r2
            r12.f11006i = r2
            java.util.LinkedList<android.view.MotionEvent> r0 = r12.f11000c
            java.util.Iterator r0 = r0.iterator()
        L_0x001b:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x002b
            java.lang.Object r2 = r0.next()
            android.view.MotionEvent r2 = (android.view.MotionEvent) r2
            r2.recycle()
            goto L_0x001b
        L_0x002b:
            java.util.LinkedList<android.view.MotionEvent> r0 = r12.f11000c
            r0.clear()
            r0 = 0
            r12.f10999b = r0
            r12.f11017t = r1
        L_0x0035:
            int r0 = r13.getAction()
            switch(r0) {
                case 0: goto L_0x0060;
                case 1: goto L_0x003d;
                case 2: goto L_0x003d;
                default: goto L_0x003c;
            }
        L_0x003c:
            goto L_0x0072
        L_0x003d:
            float r0 = r13.getRawX()
            double r2 = (double) r0
            float r0 = r13.getRawY()
            double r4 = (double) r0
            double r6 = r12.f11015r
            double r6 = r2 - r6
            double r8 = r12.f11016s
            double r8 = r4 - r8
            double r10 = r12.f11008k
            double r6 = r6 * r6
            double r8 = r8 * r8
            double r6 = r6 + r8
            double r6 = java.lang.Math.sqrt(r6)
            double r10 = r10 + r6
            r12.f11008k = r10
            r12.f11015r = r2
            r12.f11016s = r4
            goto L_0x0072
        L_0x0060:
            r2 = 0
            r12.f11008k = r2
            float r0 = r13.getRawX()
            double r2 = (double) r0
            r12.f11015r = r2
            float r0 = r13.getRawY()
            double r2 = (double) r0
            r12.f11016s = r2
        L_0x0072:
            int r0 = r13.getAction()
            r2 = 1
            r4 = 1
            switch(r0) {
                case 0: goto L_0x0116;
                case 1: goto L_0x00df;
                case 2: goto L_0x0086;
                case 3: goto L_0x007e;
                default: goto L_0x007c;
            }
        L_0x007c:
            goto L_0x0134
        L_0x007e:
            long r0 = r12.f11004g
            long r5 = r0 + r2
            r12.f11004g = r5
            goto L_0x0134
        L_0x0086:
            long r2 = r12.f11002e
            int r0 = r13.getHistorySize()
            int r0 = r0 + r4
            long r5 = (long) r0
            long r7 = r2 + r5
            r12.f11002e = r7
            com.google.android.gms.internal.ads.ahu r13 = r12.mo14282b(r13)     // Catch:{ ahk -> 0x0134 }
            if (r13 == 0) goto L_0x00a2
            java.lang.Long r0 = r13.f11093d     // Catch:{ ahk -> 0x0134 }
            if (r0 == 0) goto L_0x00a2
            java.lang.Long r0 = r13.f11096g     // Catch:{ ahk -> 0x0134 }
            if (r0 == 0) goto L_0x00a2
            r0 = r4
            goto L_0x00a3
        L_0x00a2:
            r0 = r1
        L_0x00a3:
            if (r0 == 0) goto L_0x00b9
            long r2 = r12.f11006i     // Catch:{ ahk -> 0x0134 }
            java.lang.Long r0 = r13.f11093d     // Catch:{ ahk -> 0x0134 }
            long r5 = r0.longValue()     // Catch:{ ahk -> 0x0134 }
            java.lang.Long r0 = r13.f11096g     // Catch:{ ahk -> 0x0134 }
            long r7 = r0.longValue()     // Catch:{ ahk -> 0x0134 }
            long r9 = r5 + r7
            long r5 = r2 + r9
            r12.f11006i = r5     // Catch:{ ahk -> 0x0134 }
        L_0x00b9:
            android.util.DisplayMetrics r0 = r12.f11014q     // Catch:{ ahk -> 0x0134 }
            if (r0 == 0) goto L_0x00c8
            if (r13 == 0) goto L_0x00c8
            java.lang.Long r0 = r13.f11094e     // Catch:{ ahk -> 0x0134 }
            if (r0 == 0) goto L_0x00c8
            java.lang.Long r0 = r13.f11097h     // Catch:{ ahk -> 0x0134 }
            if (r0 == 0) goto L_0x00c8
            r1 = r4
        L_0x00c8:
            if (r1 == 0) goto L_0x0134
            long r0 = r12.f11007j     // Catch:{ ahk -> 0x0134 }
            java.lang.Long r2 = r13.f11094e     // Catch:{ ahk -> 0x0134 }
            long r2 = r2.longValue()     // Catch:{ ahk -> 0x0134 }
            java.lang.Long r13 = r13.f11097h     // Catch:{ ahk -> 0x0134 }
            long r5 = r13.longValue()     // Catch:{ ahk -> 0x0134 }
            long r7 = r2 + r5
            long r2 = r0 + r7
            r12.f11007j = r2     // Catch:{ ahk -> 0x0134 }
            goto L_0x0134
        L_0x00df:
            android.view.MotionEvent r13 = android.view.MotionEvent.obtain(r13)
            r12.f10999b = r13
            java.util.LinkedList<android.view.MotionEvent> r13 = r12.f11000c
            android.view.MotionEvent r0 = r12.f10999b
            r13.add(r0)
            java.util.LinkedList<android.view.MotionEvent> r13 = r12.f11000c
            int r13 = r13.size()
            r0 = 6
            if (r13 <= r0) goto L_0x0100
            java.util.LinkedList<android.view.MotionEvent> r13 = r12.f11000c
            java.lang.Object r13 = r13.remove()
            android.view.MotionEvent r13 = (android.view.MotionEvent) r13
            r13.recycle()
        L_0x0100:
            long r0 = r12.f11003f
            long r5 = r0 + r2
            r12.f11003f = r5
            java.lang.Throwable r13 = new java.lang.Throwable     // Catch:{ ahk -> 0x0134 }
            r13.<init>()     // Catch:{ ahk -> 0x0134 }
            java.lang.StackTraceElement[] r13 = r13.getStackTrace()     // Catch:{ ahk -> 0x0134 }
            long r0 = r12.mo14279a(r13)     // Catch:{ ahk -> 0x0134 }
            r12.f11005h = r0     // Catch:{ ahk -> 0x0134 }
            goto L_0x0134
        L_0x0116:
            float r0 = r13.getX()
            r12.f11009l = r0
            float r0 = r13.getY()
            r12.f11010m = r0
            float r0 = r13.getRawX()
            r12.f11011n = r0
            float r13 = r13.getRawY()
            r12.f11012o = r13
            long r0 = r12.f11001d
            long r5 = r0 + r2
            r12.f11001d = r5
        L_0x0134:
            r12.f11013p = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.agt.mo12628a(android.view.MotionEvent):void");
    }

    /* renamed from: a */
    public void mo12629a(View view) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract ahu mo14282b(MotionEvent motionEvent) throws ahk;
}
