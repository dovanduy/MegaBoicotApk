package com.google.android.gms.ads.internal;

import android.os.Build.VERSION;
import com.google.android.gms.ads.internal.overlay.C3105a;
import com.google.android.gms.ads.internal.overlay.C3115k;
import com.google.android.gms.ads.internal.overlay.C3124t;
import com.google.android.gms.ads.internal.overlay.C3125u;
import com.google.android.gms.common.util.C3553e;
import com.google.android.gms.common.util.C3556h;
import com.google.android.gms.internal.ads.C3663ao;
import com.google.android.gms.internal.ads.C3718cm;
import com.google.android.gms.internal.ads.C3719cn;
import com.google.android.gms.internal.ads.C3792fe;
import com.google.android.gms.internal.ads.C3867hz;
import com.google.android.gms.internal.ads.C3883io;
import com.google.android.gms.internal.ads.C3892ix;
import com.google.android.gms.internal.ads.C3909jn;
import com.google.android.gms.internal.ads.C3915jt;
import com.google.android.gms.internal.ads.C3920jy;
import com.google.android.gms.internal.ads.C3921jz;
import com.google.android.gms.internal.ads.C3923ka;
import com.google.android.gms.internal.ads.C3924kb;
import com.google.android.gms.internal.ads.C3925kc;
import com.google.android.gms.internal.ads.C3927ke;
import com.google.android.gms.internal.ads.C3928kf;
import com.google.android.gms.internal.ads.C3937ko;
import com.google.android.gms.internal.ads.C3961ll;
import com.google.android.gms.internal.ads.C3962lm;
import com.google.android.gms.internal.ads.C3971lv;
import com.google.android.gms.internal.ads.C4020nq;
import com.google.android.gms.internal.ads.C4027nx;
import com.google.android.gms.internal.ads.C4057p;
import com.google.android.gms.internal.ads.C4072po;
import com.google.android.gms.internal.ads.C4096ql;
import com.google.android.gms.internal.ads.aky;
import com.google.android.gms.internal.ads.alv;
import com.google.android.gms.internal.ads.alw;
import com.google.android.gms.internal.ads.ami;
import com.google.android.gms.internal.ads.arz;
import com.google.android.gms.internal.ads.ayf;
import com.google.android.gms.internal.ads.aza;
import com.google.android.gms.internal.ads.bas;
import com.google.android.gms.internal.ads.bbt;

@C3718cm
/* renamed from: com.google.android.gms.ads.internal.aw */
public final class C3025aw {

    /* renamed from: a */
    private static final Object f8803a = new Object();

    /* renamed from: b */
    private static C3025aw f8804b;

    /* renamed from: A */
    private final C3005ac f8805A;

    /* renamed from: B */
    private final C4057p f8806B;

    /* renamed from: C */
    private final ami f8807C;

    /* renamed from: D */
    private final C3867hz f8808D;

    /* renamed from: E */
    private final C4072po f8809E;

    /* renamed from: F */
    private final C4027nx f8810F;

    /* renamed from: G */
    private final aza f8811G;

    /* renamed from: H */
    private final C3928kf f8812H;

    /* renamed from: I */
    private final C3971lv f8813I;

    /* renamed from: J */
    private final C3892ix f8814J;

    /* renamed from: c */
    private final C3105a f8815c = new C3105a();

    /* renamed from: d */
    private final C3719cn f8816d = new C3719cn();

    /* renamed from: e */
    private final C3115k f8817e = new C3115k();

    /* renamed from: f */
    private final C3663ao f8818f = new C3663ao();

    /* renamed from: g */
    private final C3909jn f8819g = new C3909jn();

    /* renamed from: h */
    private final C4096ql f8820h = new C4096ql();

    /* renamed from: i */
    private final C3915jt f8821i;

    /* renamed from: j */
    private final aky f8822j;

    /* renamed from: k */
    private final C3883io f8823k;

    /* renamed from: l */
    private final alv f8824l;

    /* renamed from: m */
    private final alw f8825m;

    /* renamed from: n */
    private final C3553e f8826n;

    /* renamed from: o */
    private final C3055e f8827o;

    /* renamed from: p */
    private final arz f8828p;

    /* renamed from: q */
    private final C3937ko f8829q;

    /* renamed from: r */
    private final C3792fe f8830r;

    /* renamed from: s */
    private final C4020nq f8831s;

    /* renamed from: t */
    private final ayf f8832t;

    /* renamed from: u */
    private final bas f8833u;

    /* renamed from: v */
    private final C3961ll f8834v;

    /* renamed from: w */
    private final C3124t f8835w;

    /* renamed from: x */
    private final C3125u f8836x;

    /* renamed from: y */
    private final bbt f8837y;

    /* renamed from: z */
    private final C3962lm f8838z;

