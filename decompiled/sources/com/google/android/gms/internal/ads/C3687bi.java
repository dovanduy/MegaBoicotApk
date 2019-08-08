package com.google.android.gms.internal.ads;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.C3006ad;
import com.google.android.gms.ads.internal.C3025aw;
import com.google.android.gms.ads.internal.gmsg.C3067ae;
import com.google.android.gms.ads.internal.gmsg.C3085o;
import java.lang.ref.WeakReference;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONObject;

@C3718cm
/* renamed from: com.google.android.gms.internal.ads.bi */
public final class C3687bi {

    /* renamed from: a */
    private final Object f12731a = new Object();

    /* renamed from: b */
    private final Context f12732b;

    /* renamed from: c */
    private final agw f12733c;

    /* renamed from: d */
    private final C3879ik f12734d;

    /* renamed from: e */
    private final ash f12735e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C3006ad f12736f;

    /* renamed from: g */
    private OnGlobalLayoutListener f12737g;

    /* renamed from: h */
    private OnScrollChangedListener f12738h;

    /* renamed from: i */
    private final DisplayMetrics f12739i;

    /* renamed from: j */
    private C3964lo f12740j;
    @GuardedBy("mLock")

    /* renamed from: k */
    private int f12741k = -1;
    @GuardedBy("mLock")

    /* renamed from: l */
    private int f12742l = -1;

    public C3687bi(Context context, agw agw, C3879ik ikVar, ash ash, C3006ad adVar) {
        this.f12732b = context;
        this.f12733c = agw;
        this.f12734d = ikVar;
        this.f12735e = ash;
        this.f12736f = adVar;
        this.f12740j = new C3964lo(200);
        C3025aw.m10917e();
        this.f12739i = C3909jn.m17124a((WindowManager) context.getSystemService("window"));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m16435a(WeakReference<C4089qe> weakReference, boolean z) {
        if (weakReference != null) {
            C4089qe qeVar = (C4089qe) weakReference.get();
            if (qeVar != null && qeVar.getView() != null) {
                if (!z || this.f12740j.mo15608a()) {
                    int[] iArr = new int[2];
                    qeVar.getView().getLocationOnScreen(iArr);
                    aoq.m14615a();
                    int b = C3975lz.m17380b(this.f12739i, iArr[0]);
                    aoq.m14615a();
                    int b2 = C3975lz.m17380b(this.f12739i, iArr[1]);
                    synchronized (this.f12731a) {
                        if (!(this.f12741k == b && this.f12742l == b2)) {
                            this.f12741k = b;
                            this.f12742l = b2;
                            qeVar.mo15919v().mo15927a(this.f12741k, this.f12742l, !z);
                        }
                    }
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo15199a(C4019np npVar, C4089qe qeVar, boolean z) {
        this.f12736f.mo12465R();
        npVar.mo15686b(qeVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo15200a(JSONObject jSONObject, C4019np npVar) {
        try {
            C3025aw.m10918f();
            C4089qe a = C4096ql.m17760a(this.f12732b, C4130rs.m17977a(), "native-video", false, false, this.f12733c, this.f12734d.f13291a.f14412k, this.f12735e, null, this.f12736f.mo12436i(), this.f12734d.f13299i);
            a.mo15878a(C4130rs.m17980b());
            this.f12736f.mo12474a(a);
            WeakReference weakReference = new WeakReference(a);
            C4124rm v = a.mo15919v();
            if (this.f12737g == null) {
                this.f12737g = new C3693bo(this, weakReference);
            }
            OnGlobalLayoutListener onGlobalLayoutListener = this.f12737g;
            if (this.f12738h == null) {
                this.f12738h = new C3694bp(this, weakReference);
            }
            v.mo15928a(onGlobalLayoutListener, this.f12738h);
            a.mo15880a("/video", C3085o.f8993l);
            a.mo15880a("/videoMeta", C3085o.f8994m);
            a.mo15880a("/precache", (C3067ae<? super C4089qe>) new C4077pt<Object>());
            a.mo15880a("/delayPageLoaded", C3085o.f8997p);
            a.mo15880a("/instrument", C3085o.f8995n);
            a.mo15880a("/log", C3085o.f8988g);
            a.mo15880a("/videoClicked", C3085o.f8989h);
            a.mo15880a("/trackActiveViewUnit", (C3067ae<? super C4089qe>) new C3691bm<Object>(this));
            a.mo15880a("/untrackActiveViewUnit", (C3067ae<? super C4089qe>) new C3692bn<Object>(this));
            a.mo15919v().mo15932a((C4126ro) new C3689bk(a, jSONObject));
            a.mo15919v().mo15931a((C4125rn) new C3690bl(this, npVar, a));
            a.loadUrl((String) aoq.m14620f().mo14695a(aru.f11853bY));
        } catch (Exception e) {
            C3900je.m17432c("Exception occurred while getting video view", e);
            npVar.mo15686b(null);
        }
    }
}
