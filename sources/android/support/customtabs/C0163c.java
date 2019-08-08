package android.support.customtabs;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.support.p017v4.app.C0248d;
import android.support.p017v4.content.C0356c;
import java.util.ArrayList;

/* renamed from: android.support.customtabs.c */
/* compiled from: CustomTabsIntent */
public final class C0163c {

    /* renamed from: a */
    public final Intent f234a;

    /* renamed from: b */
    public final Bundle f235b;

    /* renamed from: android.support.customtabs.c$a */
    /* compiled from: CustomTabsIntent */
    public static final class C0164a {

        /* renamed from: a */
        private final Intent f236a;

        /* renamed from: b */
        private ArrayList<Bundle> f237b;

        /* renamed from: c */
        private Bundle f238c;

        /* renamed from: d */
        private ArrayList<Bundle> f239d;

        /* renamed from: e */
        private boolean f240e;

        public C0164a() {
            this(null);
        }

        public C0164a(C0167e eVar) {
            this.f236a = new Intent("android.intent.action.VIEW");
            IBinder iBinder = null;
            this.f237b = null;
            this.f238c = null;
            this.f239d = null;
            this.f240e = true;
            if (eVar != null) {
                this.f236a.setPackage(eVar.mo356b().getPackageName());
            }
            Bundle bundle = new Bundle();
            String str = "android.support.customtabs.extra.SESSION";
            if (eVar != null) {
                iBinder = eVar.mo354a();
            }
            C0248d.m759a(bundle, str, iBinder);
            this.f236a.putExtras(bundle);
        }

        /* renamed from: a */
        public C0163c mo351a() {
            if (this.f237b != null) {
                this.f236a.putParcelableArrayListExtra("android.support.customtabs.extra.MENU_ITEMS", this.f237b);
            }
            if (this.f239d != null) {
                this.f236a.putParcelableArrayListExtra("android.support.customtabs.extra.TOOLBAR_ITEMS", this.f239d);
            }
            this.f236a.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", this.f240e);
            return new C0163c(this.f236a, this.f238c);
        }
    }

    /* renamed from: a */
    public void mo350a(Context context, Uri uri) {
        this.f234a.setData(uri);
        C0356c.m1314a(context, this.f234a, this.f235b);
    }

    C0163c(Intent intent, Bundle bundle) {
        this.f234a = intent;
        this.f235b = bundle;
    }
}
