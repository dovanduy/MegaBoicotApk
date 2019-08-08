package com.google.android.gms.internal.ads;

import android.location.Location;
import android.os.Bundle;
import com.google.android.gms.ads.mediation.C3144b;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;

public final class aqm {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final HashSet<String> f11669a = new HashSet<>();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Bundle f11670b = new Bundle();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final HashMap<Class<? extends Object>, Object> f11671c = new HashMap<>();
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final HashSet<String> f11672d = new HashSet<>();
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final Bundle f11673e = new Bundle();
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final HashSet<String> f11674f = new HashSet<>();
    /* access modifiers changed from: private */

    /* renamed from: g */
    public Date f11675g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public String f11676h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public int f11677i = -1;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public Location f11678j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public boolean f11679k = false;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public String f11680l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public String f11681m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public int f11682n = -1;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public boolean f11683o;

    /* renamed from: a */
    public final void mo14600a(int i) {
        this.f11677i = i;
    }

    /* renamed from: a */
    public final void mo14601a(Location location) {
        this.f11678j = location;
    }

    /* renamed from: a */
    public final void mo14602a(Class<? extends C3144b> cls, Bundle bundle) {
        this.f11670b.putBundle(cls.getName(), bundle);
    }

    /* renamed from: a */
    public final void mo14603a(String str) {
        this.f11669a.add(str);
    }

    /* renamed from: a */
    public final void mo14604a(Date date) {
        this.f11675g = date;
    }

    /* renamed from: a */
    public final void mo14605a(boolean z) {
        this.f11682n = z ? 1 : 0;
    }

    /* renamed from: b */
    public final void mo14606b(String str) {
        this.f11672d.add(str);
    }

    /* renamed from: b */
    public final void mo14607b(boolean z) {
        this.f11683o = z;
    }

    /* renamed from: c */
    public final void mo14608c(String str) {
        this.f11672d.remove(str);
    }
}
