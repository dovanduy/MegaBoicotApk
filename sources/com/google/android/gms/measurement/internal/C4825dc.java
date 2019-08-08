package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.dc */
final class C4825dc implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ AtomicReference f15683a;

    /* renamed from: b */
    private final /* synthetic */ String f15684b;

    /* renamed from: c */
    private final /* synthetic */ String f15685c;

    /* renamed from: d */
    private final /* synthetic */ String f15686d;

    /* renamed from: e */
    private final /* synthetic */ zzk f15687e;

    /* renamed from: f */
    private final /* synthetic */ C4815ct f15688f;

    C4825dc(C4815ct ctVar, AtomicReference atomicReference, String str, String str2, String str3, zzk zzk) {
        this.f15688f = ctVar;
        this.f15683a = atomicReference;
        this.f15684b = str;
        this.f15685c = str2;
        this.f15686d = str3;
        this.f15687e = zzk;
    }

    public final void run() {
        synchronized (this.f15683a) {
            try {
                C4884i d = this.f15688f.f15644b;
                if (d == null) {
                    this.f15688f.mo17158r().mo17761y_().mo17766a("Failed to get conditional properties", C4893r.m21360a(this.f15684b), this.f15685c, this.f15686d);
                    this.f15683a.set(Collections.emptyList());
                    this.f15683a.notify();
                    return;
                }
                if (TextUtils.isEmpty(this.f15684b)) {
                    this.f15683a.set(d.mo17262a(this.f15685c, this.f15686d, this.f15687e));
                } else {
                    this.f15683a.set(d.mo17263a(this.f15684b, this.f15685c, this.f15686d));
                }
                this.f15688f.m20696I();
                this.f15683a.notify();
            } catch (RemoteException e) {
                try {
                    this.f15688f.mo17158r().mo17761y_().mo17766a("Failed to get conditional properties", C4893r.m21360a(this.f15684b), this.f15685c, e);
                    this.f15683a.set(Collections.emptyList());
                    this.f15683a.notify();
                } catch (Throwable th) {
                    this.f15683a.notify();
                    throw th;
                }
            }
        }
    }
}
