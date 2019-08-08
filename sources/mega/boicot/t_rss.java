package mega.boicot;

import android.annotation.TargetApi;
import android.app.ProgressDialog;
import android.app.SearchManager;
import android.app.SearchManager.OnCancelListener;
import android.app.SearchManager.OnDismissListener;
import android.content.Context;
import android.content.Intent;
import android.graphics.Point;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.p017v4.app.FragmentActivity;
import android.view.Display;
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

public class t_rss extends FragmentActivity implements OnClickListener, OnAdClosed, OnAdError, OnAdLoaded, OnVideoEnded, RewardedVideoAdListener, C3167c, VideoListener, AdEventListener, C5599a {

    /* renamed from: A */
    String f19256A;

    /* renamed from: B */
    ListView f19257B;

    /* renamed from: k */
    config f19258k;

    /* renamed from: l */
    boolean f19259l = false;

    /* renamed from: m */
    boolean f19260m = false;

    /* renamed from: n */
    boolean f19261n;

    /* renamed from: o */
    boolean f19262o;

    /* renamed from: p */
    t_rssdetalle_fr f19263p;

    /* renamed from: q */
    Bundle f19264q;

    /* renamed from: r */
    C5602c f19265r;

    /* renamed from: s */
    C3166b f19266s;

    /* renamed from: t */
    RewardedVideo f19267t;

    /* renamed from: u */
    RewardedVideoAd f19268u;

    /* renamed from: v */
    StartAppAd f19269v;

    /* renamed from: w */
    boolean f19270w = false;

    /* renamed from: x */
    boolean f19271x = false;

    /* renamed from: y */
    View f19272y;

    /* renamed from: z */
    ProgressDialog f19273z;

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

    @TargetApi(13)
    public void onCreate(Bundle bundle) {
        int i;
        boolean z;
        this.f19258k = (config) getApplicationContext();
        if (this.f19258k.f17881aN == null) {
            this.f19258k.mo20780b();
        }
        this.f19264q = getIntent().getExtras();
        boolean z2 = true;
        if (bundle == null) {
            this.f19262o = this.f19264q != null && this.f19264q.containsKey("es_root") && this.f19264q.getBoolean("es_root", false);
        } else {
            this.f19262o = bundle.containsKey("es_root") && bundle.getBoolean("es_root", false);
        }
        this.f19256A = config.m23831a(this.f19258k.f17971bz[getIntent().getExtras().getInt("ind")].f18314g, this.f19258k.f17890aW);
        super.onCreate(bundle);
        boolean z3 = this.f19258k.f17971bz[getIntent().getExtras().getInt("ind")].f18312e.contains("youtube.com") || this.f19258k.f17971bz[getIntent().getExtras().getInt("ind")].f18312e.contains("youtu.be");
        this.f19261n = this.f19258k.f17971bz[getIntent().getExtras().getInt("ind")].f18329v == 1;
        Display defaultDisplay = getWindowManager().getDefaultDisplay();
        if (VERSION.SDK_INT >= 13) {
            Point point = new Point();
            defaultDisplay.getSize(point);
            i = point.x;
        } else {
            i = defaultDisplay.getWidth();
        }
        if (this.f19261n || i <= ((int) ((500.0f * getResources().getDisplayMetrics().density) + 0.5f))) {
            setContentView(R.layout.t_rss_v);
            z = true;
        } else {
            setContentView(R.layout.t_rss_h);
            z = false;
        }
        this.f19263p = (t_rssdetalle_fr) mo670f().mo865a((int) R.id.rssdetalle_fr);
        mo2636h();
        if (this.f19258k.f18080q > 0) {
            SearchManager searchManager = (SearchManager) getSystemService("search");
            searchManager.setOnCancelListener(new OnCancelListener() {
                public void onCancel() {
                    t_rss.this.f19259l = false;
                    t_rss.this.setResult(0);
                }
            });
            searchManager.setOnDismissListener(new OnDismissListener() {
                public void onDismiss() {
                    t_rss.this.f19271x = false;
                }
            });
        }
        if (bundle == null) {
            config config = this.f19258k;
            boolean z4 = this.f19264q != null && this.f19264q.containsKey("ad_entrar");
            if (this.f19264q == null || !this.f19264q.containsKey("fb_entrar")) {
                z2 = false;
            }
            config.mo20770a((Context) this, z4, z2);
        }
        if (z) {
            this.f19265r = this.f19258k.mo20760a((Context) this, z3);
        }
        this.f19258k.mo20767a((Context) this, this.f19258k.f18075l, this.f19256A, bundle);
    }

