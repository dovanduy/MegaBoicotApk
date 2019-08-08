package com.google.android.gms.ads.internal;

import android.content.Context;
import android.graphics.Rect;
import android.os.RemoteException;
import android.support.p017v4.p023d.C0398m;
import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import com.google.android.gms.internal.ads.C3718cm;
import com.google.android.gms.internal.ads.C3813fz;
import com.google.android.gms.internal.ads.C3822gh;
import com.google.android.gms.internal.ads.C3878ij;
import com.google.android.gms.internal.ads.C3879ik;
import com.google.android.gms.internal.ads.C3880il;
import com.google.android.gms.internal.ads.C3891iw;
import com.google.android.gms.internal.ads.C3894iz;
import com.google.android.gms.internal.ads.C3900je;
import com.google.android.gms.internal.ads.C3929kg;
import com.google.android.gms.internal.ads.C3964lo;
import com.google.android.gms.internal.ads.C3975lz;
import com.google.android.gms.internal.ads.ags;
import com.google.android.gms.internal.ads.agw;
import com.google.android.gms.internal.ads.aoq;
import com.google.android.gms.internal.ads.aot;
import com.google.android.gms.internal.ads.aow;
import com.google.android.gms.internal.ads.apm;
import com.google.android.gms.internal.ads.apq;
import com.google.android.gms.internal.ads.apw;
import com.google.android.gms.internal.ads.aru;
import com.google.android.gms.internal.ads.aso;
import com.google.android.gms.internal.ads.avi;
import com.google.android.gms.internal.ads.avl;
import com.google.android.gms.internal.ads.avp;
import com.google.android.gms.internal.ads.avs;
import com.google.android.gms.internal.ads.avv;
import com.google.android.gms.internal.ads.avy;
import com.google.android.gms.internal.ads.zzang;
import com.google.android.gms.internal.ads.zzjn;
import com.google.android.gms.internal.ads.zzlu;
import com.google.android.gms.internal.ads.zzmu;
import com.google.android.gms.internal.ads.zzpl;
import java.util.HashSet;
import java.util.List;
import java.util.UUID;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
@C3718cm
/* renamed from: com.google.android.gms.ads.internal.ax */
public final class C3026ax implements OnGlobalLayoutListener, OnScrollChangedListener {

    /* renamed from: A */
    List<Integer> f8839A;

    /* renamed from: B */
    aso f8840B;

    /* renamed from: C */
    C3822gh f8841C;

    /* renamed from: D */
    C3813fz f8842D;

    /* renamed from: E */
    public String f8843E;

    /* renamed from: F */
    List<String> f8844F;

    /* renamed from: G */
    public C3891iw f8845G;

    /* renamed from: H */
    View f8846H;

    /* renamed from: I */
    public int f8847I;

    /* renamed from: J */
    boolean f8848J;

    /* renamed from: K */
    private HashSet<C3880il> f8849K;

    /* renamed from: L */
    private int f8850L;

    /* renamed from: M */
    private int f8851M;

    /* renamed from: N */
    private C3964lo f8852N;

    /* renamed from: O */
    private boolean f8853O;

    /* renamed from: P */
    private boolean f8854P;

    /* renamed from: Q */
    private boolean f8855Q;

    /* renamed from: a */
    final String f8856a;

    /* renamed from: b */
    public String f8857b;

    /* renamed from: c */
    public final Context f8858c;

    /* renamed from: d */
    final agw f8859d;

    /* renamed from: e */
    public final zzang f8860e;

    /* renamed from: f */
    C3027ay f8861f;

    /* renamed from: g */
    public C3894iz f8862g;

    /* renamed from: h */
    public C3929kg f8863h;

    /* renamed from: i */
    public zzjn f8864i;

    /* renamed from: j */
    public C3878ij f8865j;

    /* renamed from: k */
    public C3879ik f8866k;

    /* renamed from: l */
    public C3880il f8867l;

    /* renamed from: m */
    aot f8868m;

    /* renamed from: n */
    aow f8869n;

    /* renamed from: o */
    apq f8870o;

    /* renamed from: p */
    apm f8871p;

    /* renamed from: q */
    apw f8872q;

    /* renamed from: r */
    avi f8873r;

    /* renamed from: s */
    avl f8874s;

    /* renamed from: t */
    avy f8875t;

    /* renamed from: u */
    C0398m<String, avp> f8876u;

    /* renamed from: v */
    C0398m<String, avs> f8877v;

    /* renamed from: w */
    zzpl f8878w;

    /* renamed from: x */
    zzmu f8879x;

    /* renamed from: y */
    zzlu f8880y;

    /* renamed from: z */
    avv f8881z;

    public C3026ax(Context context, zzjn zzjn, String str, zzang zzang) {
        this(context, zzjn, str, zzang, null);
    }

