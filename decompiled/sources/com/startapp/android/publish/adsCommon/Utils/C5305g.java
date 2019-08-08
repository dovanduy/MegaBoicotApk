package com.startapp.android.publish.adsCommon.Utils;

import android.content.Context;
import com.startapp.android.publish.adsCommon.p177a.C5315b;
import com.startapp.android.publish.common.metaData.MetaData;
import com.startapp.android.publish.common.metaData.MetaDataRequest.C5474a;
import com.startapp.android.publish.common.model.AdPreferences;
import com.startapp.common.p193a.C5518g;
import java.util.UUID;

/* renamed from: com.startapp.android.publish.adsCommon.Utils.g */
/* compiled from: StartAppSDK */
public class C5305g {

    /* renamed from: a */
    private static C5305g f17037a = new C5305g();

    /* renamed from: b */
    private String f17038b = "";

    /* renamed from: c */
    private long f17039c = 0;

    /* renamed from: d */
    private C5474a f17040d = C5474a.LAUNCH;

    /* renamed from: a */
    public String mo19627a() {
        return this.f17038b;
    }

    /* renamed from: b */
    public long mo19629b() {
        return this.f17039c;
    }

    /* renamed from: c */
    public C5474a mo19630c() {
        return this.f17040d;
    }

    /* renamed from: a */
    public synchronized void mo19628a(Context context, C5474a aVar) {
        this.f17038b = UUID.randomUUID().toString();
        this.f17039c = System.currentTimeMillis();
        this.f17040d = aVar;
        StringBuilder sb = new StringBuilder();
        sb.append("Starting new session: reason=");
        sb.append(aVar);
        sb.append(" sessionId=");
        sb.append(this.f17038b);
        C5518g.m23563a("SessionManager", 3, sb.toString());
        if (!C5307i.m22673a()) {
            C5315b.m22698a().mo19650b();
        }
        AdPreferences adPreferences = new AdPreferences();
        C5307i.m22664a(context, adPreferences);
        MetaData.getInstance().loadFromServer(context, adPreferences, aVar, false, null, true);
    }

    /* renamed from: d */
    public static C5305g m22636d() {
        return f17037a;
    }
}
