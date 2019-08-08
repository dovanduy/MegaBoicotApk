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
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.Point;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.GradientDrawable.Orientation;
import android.os.AsyncTask;
import android.os.AsyncTask.Status;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.support.p028v7.widget.CardView;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
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
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Random;
import mega.boicot.config.C5640d;

public class t_menugrid extends Activity implements OnSharedPreferenceChangeListener, OnClickListener, OnItemClickListener, OnAdClosed, OnAdError, OnAdLoaded, OnVideoEnded, RewardedVideoAdListener, C3167c, VideoListener, AdEventListener, C5599a {

    /* renamed from: a */
    int f20639a = 80;

    /* renamed from: b */
    int f20640b = 30;

    /* renamed from: c */
    int f20641c;

    /* renamed from: d */
    int f20642d;

    /* renamed from: e */
    int f20643e;

    /* renamed from: f */
    int f20644f = 0;

    /* renamed from: g */
    boolean f20645g = false;

    /* renamed from: h */
    C6207b f20646h;

    /* renamed from: i */
    config f20647i;

    /* renamed from: j */
    C5602c f20648j;

    /* renamed from: k */
    C3166b f20649k;

    /* renamed from: l */
    RewardedVideo f20650l;

    /* renamed from: m */
    RewardedVideoAd f20651m;

    /* renamed from: n */
    StartAppAd f20652n;

    /* renamed from: o */
    boolean f20653o = false;

    /* renamed from: p */
    String f20654p;

    /* renamed from: q */
    View f20655q;

    /* renamed from: r */
    ProgressDialog f20656r;

    /* renamed from: s */
    MyGridView f20657s;

    /* renamed from: t */
    C6206a f20658t;

    /* renamed from: mega.boicot.t_menugrid$a */
    public class C6206a extends BaseAdapter {

        /* renamed from: b */
        private Context f20668b;

        public long getItemId(int i) {
            return (long) i;
        }

        public C6206a(Context context) {
            this.f20668b = context;
        }

        public int getCount() {
            return t_menugrid.this.f20647i.f17922bC.length;
        }

