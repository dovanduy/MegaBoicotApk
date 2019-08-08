package com.appnext.base.operations.imp;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Bundle;
import com.appnext.base.operations.C1269d;
import com.appnext.base.p042a.C1224a;
import com.appnext.base.p042a.p044b.C1229a;
import com.appnext.base.p042a.p044b.C1230b;
import com.appnext.base.p042a.p044b.C1231c;
import com.appnext.base.p046b.C1245d.C1246a;
import com.appnext.base.p046b.C1247e;
import com.appnext.base.p046b.C1259k;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import org.json.JSONArray;
import org.json.JSONObject;

public class inapc extends C1269d {
    private Context mContext = C1247e.getContext();

    /* renamed from: bA */
    public final boolean mo5999bA() {
        return true;
    }

    public inapc(C1231c cVar, Bundle bundle, Object obj) {
        super(cVar, bundle, obj);
    }

    /* access modifiers changed from: protected */
    /* renamed from: bB */
    public final C1246a mo6000bB() {
        return C1246a.JSONArray;
    }

    /* access modifiers changed from: protected */
    public List<C1230b> getData() {
        List<ApplicationInfo> a = C1259k.m5332a(this.mContext.getPackageManager(), 0);
        HashMap hashMap = new HashMap();
        for (ApplicationInfo applicationInfo : a) {
            try {
                List aa = C1224a.m5161aN().mo5886aP().mo5921aa(applicationInfo.packageName);
                if (aa.size() > 0) {
                    int intValue = ((C1229a) aa.get(0)).mo5895aX().intValue();
                    if (hashMap.get(Integer.valueOf(intValue)) == null) {
                        hashMap.put(Integer.valueOf(intValue), Integer.valueOf(1));
                    } else {
                        hashMap.put(Integer.valueOf(intValue), Integer.valueOf(((Integer) hashMap.get(Integer.valueOf(intValue))).intValue() + 1));
                    }
                }
            } catch (Throwable unused) {
            }
        }
        if (hashMap.isEmpty()) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        for (Entry entry : hashMap.entrySet()) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("categoryId", ((Integer) entry.getKey()).intValue());
                jSONObject.put("value", ((Integer) entry.getValue()).intValue());
                jSONArray.put(jSONObject);
            } catch (Throwable unused2) {
                return null;
            }
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C1230b(inapc.class.getSimpleName(), jSONArray.toString(), C1246a.JSONArray.getType()));
        return arrayList;
    }

    /* access modifiers changed from: protected */
    public final String getKey() {
        return inapc.class.getSimpleName();
    }
}
