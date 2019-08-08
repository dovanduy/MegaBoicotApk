package com.facebook.ads.internal.view.component.p102a.p103a;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Path.Direction;
import android.graphics.RectF;
import android.os.Build.VERSION;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import com.facebook.ads.internal.adapters.p072b.C1597h;
import com.facebook.ads.internal.adapters.p072b.C1598i;
import com.facebook.ads.internal.p088o.C1779f;
import com.facebook.ads.internal.p115w.p117b.C2342x;
import com.facebook.ads.internal.view.C2295x;
import com.facebook.ads.internal.view.component.p102a.C2004c;
import com.facebook.ads.internal.view.component.p102a.C2006e;
import com.facebook.ads.internal.view.p101c.C1980d;
import com.facebook.ads.internal.view.p101c.C1981e;
import com.facebook.ads.internal.view.p105e.p106a.C2041a;
import com.facebook.ads.internal.view.p105e.p106a.C2048d;
import com.facebook.ads.internal.view.p110i.p111a.C2116a;
import com.facebook.ads.internal.view.p110i.p112b.C2135c;
import com.facebook.ads.internal.view.p110i.p112b.C2136d;
import com.facebook.ads.internal.view.p110i.p112b.C2141i;
import com.facebook.ads.internal.view.p110i.p112b.C2142j;
import com.facebook.ads.internal.view.p110i.p112b.C2143k;
import com.facebook.ads.internal.view.p110i.p112b.C2144l;
import com.facebook.ads.internal.view.p110i.p112b.C2145m;
import com.facebook.ads.internal.view.p110i.p112b.C2146n;
import com.facebook.ads.internal.view.p110i.p112b.C2155w;
import com.facebook.ads.internal.view.p110i.p112b.C2156x;
import java.lang.ref.WeakReference;
import java.util.Map;

/* renamed from: com.facebook.ads.internal.view.component.a.a.b */
public abstract class C1990b extends C2004c {

    /* renamed from: c */
    private static final int f6283c = ((int) (1.0f * C2342x.f7369b));

    /* renamed from: d */
    private static final int f6284d = ((int) (4.0f * C2342x.f7369b));

    /* renamed from: e */
    private static final int f6285e = ((int) (6.0f * C2342x.f7369b));

    /* renamed from: f */
    private C2295x f6286f;

    /* renamed from: g */
    private C2048d f6287g;

    /* renamed from: h */
    private RelativeLayout f6288h;

    /* renamed from: i */
    private final String f6289i;

    /* renamed from: j */
    private final Paint f6290j;

    /* renamed from: k */
    private boolean f6291k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public C2041a f6292l;

    /* renamed from: m */
    private final Path f6293m = new Path();

    /* renamed from: n */
    private final RectF f6294n = new RectF();
    /* access modifiers changed from: private */

    /* renamed from: o */
    public boolean f6295o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public boolean f6296p;

    /* renamed from: q */
    private C1996a f6297q;

    /* renamed from: r */
    private final C2156x f6298r = new C2156x() {
        /* renamed from: a */
        public void mo6895a(C2155w wVar) {
            C1990b.this.f6292l.mo8266c().mo8171a(C1990b.this.getVideoView().getVolume());
        }
    };

    /* renamed from: s */
    private final C2136d f6299s = new C2136d() {
        /* renamed from: a */
        public void mo6895a(C2135c cVar) {
            C1990b.this.f6292l.mo8267d().mo8167a(((Integer) C1990b.this.getTag(-1593835536)).intValue());
        }
    };

    /* renamed from: t */
    private final C2144l f6300t = new C2144l() {
        /* renamed from: a */
        public void mo6895a(C2143k kVar) {
            C1990b.this.f6292l.mo8268e().mo8168a(C1990b.this);
        }
    };

    /* renamed from: u */
    private final C2142j f6301u = new C2142j() {
        /* renamed from: a */
        public void mo6895a(C2141i iVar) {
            C1990b.this.f6292l.mo8268e().mo8169b(C1990b.this);
        }
    };

    /* renamed from: v */
    private final C2146n f6302v = new C2146n() {
        /* renamed from: a */
        public void mo6895a(C2145m mVar) {
            C1990b.this.f6296p = true;
            C1990b.m8182b(C1990b.this);
        }
    };

    /* renamed from: com.facebook.ads.internal.view.component.a.a.b$a */
    public interface C1996a {
        /* renamed from: a */
        void mo8166a();
    }

    /* renamed from: com.facebook.ads.internal.view.component.a.a.b$b */
    private static class C1997b implements C1981e {

        /* renamed from: a */
        final WeakReference<C1990b> f6308a;

        private C1997b(C1990b bVar) {
            this.f6308a = new WeakReference<>(bVar);
        }

        /* renamed from: a */
        public void mo6849a(boolean z) {
            C1990b bVar = (C1990b) this.f6308a.get();
            if (bVar != null) {
                bVar.f6295o = z;
                C1990b.m8182b(bVar);
            }
        }
    }

    /* renamed from: com.facebook.ads.internal.view.component.a.a.b$c */
    public interface C1998c {
        /* renamed from: a */
        void mo8167a(int i);
    }

    /* renamed from: com.facebook.ads.internal.view.component.a.a.b$d */
    public interface C1999d {
        /* renamed from: a */
        void mo8168a(View view);

        /* renamed from: b */
        void mo8169b(View view);
    }

    /* renamed from: com.facebook.ads.internal.view.component.a.a.b$e */
    public interface C2000e {
        /* renamed from: a */
        float mo8170a();

