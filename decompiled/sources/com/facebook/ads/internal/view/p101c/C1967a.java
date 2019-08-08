package com.facebook.ads.internal.view.p101c;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Path.Direction;
import android.graphics.RectF;
import android.net.http.SslError;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.MotionEvent;
import android.webkit.ConsoleMessage;
import android.webkit.JavascriptInterface;
import android.webkit.SslErrorHandler;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.facebook.ads.internal.p085l.C1757a;
import com.facebook.ads.internal.p091r.C1795a;
import com.facebook.ads.internal.p115w.p117b.C2323k;
import com.facebook.ads.internal.p115w.p117b.C2341w;
import com.facebook.ads.internal.p115w.p117b.C2342x;
import com.facebook.ads.internal.p115w.p120e.C2354a;
import com.facebook.ads.internal.p115w.p120e.C2355b;
import com.facebook.ads.internal.p115w.p123h.C2370a;
import com.facebook.ads.internal.p115w.p123h.C2373b;
import com.facebook.ads.internal.p125x.C2376a;
import com.facebook.ads.internal.p125x.C2376a.C2377a;
import com.facebook.ads.internal.protocol.AdErrorType;
import com.facebook.ads.internal.protocol.C1783b;
import java.lang.ref.WeakReference;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.internal.view.c.a */
public class C1967a extends C2354a {

    /* renamed from: a */
    private static final String f6192a = "a";
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final WeakReference<C1970b> f6193b;

    /* renamed from: c */
    private final AtomicBoolean f6194c = new AtomicBoolean();

    /* renamed from: d */
    private final AtomicBoolean f6195d = new AtomicBoolean(true);

    /* renamed from: e */
    private final Path f6196e = new Path();

    /* renamed from: f */
    private final RectF f6197f = new RectF();

    /* renamed from: g */
    private final AtomicInteger f6198g = new AtomicInteger(5000);

    /* renamed from: h */
    private final AtomicReference<String> f6199h = new AtomicReference<>();

    /* renamed from: i */
    private WeakReference<C1972d> f6200i;

    /* renamed from: j */
    private C2376a f6201j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public C2341w f6202k = new C2341w();

    /* renamed from: l */
    private C2377a f6203l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public boolean f6204m = true;

    /* renamed from: n */
    private boolean f6205n;

    /* renamed from: o */
    private float f6206o;

    /* renamed from: com.facebook.ads.internal.view.c.a$a */
    static class C1969a {

        /* renamed from: a */
        private final String f6208a = C1969a.class.getSimpleName();

        /* renamed from: b */
        private final WeakReference<C1967a> f6209b;

        /* renamed from: c */
        private final WeakReference<C1970b> f6210c;

        /* renamed from: d */
        private final WeakReference<C2376a> f6211d;

        /* renamed from: e */
        private final WeakReference<AtomicBoolean> f6212e;

        /* renamed from: f */
        private final WeakReference<AtomicBoolean> f6213f;

        /* renamed from: g */
        private final boolean f6214g;

        C1969a(C1967a aVar, C1970b bVar, C2376a aVar2, AtomicBoolean atomicBoolean, AtomicBoolean atomicBoolean2, boolean z) {
            this.f6209b = new WeakReference<>(aVar);
            this.f6210c = new WeakReference<>(bVar);
            this.f6211d = new WeakReference<>(aVar2);
            this.f6212e = new WeakReference<>(atomicBoolean);
            this.f6213f = new WeakReference<>(atomicBoolean2);
            this.f6214g = z;
        }

        @JavascriptInterface
        public void alert(String str) {
            Log.e(this.f6208a, str);
        }

        @JavascriptInterface
        public String getAnalogInfo() {
            return C2323k.m9046a(C1757a.m7289a());
        }

        @JavascriptInterface
        public void onMainAssetLoaded() {
            if (!(this.f6209b.get() == null || this.f6212e.get() == null || this.f6213f.get() == null || !this.f6214g || !((AtomicBoolean) this.f6213f.get()).get())) {
                ((AtomicBoolean) this.f6212e.get()).set(true);
                if (((C1967a) this.f6209b.get()).isShown()) {
                    new Handler(Looper.getMainLooper()).post(new C1973e(this.f6211d));
                }
            }
        }

        @JavascriptInterface
        public void onPageInitialized() {
            C1967a aVar = (C1967a) this.f6209b.get();
            if (aVar != null && !aVar.mo8759c()) {
                C1970b bVar = (C1970b) this.f6210c.get();
                if (bVar != null) {
                    bVar.mo7248a();
                }
                if (!this.f6214g && ((C1967a) this.f6209b.get()).isShown()) {
                    new Handler(Looper.getMainLooper()).post(new C1973e(this.f6211d));
                }
            }
        }
    }

    /* renamed from: com.facebook.ads.internal.view.c.a$b */
    public interface C1970b {
        /* renamed from: a */
        void mo7248a();

