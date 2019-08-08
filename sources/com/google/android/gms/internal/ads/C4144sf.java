package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.graphics.Canvas;
import android.view.MotionEvent;
import com.google.android.gms.ads.internal.C3025aw;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.GuardedBy;

@ParametersAreNonnullByDefault
@C3718cm
/* renamed from: com.google.android.gms.internal.ads.sf */
public class C4144sf extends C4141sc {
    @GuardedBy("this")

    /* renamed from: b */
    private boolean f14050b;
    @GuardedBy("this")

    /* renamed from: c */
    private boolean f14051c;

    public C4144sf(C4129rr rrVar) {
        super(rrVar);
        C3025aw.m10921i().mo15446i();
    }

    /* renamed from: a */
    private final synchronized void mo15796a() {
        if (!this.f14051c) {
            this.f14051c = true;
            C3025aw.m10921i().mo15447j();
        }
    }

    /* renamed from: A */
    public final synchronized boolean mo16043A() {
        return this.f14050b;
    }

    /* renamed from: B */
    public final synchronized void mo16044B() {
        C3900je.m17043a("Destroying WebView!");
        mo15796a();
        C4014nk.f13617a.execute(new C4145sg(this));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: L */
    public final /* synthetic */ void mo16045L() {
        super.destroy();
    }

    /* renamed from: a */
    public final synchronized void mo15005a(C4143se seVar) {
        if (mo16043A()) {
            C3900je.m17043a("Blank page loaded, 1...");
            mo16044B();
            return;
        }
        super.mo15005a(seVar);
    }

    public synchronized void destroy() {
        if (!this.f14050b) {
            this.f14050b = true;
            mo16017f(false);
            C3900je.m17043a("Initiating WebView self destruct sequence in 3...");
            C3900je.m17043a("Loading blank page in WebView, 2...");
            try {
                super.loadUrl("about:blank");
            } catch (UnsatisfiedLinkError e) {
                C3025aw.m10921i().mo15436a((Throwable) e, "AdWebViewImpl.loadUrlUnsafe");
                C3900je.m17434d("#007 Could not call remote method.", e);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0013, code lost:
        return;
     */
    @android.annotation.TargetApi(19)
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void evaluateJavascript(java.lang.String r2, android.webkit.ValueCallback<java.lang.String> r3) {
        /*
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.mo16043A()     // Catch:{ all -> 0x0019 }
            if (r0 == 0) goto L_0x0014
            java.lang.String r2 = "#004 The webview is destroyed. Ignoring action."
            com.google.android.gms.internal.ads.C3900je.m17435e(r2)     // Catch:{ all -> 0x0019 }
            if (r3 == 0) goto L_0x0012
            r2 = 0
            r3.onReceiveValue(r2)     // Catch:{ all -> 0x0019 }
        L_0x0012:
            monitor-exit(r1)
            return
        L_0x0014:
            super.evaluateJavascript(r2, r3)     // Catch:{ all -> 0x0019 }
            monitor-exit(r1)
            return
        L_0x0019:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C4144sf.evaluateJavascript(java.lang.String, android.webkit.ValueCallback):void");
    }

    /* access modifiers changed from: protected */
    @GuardedBy("this")
    /* renamed from: f */
    public void mo16017f(boolean z) {
    }

    /* access modifiers changed from: protected */
    public void finalize() throws Throwable {
        try {
            synchronized (this) {
                if (!mo16043A()) {
                    mo16017f(true);
                }
                mo15796a();
            }
            super.finalize();
        } catch (Throwable th) {
            super.finalize();
            throw th;
        }
    }

    public synchronized void loadData(String str, String str2, String str3) {
        if (!mo16043A()) {
            super.loadData(str, str2, str3);
        } else {
            C3900je.m17435e("#004 The webview is destroyed. Ignoring action.");
        }
    }

    public synchronized void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        if (!mo16043A()) {
            super.loadDataWithBaseURL(str, str2, str3, str4, str5);
        } else {
            C3900je.m17435e("#004 The webview is destroyed. Ignoring action.");
        }
    }

    public synchronized void loadUrl(String str) {
        if (!mo16043A()) {
            super.loadUrl(str);
        } else {
            C3900je.m17435e("#004 The webview is destroyed. Ignoring action.");
        }
    }

    /* access modifiers changed from: protected */
    @TargetApi(21)
    public void onDraw(Canvas canvas) {
        if (!mo16043A()) {
            super.onDraw(canvas);
        }
    }

    public void onPause() {
        if (!mo16043A()) {
            super.onPause();
        }
    }

    public void onResume() {
        if (!mo16043A()) {
            super.onResume();
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        return !mo16043A() && super.onTouchEvent(motionEvent);
    }

    public void stopLoading() {
        if (!mo16043A()) {
            super.stopLoading();
        }
    }
}
