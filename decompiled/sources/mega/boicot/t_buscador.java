package mega.boicot;

import android.annotation.TargetApi;
import android.app.ProgressDialog;
import android.app.SearchManager;
import android.app.SearchManager.OnCancelListener;
import android.app.SearchManager.OnDismissListener;
import android.content.Context;
import android.content.Intent;
import android.graphics.Point;
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
import mega.boicot.t_buscador_fr.C5745a;

public class t_buscador extends FragmentActivity implements OnClickListener, OnAdClosed, OnAdError, OnAdLoaded, OnVideoEnded, RewardedVideoAdListener, C3167c, VideoListener, AdEventListener, C5599a, C5745a {

    /* renamed from: A */
    ListView f18539A;

    /* renamed from: k */
    config f18540k;

    /* renamed from: l */
    boolean f18541l = false;

    /* renamed from: m */
    boolean f18542m = false;

    /* renamed from: n */
    boolean f18543n;

    /* renamed from: o */
    t_detalle_fr f18544o;

    /* renamed from: p */
    Bundle f18545p;

    /* renamed from: q */
    C5602c f18546q;

    /* renamed from: r */
    C3166b f18547r;

    /* renamed from: s */
    RewardedVideo f18548s;

    /* renamed from: t */
    RewardedVideoAd f18549t;

    /* renamed from: u */
    StartAppAd f18550u;

    /* renamed from: v */
    boolean f18551v = false;

    /* renamed from: w */
    boolean f18552w = false;

    /* renamed from: x */
    String f18553x;

    /* renamed from: y */
    View f18554y;

