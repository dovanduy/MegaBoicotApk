package com.facebook.ads.internal.p086m;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.internal.m.b */
public class C1763b {

    /* renamed from: a */
    public String f5522a;

    /* renamed from: b */
    public String f5523b;

    /* renamed from: c */
    public String f5524c;

    /* renamed from: d */
    public Date f5525d;

    /* renamed from: e */
    public boolean f5526e;

    public C1763b(String str, String str2, String str3, Date date) {
        this.f5522a = str;
        this.f5523b = str2;
        this.f5524c = str3;
        this.f5525d = date;
        this.f5526e = (str2 == null || str3 == null) ? false : true;
    }

    public C1763b(JSONObject jSONObject) {
        this(jSONObject.optString("url"), jSONObject.optString("key"), jSONObject.optString("value"), new Date(jSONObject.optLong("expiration") * 1000));
    }

    /* renamed from: a */
    public static List<C1763b> m7312a(String str) {
        JSONArray jSONArray;
        JSONObject jSONObject;
        if (str == null) {
            return null;
        }
        try {
            jSONArray = new JSONArray(str);
        } catch (JSONException unused) {
            jSONArray = null;
        }
        if (jSONArray == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                jSONObject = jSONArray.getJSONObject(i);
            } catch (JSONException unused2) {
                jSONObject = null;
            }
            if (jSONObject != null) {
                C1763b bVar = new C1763b(jSONObject);
                if (bVar != null) {
                    arrayList.add(bVar);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public String mo7594a() {
        Date date = this.f5525d;
        if (date == null) {
            date = new Date();
            date.setTime(date.getTime() + 3600000);
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd-MMM-yyyy HH:mm:ss zzz");
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        return simpleDateFormat.format(date);
    }

    /* renamed from: b */
    public boolean mo7595b() {
        return (this.f5523b == null || this.f5524c == null || this.f5522a == null) ? false : true;
    }
}
