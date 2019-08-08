package com.facebook.ads.internal.p075c;

import android.content.Context;
import android.util.Log;
import com.facebook.ads.AdSettings.IntegrationErrorMode;
import com.facebook.ads.AudienceNetworkAds;
import com.facebook.ads.internal.p074b.C1669e;
import com.facebook.ads.internal.p091r.C1795a;
import com.facebook.ads.internal.p115w.p123h.C2370a;
import com.facebook.ads.internal.p115w.p123h.C2373b;
import com.facebook.ads.internal.protocol.AdErrorType;
import java.util.HashMap;
import java.util.Locale;

/* renamed from: com.facebook.ads.internal.c.a */
public final class C1679a {

    /* renamed from: d */
    private static final HashMap<C1681a, C1681a> f5251d = new HashMap<>();

    /* renamed from: a */
    C1681a f5252a = C1681a.CREATED;

    /* renamed from: b */
    private final C1686b f5253b;

    /* renamed from: c */
    private final Context f5254c;

    /* renamed from: com.facebook.ads.internal.c.a$a */
    public enum C1681a {
        CREATED,
        LOADING,
        LOADED,
        SHOWING,
        SHOWN,
        DESTROYED,
        ERROR
    }

    static {
        f5251d.put(C1681a.CREATED, C1681a.LOADING);
        f5251d.put(C1681a.LOADING, C1681a.LOADED);
        f5251d.put(C1681a.LOADED, C1681a.SHOWING);
        f5251d.put(C1681a.SHOWING, C1681a.SHOWN);
        f5251d.put(C1681a.SHOWN, C1681a.LOADING);
        f5251d.put(C1681a.DESTROYED, C1681a.LOADING);
        f5251d.put(C1681a.ERROR, C1681a.LOADING);
    }

    C1679a(Context context, C1686b bVar) {
        this.f5254c = context;
        this.f5253b = bVar;
    }

    /* renamed from: a */
    public void mo7393a(C1681a aVar) {
        if (!C1795a.m7436ab(this.f5254c)) {
            this.f5252a = aVar;
        } else if (aVar.equals(C1681a.DESTROYED) || aVar.equals(C1681a.ERROR)) {
            this.f5252a = aVar;
        } else {
            if (!aVar.equals(f5251d.get(this.f5252a))) {
                int i = C2373b.f7509k;
                StringBuilder sb = new StringBuilder();
                sb.append("Wrong internal transition form ");
                sb.append(this.f5252a);
                sb.append(" to ");
                sb.append(aVar);
                C2370a.m9149b(this.f5254c, "api", i, new Exception(sb.toString()));
            }
            this.f5252a = aVar;
        }
    }

    /* renamed from: a */
    public boolean mo7394a(C1681a aVar, String str) {
        if (aVar.equals(f5251d.get(this.f5252a))) {
            this.f5252a = aVar;
            return false;
        } else if (!C1795a.m7436ab(this.f5254c)) {
            return false;
        } else {
            IntegrationErrorMode a = C1669e.m6978a(this.f5254c);
            String format = String.format(Locale.US, AdErrorType.INCORRECT_STATE_ERROR.getDefaultErrorMessage(), new Object[]{str, this.f5252a});
            switch (a) {
                case INTEGRATION_ERROR_CRASH_DEBUG_MODE:
                    StringBuilder sb = new StringBuilder();
                    sb.append(format);
                    sb.append(". You can change Integration Error mode by setting AdSettings.setIntegrationErrorMode()");
                    throw new IllegalStateException(sb.toString());
                case INTEGRATION_ERROR_CALLBACK_MODE:
                    this.f5253b.mo7403d();
                    this.f5253b.mo7398a(10, AdErrorType.INCORRECT_STATE_ERROR, format);
                    Log.e(AudienceNetworkAds.TAG, format);
                    C2370a.m9149b(this.f5254c, "api", C2373b.f7510l, new Exception(format));
                    return true;
                default:
                    Log.e(AudienceNetworkAds.TAG, format);
                    return true;
            }
        }
    }
}
