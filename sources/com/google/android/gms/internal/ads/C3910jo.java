package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.jo */
final class C3910jo implements ast {

    /* renamed from: a */
    private final /* synthetic */ List f13419a;

    /* renamed from: b */
    private final /* synthetic */ ass f13420b;

    /* renamed from: c */
    private final /* synthetic */ Context f13421c;

    C3910jo(C3909jn jnVar, List list, ass ass, Context context) {
        this.f13419a = list;
        this.f13420b = ass;
        this.f13421c = context;
    }

    /* renamed from: a */
    public final void mo14737a() {
        for (String str : this.f13419a) {
            String str2 = "Pinging url: ";
            String valueOf = String.valueOf(str);
            C3900je.m17433d(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
            this.f13420b.mo14735a(Uri.parse(str), null, null);
        }
        this.f13420b.mo14733a((Activity) this.f13421c);
    }

    /* renamed from: b */
    public final void mo14738b() {
    }
}
