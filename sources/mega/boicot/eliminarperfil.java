package mega.boicot;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.app.ProgressDialog;
import android.app.SearchManager;
import android.app.SearchManager.OnCancelListener;
import android.app.SearchManager.OnDismissListener;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnShowListener;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.GradientDrawable.Orientation;
import android.os.AsyncTask;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ListView;
import android.widget.ProgressBar;
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

public class eliminarperfil extends Activity implements OnClickListener, OnAdClosed, OnAdError, OnAdLoaded, OnVideoEnded, RewardedVideoAdListener, C3167c, VideoListener, AdEventListener, C5599a {

    /* renamed from: a */
    int f19752a;

    /* renamed from: b */
    int f19753b;

    /* renamed from: c */
    config f19754c;

    /* renamed from: d */
    boolean f19755d = false;

    /* renamed from: e */
    boolean f19756e;

    /* renamed from: f */
    boolean f19757f;

    /* renamed from: g */
    boolean f19758g;

    /* renamed from: h */
    C5602c f19759h;

    /* renamed from: i */
    C3166b f19760i;

    /* renamed from: j */
    RewardedVideo f19761j;

    /* renamed from: k */
    RewardedVideoAd f19762k;

    /* renamed from: l */
    StartAppAd f19763l;

    /* renamed from: m */
    boolean f19764m = false;

    /* renamed from: n */
    boolean f19765n = false;

    /* renamed from: o */
    View f19766o;

    /* renamed from: p */
    ProgressDialog f19767p;

    /* renamed from: q */
    String f19768q;

    /* renamed from: r */
    ListView f19769r;

    /* renamed from: s */
    SharedPreferences f19770s;

    /* renamed from: t */
    ProgressDialog f19771t;

    /* renamed from: u */
    Bundle f19772u;

