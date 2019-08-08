package com.google.android.gms.internal.p148e;

/* renamed from: com.google.android.gms.internal.e.dt */
final class C4544dt implements C4553eb {

    /* renamed from: a */
    private C4553eb[] f14900a;

    C4544dt(C4553eb... ebVarArr) {
        this.f14900a = ebVarArr;
    }

    /* renamed from: a */
    public final boolean mo16604a(Class<?> cls) {
        for (C4553eb a : this.f14900a) {
            if (a.mo16604a(cls)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public final C4552ea mo16605b(Class<?> cls) {
        C4553eb[] ebVarArr;
        for (C4553eb ebVar : this.f14900a) {
            if (ebVar.mo16604a(cls)) {
                return ebVar.mo16605b(cls);
            }
        }
        String str = "No factory is available for message type: ";
        String valueOf = String.valueOf(cls.getName());
        throw new UnsupportedOperationException(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
    }
}
