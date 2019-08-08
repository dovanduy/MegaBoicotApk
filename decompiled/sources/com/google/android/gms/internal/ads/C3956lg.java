package com.google.android.gms.internal.ads;

import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.lg */
public final class C3956lg extends avm<atl> {

    /* renamed from: a */
    private final C4019np<atl> f13501a;

    /* renamed from: b */
    private final Map<String, String> f13502b;

    /* renamed from: c */
    private final C3980md f13503c;

    public C3956lg(String str, C4019np<atl> npVar) {
        this(str, null, npVar);
    }

    private C3956lg(String str, Map<String, String> map, C4019np<atl> npVar) {
        super(0, str, new C3957lh(npVar));
        this.f13502b = null;
        this.f13501a = npVar;
        this.f13503c = new C3980md();
        this.f13503c.mo15628a(str, "GET", null, null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final bbm<atl> mo14892a(atl atl) {
        return bbm.m15927a(atl, C4037og.m17522a(atl));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* synthetic */ void mo14896a(Object obj) {
        atl atl = (atl) obj;
        this.f13503c.mo15631a(atl.f12195c, atl.f12193a);
        C3980md mdVar = this.f13503c;
        byte[] bArr = atl.f12194b;
        if (C3980md.m17412c() && bArr != null) {
            mdVar.mo15632a(bArr);
        }
        this.f13501a.mo15686b(atl);
    }
}
