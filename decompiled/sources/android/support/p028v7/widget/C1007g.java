package android.support.p028v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources.Theme;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.graphics.drawable.LayerDrawable;
import android.os.Build.VERSION;
import android.support.p014c.p015a.C0132c;
import android.support.p014c.p015a.C0142i;
import android.support.p017v4.content.C0356c;
import android.support.p017v4.graphics.C0401a;
import android.support.p017v4.graphics.drawable.C0407a;
import android.support.p017v4.p023d.C0376a;
import android.support.p017v4.p023d.C0383f;
import android.support.p017v4.p023d.C0384g;
import android.support.p017v4.p023d.C0399n;
import android.support.p028v7.p029a.C0672a.C0673a;
import android.support.p028v7.p029a.C0672a.C0675c;
import android.support.p028v7.p029a.C0672a.C0677e;
import android.support.p028v7.p031c.p032a.C0740a;
import android.support.p028v7.p033d.p034a.C0742a;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: android.support.v7.widget.g */
/* compiled from: AppCompatDrawableManager */
public final class C1007g {

    /* renamed from: a */
    private static final Mode f3334a = Mode.SRC_IN;

    /* renamed from: b */
    private static C1007g f3335b;

    /* renamed from: c */
    private static final C1010c f3336c = new C1010c(6);

    /* renamed from: d */
    private static final int[] f3337d = {C0677e.abc_textfield_search_default_mtrl_alpha, C0677e.abc_textfield_default_mtrl_alpha, C0677e.abc_ab_share_pack_mtrl_alpha};

    /* renamed from: e */
    private static final int[] f3338e = {C0677e.abc_ic_commit_search_api_mtrl_alpha, C0677e.abc_seekbar_tick_mark_material, C0677e.abc_ic_menu_share_mtrl_alpha, C0677e.abc_ic_menu_copy_mtrl_am_alpha, C0677e.abc_ic_menu_cut_mtrl_alpha, C0677e.abc_ic_menu_selectall_mtrl_alpha, C0677e.abc_ic_menu_paste_mtrl_am_alpha};

    /* renamed from: f */
    private static final int[] f3339f = {C0677e.abc_textfield_activated_mtrl_alpha, C0677e.abc_textfield_search_activated_mtrl_alpha, C0677e.abc_cab_background_top_mtrl_alpha, C0677e.abc_text_cursor_material, C0677e.abc_text_select_handle_left_mtrl_dark, C0677e.abc_text_select_handle_middle_mtrl_dark, C0677e.abc_text_select_handle_right_mtrl_dark, C0677e.abc_text_select_handle_left_mtrl_light, C0677e.abc_text_select_handle_middle_mtrl_light, C0677e.abc_text_select_handle_right_mtrl_light};

    /* renamed from: g */
    private static final int[] f3340g = {C0677e.abc_popup_background_mtrl_mult, C0677e.abc_cab_background_internal_bg, C0677e.abc_menu_hardkey_panel_mtrl_mult};

    /* renamed from: h */
    private static final int[] f3341h = {C0677e.abc_tab_indicator_material, C0677e.abc_textfield_search_material};

    /* renamed from: i */
    private static final int[] f3342i = {C0677e.abc_btn_check_material, C0677e.abc_btn_radio_material};

    /* renamed from: j */
    private WeakHashMap<Context, C0399n<ColorStateList>> f3343j;

    /* renamed from: k */
    private C0376a<String, C1011d> f3344k;

    /* renamed from: l */
    private C0399n<String> f3345l;

    /* renamed from: m */
    private final WeakHashMap<Context, C0383f<WeakReference<ConstantState>>> f3346m = new WeakHashMap<>(0);

    /* renamed from: n */
    private TypedValue f3347n;

    /* renamed from: o */
    private boolean f3348o;

    /* renamed from: android.support.v7.widget.g$a */
    /* compiled from: AppCompatDrawableManager */
    static class C1008a implements C1011d {
        C1008a() {
        }

