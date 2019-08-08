package com.startapp.android.publish.adsCommon.p182f;

import com.startapp.android.publish.adsCommon.Utils.C5300c;
import com.startapp.android.publish.adsCommon.Utils.C5302e;
import com.startapp.common.p193a.C5503a;

/* renamed from: com.startapp.android.publish.adsCommon.f.b */
/* compiled from: StartAppSDK */
public class C5373b extends C5377e {

    /* renamed from: a */
    private String f17205a;

    /* renamed from: b */
    private String f17206b;

    /* renamed from: c */
    private boolean f17207c;

    /* renamed from: d */
    private String f17208d;

    public C5373b(C5376d dVar) {
        super(dVar);
    }

    public C5302e getNameValueJson() {
        C5302e nameValueJson = super.getNameValueJson();
        if (nameValueJson == null) {
            nameValueJson = new C5300c();
        }
        nameValueJson.mo19624a("sens", (Object) mo19878a(), false);
        nameValueJson.mo19624a("bt", (Object) mo19881b(), false);
        nameValueJson.mo19624a("isService", (Object) Boolean.valueOf(mo19884c()), false);
        nameValueJson.mo19624a("packagingType", (Object) mo19885d(), false);
        return nameValueJson;
    }

    /* renamed from: a */
    public String mo19878a() {
        return this.f17205a;
    }

    /* renamed from: b */
    public String mo19881b() {
        return this.f17206b;
    }

    /* renamed from: a */
    public void mo19879a(String str) {
        if (str != null) {
            this.f17205a = C5503a.m23478c(str);
        }
    }

    /* renamed from: b */
    public void mo19882b(String str) {
        if (str != null) {
            this.f17206b = C5503a.m23478c(str);
        }
    }

    /* renamed from: c */
    public boolean mo19884c() {
        return this.f17207c;
    }

    /* renamed from: a */
    public void mo19880a(boolean z) {
        this.f17207c = z;
    }

    /* renamed from: d */
    public String mo19885d() {
        return this.f17208d;
    }

    /* renamed from: c */
    public void mo19883c(String str) {
        this.f17208d = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(" DataEventRequest [");
        sb.append("sensors=");
        sb.append(this.f17205a);
        sb.append(", bluetooth=");
        sb.append(this.f17206b);
        sb.append(", isService=");
        sb.append(this.f17207c);
        sb.append(", packagingType=");
        sb.append(this.f17208d);
        sb.append("]");
        return sb.toString();
    }
}
