package com.facebook.internal;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.support.customtabs.C0163c;
import android.support.customtabs.C0163c.C0164a;
import com.facebook.C2649m;

/* renamed from: com.facebook.internal.e */
/* compiled from: CustomTab */
public class C2515e {

    /* renamed from: a */
    private Uri f7894a;

    public C2515e(String str, Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        String a = C2476aa.m9410a();
        StringBuilder sb = new StringBuilder();
        sb.append(C2649m.m10134g());
        sb.append("/");
        sb.append("dialog/");
        sb.append(str);
        this.f7894a = C2479ad.m9421a(a, sb.toString(), bundle);
    }

    /* renamed from: a */
    public void mo8990a(Activity activity, String str) {
        C0163c a = new C0164a().mo351a();
        a.f234a.setPackage(str);
        a.f234a.addFlags(1073741824);
        a.mo350a(activity, this.f7894a);
    }
}
