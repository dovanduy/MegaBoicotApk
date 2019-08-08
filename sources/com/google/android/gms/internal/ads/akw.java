package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.C3025aw;
import java.util.ArrayList;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
@C3718cm
public final class akw {

    /* renamed from: a */
    private final int f11296a;

    /* renamed from: b */
    private final int f11297b;

    /* renamed from: c */
    private final int f11298c;

    /* renamed from: d */
    private final alj f11299d;

    /* renamed from: e */
    private final alt f11300e;

    /* renamed from: f */
    private final Object f11301f = new Object();

    /* renamed from: g */
    private ArrayList<String> f11302g = new ArrayList<>();

    /* renamed from: h */
    private ArrayList<String> f11303h = new ArrayList<>();

    /* renamed from: i */
    private ArrayList<alh> f11304i = new ArrayList<>();

    /* renamed from: j */
    private int f11305j = 0;

    /* renamed from: k */
    private int f11306k = 0;

    /* renamed from: l */
    private int f11307l = 0;

    /* renamed from: m */
    private int f11308m;

    /* renamed from: n */
    private String f11309n = "";

    /* renamed from: o */
    private String f11310o = "";

    /* renamed from: p */
    private String f11311p = "";

    public akw(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        this.f11296a = i;
        this.f11297b = i2;
        this.f11298c = i3;
        this.f11299d = new alj(i4);
        this.f11300e = new alt(i5, i6, i7);
    }

    /* renamed from: a */
    private static String m14339a(ArrayList<String> arrayList, int i) {
        if (arrayList.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        ArrayList arrayList2 = arrayList;
        int size = arrayList2.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList2.get(i2);
            i2++;
            sb.append((String) obj);
            sb.append(' ');
            if (sb.length() > 100) {
                break;
            }
        }
        sb.deleteCharAt(sb.length() - 1);
        String sb2 = sb.toString();
        return sb2.length() < 100 ? sb2 : sb2.substring(0, 100);
    }

    /* renamed from: c */
    private final void m14340c(String str, boolean z, float f, float f2, float f3, float f4) {
        if (str != null && str.length() >= this.f11298c) {
            synchronized (this.f11301f) {
                this.f11302g.add(str);
                this.f11305j += str.length();
                if (z) {
                    this.f11303h.add(str);
                    ArrayList<alh> arrayList = this.f11304i;
                    alh alh = new alh(f, f2, f3, f4, this.f11303h.size() - 1);
                    arrayList.add(alh);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo14440a(int i) {
        this.f11306k = i;
    }

    /* renamed from: a */
    public final void mo14441a(String str, boolean z, float f, float f2, float f3, float f4) {
        m14340c(str, z, f, f2, f3, f4);
        synchronized (this.f11301f) {
            if (this.f11307l < 0) {
                C3900je.m17429b("ActivityContent: negative number of WebViews.");
            }
            mo14451h();
        }
    }

    /* renamed from: a */
    public final boolean mo14442a() {
        boolean z;
        synchronized (this.f11301f) {
            z = this.f11307l == 0;
        }
        return z;
    }

    /* renamed from: b */
    public final String mo14443b() {
        return this.f11309n;
    }

    /* renamed from: b */
    public final void mo14444b(String str, boolean z, float f, float f2, float f3, float f4) {
        m14340c(str, z, f, f2, f3, f4);
    }

    /* renamed from: c */
    public final String mo14445c() {
        return this.f11310o;
    }

    /* renamed from: d */
    public final String mo14446d() {
        return this.f11311p;
    }

    /* renamed from: e */
    public final void mo14447e() {
        synchronized (this.f11301f) {
            this.f11308m -= 100;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof akw)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        akw akw = (akw) obj;
        return akw.f11309n != null && akw.f11309n.equals(this.f11309n);
    }

    /* renamed from: f */
    public final void mo14449f() {
        synchronized (this.f11301f) {
            this.f11307l--;
        }
    }

    /* renamed from: g */
    public final void mo14450g() {
        synchronized (this.f11301f) {
            this.f11307l++;
        }
    }

    /* renamed from: h */
    public final void mo14451h() {
        synchronized (this.f11301f) {
            int i = (this.f11305j * this.f11296a) + (this.f11306k * this.f11297b);
            if (i > this.f11308m) {
                this.f11308m = i;
                if (((Boolean) aoq.m14620f().mo14695a(aru.f11771W)).booleanValue() && !C3025aw.m10921i().mo15449l().mo15494b()) {
                    this.f11309n = this.f11299d.mo14495a(this.f11302g);
                    this.f11310o = this.f11299d.mo14495a(this.f11303h);
                }
                if (((Boolean) aoq.m14620f().mo14695a(aru.f11773Y)).booleanValue() && !C3025aw.m10921i().mo15449l().mo15500d()) {
                    this.f11311p = this.f11300e.mo14504a(this.f11303h, this.f11304i);
                }
            }
        }
    }

    public final int hashCode() {
        return this.f11309n.hashCode();
    }

    /* renamed from: i */
    public final int mo14453i() {
        return this.f11308m;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public final int mo14454j() {
        return this.f11305j;
    }

    public final String toString() {
        int i = this.f11306k;
        int i2 = this.f11308m;
        int i3 = this.f11305j;
        String a = m14339a(this.f11302g, 100);
        String a2 = m14339a(this.f11303h, 100);
        String str = this.f11309n;
        String str2 = this.f11310o;
        String str3 = this.f11311p;
        StringBuilder sb = new StringBuilder(165 + String.valueOf(a).length() + String.valueOf(a2).length() + String.valueOf(str).length() + String.valueOf(str2).length() + String.valueOf(str3).length());
        sb.append("ActivityContent fetchId: ");
        sb.append(i);
        sb.append(" score:");
        sb.append(i2);
        sb.append(" total_length:");
        sb.append(i3);
        sb.append("\n text: ");
        sb.append(a);
        sb.append("\n viewableText");
        sb.append(a2);
        sb.append("\n signture: ");
        sb.append(str);
        sb.append("\n viewableSignture: ");
        sb.append(str2);
        sb.append("\n viewableSignatureForVertical: ");
        sb.append(str3);
        return sb.toString();
    }
}
