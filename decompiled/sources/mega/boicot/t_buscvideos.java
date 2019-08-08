package mega.boicot;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.app.SearchManager;
import android.app.SearchManager.OnCancelListener;
import android.app.SearchManager.OnDismissListener;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnShowListener;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.Color;
import android.graphics.Point;
import android.graphics.PorterDuff.Mode;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.GradientDrawable.Orientation;
import android.media.MediaMetadataRetriever;
import android.media.ThumbnailUtils;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore.Images.Media;
import android.support.p028v7.widget.LinearLayoutManager;
import android.support.p028v7.widget.RecyclerView;
import android.support.p028v7.widget.RecyclerView.C0870a;
import android.support.p028v7.widget.RecyclerView.C0881i;
import android.support.p028v7.widget.RecyclerView.C0901v;
import android.util.TypedValue;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Spinner;
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
import com.google.android.exoplayer2.C2793C;
import com.google.android.gms.ads.C2997g;
import com.google.android.gms.ads.reward.C3165a;
import com.google.android.gms.ads.reward.C3166b;
import com.google.android.gms.ads.reward.C3167c;
import com.startapp.android.publish.adsCommon.C5286Ad;
import com.startapp.android.publish.adsCommon.StartAppAd;
import com.startapp.android.publish.adsCommon.VideoListener;
import com.startapp.android.publish.adsCommon.adListeners.AdDisplayListener;
import com.startapp.android.publish.adsCommon.adListeners.AdEventListener;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Locale;
import org.apache.p199a.C6527i;
import org.apache.p199a.p202b.p204b.C6274e;
import org.apache.p199a.p215e.p216a.C6370g;
import org.apache.p199a.p215e.p216a.p217a.C6359b;
import org.apache.p199a.p215e.p216a.p217a.C6360c;
import org.apache.p199a.p215e.p216a.p217a.C6362e;
import org.apache.p199a.p215e.p216a.p217a.C6363f;
import org.apache.p199a.p218f.p220b.C6409h;
import org.apache.p199a.p229k.C6551d;

public class t_buscvideos extends Activity implements OnClickListener, OnAdClosed, OnAdError, OnAdLoaded, OnVideoEnded, RewardedVideoAdListener, C3167c, VideoListener, AdEventListener, C5599a {

    /* renamed from: A */
    int f18791A;

    /* renamed from: B */
    int f18792B;

    /* renamed from: C */
    int f18793C;

    /* renamed from: D */
    Bitmap f18794D;

    /* renamed from: E */
    ArrayList<C5795b> f18795E;

    /* renamed from: F */
    ArrayList<Integer> f18796F;

    /* renamed from: G */
    C5797d f18797G;

    /* renamed from: H */
    C5602c f18798H;

    /* renamed from: I */
    Bundle f18799I;

    /* renamed from: J */
    String f18800J;

    /* renamed from: K */
    TextView f18801K;

    /* renamed from: L */
    TextView f18802L;

    /* renamed from: M */
    Dialog f18803M;

    /* renamed from: N */
    Dialog f18804N;

    /* renamed from: O */
    AlertDialog f18805O;

    /* renamed from: P */
    ListView f18806P;

    /* renamed from: Q */
    SharedPreferences f18807Q;

    /* renamed from: R */
    C3166b f18808R;

    /* renamed from: S */
    RewardedVideo f18809S;

    /* renamed from: T */
    RewardedVideoAd f18810T;

    /* renamed from: U */
    StartAppAd f18811U;

    /* renamed from: V */
    boolean f18812V = false;

    /* renamed from: W */
    boolean f18813W = false;

    /* renamed from: X */
    View f18814X;

    /* renamed from: Y */
    ProgressDialog f18815Y;
    /* access modifiers changed from: private */

    /* renamed from: Z */
    public ArrayList<C6019l> f18816Z = null;

    /* renamed from: a */
    File f18817a;
    /* access modifiers changed from: private */

    /* renamed from: aa */
    public ArrayList<C6019l> f18818aa = null;
    /* access modifiers changed from: private */

    /* renamed from: ab */
    public ArrayList<Integer> f18819ab = null;
    /* access modifiers changed from: private */

    /* renamed from: ac */
    public Runnable f18820ac;
    /* access modifiers changed from: private */

    /* renamed from: ad */
    public boolean f18821ad = false;
    /* access modifiers changed from: private */

    /* renamed from: ae */
    public boolean f18822ae = false;

    /* renamed from: af */
    private RecyclerView f18823af;
    /* access modifiers changed from: private */

    /* renamed from: ag */
    public C0870a f18824ag;

    /* renamed from: ah */
    private C0881i f18825ah;
    /* access modifiers changed from: private */

    /* renamed from: ai */
    public Thread f18826ai;
    /* access modifiers changed from: private */

    /* renamed from: aj */
    public C5796c f18827aj;

    /* renamed from: ak */
    private Runnable f18828ak = new Runnable() {
        public void run() {
            String str;
            try {
                t_buscvideos.this.findViewById(R.id.pb_videos).setVisibility(8);
            } catch (Exception unused) {
            }
            if (t_buscvideos.this.f18818aa != null && t_buscvideos.this.f18818aa.size() > 0) {
                for (int i = 0; i < t_buscvideos.this.f18818aa.size(); i++) {
                    if (t_buscvideos.this.f18819ab.indexOf(Integer.valueOf(((C6019l) t_buscvideos.this.f18818aa.get(i)).f19861l)) == -1) {
                        t_buscvideos.this.f18816Z.add(t_buscvideos.this.f18818aa.get(i));
                        t_buscvideos.this.f18819ab.add(Integer.valueOf(((C6019l) t_buscvideos.this.f18818aa.get(i)).f19861l));
                    }
                }
            }
            t_buscvideos.this.f18824ag.notifyDataSetChanged();
            if (t_buscvideos.this.f18816Z != null && t_buscvideos.this.f18816Z.size() == 0) {
                if (!t_buscvideos.this.f18822ae) {
                    str = t_buscvideos.this.getResources().getString(R.string.error_http);
                } else {
                    str = t_buscvideos.this.getResources().getString(R.string.lista_vacia_videos);
                }
                Builder builder = new Builder(t_buscvideos.this);
                builder.setCancelable(true).setPositiveButton(t_buscvideos.this.getString(R.string.aceptar), null).setMessage(str);
                try {
                    AlertDialog create = builder.create();
                    create.show();
                    ((TextView) create.findViewById(16908299)).setTypeface(Typeface.MONOSPACE);
                } catch (Exception unused2) {
                }
            }
            if (t_buscvideos.this.f18816Z != null && t_buscvideos.this.f18816Z.size() > 0) {
                t_buscvideos.this.f18827aj = new C5796c();
                t_buscvideos.this.f18827aj.execute(new String[0]);
            }
        }
    };

    /* renamed from: b */
    int f18829b;

    /* renamed from: c */
    int f18830c;

    /* renamed from: d */
    int f18831d;

    /* renamed from: e */
    int f18832e;

    /* renamed from: f */
    int f18833f;

    /* renamed from: g */
    int f18834g;

    /* renamed from: h */
    int f18835h;

    /* renamed from: i */
    int f18836i;

    /* renamed from: j */
    String f18837j;

    /* renamed from: k */
    String f18838k;

    /* renamed from: l */
    String f18839l;

    /* renamed from: m */
    String f18840m;

    /* renamed from: n */
    config f18841n;

    /* renamed from: o */
    boolean f18842o = false;

    /* renamed from: p */
    boolean f18843p = false;

    /* renamed from: q */
    boolean f18844q = false;

    /* renamed from: r */
    boolean f18845r;

    /* renamed from: s */
    boolean f18846s;

    /* renamed from: t */
    boolean f18847t;

    /* renamed from: u */
    boolean f18848u;

    /* renamed from: v */
    boolean f18849v;

    /* renamed from: w */
    boolean f18850w;

    /* renamed from: x */
    int[] f18851x = new int[20];

    /* renamed from: y */
    int f18852y;

    /* renamed from: z */
    int f18853z;

    /* renamed from: mega.boicot.t_buscvideos$a */
    public class C5793a extends C0870a<C5794a> {

        /* renamed from: b */
        private ArrayList<C6019l> f18874b;

        /* renamed from: mega.boicot.t_buscvideos$a$a */
        public class C5794a extends C0901v {

            /* renamed from: a */
            public TextView f18875a;

            /* renamed from: b */
            public TextView f18876b;

            /* renamed from: c */
            public TextView f18877c;

            /* renamed from: d */
            public TextView f18878d;

            /* renamed from: e */
            public TextView f18879e;

            /* renamed from: f */
            public TextView f18880f;

            /* renamed from: g */
            public TextView f18881g;

            /* renamed from: h */
            public ImageView f18882h;

            /* renamed from: i */
            public ImageView f18883i;

            /* renamed from: j */
            public ImageView f18884j;

            /* renamed from: k */
            public LinearLayout f18885k;

            /* renamed from: l */
            public LinearLayout f18886l;

            /* renamed from: m */
            public LinearLayout f18887m;

            public C5794a(View view) {
                super(view);
                this.f18885k = (LinearLayout) view.findViewById(R.id.fila);
                this.f18875a = (TextView) view.findViewById(R.id.videoDescr);
                this.f18876b = (TextView) view.findViewById(R.id.videoName);
                this.f18877c = (TextView) view.findViewById(R.id.videoDate);
                if (!t_buscvideos.this.f18841n.f17971bz[t_buscvideos.this.f18830c].f18295am) {
                    this.f18875a.setVisibility(8);
                }
                if (!t_buscvideos.this.f18841n.f17971bz[t_buscvideos.this.f18830c].f18296an) {
                    this.f18876b.setVisibility(8);
                }
                if (!t_buscvideos.this.f18841n.f17971bz[t_buscvideos.this.f18830c].f18241L) {
                    this.f18877c.setVisibility(8);
                }
                this.f18878d = (TextView) view.findViewById(R.id.videoDist);
                this.f18879e = (TextView) view.findViewById(R.id.videoEstado);
                this.f18886l = (LinearLayout) view.findViewById(R.id.ll_videoLikes);
                this.f18887m = (LinearLayout) view.findViewById(R.id.ll_videoVistos);
                this.f18880f = (TextView) view.findViewById(R.id.videoLikes);
                this.f18881g = (TextView) view.findViewById(R.id.videoVistos);
                this.f18882h = (ImageView) view.findViewById(R.id.videoThumb);
                if (t_buscvideos.this.f18841n.f17971bz[t_buscvideos.this.f18830c].f18294al == 1) {
                    this.f18882h.getLayoutParams().height = t_buscvideos.this.f18793C;
                }
                this.f18883i = (ImageView) view.findViewById(R.id.videoPlay);
                this.f18884j = (ImageView) view.findViewById(R.id.videoUser);
            }
        }

        public C5793a(ArrayList<C6019l> arrayList) {
            this.f18874b = arrayList;
        }

        /* renamed from: a */
        public C5794a onCreateViewHolder(ViewGroup viewGroup, int i) {
            Drawable drawable;
            Drawable drawable2;
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(t_buscvideos.this.f18841n.f17971bz[t_buscvideos.this.f18830c].f18294al == 1 ? R.layout.buscvideos_item_2 : R.layout.buscvideos_item, viewGroup, false);
            if (t_buscvideos.this.f18848u) {
                drawable = t_buscvideos.this.getResources().getDrawable(R.drawable.like_black);
                drawable2 = t_buscvideos.this.getResources().getDrawable(R.drawable.eye_black);
                inflate.findViewById(R.id.videoDescrSep).setBackgroundColor(config.f17813a);
                ((TextView) inflate.findViewById(R.id.videoDescr)).setTextColor(config.f17813a);
                ((TextView) inflate.findViewById(R.id.videoName)).setTextColor(config.f17814b);
                ((TextView) inflate.findViewById(R.id.videoDate)).setTextColor(config.f17814b);
                ((TextView) inflate.findViewById(R.id.videoDist)).setTextColor(config.f17814b);
                ((TextView) inflate.findViewById(R.id.videoEstado)).setTextColor(config.f17814b);
                ((TextView) inflate.findViewById(R.id.videoLikes)).setTextColor(config.f17814b);
                ((TextView) inflate.findViewById(R.id.videoVistos)).setTextColor(config.f17814b);
            } else {
                drawable = t_buscvideos.this.getResources().getDrawable(R.drawable.like);
                drawable2 = t_buscvideos.this.getResources().getDrawable(R.drawable.eye);
                inflate.findViewById(R.id.videoDescrSep).setBackgroundColor(config.f17815c);
                ((TextView) inflate.findViewById(R.id.videoDescr)).setTextColor(config.f17815c);
                ((TextView) inflate.findViewById(R.id.videoName)).setTextColor(config.f17824d);
                ((TextView) inflate.findViewById(R.id.videoDate)).setTextColor(config.f17824d);
                ((TextView) inflate.findViewById(R.id.videoDist)).setTextColor(config.f17824d);
                ((TextView) inflate.findViewById(R.id.videoEstado)).setTextColor(config.f17824d);
                ((TextView) inflate.findViewById(R.id.videoLikes)).setTextColor(config.f17824d);
                ((TextView) inflate.findViewById(R.id.videoVistos)).setTextColor(config.f17824d);
            }
            ((ImageView) inflate.findViewById(R.id.iv_videoLikes)).setImageDrawable(drawable);
            ((ImageView) inflate.findViewById(R.id.iv_videoVistos)).setImageDrawable(drawable2);
            if (!t_buscvideos.this.f18841n.f17971bz[t_buscvideos.this.f18830c].f18295am) {
                inflate.findViewById(R.id.videoDescrSep).setVisibility(8);
            }
            if (t_buscvideos.this.f18835h == 0 || !t_buscvideos.this.f18841n.f17971bz[t_buscvideos.this.f18830c].f18296an) {
                inflate.findViewById(R.id.videoUser).setVisibility(8);
            }
            inflate.setOnClickListener(t_buscvideos.this);
            return new C5794a(inflate);
        }