        /* renamed from: a */
        public Drawable mo5243a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) {
            try {
                return C0742a.m3012a(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e) {
                Log.e("AsldcInflateDelegate", "Exception while inflating <animated-selector>", e);
                return null;
            }
        }
    }

    /* renamed from: android.support.v7.widget.g$b */
    /* compiled from: AppCompatDrawableManager */
    private static class C1009b implements C1011d {
        C1009b() {
        }

        /* renamed from: a */
        public Drawable mo5243a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) {
            try {
                return C0132c.m202a(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e) {
                Log.e("AvdcInflateDelegate", "Exception while inflating <animated-vector>", e);
                return null;
            }
        }
    }

    /* renamed from: android.support.v7.widget.g$c */
    /* compiled from: AppCompatDrawableManager */
    private static class C1010c extends C0384g<Integer, PorterDuffColorFilter> {
        public C1010c(int i) {
            super(i);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public PorterDuffColorFilter mo5244a(int i, Mode mode) {
            return (PorterDuffColorFilter) mo1318a(Integer.valueOf(m4594b(i, mode)));
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public PorterDuffColorFilter mo5245a(int i, Mode mode, PorterDuffColorFilter porterDuffColorFilter) {
            return (PorterDuffColorFilter) mo1319a(Integer.valueOf(m4594b(i, mode)), porterDuffColorFilter);
        }

        /* renamed from: b */
        private static int m4594b(int i, Mode mode) {
            return (31 * (i + 31)) + mode.hashCode();
        }
    }

    /* renamed from: android.support.v7.widget.g$d */
    /* compiled from: AppCompatDrawableManager */
    private interface C1011d {
        /* renamed from: a */
        Drawable mo5243a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme);
    }

    /* renamed from: android.support.v7.widget.g$e */
    /* compiled from: AppCompatDrawableManager */
    private static class C1012e implements C1011d {
        C1012e() {
        }

        /* renamed from: a */
        public Drawable mo5243a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) {
            try {
                return C0142i.m236a(context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e) {
                Log.e("VdcInflateDelegate", "Exception while inflating <vector>", e);
                return null;
            }
        }
    }

    /* renamed from: a */
    public static synchronized C1007g m4568a() {
        C1007g gVar;
        synchronized (C1007g.class) {
            if (f3335b == null) {
                f3335b = new C1007g();
                m4572a(f3335b);
            }
            gVar = f3335b;
        }
        return gVar;
    }

    /* renamed from: a */
    private static void m4572a(C1007g gVar) {
        if (VERSION.SDK_INT < 24) {
            gVar.m4573a("vector", (C1011d) new C1012e());
            gVar.m4573a("animated-vector", (C1011d) new C1009b());
            gVar.m4573a("animated-selector", (C1011d) new C1008a());
        }
    }

