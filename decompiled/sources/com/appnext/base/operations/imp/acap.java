package com.appnext.base.operations.imp;

import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.TextUtils;
import com.appnext.base.operations.C1269d;
import com.appnext.base.p042a.p044b.C1230b;
import com.appnext.base.p042a.p044b.C1231c;
import com.appnext.base.p046b.C1245d.C1246a;
import com.appnext.base.p046b.C1247e;
import com.appnext.base.p046b.C1248f;
import com.appnext.base.p046b.C1250h;
import com.appnext.base.p046b.C1259k;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class acap extends C1269d {

    /* renamed from: hn */
    private static final long f4019hn = 1;

    /* renamed from: ho */
    private static final String f4020ho = "ft";

    /* renamed from: hp */
    private static final String f4021hp = "nfga";

    /* renamed from: hq */
    private static final String f4022hq = "android";

    private class CollectedDataModelByDateComparator implements Comparator<C1230b> {
        private CollectedDataModelByDateComparator() {
        }

        public /* synthetic */ int compare(Object obj, Object obj2) {
            return ((C1230b) obj).mo5899ba().getTime() > ((C1230b) obj2).mo5899ba().getTime() ? 1 : 0;
        }

        /* renamed from: a */
        public static int m5401a(C1230b bVar, C1230b bVar2) {
            return bVar.mo5899ba().getTime() > bVar2.mo5899ba().getTime() ? 1 : 0;
        }
    }

    public acap(C1231c cVar, Bundle bundle, Object obj) {
        super(cVar, bundle, obj);
    }

    /* renamed from: bA */
    public final boolean mo5999bA() {
        if (VERSION.SDK_INT < 21) {
            return C1248f.m5280g(C1247e.getContext(), "android.permission.GET_TASKS");
        }
        return C1259k.m5342m(C1247e.getContext().getApplicationContext());
    }

    /* access modifiers changed from: protected */
    public List<C1230b> getData() {
        try {
            List<String> a = C1259k.m5331a(C1247e.getContext(), (long) C1259k.m5340h(mo6004bt().mo5906bc(), mo6004bt().mo5907bd()), mo6004bt().mo5902a(f4020ho, 1));
            if (a == null) {
                a = null;
            } else {
                Iterator it = a.iterator();
                while (it.hasNext()) {
                    if (((String) it.next()).equalsIgnoreCase(f4022hq)) {
                        it.remove();
                    }
                }
            }
            ArrayList arrayList = new ArrayList();
            if (a == null || a.isEmpty()) {
                arrayList.add(new C1230b(getKey(), f4021hp, C1246a.String.toString()));
            } else {
                for (String bVar : a) {
                    arrayList.add(new C1230b(getKey(), bVar, C1246a.String.toString()));
                }
            }
            return arrayList;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public List<C1230b> mo5998b(List<C1230b> list) {
        if (list == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (C1230b bVar : list) {
            String aB = C1250h.m5296ci().mo5958aB(bVar.mo5898aZ());
            if (!TextUtils.isEmpty(aB) && !aB.equals(f4021hp) && !hashMap.containsKey(aB)) {
                hashMap.put(aB, bVar);
            }
        }
        if (hashMap.size() == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList(hashMap.values());
        if (arrayList.isEmpty()) {
            return null;
        }
        Collections.sort(arrayList, new CollectedDataModelByDateComparator());
        return arrayList;
    }

    /* renamed from: f */
    private static List<String> m5398f(List<String> list) {
        if (list == null) {
            return null;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((String) it.next()).equalsIgnoreCase(f4022hq)) {
                it.remove();
            }
        }
        return list;
    }

    /* access modifiers changed from: protected */
    public String getKey() {
        return acap.class.getSimpleName();
    }
}