        /* renamed from: a */
        public void onBindViewHolder(C5794a aVar, int i) {
            C6019l lVar = (C6019l) this.f18874b.get(i);
            if (t_buscvideos.this.f18841n.f17971bz[t_buscvideos.this.f18830c].f18295am) {
                if (lVar.f19850a.equals("")) {
                    aVar.f18875a.setVisibility(8);
                } else {
                    aVar.f18875a.setText(lVar.f19850a);
                    aVar.f18875a.setVisibility(0);
                }
            }
            if (lVar.f19862m == t_buscvideos.this.f18829b) {
                aVar.f18876b.setText(t_buscvideos.this.getString(R.string.tu));
            } else {
                aVar.f18876b.setText(lVar.f19851b);
            }
            aVar.f18877c.setText(lVar.f19852c);
            if (t_buscvideos.this.f18852y != 5 || !t_buscvideos.this.f18837j.equals("")) {
                aVar.f18878d.setVisibility(8);
            } else {
                String str = "km.";
                int i2 = lVar.f19866q;
                if (t_buscvideos.this.f18839l.equals("US") || t_buscvideos.this.f18839l.equals("GB") || t_buscvideos.this.f18839l.equals("MM")) {
                    str = "mi.";
                    i2 = (int) (((double) i2) / 1.6d);
                }
                if (i2 == 0) {
                    TextView textView = aVar.f18878d;
                    StringBuilder sb = new StringBuilder();
                    sb.append("<1");
                    sb.append(str);
                    textView.setText(sb.toString());
                } else {
                    TextView textView2 = aVar.f18878d;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i2);
                    sb2.append(str);
                    textView2.setText(sb2.toString());
                }
                aVar.f18878d.setVisibility(0);
            }
            if (t_buscvideos.this.f18852y != 2) {
                aVar.f18886l.setVisibility(8);
            } else {
                TextView textView3 = aVar.f18880f;
                StringBuilder sb3 = new StringBuilder();
                sb3.append(lVar.f19864o);
                sb3.append("");
                textView3.setText(sb3.toString());
                aVar.f18886l.setVisibility(0);
            }
            if (t_buscvideos.this.f18852y != 3) {
                aVar.f18887m.setVisibility(8);
            } else {
                TextView textView4 = aVar.f18881g;
                StringBuilder sb4 = new StringBuilder();
                sb4.append(lVar.f19865p);
                sb4.append("");
                textView4.setText(sb4.toString());
                aVar.f18887m.setVisibility(0);
            }
            if (t_buscvideos.this.f18852y != 7) {
                aVar.f18879e.setVisibility(8);
            } else {
                GradientDrawable gradientDrawable = (GradientDrawable) aVar.f18879e.getBackground();
                String str2 = "";
                if (lVar.f19867r == 0) {
                    aVar.f18879e.setText(t_buscvideos.this.getString(R.string.pendiente));
                    str2 = t_buscvideos.this.f18848u ? "#EF6C00" : "#FF9800";
                } else if (lVar.f19867r == 1) {
                    aVar.f18879e.setText(t_buscvideos.this.getString(R.string.aprobado));
                    str2 = t_buscvideos.this.f18848u ? "#1B5E20" : "#81C784";
                } else if (lVar.f19867r == 2) {
                    aVar.f18879e.setText(t_buscvideos.this.getString(R.string.rechazado));
                    str2 = t_buscvideos.this.f18848u ? "#B71C1C" : "#E53935";
                } else {
                    aVar.f18879e.setText("");
                }
                if (!str2.equals("")) {
                    aVar.f18879e.setTextColor(Color.parseColor(str2));
                    gradientDrawable.setStroke(t_buscvideos.this.f18836i, Color.parseColor(str2));
                }
                aVar.f18879e.setVisibility(0);
            }
            File file = t_buscvideos.this.f18817a;
            StringBuilder sb5 = new StringBuilder();
            sb5.append("fbuscvideo_");
            sb5.append(lVar.f19861l);
            sb5.append(".jpg");
            File file2 = new File(file, sb5.toString());
            if (!file2.exists()) {
                aVar.f18883i.setVisibility(8);
                if (lVar.f19868s) {
                    aVar.f18882h.setImageDrawable(null);
                } else if (t_buscvideos.this.f18841n.f17971bz[t_buscvideos.this.f18830c].f18294al == 0) {
                    aVar.f18882h.setImageDrawable(t_buscvideos.this.getResources().getDrawable(R.drawable.cargando));
                } else {
                    aVar.f18882h.setImageDrawable(t_buscvideos.this.getResources().getDrawable(R.drawable.cargando_2));
                }
            } else {
                aVar.f18883i.setVisibility(0);
                try {
                    aVar.f18882h.setImageBitmap(Media.getBitmap(t_buscvideos.this.getContentResolver(), Uri.fromFile(file2)));
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (t_buscvideos.this.f18835h > 0 && t_buscvideos.this.f18841n.f17971bz[t_buscvideos.this.f18830c].f18296an) {
                int indexOf = t_buscvideos.this.f18796F.indexOf(Integer.valueOf(lVar.f19862m));
                if (indexOf != -1) {
                    C5795b bVar = (C5795b) t_buscvideos.this.f18795E.get(indexOf);
                    if (bVar.f18892d == null) {
                        aVar.f18884j.setImageBitmap(t_buscvideos.this.f18794D);
                    } else {
                        aVar.f18884j.setImageBitmap(bVar.f18892d);
                    }
                } else {
                    aVar.f18884j.setImageBitmap(t_buscvideos.this.f18794D);
                }
            }
            aVar.f18885k.setTag(Integer.valueOf(i));
            if (t_buscvideos.this.f18821ad && i == t_buscvideos.this.f18816Z.size() - 1) {
                if (t_buscvideos.this.f18826ai == null || !t_buscvideos.this.f18826ai.isAlive()) {
                    t_buscvideos.this.findViewById(R.id.pb_videos).setVisibility(0);
                    t_buscvideos.this.f18826ai = new Thread(null, t_buscvideos.this.f18820ac, "buscandoelems");
                    t_buscvideos.this.f18826ai.start();
                }
            }
        }

        public int getItemCount() {
            return this.f18874b.size();
        }
    }

    /* renamed from: mega.boicot.t_buscvideos$b */
    private class C5795b {

        /* renamed from: a */
        String f18889a;

        /* renamed from: b */
        String f18890b;

        /* renamed from: c */
        boolean f18891c;

        /* renamed from: d */
        Bitmap f18892d;

        private C5795b() {
            this.f18891c = true;
        }
    }

    /* renamed from: mega.boicot.t_buscvideos$c */
    private class C5796c extends AsyncTask<String, Void, String> {

        /* renamed from: a */
        int f18894a;

        /* renamed from: b */
        int f18895b;

        /* renamed from: c */
        int f18896c;

        /* renamed from: d */
        int f18897d;

        /* renamed from: e */
        Bitmap f18898e;

