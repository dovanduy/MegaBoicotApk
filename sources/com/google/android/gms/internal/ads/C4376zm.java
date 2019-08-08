package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.C4375zl;
import com.google.android.gms.internal.ads.C4376zm;

/* renamed from: com.google.android.gms.internal.ads.zm */
public abstract class C4376zm<MessageType extends C4375zl<MessageType, BuilderType>, BuilderType extends C4376zm<MessageType, BuilderType>> implements acm {
    /* renamed from: a */
    public final /* synthetic */ acm mo14069a(acl acl) {
        if (mo13989p().getClass().isInstance(acl)) {
            return mo13993a((MessageType) (C4375zl) acl);
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }

    /* renamed from: a */
    public abstract BuilderType clone();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract BuilderType mo13993a(MessageType messagetype);
}
