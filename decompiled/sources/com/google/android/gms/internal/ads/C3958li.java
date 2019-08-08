package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;

@C3718cm
/* renamed from: com.google.android.gms.internal.ads.li */
public final class C3958li {

    /* renamed from: a */
    private static final C3960lk<Map<String, ?>> f13505a = new C3959lj();

    /* renamed from: a */
    public static List<String> m17339a(JSONArray jSONArray, List<String> list) throws JSONException {
        ArrayList arrayList = new ArrayList();
        if (jSONArray == null) {
            return arrayList;
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(jSONArray.getString(i));
        }
        return arrayList;
    }
}
