package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.View;
import com.google.android.gms.p137b.C3235a;
import com.google.android.gms.p137b.C3238b;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
@C3718cm
public final class atg extends awe implements ato {

    /* renamed from: a */
    private String f12168a;

    /* renamed from: b */
    private List<asy> f12169b;

    /* renamed from: c */
    private String f12170c;

    /* renamed from: d */
    private auh f12171d;

    /* renamed from: e */
    private String f12172e;

    /* renamed from: f */
    private String f12173f;

    /* renamed from: g */
    private double f12174g;

    /* renamed from: h */
    private String f12175h;

    /* renamed from: i */
    private String f12176i;

    /* renamed from: j */
    private asu f12177j;

    /* renamed from: k */
    private aqe f12178k;

    /* renamed from: l */
    private View f12179l;

    /* renamed from: m */
    private C3235a f12180m;

    /* renamed from: n */
    private String f12181n;

    /* renamed from: o */
    private Bundle f12182o;

    /* renamed from: p */
    private Object f12183p = new Object();
    /* access modifiers changed from: private */

    /* renamed from: q */
    public atk f12184q;

    public atg(String str, List<asy> list, String str2, auh auh, String str3, String str4, double d, String str5, String str6, asu asu, aqe aqe, View view, C3235a aVar, String str7, Bundle bundle) {
        this.f12168a = str;
        this.f12169b = list;
        this.f12170c = str2;
        this.f12171d = auh;
        this.f12172e = str3;
        this.f12173f = str4;
        this.f12174g = d;
        this.f12175h = str5;
        this.f12176i = str6;
        this.f12177j = asu;
        this.f12178k = aqe;
        this.f12179l = view;
        this.f12180m = aVar;
        this.f12181n = str7;
        this.f12182o = bundle;
    }

    /* renamed from: a */
    public final String mo14809a() {
        return this.f12168a;
    }

    /* renamed from: a */
    public final void mo14810a(Bundle bundle) {
        synchronized (this.f12183p) {
            if (this.f12184q == null) {
                C3900je.m17431c("#001 Attempt to perform click before app native ad initialized.");
            } else {
                this.f12184q.mo14853b(bundle);
            }
        }
    }

    /* renamed from: a */
    public final void mo14758a(atk atk) {
        synchronized (this.f12183p) {
            this.f12184q = atk;
        }
    }

    /* renamed from: a */
    public final void mo14811a(awb awb) {
        this.f12184q.mo14836a(awb);
    }

    /* renamed from: b */
    public final List mo14759b() {
        return this.f12169b;
    }

    /* renamed from: b */
    public final boolean mo14812b(Bundle bundle) {
        synchronized (this.f12183p) {
            if (this.f12184q == null) {
                C3900je.m17431c("#002 Attempt to record impression before native ad initialized.");
                return false;
            }
            boolean a = this.f12184q.mo14852a(bundle);
            return a;
        }
    }

    /* renamed from: c */
    public final String mo14813c() {
        return this.f12170c;
    }

    /* renamed from: c */
    public final void mo14814c(Bundle bundle) {
        synchronized (this.f12183p) {
            if (this.f12184q == null) {
                C3900je.m17431c("#003 Attempt to report touch event before native ad initialized.");
            } else {
                this.f12184q.mo14855c(bundle);
            }
        }
    }

    /* renamed from: d */
    public final auh mo14815d() {
        return this.f12171d;
    }

    /* renamed from: e */
    public final String mo14816e() {
        return this.f12172e;
    }

    /* renamed from: f */
    public final String mo14817f() {
        return this.f12173f;
    }

    /* renamed from: g */
    public final double mo14818g() {
        return this.f12174g;
    }

    /* renamed from: h */
    public final String mo14819h() {
        return this.f12175h;
    }

    /* renamed from: i */
    public final String mo14820i() {
        return this.f12176i;
    }

    /* renamed from: j */
    public final aqe mo14821j() {
        return this.f12178k;
    }

    /* renamed from: k */
    public final String mo14770k() {
        return "6";
    }

    /* renamed from: l */
    public final String mo14771l() {
        return "";
    }

    /* renamed from: m */
    public final asu mo14772m() {
        return this.f12177j;
    }

    /* renamed from: n */
    public final C3235a mo14822n() {
        return C3238b.m11573a(this.f12184q);
    }

    /* renamed from: o */
    public final View mo14774o() {
        return this.f12179l;
    }

    /* renamed from: p */
    public final C3235a mo14823p() {
        return this.f12180m;
    }

    /* renamed from: q */
    public final String mo14824q() {
        return this.f12181n;
    }

    /* renamed from: r */
    public final Bundle mo14825r() {
        return this.f12182o;
    }

    /* renamed from: s */
    public final aud mo14826s() {
        return this.f12177j;
    }

    /* renamed from: t */
    public final void mo14827t() {
        C3909jn.f13411a.post(new ath(this));
    }

    /* renamed from: u */
    public final void mo14828u() {
        this.f12184q.mo14840c();
    }
}
