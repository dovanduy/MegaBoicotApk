package com.facebook.ads.internal.p095v.p096a;

import com.facebook.ads.internal.settings.AdInternalSettings;
import java.net.HttpURLConnection;
import java.util.List;
import java.util.Map;

/* renamed from: com.facebook.ads.internal.v.a.g */
public class C1863g implements C1874r {
    /* renamed from: a */
    private void m7832a(Map<String, List<String>> map) {
        if (map != null) {
            for (String str : map.keySet()) {
                for (String str2 : (List) map.get(str)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str);
                    sb.append(":");
                    sb.append(str2);
                    mo7870a(sb.toString());
                }
            }
        }
    }

    /* renamed from: a */
    public void mo7869a(C1870n nVar) {
        if (nVar != null) {
            mo7870a("=== HTTP Response ===");
            StringBuilder sb = new StringBuilder();
            sb.append("Receive url: ");
            sb.append(nVar.mo7887b());
            mo7870a(sb.toString());
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Status: ");
            sb2.append(nVar.mo7886a());
            mo7870a(sb2.toString());
            m7832a(nVar.mo7888c());
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Content:\n");
            sb3.append(nVar.mo7890e());
            mo7870a(sb3.toString());
        }
    }

    /* renamed from: a */
    public void mo7870a(String str) {
        System.out.println(str);
    }

    /* renamed from: a */
    public void mo7871a(HttpURLConnection httpURLConnection, Object obj) {
        mo7870a("=== HTTP Request ===");
        StringBuilder sb = new StringBuilder();
        sb.append(httpURLConnection.getRequestMethod());
        sb.append(" ");
        sb.append(httpURLConnection.getURL().toString());
        mo7870a(sb.toString());
        if (obj instanceof String) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Content: ");
            sb2.append((String) obj);
            mo7870a(sb2.toString());
        }
        m7832a(httpURLConnection.getRequestProperties());
    }

    /* renamed from: a */
    public boolean mo7872a() {
        return AdInternalSettings.isDebugBuild();
    }
}
