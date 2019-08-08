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
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.GradientDrawable.Orientation;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.AsyncTask.Status;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.provider.MediaStore.Images.Media;
import android.support.p028v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import com.appnext.ads.fullscreen.RewardedVideo;
import com.appnext.core.callbacks.OnAdClosed;
import com.appnext.core.callbacks.OnAdError;
import com.appnext.core.callbacks.OnAdLoaded;
import com.appnext.core.callbacks.OnVideoEnded;
import com.facebook.ads.AdError;
import com.facebook.ads.C1514Ad;
import com.facebook.ads.NativeAd;
import com.facebook.ads.NativeAdListener;
import com.facebook.ads.NativeAdView;
import com.facebook.ads.NativeAdView.Type;
import com.facebook.ads.NativeAdViewAttributes;
import com.facebook.ads.RewardedVideoAd;
import com.facebook.ads.RewardedVideoAdListener;
import com.google.android.exoplayer2.source.hls.DefaultHlsExtractorFactory;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.C2971c.C2972a;
import com.google.android.gms.ads.C2973d;
import com.google.android.gms.ads.C2997g;
import com.google.android.gms.ads.reward.C3165a;
import com.google.android.gms.ads.reward.C3166b;
import com.google.android.gms.ads.reward.C3167c;
import com.startapp.android.publish.ads.banner.Mrec;
import com.startapp.android.publish.adsCommon.C5286Ad;
import com.startapp.android.publish.adsCommon.StartAppAd;
import com.startapp.android.publish.adsCommon.VideoListener;
import com.startapp.android.publish.adsCommon.adListeners.AdDisplayListener;
import com.startapp.android.publish.adsCommon.adListeners.AdEventListener;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class t_card extends Activity implements OnClickListener, OnAdClosed, OnAdError, OnAdLoaded, OnVideoEnded, RewardedVideoAdListener, C3167c, VideoListener, AdEventListener, C5599a {

    /* renamed from: A */
    RewardedVideoAd f18920A;

    /* renamed from: B */
    StartAppAd f18921B;

    /* renamed from: C */
    boolean f18922C = false;

    /* renamed from: D */
    boolean f18923D = false;

    /* renamed from: E */
    View f18924E;

    /* renamed from: F */
    ProgressDialog f18925F;

    /* renamed from: G */
    ProgressBar f18926G;

    /* renamed from: H */
    Bundle f18927H;

    /* renamed from: I */
    ListView f18928I;

    /* renamed from: J */
    SharedPreferences f18929J;

    /* renamed from: a */
    int f18930a;

    /* renamed from: b */
    int f18931b;

    /* renamed from: c */
    int f18932c = -1;

    /* renamed from: d */
    int f18933d;

    /* renamed from: e */
    config f18934e;

    /* renamed from: f */
    boolean f18935f = false;

    /* renamed from: g */
    boolean f18936g = false;

    /* renamed from: h */
    boolean f18937h;

    /* renamed from: i */
    boolean f18938i;

    /* renamed from: j */
    int f18939j;

    /* renamed from: k */
    int f18940k;

    /* renamed from: l */
    int f18941l;

    /* renamed from: m */
    int f18942m;

    /* renamed from: n */
    int f18943n;

    /* renamed from: o */
    int f18944o;

    /* renamed from: p */
    int f18945p;

    /* renamed from: q */
    String f18946q;

    /* renamed from: r */
    ArrayList<C5815b> f18947r;

    /* renamed from: s */
    ArrayList<C5816c> f18948s;

    /* renamed from: t */
    ArrayList<C5814a> f18949t;

    /* renamed from: u */
    C5817d f18950u;

    /* renamed from: v */
    C5818e f18951v;

    /* renamed from: w */
    C5819f f18952w;

    /* renamed from: x */
    C5602c f18953x;

    /* renamed from: y */
    C3166b f18954y;

    /* renamed from: z */
    RewardedVideo f18955z;

    /* renamed from: mega.boicot.t_card$a */
    private class C5814a {

        /* renamed from: a */
        int f18969a;

        /* renamed from: b */
        NativeAd f18970b;

        private C5814a() {
        }
    }

    /* renamed from: mega.boicot.t_card$b */
    private class C5815b {

        /* renamed from: a */
        int f18972a;

        /* renamed from: b */
        boolean f18973b;

        /* renamed from: c */
        boolean f18974c;

        /* renamed from: d */
        boolean f18975d;

        /* renamed from: e */
        String f18976e;

        /* renamed from: f */
        String f18977f;

        /* renamed from: g */
        String f18978g;

        private C5815b() {
            this.f18973b = false;
            this.f18974c = false;
            this.f18975d = false;
        }
    }

    /* renamed from: mega.boicot.t_card$c */
    private class C5816c {

        /* renamed from: a */
        int f18980a;

        /* renamed from: b */
        int f18981b;

        /* renamed from: c */
        boolean f18982c;

        /* renamed from: d */
        String f18983d;

        private C5816c() {
            this.f18982c = false;
        }
    }

    /* renamed from: mega.boicot.t_card$d */
    private class C5817d extends AsyncTask<String, Void, String> {

        /* renamed from: a */
        int f18985a;

        C5817d(int i) {
            this.f18985a = i;
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
            t_card.this.f18926G.setVisibility(0);
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x0099  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.String doInBackground(java.lang.String... r6) {
            /*
                r5 = this;
                r6 = 0
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0095 }
                r0.<init>()     // Catch:{ Exception -> 0x0095 }
                java.lang.String r1 = "http://"
                r0.append(r1)     // Catch:{ Exception -> 0x0095 }
                java.lang.String r1 = mega.boicot.config.f17839g     // Catch:{ Exception -> 0x0095 }
                r0.append(r1)     // Catch:{ Exception -> 0x0095 }
                java.lang.String r1 = "/srv/obtener_cards.php?idusu="
                r0.append(r1)     // Catch:{ Exception -> 0x0095 }
                mega.boicot.t_card r1 = mega.boicot.t_card.this     // Catch:{ Exception -> 0x0095 }
                int r1 = r1.f18930a     // Catch:{ Exception -> 0x0095 }
                r0.append(r1)     // Catch:{ Exception -> 0x0095 }
                java.lang.String r1 = "&ind_ini="
                r0.append(r1)     // Catch:{ Exception -> 0x0095 }
                int r1 = r5.f18985a     // Catch:{ Exception -> 0x0095 }
                r0.append(r1)     // Catch:{ Exception -> 0x0095 }
                java.lang.String r1 = "&idsec="
                r0.append(r1)     // Catch:{ Exception -> 0x0095 }
                mega.boicot.t_card r1 = mega.boicot.t_card.this     // Catch:{ Exception -> 0x0095 }
                int r1 = r1.f18933d     // Catch:{ Exception -> 0x0095 }
                r0.append(r1)     // Catch:{ Exception -> 0x0095 }
                java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0095 }
                java.net.URL r1 = new java.net.URL     // Catch:{ Exception -> 0x0095 }
                r1.<init>(r0)     // Catch:{ Exception -> 0x0095 }
                java.net.URLConnection r0 = r1.openConnection()     // Catch:{ Exception -> 0x0095 }
                java.net.HttpURLConnection r0 = (java.net.HttpURLConnection) r0     // Catch:{ Exception -> 0x0095 }
                r6 = 1
                r0.setDoInput(r6)     // Catch:{ Exception -> 0x0091, all -> 0x008c }
                r6 = 10000(0x2710, float:1.4013E-41)
                r0.setConnectTimeout(r6)     // Catch:{ Exception -> 0x0091, all -> 0x008c }
                r0.setReadTimeout(r6)     // Catch:{ Exception -> 0x0091, all -> 0x008c }
                java.lang.String r6 = "User-Agent"
                java.lang.String r1 = "Android Vinebre Software"
                r0.setRequestProperty(r6, r1)     // Catch:{ Exception -> 0x0091, all -> 0x008c }
                java.io.InputStream r6 = r0.getInputStream()     // Catch:{ Exception -> 0x0091, all -> 0x008c }
                java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch:{ Exception -> 0x0091, all -> 0x008c }
                java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x0091, all -> 0x008c }
                r2.<init>(r6)     // Catch:{ Exception -> 0x0091, all -> 0x008c }
                r1.<init>(r2)     // Catch:{ Exception -> 0x0091, all -> 0x008c }
                java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0091, all -> 0x008c }
                r6.<init>()     // Catch:{ Exception -> 0x0091, all -> 0x008c }
            L_0x0067:
                java.lang.String r2 = r1.readLine()     // Catch:{ Exception -> 0x0091, all -> 0x008c }
                if (r2 == 0) goto L_0x0082
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0091, all -> 0x008c }
                r3.<init>()     // Catch:{ Exception -> 0x0091, all -> 0x008c }
                r3.append(r2)     // Catch:{ Exception -> 0x0091, all -> 0x008c }
                java.lang.String r2 = "\n"
                r3.append(r2)     // Catch:{ Exception -> 0x0091, all -> 0x008c }
                java.lang.String r2 = r3.toString()     // Catch:{ Exception -> 0x0091, all -> 0x008c }
                r6.append(r2)     // Catch:{ Exception -> 0x0091, all -> 0x008c }
                goto L_0x0067
            L_0x0082:
                java.lang.String r6 = r6.toString()     // Catch:{ Exception -> 0x0091, all -> 0x008c }
                if (r0 == 0) goto L_0x008b
                r0.disconnect()
            L_0x008b:
                return r6
            L_0x008c:
                r6 = move-exception
                r4 = r0
                r0 = r6
                r6 = r4
                goto L_0x009d
            L_0x0091:
                r6 = r0
                goto L_0x0095
            L_0x0093:
                r0 = move-exception
                goto L_0x009d
            L_0x0095:
                java.lang.String r0 = ""
                if (r6 == 0) goto L_0x009c
                r6.disconnect()
            L_0x009c:
                return r0
            L_0x009d:
                if (r6 == 0) goto L_0x00a2
                r6.disconnect()
            L_0x00a2:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: mega.boicot.t_card.C5817d.doInBackground(java.lang.String[]):java.lang.String");
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void onPostExecute(String str) {
            try {
                t_card.this.f18926G.setVisibility(8);
            } catch (Exception unused) {
            }
            if (str.contains("ANDROID:OK DATOS:")) {
                int indexOf = str.indexOf("DATOS:") + 6;
                Editor edit = t_card.this.f18929J.edit();
                StringBuilder sb = new StringBuilder();
                sb.append("cards_");
                sb.append(t_card.this.f18933d);
                edit.putString(sb.toString(), str.substring(indexOf).trim());
                StringBuilder sb2 = new StringBuilder();
                sb2.append("s");
                sb2.append(t_card.this.f18933d);
                sb2.append("_v_guardado");
                edit.putInt(sb2.toString(), t_card.this.f18934e.f17971bz[t_card.this.f18931b].f18332y);
                edit.commit();
            }
            t_card.this.m24131g();
        }
    }

    /* renamed from: mega.boicot.t_card$e */
    private class C5818e extends AsyncTask<String, Void, String> {

        /* renamed from: a */
        String f18987a;

        /* renamed from: b */
        String f18988b;

        /* renamed from: c */
        String f18989c;

        /* renamed from: d */
        Bitmap f18990d;

        /* renamed from: e */
        int f18991e;

        /* renamed from: f */
        int f18992f;

        private C5818e() {
            this.f18991e = -1;
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
            if (t_card.this.f18947r != null && t_card.this.f18934e.f17881aN != null) {
                int i = 0;
                while (true) {
                    if (i >= t_card.this.f18947r.size()) {
                        break;
                    }
                    C5815b bVar = (C5815b) t_card.this.f18947r.get(i);
                    if (bVar.f18973b) {
                        this.f18991e = i;
                        this.f18992f = 1;
                        this.f18989c = "main";
                        StringBuilder sb = new StringBuilder();
                        sb.append("c718963_");
                        sb.append(bVar.f18972a);
                        sb.append("_main.png");
                        this.f18987a = sb.toString();
                        this.f18988b = bVar.f18976e;
                        bVar.f18973b = false;
                        break;
                    } else if (bVar.f18974c) {
                        this.f18991e = i;
                        this.f18992f = 2;
                        this.f18989c = "logo";
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("c718963_");
                        sb2.append(bVar.f18972a);
                        sb2.append("_logo.png");
                        this.f18987a = sb2.toString();
                        this.f18988b = bVar.f18977f;
                        bVar.f18974c = false;
                        break;
                    } else if (bVar.f18975d) {
                        this.f18991e = i;
                        this.f18992f = 3;
                        this.f18989c = "btn";
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("c718963_");
                        sb3.append(bVar.f18972a);
                        sb3.append("_btn.png");
                        this.f18987a = sb3.toString();
                        this.f18988b = bVar.f18978g;
                        bVar.f18975d = false;
                        break;
                    } else {
                        i++;
                    }
                }
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public String doInBackground(String... strArr) {
            if (this.f18991e == -1) {
                return "-1";
            }
            try {
                StringBuilder sb = new StringBuilder();
                sb.append("http://imgs1.e-droid.net/srv/imgs/cards/");
                sb.append(this.f18987a);
                sb.append("?v=");
                sb.append(this.f18988b);
                try {
                    HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(sb.toString()).openConnection();
                    httpURLConnection.setDoInput(true);
                    httpURLConnection.setConnectTimeout(10000);
                    httpURLConnection.setReadTimeout(20000);
                    httpURLConnection.connect();
                    InputStream inputStream = httpURLConnection.getInputStream();
                    this.f18990d = BitmapFactory.decodeStream(inputStream);
                    inputStream.close();
                    httpURLConnection.disconnect();
                    try {
                        FileOutputStream fileOutputStream = new FileOutputStream(new File(t_card.this.getApplicationContext().getFilesDir(), this.f18987a));
                        if (this.f18990d.hasAlpha()) {
                            this.f18990d.compress(CompressFormat.PNG, 100, fileOutputStream);
                        } else {
                            this.f18990d.compress(CompressFormat.JPEG, 70, fileOutputStream);
                        }
                        return "1";
                    } catch (Exception unused) {
                        return "0";
                    }
                } catch (IOException unused2) {
                    return "0";
                }
            } catch (MalformedURLException unused3) {
                return "0";
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void onPostExecute(String str) {
            boolean z;
            if (this.f18991e != -1 && t_card.this.f18947r != null) {
                View findViewById = t_card.this.findViewById(R.id.llcards);
                StringBuilder sb = new StringBuilder();
                sb.append(TtmlNode.ATTR_ID);
                sb.append(((C5815b) t_card.this.f18947r.get(this.f18991e)).f18972a);
                CardView cardView = (CardView) findViewById.findViewWithTag(sb.toString());
                if (this.f18992f == 1) {
                    cardView.findViewById(R.id.pb_main).setVisibility(8);
                    cardView.findViewById(R.id.pb_main_inv).setVisibility(8);
                } else if (this.f18992f == 2) {
                    cardView.findViewById(R.id.pb_logo).setVisibility(8);
                    cardView.findViewById(R.id.pb_logo_inv).setVisibility(8);
                } else if (this.f18992f == 3) {
                    cardView.findViewById(R.id.pb_btn).setVisibility(8);
                    cardView.findViewById(R.id.pb_btn_inv).setVisibility(8);
                }
                if (str.equals("1")) {
                    Editor edit = t_card.this.f18929J.edit();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("c718963_");
                    sb2.append(((C5815b) t_card.this.f18947r.get(this.f18991e)).f18972a);
                    sb2.append("_");
                    sb2.append(this.f18989c);
                    sb2.append("_v");
                    edit.putInt(sb2.toString(), Integer.parseInt(this.f18988b));
                    edit.commit();
                    Bitmap bitmap = null;
                    try {
                        bitmap = Media.getBitmap(t_card.this.getContentResolver(), Uri.fromFile(new File(t_card.this.getApplicationContext().getFilesDir(), this.f18987a)));
                        z = true;
                    } catch (Exception e) {
                        e.printStackTrace();
                        z = false;
                    }
                    if (z) {
                        if (this.f18992f == 1) {
                            ((ImageView) cardView.findViewById(R.id.img)).setImageBitmap(bitmap);
                        } else if (this.f18992f == 2) {
                            ((ImageView) cardView.findViewById(R.id.iv_cab_card)).setImageBitmap(bitmap);
                        } else if (this.f18992f == 3) {
                            ((ImageView) cardView.findViewById(R.id.iv_btn)).setImageBitmap(bitmap);
                        }
                    }
                }
                new C5818e().execute(new String[0]);
            }
        }
    }

    /* renamed from: mega.boicot.t_card$f */
    private class C5819f extends AsyncTask<String, Void, String> {

        /* renamed from: a */
        String f18994a;

        /* renamed from: b */
        String f18995b;

        /* renamed from: c */
        Bitmap f18996c;

        /* renamed from: d */
        int f18997d;

        private C5819f() {
            this.f18997d = -1;
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
            if (t_card.this.f18948s != null) {
                int i = 0;
                while (true) {
                    if (i >= t_card.this.f18948s.size()) {
                        break;
                    }
                    C5816c cVar = (C5816c) t_card.this.f18948s.get(i);
                    if (cVar.f18982c) {
                        this.f18997d = i;
                        StringBuilder sb = new StringBuilder();
                        sb.append("o718963_");
                        sb.append(cVar.f18980a);
                        sb.append(".png");
                        this.f18994a = sb.toString();
                        this.f18995b = cVar.f18983d;
                        cVar.f18982c = false;
                        break;
                    }
                    i++;
                }
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public String doInBackground(String... strArr) {
            if (this.f18997d == -1) {
                return "-1";
            }
            try {
                StringBuilder sb = new StringBuilder();
                sb.append("http://imgs1.e-droid.net/srv/imgs/cards/");
                sb.append(this.f18994a);
                sb.append("?v=");
                sb.append(this.f18995b);
                try {
                    HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(sb.toString()).openConnection();
                    httpURLConnection.setDoInput(true);
                    httpURLConnection.setConnectTimeout(10000);
                    httpURLConnection.setReadTimeout(20000);
                    httpURLConnection.connect();
                    InputStream inputStream = httpURLConnection.getInputStream();
                    this.f18996c = BitmapFactory.decodeStream(inputStream);
                    inputStream.close();
                    httpURLConnection.disconnect();
                    try {
                        FileOutputStream fileOutputStream = new FileOutputStream(new File(t_card.this.getApplicationContext().getFilesDir(), this.f18994a));
                        if (this.f18996c.hasAlpha()) {
                            this.f18996c.compress(CompressFormat.PNG, 100, fileOutputStream);
                        } else {
                            this.f18996c.compress(CompressFormat.JPEG, 70, fileOutputStream);
                        }
                        return "1";
                    } catch (Exception unused) {
                        return "0";
                    }
                } catch (IOException unused2) {
                    return "0";
                }
            } catch (MalformedURLException unused3) {
                return "0";
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void onPostExecute(String str) {
            Bitmap bitmap;
            if (this.f18997d != -1 && t_card.this.f18948s != null) {
                View findViewById = t_card.this.findViewById(R.id.llcards);
                StringBuilder sb = new StringBuilder();
                sb.append(TtmlNode.ATTR_ID);
                sb.append(((C5816c) t_card.this.f18948s.get(this.f18997d)).f18981b);
                CardView cardView = (CardView) findViewById.findViewWithTag(sb.toString());
                StringBuilder sb2 = new StringBuilder();
                sb2.append("idopc");
                sb2.append(((C5816c) t_card.this.f18948s.get(this.f18997d)).f18980a);
                CardView cardView2 = (CardView) cardView.findViewWithTag(sb2.toString());
                cardView2.findViewById(R.id.pb_card_opc).setVisibility(8);
                cardView2.findViewById(R.id.pb_card_opc_inv).setVisibility(8);
                if (str.equals("1")) {
                    Editor edit = t_card.this.f18929J.edit();
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("o718963_");
                    sb3.append(((C5816c) t_card.this.f18948s.get(this.f18997d)).f18980a);
                    sb3.append("_v");
                    edit.putInt(sb3.toString(), Integer.parseInt(this.f18995b));
                    edit.commit();
                    boolean z = true;
                    try {
                        bitmap = Media.getBitmap(t_card.this.getContentResolver(), Uri.fromFile(new File(t_card.this.getApplicationContext().getFilesDir(), this.f18994a)));
                    } catch (Exception e) {
                        e.printStackTrace();
                        z = false;
                        bitmap = null;
                    }
                    if (z) {
                        ((ImageView) cardView2.findViewById(R.id.iv_card_opc)).setImageBitmap(bitmap);
                    }
                }
                new C5819f().execute(new String[0]);
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
        this.f18934e = (config) getApplicationContext();
        if (this.f18934e.f17881aN == null) {
            this.f18934e.mo20780b();
        }
        String str = this.f18934e.f17971bz[this.f18934e.f18075l].f18314g;
        String str2 = this.f18934e.f17971bz[this.f18934e.f18075l].f18315h;
        StringBuilder sb = new StringBuilder();
        sb.append("#");
        sb.append(str);
        this.f18938i = config.m23844a(sb.toString());
        this.f18946q = config.m23831a(str, this.f18934e.f17890aW);
        if (VERSION.SDK_INT > 12 && !this.f18938i) {
            setTheme(R.style.holonolight);
        }
        this.f18927H = getIntent().getExtras();
        if (bundle == null) {
            this.f18937h = this.f18927H != null && this.f18927H.containsKey("es_root") && this.f18927H.getBoolean("es_root", false);
        } else {
            this.f18937h = bundle.containsKey("es_root") && bundle.getBoolean("es_root", false);
        }
        this.f18931b = this.f18934e.f18075l;
        this.f18933d = this.f18934e.f17971bz[this.f18931b].f18330w;
        super.onCreate(bundle);
        this.f18939j = config.m23845b((Context) this, 2);
        this.f18940k = config.m23845b((Context) this, 3);
        this.f18941l = config.m23845b((Context) this, 4);
        this.f18942m = config.m23845b((Context) this, 8);
        this.f18943n = config.m23845b((Context) this, 12);
        this.f18944o = config.m23845b((Context) this, 16);
        this.f18945p = config.m23845b((Context) this, 100);
        this.f18929J = getSharedPreferences("sh", 0);
        this.f18930a = this.f18929J.getInt("idusu", 0);
        setContentView(R.layout.t_card);
        mo21156f();
        if (this.f18934e.f18080q > 0) {
            SearchManager searchManager = (SearchManager) getSystemService("search");
            searchManager.setOnCancelListener(new OnCancelListener() {
                public void onCancel() {
                    t_card.this.f18935f = false;
                    t_card.this.setResult(0);
                }
            });
            searchManager.setOnDismissListener(new OnDismissListener() {
                public void onDismiss() {
                    t_card.this.f18923D = false;
                }
            });
        }
        this.f18934e.mo20770a((Context) this, this.f18927H != null && this.f18927H.containsKey("ad_entrar"), this.f18927H != null && this.f18927H.containsKey("fb_entrar"));
        this.f18953x = this.f18934e.mo20760a((Context) this, false);
        this.f18934e.mo20767a((Context) this, this.f18934e.f18075l, this.f18946q, bundle);
        if (!str.equals("")) {
            Orientation orientation = Orientation.TOP_BOTTOM;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("#");
            sb2.append(str);
            StringBuilder sb3 = new StringBuilder();
            sb3.append("#");
            sb3.append(str2);
            findViewById(R.id.ll_princ).setBackgroundDrawable(new GradientDrawable(orientation, new int[]{Color.parseColor(sb2.toString()), Color.parseColor(sb3.toString())}));
        }
        if (this.f18938i) {
            this.f18926G = (ProgressBar) findViewById(R.id.pb_inv);
        } else {
            this.f18926G = (ProgressBar) findViewById(R.id.pb);
        }
        if (VERSION.SDK_INT > 20) {
            config.m23838a(this.f18926G, this.f18934e.f17890aW);
        }
        if (config.m23858k(this)) {
            int i = this.f18934e.f17971bz[this.f18931b].f18332y;
            SharedPreferences sharedPreferences = this.f18929J;
            StringBuilder sb4 = new StringBuilder();
            sb4.append("s");
            sb4.append(this.f18933d);
            sb4.append("_v_guardado");
            if (i > sharedPreferences.getInt(sb4.toString(), -1)) {
                this.f18950u = new C5817d(0);
                this.f18950u.execute(new String[0]);
                return;
            }
            m24131g();
            return;
        }
        m24131g();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo21155b(int i) {
        startActivityForResult(this.f18934e.mo20762a(Integer.valueOf(i), (Context) this).f18226a, 0);
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i2 == -1 && intent != null && intent.hasExtra("finalizar") && intent.getExtras().getBoolean("finalizar")) {
            if (!intent.getExtras().getBoolean("finalizar_app")) {
                this.f18937h = false;
            }
            setResult(-1, intent);
            finish();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public void mo21156f() {
        int b = this.f18934e.mo20778b((Context) this);
        if (this.f18934e.f18045dm == 1) {
            this.f18928I = (ListView) findViewById(R.id.left_drawer);
            this.f18934e.mo20771a(this.f18928I);
        } else if (this.f18934e.f18045dm == 0) {
            int i = 0;
            for (int i2 = 0; i2 < this.f18934e.f17971bz.length; i2++) {
                if (!this.f18934e.f17971bz[i2].f18333z) {
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
        for (int i3 = 0; i3 < this.f18934e.f17923bD.length; i3++) {
            if (this.f18934e.f17923bD[i3] > 0) {
                findViewById(this.f18934e.f17923bD[i3]).setOnClickListener(this);
            }
        }
    }

    public void onClick(View view) {
        if ((this.f18934e.f17986cO == null || this.f18934e.f17986cO.equals("")) && ((this.f18934e.f17985cN == null || this.f18934e.f17985cN.equals("")) && ((this.f18934e.f17988cQ == null || this.f18934e.f17988cQ.equals("")) && (this.f18934e.f17989cR == null || this.f18934e.f17989cR.equals(""))))) {
            abrir_secc(view);
            return;
        }
        if (this.f18934e.f17986cO != null && !this.f18934e.f17986cO.equals("")) {
            this.f18955z = new RewardedVideo((Context) this, this.f18934e.f17986cO);
        }
        if (this.f18934e.f17985cN != null && !this.f18934e.f17985cN.equals("")) {
            this.f18954y = C2997g.m10716a(this);
        }
        if (this.f18934e.f17988cQ != null && !this.f18934e.f17988cQ.equals("")) {
            this.f18920A = new RewardedVideoAd(this, this.f18934e.f17988cQ);
        }
        if (this.f18934e.f17989cR != null && !this.f18934e.f17989cR.equals("")) {
            this.f18921B = new StartAppAd(this);
        }
        this.f18925F = new ProgressDialog(this);
        this.f18924E = view;
        if (!this.f18934e.mo20774a((Context) this, view, this.f18946q, this.f18925F, this.f18954y, this.f18955z, this.f18920A, this.f18921B)) {
            abrir_secc(view);
        }
    }

    public void abrir_secc(View view) {
        if (view != null) {
            C5662h a = this.f18934e.mo20761a(view, (Context) this);
            if (a.f18227b) {
                this.f18935f = true;
                Intent intent = new Intent();
                intent.putExtra("finalizar", true);
                intent.putExtra("finalizar_app", a.f18228c);
                setResult(-1, intent);
            }
            if (a.f18229d) {
                startActivityForResult(a.f18226a, 0);
            } else if (a.f18226a != null) {
                if (a.f18227b && this.f18934e.f18045dm != 2) {
                    a.f18226a.putExtra("es_root", true);
                }
                this.f18937h = false;
                startActivity(a.f18226a);
            }
            if (this.f18935f && !this.f18923D) {
                finish();
            }
        } else if (this.f18932c != -1) {
            mo21155b(this.f18932c);
        }
    }

    /* access modifiers changed from: private */
    @TargetApi(17)
    /* renamed from: g */
    public void m24131g() {
        int i;
        String[] strArr;
        LinearLayout linearLayout;
        int i2;
        String str;
        String str2;
        String str3;
        String str4;
        int i3;
        int i4;
        C5814a aVar;
        int i5;
        C5815b bVar;
        String[] strArr2;
        int i6;
        CardView cardView;
        LinearLayout linearLayout2;
        int i7;
        LinearLayout linearLayout3;
        LinearLayout linearLayout4;
        C5815b bVar2;
        HorizontalScrollView horizontalScrollView;
        int i8;
        char c;
        String[] strArr3;
        ProgressBar progressBar;
        ProgressBar progressBar2;
        ProgressBar progressBar3;
        SharedPreferences sharedPreferences = this.f18929J;
        StringBuilder sb = new StringBuilder();
        sb.append("cards_");
        sb.append(this.f18933d);
        String string = sharedPreferences.getString(sb.toString(), "");
        if (!string.equals("")) {
            String[] split = string.split(";");
            this.f18947r = new ArrayList<>();
            this.f18948s = new ArrayList<>();
            this.f18949t = new ArrayList<>();
            LinearLayout linearLayout5 = (LinearLayout) findViewById(R.id.llcards);
            LayoutInflater layoutInflater = (LayoutInflater) getSystemService("layout_inflater");
            int i9 = -1;
            int i10 = 0;
            int i11 = -1;
            int i12 = 0;
            while (!split[i].equals("") && !split[i].equals("S") && !split[i].equals("N")) {
                String[] split2 = split[i].split(",");
                if (split2[1].equals("0")) {
                    C5815b bVar3 = new C5815b();
                    bVar3.f18972a = Integer.parseInt(split2[i10]);
                    CardView cardView2 = new CardView(this);
                    LayoutParams layoutParams = new LayoutParams(i9, -2);
                    layoutParams.setMargins(i10, this.f18941l, i10, this.f18941l);
                    cardView2.setLayoutParams(layoutParams);
                    LinearLayout linearLayout6 = new LinearLayout(this);
                    linearLayout6.setLayoutParams(new LayoutParams(i9, -2));
                    linearLayout6.setOrientation(1);
                    if (!split2[44].equals("")) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("#");
                        sb2.append(split2[44]);
                        cardView2.setCardBackgroundColor(Color.parseColor(sb2.toString()));
                    }
                    if (split2[2].equals("0")) {
                        cardView2.setCardBackgroundColor(i10);
                        cardView2.setCardElevation(0.0f);
                    } else {
                        cardView2.setUseCompatPadding(true);
                        cardView2.setCardElevation((float) this.f18939j);
                    }
                    if (!split2[3].equals("0")) {
                        cardView2.setTag(R.id.idaux1, split2[3]);
                        cardView2.setOnClickListener(new OnClickListener() {
                            public void onClick(View view) {
                                View view2 = new View(t_card.this);
                                int indexOf = t_card.this.f18934e.f17920bA.indexOf(Integer.valueOf(Integer.parseInt((String) view.getTag(R.id.idaux1))));
                                view2.setId(indexOf);
                                view2.setTag(R.id.TAG_IDSECC, Integer.valueOf(indexOf));
                                if (t_card.this.f18934e.f17986cO != null && !t_card.this.f18934e.f17986cO.equals("")) {
                                    t_card.this.f18955z = new RewardedVideo((Context) t_card.this, t_card.this.f18934e.f17986cO);
                                }
                                if (t_card.this.f18934e.f17985cN != null && !t_card.this.f18934e.f17985cN.equals("")) {
                                    t_card.this.f18954y = C2997g.m10716a(t_card.this);
                                }
                                if (t_card.this.f18934e.f17988cQ != null && !t_card.this.f18934e.f17988cQ.equals("")) {
                                    t_card.this.f18920A = new RewardedVideoAd(t_card.this, t_card.this.f18934e.f17988cQ);
                                }
                                if (t_card.this.f18934e.f17989cR != null && !t_card.this.f18934e.f17989cR.equals("")) {
                                    t_card.this.f18921B = new StartAppAd(t_card.this);
                                }
                                t_card.this.f18925F = new ProgressDialog(t_card.this);
                                t_card.this.f18924E = null;
                                t_card.this.f18932c = indexOf;
                                if (!t_card.this.f18934e.mo20774a((Context) t_card.this, view2, t_card.this.f18946q, t_card.this.f18925F, t_card.this.f18954y, t_card.this.f18955z, t_card.this.f18920A, t_card.this.f18921B)) {
                                    t_card.this.mo21155b(indexOf);
                                }
                            }
                        });
                    } else if (!split2[4].equals("")) {
                        cardView2.setTag(R.id.idaux1, split2[4].replace("@X@", ",").replace("@Y@", ";"));
                        if (split2[46].equals("0")) {
                            cardView2.setOnClickListener(new OnClickListener() {
                                public void onClick(View view) {
                                    String str = (String) view.getTag(R.id.idaux1);
                                    String lowerCase = str.toLowerCase();
                                    Intent d = t_card.this.f18934e.mo20784d(str);
                                    if (!d.getAction().equals("android.intent.action.VIEW") || lowerCase.endsWith(DefaultHlsExtractorFactory.MP3_FILE_EXTENSION) || lowerCase.endsWith(".mp4") || lowerCase.endsWith(".3gp")) {
                                        t_card.this.startActivityForResult(d, 0);
                                        return;
                                    }
                                    Intent intent = new Intent(t_card.this, t_url.class);
                                    intent.putExtra("url", str);
                                    try {
                                        t_card.this.startActivityForResult(intent, 0);
                                    } catch (Exception unused) {
                                    }
                                }
                            });
                        } else {
                            cardView2.setOnClickListener(new OnClickListener() {
                                public void onClick(View view) {
                                    try {
                                        t_card.this.startActivityForResult(t_card.this.f18934e.mo20784d((String) view.getTag(R.id.idaux1)), 0);
                                    } catch (Exception unused) {
                                    }
                                }
                            });
                        }
                    }
                    int i13 = 1;
                    while (i13 < 5) {
                        String str5 = split2[5];
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("");
                        sb3.append(i13);
                        if (!str5.equals(sb3.toString()) || !split2[43].equals("1")) {
                            i7 = i11;
                            String str6 = split2[6];
                            StringBuilder sb4 = new StringBuilder();
                            sb4.append("");
                            sb4.append(i13);
                            if (str6.equals(sb4.toString())) {
                                RelativeLayout relativeLayout = (RelativeLayout) layoutInflater.inflate(R.layout.t_card_cab, null);
                                LinearLayout linearLayout7 = (LinearLayout) relativeLayout.findViewById(R.id.ll_tit);
                                LinearLayout linearLayout8 = (LinearLayout) relativeLayout.findViewById(R.id.ll_tit_2);
                                if (!split2[14].equals("")) {
                                    StringBuilder sb5 = new StringBuilder();
                                    sb5.append("#");
                                    sb5.append(split2[14]);
                                    relativeLayout.setBackgroundColor(Color.parseColor(sb5.toString()));
                                }
                                if (split2[15].equals("1")) {
                                    RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) linearLayout7.getLayoutParams();
                                    layoutParams2.addRule(13);
                                    linearLayout7.setLayoutParams(layoutParams2);
                                    linearLayout2 = linearLayout5;
                                } else {
                                    RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) linearLayout7.getLayoutParams();
                                    linearLayout2 = linearLayout5;
                                    if (VERSION.SDK_INT >= 17) {
                                        layoutParams3.addRule(20);
                                    } else {
                                        layoutParams3.addRule(9);
                                    }
                                    linearLayout7.setLayoutParams(layoutParams3);
                                }
                                if (split2[16].equals("1")) {
                                    int parseInt = Integer.parseInt(split2[17]);
                                    SharedPreferences sharedPreferences2 = this.f18929J;
                                    StringBuilder sb6 = new StringBuilder();
                                    cardView = cardView2;
                                    sb6.append("c718963_");
                                    sb6.append(bVar3.f18972a);
                                    sb6.append("_logo_v");
                                    if (parseInt > sharedPreferences2.getInt(sb6.toString(), -1)) {
                                        bVar3.f18974c = true;
                                        bVar3.f18977f = split2[17];
                                        if (this.f18938i) {
                                            progressBar2 = (ProgressBar) relativeLayout.findViewById(R.id.pb_logo_inv);
                                        } else {
                                            progressBar2 = (ProgressBar) relativeLayout.findViewById(R.id.pb_logo);
                                        }
                                        if (VERSION.SDK_INT > 20) {
                                            config.m23838a(progressBar2, this.f18934e.f17890aW);
                                        }
                                        progressBar2.setVisibility(0);
                                    } else {
                                        File filesDir = getApplicationContext().getFilesDir();
                                        StringBuilder sb7 = new StringBuilder();
                                        sb7.append("c718963_");
                                        sb7.append(bVar3.f18972a);
                                        sb7.append("_logo.png");
                                        File file = new File(filesDir, sb7.toString());
                                        if (file.exists()) {
                                            try {
                                                ((ImageView) relativeLayout.findViewById(R.id.iv_cab_card)).setImageBitmap(Media.getBitmap(getContentResolver(), Uri.fromFile(file)));
                                            } catch (Exception e) {
                                                e.printStackTrace();
                                            }
                                        }
                                    }
                                    if (!split2[18].trim().equals("") || !split2[21].trim().equals("")) {
                                        LayoutParams layoutParams4 = new LayoutParams(-2, -2);
                                        layoutParams4.setMargins(0, 0, this.f18943n, 0);
                                        if (VERSION.SDK_INT >= 17) {
                                            layoutParams4.setMarginStart(0);
                                            layoutParams4.setMarginEnd(this.f18943n);
                                        }
                                        ((FrameLayout) relativeLayout.findViewById(R.id.fl_cab_card)).setLayoutParams(layoutParams4);
                                        ((ImageView) relativeLayout.findViewById(R.id.iv_cab_card)).setMaxHeight(this.f18945p);
                                    } else {
                                        ((ImageView) relativeLayout.findViewById(R.id.iv_cab_card)).setMaxHeight(this.f18945p);
                                    }
                                    relativeLayout.findViewById(R.id.fl_cab_card).setVisibility(0);
                                } else {
                                    cardView = cardView2;
                                }
                                String trim = split2[18].trim();
                                if (!trim.equals("")) {
                                    TextView textView = (TextView) relativeLayout.findViewById(R.id.tv_tit);
                                    textView.setTextSize(Float.parseFloat(split2[20]));
                                    StringBuilder sb8 = new StringBuilder();
                                    sb8.append("#");
                                    sb8.append(split2[19]);
                                    textView.setTextColor(Color.parseColor(sb8.toString()));
                                    textView.setText(trim.replace("@X@", ",").replace("@Y@", ";"));
                                    textView.setVisibility(0);
                                }
                                String trim2 = split2[21].trim();
                                if (!trim2.equals("")) {
                                    TextView textView2 = (TextView) relativeLayout.findViewById(R.id.tv_subtit);
                                    textView2.setTextSize(Float.parseFloat(split2[23]));
                                    StringBuilder sb9 = new StringBuilder();
                                    sb9.append("#");
                                    sb9.append(split2[22]);
                                    textView2.setTextColor(Color.parseColor(sb9.toString()));
                                    textView2.setText(trim2.replace("@X@", ",").replace("@Y@", ";"));
                                    textView2.setVisibility(0);
                                }
                                if (split2[16].equals("1") || !split2[18].trim().equals("") || !split2[21].trim().equals("")) {
                                    linearLayout7.setVisibility(0);
                                    if (!split2[18].trim().equals("") || !split2[21].trim().equals("")) {
                                        linearLayout8.setVisibility(0);
                                    }
                                }
                                if (split2[24].equals("1")) {
                                    int parseInt2 = Integer.parseInt(split2[25]);
                                    SharedPreferences sharedPreferences3 = this.f18929J;
                                    StringBuilder sb10 = new StringBuilder();
                                    sb10.append("c718963_");
                                    sb10.append(bVar3.f18972a);
                                    sb10.append("_btn_v");
                                    if (parseInt2 > sharedPreferences3.getInt(sb10.toString(), -1)) {
                                        bVar3.f18975d = true;
                                        bVar3.f18978g = split2[25];
                                        if (this.f18938i) {
                                            progressBar = (ProgressBar) relativeLayout.findViewById(R.id.pb_btn_inv);
                                        } else {
                                            progressBar = (ProgressBar) relativeLayout.findViewById(R.id.pb_btn);
                                        }
                                        if (VERSION.SDK_INT > 20) {
                                            config.m23838a(progressBar, this.f18934e.f17890aW);
                                        }
                                        progressBar.setVisibility(0);
                                    } else {
                                        File filesDir2 = getApplicationContext().getFilesDir();
                                        StringBuilder sb11 = new StringBuilder();
                                        sb11.append("c718963_");
                                        sb11.append(bVar3.f18972a);
                                        sb11.append("_btn.png");
                                        File file2 = new File(filesDir2, sb11.toString());
                                        if (file2.exists()) {
                                            try {
                                                ((ImageView) relativeLayout.findViewById(R.id.iv_btn)).setImageBitmap(Media.getBitmap(getContentResolver(), Uri.fromFile(file2)));
                                            } catch (Exception e2) {
                                                e2.printStackTrace();
                                            }
                                        }
                                    }
                                    relativeLayout.findViewById(R.id.fl_btn).setVisibility(0);
                                } else if (!split2[26].trim().equals("")) {
                                    TextView textView3 = (TextView) relativeLayout.findViewById(R.id.tv_btn);
                                    textView3.setTextSize(Float.parseFloat(split2[28]));
                                    StringBuilder sb12 = new StringBuilder();
                                    sb12.append("#");
                                    sb12.append(split2[27]);
                                    textView3.setTextColor(Color.parseColor(sb12.toString()));
                                    if (!split2[29].equals("")) {
                                        textView3.setBackgroundResource(R.drawable.fondo_rounded_2);
                                        GradientDrawable gradientDrawable = (GradientDrawable) textView3.getBackground();
                                        StringBuilder sb13 = new StringBuilder();
                                        sb13.append("#");
                                        sb13.append(split2[29]);
                                        gradientDrawable.setColor(Color.parseColor(sb13.toString()));
                                    }
                                    textView3.setText(split2[26].trim().replace("@X@", ",").replace("@Y@", ";"));
                                    textView3.setVisibility(0);
                                }
                                if (split2[24].equals("1") || !split2[26].trim().equals("")) {
                                    LinearLayout linearLayout9 = (LinearLayout) relativeLayout.findViewById(R.id.ll_btn);
                                    linearLayout9.setVisibility(0);
                                    if (!split2[30].equals("0")) {
                                        linearLayout9.setTag(R.id.idaux1, split2[30]);
                                        linearLayout9.setOnClickListener(new OnClickListener() {
                                            public void onClick(View view) {
                                                View view2 = new View(t_card.this);
                                                int indexOf = t_card.this.f18934e.f17920bA.indexOf(Integer.valueOf(Integer.parseInt((String) view.getTag(R.id.idaux1))));
                                                view2.setId(indexOf);
                                                view2.setTag(R.id.TAG_IDSECC, Integer.valueOf(indexOf));
                                                if (t_card.this.f18934e.f17986cO != null && !t_card.this.f18934e.f17986cO.equals("")) {
                                                    t_card.this.f18955z = new RewardedVideo((Context) t_card.this, t_card.this.f18934e.f17986cO);
                                                }
                                                if (t_card.this.f18934e.f17985cN != null && !t_card.this.f18934e.f17985cN.equals("")) {
                                                    t_card.this.f18954y = C2997g.m10716a(t_card.this);
                                                }
                                                if (t_card.this.f18934e.f17988cQ != null && !t_card.this.f18934e.f17988cQ.equals("")) {
                                                    t_card.this.f18920A = new RewardedVideoAd(t_card.this, t_card.this.f18934e.f17988cQ);
                                                }
                                                if (t_card.this.f18934e.f17989cR != null && !t_card.this.f18934e.f17989cR.equals("")) {
                                                    t_card.this.f18921B = new StartAppAd(t_card.this);
                                                }
                                                t_card.this.f18925F = new ProgressDialog(t_card.this);
                                                t_card.this.f18924E = null;
                                                t_card.this.f18932c = indexOf;
                                                if (!t_card.this.f18934e.mo20774a((Context) t_card.this, view2, t_card.this.f18946q, t_card.this.f18925F, t_card.this.f18954y, t_card.this.f18955z, t_card.this.f18920A, t_card.this.f18921B)) {
                                                    t_card.this.mo21155b(indexOf);
                                                }
                                            }
                                        });
                                    } else if (!split2[31].equals("")) {
                                        linearLayout9.setTag(R.id.idaux1, split2[31].replace("@X@", ",").replace("@Y@", ";"));
                                        if (split2[47].equals("0")) {
                                            linearLayout9.setOnClickListener(new OnClickListener() {
                                                public void onClick(View view) {
                                                    String str = (String) view.getTag(R.id.idaux1);
                                                    String lowerCase = str.toLowerCase();
                                                    Intent d = t_card.this.f18934e.mo20784d(str);
                                                    if (!d.getAction().equals("android.intent.action.VIEW") || lowerCase.endsWith(DefaultHlsExtractorFactory.MP3_FILE_EXTENSION) || lowerCase.endsWith(".mp4") || lowerCase.endsWith(".3gp")) {
                                                        t_card.this.startActivityForResult(d, 0);
                                                        return;
                                                    }
                                                    Intent intent = new Intent(t_card.this, t_url.class);
                                                    intent.putExtra("url", str);
                                                    try {
                                                        t_card.this.startActivityForResult(intent, 0);
                                                    } catch (Exception unused) {
                                                    }
                                                }
                                            });
                                        } else {
                                            linearLayout9.setOnClickListener(new OnClickListener() {
                                                public void onClick(View view) {
                                                    try {
                                                        t_card.this.startActivityForResult(t_card.this.f18934e.mo20784d((String) view.getTag(R.id.idaux1)), 0);
                                                    } catch (Exception unused) {
                                                    }
                                                }
                                            });
                                        }
                                        linearLayout6.addView(relativeLayout);
                                    }
                                }
                                linearLayout6.addView(relativeLayout);
                            } else {
                                cardView = cardView2;
                                linearLayout2 = linearLayout5;
                                String str7 = split2[7];
                                StringBuilder sb14 = new StringBuilder();
                                sb14.append("");
                                sb14.append(i13);
                                if (!str7.equals(sb14.toString()) || split2[33].trim().equals("")) {
                                    String str8 = split2[8];
                                    StringBuilder sb15 = new StringBuilder();
                                    sb15.append("");
                                    sb15.append(i13);
                                    if (str8.equals(sb15.toString())) {
                                        int parseInt3 = Integer.parseInt(split2[45]);
                                        if (parseInt3 > 0) {
                                            char c2 = '&';
                                            if (split2[39].equals("1") || (split2[39].equals("0") && split2[41].equals("1"))) {
                                                C5815b bVar4 = bVar3;
                                                i6 = i13;
                                                strArr2 = split;
                                                if (!split2[41].equals("0") || !split2[42].equals("0")) {
                                                    linearLayout3 = (LinearLayout) layoutInflater.inflate(R.layout.t_card_aux2_cen, null);
                                                } else {
                                                    linearLayout3 = (LinearLayout) layoutInflater.inflate(R.layout.t_card_aux2, null);
                                                }
                                                TableLayout tableLayout = (TableLayout) linearLayout3.findViewById(R.id.tl_opc);
                                                if (!split2[37].equals("")) {
                                                    StringBuilder sb16 = new StringBuilder();
                                                    sb16.append("#");
                                                    sb16.append(split2[37]);
                                                    linearLayout3.setBackgroundColor(Color.parseColor(sb16.toString()));
                                                }
                                                if (split2[41].equals("1")) {
                                                    tableLayout.setLayoutParams(new TableLayout.LayoutParams(-1, -2));
                                                }
                                                int parseInt4 = Integer.parseInt(split2[40]);
                                                if (split2[39].equals("0")) {
                                                    parseInt4 = 99999;
                                                }
                                                TableRow tableRow = new TableRow(this);
                                                tableRow.setPadding(0, 0, 0, 0);
                                                int i14 = i + 1;
                                                TableRow tableRow2 = tableRow;
                                                int i15 = 0;
                                                while (i14 <= i + parseInt3) {
                                                    i15++;
                                                    C5815b bVar5 = bVar4;
                                                    int i16 = parseInt3;
                                                    int i17 = i;
                                                    CardView a = m24129a(strArr2[i14], bVar5.f18972a, split2[38].equals("1"));
                                                    if (split2[38].equals("1")) {
                                                        TableRow.LayoutParams layoutParams5 = new TableRow.LayoutParams(-1, -2);
                                                        bVar2 = bVar5;
                                                        linearLayout4 = linearLayout3;
                                                        layoutParams5.setMargins(this.f18940k, this.f18940k, this.f18940k, this.f18940k);
                                                        a.setLayoutParams(layoutParams5);
                                                    } else {
                                                        linearLayout4 = linearLayout3;
                                                        bVar2 = bVar5;
                                                    }
                                                    if (i15 > 1) {
                                                        tableRow2.addView((CardView) layoutInflater.inflate(R.layout.t_card_opc_aux, null));
                                                    }
                                                    tableRow2.addView(a);
                                                    if (i15 == parseInt4) {
                                                        tableLayout.addView(tableRow2);
                                                        TableRow tableRow3 = new TableRow(this);
                                                        tableRow3.setPadding(0, this.f18942m, 0, 0);
                                                        tableRow2 = tableRow3;
                                                        i15 = 0;
                                                    }
                                                    i14++;
                                                    parseInt3 = i16;
                                                    i = i17;
                                                    bVar4 = bVar2;
                                                    linearLayout3 = linearLayout4;
                                                }
                                                LinearLayout linearLayout10 = linearLayout3;
                                                bVar = bVar4;
                                                if (i15 > 0) {
                                                    tableLayout.addView(tableRow2);
                                                }
                                                int i18 = i14 - 1;
                                                if (split2[41].equals("1")) {
                                                    boolean z = false;
                                                    TableRow tableRow4 = (TableRow) tableLayout.getChildAt(0);
                                                    if (tableRow4 != null) {
                                                        int i19 = 0;
                                                        while (i19 < tableRow4.getChildCount()) {
                                                            if (i19 % 2 == 0) {
                                                                tableLayout.setColumnStretchable(i19, true);
                                                            } else {
                                                                tableLayout.setColumnShrinkable(i19, z);
                                                            }
                                                            i19++;
                                                            z = false;
                                                        }
                                                    }
                                                }
                                                linearLayout6.addView(linearLayout10);
                                                i = i18;
                                                i13 = i6 + 1;
                                                i11 = i7;
                                                linearLayout5 = linearLayout2;
                                                cardView2 = cardView;
                                                split = strArr2;
                                                bVar3 = bVar;
                                            } else {
                                                if (split2[42].equals("1")) {
                                                    horizontalScrollView = (HorizontalScrollView) layoutInflater.inflate(R.layout.t_card_aux1_cen, null);
                                                } else {
                                                    horizontalScrollView = (HorizontalScrollView) layoutInflater.inflate(R.layout.t_card_aux1, null);
                                                }
                                                LinearLayout linearLayout11 = (LinearLayout) horizontalScrollView.findViewById(R.id.ll_opc);
                                                if (!split2[37].equals("")) {
                                                    StringBuilder sb17 = new StringBuilder();
                                                    sb17.append("#");
                                                    sb17.append(split2[37]);
                                                    horizontalScrollView.setBackgroundColor(Color.parseColor(sb17.toString()));
                                                }
                                                int i20 = i + 1;
                                                boolean z2 = true;
                                                while (i20 <= i + parseInt3) {
                                                    int i21 = i13;
                                                    C5815b bVar6 = bVar3;
                                                    CardView a2 = m24129a(split[i20], bVar3.f18972a, split2[c2].equals("1"));
                                                    if (!z2) {
                                                        i8 = this.f18942m;
                                                        c = '&';
                                                    } else {
                                                        c = '&';
                                                        i8 = split2[38].equals("1") ? this.f18940k : 0;
                                                    }
                                                    int i22 = split2[c].equals("1") ? this.f18940k : 0;
                                                    if (i8 > 0 || i22 > 0) {
                                                        strArr3 = split;
                                                        LayoutParams layoutParams6 = new LayoutParams(-1, -2);
                                                        layoutParams6.setMargins(i8, i22, i22, i22);
                                                        if (VERSION.SDK_INT >= 17) {
                                                            layoutParams6.setMarginStart(i8);
                                                            layoutParams6.setMarginEnd(i22);
                                                        }
                                                        a2.setLayoutParams(layoutParams6);
                                                    } else {
                                                        strArr3 = split;
                                                    }
                                                    linearLayout11.addView(a2);
                                                    i20++;
                                                    i13 = i21;
                                                    bVar3 = bVar6;
                                                    split = strArr3;
                                                    c2 = '&';
                                                    z2 = false;
                                                }
                                                C5815b bVar7 = bVar3;
                                                i6 = i13;
                                                strArr2 = split;
                                                int i23 = i20 - 1;
                                                linearLayout6.addView(horizontalScrollView);
                                                i = i23;
                                                bVar = bVar7;
                                                i13 = i6 + 1;
                                                i11 = i7;
                                                linearLayout5 = linearLayout2;
                                                cardView2 = cardView;
                                                split = strArr2;
                                                bVar3 = bVar;
                                            }
                                        }
                                    }
                                } else {
                                    LinearLayout linearLayout12 = new LinearLayout(this);
                                    linearLayout12.setLayoutParams(new LayoutParams(-1, -2));
                                    linearLayout12.setPadding(this.f18944o, this.f18944o, this.f18944o, this.f18944o);
                                    if (!split2[32].equals("")) {
                                        StringBuilder sb18 = new StringBuilder();
                                        sb18.append("#");
                                        sb18.append(split2[32]);
                                        linearLayout12.setBackgroundColor(Color.parseColor(sb18.toString()));
                                    }
                                    TextView textView4 = new TextView(this);
                                    textView4.setLayoutParams(new LayoutParams(-1, -2));
                                    if (split2[34].equals("1")) {
                                        textView4.setGravity(1);
                                    } else if (VERSION.SDK_INT >= 17 && getResources().getBoolean(R.bool.es_rtl)) {
                                        textView4.setTextDirection(4);
                                    }
                                    textView4.setTextSize(Float.parseFloat(split2[36]));
                                    StringBuilder sb19 = new StringBuilder();
                                    sb19.append("#");
                                    sb19.append(split2[35]);
                                    textView4.setTextColor(Color.parseColor(sb19.toString()));
                                    textView4.setText(split2[33].trim().replace("@X@", ",").replace("@Y@", ";"));
                                    textView4.setVisibility(0);
                                    linearLayout12.addView(textView4);
                                    linearLayout6.addView(linearLayout12);
                                }
                            }
                            bVar = bVar3;
                            i6 = i13;
                            strArr2 = split;
                        } else {
                            RelativeLayout relativeLayout2 = (RelativeLayout) layoutInflater.inflate(R.layout.t_card_img, null);
                            String trim3 = split2[10].trim();
                            if (!trim3.equals("")) {
                                TextView textView5 = (TextView) relativeLayout2.findViewById(R.id.tv_img_descr);
                                textView5.setTextSize(Float.parseFloat(split2[13]));
                                i7 = i11;
                                if (split2[11].equals("1")) {
                                    textView5.setGravity(1);
                                } else if (VERSION.SDK_INT >= 17 && getResources().getBoolean(R.bool.es_rtl)) {
                                    textView5.setTextDirection(4);
                                }
                                StringBuilder sb20 = new StringBuilder();
                                sb20.append("#");
                                sb20.append(split2[12]);
                                textView5.setTextColor(Color.parseColor(sb20.toString()));
                                textView5.setText(trim3.replace("@X@", ",").replace("@Y@", ";"));
                                relativeLayout2.findViewById(R.id.ll_img_descr).setVisibility(0);
                            } else {
                                i7 = i11;
                            }
                            int parseInt5 = Integer.parseInt(split2[9]);
                            SharedPreferences sharedPreferences4 = this.f18929J;
                            StringBuilder sb21 = new StringBuilder();
                            sb21.append("c718963_");
                            sb21.append(bVar3.f18972a);
                            sb21.append("_main_v");
                            if (parseInt5 > sharedPreferences4.getInt(sb21.toString(), -1)) {
                                bVar3.f18973b = true;
                                bVar3.f18976e = split2[9];
                                if (this.f18938i) {
                                    progressBar3 = (ProgressBar) relativeLayout2.findViewById(R.id.pb_main_inv);
                                } else {
                                    progressBar3 = (ProgressBar) relativeLayout2.findViewById(R.id.pb_main);
                                }
                                if (VERSION.SDK_INT > 20) {
                                    config.m23838a(progressBar3, this.f18934e.f17890aW);
                                }
                                progressBar3.setVisibility(0);
                            } else {
                                File filesDir3 = getApplicationContext().getFilesDir();
                                StringBuilder sb22 = new StringBuilder();
                                sb22.append("c718963_");
                                sb22.append(bVar3.f18972a);
                                sb22.append("_main.png");
                                File file3 = new File(filesDir3, sb22.toString());
                                if (file3.exists()) {
                                    try {
                                        ((ImageView) relativeLayout2.findViewById(R.id.img)).setImageBitmap(Media.getBitmap(getContentResolver(), Uri.fromFile(file3)));
                                    } catch (Exception e3) {
                                        e3.printStackTrace();
                                    }
                                }
                            }
                            linearLayout6.addView(relativeLayout2);
                            cardView = cardView2;
                            bVar = bVar3;
                            i6 = i13;
                            strArr2 = split;
                            linearLayout2 = linearLayout5;
                        }
                        i = i;
                        i13 = i6 + 1;
                        i11 = i7;
                        linearLayout5 = linearLayout2;
                        cardView2 = cardView;
                        split = strArr2;
                        bVar3 = bVar;
                    }
                    int i24 = i11;
                    CardView cardView3 = cardView2;
                    C5815b bVar8 = bVar3;
                    strArr = split;
                    LinearLayout linearLayout13 = linearLayout5;
                    int i25 = i;
                    StringBuilder sb23 = new StringBuilder();
                    sb23.append(TtmlNode.ATTR_ID);
                    C5815b bVar9 = bVar8;
                    sb23.append(bVar9.f18972a);
                    CardView cardView4 = cardView3;
                    cardView4.setTag(sb23.toString());
                    cardView4.addView(linearLayout6);
                    linearLayout = linearLayout13;
                    linearLayout.addView(cardView4);
                    this.f18947r.add(bVar9);
                    i11 = i24;
                    i2 = 1;
                    i9 = -1;
                } else {
                    int i26 = i11;
                    strArr = split;
                    linearLayout = linearLayout5;
                    if (this.f18934e.f18044dc) {
                        str4 = this.f18934e.f17996cY;
                        str3 = this.f18934e.f17997cZ;
                        str2 = this.f18934e.f18042da;
                        str = this.f18934e.f18043db;
                    } else {
                        str4 = split2[2].trim().replace("@X@", ",").replace("@Y@", ";");
                        str3 = split2[3].trim().replace("@X@", ",").replace("@Y@", ";");
                        str2 = split2[4].trim().replace("@X@", ",").replace("@Y@", ";");
                        str = split2[5].trim().replace("@X@", ",").replace("@Y@", ";");
                    }
                    boolean z3 = !str4.equals("");
                    boolean z4 = !str3.equals("") && this.f18934e.f18072eq != null && this.f18934e.f18072eq.size() > 0;
                    boolean z5 = !str2.equals("");
                    boolean z6 = !str.equals("");
                    ArrayList arrayList = new ArrayList();
                    if (z3) {
                        arrayList.add(Integer.valueOf(1));
                    }
                    if (z4) {
                        arrayList.add(Integer.valueOf(2));
                    }
                    if (z5) {
                        arrayList.add(Integer.valueOf(3));
                    }
                    if (z6) {
                        arrayList.add(Integer.valueOf(4));
                    }
                    if (!arrayList.isEmpty()) {
                        i4 = 0;
                        i3 = ((Integer) arrayList.get(new Random().nextInt(((arrayList.size() - 1) - 0) + 1) + 0)).intValue();
                    } else {
                        i4 = 0;
                        i3 = 0;
                    }
                    if (i3 != 0) {
                        aVar = new C5814a();
                        aVar.f18969a = Integer.parseInt(split2[i4]);
                        LinearLayout linearLayout14 = new LinearLayout(this);
                        i9 = -1;
                        LayoutParams layoutParams7 = new LayoutParams(-1, -2);
                        layoutParams7.setMargins(i4, this.f18941l, i4, this.f18941l);
                        linearLayout14.setLayoutParams(layoutParams7);
                        StringBuilder sb24 = new StringBuilder();
                        sb24.append(TtmlNode.ATTR_ID);
                        sb24.append(split2[i4]);
                        linearLayout14.setTag(sb24.toString());
                        linearLayout.addView(linearLayout14);
                        i5 = 1;
                    } else {
                        i9 = -1;
                        i5 = 1;
                        aVar = null;
                    }
                    if (i3 == i5) {
                        AdView adView = new AdView(this);
                        adView.setAdSize(C2973d.f8695e);
                        adView.setAdUnitId(str4);
                        View findViewById = findViewById(R.id.llcards);
                        StringBuilder sb25 = new StringBuilder();
                        sb25.append(TtmlNode.ATTR_ID);
                        sb25.append(aVar.f18969a);
                        LinearLayout linearLayout15 = (LinearLayout) findViewById.findViewWithTag(sb25.toString());
                        linearLayout15.setGravity(1);
                        linearLayout15.addView(adView);
                        adView.mo12166a(new C2972a().mo12209a());
                    } else if (i3 == 2) {
                        int i27 = i26 + 1;
                        int i28 = i27 > this.f18934e.f18072eq.size() - 1 ? 0 : i27;
                        this.f18934e.mo20765a(this, 1, 3, i28, null);
                        i11 = i28;
                        i2 = 1;
                    } else if (i3 == 3) {
                        aVar.f18970b = new NativeAd(this, str2);
                        aVar.f18970b.setAdListener(new NativeAdListener() {
                            public void onAdClicked(C1514Ad ad) {
                            }

                            public void onError(C1514Ad ad, AdError adError) {
                            }

                            public void onLoggingImpression(C1514Ad ad) {
                            }

                            public void onMediaDownloaded(C1514Ad ad) {
                            }

                            public void onAdLoaded(C1514Ad ad) {
                                NativeAdViewAttributes backgroundColor = new NativeAdViewAttributes().setTypeface(Typeface.MONOSPACE).setBackgroundColor(config.f17824d);
                                if (t_card.this.f18934e.f18020dE != null && !t_card.this.f18934e.f18020dE.equals("")) {
                                    StringBuilder sb = new StringBuilder();
                                    sb.append("#");
                                    sb.append(t_card.this.f18934e.f18020dE);
                                    int a = config.m23823a(Color.parseColor(sb.toString()), 0.2f);
                                    backgroundColor.setBackgroundColor(a);
                                    if (config.m23842a(a)) {
                                        backgroundColor.setTitleTextColor(-16777216);
                                        backgroundColor.setDescriptionTextColor(-16777216);
                                    } else {
                                        backgroundColor.setTitleTextColor(-1);
                                        backgroundColor.setDescriptionTextColor(-1);
                                    }
                                }
                                if (t_card.this.f18934e.f18051ds && t_card.this.f18934e.f18018dC != null && !t_card.this.f18934e.f18018dC.equals("") && t_card.this.f18934e.f18017dB != null && !t_card.this.f18934e.f18017dB.equals("")) {
                                    StringBuilder sb2 = new StringBuilder();
                                    sb2.append("#");
                                    sb2.append(t_card.this.f18934e.f18018dC);
                                    NativeAdViewAttributes buttonBorderColor = backgroundColor.setButtonTextColor(Color.parseColor(sb2.toString())).setButtonBorderColor(-12303292);
                                    StringBuilder sb3 = new StringBuilder();
                                    sb3.append("#");
                                    sb3.append(t_card.this.f18934e.f18017dB);
                                    buttonBorderColor.setButtonColor(Color.parseColor(sb3.toString()));
                                }
                                NativeAd nativeAd = (NativeAd) ad;
                                View render = NativeAdView.render(t_card.this, nativeAd, Type.HEIGHT_300, backgroundColor);
                                int i = 0;
                                Iterator it = t_card.this.f18949t.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        break;
                                    }
                                    C5814a aVar = (C5814a) it.next();
                                    if (aVar.f18970b.equals(nativeAd)) {
                                        i = aVar.f18969a;
                                        break;
                                    }
                                }
                                if (i != 0) {
                                    View findViewById = t_card.this.findViewById(R.id.llcards);
                                    StringBuilder sb4 = new StringBuilder();
                                    sb4.append(TtmlNode.ATTR_ID);
                                    sb4.append(i);
                                    ((LinearLayout) findViewById.findViewWithTag(sb4.toString())).addView(render);
                                }
                            }
                        });
                        this.f18949t.add(aVar);
                        aVar.f18970b.loadAd();
                    } else if (i3 == 4) {
                        Mrec mrec = new Mrec((Activity) this);
                        mrec.setAdTag("CARD SECTION");
                        View findViewById2 = findViewById(R.id.llcards);
                        StringBuilder sb26 = new StringBuilder();
                        sb26.append(TtmlNode.ATTR_ID);
                        sb26.append(aVar.f18969a);
                        LinearLayout linearLayout16 = (LinearLayout) findViewById2.findViewWithTag(sb26.toString());
                        i2 = 1;
                        linearLayout16.setGravity(1);
                        linearLayout16.addView(mrec);
                        i11 = i26;
                    }
                    i2 = 1;
                    i11 = i26;
                }
                i12 = i + i2;
                linearLayout5 = linearLayout;
                split = strArr;
                i10 = 0;
            }
            if (this.f18951v == null || this.f18951v.getStatus() != Status.RUNNING) {
                this.f18951v = new C5818e();
                this.f18951v.execute(new String[0]);
            }
            if (this.f18952w == null || this.f18952w.getStatus() != Status.RUNNING) {
                this.f18952w = new C5819f();
                this.f18952w.execute(new String[0]);
            }
        }
    }

    /* renamed from: a */
    private CardView m24129a(String str, int i, boolean z) {
        char c;
        ProgressBar progressBar;
        C5816c cVar = new C5816c();
        String[] split = str.split(",");
        CardView cardView = (CardView) ((LayoutInflater) getSystemService("layout_inflater")).inflate(R.layout.t_card_opc, null);
        if (!z) {
            cardView.setCardBackgroundColor(0);
            cardView.setCardElevation(0.0f);
        }
        String str2 = split[0];
        cVar.f18980a = Integer.parseInt(str2);
        cVar.f18981b = i;
        StringBuilder sb = new StringBuilder();
        sb.append("idopc");
        sb.append(str2);
        cardView.setTag(sb.toString());
        if (!split[11].equals("0")) {
            cardView.setTag(R.id.idaux1, split[11]);
            cardView.setOnClickListener(new OnClickListener() {
                public void onClick(View view) {
                    View view2 = new View(t_card.this);
                    int indexOf = t_card.this.f18934e.f17920bA.indexOf(Integer.valueOf(Integer.parseInt((String) view.getTag(R.id.idaux1))));
                    view2.setId(indexOf);
                    view2.setTag(R.id.TAG_IDSECC, Integer.valueOf(indexOf));
                    if (t_card.this.f18934e.f17986cO != null && !t_card.this.f18934e.f17986cO.equals("")) {
                        t_card.this.f18955z = new RewardedVideo((Context) t_card.this, t_card.this.f18934e.f17986cO);
                    }
                    if (t_card.this.f18934e.f17985cN != null && !t_card.this.f18934e.f17985cN.equals("")) {
                        t_card.this.f18954y = C2997g.m10716a(t_card.this);
                    }
                    if (t_card.this.f18934e.f17988cQ != null && !t_card.this.f18934e.f17988cQ.equals("")) {
                        t_card.this.f18920A = new RewardedVideoAd(t_card.this, t_card.this.f18934e.f17988cQ);
                    }
                    if (t_card.this.f18934e.f17989cR != null && !t_card.this.f18934e.f17989cR.equals("")) {
                        t_card.this.f18921B = new StartAppAd(t_card.this);
                    }
                    t_card.this.f18925F = new ProgressDialog(t_card.this);
                    t_card.this.f18924E = null;
                    t_card.this.f18932c = indexOf;
                    if (!t_card.this.f18934e.mo20774a((Context) t_card.this, view2, t_card.this.f18946q, t_card.this.f18925F, t_card.this.f18954y, t_card.this.f18955z, t_card.this.f18920A, t_card.this.f18921B)) {
                        t_card.this.mo21155b(indexOf);
                    }
                }
            });
        } else if (!split[12].trim().equals("")) {
            cardView.setTag(R.id.idaux1, split[12].trim().replace("@X@", ",").replace("@Y@", ";"));
            if (split[13].equals("0")) {
                cardView.setOnClickListener(new OnClickListener() {
                    public void onClick(View view) {
                        String str = (String) view.getTag(R.id.idaux1);
                        String lowerCase = str.toLowerCase();
                        Intent d = t_card.this.f18934e.mo20784d(str);
                        if (!d.getAction().equals("android.intent.action.VIEW") || lowerCase.endsWith(DefaultHlsExtractorFactory.MP3_FILE_EXTENSION) || lowerCase.endsWith(".mp4") || lowerCase.endsWith(".3gp")) {
                            t_card.this.startActivityForResult(d, 0);
                            return;
                        }
                        Intent intent = new Intent(t_card.this, t_url.class);
                        intent.putExtra("url", str);
                        try {
                            t_card.this.startActivityForResult(intent, 0);
                        } catch (Exception unused) {
                        }
                    }
                });
            } else {
                cardView.setOnClickListener(new OnClickListener() {
                    public void onClick(View view) {
                        try {
                            t_card.this.startActivityForResult(t_card.this.f18934e.mo20784d((String) view.getTag(R.id.idaux1)), 0);
                        } catch (Exception unused) {
                        }
                    }
                });
            }
        }
        if (!split[2].equals("")) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("#");
            sb2.append(split[2]);
            cardView.setCardBackgroundColor(Color.parseColor(sb2.toString()));
        }
        if (split[3].equals("1")) {
            FrameLayout frameLayout = (FrameLayout) cardView.findViewById(R.id.fl_card_opc);
            ImageView imageView = (ImageView) cardView.findViewById(R.id.iv_card_opc);
            if (!split[5].trim().equals("") || !split[8].trim().equals("")) {
                imageView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
                LayoutParams layoutParams = new LayoutParams(-2, -2);
                if (split[1].equals("1")) {
                    layoutParams.gravity = 17;
                }
                frameLayout.setLayoutParams(layoutParams);
            }
            frameLayout.setVisibility(0);
            int parseInt = Integer.parseInt(split[4]);
            SharedPreferences sharedPreferences = this.f18929J;
            StringBuilder sb3 = new StringBuilder();
            sb3.append("o718963_");
            sb3.append(cVar.f18980a);
            sb3.append("_v");
            if (parseInt > sharedPreferences.getInt(sb3.toString(), -1)) {
                cVar.f18982c = true;
                cVar.f18983d = split[4];
                if (this.f18938i) {
                    progressBar = (ProgressBar) cardView.findViewById(R.id.pb_card_opc_inv);
                } else {
                    progressBar = (ProgressBar) cardView.findViewById(R.id.pb_card_opc);
                }
                if (VERSION.SDK_INT > 20) {
                    config.m23838a(progressBar, this.f18934e.f17890aW);
                }
                progressBar.setVisibility(0);
            } else {
                File filesDir = getApplicationContext().getFilesDir();
                StringBuilder sb4 = new StringBuilder();
                sb4.append("o718963_");
                sb4.append(cVar.f18980a);
                sb4.append(".png");
                File file = new File(filesDir, sb4.toString());
                if (file.exists()) {
                    try {
                        imageView.setImageBitmap(Media.getBitmap(getContentResolver(), Uri.fromFile(file)));
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
            c = 5;
        } else {
            c = 5;
        }
        if (!split[c].trim().equals("")) {
            TextView textView = (TextView) cardView.findViewById(R.id.tv_card_tit);
            textView.setLayoutParams(new LayoutParams(-1, -2));
            if (split[1].equals("1")) {
                textView.setGravity(1);
            } else if (VERSION.SDK_INT >= 17 && getResources().getBoolean(R.bool.es_rtl)) {
                textView.setTextDirection(4);
            }
            textView.setTextSize(Float.parseFloat(split[7]));
            StringBuilder sb5 = new StringBuilder();
            sb5.append("#");
            sb5.append(split[6]);
            textView.setTextColor(Color.parseColor(sb5.toString()));
            textView.setText(split[5].trim().replace("@X@", ",").replace("@Y@", ";"));
            textView.setVisibility(0);
            cardView.findViewById(R.id.ll_opc_txt).setVisibility(0);
        }
        if (!split[8].trim().equals("")) {
            TextView textView2 = (TextView) cardView.findViewById(R.id.tv_card_subtit);
            textView2.setLayoutParams(new LayoutParams(-1, -2));
            if (split[1].equals("1")) {
                textView2.setGravity(1);
            } else if (VERSION.SDK_INT >= 17 && getResources().getBoolean(R.bool.es_rtl)) {
                textView2.setTextDirection(4);
            }
            textView2.setTextSize(Float.parseFloat(split[10]));
            StringBuilder sb6 = new StringBuilder();
            sb6.append("#");
            sb6.append(split[9]);
            textView2.setTextColor(Color.parseColor(sb6.toString()));
            textView2.setText(split[8].trim().replace("@X@", ",").replace("@Y@", ";"));
            textView2.setVisibility(0);
            cardView.findViewById(R.id.ll_opc_txt).setVisibility(0);
        }
        this.f18948s.add(cVar);
        return cardView;
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ((LinearLayout) findViewById(R.id.ll_princ)).removeViewAt(0);
        mo21156f();
        ((LinearLayout) findViewById(R.id.ll_ad)).removeAllViews();
        if (!(this.f18953x == null || this.f18953x.f17768a == null)) {
            try {
                this.f18953x.f17768a.mo12168c();
            } catch (Exception unused) {
            }
        }
        if (!(this.f18953x == null || this.f18953x.f17769b == null)) {
            try {
                this.f18953x.f17769b.destroy();
            } catch (Exception unused2) {
            }
        }
        this.f18953x = this.f18934e.mo20760a((Context) this, false);
    }

    public boolean onSearchRequested() {
        if (this.f18934e.f18080q == 0) {
            return false;
        }
        this.f18935f = true;
        this.f18923D = true;
        return super.onSearchRequested();
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getWindow().setFormat(1);
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("es_root", this.f18937h);
    }

    public void onStop() {
        super.onStop();
        if (this.f18935f && !this.f18923D) {
            finish();
        }
    }

    public void onPause() {
        if (!(this.f18934e.f18013cx == 0 || this.f18953x == null || this.f18953x.f17768a == null)) {
            this.f18953x.f17768a.mo12167b();
        }
        super.onPause();
    }

    public void onResume() {
        super.onResume();
        config.m23860m(this);
        if (this.f18934e.f18013cx != 0 && this.f18953x != null && this.f18953x.f17768a != null) {
            this.f18953x.f17768a.mo12165a();
        }
    }

    public void onDestroy() {
        if (!(this.f18934e.f18013cx == 0 || this.f18953x == null || this.f18953x.f17768a == null)) {
            this.f18953x.f17768a.mo12168c();
        }
        if (!(this.f18934e.f18013cx == 0 || this.f18953x == null || this.f18953x.f17769b == null)) {
            this.f18953x.f17769b.destroy();
        }
        if ((this.f18937h && isFinishing()) || config.f17841i) {
            config.m23861n(this);
        }
        super.onDestroy();
    }

    public void onBackPressed() {
        if (!this.f18937h || this.f18936g || !this.f18934e.f18059ea) {
            super.onBackPressed();
            return;
        }
        this.f18936g = true;
        config.m23859l(this);
    }

    public void adLoaded(String str) {
        this.f18925F.cancel();
        this.f18955z.showAd();
    }

    public void onAdClosed() {
        if (this.f18922C) {
            abrir_secc(this.f18924E);
        }
    }

    public void adError(String str) {
        this.f18925F.cancel();
        abrir_secc(this.f18924E);
    }

    public void videoEnded() {
        this.f18922C = true;
        config.m23867t(this);
    }

    /* renamed from: z_ */
    public void mo9678z_() {
        this.f18925F.cancel();
        this.f18954y.mo12836a();
    }

    /* renamed from: a */
    public void mo9675a(C3165a aVar) {
        this.f18922C = true;
        config.m23867t(this);
    }

    /* renamed from: A_ */
    public void mo9671A_() {
        if (this.f18922C) {
            abrir_secc(this.f18924E);
        }
    }

    /* renamed from: e */
    public void mo9676e() {
        this.f18922C = false;
    }

    /* renamed from: a */
    public void mo9674a(int i) {
        if (!this.f18934e.mo20775a((Context) this, this.f18955z)) {
            this.f18925F.cancel();
            abrir_secc(this.f18924E);
        }
    }

    public void onError(C1514Ad ad, AdError adError) {
        this.f18925F.cancel();
        abrir_secc(this.f18924E);
    }

    public void onAdLoaded(C1514Ad ad) {
        this.f18925F.cancel();
        this.f18920A.show();
    }

    public void onRewardedVideoCompleted() {
        this.f18922C = true;
        config.m23867t(this);
    }

    public void onRewardedVideoClosed() {
        if (this.f18922C) {
            abrir_secc(this.f18924E);
        }
    }

    public void onVideoCompleted() {
        this.f18922C = true;
        config.m23867t(this);
    }

    public void onReceiveAd(C5286Ad ad) {
        this.f18925F.cancel();
        this.f18921B.showAd("REWARDED VIDEO", new AdDisplayListener() {
            public void adClicked(C5286Ad ad) {
            }

            public void adDisplayed(C5286Ad ad) {
            }

            public void adNotDisplayed(C5286Ad ad) {
            }

            public void adHidden(C5286Ad ad) {
                if (t_card.this.f18922C) {
                    t_card.this.abrir_secc(t_card.this.f18924E);
                }
            }
        });
    }

    public void onFailedToReceiveAd(C5286Ad ad) {
        this.f18925F.cancel();
        abrir_secc(this.f18924E);
    }
}
