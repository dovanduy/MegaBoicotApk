package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.internal.p145b.C4415f;

/* renamed from: com.google.android.gms.common.api.internal.ar */
final class C3295ar extends C4415f {

    /* renamed from: a */
    private final /* synthetic */ C3289al f9578a;

    C3295ar(C3289al alVar, Looper looper) {
        this.f9578a = alVar;
        super(looper);
    }

    public final void handleMessage(Message message) {
        switch (message.what) {
            case 1:
                this.f9578a.m11743q();
                return;
            case 2:
                this.f9578a.m11742p();
                return;
            default:
                int i = message.what;
                StringBuilder sb = new StringBuilder(31);
                sb.append("Unknown message id: ");
                sb.append(i);
                Log.w("GoogleApiClientImpl", sb.toString());
                return;
        }
    }
}
