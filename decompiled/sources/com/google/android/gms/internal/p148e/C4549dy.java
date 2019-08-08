package com.google.android.gms.internal.p148e;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: com.google.android.gms.internal.e.dy */
final class C4549dy implements C4548dx {
    C4549dy() {
    }

    /* renamed from: a */
    public final Map<?, ?> mo16675a(Object obj) {
        return (C4547dw) obj;
    }

    /* renamed from: f */
    public final C4546dv<?, ?> mo16680f(Object obj) {
        throw new NoSuchMethodError();
    }

    /* renamed from: b */
    public final Map<?, ?> mo16676b(Object obj) {
        return (C4547dw) obj;
    }

    /* renamed from: c */
    public final boolean mo16677c(Object obj) {
        return !((C4547dw) obj).mo16666d();
    }

    /* renamed from: d */
    public final Object mo16678d(Object obj) {
        ((C4547dw) obj).mo16664c();
        return obj;
    }

    /* renamed from: e */
    public final Object mo16679e(Object obj) {
        return C4547dw.m19516a().mo16663b();
    }

    /* renamed from: a */
    public final Object mo16674a(Object obj, Object obj2) {
        C4547dw dwVar = (C4547dw) obj;
        C4547dw dwVar2 = (C4547dw) obj2;
        if (!dwVar2.isEmpty()) {
            if (!dwVar.mo16666d()) {
                dwVar = dwVar.mo16663b();
            }
            dwVar.mo16662a(dwVar2);
        }
        return dwVar;
    }

    /* renamed from: a */
    public final int mo16673a(int i, Object obj, Object obj2) {
        C4547dw dwVar = (C4547dw) obj;
        if (dwVar.isEmpty()) {
            return 0;
        }
        Iterator it = dwVar.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        Entry entry = (Entry) it.next();
        entry.getKey();
        entry.getValue();
        throw new NoSuchMethodError();
    }
}
