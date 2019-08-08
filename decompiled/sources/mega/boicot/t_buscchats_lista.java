package mega.boicot;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.app.ProgressDialog;
import android.app.SearchManager;
import android.app.SearchManager.OnCancelListener;
import android.app.SearchManager.OnDismissListener;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.Color;
import android.graphics.PorterDuff.Mode;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.GradientDrawable.Orientation;
import android.os.AsyncTask;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.p028v7.widget.LinearLayoutManager;
import android.support.p028v7.widget.RecyclerView;
import android.support.p028v7.widget.RecyclerView.C0870a;
import android.support.p028v7.widget.RecyclerView.C0881i;
import android.support.p028v7.widget.RecyclerView.C0901v;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
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
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.NumberFormat;
import java.util.ArrayList;

public class t_buscchats_lista extends Activity implements OnClickListener, OnAdClosed, OnAdError, OnAdLoaded, OnVideoEnded, RewardedVideoAdListener, C3167c, VideoListener, AdEventListener, C5599a {
    /* access modifiers changed from: private */

    /* renamed from: A */
    public int f18634A;
    /* access modifiers changed from: private */

    /* renamed from: B */
    public boolean f18635B = false;
    /* access modifiers changed from: private */

    /* renamed from: C */
    public boolean f18636C = false;

    /* renamed from: D */
    private boolean f18637D = false;

    /* renamed from: E */
    private RecyclerView f18638E;
    /* access modifiers changed from: private */

    /* renamed from: F */
    public C0870a f18639F;

    /* renamed from: G */
    private C0881i f18640G;
    /* access modifiers changed from: private */

    /* renamed from: H */
    public Thread f18641H;
    /* access modifiers changed from: private */

    /* renamed from: I */
    public C5767b f18642I;

    /* renamed from: J */
    private Runnable f18643J = new Runnable() {
        public void run() {
            String str;
            try {
                t_buscchats_lista.this.findViewById(R.id.pb_chats).setVisibility(8);
            } catch (Exception unused) {
            }
            if (t_buscchats_lista.this.f18664u != null && t_buscchats_lista.this.f18664u.size() > 0) {
                for (int i = 0; i < t_buscchats_lista.this.f18664u.size(); i++) {
                    if (t_buscchats_lista.this.f18665v.indexOf(Integer.valueOf(((C6020m) t_buscchats_lista.this.f18664u.get(i)).f19874e)) == -1) {
                        t_buscchats_lista.this.f18663t.add(t_buscchats_lista.this.f18664u.get(i));
                        t_buscchats_lista.this.f18665v.add(Integer.valueOf(((C6020m) t_buscchats_lista.this.f18664u.get(i)).f19874e));
                    }
                }
            }
            t_buscchats_lista.this.f18639F.notifyDataSetChanged();
            if (t_buscchats_lista.this.f18663t != null && t_buscchats_lista.this.f18663t.size() == 0) {
                if (!t_buscchats_lista.this.f18636C) {
                    str = t_buscchats_lista.this.getResources().getString(R.string.error_http);
                } else if (t_buscchats_lista.this.f18634A == 3) {
                    str = t_buscchats_lista.this.getResources().getString(R.string.lista_vacia_favoritos);
                } else {
                    str = t_buscchats_lista.this.getResources().getString(R.string.lista_vacia_porcat);
                }
                Builder builder = new Builder(t_buscchats_lista.this);
                builder.setCancelable(true).setPositiveButton(t_buscchats_lista.this.getString(R.string.aceptar), null).setMessage(str);
                try {
                    AlertDialog create = builder.create();
                    create.show();
                    ((TextView) create.findViewById(16908299)).setTypeface(Typeface.MONOSPACE);
                } catch (Exception unused2) {
                }
            }
            if (t_buscchats_lista.this.f18663t != null && t_buscchats_lista.this.f18663t.size() > 0) {
                t_buscchats_lista.this.f18642I = new C5767b();
                t_buscchats_lista.this.f18642I.execute(new String[0]);
            }
        }
    };

    /* renamed from: a */
    int f18644a;

    /* renamed from: b */
    int f18645b;

    /* renamed from: c */
    config f18646c;

    /* renamed from: d */
    boolean f18647d = false;

    /* renamed from: e */
    boolean f18648e = false;

    /* renamed from: f */
    boolean f18649f;

    /* renamed from: g */
    String f18650g;

    /* renamed from: h */
    Bundle f18651h;

    /* renamed from: i */
    C5602c f18652i;

    /* renamed from: j */
    C3166b f18653j;

    /* renamed from: k */
    RewardedVideo f18654k;

    /* renamed from: l */
    RewardedVideoAd f18655l;

    /* renamed from: m */
    StartAppAd f18656m;

    /* renamed from: n */
    boolean f18657n = false;

    /* renamed from: o */
    boolean f18658o = false;

    /* renamed from: p */
    View f18659p;

    /* renamed from: q */
    ProgressDialog f18660q;

    /* renamed from: r */
    ListView f18661r;

