package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.HandlerThread;
import com.google.android.exoplayer2.DefaultRenderersFactory;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.C3469d.C3470a;
import com.google.android.gms.common.internal.C3469d.C3471b;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.ads.ta */
final class C4166ta implements C3470a, C3471b {

    /* renamed from: a */
    private C4167tb f14071a;

    /* renamed from: b */
    private final String f14072b;

    /* renamed from: c */
    private final String f14073c;

    /* renamed from: d */
    private final LinkedBlockingQueue<C4378zo> f14074d;

    /* renamed from: e */
    private final HandlerThread f14075e = new HandlerThread("GassClient");

    public C4166ta(Context context, String str, String str2) {
        this.f14072b = str;
        this.f14073c = str2;
        this.f14075e.start();
        this.f14071a = new C4167tb(context, this.f14075e.getLooper(), this, this);
        this.f14074d = new LinkedBlockingQueue<>();
        this.f14071a.mo13551q();
    }

    /* renamed from: a */
    private final C4170te m18164a() {
        try {
            return this.f14071a.mo13018e();
        } catch (DeadObjectException | IllegalStateException unused) {
            return null;
        }
    }

    /* renamed from: b */
    private final void m18165b() {
        if (this.f14071a == null) {
            return;
        }
        if (this.f14071a.mo13542h() || this.f14071a.mo13543i()) {
            this.f14071a.mo13541g();
        }
    }

    /* renamed from: c */
    private static C4378zo m18166c() {
        C4378zo zoVar = new C4378zo();
        zoVar.f14339k = Long.valueOf(32768);
        return zoVar;
    }

    /* renamed from: a */
    public final void mo13483a(int i) {
        try {
            this.f14074d.put(m18166c());
        } catch (InterruptedException unused) {
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0031, code lost:
        m18165b();
        r3.f14075e.quit();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0039, code lost:
        throw r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0025, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0027 */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0025 A[ExcHandler: all (r4v3 'th' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:2:0x0006] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo13484a(android.os.Bundle r4) {
        /*
            r3 = this;
            com.google.android.gms.internal.ads.te r4 = r3.m18164a()
            if (r4 == 0) goto L_0x003a
            com.google.android.gms.internal.ads.zzatt r0 = new com.google.android.gms.internal.ads.zzatt     // Catch:{ Throwable -> 0x0027, all -> 0x0025 }
            java.lang.String r1 = r3.f14072b     // Catch:{ Throwable -> 0x0027, all -> 0x0025 }
            java.lang.String r2 = r3.f14073c     // Catch:{ Throwable -> 0x0027, all -> 0x0025 }
            r0.<init>(r1, r2)     // Catch:{ Throwable -> 0x0027, all -> 0x0025 }
            com.google.android.gms.internal.ads.zzatv r4 = r4.mo16070a(r0)     // Catch:{ Throwable -> 0x0027, all -> 0x0025 }
            com.google.android.gms.internal.ads.zo r4 = r4.mo16258a()     // Catch:{ Throwable -> 0x0027, all -> 0x0025 }
            java.util.concurrent.LinkedBlockingQueue<com.google.android.gms.internal.ads.zo> r0 = r3.f14074d     // Catch:{ Throwable -> 0x0027, all -> 0x0025 }
            r0.put(r4)     // Catch:{ Throwable -> 0x0027, all -> 0x0025 }
        L_0x001c:
            r3.m18165b()
            android.os.HandlerThread r4 = r3.f14075e
            r4.quit()
            return
        L_0x0025:
            r4 = move-exception
            goto L_0x0031
        L_0x0027:
            java.util.concurrent.LinkedBlockingQueue<com.google.android.gms.internal.ads.zo> r4 = r3.f14074d     // Catch:{ InterruptedException -> 0x001c, all -> 0x0025 }
            com.google.android.gms.internal.ads.zo r0 = m18166c()     // Catch:{ InterruptedException -> 0x001c, all -> 0x0025 }
            r4.put(r0)     // Catch:{ InterruptedException -> 0x001c, all -> 0x0025 }
            goto L_0x001c
        L_0x0031:
            r3.m18165b()
            android.os.HandlerThread r0 = r3.f14075e
            r0.quit()
            throw r4
        L_0x003a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C4166ta.mo13484a(android.os.Bundle):void");
    }

    /* renamed from: a */
    public final void mo13485a(ConnectionResult connectionResult) {
        try {
            this.f14074d.put(m18166c());
        } catch (InterruptedException unused) {
        }
    }

    /* renamed from: b */
    public final C4378zo mo16065b(int i) {
        C4378zo zoVar;
        try {
            zoVar = (C4378zo) this.f14074d.poll(DefaultRenderersFactory.DEFAULT_ALLOWED_VIDEO_JOINING_TIME_MS, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            zoVar = null;
        }
        return zoVar == null ? m18166c() : zoVar;
    }
}
