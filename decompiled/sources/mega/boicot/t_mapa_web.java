package mega.boicot;

import android.app.Activity;
import android.app.ProgressDialog;
import android.app.SearchManager;
import android.app.SearchManager.OnCancelListener;
import android.app.SearchManager.OnDismissListener;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.GeolocationPermissions.Callback;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings.PluginState;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ProgressBar;
import com.appnext.ads.fullscreen.RewardedVideo;
import com.appnext.core.callbacks.OnAdClosed;
import com.appnext.core.callbacks.OnAdError;
import com.appnext.core.callbacks.OnAdLoaded;
import com.appnext.core.callbacks.OnVideoEnded;
import com.facebook.ads.AdError;
import com.facebook.ads.C1514Ad;
import com.facebook.ads.RewardedVideoAd;
import com.facebook.ads.RewardedVideoAdListener;
import com.google.android.gms.ads.C2997g;
import com.google.android.gms.ads.reward.C3165a;
import com.google.android.gms.ads.reward.C3166b;
import com.google.android.gms.ads.reward.C3167c;
import com.startapp.android.publish.adsCommon.C5286Ad;
import com.startapp.android.publish.adsCommon.StartAppAd;
import com.startapp.android.publish.adsCommon.VideoListener;
import com.startapp.android.publish.adsCommon.adListeners.AdDisplayListener;
import com.startapp.android.publish.adsCommon.adListeners.AdEventListener;

public class t_mapa_web extends Activity implements OnClickListener, OnAdClosed, OnAdError, OnAdLoaded, OnVideoEnded, RewardedVideoAdListener, C3167c, VideoListener, AdEventListener, C5599a {

    /* renamed from: a */
    config f20619a;

    /* renamed from: b */
    boolean f20620b = false;

    /* renamed from: c */
    String f20621c;

    /* renamed from: d */
    WebView f20622d;

    /* renamed from: e */
    C5602c f20623e;

    /* renamed from: f */
    C3166b f20624f;

    /* renamed from: g */
    RewardedVideo f20625g;

    /* renamed from: h */
    RewardedVideoAd f20626h;

    /* renamed from: i */
    StartAppAd f20627i;

    /* renamed from: j */
    boolean f20628j = false;

    /* renamed from: k */
    boolean f20629k = false;

    /* renamed from: l */
    View f20630l;

    /* renamed from: m */
    ProgressDialog f20631m;

    /* renamed from: n */
    ListView f20632n;

    /* renamed from: B_ */
    public void mo9672B_() {
    }

    /* renamed from: C_ */
    public void mo9673C_() {
    }

    public void onAdClicked(C1514Ad ad) {
    }

    public void onLoggingImpression(C1514Ad ad) {
    }

