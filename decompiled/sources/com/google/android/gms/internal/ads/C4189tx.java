package com.google.android.gms.internal.ads;

import com.google.android.exoplayer2.C2793C;
import com.google.android.gms.internal.ads.C4286wt.C4288b;
import com.google.android.gms.internal.ads.C4300xc.C4302b;
import com.google.android.gms.internal.ads.C4305xe.C4306a;
import com.google.android.gms.internal.ads.C4305xe.C4307b;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.ads.tx */
final class C4189tx {

    /* renamed from: a */
    private static final Charset f14092a = Charset.forName(C2793C.UTF8_NAME);

    /* renamed from: a */
    public static C4305xe m18212a(C4300xc xcVar) {
        C4306a a = C4305xe.m18574a().mo16191a(xcVar.mo16183a());
        for (C4302b bVar : xcVar.mo16184b()) {
            a.mo16192a((C4307b) C4307b.m18583a().mo16196a(bVar.mo16187b().mo16165a()).mo16194a(bVar.mo16188c()).mo16195a(bVar.mo16190e()).mo16193a(bVar.mo16189d()).mo13995c());
        }
        return (C4305xe) a.mo13995c();
    }

    /* renamed from: b */
    public static void m18213b(C4300xc xcVar) throws GeneralSecurityException {
        if (xcVar.mo16185c() == 0) {
            throw new GeneralSecurityException("empty keyset");
        }
        int a = xcVar.mo16183a();
        boolean z = true;
        boolean z2 = false;
        for (C4302b bVar : xcVar.mo16184b()) {
            if (!bVar.mo16186a()) {
                throw new GeneralSecurityException(String.format("key %d has no key data", new Object[]{Integer.valueOf(bVar.mo16189d())}));
            } else if (bVar.mo16190e() == C4323xp.UNKNOWN_PREFIX) {
                throw new GeneralSecurityException(String.format("key %d has unknown prefix", new Object[]{Integer.valueOf(bVar.mo16189d())}));
            } else if (bVar.mo16188c() == C4291ww.UNKNOWN_STATUS) {
                throw new GeneralSecurityException(String.format("key %d has unknown status", new Object[]{Integer.valueOf(bVar.mo16189d())}));
            } else {
                if (bVar.mo16188c() == C4291ww.ENABLED && bVar.mo16189d() == a) {
                    if (z2) {
                        throw new GeneralSecurityException("keyset contains multiple primary keys");
                    }
                    z2 = true;
                }
                if (bVar.mo16187b().mo16167c() != C4288b.ASYMMETRIC_PUBLIC) {
                    z = false;
                }
            }
        }
        if (!z2 && !z) {
            throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
        }
    }
}
