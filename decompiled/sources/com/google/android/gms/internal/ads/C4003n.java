package com.google.android.gms.internal.ads;

import com.appnext.base.p046b.C1245d;
import org.json.JSONException;
import org.json.JSONObject;

@C3718cm
/* renamed from: com.google.android.gms.internal.ads.n */
public class C4003n {

    /* renamed from: a */
    private final C4089qe f13599a;

    /* renamed from: b */
    private final String f13600b;

    public C4003n(C4089qe qeVar) {
        this(qeVar, "");
    }

    public C4003n(C4089qe qeVar, String str) {
        this.f13599a = qeVar;
        this.f13600b = str;
    }

    /* renamed from: a */
    public final void mo15650a(int i, int i2, int i3, int i4) {
        try {
            this.f13599a.mo14987a("onSizeChanged", new JSONObject().put("x", i).put("y", i2).put("width", i3).put("height", i4));
        } catch (JSONException e) {
            C3900je.m17430b("Error occured while dispatching size change.", e);
        }
    }

    /* renamed from: a */
    public final void mo15651a(int i, int i2, int i3, int i4, float f, int i5) {
        try {
            this.f13599a.mo14987a("onScreenInfoChanged", new JSONObject().put("width", i).put("height", i2).put("maxSizeWidth", i3).put("maxSizeHeight", i4).put("density", (double) f).put("rotation", i5));
        } catch (JSONException e) {
            C3900je.m17430b("Error occured while obtaining screen information.", e);
        }
    }

    /* renamed from: a */
    public final void mo15652a(String str) {
        try {
            this.f13599a.mo14987a("onError", new JSONObject().put("message", str).put(C1245d.f3959jb, this.f13600b));
        } catch (JSONException e) {
            C3900je.m17430b("Error occurred while dispatching error event.", e);
        }
    }

    /* renamed from: b */
    public final void mo15653b(int i, int i2, int i3, int i4) {
        try {
            this.f13599a.mo14987a("onDefaultPositionReceived", new JSONObject().put("x", i).put("y", i2).put("width", i3).put("height", i4));
        } catch (JSONException e) {
            C3900je.m17430b("Error occured while dispatching default position.", e);
        }
    }

    /* renamed from: b */
    public final void mo15654b(String str) {
        try {
            this.f13599a.mo14987a("onReadyEventReceived", new JSONObject().put("js", str));
        } catch (JSONException e) {
            C3900je.m17430b("Error occured while dispatching ready Event.", e);
        }
    }

    /* renamed from: c */
    public final void mo15655c(String str) {
        try {
            this.f13599a.mo14987a("onStateChanged", new JSONObject().put("state", str));
        } catch (JSONException e) {
            C3900je.m17430b("Error occured while dispatching state change.", e);
        }
    }
}
