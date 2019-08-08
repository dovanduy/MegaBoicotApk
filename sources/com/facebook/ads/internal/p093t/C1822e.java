package com.facebook.ads.internal.p093t;

import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.facebook.ads.NativeAdLayout;
import com.facebook.ads.internal.adapters.AdAdapter;
import com.facebook.ads.internal.adapters.C1577a;
import com.facebook.ads.internal.adapters.C1609c;
import com.facebook.ads.internal.adapters.C1637i;
import com.facebook.ads.internal.adapters.C1650p;
import com.facebook.ads.internal.adapters.C1650p.C1651a;
import com.facebook.ads.internal.adapters.C1653q;
import com.facebook.ads.internal.p074b.C1659a;
import com.facebook.ads.internal.p074b.C1674g;
import com.facebook.ads.internal.p079f.C1710a;
import com.facebook.ads.internal.p081h.C1723a;
import com.facebook.ads.internal.p081h.C1724b;
import com.facebook.ads.internal.p086m.C1765d;
import com.facebook.ads.internal.p091r.C1795a;
import com.facebook.ads.internal.p092s.C1803d;
import com.facebook.ads.internal.p115w.p116a.C2305b;
import com.facebook.ads.internal.p115w.p117b.C2317g;
import com.facebook.ads.internal.p115w.p117b.C2323k;
import com.facebook.ads.internal.p115w.p117b.C2341w;
import com.facebook.ads.internal.p115w.p120e.C2361g;
import com.facebook.ads.internal.p125x.C2376a;
import com.facebook.ads.internal.p125x.C2376a.C2377a;
import com.facebook.ads.internal.protocol.AdErrorType;
import com.facebook.ads.internal.protocol.AdPlacementType;
import com.facebook.ads.internal.protocol.C1782a;
import com.facebook.ads.internal.protocol.C1787e;
import com.facebook.ads.internal.view.C1946ab;
import com.facebook.ads.internal.view.p099a.C1917c;
import com.facebook.ads.internal.view.p099a.C1919d;
import com.facebook.ads.internal.view.p101c.C1978c;
import com.facebook.ads.internal.view.p101c.C1980d;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.WeakHashMap;

/* renamed from: com.facebook.ads.internal.t.e */
public class C1822e {

    /* renamed from: b */
    private static final String f5781b = "e";

    /* renamed from: c */
    private static WeakHashMap<View, WeakReference<C1822e>> f5782c = new WeakHashMap<>();

    /* renamed from: h */
    private static C1724b f5783h;
    /* access modifiers changed from: private */

    /* renamed from: A */
    public C1838k f5784A;
    /* access modifiers changed from: private */

    /* renamed from: B */
    public boolean f5785B;
    /* access modifiers changed from: private */

    /* renamed from: C */
    public boolean f5786C;
    /* access modifiers changed from: private */

    /* renamed from: D */
    public boolean f5787D;
    /* access modifiers changed from: private */

    /* renamed from: E */
    public boolean f5788E;
    /* access modifiers changed from: private */

    /* renamed from: F */
    public C1978c f5789F;
    /* access modifiers changed from: private */

    /* renamed from: G */
    public C1821d f5790G;
    /* access modifiers changed from: private */

    /* renamed from: H */
    public C1651a f5791H;
    /* access modifiers changed from: private */

    /* renamed from: I */
    public String f5792I;

    /* renamed from: J */
    private View f5793J;

    /* renamed from: a */
    protected C1637i f5794a;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final Context f5795d;

    /* renamed from: e */
    private final String f5796e;

    /* renamed from: f */
    private final String f5797f;

    /* renamed from: g */
    private final C1724b f5798g;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public C1835h f5799i;

    /* renamed from: j */
    private final C1832c f5800j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public C1674g f5801k;

    /* renamed from: l */
    private volatile boolean f5802l;

    /* renamed from: m */
    private C1765d f5803m;

    /* renamed from: n */
    private C1787e f5804n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public View f5805o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public NativeAdLayout f5806p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public C1833f f5807q;

    /* renamed from: r */
    private final List<View> f5808r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public OnTouchListener f5809s;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public C2376a f5810t;

    /* renamed from: u */
    private C2377a f5811u;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public WeakReference<C2377a> f5812v;
    /* access modifiers changed from: private */

    /* renamed from: w */
    public final C2341w f5813w;
    /* access modifiers changed from: private */

    /* renamed from: x */
    public C1650p f5814x;

    /* renamed from: y */
    private C1828a f5815y;

    /* renamed from: z */
    private C1946ab f5816z;

