package com.google.android.gms.ads.internal;

import android.os.RemoteException;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.internal.ads.C3900je;
import com.google.android.gms.internal.ads.aoq;
import com.google.android.gms.internal.ads.aru;

/* renamed from: com.google.android.gms.ads.internal.ar */
final class C3020ar extends WebViewClient {

    /* renamed from: a */
    private final /* synthetic */ C3019aq f8795a;

    C3020ar(C3019aq aqVar) {
        this.f8795a = aqVar;
    }

    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        if (this.f8795a.f8792g != null) {
            try {
                this.f8795a.f8792g.mo14530a(0);
            } catch (RemoteException e) {
                C3900je.m17434d("#007 Could not call remote method.", e);
            }
        }
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (str.startsWith(this.f8795a.mo12508d())) {
            return false;
        }
        if (str.startsWith((String) aoq.m14620f().mo14695a(aru.f11928cu))) {
            if (this.f8795a.f8792g != null) {
                try {
                    this.f8795a.f8792g.mo14530a(3);
                } catch (RemoteException e) {
                    C3900je.m17434d("#007 Could not call remote method.", e);
                }
            }
            this.f8795a.mo12505a(0);
            return true;
        }
        if (str.startsWith((String) aoq.m14620f().mo14695a(aru.f11929cv))) {
            if (this.f8795a.f8792g != null) {
                try {
                    this.f8795a.f8792g.mo14530a(0);
                } catch (RemoteException e2) {
                    C3900je.m17434d("#007 Could not call remote method.", e2);
                }
            }
            this.f8795a.mo12505a(0);
            return true;
        }
        if (str.startsWith((String) aoq.m14620f().mo14695a(aru.f11930cw))) {
            if (this.f8795a.f8792g != null) {
                try {
                    this.f8795a.f8792g.mo14532c();
                } catch (RemoteException e3) {
                    C3900je.m17434d("#007 Could not call remote method.", e3);
                }
            }
            this.f8795a.mo12505a(this.f8795a.mo12506b(str));
            return true;
        } else if (str.startsWith("gmsg://")) {
            return true;
        } else {
            if (this.f8795a.f8792g != null) {
                try {
                    this.f8795a.f8792g.mo14531b();
                } catch (RemoteException e4) {
                    C3900je.m17434d("#007 Could not call remote method.", e4);
                }
            }
            this.f8795a.m10861d(this.f8795a.m10859c(str));
            return true;
        }
    }
}
