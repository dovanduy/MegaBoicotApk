package com.facebook.ads.internal.view.p105e.p106a;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import android.widget.RelativeLayout.LayoutParams;
import com.facebook.ads.internal.p088o.C1779f;
import com.facebook.ads.internal.p092s.C1802c;
import com.facebook.ads.internal.p115w.p117b.C2342x;
import com.facebook.ads.internal.view.C2296y;
import com.facebook.ads.internal.view.p110i.C2110a;
import com.facebook.ads.internal.view.p110i.C2119b;
import com.facebook.ads.internal.view.p110i.p111a.C2116a;
import com.facebook.ads.internal.view.p110i.p111a.C2117b;
import com.facebook.ads.internal.view.p110i.p113c.C2172b;
import com.facebook.ads.internal.view.p110i.p113c.C2180d;
import com.facebook.ads.internal.view.p110i.p113c.C2180d.C2188a;
import com.facebook.ads.internal.view.p110i.p113c.C2191f;
import com.facebook.ads.internal.view.p110i.p113c.C2194g;
import com.facebook.ads.internal.view.p110i.p113c.C2213l;
import java.util.Map;

/* renamed from: com.facebook.ads.internal.view.e.a.d */
public class C2048d extends FrameLayout {

    /* renamed from: a */
    private static final int f6491a = ((int) (16.0f * C2342x.f7369b));

    /* renamed from: b */
    private final C1802c f6492b;

    /* renamed from: c */
    private C2296y f6493c;

    /* renamed from: d */
    private C2191f f6494d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C2213l f6495e;

    /* renamed from: f */
    private C2194g f6496f;

    /* renamed from: g */
    private C2119b f6497g;

    public C2048d(Context context, C1802c cVar) {
        super(context);
        this.f6492b = cVar;
        setUpView(context);
    }

    private void setUpPlugins(Context context) {
        this.f6493c.mo8385d();
        this.f6496f = new C2194g(context);
        this.f6493c.mo8381a((C2117b) this.f6496f);
        this.f6494d = new C2191f(context);
        this.f6493c.mo8381a((C2117b) new C2172b(context));
        this.f6493c.mo8381a((C2117b) this.f6494d);
        this.f6495e = new C2213l(context, true);
        this.f6493c.mo8381a((C2117b) this.f6495e);
        this.f6493c.mo8381a((C2117b) new C2180d(this.f6495e, C2188a.FADE_OUT_ON_PLAY, true, true));
        LayoutParams layoutParams = new LayoutParams(-2, -2);
        layoutParams.addRule(10);
        layoutParams.addRule(11);
        layoutParams.setMargins(f6491a, f6491a, f6491a, f6491a);
        this.f6494d.setLayoutParams(layoutParams);
        this.f6493c.addView(this.f6494d);
    }

    private void setUpVideo(Context context) {
        this.f6493c = new C2296y(context);
        this.f6493c.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        C2342x.m9081a((View) this.f6493c);
        addView(this.f6493c);
        setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                C2048d.this.f6495e.performClick();
            }
        });
    }

    private void setUpView(Context context) {
        setUpVideo(context);
        setUpPlugins(context);
    }

    /* renamed from: a */
    public void mo8275a() {
        this.f6493c.mo8383a(true);
    }

    /* renamed from: a */
    public void mo8276a(C1779f fVar) {
        this.f6493c.getEventBus().mo7627a(fVar);
    }

    /* renamed from: a */
    public void mo8277a(C1802c cVar, String str, Map<String, String> map) {
        mo8280c();
        C2119b bVar = new C2119b(getContext(), cVar, (C2110a) this.f6493c, str, map);
        this.f6497g = bVar;
    }

    /* renamed from: a */
    public void mo8278a(C2116a aVar) {
        this.f6493c.mo8380a(aVar);
    }

    /* renamed from: b */
    public boolean mo8279b() {
        return this.f6493c.mo8405j();
    }

    /* renamed from: c */
    public void mo8280c() {
        if (this.f6497g != null) {
            this.f6497g.mo8428a();
            this.f6497g = null;
        }
    }

    public C2110a getSimpleVideoView() {
        return this.f6493c;
    }

    public float getVolume() {
        return this.f6493c.getVolume();
    }

    public void setPlaceholderUrl(String str) {
        this.f6496f.setImage(str);
    }

    public void setVideoURI(String str) {
        this.f6493c.setVideoURI(str);
    }

    public void setVolume(float f) {
        this.f6493c.setVolume(f);
        this.f6494d.mo8495a();
    }
}
