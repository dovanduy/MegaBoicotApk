package android.support.p017v4.view;

import android.os.Build.VERSION;
import android.view.WindowInsets;

/* renamed from: android.support.v4.view.z */
/* compiled from: WindowInsetsCompat */
public class C0609z {

    /* renamed from: a */
    private final Object f1461a;

    private C0609z(Object obj) {
        this.f1461a = obj;
    }

    /* renamed from: a */
    public int mo2135a() {
        if (VERSION.SDK_INT >= 20) {
            return ((WindowInsets) this.f1461a).getSystemWindowInsetLeft();
        }
        return 0;
    }

    /* renamed from: b */
    public int mo2137b() {
        if (VERSION.SDK_INT >= 20) {
            return ((WindowInsets) this.f1461a).getSystemWindowInsetTop();
        }
        return 0;
    }

    /* renamed from: c */
    public int mo2138c() {
        if (VERSION.SDK_INT >= 20) {
            return ((WindowInsets) this.f1461a).getSystemWindowInsetRight();
        }
        return 0;
    }

    /* renamed from: d */
    public int mo2139d() {
        if (VERSION.SDK_INT >= 20) {
            return ((WindowInsets) this.f1461a).getSystemWindowInsetBottom();
        }
        return 0;
    }

    /* renamed from: e */
    public boolean mo2140e() {
        if (VERSION.SDK_INT >= 21) {
            return ((WindowInsets) this.f1461a).isConsumed();
        }
        return false;
    }

    /* renamed from: a */
    public C0609z mo2136a(int i, int i2, int i3, int i4) {
        if (VERSION.SDK_INT >= 20) {
            return new C0609z(((WindowInsets) this.f1461a).replaceSystemWindowInsets(i, i2, i3, i4));
        }
        return null;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C0609z zVar = (C0609z) obj;
        if (this.f1461a != null) {
            z = this.f1461a.equals(zVar.f1461a);
        } else if (zVar.f1461a != null) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        if (this.f1461a == null) {
            return 0;
        }
        return this.f1461a.hashCode();
    }

    /* renamed from: a */
    static C0609z m2320a(Object obj) {
        if (obj == null) {
            return null;
        }
        return new C0609z(obj);
    }

    /* renamed from: a */
    static Object m2321a(C0609z zVar) {
        if (zVar == null) {
            return null;
        }
        return zVar.f1461a;
    }
}