    /* renamed from: com.facebook.ads.internal.t.e$a */
    private class C1828a implements OnClickListener, OnLongClickListener, OnTouchListener {
        private C1828a() {
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public Map m7698a() {
            HashMap hashMap = new HashMap();
            hashMap.put("touch", C2323k.m9046a(C1822e.this.f5813w.mo8743e()));
            if (C1822e.this.f5784A != null) {
                hashMap.put("nti", String.valueOf(C1822e.this.f5784A.mo7810c()));
            }
            if (C1822e.this.f5785B) {
                hashMap.put("nhs", String.valueOf(C1822e.this.f5785B));
            }
            C1822e.this.f5810t.mo8779a((Map<String, String>) hashMap);
            return hashMap;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void m7701a(Map<String, String> map) {
            if (C1822e.this.f5794a != null) {
                C1822e.this.f5794a.mo7292e(map);
            }
        }

        public void onClick(View view) {
            String str;
            String str2;
            if (!C1822e.this.f5813w.mo8742d()) {
                Log.e("FBAudienceNetworkLog", "No touch data recorded, please ensure touch events reach the ad View by returning false if you intercept the event.");
            }
            int F = C1795a.m7412F(C1822e.this.f5795d);
            if (F >= 0 && C1822e.this.f5813w.mo8741c() < ((long) F)) {
                if (!C1822e.this.f5813w.mo8740b()) {
                    str = "FBAudienceNetworkLog";
                    str2 = "Ad cannot be clicked before it is viewed.";
                } else {
                    str = "FBAudienceNetworkLog";
                    str2 = "Clicks happened too fast.";
                }
                Log.e(str, str2);
            } else if (C1822e.this.f5813w.mo8739a(C1822e.this.f5795d)) {
                if (C1822e.this.f5794a != null) {
                    C1822e.this.f5794a.mo7290d(m7698a());
                }
            } else if (C1795a.m7446e(C1822e.this.f5795d)) {
                if (C1822e.this.f5794a != null) {
                    C1822e.this.f5794a.mo7289c(m7698a());
                }
                C2317g.m9038a(new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Map a = C1828a.this.m7698a();
                        a.put("is_two_step", "true");
                        C1828a.this.m7701a(a);
                    }
                }, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialogInterface, int i) {
                        if (C1822e.this.f5794a != null) {
                            C1822e.this.f5794a.mo7287b(C1828a.this.m7698a());
                        }
                    }
                }, C2305b.m9012a());
            } else {
                m7701a(m7698a());
            }
        }

        public boolean onLongClick(View view) {
            if (C1822e.this.f5805o == null || C1822e.this.f5789F == null) {
                return false;
            }
            C1822e.this.f5789F.setBounds(0, 0, C1822e.this.f5805o.getWidth(), C1822e.this.f5805o.getHeight());
            C1822e.this.f5789F.mo8105a(!C1822e.this.f5789F.mo8106a());
            return true;
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            C1822e.this.f5813w.mo8738a(motionEvent, C1822e.this.f5805o, view);
            return C1822e.this.f5809s != null && C1822e.this.f5809s.onTouch(view, motionEvent);
        }
    }

    /* renamed from: com.facebook.ads.internal.t.e$b */
    private class C1831b extends C1609c {
        private C1831b() {
        }

        /* renamed from: a */
        public void mo7238a() {
            if (C1822e.this.f5799i != null) {
                C1822e.this.f5799i.mo6964d();
            }
        }

        /* renamed from: b */
        public void mo7239b() {
        }
    }

    /* renamed from: com.facebook.ads.internal.t.e$c */
    public interface C1832c {
        /* renamed from: a */
        boolean mo6959a(View view);
    }

    public C1822e(Context context, C1637i iVar, C1765d dVar, C1832c cVar) {
        this(context, null, cVar);
        this.f5794a = iVar;
        this.f5803m = dVar;
        this.f5802l = true;
        this.f5793J = new View(context);
    }

    public C1822e(Context context, String str, C1832c cVar) {
        this.f5797f = UUID.randomUUID().toString();
        this.f5804n = C1787e.NATIVE_UNKNOWN;
        this.f5808r = new ArrayList();
        this.f5813w = new C2341w();
        this.f5786C = false;
        this.f5787D = false;
        this.f5790G = C1821d.ALL;
        this.f5791H = C1651a.ALL;
        this.f5795d = context;
        this.f5796e = str;
        this.f5800j = cVar;
        this.f5798g = f5783h != null ? f5783h : new C1724b(context);
        this.f5793J = new View(context);
    }

    public C1822e(C1822e eVar) {
        this(eVar.f5795d, null, eVar.f5800j);
        this.f5803m = eVar.f5803m;
        this.f5794a = eVar.f5794a;
        this.f5802l = true;
        this.f5793J = new View(this.f5795d);
    }

    /* access modifiers changed from: private */
    /* renamed from: A */
    public boolean m7612A() {
        return this.f5794a != null && this.f5794a.mo7280B();
    }

    /* renamed from: B */
    private void m7613B() {
        if (!TextUtils.isEmpty(mo7763p())) {
            C2361g.m9129a(new C2361g(), this.f5795d, Uri.parse(mo7763p()), mo7769v());
        }
    }

    /* renamed from: C */
    private void m7614C() {
        for (View view : this.f5808r) {
            view.setOnClickListener(null);
            view.setOnTouchListener(null);
            view.setOnLongClickListener(null);
        }
        this.f5808r.clear();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m7616a(final C1637i iVar, final boolean z) {
        if (iVar != null) {
            if (this.f5790G.equals(C1821d.ALL)) {
                if (iVar.mo7300l() != null) {
                    this.f5798g.mo7494a(iVar.mo7300l().mo7780a(), iVar.mo7300l().mo7782c(), iVar.mo7300l().mo7781b());
                }
                if (!this.f5804n.equals(C1787e.NATIVE_BANNER)) {
                    if (iVar.mo7301m() != null) {
                        this.f5798g.mo7494a(iVar.mo7301m().mo7780a(), iVar.mo7301m().mo7782c(), iVar.mo7301m().mo7781b());
                    }
                    if (iVar.mo7312x() != null) {
                        for (C1822e eVar : iVar.mo7312x()) {
                            if (eVar.mo7757j() != null) {
                                this.f5798g.mo7494a(eVar.mo7757j().mo7780a(), eVar.mo7757j().mo7782c(), eVar.mo7757j().mo7781b());
                            }
                        }
                    }
                    if (!TextUtils.isEmpty(iVar.mo7308t())) {
                        this.f5798g.mo7493a(iVar.mo7308t());
                    }
                }
            }
            this.f5798g.mo7492a((C1723a) new C1723a() {
                /* renamed from: a */
                public void mo7016a() {
                    C1822e.this.f5794a = iVar;
                    if (C1822e.this.f5799i != null) {
                        if (C1822e.this.f5790G.equals(C1821d.ALL) && !C1822e.this.m7612A()) {
                            C1822e.this.f5799i.mo6960a();
                        }
                        if (z) {
                            C1822e.this.f5799i.mo6962b();
                        }
                    }
                }

                /* renamed from: b */
                public void mo7017b() {
                    if (C1822e.this.f5794a != null) {
                        C1822e.this.f5794a.mo7288c();
                        C1822e.this.f5794a = null;
                    }
                    if (C1822e.this.f5799i != null) {
                        C1822e.this.f5799i.mo6961a(C1782a.m7381a(AdErrorType.CACHE_FAILURE_ERROR, "Failed to download a media."));
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public static void m7618a(C1834g gVar, ImageView imageView) {
        if (gVar != null && imageView != null) {
            new C1980d(imageView).mo8115a(gVar.mo7782c(), gVar.mo7781b()).mo8118a(gVar.mo7780a());
        }
    }

    /* renamed from: a */
    private void m7619a(List<View> list, View view) {
        if (this.f5800j == null || !this.f5800j.mo6959a(view)) {
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    m7619a(list, viewGroup.getChildAt(i));
                }
            } else {
                list.add(view);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:109:0x0215  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x015b  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0161  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0169  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0171  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0194  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x019b  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x01c2  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x01c9  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m7621b(android.view.View r10, com.facebook.ads.internal.p093t.C1833f r11, java.util.List<android.view.View> r12) {
        /*
            r9 = this;
            if (r10 != 0) goto L_0x000a
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r11 = "Must provide a View"
            r10.<init>(r11)
            throw r10
        L_0x000a:
            if (r12 == 0) goto L_0x027f
            int r0 = r12.size()
            if (r0 != 0) goto L_0x0014
            goto L_0x027f
        L_0x0014:
            boolean r0 = r9.mo7753f()
            if (r0 != 0) goto L_0x0022
            java.lang.String r10 = f5781b
            java.lang.String r11 = "Ad not loaded"
            android.util.Log.e(r10, r11)
            return
        L_0x0022:
            com.facebook.ads.NativeAdLayout r0 = r9.f5806p
            if (r0 == 0) goto L_0x002b
            com.facebook.ads.NativeAdLayout r0 = r9.f5806p
            r0.clearAdReportingLayout()
        L_0x002b:
            if (r11 != 0) goto L_0x0071
            com.facebook.ads.internal.protocol.e r10 = r9.f5804n
            com.facebook.ads.internal.protocol.e r11 = com.facebook.ads.internal.protocol.C1787e.NATIVE_UNKNOWN
            if (r10 != r11) goto L_0x0053
            com.facebook.ads.internal.t.h r10 = r9.f5799i
            if (r10 == 0) goto L_0x0045
            com.facebook.ads.internal.t.h r10 = r9.f5799i
            com.facebook.ads.internal.protocol.a r11 = new com.facebook.ads.internal.protocol.a
            com.facebook.ads.internal.protocol.AdErrorType r12 = com.facebook.ads.internal.protocol.AdErrorType.NO_MEDIAVIEW_IN_NATIVEAD
            java.lang.String r0 = "MediaView is missing."
            r11.<init>(r12, r0)
            r10.mo6961a(r11)
        L_0x0045:
            boolean r10 = com.facebook.ads.internal.settings.AdInternalSettings.isDebugBuild()
            if (r10 == 0) goto L_0x0070
            java.lang.String r10 = f5781b
            java.lang.String r11 = "MediaView is missing."
        L_0x004f:
            android.util.Log.e(r10, r11)
            return
        L_0x0053:
            com.facebook.ads.internal.t.h r10 = r9.f5799i
            if (r10 == 0) goto L_0x0065
            com.facebook.ads.internal.t.h r10 = r9.f5799i
            com.facebook.ads.internal.protocol.a r11 = new com.facebook.ads.internal.protocol.a
            com.facebook.ads.internal.protocol.AdErrorType r12 = com.facebook.ads.internal.protocol.AdErrorType.NO_ICONVIEW_IN_NATIVEBANNERAD
            java.lang.String r0 = "AdIconView is missing."
            r11.<init>(r12, r0)
            r10.mo6961a(r11)
        L_0x0065:
            boolean r10 = com.facebook.ads.internal.settings.AdInternalSettings.isDebugBuild()
            if (r10 == 0) goto L_0x0070
            java.lang.String r10 = f5781b
            java.lang.String r11 = "AdIconView is missing."
            goto L_0x004f
        L_0x0070:
            return
        L_0x0071:
            android.view.View r0 = r11.getAdContentsView()
            if (r0 != 0) goto L_0x008a
            com.facebook.ads.internal.t.h r10 = r9.f5799i
            if (r10 == 0) goto L_0x0089
            com.facebook.ads.internal.t.h r10 = r9.f5799i
            com.facebook.ads.internal.protocol.a r11 = new com.facebook.ads.internal.protocol.a
            com.facebook.ads.internal.protocol.AdErrorType r12 = com.facebook.ads.internal.protocol.AdErrorType.UNSUPPORTED_AD_ASSET_NATIVEAD
            java.lang.String r0 = "ad media type is not supported."
            r11.<init>(r12, r0)
            r10.mo6961a(r11)
        L_0x0089:
            return
        L_0x008a:
            android.view.View r0 = r9.f5805o
            if (r0 == 0) goto L_0x0098
            java.lang.String r0 = f5781b
            java.lang.String r1 = "Native Ad was already registered with a View. Auto unregistering and proceeding."
            android.util.Log.w(r0, r1)
            r9.mo7773z()
        L_0x0098:
            java.util.WeakHashMap<android.view.View, java.lang.ref.WeakReference<com.facebook.ads.internal.t.e>> r0 = f5782c
            boolean r0 = r0.containsKey(r10)
            if (r0 == 0) goto L_0x00c6
            java.util.WeakHashMap<android.view.View, java.lang.ref.WeakReference<com.facebook.ads.internal.t.e>> r0 = f5782c
            java.lang.Object r0 = r0.get(r10)
            java.lang.ref.WeakReference r0 = (java.lang.ref.WeakReference) r0
            java.lang.Object r0 = r0.get()
            if (r0 == 0) goto L_0x00c6
            java.lang.String r0 = f5781b
            java.lang.String r1 = "View already registered with a NativeAd. Auto unregistering and proceeding."
            android.util.Log.w(r0, r1)
            java.util.WeakHashMap<android.view.View, java.lang.ref.WeakReference<com.facebook.ads.internal.t.e>> r0 = f5782c
            java.lang.Object r0 = r0.get(r10)
            java.lang.ref.WeakReference r0 = (java.lang.ref.WeakReference) r0
            java.lang.Object r0 = r0.get()
            com.facebook.ads.internal.t.e r0 = (com.facebook.ads.internal.p093t.C1822e) r0
            r0.mo7773z()
        L_0x00c6:
            com.facebook.ads.internal.t.e$a r0 = new com.facebook.ads.internal.t.e$a
            r1 = 0
            r0.<init>()
            r9.f5815y = r0
            r9.f5805o = r10
            r9.f5807q = r11
            boolean r0 = r10 instanceof android.view.ViewGroup
            if (r0 == 0) goto L_0x00ee
            com.facebook.ads.internal.view.ab r0 = new com.facebook.ads.internal.view.ab
            android.content.Context r2 = r10.getContext()
            com.facebook.ads.internal.t.e$3 r3 = new com.facebook.ads.internal.t.e$3
            r3.<init>()
            r0.<init>(r2, r3)
            r9.f5816z = r0
            r0 = r10
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            com.facebook.ads.internal.view.ab r2 = r9.f5816z
            r0.addView(r2)
        L_0x00ee:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r12)
            android.view.View r12 = r9.f5793J
            if (r12 == 0) goto L_0x00fc
            android.view.View r12 = r9.f5793J
            r0.add(r12)
        L_0x00fc:
            java.util.Iterator r12 = r0.iterator()
        L_0x0100:
            boolean r2 = r12.hasNext()
            if (r2 == 0) goto L_0x012b
            java.lang.Object r2 = r12.next()
            android.view.View r2 = (android.view.View) r2
            java.util.List<android.view.View> r3 = r9.f5808r
            r3.add(r2)
            com.facebook.ads.internal.t.e$a r3 = r9.f5815y
            r2.setOnClickListener(r3)
            com.facebook.ads.internal.t.e$a r3 = r9.f5815y
            r2.setOnTouchListener(r3)
            android.content.Context r3 = r2.getContext()
            boolean r3 = com.facebook.ads.internal.p091r.C1795a.m7442b(r3)
            if (r3 == 0) goto L_0x0100
            com.facebook.ads.internal.t.e$a r3 = r9.f5815y
            r2.setOnLongClickListener(r3)
            goto L_0x0100
        L_0x012b:
            com.facebook.ads.internal.adapters.i r12 = r9.f5794a
            r12.mo7284a(r10, r0)
            r12 = 1
            com.facebook.ads.internal.m.d r2 = r9.f5803m
            if (r2 == 0) goto L_0x013d
            com.facebook.ads.internal.m.d r12 = r9.f5803m
        L_0x0137:
            int r12 = r12.mo7610f()
        L_0x013b:
            r4 = r12
            goto L_0x0150
        L_0x013d:
            com.facebook.ads.internal.b.g r2 = r9.f5801k
            if (r2 == 0) goto L_0x013b
            com.facebook.ads.internal.b.g r2 = r9.f5801k
            com.facebook.ads.internal.m.d r2 = r2.mo7377b()
            if (r2 == 0) goto L_0x013b
            com.facebook.ads.internal.b.g r12 = r9.f5801k
            com.facebook.ads.internal.m.d r12 = r12.mo7377b()
            goto L_0x0137
        L_0x0150:
            com.facebook.ads.internal.t.e$4 r12 = new com.facebook.ads.internal.t.e$4
            r12.<init>()
            r9.f5811u = r12
            com.facebook.ads.internal.x.a r12 = new com.facebook.ads.internal.x.a
            if (r11 == 0) goto L_0x0161
            android.view.View r11 = r11.getAdContentsView()
        L_0x015f:
            r3 = r11
            goto L_0x0164
        L_0x0161:
            android.view.View r11 = r9.f5805o
            goto L_0x015f
        L_0x0164:
            com.facebook.ads.internal.m.d r11 = r9.f5803m
            r8 = 0
            if (r11 == 0) goto L_0x0171
            com.facebook.ads.internal.m.d r11 = r9.f5803m
        L_0x016b:
            int r11 = r11.mo7611g()
            r5 = r11
            goto L_0x0185
        L_0x0171:
            com.facebook.ads.internal.b.g r11 = r9.f5801k
            if (r11 == 0) goto L_0x0184
            com.facebook.ads.internal.b.g r11 = r9.f5801k
            com.facebook.ads.internal.m.d r11 = r11.mo7377b()
            if (r11 == 0) goto L_0x0184
            com.facebook.ads.internal.b.g r11 = r9.f5801k
            com.facebook.ads.internal.m.d r11 = r11.mo7377b()
            goto L_0x016b
        L_0x0184:
            r5 = r8
        L_0x0185:
            r6 = 1
            com.facebook.ads.internal.x.a$a r7 = r9.f5811u
            r2 = r12
            r2.<init>(r3, r4, r5, r6, r7)
            r9.f5810t = r12
            com.facebook.ads.internal.x.a r11 = r9.f5810t
            com.facebook.ads.internal.m.d r12 = r9.f5803m
            if (r12 == 0) goto L_0x019b
            com.facebook.ads.internal.m.d r12 = r9.f5803m
        L_0x0196:
            int r8 = r12.mo7612h()
            goto L_0x01b9
        L_0x019b:
            com.facebook.ads.internal.adapters.i r12 = r9.f5794a
            if (r12 == 0) goto L_0x01a6
            com.facebook.ads.internal.adapters.i r12 = r9.f5794a
            int r8 = r12.mo7298j()
            goto L_0x01b9
        L_0x01a6:
            com.facebook.ads.internal.b.g r12 = r9.f5801k
            if (r12 == 0) goto L_0x01b9
            com.facebook.ads.internal.b.g r12 = r9.f5801k
            com.facebook.ads.internal.m.d r12 = r12.mo7377b()
            if (r12 == 0) goto L_0x01b9
            com.facebook.ads.internal.b.g r12 = r9.f5801k
            com.facebook.ads.internal.m.d r12 = r12.mo7377b()
            goto L_0x0196
        L_0x01b9:
            r11.mo8778a(r8)
            com.facebook.ads.internal.x.a r11 = r9.f5810t
            com.facebook.ads.internal.m.d r12 = r9.f5803m
            if (r12 == 0) goto L_0x01c9
            com.facebook.ads.internal.m.d r12 = r9.f5803m
        L_0x01c4:
            int r12 = r12.mo7613i()
            goto L_0x01e9
        L_0x01c9:
            com.facebook.ads.internal.adapters.i r12 = r9.f5794a
            if (r12 == 0) goto L_0x01d4
            com.facebook.ads.internal.adapters.i r12 = r9.f5794a
            int r12 = r12.mo7299k()
            goto L_0x01e9
        L_0x01d4:
            com.facebook.ads.internal.b.g r12 = r9.f5801k
            if (r12 == 0) goto L_0x01e7
            com.facebook.ads.internal.b.g r12 = r9.f5801k
            com.facebook.ads.internal.m.d r12 = r12.mo7377b()
            if (r12 == 0) goto L_0x01e7
            com.facebook.ads.internal.b.g r12 = r9.f5801k
            com.facebook.ads.internal.m.d r12 = r12.mo7377b()
            goto L_0x01c4
        L_0x01e7:
            r12 = 1000(0x3e8, float:1.401E-42)
        L_0x01e9:
            r11.mo8780b(r12)
            com.facebook.ads.internal.adapters.p r11 = new com.facebook.ads.internal.adapters.p
            android.content.Context r12 = r9.f5795d
            com.facebook.ads.internal.t.e$b r2 = new com.facebook.ads.internal.t.e$b
            r2.<init>()
            com.facebook.ads.internal.x.a r1 = r9.f5810t
            com.facebook.ads.internal.adapters.i r3 = r9.f5794a
            r11.<init>(r12, r2, r1, r3)
            r9.f5814x = r11
            com.facebook.ads.internal.adapters.p r11 = r9.f5814x
            r11.mo7339a(r0)
            java.util.WeakHashMap<android.view.View, java.lang.ref.WeakReference<com.facebook.ads.internal.t.e>> r11 = f5782c
            java.lang.ref.WeakReference r12 = new java.lang.ref.WeakReference
            r12.<init>(r9)
            r11.put(r10, r12)
            android.content.Context r10 = r9.f5795d
            boolean r10 = com.facebook.ads.internal.p091r.C1795a.m7442b(r10)
            if (r10 == 0) goto L_0x027e
            com.facebook.ads.internal.view.c.c r10 = new com.facebook.ads.internal.view.c.c
            r10.<init>()
            r9.f5789F = r10
            com.facebook.ads.internal.view.c.c r10 = r9.f5789F
            java.lang.String r11 = r9.f5796e
            r10.mo8104a(r11)
            com.facebook.ads.internal.view.c.c r10 = r9.f5789F
            android.content.Context r11 = r9.f5795d
            java.lang.String r11 = r11.getPackageName()
            r10.mo8108b(r11)
            com.facebook.ads.internal.view.c.c r10 = r9.f5789F
            com.facebook.ads.internal.x.a r11 = r9.f5810t
            r10.mo8103a(r11)
            com.facebook.ads.internal.adapters.i r10 = r9.f5794a
            int r10 = r10.mo7314z()
            if (r10 <= 0) goto L_0x024e
            com.facebook.ads.internal.view.c.c r10 = r9.f5789F
            com.facebook.ads.internal.adapters.i r11 = r9.f5794a
            int r11 = r11.mo7314z()
            com.facebook.ads.internal.adapters.i r12 = r9.f5794a
            int r12 = r12.mo7313y()
            r10.mo8101a(r11, r12)
        L_0x024e:
            com.facebook.ads.internal.m.d r10 = r9.f5803m
            if (r10 == 0) goto L_0x025e
            com.facebook.ads.internal.view.c.c r10 = r9.f5789F
            com.facebook.ads.internal.m.d r11 = r9.f5803m
        L_0x0256:
            long r11 = r11.mo7605a()
            r10.mo8102a(r11)
            goto L_0x0273
        L_0x025e:
            com.facebook.ads.internal.b.g r10 = r9.f5801k
            if (r10 == 0) goto L_0x0273
            com.facebook.ads.internal.b.g r10 = r9.f5801k
            com.facebook.ads.internal.m.d r10 = r10.mo7377b()
            if (r10 == 0) goto L_0x0273
            com.facebook.ads.internal.view.c.c r10 = r9.f5789F
            com.facebook.ads.internal.b.g r11 = r9.f5801k
            com.facebook.ads.internal.m.d r11 = r11.mo7377b()
            goto L_0x0256
        L_0x0273:
            android.view.View r10 = r9.f5805o
            android.view.ViewOverlay r10 = r10.getOverlay()
            com.facebook.ads.internal.view.c.c r11 = r9.f5789F
            r10.add(r11)
        L_0x027e:
            return
        L_0x027f:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r11 = "Invalid set of clickable views"
            r10.<init>(r11)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.p093t.C1822e.m7621b(android.view.View, com.facebook.ads.internal.t.f, java.util.List):void");
    }

    /* renamed from: o */
    static /* synthetic */ boolean m7634o(C1822e eVar) {
        return eVar.mo7767t() == C1839l.ON;
    }

    /* renamed from: a */
    public C1637i mo7731a() {
        return this.f5794a;
    }

    /* renamed from: a */
    public String mo7732a(String str) {
        if (!mo7753f()) {
            return null;
        }
        return this.f5794a.mo7281a(str);
    }

    /* renamed from: a */
    public void mo7733a(OnTouchListener onTouchListener) {
        this.f5809s = onTouchListener;
    }

    /* renamed from: a */
    public void mo7734a(View view, C1833f fVar) {
        ArrayList arrayList = new ArrayList();
        m7619a((List<View>) arrayList, view);
        m7621b(view, fVar, arrayList);
    }

    /* renamed from: a */
    public void mo7735a(View view, C1833f fVar, List<View> list) {
        m7621b(view, fVar, list);
    }

    /* renamed from: a */
    public void mo7736a(NativeAdLayout nativeAdLayout) {
        this.f5806p = nativeAdLayout;
    }

    /* renamed from: a */
    public void mo7737a(C1653q qVar) {
        if (this.f5794a != null) {
            this.f5794a.mo7285a(qVar);
        }
    }

    /* renamed from: a */
    public void mo7738a(C1787e eVar) {
        this.f5804n = eVar;
    }

    /* renamed from: a */
    public void mo7739a(C1821d dVar, String str) {
        if (this.f5802l) {
            throw new IllegalStateException("loadAd cannot be called more than once");
        }
        this.f5802l = true;
        this.f5790G = dVar;
        if (dVar.equals(C1821d.NONE)) {
            this.f5791H = C1651a.NONE;
        }
        C1659a aVar = new C1659a(this.f5796e, this.f5804n, this.f5804n == C1787e.NATIVE_UNKNOWN ? AdPlacementType.NATIVE : AdPlacementType.NATIVE_BANNER, null, 1);
        aVar.mo7367a(dVar);
        aVar.mo7368a(this.f5792I);
        this.f5801k = new C1674g(this.f5795d, aVar);
        this.f5801k.mo7375a((C1577a) new C1577a() {
            /* renamed from: a */
            public void mo6775a() {
                if (C1822e.this.f5799i != null) {
                    C1822e.this.f5799i.mo6963c();
                }
            }

            /* renamed from: a */
            public void mo6777a(AdAdapter adAdapter) {
                if (C1822e.this.f5801k != null) {
                    C1822e.this.f5801k.mo7381e();
                }
            }

            /* renamed from: a */
            public void mo7096a(C1637i iVar) {
                C1822e.this.m7616a(iVar, true);
                if (C1822e.this.f5799i != null && iVar.mo7312x() != null) {
                    C18241 r0 = new C1653q() {
                        /* renamed from: a */
                        public void mo7053a(C1637i iVar) {
                        }

                        /* renamed from: a */
                        public void mo7054a(C1637i iVar, C1782a aVar) {
                        }

                        /* renamed from: b */
                        public void mo7055b(C1637i iVar) {
                        }

                        /* renamed from: c */
                        public void mo7056c(C1637i iVar) {
                            if (C1822e.this.f5799i != null) {
                                C1822e.this.f5799i.mo6963c();
                            }
                        }
                    };
                    for (C1822e a : iVar.mo7312x()) {
                        a.mo7737a((C1653q) r0);
                    }
                }
            }

            /* renamed from: a */
            public void mo6778a(C1782a aVar) {
                if (C1822e.this.f5799i != null) {
                    C1822e.this.f5799i.mo6961a(aVar);
                }
            }

            /* renamed from: b */
            public void mo6779b() {
                throw new IllegalStateException("Native ads manager their own impressions.");
            }
        });
        this.f5801k.mo7378b(str);
    }

    /* renamed from: a */
    public void mo7740a(C1835h hVar) {
        this.f5799i = hVar;
    }

    /* renamed from: a */
    public void mo7741a(C1838k kVar) {
        this.f5784A = kVar;
    }

    /* renamed from: a */
    public void mo7742a(C2377a aVar) {
        this.f5812v = new WeakReference<>(aVar);
    }

    /* renamed from: a */
    public void mo7743a(boolean z) {
        this.f5785B = z;
    }

    /* renamed from: a */
    public void mo7744a(boolean z, boolean z2) {
        if (z) {
            if (this.f5790G.equals(C1821d.NONE) && !m7612A() && this.f5799i != null) {
                this.f5799i.mo6960a();
            }
            if (this.f5810t != null) {
                this.f5810t.mo8777a();
            }
        } else {
            if (this.f5810t != null) {
                this.f5810t.mo8782c();
            }
            if (this.f5799i != null && z2) {
                this.f5799i.mo6961a(C1782a.m7381a(AdErrorType.BROKEN_MEDIA_ERROR, "Failed to load Media."));
            }
        }
    }

    /* renamed from: b */
    public void mo7745b(String str) {
        this.f5792I = str;
    }

    /* renamed from: b */
    public void mo7746b(boolean z) {
        this.f5788E = z;
    }

    /* renamed from: b */
    public boolean mo7747b() {
        return this.f5801k == null || this.f5801k.mo7383g();
    }

    /* renamed from: c */
    public void mo7748c() {
        if (this.f5790G.equals(C1821d.NONE)) {
            this.f5791H = C1651a.MANUAL;
        }
        this.f5790G = C1821d.ALL;
        m7616a(this.f5794a, false);
    }

    /* renamed from: c */
    public void mo7749c(boolean z) {
        this.f5786C = z;
    }

    /* renamed from: d */
    public void mo7750d() {
        if (this.f5801k != null) {
            this.f5801k.mo7376a(true);
            this.f5801k = null;
        }
    }

    /* renamed from: d */
    public void mo7751d(boolean z) {
        this.f5787D = z;
    }

    /* renamed from: e */
    public String mo7752e() {
        return this.f5796e;
    }

    /* renamed from: f */
    public boolean mo7753f() {
        return this.f5794a != null && this.f5794a.mo7279A();
    }

    /* renamed from: g */
    public boolean mo7754g() {
        return mo7753f() && this.f5794a.mo7293e();
    }

    /* renamed from: h */
    public boolean mo7755h() {
        return this.f5794a != null && this.f5794a.mo7294f();
    }

    /* renamed from: i */
    public C1834g mo7756i() {
        if (!mo7753f()) {
            return null;
        }
        return this.f5794a.mo7300l();
    }

    /* renamed from: j */
    public C1834g mo7757j() {
        if (!mo7753f()) {
            return null;
        }
        return this.f5794a.mo7301m();
    }

    /* renamed from: k */
    public C1837j mo7758k() {
        if (!mo7753f()) {
            return null;
        }
        return this.f5794a.mo7302n();
    }

    /* renamed from: l */
    public String mo7759l() {
        if (!mo7753f()) {
            return null;
        }
        return this.f5794a.mo7303o();
    }

    /* renamed from: m */
    public C1836i mo7760m() {
        if (!mo7753f()) {
            return null;
        }
        return this.f5794a.mo7304p();
    }

    /* renamed from: n */
    public String mo7761n() {
        if (!mo7753f()) {
            return null;
        }
        return this.f5797f;
    }

    /* renamed from: o */
    public C1834g mo7762o() {
        if (!mo7753f()) {
            return null;
        }
        return this.f5794a.mo7305q();
    }

    /* renamed from: p */
    public String mo7763p() {
        if (!mo7753f()) {
            return null;
        }
        return this.f5794a.mo7306r();
    }

    /* renamed from: q */
    public String mo7764q() {
        if (!mo7753f()) {
            return null;
        }
        return this.f5794a.mo7307s();
    }

    /* renamed from: r */
    public String mo7765r() {
        if (!mo7753f() || TextUtils.isEmpty(this.f5794a.mo7308t())) {
            return null;
        }
        return this.f5798g.mo7496c(this.f5794a.mo7308t());
    }

    /* renamed from: s */
    public String mo7766s() {
        if (!mo7753f()) {
            return null;
        }
        return this.f5794a.mo7309u();
    }

    /* renamed from: t */
    public C1839l mo7767t() {
        return !mo7753f() ? C1839l.DEFAULT : this.f5794a.mo7310v();
    }

    /* renamed from: u */
    public List<C1822e> mo7768u() {
        if (!mo7753f()) {
            return null;
        }
        return this.f5794a.mo7312x();
    }

    /* renamed from: v */
    public String mo7769v() {
        if (!mo7753f()) {
            return null;
        }
        return this.f5794a.getClientToken();
    }

    /* renamed from: w */
    public void mo7770w() {
        this.f5793J.performClick();
    }

    /* renamed from: x */
    public C1838k mo7771x() {
        return this.f5784A;
    }

    /* renamed from: y */
    public void mo7772y() {
        if (!C1710a.m7130a(this.f5795d, false)) {
            m7613B();
            return;
        }
        C1917c a = C1919d.m8032a(this.f5795d, C1803d.m7531a(this.f5795d), mo7769v(), this.f5806p);
        if (a == null) {
            m7613B();
            return;
        }
        this.f5806p.setAdReportingLayout(a);
        a.mo7973a();
    }

    /* renamed from: z */
    public void mo7773z() {
        if (this.f5805o != null && this.f5807q != null) {
            if (!f5782c.containsKey(this.f5805o) || ((WeakReference) f5782c.get(this.f5805o)).get() != this) {
                throw new IllegalStateException("View not registered with this NativeAd");
            }
            if ((this.f5805o instanceof ViewGroup) && this.f5816z != null) {
                ((ViewGroup) this.f5805o).removeView(this.f5816z);
                this.f5816z = null;
            }
            if (this.f5794a != null) {
                this.f5794a.mo7288c();
            }
            if (this.f5789F != null && C1795a.m7442b(this.f5795d)) {
                this.f5789F.mo8107b();
                this.f5805o.getOverlay().remove(this.f5789F);
            }
            f5782c.remove(this.f5805o);
            m7614C();
            this.f5805o = null;
            this.f5807q = null;
            if (this.f5810t != null) {
                this.f5810t.mo8782c();
                this.f5810t = null;
            }
            this.f5814x = null;
        }
    }
}
