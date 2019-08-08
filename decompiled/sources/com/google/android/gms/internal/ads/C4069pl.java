package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.C3025aw;
import com.google.android.gms.ads.internal.gmsg.C3067ae;
import java.util.Map;

@C3718cm
/* renamed from: com.google.android.gms.internal.ads.pl */
public final class C4069pl implements C3067ae<C4061pd> {
    public final /* synthetic */ void zza(Object obj, Map map) {
        C4061pd pdVar = (C4061pd) obj;
        if (((Boolean) aoq.m14620f().mo14695a(aru.f11875bu)).booleanValue()) {
            C4105qu b = pdVar.mo15799b();
            if (b == null) {
                try {
                    C4105qu quVar = new C4105qu(pdVar, Float.parseFloat((String) map.get("duration")), "1".equals(map.get("customControlsAllowed")), "1".equals(map.get("clickToExpandAllowed")));
                    pdVar.mo15797a(quVar);
                    b = quVar;
                } catch (NullPointerException | NumberFormatException e) {
                    C3900je.m17430b("Unable to parse videoMeta message.", e);
                    C3025aw.m10921i().mo15436a(e, "VideoMetaGmsgHandler.onGmsg");
                }
            }
            boolean equals = "1".equals(map.get("muted"));
            float parseFloat = Float.parseFloat((String) map.get("currentTime"));
            int parseInt = Integer.parseInt((String) map.get("playbackState"));
            if (parseInt < 0 || 3 < parseInt) {
                parseInt = 0;
            }
            String str = (String) map.get("aspectRatio");
            float parseFloat2 = TextUtils.isEmpty(str) ? 0.0f : Float.parseFloat(str);
            if (C3900je.m17428a(3)) {
                StringBuilder sb = new StringBuilder(79 + String.valueOf(str).length());
                sb.append("Video Meta GMSG: isMuted : ");
                sb.append(equals);
                sb.append(" , playbackState : ");
                sb.append(parseInt);
                sb.append(" , aspectRatio : ");
                sb.append(str);
                C3900je.m17429b(sb.toString());
            }
            b.mo15983a(parseFloat, parseInt, equals, parseFloat2);
        }
    }
}
