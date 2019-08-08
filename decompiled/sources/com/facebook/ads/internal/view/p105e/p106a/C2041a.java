package com.facebook.ads.internal.view.p105e.p106a;

import android.graphics.Rect;
import android.os.Bundle;
import android.support.p028v7.widget.C0942ad;
import android.support.p028v7.widget.LinearLayoutManager;
import android.support.p028v7.widget.RecyclerView;
import android.support.p028v7.widget.RecyclerView.C0889m;
import android.support.p028v7.widget.RecyclerView.C0895r;
import android.view.View;
import com.facebook.ads.internal.p125x.C2376a;
import com.facebook.ads.internal.view.C2033d;
import com.facebook.ads.internal.view.component.p102a.p103a.C1990b;
import com.facebook.ads.internal.view.component.p102a.p103a.C1990b.C1998c;
import com.facebook.ads.internal.view.component.p102a.p103a.C1990b.C1999d;
import com.facebook.ads.internal.view.component.p102a.p103a.C1990b.C2000e;
import com.facebook.ads.internal.view.p105e.p106a.C2046c.C2047a;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: com.facebook.ads.internal.view.e.a.a */
public class C2041a extends C0889m {

    /* renamed from: a */
    private final LinearLayoutManager f6455a;

    /* renamed from: b */
    private final int f6456b;

    /* renamed from: c */
    private final C0895r f6457c;

    /* renamed from: d */
    private final Set<Integer> f6458d = new HashSet();

    /* renamed from: e */
    private List<C2045b> f6459e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C2376a f6460f;

    /* renamed from: g */
    private boolean f6461g = true;

    /* renamed from: h */
    private C2047a f6462h;

    /* renamed from: i */
    private boolean f6463i = true;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public boolean f6464j = true;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public boolean f6465k;

    /* renamed from: l */
    private int f6466l = -1;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public float f6467m = 0.0f;

    /* renamed from: n */
    private final C2000e f6468n = new C2000e() {
        /* renamed from: a */
        public float mo8170a() {
            return C2041a.this.f6467m;
        }

        /* renamed from: a */
        public void mo8171a(float f) {
            C2041a.this.f6467m = f;
        }
    };

    /* renamed from: o */
    private final C1998c f6469o = new C1998c() {
        /* renamed from: a */
        public void mo8167a(int i) {
            C2041a.this.m8326a(i, true);
            if (C2041a.this.m8338g()) {
                C2041a.m8334c(C2041a.this);
            } else {
                C2041a.m8328a(C2041a.this, i);
            }
        }
    };

    /* renamed from: p */
    private final C1999d f6470p = new C1999d() {
        /* renamed from: a */
        public void mo8168a(View view) {
            C1990b bVar = (C1990b) view;
            bVar.mo8151j();
            if (C2041a.this.f6465k) {
                C2041a.this.f6464j = true;
            }
            if (C2041a.this.f6460f.mo8781b() && ((Integer) bVar.getTag(-1593835536)).intValue() == 0) {
                C2041a.this.f6460f.mo8777a();
            }
        }

        /* renamed from: b */
        public void mo8169b(View view) {
            if (C2041a.this.f6465k) {
                C2041a.this.f6464j = false;
            }
        }
    };

