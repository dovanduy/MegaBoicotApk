package com.google.android.gms.common;

import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.C3457ar;
import com.google.android.gms.common.internal.C3458as;
import com.google.android.gms.common.internal.C3513t;
import com.google.android.gms.p137b.C3235a;
import com.google.android.gms.p137b.C3238b;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/* renamed from: com.google.android.gms.common.q */
abstract class C3528q extends C3458as {

    /* renamed from: a */
    private int f10099a;

    protected C3528q(byte[] bArr) {
        C3513t.m12635b(bArr.length == 25);
        this.f10099a = Arrays.hashCode(bArr);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public abstract byte[] mo13629c();

    public int hashCode() {
        return this.f10099a;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C3457ar)) {
            return false;
        }
        try {
            C3457ar arVar = (C3457ar) obj;
            if (arVar.mo13520b() != hashCode()) {
                return false;
            }
            C3235a a = arVar.mo13519a();
            if (a == null) {
                return false;
            }
            return Arrays.equals(mo13629c(), (byte[]) C3238b.m11574a(a));
        } catch (RemoteException e) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
            return false;
        }
    }

    /* renamed from: a */
    public final C3235a mo13519a() {
        return C3238b.m11573a(mo13629c());
    }

    /* renamed from: b */
    public final int mo13520b() {
        return hashCode();
    }

    /* renamed from: a */
    protected static byte[] m12658a(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }
}
