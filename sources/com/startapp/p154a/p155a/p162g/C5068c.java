package com.startapp.p154a.p155a.p162g;

import com.startapp.p154a.p155a.p156a.C5042a;
import com.startapp.p154a.p155a.p159d.C5057e;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.startapp.a.a.g.c */
/* compiled from: StartAppSDK */
public class C5068c {

    /* renamed from: a */
    private final Map<C5065a, C5067b> f16396a = new HashMap();

    public C5068c() {
        this.f16396a.put(C5065a.ZERO, new C5072g());
        this.f16396a.put(C5065a.THREE, new C5071f());
        this.f16396a.put(C5065a.FOUR, new C5070e());
        this.f16396a.put(C5065a.FIVE, new C5069d());
    }

    /* renamed from: a */
    public C5042a mo18677a(C5065a aVar) {
        return ((C5067b) this.f16396a.get(aVar)).mo18676b();
    }

    /* renamed from: b */
    public C5057e mo18678b(C5065a aVar) {
        return ((C5067b) this.f16396a.get(aVar)).mo18675a();
    }
}
