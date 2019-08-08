package com.p055c.p056a.p057a.p058a.p063d;

import android.view.View;
import com.p055c.p056a.p057a.p058a.p060b.C1444i;
import com.p055c.p056a.p057a.p058a.p062c.C1446a;
import com.p055c.p056a.p057a.p058a.p063d.C1455a.C1456a;
import com.p055c.p056a.p057a.p058a.p064e.C1461b;
import com.p055c.p056a.p057a.p058a.p064e.C1466f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: com.c.a.a.a.d.c */
public class C1458c implements C1455a {

    /* renamed from: a */
    private final C1455a f4439a;

    public C1458c(C1455a aVar) {
        this.f4439a = aVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public ArrayList<View> mo6558a() {
        ArrayList<View> arrayList = new ArrayList<>();
        C1446a a = C1446a.m5984a();
        if (a != null) {
            Collection<C1444i> c = a.mo6524c();
            IdentityHashMap identityHashMap = new IdentityHashMap((c.size() * 2) + 3);
            for (C1444i h : c) {
                View h2 = h.mo6509h();
                if (h2 != null && C1466f.m6082c(h2)) {
                    View rootView = h2.getRootView();
                    if (rootView != null && !identityHashMap.containsKey(rootView)) {
                        identityHashMap.put(rootView, rootView);
                        float a2 = C1466f.m6080a(rootView);
                        int size = arrayList.size();
                        while (size > 0 && C1466f.m6080a((View) arrayList.get(size - 1)) > a2) {
                            size--;
                        }
                        arrayList.add(size, rootView);
                    }
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public JSONObject mo6554a(View view) {
        return C1461b.m6050a(0, 0, 0, 0);
    }

    /* renamed from: a */
    public void mo6555a(View view, JSONObject jSONObject, C1456a aVar, boolean z) {
        Iterator it = mo6558a().iterator();
        while (it.hasNext()) {
            aVar.mo6556a((View) it.next(), this.f4439a, jSONObject);
        }
    }
}