        public Object getItem(int i) {
            return Integer.valueOf(i);
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                LayoutInflater layoutInflater = (LayoutInflater) this.f20668b.getSystemService("layout_inflater");
                int i2 = t_menugrid.this.f20647i.f18052dt ? R.layout.t_menugrid_row : t_menugrid.this.f20647i.f18057dy == 1 ? R.layout.t_menugrid_row_formato2 : R.layout.t_menugrid_row_v;
                view = layoutInflater.inflate(i2, viewGroup, false);
                if (!t_menugrid.this.f20647i.f18052dt && t_menugrid.this.f20647i.f18057dy == 1) {
                    ((CardView) view.findViewById(R.id.cv)).setRadius((float) t_menugrid.this.f20647i.f18048dp);
                }
                if (t_menugrid.this.f20647i.f18050dr) {
                    ImageView imageView = (ImageView) view.findViewById(R.id.iv_menugrid);
                    if (t_menugrid.this.f20647i.f18052dt) {
                        imageView.getLayoutParams().height = t_menugrid.this.f20641c;
                        imageView.getLayoutParams().width = t_menugrid.this.f20642d;
                    } else {
                        imageView.getLayoutParams().height = t_menugrid.this.f20641c;
                        imageView.getLayoutParams().width = t_menugrid.this.f20642d;
                    }
                    imageView.setVisibility(0);
                }
                if (t_menugrid.this.f20647i.f18051ds) {
                    TextView textView = (TextView) view.findViewById(R.id.tv_menugrid);
                    if (t_menugrid.this.f20647i.f18056dx) {
                        textView.setTypeface(textView.getTypeface(), 1);
                    }
                    if (!t_menugrid.this.f20647i.f18018dC.equals("")) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("#");
                        sb.append(t_menugrid.this.f20647i.f18018dC);
                        textView.setTextColor(Color.parseColor(sb.toString()));
                    }
                    textView.getLayoutParams().width = t_menugrid.this.f20643e;
                    if (t_menugrid.this.f20647i.f18055dw) {
                        textView.setGravity(17);
                    } else if (VERSION.SDK_INT >= 17 && t_menugrid.this.getResources().getBoolean(R.bool.es_rtl)) {
                        textView.setTextDirection(4);
                    }
                    if (t_menugrid.this.f20647i.f18017dB.equals("")) {
                        textView.setBackgroundDrawable(null);
                    } else {
                        GradientDrawable gradientDrawable = (GradientDrawable) textView.getBackground();
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("#");
                        sb2.append(t_menugrid.this.f20647i.f18017dB);
                        gradientDrawable.setColor(Color.parseColor(sb2.toString()));
                        ((GradientDrawable) textView.getBackground()).setCornerRadius((float) t_menugrid.this.f20647i.f18048dp);
                    }
                    textView.setVisibility(0);
                }
            }
            if (t_menugrid.this.f20647i.f18050dr) {
                ImageView imageView2 = (ImageView) view.findViewById(R.id.iv_menugrid);
                if (t_menugrid.this.f20647i.f17971bz[t_menugrid.this.f20647i.f17922bC[i]].f18264aH || t_menugrid.this.f20647i.f17971bz[t_menugrid.this.f20647i.f17922bC[i]].f18263aG == null) {
                    imageView2.setImageBitmap(null);
                } else {
                    imageView2.setImageDrawable(new BitmapDrawable(t_menugrid.this.getResources(), t_menugrid.this.f20647i.f17971bz[t_menugrid.this.f20647i.f17922bC[i]].f18263aG));
                }
            }
            if (t_menugrid.this.f20647i.f18051ds) {
                ((TextView) view.findViewById(R.id.tv_menugrid)).setText(t_menugrid.this.f20647i.f17971bz[t_menugrid.this.f20647i.f17922bC[i]].f18256a);
            }
            return view;
        }
    }

    /* renamed from: mega.boicot.t_menugrid$b */
    private class C6207b extends AsyncTask<String, Void, String> {
        private C6207b() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public String doInBackground(String... strArr) {
            try {
                StringBuilder sb = new StringBuilder();
                sb.append("http://imgs1.e-droid.net/srv/imgs/fondos_menu/fm718963.png?v=");
                sb.append(t_menugrid.this.f20647i.f18049dq);
                try {
                    HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(sb.toString()).openConnection();
                    httpURLConnection.setDoInput(true);
                    httpURLConnection.setConnectTimeout(10000);
                    httpURLConnection.setReadTimeout(60000);
                    httpURLConnection.connect();
                    InputStream inputStream = httpURLConnection.getInputStream();
                    Bitmap decodeStream = BitmapFactory.decodeStream(inputStream);
                    inputStream.close();
                    httpURLConnection.disconnect();
                    try {
                        decodeStream.compress(CompressFormat.PNG, 100, t_menugrid.this.openFileOutput("fondomenu", 0));
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
            if (str.equals("1")) {
                t_menugrid.this.f20647i.f18016dA = false;
                Editor edit = t_menugrid.this.getSharedPreferences("sh", 0).edit();
                edit.putBoolean("act_fm", false);
                edit.commit();
                if (!t_menugrid.this.f20647i.equals(null)) {
                    try {
                        FileInputStream openFileInput = t_menugrid.this.openFileInput("fondomenu");
                        ((ImageView) t_menugrid.this.findViewById(R.id.iv_fondo)).setImageBitmap(BitmapFactory.decodeFileDescriptor(openFileInput.getFD()));
                        openFileInput.close();
                    } catch (FileNotFoundException | IOException unused) {
                    }
                }
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

    @TargetApi(13)
    public void onCreate(Bundle bundle) {
        int i;
        int i2;
        this.f20647i = (config) getApplicationContext();
        if (this.f20647i.f17881aN == null) {
            this.f20647i.mo20780b();
        }
        this.f20654p = config.m23831a(this.f20647i.f18019dD, this.f20647i.f17890aW);
        super.onCreate(bundle);
        setContentView(R.layout.t_menugrid);
        this.f20647i.f18074k = 900;
        boolean z = false;
        SharedPreferences sharedPreferences = getSharedPreferences("sh", 0);
        sharedPreferences.registerOnSharedPreferenceChangeListener(this);
        Editor edit = sharedPreferences.edit();
        edit.putInt("ind_secc_sel", this.f20647i.f18074k);
        edit.commit();
        mo22267f();
        if (this.f20647i.f18080q > 0) {
            SearchManager searchManager = (SearchManager) getSystemService("search");
            searchManager.setOnCancelListener(new OnCancelListener() {
                public void onCancel() {
                    t_menugrid.this.setResult(0);
                }
            });
            searchManager.setOnDismissListener(new OnDismissListener() {
                public void onDismiss() {
                }
            });
        }
        if (!this.f20647i.f18019dD.equals("")) {
            Orientation orientation = Orientation.TOP_BOTTOM;
            StringBuilder sb = new StringBuilder();
            sb.append("#");
            sb.append(this.f20647i.f18019dD);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("#");
            sb2.append(this.f20647i.f18020dE);
            findViewById(R.id.ll_princ).setBackgroundDrawable(new GradientDrawable(orientation, new int[]{Color.parseColor(sb.toString()), Color.parseColor(sb2.toString())}));
        }
        float f = getResources().getDisplayMetrics().density;
        this.f20639a = (int) ((((float) this.f20639a) * f) + 0.5f);
        this.f20640b = (int) ((((float) this.f20640b) * f) + 0.5f);
        this.f20641c = 0;
        this.f20642d = 0;
        this.f20643e = 0;
        LayoutInflater layoutInflater = (LayoutInflater) getSystemService("layout_inflater");
        int i3 = this.f20647i.f18052dt ? R.layout.t_menugrid_row : this.f20647i.f18057dy == 1 ? R.layout.t_menugrid_row_formato2 : R.layout.t_menugrid_row_v;
        TextView textView = (TextView) layoutInflater.inflate(i3, (LinearLayout) findViewById(R.id.ll_princ), false).findViewById(R.id.tv_menugrid);
        for (int i4 = 0; i4 < this.f20647i.f17971bz.length; i4++) {
            if (!this.f20647i.f17971bz[i4].f18333z) {
                if (this.f20647i.f18051ds) {
                    textView.setText(this.f20647i.f17971bz[i4].f18256a);
                    if (this.f20647i.f18056dx) {
                        textView.setTypeface(textView.getTypeface(), 1);
                    }
                    textView.measure(0, 0);
                    this.f20643e = Math.max(this.f20643e, textView.getMeasuredWidth());
                }
                if (this.f20647i.f18050dr) {
                    if (!this.f20647i.f17971bz[i4].f18264aH && this.f20647i.f17971bz[i4].f18263aG != null) {
                        this.f20641c = Math.max(this.f20641c, this.f20647i.f17971bz[i4].f18263aG.getHeight());
                        this.f20642d = Math.max(this.f20642d, this.f20647i.f17971bz[i4].f18263aG.getWidth());
                    } else if (!(!this.f20647i.f17971bz[i4].f18264aH || this.f20647i.f17971bz[i4].f18267aK == 0 || this.f20647i.f17971bz[i4].f18268aL == 0)) {
                        this.f20641c = Math.max(this.f20641c, this.f20647i.f17971bz[i4].f18268aL);
                        this.f20642d = Math.max(this.f20642d, this.f20647i.f17971bz[i4].f18267aK);
                    }
                }
            }
        }
        this.f20641c = (int) ((((float) this.f20641c) * f) + 0.5f);
        this.f20642d = (int) ((((float) this.f20642d) * f) + 0.5f);
        Display defaultDisplay = getWindowManager().getDefaultDisplay();
        if (VERSION.SDK_INT >= 13) {
            Point point = new Point();
            defaultDisplay.getSize(point);
            i = point.x;
        } else {
            i = defaultDisplay.getWidth();
        }
        if (this.f20647i.f18052dt && this.f20641c > this.f20640b) {
            this.f20642d = (this.f20642d * this.f20640b) / this.f20641c;
            this.f20641c = this.f20640b;
        } else if (!this.f20647i.f18052dt && this.f20641c > this.f20639a) {
            this.f20642d = (this.f20642d * this.f20639a) / this.f20641c;
            this.f20641c = this.f20639a;
        }
        if (!this.f20647i.f18052dt && this.f20647i.f18051ds && this.f20642d > this.f20643e) {
            this.f20641c = (this.f20641c * this.f20643e) / this.f20642d;
            this.f20642d = this.f20643e;
        }
        this.f20657s = (MyGridView) findViewById(R.id.grid);
        if (this.f20647i.f18054dv) {
            ((LinearLayout) findViewById(R.id.ll_grid)).setGravity(1);
        }
        int i5 = this.f20647i.f18047do == 1 ? 16 : this.f20647i.f18047do == 2 ? 24 : 1;
        int i6 = (int) ((((float) i5) * f) + 0.5f);
        this.f20657s.setVerticalSpacing(i6);
        this.f20657s.setHorizontalSpacing(i6);
        int i7 = (int) ((10.0f * f) + 0.5f);
        this.f20657s.setPadding(i7, i7, i7, i7);
        int i8 = this.f20647i.f18046dn;
        if (this.f20647i.f18052dt) {
            i2 = this.f20642d + this.f20643e + i6;
            int i9 = (int) ((4.0f * f) + 0.5f);
            if (this.f20647i.f18051ds) {
                i2 += i9;
            }
            m24752b(this.f20642d + this.f20643e);
        } else {
            i2 = Math.max(this.f20642d, this.f20643e) + i6 + (this.f20647i.f18057dy == 1 ? config.m23845b((Context) this, 10) : 0);
            m24752b(this.f20643e);
        }
        while (i8 > 1 && (i2 * i8) + (i7 * 2) > i) {
            i8--;
        }
        this.f20657s.setNumColumns(i8);
        this.f20657s.getLayoutParams().width = ((i2 * i8) + (i7 * 2)) - i6;
        this.f20657s.setOnItemClickListener(this);
        if (!this.f20647i.f18053du || bundle != null) {
            this.f20657s.setLayoutAnimation(null);
        }
        this.f20658t = new C6206a(this);
        this.f20657s.setAdapter(this.f20658t);
        if (this.f20647i.f18058dz) {
            File file = new File(getFilesDir(), "fondomenu");
            if (!this.f20647i.f18016dA && file.exists()) {
                try {
                    FileInputStream openFileInput = openFileInput("fondomenu");
                    ((ImageView) findViewById(R.id.iv_fondo)).setImageBitmap(BitmapFactory.decodeFileDescriptor(openFileInput.getFD()));
                    openFileInput.close();
                } catch (FileNotFoundException | IOException unused) {
                }
            } else if (this.f20646h == null || this.f20646h.getStatus() != Status.RUNNING) {
                this.f20646h = new C6207b();
                this.f20646h.execute(new String[0]);
            }
        }
        if (this.f20647i.f18061ec) {
            TextView textView2 = (TextView) findViewById(R.id.privacy_grid);
            if (!this.f20647i.f18020dE.equals("")) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("#");
                sb3.append(this.f20647i.f18020dE);
                if (config.m23844a(sb3.toString())) {
                    textView2.setTextColor(config.f17838f);
                    textView2.setOnClickListener(new OnClickListener() {
                        public void onClick(View view) {
                            new C5640d(t_menugrid.this, t_menugrid.this.f20647i.f17890aW, config.m23831a(t_menugrid.this.f20647i.f17881aN, t_menugrid.this.f20647i.f17890aW)).execute(new String[0]);
                        }
                    });
                    textView2.setVisibility(0);
                }
            }
            textView2.setTextColor(config.f17834e);
            textView2.setOnClickListener(new OnClickListener() {
                public void onClick(View view) {
                    new C5640d(t_menugrid.this, t_menugrid.this.f20647i.f17890aW, config.m23831a(t_menugrid.this.f20647i.f17881aN, t_menugrid.this.f20647i.f17890aW)).execute(new String[0]);
                }
            });
            textView2.setVisibility(0);
        }
        if (bundle == null) {
            Bundle extras = getIntent().getExtras();
            if (extras != null && extras.containsKey("intent_abrir")) {
                startActivityForResult((Intent) extras.get("intent_abrir"), 0);
            } else if (bundle == null) {
                config config = this.f20647i;
                boolean z2 = extras != null && extras.containsKey("ad_entrar");
                if (extras != null && extras.containsKey("fb_entrar")) {
                    z = true;
                }
                config.mo20770a((Context) this, z2, z);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m24752b(final int i) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5 = (this.f20647i.f17979cH.equals("") || this.f20647i.f17992cU == 0 || this.f20647i.f17993cV == 0) ? false : true;
        boolean z6 = !this.f20647i.f17980cI.equals("") && this.f20647i.f18072eq != null && this.f20647i.f18072eq.size() > 0;
        boolean z7 = !this.f20647i.f17982cK.equals("");
        boolean z8 = !this.f20647i.f17984cM.equals("");
        if (z5 || z6 || z7 || z8 || this.f20647i.f17980cI.equals("") || this.f20644f >= 5) {
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
                adView.setAdUnitId(this.f20647i.f17979cH);
                findViewById(R.id.ll_appsreco).setVisibility(8);
                ((LinearLayout) findViewById(R.id.ll_nat)).setVisibility(0);
                ((LinearLayout) findViewById(R.id.ll_nat)).removeViewAt(1);
                ((LinearLayout) findViewById(R.id.ll_nat)).addView(adView, 1);
                adView.mo12166a(new C2972a().mo12209a());
            } else if (z4) {
                if (!this.f20647i.f18019dD.equals("")) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("#");
                    sb.append(this.f20647i.f18019dD);
                    if (config.m23844a(sb.toString())) {
                        ((TextView) findViewById(R.id.tv_appsreco)).setTextColor(config.f17813a);
                    }
                }
                this.f20647i.mo20765a(this, 1, 3, -1, null);
            } else if (z3) {
                final NativeAd nativeAd = new NativeAd(this, this.f20647i.f17982cK);
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
                        if (t_menugrid.this.f20647i.f18020dE != null && !t_menugrid.this.f20647i.f18020dE.equals("")) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("#");
                            sb.append(t_menugrid.this.f20647i.f18020dE);
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
                        if (t_menugrid.this.f20647i.f18051ds && t_menugrid.this.f20647i.f18018dC != null && !t_menugrid.this.f20647i.f18018dC.equals("") && t_menugrid.this.f20647i.f18017dB != null && !t_menugrid.this.f20647i.f18017dB.equals("")) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("#");
                            sb2.append(t_menugrid.this.f20647i.f18018dC);
                            NativeAdViewAttributes buttonBorderColor = backgroundColor.setButtonTextColor(Color.parseColor(sb2.toString())).setButtonBorderColor(-12303292);
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append("#");
                            sb3.append(t_menugrid.this.f20647i.f18017dB);
                            buttonBorderColor.setButtonColor(Color.parseColor(sb3.toString()));
                        }
                        View render = NativeAdView.render(t_menugrid.this, nativeAd, Type.HEIGHT_300, backgroundColor);
                        ((LinearLayout) t_menugrid.this.findViewById(R.id.ll_nat)).setVisibility(0);
                        ((LinearLayout) t_menugrid.this.findViewById(R.id.ll_nat)).removeViewAt(1);
                        ((LinearLayout) t_menugrid.this.findViewById(R.id.ll_nat)).addView(render, 1);
                    }
                });
                findViewById(R.id.ll_appsreco).setVisibility(8);
                nativeAd.loadAd();
            } else if (z2) {
                Mrec mrec = new Mrec((Activity) this);
                mrec.setAdTag("MENU");
                ((LinearLayout) findViewById(R.id.ll_nat)).setVisibility(0);
                ((LinearLayout) findViewById(R.id.ll_nat)).removeViewAt(1);
                ((LinearLayout) findViewById(R.id.ll_nat)).addView(mrec, 1);
            } else {
                this.f20648j = this.f20647i.mo20760a((Context) this, false);
            }
            return;
        }
        this.f20644f++;
        new Handler().postDelayed(new Runnable() {
            public void run() {
                t_menugrid.this.m24752b(i);
            }
        }, 1000);
    }

    public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if (this.f20658t != null && str.equals("ico_cargado")) {
            this.f20658t.notifyDataSetChanged();
        }
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        view.setId(this.f20647i.f17922bC[i]);
        view.setTag(R.id.TAG_IDSECC, Integer.valueOf(this.f20647i.f17922bC[i]));
        onClick(view);
    }

    public void onClick(View view) {
        if (this.f20647i.f17986cO != null && !this.f20647i.f17986cO.equals("")) {
            this.f20650l = new RewardedVideo((Context) this, this.f20647i.f17986cO);
        }
        if (this.f20647i.f17985cN != null && !this.f20647i.f17985cN.equals("")) {
            this.f20649k = C2997g.m10716a(this);
        }
        if (this.f20647i.f17988cQ != null && !this.f20647i.f17988cQ.equals("")) {
            this.f20651m = new RewardedVideoAd(this, this.f20647i.f17988cQ);
        }
        if (this.f20647i.f17989cR != null && !this.f20647i.f17989cR.equals("")) {
            this.f20652n = new StartAppAd(this);
        }
        this.f20656r = new ProgressDialog(this);
        this.f20655q = view;
        if (!this.f20647i.mo20774a((Context) this, view, this.f20654p, this.f20656r, this.f20649k, this.f20650l, this.f20651m, this.f20652n)) {
            abrir_secc(view);
        }
    }

    public void abrir_secc(View view) {
        C5662h a = this.f20647i.mo20761a(view, (Context) this);
        if (a.f18228c) {
            finish();
        } else if (a.f18226a != null) {
            startActivityForResult(a.f18226a, 0);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public void mo22267f() {
        this.f20647i.mo20778b((Context) this);
        for (int i = 0; i < this.f20647i.f17923bD.length; i++) {
            if (this.f20647i.f17923bD[i] > 0) {
                findViewById(this.f20647i.f17923bD[i]).setOnClickListener(this);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i2 == -1 && intent != null && intent.hasExtra("finalizar_app") && intent.getExtras().getBoolean("finalizar_app")) {
            finish();
        }
    }

    public boolean onSearchRequested() {
        if (this.f20647i.f18080q == 0) {
            return false;
        }
        return super.onSearchRequested();
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getWindow().setFormat(1);
    }

    public void onPause() {
        if (!(this.f20647i.f18013cx == 0 || this.f20648j == null || this.f20648j.f17768a == null)) {
            this.f20648j.f17768a.mo12167b();
        }
        super.onPause();
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
        if (this.f20647i.f18085v > 0) {
            ImageView imageView = (ImageView) findViewById(this.f20647i.f18085v + 10000);
            if (imageView != null) {
                this.f20647i.mo20768a((Context) this, imageView);
            }
        }
        if (!(this.f20647i.f18013cx == 0 || this.f20648j == null || this.f20648j.f17768a == null)) {
            this.f20648j.f17768a.mo12165a();
        }
        this.f20645g = false;
    }

    public void onDestroy() {
        if (!(this.f20647i.f18013cx == 0 || this.f20648j == null || this.f20648j.f17768a == null)) {
            this.f20648j.f17768a.mo12168c();
        }
        if (!(this.f20647i.f18013cx == 0 || this.f20648j == null || this.f20648j.f17769b == null)) {
            this.f20648j.f17769b.destroy();
        }
        if (isFinishing()) {
            config.m23861n(this);
        }
        super.onDestroy();
    }

    public void onBackPressed() {
        if (this.f20645g || !this.f20647i.f18059ea) {
            super.onBackPressed();
            return;
        }
        this.f20645g = true;
        config.m23859l(this);
    }

    public void adLoaded(String str) {
        this.f20656r.cancel();
        this.f20650l.showAd();
    }

    public void onAdClosed() {
        if (this.f20653o) {
            abrir_secc(this.f20655q);
        }
    }

    public void adError(String str) {
        this.f20656r.cancel();
        abrir_secc(this.f20655q);
    }

    public void videoEnded() {
        this.f20653o = true;
        config.m23867t(this);
    }

    /* renamed from: z_ */
    public void mo9678z_() {
        this.f20656r.cancel();
        this.f20649k.mo12836a();
    }

    /* renamed from: a */
    public void mo9675a(C3165a aVar) {
        this.f20653o = true;
        config.m23867t(this);
    }

    /* renamed from: A_ */
    public void mo9671A_() {
        if (this.f20653o) {
            abrir_secc(this.f20655q);
        }
    }

    /* renamed from: e */
    public void mo9676e() {
        this.f20653o = false;
    }

    /* renamed from: a */
    public void mo9674a(int i) {
        if (!this.f20647i.mo20775a((Context) this, this.f20650l)) {
            this.f20656r.cancel();
            abrir_secc(this.f20655q);
        }
    }

    public void onError(C1514Ad ad, AdError adError) {
        this.f20656r.cancel();
        abrir_secc(this.f20655q);
    }

    public void onAdLoaded(C1514Ad ad) {
        this.f20656r.cancel();
        this.f20651m.show();
    }

    public void onRewardedVideoCompleted() {
        this.f20653o = true;
        config.m23867t(this);
    }

    public void onRewardedVideoClosed() {
        if (this.f20653o) {
            abrir_secc(this.f20655q);
        }
    }

    public void onVideoCompleted() {
        this.f20653o = true;
        config.m23867t(this);
    }

    public void onReceiveAd(C5286Ad ad) {
        this.f20656r.cancel();
        this.f20652n.showAd("REWARDED VIDEO", new AdDisplayListener() {
            public void adClicked(C5286Ad ad) {
            }

            public void adDisplayed(C5286Ad ad) {
            }

            public void adNotDisplayed(C5286Ad ad) {
            }

            public void adHidden(C5286Ad ad) {
                if (t_menugrid.this.f20653o) {
                    t_menugrid.this.abrir_secc(t_menugrid.this.f20655q);
                }
            }
        });
    }

    public void onFailedToReceiveAd(C5286Ad ad) {
        this.f20656r.cancel();
        abrir_secc(this.f20655q);
    }
}
