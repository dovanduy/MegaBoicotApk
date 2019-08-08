package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Keep;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public class LifecycleCallback {

    /* renamed from: a */
    protected final C3368h f9525a;

    @Keep
    private static C3368h getChimeraLifecycleFragmentImpl(C3367g gVar) {
        throw new IllegalStateException("Method not available in SDK.");
    }

    /* renamed from: a */
    public void mo13171a(int i, int i2, Intent intent) {
    }

    /* renamed from: a */
    public void mo13172a(Bundle bundle) {
    }

    /* renamed from: a */
    public void mo13173a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    /* renamed from: b */
    public void mo13174b() {
    }

    /* renamed from: b */
    public void mo13175b(Bundle bundle) {
    }

    /* renamed from: c */
    public void mo13176c() {
    }

    /* renamed from: d */
    public void mo13177d() {
    }

    /* renamed from: e */
    public void mo13178e() {
    }

    /* renamed from: a */
    protected static C3368h m11706a(C3367g gVar) {
        if (gVar.mo13343a()) {
            return C3358cw.m12017a(gVar.mo13346d());
        }
        if (gVar.mo13344b()) {
            return C3356cu.m12011a(gVar.mo13345c());
        }
        throw new IllegalArgumentException("Can't get fragment for unexpected activity.");
    }

    /* renamed from: a */
    public static C3368h m11705a(Activity activity) {
        return m11706a(new C3367g(activity));
    }

    protected LifecycleCallback(C3368h hVar) {
        this.f9525a = hVar;
    }

    /* renamed from: a */
    public Activity mo13170a() {
        return this.f9525a.mo13299o_();
    }
}
