package com.facebook.ads.internal.view;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup.LayoutParams;

/* renamed from: com.facebook.ads.internal.view.ab */
public class C1946ab extends View {

    /* renamed from: a */
    private C1945aa f6110a;

    public C1946ab(Context context, C1945aa aaVar) {
        super(context);
        this.f6110a = aaVar;
        setLayoutParams(new LayoutParams(0, 0));
    }

    public void onWindowVisibilityChanged(int i) {
        if (this.f6110a != null) {
            this.f6110a.mo7774a(i);
        }
    }
}
