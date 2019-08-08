package com.startapp.android.publish.common.metaData;

import android.content.Context;
import com.startapp.android.publish.adsCommon.AdsConstants;
import com.startapp.android.publish.adsCommon.AdsConstants.ServiceApiType;
import com.startapp.android.publish.adsCommon.C5414k;
import com.startapp.android.publish.adsCommon.C5416l;
import com.startapp.android.publish.adsCommon.Utils.C5297b;
import com.startapp.android.publish.adsCommon.Utils.C5307i;
import com.startapp.android.publish.adsCommon.p182f.C5376d;
import com.startapp.android.publish.adsCommon.p182f.C5378f;
import com.startapp.android.publish.adsCommon.p191k.C5415a;
import com.startapp.android.publish.common.metaData.MetaDataRequest.C5474a;
import com.startapp.android.publish.common.model.AdPreferences;
import com.startapp.common.C5540c;
import com.startapp.common.p193a.C5518g;
import com.startapp.common.p194b.p195a.C5533b;
import com.startapp.common.p194b.p195a.C5533b.C5534a;
import com.startapp.common.p194b.p195a.C5533b.C5535b;
import java.util.Map;

/* renamed from: com.startapp.android.publish.common.metaData.f */
/* compiled from: StartAppSDK */
public class C5484f implements C5533b {
    /* renamed from: a */
    public void mo19861a(Context context, int i, Map<String, String> map, C5535b bVar) {
        try {
            C5540c.m23648b(context);
            MetaData.init(context);
            if (MetaData.getInstance().isPeriodicMetaDataEnabled()) {
                m23399a(context, bVar);
            }
        } catch (Exception e) {
            C5378f.m23016a(context, C5376d.EXCEPTION, "PeriodicMetaData.execute", e.getMessage(), "");
        }
    }

    /* renamed from: a */
    private static void m23399a(Context context, C5535b bVar) {
        final AdPreferences adPreferences = new AdPreferences(C5414k.m23096a(context, "shared_prefs_devId", (String) null), C5414k.m23096a(context, "shared_prefs_appId", ""));
        final Context context2 = context;
        final C5535b bVar2 = bVar;
        C54851 r2 = new C5478c(context, adPreferences, C5474a.PERIODIC) {

            /* renamed from: e */
            private MetaData f17483e = null;

            /* access modifiers changed from: protected */
            /* renamed from: c */
            public Boolean mo20275c() {
                C5518g.m23561a(3, "Loading MetaData");
                try {
                    C5416l.m23122b(context2);
                    MetaDataRequest metaDataRequest = new MetaDataRequest(context2, C5474a.PERIODIC);
                    metaDataRequest.fillApplicationDetails(context2, adPreferences, false);
                    metaDataRequest.fillLocationDetails(adPreferences, context2);
                    this.f17483e = (MetaData) C5307i.m22656a(C5415a.m23105a(context2, AdsConstants.m22606a(ServiceApiType.METADATA), metaDataRequest, null).mo20491a(), MetaData.class);
                    return Boolean.TRUE;
                } catch (Exception e) {
                    C5518g.m23562a(6, "Unable to handle GetMetaData command!!!!", (Throwable) e);
                    return Boolean.FALSE;
                }
            }

            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo20273a(Boolean bool) {
                try {
                    if (!(!bool.booleanValue() || this.f17483e == null || context2 == null)) {
                        MetaData.update(context2, this.f17483e, this.f17463a);
                    }
                    C5297b.m22620c(context2);
                    if (bVar2 != null) {
                        bVar2.mo20155a(C5534a.SUCCESS);
                    }
                } catch (Exception e) {
                    C5378f.m23016a(context2, C5376d.EXCEPTION, "PeriodicMetaData.onPostExecute", e.getMessage(), "");
                }
            }
        };
        r2.mo20272a();
    }
}
