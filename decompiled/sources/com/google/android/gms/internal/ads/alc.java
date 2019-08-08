package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.app.KeyguardManager;
import android.content.Context;
import android.graphics.Rect;
import android.os.PowerManager;
import android.os.Process;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.gms.ads.internal.C3025aw;
import com.google.android.gms.common.util.C3563o;
import java.util.Iterator;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONException;
import org.json.JSONObject;

@TargetApi(14)
@ParametersAreNonnullByDefault
@C3718cm
public final class alc extends Thread {

    /* renamed from: a */
    private boolean f11330a = false;

    /* renamed from: b */
    private boolean f11331b = false;

    /* renamed from: c */
    private boolean f11332c = false;

    /* renamed from: d */
    private final Object f11333d;

    /* renamed from: e */
    private final akx f11334e;

    /* renamed from: f */
    private final C3716ck f11335f;

    /* renamed from: g */
    private final int f11336g;

    /* renamed from: h */
    private final int f11337h;

    /* renamed from: i */
    private final int f11338i;

    /* renamed from: j */
    private final int f11339j;

    /* renamed from: k */
    private final int f11340k;

    /* renamed from: l */
    private final int f11341l;

    /* renamed from: m */
    private final int f11342m;

    /* renamed from: n */
    private final int f11343n;

    /* renamed from: o */
    private final String f11344o;

    /* renamed from: p */
    private final boolean f11345p;

    public alc(akx akx, C3716ck ckVar) {
        this.f11334e = akx;
        this.f11335f = ckVar;
        this.f11333d = new Object();
        this.f11337h = ((Integer) aoq.m14620f().mo14695a(aru.f11766R)).intValue();
        this.f11338i = ((Integer) aoq.m14620f().mo14695a(aru.f11767S)).intValue();
        this.f11339j = ((Integer) aoq.m14620f().mo14695a(aru.f11768T)).intValue();
        this.f11340k = ((Integer) aoq.m14620f().mo14695a(aru.f11769U)).intValue();
        this.f11341l = ((Integer) aoq.m14620f().mo14695a(aru.f11772X)).intValue();
        this.f11342m = ((Integer) aoq.m14620f().mo14695a(aru.f11774Z)).intValue();
        this.f11343n = ((Integer) aoq.m14620f().mo14695a(aru.f11802aa)).intValue();
        this.f11336g = ((Integer) aoq.m14620f().mo14695a(aru.f11770V)).intValue();
        this.f11344o = (String) aoq.m14620f().mo14695a(aru.f11804ac);
        this.f11345p = ((Boolean) aoq.m14620f().mo14695a(aru.f11806ae)).booleanValue();
        setName("ContentFetchTask");
    }

