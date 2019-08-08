package com.facebook.login;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.support.p017v4.app.Fragment;
import com.facebook.AccessToken;
import com.facebook.C2468e;
import com.facebook.C2470f;
import com.facebook.C2473h;
import com.facebook.C2579j;
import com.facebook.C2649m;
import com.facebook.FacebookActivity;
import com.facebook.Profile;
import com.facebook.internal.C2484ae;
import com.facebook.internal.C2512d;
import com.facebook.internal.C2512d.C2513a;
import com.facebook.internal.C2512d.C2514b;
import com.facebook.internal.C2546n;
import com.facebook.login.LoginClient.Request;
import com.facebook.login.LoginClient.Result;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

/* renamed from: com.facebook.login.g */
/* compiled from: LoginManager */
public class C2614g {

    /* renamed from: a */
    private static final Set<String> f8151a = m10015a();

    /* renamed from: b */
    private static volatile C2614g f8152b;

    /* renamed from: c */
    private C2609d f8153c = C2609d.NATIVE_WITH_FALLBACK;

    /* renamed from: d */
    private C2606a f8154d = C2606a.FRIENDS;

    /* renamed from: e */
    private final SharedPreferences f8155e;

    /* renamed from: f */
    private String f8156f = "rerequest";

    /* renamed from: com.facebook.login.g$a */
    /* compiled from: LoginManager */
    private static class C2618a implements C2630j {

        /* renamed from: a */
        private final Activity f8160a;

        C2618a(Activity activity) {
            C2484ae.m9489a((Object) activity, "activity");
            this.f8160a = activity;
        }

        /* renamed from: a */
        public void mo9258a(Intent intent, int i) {
            this.f8160a.startActivityForResult(intent, i);
        }

        /* renamed from: a */
        public Activity mo9257a() {
            return this.f8160a;
        }
    }

    /* renamed from: com.facebook.login.g$b */
    /* compiled from: LoginManager */
    private static class C2619b implements C2630j {

        /* renamed from: a */
        private final C2546n f8161a;

        C2619b(C2546n nVar) {
            C2484ae.m9489a((Object) nVar, "fragment");
            this.f8161a = nVar;
        }

        /* renamed from: a */
        public void mo9258a(Intent intent, int i) {
            this.f8161a.mo9046a(intent, i);
        }

        /* renamed from: a */
        public Activity mo9257a() {
            return this.f8161a.mo9048c();
        }
    }

    /* renamed from: com.facebook.login.g$c */
    /* compiled from: LoginManager */
    private static class C2620c {

        /* renamed from: a */
        private static C2613f f8162a;

        /* access modifiers changed from: private */
        /* renamed from: b */
        public static synchronized C2613f m10051b(Context context) {
            synchronized (C2620c.class) {
                if (context == null) {
                    context = C2649m.m10133f();
                }
                if (context == null) {
                    return null;
                }
                if (f8162a == null) {
                    f8162a = new C2613f(context, C2649m.m10137j());
                }
                C2613f fVar = f8162a;
                return fVar;
            }
        }
    }

    C2614g() {
        C2484ae.m9487a();
        this.f8155e = C2649m.m10133f().getSharedPreferences("com.facebook.loginManager", 0);
    }

    /* renamed from: c */
    public static C2614g m10027c() {
        if (f8152b == null) {
            synchronized (C2614g.class) {
                if (f8152b == null) {
                    f8152b = new C2614g();
                }
            }
        }
        return f8152b;
    }

