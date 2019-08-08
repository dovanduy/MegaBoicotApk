package android.support.p017v4.view;

import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.p017v4.view.p026a.C0564b;
import android.support.p017v4.view.p026a.C0568c;
import android.view.View;
import android.view.View.AccessibilityDelegate;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;

/* renamed from: android.support.v4.view.a */
/* compiled from: AccessibilityDelegateCompat */
public class C0561a {

    /* renamed from: a */
    private static final AccessibilityDelegate f1368a = new AccessibilityDelegate();

    /* renamed from: b */
    private final AccessibilityDelegate f1369b = new C0562a(this);

    /* renamed from: android.support.v4.view.a$a */
    /* compiled from: AccessibilityDelegateCompat */
    private static final class C0562a extends AccessibilityDelegate {

        /* renamed from: a */
        private final C0561a f1370a;

        C0562a(C0561a aVar) {
            this.f1370a = aVar;
        }

        public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            return this.f1370a.mo1982b(view, accessibilityEvent);
        }

        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f1370a.mo1971d(view, accessibilityEvent);
        }

        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            this.f1370a.mo1969a(view, C0564b.m2109a(accessibilityNodeInfo));
        }

        public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f1370a.mo1983c(view, accessibilityEvent);
        }

        public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            return this.f1370a.mo1981a(viewGroup, view, accessibilityEvent);
        }

        public void sendAccessibilityEvent(View view, int i) {
            this.f1370a.mo1979a(view, i);
        }

        public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
            this.f1370a.mo1980a(view, accessibilityEvent);
        }

        public AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
            C0568c a = this.f1370a.mo1977a(view);
            if (a != null) {
                return (AccessibilityNodeProvider) a.mo2043a();
            }
            return null;
        }

        public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            return this.f1370a.mo1970a(view, i, bundle);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public AccessibilityDelegate mo1978a() {
        return this.f1369b;
    }

    /* renamed from: a */
    public void mo1979a(View view, int i) {
        f1368a.sendAccessibilityEvent(view, i);
    }

    /* renamed from: a */
    public void mo1980a(View view, AccessibilityEvent accessibilityEvent) {
        f1368a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    /* renamed from: b */
    public boolean mo1982b(View view, AccessibilityEvent accessibilityEvent) {
        return f1368a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: c */
    public void mo1983c(View view, AccessibilityEvent accessibilityEvent) {
        f1368a.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: d */
    public void mo1971d(View view, AccessibilityEvent accessibilityEvent) {
        f1368a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: a */
    public void mo1969a(View view, C0564b bVar) {
        f1368a.onInitializeAccessibilityNodeInfo(view, bVar.mo1993a());
    }

    /* renamed from: a */
    public boolean mo1981a(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return f1368a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    /* renamed from: a */
    public C0568c mo1977a(View view) {
        if (VERSION.SDK_INT >= 16) {
            AccessibilityNodeProvider accessibilityNodeProvider = f1368a.getAccessibilityNodeProvider(view);
            if (accessibilityNodeProvider != null) {
                return new C0568c(accessibilityNodeProvider);
            }
        }
        return null;
    }

    /* renamed from: a */
    public boolean mo1970a(View view, int i, Bundle bundle) {
        if (VERSION.SDK_INT >= 16) {
            return f1368a.performAccessibilityAction(view, i, bundle);
        }
        return false;
    }
}
