package com.facebook.ads.internal.view.p110i.p111a;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import com.facebook.ads.internal.view.p110i.C2110a;

/* renamed from: com.facebook.ads.internal.view.i.a.c */
public abstract class C2118c extends RelativeLayout implements C2117b {

    /* renamed from: a */
    private C2110a f6770a;

    public C2118c(Context context) {
        super(context);
    }

    public C2118c(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setLayoutParams(new LayoutParams(-1, -1));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo8425a() {
    }

    /* renamed from: a */
    public void mo8356a(C2110a aVar) {
        this.f6770a = aVar;
        mo8425a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo8426b() {
    }

    /* renamed from: b */
    public void mo8360b(C2110a aVar) {
        mo8426b();
        this.f6770a = null;
    }

    /* access modifiers changed from: protected */
    public C2110a getVideoView() {
        return this.f6770a;
    }
}
