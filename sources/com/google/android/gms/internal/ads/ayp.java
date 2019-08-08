package com.google.android.gms.internal.ads;

import android.content.Context;
import com.facebook.ads.AudienceNetworkActivity;
import com.google.android.exoplayer2.C2793C;
import com.google.android.gms.ads.internal.C3025aw;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONObject;

@ParametersAreNonnullByDefault
@C3718cm
public final class ayp extends azc<ban> implements ayy, aze {

    /* renamed from: a */
    private final C4144sf f12421a;

    /* JADX WARNING: type inference failed for: r3v0, types: [com.google.android.gms.internal.ads.ayp, com.google.android.gms.internal.ads.azb] */
    public ayp(Context context, zzang zzang) throws C4100qp {
        try {
            this.f12421a = new C4144sf(new C4129rr(context));
            this.f12421a.setWillNotDraw(true);
            this.f12421a.mo16027a((C4146sh) new ayq(this));
            this.f12421a.mo16028a((C4148sj) new ayr(this));
            this.f12421a.addJavascriptInterface(new ayx(this), "GoogleJsInterface");
            C3025aw.m10917e().mo15515a(context, zzang.f14505a, this.f12421a.getSettings());
        } catch (Throwable th) {
            throw new C4100qp("Init failed.", th);
        }
    }

    /* renamed from: a */
    public final void mo14988a() {
        this.f12421a.destroy();
    }

    /* renamed from: a */
    public final void mo14989a(azf azf) {
        this.f12421a.mo16029a((C4150sl) new ayu(azf));
    }

    /* renamed from: a */
    public final void mo14990a(String str) {
        mo14995c(String.format("<!DOCTYPE html><html><head><script src=\"%s\"></script></head></html>", new Object[]{str}));
    }

    /* renamed from: a */
    public final void mo14991a(String str, String str2) {
        ayz.m15801a((ayy) this, str, str2);
    }

    /* renamed from: a */
    public final void mo14986a(String str, Map map) {
        ayz.m15802a((ayy) this, str, map);
    }

    /* renamed from: a */
    public final void mo14987a(String str, JSONObject jSONObject) {
        ayz.m15804b(this, str, jSONObject);
    }

    /* renamed from: b */
    public final bao mo14992b() {
        return new bap(this);
    }

    /* renamed from: b */
    public final void mo14993b(String str) {
        C4014nk.f13617a.execute(new ayv(this, str));
    }

    /* renamed from: b */
    public final void mo14994b(String str, JSONObject jSONObject) {
        ayz.m15803a((ayy) this, str, jSONObject);
    }

    /* renamed from: c */
    public final void mo14995c(String str) {
        C4014nk.f13617a.execute(new ays(this, str));
    }

    /* renamed from: d */
    public final void mo14996d(String str) {
        C4014nk.f13617a.execute(new ayt(this, str));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final /* synthetic */ void mo14997e(String str) {
        this.f12421a.mo14993b(str);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public final /* synthetic */ void mo14998f(String str) {
        this.f12421a.loadUrl(str);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public final /* synthetic */ void mo14999g(String str) {
        this.f12421a.loadData(str, AudienceNetworkActivity.WEBVIEW_MIME_TYPE, C2793C.UTF8_NAME);
    }

    /* renamed from: o */
    public final /* bridge */ /* synthetic */ Object mo15000o() {
        if (this != null) {
            return this;
        }
        throw null;
    }
}