    static {
        C3025aw awVar = new C3025aw();
        synchronized (f8803a) {
            f8804b = awVar;
        }
    }

    protected C3025aw() {
        int i = VERSION.SDK_INT;
        C3915jt jtVar = i >= 21 ? new C3927ke() : i >= 19 ? new C3925kc() : i >= 18 ? new C3923ka() : i >= 17 ? new C3921jz() : i >= 16 ? new C3924kb() : new C3920jy();
        this.f8821i = jtVar;
        this.f8822j = new aky();
        this.f8823k = new C3883io();
        this.f8814J = new C3892ix();
        this.f8824l = new alv();
        this.f8825m = new alw();
        this.f8826n = C3556h.m12745d();
        this.f8827o = new C3055e();
        this.f8828p = new arz();
        this.f8829q = new C3937ko();
        this.f8830r = new C3792fe();
        this.f8811G = new aza();
        this.f8831s = new C4020nq();
        this.f8832t = new ayf();
        this.f8833u = new bas();
        this.f8834v = new C3961ll();
        this.f8835w = new C3124t();
        this.f8836x = new C3125u();
        this.f8837y = new bbt();
        this.f8838z = new C3962lm();
        this.f8805A = new C3005ac();
        this.f8806B = new C4057p();
        this.f8807C = new ami();
        this.f8808D = new C3867hz();
        this.f8809E = new C4072po();
        this.f8810F = new C4027nx();
        this.f8812H = new C3928kf();
        this.f8813I = new C3971lv();
    }

    /* renamed from: A */
    public static C4027nx m10907A() {
        return m10912F().f8810F;
    }

    /* renamed from: B */
    public static C3867hz m10908B() {
        return m10912F().f8808D;
    }

    /* renamed from: C */
    public static aza m10909C() {
        return m10912F().f8811G;
    }

    /* renamed from: D */
    public static C3928kf m10910D() {
        return m10912F().f8812H;
    }

    /* renamed from: E */
    public static C3971lv m10911E() {
        return m10912F().f8813I;
    }

    /* renamed from: F */
    private static C3025aw m10912F() {
        C3025aw awVar;
        synchronized (f8803a) {
            awVar = f8804b;
        }
        return awVar;
    }

    /* renamed from: a */
    public static C3719cn m10913a() {
        return m10912F().f8816d;
    }

    /* renamed from: b */
    public static C3105a m10914b() {
        return m10912F().f8815c;
    }

    /* renamed from: c */
    public static C3115k m10915c() {
        return m10912F().f8817e;
    }

    /* renamed from: d */
    public static C3663ao m10916d() {
        return m10912F().f8818f;
    }

    /* renamed from: e */
    public static C3909jn m10917e() {
        return m10912F().f8819g;
    }

    /* renamed from: f */
    public static C4096ql m10918f() {
        return m10912F().f8820h;
    }

    /* renamed from: g */
    public static C3915jt m10919g() {
        return m10912F().f8821i;
    }

    /* renamed from: h */
    public static aky m10920h() {
        return m10912F().f8822j;
    }

    /* renamed from: i */
    public static C3883io m10921i() {
        return m10912F().f8823k;
    }

    /* renamed from: j */
    public static C3892ix m10922j() {
        return m10912F().f8814J;
    }

    /* renamed from: k */
    public static alw m10923k() {
        return m10912F().f8825m;
    }

    /* renamed from: l */
    public static C3553e m10924l() {
        return m10912F().f8826n;
    }

    /* renamed from: m */
    public static C3055e m10925m() {
        return m10912F().f8827o;
    }

    /* renamed from: n */
    public static arz m10926n() {
        return m10912F().f8828p;
    }

    /* renamed from: o */
    public static C3937ko m10927o() {
        return m10912F().f8829q;
    }

    /* renamed from: p */
    public static C3792fe m10928p() {
        return m10912F().f8830r;
    }

    /* renamed from: q */
    public static C4020nq m10929q() {
        return m10912F().f8831s;
    }

    /* renamed from: r */
    public static ayf m10930r() {
        return m10912F().f8832t;
    }

    /* renamed from: s */
    public static bas m10931s() {
        return m10912F().f8833u;
    }

    /* renamed from: t */
    public static C3961ll m10932t() {
        return m10912F().f8834v;
    }

    /* renamed from: u */
    public static C4057p m10933u() {
        return m10912F().f8806B;
    }

    /* renamed from: v */
    public static C3124t m10934v() {
        return m10912F().f8835w;
    }

    /* renamed from: w */
    public static C3125u m10935w() {
        return m10912F().f8836x;
    }

    /* renamed from: x */
    public static bbt m10936x() {
        return m10912F().f8837y;
    }

    /* renamed from: y */
    public static C3962lm m10937y() {
        return m10912F().f8838z;
    }

    /* renamed from: z */
    public static C4072po m10938z() {
        return m10912F().f8809E;
    }
}
