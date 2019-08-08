package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.facebook.ads.AudienceNetworkActivity;
import com.google.android.exoplayer2.C2793C;
import com.google.android.gms.ads.internal.gmsg.C3067ae;
import java.util.Map;

final class ats implements C3067ae<Object> {

    /* renamed from: a */
    final /* synthetic */ atr f12217a;

    /* renamed from: b */
    private final /* synthetic */ C3695bq f12218b;

    ats(atr atr, C3695bq bqVar) {
        this.f12217a = atr;
        this.f12218b = bqVar;
    }

    public final void zza(Object obj, Map<String, String> map) {
        C4089qe qeVar = (C4089qe) this.f12217a.f12215a.get();
        if (qeVar == null) {
            this.f12218b.mo15209b("/loadHtml", this);
            return;
        }
        qeVar.mo15919v().mo15931a((C4125rn) new att(this, map, this.f12218b));
        String str = (String) map.get("overlayHtml");
        String str2 = (String) map.get("baseUrl");
        if (TextUtils.isEmpty(str2)) {
            qeVar.loadData(str, AudienceNetworkActivity.WEBVIEW_MIME_TYPE, C2793C.UTF8_NAME);
        } else {
            qeVar.loadDataWithBaseURL(str2, str, AudienceNetworkActivity.WEBVIEW_MIME_TYPE, C2793C.UTF8_NAME, null);
        }
    }
}
