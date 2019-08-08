package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebChromeClient.CustomViewCallback;
import android.widget.FrameLayout;
import android.widget.RelativeLayout.LayoutParams;
import com.appnext.base.p046b.C1245d;
import com.facebook.ads.AdError;
import com.google.android.gms.ads.internal.C3025aw;
import com.google.android.gms.common.util.C3563o;
import com.google.android.gms.internal.ads.C3718cm;
import com.google.android.gms.internal.ads.C3900je;
import com.google.android.gms.internal.ads.C3909jn;
import com.google.android.gms.internal.ads.C3915jt;
import com.google.android.gms.internal.ads.C4003n;
import com.google.android.gms.internal.ads.C4089qe;
import com.google.android.gms.internal.ads.C4138s;
import com.google.android.gms.internal.ads.aoq;
import com.google.android.gms.internal.ads.aru;
import com.google.android.gms.p137b.C3235a;
import com.google.android.gms.p137b.C3238b;
import java.util.Collections;

@C3718cm
/* renamed from: com.google.android.gms.ads.internal.overlay.c */
public class C3107c extends C4138s implements C3126v {

    /* renamed from: e */
    private static final int f9079e = Color.argb(0, 0, 0, 0);

    /* renamed from: a */
    protected final Activity f9080a;

    /* renamed from: b */
    AdOverlayInfoParcel f9081b;

    /* renamed from: c */
    C4089qe f9082c;

    /* renamed from: d */
    int f9083d = 0;

    /* renamed from: f */
    private C3112h f9084f;

    /* renamed from: g */
    private C3118n f9085g;

    /* renamed from: h */
    private boolean f9086h = false;

    /* renamed from: i */
    private FrameLayout f9087i;

    /* renamed from: j */
    private CustomViewCallback f9088j;

    /* renamed from: k */
    private boolean f9089k = false;

    /* renamed from: l */
    private boolean f9090l = false;

    /* renamed from: m */
    private C3111g f9091m;

    /* renamed from: n */
    private boolean f9092n = false;

    /* renamed from: o */
    private final Object f9093o = new Object();

    /* renamed from: p */
    private Runnable f9094p;

    /* renamed from: q */
    private boolean f9095q;

    /* renamed from: r */
    private boolean f9096r;

    /* renamed from: s */
    private boolean f9097s = false;

    /* renamed from: t */
    private boolean f9098t = false;

    /* renamed from: u */
    private boolean f9099u = true;

    public C3107c(Activity activity) {
        this.f9080a = activity;
    }

