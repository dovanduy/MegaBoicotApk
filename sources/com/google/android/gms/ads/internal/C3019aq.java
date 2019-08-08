package com.google.android.gms.ads.internal;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.ViewGroup.LayoutParams;
import android.webkit.WebView;
import com.google.android.gms.common.internal.C3513t;
import com.google.android.gms.internal.ads.C3649af;
import com.google.android.gms.internal.ads.C3666api;
import com.google.android.gms.internal.ads.C3718cm;
import com.google.android.gms.internal.ads.C3822gh;
import com.google.android.gms.internal.ads.C3900je;
import com.google.android.gms.internal.ads.C3907jl;
import com.google.android.gms.internal.ads.C3975lz;
import com.google.android.gms.internal.ads.C4335y;
import com.google.android.gms.internal.ads.agw;
import com.google.android.gms.internal.ads.agx;
import com.google.android.gms.internal.ads.aoq;
import com.google.android.gms.internal.ads.aot;
import com.google.android.gms.internal.ads.aow;
import com.google.android.gms.internal.ads.apm;
import com.google.android.gms.internal.ads.apq;
import com.google.android.gms.internal.ads.apw;
import com.google.android.gms.internal.ads.aqe;
import com.google.android.gms.internal.ads.aru;
import com.google.android.gms.internal.ads.aso;
import com.google.android.gms.internal.ads.zzang;
import com.google.android.gms.internal.ads.zzjj;
import com.google.android.gms.internal.ads.zzjn;
import com.google.android.gms.internal.ads.zzlu;
import com.google.android.gms.internal.ads.zzmu;
import com.google.android.gms.p137b.C3235a;
import com.google.android.gms.p137b.C3238b;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
@C3718cm
/* renamed from: com.google.android.gms.ads.internal.aq */
public final class C3019aq extends C3666api {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final zzang f8786a;

    /* renamed from: b */
    private final zzjn f8787b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final Future<agw> f8788c = C3907jl.m17119a((Callable<T>) new C3022at<T>(this));
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final Context f8789d;

    /* renamed from: e */
    private final C3024av f8790e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public WebView f8791f = new WebView(this.f8789d);
    /* access modifiers changed from: private */

    /* renamed from: g */
    public aow f8792g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public agw f8793h;

    /* renamed from: i */
    private AsyncTask<Void, Void, String> f8794i;

