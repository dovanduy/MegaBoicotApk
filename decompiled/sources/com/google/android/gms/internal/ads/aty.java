package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.graphics.Point;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import com.google.android.gms.ads.internal.C3025aw;
import com.google.android.gms.common.util.C3563o;
import com.google.android.gms.p137b.C3235a;
import com.google.android.gms.p137b.C3238b;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
@C3718cm
public final class aty extends aun implements OnClickListener, OnTouchListener, OnGlobalLayoutListener, OnScrollChangedListener {

    /* renamed from: a */
    private static final String[] f12228a = {"2011", "1009", "3010"};

    /* renamed from: b */
    private final Object f12229b = new Object();

    /* renamed from: c */
    private final FrameLayout f12230c;

    /* renamed from: d */
    private FrameLayout f12231d;

    /* renamed from: e */
    private View f12232e;

    /* renamed from: f */
    private final boolean f12233f;

    /* renamed from: g */
    private Map<String, WeakReference<View>> f12234g = Collections.synchronizedMap(new HashMap());

    /* renamed from: h */
    private View f12235h;

    /* renamed from: i */
    private atk f12236i;

    /* renamed from: j */
    private boolean f12237j = false;

    /* renamed from: k */
    private Point f12238k = new Point();

    /* renamed from: l */
    private Point f12239l = new Point();

    /* renamed from: m */
    private WeakReference<akg> f12240m = new WeakReference<>(null);

    @TargetApi(21)
    public aty(FrameLayout frameLayout, FrameLayout frameLayout2) {
        this.f12230c = frameLayout;
        this.f12231d = frameLayout2;
        C3025aw.m10907A();
        C4027nx.m17491a((View) this.f12230c, (OnGlobalLayoutListener) this);
        C3025aw.m10907A();
        C4027nx.m17492a((View) this.f12230c, (OnScrollChangedListener) this);
        this.f12230c.setOnTouchListener(this);
        this.f12230c.setOnClickListener(this);
        if (frameLayout2 != null && C3563o.m12770i()) {
            frameLayout2.setElevation(Float.MAX_VALUE);
        }
        aru.m15024a(this.f12230c.getContext());
        this.f12233f = ((Boolean) aoq.m14620f().mo14695a(aru.f11916ci)).booleanValue();
    }

    /* renamed from: a */
    private final int m15321a(int i) {
        aoq.m14615a();
        return C3975lz.m17379b(this.f12236i.mo14859m(), i);
    }

    /* renamed from: a */
    private final void m15322a(View view) {
        if (this.f12236i != null) {
            atk f = this.f12236i instanceof atj ? ((atj) this.f12236i).mo14843f() : this.f12236i;
            if (f != null) {
                f.mo14856c(view);
            }
        }
    }

    /* renamed from: b */
    private final void m15323b() {
        synchronized (this.f12229b) {
            if (!this.f12233f && this.f12237j) {
                int measuredWidth = this.f12230c.getMeasuredWidth();
                int measuredHeight = this.f12230c.getMeasuredHeight();
                if (!(measuredWidth == 0 || measuredHeight == 0 || this.f12231d == null)) {
                    this.f12231d.setLayoutParams(new LayoutParams(measuredWidth, measuredHeight));
                    this.f12237j = false;
                }
            }
        }
    }

    /* renamed from: a */
    public final C3235a mo14648a(String str) {
        synchronized (this.f12229b) {
            View view = null;
            if (this.f12234g == null) {
                return null;
            }
            WeakReference weakReference = (WeakReference) this.f12234g.get(str);
            if (weakReference != null) {
                view = (View) weakReference.get();
            }
            C3235a a = C3238b.m11573a(view);
            return a;
        }
    }

