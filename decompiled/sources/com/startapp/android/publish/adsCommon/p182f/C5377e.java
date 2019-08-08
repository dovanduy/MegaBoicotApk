package com.startapp.android.publish.adsCommon.p182f;

import android.content.Context;
import android.telephony.TelephonyManager;
import android.util.Pair;
import com.startapp.android.publish.adsCommon.BaseRequest;
import com.startapp.android.publish.adsCommon.C5416l;
import com.startapp.android.publish.adsCommon.Utils.C5300c;
import com.startapp.android.publish.adsCommon.Utils.C5302e;
import com.startapp.common.p193a.C5503a;
import com.startapp.common.p193a.C5509c;
import com.startapp.common.p193a.C5518g;
import java.util.List;
import org.json.JSONArray;

/* renamed from: com.startapp.android.publish.adsCommon.f.e */
/* compiled from: StartAppSDK */
public class C5377e extends BaseRequest {

    /* renamed from: a */
    private C5376d f17233a;

    /* renamed from: b */
    private String f17234b;

    /* renamed from: c */
    private String f17235c;

    /* renamed from: d */
    private String f17236d;

    /* renamed from: e */
    private String f17237e;

    /* renamed from: f */
    private String f17238f;

    /* renamed from: g */
    private String f17239g;

    /* renamed from: h */
    private Long f17240h;

    /* renamed from: i */
    private String f17241i;

    /* renamed from: j */
    private String f17242j;

    /* renamed from: k */
    private JSONArray f17243k;

    public C5377e(C5376d dVar) {
        this(dVar, "", "");
    }

    public C5377e(C5376d dVar, String str, String str2) {
        this.f17233a = dVar;
        this.f17234b = str;
        this.f17235c = str2;
    }

    public C5302e getNameValueJson() {
        C5302e nameValueJson = super.getNameValueJson();
        if (nameValueJson == null) {
            nameValueJson = new C5300c();
        }
        m22996a(nameValueJson);
        return nameValueJson;
    }

    /* renamed from: a */
    private void m22996a(C5302e eVar) {
        String d = C5503a.m23479d();
        eVar.mo19624a(C5503a.m23471a(), (Object) d, true);
        eVar.mo19624a(C5503a.m23475b(), (Object) C5503a.m23476b(d), true);
        eVar.mo19624a("category", (Object) mo19894e().mo19890a(), true);
        eVar.mo19624a("value", (Object) mo19896f(), false);
        eVar.mo19624a("d", (Object) mo19900h(), false);
        eVar.mo19624a("orientation", (Object) mo19902i(), false);
        eVar.mo19624a("usedRam", (Object) mo19904j(), false);
        eVar.mo19624a("freeRam", (Object) mo19905k(), false);
        eVar.mo19624a("sessionTime", (Object) mo19906l(), false);
        eVar.mo19624a("appActivity", (Object) mo19907m(), false);
        eVar.mo19624a("details", (Object) mo19898g(), false);
        eVar.mo19624a("details_json", (Object) mo19908n(), false);
        eVar.mo19624a("cellScanRes", (Object) mo19909o(), false);
        Pair c = C5416l.m23123c();
        Pair d2 = C5416l.m23126d();
        eVar.mo19624a((String) c.first, c.second, false);
        eVar.mo19624a((String) d2.first, d2.second, false);
    }

    /* renamed from: e */
    public C5376d mo19894e() {
        return this.f17233a;
    }

    /* renamed from: f */
    public String mo19896f() {
        return this.f17234b;
    }

    /* renamed from: d */
    public void mo19893d(String str) {
        this.f17234b = str;
    }

    /* renamed from: g */
    public String mo19898g() {
        return this.f17235c;
    }

    /* renamed from: h */
    public String mo19900h() {
        return this.f17236d;
    }

    /* renamed from: e */
    public void mo19895e(String str) {
        this.f17236d = str;
    }

    /* renamed from: i */
    public String mo19902i() {
        return this.f17237e;
    }

    /* renamed from: f */
    public void mo19897f(String str) {
        this.f17237e = str;
    }

    /* renamed from: j */
    public String mo19904j() {
        return this.f17238f;
    }

    /* renamed from: g */
    public void mo19899g(String str) {
        this.f17238f = str;
    }

    /* renamed from: k */
    public String mo19905k() {
        return this.f17239g;
    }

    /* renamed from: h */
    public void mo19901h(String str) {
        this.f17239g = str;
    }

    /* renamed from: l */
    public Long mo19906l() {
        return this.f17240h;
    }

    /* renamed from: m */
    public String mo19907m() {
        return this.f17241i;
    }

    /* renamed from: n */
    public JSONArray mo19908n() {
        return this.f17243k;
    }

    /* renamed from: a */
    public void mo19892a(JSONArray jSONArray) {
        this.f17243k = jSONArray;
    }

    /* renamed from: o */
    public String mo19909o() {
        return this.f17242j;
    }

    /* renamed from: i */
    public void mo19903i(String str) {
        this.f17242j = str;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo19891a(Context context) {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            if (telephonyManager != null) {
                List a = C5509c.m23503a(context, telephonyManager);
                if (a != null && a.size() > 0) {
                    mo19903i(C5503a.m23478c(a.toString()));
                }
            }
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Cannot fillCellDetails ");
            sb.append(e.getMessage());
            C5518g.m23561a(6, sb.toString());
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("InfoEventRequest [category=");
        sb.append(this.f17233a.mo19890a());
        sb.append(", value=");
        sb.append(this.f17234b);
        sb.append(", details=");
        sb.append(this.f17235c);
        sb.append(", d=");
        sb.append(this.f17236d);
        sb.append(", orientation=");
        sb.append(this.f17237e);
        sb.append(", usedRam=");
        sb.append(this.f17238f);
        sb.append(", freeRam=");
        sb.append(this.f17239g);
        sb.append(", sessionTime=");
        sb.append(this.f17240h);
        sb.append(", appActivity=");
        sb.append(this.f17241i);
        sb.append(", details_json=");
        sb.append(this.f17243k);
        sb.append(", cellScanRes=");
        sb.append(this.f17242j);
        sb.append("]");
        return sb.toString();
    }
}
