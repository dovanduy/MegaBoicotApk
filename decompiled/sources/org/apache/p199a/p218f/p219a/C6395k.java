package org.apache.p199a.p218f.p219a;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.commons.p230a.p231a.C6570a;
import org.apache.p199a.C6301c;
import org.apache.p199a.C6558o;
import org.apache.p199a.p200a.C6254f;
import org.apache.p199a.p200a.C6256h;
import org.apache.p199a.p200a.C6258j;
import org.apache.p199a.p228j.C6539e;
import org.apache.p199a.p229k.C6549b;
import org.ietf.jgss.GSSContext;
import org.ietf.jgss.GSSManager;
import org.ietf.jgss.Oid;

/* renamed from: org.apache.a.f.a.k */
/* compiled from: NegotiateScheme */
public class C6395k extends C6378a {

    /* renamed from: a */
    private final Log f20976a;

    /* renamed from: b */
    private final C6399n f20977b;

    /* renamed from: c */
    private final boolean f20978c;

    /* renamed from: d */
    private GSSContext f20979d;

    /* renamed from: e */
    private C6396a f20980e;

    /* renamed from: f */
    private byte[] f20981f;

    /* renamed from: g */
    private Oid f20982g;

    /* renamed from: org.apache.a.f.a.k$a */
    /* compiled from: NegotiateScheme */
    enum C6396a {
        UNINITIATED,
        CHALLENGE_RECEIVED,
        TOKEN_GENERATED,
        FAILED
    }

    /* renamed from: a */
    public String mo22389a() {
        return "Negotiate";
    }

    /* renamed from: b */
    public String mo22392b() {
        return null;
    }

    /* renamed from: c */
    public boolean mo22393c() {
        return true;
    }

    public C6395k(C6399n nVar, boolean z) {
        this.f20976a = LogFactory.getLog(getClass());
        this.f20979d = null;
        this.f20982g = null;
        this.f20980e = C6396a.UNINITIATED;
        this.f20977b = nVar;
        this.f20978c = z;
    }

    public C6395k() {
        this(null, false);
    }

    /* renamed from: d */
    public boolean mo22394d() {
        return this.f20980e == C6396a.TOKEN_GENERATED || this.f20980e == C6396a.FAILED;
    }

