package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.C3025aw;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@C3718cm
public final class bbt {
    /* renamed from: a */
    private static String m15968a(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str3)) {
            str3 = "";
        }
        return str.replaceAll(str2, str3);
    }

    /* renamed from: a */
    public static List<String> m15969a(JSONObject jSONObject, String str) throws JSONException {
        JSONArray optJSONArray = jSONObject.optJSONArray(str);
        if (optJSONArray == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(optJSONArray.length());
        for (int i = 0; i < optJSONArray.length(); i++) {
            arrayList.add(optJSONArray.getString(i));
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* renamed from: a */
    public static void m15970a(Context context, String str, C3878ij ijVar, String str2, boolean z, List<String> list) {
        if (list != null && !list.isEmpty()) {
            String str3 = z ? "1" : "0";
            for (String a : list) {
                String a2 = m15968a(m15968a(m15968a(m15968a(m15968a(m15968a(m15968a(a, "@gw_adlocid@", str2), "@gw_adnetrefresh@", str3), "@gw_qdata@", ijVar.f13282r.f12571i), "@gw_sdkver@", str), "@gw_sessid@", aoq.m14617c()), "@gw_seqnum@", ijVar.f13274j), "@gw_adnetstatus@", ijVar.f13284t);
                if (ijVar.f13279o != null) {
                    a2 = m15968a(m15968a(a2, "@gw_adnetid@", ijVar.f13279o.f12543b), "@gw_allocid@", ijVar.f13279o.f12545d);
                }
                String a3 = C3872id.m16944a(a2, context);
                C3025aw.m10917e();
                C3909jn.m17138a(context, str, a3);
            }
        }
    }

    /* renamed from: a */
    public static void m15971a(Context context, String str, List<String> list, String str2, zzaig zzaig) {
        if (list != null && !list.isEmpty()) {
            if (!TextUtils.isEmpty(str2) && C3980md.m17412c()) {
                str2 = "fakeUserForAdDebugLog";
            }
            long a = C3025aw.m10924l().mo13694a();
            for (String a2 : list) {
                String a3 = m15968a(m15968a(a2, "@gw_rwd_userid@", Uri.encode(str2)), "@gw_tmstmp@", Long.toString(a));
                if (zzaig != null) {
                    a3 = m15968a(m15968a(a3, "@gw_rwd_itm@", Uri.encode(zzaig.f14495a)), "@gw_rwd_amt@", Integer.toString(zzaig.f14496b));
                }
                C3025aw.m10917e();
                C3909jn.m17138a(context, str, a3);
            }
        }
    }

    /* renamed from: a */
    public static boolean m15972a(String str, int[] iArr) {
        if (TextUtils.isEmpty(str) || iArr.length != 2) {
            return false;
        }
        String[] split = str.split("x");
        if (split.length != 2) {
            return false;
        }
        try {
            iArr[0] = Integer.parseInt(split[0]);
            iArr[1] = Integer.parseInt(split[1]);
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }
}
