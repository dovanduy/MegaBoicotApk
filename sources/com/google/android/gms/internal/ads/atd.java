package com.google.android.gms.internal.ads;

import android.support.p017v4.p023d.C0398m;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.p137b.C3235a;
import com.google.android.gms.p137b.C3238b;
import java.util.Arrays;
import java.util.List;

@C3718cm
public final class atd extends avf implements atn {

    /* renamed from: a */
    private final asu f12158a;

    /* renamed from: b */
    private final String f12159b;

    /* renamed from: c */
    private final C0398m<String, asy> f12160c;

    /* renamed from: d */
    private final C0398m<String, String> f12161d;

    /* renamed from: e */
    private aqe f12162e;

    /* renamed from: f */
    private View f12163f;

    /* renamed from: g */
    private final Object f12164g = new Object();
    /* access modifiers changed from: private */

    /* renamed from: h */
    public atk f12165h;

    public atd(String str, C0398m<String, asy> mVar, C0398m<String, String> mVar2, asu asu, aqe aqe, View view) {
        this.f12159b = str;
        this.f12160c = mVar;
        this.f12161d = mVar2;
        this.f12158a = asu;
        this.f12162e = aqe;
        this.f12163f = view;
    }

    /* renamed from: a */
    public final String mo14796a(String str) {
        return (String) this.f12161d.get(str);
    }

    /* renamed from: a */
    public final List<String> mo14797a() {
        String[] strArr = new String[(this.f12160c.size() + this.f12161d.size())];
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i2 < this.f12160c.size()) {
            strArr[i3] = (String) this.f12160c.mo1399b(i2);
            i2++;
            i3++;
        }
        while (i < this.f12161d.size()) {
            strArr[i3] = (String) this.f12161d.mo1399b(i);
            i++;
            i3++;
        }
        return Arrays.asList(strArr);
    }

    /* renamed from: a */
    public final void mo14758a(atk atk) {
        synchronized (this.f12164g) {
            this.f12165h = atk;
        }
    }

    /* renamed from: a */
    public final boolean mo14798a(C3235a aVar) {
        if (this.f12165h == null) {
            C3987mk.m17431c("Attempt to call renderVideoInMediaView before ad initialized.");
            return false;
        } else if (this.f12163f == null) {
            return false;
        } else {
            FrameLayout frameLayout = (FrameLayout) C3238b.m11574a(aVar);
            this.f12165h.mo14850a((View) frameLayout, (ati) new ate(this));
            return true;
        }
    }

    /* renamed from: b */
    public final C3235a mo14799b() {
        return C3238b.m11573a(this.f12165h);
    }

    /* renamed from: b */
    public final auh mo14800b(String str) {
        return (auh) this.f12160c.get(str);
    }

    /* renamed from: c */
    public final aqe mo14801c() {
        return this.f12162e;
    }

    /* renamed from: c */
    public final void mo14802c(String str) {
        synchronized (this.f12164g) {
            if (this.f12165h == null) {
                C3987mk.m17431c("#001 Attempt to perform click before app native ad initialized.");
            } else {
                this.f12165h.mo14851a(null, str, null, null, null);
            }
        }
    }

    /* renamed from: d */
    public final void mo14803d() {
        synchronized (this.f12164g) {
            if (this.f12165h == null) {
                C3987mk.m17431c("#002 Attempt to record impression before native ad initialized.");
            } else {
                this.f12165h.mo14832a((View) null, null);
            }
        }
    }

    /* renamed from: e */
    public final C3235a mo14804e() {
        return C3238b.m11573a(this.f12165h.mo14859m().getApplicationContext());
    }

    /* renamed from: f */
    public final void mo14805f() {
        C3909jn.f13411a.post(new atf(this));
        this.f12162e = null;
        this.f12163f = null;
    }

    /* renamed from: k */
    public final String mo14770k() {
        return "3";
    }

    /* renamed from: l */
    public final String mo14771l() {
        return this.f12159b;
    }

    /* renamed from: m */
    public final asu mo14772m() {
        return this.f12158a;
    }

    /* renamed from: o */
    public final View mo14774o() {
        return this.f12163f;
    }
}