    /* renamed from: a */
    public void mo21352a(String str) {
        if (str == null) {
            return;
        }
        if (this.f19263p != null && this.f19263p.mo641u()) {
            this.f19263p.mo22302b(str);
        } else if (this.f19261n) {
            startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
        } else {
            Intent intent = new Intent(getApplicationContext(), t_rssdetalle.class);
            intent.putExtra("url", str);
            startActivityForResult(intent, 0);
        }
    }

    public void onClick(View view) {
        if ((this.f19258k.f17986cO == null || this.f19258k.f17986cO.equals("")) && ((this.f19258k.f17985cN == null || this.f19258k.f17985cN.equals("")) && ((this.f19258k.f17988cQ == null || this.f19258k.f17988cQ.equals("")) && (this.f19258k.f17989cR == null || this.f19258k.f17989cR.equals(""))))) {
            abrir_secc(view);
            return;
        }
        if (this.f19258k.f17986cO != null && !this.f19258k.f17986cO.equals("")) {
            this.f19267t = new RewardedVideo((Context) this, this.f19258k.f17986cO);
        }
        if (this.f19258k.f17985cN != null && !this.f19258k.f17985cN.equals("")) {
            this.f19266s = C2997g.m10716a(this);
        }
        if (this.f19258k.f17988cQ != null && !this.f19258k.f17988cQ.equals("")) {
            this.f19268u = new RewardedVideoAd(this, this.f19258k.f17988cQ);
        }
        if (this.f19258k.f17989cR != null && !this.f19258k.f17989cR.equals("")) {
            this.f19269v = new StartAppAd(this);
        }
        this.f19273z = new ProgressDialog(this);
        this.f19272y = view;
        if (!this.f19258k.mo20774a((Context) this, view, this.f19256A, this.f19273z, this.f19266s, this.f19267t, this.f19268u, this.f19269v)) {
            abrir_secc(view);
        }
    }

