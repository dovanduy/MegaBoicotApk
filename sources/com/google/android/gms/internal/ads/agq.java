package com.google.android.gms.internal.ads;

import android.os.Build.VERSION;
import android.os.ConditionVariable;
import java.io.IOException;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class agq {

    /* renamed from: a */
    protected static volatile amo f10992a;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static final ConditionVariable f10993d = new ConditionVariable();

    /* renamed from: e */
    private static volatile Random f10994e;

    /* renamed from: b */
    protected volatile Boolean f10995b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public ahn f10996c;

    public agq(ahn ahn) {
        this.f10996c = ahn;
        ahn.mo14307c().execute(new agr(this));
    }

    /* renamed from: a */
    public static int m14060a() {
        try {
            return VERSION.SDK_INT >= 21 ? ThreadLocalRandom.current().nextInt() : m14063c().nextInt();
        } catch (RuntimeException unused) {
            return m14063c().nextInt();
        }
    }

    /* renamed from: c */
    private static Random m14063c() {
        if (f10994e == null) {
            synchronized (agq.class) {
                if (f10994e == null) {
                    f10994e = new Random();
                }
            }
        }
        return f10994e;
    }

    /* renamed from: a */
    public final void mo14277a(int i, int i2, long j) throws IOException {
        try {
            f10993d.block();
            if (this.f10995b.booleanValue() && f10992a != null) {
                C4235vj vjVar = new C4235vj();
                vjVar.f14122a = this.f10996c.f11057a.getPackageName();
                vjVar.f14123b = Long.valueOf(j);
                amq a = f10992a.mo14519a(afc.m13976a((afc) vjVar));
                a.mo14520a(i2);
                a.mo14522b(i);
                a.mo14521a();
            }
        } catch (Exception unused) {
        }
    }
}
