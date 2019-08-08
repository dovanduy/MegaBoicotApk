package com.google.android.gms.internal.ads;

import com.google.android.exoplayer2.C2793C;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class aiw {

    /* renamed from: a */
    private static final String f11155a = "aiw";

    /* renamed from: b */
    private final ahn f11156b;

    /* renamed from: c */
    private final String f11157c;

    /* renamed from: d */
    private final String f11158d;

    /* renamed from: e */
    private final int f11159e = 2;

    /* renamed from: f */
    private volatile Method f11160f = null;

    /* renamed from: g */
    private final Class<?>[] f11161g;

    /* renamed from: h */
    private CountDownLatch f11162h = new CountDownLatch(1);

    public aiw(ahn ahn, String str, String str2, Class<?>... clsArr) {
        this.f11156b = ahn;
        this.f11157c = str;
        this.f11158d = str2;
        this.f11161g = clsArr;
        this.f11156b.mo14307c().submit(new aix(this));
    }

    /* renamed from: a */
    private final String m14205a(byte[] bArr, String str) throws agz, UnsupportedEncodingException {
        return new String(this.f11156b.mo14309e().mo14292a(bArr, str), C2793C.UTF8_NAME);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m14207b() {
        try {
            Class loadClass = this.f11156b.mo14308d().loadClass(m14205a(this.f11156b.mo14310f(), this.f11157c));
            if (loadClass != null) {
                this.f11160f = loadClass.getMethod(m14205a(this.f11156b.mo14310f(), this.f11158d), this.f11161g);
                Method method = this.f11160f;
            }
        } catch (agz | UnsupportedEncodingException | ClassNotFoundException | NoSuchMethodException | NullPointerException unused) {
        } catch (Throwable th) {
            this.f11162h.countDown();
            throw th;
        }
        this.f11162h.countDown();
    }

    /* renamed from: a */
    public final Method mo14350a() {
        if (this.f11160f != null) {
            return this.f11160f;
        }
        try {
            if (!this.f11162h.await(2, TimeUnit.SECONDS)) {
                return null;
            }
            return this.f11160f;
        } catch (InterruptedException unused) {
            return null;
        }
    }
}