    public void onCreate(Bundle bundle) {
        this.f20619a = (config) getApplicationContext();
        this.f20621c = config.m23831a(this.f20619a.f17971bz[this.f20619a.f18075l].f18314g, this.f20619a.f17890aW);
        super.onCreate(bundle);
        setContentView(R.layout.t_mapa_web);
        mo22248f();
        if (this.f20619a.f18080q > 0) {
            SearchManager searchManager = (SearchManager) getSystemService("search");
            searchManager.setOnCancelListener(new OnCancelListener() {
                public void onCancel() {
                    t_mapa_web.this.f20620b = false;
                    t_mapa_web.this.setResult(0);
                }
            });
            searchManager.setOnDismissListener(new OnDismissListener() {
                public void onDismiss() {
                    t_mapa_web.this.f20629k = false;
                }
            });
        }
        this.f20619a.mo20770a((Context) this, false, false);
        this.f20623e = this.f20619a.mo20760a((Context) this, false);
        this.f20622d = (WebView) findViewById(R.id.webview);
        this.f20622d.setWebChromeClient(new WebChromeClient() {
            public void onGeolocationPermissionsShowPrompt(String str, Callback callback) {
                callback.invoke(str, true, false);
            }
        });
        final ProgressBar progressBar = (ProgressBar) findViewById(R.id.pb_url);
        if (VERSION.SDK_INT > 20) {
            config.m23838a(progressBar, this.f20619a.f17890aW);
        }
        this.f20622d.setWebViewClient(new WebViewClient() {
            public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
                progressBar.setVisibility(0);
            }

            public void onPageFinished(WebView webView, String str) {
                progressBar.setVisibility(8);
            }
        });
        this.f20622d.getSettings().setJavaScriptEnabled(true);
        this.f20622d.getSettings().setPluginState(PluginState.ON);
        if (bundle == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("http://maps.google.com/maps?z=");
            sb.append(getIntent().getIntExtra("z", 0));
            sb.append("&t=m&q=loc:");
            sb.append(((float) getIntent().getIntExtra("x", 0)) / 1000000.0f);
            sb.append("+");
            sb.append(((float) getIntent().getIntExtra("y", 0)) / 1000000.0f);
            this.f20622d.loadUrl(sb.toString());
        }
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i2 == -1 && intent != null && intent.hasExtra("finalizar") && intent.getExtras().getBoolean("finalizar")) {
            setResult(-1, intent);
            finish();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public void mo22248f() {
        int b = this.f20619a.mo20778b((Context) this);
        if (this.f20619a.f18045dm == 1) {
            this.f20632n = (ListView) findViewById(R.id.left_drawer);
            this.f20619a.mo20771a(this.f20632n);
        } else if (this.f20619a.f18045dm == 0) {
            int i = 0;
            for (int i2 = 0; i2 < this.f20619a.f17971bz.length; i2++) {
                if (!this.f20619a.f17971bz[i2].f18333z) {
                    findViewById(i2).setOnClickListener(this);
                    i++;
                    if (i == b) {
                        break;
                    }
                }
            }
            if (findViewById(R.id.idaux9999) != null && findViewById(R.id.idaux9999).getVisibility() == 0) {
                findViewById(R.id.idaux9999).setOnClickListener(this);
            }
        }
        for (int i3 = 0; i3 < this.f20619a.f17923bD.length; i3++) {
            if (this.f20619a.f17923bD[i3] > 0) {
                findViewById(this.f20619a.f17923bD[i3]).setOnClickListener(this);
            }
        }
    }

    public void onClick(View view) {
        if (this.f20619a.f17986cO != null && !this.f20619a.f17986cO.equals("")) {
            this.f20625g = new RewardedVideo((Context) this, this.f20619a.f17986cO);
        }
        if (this.f20619a.f17985cN != null && !this.f20619a.f17985cN.equals("")) {
            this.f20624f = C2997g.m10716a(this);
        }
        if (this.f20619a.f17988cQ != null && !this.f20619a.f17988cQ.equals("")) {
            this.f20626h = new RewardedVideoAd(this, this.f20619a.f17988cQ);
        }
        if (this.f20619a.f17989cR != null && !this.f20619a.f17989cR.equals("")) {
            this.f20627i = new StartAppAd(this);
        }
        this.f20631m = new ProgressDialog(this);
        this.f20630l = view;
        if (!this.f20619a.mo20774a((Context) this, view, this.f20621c, this.f20631m, this.f20624f, this.f20625g, this.f20626h, this.f20627i)) {
            abrir_secc(view);
        }
    }

    public void abrir_secc(View view) {
        C5662h a = this.f20619a.mo20761a(view, (Context) this);
        if (a.f18227b) {
            this.f20620b = true;
            Intent intent = new Intent();
            intent.putExtra("finalizar", true);
            intent.putExtra("finalizar_app", a.f18228c);
            setResult(-1, intent);
        }
        if (a.f18229d) {
            startActivityForResult(a.f18226a, 0);
        } else if (a.f18226a != null) {
            if (a.f18227b && this.f20619a.f18045dm != 2) {
                a.f18226a.putExtra("es_root", true);
            }
            startActivity(a.f18226a);
        }
        if (this.f20620b && !this.f20629k) {
            finish();
        }
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4 || !this.f20622d.canGoBack()) {
            return super.onKeyDown(i, keyEvent);
        }
        this.f20622d.goBack();
        return true;
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.f20622d.saveState(bundle);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        this.f20622d.restoreState(bundle);
    }

    public boolean onSearchRequested() {
        if (this.f20619a.f18080q == 0) {
            return false;
        }
        this.f20620b = true;
        this.f20629k = true;
        return super.onSearchRequested();
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getWindow().setFormat(1);
    }

    public void onStop() {
        super.onStop();
        if (this.f20620b && !this.f20629k) {
            finish();
        }
    }

    public void onPause() {
        if (!(this.f20619a.f18013cx == 0 || this.f20623e == null || this.f20623e.f17768a == null)) {
            this.f20623e.f17768a.mo12167b();
        }
        super.onPause();
    }

    public void onResume() {
        super.onResume();
        config.m23860m(this);
        if (this.f20619a.f18013cx != 0 && this.f20623e != null && this.f20623e.f17768a != null) {
            this.f20623e.f17768a.mo12165a();
        }
    }

    public void onDestroy() {
        if (!(this.f20619a.f18013cx == 0 || this.f20623e == null || this.f20623e.f17768a == null)) {
            this.f20623e.f17768a.mo12168c();
        }
        if (!(this.f20619a.f18013cx == 0 || this.f20623e == null || this.f20623e.f17769b == null)) {
            this.f20623e.f17769b.destroy();
        }
        super.onDestroy();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ((LinearLayout) findViewById(R.id.ll_princ)).removeViewAt(0);
        mo22248f();
        ((LinearLayout) findViewById(R.id.ll_ad)).removeAllViews();
        if (!(this.f20623e == null || this.f20623e.f17768a == null)) {
            try {
                this.f20623e.f17768a.mo12168c();
            } catch (Exception unused) {
            }
        }
        if (!(this.f20623e == null || this.f20623e.f17769b == null)) {
            try {
                this.f20623e.f17769b.destroy();
            } catch (Exception unused2) {
            }
        }
        this.f20623e = this.f20619a.mo20760a((Context) this, false);
    }

    public void adLoaded(String str) {
        this.f20631m.cancel();
        this.f20625g.showAd();
    }

    public void onAdClosed() {
        if (this.f20628j) {
            abrir_secc(this.f20630l);
        }
    }

    public void adError(String str) {
        this.f20631m.cancel();
        abrir_secc(this.f20630l);
    }

    public void videoEnded() {
        this.f20628j = true;
        config.m23867t(this);
    }

    /* renamed from: z_ */
    public void mo9678z_() {
        this.f20631m.cancel();
        this.f20624f.mo12836a();
    }

    /* renamed from: a */
    public void mo9675a(C3165a aVar) {
        this.f20628j = true;
        config.m23867t(this);
    }

    /* renamed from: A_ */
    public void mo9671A_() {
        if (this.f20628j) {
            abrir_secc(this.f20630l);
        }
    }

    /* renamed from: e */
    public void mo9676e() {
        this.f20628j = false;
    }

    /* renamed from: a */
    public void mo9674a(int i) {
        if (!this.f20619a.mo20775a((Context) this, this.f20625g)) {
            this.f20631m.cancel();
            abrir_secc(this.f20630l);
        }
    }

    public void onError(C1514Ad ad, AdError adError) {
        this.f20631m.cancel();
        abrir_secc(this.f20630l);
    }

    public void onAdLoaded(C1514Ad ad) {
        this.f20631m.cancel();
        this.f20626h.show();
    }

    public void onRewardedVideoCompleted() {
        this.f20628j = true;
        config.m23867t(this);
    }

    public void onRewardedVideoClosed() {
        if (this.f20628j) {
            abrir_secc(this.f20630l);
        }
    }

    public void onVideoCompleted() {
        this.f20628j = true;
        config.m23867t(this);
    }

    public void onReceiveAd(C5286Ad ad) {
        this.f20631m.cancel();
        this.f20627i.showAd("REWARDED VIDEO", new AdDisplayListener() {
            public void adClicked(C5286Ad ad) {
            }

            public void adDisplayed(C5286Ad ad) {
            }

            public void adNotDisplayed(C5286Ad ad) {
            }

            public void adHidden(C5286Ad ad) {
                if (t_mapa_web.this.f20628j) {
                    t_mapa_web.this.abrir_secc(t_mapa_web.this.f20630l);
                }
            }
        });
    }

    public void onFailedToReceiveAd(C5286Ad ad) {
        this.f20631m.cancel();
        abrir_secc(this.f20630l);
    }
}
