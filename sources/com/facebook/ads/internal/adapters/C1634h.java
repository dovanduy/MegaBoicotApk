package com.facebook.ads.internal.adapters;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.appnext.base.p042a.p045c.C1234a;
import com.facebook.ads.AudienceNetworkActivity;
import com.facebook.ads.AudienceNetworkActivity.BackButtonInterceptor;
import com.facebook.ads.internal.p070a.C1564c;
import com.facebook.ads.internal.p115w.p117b.C2341w;
import com.facebook.ads.internal.p115w.p117b.C2342x;
import com.facebook.ads.internal.view.C1910a;
import com.facebook.ads.internal.view.C1910a.C1911a;
import com.facebook.ads.internal.view.p101c.C1980d;
import com.facebook.ads.internal.view.p101c.C1982f;
import com.facebook.ads.internal.view.p105e.C2039a;
import com.facebook.ads.internal.view.p110i.p111a.C2116a;
import com.facebook.ads.internal.view.p110i.p111a.C2117b;
import com.facebook.ads.internal.view.p110i.p112b.C2153u;
import com.facebook.ads.internal.view.p110i.p113c.C2164a.C2165a;
import com.facebook.ads.internal.view.p110i.p113c.C2180d;
import com.facebook.ads.internal.view.p110i.p113c.C2180d.C2188a;
import com.facebook.ads.internal.view.p110i.p113c.C2194g;
import com.facebook.ads.internal.view.p110i.p113c.C2206j;
import com.facebook.ads.internal.view.p110i.p113c.C2211k;
import com.facebook.ads.internal.view.p110i.p113c.C2213l;
import com.facebook.ads.internal.view.p110i.p113c.C2221n;
import com.facebook.ads.internal.view.p110i.p114d.C2240d;
import com.google.android.exoplayer2.util.MimeTypes;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.internal.adapters.h */
public class C1634h extends C1621f implements OnTouchListener, C1910a {

    /* renamed from: i */
    static final /* synthetic */ boolean f5054i = true;

    /* renamed from: j */
    private static final String f5055j = "h";

    /* renamed from: A */
    private int f5056A = -10525069;

    /* renamed from: B */
    private int f5057B = -12286980;

    /* renamed from: C */
    private boolean f5058C = false;

    /* renamed from: D */
    private C2116a f5059D;

    /* renamed from: f */
    final int f5060f = 64;

    /* renamed from: g */
    final int f5061g = 64;

    /* renamed from: h */
    final int f5062h = 16;

    /* renamed from: k */
    private C1911a f5063k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public Activity f5064l;

    /* renamed from: m */
    private BackButtonInterceptor f5065m = new BackButtonInterceptor() {
        public boolean interceptBackButton() {
            if (C1634h.this.f5077y == null) {
                return false;
            }
            if (!C1634h.this.f5077y.mo8512a()) {
                return true;
            }
            if (!(C1634h.this.f5077y.getSkipSeconds() == 0 || C1634h.this.f5009b == null)) {
                C1634h.this.f5009b.mo8387f();
            }
            if (C1634h.this.f5009b != null) {
                C1634h.this.f5009b.mo8388g();
            }
            return false;
        }
    };

