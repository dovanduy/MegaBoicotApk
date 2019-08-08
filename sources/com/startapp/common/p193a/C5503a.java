package com.startapp.common.p193a;

import android.util.Base64;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.security.MessageDigest;

/* renamed from: com.startapp.common.a.a */
/* compiled from: StartAppSDK */
public class C5503a {

    /* renamed from: a */
    private static final byte[] f17543a = {10, 30, 84, 95, 101, 20, 0, 14, 15, 80, 36, 84, 64, 82, 84, 64, 80, 80, 65, 78, 84, 73, 70, 82, 65, 85, 68, 75, 69, 89, 1, 2, 3, 8, 15, 42, 10, 51, 44, 32};

    /* renamed from: b */
    private static final String f17544b = new String("ts");

    /* renamed from: c */
    private static final String f17545c = new String("tsh");

    /* renamed from: d */
    private static final String f17546d = new String("afh");

    /* renamed from: e */
    private static final String f17547e = new String("MD5");

    /* renamed from: f */
    private static final String f17548f = new String("UTF-8");

    /* renamed from: g */
    private static final byte[] f17549g = {12, 31, 86, 96, 103, 10, 28, 15, 17, 28, 36, 84, 64, 82, 84, 64, 80, 80, 69, 78, 67, 82, 89, 80, 84, 73, 79, 78, 75, 69, 89, 4, 32, 18, 16, 18, 11, 53, 45, 34};

    /* renamed from: a */
    public static String m23471a() {
        return f17544b;
    }

    /* renamed from: b */
    public static String m23475b() {
        return f17545c;
    }

    /* renamed from: c */
    public static String m23477c() {
        return f17546d;
    }

    /* renamed from: a */
    public static String m23472a(String str) {
        String str2;
        if (str != null) {
            try {
                str2 = URLDecoder.decode(str, f17548f);
            } catch (UnsupportedEncodingException unused) {
                str2 = "";
            }
        } else {
            str2 = "";
        }
        String d = m23479d();
        StringBuilder sb = new StringBuilder();
        sb.append("&");
        sb.append(f17544b);
        sb.append("=");
        sb.append(d);
        sb.append("&");
        sb.append(f17546d);
        sb.append("=");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str2);
        sb2.append(d);
        sb.append(m23476b(sb2.toString()));
        return sb.toString();
    }

    /* renamed from: d */
    public static String m23479d() {
        int hashCode = f17543a.hashCode();
        long currentTimeMillis = System.currentTimeMillis();
        if (hashCode > 0) {
            int i = (int) ((((currentTimeMillis * 25214903917L) + 11) & 281474976710655L) >>> 17);
            if (((-hashCode) & hashCode) != hashCode) {
                int i2 = i % hashCode;
            }
        }
        return new Long(System.currentTimeMillis()).toString();
    }

    /* renamed from: b */
    public static String m23476b(String str) {
        byte[] bytes = str.getBytes();
        byte[] bArr = f17543a;
        int length = bytes.length < bArr.length ? bytes.length : bArr.length;
        for (int i = 0; i < length; i++) {
            byte b = bytes[i];
            byte b2 = bArr[i];
        }
        try {
            return URLEncoder.encode(Base64.encodeToString(MessageDigest.getInstance(f17547e).digest(m23474a(m23473a(str.getBytes(), (int) f17543a[5]), new String(f17543a).substring(f17543a[0], f17543a[1]).getBytes())), 3), f17548f);
        } catch (Exception e) {
            C5518g.m23562a(6, "error", (Throwable) e);
            return "";
        }
    }

    /* renamed from: c */
    public static String m23478c(String str) {
        int hashCode = f17549g.hashCode();
        long hashCode2 = (long) str.getBytes().hashCode();
        if (((long) hashCode) > hashCode2) {
            long j = ((hashCode2 * 29509871405L) + 11) & 16777215;
            int i = (int) (j >>> 17);
            if (hashCode < 1000) {
                int i2 = (((long) (hashCode & (-hashCode))) > j ? 1 : (((long) (hashCode & (-hashCode))) == j ? 0 : -1));
            } else {
                int i3 = i % hashCode;
            }
        }
        try {
            return Base64.encodeToString(m23474a(m23474a(str.getBytes(), new String(f17549g).substring(f17549g[5], f17549g[33]).getBytes()), new String(f17549g).substring(f17549g[35], f17549g[1]).getBytes()), 0);
        } catch (Exception unused) {
            return str;
        }
    }

    /* renamed from: a */
    public static byte[] m23474a(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[bArr.length];
        for (int i = 0; i < bArr.length; i++) {
            bArr3[i] = (byte) (bArr[i] ^ bArr2[i % bArr2.length]);
        }
        return bArr3;
    }

    /* renamed from: a */
    public static byte[] m23473a(byte[] bArr, int i) {
        byte[] bArr2 = new byte[Math.min(bArr.length, i)];
        for (int i2 = 0; i2 < bArr.length; i2++) {
            int i3 = i2 % i;
            bArr2[i3] = (byte) (bArr2[i3] ^ bArr[i2]);
        }
        return bArr2;
    }
}
