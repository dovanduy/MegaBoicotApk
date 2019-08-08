package com.google.android.gms.ads.internal.gmsg;

import android.text.TextUtils;
import com.google.android.gms.internal.ads.C3718cm;
import com.google.android.gms.internal.ads.C3900je;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONException;
import org.json.JSONObject;

@ParametersAreNonnullByDefault
@C3718cm
/* renamed from: com.google.android.gms.ads.internal.gmsg.g */
public final class C3077g implements C3067ae<Object> {

    /* renamed from: a */
    private final Object f8978a = new Object();
    @GuardedBy("mLock")

    /* renamed from: b */
    private final Map<String, C3078h> f8979b = new HashMap();

    /* renamed from: a */
    public final void mo12618a(String str, C3078h hVar) {
        synchronized (this.f8978a) {
            this.f8979b.put(str, hVar);
        }
    }

    public final void zza(Object obj, Map<String, String> map) {
        String str;
        String str2 = (String) map.get(TtmlNode.ATTR_ID);
        String str3 = (String) map.get("fail");
        String str4 = (String) map.get("fail_reason");
        String str5 = (String) map.get("fail_stack");
        String str6 = (String) map.get("result");
        if (TextUtils.isEmpty(str5)) {
            str4 = "Unknown Fail Reason.";
        }
        if (TextUtils.isEmpty(str5)) {
            str = "";
        } else {
            String str7 = "\n";
            String valueOf = String.valueOf(str5);
            str = valueOf.length() != 0 ? str7.concat(valueOf) : new String(str7);
        }
        synchronized (this.f8978a) {
            C3078h hVar = (C3078h) this.f8979b.remove(str2);
            if (hVar == null) {
                String str8 = "Received result for unexpected method invocation: ";
                String valueOf2 = String.valueOf(str2);
                C3900je.m17435e(valueOf2.length() != 0 ? str8.concat(valueOf2) : new String(str8));
            } else if (!TextUtils.isEmpty(str3)) {
                String valueOf3 = String.valueOf(str4);
                String valueOf4 = String.valueOf(str);
                hVar.mo12619a(valueOf4.length() != 0 ? valueOf3.concat(valueOf4) : new String(valueOf3));
            } else if (str6 == null) {
                hVar.mo12620a((JSONObject) null);
            } else {
                try {
                    JSONObject jSONObject = new JSONObject(str6);
                    if (C3900je.m17044a()) {
                        String str9 = "Result GMSG: ";
                        String valueOf5 = String.valueOf(jSONObject.toString(2));
                        C3900je.m17043a(valueOf5.length() != 0 ? str9.concat(valueOf5) : new String(str9));
                    }
                    hVar.mo12620a(jSONObject);
                } catch (JSONException e) {
                    hVar.mo12619a(e.getMessage());
                }
            }
        }
    }
}
