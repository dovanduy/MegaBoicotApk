package com.facebook.internal;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.AsyncTask;
import android.os.AsyncTask.Status;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.WindowManager.LayoutParams;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.facebook.AccessToken;
import com.facebook.C2474i;
import com.facebook.C2579j;
import com.facebook.C2580k;
import com.facebook.C2581l;
import com.facebook.C2649m;
import com.facebook.C2661r;
import com.facebook.FacebookRequestError;
import com.facebook.GraphRequest.C1503b;
import com.facebook.common.C2454a.C2457c;
import com.facebook.common.C2454a.C2460f;
import com.facebook.common.C2454a.C2461g;
import com.facebook.share.internal.C2710h;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CountDownLatch;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.facebook.internal.af */
/* compiled from: WebDialog */
public class C2485af extends Dialog {

    /* renamed from: a */
    private static final int f7819a = C2461g.com_facebook_activity_theme;

    /* renamed from: m */
    private static volatile int f7820m;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public String f7821b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public String f7822c;

    /* renamed from: d */
    private C2492c f7823d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public WebView f7824e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public ProgressDialog f7825f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public ImageView f7826g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public FrameLayout f7827h;

    /* renamed from: i */
    private C2493d f7828i;

    /* renamed from: j */
    private boolean f7829j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public boolean f7830k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public boolean f7831l;

    /* renamed from: n */
    private LayoutParams f7832n;

    /* renamed from: com.facebook.internal.af$a */
    /* compiled from: WebDialog */
    public static class C2490a {

        /* renamed from: a */
        private Context f7837a;

        /* renamed from: b */
        private String f7838b;

        /* renamed from: c */
        private String f7839c;

        /* renamed from: d */
        private int f7840d;

        /* renamed from: e */
        private C2492c f7841e;

        /* renamed from: f */
        private Bundle f7842f;

        /* renamed from: g */
        private AccessToken f7843g;

        public C2490a(Context context, String str, Bundle bundle) {
            if (!AccessToken.m6168b()) {
                String a = C2479ad.m9426a(context);
                if (a != null) {
                    this.f7838b = a;
                } else {
                    throw new C2579j("Attempted to create a builder without a valid access token or a valid default Application ID.");
                }
            }
            m9523a(context, str, bundle);
        }

        public C2490a(Context context, String str, String str2, Bundle bundle) {
            if (str == null) {
                str = C2479ad.m9426a(context);
            }
            C2484ae.m9490a(str, "applicationId");
            this.f7838b = str;
            m9523a(context, str2, bundle);
        }

        /* renamed from: a */
        public C2490a mo8948a(C2492c cVar) {
            this.f7841e = cVar;
            return this;
        }

        /* renamed from: a */
        public C2485af mo8949a() {
            if (this.f7843g != null) {
                this.f7842f.putString("app_id", this.f7843g.mo6623j());
                this.f7842f.putString("access_token", this.f7843g.mo6614d());
            } else {
                this.f7842f.putString("app_id", this.f7838b);
            }
            return C2485af.m9500a(this.f7837a, this.f7839c, this.f7842f, this.f7840d, this.f7841e);
        }

        /* renamed from: b */
        public String mo8950b() {
            return this.f7838b;
        }

        /* renamed from: c */
        public Context mo8951c() {
            return this.f7837a;
        }

        /* renamed from: d */
        public int mo8952d() {
            return this.f7840d;
        }

        /* renamed from: e */
        public Bundle mo8953e() {
            return this.f7842f;
        }

        /* renamed from: f */
        public C2492c mo8954f() {
            return this.f7841e;
        }

        /* renamed from: a */
        private void m9523a(Context context, String str, Bundle bundle) {
            this.f7837a = context;
            this.f7839c = str;
            if (bundle != null) {
                this.f7842f = bundle;
            } else {
                this.f7842f = new Bundle();
            }
        }
    }