    /* renamed from: n */
    private final OnTouchListener f5066n = new OnTouchListener() {
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() != 1) {
                return true;
            }
            if (C1634h.this.f5077y != null) {
                if (!C1634h.this.f5077y.mo8512a()) {
                    return true;
                }
                if (!(C1634h.this.f5077y.getSkipSeconds() == 0 || C1634h.this.f5009b == null)) {
                    C1634h.this.f5009b.mo8387f();
                }
                if (C1634h.this.f5009b != null) {
                    C1634h.this.f5009b.mo8388g();
                }
            }
            C1634h.this.f5064l.finish();
            return true;
        }
    };

    /* renamed from: o */
    private C1982f f5067o = C1982f.UNSPECIFIED;

    /* renamed from: p */
    private final C2341w f5068p = new C2341w();

    /* renamed from: q */
    private C2039a f5069q;

    /* renamed from: r */
    private TextView f5070r;

    /* renamed from: s */
    private TextView f5071s;

    /* renamed from: t */
    private ImageView f5072t;

    /* renamed from: u */
    private C2165a f5073u;

    /* renamed from: v */
    private C2221n f5074v;

    /* renamed from: w */
    private ViewGroup f5075w;

    /* renamed from: x */
    private C2180d f5076x;
    /* access modifiers changed from: private */

    /* renamed from: y */
    public C2206j f5077y;

    /* renamed from: z */
    private int f5078z = -1;

    /* JADX WARNING: Removed duplicated region for block: B:136:0x060f  */
    /* JADX WARNING: Removed duplicated region for block: B:138:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m6806a(int r20) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            float r2 = com.facebook.ads.internal.p115w.p117b.C2342x.f7369b
            android.widget.RelativeLayout$LayoutParams r3 = new android.widget.RelativeLayout$LayoutParams
            r4 = 1113587712(0x42600000, float:56.0)
            float r4 = r4 * r2
            int r4 = (int) r4
            r3.<init>(r4, r4)
            r5 = 10
            r3.addRule(r5)
            r6 = 11
            r3.addRule(r6)
            r6 = 1098907648(0x41800000, float:16.0)
            float r6 = r6 * r2
            int r6 = (int) r6
            com.facebook.ads.internal.view.i.c.j r7 = r0.f5077y
            r7.setPadding(r6, r6, r6, r6)
            com.facebook.ads.internal.view.i.c.j r7 = r0.f5077y
            r7.setLayoutParams(r3)
            boolean r3 = r19.mo7273h()
            if (r3 == 0) goto L_0x0030
            com.facebook.ads.internal.view.i.c.d$a r3 = com.facebook.ads.internal.view.p110i.p113c.C2180d.C2188a.FADE_OUT_ON_PLAY
            goto L_0x0032
        L_0x0030:
            com.facebook.ads.internal.view.i.c.d$a r3 = com.facebook.ads.internal.view.p110i.p113c.C2180d.C2188a.VISIBLE
        L_0x0032:
            com.facebook.ads.internal.view.i.a r7 = r0.f5009b
            int r7 = r7.getId()
            r10 = 0
            r11 = 2
            r14 = 16
            r15 = -2
            r13 = 1
            r12 = -1
            if (r1 != r13) goto L_0x01e6
            com.facebook.ads.internal.view.i.a r13 = r0.f5009b
            int r13 = r13.getVideoHeight()
            if (r13 <= 0) goto L_0x0059
            com.facebook.ads.internal.view.i.a r13 = r0.f5009b
            int r13 = r13.getVideoWidth()
            float r13 = (float) r13
            com.facebook.ads.internal.view.i.a r9 = r0.f5009b
            int r9 = r9.getVideoHeight()
            float r9 = (float) r9
            float r13 = r13 / r9
            goto L_0x005b
        L_0x0059:
            r13 = -1082130432(0xffffffffbf800000, float:-1.0)
        L_0x005b:
            double r8 = (double) r13
            r16 = 4606281698874543309(0x3feccccccccccccd, double:0.9)
            int r13 = (r8 > r16 ? 1 : (r8 == r16 ? 0 : -1))
            if (r13 > 0) goto L_0x0067
            r8 = 1
            goto L_0x0068
        L_0x0067:
            r8 = 0
        L_0x0068:
            if (r8 != 0) goto L_0x0070
            boolean r8 = r19.m6811k()
            if (r8 == 0) goto L_0x01e6
        L_0x0070:
            android.graphics.drawable.GradientDrawable r1 = new android.graphics.drawable.GradientDrawable
            android.graphics.drawable.GradientDrawable$Orientation r4 = android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM
            int[] r7 = new int[r11]
            r7 = {0, -15658735} // fill-array
            r1.<init>(r4, r7)
            r1.setCornerRadius(r10)
            android.widget.RelativeLayout$LayoutParams r4 = new android.widget.RelativeLayout$LayoutParams
            r4.<init>(r12, r15)
            r4.addRule(r5)
            com.facebook.ads.internal.view.i.a r5 = r0.f5009b
            r5.setLayoutParams(r4)
            com.facebook.ads.internal.view.i.a r4 = r0.f5009b
            r0.m6807a(r4)
            com.facebook.ads.internal.view.i.c.j r4 = r0.f5077y
            r0.m6807a(r4)
            com.facebook.ads.internal.view.i.c.a$a r4 = r0.f5073u
            if (r4 == 0) goto L_0x009f
            com.facebook.ads.internal.view.i.c.a$a r4 = r0.f5073u
            r0.m6807a(r4)
        L_0x009f:
            android.widget.RelativeLayout$LayoutParams r4 = new android.widget.RelativeLayout$LayoutParams
            com.facebook.ads.internal.view.e.a r5 = r0.f5069q
            if (r5 == 0) goto L_0x00a8
            r9 = 64
            goto L_0x00a9
        L_0x00a8:
            r9 = 0
        L_0x00a9:
            int r9 = r9 + 60
            int r9 = r9 + r14
            int r9 = r9 + r14
            int r9 = r9 + r14
            float r5 = (float) r9
            float r5 = r5 * r2
            int r5 = (int) r5
            r4.<init>(r12, r5)
            r5 = 12
            r4.addRule(r5)
            android.widget.RelativeLayout r5 = new android.widget.RelativeLayout
            android.content.Context r7 = r0.f5011d
            r5.<init>(r7)
            com.facebook.ads.internal.p115w.p117b.C2342x.m9083a(r5, r1)
            r5.setLayoutParams(r4)
            com.facebook.ads.internal.view.e.a r1 = r0.f5069q
            if (r1 == 0) goto L_0x00cd
            r9 = 64
            goto L_0x00ce
        L_0x00cd:
            r9 = 0
        L_0x00ce:
            int r9 = r9 + r14
            int r9 = r9 + r14
            float r1 = (float) r9
            float r1 = r1 * r2
            int r1 = (int) r1
            r4 = 0
            r5.setPadding(r6, r4, r6, r1)
            r0.f5075w = r5
            boolean r1 = r0.f5058C
            if (r1 != 0) goto L_0x00e2
            com.facebook.ads.internal.view.i.c.d r1 = r0.f5076x
            r1.mo8483a(r5, r3)
        L_0x00e2:
            r0.m6807a(r5)
            com.facebook.ads.internal.view.i.c.n r1 = r0.f5074v
            if (r1 == 0) goto L_0x0108
            android.widget.RelativeLayout$LayoutParams r1 = new android.widget.RelativeLayout$LayoutParams
            r3 = 1086324736(0x40c00000, float:6.0)
            float r9 = r3 * r2
            int r3 = (int) r9
            r1.<init>(r12, r3)
            r3 = 12
            r1.addRule(r3)
            r3 = -1061158912(0xffffffffc0c00000, float:-6.0)
            float r3 = r3 * r2
            int r3 = (int) r3
            r1.topMargin = r3
            com.facebook.ads.internal.view.i.c.n r3 = r0.f5074v
            r3.setLayoutParams(r1)
            com.facebook.ads.internal.view.i.c.n r1 = r0.f5074v
            r0.m6807a(r1)
        L_0x0108:
            com.facebook.ads.internal.view.e.a r1 = r0.f5069q
            if (r1 == 0) goto L_0x012e
            android.widget.RelativeLayout$LayoutParams r1 = new android.widget.RelativeLayout$LayoutParams
            r3 = 1115684864(0x42800000, float:64.0)
            float r3 = r3 * r2
            int r3 = (int) r3
            r1.<init>(r12, r3)
            r1.bottomMargin = r6
            r1.leftMargin = r6
            r1.rightMargin = r6
            r3 = 1
            r1.addRule(r3)
            r3 = 12
            r1.addRule(r3)
            com.facebook.ads.internal.view.e.a r3 = r0.f5069q
            r3.setLayoutParams(r1)
            com.facebook.ads.internal.view.e.a r1 = r0.f5069q
            r0.m6807a(r1)
        L_0x012e:
            android.widget.ImageView r1 = r0.f5072t
            if (r1 == 0) goto L_0x014f
            android.widget.RelativeLayout$LayoutParams r1 = new android.widget.RelativeLayout$LayoutParams
            r3 = 1114636288(0x42700000, float:60.0)
            float r3 = r3 * r2
            int r3 = (int) r3
            r1.<init>(r3, r3)
            r3 = 12
            r1.addRule(r3)
            r3 = 9
            r1.addRule(r3)
            android.widget.ImageView r3 = r0.f5072t
            r3.setLayoutParams(r1)
            android.widget.ImageView r1 = r0.f5072t
            r0.m6808a(r5, r1)
        L_0x014f:
            android.widget.TextView r1 = r0.f5070r
            if (r1 == 0) goto L_0x019d
            android.widget.RelativeLayout$LayoutParams r1 = new android.widget.RelativeLayout$LayoutParams
            r1.<init>(r12, r15)
            r3 = 1108344832(0x42100000, float:36.0)
            float r3 = r3 * r2
            int r3 = (int) r3
            r1.bottomMargin = r3
            r3 = 12
            r1.addRule(r3)
            r3 = 9
            r1.addRule(r3)
            android.widget.TextView r3 = r0.f5070r
            android.text.TextUtils$TruncateAt r4 = android.text.TextUtils.TruncateAt.END
            r3.setEllipsize(r4)
            android.widget.TextView r3 = r0.f5070r
            r4 = 8388611(0x800003, float:1.1754948E-38)
            r3.setGravity(r4)
            android.widget.TextView r3 = r0.f5070r
            r3.setLayoutParams(r1)
            android.widget.TextView r1 = r0.f5070r
            r3 = 1
            r1.setMaxLines(r3)
            android.widget.TextView r1 = r0.f5070r
            r3 = 1116733440(0x42900000, float:72.0)
            float r3 = r3 * r2
            int r3 = (int) r3
            r4 = 0
            r1.setPadding(r3, r4, r4, r4)
            android.widget.TextView r1 = r0.f5070r
            r1.setTextColor(r12)
            android.widget.TextView r1 = r0.f5070r
            r3 = 1099956224(0x41900000, float:18.0)
            r1.setTextSize(r3)
            android.widget.TextView r1 = r0.f5070r
            r0.m6808a(r5, r1)
        L_0x019d:
            android.widget.TextView r1 = r0.f5071s
            if (r1 == 0) goto L_0x05fb
            android.widget.RelativeLayout$LayoutParams r1 = new android.widget.RelativeLayout$LayoutParams
            r1.<init>(r12, r15)
            r3 = 12
            r1.addRule(r3)
            r3 = 9
            r1.addRule(r3)
            r3 = 1082130432(0x40800000, float:4.0)
            float r3 = r3 * r2
            int r3 = (int) r3
            r1.bottomMargin = r3
            android.widget.TextView r3 = r0.f5071s
            android.text.TextUtils$TruncateAt r4 = android.text.TextUtils.TruncateAt.END
            r3.setEllipsize(r4)
            android.widget.TextView r3 = r0.f5071s
            r4 = 8388611(0x800003, float:1.1754948E-38)
            r3.setGravity(r4)
            android.widget.TextView r3 = r0.f5071s
            r3.setLayoutParams(r1)
            android.widget.TextView r1 = r0.f5071s
            r3 = 1
            r1.setMaxLines(r3)
            android.widget.TextView r1 = r0.f5071s
            r3 = 1116733440(0x42900000, float:72.0)
            float r3 = r3 * r2
            int r2 = (int) r3
            r3 = 0
            r1.setPadding(r2, r3, r3, r3)
            android.widget.TextView r1 = r0.f5071s
            r1.setTextColor(r12)
            android.widget.TextView r1 = r0.f5071s
            r0.m6808a(r5, r1)
            goto L_0x05fb
        L_0x01e6:
            r8 = 1117782016(0x42a00000, float:80.0)
            r9 = 17
            r13 = 1
            if (r1 != r13) goto L_0x0329
            android.widget.RelativeLayout$LayoutParams r1 = new android.widget.RelativeLayout$LayoutParams
            r1.<init>(r12, r15)
            r1.addRule(r5)
            com.facebook.ads.internal.view.i.a r3 = r0.f5009b
            r3.setLayoutParams(r1)
            com.facebook.ads.internal.view.i.a r1 = r0.f5009b
            r0.m6807a(r1)
            com.facebook.ads.internal.view.i.c.j r1 = r0.f5077y
            r0.m6807a(r1)
            com.facebook.ads.internal.view.i.c.a$a r1 = r0.f5073u
            if (r1 == 0) goto L_0x020d
            com.facebook.ads.internal.view.i.c.a$a r1 = r0.f5073u
            r0.m6807a(r1)
        L_0x020d:
            android.widget.LinearLayout r1 = new android.widget.LinearLayout
            android.content.Context r3 = r0.f5011d
            r1.<init>(r3)
            r0.f5075w = r1
            r3 = 112(0x70, float:1.57E-43)
            r1.setGravity(r3)
            r3 = 1
            r1.setOrientation(r3)
            android.widget.RelativeLayout$LayoutParams r3 = new android.widget.RelativeLayout$LayoutParams
            r3.<init>(r12, r12)
            r4 = 1107558400(0x42040000, float:33.0)
            float r4 = r4 * r2
            int r4 = (int) r4
            r3.leftMargin = r4
            r3.rightMargin = r4
            r5 = 1090519040(0x41000000, float:8.0)
            float r5 = r5 * r2
            int r5 = (int) r5
            r3.topMargin = r5
            com.facebook.ads.internal.view.e.a r5 = r0.f5069q
            if (r5 != 0) goto L_0x0239
            r3.bottomMargin = r6
            goto L_0x023d
        L_0x0239:
            float r8 = r8 * r2
            int r5 = (int) r8
            r3.bottomMargin = r5
        L_0x023d:
            r5 = 3
            r3.addRule(r5, r7)
            r1.setLayoutParams(r3)
            r0.m6807a(r1)
            com.facebook.ads.internal.view.e.a r3 = r0.f5069q
            if (r3 == 0) goto L_0x026e
            android.widget.RelativeLayout$LayoutParams r3 = new android.widget.RelativeLayout$LayoutParams
            r5 = 1115684864(0x42800000, float:64.0)
            float r8 = r5 * r2
            int r5 = (int) r8
            r3.<init>(r12, r5)
            r3.bottomMargin = r6
            r3.leftMargin = r4
            r3.rightMargin = r4
            r4 = 1
            r3.addRule(r4)
            r4 = 12
            r3.addRule(r4)
            com.facebook.ads.internal.view.e.a r4 = r0.f5069q
            r4.setLayoutParams(r3)
            com.facebook.ads.internal.view.e.a r3 = r0.f5069q
            r0.m6807a(r3)
        L_0x026e:
            android.widget.TextView r3 = r0.f5070r
            if (r3 == 0) goto L_0x02ac
            android.widget.LinearLayout$LayoutParams r3 = new android.widget.LinearLayout$LayoutParams
            r3.<init>(r15, r15)
            r4 = 1073741824(0x40000000, float:2.0)
            r3.weight = r4
            r3.gravity = r9
            android.widget.TextView r4 = r0.f5070r
            android.text.TextUtils$TruncateAt r5 = android.text.TextUtils.TruncateAt.END
            r4.setEllipsize(r5)
            android.widget.TextView r4 = r0.f5070r
            r4.setGravity(r9)
            android.widget.TextView r4 = r0.f5070r
            r4.setLayoutParams(r3)
            android.widget.TextView r3 = r0.f5070r
            r3.setMaxLines(r11)
            android.widget.TextView r3 = r0.f5070r
            r4 = 0
            r3.setPadding(r4, r4, r4, r4)
            android.widget.TextView r3 = r0.f5070r
            int r4 = r0.f5056A
            r3.setTextColor(r4)
            android.widget.TextView r3 = r0.f5070r
            r4 = 1103101952(0x41c00000, float:24.0)
            r3.setTextSize(r4)
            android.widget.TextView r3 = r0.f5070r
            r0.m6808a(r1, r3)
        L_0x02ac:
            android.widget.ImageView r3 = r0.f5072t
            if (r3 == 0) goto L_0x02c7
            android.widget.LinearLayout$LayoutParams r3 = new android.widget.LinearLayout$LayoutParams
            r4 = 1115684864(0x42800000, float:64.0)
            float r4 = r4 * r2
            int r4 = (int) r4
            r3.<init>(r4, r4)
            r3.weight = r10
            r3.gravity = r9
            android.widget.ImageView r4 = r0.f5072t
            r4.setLayoutParams(r3)
            android.widget.ImageView r3 = r0.f5072t
            r0.m6808a(r1, r3)
        L_0x02c7:
            android.widget.TextView r3 = r0.f5071s
            if (r3 == 0) goto L_0x02fe
            android.widget.LinearLayout$LayoutParams r3 = new android.widget.LinearLayout$LayoutParams
            r3.<init>(r12, r15)
            r4 = 1073741824(0x40000000, float:2.0)
            r3.weight = r4
            r3.gravity = r14
            android.widget.TextView r4 = r0.f5071s
            android.text.TextUtils$TruncateAt r5 = android.text.TextUtils.TruncateAt.END
            r4.setEllipsize(r5)
            android.widget.TextView r4 = r0.f5071s
            r4.setGravity(r14)
            android.widget.TextView r4 = r0.f5071s
            r4.setLayoutParams(r3)
            android.widget.TextView r3 = r0.f5071s
            r3.setMaxLines(r11)
            android.widget.TextView r3 = r0.f5071s
            r4 = 0
            r3.setPadding(r4, r4, r4, r4)
            android.widget.TextView r3 = r0.f5071s
            int r4 = r0.f5056A
            r3.setTextColor(r4)
            android.widget.TextView r3 = r0.f5071s
            r0.m6808a(r1, r3)
        L_0x02fe:
            com.facebook.ads.internal.view.i.c.n r1 = r0.f5074v
            if (r1 == 0) goto L_0x031a
            android.widget.RelativeLayout$LayoutParams r1 = new android.widget.RelativeLayout$LayoutParams
            r3 = 1086324736(0x40c00000, float:6.0)
            float r9 = r3 * r2
            int r2 = (int) r9
            r1.<init>(r12, r2)
            r2 = 3
            r1.addRule(r2, r7)
            com.facebook.ads.internal.view.i.c.n r2 = r0.f5074v
            r2.setLayoutParams(r1)
            com.facebook.ads.internal.view.i.c.n r1 = r0.f5074v
        L_0x0317:
            r0.m6807a(r1)
        L_0x031a:
            com.facebook.ads.internal.view.i.a r1 = r0.f5009b
            android.view.ViewParent r1 = r1.getParent()
            android.view.View r1 = (android.view.View) r1
            int r2 = r0.f5078z
        L_0x0324:
            com.facebook.ads.internal.p115w.p117b.C2342x.m9082a(r1, r2)
            goto L_0x0607
        L_0x0329:
            com.facebook.ads.internal.view.i.a r1 = r0.f5009b
            int r1 = r1.getVideoHeight()
            if (r1 <= 0) goto L_0x0341
            com.facebook.ads.internal.view.i.a r1 = r0.f5009b
            int r1 = r1.getVideoWidth()
            float r1 = (float) r1
            com.facebook.ads.internal.view.i.a r13 = r0.f5009b
            int r13 = r13.getVideoHeight()
            float r13 = (float) r13
            float r1 = r1 / r13
            goto L_0x0343
        L_0x0341:
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
        L_0x0343:
            double r10 = (double) r1
            r16 = 4606281698874543309(0x3feccccccccccccd, double:0.9)
            int r1 = (r10 > r16 ? 1 : (r10 == r16 ? 0 : -1))
            if (r1 <= 0) goto L_0x0358
            r16 = 4607632778762754458(0x3ff199999999999a, double:1.1)
            int r1 = (r10 > r16 ? 1 : (r10 == r16 ? 0 : -1))
            if (r1 >= 0) goto L_0x0358
            r1 = 1
            goto L_0x0359
        L_0x0358:
            r1 = 0
        L_0x0359:
            if (r1 == 0) goto L_0x0495
            boolean r1 = r19.m6811k()
            if (r1 != 0) goto L_0x0495
            android.widget.RelativeLayout$LayoutParams r1 = new android.widget.RelativeLayout$LayoutParams
            r1.<init>(r15, r12)
            r3 = 9
            r1.addRule(r3)
            com.facebook.ads.internal.view.i.a r3 = r0.f5009b
            r3.setLayoutParams(r1)
            com.facebook.ads.internal.view.i.a r1 = r0.f5009b
            r0.m6807a(r1)
            com.facebook.ads.internal.view.i.c.j r1 = r0.f5077y
            r0.m6807a(r1)
            com.facebook.ads.internal.view.i.c.a$a r1 = r0.f5073u
            if (r1 == 0) goto L_0x0383
            com.facebook.ads.internal.view.i.c.a$a r1 = r0.f5073u
            r0.m6807a(r1)
        L_0x0383:
            android.widget.LinearLayout r1 = new android.widget.LinearLayout
            android.content.Context r3 = r0.f5011d
            r1.<init>(r3)
            r0.f5075w = r1
            r3 = 112(0x70, float:1.57E-43)
            r1.setGravity(r3)
            r3 = 1
            r1.setOrientation(r3)
            android.widget.RelativeLayout$LayoutParams r3 = new android.widget.RelativeLayout$LayoutParams
            r3.<init>(r12, r12)
            r3.leftMargin = r6
            r3.rightMargin = r6
            r4 = 1090519040(0x41000000, float:8.0)
            float r4 = r4 * r2
            int r4 = (int) r4
            r3.topMargin = r4
            float r8 = r8 * r2
            int r4 = (int) r8
            r3.bottomMargin = r4
            r4 = 1
            r3.addRule(r4, r7)
            r1.setLayoutParams(r3)
            r0.m6807a(r1)
            com.facebook.ads.internal.view.i.c.n r3 = r0.f5074v
            if (r3 == 0) goto L_0x03db
            android.widget.RelativeLayout$LayoutParams r3 = new android.widget.RelativeLayout$LayoutParams
            r4 = 1086324736(0x40c00000, float:6.0)
            float r4 = r4 * r2
            int r4 = (int) r4
            r3.<init>(r12, r4)
            r4 = 5
            r3.addRule(r4, r7)
            r4 = 7
            r3.addRule(r4, r7)
            r4 = 3
            r3.addRule(r4, r7)
            r4 = -1061158912(0xffffffffc0c00000, float:-6.0)
            float r4 = r4 * r2
            int r4 = (int) r4
            r3.topMargin = r4
            com.facebook.ads.internal.view.i.c.n r4 = r0.f5074v
            r4.setLayoutParams(r3)
            com.facebook.ads.internal.view.i.c.n r3 = r0.f5074v
            r0.m6807a(r3)
        L_0x03db:
            android.widget.TextView r3 = r0.f5070r
            if (r3 == 0) goto L_0x0419
            android.widget.LinearLayout$LayoutParams r3 = new android.widget.LinearLayout$LayoutParams
            r3.<init>(r15, r15)
            r4 = 1073741824(0x40000000, float:2.0)
            r3.weight = r4
            r3.gravity = r9
            android.widget.TextView r4 = r0.f5070r
            android.text.TextUtils$TruncateAt r8 = android.text.TextUtils.TruncateAt.END
            r4.setEllipsize(r8)
            android.widget.TextView r4 = r0.f5070r
            r4.setGravity(r9)
            android.widget.TextView r4 = r0.f5070r
            r4.setLayoutParams(r3)
            android.widget.TextView r3 = r0.f5070r
            r3.setMaxLines(r5)
            android.widget.TextView r3 = r0.f5070r
            r4 = 0
            r3.setPadding(r4, r4, r4, r4)
            android.widget.TextView r3 = r0.f5070r
            int r4 = r0.f5056A
            r3.setTextColor(r4)
            android.widget.TextView r3 = r0.f5070r
            r4 = 1103101952(0x41c00000, float:24.0)
            r3.setTextSize(r4)
            android.widget.TextView r3 = r0.f5070r
            r0.m6808a(r1, r3)
        L_0x0419:
            android.widget.ImageView r3 = r0.f5072t
            if (r3 == 0) goto L_0x0436
            android.widget.LinearLayout$LayoutParams r3 = new android.widget.LinearLayout$LayoutParams
            r4 = 1115684864(0x42800000, float:64.0)
            float r8 = r4 * r2
            int r4 = (int) r8
            r3.<init>(r4, r4)
            r4 = 0
            r3.weight = r4
            r3.gravity = r9
            android.widget.ImageView r4 = r0.f5072t
            r4.setLayoutParams(r3)
            android.widget.ImageView r3 = r0.f5072t
            r0.m6808a(r1, r3)
        L_0x0436:
            android.widget.TextView r3 = r0.f5071s
            if (r3 == 0) goto L_0x046d
            android.widget.LinearLayout$LayoutParams r3 = new android.widget.LinearLayout$LayoutParams
            r3.<init>(r12, r15)
            r4 = 1073741824(0x40000000, float:2.0)
            r3.weight = r4
            r3.gravity = r14
            android.widget.TextView r4 = r0.f5071s
            android.text.TextUtils$TruncateAt r8 = android.text.TextUtils.TruncateAt.END
            r4.setEllipsize(r8)
            android.widget.TextView r4 = r0.f5071s
            r4.setGravity(r9)
            android.widget.TextView r4 = r0.f5071s
            r4.setLayoutParams(r3)
            android.widget.TextView r3 = r0.f5071s
            r3.setMaxLines(r5)
            android.widget.TextView r3 = r0.f5071s
            r4 = 0
            r3.setPadding(r4, r4, r4, r4)
            android.widget.TextView r3 = r0.f5071s
            int r4 = r0.f5056A
            r3.setTextColor(r4)
            android.widget.TextView r3 = r0.f5071s
            r0.m6808a(r1, r3)
        L_0x046d:
            com.facebook.ads.internal.view.e.a r1 = r0.f5069q
            if (r1 == 0) goto L_0x031a
            android.widget.RelativeLayout$LayoutParams r1 = new android.widget.RelativeLayout$LayoutParams
            r3 = 1115684864(0x42800000, float:64.0)
            float r2 = r2 * r3
            int r2 = (int) r2
            r1.<init>(r12, r2)
            r1.bottomMargin = r6
            r1.leftMargin = r6
            r1.rightMargin = r6
            r2 = 1
            r1.addRule(r2)
            r3 = 12
            r1.addRule(r3)
            r1.addRule(r2, r7)
            com.facebook.ads.internal.view.e.a r2 = r0.f5069q
            r2.setLayoutParams(r1)
            com.facebook.ads.internal.view.e.a r1 = r0.f5069q
            goto L_0x0317
        L_0x0495:
            android.graphics.drawable.GradientDrawable r1 = new android.graphics.drawable.GradientDrawable
            android.graphics.drawable.GradientDrawable$Orientation r5 = android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM
            r7 = 2
            int[] r9 = new int[r7]
            r9 = {0, -15658735} // fill-array
            r1.<init>(r5, r9)
            r5 = 0
            r1.setCornerRadius(r5)
            android.widget.RelativeLayout$LayoutParams r5 = new android.widget.RelativeLayout$LayoutParams
            r5.<init>(r12, r12)
            com.facebook.ads.internal.view.i.a r7 = r0.f5009b
            r7.setLayoutParams(r5)
            com.facebook.ads.internal.view.i.a r5 = r0.f5009b
            r0.m6807a(r5)
            com.facebook.ads.internal.view.i.c.j r5 = r0.f5077y
            r0.m6807a(r5)
            com.facebook.ads.internal.view.i.c.a$a r5 = r0.f5073u
            if (r5 == 0) goto L_0x04c3
            com.facebook.ads.internal.view.i.c.a$a r5 = r0.f5073u
            r0.m6807a(r5)
        L_0x04c3:
            android.widget.RelativeLayout$LayoutParams r5 = new android.widget.RelativeLayout$LayoutParams
            r7 = 1123549184(0x42f80000, float:124.0)
            float r7 = r7 * r2
            int r7 = (int) r7
            r5.<init>(r12, r7)
            r7 = 12
            r5.addRule(r7)
            android.widget.RelativeLayout r7 = new android.widget.RelativeLayout
            android.content.Context r9 = r0.f5011d
            r7.<init>(r9)
            com.facebook.ads.internal.p115w.p117b.C2342x.m9083a(r7, r1)
            r7.setLayoutParams(r5)
            r1 = 0
            r7.setPadding(r6, r1, r6, r6)
            r0.f5075w = r7
            boolean r1 = r0.f5058C
            if (r1 != 0) goto L_0x04ed
            com.facebook.ads.internal.view.i.c.d r1 = r0.f5076x
            r1.mo8483a(r7, r3)
        L_0x04ed:
            r0.m6807a(r7)
            com.facebook.ads.internal.view.e.a r1 = r0.f5069q
            if (r1 == 0) goto L_0x0515
            android.widget.RelativeLayout$LayoutParams r1 = new android.widget.RelativeLayout$LayoutParams
            r3 = 1121714176(0x42dc0000, float:110.0)
            float r3 = r3 * r2
            int r3 = (int) r3
            r1.<init>(r3, r4)
            r1.rightMargin = r6
            r1.bottomMargin = r6
            r3 = 12
            r1.addRule(r3)
            r3 = 11
            r1.addRule(r3)
            com.facebook.ads.internal.view.e.a r3 = r0.f5069q
            r3.setLayoutParams(r1)
            com.facebook.ads.internal.view.e.a r1 = r0.f5069q
            r0.m6807a(r1)
        L_0x0515:
            android.widget.ImageView r1 = r0.f5072t
            if (r1 == 0) goto L_0x053c
            android.widget.RelativeLayout$LayoutParams r1 = new android.widget.RelativeLayout$LayoutParams
            r3 = 1115684864(0x42800000, float:64.0)
            float r3 = r3 * r2
            int r3 = (int) r3
            r1.<init>(r3, r3)
            r3 = 12
            r1.addRule(r3)
            r3 = 9
            r1.addRule(r3)
            r3 = 1090519040(0x41000000, float:8.0)
            float r3 = r3 * r2
            int r3 = (int) r3
            r1.bottomMargin = r3
            android.widget.ImageView r3 = r0.f5072t
            r3.setLayoutParams(r1)
            android.widget.ImageView r1 = r0.f5072t
            r0.m6808a(r7, r1)
        L_0x053c:
            android.widget.TextView r1 = r0.f5070r
            if (r1 == 0) goto L_0x0594
            android.widget.RelativeLayout$LayoutParams r1 = new android.widget.RelativeLayout$LayoutParams
            r1.<init>(r12, r15)
            r3 = 1111490560(0x42400000, float:48.0)
            float r3 = r3 * r2
            int r3 = (int) r3
            r1.bottomMargin = r3
            r3 = 12
            r1.addRule(r3)
            r3 = 9
            r1.addRule(r3)
            android.widget.TextView r3 = r0.f5070r
            android.text.TextUtils$TruncateAt r4 = android.text.TextUtils.TruncateAt.END
            r3.setEllipsize(r4)
            android.widget.TextView r3 = r0.f5070r
            r4 = 8388611(0x800003, float:1.1754948E-38)
            r3.setGravity(r4)
            android.widget.TextView r3 = r0.f5070r
            r3.setLayoutParams(r1)
            android.widget.TextView r1 = r0.f5070r
            r3 = 1
            r1.setMaxLines(r3)
            android.widget.TextView r1 = r0.f5070r
            float r3 = r8 * r2
            int r3 = (int) r3
            com.facebook.ads.internal.view.e.a r4 = r0.f5069q
            if (r4 == 0) goto L_0x057e
            r4 = 1123811328(0x42fc0000, float:126.0)
            float r4 = r4 * r2
            int r9 = (int) r4
            r4 = 0
            goto L_0x0580
        L_0x057e:
            r4 = 0
            r9 = 0
        L_0x0580:
            r1.setPadding(r3, r4, r9, r4)
            android.widget.TextView r1 = r0.f5070r
            r1.setTextColor(r12)
            android.widget.TextView r1 = r0.f5070r
            r3 = 1103101952(0x41c00000, float:24.0)
            r1.setTextSize(r3)
            android.widget.TextView r1 = r0.f5070r
            r0.m6808a(r7, r1)
        L_0x0594:
            android.widget.TextView r1 = r0.f5071s
            if (r1 == 0) goto L_0x05de
            android.widget.RelativeLayout$LayoutParams r1 = new android.widget.RelativeLayout$LayoutParams
            r1.<init>(r12, r15)
            r3 = 12
            r1.addRule(r3)
            r3 = 9
            r1.addRule(r3)
            android.widget.TextView r3 = r0.f5071s
            android.text.TextUtils$TruncateAt r4 = android.text.TextUtils.TruncateAt.END
            r3.setEllipsize(r4)
            android.widget.TextView r3 = r0.f5071s
            r4 = 8388611(0x800003, float:1.1754948E-38)
            r3.setGravity(r4)
            android.widget.TextView r3 = r0.f5071s
            r3.setLayoutParams(r1)
            android.widget.TextView r1 = r0.f5071s
            r3 = 2
            r1.setMaxLines(r3)
            android.widget.TextView r1 = r0.f5071s
            r1.setTextColor(r12)
            android.widget.TextView r1 = r0.f5071s
            float r8 = r8 * r2
            int r3 = (int) r8
            com.facebook.ads.internal.view.e.a r4 = r0.f5069q
            if (r4 == 0) goto L_0x05d4
            r4 = 1123811328(0x42fc0000, float:126.0)
            float r4 = r4 * r2
            int r9 = (int) r4
            r4 = 0
            goto L_0x05d6
        L_0x05d4:
            r4 = 0
            r9 = 0
        L_0x05d6:
            r1.setPadding(r3, r4, r9, r4)
            android.widget.TextView r1 = r0.f5071s
            r0.m6808a(r7, r1)
        L_0x05de:
            com.facebook.ads.internal.view.i.c.n r1 = r0.f5074v
            if (r1 == 0) goto L_0x05fb
            android.widget.RelativeLayout$LayoutParams r1 = new android.widget.RelativeLayout$LayoutParams
            r3 = 1086324736(0x40c00000, float:6.0)
            float r9 = r3 * r2
            int r2 = (int) r9
            r1.<init>(r12, r2)
            r2 = 12
            r1.addRule(r2)
            com.facebook.ads.internal.view.i.c.n r2 = r0.f5074v
            r2.setLayoutParams(r1)
            com.facebook.ads.internal.view.i.c.n r1 = r0.f5074v
            r0.m6807a(r1)
        L_0x05fb:
            com.facebook.ads.internal.view.i.a r1 = r0.f5009b
            android.view.ViewParent r1 = r1.getParent()
            android.view.View r1 = (android.view.View) r1
            r2 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            goto L_0x0324
        L_0x0607:
            com.facebook.ads.internal.view.i.a r1 = r0.f5009b
            android.view.View r1 = r1.getRootView()
            if (r1 == 0) goto L_0x0612
            r1.setOnTouchListener(r0)
        L_0x0612:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.adapters.C1634h.m6806a(int):void");
    }

    /* renamed from: a */
    private void m6807a(View view) {
        if (this.f5063k != null) {
            this.f5063k.mo6793a(view);
        }
    }

    /* renamed from: a */
    private void m6808a(ViewGroup viewGroup, View view) {
        if (viewGroup != null) {
            viewGroup.addView(view);
        }
    }

    /* renamed from: b */
    private void m6810b(View view) {
        if (view != null) {
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            if (viewGroup != null) {
                viewGroup.removeView(view);
            }
        }
    }

    /* renamed from: k */
    private boolean m6811k() {
        boolean z = false;
        if (this.f5009b.getVideoHeight() <= 0) {
            return false;
        }
        Rect rect = new Rect();
        this.f5064l.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
        if (rect.width() > rect.height()) {
            if (((float) (rect.width() - ((rect.height() * this.f5009b.getVideoWidth()) / this.f5009b.getVideoHeight()))) - (192.0f * C2342x.f7369b) < 0.0f) {
                z = true;
            }
            return z;
        }
        if (((((float) (rect.height() - ((rect.width() * this.f5009b.getVideoHeight()) / this.f5009b.getVideoWidth()))) - (C2342x.f7369b * 64.0f)) - (64.0f * C2342x.f7369b)) - (40.0f * C2342x.f7369b) < 0.0f) {
            z = true;
        }
        return z;
    }

    /* renamed from: l */
    private void m6812l() {
        m6810b((View) this.f5009b);
        m6810b((View) this.f5069q);
        m6810b((View) this.f5070r);
        m6810b((View) this.f5071s);
        m6810b((View) this.f5072t);
        m6810b((View) this.f5074v);
        m6810b((View) this.f5075w);
        m6810b((View) this.f5077y);
        if (this.f5073u != null) {
            m6810b((View) this.f5073u);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo7251a() {
        if (this.f5010c == null) {
            Log.e(f5055j, "Unable to add UI without a valid ad response.");
            return;
        }
        String string = this.f5010c.getString(C1234a.f3911gK);
        String optString = this.f5010c.getJSONObject("context").optString("orientation");
        if (!optString.isEmpty()) {
            this.f5067o = C1982f.m8155a(Integer.parseInt(optString));
        }
        if (this.f5010c.has(TtmlNode.TAG_LAYOUT) && !this.f5010c.isNull(TtmlNode.TAG_LAYOUT)) {
            JSONObject jSONObject = this.f5010c.getJSONObject(TtmlNode.TAG_LAYOUT);
            this.f5078z = (int) jSONObject.optLong("bgColor", (long) this.f5078z);
            this.f5056A = (int) jSONObject.optLong("textColor", (long) this.f5056A);
            this.f5057B = (int) jSONObject.optLong("accentColor", (long) this.f5057B);
            this.f5058C = jSONObject.optBoolean("persistentAdDetails", this.f5058C);
        }
        JSONObject jSONObject2 = this.f5010c.getJSONObject(MimeTypes.BASE_TYPE_TEXT);
        this.f5009b.setId(VERSION.SDK_INT >= 17 ? View.generateViewId() : C2342x.m9079a());
        int c = mo7255c();
        Context context = this.f5011d;
        if (c < 0) {
            c = 0;
        }
        this.f5077y = new C2206j(context, c, this.f5057B);
        this.f5077y.setOnTouchListener(this.f5066n);
        this.f5009b.mo8381a((C2117b) this.f5077y);
        if (this.f5010c.has("cta") && !this.f5010c.isNull("cta")) {
            JSONObject jSONObject3 = this.f5010c.getJSONObject("cta");
            C2039a aVar = new C2039a(this.f5011d, this.f5068p, jSONObject3.getString("url"), jSONObject3.getString(MimeTypes.BASE_TYPE_TEXT), this.f5057B, this.f5009b, this.f5008a, string);
            this.f5069q = aVar;
            C1564c.m6493a(this.f5011d, this.f5008a, string, Uri.parse(jSONObject3.getString("url")), new HashMap());
        }
        if (this.f5010c.has("icon") && !this.f5010c.isNull("icon")) {
            JSONObject jSONObject4 = this.f5010c.getJSONObject("icon");
            this.f5072t = new ImageView(this.f5011d);
            new C1980d(this.f5072t).mo8115a((int) (C2342x.f7369b * 64.0f), (int) (64.0f * C2342x.f7369b)).mo8118a(jSONObject4.getString("url"));
        }
        if (this.f5010c.has("image") && !this.f5010c.isNull("image")) {
            JSONObject jSONObject5 = this.f5010c.getJSONObject("image");
            C2194g gVar = new C2194g(this.f5011d);
            this.f5009b.mo8381a((C2117b) gVar);
            gVar.setImage(jSONObject5.getString("url"));
        }
        String optString2 = jSONObject2.optString("title");
        if (!optString2.isEmpty()) {
            this.f5070r = new TextView(this.f5011d);
            this.f5070r.setText(optString2);
            this.f5070r.setTypeface(Typeface.defaultFromStyle(1));
        }
        String optString3 = jSONObject2.optString("subtitle");
        if (!optString3.isEmpty()) {
            this.f5071s = new TextView(this.f5011d);
            this.f5071s.setText(optString3);
            this.f5071s.setTextSize(16.0f);
        }
        this.f5074v = new C2221n(this.f5011d);
        this.f5009b.mo8381a((C2117b) this.f5074v);
        String d = mo7256d();
        if (!TextUtils.isEmpty(d)) {
            C2165a aVar2 = new C2165a(this.f5011d, "AdChoices", d, new float[]{0.0f, 0.0f, 8.0f, 0.0f}, string);
            this.f5073u = aVar2;
            LayoutParams layoutParams = new LayoutParams(-2, -2);
            layoutParams.addRule(10);
            layoutParams.addRule(9);
            this.f5073u.setLayoutParams(layoutParams);
        }
        this.f5009b.mo8381a((C2117b) new C2211k(this.f5011d));
        C2213l lVar = new C2213l(this.f5011d);
        this.f5009b.mo8381a((C2117b) lVar);
        C2188a aVar3 = mo7273h() ? C2188a.FADE_OUT_ON_PLAY : C2188a.VISIBLE;
        this.f5009b.mo8381a((C2117b) new C2180d(lVar, aVar3));
        this.f5076x = new C2180d(new RelativeLayout(this.f5011d), aVar3);
        this.f5009b.mo8381a((C2117b) this.f5076x);
    }

    @TargetApi(17)
    /* renamed from: a */
    public void mo7268a(Intent intent, Bundle bundle, AudienceNetworkActivity audienceNetworkActivity) {
        this.f5064l = audienceNetworkActivity;
        if (f5054i || this.f5063k != null) {
            audienceNetworkActivity.addBackButtonInterceptor(this.f5065m);
            m6812l();
            m6806a(this.f5064l.getResources().getConfiguration().orientation);
            if (mo7273h()) {
                mo7257e();
            } else {
                mo7258f();
            }
        } else {
            throw new AssertionError();
        }
    }

    /* renamed from: a */
    public void mo7269a(Configuration configuration) {
        m6812l();
        m6806a(configuration.orientation);
    }

    /* renamed from: a */
    public void mo7270a(Bundle bundle) {
    }

    /* renamed from: a_ */
    public void mo7271a_(boolean z) {
        if (this.f5009b != null && this.f5009b.getState() == C2240d.STARTED) {
            this.f5059D = this.f5009b.getVideoStartReason();
            this.f5009b.mo8383a(false);
        }
    }

    /* renamed from: b */
    public void mo7272b(boolean z) {
        if (this.f5009b != null && this.f5059D != null) {
            this.f5009b.mo8380a(this.f5059D);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public boolean mo7273h() {
        if (f5054i || this.f5010c != null) {
            try {
                return this.f5010c.getJSONObject("video").getBoolean(AudienceNetworkActivity.AUTOPLAY);
            } catch (Exception e) {
                Log.w(String.valueOf(C1634h.class), "Invalid JSON", e);
                return true;
            }
        } else {
            throw new AssertionError();
        }
    }

    /* renamed from: i */
    public C1982f mo7274i() {
        return this.f5067o;
    }

    /* renamed from: j */
    public void mo7275j() {
        if (this.f5064l != null) {
            this.f5064l.finish();
        }
    }

    public void onDestroy() {
        if (!(this.f5010c == null || this.f5008a == null)) {
            String optString = this.f5010c.optString(C1234a.f3911gK);
            if (!TextUtils.isEmpty(optString)) {
                this.f5008a.mo7699l(optString, new HashMap());
            }
        }
        if (this.f5009b != null) {
            this.f5009b.mo8388g();
        }
        C1628g.m6778a((C1910a) this);
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        this.f5068p.mo8738a(motionEvent, view.getRootView(), view);
        if (this.f5009b != null) {
            this.f5009b.getEventBus().mo7625a(new C2153u(view, motionEvent));
        }
        return true;
    }

    public void setListener(C1911a aVar) {
        this.f5063k = aVar;
    }
}
