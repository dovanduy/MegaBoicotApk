package com.appnext.ads;

import java.util.Random;
import org.json.JSONArray;

/* renamed from: com.appnext.ads.c */
public final class C1068c {
    /* renamed from: L */
    public static String m4923L(String str) {
        try {
            JSONArray jSONArray = new JSONArray(str);
            int nextInt = new Random(System.nanoTime()).nextInt(100);
            new StringBuilder("TemplateRandomizer percent ").append(nextInt);
            int i = 0;
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                i += jSONArray.getJSONObject(i2).getInt(TtmlNode.TAG_P);
                if (nextInt < i) {
                    return jSONArray.getJSONObject(i2).getString(TtmlNode.ATTR_ID);
                }
            }
        } catch (Throwable unused) {
        }
        return "";
    }
}
