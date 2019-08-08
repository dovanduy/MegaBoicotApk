package com.facebook.ads.internal.view;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build.VERSION;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import com.facebook.ads.AudienceNetworkActivity;
import com.facebook.ads.internal.adapters.p072b.C1586b;
import com.facebook.ads.internal.adapters.p072b.C1597h;
import com.facebook.ads.internal.adapters.p072b.C1600k;
import com.facebook.ads.internal.adapters.p072b.C1601l;
import com.facebook.ads.internal.p079f.C1710a;
import com.facebook.ads.internal.p092s.C1802c;
import com.facebook.ads.internal.p115w.p117b.C2333t;
import com.facebook.ads.internal.p115w.p117b.C2333t.C2336a;
import com.facebook.ads.internal.p115w.p117b.C2342x;
import com.facebook.ads.internal.view.C1910a.C1911a;
import com.facebook.ads.internal.view.C2098i.C2108a;
import com.facebook.ads.internal.view.C2098i.C2109b;
import com.facebook.ads.internal.view.C2289u.C2291a;
import com.facebook.ads.internal.view.component.p102a.C2004c;
import com.facebook.ads.internal.view.component.p102a.C2018l;
import java.util.Map;

/* renamed from: com.facebook.ads.internal.view.o */
public abstract class C2264o extends RelativeLayout implements C1910a {
    /* access modifiers changed from: protected */

    /* renamed from: a */
    public final C1802c f7123a;

    /* renamed from: b */
    protected final C2098i f7124b = new C2098i(getContext(), getAudienceNetworkListener(), C2108a.CROSS);

    /* renamed from: c */
    protected C1586b f7125c;

    /* renamed from: d */
    private final C1911a f7126d;

    /* renamed from: e */
    private final C2333t f7127e = new C2333t(this);

    /* renamed from: f */
    private String f7128f;

    protected C2264o(Context context, C1802c cVar, C1911a aVar) {
        super(context.getApplicationContext());
        this.f7123a = cVar;
        this.f7126d = aVar;
    }

    /* renamed from: a */
    private void mo8287a() {
        removeAllViews();
        C2342x.m9091b(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo8643a(View view, boolean z, int i) {
        this.f7127e.mo8733a(C2336a.DEFAULT);
        mo8287a();
        LayoutParams layoutParams = new LayoutParams(-1, -1);
        layoutParams.setMargins(0, z ? 0 : C2098i.f6694a, 0, 0);
        addView(view, layoutParams);
        C1597h a = i == 1 ? this.f7125c.mo7120a() : this.f7125c.mo7121b();
        LayoutParams layoutParams2 = new LayoutParams(-1, C2098i.f6694a);
        layoutParams2.addRule(10);
        this.f7124b.mo8353a(a, z);
        addView(this.f7124b, layoutParams2);
        C2342x.m9082a((View) this, a.mo7174d(z));
        if (this.f7126d != null) {
            this.f7126d.mo6794a((View) this, 0);
            if (z && VERSION.SDK_INT >= 19) {
                this.f7127e.mo8733a(C2336a.FULL_SCREEN);
            }
        }
    }

    /* renamed from: a */
    public void mo8644a(final AudienceNetworkActivity audienceNetworkActivity, C1600k kVar) {
        this.f7127e.mo8732a(audienceNetworkActivity.getWindow());
        this.f7125c = kVar.mo7188b();
        this.f7128f = kVar.mo7195i();
        this.f7124b.mo8355a(kVar.mo7185a(), kVar.mo7189c(), ((C1601l) kVar.mo7190d().get(0)).mo7198c().mo7129c());
        this.f7124b.setToolbarListener(new C2109b() {
            /* renamed from: a */
            public void mo8207a() {
                audienceNetworkActivity.finish();
            }
        });
        if (C1710a.m7130a(getContext(), true)) {
            this.f7124b.mo8354a(kVar.mo7185a(), kVar.mo7189c());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo8645a(C2004c cVar, C2018l lVar, C2291a aVar, int i, int i2, boolean z, int i3) {
        mo8643a(cVar, z, i3);
        if (lVar != null) {
            this.f7124b.setPageDetailsVisibility(4);
            this.f7127e.mo8733a(C2336a.DEFAULT);
            if (i3 == 1) {
                C2289u uVar = new C2289u(getContext(), lVar, i - C2098i.f6694a, 0);
                addView(uVar);
                if (aVar != null) {
                    uVar.setDragListener(aVar);
                }
            } else {
                LayoutParams layoutParams = new LayoutParams(i2, -1);
                LayoutParams layoutParams2 = new LayoutParams(C2342x.f7368a.widthPixels - i2, C2098i.f6694a);
                layoutParams2.addRule(10);
                this.f7124b.setLayoutParams(layoutParams2);
                layoutParams.addRule(11);
                cVar.addView(lVar, layoutParams);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo8646a(Map<String, String> map) {
        if (this.f7128f != null) {
            map.put("extra_hints", this.f7128f);
        }
    }

    /* access modifiers changed from: protected */
    public C1802c getAdEventManager() {
        return this.f7123a;
    }

    /* access modifiers changed from: protected */
    public C1911a getAudienceNetworkListener() {
        return this.f7126d;
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        this.f7124b.mo8363d();
        super.onConfigurationChanged(configuration);
        final ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        viewTreeObserver.addOnGlobalLayoutListener(new OnGlobalLayoutListener() {
            public void onGlobalLayout() {
                C2264o.this.f7124b.mo8364e();
                if (VERSION.SDK_INT < 16) {
                    viewTreeObserver.removeGlobalOnLayoutListener(this);
                } else {
                    viewTreeObserver.removeOnGlobalLayoutListener(this);
                }
            }
        });
    }

    public void onDestroy() {
        this.f7127e.mo8731a();
        this.f7124b.setToolbarListener(null);
        mo8287a();
    }

    public void setListener(C1911a aVar) {
    }
}
