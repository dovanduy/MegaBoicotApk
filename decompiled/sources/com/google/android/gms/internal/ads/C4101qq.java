package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.GradientDrawable;
import android.os.Build.VERSION;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.TextView;
import com.google.android.gms.ads.internal.C3025aw;
import com.google.android.gms.ads.internal.C3049bt;
import com.google.android.gms.ads.internal.gmsg.C3067ae;
import com.google.android.gms.ads.internal.overlay.C3107c;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.ads.p136b.C2969a.C2970a;
import com.google.android.gms.common.util.C3564p;
import java.util.Map;
import org.json.JSONObject;

@C3718cm
/* renamed from: com.google.android.gms.internal.ads.qq */
public final class C4101qq extends FrameLayout implements C4089qe {

    /* renamed from: a */
    private final C4089qe f13871a;

    /* renamed from: b */
    private final C4051ou f13872b;

    public C4101qq(C4089qe qeVar) {
        super(qeVar.getContext());
        this.f13871a = qeVar;
        this.f13872b = new C4051ou(qeVar.mo15908q(), this, this);
        addView(this.f13871a.getView());
    }

    /* renamed from: A */
    public final boolean mo15864A() {
        return this.f13871a.mo15864A();
    }

    /* renamed from: B */
    public final void mo15865B() {
        this.f13872b.mo15771c();
        this.f13871a.mo15865B();
    }

    /* renamed from: C */
    public final boolean mo15866C() {
        return this.f13871a.mo15866C();
    }

    /* renamed from: D */
    public final boolean mo15867D() {
        return this.f13871a.mo15867D();
    }

    /* renamed from: E */
    public final boolean mo15868E() {
        return this.f13871a.mo15868E();
    }

    /* renamed from: F */
    public final void mo15869F() {
        this.f13871a.mo15869F();
    }

    /* renamed from: G */
    public final void mo15870G() {
        this.f13871a.mo15870G();
    }

    /* renamed from: H */
    public final ati mo15871H() {
        return this.f13871a.mo15871H();
    }

    /* renamed from: I */
    public final void mo15872I() {
        setBackgroundColor(0);
        this.f13871a.setBackgroundColor(0);
    }

    /* renamed from: J */
    public final void mo15873J() {
        TextView textView = new TextView(getContext());
        Resources h = C3025aw.m10921i().mo15445h();
        textView.setText(h != null ? h.getString(C2970a.f8688s7) : "Test Ad");
        textView.setTextSize(15.0f);
        textView.setTextColor(-1);
        textView.setPadding(5, 0, 5, 0);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(-12303292);
        gradientDrawable.setCornerRadius(8.0f);
        if (VERSION.SDK_INT >= 16) {
            textView.setBackground(gradientDrawable);
        } else {
            textView.setBackgroundDrawable(gradientDrawable);
        }
        addView(textView, new LayoutParams(-2, -2, 49));
        bringChildToFront(textView);
    }

    /* renamed from: a */
    public final C4051ou mo15796a() {
        return this.f13872b;
    }

    /* renamed from: a */
    public final void mo15874a(int i) {
        this.f13871a.mo15874a(i);
    }

    /* renamed from: a */
    public final void mo15875a(Context context) {
        this.f13871a.mo15875a(context);
    }

    /* renamed from: a */
    public final void mo15876a(C3107c cVar) {
        this.f13871a.mo15876a(cVar);
    }

    /* renamed from: a */
    public final void mo15968a(zzc zzc) {
        this.f13871a.mo15968a(zzc);
    }

    /* renamed from: a */
    public final void mo14431a(akj akj) {
        this.f13871a.mo14431a(akj);
    }

    /* renamed from: a */
    public final void mo15877a(ati ati) {
        this.f13871a.mo15877a(ati);
    }

    /* renamed from: a */
    public final void mo15797a(C4105qu quVar) {
        this.f13871a.mo15797a(quVar);
    }

    /* renamed from: a */
    public final void mo15878a(C4130rs rsVar) {
        this.f13871a.mo15878a(rsVar);
    }

    /* renamed from: a */
    public final void mo15879a(String str) {
        this.f13871a.mo15879a(str);
    }

    /* renamed from: a */
    public final void mo15880a(String str, C3067ae<? super C4089qe> aeVar) {
        this.f13871a.mo15880a(str, aeVar);
    }

    /* renamed from: a */
    public final void mo15881a(String str, C3564p<C3067ae<? super C4089qe>> pVar) {
        this.f13871a.mo15881a(str, pVar);
    }

    /* renamed from: a */
    public final void mo15882a(String str, String str2, String str3) {
        this.f13871a.mo15882a(str, str2, str3);
    }

    /* renamed from: a */
    public final void mo14986a(String str, Map<String, ?> map) {
        this.f13871a.mo14986a(str, map);
    }

    /* renamed from: a */
    public final void mo14987a(String str, JSONObject jSONObject) {
        this.f13871a.mo14987a(str, jSONObject);
    }

    /* renamed from: a */
    public final void mo15798a(boolean z) {
        this.f13871a.mo15798a(z);
    }

    /* renamed from: a */
    public final void mo15969a(boolean z, int i) {
        this.f13871a.mo15969a(z, i);
    }

    /* renamed from: a */
    public final void mo15970a(boolean z, int i, String str) {
        this.f13871a.mo15970a(z, i, str);
    }

    /* renamed from: a */
    public final void mo15971a(boolean z, int i, String str, String str2) {
        this.f13871a.mo15971a(z, i, str, str2);
    }

