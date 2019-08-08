package org.apache.p199a.p229k;

import java.util.Map;

/* renamed from: org.apache.a.k.g */
/* compiled from: VersionInfo */
public class C6554g {

    /* renamed from: a */
    private final String f21267a;

    /* renamed from: b */
    private final String f21268b;

    /* renamed from: c */
    private final String f21269c;

    /* renamed from: d */
    private final String f21270d;

    /* renamed from: e */
    private final String f21271e;

    protected C6554g(String str, String str2, String str3, String str4, String str5) {
        if (str == null) {
            throw new IllegalArgumentException("Package identifier must not be null.");
        }
        this.f21267a = str;
        if (str2 == null) {
            str2 = "UNAVAILABLE";
        }
        this.f21268b = str2;
        if (str3 == null) {
            str3 = "UNAVAILABLE";
        }
        this.f21269c = str3;
        if (str4 == null) {
            str4 = "UNAVAILABLE";
        }
        this.f21270d = str4;
        if (str5 == null) {
            str5 = "UNAVAILABLE";
        }
        this.f21271e = str5;
    }

    /* renamed from: a */
    public final String mo23056a() {
        return this.f21269c;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer(20 + this.f21267a.length() + this.f21268b.length() + this.f21269c.length() + this.f21270d.length() + this.f21271e.length());
        stringBuffer.append("VersionInfo(");
        stringBuffer.append(this.f21267a);
        stringBuffer.append(':');
        stringBuffer.append(this.f21268b);
        if (!"UNAVAILABLE".equals(this.f21269c)) {
            stringBuffer.append(':');
            stringBuffer.append(this.f21269c);
        }
        if (!"UNAVAILABLE".equals(this.f21270d)) {
            stringBuffer.append(':');
            stringBuffer.append(this.f21270d);
        }
        stringBuffer.append(')');
        if (!"UNAVAILABLE".equals(this.f21271e)) {
            stringBuffer.append('@');
            stringBuffer.append(this.f21271e);
        }
        return stringBuffer.toString();
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final org.apache.p199a.p229k.C6554g m25970a(java.lang.String r4, java.lang.ClassLoader r5) {
        /*
            if (r4 != 0) goto L_0x000a
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "Package identifier must not be null."
            r4.<init>(r5)
            throw r4
        L_0x000a:
            if (r5 != 0) goto L_0x0014
            java.lang.Thread r5 = java.lang.Thread.currentThread()
            java.lang.ClassLoader r5 = r5.getContextClassLoader()
        L_0x0014:
            r0 = 0
            java.lang.StringBuffer r1 = new java.lang.StringBuffer     // Catch:{ IOException -> 0x004a }
            r1.<init>()     // Catch:{ IOException -> 0x004a }
            r2 = 46
            r3 = 47
            java.lang.String r2 = r4.replace(r2, r3)     // Catch:{ IOException -> 0x004a }
            r1.append(r2)     // Catch:{ IOException -> 0x004a }
            java.lang.String r2 = "/"
            r1.append(r2)     // Catch:{ IOException -> 0x004a }
            java.lang.String r2 = "version.properties"
            r1.append(r2)     // Catch:{ IOException -> 0x004a }
            java.lang.String r1 = r1.toString()     // Catch:{ IOException -> 0x004a }
            java.io.InputStream r1 = r5.getResourceAsStream(r1)     // Catch:{ IOException -> 0x004a }
            if (r1 == 0) goto L_0x004a
            java.util.Properties r2 = new java.util.Properties     // Catch:{ all -> 0x0045 }
            r2.<init>()     // Catch:{ all -> 0x0045 }
            r2.load(r1)     // Catch:{ all -> 0x0045 }
            r1.close()     // Catch:{ IOException -> 0x004b }
            goto L_0x004b
        L_0x0045:
            r2 = move-exception
            r1.close()     // Catch:{ IOException -> 0x004a }
            throw r2     // Catch:{ IOException -> 0x004a }
        L_0x004a:
            r2 = r0
        L_0x004b:
            if (r2 == 0) goto L_0x0051
            org.apache.a.k.g r0 = m25971a(r4, r2, r5)
        L_0x0051:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.p199a.p229k.C6554g.m25970a(java.lang.String, java.lang.ClassLoader):org.apache.a.k.g");
    }

    /* renamed from: a */
    protected static final C6554g m25971a(String str, Map map, ClassLoader classLoader) {
        String str2;
        String str3;
        String str4;
        if (str == null) {
            throw new IllegalArgumentException("Package identifier must not be null.");
        }
        String str5 = null;
        if (map != null) {
            String str6 = (String) map.get("info.module");
            if (str6 != null && str6.length() < 1) {
                str6 = null;
            }
            String str7 = (String) map.get("info.release");
            if (str7 != null && (str7.length() < 1 || str7.equals("${pom.version}"))) {
                str7 = null;
            }
            String str8 = (String) map.get("info.timestamp");
            str2 = (str8 == null || (str8.length() >= 1 && !str8.equals("${mvn.timestamp}"))) ? str8 : null;
            str4 = str6;
            str3 = str7;
        } else {
            str4 = null;
            str3 = null;
            str2 = null;
        }
        if (classLoader != null) {
            str5 = classLoader.toString();
        }
        C6554g gVar = new C6554g(str, str4, str3, str2, str5);
        return gVar;
    }
}
