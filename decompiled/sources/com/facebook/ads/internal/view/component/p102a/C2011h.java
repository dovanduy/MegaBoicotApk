package com.facebook.ads.internal.view.component.p102a;

import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.LinearLayout;
import com.facebook.ads.internal.adapters.p072b.C1597h;
import com.facebook.ads.internal.adapters.p072b.C1601l;
import com.facebook.ads.internal.p070a.C1571i;
import com.facebook.ads.internal.p092s.C1802c;
import com.facebook.ads.internal.p115w.p117b.C2323k;
import com.facebook.ads.internal.p115w.p117b.C2341w;
import com.facebook.ads.internal.p115w.p117b.C2342x;
import com.facebook.ads.internal.p125x.C2376a;
import com.facebook.ads.internal.view.C2098i;
import com.facebook.ads.internal.view.C2098i.C2108a;
import com.facebook.ads.internal.view.C2098i.C2109b;
import com.facebook.ads.internal.view.C2289u;
import com.facebook.ads.internal.view.component.C1983a.C1987a;
import com.facebook.ads.internal.view.p100b.C1956b;
import com.facebook.ads.internal.view.p100b.C1962f;
import com.facebook.ads.internal.view.p100b.C1962f.C1963a;
import com.facebook.ads.internal.view.p110i.p113c.C2191f;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.ads.internal.view.component.a.h */
class C2011h extends C2018l {

    /* renamed from: a */
    private static final int f6340a = ((int) (C2342x.f7369b * 4.0f));
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C2021o f6341b;

    /* renamed from: c */
    private final C2019m f6342c;

    /* renamed from: d */
    private final FrameLayout f6343d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C1802c f6344e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final String f6345f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C2376a f6346g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final C2341w f6347h;

    /* renamed from: i */
    private final String f6348i;

    /* renamed from: j */
    private final C1962f f6349j;

    /* renamed from: k */
    private final C2191f f6350k;

    /* renamed from: l */
    private final int f6351l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public boolean f6352m = true;

    /* renamed from: n */
    private boolean f6353n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public WeakReference<C2289u> f6354o;

