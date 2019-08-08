package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.RelativeLayout;
import com.google.android.gms.internal.ads.C3718cm;
import com.google.android.gms.internal.ads.C3930kh;

@C3718cm
/* renamed from: com.google.android.gms.ads.internal.overlay.g */
final class C3111g extends RelativeLayout {

    /* renamed from: a */
    boolean f9102a;

    /* renamed from: b */
    private C3930kh f9103b;

    public C3111g(Context context, String str, String str2) {
        super(context);
        this.f9103b = new C3930kh(context, str);
        this.f9103b.mo15566b(str2);
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.f9102a) {
            this.f9103b.mo15562a(motionEvent);
        }
        return false;
    }
}
