package com.facebook.ads.internal.p070a;

import android.content.Context;
import android.net.Uri;
import com.facebook.ads.internal.p092s.C1802c;
import java.util.Map;

/* renamed from: com.facebook.ads.internal.a.i */
public class C1571i extends C1570h {

    /* renamed from: e */
    private final Uri f4824e;

    /* renamed from: f */
    private Map<String, String> f4825f;

    C1571i(Context context, C1802c cVar, String str, Uri uri, Map<String, String> map) {
        super(context, cVar, str, null);
        this.f4824e = uri;
        this.f4825f = map;
    }

    /* renamed from: a */
    public void mo7070a(Map<String, String> map) {
        this.f4825f.putAll(map);
    }

    /* renamed from: c */
    public Uri mo7071c() {
        return Uri.parse(this.f4824e.getQueryParameter("link"));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public void mo7065e() {
        mo7069a(this.f4825f, null);
    }
}
