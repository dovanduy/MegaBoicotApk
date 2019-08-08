package com.google.firebase.iid;

import com.google.firebase.p149a.C4918a;
import com.google.firebase.p149a.C4919b;

/* renamed from: com.google.firebase.iid.ar */
final /* synthetic */ class C4980ar implements C4919b {

    /* renamed from: a */
    private final C4959a f16220a;

    C4980ar(C4959a aVar) {
        this.f16220a = aVar;
    }

    /* renamed from: a */
    public final void mo17819a(C4918a aVar) {
        C4959a aVar2 = this.f16220a;
        synchronized (aVar2) {
            if (aVar2.mo17899a()) {
                FirebaseInstanceId.this.m21586m();
            }
        }
    }
}
