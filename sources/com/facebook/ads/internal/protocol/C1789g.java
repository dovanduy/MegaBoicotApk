package com.facebook.ads.internal.protocol;

import android.content.Context;
import android.text.TextUtils;
import com.appnext.base.p046b.C1245d;
import com.facebook.ads.internal.p115w.p123h.C2370a;
import com.facebook.ads.internal.p115w.p123h.C2373b;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.internal.protocol.g */
public final class C1789g {

    /* renamed from: a */
    private final C1791a f5634a;

    /* renamed from: b */
    private final Long f5635b;

    /* renamed from: c */
    private final String f5636c;

    /* renamed from: d */
    private final String f5637d;

    /* renamed from: com.facebook.ads.internal.protocol.g$a */
    private enum C1791a {
        ID,
        CREATIVE,
        NONE
    }

    public C1789g(Context context, String str, String str2, C1787e eVar) {
        if (TextUtils.isEmpty(str)) {
            this.f5634a = C1791a.NONE;
            this.f5635b = null;
            this.f5637d = null;
            this.f5636c = null;
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            switch (C1791a.valueOf(jSONObject.getString(C1245d.f3961jd).toUpperCase())) {
                case ID:
                    this.f5634a = C1791a.ID;
                    this.f5635b = Long.valueOf(jSONObject.getString("bid_id"));
                    this.f5637d = jSONObject.getString("device_id");
                    this.f5636c = null;
                    break;
                case CREATIVE:
                    this.f5634a = C1791a.CREATIVE;
                    this.f5635b = Long.valueOf(jSONObject.getString("bid_id"));
                    this.f5637d = jSONObject.getString("device_id");
                    this.f5636c = new JSONObject(jSONObject.getString("payload")).toString();
                    break;
                default:
                    AdErrorType adErrorType = AdErrorType.BID_PAYLOAD_ERROR;
                    StringBuilder sb = new StringBuilder();
                    sb.append("Unsupported BidPayload type ");
                    sb.append(jSONObject.getString(C1245d.f3961jd));
                    throw new C1783b(adErrorType, sb.toString());
            }
            if (!jSONObject.getString("sdk_version").equals("5.1.0")) {
                throw new C1783b(AdErrorType.BID_IMPRESSION_MISMATCH, String.format(Locale.US, "Bid %d for SDK version %s being used on SDK version %s", new Object[]{this.f5635b, jSONObject.getString("sdk_version"), "5.1.0"}));
            } else if (!jSONObject.getString("resolved_placement_id").equals(str2)) {
                throw new C1783b(AdErrorType.BID_IMPRESSION_MISMATCH, String.format(Locale.US, "Bid %d for placement %s being used on placement %s", new Object[]{this.f5635b, jSONObject.getString("resolved_placement_id"), str2}));
            } else {
                HashSet hashSet = new HashSet(Arrays.asList(new Integer[]{Integer.valueOf(C1787e.WEBVIEW_INTERSTITIAL_HORIZONTAL.mo7642a()), Integer.valueOf(C1787e.WEBVIEW_INTERSTITIAL_VERTICAL.mo7642a()), Integer.valueOf(C1787e.WEBVIEW_INTERSTITIAL_TABLET.mo7642a()), Integer.valueOf(C1787e.WEBVIEW_INTERSTITIAL_UNKNOWN.mo7642a())}));
                if (jSONObject.getInt("template") != eVar.mo7642a() && (!hashSet.contains(Integer.valueOf(jSONObject.getInt("template"))) || !hashSet.contains(Integer.valueOf(eVar.mo7642a())))) {
                    throw new C1783b(AdErrorType.BID_IMPRESSION_MISMATCH, String.format(Locale.US, "Bid %d for template %s being used on template %s", new Object[]{this.f5635b, Integer.valueOf(jSONObject.getInt("template")), eVar}));
                }
            }
        } catch (JSONException e) {
            C2370a.m9149b(context, "api", C2373b.f7502d, e);
            throw new C1783b(AdErrorType.BID_PAYLOAD_ERROR, "Invalid BidPayload", e);
        }
    }

    /* renamed from: a */
    public void mo7643a(String str) {
        if (!this.f5637d.equals(str)) {
            throw new C1783b(AdErrorType.BID_IMPRESSION_MISMATCH, String.format(Locale.US, "Bid %d for IDFA %s being used on IDFA %s", new Object[]{this.f5635b, this.f5637d, str}));
        }
    }

    /* renamed from: a */
    public boolean mo7644a() {
        return this.f5634a == C1791a.CREATIVE;
    }

    /* renamed from: b */
    public String mo7645b() {
        return this.f5636c;
    }

    /* renamed from: c */
    public boolean mo7646c() {
        return this.f5634a != C1791a.NONE;
    }

    /* renamed from: d */
    public String mo7647d() {
        if (this.f5635b == null) {
            return null;
        }
        return this.f5635b.toString();
    }
}