        /* renamed from: a */
        void mo8171a(float f);
    }

    C1990b(C2006e eVar, C1597h hVar, boolean z, String str, C2041a aVar) {
        super(eVar, hVar, z);
        this.f6292l = aVar;
        this.f6289i = str;
        setGravity(17);
        setPadding(f6283c, 0, f6283c, f6283c);
        C2342x.m9082a((View) this, 0);
        setUpView(getContext());
        this.f6290j = new Paint();
        this.f6290j.setColor(-16777216);
        this.f6290j.setStyle(Style.FILL);
        this.f6290j.setAlpha(16);
        this.f6290j.setAntiAlias(true);
        if (VERSION.SDK_INT < 18) {
            setLayerType(1, null);
        }
    }

    /* renamed from: a */
    private void m8180a(View view) {
        view.setLayoutParams(new LayoutParams(-1, -2));
        C2342x.m9081a(view);
    }

    /* renamed from: b */
    static /* synthetic */ void m8182b(C1990b bVar) {
        if (bVar.f6297q != null) {
            if ((bVar.mo8145f() && bVar.f6296p) || (!bVar.mo8145f() && bVar.f6295o)) {
                bVar.f6297q.mo8166a();
            }
        }
    }

    private void setUpView(Context context) {
        setUpImageView(context);
        setUpVideoView(context);
        setUpMediaContainer(context);
        this.f6288h.addView(this.f6286f);
        this.f6288h.addView(this.f6287g);
        mo8138a(context);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo8138a(Context context);

    /* renamed from: a */
    public void mo8141a(C1598i iVar, Map<String, String> map) {
        getCtaButton().mo8130a(iVar, this.f6289i, map);
    }

    /* renamed from: a */
    public void mo8142a(String str, String str2) {
        getTitleDescContainer().mo8234a(str, str2, null, true, false);
    }

    /* renamed from: a */
    public void mo8143a(Map<String, String> map) {
        this.f6287g.mo8280c();
        if (mo8145f()) {
            this.f6287g.mo8277a(getAdEventManager(), this.f6289i, map);
        }
    }

    /* renamed from: a */
    public boolean mo8144a() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public boolean mo8140e() {
        return false;
    }

    /* renamed from: f */
    public boolean mo8145f() {
        return this.f6291k;
    }

    /* renamed from: g */
    public boolean mo8146g() {
        return mo8145f() && this.f6287g.mo8279b();
    }

    /* access modifiers changed from: protected */
    public final RelativeLayout getMediaContainer() {
        return this.f6288h;
    }

    public final C2048d getVideoView() {
        return this.f6287g;
    }

    /* renamed from: h */
    public void mo8149h() {
        if (mo8145f()) {
            mo8151j();
            this.f6287g.mo8278a(C2116a.AUTO_STARTED);
        }
    }

    /* renamed from: i */
    public void mo8150i() {
        if (mo8145f()) {
            this.f6287g.mo8275a();
        }
    }

    /* renamed from: j */
    public void mo8151j() {
        float a = this.f6292l.mo8266c().mo8170a();
        if (mo8145f() && a != this.f6287g.getVolume()) {
            this.f6287g.setVolume(a);
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        this.f6293m.reset();
        this.f6294n.set(0.0f, 0.0f, (float) getWidth(), (float) getHeight());
        this.f6293m.addRoundRect(this.f6294n, (float) f6285e, (float) f6285e, Direction.CW);
        canvas.drawPath(this.f6293m, this.f6290j);
        this.f6294n.set((float) f6283c, 0.0f, (float) (getWidth() - f6283c), (float) (getHeight() - f6283c));
        this.f6293m.addRoundRect(this.f6294n, (float) f6284d, (float) f6284d, Direction.CW);
        canvas.clipPath(this.f6293m);
        super.onDraw(canvas);
    }

    public void setImageUrl(String str) {
        this.f6286f.setVisibility(0);
        this.f6287g.setVisibility(8);
        new C1980d((ImageView) this.f6286f).mo8114a().mo8116a((C1981e) new C1997b()).mo8118a(str);
    }

    public void setIsVideo(boolean z) {
        this.f6291k = z;
    }

    public void setOnAssetsLoadedListener(C1996a aVar) {
        this.f6297q = aVar;
    }

    /* access modifiers changed from: protected */
    public void setUpImageView(Context context) {
        this.f6286f = new C2295x(context);
        m8180a((View) this.f6286f);
    }

    /* access modifiers changed from: protected */
    public void setUpMediaContainer(Context context) {
        this.f6288h = new RelativeLayout(context);
        m8180a((View) this.f6288h);
    }

    /* access modifiers changed from: protected */
    public void setUpVideoView(Context context) {
        this.f6287g = new C2048d(context, getAdEventManager());
        m8180a((View) this.f6287g);
    }

    public void setVideoPlaceholderUrl(String str) {
        this.f6287g.setPlaceholderUrl(str);
    }

    public void setVideoUrl(String str) {
        this.f6286f.setVisibility(8);
        this.f6287g.setVisibility(0);
        this.f6287g.setVideoURI(str);
        this.f6287g.mo8276a((C1779f) this.f6298r);
        this.f6287g.mo8276a((C1779f) this.f6299s);
        this.f6287g.mo8276a((C1779f) this.f6300t);
        this.f6287g.mo8276a((C1779f) this.f6301u);
        this.f6287g.mo8276a((C1779f) this.f6302v);
    }
}
