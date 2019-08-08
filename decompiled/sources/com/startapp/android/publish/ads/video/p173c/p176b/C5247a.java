package com.startapp.android.publish.ads.video.p173c.p176b;

import android.text.TextUtils;
import com.startapp.android.publish.ads.video.p173c.p174a.C5241c;
import com.startapp.android.publish.ads.video.p173c.p174a.C5246e;
import com.startapp.android.publish.ads.video.p173c.p174a.p175a.C5236b;
import com.startapp.common.p193a.C5518g;
import java.util.List;

/* renamed from: com.startapp.android.publish.ads.video.c.b.a */
/* compiled from: StartAppSDK */
public class C5247a {
    /* renamed from: a */
    public static C5236b m22468a(C5246e eVar, C5241c cVar) {
        C5518g.m23563a("VASTModelPostValidator", 3, "validate");
        C5236b bVar = null;
        if (!m22469a(eVar)) {
            C5518g.m23563a("VASTModelPostValidator", 3, "Validator returns: not valid (invalid model)");
            return null;
        }
        if (cVar != null) {
            C5236b a = cVar.mo19337a(eVar.mo19347b());
            if (a != null) {
                String a2 = a.mo19310a();
                if (!TextUtils.isEmpty(a2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("mediaPicker selected mediaFile with URL ");
                    sb.append(a2);
                    C5518g.m23563a("VASTModelPostValidator", 3, sb.toString());
                    bVar = a;
                }
            }
        } else {
            C5518g.m23563a("VASTModelPostValidator", 5, "mediaPicker: We don't have a compatible media file to play.");
        }
        String str = "VASTModelPostValidator";
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Validator returns: ");
        sb2.append(bVar != null ? "valid" : "not valid (no media file)");
        C5518g.m23563a(str, 3, sb2.toString());
        return bVar;
    }

    /* renamed from: a */
    public static boolean m22469a(C5246e eVar) {
        C5518g.m23563a("VASTModelPostValidator", 3, "validateModel");
        List d = eVar.mo19349d();
        boolean z = (d == null || d.size() == 0) ? false : true;
        List b = eVar.mo19347b();
        if (b != null && b.size() != 0) {
            return z;
        }
        C5518g.m23563a("VASTModelPostValidator", 3, "Validator error: mediaFile list invalid");
        return false;
    }
}
