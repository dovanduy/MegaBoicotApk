package android.support.p017v4.view.p026a;

import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.ArrayList;
import java.util.List;

/* renamed from: android.support.v4.view.a.c */
/* compiled from: AccessibilityNodeProviderCompat */
public class C0568c {

    /* renamed from: a */
    private final Object f1409a;

    /* renamed from: android.support.v4.view.a.c$a */
    /* compiled from: AccessibilityNodeProviderCompat */
    static class C0569a extends AccessibilityNodeProvider {

        /* renamed from: a */
        final C0568c f1410a;

        C0569a(C0568c cVar) {
            this.f1410a = cVar;
        }

        public AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
            C0564b a = this.f1410a.mo2042a(i);
            if (a == null) {
                return null;
            }
            return a.mo1993a();
        }

        public List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String str, int i) {
            List a = this.f1410a.mo2044a(str, i);
            if (a == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            int size = a.size();
            for (int i2 = 0; i2 < size; i2++) {
                arrayList.add(((C0564b) a.get(i2)).mo1993a());
            }
            return arrayList;
        }

        public boolean performAction(int i, int i2, Bundle bundle) {
            return this.f1410a.mo2045a(i, i2, bundle);
        }
    }

    /* renamed from: android.support.v4.view.a.c$b */
    /* compiled from: AccessibilityNodeProviderCompat */
    static class C0570b extends C0569a {
        C0570b(C0568c cVar) {
            super(cVar);
        }

        public AccessibilityNodeInfo findFocus(int i) {
            C0564b b = this.f1410a.mo2046b(i);
            if (b == null) {
                return null;
            }
            return b.mo1993a();
        }
    }

    /* renamed from: a */
    public C0564b mo2042a(int i) {
        return null;
    }

    /* renamed from: a */
    public List<C0564b> mo2044a(String str, int i) {
        return null;
    }

    /* renamed from: a */
    public boolean mo2045a(int i, int i2, Bundle bundle) {
        return false;
    }

    /* renamed from: b */
    public C0564b mo2046b(int i) {
        return null;
    }

    public C0568c() {
        if (VERSION.SDK_INT >= 19) {
            this.f1409a = new C0570b(this);
        } else if (VERSION.SDK_INT >= 16) {
            this.f1409a = new C0569a(this);
        } else {
            this.f1409a = null;
        }
    }

    public C0568c(Object obj) {
        this.f1409a = obj;
    }

    /* renamed from: a */
    public Object mo2043a() {
        return this.f1409a;
    }
}
