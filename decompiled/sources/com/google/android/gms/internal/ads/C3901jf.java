package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.gms.ads.internal.C3025aw;

@C3718cm
/* renamed from: com.google.android.gms.internal.ads.jf */
public final class C3901jf extends Handler {
    public C3901jf(Looper looper) {
        super(looper);
    }

    public final void dispatchMessage(Message message) {
        try {
            super.dispatchMessage(message);
        } catch (Throwable th) {
            C3025aw.m10917e();
            C3909jn.m17140a(C3025aw.m10921i().mo15450m(), th);
            throw th;
        }
    }

    public final void handleMessage(Message message) {
        try {
            super.handleMessage(message);
        } catch (Exception e) {
            C3025aw.m10921i().mo15436a((Throwable) e, "AdMobHandler.handleMessage");
        }
    }
}
