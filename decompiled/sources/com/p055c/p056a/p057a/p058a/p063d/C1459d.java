package com.p055c.p056a.p057a.p058a.p063d;

import android.annotation.TargetApi;
import android.os.Build.VERSION;
import android.view.View;
import android.view.ViewGroup;
import com.p055c.p056a.p057a.p058a.p063d.C1455a.C1456a;
import com.p055c.p056a.p057a.p058a.p064e.C1461b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: com.c.a.a.a.d.d */
public class C1459d implements C1455a {

    /* renamed from: a */
    private final int[] f4440a = new int[2];

    /* renamed from: a */
    private void m6041a(ViewGroup viewGroup, JSONObject jSONObject, C1456a aVar) {
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            aVar.mo6556a(viewGroup.getChildAt(i), this, jSONObject);
        }
    }

    @TargetApi(21)
    /* renamed from: b */
    private void m6042b(ViewGroup viewGroup, JSONObject jSONObject, C1456a aVar) {
        HashMap hashMap = new HashMap();
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            ArrayList arrayList = (ArrayList) hashMap.get(Float.valueOf(childAt.getZ()));
            if (arrayList == null) {
                arrayList = new ArrayList();
                hashMap.put(Float.valueOf(childAt.getZ()), arrayList);
            }
            arrayList.add(childAt);
        }
        ArrayList arrayList2 = new ArrayList(hashMap.keySet());
        Collections.sort(arrayList2);
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            Iterator it2 = ((ArrayList) hashMap.get((Float) it.next())).iterator();
            while (it2.hasNext()) {
                aVar.mo6556a((View) it2.next(), this, jSONObject);
            }
        }
    }

    /* renamed from: a */
    public JSONObject mo6554a(View view) {
        int width = view.getWidth();
        int height = view.getHeight();
        view.getLocationOnScreen(this.f4440a);
        return C1461b.m6050a(this.f4440a[0], this.f4440a[1], width, height);
    }

    /* renamed from: a */
    public void mo6555a(View view, JSONObject jSONObject, C1456a aVar, boolean z) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (!z || VERSION.SDK_INT < 21) {
                m6041a(viewGroup, jSONObject, aVar);
            } else {
                m6042b(viewGroup, jSONObject, aVar);
            }
        }
    }
}