        /* renamed from: a */
        void mo8085a(int i);

        /* renamed from: a */
        void mo8086a(int i, String str);

        /* renamed from: a */
        void mo7249a(String str, Map<String, String> map);

        /* renamed from: b */
        void mo7250b();
    }

    /* renamed from: com.facebook.ads.internal.view.c.a$c */
    public static class C1971c implements C1970b {
        /* renamed from: a */
        public void mo7248a() {
        }

        /* renamed from: a */
        public void mo8085a(int i) {
        }

        /* renamed from: a */
        public void mo8086a(int i, String str) {
        }

        /* renamed from: a */
        public void mo7249a(String str, Map<String, String> map) {
        }

        /* renamed from: b */
        public void mo7250b() {
        }
    }

    /* renamed from: com.facebook.ads.internal.view.c.a$d */
    public interface C1972d {
        /* renamed from: b */
        void mo8087b();
    }

    /* renamed from: com.facebook.ads.internal.view.c.a$e */
    static class C1973e implements Runnable {

        /* renamed from: a */
        private final WeakReference<C2376a> f6215a;

        C1973e(C2376a aVar) {
            this.f6215a = new WeakReference<>(aVar);
        }

        C1973e(WeakReference<C2376a> weakReference) {
            this.f6215a = weakReference;
        }

        public void run() {
            C2376a aVar = (C2376a) this.f6215a.get();
            if (aVar != null) {
                aVar.mo8777a();
            }
        }
    }

    /* renamed from: com.facebook.ads.internal.view.c.a$f */
    static class C1974f extends WebChromeClient {
        C1974f() {
        }

        public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
            return true;
        }

