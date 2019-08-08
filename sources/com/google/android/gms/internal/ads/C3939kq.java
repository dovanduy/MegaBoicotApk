package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.net.Uri;
import com.google.android.gms.ads.internal.C3025aw;

/* renamed from: com.google.android.gms.internal.ads.kq */
final class C3939kq implements OnClickListener {

    /* renamed from: a */
    private final /* synthetic */ C3938kp f13467a;

    C3939kq(C3938kp kpVar) {
        this.f13467a = kpVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C3025aw.m10917e();
        C3909jn.m17137a(this.f13467a.f13463a, Uri.parse("https://support.google.com/dfp_premium/answer/7160685#push"));
    }
}
