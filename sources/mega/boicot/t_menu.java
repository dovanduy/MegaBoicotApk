package mega.boicot;

import android.app.Activity;
import android.app.ListActivity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
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
import mega.boicot.config.C5640d;

public class t_menu extends ListActivity implements OnAdClosed, OnAdError, OnAdLoaded, OnVideoEnded, RewardedVideoAdListener, C3167c, VideoListener, AdEventListener {

    /* renamed from: a */
    config f19156a;

    /* renamed from: b */
    boolean f19157b = false;

    /* renamed from: c */
    String f19158c;

    /* renamed from: d */
    C3166b f19159d;

    /* renamed from: e */
    RewardedVideo f19160e;

    /* renamed from: f */
    RewardedVideoAd f19161f;

    /* renamed from: g */
    StartAppAd f19162g;

    /* renamed from: h */
    boolean f19163h = false;

    /* renamed from: i */
    boolean f19164i = false;

    /* renamed from: j */
    int f19165j;

    /* renamed from: k */
    ProgressDialog f19166k;

    /* renamed from: l */
    int[] f19167l;

    /* renamed from: m */
    int f19168m;

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
        this.f19156a = (config) getApplicationContext();
        if (this.f19156a.f17881aN == null) {
            this.f19156a.mo20780b();
        }
        if (this.f19156a.f18075l != -1) {
            this.f19158c = config.m23831a(this.f19156a.f17881aN, this.f19156a.f17890aW);
        } else {
            this.f19158c = config.m23831a(this.f19156a.f17971bz[this.f19156a.f18075l].f18314g, this.f19156a.f17890aW);
        }
        super.onCreate(bundle);
        config.m23833a((Activity) this, this.f19156a.f17881aN);
        this.f19168m = 0;
        int i = this.f19156a.f18078o;
        if (this.f19156a.f18061ec) {
            i++;
        }
        String[] strArr = new String[i];
        this.f19167l = new int[i];
        for (int i2 = 0; i2 < this.f19156a.f17971bz.length; i2++) {
            if (!this.f19156a.f17971bz[i2].f18333z) {
                strArr[this.f19168m] = this.f19156a.f17971bz[i2].f18256a;
                this.f19167l[this.f19168m] = i2;
                this.f19168m++;
            }
        }
        if (this.f19156a.f18061ec) {
            strArr[this.f19168m] = getResources().getString(R.string.privacidad);
            this.f19167l[this.f19168m] = -123;
        }
        if (VERSION.SDK_INT >= 17 && getResources().getBoolean(R.bool.es_rtl)) {
            getListView().setTextDirection(4);
        }
        setListAdapter(new ArrayAdapter(this, 17367043, strArr));
    }

    /* access modifiers changed from: protected */
    public void onListItemClick(ListView listView, View view, int i, long j) {
        if (!this.f19156a.f18061ec || this.f19167l[i] != -123) {
            view.setId(this.f19156a.f17922bC[i]);
            view.setTag(R.id.TAG_IDSECC, Integer.valueOf(this.f19156a.f17922bC[i]));
            if ((this.f19156a.f17986cO == null || this.f19156a.f17986cO.equals("")) && ((this.f19156a.f17985cN == null || this.f19156a.f17985cN.equals("")) && ((this.f19156a.f17988cQ == null || this.f19156a.f17988cQ.equals("")) && (this.f19156a.f17989cR == null || this.f19156a.f17989cR.equals(""))))) {
                mo21290b(i);
            } else {
                if (this.f19156a.f17986cO != null && !this.f19156a.f17986cO.equals("")) {
                    this.f19160e = new RewardedVideo((Context) this, this.f19156a.f17986cO);
                }
                if (this.f19156a.f17985cN != null && !this.f19156a.f17985cN.equals("")) {
                    this.f19159d = C2997g.m10716a(this);
                }
                if (this.f19156a.f17988cQ != null && !this.f19156a.f17988cQ.equals("")) {
                    this.f19161f = new RewardedVideoAd(this, this.f19156a.f17988cQ);
                }
                if (this.f19156a.f17989cR != null && !this.f19156a.f17989cR.equals("")) {
                    this.f19162g = new StartAppAd(this);
                }
                this.f19166k = new ProgressDialog(this);
                this.f19165j = i;
                if (!this.f19156a.mo20774a((Context) this, view, this.f19158c, this.f19166k, this.f19159d, this.f19160e, this.f19161f, this.f19162g)) {
                    mo21290b(i);
                }
            }
            return;
        }
        new C5640d(this, this.f19156a.f17890aW, config.m23831a(this.f19156a.f17881aN, this.f19156a.f17890aW)).execute(new String[0]);
    }

    /* renamed from: b */
    public void mo21290b(int i) {
        C5662h a = this.f19156a.mo20762a(Integer.valueOf(this.f19167l[i]), (Context) this);
        this.f19157b = true;
        Intent intent = new Intent();
        intent.putExtra("finalizar", a.f18227b);
        setResult(-1, intent);
        if (this.f19156a.f18045dm != 2) {
            a.f18226a.putExtra("es_root", true);
        }
        startActivity(a.f18226a);
        finish();
    }

    public void onStop() {
        super.onStop();
        if (this.f19157b && !this.f19164i) {
            finish();
        }
    }

    public void adLoaded(String str) {
        this.f19166k.cancel();
        this.f19160e.showAd();
    }

    public void onAdClosed() {
        if (this.f19163h) {
            mo21290b(this.f19165j);
        }
    }

    public void adError(String str) {
        this.f19166k.cancel();
        mo21290b(this.f19165j);
    }

    public void videoEnded() {
        this.f19163h = true;
        config.m23867t(this);
    }

    /* renamed from: z_ */
    public void mo9678z_() {
        this.f19166k.cancel();
        this.f19159d.mo12836a();
    }

    /* renamed from: a */
    public void mo9675a(C3165a aVar) {
        this.f19163h = true;
        config.m23867t(this);
    }

    /* renamed from: A_ */
    public void mo9671A_() {
        if (this.f19163h) {
            mo21290b(this.f19165j);
        }
    }

    /* renamed from: e */
    public void mo9676e() {
        this.f19163h = false;
    }

    /* renamed from: a */
    public void mo9674a(int i) {
        if (!this.f19156a.mo20775a((Context) this, this.f19160e)) {
            this.f19166k.cancel();
            mo21290b(this.f19165j);
        }
    }

    public void onError(C1514Ad ad, AdError adError) {
        this.f19166k.cancel();
        mo21290b(this.f19165j);
    }

    public void onAdLoaded(C1514Ad ad) {
        this.f19166k.cancel();
        this.f19161f.show();
    }

    public void onRewardedVideoCompleted() {
        this.f19163h = true;
        config.m23867t(this);
    }

    public void onRewardedVideoClosed() {
        if (this.f19163h) {
            mo21290b(this.f19165j);
        }
    }

    public void onVideoCompleted() {
        this.f19163h = true;
        config.m23867t(this);
    }

    public void onReceiveAd(C5286Ad ad) {
        this.f19166k.cancel();
        this.f19162g.showAd("REWARDED VIDEO", new AdDisplayListener() {
            public void adClicked(C5286Ad ad) {
            }

            public void adDisplayed(C5286Ad ad) {
            }

            public void adNotDisplayed(C5286Ad ad) {
            }

            public void adHidden(C5286Ad ad) {
                if (t_menu.this.f19163h) {
                    t_menu.this.mo21290b(t_menu.this.f19165j);
                }
            }
        });
    }

    public void onFailedToReceiveAd(C5286Ad ad) {
        this.f19166k.cancel();
        mo21290b(this.f19165j);
    }
}