    /* renamed from: mega.boicot.eliminarperfil$a */
    private class C5994a extends AsyncTask<String, Void, Byte> {
        private C5994a() {
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Can't wrap try/catch for region: R(6:23|22|25|26|(1:28)|29) */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x00b2, code lost:
            r7 = th;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:0x00c0, code lost:
            r0.disconnect();
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x00b4 */
        /* JADX WARNING: Removed duplicated region for block: B:28:0x00ba  */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x00c0  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Byte doInBackground(java.lang.String... r7) {
            /*
                r6 = this;
                r7 = 2
                r0 = 0
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00b4 }
                r1.<init>()     // Catch:{ Exception -> 0x00b4 }
                java.lang.String r2 = "http://"
                r1.append(r2)     // Catch:{ Exception -> 0x00b4 }
                java.lang.String r2 = mega.boicot.config.f17839g     // Catch:{ Exception -> 0x00b4 }
                r1.append(r2)     // Catch:{ Exception -> 0x00b4 }
                java.lang.String r2 = "/srv/eliminar_perfil.php?idusu="
                r1.append(r2)     // Catch:{ Exception -> 0x00b4 }
                mega.boicot.eliminarperfil r2 = mega.boicot.eliminarperfil.this     // Catch:{ Exception -> 0x00b4 }
                int r2 = r2.f19752a     // Catch:{ Exception -> 0x00b4 }
                r1.append(r2)     // Catch:{ Exception -> 0x00b4 }
                java.lang.String r2 = "&idapp="
                r1.append(r2)     // Catch:{ Exception -> 0x00b4 }
                r2 = 718963(0xaf873, float:1.007482E-39)
                r1.append(r2)     // Catch:{ Exception -> 0x00b4 }
                java.lang.String r2 = "&c="
                r1.append(r2)     // Catch:{ Exception -> 0x00b4 }
                mega.boicot.eliminarperfil r2 = mega.boicot.eliminarperfil.this     // Catch:{ Exception -> 0x00b4 }
                android.content.SharedPreferences r2 = r2.f19770s     // Catch:{ Exception -> 0x00b4 }
                java.lang.String r3 = "cod"
                java.lang.String r4 = ""
                java.lang.String r2 = r2.getString(r3, r4)     // Catch:{ Exception -> 0x00b4 }
                r1.append(r2)     // Catch:{ Exception -> 0x00b4 }
                java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x00b4 }
                java.net.URL r2 = new java.net.URL     // Catch:{ Exception -> 0x00b4 }
                r2.<init>(r1)     // Catch:{ Exception -> 0x00b4 }
                java.net.URLConnection r1 = r2.openConnection()     // Catch:{ Exception -> 0x00b4 }
                java.net.HttpURLConnection r1 = (java.net.HttpURLConnection) r1     // Catch:{ Exception -> 0x00b4 }
                r0 = 1
                r1.setDoInput(r0)     // Catch:{ Exception -> 0x00b0, all -> 0x00ad }
                r2 = 10000(0x2710, float:1.4013E-41)
                r1.setConnectTimeout(r2)     // Catch:{ Exception -> 0x00b0, all -> 0x00ad }
                r1.setReadTimeout(r2)     // Catch:{ Exception -> 0x00b0, all -> 0x00ad }
                java.lang.String r2 = "User-Agent"
                java.lang.String r3 = "Android Vinebre Software"
                r1.setRequestProperty(r2, r3)     // Catch:{ Exception -> 0x00b0, all -> 0x00ad }
                java.io.InputStream r2 = r1.getInputStream()     // Catch:{ Exception -> 0x00b0, all -> 0x00ad }
                java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch:{ Exception -> 0x00b0, all -> 0x00ad }
                java.io.InputStreamReader r4 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x00b0, all -> 0x00ad }
                r4.<init>(r2)     // Catch:{ Exception -> 0x00b0, all -> 0x00ad }
                r3.<init>(r4)     // Catch:{ Exception -> 0x00b0, all -> 0x00ad }
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00b0, all -> 0x00ad }
                r2.<init>()     // Catch:{ Exception -> 0x00b0, all -> 0x00ad }
            L_0x0071:
                java.lang.String r4 = r3.readLine()     // Catch:{ Exception -> 0x00b0, all -> 0x00ad }
                if (r4 == 0) goto L_0x008c
                java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00b0, all -> 0x00ad }
                r5.<init>()     // Catch:{ Exception -> 0x00b0, all -> 0x00ad }
                r5.append(r4)     // Catch:{ Exception -> 0x00b0, all -> 0x00ad }
                java.lang.String r4 = "\n"
                r5.append(r4)     // Catch:{ Exception -> 0x00b0, all -> 0x00ad }
                java.lang.String r4 = r5.toString()     // Catch:{ Exception -> 0x00b0, all -> 0x00ad }
                r2.append(r4)     // Catch:{ Exception -> 0x00b0, all -> 0x00ad }
                goto L_0x0071
            L_0x008c:
                java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x00b0, all -> 0x00ad }
                java.lang.String r3 = "ANDROID:OK"
                int r2 = r2.indexOf(r3)     // Catch:{ Exception -> 0x00b0, all -> 0x00ad }
                r3 = -1
                if (r2 == r3) goto L_0x00a3
                java.lang.Byte r0 = java.lang.Byte.valueOf(r0)     // Catch:{ Exception -> 0x00b0, all -> 0x00ad }
                if (r1 == 0) goto L_0x00a2
                r1.disconnect()
            L_0x00a2:
                return r0
            L_0x00a3:
                java.lang.Byte r0 = java.lang.Byte.valueOf(r7)     // Catch:{ Exception -> 0x00b0, all -> 0x00ad }
                if (r1 == 0) goto L_0x00ac
                r1.disconnect()
            L_0x00ac:
                return r0
            L_0x00ad:
                r7 = move-exception
                r0 = r1
                goto L_0x00be
            L_0x00b0:
                r0 = r1
                goto L_0x00b4
            L_0x00b2:
                r7 = move-exception
                goto L_0x00be
            L_0x00b4:
                java.lang.Byte r7 = java.lang.Byte.valueOf(r7)     // Catch:{ all -> 0x00b2 }
                if (r0 == 0) goto L_0x00bd
                r0.disconnect()
            L_0x00bd:
                return r7
            L_0x00be:
                if (r0 == 0) goto L_0x00c3
                r0.disconnect()
            L_0x00c3:
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: mega.boicot.eliminarperfil.C5994a.doInBackground(java.lang.String[]):java.lang.Byte");
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void onPostExecute(Byte b) {
            if (eliminarperfil.this.f19771t.isShowing()) {
                eliminarperfil.this.f19771t.dismiss();
            }
            if (b.byteValue() == 1) {
                try {
                    eliminarperfil.this.f19754c.mo20757a((Context) eliminarperfil.this, 1).delete();
                } catch (Exception unused) {
                }
                Editor edit = eliminarperfil.this.f19770s.edit();
                edit.clear();
                edit.commit();
                eliminarperfil.this.mo21714g();
                return;
            }
            final AlertDialog create = new Builder(eliminarperfil.this).setCancelable(false).setPositiveButton(eliminarperfil.this.getString(R.string.aceptar), new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialogInterface, int i) {
                    Intent intent = new Intent(eliminarperfil.this, preperfil.class);
                    if (eliminarperfil.this.f19756e) {
                        intent = config.m23827a(intent, eliminarperfil.this.f19772u);
                    } else {
                        intent.putExtra("idsecc", eliminarperfil.this.f19753b);
                    }
                    if (eliminarperfil.this.f19754c.f18045dm != 2) {
                        intent.putExtra("es_root", true);
                        eliminarperfil.this.f19757f = false;
                    }
                    intent.putExtra("desde_main", eliminarperfil.this.f19758g);
                    eliminarperfil.this.f19755d = true;
                    eliminarperfil.this.startActivity(intent);
                }
            }).setMessage(R.string.error_http).create();
            if (!eliminarperfil.this.f19768q.equals("")) {
                create.setOnShowListener(new OnShowListener() {
                    public void onShow(DialogInterface dialogInterface) {
                        Button button = create.getButton(-1);
                        StringBuilder sb = new StringBuilder();
                        sb.append("#");
                        sb.append(eliminarperfil.this.f19768q);
                        button.setTextColor(Color.parseColor(sb.toString()));
                    }
                });
            }
            create.show();
            try {
                ((TextView) create.findViewById(16908299)).setTypeface(Typeface.MONOSPACE);
            } catch (Exception unused2) {
            }
        }
    }

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
        String str;
        String str2;
        this.f19754c = (config) getApplicationContext();
        this.f19768q = config.m23831a("FFFFFFFF", this.f19754c.f17890aW);
        super.onCreate(bundle);
        setContentView(R.layout.eliminarperfil);
        mo21713f();
        if (this.f19754c.f18080q > 0) {
            SearchManager searchManager = (SearchManager) getSystemService("search");
            searchManager.setOnCancelListener(new OnCancelListener() {
                public void onCancel() {
                    eliminarperfil.this.f19755d = false;
                    eliminarperfil.this.setResult(0);
                }
            });
            searchManager.setOnDismissListener(new OnDismissListener() {
                public void onDismiss() {
                    eliminarperfil.this.f19765n = false;
                }
            });
        }
        this.f19759h = this.f19754c.mo20760a((Context) this, false);
        this.f19772u = getIntent().getExtras();
        if (bundle == null) {
            this.f19757f = this.f19772u != null && this.f19772u.containsKey("es_root") && this.f19772u.getBoolean("es_root", false);
        } else {
            this.f19757f = bundle.containsKey("es_root") && bundle.getBoolean("es_root", false);
        }
        this.f19756e = this.f19772u.containsKey("externo");
        this.f19758g = this.f19772u.getBoolean("desde_main", false);
        int i = this.f19754c.f18075l;
        if (this.f19758g) {
            String str3 = this.f19754c.f17881aN;
            String str4 = this.f19754c.f17882aO;
            this.f19753b = 0;
            String str5 = str4;
            str2 = str3;
            str = str5;
        } else if (this.f19756e) {
            str2 = this.f19754c.f17971bz[i].f18314g;
            str = this.f19754c.f17971bz[i].f18315h;
        } else {
            str2 = this.f19754c.f17971bz[i].f18314g;
            str = this.f19754c.f17971bz[i].f18315h;
            this.f19753b = this.f19772u.getInt("idsecc");
        }
        this.f19770s = getSharedPreferences("sh", 0);
        this.f19752a = this.f19770s.getInt("idusu", 0);
        if (!str2.equals("")) {
            Orientation orientation = Orientation.TOP_BOTTOM;
            StringBuilder sb = new StringBuilder();
            sb.append("#");
            sb.append(str2);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("#");
            sb2.append(str);
            findViewById(R.id.ll_princ).setBackgroundDrawable(new GradientDrawable(orientation, new int[]{Color.parseColor(sb.toString()), Color.parseColor(sb2.toString())}));
            StringBuilder sb3 = new StringBuilder();
            sb3.append("#");
            sb3.append(str2);
            if (config.m23844a(sb3.toString())) {
                ((TextView) findViewById(R.id.message_text)).setTextColor(-16777216);
            } else {
                ((TextView) findViewById(R.id.message_text)).setTextColor(-1);
            }
        }
        this.f19771t = new ProgressDialog(this);
        this.f19771t.setMessage(getString(R.string.eliminando));
        this.f19771t.setIndeterminate(true);
        if (VERSION.SDK_INT > 20) {
            this.f19771t.setOnShowListener(new OnShowListener() {
                public void onShow(DialogInterface dialogInterface) {
                    config.m23838a((ProgressBar) eliminarperfil.this.f19771t.findViewById(16908301), eliminarperfil.this.f19754c.f17890aW);
                }
            });
        }
        this.f19771t.show();
        new C5994a().execute(new String[0]);
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i2 == -1 && intent != null && intent.hasExtra("finalizar") && intent.getExtras().getBoolean("finalizar")) {
            if (!intent.getExtras().getBoolean("finalizar_app")) {
                this.f19757f = false;
            }
            setResult(-1, intent);
            finish();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public void mo21713f() {
        int b = this.f19754c.mo20778b((Context) this);
        if (this.f19754c.f18045dm == 1) {
            this.f19769r = (ListView) findViewById(R.id.left_drawer);
            this.f19754c.mo20771a(this.f19769r);
        } else if (this.f19754c.f18045dm == 0) {
            int i = 0;
            for (int i2 = 0; i2 < this.f19754c.f17971bz.length; i2++) {
                if (!this.f19754c.f17971bz[i2].f18333z) {
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
        for (int i3 = 0; i3 < this.f19754c.f17923bD.length; i3++) {
            if (this.f19754c.f17923bD[i3] > 0) {
                findViewById(this.f19754c.f17923bD[i3]).setOnClickListener(this);
            }
        }
    }

    public void onClick(View view) {
        if ((this.f19754c.f17986cO == null || this.f19754c.f17986cO.equals("")) && ((this.f19754c.f17985cN == null || this.f19754c.f17985cN.equals("")) && ((this.f19754c.f17988cQ == null || this.f19754c.f17988cQ.equals("")) && (this.f19754c.f17989cR == null || this.f19754c.f17989cR.equals(""))))) {
            abrir_secc(view);
            return;
        }
        if (this.f19754c.f17986cO != null && !this.f19754c.f17986cO.equals("")) {
            this.f19761j = new RewardedVideo((Context) this, this.f19754c.f17986cO);
        }
        if (this.f19754c.f17985cN != null && !this.f19754c.f17985cN.equals("")) {
            this.f19760i = C2997g.m10716a(this);
        }
        if (this.f19754c.f17988cQ != null && !this.f19754c.f17988cQ.equals("")) {
            this.f19762k = new RewardedVideoAd(this, this.f19754c.f17988cQ);
        }
        if (this.f19754c.f17989cR != null && !this.f19754c.f17989cR.equals("")) {
            this.f19763l = new StartAppAd(this);
        }
        this.f19767p = new ProgressDialog(this);
        this.f19766o = view;
        if (!this.f19754c.mo20774a((Context) this, view, this.f19768q, this.f19767p, this.f19760i, this.f19761j, this.f19762k, this.f19763l)) {
            abrir_secc(view);
        }
    }

    public void abrir_secc(View view) {
        C5662h a = this.f19754c.mo20761a(view, (Context) this);
        if (a.f18227b) {
            this.f19755d = true;
            Intent intent = new Intent();
            intent.putExtra("finalizar", true);
            intent.putExtra("finalizar_app", a.f18228c);
            setResult(-1, intent);
        }
        if (a.f18229d) {
            startActivityForResult(a.f18226a, 0);
        } else if (a.f18226a != null) {
            if (a.f18227b && this.f19754c.f18045dm != 2) {
                a.f18226a.putExtra("es_root", true);
            }
            this.f19757f = false;
            startActivity(a.f18226a);
        }
        if (this.f19755d && !this.f19765n) {
            finish();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public void mo21714g() {
        TextView textView = (TextView) findViewById(R.id.message_text);
        textView.setText(R.string.perfileliminado);
        textView.setVisibility(0);
    }

    public boolean onSearchRequested() {
        if (this.f19754c.f18080q == 0) {
            return false;
        }
        this.f19755d = true;
        this.f19765n = true;
        return super.onSearchRequested();
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getWindow().setFormat(1);
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("es_root", this.f19757f);
    }

    public void onStop() {
        super.onStop();
        if (this.f19755d && !this.f19765n) {
            finish();
        }
    }

    public void onPause() {
        if (!(this.f19754c.f18013cx == 0 || this.f19759h == null || this.f19759h.f17768a == null)) {
            this.f19759h.f17768a.mo12167b();
        }
        super.onPause();
    }

    public void onResume() {
        super.onResume();
        config.m23860m(this);
        if (this.f19754c.f18013cx != 0 && this.f19759h != null && this.f19759h.f17768a != null) {
            this.f19759h.f17768a.mo12165a();
        }
    }

    public void onDestroy() {
        if (!(this.f19754c.f18013cx == 0 || this.f19759h == null || this.f19759h.f17768a == null)) {
            this.f19759h.f17768a.mo12168c();
        }
        if (!(this.f19754c.f18013cx == 0 || this.f19759h == null || this.f19759h.f17769b == null)) {
            this.f19759h.f17769b.destroy();
        }
        if ((this.f19757f && isFinishing()) || config.f17841i) {
            config.m23861n(this);
        }
        super.onDestroy();
    }

    public void adLoaded(String str) {
        this.f19767p.cancel();
        this.f19761j.showAd();
    }

    public void onAdClosed() {
        if (this.f19764m) {
            abrir_secc(this.f19766o);
        }
    }

    public void adError(String str) {
        this.f19767p.cancel();
        abrir_secc(this.f19766o);
    }

    public void videoEnded() {
        this.f19764m = true;
        config.m23867t(this);
    }

    /* renamed from: z_ */
    public void mo9678z_() {
        this.f19767p.cancel();
        this.f19760i.mo12836a();
    }

    /* renamed from: a */
    public void mo9675a(C3165a aVar) {
        this.f19764m = true;
        config.m23867t(this);
    }

    /* renamed from: A_ */
    public void mo9671A_() {
        if (this.f19764m) {
            abrir_secc(this.f19766o);
        }
    }

    /* renamed from: e */
    public void mo9676e() {
        this.f19764m = false;
    }

    /* renamed from: a */
    public void mo9674a(int i) {
        if (!this.f19754c.mo20775a((Context) this, this.f19761j)) {
            this.f19767p.cancel();
            abrir_secc(this.f19766o);
        }
    }

    public void onError(C1514Ad ad, AdError adError) {
        this.f19767p.cancel();
        abrir_secc(this.f19766o);
    }

    public void onAdLoaded(C1514Ad ad) {
        this.f19767p.cancel();
        this.f19762k.show();
    }

    public void onRewardedVideoCompleted() {
        this.f19764m = true;
        config.m23867t(this);
    }

    public void onRewardedVideoClosed() {
        if (this.f19764m) {
            abrir_secc(this.f19766o);
        }
    }

    public void onVideoCompleted() {
        this.f19764m = true;
        config.m23867t(this);
    }

    public void onReceiveAd(C5286Ad ad) {
        this.f19767p.cancel();
        this.f19763l.showAd("REWARDED VIDEO", new AdDisplayListener() {
            public void adClicked(C5286Ad ad) {
            }

            public void adDisplayed(C5286Ad ad) {
            }

            public void adNotDisplayed(C5286Ad ad) {
            }

            public void adHidden(C5286Ad ad) {
                if (eliminarperfil.this.f19764m) {
                    eliminarperfil.this.abrir_secc(eliminarperfil.this.f19766o);
                }
            }
        });
    }

    public void onFailedToReceiveAd(C5286Ad ad) {
        this.f19767p.cancel();
        abrir_secc(this.f19766o);
    }
}
