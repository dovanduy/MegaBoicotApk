package com.google.firebase.iid;

import android.os.Looper;
import android.os.Message;
import com.google.android.gms.internal.p147d.C4423a;

/* renamed from: com.google.firebase.iid.x */
final class C5012x extends C4423a {

    /* renamed from: a */
    private final /* synthetic */ C5011w f16276a;

    C5012x(C5011w wVar, Looper looper) {
        this.f16276a = wVar;
        super(looper);
    }

    public final void handleMessage(Message message) {
        this.f16276a.m21732a(message);
    }
}