    /* renamed from: z */
    ProgressDialog f18555z;

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
        this.f18540k = (config) getApplicationContext();
        if (this.f18540k.f17881aN == null) {
            this.f18540k.mo20780b();
        }
        this.f18545p = getIntent().getExtras();
        boolean z2 = true;
        if (bundle == null) {
            this.f18543n = this.f18545p != null && this.f18545p.containsKey("es_root") && this.f18545p.getBoolean("es_root", false);
        } else {
            this.f18543n = bundle.containsKey("es_root") && bundle.getBoolean("es_root", false);
        }
        this.f18553x = config.m23831a(this.f18540k.f17951bf, this.f18540k.f17954bi);
        super.onCreate(bundle);
        Display defaultDisplay = getWindowManager().getDefaultDisplay();
        if (VERSION.SDK_INT >= 13) {
            Point point = new Point();
            defaultDisplay.getSize(point);
            i = point.x;
        } else {
            i = defaultDisplay.getWidth();
        }
        if (i > ((int) ((500.0f * getResources().getDisplayMetrics().density) + 0.5f))) {
            setContentView(R.layout.t_buscador_h);
            z = false;
        } else {
            setContentView(R.layout.t_buscador_v);
            z = true;
        }
        this.f18544o = (t_detalle_fr) mo670f().mo865a((int) R.id.detalle_fr);
        mo2636h();
        if (this.f18540k.f18080q > 0) {
            SearchManager searchManager = (SearchManager) getSystemService("search");
            searchManager.setOnCancelListener(new OnCancelListener() {
                public void onCancel() {
                    t_buscador.this.f18541l = false;
                    t_buscador.this.setResult(0);
                }
            });
            searchManager.setOnDismissListener(new OnDismissListener() {
                public void onDismiss() {
                    t_buscador.this.f18552w = false;
                }
            });
        }
        if (bundle == null) {
            config config = this.f18540k;
            boolean z3 = this.f18545p != null && this.f18545p.containsKey("ad_entrar");
            if (this.f18545p == null || !this.f18545p.containsKey("fb_entrar")) {
                z2 = false;
            }
            config.mo20770a((Context) this, z3, z2);
        }
        if (z) {
            this.f18546q = this.f18540k.mo20760a((Context) this, false);
        }
    }

    /* renamed from: a */
    public void mo20994a(String str, long j) {
        if (this.f18544o == null || !this.f18544o.mo641u()) {
            Intent intent = new Intent(getApplicationContext(), t_detalle.class);
            intent.putExtra("url", str);
            intent.putExtra("idprod", j);
            startActivityForResult(intent, 0);
            return;
        }
        this.f18544o.mo22198a(str, j);
    }

    public void onClick(View view) {
        if ((this.f18540k.f17986cO == null || this.f18540k.f17986cO.equals("")) && ((this.f18540k.f17985cN == null || this.f18540k.f17985cN.equals("")) && ((this.f18540k.f17988cQ == null || this.f18540k.f17988cQ.equals("")) && (this.f18540k.f17989cR == null || this.f18540k.f17989cR.equals(""))))) {
            abrir_secc(view);
            return;
        }
        if (this.f18540k.f17986cO != null && !this.f18540k.f17986cO.equals("")) {
            this.f18548s = new RewardedVideo((Context) this, this.f18540k.f17986cO);
        }
        if (this.f18540k.f17985cN != null && !this.f18540k.f17985cN.equals("")) {
            this.f18547r = C2997g.m10716a(this);
        }
        if (this.f18540k.f17988cQ != null && !this.f18540k.f17988cQ.equals("")) {
            this.f18549t = new RewardedVideoAd(this, this.f18540k.f17988cQ);
        }
        if (this.f18540k.f17989cR != null && !this.f18540k.f17989cR.equals("")) {
            this.f18550u = new StartAppAd(this);
        }
        this.f18555z = new ProgressDialog(this);
        this.f18554y = view;
        if (!this.f18540k.mo20774a((Context) this, view, this.f18553x, this.f18555z, this.f18547r, this.f18548s, this.f18549t, this.f18550u)) {
            abrir_secc(view);
        }
    }

    public void abrir_secc(View view) {
        C5662h a = this.f18540k.mo20761a(view, (Context) this);
        if (a.f18227b) {
            this.f18541l = true;
            Intent intent = new Intent();
            intent.putExtra("finalizar", true);
            intent.putExtra("finalizar_app", a.f18228c);
            setResult(-1, intent);
        }
        if (a.f18229d) {
            startActivityForResult(a.f18226a, 0);
        } else if (a.f18226a != null) {
            if (a.f18227b && this.f18540k.f18045dm != 2) {
                a.f18226a.putExtra("es_root", true);
            }
            this.f18543n = false;
            startActivity(a.f18226a);
        }
        if (this.f18541l && !this.f18552w) {
            finish();
        }
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (this.f18544o == null || !this.f18544o.mo641u()) {
            if (i != 4 || !this.f18543n || this.f18542m || !this.f18540k.f18059ea) {
                return super.onKeyDown(i, keyEvent);
            }
            this.f18542m = true;
            config.m23859l(this);
            return true;
        } else if (this.f18544o.mo22200a(i, keyEvent)) {
            return true;
        } else {
            if (i != 4 || !this.f18543n || this.f18542m || !this.f18540k.f18059ea) {
                return super.onKeyDown(i, keyEvent);
            }
            this.f18542m = true;
            config.m23859l(this);
            return true;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public void mo2636h() {
        int b = this.f18540k.mo20778b((Context) this);
        if (this.f18540k.f18045dm == 1) {
            this.f18539A = (ListView) findViewById(R.id.left_drawer);
            this.f18540k.mo20771a(this.f18539A);
        } else if (this.f18540k.f18045dm == 0) {
            int i = 0;
            for (int i2 = 0; i2 < this.f18540k.f17971bz.length; i2++) {
                if (!this.f18540k.f17971bz[i2].f18333z) {
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
        for (int i3 = 0; i3 < this.f18540k.f17923bD.length; i3++) {
            if (this.f18540k.f17923bD[i3] > 0) {
                findViewById(this.f18540k.f17923bD[i3]).setOnClickListener(this);
            }
        }
    }

    public boolean onSearchRequested() {
        if (this.f18540k.f18080q == 0) {
            return false;
        }
        this.f18541l = true;
        this.f18552w = true;
        return super.onSearchRequested();
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getWindow().setFormat(1);
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("es_root", this.f18543n);
    }

    public void onDestroy() {
        if (!(this.f18540k.f18013cx == 0 || this.f18546q == null || this.f18546q.f17768a == null)) {
            this.f18546q.f17768a.mo12168c();
        }
        if (!(this.f18540k.f18013cx == 0 || this.f18546q == null || this.f18546q.f17769b == null)) {
            this.f18546q.f17769b.destroy();
        }
        if ((this.f18543n && isFinishing()) || config.f17841i) {
            config.m23861n(this);
        }
        super.onDestroy();
    }

    public void onStop() {
        super.onStop();
        if (this.f18541l && !this.f18552w) {
            finish();
        }
    }

    public void onPause() {
        if (!(this.f18540k.f18013cx == 0 || this.f18546q == null || this.f18546q.f17768a == null)) {
            this.f18546q.f17768a.mo12167b();
        }
        super.onPause();
    }

    public void onResume() {
        super.onResume();
        config.m23860m(this);
        if (this.f18540k.f18013cx != 0 && this.f18546q != null && this.f18546q.f17768a != null) {
            this.f18546q.f17768a.mo12165a();
        }
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i2 == -1 && intent != null && intent.hasExtra("finalizar") && intent.getExtras().getBoolean("finalizar")) {
            if (!intent.getExtras().getBoolean("finalizar_app")) {
                this.f18543n = false;
            }
            setResult(-1, intent);
            finish();
        }
    }

    public void adLoaded(String str) {
        this.f18555z.cancel();
        this.f18548s.showAd();
    }

    public void onAdClosed() {
        if (this.f18551v) {
            abrir_secc(this.f18554y);
        }
    }

    public void adError(String str) {
        this.f18555z.cancel();
        abrir_secc(this.f18554y);
    }

    public void videoEnded() {
        this.f18551v = true;
        config.m23867t(this);
    }

    /* renamed from: z_ */
    public void mo9678z_() {
        this.f18555z.cancel();
        this.f18547r.mo12836a();
    }

    /* renamed from: a */
    public void mo9675a(C3165a aVar) {
        this.f18551v = true;
        config.m23867t(this);
    }

    /* renamed from: A_ */
    public void mo9671A_() {
        if (this.f18551v) {
            abrir_secc(this.f18554y);
        }
    }

    /* renamed from: e */
    public void mo9676e() {
        this.f18551v = false;
    }

    /* renamed from: a */
    public void mo9674a(int i) {
        if (!this.f18540k.mo20775a((Context) this, this.f18548s)) {
            this.f18555z.cancel();
            abrir_secc(this.f18554y);
        }
    }

    public void onError(C1514Ad ad, AdError adError) {
        this.f18555z.cancel();
        abrir_secc(this.f18554y);
    }

    public void onAdLoaded(C1514Ad ad) {
        this.f18555z.cancel();
        this.f18549t.show();
    }

    public void onRewardedVideoCompleted() {
        this.f18551v = true;
        config.m23867t(this);
    }

    public void onRewardedVideoClosed() {
        if (this.f18551v) {
            abrir_secc(this.f18554y);
        }
    }

    public void onVideoCompleted() {
        this.f18551v = true;
        config.m23867t(this);
    }

    public void onReceiveAd(C5286Ad ad) {
        this.f18555z.cancel();
        this.f18550u.showAd("REWARDED VIDEO", new AdDisplayListener() {
            public void adClicked(C5286Ad ad) {
            }

            public void adDisplayed(C5286Ad ad) {
            }

            public void adNotDisplayed(C5286Ad ad) {
            }

            public void adHidden(C5286Ad ad) {
                if (t_buscador.this.f18551v) {
                    t_buscador.this.abrir_secc(t_buscador.this.f18554y);
                }
            }
        });
    }

    public void onFailedToReceiveAd(C5286Ad ad) {
        this.f18555z.cancel();
        abrir_secc(this.f18554y);
    }
}