    /* renamed from: a */
    private final alg m14373a(View view, akw akw) {
        boolean z;
        if (view == null) {
            return new alg(this, 0, 0);
        }
        boolean globalVisibleRect = view.getGlobalVisibleRect(new Rect());
        if ((view instanceof TextView) && !(view instanceof EditText)) {
            CharSequence text = ((TextView) view).getText();
            if (TextUtils.isEmpty(text)) {
                return new alg(this, 0, 0);
            }
            akw.mo14444b(text.toString(), globalVisibleRect, view.getX(), view.getY(), (float) view.getWidth(), (float) view.getHeight());
            return new alg(this, 1, 0);
        } else if ((view instanceof WebView) && !(view instanceof C4089qe)) {
            akw.mo14450g();
            WebView webView = (WebView) view;
            if (!C3563o.m12768g()) {
                z = false;
            } else {
                akw.mo14450g();
                webView.post(new ale(this, akw, webView, globalVisibleRect));
                z = true;
            }
            return z ? new alg(this, 0, 1) : new alg(this, 0, 0);
        } else if (!(view instanceof ViewGroup)) {
            return new alg(this, 0, 0);
        } else {
            ViewGroup viewGroup = (ViewGroup) view;
            int i = 0;
            int i2 = 0;
            for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                alg a = m14373a(viewGroup.getChildAt(i3), akw);
                i += a.f11354a;
                i2 += a.f11355b;
            }
            return new alg(this, i, i2);
        }
    }

    /* renamed from: e */
    private static boolean m14374e() {
        boolean z = false;
        try {
            Context b = C3025aw.m10920h().mo14463b();
            if (b == null) {
                return false;
            }
            ActivityManager activityManager = (ActivityManager) b.getSystemService("activity");
            KeyguardManager keyguardManager = (KeyguardManager) b.getSystemService("keyguard");
            if (activityManager != null) {
                if (keyguardManager != null) {
                    List runningAppProcesses = activityManager.getRunningAppProcesses();
                    if (runningAppProcesses != null) {
                        Iterator it = runningAppProcesses.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            RunningAppProcessInfo runningAppProcessInfo = (RunningAppProcessInfo) it.next();
                            if (Process.myPid() == runningAppProcessInfo.pid) {
                                if (runningAppProcessInfo.importance == 100 && !keyguardManager.inKeyguardRestrictedInputMode()) {
                                    PowerManager powerManager = (PowerManager) b.getSystemService("power");
                                    if (powerManager == null ? false : powerManager.isScreenOn()) {
                                        z = true;
                                    }
                                }
                            }
                        }
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
            }
            return z;
        } catch (Throwable th) {
            C3025aw.m10921i().mo15436a(th, "ContentFetchTask.isInForeground");
            return false;
        }
    }

    /* renamed from: f */
    private final void m14375f() {
        synchronized (this.f11333d) {
            this.f11331b = true;
            boolean z = this.f11331b;
            StringBuilder sb = new StringBuilder(42);
            sb.append("ContentFetchThread: paused, mPause = ");
            sb.append(z);
            C3900je.m17429b(sb.toString());
        }
    }

    /* renamed from: a */
    public final void mo14478a() {
        synchronized (this.f11333d) {
            if (this.f11330a) {
                C3900je.m17429b("Content hash thread already started, quiting...");
                return;
            }
            this.f11330a = true;
            start();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo14479a(View view) {
        try {
            akw akw = new akw(this.f11337h, this.f11338i, this.f11339j, this.f11340k, this.f11341l, this.f11342m, this.f11343n);
            Context b = C3025aw.m10920h().mo14463b();
            if (b != null && !TextUtils.isEmpty(this.f11344o)) {
                String str = (String) view.getTag(b.getResources().getIdentifier((String) aoq.m14620f().mo14695a(aru.f11803ab), TtmlNode.ATTR_ID, b.getPackageName()));
                if (str != null && str.equals(this.f11344o)) {
                    return;
                }
            }
            alg a = m14373a(view, akw);
            akw.mo14451h();
            if (a.f11354a != 0 || a.f11355b != 0) {
                if (a.f11355b != 0 || akw.mo14454j() != 0) {
                    if (a.f11355b != 0 || !this.f11334e.mo14457a(akw)) {
                        this.f11334e.mo14459c(akw);
                    }
                }
            }
        } catch (Exception e) {
            C3900je.m17430b("Exception in fetchContentOnUIThread", e);
            this.f11335f.mo15221a(e, "ContentFetchTask.fetchContent");
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo14480a(akw akw, WebView webView, String str, boolean z) {
        akw.mo14449f();
        try {
            if (!TextUtils.isEmpty(str)) {
                String optString = new JSONObject(str).optString(MimeTypes.BASE_TYPE_TEXT);
                if (this.f11345p || TextUtils.isEmpty(webView.getTitle())) {
                    akw.mo14441a(optString, z, webView.getX(), webView.getY(), (float) webView.getWidth(), (float) webView.getHeight());
                } else {
                    String title = webView.getTitle();
                    StringBuilder sb = new StringBuilder(1 + String.valueOf(title).length() + String.valueOf(optString).length());
                    sb.append(title);
                    sb.append("\n");
                    sb.append(optString);
                    akw.mo14441a(sb.toString(), z, webView.getX(), webView.getY(), (float) webView.getWidth(), (float) webView.getHeight());
                }
            }
            if (akw.mo14442a()) {
                this.f11334e.mo14458b(akw);
            }
        } catch (JSONException unused) {
            C3900je.m17429b("Json string may be malformed.");
        } catch (Throwable th) {
            C3900je.m17427a("Failed to get webview content.", th);
            this.f11335f.mo15221a(th, "ContentFetchTask.processWebViewContent");
        }
    }

    /* renamed from: b */
    public final akw mo14481b() {
        return this.f11334e.mo14456a();
    }

    /* renamed from: c */
    public final void mo14482c() {
        synchronized (this.f11333d) {
            this.f11331b = false;
            this.f11333d.notifyAll();
            C3900je.m17429b("ContentFetchThread: wakeup");
        }
    }

    /* renamed from: d */
    public final boolean mo14483d() {
        return this.f11331b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0068, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0069, code lost:
        com.google.android.gms.internal.ads.C3900je.m17430b("Error in ContentFetchTask", r0);
        r4.f11335f.mo15221a(r0, "ContentFetchTask.run");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0076, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0077, code lost:
        com.google.android.gms.internal.ads.C3900je.m17430b("Error in ContentFetchTask", r0);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:30:0x007f */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0076 A[ExcHandler: InterruptedException (r0v1 'e' java.lang.InterruptedException A[CUSTOM_DECLARE]), Splitter:B:0:0x0000] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x007f A[LOOP:1: B:30:0x007f->B:42:0x007f, LOOP_START, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r4 = this;
        L_0x0000:
            boolean r0 = m14374e()     // Catch:{ InterruptedException -> 0x0076, Exception -> 0x0068 }
            if (r0 == 0) goto L_0x0059
            com.google.android.gms.internal.ads.aky r0 = com.google.android.gms.ads.internal.C3025aw.m10920h()     // Catch:{ InterruptedException -> 0x0076, Exception -> 0x0068 }
            android.app.Activity r0 = r0.mo14460a()     // Catch:{ InterruptedException -> 0x0076, Exception -> 0x0068 }
            if (r0 != 0) goto L_0x0019
            java.lang.String r0 = "ContentFetchThread: no activity. Sleeping."
            com.google.android.gms.internal.ads.C3900je.m17429b(r0)     // Catch:{ InterruptedException -> 0x0076, Exception -> 0x0068 }
        L_0x0015:
            r4.m14375f()     // Catch:{ InterruptedException -> 0x0076, Exception -> 0x0068 }
            goto L_0x005f
        L_0x0019:
            if (r0 == 0) goto L_0x005f
            r1 = 0
            android.view.Window r2 = r0.getWindow()     // Catch:{ Exception -> 0x003d, InterruptedException -> 0x0076 }
            if (r2 == 0) goto L_0x004c
            android.view.Window r2 = r0.getWindow()     // Catch:{ Exception -> 0x003d, InterruptedException -> 0x0076 }
            android.view.View r2 = r2.getDecorView()     // Catch:{ Exception -> 0x003d, InterruptedException -> 0x0076 }
            if (r2 == 0) goto L_0x004c
            android.view.Window r0 = r0.getWindow()     // Catch:{ Exception -> 0x003d, InterruptedException -> 0x0076 }
            android.view.View r0 = r0.getDecorView()     // Catch:{ Exception -> 0x003d, InterruptedException -> 0x0076 }
            r2 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r0 = r0.findViewById(r2)     // Catch:{ Exception -> 0x003d, InterruptedException -> 0x0076 }
            r1 = r0
            goto L_0x004c
        L_0x003d:
            r0 = move-exception
            com.google.android.gms.internal.ads.io r2 = com.google.android.gms.ads.internal.C3025aw.m10921i()     // Catch:{ InterruptedException -> 0x0076, Exception -> 0x0068 }
            java.lang.String r3 = "ContentFetchTask.extractContent"
            r2.mo15436a(r0, r3)     // Catch:{ InterruptedException -> 0x0076, Exception -> 0x0068 }
            java.lang.String r0 = "Failed getting root view of activity. Content not extracted."
            com.google.android.gms.internal.ads.C3900je.m17429b(r0)     // Catch:{ InterruptedException -> 0x0076, Exception -> 0x0068 }
        L_0x004c:
            if (r1 == 0) goto L_0x005f
            if (r1 == 0) goto L_0x005f
            com.google.android.gms.internal.ads.ald r0 = new com.google.android.gms.internal.ads.ald     // Catch:{ InterruptedException -> 0x0076, Exception -> 0x0068 }
            r0.<init>(r4, r1)     // Catch:{ InterruptedException -> 0x0076, Exception -> 0x0068 }
            r1.post(r0)     // Catch:{ InterruptedException -> 0x0076, Exception -> 0x0068 }
            goto L_0x005f
        L_0x0059:
            java.lang.String r0 = "ContentFetchTask: sleeping"
            com.google.android.gms.internal.ads.C3900je.m17429b(r0)     // Catch:{ InterruptedException -> 0x0076, Exception -> 0x0068 }
            goto L_0x0015
        L_0x005f:
            int r0 = r4.f11336g     // Catch:{ InterruptedException -> 0x0076, Exception -> 0x0068 }
            int r0 = r0 * 1000
            long r0 = (long) r0     // Catch:{ InterruptedException -> 0x0076, Exception -> 0x0068 }
            java.lang.Thread.sleep(r0)     // Catch:{ InterruptedException -> 0x0076, Exception -> 0x0068 }
            goto L_0x007c
        L_0x0068:
            r0 = move-exception
            java.lang.String r1 = "Error in ContentFetchTask"
            com.google.android.gms.internal.ads.C3900je.m17430b(r1, r0)
            com.google.android.gms.internal.ads.ck r1 = r4.f11335f
            java.lang.String r2 = "ContentFetchTask.run"
            r1.mo15221a(r0, r2)
            goto L_0x007c
        L_0x0076:
            r0 = move-exception
            java.lang.String r1 = "Error in ContentFetchTask"
            com.google.android.gms.internal.ads.C3900je.m17430b(r1, r0)
        L_0x007c:
            java.lang.Object r0 = r4.f11333d
            monitor-enter(r0)
        L_0x007f:
            boolean r1 = r4.f11331b     // Catch:{ all -> 0x0091 }
            if (r1 == 0) goto L_0x008e
            java.lang.String r1 = "ContentFetchTask: waiting"
            com.google.android.gms.internal.ads.C3900je.m17429b(r1)     // Catch:{ InterruptedException -> 0x007f }
            java.lang.Object r1 = r4.f11333d     // Catch:{ InterruptedException -> 0x007f }
            r1.wait()     // Catch:{ InterruptedException -> 0x007f }
            goto L_0x007f
        L_0x008e:
            monitor-exit(r0)     // Catch:{ all -> 0x0091 }
            goto L_0x0000
        L_0x0091:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0091 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.alc.run():void");
    }
}
