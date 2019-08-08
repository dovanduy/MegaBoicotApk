package com.google.firebase.iid;

import com.google.android.gms.p143d.C3584h;

/* renamed from: com.google.firebase.iid.ao */
final /* synthetic */ class C4977ao implements Runnable {

    /* renamed from: a */
    private final FirebaseInstanceId f16205a;

    /* renamed from: b */
    private final String f16206b;

    /* renamed from: c */
    private final String f16207c;

    /* renamed from: d */
    private final C3584h f16208d;

    /* renamed from: e */
    private final String f16209e;

    C4977ao(FirebaseInstanceId firebaseInstanceId, String str, String str2, C3584h hVar, String str3) {
        this.f16205a = firebaseInstanceId;
        this.f16206b = str;
        this.f16207c = str2;
        this.f16208d = hVar;
        this.f16209e = str3;
    }

    public final void run() {
        this.f16205a.mo17885a(this.f16206b, this.f16207c, this.f16208d, this.f16209e);
    }
}
