package com.p055c.p056a.p057a.p058a.p060b.p061a;

import com.p055c.p056a.p057a.p058a.p060b.C1437b;
import com.p055c.p056a.p057a.p058a.p060b.C1444i;
import com.p055c.p056a.p057a.p058a.p062c.C1453e;
import com.p055c.p056a.p057a.p058a.p064e.C1461b;
import com.p055c.p056a.p057a.p058a.p064e.C1465e;
import org.json.JSONObject;

/* renamed from: com.c.a.a.a.b.a.a */
public final class C1436a {

    /* renamed from: a */
    private final C1444i f4375a;

    private C1436a(C1444i iVar) {
        this.f4375a = iVar;
    }

    /* renamed from: a */
    public static C1436a m5919a(C1437b bVar) {
        C1444i iVar = (C1444i) bVar;
        C1465e.m6070a((Object) bVar, "AdSession is null");
        C1465e.m6078g(iVar);
        C1465e.m6069a(iVar);
        C1465e.m6073b(iVar);
        C1465e.m6076e(iVar);
        C1436a aVar = new C1436a(iVar);
        iVar.mo6507f().mo6562a(aVar);
        return aVar;
    }

    /* renamed from: b */
    private void m5920b(float f) {
        if (f <= 0.0f) {
            throw new IllegalArgumentException("Invalid Video duration");
        }
    }

    /* renamed from: c */
    private void m5921c(float f) {
        if (f < 0.0f || f > 1.0f) {
            throw new IllegalArgumentException("Invalid Video volume");
        }
    }

    /* renamed from: a */
    public void mo6474a() {
        C1465e.m6074c(this.f4375a);
        this.f4375a.mo6507f().mo6566a("firstQuartile");
    }

    /* renamed from: a */
    public void mo6475a(float f) {
        m5921c(f);
        C1465e.m6074c(this.f4375a);
        JSONObject jSONObject = new JSONObject();
        C1461b.m6054a(jSONObject, "videoPlayerVolume", Float.valueOf(f));
        C1461b.m6054a(jSONObject, "deviceVolume", Float.valueOf(C1453e.m6020a().mo6553d()));
        this.f4375a.mo6507f().mo6568a("volumeChange", jSONObject);
    }

    /* renamed from: a */
    public void mo6476a(float f, float f2) {
        m5920b(f);
        m5921c(f2);
        C1465e.m6074c(this.f4375a);
        JSONObject jSONObject = new JSONObject();
        C1461b.m6054a(jSONObject, "duration", Float.valueOf(f));
        C1461b.m6054a(jSONObject, "videoPlayerVolume", Float.valueOf(f2));
        C1461b.m6054a(jSONObject, "deviceVolume", Float.valueOf(C1453e.m6020a().mo6553d()));
        this.f4375a.mo6507f().mo6568a(TtmlNode.START, jSONObject);
    }

    /* renamed from: b */
    public void mo6477b() {
        C1465e.m6074c(this.f4375a);
        this.f4375a.mo6507f().mo6566a("midpoint");
    }

    /* renamed from: c */
    public void mo6478c() {
        C1465e.m6074c(this.f4375a);
        this.f4375a.mo6507f().mo6566a("thirdQuartile");
    }

    /* renamed from: d */
    public void mo6479d() {
        C1465e.m6074c(this.f4375a);
        this.f4375a.mo6507f().mo6566a("complete");
    }

    /* renamed from: e */
    public void mo6480e() {
        C1465e.m6074c(this.f4375a);
        this.f4375a.mo6507f().mo6566a("pause");
    }

    /* renamed from: f */
    public void mo6481f() {
        C1465e.m6074c(this.f4375a);
        this.f4375a.mo6507f().mo6566a("bufferStart");
    }

    /* renamed from: g */
    public void mo6482g() {
        C1465e.m6074c(this.f4375a);
        this.f4375a.mo6507f().mo6566a("bufferFinish");
    }

    /* renamed from: h */
    public void mo6483h() {
        C1465e.m6074c(this.f4375a);
        this.f4375a.mo6507f().mo6566a("skipped");
    }
}
