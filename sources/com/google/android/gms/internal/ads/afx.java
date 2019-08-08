package com.google.android.gms.internal.ads;

import com.google.android.exoplayer2.C2793C;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

final class afx {

    /* renamed from: a */
    static CountDownLatch f10771a = new CountDownLatch(1);

    /* renamed from: b */
    private static boolean f10772b = false;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static MessageDigest f10773c;

    /* renamed from: d */
    private static final Object f10774d = new Object();

    /* renamed from: e */
    private static final Object f10775e = new Object();

    /* renamed from: a */
    private static C4378zo m14037a(long j) {
        C4378zo zoVar = new C4378zo();
        zoVar.f14339k = Long.valueOf(4096);
        return zoVar;
    }

    /* renamed from: a */
    static String m14038a(C4378zo zoVar, String str) throws GeneralSecurityException, UnsupportedEncodingException {
        byte[] bArr;
        byte[] a = afc.m13976a((afc) zoVar);
        if (((Boolean) aoq.m14620f().mo14695a(aru.f11840bL)).booleanValue()) {
            Vector a2 = m14040a(a, 255);
            if (a2 == null || a2.size() == 0) {
                bArr = m14043a(afc.m13976a((afc) m14037a(4096)), str, true);
            } else {
                aft aft = new aft();
                aft.f10761a = new byte[a2.size()][];
                Iterator it = a2.iterator();
                int i = 0;
                while (it.hasNext()) {
                    int i2 = i + 1;
                    aft.f10761a[i] = m14043a((byte[]) it.next(), str, false);
                    i = i2;
                }
                aft.f10762b = m14042a(a);
                bArr = afc.m13976a((afc) aft);
            }
        } else if (aht.f11089a == null) {
            throw new GeneralSecurityException();
        } else {
            byte[] a3 = aht.f11089a.mo16077a(a, str != null ? str.getBytes() : new byte[0]);
            aft aft2 = new aft();
            aft2.f10761a = new byte[][]{a3};
            aft2.f10763c = Integer.valueOf(2);
            bArr = afc.m13976a((afc) aft2);
        }
        return afv.m14033a(bArr, true);
    }

    /* renamed from: a */
    private static Vector<byte[]> m14040a(byte[] bArr, int i) {
        if (bArr == null || bArr.length <= 0) {
            return null;
        }
        int length = ((bArr.length + 255) - 1) / 255;
        Vector<byte[]> vector = new Vector<>();
        int i2 = 0;
        while (i2 < length) {
            int i3 = i2 * 255;
            try {
                vector.add(Arrays.copyOfRange(bArr, i3, bArr.length - i3 > 255 ? i3 + 255 : bArr.length));
                i2++;
            } catch (IndexOutOfBoundsException unused) {
                return null;
            }
        }
        return vector;
    }

    /* renamed from: a */
    static void m14041a() {
        synchronized (f10775e) {
            if (!f10772b) {
                f10772b = true;
                new Thread(new afz()).start();
            }
        }
    }

    /* renamed from: a */
    public static byte[] m14042a(byte[] bArr) throws NoSuchAlgorithmException {
        byte[] digest;
        synchronized (f10774d) {
            MessageDigest b = m14044b();
            if (b == null) {
                throw new NoSuchAlgorithmException("Cannot compute hash");
            }
            b.reset();
            b.update(bArr);
            digest = f10773c.digest();
        }
        return digest;
    }

    /* renamed from: a */
    private static byte[] m14043a(byte[] bArr, String str, boolean z) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        ByteBuffer put;
        int i = z ? 239 : 255;
        if (bArr.length > i) {
            bArr = afc.m13976a((afc) m14037a(4096));
        }
        if (bArr.length < i) {
            byte[] bArr2 = new byte[(i - bArr.length)];
            new SecureRandom().nextBytes(bArr2);
            put = ByteBuffer.allocate(i + 1).put((byte) bArr.length).put(bArr).put(bArr2);
        } else {
            put = ByteBuffer.allocate(i + 1).put((byte) bArr.length).put(bArr);
        }
        byte[] array = put.array();
        if (z) {
            array = ByteBuffer.allocate(256).put(m14042a(array)).put(array).array();
        }
        byte[] bArr3 = new byte[256];
        for (agc a : new aga().f10922cN) {
            a.mo14275a(array, bArr3);
        }
        if (str != null && str.length() > 0) {
            if (str.length() > 32) {
                str = str.substring(0, 32);
            }
            new C4374zk(str.getBytes(C2793C.UTF8_NAME)).mo16227a(bArr3);
        }
        return bArr3;
    }

    /* renamed from: b */
    private static MessageDigest m14044b() {
        boolean z;
        m14041a();
        try {
            z = f10771a.await(2, TimeUnit.SECONDS);
        } catch (InterruptedException unused) {
            z = false;
        }
        if (z && f10773c != null) {
            return f10773c;
        }
        return null;
    }
}
