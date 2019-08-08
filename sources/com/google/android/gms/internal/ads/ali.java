package com.google.android.gms.internal.ads;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
@C3718cm
public abstract class ali {

    /* renamed from: b */
    private static MessageDigest f11361b;

    /* renamed from: a */
    protected Object f11362a = new Object();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final MessageDigest mo14493a() {
        synchronized (this.f11362a) {
            if (f11361b != null) {
                MessageDigest messageDigest = f11361b;
                return messageDigest;
            }
            for (int i = 0; i < 2; i++) {
                try {
                    f11361b = MessageDigest.getInstance("MD5");
                } catch (NoSuchAlgorithmException unused) {
                }
            }
            MessageDigest messageDigest2 = f11361b;
            return messageDigest2;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract byte[] mo14494a(String str);
}
