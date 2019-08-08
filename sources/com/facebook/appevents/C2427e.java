package com.facebook.appevents;

import android.content.Intent;
import android.os.Bundle;
import android.support.p017v4.content.C0362f;
import android.util.Log;
import com.facebook.AccessToken;
import com.facebook.C2649m;
import com.facebook.C2661r;
import com.facebook.C2757u;
import com.facebook.FacebookRequestError;
import com.facebook.GraphRequest;
import com.facebook.GraphRequest.C1503b;
import com.facebook.appevents.C2436g.C2439a;
import com.facebook.internal.C2527k;
import com.facebook.internal.C2529l;
import com.facebook.internal.C2563u;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.appevents.e */
/* compiled from: AppEventQueue */
class C2427e {

    /* renamed from: a */
    private static final String f7685a = "com.facebook.appevents.e";
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static volatile C2426d f7686b = new C2426d();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final ScheduledExecutorService f7687c = Executors.newSingleThreadScheduledExecutor();
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static ScheduledFuture f7688d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static final Runnable f7689e = new Runnable() {
        public void run() {
            C2427e.f7688d = null;
            if (C2436g.m9317a() != C2439a.EXPLICIT_ONLY) {
                C2427e.m9307b(C2440h.TIMER);
            }
        }
    };

    C2427e() {
    }

    /* renamed from: a */
    public static void m9301a() {
        f7687c.execute(new Runnable() {
            public void run() {
                C2434f.m9315a(C2427e.f7686b);
                C2427e.f7686b = new C2426d();
            }
        });
    }

    /* renamed from: a */
    public static void m9304a(final C2440h hVar) {
        f7687c.execute(new Runnable() {
            public void run() {
                C2427e.m9307b(hVar);
            }
        });
    }

    /* renamed from: a */
    public static void m9303a(final C2382a aVar, final C2422c cVar) {
        f7687c.execute(new Runnable() {
            public void run() {
                C2427e.f7686b.mo8844a(aVar, cVar);
                if (C2436g.m9317a() != C2439a.EXPLICIT_ONLY && C2427e.f7686b.mo8846b() > 100) {
                    C2427e.m9307b(C2440h.EVENT_THRESHOLD);
                } else if (C2427e.f7688d == null) {
                    C2427e.f7688d = C2427e.f7687c.schedule(C2427e.f7689e, 15, TimeUnit.SECONDS);
                }
            }
        });
    }

    /* renamed from: b */
    public static Set<C2382a> m9305b() {
        return f7686b.mo8843a();
    }

    /* renamed from: b */
    static void m9307b(C2440h hVar) {
        f7686b.mo8845a(C2434f.m9313a());
        try {
            C2442j a = m9299a(hVar, f7686b);
            if (a != null) {
                Intent intent = new Intent("com.facebook.sdk.APP_EVENTS_FLUSHED");
                intent.putExtra("com.facebook.sdk.APP_EVENTS_NUM_EVENTS_FLUSHED", a.f7725a);
                intent.putExtra("com.facebook.sdk.APP_EVENTS_FLUSH_RESULT", a.f7726b);
                C0362f.m1362a(C2649m.m10133f()).mo1252a(intent);
            }
        } catch (Exception e) {
            Log.w(f7685a, "Caught unexpected exception while flushing app events: ", e);
        }
    }

    /* renamed from: a */
    private static C2442j m9299a(C2440h hVar, C2426d dVar) {
        C2442j jVar = new C2442j();
        boolean b = C2649m.m10128b(C2649m.m10133f());
        ArrayList<GraphRequest> arrayList = new ArrayList<>();
        for (C2382a aVar : dVar.mo8843a()) {
            GraphRequest a = m9297a(aVar, dVar.mo8842a(aVar), b, jVar);
            if (a != null) {
                arrayList.add(a);
            }
        }
        if (arrayList.size() <= 0) {
            return null;
        }
        C2563u.m9722a(C2757u.APP_EVENTS, f7685a, "Flushing %d events due to %s.", Integer.valueOf(jVar.f7725a), hVar.toString());
        for (GraphRequest i : arrayList) {
            i.mo6686i();
        }
        return jVar;
    }

    /* renamed from: a */
    private static GraphRequest m9297a(final C2382a aVar, final C2446l lVar, boolean z, final C2442j jVar) {
        String b = aVar.mo8791b();
        boolean z2 = false;
        C2527k a = C2529l.m9634a(b, false);
        final GraphRequest a2 = GraphRequest.m6207a((AccessToken) null, String.format("%s/activities", new Object[]{b}), (JSONObject) null, (C1503b) null);
        Bundle e = a2.mo6682e();
        if (e == null) {
            e = new Bundle();
        }
        e.putString("access_token", aVar.mo8790a());
        String d = C2436g.m9328d();
        if (d != null) {
            e.putString("device_token", d);
        }
        a2.mo6672a(e);
        if (a != null) {
            z2 = a.mo8995a();
        }
        int a3 = lVar.mo8865a(a2, C2649m.m10133f(), z2, z);
        if (a3 == 0) {
            return null;
        }
        jVar.f7725a += a3;
        a2.mo6673a((C1503b) new C1503b() {
            /* renamed from: a */
            public void mo6691a(C2661r rVar) {
                C2427e.m9306b(aVar, a2, rVar, lVar, jVar);
            }
        });
        return a2;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static void m9306b(final C2382a aVar, GraphRequest graphRequest, C2661r rVar, final C2446l lVar, C2442j jVar) {
        String str;
        FacebookRequestError a = rVar.mo9370a();
        String str2 = "Success";
        C2441i iVar = C2441i.SUCCESS;
        boolean z = true;
        if (a != null) {
            if (a.mo6657b() == -1) {
                str2 = "Failed: No Connectivity";
                iVar = C2441i.NO_CONNECTIVITY;
            } else {
                str2 = String.format("Failed:\n  Response: %s\n  Error %s", new Object[]{rVar.toString(), a.toString()});
                iVar = C2441i.SERVER_ERROR;
            }
        }
        if (C2649m.m10125a(C2757u.APP_EVENTS)) {
            try {
                str = new JSONArray((String) graphRequest.mo6685h()).toString(2);
            } catch (JSONException unused) {
                str = "<Can't encode events for debug logging>";
            }
            C2563u.m9722a(C2757u.APP_EVENTS, f7685a, "Flush completed\nParams: %s\n  Result: %s\n  Events JSON: %s", graphRequest.mo6671a().toString(), str2, str);
        }
        if (a == null) {
            z = false;
        }
        lVar.mo8867a(z);
        if (iVar == C2441i.NO_CONNECTIVITY) {
            C2649m.m10131d().execute(new Runnable() {
                public void run() {
                    C2434f.m9314a(aVar, lVar);
                }
            });
        }
        if (iVar != C2441i.SUCCESS && jVar.f7726b != C2441i.NO_CONNECTIVITY) {
            jVar.f7726b = iVar;
        }
    }
}
