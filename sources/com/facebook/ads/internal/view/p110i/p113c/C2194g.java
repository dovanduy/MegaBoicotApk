package com.facebook.ads.internal.view.p110i.p113c;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.RelativeLayout.LayoutParams;
import com.facebook.ads.internal.p088o.C1779f;
import com.facebook.ads.internal.p115w.p117b.C2342x;
import com.facebook.ads.internal.view.p101c.C1980d;
import com.facebook.ads.internal.view.p101c.C1981e;
import com.facebook.ads.internal.view.p110i.p111a.C2118c;
import com.facebook.ads.internal.view.p110i.p112b.C2135c;
import com.facebook.ads.internal.view.p110i.p112b.C2143k;

/* renamed from: com.facebook.ads.internal.view.i.c.g */
public class C2194g extends C2118c {

    /* renamed from: a */
    private final ImageView f6909a;

    /* renamed from: b */
    private final C1779f<C2143k> f6910b = new C1779f<C2143k>() {
        /* renamed from: a */
        public Class<C2143k> mo7260a() {
            return C2143k.class;
        }

        /* renamed from: a */
        public void mo6895a(C2143k kVar) {
            C2194g.this.setVisibility(8);
        }
    };

    /* renamed from: c */
    private final C1779f<C2135c> f6911c = new C1779f<C2135c>() {
        /* renamed from: a */
        public Class<C2135c> mo7260a() {
            return C2135c.class;
        }

        /* renamed from: a */
        public void mo6895a(C2135c cVar) {
            C2194g.this.setVisibility(0);
        }
    };

    public C2194g(Context context) {
        super(context);
        this.f6909a = new ImageView(context);
        this.f6909a.setScaleType(ScaleType.FIT_CENTER);
        C2342x.m9082a((View) this.f6909a, -16777216);
        this.f6909a.setLayoutParams(new LayoutParams(-1, -1));
        addView(this.f6909a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo8425a() {
        super.mo8425a();
        if (getVideoView() != null) {
            getVideoView().getEventBus().mo7626a((T[]) new C1779f[]{this.f6910b, this.f6911c});
        }
    }

    /* renamed from: a */
    public void mo8499a(String str, C1981e eVar) {
        if (str == null) {
            setVisibility(8);
            return;
        }
        setVisibility(0);
        C1980d a = new C1980d(this.f6909a).mo8114a();
        if (eVar != null) {
            a.mo8116a(eVar);
        }
        a.mo8118a(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo8426b() {
        if (getVideoView() != null) {
            getVideoView().getEventBus().mo7628b((T[]) new C1779f[]{this.f6911c, this.f6910b});
        }
        super.mo8426b();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.f6909a.layout(0, 0, i3 - i, i4 - i2);
    }

    public void setImage(String str) {
        mo8499a(str, null);
    }
}
