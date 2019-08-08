package android.support.p017v4.view.p026a;

import android.os.Build.VERSION;
import android.view.accessibility.AccessibilityRecord;

/* renamed from: android.support.v4.view.a.d */
/* compiled from: AccessibilityRecordCompat */
public class C0571d {

    /* renamed from: a */
    private final AccessibilityRecord f1411a;

    /* renamed from: a */
    public static void m2164a(AccessibilityRecord accessibilityRecord, int i) {
        if (VERSION.SDK_INT >= 15) {
            accessibilityRecord.setMaxScrollX(i);
        }
    }

    /* renamed from: b */
    public static void m2165b(AccessibilityRecord accessibilityRecord, int i) {
        if (VERSION.SDK_INT >= 15) {
            accessibilityRecord.setMaxScrollY(i);
        }
    }

    @Deprecated
    public int hashCode() {
        if (this.f1411a == null) {
            return 0;
        }
        return this.f1411a.hashCode();
    }

    @Deprecated
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C0571d dVar = (C0571d) obj;
        if (this.f1411a == null) {
            if (dVar.f1411a != null) {
                return false;
            }
        } else if (!this.f1411a.equals(dVar.f1411a)) {
            return false;
        }
        return true;
    }
}
