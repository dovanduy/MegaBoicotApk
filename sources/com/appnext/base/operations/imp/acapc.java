package com.appnext.base.operations.imp;

import android.os.Bundle;
import android.text.TextUtils;
import com.appnext.base.p042a.C1224a;
import com.appnext.base.p042a.p044b.C1229a;
import com.appnext.base.p042a.p044b.C1230b;
import com.appnext.base.p042a.p044b.C1231c;
import com.appnext.base.p046b.C1245d.C1246a;
import com.appnext.base.p046b.C1250h;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import org.json.JSONArray;
import org.json.JSONObject;

public class acapc extends acap {
    public acapc(C1231c cVar, Bundle bundle, Object obj) {
        super(cVar, bundle, obj);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final List<C1230b> mo5998b(List<C1230b> list) {
        List<C1230b> b = super.mo5998b(list);
        if (b == null || b.isEmpty()) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (C1230b aZ : b) {
            String aB = C1250h.m5296ci().mo5958aB(aZ.mo5898aZ());
            if (TextUtils.isEmpty(aB)) {
                return null;
            }
            List aa = C1224a.m5161aN().mo5886aP().mo5921aa(aB);
            if (aa.size() > 0) {
                Integer aX = ((C1229a) aa.get(0)).mo5895aX();
                if (!hashMap.containsKey(aX)) {
                    hashMap.put(aX, Integer.valueOf(1));
                } else {
                    hashMap.put(aX, Integer.valueOf(((Integer) hashMap.get(aX)).intValue() + 1));
                }
            }
        }
        if (hashMap.isEmpty()) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        for (Entry entry : hashMap.entrySet()) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("category", entry.getKey());
                jSONObject.put("appcount", entry.getValue());
            } catch (Throwable unused) {
            }
            jSONArray.put(jSONObject);
        }
        String az = C1250h.m5296ci().mo5960az(jSONArray.toString());
        if (TextUtils.isEmpty(az)) {
            return null;
        }
        C1230b bVar = new C1230b(acapc.class.getSimpleName(), acapc.class.getSimpleName(), az, new Date(), C1246a.JSONArray.getType());
        ArrayList arrayList = new ArrayList();
        arrayList.add(bVar);
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }

    /* access modifiers changed from: protected */
    /* renamed from: bB */
    public final C1246a mo6000bB() {
        return C1246a.JSONArray;
    }

    /* access modifiers changed from: protected */
    public final String getKey() {
        return acapc.class.getSimpleName();
    }
}