    /* renamed from: a */
    public synchronized Drawable mo5238a(Context context, int i) {
        return mo5239a(context, i, false);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public synchronized Drawable mo5239a(Context context, int i, boolean z) {
        Drawable d;
        m4586f(context);
        d = m4582d(context, i);
        if (d == null) {
            d = m4580c(context, i);
        }
        if (d == null) {
            d = C0356c.m1312a(context, i);
        }
        if (d != null) {
            d = m4566a(context, i, z, d);
        }
        if (d != null) {
            C1043w.m4826b(d);
        }
        return d;
    }

    /* renamed from: a */
    public synchronized void mo5241a(Context context) {
        C0383f fVar = (C0383f) this.f3346m.get(context);
        if (fVar != null) {
            fVar.mo1314c();
        }
    }

    /* renamed from: a */
    private static long m4562a(TypedValue typedValue) {
        return (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
    }

    /* renamed from: c */
    private Drawable m4580c(Context context, int i) {
        if (this.f3347n == null) {
            this.f3347n = new TypedValue();
        }
        TypedValue typedValue = this.f3347n;
        context.getResources().getValue(i, typedValue, true);
        long a = m4562a(typedValue);
        Drawable a2 = m4567a(context, a);
        if (a2 != null) {
            return a2;
        }
        if (i == C0677e.abc_cab_background_top_material) {
            a2 = new LayerDrawable(new Drawable[]{mo5238a(context, C0677e.abc_cab_background_internal_bg), mo5238a(context, C0677e.abc_cab_background_top_mtrl_alpha)});
        }
        if (a2 != null) {
            a2.setChangingConfigurations(typedValue.changingConfigurations);
            m4575a(context, a, a2);
        }
        return a2;
    }

    /* renamed from: a */
    private Drawable m4566a(Context context, int i, boolean z, Drawable drawable) {
        ColorStateList b = mo5242b(context, i);
        if (b != null) {
            if (C1043w.m4827c(drawable)) {
                drawable = drawable.mutate();
            }
            Drawable f = C0407a.m1550f(drawable);
            C0407a.m1540a(f, b);
            Mode a = m4563a(i);
            if (a == null) {
                return f;
            }
            C0407a.m1543a(f, a);
            return f;
        } else if (i == C0677e.abc_seekbar_track_material) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            m4570a(layerDrawable.findDrawableByLayerId(16908288), C0972at.m4355a(context, C0673a.colorControlNormal), f3334a);
            m4570a(layerDrawable.findDrawableByLayerId(16908303), C0972at.m4355a(context, C0673a.colorControlNormal), f3334a);
            m4570a(layerDrawable.findDrawableByLayerId(16908301), C0972at.m4355a(context, C0673a.colorControlActivated), f3334a);
            return drawable;
        } else if (i == C0677e.abc_ratingbar_material || i == C0677e.abc_ratingbar_indicator_material || i == C0677e.abc_ratingbar_small_material) {
            LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
            m4570a(layerDrawable2.findDrawableByLayerId(16908288), C0972at.m4359c(context, C0673a.colorControlNormal), f3334a);
            m4570a(layerDrawable2.findDrawableByLayerId(16908303), C0972at.m4355a(context, C0673a.colorControlActivated), f3334a);
            m4570a(layerDrawable2.findDrawableByLayerId(16908301), C0972at.m4355a(context, C0673a.colorControlActivated), f3334a);
            return drawable;
        } else if (m4574a(context, i, drawable) || !z) {
            return drawable;
        } else {
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0079 A[Catch:{ Exception -> 0x00a8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0081 A[Catch:{ Exception -> 0x00a8 }] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.graphics.drawable.Drawable m4582d(android.content.Context r10, int r11) {
        /*
            r9 = this;
            android.support.v4.d.a<java.lang.String, android.support.v7.widget.g$d> r0 = r9.f3344k
            r1 = 0
            if (r0 == 0) goto L_0x00ba
            android.support.v4.d.a<java.lang.String, android.support.v7.widget.g$d> r0 = r9.f3344k
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x00ba
            android.support.v4.d.n<java.lang.String> r0 = r9.f3345l
            if (r0 == 0) goto L_0x002c
            android.support.v4.d.n<java.lang.String> r0 = r9.f3345l
            java.lang.Object r0 = r0.mo1414a(r11)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r2 = "appcompat_skip_skip"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L_0x002b
            if (r0 == 0) goto L_0x0033
            android.support.v4.d.a<java.lang.String, android.support.v7.widget.g$d> r2 = r9.f3344k
            java.lang.Object r0 = r2.get(r0)
            if (r0 != 0) goto L_0x0033
        L_0x002b:
            return r1
        L_0x002c:
            android.support.v4.d.n r0 = new android.support.v4.d.n
            r0.<init>()
            r9.f3345l = r0
        L_0x0033:
            android.util.TypedValue r0 = r9.f3347n
            if (r0 != 0) goto L_0x003e
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            r9.f3347n = r0
        L_0x003e:
            android.util.TypedValue r0 = r9.f3347n
            android.content.res.Resources r1 = r10.getResources()
            r2 = 1
            r1.getValue(r11, r0, r2)
            long r3 = m4562a(r0)
            android.graphics.drawable.Drawable r5 = r9.m4567a(r10, r3)
            if (r5 == 0) goto L_0x0053
            return r5
        L_0x0053:
            java.lang.CharSequence r6 = r0.string
            if (r6 == 0) goto L_0x00b0
            java.lang.CharSequence r6 = r0.string
            java.lang.String r6 = r6.toString()
            java.lang.String r7 = ".xml"
            boolean r6 = r6.endsWith(r7)
            if (r6 == 0) goto L_0x00b0
            android.content.res.XmlResourceParser r1 = r1.getXml(r11)     // Catch:{ Exception -> 0x00a8 }
            android.util.AttributeSet r6 = android.util.Xml.asAttributeSet(r1)     // Catch:{ Exception -> 0x00a8 }
        L_0x006d:
            int r7 = r1.next()     // Catch:{ Exception -> 0x00a8 }
            r8 = 2
            if (r7 == r8) goto L_0x0077
            if (r7 == r2) goto L_0x0077
            goto L_0x006d
        L_0x0077:
            if (r7 == r8) goto L_0x0081
            org.xmlpull.v1.XmlPullParserException r10 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ Exception -> 0x00a8 }
            java.lang.String r0 = "No start tag found"
            r10.<init>(r0)     // Catch:{ Exception -> 0x00a8 }
            throw r10     // Catch:{ Exception -> 0x00a8 }
        L_0x0081:
            java.lang.String r2 = r1.getName()     // Catch:{ Exception -> 0x00a8 }
            android.support.v4.d.n<java.lang.String> r7 = r9.f3345l     // Catch:{ Exception -> 0x00a8 }
            r7.mo1421c(r11, r2)     // Catch:{ Exception -> 0x00a8 }
            android.support.v4.d.a<java.lang.String, android.support.v7.widget.g$d> r7 = r9.f3344k     // Catch:{ Exception -> 0x00a8 }
            java.lang.Object r2 = r7.get(r2)     // Catch:{ Exception -> 0x00a8 }
            android.support.v7.widget.g$d r2 = (android.support.p028v7.widget.C1007g.C1011d) r2     // Catch:{ Exception -> 0x00a8 }
            if (r2 == 0) goto L_0x009d
            android.content.res.Resources$Theme r7 = r10.getTheme()     // Catch:{ Exception -> 0x00a8 }
            android.graphics.drawable.Drawable r1 = r2.mo5243a(r10, r1, r6, r7)     // Catch:{ Exception -> 0x00a8 }
            r5 = r1
        L_0x009d:
            if (r5 == 0) goto L_0x00b0
            int r0 = r0.changingConfigurations     // Catch:{ Exception -> 0x00a8 }
            r5.setChangingConfigurations(r0)     // Catch:{ Exception -> 0x00a8 }
            r9.m4575a(r10, r3, r5)     // Catch:{ Exception -> 0x00a8 }
            goto L_0x00b0
        L_0x00a8:
            r10 = move-exception
            java.lang.String r0 = "AppCompatDrawableManag"
            java.lang.String r1 = "Exception while inflating drawable"
            android.util.Log.e(r0, r1, r10)
        L_0x00b0:
            if (r5 != 0) goto L_0x00b9
            android.support.v4.d.n<java.lang.String> r10 = r9.f3345l
            java.lang.String r0 = "appcompat_skip_skip"
            r10.mo1421c(r11, r0)
        L_0x00b9:
            return r5
        L_0x00ba:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p028v7.widget.C1007g.m4582d(android.content.Context, int):android.graphics.drawable.Drawable");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002c, code lost:
        return null;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized android.graphics.drawable.Drawable m4567a(android.content.Context r4, long r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            java.util.WeakHashMap<android.content.Context, android.support.v4.d.f<java.lang.ref.WeakReference<android.graphics.drawable.Drawable$ConstantState>>> r0 = r3.f3346m     // Catch:{ all -> 0x002d }
            java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x002d }
            android.support.v4.d.f r0 = (android.support.p017v4.p023d.C0383f) r0     // Catch:{ all -> 0x002d }
            r1 = 0
            if (r0 != 0) goto L_0x000e
            monitor-exit(r3)
            return r1
        L_0x000e:
            java.lang.Object r2 = r0.mo1306a(r5)     // Catch:{ all -> 0x002d }
            java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2     // Catch:{ all -> 0x002d }
            if (r2 == 0) goto L_0x002b
            java.lang.Object r2 = r2.get()     // Catch:{ all -> 0x002d }
            android.graphics.drawable.Drawable$ConstantState r2 = (android.graphics.drawable.Drawable.ConstantState) r2     // Catch:{ all -> 0x002d }
            if (r2 == 0) goto L_0x0028
            android.content.res.Resources r4 = r4.getResources()     // Catch:{ all -> 0x002d }
            android.graphics.drawable.Drawable r4 = r2.newDrawable(r4)     // Catch:{ all -> 0x002d }
            monitor-exit(r3)
            return r4
        L_0x0028:
            r0.mo1311b(r5)     // Catch:{ all -> 0x002d }
        L_0x002b:
            monitor-exit(r3)
            return r1
        L_0x002d:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p028v7.widget.C1007g.m4567a(android.content.Context, long):android.graphics.drawable.Drawable");
    }

    /* renamed from: a */
    private synchronized boolean m4575a(Context context, long j, Drawable drawable) {
        ConstantState constantState = drawable.getConstantState();
        if (constantState == null) {
            return false;
        }
        C0383f fVar = (C0383f) this.f3346m.get(context);
        if (fVar == null) {
            fVar = new C0383f();
            this.f3346m.put(context, fVar);
        }
        fVar.mo1312b(j, new WeakReference(constantState));
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public synchronized Drawable mo5240a(Context context, C0987bd bdVar, int i) {
        Drawable d = m4582d(context, i);
        if (d == null) {
            d = bdVar.mo5156a(i);
        }
        if (d == null) {
            return null;
        }
        return m4566a(context, i, false, d);
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0060 A[RETURN] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static boolean m4574a(android.content.Context r6, int r7, android.graphics.drawable.Drawable r8) {
        /*
            android.graphics.PorterDuff$Mode r0 = f3334a
            int[] r1 = f3337d
            boolean r1 = m4577a(r1, r7)
            r2 = 16842801(0x1010031, float:2.3693695E-38)
            r3 = -1
            r4 = 0
            r5 = 1
            if (r1 == 0) goto L_0x0015
            int r2 = android.support.p028v7.p029a.C0672a.C0673a.colorControlNormal
        L_0x0012:
            r1 = r3
        L_0x0013:
            r7 = r5
            goto L_0x0043
        L_0x0015:
            int[] r1 = f3339f
            boolean r1 = m4577a(r1, r7)
            if (r1 == 0) goto L_0x0020
            int r2 = android.support.p028v7.p029a.C0672a.C0673a.colorControlActivated
            goto L_0x0012
        L_0x0020:
            int[] r1 = f3340g
            boolean r1 = m4577a(r1, r7)
            if (r1 == 0) goto L_0x002b
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.MULTIPLY
            goto L_0x0012
        L_0x002b:
            int r1 = android.support.p028v7.p029a.C0672a.C0677e.abc_list_divider_mtrl_alpha
            if (r7 != r1) goto L_0x003b
            r2 = 16842800(0x1010030, float:2.3693693E-38)
            r7 = 1109603123(0x42233333, float:40.8)
            int r7 = java.lang.Math.round(r7)
            r1 = r7
            goto L_0x0013
        L_0x003b:
            int r1 = android.support.p028v7.p029a.C0672a.C0677e.abc_dialog_material_background
            if (r7 != r1) goto L_0x0040
            goto L_0x0012
        L_0x0040:
            r1 = r3
            r7 = r4
            r2 = r7
        L_0x0043:
            if (r7 == 0) goto L_0x0060
            boolean r7 = android.support.p028v7.widget.C1043w.m4827c(r8)
            if (r7 == 0) goto L_0x004f
            android.graphics.drawable.Drawable r8 = r8.mutate()
        L_0x004f:
            int r6 = android.support.p028v7.widget.C0972at.m4355a(r6, r2)
            android.graphics.PorterDuffColorFilter r6 = m4564a(r6, r0)
            r8.setColorFilter(r6)
            if (r1 == r3) goto L_0x005f
            r8.setAlpha(r1)
        L_0x005f:
            return r5
        L_0x0060:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p028v7.widget.C1007g.m4574a(android.content.Context, int, android.graphics.drawable.Drawable):boolean");
    }

    /* renamed from: a */
    private void m4573a(String str, C1011d dVar) {
        if (this.f3344k == null) {
            this.f3344k = new C0376a<>();
        }
        this.f3344k.put(str, dVar);
    }

    /* renamed from: a */
    private static boolean m4577a(int[] iArr, int i) {
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    static Mode m4563a(int i) {
        if (i == C0677e.abc_switch_thumb_material) {
            return Mode.MULTIPLY;
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public synchronized ColorStateList mo5242b(Context context, int i) {
        ColorStateList e;
        e = m4584e(context, i);
        if (e == null) {
            if (i == C0677e.abc_edit_text_material) {
                e = C0740a.m3005a(context, C0675c.abc_tint_edittext);
            } else if (i == C0677e.abc_switch_track_mtrl_alpha) {
                e = C0740a.m3005a(context, C0675c.abc_tint_switch_track);
            } else if (i == C0677e.abc_switch_thumb_material) {
                e = m4583e(context);
            } else if (i == C0677e.abc_btn_default_mtrl_shape) {
                e = m4578b(context);
            } else if (i == C0677e.abc_btn_borderless_material) {
                e = m4579c(context);
            } else if (i == C0677e.abc_btn_colored_material) {
                e = m4581d(context);
            } else {
                if (i != C0677e.abc_spinner_mtrl_am_alpha) {
                    if (i != C0677e.abc_spinner_textfield_background_material) {
                        if (m4577a(f3338e, i)) {
                            e = C0972at.m4358b(context, C0673a.colorControlNormal);
                        } else if (m4577a(f3341h, i)) {
                            e = C0740a.m3005a(context, C0675c.abc_tint_default);
                        } else if (m4577a(f3342i, i)) {
                            e = C0740a.m3005a(context, C0675c.abc_tint_btn_checkable);
                        } else if (i == C0677e.abc_seekbar_thumb_material) {
                            e = C0740a.m3005a(context, C0675c.abc_tint_seek_thumb);
                        }
                    }
                }
                e = C0740a.m3005a(context, C0675c.abc_tint_spinner);
            }
            if (e != null) {
                m4569a(context, i, e);
            }
        }
        return e;
    }

    /* renamed from: e */
    private ColorStateList m4584e(Context context, int i) {
        ColorStateList colorStateList = null;
        if (this.f3343j == null) {
            return null;
        }
        C0399n nVar = (C0399n) this.f3343j.get(context);
        if (nVar != null) {
            colorStateList = (ColorStateList) nVar.mo1414a(i);
        }
        return colorStateList;
    }

    /* renamed from: a */
    private void m4569a(Context context, int i, ColorStateList colorStateList) {
        if (this.f3343j == null) {
            this.f3343j = new WeakHashMap<>();
        }
        C0399n nVar = (C0399n) this.f3343j.get(context);
        if (nVar == null) {
            nVar = new C0399n();
            this.f3343j.put(context, nVar);
        }
        nVar.mo1421c(i, colorStateList);
    }

    /* renamed from: b */
    private ColorStateList m4578b(Context context) {
        return m4585f(context, C0972at.m4355a(context, C0673a.colorButtonNormal));
    }

    /* renamed from: c */
    private ColorStateList m4579c(Context context) {
        return m4585f(context, 0);
    }

    /* renamed from: d */
    private ColorStateList m4581d(Context context) {
        return m4585f(context, C0972at.m4355a(context, C0673a.colorAccent));
    }

    /* renamed from: f */
    private ColorStateList m4585f(Context context, int i) {
        int a = C0972at.m4355a(context, C0673a.colorControlHighlight);
        return new ColorStateList(new int[][]{C0972at.f3207a, C0972at.f3210d, C0972at.f3208b, C0972at.f3214h}, new int[]{C0972at.m4359c(context, C0673a.colorButtonNormal), C0401a.m1502a(a, i), C0401a.m1502a(a, i), i});
    }

    /* renamed from: e */
    private ColorStateList m4583e(Context context) {
        int[][] iArr = new int[3][];
        int[] iArr2 = new int[3];
        ColorStateList b = C0972at.m4358b(context, C0673a.colorSwitchThumbNormal);
        if (b == null || !b.isStateful()) {
            iArr[0] = C0972at.f3207a;
            iArr2[0] = C0972at.m4359c(context, C0673a.colorSwitchThumbNormal);
            iArr[1] = C0972at.f3211e;
            iArr2[1] = C0972at.m4355a(context, C0673a.colorControlActivated);
            iArr[2] = C0972at.f3214h;
            iArr2[2] = C0972at.m4355a(context, C0673a.colorSwitchThumbNormal);
        } else {
            iArr[0] = C0972at.f3207a;
            iArr2[0] = b.getColorForState(iArr[0], 0);
            iArr[1] = C0972at.f3211e;
            iArr2[1] = C0972at.m4355a(context, C0673a.colorControlActivated);
            iArr[2] = C0972at.f3214h;
            iArr2[2] = b.getDefaultColor();
        }
        return new ColorStateList(iArr, iArr2);
    }

    /* renamed from: a */
    static void m4571a(Drawable drawable, C0975aw awVar, int[] iArr) {
        if (!C1043w.m4827c(drawable) || drawable.mutate() == drawable) {
            if (awVar.f3224d || awVar.f3223c) {
                drawable.setColorFilter(m4565a(awVar.f3224d ? awVar.f3221a : null, awVar.f3223c ? awVar.f3222b : f3334a, iArr));
            } else {
                drawable.clearColorFilter();
            }
            if (VERSION.SDK_INT <= 23) {
                drawable.invalidateSelf();
            }
            return;
        }
        Log.d("AppCompatDrawableManag", "Mutated drawable is not the same instance as the input.");
    }

    /* renamed from: a */
    private static PorterDuffColorFilter m4565a(ColorStateList colorStateList, Mode mode, int[] iArr) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return m4564a(colorStateList.getColorForState(iArr, 0), mode);
    }

    /* renamed from: a */
    public static synchronized PorterDuffColorFilter m4564a(int i, Mode mode) {
        PorterDuffColorFilter a;
        synchronized (C1007g.class) {
            a = f3336c.mo5244a(i, mode);
            if (a == null) {
                a = new PorterDuffColorFilter(i, mode);
                f3336c.mo5245a(i, mode, a);
            }
        }
        return a;
    }

    /* renamed from: a */
    private static void m4570a(Drawable drawable, int i, Mode mode) {
        if (C1043w.m4827c(drawable)) {
            drawable = drawable.mutate();
        }
        if (mode == null) {
            mode = f3334a;
        }
        drawable.setColorFilter(m4564a(i, mode));
    }

    /* renamed from: f */
    private void m4586f(Context context) {
        if (!this.f3348o) {
            this.f3348o = true;
            Drawable a = mo5238a(context, C0677e.abc_vector_test);
            if (a == null || !m4576a(a)) {
                this.f3348o = false;
                throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
            }
        }
    }

    /* renamed from: a */
    private static boolean m4576a(Drawable drawable) {
        return (drawable instanceof C0142i) || "android.graphics.drawable.VectorDrawable".equals(drawable.getClass().getName());
    }
}
