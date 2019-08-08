package com.google.android.gms.internal.ads;

import com.google.android.exoplayer2.C2793C;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.Charset;
import org.json.JSONException;
import org.json.JSONObject;

@C3718cm
public final class baw {

    /* renamed from: a */
    public static final bav<JSONObject> f12519a = new bay();

    /* renamed from: b */
    private static final Charset f12520b = Charset.forName(C2793C.UTF8_NAME);

    /* renamed from: c */
    private static final bat<InputStream> f12521c = bax.f12522a;

    /* renamed from: a */
    static final /* synthetic */ InputStream m15894a(JSONObject jSONObject) throws JSONException {
        return new ByteArrayInputStream(jSONObject.toString().getBytes(f12520b));
    }
}