    /* renamed from: a */
    private final void m11175a(boolean z) {
        int intValue = ((Integer) aoq.m14620f().mo14695a(aru.f11961da)).intValue();
        C3119o oVar = new C3119o();
        oVar.f9117e = 50;
        oVar.f9113a = z ? intValue : 0;
        oVar.f9114b = z ? 0 : intValue;
        oVar.f9115c = 0;
        oVar.f9116d = intValue;
        this.f9085g = new C3118n(this.f9080a, oVar, this);
        LayoutParams layoutParams = new LayoutParams(-2, -2);
        layoutParams.addRule(10);
        layoutParams.addRule(z ? 11 : 9);
        mo12666a(z, this.f9081b.f9069g);
        this.f9091m.addView(this.f9085g, layoutParams);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00ce, code lost:
        if (r1.f9080a.getResources().getConfiguration().orientation == 1) goto L_0x00d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00ef, code lost:
        if (r1.f9080a.getResources().getConfiguration().orientation == 2) goto L_0x00d0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x0242  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x0267  */
    /* JADX WARNING: Removed duplicated region for block: B:110:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x011b  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0124  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x012c  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x013c A[SYNTHETIC, Splitter:B:61:0x013c] */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0215  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m11176b(boolean r20) throws com.google.android.gms.ads.internal.overlay.C3110f {
        /*
            r19 = this;
            r1 = r19
            boolean r3 = r1.f9096r
            r4 = 1
            if (r3 != 0) goto L_0x000c
            android.app.Activity r3 = r1.f9080a
            r3.requestWindowFeature(r4)
        L_0x000c:
            android.app.Activity r3 = r1.f9080a
            android.view.Window r3 = r3.getWindow()
            if (r3 != 0) goto L_0x001c
            com.google.android.gms.ads.internal.overlay.f r2 = new com.google.android.gms.ads.internal.overlay.f
            java.lang.String r3 = "Invalid activity, no window available."
            r2.<init>(r3)
            throw r2
        L_0x001c:
            boolean r5 = com.google.android.gms.common.util.C3563o.m12772k()
            if (r5 == 0) goto L_0x0048
            com.google.android.gms.internal.ads.ark<java.lang.Boolean> r5 = com.google.android.gms.internal.ads.aru.f11906cY
            com.google.android.gms.internal.ads.ars r6 = com.google.android.gms.internal.ads.aoq.m14620f()
            java.lang.Object r5 = r6.mo14695a(r5)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L_0x0048
            com.google.android.gms.ads.internal.C3025aw.m10917e()
            android.app.Activity r5 = r1.f9080a
            android.app.Activity r6 = r1.f9080a
            android.content.res.Resources r6 = r6.getResources()
            android.content.res.Configuration r6 = r6.getConfiguration()
            boolean r5 = com.google.android.gms.internal.ads.C3909jn.m17145a(r5, r6)
            goto L_0x0049
        L_0x0048:
            r5 = r4
        L_0x0049:
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r6 = r1.f9081b
            com.google.android.gms.ads.internal.zzaq r6 = r6.f9077o
            r7 = 0
            if (r6 == 0) goto L_0x005a
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r6 = r1.f9081b
            com.google.android.gms.ads.internal.zzaq r6 = r6.f9077o
            boolean r6 = r6.f9154b
            if (r6 == 0) goto L_0x005a
            r6 = r4
            goto L_0x005b
        L_0x005a:
            r6 = r7
        L_0x005b:
            boolean r8 = r1.f9090l
            if (r8 == 0) goto L_0x0061
            if (r6 == 0) goto L_0x0097
        L_0x0061:
            if (r5 == 0) goto L_0x0097
            r5 = 1024(0x400, float:1.435E-42)
            r3.setFlags(r5, r5)
            com.google.android.gms.internal.ads.ark<java.lang.Boolean> r5 = com.google.android.gms.internal.ads.aru.f11792aQ
            com.google.android.gms.internal.ads.ars r6 = com.google.android.gms.internal.ads.aoq.m14620f()
            java.lang.Object r5 = r6.mo14695a(r5)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L_0x0097
            boolean r5 = com.google.android.gms.common.util.C3563o.m12768g()
            if (r5 == 0) goto L_0x0097
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r5 = r1.f9081b
            com.google.android.gms.ads.internal.zzaq r5 = r5.f9077o
            if (r5 == 0) goto L_0x0097
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r5 = r1.f9081b
            com.google.android.gms.ads.internal.zzaq r5 = r5.f9077o
            boolean r5 = r5.f9158f
            if (r5 == 0) goto L_0x0097
            android.view.View r5 = r3.getDecorView()
            r6 = 4098(0x1002, float:5.743E-42)
            r5.setSystemUiVisibility(r6)
        L_0x0097:
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r5 = r1.f9081b
            com.google.android.gms.internal.ads.qe r5 = r5.f9066d
            r6 = 0
            if (r5 == 0) goto L_0x00a7
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r5 = r1.f9081b
            com.google.android.gms.internal.ads.qe r5 = r5.f9066d
            com.google.android.gms.internal.ads.rm r5 = r5.mo15919v()
            goto L_0x00a8
        L_0x00a7:
            r5 = r6
        L_0x00a8:
            if (r5 == 0) goto L_0x00af
            boolean r5 = r5.mo15942b()
            goto L_0x00b0
        L_0x00af:
            r5 = r7
        L_0x00b0:
            r1.f9092n = r7
            if (r5 == 0) goto L_0x00f2
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r8 = r1.f9081b
            int r8 = r8.f9072j
            com.google.android.gms.internal.ads.jt r9 = com.google.android.gms.ads.internal.C3025aw.m10919g()
            int r9 = r9.mo15533a()
            if (r8 != r9) goto L_0x00d4
            android.app.Activity r8 = r1.f9080a
            android.content.res.Resources r8 = r8.getResources()
            android.content.res.Configuration r8 = r8.getConfiguration()
            int r8 = r8.orientation
            if (r8 != r4) goto L_0x00d1
        L_0x00d0:
            r7 = r4
        L_0x00d1:
            r1.f9092n = r7
            goto L_0x00f2
        L_0x00d4:
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r8 = r1.f9081b
            int r8 = r8.f9072j
            com.google.android.gms.internal.ads.jt r9 = com.google.android.gms.ads.internal.C3025aw.m10919g()
            int r9 = r9.mo15546b()
            if (r8 != r9) goto L_0x00f2
            android.app.Activity r8 = r1.f9080a
            android.content.res.Resources r8 = r8.getResources()
            android.content.res.Configuration r8 = r8.getConfiguration()
            int r8 = r8.orientation
            r9 = 2
            if (r8 != r9) goto L_0x00d1
            goto L_0x00d0
        L_0x00f2:
            boolean r7 = r1.f9092n
            r8 = 46
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>(r8)
            java.lang.String r8 = "Delay onShow to next orientation change: "
            r9.append(r8)
            r9.append(r7)
            java.lang.String r7 = r9.toString()
            com.google.android.gms.internal.ads.C3900je.m17429b(r7)
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r7 = r1.f9081b
            int r7 = r7.f9072j
            r1.mo12661a(r7)
            com.google.android.gms.internal.ads.jt r7 = com.google.android.gms.ads.internal.C3025aw.m10919g()
            boolean r3 = r7.mo15545a(r3)
            if (r3 == 0) goto L_0x0120
            java.lang.String r3 = "Hardware acceleration on the AdActivity window enabled."
            com.google.android.gms.internal.ads.C3900je.m17429b(r3)
        L_0x0120:
            boolean r3 = r1.f9090l
            if (r3 != 0) goto L_0x012c
            com.google.android.gms.ads.internal.overlay.g r3 = r1.f9091m
            r7 = -16777216(0xffffffffff000000, float:-1.7014118E38)
        L_0x0128:
            r3.setBackgroundColor(r7)
            goto L_0x0131
        L_0x012c:
            com.google.android.gms.ads.internal.overlay.g r3 = r1.f9091m
            int r7 = f9079e
            goto L_0x0128
        L_0x0131:
            android.app.Activity r3 = r1.f9080a
            com.google.android.gms.ads.internal.overlay.g r7 = r1.f9091m
            r3.setContentView(r7)
            r1.f9096r = r4
            if (r20 == 0) goto L_0x0215
            com.google.android.gms.ads.internal.C3025aw.m10918f()     // Catch:{ Exception -> 0x0206 }
            android.app.Activity r8 = r1.f9080a     // Catch:{ Exception -> 0x0206 }
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r3 = r1.f9081b     // Catch:{ Exception -> 0x0206 }
            com.google.android.gms.internal.ads.qe r3 = r3.f9066d     // Catch:{ Exception -> 0x0206 }
            if (r3 == 0) goto L_0x0151
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r3 = r1.f9081b     // Catch:{ Exception -> 0x0206 }
            com.google.android.gms.internal.ads.qe r3 = r3.f9066d     // Catch:{ Exception -> 0x0206 }
            com.google.android.gms.internal.ads.rs r3 = r3.mo15917t()     // Catch:{ Exception -> 0x0206 }
            r9 = r3
            goto L_0x0152
        L_0x0151:
            r9 = r6
        L_0x0152:
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r3 = r1.f9081b     // Catch:{ Exception -> 0x0206 }
            com.google.android.gms.internal.ads.qe r3 = r3.f9066d     // Catch:{ Exception -> 0x0206 }
            if (r3 == 0) goto L_0x0162
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r3 = r1.f9081b     // Catch:{ Exception -> 0x0206 }
            com.google.android.gms.internal.ads.qe r3 = r3.f9066d     // Catch:{ Exception -> 0x0206 }
            java.lang.String r3 = r3.mo15918u()     // Catch:{ Exception -> 0x0206 }
            r10 = r3
            goto L_0x0163
        L_0x0162:
            r10 = r6
        L_0x0163:
            r11 = 1
            r13 = 0
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r3 = r1.f9081b     // Catch:{ Exception -> 0x0206 }
            com.google.android.gms.internal.ads.zzang r14 = r3.f9075m     // Catch:{ Exception -> 0x0206 }
            r15 = 0
            r16 = 0
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r3 = r1.f9081b     // Catch:{ Exception -> 0x0206 }
            com.google.android.gms.internal.ads.qe r3 = r3.f9066d     // Catch:{ Exception -> 0x0206 }
            if (r3 == 0) goto L_0x017d
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r3 = r1.f9081b     // Catch:{ Exception -> 0x0206 }
            com.google.android.gms.internal.ads.qe r3 = r3.f9066d     // Catch:{ Exception -> 0x0206 }
            com.google.android.gms.ads.internal.bt r3 = r3.mo15802e()     // Catch:{ Exception -> 0x0206 }
            r17 = r3
            goto L_0x017f
        L_0x017d:
            r17 = r6
        L_0x017f:
            com.google.android.gms.internal.ads.amj r18 = com.google.android.gms.internal.ads.amj.m14431a()     // Catch:{ Exception -> 0x0206 }
            r12 = r5
            com.google.android.gms.internal.ads.qe r3 = com.google.android.gms.internal.ads.C4096ql.m17760a(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)     // Catch:{ Exception -> 0x0206 }
            r1.f9082c = r3     // Catch:{ Exception -> 0x0206 }
            com.google.android.gms.internal.ads.qe r3 = r1.f9082c
            com.google.android.gms.internal.ads.rm r7 = r3.mo15919v()
            r8 = 0
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r3 = r1.f9081b
            com.google.android.gms.ads.internal.gmsg.k r9 = r3.f9078p
            r10 = 0
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r3 = r1.f9081b
            com.google.android.gms.ads.internal.gmsg.m r11 = r3.f9067e
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r3 = r1.f9081b
            com.google.android.gms.ads.internal.overlay.s r12 = r3.f9071i
            r13 = 1
            r14 = 0
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r3 = r1.f9081b
            com.google.android.gms.internal.ads.qe r3 = r3.f9066d
            if (r3 == 0) goto L_0x01b2
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r3 = r1.f9081b
            com.google.android.gms.internal.ads.qe r3 = r3.f9066d
            com.google.android.gms.internal.ads.rm r3 = r3.mo15919v()
            com.google.android.gms.ads.internal.bu r6 = r3.mo15925a()
        L_0x01b2:
            r15 = r6
            r16 = 0
            r17 = 0
            r7.mo15930a(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            com.google.android.gms.internal.ads.qe r3 = r1.f9082c
            com.google.android.gms.internal.ads.rm r3 = r3.mo15919v()
            com.google.android.gms.ads.internal.overlay.d r6 = new com.google.android.gms.ads.internal.overlay.d
            r6.<init>(r1)
            r3.mo15931a(r6)
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r3 = r1.f9081b
            java.lang.String r3 = r3.f9074l
            if (r3 == 0) goto L_0x01d8
            com.google.android.gms.internal.ads.qe r3 = r1.f9082c
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r6 = r1.f9081b
            java.lang.String r6 = r6.f9074l
            r3.loadUrl(r6)
            goto L_0x01f0
        L_0x01d8:
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r3 = r1.f9081b
            java.lang.String r3 = r3.f9070h
            if (r3 == 0) goto L_0x01fe
            com.google.android.gms.internal.ads.qe r6 = r1.f9082c
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r3 = r1.f9081b
            java.lang.String r7 = r3.f9068f
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r3 = r1.f9081b
            java.lang.String r8 = r3.f9070h
            java.lang.String r9 = "text/html"
            java.lang.String r10 = "UTF-8"
            r11 = 0
            r6.loadDataWithBaseURL(r7, r8, r9, r10, r11)
        L_0x01f0:
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r3 = r1.f9081b
            com.google.android.gms.internal.ads.qe r3 = r3.f9066d
            if (r3 == 0) goto L_0x0222
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r3 = r1.f9081b
            com.google.android.gms.internal.ads.qe r3 = r3.f9066d
            r3.mo15883b(r1)
            goto L_0x0222
        L_0x01fe:
            com.google.android.gms.ads.internal.overlay.f r2 = new com.google.android.gms.ads.internal.overlay.f
            java.lang.String r3 = "No URL or HTML to display in ad overlay."
            r2.<init>(r3)
            throw r2
        L_0x0206:
            r0 = move-exception
            r2 = r0
            java.lang.String r3 = "Error obtaining webview."
            com.google.android.gms.internal.ads.C3900je.m17430b(r3, r2)
            com.google.android.gms.ads.internal.overlay.f r2 = new com.google.android.gms.ads.internal.overlay.f
            java.lang.String r3 = "Could not obtain webview for the overlay."
            r2.<init>(r3)
            throw r2
        L_0x0215:
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r3 = r1.f9081b
            com.google.android.gms.internal.ads.qe r3 = r3.f9066d
            r1.f9082c = r3
            com.google.android.gms.internal.ads.qe r3 = r1.f9082c
            android.app.Activity r6 = r1.f9080a
            r3.mo15875a(r6)
        L_0x0222:
            com.google.android.gms.internal.ads.qe r3 = r1.f9082c
            r3.mo15876a(r1)
            com.google.android.gms.internal.ads.qe r3 = r1.f9082c
            android.view.ViewParent r3 = r3.getParent()
            if (r3 == 0) goto L_0x023e
            boolean r6 = r3 instanceof android.view.ViewGroup
            if (r6 == 0) goto L_0x023e
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            com.google.android.gms.internal.ads.qe r6 = r1.f9082c
            android.view.View r6 = r6.getView()
            r3.removeView(r6)
        L_0x023e:
            boolean r3 = r1.f9090l
            if (r3 == 0) goto L_0x0247
            com.google.android.gms.internal.ads.qe r3 = r1.f9082c
            r3.mo15872I()
        L_0x0247:
            com.google.android.gms.ads.internal.overlay.g r3 = r1.f9091m
            com.google.android.gms.internal.ads.qe r6 = r1.f9082c
            android.view.View r6 = r6.getView()
            r7 = -1
            r3.addView(r6, r7, r7)
            if (r20 != 0) goto L_0x025c
            boolean r2 = r1.f9092n
            if (r2 != 0) goto L_0x025c
            r19.m11178s()
        L_0x025c:
            r1.m11175a(r5)
            com.google.android.gms.internal.ads.qe r2 = r1.f9082c
            boolean r2 = r2.mo15921x()
            if (r2 == 0) goto L_0x026a
            r1.mo12666a(r5, r4)
        L_0x026a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.overlay.C3107c.m11176b(boolean):void");
    }

    /* renamed from: r */
    private final void m11177r() {
        if (this.f9080a.isFinishing() && !this.f9097s) {
            this.f9097s = true;
            if (this.f9082c != null) {
                this.f9082c.mo15874a(this.f9083d);
                synchronized (this.f9093o) {
                    if (!this.f9095q && this.f9082c.mo15868E()) {
                        this.f9094p = new C3109e(this);
                        C3909jn.f13411a.postDelayed(this.f9094p, ((Long) aoq.m14620f().mo14695a(aru.f11791aP)).longValue());
                        return;
                    }
                }
            }
            mo12680n();
        }
    }

    /* renamed from: s */
    private final void m11178s() {
        this.f9082c.mo15904o();
    }

    /* renamed from: a */
    public final void mo12660a() {
        this.f9083d = 2;
        this.f9080a.finish();
    }

    /* renamed from: a */
    public final void mo12661a(int i) {
        if (this.f9080a.getApplicationInfo().targetSdkVersion >= ((Integer) aoq.m14620f().mo14695a(aru.f11974dn)).intValue()) {
            if (this.f9080a.getApplicationInfo().targetSdkVersion <= ((Integer) aoq.m14620f().mo14695a(aru.f11975do)).intValue()) {
                if (VERSION.SDK_INT >= ((Integer) aoq.m14620f().mo14695a(aru.f11976dp)).intValue()) {
                    if (VERSION.SDK_INT <= ((Integer) aoq.m14620f().mo14695a(aru.f11977dq)).intValue()) {
                        return;
                    }
                }
            }
        }
        this.f9080a.setRequestedOrientation(i);
    }

    /* renamed from: a */
    public final void mo12662a(int i, int i2, Intent intent) {
    }

    /* renamed from: a */
    public void mo12663a(Bundle bundle) {
        this.f9080a.requestWindowFeature(1);
        this.f9089k = bundle != null ? bundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false) : false;
        try {
            this.f9081b = AdOverlayInfoParcel.m11171a(this.f9080a.getIntent());
            if (this.f9081b == null) {
                throw new C3110f("Could not get info for ad overlay.");
            }
            if (this.f9081b.f9075m.f14507c > 7500000) {
                this.f9083d = 3;
            }
            if (this.f9080a.getIntent() != null) {
                this.f9099u = this.f9080a.getIntent().getBooleanExtra("shouldCallOnOverlayOpened", true);
            }
            if (this.f9081b.f9077o != null) {
                this.f9090l = this.f9081b.f9077o.f9153a;
            } else {
                this.f9090l = false;
            }
            if (((Boolean) aoq.m14620f().mo14695a(aru.f11846bR)).booleanValue() && this.f9090l && this.f9081b.f9077o.f9157e != -1) {
                new C3113i(this, null).mo15475h();
            }
            if (bundle == null) {
                if (this.f9081b.f9065c != null && this.f9099u) {
                    this.f9081b.f9065c.mo12556g();
                }
                if (!(this.f9081b.f9073k == 1 || this.f9081b.f9064b == null)) {
                    this.f9081b.f9064b.mo9646e();
                }
            }
            this.f9091m = new C3111g(this.f9080a, this.f9081b.f9076n, this.f9081b.f9075m.f14505a);
            this.f9091m.setId(AdError.NETWORK_ERROR_CODE);
            switch (this.f9081b.f9073k) {
                case 1:
                    m11176b(false);
                    return;
                case 2:
                    this.f9084f = new C3112h(this.f9081b.f9066d);
                    m11176b(false);
                    return;
                case 3:
                    m11176b(true);
                    return;
                default:
                    throw new C3110f("Could not determine ad overlay type.");
            }
        } catch (C3110f e) {
            C3900je.m17435e(e.getMessage());
            this.f9083d = 3;
            this.f9080a.finish();
        }
    }

    /* renamed from: a */
    public final void mo12664a(View view, CustomViewCallback customViewCallback) {
        this.f9087i = new FrameLayout(this.f9080a);
        this.f9087i.setBackgroundColor(-16777216);
        this.f9087i.addView(view, -1, -1);
        this.f9080a.setContentView(this.f9087i);
        this.f9096r = true;
        this.f9088j = customViewCallback;
        this.f9086h = true;
    }

    /* renamed from: a */
    public final void mo12665a(C3235a aVar) {
        if (((Boolean) aoq.m14620f().mo14695a(aru.f11906cY)).booleanValue() && C3563o.m12772k()) {
            Configuration configuration = (Configuration) C3238b.m11574a(aVar);
            C3025aw.m10917e();
            if (C3909jn.m17145a(this.f9080a, configuration)) {
                this.f9080a.getWindow().addFlags(C1245d.f3947iP);
                this.f9080a.getWindow().clearFlags(2048);
                return;
            }
            this.f9080a.getWindow().addFlags(2048);
            this.f9080a.getWindow().clearFlags(C1245d.f3947iP);
        }
    }

    /* renamed from: a */
    public final void mo12666a(boolean z, boolean z2) {
        boolean z3 = false;
        boolean z4 = ((Boolean) aoq.m14620f().mo14695a(aru.f11793aR)).booleanValue() && this.f9081b != null && this.f9081b.f9077o != null && this.f9081b.f9077o.f9159g;
        boolean z5 = ((Boolean) aoq.m14620f().mo14695a(aru.f11794aS)).booleanValue() && this.f9081b != null && this.f9081b.f9077o != null && this.f9081b.f9077o.f9160h;
        if (z && z2 && z4 && !z5) {
            new C4003n(this.f9082c, "useCustomClose").mo15652a("Custom close has been disabled for interstitial ads in this ad slot.");
        }
        if (this.f9085g != null) {
            C3118n nVar = this.f9085g;
            if (z5 || (z2 && !z4)) {
                z3 = true;
            }
            nVar.mo12692a(z3);
        }
    }

    /* renamed from: b */
    public final void mo12667b() {
        if (this.f9081b != null && this.f9086h) {
            mo12661a(this.f9081b.f9072j);
        }
        if (this.f9087i != null) {
            this.f9080a.setContentView(this.f9091m);
            this.f9096r = true;
            this.f9087i.removeAllViews();
            this.f9087i = null;
        }
        if (this.f9088j != null) {
            this.f9088j.onCustomViewHidden();
            this.f9088j = null;
        }
        this.f9086h = false;
    }

    /* renamed from: b */
    public final void mo12668b(Bundle bundle) {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.f9089k);
    }

