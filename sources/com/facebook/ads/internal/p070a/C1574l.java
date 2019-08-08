package com.facebook.ads.internal.p070a;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import com.facebook.ads.internal.p092s.C1802c;
import com.facebook.ads.internal.p115w.p120e.C2361g;

/* renamed from: com.facebook.ads.internal.a.l */
public class C1574l extends C1563b {

    /* renamed from: d */
    private static final String f4832d = "l";

    /* renamed from: e */
    private final Uri f4833e;

    public C1574l(Context context, C1802c cVar, String str, Uri uri) {
        super(context, cVar, str);
        this.f4833e = uri;
    }

    /* renamed from: a */
    public void mo7058a() {
        try {
            Log.w("REDIRECTACTION: ", this.f4833e.toString());
            C2361g.m9129a(new C2361g(), this.f4805a, this.f4833e, this.f4807c);
        } catch (Exception e) {
            String str = f4832d;
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to open link url: ");
            sb.append(this.f4833e.toString());
            Log.d(str, sb.toString(), e);
        }
    }
}
