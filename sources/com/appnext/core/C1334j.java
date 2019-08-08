package com.appnext.core;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.HashMap;

/* renamed from: com.appnext.core.j */
public final class C1334j {

    /* renamed from: ln */
    private static C1334j f4231ln;

    /* renamed from: dZ */
    private int f4232dZ = 24;
    /* access modifiers changed from: private */

    /* renamed from: lo */
    public HashMap<String, SharedPreferences> f4233lo = new HashMap<>();

    private C1334j() {
    }

    /* renamed from: j */
    public final void mo6264j(final Context context, final String str) {
        if (!this.f4233lo.containsKey(str.replace("/", ""))) {
            new Thread(new Runnable() {
                public final void run() {
                    HashMap a = C1334j.this.f4233lo;
                    String str = str;
                    Context context = context;
                    StringBuilder sb = new StringBuilder("apnxt_cap");
                    sb.append(str.replace("/", ""));
                    a.put(str, context.getSharedPreferences(sb.toString(), 0));
                }
            }).start();
        }
    }

    /* renamed from: cI */
    public static synchronized C1334j m5708cI() {
        C1334j jVar;
        synchronized (C1334j.class) {
            if (f4231ln == null) {
                f4231ln = new C1334j();
            }
            jVar = f4231ln;
        }
        return jVar;
    }

    /* renamed from: o */
    public final void mo6265o(String str, String str2) {
        ((SharedPreferences) this.f4233lo.get(str2)).edit().putLong(str, System.currentTimeMillis()).apply();
    }

    /* renamed from: p */
    public final boolean mo6266p(String str, String str2) {
        long j = ((SharedPreferences) this.f4233lo.get(str2)).getLong(str, -1);
        return j != -1 && System.currentTimeMillis() - ((long) (3600000 * this.f4232dZ)) <= j;
    }

    /* renamed from: q */
    public final boolean mo6267q(String str, String str2) {
        long j = ((SharedPreferences) this.f4233lo.get(str2)).getLong(str, -1);
        return j != -1 && System.currentTimeMillis() - 120000 <= j;
    }

    /* renamed from: aO */
    public final void mo6262aO(String str) {
        ((SharedPreferences) this.f4233lo.get(str)).edit().clear().apply();
    }

    /* renamed from: e */
    public final void mo6263e(int i) {
        this.f4232dZ = i;
    }
}