    /* renamed from: s */
    SharedPreferences f18662s;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public ArrayList<C6020m> f18663t = null;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public ArrayList<C6020m> f18664u = null;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public ArrayList<Integer> f18665v = null;
    /* access modifiers changed from: private */

    /* renamed from: w */
    public Runnable f18666w;
    /* access modifiers changed from: private */

    /* renamed from: x */
    public int f18667x;

    /* renamed from: y */
    private int f18668y;

    /* renamed from: z */
    private int f18669z;

    /* renamed from: mega.boicot.t_buscchats_lista$a */
    public class C5765a extends C0870a<C5766a> {

        /* renamed from: b */
        private ArrayList<C6020m> f18678b;

        /* renamed from: mega.boicot.t_buscchats_lista$a$a */
        public class C5766a extends C0901v {

            /* renamed from: a */
            public TextView f18679a;

            /* renamed from: b */
            public TextView f18680b;

            /* renamed from: c */
            public ImageView f18681c;

            /* renamed from: d */
            public LinearLayout f18682d;

            public C5766a(View view) {
                super(view);
                this.f18682d = (LinearLayout) view.findViewById(R.id.fila);
                this.f18679a = (TextView) view.findViewById(R.id.titulo);
                this.f18680b = (TextView) view.findViewById(R.id.nusus);
                this.f18681c = (ImageView) view.findViewById(R.id.f1);
            }
        }

        public C5765a(ArrayList<C6020m> arrayList) {
            this.f18678b = arrayList;
        }

        /* renamed from: a */
        public C5766a onCreateViewHolder(ViewGroup viewGroup, int i) {
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.row_chat, viewGroup, false);
            Drawable drawable = t_buscchats_lista.this.getResources().getDrawable(R.drawable.ir);
            StringBuilder sb = new StringBuilder();
            sb.append("#");
            sb.append(t_buscchats_lista.this.f18646c.f17890aW);
            drawable.setColorFilter(Color.parseColor(sb.toString()), Mode.MULTIPLY);
            ((ImageView) inflate.findViewById(R.id.iv_ir)).setImageDrawable(drawable);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("#");
            sb2.append(t_buscchats_lista.this.f18646c.f17971bz[t_buscchats_lista.this.f18645b].f18314g);
            if (config.m23844a(sb2.toString())) {
                ((TextView) inflate.findViewById(R.id.titulo)).setTextColor(config.f17813a);
                ((TextView) inflate.findViewById(R.id.nusus)).setTextColor(config.f17814b);
            } else {
                ((TextView) inflate.findViewById(R.id.titulo)).setTextColor(-1);
                ((TextView) inflate.findViewById(R.id.nusus)).setTextColor(config.f17824d);
            }
            inflate.setOnClickListener(t_buscchats_lista.this);
            return new C5766a(inflate);
        }

        /* renamed from: a */
        public void onBindViewHolder(C5766a aVar, int i) {
            C6020m mVar = (C6020m) this.f18678b.get(i);
            aVar.f18679a.setText(mVar.f19870a);
            if (mVar.f19883n < 10) {
                TextView textView = aVar.f18680b;
                StringBuilder sb = new StringBuilder();
                sb.append("<10 ");
                sb.append(t_buscchats_lista.this.getResources().getString(R.string.usuarios));
                textView.setText(sb.toString());
            } else {
                TextView textView2 = aVar.f18680b;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(NumberFormat.getInstance().format((long) mVar.f19883n));
                sb2.append(" ");
                sb2.append(t_buscchats_lista.this.getResources().getString(R.string.usuarios));
                textView2.setText(sb2.toString());
            }
            if (mVar.f19875f == 0) {
                aVar.f18681c.setImageDrawable(t_buscchats_lista.this.getResources().getDrawable(t_buscchats_lista.this.f18667x));
            } else if (mVar.f19884o != null) {
                aVar.f18681c.setImageBitmap(mVar.f19884o);
            } else if (mVar.f19885p) {
                aVar.f18681c.setImageDrawable(t_buscchats_lista.this.getResources().getDrawable(t_buscchats_lista.this.f18667x));
            } else {
                aVar.f18681c.setImageDrawable(t_buscchats_lista.this.getResources().getDrawable(R.drawable.cargando));
            }
            aVar.f18682d.setTag(Integer.valueOf(i));
            if (t_buscchats_lista.this.f18635B && i == t_buscchats_lista.this.f18663t.size() - 1) {
                if (t_buscchats_lista.this.f18641H == null || !t_buscchats_lista.this.f18641H.isAlive()) {
                    t_buscchats_lista.this.findViewById(R.id.pb_chats).setVisibility(0);
                    t_buscchats_lista.this.f18641H = new Thread(null, t_buscchats_lista.this.f18666w, "buscandoelems");
                    t_buscchats_lista.this.f18641H.start();
                }
            }
        }

