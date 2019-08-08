package android.support.p028v7.widget;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.os.Build.VERSION;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* renamed from: android.support.v7.widget.av */
/* compiled from: TintContextWrapper */
public class C0974av extends ContextWrapper {

    /* renamed from: a */
    private static final Object f3217a = new Object();

    /* renamed from: b */
    private static ArrayList<WeakReference<C0974av>> f3218b;

    /* renamed from: c */
    private final Resources f3219c;

    /* renamed from: d */
    private final Theme f3220d;

    /* renamed from: a */
    public static Context m4362a(Context context) {
        if (!m4363b(context)) {
            return context;
        }
        synchronized (f3217a) {
            if (f3218b == null) {
                f3218b = new ArrayList<>();
            } else {
                for (int size = f3218b.size() - 1; size >= 0; size--) {
                    WeakReference weakReference = (WeakReference) f3218b.get(size);
                    if (weakReference == null || weakReference.get() == null) {
                        f3218b.remove(size);
                    }
                }
                for (int size2 = f3218b.size() - 1; size2 >= 0; size2--) {
                    WeakReference weakReference2 = (WeakReference) f3218b.get(size2);
                    C0974av avVar = weakReference2 != null ? (C0974av) weakReference2.get() : null;
                    if (avVar != null && avVar.getBaseContext() == context) {
                        return avVar;
                    }
                }
            }
            C0974av avVar2 = new C0974av(context);
            f3218b.add(new WeakReference(avVar2));
            return avVar2;
        }
    }

    /* renamed from: b */
    private static boolean m4363b(Context context) {
        boolean z = false;
        if ((context instanceof C0974av) || (context.getResources() instanceof C0976ax) || (context.getResources() instanceof C0987bd)) {
            return false;
        }
        if (VERSION.SDK_INT < 21 || C0987bd.m4446a()) {
            z = true;
        }
        return z;
    }

    private C0974av(Context context) {
        super(context);
        if (C0987bd.m4446a()) {
            this.f3219c = new C0987bd(this, context.getResources());
            this.f3220d = this.f3219c.newTheme();
            this.f3220d.setTo(context.getTheme());
            return;
        }
        this.f3219c = new C0976ax(this, context.getResources());
        this.f3220d = null;
    }

    public Theme getTheme() {
        return this.f3220d == null ? super.getTheme() : this.f3220d;
    }

    public void setTheme(int i) {
        if (this.f3220d == null) {
            super.setTheme(i);
        } else {
            this.f3220d.applyStyle(i, true);
        }
    }

    public Resources getResources() {
        return this.f3219c;
    }

    public AssetManager getAssets() {
        return this.f3219c.getAssets();
    }
}
