package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.C3025aw;
import com.google.android.gms.ads.internal.gmsg.C3067ae;
import java.util.Map;

@C3718cm
/* renamed from: com.google.android.gms.internal.ads.m */
public final class C3976m extends C4003n implements C3067ae<C4089qe> {

    /* renamed from: a */
    private final C4089qe f13546a;

    /* renamed from: b */
    private final Context f13547b;

    /* renamed from: c */
    private final WindowManager f13548c;

    /* renamed from: d */
    private final arf f13549d;

    /* renamed from: e */
    private DisplayMetrics f13550e;

    /* renamed from: f */
    private float f13551f;

    /* renamed from: g */
    private int f13552g = -1;

    /* renamed from: h */
    private int f13553h = -1;

    /* renamed from: i */
    private int f13554i;

    /* renamed from: j */
    private int f13555j = -1;

    /* renamed from: k */
    private int f13556k = -1;

    /* renamed from: l */
    private int f13557l = -1;

    /* renamed from: m */
    private int f13558m = -1;

    public C3976m(C4089qe qeVar, Context context, arf arf) {
        super(qeVar);
        this.f13546a = qeVar;
        this.f13547b = context;
        this.f13549d = arf;
        this.f13548c = (WindowManager) context.getSystemService("window");
    }

    /* renamed from: a */
    public final void mo15625a(int i, int i2) {
        int i3 = 0;
        if (this.f13547b instanceof Activity) {
            i3 = C3025aw.m10917e().mo15526c((Activity) this.f13547b)[0];
        }
        if (this.f13546a.mo15917t() == null || !this.f13546a.mo15917t().mo15997d()) {
            aoq.m14615a();
            this.f13557l = C3975lz.m17379b(this.f13547b, this.f13546a.getWidth());
            aoq.m14615a();
            this.f13558m = C3975lz.m17379b(this.f13547b, this.f13546a.getHeight());
        }
        mo15653b(i, i2 - i3, this.f13557l, this.f13558m);
        this.f13546a.mo15919v().mo15926a(i, i2);
    }

    public final /* synthetic */ void zza(Object obj, Map map) {
        int i;
        this.f13550e = new DisplayMetrics();
        Display defaultDisplay = this.f13548c.getDefaultDisplay();
        defaultDisplay.getMetrics(this.f13550e);
        this.f13551f = this.f13550e.density;
        this.f13554i = defaultDisplay.getRotation();
        aoq.m14615a();
        this.f13552g = C3975lz.m17380b(this.f13550e, this.f13550e.widthPixels);
        aoq.m14615a();
        this.f13553h = C3975lz.m17380b(this.f13550e, this.f13550e.heightPixels);
        Activity d = this.f13546a.mo15801d();
        if (d == null || d.getWindow() == null) {
            this.f13555j = this.f13552g;
            i = this.f13553h;
        } else {
            C3025aw.m10917e();
            int[] a = C3909jn.m17150a(d);
            aoq.m14615a();
            this.f13555j = C3975lz.m17380b(this.f13550e, a[0]);
            aoq.m14615a();
            i = C3975lz.m17380b(this.f13550e, a[1]);
        }
        this.f13556k = i;
        if (this.f13546a.mo15917t().mo15997d()) {
            this.f13557l = this.f13552g;
            this.f13558m = this.f13553h;
        } else {
            this.f13546a.measure(0, 0);
        }
        mo15651a(this.f13552g, this.f13553h, this.f13555j, this.f13556k, this.f13551f, this.f13554i);
        this.f13546a.mo14987a("onDeviceFeaturesReceived", new C3895j(new C3949l().mo15595b(this.f13549d.mo14675a()).mo15594a(this.f13549d.mo14676b()).mo15596c(this.f13549d.mo14678d()).mo15597d(this.f13549d.mo14677c()).mo15598e(true)).mo15476a());
        int[] iArr = new int[2];
        this.f13546a.getLocationOnScreen(iArr);
        aoq.m14615a();
        int b = C3975lz.m17379b(this.f13547b, iArr[0]);
        aoq.m14615a();
        mo15625a(b, C3975lz.m17379b(this.f13547b, iArr[1]));
        if (C3900je.m17428a(2)) {
            C3900je.m17433d("Dispatching Ready Event.");
        }
        mo15654b(this.f13546a.mo15807k().f14505a);
    }
}
