package com.appnext.base.operations.imp;

import android.os.Build.VERSION;
import android.os.Bundle;
import com.appnext.base.operations.C1269d;
import com.appnext.base.p042a.C1224a;
import com.appnext.base.p042a.p044b.C1230b;
import com.appnext.base.p042a.p044b.C1231c;
import com.appnext.base.p046b.C1244c;
import com.appnext.base.p046b.C1247e;
import com.appnext.base.p046b.C1251i;
import com.appnext.base.p046b.C1259k;
import com.appnext.base.services.p048b.C1285a;
import com.appnext.core.C1326f;
import java.net.HttpRetryException;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public class cdm extends C1269d {
    private final String TAG = "cdm";

    /* renamed from: hz */
    private final String f4031hz = "[ { \"status\": \"on\", \"sample\":\"1\", \"sample_type\":\"hour\", \"cycle\":\"1\", \"cycle_type\":\"interval\", \"key\":\"cdm\" } ]";

    /* renamed from: bA */
    public final boolean mo5999bA() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: bv */
    public final boolean mo6005bv() {
        return false;
    }

    public cdm(C1231c cVar, Bundle bundle, Object obj) {
        super(cVar, bundle, obj);
        C1251i.m5302ck().init(C1247e.getContext());
    }

    /* access modifiers changed from: protected */
    public List<C1230b> getData() {
        String str;
        if (C1259k.m5345p(C1247e.getContext())) {
            return null;
        }
        try {
            StringBuilder sb = new StringBuilder("http://cdn.appnext.com/tools/services/4.7.2/config.json?packageId=");
            sb.append(C1247e.getContext().getPackageName());
            sb.append("&dosv=");
            sb.append(VERSION.SDK_INT);
            sb.append("&lvid=4.7.2");
            str = C1326f.m5659a(sb.toString(), null);
        } catch (HttpRetryException e) {
            e.responseCode();
            str = "[ { \"status\": \"on\", \"sample\":\"1\", \"sample_type\":\"hour\", \"cycle\":\"1\", \"cycle_type\":\"interval\", \"key\":\"cdm\" } ]";
        } catch (Throwable unused) {
            str = "[ { \"status\": \"on\", \"sample\":\"1\", \"sample_type\":\"hour\", \"cycle\":\"1\", \"cycle_type\":\"interval\", \"key\":\"cdm\" } ]";
        }
        try {
            List bm = C1224a.m5161aN().mo5888aR().mo5931bm();
            if (bm != null) {
                C1285a.m5550g(C1247e.getContext()).mo6053i(bm);
            }
            for (C1231c a : m5414al(str)) {
                C1285a.m5550g(C1247e.getContext()).mo6051a(a, false);
            }
        } catch (Throwable unused2) {
        }
        return null;
    }

    /* renamed from: al */
    private static List<C1231c> m5414al(String str) {
        try {
            ArrayList arrayList = new ArrayList();
            JSONArray jSONArray = new JSONArray(str);
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                StringBuilder sb = new StringBuilder();
                sb.append(jSONObject.optString("key"));
                sb.append(System.currentTimeMillis());
                jSONObject.put("service_key", sb.toString());
                arrayList.add(C1244c.m5267c(jSONObject));
            }
            C1224a.m5161aN().mo5888aR().delete();
            C1224a.m5161aN().mo5888aR().mo5930b(jSONArray);
            return arrayList;
        } catch (Throwable th) {
            th.getMessage();
            return new ArrayList();
        }
    }

    /* access modifiers changed from: protected */
    public final String getKey() {
        return cdm.class.getSimpleName();
    }
}
