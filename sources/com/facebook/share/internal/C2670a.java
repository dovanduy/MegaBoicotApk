package com.facebook.share.internal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.p017v4.content.C0362f;
import android.util.Log;
import com.facebook.AccessToken;
import com.facebook.C2463d;
import com.facebook.C2579j;
import com.facebook.C2581l;
import com.facebook.C2649m;
import com.facebook.C2658q;
import com.facebook.C2658q.C2659a;
import com.facebook.C2661r;
import com.facebook.C2662s;
import com.facebook.C2757u;
import com.facebook.FacebookRequestError;
import com.facebook.GraphRequest;
import com.facebook.GraphRequest.C1503b;
import com.facebook.ads.AdError;
import com.facebook.appevents.C2436g;
import com.facebook.internal.C2475a;
import com.facebook.internal.C2479ad;
import com.facebook.internal.C2495ag;
import com.facebook.internal.C2503c;
import com.facebook.internal.C2512d;
import com.facebook.internal.C2512d.C2513a;
import com.facebook.internal.C2512d.C2514b;
import com.facebook.internal.C2533m;
import com.facebook.internal.C2533m.C2542d;
import com.facebook.internal.C2546n;
import com.facebook.internal.C2563u;
import com.facebook.internal.C2566x;
import com.facebook.internal.C2575y.C2577a;
import com.facebook.share.internal.LikeContent.C2668a;
import com.facebook.share.widget.LikeView.C2753e;
import com.google.android.exoplayer2.util.MimeTypes;
import java.util.ArrayList;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@Deprecated
/* renamed from: com.facebook.share.internal.a */
/* compiled from: LikeActionController */
public class C2670a {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final String f8304a = "a";
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static C2533m f8305b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final ConcurrentHashMap<String, C2670a> f8306c = new ConcurrentHashMap<>();

    /* renamed from: d */
    private static C2495ag f8307d = new C2495ag(1);

    /* renamed from: e */
    private static C2495ag f8308e = new C2495ag(1);

    /* renamed from: f */
    private static Handler f8309f;

    /* renamed from: g */
    private static String f8310g;

    /* renamed from: h */
    private static boolean f8311h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public static volatile int f8312i;

    /* renamed from: j */
    private static C2463d f8313j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public String f8314k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public C2753e f8315l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public boolean f8316m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public String f8317n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public String f8318o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public String f8319p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public String f8320q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public String f8321r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public String f8322s;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public boolean f8323t;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public boolean f8324u;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public boolean f8325v;

    /* renamed from: w */
    private Bundle f8326w;

    /* renamed from: x */
    private C2436g f8327x;

