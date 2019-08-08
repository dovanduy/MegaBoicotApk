package com.facebook.ads.internal.p070a;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import com.facebook.ads.internal.p092s.C1802c;
import com.facebook.ads.internal.p115w.p120e.C2361g;
import java.util.Map;

/* renamed from: com.facebook.ads.internal.a.j */
public class C1572j extends C1570h {

    /* renamed from: e */
    private static final String f4826e = "j";

    /* renamed from: f */
    private final Uri f4827f;

    /* renamed from: g */
    private final Map<String, String> f4828g;

    C1572j(Context context, C1802c cVar, String str, Uri uri, Map<String, String> map, C1575m mVar) {
        super(context, cVar, str, mVar);
        this.f4827f = uri;
        this.f4828g = map;
    }

    /* renamed from: b */
    public C1562a mo7059b() {
        try {
            C2361g.m9129a(new C2361g(), this.f4805a, Uri.parse(this.f4827f.getQueryParameter("link")), this.f4807c);
            return null;
        } catch (Exception e) {
            String str = f4826e;
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to open link url: ");
            sb.append(this.f4827f.toString());
            Log.d(str, sb.toString(), e);
            return C1562a.CANNOT_OPEN;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public void mo7065e() {
        mo7069a(this.f4828g, mo7059b());
    }
}
