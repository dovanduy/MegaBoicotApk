package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.C4286wt.C4288b;
import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.ads.uc */
final class C4195uc implements C4180to<C4172tg> {
    C4195uc() {
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public final C4172tg mo16080a(C4386zw zwVar) throws GeneralSecurityException {
        try {
            C4232vh a = C4232vh.m18356a(zwVar);
            if (!(a instanceof C4232vh)) {
                throw new GeneralSecurityException("expected AesEaxKey proto");
            }
            C4232vh vhVar = a;
            C4366zd.m18712a(vhVar.mo16114a(), 0);
            C4366zd.m18711a(vhVar.mo16116c().mo13769a());
            if (vhVar.mo16115b().mo16122a() == 12 || vhVar.mo16115b().mo16122a() == 16) {
                return new C4329xu(vhVar.mo16116c().mo16234b(), vhVar.mo16115b().mo16122a());
            }
            throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
        } catch (abk e) {
            throw new GeneralSecurityException("expected serialized AesEaxKey proto", e);
        }
    }

    /* renamed from: a */
    public final int mo16078a() {
        return 0;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo16079a(acl acl) throws GeneralSecurityException {
        if (!(acl instanceof C4232vh)) {
            throw new GeneralSecurityException("expected AesEaxKey proto");
        }
        C4232vh vhVar = (C4232vh) acl;
        C4366zd.m18712a(vhVar.mo16114a(), 0);
        C4366zd.m18711a(vhVar.mo16116c().mo13769a());
        if (vhVar.mo16115b().mo16122a() == 12 || vhVar.mo16115b().mo16122a() == 16) {
            return new C4329xu(vhVar.mo16116c().mo16234b(), vhVar.mo16115b().mo16122a());
        }
        throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
    }

    /* renamed from: b */
    public final acl mo16081b(acl acl) throws GeneralSecurityException {
        if (!(acl instanceof C4236vk)) {
            throw new GeneralSecurityException("expected AesEaxKeyFormat proto");
        }
        C4236vk vkVar = (C4236vk) acl;
        C4366zd.m18711a(vkVar.mo16121b());
        if (vkVar.mo16120a().mo16122a() == 12 || vkVar.mo16120a().mo16122a() == 16) {
            return C4232vh.m18363d().mo16119a(C4386zw.m18762a(C4360yy.m18699a(vkVar.mo16121b()))).mo16118a(vkVar.mo16120a()).mo16117a(0).mo13995c();
        }
        throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
    }

    /* renamed from: b */
    public final acl mo16082b(C4386zw zwVar) throws GeneralSecurityException {
        try {
            return mo16081b((acl) C4236vk.m18375a(zwVar));
        } catch (abk e) {
            throw new GeneralSecurityException("expected serialized AesEaxKeyFormat proto", e);
        }
    }

    /* renamed from: c */
    public final C4286wt mo16083c(C4386zw zwVar) throws GeneralSecurityException {
        return (C4286wt) C4286wt.m18516d().mo16170a("type.googleapis.com/google.crypto.tink.AesEaxKey").mo16169a(((C4232vh) mo16082b(zwVar)).mo14067h()).mo16168a(C4288b.SYMMETRIC).mo13995c();
    }
}
