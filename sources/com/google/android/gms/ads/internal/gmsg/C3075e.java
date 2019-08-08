package com.google.android.gms.ads.internal.gmsg;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import com.appnext.base.p046b.C1248f;
import com.facebook.ads.internal.p083j.C1746e;
import com.google.android.gms.ads.internal.C3025aw;
import com.google.android.gms.ads.internal.C3050bu;
import com.google.android.gms.ads.internal.overlay.C3117m;
import com.google.android.gms.ads.internal.overlay.C3123s;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.internal.ads.C3718cm;
import com.google.android.gms.internal.ads.C3732d;
import com.google.android.gms.internal.ads.C3872id;
import com.google.android.gms.internal.ads.C3900je;
import com.google.android.gms.internal.ads.C4089qe;
import com.google.android.gms.internal.ads.C4112ra;
import com.google.android.gms.internal.ads.C4113rb;
import com.google.android.gms.internal.ads.C4117rf;
import com.google.android.gms.internal.ads.C4120ri;
import com.google.android.gms.internal.ads.C4123rl;
import com.google.android.gms.internal.ads.agw;
import com.google.android.gms.internal.ads.agx;
import com.google.android.gms.internal.ads.anw;
import com.google.android.gms.internal.ads.zzang;
import java.net.URISyntaxException;
import java.util.Map;

@C3718cm
/* renamed from: com.google.android.gms.ads.internal.gmsg.e */
public final class C3075e<T extends C4112ra & C4113rb & C4117rf & C4120ri & C4123rl> implements C3067ae<T> {

    /* renamed from: a */
    private final Context f8964a;

    /* renamed from: b */
    private final agw f8965b;

    /* renamed from: c */
    private final zzang f8966c;

    /* renamed from: d */
    private final C3123s f8967d;

    /* renamed from: e */
    private final anw f8968e;

    /* renamed from: f */
    private final C3117m f8969f;

    /* renamed from: g */
    private final C3081k f8970g;

    /* renamed from: h */
    private final C3083m f8971h;

    /* renamed from: i */
    private final C3050bu f8972i;

    /* renamed from: j */
    private final C3732d f8973j;

    /* renamed from: k */
    private final C4089qe f8974k = null;

    public C3075e(Context context, zzang zzang, agw agw, C3123s sVar, anw anw, C3081k kVar, C3083m mVar, C3117m mVar2, C3050bu buVar, C3732d dVar) {
        this.f8964a = context;
        this.f8966c = zzang;
        this.f8965b = agw;
        this.f8967d = sVar;
        this.f8968e = anw;
        this.f8970g = kVar;
        this.f8971h = mVar;
        this.f8972i = buVar;
        this.f8973j = dVar;
        this.f8969f = mVar2;
    }

    /* renamed from: a */
    static String m11081a(Context context, agw agw, String str, View view, Activity activity) {
        if (agw == null) {
            return str;
        }
        try {
            Uri parse = Uri.parse(str);
            if (agw.mo14289b(parse)) {
                parse = agw.mo14285a(parse, context, view, activity);
            }
            return parse.toString();
        } catch (agx unused) {
            return str;
        } catch (Exception e) {
            C3025aw.m10921i().mo15436a((Throwable) e, "OpenGmsgHandler.maybeAddClickSignalsToUrl");
            return str;
        }
    }

    /* renamed from: a */
    private final void m11082a(boolean z) {
        if (this.f8973j != null) {
            this.f8973j.mo15236a(z);
        }
    }

    /* renamed from: a */
    private static boolean m11083a(Map<String, String> map) {
        return "1".equals(map.get("custom_close"));
    }

    /* renamed from: b */
    private static int m11084b(Map<String, String> map) {
        String str = (String) map.get("o");
        if (str != null) {
            if (TtmlNode.TAG_P.equalsIgnoreCase(str)) {
                return C3025aw.m10919g().mo15546b();
            }
            if ("l".equalsIgnoreCase(str)) {
                return C3025aw.m10919g().mo15533a();
            }
            if ("c".equalsIgnoreCase(str)) {
                return C3025aw.m10919g().mo15549c();
            }
        }
        return -1;
    }

