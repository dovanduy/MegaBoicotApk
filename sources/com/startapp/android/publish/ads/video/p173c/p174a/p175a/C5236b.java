package com.startapp.android.publish.ads.video.p173c.p174a.p175a;

import android.text.TextUtils;
import com.startapp.common.p193a.C5518g;

/* renamed from: com.startapp.android.publish.ads.video.c.a.a.b */
/* compiled from: StartAppSDK */
public class C5236b {

    /* renamed from: a */
    private String f16826a;

    /* renamed from: b */
    private String f16827b;

    /* renamed from: c */
    private String f16828c;

    /* renamed from: d */
    private String f16829d;

    /* renamed from: e */
    private Integer f16830e;

    /* renamed from: f */
    private Integer f16831f;

    /* renamed from: g */
    private Integer f16832g;

    /* renamed from: h */
    private Boolean f16833h;

    /* renamed from: i */
    private Boolean f16834i;

    /* renamed from: j */
    private String f16835j;

    /* renamed from: a */
    private boolean m22405a(int i) {
        return i > 0 && i < 5000;
    }

    /* renamed from: a */
    public String mo19310a() {
        return this.f16826a;
    }

    /* renamed from: a */
    public void mo19313a(String str) {
        this.f16826a = str;
    }

    /* renamed from: b */
    public void mo19317b(String str) {
        this.f16827b = str;
    }

    /* renamed from: c */
    public void mo19320c(String str) {
        this.f16828c = str;
    }

    /* renamed from: b */
    public String mo19314b() {
        return this.f16829d;
    }

    /* renamed from: d */
    public void mo19322d(String str) {
        this.f16829d = str;
    }

    /* renamed from: c */
    public Integer mo19318c() {
        return this.f16830e;
    }

    /* renamed from: a */
    public void mo19312a(Integer num) {
        this.f16830e = num;
    }

    /* renamed from: d */
    public Integer mo19321d() {
        return this.f16831f;
    }

    /* renamed from: b */
    public void mo19316b(Integer num) {
        this.f16831f = num;
    }

    /* renamed from: e */
    public Integer mo19323e() {
        return this.f16832g;
    }

    /* renamed from: c */
    public void mo19319c(Integer num) {
        this.f16832g = num;
    }

    /* renamed from: a */
    public void mo19311a(Boolean bool) {
        this.f16833h = bool;
    }

    /* renamed from: b */
    public void mo19315b(Boolean bool) {
        this.f16834i = bool;
    }

    /* renamed from: e */
    public void mo19324e(String str) {
        this.f16835j = str;
    }

    /* renamed from: f */
    public boolean mo19325f() {
        if (TextUtils.isEmpty(mo19314b())) {
            C5518g.m23563a("VASTMediaFile", 3, "Validator error: mediaFile type empty");
            return false;
        }
        Integer e = mo19323e();
        Integer d = mo19321d();
        if (e == null || d == null || !m22405a(e.intValue()) || !m22405a(d.intValue())) {
            C5518g.m23563a("VASTMediaFile", 3, "Validator error: mediaFile invalid size");
            return false;
        } else if (!TextUtils.isEmpty(mo19310a())) {
            return true;
        } else {
            C5518g.m23563a("VASTMediaFile", 3, "Validator error: mediaFile url empty");
            return false;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MediaFile [url=");
        sb.append(this.f16826a);
        sb.append(", id=");
        sb.append(this.f16827b);
        sb.append(", delivery=");
        sb.append(this.f16828c);
        sb.append(", type=");
        sb.append(this.f16829d);
        sb.append(", bitrate=");
        sb.append(this.f16830e);
        sb.append(", width=");
        sb.append(this.f16831f);
        sb.append(", height=");
        sb.append(this.f16832g);
        sb.append(", scalable=");
        sb.append(this.f16833h);
        sb.append(", maintainAspectRatio=");
        sb.append(this.f16834i);
        sb.append(", apiFramework=");
        sb.append(this.f16835j);
        sb.append("]");
        return sb.toString();
    }
}