    public C3019aq(Context context, zzjn zzjn, String str, zzang zzang) {
        this.f8789d = context;
        this.f8786a = zzang;
        this.f8787b = zzjn;
        this.f8790e = new C3024av(str);
        mo12505a(0);
        this.f8791f.setVerticalScrollBarEnabled(false);
        this.f8791f.getSettings().setJavaScriptEnabled(true);
        this.f8791f.setWebViewClient(new C3020ar(this));
        this.f8791f.setOnTouchListener(new C3021as(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public final String m10859c(String str) {
        if (this.f8793h == null) {
            return str;
        }
        Uri parse = Uri.parse(str);
        try {
            parse = this.f8793h.mo14285a(parse, this.f8789d, null, null);
        } catch (agx e) {
            C3900je.m17432c("Unable to process ad data", e);
        }
        return parse.toString();
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public final void m10861d(String str) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        this.f8789d.startActivity(intent);
    }

    /* renamed from: D */
    public final String mo12395D() {
        throw new IllegalStateException("getAdUnitId not implemented");
    }

    /* renamed from: E */
    public final apq mo12396E() {
        throw new IllegalStateException("getIAppEventListener not implemented");
    }

    /* renamed from: F */
    public final aow mo12397F() {
        throw new IllegalStateException("getIAdListener not implemented");
    }

    /* renamed from: I */
    public final void mo12456I() throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    /* renamed from: a */
    public final String mo12504a() throws RemoteException {
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo12505a(int i) {
        if (this.f8791f != null) {
            this.f8791f.setLayoutParams(new LayoutParams(-1, i));
        }
    }

    /* renamed from: a */
    public final void mo12404a(C3649af afVar, String str) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    /* renamed from: a */
    public final void mo12405a(aot aot) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    /* renamed from: a */
    public final void mo12406a(aow aow) throws RemoteException {
        this.f8792g = aow;
    }

    /* renamed from: a */
    public final void mo12407a(apm apm) {
        throw new IllegalStateException("Unused method");
    }

    /* renamed from: a */
    public final void mo12408a(apq apq) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    /* renamed from: a */
    public final void mo12409a(apw apw) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    /* renamed from: a */
    public final void mo12411a(aso aso) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    /* renamed from: a */
    public final void mo12413a(C3822gh ghVar) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    /* renamed from: a */
    public final void mo12416a(C4335y yVar) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    /* renamed from: a */
    public final void mo12417a(zzjn zzjn) throws RemoteException {
        throw new IllegalStateException("AdSize must be set before initialization");
    }

    /* renamed from: a */
    public final void mo12418a(zzlu zzlu) {
        throw new IllegalStateException("Unused method");
    }

    /* renamed from: a */
    public final void mo12419a(zzmu zzmu) {
        throw new IllegalStateException("Unused method");
    }

    /* renamed from: a */
    public final void mo12420a(String str) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final int mo12506b(String str) {
        String queryParameter = Uri.parse(str).getQueryParameter("height");
        if (TextUtils.isEmpty(queryParameter)) {
            return 0;
        }
        try {
            aoq.m14615a();
            return C3975lz.m17369a(this.f8789d, Integer.parseInt(queryParameter));
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    /* renamed from: b */
    public final void mo12430b(boolean z) throws RemoteException {
    }

    /* renamed from: b */
    public final boolean mo12431b(zzjj zzjj) throws RemoteException {
        C3513t.m12626a(this.f8791f, (Object) "This Search Ad has already been torn down");
        this.f8790e.mo12517a(zzjj, this.f8786a);
        this.f8794i = new C3023au(this, null).execute(new Void[0]);
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final String mo12507c() {
        Builder builder = new Builder();
        builder.scheme("https://").appendEncodedPath((String) aoq.m14620f().mo14695a(aru.f11931cx));
        builder.appendQueryParameter("query", this.f8790e.mo12518b());
        builder.appendQueryParameter("pubId", this.f8790e.mo12519c());
        Map d = this.f8790e.mo12520d();
        for (String str : d.keySet()) {
            builder.appendQueryParameter(str, (String) d.get(str));
        }
        Uri build = builder.build();
        if (this.f8793h != null) {
            try {
                build = this.f8793h.mo14284a(build, this.f8789d);
            } catch (agx e) {
                C3900je.m17432c("Unable to process ad data", e);
            }
        }
        String d2 = mo12508d();
        String encodedQuery = build.getEncodedQuery();
        StringBuilder sb = new StringBuilder(1 + String.valueOf(d2).length() + String.valueOf(encodedQuery).length());
        sb.append(d2);
        sb.append("#");
        sb.append(encodedQuery);
        return sb.toString();
    }

    /* renamed from: c */
    public final void mo12432c(boolean z) {
        throw new IllegalStateException("Unused method");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final String mo12508d() {
        String a = this.f8790e.mo12516a();
        if (TextUtils.isEmpty(a)) {
            a = "www.google.com";
        }
        String str = (String) aoq.m14620f().mo14695a(aru.f11931cx);
        StringBuilder sb = new StringBuilder(8 + String.valueOf(a).length() + String.valueOf(str).length());
        sb.append("https://");
        sb.append(a);
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: j */
    public final void mo12437j() throws RemoteException {
        C3513t.m12634b("destroy must be called on the main UI thread.");
        this.f8794i.cancel(true);
        this.f8788c.cancel(true);
        this.f8791f.destroy();
        this.f8791f = null;
    }

    /* renamed from: k */
    public final C3235a mo12438k() throws RemoteException {
        C3513t.m12634b("getAdFrame must be called on the main UI thread.");
        return C3238b.m11573a(this.f8791f);
    }

    /* renamed from: l */
    public final zzjn mo12439l() throws RemoteException {
        return this.f8787b;
    }

    /* renamed from: m */
    public final boolean mo12440m() throws RemoteException {
        return false;
    }

    /* renamed from: n */
    public final void mo12441n() throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    /* renamed from: o */
    public final void mo12442o() throws RemoteException {
        C3513t.m12634b("pause must be called on the main UI thread.");
    }

    /* renamed from: p */
    public final void mo12443p() throws RemoteException {
        C3513t.m12634b("resume must be called on the main UI thread.");
    }

    /* renamed from: q */
    public final Bundle mo12444q() {
        throw new IllegalStateException("Unused method");
    }

    /* renamed from: r */
    public final void mo12445r() throws RemoteException {
    }

    /* renamed from: s */
    public final boolean mo12446s() throws RemoteException {
        return false;
    }

    /* renamed from: t */
    public final aqe mo12447t() {
        return null;
    }

    /* renamed from: u_ */
    public final String mo12509u_() throws RemoteException {
        return null;
    }
}
