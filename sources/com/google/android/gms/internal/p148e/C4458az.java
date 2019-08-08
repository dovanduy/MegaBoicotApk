package com.google.android.gms.internal.p148e;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.OnSharedPreferenceChangeListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.e.az */
public final class C4458az implements C4444al {

    /* renamed from: a */
    static final Map<String, C4458az> f14684a = new HashMap();

    /* renamed from: b */
    private final SharedPreferences f14685b;

    /* renamed from: c */
    private final OnSharedPreferenceChangeListener f14686c = new C4460ba(this);

    /* renamed from: d */
    private final Object f14687d = new Object();

    /* renamed from: e */
    private volatile Map<String, ?> f14688e;

    /* renamed from: f */
    private final List<C4443ak> f14689f = new ArrayList();

    /* renamed from: a */
    static C4458az m18936a(Context context, String str) {
        C4458az azVar;
        SharedPreferences sharedPreferences;
        if (!((!C4438af.m18876a() || str.startsWith("direct_boot:")) ? true : C4438af.m18877a(context))) {
            return null;
        }
        synchronized (C4458az.class) {
            azVar = (C4458az) f14684a.get(str);
            if (azVar == null) {
                if (str.startsWith("direct_boot:")) {
                    if (C4438af.m18876a()) {
                        context = context.createDeviceProtectedStorageContext();
                    }
                    sharedPreferences = context.getSharedPreferences(str.substring(12), 0);
                } else {
                    sharedPreferences = context.getSharedPreferences(str, 0);
                }
                azVar = new C4458az(sharedPreferences);
                f14684a.put(str, azVar);
            }
        }
        return azVar;
    }

    private C4458az(SharedPreferences sharedPreferences) {
        this.f14685b = sharedPreferences;
        this.f14685b.registerOnSharedPreferenceChangeListener(this.f14686c);
    }

    /* renamed from: a */
    public final Object mo16339a(String str) {
        Map<String, ?> map = this.f14688e;
        if (map == null) {
            synchronized (this.f14687d) {
                map = this.f14688e;
                if (map == null) {
                    map = this.f14685b.getAll();
                    this.f14688e = map;
                }
            }
        }
        if (map != null) {
            return map.get(str);
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo16357a(SharedPreferences sharedPreferences, String str) {
        synchronized (this.f14687d) {
            this.f14688e = null;
            C4451as.m18907a();
        }
        synchronized (this) {
            for (C4443ak a : this.f14689f) {
                a.mo16345a();
            }
        }
    }
}
