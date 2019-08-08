package com.facebook.ads.internal.view.p108g;

import android.content.Context;
import android.net.Uri;
import android.support.p028v7.widget.LinearLayoutManager;
import android.support.p028v7.widget.RecyclerView;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.facebook.ads.AudienceNetworkActivity;
import com.facebook.ads.internal.adapters.p072b.C1597h;
import com.facebook.ads.internal.adapters.p072b.C1605n;
import com.facebook.ads.internal.adapters.p072b.C1606o;
import com.facebook.ads.internal.adapters.p072b.C1608q;
import com.facebook.ads.internal.p070a.C1563b;
import com.facebook.ads.internal.p070a.C1564c;
import com.facebook.ads.internal.p088o.C1776c;
import com.facebook.ads.internal.p092s.C1802c;
import com.facebook.ads.internal.p115w.p117b.C2328p;
import com.facebook.ads.internal.p115w.p117b.C2341w;
import com.facebook.ads.internal.p115w.p117b.C2342x;
import com.facebook.ads.internal.p115w.p120e.C2355b;
import com.facebook.ads.internal.p115w.p120e.C2358e;
import com.facebook.ads.internal.p115w.p120e.C2358e.C2359a;
import com.facebook.ads.internal.p115w.p120e.C2360f;
import com.facebook.ads.internal.p125x.C2376a;
import com.facebook.ads.internal.view.C1910a.C1911a;
import com.facebook.ads.internal.view.component.C1983a;
import com.facebook.ads.internal.view.component.C2026f;
import com.facebook.ads.internal.view.component.C2030j;
import com.facebook.ads.internal.view.p101c.C1967a;
import com.facebook.ads.internal.view.p101c.C1967a.C1970b;
import com.facebook.ads.internal.view.p101c.C1967a.C1971c;
import com.facebook.ads.internal.view.p101c.C1980d;
import com.facebook.ads.internal.view.p107f.C2069b;
import com.facebook.ads.internal.view.p107f.C2069b.C2076c;
import com.facebook.ads.internal.view.p110i.p112b.C2133aa;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: com.facebook.ads.internal.view.g.c */
public class C2082c {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final String f6649a = "c";

    /* renamed from: b */
    private static final int f6650b = ((int) (4.0f * C2342x.f7369b));

    /* renamed from: c */
    private static final int f6651c = ((int) (72.0f * C2342x.f7369b));

    /* renamed from: d */
    private static final int f6652d = ((int) (8.0f * C2342x.f7369b));

    /* renamed from: e */
    private C1983a f6653e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final Context f6654f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C1802c f6655g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final C1608q f6656h;

    /* renamed from: i */
    private final String f6657i;

    /* renamed from: j */
    private final C1597h f6658j;

    /* renamed from: k */
    private final C2376a f6659k;

    /* renamed from: l */
    private final C2341w f6660l;

    /* renamed from: m */
    private Executor f6661m = C2328p.f7322a;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public C1911a f6662n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public C1967a f6663o;

    /* renamed from: p */
    private C1970b f6664p;

    /* renamed from: com.facebook.ads.internal.view.g.c$a */
    public enum C2087a {
        SCREENSHOTS,
        MARKUP,
        PLAYABLE,
        INFO
    }

    /* renamed from: com.facebook.ads.internal.view.g.c$b */
    private static class C2088b implements C2076c {

        /* renamed from: a */
        final WeakReference<C2082c> f6674a;

        private C2088b(C2082c cVar) {
            this.f6674a = new WeakReference<>(cVar);
        }

        /* renamed from: a */
        public void mo8316a() {
        }

        /* renamed from: a */
        public void mo8317a(C2376a aVar, C2341w wVar) {
        }

        /* renamed from: a */
        public void mo8318a(boolean z) {
            if (this.f6674a.get() != null) {
                ((C2082c) this.f6674a.get()).m8463g().performClick();
            }
        }

