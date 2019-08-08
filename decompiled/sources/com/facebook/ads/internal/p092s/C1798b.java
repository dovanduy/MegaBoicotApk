package com.facebook.ads.internal.p092s;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.facebook.ads.internal.p091r.C1795a;
import com.facebook.ads.internal.p095v.p096a.C1855a;
import com.facebook.ads.internal.p095v.p096a.C1870n;
import com.facebook.ads.internal.p095v.p096a.C1872p;
import com.facebook.ads.internal.p115w.p120e.C2357d;
import com.facebook.ads.internal.settings.AdInternalSettings;
import com.google.android.exoplayer2.trackselection.AdaptiveTrackSelection;
import java.util.Locale;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.internal.s.b */
public class C1798b {

    /* renamed from: a */
    private static final String f5668a = "b";

    /* renamed from: b */
    private final C1801a f5669b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final ThreadPoolExecutor f5670c;

    /* renamed from: d */
    private final ConnectivityManager f5671d;

    /* renamed from: e */
    private final C1855a f5672e;

    /* renamed from: f */
    private final Handler f5673f;

    /* renamed from: g */
    private final long f5674g;

    /* renamed from: h */
    private final long f5675h;

    /* renamed from: i */
    private final Context f5676i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final Runnable f5677j = new Runnable() {
        public void run() {
            C1798b.m7492a(C1798b.this);
            if (C1798b.this.f5681n > 0) {
                try {
                    Thread.sleep(C1798b.this.f5681n);
                } catch (InterruptedException unused) {
                }
            }
            C1798b.this.mo7676c();
        }
    };

    /* renamed from: k */
    private final Runnable f5678k = new Runnable() {
        public void run() {
            C1798b.this.f5679l = false;
            if (C1798b.this.f5670c.getQueue().isEmpty()) {
                C1798b.this.f5670c.execute(C1798b.this.f5677j);
            }
        }
    };
    /* access modifiers changed from: private */

    /* renamed from: l */
    public volatile boolean f5679l;

    /* renamed from: m */
    private int f5680m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public long f5681n;

    /* renamed from: com.facebook.ads.internal.s.b$a */
    public interface C1801a {
        /* renamed from: a */
        JSONObject mo7679a();

        /* renamed from: a */
        boolean mo7680a(JSONArray jSONArray);

        /* renamed from: b */
        void mo7681b();

        /* renamed from: b */
        void mo7682b(JSONArray jSONArray);

        /* renamed from: c */
        void mo7683c();

        /* renamed from: d */
        boolean mo7684d();
    }

    C1798b(Context context, C1801a aVar) {
        this.f5669b = aVar;
        this.f5676i = context;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 0, TimeUnit.MILLISECONDS, new LinkedBlockingQueue());
        this.f5670c = threadPoolExecutor;
        this.f5671d = (ConnectivityManager) context.getSystemService("connectivity");
        this.f5672e = C2357d.m9119b(context);
        this.f5673f = new Handler(Looper.getMainLooper());
        this.f5674g = C1795a.m7463v(context);
        this.f5675h = C1795a.m7464w(context);
    }

    /* renamed from: a */
    static /* synthetic */ int m7492a(C1798b bVar) {
        int i = bVar.f5680m + 1;
        bVar.f5680m = i;
        return i;
    }

    /* renamed from: a */
    private void m7493a(long j) {
        this.f5673f.postDelayed(this.f5678k, j);
    }

    /* renamed from: d */
    private void m7498d() {
        if (this.f5680m >= 5) {
            m7499e();
            mo7675b();
            return;
        }
        this.f5681n = this.f5680m == 1 ? AdaptiveTrackSelection.DEFAULT_MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS : this.f5681n * 2;
        mo7674a();
    }

    /* renamed from: e */
    private void m7499e() {
        this.f5680m = 0;
        this.f5681n = 0;
        if (this.f5670c.getQueue().size() == 0) {
            this.f5669b.mo7681b();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo7674a() {
        this.f5679l = true;
        this.f5673f.removeCallbacks(this.f5678k);
        m7493a(this.f5674g);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo7675b() {
        if (!this.f5679l) {
            this.f5679l = true;
            this.f5673f.removeCallbacks(this.f5678k);
            m7493a(this.f5675h);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo7676c() {
        C1801a aVar;
        JSONArray jSONArray;
        try {
            NetworkInfo activeNetworkInfo = this.f5671d.getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                if (activeNetworkInfo.isConnectedOrConnecting()) {
                    JSONObject a = this.f5669b.mo7679a();
                    if (a == null) {
                        m7499e();
                        return;
                    }
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("attempt", String.valueOf(this.f5680m));
                    a.put("data", jSONObject);
                    C1872p pVar = new C1872p();
                    pVar.put("payload", a.toString());
                    C1855a aVar2 = this.f5672e;
                    Context context = this.f5676i;
                    String urlPrefix = AdInternalSettings.getUrlPrefix();
                    String format = TextUtils.isEmpty(urlPrefix) ? "https://www.facebook.com/adnw_logging/" : String.format(Locale.US, "https://www.%s.facebook.com/adnw_logging/", new Object[]{urlPrefix});
                    String M = C1795a.m7419M(context);
                    if (!TextUtils.isEmpty(M)) {
                        format = format.replace("www", M);
                    }
                    C1870n b = aVar2.mo7852b(format, pVar);
                    String e = b != null ? b.mo7890e() : null;
                    if (TextUtils.isEmpty(e)) {
                        if (a.has("events")) {
                            aVar = this.f5669b;
                            jSONArray = a.getJSONArray("events");
                        }
                        m7498d();
                        return;
                    }
                    if (b.mo7886a() == 200) {
                        if (this.f5669b.mo7680a(new JSONArray(e))) {
                            if (this.f5669b.mo7684d()) {
                            }
                        }
                        m7498d();
                        return;
                    } else if (b.mo7886a() != 413 || !C1795a.m7416J(this.f5676i)) {
                        if (a.has("events")) {
                            aVar = this.f5669b;
                            jSONArray = a.getJSONArray("events");
                        }
                        m7498d();
                        return;
                    } else {
                        this.f5669b.mo7683c();
                    }
                    m7499e();
                    return;
                    aVar.mo7682b(jSONArray);
                    m7498d();
                    return;
                }
            }
            m7493a(this.f5675h);
        } catch (Exception unused) {
            m7498d();
        }
    }
}
