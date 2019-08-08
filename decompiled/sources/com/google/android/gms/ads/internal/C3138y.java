package com.google.android.gms.ads.internal;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C3513t;
import com.google.android.gms.internal.ads.C3718cm;
import com.google.android.gms.internal.ads.C3807ft;
import com.google.android.gms.internal.ads.C3846he;
import com.google.android.gms.internal.ads.C3847hf;
import com.google.android.gms.internal.ads.C3900je;
import com.google.android.gms.internal.ads.C3930kh;
import com.google.android.gms.internal.ads.aoq;
import com.google.android.gms.internal.ads.aqa;
import com.google.android.gms.internal.ads.aru;
import com.google.android.gms.internal.ads.bbj;
import com.google.android.gms.internal.ads.bbk;
import com.google.android.gms.internal.ads.bcd;
import com.google.android.gms.internal.ads.zzang;
import com.google.android.gms.p137b.C3235a;
import com.google.android.gms.p137b.C3238b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.GuardedBy;

@ParametersAreNonnullByDefault
@C3718cm
/* renamed from: com.google.android.gms.ads.internal.y */
public final class C3138y extends aqa {

    /* renamed from: b */
    private static final Object f9145b = new Object();
    @GuardedBy("sLock")

    /* renamed from: c */
    private static C3138y f9146c;

    /* renamed from: a */
    private final Context f9147a;

    /* renamed from: d */
    private final Object f9148d = new Object();

    /* renamed from: e */
    private boolean f9149e;

    /* renamed from: f */
    private zzang f9150f;

    private C3138y(Context context, zzang zzang) {
        this.f9147a = context;
        this.f9150f = zzang;
        this.f9149e = false;
    }

    /* renamed from: a */
    public static C3138y m11246a(Context context, zzang zzang) {
        C3138y yVar;
        synchronized (f9145b) {
            if (f9146c == null) {
                f9146c = new C3138y(context.getApplicationContext(), zzang);
            }
            yVar = f9146c;
        }
        return yVar;
    }

    /* renamed from: a */
    public final void mo12698a() {
        synchronized (f9145b) {
            if (this.f9149e) {
                C3900je.m17435e("Mobile ads is initialized already.");
                return;
            }
            this.f9149e = true;
            aru.m15024a(this.f9147a);
            C3025aw.m10921i().mo15433a(this.f9147a, this.f9150f);
            C3025aw.m10923k().mo14508a(this.f9147a);
        }
    }

    /* renamed from: a */
    public final void mo12699a(float f) {
        C3025aw.m10910D().mo15557a(f);
    }

    /* renamed from: a */
    public final void mo12700a(C3235a aVar, String str) {
        if (aVar == null) {
            C3900je.m17431c("Wrapped context is null. Failed to open debug menu.");
            return;
        }
        Context context = (Context) C3238b.m11574a(aVar);
        if (context == null) {
            C3900je.m17431c("Context is null. Failed to open debug menu.");
            return;
        }
        C3930kh khVar = new C3930kh(context);
        khVar.mo15563a(str);
        khVar.mo15566b(this.f9150f.f14505a);
        khVar.mo15560a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo12701a(Runnable runnable) {
        Context context = this.f9147a;
        C3513t.m12634b("Adapters must be initialized on the main thread.");
        Map e = C3025aw.m10921i().mo15449l().mo15506h().mo15430e();
        if (e != null && !e.isEmpty()) {
            if (runnable != null) {
                try {
                    runnable.run();
                } catch (Throwable th) {
                    C3900je.m17432c("Could not initialize rewarded ads.", th);
                    return;
                }
            }
            C3807ft J = C3807ft.m16672J();
            if (J != null) {
                Collection<bbk> values = e.values();
                HashMap hashMap = new HashMap();
                C3235a a = C3238b.m11573a(context);
                for (bbk bbk : values) {
                    for (bbj bbj : bbk.f12563a) {
                        String str = bbj.f12552k;
                        for (String str2 : bbj.f12544c) {
                            if (!hashMap.containsKey(str2)) {
                                hashMap.put(str2, new ArrayList());
                            }
                            if (str != null) {
                                ((Collection) hashMap.get(str2)).add(str);
                            }
                        }
                    }
                }
                for (Entry entry : hashMap.entrySet()) {
                    String str3 = (String) entry.getKey();
                    try {
                        C3846he b = J.mo12476b(str3);
                        if (b != null) {
                            bcd a2 = b.mo15361a();
                            if (!a2.mo15100g()) {
                                if (a2.mo15106m()) {
                                    a2.mo15085a(a, (C3847hf) b.mo15362b(), (List) entry.getValue());
                                    String str4 = "Initialized rewarded video mediation adapter ";
                                    String valueOf = String.valueOf(str3);
                                    C3900je.m17429b(valueOf.length() != 0 ? str4.concat(valueOf) : new String(str4));
                                }
                            }
                        }
                    } catch (Throwable th2) {
                        StringBuilder sb = new StringBuilder(56 + String.valueOf(str3).length());
                        sb.append("Failed to initialize rewarded video mediation adapter \"");
                        sb.append(str3);
                        sb.append("\"");
                        C3900je.m17432c(sb.toString(), th2);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo12702a(String str) {
        aru.m15024a(this.f9147a);
        if (!TextUtils.isEmpty(str)) {
            if (((Boolean) aoq.m14620f().mo14695a(aru.f11926cs)).booleanValue()) {
                C3025aw.m10925m().mo12594a(this.f9147a, this.f9150f, str, null);
            }
        }
    }

    /* renamed from: a */
    public final void mo12703a(String str, C3235a aVar) {
        if (!TextUtils.isEmpty(str)) {
            aru.m15024a(this.f9147a);
            boolean booleanValue = ((Boolean) aoq.m14620f().mo14695a(aru.f11926cs)).booleanValue() | ((Boolean) aoq.m14620f().mo14695a(aru.f11779aD)).booleanValue();
            C3139z zVar = null;
            if (((Boolean) aoq.m14620f().mo14695a(aru.f11779aD)).booleanValue()) {
                booleanValue = true;
                zVar = new C3139z(this, (Runnable) C3238b.m11574a(aVar));
            }
            if (booleanValue) {
                C3025aw.m10925m().mo12594a(this.f9147a, this.f9150f, str, zVar);
            }
        }
    }

    /* renamed from: a */
    public final void mo12704a(boolean z) {
        C3025aw.m10910D().mo15558a(z);
    }

    /* renamed from: b */
    public final float mo12705b() {
        return C3025aw.m10910D().mo15556a();
    }

    /* renamed from: c */
    public final boolean mo12706c() {
        return C3025aw.m10910D().mo15559b();
    }
}
