package org.apache.p199a.p200a;

import java.util.Locale;
import org.apache.p199a.p229k.C6553f;

/* renamed from: org.apache.a.a.d */
/* compiled from: AuthScope */
public class C6252d {

    /* renamed from: a */
    public static final String f20798a = null;

    /* renamed from: b */
    public static final String f20799b = null;

    /* renamed from: c */
    public static final String f20800c = null;

    /* renamed from: d */
    public static final C6252d f20801d = new C6252d(f20798a, -1, f20799b, f20800c);

    /* renamed from: e */
    private final String f20802e;

    /* renamed from: f */
    private final String f20803f;

    /* renamed from: g */
    private final String f20804g;

    /* renamed from: h */
    private final int f20805h;

    public C6252d(String str, int i, String str2, String str3) {
        this.f20804g = str == null ? f20798a : str.toLowerCase(Locale.ENGLISH);
        if (i < 0) {
            i = -1;
        }
        this.f20805h = i;
        if (str2 == null) {
            str2 = f20799b;
        }
        this.f20803f = str2;
        this.f20802e = str3 == null ? f20800c : str3.toUpperCase(Locale.ENGLISH);
    }

    /* renamed from: a */
    public int mo22398a(C6252d dVar) {
        int i;
        if (C6553f.m25968a((Object) this.f20802e, (Object) dVar.f20802e)) {
            i = 1;
        } else if (this.f20802e != f20800c && dVar.f20802e != f20800c) {
            return -1;
        } else {
            i = 0;
        }
        if (C6553f.m25968a((Object) this.f20803f, (Object) dVar.f20803f)) {
            i += 2;
        } else if (!(this.f20803f == f20799b || dVar.f20803f == f20799b)) {
            return -1;
        }
        if (this.f20805h == dVar.f20805h) {
            i += 4;
        } else if (!(this.f20805h == -1 || dVar.f20805h == -1)) {
            return -1;
        }
        if (C6553f.m25968a((Object) this.f20804g, (Object) dVar.f20804g)) {
            i += 8;
        } else if (this.f20804g == f20798a || dVar.f20804g == f20798a) {
            return i;
        } else {
            return -1;
        }
        return i;
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6252d)) {
            return super.equals(obj);
        }
        C6252d dVar = (C6252d) obj;
        if (C6553f.m25968a((Object) this.f20804g, (Object) dVar.f20804g) && this.f20805h == dVar.f20805h && C6553f.m25968a((Object) this.f20803f, (Object) dVar.f20803f) && C6553f.m25968a((Object) this.f20802e, (Object) dVar.f20802e)) {
            z = true;
        }
        return z;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.f20802e != null) {
            sb.append(this.f20802e.toUpperCase(Locale.ENGLISH));
            sb.append(' ');
        }
        if (this.f20803f != null) {
            sb.append('\'');
            sb.append(this.f20803f);
            sb.append('\'');
        } else {
            sb.append("<any realm>");
        }
        if (this.f20804g != null) {
            sb.append('@');
            sb.append(this.f20804g);
            if (this.f20805h >= 0) {
                sb.append(':');
                sb.append(this.f20805h);
            }
        }
        return sb.toString();
    }

    public int hashCode() {
        return C6553f.m25966a(C6553f.m25966a(C6553f.m25965a(C6553f.m25966a(17, (Object) this.f20804g), this.f20805h), (Object) this.f20803f), (Object) this.f20802e);
    }
}