    /* renamed from: c */
    public final void mo12669c() {
        this.f9083d = 1;
        this.f9080a.finish();
    }

    /* renamed from: d */
    public final void mo12670d() {
        this.f9083d = 0;
    }

    /* renamed from: e */
    public final boolean mo12671e() {
        this.f9083d = 0;
        if (this.f9082c == null) {
            return true;
        }
        boolean C = this.f9082c.mo15866C();
        if (!C) {
            this.f9082c.mo14986a("onbackblocked", Collections.emptyMap());
        }
        return C;
    }

    /* renamed from: f */
    public final void mo12672f() {
    }

    /* renamed from: g */
    public final void mo12673g() {
        if (((Boolean) aoq.m14620f().mo14695a(aru.f11907cZ)).booleanValue()) {
            if (this.f9082c == null || this.f9082c.mo15864A()) {
                C3900je.m17435e("The webview does not exist. Ignoring action.");
            } else {
                C3025aw.m10919g();
                C3915jt.m17196b(this.f9082c);
            }
        }
    }

    /* renamed from: h */
    public final void mo12674h() {
        if (this.f9081b.f9065c != null) {
            this.f9081b.f9065c.mo12555f();
        }
        if (!((Boolean) aoq.m14620f().mo14695a(aru.f11907cZ)).booleanValue()) {
            if (this.f9082c == null || this.f9082c.mo15864A()) {
                C3900je.m17435e("The webview does not exist. Ignoring action.");
            } else {
                C3025aw.m10919g();
                C3915jt.m17196b(this.f9082c);
            }
        }
    }

