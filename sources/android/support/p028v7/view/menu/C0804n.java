package android.support.p028v7.view.menu;

import android.content.Context;
import android.graphics.Rect;
import android.support.p017v4.view.C0579c;
import android.support.p017v4.view.C0595r;
import android.support.p028v7.view.menu.C0806o.C0807a;
import android.view.View;
import android.widget.PopupWindow.OnDismissListener;

/* renamed from: android.support.v7.view.menu.n */
/* compiled from: MenuPopupHelper */
public class C0804n {

    /* renamed from: a */
    private final Context f2417a;

    /* renamed from: b */
    private final C0790h f2418b;

    /* renamed from: c */
    private final boolean f2419c;

    /* renamed from: d */
    private final int f2420d;

    /* renamed from: e */
    private final int f2421e;

    /* renamed from: f */
    private View f2422f;

    /* renamed from: g */
    private int f2423g;

    /* renamed from: h */
    private boolean f2424h;

    /* renamed from: i */
    private C0807a f2425i;

    /* renamed from: j */
    private C0803m f2426j;

    /* renamed from: k */
    private OnDismissListener f2427k;

    /* renamed from: l */
    private final OnDismissListener f2428l;

    public C0804n(Context context, C0790h hVar, View view, boolean z, int i) {
        this(context, hVar, view, z, i, 0);
    }

    public C0804n(Context context, C0790h hVar, View view, boolean z, int i, int i2) {
        this.f2423g = 8388611;
        this.f2428l = new OnDismissListener() {
            public void onDismiss() {
                C0804n.this.mo3368e();
            }
        };
        this.f2417a = context;
        this.f2418b = hVar;
        this.f2422f = view;
        this.f2419c = z;
        this.f2420d = i;
        this.f2421e = i2;
    }

    /* renamed from: a */
    public void mo3362a(OnDismissListener onDismissListener) {
        this.f2427k = onDismissListener;
    }

    /* renamed from: a */
    public void mo3361a(View view) {
        this.f2422f = view;
    }

    /* renamed from: a */
    public void mo3363a(boolean z) {
        this.f2424h = z;
        if (this.f2426j != null) {
            this.f2426j.mo3119a(z);
        }
    }

    /* renamed from: a */
    public void mo3359a(int i) {
        this.f2423g = i;
    }

    /* renamed from: a */
    public void mo3358a() {
        if (!mo3366c()) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }

    /* renamed from: b */
    public C0803m mo3365b() {
        if (this.f2426j == null) {
            this.f2426j = m3397g();
        }
        return this.f2426j;
    }

    /* renamed from: c */
    public boolean mo3366c() {
        if (mo3369f()) {
            return true;
        }
        if (this.f2422f == null) {
            return false;
        }
        m3396a(0, 0, false, false);
        return true;
    }

    /* renamed from: a */
    public boolean mo3364a(int i, int i2) {
        if (mo3369f()) {
            return true;
        }
        if (this.f2422f == null) {
            return false;
        }
        m3396a(i, i2, true, true);
        return true;
    }

