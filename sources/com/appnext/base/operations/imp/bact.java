package com.appnext.base.operations.imp;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothAdapter;
import android.os.Bundle;
import com.appnext.base.operations.C1269d;
import com.appnext.base.p042a.p044b.C1230b;
import com.appnext.base.p042a.p044b.C1231c;
import com.appnext.base.p046b.C1245d.C1246a;
import com.appnext.base.p046b.C1247e;
import com.appnext.base.p046b.C1248f;
import java.util.ArrayList;
import java.util.List;

public class bact extends C1269d {
    private static String KEY = "bact";

    public bact(C1231c cVar, Bundle bundle, Object obj) {
        super(cVar, bundle, obj);
    }

    /* access modifiers changed from: protected */
    @SuppressLint({"MissingPermission"})
    public List<C1230b> getData() {
        if (!mo5999bA()) {
            return null;
        }
        String str = "false";
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        if (defaultAdapter != null && defaultAdapter.isEnabled()) {
            str = "true";
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C1230b(KEY, str, C1246a.Boolean.getType()));
        if (mo6012e(arrayList)) {
            return arrayList;
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public final String getKey() {
        return bact.class.getSimpleName();
    }

    /* renamed from: bA */
    public final boolean mo5999bA() {
        return C1248f.m5280g(C1247e.getContext(), "android.permission.BLUETOOTH");
    }
}
