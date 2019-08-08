package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.dd */
final class C4826dd implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ AtomicReference f15689a;

    /* renamed from: b */
    private final /* synthetic */ String f15690b;

    /* renamed from: c */
    private final /* synthetic */ String f15691c;

    /* renamed from: d */
    private final /* synthetic */ String f15692d;

    /* renamed from: e */
    private final /* synthetic */ boolean f15693e;

    /* renamed from: f */
    private final /* synthetic */ zzk f15694f;

    /* renamed from: g */
    private final /* synthetic */ C4815ct f15695g;

    C4826dd(C4815ct ctVar, AtomicReference atomicReference, String str, String str2, String str3, boolean z, zzk zzk) {
        this.f15695g = ctVar;
        this.f15689a = atomicReference;
        this.f15690b = str;
        this.f15691c = str2;
        this.f15692d = str3;
        this.f15693e = z;
        this.f15694f = zzk;
    }

    public final void run() {
        synchronized (this.f15689a) {
            try {
                C4884i d = this.f15695g.f15644b;
                if (d == null) {
                    this.f15695g.mo17158r().mo17761y_().mo17766a("Failed to get user properties", C4893r.m21360a(this.f15690b), this.f15691c, this.f15692d);
                    this.f15689a.set(Collections.emptyList());
                    this.f15689a.notify();
                    return;
                }
                if (TextUtils.isEmpty(this.f15690b)) {
                    this.f15689a.set(d.mo17265a(this.f15691c, this.f15692d, this.f15693e, this.f15694f));
                } else {
                    this.f15689a.set(d.mo17264a(this.f15690b, this.f15691c, this.f15692d, this.f15693e));
                }
                this.f15695g.m20696I();
                this.f15689a.notify();
            } catch (RemoteException e) {
                try {
                    this.f15695g.mo17158r().mo17761y_().mo17766a("Failed to get user properties", C4893r.m21360a(this.f15690b), this.f15691c, e);
                    this.f15689a.set(Collections.emptyList());
                    this.f15689a.notify();
                } catch (Throwable th) {
                    this.f15689a.notify();
                    throw th;
                }
            }
        }
    }
}
