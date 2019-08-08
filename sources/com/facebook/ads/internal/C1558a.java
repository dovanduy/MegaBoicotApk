package com.facebook.ads.internal;

import android.content.Context;
import android.os.Handler;
import com.facebook.ads.AdSettings;
import com.facebook.ads.AdSize;
import com.facebook.ads.NativeAd;
import com.facebook.ads.internal.adapters.AdAdapter;
import com.facebook.ads.internal.adapters.C1616d;
import com.facebook.ads.internal.adapters.C1637i;
import com.facebook.ads.internal.adapters.C1653q;
import com.facebook.ads.internal.p086m.C1762a;
import com.facebook.ads.internal.p086m.C1764c;
import com.facebook.ads.internal.p087n.C1767a;
import com.facebook.ads.internal.p087n.C1771d;
import com.facebook.ads.internal.p091r.C1795a;
import com.facebook.ads.internal.p092s.C1802c;
import com.facebook.ads.internal.p092s.C1803d;
import com.facebook.ads.internal.p094u.C1842b;
import com.facebook.ads.internal.p094u.C1843c;
import com.facebook.ads.internal.p094u.C1843c.C1848b;
import com.facebook.ads.internal.p094u.C1853f;
import com.facebook.ads.internal.p115w.p117b.C2308c;
import com.facebook.ads.internal.p115w.p117b.C2325m;
import com.facebook.ads.internal.p115w.p117b.C2330q;
import com.facebook.ads.internal.p115w.p117b.C2344y;
import com.facebook.ads.internal.p115w.p124i.C2374a;
import com.facebook.ads.internal.protocol.AdErrorType;
import com.facebook.ads.internal.protocol.AdPlacementType;
import com.facebook.ads.internal.protocol.C1782a;
import com.facebook.ads.internal.protocol.C1783b;
import com.facebook.ads.internal.protocol.C1787e;
import com.facebook.ads.internal.protocol.C1789g;
import com.google.android.exoplayer2.DefaultRenderersFactory;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.facebook.ads.internal.a */
public class C1558a implements C1848b {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Context f4785a;

    /* renamed from: b */
    private final String f4786b;

    /* renamed from: c */
    private final C1843c f4787c = new C1843c(this.f4785a);

    /* renamed from: d */
    private final C1616d f4788d;

    /* renamed from: e */
    private final C1787e f4789e;

    /* renamed from: f */
    private final AdSize f4790f;

    /* renamed from: g */
    private final int f4791g;

    /* renamed from: h */
    private boolean f4792h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final Handler f4793i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final Runnable f4794j;

    /* renamed from: k */
    private final C1802c f4795k;

    /* renamed from: l */
    private C1560a f4796l;

    /* renamed from: m */
    private C1764c f4797m;

    /* renamed from: n */
    private String f4798n;

    /* renamed from: com.facebook.ads.internal.a$a */
    public interface C1560a {
        /* renamed from: a */
        void mo7014a(C1782a aVar);

        /* renamed from: a */
        void mo7015a(List<C1637i> list);
    }

    /* renamed from: com.facebook.ads.internal.a$b */
    private static final class C1561b extends C2344y<C1558a> {
        public C1561b(C1558a aVar) {
            super(aVar);
        }

        public void run() {
            C1558a aVar = (C1558a) mo8745a();
            if (aVar != null) {
                if (C2374a.m9153a(aVar.f4785a)) {
                    aVar.mo7046a();
                } else {
                    aVar.f4793i.postDelayed(aVar.f4794j, DefaultRenderersFactory.DEFAULT_ALLOWED_VIDEO_JOINING_TIME_MS);
                }
            }
        }
    }

    static {
        C2308c.m9019a();
    }

    public C1558a(Context context, String str, C1787e eVar, AdSize adSize, int i) {
        this.f4785a = context;
        this.f4786b = str;
        this.f4789e = eVar;
        this.f4790f = adSize;
        this.f4791g = i;
        this.f4787c.mo7821a((C1848b) this);
        this.f4788d = new C1616d();
        this.f4792h = true;
        this.f4793i = new Handler();
        this.f4794j = new C1561b(this);
        this.f4795k = C1803d.m7531a(this.f4785a);
        C1767a.m7338b(this.f4785a);
    }

    /* renamed from: d */
    private List<C1637i> m6476d() {
        C1764c cVar = this.f4797m;
        final ArrayList arrayList = new ArrayList(cVar.mo7600d());
        for (C1762a e = cVar.mo7601e(); e != null; e = cVar.mo7601e()) {
            AdAdapter a = this.f4788d.mo7246a(AdPlacementType.NATIVE);
            if (a != null && a.getPlacementType() == AdPlacementType.NATIVE) {
                HashMap hashMap = new HashMap();
                hashMap.put("data", e.mo7593c());
                hashMap.put("definition", cVar.mo7596a());
                final C1637i iVar = (C1637i) a;
                iVar.mo7283a(this.f4785a, new C1653q() {
                    /* renamed from: a */
                    public void mo7053a(C1637i iVar) {
                        arrayList.add(iVar);
                    }

                    /* renamed from: a */
                    public void mo7054a(C1637i iVar, C1782a aVar) {
                    }

                    /* renamed from: b */
                    public void mo7055b(C1637i iVar) {
                    }

                    /* renamed from: c */
                    public void mo7056c(C1637i iVar) {
                    }
                }, this.f4795k, hashMap, NativeAd.getViewTraversalPredicate());
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public void mo7046a() {
        try {
            C1789g gVar = new C1789g(this.f4785a, null, null, null);
            C1842b bVar = new C1842b(this.f4785a, new C1771d(this.f4785a, false), this.f4786b, this.f4790f != null ? new C2325m(this.f4790f.getHeight(), this.f4790f.getWidth()) : null, this.f4789e, null, this.f4791g, AdSettings.isTestMode(this.f4785a), AdSettings.isChildDirected(), gVar, C2330q.m9055a(C1795a.m7413G(this.f4785a)), this.f4798n);
            this.f4787c.mo7819a(bVar);
        } catch (C1783b e) {
            mo7048a(C1782a.m7382a(e));
        }
    }

    /* renamed from: a */
    public void mo7047a(C1560a aVar) {
        this.f4796l = aVar;
    }

    /* renamed from: a */
    public void mo7048a(C1782a aVar) {
        if (this.f4792h) {
            this.f4793i.postDelayed(this.f4794j, 1800000);
        }
        if (this.f4796l != null) {
            this.f4796l.mo7014a(aVar);
        }
    }

    /* renamed from: a */
    public void mo7049a(C1853f fVar) {
        C1764c a = fVar.mo7829a();
        if (a == null) {
            throw new IllegalStateException("no placement in response");
        }
        if (this.f4792h) {
            long c = a.mo7596a().mo7607c();
            if (c == 0) {
                c = 1800000;
            }
            this.f4793i.postDelayed(this.f4794j, c);
        }
        this.f4797m = a;
        List d = m6476d();
        if (this.f4796l != null) {
            if (d.isEmpty()) {
                this.f4796l.mo7014a(C1782a.m7381a(AdErrorType.NO_FILL, ""));
                return;
            }
            this.f4796l.mo7015a(d);
        }
    }

    /* renamed from: a */
    public void mo7050a(String str) {
        this.f4798n = str;
    }

    /* renamed from: b */
    public void mo7051b() {
    }

    /* renamed from: c */
    public void mo7052c() {
        this.f4792h = false;
        this.f4793i.removeCallbacks(this.f4794j);
    }
}
