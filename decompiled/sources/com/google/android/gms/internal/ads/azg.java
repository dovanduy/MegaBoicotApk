package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.C3025aw;
import com.google.android.gms.ads.internal.C3049bt;
import com.google.android.gms.ads.internal.gmsg.C3067ae;
import com.google.android.gms.common.util.C3564p;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONObject;

@ParametersAreNonnullByDefault
@C3718cm
public final class azg implements ayy, aze {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C4089qe f12440a;

    /* renamed from: b */
    private final Context f12441b;

    public azg(Context context, zzang zzang, agw agw, C3049bt btVar) throws C4100qp {
        this.f12441b = context;
        C3025aw.m10918f();
        this.f12440a = C4096ql.m17760a(context, C4130rs.m17977a(), "", false, false, agw, zzang, null, null, null, amj.m14431a());
        this.f12440a.getView().setWillNotDraw(true);
    }

    /* renamed from: a */
    private static void m15821a(Runnable runnable) {
        aoq.m14615a();
        if (C3975lz.m17382b()) {
            runnable.run();
        } else {
            C3909jn.f13411a.post(runnable);
        }
    }

    /* renamed from: a */
    public final void mo14988a() {
        this.f12440a.destroy();
    }

    /* renamed from: a */
    public final void mo14989a(azf azf) {
        C4124rm v = this.f12440a.mo15919v();
        azf.getClass();
        v.mo15932a(azj.m15837a(azf));
    }

    /* renamed from: a */
    public final void mo14990a(String str) {
        m15821a((Runnable) new azl(this, String.format("<!DOCTYPE html><html><head><script src=\"%s\"></script></head><body></body></html>", new Object[]{str})));
    }

    /* renamed from: a */
    public final void mo15016a(String str, C3067ae<? super ban> aeVar) {
        this.f12440a.mo15880a(str, (C3067ae<? super C4089qe>) new azo<Object>(this, aeVar));
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
        m15821a((Runnable) new azh(this, str));
    }

    /* renamed from: b */
    public final void mo15017b(String str, C3067ae<? super ban> aeVar) {
        this.f12440a.mo15881a(str, (C3564p<C3067ae<? super C4089qe>>) new azi<C3067ae<? super C4089qe>>(aeVar));
    }

    /* renamed from: b */
    public final void mo14994b(String str, JSONObject jSONObject) {
        ayz.m15803a((ayy) this, str, jSONObject);
    }

    /* renamed from: c */
    public final void mo14995c(String str) {
        m15821a((Runnable) new azm(this, str));
    }

    /* renamed from: d */
    public final void mo14996d(String str) {
        m15821a((Runnable) new azn(this, str));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final /* synthetic */ void mo15018e(String str) {
        this.f12440a.mo14993b(str);
    }
}
