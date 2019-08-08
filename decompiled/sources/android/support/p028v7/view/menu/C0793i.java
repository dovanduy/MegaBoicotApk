package android.support.p028v7.view.menu;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnDismissListener;
import android.content.DialogInterface.OnKeyListener;
import android.os.IBinder;
import android.support.p028v7.app.C0716a;
import android.support.p028v7.app.C0716a.C0717a;
import android.support.p028v7.p029a.C0672a.C0679g;
import android.support.p028v7.view.menu.C0806o.C0807a;
import android.view.KeyEvent;
import android.view.KeyEvent.DispatcherState;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager.LayoutParams;

/* renamed from: android.support.v7.view.menu.i */
/* compiled from: MenuDialogHelper */
class C0793i implements OnClickListener, OnDismissListener, OnKeyListener, C0807a {

    /* renamed from: a */
    C0787f f2372a;

    /* renamed from: b */
    private C0790h f2373b;

    /* renamed from: c */
    private C0716a f2374c;

    /* renamed from: d */
    private C0807a f2375d;

    public C0793i(C0790h hVar) {
        this.f2373b = hVar;
    }

    /* renamed from: a */
    public void mo3230a(IBinder iBinder) {
        C0790h hVar = this.f2373b;
        C0717a aVar = new C0717a(hVar.mo3201f());
        this.f2372a = new C0787f(aVar.mo2766a(), C0679g.abc_list_menu_item_layout);
        this.f2372a.mo3099a((C0807a) this);
        this.f2373b.mo3166a((C0806o) this.f2372a);
        aVar.mo2770a(this.f2372a.mo3137a(), this);
        View p = hVar.mo3215p();
        if (p != null) {
            aVar.mo2769a(p);
        } else {
            aVar.mo2768a(hVar.mo3214o()).mo2771a(hVar.mo3213n());
        }
        aVar.mo2767a((OnKeyListener) this);
        this.f2374c = aVar.mo2772b();
        this.f2374c.setOnDismissListener(this);
        LayoutParams attributes = this.f2374c.getWindow().getAttributes();
        attributes.type = 1003;
        if (iBinder != null) {
            attributes.token = iBinder;
        }
        attributes.flags |= 131072;
        this.f2374c.show();
    }

    public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        if (i == 82 || i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window = this.f2374c.getWindow();
                if (window != null) {
                    View decorView = window.getDecorView();
                    if (decorView != null) {
                        DispatcherState keyDispatcherState = decorView.getKeyDispatcherState();
                        if (keyDispatcherState != null) {
                            keyDispatcherState.startTracking(keyEvent, this);
                            return true;
                        }
                    }
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled()) {
                Window window2 = this.f2374c.getWindow();
                if (window2 != null) {
                    View decorView2 = window2.getDecorView();
                    if (decorView2 != null) {
                        DispatcherState keyDispatcherState2 = decorView2.getKeyDispatcherState();
                        if (keyDispatcherState2 != null && keyDispatcherState2.isTracking(keyEvent)) {
                            this.f2373b.mo3170a(true);
                            dialogInterface.dismiss();
                            return true;
                        }
                    }
                }
            }
        }
        return this.f2373b.performShortcut(i, keyEvent, 0);
    }

    /* renamed from: a */
    public void mo3229a() {
        if (this.f2374c != null) {
            this.f2374c.dismiss();
        }
    }

    public void onDismiss(DialogInterface dialogInterface) {
        this.f2372a.mo3097a(this.f2373b, true);
    }

    /* renamed from: a */
    public void mo2721a(C0790h hVar, boolean z) {
        if (z || hVar == this.f2373b) {
            mo3229a();
        }
        if (this.f2375d != null) {
            this.f2375d.mo2721a(hVar, z);
        }
    }

    /* renamed from: a */
    public boolean mo2722a(C0790h hVar) {
        if (this.f2375d != null) {
            return this.f2375d.mo2722a(hVar);
        }
        return false;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.f2373b.mo3172a((MenuItem) (C0794j) this.f2372a.mo3137a().getItem(i), 0);
    }
}
