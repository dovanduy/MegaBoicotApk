package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import com.appnext.ads.fullscreen.RewardedVideo;
import com.google.android.gms.ads.internal.C3025aw;
import com.google.android.gms.common.util.C3554f;
import java.util.Set;

@C3718cm
/* renamed from: com.google.android.gms.internal.ads.d */
public final class C3732d extends C4003n {

    /* renamed from: a */
    private static final Set<String> f12827a = C3554f.m12742b("top-left", "top-right", "top-center", TtmlNode.CENTER, "bottom-left", "bottom-right", "bottom-center");

    /* renamed from: b */
    private String f12828b = "top-right";

    /* renamed from: c */
    private boolean f12829c = true;

    /* renamed from: d */
    private int f12830d = 0;

    /* renamed from: e */
    private int f12831e = 0;

    /* renamed from: f */
    private int f12832f = -1;

    /* renamed from: g */
    private int f12833g = 0;

    /* renamed from: h */
    private int f12834h = 0;

    /* renamed from: i */
    private int f12835i = -1;

    /* renamed from: j */
    private final Object f12836j = new Object();

    /* renamed from: k */
    private final C4089qe f12837k;

    /* renamed from: l */
    private final Activity f12838l;

    /* renamed from: m */
    private C4130rs f12839m;

    /* renamed from: n */
    private ImageView f12840n;

    /* renamed from: o */
    private LinearLayout f12841o;

    /* renamed from: p */
    private C4030o f12842p;

    /* renamed from: q */
    private PopupWindow f12843q;

    /* renamed from: r */
    private RelativeLayout f12844r;

    /* renamed from: s */
    private ViewGroup f12845s;

    public C3732d(C4089qe qeVar, C4030o oVar) {
        super(qeVar, "resize");
        this.f12837k = qeVar;
        this.f12838l = qeVar.mo15801d();
        this.f12842p = oVar;
    }

