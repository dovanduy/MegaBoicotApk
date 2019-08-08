package com.google.firebase.components;

import com.google.firebase.p149a.C4918a;
import com.google.firebase.p149a.C4919b;
import java.util.Map.Entry;

/* renamed from: com.google.firebase.components.p */
/* compiled from: com.google.firebase:firebase-common@@16.0.2 */
final /* synthetic */ class C4954p implements Runnable {

    /* renamed from: a */
    private final Entry f16138a;

    /* renamed from: b */
    private final C4918a f16139b;

    private C4954p(Entry entry, C4918a aVar) {
        this.f16138a = entry;
        this.f16139b = aVar;
    }

    /* renamed from: a */
    public static Runnable m21570a(Entry entry, C4918a aVar) {
        return new C4954p(entry, aVar);
    }

    public final void run() {
        ((C4919b) this.f16138a.getKey()).mo17819a(this.f16139b);
    }
}
