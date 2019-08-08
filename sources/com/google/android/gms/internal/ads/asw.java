package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.gmsg.C3067ae;
import java.util.Map;

final class asw implements C3067ae<Object> {

    /* renamed from: a */
    private final /* synthetic */ asv f12117a;

    asw(asv asv) {
        this.f12117a = asv;
    }

    public final void zza(Object obj, Map<String, String> map) {
        try {
            this.f12117a.f12112b = Long.valueOf(Long.parseLong((String) map.get("timestamp")));
        } catch (NumberFormatException unused) {
            C3900je.m17431c("Failed to call parse unconfirmedClickTimestamp.");
        }
        this.f12117a.f12111a = (String) map.get(TtmlNode.ATTR_ID);
        String str = (String) map.get("asset_id");
        if (this.f12117a.f12115e == null) {
            C3900je.m17429b("Received unconfirmed click but UnconfirmedClickListener is null.");
            return;
        }
        try {
            this.f12117a.f12115e.mo14919a(str);
        } catch (RemoteException e) {
            C3987mk.m17434d("#007 Could not call remote method.", e);
        }
    }
}
