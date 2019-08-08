package com.facebook.ads.internal.view.component;

import android.content.Context;
import android.support.p017v4.graphics.C0401a;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.ads.internal.p115w.p117b.C2342x;

/* renamed from: com.facebook.ads.internal.view.component.i */
public class C2029i extends LinearLayout {

    /* renamed from: a */
    private static final int f6406a = ((int) (16.0f * C2342x.f7369b));

    /* renamed from: b */
    private static final int f6407b = ((int) (14.0f * C2342x.f7369b));

    /* renamed from: c */
    private static final int f6408c = C0401a.m1505b(-1, 77);

    /* renamed from: d */
    private final CircularProgressView f6409d;

    /* renamed from: e */
    private final TextView f6410e;

    public C2029i(Context context) {
        super(context);
        setOrientation(0);
        setGravity(16);
        this.f6409d = new CircularProgressView(context);
        this.f6409d.setPadding(f6406a, f6406a, f6406a, f6406a);
        this.f6409d.setProgress(0.0f);
        mo8230a(f6408c, -1);
        this.f6410e = new TextView(context);
        mo8231a(false, -1, f6407b);
        addView(this.f6409d);
        addView(this.f6410e);
    }

    /* renamed from: a */
    public void mo8230a(int i, int i2) {
        this.f6409d.mo8124a(i, i2);
    }

    /* renamed from: a */
    public void mo8231a(boolean z, int i, int i2) {
        C2342x.m9089a(this.f6410e, z, i2);
        this.f6410e.setTextColor(i);
    }

    public void setProgress(int i) {
        this.f6409d.setProgressWithAnimation((float) i);
    }

    public void setText(String str) {
        this.f6410e.setText(str);
    }
}
