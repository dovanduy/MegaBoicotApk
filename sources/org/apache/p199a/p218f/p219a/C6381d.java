package org.apache.p199a.p218f.p219a;

import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.Locale;
import java.util.StringTokenizer;
import org.apache.p199a.C6301c;
import org.apache.p199a.C6558o;
import org.apache.p199a.C6565v;
import org.apache.p199a.p200a.C6254f;
import org.apache.p199a.p200a.C6256h;
import org.apache.p199a.p200a.C6258j;
import org.apache.p199a.p200a.p201a.C6249a;
import org.apache.p199a.p226h.C6510e;
import org.apache.p199a.p226h.C6517l;
import org.apache.p199a.p226h.C6521p;
import org.apache.p199a.p229k.C6549b;
import org.apache.p199a.p229k.C6550c;

/* renamed from: org.apache.a.f.a.d */
/* compiled from: DigestScheme */
public class C6381d extends C6398m {

    /* renamed from: a */
    private static final char[] f20933a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: b */
    private boolean f20934b = false;

    /* renamed from: c */
    private int f20935c = 0;

    /* renamed from: d */
    private String f20936d;

    /* renamed from: e */
    private long f20937e;

    /* renamed from: f */
    private String f20938f;

    /* renamed from: g */
    private String f20939g;

    /* renamed from: a */
    public String mo22389a() {
        return "digest";
    }

    /* renamed from: c */
    public boolean mo22393c() {
        return false;
    }

    /* renamed from: a */
    public void mo22391a(C6301c cVar) throws C6258j {
        super.mo22391a(cVar);
        if (mo22706a("realm") == null) {
            throw new C6258j("missing realm in challange");
        } else if (mo22706a("nonce") == null) {
            throw new C6258j("missing nonce in challange");
        } else {
            boolean z = false;
            String a = mo22706a("qop");
            if (a != null) {
                StringTokenizer stringTokenizer = new StringTokenizer(a, ",");
                while (true) {
                    if (!stringTokenizer.hasMoreTokens()) {
                        break;
                    }
                    String trim = stringTokenizer.nextToken().trim();
                    if (trim.equals("auth")) {
                        this.f20935c = 2;
                        break;
                    } else if (trim.equals("auth-int")) {
                        this.f20935c = 1;
                    } else {
                        z = true;
                    }
                }
            }
            if (!z || this.f20935c != 0) {
                this.f20934b = true;
                return;
            }
            throw new C6258j("None of the qop methods is supported");
        }
    }

    /* renamed from: d */
    public boolean mo22394d() {
        if ("true".equalsIgnoreCase(mo22706a("stale"))) {
            return false;
        }
        return this.f20934b;
    }

    /* renamed from: h */
    private String m25224h() {
        if (this.f20938f == null) {
            this.f20938f = m25223f();
        }
        return this.f20938f;
    }

    /* renamed from: i */
    private String m25225i() {
        if (this.f20939g == null) {
            StringBuilder sb = new StringBuilder();
            new Formatter(sb, Locale.US).format("%08x", new Object[]{Long.valueOf(this.f20937e)});
            this.f20939g = sb.toString();
        }
        return this.f20939g;
    }

    /* renamed from: a */
    public C6301c mo22390a(C6256h hVar, C6558o oVar) throws C6254f {
        if (hVar == null) {
            throw new IllegalArgumentException("Credentials may not be null");
        } else if (oVar == null) {
            throw new IllegalArgumentException("HTTP request may not be null");
        } else {
            mo22707g().put("methodname", oVar.mo22451g().mo22426a());
            mo22707g().put("uri", oVar.mo22451g().mo22428c());
            if (mo22706a("charset") == null) {
                mo22707g().put("charset", C6249a.m24827a(oVar.mo22915f()));
            }
            return m25221a(hVar, m25219a(hVar));
        }
    }

    /* renamed from: b */
    private static MessageDigest m25222b(String str) throws C6400o {
        try {
            return MessageDigest.getInstance(str);
        } catch (Exception unused) {
            StringBuilder sb = new StringBuilder();
            sb.append("Unsupported algorithm in HTTP Digest authentication: ");
            sb.append(str);
            throw new C6400o(sb.toString());
        }
    }

