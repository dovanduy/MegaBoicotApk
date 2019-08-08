package org.apache.p199a.p218f.p222d;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.apache.p199a.p214d.C6342a;
import org.apache.p199a.p214d.C6353l;

/* renamed from: org.apache.a.f.d.c */
/* compiled from: BasicClientCookie */
public class C6450c implements Serializable, Cloneable, C6342a, C6353l {

    /* renamed from: a */
    private final String f21107a;

    /* renamed from: b */
    private Map<String, String> f21108b;

    /* renamed from: c */
    private String f21109c;

    /* renamed from: d */
    private String f21110d;

    /* renamed from: e */
    private String f21111e;

    /* renamed from: f */
    private Date f21112f;

    /* renamed from: g */
    private String f21113g;

    /* renamed from: h */
    private boolean f21114h;

    /* renamed from: i */
    private int f21115i;

    /* renamed from: e */
    public int[] mo22580e() {
        return null;
    }

    public C6450c(String str, String str2) {
        if (str == null) {
            throw new IllegalArgumentException("Name may not be null");
        }
        this.f21107a = str;
        this.f21108b = new HashMap();
        this.f21109c = str2;
    }

    /* renamed from: a */
    public String mo22575a() {
        return this.f21107a;
    }

    /* renamed from: b */
    public String mo22577b() {
        return this.f21109c;
    }

    /* renamed from: c */
    public void mo22607c(String str) {
        this.f21110d = str;
    }

    /* renamed from: b */
    public void mo22606b(Date date) {
        this.f21112f = date;
    }

    /* renamed from: c */
    public String mo22578c() {
        return this.f21111e;
    }

    /* renamed from: d */
    public void mo22608d(String str) {
        if (str != null) {
            this.f21111e = str.toLowerCase(Locale.ENGLISH);
        } else {
            this.f21111e = null;
        }
    }

    /* renamed from: d */
    public String mo22579d() {
        return this.f21113g;
    }

    /* renamed from: e */
    public void mo22609e(String str) {
        this.f21113g = str;
    }

    /* renamed from: f */
    public boolean mo22581f() {
        return this.f21114h;
    }

    /* renamed from: a */
    public void mo22605a(boolean z) {
        this.f21114h = z;
    }

    /* renamed from: g */
    public int mo22582g() {
        return this.f21115i;
    }

    /* renamed from: a */
    public void mo22604a(int i) {
        this.f21115i = i;
    }

    /* renamed from: a */
    public boolean mo22576a(Date date) {
        if (date != null) {
            return this.f21112f != null && this.f21112f.getTime() <= date.getTime();
        }
        throw new IllegalArgumentException("Date may not be null");
    }

    /* renamed from: a */
    public void mo22839a(String str, String str2) {
        this.f21108b.put(str, str2);
    }

    /* renamed from: a */
    public String mo22573a(String str) {
        return (String) this.f21108b.get(str);
    }

    /* renamed from: b */
    public boolean mo22574b(String str) {
        return this.f21108b.get(str) != null;
    }

    public Object clone() throws CloneNotSupportedException {
        C6450c cVar = (C6450c) super.clone();
        cVar.f21108b = new HashMap(this.f21108b);
        return cVar;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[version: ");
        sb.append(Integer.toString(this.f21115i));
        sb.append("]");
        sb.append("[name: ");
        sb.append(this.f21107a);
        sb.append("]");
        sb.append("[value: ");
        sb.append(this.f21109c);
        sb.append("]");
        sb.append("[domain: ");
        sb.append(this.f21111e);
        sb.append("]");
        sb.append("[path: ");
        sb.append(this.f21113g);
        sb.append("]");
        sb.append("[expiry: ");
        sb.append(this.f21112f);
        sb.append("]");
        return sb.toString();
    }
}
