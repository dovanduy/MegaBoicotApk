package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.View;
import com.google.android.gms.p137b.C3235a;
import com.google.android.gms.p137b.C3238b;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
@C3718cm
public final class atb extends avb implements ato {

    /* renamed from: a */
    private String f12143a;

    /* renamed from: b */
    private List<asy> f12144b;

    /* renamed from: c */
    private String f12145c;

    /* renamed from: d */
    private auh f12146d;

    /* renamed from: e */
    private String f12147e;

    /* renamed from: f */
    private String f12148f;

    /* renamed from: g */
    private asu f12149g;

    /* renamed from: h */
    private Bundle f12150h;

    /* renamed from: i */
    private aqe f12151i;

    /* renamed from: j */
    private View f12152j;

    /* renamed from: k */
    private C3235a f12153k;

    /* renamed from: l */
    private String f12154l;

    /* renamed from: m */
    private Object f12155m = new Object();
    /* access modifiers changed from: private */

    /* renamed from: n */
    public atk f12156n;

    public atb(String str, List<asy> list, String str2, auh auh, String str3, String str4, asu asu, Bundle bundle, aqe aqe, View view, C3235a aVar, String str5) {
        this.f12143a = str;
        this.f12144b = list;
        this.f12145c = str2;
        this.f12146d = auh;
        this.f12147e = str3;
        this.f12148f = str4;
        this.f12149g = asu;
        this.f12150h = bundle;
        this.f12151i = aqe;
        this.f12152j = view;
        this.f12153k = aVar;
        this.f12154l = str5;
    }

    /* renamed from: a */
    public final String mo14780a() {
        return this.f12143a;
    }

    /* renamed from: a */
    public final void mo14781a(Bundle bundle) {
        synchronized (this.f12155m) {
            if (this.f12156n == null) {
                C3900je.m17431c("#001 Attempt to perform click before app native ad initialized.");
            } else {
                this.f12156n.mo14853b(bundle);
            }
        }
    }

    /* renamed from: a */
    public final void mo14758a(atk atk) {
        synchronized (this.f12155m) {
            this.f12156n = atk;
        }
    }

    /* renamed from: b */
    public final List mo14759b() {
        return this.f12144b;
    }

    /* renamed from: b */
    public final boolean mo14782b(Bundle bundle) {
        synchronized (this.f12155m) {
            if (this.f12156n == null) {
                C3900je.m17431c("#002 Attempt to record impression before native ad initialized.");
                return false;
            }
            boolean a = this.f12156n.mo14852a(bundle);
            return a;
        }
    }

    /* renamed from: c */
    public final C3235a mo14783c() {
        return this.f12153k;
    }

    /* renamed from: c */
    public final void mo14784c(Bundle bundle) {
        synchronized (this.f12155m) {
            if (this.f12156n == null) {
                C3900je.m17431c("#003 Attempt to report touch event before native ad initialized.");
            } else {
                this.f12156n.mo14855c(bundle);
            }
        }
    }

    /* renamed from: d */
    public final String mo14785d() {
        return this.f12154l;
    }

    /* renamed from: e */
    public final String mo14786e() {
        return this.f12145c;
    }

    /* renamed from: f */
    public final auh mo14787f() {
        return this.f12146d;
    }

    /* renamed from: g */
    public final String mo14788g() {
        return this.f12147e;
    }

    /* renamed from: h */
    public final String mo14789h() {
        return this.f12148f;
    }

    /* renamed from: i */
    public final aqe mo14790i() {
        return this.f12151i;
    }

    /* renamed from: j */
    public final C3235a mo14791j() {
        return C3238b.m11573a(this.f12156n);
    }

    /* renamed from: k */
    public final String mo14770k() {
        return "1";
    }

    /* renamed from: l */
    public final String mo14771l() {
        return "";
    }

    /* renamed from: m */
    public final asu mo14772m() {
        return this.f12149g;
    }

    /* renamed from: n */
    public final Bundle mo14792n() {
        return this.f12150h;
    }

    /* renamed from: o */
    public final View mo14774o() {
        return this.f12152j;
    }

    /* renamed from: p */
    public final aud mo14793p() {
        return this.f12149g;
    }

    /* renamed from: q */
    public final void mo14794q() {
        C3909jn.f13411a.post(new atc(this));
        this.f12143a = null;
        this.f12144b = null;
        this.f12145c = null;
        this.f12146d = null;
        this.f12147e = null;
        this.f12148f = null;
        this.f12149g = null;
        this.f12150h = null;
        this.f12155m = null;
        this.f12151i = null;
        this.f12152j = null;
    }
}