    /* renamed from: b */
    private final void m16509b(int i, int i2) {
        mo15650a(i, i2 - C3025aw.m10917e().mo15526c(this.f12838l)[0], this.f12835i, this.f12832f);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0095, code lost:
        r5 = r9.f12831e + r9.f12834h;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00b6, code lost:
        r5 = ((r9.f12831e + r9.f12834h) + r9.f12832f) - 50;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00e9, code lost:
        if (r0 < 0) goto L_0x0102;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00ec, code lost:
        if ((r0 + 50) > r3) goto L_0x0102;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00f0, code lost:
        if (r5 < r1[0]) goto L_0x0102;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00f5, code lost:
        if ((r5 + 50) <= r1[1]) goto L_0x00f8;
     */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0107  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int[] m16510b() {
        /*
            r9 = this;
            com.google.android.gms.internal.ads.jn r0 = com.google.android.gms.ads.internal.C3025aw.m10917e()
            android.app.Activity r1 = r9.f12838l
            int[] r0 = r0.mo15524b(r1)
            com.google.android.gms.internal.ads.jn r1 = com.google.android.gms.ads.internal.C3025aw.m10917e()
            android.app.Activity r2 = r9.f12838l
            int[] r1 = r1.mo15526c(r2)
            r2 = 0
            r3 = r0[r2]
            r4 = 1
            r0 = r0[r4]
            int r5 = r9.f12835i
            r6 = 2
            r7 = 50
            if (r5 < r7) goto L_0x00fd
            int r5 = r9.f12835i
            if (r5 <= r3) goto L_0x0027
            goto L_0x00fd
        L_0x0027:
            int r5 = r9.f12832f
            if (r5 < r7) goto L_0x00fa
            int r5 = r9.f12832f
            if (r5 <= r0) goto L_0x0031
            goto L_0x00fa
        L_0x0031:
            int r5 = r9.f12832f
            if (r5 != r0) goto L_0x003d
            int r0 = r9.f12835i
            if (r0 != r3) goto L_0x003d
            java.lang.String r0 = "Cannot resize to a full-screen ad."
            goto L_0x00ff
        L_0x003d:
            boolean r0 = r9.f12829c
            if (r0 == 0) goto L_0x00f8
            java.lang.String r0 = r9.f12828b
            r5 = -1
            int r8 = r0.hashCode()
            switch(r8) {
                case -1364013995: goto L_0x007e;
                case -1012429441: goto L_0x0074;
                case -655373719: goto L_0x006a;
                case 1163912186: goto L_0x0060;
                case 1288627767: goto L_0x0056;
                case 1755462605: goto L_0x004c;
                default: goto L_0x004b;
            }
        L_0x004b:
            goto L_0x0088
        L_0x004c:
            java.lang.String r8 = "top-center"
            boolean r0 = r0.equals(r8)
            if (r0 == 0) goto L_0x0088
            r0 = r4
            goto L_0x0089
        L_0x0056:
            java.lang.String r8 = "bottom-center"
            boolean r0 = r0.equals(r8)
            if (r0 == 0) goto L_0x0088
            r0 = 4
            goto L_0x0089
        L_0x0060:
            java.lang.String r8 = "bottom-right"
            boolean r0 = r0.equals(r8)
            if (r0 == 0) goto L_0x0088
            r0 = 5
            goto L_0x0089
        L_0x006a:
            java.lang.String r8 = "bottom-left"
            boolean r0 = r0.equals(r8)
            if (r0 == 0) goto L_0x0088
            r0 = 3
            goto L_0x0089
        L_0x0074:
            java.lang.String r8 = "top-left"
            boolean r0 = r0.equals(r8)
            if (r0 == 0) goto L_0x0088
            r0 = r2
            goto L_0x0089
        L_0x007e:
            java.lang.String r8 = "center"
            boolean r0 = r0.equals(r8)
            if (r0 == 0) goto L_0x0088
            r0 = r6
            goto L_0x0089
        L_0x0088:
            r0 = r5
        L_0x0089:
            switch(r0) {
                case 0: goto L_0x00e3;
                case 1: goto L_0x00d7;
                case 2: goto L_0x00c0;
                case 3: goto L_0x00b1;
                case 4: goto L_0x00a5;
                case 5: goto L_0x009b;
                default: goto L_0x008c;
            }
        L_0x008c:
            int r0 = r9.f12830d
            int r5 = r9.f12833g
            int r0 = r0 + r5
            int r5 = r9.f12835i
            int r0 = r0 + r5
            int r0 = r0 - r7
        L_0x0095:
            int r5 = r9.f12831e
            int r8 = r9.f12834h
            int r5 = r5 + r8
            goto L_0x00e9
        L_0x009b:
            int r0 = r9.f12830d
            int r5 = r9.f12833g
            int r0 = r0 + r5
            int r5 = r9.f12835i
            int r0 = r0 + r5
            int r0 = r0 - r7
            goto L_0x00b6
        L_0x00a5:
            int r0 = r9.f12830d
            int r5 = r9.f12833g
            int r0 = r0 + r5
            int r5 = r9.f12835i
            int r5 = r5 / r6
            int r0 = r0 + r5
            int r0 = r0 + -25
            goto L_0x00b6
        L_0x00b1:
            int r0 = r9.f12830d
            int r5 = r9.f12833g
            int r0 = r0 + r5
        L_0x00b6:
            int r5 = r9.f12831e
            int r8 = r9.f12834h
            int r5 = r5 + r8
            int r8 = r9.f12832f
            int r5 = r5 + r8
            int r5 = r5 - r7
            goto L_0x00e9
        L_0x00c0:
            int r0 = r9.f12830d
            int r5 = r9.f12833g
            int r0 = r0 + r5
            int r5 = r9.f12835i
            int r5 = r5 / r6
            int r0 = r0 + r5
            int r0 = r0 + -25
            int r5 = r9.f12831e
            int r8 = r9.f12834h
            int r5 = r5 + r8
            int r8 = r9.f12832f
            int r8 = r8 / r6
            int r5 = r5 + r8
            int r5 = r5 + -25
            goto L_0x00e9
        L_0x00d7:
            int r0 = r9.f12830d
            int r5 = r9.f12833g
            int r0 = r0 + r5
            int r5 = r9.f12835i
            int r5 = r5 / r6
            int r0 = r0 + r5
            int r0 = r0 + -25
            goto L_0x0095
        L_0x00e3:
            int r0 = r9.f12830d
            int r5 = r9.f12833g
            int r0 = r0 + r5
            goto L_0x0095
        L_0x00e9:
            if (r0 < 0) goto L_0x0102
            int r0 = r0 + r7
            if (r0 > r3) goto L_0x0102
            r0 = r1[r2]
            if (r5 < r0) goto L_0x0102
            int r5 = r5 + r7
            r0 = r1[r4]
            if (r5 <= r0) goto L_0x00f8
            goto L_0x0102
        L_0x00f8:
            r0 = r4
            goto L_0x0103
        L_0x00fa:
            java.lang.String r0 = "Height is too small or too large."
            goto L_0x00ff
        L_0x00fd:
            java.lang.String r0 = "Width is too small or too large."
        L_0x00ff:
            com.google.android.gms.internal.ads.C3900je.m17435e(r0)
        L_0x0102:
            r0 = r2
        L_0x0103:
            if (r0 != 0) goto L_0x0107
            r0 = 0
            return r0
        L_0x0107:
            boolean r0 = r9.f12829c
            if (r0 == 0) goto L_0x011c
            int[] r0 = new int[r6]
            int r1 = r9.f12830d
            int r3 = r9.f12833g
            int r1 = r1 + r3
            r0[r2] = r1
            int r1 = r9.f12831e
            int r2 = r9.f12834h
            int r1 = r1 + r2
            r0[r4] = r1
            return r0
        L_0x011c:
            com.google.android.gms.internal.ads.jn r0 = com.google.android.gms.ads.internal.C3025aw.m10917e()
            android.app.Activity r1 = r9.f12838l
            int[] r0 = r0.mo15524b(r1)
            com.google.android.gms.internal.ads.jn r1 = com.google.android.gms.ads.internal.C3025aw.m10917e()
            android.app.Activity r3 = r9.f12838l
            int[] r1 = r1.mo15526c(r3)
            r0 = r0[r2]
            int r3 = r9.f12830d
            int r5 = r9.f12833g
            int r3 = r3 + r5
            int r5 = r9.f12831e
            int r7 = r9.f12834h
            int r5 = r5 + r7
            if (r3 >= 0) goto L_0x0140
            r0 = r2
            goto L_0x014a
        L_0x0140:
            int r7 = r9.f12835i
            int r7 = r7 + r3
            if (r7 <= r0) goto L_0x0149
            int r3 = r9.f12835i
            int r0 = r0 - r3
            goto L_0x014a
        L_0x0149:
            r0 = r3
        L_0x014a:
            r3 = r1[r2]
            if (r5 >= r3) goto L_0x0151
            r5 = r1[r2]
            goto L_0x015e
        L_0x0151:
            int r3 = r9.f12832f
            int r3 = r3 + r5
            r7 = r1[r4]
            if (r3 <= r7) goto L_0x015e
            r1 = r1[r4]
            int r3 = r9.f12832f
            int r5 = r1 - r3
        L_0x015e:
            int[] r1 = new int[r6]
            r1[r2] = r0
            r1[r4] = r5
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C3732d.m16510b():int[]");
    }

    /* renamed from: a */
    public final void mo15233a(int i, int i2) {
        this.f12830d = i;
        this.f12831e = i2;
    }

    /* renamed from: a */
    public final void mo15234a(int i, int i2, boolean z) {
        synchronized (this.f12836j) {
            this.f12830d = i;
            this.f12831e = i2;
            if (this.f12843q != null && z) {
                int[] b = m16510b();
                if (b != null) {
                    PopupWindow popupWindow = this.f12843q;
                    aoq.m14615a();
                    int a = C3975lz.m17369a((Context) this.f12838l, b[0]);
                    aoq.m14615a();
                    popupWindow.update(a, C3975lz.m17369a((Context) this.f12838l, b[1]), this.f12843q.getWidth(), this.f12843q.getHeight());
                    m16509b(b[0], b[1]);
                } else {
                    mo15236a(true);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0262, code lost:
        r13.f12841o.setOnClickListener(new com.google.android.gms.internal.ads.C3759e(r13));
        r13.f12841o.setContentDescription("Close button");
        r13.f12844r.addView(r13.f12841o, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:?, code lost:
        r6 = r13.f12843q;
        r14 = r14.getDecorView();
        com.google.android.gms.internal.ads.aoq.m14615a();
        r7 = com.google.android.gms.internal.ads.C3975lz.m17369a((android.content.Context) r13.f12838l, r3[0]);
        com.google.android.gms.internal.ads.aoq.m14615a();
        r6.showAtLocation(r14, 0, r7, com.google.android.gms.internal.ads.C3975lz.m17369a((android.content.Context) r13.f12838l, r3[1]));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:?, code lost:
        r14 = r3[0];
        r6 = r3[1];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x029f, code lost:
        if (r13.f12842p == null) goto L_0x02aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x02a1, code lost:
        r13.f12842p.mo12565a(r14, r6, r13.f12835i, r13.f12832f);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x02aa, code lost:
        r13.f12837k.mo15878a(com.google.android.gms.internal.ads.C4130rs.m17978a(r4, r5));
        m16509b(r3[0], r3[1]);
        mo15655c("resized");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x02c0, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x02c1, code lost:
        r14 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x02c2, code lost:
        r1 = "Cannot show popup window: ";
        r14 = java.lang.String.valueOf(r14.getMessage());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x02d0, code lost:
        if (r14.length() != 0) goto L_0x02d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x02d2, code lost:
        r14 = r1.concat(r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x02d7, code lost:
        r14 = new java.lang.String(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x02dc, code lost:
        mo15652a(r14);
        r13.f12844r.removeView(r13.f12837k.getView());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x02ec, code lost:
        if (r13.f12845s != null) goto L_0x02ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x02ee, code lost:
        r13.f12845s.removeView(r13.f12840n);
        r13.f12845s.addView(r13.f12837k.getView());
        r13.f12837k.mo15878a(r13.f12839m);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0308, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0242, code lost:
        r6.addRule(11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0249, code lost:
        r6.addRule(14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0250, code lost:
        r6.addRule(9);
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo15235a(java.util.Map<java.lang.String, java.lang.String> r14) {
        /*
            r13 = this;
            java.lang.Object r0 = r13.f12836j
            monitor-enter(r0)
            android.app.Activity r1 = r13.f12838l     // Catch:{ all -> 0x0317 }
            if (r1 != 0) goto L_0x000e
            java.lang.String r14 = "Not an activity context. Cannot resize."
            r13.mo15652a(r14)     // Catch:{ all -> 0x0317 }
            monitor-exit(r0)     // Catch:{ all -> 0x0317 }
            return
        L_0x000e:
            com.google.android.gms.internal.ads.qe r1 = r13.f12837k     // Catch:{ all -> 0x0317 }
            com.google.android.gms.internal.ads.rs r1 = r1.mo15917t()     // Catch:{ all -> 0x0317 }
            if (r1 != 0) goto L_0x001d
            java.lang.String r14 = "Webview is not yet available, size is not set."
            r13.mo15652a(r14)     // Catch:{ all -> 0x0317 }
            monitor-exit(r0)     // Catch:{ all -> 0x0317 }
            return
        L_0x001d:
            com.google.android.gms.internal.ads.qe r1 = r13.f12837k     // Catch:{ all -> 0x0317 }
            com.google.android.gms.internal.ads.rs r1 = r1.mo15917t()     // Catch:{ all -> 0x0317 }
            boolean r1 = r1.mo15997d()     // Catch:{ all -> 0x0317 }
            if (r1 == 0) goto L_0x0030
            java.lang.String r14 = "Is interstitial. Cannot resize an interstitial."
            r13.mo15652a(r14)     // Catch:{ all -> 0x0317 }
            monitor-exit(r0)     // Catch:{ all -> 0x0317 }
            return
        L_0x0030:
            com.google.android.gms.internal.ads.qe r1 = r13.f12837k     // Catch:{ all -> 0x0317 }
            boolean r1 = r1.mo15923z()     // Catch:{ all -> 0x0317 }
            if (r1 == 0) goto L_0x003f
            java.lang.String r14 = "Cannot resize an expanded banner."
            r13.mo15652a(r14)     // Catch:{ all -> 0x0317 }
            monitor-exit(r0)     // Catch:{ all -> 0x0317 }
            return
        L_0x003f:
            java.lang.String r1 = "width"
            java.lang.Object r1 = r14.get(r1)     // Catch:{ all -> 0x0317 }
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1     // Catch:{ all -> 0x0317 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x0317 }
            if (r1 != 0) goto L_0x005e
            com.google.android.gms.ads.internal.C3025aw.m10917e()     // Catch:{ all -> 0x0317 }
            java.lang.String r1 = "width"
            java.lang.Object r1 = r14.get(r1)     // Catch:{ all -> 0x0317 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x0317 }
            int r1 = com.google.android.gms.internal.ads.C3909jn.m17151b(r1)     // Catch:{ all -> 0x0317 }
            r13.f12835i = r1     // Catch:{ all -> 0x0317 }
        L_0x005e:
            java.lang.String r1 = "height"
            java.lang.Object r1 = r14.get(r1)     // Catch:{ all -> 0x0317 }
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1     // Catch:{ all -> 0x0317 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x0317 }
            if (r1 != 0) goto L_0x007d
            com.google.android.gms.ads.internal.C3025aw.m10917e()     // Catch:{ all -> 0x0317 }
            java.lang.String r1 = "height"
            java.lang.Object r1 = r14.get(r1)     // Catch:{ all -> 0x0317 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x0317 }
            int r1 = com.google.android.gms.internal.ads.C3909jn.m17151b(r1)     // Catch:{ all -> 0x0317 }
            r13.f12832f = r1     // Catch:{ all -> 0x0317 }
        L_0x007d:
            java.lang.String r1 = "offsetX"
            java.lang.Object r1 = r14.get(r1)     // Catch:{ all -> 0x0317 }
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1     // Catch:{ all -> 0x0317 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x0317 }
            if (r1 != 0) goto L_0x009c
            com.google.android.gms.ads.internal.C3025aw.m10917e()     // Catch:{ all -> 0x0317 }
            java.lang.String r1 = "offsetX"
            java.lang.Object r1 = r14.get(r1)     // Catch:{ all -> 0x0317 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x0317 }
            int r1 = com.google.android.gms.internal.ads.C3909jn.m17151b(r1)     // Catch:{ all -> 0x0317 }
            r13.f12833g = r1     // Catch:{ all -> 0x0317 }
        L_0x009c:
            java.lang.String r1 = "offsetY"
            java.lang.Object r1 = r14.get(r1)     // Catch:{ all -> 0x0317 }
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1     // Catch:{ all -> 0x0317 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x0317 }
            if (r1 != 0) goto L_0x00bb
            com.google.android.gms.ads.internal.C3025aw.m10917e()     // Catch:{ all -> 0x0317 }
            java.lang.String r1 = "offsetY"
            java.lang.Object r1 = r14.get(r1)     // Catch:{ all -> 0x0317 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x0317 }
            int r1 = com.google.android.gms.internal.ads.C3909jn.m17151b(r1)     // Catch:{ all -> 0x0317 }
            r13.f12834h = r1     // Catch:{ all -> 0x0317 }
        L_0x00bb:
            java.lang.String r1 = "allowOffscreen"
            java.lang.Object r1 = r14.get(r1)     // Catch:{ all -> 0x0317 }
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1     // Catch:{ all -> 0x0317 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x0317 }
            if (r1 != 0) goto L_0x00d7
            java.lang.String r1 = "allowOffscreen"
            java.lang.Object r1 = r14.get(r1)     // Catch:{ all -> 0x0317 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x0317 }
            boolean r1 = java.lang.Boolean.parseBoolean(r1)     // Catch:{ all -> 0x0317 }
            r13.f12829c = r1     // Catch:{ all -> 0x0317 }
        L_0x00d7:
            java.lang.String r1 = "customClosePosition"
            java.lang.Object r14 = r14.get(r1)     // Catch:{ all -> 0x0317 }
            java.lang.String r14 = (java.lang.String) r14     // Catch:{ all -> 0x0317 }
            boolean r1 = android.text.TextUtils.isEmpty(r14)     // Catch:{ all -> 0x0317 }
            if (r1 != 0) goto L_0x00e7
            r13.f12828b = r14     // Catch:{ all -> 0x0317 }
        L_0x00e7:
            int r14 = r13.f12835i     // Catch:{ all -> 0x0317 }
            r1 = 0
            r2 = 1
            if (r14 < 0) goto L_0x00f3
            int r14 = r13.f12832f     // Catch:{ all -> 0x0317 }
            if (r14 < 0) goto L_0x00f3
            r14 = r2
            goto L_0x00f4
        L_0x00f3:
            r14 = r1
        L_0x00f4:
            if (r14 != 0) goto L_0x00fd
            java.lang.String r14 = "Invalid width and height options. Cannot resize."
            r13.mo15652a(r14)     // Catch:{ all -> 0x0317 }
            monitor-exit(r0)     // Catch:{ all -> 0x0317 }
            return
        L_0x00fd:
            android.app.Activity r14 = r13.f12838l     // Catch:{ all -> 0x0317 }
            android.view.Window r14 = r14.getWindow()     // Catch:{ all -> 0x0317 }
            if (r14 == 0) goto L_0x0310
            android.view.View r3 = r14.getDecorView()     // Catch:{ all -> 0x0317 }
            if (r3 != 0) goto L_0x010d
            goto L_0x0310
        L_0x010d:
            int[] r3 = r13.m16510b()     // Catch:{ all -> 0x0317 }
            if (r3 != 0) goto L_0x011a
            java.lang.String r14 = "Resize location out of screen or close button is not visible."
            r13.mo15652a(r14)     // Catch:{ all -> 0x0317 }
            monitor-exit(r0)     // Catch:{ all -> 0x0317 }
            return
        L_0x011a:
            com.google.android.gms.internal.ads.aoq.m14615a()     // Catch:{ all -> 0x0317 }
            android.app.Activity r4 = r13.f12838l     // Catch:{ all -> 0x0317 }
            int r5 = r13.f12835i     // Catch:{ all -> 0x0317 }
            int r4 = com.google.android.gms.internal.ads.C3975lz.m17369a(r4, r5)     // Catch:{ all -> 0x0317 }
            com.google.android.gms.internal.ads.aoq.m14615a()     // Catch:{ all -> 0x0317 }
            android.app.Activity r5 = r13.f12838l     // Catch:{ all -> 0x0317 }
            int r6 = r13.f12832f     // Catch:{ all -> 0x0317 }
            int r5 = com.google.android.gms.internal.ads.C3975lz.m17369a(r5, r6)     // Catch:{ all -> 0x0317 }
            com.google.android.gms.internal.ads.qe r6 = r13.f12837k     // Catch:{ all -> 0x0317 }
            android.view.View r6 = r6.getView()     // Catch:{ all -> 0x0317 }
            android.view.ViewParent r6 = r6.getParent()     // Catch:{ all -> 0x0317 }
            if (r6 == 0) goto L_0x0309
            boolean r7 = r6 instanceof android.view.ViewGroup     // Catch:{ all -> 0x0317 }
            if (r7 == 0) goto L_0x0309
            r7 = r6
            android.view.ViewGroup r7 = (android.view.ViewGroup) r7     // Catch:{ all -> 0x0317 }
            com.google.android.gms.internal.ads.qe r8 = r13.f12837k     // Catch:{ all -> 0x0317 }
            android.view.View r8 = r8.getView()     // Catch:{ all -> 0x0317 }
            r7.removeView(r8)     // Catch:{ all -> 0x0317 }
            android.widget.PopupWindow r7 = r13.f12843q     // Catch:{ all -> 0x0317 }
            if (r7 != 0) goto L_0x017f
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6     // Catch:{ all -> 0x0317 }
            r13.f12845s = r6     // Catch:{ all -> 0x0317 }
            com.google.android.gms.ads.internal.C3025aw.m10917e()     // Catch:{ all -> 0x0317 }
            com.google.android.gms.internal.ads.qe r6 = r13.f12837k     // Catch:{ all -> 0x0317 }
            android.view.View r6 = r6.getView()     // Catch:{ all -> 0x0317 }
            android.graphics.Bitmap r6 = com.google.android.gms.internal.ads.C3909jn.m17122a(r6)     // Catch:{ all -> 0x0317 }
            android.widget.ImageView r7 = new android.widget.ImageView     // Catch:{ all -> 0x0317 }
            android.app.Activity r8 = r13.f12838l     // Catch:{ all -> 0x0317 }
            r7.<init>(r8)     // Catch:{ all -> 0x0317 }
            r13.f12840n = r7     // Catch:{ all -> 0x0317 }
            android.widget.ImageView r7 = r13.f12840n     // Catch:{ all -> 0x0317 }
            r7.setImageBitmap(r6)     // Catch:{ all -> 0x0317 }
            com.google.android.gms.internal.ads.qe r6 = r13.f12837k     // Catch:{ all -> 0x0317 }
            com.google.android.gms.internal.ads.rs r6 = r6.mo15917t()     // Catch:{ all -> 0x0317 }
            r13.f12839m = r6     // Catch:{ all -> 0x0317 }
            android.view.ViewGroup r6 = r13.f12845s     // Catch:{ all -> 0x0317 }
            android.widget.ImageView r7 = r13.f12840n     // Catch:{ all -> 0x0317 }
            r6.addView(r7)     // Catch:{ all -> 0x0317 }
            goto L_0x0184
        L_0x017f:
            android.widget.PopupWindow r6 = r13.f12843q     // Catch:{ all -> 0x0317 }
            r6.dismiss()     // Catch:{ all -> 0x0317 }
        L_0x0184:
            android.widget.RelativeLayout r6 = new android.widget.RelativeLayout     // Catch:{ all -> 0x0317 }
            android.app.Activity r7 = r13.f12838l     // Catch:{ all -> 0x0317 }
            r6.<init>(r7)     // Catch:{ all -> 0x0317 }
            r13.f12844r = r6     // Catch:{ all -> 0x0317 }
            android.widget.RelativeLayout r6 = r13.f12844r     // Catch:{ all -> 0x0317 }
            r6.setBackgroundColor(r1)     // Catch:{ all -> 0x0317 }
            android.widget.RelativeLayout r6 = r13.f12844r     // Catch:{ all -> 0x0317 }
            android.view.ViewGroup$LayoutParams r7 = new android.view.ViewGroup$LayoutParams     // Catch:{ all -> 0x0317 }
            r7.<init>(r4, r5)     // Catch:{ all -> 0x0317 }
            r6.setLayoutParams(r7)     // Catch:{ all -> 0x0317 }
            com.google.android.gms.ads.internal.C3025aw.m10917e()     // Catch:{ all -> 0x0317 }
            android.widget.RelativeLayout r6 = r13.f12844r     // Catch:{ all -> 0x0317 }
            android.widget.PopupWindow r6 = com.google.android.gms.internal.ads.C3909jn.m17126a(r6, r4, r5, r1)     // Catch:{ all -> 0x0317 }
            r13.f12843q = r6     // Catch:{ all -> 0x0317 }
            android.widget.PopupWindow r6 = r13.f12843q     // Catch:{ all -> 0x0317 }
            r6.setOutsideTouchable(r2)     // Catch:{ all -> 0x0317 }
            android.widget.PopupWindow r6 = r13.f12843q     // Catch:{ all -> 0x0317 }
            r6.setTouchable(r2)     // Catch:{ all -> 0x0317 }
            android.widget.PopupWindow r6 = r13.f12843q     // Catch:{ all -> 0x0317 }
            boolean r7 = r13.f12829c     // Catch:{ all -> 0x0317 }
            r7 = r7 ^ r2
            r6.setClippingEnabled(r7)     // Catch:{ all -> 0x0317 }
            android.widget.RelativeLayout r6 = r13.f12844r     // Catch:{ all -> 0x0317 }
            com.google.android.gms.internal.ads.qe r7 = r13.f12837k     // Catch:{ all -> 0x0317 }
            android.view.View r7 = r7.getView()     // Catch:{ all -> 0x0317 }
            r8 = -1
            r6.addView(r7, r8, r8)     // Catch:{ all -> 0x0317 }
            android.widget.LinearLayout r6 = new android.widget.LinearLayout     // Catch:{ all -> 0x0317 }
            android.app.Activity r7 = r13.f12838l     // Catch:{ all -> 0x0317 }
            r6.<init>(r7)     // Catch:{ all -> 0x0317 }
            r13.f12841o = r6     // Catch:{ all -> 0x0317 }
            android.widget.RelativeLayout$LayoutParams r6 = new android.widget.RelativeLayout$LayoutParams     // Catch:{ all -> 0x0317 }
            com.google.android.gms.internal.ads.aoq.m14615a()     // Catch:{ all -> 0x0317 }
            android.app.Activity r7 = r13.f12838l     // Catch:{ all -> 0x0317 }
            r9 = 50
            int r7 = com.google.android.gms.internal.ads.C3975lz.m17369a(r7, r9)     // Catch:{ all -> 0x0317 }
            com.google.android.gms.internal.ads.aoq.m14615a()     // Catch:{ all -> 0x0317 }
            android.app.Activity r10 = r13.f12838l     // Catch:{ all -> 0x0317 }
            int r9 = com.google.android.gms.internal.ads.C3975lz.m17369a(r10, r9)     // Catch:{ all -> 0x0317 }
            r6.<init>(r7, r9)     // Catch:{ all -> 0x0317 }
            java.lang.String r7 = r13.f12828b     // Catch:{ all -> 0x0317 }
            int r9 = r7.hashCode()     // Catch:{ all -> 0x0317 }
            switch(r9) {
                case -1364013995: goto L_0x0223;
                case -1012429441: goto L_0x0219;
                case -655373719: goto L_0x020f;
                case 1163912186: goto L_0x0205;
                case 1288627767: goto L_0x01fb;
                case 1755462605: goto L_0x01f1;
                default: goto L_0x01f0;
            }     // Catch:{ all -> 0x0317 }
        L_0x01f0:
            goto L_0x022d
        L_0x01f1:
            java.lang.String r9 = "top-center"
            boolean r7 = r7.equals(r9)     // Catch:{ all -> 0x0317 }
            if (r7 == 0) goto L_0x022d
            r7 = r2
            goto L_0x022e
        L_0x01fb:
            java.lang.String r9 = "bottom-center"
            boolean r7 = r7.equals(r9)     // Catch:{ all -> 0x0317 }
            if (r7 == 0) goto L_0x022d
            r7 = 4
            goto L_0x022e
        L_0x0205:
            java.lang.String r9 = "bottom-right"
            boolean r7 = r7.equals(r9)     // Catch:{ all -> 0x0317 }
            if (r7 == 0) goto L_0x022d
            r7 = 5
            goto L_0x022e
        L_0x020f:
            java.lang.String r9 = "bottom-left"
            boolean r7 = r7.equals(r9)     // Catch:{ all -> 0x0317 }
            if (r7 == 0) goto L_0x022d
            r7 = 3
            goto L_0x022e
        L_0x0219:
            java.lang.String r9 = "top-left"
            boolean r7 = r7.equals(r9)     // Catch:{ all -> 0x0317 }
            if (r7 == 0) goto L_0x022d
            r7 = r1
            goto L_0x022e
        L_0x0223:
            java.lang.String r9 = "center"
            boolean r7 = r7.equals(r9)     // Catch:{ all -> 0x0317 }
            if (r7 == 0) goto L_0x022d
            r7 = 2
            goto L_0x022e
        L_0x022d:
            r7 = r8
        L_0x022e:
            r8 = 9
            r9 = 14
            r10 = 11
            r11 = 12
            r12 = 10
            switch(r7) {
                case 0: goto L_0x025e;
                case 1: goto L_0x025a;
                case 2: goto L_0x0254;
                case 3: goto L_0x024d;
                case 4: goto L_0x0246;
                case 5: goto L_0x023f;
                default: goto L_0x023b;
            }     // Catch:{ all -> 0x0317 }
        L_0x023b:
            r6.addRule(r12)     // Catch:{ all -> 0x0317 }
            goto L_0x0242
        L_0x023f:
            r6.addRule(r11)     // Catch:{ all -> 0x0317 }
        L_0x0242:
            r6.addRule(r10)     // Catch:{ all -> 0x0317 }
            goto L_0x0262
        L_0x0246:
            r6.addRule(r11)     // Catch:{ all -> 0x0317 }
        L_0x0249:
            r6.addRule(r9)     // Catch:{ all -> 0x0317 }
            goto L_0x0262
        L_0x024d:
            r6.addRule(r11)     // Catch:{ all -> 0x0317 }
        L_0x0250:
            r6.addRule(r8)     // Catch:{ all -> 0x0317 }
            goto L_0x0262
        L_0x0254:
            r7 = 13
            r6.addRule(r7)     // Catch:{ all -> 0x0317 }
            goto L_0x0262
        L_0x025a:
            r6.addRule(r12)     // Catch:{ all -> 0x0317 }
            goto L_0x0249
        L_0x025e:
            r6.addRule(r12)     // Catch:{ all -> 0x0317 }
            goto L_0x0250
        L_0x0262:
            android.widget.LinearLayout r7 = r13.f12841o     // Catch:{ all -> 0x0317 }
            com.google.android.gms.internal.ads.e r8 = new com.google.android.gms.internal.ads.e     // Catch:{ all -> 0x0317 }
            r8.<init>(r13)     // Catch:{ all -> 0x0317 }
            r7.setOnClickListener(r8)     // Catch:{ all -> 0x0317 }
            android.widget.LinearLayout r7 = r13.f12841o     // Catch:{ all -> 0x0317 }
            java.lang.String r8 = "Close button"
            r7.setContentDescription(r8)     // Catch:{ all -> 0x0317 }
            android.widget.RelativeLayout r7 = r13.f12844r     // Catch:{ all -> 0x0317 }
            android.widget.LinearLayout r8 = r13.f12841o     // Catch:{ all -> 0x0317 }
            r7.addView(r8, r6)     // Catch:{ all -> 0x0317 }
            android.widget.PopupWindow r6 = r13.f12843q     // Catch:{ RuntimeException -> 0x02c1 }
            android.view.View r14 = r14.getDecorView()     // Catch:{ RuntimeException -> 0x02c1 }
            com.google.android.gms.internal.ads.aoq.m14615a()     // Catch:{ RuntimeException -> 0x02c1 }
            android.app.Activity r7 = r13.f12838l     // Catch:{ RuntimeException -> 0x02c1 }
            r8 = r3[r1]     // Catch:{ RuntimeException -> 0x02c1 }
            int r7 = com.google.android.gms.internal.ads.C3975lz.m17369a(r7, r8)     // Catch:{ RuntimeException -> 0x02c1 }
            com.google.android.gms.internal.ads.aoq.m14615a()     // Catch:{ RuntimeException -> 0x02c1 }
            android.app.Activity r8 = r13.f12838l     // Catch:{ RuntimeException -> 0x02c1 }
            r9 = r3[r2]     // Catch:{ RuntimeException -> 0x02c1 }
            int r8 = com.google.android.gms.internal.ads.C3975lz.m17369a(r8, r9)     // Catch:{ RuntimeException -> 0x02c1 }
            r6.showAtLocation(r14, r1, r7, r8)     // Catch:{ RuntimeException -> 0x02c1 }
            r14 = r3[r1]     // Catch:{ all -> 0x0317 }
            r6 = r3[r2]     // Catch:{ all -> 0x0317 }
            com.google.android.gms.internal.ads.o r7 = r13.f12842p     // Catch:{ all -> 0x0317 }
            if (r7 == 0) goto L_0x02aa
            com.google.android.gms.internal.ads.o r7 = r13.f12842p     // Catch:{ all -> 0x0317 }
            int r8 = r13.f12835i     // Catch:{ all -> 0x0317 }
            int r9 = r13.f12832f     // Catch:{ all -> 0x0317 }
            r7.mo12565a(r14, r6, r8, r9)     // Catch:{ all -> 0x0317 }
        L_0x02aa:
            com.google.android.gms.internal.ads.qe r14 = r13.f12837k     // Catch:{ all -> 0x0317 }
            com.google.android.gms.internal.ads.rs r4 = com.google.android.gms.internal.ads.C4130rs.m17978a(r4, r5)     // Catch:{ all -> 0x0317 }
            r14.mo15878a(r4)     // Catch:{ all -> 0x0317 }
            r14 = r3[r1]     // Catch:{ all -> 0x0317 }
            r1 = r3[r2]     // Catch:{ all -> 0x0317 }
            r13.m16509b(r14, r1)     // Catch:{ all -> 0x0317 }
            java.lang.String r14 = "resized"
            r13.mo15655c(r14)     // Catch:{ all -> 0x0317 }
            monitor-exit(r0)     // Catch:{ all -> 0x0317 }
            return
        L_0x02c1:
            r14 = move-exception
            java.lang.String r1 = "Cannot show popup window: "
            java.lang.String r14 = r14.getMessage()     // Catch:{ all -> 0x0317 }
            java.lang.String r14 = java.lang.String.valueOf(r14)     // Catch:{ all -> 0x0317 }
            int r2 = r14.length()     // Catch:{ all -> 0x0317 }
            if (r2 == 0) goto L_0x02d7
            java.lang.String r14 = r1.concat(r14)     // Catch:{ all -> 0x0317 }
            goto L_0x02dc
        L_0x02d7:
            java.lang.String r14 = new java.lang.String     // Catch:{ all -> 0x0317 }
            r14.<init>(r1)     // Catch:{ all -> 0x0317 }
        L_0x02dc:
            r13.mo15652a(r14)     // Catch:{ all -> 0x0317 }
            android.widget.RelativeLayout r14 = r13.f12844r     // Catch:{ all -> 0x0317 }
            com.google.android.gms.internal.ads.qe r1 = r13.f12837k     // Catch:{ all -> 0x0317 }
            android.view.View r1 = r1.getView()     // Catch:{ all -> 0x0317 }
            r14.removeView(r1)     // Catch:{ all -> 0x0317 }
            android.view.ViewGroup r14 = r13.f12845s     // Catch:{ all -> 0x0317 }
            if (r14 == 0) goto L_0x0307
            android.view.ViewGroup r14 = r13.f12845s     // Catch:{ all -> 0x0317 }
            android.widget.ImageView r1 = r13.f12840n     // Catch:{ all -> 0x0317 }
            r14.removeView(r1)     // Catch:{ all -> 0x0317 }
            android.view.ViewGroup r14 = r13.f12845s     // Catch:{ all -> 0x0317 }
            com.google.android.gms.internal.ads.qe r1 = r13.f12837k     // Catch:{ all -> 0x0317 }
            android.view.View r1 = r1.getView()     // Catch:{ all -> 0x0317 }
            r14.addView(r1)     // Catch:{ all -> 0x0317 }
            com.google.android.gms.internal.ads.qe r14 = r13.f12837k     // Catch:{ all -> 0x0317 }
            com.google.android.gms.internal.ads.rs r1 = r13.f12839m     // Catch:{ all -> 0x0317 }
            r14.mo15878a(r1)     // Catch:{ all -> 0x0317 }
        L_0x0307:
            monitor-exit(r0)     // Catch:{ all -> 0x0317 }
            return
        L_0x0309:
            java.lang.String r14 = "Webview is detached, probably in the middle of a resize or expand."
            r13.mo15652a(r14)     // Catch:{ all -> 0x0317 }
            monitor-exit(r0)     // Catch:{ all -> 0x0317 }
            return
        L_0x0310:
            java.lang.String r14 = "Activity context is not ready, cannot get window or decor view."
            r13.mo15652a(r14)     // Catch:{ all -> 0x0317 }
            monitor-exit(r0)     // Catch:{ all -> 0x0317 }
            return
        L_0x0317:
            r14 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0317 }
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C3732d.mo15235a(java.util.Map):void");
    }

    /* renamed from: a */
    public final void mo15236a(boolean z) {
        synchronized (this.f12836j) {
            if (this.f12843q != null) {
                this.f12843q.dismiss();
                this.f12844r.removeView(this.f12837k.getView());
                if (this.f12845s != null) {
                    this.f12845s.removeView(this.f12840n);
                    this.f12845s.addView(this.f12837k.getView());
                    this.f12837k.mo15878a(this.f12839m);
                }
                if (z) {
                    mo15655c(RewardedVideo.VIDEO_MODE_DEFAULT);
                    if (this.f12842p != null) {
                        this.f12842p.mo12563N();
                    }
                }
                this.f12843q = null;
                this.f12844r = null;
                this.f12845s = null;
                this.f12841o = null;
            }
        }
    }

    /* renamed from: a */
    public final boolean mo15237a() {
        boolean z;
        synchronized (this.f12836j) {
            z = this.f12843q != null;
        }
        return z;
    }
}