    private C3026ax(Context context, zzjn zzjn, String str, zzang zzang, agw agw) {
        this.f8845G = null;
        this.f8846H = null;
        this.f8847I = 0;
        this.f8848J = false;
        this.f8849K = null;
        this.f8850L = -1;
        this.f8851M = -1;
        this.f8853O = true;
        this.f8854P = true;
        this.f8855Q = false;
        aru.m15024a(context);
        if (C3025aw.m10921i().mo15438b() != null) {
            List b = aru.m15026b();
            if (zzang.f14506b != 0) {
                b.add(Integer.toString(zzang.f14506b));
            }
            C3025aw.m10921i().mo15438b().mo14706a(b);
        }
        this.f8856a = UUID.randomUUID().toString();
        if (zzjn.f14546d || zzjn.f14550h) {
            this.f8861f = null;
        } else {
            C3027ay ayVar = new C3027ay(context, str, zzang.f14505a, this, this);
            this.f8861f = ayVar;
            this.f8861f.setMinimumWidth(zzjn.f14548f);
            this.f8861f.setMinimumHeight(zzjn.f14545c);
            this.f8861f.setVisibility(4);
        }
        this.f8864i = zzjn;
        this.f8857b = str;
        this.f8858c = context;
        this.f8860e = zzang;
        this.f8859d = new agw(new C3097h(this));
        this.f8852N = new C3964lo(200);
        this.f8877v = new C0398m<>();
    }

    /* renamed from: b */
    private final void m10939b(boolean z) {
        if (this.f8861f != null && this.f8865j != null && this.f8865j.f13266b != null && this.f8865j.f13266b.mo15919v() != null) {
            if (!z || this.f8852N.mo15608a()) {
                if (this.f8865j.f13266b.mo15919v().mo15942b()) {
                    int[] iArr = new int[2];
                    this.f8861f.getLocationOnScreen(iArr);
                    aoq.m14615a();
                    int b = C3975lz.m17379b(this.f8858c, iArr[0]);
                    aoq.m14615a();
                    int b2 = C3975lz.m17379b(this.f8858c, iArr[1]);
                    if (!(b == this.f8850L && b2 == this.f8851M)) {
                        this.f8850L = b;
                        this.f8851M = b2;
                        this.f8865j.f13266b.mo15919v().mo15927a(this.f8850L, this.f8851M, !z);
                    }
                }
                if (this.f8861f != null) {
                    View findViewById = this.f8861f.getRootView().findViewById(16908290);
                    if (findViewById != null) {
                        Rect rect = new Rect();
                        Rect rect2 = new Rect();
                        this.f8861f.getGlobalVisibleRect(rect);
                        findViewById.getGlobalVisibleRect(rect2);
                        if (rect.top != rect2.top) {
                            this.f8853O = false;
                        }
                        if (rect.bottom != rect2.bottom) {
                            this.f8854P = false;
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final HashSet<C3880il> mo12521a() {
        return this.f8849K;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo12522a(View view) {
        if (((Boolean) aoq.m14620f().mo14695a(aru.f11835bG)).booleanValue()) {
            ags a = this.f8859d.mo14286a();
            if (a != null) {
                a.mo12629a(view);
            }
        }
    }

    /* renamed from: a */
    public final void mo12523a(HashSet<C3880il> hashSet) {
        this.f8849K = hashSet;
    }

    /* renamed from: a */
    public final void mo12524a(boolean z) {
        if (!(this.f8847I != 0 || this.f8865j == null || this.f8865j.f13266b == null)) {
            this.f8865j.f13266b.stopLoading();
        }
        if (this.f8862g != null) {
            this.f8862g.mo14343b();
        }
        if (this.f8863h != null) {
            this.f8863h.mo14343b();
        }
        if (z) {
            this.f8865j = null;
        }
    }

    /* renamed from: b */
    public final void mo12525b() {
        if (this.f8865j != null && this.f8865j.f13266b != null) {
            this.f8865j.f13266b.destroy();
        }
    }

    /* renamed from: c */
    public final void mo12526c() {
        if (!(this.f8865j == null || this.f8865j.f13280p == null)) {
            try {
                this.f8865j.f13280p.mo15096c();
            } catch (RemoteException unused) {
                C3900je.m17435e("Could not destroy mediation adapter.");
            }
        }
    }

    /* renamed from: d */
    public final boolean mo12527d() {
        return this.f8847I == 0;
    }

    /* renamed from: e */
    public final boolean mo12528e() {
        return this.f8847I == 1;
    }

    /* renamed from: f */
    public final String mo12529f() {
        return (!this.f8853O || !this.f8854P) ? this.f8853O ? this.f8855Q ? "top-scrollable" : "top-locked" : this.f8854P ? this.f8855Q ? "bottom-scrollable" : "bottom-locked" : "" : "";
    }

    public final void onGlobalLayout() {
        m10939b(false);
    }

    public final void onScrollChanged() {
        m10939b(true);
        this.f8855Q = true;
    }
}
