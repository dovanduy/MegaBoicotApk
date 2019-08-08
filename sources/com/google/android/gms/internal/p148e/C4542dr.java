package com.google.android.gms.internal.p148e;

import com.google.android.gms.internal.p148e.C4513cu.C4518e;

/* renamed from: com.google.android.gms.internal.e.dr */
final class C4542dr implements C4572eu {

    /* renamed from: b */
    private static final C4553eb f14898b = new C4543ds();

    /* renamed from: a */
    private final C4553eb f14899a;

    public C4542dr() {
        this(new C4544dt(C4512ct.m19404a(), m19506a()));
    }

    private C4542dr(C4553eb ebVar) {
        this.f14899a = (C4553eb) C4520cw.m19448a(ebVar, "messageInfoFactory");
    }

    /* renamed from: a */
    public final <T> C4571et<T> mo16661a(Class<T> cls) {
        C4573ev.m19695a(cls);
        C4552ea b = this.f14899a.mo16605b(cls);
        if (b.mo16682b()) {
            if (C4513cu.class.isAssignableFrom(cls)) {
                return C4560ei.m19601a(C4573ev.m19707c(), C4503ck.m19365a(), b.mo16683c());
            }
            return C4560ei.m19601a(C4573ev.m19685a(), C4503ck.m19366b(), b.mo16683c());
        } else if (C4513cu.class.isAssignableFrom(cls)) {
            if (m19507a(b)) {
                return C4558eg.m19561a(cls, b, C4564em.m19615b(), C4537dm.m19487b(), C4573ev.m19707c(), C4503ck.m19365a(), C4550dz.m19539b());
            }
            return C4558eg.m19561a(cls, b, C4564em.m19615b(), C4537dm.m19487b(), C4573ev.m19707c(), null, C4550dz.m19539b());
        } else if (m19507a(b)) {
            return C4558eg.m19561a(cls, b, C4564em.m19614a(), C4537dm.m19486a(), C4573ev.m19685a(), C4503ck.m19366b(), C4550dz.m19538a());
        } else {
            return C4558eg.m19561a(cls, b, C4564em.m19614a(), C4537dm.m19486a(), C4573ev.m19701b(), null, C4550dz.m19538a());
        }
    }

    /* renamed from: a */
    private static boolean m19507a(C4552ea eaVar) {
        return eaVar.mo16681a() == C4518e.f14852h;
    }

    /* renamed from: a */
    private static C4553eb m19506a() {
        try {
            return (C4553eb) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            return f14898b;
        }
    }
}
