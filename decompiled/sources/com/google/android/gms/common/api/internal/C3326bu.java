package com.google.android.gms.common.api.internal;

import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.api.C3270g;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p145b.C4415f;

/* renamed from: com.google.android.gms.common.api.internal.bu */
final class C3326bu extends C4415f {

    /* renamed from: a */
    private final /* synthetic */ C3324bs f9642a;

    public final void handleMessage(Message message) {
        switch (message.what) {
            case 0:
                C3270g gVar = (C3270g) message.obj;
                synchronized (this.f9642a.f9635e) {
                    if (gVar == null) {
                        try {
                            this.f9642a.f9632b.m11856a(new Status(13, "Transform returned null"));
                        } catch (Throwable th) {
                            throw th;
                        }
                    } else if (gVar instanceof C3319bn) {
                        this.f9642a.f9632b.m11856a(((C3319bn) gVar).mo13248d());
                    } else {
                        this.f9642a.f9632b.mo13257a(gVar);
                    }
                }
                return;
            case 1:
                RuntimeException runtimeException = (RuntimeException) message.obj;
                String str = "TransformedResultImpl";
                String str2 = "Runtime exception on the transformation worker thread: ";
                String valueOf = String.valueOf(runtimeException.getMessage());
                Log.e(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
                throw runtimeException;
            default:
                int i = message.what;
                StringBuilder sb = new StringBuilder(70);
                sb.append("TransformationResultHandler received unknown message type: ");
                sb.append(i);
                Log.e("TransformedResultImpl", sb.toString());
                return;
        }
    }
}