    /* JADX WARNING: type inference failed for: r0v7, types: [android.support.v7.view.menu.m] */
    /* JADX WARNING: type inference failed for: r7v0, types: [android.support.v7.view.menu.t] */
    /* JADX WARNING: type inference failed for: r1v12, types: [android.support.v7.view.menu.e] */
    /* JADX WARNING: type inference failed for: r7v1, types: [android.support.v7.view.menu.t] */
    /* JADX WARNING: type inference failed for: r1v13, types: [android.support.v7.view.menu.e] */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r7v1, types: [android.support.v7.view.menu.t]
      assigns: [android.support.v7.view.menu.t, android.support.v7.view.menu.e]
      uses: [android.support.v7.view.menu.t, android.support.v7.view.menu.m, android.support.v7.view.menu.e]
      mth insns count: 49
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Unknown variable types count: 3 */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.support.p028v7.view.menu.C0803m m3397g() {
        /*
            r14 = this;
            android.content.Context r0 = r14.f2417a
            java.lang.String r1 = "window"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.view.WindowManager r0 = (android.view.WindowManager) r0
            android.view.Display r0 = r0.getDefaultDisplay()
            android.graphics.Point r1 = new android.graphics.Point
            r1.<init>()
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 17
            if (r2 < r3) goto L_0x001d
            r0.getRealSize(r1)
            goto L_0x0020
        L_0x001d:
            r0.getSize(r1)
        L_0x0020:
            int r0 = r1.x
            int r1 = r1.y
            int r0 = java.lang.Math.min(r0, r1)
            android.content.Context r1 = r14.f2417a
            android.content.res.Resources r1 = r1.getResources()
            int r2 = android.support.p028v7.p029a.C0672a.C0676d.abc_cascading_menus_min_smallest_width
            int r1 = r1.getDimensionPixelSize(r2)
            if (r0 < r1) goto L_0x0038
            r0 = 1
            goto L_0x0039
        L_0x0038:
            r0 = 0
        L_0x0039:
            if (r0 == 0) goto L_0x004c
            android.support.v7.view.menu.e r0 = new android.support.v7.view.menu.e
            android.content.Context r2 = r14.f2417a
            android.view.View r3 = r14.f2422f
            int r4 = r14.f2420d
            int r5 = r14.f2421e
            boolean r6 = r14.f2419c
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6)
            goto L_0x005e
        L_0x004c:
            android.support.v7.view.menu.t r0 = new android.support.v7.view.menu.t
            android.content.Context r8 = r14.f2417a
            android.support.v7.view.menu.h r9 = r14.f2418b
            android.view.View r10 = r14.f2422f
            int r11 = r14.f2420d
            int r12 = r14.f2421e
            boolean r13 = r14.f2419c
            r7 = r0
            r7.<init>(r8, r9, r10, r11, r12, r13)
        L_0x005e:
            android.support.v7.view.menu.h r1 = r14.f2418b
            r0.mo3116a(r1)
            android.widget.PopupWindow$OnDismissListener r1 = r14.f2428l
            r0.mo3118a(r1)
            android.view.View r1 = r14.f2422f
            r0.mo3117a(r1)
            android.support.v7.view.menu.o$a r1 = r14.f2425i
            r0.mo3099a(r1)
            boolean r1 = r14.f2424h
            r0.mo3119a(r1)
            int r1 = r14.f2423g
            r0.mo3115a(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p028v7.view.menu.C0804n.m3397g():android.support.v7.view.menu.m");
    }

    /* renamed from: a */
    private void m3396a(int i, int i2, boolean z, boolean z2) {
        C0803m b = mo3365b();
        b.mo3123c(z2);
        if (z) {
            if ((C0579c.m2179a(this.f2423g, C0595r.m2256f(this.f2422f)) & 7) == 5) {
                i -= this.f2422f.getWidth();
            }
            b.mo3120b(i);
            b.mo3122c(i2);
            int i3 = (int) ((48.0f * this.f2417a.getResources().getDisplayMetrics().density) / 2.0f);
            b.mo3355a(new Rect(i - i3, i2 - i3, i + i3, i2 + i3));
        }
        b.mo3114a();
    }

    /* renamed from: d */
    public void mo3367d() {
        if (mo3369f()) {
            this.f2426j.mo3121c();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo3368e() {
        this.f2426j = null;
        if (this.f2427k != null) {
            this.f2427k.onDismiss();
        }
    }

    /* renamed from: f */
    public boolean mo3369f() {
        return this.f2426j != null && this.f2426j.mo3124d();
    }

    /* renamed from: a */
    public void mo3360a(C0807a aVar) {
        this.f2425i = aVar;
        if (this.f2426j != null) {
            this.f2426j.mo3099a(aVar);
        }
    }
}
