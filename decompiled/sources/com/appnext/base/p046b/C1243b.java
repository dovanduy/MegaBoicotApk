package com.appnext.base.p046b;

import android.text.TextUtils;
import com.appnext.base.p042a.C1224a;
import com.appnext.base.p042a.p044b.C1230b;
import com.appnext.base.p042a.p044b.C1231c;
import com.appnext.base.p042a.p045c.C1237d;
import com.appnext.base.p046b.C1245d.C1246a;
import java.util.Date;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.appnext.base.b.b */
public final class C1243b {
    /* renamed from: d */
    public static boolean m5264d(C1231c cVar) {
        if (cVar == null) {
            return false;
        }
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(cVar.getKey());
            sb.append(C1251i.f3985jx);
            int i = C1251i.m5302ck().getInt(sb.toString(), 0);
            try {
                if (i >= Integer.parseInt(cVar.mo5908be()) || i == 0) {
                    return true;
                }
                return false;
            } catch (NumberFormatException unused) {
                return true;
            }
        } catch (Throwable unused2) {
            return false;
        }
    }

    /* renamed from: aq */
    private static List<C1230b> m5259aq(String str) {
        try {
            return C1224a.m5161aN().mo5887aQ().mo5936ae(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: ar */
    public static boolean m5260ar(String str) {
        List aq = m5259aq(str);
        return aq == null || aq.size() == 0;
    }

    /* renamed from: a */
    public static JSONObject m5257a(String str, Date date, C1246a aVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            String aB = C1250h.m5296ci().mo5958aB(str);
            if (TextUtils.isEmpty(aB)) {
                return jSONObject;
            }
            jSONObject.put("data", C1259k.m5336b(aB, aVar));
            jSONObject.put("date", C1259k.m5330a(date));
            return jSONObject;
        } catch (Throwable unused) {
        }
    }

    /* renamed from: as */
    public static void m5261as(String str) {
        if (str != null) {
            try {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(C1251i.f3985jx);
                C1251i.m5302ck().putInt(sb.toString(), 0);
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: at */
    public static void m5262at(String str) {
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(C1251i.f3983jv);
            C1251i.m5302ck().putLong(sb.toString(), System.currentTimeMillis());
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append(C1251i.f3985jx);
            String sb3 = sb2.toString();
            C1251i.m5302ck().putInt(sb3, C1251i.m5302ck().getInt(sb3, 0) + 1);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public static JSONArray m5256a(List<C1230b> list, boolean z) {
        try {
            JSONArray jSONArray = new JSONArray();
            for (C1230b bVar : list) {
                String aZ = bVar.mo5898aZ();
                if (!aZ.isEmpty()) {
                    String az = C1250h.m5296ci().mo5960az(aZ);
                    if (!TextUtils.isEmpty(az)) {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put(C1237d.f3924gU, bVar.mo5897aY());
                        jSONObject.put(C1237d.COLUMN_TYPE, bVar.getType());
                        jSONObject.put(C1237d.f3925gV, az);
                        jSONObject.put(C1237d.f3927gX, bVar.getDataType());
                        jSONArray.put(jSONObject);
                    }
                }
            }
            return jSONArray;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static long m5255a(String str, String str2, C1246a aVar) {
        long j;
        try {
            if (!TextUtils.isEmpty(str)) {
                if (!TextUtils.isEmpty(str2)) {
                    j = C1224a.m5161aN().mo5887aQ().mo5933a(new C1230b(str, str2, aVar.getType()));
                    return j;
                }
            }
            return -1;
        } catch (Throwable unused) {
            j = -1;
        }
    }

    /* renamed from: c */
    public static long m5263c(JSONArray jSONArray) {
        long j = -1;
        if (jSONArray == null) {
            return -1;
        }
        try {
            j = C1224a.m5161aN().mo5887aQ().mo5934a(jSONArray);
        } catch (Throwable unused) {
        }
        return j;
    }

    /* renamed from: a */
    public static boolean m5258a(String str, Map<String, String> map) {
        try {
            return C1259k.m5338b(str, map);
        } catch (Throwable unused) {
            return false;
        }
    }
}