        /* renamed from: b */
        public void mo8319b() {
        }

        /* renamed from: c */
        public void mo8320c() {
            if (this.f6674a.get() != null) {
                C2082c.m8456a((C2082c) this.f6674a.get());
            }
        }

        /* renamed from: d */
        public void mo8321d() {
            mo8320c();
        }
    }

    public C2082c(Context context, C1802c cVar, C1608q qVar, C1911a aVar, C2376a aVar2, C2341w wVar) {
        this.f6654f = context;
        this.f6655g = cVar;
        this.f6656h = qVar;
        this.f6662n = aVar;
        this.f6657i = C1776c.m7367a(this.f6656h.mo7236k().mo7182b());
        this.f6658j = this.f6656h.mo7234i().mo7120a();
        this.f6659k = aVar2;
        this.f6660l = wVar;
    }

    /* renamed from: a */
    static /* synthetic */ void m8456a(C2082c cVar) {
        if (cVar.f6662n != null) {
            cVar.f6662n.mo6795a(C2133aa.REWARDED_VIDEO_END_ACTIVITY.mo8442a());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public C1983a m8463g() {
        if (this.f6653e != null) {
            return this.f6653e;
        }
        C1983a aVar = new C1983a(this.f6654f, true, false, C2133aa.REWARDED_VIDEO_AD_CLICK.mo8442a(), this.f6658j, this.f6655g, this.f6662n, this.f6659k, this.f6660l);
        this.f6653e = aVar;
        this.f6653e.mo8130a(this.f6656h.mo7233h(), this.f6656h.mo7113a(), new HashMap());
        return this.f6653e;
    }

    /* renamed from: a */
    public boolean mo8341a() {
        return mo8342b() == C2087a.MARKUP;
    }

    /* renamed from: b */
    public C2087a mo8342b() {
        C1605n j = this.f6656h.mo7235j().mo7136j();
        return (j == null || !j.mo7218i()) ? !this.f6656h.mo7236k().mo7184d().isEmpty() ? C2087a.SCREENSHOTS : !TextUtils.isEmpty(this.f6657i) ? C2087a.MARKUP : C2087a.INFO : C2087a.PLAYABLE;
    }

    /* renamed from: c */
    public Pair<C2087a, View> mo8343c() {
        C2087a b = mo8342b();
        switch (b) {
            case MARKUP:
                this.f6664p = new C1971c() {
                    /* renamed from: a */
                    public void mo7248a() {
                        if (C2082c.this.f6663o != null && !TextUtils.isEmpty(C2082c.this.f6656h.mo7236k().mo7183c())) {
                            C2082c.this.f6663o.post(new Runnable() {
                                public void run() {
                                    if (C2082c.this.f6663o == null || C2082c.this.f6663o.mo8759c()) {
                                        Log.w(C2082c.f6649a, "Webview already destroyed, cannot activate");
                                        return;
                                    }
                                    C1967a f = C2082c.this.f6663o;
                                    StringBuilder sb = new StringBuilder();
                                    sb.append("javascript:");
                                    sb.append(C2082c.this.f6656h.mo7236k().mo7183c());
                                    f.loadUrl(sb.toString());
                                }
                            });
                        }
                    }

                    /* renamed from: a */
                    public void mo7249a(String str, Map<String, String> map) {
                        Uri parse = Uri.parse(str);
                        if (!"fbad".equals(parse.getScheme()) || !parse.getAuthority().equals("close")) {
                            if ("fbad".equals(parse.getScheme()) && C1564c.m6495a(parse.getAuthority()) && C2082c.this.f6662n != null) {
                                C2082c.this.f6662n.mo6795a(C2133aa.REWARDED_VIDEO_AD_CLICK.mo8442a());
                            }
                            C1563b a = C1564c.m6493a(C2082c.this.f6654f, C2082c.this.f6655g, C2082c.this.f6656h.mo7113a(), parse, map);
                            if (a != null) {
                                try {
                                    a.mo7058a();
                                    return;
                                } catch (Exception e) {
                                    Log.e(C2082c.f6649a, "Error executing action", e);
                                }
                            }
                            return;
                        }
                        C2082c.m8456a(C2082c.this);
                    }
                };
                this.f6663o = new C1967a(this.f6654f, new WeakReference(this.f6664p), 1);
                this.f6663o.loadDataWithBaseURL(C2355b.m9113a(), this.f6657i, AudienceNetworkActivity.WEBVIEW_MIME_TYPE, AudienceNetworkActivity.WEBVIEW_ENCODING, null);
                return new Pair<>(b, this.f6663o);
            case SCREENSHOTS:
                RecyclerView recyclerView = new RecyclerView(this.f6654f);
                recyclerView.setLayoutManager(new LinearLayoutManager(this.f6654f, 0, false));
                recyclerView.setAdapter(new C2089d(this.f6656h.mo7236k().mo7184d(), f6650b));
                return new Pair<>(b, recyclerView);
            case PLAYABLE:
                C2069b bVar = new C2069b(this.f6654f, C1606o.m6700a(this.f6656h), this.f6655g, this.f6662n, new C2088b(), false, false);
                return new Pair<>(b, bVar);
            default:
                C2030j jVar = new C2030j(this.f6654f, this.f6658j, true, false, false);
                jVar.mo8234a(this.f6656h.mo7232g().mo7147a(), this.f6656h.mo7232g().mo7149c(), null, false, true);
                jVar.setAlignment(17);
                C1983a g = m8463g();
                C2026f fVar = new C2026f(this.f6654f);
                C2342x.m9082a((View) fVar, 0);
                fVar.setRadius(50);
                new C1980d((ImageView) fVar).mo8114a().mo8118a(this.f6656h.mo7231f().mo7201b());
                LinearLayout linearLayout = new LinearLayout(this.f6654f);
                linearLayout.setOrientation(1);
                linearLayout.setGravity(17);
                linearLayout.addView(fVar, new LayoutParams(f6651c, f6651c));
                LayoutParams layoutParams = new LayoutParams(-2, -2);
                layoutParams.setMargins(0, f6652d, 0, f6652d);
                linearLayout.addView(jVar, layoutParams);
                linearLayout.addView(g, layoutParams);
                return new Pair<>(b, linearLayout);
        }
    }

    /* renamed from: d */
    public void mo8344d() {
        String a = this.f6656h.mo7236k().mo7180a();
        if (!TextUtils.isEmpty(a)) {
            C2358e eVar = new C2358e(this.f6654f, new HashMap());
            eVar.mo8761a((C2359a) new C2359a() {
                /* renamed from: a */
                public void mo8347a() {
                    if (C2082c.this.f6662n != null) {
                        C2082c.this.f6662n.mo6795a(C2133aa.REWARD_SERVER_FAILED.mo8442a());
                    }
                }

                /* renamed from: a */
                public void mo8348a(C2360f fVar) {
                    C1911a aVar;
                    C2133aa aaVar;
                    if (C2082c.this.f6662n != null) {
                        if (fVar == null || !fVar.mo8766a()) {
                            aVar = C2082c.this.f6662n;
                            aaVar = C2133aa.REWARD_SERVER_FAILED;
                        } else {
                            aVar = C2082c.this.f6662n;
                            aaVar = C2133aa.REWARD_SERVER_SUCCESS;
                        }
                        aVar.mo6795a(aaVar.mo8442a());
                    }
                }
            });
            eVar.executeOnExecutor(this.f6661m, new String[]{a});
        }
    }

    /* renamed from: e */
    public void mo8345e() {
        if (this.f6663o != null) {
            this.f6663o.destroy();
            this.f6663o = null;
            this.f6664p = null;
        }
    }
}
