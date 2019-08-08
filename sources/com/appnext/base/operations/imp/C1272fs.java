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

/* renamed from: com.appnext.base.operations.imp.fs */
public class C1272fs extends C1267b {

    /* renamed from: hI */
    private String[] f4040hI = {"esfs", "ess", "isfs", "iss", "esfp", "isfp"};

    /* access modifiers changed from: protected */
    /* renamed from: bE */
    public final boolean mo6019bE() {
        return true;
    }

    /* renamed from: by */
    public final void mo6008by() {
    }

    public C1272fs(C1231c cVar, Bundle bundle, Object obj) {
        super(cVar, bundle, obj);
    }

    /* access modifiers changed from: protected */
    public List<C1230b> getData() {
        String[] strArr;
        try {
            if (mo5999bA()) {
                ArrayList arrayList = new ArrayList();
                for (String str : this.f4040hI) {
                    arrayList.add(new C1230b(C1272fs.class.getSimpleName(), str, String.valueOf(C1248f.m5273au(str)), C1246a.Long.getType()));
                }
                return arrayList;
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: aY */
    public final String mo6018aY() {
        return C1272fs.class.getSimpleName();
    }

    /* access modifiers changed from: protected */
    /* renamed from: bB */
    public final C1246a mo6000bB() {
        return C1246a.Long;
    }

    /* access modifiers changed from: protected */
    public final String getKey() {
        return C1272fs.class.getSimpleName();
    }

    /* renamed from: bA */
    public final boolean mo5999bA() {
        return m5382bD() && C1248f.m5280g(C1247e.getContext(), "android.permission.READ_EXTERNAL_STORAGE");
    }
}