    /* renamed from: a */
    public final void mo14649a() {
        synchronized (this.f12229b) {
            if (this.f12231d != null) {
                this.f12231d.removeAllViews();
            }
            this.f12231d = null;
            this.f12234g = null;
            this.f12235h = null;
            this.f12236i = null;
            this.f12238k = null;
            this.f12239l = null;
            this.f12240m = null;
            this.f12232e = null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:133:0x0255, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x01be A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x0213 A[Catch:{ Exception -> 0x0196 }] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x011a A[Catch:{ Exception -> 0x0196 }] */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0165 A[Catch:{ Exception -> 0x0196 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo14650a(com.google.android.gms.p137b.C3235a r12) {
        /*
            r11 = this;
            java.lang.Object r0 = r11.f12229b
            monitor-enter(r0)
            r1 = 0
            r11.m15322a(r1)     // Catch:{ all -> 0x0259 }
            java.lang.Object r12 = com.google.android.gms.p137b.C3238b.m11574a(r12)     // Catch:{ all -> 0x0259 }
            boolean r2 = r12 instanceof com.google.android.gms.internal.ads.atp     // Catch:{ all -> 0x0259 }
            if (r2 != 0) goto L_0x0016
            java.lang.String r12 = "Not an instance of native engine. This is most likely a transient error"
            com.google.android.gms.internal.ads.C3900je.m17435e(r12)     // Catch:{ all -> 0x0259 }
            monitor-exit(r0)     // Catch:{ all -> 0x0259 }
            return
        L_0x0016:
            boolean r2 = r11.f12233f     // Catch:{ all -> 0x0259 }
            r3 = 0
            if (r2 != 0) goto L_0x002e
            android.widget.FrameLayout r2 = r11.f12231d     // Catch:{ all -> 0x0259 }
            if (r2 == 0) goto L_0x002e
            android.widget.FrameLayout r2 = r11.f12231d     // Catch:{ all -> 0x0259 }
            android.widget.FrameLayout$LayoutParams r4 = new android.widget.FrameLayout$LayoutParams     // Catch:{ all -> 0x0259 }
            r4.<init>(r3, r3)     // Catch:{ all -> 0x0259 }
            r2.setLayoutParams(r4)     // Catch:{ all -> 0x0259 }
            android.widget.FrameLayout r2 = r11.f12230c     // Catch:{ all -> 0x0259 }
            r2.requestLayout()     // Catch:{ all -> 0x0259 }
        L_0x002e:
            r2 = 1
            r11.f12237j = r2     // Catch:{ all -> 0x0259 }
            com.google.android.gms.internal.ads.atp r12 = (com.google.android.gms.internal.ads.atp) r12     // Catch:{ all -> 0x0259 }
            com.google.android.gms.internal.ads.atk r4 = r11.f12236i     // Catch:{ all -> 0x0259 }
            if (r4 == 0) goto L_0x0052
            com.google.android.gms.internal.ads.ark<java.lang.Boolean> r4 = com.google.android.gms.internal.ads.aru.f11854bZ     // Catch:{ all -> 0x0259 }
            com.google.android.gms.internal.ads.ars r5 = com.google.android.gms.internal.ads.aoq.m14620f()     // Catch:{ all -> 0x0259 }
            java.lang.Object r4 = r5.mo14695a(r4)     // Catch:{ all -> 0x0259 }
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch:{ all -> 0x0259 }
            boolean r4 = r4.booleanValue()     // Catch:{ all -> 0x0259 }
            if (r4 == 0) goto L_0x0052
            com.google.android.gms.internal.ads.atk r4 = r11.f12236i     // Catch:{ all -> 0x0259 }
            android.widget.FrameLayout r5 = r11.f12230c     // Catch:{ all -> 0x0259 }
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r6 = r11.f12234g     // Catch:{ all -> 0x0259 }
            r4.mo14838b(r5, r6)     // Catch:{ all -> 0x0259 }
        L_0x0052:
            com.google.android.gms.internal.ads.atk r4 = r11.f12236i     // Catch:{ all -> 0x0259 }
            boolean r4 = r4 instanceof com.google.android.gms.internal.ads.atp     // Catch:{ all -> 0x0259 }
            if (r4 == 0) goto L_0x008c
            com.google.android.gms.internal.ads.atk r4 = r11.f12236i     // Catch:{ all -> 0x0259 }
            com.google.android.gms.internal.ads.atp r4 = (com.google.android.gms.internal.ads.atp) r4     // Catch:{ all -> 0x0259 }
            if (r4 == 0) goto L_0x008c
            android.content.Context r5 = r4.mo14859m()     // Catch:{ all -> 0x0259 }
            if (r5 == 0) goto L_0x008c
            com.google.android.gms.internal.ads.hz r5 = com.google.android.gms.ads.internal.C3025aw.m10908B()     // Catch:{ all -> 0x0259 }
            android.widget.FrameLayout r6 = r11.f12230c     // Catch:{ all -> 0x0259 }
            android.content.Context r6 = r6.getContext()     // Catch:{ all -> 0x0259 }
            boolean r5 = r5.mo15392c(r6)     // Catch:{ all -> 0x0259 }
            if (r5 == 0) goto L_0x008c
            com.google.android.gms.internal.ads.hy r4 = r4.mo14868n()     // Catch:{ all -> 0x0259 }
            if (r4 == 0) goto L_0x007d
            r4.mo15384a(r3)     // Catch:{ all -> 0x0259 }
        L_0x007d:
            java.lang.ref.WeakReference<com.google.android.gms.internal.ads.akg> r5 = r11.f12240m     // Catch:{ all -> 0x0259 }
            java.lang.Object r5 = r5.get()     // Catch:{ all -> 0x0259 }
            com.google.android.gms.internal.ads.akg r5 = (com.google.android.gms.internal.ads.akg) r5     // Catch:{ all -> 0x0259 }
            if (r5 == 0) goto L_0x008c
            if (r4 == 0) goto L_0x008c
            r5.mo14417b(r4)     // Catch:{ all -> 0x0259 }
        L_0x008c:
            com.google.android.gms.internal.ads.atk r4 = r11.f12236i     // Catch:{ all -> 0x0259 }
            boolean r4 = r4 instanceof com.google.android.gms.internal.ads.atj     // Catch:{ all -> 0x0259 }
            if (r4 == 0) goto L_0x00a4
            com.google.android.gms.internal.ads.atk r4 = r11.f12236i     // Catch:{ all -> 0x0259 }
            com.google.android.gms.internal.ads.atj r4 = (com.google.android.gms.internal.ads.atj) r4     // Catch:{ all -> 0x0259 }
            boolean r4 = r4.mo14842e()     // Catch:{ all -> 0x0259 }
            if (r4 == 0) goto L_0x00a4
            com.google.android.gms.internal.ads.atk r4 = r11.f12236i     // Catch:{ all -> 0x0259 }
            com.google.android.gms.internal.ads.atj r4 = (com.google.android.gms.internal.ads.atj) r4     // Catch:{ all -> 0x0259 }
            r4.mo14835a(r12)     // Catch:{ all -> 0x0259 }
            goto L_0x00b0
        L_0x00a4:
            r11.f12236i = r12     // Catch:{ all -> 0x0259 }
            boolean r4 = r12 instanceof com.google.android.gms.internal.ads.atj     // Catch:{ all -> 0x0259 }
            if (r4 == 0) goto L_0x00b0
            r4 = r12
            com.google.android.gms.internal.ads.atj r4 = (com.google.android.gms.internal.ads.atj) r4     // Catch:{ all -> 0x0259 }
            r4.mo14835a(r1)     // Catch:{ all -> 0x0259 }
        L_0x00b0:
            android.widget.FrameLayout r4 = r11.f12231d     // Catch:{ all -> 0x0259 }
            if (r4 != 0) goto L_0x00b6
            monitor-exit(r0)     // Catch:{ all -> 0x0259 }
            return
        L_0x00b6:
            com.google.android.gms.internal.ads.ark<java.lang.Boolean> r4 = com.google.android.gms.internal.ads.aru.f11854bZ     // Catch:{ all -> 0x0259 }
            com.google.android.gms.internal.ads.ars r5 = com.google.android.gms.internal.ads.aoq.m14620f()     // Catch:{ all -> 0x0259 }
            java.lang.Object r4 = r5.mo14695a(r4)     // Catch:{ all -> 0x0259 }
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch:{ all -> 0x0259 }
            boolean r4 = r4.booleanValue()     // Catch:{ all -> 0x0259 }
            if (r4 == 0) goto L_0x00cd
            android.widget.FrameLayout r4 = r11.f12231d     // Catch:{ all -> 0x0259 }
            r4.setClickable(r3)     // Catch:{ all -> 0x0259 }
        L_0x00cd:
            android.widget.FrameLayout r4 = r11.f12231d     // Catch:{ all -> 0x0259 }
            r4.removeAllViews()     // Catch:{ all -> 0x0259 }
            boolean r4 = r12.mo14837a()     // Catch:{ all -> 0x0259 }
            if (r4 == 0) goto L_0x0108
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r5 = r11.f12234g     // Catch:{ all -> 0x0259 }
            if (r5 == 0) goto L_0x0100
            r5 = 2
            java.lang.String[] r6 = new java.lang.String[r5]     // Catch:{ all -> 0x0259 }
            java.lang.String r7 = "1098"
            r6[r3] = r7     // Catch:{ all -> 0x0259 }
            java.lang.String r7 = "3011"
            r6[r2] = r7     // Catch:{ all -> 0x0259 }
            r7 = r3
        L_0x00e8:
            if (r7 >= r5) goto L_0x0100
            r8 = r6[r7]     // Catch:{ all -> 0x0259 }
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r9 = r11.f12234g     // Catch:{ all -> 0x0259 }
            java.lang.Object r8 = r9.get(r8)     // Catch:{ all -> 0x0259 }
            java.lang.ref.WeakReference r8 = (java.lang.ref.WeakReference) r8     // Catch:{ all -> 0x0259 }
            if (r8 == 0) goto L_0x00fd
            java.lang.Object r5 = r8.get()     // Catch:{ all -> 0x0259 }
            android.view.View r5 = (android.view.View) r5     // Catch:{ all -> 0x0259 }
            goto L_0x0101
        L_0x00fd:
            int r7 = r7 + 1
            goto L_0x00e8
        L_0x0100:
            r5 = r1
        L_0x0101:
            boolean r6 = r5 instanceof android.view.ViewGroup     // Catch:{ all -> 0x0259 }
            if (r6 == 0) goto L_0x0108
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5     // Catch:{ all -> 0x0259 }
            goto L_0x0109
        L_0x0108:
            r5 = r1
        L_0x0109:
            if (r4 == 0) goto L_0x010e
            if (r5 == 0) goto L_0x010e
            goto L_0x010f
        L_0x010e:
            r2 = r3
        L_0x010f:
            android.view.View r4 = r12.mo14830a(r11, r2)     // Catch:{ all -> 0x0259 }
            r11.f12235h = r4     // Catch:{ all -> 0x0259 }
            android.view.View r4 = r11.f12235h     // Catch:{ all -> 0x0259 }
            r10 = -1
            if (r4 == 0) goto L_0x0156
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r4 = r11.f12234g     // Catch:{ all -> 0x0259 }
            if (r4 == 0) goto L_0x012c
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r4 = r11.f12234g     // Catch:{ all -> 0x0259 }
            java.lang.String r6 = "1007"
            java.lang.ref.WeakReference r7 = new java.lang.ref.WeakReference     // Catch:{ all -> 0x0259 }
            android.view.View r8 = r11.f12235h     // Catch:{ all -> 0x0259 }
            r7.<init>(r8)     // Catch:{ all -> 0x0259 }
            r4.put(r6, r7)     // Catch:{ all -> 0x0259 }
        L_0x012c:
            if (r2 == 0) goto L_0x0137
            r5.removeAllViews()     // Catch:{ all -> 0x0259 }
            android.view.View r2 = r11.f12235h     // Catch:{ all -> 0x0259 }
            r5.addView(r2)     // Catch:{ all -> 0x0259 }
            goto L_0x0156
        L_0x0137:
            android.content.Context r2 = r12.mo14859m()     // Catch:{ all -> 0x0259 }
            com.google.android.gms.ads.formats.AdChoicesView r4 = new com.google.android.gms.ads.formats.AdChoicesView     // Catch:{ all -> 0x0259 }
            r4.<init>(r2)     // Catch:{ all -> 0x0259 }
            android.widget.FrameLayout$LayoutParams r2 = new android.widget.FrameLayout$LayoutParams     // Catch:{ all -> 0x0259 }
            r2.<init>(r10, r10)     // Catch:{ all -> 0x0259 }
            r4.setLayoutParams(r2)     // Catch:{ all -> 0x0259 }
            android.view.View r2 = r11.f12235h     // Catch:{ all -> 0x0259 }
            r4.addView(r2)     // Catch:{ all -> 0x0259 }
            android.widget.FrameLayout r2 = r11.f12231d     // Catch:{ all -> 0x0259 }
            if (r2 == 0) goto L_0x0156
            android.widget.FrameLayout r2 = r11.f12231d     // Catch:{ all -> 0x0259 }
            r2.addView(r4)     // Catch:{ all -> 0x0259 }
        L_0x0156:
            android.widget.FrameLayout r5 = r11.f12230c     // Catch:{ all -> 0x0259 }
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r6 = r11.f12234g     // Catch:{ all -> 0x0259 }
            r7 = 0
            r4 = r12
            r8 = r11
            r9 = r11
            r4.mo14834a(r5, r6, r7, r8, r9)     // Catch:{ all -> 0x0259 }
            boolean r2 = r11.f12233f     // Catch:{ all -> 0x0259 }
            if (r2 == 0) goto L_0x0191
            android.view.View r2 = r11.f12232e     // Catch:{ all -> 0x0259 }
            if (r2 != 0) goto L_0x0180
            android.view.View r2 = new android.view.View     // Catch:{ all -> 0x0259 }
            android.widget.FrameLayout r4 = r11.f12230c     // Catch:{ all -> 0x0259 }
            android.content.Context r4 = r4.getContext()     // Catch:{ all -> 0x0259 }
            r2.<init>(r4)     // Catch:{ all -> 0x0259 }
            r11.f12232e = r2     // Catch:{ all -> 0x0259 }
            android.view.View r2 = r11.f12232e     // Catch:{ all -> 0x0259 }
            android.widget.FrameLayout$LayoutParams r4 = new android.widget.FrameLayout$LayoutParams     // Catch:{ all -> 0x0259 }
            r4.<init>(r10, r3)     // Catch:{ all -> 0x0259 }
            r2.setLayoutParams(r4)     // Catch:{ all -> 0x0259 }
        L_0x0180:
            android.widget.FrameLayout r2 = r11.f12230c     // Catch:{ all -> 0x0259 }
            android.view.View r4 = r11.f12232e     // Catch:{ all -> 0x0259 }
            android.view.ViewParent r4 = r4.getParent()     // Catch:{ all -> 0x0259 }
            if (r2 == r4) goto L_0x0191
            android.widget.FrameLayout r2 = r11.f12230c     // Catch:{ all -> 0x0259 }
            android.view.View r4 = r11.f12232e     // Catch:{ all -> 0x0259 }
            r2.addView(r4)     // Catch:{ all -> 0x0259 }
        L_0x0191:
            com.google.android.gms.internal.ads.qe r2 = r12.mo14844g()     // Catch:{ Exception -> 0x0196 }
            goto L_0x01ac
        L_0x0196:
            r2 = move-exception
            com.google.android.gms.ads.internal.C3025aw.m10919g()     // Catch:{ all -> 0x0259 }
            boolean r4 = com.google.android.gms.internal.ads.C3915jt.m17197e()     // Catch:{ all -> 0x0259 }
            if (r4 == 0) goto L_0x01a6
            java.lang.String r2 = "Privileged processes cannot create HTML overlays."
            com.google.android.gms.internal.ads.C3900je.m17435e(r2)     // Catch:{ all -> 0x0259 }
            goto L_0x01ab
        L_0x01a6:
            java.lang.String r4 = "Error obtaining overlay."
            com.google.android.gms.internal.ads.C3900je.m17430b(r4, r2)     // Catch:{ all -> 0x0259 }
        L_0x01ab:
            r2 = r1
        L_0x01ac:
            if (r2 == 0) goto L_0x01bb
            android.widget.FrameLayout r4 = r11.f12231d     // Catch:{ all -> 0x0259 }
            if (r4 == 0) goto L_0x01bb
            android.widget.FrameLayout r4 = r11.f12231d     // Catch:{ all -> 0x0259 }
            android.view.View r2 = r2.getView()     // Catch:{ all -> 0x0259 }
            r4.addView(r2)     // Catch:{ all -> 0x0259 }
        L_0x01bb:
            java.lang.Object r2 = r11.f12229b     // Catch:{ all -> 0x0259 }
            monitor-enter(r2)     // Catch:{ all -> 0x0259 }
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r4 = r11.f12234g     // Catch:{ all -> 0x0256 }
            r12.mo14865a(r4)     // Catch:{ all -> 0x0256 }
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r4 = r11.f12234g     // Catch:{ all -> 0x0256 }
            if (r4 == 0) goto L_0x01e2
            java.lang.String[] r4 = f12228a     // Catch:{ all -> 0x0256 }
            int r5 = r4.length     // Catch:{ all -> 0x0256 }
        L_0x01ca:
            if (r3 >= r5) goto L_0x01e2
            r6 = r4[r3]     // Catch:{ all -> 0x0256 }
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r7 = r11.f12234g     // Catch:{ all -> 0x0256 }
            java.lang.Object r6 = r7.get(r6)     // Catch:{ all -> 0x0256 }
            java.lang.ref.WeakReference r6 = (java.lang.ref.WeakReference) r6     // Catch:{ all -> 0x0256 }
            if (r6 == 0) goto L_0x01df
            java.lang.Object r1 = r6.get()     // Catch:{ all -> 0x0256 }
            android.view.View r1 = (android.view.View) r1     // Catch:{ all -> 0x0256 }
            goto L_0x01e2
        L_0x01df:
            int r3 = r3 + 1
            goto L_0x01ca
        L_0x01e2:
            boolean r3 = r1 instanceof android.widget.FrameLayout     // Catch:{ all -> 0x0256 }
            if (r3 != 0) goto L_0x01eb
            r12.mo14846i()     // Catch:{ all -> 0x0256 }
        L_0x01e9:
            monitor-exit(r2)     // Catch:{ all -> 0x0256 }
            goto L_0x01fc
        L_0x01eb:
            com.google.android.gms.internal.ads.atz r3 = new com.google.android.gms.internal.ads.atz     // Catch:{ all -> 0x0256 }
            r3.<init>(r11, r1)     // Catch:{ all -> 0x0256 }
            boolean r4 = r12 instanceof com.google.android.gms.internal.ads.atj     // Catch:{ all -> 0x0256 }
            if (r4 == 0) goto L_0x01f8
            r12.mo14866b(r1, r3)     // Catch:{ all -> 0x0256 }
            goto L_0x01e9
        L_0x01f8:
            r12.mo14850a(r1, r3)     // Catch:{ all -> 0x0256 }
            goto L_0x01e9
        L_0x01fc:
            android.widget.FrameLayout r1 = r11.f12230c     // Catch:{ all -> 0x0259 }
            r12.mo14867d(r1)     // Catch:{ all -> 0x0259 }
            android.widget.FrameLayout r12 = r11.f12230c     // Catch:{ all -> 0x0259 }
            r11.m15322a(r12)     // Catch:{ all -> 0x0259 }
            com.google.android.gms.internal.ads.atk r12 = r11.f12236i     // Catch:{ all -> 0x0259 }
            android.widget.FrameLayout r1 = r11.f12230c     // Catch:{ all -> 0x0259 }
            r12.mo14854b(r1)     // Catch:{ all -> 0x0259 }
            com.google.android.gms.internal.ads.atk r12 = r11.f12236i     // Catch:{ all -> 0x0259 }
            boolean r12 = r12 instanceof com.google.android.gms.internal.ads.atp     // Catch:{ all -> 0x0259 }
            if (r12 == 0) goto L_0x0254
            com.google.android.gms.internal.ads.atk r12 = r11.f12236i     // Catch:{ all -> 0x0259 }
            com.google.android.gms.internal.ads.atp r12 = (com.google.android.gms.internal.ads.atp) r12     // Catch:{ all -> 0x0259 }
            if (r12 == 0) goto L_0x0254
            android.content.Context r1 = r12.mo14859m()     // Catch:{ all -> 0x0259 }
            if (r1 == 0) goto L_0x0254
            com.google.android.gms.internal.ads.hz r1 = com.google.android.gms.ads.internal.C3025aw.m10908B()     // Catch:{ all -> 0x0259 }
            android.widget.FrameLayout r2 = r11.f12230c     // Catch:{ all -> 0x0259 }
            android.content.Context r2 = r2.getContext()     // Catch:{ all -> 0x0259 }
            boolean r1 = r1.mo15392c(r2)     // Catch:{ all -> 0x0259 }
            if (r1 == 0) goto L_0x0254
            java.lang.ref.WeakReference<com.google.android.gms.internal.ads.akg> r1 = r11.f12240m     // Catch:{ all -> 0x0259 }
            java.lang.Object r1 = r1.get()     // Catch:{ all -> 0x0259 }
            com.google.android.gms.internal.ads.akg r1 = (com.google.android.gms.internal.ads.akg) r1     // Catch:{ all -> 0x0259 }
            if (r1 != 0) goto L_0x024d
            com.google.android.gms.internal.ads.akg r1 = new com.google.android.gms.internal.ads.akg     // Catch:{ all -> 0x0259 }
            android.widget.FrameLayout r2 = r11.f12230c     // Catch:{ all -> 0x0259 }
            android.content.Context r2 = r2.getContext()     // Catch:{ all -> 0x0259 }
            android.widget.FrameLayout r3 = r11.f12230c     // Catch:{ all -> 0x0259 }
            r1.<init>(r2, r3)     // Catch:{ all -> 0x0259 }
            java.lang.ref.WeakReference r2 = new java.lang.ref.WeakReference     // Catch:{ all -> 0x0259 }
            r2.<init>(r1)     // Catch:{ all -> 0x0259 }
            r11.f12240m = r2     // Catch:{ all -> 0x0259 }
        L_0x024d:
            com.google.android.gms.internal.ads.hy r12 = r12.mo14868n()     // Catch:{ all -> 0x0259 }
            r1.mo14416a(r12)     // Catch:{ all -> 0x0259 }
        L_0x0254:
            monitor-exit(r0)     // Catch:{ all -> 0x0259 }
            return
        L_0x0256:
            r12 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0256 }
            throw r12     // Catch:{ all -> 0x0259 }
        L_0x0259:
            r12 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0259 }
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.aty.mo14650a(com.google.android.gms.b.a):void");
    }

    /* renamed from: a */
    public final void mo14651a(C3235a aVar, int i) {
        if (C3025aw.m10908B().mo15392c(this.f12230c.getContext()) && this.f12240m != null) {
            akg akg = (akg) this.f12240m.get();
            if (akg != null) {
                akg.mo14415a();
            }
        }
        m15323b();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003f, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo14652a(java.lang.String r4, com.google.android.gms.p137b.C3235a r5) {
        /*
            r3 = this;
            java.lang.Object r5 = com.google.android.gms.p137b.C3238b.m11574a(r5)
            android.view.View r5 = (android.view.View) r5
            java.lang.Object r0 = r3.f12229b
            monitor-enter(r0)
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r1 = r3.f12234g     // Catch:{ all -> 0x0040 }
            if (r1 != 0) goto L_0x000f
            monitor-exit(r0)     // Catch:{ all -> 0x0040 }
            return
        L_0x000f:
            if (r5 != 0) goto L_0x0017
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r5 = r3.f12234g     // Catch:{ all -> 0x0040 }
            r5.remove(r4)     // Catch:{ all -> 0x0040 }
            goto L_0x003c
        L_0x0017:
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r1 = r3.f12234g     // Catch:{ all -> 0x0040 }
            java.lang.ref.WeakReference r2 = new java.lang.ref.WeakReference     // Catch:{ all -> 0x0040 }
            r2.<init>(r5)     // Catch:{ all -> 0x0040 }
            r1.put(r4, r2)     // Catch:{ all -> 0x0040 }
            java.lang.String r1 = "1098"
            boolean r1 = r1.equals(r4)     // Catch:{ all -> 0x0040 }
            if (r1 != 0) goto L_0x003e
            java.lang.String r1 = "3011"
            boolean r4 = r1.equals(r4)     // Catch:{ all -> 0x0040 }
            if (r4 == 0) goto L_0x0032
            goto L_0x003e
        L_0x0032:
            r5.setOnTouchListener(r3)     // Catch:{ all -> 0x0040 }
            r4 = 1
            r5.setClickable(r4)     // Catch:{ all -> 0x0040 }
            r5.setOnClickListener(r3)     // Catch:{ all -> 0x0040 }
        L_0x003c:
            monitor-exit(r0)     // Catch:{ all -> 0x0040 }
            return
        L_0x003e:
            monitor-exit(r0)     // Catch:{ all -> 0x0040 }
            return
        L_0x0040:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0040 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.aty.mo14652a(java.lang.String, com.google.android.gms.b.a):void");
    }

    /* renamed from: b */
    public final void mo14653b(C3235a aVar) {
        this.f12236i.mo14831a((View) C3238b.m11574a(aVar));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x008d, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r9) {
        /*
            r8 = this;
            java.lang.Object r0 = r8.f12229b
            monitor-enter(r0)
            com.google.android.gms.internal.ads.atk r1 = r8.f12236i     // Catch:{ all -> 0x008e }
            if (r1 != 0) goto L_0x0009
            monitor-exit(r0)     // Catch:{ all -> 0x008e }
            return
        L_0x0009:
            com.google.android.gms.internal.ads.atk r1 = r8.f12236i     // Catch:{ all -> 0x008e }
            r1.mo14840c()     // Catch:{ all -> 0x008e }
            android.os.Bundle r5 = new android.os.Bundle     // Catch:{ all -> 0x008e }
            r5.<init>()     // Catch:{ all -> 0x008e }
            java.lang.String r1 = "x"
            android.graphics.Point r2 = r8.f12238k     // Catch:{ all -> 0x008e }
            int r2 = r2.x     // Catch:{ all -> 0x008e }
            int r2 = r8.m15321a(r2)     // Catch:{ all -> 0x008e }
            float r2 = (float) r2     // Catch:{ all -> 0x008e }
            r5.putFloat(r1, r2)     // Catch:{ all -> 0x008e }
            java.lang.String r1 = "y"
            android.graphics.Point r2 = r8.f12238k     // Catch:{ all -> 0x008e }
            int r2 = r2.y     // Catch:{ all -> 0x008e }
            int r2 = r8.m15321a(r2)     // Catch:{ all -> 0x008e }
            float r2 = (float) r2     // Catch:{ all -> 0x008e }
            r5.putFloat(r1, r2)     // Catch:{ all -> 0x008e }
            java.lang.String r1 = "start_x"
            android.graphics.Point r2 = r8.f12239l     // Catch:{ all -> 0x008e }
            int r2 = r2.x     // Catch:{ all -> 0x008e }
            int r2 = r8.m15321a(r2)     // Catch:{ all -> 0x008e }
            float r2 = (float) r2     // Catch:{ all -> 0x008e }
            r5.putFloat(r1, r2)     // Catch:{ all -> 0x008e }
            java.lang.String r1 = "start_y"
            android.graphics.Point r2 = r8.f12239l     // Catch:{ all -> 0x008e }
            int r2 = r2.y     // Catch:{ all -> 0x008e }
            int r2 = r8.m15321a(r2)     // Catch:{ all -> 0x008e }
            float r2 = (float) r2     // Catch:{ all -> 0x008e }
            r5.putFloat(r1, r2)     // Catch:{ all -> 0x008e }
            android.view.View r1 = r8.f12235h     // Catch:{ all -> 0x008e }
            if (r1 == 0) goto L_0x0083
            android.view.View r1 = r8.f12235h     // Catch:{ all -> 0x008e }
            boolean r1 = r1.equals(r9)     // Catch:{ all -> 0x008e }
            if (r1 == 0) goto L_0x0083
            com.google.android.gms.internal.ads.atk r1 = r8.f12236i     // Catch:{ all -> 0x008e }
            boolean r1 = r1 instanceof com.google.android.gms.internal.ads.atj     // Catch:{ all -> 0x008e }
            if (r1 == 0) goto L_0x007a
            com.google.android.gms.internal.ads.atk r1 = r8.f12236i     // Catch:{ all -> 0x008e }
            com.google.android.gms.internal.ads.atj r1 = (com.google.android.gms.internal.ads.atj) r1     // Catch:{ all -> 0x008e }
            com.google.android.gms.internal.ads.atk r1 = r1.mo14843f()     // Catch:{ all -> 0x008e }
            if (r1 == 0) goto L_0x008c
            com.google.android.gms.internal.ads.atk r1 = r8.f12236i     // Catch:{ all -> 0x008e }
            com.google.android.gms.internal.ads.atj r1 = (com.google.android.gms.internal.ads.atj) r1     // Catch:{ all -> 0x008e }
            com.google.android.gms.internal.ads.atk r2 = r1.mo14843f()     // Catch:{ all -> 0x008e }
            java.lang.String r4 = "1007"
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r6 = r8.f12234g     // Catch:{ all -> 0x008e }
            android.widget.FrameLayout r7 = r8.f12230c     // Catch:{ all -> 0x008e }
        L_0x0075:
            r3 = r9
            r2.mo14851a(r3, r4, r5, r6, r7)     // Catch:{ all -> 0x008e }
            goto L_0x008c
        L_0x007a:
            com.google.android.gms.internal.ads.atk r2 = r8.f12236i     // Catch:{ all -> 0x008e }
            java.lang.String r4 = "1007"
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r6 = r8.f12234g     // Catch:{ all -> 0x008e }
            android.widget.FrameLayout r7 = r8.f12230c     // Catch:{ all -> 0x008e }
            goto L_0x0075
        L_0x0083:
            com.google.android.gms.internal.ads.atk r1 = r8.f12236i     // Catch:{ all -> 0x008e }
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r2 = r8.f12234g     // Catch:{ all -> 0x008e }
            android.widget.FrameLayout r3 = r8.f12230c     // Catch:{ all -> 0x008e }
            r1.mo14833a(r9, r2, r5, r3)     // Catch:{ all -> 0x008e }
        L_0x008c:
            monitor-exit(r0)     // Catch:{ all -> 0x008e }
            return
        L_0x008e:
            r9 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x008e }
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.aty.onClick(android.view.View):void");
    }

    public final void onGlobalLayout() {
        synchronized (this.f12229b) {
            m15323b();
            if (this.f12236i != null) {
                this.f12236i.mo14857c(this.f12230c, this.f12234g);
            }
        }
    }

    public final void onScrollChanged() {
        synchronized (this.f12229b) {
            if (this.f12236i != null) {
                this.f12236i.mo14857c(this.f12230c, this.f12234g);
            }
            m15323b();
        }
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        synchronized (this.f12229b) {
            if (this.f12236i == null) {
                return false;
            }
            int[] iArr = new int[2];
            this.f12230c.getLocationOnScreen(iArr);
            Point point = new Point((int) (motionEvent.getRawX() - ((float) iArr[0])), (int) (motionEvent.getRawY() - ((float) iArr[1])));
            this.f12238k = point;
            if (motionEvent.getAction() == 0) {
                this.f12239l = point;
            }
            MotionEvent obtain = MotionEvent.obtain(motionEvent);
            obtain.setLocation((float) point.x, (float) point.y);
            this.f12236i.mo14849a(obtain);
            obtain.recycle();
            return false;
        }
    }
}
