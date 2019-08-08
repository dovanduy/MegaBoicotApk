package com.google.android.gms.internal.p148e;

import com.google.android.gms.internal.p148e.C4461bb;
import com.google.android.gms.internal.p148e.C4462bc;

/* renamed from: com.google.android.gms.internal.e.bc */
public abstract class C4462bc<MessageType extends C4461bb<MessageType, BuilderType>, BuilderType extends C4462bc<MessageType, BuilderType>> implements C4555ed {
    /* renamed from: a */
    public abstract BuilderType clone();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract BuilderType mo16364a(MessageType messagetype);

    /* renamed from: a */
    public final /* synthetic */ C4555ed mo16365a(C4554ec ecVar) {
        if (mo16615l().getClass().isInstance(ecVar)) {
            return mo16364a((MessageType) (C4461bb) ecVar);
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }
}