    public final /* synthetic */ void zza(Object obj, Map map) {
        C4112ra raVar = (C4112ra) obj;
        String a = C3872id.m16944a((String) map.get("u"), raVar.getContext());
        String str = (String) map.get("a");
        if (str == null) {
            C3900je.m17435e("Action missing from an open GMSG.");
        } else if (this.f8972i != null && !this.f8972i.mo12587b()) {
            this.f8972i.mo12586a(a);
        } else if ("expand".equalsIgnoreCase(str)) {
            if (((C4113rb) raVar).mo15923z()) {
                C3900je.m17435e("Cannot expand WebView that is already expanded.");
                return;
            }
            m11082a(false);
            ((C4117rf) raVar).mo15969a(m11083a(map), m11084b(map));
        } else if ("webapp".equalsIgnoreCase(str)) {
            m11082a(false);
            if (a != null) {
                ((C4117rf) raVar).mo15970a(m11083a(map), m11084b(map), a);
            } else {
                ((C4117rf) raVar).mo15971a(m11083a(map), m11084b(map), (String) map.get("html"), (String) map.get("baseurl"));
            }
        } else if (!"app".equalsIgnoreCase(str) || !"true".equalsIgnoreCase((String) map.get("system_browser"))) {
            m11082a(true);
            String str2 = (String) map.get("intent_url");
            Intent intent = null;
            if (!TextUtils.isEmpty(str2)) {
                try {
                    intent = Intent.parseUri(str2, 0);
                } catch (URISyntaxException e) {
                    String str3 = "Error parsing the url: ";
                    String valueOf = String.valueOf(str2);
                    C3900je.m17430b(valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3), e);
                }
            }
            if (!(intent == null || intent.getData() == null)) {
                Uri data = intent.getData();
                String uri = data.toString();
                if (!TextUtils.isEmpty(uri)) {
                    try {
                        uri = m11081a(raVar.getContext(), ((C4120ri) raVar).mo15922y(), uri, ((C4123rl) raVar).getView(), raVar.mo15801d());
                    } catch (Exception e2) {
                        C3900je.m17430b("Error occurred while adding signals.", e2);
                        C3025aw.m10921i().mo15436a((Throwable) e2, "OpenGmsgHandler.onGmsg");
                    }
                    try {
                        data = Uri.parse(uri);
                    } catch (Exception e3) {
                        String str4 = "Error parsing the uri: ";
                        String valueOf2 = String.valueOf(uri);
                        C3900je.m17430b(valueOf2.length() != 0 ? str4.concat(valueOf2) : new String(str4), e3);
                        C3025aw.m10921i().mo15436a((Throwable) e3, "OpenGmsgHandler.onGmsg");
                    }
                }
                intent.setData(data);
            }
            if (intent != null) {
                ((C4117rf) raVar).mo15968a(new zzc(intent));
                return;
            }
            if (!TextUtils.isEmpty(a)) {
                a = m11081a(raVar.getContext(), ((C4120ri) raVar).mo15922y(), a, ((C4123rl) raVar).getView(), raVar.mo15801d());
            }
            C4117rf rfVar = (C4117rf) raVar;
            zzc zzc = new zzc((String) map.get("i"), a, (String) map.get("m"), (String) map.get(TtmlNode.TAG_P), (String) map.get("c"), (String) map.get(C1248f.TAG), (String) map.get(C1746e.f5472a));
            rfVar.mo15968a(zzc);
        } else {
            m11082a(true);
            raVar.getContext();
            if (TextUtils.isEmpty(a)) {
                C3900je.m17435e("Destination url cannot be empty.");
                return;
            }
            try {
                ((C4117rf) raVar).mo15968a(new zzc(new C3076f(raVar.getContext(), ((C4120ri) raVar).mo15922y(), ((C4123rl) raVar).getView()).mo12617a(map)));
            } catch (ActivityNotFoundException e4) {
                C3900je.m17435e(e4.getMessage());
            }
        }
    }
}