    C2041a(C2033d dVar, int i, List<C2045b> list, C2376a aVar, Bundle bundle) {
        this.f6455a = dVar.getLayoutManager();
        this.f6456b = i;
        this.f6459e = list;
        this.f6460f = aVar;
        this.f6457c = new C0942ad(dVar.getContext());
        dVar.addOnScrollListener(this);
        if (bundle != null) {
            this.f6467m = bundle.getFloat("VOLUME_LEVEL_PARAM", 0.0f);
            this.f6464j = bundle.getBoolean("AUTO_PLAY_ENABLED_PARAM", true);
            this.f6461g = bundle.getBoolean("IS_FIRST_VIDEO_PARAM", true);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004a, code lost:
        if ((((int) (r2.getX() + ((float) r2.getWidth()))) <= ((int) (((float) r2.getWidth()) * 1.3f))) != false) goto L_0x004c;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.facebook.ads.internal.view.component.p102a.p103a.C1990b m8324a(int r9, int r10, boolean r11) {
        /*
            r8 = this;
            r0 = 0
            r1 = r0
        L_0x0002:
            if (r9 > r10) goto L_0x005b
            android.support.v7.widget.LinearLayoutManager r2 = r8.f6455a
            android.view.View r2 = r2.findViewByPosition(r9)
            com.facebook.ads.internal.view.component.a.a.b r2 = (com.facebook.ads.internal.view.component.p102a.p103a.C1990b) r2
            boolean r3 = r2.mo8146g()
            if (r3 == 0) goto L_0x0013
            return r0
        L_0x0013:
            boolean r3 = m8330a(r2)
            r4 = 0
            if (r1 != 0) goto L_0x004d
            boolean r5 = r2.mo8145f()
            if (r5 == 0) goto L_0x004d
            if (r3 == 0) goto L_0x004d
            java.util.Set<java.lang.Integer> r5 = r8.f6458d
            java.lang.Integer r6 = java.lang.Integer.valueOf(r9)
            boolean r5 = r5.contains(r6)
            if (r5 != 0) goto L_0x004d
            if (r11 == 0) goto L_0x004c
            int r5 = r2.getWidth()
            float r5 = (float) r5
            r6 = 1067869798(0x3fa66666, float:1.3)
            float r5 = r5 * r6
            int r5 = (int) r5
            float r6 = r2.getX()
            int r7 = r2.getWidth()
            float r7 = (float) r7
            float r6 = r6 + r7
            int r6 = (int) r6
            if (r6 > r5) goto L_0x0049
            r5 = 1
            goto L_0x004a
        L_0x0049:
            r5 = r4
        L_0x004a:
            if (r5 == 0) goto L_0x004d
        L_0x004c:
            r1 = r2
        L_0x004d:
            boolean r2 = r2.mo8145f()
            if (r2 == 0) goto L_0x0058
            if (r3 != 0) goto L_0x0058
            r8.m8326a(r9, r4)
        L_0x0058:
            int r9 = r9 + 1
            goto L_0x0002
        L_0x005b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.view.p105e.p106a.C2041a.m8324a(int, int, boolean):com.facebook.ads.internal.view.component.a.a.b");
    }

    /* renamed from: a */
    private void m8325a(int i) {
        this.f6457c.setTargetPosition(i);
        this.f6455a.startSmoothScroll(this.f6457c);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m8326a(int i, boolean z) {
        if (z) {
            this.f6458d.add(Integer.valueOf(i));
        } else {
            this.f6458d.remove(Integer.valueOf(i));
        }
    }

    /* renamed from: a */
    private void m8327a(C1990b bVar, boolean z) {
        if (m8338g()) {
            bVar.setAlpha(z ? 1.0f : 0.5f);
        }
        if (!z && bVar.mo8146g()) {
            bVar.mo8150i();
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m8328a(C2041a aVar, int i) {
        C1990b a = aVar.m8324a(i + 1, aVar.f6455a.findLastVisibleItemPosition(), false);
        if (a != null) {
            a.mo8149h();
            aVar.m8325a(((Integer) a.getTag(-1593835536)).intValue());
        }
    }

    /* renamed from: a */
    private static boolean m8330a(View view) {
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        return ((float) rect.width()) / ((float) view.getWidth()) >= 0.15f;
    }

    /* renamed from: b */
    private void m8332b(int i) {
        C1990b bVar = (C1990b) this.f6455a.findViewByPosition(i);
        if (!m8330a((View) bVar)) {
            m8327a(bVar, false);
        }
    }

    /* renamed from: c */
    static /* synthetic */ void m8334c(C2041a aVar) {
        int findFirstCompletelyVisibleItemPosition = aVar.f6455a.findFirstCompletelyVisibleItemPosition();
        if (findFirstCompletelyVisibleItemPosition != -1 && findFirstCompletelyVisibleItemPosition < aVar.f6459e.size() - 1) {
            aVar.m8325a(findFirstCompletelyVisibleItemPosition + 1);
        }
    }

    /* renamed from: f */
    private void m8337f() {
        if (this.f6464j) {
            C1990b a = m8324a(this.f6455a.findFirstVisibleItemPosition(), this.f6455a.findLastVisibleItemPosition(), true);
            if (a != null) {
                a.mo8149h();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public boolean m8338g() {
        return this.f6456b == 1;
    }

    /* renamed from: a */
    public void mo8262a() {
        this.f6466l = -1;
        int findFirstVisibleItemPosition = this.f6455a.findFirstVisibleItemPosition();
        int findLastVisibleItemPosition = this.f6455a.findLastVisibleItemPosition();
        while (findFirstVisibleItemPosition <= findLastVisibleItemPosition && findFirstVisibleItemPosition >= 0) {
            C1990b bVar = (C1990b) this.f6455a.findViewByPosition(findFirstVisibleItemPosition);
            if (bVar == null || !bVar.mo8146g()) {
                findFirstVisibleItemPosition++;
            } else {
                this.f6466l = findFirstVisibleItemPosition;
                bVar.mo8150i();
                return;
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo8263a(Bundle bundle) {
        bundle.putFloat("VOLUME_LEVEL_PARAM", this.f6467m);
        bundle.putBoolean("AUTO_PLAY_ENABLED_PARAM", this.f6464j);
        bundle.putBoolean("IS_FIRST_VIDEO_PARAM", this.f6461g);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo8264a(C2047a aVar) {
        this.f6462h = aVar;
    }

    /* renamed from: b */
    public void mo8265b() {
        C1990b bVar = (C1990b) this.f6455a.findViewByPosition(this.f6466l);
        if (this.f6466l >= 0) {
            bVar.mo8149h();
        }
    }

    /* renamed from: c */
    public C2000e mo8266c() {
        return this.f6468n;
    }

    /* renamed from: d */
    public C1998c mo8267d() {
        return this.f6469o;
    }

    /* renamed from: e */
    public C1999d mo8268e() {
        return this.f6470p;
    }

    public void onScrollStateChanged(RecyclerView recyclerView, int i) {
        super.onScrollStateChanged(recyclerView, i);
        if (i == 0) {
            this.f6465k = true;
            m8337f();
        }
    }

    public void onScrolled(RecyclerView recyclerView, int i, int i2) {
        boolean z;
        super.onScrolled(recyclerView, i, i2);
        this.f6465k = false;
        if (this.f6463i) {
            this.f6465k = true;
            m8337f();
            this.f6463i = false;
        }
        int findFirstVisibleItemPosition = this.f6455a.findFirstVisibleItemPosition();
        int findLastVisibleItemPosition = this.f6455a.findLastVisibleItemPosition();
        m8332b(findFirstVisibleItemPosition);
        m8332b(findLastVisibleItemPosition);
        for (int i3 = findFirstVisibleItemPosition; i3 <= findLastVisibleItemPosition; i3++) {
            C1990b bVar = (C1990b) this.f6455a.findViewByPosition(i3);
            if (m8330a((View) bVar)) {
                m8327a(bVar, true);
            }
            if (!this.f6461g || !bVar.mo8145f()) {
                z = false;
            } else {
                this.f6461g = false;
                z = true;
            }
            if (z) {
                this.f6468n.mo8171a(((C2045b) this.f6459e.get(((Integer) bVar.getTag(-1593835536)).intValue())).mo8271c().mo7198c().mo7132f() ? 0.0f : 1.0f);
            }
        }
        if (m8338g() && this.f6462h != null) {
            int findFirstCompletelyVisibleItemPosition = this.f6455a.findFirstCompletelyVisibleItemPosition();
            if (findFirstCompletelyVisibleItemPosition == -1) {
                findFirstCompletelyVisibleItemPosition = i < 0 ? findFirstVisibleItemPosition : findLastVisibleItemPosition;
            }
            this.f6462h.mo8274a(findFirstCompletelyVisibleItemPosition);
        }
    }
}
