package mega.boicot;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.ProgressDialog;
import android.app.SearchManager;
import android.app.SearchManager.OnCancelListener;
import android.app.SearchManager.OnDismissListener;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.res.Configuration;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.GradientDrawable.Orientation;
import android.os.AsyncTask;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.ToggleButton;
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

public class notifs_cats extends Activity implements OnClickListener, OnCheckedChangeListener, OnAdClosed, OnAdError, OnAdLoaded, OnVideoEnded, RewardedVideoAdListener, C3167c, VideoListener, AdEventListener, C5599a {

    /* renamed from: a */
    C3166b f19906a;

    /* renamed from: b */
    RewardedVideo f19907b;

    /* renamed from: c */
    RewardedVideoAd f19908c;

    /* renamed from: d */
    StartAppAd f19909d;

    /* renamed from: e */
    boolean f19910e = false;

    /* renamed from: f */
    boolean f19911f = false;

    /* renamed from: g */
    View f19912g;

    /* renamed from: h */
    ProgressDialog f19913h;

    /* renamed from: i */
    ListView f19914i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public SharedPreferences f19915j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public config f19916k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public int f19917l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public String f19918m;

    /* renamed from: n */
    private String f19919n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public boolean f19920o = false;

    /* renamed from: p */
    private boolean f19921p = false;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public boolean f19922q;

    /* renamed from: r */
    private boolean f19923r;

    /* renamed from: s */
    private Bundle f19924s;

    /* renamed from: t */
    private C5602c f19925t;

    /* renamed from: mega.boicot.notifs_cats$a */
    private class C6027a extends AsyncTask<String, Void, Byte> {

        /* renamed from: a */
        String f19929a;

        /* renamed from: b */
        String f19930b;

