package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.File;
import java.util.Map;
import java.util.concurrent.Executor;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
@C3718cm
/* renamed from: com.google.android.gms.internal.ads.kx */
public final class C3946kx {

    /* renamed from: a */
    private static azk f13482a;

    /* renamed from: b */
    private static final Object f13483b = new Object();
    @Deprecated

    /* renamed from: c */
    private static final C3953ld<Void> f13484c = new C3947ky();

    public C3946kx(Context context) {
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        m17292a(context);
    }

    /* renamed from: a */
    private static azk m17292a(Context context) {
        azk azk;
        azk azk2;
        synchronized (f13483b) {
            if (f13482a == null) {
                aru.m15024a(context);
                if (((Boolean) aoq.m14620f().mo14695a(aru.f11890cI)).booleanValue()) {
                    azk2 = C3940kr.m17281a(context);
                } else {
                    azk2 = new azk(new C3954le(new File(context.getCacheDir(), "volley")), new C3870ib((C3844hc) new C4121rj()));
                    azk2.mo15022a();
                }
                f13482a = azk2;
            }
            azk = f13482a;
        }
        return azk;
    }

    /* renamed from: a */
    public final C4008ne<String> mo15591a(int i, String str, Map<String, String> map, byte[] bArr) {
        String str2 = str;
        C3955lf lfVar = new C3955lf(null);
        C3951lb lbVar = new C3951lb(this, str2, lfVar);
        C3980md mdVar = new C3980md(null);
        C3952lc lcVar = new C3952lc(this, i, str2, lfVar, lbVar, bArr, map, mdVar);
        if (C3980md.m17412c()) {
            try {
                mdVar.mo15628a(str2, "GET", lcVar.mo14898b(), lcVar.mo14897a());
            } catch (C3631a e) {
                C3900je.m17435e(e.getMessage());
            }
        }
        f13482a.mo15021a(lcVar);
        return lfVar;
    }

    @Deprecated
    /* renamed from: a */
    public final <T> C4008ne<T> mo15592a(String str, C3953ld<T> ldVar) {
        C4019np npVar = new C4019np();
        f13482a.mo15021a(new C3956lg(str, npVar));
        return C3996mt.m17452a(C3996mt.m17451a((C4008ne<A>) npVar, (C3992mp<A, B>) new C3950la<A,B>(this, ldVar), (Executor) C3907jl.f13407a), Throwable.class, (C3991mo<? super X, ? extends V>) new C3948kz<Object,Object>(this, ldVar), C4014nk.f13618b);
    }

    /* renamed from: a */
    public final C4008ne<String> mo15593a(String str, Map<String, String> map) {
        return mo15591a(0, str, map, null);
    }
}
