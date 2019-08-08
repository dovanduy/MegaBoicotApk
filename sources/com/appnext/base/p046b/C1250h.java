package com.appnext.base.p046b;

import android.text.TextUtils;
import android.util.Base64;
import com.facebook.ads.AudienceNetworkActivity;
import com.google.android.exoplayer2.C2793C;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.zip.CRC32;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.appnext.base.b.h */
public final class C1250h {

    /* renamed from: js */
    private static final String f3976js = "rasre";

    /* renamed from: jt */
    private static final C1250h f3977jt = new C1250h();

    private static void init() {
    }

    private C1250h() {
    }

    /* renamed from: ci */
    public static C1250h m5296ci() {
        return f3977jt;
    }

    /* renamed from: ax */
    public static Long m5294ax(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            CRC32 crc32 = new CRC32();
            crc32.update(str.getBytes());
            return Long.valueOf(crc32.getValue());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: ay */
    public static String m5295ay(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            CRC32 crc32 = new CRC32();
            crc32.update(str.getBytes());
            return Long.toHexString(crc32.getValue());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: g */
    public final byte[] mo5961g(String str, String str2) {
        try {
            if (!TextUtils.isEmpty(str)) {
                if (!TextUtils.isEmpty(str2)) {
                    byte[] bArr = new byte[16];
                    new SecureRandom().nextBytes(bArr);
                    Cipher instance = Cipher.getInstance("AES/CBC/PKCS5Padding");
                    instance.init(1, new SecretKeySpec(Base64.decode(str2, 2), "AES"), new IvParameterSpec(bArr));
                    return m5292a(bArr, instance.doFinal(str.getBytes(C2793C.UTF8_NAME)));
                }
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: az */
    public final String mo5960az(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            byte[] bArr = new byte[16];
            new SecureRandom().nextBytes(bArr);
            Cipher instance = Cipher.getInstance("AES/CBC/PKCS5Padding");
            String string = C1251i.m5302ck().getString(f3976js, null);
            if (TextUtils.isEmpty(string)) {
                string = m5297cj();
                C1251i.m5302ck().putString(f3976js, string);
            }
            if (TextUtils.isEmpty(string)) {
                return null;
            }
            byte[] aA = m5293aA(string);
            if (aA == null) {
                return null;
            }
            instance.init(1, new SecretKeySpec(aA, "AES"), new IvParameterSpec(bArr));
            return Base64.encodeToString(m5292a(bArr, instance.doFinal(str.getBytes(AudienceNetworkActivity.WEBVIEW_ENCODING))), 2);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: aA */
    private static byte[] m5293aA(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(C1248f.getKey());
            return Arrays.copyOf(sb.toString().getBytes(AudienceNetworkActivity.WEBVIEW_ENCODING), 16);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: aB */
    public final String mo5958aB(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            byte[] decode = Base64.decode(str, 2);
            byte[] copyOfRange = Arrays.copyOfRange(decode, 0, 16);
            byte[] copyOfRange2 = Arrays.copyOfRange(decode, 16, decode.length);
            Cipher instance = Cipher.getInstance("AES/CBC/PKCS5Padding");
            StringBuilder sb = new StringBuilder();
            sb.append(C1251i.m5302ck().getString(f3976js, null));
            sb.append(C1248f.getKey());
            String sb2 = sb.toString();
            if (TextUtils.isEmpty(sb2)) {
                return null;
            }
            byte[] aA = m5293aA(sb2);
            if (aA == null) {
                return null;
            }
            instance.init(2, new SecretKeySpec(aA, "AES"), new IvParameterSpec(copyOfRange));
            return new String(instance.doFinal(copyOfRange2), AudienceNetworkActivity.WEBVIEW_ENCODING);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: cj */
    private static String m5297cj() {
        try {
            KeyGenerator instance = KeyGenerator.getInstance("AES");
            instance.init(128);
            return Base64.encodeToString(instance.generateKey().getEncoded(), 0);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    private static byte[] m5292a(byte[] bArr, byte[] bArr2) {
        int i = 0;
        byte[] bArr3 = new byte[(bArr2.length + 16)];
        while (i < bArr3.length) {
            bArr3[i] = i < 16 ? bArr[i] : bArr2[i - 16];
            i++;
        }
        return bArr3;
    }

    /* renamed from: aC */
    public final String mo5959aC(String str) {
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA-256");
            instance.update(str.getBytes());
            byte[] digest = instance.digest();
            StringBuffer stringBuffer = new StringBuffer();
            for (byte b : digest) {
                String hexString = Integer.toHexString(b & 255);
                if (hexString.length() == 1) {
                    stringBuffer.append('0');
                }
                stringBuffer.append(hexString);
            }
            return stringBuffer.toString();
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    private static String m5291a(byte[] bArr) {
        StringBuffer stringBuffer = new StringBuffer();
        for (byte b : bArr) {
            String hexString = Integer.toHexString(b & 255);
            if (hexString.length() == 1) {
                stringBuffer.append('0');
            }
            stringBuffer.append(hexString);
        }
        return stringBuffer.toString();
    }
}
