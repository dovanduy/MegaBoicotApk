package com.facebook.ads.internal.view.p110i.p113c;

import android.content.Context;
import android.graphics.PorterDuff.Mode;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.ProgressBar;
import android.widget.RelativeLayout.LayoutParams;
import com.facebook.ads.internal.p088o.C1779f;
import com.facebook.ads.internal.view.p110i.p111a.C2118c;
import com.facebook.ads.internal.view.p110i.p112b.C2145m;

/* renamed from: com.facebook.ads.internal.view.i.c.k */
public class C2211k extends C2118c {

    /* renamed from: a */
    private final C1779f<C2145m> f6953a;

    public C2211k(Context context) {
        this(context, null);
    }

    public C2211k(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C2211k(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f6953a = new C1779f<C2145m>() {
            /* renamed from: a */
            public Class<C2145m> mo7260a() {
                return C2145m.class;
            }

            /* renamed from: a */
            public void mo6895a(C2145m mVar) {
                C2211k.this.setVisibility(8);
            }
        };
        int applyDimension = (int) TypedValue.applyDimension(1, 40.0f, getResources().getDisplayMetrics());
        ProgressBar progressBar = new ProgressBar(getContext());
        progressBar.setIndeterminate(true);
        progressBar.getIndeterminateDrawable().setColorFilter(-1, Mode.SRC_IN);
        LayoutParams layoutParams = new LayoutParams(applyDimension, applyDimension);
        layoutParams.addRule(13);
        addView(progressBar, layoutParams);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo8425a() {
        super.mo8425a();
        setVisibility(0);
        if (getVideoView() != null) {
            getVideoView().getEventBus().mo7627a(this.f6953a);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo8426b() {
        if (getVideoView() != null) {
            getVideoView().getEventBus().mo7629b(this.f6953a);
        }
        setVisibility(8);
        super.mo8426b();
    }
}
