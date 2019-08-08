package com.google.android.gms.ads.internal.gmsg;

import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.C3025aw;
import com.google.android.gms.internal.ads.C3900je;
import com.google.android.gms.internal.ads.C3909jn;
import com.google.android.gms.internal.ads.C4089qe;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.ads.internal.gmsg.v */
final class C3092v implements C3067ae<C4089qe> {
    C3092v() {
    }

    public final /* synthetic */ void zza(Object obj, Map map) {
        C4089qe qeVar = (C4089qe) obj;
        WindowManager windowManager = (WindowManager) qeVar.getContext().getSystemService("window");
        C3025aw.m10917e();
        View view = (View) qeVar;
        DisplayMetrics a = C3909jn.m17124a(windowManager);
        int i = a.widthPixels;
        int i2 = a.heightPixels;
        int[] iArr = new int[2];
        HashMap hashMap = new HashMap();
        view.getLocationInWindow(iArr);
        hashMap.put("xInPixels", Integer.valueOf(iArr[0]));
        hashMap.put("yInPixels", Integer.valueOf(iArr[1]));
        hashMap.put("windowWidthInPixels", Integer.valueOf(i));
        hashMap.put("windowHeightInPixels", Integer.valueOf(i2));
        qeVar.mo14986a("locationReady", (Map<String, ?>) hashMap);
        C3900je.m17435e("GET LOCATION COMPILED");
    }
}