    /* renamed from: com.facebook.internal.af$b */
    /* compiled from: WebDialog */
    private class C2491b extends WebViewClient {
        private C2491b() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:30:0x0090  */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x0096  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean shouldOverrideUrlLoading(android.webkit.WebView r6, java.lang.String r7) {
            /*
                r5 = this;
                java.lang.String r6 = "FacebookSDK.WebDialog"
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Redirect URL: "
                r0.append(r1)
                r0.append(r7)
                java.lang.String r0 = r0.toString()
                com.facebook.internal.C2479ad.m9463b(r6, r0)
                com.facebook.internal.af r6 = com.facebook.internal.C2485af.this
                java.lang.String r6 = r6.f7822c
                boolean r6 = r7.startsWith(r6)
                r0 = 1
                if (r6 == 0) goto L_0x00a6
                com.facebook.internal.af r6 = com.facebook.internal.C2485af.this
                android.os.Bundle r6 = r6.mo8926a(r7)
                java.lang.String r7 = "error"
                java.lang.String r7 = r6.getString(r7)
                if (r7 != 0) goto L_0x0037
                java.lang.String r7 = "error_type"
                java.lang.String r7 = r6.getString(r7)
            L_0x0037:
                java.lang.String r1 = "error_msg"
                java.lang.String r1 = r6.getString(r1)
                if (r1 != 0) goto L_0x0045
                java.lang.String r1 = "error_message"
                java.lang.String r1 = r6.getString(r1)
            L_0x0045:
                if (r1 != 0) goto L_0x004d
                java.lang.String r1 = "error_description"
                java.lang.String r1 = r6.getString(r1)
            L_0x004d:
                java.lang.String r2 = "error_code"
                java.lang.String r2 = r6.getString(r2)
                boolean r3 = com.facebook.internal.C2479ad.m9456a(r2)
                r4 = -1
                if (r3 != 0) goto L_0x005f
                int r2 = java.lang.Integer.parseInt(r2)     // Catch:{ NumberFormatException -> 0x005f }
                goto L_0x0060
            L_0x005f:
                r2 = r4
            L_0x0060:
                boolean r3 = com.facebook.internal.C2479ad.m9456a(r7)
                if (r3 == 0) goto L_0x0074
                boolean r3 = com.facebook.internal.C2479ad.m9456a(r1)
                if (r3 == 0) goto L_0x0074
                if (r2 != r4) goto L_0x0074
                com.facebook.internal.af r7 = com.facebook.internal.C2485af.this
                r7.mo8927a(r6)
                goto L_0x00a5
            L_0x0074:
                if (r7 == 0) goto L_0x008c
                java.lang.String r6 = "access_denied"
                boolean r6 = r7.equals(r6)
                if (r6 != 0) goto L_0x0086
                java.lang.String r6 = "OAuthAccessDeniedException"
                boolean r6 = r7.equals(r6)
                if (r6 == 0) goto L_0x008c
            L_0x0086:
                com.facebook.internal.af r6 = com.facebook.internal.C2485af.this
                r6.cancel()
                goto L_0x00a5
            L_0x008c:
                r6 = 4201(0x1069, float:5.887E-42)
                if (r2 != r6) goto L_0x0096
                com.facebook.internal.af r6 = com.facebook.internal.C2485af.this
                r6.cancel()
                goto L_0x00a5
            L_0x0096:
                com.facebook.FacebookRequestError r6 = new com.facebook.FacebookRequestError
                r6.<init>(r2, r7, r1)
                com.facebook.internal.af r7 = com.facebook.internal.C2485af.this
                com.facebook.o r2 = new com.facebook.o
                r2.<init>(r6, r1)
                r7.mo8929a(r2)
            L_0x00a5:
                return r0
            L_0x00a6:
                java.lang.String r6 = "fbconnect://cancel"
                boolean r6 = r7.startsWith(r6)
                if (r6 == 0) goto L_0x00b4
                com.facebook.internal.af r6 = com.facebook.internal.C2485af.this
                r6.cancel()
                return r0
            L_0x00b4:
                java.lang.String r6 = "touch"
                boolean r6 = r7.contains(r6)
                r1 = 0
                if (r6 == 0) goto L_0x00be
                return r1
            L_0x00be:
                com.facebook.internal.af r6 = com.facebook.internal.C2485af.this     // Catch:{ ActivityNotFoundException -> 0x00d3 }
                android.content.Context r6 = r6.getContext()     // Catch:{ ActivityNotFoundException -> 0x00d3 }
                android.content.Intent r2 = new android.content.Intent     // Catch:{ ActivityNotFoundException -> 0x00d3 }
                java.lang.String r3 = "android.intent.action.VIEW"
                android.net.Uri r7 = android.net.Uri.parse(r7)     // Catch:{ ActivityNotFoundException -> 0x00d3 }
                r2.<init>(r3, r7)     // Catch:{ ActivityNotFoundException -> 0x00d3 }
                r6.startActivity(r2)     // Catch:{ ActivityNotFoundException -> 0x00d3 }
                return r0
            L_0x00d3:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.C2485af.C2491b.shouldOverrideUrlLoading(android.webkit.WebView, java.lang.String):boolean");
        }

        public void onReceivedError(WebView webView, int i, String str, String str2) {
            super.onReceivedError(webView, i, str, str2);
            C2485af.this.mo8929a((Throwable) new C2474i(str, i, str2));
        }

        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            super.onReceivedSslError(webView, sslErrorHandler, sslError);
            sslErrorHandler.cancel();
            C2485af.this.mo8929a((Throwable) new C2474i(null, -11, null));
        }

        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            StringBuilder sb = new StringBuilder();
            sb.append("Webview loading URL: ");
            sb.append(str);
            C2479ad.m9463b("FacebookSDK.WebDialog", sb.toString());
            super.onPageStarted(webView, str, bitmap);
            if (!C2485af.this.f7830k) {
                C2485af.this.f7825f.show();
            }
        }

        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            if (!C2485af.this.f7830k) {
                C2485af.this.f7825f.dismiss();
            }
            C2485af.this.f7827h.setBackgroundColor(0);
            C2485af.this.f7824e.setVisibility(0);
            C2485af.this.f7826g.setVisibility(0);
            C2485af.this.f7831l = true;
        }
    }

    /* renamed from: com.facebook.internal.af$c */
    /* compiled from: WebDialog */
    public interface C2492c {
        /* renamed from: a */
        void mo8960a(Bundle bundle, C2579j jVar);
    }

    /* renamed from: com.facebook.internal.af$d */
    /* compiled from: WebDialog */
    private class C2493d extends AsyncTask<Void, Void, String[]> {

        /* renamed from: b */
        private String f7846b;

        /* renamed from: c */
        private Bundle f7847c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public Exception[] f7848d;

        C2493d(String str, Bundle bundle) {
            this.f7846b = str;
            this.f7847c = bundle;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public String[] doInBackground(Void... voidArr) {
            String[] stringArray = this.f7847c.getStringArray("media");
            final String[] strArr = new String[stringArray.length];
            this.f7848d = new Exception[stringArray.length];
            final CountDownLatch countDownLatch = new CountDownLatch(stringArray.length);
            ConcurrentLinkedQueue concurrentLinkedQueue = new ConcurrentLinkedQueue();
            AccessToken a = AccessToken.m6161a();
            final int i = 0;
            while (i < stringArray.length) {
                try {
                    if (isCancelled()) {
                        Iterator it = concurrentLinkedQueue.iterator();
                        while (it.hasNext()) {
                            ((AsyncTask) it.next()).cancel(true);
                        }
                        return null;
                    }
                    Uri parse = Uri.parse(stringArray[i]);
                    if (C2479ad.m9452a(parse)) {
                        strArr[i] = parse.toString();
                        countDownLatch.countDown();
                    } else {
                        concurrentLinkedQueue.add(C2710h.m10343a(a, parse, (C1503b) new C1503b() {
                            /* renamed from: a */
                            public void mo6691a(C2661r rVar) {
                                try {
                                    FacebookRequestError a = rVar.mo9370a();
                                    if (a != null) {
                                        String e = a.mo6661e();
                                        if (e == null) {
                                            e = "Error staging photo.";
                                        }
                                        throw new C2580k(rVar, e);
                                    }
                                    JSONObject b = rVar.mo9371b();
                                    if (b == null) {
                                        throw new C2579j("Error staging photo.");
                                    }
                                    String optString = b.optString("uri");
                                    if (optString == null) {
                                        throw new C2579j("Error staging photo.");
                                    }
                                    strArr[i] = optString;
                                    countDownLatch.countDown();
                                } catch (Exception e2) {
                                    C2493d.this.f7848d[i] = e2;
                                }
                            }
                        }).mo6687j());
                    }
                    i++;
                } catch (Exception unused) {
                    Iterator it2 = concurrentLinkedQueue.iterator();
                    while (it2.hasNext()) {
                        ((AsyncTask) it2.next()).cancel(true);
                    }
                    return null;
                }
            }
            countDownLatch.await();
            return strArr;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void onPostExecute(String[] strArr) {
            Exception[] excArr;
            C2485af.this.f7825f.dismiss();
            for (Exception exc : this.f7848d) {
                if (exc != null) {
                    C2485af.this.mo8929a((Throwable) exc);
                    return;
                }
            }
            if (strArr == null) {
                C2485af.this.mo8929a((Throwable) new C2579j("Failed to stage photos for web dialog"));
                return;
            }
            List asList = Arrays.asList(strArr);
            if (asList.contains(null)) {
                C2485af.this.mo8929a((Throwable) new C2579j("Failed to stage photos for web dialog"));
                return;
            }
            C2479ad.m9453a(this.f7847c, "media", (Object) new JSONArray(asList));
            String a = C2476aa.m9410a();
            StringBuilder sb = new StringBuilder();
            sb.append(C2649m.m10134g());
            sb.append("/");
            sb.append("dialog/");
            sb.append(this.f7846b);
            C2485af.this.f7821b = C2479ad.m9421a(a, sb.toString(), this.f7847c).toString();
            C2485af.this.m9507b((C2485af.this.f7826g.getDrawable().getIntrinsicWidth() / 2) + 1);
        }
    }

    /* renamed from: a */
    private int m9499a(int i, float f, int i2, int i3) {
        int i4 = (int) (((float) i) / f);
        double d = 0.5d;
        if (i4 <= i2) {
            d = 1.0d;
        } else if (i4 < i3) {
            d = 0.5d + ((((double) (i3 - i4)) / ((double) (i3 - i2))) * 0.5d);
        }
        return (int) (((double) i) * d);
    }

    /* renamed from: a */
    protected static void m9504a(Context context) {
        if (context != null) {
            try {
                ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
                if (!(applicationInfo == null || applicationInfo.metaData == null || f7820m != 0)) {
                    m9503a(applicationInfo.metaData.getInt("com.facebook.sdk.WebDialogTheme"));
                }
            } catch (NameNotFoundException unused) {
            }
        }
    }

    /* renamed from: a */
    public static C2485af m9500a(Context context, String str, Bundle bundle, int i, C2492c cVar) {
        m9504a(context);
        C2485af afVar = new C2485af(context, str, bundle, i, cVar);
        return afVar;
    }

    /* renamed from: a */
    public static int m9498a() {
        C2484ae.m9487a();
        return f7820m;
    }

    /* renamed from: a */
    public static void m9503a(int i) {
        if (i == 0) {
            i = f7819a;
        }
        f7820m = i;
    }

    protected C2485af(Context context, String str) {
        this(context, str, m9498a());
    }

    private C2485af(Context context, String str, int i) {
        if (i == 0) {
            i = m9498a();
        }
        super(context, i);
        this.f7822c = "fbconnect://success";
        this.f7829j = false;
        this.f7830k = false;
        this.f7831l = false;
        this.f7821b = str;
    }

    private C2485af(Context context, String str, Bundle bundle, int i, C2492c cVar) {
        if (i == 0) {
            i = m9498a();
        }
        super(context, i);
        this.f7822c = "fbconnect://success";
        this.f7829j = false;
        this.f7830k = false;
        this.f7831l = false;
        if (bundle == null) {
            bundle = new Bundle();
        }
        this.f7822c = C2479ad.m9479f(context) ? "fbconnect://chrome_os_success" : "fbconnect://success";
        bundle.putString("redirect_uri", this.f7822c);
        bundle.putString("display", "touch");
        bundle.putString("client_id", C2649m.m10137j());
        bundle.putString("sdk", String.format(Locale.ROOT, "android-%s", new Object[]{C2649m.m10135h()}));
        this.f7823d = cVar;
        if (!str.equals("share") || !bundle.containsKey("media")) {
            String a = C2476aa.m9410a();
            StringBuilder sb = new StringBuilder();
            sb.append(C2649m.m10134g());
            sb.append("/");
            sb.append("dialog/");
            sb.append(str);
            this.f7821b = C2479ad.m9421a(a, sb.toString(), bundle).toString();
            return;
        }
        this.f7828i = new C2493d(str, bundle);
    }

    /* renamed from: a */
    public void mo8928a(C2492c cVar) {
        this.f7823d = cVar;
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4) {
            cancel();
        }
        return super.onKeyDown(i, keyEvent);
    }

    public void dismiss() {
        if (this.f7824e != null) {
            this.f7824e.stopLoading();
        }
        if (!this.f7830k && this.f7825f != null && this.f7825f.isShowing()) {
            this.f7825f.dismiss();
        }
        super.dismiss();
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        if (this.f7828i == null || this.f7828i.getStatus() != Status.PENDING) {
            mo8936e();
            return;
        }
        this.f7828i.execute(new Void[0]);
        this.f7825f.show();
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        if (this.f7828i != null) {
            this.f7828i.cancel(true);
            this.f7825f.dismiss();
        }
        super.onStop();
    }

    public void onDetachedFromWindow() {
        this.f7830k = true;
        super.onDetachedFromWindow();
    }

    public void onAttachedToWindow() {
        this.f7830k = false;
        if (C2479ad.m9474d(getContext()) && this.f7832n != null && this.f7832n.token == null) {
            this.f7832n.token = getOwnerActivity().getWindow().getAttributes().token;
            StringBuilder sb = new StringBuilder();
            sb.append("Set token on onAttachedToWindow(): ");
            sb.append(this.f7832n.token);
            C2479ad.m9463b("FacebookSDK.WebDialog", sb.toString());
        }
        super.onAttachedToWindow();
    }

    public void onWindowAttributesChanged(LayoutParams layoutParams) {
        if (layoutParams.token == null) {
            this.f7832n = layoutParams;
        }
        super.onWindowAttributesChanged(layoutParams);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f7825f = new ProgressDialog(getContext());
        this.f7825f.requestWindowFeature(1);
        this.f7825f.setMessage(getContext().getString(C2460f.com_facebook_loading));
        this.f7825f.setCanceledOnTouchOutside(false);
        this.f7825f.setOnCancelListener(new OnCancelListener() {
            public void onCancel(DialogInterface dialogInterface) {
                C2485af.this.cancel();
            }
        });
        requestWindowFeature(1);
        this.f7827h = new FrameLayout(getContext());
        mo8936e();
        getWindow().setGravity(17);
        getWindow().setSoftInputMode(16);
        m9513f();
        if (this.f7821b != null) {
            m9507b((this.f7826g.getDrawable().getIntrinsicWidth() / 2) + 1);
        }
        this.f7827h.addView(this.f7826g, new ViewGroup.LayoutParams(-2, -2));
        setContentView(this.f7827h);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo8930b(String str) {
        this.f7822c = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Bundle mo8926a(String str) {
        Uri parse = Uri.parse(str);
        Bundle c = C2479ad.m9465c(parse.getQuery());
        c.putAll(C2479ad.m9465c(parse.getFragment()));
        return c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo8931b() {
        return this.f7829j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public boolean mo8932c() {
        return this.f7831l;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public WebView mo8934d() {
        return this.f7824e;
    }

    /* renamed from: e */
    public void mo8936e() {
        Display defaultDisplay = ((WindowManager) getContext().getSystemService("window")).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        getWindow().setLayout(Math.min(m9499a(displayMetrics.widthPixels < displayMetrics.heightPixels ? displayMetrics.widthPixels : displayMetrics.heightPixels, displayMetrics.density, 480, 800), displayMetrics.widthPixels), Math.min(m9499a(displayMetrics.widthPixels < displayMetrics.heightPixels ? displayMetrics.heightPixels : displayMetrics.widthPixels, displayMetrics.density, 800, 1280), displayMetrics.heightPixels));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo8927a(Bundle bundle) {
        if (this.f7823d != null && !this.f7829j) {
            this.f7829j = true;
            this.f7823d.mo8960a(bundle, null);
            dismiss();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo8929a(Throwable th) {
        C2579j jVar;
        if (this.f7823d != null && !this.f7829j) {
            this.f7829j = true;
            if (th instanceof C2579j) {
                jVar = (C2579j) th;
            } else {
                jVar = new C2579j(th);
            }
            this.f7823d.mo8960a(null, jVar);
            dismiss();
        }
    }

    public void cancel() {
        if (this.f7823d != null && !this.f7829j) {
            mo8929a((Throwable) new C2581l());
        }
    }

    /* renamed from: f */
    private void m9513f() {
        this.f7826g = new ImageView(getContext());
        this.f7826g.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                C2485af.this.cancel();
            }
        });
        this.f7826g.setImageDrawable(getContext().getResources().getDrawable(C2457c.com_facebook_close));
        this.f7826g.setVisibility(4);
    }

    /* access modifiers changed from: private */
    @SuppressLint({"SetJavaScriptEnabled"})
    /* renamed from: b */
    public void m9507b(int i) {
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.f7824e = new WebView(getContext()) {
            public void onWindowFocusChanged(boolean z) {
                try {
                    super.onWindowFocusChanged(z);
                } catch (NullPointerException unused) {
                }
            }
        };
        this.f7824e.setVerticalScrollBarEnabled(false);
        this.f7824e.setHorizontalScrollBarEnabled(false);
        this.f7824e.setWebViewClient(new C2491b());
        this.f7824e.getSettings().setJavaScriptEnabled(true);
        this.f7824e.loadUrl(this.f7821b);
        this.f7824e.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.f7824e.setVisibility(4);
        this.f7824e.getSettings().setSavePassword(false);
        this.f7824e.getSettings().setSaveFormData(false);
        this.f7824e.setFocusable(true);
        this.f7824e.setFocusableInTouchMode(true);
        this.f7824e.setOnTouchListener(new OnTouchListener() {
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (!view.hasFocus()) {
                    view.requestFocus();
                }
                return false;
            }
        });
        linearLayout.setPadding(i, i, i, i);
        linearLayout.addView(this.f7824e);
        linearLayout.setBackgroundColor(-872415232);
        this.f7827h.addView(linearLayout);
    }
}
