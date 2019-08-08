package com.startapp.android.publish.common.metaData;

import android.content.Context;
import com.startapp.android.publish.adsCommon.Utils.C5297b;
import com.startapp.android.publish.adsCommon.p182f.C5374c;
import com.startapp.android.publish.adsCommon.p182f.C5376d;
import com.startapp.android.publish.adsCommon.p182f.C5378f;
import com.startapp.common.C5540c;
import com.startapp.common.C5549d;
import com.startapp.common.p193a.C5518g;
import com.startapp.common.p194b.p195a.C5533b;
import com.startapp.common.p194b.p195a.C5533b.C5534a;
import com.startapp.common.p194b.p195a.C5533b.C5535b;
import java.util.Map;

/* renamed from: com.startapp.android.publish.common.metaData.e */
/* compiled from: StartAppSDK */
public class C5482e implements C5533b {
    /* renamed from: a */
    public void mo19861a(final Context context, int i, Map<String, String> map, final C5535b bVar) {
        C5518g.m23563a("PeriodicInfoEvent", 3, "PeriodicInfoEvent execute");
        try {
            C5540c.m23648b(context);
            MetaData.init(context);
            MetaData.getInstance().setReady(true);
            if (MetaData.getInstance().isPeriodicInfoEventEnabled()) {
                new C5374c(context, true, new C5549d() {
                    /* renamed from: a */
                    public void mo19942a(Object obj) {
                        if (bVar != null) {
                            C5297b.m22621d(context);
                            bVar.mo20155a(C5534a.SUCCESS);
                        }
                    }
                }).mo19886a();
            } else if (bVar != null) {
                C5297b.m22621d(context);
                bVar.mo20155a(C5534a.SUCCESS);
            }
        } catch (Exception e) {
            C5378f.m23016a(context, C5376d.EXCEPTION, "PeriodicInfoEvent.execute", e.getMessage(), "");
        }
    }
}
