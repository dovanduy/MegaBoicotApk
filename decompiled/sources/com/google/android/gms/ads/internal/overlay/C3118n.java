package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageButton;
import com.google.android.gms.internal.ads.C3718cm;
import com.google.android.gms.internal.ads.C3975lz;
import com.google.android.gms.internal.ads.aoq;
import javax.annotation.Nullable;

@C3718cm
/* renamed from: com.google.android.gms.ads.internal.overlay.n */
public final class C3118n extends FrameLayout implements OnClickListener {

    /* renamed from: a */
    private final ImageButton f9111a;

    /* renamed from: b */
    private final C3126v f9112b;

    public C3118n(Context context, C3119o oVar, @Nullable C3126v vVar) {
        super(context);
        this.f9112b = vVar;
        setOnClickListener(this);
        this.f9111a = new ImageButton(context);
        this.f9111a.setImageResource(17301527);
        this.f9111a.setBackgroundColor(0);
        this.f9111a.setOnClickListener(this);
        ImageButton imageButton = this.f9111a;
        aoq.m14615a();
        int a = C3975lz.m17369a(context, oVar.f9113a);
        aoq.m14615a();
        int a2 = C3975lz.m17369a(context, 0);
        aoq.m14615a();
        int a3 = C3975lz.m17369a(context, oVar.f9114b);
        aoq.m14615a();
        imageButton.setPadding(a, a2, a3, C3975lz.m17369a(context, oVar.f9116d));
        this.f9111a.setContentDescription("Interstitial close button");
        aoq.m14615a();
        C3975lz.m17369a(context, oVar.f9117e);
        ImageButton imageButton2 = this.f9111a;
        aoq.m14615a();
        int a4 = C3975lz.m17369a(context, oVar.f9117e + oVar.f9113a + oVar.f9114b);
        aoq.m14615a();
        addView(imageButton2, new LayoutParams(a4, C3975lz.m17369a(context, oVar.f9117e + oVar.f9116d), 17));
    }

    /* renamed from: a */
    public final void mo12692a(boolean z) {
        ImageButton imageButton;
        int i;
        if (z) {
            imageButton = this.f9111a;
            i = 8;
        } else {
            imageButton = this.f9111a;
            i = 0;
        }
        imageButton.setVisibility(i);
    }

    public final void onClick(View view) {
        if (this.f9112b != null) {
            this.f9112b.mo12669c();
        }
    }
}
