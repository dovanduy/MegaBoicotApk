package com.appnext.base;

import android.annotation.SuppressLint;
import android.content.Context;
import com.appnext.base.p042a.C1224a;
import com.appnext.base.p042a.p044b.C1231c;
import com.appnext.base.p046b.C1245d;
import com.appnext.base.p046b.C1245d.C1246a;
import com.appnext.base.p046b.C1247e;
import com.appnext.base.p046b.C1249g;
import com.appnext.base.p046b.C1251i;
import com.appnext.base.p046b.C1259k;
import com.appnext.base.services.OperationService;
import com.appnext.base.services.p048b.C1285a;
import com.appnext.core.C1326f;
import java.util.List;

public class Appnext {
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: gc */
    private static final Appnext f3876gc = new Appnext();
    /* access modifiers changed from: private */

    /* renamed from: gb */
    public Context f3877gb = null;
    /* access modifiers changed from: private */

    /* renamed from: gd */
    public boolean f3878gd = false;

    private Appnext() {
    }

    /* renamed from: aJ */
    protected static Appnext m5155aJ() {
        return f3876gc;
    }

    /* renamed from: e */
    private void m5158e(Context context) throws ExceptionInInitializerError {
        if (context == null) {
            throw new ExceptionInInitializerError("Cannot init Appnext with null context");
        }
        try {
            if (!this.f3878gd || this.f3877gb == null) {
                this.f3878gd = true;
                C1247e.init(context);
                this.f3877gb = context.getApplicationContext();
                if (C1259k.m5334a(OperationService.class)) {
                    C1249g.m5286ch().mo5955b(new Runnable() {
                        public final void run() {
                            try {
                                C1259k.m5337b(C1245d.f3969jl, C1326f.m5675b(C1247e.getContext(), true), C1246a.String);
                                C1251i.m5302ck().init(Appnext.this.f3877gb);
                                if (C1259k.m5345p(Appnext.this.f3877gb)) {
                                    Appnext.this.f3878gd = false;
                                    C1251i.m5302ck().putBoolean(C1251i.f3980jC, true);
                                    return;
                                }
                                C1247e.init(Appnext.this.f3877gb);
                                C1251i.m5302ck().init(Appnext.this.f3877gb);
                                Appnext.m5157b(Appnext.this);
                                Context a = Appnext.this.f3877gb;
                                try {
                                    List bm = C1224a.m5161aN().mo5888aR().mo5931bm();
                                    if (bm != null && bm.size() == 0) {
                                        StringBuilder sb = new StringBuilder("cdm");
                                        sb.append(System.currentTimeMillis());
                                        C1231c cVar = new C1231c("on", "1", C1245d.f3953iV, "1", C1245d.f3957iZ, "cdm", sb.toString(), null);
                                        C1224a.m5161aN().mo5888aR().mo5926a(cVar);
                                        C1285a.m5550g(a).mo6051a(cVar, true);
                                    }
                                } catch (Throwable unused) {
                                }
                            } catch (Throwable unused2) {
                            }
                        }
                    });
                    return;
                }
                return;
            }
            this.f3877gb = context.getApplicationContext();
        } catch (Throwable unused) {
        }
    }

    public static void setParam(String str, String str2) {
        try {
            if (C1247e.getContext() != null && str.hashCode() == 951500826) {
                C1259k.m5337b(C1245d.f3962je, str2, C1246a.Boolean);
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: aK */
    private void m5156aK() {
        try {
            String b = C1326f.m5675b(this.f3877gb, true);
            if (!b.equals(C1251i.m5302ck().getString(C1251i.f3987jz, ""))) {
                C1251i.m5302ck().clear();
                C1251i.m5302ck().putString(C1251i.f3987jz, b);
            }
        } catch (Throwable unused) {
        }
    }

    public static void init(Context context) {
        Appnext appnext = f3876gc;
        if (context == null) {
            throw new ExceptionInInitializerError("Cannot init Appnext with null context");
        }
        try {
            if (!appnext.f3878gd || appnext.f3877gb == null) {
                appnext.f3878gd = true;
                C1247e.init(context);
                appnext.f3877gb = context.getApplicationContext();
                if (C1259k.m5334a(OperationService.class)) {
                    C1249g.m5286ch().mo5955b(new Runnable() {
                        public final void run() {
                            try {
                                C1259k.m5337b(C1245d.f3969jl, C1326f.m5675b(C1247e.getContext(), true), C1246a.String);
                                C1251i.m5302ck().init(Appnext.this.f3877gb);
                                if (C1259k.m5345p(Appnext.this.f3877gb)) {
                                    Appnext.this.f3878gd = false;
                                    C1251i.m5302ck().putBoolean(C1251i.f3980jC, true);
                                    return;
                                }
                                C1247e.init(Appnext.this.f3877gb);
                                C1251i.m5302ck().init(Appnext.this.f3877gb);
                                Appnext.m5157b(Appnext.this);
                                Context a = Appnext.this.f3877gb;
                                try {
                                    List bm = C1224a.m5161aN().mo5888aR().mo5931bm();
                                    if (bm != null && bm.size() == 0) {
                                        StringBuilder sb = new StringBuilder("cdm");
                                        sb.append(System.currentTimeMillis());
                                        C1231c cVar = new C1231c("on", "1", C1245d.f3953iV, "1", C1245d.f3957iZ, "cdm", sb.toString(), null);
                                        C1224a.m5161aN().mo5888aR().mo5926a(cVar);
                                        C1285a.m5550g(a).mo6051a(cVar, true);
                                    }
                                } catch (Throwable unused) {
                                }
                            } catch (Throwable unused2) {
                            }
                        }
                    });
                    return;
                }
                return;
            }
            appnext.f3877gb = context.getApplicationContext();
        } catch (Throwable unused) {
        }
    }

    /* renamed from: b */
    static /* synthetic */ void m5157b(Appnext appnext) {
        try {
            String b = C1326f.m5675b(appnext.f3877gb, true);
            if (!b.equals(C1251i.m5302ck().getString(C1251i.f3987jz, ""))) {
                C1251i.m5302ck().clear();
                C1251i.m5302ck().putString(C1251i.f3987jz, b);
            }
        } catch (Throwable unused) {
        }
    }
}