        private C5796c() {
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
            boolean z = false;
            int i = 0;
            while (true) {
                if (i >= t_buscvideos.this.f18816Z.size()) {
                    break;
                }
                C6019l lVar = (C6019l) t_buscvideos.this.f18816Z.get(i);
                if (!lVar.f19868s && lVar.f19863n != 0) {
                    this.f18894a = 1;
                    this.f18895b = i;
                    this.f18896c = lVar.f19861l;
                    this.f18897d = lVar.f19862m;
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
                StringBuilder sb = new StringBuilder();
                sb.append("http://imgs1.e-droid.net/srv/imgs/videos_busc/v");
                sb.append(this.f18896c);
                sb.append("_");
                sb.append(this.f18897d);
                sb.append("_th.jpg");
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
                int round = Math.round(TypedValue.applyDimension(1, 200.0f, t_buscvideos.this.getResources().getDisplayMetrics()));
                options.inSampleSize = config.m23826a(options, round, round);
                HttpURLConnection httpURLConnection2 = (HttpURLConnection) url.openConnection();
                httpURLConnection2.setDoInput(true);
                httpURLConnection2.setConnectTimeout(5000);
                httpURLConnection2.setReadTimeout(7000);
                httpURLConnection2.connect();
                InputStream inputStream2 = httpURLConnection2.getInputStream();
                options.inJustDecodeBounds = false;
                this.f18898e = BitmapFactory.decodeStream(inputStream2, null, options);
                inputStream2.close();
                return "ANDROID:OK";
            } catch (Exception unused2) {
                return "ANDROID:KO";
            }
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0051 */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onPostExecute(java.lang.String r4) {
            /*
                r3 = this;
                int r0 = r3.f18894a     // Catch:{ Exception -> 0x0072 }
                r1 = 1
                if (r0 != r1) goto L_0x0015
                mega.boicot.t_buscvideos r0 = mega.boicot.t_buscvideos.this     // Catch:{ Exception -> 0x0072 }
                java.util.ArrayList r0 = r0.f18816Z     // Catch:{ Exception -> 0x0072 }
                int r2 = r3.f18895b     // Catch:{ Exception -> 0x0072 }
                java.lang.Object r0 = r0.get(r2)     // Catch:{ Exception -> 0x0072 }
                mega.boicot.l r0 = (mega.boicot.C6019l) r0     // Catch:{ Exception -> 0x0072 }
                r0.f19868s = r1     // Catch:{ Exception -> 0x0072 }
            L_0x0015:
                java.lang.String r0 = "ANDROID:OK"
                int r4 = r4.indexOf(r0)     // Catch:{ Exception -> 0x0072 }
                r0 = -1
                if (r4 == r0) goto L_0x0051
                int r4 = r3.f18894a     // Catch:{ Exception -> 0x0072 }
                if (r4 != r1) goto L_0x0051
                java.io.File r4 = new java.io.File     // Catch:{ Exception -> 0x0072 }
                mega.boicot.t_buscvideos r0 = mega.boicot.t_buscvideos.this     // Catch:{ Exception -> 0x0072 }
                java.io.File r0 = r0.f18817a     // Catch:{ Exception -> 0x0072 }
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0072 }
                r1.<init>()     // Catch:{ Exception -> 0x0072 }
                java.lang.String r2 = "fbuscvideo_"
                r1.append(r2)     // Catch:{ Exception -> 0x0072 }
                int r2 = r3.f18896c     // Catch:{ Exception -> 0x0072 }
                r1.append(r2)     // Catch:{ Exception -> 0x0072 }
                java.lang.String r2 = ".jpg"
                r1.append(r2)     // Catch:{ Exception -> 0x0072 }
                java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x0072 }
                r4.<init>(r0, r1)     // Catch:{ Exception -> 0x0072 }
                java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x0051 }
                r0.<init>(r4)     // Catch:{ Exception -> 0x0051 }
                android.graphics.Bitmap r4 = r3.f18898e     // Catch:{ Exception -> 0x0051 }
                android.graphics.Bitmap$CompressFormat r1 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ Exception -> 0x0051 }
                r2 = 70
                r4.compress(r1, r2, r0)     // Catch:{ Exception -> 0x0051 }
            L_0x0051:
                mega.boicot.t_buscvideos r4 = mega.boicot.t_buscvideos.this     // Catch:{ Exception -> 0x0072 }
                android.support.v7.widget.RecyclerView$a r4 = r4.f18824ag     // Catch:{ Exception -> 0x0072 }
                r4.notifyDataSetChanged()     // Catch:{ Exception -> 0x0072 }
                mega.boicot.t_buscvideos r4 = mega.boicot.t_buscvideos.this     // Catch:{ Exception -> 0x0072 }
                mega.boicot.t_buscvideos$c r0 = new mega.boicot.t_buscvideos$c     // Catch:{ Exception -> 0x0072 }
                mega.boicot.t_buscvideos r1 = mega.boicot.t_buscvideos.this     // Catch:{ Exception -> 0x0072 }
                r0.<init>()     // Catch:{ Exception -> 0x0072 }
                r4.f18827aj = r0     // Catch:{ Exception -> 0x0072 }
                mega.boicot.t_buscvideos r4 = mega.boicot.t_buscvideos.this     // Catch:{ Exception -> 0x0072 }
                mega.boicot.t_buscvideos$c r4 = r4.f18827aj     // Catch:{ Exception -> 0x0072 }
                r0 = 0
                java.lang.String[] r0 = new java.lang.String[r0]     // Catch:{ Exception -> 0x0072 }
                r4.execute(r0)     // Catch:{ Exception -> 0x0072 }
            L_0x0072:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: mega.boicot.t_buscvideos.C5796c.onPostExecute(java.lang.String):void");
        }
    }

    /* renamed from: mega.boicot.t_buscvideos$d */
    private class C5797d extends AsyncTask<String, Void, String> {

        /* renamed from: a */
        String f18900a;

        /* renamed from: b */
        String f18901b;

        /* renamed from: c */
        Bitmap f18902c;

        /* renamed from: d */
        int f18903d;

        private C5797d() {
            this.f18903d = -1;
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
            int i = 0;
            while (i <= t_buscvideos.this.f18795E.size() && t_buscvideos.this.f18795E != null && i < t_buscvideos.this.f18795E.size()) {
                if (((C5795b) t_buscvideos.this.f18795E.get(i)).f18891c && !((C5795b) t_buscvideos.this.f18795E.get(i)).f18890b.equals("0")) {
                    String str = ((C5795b) t_buscvideos.this.f18795E.get(i)).f18890b;
                    SharedPreferences sharedPreferences = t_buscvideos.this.f18807Q;
                    StringBuilder sb = new StringBuilder();
                    sb.append("fperfil_");
                    sb.append(((C5795b) t_buscvideos.this.f18795E.get(i)).f18889a);
                    if (!str.equals(sharedPreferences.getString(sb.toString(), "0"))) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(((C5795b) t_buscvideos.this.f18795E.get(i)).f18889a);
                        sb2.append("");
                        this.f18900a = sb2.toString();
                        this.f18901b = ((C5795b) t_buscvideos.this.f18795E.get(i)).f18890b;
                        ((C5795b) t_buscvideos.this.f18795E.get(i)).f18891c = false;
                        this.f18903d = i;
                        return;
                    }
                }
                i++;
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public String doInBackground(String... strArr) {
            if (this.f18900a == null) {
                return "-1";
            }
            try {
                StringBuilder sb = new StringBuilder();
                sb.append("http://imgs1.e-droid.net/srv/imgs/usus/");
                sb.append(this.f18900a);
                sb.append("_1_p.jpg?v=");
                sb.append(this.f18901b);
                try {
                    HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(sb.toString()).openConnection();
                    httpURLConnection.setDoInput(true);
                    httpURLConnection.setConnectTimeout(10000);
                    httpURLConnection.setReadTimeout(20000);
                    httpURLConnection.connect();
                    InputStream inputStream = httpURLConnection.getInputStream();
                    this.f18902c = BitmapFactory.decodeStream(inputStream);
                    inputStream.close();
                    httpURLConnection.disconnect();
                    File file = t_buscvideos.this.f18817a;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("fperfil_");
                    sb2.append(this.f18900a);
                    sb2.append(".jpg");
                    File file2 = new File(file, sb2.toString());
                    try {
                        this.f18902c.compress(CompressFormat.JPEG, 70, new FileOutputStream(file2));
                        ((C5795b) t_buscvideos.this.f18795E.get(this.f18903d)).f18892d = config.m23846b(Media.getBitmap(t_buscvideos.this.getContentResolver(), Uri.fromFile(file2)), 1);
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
            if (this.f18900a == null || str.equals("-1")) {
                if (!str.equals("-1")) {
                    t_buscvideos.this.f18824ag.notifyDataSetChanged();
                }
                return;
            }
            if (str == "1") {
                Editor edit = t_buscvideos.this.f18807Q.edit();
                StringBuilder sb = new StringBuilder();
                sb.append("fperfil_");
                sb.append(this.f18900a);
                edit.putString(sb.toString(), this.f18901b);
                edit.commit();
            }
            t_buscvideos.this.f18824ag.notifyDataSetChanged();
            new C5797d().execute(new String[0]);
        }
    }

    /* renamed from: mega.boicot.t_buscvideos$e */
    private class C5798e extends AsyncTask<String, Void, String> {

        /* renamed from: a */
        int f18905a;

        /* renamed from: b */
        int f18906b;

        /* renamed from: c */
        String f18907c;

        /* renamed from: d */
        String f18908d;

        /* renamed from: e */
        String f18909e;

        /* renamed from: f */
        String f18910f;

        public C5798e(int i, String str, String str2, int i2, String str3, String str4) {
            this.f18905a = i;
            this.f18907c = str;
            this.f18908d = str2;
            this.f18906b = i2;
            this.f18909e = str3;
            this.f18910f = str4;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public String doInBackground(String... strArr) {
            Bitmap bitmap;
            String str;
            C6409h hVar = new C6409h();
            StringBuilder sb = new StringBuilder();
            sb.append("http://");
            sb.append(config.f17839g);
            sb.append("/srv/guardar_videobusc.php");
            C6274e eVar = new C6274e(sb.toString());
            C6370g gVar = new C6370g();
            try {
                bitmap = Media.getBitmap(t_buscvideos.this.getContentResolver(), Uri.fromFile(t_buscvideos.this.f18841n.mo20757a((Context) t_buscvideos.this, this.f18905a)));
            } catch (IOException e) {
                e.printStackTrace();
                bitmap = null;
            }
            if (bitmap == null) {
                return "KO";
            }
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            bitmap.compress(CompressFormat.JPEG, 100, byteArrayOutputStream);
            gVar.mo22648a("thumb", (C6360c) new C6359b(byteArrayOutputStream.toByteArray(), "temporal.jpg"));
            String str2 = "idusu";
            try {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(t_buscvideos.this.f18829b);
                sb2.append("");
                gVar.mo22648a(str2, (C6360c) new C6363f(sb2.toString()));
                gVar.mo22648a("c", (C6360c) new C6363f(t_buscvideos.this.f18838k));
                gVar.mo22648a("idvideo", (C6360c) new C6363f(this.f18907c));
                gVar.mo22648a("formato", (C6360c) new C6363f(this.f18908d));
                StringBuilder sb3 = new StringBuilder();
                sb3.append(this.f18906b);
                sb3.append("");
                gVar.mo22648a("idcat", (C6360c) new C6363f(sb3.toString()));
                gVar.mo22648a("descr", (C6360c) new C6363f(URLEncoder.encode(this.f18909e, C2793C.UTF8_NAME)));
                if (this.f18910f != null) {
                    gVar.mo22648a("loc", (C6360c) new C6363f(this.f18910f));
                }
            } catch (UnsupportedEncodingException e2) {
                e2.printStackTrace();
            }
            eVar.mo22444a(gVar);
            eVar.mo22909b("User-Agent", "Android Vinebre Software");
            try {
                C6527i b = hVar.mo22459a(eVar).mo22939b();
                str = C6551d.m25961d(b);
                if (b != null) {
                    try {
                        b.mo22474h();
                    } catch (IOException e3) {
                        try {
                            e3.printStackTrace();
                        } catch (Exception e4) {
                            e = e4;
                        }
                    }
                }
            } catch (Exception e5) {
                e = e5;
                str = "";
                e.printStackTrace();
                hVar.mo22458a().mo22481b();
                return str;
            }
            hVar.mo22458a().mo22481b();
            return str;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void onPostExecute(String str) {
            try {
                t_buscvideos.this.f18805O.cancel();
            } catch (Exception unused) {
            }
            boolean z = str.indexOf("ANDROID:OK ID:") != -1;
            int i = R.string.error_http;
            if (z) {
                i = t_buscvideos.this.f18841n.f17971bz[t_buscvideos.this.f18830c].f18291ai ? R.string.req_aprob_video : R.string.video_publicado;
                if ((t_buscvideos.this.f18853z == 0 || t_buscvideos.this.f18853z == this.f18906b) && (!t_buscvideos.this.f18841n.f17971bz[t_buscvideos.this.f18830c].f18291ai || t_buscvideos.this.f18852y == 7)) {
                    t_buscvideos.this.mo21103g();
                }
            }
            final AlertDialog create = new Builder(t_buscvideos.this).setCancelable(false).setPositiveButton(t_buscvideos.this.getString(R.string.aceptar), null).setMessage(i).create();
            if (!t_buscvideos.this.f18800J.equals("")) {
                create.setOnShowListener(new OnShowListener() {
                    public void onShow(DialogInterface dialogInterface) {
                        Button button = create.getButton(-1);
                        StringBuilder sb = new StringBuilder();
                        sb.append("#");
                        sb.append(t_buscvideos.this.f18800J);
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

    /* renamed from: mega.boicot.t_buscvideos$f */
    private class C5800f extends AsyncTask<String, Void, String> {

        /* renamed from: a */
        String f18914a;

        /* renamed from: b */
        String f18915b;

        /* renamed from: c */
        String f18916c;

        /* renamed from: d */
        int f18917d;

        /* renamed from: e */
        int f18918e;

        public C5800f(int i, String str, int i2, String str2, String str3) {
            this.f18914a = str;
            this.f18917d = i;
            this.f18918e = i2;
            this.f18915b = str2;
            this.f18916c = str3;
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
            Builder builder = new Builder(t_buscvideos.this);
            t_buscvideos.this.f18805O = builder.setCancelable(false).setMessage(R.string.subiendo).create();
            t_buscvideos.this.f18805O.show();
            try {
                ((TextView) t_buscvideos.this.f18805O.findViewById(16908299)).setTypeface(Typeface.MONOSPACE);
            } catch (Exception unused) {
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public String doInBackground(String... strArr) {
            C6409h hVar = new C6409h();
            C6274e eVar = new C6274e("http://video-upload.e-droid.net/upload.php?busc=1");
            C6362e eVar2 = new C6362e(new File(this.f18914a));
            C6370g gVar = new C6370g();
            gVar.mo22648a("videoFile", (C6360c) eVar2);
            String str = "idusu";
            try {
                StringBuilder sb = new StringBuilder();
                sb.append(t_buscvideos.this.f18829b);
                sb.append("");
                gVar.mo22648a(str, (C6360c) new C6363f(sb.toString()));
                gVar.mo22648a("idapp", (C6360c) new C6363f("718963"));
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
            eVar.mo22444a(gVar);
            eVar.mo22909b("User-Agent", "Android Vinebre Software");
            String str2 = "";
            try {
                C6527i b = hVar.mo22459a(eVar).mo22939b();
                if (b != null) {
                    str2 = C6551d.m25961d(b);
                }
                if (b != null) {
                    try {
                        b.mo22474h();
                    } catch (IOException e2) {
                        e2.printStackTrace();
                    }
                }
            } catch (Exception e3) {
                e3.printStackTrace();
            }
            hVar.mo22458a().mo22481b();
            return str2;
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x00b6 A[SYNTHETIC, Splitter:B:24:0x00b6] */
        /* JADX WARNING: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onPostExecute(java.lang.String r14) {
            /*
                r13 = this;
                java.lang.String r0 = "ANDROID:OK:-"
                int r0 = r14.indexOf(r0)
                r1 = -1
                r2 = 1
                r3 = 0
                if (r0 == r1) goto L_0x00b3
                int r0 = r0 + 12
                java.lang.String r4 = "-"
                int r5 = r0 + 1
                int r4 = r14.indexOf(r4, r5)
                java.lang.String r8 = r14.substring(r0, r4)
                int r4 = r4 + r2
                java.lang.String r0 = "-"
                int r0 = r14.indexOf(r0, r4)
                java.lang.String r9 = r14.substring(r4, r0)
                java.lang.String r14 = ""
                java.lang.String r0 = "1"
                boolean r0 = r9.equals(r0)
                if (r0 == 0) goto L_0x0031
                java.lang.String r14 = "mp4"
                goto L_0x0046
            L_0x0031:
                java.lang.String r0 = "2"
                boolean r0 = r9.equals(r0)
                if (r0 == 0) goto L_0x003c
                java.lang.String r14 = "3gp"
                goto L_0x0046
            L_0x003c:
                java.lang.String r0 = "3"
                boolean r0 = r9.equals(r0)
                if (r0 == 0) goto L_0x0046
                java.lang.String r14 = "webm"
            L_0x0046:
                boolean r0 = r14.isEmpty()
                if (r0 != 0) goto L_0x00b3
                java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch:{ Exception -> 0x0099 }
                java.lang.String r4 = r13.f18914a     // Catch:{ Exception -> 0x0099 }
                r0.<init>(r4)     // Catch:{ Exception -> 0x0099 }
                mega.boicot.t_buscvideos r4 = mega.boicot.t_buscvideos.this     // Catch:{ Exception -> 0x0099 }
                mega.boicot.config r4 = r4.f18841n     // Catch:{ Exception -> 0x0099 }
                mega.boicot.t_buscvideos r5 = mega.boicot.t_buscvideos.this     // Catch:{ Exception -> 0x0099 }
                java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0099 }
                r6.<init>()     // Catch:{ Exception -> 0x0099 }
                java.lang.String r7 = "vb"
                r6.append(r7)     // Catch:{ Exception -> 0x0099 }
                r6.append(r8)     // Catch:{ Exception -> 0x0099 }
                java.lang.String r7 = "."
                r6.append(r7)     // Catch:{ Exception -> 0x0099 }
                r6.append(r14)     // Catch:{ Exception -> 0x0099 }
                java.lang.String r14 = r6.toString()     // Catch:{ Exception -> 0x0099 }
                java.io.File r14 = r4.mo20759a(r5, r14)     // Catch:{ Exception -> 0x0099 }
                java.lang.String r14 = r14.getAbsolutePath()     // Catch:{ Exception -> 0x0099 }
                java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x0099 }
                r4.<init>(r14)     // Catch:{ Exception -> 0x0099 }
                r5 = 1024(0x400, float:1.435E-42)
                byte[] r5 = new byte[r5]     // Catch:{ Exception -> 0x0099 }
            L_0x0083:
                int r6 = r0.read(r5)     // Catch:{ Exception -> 0x0099 }
                if (r6 == r1) goto L_0x008d
                r4.write(r5, r3, r6)     // Catch:{ Exception -> 0x0099 }
                goto L_0x0083
            L_0x008d:
                r0.close()     // Catch:{ Exception -> 0x0099 }
                r4.flush()     // Catch:{ Exception -> 0x0099 }
                r4.close()     // Catch:{ Exception -> 0x0099 }
                r13.f18914a = r14     // Catch:{ Exception -> 0x0099 }
                goto L_0x009d
            L_0x0099:
                r14 = move-exception
                r14.printStackTrace()
            L_0x009d:
                mega.boicot.t_buscvideos$e r14 = new mega.boicot.t_buscvideos$e
                mega.boicot.t_buscvideos r6 = mega.boicot.t_buscvideos.this
                int r7 = r13.f18917d
                int r10 = r13.f18918e
                java.lang.String r11 = r13.f18915b
                java.lang.String r12 = r13.f18916c
                r5 = r14
                r5.<init>(r7, r8, r9, r10, r11, r12)
                java.lang.String[] r0 = new java.lang.String[r3]
                r14.execute(r0)
                goto L_0x00b4
            L_0x00b3:
                r2 = r3
            L_0x00b4:
                if (r2 != 0) goto L_0x00bd
                mega.boicot.t_buscvideos r14 = mega.boicot.t_buscvideos.this     // Catch:{ Exception -> 0x00bd }
                android.app.AlertDialog r14 = r14.f18805O     // Catch:{ Exception -> 0x00bd }
                r14.dismiss()     // Catch:{ Exception -> 0x00bd }
            L_0x00bd:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: mega.boicot.t_buscvideos.C5800f.onPostExecute(java.lang.String):void");
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
        this.f18841n = (config) getApplicationContext();
        if (this.f18841n.f17881aN == null) {
            this.f18841n.mo20780b();
        }
        this.f18799I = getIntent().getExtras();
        if (bundle == null) {
            this.f18845r = this.f18799I != null && this.f18799I.containsKey("es_root") && this.f18799I.getBoolean("es_root", false);
        } else {
            this.f18845r = bundle.containsKey("es_root") && bundle.getBoolean("es_root", false);
        }
        this.f18830c = this.f18841n.f18075l;
        this.f18831d = this.f18841n.f17971bz[this.f18830c].f18330w;
        String str = this.f18841n.f17971bz[this.f18830c].f18314g;
        String str2 = this.f18841n.f17971bz[this.f18830c].f18315h;
        StringBuilder sb = new StringBuilder();
        sb.append("#");
        sb.append(str);
        this.f18848u = config.m23844a(sb.toString());
        this.f18800J = config.m23831a(str, this.f18841n.f17890aW);
        if (VERSION.SDK_INT > 12 && !this.f18848u) {
            setTheme(R.style.holonolight);
        }
        super.onCreate(bundle);
        this.f18807Q = getSharedPreferences("sh", 0);
        this.f18829b = this.f18807Q.getInt("idusu", 0);
        this.f18838k = this.f18807Q.getString("cod", "");
        this.f18836i = config.m23845b((Context) this, 1);
        this.f18837j = this.f18799I.getString("idusuv", "");
        SharedPreferences sharedPreferences = this.f18807Q;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("ftipo_v_");
        sb2.append(this.f18841n.f17971bz[this.f18830c].f18330w);
        this.f18852y = sharedPreferences.getInt(sb2.toString(), this.f18841n.f17971bz[this.f18830c].f18292aj);
        SharedPreferences sharedPreferences2 = this.f18807Q;
        StringBuilder sb3 = new StringBuilder();
        sb3.append("fcat_v_");
        sb3.append(this.f18841n.f17971bz[this.f18830c].f18330w);
        this.f18853z = sharedPreferences2.getInt(sb3.toString(), 0);
        this.f18791A = 0;
        int i = 0;
        while (true) {
            if (i >= this.f18841n.f17971bz[this.f18830c].f18284ab.length) {
                break;
            } else if (this.f18853z == this.f18841n.f17971bz[this.f18830c].f18284ab[i].f18191a) {
                this.f18791A = i + 1;
                break;
            } else {
                i++;
            }
        }
        this.f18839l = Locale.getDefault().getCountry();
        this.f18832e = this.f18841n.f17971bz[this.f18830c].f18306ax;
        this.f18833f = this.f18841n.f17971bz[this.f18830c].f18307ay;
        this.f18834g = this.f18841n.f17971bz[this.f18830c].f18308az;
        this.f18835h = this.f18841n.f17971bz[this.f18830c].f18305aw;
        if (this.f18807Q.getString("nick", "").equals("") || (this.f18841n.f18062ed == 3 && !this.f18807Q.getBoolean("email_confirmado", false))) {
            Intent intent = new Intent(this, chat_perfil.class);
            intent.putExtra("idsecc", this.f18830c);
            intent.putExtra("desde_buscvideos", true);
            if (this.f18845r) {
                intent.putExtra("es_root", this.f18845r);
            }
            this.f18845r = false;
            this.f18843p = true;
            startActivityForResult(intent, 0);
        } else if ((this.f18835h == 2 && !this.f18841n.mo20757a((Context) this, 1).exists()) || ((this.f18832e == 2 && (this.f18807Q.getInt("fnac_d", 0) == 0 || this.f18807Q.getInt("fnac_m", 0) == 0 || this.f18807Q.getInt("fnac_a", 0) == 0)) || ((this.f18833f == 2 && this.f18807Q.getInt("sexo", 0) == 0) || (this.f18834g == 2 && this.f18807Q.getString("descr", "").equals(""))))) {
            Intent intent2 = new Intent(this, preperfil.class);
            intent2.putExtra("idsecc", this.f18830c);
            intent2.putExtra("desde_buscvideos", true);
            if (this.f18845r) {
                intent2.putExtra("es_root", this.f18845r);
            }
            this.f18845r = false;
            this.f18843p = true;
            startActivityForResult(intent2, 0);
        }
        setContentView(R.layout.t_buscvideos);
        mo21102f();
        if (this.f18841n.f18080q > 0) {
            SearchManager searchManager = (SearchManager) getSystemService("search");
            searchManager.setOnCancelListener(new OnCancelListener() {
                public void onCancel() {
                    t_buscvideos.this.f18842o = false;
                    t_buscvideos.this.setResult(0);
                }
            });
            searchManager.setOnDismissListener(new OnDismissListener() {
                public void onDismiss() {
                    t_buscvideos.this.f18813W = false;
                }
            });
        }
        this.f18841n.mo20770a((Context) this, this.f18799I != null && this.f18799I.containsKey("ad_entrar"), this.f18799I != null && this.f18799I.containsKey("fb_entrar"));
        this.f18798H = this.f18841n.mo20760a((Context) this, false);
        this.f18841n.mo20767a((Context) this, this.f18841n.f18075l, this.f18800J, bundle);
        if (!str.equals("")) {
            Orientation orientation = Orientation.TOP_BOTTOM;
            StringBuilder sb4 = new StringBuilder();
            sb4.append("#");
            sb4.append(str);
            StringBuilder sb5 = new StringBuilder();
            sb5.append("#");
            sb5.append(str2);
            findViewById(R.id.ll_princ).setBackgroundDrawable(new GradientDrawable(orientation, new int[]{Color.parseColor(sb4.toString()), Color.parseColor(sb5.toString())}));
        }
        this.f18807Q = getSharedPreferences("sh", 0);
        this.f18829b = this.f18807Q.getInt("idusu", 0);
        this.f18817a = new File(Environment.getExternalStorageDirectory(), getPackageName());
        if (this.f18841n.f17971bz[this.f18830c].f18294al == 1) {
            Display defaultDisplay = ((WindowManager) getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getSize(point);
            this.f18793C = ((point.x - (config.m23845b((Context) this, 16) * 2)) * 9) / 16;
        }
        if (this.f18848u) {
            this.f18794D = config.m23846b(BitmapFactory.decodeResource(getResources(), R.drawable.sinfoto), 1);
        } else {
            this.f18794D = config.m23846b(BitmapFactory.decodeResource(getResources(), R.drawable.sinfoto_light), 1);
        }
        this.f18801K = (TextView) findViewById(R.id.tv_ftipo);
        this.f18802L = (TextView) findViewById(R.id.tv_fcat);
        if (!this.f18837j.equals("")) {
            findViewById(R.id.iv_cerrar).setOnClickListener(new OnClickListener() {
                public void onClick(View view) {
                    t_buscvideos.this.f18842o = true;
                    t_buscvideos.this.finish();
                }
            });
            ((TextView) findViewById(R.id.tv_nombreusu)).setText(this.f18799I.getString("nombreusu"));
            findViewById(R.id.btncrearvid).setVisibility(8);
            findViewById(R.id.barratop).setVisibility(8);
            findViewById(R.id.barratop_usu).setVisibility(0);
        } else {
            findViewById(R.id.btnperfil).setOnClickListener(this);
            Drawable drawable = getResources().getDrawable(R.drawable.mas_btn_g);
            StringBuilder sb6 = new StringBuilder();
            sb6.append("#");
            sb6.append(this.f18841n.f17890aW);
            drawable.setColorFilter(Color.parseColor(sb6.toString()), Mode.MULTIPLY);
            ((ImageView) findViewById(R.id.btncrearvid)).setImageDrawable(drawable);
        }
        C5663i iVar = this.f18841n.f17971bz[this.f18830c];
        this.f18849v = true;
        this.f18850w = false;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= iVar.f18284ab.length) {
                break;
            }
            if (!iVar.f18284ab[i2].f18193c || this.f18841n.f18076m) {
                this.f18849v = false;
                i3++;
                this.f18792B = iVar.f18284ab[i2].f18191a;
            }
            if (i3 > 1) {
                this.f18850w = true;
                break;
            }
            i2++;
        }
        if (!this.f18849v) {
            findViewById(R.id.btncrearvid).setOnClickListener(this);
        }
        int i4 = !this.f18849v ? 1 : 0;
        if (iVar.f18290ah) {
            i4++;
        }
        if (iVar.f18288af) {
            i4++;
        }
        if (iVar.f18287ae) {
            i4++;
        }
        if (iVar.f18286ad) {
            i4++;
        }
        if (iVar.f18285ac) {
            i4++;
        }
        if (iVar.f18289ag) {
            i4++;
        }
        this.f18846s = i4 > 1;
        this.f18847t = iVar.f18284ab.length > 1;
        mo21106j();
        this.f18803M = mo21104h();
        this.f18804N = mo21105i();
        this.f18816Z = new ArrayList<>();
        this.f18819ab = new ArrayList<>();
        this.f18795E = new ArrayList<>();
        this.f18796F = new ArrayList<>();
        this.f18823af = (RecyclerView) findViewById(R.id.my_recycler_view);
        this.f18823af.setHasFixedSize(true);
        this.f18825ah = new LinearLayoutManager(this);
        this.f18823af.setLayoutManager(this.f18825ah);
        this.f18824ag = new C5793a(this.f18816Z);
        this.f18823af.setAdapter(this.f18824ag);
        this.f18820ac = new Runnable() {
            public void run() {
                t_buscvideos.this.m24105k();
            }
        };
        this.f18826ai = new Thread(null, this.f18820ac, "buscandoelems");
        findViewById(R.id.pb_videos).setVisibility(0);
        this.f18826ai.start();
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        boolean z;
        if (i2 == -1) {
            if (i == 3 || i == 4) {
                String a = config.m23830a(intent.getData(), getApplicationContext());
                if (a != null && !a.equals("")) {
                    if (mo21100a(a)) {
                        this.f18840m = a;
                        if (this.f18841n.f17971bz[this.f18830c].f18295am || this.f18850w) {
                            this.f18804N.show();
                        } else {
                            m24093a(this.f18792B, "");
                        }
                    } else {
                        return;
                    }
                }
            } else if (intent == null || !intent.hasExtra("finalizar")) {
                if (intent != null && intent.hasExtra("elim_video")) {
                    int indexOf = this.f18819ab.indexOf(Integer.valueOf(Integer.parseInt(intent.getExtras().getString("elim_video"))));
                    if (indexOf != -1) {
                        this.f18819ab.remove(indexOf);
                        this.f18816Z.remove(indexOf);
                        File file = this.f18817a;
                        StringBuilder sb = new StringBuilder();
                        sb.append("fbuscvideo_");
                        sb.append(intent.getExtras().getString("elim_video"));
                        sb.append(".jpg");
                        File file2 = new File(file, sb.toString());
                        if (file2.exists()) {
                            file2.delete();
                        }
                        this.f18824ag.notifyDataSetChanged();
                    }
                } else if (intent != null && intent.hasExtra("nlikesv")) {
                    int indexOf2 = this.f18819ab.indexOf(Integer.valueOf(Integer.parseInt(intent.getExtras().getString("idv"))));
                    if (indexOf2 != -1) {
                        ((C6019l) this.f18816Z.get(indexOf2)).f19864o = Integer.parseInt(intent.getExtras().getString("nlikesv"));
                        ((C6019l) this.f18816Z.get(indexOf2)).f19869t = intent.getExtras().getString("liked").equals("1");
                        this.f18824ag.notifyDataSetChanged();
                    }
                    String stringExtra = intent.getStringExtra("idusu_abrir");
                    if (!stringExtra.equals("")) {
                        Intent intent2 = new Intent(this, t_buscvideos.class);
                        intent2.putExtra("idusuv", stringExtra);
                        intent2.putExtra("nombreusu", intent.getStringExtra("nombreusu_abrir"));
                        startActivityForResult(intent2, 0);
                    }
                }
            } else if (intent.getExtras().getBoolean("finalizar")) {
                z = true;
                if (!intent.getExtras().getBoolean("finalizar_app")) {
                    this.f18845r = false;
                }
                setResult(-1, intent);
                finish();
                if (!z && this.f18843p) {
                    finish();
                }
            }
        }
        z = false;
        finish();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public void mo21102f() {
        int b = this.f18841n.mo20778b((Context) this);
        if (this.f18841n.f18045dm == 1) {
            this.f18806P = (ListView) findViewById(R.id.left_drawer);
            this.f18841n.mo20771a(this.f18806P);
        } else if (this.f18841n.f18045dm == 0) {
            int i = 0;
            for (int i2 = 0; i2 < this.f18841n.f17971bz.length; i2++) {
                if (!this.f18841n.f17971bz[i2].f18333z) {
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
        for (int i3 = 0; i3 < this.f18841n.f17923bD.length; i3++) {
            if (this.f18841n.f17923bD[i3] > 0) {
                findViewById(this.f18841n.f17923bD[i3]).setOnClickListener(this);
            }
        }
    }

    public void onClick(View view) {
        String str;
        if (view.getId() == R.id.ll_filtros) {
            this.f18803M.show();
        } else if (view.getId() == R.id.btnperfil) {
            Intent intent = new Intent(this, preperfil.class);
            intent.putExtra("idsecc", this.f18830c);
            intent.putExtra("nocompletar", true);
            intent.putExtra("desde_buscvideos", true);
            startActivityForResult(intent, 0);
        } else if (view.getId() == R.id.btncrearvid) {
            final AlertDialog create = new Builder(this).setCancelable(true).setPositiveButton(getString(R.string.tomardecamara), new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialogInterface, int i) {
                    Intent intent = new Intent("android.media.action.VIDEO_CAPTURE");
                    intent.putExtra("android.intent.extra.videoQuality", 0);
                    intent.putExtra("android.intent.extra.durationLimit", 20);
                    intent.putExtra("android.intent.extra.sizeLimit", 55574528);
                    intent.putExtra("android.intent.extra.videoQuality", 0);
                    intent.putExtra("android.intent.extra.durationLimit", 20);
                    intent.putExtra("android.intent.extra.sizeLimit", 55574528);
                    try {
                        t_buscvideos.this.startActivityForResult(intent, 3);
                    } catch (ActivityNotFoundException unused) {
                    }
                }
            }).setNegativeButton(getString(R.string.selvideo), new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialogInterface, int i) {
                    Intent intent = new Intent("android.intent.action.PICK");
                    intent.setType("video/*");
                    t_buscvideos.this.startActivityForResult(intent, 4);
                }
            }).setMessage(R.string.enviarvideo).create();
            if (!this.f18800J.equals("")) {
                create.setOnShowListener(new OnShowListener() {
                    public void onShow(DialogInterface dialogInterface) {
                        Button button = create.getButton(-1);
                        StringBuilder sb = new StringBuilder();
                        sb.append("#");
                        sb.append(t_buscvideos.this.f18800J);
                        button.setTextColor(Color.parseColor(sb.toString()));
                        Button button2 = create.getButton(-2);
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("#");
                        sb2.append(t_buscvideos.this.f18800J);
                        button2.setTextColor(Color.parseColor(sb2.toString()));
                    }
                });
            }
            create.show();
            try {
                ((TextView) create.findViewById(16908299)).setTypeface(Typeface.MONOSPACE);
            } catch (Exception unused) {
            }
        } else if (view.getId() == R.id.fila) {
            int childPosition = this.f18823af.getChildPosition(view);
            if (childPosition < this.f18816Z.size() && childPosition != -1) {
                C6019l lVar = (C6019l) this.f18816Z.get(childPosition);
                Intent intent2 = new Intent(this, t_buscvideo.class);
                if (lVar.f19853d.equals("1")) {
                    str = "mp4";
                } else if (lVar.f19853d.equals("2")) {
                    str = "3gp";
                } else if (lVar.f19853d.equals("3")) {
                    str = "webm";
                } else {
                    return;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("http://video.e-droid.net/files_busc/v");
                sb.append(lVar.f19861l);
                sb.append("_");
                sb.append(lVar.f19862m);
                sb.append(".");
                sb.append(str);
                intent2.putExtra("url", sb.toString());
                intent2.putExtra("ind", this.f18830c);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(lVar.f19864o);
                sb2.append("");
                intent2.putExtra("nlikes", sb2.toString());
                intent2.putExtra("liked", lVar.f19869t ? "1" : "0");
                StringBuilder sb3 = new StringBuilder();
                sb3.append(lVar.f19861l);
                sb3.append("");
                intent2.putExtra("idv", sb3.toString());
                intent2.putExtra("indv", childPosition);
                StringBuilder sb4 = new StringBuilder();
                sb4.append(lVar.f19862m);
                sb4.append("");
                intent2.putExtra("idusuv", sb4.toString());
                intent2.putExtra("desde_videosdeusu", true ^ this.f18837j.equals(""));
                String str2 = "";
                String str3 = "";
                String str4 = "";
                if (this.f18841n.f17971bz[this.f18830c].f18295am) {
                    str2 = lVar.f19850a;
                }
                if (this.f18841n.f17971bz[this.f18830c].f18296an) {
                    str3 = lVar.f19851b;
                }
                if (this.f18841n.f17971bz[this.f18830c].f18241L) {
                    str4 = lVar.f19852c;
                }
                intent2.putExtra("descr", str2);
                intent2.putExtra("nombre", str3);
                intent2.putExtra("fcrea", str4);
                intent2.putExtra("coments", lVar.f19854e);
                intent2.putExtra("fnac_d", lVar.f19855f);
                intent2.putExtra("fnac_m", lVar.f19856g);
                intent2.putExtra("fnac_a", lVar.f19857h);
                intent2.putExtra("sexo", lVar.f19858i);
                intent2.putExtra("privados", lVar.f19859j);
                intent2.putExtra("nvideos", lVar.f19860k);
                int indexOf = this.f18796F.indexOf(Integer.valueOf(lVar.f19862m));
                if (indexOf != -1) {
                    intent2.putExtra("vfoto", ((C5795b) this.f18795E.get(indexOf)).f18890b);
                } else {
                    intent2.putExtra("vfoto", "0");
                }
                startActivityForResult(intent2, 0);
            }
        } else if ((this.f18841n.f17986cO == null || this.f18841n.f17986cO.equals("")) && ((this.f18841n.f17985cN == null || this.f18841n.f17985cN.equals("")) && ((this.f18841n.f17988cQ == null || this.f18841n.f17988cQ.equals("")) && (this.f18841n.f17989cR == null || this.f18841n.f17989cR.equals(""))))) {
            abrir_secc(view);
        } else {
            if (this.f18841n.f17986cO != null && !this.f18841n.f17986cO.equals("")) {
                this.f18809S = new RewardedVideo((Context) this, this.f18841n.f17986cO);
            }
            if (this.f18841n.f17985cN != null && !this.f18841n.f17985cN.equals("")) {
                this.f18808R = C2997g.m10716a(this);
            }
            if (this.f18841n.f17988cQ != null && !this.f18841n.f17988cQ.equals("")) {
                this.f18810T = new RewardedVideoAd(this, this.f18841n.f17988cQ);
            }
            if (this.f18841n.f17989cR != null && !this.f18841n.f17989cR.equals("")) {
                this.f18811U = new StartAppAd(this);
            }
            this.f18815Y = new ProgressDialog(this);
            this.f18814X = view;
            if (!this.f18841n.mo20774a((Context) this, view, this.f18800J, this.f18815Y, this.f18808R, this.f18809S, this.f18810T, this.f18811U)) {
                abrir_secc(view);
            }
        }
    }

    public void abrir_secc(View view) {
        C5662h a = this.f18841n.mo20761a(view, (Context) this);
        if (a.f18227b) {
            this.f18842o = true;
            Intent intent = new Intent();
            intent.putExtra("finalizar", true);
            intent.putExtra("finalizar_app", a.f18228c);
            setResult(-1, intent);
        }
        if (a.f18229d) {
            startActivityForResult(a.f18226a, 0);
        } else if (a.f18226a != null) {
            if (a.f18227b && this.f18841n.f18045dm != 2) {
                a.f18226a.putExtra("es_root", true);
            }
            this.f18845r = false;
            startActivity(a.f18226a);
        }
        if (this.f18842o && !this.f18813W) {
            finish();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo21100a(String str) {
        Bitmap bitmap;
        File file = new File(str);
        boolean z = false;
        if (file.length() == 0) {
            return false;
        }
        if (file.length() > 55574528) {
            final AlertDialog create = new Builder(this).setCancelable(false).setPositiveButton(getString(R.string.aceptar), null).setMessage(R.string.vidlargo).create();
            if (!this.f18800J.equals("")) {
                create.setOnShowListener(new OnShowListener() {
                    public void onShow(DialogInterface dialogInterface) {
                        Button button = create.getButton(-1);
                        StringBuilder sb = new StringBuilder();
                        sb.append("#");
                        sb.append(t_buscvideos.this.f18800J);
                        button.setTextColor(Color.parseColor(sb.toString()));
                    }
                });
            }
            create.show();
            try {
                ((TextView) create.findViewById(16908299)).setTypeface(Typeface.MONOSPACE);
            } catch (Exception unused) {
            }
            return false;
        }
        Bitmap createVideoThumbnail = ThumbnailUtils.createVideoThumbnail(str, 1);
        try {
            createVideoThumbnail.compress(CompressFormat.JPEG, 100, new FileOutputStream(this.f18841n.mo20757a((Context) this, 99)));
        } catch (Exception unused2) {
        }
        try {
            File a = this.f18841n.mo20757a((Context) this, 99);
            Options options = new Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(a.getPath(), options);
            int i = options.outWidth;
            int i2 = options.outWidth;
            int i3 = options.outHeight;
            if (i2 <= 800 && i3 <= 800) {
                z = true;
            }
            if (!z) {
                int round = Math.round(((float) i2) / ((float) config.m23824a(i2, i3, 800, 800)));
                Options options2 = new Options();
                options2.inSampleSize = round;
                bitmap = BitmapFactory.decodeFile(a.getPath(), options2);
            } else {
                bitmap = Media.getBitmap(getContentResolver(), Uri.fromFile(a));
            }
            bitmap.compress(CompressFormat.JPEG, 75, new FileOutputStream(this.f18841n.mo20757a((Context) this, 99)));
        } catch (Exception unused3) {
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public void mo21103g() {
        if (this.f18826ai != null) {
            try {
                this.f18826ai.interrupt();
            } catch (Exception unused) {
            }
        }
        this.f18821ad = false;
        this.f18822ae = false;
        if (this.f18816Z != null) {
            this.f18816Z.clear();
        }
        if (this.f18818aa != null) {
            this.f18818aa.clear();
        }
        if (this.f18819ab != null) {
            this.f18819ab.clear();
        }
        this.f18824ag.notifyDataSetChanged();
        findViewById(R.id.pb_videos).setVisibility(0);
        this.f18826ai = new Thread(null, this.f18820ac, "buscandoelems");
        this.f18826ai.start();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public Dialog mo21104h() {
        int i;
        int i2;
        Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.buscvideos_filtros);
        dialog.setTitle(getResources().getString(R.string.selecciona));
        TextView textView = (TextView) dialog.findViewById(R.id.btn_aceptar);
        textView.setOnClickListener(new OnClickListener() {
            /* JADX WARNING: Removed duplicated region for block: B:15:0x00c4  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0066  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void onClick(android.view.View r6) {
                /*
                    r5 = this;
                    mega.boicot.t_buscvideos r6 = mega.boicot.t_buscvideos.this
                    android.content.SharedPreferences r6 = r6.f18807Q
                    android.content.SharedPreferences$Editor r6 = r6.edit()
                    mega.boicot.t_buscvideos r0 = mega.boicot.t_buscvideos.this
                    boolean r0 = r0.f18846s
                    r1 = 0
                    r2 = 1
                    if (r0 == 0) goto L_0x005f
                    mega.boicot.t_buscvideos r0 = mega.boicot.t_buscvideos.this
                    android.app.Dialog r0 = r0.f18803M
                    r3 = 2131231436(0x7f0802cc, float:1.8078953E38)
                    android.view.View r0 = r0.findViewById(r3)
                    android.widget.Spinner r0 = (android.widget.Spinner) r0
                    int r0 = r0.getSelectedItemPosition()
                    mega.boicot.t_buscvideos r3 = mega.boicot.t_buscvideos.this
                    int r3 = r3.f18852y
                    mega.boicot.t_buscvideos r4 = mega.boicot.t_buscvideos.this
                    int[] r4 = r4.f18851x
                    r4 = r4[r0]
                    if (r3 == r4) goto L_0x005f
                    mega.boicot.t_buscvideos r3 = mega.boicot.t_buscvideos.this
                    mega.boicot.t_buscvideos r4 = mega.boicot.t_buscvideos.this
                    int[] r4 = r4.f18851x
                    r0 = r4[r0]
                    r3.f18852y = r0
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    r0.<init>()
                    java.lang.String r3 = "ftipo_v_"
                    r0.append(r3)
                    mega.boicot.t_buscvideos r3 = mega.boicot.t_buscvideos.this
                    mega.boicot.config r3 = r3.f18841n
                    mega.boicot.i[] r3 = r3.f17971bz
                    mega.boicot.t_buscvideos r4 = mega.boicot.t_buscvideos.this
                    int r4 = r4.f18830c
                    r3 = r3[r4]
                    int r3 = r3.f18330w
                    r0.append(r3)
                    java.lang.String r0 = r0.toString()
                    mega.boicot.t_buscvideos r3 = mega.boicot.t_buscvideos.this
                    int r3 = r3.f18852y
                    r6.putInt(r0, r3)
                    r0 = r2
                    goto L_0x0060
                L_0x005f:
                    r0 = r1
                L_0x0060:
                    mega.boicot.t_buscvideos r3 = mega.boicot.t_buscvideos.this
                    boolean r3 = r3.f18847t
                    if (r3 == 0) goto L_0x00c2
                    mega.boicot.t_buscvideos r3 = mega.boicot.t_buscvideos.this
                    android.app.Dialog r3 = r3.f18803M
                    r4 = 2131231431(0x7f0802c7, float:1.8078943E38)
                    android.view.View r3 = r3.findViewById(r4)
                    android.widget.Spinner r3 = (android.widget.Spinner) r3
                    int r3 = r3.getSelectedItemPosition()
                    if (r3 <= 0) goto L_0x008d
                    mega.boicot.t_buscvideos r1 = mega.boicot.t_buscvideos.this
                    mega.boicot.config r1 = r1.f18841n
                    mega.boicot.i[] r1 = r1.f17971bz
                    mega.boicot.t_buscvideos r4 = mega.boicot.t_buscvideos.this
                    int r4 = r4.f18830c
                    r1 = r1[r4]
                    mega.boicot.d[] r1 = r1.f18284ab
                    int r4 = r3 + -1
                    r1 = r1[r4]
                    int r1 = r1.f18191a
                L_0x008d:
                    mega.boicot.t_buscvideos r4 = mega.boicot.t_buscvideos.this
                    int r4 = r4.f18853z
                    if (r4 == r1) goto L_0x00c2
                    mega.boicot.t_buscvideos r0 = mega.boicot.t_buscvideos.this
                    r0.f18853z = r1
                    mega.boicot.t_buscvideos r0 = mega.boicot.t_buscvideos.this
                    r0.f18791A = r3
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    r0.<init>()
                    java.lang.String r1 = "fcat_v_"
                    r0.append(r1)
                    mega.boicot.t_buscvideos r1 = mega.boicot.t_buscvideos.this
                    mega.boicot.config r1 = r1.f18841n
                    mega.boicot.i[] r1 = r1.f17971bz
                    mega.boicot.t_buscvideos r3 = mega.boicot.t_buscvideos.this
                    int r3 = r3.f18830c
                    r1 = r1[r3]
                    int r1 = r1.f18330w
                    r0.append(r1)
                    java.lang.String r0 = r0.toString()
                    mega.boicot.t_buscvideos r1 = mega.boicot.t_buscvideos.this
                    int r1 = r1.f18853z
                    r6.putInt(r0, r1)
                    r0 = r2
                L_0x00c2:
                    if (r0 == 0) goto L_0x00d1
                    r6.commit()
                    mega.boicot.t_buscvideos r6 = mega.boicot.t_buscvideos.this
                    r6.mo21106j()
                    mega.boicot.t_buscvideos r6 = mega.boicot.t_buscvideos.this
                    r6.mo21103g()
                L_0x00d1:
                    mega.boicot.t_buscvideos r6 = mega.boicot.t_buscvideos.this
                    android.app.Dialog r6 = r6.f18803M
                    r6.dismiss()
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: mega.boicot.t_buscvideos.C578213.onClick(android.view.View):void");
            }
        });
        if (VERSION.SDK_INT > 20) {
            StringBuilder sb = new StringBuilder();
            sb.append("#");
            sb.append(this.f18841n.f17890aW);
            textView.setTextColor(Color.parseColor(sb.toString()));
        }
        if (this.f18846s) {
            Spinner spinner = (Spinner) dialog.findViewById(R.id.sp_tipo);
            ArrayList arrayList = new ArrayList();
            if (this.f18841n.f17971bz[this.f18830c].f18289ag) {
                String str = this.f18841n.f17971bz[this.f18830c].f18302at;
                if (str.equals("")) {
                    str = getString(R.string.tipo_ultimos);
                }
                arrayList.add(str);
                this.f18851x[0] = 1;
                i = this.f18852y == 1 ? arrayList.size() - 1 : 0;
                i2 = 1;
            } else {
                i2 = 0;
                i = 0;
            }
            if (this.f18841n.f17971bz[this.f18830c].f18286ad) {
                String str2 = this.f18841n.f17971bz[this.f18830c].f18299aq;
                if (str2.equals("")) {
                    str2 = getString(R.string.tipo_maspuntuados);
                }
                arrayList.add(str2);
                this.f18851x[i2] = 2;
                i2++;
                if (this.f18852y == 2) {
                    i = arrayList.size() - 1;
                }
            }
            if (this.f18841n.f17971bz[this.f18830c].f18285ac) {
                String str3 = this.f18841n.f17971bz[this.f18830c].f18298ap;
                if (str3.equals("")) {
                    str3 = getString(R.string.tipo_masvistos);
                }
                arrayList.add(str3);
                this.f18851x[i2] = 3;
                i2++;
                if (this.f18852y == 3) {
                    i = arrayList.size() - 1;
                }
            }
            if (this.f18841n.f17971bz[this.f18830c].f18288af) {
                String str4 = this.f18841n.f17971bz[this.f18830c].f18301as;
                if (str4.equals("")) {
                    str4 = getString(R.string.tipo_destacados);
                }
                arrayList.add(str4);
                this.f18851x[i2] = 4;
                i2++;
                if (this.f18852y == 4) {
                    i = arrayList.size() - 1;
                }
            }
            if (this.f18841n.f17971bz[this.f18830c].f18290ah) {
                String str5 = this.f18841n.f17971bz[this.f18830c].f18303au;
                if (str5.equals("")) {
                    str5 = getString(R.string.tipo_dist);
                }
                arrayList.add(str5);
                this.f18851x[i2] = 5;
                i2++;
                if (this.f18852y == 5) {
                    i = arrayList.size() - 1;
                }
            }
            if (this.f18841n.f17971bz[this.f18830c].f18287ae) {
                String str6 = this.f18841n.f17971bz[this.f18830c].f18300ar;
                if (str6.equals("")) {
                    str6 = getString(R.string.tipo_fav);
                }
                arrayList.add(str6);
                this.f18851x[i2] = 6;
                i2++;
                if (this.f18852y == 6) {
                    i = arrayList.size() - 1;
                }
            }
            if (!this.f18849v) {
                String str7 = this.f18841n.f17971bz[this.f18830c].f18304av;
                if (str7.equals("")) {
                    str7 = getString(R.string.tipo_propios);
                }
                arrayList.add(str7);
                this.f18851x[i2] = 7;
                if (this.f18852y == 7) {
                    i = arrayList.size() - 1;
                }
            }
            ArrayAdapter arrayAdapter = new ArrayAdapter(this, 17367048, arrayList);
            arrayAdapter.setDropDownViewResource(17367049);
            spinner.setAdapter(arrayAdapter);
            spinner.setSelection(i);
            spinner.setVisibility(0);
        }
        if (this.f18847t) {
            Spinner spinner2 = (Spinner) dialog.findViewById(R.id.sp_cat);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(getString(R.string.todo));
            int i3 = 0;
            for (int i4 = 0; i4 < this.f18841n.f17971bz[this.f18830c].f18284ab.length; i4++) {
                arrayList2.add(this.f18841n.f17971bz[this.f18830c].f18284ab[i4].f18192b);
                if (this.f18853z == this.f18841n.f17971bz[this.f18830c].f18284ab[i4].f18191a) {
                    i3 = arrayList2.size() - 1;
                }
            }
            ArrayAdapter arrayAdapter2 = new ArrayAdapter(this, 17367048, arrayList2);
            arrayAdapter2.setDropDownViewResource(17367049);
            spinner2.setAdapter(arrayAdapter2);
            spinner2.setSelection(i3);
            spinner2.setVisibility(0);
        }
        return dialog;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public Dialog mo21105i() {
        Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.buscvideos_nuevo);
        dialog.setTitle(getResources().getString(R.string.enviarvideo));
        ((TextView) dialog.findViewById(R.id.btn_cancel)).setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                t_buscvideos.this.f18804N.dismiss();
            }
        });
        TextView textView = (TextView) dialog.findViewById(R.id.btn_aceptar);
        textView.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                int i;
                Builder builder = new Builder(t_buscvideos.this);
                builder.setCancelable(false).setPositiveButton(t_buscvideos.this.getString(R.string.aceptar), null);
                int selectedItemPosition = ((Spinner) t_buscvideos.this.f18804N.findViewById(R.id.sp_cat)).getSelectedItemPosition();
                boolean z = true;
                if (selectedItemPosition == 0) {
                    builder.setMessage(R.string.falta_cat);
                    final AlertDialog create = builder.create();
                    if (!t_buscvideos.this.f18800J.equals("")) {
                        create.setOnShowListener(new OnShowListener() {
                            public void onShow(DialogInterface dialogInterface) {
                                Button button = create.getButton(-1);
                                StringBuilder sb = new StringBuilder();
                                sb.append("#");
                                sb.append(t_buscvideos.this.f18800J);
                                button.setTextColor(Color.parseColor(sb.toString()));
                            }
                        });
                    }
                    create.show();
                    try {
                        ((TextView) create.findViewById(16908299)).setTypeface(Typeface.MONOSPACE);
                    } catch (Exception unused) {
                    }
                    i = 0;
                    z = false;
                } else {
                    int i2 = 0;
                    int i3 = 1;
                    while (i2 < t_buscvideos.this.f18841n.f17971bz[t_buscvideos.this.f18830c].f18284ab.length) {
                        if (!t_buscvideos.this.f18841n.f17971bz[t_buscvideos.this.f18830c].f18284ab[i2].f18193c || t_buscvideos.this.f18841n.f18076m) {
                            if (selectedItemPosition == i3) {
                                break;
                            }
                            i3++;
                        }
                        i2++;
                    }
                    i = t_buscvideos.this.f18841n.f17971bz[t_buscvideos.this.f18830c].f18284ab[i2].f18191a;
                }
                String str = "";
                if (z && t_buscvideos.this.f18841n.f17971bz[t_buscvideos.this.f18830c].f18295am) {
                    str = ((EditText) t_buscvideos.this.f18804N.findViewById(R.id.tv_descr)).getText().toString().trim();
                    if (str.isEmpty()) {
                        builder.setMessage(R.string.falta_descr);
                        final AlertDialog create2 = builder.create();
                        if (!t_buscvideos.this.f18800J.equals("")) {
                            create2.setOnShowListener(new OnShowListener() {
                                public void onShow(DialogInterface dialogInterface) {
                                    Button button = create2.getButton(-1);
                                    StringBuilder sb = new StringBuilder();
                                    sb.append("#");
                                    sb.append(t_buscvideos.this.f18800J);
                                    button.setTextColor(Color.parseColor(sb.toString()));
                                }
                            });
                        }
                        create2.show();
                        try {
                            ((TextView) create2.findViewById(16908299)).setTypeface(Typeface.MONOSPACE);
                        } catch (Exception unused2) {
                        }
                        z = false;
                    }
                }
                if (z) {
                    try {
                        t_buscvideos.this.f18804N.dismiss();
                    } catch (Exception unused3) {
                    }
                    t_buscvideos.this.m24093a(i, str);
                }
            }
        });
        if (VERSION.SDK_INT > 20) {
            StringBuilder sb = new StringBuilder();
            sb.append("#");
            sb.append(this.f18841n.f17890aW);
            textView.setTextColor(Color.parseColor(sb.toString()));
        }
        Spinner spinner = (Spinner) dialog.findViewById(R.id.sp_cat);
        ArrayList arrayList = new ArrayList();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getString(R.string.busc_cat));
        sb2.append("..");
        arrayList.add(sb2.toString());
        for (int i = 0; i < this.f18841n.f17971bz[this.f18830c].f18284ab.length; i++) {
            if (!this.f18841n.f17971bz[this.f18830c].f18284ab[i].f18193c || this.f18841n.f18076m) {
                arrayList.add(this.f18841n.f17971bz[this.f18830c].f18284ab[i].f18192b);
            }
        }
        ArrayAdapter arrayAdapter = new ArrayAdapter(this, 17367048, arrayList);
        arrayAdapter.setDropDownViewResource(17367049);
        spinner.setAdapter(arrayAdapter);
        if (arrayList.size() < 3) {
            spinner.setSelection(1);
        } else {
            spinner.setSelection(0);
            spinner.setVisibility(0);
        }
        if (this.f18841n.f17971bz[this.f18830c].f18295am) {
            dialog.findViewById(R.id.tv_descr).setVisibility(0);
        }
        return dialog;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public void mo21106j() {
        String str;
        if (this.f18846s || this.f18847t) {
            findViewById(R.id.ll_filtros).setOnClickListener(this);
            findViewById(R.id.ll_filtros).setVisibility(0);
            if (this.f18846s) {
                if (this.f18852y == 1) {
                    str = this.f18841n.f17971bz[this.f18830c].f18302at;
                    if (str.equals("")) {
                        str = getString(R.string.tipo_ultimos);
                    }
                } else if (this.f18852y == 2) {
                    str = this.f18841n.f17971bz[this.f18830c].f18299aq;
                    if (str.equals("")) {
                        str = getString(R.string.tipo_maspuntuados);
                    }
                } else if (this.f18852y == 3) {
                    str = this.f18841n.f17971bz[this.f18830c].f18298ap;
                    if (str.equals("")) {
                        str = getString(R.string.tipo_masvistos);
                    }
                } else if (this.f18852y == 4) {
                    str = this.f18841n.f17971bz[this.f18830c].f18301as;
                    if (str.equals("")) {
                        str = getString(R.string.tipo_destacados);
                    }
                } else if (this.f18852y == 5) {
                    str = this.f18841n.f17971bz[this.f18830c].f18303au;
                    if (str.equals("")) {
                        str = getString(R.string.tipo_dist);
                    }
                } else if (this.f18852y == 6) {
                    str = this.f18841n.f17971bz[this.f18830c].f18300ar;
                    if (str.equals("")) {
                        str = getString(R.string.tipo_fav);
                    }
                } else if (this.f18852y == 7) {
                    str = this.f18841n.f17971bz[this.f18830c].f18304av;
                    if (str.equals("")) {
                        str = getString(R.string.tipo_propios);
                    }
                } else {
                    str = "";
                }
                this.f18801K.setText(str);
                this.f18801K.setVisibility(0);
            } else {
                this.f18801K.setVisibility(8);
            }
            if (this.f18847t) {
                if (this.f18791A == 0) {
                    this.f18802L.setText(getString(R.string.todo));
                } else {
                    this.f18802L.setText(this.f18841n.f17971bz[this.f18830c].f18284ab[this.f18791A - 1].f18192b);
                }
                this.f18802L.setVisibility(0);
            } else {
                this.f18802L.setVisibility(8);
            }
            findViewById(R.id.tv_filtrar).setVisibility(8);
            return;
        }
        findViewById(R.id.ll_filtros).setVisibility(8);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m24093a(int i, String str) {
        int i2 = 100;
        while (this.f18841n.mo20757a((Context) this, i2).exists()) {
            i2++;
        }
        this.f18841n.mo20757a((Context) this, 99).renameTo(this.f18841n.mo20757a((Context) this, i2));
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        mediaMetadataRetriever.setDataSource(this, Uri.parse(this.f18840m));
        C5800f fVar = new C5800f(i2, this.f18840m, i, str, mediaMetadataRetriever.extractMetadata(23));
        fVar.execute(new String[0]);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x03e1  */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m24105k() {
        /*
            r31 = this;
            r1 = r31
            java.lang.String r2 = ""
            r4 = 1
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00c6, all -> 0x00c1 }
            r5.<init>()     // Catch:{ Exception -> 0x00c6, all -> 0x00c1 }
            java.lang.String r6 = "http://"
            r5.append(r6)     // Catch:{ Exception -> 0x00c6, all -> 0x00c1 }
            java.lang.String r6 = mega.boicot.config.f17839g     // Catch:{ Exception -> 0x00c6, all -> 0x00c1 }
            r5.append(r6)     // Catch:{ Exception -> 0x00c6, all -> 0x00c1 }
            java.lang.String r6 = "/srv/obtener_buscvideos.php?idusu="
            r5.append(r6)     // Catch:{ Exception -> 0x00c6, all -> 0x00c1 }
            int r6 = r1.f18829b     // Catch:{ Exception -> 0x00c6, all -> 0x00c1 }
            r5.append(r6)     // Catch:{ Exception -> 0x00c6, all -> 0x00c1 }
            java.lang.String r6 = "&c="
            r5.append(r6)     // Catch:{ Exception -> 0x00c6, all -> 0x00c1 }
            java.lang.String r6 = r1.f18838k     // Catch:{ Exception -> 0x00c6, all -> 0x00c1 }
            r5.append(r6)     // Catch:{ Exception -> 0x00c6, all -> 0x00c1 }
            java.lang.String r6 = "&idsec="
            r5.append(r6)     // Catch:{ Exception -> 0x00c6, all -> 0x00c1 }
            int r6 = r1.f18831d     // Catch:{ Exception -> 0x00c6, all -> 0x00c1 }
            r5.append(r6)     // Catch:{ Exception -> 0x00c6, all -> 0x00c1 }
            java.lang.String r6 = "&tipo="
            r5.append(r6)     // Catch:{ Exception -> 0x00c6, all -> 0x00c1 }
            int r6 = r1.f18852y     // Catch:{ Exception -> 0x00c6, all -> 0x00c1 }
            r5.append(r6)     // Catch:{ Exception -> 0x00c6, all -> 0x00c1 }
            java.lang.String r6 = "&idcat="
            r5.append(r6)     // Catch:{ Exception -> 0x00c6, all -> 0x00c1 }
            int r6 = r1.f18853z     // Catch:{ Exception -> 0x00c6, all -> 0x00c1 }
            r5.append(r6)     // Catch:{ Exception -> 0x00c6, all -> 0x00c1 }
            java.lang.String r6 = "&idusuv="
            r5.append(r6)     // Catch:{ Exception -> 0x00c6, all -> 0x00c1 }
            java.lang.String r6 = r1.f18837j     // Catch:{ Exception -> 0x00c6, all -> 0x00c1 }
            r5.append(r6)     // Catch:{ Exception -> 0x00c6, all -> 0x00c1 }
            java.lang.String r6 = "&fila="
            r5.append(r6)     // Catch:{ Exception -> 0x00c6, all -> 0x00c1 }
            java.util.ArrayList<mega.boicot.l> r6 = r1.f18816Z     // Catch:{ Exception -> 0x00c6, all -> 0x00c1 }
            int r6 = r6.size()     // Catch:{ Exception -> 0x00c6, all -> 0x00c1 }
            r5.append(r6)     // Catch:{ Exception -> 0x00c6, all -> 0x00c1 }
            java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x00c6, all -> 0x00c1 }
            java.net.URL r6 = new java.net.URL     // Catch:{ Exception -> 0x00c6, all -> 0x00c1 }
            r6.<init>(r5)     // Catch:{ Exception -> 0x00c6, all -> 0x00c1 }
            java.net.URLConnection r5 = r6.openConnection()     // Catch:{ Exception -> 0x00c6, all -> 0x00c1 }
            java.net.HttpURLConnection r5 = (java.net.HttpURLConnection) r5     // Catch:{ Exception -> 0x00c6, all -> 0x00c1 }
            r5.setDoInput(r4)     // Catch:{ Exception -> 0x00bd, all -> 0x00b8 }
            r6 = 10000(0x2710, float:1.4013E-41)
            r5.setConnectTimeout(r6)     // Catch:{ Exception -> 0x00bd, all -> 0x00b8 }
            r5.setReadTimeout(r6)     // Catch:{ Exception -> 0x00bd, all -> 0x00b8 }
            java.lang.String r6 = "User-Agent"
            java.lang.String r7 = "Android Vinebre Software"
            r5.setRequestProperty(r6, r7)     // Catch:{ Exception -> 0x00bd, all -> 0x00b8 }
            java.io.InputStream r6 = r5.getInputStream()     // Catch:{ Exception -> 0x00bd, all -> 0x00b8 }
            java.io.BufferedReader r7 = new java.io.BufferedReader     // Catch:{ Exception -> 0x00bd, all -> 0x00b8 }
            java.io.InputStreamReader r8 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x00bd, all -> 0x00b8 }
            r8.<init>(r6)     // Catch:{ Exception -> 0x00bd, all -> 0x00b8 }
            r7.<init>(r8)     // Catch:{ Exception -> 0x00bd, all -> 0x00b8 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00bd, all -> 0x00b8 }
            r6.<init>()     // Catch:{ Exception -> 0x00bd, all -> 0x00b8 }
        L_0x0092:
            java.lang.String r8 = r7.readLine()     // Catch:{ Exception -> 0x00bd, all -> 0x00b8 }
            if (r8 == 0) goto L_0x00ad
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00bd, all -> 0x00b8 }
            r9.<init>()     // Catch:{ Exception -> 0x00bd, all -> 0x00b8 }
            r9.append(r8)     // Catch:{ Exception -> 0x00bd, all -> 0x00b8 }
            java.lang.String r8 = "\n"
            r9.append(r8)     // Catch:{ Exception -> 0x00bd, all -> 0x00b8 }
            java.lang.String r8 = r9.toString()     // Catch:{ Exception -> 0x00bd, all -> 0x00b8 }
            r6.append(r8)     // Catch:{ Exception -> 0x00bd, all -> 0x00b8 }
            goto L_0x0092
        L_0x00ad:
            java.lang.String r6 = r6.toString()     // Catch:{ Exception -> 0x00bd, all -> 0x00b8 }
            if (r5 == 0) goto L_0x00b6
            r5.disconnect()
        L_0x00b6:
            r2 = r6
            goto L_0x00d1
        L_0x00b8:
            r0 = move-exception
            r2 = r0
            r3 = r5
            goto L_0x03df
        L_0x00bd:
            r0 = move-exception
            r6 = r5
            r5 = r0
            goto L_0x00c9
        L_0x00c1:
            r0 = move-exception
            r2 = r0
            r3 = 0
            goto L_0x03df
        L_0x00c6:
            r0 = move-exception
            r5 = r0
            r6 = 0
        L_0x00c9:
            r5.printStackTrace()     // Catch:{ all -> 0x03dc }
            if (r6 == 0) goto L_0x00d1
            r6.disconnect()
        L_0x00d1:
            java.lang.String r5 = "ANDROID:OK RESULT:"
            int r5 = r2.indexOf(r5)
            r6 = 0
            r1.f18822ae = r6
            r7 = -1
            if (r5 == r7) goto L_0x03d6
            android.content.SharedPreferences r8 = r1.f18807Q
            android.content.SharedPreferences$Editor r8 = r8.edit()
            r1.f18822ae = r4
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            r1.f18818aa = r9
            java.lang.String r9 = "ANDROID:OK RESULT:0"
            int r9 = r2.indexOf(r9)
            if (r9 == r7) goto L_0x00f7
            r1.f18821ad = r6
            goto L_0x0101
        L_0x00f7:
            java.lang.String r9 = "ANDROID:OK RESULT:1"
            int r9 = r2.indexOf(r9)
            if (r9 == r7) goto L_0x0101
            r1.f18821ad = r4
        L_0x0101:
            java.lang.String r9 = "@y@"
            int r5 = r2.indexOf(r9, r5)
            r9 = r6
        L_0x0108:
            if (r5 == r7) goto L_0x03b0
            int r5 = r5 + 3
            java.lang.String r10 = ";"
            int r10 = r2.indexOf(r10, r5)
            java.lang.String r5 = r2.substring(r5, r10)
            int r5 = java.lang.Integer.parseInt(r5)
            int r10 = r10 + r4
            java.lang.String r11 = ";"
            int r11 = r2.indexOf(r11, r10)
            java.lang.String r10 = r2.substring(r10, r11)
            int r10 = java.lang.Integer.parseInt(r10)
            int r11 = r11 + r4
            java.lang.String r12 = ";"
            int r12 = r2.indexOf(r12, r11)
            java.lang.String r11 = r2.substring(r11, r12)
            int r12 = r12 + r4
            java.lang.String r13 = ";"
            int r13 = r2.indexOf(r13, r12)
            java.lang.String r12 = r2.substring(r12, r13)
            int r13 = r13 + r4
            java.lang.String r14 = ";"
            int r14 = r2.indexOf(r14, r13)
            java.lang.String r13 = r2.substring(r13, r14)
            int r14 = r14 + r4
            java.lang.String r15 = ";"
            int r15 = r2.indexOf(r15, r14)
            java.lang.String r14 = r2.substring(r14, r15)
            int r15 = r15 + r4
            java.lang.String r6 = ";"
            int r6 = r2.indexOf(r6, r15)
            java.lang.String r15 = r2.substring(r15, r6)
            int r15 = java.lang.Integer.parseInt(r15)
            int r6 = r6 + r4
            java.lang.String r3 = ";"
            int r3 = r2.indexOf(r3, r6)
            java.lang.String r6 = r2.substring(r6, r3)
            int r6 = java.lang.Integer.parseInt(r6)
            int r3 = r3 + r4
            java.lang.String r7 = ";"
            int r7 = r2.indexOf(r7, r3)
            java.lang.String r3 = r2.substring(r3, r7)
            java.lang.String r4 = "1"
            boolean r3 = r3.equals(r4)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            r4 = 1
            int r7 = r7 + r4
            java.lang.String r4 = ";"
            int r4 = r2.indexOf(r4, r7)
            java.lang.String r7 = r2.substring(r7, r4)
            int r7 = java.lang.Integer.parseInt(r7)
            r16 = 1
            int r4 = r4 + 1
            r17 = r9
            java.lang.String r9 = ";"
            int r9 = r2.indexOf(r9, r4)
            java.lang.String r4 = r2.substring(r4, r9)
            int r4 = java.lang.Integer.parseInt(r4)
            int r9 = r9 + 1
            r18 = r8
            java.lang.String r8 = ";"
            int r8 = r2.indexOf(r8, r9)
            java.lang.String r9 = r2.substring(r9, r8)
            int r8 = r8 + 1
            r19 = r4
            java.lang.String r4 = ";"
            int r4 = r2.indexOf(r4, r8)
            java.lang.String r8 = r2.substring(r8, r4)
            int r4 = r4 + 1
            r20 = r8
            java.lang.String r8 = ";"
            int r8 = r2.indexOf(r8, r4)
            java.lang.String r4 = r2.substring(r4, r8)
            int r8 = r8 + 1
            r21 = r4
            java.lang.String r4 = ";"
            int r4 = r2.indexOf(r4, r8)
            java.lang.String r8 = r2.substring(r8, r4)
            int r4 = r4 + 1
            r22 = r8
            java.lang.String r8 = ";"
            int r8 = r2.indexOf(r8, r4)
            java.lang.String r4 = r2.substring(r4, r8)
            int r8 = r8 + 1
            r23 = r4
            java.lang.String r4 = ";"
            int r4 = r2.indexOf(r4, r8)
            java.lang.String r8 = r2.substring(r8, r4)
            int r4 = r4 + 1
            r24 = r8
            java.lang.String r8 = ";"
            int r8 = r2.indexOf(r8, r4)
            java.lang.String r4 = r2.substring(r4, r8)
            int r8 = r8 + 1
            r25 = r4
            java.lang.String r4 = ";"
            int r4 = r2.indexOf(r4, r8)
            java.lang.String r8 = r2.substring(r8, r4)
            r26 = r2
            java.util.ArrayList<java.lang.Integer> r2 = r1.f18796F
            r27 = r4
            java.lang.Integer r4 = java.lang.Integer.valueOf(r10)
            int r2 = r2.indexOf(r4)
            r4 = -1
            if (r2 != r4) goto L_0x029b
            java.util.ArrayList<java.lang.Integer> r2 = r1.f18796F
            java.lang.Integer r4 = java.lang.Integer.valueOf(r10)
            r2.add(r4)
            mega.boicot.t_buscvideos$b r2 = new mega.boicot.t_buscvideos$b
            r4 = 0
            r2.<init>()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r10)
            r28 = r8
            java.lang.String r8 = ""
            r4.append(r8)
            java.lang.String r4 = r4.toString()
            r2.f18889a = r4
            r2.f18890b = r9
            int r4 = java.lang.Integer.parseInt(r9)
            if (r4 <= 0) goto L_0x0292
            java.io.File r4 = new java.io.File
            java.io.File r8 = r1.f18817a
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r29 = r7
            java.lang.String r7 = "fperfil_"
            r9.append(r7)
            r9.append(r10)
            java.lang.String r7 = ".jpg"
            r9.append(r7)
            java.lang.String r7 = r9.toString()
            r4.<init>(r8, r7)
            boolean r7 = r4.exists()
            if (r7 == 0) goto L_0x0294
            android.content.ContentResolver r7 = r31.getContentResolver()     // Catch:{ Exception -> 0x0294 }
            android.net.Uri r4 = android.net.Uri.fromFile(r4)     // Catch:{ Exception -> 0x0294 }
            android.graphics.Bitmap r4 = android.provider.MediaStore.Images.Media.getBitmap(r7, r4)     // Catch:{ Exception -> 0x0294 }
            r7 = 1
            android.graphics.Bitmap r4 = mega.boicot.config.m23846b(r4, r7)     // Catch:{ Exception -> 0x0294 }
            r2.f18892d = r4     // Catch:{ Exception -> 0x0294 }
            goto L_0x0294
        L_0x0292:
            r29 = r7
        L_0x0294:
            java.util.ArrayList<mega.boicot.t_buscvideos$b> r4 = r1.f18795E
            r4.add(r2)
            r9 = 1
            goto L_0x02a1
        L_0x029b:
            r29 = r7
            r28 = r8
            r9 = r17
        L_0x02a1:
            mega.boicot.l r2 = new mega.boicot.l
            r2.<init>()
            r2.f19861l = r5
            r2.f19862m = r10
            r2.f19850a = r11
            r2.f19851b = r12
            java.lang.String r4 = mega.boicot.config.m23848b(r13)
            java.lang.String r7 = ""
            java.text.SimpleDateFormat r8 = new java.text.SimpleDateFormat
            java.lang.String r10 = "ddMMyy"
            r8.<init>(r10)
            r10 = 6
            r11 = 0
            java.lang.String r12 = r4.substring(r11, r10)     // Catch:{ Exception -> 0x02c8 }
            java.util.Date r8 = r8.parse(r12)     // Catch:{ Exception -> 0x02c8 }
            r11 = r8
            r8 = 1
            goto L_0x02cf
        L_0x02c8:
            r0 = move-exception
            r8 = r0
            r8.printStackTrace()
            r8 = 0
            r11 = 0
        L_0x02cf:
            if (r8 == 0) goto L_0x033d
            java.util.Calendar r8 = java.util.Calendar.getInstance()
            java.util.Calendar r12 = java.util.Calendar.getInstance()
            r12.setTime(r11)
            r13 = 1
            int r10 = r12.get(r13)
            r30 = r7
            int r7 = r8.get(r13)
            if (r10 != r7) goto L_0x0300
            r7 = 6
            int r10 = r12.get(r7)
            int r8 = r8.get(r7)
            if (r10 != r8) goto L_0x0300
            android.content.res.Resources r7 = r31.getResources()
            r8 = 2131558655(0x7f0d00ff, float:1.8742632E38)
            java.lang.String r7 = r7.getString(r8)
            goto L_0x0308
        L_0x0300:
            java.text.DateFormat r7 = android.text.format.DateFormat.getDateFormat(r31)
            java.lang.String r7 = r7.format(r11)
        L_0x0308:
            r8 = 10
            r10 = 6
            java.lang.String r4 = r4.substring(r10, r8)
            java.text.SimpleDateFormat r8 = new java.text.SimpleDateFormat
            java.lang.String r10 = "HHmm"
            r8.<init>(r10)
            java.util.Date r4 = r8.parse(r4)     // Catch:{ Exception -> 0x0337 }
            java.text.DateFormat r8 = android.text.format.DateFormat.getTimeFormat(r31)     // Catch:{ Exception -> 0x0337 }
            java.lang.String r4 = r8.format(r4)     // Catch:{ Exception -> 0x0337 }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0337 }
            r8.<init>()     // Catch:{ Exception -> 0x0337 }
            r8.append(r7)     // Catch:{ Exception -> 0x0337 }
            java.lang.String r7 = " "
            r8.append(r7)     // Catch:{ Exception -> 0x0337 }
            r8.append(r4)     // Catch:{ Exception -> 0x0337 }
            java.lang.String r7 = r8.toString()     // Catch:{ Exception -> 0x0337 }
            goto L_0x0341
        L_0x0337:
            r0 = move-exception
            r4 = r0
            r4.printStackTrace()
            goto L_0x033f
        L_0x033d:
            r30 = r7
        L_0x033f:
            r7 = r30
        L_0x0341:
            r2.f19852c = r7
            r2.f19853d = r14
            r2.f19864o = r15
            r2.f19865p = r6
            boolean r3 = r3.booleanValue()
            r2.f19869t = r3
            r3 = r29
            r2.f19866q = r3
            r3 = r19
            r2.f19867r = r3
            r3 = 1
            r2.f19863n = r3
            java.io.File r4 = new java.io.File
            java.io.File r6 = r1.f18817a
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "fbuscvideo_"
            r7.append(r8)
            r7.append(r5)
            java.lang.String r5 = ".jpg"
            r7.append(r5)
            java.lang.String r5 = r7.toString()
            r4.<init>(r6, r5)
            boolean r4 = r4.exists()
            r2.f19868s = r4
            r4 = r20
            r2.f19854e = r4
            r4 = r21
            r2.f19855f = r4
            r4 = r22
            r2.f19856g = r4
            r4 = r23
            r2.f19857h = r4
            r4 = r24
            r2.f19858i = r4
            r4 = r25
            r2.f19859j = r4
            r4 = r28
            r2.f19860k = r4
            java.util.ArrayList<mega.boicot.l> r4 = r1.f18818aa
            r4.add(r2)
            java.lang.String r2 = "@y@"
            r6 = r26
            r4 = r27
            int r5 = r6.indexOf(r2, r4)
            r4 = r3
            r2 = r6
            r8 = r18
            r6 = 0
            r7 = -1
            goto L_0x0108
        L_0x03b0:
            r2 = r8
            r17 = r9
            r2.commit()
            if (r17 == 0) goto L_0x03d6
            mega.boicot.t_buscvideos$d r2 = r1.f18797G
            if (r2 == 0) goto L_0x03c6
            mega.boicot.t_buscvideos$d r2 = r1.f18797G
            android.os.AsyncTask$Status r2 = r2.getStatus()
            android.os.AsyncTask$Status r3 = android.os.AsyncTask.Status.RUNNING
            if (r2 == r3) goto L_0x03d6
        L_0x03c6:
            mega.boicot.t_buscvideos$d r2 = new mega.boicot.t_buscvideos$d
            r3 = 0
            r2.<init>()
            r1.f18797G = r2
            mega.boicot.t_buscvideos$d r2 = r1.f18797G
            r3 = 0
            java.lang.String[] r3 = new java.lang.String[r3]
            r2.execute(r3)
        L_0x03d6:
            java.lang.Runnable r2 = r1.f18828ak
            r1.runOnUiThread(r2)
            return
        L_0x03dc:
            r0 = move-exception
            r2 = r0
            r3 = r6
        L_0x03df:
            if (r3 == 0) goto L_0x03e4
            r3.disconnect()
        L_0x03e4:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: mega.boicot.t_buscvideos.m24105k():void");
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ((LinearLayout) findViewById(R.id.ll_princ)).removeViewAt(0);
        mo21102f();
        this.f18803M.dismiss();
        this.f18803M = mo21104h();
        ((LinearLayout) findViewById(R.id.ll_ad)).removeAllViews();
        if (!(this.f18798H == null || this.f18798H.f17768a == null)) {
            try {
                this.f18798H.f17768a.mo12168c();
            } catch (Exception unused) {
            }
        }
        if (!(this.f18798H == null || this.f18798H.f17769b == null)) {
            try {
                this.f18798H.f17769b.destroy();
            } catch (Exception unused2) {
            }
        }
        this.f18798H = this.f18841n.mo20760a((Context) this, false);
    }

    public boolean onSearchRequested() {
        if (this.f18841n.f18080q == 0) {
            return false;
        }
        this.f18842o = true;
        this.f18813W = true;
        return super.onSearchRequested();
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getWindow().setFormat(1);
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("es_root", this.f18845r);
    }

    public void onStop() {
        super.onStop();
        if (this.f18842o && !this.f18813W) {
            finish();
        }
    }

    public void onPause() {
        if (this.f18827aj != null) {
            try {
                this.f18827aj.cancel(true);
            } catch (Exception unused) {
            }
        }
        if (!(this.f18841n.f18013cx == 0 || this.f18798H == null || this.f18798H.f17768a == null)) {
            this.f18798H.f17768a.mo12167b();
        }
        super.onPause();
    }

    public void onResume() {
        super.onResume();
        config.m23860m(this);
        if (this.f18816Z != null && this.f18816Z.size() > 0) {
            this.f18827aj = new C5796c();
            this.f18827aj.execute(new String[0]);
        }
        if (this.f18841n.f18013cx != 0 && this.f18798H != null && this.f18798H.f17768a != null) {
            this.f18798H.f17768a.mo12165a();
        }
    }

    public void onDestroy() {
        if (!(this.f18841n.f18013cx == 0 || this.f18798H == null || this.f18798H.f17768a == null)) {
            this.f18798H.f17768a.mo12168c();
        }
        if (!(this.f18841n.f18013cx == 0 || this.f18798H == null || this.f18798H.f17769b == null)) {
            this.f18798H.f17769b.destroy();
        }
        if ((this.f18845r && isFinishing()) || config.f17841i) {
            config.m23861n(this);
        }
        super.onDestroy();
    }

    public void onBackPressed() {
        if (!this.f18845r || this.f18844q || !this.f18841n.f18059ea) {
            super.onBackPressed();
            return;
        }
        this.f18844q = true;
        config.m23859l(this);
    }

    public void adLoaded(String str) {
        this.f18815Y.cancel();
        this.f18809S.showAd();
    }

    public void onAdClosed() {
        if (this.f18812V) {
            abrir_secc(this.f18814X);
        }
    }

    public void adError(String str) {
        this.f18815Y.cancel();
        abrir_secc(this.f18814X);
    }

    public void videoEnded() {
        this.f18812V = true;
        config.m23867t(this);
    }

    /* renamed from: z_ */
    public void mo9678z_() {
        this.f18815Y.cancel();
        this.f18808R.mo12836a();
    }

    /* renamed from: a */
    public void mo9675a(C3165a aVar) {
        this.f18812V = true;
        config.m23867t(this);
    }

    /* renamed from: A_ */
    public void mo9671A_() {
        if (this.f18812V) {
            abrir_secc(this.f18814X);
        }
    }

    /* renamed from: e */
    public void mo9676e() {
        this.f18812V = false;
    }

    /* renamed from: a */
    public void mo9674a(int i) {
        if (!this.f18841n.mo20775a((Context) this, this.f18809S)) {
            this.f18815Y.cancel();
            abrir_secc(this.f18814X);
        }
    }

    public void onError(C1514Ad ad, AdError adError) {
        this.f18815Y.cancel();
        abrir_secc(this.f18814X);
    }

    public void onAdLoaded(C1514Ad ad) {
        this.f18815Y.cancel();
        this.f18810T.show();
    }

    public void onRewardedVideoCompleted() {
        this.f18812V = true;
        config.m23867t(this);
    }

    public void onRewardedVideoClosed() {
        if (this.f18812V) {
            abrir_secc(this.f18814X);
        }
    }

    public void onVideoCompleted() {
        this.f18812V = true;
        config.m23867t(this);
    }

    public void onReceiveAd(C5286Ad ad) {
        this.f18815Y.cancel();
        this.f18811U.showAd("REWARDED VIDEO", new AdDisplayListener() {
            public void adClicked(C5286Ad ad) {
            }

            public void adDisplayed(C5286Ad ad) {
            }

            public void adNotDisplayed(C5286Ad ad) {
            }

            public void adHidden(C5286Ad ad) {
                if (t_buscvideos.this.f18812V) {
                    t_buscvideos.this.abrir_secc(t_buscvideos.this.f18814X);
                }
            }
        });
    }

    public void onFailedToReceiveAd(C5286Ad ad) {
        this.f18815Y.cancel();
        abrir_secc(this.f18814X);
    }
}