    public void abrir_secc(View view) {
        C5662h a = this.f19258k.mo20761a(view, (Context) this);
        if (a.f18227b) {
            this.f19259l = true;
            Intent intent = new Intent();
            intent.putExtra("finalizar", true);
            intent.putExtra("finalizar_app", a.f18228c);
            setResult(-1, intent);
        }
        if (a.f18229d) {
            startActivityForResult(a.f18226a, 0);
        } else if (a.f18226a != null) {
            if (a.f18227b && this.f19258k.f18045dm != 2) {
                a.f18226a.putExtra("es_root", true);
            }
            this.f19262o = false;
            startActivity(a.f18226a);
        }
        if (this.f19259l && !this.f19271x) {
            finish();
        }
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (this.f19263p == null || !this.f19263p.mo641u()) {
            if (i != 4 || !this.f19262o || this.f19260m || !this.f19258k.f18059ea) {
                return super.onKeyDown(i, keyEvent);
            }
            this.f19260m = true;
            config.m23859l(this);
            return true;
        } else if (this.f19263p.mo22301a(i, keyEvent)) {
            return true;
        } else {
            if (i != 4 || !this.f19262o || this.f19260m || !this.f19258k.f18059ea) {
                return super.onKeyDown(i, keyEvent);
            }
            this.f19260m = true;
            config.m23859l(this);
            return true;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public void mo2636h() {
        int b = this.f19258k.mo20778b((Context) this);
        if (this.f19258k.f18045dm == 1) {
            this.f19257B = (ListView) findViewById(R.id.left_drawer);
            this.f19258k.mo20771a(this.f19257B);
        } else if (this.f19258k.f18045dm == 0) {
            int i = 0;
            for (int i2 = 0; i2 < this.f19258k.f17971bz.length; i2++) {
                if (!this.f19258k.f17971bz[i2].f18333z) {
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
        for (int i3 = 0; i3 < this.f19258k.f17923bD.length; i3++) {
            if (this.f19258k.f17923bD[i3] > 0) {
                findViewById(this.f19258k.f17923bD[i3]).setOnClickListener(this);
            }
        }
    }

    public boolean onSearchRequested() {
        if (this.f19258k.f18080q == 0) {
            return false;
        }
        this.f19259l = true;
        this.f19271x = true;
        return super.onSearchRequested();
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getWindow().setFormat(1);
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("es_root", this.f19262o);
    }

    public void onDestroy() {
        if (!(this.f19258k.f18013cx == 0 || this.f19265r == null || this.f19265r.f17768a == null)) {
            this.f19265r.f17768a.mo12168c();
        }
        if (!(this.f19258k.f18013cx == 0 || this.f19265r == null || this.f19265r.f17769b == null)) {
            this.f19265r.f17769b.destroy();
        }
        if ((this.f19262o && isFinishing()) || config.f17841i) {
            config.m23861n(this);
        }
        super.onDestroy();
    }

    public void onStop() {
        super.onStop();
        if (this.f19259l && !this.f19271x) {
            finish();
        }
    }

    public void onPause() {
        if (!(this.f19258k.f18013cx == 0 || this.f19265r == null || this.f19265r.f17768a == null)) {
            this.f19265r.f17768a.mo12167b();
        }
        super.onPause();
    }

    public void onResume() {
        super.onResume();
        config.m23860m(this);
        if (this.f19258k.f18013cx != 0 && this.f19265r != null && this.f19265r.f17768a != null) {
            this.f19265r.f17768a.mo12165a();
        }
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i2 == -1 && intent != null && intent.hasExtra("finalizar") && intent.getExtras().getBoolean("finalizar")) {
            if (!intent.getExtras().getBoolean("finalizar_app")) {
                this.f19262o = false;
            }
            setResult(-1, intent);
            finish();
        }
    }

    public void adLoaded(String str) {
        this.f19273z.cancel();
        this.f19267t.showAd();
    }

    public void onAdClosed() {
        if (this.f19270w) {
            abrir_secc(this.f19272y);
        }
    }

    public void adError(String str) {
        this.f19273z.cancel();
        abrir_secc(this.f19272y);
    }

    public void videoEnded() {
        this.f19270w = true;
        config.m23867t(this);
    }

    /* renamed from: z_ */
    public void mo9678z_() {
        this.f19273z.cancel();
        this.f19266s.mo12836a();
    }

    /* renamed from: a */
    public void mo9675a(C3165a aVar) {
        this.f19270w = true;
        config.m23867t(this);
    }

    /* renamed from: A_ */
    public void mo9671A_() {
        if (this.f19270w) {
            abrir_secc(this.f19272y);
        }
    }

    /* renamed from: e */
    public void mo9676e() {
        this.f19270w = false;
    }

    /* renamed from: a */
    public void mo9674a(int i) {
        if (!this.f19258k.mo20775a((Context) this, this.f19267t)) {
            this.f19273z.cancel();
            abrir_secc(this.f19272y);
        }
    }

    public void onError(C1514Ad ad, AdError adError) {
        this.f19273z.cancel();
        abrir_secc(this.f19272y);
    }

    public void onAdLoaded(C1514Ad ad) {
        this.f19273z.cancel();
        this.f19268u.show();
    }

    public void onRewardedVideoCompleted() {
        this.f19270w = true;
        config.m23867t(this);
    }

    public void onRewardedVideoClosed() {
        if (this.f19270w) {
            abrir_secc(this.f19272y);
        }
    }

    public void onVideoCompleted() {
        this.f19270w = true;
        config.m23867t(this);
    }

    public void onReceiveAd(C5286Ad ad) {
        this.f19273z.cancel();
        this.f19269v.showAd("REWARDED VIDEO", new AdDisplayListener() {
            public void adClicked(C5286Ad ad) {
            }

            public void adDisplayed(C5286Ad ad) {
            }

            public void adNotDisplayed(C5286Ad ad) {
            }

            public void adHidden(C5286Ad ad) {
                if (t_rss.this.f19270w) {
                    t_rss.this.abrir_secc(t_rss.this.f19272y);
                }
            }
        });
    }

    public void onFailedToReceiveAd(C5286Ad ad) {
        this.f19273z.cancel();
        abrir_secc(this.f19272y);
    }
}
