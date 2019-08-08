package com.google.android.gms.internal.ads;

import java.io.IOException;

public abstract class afc {

    /* renamed from: Z */
    protected volatile int f10689Z = -1;

    /* renamed from: a */
    public static final <T extends afc> T m13974a(T t, byte[] bArr) throws afb {
        return m13975a(t, bArr, 0, bArr.length);
    }

    /* renamed from: a */
    private static final <T extends afc> T m13975a(T t, byte[] bArr, int i, int i2) throws afb {
        try {
            aes a = aes.m13901a(bArr, 0, i2);
            t.mo13937a(a);
            a.mo14218a(0);
            return t;
        } catch (afb e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException("Reading from a byte array threw an IOException (should never happen).", e2);
        }
    }

    /* renamed from: a */
    public static final byte[] m13976a(afc afc) {
        byte[] bArr = new byte[afc.mo14264d()];
        try {
            aeu a = aeu.m13931a(bArr, 0, bArr.length);
            afc.mo13938a(a);
            a.mo14235a();
            return bArr;
        } catch (IOException e) {
            throw new RuntimeException("Serializing to a byte array threw an IOException (should never happen).", e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo13936a() {
        return 0;
    }

    /* renamed from: a */
    public abstract afc mo13937a(aes aes) throws IOException;

    /* renamed from: a */
    public void mo13938a(aeu aeu) throws IOException {
    }

    /* renamed from: c */
    public afc clone() throws CloneNotSupportedException {
        return (afc) super.clone();
    }

    /* renamed from: d */
    public final int mo14264d() {
        int a = mo13936a();
        this.f10689Z = a;
        return a;
    }

    public String toString() {
        return afd.m13982a(this);
    }
}
