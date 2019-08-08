package com.facebook.ads.internal.p086m;

import android.text.TextUtils;
import com.appnext.base.p046b.C1245d;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.internal.m.a */
public class C1762a {

    /* renamed from: a */
    private final String f5518a;

    /* renamed from: b */
    private final String f5519b;

    /* renamed from: c */
    private final JSONObject f5520c;

    /* renamed from: d */
    private final Map<C1766e, List<String>> f5521d = new HashMap();

    public C1762a(String str, String str2, JSONObject jSONObject, JSONArray jSONArray) {
        this.f5518a = str;
        this.f5519b = str2;
        this.f5520c = jSONObject;
        if (jSONArray != null && jSONArray.length() != 0) {
            for (C1766e put : C1766e.values()) {
                this.f5521d.put(put, new LinkedList());
            }
            for (int i = 0; i < jSONArray.length(); i++) {
                try {
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                    String string = jSONObject2.getString(C1245d.f3961jd);
                    String string2 = jSONObject2.getString("url");
                    C1766e valueOf = C1766e.valueOf(string.toUpperCase(Locale.US));
                    if (valueOf != null && !TextUtils.isEmpty(string2)) {
                        ((List) this.f5521d.get(valueOf)).add(string2);
                    }
                } catch (Exception unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public String mo7590a() {
        return this.f5518a;
    }

    /* renamed from: a */
    public List<String> mo7591a(C1766e eVar) {
        return (List) this.f5521d.get(eVar);
    }

    /* renamed from: b */
    public String mo7592b() {
        return this.f5519b;
    }

    /* renamed from: c */
    public JSONObject mo7593c() {
        return this.f5520c;
    }
}
