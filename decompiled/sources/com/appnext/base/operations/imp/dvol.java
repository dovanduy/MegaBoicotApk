package com.appnext.base.operations.imp;

import android.os.Bundle;
import com.appnext.base.operations.C1267b;
import com.appnext.base.p042a.p044b.C1230b;
import com.appnext.base.p042a.p044b.C1231c;
import com.appnext.base.p046b.C1245d.C1246a;
import com.appnext.base.p046b.C1247e;
import com.appnext.base.p046b.C1248f;
import java.util.ArrayList;
import java.util.List;

public class dvol extends C1267b {
    private static final String KEY = "dvol";

    /* renamed from: hH */
    private String[] f4039hH = {"dvola", "dvolc", "dvolm", "dvoln", "dvolr"};

    /* access modifiers changed from: protected */
    /* renamed from: bE */
    public final boolean mo6019bE() {
        return true;
    }

    /* renamed from: by */
    public final void mo6008by() {
    }

    public dvol(C1231c cVar, Bundle bundle, Object obj) {
        super(cVar, bundle, obj);
    }

    /* access modifiers changed from: protected */
    public List<C1230b> getData() {
        String[] strArr;
        try {
            ArrayList arrayList = new ArrayList();
            for (String str : this.f4039hH) {
                arrayList.add(new C1230b(KEY, str, String.valueOf(C1248f.m5279f(C1247e.getContext().getApplicationContext(), str)), C1246a.Integer.getType()));
            }
            return arrayList;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: aY */
    public final String mo6018aY() {
        return dvol.class.getSimpleName();
    }

    /* access modifiers changed from: protected */
    public final String getKey() {
        return dvol.class.getSimpleName();
    }

    /* renamed from: bA */
    public final boolean mo5999bA() {
        return m5382bD();
    }
}