    /* renamed from: com.facebook.share.internal.a$4 */
    /* compiled from: LikeActionController */
    static /* synthetic */ class C26794 {

        /* renamed from: a */
        static final /* synthetic */ int[] f8347a = new int[C2753e.values().length];

        static {
            try {
                f8347a[C2753e.PAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* renamed from: com.facebook.share.internal.a$a */
    /* compiled from: LikeActionController */
    private abstract class C2685a implements C2699n {

        /* renamed from: a */
        protected String f8354a;

        /* renamed from: b */
        protected C2753e f8355b;

        /* renamed from: c */
        protected FacebookRequestError f8356c;

        /* renamed from: e */
        private GraphRequest f8358e;

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract void mo9418a(C2661r rVar);

        protected C2685a(String str, C2753e eVar) {
            this.f8354a = str;
            this.f8355b = eVar;
        }

        /* renamed from: a */
        public void mo9417a(C2658q qVar) {
            qVar.add(this.f8358e);
        }

        /* renamed from: a */
        public FacebookRequestError mo9414a() {
            return this.f8356c;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo9416a(GraphRequest graphRequest) {
            this.f8358e = graphRequest;
            graphRequest.mo6676a(C2649m.m10134g());
            graphRequest.mo6673a((C1503b) new C1503b() {
                /* renamed from: a */
                public void mo6691a(C2661r rVar) {
                    C2685a.this.f8356c = rVar.mo9370a();
                    if (C2685a.this.f8356c != null) {
                        C2685a.this.mo9415a(C2685a.this.f8356c);
                    } else {
                        C2685a.this.mo9418a(rVar);
                    }
                }
            });
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo9415a(FacebookRequestError facebookRequestError) {
            C2563u.m9722a(C2757u.REQUESTS, C2670a.f8304a, "Error running request for object '%s' with type '%s' : %s", this.f8354a, this.f8355b, facebookRequestError);
        }
    }

    /* renamed from: com.facebook.share.internal.a$b */
    /* compiled from: LikeActionController */
    private static class C2687b implements Runnable {

        /* renamed from: a */
        private String f8360a;

        /* renamed from: b */
        private C2753e f8361b;

        /* renamed from: c */
        private C2688c f8362c;

        C2687b(String str, C2753e eVar, C2688c cVar) {
            this.f8360a = str;
            this.f8361b = eVar;
            this.f8362c = cVar;
        }

        public void run() {
            C2670a.m10246c(this.f8360a, this.f8361b, this.f8362c);
        }
    }

    @Deprecated
    /* renamed from: com.facebook.share.internal.a$c */
    /* compiled from: LikeActionController */
    public interface C2688c {
        /* renamed from: a */
        void mo9407a(C2670a aVar, C2579j jVar);
    }

    /* renamed from: com.facebook.share.internal.a$d */
    /* compiled from: LikeActionController */
    private class C2689d extends C2685a {

        /* renamed from: e */
        String f8363e = C2670a.this.f8317n;

        /* renamed from: f */
        String f8364f = C2670a.this.f8318o;

        /* renamed from: g */
        String f8365g = C2670a.this.f8319p;

        /* renamed from: h */
        String f8366h = C2670a.this.f8320q;

        C2689d(String str, C2753e eVar) {
            super(str, eVar);
            Bundle bundle = new Bundle();
            bundle.putString("fields", "engagement.fields(count_string_with_like,count_string_without_like,social_sentence_with_like,social_sentence_without_like)");
            bundle.putString("locale", Locale.getDefault().toString());
            mo9416a(new GraphRequest(AccessToken.m6161a(), str, bundle, C2662s.GET));
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo9418a(C2661r rVar) {
            JSONObject b = C2479ad.m9461b(rVar.mo9371b(), "engagement");
            if (b != null) {
                this.f8363e = b.optString("count_string_with_like", this.f8363e);
                this.f8364f = b.optString("count_string_without_like", this.f8364f);
                this.f8365g = b.optString("social_sentence_with_like", this.f8365g);
                this.f8366h = b.optString("social_sentence_without_like", this.f8366h);
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo9415a(FacebookRequestError facebookRequestError) {
            C2563u.m9722a(C2757u.REQUESTS, C2670a.f8304a, "Error fetching engagement for object '%s' with type '%s' : %s", this.f8354a, this.f8355b, facebookRequestError);
            C2670a.this.m10221a("get_engagement", facebookRequestError);
        }
    }

    /* renamed from: com.facebook.share.internal.a$e */
    /* compiled from: LikeActionController */
    private class C2690e extends C2685a {

        /* renamed from: e */
        String f8368e;

        C2690e(String str, C2753e eVar) {
            super(str, eVar);
            Bundle bundle = new Bundle();
            bundle.putString("fields", "og_object.fields(id)");
            bundle.putString("ids", str);
            mo9416a(new GraphRequest(AccessToken.m6161a(), "", bundle, C2662s.GET));
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo9415a(FacebookRequestError facebookRequestError) {
            if (facebookRequestError.mo6661e().contains("og_object")) {
                this.f8356c = null;
                return;
            }
            C2563u.m9722a(C2757u.REQUESTS, C2670a.f8304a, "Error getting the FB id for object '%s' with type '%s' : %s", this.f8354a, this.f8355b, facebookRequestError);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo9418a(C2661r rVar) {
            JSONObject b = C2479ad.m9461b(rVar.mo9371b(), this.f8354a);
            if (b != null) {
                JSONObject optJSONObject = b.optJSONObject("og_object");
                if (optJSONObject != null) {
                    this.f8368e = optJSONObject.optString(TtmlNode.ATTR_ID);
                }
            }
        }
    }

    /* renamed from: com.facebook.share.internal.a$f */
    /* compiled from: LikeActionController */
    private class C2691f extends C2685a implements C2694i {

        /* renamed from: f */
        private boolean f8371f = C2670a.this.f8316m;

        /* renamed from: g */
        private String f8372g;

        /* renamed from: h */
        private final String f8373h;

        /* renamed from: i */
        private final C2753e f8374i;

        C2691f(String str, C2753e eVar) {
            super(str, eVar);
            this.f8373h = str;
            this.f8374i = eVar;
            Bundle bundle = new Bundle();
            bundle.putString("fields", "id,application");
            bundle.putString("object", this.f8373h);
            mo9416a(new GraphRequest(AccessToken.m6161a(), "me/og.likes", bundle, C2662s.GET));
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo9418a(C2661r rVar) {
            JSONArray c = C2479ad.m9468c(rVar.mo9371b(), "data");
            if (c != null) {
                for (int i = 0; i < c.length(); i++) {
                    JSONObject optJSONObject = c.optJSONObject(i);
                    if (optJSONObject != null) {
                        this.f8371f = true;
                        JSONObject optJSONObject2 = optJSONObject.optJSONObject(MimeTypes.BASE_TYPE_APPLICATION);
                        AccessToken a = AccessToken.m6161a();
                        if (optJSONObject2 != null && AccessToken.m6168b() && C2479ad.m9455a(a.mo6623j(), optJSONObject2.optString(TtmlNode.ATTR_ID))) {
                            this.f8372g = optJSONObject.optString(TtmlNode.ATTR_ID);
                        }
                    }
                }
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo9415a(FacebookRequestError facebookRequestError) {
            C2563u.m9722a(C2757u.REQUESTS, C2670a.f8304a, "Error fetching like status for object '%s' with type '%s' : %s", this.f8373h, this.f8374i, facebookRequestError);
            C2670a.this.m10221a("get_og_object_like", facebookRequestError);
        }

        /* renamed from: b */
        public boolean mo9420b() {
            return this.f8371f;
        }

        /* renamed from: c */
        public String mo9421c() {
            return this.f8372g;
        }
    }

    /* renamed from: com.facebook.share.internal.a$g */
    /* compiled from: LikeActionController */
    private class C2692g extends C2685a {

        /* renamed from: e */
        String f8375e;

        /* renamed from: f */
        boolean f8376f;

        C2692g(String str, C2753e eVar) {
            super(str, eVar);
            Bundle bundle = new Bundle();
            bundle.putString("fields", TtmlNode.ATTR_ID);
            bundle.putString("ids", str);
            mo9416a(new GraphRequest(AccessToken.m6161a(), "", bundle, C2662s.GET));
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo9418a(C2661r rVar) {
            JSONObject b = C2479ad.m9461b(rVar.mo9371b(), this.f8354a);
            if (b != null) {
                this.f8375e = b.optString(TtmlNode.ATTR_ID);
                this.f8376f = !C2479ad.m9456a(this.f8375e);
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo9415a(FacebookRequestError facebookRequestError) {
            C2563u.m9722a(C2757u.REQUESTS, C2670a.f8304a, "Error getting the FB id for object '%s' with type '%s' : %s", this.f8354a, this.f8355b, facebookRequestError);
        }
    }

    /* renamed from: com.facebook.share.internal.a$h */
    /* compiled from: LikeActionController */
    private class C2693h extends C2685a implements C2694i {

        /* renamed from: f */
        private boolean f8379f = C2670a.this.f8316m;

        /* renamed from: g */
        private String f8380g;

        /* renamed from: c */
        public String mo9421c() {
            return null;
        }

        C2693h(String str) {
            super(str, C2753e.PAGE);
            this.f8380g = str;
            Bundle bundle = new Bundle();
            bundle.putString("fields", TtmlNode.ATTR_ID);
            AccessToken a = AccessToken.m6161a();
            StringBuilder sb = new StringBuilder();
            sb.append("me/likes/");
            sb.append(str);
            mo9416a(new GraphRequest(a, sb.toString(), bundle, C2662s.GET));
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo9418a(C2661r rVar) {
            JSONArray c = C2479ad.m9468c(rVar.mo9371b(), "data");
            if (c != null && c.length() > 0) {
                this.f8379f = true;
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo9415a(FacebookRequestError facebookRequestError) {
            C2563u.m9722a(C2757u.REQUESTS, C2670a.f8304a, "Error fetching like status for page id '%s': %s", this.f8380g, facebookRequestError);
            C2670a.this.m10221a("get_page_like", facebookRequestError);
        }

        /* renamed from: b */
        public boolean mo9420b() {
            return this.f8379f;
        }
    }

    /* renamed from: com.facebook.share.internal.a$i */
    /* compiled from: LikeActionController */
    private interface C2694i extends C2699n {
        /* renamed from: b */
        boolean mo9420b();

        /* renamed from: c */
        String mo9421c();
    }

    /* renamed from: com.facebook.share.internal.a$j */
    /* compiled from: LikeActionController */
    private static class C2695j implements Runnable {

        /* renamed from: a */
        private static ArrayList<String> f8381a = new ArrayList<>();

        /* renamed from: b */
        private String f8382b;

        /* renamed from: c */
        private boolean f8383c;

        C2695j(String str, boolean z) {
            this.f8382b = str;
            this.f8383c = z;
        }

        public void run() {
            if (this.f8382b != null) {
                f8381a.remove(this.f8382b);
                f8381a.add(0, this.f8382b);
            }
            if (this.f8383c && f8381a.size() >= 128) {
                while (64 < f8381a.size()) {
                    C2670a.f8306c.remove((String) f8381a.remove(f8381a.size() - 1));
                }
            }
        }
    }

    /* renamed from: com.facebook.share.internal.a$k */
    /* compiled from: LikeActionController */
    private class C2696k extends C2685a {

        /* renamed from: e */
        String f8384e;

        C2696k(String str, C2753e eVar) {
            super(str, eVar);
            Bundle bundle = new Bundle();
            bundle.putString("object", str);
            mo9416a(new GraphRequest(AccessToken.m6161a(), "me/og.likes", bundle, C2662s.POST));
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo9418a(C2661r rVar) {
            this.f8384e = C2479ad.m9431a(rVar.mo9371b(), TtmlNode.ATTR_ID);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo9415a(FacebookRequestError facebookRequestError) {
            if (facebookRequestError.mo6657b() == 3501) {
                this.f8356c = null;
                return;
            }
            C2563u.m9722a(C2757u.REQUESTS, C2670a.f8304a, "Error liking object '%s' with type '%s' : %s", this.f8354a, this.f8355b, facebookRequestError);
            C2670a.this.m10221a("publish_like", facebookRequestError);
        }
    }

    /* renamed from: com.facebook.share.internal.a$l */
    /* compiled from: LikeActionController */
    private class C2697l extends C2685a {

        /* renamed from: f */
        private String f8387f;

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo9418a(C2661r rVar) {
        }

        C2697l(String str) {
            super(null, null);
            this.f8387f = str;
            mo9416a(new GraphRequest(AccessToken.m6161a(), str, null, C2662s.DELETE));
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo9415a(FacebookRequestError facebookRequestError) {
            C2563u.m9722a(C2757u.REQUESTS, C2670a.f8304a, "Error unliking object with unlike token '%s' : %s", this.f8387f, facebookRequestError);
            C2670a.this.m10221a("publish_unlike", facebookRequestError);
        }
    }

    /* renamed from: com.facebook.share.internal.a$m */
    /* compiled from: LikeActionController */
    private interface C2698m {
        /* renamed from: a */
        void mo9408a();
    }

    /* renamed from: com.facebook.share.internal.a$n */
    /* compiled from: LikeActionController */
    private interface C2699n {
        /* renamed from: a */
        FacebookRequestError mo9414a();

        /* renamed from: a */
        void mo9417a(C2658q qVar);
    }

    /* renamed from: com.facebook.share.internal.a$o */
    /* compiled from: LikeActionController */
    private static class C2700o implements Runnable {

        /* renamed from: a */
        private String f8388a;

        /* renamed from: b */
        private String f8389b;

        C2700o(String str, String str2) {
            this.f8388a = str;
            this.f8389b = str2;
        }

        public void run() {
            C2670a.m10239b(this.f8388a, this.f8389b);
        }
    }

    @Deprecated
    /* renamed from: e */
    public boolean mo9406e() {
        return false;
    }

    @Deprecated
    /* renamed from: a */
    public static boolean m10227a(final int i, final int i2, final Intent intent) {
        if (C2479ad.m9456a(f8310g)) {
            f8310g = C2649m.m10133f().getSharedPreferences("com.facebook.LikeActionController.CONTROLLER_STORE_KEY", 0).getString("PENDING_CONTROLLER_KEY", null);
        }
        if (C2479ad.m9456a(f8310g)) {
            return false;
        }
        m10223a(f8310g, C2753e.UNKNOWN, (C2688c) new C2688c() {
            /* renamed from: a */
            public void mo9407a(C2670a aVar, C2579j jVar) {
                if (jVar == null) {
                    aVar.m10233b(i, i2, intent);
                } else {
                    C2479ad.m9447a(C2670a.f8304a, (Exception) jVar);
                }
            }
        });
        return true;
    }

    @Deprecated
    /* renamed from: a */
    public static void m10223a(String str, C2753e eVar, C2688c cVar) {
        if (!f8311h) {
            m10265j();
        }
        C2670a a = m10208a(str);
        if (a != null) {
            m10215a(a, eVar, cVar);
        } else {
            f8308e.mo8965a((Runnable) new C2687b(str, eVar, cVar));
        }
    }

    /* renamed from: a */
    private static void m10215a(C2670a aVar, C2753e eVar, C2688c cVar) {
        C2579j jVar;
        C2753e a = C2710h.m10346a(eVar, aVar.f8315l);
        if (a == null) {
            jVar = new C2579j("Object with id:\"%s\" is already marked as type:\"%s\". Cannot change the type to:\"%s\"", aVar.f8314k, aVar.f8315l.toString(), eVar.toString());
            aVar = null;
        } else {
            aVar.f8315l = a;
            jVar = null;
        }
        m10210a(cVar, aVar, jVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static void m10246c(String str, C2753e eVar, C2688c cVar) {
        C2670a a = m10208a(str);
        if (a != null) {
            m10215a(a, eVar, cVar);
            return;
        }
        C2670a b = m10230b(str);
        if (b == null) {
            b = new C2670a(str, eVar);
            m10269l(b);
        }
        m10222a(str, b);
        f8309f.post(new Runnable(b) {

            /* renamed from: a */
            final /* synthetic */ C2670a f8348a;

            {
                this.f8348a = r1;
            }

            public void run() {
                this.f8348a.m10273o();
            }
        });
        m10210a(cVar, b, (C2579j) null);
    }

    /* renamed from: j */
    private static synchronized void m10265j() {
        synchronized (C2670a.class) {
            if (!f8311h) {
                f8309f = new Handler(Looper.getMainLooper());
                f8312i = C2649m.m10133f().getSharedPreferences("com.facebook.LikeActionController.CONTROLLER_STORE_KEY", 0).getInt("OBJECT_SUFFIX", 1);
                f8305b = new C2533m(f8304a, new C2542d());
                m10266k();
                C2512d.m9586a(C2514b.Like.mo8989a(), new C2513a() {
                    /* renamed from: a */
                    public boolean mo8988a(int i, Intent intent) {
                        return C2670a.m10227a(C2514b.Like.mo8989a(), i, intent);
                    }
                });
                f8311h = true;
            }
        }
    }

    /* renamed from: a */
    private static void m10210a(final C2688c cVar, final C2670a aVar, final C2579j jVar) {
        if (cVar != null) {
            f8309f.post(new Runnable() {
                public void run() {
                    cVar.mo9407a(aVar, jVar);
                }
            });
        }
    }

    /* renamed from: k */
    private static void m10266k() {
        f8313j = new C2463d() {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo8879a(AccessToken accessToken, AccessToken accessToken2) {
                Context f = C2649m.m10133f();
                if (accessToken2 == null) {
                    C2670a.f8312i = (C2670a.f8312i + 1) % AdError.NETWORK_ERROR_CODE;
                    f.getSharedPreferences("com.facebook.LikeActionController.CONTROLLER_STORE_KEY", 0).edit().putInt("OBJECT_SUFFIX", C2670a.f8312i).apply();
                    C2670a.f8306c.clear();
                    C2670a.f8305b.mo9014a();
                }
                C2670a.m10251d((C2670a) null, "com.facebook.sdk.LikeActionController.DID_RESET");
            }
        };
    }

    /* renamed from: a */
    private static void m10222a(String str, C2670a aVar) {
        String d = m10249d(str);
        f8307d.mo8965a((Runnable) new C2695j(d, true));
        f8306c.put(d, aVar);
    }

    /* renamed from: a */
    private static C2670a m10208a(String str) {
        String d = m10249d(str);
        C2670a aVar = (C2670a) f8306c.get(d);
        if (aVar != null) {
            f8307d.mo8965a((Runnable) new C2695j(d, false));
        }
        return aVar;
    }

    /* renamed from: l */
    private static void m10269l(C2670a aVar) {
        String m = m10270m(aVar);
        String d = m10249d(aVar.f8314k);
        if (!C2479ad.m9456a(m) && !C2479ad.m9456a(d)) {
            f8308e.mo8965a((Runnable) new C2700o(d, m));
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0026  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m10239b(java.lang.String r2, java.lang.String r3) {
        /*
            r0 = 0
            com.facebook.internal.m r1 = f8305b     // Catch:{ IOException -> 0x001c }
            java.io.OutputStream r2 = r1.mo9015b(r2)     // Catch:{ IOException -> 0x001c }
            byte[] r3 = r3.getBytes()     // Catch:{ IOException -> 0x0017, all -> 0x0014 }
            r2.write(r3)     // Catch:{ IOException -> 0x0017, all -> 0x0014 }
            if (r2 == 0) goto L_0x0029
            com.facebook.internal.C2479ad.m9444a(r2)
            goto L_0x0029
        L_0x0014:
            r3 = move-exception
            r0 = r2
            goto L_0x002a
        L_0x0017:
            r3 = move-exception
            r0 = r2
            goto L_0x001d
        L_0x001a:
            r3 = move-exception
            goto L_0x002a
        L_0x001c:
            r3 = move-exception
        L_0x001d:
            java.lang.String r2 = f8304a     // Catch:{ all -> 0x001a }
            java.lang.String r1 = "Unable to serialize controller to disk"
            android.util.Log.e(r2, r1, r3)     // Catch:{ all -> 0x001a }
            if (r0 == 0) goto L_0x0029
            com.facebook.internal.C2479ad.m9444a(r0)
        L_0x0029:
            return
        L_0x002a:
            if (r0 == 0) goto L_0x002f
            com.facebook.internal.C2479ad.m9444a(r0)
        L_0x002f:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.share.internal.C2670a.m10239b(java.lang.String, java.lang.String):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001f, code lost:
        if (r5 != null) goto L_0x0021;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0021, code lost:
        com.facebook.internal.C2479ad.m9444a((java.io.Closeable) r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0033, code lost:
        if (r5 != null) goto L_0x0021;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0036, code lost:
        return r0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x003a  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.facebook.share.internal.C2670a m10230b(java.lang.String r5) {
        /*
            r0 = 0
            java.lang.String r5 = m10249d(r5)     // Catch:{ IOException -> 0x002a, all -> 0x0025 }
            com.facebook.internal.m r1 = f8305b     // Catch:{ IOException -> 0x002a, all -> 0x0025 }
            java.io.InputStream r5 = r1.mo9011a(r5)     // Catch:{ IOException -> 0x002a, all -> 0x0025 }
            if (r5 == 0) goto L_0x001f
            java.lang.String r1 = com.facebook.internal.C2479ad.m9427a(r5)     // Catch:{ IOException -> 0x001d }
            boolean r2 = com.facebook.internal.C2479ad.m9456a(r1)     // Catch:{ IOException -> 0x001d }
            if (r2 != 0) goto L_0x001f
            com.facebook.share.internal.a r1 = m10241c(r1)     // Catch:{ IOException -> 0x001d }
            r0 = r1
            goto L_0x001f
        L_0x001d:
            r1 = move-exception
            goto L_0x002c
        L_0x001f:
            if (r5 == 0) goto L_0x0036
        L_0x0021:
            com.facebook.internal.C2479ad.m9444a(r5)
            goto L_0x0036
        L_0x0025:
            r5 = move-exception
            r4 = r0
            r0 = r5
            r5 = r4
            goto L_0x0038
        L_0x002a:
            r1 = move-exception
            r5 = r0
        L_0x002c:
            java.lang.String r2 = f8304a     // Catch:{ all -> 0x0037 }
            java.lang.String r3 = "Unable to deserialize controller from disk"
            android.util.Log.e(r2, r3, r1)     // Catch:{ all -> 0x0037 }
            if (r5 == 0) goto L_0x0036
            goto L_0x0021
        L_0x0036:
            return r0
        L_0x0037:
            r0 = move-exception
        L_0x0038:
            if (r5 == 0) goto L_0x003d
            com.facebook.internal.C2479ad.m9444a(r5)
        L_0x003d:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.share.internal.C2670a.m10230b(java.lang.String):com.facebook.share.internal.a");
    }

    /* renamed from: c */
    private static C2670a m10241c(String str) {
        C2670a aVar = null;
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.optInt("com.facebook.share.internal.LikeActionController.version", -1) != 3) {
                return null;
            }
            C2670a aVar2 = new C2670a(jSONObject.getString("object_id"), C2753e.m10490a(jSONObject.optInt("object_type", C2753e.UNKNOWN.mo9591a())));
            aVar2.f8317n = jSONObject.optString("like_count_string_with_like", null);
            aVar2.f8318o = jSONObject.optString("like_count_string_without_like", null);
            aVar2.f8319p = jSONObject.optString("social_sentence_with_like", null);
            aVar2.f8320q = jSONObject.optString("social_sentence_without_like", null);
            aVar2.f8316m = jSONObject.optBoolean("is_object_liked");
            aVar2.f8321r = jSONObject.optString("unlike_token", null);
            JSONObject optJSONObject = jSONObject.optJSONObject("facebook_dialog_analytics_bundle");
            if (optJSONObject != null) {
                aVar2.f8326w = C2503c.m9567a(optJSONObject);
            }
            aVar = aVar2;
            return aVar;
        } catch (JSONException e) {
            Log.e(f8304a, "Unable to deserialize controller from JSON", e);
        }
    }

    /* renamed from: m */
    private static String m10270m(C2670a aVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("com.facebook.share.internal.LikeActionController.version", 3);
            jSONObject.put("object_id", aVar.f8314k);
            jSONObject.put("object_type", aVar.f8315l.mo9591a());
            jSONObject.put("like_count_string_with_like", aVar.f8317n);
            jSONObject.put("like_count_string_without_like", aVar.f8318o);
            jSONObject.put("social_sentence_with_like", aVar.f8319p);
            jSONObject.put("social_sentence_without_like", aVar.f8320q);
            jSONObject.put("is_object_liked", aVar.f8316m);
            jSONObject.put("unlike_token", aVar.f8321r);
            if (aVar.f8326w != null) {
                JSONObject a = C2503c.m9568a(aVar.f8326w);
                if (a != null) {
                    jSONObject.put("facebook_dialog_analytics_bundle", a);
                }
            }
            return jSONObject.toString();
        } catch (JSONException e) {
            Log.e(f8304a, "Unable to serialize controller to JSON", e);
            return null;
        }
    }

    /* renamed from: d */
    private static String m10249d(String str) {
        String d = AccessToken.m6168b() ? AccessToken.m6161a().mo6614d() : null;
        if (d != null) {
            d = C2479ad.m9459b(d);
        }
        return String.format(Locale.ROOT, "%s|%s|com.fb.sdk.like|%d", new Object[]{str, C2479ad.m9428a(d, ""), Integer.valueOf(f8312i)});
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static void m10251d(C2670a aVar, String str) {
        m10245c(aVar, str, (Bundle) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static void m10245c(C2670a aVar, String str, Bundle bundle) {
        Intent intent = new Intent(str);
        if (aVar != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putString("com.facebook.sdk.LikeActionController.OBJECT_ID", aVar.mo9401a());
        }
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        C0362f.m1362a(C2649m.m10133f()).mo1252a(intent);
    }

    private C2670a(String str, C2753e eVar) {
        this.f8314k = str;
        this.f8315l = eVar;
    }

    @Deprecated
    /* renamed from: a */
    public String mo9401a() {
        return this.f8314k;
    }

    @Deprecated
    /* renamed from: b */
    public String mo9403b() {
        return this.f8316m ? this.f8317n : this.f8318o;
    }

    @Deprecated
    /* renamed from: c */
    public String mo9404c() {
        return this.f8316m ? this.f8319p : this.f8320q;
    }

    @Deprecated
    /* renamed from: d */
    public boolean mo9405d() {
        return this.f8316m;
    }

    @Deprecated
    /* renamed from: a */
    public void mo9402a(Activity activity, C2546n nVar, Bundle bundle) {
        boolean z = true;
        boolean z2 = !this.f8316m;
        if (m10272n()) {
            m10240b(z2);
            if (this.f8325v) {
                m10268l().mo8855a("fb_like_control_did_undo_quickly", (Double) null, bundle);
            } else if (!m10229a(z2, bundle)) {
                if (z2) {
                    z = false;
                }
                m10240b(z);
                m10234b(activity, nVar, bundle);
            }
        } else {
            m10234b(activity, nVar, bundle);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public C2436g m10268l() {
        if (this.f8327x == null) {
            this.f8327x = C2436g.m9318a(C2649m.m10133f());
        }
        return this.f8327x;
    }

    /* renamed from: a */
    private boolean m10229a(boolean z, Bundle bundle) {
        if (m10272n()) {
            if (z) {
                m10244c(bundle);
                return true;
            } else if (!C2479ad.m9456a(this.f8321r)) {
                m10250d(bundle);
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m10225a(boolean z) {
        m10240b(z);
        Bundle bundle = new Bundle();
        bundle.putString("com.facebook.platform.status.ERROR_DESCRIPTION", "Unable to publish the like/unlike action");
        m10245c(this, "com.facebook.sdk.LikeActionController.DID_ERROR", bundle);
    }

    /* renamed from: b */
    private void m10240b(boolean z) {
        m10226a(z, this.f8317n, this.f8318o, this.f8319p, this.f8320q, this.f8321r);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m10226a(boolean z, String str, String str2, String str3, String str4, String str5) {
        String a = C2479ad.m9428a(str, (String) null);
        String a2 = C2479ad.m9428a(str2, (String) null);
        String a3 = C2479ad.m9428a(str3, (String) null);
        String a4 = C2479ad.m9428a(str4, (String) null);
        String a5 = C2479ad.m9428a(str5, (String) null);
        if (z != this.f8316m || !C2479ad.m9455a(a, this.f8317n) || !C2479ad.m9455a(a2, this.f8318o) || !C2479ad.m9455a(a3, this.f8319p) || !C2479ad.m9455a(a4, this.f8320q) || !C2479ad.m9455a(a5, this.f8321r)) {
            this.f8316m = z;
            this.f8317n = a;
            this.f8318o = a2;
            this.f8319p = a3;
            this.f8320q = a4;
            this.f8321r = a5;
            m10269l(this);
            m10251d(this, "com.facebook.sdk.LikeActionController.UPDATED");
        }
    }

    /* renamed from: b */
    private void m10234b(Activity activity, C2546n nVar, Bundle bundle) {
        String str;
        String str2;
        if (C2705d.m10330a()) {
            str = "fb_like_control_did_present_dialog";
        } else if (C2705d.m10331b()) {
            str = "fb_like_control_did_present_fallback_dialog";
        } else {
            m10220a("present_dialog", bundle);
            C2479ad.m9463b(f8304a, "Cannot show the Like Dialog on this device.");
            m10251d((C2670a) null, "com.facebook.sdk.LikeActionController.UPDATED");
            str = null;
        }
        if (str != null) {
            if (this.f8315l != null) {
                str2 = this.f8315l.toString();
            } else {
                str2 = C2753e.UNKNOWN.toString();
            }
            LikeContent a = new C2668a().mo9392a(this.f8314k).mo9394b(str2).mo9393a();
            if (nVar != null) {
                new C2705d(nVar).mo9428a(a);
            } else {
                new C2705d(activity).mo9428a(a);
            }
            m10235b(bundle);
            m10268l().mo8855a("fb_like_control_did_present_dialog", (Double) null, bundle);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m10233b(int i, int i2, Intent intent) {
        C2710h.m10350a(i, i2, intent, m10209a(this.f8326w));
        m10271m();
    }

    /* renamed from: a */
    private C2709g m10209a(final Bundle bundle) {
        return new C2709g(null) {
            /* renamed from: a */
            public void mo9412a(C2475a aVar, Bundle bundle) {
                String str;
                String str2;
                String str3;
                String str4;
                String f;
                if (bundle != null && bundle.containsKey("object_is_liked")) {
                    boolean z = bundle.getBoolean("object_is_liked");
                    String b = C2670a.this.f8317n;
                    String c = C2670a.this.f8318o;
                    if (bundle.containsKey("like_count_string")) {
                        str2 = bundle.getString("like_count_string");
                        str = str2;
                    } else {
                        str2 = b;
                        str = c;
                    }
                    String d = C2670a.this.f8319p;
                    String e = C2670a.this.f8320q;
                    if (bundle.containsKey("social_sentence")) {
                        str4 = bundle.getString("social_sentence");
                        str3 = str4;
                    } else {
                        str4 = d;
                        str3 = e;
                    }
                    if (bundle.containsKey("object_is_liked")) {
                        f = bundle.getString("unlike_token");
                    } else {
                        f = C2670a.this.f8321r;
                    }
                    String str5 = f;
                    Bundle bundle2 = bundle == null ? new Bundle() : bundle;
                    bundle2.putString("call_id", aVar.mo8920b().toString());
                    C2670a.this.m10268l().mo8855a("fb_like_control_dialog_did_succeed", (Double) null, bundle2);
                    C2670a.this.m10226a(z, str2, str, str4, str3, str5);
                }
            }

            /* renamed from: a */
            public void mo9413a(C2475a aVar, C2579j jVar) {
                C2563u.m9722a(C2757u.REQUESTS, C2670a.f8304a, "Like Dialog failed with error : %s", jVar);
                Bundle bundle = bundle == null ? new Bundle() : bundle;
                bundle.putString("call_id", aVar.mo8920b().toString());
                C2670a.this.m10220a("present_dialog", bundle);
                C2670a.m10245c(C2670a.this, "com.facebook.sdk.LikeActionController.DID_ERROR", C2566x.m9744a(jVar));
            }

            /* renamed from: a */
            public void mo9411a(C2475a aVar) {
                mo9413a(aVar, (C2579j) new C2581l());
            }
        };
    }

    /* renamed from: b */
    private void m10235b(Bundle bundle) {
        m10255e(this.f8314k);
        this.f8326w = bundle;
        m10269l(this);
    }

    /* renamed from: m */
    private void m10271m() {
        this.f8326w = null;
        m10255e((String) null);
    }

    /* renamed from: e */
    private static void m10255e(String str) {
        f8310g = str;
        C2649m.m10133f().getSharedPreferences("com.facebook.LikeActionController.CONTROLLER_STORE_KEY", 0).edit().putString("PENDING_CONTROLLER_KEY", f8310g).apply();
    }

    /* renamed from: n */
    private boolean m10272n() {
        AccessToken a = AccessToken.m6161a();
        return !this.f8323t && this.f8322s != null && AccessToken.m6168b() && a.mo6618f() != null && a.mo6618f().contains("publish_actions");
    }

    /* renamed from: c */
    private void m10244c(final Bundle bundle) {
        this.f8325v = true;
        m10211a((C2698m) new C2698m() {
            /* renamed from: a */
            public void mo9408a() {
                if (C2479ad.m9456a(C2670a.this.f8322s)) {
                    Bundle bundle = new Bundle();
                    bundle.putString("com.facebook.platform.status.ERROR_DESCRIPTION", "Invalid Object Id");
                    C2670a.m10245c(C2670a.this, "com.facebook.sdk.LikeActionController.DID_ERROR", bundle);
                    return;
                }
                C2658q qVar = new C2658q();
                final C2696k kVar = new C2696k(C2670a.this.f8322s, C2670a.this.f8315l);
                kVar.mo9417a(qVar);
                qVar.mo9349a((C2659a) new C2659a() {
                    /* renamed from: a */
                    public void mo8876a(C2658q qVar) {
                        C2670a.this.f8325v = false;
                        if (kVar.mo9414a() != null) {
                            C2670a.this.m10225a(false);
                            return;
                        }
                        C2670a.this.f8321r = C2479ad.m9428a(kVar.f8384e, (String) null);
                        C2670a.this.f8324u = true;
                        C2670a.this.m10268l().mo8855a("fb_like_control_did_like", (Double) null, bundle);
                        C2670a.this.m10254e(bundle);
                    }
                });
                qVar.mo9363h();
            }
        });
    }

    /* renamed from: d */
    private void m10250d(final Bundle bundle) {
        this.f8325v = true;
        C2658q qVar = new C2658q();
        final C2697l lVar = new C2697l(this.f8321r);
        lVar.mo9417a(qVar);
        qVar.mo9349a((C2659a) new C2659a() {
            /* renamed from: a */
            public void mo8876a(C2658q qVar) {
                C2670a.this.f8325v = false;
                if (lVar.mo9414a() != null) {
                    C2670a.this.m10225a(true);
                    return;
                }
                C2670a.this.f8321r = null;
                C2670a.this.f8324u = false;
                C2670a.this.m10268l().mo8855a("fb_like_control_did_unlike", (Double) null, bundle);
                C2670a.this.m10254e(bundle);
            }
        });
        qVar.mo9363h();
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public void m10273o() {
        if (!AccessToken.m6168b()) {
            m10274p();
        } else {
            m10211a((C2698m) new C2698m() {
                /* renamed from: a */
                public void mo9408a() {
                    final C2694i iVar;
                    if (C26794.f8347a[C2670a.this.f8315l.ordinal()] != 1) {
                        iVar = new C2691f(C2670a.this.f8322s, C2670a.this.f8315l);
                    } else {
                        iVar = new C2693h(C2670a.this.f8322s);
                    }
                    final C2689d dVar = new C2689d(C2670a.this.f8322s, C2670a.this.f8315l);
                    C2658q qVar = new C2658q();
                    iVar.mo9417a(qVar);
                    dVar.mo9417a(qVar);
                    qVar.mo9349a((C2659a) new C2659a() {
                        /* renamed from: a */
                        public void mo8876a(C2658q qVar) {
                            if (iVar.mo9414a() == null && dVar.mo9414a() == null) {
                                C2670a.this.m10226a(iVar.mo9420b(), dVar.f8363e, dVar.f8364f, dVar.f8365g, dVar.f8366h, iVar.mo9421c());
                                return;
                            }
                            C2563u.m9722a(C2757u.REQUESTS, C2670a.f8304a, "Unable to refresh like state for id: '%s'", C2670a.this.f8314k);
                        }
                    });
                    qVar.mo9363h();
                }
            });
        }
    }

    /* renamed from: p */
    private void m10274p() {
        C2706e eVar = new C2706e(C2649m.m10133f(), C2649m.m10137j(), this.f8314k);
        if (eVar.mo9085a()) {
            eVar.mo9084a((C2577a) new C2577a() {
                /* renamed from: a */
                public void mo9090a(Bundle bundle) {
                    String b;
                    String c;
                    String d;
                    String e;
                    String f;
                    if (bundle != null && bundle.containsKey("com.facebook.platform.extra.OBJECT_IS_LIKED")) {
                        boolean z = bundle.getBoolean("com.facebook.platform.extra.OBJECT_IS_LIKED");
                        if (bundle.containsKey("com.facebook.platform.extra.LIKE_COUNT_STRING_WITH_LIKE")) {
                            b = bundle.getString("com.facebook.platform.extra.LIKE_COUNT_STRING_WITH_LIKE");
                        } else {
                            b = C2670a.this.f8317n;
                        }
                        String str = b;
                        if (bundle.containsKey("com.facebook.platform.extra.LIKE_COUNT_STRING_WITHOUT_LIKE")) {
                            c = bundle.getString("com.facebook.platform.extra.LIKE_COUNT_STRING_WITHOUT_LIKE");
                        } else {
                            c = C2670a.this.f8318o;
                        }
                        String str2 = c;
                        if (bundle.containsKey("com.facebook.platform.extra.SOCIAL_SENTENCE_WITH_LIKE")) {
                            d = bundle.getString("com.facebook.platform.extra.SOCIAL_SENTENCE_WITH_LIKE");
                        } else {
                            d = C2670a.this.f8319p;
                        }
                        String str3 = d;
                        if (bundle.containsKey("com.facebook.platform.extra.SOCIAL_SENTENCE_WITHOUT_LIKE")) {
                            e = bundle.getString("com.facebook.platform.extra.SOCIAL_SENTENCE_WITHOUT_LIKE");
                        } else {
                            e = C2670a.this.f8320q;
                        }
                        String str4 = e;
                        if (bundle.containsKey("com.facebook.platform.extra.UNLIKE_TOKEN")) {
                            f = bundle.getString("com.facebook.platform.extra.UNLIKE_TOKEN");
                        } else {
                            f = C2670a.this.f8321r;
                        }
                        C2670a.this.m10226a(z, str, str2, str3, str4, f);
                    }
                }
            });
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public void m10254e(Bundle bundle) {
        if (this.f8316m != this.f8324u && !m10229a(this.f8316m, bundle)) {
            m10225a(!this.f8316m);
        }
    }

    /* renamed from: a */
    private void m10211a(final C2698m mVar) {
        if (!C2479ad.m9456a(this.f8322s)) {
            if (mVar != null) {
                mVar.mo9408a();
            }
            return;
        }
        final C2690e eVar = new C2690e(this.f8314k, this.f8315l);
        final C2692g gVar = new C2692g(this.f8314k, this.f8315l);
        C2658q qVar = new C2658q();
        eVar.mo9417a(qVar);
        gVar.mo9417a(qVar);
        qVar.mo9349a((C2659a) new C2659a() {
            /* renamed from: a */
            public void mo8876a(C2658q qVar) {
                FacebookRequestError facebookRequestError;
                C2670a.this.f8322s = eVar.f8368e;
                if (C2479ad.m9456a(C2670a.this.f8322s)) {
                    C2670a.this.f8322s = gVar.f8375e;
                    C2670a.this.f8323t = gVar.f8376f;
                }
                if (C2479ad.m9456a(C2670a.this.f8322s)) {
                    C2563u.m9722a(C2757u.DEVELOPER_ERRORS, C2670a.f8304a, "Unable to verify the FB id for '%s'. Verify that it is a valid FB object or page", C2670a.this.f8314k);
                    C2670a aVar = C2670a.this;
                    String str = "get_verified_id";
                    if (gVar.mo9414a() != null) {
                        facebookRequestError = gVar.mo9414a();
                    } else {
                        facebookRequestError = eVar.mo9414a();
                    }
                    aVar.m10221a(str, facebookRequestError);
                }
                if (mVar != null) {
                    mVar.mo9408a();
                }
            }
        });
        qVar.mo9363h();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m10220a(String str, Bundle bundle) {
        Bundle bundle2 = new Bundle(bundle);
        bundle2.putString("object_id", this.f8314k);
        bundle2.putString("object_type", this.f8315l.toString());
        bundle2.putString("current_action", str);
        m10268l().mo8855a("fb_like_control_error", (Double) null, bundle2);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m10221a(String str, FacebookRequestError facebookRequestError) {
        Bundle bundle = new Bundle();
        if (facebookRequestError != null) {
            JSONObject f = facebookRequestError.mo6662f();
            if (f != null) {
                bundle.putString("error", f.toString());
            }
        }
        m10220a(str, bundle);
    }
}
