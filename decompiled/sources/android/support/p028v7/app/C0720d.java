package android.support.p028v7.app;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.support.p017v4.view.C0580d;
import android.support.p017v4.view.C0580d.C0581a;
import android.support.p028v7.p029a.C0672a.C0673a;
import android.support.p028v7.view.C0762b;
import android.support.p028v7.view.C0762b.C0763a;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup.LayoutParams;

/* renamed from: android.support.v7.app.d */
/* compiled from: AppCompatDialog */
public class C0720d extends Dialog implements C0718b {

    /* renamed from: a */
    private C0719c f1999a;

    /* renamed from: b */
    private final C0581a f2000b = new C0581a() {
        /* renamed from: a */
        public boolean mo786a(KeyEvent keyEvent) {
            return C0720d.this.mo2775a(keyEvent);
        }
    };

    /* renamed from: a */
    public C0762b mo2624a(C0763a aVar) {
        return null;
    }

    /* renamed from: a */
    public void mo2626a(C0762b bVar) {
    }

    /* renamed from: b */
    public void mo2631b(C0762b bVar) {
    }

    public C0720d(Context context, int i) {
        super(context, m2909a(context, i));
        mo2773a().mo2659a((Bundle) null);
        mo2773a().mo2691i();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        mo2773a().mo2689h();
        super.onCreate(bundle);
        mo2773a().mo2659a(bundle);
    }

    public void setContentView(int i) {
        mo2773a().mo2671b(i);
    }

    public void setContentView(View view) {
        mo2773a().mo2662a(view);
    }

    public void setContentView(View view, LayoutParams layoutParams) {
        mo2773a().mo2663a(view, layoutParams);
    }

    public <T extends View> T findViewById(int i) {
        return mo2773a().mo2655a(i);
    }

    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        mo2773a().mo2665a(charSequence);
    }

    public void setTitle(int i) {
        super.setTitle(i);
        mo2773a().mo2665a((CharSequence) getContext().getString(i));
    }

    public void addContentView(View view, LayoutParams layoutParams) {
        mo2773a().mo2674b(view, layoutParams);
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        mo2773a().mo2680d();
    }

    /* renamed from: a */
    public boolean mo2774a(int i) {
        return mo2773a().mo2678c(i);
    }

    public void invalidateOptionsMenu() {
        mo2773a().mo2684f();
    }

    /* renamed from: a */
    public C0719c mo2773a() {
        if (this.f1999a == null) {
            this.f1999a = C0719c.m2887a((Dialog) this, (C0718b) this);
        }
        return this.f1999a;
    }

    /* renamed from: a */
    private static int m2909a(Context context, int i) {
        if (i != 0) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(C0673a.dialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo2775a(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return C0580d.m2185a(this.f2000b, getWindow().getDecorView(), this, keyEvent);
    }
}