    /* renamed from: i */
    public final void mo12675i() {
        mo12667b();
        if (this.f9081b.f9065c != null) {
            this.f9081b.f9065c.mo12554d();
        }
        if (!((Boolean) aoq.m14620f().mo14695a(aru.f11907cZ)).booleanValue() && this.f9082c != null && (!this.f9080a.isFinishing() || this.f9084f == null)) {
            C3025aw.m10919g();
            C3915jt.m17195a(this.f9082c);
        }
        m11177r();
    }

    /* renamed from: j */
    public final void mo12676j() {
        if (((Boolean) aoq.m14620f().mo14695a(aru.f11907cZ)).booleanValue() && this.f9082c != null && (!this.f9080a.isFinishing() || this.f9084f == null)) {
            C3025aw.m10919g();
            C3915jt.m17195a(this.f9082c);
        }
        m11177r();
    }

    /* renamed from: k */
    public final void mo12677k() {
        if (this.f9082c != null) {
            this.f9091m.removeView(this.f9082c.getView());
        }
        m11177r();
    }

    /* renamed from: l */
    public final void mo12678l() {
        this.f9096r = true;
    }

    /* renamed from: m */
    public final void mo12679m() {
        this.f9091m.removeView(this.f9085g);
        m11175a(true);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: n */
    public final void mo12680n() {
        if (!this.f9098t) {
            this.f9098t = true;
            if (this.f9082c != null) {
                this.f9091m.removeView(this.f9082c.getView());
                if (this.f9084f != null) {
                    this.f9082c.mo15875a(this.f9084f.f9107d);
                    this.f9082c.mo15885b(false);
                    this.f9084f.f9106c.addView(this.f9082c.getView(), this.f9084f.f9104a, this.f9084f.f9105b);
                    this.f9084f = null;
                } else if (this.f9080a.getApplicationContext() != null) {
                    this.f9082c.mo15875a(this.f9080a.getApplicationContext());
                }
                this.f9082c = null;
            }
            if (!(this.f9081b == null || this.f9081b.f9065c == null)) {
                this.f9081b.f9065c.mo12557t_();
            }
        }
    }

    /* renamed from: o */
    public final void mo12681o() {
        if (this.f9092n) {
            this.f9092n = false;
            m11178s();
        }
    }

    /* renamed from: p */
    public final void mo12682p() {
        this.f9091m.f9102a = true;
    }

    /* renamed from: q */
    public final void mo12683q() {
        synchronized (this.f9093o) {
            this.f9095q = true;
            if (this.f9094p != null) {
                C3909jn.f13411a.removeCallbacks(this.f9094p);
                C3909jn.f13411a.post(this.f9094p);
            }
        }
    }
}