    /* renamed from: a */
    public void mo9250a(C2468e eVar, final C2473h<C2621h> hVar) {
        if (!(eVar instanceof C2512d)) {
            throw new C2579j("Unexpected CallbackManager, please use the provided Factory.");
        }
        ((C2512d) eVar).mo8987b(C2514b.Login.mo8989a(), new C2513a() {
            /* renamed from: a */
            public boolean mo8988a(int i, Intent intent) {
                return C2614g.this.mo9252a(i, intent, hVar);
            }
        });
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo9251a(int i, Intent intent) {
        return mo9252a(i, intent, null);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo9252a(int i, Intent intent, C2473h<C2621h> hVar) {
        Map map;
        C2600a aVar;
        boolean z;
        AccessToken accessToken;
        Request request;
        Request request2;
        Map map2;
        AccessToken accessToken2;
        int i2 = i;
        Intent intent2 = intent;
        C2600a aVar2 = C2600a.ERROR;
        C2579j jVar = null;
        boolean z2 = false;
        if (intent2 != null) {
            Result result = (Result) intent2.getParcelableExtra("com.facebook.LoginFragment:Result");
            if (result != null) {
                Request request3 = result.f8104e;
                C2600a aVar3 = result.f8100a;
                if (i2 != -1) {
                    if (i2 == 0) {
                        z2 = true;
                    }
                    accessToken2 = null;
                } else if (result.f8100a == C2600a.SUCCESS) {
                    accessToken2 = result.f8101b;
                } else {
                    jVar = new C2470f(result.f8102c);
                    accessToken2 = null;
                }
                map2 = result.f8105f;
                C2600a aVar4 = aVar3;
                request2 = request3;
                aVar2 = aVar4;
            } else {
                accessToken2 = null;
                map2 = null;
                request2 = null;
            }
            map = map2;
            aVar = aVar2;
            z = z2;
            Request request4 = request2;
            accessToken = accessToken2;
            request = request4;
        } else if (i2 == 0) {
            aVar = C2600a.CANCEL;
            z = true;
            request = null;
            accessToken = null;
            map = null;
        } else {
            aVar = aVar2;
            request = null;
            accessToken = null;
            map = null;
            z = false;
        }
        if (jVar == null && accessToken == null && !z) {
            jVar = new C2579j("Unexpected call to LoginManager.onActivityResult");
        }
        m10017a(null, aVar, map, jVar, true, request);
        m10018a(accessToken, request, jVar, z, hVar);
        return true;
    }

    /* renamed from: a */
    public C2614g mo9245a(C2609d dVar) {
        this.f8153c = dVar;
        return this;
    }

    /* renamed from: a */
    public C2614g mo9244a(C2606a aVar) {
        this.f8154d = aVar;
        return this;
    }

    /* renamed from: a */
    public C2614g mo9246a(String str) {
        this.f8156f = str;
        return this;
    }

    /* renamed from: d */
    public void mo9256d() {
        AccessToken.m6165a((AccessToken) null);
        Profile.m6289a(null);
        m10021a(false);
    }

    /* renamed from: a */
    public void mo9249a(Fragment fragment, Collection<String> collection) {
        m10019a(new C2546n(fragment), collection);
    }

    /* renamed from: a */
    public void mo9248a(android.app.Fragment fragment, Collection<String> collection) {
        m10019a(new C2546n(fragment), collection);
    }

    /* renamed from: a */
    private void m10019a(C2546n nVar, Collection<String> collection) {
        m10024b(collection);
        m10020a((C2630j) new C2619b(nVar), mo9225a(collection));
    }

    /* renamed from: a */
    public void mo9247a(Activity activity, Collection<String> collection) {
        m10024b(collection);
        m10020a((C2630j) new C2618a(activity), mo9225a(collection));
    }

    /* renamed from: b */
    public void mo9255b(Fragment fragment, Collection<String> collection) {
        m10023b(new C2546n(fragment), collection);
    }

    /* renamed from: b */
    public void mo9254b(android.app.Fragment fragment, Collection<String> collection) {
        m10023b(new C2546n(fragment), collection);
    }

    /* renamed from: b */
    private void m10023b(C2546n nVar, Collection<String> collection) {
        m10028c(collection);
        m10020a((C2630j) new C2619b(nVar), mo9225a(collection));
    }

    /* renamed from: b */
    public void mo9253b(Activity activity, Collection<String> collection) {
        m10028c(collection);
        m10020a((C2630j) new C2618a(activity), mo9225a(collection));
    }

    /* renamed from: b */
    private void m10024b(Collection<String> collection) {
        if (collection != null) {
            for (String str : collection) {
                if (m10026b(str)) {
                    throw new C2579j(String.format("Cannot pass a publish or manage permission (%s) to a request for read authorization", new Object[]{str}));
                }
            }
        }
    }

    /* renamed from: c */
    private void m10028c(Collection<String> collection) {
        if (collection != null) {
            for (String str : collection) {
                if (!m10026b(str)) {
                    throw new C2579j(String.format("Cannot pass a read permission (%s) to a request for publish authorization", new Object[]{str}));
                }
            }
        }
    }

    /* renamed from: b */
    static boolean m10026b(String str) {
        return str != null && (str.startsWith("publish") || str.startsWith("manage") || f8151a.contains(str));
    }

    /* renamed from: a */
    private static Set<String> m10015a() {
        return Collections.unmodifiableSet(new HashSet<String>() {
            {
                add("ads_management");
                add("create_event");
                add("rsvp_event");
            }
        });
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Request mo9225a(Collection<String> collection) {
        Request request = new Request(this.f8153c, Collections.unmodifiableSet(collection != null ? new HashSet(collection) : new HashSet()), this.f8154d, this.f8156f, C2649m.m10137j(), UUID.randomUUID().toString());
        request.mo9181a(AccessToken.m6168b());
        return request;
    }

    /* renamed from: a */
    private void m10020a(C2630j jVar, Request request) throws C2579j {
        m10016a((Context) jVar.mo9257a(), request);
        C2512d.m9586a(C2514b.Login.mo8989a(), new C2513a() {
            /* renamed from: a */
            public boolean mo8988a(int i, Intent intent) {
                return C2614g.this.mo9251a(i, intent);
            }
        });
        if (!m10025b(jVar, request)) {
            C2579j jVar2 = new C2579j("Log in attempt failed: FacebookActivity could not be started. Please make sure you added FacebookActivity to the AndroidManifest.");
            m10017a(jVar.mo9257a(), C2600a.ERROR, null, jVar2, false, request);
            throw jVar2;
        }
    }

    /* renamed from: a */
    private void m10016a(Context context, Request request) {
        C2613f a = C2620c.m10051b(context);
        if (a != null && request != null) {
            a.mo9236a(request);
        }
    }

    /* renamed from: a */
    private void m10017a(Context context, C2600a aVar, Map<String, String> map, Exception exc, boolean z, Request request) {
        C2613f a = C2620c.m10051b(context);
        if (a != null) {
            if (request == null) {
                a.mo9242c("fb_mobile_login_complete", "Unexpected call to logCompleteLogin with null pendingAuthorizationRequest.");
            } else {
                HashMap hashMap = new HashMap();
                hashMap.put("try_login_activity", z ? "1" : "0");
                a.mo9240a(request.mo9186e(), hashMap, aVar, map, exc);
            }
        }
    }

    /* renamed from: b */
    private boolean m10025b(C2630j jVar, Request request) {
        Intent a = mo9243a(request);
        if (!m10022a(a)) {
            return false;
        }
        try {
            jVar.mo9258a(a, LoginClient.m9884d());
            return true;
        } catch (ActivityNotFoundException unused) {
            return false;
        }
    }

    /* renamed from: a */
    private boolean m10022a(Intent intent) {
        if (C2649m.m10133f().getPackageManager().resolveActivity(intent, 0) != null) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Intent mo9243a(Request request) {
        Intent intent = new Intent();
        intent.setClass(C2649m.m10133f(), FacebookActivity.class);
        intent.setAction(request.mo9182b().toString());
        Bundle bundle = new Bundle();
        bundle.putParcelable("request", request);
        intent.putExtra("com.facebook.LoginFragment:Request", bundle);
        return intent;
    }

    /* renamed from: a */
    static C2621h m10014a(Request request, AccessToken accessToken) {
        Set a = request.mo9178a();
        HashSet hashSet = new HashSet(accessToken.mo6618f());
        if (request.mo9187f()) {
            hashSet.retainAll(a);
        }
        HashSet hashSet2 = new HashSet(a);
        hashSet2.removeAll(hashSet);
        return new C2621h(accessToken, hashSet, hashSet2);
    }

    /* renamed from: a */
    private void m10018a(AccessToken accessToken, Request request, C2579j jVar, boolean z, C2473h<C2621h> hVar) {
        if (accessToken != null) {
            AccessToken.m6165a(accessToken);
            Profile.m6290b();
        }
        if (hVar != null) {
            C2621h a = accessToken != null ? m10014a(request, accessToken) : null;
            if (z || (a != null && a.mo9260b().size() == 0)) {
                hVar.mo8906a();
            } else if (jVar != null) {
                hVar.mo8907a(jVar);
            } else if (accessToken != null) {
                m10021a(true);
                hVar.mo8908a(a);
            }
        }
    }

    /* renamed from: a */
    private void m10021a(boolean z) {
        Editor edit = this.f8155e.edit();
        edit.putBoolean("express_login_allowed", z);
        edit.apply();
    }
}