        public int getItemCount() {
            return this.f18678b.size();
        }
    }

    /* renamed from: mega.boicot.t_buscchats_lista$b */
    private class C5767b extends AsyncTask<String, Void, String> {

        /* renamed from: a */
        int f18684a;

        /* renamed from: b */
        int f18685b;

        /* renamed from: c */
        int f18686c;

        /* renamed from: d */
        int f18687d;

        /* renamed from: e */
        Bitmap f18688e;

        private C5767b() {
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
            boolean z = false;
            int i = 0;
            while (true) {
                if (i >= t_buscchats_lista.this.f18663t.size()) {
                    break;
                }
                C6020m mVar = (C6020m) t_buscchats_lista.this.f18663t.get(i);
                if (!mVar.f19885p && mVar.f19875f != 0) {
                    this.f18684a = 1;
                    this.f18687d = mVar.f19875f;
                    this.f18685b = mVar.f19873d;
                    this.f18686c = i;
                    z = true;
                    break;
                }
                i++;
            }
            if (!z) {
                cancel(true);
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public String doInBackground(String... strArr) {
            URL url;
            try {
                if (this.f18687d > 100) {
                    this.f18687d -= 100;
                }
                try {
                    StringBuilder sb = new StringBuilder();
                    sb.append("http://imgs1.e-droid.net/srv/imgs/gen/");
                    sb.append(this.f18685b);
                    sb.append("_ico.png");
                    url = new URL(sb.toString());
                } catch (MalformedURLException unused) {
                    url = null;
                }
                try {
                    HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                    httpURLConnection.setDoInput(true);
                    httpURLConnection.setConnectTimeout(5000);
                    httpURLConnection.setReadTimeout(7000);
                    httpURLConnection.connect();
                    InputStream inputStream = httpURLConnection.getInputStream();
                    Options options = new Options();
                    options.inJustDecodeBounds = true;
                    BitmapFactory.decodeStream(inputStream, null, options);
                    inputStream.close();
                    httpURLConnection.disconnect();
                    int round = Math.round(TypedValue.applyDimension(1, 200.0f, t_buscchats_lista.this.getResources().getDisplayMetrics()));
                    options.inSampleSize = config.m23826a(options, round, round);
                    HttpURLConnection httpURLConnection2 = (HttpURLConnection) url.openConnection();
                    httpURLConnection2.setDoInput(true);
                    httpURLConnection2.setConnectTimeout(5000);
                    httpURLConnection2.setReadTimeout(7000);
                    httpURLConnection2.connect();
                    InputStream inputStream2 = httpURLConnection2.getInputStream();
                    options.inJustDecodeBounds = false;
                    this.f18688e = BitmapFactory.decodeStream(inputStream2, null, options);
                    inputStream2.close();
                    return "ANDROID:OK";
                } catch (Exception unused2) {
                    return "ANDROID:KO";
                }
            } catch (Exception unused3) {
                return "ANDROID:KO";
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void onPostExecute(String str) {
            try {
                if (this.f18684a == 1) {
                    ((C6020m) t_buscchats_lista.this.f18663t.get(this.f18686c)).f19885p = true;
                }
                if (str.indexOf("ANDROID:OK") != -1 && this.f18684a == 1) {
                    ((C6020m) t_buscchats_lista.this.f18663t.get(this.f18686c)).f19884o = config.m23828a(this.f18688e, 1);
                }
                t_buscchats_lista.this.f18639F.notifyDataSetChanged();
                t_buscchats_lista.this.f18642I = new C5767b();
                t_buscchats_lista.this.f18642I.execute(new String[0]);
            } catch (Exception unused) {
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
        this.f18646c = (config) getApplicationContext();
        if (this.f18646c.f17881aN == null) {
            this.f18646c.mo20780b();
        }
        this.f18651h = getIntent().getExtras();
        if (bundle == null) {
            this.f18649f = this.f18651h != null && this.f18651h.containsKey("es_root") && this.f18651h.getBoolean("es_root", false);
        } else {
            this.f18649f = bundle.containsKey("es_root") && bundle.getBoolean("es_root", false);
        }
        this.f18645b = this.f18651h.getInt("ind");
        this.f18650g = config.m23831a(this.f18646c.f17971bz[this.f18645b].f18314g, this.f18646c.f17890aW);
        if (VERSION.SDK_INT > 12) {
            StringBuilder sb = new StringBuilder();
            sb.append("#");
            sb.append(this.f18646c.f17971bz[this.f18645b].f18314g);
            if (!config.m23844a(sb.toString())) {
                setTheme(R.style.holonolight);
            }
        }
        super.onCreate(bundle);
        setContentView(R.layout.t_buscchats_lista);
        mo21045f();
        if (this.f18646c.f18080q > 0) {
            SearchManager searchManager = (SearchManager) getSystemService("search");
            searchManager.setOnCancelListener(new OnCancelListener() {
                public void onCancel() {
                    t_buscchats_lista.this.f18647d = false;
                    t_buscchats_lista.this.setResult(0);
                }
            });
            searchManager.setOnDismissListener(new OnDismissListener() {
                public void onDismiss() {
                    t_buscchats_lista.this.f18658o = false;
                }
            });
        }
        this.f18646c.mo20770a((Context) this, this.f18651h != null && this.f18651h.containsKey("ad_entrar"), this.f18651h != null && this.f18651h.containsKey("fb_entrar"));
        this.f18668y = 0;
        this.f18669z = 0;
        this.f18634A = 0;
        if (this.f18651h != null && this.f18651h.containsKey("idcat")) {
            this.f18668y = this.f18651h.getInt("idcat");
        }
        if (this.f18651h != null && this.f18651h.containsKey("idsubcat")) {
            this.f18669z = this.f18651h.getInt("idsubcat");
        }
        if (this.f18651h != null && this.f18651h.containsKey("tipo")) {
            this.f18634A = this.f18651h.getInt("tipo");
        }
        this.f18652i = this.f18646c.mo20760a((Context) this, false);
        this.f18662s = getSharedPreferences("sh", 0);
        this.f18644a = this.f18662s.getInt("idusu", 0);
        this.f18667x = R.drawable.sinfoto_chat;
        if (!this.f18646c.f17971bz[this.f18645b].f18314g.equals("")) {
            Orientation orientation = Orientation.TOP_BOTTOM;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("#");
            sb2.append(this.f18646c.f17971bz[this.f18645b].f18314g);
            StringBuilder sb3 = new StringBuilder();
            sb3.append("#");
            sb3.append(this.f18646c.f17971bz[this.f18645b].f18315h);
            findViewById(R.id.ll_princ).setBackgroundDrawable(new GradientDrawable(orientation, new int[]{Color.parseColor(sb2.toString()), Color.parseColor(sb3.toString())}));
        }
        StringBuilder sb4 = new StringBuilder();
        sb4.append("#");
        sb4.append(this.f18646c.f17971bz[this.f18645b].f18314g);
        if (config.m23844a(sb4.toString())) {
            findViewById(R.id.ll_cabe).setBackgroundColor(config.f17838f);
            ((TextView) findViewById(R.id.tv_cabe)).setTextColor(-1);
        } else {
            findViewById(R.id.ll_cabe).setBackgroundColor(config.f17834e);
            ((TextView) findViewById(R.id.tv_cabe)).setTextColor(config.f17813a);
        }
        if (this.f18651h != null && this.f18651h.containsKey("tit_cab")) {
            ((TextView) findViewById(R.id.tv_cabe)).setText(this.f18651h.getString("tit_cab"));
            findViewById(R.id.tv_cabe).setOnClickListener(new OnClickListener() {
                public void onClick(View view) {
                    t_buscchats_lista.this.finish();
                }
            });
            findViewById(R.id.iv_cabe).setOnClickListener(new OnClickListener() {
                public void onClick(View view) {
                    t_buscchats_lista.this.finish();
                }
            });
            findViewById(R.id.ll_cabe).setVisibility(0);
        }
        this.f18663t = new ArrayList<>();
        this.f18665v = new ArrayList<>();
        this.f18638E = (RecyclerView) findViewById(R.id.my_recycler_view);
        this.f18638E.setHasFixedSize(true);
        this.f18640G = new LinearLayoutManager(this);
        this.f18638E.setLayoutManager(this.f18640G);
        this.f18639F = new C5765a(this.f18663t);
        this.f18638E.setAdapter(this.f18639F);
        this.f18666w = new Runnable() {
            public void run() {
                t_buscchats_lista.this.m24059g();
            }
        };
        this.f18641H = new Thread(null, this.f18666w, "buscandoelems");
        findViewById(R.id.pb_chats).setVisibility(0);
        this.f18641H.start();
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i2 == -1 && intent != null && intent.hasExtra("finalizar") && intent.getExtras().getBoolean("finalizar")) {
            if (!intent.getExtras().getBoolean("finalizar_app")) {
                this.f18649f = false;
            }
            setResult(-1, intent);
            finish();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public void mo21045f() {
        int b = this.f18646c.mo20778b((Context) this);
        if (this.f18646c.f18045dm == 1) {
            this.f18661r = (ListView) findViewById(R.id.left_drawer);
            this.f18646c.mo20771a(this.f18661r);
        } else if (this.f18646c.f18045dm == 0) {
            int i = 0;
            for (int i2 = 0; i2 < this.f18646c.f17971bz.length; i2++) {
                if (!this.f18646c.f17971bz[i2].f18333z) {
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
        for (int i3 = 0; i3 < this.f18646c.f17923bD.length; i3++) {
            if (this.f18646c.f17923bD[i3] > 0) {
                findViewById(this.f18646c.f17923bD[i3]).setOnClickListener(this);
            }
        }
    }

    public void abrir_secc(View view) {
        C5662h a = this.f18646c.mo20761a(view, (Context) this);
        if (a.f18227b) {
            this.f18647d = true;
            Intent intent = new Intent();
            intent.putExtra("finalizar", true);
            intent.putExtra("finalizar_app", a.f18228c);
            setResult(-1, intent);
        }
        if (a.f18229d) {
            startActivityForResult(a.f18226a, 0);
        } else if (a.f18226a != null) {
            if (a.f18227b && this.f18646c.f18045dm != 2) {
                a.f18226a.putExtra("es_root", true);
            }
            this.f18649f = false;
            startActivity(a.f18226a);
        }
        if (this.f18647d && !this.f18658o) {
            finish();
        }
    }

    public void onClick(View view) {
        if (view.getId() == R.id.fila) {
            int childPosition = this.f18638E.getChildPosition(view);
            if (childPosition < this.f18663t.size() && childPosition != -1) {
                m24051a((C6020m) this.f18663t.get(childPosition), childPosition);
            }
        } else if ((this.f18646c.f17986cO == null || this.f18646c.f17986cO.equals("")) && ((this.f18646c.f17985cN == null || this.f18646c.f17985cN.equals("")) && ((this.f18646c.f17988cQ == null || this.f18646c.f17988cQ.equals("")) && (this.f18646c.f17989cR == null || this.f18646c.f17989cR.equals(""))))) {
            abrir_secc(view);
        } else {
            if (this.f18646c.f17986cO != null && !this.f18646c.f17986cO.equals("")) {
                this.f18654k = new RewardedVideo((Context) this, this.f18646c.f17986cO);
            }
            if (this.f18646c.f17985cN != null && !this.f18646c.f17985cN.equals("")) {
                this.f18653j = C2997g.m10716a(this);
            }
            if (this.f18646c.f17988cQ != null && !this.f18646c.f17988cQ.equals("")) {
                this.f18655l = new RewardedVideoAd(this, this.f18646c.f17988cQ);
            }
            if (this.f18646c.f17989cR != null && !this.f18646c.f17989cR.equals("")) {
                this.f18656m = new StartAppAd(this);
            }
            this.f18660q = new ProgressDialog(this);
            this.f18659p = view;
            if (!this.f18646c.mo20774a((Context) this, view, this.f18650g, this.f18660q, this.f18653j, this.f18654k, this.f18655l, this.f18656m)) {
                abrir_secc(view);
            }
        }
    }

    public boolean onSearchRequested() {
        if (this.f18646c.f18080q == 0) {
            return false;
        }
        this.f18647d = true;
        this.f18658o = true;
        return super.onSearchRequested();
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getWindow().setFormat(1);
    }

    /* renamed from: a */
    private void m24051a(C6020m mVar, int i) {
        Intent intent = new Intent(this, t_chat_contra.class);
        intent.putExtra("externo", true);
        intent.putExtra("idchat", mVar.f19874e);
        intent.putExtra("idtema", mVar.f19876g);
        intent.putExtra("fotos_perfil", mVar.f19877h);
        intent.putExtra("fnac", mVar.f19878i);
        intent.putExtra("sexo", mVar.f19879j);
        intent.putExtra("descr", mVar.f19880k);
        intent.putExtra("dist", mVar.f19881l);
        intent.putExtra("privados", mVar.f19886q);
        intent.putExtra("coments", mVar.f19887r);
        intent.putExtra("galeria", mVar.f19888s);
        intent.putExtra("fotos_chat", mVar.f19882m);
        intent.putExtra("c1", mVar.f19871b);
        intent.putExtra("c2", mVar.f19872c);
        intent.putExtra("tit_cab", mVar.f19870a);
        startActivityForResult(intent, 0);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0233  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m24059g() {
        /*
            r30 = this;
            r1 = r30
            java.lang.String r2 = ""
            r3 = 1
            r4 = 0
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00ab, all -> 0x00a7 }
            r5.<init>()     // Catch:{ Exception -> 0x00ab, all -> 0x00a7 }
            java.lang.String r6 = "http://"
            r5.append(r6)     // Catch:{ Exception -> 0x00ab, all -> 0x00a7 }
            java.lang.String r6 = mega.boicot.config.f17839g     // Catch:{ Exception -> 0x00ab, all -> 0x00a7 }
            r5.append(r6)     // Catch:{ Exception -> 0x00ab, all -> 0x00a7 }
            java.lang.String r6 = "/srv/obtenerchats.php?idusu="
            r5.append(r6)     // Catch:{ Exception -> 0x00ab, all -> 0x00a7 }
            int r6 = r1.f18644a     // Catch:{ Exception -> 0x00ab, all -> 0x00a7 }
            r5.append(r6)     // Catch:{ Exception -> 0x00ab, all -> 0x00a7 }
            java.lang.String r6 = "&tipo="
            r5.append(r6)     // Catch:{ Exception -> 0x00ab, all -> 0x00a7 }
            int r6 = r1.f18634A     // Catch:{ Exception -> 0x00ab, all -> 0x00a7 }
            r5.append(r6)     // Catch:{ Exception -> 0x00ab, all -> 0x00a7 }
            java.lang.String r6 = "&idcat="
            r5.append(r6)     // Catch:{ Exception -> 0x00ab, all -> 0x00a7 }
            int r6 = r1.f18668y     // Catch:{ Exception -> 0x00ab, all -> 0x00a7 }
            r5.append(r6)     // Catch:{ Exception -> 0x00ab, all -> 0x00a7 }
            java.lang.String r6 = "&idsubcat="
            r5.append(r6)     // Catch:{ Exception -> 0x00ab, all -> 0x00a7 }
            int r6 = r1.f18669z     // Catch:{ Exception -> 0x00ab, all -> 0x00a7 }
            r5.append(r6)     // Catch:{ Exception -> 0x00ab, all -> 0x00a7 }
            java.lang.String r6 = "&fila="
            r5.append(r6)     // Catch:{ Exception -> 0x00ab, all -> 0x00a7 }
            java.util.ArrayList<mega.boicot.m> r6 = r1.f18663t     // Catch:{ Exception -> 0x00ab, all -> 0x00a7 }
            int r6 = r6.size()     // Catch:{ Exception -> 0x00ab, all -> 0x00a7 }
            r5.append(r6)     // Catch:{ Exception -> 0x00ab, all -> 0x00a7 }
            java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x00ab, all -> 0x00a7 }
            java.net.URL r6 = new java.net.URL     // Catch:{ Exception -> 0x00ab, all -> 0x00a7 }
            r6.<init>(r5)     // Catch:{ Exception -> 0x00ab, all -> 0x00a7 }
            java.net.URLConnection r5 = r6.openConnection()     // Catch:{ Exception -> 0x00ab, all -> 0x00a7 }
            java.net.HttpURLConnection r5 = (java.net.HttpURLConnection) r5     // Catch:{ Exception -> 0x00ab, all -> 0x00a7 }
            r5.setDoInput(r3)     // Catch:{ Exception -> 0x00a5 }
            r4 = 10000(0x2710, float:1.4013E-41)
            r5.setConnectTimeout(r4)     // Catch:{ Exception -> 0x00a5 }
            r5.setReadTimeout(r4)     // Catch:{ Exception -> 0x00a5 }
            java.lang.String r4 = "User-Agent"
            java.lang.String r6 = "Android Vinebre Software"
            r5.setRequestProperty(r4, r6)     // Catch:{ Exception -> 0x00a5 }
            java.io.InputStream r4 = r5.getInputStream()     // Catch:{ Exception -> 0x00a5 }
            java.io.BufferedReader r6 = new java.io.BufferedReader     // Catch:{ Exception -> 0x00a5 }
            java.io.InputStreamReader r7 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x00a5 }
            r7.<init>(r4)     // Catch:{ Exception -> 0x00a5 }
            r6.<init>(r7)     // Catch:{ Exception -> 0x00a5 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00a5 }
            r4.<init>()     // Catch:{ Exception -> 0x00a5 }
        L_0x007f:
            java.lang.String r7 = r6.readLine()     // Catch:{ Exception -> 0x00a5 }
            if (r7 == 0) goto L_0x009a
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00a5 }
            r8.<init>()     // Catch:{ Exception -> 0x00a5 }
            r8.append(r7)     // Catch:{ Exception -> 0x00a5 }
            java.lang.String r7 = "\n"
            r8.append(r7)     // Catch:{ Exception -> 0x00a5 }
            java.lang.String r7 = r8.toString()     // Catch:{ Exception -> 0x00a5 }
            r4.append(r7)     // Catch:{ Exception -> 0x00a5 }
            goto L_0x007f
        L_0x009a:
            java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x00a5 }
            if (r5 == 0) goto L_0x00a3
            r5.disconnect()
        L_0x00a3:
            r2 = r4
            goto L_0x00b6
        L_0x00a5:
            r0 = move-exception
            goto L_0x00ad
        L_0x00a7:
            r0 = move-exception
            r2 = r0
            goto L_0x0231
        L_0x00ab:
            r0 = move-exception
            r5 = r4
        L_0x00ad:
            r4 = r0
            r4.printStackTrace()     // Catch:{ all -> 0x022e }
            if (r5 == 0) goto L_0x00b6
            r5.disconnect()
        L_0x00b6:
            java.lang.String r4 = "ANDROID:KO MOTIVO:INAPROPIADO"
            int r4 = r2.indexOf(r4)
            r5 = -1
            if (r4 == r5) goto L_0x00c1
            r1.f18637D = r3
        L_0x00c1:
            java.lang.String r4 = "ANDROID:OK RESULT:"
            int r4 = r2.indexOf(r4)
            r6 = 0
            r1.f18636C = r6
            if (r4 == r5) goto L_0x0228
            android.content.SharedPreferences r7 = r1.f18662s
            android.content.SharedPreferences$Editor r7 = r7.edit()
            r1.f18636C = r3
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            r1.f18664u = r8
            java.lang.String r8 = "ANDROID:OK RESULT:0"
            int r8 = r2.indexOf(r8)
            if (r8 == r5) goto L_0x00e6
            r1.f18635B = r6
            goto L_0x00f0
        L_0x00e6:
            java.lang.String r8 = "ANDROID:OK RESULT:1"
            int r8 = r2.indexOf(r8)
            if (r8 == r5) goto L_0x00f0
            r1.f18635B = r3
        L_0x00f0:
            java.lang.String r8 = "@y@"
            int r4 = r2.indexOf(r8, r4)
        L_0x00f6:
            if (r4 == r5) goto L_0x0222
            int r4 = r4 + 3
            java.lang.String r8 = ";"
            int r8 = r2.indexOf(r8, r4)
            java.lang.String r4 = r2.substring(r4, r8)
            int r10 = java.lang.Integer.parseInt(r4)
            int r8 = r8 + r3
            java.lang.String r4 = ";"
            int r4 = r2.indexOf(r4, r8)
            java.lang.String r8 = r2.substring(r8, r4)
            int r11 = java.lang.Integer.parseInt(r8)
            int r4 = r4 + r3
            java.lang.String r8 = ";"
            int r8 = r2.indexOf(r8, r4)
            java.lang.String r4 = r2.substring(r4, r8)
            int r12 = java.lang.Integer.parseInt(r4)
            int r8 = r8 + r3
            java.lang.String r4 = ";"
            int r4 = r2.indexOf(r4, r8)
            java.lang.String r8 = r2.substring(r8, r4)
            int r16 = java.lang.Integer.parseInt(r8)
            int r4 = r4 + r3
            java.lang.String r8 = ";"
            int r8 = r2.indexOf(r8, r4)
            java.lang.String r4 = r2.substring(r4, r8)
            int r4 = java.lang.Integer.parseInt(r4)
            int r8 = r8 + r3
            java.lang.String r9 = ";"
            int r8 = r2.indexOf(r9, r8)
            int r8 = r8 + r3
            java.lang.String r9 = ";"
            int r9 = r2.indexOf(r9, r8)
            java.lang.String r8 = r2.substring(r8, r9)
            int r21 = java.lang.Integer.parseInt(r8)
            int r9 = r9 + r3
            java.lang.String r8 = ";"
            int r8 = r2.indexOf(r8, r9)
            java.lang.String r13 = r2.substring(r9, r8)
            int r8 = r8 + r3
            java.lang.String r9 = ";"
            int r9 = r2.indexOf(r9, r8)
            java.lang.String r14 = r2.substring(r8, r9)
            int r9 = r9 + r3
            java.lang.String r8 = ";"
            int r8 = r2.indexOf(r8, r9)
            java.lang.String r15 = r2.substring(r9, r8)
            int r8 = r8 + r3
            java.lang.String r9 = ";"
            int r9 = r2.indexOf(r9, r8)
            java.lang.String r8 = r2.substring(r8, r9)
            int r25 = java.lang.Integer.parseInt(r8)
            int r9 = r9 + r3
            java.lang.String r8 = ";"
            int r8 = r2.indexOf(r8, r9)
            java.lang.String r9 = r2.substring(r9, r8)
            int r9 = java.lang.Integer.parseInt(r9)
            int r8 = r8 + r3
            java.lang.String r5 = ";"
            int r5 = r2.indexOf(r5, r8)
            java.lang.String r8 = r2.substring(r8, r5)
            int r17 = java.lang.Integer.parseInt(r8)
            int r5 = r5 + r3
            java.lang.String r8 = ";"
            int r8 = r2.indexOf(r8, r5)
            java.lang.String r5 = r2.substring(r5, r8)
            int r18 = java.lang.Integer.parseInt(r5)
            int r8 = r8 + r3
            java.lang.String r5 = ";"
            int r5 = r2.indexOf(r5, r8)
            java.lang.String r8 = r2.substring(r8, r5)
            int r19 = java.lang.Integer.parseInt(r8)
            int r5 = r5 + r3
            java.lang.String r8 = ";"
            int r8 = r2.indexOf(r8, r5)
            java.lang.String r5 = r2.substring(r5, r8)
            int r5 = java.lang.Integer.parseInt(r5)
            int r8 = r8 + r3
            java.lang.String r3 = ";"
            int r3 = r2.indexOf(r3, r8)
            java.lang.String r8 = r2.substring(r8, r3)
            int r20 = java.lang.Integer.parseInt(r8)
            r26 = 0
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r6)
            java.util.ArrayList<mega.boicot.m> r6 = r1.f18664u
            mega.boicot.m r1 = new mega.boicot.m
            r29 = r7
            r7 = 1
            if (r4 != r7) goto L_0x01f6
            r22 = r7
            goto L_0x01f8
        L_0x01f6:
            r22 = 0
        L_0x01f8:
            if (r9 != r7) goto L_0x01fd
            r23 = r7
            goto L_0x01ff
        L_0x01fd:
            r23 = 0
        L_0x01ff:
            if (r5 != r7) goto L_0x0204
            r24 = r7
            goto L_0x0206
        L_0x0204:
            r24 = 0
        L_0x0206:
            r27 = 1
            boolean r28 = r8.booleanValue()
            r9 = r1
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            r6.add(r1)
            java.lang.String r1 = "@y@"
            int r4 = r2.indexOf(r1, r3)
            r3 = r7
            r7 = r29
            r1 = r30
            r5 = -1
            r6 = 0
            goto L_0x00f6
        L_0x0222:
            r1 = r7
            r1.commit()
            r1 = r30
        L_0x0228:
            java.lang.Runnable r2 = r1.f18643J
            r1.runOnUiThread(r2)
            return
        L_0x022e:
            r0 = move-exception
            r2 = r0
            r4 = r5
        L_0x0231:
            if (r4 == 0) goto L_0x0236
            r4.disconnect()
        L_0x0236:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: mega.boicot.t_buscchats_lista.m24059g():void");
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ((LinearLayout) findViewById(R.id.ll_princ)).removeViewAt(0);
        mo21045f();
        ((LinearLayout) findViewById(R.id.ll_ad)).removeAllViews();
        if (!(this.f18652i == null || this.f18652i.f17768a == null)) {
            try {
                this.f18652i.f17768a.mo12168c();
            } catch (Exception unused) {
            }
        }
        if (!(this.f18652i == null || this.f18652i.f17769b == null)) {
            try {
                this.f18652i.f17769b.destroy();
            } catch (Exception unused2) {
            }
        }
        this.f18652i = this.f18646c.mo20760a((Context) this, false);
    }

    public void onStop() {
        if (this.f18637D) {
            finish();
        }
        super.onStop();
        if (this.f18647d && !this.f18658o) {
            finish();
        }
    }

    public void onPause() {
        if (this.f18642I != null) {
            try {
                this.f18642I.cancel(true);
            } catch (Exception unused) {
            }
        }
        if (!(this.f18646c.f18013cx == 0 || this.f18652i == null || this.f18652i.f17768a == null)) {
            this.f18652i.f17768a.mo12167b();
        }
        super.onPause();
    }

    public void onResume() {
        super.onResume();
        config.m23860m(this);
        if (this.f18663t != null && this.f18663t.size() > 0) {
            this.f18642I = new C5767b();
            this.f18642I.execute(new String[0]);
        }
        if (this.f18646c.f18013cx != 0 && this.f18652i != null && this.f18652i.f17768a != null) {
            this.f18652i.f17768a.mo12165a();
        }
    }

    public void onDestroy() {
        if (!(this.f18646c.f18013cx == 0 || this.f18652i == null || this.f18652i.f17768a == null)) {
            this.f18652i.f17768a.mo12168c();
        }
        if (!(this.f18646c.f18013cx == 0 || this.f18652i == null || this.f18652i.f17769b == null)) {
            this.f18652i.f17769b.destroy();
        }
        if ((this.f18649f && isFinishing()) || config.f17841i) {
            config.m23861n(this);
        }
        super.onDestroy();
    }

    public void onBackPressed() {
        if (!this.f18649f || this.f18648e || !this.f18646c.f18059ea) {
            super.onBackPressed();
            return;
        }
        this.f18648e = true;
        config.m23859l(this);
    }

    public void adLoaded(String str) {
        this.f18660q.cancel();
        this.f18654k.showAd();
    }

    public void onAdClosed() {
        if (this.f18657n) {
            abrir_secc(this.f18659p);
        }
    }

    public void adError(String str) {
        this.f18660q.cancel();
        abrir_secc(this.f18659p);
    }

    public void videoEnded() {
        this.f18657n = true;
        config.m23867t(this);
    }

    /* renamed from: z_ */
    public void mo9678z_() {
        this.f18660q.cancel();
        this.f18653j.mo12836a();
    }

    /* renamed from: a */
    public void mo9675a(C3165a aVar) {
        this.f18657n = true;
        config.m23867t(this);
    }

    /* renamed from: A_ */
    public void mo9671A_() {
        if (this.f18657n) {
            abrir_secc(this.f18659p);
        }
    }

    /* renamed from: e */
    public void mo9676e() {
        this.f18657n = false;
    }

    /* renamed from: a */
    public void mo9674a(int i) {
        if (!this.f18646c.mo20775a((Context) this, this.f18654k)) {
            this.f18660q.cancel();
            abrir_secc(this.f18659p);
        }
    }

    public void onError(C1514Ad ad, AdError adError) {
        this.f18660q.cancel();
        abrir_secc(this.f18659p);
    }

    public void onAdLoaded(C1514Ad ad) {
        this.f18660q.cancel();
        this.f18655l.show();
    }

    public void onRewardedVideoCompleted() {
        this.f18657n = true;
        config.m23867t(this);
    }

    public void onRewardedVideoClosed() {
        if (this.f18657n) {
            abrir_secc(this.f18659p);
        }
    }

    public void onVideoCompleted() {
        this.f18657n = true;
        config.m23867t(this);
    }

    public void onReceiveAd(C5286Ad ad) {
        this.f18660q.cancel();
        this.f18656m.showAd("REWARDED VIDEO", new AdDisplayListener() {
            public void adClicked(C5286Ad ad) {
            }

            public void adDisplayed(C5286Ad ad) {
            }

            public void adNotDisplayed(C5286Ad ad) {
            }

            public void adHidden(C5286Ad ad) {
                if (t_buscchats_lista.this.f18657n) {
                    t_buscchats_lista.this.abrir_secc(t_buscchats_lista.this.f18659p);
                }
            }
        });
    }

    public void onFailedToReceiveAd(C5286Ad ad) {
        this.f18660q.cancel();
        abrir_secc(this.f18659p);
    }
}
