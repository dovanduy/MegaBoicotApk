package com.facebook.ads.internal.p074b;

import android.content.Context;
import com.facebook.ads.AdSettings;
import com.facebook.ads.AdSettings.TestAdType;
import com.facebook.ads.CacheFlag;
import com.facebook.ads.internal.p087n.C1771d;
import com.facebook.ads.internal.p091r.C1795a;
import com.facebook.ads.internal.p093t.C1821d;
import com.facebook.ads.internal.p094u.C1842b;
import com.facebook.ads.internal.p115w.p117b.C2325m;
import com.facebook.ads.internal.p115w.p117b.C2330q;
import com.facebook.ads.internal.protocol.AdPlacementType;
import com.facebook.ads.internal.protocol.C1786d;
import com.facebook.ads.internal.protocol.C1787e;
import com.facebook.ads.internal.protocol.C1789g;
import java.util.EnumSet;

/* renamed from: com.facebook.ads.internal.b.a */
public class C1659a {

    /* renamed from: a */
    final String f5198a;

    /* renamed from: b */
    final C1787e f5199b;

    /* renamed from: c */
    final C1786d f5200c;

    /* renamed from: d */
    final EnumSet<CacheFlag> f5201d;

    /* renamed from: e */
    String f5202e;

    /* renamed from: f */
    boolean f5203f;

    /* renamed from: g */
    int f5204g;

    /* renamed from: h */
    C1821d f5205h;

    /* renamed from: i */
    private final AdPlacementType f5206i;

    /* renamed from: j */
    private final int f5207j;

    public C1659a(String str, C1787e eVar, AdPlacementType adPlacementType, C1786d dVar, int i) {
        this(str, eVar, adPlacementType, dVar, i, EnumSet.of(CacheFlag.NONE));
    }

    public C1659a(String str, C1787e eVar, AdPlacementType adPlacementType, C1786d dVar, int i, EnumSet<CacheFlag> enumSet) {
        this.f5198a = str;
        this.f5206i = adPlacementType;
        this.f5200c = dVar;
        this.f5207j = i;
        this.f5201d = enumSet;
        this.f5199b = eVar;
        this.f5204g = -1;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public AdPlacementType mo7364a() {
        return this.f5206i != null ? this.f5206i : this.f5200c == null ? AdPlacementType.NATIVE : this.f5200c == C1786d.INTERSTITIAL ? AdPlacementType.INTERSTITIAL : AdPlacementType.BANNER;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C1842b mo7365a(Context context, C1789g gVar) {
        Context context2 = context;
        C1842b bVar = new C1842b(context2, new C1771d(context2, false), this.f5198a, this.f5200c != null ? new C2325m(this.f5200c.mo7641b(), this.f5200c.mo7640a()) : null, this.f5199b, AdSettings.getTestAdType() != TestAdType.DEFAULT ? AdSettings.getTestAdType().getAdTypeString() : null, this.f5207j, AdSettings.isTestMode(context), AdSettings.isChildDirected(), gVar, C2330q.m9055a(C1795a.m7413G(context)), this.f5202e);
        return bVar;
    }

    /* renamed from: a */
    public void mo7366a(int i) {
        this.f5204g = i;
    }

    /* renamed from: a */
    public void mo7367a(C1821d dVar) {
        this.f5205h = dVar;
    }

    /* renamed from: a */
    public void mo7368a(String str) {
        this.f5202e = str;
    }

    /* renamed from: a */
    public void mo7369a(boolean z) {
        this.f5203f = z;
    }
}
