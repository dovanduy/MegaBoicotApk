package android.support.p017v4.p020b;

import android.support.p017v4.p023d.C0397l;
import android.util.Base64;
import java.util.List;

/* renamed from: android.support.v4.b.a */
/* compiled from: FontRequest */
public final class C0318a {

    /* renamed from: a */
    private final String f793a;

    /* renamed from: b */
    private final String f794b;

    /* renamed from: c */
    private final String f795c;

    /* renamed from: d */
    private final List<List<byte[]>> f796d;

    /* renamed from: e */
    private final int f797e = 0;

    /* renamed from: f */
    private final String f798f;

    public C0318a(String str, String str2, String str3, List<List<byte[]>> list) {
        this.f793a = (String) C0397l.m1469a(str);
        this.f794b = (String) C0397l.m1469a(str2);
        this.f795c = (String) C0397l.m1469a(str3);
        this.f796d = (List) C0397l.m1469a(list);
        StringBuilder sb = new StringBuilder(this.f793a);
        sb.append("-");
        sb.append(this.f794b);
        sb.append("-");
        sb.append(this.f795c);
        this.f798f = sb.toString();
    }

    /* renamed from: a */
    public String mo1116a() {
        return this.f793a;
    }

    /* renamed from: b */
    public String mo1117b() {
        return this.f794b;
    }

    /* renamed from: c */
    public String mo1118c() {
        return this.f795c;
    }

    /* renamed from: d */
    public List<List<byte[]>> mo1119d() {
        return this.f796d;
    }

    /* renamed from: e */
    public int mo1120e() {
        return this.f797e;
    }

    /* renamed from: f */
    public String mo1121f() {
        return this.f798f;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("FontRequest {mProviderAuthority: ");
        sb2.append(this.f793a);
        sb2.append(", mProviderPackage: ");
        sb2.append(this.f794b);
        sb2.append(", mQuery: ");
        sb2.append(this.f795c);
        sb2.append(", mCertificates:");
        sb.append(sb2.toString());
        for (int i = 0; i < this.f796d.size(); i++) {
            sb.append(" [");
            List list = (List) this.f796d.get(i);
            for (int i2 = 0; i2 < list.size(); i2++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString((byte[]) list.get(i2), 0));
                sb.append("\"");
            }
            sb.append(" ]");
        }
        sb.append("}");
        StringBuilder sb3 = new StringBuilder();
        sb3.append("mCertificatesArray: ");
        sb3.append(this.f797e);
        sb.append(sb3.toString());
        return sb.toString();
    }
}
