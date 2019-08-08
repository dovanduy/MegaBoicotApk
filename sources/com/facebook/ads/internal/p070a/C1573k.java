package com.facebook.ads.internal.p070a;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.appnext.base.p046b.C1245d;
import com.facebook.ads.internal.p092s.C1802c;
import com.facebook.ads.internal.p092s.C1806f;
import java.util.Map;

/* renamed from: com.facebook.ads.internal.a.k */
class C1573k extends C1563b {

    /* renamed from: d */
    private static final String f4829d = "k";

    /* renamed from: e */
    private final Uri f4830e;

    /* renamed from: f */
    private final Map<String, String> f4831f;

    C1573k(Context context, C1802c cVar, String str, Uri uri, Map<String, String> map) {
        super(context, cVar, str);
        this.f4830e = uri;
        this.f4831f = map;
    }

    /* renamed from: a */
    public void mo7058a() {
        C1806f fVar = C1806f.IMMEDIATE;
        String queryParameter = this.f4830e.getQueryParameter("priority");
        if (!TextUtils.isEmpty(queryParameter)) {
            try {
                fVar = C1806f.values()[Integer.valueOf(queryParameter).intValue()];
            } catch (Exception unused) {
            }
        }
        this.f4806b.mo7687a(this.f4807c, this.f4831f, this.f4830e.getQueryParameter(C1245d.f3961jd), fVar);
    }
}
