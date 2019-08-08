package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.p135a.C2961a;
import com.google.android.gms.ads.p135a.C2961a.C2962a;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

public final class aih extends aiy {
    public aih(ahn ahn, String str, String str2, C4378zo zoVar, int i, int i2) {
        super(ahn, str, str2, zoVar, i, 24);
    }

    /* renamed from: c */
    private final void m14189c() {
        C2961a m = this.f11164a.mo14317m();
        if (m != null) {
            try {
                C2962a b = m.mo12183b();
                String a = ahv.m14160a(b.mo12186a());
                if (a != null) {
                    synchronized (this.f11165b) {
                        this.f11165b.f14305T = a;
                        this.f11165b.f14307V = Boolean.valueOf(b.mo12187b());
                        this.f11165b.f14306U = Integer.valueOf(5);
                    }
                }
            } catch (IOException unused) {
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo14345a() throws IllegalAccessException, InvocationTargetException {
        if (this.f11164a.mo14311g()) {
            m14189c();
            return;
        }
        synchronized (this.f11165b) {
            this.f11165b.f14305T = (String) this.f11166c.invoke(null, new Object[]{this.f11164a.mo14301a()});
        }
    }

    /* renamed from: b */
    public final Void mo14346b() throws Exception {
        if (this.f11164a.mo14306b()) {
            return super.call();
        }
        if (this.f11164a.mo14311g()) {
            m14189c();
        }
        return null;
    }

    public final /* synthetic */ Object call() throws Exception {
        return call();
    }
}
