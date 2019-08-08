package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.View;
import com.google.android.gms.p137b.C3235a;
import com.google.android.gms.p137b.C3238b;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
@C3718cm
public final class asz extends aux implements ato {

    /* renamed from: a */
    private String f12123a;

    /* renamed from: b */
    private List<asy> f12124b;

    /* renamed from: c */
    private String f12125c;

    /* renamed from: d */
    private auh f12126d;

    /* renamed from: e */
    private String f12127e;

    /* renamed from: f */
    private double f12128f;

    /* renamed from: g */
    private String f12129g;

    /* renamed from: h */
    private String f12130h;

    /* renamed from: i */
    private asu f12131i;

    /* renamed from: j */
    private Bundle f12132j;

    /* renamed from: k */
    private aqe f12133k;

    /* renamed from: l */
    private View f12134l;

    /* renamed from: m */
    private C3235a f12135m;

    /* renamed from: n */
    private String f12136n;

    /* renamed from: o */
    private Object f12137o = new Object();
    /* access modifiers changed from: private */

    /* renamed from: p */
    public atk f12138p;

    public asz(String str, List<asy> list, String str2, auh auh, String str3, double d, String str4, String str5, asu asu, Bundle bundle, aqe aqe, View view, C3235a aVar, String str6) {
        this.f12123a = str;
        this.f12124b = list;
        this.f12125c = str2;
        this.f12126d = auh;
        this.f12127e = str3;
        this.f12128f = d;
        this.f12129g = str4;
        this.f12130h = str5;
        this.f12131i = asu;
        this.f12132j = bundle;
        this.f12133k = aqe;
        this.f12134l = view;
        this.f12135m = aVar;
        this.f12136n = str6;
    }

    /* renamed from: a */
    public final String mo14756a() {
        return this.f12123a;
    }

    /* renamed from: a */
    public final void mo14757a(Bundle bundle) {
        synchronized (this.f12137o) {
            if (this.f12138p == null) {
                C3900je.m17431c("#001 Attempt to perform click before app native ad initialized.");
            } else {
                this.f12138p.mo14853b(bundle);
            }
        }
    }

    /* renamed from: a */
    public final void mo14758a(atk atk) {
        synchronized (this.f12137o) {
            this.f12138p = atk;
        }
    }

    /* renamed from: b */
    public final List mo14759b() {
        return this.f12124b;
    }

    /* renamed from: b */
    public final boolean mo14760b(Bundle bundle) {
        synchronized (this.f12137o) {
            if (this.f12138p == null) {
                C3900je.m17431c("#002 Attempt to record impression before native ad initialized.");
                return false;
            }
            boolean a = this.f12138p.mo14852a(bundle);
            return a;
        }
    }

    /* renamed from: c */
    public final String mo14761c() {
        return this.f12125c;
    }

    /* renamed from: c */
    public final void mo14762c(Bundle bundle) {
        synchronized (this.f12137o) {
            if (this.f12138p == null) {
                C3900je.m17431c("#003 Attempt to report touch event before native ad initialized.");
            } else {
                this.f12138p.mo14855c(bundle);
            }
        }
    }

    /* renamed from: d */
    public final auh mo14763d() {
        return this.f12126d;
    }

    /* renamed from: e */
    public final String mo14764e() {
        return this.f12127e;
    }

    /* renamed from: f */
    public final double mo14765f() {
        return this.f12128f;
    }

    /* renamed from: g */
    public final String mo14766g() {
        return this.f12129g;
    }

    /* renamed from: h */
    public final String mo14767h() {
        return this.f12130h;
    }

    /* renamed from: i */
    public final aqe mo14768i() {
        return this.f12133k;
    }

    /* renamed from: j */
    public final C3235a mo14769j() {
        return C3238b.m11573a(this.f12138p);
    }

    /* renamed from: k */
    public final String mo14770k() {
        return "2";
    }

    /* renamed from: l */
    public final String mo14771l() {
        return "";
    }

    /* renamed from: m */
    public final asu mo14772m() {
        return this.f12131i;
    }

    /* renamed from: n */
    public final Bundle mo14773n() {
        return this.f12132j;
    }

    /* renamed from: o */
    public final View mo14774o() {
        return this.f12134l;
    }

    /* renamed from: p */
    public final C3235a mo14775p() {
        return this.f12135m;
    }

    /* renamed from: q */
    public final String mo14776q() {
        return this.f12136n;
    }

    /* renamed from: r */
    public final aud mo14777r() {
        return this.f12131i;
    }

    /* renamed from: s */
    public final void mo14778s() {
        C3909jn.f13411a.post(new ata(this));
        this.f12123a = null;
        this.f12124b = null;
        this.f12125c = null;
        this.f12126d = null;
        this.f12127e = null;
        this.f12128f = 0.0d;
        this.f12129g = null;
        this.f12130h = null;
        this.f12131i = null;
        this.f12132j = null;
        this.f12137o = null;
        this.f12133k = null;
        this.f12134l = null;
    }
}
