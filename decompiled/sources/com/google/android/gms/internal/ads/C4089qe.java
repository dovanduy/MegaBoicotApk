package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.C3018ap;
import com.google.android.gms.ads.internal.C3049bt;
import com.google.android.gms.ads.internal.gmsg.C3067ae;
import com.google.android.gms.ads.internal.overlay.C3107c;
import com.google.android.gms.common.util.C3564p;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
@C3718cm
/* renamed from: com.google.android.gms.internal.ads.qe */
public interface C4089qe extends C3018ap, akk, ayo, azp, C4061pd, C4112ra, C4113rb, C4117rf, C4120ri, C4122rk, C4123rl {
    /* renamed from: A */
    boolean mo15864A();

    /* renamed from: B */
    void mo15865B();

    /* renamed from: C */
    boolean mo15866C();

    /* renamed from: D */
    boolean mo15867D();

    /* renamed from: E */
    boolean mo15868E();

    /* renamed from: F */
    void mo15869F();

    /* renamed from: G */
    void mo15870G();

    /* renamed from: H */
    ati mo15871H();

    /* renamed from: I */
    void mo15872I();

    /* renamed from: J */
    void mo15873J();

    /* renamed from: a */
    void mo15874a(int i);

    /* renamed from: a */
    void mo15875a(Context context);

    /* renamed from: a */
    void mo15876a(C3107c cVar);

    /* renamed from: a */
    void mo15877a(ati ati);

    /* renamed from: a */
    void mo15797a(C4105qu quVar);

    /* renamed from: a */
    void mo15878a(C4130rs rsVar);

    /* renamed from: a */
    void mo15879a(String str);

    /* renamed from: a */
    void mo15880a(String str, C3067ae<? super C4089qe> aeVar);

    /* renamed from: a */
    void mo15881a(String str, C3564p<C3067ae<? super C4089qe>> pVar);

    /* renamed from: a */
    void mo15882a(String str, String str2, String str3);

    /* renamed from: b */
    C4105qu mo15799b();

    /* renamed from: b */
    void mo15883b(C3107c cVar);

    /* renamed from: b */
    void mo15884b(String str, C3067ae<? super C4089qe> aeVar);

    /* renamed from: b */
    void mo15885b(boolean z);

    /* renamed from: c */
    void mo15886c(boolean z);

    /* renamed from: d */
    Activity mo15801d();

    /* renamed from: d */
    void mo15887d(boolean z);

    void destroy();

    /* renamed from: e */
    C3049bt mo15802e();

    /* renamed from: e */
    void mo15889e(boolean z);

    Context getContext();

    int getHeight();

    LayoutParams getLayoutParams();

    void getLocationOnScreen(int[] iArr);

    OnClickListener getOnClickListener();

    ViewParent getParent();

    int getRequestedOrientation();

    View getView();

    WebView getWebView();

    int getWidth();

    /* renamed from: j */
    asg mo15806j();

    /* renamed from: k */
    zzang mo15807k();

    void loadData(String str, String str2, String str3);

    void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5);

    void loadUrl(String str);

    void measure(int i, int i2);

    /* renamed from: n */
    void mo15903n();

    /* renamed from: o */
    void mo15904o();

    void onPause();

    void onResume();

    /* renamed from: p */
    void mo15907p();

    /* renamed from: q */
    Context mo15908q();

    /* renamed from: r */
    C3107c mo15909r();

    /* renamed from: s */
    C3107c mo15910s();

    void setBackgroundColor(int i);

    void setOnClickListener(OnClickListener onClickListener);

    void setOnTouchListener(OnTouchListener onTouchListener);

    void setRequestedOrientation(int i);

    void setWebChromeClient(WebChromeClient webChromeClient);

    void setWebViewClient(WebViewClient webViewClient);

    void stopLoading();

    /* renamed from: t */
    C4130rs mo15917t();

    /* renamed from: u */
    String mo15918u();

    /* renamed from: v */
    C4124rm mo15919v();

    /* renamed from: w */
    WebViewClient mo15920w();

    /* renamed from: x */
    boolean mo15921x();

    /* renamed from: y */
    agw mo15922y();

    /* renamed from: z */
    boolean mo15923z();
}
