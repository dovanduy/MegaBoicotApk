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
import android.content.SharedPreferences.OnSharedPreferenceChangeListener;
import android.graphics.Color;
import android.graphics.Point;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.GradientDrawable.Orientation;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.p028v7.widget.CardView;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
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
import com.facebook.ads.NativeAd;
import com.facebook.ads.NativeAdListener;
import com.facebook.ads.NativeAdView;
import com.facebook.ads.NativeAdView.Type;
import com.facebook.ads.NativeAdViewAttributes;
import com.facebook.ads.RewardedVideoAd;
import com.facebook.ads.RewardedVideoAdListener;
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
import java.util.ArrayList;
import java.util.Random;

public class t_submenu extends Activity implements OnSharedPreferenceChangeListener, OnClickListener, OnItemClickListener, OnAdClosed, OnAdError, OnAdLoaded, OnVideoEnded, RewardedVideoAdListener, C3167c, VideoListener, AdEventListener, C5599a {

    /* renamed from: A */
    ProgressDialog f19277A;

    /* renamed from: B */
    GridView f19278B;

    /* renamed from: C */
    C5875a f19279C;

    /* renamed from: a */
    int f19280a = 80;

    /* renamed from: b */
    int f19281b = 30;

    /* renamed from: c */
    int f19282c;

    /* renamed from: d */
    int f19283d;

    /* renamed from: e */
    int f19284e;

    /* renamed from: f */
    int f19285f;

    /* renamed from: g */
    boolean f19286g = false;

    /* renamed from: h */
    boolean f19287h = false;

    /* renamed from: i */
    boolean f19288i;

    /* renamed from: j */
    String f19289j;

    /* renamed from: k */
    config f19290k;

    /* renamed from: l */
    Bundle f19291l;

    /* renamed from: m */
    C5602c f19292m;

    /* renamed from: n */
    C5663i f19293n;

    /* renamed from: o */
    C5663i[] f19294o;

    /* renamed from: p */
    String[] f19295p;

    /* renamed from: q */
    int f19296q = 0;

    /* renamed from: r */
    ListView f19297r;

    /* renamed from: s */
    ProgressBar f19298s;

    /* renamed from: t */
    C3166b f19299t;

    /* renamed from: u */
    RewardedVideo f19300u;

    /* renamed from: v */
    RewardedVideoAd f19301v;

    /* renamed from: w */
    StartAppAd f19302w;

    /* renamed from: x */
    boolean f19303x = false;

    /* renamed from: y */
    boolean f19304y = false;

    /* renamed from: z */
    View f19305z;

    /* renamed from: mega.boicot.t_submenu$a */
    public class C5875a extends BaseAdapter {

        /* renamed from: b */
        private Context f19312b;

        public long getItemId(int i) {
            return (long) i;
        }

        public C5875a(Context context) {
            this.f19312b = context;
        }

        public int getCount() {
            return t_submenu.this.f19296q;
        }

