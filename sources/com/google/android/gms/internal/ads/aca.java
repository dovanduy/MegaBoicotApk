package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.abe.C3640e;

final class aca implements adf {

    /* renamed from: b */
    private static final ack f10475b = new acb();

    /* renamed from: a */
    private final ack f10476a;

    public aca() {
        this(new acc(abd.m13277a(), m13385a()));
    }

    private aca(ack ack) {
        this.f10476a = (ack) abg.m13322a(ack, "messageInfoFactory");
    }

    /* renamed from: a */
    private static ack m13385a() {
        try {
            return (ack) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            return f10475b;
        }
    }

    /* renamed from: a */
    private static boolean m13386a(acj acj) {
        return acj.mo14064a() == C3640e.f10425h;
    }

    /* renamed from: a */
    public final <T> ade<T> mo14044a(Class<T> cls) {
        adg.m13627a(cls);
        acj b = this.f10476a.mo13978b(cls);
        if (b.mo14065b()) {
            return abe.class.isAssignableFrom(cls) ? acs.m13494a(adg.m13640c(), aav.m13240a(), b.mo14066c()) : acs.m13494a(adg.m13617a(), aav.m13241b(), b.mo14066c());
        }
        if (abe.class.isAssignableFrom(cls)) {
            if (m13386a(b)) {
                return acp.m13450a(cls, b, acw.m13509b(), abv.m13363b(), adg.m13640c(), aav.m13240a(), aci.m13418b());
            }
            return acp.m13450a(cls, b, acw.m13509b(), abv.m13363b(), adg.m13640c(), null, aci.m13418b());
        } else if (m13386a(b)) {
            return acp.m13450a(cls, b, acw.m13508a(), abv.m13362a(), adg.m13617a(), aav.m13241b(), aci.m13417a());
        } else {
            return acp.m13450a(cls, b, acw.m13508a(), abv.m13362a(), adg.m13634b(), null, aci.m13417a());
        }
    }
}
