package com.p055c.p056a.p057a.p058a.p066g;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.webkit.WebView;
import com.google.android.exoplayer2.trackselection.AdaptiveTrackSelection;
import com.p055c.p056a.p057a.p058a.p060b.C1443h;
import com.p055c.p056a.p057a.p058a.p062c.C1450c;
import com.p055c.p056a.p057a.p058a.p062c.C1451d;
import java.util.List;

/* renamed from: com.c.a.a.a.g.c */
public class C1472c extends C1469a {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public WebView f4455a;

    /* renamed from: b */
    private List<C1443h> f4456b;

    /* renamed from: c */
    private final String f4457c;

    public C1472c(List<C1443h> list, String str) {
        this.f4456b = list;
        this.f4457c = str;
    }

    /* renamed from: a */
    public void mo6559a() {
        super.mo6559a();
        mo6579j();
    }

    /* renamed from: b */
    public void mo6570b() {
        super.mo6570b();
        new Handler().postDelayed(new Runnable() {

            /* renamed from: b */
            private WebView f4459b = C1472c.this.f4455a;

            public void run() {
                this.f4459b.destroy();
            }
        }, AdaptiveTrackSelection.DEFAULT_MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS);
        this.f4455a = null;
    }

    /* access modifiers changed from: 0000 */
    @SuppressLint({"SetJavaScriptEnabled"})
    /* renamed from: j */
    public void mo6579j() {
        this.f4455a = new WebView(C1450c.m6003a().mo6535b());
        this.f4455a.getSettings().setJavaScriptEnabled(true);
        mo6561a(this.f4455a);
        C1451d.m6006a().mo6544a(this.f4455a, this.f4457c);
        for (C1443h b : this.f4456b) {
            C1451d.m6006a().mo6546b(this.f4455a, b.mo6502b().toExternalForm());
        }
    }
}
