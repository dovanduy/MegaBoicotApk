package com.facebook.ads.internal.p125x;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.os.Handler;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import com.facebook.ads.AdError;
import com.facebook.ads.internal.p091r.C1795a;
import com.facebook.ads.internal.p115w.p116a.C2305b;
import com.facebook.ads.internal.p115w.p117b.C2339v;
import com.facebook.ads.internal.p115w.p117b.C2342x;
import com.facebook.ads.internal.p115w.p117b.C2344y;
import com.facebook.ads.internal.p115w.p117b.C2345z;
import com.facebook.ads.internal.p115w.p124i.C2374a;
import com.facebook.ads.internal.p115w.p124i.C2375b;
import java.lang.ref.WeakReference;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Vector;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.internal.x.a */
public class C2376a {

    /* renamed from: a */
    private static final String f7527a = "a";
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final View f7528b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final int f7529c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final int f7530d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final WeakReference<C2377a> f7531e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final Handler f7532f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final boolean f7533g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public Runnable f7534h;

    /* renamed from: i */
    private int f7535i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public int f7536j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public boolean f7537k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public C2379b f7538l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public Map<String, Integer> f7539m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public long f7540n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public int f7541o;

    /* renamed from: com.facebook.ads.internal.x.a$a */
    public static abstract class C2377a {
        /* renamed from: a */
        public abstract void mo7108a();

        /* renamed from: b */
        public void mo7729b() {
        }
    }

    /* renamed from: com.facebook.ads.internal.x.a$b */
    private static final class C2378b extends C2344y<C2376a> {
        C2378b(C2376a aVar) {
            super(aVar);
        }

        public void run() {
            C2376a aVar = (C2376a) mo8745a();
            if (aVar != null) {
                View a = aVar.f7528b;
                C2377a aVar2 = (C2377a) aVar.f7531e.get();
                if (a != null && aVar2 != null) {
                    C2379b a2 = C2376a.m9163a(a, aVar.f7529c);
                    int i = 0;
                    if (a2.mo8785a()) {
                        aVar.f7541o = aVar.f7541o + 1;
                    } else {
                        aVar.f7541o = 0;
                    }
                    boolean z = aVar.f7541o > aVar.f7530d;
                    boolean z2 = aVar.f7538l != null && aVar.f7538l.mo8785a();
                    if (z || !a2.mo8785a()) {
                        aVar.f7538l = a2;
                    }
                    String valueOf = String.valueOf(a2.mo8786b());
                    synchronized (aVar) {
                        if (aVar.f7539m.containsKey(valueOf)) {
                            i = ((Integer) aVar.f7539m.get(valueOf)).intValue();
                        }
                        aVar.f7539m.put(valueOf, Integer.valueOf(i + 1));
                    }
                    if (z && !z2) {
                        aVar.f7540n = System.currentTimeMillis();
                        aVar2.mo7108a();
                        if (!aVar.f7533g) {
                            return;
                        }
                    } else if (!z && z2) {
                        aVar2.mo7729b();
                    }
                    if (!aVar.f7537k && aVar.f7534h != null) {
                        aVar.f7532f.postDelayed(aVar.f7534h, (long) aVar.f7536j);
                    }
                }
            }
        }
    }

    public C2376a(View view, int i, int i2, boolean z, C2377a aVar) {
        this.f7532f = new Handler();
        this.f7535i = 0;
        this.f7536j = AdError.NETWORK_ERROR_CODE;
        this.f7537k = true;
        this.f7538l = new C2379b(C2380c.UNKNOWN);
        this.f7539m = new HashMap();
        this.f7540n = 0;
        this.f7541o = 0;
        this.f7528b = view;
        if (this.f7528b.getId() == -1) {
            C2342x.m9081a(this.f7528b);
        }
        this.f7529c = i;
        this.f7531e = new WeakReference<>(aVar);
        this.f7533g = z;
        if (i2 < 0) {
            i2 = 0;
        }
        this.f7530d = i2;
    }

    public C2376a(View view, int i, C2377a aVar) {
        this(view, i, 0, false, aVar);
    }

    public C2376a(View view, int i, boolean z, C2377a aVar) {
        this(view, i, 0, z, aVar);
    }

    /* renamed from: a */
    static float m9157a(View view) {
        float alpha = view.getAlpha();
        while (view.getParent() instanceof ViewGroup) {
            view = (View) view.getParent();
            float alpha2 = view.getAlpha();
            if (alpha2 < 0.0f) {
                alpha2 = 0.0f;
            }
            if (alpha2 > 1.0f) {
                alpha2 = 1.0f;
            }
            alpha *= alpha2;
        }
        return alpha;
    }

