package com.startapp.android.publish.adsCommon.p182f;

import android.content.Context;
import com.startapp.android.publish.adsCommon.C5416l;
import com.startapp.android.publish.adsCommon.Utils.C5307i;
import com.startapp.android.publish.adsCommon.p191k.C5415a;
import com.startapp.android.publish.common.metaData.MetaData;
import com.startapp.android.publish.common.model.AdPreferences;
import com.startapp.common.C5552e;
import com.startapp.common.C5554g;
import com.startapp.common.C5554g.C5558a;
import com.startapp.common.p193a.C5518g;

/* renamed from: com.startapp.android.publish.adsCommon.f.g */
/* compiled from: StartAppSDK */
public class C5379g {

    /* renamed from: a */
    private final Context f17244a;

    /* renamed from: b */
    private final AdPreferences f17245b;

    /* renamed from: c */
    private final C5377e f17246c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C5381a f17247d;

    /* renamed from: com.startapp.android.publish.adsCommon.f.g$a */
    /* compiled from: StartAppSDK */
    public interface C5381a {
        /* renamed from: a */
        void mo19862a(boolean z);
    }

    public C5379g(Context context, AdPreferences adPreferences, C5377e eVar, C5381a aVar) {
        this.f17244a = context;
        this.f17245b = adPreferences;
        this.f17246c = eVar;
        this.f17247d = aVar;
    }

    /* renamed from: a */
    public void mo19910a() {
        C5554g.m23702a(C5558a.DEFAULT, (Runnable) new Runnable() {
            public void run() {
                boolean b = C5379g.this.mo19911b();
                if (C5379g.this.f17247d != null) {
                    C5379g.this.f17247d.mo19862a(b);
                }
            }
        });
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo19911b() {
        StringBuilder sb = new StringBuilder();
        sb.append("Sending InfoEvent ");
        sb.append(this.f17246c);
        C5518g.m23561a(3, sb.toString());
        try {
            C5307i.m22664a(this.f17244a, this.f17245b);
            try {
                C5416l.m23122b(this.f17244a);
                this.f17246c.fillLocationDetails(this.f17245b, this.f17244a);
                this.f17246c.fillApplicationDetails(this.f17244a, this.f17245b);
            } catch (Exception unused) {
            }
            try {
                C5518g.m23561a(3, "Networking InfoEvent");
                String a = MetaData.getInstance().getAnalyticsConfig().mo19869a();
                if (C5376d.PERIODIC.equals(this.f17246c.mo19894e())) {
                    a = MetaData.getInstance().getAnalyticsConfig().mo19870b();
                }
                C5415a.m23107a(this.f17244a, a, this.f17246c, null, MetaData.getInstance().getAnalyticsConfig().mo19872d(), MetaData.getInstance().getAnalyticsConfig().mo19873e());
                return true;
            } catch (C5552e e) {
                C5518g.m23562a(6, "Unable to send InfoEvent command!!!!", (Throwable) e);
                return false;
            }
        } catch (Exception e2) {
            C5518g.m23562a(6, "Unable to fill AdPreferences ", (Throwable) e2);
            return false;
        }
    }
}
