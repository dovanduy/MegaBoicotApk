package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.C4300xc.C4302b;
import java.security.GeneralSecurityException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: com.google.android.gms.internal.ads.tw */
public final class C4188tw {

    /* renamed from: a */
    private static final Logger f14088a = Logger.getLogger(C4188tw.class.getName());

    /* renamed from: b */
    private static final ConcurrentMap<String, C4180to> f14089b = new ConcurrentHashMap();

    /* renamed from: c */
    private static final ConcurrentMap<String, Boolean> f14090c = new ConcurrentHashMap();

    /* renamed from: d */
    private static final ConcurrentMap<String, C4174ti> f14091d = new ConcurrentHashMap();

    /* renamed from: a */
    public static <P> acl m18200a(String str, acl acl) throws GeneralSecurityException {
        C4180to b = m18210b(str);
        if (((Boolean) f14090c.get(str)).booleanValue()) {
            return b.mo16081b(acl);
        }
        String str2 = "newKey-operation not permitted for key type ";
        String valueOf = String.valueOf(str);
        throw new GeneralSecurityException(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
    }

    /* renamed from: a */
    public static <P> C4174ti<P> m18201a(String str) throws GeneralSecurityException {
        String valueOf;
        String str2;
        if (str == null) {
            throw new IllegalArgumentException("catalogueName must be non-null.");
        }
        C4174ti<P> tiVar = (C4174ti) f14091d.get(str.toLowerCase());
        if (tiVar != null) {
            return tiVar;
        }
        String format = String.format("no catalogue found for %s. ", new Object[]{str});
        if (str.toLowerCase().startsWith("tinkaead")) {
            format = String.valueOf(format).concat("Maybe call AeadConfig.init().");
        }
        if (str.toLowerCase().startsWith("tinkdeterministicaead")) {
            valueOf = String.valueOf(format);
            str2 = "Maybe call DeterministicAeadConfig.init().";
        } else if (str.toLowerCase().startsWith("tinkstreamingaead")) {
            valueOf = String.valueOf(format);
            str2 = "Maybe call StreamingAeadConfig.init().";
        } else if (str.toLowerCase().startsWith("tinkhybriddecrypt") || str.toLowerCase().startsWith("tinkhybridencrypt")) {
            valueOf = String.valueOf(format);
            str2 = "Maybe call HybridConfig.init().";
        } else if (str.toLowerCase().startsWith("tinkmac")) {
            valueOf = String.valueOf(format);
            str2 = "Maybe call MacConfig.init().";
        } else if (str.toLowerCase().startsWith("tinkpublickeysign") || str.toLowerCase().startsWith("tinkpublickeyverify")) {
            valueOf = String.valueOf(format);
            str2 = "Maybe call SignatureConfig.init().";
        } else {
            if (str.toLowerCase().startsWith("tink")) {
                valueOf = String.valueOf(format);
                str2 = "Maybe call TinkConfig.init().";
            }
            throw new GeneralSecurityException(format);
        }
        format = valueOf.concat(str2);
        throw new GeneralSecurityException(format);
    }

    /* renamed from: a */
    public static <P> C4186tu<P> m18202a(C4181tp tpVar, C4180to<P> toVar) throws GeneralSecurityException {
        C4189tx.m18213b(tpVar.mo16084a());
        C4186tu<P> tuVar = new C4186tu<>();
        for (C4302b bVar : tpVar.mo16084a().mo16184b()) {
            if (bVar.mo16188c() == C4291ww.ENABLED) {
                C4187tv a = tuVar.mo16090a(m18204a(bVar.mo16187b().mo16165a(), bVar.mo16187b().mo16166b()), bVar);
                if (bVar.mo16189d() == tpVar.mo16084a().mo16183a()) {
                    tuVar.mo16091a(a);
                }
            }
        }
        return tuVar;
    }

    /* renamed from: a */
    public static <P> C4286wt m18203a(C4293wy wyVar) throws GeneralSecurityException {
        C4180to b = m18210b(wyVar.mo16171a());
        if (((Boolean) f14090c.get(wyVar.mo16171a())).booleanValue()) {
            return b.mo16083c(wyVar.mo16172b());
        }
        String str = "newKey-operation not permitted for key type ";
        String valueOf = String.valueOf(wyVar.mo16171a());
        throw new GeneralSecurityException(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
    }

    /* renamed from: a */
    private static <P> P m18204a(String str, C4386zw zwVar) throws GeneralSecurityException {
        return m18210b(str).mo16080a(zwVar);
    }

    /* renamed from: a */
    public static <P> P m18205a(String str, byte[] bArr) throws GeneralSecurityException {
        return m18204a(str, C4386zw.m18762a(bArr));
    }

    /* renamed from: a */
    public static synchronized <P> void m18206a(String str, C4174ti<P> tiVar) throws GeneralSecurityException {
        synchronized (C4188tw.class) {
            if (f14091d.containsKey(str.toLowerCase())) {
                if (!tiVar.getClass().equals(((C4174ti) f14091d.get(str.toLowerCase())).getClass())) {
                    Logger logger = f14088a;
                    Level level = Level.WARNING;
                    String str2 = "com.google.crypto.tink.Registry";
                    String str3 = "addCatalogue";
                    String str4 = "Attempted overwrite of a catalogueName catalogue for name ";
                    String valueOf = String.valueOf(str);
                    logger.logp(level, str2, str3, valueOf.length() != 0 ? str4.concat(valueOf) : new String(str4));
                    StringBuilder sb = new StringBuilder(47 + String.valueOf(str).length());
                    sb.append("catalogue for name ");
                    sb.append(str);
                    sb.append(" has been already registered");
                    throw new GeneralSecurityException(sb.toString());
                }
            }
            f14091d.put(str.toLowerCase(), tiVar);
        }
    }

    /* renamed from: a */
    public static <P> void m18207a(String str, C4180to<P> toVar) throws GeneralSecurityException {
        m18208a(str, toVar, true);
    }

    /* renamed from: a */
    public static synchronized <P> void m18208a(String str, C4180to<P> toVar, boolean z) throws GeneralSecurityException {
        synchronized (C4188tw.class) {
            if (toVar == null) {
                try {
                    throw new IllegalArgumentException("key manager must be non-null.");
                } catch (Throwable th) {
                    throw th;
                }
            } else {
                if (f14089b.containsKey(str)) {
                    C4180to b = m18210b(str);
                    boolean booleanValue = ((Boolean) f14090c.get(str)).booleanValue();
                    if (!toVar.getClass().equals(b.getClass()) || (!booleanValue && z)) {
                        Logger logger = f14088a;
                        Level level = Level.WARNING;
                        String str2 = "com.google.crypto.tink.Registry";
                        String str3 = "registerKeyManager";
                        String str4 = "Attempted overwrite of a registered key manager for key type ";
                        String valueOf = String.valueOf(str);
                        logger.logp(level, str2, str3, valueOf.length() != 0 ? str4.concat(valueOf) : new String(str4));
                        throw new GeneralSecurityException(String.format("typeUrl (%s) is already registered with %s, cannot be re-registered with %s", new Object[]{str, b.getClass().getName(), toVar.getClass().getName()}));
                    }
                }
                f14089b.put(str, toVar);
                f14090c.put(str, Boolean.valueOf(z));
            }
        }
    }

    /* renamed from: b */
    public static <P> acl m18209b(C4293wy wyVar) throws GeneralSecurityException {
        C4180to b = m18210b(wyVar.mo16171a());
        if (((Boolean) f14090c.get(wyVar.mo16171a())).booleanValue()) {
            return b.mo16082b(wyVar.mo16172b());
        }
        String str = "newKey-operation not permitted for key type ";
        String valueOf = String.valueOf(wyVar.mo16171a());
        throw new GeneralSecurityException(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
    }

    /* renamed from: b */
    private static <P> C4180to<P> m18210b(String str) throws GeneralSecurityException {
        C4180to<P> toVar = (C4180to) f14089b.get(str);
        if (toVar != null) {
            return toVar;
        }
        StringBuilder sb = new StringBuilder(78 + String.valueOf(str).length());
        sb.append("No key manager found for key type: ");
        sb.append(str);
        sb.append(".  Check the configuration of the registry.");
        throw new GeneralSecurityException(sb.toString());
    }

    /* renamed from: b */
    public static <P> P m18211b(String str, acl acl) throws GeneralSecurityException {
        return m18210b(str).mo16079a(acl);
    }
}