    @Deprecated
    /* renamed from: a */
    public C6301c mo22390a(C6256h hVar, C6558o oVar) throws C6254f {
        return mo22411a(hVar, oVar, (C6539e) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public GSSManager mo22705f() {
        return GSSManager.getInstance();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0183, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0184, code lost:
        r4.f20980e = org.apache.p199a.p218f.p219a.C6395k.C6396a.f20986d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0191, code lost:
        throw new org.apache.p199a.p200a.C6254f(r5.getMessage());
     */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0183 A[ExcHandler: IOException (r5v4 'e' java.io.IOException A[CUSTOM_DECLARE]), Splitter:B:7:0x0018] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.apache.p199a.C6301c mo22411a(org.apache.p199a.p200a.C6256h r5, org.apache.p199a.C6558o r6, org.apache.p199a.p228j.C6539e r7) throws org.apache.p199a.p200a.C6254f {
        /*
            r4 = this;
            if (r6 != 0) goto L_0x000a
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "HTTP request may not be null"
            r5.<init>(r6)
            throw r5
        L_0x000a:
            org.apache.a.f.a.k$a r5 = r4.f20980e
            org.apache.a.f.a.k$a r6 = org.apache.p199a.p218f.p219a.C6395k.C6396a.CHALLENGE_RECEIVED
            if (r5 == r6) goto L_0x0018
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "Negotiation authentication process has not been initiated"
            r5.<init>(r6)
            throw r5
        L_0x0018:
            boolean r5 = r4.mo22677e()     // Catch:{ GSSException -> 0x0192, IOException -> 0x0183 }
            if (r5 == 0) goto L_0x0021
            java.lang.String r5 = "http.proxy_host"
            goto L_0x0023
        L_0x0021:
            java.lang.String r5 = "http.target_host"
        L_0x0023:
            java.lang.Object r5 = r7.mo22777a(r5)     // Catch:{ GSSException -> 0x0192, IOException -> 0x0183 }
            org.apache.a.l r5 = (org.apache.p199a.C6555l) r5     // Catch:{ GSSException -> 0x0192, IOException -> 0x0183 }
            if (r5 != 0) goto L_0x0033
            org.apache.a.a.f r5 = new org.apache.a.a.f     // Catch:{ GSSException -> 0x0192, IOException -> 0x0183 }
            java.lang.String r6 = "Authentication host is not set in the execution context"
            r5.<init>(r6)     // Catch:{ GSSException -> 0x0192, IOException -> 0x0183 }
            throw r5     // Catch:{ GSSException -> 0x0192, IOException -> 0x0183 }
        L_0x0033:
            boolean r6 = r4.f20978c     // Catch:{ GSSException -> 0x0192, IOException -> 0x0183 }
            if (r6 != 0) goto L_0x0042
            int r6 = r5.mo23059b()     // Catch:{ GSSException -> 0x0192, IOException -> 0x0183 }
            if (r6 <= 0) goto L_0x0042
            java.lang.String r5 = r5.mo23063e()     // Catch:{ GSSException -> 0x0192, IOException -> 0x0183 }
            goto L_0x0046
        L_0x0042:
            java.lang.String r5 = r5.mo23058a()     // Catch:{ GSSException -> 0x0192, IOException -> 0x0183 }
        L_0x0046:
            org.apache.commons.logging.Log r6 = r4.f20976a     // Catch:{ GSSException -> 0x0192, IOException -> 0x0183 }
            boolean r6 = r6.isDebugEnabled()     // Catch:{ GSSException -> 0x0192, IOException -> 0x0183 }
            if (r6 == 0) goto L_0x0064
            org.apache.commons.logging.Log r6 = r4.f20976a     // Catch:{ GSSException -> 0x0192, IOException -> 0x0183 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ GSSException -> 0x0192, IOException -> 0x0183 }
            r7.<init>()     // Catch:{ GSSException -> 0x0192, IOException -> 0x0183 }
            java.lang.String r0 = "init "
            r7.append(r0)     // Catch:{ GSSException -> 0x0192, IOException -> 0x0183 }
            r7.append(r5)     // Catch:{ GSSException -> 0x0192, IOException -> 0x0183 }
            java.lang.String r7 = r7.toString()     // Catch:{ GSSException -> 0x0192, IOException -> 0x0183 }
            r6.debug(r7)     // Catch:{ GSSException -> 0x0192, IOException -> 0x0183 }
        L_0x0064:
            org.ietf.jgss.Oid r6 = new org.ietf.jgss.Oid     // Catch:{ GSSException -> 0x0192, IOException -> 0x0183 }
            java.lang.String r7 = "1.3.6.1.5.5.2"
            r6.<init>(r7)     // Catch:{ GSSException -> 0x0192, IOException -> 0x0183 }
            r4.f20982g = r6     // Catch:{ GSSException -> 0x0192, IOException -> 0x0183 }
            r6 = 0
            r7 = 1
            r0 = 0
            org.ietf.jgss.GSSManager r1 = r4.mo22705f()     // Catch:{ GSSException -> 0x00a3, IOException -> 0x0183 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ GSSException -> 0x00a3, IOException -> 0x0183 }
            r2.<init>()     // Catch:{ GSSException -> 0x00a3, IOException -> 0x0183 }
            java.lang.String r3 = "HTTP/"
            r2.append(r3)     // Catch:{ GSSException -> 0x00a3, IOException -> 0x0183 }
            r2.append(r5)     // Catch:{ GSSException -> 0x00a3, IOException -> 0x0183 }
            java.lang.String r2 = r2.toString()     // Catch:{ GSSException -> 0x00a3, IOException -> 0x0183 }
            org.ietf.jgss.GSSName r2 = r1.createName(r2, r6)     // Catch:{ GSSException -> 0x00a3, IOException -> 0x0183 }
            org.ietf.jgss.Oid r3 = r4.f20982g     // Catch:{ GSSException -> 0x00a3, IOException -> 0x0183 }
            org.ietf.jgss.GSSName r2 = r2.canonicalize(r3)     // Catch:{ GSSException -> 0x00a3, IOException -> 0x0183 }
            org.ietf.jgss.Oid r3 = r4.f20982g     // Catch:{ GSSException -> 0x00a3, IOException -> 0x0183 }
            org.ietf.jgss.GSSContext r1 = r1.createContext(r2, r3, r6, r0)     // Catch:{ GSSException -> 0x00a3, IOException -> 0x0183 }
            r4.f20979d = r1     // Catch:{ GSSException -> 0x00a3, IOException -> 0x0183 }
            org.ietf.jgss.GSSContext r1 = r4.f20979d     // Catch:{ GSSException -> 0x00a3, IOException -> 0x0183 }
            r1.requestMutualAuth(r7)     // Catch:{ GSSException -> 0x00a3, IOException -> 0x0183 }
            org.ietf.jgss.GSSContext r1 = r4.f20979d     // Catch:{ GSSException -> 0x00a3, IOException -> 0x0183 }
            r1.requestCredDeleg(r7)     // Catch:{ GSSException -> 0x00a3, IOException -> 0x0183 }
            r1 = r0
            goto L_0x00b3
        L_0x00a3:
            r1 = move-exception
            int r2 = r1.getMajor()     // Catch:{ GSSException -> 0x0192, IOException -> 0x0183 }
            r3 = 2
            if (r2 != r3) goto L_0x0182
            org.apache.commons.logging.Log r1 = r4.f20976a     // Catch:{ GSSException -> 0x0192, IOException -> 0x0183 }
            java.lang.String r2 = "GSSException BAD_MECH, retry with Kerberos MECH"
            r1.debug(r2)     // Catch:{ GSSException -> 0x0192, IOException -> 0x0183 }
            r1 = r7
        L_0x00b3:
            if (r1 == 0) goto L_0x00f6
            org.apache.commons.logging.Log r1 = r4.f20976a     // Catch:{ GSSException -> 0x0192, IOException -> 0x0183 }
            java.lang.String r2 = "Using Kerberos MECH 1.2.840.113554.1.2.2"
            r1.debug(r2)     // Catch:{ GSSException -> 0x0192, IOException -> 0x0183 }
            org.ietf.jgss.Oid r1 = new org.ietf.jgss.Oid     // Catch:{ GSSException -> 0x0192, IOException -> 0x0183 }
            java.lang.String r2 = "1.2.840.113554.1.2.2"
            r1.<init>(r2)     // Catch:{ GSSException -> 0x0192, IOException -> 0x0183 }
            r4.f20982g = r1     // Catch:{ GSSException -> 0x0192, IOException -> 0x0183 }
            org.ietf.jgss.GSSManager r1 = r4.mo22705f()     // Catch:{ GSSException -> 0x0192, IOException -> 0x0183 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ GSSException -> 0x0192, IOException -> 0x0183 }
            r2.<init>()     // Catch:{ GSSException -> 0x0192, IOException -> 0x0183 }
            java.lang.String r3 = "HTTP/"
            r2.append(r3)     // Catch:{ GSSException -> 0x0192, IOException -> 0x0183 }
            r2.append(r5)     // Catch:{ GSSException -> 0x0192, IOException -> 0x0183 }
            java.lang.String r5 = r2.toString()     // Catch:{ GSSException -> 0x0192, IOException -> 0x0183 }
            org.ietf.jgss.GSSName r5 = r1.createName(r5, r6)     // Catch:{ GSSException -> 0x0192, IOException -> 0x0183 }
            org.ietf.jgss.Oid r2 = r4.f20982g     // Catch:{ GSSException -> 0x0192, IOException -> 0x0183 }
            org.ietf.jgss.GSSName r5 = r5.canonicalize(r2)     // Catch:{ GSSException -> 0x0192, IOException -> 0x0183 }
            org.ietf.jgss.Oid r2 = r4.f20982g     // Catch:{ GSSException -> 0x0192, IOException -> 0x0183 }
            org.ietf.jgss.GSSContext r5 = r1.createContext(r5, r2, r6, r0)     // Catch:{ GSSException -> 0x0192, IOException -> 0x0183 }
            r4.f20979d = r5     // Catch:{ GSSException -> 0x0192, IOException -> 0x0183 }
            org.ietf.jgss.GSSContext r5 = r4.f20979d     // Catch:{ GSSException -> 0x0192, IOException -> 0x0183 }
            r5.requestMutualAuth(r7)     // Catch:{ GSSException -> 0x0192, IOException -> 0x0183 }
            org.ietf.jgss.GSSContext r5 = r4.f20979d     // Catch:{ GSSException -> 0x0192, IOException -> 0x0183 }
            r5.requestCredDeleg(r7)     // Catch:{ GSSException -> 0x0192, IOException -> 0x0183 }
        L_0x00f6:
            byte[] r5 = r4.f20981f     // Catch:{ GSSException -> 0x0192, IOException -> 0x0183 }
            if (r5 != 0) goto L_0x00fe
            byte[] r5 = new byte[r0]     // Catch:{ GSSException -> 0x0192, IOException -> 0x0183 }
            r4.f20981f = r5     // Catch:{ GSSException -> 0x0192, IOException -> 0x0183 }
        L_0x00fe:
            org.ietf.jgss.GSSContext r5 = r4.f20979d     // Catch:{ GSSException -> 0x0192, IOException -> 0x0183 }
            byte[] r6 = r4.f20981f     // Catch:{ GSSException -> 0x0192, IOException -> 0x0183 }
            byte[] r7 = r4.f20981f     // Catch:{ GSSException -> 0x0192, IOException -> 0x0183 }
            int r7 = r7.length     // Catch:{ GSSException -> 0x0192, IOException -> 0x0183 }
            byte[] r5 = r5.initSecContext(r6, r0, r7)     // Catch:{ GSSException -> 0x0192, IOException -> 0x0183 }
            r4.f20981f = r5     // Catch:{ GSSException -> 0x0192, IOException -> 0x0183 }
            byte[] r5 = r4.f20981f     // Catch:{ GSSException -> 0x0192, IOException -> 0x0183 }
            if (r5 != 0) goto L_0x011b
            org.apache.a.f.a.k$a r5 = org.apache.p199a.p218f.p219a.C6395k.C6396a.FAILED     // Catch:{ GSSException -> 0x0192, IOException -> 0x0183 }
            r4.f20980e = r5     // Catch:{ GSSException -> 0x0192, IOException -> 0x0183 }
            org.apache.a.a.f r5 = new org.apache.a.a.f     // Catch:{ GSSException -> 0x0192, IOException -> 0x0183 }
            java.lang.String r6 = "GSS security context initialization failed"
            r5.<init>(r6)     // Catch:{ GSSException -> 0x0192, IOException -> 0x0183 }
            throw r5     // Catch:{ GSSException -> 0x0192, IOException -> 0x0183 }
        L_0x011b:
            org.apache.a.f.a.n r5 = r4.f20977b     // Catch:{ GSSException -> 0x0192, IOException -> 0x0183 }
            if (r5 == 0) goto L_0x0137
            org.ietf.jgss.Oid r5 = r4.f20982g     // Catch:{ GSSException -> 0x0192, IOException -> 0x0183 }
            java.lang.String r5 = r5.toString()     // Catch:{ GSSException -> 0x0192, IOException -> 0x0183 }
            java.lang.String r6 = "1.2.840.113554.1.2.2"
            boolean r5 = r5.equals(r6)     // Catch:{ GSSException -> 0x0192, IOException -> 0x0183 }
            if (r5 == 0) goto L_0x0137
            org.apache.a.f.a.n r5 = r4.f20977b     // Catch:{ GSSException -> 0x0192, IOException -> 0x0183 }
            byte[] r6 = r4.f20981f     // Catch:{ GSSException -> 0x0192, IOException -> 0x0183 }
            byte[] r5 = r5.mo22708a(r6)     // Catch:{ GSSException -> 0x0192, IOException -> 0x0183 }
            r4.f20981f = r5     // Catch:{ GSSException -> 0x0192, IOException -> 0x0183 }
        L_0x0137:
            org.apache.a.f.a.k$a r5 = org.apache.p199a.p218f.p219a.C6395k.C6396a.TOKEN_GENERATED     // Catch:{ GSSException -> 0x0192, IOException -> 0x0183 }
            r4.f20980e = r5     // Catch:{ GSSException -> 0x0192, IOException -> 0x0183 }
            java.lang.String r5 = new java.lang.String     // Catch:{ GSSException -> 0x0192, IOException -> 0x0183 }
            byte[] r6 = r4.f20981f     // Catch:{ GSSException -> 0x0192, IOException -> 0x0183 }
            byte[] r6 = org.apache.commons.p230a.p231a.C6570a.m26013a(r6, r0)     // Catch:{ GSSException -> 0x0192, IOException -> 0x0183 }
            r5.<init>(r6)     // Catch:{ GSSException -> 0x0192, IOException -> 0x0183 }
            org.apache.commons.logging.Log r6 = r4.f20976a     // Catch:{ GSSException -> 0x0192, IOException -> 0x0183 }
            boolean r6 = r6.isDebugEnabled()     // Catch:{ GSSException -> 0x0192, IOException -> 0x0183 }
            if (r6 == 0) goto L_0x0169
            org.apache.commons.logging.Log r6 = r4.f20976a     // Catch:{ GSSException -> 0x0192, IOException -> 0x0183 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ GSSException -> 0x0192, IOException -> 0x0183 }
            r7.<init>()     // Catch:{ GSSException -> 0x0192, IOException -> 0x0183 }
            java.lang.String r0 = "Sending response '"
            r7.append(r0)     // Catch:{ GSSException -> 0x0192, IOException -> 0x0183 }
            r7.append(r5)     // Catch:{ GSSException -> 0x0192, IOException -> 0x0183 }
            java.lang.String r0 = "' back to the auth server"
            r7.append(r0)     // Catch:{ GSSException -> 0x0192, IOException -> 0x0183 }
            java.lang.String r7 = r7.toString()     // Catch:{ GSSException -> 0x0192, IOException -> 0x0183 }
            r6.debug(r7)     // Catch:{ GSSException -> 0x0192, IOException -> 0x0183 }
        L_0x0169:
            org.apache.a.h.b r6 = new org.apache.a.h.b     // Catch:{ GSSException -> 0x0192, IOException -> 0x0183 }
            java.lang.String r7 = "Authorization"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ GSSException -> 0x0192, IOException -> 0x0183 }
            r0.<init>()     // Catch:{ GSSException -> 0x0192, IOException -> 0x0183 }
            java.lang.String r1 = "Negotiate "
            r0.append(r1)     // Catch:{ GSSException -> 0x0192, IOException -> 0x0183 }
            r0.append(r5)     // Catch:{ GSSException -> 0x0192, IOException -> 0x0183 }
            java.lang.String r5 = r0.toString()     // Catch:{ GSSException -> 0x0192, IOException -> 0x0183 }
            r6.<init>(r7, r5)     // Catch:{ GSSException -> 0x0192, IOException -> 0x0183 }
            return r6
        L_0x0182:
            throw r1     // Catch:{ GSSException -> 0x0192, IOException -> 0x0183 }
        L_0x0183:
            r5 = move-exception
            org.apache.a.f.a.k$a r6 = org.apache.p199a.p218f.p219a.C6395k.C6396a.FAILED
            r4.f20980e = r6
            org.apache.a.a.f r6 = new org.apache.a.a.f
            java.lang.String r5 = r5.getMessage()
            r6.<init>(r5)
            throw r6
        L_0x0192:
            r5 = move-exception
            org.apache.a.f.a.k$a r6 = org.apache.p199a.p218f.p219a.C6395k.C6396a.FAILED
            r4.f20980e = r6
            int r6 = r5.getMajor()
            r7 = 9
            if (r6 == r7) goto L_0x01e7
            int r6 = r5.getMajor()
            r7 = 8
            if (r6 != r7) goto L_0x01a8
            goto L_0x01e7
        L_0x01a8:
            int r6 = r5.getMajor()
            r7 = 13
            if (r6 != r7) goto L_0x01ba
            org.apache.a.a.i r6 = new org.apache.a.a.i
            java.lang.String r7 = r5.getMessage()
            r6.<init>(r7, r5)
            throw r6
        L_0x01ba:
            int r6 = r5.getMajor()
            r7 = 10
            if (r6 == r7) goto L_0x01dd
            int r6 = r5.getMajor()
            r7 = 19
            if (r6 == r7) goto L_0x01dd
            int r6 = r5.getMajor()
            r7 = 20
            if (r6 != r7) goto L_0x01d3
            goto L_0x01dd
        L_0x01d3:
            org.apache.a.a.f r6 = new org.apache.a.a.f
            java.lang.String r5 = r5.getMessage()
            r6.<init>(r5)
            throw r6
        L_0x01dd:
            org.apache.a.a.f r6 = new org.apache.a.a.f
            java.lang.String r7 = r5.getMessage()
            r6.<init>(r7, r5)
            throw r6
        L_0x01e7:
            org.apache.a.a.i r6 = new org.apache.a.a.i
            java.lang.String r7 = r5.getMessage()
            r6.<init>(r7, r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.p199a.p218f.p219a.C6395k.mo22411a(org.apache.a.a.h, org.apache.a.o, org.apache.a.j.e):org.apache.a.c");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo22676a(C6549b bVar, int i, int i2) throws C6258j {
        String b = bVar.mo23049b(i, i2);
        if (this.f20976a.isDebugEnabled()) {
            Log log = this.f20976a;
            StringBuilder sb = new StringBuilder();
            sb.append("Received challenge '");
            sb.append(b);
            sb.append("' from the auth server");
            log.debug(sb.toString());
        }
        if (this.f20980e == C6396a.UNINITIATED) {
            this.f20981f = new C6570a().mo23082b(b.getBytes());
            this.f20980e = C6396a.CHALLENGE_RECEIVED;
            return;
        }
        this.f20976a.debug("Authentication already attempted");
        this.f20980e = C6396a.FAILED;
    }
}
