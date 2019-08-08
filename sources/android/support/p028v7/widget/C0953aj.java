package android.support.p028v7.widget;

import android.os.Bundle;
import android.support.p017v4.view.C0561a;
import android.support.p017v4.view.p026a.C0564b;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;

/* renamed from: android.support.v7.widget.aj */
/* compiled from: RecyclerViewAccessibilityDelegate */
public class C0953aj extends C0561a {

    /* renamed from: a */
    final RecyclerView f3119a;

    /* renamed from: b */
    final C0561a f3120b = new C0954a(this);

    /* renamed from: android.support.v7.widget.aj$a */
    /* compiled from: RecyclerViewAccessibilityDelegate */
    public static class C0954a extends C0561a {

        /* renamed from: a */
        final C0953aj f3121a;

        public C0954a(C0953aj ajVar) {
            this.f3121a = ajVar;
        }

        /* renamed from: a */
        public void mo1969a(View view, C0564b bVar) {
            super.mo1969a(view, bVar);
            if (!this.f3121a.mo4933b() && this.f3121a.f3119a.getLayoutManager() != null) {
                this.f3121a.f3119a.getLayoutManager().onInitializeAccessibilityNodeInfoForItem(view, bVar);
            }
        }

        /* renamed from: a */
        public boolean mo1970a(View view, int i, Bundle bundle) {
            if (super.mo1970a(view, i, bundle)) {
                return true;
            }
            if (this.f3121a.mo4933b() || this.f3121a.f3119a.getLayoutManager() == null) {
                return false;
            }
            return this.f3121a.f3119a.getLayoutManager().performAccessibilityActionForItem(view, i, bundle);
        }
    }

    public C0953aj(RecyclerView recyclerView) {
        this.f3119a = recyclerView;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public boolean mo4933b() {
        return this.f3119a.hasPendingAdapterUpdates();
    }

    /* renamed from: a */
    public boolean mo1970a(View view, int i, Bundle bundle) {
        if (super.mo1970a(view, i, bundle)) {
            return true;
        }
        if (mo4933b() || this.f3119a.getLayoutManager() == null) {
            return false;
        }
        return this.f3119a.getLayoutManager().performAccessibilityAction(i, bundle);
    }

    /* renamed from: a */
    public void mo1969a(View view, C0564b bVar) {
        super.mo1969a(view, bVar);
        bVar.mo2005b((CharSequence) RecyclerView.class.getName());
        if (!mo4933b() && this.f3119a.getLayoutManager() != null) {
            this.f3119a.getLayoutManager().onInitializeAccessibilityNodeInfo(bVar);
        }
    }

    /* renamed from: d */
    public void mo1971d(View view, AccessibilityEvent accessibilityEvent) {
        super.mo1971d(view, accessibilityEvent);
        accessibilityEvent.setClassName(RecyclerView.class.getName());
        if ((view instanceof RecyclerView) && !mo4933b()) {
            RecyclerView recyclerView = (RecyclerView) view;
            if (recyclerView.getLayoutManager() != null) {
                recyclerView.getLayoutManager().onInitializeAccessibilityEvent(accessibilityEvent);
            }
        }
    }

    /* renamed from: c */
    public C0561a mo4934c() {
        return this.f3120b;
    }
}
