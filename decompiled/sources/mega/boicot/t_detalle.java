package mega.boicot;

import android.app.ProgressDialog;
import android.app.SearchManager;
import android.app.SearchManager.OnCancelListener;
import android.app.SearchManager.OnDismissListener;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p017v4.app.FragmentActivity;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ListView;
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

public class t_detalle extends FragmentActivity implements OnClickListener, OnAdClosed, OnAdError, OnAdLoaded, OnVideoEnded, RewardedVideoAdListener, C3167c, VideoListener, AdEventListener, C5599a {

    /* renamed from: k */
    config f20531k;

    /* renamed from: l */
    boolean f20532l = false;

    /* renamed from: m */
    String f20533m;

    /* renamed from: n */
    t_detalle_fr f20534n;

    /* renamed from: o */
    C5602c f20535o;

    /* renamed from: p */
    C3166b f20536p;

    /* renamed from: q */
    RewardedVideo f20537q;

    /* renamed from: r */
    RewardedVideoAd f20538r;

    /* renamed from: s */
    StartAppAd f20539s;

    /* renamed from: t */
    boolean f20540t = false;

    /* renamed from: u */
    boolean f20541u = false;

    /* renamed from: v */
    View f20542v;

    /* renamed from: w */
    ProgressDialog f20543w;