    /* renamed from: a */
    private String m25219a(C6256h hVar) throws C6254f {
        String str;
        String str2;
        String str3;
        String a = mo22706a("uri");
        String a2 = mo22706a("realm");
        String a3 = mo22706a("nonce");
        String a4 = mo22706a("methodname");
        String a5 = mo22706a("algorithm");
        if (a == null) {
            throw new IllegalStateException("URI may not be null");
        } else if (a2 == null) {
            throw new IllegalStateException("Realm may not be null");
        } else if (a3 == null) {
            throw new IllegalStateException("Nonce may not be null");
        } else {
            String str4 = null;
            this.f20938f = null;
            this.f20939g = null;
            if (a5 == null) {
                a5 = "MD5";
            }
            String a6 = mo22706a("charset");
            if (a6 == null) {
                a6 = "ISO-8859-1";
            }
            if (this.f20935c == 1) {
                throw new C6254f("Unsupported qop in HTTP Digest authentication");
            }
            String str5 = a5.equalsIgnoreCase("MD5-sess") ? "MD5" : a5;
            if (a3.equals(this.f20936d)) {
                str2 = a4;
                str = a5;
                this.f20937e++;
            } else {
                str2 = a4;
                str = a5;
                this.f20937e = 1;
                this.f20936d = a3;
            }
            MessageDigest b = m25222b(str5);
            String name = hVar.mo22412a().getName();
            String b2 = hVar.mo22413b();
            StringBuilder sb = new StringBuilder(name.length() + a2.length() + b2.length() + 2);
            sb.append(name);
            sb.append(':');
            sb.append(a2);
            sb.append(':');
            sb.append(b2);
            String sb2 = sb.toString();
            if (str.equalsIgnoreCase("MD5-sess")) {
                String h = m25224h();
                String a7 = m25220a(b.digest(C6550c.m25956a(sb2, a6)));
                StringBuilder sb3 = new StringBuilder(a7.length() + a3.length() + h.length() + 2);
                sb3.append(a7);
                sb3.append(':');
                sb3.append(a3);
                sb3.append(':');
                sb3.append(h);
                sb2 = sb3.toString();
            }
            String a8 = m25220a(b.digest(C6550c.m25956a(sb2, a6)));
            if (this.f20935c != 1) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str2);
                sb4.append(':');
                sb4.append(a);
                str4 = sb4.toString();
            }
            String a9 = m25220a(b.digest(C6550c.m25955a(str4)));
            if (this.f20935c == 0) {
                StringBuilder sb5 = new StringBuilder(a8.length() + a3.length() + a8.length());
                sb5.append(a8);
                sb5.append(':');
                sb5.append(a3);
                sb5.append(':');
                sb5.append(a9);
                str3 = sb5.toString();
            } else {
                String j = m25226j();
                String h2 = m25224h();
                String i = m25225i();
                StringBuilder sb6 = new StringBuilder(a8.length() + a3.length() + i.length() + h2.length() + j.length() + a9.length() + 5);
                sb6.append(a8);
                sb6.append(':');
                sb6.append(a3);
                sb6.append(':');
                sb6.append(i);
                sb6.append(':');
                sb6.append(h2);
                sb6.append(':');
                sb6.append(j);
                sb6.append(':');
                sb6.append(a9);
                str3 = sb6.toString();
            }
            return m25220a(b.digest(C6550c.m25955a(str3)));
        }
    }

    /* renamed from: a */
    private C6301c m25221a(C6256h hVar, String str) {
        C6549b bVar = new C6549b(128);
        if (mo22677e()) {
            bVar.mo23044a("Proxy-Authorization");
        } else {
            bVar.mo23044a("Authorization");
        }
        bVar.mo23044a(": Digest ");
        String a = mo22706a("uri");
        String a2 = mo22706a("realm");
        String a3 = mo22706a("nonce");
        String a4 = mo22706a("opaque");
        String a5 = mo22706a("algorithm");
        String name = hVar.mo22412a().getName();
        ArrayList arrayList = new ArrayList(20);
        arrayList.add(new C6517l("username", name));
        arrayList.add(new C6517l("realm", a2));
        arrayList.add(new C6517l("nonce", a3));
        arrayList.add(new C6517l("uri", a));
        arrayList.add(new C6517l("response", str));
        if (this.f20935c != 0) {
            arrayList.add(new C6517l("qop", m25226j()));
            arrayList.add(new C6517l("nc", m25225i()));
            arrayList.add(new C6517l("cnonce", m25224h()));
        }
        if (a5 != null) {
            arrayList.add(new C6517l("algorithm", a5));
        }
        if (a4 != null) {
            arrayList.add(new C6517l("opaque", a4));
        }
        for (int i = 0; i < arrayList.size(); i++) {
            C6517l lVar = (C6517l) arrayList.get(i);
            if (i > 0) {
                bVar.mo23044a(", ");
            }
            C6510e.f21216a.mo22925a(bVar, (C6565v) lVar, !("nc".equals(lVar.mo22961a()) || "qop".equals(lVar.mo22961a())));
        }
        return new C6521p(bVar);
    }

    /* renamed from: j */
    private String m25226j() {
        return this.f20935c == 1 ? "auth-int" : "auth";
    }

    /* renamed from: a */
    private static String m25220a(byte[] bArr) {
        int length = bArr.length;
        char[] cArr = new char[(length * 2)];
        for (int i = 0; i < length; i++) {
            byte b = bArr[i] & 15;
            int i2 = i * 2;
            cArr[i2] = f20933a[(bArr[i] & 240) >> 4];
            cArr[i2 + 1] = f20933a[b];
        }
        return new String(cArr);
    }

    /* renamed from: f */
    public static String m25223f() {
        return m25220a(m25222b("MD5").digest(C6550c.m25955a(Long.toString(System.currentTimeMillis()))));
    }
}
