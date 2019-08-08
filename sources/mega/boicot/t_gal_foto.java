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
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.GradientDrawable.Orientation;
import android.net.Uri;
import android.os.Bundle;
import android.support.p017v4.app.C0236a;
import android.support.p017v4.content.FileProvider;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
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
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class t_gal_foto extends Activity implements OnClickListener, OnAdClosed, OnAdError, OnAdLoaded, OnVideoEnded, RewardedVideoAdListener, C3167c, VideoListener, AdEventListener, C5599a {

    /* renamed from: a */
    config f20596a;

    /* renamed from: b */
    Bundle f20597b;

    /* renamed from: c */
    boolean f20598c = false;

    /* renamed from: d */
    boolean f20599d;

    /* renamed from: e */
    boolean f20600e = true;

    /* renamed from: f */
    String f20601f;

    /* renamed from: g */
    WebView f20602g;

    /* renamed from: h */
    C5602c f20603h;

    /* renamed from: i */
    C3166b f20604i;

    /* renamed from: j */
    RewardedVideo f20605j;

    /* renamed from: k */
    RewardedVideoAd f20606k;

    /* renamed from: l */
    StartAppAd f20607l;

    /* renamed from: m */
    boolean f20608m = false;

    /* renamed from: n */
    boolean f20609n = false;

    /* renamed from: o */
    View f20610o;

    /* renamed from: p */
    ProgressDialog f20611p;

    /* renamed from: q */
    ListView f20612q;

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
        this.f20596a = (config) getApplicationContext();
        if (this.f20596a.f17881aN == null) {
            this.f20596a.mo20780b();
        }
        this.f20601f = config.m23831a("FFFFFFFF", this.f20596a.f17890aW);
        super.onCreate(bundle);
        setContentView(R.layout.t_gal_foto);
        this.f20597b = getIntent().getExtras();
        if (bundle == null) {
            this.f20599d = this.f20597b != null && this.f20597b.containsKey("es_root") && this.f20597b.getBoolean("es_root", false);
        } else {
            this.f20599d = bundle.containsKey("es_root") && bundle.getBoolean("es_root", false);
        }
        mo22227g();
        if (this.f20596a.f18080q > 0) {
            SearchManager searchManager = (SearchManager) getSystemService("search");
            searchManager.setOnCancelListener(new OnCancelListener() {
                public void onCancel() {
                    t_gal_foto.this.f20598c = false;
                    t_gal_foto.this.setResult(0);
                }
            });
            searchManager.setOnDismissListener(new OnDismissListener() {
                public void onDismiss() {
                    t_gal_foto.this.f20609n = false;
                }
            });
        }
        this.f20603h = this.f20596a.mo20760a((Context) this, false);
        findViewById(R.id.iv_cerrar).setOnClickListener(this);
        this.f20602g = (WebView) findViewById(R.id.webview);
        if (this.f20597b.getString("url").startsWith("file://")) {
            registerForContextMenu(this.f20602g);
            String str = this.f20596a.f17971bz[this.f20596a.f18075l].f18314g;
            String str2 = this.f20596a.f17971bz[this.f20596a.f18075l].f18315h;
            if (this.f20597b.containsKey("bg1")) {
                str = this.f20597b.getString("bg1");
                str2 = this.f20597b.getString("bg2");
            }
            if (!str.equals("")) {
                Orientation orientation = Orientation.TOP_BOTTOM;
                StringBuilder sb = new StringBuilder();
                sb.append("#");
                sb.append(str);
                StringBuilder sb2 = new StringBuilder();
                sb2.append("#");
                sb2.append(str2);
                findViewById(R.id.ll_princ).setBackgroundDrawable(new GradientDrawable(orientation, new int[]{Color.parseColor(sb.toString()), Color.parseColor(sb2.toString())}));
                this.f20602g.setBackgroundColor(0);
            }
        }
        this.f20602g.setWebChromeClient(new WebChromeClient() {
        });
        this.f20602g.getSettings().setBuiltInZoomControls(true);
        this.f20602g.getSettings().setSupportZoom(true);
        this.f20602g.setOnTouchListener(new OnTouchListener() {
            public boolean onTouch(View view, MotionEvent motionEvent) {
                switch (motionEvent.getAction()) {
                    case 0:
                    case 1:
                        if (!view.hasFocus()) {
                            view.requestFocus();
                            break;
                        }
                        break;
                }
                return false;
            }
        });
        this.f20602g.getSettings().setUseWideViewPort(true);
        this.f20602g.getSettings().setLoadWithOverviewMode(true);
        this.f20602g.setWebViewClient(new WebViewClient() {
            public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
                boolean z;
                if (!t_gal_foto.this.f20598c && !t_gal_foto.this.isFinishing() && !t_gal_foto.this.f20597b.getString("url").contains("youtube.com") && !t_gal_foto.this.f20597b.getString("url").contains("youtu.be")) {
                    boolean z2 = false;
                    if (t_gal_foto.this.f20600e) {
                        boolean z3 = true;
                        z = t_gal_foto.this.f20597b != null && t_gal_foto.this.f20597b.containsKey("ad_entrar");
                        if (t_gal_foto.this.f20597b == null || !t_gal_foto.this.f20597b.containsKey("fb_entrar")) {
                            z3 = false;
                        }
                        t_gal_foto.this.f20600e = false;
                        z2 = z3;
                    } else {
                        z = false;
                    }
                    t_gal_foto.this.f20596a.mo20770a((Context) t_gal_foto.this, z, z2);
                }
            }
        });
        if (bundle == null) {
            this.f20602g.loadUrl(this.f20597b.getString("url"));
        }
        String trim = this.f20597b.getString("descr").trim();
        if (!trim.equals("")) {
            ((TextView) findViewById(R.id.tv_descr)).setText(trim);
            findViewById(R.id.ll_descr).setVisibility(0);
        }
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (i == 104 && config.m23853d() && iArr.length > 0 && strArr[0].equals("android.permission.WRITE_EXTERNAL_STORAGE") && iArr[0] == 0 && getPackageManager().checkPermission("android.permission.WRITE_EXTERNAL_STORAGE", getPackageName()) == 0) {
            config.m23841a(this.f20597b.getString("url"), (Context) this);
        }
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenuInfo contextMenuInfo) {
        super.onCreateContextMenu(contextMenu, view, contextMenuInfo);
        getMenuInflater().inflate(R.menu.m3, contextMenu);
        if (config.m23853d()) {
            MenuItem findItem = contextMenu.findItem(R.id.guardar);
            StringBuilder sb = new StringBuilder();
            sb.append(findItem.getTitle());
            sb.append("");
            String sb2 = sb.toString();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(sb2.substring(0, 1).toUpperCase());
            sb3.append(sb2.substring(1).toLowerCase());
            findItem.setTitle(sb3.toString());
            return;
        }
        contextMenu.removeItem(R.id.guardar);
    }

    public boolean onContextItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        boolean z = false;
        if (itemId == R.id.compartir) {
            Options options = new Options();
            options.inPreferredConfig = Config.ARGB_8888;
            Bitmap decodeFile = BitmapFactory.decodeFile(this.f20597b.getString("url").replace("file://", ""), options);
            try {
                File file = new File(getCacheDir(), "images");
                file.mkdirs();
                StringBuilder sb = new StringBuilder();
                sb.append(file);
                sb.append("/temporal.png");
                FileOutputStream fileOutputStream = new FileOutputStream(sb.toString());
                decodeFile.compress(CompressFormat.PNG, 100, fileOutputStream);
                fileOutputStream.close();
                z = true;
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (z) {
                Uri a = FileProvider.m1223a(this, "mega.boicot.fileprovider", new File(new File(getCacheDir(), "images"), "temporal.png"));
                if (a != null) {
                    Intent intent = new Intent();
                    intent.setAction("android.intent.action.SEND");
                    intent.addFlags(1);
                    intent.setType(getContentResolver().getType(a));
                    intent.putExtra("android.intent.extra.STREAM", a);
                    startActivity(Intent.createChooser(intent, getResources().getString(R.string.compartir)));
                }
            }
            return true;
        } else if (itemId != R.id.guardar) {
            return super.onContextItemSelected(menuItem);
        } else {
            if (!config.m23853d() || getPackageManager().checkPermission("android.permission.WRITE_EXTERNAL_STORAGE", getPackageName()) != 0) {
                C0236a.m717a(this, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 104);
            } else {
                config.m23841a(this.f20597b.getString("url"), (Context) this);
            }
            return true;
        }
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return super.onKeyDown(i, keyEvent);
        }
        if (this.f20602g.canGoBack()) {
            this.f20602g.goBack();
            return true;
        }
        mo22226f();
        return true;
    }

    public boolean onSearchRequested() {
        if (this.f20596a.f18080q == 0) {
            return false;
        }
        this.f20598c = true;
        this.f20609n = true;
        return super.onSearchRequested();
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getWindow().setFormat(1);
    }

    /* renamed from: f */
    public void mo22226f() {
        finish();
    }

    public void onClick(View view) {
        if (view.getId() == R.id.iv_cerrar) {
            mo22226f();
        } else if ((this.f20596a.f17986cO == null || this.f20596a.f17986cO.equals("")) && ((this.f20596a.f17985cN == null || this.f20596a.f17985cN.equals("")) && ((this.f20596a.f17988cQ == null || this.f20596a.f17988cQ.equals("")) && (this.f20596a.f17989cR == null || this.f20596a.f17989cR.equals(""))))) {
            abrir_secc(view);
        } else {
            if (this.f20596a.f17986cO != null && !this.f20596a.f17986cO.equals("")) {
                this.f20605j = new RewardedVideo((Context) this, this.f20596a.f17986cO);
            }
            if (this.f20596a.f17985cN != null && !this.f20596a.f17985cN.equals("")) {
                this.f20604i = C2997g.m10716a(this);
            }
            if (this.f20596a.f17988cQ != null && !this.f20596a.f17988cQ.equals("")) {
                this.f20606k = new RewardedVideoAd(this, this.f20596a.f17988cQ);
            }
            if (this.f20596a.f17989cR != null && !this.f20596a.f17989cR.equals("")) {
                this.f20607l = new StartAppAd(this);
            }
            this.f20611p = new ProgressDialog(this);
            this.f20610o = view;
            if (!this.f20596a.mo20774a((Context) this, view, this.f20601f, this.f20611p, this.f20604i, this.f20605j, this.f20606k, this.f20607l)) {
                abrir_secc(view);
            }
        }
    }

    public void abrir_secc(View view) {
        C5662h a = this.f20596a.mo20761a(view, (Context) this);
        if (a.f18227b) {
            this.f20598c = true;
            Intent intent = new Intent();
            intent.putExtra("finalizar", true);
            intent.putExtra("finalizar_app", a.f18228c);
            setResult(-1, intent);
        }
        if (a.f18229d) {
            startActivityForResult(a.f18226a, 0);
        } else if (a.f18226a != null) {
            if (a.f18227b && this.f20596a.f18045dm != 2) {
                a.f18226a.putExtra("es_root", true);
            }
            this.f20599d = false;
            startActivity(a.f18226a);
        }
        if (this.f20598c && !this.f20609n) {
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i2 == -1 && intent != null && intent.hasExtra("finalizar") && intent.getExtras().getBoolean("finalizar")) {
            if (!intent.getExtras().getBoolean("finalizar_app")) {
                this.f20599d = false;
            }
            setResult(-1, intent);
            finish();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public void mo22227g() {
        int b = this.f20596a.mo20778b((Context) this);
        if (this.f20596a.f18045dm == 1) {
            this.f20612q = (ListView) findViewById(R.id.left_drawer);
            this.f20596a.mo20771a(this.f20612q);
        } else if (this.f20596a.f18045dm == 0) {
            int i = 0;
            for (int i2 = 0; i2 < this.f20596a.f17971bz.length; i2++) {
                if (!this.f20596a.f17971bz[i2].f18333z) {
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
        for (int i3 = 0; i3 < this.f20596a.f17923bD.length; i3++) {
            if (this.f20596a.f17923bD[i3] > 0) {
                findViewById(this.f20596a.f17923bD[i3]).setOnClickListener(this);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.f20602g.saveState(bundle);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        this.f20602g.restoreState(bundle);
    }

    public void onStop() {
        super.onStop();
        if (this.f20598c && !this.f20609n) {
            finish();
        }
    }

    public void onPause() {
        if (!(this.f20596a.f18013cx == 0 || this.f20603h == null || this.f20603h.f17768a == null)) {
            this.f20603h.f17768a.mo12167b();
        }
        super.onPause();
    }

    public void onResume() {
        super.onResume();
        config.m23860m(this);
        if (!(this.f20596a.f18013cx == 0 || this.f20603h == null || this.f20603h.f17768a == null)) {
            this.f20603h.f17768a.mo12165a();
        }
        this.f20602g.onResume();
    }

    public void onDestroy() {
        if (!(this.f20596a.f18013cx == 0 || this.f20603h == null || this.f20603h.f17768a == null)) {
            this.f20603h.f17768a.mo12168c();
        }
        if (!(this.f20596a.f18013cx == 0 || this.f20603h == null || this.f20603h.f17769b == null)) {
            this.f20603h.f17769b.destroy();
        }
        if ((this.f20599d && isFinishing()) || config.f17841i) {
            config.m23861n(this);
        }
        super.onDestroy();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ((LinearLayout) findViewById(R.id.ll_princ)).removeViewAt(0);
        mo22227g();
        ((LinearLayout) findViewById(R.id.ll_ad)).removeAllViews();
        if (!(this.f20603h == null || this.f20603h.f17768a == null)) {
            try {
                this.f20603h.f17768a.mo12168c();
            } catch (Exception unused) {
            }
        }
        if (!(this.f20603h == null || this.f20603h.f17769b == null)) {
            try {
                this.f20603h.f17769b.destroy();
            } catch (Exception unused2) {
            }
        }
        this.f20603h = this.f20596a.mo20760a((Context) this, false);
    }

    public void adLoaded(String str) {
        this.f20611p.cancel();
        this.f20605j.showAd();
    }

    public void onAdClosed() {
        if (this.f20608m) {
            abrir_secc(this.f20610o);
        }
    }

    public void adError(String str) {
        this.f20611p.cancel();
        abrir_secc(this.f20610o);
    }

    public void videoEnded() {
        this.f20608m = true;
        config.m23867t(this);
    }

    /* renamed from: z_ */
    public void mo9678z_() {
        this.f20611p.cancel();
        this.f20604i.mo12836a();
    }

    /* renamed from: a */
    public void mo9675a(C3165a aVar) {
        this.f20608m = true;
        config.m23867t(this);
    }

    /* renamed from: A_ */
    public void mo9671A_() {
        if (this.f20608m) {
            abrir_secc(this.f20610o);
        }
    }

    /* renamed from: e */
    public void mo9676e() {
        this.f20608m = false;
    }

    /* renamed from: a */
    public void mo9674a(int i) {
        if (!this.f20596a.mo20775a((Context) this, this.f20605j)) {
            this.f20611p.cancel();
            abrir_secc(this.f20610o);
        }
    }

    public void onError(C1514Ad ad, AdError adError) {
        this.f20611p.cancel();
        abrir_secc(this.f20610o);
    }

    public void onAdLoaded(C1514Ad ad) {
        this.f20611p.cancel();
        this.f20606k.show();
    }

    public void onRewardedVideoCompleted() {
        this.f20608m = true;
        config.m23867t(this);
    }

    public void onRewardedVideoClosed() {
        if (this.f20608m) {
            abrir_secc(this.f20610o);
        }
    }

    public void onVideoCompleted() {
        this.f20608m = true;
        config.m23867t(this);
    }

    public void onReceiveAd(C5286Ad ad) {
        this.f20611p.cancel();
        this.f20607l.showAd("REWARDED VIDEO", new AdDisplayListener() {
            public void adClicked(C5286Ad ad) {
            }

            public void adDisplayed(C5286Ad ad) {
            }

            public void adNotDisplayed(C5286Ad ad) {
            }

            public void adHidden(C5286Ad ad) {
                if (t_gal_foto.this.f20608m) {
                    t_gal_foto.this.abrir_secc(t_gal_foto.this.f20610o);
                }
            }
        });
    }

    public void onFailedToReceiveAd(C5286Ad ad) {
        this.f20611p.cancel();
        abrir_secc(this.f20610o);
    }
}
