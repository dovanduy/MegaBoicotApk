package android.support.p028v7.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;

/* renamed from: android.support.v7.widget.ax */
/* compiled from: TintResources */
class C0976ax extends C0955ak {

    /* renamed from: a */
    private final WeakReference<Context> f3225a;

    public C0976ax(Context context, Resources resources) {
        super(resources);
        this.f3225a = new WeakReference<>(context);
    }

    public Drawable getDrawable(int i) throws NotFoundException {
        Drawable drawable = super.getDrawable(i);
        Context context = (Context) this.f3225a.get();
        if (!(drawable == null || context == null)) {
            C1007g.m4568a();
            C1007g.m4574a(context, i, drawable);
        }
        return drawable;
    }
}
