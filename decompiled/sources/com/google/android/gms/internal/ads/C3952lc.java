package com.google.android.gms.internal.ads;

import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.lc */
final class C3952lc extends C4201ui {

    /* renamed from: a */
    private final /* synthetic */ byte[] f13494a;

    /* renamed from: b */
    private final /* synthetic */ Map f13495b;

    /* renamed from: c */
    private final /* synthetic */ C3980md f13496c;

    C3952lc(C3946kx kxVar, int i, String str, bdg bdg, bcn bcn, byte[] bArr, Map map, C3980md mdVar) {
        this.f13494a = bArr;
        this.f13495b = map;
        this.f13496c = mdVar;
        super(i, str, bdg, bcn);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* synthetic */ void mo14896a(Object obj) {
        mo14896a((String) obj);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo15599a(String str) {
        this.f13496c.mo15627a(str);
        super.mo14896a(str);
    }

    /* renamed from: a */
    public final byte[] mo14897a() throws C3631a {
        return this.f13494a == null ? super.mo14897a() : this.f13494a;
    }

    /* renamed from: b */
    public final Map<String, String> mo14898b() throws C3631a {
        return this.f13495b == null ? super.mo14898b() : this.f13495b;
    }
}
