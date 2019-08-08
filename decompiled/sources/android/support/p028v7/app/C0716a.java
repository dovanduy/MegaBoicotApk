package android.support.p028v7.app;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnKeyListener;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.p028v7.app.AlertController.C0690a;
import android.support.p028v7.p029a.C0672a.C0673a;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ListAdapter;

/* renamed from: android.support.v7.app.a */
/* compiled from: AlertDialog */
public class C0716a extends C0720d implements DialogInterface {

    /* renamed from: a */
    final AlertController f1995a = new AlertController(getContext(), this, getWindow());

    /* renamed from: android.support.v7.app.a$a */
    /* compiled from: AlertDialog */
    public static class C0717a {

        /* renamed from: a */
        private final C0690a f1996a;

        /* renamed from: b */
        private final int f1997b;

        public C0717a(Context context) {
            this(context, C0716a.m2875a(context, 0));
        }

        public C0717a(Context context, int i) {
            this.f1996a = new C0690a(new ContextThemeWrapper(context, C0716a.m2875a(context, i)));
            this.f1997b = i;
        }

        /* renamed from: a */
        public Context mo2766a() {
            return this.f1996a.f1855a;
        }

        /* renamed from: a */
        public C0717a mo2771a(CharSequence charSequence) {
            this.f1996a.f1860f = charSequence;
            return this;
        }

        /* renamed from: a */
        public C0717a mo2769a(View view) {
            this.f1996a.f1861g = view;
            return this;
        }

        /* renamed from: a */
        public C0717a mo2768a(Drawable drawable) {
            this.f1996a.f1858d = drawable;
            return this;
        }

        /* renamed from: a */
        public C0717a mo2767a(OnKeyListener onKeyListener) {
            this.f1996a.f1875u = onKeyListener;
            return this;
        }

        /* renamed from: a */
        public C0717a mo2770a(ListAdapter listAdapter, OnClickListener onClickListener) {
            this.f1996a.f1877w = listAdapter;
            this.f1996a.f1878x = onClickListener;
            return this;
        }

        /* renamed from: b */
        public C0716a mo2772b() {
            C0716a aVar = new C0716a(this.f1996a.f1855a, this.f1997b);
            this.f1996a.mo2614a(aVar.f1995a);
            aVar.setCancelable(this.f1996a.f1872r);
            if (this.f1996a.f1872r) {
                aVar.setCanceledOnTouchOutside(true);
            }
            aVar.setOnCancelListener(this.f1996a.f1873s);
            aVar.setOnDismissListener(this.f1996a.f1874t);
            if (this.f1996a.f1875u != null) {
                aVar.setOnKeyListener(this.f1996a.f1875u);
            }
            return aVar;
        }
    }

    protected C0716a(Context context, int i) {
        super(context, m2875a(context, i));
    }

    /* renamed from: a */
    static int m2875a(Context context, int i) {
        if (((i >>> 24) & 255) >= 1) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(C0673a.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.f1995a.mo2600a(charSequence);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f1995a.mo2595a();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (this.f1995a.mo2601a(i, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (this.f1995a.mo2605b(i, keyEvent)) {
            return true;
        }
        return super.onKeyUp(i, keyEvent);
    }
}
