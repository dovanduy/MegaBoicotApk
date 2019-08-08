package android.support.p017v4.view;

import android.view.View;
import android.view.ViewParent;

/* renamed from: android.support.v4.view.k */
/* compiled from: NestedScrollingChildHelper */
public class C0588k {

    /* renamed from: a */
    private ViewParent f1426a;

    /* renamed from: b */
    private ViewParent f1427b;

    /* renamed from: c */
    private final View f1428c;

    /* renamed from: d */
    private boolean f1429d;

    /* renamed from: e */
    private int[] f1430e;

    public C0588k(View view) {
        this.f1428c = view;
    }

    /* renamed from: a */
    public void mo2069a(boolean z) {
        if (this.f1429d) {
            C0595r.m2273v(this.f1428c);
        }
        this.f1429d = z;
    }

    /* renamed from: a */
    public boolean mo2070a() {
        return this.f1429d;
    }

    /* renamed from: b */
    public boolean mo2079b() {
        return mo2073a(0);
    }

    /* renamed from: a */
    public boolean mo2073a(int i) {
        return m2201d(i) != null;
    }

    /* renamed from: b */
    public boolean mo2080b(int i) {
        return mo2074a(i, 0);
    }

    /* renamed from: a */
    public boolean mo2074a(int i, int i2) {
        if (mo2073a(i2)) {
            return true;
        }
        if (mo2070a()) {
            View view = this.f1428c;
            for (ViewParent parent = this.f1428c.getParent(); parent != null; parent = parent.getParent()) {
                if (C0601u.m2297a(parent, view, this.f1428c, i, i2)) {
                    m2200a(i2, parent);
                    C0601u.m2298b(parent, view, this.f1428c, i, i2);
                    return true;
                }
                if (parent instanceof View) {
                    view = (View) parent;
                }
            }
        }
        return false;
    }

    /* renamed from: c */
    public void mo2081c() {
        mo2082c(0);
    }

    /* renamed from: c */
    public void mo2082c(int i) {
        ViewParent d = m2201d(i);
        if (d != null) {
            C0601u.m2292a(d, this.f1428c, i);
            m2200a(i, (ViewParent) null);
        }
    }

    /* renamed from: a */
    public boolean mo2075a(int i, int i2, int i3, int i4, int[] iArr) {
        return mo2076a(i, i2, i3, i4, iArr, 0);
    }

    /* renamed from: a */
    public boolean mo2076a(int i, int i2, int i3, int i4, int[] iArr, int i5) {
        int i6;
        int i7;
        int[] iArr2 = iArr;
        if (mo2070a()) {
            int i8 = i5;
            ViewParent d = m2201d(i8);
            if (d == null) {
                return false;
            }
            if (i != 0 || i2 != 0 || i3 != 0 || i4 != 0) {
                if (iArr2 != null) {
                    this.f1428c.getLocationInWindow(iArr2);
                    i7 = iArr2[0];
                    i6 = iArr2[1];
                } else {
                    i7 = 0;
                    i6 = 0;
                }
                C0601u.m2293a(d, this.f1428c, i, i2, i3, i4, i8);
                if (iArr2 != null) {
                    this.f1428c.getLocationInWindow(iArr2);
                    iArr2[0] = iArr2[0] - i7;
                    iArr2[1] = iArr2[1] - i6;
                }
                return true;
            } else if (iArr2 != null) {
                iArr2[0] = 0;
                iArr2[1] = 0;
            }
        }
        return false;
    }

    /* renamed from: a */
    public boolean mo2077a(int i, int i2, int[] iArr, int[] iArr2) {
        return mo2078a(i, i2, iArr, iArr2, 0);
    }

    /* renamed from: a */
    public boolean mo2078a(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        int i4;
        int i5;
        if (mo2070a()) {
            ViewParent d = m2201d(i3);
            if (d == null) {
                return false;
            }
            boolean z = true;
            if (i != 0 || i2 != 0) {
                if (iArr2 != null) {
                    this.f1428c.getLocationInWindow(iArr2);
                    i5 = iArr2[0];
                    i4 = iArr2[1];
                } else {
                    i5 = 0;
                    i4 = 0;
                }
                if (iArr == null) {
                    if (this.f1430e == null) {
                        this.f1430e = new int[2];
                    }
                    iArr = this.f1430e;
                }
                iArr[0] = 0;
                iArr[1] = 0;
                C0601u.m2294a(d, this.f1428c, i, i2, iArr, i3);
                if (iArr2 != null) {
                    this.f1428c.getLocationInWindow(iArr2);
                    iArr2[0] = iArr2[0] - i5;
                    iArr2[1] = iArr2[1] - i4;
                }
                if (iArr[0] == 0 && iArr[1] == 0) {
                    z = false;
                }
                return z;
            } else if (iArr2 != null) {
                iArr2[0] = 0;
                iArr2[1] = 0;
            }
        }
        return false;
    }

    /* renamed from: a */
    public boolean mo2072a(float f, float f2, boolean z) {
        if (mo2070a()) {
            ViewParent d = m2201d(0);
            if (d != null) {
                return C0601u.m2296a(d, this.f1428c, f, f2, z);
            }
        }
        return false;
    }

    /* renamed from: a */
    public boolean mo2071a(float f, float f2) {
        if (mo2070a()) {
            ViewParent d = m2201d(0);
            if (d != null) {
                return C0601u.m2295a(d, this.f1428c, f, f2);
            }
        }
        return false;
    }

    /* renamed from: d */
    private ViewParent m2201d(int i) {
        switch (i) {
            case 0:
                return this.f1426a;
            case 1:
                return this.f1427b;
            default:
                return null;
        }
    }

    /* renamed from: a */
    private void m2200a(int i, ViewParent viewParent) {
        switch (i) {
            case 0:
                this.f1426a = viewParent;
                return;
            case 1:
                this.f1427b = viewParent;
                return;
            default:
                return;
        }
    }
}
