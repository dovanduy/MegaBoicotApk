package android.support.p028v7.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import java.lang.ref.WeakReference;

/* renamed from: android.support.v7.widget.bd */
/* compiled from: VectorEnabledTintResources */
public class C0987bd extends Resources {

    /* renamed from: a */
    private static boolean f3272a = false;

    /* renamed from: b */
    private final WeakReference<Context> f3273b;

    /* renamed from: a */
    public static boolean m4446a() {
        return m4447b() && VERSION.SDK_INT <= 20;
    }

    public C0987bd(Context context, Resources resources) {
        super(resources.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
        this.f3273b = new WeakReference<>(context);
    }

    public Drawable getDrawable(int i) throws NotFoundException {
        Context context = (Context) this.f3273b.get();
        if (context != null) {
            return C1007g.m4568a().mo5240a(context, this, i);
        }
        return super.getDrawable(i);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final Drawable mo5156a(int i) {
        return super.getDrawable(i);
    }

    /* renamed from: b */
    public static boolean m4447b() {
        return f3272a;
    }
}
