package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.C4347yl;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.Provider;
import java.security.Security;
import java.security.Signature;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import javax.crypto.Mac;

/* renamed from: com.google.android.gms.internal.ads.yk */
public final class C4346yk<T_WRAPPER extends C4347yl<T_ENGINE>, T_ENGINE> {

    /* renamed from: a */
    public static final C4346yk<C4349yn, Cipher> f14250a = new C4346yk<>(new C4349yn());

    /* renamed from: b */
    public static final C4346yk<C4353yr, Mac> f14251b = new C4346yk<>(new C4353yr());

    /* renamed from: c */
    public static final C4346yk<C4350yo, KeyAgreement> f14252c = new C4346yk<>(new C4350yo());

    /* renamed from: d */
    public static final C4346yk<C4352yq, KeyPairGenerator> f14253d = new C4346yk<>(new C4352yq());

    /* renamed from: e */
    public static final C4346yk<C4351yp, KeyFactory> f14254e = new C4346yk<>(new C4351yp());

    /* renamed from: f */
    private static final Logger f14255f = Logger.getLogger(C4346yk.class.getName());

    /* renamed from: g */
    private static final List<Provider> f14256g;

    /* renamed from: h */
    private static final C4346yk<C4355yt, Signature> f14257h = new C4346yk<>(new C4355yt());

    /* renamed from: i */
    private static final C4346yk<C4354ys, MessageDigest> f14258i = new C4346yk<>(new C4354ys());

    /* renamed from: j */
    private T_WRAPPER f14259j;

    /* renamed from: k */
    private List<Provider> f14260k = f14256g;

    /* renamed from: l */
    private boolean f14261l = true;

    static {
        if (C4365zc.m18710a()) {
            String[] strArr = {"GmsCore_OpenSSL", "AndroidOpenSSL"};
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < 2; i++) {
                String str = strArr[i];
                Provider provider = Security.getProvider(str);
                if (provider != null) {
                    arrayList.add(provider);
                } else {
                    f14255f.logp(Level.INFO, "com.google.crypto.tink.subtle.EngineFactory", "toProviderList", String.format("Provider %s not available", new Object[]{str}));
                }
            }
            f14256g = arrayList;
        } else {
            f14256g = new ArrayList();
        }
    }

    private C4346yk(T_WRAPPER t_wrapper) {
        this.f14259j = t_wrapper;
    }

    /* renamed from: a */
    private final boolean m18677a(String str, Provider provider) {
        try {
            this.f14259j.mo16219a(str, provider);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: a */
    public final T_ENGINE mo16218a(String str) throws GeneralSecurityException {
        T_WRAPPER t_wrapper;
        Provider provider;
        Iterator it = this.f14260k.iterator();
        while (true) {
            if (it.hasNext()) {
                provider = (Provider) it.next();
                if (m18677a(str, provider)) {
                    t_wrapper = this.f14259j;
                    break;
                }
            } else if (this.f14261l) {
                t_wrapper = this.f14259j;
                provider = null;
            } else {
                throw new GeneralSecurityException("No good Provider found.");
            }
        }
        return t_wrapper.mo16219a(str, provider);
    }
}