        C6027a(String str, Boolean bool) {
            this.f19929a = bool.booleanValue() ? "1" : "0";
            this.f19930b = str;
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x00be  */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x00c4  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Byte doInBackground(java.lang.String... r7) {
            /*
                r6 = this;
                r7 = 0
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00b7 }
                r0.<init>()     // Catch:{ Exception -> 0x00b7 }
                java.lang.String r1 = "http://"
                r0.append(r1)     // Catch:{ Exception -> 0x00b7 }
                java.lang.String r1 = mega.boicot.config.f17839g     // Catch:{ Exception -> 0x00b7 }
                r0.append(r1)     // Catch:{ Exception -> 0x00b7 }
                java.lang.String r1 = "/srv/usu_catnotif.php?v=2&idusu="
                r0.append(r1)     // Catch:{ Exception -> 0x00b7 }
                mega.boicot.notifs_cats r1 = mega.boicot.notifs_cats.this     // Catch:{ Exception -> 0x00b7 }
                int r1 = r1.f19917l     // Catch:{ Exception -> 0x00b7 }
                r0.append(r1)     // Catch:{ Exception -> 0x00b7 }
                java.lang.String r1 = "&c="
                r0.append(r1)     // Catch:{ Exception -> 0x00b7 }
                mega.boicot.notifs_cats r1 = mega.boicot.notifs_cats.this     // Catch:{ Exception -> 0x00b7 }
                java.lang.String r1 = r1.f19918m     // Catch:{ Exception -> 0x00b7 }
                r0.append(r1)     // Catch:{ Exception -> 0x00b7 }
                java.lang.String r1 = "&idcat="
                r0.append(r1)     // Catch:{ Exception -> 0x00b7 }
                java.lang.String r1 = r6.f19930b     // Catch:{ Exception -> 0x00b7 }
                r0.append(r1)     // Catch:{ Exception -> 0x00b7 }
                java.lang.String r1 = "&modo="
                r0.append(r1)     // Catch:{ Exception -> 0x00b7 }
                java.lang.String r1 = r6.f19929a     // Catch:{ Exception -> 0x00b7 }
                r0.append(r1)     // Catch:{ Exception -> 0x00b7 }
                java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x00b7 }
                java.net.URL r1 = new java.net.URL     // Catch:{ Exception -> 0x00b7 }
                r1.<init>(r0)     // Catch:{ Exception -> 0x00b7 }
                java.net.URLConnection r0 = r1.openConnection()     // Catch:{ Exception -> 0x00b7 }
                java.net.HttpURLConnection r0 = (java.net.HttpURLConnection) r0     // Catch:{ Exception -> 0x00b7 }
                r7 = 1
                r0.setDoInput(r7)     // Catch:{ Exception -> 0x00b3, all -> 0x00ae }
                r1 = 10000(0x2710, float:1.4013E-41)
                r0.setConnectTimeout(r1)     // Catch:{ Exception -> 0x00b3, all -> 0x00ae }
                r0.setReadTimeout(r1)     // Catch:{ Exception -> 0x00b3, all -> 0x00ae }
                java.lang.String r1 = "User-Agent"
                java.lang.String r2 = "Android Vinebre Software"
                r0.setRequestProperty(r1, r2)     // Catch:{ Exception -> 0x00b3, all -> 0x00ae }
                java.io.InputStream r1 = r0.getInputStream()     // Catch:{ Exception -> 0x00b3, all -> 0x00ae }
                java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ Exception -> 0x00b3, all -> 0x00ae }
                java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x00b3, all -> 0x00ae }
                r3.<init>(r1)     // Catch:{ Exception -> 0x00b3, all -> 0x00ae }
                r2.<init>(r3)     // Catch:{ Exception -> 0x00b3, all -> 0x00ae }
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00b3, all -> 0x00ae }
                r1.<init>()     // Catch:{ Exception -> 0x00b3, all -> 0x00ae }
            L_0x0075:
                java.lang.String r3 = r2.readLine()     // Catch:{ Exception -> 0x00b3, all -> 0x00ae }
                if (r3 == 0) goto L_0x0090
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00b3, all -> 0x00ae }
                r4.<init>()     // Catch:{ Exception -> 0x00b3, all -> 0x00ae }
                r4.append(r3)     // Catch:{ Exception -> 0x00b3, all -> 0x00ae }
                java.lang.String r3 = "\n"
                r4.append(r3)     // Catch:{ Exception -> 0x00b3, all -> 0x00ae }
                java.lang.String r3 = r4.toString()     // Catch:{ Exception -> 0x00b3, all -> 0x00ae }
                r1.append(r3)     // Catch:{ Exception -> 0x00b3, all -> 0x00ae }
                goto L_0x0075
            L_0x0090:
                java.lang.String r2 = "ANDROID:OK"
                int r1 = r1.indexOf(r2)     // Catch:{ Exception -> 0x00b3, all -> 0x00ae }
                r2 = -1
                if (r1 == r2) goto L_0x00a3
                java.lang.Byte r7 = java.lang.Byte.valueOf(r7)     // Catch:{ Exception -> 0x00b3, all -> 0x00ae }
                if (r0 == 0) goto L_0x00a2
                r0.disconnect()
            L_0x00a2:
                return r7
            L_0x00a3:
                r7 = 0
                java.lang.Byte r7 = java.lang.Byte.valueOf(r7)     // Catch:{ Exception -> 0x00b3, all -> 0x00ae }
                if (r0 == 0) goto L_0x00ad
                r0.disconnect()
            L_0x00ad:
                return r7
            L_0x00ae:
                r7 = move-exception
                r5 = r0
                r0 = r7
                r7 = r5
                goto L_0x00c2
            L_0x00b3:
                r7 = r0
                goto L_0x00b7
            L_0x00b5:
                r0 = move-exception
                goto L_0x00c2
            L_0x00b7:
                r0 = 2
                java.lang.Byte r0 = java.lang.Byte.valueOf(r0)     // Catch:{ all -> 0x00b5 }
                if (r7 == 0) goto L_0x00c1
                r7.disconnect()
            L_0x00c1:
                return r0
            L_0x00c2:
                if (r7 == 0) goto L_0x00c7
                r7.disconnect()
            L_0x00c7:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: mega.boicot.notifs_cats.C6027a.doInBackground(java.lang.String[]):java.lang.Byte");
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void onPostExecute(Byte b) {
            if (b.byteValue() == 1) {
                Editor edit = notifs_cats.this.f19915j.edit();
                StringBuilder sb = new StringBuilder();
                sb.append("catsnotif_");
                sb.append(this.f19930b);
                sb.append("_def");
                edit.putString(sb.toString(), this.f19929a);
                edit.commit();
            }
        }
    }

    /* renamed from: mega.boicot.notifs_cats$b */
    private class C6028b extends AsyncTask<String, Void, String> {
        private C6028b() {
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
            if (notifs_cats.this.f19922q) {
                notifs_cats.this.findViewById(R.id.pb_cargarcats_inv).setVisibility(0);
            } else {
                notifs_cats.this.findViewById(R.id.pb_cargarcats).setVisibility(0);
            }
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x0093  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.String doInBackground(java.lang.String... r6) {
            /*
                r5 = this;
                r6 = 0
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x008f }
                r0.<init>()     // Catch:{ Exception -> 0x008f }
                java.lang.String r1 = "http://"
                r0.append(r1)     // Catch:{ Exception -> 0x008f }
                java.lang.String r1 = mega.boicot.config.f17839g     // Catch:{ Exception -> 0x008f }
                r0.append(r1)     // Catch:{ Exception -> 0x008f }
                java.lang.String r1 = "/srv/cargar_catsnotif.php?v=2&idusu="
                r0.append(r1)     // Catch:{ Exception -> 0x008f }
                mega.boicot.notifs_cats r1 = mega.boicot.notifs_cats.this     // Catch:{ Exception -> 0x008f }
                int r1 = r1.f19917l     // Catch:{ Exception -> 0x008f }
                r0.append(r1)     // Catch:{ Exception -> 0x008f }
                java.lang.String r1 = "&c="
                r0.append(r1)     // Catch:{ Exception -> 0x008f }
                mega.boicot.notifs_cats r1 = mega.boicot.notifs_cats.this     // Catch:{ Exception -> 0x008f }
                java.lang.String r1 = r1.f19918m     // Catch:{ Exception -> 0x008f }
                r0.append(r1)     // Catch:{ Exception -> 0x008f }
                java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x008f }
                java.net.URL r1 = new java.net.URL     // Catch:{ Exception -> 0x008f }
                r1.<init>(r0)     // Catch:{ Exception -> 0x008f }
                java.net.URLConnection r0 = r1.openConnection()     // Catch:{ Exception -> 0x008f }
                java.net.HttpURLConnection r0 = (java.net.HttpURLConnection) r0     // Catch:{ Exception -> 0x008f }
                r6 = 1
                r0.setDoInput(r6)     // Catch:{ Exception -> 0x0088, all -> 0x0086 }
                r6 = 10000(0x2710, float:1.4013E-41)
                r0.setConnectTimeout(r6)     // Catch:{ Exception -> 0x0088, all -> 0x0086 }
                r0.setReadTimeout(r6)     // Catch:{ Exception -> 0x0088, all -> 0x0086 }
                java.lang.String r6 = "User-Agent"
                java.lang.String r1 = "Android Vinebre Software"
                r0.setRequestProperty(r6, r1)     // Catch:{ Exception -> 0x0088, all -> 0x0086 }
                java.io.InputStream r6 = r0.getInputStream()     // Catch:{ Exception -> 0x0088, all -> 0x0086 }
                java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch:{ Exception -> 0x0088, all -> 0x0086 }
                java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x0088, all -> 0x0086 }
                r2.<init>(r6)     // Catch:{ Exception -> 0x0088, all -> 0x0086 }
                r1.<init>(r2)     // Catch:{ Exception -> 0x0088, all -> 0x0086 }
                java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0088, all -> 0x0086 }
                r6.<init>()     // Catch:{ Exception -> 0x0088, all -> 0x0086 }
            L_0x0061:
                java.lang.String r2 = r1.readLine()     // Catch:{ Exception -> 0x0088, all -> 0x0086 }
                if (r2 == 0) goto L_0x007c
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0088, all -> 0x0086 }
                r3.<init>()     // Catch:{ Exception -> 0x0088, all -> 0x0086 }
                r3.append(r2)     // Catch:{ Exception -> 0x0088, all -> 0x0086 }
                java.lang.String r2 = "\n"
                r3.append(r2)     // Catch:{ Exception -> 0x0088, all -> 0x0086 }
                java.lang.String r2 = r3.toString()     // Catch:{ Exception -> 0x0088, all -> 0x0086 }
                r6.append(r2)     // Catch:{ Exception -> 0x0088, all -> 0x0086 }
                goto L_0x0061
            L_0x007c:
                java.lang.String r6 = r6.toString()     // Catch:{ Exception -> 0x0088, all -> 0x0086 }
                if (r0 == 0) goto L_0x0085
                r0.disconnect()
            L_0x0085:
                return r6
            L_0x0086:
                r6 = move-exception
                goto L_0x0097
            L_0x0088:
                r6 = r0
                goto L_0x008f
            L_0x008a:
                r0 = move-exception
                r4 = r0
                r0 = r6
                r6 = r4
                goto L_0x0097
            L_0x008f:
                java.lang.String r0 = ""
                if (r6 == 0) goto L_0x0096
                r6.disconnect()
            L_0x0096:
                return r0
            L_0x0097:
                if (r0 == 0) goto L_0x009c
                r0.disconnect()
            L_0x009c:
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: mega.boicot.notifs_cats.C6028b.doInBackground(java.lang.String[]):java.lang.String");
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void onPostExecute(String str) {
            try {
                notifs_cats.this.findViewById(R.id.pb_cargarcats).setVisibility(8);
                notifs_cats.this.findViewById(R.id.pb_cargarcats_inv).setVisibility(8);
            } catch (Exception unused) {
            }
            if (str.contains("ANDROID:OK DATOS:")) {
                int indexOf = str.indexOf("DATOS:") + 6;
                String[] split = str.substring(indexOf, str.indexOf(";", indexOf)).split(",");
                String[] split2 = notifs_cats.this.f19915j.getString("catsnotif_ids", "").split(",");
                Editor edit = notifs_cats.this.f19915j.edit();
                for (int i = 0; i < split2.length; i++) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("catsnotif_");
                    sb.append(split2[i]);
                    sb.append("_descr");
                    edit.remove(sb.toString());
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("catsnotif_");
                    sb2.append(split2[i]);
                    sb2.append("_def");
                    edit.remove(sb2.toString());
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("catsnotif_");
                    sb3.append(split2[i]);
                    sb3.append("_sep");
                    edit.remove(sb3.toString());
                }
                String str2 = "";
                for (int i2 = 0; i2 < split.length; i2++) {
                    if (!split[i2].equals("")) {
                        String[] split3 = split[i2].split("-");
                        if (split3.length == 2) {
                            notifs_cats.this.f19916k.f18065eg = Integer.parseInt(split3[1]);
                            edit.putInt("vcn", Integer.parseInt(split3[1]));
                            edit.putInt("catsnotif_v_aplic", Integer.parseInt(split3[1]));
                        } else {
                            String str3 = split3[0];
                            if (!str2.equals("")) {
                                StringBuilder sb4 = new StringBuilder();
                                sb4.append(str2);
                                sb4.append(",");
                                str2 = sb4.toString();
                            }
                            StringBuilder sb5 = new StringBuilder();
                            sb5.append(str2);
                            sb5.append(str3);
                            str2 = sb5.toString();
                            String replace = split3[2].replace("@X@", "-").replace("@Y@", ",").replace("@Z@", ";");
                            StringBuilder sb6 = new StringBuilder();
                            sb6.append("catsnotif_");
                            sb6.append(str3);
                            sb6.append("_descr");
                            edit.putString(sb6.toString(), replace);
                            StringBuilder sb7 = new StringBuilder();
                            sb7.append("catsnotif_");
                            sb7.append(str3);
                            sb7.append("_def");
                            edit.putString(sb7.toString(), split3[3]);
                            StringBuilder sb8 = new StringBuilder();
                            sb8.append("catsnotif_");
                            sb8.append(str3);
                            sb8.append("_sep");
                            edit.putString(sb8.toString(), split3[1]);
                        }
                    }
                }
                edit.putString("catsnotif_ids", str2);
                notifs_cats.this.f19916k.f18067ei = !str2.equals("");
                if (str2.equals("")) {
                    edit.putInt("hcn", 0);
                } else {
                    edit.putInt("hcn", 1);
                }
                edit.commit();
                notifs_cats.this.m24471g();
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
        this.f19916k = (config) getApplicationContext();
        if (this.f19916k.f17881aN == null) {
            this.f19916k.mo20780b();
        }
        this.f19919n = config.m23831a(this.f19916k.f17881aN, this.f19916k.f17890aW);
        if (VERSION.SDK_INT > 12) {
            StringBuilder sb = new StringBuilder();
            sb.append("#");
            sb.append(this.f19916k.f17881aN);
            if (!config.m23844a(sb.toString())) {
                setTheme(R.style.holonolight);
            }
        }
        super.onCreate(bundle);
        setContentView(R.layout.notifs_cats);
        mo21798f();
        if (this.f19916k.f18080q > 0) {
            SearchManager searchManager = (SearchManager) getSystemService("search");
            searchManager.setOnCancelListener(new OnCancelListener() {
                public void onCancel() {
                    notifs_cats.this.f19920o = false;
                    notifs_cats.this.setResult(0);
                }
            });
            searchManager.setOnDismissListener(new OnDismissListener() {
                public void onDismiss() {
                    notifs_cats.this.f19911f = false;
                }
            });
        }
        this.f19916k.mo20770a((Context) this, false, false);
        this.f19925t = this.f19916k.mo20760a((Context) this, false);
        this.f19924s = getIntent().getExtras();
        if (bundle == null) {
            this.f19923r = this.f19924s != null && this.f19924s.containsKey("es_root") && this.f19924s.getBoolean("es_root", false);
        } else {
            this.f19923r = bundle.containsKey("es_root") && bundle.getBoolean("es_root", false);
        }
        this.f19915j = getSharedPreferences("sh", 0);
        this.f19917l = this.f19915j.getInt("idusu", 0);
        this.f19918m = this.f19915j.getString("cod_g", "");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("#");
        sb2.append(this.f19916k.f17881aN);
        this.f19922q = config.m23844a(sb2.toString());
        if (!this.f19916k.f17881aN.equals("")) {
            Orientation orientation = Orientation.TOP_BOTTOM;
            StringBuilder sb3 = new StringBuilder();
            sb3.append("#");
            sb3.append(this.f19916k.f17881aN);
            StringBuilder sb4 = new StringBuilder();
            sb4.append("#");
            sb4.append(this.f19916k.f17882aO);
            findViewById(R.id.ll_princ).setBackgroundDrawable(new GradientDrawable(orientation, new int[]{Color.parseColor(sb3.toString()), Color.parseColor(sb4.toString())}));
        }
        int i = -16777216;
        if (!this.f19922q) {
            i = -1;
        }
        TextView textView = (TextView) findViewById(R.id.tv_listacatsnotifs);
        textView.setTextColor(i);
        if (!this.f19916k.f17950be.equals("")) {
            textView.setText(this.f19916k.f17950be);
        }
        findViewById(R.id.v_listacatsnotifs).setBackgroundColor(i);
        if (this.f19915j.getInt("catsnotif_v_aplic", 0) == this.f19916k.f18065eg) {
            m24471g();
        } else {
            new C6028b().execute(new String[0]);
        }
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i2 == -1 && intent != null && intent.hasExtra("finalizar") && intent.getExtras().getBoolean("finalizar")) {
            if (!intent.getExtras().getBoolean("finalizar_app")) {
                this.f19923r = false;
            }
            setResult(-1, intent);
            finish();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public void mo21798f() {
        int b = this.f19916k.mo20778b((Context) this);
        if (this.f19916k.f18045dm == 1) {
            this.f19914i = (ListView) findViewById(R.id.left_drawer);
            this.f19916k.mo20771a(this.f19914i);
        } else if (this.f19916k.f18045dm == 0) {
            int i = 0;
            for (int i2 = 0; i2 < this.f19916k.f17971bz.length; i2++) {
                if (!this.f19916k.f17971bz[i2].f18333z) {
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
        for (int i3 = 0; i3 < this.f19916k.f17923bD.length; i3++) {
            if (this.f19916k.f17923bD[i3] > 0) {
                findViewById(this.f19916k.f17923bD[i3]).setOnClickListener(this);
            }
        }
    }

    /* access modifiers changed from: private */
    @TargetApi(14)
    /* renamed from: g */
    public void m24471g() {
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.llnotifs);
        linearLayout.removeAllViews();
        LayoutInflater layoutInflater = (LayoutInflater) getSystemService("layout_inflater");
        String[] split = this.f19915j.getString("catsnotif_ids", "").split(",");
        for (int i = 0; i < split.length; i++) {
            if (!split[i].equals("")) {
                String str = split[i];
                int i2 = config.f17813a;
                int i3 = config.f17834e;
                if (!this.f19922q) {
                    i2 = config.f17815c;
                    i3 = config.f17838f;
                }
                SharedPreferences sharedPreferences = this.f19915j;
                StringBuilder sb = new StringBuilder();
                sb.append("catsnotif_");
                sb.append(str);
                sb.append("_sep");
                if (sharedPreferences.getString(sb.toString(), "0").equals("1")) {
                    LinearLayout linearLayout2 = (LinearLayout) layoutInflater.inflate(R.layout.notif_sep, null);
                    TextView textView = (TextView) linearLayout2.findViewById(R.id.tv_sep);
                    SharedPreferences sharedPreferences2 = this.f19915j;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("catsnotif_");
                    sb2.append(str);
                    sb2.append("_descr");
                    textView.setText(sharedPreferences2.getString(sb2.toString(), ""));
                    textView.setTextColor(i2);
                    linearLayout2.findViewById(R.id.v_sep).setBackgroundColor(i3);
                    linearLayout.addView(linearLayout2);
                } else {
                    LinearLayout linearLayout3 = (LinearLayout) layoutInflater.inflate(R.layout.notif_cat, null);
                    TextView textView2 = (TextView) linearLayout3.findViewById(R.id.tv_cat);
                    if (VERSION.SDK_INT >= 17 && getResources().getBoolean(R.bool.es_rtl)) {
                        textView2.setTextDirection(4);
                    }
                    SharedPreferences sharedPreferences3 = this.f19915j;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("catsnotif_");
                    sb3.append(str);
                    sb3.append("_descr");
                    textView2.setText(sharedPreferences3.getString(sb3.toString(), ""));
                    textView2.setTextColor(i2);
                    LinearLayout linearLayout4 = (LinearLayout) linearLayout3.findViewById(R.id.ll_sc);
                    if (VERSION.SDK_INT > 13) {
                        Switch switchR = new Switch(this);
                        SharedPreferences sharedPreferences4 = this.f19915j;
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("catsnotif_");
                        sb4.append(str);
                        sb4.append("_def");
                        switchR.setChecked(sharedPreferences4.getString(sb4.toString(), "0").equals("1"));
                        switchR.setOnCheckedChangeListener(this);
                        switchR.setTag(R.id.idaux1, str);
                        linearLayout4.addView(switchR);
                    } else {
                        ToggleButton toggleButton = new ToggleButton(this);
                        SharedPreferences sharedPreferences5 = this.f19915j;
                        StringBuilder sb5 = new StringBuilder();
                        sb5.append("catsnotif_");
                        sb5.append(str);
                        sb5.append("_def");
                        toggleButton.setChecked(sharedPreferences5.getString(sb5.toString(), "0").equals("1"));
                        toggleButton.setOnCheckedChangeListener(this);
                        toggleButton.setTag(R.id.idaux1, str);
                        linearLayout4.addView(toggleButton);
                    }
                    linearLayout3.findViewById(R.id.v_sep).setBackgroundColor(i3);
                    linearLayout.addView(linearLayout3);
                }
            }
        }
    }

    public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        new C6027a((String) compoundButton.getTag(R.id.idaux1), Boolean.valueOf(z)).execute(new String[0]);
    }

    public void onClick(View view) {
        if (view.getTag(R.id.idaux1) == null) {
            if ((this.f19916k.f17986cO == null || this.f19916k.f17986cO.equals("")) && ((this.f19916k.f17985cN == null || this.f19916k.f17985cN.equals("")) && ((this.f19916k.f17988cQ == null || this.f19916k.f17988cQ.equals("")) && (this.f19916k.f17989cR == null || this.f19916k.f17989cR.equals(""))))) {
                abrir_secc(view);
                return;
            }
            if (this.f19916k.f17986cO != null && !this.f19916k.f17986cO.equals("")) {
                this.f19907b = new RewardedVideo((Context) this, this.f19916k.f17986cO);
            }
            if (this.f19916k.f17985cN != null && !this.f19916k.f17985cN.equals("")) {
                this.f19906a = C2997g.m10716a(this);
            }
            if (this.f19916k.f17988cQ != null && !this.f19916k.f17988cQ.equals("")) {
                this.f19908c = new RewardedVideoAd(this, this.f19916k.f17988cQ);
            }
            if (this.f19916k.f17989cR != null && !this.f19916k.f17989cR.equals("")) {
                this.f19909d = new StartAppAd(this);
            }
            this.f19913h = new ProgressDialog(this);
            this.f19912g = view;
            if (!this.f19916k.mo20774a((Context) this, view, this.f19919n, this.f19913h, this.f19906a, this.f19907b, this.f19908c, this.f19909d)) {
                abrir_secc(view);
            }
        }
    }

    public void abrir_secc(View view) {
        C5662h a = this.f19916k.mo20761a(view, (Context) this);
        try {
            if (a.f18226a != null && a.f18226a.getComponent().getClassName().endsWith(".notifs")) {
                return;
            }
        } catch (Exception unused) {
        }
        if (a.f18227b) {
            this.f19920o = true;
            Intent intent = new Intent();
            intent.putExtra("finalizar", true);
            intent.putExtra("finalizar_app", a.f18228c);
            setResult(-1, intent);
        }
        if (a.f18229d) {
            startActivityForResult(a.f18226a, 0);
        } else if (a.f18226a != null) {
            if (a.f18227b && this.f19916k.f18045dm != 2) {
                a.f18226a.putExtra("es_root", true);
            }
            this.f19923r = false;
            startActivity(a.f18226a);
        }
        if (this.f19920o && !this.f19911f) {
            finish();
        }
    }

    public boolean onSearchRequested() {
        if (this.f19916k.f18080q == 0) {
            return false;
        }
        this.f19920o = true;
        this.f19911f = true;
        return super.onSearchRequested();
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getWindow().setFormat(1);
    }

    public void onResume() {
        super.onResume();
        config.m23860m(this);
        if (this.f19916k.f18013cx != 0 && this.f19925t != null && this.f19925t.f17768a != null) {
            this.f19925t.f17768a.mo12165a();
        }
    }

    public void onPause() {
        if (!(this.f19916k.f18013cx == 0 || this.f19925t == null || this.f19925t.f17768a == null)) {
            this.f19925t.f17768a.mo12167b();
        }
        super.onPause();
    }

    public void onStop() {
        super.onStop();
        if (this.f19920o && !this.f19911f) {
            finish();
        }
    }

    public void onDestroy() {
        if (!(this.f19916k.f18013cx == 0 || this.f19925t == null || this.f19925t.f17768a == null)) {
            this.f19925t.f17768a.mo12168c();
        }
        if (!(this.f19916k.f18013cx == 0 || this.f19925t == null || this.f19925t.f17769b == null)) {
            this.f19925t.f17769b.destroy();
        }
        if ((this.f19923r && isFinishing()) || config.f17841i) {
            config.m23861n(this);
        }
        super.onDestroy();
    }

    public void onBackPressed() {
        if (!this.f19923r || this.f19921p || !this.f19916k.f18059ea) {
            super.onBackPressed();
            return;
        }
        this.f19921p = true;
        config.m23859l(this);
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ((LinearLayout) findViewById(R.id.ll_princ)).removeViewAt(0);
        mo21798f();
        ((LinearLayout) findViewById(R.id.ll_ad)).removeAllViews();
        if (!(this.f19925t == null || this.f19925t.f17768a == null)) {
            try {
                this.f19925t.f17768a.mo12168c();
            } catch (Exception unused) {
            }
        }
        if (!(this.f19925t == null || this.f19925t.f17769b == null)) {
            try {
                this.f19925t.f17769b.destroy();
            } catch (Exception unused2) {
            }
        }
        this.f19925t = this.f19916k.mo20760a((Context) this, false);
    }

    public void adLoaded(String str) {
        this.f19913h.cancel();
        this.f19907b.showAd();
    }

    public void onAdClosed() {
        if (this.f19910e) {
            abrir_secc(this.f19912g);
        }
    }

    public void adError(String str) {
        this.f19913h.cancel();
        abrir_secc(this.f19912g);
    }

    public void videoEnded() {
        this.f19910e = true;
        config.m23867t(this);
    }

    /* renamed from: z_ */
    public void mo9678z_() {
        this.f19913h.cancel();
        this.f19906a.mo12836a();
    }

    /* renamed from: a */
    public void mo9675a(C3165a aVar) {
        this.f19910e = true;
        config.m23867t(this);
    }

    /* renamed from: A_ */
    public void mo9671A_() {
        if (this.f19910e) {
            abrir_secc(this.f19912g);
        }
    }

    /* renamed from: e */
    public void mo9676e() {
        this.f19910e = false;
    }

    /* renamed from: a */
    public void mo9674a(int i) {
        if (!this.f19916k.mo20775a((Context) this, this.f19907b)) {
            this.f19913h.cancel();
            abrir_secc(this.f19912g);
        }
    }

    public void onError(C1514Ad ad, AdError adError) {
        this.f19913h.cancel();
        abrir_secc(this.f19912g);
    }

    public void onAdLoaded(C1514Ad ad) {
        this.f19913h.cancel();
        this.f19908c.show();
    }

    public void onRewardedVideoCompleted() {
        this.f19910e = true;
        config.m23867t(this);
    }

    public void onRewardedVideoClosed() {
        if (this.f19910e) {
            abrir_secc(this.f19912g);
        }
    }

    public void onVideoCompleted() {
        this.f19910e = true;
        config.m23867t(this);
    }

    public void onReceiveAd(C5286Ad ad) {
        this.f19913h.cancel();
        this.f19909d.showAd("REWARDED VIDEO", new AdDisplayListener() {
            public void adClicked(C5286Ad ad) {
            }

            public void adDisplayed(C5286Ad ad) {
            }

            public void adNotDisplayed(C5286Ad ad) {
            }

            public void adHidden(C5286Ad ad) {
                if (notifs_cats.this.f19910e) {
                    notifs_cats.this.abrir_secc(notifs_cats.this.f19912g);
                }
            }
        });
    }

    public void onFailedToReceiveAd(C5286Ad ad) {
        this.f19913h.cancel();
        abrir_secc(this.f19912g);
    }
}