    /* renamed from: a */
    private static int m9159a(Vector<Rect> vector) {
        int size = vector.size();
        int i = size * 2;
        int[] iArr = new int[i];
        int[] iArr2 = new int[i];
        boolean[][] zArr = (boolean[][]) Array.newInstance(boolean.class, new int[]{i, i});
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i2 < size) {
            Rect rect = (Rect) vector.elementAt(i2);
            int i5 = i3 + 1;
            iArr[i3] = rect.left;
            int i6 = i4 + 1;
            iArr2[i4] = rect.bottom;
            int i7 = i5 + 1;
            iArr[i5] = rect.right;
            int i8 = i6 + 1;
            iArr2[i6] = rect.top;
            i2++;
            i3 = i7;
            i4 = i8;
        }
        Arrays.sort(iArr);
        Arrays.sort(iArr2);
        for (int i9 = 0; i9 < size; i9++) {
            Rect rect2 = (Rect) vector.elementAt(i9);
            int a = m9160a(iArr, rect2.left);
            int a2 = m9160a(iArr, rect2.right);
            int a3 = m9160a(iArr2, rect2.top);
            int a4 = m9160a(iArr2, rect2.bottom);
            for (int i10 = a + 1; i10 <= a2; i10++) {
                for (int i11 = a3 + 1; i11 <= a4; i11++) {
                    zArr[i10][i11] = true;
                }
            }
        }
        int i12 = 0;
        int i13 = 0;
        while (i12 < i) {
            int i14 = i13;
            for (int i15 = 0; i15 < i; i15++) {
                i14 += zArr[i12][i15] ? (iArr[i12] - iArr[i12 - 1]) * (iArr2[i15] - iArr2[i15 - 1]) : 0;
            }
            i12++;
            i13 = i14;
        }
        return i13;
    }

    /* renamed from: a */
    private static int m9160a(int[] iArr, int i) {
        int i2 = 0;
        int length = iArr.length;
        while (i2 < length) {
            int i3 = ((length - i2) / 2) + i2;
            if (iArr[i3] == i) {
                return i3;
            }
            if (iArr[i3] > i) {
                length = i3;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    /* renamed from: a */
    public static C2379b m9163a(View view, int i) {
        DisplayMetrics displayMetrics;
        float f;
        int i2;
        View view2 = view;
        if (view2 == null) {
            return new C2379b(C2380c.AD_IS_NULL);
        }
        if (view.getParent() == null) {
            return new C2379b(C2380c.INVALID_PARENT);
        }
        if (!view.isShown()) {
            return new C2379b(C2380c.INVALID_PARENT);
        }
        if (view.getWindowVisibility() != 0) {
            return new C2379b(C2380c.INVALID_WINDOW);
        }
        if (view.getMeasuredWidth() <= 0 || view.getMeasuredHeight() <= 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("mAdView has invisible dimensions (w=");
            sb.append(view.getMeasuredWidth());
            sb.append(", h=");
            sb.append(view.getMeasuredHeight());
            sb.toString();
            return new C2379b(C2380c.INVALID_DIMENSIONS);
        } else if (m9157a(view) < 0.9f) {
            return new C2379b(C2380c.AD_IS_TRANSPARENT);
        } else {
            int width = view.getWidth();
            int height = view.getHeight();
            int[] iArr = new int[2];
            try {
                view2.getLocationOnScreen(iArr);
                Rect rect = new Rect();
                if (!view2.getGlobalVisibleRect(rect)) {
                    return new C2379b(C2380c.AD_IS_NOT_VISIBLE);
                }
                Context context = view.getContext();
                if (VERSION.SDK_INT >= 17) {
                    Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
                    displayMetrics = new DisplayMetrics();
                    defaultDisplay.getRealMetrics(displayMetrics);
                } else {
                    displayMetrics = context.getResources().getDisplayMetrics();
                }
                Vector b = m9166b(view);
                int a = m9159a(b);
                b.add(rect);
                float a2 = (((float) (m9159a(b) - a)) * 1.0f) / ((float) (view.getMeasuredHeight() * view.getMeasuredWidth()));
                boolean L = C1795a.m7418L(context);
                int width2 = view.getWidth() * view.getHeight();
                if (width2 > 0) {
                    f = 100.0f / ((float) width2);
                    i2 = i;
                } else {
                    i2 = i;
                    f = 100.0f;
                }
                int[] iArr2 = iArr;
                int max = (int) Math.max((double) i2, Math.ceil((double) f));
                float f2 = ((float) max) / 100.0f;
                if (L) {
                    if (a2 < f2) {
                        String.format(Locale.US, "mAdView visible area is too small [%.2f%% visible, current threshold %.2f%%]", new Object[]{Float.valueOf(a2), Float.valueOf(f2)});
                        return new C2379b(C2380c.AD_INSUFFICIENT_VISIBLE_AREA, a2);
                    }
                } else if (iArr2[0] < 0 || displayMetrics.widthPixels - iArr2[0] < width) {
                    return new C2379b(C2380c.AD_OFFSCREEN_HORIZONTALLY, a2);
                } else {
                    int i3 = (int) ((((double) height) * (100.0d - ((double) max))) / 100.0d);
                    if (rect.top - iArr2[1] > i3) {
                        return new C2379b(C2380c.AD_OFFSCREEN_TOP, a2);
                    }
                    if ((iArr2[1] + height) - rect.bottom > i3) {
                        return new C2379b(C2380c.AD_OFFSCREEN_BOTTOM, a2);
                    }
                }
                if (!C2374a.m9154b(context)) {
                    return new C2379b(C2380c.SCREEN_NOT_INTERACTIVE, a2);
                }
                Map a3 = C2375b.m9155a(context);
                if (C2345z.m9096b(a3)) {
                    return new C2379b(C2380c.AD_IS_OBSTRUCTED_BY_KEYGUARD, a2);
                }
                if (C1795a.m7451j(context) && C2345z.m9095a(a3)) {
                    return new C2379b(C2380c.AD_IN_LOCKSCREEN, a2, a3);
                }
                Float f3 = null;
                if (C1795a.m7414H(context)) {
                    Activity a4 = C2305b.m9012a();
                    if (a4 != null) {
                        View findViewById = a4.findViewById(16908290);
                        if (findViewById == null) {
                            findViewById = a4.getWindow().getDecorView().findViewById(16908290);
                        }
                        if (!(findViewById == null || view2 == null || view.getId() == -1)) {
                            f3 = findViewById.findViewById(view.getId()) == null ? Float.valueOf(-1.0f) : C2381d.m9193a(findViewById, view2);
                        }
                    }
                }
                if (f3 != null) {
                    if (f3.floatValue() == -1.0f) {
                        return new C2379b(C2380c.AD_IS_NOT_IN_ACTIVITY);
                    }
                    if (f3.floatValue() == 0.0f) {
                        return new C2379b(C2380c.AD_IS_NOT_VISIBLE);
                    }
                }
                if (!C1795a.m7415I(context) || f3 == null || f3.floatValue() >= f2) {
                    return new C2379b(C2380c.IS_VIEWABLE, a2, a3);
                }
                String.format(Locale.US, "mAdView visible area is too small [%.2f%% visible, current threshold %.2f%%]", new Object[]{f3, Float.valueOf(f2)});
                return new C2379b(C2380c.AD_INSUFFICIENT_VISIBLE_AREA, a2, a3);
            } catch (NullPointerException unused) {
                return new C2379b(C2380c.INVALID_DIMENSIONS);
            }
        }
    }

    /* renamed from: b */
    private static Vector<Rect> m9166b(View view) {
        Vector<Rect> vector = new Vector<>();
        if (!(view.getParent() instanceof ViewGroup)) {
            return vector;
        }
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        int indexOfChild = viewGroup.indexOfChild(view);
        while (true) {
            indexOfChild++;
            if (indexOfChild < viewGroup.getChildCount()) {
                vector.addAll(m9168c(viewGroup.getChildAt(indexOfChild)));
            } else {
                vector.addAll(m9166b((View) viewGroup));
                return vector;
            }
        }
    }

    /* renamed from: c */
    private static Vector<Rect> m9168c(View view) {
        Vector<Rect> vector = new Vector<>();
        if (!view.isShown() || (VERSION.SDK_INT >= 11 && view.getAlpha() <= 0.0f)) {
            return vector;
        }
        if (view instanceof ViewGroup) {
            if (view.getBackground() == null || (VERSION.SDK_INT >= 19 && view.getBackground().getAlpha() <= 0)) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    vector.addAll(m9168c(viewGroup.getChildAt(i)));
                }
                return vector;
            }
        }
        Rect rect = new Rect();
        if (view.getGlobalVisibleRect(rect)) {
            vector.add(rect);
        }
        return vector;
    }

    /* renamed from: a */
    public synchronized void mo8777a() {
        if (this.f7534h != null) {
            mo8782c();
        }
        this.f7534h = new C2378b(this);
        this.f7532f.postDelayed(this.f7534h, (long) this.f7535i);
        this.f7537k = false;
        this.f7541o = 0;
        this.f7538l = new C2379b(C2380c.UNKNOWN);
        this.f7539m = new HashMap();
    }

    /* renamed from: a */
    public void mo8778a(int i) {
        this.f7535i = i;
    }

    /* renamed from: a */
    public synchronized void mo8779a(Map<String, String> map) {
        map.put("vrc", String.valueOf(this.f7538l.mo8786b()));
        map.put("vp", String.valueOf(this.f7538l.mo8787c()));
        map.put("vh", new JSONObject(this.f7539m).toString());
        map.put("vt", C2339v.m9070b(this.f7540n));
        map.putAll(this.f7538l.mo8788d());
    }

    /* renamed from: b */
    public void mo8780b(int i) {
        this.f7536j = i;
    }

    /* renamed from: b */
    public synchronized boolean mo8781b() {
        return this.f7537k;
    }

    /* renamed from: c */
    public synchronized void mo8782c() {
        this.f7532f.removeCallbacks(this.f7534h);
        this.f7534h = null;
        this.f7537k = true;
        this.f7541o = 0;
    }

    /* renamed from: d */
    public synchronized String mo8783d() {
        StringBuilder sb;
        C2380c cVar = C2380c.values()[this.f7538l.mo8786b()];
        sb = new StringBuilder();
        sb.append(cVar.toString());
        sb.append(String.format(Locale.US, " (%.1f%%)", new Object[]{Float.valueOf(this.f7538l.mo8787c() * 100.0f)}));
        return sb.toString();
    }
}
