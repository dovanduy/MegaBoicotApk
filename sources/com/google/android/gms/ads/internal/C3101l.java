package com.google.android.gms.ads.internal;

import android.content.Context;
import android.support.p017v4.p023d.C0398m;
import android.text.TextUtils;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.internal.ads.C3718cm;
import com.google.android.gms.internal.ads.aow;
import com.google.android.gms.internal.ads.aoz;
import com.google.android.gms.internal.ads.apd;
import com.google.android.gms.internal.ads.apw;
import com.google.android.gms.internal.ads.avi;
import com.google.android.gms.internal.ads.avl;
import com.google.android.gms.internal.ads.avp;
import com.google.android.gms.internal.ads.avs;
import com.google.android.gms.internal.ads.avv;
import com.google.android.gms.internal.ads.avy;
import com.google.android.gms.internal.ads.bca;
import com.google.android.gms.internal.ads.zzang;
import com.google.android.gms.internal.ads.zzjn;
import com.google.android.gms.internal.ads.zzpl;

@C3718cm
/* renamed from: com.google.android.gms.ads.internal.l */
public final class C3101l extends apd {

    /* renamed from: a */
    private aow f9035a;

    /* renamed from: b */
    private avi f9036b;

    /* renamed from: c */
    private avy f9037c;

    /* renamed from: d */
    private avl f9038d;

    /* renamed from: e */
    private C0398m<String, avp> f9039e = new C0398m<>();

    /* renamed from: f */
    private C0398m<String, avs> f9040f = new C0398m<>();

    /* renamed from: g */
    private avv f9041g;

    /* renamed from: h */
    private zzjn f9042h;

    /* renamed from: i */
    private PublisherAdViewOptions f9043i;

    /* renamed from: j */
    private zzpl f9044j;

    /* renamed from: k */
    private apw f9045k;

    /* renamed from: l */
    private final Context f9046l;

    /* renamed from: m */
    private final bca f9047m;

    /* renamed from: n */
    private final String f9048n;

    /* renamed from: o */
    private final zzang f9049o;

    /* renamed from: p */
    private final C3049bt f9050p;

    public C3101l(Context context, String str, bca bca, zzang zzang, C3049bt btVar) {
        this.f9046l = context;
        this.f9048n = str;
        this.f9047m = bca;
        this.f9049o = zzang;
        this.f9050p = btVar;
    }

    /* renamed from: a */
    public final aoz mo12638a() {
        Context context = this.f9046l;
        String str = this.f9048n;
        bca bca = this.f9047m;
        zzang zzang = this.f9049o;
        aow aow = this.f9035a;
        avi avi = this.f9036b;
        avy avy = this.f9037c;
        avl avl = this.f9038d;
        C0398m<String, avs> mVar = this.f9040f;
        C0398m<String, avp> mVar2 = this.f9039e;
        zzpl zzpl = this.f9044j;
        apw apw = this.f9045k;
        C3049bt btVar = this.f9050p;
        avv avv = this.f9041g;
        avv avv2 = avv;
        avv avv3 = avv2;
        C3098i iVar = new C3098i(context, str, bca, zzang, aow, avi, avy, avl, mVar, mVar2, zzpl, apw, btVar, avv3, this.f9042h, this.f9043i);
        return iVar;
    }

    /* renamed from: a */
    public final void mo12639a(PublisherAdViewOptions publisherAdViewOptions) {
        this.f9043i = publisherAdViewOptions;
    }

    /* renamed from: a */
    public final void mo12640a(aow aow) {
        this.f9035a = aow;
    }

    /* renamed from: a */
    public final void mo12641a(apw apw) {
        this.f9045k = apw;
    }

    /* renamed from: a */
    public final void mo12642a(avi avi) {
        this.f9036b = avi;
    }

    /* renamed from: a */
    public final void mo12643a(avl avl) {
        this.f9038d = avl;
    }

    /* renamed from: a */
    public final void mo12644a(avv avv, zzjn zzjn) {
        this.f9041g = avv;
        this.f9042h = zzjn;
    }

    /* renamed from: a */
    public final void mo12645a(avy avy) {
        this.f9037c = avy;
    }

    /* renamed from: a */
    public final void mo12646a(zzpl zzpl) {
        this.f9044j = zzpl;
    }

    /* renamed from: a */
    public final void mo12647a(String str, avs avs, avp avp) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Custom template ID for native custom template ad is empty. Please provide a valid template id.");
        }
        this.f9040f.put(str, avs);
        this.f9039e.put(str, avp);
    }
}
