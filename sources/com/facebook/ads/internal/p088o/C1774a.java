package com.facebook.ads.internal.p088o;

import com.appnext.base.p046b.C1245d;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.internal.o.a */
public class C1774a {

    /* renamed from: a */
    public static String f5569a;

    /* renamed from: b */
    private String f5570b;

    /* renamed from: c */
    private Map<String, Object> f5571c;

    /* renamed from: d */
    private int f5572d;

    /* renamed from: e */
    private String f5573e;

    public C1774a(String str, Map<String, Object> map, int i, String str2) {
        this.f5570b = str;
        this.f5571c = map;
        this.f5572d = i;
        this.f5573e = str2;
    }

    /* renamed from: a */
    public static C1774a m7362a(Throwable th, String str) {
        HashMap hashMap = new HashMap();
        if (th != null) {
            hashMap.put("ex", th.getClass().getSimpleName());
            hashMap.put("ex_msg", th.getMessage());
        }
        int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        String str2 = "error";
        if (str == null) {
            str = f5569a;
        }
        return new C1774a(str2, hashMap, currentTimeMillis, str);
    }

    /* renamed from: a */
    public JSONObject mo7624a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("name", this.f5570b);
            jSONObject.put("data", new JSONObject(this.f5571c));
            jSONObject.put(C1245d.f3955iX, this.f5572d);
            jSONObject.put("request_id", this.f5573e);
            return jSONObject;
        } catch (JSONException e) {
            e.printStackTrace();
            return jSONObject;
        }
    }
}