    /* renamed from: x */
    ListView f20544x;

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
        this.f20531k = (config) getApplicationContext();
        this.f20533m = config.m23831a(this.f20531k.f17951bf, this.f20531k.f17954bi);
        super.onCreate(bundle);
        setContentView(R.layout.detalle_fr);
        mo2636h();
        if (this.f20531k.f18080q > 0) {
            SearchManager searchManager = (SearchManager) getSystemService("search");
            searchManager.setOnCancelListener(new OnCancelListener() {
                public void onCancel() {
                    t_detalle.this.f20532l = false;
                    t_detalle.this.setResult(0);
                }
            });
            searchManager.setOnDismissListener(new OnDismissListener() {
                public void onDismiss() {
                    t_detalle.this.f20541u = false;
                }
            });
        }
        this.f20535o = this.f20531k.mo20760a((Context) this, false);
        Intent intent = getIntent();
        String string = intent.getExtras().getString("url");
        long j = intent.getExtras().getLong("idprod");
        this.f20534n = (t_detalle_fr) mo670f().mo865a((int) R.id.detalle_fr);
        this.f20534n.mo22198a(string, j);
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (this.f20534n.mo22200a(i, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    public void onClick(View view) {
        if ((this.f20531k.f17986cO == null || this.f20531k.f17986cO.equals("")) && ((this.f20531k.f17985cN == null || this.f20531k.f17985cN.equals("")) && ((this.f20531k.f17988cQ == null || this.f20531k.f17988cQ.equals("")) && (this.f20531k.f17989cR == null || this.f20531k.f17989cR.equals(""))))) {
            abrir_secc(view);
            return;
        }
        if (this.f20531k.f17986cO != null && !this.f20531k.f17986cO.equals("")) {
            this.f20537q = new RewardedVideo((Context) this, this.f20531k.f17986cO);
        }
        if (this.f20531k.f17985cN != null && !this.f20531k.f17985cN.equals("")) {
            this.f20536p = C2997g.m10716a(this);
        }
        if (this.f20531k.f17988cQ != null && !this.f20531k.f17988cQ.equals("")) {
            this.f20538r = new RewardedVideoAd(this, this.f20531k.f17988cQ);
        }
        if (this.f20531k.f17989cR != null && !this.f20531k.f17989cR.equals("")) {
            this.f20539s = new StartAppAd(this);
        }
        this.f20543w = new ProgressDialog(this);
        this.f20542v = view;
        if (!this.f20531k.mo20774a((Context) this, view, this.f20533m, this.f20543w, this.f20536p, this.f20537q, this.f20538r, this.f20539s)) {
            abrir_secc(view);
        }
    }

    public void abrir_secc(View view) {
        C5662h a = this.f20531k.mo20761a(view, (Context) this);
        if (a.f18227b) {
            this.f20532l = true;
            Intent intent = new Intent();
            intent.putExtra("finalizar", true);
            intent.putExtra("finalizar_app", a.f18228c);
            setResult(-1, intent);
        }
        if (a.f18229d) {
            startActivityForResult(a.f18226a, 0);
        } else if (a.f18226a != null) {
            if (a.f18227b && this.f20531k.f18045dm != 2) {
                a.f18226a.putExtra("es_root", true);
            }
            startActivity(a.f18226a);
        }
        if (this.f20532l && !this.f20541u) {
            finish();
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
    /* renamed from: h */
    public void mo2636h() {
        int b = this.f20531k.mo20778b((Context) this);
        if (this.f20531k.f18045dm == 1) {
            this.f20544x = (ListView) findViewById(R.id.left_drawer);
            this.f20531k.mo20771a(this.f20544x);
        } else if (this.f20531k.f18045dm == 0) {
            int i = 0;
            for (int i2 = 0; i2 < this.f20531k.f17971bz.length; i2++) {
                if (!this.f20531k.f17971bz[i2].f18333z) {
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
        for (int i3 = 0; i3 < this.f20531k.f17923bD.length; i3++) {
            if (this.f20531k.f17923bD[i3] > 0) {
                findViewById(this.f20531k.f17923bD[i3]).setOnClickListener(this);
            }
        }
    }

    public boolean onSearchRequested() {
        if (this.f20531k.f18080q == 0) {
            return false;
        }
        this.f20532l = true;
        this.f20541u = true;
        return super.onSearchRequested();
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getWindow().setFormat(1);
    }

    public void onStop() {
        super.onStop();
        if (this.f20532l && !this.f20541u) {
            finish();
        }
    }

    public void onPause() {
        if (!(this.f20531k.f18013cx == 0 || this.f20535o == null || this.f20535o.f17768a == null)) {
            this.f20535o.f17768a.mo12167b();
        }
        super.onPause();
    }

    public void onResume() {
        super.onResume();
        config.m23860m(this);
        if (this.f20531k.f18013cx != 0 && this.f20535o != null && this.f20535o.f17768a != null) {
            this.f20535o.f17768a.mo12165a();
        }
    }

    public void onDestroy() {
        if (!(this.f20531k.f18013cx == 0 || this.f20535o == null || this.f20535o.f17768a == null)) {
            this.f20535o.f17768a.mo12168c();
        }
        if (!(this.f20531k.f18013cx == 0 || this.f20535o == null || this.f20535o.f17769b == null)) {
            this.f20535o.f17769b.destroy();
        }
        super.onDestroy();
    }

    public void onBackPressed() {
        super.onBackPressed();
    }

    public void adLoaded(String str) {
        this.f20543w.cancel();
        this.f20537q.showAd();
    }

    public void onAdClosed() {
        if (this.f20540t) {
            abrir_secc(this.f20542v);
        }
    }

    public void adError(String str) {
        this.f20543w.cancel();
        abrir_secc(this.f20542v);
    }

    public void videoEnded() {
        this.f20540t = true;
        config.m23867t(this);
    }

    /* renamed from: z_ */
    public void mo9678z_() {
        this.f20543w.cancel();
        this.f20536p.mo12836a();
    }

    /* renamed from: a */
    public void mo9675a(C3165a aVar) {
        this.f20540t = true;
        config.m23867t(this);
    }

    /* renamed from: A_ */
    public void mo9671A_() {
        if (this.f20540t) {
            abrir_secc(this.f20542v);
        }
    }

    /* renamed from: e */
    public void mo9676e() {
        this.f20540t = false;
    }

    /* renamed from: a */
    public void mo9674a(int i) {
        if (!this.f20531k.mo20775a((Context) this, this.f20537q)) {
            this.f20543w.cancel();
            abrir_secc(this.f20542v);
        }
    }

    public void onError(C1514Ad ad, AdError adError) {
        this.f20543w.cancel();
        abrir_secc(this.f20542v);
    }

    public void onAdLoaded(C1514Ad ad) {
        this.f20543w.cancel();
        this.f20538r.show();
    }

    public void onRewardedVideoCompleted() {
        this.f20540t = true;
        config.m23867t(this);
    }

    public void onRewardedVideoClosed() {
        if (this.f20540t) {
            abrir_secc(this.f20542v);
        }
    }

    public void onVideoCompleted() {
        this.f20540t = true;
        config.m23867t(this);
    }

    public void onReceiveAd(C5286Ad ad) {
        this.f20543w.cancel();
        this.f20539s.showAd("REWARDED VIDEO", new AdDisplayListener() {
            public void adClicked(C5286Ad ad) {
            }

            public void adDisplayed(C5286Ad ad) {
            }

            public void adNotDisplayed(C5286Ad ad) {
            }

            public void adHidden(C5286Ad ad) {
                if (t_detalle.this.f20540t) {
                    t_detalle.this.abrir_secc(t_detalle.this.f20542v);
                }
            }
        });
    }

    public void onFailedToReceiveAd(C5286Ad ad) {
        this.f20543w.cancel();
        abrir_secc(this.f20542v);
    }
}