        public void onProgressChanged(WebView webView, int i) {
        }
    }

    /* renamed from: com.facebook.ads.internal.view.c.a$g */
    static class C1975g extends WebViewClient {

        /* renamed from: a */
        private final Context f6216a;

        /* renamed from: b */
        private final WeakReference<C1970b> f6217b;

        /* renamed from: c */
        private final WeakReference<C2376a> f6218c;

        /* renamed from: d */
        private final WeakReference<C2341w> f6219d;

        /* renamed from: e */
        private final WeakReference<AtomicBoolean> f6220e;

        /* renamed from: f */
        private final WeakReference<C1967a> f6221f;

        /* renamed from: g */
        private final AtomicInteger f6222g;

        /* renamed from: h */
        private final AtomicReference<String> f6223h;
        /* access modifiers changed from: private */

        /* renamed from: i */
        public boolean f6224i = false;

        /* renamed from: j */
        private Date f6225j;

        C1975g(Context context, WeakReference<C1970b> weakReference, WeakReference<C2376a> weakReference2, WeakReference<C2341w> weakReference3, WeakReference<AtomicBoolean> weakReference4, WeakReference<C1967a> weakReference5, AtomicInteger atomicInteger, AtomicReference<String> atomicReference) {
            this.f6216a = context.getApplicationContext();
            this.f6217b = weakReference;
            this.f6218c = weakReference2;
            this.f6219d = weakReference3;
            this.f6220e = weakReference4;
            this.f6221f = weakReference5;
            this.f6222g = atomicInteger;
            this.f6223h = atomicReference;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void m8129a(int i, String str) {
            if (!"net::ERR_EMPTY_RESPONSE".equals(str)) {
                long time = new Date().getTime() - this.f6225j.getTime();
                JSONObject jSONObject = new JSONObject();
                boolean z = str != null;
                try {
                    jSONObject.put("error_code", i);
                    jSONObject.put("error_description", str);
                    jSONObject.put("is_web_resource_error", z);
                    jSONObject.put("loading_time_in_millis", time);
                    jSONObject.put("request_id", this.f6223h.get());
                } catch (JSONException unused) {
                }
                C2370a.m9149b(this.f6216a, "web_view", C2373b.f7470E, new C1783b(AdErrorType.WEB_VIEW_FAILED_TO_LOAD, jSONObject.toString()));
                if (this.f6217b.get() != null) {
                    ((C1970b) this.f6217b.get()).mo8086a(i, str);
                }
            }
        }

        public void onPageFinished(WebView webView, String str) {
            if (!(this.f6221f.get() == null || this.f6220e.get() == null || ((AtomicBoolean) this.f6220e.get()).get())) {
                C1967a.m8113d((C1967a) this.f6221f.get());
            }
            this.f6224i = true;
        }

        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            super.onPageStarted(webView, str, bitmap);
            this.f6225j = new Date();
            new Handler().postDelayed(new Runnable() {
                public void run() {
                    if (!C1975g.this.f6224i) {
                        C1975g.this.m8129a(-1, null);
                    }
                }
            }, (long) this.f6222g.get());
        }

        public void onReceivedError(WebView webView, int i, String str, String str2) {
            this.f6224i = true;
            m8129a(i, str);
        }

        public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            this.f6224i = true;
            if (VERSION.SDK_INT >= 23) {
                m8129a(webResourceError.getErrorCode(), webResourceError.getDescription().toString());
            }
        }

        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            sslErrorHandler.cancel();
        }

        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            HashMap hashMap = new HashMap();
            if (this.f6218c.get() != null) {
                ((C2376a) this.f6218c.get()).mo8779a((Map<String, String>) hashMap);
            }
            if (this.f6219d.get() != null) {
                hashMap.put("touch", C2323k.m9046a(((C2341w) this.f6219d.get()).mo8743e()));
            }
            if (this.f6217b.get() != null) {
                ((C1970b) this.f6217b.get()).mo7249a(str, (Map<String, String>) hashMap);
            }
            return true;
        }
    }

    public C1967a(Context context, WeakReference<C1970b> weakReference, int i) {
        super(context);
        this.f6205n = C1795a.m7420N(context);
        this.f6193b = weakReference;
        this.f6203l = new C2377a() {
            /* renamed from: a */
            public void mo7108a() {
                if (C1967a.this.f6204m || !C1967a.this.f6202k.mo8740b()) {
                    C1967a.this.f6202k.mo8737a();
                }
                if (C1967a.this.f6193b.get() != null) {
                    ((C1970b) C1967a.this.f6193b.get()).mo7250b();
                }
            }
        };
        this.f6201j = new C2376a(this, i, this.f6203l);
        setWebChromeClient(mo8041a());
        setWebViewClient(mo8044b());
        getSettings().setSupportZoom(false);
        getSettings().setCacheMode(1);
        C1969a aVar = new C1969a(this, (C1970b) weakReference.get(), this.f6201j, this.f6194c, this.f6195d, this.f6205n);
        addJavascriptInterface(aVar, "AdControl");
    }

    /* renamed from: d */
    static /* synthetic */ void m8113d(C1967a aVar) {
        aVar.f6194c.set(true);
        new Handler(Looper.getMainLooper()).post(new C1973e(aVar.f6201j));
        if (aVar.f6200i != null && aVar.f6200i.get() != null) {
            ((C1972d) aVar.f6200i.get()).mo8087b();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public WebChromeClient mo8041a() {
        return new C1974f();
    }

    /* renamed from: a */
    public void mo8067a(int i, int i2) {
        if (this.f6201j != null) {
            this.f6201j.mo8778a(i);
            this.f6201j.mo8780b(i2);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public WebViewClient mo8044b() {
        C1975g gVar = new C1975g(getContext(), this.f6193b, new WeakReference(this.f6201j), new WeakReference(this.f6202k), new WeakReference(this.f6195d), new WeakReference(this), this.f6198g, this.f6199h);
        return gVar;
    }

    public void destroy() {
        if (this.f6201j != null) {
            this.f6201j.mo8782c();
            this.f6201j = null;
        }
        C2342x.m9091b(this);
        this.f6203l = null;
        this.f6202k = null;
        C2355b.m9114a(this);
        super.destroy();
    }

    public Map<String, String> getTouchData() {
        return this.f6202k.mo8743e();
    }

    public C2341w getTouchDataRecorder() {
        return this.f6202k;
    }

    public C2376a getViewabilityChecker() {
        return this.f6201j;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        if (this.f6206o > 0.0f) {
            this.f6197f.set(0.0f, 0.0f, (float) getWidth(), (float) getHeight());
            this.f6196e.reset();
            this.f6196e.addRoundRect(this.f6197f, this.f6206o, this.f6206o, Direction.CW);
            canvas.clipPath(this.f6196e);
        }
        super.onDraw(canvas);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.f6202k.mo8738a(motionEvent, this, this);
        return super.onTouchEvent(motionEvent);
    }

    /* access modifiers changed from: protected */
    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        if (this.f6193b.get() != null) {
            ((C1970b) this.f6193b.get()).mo8085a(i);
        }
        if (this.f6201j != null) {
            if (i == 0) {
                if (!this.f6205n || this.f6194c.get()) {
                    this.f6201j.mo8777a();
                    return;
                }
            }
            if (i == 8) {
                this.f6201j.mo8782c();
            }
        }
    }

    public void setCheckAssetsByJavascriptBridge(boolean z) {
        this.f6195d.set(z);
    }

    public void setCornerRadius(float f) {
        this.f6206o = f;
        invalidate();
    }

    public void setLogMultipleImpressions(boolean z) {
        this.f6204m = z;
    }

    public void setOnAssetsLoadedListener(C1972d dVar) {
        this.f6200i = new WeakReference<>(dVar);
    }

    public void setRequestId(String str) {
        this.f6199h.set(str);
    }

    public void setWaitForAssetsToLoad(boolean z) {
        this.f6205n = z;
    }

    public void setWebViewTimeoutInMillis(int i) {
        if (i >= 0) {
            this.f6198g.set(i);
        }
    }
}
