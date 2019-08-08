package com.startapp.android.publish.adsCommon.p182f;

import android.app.ActivityManager;
import android.app.ActivityManager.MemoryInfo;
import android.content.Context;
import com.appnext.base.p046b.C1245d;
import com.startapp.android.publish.adsCommon.Utils.C5307i;
import com.startapp.android.publish.adsCommon.p182f.C5379g.C5381a;
import com.startapp.android.publish.common.metaData.MetaData;
import com.startapp.android.publish.common.model.AdPreferences;
import com.startapp.common.p193a.C5509c;
import com.startapp.common.p193a.C5518g;

/* renamed from: com.startapp.android.publish.adsCommon.f.f */
/* compiled from: StartAppSDK */
public class C5378f {
    /* renamed from: a */
    public static void m23016a(Context context, C5376d dVar, String str, String str2, String str3) {
        m23019a(context, new C5377e(dVar, str, str2), str3, null);
    }

    /* renamed from: a */
    public static void m23017a(Context context, C5376d dVar, String str, String str2, String str3, C5381a aVar) {
        m23019a(context, new C5377e(dVar, str, str2), str3, aVar);
    }

    /* renamed from: a */
    public static void m23018a(Context context, C5377e eVar, String str) {
        m23019a(context, eVar, str, null);
    }

    /* renamed from: a */
    public static void m23019a(Context context, C5377e eVar, String str, C5381a aVar) {
        if (!MetaData.getInstance().getAnalyticsConfig().mo19871c()) {
            eVar.mo19895e(str);
            eVar.mo19891a(context);
            try {
                eVar.mo19897f(C5307i.m22680b(context));
                MemoryInfo memoryInfo = new MemoryInfo();
                ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
                eVar.mo19901h(Long.toString(memoryInfo.availMem / C1245d.f3948iQ));
                Long a = C5509c.m23501a(memoryInfo);
                if (a != null) {
                    eVar.mo19899g(Long.toString((a.longValue() - memoryInfo.availMem) / C1245d.f3948iQ));
                }
            } catch (Throwable th) {
                C5518g.m23564a("InfoEventsManager", 6, "Error filling infoEvent", th);
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Sending ");
            sb.append(eVar);
            C5518g.m23563a("InfoEventsManager", 3, sb.toString());
            new C5379g(context, new AdPreferences(), eVar, aVar).mo19910a();
        }
    }
}
