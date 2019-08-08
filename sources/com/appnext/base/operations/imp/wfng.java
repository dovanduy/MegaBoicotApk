package com.appnext.base.operations.imp;

import android.net.wifi.ScanResult;
import android.os.Bundle;
import com.appnext.base.p042a.p044b.C1231c;

public class wfng extends wfpx {
    /* access modifiers changed from: protected */
    /* renamed from: am */
    public final Object mo6027am(String str) {
        return str;
    }

    public wfng(C1231c cVar, Bundle bundle, Object obj) {
        super(cVar, bundle, obj);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo6026a(ScanResult scanResult) {
        return scanResult.BSSID;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final Boolean mo6028h(int i) {
        C1231c bt = mo6004bt();
        int i2 = 6;
        if (bt != null) {
            i2 = bt.mo5904b("level", 6);
        }
        return Boolean.valueOf(i >= i2);
    }

    /* access modifiers changed from: protected */
    public String getKey() {
        return wfng.class.getSimpleName();
    }
}
