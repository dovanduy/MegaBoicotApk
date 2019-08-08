package com.appnext.base.operations.imp;

import android.os.Bundle;
import android.util.Pair;
import com.appnext.base.operations.C1269d;
import com.appnext.base.p042a.C1224a;
import com.appnext.base.p042a.p044b.C1230b;
import com.appnext.base.p042a.p044b.C1231c;
import com.appnext.base.p042a.p045c.C1237d;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import org.json.JSONArray;

/* renamed from: com.appnext.base.operations.imp.cd */
public class C1271cd extends C1269d {
    /* renamed from: bA */
    public final boolean mo5999bA() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: bv */
    public final boolean mo6005bv() {
        return true;
    }

    /* access modifiers changed from: protected */
    public List<C1230b> getData() {
        return null;
    }

    public C1271cd(C1231c cVar, Bundle bundle, Object obj) {
        super(cVar, bundle, obj);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final HashMap<Pair<String, String>, JSONArray> mo6010c(HashMap<Pair<String, String>, JSONArray> hashMap) {
        Iterator it = hashMap.entrySet().iterator();
        while (it.hasNext()) {
            Entry entry = (Entry) it.next();
            Pair pair = (Pair) entry.getKey();
            JSONArray jSONArray = (JSONArray) entry.getValue();
            C1231c ac = C1224a.m5161aN().mo5888aR().mo5929ac((String) pair.first);
            if (ac != null && Integer.valueOf(ac.mo5908be()).intValue() > jSONArray.length()) {
                it.remove();
            }
        }
        return hashMap;
    }

    /* access modifiers changed from: protected */
    /* renamed from: bw */
    public final C1237d mo6006bw() {
        return C1224a.m5161aN().mo5889aS();
    }

    /* access modifiers changed from: protected */
    public final String getKey() {
        return C1271cd.class.getSimpleName();
    }

    /* access modifiers changed from: protected */
    /* renamed from: br */
    public final List<C1230b> mo6002br() {
        return C1224a.m5161aN().mo5889aS().mo5941bm();
    }
}
