package com.google.android.gms.common.images;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.google.android.gms.common.internal.C3468c;
import com.google.android.gms.internal.p145b.C4414e;

/* renamed from: com.google.android.gms.common.images.a */
public abstract class C3421a {

    /* renamed from: a */
    final C3422b f9910a;

    /* renamed from: b */
    protected int f9911b;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo13447a(Drawable drawable, boolean z, boolean z2, boolean z3);

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo13445a(Context context, Bitmap bitmap, boolean z) {
        C3468c.m12393a((Object) bitmap);
        mo13447a(new BitmapDrawable(context.getResources(), bitmap), z, false, true);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo13446a(Context context, C4414e eVar, boolean z) {
        Drawable drawable;
        if (this.f9911b != 0) {
            drawable = context.getResources().getDrawable(this.f9911b);
        } else {
            drawable = null;
        }
        mo13447a(drawable, z, false, false);
    }
}
