package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.internal.p145b.C4415f;

/* renamed from: com.google.android.gms.common.api.internal.aw */
final class C3300aw extends C4415f {

    /* renamed from: a */
    private final /* synthetic */ C3298au f9596a;

    C3300aw(C3298au auVar, Looper looper) {
        this.f9596a = auVar;
        super(looper);
    }

    public final void handleMessage(Message message) {
        switch (message.what) {
            case 1:
                ((C3299av) message.obj).mo13224a(this.f9596a);
                return;
            case 2:
                throw ((RuntimeException) message.obj);
            default:
                int i = message.what;
                StringBuilder sb = new StringBuilder(31);
                sb.append("Unknown message id: ");
                sb.append(i);
                Log.w("GACStateManager", sb.toString());
                return;
        }
    }
}
