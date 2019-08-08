package org.apache.p199a.p214d;

import java.util.Locale;

/* renamed from: org.apache.a.d.e */
/* compiled from: CookieOrigin */
public final class C6346e {

    /* renamed from: a */
    private final String f20875a;

    /* renamed from: b */
    private final int f20876b;

    /* renamed from: c */
    private final String f20877c;

    /* renamed from: d */
    private final boolean f20878d;

    public C6346e(String str, int i, String str2, boolean z) {
        if (str == null) {
            throw new IllegalArgumentException("Host of origin may not be null");
        } else if (str.trim().length() == 0) {
            throw new IllegalArgumentException("Host of origin may not be blank");
        } else if (i < 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("Invalid port: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        } else if (str2 == null) {
            throw new IllegalArgumentException("Path of origin may not be null.");
        } else {
            this.f20875a = str.toLowerCase(Locale.ENGLISH);
            this.f20876b = i;
            if (str2.trim().length() != 0) {
                this.f20877c = str2;
            } else {
                this.f20877c = "/";
            }
            this.f20878d = z;
        }
    }

    /* renamed from: a */
    public String mo22588a() {
        return this.f20875a;
    }

    /* renamed from: b */
    public String mo22589b() {
        return this.f20877c;
    }

    /* renamed from: c */
    public int mo22590c() {
        return this.f20876b;
    }

    /* renamed from: d */
    public boolean mo22591d() {
        return this.f20878d;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        if (this.f20878d) {
            sb.append("(secure)");
        }
        sb.append(this.f20875a);
        sb.append(':');
        sb.append(Integer.toString(this.f20876b));
        sb.append(this.f20877c);
        sb.append(']');
        return sb.toString();
    }
}