    /* renamed from: b */
    public final C4105qu mo15799b() {
        return this.f13871a.mo15799b();
    }

    /* renamed from: b */
    public final void mo15883b(C3107c cVar) {
        this.f13871a.mo15883b(cVar);
    }

    /* renamed from: b */
    public final void mo14993b(String str) {
        this.f13871a.mo14993b(str);
    }

    /* renamed from: b */
    public final void mo15884b(String str, C3067ae<? super C4089qe> aeVar) {
        this.f13871a.mo15884b(str, aeVar);
    }

    /* renamed from: b */
    public final void mo14994b(String str, JSONObject jSONObject) {
        this.f13871a.mo14994b(str, jSONObject);
    }

    /* renamed from: b */
    public final void mo15885b(boolean z) {
        this.f13871a.mo15885b(z);
    }

    /* renamed from: c */
    public final asf mo15800c() {
        return this.f13871a.mo15800c();
    }

    /* renamed from: c */
    public final void mo15886c(boolean z) {
        this.f13871a.mo15886c(z);
    }

    /* renamed from: d */
    public final Activity mo15801d() {
        return this.f13871a.mo15801d();
    }

    /* renamed from: d */
    public final void mo15887d(boolean z) {
        this.f13871a.mo15887d(z);
    }

    public final void destroy() {
        this.f13871a.destroy();
    }

    /* renamed from: e */
    public final C3049bt mo15802e() {
        return this.f13871a.mo15802e();
    }

    /* renamed from: e */
    public final void mo15889e(boolean z) {
        this.f13871a.mo15889e(z);
    }

    /* renamed from: f */
    public final void mo15803f() {
        this.f13871a.mo15803f();
    }

    /* renamed from: g */
    public final String mo15804g() {
        return this.f13871a.mo15804g();
    }

    public final OnClickListener getOnClickListener() {
        return this.f13871a.getOnClickListener();
    }

    public final int getRequestedOrientation() {
        return this.f13871a.getRequestedOrientation();
    }

    public final View getView() {
        return this;
    }

    public final WebView getWebView() {
        return this.f13871a.getWebView();
    }

    /* renamed from: j */
    public final asg mo15806j() {
        return this.f13871a.mo15806j();
    }

    /* renamed from: j_ */
    public final void mo12502j_() {
        this.f13871a.mo12502j_();
    }

    /* renamed from: k */
    public final zzang mo15807k() {
        return this.f13871a.mo15807k();
    }

    /* renamed from: k_ */
    public final void mo12503k_() {
        this.f13871a.mo12503k_();
    }

    /* renamed from: l */
    public final int mo15808l() {
        return getMeasuredHeight();
    }

    public final void loadData(String str, String str2, String str3) {
        this.f13871a.loadData(str, str2, str3);
    }

    public final void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        this.f13871a.loadDataWithBaseURL(str, str2, str3, str4, str5);
    }

    public final void loadUrl(String str) {
        this.f13871a.loadUrl(str);
    }

    /* renamed from: m */
    public final int mo15809m() {
        return getMeasuredWidth();
    }

    /* renamed from: n */
    public final void mo15903n() {
        this.f13871a.mo15903n();
    }

    /* renamed from: o */
    public final void mo15904o() {
        this.f13871a.mo15904o();
    }

    public final void onPause() {
        this.f13872b.mo15770b();
        this.f13871a.onPause();
    }

    public final void onResume() {
        this.f13871a.onResume();
    }

    /* renamed from: p */
    public final void mo15907p() {
        this.f13871a.mo15907p();
    }

    /* renamed from: q */
    public final Context mo15908q() {
        return this.f13871a.mo15908q();
    }

    /* renamed from: r */
    public final C3107c mo15909r() {
        return this.f13871a.mo15909r();
    }

    /* renamed from: s */
    public final C3107c mo15910s() {
        return this.f13871a.mo15910s();
    }

    public final void setOnClickListener(OnClickListener onClickListener) {
        this.f13871a.setOnClickListener(onClickListener);
    }

    public final void setOnTouchListener(OnTouchListener onTouchListener) {
        this.f13871a.setOnTouchListener(onTouchListener);
    }

    public final void setRequestedOrientation(int i) {
        this.f13871a.setRequestedOrientation(i);
    }

    public final void setWebChromeClient(WebChromeClient webChromeClient) {
        this.f13871a.setWebChromeClient(webChromeClient);
    }

    public final void setWebViewClient(WebViewClient webViewClient) {
        this.f13871a.setWebViewClient(webViewClient);
    }

    public final void stopLoading() {
        this.f13871a.stopLoading();
    }

    /* renamed from: t */
    public final C4130rs mo15917t() {
        return this.f13871a.mo15917t();
    }

    /* renamed from: u */
    public final String mo15918u() {
        return this.f13871a.mo15918u();
    }

    /* renamed from: v */
    public final C4124rm mo15919v() {
        return this.f13871a.mo15919v();
    }

    /* renamed from: w */
    public final WebViewClient mo15920w() {
        return this.f13871a.mo15920w();
    }

    /* renamed from: x */
    public final boolean mo15921x() {
        return this.f13871a.mo15921x();
    }

    /* renamed from: y */
    public final agw mo15922y() {
        return this.f13871a.mo15922y();
    }

    /* renamed from: z */
    public final boolean mo15923z() {
        return this.f13871a.mo15923z();
    }
}