        public Object getItem(int i) {
            return Integer.valueOf(i);
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                LayoutInflater layoutInflater = (LayoutInflater) this.f19312b.getSystemService("layout_inflater");
                int i2 = t_submenu.this.f19293n.f18275aS ? R.layout.t_menugrid_row : t_submenu.this.f19293n.f18272aP == 1 ? R.layout.t_menugrid_row_formato2 : R.layout.t_menugrid_row_v;
                view = layoutInflater.inflate(i2, viewGroup, false);
                if (!t_submenu.this.f19293n.f18275aS && t_submenu.this.f19293n.f18272aP == 1) {
                    ((CardView) view.findViewById(R.id.cv)).setRadius((float) t_submenu.this.f19293n.f18271aO);
                }
                if (t_submenu.this.f19293n.f18273aQ) {
                    ImageView imageView = (ImageView) view.findViewById(R.id.iv_menugrid);
                    if (t_submenu.this.f19293n.f18275aS) {
                        imageView.getLayoutParams().height = t_submenu.this.f19283d;
                        imageView.getLayoutParams().width = t_submenu.this.f19284e;
                    } else {
                        imageView.getLayoutParams().height = t_submenu.this.f19283d;
                        imageView.getLayoutParams().width = t_submenu.this.f19284e;
                    }
                    imageView.setVisibility(0);
                }
                if (t_submenu.this.f19293n.f18274aR) {
                    TextView textView = (TextView) view.findViewById(R.id.tv_menugrid);
                    if (t_submenu.this.f19293n.f18279aW) {
                        textView.setTypeface(textView.getTypeface(), 1);
                    }
                    if (!t_submenu.this.f19293n.f18281aY.equals("")) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("#");
                        sb.append(t_submenu.this.f19293n.f18281aY);
                        textView.setTextColor(Color.parseColor(sb.toString()));
                    }
                    textView.getLayoutParams().width = t_submenu.this.f19285f;
                    if (t_submenu.this.f19293n.f18278aV) {
                        textView.setGravity(17);
                    } else if (VERSION.SDK_INT >= 17 && t_submenu.this.getResources().getBoolean(R.bool.es_rtl)) {
                        textView.setTextDirection(4);
                    }
                    if (t_submenu.this.f19293n.f18280aX.equals("")) {
                        textView.setBackgroundDrawable(null);
                    } else {
                        GradientDrawable gradientDrawable = (GradientDrawable) textView.getBackground();
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("#");
                        sb2.append(t_submenu.this.f19293n.f18280aX);
                        gradientDrawable.setColor(Color.parseColor(sb2.toString()));
                        ((GradientDrawable) textView.getBackground()).setCornerRadius((float) t_submenu.this.f19293n.f18271aO);
                    }
                    textView.setVisibility(0);
                }
            }
            if (t_submenu.this.f19293n.f18273aQ) {
                ImageView imageView2 = (ImageView) view.findViewById(R.id.iv_menugrid);
                if (t_submenu.this.f19294o[i].f18264aH || t_submenu.this.f19294o[i].f18263aG == null) {
                    imageView2.setImageBitmap(null);
                } else {
                    imageView2.setImageDrawable(new BitmapDrawable(t_submenu.this.getResources(), t_submenu.this.f19294o[i].f18263aG));
                }
            }
            if (t_submenu.this.f19293n.f18274aR) {
                ((TextView) view.findViewById(R.id.tv_menugrid)).setText(t_submenu.this.f19294o[i].f18256a);
            }
            return view;
        }
    }

    /* renamed from: mega.boicot.t_submenu$b */
    private class C5876b extends AsyncTask<String, Void, Byte> {

        /* renamed from: a */
        String f19313a;

        /* renamed from: b */
        String f19314b;

        /* renamed from: c */
        String f19315c;

        /* access modifiers changed from: protected */
        public void onPreExecute() {
        }

        private C5876b() {
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Can't wrap try/catch for region: R(3:9|10|11) */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x007c, code lost:
            return java.lang.Byte.valueOf(-1);
         */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0078 */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Byte doInBackground(java.lang.String... r6) {
            /*
                r5 = this;
                r0 = 0
                r1 = r6[r0]
                r5.f19313a = r1
                r1 = 1
                r2 = r6[r1]
                r5.f19314b = r2
                r2 = 2
                r6 = r6[r2]
                r5.f19315c = r6
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                java.lang.String r2 = "http://imgs1.e-droid.net/srv/imgs/fondos_submenu/"
                r6.append(r2)
                java.lang.String r2 = r5.f19313a
                r6.append(r2)
                java.lang.String r2 = "_fondo.png?v="
                r6.append(r2)
                java.lang.String r2 = r5.f19315c
                r6.append(r2)
                java.lang.String r6 = r6.toString()
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "fondo_"
                r2.append(r3)
                java.lang.String r3 = r5.f19313a
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                r3 = -1
                java.net.URL r4 = new java.net.URL     // Catch:{ MalformedURLException -> 0x0082 }
                r4.<init>(r6)     // Catch:{ MalformedURLException -> 0x0082 }
                java.net.URLConnection r6 = r4.openConnection()     // Catch:{ IOException -> 0x007d }
                java.net.HttpURLConnection r6 = (java.net.HttpURLConnection) r6     // Catch:{ IOException -> 0x007d }
                r6.setDoInput(r1)     // Catch:{ IOException -> 0x007d }
                r1 = 5000(0x1388, float:7.006E-42)
                r6.setConnectTimeout(r1)     // Catch:{ IOException -> 0x007d }
                r1 = 7000(0x1b58, float:9.809E-42)
                r6.setReadTimeout(r1)     // Catch:{ IOException -> 0x007d }
                r6.connect()     // Catch:{ IOException -> 0x007d }
                java.io.InputStream r6 = r6.getInputStream()     // Catch:{ IOException -> 0x007d }
                android.graphics.Bitmap r6 = android.graphics.BitmapFactory.decodeStream(r6)     // Catch:{ IOException -> 0x007d }
                mega.boicot.t_submenu r1 = mega.boicot.t_submenu.this     // Catch:{ Exception -> 0x0078 }
                java.io.FileOutputStream r1 = r1.openFileOutput(r2, r0)     // Catch:{ Exception -> 0x0078 }
                android.graphics.Bitmap$CompressFormat r2 = android.graphics.Bitmap.CompressFormat.PNG     // Catch:{ Exception -> 0x0078 }
                r4 = 100
                r6.compress(r2, r4, r1)     // Catch:{ Exception -> 0x0078 }
                r1.close()     // Catch:{ Exception -> 0x0078 }
                java.lang.Byte r6 = java.lang.Byte.valueOf(r0)
                return r6
            L_0x0078:
                java.lang.Byte r6 = java.lang.Byte.valueOf(r3)     // Catch:{ IOException -> 0x007d }
                return r6
            L_0x007d:
                java.lang.Byte r6 = java.lang.Byte.valueOf(r3)
                return r6
            L_0x0082:
                java.lang.Byte r6 = java.lang.Byte.valueOf(r3)
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: mega.boicot.t_submenu.C5876b.doInBackground(java.lang.String[]):java.lang.Byte");
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void onPostExecute(Byte b) {
            if (b.byteValue() == 0) {
                try {
                    config config = t_submenu.this.f19290k;
                    StringBuilder sb = new StringBuilder();
                    sb.append("fondo_");
                    sb.append(this.f19313a);
                    config.mo20776a(sb.toString(), (ImageView) t_submenu.this.findViewById(R.id.iv_fondo));
                } catch (Exception unused) {
                }
                Editor edit = t_submenu.this.getSharedPreferences("sh", 0).edit();
                StringBuilder sb2 = new StringBuilder();
                sb2.append("s");
                sb2.append(this.f19313a);
                sb2.append("_fondo_modif");
                edit.putInt(sb2.toString(), 0);
                edit.commit();
                t_submenu.this.f19290k.f17971bz[Integer.parseInt(this.f19314b)].f18242M = false;
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
        this.f19290k = (config) getApplicationContext();
        if (this.f19290k.f17881aN == null) {
            this.f19290k.mo20780b();
        }
        this.f19291l = getIntent().getExtras();
        if (bundle == null) {
            this.f19288i = this.f19291l != null && this.f19291l.containsKey("es_root") && this.f19291l.getBoolean("es_root", false);
        } else {
            this.f19288i = bundle.containsKey("es_root") && bundle.getBoolean("es_root", false);
        }
        this.f19291l = getIntent().getExtras();
        this.f19282c = this.f19291l.getInt("ind");
        this.f19289j = config.m23831a(this.f19290k.f17971bz[this.f19282c].f18314g, this.f19290k.f17890aW);
        super.onCreate(bundle);
        setContentView(R.layout.t_menugrid);
        getSharedPreferences("sh", 0).registerOnSharedPreferenceChangeListener(this);
        mo21361g();
        if (this.f19290k.f18080q > 0) {
            SearchManager searchManager = (SearchManager) getSystemService("search");
            searchManager.setOnCancelListener(new OnCancelListener() {
                public void onCancel() {
                    t_submenu.this.f19286g = false;
                    t_submenu.this.setResult(0);
                }
            });
            searchManager.setOnDismissListener(new OnDismissListener() {
                public void onDismiss() {
                    t_submenu.this.f19304y = false;
                }
            });
        }
        if (bundle == null) {
            this.f19290k.mo20770a((Context) this, this.f19291l != null && this.f19291l.containsKey("ad_entrar"), this.f19291l != null && this.f19291l.containsKey("fb_entrar"));
        }
        this.f19290k.mo20767a((Context) this, this.f19290k.f18075l, this.f19289j, bundle);
        this.f19293n = this.f19290k.f17971bz[this.f19282c];
        if (!this.f19293n.f18314g.equals("")) {
            Orientation orientation = Orientation.TOP_BOTTOM;
            StringBuilder sb = new StringBuilder();
            sb.append("#");
            sb.append(this.f19293n.f18314g);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("#");
            sb2.append(this.f19293n.f18315h);
            findViewById(R.id.ll_princ).setBackgroundDrawable(new GradientDrawable(orientation, new int[]{Color.parseColor(sb.toString()), Color.parseColor(sb2.toString())}));
        }
        this.f19294o = new C5663i[this.f19290k.f17971bz.length];
        this.f19295p = this.f19293n.f18282aZ.split(",");
        this.f19296q = 0;
        StringBuilder sb3 = new StringBuilder();
        sb3.append("#");
        sb3.append(this.f19293n.f18314g);
        if (config.m23844a(sb3.toString())) {
            this.f19298s = (ProgressBar) findViewById(R.id.pb_inv);
        } else {
            this.f19298s = (ProgressBar) findViewById(R.id.pb);
        }
        if (VERSION.SDK_INT > 20) {
            config.m23838a(this.f19298s, this.f19290k.f17890aW);
        }
        mo21360f();
        if (this.f19293n.f18273aQ) {
            Intent intent = new Intent(this, s_cargar_icos.class);
            intent.putExtra("ind_submenu", this.f19282c);
            startService(intent);
        }
    }

    /* renamed from: b */
    private void m24239b(int i) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5 = (this.f19290k.f17979cH.equals("") || this.f19290k.f17992cU == 0 || this.f19290k.f17993cV == 0) ? false : true;
        boolean z6 = !this.f19290k.f17980cI.equals("") && this.f19290k.f18072eq != null && this.f19290k.f18072eq.size() > 0;
        boolean z7 = !this.f19290k.f17982cK.equals("");
        boolean z8 = !this.f19290k.f17984cM.equals("");
        ArrayList arrayList = new ArrayList();
        if (z5) {
            arrayList.add(Integer.valueOf(1));
        }
        if (z6) {
            arrayList.add(Integer.valueOf(2));
        }
        if (z7) {
            arrayList.add(Integer.valueOf(3));
        }
        if (z8) {
            arrayList.add(Integer.valueOf(4));
        }
        int intValue = !arrayList.isEmpty() ? ((Integer) arrayList.get(new Random().nextInt(((arrayList.size() - 1) - 0) + 1) + 0)).intValue() : 0;
        if (intValue == 1) {
            z4 = false;
            z3 = false;
            z2 = false;
            z = true;
        } else if (intValue == 2) {
            z = false;
            z3 = false;
            z2 = false;
            z4 = true;
        } else if (intValue == 3) {
            z = false;
            z4 = false;
            z2 = false;
            z3 = true;
        } else if (intValue == 4) {
            z = false;
            z4 = false;
            z3 = false;
            z2 = true;
        } else {
            z = false;
            z4 = false;
            z3 = false;
            z2 = false;
        }
        if (z) {
            AdView adView = new AdView(this);
            adView.setAdSize(C2973d.f8695e);
            adView.setAdUnitId(this.f19290k.f17979cH);
            findViewById(R.id.ll_appsreco).setVisibility(8);
            ((LinearLayout) findViewById(R.id.ll_nat)).setVisibility(0);
            ((LinearLayout) findViewById(R.id.ll_nat)).removeViewAt(1);
            ((LinearLayout) findViewById(R.id.ll_nat)).addView(adView, 1);
            adView.mo12166a(new C2972a().mo12209a());
        } else if (z4) {
            if (!this.f19293n.f18314g.equals("")) {
                StringBuilder sb = new StringBuilder();
                sb.append("#");
                sb.append(this.f19293n.f18314g);
                if (config.m23844a(sb.toString())) {
                    ((TextView) findViewById(R.id.tv_appsreco)).setTextColor(config.f17813a);
                }
            }
            this.f19290k.mo20765a(this, 1, 3, -1, null);
        } else if (z3) {
            final NativeAd nativeAd = new NativeAd(this, this.f19290k.f17982cK);
            nativeAd.setAdListener(new NativeAdListener() {
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
                    if (t_submenu.this.f19293n.f18315h != null && !t_submenu.this.f19293n.f18315h.equals("")) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("#");
                        sb.append(t_submenu.this.f19293n.f18315h);
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
                    if (t_submenu.this.f19293n.f18274aR && t_submenu.this.f19293n.f18281aY != null && !t_submenu.this.f19293n.f18281aY.equals("") && t_submenu.this.f19293n.f18280aX != null && !t_submenu.this.f19293n.f18280aX.equals("")) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("#");
                        sb2.append(t_submenu.this.f19293n.f18281aY);
                        NativeAdViewAttributes buttonBorderColor = backgroundColor.setButtonTextColor(Color.parseColor(sb2.toString())).setButtonBorderColor(-12303292);
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("#");
                        sb3.append(t_submenu.this.f19293n.f18280aX);
                        buttonBorderColor.setButtonColor(Color.parseColor(sb3.toString()));
                    }
                    View render = NativeAdView.render(t_submenu.this, nativeAd, Type.HEIGHT_300, backgroundColor);
                    ((LinearLayout) t_submenu.this.findViewById(R.id.ll_nat)).setVisibility(0);
                    ((LinearLayout) t_submenu.this.findViewById(R.id.ll_nat)).removeViewAt(1);
                    ((LinearLayout) t_submenu.this.findViewById(R.id.ll_nat)).addView(render, 1);
                }
            });
            findViewById(R.id.ll_appsreco).setVisibility(8);
            nativeAd.loadAd();
        } else if (z2) {
            Mrec mrec = new Mrec((Activity) this);
            mrec.setAdTag("SUBMENU");
            ((LinearLayout) findViewById(R.id.ll_nat)).setVisibility(0);
            ((LinearLayout) findViewById(R.id.ll_nat)).removeViewAt(1);
            ((LinearLayout) findViewById(R.id.ll_nat)).addView(mrec, 1);
        } else {
            this.f19292m = this.f19290k.mo20760a((Context) this, false);
        }
    }

    public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if (this.f19279C != null && str.equals("ico_cargado")) {
            this.f19279C.notifyDataSetChanged();
        }
    }

    /* access modifiers changed from: 0000 */
    @TargetApi(13)
    /* renamed from: f */
    public void mo21360f() {
        int i;
        int i2;
        float f = getResources().getDisplayMetrics().density;
        this.f19280a = (int) ((((float) this.f19280a) * f) + 0.5f);
        this.f19281b = (int) ((((float) this.f19281b) * f) + 0.5f);
        this.f19283d = 0;
        this.f19284e = 0;
        this.f19285f = 0;
        LayoutInflater layoutInflater = (LayoutInflater) getSystemService("layout_inflater");
        int i3 = this.f19293n.f18275aS ? R.layout.t_menugrid_row : this.f19293n.f18272aP == 1 ? R.layout.t_menugrid_row_formato2 : R.layout.t_menugrid_row_v;
        TextView textView = (TextView) layoutInflater.inflate(i3, (LinearLayout) findViewById(R.id.ll_princ), false).findViewById(R.id.tv_menugrid);
        int i4 = 0;
        while (true) {
            C5663i iVar = null;
            if (i4 >= this.f19295p.length) {
                break;
            }
            int i5 = 0;
            while (true) {
                if (i5 >= this.f19290k.f17971bz.length) {
                    break;
                }
                String str = this.f19295p[i4];
                StringBuilder sb = new StringBuilder();
                sb.append(this.f19290k.f17971bz[i5].f18330w);
                sb.append("");
                if (str.equals(sb.toString())) {
                    iVar = this.f19290k.f17971bz[i5];
                    this.f19294o[this.f19296q] = iVar;
                    this.f19296q++;
                    break;
                }
                i5++;
            }
            if (iVar != null) {
                if (this.f19293n.f18274aR) {
                    textView.setText(iVar.f18256a);
                    if (this.f19293n.f18279aW) {
                        textView.setTypeface(textView.getTypeface(), 1);
                    }
                    textView.measure(0, 0);
                    this.f19285f = Math.max(this.f19285f, textView.getMeasuredWidth());
                }
                if (this.f19293n.f18273aQ) {
                    if (!iVar.f18264aH && iVar.f18263aG != null) {
                        this.f19283d = Math.max(this.f19283d, iVar.f18263aG.getHeight());
                        this.f19284e = Math.max(this.f19284e, iVar.f18263aG.getWidth());
                    } else if (!(!iVar.f18264aH || iVar.f18267aK == 0 || iVar.f18268aL == 0)) {
                        this.f19283d = Math.max(this.f19283d, iVar.f18268aL);
                        this.f19284e = Math.max(this.f19284e, iVar.f18267aK);
                    }
                }
            }
            i4++;
        }
        this.f19283d = (int) ((((float) this.f19283d) * f) + 0.5f);
        this.f19284e = (int) ((((float) this.f19284e) * f) + 0.5f);
        Display defaultDisplay = getWindowManager().getDefaultDisplay();
        if (VERSION.SDK_INT >= 13) {
            Point point = new Point();
            defaultDisplay.getSize(point);
            i = point.x;
        } else {
            i = defaultDisplay.getWidth();
        }
        if (this.f19293n.f18275aS && this.f19283d > this.f19281b) {
            this.f19284e = (this.f19284e * this.f19281b) / this.f19283d;
            this.f19283d = this.f19281b;
        } else if (!this.f19293n.f18275aS && this.f19283d > this.f19280a) {
            this.f19284e = (this.f19284e * this.f19280a) / this.f19283d;
            this.f19283d = this.f19280a;
        }
        if (!this.f19293n.f18275aS && this.f19293n.f18274aR && this.f19284e > this.f19285f) {
            this.f19283d = (this.f19283d * this.f19285f) / this.f19284e;
            this.f19284e = this.f19285f;
        }
        this.f19278B = (GridView) findViewById(R.id.grid);
        if (this.f19293n.f18277aU) {
            ((LinearLayout) findViewById(R.id.ll_grid)).setGravity(1);
        }
        int i6 = this.f19293n.f18270aN == 1 ? 16 : this.f19293n.f18270aN == 2 ? 24 : 1;
        int i7 = (int) ((((float) i6) * f) + 0.5f);
        this.f19278B.setHorizontalSpacing(i7);
        this.f19278B.setVerticalSpacing(i7);
        int i8 = (int) ((10.0f * f) + 0.5f);
        this.f19278B.setPadding(i8, i8, i8, i8);
        int i9 = (int) ((4.0f * f) + 0.5f);
        int i10 = this.f19293n.f18269aM;
        if (this.f19293n.f18275aS) {
            i2 = this.f19284e + this.f19285f + i7;
            if (this.f19293n.f18274aR) {
                i2 += i9;
            }
            m24239b(this.f19284e + this.f19285f);
        } else {
            i2 = Math.max(this.f19284e, this.f19285f) + i7 + (this.f19293n.f18272aP == 1 ? config.m23845b((Context) this, 10) : 0);
            m24239b(this.f19285f);
        }
        while (i10 > 1 && (i2 * i10) + (i8 * 2) > i) {
            i10--;
        }
        this.f19278B.setNumColumns(i10);
        this.f19278B.getLayoutParams().width = ((i2 * i10) + (i8 * 2)) - i7;
        this.f19278B.setOnItemClickListener(this);
        if (!this.f19293n.f18276aT) {
            this.f19278B.setLayoutAnimation(null);
        }
        this.f19279C = new C5875a(this);
        this.f19278B.setAdapter(this.f19279C);
        if (this.f19293n.f18327t <= 0) {
            return;
        }
        if (!this.f19293n.f18242M) {
            try {
                config config = this.f19290k;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("fondo_");
                sb2.append(this.f19293n.f18327t);
                config.mo20776a(sb2.toString(), (ImageView) findViewById(R.id.iv_fondo));
            } catch (Exception unused) {
            }
        } else {
            C5876b bVar = new C5876b();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(this.f19293n.f18327t);
            sb3.append("");
            StringBuilder sb4 = new StringBuilder();
            sb4.append(this.f19282c);
            sb4.append("");
            StringBuilder sb5 = new StringBuilder();
            sb5.append(this.f19293n.f18328u);
            sb5.append("");
            bVar.execute(new String[]{sb3.toString(), sb4.toString(), sb5.toString()});
        }
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i3 >= this.f19290k.f17971bz.length) {
                break;
            } else if (this.f19294o[i].f18330w == this.f19290k.f17971bz[i3].f18330w) {
                i2 = i3;
                break;
            } else {
                i3++;
            }
        }
        view.setId(i2);
        view.setTag(R.id.TAG_IDSECC, Integer.valueOf(i2));
        view.setTag(R.id.idaux1, Integer.valueOf(1));
        if (!this.f19293n.f18236G || this.f19294o[i].f18325r != 1) {
            if (this.f19293n.f18329v == 1 && this.f19294o[i].f18325r == 1) {
                view.setTag(R.id.idaux2, this.f19294o[i].f18312e);
            }
            onClick(view);
            return;
        }
        this.f19290k.mo20773a(this.f19294o[i].f18312e, "", "", (Context) this);
    }

    public void onClick(View view) {
        if ((this.f19290k.f17986cO == null || this.f19290k.f17986cO.equals("")) && ((this.f19290k.f17985cN == null || this.f19290k.f17985cN.equals("")) && ((this.f19290k.f17988cQ == null || this.f19290k.f17988cQ.equals("")) && (this.f19290k.f17989cR == null || this.f19290k.f17989cR.equals(""))))) {
            abrir_secc(view);
            return;
        }
        if (this.f19290k.f17986cO != null && !this.f19290k.f17986cO.equals("")) {
            this.f19300u = new RewardedVideo((Context) this, this.f19290k.f17986cO);
        }
        if (this.f19290k.f17985cN != null && !this.f19290k.f17985cN.equals("")) {
            this.f19299t = C2997g.m10716a(this);
        }
        if (this.f19290k.f17988cQ != null && !this.f19290k.f17988cQ.equals("")) {
            this.f19301v = new RewardedVideoAd(this, this.f19290k.f17988cQ);
        }
        if (this.f19290k.f17989cR != null && !this.f19290k.f17989cR.equals("")) {
            this.f19302w = new StartAppAd(this);
        }
        this.f19277A = new ProgressDialog(this);
        this.f19305z = view;
        if (!this.f19290k.mo20774a((Context) this, view, this.f19289j, this.f19277A, this.f19299t, this.f19300u, this.f19301v, this.f19302w)) {
            abrir_secc(view);
        }
    }

    public void abrir_secc(View view) {
        if (view.getTag(R.id.idaux2) != null) {
            startActivity(new Intent("android.intent.action.VIEW", Uri.parse((String) view.getTag(R.id.idaux2))));
            return;
        }
        C5662h a = this.f19290k.mo20761a(view, (Context) this);
        if (view.getTag(R.id.idaux1) != null) {
            a.f18227b = false;
        }
        if (a.f18227b) {
            this.f19286g = true;
            Intent intent = new Intent();
            intent.putExtra("finalizar", true);
            intent.putExtra("finalizar_app", a.f18228c);
            setResult(-1, intent);
        }
        if (a.f18229d) {
            startActivityForResult(a.f18226a, 0);
        } else if (a.f18226a != null) {
            if (a.f18227b && this.f19290k.f18045dm != 2) {
                a.f18226a.putExtra("es_root", true);
            }
            if (this.f19286g) {
                this.f19288i = false;
            }
            startActivityForResult(a.f18226a, 0);
        }
        if (this.f19286g && !this.f19304y) {
            finish();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public void mo21361g() {
        int b = this.f19290k.mo20778b((Context) this);
        if (this.f19290k.f18045dm == 1) {
            this.f19297r = (ListView) findViewById(R.id.left_drawer);
            this.f19290k.mo20771a(this.f19297r);
        } else if (this.f19290k.f18045dm == 0) {
            int i = 0;
            for (int i2 = 0; i2 < this.f19290k.f17971bz.length; i2++) {
                if (!this.f19290k.f17971bz[i2].f18333z) {
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
        for (int i3 = 0; i3 < this.f19290k.f17923bD.length; i3++) {
            if (this.f19290k.f17923bD[i3] > 0) {
                findViewById(this.f19290k.f17923bD[i3]).setOnClickListener(this);
            }
        }
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (i == 102 && config.m23853d() && iArr.length > 0 && strArr[0].equals("android.permission.WRITE_EXTERNAL_STORAGE") && iArr[0] == 0 && getPackageManager().checkPermission("android.permission.WRITE_EXTERNAL_STORAGE", getPackageName()) == 0) {
            SharedPreferences sharedPreferences = getSharedPreferences("sh", 0);
            this.f19290k.mo20773a(sharedPreferences.getString("descarga_url", ""), sharedPreferences.getString("descarga_mimetype", ""), sharedPreferences.getString("descarga_nombre", ""), (Context) this);
        }
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i2 == -1 && intent != null && intent.hasExtra("finalizar") && intent.getExtras().getBoolean("finalizar")) {
            if (!intent.getExtras().getBoolean("finalizar_app")) {
                this.f19288i = false;
            }
            setResult(-1, intent);
            finish();
        }
    }

    public boolean onSearchRequested() {
        if (this.f19290k.f18080q == 0) {
            return false;
        }
        this.f19286g = true;
        this.f19304y = true;
        return super.onSearchRequested();
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getWindow().setFormat(1);
    }

    public void onPause() {
        if (!(this.f19290k.f18013cx == 0 || this.f19292m == null || this.f19292m.f17768a == null)) {
            this.f19292m.f17768a.mo12167b();
        }
        super.onPause();
    }

    public void onStop() {
        super.onStop();
        if (this.f19286g && !this.f19304y) {
            finish();
        }
    }

    public void onResume() {
        super.onResume();
        config.m23860m(this);
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.ll_nat);
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            if (viewGroup.getChildAt(i).findViewById(R.id.ad_pb) != null) {
                viewGroup.getChildAt(i).findViewById(R.id.ad_pb).setVisibility(8);
            }
        }
        if (!(this.f19290k.f18013cx == 0 || this.f19292m == null || this.f19292m.f17768a == null)) {
            this.f19292m.f17768a.mo12165a();
        }
        this.f19287h = false;
    }

    public void onDestroy() {
        if (!(this.f19290k.f18013cx == 0 || this.f19292m == null || this.f19292m.f17768a == null)) {
            this.f19292m.f17768a.mo12168c();
        }
        if (!(this.f19290k.f18013cx == 0 || this.f19292m == null || this.f19292m.f17769b == null)) {
            this.f19292m.f17769b.destroy();
        }
        if ((this.f19288i && isFinishing()) || config.f17841i) {
            config.m23861n(this);
        }
        super.onDestroy();
    }

    public void onBackPressed() {
        if (!this.f19288i || this.f19287h || !this.f19290k.f18059ea) {
            super.onBackPressed();
            return;
        }
        this.f19287h = true;
        config.m23859l(this);
    }

    public void adLoaded(String str) {
        this.f19277A.cancel();
        this.f19300u.showAd();
    }

    public void onAdClosed() {
        if (this.f19303x) {
            abrir_secc(this.f19305z);
        }
    }

    public void adError(String str) {
        this.f19277A.cancel();
        abrir_secc(this.f19305z);
    }

    public void videoEnded() {
        this.f19303x = true;
        config.m23867t(this);
    }

    /* renamed from: z_ */
    public void mo9678z_() {
        this.f19277A.cancel();
        this.f19299t.mo12836a();
    }

    /* renamed from: a */
    public void mo9675a(C3165a aVar) {
        this.f19303x = true;
        config.m23867t(this);
    }

    /* renamed from: A_ */
    public void mo9671A_() {
        if (this.f19303x) {
            abrir_secc(this.f19305z);
        }
    }

    /* renamed from: e */
    public void mo9676e() {
        this.f19303x = false;
    }

    /* renamed from: a */
    public void mo9674a(int i) {
        if (!this.f19290k.mo20775a((Context) this, this.f19300u)) {
            this.f19277A.cancel();
            abrir_secc(this.f19305z);
        }
    }

    public void onError(C1514Ad ad, AdError adError) {
        this.f19277A.cancel();
        abrir_secc(this.f19305z);
    }

    public void onAdLoaded(C1514Ad ad) {
        this.f19277A.cancel();
        this.f19301v.show();
    }

    public void onRewardedVideoCompleted() {
        this.f19303x = true;
        config.m23867t(this);
    }

    public void onRewardedVideoClosed() {
        if (this.f19303x) {
            abrir_secc(this.f19305z);
        }
    }

    public void onVideoCompleted() {
        this.f19303x = true;
        config.m23867t(this);
    }

    public void onReceiveAd(C5286Ad ad) {
        this.f19277A.cancel();
        this.f19302w.showAd("REWARDED VIDEO", new AdDisplayListener() {
            public void adClicked(C5286Ad ad) {
            }

            public void adDisplayed(C5286Ad ad) {
            }

            public void adNotDisplayed(C5286Ad ad) {
            }

            public void adHidden(C5286Ad ad) {
                if (t_submenu.this.f19303x) {
                    t_submenu.this.abrir_secc(t_submenu.this.f19305z);
                }
            }
        });
    }

    public void onFailedToReceiveAd(C5286Ad ad) {
        this.f19277A.cancel();
        abrir_secc(this.f19305z);
    }
}