    public C2011h(C2006e eVar, C1597h hVar, int i, int i2, C1571i iVar, boolean z) {
        final C1571i iVar2 = iVar;
        super(eVar.mo8180a());
        boolean z2 = true;
        this.f6344e = eVar.mo8181b();
        this.f6350k = (C2191f) eVar.mo8188i();
        this.f6346g = eVar.mo8184e();
        this.f6345f = eVar.mo8186g().mo7189c();
        this.f6347h = eVar.mo8185f();
        this.f6348i = eVar.mo8186g().mo7185a().mo7203d();
        this.f6351l = eVar.mo8190k();
        C2342x.m9082a((View) this, 0);
        LinearLayout linearLayout = new LinearLayout(eVar.mo8180a());
        LayoutParams layoutParams = new LayoutParams(-1, -1);
        linearLayout.setOrientation(1);
        addView(linearLayout, layoutParams);
        C2098i iVar3 = new C2098i(eVar.mo8180a(), eVar.mo8182c(), C2108a.CROSS);
        iVar3.setCloseButtonStyle(C2108a.DOWN_ARROW);
        iVar3.mo8355a(eVar.mo8186g().mo7185a(), eVar.mo8186g().mo7189c(), 0);
        C1597h hVar2 = hVar;
        iVar3.mo8353a(hVar2, true);
        iVar3.mo8361b(false);
        iVar3.setToolbarListener(new C2109b() {
            /* renamed from: a */
            public void mo8207a() {
                if (C2011h.this.f6354o.get() != null) {
                    ((C2289u) C2011h.this.f6354o.get()).mo8677a();
                    if (C2011h.this.f6341b.getVisibility() != 0) {
                        HashMap hashMap = new HashMap();
                        C2011h.this.f6346g.mo8779a((Map<String, String>) hashMap);
                        hashMap.put("touch", C2323k.m9046a(C2011h.this.f6347h.mo8743e()));
                        C2011h.this.f6344e.mo7705r(C2011h.this.f6345f, hashMap);
                    }
                }
            }
        });
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        this.f6343d = new FrameLayout(eVar.mo8180a());
        linearLayout.addView(this.f6343d, layoutParams2);
        C2342x.m9082a((View) this.f6343d, -433903825);
        LayoutParams layoutParams3 = new LayoutParams(-1, -2);
        if (eVar.mo8190k() == 1) {
            this.f6343d.addView(iVar3, layoutParams3);
            this.f6343d.setVisibility(4);
        }
        final FrameLayout frameLayout = new FrameLayout(eVar.mo8180a());
        LayoutParams layoutParams4 = new LayoutParams(-1, f6340a);
        final C1956b bVar = new C1956b(eVar.mo8180a(), null, 16842872);
        frameLayout.addView(bVar, layoutParams2);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, -1);
        this.f6349j = new C1962f(eVar.mo8180a(), new C1963a() {
            /* renamed from: a */
            public void mo8014a(int i) {
                if (C2011h.this.f6352m) {
                    bVar.setProgress(i);
                }
            }

            /* renamed from: a */
            public void mo8015a(String str) {
                C2011h.this.f6352m = true;
                frameLayout.setVisibility(0);
            }

            /* renamed from: b */
            public void mo8016b(String str) {
            }

            /* renamed from: c */
            public void mo8017c(String str) {
                bVar.setProgress(100);
                C2011h.this.f6352m = false;
                frameLayout.setVisibility(8);
            }
        });
        this.f6349j.addView(frameLayout, layoutParams4);
        linearLayout.addView(this.f6349j, layoutParams5);
        layoutParams.gravity = 17;
        C2021o oVar = new C2021o(eVar, hVar2, i, i2, new C1987a() {
            /* renamed from: a */
            public void mo8137a() {
                C2011h.this.m8256a(iVar2);
            }
        });
        this.f6341b = oVar;
        this.f6342c = this.f6341b.f6380a.getSwipeUpCtaButton();
        LayoutParams layoutParams6 = new LayoutParams(-1, -1);
        if (eVar.mo8190k() == 1) {
            z2 = false;
        }
        layoutParams6.setMargins(0, z2 ? 0 : C2098i.f6694a, 0, 0);
        addView(this.f6341b, layoutParams6);
        if (z) {
            m8256a(iVar2);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m8256a(C1571i iVar) {
        if (this.f6341b.getVisibility() == 0) {
            HashMap hashMap = new HashMap();
            this.f6346g.mo8779a((Map<String, String>) hashMap);
            hashMap.put("touch", C2323k.m9046a(this.f6347h.mo8743e()));
            iVar.mo7070a(hashMap);
            this.f6341b.setVisibility(4);
            this.f6349j.loadUrl(iVar.mo7071c().toString());
            iVar.mo7058a();
        }
    }

    /* renamed from: a */
    private boolean m8258a(MotionEvent motionEvent, View view) {
        boolean z = false;
        if (view == null) {
            return false;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        boolean z2 = motionEvent.getX() >= ((float) iArr[0]) && motionEvent.getX() <= ((float) (iArr[0] + view.getWidth()));
        boolean z3 = motionEvent.getY() >= ((float) iArr[1]) && motionEvent.getY() <= ((float) (iArr[1] + view.getHeight()));
        boolean z4 = this.f6341b.getVisibility() == 0;
        if (z2 && z3 && z4) {
            z = true;
        }
        return z;
    }

    /* renamed from: a */
    public void mo8196a() {
        if (this.f6341b.getVisibility() == 0) {
            if (this.f6342c != null) {
                this.f6342c.performClick();
            }
            HashMap hashMap = new HashMap();
            this.f6346g.mo8779a((Map<String, String>) hashMap);
            hashMap.put("touch", C2323k.m9046a(this.f6347h.mo8743e()));
            this.f6344e.mo7704q(this.f6345f, hashMap);
        }
        this.f6343d.setVisibility(0);
        ((C2289u) getParent()).mo8678b();
    }

    /* renamed from: a */
    public void mo8197a(MotionEvent motionEvent) {
        boolean a = m8258a(motionEvent, (View) this.f6350k);
        if (!a) {
            this.f6347h.mo8738a(motionEvent, this, this);
        }
        if (motionEvent.getAction() == 0) {
            this.f6353n = m8258a(motionEvent, (View) this.f6342c);
            return;
        }
        if (motionEvent.getAction() == 1) {
            if (a) {
                this.f6350k.performClick();
            } else if (this.f6342c == null || !m8258a(motionEvent, (View) this.f6342c) || !this.f6353n) {
                HashMap hashMap = new HashMap();
                this.f6346g.mo8779a((Map<String, String>) hashMap);
                hashMap.put("touch", C2323k.m9046a(this.f6347h.mo8743e()));
                this.f6344e.mo7691d(this.f6345f, hashMap);
            } else {
                this.f6342c.performClick();
            }
        }
    }

    /* renamed from: a */
    public void mo8198a(C1601l lVar) {
        this.f6341b.mo8214a(lVar.mo7196a().mo7148b(), lVar.mo7196a().mo7149c(), this.f6348i, false, false);
    }

    /* renamed from: b */
    public void mo8199b() {
        this.f6343d.setVisibility(4);
    }

    /* renamed from: c */
    public boolean mo8200c() {
        if (this.f6351l != 1 || this.f6354o.get() == null) {
            if (this.f6351l != 2 || !this.f6349j.canGoBack()) {
                return false;
            }
            this.f6349j.goBack();
            return true;
        } else if (((C2289u) this.f6354o.get()).mo8679c()) {
            return false;
        } else {
            if (this.f6349j.canGoBack()) {
                this.f6349j.goBack();
                return true;
            }
            if (this.f6354o.get() != null) {
                ((C2289u) this.f6354o.get()).mo8677a();
            }
            return true;
        }
    }

    /* renamed from: d */
    public boolean mo8201d() {
        return this.f6341b.getVisibility() != 0;
    }

    /* renamed from: e */
    public void mo8202e() {
        this.f6349j.onPause();
    }

    /* renamed from: f */
    public void mo8203f() {
        this.f6349j.onResume();
    }

    /* renamed from: g */
    public void mo8204g() {
        this.f6349j.destroy();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (getParent() instanceof C2289u) {
            this.f6354o = new WeakReference<>((C2289u) getParent());
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        mo8197a(motionEvent);
        return super.onTouchEvent(motionEvent);
    }
}
