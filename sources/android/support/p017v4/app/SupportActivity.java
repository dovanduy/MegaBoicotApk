package android.support.p017v4.app;

import android.app.Activity;
import android.arch.lifecycle.C0097c;
import android.arch.lifecycle.C0097c.C0099b;
import android.arch.lifecycle.C0101e;
import android.arch.lifecycle.C0102f;
import android.arch.lifecycle.C0111m;
import android.os.Bundle;
import android.support.p017v4.p023d.C0398m;
import android.support.p017v4.view.C0580d;
import android.support.p017v4.view.C0580d.C0581a;
import android.view.KeyEvent;
import android.view.View;

/* renamed from: android.support.v4.app.SupportActivity */
/* compiled from: ComponentActivity */
public class SupportActivity extends Activity implements C0101e, C0581a {

    /* renamed from: a */
    private C0398m<Class<? extends Object>, Object> f478a = new C0398m<>();

    /* renamed from: b */
    private C0102f f479b = new C0102f(this);

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C0111m.m186a((Activity) this);
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        this.f479b.mo141a(C0099b.CREATED);
        super.onSaveInstanceState(bundle);
    }

    /* renamed from: a */
    public C0097c mo139a() {
        return this.f479b;
    }

    /* renamed from: a */
    public boolean mo786a(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !C0580d.m2186a(decorView, keyEvent)) {
            return super.dispatchKeyShortcutEvent(keyEvent);
        }
        return true;
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !C0580d.m2186a(decorView, keyEvent)) {
            return C0580d.m2185a(this, decorView, this, keyEvent);
        }
        return true;
    }
}
