package org.apache.p199a.p218f.p219a;

import com.google.android.exoplayer2.C2793C;
import java.io.UnsupportedEncodingException;
import java.security.Key;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.p230a.p231a.C6570a;
import org.apache.p199a.p229k.C6550c;

/* renamed from: org.apache.a.f.a.h */
/* compiled from: NTLMEngineImpl */
final class C6385h implements C6383f {

    /* renamed from: a */
    private static final SecureRandom f20940a;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static byte[] f20941c;

    /* renamed from: b */
    private String f20942b = "ASCII";

    /* renamed from: org.apache.a.f.a.h$a */
    /* compiled from: NTLMEngineImpl */
    static class C6386a {

        /* renamed from: a */
        protected byte[] f20943a;

        /* renamed from: b */
        protected byte[] f20944b;

        /* renamed from: c */
        protected MessageDigest f20945c;

        C6386a(byte[] bArr) throws C6384g {
            try {
                this.f20945c = MessageDigest.getInstance("MD5");
                this.f20943a = new byte[64];
                this.f20944b = new byte[64];
                int length = bArr.length;
                if (length > 64) {
                    this.f20945c.update(bArr);
                    bArr = this.f20945c.digest();
                    length = bArr.length;
                }
                int i = 0;
                while (i < length) {
                    this.f20943a[i] = (byte) (54 ^ bArr[i]);
                    this.f20944b[i] = (byte) (92 ^ bArr[i]);
                    i++;
                }
                while (i < 64) {
                    this.f20943a[i] = 54;
                    this.f20944b[i] = 92;
                    i++;
                }
                this.f20945c.reset();
                this.f20945c.update(this.f20943a);
            } catch (Exception e) {
                StringBuilder sb = new StringBuilder();
                sb.append("Error getting md5 message digest implementation: ");
                sb.append(e.getMessage());
                throw new C6384g(sb.toString(), e);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public byte[] mo22684a() {
            byte[] digest = this.f20945c.digest();
            this.f20945c.update(this.f20944b);
            return this.f20945c.digest(digest);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo22683a(byte[] bArr) {
            this.f20945c.update(bArr);
        }
    }

    /* renamed from: org.apache.a.f.a.h$b */
    /* compiled from: NTLMEngineImpl */
    static class C6387b {

        /* renamed from: a */
        protected int f20946a = 1732584193;

        /* renamed from: b */
        protected int f20947b = -271733879;

        /* renamed from: c */
        protected int f20948c = -1732584194;

        /* renamed from: d */
        protected int f20949d = 271733878;

        /* renamed from: e */
        protected long f20950e = 0;

        /* renamed from: f */
        protected byte[] f20951f = new byte[64];

        C6387b() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo22685a(byte[] bArr) {
            int i = (int) (this.f20950e & 63);
            int i2 = 0;
            while ((bArr.length - i2) + i >= this.f20951f.length) {
                int length = this.f20951f.length - i;
                System.arraycopy(bArr, i2, this.f20951f, i, length);
                this.f20950e += (long) length;
                i2 += length;
                mo22688b();
                i = 0;
            }
            if (i2 < bArr.length) {
                int length2 = bArr.length - i2;
                System.arraycopy(bArr, i2, this.f20951f, i, length2);
                this.f20950e += (long) length2;
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public byte[] mo22687a() {
            int i = (int) (this.f20950e & 63);
            int i2 = i < 56 ? 56 - i : 120 - i;
            byte[] bArr = new byte[(i2 + 8)];
            bArr[0] = Byte.MIN_VALUE;
            for (int i3 = 0; i3 < 8; i3++) {
                bArr[i2 + i3] = (byte) ((int) ((this.f20950e * 8) >>> (8 * i3)));
            }
            mo22685a(bArr);
            byte[] bArr2 = new byte[16];
            C6385h.m25240a(bArr2, this.f20946a, 0);
            C6385h.m25240a(bArr2, this.f20947b, 4);
            C6385h.m25240a(bArr2, this.f20948c, 8);
            C6385h.m25240a(bArr2, this.f20949d, 12);
            return bArr2;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void mo22688b() {
            int[] iArr = new int[16];
            for (int i = 0; i < 16; i++) {
                int i2 = i * 4;
                iArr[i] = (this.f20951f[i2] & 255) + ((this.f20951f[i2 + 1] & 255) << 8) + ((this.f20951f[i2 + 2] & 255) << 16) + ((this.f20951f[i2 + 3] & 255) << 24);
            }
            int i3 = this.f20946a;
            int i4 = this.f20947b;
            int i5 = this.f20948c;
            int i6 = this.f20949d;
            mo22686a(iArr);
            mo22689b(iArr);
            mo22690c(iArr);
            this.f20946a += i3;
            this.f20947b += i4;
            this.f20948c += i5;
            this.f20949d += i6;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo22686a(int[] iArr) {
            this.f20946a = C6385h.m25235a(this.f20946a + C6385h.m25236a(this.f20947b, this.f20948c, this.f20949d) + iArr[0], 3);
            this.f20949d = C6385h.m25235a(this.f20949d + C6385h.m25236a(this.f20946a, this.f20947b, this.f20948c) + iArr[1], 7);
            this.f20948c = C6385h.m25235a(this.f20948c + C6385h.m25236a(this.f20949d, this.f20946a, this.f20947b) + iArr[2], 11);
            this.f20947b = C6385h.m25235a(this.f20947b + C6385h.m25236a(this.f20948c, this.f20949d, this.f20946a) + iArr[3], 19);
            this.f20946a = C6385h.m25235a(this.f20946a + C6385h.m25236a(this.f20947b, this.f20948c, this.f20949d) + iArr[4], 3);
            this.f20949d = C6385h.m25235a(this.f20949d + C6385h.m25236a(this.f20946a, this.f20947b, this.f20948c) + iArr[5], 7);
            this.f20948c = C6385h.m25235a(this.f20948c + C6385h.m25236a(this.f20949d, this.f20946a, this.f20947b) + iArr[6], 11);
            this.f20947b = C6385h.m25235a(this.f20947b + C6385h.m25236a(this.f20948c, this.f20949d, this.f20946a) + iArr[7], 19);
            this.f20946a = C6385h.m25235a(this.f20946a + C6385h.m25236a(this.f20947b, this.f20948c, this.f20949d) + iArr[8], 3);
            this.f20949d = C6385h.m25235a(this.f20949d + C6385h.m25236a(this.f20946a, this.f20947b, this.f20948c) + iArr[9], 7);
            this.f20948c = C6385h.m25235a(this.f20948c + C6385h.m25236a(this.f20949d, this.f20946a, this.f20947b) + iArr[10], 11);
            this.f20947b = C6385h.m25235a(this.f20947b + C6385h.m25236a(this.f20948c, this.f20949d, this.f20946a) + iArr[11], 19);
            this.f20946a = C6385h.m25235a(this.f20946a + C6385h.m25236a(this.f20947b, this.f20948c, this.f20949d) + iArr[12], 3);
            this.f20949d = C6385h.m25235a(this.f20949d + C6385h.m25236a(this.f20946a, this.f20947b, this.f20948c) + iArr[13], 7);
            this.f20948c = C6385h.m25235a(this.f20948c + C6385h.m25236a(this.f20949d, this.f20946a, this.f20947b) + iArr[14], 11);
            this.f20947b = C6385h.m25235a(this.f20947b + C6385h.m25236a(this.f20948c, this.f20949d, this.f20946a) + iArr[15], 19);
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void mo22689b(int[] iArr) {
            this.f20946a = C6385h.m25235a(this.f20946a + C6385h.m25249b(this.f20947b, this.f20948c, this.f20949d) + iArr[0] + 1518500249, 3);
            this.f20949d = C6385h.m25235a(this.f20949d + C6385h.m25249b(this.f20946a, this.f20947b, this.f20948c) + iArr[4] + 1518500249, 5);
            this.f20948c = C6385h.m25235a(this.f20948c + C6385h.m25249b(this.f20949d, this.f20946a, this.f20947b) + iArr[8] + 1518500249, 9);
            this.f20947b = C6385h.m25235a(this.f20947b + C6385h.m25249b(this.f20948c, this.f20949d, this.f20946a) + iArr[12] + 1518500249, 13);
            this.f20946a = C6385h.m25235a(this.f20946a + C6385h.m25249b(this.f20947b, this.f20948c, this.f20949d) + iArr[1] + 1518500249, 3);
            this.f20949d = C6385h.m25235a(this.f20949d + C6385h.m25249b(this.f20946a, this.f20947b, this.f20948c) + iArr[5] + 1518500249, 5);
            this.f20948c = C6385h.m25235a(this.f20948c + C6385h.m25249b(this.f20949d, this.f20946a, this.f20947b) + iArr[9] + 1518500249, 9);
            this.f20947b = C6385h.m25235a(this.f20947b + C6385h.m25249b(this.f20948c, this.f20949d, this.f20946a) + iArr[13] + 1518500249, 13);
            this.f20946a = C6385h.m25235a(this.f20946a + C6385h.m25249b(this.f20947b, this.f20948c, this.f20949d) + iArr[2] + 1518500249, 3);
            this.f20949d = C6385h.m25235a(this.f20949d + C6385h.m25249b(this.f20946a, this.f20947b, this.f20948c) + iArr[6] + 1518500249, 5);
            this.f20948c = C6385h.m25235a(this.f20948c + C6385h.m25249b(this.f20949d, this.f20946a, this.f20947b) + iArr[10] + 1518500249, 9);
            this.f20947b = C6385h.m25235a(this.f20947b + C6385h.m25249b(this.f20948c, this.f20949d, this.f20946a) + iArr[14] + 1518500249, 13);
            this.f20946a = C6385h.m25235a(this.f20946a + C6385h.m25249b(this.f20947b, this.f20948c, this.f20949d) + iArr[3] + 1518500249, 3);
            this.f20949d = C6385h.m25235a(this.f20949d + C6385h.m25249b(this.f20946a, this.f20947b, this.f20948c) + iArr[7] + 1518500249, 5);
            this.f20948c = C6385h.m25235a(this.f20948c + C6385h.m25249b(this.f20949d, this.f20946a, this.f20947b) + iArr[11] + 1518500249, 9);
            this.f20947b = C6385h.m25235a(this.f20947b + C6385h.m25249b(this.f20948c, this.f20949d, this.f20946a) + iArr[15] + 1518500249, 13);
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public void mo22690c(int[] iArr) {
            this.f20946a = C6385h.m25235a(this.f20946a + C6385h.m25255c(this.f20947b, this.f20948c, this.f20949d) + iArr[0] + 1859775393, 3);
            this.f20949d = C6385h.m25235a(this.f20949d + C6385h.m25255c(this.f20946a, this.f20947b, this.f20948c) + iArr[8] + 1859775393, 9);
            this.f20948c = C6385h.m25235a(this.f20948c + C6385h.m25255c(this.f20949d, this.f20946a, this.f20947b) + iArr[4] + 1859775393, 11);
            this.f20947b = C6385h.m25235a(this.f20947b + C6385h.m25255c(this.f20948c, this.f20949d, this.f20946a) + iArr[12] + 1859775393, 15);
            this.f20946a = C6385h.m25235a(this.f20946a + C6385h.m25255c(this.f20947b, this.f20948c, this.f20949d) + iArr[2] + 1859775393, 3);
            this.f20949d = C6385h.m25235a(this.f20949d + C6385h.m25255c(this.f20946a, this.f20947b, this.f20948c) + iArr[10] + 1859775393, 9);
            this.f20948c = C6385h.m25235a(this.f20948c + C6385h.m25255c(this.f20949d, this.f20946a, this.f20947b) + iArr[6] + 1859775393, 11);
            this.f20947b = C6385h.m25235a(this.f20947b + C6385h.m25255c(this.f20948c, this.f20949d, this.f20946a) + iArr[14] + 1859775393, 15);
            this.f20946a = C6385h.m25235a(this.f20946a + C6385h.m25255c(this.f20947b, this.f20948c, this.f20949d) + iArr[1] + 1859775393, 3);
            this.f20949d = C6385h.m25235a(this.f20949d + C6385h.m25255c(this.f20946a, this.f20947b, this.f20948c) + iArr[9] + 1859775393, 9);
            this.f20948c = C6385h.m25235a(this.f20948c + C6385h.m25255c(this.f20949d, this.f20946a, this.f20947b) + iArr[5] + 1859775393, 11);
            this.f20947b = C6385h.m25235a(this.f20947b + C6385h.m25255c(this.f20948c, this.f20949d, this.f20946a) + iArr[13] + 1859775393, 15);
            this.f20946a = C6385h.m25235a(this.f20946a + C6385h.m25255c(this.f20947b, this.f20948c, this.f20949d) + iArr[3] + 1859775393, 3);
            this.f20949d = C6385h.m25235a(this.f20949d + C6385h.m25255c(this.f20946a, this.f20947b, this.f20948c) + iArr[11] + 1859775393, 9);
            this.f20948c = C6385h.m25235a(this.f20948c + C6385h.m25255c(this.f20949d, this.f20946a, this.f20947b) + iArr[7] + 1859775393, 11);
            this.f20947b = C6385h.m25235a(this.f20947b + C6385h.m25255c(this.f20948c, this.f20949d, this.f20946a) + iArr[15] + 1859775393, 15);
        }
    }

    /* renamed from: org.apache.a.f.a.h$c */
    /* compiled from: NTLMEngineImpl */
    static class C6388c {

        /* renamed from: a */
        private byte[] f20952a;

        /* renamed from: b */
        private int f20953b;

        C6388c() {
            this.f20952a = null;
            this.f20953b = 0;
        }

        C6388c(String str, int i) throws C6384g {
            this.f20952a = null;
            this.f20953b = 0;
            this.f20952a = C6570a.m26017c(C6550c.m25956a(str, "ASCII"));
            if (this.f20952a.length < C6385h.f20941c.length) {
                throw new C6384g("NTLM message decoding error - packet too short");
            }
            for (int i2 = 0; i2 < C6385h.f20941c.length; i2++) {
                if (this.f20952a[i2] != C6385h.f20941c[i2]) {
                    throw new C6384g("NTLM message expected - instead got unrecognized bytes");
                }
            }
            int a = mo22692a(C6385h.f20941c.length);
            if (a != i) {
                StringBuilder sb = new StringBuilder();
                sb.append("NTLM type ");
                sb.append(Integer.toString(i));
                sb.append(" message expected - instead got type ");
                sb.append(Integer.toString(a));
                throw new C6384g(sb.toString());
            }
            this.f20953b = this.f20952a.length;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public int mo22691a() {
            return this.f20953b;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo22696a(byte[] bArr, int i) throws C6384g {
            if (this.f20952a.length < bArr.length + i) {
                throw new C6384g("NTLM: Message too short");
            }
            System.arraycopy(this.f20952a, i, bArr, 0, bArr.length);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public int mo22692a(int i) throws C6384g {
            return C6385h.m25256c(this.f20952a, i);
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public byte[] mo22698b(int i) throws C6384g {
            return C6385h.m25264e(this.f20952a, i);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo22694a(int i, int i2) {
            this.f20952a = new byte[i];
            this.f20953b = 0;
            mo22695a(C6385h.f20941c);
            mo22700d(i2);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo22693a(byte b) {
            this.f20952a[this.f20953b] = b;
            this.f20953b++;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo22695a(byte[] bArr) {
            for (byte b : bArr) {
                this.f20952a[this.f20953b] = b;
                this.f20953b++;
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public void mo22699c(int i) {
            mo22693a((byte) (i & 255));
            mo22693a((byte) ((i >> 8) & 255));
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public void mo22700d(int i) {
            mo22693a((byte) (i & 255));
            mo22693a((byte) ((i >> 8) & 255));
            mo22693a((byte) ((i >> 16) & 255));
            mo22693a((byte) ((i >> 24) & 255));
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public String mo22697b() {
            byte[] bArr;
            if (this.f20952a.length > this.f20953b) {
                bArr = new byte[this.f20953b];
                for (int i = 0; i < this.f20953b; i++) {
                    bArr[i] = this.f20952a[i];
                }
            } else {
                bArr = this.f20952a;
            }
            return C6550c.m25953a(C6570a.m26012a(bArr));
        }
    }

    /* renamed from: org.apache.a.f.a.h$d */
    /* compiled from: NTLMEngineImpl */
    static class C6389d extends C6388c {

        /* renamed from: a */
        protected byte[] f20954a;

        /* renamed from: b */
        protected byte[] f20955b;

        C6389d(String str, String str2) throws C6384g {
            try {
                String a = C6385h.m25260d(str2);
                String b = C6385h.m25262e(str);
                this.f20954a = a.getBytes("UnicodeLittleUnmarked");
                this.f20955b = b.toUpperCase().getBytes("UnicodeLittleUnmarked");
            } catch (UnsupportedEncodingException e) {
                StringBuilder sb = new StringBuilder();
                sb.append("Unicode unsupported: ");
                sb.append(e.getMessage());
                throw new C6384g(sb.toString(), e);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public String mo22697b() {
            mo22694a(this.f20954a.length + 32 + this.f20955b.length, 1);
            mo22700d(537395765);
            mo22699c(this.f20955b.length);
            mo22699c(this.f20955b.length);
            mo22700d(this.f20954a.length + 32);
            mo22699c(this.f20954a.length);
            mo22699c(this.f20954a.length);
            mo22700d(32);
            mo22695a(this.f20954a);
            mo22695a(this.f20955b);
            return super.mo22697b();
        }
    }

    /* renamed from: org.apache.a.f.a.h$e */
    /* compiled from: NTLMEngineImpl */
    static class C6390e extends C6388c {

        /* renamed from: a */
        protected byte[] f20956a = new byte[8];

        /* renamed from: b */
        protected String f20957b;

        /* renamed from: c */
        protected byte[] f20958c;

        /* renamed from: d */
        protected int f20959d;

        C6390e(String str) throws C6384g {
            super(str, 2);
            mo22696a(this.f20956a, 24);
            this.f20959d = mo22692a(20);
            if ((this.f20959d & 1) == 0) {
                StringBuilder sb = new StringBuilder();
                sb.append("NTLM type 2 message has flags that make no sense: ");
                sb.append(Integer.toString(this.f20959d));
                throw new C6384g(sb.toString());
            }
            this.f20957b = null;
            if (mo22691a() >= 20) {
                byte[] b = mo22698b(12);
                if (b.length != 0) {
                    try {
                        this.f20957b = new String(b, "UnicodeLittleUnmarked");
                    } catch (UnsupportedEncodingException e) {
                        throw new C6384g(e.getMessage(), e);
                    }
                }
            }
            this.f20958c = null;
            if (mo22691a() >= 48) {
                byte[] b2 = mo22698b(40);
                if (b2.length != 0) {
                    this.f20958c = b2;
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public byte[] mo22701c() {
            return this.f20956a;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public String mo22702d() {
            return this.f20957b;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public byte[] mo22703e() {
            return this.f20958c;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: f */
        public int mo22704f() {
            return this.f20959d;
        }
    }

    /* renamed from: org.apache.a.f.a.h$f */
    /* compiled from: NTLMEngineImpl */
    static class C6391f extends C6388c {

        /* renamed from: a */
        protected int f20960a;

        /* renamed from: b */
        protected byte[] f20961b;

        /* renamed from: c */
        protected byte[] f20962c;

        /* renamed from: d */
        protected byte[] f20963d;

        /* renamed from: e */
        protected byte[] f20964e;

        /* renamed from: f */
        protected byte[] f20965f;

        C6391f(String str, String str2, String str3, String str4, byte[] bArr, int i, String str5, byte[] bArr2) throws C6384g {
            this.f20960a = i;
            String a = C6385h.m25260d(str2);
            String b = C6385h.m25262e(str);
            if (bArr2 != null && str5 != null) {
                try {
                    byte[] b2 = C6385h.m25261d();
                    this.f20965f = C6385h.m25244a(str5, str3, str4, bArr, b2, bArr2);
                    this.f20964e = C6385h.m25243a(str5, str3, str4, bArr, b2);
                } catch (C6384g unused) {
                    this.f20965f = new byte[0];
                    this.f20964e = C6385h.m25245a(str4, bArr);
                }
            } else if ((i & 524288) != 0) {
                byte[] c = C6385h.m25263e();
                this.f20965f = C6385h.m25246a(str4, bArr, c);
                this.f20964e = c;
            } else {
                this.f20965f = C6385h.m25252b(str4, bArr);
                this.f20964e = C6385h.m25245a(str4, bArr);
            }
            try {
                this.f20961b = b.toUpperCase().getBytes("UnicodeLittleUnmarked");
                this.f20962c = a.getBytes("UnicodeLittleUnmarked");
                this.f20963d = str3.getBytes("UnicodeLittleUnmarked");
            } catch (UnsupportedEncodingException e) {
                StringBuilder sb = new StringBuilder();
                sb.append("Unicode not supported: ");
                sb.append(e.getMessage());
                throw new C6384g(sb.toString(), e);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public String mo22697b() {
            int length = this.f20965f.length;
            int length2 = this.f20964e.length;
            int length3 = this.f20961b.length;
            int length4 = this.f20962c.length;
            int length5 = this.f20963d.length;
            int i = 64 + length2;
            int i2 = i + length;
            int i3 = i2 + length3;
            int i4 = i3 + length5;
            int i5 = i4 + length4 + 0;
            mo22694a(i5, 3);
            mo22699c(length2);
            mo22699c(length2);
            mo22700d(64);
            mo22699c(length);
            mo22699c(length);
            mo22700d(i);
            mo22699c(length3);
            mo22699c(length3);
            mo22700d(i2);
            mo22699c(length5);
            mo22699c(length5);
            mo22700d(i3);
            mo22699c(length4);
            mo22699c(length4);
            mo22700d(i4);
            mo22700d(0);
            mo22700d(i5);
            mo22700d((this.f20960a & 524288) | 536871429 | (this.f20960a & 16) | (this.f20960a & 32) | (this.f20960a & 1073741824) | (this.f20960a & 32768));
            mo22695a(this.f20964e);
            mo22695a(this.f20965f);
            mo22695a(this.f20961b);
            mo22695a(this.f20963d);
            mo22695a(this.f20962c);
            return super.mo22697b();
        }
    }

    /* renamed from: a */
    static int m25235a(int i, int i2) {
        return (i >>> (32 - i2)) | (i << i2);
    }

    /* renamed from: a */
    static int m25236a(int i, int i2, int i3) {
        return ((i ^ -1) & i3) | (i2 & i);
    }

    /* renamed from: b */
    static int m25249b(int i, int i2, int i3) {
        return (i & i3) | (i & i2) | (i2 & i3);
    }

    /* renamed from: c */
    static int m25255c(int i, int i2, int i3) {
        return (i ^ i2) ^ i3;
    }

    C6385h() {
    }

    static {
        SecureRandom secureRandom;
        try {
            secureRandom = SecureRandom.getInstance("SHA1PRNG");
        } catch (Exception unused) {
            secureRandom = null;
        }
        f20940a = secureRandom;
        byte[] a = C6550c.m25956a("NTLMSSP", "ASCII");
        f20941c = new byte[(a.length + 1)];
        System.arraycopy(a, 0, f20941c, 0, a.length);
        f20941c[a.length] = 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public String mo22682b(String str, String str2) throws C6384g {
        return new C6389d(str2, str).mo22697b();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public String mo22681a(String str, String str2, String str3, String str4, byte[] bArr, int i, String str5, byte[] bArr2) throws C6384g {
        C6391f fVar = new C6391f(str4, str3, str, str2, bArr, i, str5, bArr2);
        return fVar.mo22697b();
    }

    /* renamed from: c */
    private static String m25257c(String str) {
        int indexOf = str.indexOf(".");
        return indexOf != -1 ? str.substring(0, indexOf) : str;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static String m25260d(String str) {
        return m25257c(str);
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static String m25262e(String str) {
        return m25257c(str);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static int m25256c(byte[] bArr, int i) throws C6384g {
        if (bArr.length < i + 4) {
            throw new C6384g("NTLM authentication - buffer too small for DWORD");
        }
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    /* renamed from: d */
    private static int m25259d(byte[] bArr, int i) throws C6384g {
        if (bArr.length < i + 2) {
            throw new C6384g("NTLM authentication - buffer too small for WORD");
        }
        return ((bArr[i + 1] & 255) << 8) | (bArr[i] & 255);
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static byte[] m25264e(byte[] bArr, int i) throws C6384g {
        int d = m25259d(bArr, i);
        int c = m25256c(bArr, i + 4);
        if (bArr.length < c + d) {
            throw new C6384g("NTLM authentication - buffer too small for data item");
        }
        byte[] bArr2 = new byte[d];
        System.arraycopy(bArr, c, bArr2, 0, d);
        return bArr2;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static byte[] m25261d() throws C6384g {
        if (f20940a == null) {
            throw new C6384g("Random generator not available");
        }
        byte[] bArr = new byte[8];
        synchronized (f20940a) {
            f20940a.nextBytes(bArr);
        }
        return bArr;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static byte[] m25263e() throws C6384g {
        if (f20940a == null) {
            throw new C6384g("Random generator not available");
        }
        byte[] bArr = new byte[24];
        synchronized (f20940a) {
            f20940a.nextBytes(bArr);
        }
        Arrays.fill(bArr, 8, 24, 0);
        return bArr;
    }

    /* renamed from: a */
    static byte[] m25245a(String str, byte[] bArr) throws C6384g {
        return m25247a(m25266f(str), bArr);
    }

    /* renamed from: b */
    static byte[] m25252b(String str, byte[] bArr) throws C6384g {
        return m25247a(m25267g(str), bArr);
    }

    /* renamed from: a */
    static byte[] m25244a(String str, String str2, String str3, byte[] bArr, byte[] bArr2, byte[] bArr3) throws C6384g {
        return m25248a(m25242a(str, str2, str3), bArr, m25254b(bArr2, bArr3));
    }

    /* renamed from: a */
    static byte[] m25243a(String str, String str2, String str3, byte[] bArr, byte[] bArr2) throws C6384g {
        return m25248a(m25242a(str, str2, str3), bArr, bArr2);
    }

    /* renamed from: a */
    static byte[] m25246a(String str, byte[] bArr, byte[] bArr2) throws C6384g {
        try {
            byte[] g = m25267g(str);
            MessageDigest instance = MessageDigest.getInstance("MD5");
            instance.update(bArr);
            instance.update(bArr2);
            byte[] digest = instance.digest();
            byte[] bArr3 = new byte[8];
            System.arraycopy(digest, 0, bArr3, 0, 8);
            return m25247a(g, bArr3);
        } catch (Exception e) {
            if (e instanceof C6384g) {
                throw ((C6384g) e);
            }
            throw new C6384g(e.getMessage(), e);
        }
    }

    /* renamed from: f */
    private static byte[] m25266f(String str) throws C6384g {
        try {
            byte[] bytes = str.toUpperCase().getBytes(C2793C.ASCII_NAME);
            byte[] bArr = new byte[14];
            System.arraycopy(bytes, 0, bArr, 0, Math.min(bytes.length, 14));
            Key f = m25265f(bArr, 0);
            Key f2 = m25265f(bArr, 7);
            byte[] bytes2 = "KGS!@#$%".getBytes(C2793C.ASCII_NAME);
            Cipher instance = Cipher.getInstance("DES/ECB/NoPadding");
            instance.init(1, f);
            byte[] doFinal = instance.doFinal(bytes2);
            instance.init(1, f2);
            byte[] doFinal2 = instance.doFinal(bytes2);
            byte[] bArr2 = new byte[16];
            System.arraycopy(doFinal, 0, bArr2, 0, 8);
            System.arraycopy(doFinal2, 0, bArr2, 8, 8);
            return bArr2;
        } catch (Exception e) {
            throw new C6384g(e.getMessage(), e);
        }
    }

    /* renamed from: g */
    private static byte[] m25267g(String str) throws C6384g {
        try {
            byte[] bytes = str.getBytes("UnicodeLittleUnmarked");
            C6387b bVar = new C6387b();
            bVar.mo22685a(bytes);
            return bVar.mo22687a();
        } catch (UnsupportedEncodingException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Unicode not supported: ");
            sb.append(e.getMessage());
            throw new C6384g(sb.toString(), e);
        }
    }

    /* renamed from: a */
    private static byte[] m25242a(String str, String str2, String str3) throws C6384g {
        try {
            C6386a aVar = new C6386a(m25267g(str3));
            aVar.mo22683a(str2.toUpperCase().getBytes("UnicodeLittleUnmarked"));
            aVar.mo22683a(str.getBytes("UnicodeLittleUnmarked"));
            return aVar.mo22684a();
        } catch (UnsupportedEncodingException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Unicode not supported! ");
            sb.append(e.getMessage());
            throw new C6384g(sb.toString(), e);
        }
    }

    /* renamed from: a */
    private static byte[] m25247a(byte[] bArr, byte[] bArr2) throws C6384g {
        try {
            byte[] bArr3 = new byte[21];
            System.arraycopy(bArr, 0, bArr3, 0, 16);
            Key f = m25265f(bArr3, 0);
            Key f2 = m25265f(bArr3, 7);
            Key f3 = m25265f(bArr3, 14);
            Cipher instance = Cipher.getInstance("DES/ECB/NoPadding");
            instance.init(1, f);
            byte[] doFinal = instance.doFinal(bArr2);
            instance.init(1, f2);
            byte[] doFinal2 = instance.doFinal(bArr2);
            instance.init(1, f3);
            byte[] doFinal3 = instance.doFinal(bArr2);
            byte[] bArr4 = new byte[24];
            System.arraycopy(doFinal, 0, bArr4, 0, 8);
            System.arraycopy(doFinal2, 0, bArr4, 8, 8);
            System.arraycopy(doFinal3, 0, bArr4, 16, 8);
            return bArr4;
        } catch (Exception e) {
            throw new C6384g(e.getMessage(), e);
        }
    }

    /* renamed from: a */
    private static byte[] m25248a(byte[] bArr, byte[] bArr2, byte[] bArr3) throws C6384g {
        C6386a aVar = new C6386a(bArr);
        aVar.mo22683a(bArr2);
        aVar.mo22683a(bArr3);
        byte[] a = aVar.mo22684a();
        byte[] bArr4 = new byte[(a.length + bArr3.length)];
        System.arraycopy(a, 0, bArr4, 0, a.length);
        System.arraycopy(bArr3, 0, bArr4, a.length, bArr3.length);
        return bArr4;
    }

    /* renamed from: b */
    private static byte[] m25254b(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = {1, 1, 0, 0};
        byte[] bArr4 = {0, 0, 0, 0};
        byte[] bArr5 = {0, 0, 0, 0};
        long currentTimeMillis = (System.currentTimeMillis() + 11644473600000L) * 10000;
        byte[] bArr6 = new byte[8];
        for (int i = 0; i < 8; i++) {
            bArr6[i] = (byte) ((int) currentTimeMillis);
            currentTimeMillis >>>= 8;
        }
        byte[] bArr7 = new byte[(bArr3.length + bArr4.length + bArr6.length + 8 + bArr5.length + bArr2.length)];
        System.arraycopy(bArr3, 0, bArr7, 0, bArr3.length);
        int length = bArr3.length + 0;
        System.arraycopy(bArr4, 0, bArr7, length, bArr4.length);
        int length2 = length + bArr4.length;
        System.arraycopy(bArr6, 0, bArr7, length2, bArr6.length);
        int length3 = length2 + bArr6.length;
        System.arraycopy(bArr, 0, bArr7, length3, 8);
        int i2 = length3 + 8;
        System.arraycopy(bArr5, 0, bArr7, i2, bArr5.length);
        System.arraycopy(bArr2, 0, bArr7, i2 + bArr5.length, bArr2.length);
        return bArr7;
    }

    /* renamed from: f */
    private static Key m25265f(byte[] bArr, int i) {
        byte[] bArr2 = new byte[7];
        System.arraycopy(bArr, i, bArr2, 0, 7);
        byte[] bArr3 = {bArr2[0], (byte) ((bArr2[0] << 7) | ((bArr2[1] & 255) >>> 1)), (byte) ((bArr2[1] << 6) | ((bArr2[2] & 255) >>> 2)), (byte) ((bArr2[2] << 5) | ((bArr2[3] & 255) >>> 3)), (byte) ((bArr2[3] << 4) | ((bArr2[4] & 255) >>> 4)), (byte) ((bArr2[4] << 3) | ((bArr2[5] & 255) >>> 5)), (byte) ((bArr2[5] << 2) | ((bArr2[6] & 255) >>> 6)), (byte) (bArr2[6] << 1)};
        m25239a(bArr3);
        return new SecretKeySpec(bArr3, "DES");
    }

    /* renamed from: a */
    private static void m25239a(byte[] bArr) {
        for (int i = 0; i < bArr.length; i++) {
            byte b = bArr[i];
            if ((((b >>> 1) ^ ((((((b >>> 7) ^ (b >>> 6)) ^ (b >>> 5)) ^ (b >>> 4)) ^ (b >>> 3)) ^ (b >>> 2))) & 1) == 0) {
                bArr[i] = (byte) (bArr[i] | 1);
            } else {
                bArr[i] = (byte) (bArr[i] & -2);
            }
        }
    }

    /* renamed from: a */
    static void m25240a(byte[] bArr, int i, int i2) {
        bArr[i2] = (byte) (i & 255);
        bArr[i2 + 1] = (byte) ((i >> 8) & 255);
        bArr[i2 + 2] = (byte) ((i >> 16) & 255);
        bArr[i2 + 3] = (byte) ((i >> 24) & 255);
    }

    /* renamed from: a */
    public String mo22679a(String str, String str2) throws C6384g {
        return mo22682b(str2, str);
    }

    /* renamed from: a */
    public String mo22680a(String str, String str2, String str3, String str4, String str5) throws C6384g {
        C6390e eVar = new C6390e(str5);
        return mo22681a(str, str2, str4, str3, eVar.mo22701c(), eVar.mo22704f(), eVar.mo22702d(), eVar.mo22703e());
    }
}
