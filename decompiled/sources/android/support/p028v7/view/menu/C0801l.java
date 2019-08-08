package android.support.p028v7.view.menu;

import android.content.Context;
import android.support.p017v4.p018a.p019a.C0206b;
import android.support.p017v4.view.C0572b.C0574b;
import android.view.ActionProvider;
import android.view.ActionProvider.VisibilityListener;
import android.view.MenuItem;
import android.view.View;

/* renamed from: android.support.v7.view.menu.l */
/* compiled from: MenuItemWrapperJB */
class C0801l extends C0796k {

    /* renamed from: android.support.v7.view.menu.l$a */
    /* compiled from: MenuItemWrapperJB */
    class C0802a extends C0797a implements VisibilityListener {

        /* renamed from: c */
        C0574b f2414c;

        public C0802a(Context context, ActionProvider actionProvider) {
            super(context, actionProvider);
        }

        /* renamed from: a */
        public View mo2054a(MenuItem menuItem) {
            return this.f2409a.onCreateActionView(menuItem);
        }

        /* renamed from: b */
        public boolean mo2059b() {
            return this.f2409a.overridesItemVisibility();
        }

        /* renamed from: c */
        public boolean mo2060c() {
            return this.f2409a.isVisible();
        }

        /* renamed from: a */
        public void mo2056a(C0574b bVar) {
            this.f2414c = bVar;
            this.f2409a.setVisibilityListener(bVar != null ? this : null);
        }

        public void onActionProviderVisibilityChanged(boolean z) {
            if (this.f2414c != null) {
                this.f2414c.mo2065a(z);
            }
        }
    }

    C0801l(Context context, C0206b bVar) {
        super(context, bVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C0797a mo3294a(ActionProvider actionProvider) {
        return new C0802a(this.f2287a, actionProvider);
    }
}
