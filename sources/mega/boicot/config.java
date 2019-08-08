package mega.boicot;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.app.Application;
import android.app.DownloadManager;
import android.app.DownloadManager.Request;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnShowListener;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.SharedPreferences.OnSharedPreferenceChangeListener;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.AssetManager;
import android.content.res.ColorStateList;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader.TileMode;
import android.graphics.Typeface;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Environment;
import android.provider.DocumentsContract;
import android.provider.MediaStore.Images.Media;
import android.support.multidex.C0192a;
import android.support.p017v4.app.C0236a;
import android.telephony.TelephonyManager;
import android.text.Html;
import android.text.method.ScrollingMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.webkit.MimeTypeMap;
import android.webkit.URLUtil;
import android.widget.AbsListView.LayoutParams;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.appnext.ads.fullscreen.RewardedVideo;
import com.appnext.ads.interstitial.Interstitial;
import com.appnext.base.p046b.C1245d;
import com.appnext.core.AppnextError;
import com.appnext.core.callbacks.OnAdClosed;
import com.appnext.core.callbacks.OnAdError;
import com.appnext.core.callbacks.OnAdLoaded;
import com.appnext.core.callbacks.OnVideoEnded;
import com.appnext.nativeads.AdLoader;
import com.appnext.nativeads.NativeAd;
import com.appnext.nativeads.NativeAdListener;
import com.appnext.nativeads.NativeAdRequest;
import com.facebook.ads.AdError;
import com.facebook.ads.AdSize;
import com.facebook.ads.C1514Ad;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.InterstitialAdListener;
import com.google.android.exoplayer2.C2793C;
import com.google.android.exoplayer2.extractor.MpegAudioHeader;
import com.google.android.exoplayer2.source.hls.DefaultHlsExtractorFactory;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.C2960a;
import com.google.android.gms.ads.C2971c.C2972a;
import com.google.android.gms.ads.C2973d;
import com.google.android.gms.ads.C2979f;
import com.startapp.android.publish.ads.banner.Banner;
import com.startapp.android.publish.adsCommon.C5286Ad;
import com.startapp.android.publish.adsCommon.StartAppAd;
import com.startapp.android.publish.adsCommon.adListeners.AdEventListener;
import com.startapp.android.publish.common.model.AdPreferences;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Field;
import java.net.URLDecoder;
import java.text.Normalizer;
import java.text.Normalizer.Form;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.TimeZone;
import org.apache.p199a.p202b.p204b.C6274e;
import org.apache.p199a.p202b.p204b.C6276g;
import org.apache.p199a.p215e.p216a.C6367d;
import org.apache.p199a.p215e.p216a.C6370g;
import org.apache.p199a.p218f.p220b.C6409h;
import org.apache.p199a.p227i.C6529b;
import org.apache.p199a.p227i.C6530c;
import org.apache.p199a.p227i.C6531d;

public class config extends Application implements OnSharedPreferenceChangeListener {

    /* renamed from: a */
    public static final int f17813a = Color.parseColor("#212121");

    /* renamed from: b */
    public static final int f17814b = Color.parseColor("#727272");

    /* renamed from: c */
    public static final int f17815c = Color.parseColor("#FFFFFF");

    /* renamed from: ck */
    static String f17816ck = null;

    /* renamed from: cl */
    static String f17817cl = null;

    /* renamed from: cm */
    static String f17818cm = null;

    /* renamed from: cn */
    static String f17819cn = null;

    /* renamed from: co */
    static String f17820co = null;

    /* renamed from: cp */
    static String f17821cp = null;

    /* renamed from: cq */
    static Boolean f17822cq = null;

    /* renamed from: cr */
    static Boolean f17823cr = null;

    /* renamed from: d */
    public static final int f17824d = Color.parseColor("#FAFAFA");

    /* renamed from: dd */
    static C2979f f17825dd = null;

    /* renamed from: de */
    static Interstitial f17826de = null;

    /* renamed from: df */
    static InterstitialAd f17827df = null;

    /* renamed from: dg */
    static StartAppAd f17828dg = null;

    /* renamed from: dh */
    static int f17829dh = 0;

    /* renamed from: di */
    static int f17830di = 0;

    /* renamed from: dj */
    static int f17831dj = 0;

    /* renamed from: dk */
    static int f17832dk = 0;

    /* renamed from: dl */
    static boolean f17833dl = false;

    /* renamed from: e */
    public static final int f17834e = Color.parseColor("#9E9E9E");

    /* renamed from: em */
    static Typeface f17835em = null;

    /* renamed from: en */
    static Typeface f17836en = null;

    /* renamed from: eo */
    static Typeface f17837eo = null;

    /* renamed from: f */
    public static final int f17838f = Color.parseColor("#757575");

    /* renamed from: g */
    public static final String f17839g = m23854e();

    /* renamed from: h */
    static int f17840h = 1;

    /* renamed from: i */
    static boolean f17841i = false;

    /* renamed from: A */
    int f17842A;

    /* renamed from: B */
    int f17843B = -1;

    /* renamed from: C */
    int f17844C = -1;

    /* renamed from: D */
    int f17845D;

    /* renamed from: E */
    int f17846E;

    /* renamed from: F */
    int f17847F;

    /* renamed from: G */
    int f17848G;

    /* renamed from: H */
    int f17849H;

    /* renamed from: I */
    int f17850I;

    /* renamed from: J */
    int f17851J;

    /* renamed from: K */
    String f17852K;

    /* renamed from: L */
    boolean f17853L;

    /* renamed from: M */
    int f17854M;

    /* renamed from: N */
    int f17855N;

    /* renamed from: O */
    String f17856O;

    /* renamed from: P */
    boolean f17857P;

    /* renamed from: Q */
    int f17858Q;

    /* renamed from: R */
    int f17859R;

    /* renamed from: S */
    String f17860S;

    /* renamed from: T */
    boolean f17861T;

    /* renamed from: U */
    int f17862U;

    /* renamed from: V */
    int f17863V;

    /* renamed from: W */
    String f17864W;

    /* renamed from: X */
    boolean f17865X;

    /* renamed from: Y */
    int f17866Y;

    /* renamed from: Z */
    int f17867Z;

    /* renamed from: aA */
    String f17868aA;

    /* renamed from: aB */
    String f17869aB;

    /* renamed from: aC */
    String f17870aC;

    /* renamed from: aD */
    String f17871aD;

    /* renamed from: aE */
    String f17872aE;

    /* renamed from: aF */
    boolean f17873aF;

    /* renamed from: aG */
    boolean f17874aG;

    /* renamed from: aH */
    boolean f17875aH;

    /* renamed from: aI */
    boolean f17876aI;

    /* renamed from: aJ */
    boolean f17877aJ;

    /* renamed from: aK */
    boolean f17878aK;

    /* renamed from: aL */
    String f17879aL;

    /* renamed from: aM */
    String f17880aM;

    /* renamed from: aN */
    String f17881aN;

    /* renamed from: aO */
    String f17882aO;

    /* renamed from: aP */
    String f17883aP;

    /* renamed from: aQ */
    String f17884aQ;

    /* renamed from: aR */
    String f17885aR;

    /* renamed from: aS */
    String f17886aS;

    /* renamed from: aT */
    String f17887aT;

    /* renamed from: aU */
    String f17888aU;

    /* renamed from: aV */
    String f17889aV;

    /* renamed from: aW */
    String f17890aW;

    /* renamed from: aX */
    String f17891aX;

    /* renamed from: aY */
    String f17892aY;

    /* renamed from: aZ */
    String f17893aZ;

    /* renamed from: aa */
    String f17894aa;

    /* renamed from: ab */
    boolean f17895ab;

    /* renamed from: ac */
    int f17896ac;

    /* renamed from: ad */
    int f17897ad;

    /* renamed from: ae */
    String f17898ae;

    /* renamed from: af */
    boolean f17899af;

    /* renamed from: ag */
    int f17900ag;

    /* renamed from: ah */
    int f17901ah;

    /* renamed from: ai */
    String f17902ai;

    /* renamed from: aj */
    boolean f17903aj;

    /* renamed from: ak */
    int f17904ak;

    /* renamed from: al */
    int f17905al;

    /* renamed from: am */
    int f17906am;

    /* renamed from: an */
    String f17907an;

    /* renamed from: ao */
    boolean f17908ao;

    /* renamed from: ap */
    boolean f17909ap;

    /* renamed from: aq */
    boolean f17910aq;

    /* renamed from: ar */
    boolean f17911ar;

    /* renamed from: as */
    boolean f17912as;

    /* renamed from: at */
    boolean f17913at;

    /* renamed from: au */
    boolean f17914au;

    /* renamed from: av */
    boolean f17915av;

    /* renamed from: aw */
    boolean f17916aw;

    /* renamed from: ax */
    boolean f17917ax;

    /* renamed from: ay */
    String f17918ay;

    /* renamed from: az */
    String f17919az;

    /* renamed from: bA */
    ArrayList<Integer> f17920bA;

    /* renamed from: bB */
    C5661g[] f17921bB;

    /* renamed from: bC */
    int[] f17922bC;

    /* renamed from: bD */
    int[] f17923bD;

    /* renamed from: bE */
    ListView f17924bE;

    /* renamed from: bF */
    ArrayList<C5638c> f17925bF;

    /* renamed from: bG */
    C5637a f17926bG;

    /* renamed from: bH */
    boolean f17927bH;

    /* renamed from: bI */
    boolean f17928bI;

    /* renamed from: bJ */
    boolean f17929bJ;

    /* renamed from: bK */
    boolean f17930bK;

    /* renamed from: bL */
    boolean f17931bL;

    /* renamed from: bM */
    boolean f17932bM;

    /* renamed from: bN */
    boolean f17933bN;

    /* renamed from: bO */
    int f17934bO;

    /* renamed from: bP */
    int f17935bP;

    /* renamed from: bQ */
    int f17936bQ;

    /* renamed from: bR */
    String f17937bR;

    /* renamed from: bS */
    int f17938bS;

    /* renamed from: bT */
    int f17939bT;

    /* renamed from: bU */
    int f17940bU;

    /* renamed from: bV */
    boolean f17941bV;

    /* renamed from: bW */
    boolean f17942bW;

    /* renamed from: bX */
    boolean f17943bX;

    /* renamed from: bY */
    String f17944bY;

    /* renamed from: bZ */
    String f17945bZ;

    /* renamed from: ba */
    String f17946ba;

    /* renamed from: bb */
    String f17947bb;

    /* renamed from: bc */
    String f17948bc;

    /* renamed from: bd */
    String f17949bd;

    /* renamed from: be */
    String f17950be;

    /* renamed from: bf */
    String f17951bf;

    /* renamed from: bg */
    String f17952bg;

    /* renamed from: bh */
    String f17953bh;

    /* renamed from: bi */
    String f17954bi;

    /* renamed from: bj */
    String f17955bj;

    /* renamed from: bk */
    String f17956bk;

    /* renamed from: bl */
    String f17957bl;

    /* renamed from: bm */
    String f17958bm;

    /* renamed from: bn */
    String f17959bn;

    /* renamed from: bo */
    String f17960bo;

    /* renamed from: bp */
    String f17961bp;

    /* renamed from: bq */
    String f17962bq;

    /* renamed from: br */
    String f17963br;

    /* renamed from: bs */
    String f17964bs;

    /* renamed from: bt */
    String f17965bt;

    /* renamed from: bu */
    String f17966bu;

    /* renamed from: bv */
    int f17967bv;

    /* renamed from: bw */
    boolean f17968bw;

    /* renamed from: bx */
    boolean f17969bx;

    /* renamed from: by */
    boolean f17970by;

    /* renamed from: bz */
    C5663i[] f17971bz;

    /* renamed from: cA */
    int f17972cA;

    /* renamed from: cB */
    C2973d f17973cB;

    /* renamed from: cC */
    String f17974cC;

    /* renamed from: cD */
    String f17975cD;

    /* renamed from: cE */
    String f17976cE;

    /* renamed from: cF */
    String f17977cF;

    /* renamed from: cG */
    String f17978cG;

    /* renamed from: cH */
    String f17979cH;

    /* renamed from: cI */
    String f17980cI;

    /* renamed from: cJ */
    String f17981cJ;

    /* renamed from: cK */
    String f17982cK;

    /* renamed from: cL */
    String f17983cL;

    /* renamed from: cM */
    String f17984cM;

    /* renamed from: cN */
    String f17985cN;

    /* renamed from: cO */
    String f17986cO;

    /* renamed from: cP */
    String f17987cP;

    /* renamed from: cQ */
    String f17988cQ;

    /* renamed from: cR */
    String f17989cR;

    /* renamed from: cS */
    int f17990cS;

    /* renamed from: cT */
    int f17991cT;

    /* renamed from: cU */
    int f17992cU;

    /* renamed from: cV */
    int f17993cV;

    /* renamed from: cW */
    int f17994cW;

    /* renamed from: cX */
    String f17995cX;

    /* renamed from: cY */
    String f17996cY;

    /* renamed from: cZ */
    String f17997cZ;

    /* renamed from: ca */
    String f17998ca;

    /* renamed from: cb */
    String f17999cb;

    /* renamed from: cc */
    String f18000cc;

    /* renamed from: cd */
    String f18001cd;

    /* renamed from: ce */
    String f18002ce;

    /* renamed from: cf */
    String f18003cf;

    /* renamed from: cg */
    String f18004cg;

    /* renamed from: ch */
    String f18005ch;

    /* renamed from: ci */
    int f18006ci;

    /* renamed from: cj */
    int f18007cj;

    /* renamed from: cs */
    String f18008cs;

    /* renamed from: ct */
    String f18009ct;

    /* renamed from: cu */
    String f18010cu;

    /* renamed from: cv */
    String f18011cv;

    /* renamed from: cw */
    String f18012cw;

    /* renamed from: cx */
    int f18013cx;

    /* renamed from: cy */
    int f18014cy;

    /* renamed from: cz */
    int f18015cz;

    /* renamed from: dA */
    boolean f18016dA;

    /* renamed from: dB */
    String f18017dB;

    /* renamed from: dC */
    String f18018dC;

    /* renamed from: dD */
    String f18019dD;

    /* renamed from: dE */
    String f18020dE;

    /* renamed from: dF */
    String f18021dF;

    /* renamed from: dG */
    String f18022dG;

    /* renamed from: dH */
    String f18023dH;

    /* renamed from: dI */
    boolean f18024dI;

    /* renamed from: dJ */
    boolean f18025dJ;

    /* renamed from: dK */
    String f18026dK;

    /* renamed from: dL */
    String f18027dL;

    /* renamed from: dM */
    String f18028dM;

    /* renamed from: dN */
    String f18029dN;

    /* renamed from: dO */
    int f18030dO;

    /* renamed from: dP */
    int f18031dP;

    /* renamed from: dQ */
    boolean f18032dQ;

    /* renamed from: dR */
    boolean f18033dR;

    /* renamed from: dS */
    boolean f18034dS;

    /* renamed from: dT */
    String f18035dT;

    /* renamed from: dU */
    String f18036dU;

    /* renamed from: dV */
    int f18037dV;

    /* renamed from: dW */
    boolean f18038dW;

    /* renamed from: dX */
    boolean f18039dX;

    /* renamed from: dY */
    boolean f18040dY;

    /* renamed from: dZ */
    int f18041dZ;

    /* renamed from: da */
    String f18042da;

    /* renamed from: db */
    String f18043db;

    /* renamed from: dc */
    boolean f18044dc;

    /* renamed from: dm */
    int f18045dm;

    /* renamed from: dn */
    int f18046dn;

    /* renamed from: do */
    int f18047do;

    /* renamed from: dp */
    int f18048dp;

    /* renamed from: dq */
    int f18049dq;

    /* renamed from: dr */
    boolean f18050dr;

    /* renamed from: ds */
    boolean f18051ds;

    /* renamed from: dt */
    boolean f18052dt;

    /* renamed from: du */
    boolean f18053du;

    /* renamed from: dv */
    boolean f18054dv;

    /* renamed from: dw */
    boolean f18055dw;

    /* renamed from: dx */
    boolean f18056dx;

    /* renamed from: dy */
    int f18057dy;

    /* renamed from: dz */
    boolean f18058dz;

    /* renamed from: ea */
    boolean f18059ea;

    /* renamed from: eb */
    boolean f18060eb;

    /* renamed from: ec */
    boolean f18061ec;

    /* renamed from: ed */
    int f18062ed;

    /* renamed from: ee */
    int f18063ee;

    /* renamed from: ef */
    boolean f18064ef;

    /* renamed from: eg */
    int f18065eg;

    /* renamed from: eh */
    int f18066eh;

    /* renamed from: ei */
    boolean f18067ei;

    /* renamed from: ej */
    String f18068ej;

    /* renamed from: ek */
    String f18069ek;

    /* renamed from: el */
    String f18070el;

    /* renamed from: ep */
    boolean f18071ep = false;

    /* renamed from: eq */
    ArrayList<NativeAd> f18072eq;

    /* renamed from: j */
    View f18073j;

    /* renamed from: k */
    int f18074k = -1;

    /* renamed from: l */
    int f18075l = -1;

    /* renamed from: m */
    boolean f18076m;

    /* renamed from: n */
    int f18077n;

    /* renamed from: o */
    int f18078o;

    /* renamed from: p */
    int f18079p;

    /* renamed from: q */
    int f18080q;

    /* renamed from: r */
    int f18081r;

    /* renamed from: s */
    int f18082s;

    /* renamed from: t */
    int f18083t;

    /* renamed from: u */
    int f18084u;

    /* renamed from: v */
    int f18085v;

    /* renamed from: w */
    int f18086w;

    /* renamed from: x */
    int f18087x;

    /* renamed from: y */
    int f18088y;

    /* renamed from: z */
    int f18089z;

    /* renamed from: mega.boicot.config$a */
    public class C5637a extends ArrayAdapter<C5638c> {

        /* renamed from: b */
        private List<C5638c> f18123b;

        /* renamed from: c */
        private Context f18124c;

        public C5637a(List<C5638c> list, Context context) {
            super(context, R.layout.drawer_list_item, list);
            this.f18123b = list;
            this.f18124c = context;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            C5639b bVar = new C5639b();
            if (view == null) {
                view = ((LayoutInflater) this.f18124c.getSystemService("layout_inflater")).inflate(R.layout.drawer_list_item, null);
                TextView textView = (TextView) view.findViewById(R.id.texto);
                ImageView imageView = (ImageView) view.findViewById(R.id.img);
                ProgressBar progressBar = (ProgressBar) view.findViewById(R.id.pb_img);
                bVar.f18130a = view.findViewById(R.id.marcador);
                bVar.f18131b = textView;
                bVar.f18132c = imageView;
                bVar.f18133d = progressBar;
                if (config.this.f18086w == 0) {
                    bVar.f18130a.getLayoutParams().width = 1;
                    bVar.f18130a.setBackgroundColor(0);
                } else if (config.this.f18074k == 900) {
                    bVar.f18130a.setBackgroundColor(0);
                }
                if (!config.this.f17970by) {
                    bVar.f18132c.setVisibility(8);
                }
                view.setTag(R.id.TAG_IDHOLDER, bVar);
            } else {
                bVar = (C5639b) view.getTag(R.id.TAG_IDHOLDER);
            }
            C5638c cVar = (C5638c) this.f18123b.get(i);
            if (cVar.f18128d) {
                view.setTag(R.id.TAG_ESPRIVACY, "1");
            } else {
                view.setTag(R.id.TAG_ESPRIVACY, null);
            }
            if (i >= config.this.f17922bC.length || config.this.f18074k != config.this.f17922bC[i]) {
                bVar.f18130a.setBackgroundColor(0);
                TextView textView2 = bVar.f18131b;
                StringBuilder sb = new StringBuilder();
                sb.append("#");
                sb.append(config.this.f17884aQ);
                textView2.setTextColor(Color.parseColor(sb.toString()));
            } else {
                if (config.this.f18086w > 0) {
                    View view2 = bVar.f18130a;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("#");
                    sb2.append(config.this.f17887aT);
                    view2.setBackgroundColor(Color.parseColor(sb2.toString()));
                }
                TextView textView3 = bVar.f18131b;
                StringBuilder sb3 = new StringBuilder();
                sb3.append("#");
                sb3.append(config.this.f17885aR);
                textView3.setTextColor(Color.parseColor(sb3.toString()));
            }
            bVar.f18131b.setText(cVar.f18125a);
            if (config.this.f17970by) {
                if (cVar.f18127c) {
                    bVar.f18133d.setVisibility(0);
                    bVar.f18132c.setImageDrawable(config.this.getResources().getDrawable(R.drawable.pixel500por1));
                } else {
                    bVar.f18133d.setVisibility(8);
                    if (cVar.f18126b != null) {
                        bVar.f18132c.setImageBitmap(cVar.f18126b);
                    } else {
                        bVar.f18132c.setImageDrawable(config.this.getResources().getDrawable(R.drawable.pixel500por1));
                    }
                }
            }
            return view;
        }
    }

    /* renamed from: mega.boicot.config$c */
    public class C5638c {

        /* renamed from: a */
        public String f18125a;

        /* renamed from: b */
        public Bitmap f18126b;

        /* renamed from: c */
        public boolean f18127c;

        /* renamed from: d */
        public boolean f18128d = false;

        public C5638c() {
        }
    }

    /* renamed from: mega.boicot.config$b */
    private static class C5639b {

        /* renamed from: a */
        public View f18130a;

        /* renamed from: b */
        public TextView f18131b;

        /* renamed from: c */
        public ImageView f18132c;

        /* renamed from: d */
        public ProgressBar f18133d;

        private C5639b() {
        }
    }

    /* renamed from: mega.boicot.config$d */
    public static class C5640d extends AsyncTask<String, Void, Byte> {

        /* renamed from: a */
        String f18134a;

        /* renamed from: b */
        String f18135b;

        /* renamed from: c */
        String f18136c;

        /* renamed from: d */
        Context f18137d;

        /* renamed from: e */
        ProgressDialog f18138e;

        public C5640d(Context context, String str, String str2) {
            this.f18137d = context;
            this.f18135b = str;
            this.f18136c = str2;
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x0092, code lost:
            r6.disconnect();
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x008c */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x0092  */
        /* JADX WARNING: Removed duplicated region for block: B:28:0x0098  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Byte doInBackground(java.lang.String... r6) {
            /*
                r5 = this;
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                java.lang.String r0 = "http://privacy.e-droid.net/privacy.php?desde_app=1&ida=718963&idl="
                r6.append(r0)
                java.util.Locale r0 = java.util.Locale.getDefault()
                java.lang.String r0 = r0.getLanguage()
                r6.append(r0)
                java.lang.String r6 = r6.toString()
                r0 = -1
                java.net.URL r1 = new java.net.URL     // Catch:{ MalformedURLException -> 0x009c }
                r1.<init>(r6)     // Catch:{ MalformedURLException -> 0x009c }
                r6 = 0
                java.net.URLConnection r1 = r1.openConnection()     // Catch:{ Exception -> 0x008c }
                java.net.HttpURLConnection r1 = (java.net.HttpURLConnection) r1     // Catch:{ Exception -> 0x008c }
                r6 = 1
                r1.setDoInput(r6)     // Catch:{ Exception -> 0x0086, all -> 0x0084 }
                r6 = 10000(0x2710, float:1.4013E-41)
                r1.setConnectTimeout(r6)     // Catch:{ Exception -> 0x0086, all -> 0x0084 }
                r1.setReadTimeout(r6)     // Catch:{ Exception -> 0x0086, all -> 0x0084 }
                java.lang.String r6 = "User-Agent"
                java.lang.String r2 = "Android Vinebre Software"
                r1.setRequestProperty(r6, r2)     // Catch:{ Exception -> 0x0086, all -> 0x0084 }
                java.io.InputStream r6 = r1.getInputStream()     // Catch:{ Exception -> 0x0086, all -> 0x0084 }
                java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ Exception -> 0x0086, all -> 0x0084 }
                java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x0086, all -> 0x0084 }
                r3.<init>(r6)     // Catch:{ Exception -> 0x0086, all -> 0x0084 }
                r2.<init>(r3)     // Catch:{ Exception -> 0x0086, all -> 0x0084 }
                java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0086, all -> 0x0084 }
                r6.<init>()     // Catch:{ Exception -> 0x0086, all -> 0x0084 }
            L_0x004c:
                java.lang.String r3 = r2.readLine()     // Catch:{ Exception -> 0x0086, all -> 0x0084 }
                if (r3 == 0) goto L_0x0067
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0086, all -> 0x0084 }
                r4.<init>()     // Catch:{ Exception -> 0x0086, all -> 0x0084 }
                r4.append(r3)     // Catch:{ Exception -> 0x0086, all -> 0x0084 }
                java.lang.String r3 = "\n"
                r4.append(r3)     // Catch:{ Exception -> 0x0086, all -> 0x0084 }
                java.lang.String r3 = r4.toString()     // Catch:{ Exception -> 0x0086, all -> 0x0084 }
                r6.append(r3)     // Catch:{ Exception -> 0x0086, all -> 0x0084 }
                goto L_0x004c
            L_0x0067:
                java.lang.String r6 = r6.toString()     // Catch:{ Exception -> 0x0086, all -> 0x0084 }
                r5.f18134a = r6     // Catch:{ Exception -> 0x0086, all -> 0x0084 }
                java.lang.String r6 = r5.f18134a     // Catch:{ Exception -> 0x0086, all -> 0x0084 }
                java.lang.String r2 = "@EURO@"
                java.lang.String r3 = "€"
                java.lang.String r6 = r6.replace(r2, r3)     // Catch:{ Exception -> 0x0086, all -> 0x0084 }
                r5.f18134a = r6     // Catch:{ Exception -> 0x0086, all -> 0x0084 }
                if (r1 == 0) goto L_0x007e
                r1.disconnect()
            L_0x007e:
                r6 = 0
                java.lang.Byte r6 = java.lang.Byte.valueOf(r6)
                return r6
            L_0x0084:
                r6 = move-exception
                goto L_0x0096
            L_0x0086:
                r6 = r1
                goto L_0x008c
            L_0x0088:
                r0 = move-exception
                r1 = r6
                r6 = r0
                goto L_0x0096
            L_0x008c:
                java.lang.Byte r0 = java.lang.Byte.valueOf(r0)     // Catch:{ all -> 0x0088 }
                if (r6 == 0) goto L_0x0095
                r6.disconnect()
            L_0x0095:
                return r0
            L_0x0096:
                if (r1 == 0) goto L_0x009b
                r1.disconnect()
            L_0x009b:
                throw r6
            L_0x009c:
                java.lang.Byte r6 = java.lang.Byte.valueOf(r0)
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: mega.boicot.config.C5640d.doInBackground(java.lang.String[]):java.lang.Byte");
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
            this.f18138e = new ProgressDialog(this.f18137d);
            this.f18138e.setMessage(this.f18137d.getString(R.string.cargando));
            this.f18138e.setIndeterminate(true);
            if (VERSION.SDK_INT > 20 && !this.f18135b.equals("")) {
                this.f18138e.setOnShowListener(new OnShowListener() {
                    public void onShow(DialogInterface dialogInterface) {
                        config.m23838a((ProgressBar) C5640d.this.f18138e.findViewById(16908301), C5640d.this.f18135b);
                    }
                });
            }
            this.f18138e.show();
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void onPostExecute(Byte b) {
            try {
                this.f18138e.dismiss();
            } catch (Exception unused) {
            }
            if (b.byteValue() != 0) {
                config.m23835a(this.f18137d, this.f18137d.getString(R.string.error_http_tit), this.f18137d.getString(R.string.error_http), this.f18136c);
                return;
            }
            Builder builder = new Builder(this.f18137d);
            builder.setMessage(Html.fromHtml(this.f18134a));
            builder.setCancelable(true);
            builder.setPositiveButton(this.f18137d.getString(R.string.cerrar), null);
            final AlertDialog create = builder.create();
            if (!this.f18136c.equals("")) {
                create.setOnShowListener(new OnShowListener() {
                    public void onShow(DialogInterface dialogInterface) {
                        Button button = create.getButton(-1);
                        StringBuilder sb = new StringBuilder();
                        sb.append("#");
                        sb.append(C5640d.this.f18136c);
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

    /* renamed from: mega.boicot.config$e */
    public static class C5643e extends AsyncTask<String, Void, Boolean> {

        /* renamed from: a */
        String f18142a;

        /* renamed from: b */
        String f18143b;

        C5643e(String str, String str2) {
            this.f18142a = str;
            this.f18143b = str2;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Boolean doInBackground(String... strArr) {
            try {
                C6529b bVar = new C6529b();
                C6530c.m25865c(bVar, 10000);
                C6530c.m25861a((C6531d) bVar, 20000);
                C6409h hVar = new C6409h(bVar);
                C6274e eVar = new C6274e(this.f18142a);
                eVar.mo22444a(new C6370g(C6367d.BROWSER_COMPATIBLE));
                if (this.f18143b != null) {
                    eVar.mo22909b("User-Agent", this.f18143b);
                }
                hVar.mo22459a((C6276g) eVar);
            } catch (Exception e) {
                e.printStackTrace();
            }
            return Boolean.valueOf(true);
        }
    }

    /* renamed from: mega.boicot.config$f */
    public static class C5644f extends AsyncTask<String, Void, Byte> {

        /* renamed from: a */
        String f18144a;

        /* renamed from: b */
        String f18145b;

        /* renamed from: c */
        int f18146c;

        /* renamed from: d */
        int f18147d;

        /* renamed from: e */
        int f18148e;

        C5644f(int i, String str, int i2, String str2, int i3) {
            this.f18146c = i;
            this.f18144a = str;
            this.f18147d = i2;
            this.f18145b = str2;
            this.f18148e = i3;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Byte doInBackground(String... strArr) {
            try {
                C6529b bVar = new C6529b();
                C6530c.m25865c(bVar, DefaultOggSeeker.MATCH_BYTE_RANGE);
                C6530c.m25861a((C6531d) bVar, 60000);
                C6409h hVar = new C6409h(bVar);
                StringBuilder sb = new StringBuilder();
                sb.append("http://");
                sb.append(config.f17839g);
                sb.append("/srv/modif_usuchats.php?idusu=");
                sb.append(this.f18146c);
                sb.append("&c=");
                sb.append(this.f18144a);
                sb.append("&idchat=");
                sb.append(this.f18147d);
                sb.append("&campo=");
                sb.append(this.f18145b);
                sb.append("&modo=");
                sb.append(this.f18148e);
                C6274e eVar = new C6274e(sb.toString());
                eVar.mo22444a(new C6370g(C6367d.BROWSER_COMPATIBLE));
                eVar.mo22909b("User-Agent", "Android Vinebre Software");
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(hVar.mo22459a((C6276g) eVar).mo22939b().mo22473f(), C2793C.UTF8_NAME));
                StringBuilder sb2 = new StringBuilder();
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    sb2.append(readLine);
                }
                if (sb2.indexOf("ANDROID:OK") != -1) {
                    return Byte.valueOf(1);
                }
                return Byte.valueOf(0);
            } catch (Exception unused) {
                return Byte.valueOf(0);
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void onPostExecute(Byte b) {
            b.byteValue();
        }
    }

    /* renamed from: d */
    public static boolean m23853d() {
        return true;
    }

    /* renamed from: n */
    static void m23861n(Context context) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public String mo20779b(int i) {
        return i == 2 ? "CaviarDreams.ttf" : i == 3 ? "Pacifico.ttf" : i == 4 ? "Sansation-Regular.ttf" : i == 5 ? "Walkway_Bold.ttf" : "";
    }

    public void onCreate() {
        super.onCreate();
        Thread.setDefaultUncaughtExceptionHandler(new C5659e());
    }

    /* renamed from: e */
    private static String m23854e() {
        int nextInt = new Random().nextInt(9) + 11;
        StringBuilder sb = new StringBuilder();
        sb.append("srv");
        sb.append(nextInt);
        sb.append(".e-droid.net");
        return sb.toString();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C5602c mo20760a(Context context, boolean z) {
        C5602c cVar = new C5602c();
        cVar.f17768a = null;
        cVar.f17769b = null;
        cVar.f17770c = null;
        this.f18071ep = false;
        if (this.f18013cx != 0 && !z) {
            ArrayList arrayList = new ArrayList();
            if (!this.f18009ct.equals("")) {
                arrayList.add(Integer.valueOf(1));
            }
            if (!this.f18008cs.equals("") && this.f18072eq != null && this.f18072eq.size() > 0 && (this.f18009ct.equals("") || !f17833dl)) {
                arrayList.add(Integer.valueOf(2));
            }
            if (!this.f18011cv.equals("")) {
                arrayList.add(Integer.valueOf(3));
            }
            if (!this.f18012cw.equals("")) {
                arrayList.add(Integer.valueOf(4));
            }
            int intValue = !arrayList.isEmpty() ? ((Integer) arrayList.get(new Random().nextInt(((arrayList.size() - 1) - 0) + 1) + 0)).intValue() : 0;
            if (intValue == 1) {
                cVar.f17768a = new AdView(context);
                C2973d dVar = this.f17973cB;
                if (this.f17973cB == C2973d.f8693c && getResources().getConfiguration().orientation == 2) {
                    dVar = C2973d.f8697g;
                }
                cVar.f17768a.setAdSize(dVar);
                cVar.f17768a.setAdUnitId(this.f18009ct);
                if (this.f18013cx == 1) {
                    cVar.f17768a.setTag(Integer.valueOf(R.id.TAG_ESBANNER));
                    ((LinearLayout) this.f18073j).addView(cVar.f17768a);
                } else {
                    Activity activity = (Activity) context;
                    ((LinearLayout) activity.findViewById(R.id.ll_ad)).addView(cVar.f17768a);
                    ((LinearLayout) activity.findViewById(R.id.ll_ad)).setVisibility(0);
                }
                this.f18071ep = true;
                cVar.f17768a.setAdListener(new C2960a() {
                    /* renamed from: a */
                    public void mo9641a(int i) {
                        if (!config.this.f18008cs.equals("") && config.this.f18072eq != null && config.this.f18072eq.size() > 0) {
                            try {
                                if (config.this.f18013cx == 1) {
                                    View findViewWithTag = config.this.f18073j.findViewWithTag(Integer.valueOf(R.id.TAG_ESBANNER));
                                    if (findViewWithTag != null) {
                                        ((LinearLayout) config.this.f18073j).removeView(findViewWithTag);
                                    }
                                } else {
                                    ((LinearLayout) config.this.f18073j.getRootView().findViewById(R.id.ll_ad)).removeAllViews();
                                }
                                config.this.mo20764a(config.this.f18073j.getContext());
                            } catch (Exception unused) {
                            }
                        }
                    }
                });
                cVar.f17768a.mo12166a(new C2972a().mo12209a());
            } else if (intValue == 2) {
                mo20764a(context);
            } else if (intValue == 3) {
                if (this.f17973cB == C2973d.f8693c && getResources().getConfiguration().orientation == 1) {
                    cVar.f17769b = new com.facebook.ads.AdView(context, this.f18011cv, AdSize.BANNER_HEIGHT_90);
                } else {
                    cVar.f17769b = new com.facebook.ads.AdView(context, this.f18011cv, AdSize.BANNER_HEIGHT_50);
                }
                if (this.f18013cx == 1) {
                    cVar.f17769b.setTag(Integer.valueOf(R.id.TAG_ESBANNER));
                    ((LinearLayout) this.f18073j).addView(cVar.f17769b);
                } else {
                    Activity activity2 = (Activity) context;
                    ((LinearLayout) activity2.findViewById(R.id.ll_ad)).addView(cVar.f17769b);
                    ((LinearLayout) activity2.findViewById(R.id.ll_ad)).setVisibility(0);
                }
                this.f18071ep = true;
                cVar.f17769b.loadAd();
            } else if (intValue == 4) {
                cVar.f17770c = new Banner(context);
                cVar.f17770c.setAdTag(AdPreferences.TYPE_BANNER);
                if (this.f18013cx == 1) {
                    cVar.f17770c.setTag(Integer.valueOf(R.id.TAG_ESBANNER));
                    ((LinearLayout) this.f18073j).addView(cVar.f17770c);
                } else {
                    Activity activity3 = (Activity) context;
                    ((LinearLayout) activity3.findViewById(R.id.ll_ad)).addView(cVar.f17770c);
                    activity3.findViewById(R.id.ll_ad).setVisibility(0);
                }
                this.f18071ep = true;
            }
        }
        return cVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo20763a() {
        String str = "";
        if (this.f18008cs != null && !this.f18008cs.equals("")) {
            str = this.f18008cs;
        } else if (this.f17978cG != null && !this.f17978cG.equals("")) {
            str = this.f17978cG;
        } else if (this.f17980cI != null && !this.f17980cI.equals("")) {
            str = this.f17980cI;
        } else if (this.f18044dc && this.f17997cZ != null && !this.f17997cZ.equals("")) {
            str = this.f17997cZ;
        } else if (this.f17995cX != null && !this.f17995cX.equals("")) {
            str = this.f17995cX;
        }
        if (!str.equals("")) {
            this.f18072eq = new ArrayList<>();
            AdLoader.load(this, str, new NativeAdRequest(), new NativeAdListener() {
                public void onAdLoaded(NativeAd nativeAd) {
                    super.onAdLoaded(nativeAd);
                    config.this.f18072eq.add(nativeAd);
                }

                public void onError(NativeAd nativeAd, AppnextError appnextError) {
                    super.onError(nativeAd, appnextError);
                }
            }, 4);
        }
    }

    /* access modifiers changed from: protected */
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        C0192a.m455a((Context) this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo20764a(Context context) {
        mo20765a(context, 1, 1, -1, null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo20765a(Context context, int i, int i2, int i3, String str) {
        mo20766a(context, i, i2, i3, str, false);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:125:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0144  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x015f  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x01f2  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x022d  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0267  */
    @android.annotation.TargetApi(13)
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo20766a(android.content.Context r18, int r19, int r20, int r21, java.lang.String r22, boolean r23) {
        /*
            r17 = this;
            r0 = r17
            r1 = r19
            r2 = r20
            r3 = r22
            java.util.ArrayList<com.appnext.nativeads.NativeAd> r5 = r0.f18072eq
            if (r5 == 0) goto L_0x03b9
            java.util.ArrayList<com.appnext.nativeads.NativeAd> r5 = r0.f18072eq
            int r5 = r5.size()
            if (r5 <= 0) goto L_0x03b9
            r5 = r18
            android.app.Activity r5 = (android.app.Activity) r5
            android.view.WindowManager r6 = r5.getWindowManager()
            android.view.Display r6 = r6.getDefaultDisplay()
            int r7 = android.os.Build.VERSION.SDK_INT
            r8 = 13
            if (r7 < r8) goto L_0x0031
            android.graphics.Point r7 = new android.graphics.Point
            r7.<init>()
            r6.getSize(r7)
            int r6 = r7.x
            goto L_0x0035
        L_0x0031:
            int r6 = r6.getWidth()
        L_0x0035:
            r7 = -1
            r8 = 1
            r9 = 0
            r10 = r21
            if (r10 != r7) goto L_0x004f
            java.util.Random r10 = new java.util.Random
            r10.<init>()
            java.util.ArrayList<com.appnext.nativeads.NativeAd> r11 = r0.f18072eq
            int r11 = r11.size()
            int r11 = r11 - r8
            int r11 = r11 - r9
            int r11 = r11 + r8
            int r10 = r10.nextInt(r11)
            int r10 = r10 + r9
        L_0x004f:
            java.lang.String r11 = "layout_inflater"
            java.lang.Object r11 = r0.getSystemService(r11)
            android.view.LayoutInflater r11 = (android.view.LayoutInflater) r11
            r12 = 0
            r13 = 3
            if (r1 != r8) goto L_0x0071
            if (r2 != r13) goto L_0x0067
            r14 = 2131361822(0x7f0a001e, float:1.8343407E38)
            android.view.View r11 = r11.inflate(r14, r12)
            com.appnext.nativeads.NativeAdView r11 = (com.appnext.nativeads.NativeAdView) r11
            goto L_0x007a
        L_0x0067:
            r14 = 2131361820(0x7f0a001c, float:1.8343403E38)
            android.view.View r11 = r11.inflate(r14, r12)
            com.appnext.nativeads.NativeAdView r11 = (com.appnext.nativeads.NativeAdView) r11
            goto L_0x007a
        L_0x0071:
            r14 = 2131361821(0x7f0a001d, float:1.8343405E38)
            android.view.View r11 = r11.inflate(r14, r12)
            com.appnext.nativeads.NativeAdView r11 = (com.appnext.nativeads.NativeAdView) r11
        L_0x007a:
            int r12 = android.os.Build.VERSION.SDK_INT
            r14 = 20
            if (r12 <= r14) goto L_0x00cb
            r12 = 2131230781(0x7f08003d, float:1.8077624E38)
            if (r1 != r8) goto L_0x0093
            if (r2 == r13) goto L_0x00cb
            android.view.View r3 = r11.findViewById(r12)
            android.widget.ProgressBar r3 = (android.widget.ProgressBar) r3
            java.lang.String r12 = "757575"
            m23838a(r3, r12)
            goto L_0x00cb
        L_0x0093:
            if (r3 == 0) goto L_0x00cb
            java.lang.String r14 = ""
            boolean r14 = r3.equals(r14)
            if (r14 != 0) goto L_0x00cb
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r15 = "#"
            r14.append(r15)
            r14.append(r3)
            java.lang.String r3 = r14.toString()
            boolean r3 = m23844a(r3)
            if (r3 == 0) goto L_0x00c0
            android.view.View r3 = r11.findViewById(r12)
            android.widget.ProgressBar r3 = (android.widget.ProgressBar) r3
            java.lang.String r12 = "FBFBFB"
            m23838a(r3, r12)
            goto L_0x00cb
        L_0x00c0:
            android.view.View r3 = r11.findViewById(r12)
            android.widget.ProgressBar r3 = (android.widget.ProgressBar) r3
            java.lang.String r12 = "727272"
            m23838a(r3, r12)
        L_0x00cb:
            java.util.ArrayList<com.appnext.nativeads.NativeAd> r3 = r0.f18072eq
            java.lang.Object r3 = r3.get(r10)
            com.appnext.nativeads.NativeAd r3 = (com.appnext.nativeads.NativeAd) r3
            android.graphics.Typeface r10 = android.graphics.Typeface.defaultFromStyle(r9)
            r12 = 2131230782(0x7f08003e, float:1.8077626E38)
            android.view.View r12 = r11.findViewById(r12)
            android.widget.TextView r12 = (android.widget.TextView) r12
            java.lang.String r14 = r3.getAdTitle()
            r12.setText(r14)
            r14 = 2
            r15 = 2131230778(0x7f08003a, float:1.8077618E38)
            if (r1 != r8) goto L_0x0226
            r12.setTypeface(r10, r8)
            android.view.View r12 = r11.findViewById(r15)
            android.widget.TextView r12 = (android.widget.TextView) r12
            r12.setTypeface(r10)
            android.view.View r10 = r11.findViewById(r15)
            android.widget.TextView r10 = (android.widget.TextView) r10
            java.lang.String r12 = r3.getAdDescription()
            r10.setText(r12)
            int r10 = android.os.Build.VERSION.SDK_INT
            r12 = 17
            r7 = 4
            if (r10 < r12) goto L_0x0121
            android.content.res.Resources r10 = r17.getResources()
            r12 = 2130968579(0x7f040003, float:1.7545816E38)
            boolean r10 = r10.getBoolean(r12)
            if (r10 == 0) goto L_0x0121
            android.view.View r10 = r11.findViewById(r15)
            r10.setTextDirection(r7)
        L_0x0121:
            java.lang.String r10 = r3.getStoreRating()
            if (r10 == 0) goto L_0x022b
            int r12 = r10.length()
            if (r12 != r13) goto L_0x022b
            java.lang.String r12 = r10.substring(r9, r8)     // Catch:{ Exception -> 0x013e }
            int r12 = java.lang.Integer.parseInt(r12)     // Catch:{ Exception -> 0x013e }
            java.lang.String r10 = r10.substring(r14, r13)     // Catch:{ Exception -> 0x013f }
            int r10 = java.lang.Integer.parseInt(r10)     // Catch:{ Exception -> 0x013f }
            goto L_0x0140
        L_0x013e:
            r12 = r9
        L_0x013f:
            r10 = r9
        L_0x0140:
            if (r10 >= r13) goto L_0x0144
        L_0x0142:
            r10 = r9
            goto L_0x014b
        L_0x0144:
            r15 = 7
            if (r10 <= r15) goto L_0x014a
            int r12 = r12 + 1
            goto L_0x0142
        L_0x014a:
            r10 = 5
        L_0x014b:
            if (r12 <= 0) goto L_0x022b
            r15 = 6
            if (r12 >= r15) goto L_0x022b
            r15 = 2131231365(0x7f080285, float:1.8078809E38)
            android.view.View r15 = r11.findViewById(r15)
            r15.setVisibility(r9)
            r15 = 2131231378(0x7f080292, float:1.8078835E38)
            if (r12 <= r8) goto L_0x01f2
            r8 = 2131231368(0x7f080288, float:1.8078815E38)
            android.view.View r8 = r11.findViewById(r8)
            r8.setVisibility(r9)
            if (r12 <= r14) goto L_0x01c7
            r8 = 2131231371(0x7f08028b, float:1.8078821E38)
            android.view.View r8 = r11.findViewById(r8)
            r8.setVisibility(r9)
            if (r12 <= r13) goto L_0x01a7
            r8 = 2131231374(0x7f08028e, float:1.8078827E38)
            android.view.View r8 = r11.findViewById(r8)
            r8.setVisibility(r9)
            if (r12 <= r7) goto L_0x018f
            r7 = 2131231377(0x7f080291, float:1.8078833E38)
            android.view.View r7 = r11.findViewById(r7)
            r7.setVisibility(r9)
            goto L_0x022b
        L_0x018f:
            r7 = 5
            if (r10 != r7) goto L_0x019e
            r7 = 2131231379(0x7f080293, float:1.8078837E38)
            android.view.View r7 = r11.findViewById(r7)
            r7.setVisibility(r9)
            goto L_0x022b
        L_0x019e:
            android.view.View r7 = r11.findViewById(r15)
            r7.setVisibility(r9)
            goto L_0x022b
        L_0x01a7:
            r7 = 5
            if (r10 != r7) goto L_0x01b5
            r7 = 2131231376(0x7f080290, float:1.8078831E38)
            android.view.View r7 = r11.findViewById(r7)
            r7.setVisibility(r9)
            goto L_0x01bf
        L_0x01b5:
            r7 = 2131231375(0x7f08028f, float:1.807883E38)
            android.view.View r7 = r11.findViewById(r7)
            r7.setVisibility(r9)
        L_0x01bf:
            android.view.View r7 = r11.findViewById(r15)
            r7.setVisibility(r9)
            goto L_0x022b
        L_0x01c7:
            r7 = 5
            if (r10 != r7) goto L_0x01d8
            r7 = 2131231373(0x7f08028d, float:1.8078825E38)
            android.view.View r7 = r11.findViewById(r7)
            r7.setVisibility(r9)
        L_0x01d4:
            r7 = 2131231375(0x7f08028f, float:1.807883E38)
            goto L_0x01e3
        L_0x01d8:
            r7 = 2131231372(0x7f08028c, float:1.8078823E38)
            android.view.View r7 = r11.findViewById(r7)
            r7.setVisibility(r9)
            goto L_0x01d4
        L_0x01e3:
            android.view.View r7 = r11.findViewById(r7)
            r7.setVisibility(r9)
            android.view.View r7 = r11.findViewById(r15)
            r7.setVisibility(r9)
            goto L_0x022b
        L_0x01f2:
            r7 = 5
            if (r10 != r7) goto L_0x0200
            r7 = 2131231370(0x7f08028a, float:1.807882E38)
            android.view.View r7 = r11.findViewById(r7)
            r7.setVisibility(r9)
            goto L_0x020a
        L_0x0200:
            r7 = 2131231369(0x7f080289, float:1.8078817E38)
            android.view.View r7 = r11.findViewById(r7)
            r7.setVisibility(r9)
        L_0x020a:
            r7 = 2131231372(0x7f08028c, float:1.8078823E38)
            android.view.View r7 = r11.findViewById(r7)
            r7.setVisibility(r9)
            r7 = 2131231375(0x7f08028f, float:1.807883E38)
            android.view.View r7 = r11.findViewById(r7)
            r7.setVisibility(r9)
            android.view.View r7 = r11.findViewById(r15)
            r7.setVisibility(r9)
            goto L_0x022b
        L_0x0226:
            android.graphics.Typeface r7 = android.graphics.Typeface.MONOSPACE     // Catch:{ Exception -> 0x022b }
            r12.setTypeface(r7)     // Catch:{ Exception -> 0x022b }
        L_0x022b:
            if (r23 != 0) goto L_0x0249
            r7 = 2131230779(0x7f08003b, float:1.807762E38)
            android.view.View r7 = r11.findViewById(r7)
            android.widget.ImageView r7 = (android.widget.ImageView) r7
            r7.setVisibility(r9)
            r7 = 2131230779(0x7f08003b, float:1.807762E38)
            android.view.View r7 = r11.findViewById(r7)
            android.widget.ImageView r7 = (android.widget.ImageView) r7
            java.lang.String r8 = r3.getIconURL()
            r3.downloadAndDisplayImage(r7, r8)
        L_0x0249:
            r7 = 1
            if (r1 != r7) goto L_0x025c
            if (r2 != r13) goto L_0x025c
            if (r23 != 0) goto L_0x025c
            r4 = 2131230780(0x7f08003c, float:1.8077622E38)
            android.view.View r4 = r11.findViewById(r4)
            com.appnext.nativeads.MediaView r4 = (com.appnext.nativeads.MediaView) r4
            r3.setMediaView(r4)
        L_0x025c:
            mega.boicot.config$14 r4 = new mega.boicot.config$14
            r4.<init>()
            r3.setAdListener(r4)
            r4 = 1
            if (r1 != r4) goto L_0x03b9
            r1 = 2131230797(0x7f08004d, float:1.8077657E38)
            android.view.View r1 = r11.findViewById(r1)
            r7 = 8
            r1.setVisibility(r7)
            r1 = 2131230786(0x7f080042, float:1.8077635E38)
            r7 = 2131230972(0x7f0800fc, float:1.8078012E38)
            if (r2 != r4) goto L_0x030e
            int r2 = r0.f18013cx
            if (r2 != r4) goto L_0x0292
            r2 = 2131230728(0x7f080008, float:1.8077517E38)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r11.setTag(r2)
            android.view.View r2 = r0.f18073j
            android.widget.LinearLayout r2 = (android.widget.LinearLayout) r2
            r2.addView(r11)
        L_0x0290:
            r2 = 1
            goto L_0x02ab
        L_0x0292:
            r2 = 2131231154(0x7f0801b2, float:1.807838E38)
            android.view.View r2 = r5.findViewById(r2)
            android.widget.LinearLayout r2 = (android.widget.LinearLayout) r2
            r2.addView(r11)
            r2 = 2131231154(0x7f0801b2, float:1.807838E38)
            android.view.View r2 = r5.findViewById(r2)
            android.widget.LinearLayout r2 = (android.widget.LinearLayout) r2
            r2.setVisibility(r9)
            goto L_0x0290
        L_0x02ab:
            r0.f18071ep = r2
            r4 = 60
            android.content.res.Resources r5 = r17.getResources()
            android.content.res.Configuration r5 = r5.getConfiguration()
            int r5 = r5.orientation
            if (r5 != r14) goto L_0x02ca
            r4 = 45
            r5 = 2131230778(0x7f08003a, float:1.8077618E38)
            android.view.View r5 = r11.findViewById(r5)
            android.widget.TextView r5 = (android.widget.TextView) r5
            r5.setMaxLines(r2)
            goto L_0x02e0
        L_0x02ca:
            r5 = 2131230778(0x7f08003a, float:1.8077618E38)
            com.google.android.gms.ads.d r8 = r0.f17973cB
            com.google.android.gms.ads.d r9 = com.google.android.gms.ads.C2973d.f8693c
            if (r8 != r9) goto L_0x02e0
            r4 = 100
            android.view.View r5 = r11.findViewById(r5)
            android.widget.TextView r5 = (android.widget.TextView) r5
            r8 = 1098907648(0x41800000, float:16.0)
            r5.setTextSize(r2, r8)
        L_0x02e0:
            android.view.ViewGroup$LayoutParams r2 = r11.getLayoutParams()
            r2.width = r6
            android.view.ViewGroup$LayoutParams r2 = r11.getLayoutParams()
            float r4 = (float) r4
            android.content.res.Resources r5 = r17.getResources()
            android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
            float r5 = r5.density
            float r4 = r4 * r5
            r5 = 1056964608(0x3f000000, float:0.5)
            float r4 = r4 + r5
            int r4 = (int) r4
            r2.height = r4
            android.view.View r2 = r11.findViewById(r7)
            r3.registerClickableViews(r2)
            android.view.View r1 = r11.findViewById(r1)
            com.appnext.nativeads.NativeAdView r1 = (com.appnext.nativeads.NativeAdView) r1
            r3.setNativeAdView(r1)
            goto L_0x03b9
        L_0x030e:
            r4 = 2131231215(0x7f0801ef, float:1.8078505E38)
            if (r2 != r14) goto L_0x036b
            r2 = 80
            android.view.View r4 = r5.findViewById(r4)
            r4.setVisibility(r9)
            r4 = 2131231517(0x7f08031d, float:1.8079117E38)
            android.view.View r4 = r5.findViewById(r4)
            r4.setVisibility(r9)
            r4 = 2131231216(0x7f0801f0, float:1.8078507E38)
            android.view.View r4 = r5.findViewById(r4)
            android.widget.LinearLayout r4 = (android.widget.LinearLayout) r4
            r4.removeAllViews()
            r4 = 2131231216(0x7f0801f0, float:1.8078507E38)
            android.view.View r4 = r5.findViewById(r4)
            android.widget.LinearLayout r4 = (android.widget.LinearLayout) r4
            r4.addView(r11)
            android.view.ViewGroup$LayoutParams r4 = r11.getLayoutParams()
            r4.width = r6
            android.view.ViewGroup$LayoutParams r4 = r11.getLayoutParams()
            float r2 = (float) r2
            android.content.res.Resources r5 = r17.getResources()
            android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
            float r5 = r5.density
            float r2 = r2 * r5
            r5 = 1056964608(0x3f000000, float:0.5)
            float r2 = r2 + r5
            int r2 = (int) r2
            r4.height = r2
            android.view.View r2 = r11.findViewById(r7)
            r3.registerClickableViews(r2)
            android.view.View r1 = r11.findViewById(r1)
            com.appnext.nativeads.NativeAdView r1 = (com.appnext.nativeads.NativeAdView) r1
            r3.setNativeAdView(r1)
            goto L_0x03b9
        L_0x036b:
            if (r2 != r13) goto L_0x03b9
            r2 = 2131231235(0x7f080203, float:1.8078545E38)
            android.view.View r2 = r5.findViewById(r2)
            android.widget.LinearLayout r2 = (android.widget.LinearLayout) r2
            if (r2 == 0) goto L_0x0388
            int r4 = r2.getChildCount()
            r5 = 1
            int r4 = r4 - r5
            android.view.View r2 = r2.getChildAt(r4)
            android.widget.LinearLayout r2 = (android.widget.LinearLayout) r2
            r2.addView(r11)
            goto L_0x03a2
        L_0x0388:
            android.view.View r2 = r5.findViewById(r4)
            android.widget.LinearLayout r2 = (android.widget.LinearLayout) r2
            r2.addView(r11)
            android.view.View r2 = r5.findViewById(r4)
            r2.setVisibility(r9)
            r2 = 2131231163(0x7f0801bb, float:1.80784E38)
            android.view.View r2 = r5.findViewById(r2)
            r2.setVisibility(r9)
        L_0x03a2:
            android.view.ViewGroup$LayoutParams r2 = r11.getLayoutParams()
            r4 = -1
            r2.width = r4
            android.view.View r2 = r11.findViewById(r7)
            r3.registerClickableViews(r2)
            android.view.View r1 = r11.findViewById(r1)
            com.appnext.nativeads.NativeAdView r1 = (com.appnext.nativeads.NativeAdView) r1
            r3.setNativeAdView(r1)
        L_0x03b9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: mega.boicot.config.mo20766a(android.content.Context, int, int, int, java.lang.String, boolean):void");
    }

    public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if (this.f18045dm == 1 && this.f17926bG != null && str.equals("ico_cargado")) {
            this.f17926bG.notifyDataSetChanged();
        } else if (this.f18045dm == 1 && this.f17924bE != null && this.f17924bE.getHeaderViewsCount() > 0 && str.equals("slider_v_act")) {
            RelativeLayout relativeLayout = (RelativeLayout) this.f17924bE.findViewById(R.id.ll_drawer);
            ImageView imageView = (ImageView) relativeLayout.findViewById(R.id.iv_drawer);
            try {
                FileInputStream openFileInput = openFileInput("slider_header");
                Bitmap decodeFileDescriptor = BitmapFactory.decodeFileDescriptor(openFileInput.getFD());
                openFileInput.close();
                imageView.setImageBitmap(decodeFileDescriptor);
            } catch (Exception | OutOfMemoryError unused) {
            }
            if (this.f17848G > 0) {
                relativeLayout.setLayoutParams(new LayoutParams(-1, this.f17848G));
            }
            relativeLayout.findViewById(R.id.pb_drawer).setVisibility(8);
            Animation loadAnimation = AnimationUtils.loadAnimation(this, R.anim.fade);
            imageView.setVisibility(0);
            imageView.startAnimation(loadAnimation);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo20780b() {
        SharedPreferences sharedPreferences = getSharedPreferences("sh", 0);
        String[] split = sharedPreferences.getString("idseccs", "").split(",");
        String string = sharedPreferences.getString("idofics", "");
        String[] strArr = new String[0];
        if (!string.equals("")) {
            strArr = string.split(",");
        }
        mo20755a(split, strArr, (Bundle) null, (Intent) null);
        this.f18074k = sharedPreferences.getInt("ind_secc_sel", 0);
        this.f18075l = sharedPreferences.getInt("ind_secc_sel_2", 0);
        try {
            mo20783c(Integer.parseInt(sharedPreferences.getString("ft", "0")));
        } catch (Exception unused) {
        }
    }

    /* JADX WARNING: type inference failed for: r15v7 */
    /* JADX WARNING: type inference failed for: r11v13 */
    /* JADX WARNING: type inference failed for: r15v8 */
    /* JADX WARNING: type inference failed for: r11v14 */
    /* JADX WARNING: type inference failed for: r15v9 */
    /* JADX WARNING: type inference failed for: r11v15 */
    /* JADX WARNING: type inference failed for: r15v10 */
    /* JADX WARNING: type inference failed for: r11v16 */
    /* JADX WARNING: type inference failed for: r15v11 */
    /* JADX WARNING: type inference failed for: r11v17 */
    /* JADX WARNING: type inference failed for: r15v12 */
    /* JADX WARNING: type inference failed for: r5v10 */
    /* JADX WARNING: type inference failed for: r15v20, types: [int] */
    /* JADX WARNING: type inference failed for: r11v25, types: [int] */
    /* JADX WARNING: type inference failed for: r11v30 */
    /* JADX WARNING: type inference failed for: r15v21 */
    /* JADX WARNING: type inference failed for: r11v31 */
    /* JADX WARNING: type inference failed for: r11v32 */
    /* JADX WARNING: type inference failed for: r15v22 */
    /* JADX WARNING: type inference failed for: r11v33 */
    /* JADX WARNING: type inference failed for: r15v23 */
    /* JADX WARNING: type inference failed for: r15v24 */
    /* JADX WARNING: type inference failed for: r11v34 */
    /* JADX WARNING: type inference failed for: r21v0 */
    /* JADX WARNING: type inference failed for: r5v74 */
    /* JADX WARNING: type inference failed for: r15v25, types: [int] */
    /* JADX WARNING: type inference failed for: r11v36, types: [int] */
    /* JADX WARNING: type inference failed for: r5v80 */
    /* JADX WARNING: type inference failed for: r15v26 */
    /* JADX WARNING: type inference failed for: r11v38 */
    /* JADX WARNING: type inference failed for: r11v39 */
    /* JADX WARNING: type inference failed for: r15v27 */
    /* JADX WARNING: type inference failed for: r11v40 */
    /* JADX WARNING: type inference failed for: r15v28 */
    /* JADX WARNING: type inference failed for: r15v29 */
    /* JADX WARNING: type inference failed for: r11v41 */
    /* JADX WARNING: type inference failed for: r15v30, types: [int] */
    /* JADX WARNING: type inference failed for: r11v42, types: [int] */
    /* JADX WARNING: type inference failed for: r15v31 */
    /* JADX WARNING: type inference failed for: r11v43 */
    /* JADX WARNING: type inference failed for: r11v44 */
    /* JADX WARNING: type inference failed for: r15v32 */
    /* JADX WARNING: type inference failed for: r11v45 */
    /* JADX WARNING: type inference failed for: r15v33 */
    /* JADX WARNING: type inference failed for: r15v34 */
    /* JADX WARNING: type inference failed for: r11v46 */
    /* JADX WARNING: type inference failed for: r15v35, types: [int] */
    /* JADX WARNING: type inference failed for: r11v47, types: [int] */
    /* JADX WARNING: type inference failed for: r15v36 */
    /* JADX WARNING: type inference failed for: r11v48 */
    /* JADX WARNING: type inference failed for: r11v49 */
    /* JADX WARNING: type inference failed for: r15v37 */
    /* JADX WARNING: type inference failed for: r11v50 */
    /* JADX WARNING: type inference failed for: r15v38 */
    /* JADX WARNING: type inference failed for: r15v39 */
    /* JADX WARNING: type inference failed for: r11v51 */
    /* JADX WARNING: type inference failed for: r15v40, types: [int] */
    /* JADX WARNING: type inference failed for: r11v52, types: [int] */
    /* JADX WARNING: type inference failed for: r15v41 */
    /* JADX WARNING: type inference failed for: r11v53 */
    /* JADX WARNING: type inference failed for: r11v54 */
    /* JADX WARNING: type inference failed for: r15v42 */
    /* JADX WARNING: type inference failed for: r11v55 */
    /* JADX WARNING: type inference failed for: r15v43 */
    /* JADX WARNING: type inference failed for: r15v44 */
    /* JADX WARNING: type inference failed for: r11v56 */
    /* JADX WARNING: type inference failed for: r15v45, types: [int] */
    /* JADX WARNING: type inference failed for: r11v57, types: [int] */
    /* JADX WARNING: type inference failed for: r15v46 */
    /* JADX WARNING: type inference failed for: r11v58 */
    /* JADX WARNING: type inference failed for: r11v59 */
    /* JADX WARNING: type inference failed for: r15v47 */
    /* JADX WARNING: type inference failed for: r11v60 */
    /* JADX WARNING: type inference failed for: r15v48 */
    /* JADX WARNING: type inference failed for: r15v49 */
    /* JADX WARNING: type inference failed for: r11v61 */
    /* JADX WARNING: type inference failed for: r11v62 */
    /* JADX WARNING: type inference failed for: r15v50 */
    /* JADX WARNING: type inference failed for: r14v47, types: [int] */
    /* JADX WARNING: type inference failed for: r9v124, types: [int] */
    /* JADX WARNING: type inference failed for: r15v53 */
    /* JADX WARNING: type inference failed for: r11v64 */
    /* JADX WARNING: type inference failed for: r9v128 */
    /* JADX WARNING: type inference failed for: r14v49 */
    /* JADX WARNING: type inference failed for: r9v129 */
    /* JADX WARNING: type inference failed for: r14v50 */
    /* JADX WARNING: type inference failed for: r14v51 */
    /* JADX WARNING: type inference failed for: r9v131 */
    /* JADX WARNING: type inference failed for: r9v132 */
    /* JADX WARNING: type inference failed for: r14v52 */
    /* JADX WARNING: type inference failed for: r9v133 */
    /* JADX WARNING: type inference failed for: r14v53 */
    /* JADX WARNING: type inference failed for: r15v54 */
    /* JADX WARNING: type inference failed for: r15v55 */
    /* JADX WARNING: type inference failed for: r15v56 */
    /* JADX WARNING: type inference failed for: r11v71 */
    /* JADX WARNING: type inference failed for: r11v72 */
    /* JADX WARNING: type inference failed for: r15v57 */
    /* JADX WARNING: type inference failed for: r11v73 */
    /* JADX WARNING: type inference failed for: r15v58 */
    /* JADX WARNING: type inference failed for: r11v74 */
    /* JADX WARNING: type inference failed for: r15v59 */
    /* JADX WARNING: type inference failed for: r15v60 */
    /* JADX WARNING: type inference failed for: r11v75 */
    /* JADX WARNING: type inference failed for: r11v76 */
    /* JADX WARNING: type inference failed for: r15v61 */
    /* JADX WARNING: type inference failed for: r11v77 */
    /* JADX WARNING: type inference failed for: r15v62 */
    /* JADX WARNING: type inference failed for: r11v78 */
    /* JADX WARNING: type inference failed for: r15v63 */
    /* JADX WARNING: type inference failed for: r11v79 */
    /* JADX WARNING: type inference failed for: r15v64 */
    /* JADX WARNING: type inference failed for: r11v80 */
    /* JADX WARNING: type inference failed for: r11v81 */
    /* JADX WARNING: type inference failed for: r15v65 */
    /* JADX WARNING: type inference failed for: r11v82 */
    /* JADX WARNING: type inference failed for: r15v66 */
    /* JADX WARNING: type inference failed for: r11v83 */
    /* JADX WARNING: type inference failed for: r15v67 */
    /* JADX WARNING: type inference failed for: r11v84 */
    /* JADX WARNING: type inference failed for: r15v68 */
    /* JADX WARNING: type inference failed for: r11v85 */
    /* JADX WARNING: type inference failed for: r11v86 */
    /* JADX WARNING: type inference failed for: r15v69 */
    /* JADX WARNING: type inference failed for: r11v87 */
    /* JADX WARNING: type inference failed for: r15v70 */
    /* JADX WARNING: type inference failed for: r11v88 */
    /* JADX WARNING: type inference failed for: r15v71 */
    /* JADX WARNING: type inference failed for: r11v89 */
    /* JADX WARNING: type inference failed for: r15v72 */
    /* JADX WARNING: type inference failed for: r11v90 */
    /* JADX WARNING: type inference failed for: r11v91 */
    /* JADX WARNING: type inference failed for: r15v73 */
    /* JADX WARNING: type inference failed for: r11v92 */
    /* JADX WARNING: type inference failed for: r15v74 */
    /* JADX WARNING: type inference failed for: r11v93 */
    /* JADX WARNING: type inference failed for: r15v75 */
    /* JADX WARNING: type inference failed for: r11v94 */
    /* JADX WARNING: type inference failed for: r15v76 */
    /* JADX WARNING: type inference failed for: r11v95 */
    /* JADX WARNING: type inference failed for: r11v96 */
    /* JADX WARNING: type inference failed for: r15v77 */
    /* JADX WARNING: type inference failed for: r11v97 */
    /* JADX WARNING: type inference failed for: r15v78 */
    /* JADX WARNING: type inference failed for: r11v98 */
    /* JADX WARNING: type inference failed for: r11v99 */
    /* JADX WARNING: type inference failed for: r15v79 */
    /* JADX WARNING: type inference failed for: r9v135 */
    /* JADX WARNING: type inference failed for: r14v54 */
    /* JADX WARNING: type inference failed for: r9v136 */
    /* JADX WARNING: type inference failed for: r14v55 */
    /* JADX WARNING: type inference failed for: r9v137 */
    /* JADX WARNING: type inference failed for: r9v138 */
    /* JADX WARNING: type inference failed for: r14v56 */
    /* JADX WARNING: type inference failed for: r14v57 */
    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r15v12
      assigns: []
      uses: []
      mth insns count: 1101
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
    	at jadx.core.ProcessClass.process(ProcessClass.java:35)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x037e  */
    /* JADX WARNING: Removed duplicated region for block: B:355:0x0c47  */
    /* JADX WARNING: Removed duplicated region for block: B:359:0x0c63  */
    /* JADX WARNING: Unknown variable types count: 59 */
    @android.annotation.TargetApi(13)
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo20778b(android.content.Context r23) {
        /*
            r22 = this;
            r0 = r22
            r1 = r23
            r2 = r1
            android.app.Activity r2 = (android.app.Activity) r2     // Catch:{ Exception -> 0x0012 }
            android.view.Window r2 = r2.getWindow()     // Catch:{ Exception -> 0x0012 }
            r3 = 128(0x80, float:1.794E-43)
            r4 = 128(0x80, float:1.794E-43)
            r2.setFlags(r3, r4)     // Catch:{ Exception -> 0x0012 }
        L_0x0012:
            java.lang.String r2 = r0.f17881aN
            if (r2 != 0) goto L_0x0019
            r22.mo20780b()
        L_0x0019:
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 20
            if (r2 <= r3) goto L_0x0027
            r2 = r1
            android.app.Activity r2 = (android.app.Activity) r2
            java.lang.String r3 = r0.f17881aN
            m23833a(r2, r3)
        L_0x0027:
            android.content.res.Resources r2 = r22.getResources()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            float r2 = r2.density
            r3 = 1106771968(0x41f80000, float:31.0)
            float r3 = r3 * r2
            r4 = 1056964608(0x3f000000, float:0.5)
            float r3 = r3 + r4
            int r3 = (int) r3
            r5 = 1105199104(0x41e00000, float:28.0)
            float r5 = r5 * r2
            float r5 = r5 + r4
            int r5 = (int) r5
            r6 = 1111490560(0x42400000, float:48.0)
            float r6 = r6 * r2
            float r6 = r6 + r4
            int r6 = (int) r6
            r7 = 1124335616(0x43040000, float:132.0)
            float r7 = r7 * r2
            float r7 = r7 + r4
            int r7 = (int) r7
            r8 = r1
            android.app.Activity r8 = (android.app.Activity) r8
            r9 = 2131230919(0x7f0800c7, float:1.8077904E38)
            android.view.View r9 = r8.findViewById(r9)
            android.support.v4.widget.DrawerLayout r9 = (android.support.p017v4.widget.DrawerLayout) r9
            int r10 = r0.f18045dm
            r11 = 1
            if (r10 == r11) goto L_0x005d
            if (r9 == 0) goto L_0x005d
            r9.setDrawerLockMode(r11)
        L_0x005d:
            r9 = 2131231221(0x7f0801f5, float:1.8078517E38)
            android.view.View r9 = r8.findViewById(r9)
            android.widget.LinearLayout r9 = (android.widget.LinearLayout) r9
            android.view.WindowManager r10 = r8.getWindowManager()
            android.view.Display r10 = r10.getDefaultDisplay()
            int r12 = android.os.Build.VERSION.SDK_INT
            r13 = 13
            if (r12 < r13) goto L_0x007f
            android.graphics.Point r12 = new android.graphics.Point
            r12.<init>()
            r10.getSize(r12)
            int r10 = r12.x
            goto L_0x0083
        L_0x007f:
            int r10 = r10.getWidth()
        L_0x0083:
            android.view.LayoutInflater r12 = android.view.LayoutInflater.from(r23)
            android.graphics.drawable.GradientDrawable r13 = new android.graphics.drawable.GradientDrawable
            android.graphics.drawable.GradientDrawable$Orientation r14 = android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM
            r15 = 2
            int[] r4 = new int[r15]
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            java.lang.String r11 = "#"
            r15.append(r11)
            java.lang.String r11 = r0.f17881aN
            r15.append(r11)
            java.lang.String r11 = r15.toString()
            int r11 = android.graphics.Color.parseColor(r11)
            r15 = 0
            r4[r15] = r11
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r15 = "#"
            r11.append(r15)
            java.lang.String r15 = r0.f17882aO
            r11.append(r15)
            java.lang.String r11 = r11.toString()
            int r11 = android.graphics.Color.parseColor(r11)
            r15 = 1
            r4[r15] = r11
            r13.<init>(r14, r4)
            android.graphics.drawable.GradientDrawable r4 = new android.graphics.drawable.GradientDrawable
            android.graphics.drawable.GradientDrawable$Orientation r11 = android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM
            r14 = 2
            int[] r15 = new int[r14]
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            r18 = r3
            java.lang.String r3 = "#"
            r14.append(r3)
            java.lang.String r3 = r0.f17881aN
            r14.append(r3)
            java.lang.String r3 = r14.toString()
            int r3 = android.graphics.Color.parseColor(r3)
            r14 = 0
            r15[r14] = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r14 = "#"
            r3.append(r14)
            java.lang.String r14 = r0.f17882aO
            r3.append(r14)
            java.lang.String r3 = r3.toString()
            int r3 = android.graphics.Color.parseColor(r3)
            r14 = 1
            r15[r14] = r3
            r4.<init>(r11, r15)
            int r3 = r0.f18045dm
            if (r3 != r14) goto L_0x010a
            int r10 = r10 - r5
        L_0x010a:
            int r3 = r0.f18045dm
            r5 = 0
            if (r3 != 0) goto L_0x0145
            r3 = 1140457472(0x43fa0000, float:500.0)
            android.content.res.Resources r11 = r22.getResources()
            android.util.DisplayMetrics r11 = r11.getDisplayMetrics()
            float r11 = r11.density
            float r3 = r3 * r11
            r11 = 1056964608(0x3f000000, float:0.5)
            float r3 = r3 + r11
            int r3 = (int) r3
            if (r10 >= r3) goto L_0x0145
            r3 = 2131361849(0x7f0a0039, float:1.8343462E38)
            android.view.View r3 = r12.inflate(r3, r5)
            r0.f18073j = r3
            android.view.View r3 = r0.f18073j
            r11 = 2131230865(0x7f080091, float:1.8077795E38)
            android.view.View r3 = r3.findViewById(r11)
            r3.setBackgroundDrawable(r13)
            android.view.View r3 = r0.f18073j
            r11 = 2131230863(0x7f08008f, float:1.807779E38)
            android.view.View r3 = r3.findViewById(r11)
            r3.setBackgroundDrawable(r4)
            r3 = 1
            goto L_0x0154
        L_0x0145:
            r3 = 2131361848(0x7f0a0038, float:1.834346E38)
            android.view.View r3 = r12.inflate(r3, r5)
            r0.f18073j = r3
            android.view.View r3 = r0.f18073j
            r3.setBackgroundDrawable(r13)
            r3 = 0
        L_0x0154:
            android.view.View r4 = r0.f18073j
            r11 = 0
            r9.addView(r4, r11)
            android.view.View r4 = r0.f18073j
            r9 = 2131230998(0x7f080116, float:1.8078065E38)
            android.view.View r4 = r4.findViewById(r9)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r11 = "#"
            r9.append(r11)
            java.lang.String r11 = r0.f17886aS
            r9.append(r11)
            java.lang.String r9 = r9.toString()
            int r9 = android.graphics.Color.parseColor(r9)
            r4.setBackgroundColor(r9)
            r4 = 4
            int[] r9 = new int[r4]
            r0.f17923bD = r9
            int r9 = r0.f18082s
            r19 = 2131231000(0x7f080118, float:1.8078069E38)
            r11 = 3
            r13 = 2131230733(0x7f08000d, float:1.8077527E38)
            if (r9 <= 0) goto L_0x022c
            mega.boicot.g[] r9 = r0.f17921bB
            int r9 = r9.length
            if (r9 > 0) goto L_0x0196
            int r9 = r0.f17867Z
            if (r9 <= 0) goto L_0x022c
        L_0x0196:
            int r9 = r0.f18082s
            r14 = 1
            if (r9 != r14) goto L_0x01a1
            r9 = r19
            r14 = 2131231005(0x7f08011d, float:1.8078079E38)
            goto L_0x01c6
        L_0x01a1:
            int r9 = r0.f18082s
            r14 = 2
            if (r9 != r14) goto L_0x01ad
            r9 = 2131231001(0x7f080119, float:1.807807E38)
            r14 = 2131231006(0x7f08011e, float:1.807808E38)
            goto L_0x01c6
        L_0x01ad:
            int r9 = r0.f18082s
            if (r9 != r11) goto L_0x01b9
            r9 = 2131231007(0x7f08011f, float:1.8078083E38)
            r14 = r9
            r9 = 2131231002(0x7f08011a, float:1.8078073E38)
            goto L_0x01c6
        L_0x01b9:
            int r9 = r0.f18082s
            if (r9 != r4) goto L_0x01c4
            r9 = 2131231003(0x7f08011b, float:1.8078075E38)
            r14 = 2131231008(0x7f080120, float:1.8078085E38)
            goto L_0x01c6
        L_0x01c4:
            r9 = 0
            r14 = 0
        L_0x01c6:
            android.view.View r20 = r8.findViewById(r9)
            r15 = r20
            android.widget.ImageView r15 = (android.widget.ImageView) r15
            boolean r5 = r0.f17865X
            if (r5 == 0) goto L_0x01d8
            java.lang.String r5 = "ico_ofics"
            r0.mo20776a(r5, r15)
            goto L_0x0202
        L_0x01d8:
            android.content.res.Resources r5 = r8.getResources()
            r4 = 2131165394(0x7f0700d2, float:1.7945004E38)
            android.graphics.drawable.Drawable r4 = r5.getDrawable(r4)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r11 = "#"
            r5.append(r11)
            java.lang.String r11 = r0.f17891aX
            r5.append(r11)
            java.lang.String r5 = r5.toString()
            int r5 = android.graphics.Color.parseColor(r5)
            android.graphics.PorterDuff$Mode r11 = android.graphics.PorterDuff.Mode.MULTIPLY
            r4.setColorFilter(r5, r11)
            r15.setImageDrawable(r4)
        L_0x0202:
            int r4 = r0.f18082s
            int r4 = r4 + 10000
            r15.setId(r4)
            int r4 = r0.f18082s
            int r4 = r4 + 10000
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r15.setTag(r13, r4)
            int[] r4 = r0.f17923bD
            int r5 = r0.f18082s
            int r5 = r5 + 10000
            r11 = 0
            r4[r11] = r5
            android.view.View r4 = r8.findViewById(r14)
            r4.setVisibility(r11)
            if (r3 != 0) goto L_0x0227
            int r10 = r10 - r6
        L_0x0227:
            r15 = r9
            r11 = r14
            r4 = 1
            r5 = 1
            goto L_0x0230
        L_0x022c:
            r4 = 0
            r5 = 0
            r11 = 0
            r15 = 0
        L_0x0230:
            int r9 = r0.f18079p
            if (r9 <= 0) goto L_0x02c7
            int r5 = r0.f18079p
            r9 = 1
            if (r5 != r9) goto L_0x023f
            r15 = r19
            r11 = 2131231005(0x7f08011d, float:1.8078079E38)
            goto L_0x0262
        L_0x023f:
            int r5 = r0.f18079p
            r9 = 2
            if (r5 != r9) goto L_0x024b
            r11 = 2131231006(0x7f08011e, float:1.807808E38)
            r15 = 2131231001(0x7f080119, float:1.807807E38)
            goto L_0x0262
        L_0x024b:
            int r5 = r0.f18079p
            r9 = 3
            if (r5 != r9) goto L_0x0257
            r11 = 2131231007(0x7f08011f, float:1.8078083E38)
            r15 = 2131231002(0x7f08011a, float:1.8078073E38)
            goto L_0x0262
        L_0x0257:
            int r5 = r0.f18079p
            r9 = 4
            if (r5 != r9) goto L_0x0262
            r15 = 2131231003(0x7f08011b, float:1.8078075E38)
            r11 = 2131231008(0x7f080120, float:1.8078085E38)
        L_0x0262:
            android.view.View r5 = r8.findViewById(r15)
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            boolean r9 = r0.f17853L
            if (r9 == 0) goto L_0x0272
            java.lang.String r9 = "ico_share"
            r0.mo20776a(r9, r5)
            goto L_0x029c
        L_0x0272:
            android.content.res.Resources r9 = r8.getResources()
            r14 = 2131165386(0x7f0700ca, float:1.7944988E38)
            android.graphics.drawable.Drawable r9 = r9.getDrawable(r14)
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r13 = "#"
            r14.append(r13)
            java.lang.String r13 = r0.f17891aX
            r14.append(r13)
            java.lang.String r13 = r14.toString()
            int r13 = android.graphics.Color.parseColor(r13)
            android.graphics.PorterDuff$Mode r14 = android.graphics.PorterDuff.Mode.MULTIPLY
            r9.setColorFilter(r13, r14)
            r5.setImageDrawable(r9)
        L_0x029c:
            int r9 = r0.f18079p
            int r9 = r9 + 10000
            r5.setId(r9)
            int r9 = r0.f18079p
            int r9 = r9 + 10000
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r13 = 2131230733(0x7f08000d, float:1.8077527E38)
            r5.setTag(r13, r9)
            int[] r5 = r0.f17923bD
            int r9 = r0.f18079p
            int r9 = r9 + 10000
            r5[r4] = r9
            int r4 = r4 + 1
            android.view.View r5 = r8.findViewById(r11)
            r9 = 0
            r5.setVisibility(r9)
            if (r3 != 0) goto L_0x02c6
            int r10 = r10 - r6
        L_0x02c6:
            r5 = 1
        L_0x02c7:
            int r9 = r0.f18080q
            if (r9 <= 0) goto L_0x035e
            int r5 = r0.f18080q
            r9 = 1
            if (r5 != r9) goto L_0x02d6
            r15 = r19
            r11 = 2131231005(0x7f08011d, float:1.8078079E38)
            goto L_0x02f9
        L_0x02d6:
            int r5 = r0.f18080q
            r9 = 2
            if (r5 != r9) goto L_0x02e2
            r11 = 2131231006(0x7f08011e, float:1.807808E38)
            r15 = 2131231001(0x7f080119, float:1.807807E38)
            goto L_0x02f9
        L_0x02e2:
            int r5 = r0.f18080q
            r9 = 3
            if (r5 != r9) goto L_0x02ee
            r11 = 2131231007(0x7f08011f, float:1.8078083E38)
            r15 = 2131231002(0x7f08011a, float:1.8078073E38)
            goto L_0x02f9
        L_0x02ee:
            int r5 = r0.f18080q
            r9 = 4
            if (r5 != r9) goto L_0x02f9
            r15 = 2131231003(0x7f08011b, float:1.8078075E38)
            r11 = 2131231008(0x7f080120, float:1.8078085E38)
        L_0x02f9:
            android.view.View r5 = r8.findViewById(r15)
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            boolean r9 = r0.f17857P
            if (r9 == 0) goto L_0x0309
            java.lang.String r9 = "ico_search"
            r0.mo20776a(r9, r5)
            goto L_0x0333
        L_0x0309:
            android.content.res.Resources r9 = r8.getResources()
            r13 = 2131165331(0x7f070093, float:1.7944876E38)
            android.graphics.drawable.Drawable r9 = r9.getDrawable(r13)
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r14 = "#"
            r13.append(r14)
            java.lang.String r14 = r0.f17891aX
            r13.append(r14)
            java.lang.String r13 = r13.toString()
            int r13 = android.graphics.Color.parseColor(r13)
            android.graphics.PorterDuff$Mode r14 = android.graphics.PorterDuff.Mode.MULTIPLY
            r9.setColorFilter(r13, r14)
            r5.setImageDrawable(r9)
        L_0x0333:
            int r9 = r0.f18080q
            int r9 = r9 + 10000
            r5.setId(r9)
            int r9 = r0.f18080q
            int r9 = r9 + 10000
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r13 = 2131230733(0x7f08000d, float:1.8077527E38)
            r5.setTag(r13, r9)
            int[] r5 = r0.f17923bD
            int r9 = r0.f18080q
            int r9 = r9 + 10000
            r5[r4] = r9
            int r4 = r4 + 1
            android.view.View r5 = r8.findViewById(r11)
            r9 = 0
            r5.setVisibility(r9)
            if (r3 != 0) goto L_0x035d
            int r10 = r10 - r6
        L_0x035d:
            r5 = 1
        L_0x035e:
            int r9 = r0.f18081r
            if (r9 <= 0) goto L_0x0411
            int r9 = r0.f17863V
            if (r9 <= 0) goto L_0x0368
        L_0x0366:
            r9 = 1
            goto L_0x037c
        L_0x0368:
            r9 = 0
        L_0x0369:
            mega.boicot.i[] r13 = r0.f17971bz
            int r13 = r13.length
            if (r9 >= r13) goto L_0x037b
            mega.boicot.i[] r13 = r0.f17971bz
            r13 = r13[r9]
            int r13 = r13.f18325r
            r14 = 5
            if (r13 != r14) goto L_0x0378
            goto L_0x0366
        L_0x0378:
            int r9 = r9 + 1
            goto L_0x0369
        L_0x037b:
            r9 = 0
        L_0x037c:
            if (r9 == 0) goto L_0x0411
            int r5 = r0.f18081r
            r9 = 1
            if (r5 != r9) goto L_0x0389
            r15 = r19
            r11 = 2131231005(0x7f08011d, float:1.8078079E38)
            goto L_0x03ac
        L_0x0389:
            int r5 = r0.f18081r
            r9 = 2
            if (r5 != r9) goto L_0x0395
            r11 = 2131231006(0x7f08011e, float:1.807808E38)
            r15 = 2131231001(0x7f080119, float:1.807807E38)
            goto L_0x03ac
        L_0x0395:
            int r5 = r0.f18081r
            r9 = 3
            if (r5 != r9) goto L_0x03a1
            r11 = 2131231007(0x7f08011f, float:1.8078083E38)
            r15 = 2131231002(0x7f08011a, float:1.8078073E38)
            goto L_0x03ac
        L_0x03a1:
            int r5 = r0.f18081r
            r9 = 4
            if (r5 != r9) goto L_0x03ac
            r15 = 2131231003(0x7f08011b, float:1.8078075E38)
            r11 = 2131231008(0x7f080120, float:1.8078085E38)
        L_0x03ac:
            android.view.View r5 = r8.findViewById(r15)
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            boolean r9 = r0.f17861T
            if (r9 == 0) goto L_0x03bc
            java.lang.String r9 = "ico_busc"
            r0.mo20776a(r9, r5)
            goto L_0x03e6
        L_0x03bc:
            android.content.res.Resources r9 = r8.getResources()
            r13 = 2131165331(0x7f070093, float:1.7944876E38)
            android.graphics.drawable.Drawable r9 = r9.getDrawable(r13)
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r14 = "#"
            r13.append(r14)
            java.lang.String r14 = r0.f17891aX
            r13.append(r14)
            java.lang.String r13 = r13.toString()
            int r13 = android.graphics.Color.parseColor(r13)
            android.graphics.PorterDuff$Mode r14 = android.graphics.PorterDuff.Mode.MULTIPLY
            r9.setColorFilter(r13, r14)
            r5.setImageDrawable(r9)
        L_0x03e6:
            int r9 = r0.f18081r
            int r9 = r9 + 10000
            r5.setId(r9)
            int r9 = r0.f18081r
            int r9 = r9 + 10000
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r13 = 2131230733(0x7f08000d, float:1.8077527E38)
            r5.setTag(r13, r9)
            int[] r5 = r0.f17923bD
            int r9 = r0.f18081r
            int r9 = r9 + 10000
            r5[r4] = r9
            int r4 = r4 + 1
            android.view.View r5 = r8.findViewById(r11)
            r9 = 0
            r5.setVisibility(r9)
            if (r3 != 0) goto L_0x0410
            int r10 = r10 - r6
        L_0x0410:
            r5 = 1
        L_0x0411:
            int r9 = r0.f18083t
            if (r9 <= 0) goto L_0x04a8
            int r5 = r0.f18083t
            r9 = 1
            if (r5 != r9) goto L_0x0420
            r15 = r19
            r11 = 2131231005(0x7f08011d, float:1.8078079E38)
            goto L_0x0443
        L_0x0420:
            int r5 = r0.f18083t
            r9 = 2
            if (r5 != r9) goto L_0x042c
            r11 = 2131231006(0x7f08011e, float:1.807808E38)
            r15 = 2131231001(0x7f080119, float:1.807807E38)
            goto L_0x0443
        L_0x042c:
            int r5 = r0.f18083t
            r9 = 3
            if (r5 != r9) goto L_0x0438
            r11 = 2131231007(0x7f08011f, float:1.8078083E38)
            r15 = 2131231002(0x7f08011a, float:1.8078073E38)
            goto L_0x0443
        L_0x0438:
            int r5 = r0.f18083t
            r9 = 4
            if (r5 != r9) goto L_0x0443
            r15 = 2131231003(0x7f08011b, float:1.8078075E38)
            r11 = 2131231008(0x7f080120, float:1.8078085E38)
        L_0x0443:
            android.view.View r5 = r8.findViewById(r15)
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            boolean r9 = r0.f17895ab
            if (r9 == 0) goto L_0x0453
            java.lang.String r9 = "ico_exit"
            r0.mo20776a(r9, r5)
            goto L_0x047d
        L_0x0453:
            android.content.res.Resources r9 = r8.getResources()
            r13 = 2131165526(0x7f070156, float:1.7945272E38)
            android.graphics.drawable.Drawable r9 = r9.getDrawable(r13)
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r14 = "#"
            r13.append(r14)
            java.lang.String r14 = r0.f17891aX
            r13.append(r14)
            java.lang.String r13 = r13.toString()
            int r13 = android.graphics.Color.parseColor(r13)
            android.graphics.PorterDuff$Mode r14 = android.graphics.PorterDuff.Mode.MULTIPLY
            r9.setColorFilter(r13, r14)
            r5.setImageDrawable(r9)
        L_0x047d:
            int r9 = r0.f18083t
            int r9 = r9 + 10000
            r5.setId(r9)
            int r9 = r0.f18083t
            int r9 = r9 + 10000
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r13 = 2131230733(0x7f08000d, float:1.8077527E38)
            r5.setTag(r13, r9)
            int[] r5 = r0.f17923bD
            int r9 = r0.f18083t
            int r9 = r9 + 10000
            r5[r4] = r9
            int r4 = r4 + 1
            android.view.View r5 = r8.findViewById(r11)
            r9 = 0
            r5.setVisibility(r9)
            if (r3 != 0) goto L_0x04a7
            int r10 = r10 - r6
        L_0x04a7:
            r5 = 1
        L_0x04a8:
            int r9 = r0.f18084u
            if (r9 <= 0) goto L_0x0544
            int r5 = r0.f18084u
            r9 = 1
            if (r5 != r9) goto L_0x04b7
            r15 = r19
            r11 = 2131231005(0x7f08011d, float:1.8078079E38)
            goto L_0x04da
        L_0x04b7:
            int r5 = r0.f18084u
            r9 = 2
            if (r5 != r9) goto L_0x04c3
            r11 = 2131231006(0x7f08011e, float:1.807808E38)
            r15 = 2131231001(0x7f080119, float:1.807807E38)
            goto L_0x04da
        L_0x04c3:
            int r5 = r0.f18084u
            r9 = 3
            if (r5 != r9) goto L_0x04cf
            r11 = 2131231007(0x7f08011f, float:1.8078083E38)
            r15 = 2131231002(0x7f08011a, float:1.8078073E38)
            goto L_0x04da
        L_0x04cf:
            int r5 = r0.f18084u
            r9 = 4
            if (r5 != r9) goto L_0x04da
            r15 = 2131231003(0x7f08011b, float:1.8078075E38)
            r11 = 2131231008(0x7f080120, float:1.8078085E38)
        L_0x04da:
            android.view.View r5 = r8.findViewById(r15)
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            boolean r9 = r0.f17899af
            if (r9 == 0) goto L_0x04ea
            java.lang.String r9 = "ico_notif"
            r0.mo20776a(r9, r5)
            goto L_0x0514
        L_0x04ea:
            android.content.res.Resources r9 = r8.getResources()
            r13 = 2131165494(0x7f070136, float:1.7945207E38)
            android.graphics.drawable.Drawable r9 = r9.getDrawable(r13)
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r14 = "#"
            r13.append(r14)
            java.lang.String r14 = r0.f17891aX
            r13.append(r14)
            java.lang.String r13 = r13.toString()
            int r13 = android.graphics.Color.parseColor(r13)
            android.graphics.PorterDuff$Mode r14 = android.graphics.PorterDuff.Mode.MULTIPLY
            r9.setColorFilter(r13, r14)
            r5.setImageDrawable(r9)
        L_0x0514:
            int r9 = r0.f18084u
            int r9 = r9 + 10000
            r5.setId(r9)
            int r9 = r0.f18084u
            int r9 = r9 + 10000
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r13 = 2131230733(0x7f08000d, float:1.8077527E38)
            r5.setTag(r13, r9)
            int[] r5 = r0.f17923bD
            int r9 = r0.f18084u
            int r9 = r9 + 10000
            r5[r4] = r9
            int r4 = r4 + 1
            android.view.View r5 = r8.findViewById(r11)
            r9 = 0
            r5.setVisibility(r9)
            m23865r(r23)
            if (r3 != 0) goto L_0x0541
            int r10 = r10 - r6
        L_0x0541:
            r5 = r11
            r11 = 1
            goto L_0x0549
        L_0x0544:
            r21 = r11
            r11 = r5
            r5 = r21
        L_0x0549:
            int r9 = r0.f18085v
            if (r9 <= 0) goto L_0x05af
            int r9 = r0.f18085v
            r11 = 1
            if (r9 != r11) goto L_0x0558
            r15 = r19
            r11 = 2131231005(0x7f08011d, float:1.8078079E38)
            goto L_0x057d
        L_0x0558:
            int r9 = r0.f18085v
            r11 = 2
            if (r9 != r11) goto L_0x0564
            r11 = 2131231006(0x7f08011e, float:1.807808E38)
            r15 = 2131231001(0x7f080119, float:1.807807E38)
            goto L_0x057d
        L_0x0564:
            int r9 = r0.f18085v
            r11 = 3
            if (r9 != r11) goto L_0x0570
            r11 = 2131231007(0x7f08011f, float:1.8078083E38)
            r15 = 2131231002(0x7f08011a, float:1.8078073E38)
            goto L_0x057d
        L_0x0570:
            int r9 = r0.f18085v
            r11 = 4
            if (r9 != r11) goto L_0x057c
            r15 = 2131231003(0x7f08011b, float:1.8078075E38)
            r11 = 2131231008(0x7f080120, float:1.8078085E38)
            goto L_0x057d
        L_0x057c:
            r11 = r5
        L_0x057d:
            android.view.View r5 = r8.findViewById(r15)
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            r0.mo20768a(r1, r5)
            int r9 = r0.f18085v
            int r9 = r9 + 10000
            r5.setId(r9)
            int r9 = r0.f18085v
            int r9 = r9 + 10000
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r13 = 2131230733(0x7f08000d, float:1.8077527E38)
            r5.setTag(r13, r9)
            int[] r5 = r0.f17923bD
            int r9 = r0.f18085v
            int r9 = r9 + 10000
            r5[r4] = r9
            android.view.View r4 = r8.findViewById(r11)
            r5 = 0
            r4.setVisibility(r5)
            if (r3 != 0) goto L_0x05ae
            int r10 = r10 - r6
        L_0x05ae:
            r11 = 1
        L_0x05af:
            r4 = 2131231013(0x7f080125, float:1.8078095E38)
            android.view.View r4 = r8.findViewById(r4)
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            java.lang.String r5 = "icohome"
            int[] r5 = r0.mo20776a(r5, r4)
            r17 = 0
            r9 = r5[r17]
            if (r9 != 0) goto L_0x05cd
            r9 = 1
            r13 = r5[r9]
            if (r13 == 0) goto L_0x05ca
            goto L_0x05cd
        L_0x05ca:
            r9 = r17
            goto L_0x05ce
        L_0x05cd:
            r9 = 1
        L_0x05ce:
            r13 = 8
            if (r3 != 0) goto L_0x05ec
            r14 = r5[r17]
            float r14 = (float) r14
            float r14 = r14 * r2
            r15 = 1056964608(0x3f000000, float:0.5)
            float r14 = r14 + r15
            int r14 = (int) r14
            r16 = 1
            r5 = r5[r16]
            float r5 = (float) r5
            float r5 = r5 * r2
            float r5 = r5 + r15
            int r2 = (int) r5
            if (r2 <= r6) goto L_0x05e6
            int r14 = r14 * r6
            int r14 = r14 / r2
        L_0x05e6:
            int r2 = java.lang.Math.min(r14, r7)
            int r10 = r10 - r2
            goto L_0x0604
        L_0x05ec:
            if (r11 != 0) goto L_0x0604
            r2 = 0
            r6 = r5[r2]
            if (r6 != 0) goto L_0x0604
            r2 = 1
            r5 = r5[r2]
            if (r5 != 0) goto L_0x0604
            android.view.View r2 = r0.f18073j
            r5 = 2131230865(0x7f080091, float:1.8077795E38)
            android.view.View r2 = r2.findViewById(r5)
            r2.setVisibility(r13)
        L_0x0604:
            r2 = 0
            r0.f18077n = r2
            int r5 = r0.f18045dm
            if (r5 != 0) goto L_0x096a
            r1 = 2131230726(0x7f080006, float:1.8077513E38)
            android.view.View r1 = r8.findViewById(r1)
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            r4 = -1
        L_0x0615:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r2)
            int r2 = r5.intValue()
            mega.boicot.i[] r6 = r0.f17971bz
            int r6 = r6.length
            if (r2 >= r6) goto L_0x063a
            mega.boicot.i[] r2 = r0.f17971bz
            int r6 = r5.intValue()
            r2 = r2[r6]
            boolean r2 = r2.f18333z
            if (r2 != 0) goto L_0x0633
            int r2 = r5.intValue()
            r4 = r2
        L_0x0633:
            int r2 = r5.intValue()
            r5 = 1
            int r2 = r2 + r5
            goto L_0x0615
        L_0x063a:
            r2 = 0
            java.lang.Integer r5 = java.lang.Integer.valueOf(r2)
            r15 = r18
            r2 = 0
        L_0x0642:
            int r6 = r5.intValue()
            if (r6 > r4) goto L_0x085a
            mega.boicot.i[] r6 = r0.f17971bz
            int r7 = r5.intValue()
            r6 = r6[r7]
            boolean r6 = r6.f18333z
            if (r6 != 0) goto L_0x084c
            r6 = 2131361915(0x7f0a007b, float:1.8343596E38)
            r7 = 0
            android.view.View r6 = r12.inflate(r6, r7)
            int r7 = r5.intValue()
            if (r7 <= 0) goto L_0x0692
            boolean r7 = r0.f17968bw
            if (r7 == 0) goto L_0x0692
            r7 = 2131231420(0x7f0802bc, float:1.807892E38)
            android.view.View r7 = r6.findViewById(r7)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r14 = "#"
            r8.append(r14)
            java.lang.String r14 = r0.f17883aP
            r8.append(r14)
            java.lang.String r8 = r8.toString()
            int r8 = android.graphics.Color.parseColor(r8)
            r7.setBackgroundColor(r8)
            r7 = 2131231420(0x7f0802bc, float:1.807892E38)
            android.view.View r7 = r6.findViewById(r7)
            r8 = 0
            r7.setVisibility(r8)
        L_0x0692:
            r7 = 2131231602(0x7f080372, float:1.807929E38)
            android.view.View r7 = r6.findViewById(r7)
            android.widget.TextView r7 = (android.widget.TextView) r7
            int r8 = r5.intValue()
            int r14 = r0.f18074k
            if (r8 != r14) goto L_0x0748
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r14 = "#"
            r8.append(r14)
            java.lang.String r14 = r0.f17885aR
            r8.append(r14)
            java.lang.String r8 = r8.toString()
            int r8 = android.graphics.Color.parseColor(r8)
            r7.setTextColor(r8)
            int r8 = r0.f18086w
            if (r8 <= 0) goto L_0x0716
            int r8 = r0.f18086w
            r14 = 3
            if (r8 >= r14) goto L_0x0716
            int r8 = r0.f18086w
            r14 = 1
            if (r8 != r14) goto L_0x06d7
            android.content.res.Resources r8 = r22.getResources()
            r14 = 2131165529(0x7f070159, float:1.7945278E38)
            android.graphics.drawable.Drawable r8 = r8.getDrawable(r14)
            goto L_0x06e2
        L_0x06d7:
            android.content.res.Resources r8 = r22.getResources()
            r14 = 2131165528(0x7f070158, float:1.7945276E38)
            android.graphics.drawable.Drawable r8 = r8.getDrawable(r14)
        L_0x06e2:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r13 = "#"
            r14.append(r13)
            java.lang.String r13 = r0.f17887aT
            r14.append(r13)
            java.lang.String r13 = r14.toString()
            int r13 = android.graphics.Color.parseColor(r13)
            android.graphics.PorterDuff$Mode r14 = android.graphics.PorterDuff.Mode.MULTIPLY
            r8.setColorFilter(r13, r14)
            r13 = 2131231121(0x7f080191, float:1.8078314E38)
            android.view.View r13 = r6.findViewById(r13)
            android.widget.ImageView r13 = (android.widget.ImageView) r13
            r13.setImageDrawable(r8)
            r8 = 2131231121(0x7f080191, float:1.8078314E38)
            android.view.View r8 = r6.findViewById(r8)
            r13 = 0
            r8.setVisibility(r13)
            goto L_0x0762
        L_0x0716:
            int r8 = r0.f18086w
            r13 = 3
            if (r8 != r13) goto L_0x0762
            r8 = 2131231122(0x7f080192, float:1.8078316E38)
            android.view.View r8 = r6.findViewById(r8)
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r14 = "#"
            r13.append(r14)
            java.lang.String r14 = r0.f17887aT
            r13.append(r14)
            java.lang.String r13 = r13.toString()
            int r13 = android.graphics.Color.parseColor(r13)
            r8.setBackgroundColor(r13)
            r8 = 2131231122(0x7f080192, float:1.8078316E38)
            android.view.View r8 = r6.findViewById(r8)
            r13 = 0
            r8.setVisibility(r13)
            goto L_0x0762
        L_0x0748:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r13 = "#"
            r8.append(r13)
            java.lang.String r13 = r0.f17884aQ
            r8.append(r13)
            java.lang.String r8 = r8.toString()
            int r8 = android.graphics.Color.parseColor(r8)
            r7.setTextColor(r8)
        L_0x0762:
            mega.boicot.i[] r8 = r0.f17971bz
            int r13 = r5.intValue()
            r8 = r8[r13]
            java.lang.String r8 = r8.f18256a
            r7.setText(r8)
            r1.addView(r6)
            r8 = 0
            r6.measure(r8, r8)
            int r8 = r5.intValue()
            if (r8 != r4) goto L_0x077d
            r15 = 0
        L_0x077d:
            int r8 = r0.f18077n
            if (r8 != 0) goto L_0x07a7
        L_0x0781:
            int r8 = r6.getMeasuredWidth()
            int r8 = r8 + r2
            int r8 = r8 + r15
            if (r8 <= r10) goto L_0x07a7
            java.lang.CharSequence r8 = r7.getText()
            java.lang.CharSequence r13 = r7.getText()
            int r13 = r13.length()
            r14 = 1
            int r13 = r13 - r14
            r14 = 0
            java.lang.CharSequence r8 = r8.subSequence(r14, r13)
            java.lang.String r8 = r8.toString()
            r7.setText(r8)
            r6.measure(r14, r14)
            goto L_0x0781
        L_0x07a7:
            int r8 = r6.getMeasuredWidth()
            int r8 = r8 + r2
            int r8 = r8 + r15
            if (r8 <= r10) goto L_0x0833
            r8 = 8
            r7.setVisibility(r8)
            r2 = 2131231121(0x7f080191, float:1.8078314E38)
            android.view.View r2 = r6.findViewById(r2)
            r2.setVisibility(r8)
            r2 = 2131231122(0x7f080192, float:1.8078316E38)
            android.view.View r2 = r6.findViewById(r2)
            r2.setVisibility(r8)
            r2 = 2131231111(0x7f080187, float:1.8078294E38)
            android.view.View r2 = r6.findViewById(r2)
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            r5 = 2131231027(0x7f080133, float:1.8078123E38)
            r2.setId(r5)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r6 = 2131230733(0x7f08000d, float:1.8077527E38)
            r2.setTag(r6, r5)
            int r5 = r0.f18087x
            r6 = 1
            if (r5 != r6) goto L_0x07f2
            android.content.res.Resources r5 = r22.getResources()
            r6 = 2131165490(0x7f070132, float:1.7945199E38)
            android.graphics.drawable.Drawable r5 = r5.getDrawable(r6)
            goto L_0x080e
        L_0x07f2:
            int r5 = r0.f18087x
            r6 = 2
            if (r5 != r6) goto L_0x0803
            android.content.res.Resources r5 = r22.getResources()
            r6 = 2131165491(0x7f070133, float:1.79452E38)
            android.graphics.drawable.Drawable r5 = r5.getDrawable(r6)
            goto L_0x080e
        L_0x0803:
            android.content.res.Resources r5 = r22.getResources()
            r6 = 2131165487(0x7f07012f, float:1.7945193E38)
            android.graphics.drawable.Drawable r5 = r5.getDrawable(r6)
        L_0x080e:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "#"
            r6.append(r7)
            java.lang.String r7 = r0.f17891aX
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            int r6 = android.graphics.Color.parseColor(r6)
            android.graphics.PorterDuff$Mode r7 = android.graphics.PorterDuff.Mode.MULTIPLY
            r5.setColorFilter(r6, r7)
            r2.setImageDrawable(r5)
            r5 = 0
            r2.setVisibility(r5)
            r2 = 1
            goto L_0x085b
        L_0x0833:
            int r8 = r5.intValue()
            r7.setId(r8)
            r8 = 2131230733(0x7f08000d, float:1.8077527E38)
            r7.setTag(r8, r5)
            int r7 = r0.f18077n
            r8 = 1
            int r7 = r7 + r8
            r0.f18077n = r7
            int r6 = r6.getMeasuredWidth()
            int r2 = r2 + r6
            goto L_0x084d
        L_0x084c:
            r8 = 1
        L_0x084d:
            int r5 = r5.intValue()
            int r5 = r5 + r8
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r13 = 8
            goto L_0x0642
        L_0x085a:
            r2 = 0
        L_0x085b:
            r5 = -1
            if (r4 != r5) goto L_0x089c
            if (r11 != 0) goto L_0x089c
            if (r9 != 0) goto L_0x089c
            if (r3 == 0) goto L_0x0880
            android.view.View r1 = r0.f18073j
            r2 = 2131230865(0x7f080091, float:1.8077795E38)
            android.view.View r1 = r1.findViewById(r2)
            r2 = 8
            r1.setVisibility(r2)
            android.view.View r1 = r0.f18073j
            r3 = 2131230863(0x7f08008f, float:1.807779E38)
            android.view.View r1 = r1.findViewById(r3)
            r1.setVisibility(r2)
            goto L_0x0c23
        L_0x0880:
            r2 = 8
            android.view.View r1 = r0.f18073j
            r3 = 2131230861(0x7f08008d, float:1.8077787E38)
            android.view.View r1 = r1.findViewById(r3)
            r1.setVisibility(r2)
            android.view.View r1 = r0.f18073j
            r3 = 2131230998(0x7f080116, float:1.8078065E38)
            android.view.View r1 = r1.findViewById(r3)
            r1.setVisibility(r2)
            goto L_0x0c23
        L_0x089c:
            boolean r3 = r0.f18061ec
            if (r3 == 0) goto L_0x0c23
            if (r2 != 0) goto L_0x0c23
            r2 = 2131361915(0x7f0a007b, float:1.8343596E38)
            r3 = 0
            android.view.View r2 = r12.inflate(r2, r3)
            boolean r3 = r0.f17968bw
            if (r3 == 0) goto L_0x08da
            r3 = 2131231420(0x7f0802bc, float:1.807892E38)
            android.view.View r3 = r2.findViewById(r3)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "#"
            r4.append(r5)
            java.lang.String r5 = r0.f17883aP
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            int r4 = android.graphics.Color.parseColor(r4)
            r3.setBackgroundColor(r4)
            r3 = 2131231420(0x7f0802bc, float:1.807892E38)
            android.view.View r3 = r2.findViewById(r3)
            r4 = 0
            r3.setVisibility(r4)
        L_0x08da:
            r3 = 2131231602(0x7f080372, float:1.807929E38)
            android.view.View r3 = r2.findViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            r1.addView(r2)
            r1 = 8
            r3.setVisibility(r1)
            r3 = 2131231121(0x7f080191, float:1.8078314E38)
            android.view.View r3 = r2.findViewById(r3)
            r3.setVisibility(r1)
            r3 = 2131231122(0x7f080192, float:1.8078316E38)
            android.view.View r3 = r2.findViewById(r3)
            r3.setVisibility(r1)
            r1 = 2131231111(0x7f080187, float:1.8078294E38)
            android.view.View r1 = r2.findViewById(r1)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r2 = 2131231027(0x7f080133, float:1.8078123E38)
            r1.setId(r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3 = 2131230733(0x7f08000d, float:1.8077527E38)
            r1.setTag(r3, r2)
            int r2 = r0.f18087x
            r3 = 1
            if (r2 != r3) goto L_0x0929
            android.content.res.Resources r2 = r22.getResources()
            r3 = 2131165490(0x7f070132, float:1.7945199E38)
            android.graphics.drawable.Drawable r2 = r2.getDrawable(r3)
            goto L_0x0945
        L_0x0929:
            int r2 = r0.f18087x
            r3 = 2
            if (r2 != r3) goto L_0x093a
            android.content.res.Resources r2 = r22.getResources()
            r3 = 2131165491(0x7f070133, float:1.79452E38)
            android.graphics.drawable.Drawable r2 = r2.getDrawable(r3)
            goto L_0x0945
        L_0x093a:
            android.content.res.Resources r2 = r22.getResources()
            r3 = 2131165487(0x7f07012f, float:1.7945193E38)
            android.graphics.drawable.Drawable r2 = r2.getDrawable(r3)
        L_0x0945:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "#"
            r3.append(r4)
            java.lang.String r4 = r0.f17891aX
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            int r3 = android.graphics.Color.parseColor(r3)
            android.graphics.PorterDuff$Mode r4 = android.graphics.PorterDuff.Mode.MULTIPLY
            r2.setColorFilter(r3, r4)
            r1.setImageDrawable(r2)
            r2 = 0
            r1.setVisibility(r2)
            goto L_0x0c23
        L_0x096a:
            int r2 = r0.f18045dm
            r3 = 1
            if (r2 != r3) goto L_0x0ba0
            r2 = 2131231066(0x7f08015a, float:1.8078203E38)
            android.view.View r2 = r8.findViewById(r2)
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            android.content.res.Resources r3 = r8.getResources()
            r5 = 2131165472(0x7f070120, float:1.7945162E38)
            android.graphics.drawable.Drawable r3 = r3.getDrawable(r5)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "#"
            r5.append(r6)
            java.lang.String r6 = r0.f17891aX
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            int r5 = android.graphics.Color.parseColor(r5)
            android.graphics.PorterDuff$Mode r6 = android.graphics.PorterDuff.Mode.MULTIPLY
            r3.setColorFilter(r5, r6)
            r2.setImageDrawable(r3)
            r3 = 0
            r2.setVisibility(r3)
            mega.boicot.config$15 r3 = new mega.boicot.config$15
            r3.<init>()
            r2.setOnClickListener(r3)
            mega.boicot.config$16 r2 = new mega.boicot.config$16
            r2.<init>()
            r4.setOnClickListener(r2)
            r2 = 2131231139(0x7f0801a3, float:1.807835E38)
            android.view.View r2 = r8.findViewById(r2)
            android.widget.ListView r2 = (android.widget.ListView) r2
            r0.f17924bE = r2
            android.widget.ListView r2 = r0.f17924bE
            r3 = 0
            r2.setCacheColorHint(r3)
            android.widget.ListView r2 = r0.f17924bE
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "#"
            r3.append(r4)
            java.lang.String r4 = r0.f18021dF
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            int r3 = android.graphics.Color.parseColor(r3)
            r2.setBackgroundColor(r3)
            int r2 = r0.f17847F
            if (r2 <= 0) goto L_0x0a90
            android.widget.ListView r2 = r0.f17924bE
            int r2 = r2.getHeaderViewsCount()
            if (r2 != 0) goto L_0x0a04
            android.view.LayoutInflater r2 = r8.getLayoutInflater()
            r3 = 2131361863(0x7f0a0047, float:1.834349E38)
            r4 = 0
            android.view.View r2 = r2.inflate(r3, r4)
            android.widget.RelativeLayout r2 = (android.widget.RelativeLayout) r2
            android.widget.ListView r3 = r0.f17924bE
            r5 = 0
            r3.addHeaderView(r2, r4, r5)
            goto L_0x0a10
        L_0x0a04:
            r5 = 0
            android.widget.ListView r2 = r0.f17924bE
            r3 = 2131231186(0x7f0801d2, float:1.8078446E38)
            android.view.View r2 = r2.findViewById(r3)
            android.widget.RelativeLayout r2 = (android.widget.RelativeLayout) r2
        L_0x0a10:
            java.lang.String r3 = "sh"
            android.content.SharedPreferences r3 = r0.getSharedPreferences(r3, r5)
            java.lang.String r4 = "slider_v_act"
            int r4 = r3.getInt(r4, r5)
            int r5 = r0.f17847F
            if (r4 != r5) goto L_0x0a5d
            r3 = 2131231066(0x7f08015a, float:1.8078203E38)
            android.view.View r3 = r2.findViewById(r3)
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            java.lang.String r4 = "slider_header"
            java.io.FileInputStream r4 = r0.openFileInput(r4)     // Catch:{ Exception | OutOfMemoryError -> 0x0a3d }
            java.io.FileDescriptor r5 = r4.getFD()     // Catch:{ Exception | OutOfMemoryError -> 0x0a3d }
            android.graphics.Bitmap r5 = android.graphics.BitmapFactory.decodeFileDescriptor(r5)     // Catch:{ Exception | OutOfMemoryError -> 0x0a3d }
            r4.close()     // Catch:{ Exception | OutOfMemoryError -> 0x0a3d }
            r3.setImageBitmap(r5)     // Catch:{ Exception | OutOfMemoryError -> 0x0a3d }
        L_0x0a3d:
            int r4 = r0.f17848G
            if (r4 <= 0) goto L_0x0a4c
            android.widget.AbsListView$LayoutParams r4 = new android.widget.AbsListView$LayoutParams
            r5 = -1
            int r6 = r0.f17848G
            r4.<init>(r5, r6)
            r2.setLayoutParams(r4)
        L_0x0a4c:
            r4 = 2131231300(0x7f080244, float:1.8078677E38)
            android.view.View r2 = r2.findViewById(r4)
            r4 = 8
            r2.setVisibility(r4)
            r4 = 0
            r3.setVisibility(r4)
            goto L_0x0a90
        L_0x0a5d:
            r4 = 0
            java.lang.String r5 = "slider_v_act"
            int r3 = r3.getInt(r5, r4)
            int r4 = r0.f17847F
            if (r3 >= r4) goto L_0x0a90
            r3 = 2131231300(0x7f080244, float:1.8078677E38)
            android.view.View r3 = r2.findViewById(r3)
            android.widget.ProgressBar r3 = (android.widget.ProgressBar) r3
            int r4 = r0.f17848G
            if (r4 <= 0) goto L_0x0a80
            android.widget.AbsListView$LayoutParams r4 = new android.widget.AbsListView$LayoutParams
            r5 = -1
            int r6 = r0.f17848G
            r4.<init>(r5, r6)
            r2.setLayoutParams(r4)
        L_0x0a80:
            r4 = 2131231066(0x7f08015a, float:1.8078203E38)
            android.view.View r2 = r2.findViewById(r4)
            r4 = 8
            r2.setVisibility(r4)
            r2 = 0
            r3.setVisibility(r2)
        L_0x0a90:
            boolean r2 = r0.f17968bw
            if (r2 == 0) goto L_0x0b0c
            r2 = 3
            int[] r2 = new int[r2]
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "#"
            r3.append(r4)
            java.lang.String r4 = r0.f17883aP
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            int r3 = android.graphics.Color.parseColor(r3)
            r4 = 0
            r2[r4] = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "#"
            r3.append(r4)
            java.lang.String r4 = r0.f17883aP
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            int r3 = android.graphics.Color.parseColor(r3)
            r4 = 1
            r2[r4] = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "#"
            r3.append(r4)
            java.lang.String r4 = r0.f18021dF
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            int r3 = android.graphics.Color.parseColor(r3)
            r4 = 2
            r2[r4] = r3
            android.content.res.Resources r3 = r22.getResources()
            r4 = 2130968579(0x7f040003, float:1.7545816E38)
            boolean r3 = r3.getBoolean(r4)
            if (r3 == 0) goto L_0x0afa
            android.graphics.drawable.GradientDrawable r3 = new android.graphics.drawable.GradientDrawable
            android.graphics.drawable.GradientDrawable$Orientation r4 = android.graphics.drawable.GradientDrawable.Orientation.RIGHT_LEFT
            r3.<init>(r4, r2)
            goto L_0x0b01
        L_0x0afa:
            android.graphics.drawable.GradientDrawable r3 = new android.graphics.drawable.GradientDrawable
            android.graphics.drawable.GradientDrawable$Orientation r4 = android.graphics.drawable.GradientDrawable.Orientation.LEFT_RIGHT
            r3.<init>(r4, r2)
        L_0x0b01:
            android.widget.ListView r2 = r0.f17924bE
            r2.setDivider(r3)
            android.widget.ListView r2 = r0.f17924bE
            r3 = 1
            r2.setDividerHeight(r3)
        L_0x0b0c:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r0.f17925bF = r2
            r2 = 0
        L_0x0b14:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            int r2 = r3.intValue()
            mega.boicot.i[] r4 = r0.f17971bz
            int r4 = r4.length
            if (r2 >= r4) goto L_0x0b70
            mega.boicot.i[] r2 = r0.f17971bz
            int r4 = r3.intValue()
            r2 = r2[r4]
            boolean r2 = r2.f18333z
            if (r2 != 0) goto L_0x0b68
            mega.boicot.config$c r2 = new mega.boicot.config$c
            r2.<init>()
            mega.boicot.i[] r4 = r0.f17971bz
            int r5 = r3.intValue()
            r4 = r4[r5]
            java.lang.String r4 = r4.f18256a
            r2.f18125a = r4
            mega.boicot.i[] r4 = r0.f17971bz
            int r5 = r3.intValue()
            r4 = r4[r5]
            boolean r4 = r4.f18264aH
            if (r4 != 0) goto L_0x0b5c
            mega.boicot.i[] r4 = r0.f17971bz
            int r5 = r3.intValue()
            r4 = r4[r5]
            android.graphics.Bitmap r4 = r4.f18263aG
            r2.f18126b = r4
            r4 = 0
            r2.f18127c = r4
            r4 = 0
            r5 = 1
            goto L_0x0b62
        L_0x0b5c:
            r4 = 0
            r2.f18126b = r4
            r5 = 1
            r2.f18127c = r5
        L_0x0b62:
            java.util.ArrayList<mega.boicot.config$c> r6 = r0.f17925bF
            r6.add(r2)
            goto L_0x0b6a
        L_0x0b68:
            r4 = 0
            r5 = 1
        L_0x0b6a:
            int r2 = r3.intValue()
            int r2 = r2 + r5
            goto L_0x0b14
        L_0x0b70:
            boolean r2 = r0.f18061ec
            if (r2 == 0) goto L_0x0b8e
            mega.boicot.config$c r2 = new mega.boicot.config$c
            r2.<init>()
            android.content.res.Resources r3 = r22.getResources()
            r4 = 2131558700(0x7f0d012c, float:1.8742723E38)
            java.lang.String r3 = r3.getString(r4)
            r2.f18125a = r3
            r3 = 1
            r2.f18128d = r3
            java.util.ArrayList<mega.boicot.config$c> r3 = r0.f17925bF
            r3.add(r2)
        L_0x0b8e:
            mega.boicot.config$a r2 = new mega.boicot.config$a
            java.util.ArrayList<mega.boicot.config$c> r3 = r0.f17925bF
            r2.<init>(r3, r1)
            r0.f17926bG = r2
            android.widget.ListView r1 = r0.f17924bE
            mega.boicot.config$a r2 = r0.f17926bG
            r1.setAdapter(r2)
            goto L_0x0c23
        L_0x0ba0:
            int r2 = r0.f18045dm
            r3 = 2
            if (r2 != r3) goto L_0x0c23
            java.lang.Class r2 = r8.getClass()
            java.lang.String r2 = r2.getSimpleName()
            java.lang.String r3 = "t_menugrid"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x0c23
            r2 = 2131231066(0x7f08015a, float:1.8078203E38)
            android.view.View r2 = r8.findViewById(r2)
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            android.content.res.Resources r3 = r22.getResources()
            r5 = 2130968579(0x7f040003, float:1.7545816E38)
            boolean r3 = r3.getBoolean(r5)
            if (r3 == 0) goto L_0x0bd7
            android.content.res.Resources r3 = r8.getResources()
            r5 = 2131165471(0x7f07011f, float:1.794516E38)
            android.graphics.drawable.Drawable r3 = r3.getDrawable(r5)
            goto L_0x0be2
        L_0x0bd7:
            android.content.res.Resources r3 = r8.getResources()
            r5 = 2131165470(0x7f07011e, float:1.7945158E38)
            android.graphics.drawable.Drawable r3 = r3.getDrawable(r5)
        L_0x0be2:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "#"
            r5.append(r6)
            java.lang.String r6 = r0.f17891aX
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            int r5 = android.graphics.Color.parseColor(r5)
            android.graphics.PorterDuff$Mode r6 = android.graphics.PorterDuff.Mode.MULTIPLY
            r3.setColorFilter(r5, r6)
            r2.setImageDrawable(r3)
            r3 = 9998(0x270e, float:1.401E-41)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r5 = 2131230733(0x7f08000d, float:1.8077527E38)
            r2.setTag(r5, r3)
            r3 = 9998(0x270e, float:1.401E-41)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4.setTag(r5, r3)
            r3 = 0
            r2.setVisibility(r3)
            android.view.View$OnClickListener r1 = (android.view.View.OnClickListener) r1
            r2.setOnClickListener(r1)
            r4.setOnClickListener(r1)
            goto L_0x0c24
        L_0x0c23:
            r3 = 0
        L_0x0c24:
            int r1 = r0.f18045dm
            r15 = 1
            if (r1 != r15) goto L_0x0c6d
            boolean r1 = r0.f17969bx
            if (r1 == 0) goto L_0x0c6d
            java.lang.String r1 = "activity"
            java.lang.Object r1 = r0.getSystemService(r1)
            android.app.ActivityManager r1 = (android.app.ActivityManager) r1
            r2 = 2147483647(0x7fffffff, float:NaN)
            java.util.List r1 = r1.getRunningServices(r2)
            java.util.Iterator r1 = r1.iterator()
            r11 = r3
        L_0x0c41:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0c61
            java.lang.Object r2 = r1.next()
            android.app.ActivityManager$RunningServiceInfo r2 = (android.app.ActivityManager.RunningServiceInfo) r2
            java.lang.Class<mega.boicot.s_cargar_icos> r3 = mega.boicot.s_cargar_icos.class
            java.lang.String r3 = r3.getName()
            android.content.ComponentName r2 = r2.service
            java.lang.String r2 = r2.getClassName()
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0c41
            r11 = r15
            goto L_0x0c41
        L_0x0c61:
            if (r11 != 0) goto L_0x0c6d
            android.content.Intent r1 = new android.content.Intent
            java.lang.Class<mega.boicot.s_cargar_icos> r2 = mega.boicot.s_cargar_icos.class
            r1.<init>(r0, r2)
            r0.startService(r1)
        L_0x0c6d:
            int r1 = r0.f18077n
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: mega.boicot.config.mo20778b(android.content.Context):int");
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x006e, code lost:
        r7 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:34:? A[ExcHandler: FileNotFoundException | IOException | OutOfMemoryError (unused java.lang.Throwable), SYNTHETIC, Splitter:B:11:0x0035] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo20768a(android.content.Context r7, android.widget.ImageView r8) {
        /*
            r6 = this;
            java.lang.String r0 = "sh"
            r1 = 0
            android.content.SharedPreferences r0 = r6.getSharedPreferences(r0, r1)
            int r2 = r6.f17906am
            r3 = 2
            if (r2 == r3) goto L_0x0095
            java.lang.String r2 = "nick"
            java.lang.String r3 = ""
            java.lang.String r0 = r0.getString(r2, r3)
            java.lang.String r2 = ""
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x0095
            r0 = 1
            java.io.File r2 = r6.mo20757a(r6, r0)
            boolean r2 = r2.exists()
            if (r2 != 0) goto L_0x0029
            goto L_0x0095
        L_0x0029:
            int r7 = r6.f17906am
            if (r7 == 0) goto L_0x0031
            int r7 = r6.f17906am
            if (r7 != r0) goto L_0x00cb
        L_0x0031:
            java.io.File r7 = r6.mo20757a(r6, r0)
            android.graphics.BitmapFactory$Options r2 = new android.graphics.BitmapFactory$Options     // Catch:{ FileNotFoundException | IOException | OutOfMemoryError -> 0x00cb }
            r2.<init>()     // Catch:{ FileNotFoundException | IOException | OutOfMemoryError -> 0x00cb }
            r2.inJustDecodeBounds = r0     // Catch:{ FileNotFoundException | IOException | OutOfMemoryError -> 0x00cb }
            java.lang.String r3 = r7.getPath()     // Catch:{ FileNotFoundException | IOException | OutOfMemoryError -> 0x00cb }
            android.graphics.BitmapFactory.decodeFile(r3, r2)     // Catch:{ FileNotFoundException | IOException | OutOfMemoryError -> 0x00cb }
            int r3 = r2.outWidth     // Catch:{ FileNotFoundException | IOException | OutOfMemoryError -> 0x00cb }
            int r3 = r2.outWidth     // Catch:{ FileNotFoundException | IOException | OutOfMemoryError -> 0x00cb }
            int r2 = r2.outHeight     // Catch:{ FileNotFoundException | IOException | OutOfMemoryError -> 0x00cb }
            r4 = 200(0xc8, float:2.8E-43)
            if (r3 > r4) goto L_0x0050
            if (r2 > r4) goto L_0x0050
            r1 = r0
        L_0x0050:
            r5 = 0
            if (r1 != 0) goto L_0x0070
            int r1 = m23824a(r3, r2, r4, r4)     // Catch:{ FileNotFoundException | IOException | OutOfMemoryError -> 0x00cb }
            float r2 = (float) r3     // Catch:{ FileNotFoundException | IOException | OutOfMemoryError -> 0x00cb }
            float r1 = (float) r1     // Catch:{ FileNotFoundException | IOException | OutOfMemoryError -> 0x00cb }
            float r2 = r2 / r1
            int r1 = java.lang.Math.round(r2)     // Catch:{ FileNotFoundException | IOException | OutOfMemoryError -> 0x00cb }
            android.graphics.BitmapFactory$Options r2 = new android.graphics.BitmapFactory$Options     // Catch:{ FileNotFoundException | IOException | OutOfMemoryError -> 0x00cb }
            r2.<init>()     // Catch:{ FileNotFoundException | IOException | OutOfMemoryError -> 0x00cb }
            r2.inSampleSize = r1     // Catch:{ FileNotFoundException | IOException | OutOfMemoryError -> 0x00cb }
            java.lang.String r7 = r7.getPath()     // Catch:{ OutOfMemoryError -> 0x006e, FileNotFoundException | IOException | OutOfMemoryError -> 0x00cb }
            android.graphics.Bitmap r7 = android.graphics.BitmapFactory.decodeFile(r7, r2)     // Catch:{ OutOfMemoryError -> 0x006e, FileNotFoundException | IOException | OutOfMemoryError -> 0x00cb }
            goto L_0x007c
        L_0x006e:
            r7 = r5
            goto L_0x007c
        L_0x0070:
            android.content.ContentResolver r1 = r6.getContentResolver()     // Catch:{ FileNotFoundException | IOException | OutOfMemoryError -> 0x00cb }
            android.net.Uri r7 = android.net.Uri.fromFile(r7)     // Catch:{ FileNotFoundException | IOException | OutOfMemoryError -> 0x00cb }
            android.graphics.Bitmap r7 = android.provider.MediaStore.Images.Media.getBitmap(r1, r7)     // Catch:{ FileNotFoundException | IOException | OutOfMemoryError -> 0x00cb }
        L_0x007c:
            int r1 = r6.f17906am     // Catch:{ FileNotFoundException | IOException | OutOfMemoryError -> 0x00cb }
            if (r1 != 0) goto L_0x0085
            android.graphics.Bitmap r7 = m23846b(r7, r0)     // Catch:{ FileNotFoundException | IOException | OutOfMemoryError -> 0x00cb }
            goto L_0x0089
        L_0x0085:
            android.graphics.Bitmap r7 = m23828a(r7, r0)     // Catch:{ FileNotFoundException | IOException | OutOfMemoryError -> 0x00cb }
        L_0x0089:
            r0 = 4
            int r0 = m23845b(r6, r0)     // Catch:{ FileNotFoundException | IOException | OutOfMemoryError -> 0x00cb }
            r8.setPadding(r0, r0, r0, r0)     // Catch:{ FileNotFoundException | IOException | OutOfMemoryError -> 0x00cb }
            r8.setImageBitmap(r7)     // Catch:{ FileNotFoundException | IOException | OutOfMemoryError -> 0x00cb }
            goto L_0x00cb
        L_0x0095:
            boolean r0 = r6.f17903aj
            if (r0 == 0) goto L_0x009f
            java.lang.String r7 = "ico_perfil"
            r6.mo20776a(r7, r8)
            goto L_0x00cb
        L_0x009f:
            android.app.Activity r7 = (android.app.Activity) r7
            android.content.res.Resources r7 = r7.getResources()
            r0 = 2131165474(0x7f070122, float:1.7945166E38)
            android.graphics.drawable.Drawable r7 = r7.getDrawable(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "#"
            r0.append(r1)
            java.lang.String r1 = r6.f17891aX
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            int r0 = android.graphics.Color.parseColor(r0)
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.MULTIPLY
            r7.setColorFilter(r0, r1)
            r8.setImageDrawable(r7)
        L_0x00cb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: mega.boicot.config.mo20768a(android.content.Context, android.widget.ImageView):void");
    }

    /* renamed from: a */
    public void mo20771a(ListView listView) {
        listView.setOnItemClickListener(new OnItemClickListener() {
            public void onItemClick(AdapterView adapterView, View view, int i, long j) {
                if (view.getTag(R.id.TAG_ESPRIVACY) != null) {
                    new C5640d(view.getContext(), config.this.f17890aW, config.m23831a(config.this.f17881aN, config.this.f17890aW)).execute(new String[0]);
                    return;
                }
                if (config.this.f17847F > 0) {
                    i--;
                }
                view.setId(config.this.f17922bC[i]);
                view.setTag(R.id.TAG_IDSECC, Integer.valueOf(config.this.f17922bC[i]));
                ((C5599a) view.getContext()).onClick(view);
            }
        });
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C5662h mo20762a(Integer num, Context context) {
        Intent intent;
        Intent intent2;
        Intent intent3;
        Intent intent4;
        Intent intent5;
        Intent intent6;
        Intent intent7;
        Intent intent8;
        Intent intent9;
        Intent intent10;
        Intent intent11;
        Intent intent12;
        Intent intent13;
        C5662h hVar = new C5662h();
        hVar.f18227b = true;
        hVar.f18228c = false;
        hVar.f18229d = false;
        if (num.intValue() < 9997) {
            C5663i iVar = this.f17971bz[num.intValue()];
            if (!iVar.f18333z) {
                this.f18074k = num.intValue();
            }
            this.f18075l = num.intValue();
            SharedPreferences sharedPreferences = getSharedPreferences("sh", 0);
            Editor edit = sharedPreferences.edit();
            edit.putInt("ind_secc_sel", this.f18074k);
            edit.putInt("ind_secc_sel_2", this.f18075l);
            edit.commit();
            StringBuilder sb = new StringBuilder();
            sb.append("chat");
            sb.append(iVar.f18330w);
            sb.append("_validado");
            boolean z = sharedPreferences.getBoolean(sb.toString(), true);
            if (iVar.f18325r == 1) {
                if (z) {
                    intent13 = new Intent(context, t_url.class);
                } else {
                    Intent intent14 = new Intent(context, t_chat_contra.class);
                    intent14.putExtra("clase", iVar.f18325r);
                    intent14.putExtra("ind", num);
                    intent13 = intent14;
                }
                intent13.putExtra("url", iVar.f18312e);
                hVar.f18226a = intent13;
                return hVar;
            } else if (iVar.f18325r == 2) {
                if (z) {
                    intent12 = new Intent(context, t_html.class);
                } else {
                    intent12 = new Intent(context, t_chat_contra.class);
                    intent12.putExtra("clase", iVar.f18325r);
                    intent12.putExtra("ind", num);
                }
                intent12.putExtra("idsecc", num);
                hVar.f18226a = intent12;
                return hVar;
            } else if (iVar.f18325r == 3) {
                if (z) {
                    intent11 = new Intent(context, t_and.class);
                } else {
                    intent11 = new Intent(context, t_chat_contra.class);
                    intent11.putExtra("clase", iVar.f18325r);
                    intent11.putExtra("ind", num);
                }
                intent11.putExtra("idsecc", num);
                hVar.f18226a = intent11;
                return hVar;
            } else if (iVar.f18325r == 4) {
                if (z) {
                    return mo20785d(context);
                }
                Intent intent15 = new Intent(context, t_chat_contra.class);
                intent15.putExtra("clase", iVar.f18325r);
                intent15.putExtra("ind", num);
                hVar.f18226a = intent15;
                return hVar;
            } else if (iVar.f18325r == 5) {
                if (z) {
                    return mo20782c(context);
                }
                Intent intent16 = new Intent(context, t_chat_contra.class);
                intent16.putExtra("clase", iVar.f18325r);
                intent16.putExtra("ind", num);
                hVar.f18226a = intent16;
                return hVar;
            } else if (iVar.f18325r == 6) {
                if (!z) {
                    intent10 = new Intent(context, t_chat_contra.class);
                    intent10.putExtra("clase", iVar.f18325r);
                } else if (iVar.f18238I == 0) {
                    intent10 = new Intent(context, t_video.class);
                } else {
                    intent10 = new Intent(context, t_video_exoplayer.class);
                }
                intent10.putExtra("url", iVar.f18312e);
                intent10.putExtra("ua", iVar.f18317j);
                intent10.putExtra("ind", num);
                hVar.f18226a = intent10;
                return hVar;
            } else if (iVar.f18325r == 7) {
                if (z) {
                    intent9 = new Intent(context, t_radio.class);
                } else {
                    intent9 = new Intent(context, t_chat_contra.class);
                    intent9.putExtra("clase", iVar.f18325r);
                }
                intent9.putExtra("ind", num);
                hVar.f18226a = intent9;
                return hVar;
            } else if (iVar.f18325r == 8) {
                if (z) {
                    intent8 = new Intent(context, t_rss.class);
                } else {
                    intent8 = new Intent(context, t_chat_contra.class);
                    intent8.putExtra("clase", iVar.f18325r);
                }
                intent8.putExtra("ind", num);
                hVar.f18226a = intent8;
                return hVar;
            } else if (iVar.f18325r == 9) {
                Intent intent17 = new Intent(context, t_chat_contra.class);
                intent17.putExtra("ind", num);
                hVar.f18226a = intent17;
                return hVar;
            } else if (iVar.f18325r == 10) {
                if (iVar.f18260aD > 0) {
                    if (z) {
                        intent6 = new Intent(context, t_buscchats_lista.class);
                    } else {
                        intent6 = new Intent(context, t_chat_contra.class);
                        intent6.putExtra("clase", iVar.f18325r);
                    }
                    intent6.putExtra("ind", num);
                    intent6.putExtra("idcat", iVar.f18259aC);
                    intent6.putExtra("idsubcat", iVar.f18260aD);
                } else {
                    if (z) {
                        intent7 = new Intent(context, t_buscchats.class);
                    } else {
                        intent7 = new Intent(context, t_chat_contra.class);
                        intent7.putExtra("clase", iVar.f18325r);
                    }
                    intent6.putExtra("ind", num);
                    intent6.putExtra("idcat", iVar.f18259aC);
                }
                hVar.f18226a = intent6;
                return hVar;
            } else if (iVar.f18325r == 11) {
                if (z) {
                    intent5 = new Intent(context, t_buscusus.class);
                } else {
                    intent5 = new Intent(context, t_chat_contra.class);
                    intent5.putExtra("clase", iVar.f18325r);
                }
                intent5.putExtra("ind", num);
                hVar.f18226a = intent5;
                return hVar;
            } else if (iVar.f18325r == 12) {
                if (z) {
                    intent4 = new Intent(context, t_submenu.class);
                } else {
                    intent4 = new Intent(context, t_chat_contra.class);
                    intent4.putExtra("clase", iVar.f18325r);
                }
                intent4.putExtra("ind", num);
                hVar.f18226a = intent4;
                return hVar;
            } else if (iVar.f18325r == 13) {
                if (z) {
                    intent3 = new Intent(context, t_gal.class);
                } else {
                    intent3 = new Intent(context, t_chat_contra.class);
                    intent3.putExtra("clase", iVar.f18325r);
                }
                intent3.putExtra("ind", num);
                hVar.f18226a = intent3;
                return hVar;
            } else if (iVar.f18325r == 14) {
                if (z) {
                    intent2 = new Intent(context, t_card.class);
                } else {
                    intent2 = new Intent(context, t_chat_contra.class);
                    intent2.putExtra("clase", iVar.f18325r);
                }
                intent2.putExtra("ind", num);
                hVar.f18226a = intent2;
                return hVar;
            } else if (iVar.f18325r != 16) {
                return hVar;
            } else {
                if (z) {
                    intent = new Intent(context, t_buscvideos.class);
                } else {
                    intent = new Intent(context, t_chat_contra.class);
                    intent.putExtra("clase", iVar.f18325r);
                }
                intent.putExtra("ind", num);
                hVar.f18226a = intent;
                return hVar;
            }
        } else {
            this.f18075l = 0;
            Editor edit2 = getSharedPreferences("sh", 0).edit();
            edit2.putInt("ind_secc_sel", this.f18074k);
            edit2.putInt("ind_secc_sel_2", this.f18075l);
            edit2.commit();
            hVar.f18226a = new Intent(context, t_chat_contra.class);
            return hVar;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C5662h mo20761a(View view, Context context) {
        C5662h hVar = new C5662h();
        hVar.f18227b = true;
        hVar.f18228c = false;
        hVar.f18229d = false;
        Integer num = (Integer) view.getTag(R.id.TAG_IDSECC);
        if (num.intValue() >= 0 && num.intValue() < this.f17971bz.length) {
            return mo20762a(num, context);
        }
        if (num.intValue() == 9998) {
            hVar.f18227b = true;
            return hVar;
        } else if (num.intValue() == R.id.idaux9999) {
            Intent intent = new Intent(context, t_menu.class);
            hVar.f18227b = false;
            hVar.f18229d = true;
            hVar.f18226a = intent;
            return hVar;
        } else {
            if (num.intValue() > 10000 && num.intValue() <= this.f17923bD.length + 10000) {
                if (num.intValue() == this.f18079p + 10000) {
                    if (this.f17855N <= 0) {
                        Intent intent2 = new Intent("android.intent.action.SEND");
                        intent2.setType("text/plain");
                        intent2.putExtra("android.intent.extra.SUBJECT", this.f17879aL);
                        intent2.putExtra("android.intent.extra.TEXT", this.f17880aM);
                        hVar.f18226a = Intent.createChooser(intent2, getString(R.string.compartir));
                        hVar.f18227b = false;
                        return hVar;
                    } else if (this.f17855N == 1) {
                        C5662h hVar2 = new C5662h();
                        hVar2.f18226a = mo20784d(this.f17856O);
                        hVar2.f18227b = false;
                        hVar2.f18228c = false;
                        hVar2.f18229d = false;
                        return hVar2;
                    } else {
                        Editor edit = getSharedPreferences("sh", 0).edit();
                        this.f18075l = this.f17920bA.indexOf(Integer.valueOf(this.f17855N));
                        this.f18074k = this.f18075l;
                        edit.putInt("ind_secc_sel_2", this.f18075l);
                        edit.putInt("ind_secc_sel", this.f18074k);
                        edit.commit();
                        return mo20762a(Integer.valueOf(this.f18074k), context);
                    }
                } else if (num.intValue() == this.f18080q + 10000) {
                    if (this.f17859R <= 0) {
                        ((Activity) context).onSearchRequested();
                        C5662h hVar3 = new C5662h();
                        hVar3.f18226a = null;
                        hVar3.f18227b = true;
                        hVar3.f18228c = false;
                        hVar3.f18229d = false;
                        return hVar3;
                    } else if (this.f17859R == 1) {
                        C5662h hVar4 = new C5662h();
                        hVar4.f18226a = mo20784d(this.f17860S);
                        hVar4.f18227b = false;
                        hVar4.f18228c = false;
                        hVar4.f18229d = false;
                        return hVar4;
                    } else {
                        Editor edit2 = getSharedPreferences("sh", 0).edit();
                        this.f18075l = this.f17920bA.indexOf(Integer.valueOf(this.f17859R));
                        this.f18074k = this.f18075l;
                        edit2.putInt("ind_secc_sel_2", this.f18075l);
                        edit2.putInt("ind_secc_sel", this.f18074k);
                        edit2.commit();
                        return mo20762a(Integer.valueOf(this.f18074k), context);
                    }
                } else if (num.intValue() == this.f18082s + 10000) {
                    Editor edit3 = getSharedPreferences("sh", 0).edit();
                    if (this.f17867Z <= 0) {
                        this.f18074k = this.f17844C;
                        edit3.putInt("ind_secc_sel", this.f18074k);
                        edit3.commit();
                        return mo20785d(context);
                    } else if (this.f17867Z == 1) {
                        C5662h hVar5 = new C5662h();
                        hVar5.f18226a = mo20784d(this.f17894aa);
                        hVar5.f18227b = false;
                        hVar5.f18228c = false;
                        hVar5.f18229d = false;
                        return hVar5;
                    } else {
                        this.f18075l = this.f17920bA.indexOf(Integer.valueOf(this.f17867Z));
                        this.f18074k = this.f18075l;
                        edit3.putInt("ind_secc_sel_2", this.f18075l);
                        edit3.putInt("ind_secc_sel", this.f18074k);
                        edit3.commit();
                        return mo20762a(Integer.valueOf(this.f18074k), context);
                    }
                } else if (num.intValue() == this.f18081r + 10000) {
                    Editor edit4 = getSharedPreferences("sh", 0).edit();
                    if (this.f17863V <= 0) {
                        this.f18074k = this.f17843B;
                        edit4.putInt("ind_secc_sel", this.f18074k);
                        edit4.commit();
                        return mo20782c(context);
                    } else if (this.f17863V == 1) {
                        C5662h hVar6 = new C5662h();
                        hVar6.f18226a = mo20784d(this.f17864W);
                        hVar6.f18227b = false;
                        hVar6.f18228c = false;
                        hVar6.f18229d = false;
                        return hVar6;
                    } else {
                        this.f18075l = this.f17920bA.indexOf(Integer.valueOf(this.f17863V));
                        this.f18074k = this.f18075l;
                        edit4.putInt("ind_secc_sel_2", this.f18075l);
                        edit4.putInt("ind_secc_sel", this.f18074k);
                        edit4.commit();
                        return mo20762a(Integer.valueOf(this.f18074k), context);
                    }
                } else if (num.intValue() == this.f18083t + 10000) {
                    if (this.f17897ad <= 0) {
                        hVar.f18227b = true;
                        hVar.f18228c = true;
                        f17841i = true;
                        return hVar;
                    } else if (this.f17897ad == 1) {
                        C5662h hVar7 = new C5662h();
                        hVar7.f18226a = mo20784d(this.f17898ae);
                        hVar7.f18227b = false;
                        hVar7.f18228c = false;
                        hVar7.f18229d = false;
                        return hVar7;
                    } else {
                        Editor edit5 = getSharedPreferences("sh", 0).edit();
                        this.f18075l = this.f17920bA.indexOf(Integer.valueOf(this.f17897ad));
                        this.f18074k = this.f18075l;
                        edit5.putInt("ind_secc_sel_2", this.f18075l);
                        edit5.putInt("ind_secc_sel", this.f18074k);
                        edit5.commit();
                        return mo20762a(Integer.valueOf(this.f18074k), context);
                    }
                } else if (num.intValue() == this.f18084u + 10000) {
                    if (this.f17901ah <= 0) {
                        Intent intent3 = new Intent(context, notifs.class);
                        hVar.f18227b = false;
                        hVar.f18229d = true;
                        hVar.f18226a = intent3;
                        return hVar;
                    } else if (this.f17901ah == 1) {
                        C5662h hVar8 = new C5662h();
                        hVar8.f18226a = mo20784d(this.f17902ai);
                        hVar8.f18227b = false;
                        hVar8.f18228c = false;
                        hVar8.f18229d = false;
                        return hVar8;
                    } else {
                        Editor edit6 = getSharedPreferences("sh", 0).edit();
                        this.f18075l = this.f17920bA.indexOf(Integer.valueOf(this.f17901ah));
                        this.f18074k = this.f18075l;
                        edit6.putInt("ind_secc_sel_2", this.f18075l);
                        edit6.putInt("ind_secc_sel", this.f18074k);
                        edit6.commit();
                        return mo20762a(Integer.valueOf(this.f18074k), context);
                    }
                } else if (num.intValue() == this.f18085v + 10000) {
                    Editor edit7 = getSharedPreferences("sh", 0).edit();
                    if (this.f17905al <= 0) {
                        Intent intent4 = new Intent(this, preperfil.class);
                        intent4.putExtra("desde_main", true);
                        intent4.putExtra("nocompletar", true);
                        if (this.f18045dm != 2) {
                            intent4.putExtra("es_root", true);
                        }
                        C5662h hVar9 = new C5662h();
                        hVar9.f18227b = false;
                        hVar9.f18229d = true;
                        hVar9.f18226a = intent4;
                        return hVar9;
                    } else if (this.f17905al == 1) {
                        C5662h hVar10 = new C5662h();
                        hVar10.f18226a = mo20784d(this.f17907an);
                        hVar10.f18227b = false;
                        hVar10.f18228c = false;
                        hVar10.f18229d = false;
                        return hVar10;
                    } else {
                        this.f18075l = this.f17920bA.indexOf(Integer.valueOf(this.f17905al));
                        this.f18074k = this.f18075l;
                        edit7.putInt("ind_secc_sel_2", this.f18075l);
                        edit7.putInt("ind_secc_sel", this.f18074k);
                        edit7.commit();
                        return mo20762a(Integer.valueOf(this.f18074k), context);
                    }
                }
            }
            return null;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public C5662h mo20782c(Context context) {
        C5662h hVar = new C5662h();
        int i = 1;
        hVar.f18227b = true;
        hVar.f18228c = false;
        Intent intent = new Intent(context, t_buscador_form.class);
        if (!this.f17908ao && !this.f17909ap && !this.f17910aq && !this.f17911ar && !this.f17912as && !this.f17913at && !this.f17914au) {
            intent = new Intent(context, t_buscador.class);
            if (this.f17918ay.indexOf("TITULO") == -1) {
                i = this.f17918ay.indexOf("PRECIO") != -1 ? 2 : 3;
            }
            intent.putExtra("orden", i);
            intent.putExtra("orden_tipo", this.f17918ay.contains("ASC"));
        }
        hVar.f18226a = intent;
        return hVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public C5662h mo20785d(Context context) {
        C5662h hVar = new C5662h();
        boolean z = true;
        hVar.f18227b = true;
        hVar.f18228c = false;
        Intent intent = new Intent(context, t_oficinas.class);
        if (this.f17921bB.length == 1) {
            if (this.f17921bB[0].f18203d.equals("") && this.f17921bB[0].f18206g.equals("") && this.f17921bB[0].f18207h.equals("") && this.f17921bB[0].f18208i.equals("") && this.f17921bB[0].f18209j.equals("") && this.f17921bB[0].f18210k.equals("") && this.f17921bB[0].f18212m <= 0 && this.f17921bB[0].f18217r == 0) {
                z = false;
            }
            if (this.f17921bB[0].f18224y && this.f17921bB[0].f18201b.equals("") && this.f17921bB[0].f18202c.equals("") && this.f17921bB[0].f18205f.equals("") && !this.f17921bB[0].f18225z && !z) {
                intent = new Intent(context, contactar.class);
                intent.putExtra("idofic", this.f17921bB[0].f18211l);
            } else if (!this.f17921bB[0].f18224y && !this.f17921bB[0].f18201b.equals("") && this.f17921bB[0].f18202c.equals("") && this.f17921bB[0].f18205f.equals("") && !this.f17921bB[0].f18225z && !z) {
                StringBuilder sb = new StringBuilder();
                sb.append("tel:");
                sb.append(this.f17921bB[0].f18201b);
                intent = new Intent("android.intent.action.DIAL", Uri.parse(sb.toString()));
                hVar.f18227b = false;
            } else if (!this.f17921bB[0].f18224y && this.f17921bB[0].f18201b.equals("") && !this.f17921bB[0].f18202c.equals("") && this.f17921bB[0].f18205f.equals("") && !this.f17921bB[0].f18225z && !z) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("tel:");
                sb2.append(this.f17921bB[0].f18202c);
                intent = new Intent("android.intent.action.DIAL", Uri.parse(sb2.toString()));
                hVar.f18227b = false;
            } else if (!this.f17921bB[0].f18224y && this.f17921bB[0].f18201b.equals("") && this.f17921bB[0].f18202c.equals("") && !this.f17921bB[0].f18205f.equals("") && !this.f17921bB[0].f18225z && !z) {
                intent = new Intent("android.intent.action.VIEW");
                intent.setData(Uri.parse(this.f17921bB[0].f18205f));
                hVar.f18227b = false;
            } else if (!this.f17921bB[0].f18224y && this.f17921bB[0].f18201b.equals("") && this.f17921bB[0].f18202c.equals("") && this.f17921bB[0].f18205f.equals("") && this.f17921bB[0].f18225z && !z) {
                intent = new Intent(context, chat.class);
            }
        }
        hVar.f18226a = intent;
        return hVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int[] mo20776a(String str, ImageView imageView) {
        int[] iArr = {0, 0};
        try {
            FileInputStream openFileInput = openFileInput(str);
            Bitmap decodeFileDescriptor = BitmapFactory.decodeFileDescriptor(openFileInput.getFD());
            openFileInput.close();
            imageView.setImageBitmap(decodeFileDescriptor);
            iArr[0] = decodeFileDescriptor.getWidth();
            iArr[1] = decodeFileDescriptor.getHeight();
        } catch (Exception e) {
            e.printStackTrace();
        } catch (OutOfMemoryError unused) {
        }
        return iArr;
    }

    /* renamed from: a */
    public static void m23840a(File file, File file2) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(file);
        FileOutputStream fileOutputStream = new FileOutputStream(file2);
        byte[] bArr = new byte[C1245d.f3947iP];
        while (true) {
            int read = fileInputStream.read(bArr);
            if (read > 0) {
                fileOutputStream.write(bArr, 0, read);
            } else {
                fileInputStream.close();
                fileOutputStream.close();
                return;
            }
        }
    }

    /* renamed from: a */
    static int m23826a(Options options, int i, int i2) {
        int i3 = options.outHeight;
        int i4 = options.outWidth;
        if (i4 <= i && i3 <= i2) {
            return 1;
        }
        return Math.round(((float) i4) / ((float) m23824a(i4, i3, i, i2)));
    }

    /* renamed from: a */
    static int m23824a(int i, int i2, int i3, int i4) {
        if (i > i3) {
            i2 = Math.round((float) ((i2 * i3) / i));
            i = i3;
        }
        return i2 > i4 ? Math.round((float) ((i * i4) / i2)) : i;
    }

    /* renamed from: a */
    public Bitmap mo20756a(Uri uri, int i, int i2) throws IOException, OutOfMemoryError {
        InputStream openInputStream = getContentResolver().openInputStream(uri);
        Options options = new Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeStream(openInputStream, null, options);
        openInputStream.close();
        options.inSampleSize = m23826a(options, i, i2);
        InputStream openInputStream2 = getContentResolver().openInputStream(uri);
        options.inJustDecodeBounds = false;
        Bitmap decodeStream = BitmapFactory.decodeStream(openInputStream2, null, options);
        openInputStream2.close();
        return decodeStream;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public File mo20757a(Context context, int i) {
        File file = new File(Environment.getExternalStorageDirectory(), context.getPackageName());
        if (!file.exists()) {
            file.mkdir();
            try {
                new File(file, ".nomedia").createNewFile();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("dt_foto");
        sb.append(i);
        sb.append("_temp.jpg");
        return new File(file, sb.toString());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public File mo20758a(Context context, int i, boolean z) {
        String str = "";
        if (z) {
            str = "_g";
        }
        File file = new File(Environment.getExternalStorageDirectory(), context.getPackageName());
        if (!file.exists()) {
            file.mkdir();
            try {
                new File(file, ".nomedia").createNewFile();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("dt_foto");
        sb.append(i);
        sb.append(str);
        sb.append(".jpg");
        return new File(file, sb.toString());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public File mo20759a(Context context, String str) {
        File file = new File(Environment.getExternalStorageDirectory(), context.getPackageName());
        if (!file.exists()) {
            file.mkdir();
            try {
                new File(file, ".nomedia").createNewFile();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return new File(file, str);
    }

    /* renamed from: a */
    static boolean m23844a(String str) {
        boolean z = true;
        if (str.equals("") || str.equals("#")) {
            return true;
        }
        if (((int) Math.sqrt((((double) (Color.red(Color.parseColor(str)) * Color.red(Color.parseColor(str)))) * 0.241d) + (((double) (Color.green(Color.parseColor(str)) * Color.green(Color.parseColor(str)))) * 0.691d) + (((double) (Color.blue(Color.parseColor(str)) * Color.blue(Color.parseColor(str)))) * 0.068d))) <= 130) {
            z = false;
        }
        return z;
    }

    /* renamed from: a */
    static boolean m23842a(int i) {
        return ((int) Math.sqrt(((((double) (Color.red(i) * Color.red(i))) * 0.241d) + (((double) (Color.green(i) * Color.green(i))) * 0.691d)) + (((double) (Color.blue(i) * Color.blue(i))) * 0.068d))) > 130;
    }

    /* renamed from: a */
    public static int m23823a(int i, float f) {
        float f2 = m23842a(i) ? 1.0f - f : 1.0f + f;
        return Color.argb(Color.alpha(i), Math.min(Math.round(((float) Color.red(i)) * f2), 255), Math.min(Math.round(((float) Color.green(i)) * f2), 255), Math.min(Math.round(((float) Color.blue(i)) * f2), 255));
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:279:0x0bf1, code lost:
        if (r8.equals("") != false) goto L_0x0bf3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:294:0x0c4f, code lost:
        if (r8.equals("") != false) goto L_0x0bf3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:310:0x0ce4, code lost:
        r8 = r1[r3];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:312:0x0cec, code lost:
        if (r8.equals("") != false) goto L_0x0bf3;
     */
    /* JADX WARNING: Removed duplicated region for block: B:316:0x0cfb  */
    /* JADX WARNING: Removed duplicated region for block: B:539:0x1f80  */
    /* JADX WARNING: Removed duplicated region for block: B:542:0x1f9f  */
    /* JADX WARNING: Removed duplicated region for block: B:554:0x1fef A[LOOP:10: B:553:0x1fed->B:554:0x1fef, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:557:0x1ffc  */
    /* JADX WARNING: Removed duplicated region for block: B:558:0x2000  */
    /* JADX WARNING: Removed duplicated region for block: B:562:0x200b  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo20755a(java.lang.String[] r25, java.lang.String[] r26, android.os.Bundle r27, android.content.Intent r28) {
        /*
            r24 = this;
            r0 = r24
            r1 = r25
            r2 = r26
            r3 = r27
            r4 = 0
            r0.f18034dS = r4
            java.lang.String r5 = "sh"
            android.content.SharedPreferences r5 = r0.getSharedPreferences(r5, r4)
            r5.registerOnSharedPreferenceChangeListener(r0)
            java.lang.String r6 = "ico_busc_ord"
            int r6 = r5.getInt(r6, r4)
            r0.f18081r = r6
            java.lang.String r6 = "ico_share_ord"
            int r6 = r5.getInt(r6, r4)
            r0.f18079p = r6
            java.lang.String r6 = "ico_ofics_ord"
            int r6 = r5.getInt(r6, r4)
            r0.f18082s = r6
            java.lang.String r6 = "ico_exit_ord"
            int r6 = r5.getInt(r6, r4)
            r0.f18083t = r6
            java.lang.String r6 = "ico_notif_ord"
            int r6 = r5.getInt(r6, r4)
            r0.f18084u = r6
            java.lang.String r6 = "ic_po"
            int r6 = r5.getInt(r6, r4)
            r0.f18085v = r6
            java.lang.String r6 = "ic_so"
            int r6 = r5.getInt(r6, r4)
            r0.f18080q = r6
            java.lang.String r6 = "io1"
            int r6 = r5.getInt(r6, r4)
            r7 = 1
            if (r6 != r7) goto L_0x0057
            r6 = r7
            goto L_0x0058
        L_0x0057:
            r6 = r4
        L_0x0058:
            r0.f17865X = r6
            java.lang.String r6 = "io2"
            int r6 = r5.getInt(r6, r4)
            r0.f17866Y = r6
            java.lang.String r6 = "io3"
            int r6 = r5.getInt(r6, r4)
            r0.f17867Z = r6
            java.lang.String r6 = "io4"
            java.lang.String r8 = ""
            java.lang.String r6 = r5.getString(r6, r8)
            r0.f17894aa = r6
            java.lang.String r6 = "ib1"
            int r6 = r5.getInt(r6, r4)
            if (r6 != r7) goto L_0x007e
            r6 = r7
            goto L_0x007f
        L_0x007e:
            r6 = r4
        L_0x007f:
            r0.f17861T = r6
            java.lang.String r6 = "ib2"
            int r6 = r5.getInt(r6, r4)
            r0.f17862U = r6
            java.lang.String r6 = "ib3"
            int r6 = r5.getInt(r6, r4)
            r0.f17863V = r6
            java.lang.String r6 = "ib4"
            java.lang.String r8 = ""
            java.lang.String r6 = r5.getString(r6, r8)
            r0.f17864W = r6
            java.lang.String r6 = "ie1"
            int r6 = r5.getInt(r6, r4)
            if (r6 != r7) goto L_0x00a5
            r6 = r7
            goto L_0x00a6
        L_0x00a5:
            r6 = r4
        L_0x00a6:
            r0.f17895ab = r6
            java.lang.String r6 = "ie2"
            int r6 = r5.getInt(r6, r4)
            r0.f17896ac = r6
            java.lang.String r6 = "ie3"
            int r6 = r5.getInt(r6, r4)
            r0.f17897ad = r6
            java.lang.String r6 = "ie4"
            java.lang.String r8 = ""
            java.lang.String r6 = r5.getString(r6, r8)
            r0.f17898ae = r6
            java.lang.String r6 = "in1"
            int r6 = r5.getInt(r6, r4)
            if (r6 != r7) goto L_0x00cc
            r6 = r7
            goto L_0x00cd
        L_0x00cc:
            r6 = r4
        L_0x00cd:
            r0.f17899af = r6
            java.lang.String r6 = "in2"
            int r6 = r5.getInt(r6, r4)
            r0.f17900ag = r6
            java.lang.String r6 = "in3"
            int r6 = r5.getInt(r6, r4)
            r0.f17901ah = r6
            java.lang.String r6 = "in4"
            java.lang.String r8 = ""
            java.lang.String r6 = r5.getString(r6, r8)
            r0.f17902ai = r6
            java.lang.String r6 = "is1"
            int r6 = r5.getInt(r6, r4)
            if (r6 != r7) goto L_0x00f3
            r6 = r7
            goto L_0x00f4
        L_0x00f3:
            r6 = r4
        L_0x00f4:
            r0.f17853L = r6
            java.lang.String r6 = "is2"
            int r6 = r5.getInt(r6, r4)
            r0.f17854M = r6
            java.lang.String r6 = "is3"
            int r6 = r5.getInt(r6, r4)
            r0.f17855N = r6
            java.lang.String r6 = "is4"
            java.lang.String r8 = ""
            java.lang.String r6 = r5.getString(r6, r8)
            r0.f17856O = r6
            java.lang.String r6 = "ir1"
            int r6 = r5.getInt(r6, r4)
            if (r6 != r7) goto L_0x011a
            r6 = r7
            goto L_0x011b
        L_0x011a:
            r6 = r4
        L_0x011b:
            r0.f17857P = r6
            java.lang.String r6 = "ir2"
            int r6 = r5.getInt(r6, r4)
            r0.f17858Q = r6
            java.lang.String r6 = "ir3"
            int r6 = r5.getInt(r6, r4)
            r0.f17859R = r6
            java.lang.String r6 = "ir4"
            java.lang.String r8 = ""
            java.lang.String r6 = r5.getString(r6, r8)
            r0.f17860S = r6
            java.lang.String r6 = "ip1"
            int r6 = r5.getInt(r6, r4)
            if (r6 != r7) goto L_0x0141
            r6 = r7
            goto L_0x0142
        L_0x0141:
            r6 = r4
        L_0x0142:
            r0.f17903aj = r6
            java.lang.String r6 = "ip2"
            int r6 = r5.getInt(r6, r4)
            r0.f17904ak = r6
            java.lang.String r6 = "ip3"
            int r6 = r5.getInt(r6, r4)
            r0.f17905al = r6
            java.lang.String r6 = "ip4"
            java.lang.String r8 = ""
            java.lang.String r6 = r5.getString(r6, r8)
            r0.f17907an = r6
            java.lang.String r6 = "ip5"
            int r6 = r5.getInt(r6, r4)
            r0.f17906am = r6
            java.lang.String r6 = "share_subject"
            java.lang.String r8 = ""
            java.lang.String r6 = r5.getString(r6, r8)
            r0.f17879aL = r6
            java.lang.String r6 = "share_text"
            java.lang.String r8 = ""
            java.lang.String r6 = r5.getString(r6, r8)
            r0.f17880aM = r6
            java.lang.String r6 = "our"
            int r6 = r5.getInt(r6, r4)
            f17831dj = r6
            java.lang.String r6 = "admob_cod"
            java.lang.String r8 = ""
            java.lang.String r6 = r5.getString(r6, r8)
            r0.f18009ct = r6
            java.lang.String r6 = "admob_pos"
            int r6 = r5.getInt(r6, r4)
            r0.f18013cx = r6
            com.google.android.gms.ads.d r6 = com.google.android.gms.ads.C2973d.f8697g
            r0.f17973cB = r6
            f17833dl = r4
            f17832dk = r7
            java.lang.String r6 = "i2"
            java.lang.String r8 = ""
            java.lang.String r6 = r5.getString(r6, r8)
            java.lang.String r8 = ""
            boolean r8 = r6.equals(r8)
            r9 = 2
            if (r8 != 0) goto L_0x01c3
            java.lang.String r8 = r6.substring(r4, r7)
            java.lang.String r10 = "1"
            boolean r8 = r8.equals(r10)
            f17833dl = r8
            java.lang.String r6 = r6.substring(r7, r9)
            int r6 = java.lang.Integer.parseInt(r6)
            f17832dk = r6
        L_0x01c3:
            java.lang.String r6 = "fbb"
            java.lang.String r8 = ""
            java.lang.String r6 = r5.getString(r6, r8)
            r0.f18011cv = r6
            java.lang.String r6 = "fbi"
            java.lang.String r8 = ""
            java.lang.String r6 = r5.getString(r6, r8)
            f17820co = r6
            java.lang.String r6 = "fbm"
            java.lang.String r8 = ""
            java.lang.String r6 = r5.getString(r6, r8)
            r0.f17982cK = r6
            java.lang.String r6 = "fbp"
            java.lang.String r8 = ""
            java.lang.String r6 = r5.getString(r6, r8)
            r0.f17981cJ = r6
            java.lang.String r6 = "fbr"
            java.lang.String r8 = ""
            java.lang.String r6 = r5.getString(r6, r8)
            r0.f17988cQ = r6
            java.lang.String r6 = "stb"
            java.lang.String r8 = ""
            java.lang.String r6 = r5.getString(r6, r8)
            r0.f18012cw = r6
            java.lang.String r6 = "sti"
            java.lang.String r8 = ""
            java.lang.String r6 = r5.getString(r6, r8)
            f17821cp = r6
            java.lang.String r6 = "stm"
            java.lang.String r8 = ""
            java.lang.String r6 = r5.getString(r6, r8)
            r0.f17984cM = r6
            java.lang.String r6 = "stp"
            java.lang.String r8 = ""
            java.lang.String r6 = r5.getString(r6, r8)
            r0.f17983cL = r6
            java.lang.String r6 = "str"
            java.lang.String r8 = ""
            java.lang.String r6 = r5.getString(r6, r8)
            r0.f17989cR = r6
            java.lang.String r6 = "a_ra"
            java.lang.String r8 = ""
            java.lang.String r6 = r5.getString(r6, r8)
            r0.f17974cC = r6
            java.lang.String r6 = "n_ra"
            java.lang.String r8 = ""
            java.lang.String r6 = r5.getString(r6, r8)
            r0.f17975cD = r6
            java.lang.String r6 = "f_ra"
            java.lang.String r8 = ""
            java.lang.String r6 = r5.getString(r6, r8)
            r0.f17976cE = r6
            java.lang.String r6 = "st_ra"
            java.lang.String r8 = ""
            java.lang.String r6 = r5.getString(r6, r8)
            r0.f17977cF = r6
            java.lang.String r6 = "a_p_c"
            java.lang.String r8 = ""
            java.lang.String r6 = r5.getString(r6, r8)
            r0.f18010cu = r6
            java.lang.String r6 = "n_p_c"
            java.lang.String r8 = ""
            java.lang.String r6 = r5.getString(r6, r8)
            r0.f17978cG = r6
            java.lang.String r6 = "a_m_c"
            java.lang.String r8 = ""
            java.lang.String r6 = r5.getString(r6, r8)
            r0.f17979cH = r6
            java.lang.String r6 = "n_m_c"
            java.lang.String r8 = ""
            java.lang.String r6 = r5.getString(r6, r8)
            r0.f17980cI = r6
            java.lang.String r6 = "a_r_c"
            java.lang.String r8 = ""
            java.lang.String r6 = r5.getString(r6, r8)
            r0.f17985cN = r6
            java.lang.String r6 = "n_r_c"
            java.lang.String r8 = ""
            java.lang.String r6 = r5.getString(r6, r8)
            r0.f17986cO = r6
            java.lang.String r6 = "r_mo"
            int r6 = r5.getInt(r6, r4)
            r0.f17994cW = r6
            java.lang.String r6 = "r_ms"
            java.lang.String r8 = ""
            java.lang.String r6 = r5.getString(r6, r8)
            r0.f17987cP = r6
            r0.f17990cS = r4
            r0.f17991cT = r4
            java.lang.String r6 = "a_p_s"
            java.lang.String r8 = "0x0"
            java.lang.String r6 = r5.getString(r6, r8)
            java.lang.String r8 = "x"
            java.lang.String[] r6 = r6.split(r8)
            int r8 = r6.length
            if (r8 != r9) goto L_0x02c2
            r8 = r6[r4]
            int r8 = java.lang.Integer.parseInt(r8)
            r0.f17990cS = r8
            r6 = r6[r7]
            int r6 = java.lang.Integer.parseInt(r6)
            r0.f17991cT = r6
        L_0x02c2:
            r0.f17992cU = r4
            r0.f17993cV = r4
            java.lang.String r6 = "a_m_s"
            java.lang.String r8 = "0x0"
            java.lang.String r6 = r5.getString(r6, r8)
            java.lang.String r8 = "x"
            java.lang.String[] r6 = r6.split(r8)
            int r8 = r6.length
            if (r8 != r9) goto L_0x02e7
            r8 = r6[r4]
            int r8 = java.lang.Integer.parseInt(r8)
            r0.f17992cU = r8
            r6 = r6[r7]
            int r6 = java.lang.Integer.parseInt(r6)
            r0.f17993cV = r6
        L_0x02e7:
            boolean r6 = r0.f18044dc
            if (r6 == 0) goto L_0x0313
            java.lang.String r6 = "ca_a"
            java.lang.String r8 = ""
            java.lang.String r6 = r5.getString(r6, r8)
            r0.f17996cY = r6
            java.lang.String r6 = "ca_n"
            java.lang.String r8 = ""
            java.lang.String r6 = r5.getString(r6, r8)
            r0.f17997cZ = r6
            java.lang.String r6 = "ca_f"
            java.lang.String r8 = ""
            java.lang.String r6 = r5.getString(r6, r8)
            r0.f18042da = r6
            java.lang.String r6 = "ca_s"
            java.lang.String r8 = ""
            java.lang.String r6 = r5.getString(r6, r8)
            r0.f18043db = r6
        L_0x0313:
            java.lang.String r6 = "fca"
            java.lang.String r8 = ""
            java.lang.String r6 = r5.getString(r6, r8)
            r0.f17995cX = r6
            java.lang.String r6 = "admob_sma"
            int r6 = r5.getInt(r6, r7)
            if (r6 != 0) goto L_0x032a
            com.google.android.gms.ads.d r6 = com.google.android.gms.ads.C2973d.f8691a
            r0.f17973cB = r6
            goto L_0x0336
        L_0x032a:
            java.lang.String r6 = "admob_sma"
            int r6 = r5.getInt(r6, r7)
            if (r6 != r9) goto L_0x0336
            com.google.android.gms.ads.d r6 = com.google.android.gms.ads.C2973d.f8693c
            r0.f17973cB = r6
        L_0x0336:
            java.lang.String r6 = "admob_int_cod"
            java.lang.String r8 = ""
            java.lang.String r6 = r5.getString(r6, r8)
            f17819cn = r6
            java.lang.String r6 = "tcn"
            java.lang.String r8 = ""
            java.lang.String r6 = r5.getString(r6, r8)
            r0.f17950be = r6
            java.lang.String r6 = "b_c"
            int r6 = r5.getInt(r6, r7)
            if (r6 != r7) goto L_0x0354
            r6 = r7
            goto L_0x0355
        L_0x0354:
            r6 = r4
        L_0x0355:
            r0.f17928bI = r6
            java.lang.String r6 = "l_c"
            int r6 = r5.getInt(r6, r7)
            if (r6 != r7) goto L_0x0361
            r6 = r7
            goto L_0x0362
        L_0x0361:
            r6 = r4
        L_0x0362:
            r0.f17927bH = r6
            java.lang.String r6 = "fp"
            int r6 = r5.getInt(r6, r7)
            if (r6 != r7) goto L_0x036e
            r6 = r7
            goto L_0x036f
        L_0x036e:
            r6 = r4
        L_0x036f:
            r0.f17929bJ = r6
            java.lang.String r6 = "cvm"
            int r6 = r5.getInt(r6, r4)
            r0.f17936bQ = r6
            java.lang.String r6 = "emo"
            int r6 = r5.getInt(r6, r7)
            if (r6 != r7) goto L_0x0383
            r6 = r7
            goto L_0x0384
        L_0x0383:
            r6 = r4
        L_0x0384:
            r0.f17930bK = r6
            r0.f17934bO = r7
            r0.f17931bL = r7
            r0.f17932bM = r4
            r0.f17878aK = r4
            r0.f18061ec = r4
            r0.f17933bN = r4
            java.lang.String r6 = "i"
            java.lang.String r8 = ""
            java.lang.String r6 = r5.getString(r6, r8)
            java.lang.String r8 = ""
            boolean r8 = r6.equals(r8)
            r11 = 7
            r12 = 6
            r14 = 8
            r13 = 5
            r15 = 4
            r10 = 3
            if (r8 != 0) goto L_0x0445
            java.lang.String r8 = r6.substring(r4, r7)
            int r8 = java.lang.Integer.parseInt(r8)
            r0.f17934bO = r8
            java.lang.String r8 = r6.substring(r7, r9)
            java.lang.String r7 = "1"
            boolean r7 = r8.equals(r7)
            r0.f17931bL = r7
            java.lang.String r7 = r6.substring(r9, r10)
            java.lang.String r8 = "1"
            boolean r7 = r7.equals(r8)
            r0.f17932bM = r7
            java.lang.String r7 = r6.substring(r10, r15)
            java.lang.String r8 = "1"
            boolean r7 = r7.equals(r8)
            r0.f17873aF = r7
            java.lang.String r7 = r6.substring(r15, r13)
            java.lang.String r8 = "1"
            boolean r7 = r7.equals(r8)
            r0.f17874aG = r7
            java.lang.String r7 = r6.substring(r13, r12)
            java.lang.String r8 = "1"
            boolean r7 = r7.equals(r8)
            r0.f17875aH = r7
            java.lang.String r7 = r6.substring(r12, r11)
            java.lang.String r8 = "1"
            boolean r7 = r7.equals(r8)
            r0.f17876aI = r7
            java.lang.String r7 = r6.substring(r11, r14)
            java.lang.String r8 = "1"
            boolean r7 = r7.equals(r8)
            r0.f17877aJ = r7
            r7 = 9
            java.lang.String r8 = r6.substring(r14, r7)
            java.lang.String r11 = "1"
            boolean r8 = r8.equals(r11)
            r0.f17878aK = r8
            r8 = 10
            java.lang.String r11 = r6.substring(r7, r8)
            java.lang.String r7 = "1"
            boolean r7 = r11.equals(r7)
            r0.f18061ec = r7
            r7 = 11
            java.lang.String r11 = r6.substring(r8, r7)
            java.lang.String r8 = "1"
            boolean r8 = r11.equals(r8)
            r0.f18076m = r8
            int r8 = r6.length()
            if (r8 <= r7) goto L_0x0445
            r8 = 12
            java.lang.String r6 = r6.substring(r7, r8)
            java.lang.String r7 = "1"
            boolean r6 = r6.equals(r7)
            r0.f17933bN = r6
        L_0x0445:
            java.lang.String r6 = "cb"
            java.lang.String r7 = ""
            java.lang.String r6 = r5.getString(r6, r7)
            r0.f17937bR = r6
            java.lang.String r6 = "mv"
            int r6 = r5.getInt(r6, r14)
            r0.f17935bP = r6
            java.lang.String r6 = "r_p"
            int r6 = r5.getInt(r6, r4)
            r0.f17938bS = r6
            java.lang.String r6 = "r_t_c"
            int r6 = r5.getInt(r6, r4)
            r7 = 1
            if (r6 != r7) goto L_0x046a
            r6 = 1
            goto L_0x046b
        L_0x046a:
            r6 = r4
        L_0x046b:
            r0.f17943bX = r6
            java.lang.String r6 = "r_a_s"
            int r6 = r5.getInt(r6, r4)
            r0.f17939bT = r6
            java.lang.String r6 = "r_s_s"
            int r6 = r5.getInt(r6, r4)
            r0.f17940bU = r6
            java.lang.String r6 = "r_a_c"
            java.lang.String r7 = ""
            java.lang.String r6 = r5.getString(r6, r7)
            r0.f17944bY = r6
            java.lang.String r6 = "r_s_c"
            java.lang.String r7 = ""
            java.lang.String r6 = r5.getString(r6, r7)
            r0.f17945bZ = r6
            java.lang.String r6 = "r_a_b"
            int r6 = r5.getInt(r6, r4)
            r7 = 1
            if (r6 != r7) goto L_0x049c
            r6 = r7
            goto L_0x049d
        L_0x049c:
            r6 = r4
        L_0x049d:
            r0.f17941bV = r6
            java.lang.String r6 = "r_s_b"
            int r6 = r5.getInt(r6, r4)
            if (r6 != r7) goto L_0x04a9
            r6 = 1
            goto L_0x04aa
        L_0x04a9:
            r6 = r4
        L_0x04aa:
            r0.f17942bW = r6
            java.lang.String r6 = "appnext_cod"
            java.lang.String r7 = ""
            java.lang.String r6 = r5.getString(r6, r7)
            f17816ck = r6
            java.lang.String r6 = "appnext_cod_int_e"
            java.lang.String r7 = ""
            java.lang.String r6 = r5.getString(r6, r7)
            f17817cl = r6
            java.lang.String r6 = "appnext_cod_int_ia"
            java.lang.String r7 = ""
            java.lang.String r6 = r5.getString(r6, r7)
            f17818cm = r6
            java.lang.String r6 = "ap"
            r7 = 1
            int r6 = r5.getInt(r6, r7)
            if (r6 != r7) goto L_0x04d5
            r6 = r7
            goto L_0x04d6
        L_0x04d5:
            r6 = r4
        L_0x04d6:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            f17823cr = r6
            java.lang.String r6 = "mu"
            int r6 = r5.getInt(r6, r7)
            if (r6 != r7) goto L_0x04e6
            r6 = 1
            goto L_0x04e7
        L_0x04e6:
            r6 = r4
        L_0x04e7:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            f17822cq = r6
            java.lang.String r6 = f17816ck
            java.lang.String r7 = ""
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L_0x0506
            java.lang.String r6 = f17817cl
            java.lang.String r7 = ""
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto L_0x0506
            java.lang.String r6 = f17817cl
            f17816ck = r6
            goto L_0x0522
        L_0x0506:
            java.lang.String r6 = f17816ck
            java.lang.String r7 = ""
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto L_0x0522
            java.lang.String r6 = f17817cl
            java.lang.String r7 = ""
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L_0x0522
            java.lang.String r6 = f17816ck
            f17817cl = r6
            java.lang.String r6 = f17816ck
            f17818cm = r6
        L_0x0522:
            java.lang.String r6 = "appnextb_cod"
            java.lang.String r7 = ""
            java.lang.String r6 = r5.getString(r6, r7)
            r0.f18008cs = r6
            java.lang.String r6 = ""
            r0.f18005ch = r6
            r6 = 1
            r0.f18007cj = r6
            r0.f18006ci = r15
            java.lang.String r7 = "apn_v"
            java.lang.String r8 = ""
            java.lang.String r7 = r5.getString(r7, r8)
            java.lang.String r8 = "@"
            java.lang.String[] r7 = r7.split(r8)
            int r8 = r7.length
            if (r8 <= r9) goto L_0x055a
            r8 = r7[r4]
            r0.f18005ch = r8
            r8 = r7[r6]
            int r6 = java.lang.Integer.parseInt(r8)
            r0.f18007cj = r6
            r6 = r7[r9]
            int r6 = java.lang.Integer.parseInt(r6)
            r0.f18006ci = r6
        L_0x055a:
            java.lang.String r6 = f17819cn
            java.lang.String r7 = ""
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L_0x0584
            java.lang.String r6 = f17816ck
            java.lang.String r7 = ""
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L_0x0584
            java.lang.String r6 = f17820co
            java.lang.String r7 = ""
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L_0x0584
            java.lang.String r6 = f17821cp
            java.lang.String r7 = ""
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L_0x0584
            r6 = r4
            goto L_0x058a
        L_0x0584:
            java.lang.String r6 = "admob_int_v"
            int r6 = r5.getInt(r6, r4)
        L_0x058a:
            r0.f18014cy = r6
            java.lang.String r6 = f17819cn
            java.lang.String r7 = ""
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L_0x05b6
            java.lang.String r6 = f17816ck
            java.lang.String r7 = ""
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L_0x05b6
            java.lang.String r6 = f17820co
            java.lang.String r7 = ""
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L_0x05b6
            java.lang.String r6 = f17821cp
            java.lang.String r7 = ""
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L_0x05b6
            r6 = r4
            goto L_0x05bc
        L_0x05b6:
            java.lang.String r6 = "admob_inte_v"
            int r6 = r5.getInt(r6, r4)
        L_0x05bc:
            r0.f18015cz = r6
            java.lang.String r6 = f17819cn
            java.lang.String r7 = ""
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L_0x05e8
            java.lang.String r6 = f17816ck
            java.lang.String r7 = ""
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L_0x05e8
            java.lang.String r6 = f17820co
            java.lang.String r7 = ""
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L_0x05e8
            java.lang.String r6 = f17821cp
            java.lang.String r7 = ""
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L_0x05e8
            r6 = r4
            goto L_0x05ee
        L_0x05e8:
            java.lang.String r6 = "admob_ch_v"
            int r6 = r5.getInt(r6, r4)
        L_0x05ee:
            r0.f17972cA = r6
            java.lang.String r6 = ""
            r0.f17998ca = r6
            java.lang.String r6 = "acad"
            java.lang.String r7 = ""
            java.lang.String r6 = r5.getString(r6, r7)
            java.lang.String r7 = "@"
            java.lang.String[] r6 = r6.split(r7)
            int r7 = r6.length
            if (r7 <= r12) goto L_0x0622
            r7 = r6[r4]
            r0.f17998ca = r7
            r7 = 1
            r8 = r6[r7]
            r0.f17999cb = r8
            r7 = r6[r9]
            r0.f18000cc = r7
            r7 = r6[r10]
            r0.f18001cd = r7
            r7 = r6[r15]
            r0.f18003cf = r7
            r7 = r6[r13]
            r0.f18004cg = r7
            r6 = r6[r12]
            r0.f18002ce = r6
        L_0x0622:
            java.lang.String r6 = "tipomenu"
            int r6 = r5.getInt(r6, r4)
            r0.f18045dm = r6
            java.lang.String r6 = "petic_ask_nombre"
            int r6 = r5.getInt(r6, r4)
            r0.f18088y = r6
            java.lang.String r6 = "petic_ask_email"
            int r6 = r5.getInt(r6, r4)
            r0.f18089z = r6
            java.lang.String r6 = "petic_ask_tel"
            int r6 = r5.getInt(r6, r4)
            r0.f17842A = r6
            java.lang.String r6 = "sep_secc"
            int r6 = r5.getInt(r6, r4)
            if (r6 != 0) goto L_0x064d
            r0.f17968bw = r4
            goto L_0x0650
        L_0x064d:
            r6 = 1
            r0.f17968bw = r6
        L_0x0650:
            java.lang.String r6 = "t_ind"
            int r6 = r5.getInt(r6, r4)
            r0.f18086w = r6
            java.lang.String r6 = "t_mas"
            int r6 = r5.getInt(r6, r4)
            r0.f18087x = r6
            java.lang.String r6 = "c1"
            java.lang.String r7 = ""
            java.lang.String r6 = r5.getString(r6, r7)
            r0.f17881aN = r6
            java.lang.String r6 = "c2"
            java.lang.String r7 = ""
            java.lang.String r6 = r5.getString(r6, r7)
            r0.f17882aO = r6
            java.lang.String r6 = "c_icos"
            java.lang.String r7 = ""
            java.lang.String r6 = r5.getString(r6, r7)
            r0.f17890aW = r6
            java.lang.String r6 = "c_icos_t"
            java.lang.String r7 = ""
            java.lang.String r6 = r5.getString(r6, r7)
            r0.f17891aX = r6
            java.lang.String r6 = r0.f17891aX
            java.lang.String r7 = ""
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L_0x0696
            java.lang.String r6 = r0.f17890aW
            r0.f17891aX = r6
        L_0x0696:
            java.lang.String r6 = "c_sep_secc"
            java.lang.String r7 = ""
            java.lang.String r6 = r5.getString(r6, r7)
            r0.f17883aP = r6
            java.lang.String r6 = "c_secc_noactiv"
            java.lang.String r7 = ""
            java.lang.String r6 = r5.getString(r6, r7)
            r0.f17884aQ = r6
            java.lang.String r6 = "c_secc_activ"
            java.lang.String r7 = ""
            java.lang.String r6 = r5.getString(r6, r7)
            r0.f17885aR = r6
            java.lang.String r6 = "c_linea"
            java.lang.String r7 = ""
            java.lang.String r6 = r5.getString(r6, r7)
            r0.f17886aS = r6
            java.lang.String r6 = "c_ind"
            java.lang.String r7 = ""
            java.lang.String r6 = r5.getString(r6, r7)
            r0.f17887aT = r6
            java.lang.String r6 = "c1_ofic"
            java.lang.String r7 = ""
            java.lang.String r6 = r5.getString(r6, r7)
            r0.f17888aU = r6
            java.lang.String r6 = "c2_ofic"
            java.lang.String r7 = ""
            java.lang.String r6 = r5.getString(r6, r7)
            r0.f17889aV = r6
            java.lang.String r6 = "c_perofic"
            int r6 = r5.getInt(r6, r4)
            r0.f17845D = r6
            java.lang.String r6 = "c_tit_ofic"
            java.lang.String r7 = ""
            java.lang.String r6 = r5.getString(r6, r7)
            r0.f17892aY = r6
            java.lang.String r6 = "c_sep_ofic"
            java.lang.String r7 = ""
            java.lang.String r6 = r5.getString(r6, r7)
            r0.f17893aZ = r6
            java.lang.String r6 = "c_ico_sep_ofic"
            java.lang.String r7 = ""
            java.lang.String r6 = r5.getString(r6, r7)
            r0.f17946ba = r6
            java.lang.String r6 = "c_txt_ofic"
            java.lang.String r7 = ""
            java.lang.String r6 = r5.getString(r6, r7)
            r0.f17947bb = r6
            java.lang.String r6 = "c_icos_ofic"
            java.lang.String r7 = ""
            java.lang.String r6 = r5.getString(r6, r7)
            r0.f17948bc = r6
            java.lang.String r6 = "c_ir_ofic"
            java.lang.String r7 = ""
            java.lang.String r6 = r5.getString(r6, r7)
            r0.f17949bd = r6
            java.lang.String r6 = "c1_sp"
            java.lang.String r7 = ""
            java.lang.String r6 = r5.getString(r6, r7)
            r0.f17965bt = r6
            java.lang.String r6 = "c2_sp"
            java.lang.String r7 = ""
            java.lang.String r6 = r5.getString(r6, r7)
            r0.f17966bu = r6
            java.lang.String r6 = "c1_prods"
            java.lang.String r7 = ""
            java.lang.String r6 = r5.getString(r6, r7)
            r0.f17951bf = r6
            java.lang.String r6 = "c2_prods"
            java.lang.String r7 = ""
            java.lang.String r6 = r5.getString(r6, r7)
            r0.f17952bg = r6
            java.lang.String r6 = "c_txt_prods"
            java.lang.String r7 = ""
            java.lang.String r6 = r5.getString(r6, r7)
            r0.f17953bh = r6
            java.lang.String r6 = "c_icos_prods"
            java.lang.String r7 = ""
            java.lang.String r6 = r5.getString(r6, r7)
            r0.f17954bi = r6
            java.lang.String r6 = "c_icos_2_prods"
            java.lang.String r7 = ""
            java.lang.String r6 = r5.getString(r6, r7)
            r0.f17955bj = r6
            java.lang.String r6 = "c_tit_prods"
            java.lang.String r7 = ""
            java.lang.String r6 = r5.getString(r6, r7)
            r0.f17956bk = r6
            java.lang.String r6 = "c_sep_prods"
            java.lang.String r7 = ""
            java.lang.String r6 = r5.getString(r6, r7)
            r0.f17957bl = r6
            java.lang.String r6 = "c_ico_sep_prods"
            java.lang.String r7 = ""
            java.lang.String r6 = r5.getString(r6, r7)
            r0.f17958bm = r6
            java.lang.String r6 = "c1_prods_l"
            java.lang.String r7 = ""
            java.lang.String r6 = r5.getString(r6, r7)
            r0.f17959bn = r6
            java.lang.String r6 = "c2_prods_l"
            java.lang.String r7 = ""
            java.lang.String r6 = r5.getString(r6, r7)
            r0.f17960bo = r6
            java.lang.String r6 = "c_perprod"
            int r6 = r5.getInt(r6, r4)
            r0.f17967bv = r6
            java.lang.String r6 = "c_tit_prods_l"
            java.lang.String r7 = ""
            java.lang.String r6 = r5.getString(r6, r7)
            r0.f17961bp = r6
            java.lang.String r6 = "c_precio_prods_l"
            java.lang.String r7 = ""
            java.lang.String r6 = r5.getString(r6, r7)
            r0.f17962bq = r6
            java.lang.String r6 = "c_antiguedad_prods_l"
            java.lang.String r7 = ""
            java.lang.String r6 = r5.getString(r6, r7)
            r0.f17963br = r6
            java.lang.String r6 = "c_prods_det"
            java.lang.String r7 = ""
            java.lang.String r6 = r5.getString(r6, r7)
            r0.f17964bs = r6
            java.lang.String r6 = "splash_w"
            r7 = 2000(0x7d0, float:2.803E-42)
            int r6 = r5.getInt(r6, r7)
            r0.f17846E = r6
            java.lang.String r6 = "s_v"
            int r6 = r5.getInt(r6, r4)
            r0.f17847F = r6
            java.lang.String r6 = "s_h"
            int r6 = r5.getInt(r6, r4)
            r0.f17848G = r6
            java.lang.String r6 = "bv_txt"
            java.lang.String r7 = ""
            java.lang.String r6 = r5.getString(r6, r7)
            r0.f18023dH = r6
            java.lang.String r6 = "bv_tit"
            java.lang.String r7 = ""
            java.lang.String r6 = r5.getString(r6, r7)
            r0.f18022dG = r6
            java.lang.String r6 = "bv_nomas_mostrar"
            int r6 = r5.getInt(r6, r4)
            if (r6 != 0) goto L_0x0802
            r0.f18024dI = r4
            r6 = 1
            goto L_0x0805
        L_0x0802:
            r6 = 1
            r0.f18024dI = r6
        L_0x0805:
            java.lang.String r7 = "bv_nomas_def"
            int r7 = r5.getInt(r7, r4)
            if (r7 != 0) goto L_0x0810
            r0.f18025dJ = r4
            goto L_0x0812
        L_0x0810:
            r0.f18025dJ = r6
        L_0x0812:
            r0.f17849H = r6
            r0.f17850I = r4
            r0.f17851J = r9
            java.lang.String r6 = "FF666666"
            r0.f17852K = r6
            java.lang.String r6 = "sp_i"
            java.lang.String r7 = ""
            java.lang.String r6 = r5.getString(r6, r7)
            int r7 = r6.length()
            r8 = 10
            if (r7 <= r8) goto L_0x0854
            java.lang.String r7 = r6.substring(r4, r14)
            r0.f17852K = r7
            r7 = 9
            java.lang.String r11 = r6.substring(r14, r7)
            int r11 = java.lang.Integer.parseInt(r11)
            r0.f17849H = r11
            java.lang.String r11 = r6.substring(r7, r8)
            int r7 = java.lang.Integer.parseInt(r11)
            r0.f17850I = r7
            r7 = 11
            java.lang.String r6 = r6.substring(r8, r7)
            int r6 = java.lang.Integer.parseInt(r6)
            r0.f17851J = r6
        L_0x0854:
            r0.f18062ed = r4
            r0.f18064ef = r4
            r0.f18063ee = r4
            java.lang.String r6 = "0"
            java.lang.String r7 = "fb_m"
            java.lang.String r8 = "0"
            java.lang.String r7 = r5.getString(r7, r8)     // Catch:{ Exception -> 0x0865 }
            r6 = r7
        L_0x0865:
            r7 = 1
            java.lang.String r8 = r6.substring(r4, r7)
            int r8 = java.lang.Integer.parseInt(r8)
            r0.f18062ed = r8
            int r8 = r0.f18062ed
            if (r8 == r7) goto L_0x0878
            int r8 = r0.f18062ed
            if (r8 != r9) goto L_0x0897
        L_0x0878:
            int r8 = r6.length()
            if (r8 >= r9) goto L_0x0881
            r0.f18062ed = r4
            goto L_0x0897
        L_0x0881:
            java.lang.String r8 = r6.substring(r7, r9)
            java.lang.String r7 = "1"
            boolean r7 = r8.equals(r7)
            r0.f18064ef = r7
            java.lang.String r6 = r6.substring(r9, r10)
            int r6 = java.lang.Integer.parseInt(r6)
            r0.f18063ee = r6
        L_0x0897:
            java.lang.String r6 = "vcn"
            int r6 = r5.getInt(r6, r4)
            r0.f18065eg = r6
            java.lang.String r6 = "hcn"
            int r6 = r5.getInt(r6, r4)
            r7 = 1
            if (r6 != r7) goto L_0x08aa
            r6 = 1
            goto L_0x08ab
        L_0x08aa:
            r6 = r4
        L_0x08ab:
            r0.f18067ei = r6
            java.lang.String r6 = "nd_t"
            java.lang.String r7 = ""
            java.lang.String r6 = r5.getString(r6, r7)
            r0.f18068ej = r6
            java.lang.String r6 = "nd_s"
            java.lang.String r7 = ""
            java.lang.String r6 = r5.getString(r6, r7)
            r0.f18069ek = r6
            java.lang.String r6 = "nd_i"
            int r6 = r5.getInt(r6, r4)
            r0.f18066eh = r6
            java.lang.String r6 = "nd_u"
            java.lang.String r7 = ""
            java.lang.String r6 = r5.getString(r6, r7)
            r0.f18070el = r6
            java.lang.String r6 = "conf_ex"
            int r6 = r5.getInt(r6, r4)
            r7 = 1
            if (r6 != r7) goto L_0x08de
            r6 = r7
            goto L_0x08df
        L_0x08de:
            r6 = r4
        L_0x08df:
            r0.f18059ea = r6
            java.lang.String r6 = "pp"
            int r6 = r5.getInt(r6, r7)
            if (r6 != r7) goto L_0x08eb
            r6 = 1
            goto L_0x08ec
        L_0x08eb:
            r6 = r4
        L_0x08ec:
            r0.f18060eb = r6
            java.lang.String r6 = "rt_tit"
            java.lang.String r7 = ""
            java.lang.String r6 = r5.getString(r6, r7)
            r0.f18026dK = r6
            java.lang.String r6 = "rt_txt"
            java.lang.String r7 = ""
            java.lang.String r6 = r5.getString(r6, r7)
            r0.f18027dL = r6
            java.lang.String r6 = "rt_ok"
            java.lang.String r7 = ""
            java.lang.String r6 = r5.getString(r6, r7)
            r0.f18028dM = r6
            java.lang.String r6 = "rt_ko"
            java.lang.String r7 = ""
            java.lang.String r6 = r5.getString(r6, r7)
            r0.f18029dN = r6
            java.lang.String r6 = "rt_1v"
            int r6 = r5.getInt(r6, r4)
            r0.f18030dO = r6
            java.lang.String r6 = "rt_int"
            int r6 = r5.getInt(r6, r4)
            r0.f18031dP = r6
            java.lang.String r6 = "wv_sc"
            r7 = 1
            int r6 = r5.getInt(r6, r7)
            if (r6 != r7) goto L_0x0931
            r6 = r7
            goto L_0x0932
        L_0x0931:
            r6 = r4
        L_0x0932:
            r0.f18032dQ = r6
            java.lang.String r6 = "wv_sc_txt"
            java.lang.String r8 = ""
            java.lang.String r6 = r5.getString(r6, r8)
            r0.f18035dT = r6
            java.lang.String r6 = "wv_c"
            int r6 = r5.getInt(r6, r7)
            if (r6 != r7) goto L_0x0948
            r6 = 1
            goto L_0x0949
        L_0x0948:
            r6 = r4
        L_0x0949:
            r0.f18033dR = r6
            java.lang.String r6 = "rss_i"
            int r6 = r5.getInt(r6, r4)
            r0.f18037dV = r6
            java.lang.String r6 = "rss_t"
            java.lang.String r7 = ""
            java.lang.String r6 = r5.getString(r6, r7)
            r0.f18036dU = r6
            java.lang.String r6 = r0.f18036dU
            java.lang.String r7 = ""
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L_0x0969
            r0.f18037dV = r4
        L_0x0969:
            mega.boicot.alarma_rss r6 = new mega.boicot.alarma_rss
            r6.<init>()
            android.content.Context r7 = r24.getApplicationContext()
            int r8 = r0.f18037dV
            r6.mo20719a(r7, r8)
            java.lang.String r6 = "vfs"
            int r6 = r5.getInt(r6, r4)
            r7 = 1
            if (r6 != r7) goto L_0x0982
            r6 = r7
            goto L_0x0983
        L_0x0982:
            r6 = r4
        L_0x0983:
            r0.f18038dW = r6
            java.lang.String r6 = "vls"
            int r6 = r5.getInt(r6, r4)
            if (r6 != r7) goto L_0x098f
            r6 = r7
            goto L_0x0990
        L_0x098f:
            r6 = r4
        L_0x0990:
            r0.f18039dX = r6
            java.lang.String r6 = "vc"
            int r6 = r5.getInt(r6, r4)
            if (r6 != r7) goto L_0x099c
            r6 = 1
            goto L_0x099d
        L_0x099c:
            r6 = r4
        L_0x099d:
            r0.f18040dY = r6
            java.lang.String r6 = "vcv"
            int r6 = r5.getInt(r6, r4)
            r0.f18041dZ = r6
            java.lang.String r6 = "divisa"
            java.lang.String r7 = ""
            java.lang.String r6 = r5.getString(r6, r7)
            java.lang.String r7 = "puntoycoma"
            java.lang.String r8 = ";"
            java.lang.String r6 = r6.replace(r7, r8)
            r0.f17919az = r6
            java.lang.String r6 = "busc_campos"
            java.lang.String r7 = ""
            java.lang.String r6 = r5.getString(r6, r7)
            java.lang.String r7 = ","
            java.lang.String[] r6 = r6.split(r7)
            int r7 = r6.length
            if (r7 != r15) goto L_0x0a1b
            r7 = r6[r4]
            java.lang.String r8 = "1"
            boolean r7 = r7.equals(r8)
            r0.f17908ao = r7
            r7 = 1
            r8 = r6[r7]
            java.lang.String r7 = "1"
            boolean r7 = r8.equals(r7)
            r0.f17909ap = r7
            r7 = r6[r9]
            java.lang.String r8 = "1"
            boolean r7 = r7.equals(r8)
            r0.f17910aq = r7
            r6 = r6[r10]
            java.lang.String r7 = "1"
            boolean r6 = r6.equals(r7)
            r0.f17911ar = r6
            boolean r6 = r0.f17909ap
            if (r6 == 0) goto L_0x0a1b
            mega.boicot.k r6 = new mega.boicot.k
            android.content.Context r7 = r24.getApplicationContext()
            r6.<init>(r7)
            android.database.sqlite.SQLiteDatabase r6 = r6.getReadableDatabase()
            if (r6 == 0) goto L_0x0a1b
            java.lang.String r7 = "SELECT _id FROM cats LIMIT 1"
            r8 = 0
            android.database.Cursor r7 = r6.rawQuery(r7, r8)
            boolean r8 = r7.moveToFirst()
            if (r8 != 0) goto L_0x0a15
            r0.f17909ap = r4
        L_0x0a15:
            r7.close()
            r6.close()
        L_0x0a1b:
            java.lang.String r6 = "busc_orden"
            java.lang.String r7 = ""
            java.lang.String r6 = r5.getString(r6, r7)
            java.lang.String r7 = ","
            java.lang.String[] r6 = r6.split(r7)
            int r7 = r6.length
            if (r7 != r10) goto L_0x0a4b
            r7 = r6[r4]
            java.lang.String r8 = "1"
            boolean r7 = r7.equals(r8)
            r0.f17912as = r7
            r7 = 1
            r8 = r6[r7]
            java.lang.String r7 = "1"
            boolean r7 = r8.equals(r7)
            r0.f17913at = r7
            r6 = r6[r9]
            java.lang.String r7 = "1"
            boolean r6 = r6.equals(r7)
            r0.f17914au = r6
        L_0x0a4b:
            java.lang.String r6 = "busc_def"
            java.lang.String r7 = ""
            java.lang.String r6 = r5.getString(r6, r7)
            r0.f17918ay = r6
            java.lang.String r6 = "prods_tit"
            java.lang.String r7 = ""
            java.lang.String r6 = r5.getString(r6, r7)
            r0.f17868aA = r6
            java.lang.String r6 = "prods_masinfo"
            java.lang.String r7 = ""
            java.lang.String r6 = r5.getString(r6, r7)
            r0.f17869aB = r6
            java.lang.String r6 = "prods_comprar"
            java.lang.String r7 = ""
            java.lang.String r6 = r5.getString(r6, r7)
            r0.f17870aC = r6
            java.lang.String r6 = "prods_masinfo_mostrar"
            r7 = 1
            int r6 = r5.getInt(r6, r7)
            if (r6 != r7) goto L_0x0a7e
            r6 = r7
            goto L_0x0a7f
        L_0x0a7e:
            r6 = r4
        L_0x0a7f:
            r0.f17915av = r6
            java.lang.String r6 = "prods_linksexternos"
            int r6 = r5.getInt(r6, r7)
            if (r6 != r7) goto L_0x0a8b
            r6 = r7
            goto L_0x0a8c
        L_0x0a8b:
            r6 = r4
        L_0x0a8c:
            r0.f17917ax = r6
            java.lang.String r6 = "prods_adaptar_ancho"
            int r6 = r5.getInt(r6, r7)
            if (r6 != r7) goto L_0x0a98
            r6 = 1
            goto L_0x0a99
        L_0x0a98:
            r6 = r4
        L_0x0a99:
            r0.f17916aw = r6
            java.lang.String r6 = "pp_email"
            java.lang.String r7 = ""
            java.lang.String r6 = r5.getString(r6, r7)
            r0.f17871aD = r6
            java.lang.String r6 = "pp_div"
            java.lang.String r7 = ""
            java.lang.String r6 = r5.getString(r6, r7)
            r0.f17872aE = r6
            java.lang.String r6 = "m_ncols"
            r7 = 1
            int r6 = r5.getInt(r6, r7)
            r0.f18046dn = r6
            java.lang.String r6 = "m_padding"
            int r6 = r5.getInt(r6, r9)
            r0.f18047do = r6
            java.lang.String r6 = "m_txt_radius"
            int r6 = r5.getInt(r6, r13)
            r0.f18048dp = r6
            java.lang.String r6 = "m_mostrar_icos"
            int r6 = r5.getInt(r6, r7)
            if (r6 != 0) goto L_0x0ad3
            r0.f18050dr = r4
            goto L_0x0ad5
        L_0x0ad3:
            r0.f18050dr = r7
        L_0x0ad5:
            java.lang.String r6 = "m_mostrar_txt"
            int r6 = r5.getInt(r6, r7)
            if (r6 != 0) goto L_0x0ae0
            r0.f18051ds = r4
            goto L_0x0ae2
        L_0x0ae0:
            r0.f18051ds = r7
        L_0x0ae2:
            java.lang.String r6 = "m_icos_izq"
            int r6 = r5.getInt(r6, r7)
            if (r6 != 0) goto L_0x0aed
            r0.f18052dt = r4
            goto L_0x0aef
        L_0x0aed:
            r0.f18052dt = r7
        L_0x0aef:
            java.lang.String r6 = "m_anim"
            int r6 = r5.getInt(r6, r7)
            if (r6 != 0) goto L_0x0afa
            r0.f18053du = r4
            goto L_0x0afc
        L_0x0afa:
            r0.f18053du = r7
        L_0x0afc:
            java.lang.String r6 = "m_c"
            int r6 = r5.getInt(r6, r7)
            if (r6 != 0) goto L_0x0b07
            r0.f18054dv = r4
            goto L_0x0b09
        L_0x0b07:
            r0.f18054dv = r7
        L_0x0b09:
            java.lang.String r6 = "m_txt_c"
            int r6 = r5.getInt(r6, r7)
            if (r6 != 0) goto L_0x0b14
            r0.f18055dw = r4
            goto L_0x0b16
        L_0x0b14:
            r0.f18055dw = r7
        L_0x0b16:
            java.lang.String r6 = "m_txt_b"
            int r6 = r5.getInt(r6, r4)
            if (r6 != r7) goto L_0x0b20
            r6 = 1
            goto L_0x0b21
        L_0x0b20:
            r6 = r4
        L_0x0b21:
            r0.f18056dx = r6
            java.lang.String r6 = "m_e"
            int r6 = r5.getInt(r6, r4)
            r0.f18057dy = r6
            java.lang.String r6 = "m_txt_bg"
            java.lang.String r7 = ""
            java.lang.String r6 = r5.getString(r6, r7)
            r0.f18017dB = r6
            java.lang.String r6 = "m_txt_col"
            java.lang.String r7 = ""
            java.lang.String r6 = r5.getString(r6, r7)
            r0.f18018dC = r6
            java.lang.String r6 = "m_c1"
            java.lang.String r7 = ""
            java.lang.String r6 = r5.getString(r6, r7)
            r0.f18019dD = r6
            java.lang.String r6 = "m_c2"
            java.lang.String r7 = ""
            java.lang.String r6 = r5.getString(r6, r7)
            r0.f18020dE = r6
            java.lang.String r6 = "msl_c"
            java.lang.String r7 = ""
            java.lang.String r6 = r5.getString(r6, r7)
            r0.f18021dF = r6
            java.lang.String r6 = "fm"
            int r6 = r5.getInt(r6, r4)
            r7 = 1
            if (r6 != r7) goto L_0x0b68
            r6 = 1
            goto L_0x0b69
        L_0x0b68:
            r6 = r4
        L_0x0b69:
            r0.f18058dz = r6
            java.lang.String r6 = "act_fm"
            boolean r6 = r5.getBoolean(r6, r4)
            r0.f18016dA = r6
            java.lang.String r6 = "vf"
            int r6 = r5.getInt(r6, r4)
            r0.f18049dq = r6
            r7 = 9997(0x270d, float:1.4009E-41)
            int r8 = r1.length
            mega.boicot.i[] r8 = new mega.boicot.C5663i[r8]
            r0.f17971bz = r8
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            r0.f17920bA = r8
            int r8 = r1.length
            int[] r8 = new int[r8]
            r0.f17922bC = r8
            java.lang.String r8 = ""
            if (r3 == 0) goto L_0x0ba4
            java.lang.String r11 = "abrir_idsecc"
            java.lang.String r11 = r3.getString(r11)
            if (r11 == 0) goto L_0x0ba4
            java.lang.String r8 = "abrir_idsecc"
            java.lang.String r8 = r3.getString(r8)
        L_0x0ba0:
            r6 = 9996(0x270c, float:1.4007E-41)
            goto L_0x0cf0
        L_0x0ba4:
            if (r3 == 0) goto L_0x0bc3
            java.lang.String r11 = "notif_id"
            java.lang.String r11 = r3.getString(r11)
            if (r11 == 0) goto L_0x0bc3
            java.lang.String r11 = "notif_tipo"
            java.lang.String r11 = r3.getString(r11)
            java.lang.String r6 = "1"
            boolean r6 = r11.equals(r6)
            if (r6 == 0) goto L_0x0bc3
            java.lang.String r6 = "notif_idelem"
            java.lang.String r8 = r3.getString(r6)
            goto L_0x0ba0
        L_0x0bc3:
            if (r3 == 0) goto L_0x0bf6
            java.lang.String r6 = "notif_idtema"
            java.lang.String r6 = r3.getString(r6)
            if (r6 == 0) goto L_0x0bf6
            r6 = r4
        L_0x0bce:
            int r11 = r1.length
            if (r6 >= r11) goto L_0x0beb
            java.lang.String r11 = "notif_idsecc"
            java.lang.String r11 = r3.getString(r11)
            r14 = r1[r6]
            boolean r11 = r11.equals(r14)
            if (r11 == 0) goto L_0x0be6
            java.lang.String r6 = "notif_idsecc"
            java.lang.String r8 = r3.getString(r6)
            goto L_0x0beb
        L_0x0be6:
            int r6 = r6 + 1
            r14 = 8
            goto L_0x0bce
        L_0x0beb:
            java.lang.String r3 = ""
            boolean r3 = r8.equals(r3)
            if (r3 == 0) goto L_0x0ba0
        L_0x0bf3:
            r6 = r7
            goto L_0x0cf0
        L_0x0bf6:
            if (r3 == 0) goto L_0x0c52
            java.lang.String r6 = "id_remit"
            java.lang.String r6 = r3.getString(r6)
            if (r6 == 0) goto L_0x0c52
            r3 = r4
        L_0x0c01:
            int r6 = r1.length
            if (r3 >= r6) goto L_0x0c49
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r11 = "s"
            r6.append(r11)
            r11 = r1[r3]
            r6.append(r11)
            java.lang.String r11 = "_tipo"
            r6.append(r11)
            java.lang.String r6 = r6.toString()
            int r6 = r5.getInt(r6, r4)
            r11 = 9
            if (r6 != r11) goto L_0x0c46
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r11 = "chat"
            r6.append(r11)
            r11 = r1[r3]
            r6.append(r11)
            java.lang.String r11 = "_validado"
            r6.append(r11)
            java.lang.String r6 = r6.toString()
            r11 = 1
            boolean r6 = r5.getBoolean(r6, r11)
            if (r6 == 0) goto L_0x0c46
            r8 = r1[r3]
            goto L_0x0c49
        L_0x0c46:
            int r3 = r3 + 1
            goto L_0x0c01
        L_0x0c49:
            java.lang.String r3 = ""
            boolean r3 = r8.equals(r3)
            if (r3 == 0) goto L_0x0ba0
            goto L_0x0bf3
        L_0x0c52:
            if (r3 == 0) goto L_0x0ba0
            java.lang.String r6 = "abrir_perfil"
            java.lang.String r3 = r3.getString(r6)
            if (r3 == 0) goto L_0x0ba0
            r3 = r4
        L_0x0c5d:
            int r6 = r1.length
            if (r3 >= r6) goto L_0x0ce6
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r11 = "s"
            r6.append(r11)
            r11 = r1[r3]
            r6.append(r11)
            java.lang.String r11 = "_tipo"
            r6.append(r11)
            java.lang.String r6 = r6.toString()
            int r6 = r5.getInt(r6, r4)
            r11 = 9
            if (r6 != r11) goto L_0x0c9f
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r11 = "chat"
            r6.append(r11)
            r11 = r1[r3]
            r6.append(r11)
            java.lang.String r11 = "_validado"
            r6.append(r11)
            java.lang.String r6 = r6.toString()
            r11 = 1
            boolean r6 = r5.getBoolean(r6, r11)
            if (r6 != 0) goto L_0x0ce4
        L_0x0c9f:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r11 = "s"
            r6.append(r11)
            r11 = r1[r3]
            r6.append(r11)
            java.lang.String r11 = "_tipo"
            r6.append(r11)
            java.lang.String r6 = r6.toString()
            int r6 = r5.getInt(r6, r4)
            r11 = 10
            if (r6 == r11) goto L_0x0ce4
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r11 = "s"
            r6.append(r11)
            r11 = r1[r3]
            r6.append(r11)
            java.lang.String r11 = "_tipo"
            r6.append(r11)
            java.lang.String r6 = r6.toString()
            int r6 = r5.getInt(r6, r4)
            r11 = 11
            if (r6 != r11) goto L_0x0ce0
            goto L_0x0ce4
        L_0x0ce0:
            int r3 = r3 + 1
            goto L_0x0c5d
        L_0x0ce4:
            r8 = r1[r3]
        L_0x0ce6:
            java.lang.String r3 = ""
            boolean r3 = r8.equals(r3)
            if (r3 == 0) goto L_0x0ba0
            goto L_0x0bf3
        L_0x0cf0:
            r0.f18078o = r4
            r0.f17969bx = r4
            r0.f17970by = r4
            r3 = r4
            r11 = r3
        L_0x0cf8:
            int r14 = r1.length
            if (r3 >= r14) goto L_0x1f56
            r14 = r1[r3]
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "s"
            r12.append(r13)
            r12.append(r14)
            java.lang.String r13 = "_ord"
            r12.append(r13)
            java.lang.String r12 = r12.toString()
            int r12 = r5.getInt(r12, r4)
            r13 = 1
            int r12 = r12 - r13
            java.lang.String r13 = ""
            boolean r13 = r8.equals(r13)
            if (r13 == 0) goto L_0x0d45
            if (r6 == r7) goto L_0x0d45
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r7 = "s"
            r13.append(r7)
            r13.append(r14)
            java.lang.String r7 = "_ocu"
            r13.append(r7)
            java.lang.String r7 = r13.toString()
            int r7 = r5.getInt(r7, r4)
            r13 = 1
            if (r7 == r13) goto L_0x0d4c
            int r6 = java.lang.Math.min(r6, r12)
            goto L_0x0d4c
        L_0x0d45:
            boolean r7 = r8.equals(r14)
            if (r7 == 0) goto L_0x0d4c
            r6 = r12
        L_0x0d4c:
            mega.boicot.i r7 = new mega.boicot.i
            r7.<init>()
            int r13 = java.lang.Integer.parseInt(r14)
            r7.f18330w = r13
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r15 = "s"
            r13.append(r15)
            r13.append(r14)
            java.lang.String r15 = "_tipo"
            r13.append(r15)
            java.lang.String r13 = r13.toString()
            int r13 = r5.getInt(r13, r4)
            r7.f18325r = r13
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r15 = "s"
            r13.append(r15)
            r13.append(r14)
            java.lang.String r15 = "_tit"
            r13.append(r15)
            java.lang.String r13 = r13.toString()
            java.lang.String r15 = ""
            java.lang.String r13 = r5.getString(r13, r15)
            r7.f18256a = r13
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r15 = "s"
            r13.append(r15)
            r13.append(r14)
            java.lang.String r15 = "_de"
            r13.append(r15)
            java.lang.String r13 = r13.toString()
            java.lang.String r15 = ""
            java.lang.String r13 = r5.getString(r13, r15)
            r7.f18310c = r13
            int r13 = r0.f18080q
            if (r13 <= 0) goto L_0x0dcc
            java.lang.String r13 = r7.f18256a
            java.lang.String r13 = m23855e(r13)
            java.lang.String r13 = r13.toLowerCase()
            r7.f18309b = r13
            java.lang.String r13 = r7.f18310c
            java.lang.String r13 = m23855e(r13)
            java.lang.String r13 = r13.toLowerCase()
            r7.f18311d = r13
            goto L_0x0dd4
        L_0x0dcc:
            java.lang.String r13 = ""
            r7.f18309b = r13
            java.lang.String r13 = ""
            r7.f18311d = r13
        L_0x0dd4:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r15 = "s"
            r13.append(r15)
            r13.append(r14)
            java.lang.String r15 = "_k"
            r13.append(r15)
            java.lang.String r13 = r13.toString()
            java.lang.String r15 = ""
            java.lang.String r13 = r5.getString(r13, r15)
            java.lang.String r13 = r13.trim()
            java.lang.String r15 = ""
            boolean r15 = r13.equals(r15)
            if (r15 != 0) goto L_0x0e25
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            r7.f18318k = r15
            java.lang.String r15 = ","
            java.lang.String[] r13 = r13.split(r15)
            int r15 = r13.length
            r10 = r4
        L_0x0e0b:
            if (r10 >= r15) goto L_0x0e25
            r9 = r13[r10]
            java.lang.String r9 = r9.trim()
            java.lang.String r4 = ""
            boolean r4 = r9.equals(r4)
            if (r4 != 0) goto L_0x0e20
            java.util.ArrayList<java.lang.String> r4 = r7.f18318k
            r4.add(r9)
        L_0x0e20:
            int r10 = r10 + 1
            r4 = 0
            r9 = 2
            goto L_0x0e0b
        L_0x0e25:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r9 = "s"
            r4.append(r9)
            r4.append(r14)
            java.lang.String r9 = "_i"
            r4.append(r9)
            java.lang.String r4 = r4.toString()
            java.lang.String r9 = "11"
            java.lang.String r4 = r5.getString(r4, r9)
            r9 = 0
            r10 = 1
            java.lang.String r13 = r4.substring(r9, r10)
            java.lang.String r9 = "1"
            boolean r9 = r13.equals(r9)
            r7.f18237H = r9
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "s"
            r9.append(r10)
            r9.append(r14)
            java.lang.String r10 = "_idgo"
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            java.lang.String r10 = ""
            java.lang.String r9 = r5.getString(r9, r10)
            r7.f18316i = r9
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "s"
            r9.append(r10)
            r9.append(r14)
            java.lang.String r10 = "_ocu"
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            r10 = 0
            int r9 = r5.getInt(r9, r10)
            r13 = 1
            if (r9 != r13) goto L_0x0e8e
            r7.f18333z = r13
            goto L_0x0e99
        L_0x0e8e:
            r7.f18333z = r10
            int r9 = r0.f18078o
            r7.f18331x = r9
            int r9 = r0.f18078o
            int r9 = r9 + r13
            r0.f18078o = r9
        L_0x0e99:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "s"
            r9.append(r10)
            r9.append(r14)
            java.lang.String r10 = "_ptit"
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            java.lang.String r10 = ""
            java.lang.String r9 = r5.getString(r9, r10)
            r7.f18319l = r9
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "s"
            r9.append(r10)
            r9.append(r14)
            java.lang.String r10 = "_ptxt"
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            java.lang.String r10 = ""
            java.lang.String r9 = r5.getString(r9, r10)
            r7.f18320m = r9
            java.lang.String r9 = "1"
            int r10 = r4.length()
            r13 = 1
            if (r10 <= r13) goto L_0x0ee3
            r10 = 2
            java.lang.String r9 = r4.substring(r13, r10)
        L_0x0ee3:
            r7.f18321n = r13
            r4 = 0
            r7.f18322o = r4
            java.lang.String r10 = "0"
            boolean r10 = r9.equals(r10)
            if (r10 == 0) goto L_0x0ef3
            r7.f18321n = r4
            goto L_0x0efd
        L_0x0ef3:
            java.lang.String r4 = "2"
            boolean r4 = r9.equals(r4)
            if (r4 == 0) goto L_0x0efd
            r7.f18322o = r13
        L_0x0efd:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r9 = "s"
            r4.append(r9)
            r4.append(r14)
            java.lang.String r9 = "_tp"
            r4.append(r9)
            java.lang.String r4 = r4.toString()
            r9 = 0
            int r4 = r5.getInt(r4, r9)
            r7.f18238I = r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r10 = "s"
            r4.append(r10)
            r4.append(r14)
            java.lang.String r10 = "_r"
            r4.append(r10)
            java.lang.String r4 = r4.toString()
            int r4 = r5.getInt(r4, r9)
            r9 = 1
            if (r4 != r9) goto L_0x0f39
            r4 = 1
            goto L_0x0f3a
        L_0x0f39:
            r4 = 0
        L_0x0f3a:
            r7.f18235F = r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r9 = "s"
            r4.append(r9)
            r4.append(r14)
            java.lang.String r9 = "_d"
            r4.append(r9)
            java.lang.String r4 = r4.toString()
            r9 = 0
            int r4 = r5.getInt(r4, r9)
            r9 = 1
            if (r4 != r9) goto L_0x0f5c
            r4 = 1
            goto L_0x0f5d
        L_0x0f5c:
            r4 = 0
        L_0x0f5d:
            r7.f18236G = r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r9 = "s"
            r4.append(r9)
            r4.append(r14)
            java.lang.String r9 = "_r_m"
            r4.append(r9)
            java.lang.String r4 = r4.toString()
            r9 = 0
            int r4 = r5.getInt(r4, r9)
            r7.f18243N = r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r10 = "s"
            r4.append(r10)
            r4.append(r14)
            java.lang.String r10 = "_ext"
            r4.append(r10)
            java.lang.String r4 = r4.toString()
            int r4 = r5.getInt(r4, r9)
            r7.f18329v = r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r10 = "s"
            r4.append(r10)
            r4.append(r14)
            java.lang.String r10 = "_adapt"
            r4.append(r10)
            java.lang.String r4 = r4.toString()
            int r4 = r5.getInt(r4, r9)
            r10 = 1
            if (r4 != r10) goto L_0x0fb8
            r7.f18230A = r10
            goto L_0x0fba
        L_0x0fb8:
            r7.f18230A = r9
        L_0x0fba:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r10 = "s"
            r4.append(r10)
            r4.append(r14)
            java.lang.String r10 = "_stream"
            r4.append(r10)
            java.lang.String r4 = r4.toString()
            int r4 = r5.getInt(r4, r9)
            r10 = 1
            if (r4 != r10) goto L_0x0fda
            r7.f18231B = r10
            goto L_0x0fdc
        L_0x0fda:
            r7.f18231B = r9
        L_0x0fdc:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r10 = "s"
            r4.append(r10)
            r4.append(r14)
            java.lang.String r10 = "_idfondo"
            r4.append(r10)
            java.lang.String r4 = r4.toString()
            int r4 = r5.getInt(r4, r9)
            r7.f18327t = r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r10 = "s"
            r4.append(r10)
            r4.append(r14)
            java.lang.String r10 = "_vf"
            r4.append(r10)
            java.lang.String r4 = r4.toString()
            int r4 = r5.getInt(r4, r9)
            r7.f18328u = r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r10 = "s"
            r4.append(r10)
            r4.append(r14)
            java.lang.String r10 = "_fondo_modif"
            r4.append(r10)
            java.lang.String r4 = r4.toString()
            int r4 = r5.getInt(r4, r9)
            r10 = 1
            if (r4 != r10) goto L_0x1034
            r7.f18242M = r10
            goto L_0x1036
        L_0x1034:
            r7.f18242M = r9
        L_0x1036:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r9 = "s"
            r4.append(r9)
            r4.append(r14)
            java.lang.String r9 = "_url"
            r4.append(r9)
            java.lang.String r4 = r4.toString()
            java.lang.String r9 = ""
            java.lang.String r4 = r5.getString(r4, r9)
            r7.f18312e = r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r9 = "s"
            r4.append(r9)
            r4.append(r14)
            java.lang.String r9 = "_ua"
            r4.append(r9)
            java.lang.String r4 = r4.toString()
            java.lang.String r9 = ""
            java.lang.String r4 = r5.getString(r4, r9)
            r7.f18317j = r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r9 = "s"
            r4.append(r9)
            r4.append(r14)
            java.lang.String r9 = "_html"
            r4.append(r9)
            java.lang.String r4 = r4.toString()
            java.lang.String r9 = ""
            java.lang.String r4 = r5.getString(r4, r9)
            r7.f18313f = r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r9 = "s"
            r4.append(r9)
            r4.append(r14)
            java.lang.String r9 = "_pur"
            r4.append(r9)
            java.lang.String r4 = r4.toString()
            r9 = 1
            int r4 = r5.getInt(r4, r9)
            if (r4 != r9) goto L_0x10b0
            r7.f18234E = r9
            goto L_0x10b3
        L_0x10b0:
            r4 = 0
            r7.f18234E = r4
        L_0x10b3:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r9 = "s"
            r4.append(r9)
            r4.append(r14)
            java.lang.String r9 = "_loa"
            r4.append(r9)
            java.lang.String r4 = r4.toString()
            r9 = 1
            int r4 = r5.getInt(r4, r9)
            if (r4 != r9) goto L_0x10d3
            r7.f18232C = r9
            goto L_0x10d6
        L_0x10d3:
            r4 = 0
            r7.f18232C = r4
        L_0x10d6:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r9 = "s"
            r4.append(r9)
            r4.append(r14)
            java.lang.String r9 = "_zoo"
            r4.append(r9)
            java.lang.String r4 = r4.toString()
            r9 = 1
            int r4 = r5.getInt(r4, r9)
            if (r4 != r9) goto L_0x10f7
            r7.f18233D = r9
            r4 = 0
            goto L_0x10fa
        L_0x10f7:
            r4 = 0
            r7.f18233D = r4
        L_0x10fa:
            r7.f18239J = r4
            int r4 = r7.f18325r
            if (r4 != r9) goto L_0x1133
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r9 = "s"
            r4.append(r9)
            r4.append(r14)
            java.lang.String r9 = "_i1"
            r4.append(r9)
            java.lang.String r4 = r4.toString()
            java.lang.String r9 = ""
            java.lang.String r4 = r5.getString(r4, r9)
            java.lang.String r9 = ""
            boolean r9 = r4.equals(r9)
            if (r9 != 0) goto L_0x116a
            r9 = 0
            r10 = 1
            java.lang.String r4 = r4.substring(r9, r10)
            java.lang.String r9 = "1"
            boolean r4 = r4.equals(r9)
            r7.f18239J = r4
            goto L_0x116a
        L_0x1133:
            int r4 = r7.f18325r
            r9 = 2
            if (r4 != r9) goto L_0x116a
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r9 = "s"
            r4.append(r9)
            r4.append(r14)
            java.lang.String r9 = "_i2"
            r4.append(r9)
            java.lang.String r4 = r4.toString()
            java.lang.String r9 = ""
            java.lang.String r4 = r5.getString(r4, r9)
            java.lang.String r9 = ""
            boolean r9 = r4.equals(r9)
            if (r9 != 0) goto L_0x116a
            r9 = 0
            r10 = 1
            java.lang.String r4 = r4.substring(r9, r10)
            java.lang.String r9 = "1"
            boolean r4 = r4.equals(r9)
            r7.f18239J = r4
        L_0x116a:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r9 = "s"
            r4.append(r9)
            r4.append(r14)
            java.lang.String r9 = "_c1"
            r4.append(r9)
            java.lang.String r4 = r4.toString()
            java.lang.String r9 = ""
            java.lang.String r4 = r5.getString(r4, r9)
            r7.f18314g = r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r9 = "s"
            r4.append(r9)
            r4.append(r14)
            java.lang.String r9 = "_c2"
            r4.append(r9)
            java.lang.String r4 = r4.toString()
            java.lang.String r9 = ""
            java.lang.String r4 = r5.getString(r4, r9)
            r7.f18315h = r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r9 = "s"
            r4.append(r9)
            r4.append(r14)
            java.lang.String r9 = "_c_peritem"
            r4.append(r9)
            java.lang.String r4 = r4.toString()
            r9 = 0
            int r4 = r5.getInt(r4, r9)
            r7.f18326s = r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r9 = "s"
            r4.append(r9)
            r4.append(r14)
            java.lang.String r9 = "_c_tit"
            r4.append(r9)
            java.lang.String r4 = r4.toString()
            java.lang.String r9 = ""
            java.lang.String r4 = r5.getString(r4, r9)
            r7.f18323p = r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r9 = "s"
            r4.append(r9)
            r4.append(r14)
            java.lang.String r9 = "_c_fecha"
            r4.append(r9)
            java.lang.String r4 = r4.toString()
            java.lang.String r9 = ""
            java.lang.String r4 = r5.getString(r4, r9)
            r7.f18324q = r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r9 = "s"
            r4.append(r9)
            r4.append(r14)
            java.lang.String r9 = "_mostrar_img"
            r4.append(r9)
            java.lang.String r4 = r4.toString()
            r9 = 1
            int r4 = r5.getInt(r4, r9)
            if (r4 != r9) goto L_0x121f
            r7.f18240K = r9
            goto L_0x1222
        L_0x121f:
            r4 = 0
            r7.f18240K = r4
        L_0x1222:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r9 = "s"
            r4.append(r9)
            r4.append(r14)
            java.lang.String r9 = "_mostrar_fecha"
            r4.append(r9)
            java.lang.String r4 = r4.toString()
            r9 = 1
            int r4 = r5.getInt(r4, r9)
            if (r4 != r9) goto L_0x1243
            r7.f18241L = r9
            r4 = 0
            goto L_0x1246
        L_0x1243:
            r4 = 0
            r7.f18241L = r4
        L_0x1246:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "s"
            r9.append(r10)
            r9.append(r14)
            java.lang.String r10 = "_f_perfil"
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            int r9 = r5.getInt(r9, r4)
            r7.f18305aw = r9
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "s"
            r9.append(r10)
            r9.append(r14)
            java.lang.String r10 = "_fnac"
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            int r9 = r5.getInt(r9, r4)
            r7.f18306ax = r9
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "s"
            r9.append(r10)
            r9.append(r14)
            java.lang.String r10 = "_sexo"
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            int r9 = r5.getInt(r9, r4)
            r7.f18307ay = r9
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "s"
            r9.append(r10)
            r9.append(r14)
            java.lang.String r10 = "_descr"
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            int r9 = r5.getInt(r9, r4)
            r7.f18308az = r9
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "s"
            r9.append(r10)
            r9.append(r14)
            java.lang.String r10 = "_dist"
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            int r9 = r5.getInt(r9, r4)
            r7.f18257aA = r9
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r9 = "s"
            r4.append(r9)
            r4.append(r14)
            java.lang.String r9 = "_com"
            r4.append(r9)
            java.lang.String r4 = r4.toString()
            r9 = 1
            int r4 = r5.getInt(r4, r9)
            if (r4 != r9) goto L_0x12f1
            r4 = 1
            goto L_0x12f2
        L_0x12f1:
            r4 = 0
        L_0x12f2:
            r7.f18245P = r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r9 = "s"
            r4.append(r9)
            r4.append(r14)
            java.lang.String r9 = "_gal"
            r4.append(r9)
            java.lang.String r4 = r4.toString()
            r9 = 1
            int r4 = r5.getInt(r4, r9)
            if (r4 != r9) goto L_0x1313
            r4 = 1
            goto L_0x1314
        L_0x1313:
            r4 = 0
        L_0x1314:
            r7.f18246Q = r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r9 = "s"
            r4.append(r9)
            r4.append(r14)
            java.lang.String r9 = "_fdist"
            r4.append(r9)
            java.lang.String r4 = r4.toString()
            r9 = 1
            int r4 = r5.getInt(r4, r9)
            if (r4 != r9) goto L_0x1335
            r4 = 1
            goto L_0x1336
        L_0x1335:
            r4 = 0
        L_0x1336:
            r7.f18248S = r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r9 = "s"
            r4.append(r9)
            r4.append(r14)
            java.lang.String r9 = "_fsexo"
            r4.append(r9)
            java.lang.String r4 = r4.toString()
            r9 = 1
            int r4 = r5.getInt(r4, r9)
            if (r4 != r9) goto L_0x1357
            r4 = 1
            goto L_0x1358
        L_0x1357:
            r4 = 0
        L_0x1358:
            r7.f18249T = r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r9 = "s"
            r4.append(r9)
            r4.append(r14)
            java.lang.String r9 = "_fn"
            r4.append(r9)
            java.lang.String r4 = r4.toString()
            r9 = 1
            int r4 = r5.getInt(r4, r9)
            if (r4 != r9) goto L_0x1379
            r4 = 1
            goto L_0x137a
        L_0x1379:
            r4 = 0
        L_0x137a:
            r7.f18250U = r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r9 = "s"
            r4.append(r9)
            r4.append(r14)
            java.lang.String r9 = "_fedad1"
            r4.append(r9)
            java.lang.String r4 = r4.toString()
            r9 = 1
            int r4 = r5.getInt(r4, r9)
            if (r4 != r9) goto L_0x139b
            r4 = 1
            goto L_0x139c
        L_0x139b:
            r4 = 0
        L_0x139c:
            r7.f18251V = r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r9 = "s"
            r4.append(r9)
            r4.append(r14)
            java.lang.String r9 = "_fedad2"
            r4.append(r9)
            java.lang.String r4 = r4.toString()
            r9 = 1
            int r4 = r5.getInt(r4, r9)
            if (r4 != r9) goto L_0x13bd
            r4 = 1
            goto L_0x13be
        L_0x13bd:
            r4 = 0
        L_0x13be:
            r7.f18252W = r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r9 = "s"
            r4.append(r9)
            r4.append(r14)
            java.lang.String r9 = "_fdist_d"
            r4.append(r9)
            java.lang.String r4 = r4.toString()
            r9 = 0
            int r4 = r5.getInt(r4, r9)
            r7.f18253X = r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r10 = "s"
            r4.append(r10)
            r4.append(r14)
            java.lang.String r10 = "_fsexo_d"
            r4.append(r10)
            java.lang.String r4 = r4.toString()
            int r4 = r5.getInt(r4, r9)
            r7.f18254Y = r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r10 = "s"
            r4.append(r10)
            r4.append(r14)
            java.lang.String r10 = "_fedad1_d"
            r4.append(r10)
            java.lang.String r4 = r4.toString()
            int r4 = r5.getInt(r4, r9)
            r7.f18255Z = r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r10 = "s"
            r4.append(r10)
            r4.append(r14)
            java.lang.String r10 = "_fedad2_d"
            r4.append(r10)
            java.lang.String r4 = r4.toString()
            int r4 = r5.getInt(r4, r9)
            r7.f18283aa = r4
            int r4 = r7.f18325r
            r9 = 16
            if (r4 != r9) goto L_0x1651
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r9 = "s"
            r4.append(r9)
            r4.append(r14)
            java.lang.String r9 = "_fdist"
            r4.append(r9)
            java.lang.String r4 = r4.toString()
            r9 = 1
            int r4 = r5.getInt(r4, r9)
            if (r4 != r9) goto L_0x1456
            r4 = 1
            goto L_0x1457
        L_0x1456:
            r4 = 0
        L_0x1457:
            r7.f18290ah = r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r9 = "s"
            r4.append(r9)
            r4.append(r14)
            java.lang.String r9 = "_i16"
            r4.append(r9)
            java.lang.String r4 = r4.toString()
            java.lang.String r9 = "1111110111101"
            java.lang.String r4 = r5.getString(r4, r9)
            r9 = 0
            r10 = 1
            java.lang.String r13 = r4.substring(r9, r10)
            java.lang.String r9 = "1"
            boolean r9 = r13.equals(r9)
            r7.f18286ad = r9
            r9 = 2
            java.lang.String r13 = r4.substring(r10, r9)
            java.lang.String r10 = "1"
            boolean r10 = r13.equals(r10)
            r7.f18285ac = r10
            r10 = 3
            java.lang.String r13 = r4.substring(r9, r10)
            java.lang.String r9 = "1"
            boolean r9 = r13.equals(r9)
            r7.f18288af = r9
            r9 = 4
            java.lang.String r13 = r4.substring(r10, r9)
            java.lang.String r10 = "1"
            boolean r10 = r13.equals(r10)
            r7.f18287ae = r10
            r10 = 5
            java.lang.String r13 = r4.substring(r9, r10)
            java.lang.String r9 = "1"
            boolean r9 = r13.equals(r9)
            r7.f18289ag = r9
            r9 = 6
            java.lang.String r13 = r4.substring(r10, r9)
            int r10 = java.lang.Integer.parseInt(r13)
            r7.f18292aj = r10
            r10 = 7
            java.lang.String r13 = r4.substring(r9, r10)
            java.lang.String r15 = "1"
            boolean r13 = r13.equals(r15)
            r7.f18291ai = r13
            r13 = 8
            java.lang.String r15 = r4.substring(r10, r13)
            int r15 = java.lang.Integer.parseInt(r15)
            r7.f18293ak = r15
            r15 = 9
            java.lang.String r9 = r4.substring(r13, r15)
            java.lang.String r10 = "1"
            boolean r9 = r9.equals(r10)
            r7.f18295am = r9
            r9 = 10
            java.lang.String r10 = r4.substring(r15, r9)
            java.lang.String r13 = "1"
            boolean r10 = r10.equals(r13)
            r7.f18296an = r10
            r10 = 11
            java.lang.String r13 = r4.substring(r9, r10)
            java.lang.String r9 = "1"
            boolean r9 = r13.equals(r9)
            r7.f18241L = r9
            r9 = 12
            java.lang.String r13 = r4.substring(r10, r9)
            int r13 = java.lang.Integer.parseInt(r13)
            r7.f18294al = r13
            r13 = 13
            java.lang.String r4 = r4.substring(r9, r13)
            java.lang.String r13 = "1"
            boolean r4 = r4.equals(r13)
            r7.f18297ao = r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r13 = "s"
            r4.append(r13)
            r4.append(r14)
            java.lang.String r13 = "_t_di"
            r4.append(r13)
            java.lang.String r4 = r4.toString()
            java.lang.String r13 = ""
            java.lang.String r4 = r5.getString(r4, r13)
            r7.f18303au = r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r13 = "s"
            r4.append(r13)
            r4.append(r14)
            java.lang.String r13 = "_t_mp"
            r4.append(r13)
            java.lang.String r4 = r4.toString()
            java.lang.String r13 = ""
            java.lang.String r4 = r5.getString(r4, r13)
            r7.f18299aq = r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r13 = "s"
            r4.append(r13)
            r4.append(r14)
            java.lang.String r13 = "_t_mv"
            r4.append(r13)
            java.lang.String r4 = r4.toString()
            java.lang.String r13 = ""
            java.lang.String r4 = r5.getString(r4, r13)
            r7.f18298ap = r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r13 = "s"
            r4.append(r13)
            r4.append(r14)
            java.lang.String r13 = "_t_de"
            r4.append(r13)
            java.lang.String r4 = r4.toString()
            java.lang.String r13 = ""
            java.lang.String r4 = r5.getString(r4, r13)
            r7.f18301as = r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r13 = "s"
            r4.append(r13)
            r4.append(r14)
            java.lang.String r13 = "_t_fa"
            r4.append(r13)
            java.lang.String r4 = r4.toString()
            java.lang.String r13 = ""
            java.lang.String r4 = r5.getString(r4, r13)
            r7.f18300ar = r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r13 = "s"
            r4.append(r13)
            r4.append(r14)
            java.lang.String r13 = "_t_ul"
            r4.append(r13)
            java.lang.String r4 = r4.toString()
            java.lang.String r13 = ""
            java.lang.String r4 = r5.getString(r4, r13)
            r7.f18302at = r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r13 = "s"
            r4.append(r13)
            r4.append(r14)
            java.lang.String r13 = "_t_pr"
            r4.append(r13)
            java.lang.String r4 = r4.toString()
            java.lang.String r13 = ""
            java.lang.String r4 = r5.getString(r4, r13)
            r7.f18304av = r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r13 = "s"
            r4.append(r13)
            r4.append(r14)
            java.lang.String r13 = "_cats"
            r4.append(r13)
            java.lang.String r4 = r4.toString()
            java.lang.String r13 = ""
            java.lang.String r4 = r5.getString(r4, r13)
            java.lang.String r13 = "@"
            java.lang.String[] r4 = r4.split(r13)
            int r13 = r4.length
            mega.boicot.d[] r13 = new mega.boicot.C5658d[r13]
            r7.f18284ab = r13
            r13 = 0
        L_0x1619:
            int r9 = r4.length
            if (r13 >= r9) goto L_0x1651
            mega.boicot.d r9 = new mega.boicot.d
            r9.<init>()
            r10 = r4[r13]
            java.lang.String r15 = ";"
            java.lang.String[] r10 = r10.split(r15)
            r18 = r4
            r15 = 0
            r4 = r10[r15]
            int r4 = java.lang.Integer.parseInt(r4)
            r9.f18191a = r4
            r4 = 1
            r15 = r10[r4]
            java.lang.String r4 = "1"
            boolean r4 = r15.equals(r4)
            r9.f18193c = r4
            r4 = 2
            r10 = r10[r4]
            r9.f18192b = r10
            mega.boicot.d[] r4 = r7.f18284ab
            r4[r13] = r9
            int r13 = r13 + 1
            r4 = r18
            r10 = 11
            r15 = 9
            goto L_0x1619
        L_0x1651:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r9 = "s"
            r4.append(r9)
            r4.append(r14)
            java.lang.String r9 = "_f_chat"
            r4.append(r9)
            java.lang.String r4 = r4.toString()
            r9 = 0
            int r4 = r5.getInt(r4, r9)
            r7.f18258aB = r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r9 = "s"
            r4.append(r9)
            r4.append(r14)
            java.lang.String r9 = "_priv"
            r4.append(r9)
            java.lang.String r4 = r4.toString()
            r9 = 1
            int r4 = r5.getInt(r4, r9)
            if (r4 != r9) goto L_0x168f
            r7.f18244O = r9
            r4 = 0
            goto L_0x1692
        L_0x168f:
            r4 = 0
            r7.f18244O = r4
        L_0x1692:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "s"
            r9.append(r10)
            r9.append(r14)
            java.lang.String r10 = "_accext"
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            int r9 = r5.getInt(r9, r4)
            r4 = 1
            if (r9 != r4) goto L_0x16b1
            r4 = 1
            goto L_0x16b2
        L_0x16b1:
            r4 = 0
        L_0x16b2:
            r7.f18247R = r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r9 = "s"
            r4.append(r9)
            r4.append(r14)
            java.lang.String r9 = "_cat"
            r4.append(r9)
            java.lang.String r4 = r4.toString()
            r9 = 0
            int r4 = r5.getInt(r4, r9)
            r7.f18259aC = r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r10 = "s"
            r4.append(r10)
            r4.append(r14)
            java.lang.String r10 = "_sub"
            r4.append(r10)
            java.lang.String r4 = r4.toString()
            int r4 = r5.getInt(r4, r9)
            r7.f18260aD = r4
            int r4 = r7.f18325r
            r9 = 14
            if (r4 != r9) goto L_0x1710
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r9 = "s"
            r4.append(r9)
            r4.append(r14)
            java.lang.String r9 = "_v"
            r4.append(r9)
            java.lang.String r4 = r4.toString()
            r9 = 0
            int r4 = r5.getInt(r4, r9)
            r7.f18332y = r4
        L_0x1710:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r9 = "s"
            r4.append(r9)
            r4.append(r14)
            java.lang.String r9 = "_ncols"
            r4.append(r9)
            java.lang.String r4 = r4.toString()
            r9 = 1
            int r4 = r5.getInt(r4, r9)
            r7.f18269aM = r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r9 = "s"
            r4.append(r9)
            r4.append(r14)
            java.lang.String r9 = "_padding"
            r4.append(r9)
            java.lang.String r4 = r4.toString()
            r9 = 2
            int r4 = r5.getInt(r4, r9)
            r7.f18270aN = r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r9 = "s"
            r4.append(r9)
            r4.append(r14)
            java.lang.String r9 = "_txt_radius"
            r4.append(r9)
            java.lang.String r4 = r4.toString()
            r9 = 5
            int r4 = r5.getInt(r4, r9)
            r7.f18271aO = r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r9 = "s"
            r4.append(r9)
            r4.append(r14)
            java.lang.String r9 = "_mostrar_icos"
            r4.append(r9)
            java.lang.String r4 = r4.toString()
            r9 = 1
            int r4 = r5.getInt(r4, r9)
            if (r4 != 0) goto L_0x1788
            r4 = 0
            r7.f18273aQ = r4
            goto L_0x178a
        L_0x1788:
            r7.f18273aQ = r9
        L_0x178a:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r10 = "s"
            r4.append(r10)
            r4.append(r14)
            java.lang.String r10 = "_mostrar_txt"
            r4.append(r10)
            java.lang.String r4 = r4.toString()
            int r4 = r5.getInt(r4, r9)
            if (r4 != 0) goto L_0x17aa
            r4 = 0
            r7.f18274aR = r4
            goto L_0x17ac
        L_0x17aa:
            r7.f18274aR = r9
        L_0x17ac:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r10 = "s"
            r4.append(r10)
            r4.append(r14)
            java.lang.String r10 = "_icos_izq"
            r4.append(r10)
            java.lang.String r4 = r4.toString()
            int r4 = r5.getInt(r4, r9)
            if (r4 != 0) goto L_0x17cc
            r4 = 0
            r7.f18275aS = r4
            goto L_0x17ce
        L_0x17cc:
            r7.f18275aS = r9
        L_0x17ce:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r10 = "s"
            r4.append(r10)
            r4.append(r14)
            java.lang.String r10 = "_anim"
            r4.append(r10)
            java.lang.String r4 = r4.toString()
            int r4 = r5.getInt(r4, r9)
            if (r4 != 0) goto L_0x17ee
            r4 = 0
            r7.f18276aT = r4
            goto L_0x17f0
        L_0x17ee:
            r7.f18276aT = r9
        L_0x17f0:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r10 = "s"
            r4.append(r10)
            r4.append(r14)
            java.lang.String r10 = "_c"
            r4.append(r10)
            java.lang.String r4 = r4.toString()
            int r4 = r5.getInt(r4, r9)
            if (r4 != 0) goto L_0x1810
            r4 = 0
            r7.f18277aU = r4
            goto L_0x1812
        L_0x1810:
            r7.f18277aU = r9
        L_0x1812:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r10 = "s"
            r4.append(r10)
            r4.append(r14)
            java.lang.String r10 = "_txt_c"
            r4.append(r10)
            java.lang.String r4 = r4.toString()
            int r4 = r5.getInt(r4, r9)
            if (r4 != 0) goto L_0x1832
            r4 = 0
            r7.f18278aV = r4
            goto L_0x1834
        L_0x1832:
            r7.f18278aV = r9
        L_0x1834:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r10 = "s"
            r4.append(r10)
            r4.append(r14)
            java.lang.String r10 = "_txt_b"
            r4.append(r10)
            java.lang.String r4 = r4.toString()
            r10 = 0
            int r4 = r5.getInt(r4, r10)
            if (r4 != r9) goto L_0x1853
            r4 = 1
            goto L_0x1854
        L_0x1853:
            r4 = 0
        L_0x1854:
            r7.f18279aW = r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r9 = "s"
            r4.append(r9)
            r4.append(r14)
            java.lang.String r9 = "_e"
            r4.append(r9)
            java.lang.String r4 = r4.toString()
            r9 = 0
            int r4 = r5.getInt(r4, r9)
            r7.f18272aP = r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r9 = "s"
            r4.append(r9)
            r4.append(r14)
            java.lang.String r9 = "_txt_bg"
            r4.append(r9)
            java.lang.String r4 = r4.toString()
            java.lang.String r9 = ""
            java.lang.String r4 = r5.getString(r4, r9)
            r7.f18280aX = r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r9 = "s"
            r4.append(r9)
            r4.append(r14)
            java.lang.String r9 = "_txt_col"
            r4.append(r9)
            java.lang.String r4 = r4.toString()
            java.lang.String r9 = ""
            java.lang.String r4 = r5.getString(r4, r9)
            r7.f18281aY = r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r9 = "s"
            r4.append(r9)
            r4.append(r14)
            java.lang.String r9 = "_seccs"
            r4.append(r9)
            java.lang.String r4 = r4.toString()
            java.lang.String r9 = ""
            java.lang.String r4 = r5.getString(r4, r9)
            r7.f18282aZ = r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r9 = "s"
            r4.append(r9)
            r4.append(r14)
            java.lang.String r9 = "_ico_id"
            r4.append(r9)
            java.lang.String r4 = r4.toString()
            r9 = 0
            int r4 = r5.getInt(r4, r9)
            r7.f18265aI = r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r10 = "s"
            r4.append(r10)
            r4.append(r14)
            java.lang.String r10 = "_v_ico"
            r4.append(r10)
            java.lang.String r4 = r4.toString()
            int r4 = r5.getInt(r4, r9)
            r7.f18266aJ = r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r10 = "s"
            r4.append(r10)
            r4.append(r14)
            java.lang.String r10 = "_w_ico"
            r4.append(r10)
            java.lang.String r4 = r4.toString()
            int r4 = r5.getInt(r4, r9)
            r7.f18267aK = r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r10 = "s"
            r4.append(r10)
            r4.append(r14)
            java.lang.String r10 = "_h_ico"
            r4.append(r10)
            java.lang.String r4 = r4.toString()
            int r4 = r5.getInt(r4, r9)
            r7.f18268aL = r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r10 = "s"
            r4.append(r10)
            r4.append(r14)
            java.lang.String r10 = "_ico"
            r4.append(r10)
            java.lang.String r4 = r4.toString()
            int r4 = r5.getInt(r4, r9)
            r10 = 1
            if (r4 != r10) goto L_0x1966
            r7.f18264aH = r10
            boolean r4 = r7.f18333z
            if (r4 != 0) goto L_0x199a
            r0.f17969bx = r10
            r0.f17970by = r10
            goto L_0x199a
        L_0x1966:
            r7.f18264aH = r9
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException | IOException | OutOfMemoryError -> 0x198f }
            r4.<init>()     // Catch:{ FileNotFoundException | IOException | OutOfMemoryError -> 0x198f }
            java.lang.String r9 = "img_s"
            r4.append(r9)     // Catch:{ FileNotFoundException | IOException | OutOfMemoryError -> 0x198f }
            r4.append(r14)     // Catch:{ FileNotFoundException | IOException | OutOfMemoryError -> 0x198f }
            java.lang.String r9 = "_ico"
            r4.append(r9)     // Catch:{ FileNotFoundException | IOException | OutOfMemoryError -> 0x198f }
            java.lang.String r4 = r4.toString()     // Catch:{ FileNotFoundException | IOException | OutOfMemoryError -> 0x198f }
            java.io.FileInputStream r4 = r0.openFileInput(r4)     // Catch:{ FileNotFoundException | IOException | OutOfMemoryError -> 0x198f }
            java.io.FileDescriptor r9 = r4.getFD()     // Catch:{ FileNotFoundException | IOException | OutOfMemoryError -> 0x198f }
            android.graphics.Bitmap r9 = android.graphics.BitmapFactory.decodeFileDescriptor(r9)     // Catch:{ FileNotFoundException | IOException | OutOfMemoryError -> 0x198f }
            r7.f18263aG = r9     // Catch:{ FileNotFoundException | IOException | OutOfMemoryError -> 0x198f }
            r4.close()     // Catch:{ FileNotFoundException | IOException | OutOfMemoryError -> 0x198f }
        L_0x198f:
            android.graphics.Bitmap r4 = r7.f18263aG
            if (r4 == 0) goto L_0x199a
            boolean r4 = r7.f18333z
            if (r4 != 0) goto L_0x199a
            r4 = 1
            r0.f17970by = r4
        L_0x199a:
            int r4 = r7.f18325r
            r9 = 5
            if (r4 != r9) goto L_0x19a2
            r0.f17843B = r12
            goto L_0x19a9
        L_0x19a2:
            int r4 = r7.f18325r
            r10 = 4
            if (r4 != r10) goto L_0x19a9
            r0.f17844C = r12
        L_0x19a9:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r10 = "s"
            r4.append(r10)
            r4.append(r14)
            java.lang.String r10 = "_idtemas"
            r4.append(r10)
            java.lang.String r4 = r4.toString()
            java.lang.String r10 = ""
            java.lang.String r4 = r5.getString(r4, r10)
            java.lang.String r10 = ""
            boolean r10 = r4.equals(r10)
            if (r10 != 0) goto L_0x19f0
            java.lang.String r10 = ","
            java.lang.String[] r4 = r4.split(r10)
            int r10 = r4.length
            mega.boicot.j[] r10 = new mega.boicot.C5664j[r10]
            r7.f18262aF = r10
            r10 = 0
        L_0x19d9:
            int r13 = r4.length
            if (r10 >= r13) goto L_0x19f0
            r13 = r4[r10]
            mega.boicot.j r15 = new mega.boicot.j
            r15.<init>()
            int r13 = java.lang.Integer.parseInt(r13)
            r15.f18334a = r13
            mega.boicot.j[] r13 = r7.f18262aF
            r13[r10] = r15
            int r10 = r10 + 1
            goto L_0x19d9
        L_0x19f0:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r10 = "s"
            r4.append(r10)
            r4.append(r14)
            java.lang.String r10 = "_iditems"
            r4.append(r10)
            java.lang.String r4 = r4.toString()
            java.lang.String r10 = ""
            java.lang.String r4 = r5.getString(r4, r10)
            java.lang.String r10 = ""
            boolean r10 = r4.equals(r10)
            if (r10 != 0) goto L_0x1f27
            java.lang.String r10 = ","
            java.lang.String[] r4 = r4.split(r10)
            int r10 = r4.length
            mega.boicot.b[] r10 = new mega.boicot.C5601b[r10]
            r7.f18261aE = r10
            r10 = 0
        L_0x1a20:
            int r13 = r4.length
            if (r10 >= r13) goto L_0x1f27
            r13 = r4[r10]
            mega.boicot.b r14 = new mega.boicot.b
            r14.<init>()
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            java.lang.String r9 = "it"
            r15.append(r9)
            r15.append(r13)
            java.lang.String r9 = "_ord"
            r15.append(r9)
            java.lang.String r9 = r15.toString()
            r15 = 0
            int r9 = r5.getInt(r9, r15)
            int r15 = java.lang.Integer.parseInt(r13)
            r14.f17742a = r15
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            r19 = r4
            java.lang.String r4 = "it"
            r15.append(r4)
            r15.append(r13)
            java.lang.String r4 = "_tit1"
            r15.append(r4)
            java.lang.String r4 = r15.toString()
            java.lang.String r15 = ""
            java.lang.String r4 = r5.getString(r4, r15)
            r14.f17733C = r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r15 = "it"
            r4.append(r15)
            r4.append(r13)
            java.lang.String r15 = "_tit1_c"
            r4.append(r15)
            java.lang.String r4 = r4.toString()
            r15 = 0
            int r4 = r5.getInt(r4, r15)
            r14.f17746e = r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r15 = "it"
            r4.append(r15)
            r4.append(r13)
            java.lang.String r15 = "_tit2"
            r4.append(r15)
            java.lang.String r4 = r4.toString()
            java.lang.String r15 = ""
            java.lang.String r4 = r5.getString(r4, r15)
            r14.f17734D = r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r15 = "it"
            r4.append(r15)
            r4.append(r13)
            java.lang.String r15 = "_tit2_c"
            r4.append(r15)
            java.lang.String r4 = r4.toString()
            r15 = 0
            int r4 = r5.getInt(r4, r15)
            r14.f17747f = r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r15 = "it"
            r4.append(r15)
            r4.append(r13)
            java.lang.String r15 = "_txt"
            r4.append(r15)
            java.lang.String r4 = r4.toString()
            java.lang.String r15 = ""
            java.lang.String r4 = r5.getString(r4, r15)
            r14.f17735E = r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r15 = "it"
            r4.append(r15)
            r4.append(r13)
            java.lang.String r15 = "_txt_c"
            r4.append(r15)
            java.lang.String r4 = r4.toString()
            r15 = 0
            int r4 = r5.getInt(r4, r15)
            r14.f17748g = r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r15 = "it"
            r4.append(r15)
            r4.append(r13)
            java.lang.String r15 = "_txt_h"
            r4.append(r15)
            java.lang.String r4 = r4.toString()
            r15 = 0
            int r4 = r5.getInt(r4, r15)
            r14.f17767z = r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r15 = "it"
            r4.append(r15)
            r4.append(r13)
            java.lang.String r15 = "_fcab_id"
            r4.append(r15)
            java.lang.String r4 = r4.toString()
            r15 = 0
            int r4 = r5.getInt(r4, r15)
            r14.f17743b = r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r15 = "it"
            r4.append(r15)
            r4.append(r13)
            java.lang.String r15 = "_fcab_modif"
            r4.append(r15)
            java.lang.String r4 = r4.toString()
            r15 = 1
            int r4 = r5.getInt(r4, r15)
            r14.f17744c = r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r15 = "it"
            r4.append(r15)
            r4.append(r13)
            java.lang.String r15 = "_fcab_c"
            r4.append(r15)
            java.lang.String r4 = r4.toString()
            r15 = 0
            int r4 = r5.getInt(r4, r15)
            r14.f17745d = r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r15 = "it"
            r4.append(r15)
            r4.append(r13)
            java.lang.String r15 = "_fcab_url"
            r4.append(r15)
            java.lang.String r4 = r4.toString()
            java.lang.String r15 = ""
            java.lang.String r4 = r5.getString(r4, r15)
            r14.f17739I = r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r15 = "it"
            r4.append(r15)
            r4.append(r13)
            java.lang.String r15 = "_fotos_pos"
            r4.append(r15)
            java.lang.String r4 = r4.toString()
            r15 = 0
            int r4 = r5.getInt(r4, r15)
            r14.f17749h = r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r15 = "it"
            r4.append(r15)
            r4.append(r13)
            java.lang.String r15 = "_fotos_c"
            r4.append(r15)
            java.lang.String r4 = r4.toString()
            r15 = 0
            int r4 = r5.getInt(r4, r15)
            r14.f17750i = r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r15 = "it"
            r4.append(r15)
            r4.append(r13)
            java.lang.String r15 = "_fotos_h"
            r4.append(r15)
            java.lang.String r4 = r4.toString()
            r15 = 0
            int r4 = r5.getInt(r4, r15)
            r14.f17751j = r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r15 = "it"
            r4.append(r15)
            r4.append(r13)
            java.lang.String r15 = "_fcab_z"
            r4.append(r15)
            java.lang.String r4 = r4.toString()
            r15 = 0
            int r4 = r5.getInt(r4, r15)
            r15 = 1
            if (r4 != r15) goto L_0x1c07
            r4 = 1
            goto L_0x1c08
        L_0x1c07:
            r4 = 0
        L_0x1c08:
            r14.f17731A = r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r15 = "it"
            r4.append(r15)
            r4.append(r13)
            java.lang.String r15 = "_fotos_z"
            r4.append(r15)
            java.lang.String r4 = r4.toString()
            r15 = 1
            int r4 = r5.getInt(r4, r15)
            if (r4 != r15) goto L_0x1c29
            r4 = 1
            goto L_0x1c2a
        L_0x1c29:
            r4 = 0
        L_0x1c2a:
            r14.f17732B = r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r15 = "it"
            r4.append(r15)
            r4.append(r13)
            java.lang.String r15 = "_tit1_b"
            r4.append(r15)
            java.lang.String r4 = r4.toString()
            r15 = 0
            int r4 = r5.getInt(r4, r15)
            r14.f17752k = r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r15 = "it"
            r4.append(r15)
            r4.append(r13)
            java.lang.String r15 = "_tit1_i"
            r4.append(r15)
            java.lang.String r4 = r4.toString()
            r15 = 0
            int r4 = r5.getInt(r4, r15)
            r14.f17753l = r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r15 = "it"
            r4.append(r15)
            r4.append(r13)
            java.lang.String r15 = "_tit1_f"
            r4.append(r15)
            java.lang.String r4 = r4.toString()
            r15 = 0
            int r4 = r5.getInt(r4, r15)
            r14.f17754m = r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r15 = "it"
            r4.append(r15)
            r4.append(r13)
            java.lang.String r15 = "_tit1_col"
            r4.append(r15)
            java.lang.String r4 = r4.toString()
            java.lang.String r15 = ""
            java.lang.String r4 = r5.getString(r4, r15)
            r14.f17736F = r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r15 = "it"
            r4.append(r15)
            r4.append(r13)
            java.lang.String r15 = "_tit1_u"
            r4.append(r15)
            java.lang.String r4 = r4.toString()
            r15 = 0
            int r4 = r5.getInt(r4, r15)
            r14.f17755n = r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r15 = "it"
            r4.append(r15)
            r4.append(r13)
            java.lang.String r15 = "_tit1_s"
            r4.append(r15)
            java.lang.String r4 = r4.toString()
            r15 = 0
            int r4 = r5.getInt(r4, r15)
            r14.f17756o = r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r15 = "it"
            r4.append(r15)
            r4.append(r13)
            java.lang.String r15 = "_tit2_b"
            r4.append(r15)
            java.lang.String r4 = r4.toString()
            r15 = 0
            int r4 = r5.getInt(r4, r15)
            r14.f17757p = r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r15 = "it"
            r4.append(r15)
            r4.append(r13)
            java.lang.String r15 = "_tit2_i"
            r4.append(r15)
            java.lang.String r4 = r4.toString()
            r15 = 0
            int r4 = r5.getInt(r4, r15)
            r14.f17758q = r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r15 = "it"
            r4.append(r15)
            r4.append(r13)
            java.lang.String r15 = "_tit2_f"
            r4.append(r15)
            java.lang.String r4 = r4.toString()
            r15 = 0
            int r4 = r5.getInt(r4, r15)
            r14.f17759r = r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r15 = "it"
            r4.append(r15)
            r4.append(r13)
            java.lang.String r15 = "_tit2_col"
            r4.append(r15)
            java.lang.String r4 = r4.toString()
            java.lang.String r15 = ""
            java.lang.String r4 = r5.getString(r4, r15)
            r14.f17737G = r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r15 = "it"
            r4.append(r15)
            r4.append(r13)
            java.lang.String r15 = "_tit2_u"
            r4.append(r15)
            java.lang.String r4 = r4.toString()
            r15 = 0
            int r4 = r5.getInt(r4, r15)
            r14.f17760s = r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r15 = "it"
            r4.append(r15)
            r4.append(r13)
            java.lang.String r15 = "_tit2_s"
            r4.append(r15)
            java.lang.String r4 = r4.toString()
            r15 = 0
            int r4 = r5.getInt(r4, r15)
            r14.f17761t = r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r15 = "it"
            r4.append(r15)
            r4.append(r13)
            java.lang.String r15 = "_txt_b"
            r4.append(r15)
            java.lang.String r4 = r4.toString()
            r15 = 0
            int r4 = r5.getInt(r4, r15)
            r14.f17762u = r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r15 = "it"
            r4.append(r15)
            r4.append(r13)
            java.lang.String r15 = "_txt_i"
            r4.append(r15)
            java.lang.String r4 = r4.toString()
            r15 = 0
            int r4 = r5.getInt(r4, r15)
            r14.f17763v = r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r15 = "it"
            r4.append(r15)
            r4.append(r13)
            java.lang.String r15 = "_txt_f"
            r4.append(r15)
            java.lang.String r4 = r4.toString()
            r15 = 0
            int r4 = r5.getInt(r4, r15)
            r14.f17764w = r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r15 = "it"
            r4.append(r15)
            r4.append(r13)
            java.lang.String r15 = "_txt_col"
            r4.append(r15)
            java.lang.String r4 = r4.toString()
            java.lang.String r15 = ""
            java.lang.String r4 = r5.getString(r4, r15)
            r14.f17738H = r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r15 = "it"
            r4.append(r15)
            r4.append(r13)
            java.lang.String r15 = "_txt_u"
            r4.append(r15)
            java.lang.String r4 = r4.toString()
            r15 = 0
            int r4 = r5.getInt(r4, r15)
            r14.f17765x = r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r15 = "it"
            r4.append(r15)
            r4.append(r13)
            java.lang.String r15 = "_txt_s"
            r4.append(r15)
            java.lang.String r4 = r4.toString()
            r15 = 0
            int r4 = r5.getInt(r4, r15)
            r14.f17766y = r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r15 = "it"
            r4.append(r15)
            r4.append(r13)
            java.lang.String r13 = "_idfotos"
            r4.append(r13)
            java.lang.String r4 = r4.toString()
            java.lang.String r13 = ""
            java.lang.String r4 = r5.getString(r4, r13)
            java.lang.String r13 = ""
            boolean r13 = r4.equals(r13)
            if (r13 != 0) goto L_0x1f01
            java.lang.String r13 = ","
            java.lang.String[] r4 = r4.split(r13)
            int r13 = r4.length
            r15 = 2
            int[] r13 = new int[]{r13, r15}
            java.lang.Class<int> r15 = int.class
            java.lang.Object r13 = java.lang.reflect.Array.newInstance(r15, r13)
            int[][] r13 = (int[][]) r13
            r14.f17740J = r13
            int r13 = r4.length
            java.lang.String[] r13 = new java.lang.String[r13]
            r14.f17741K = r13
            r13 = 0
        L_0x1e79:
            int r15 = r4.length
            if (r13 >= r15) goto L_0x1efc
            r15 = r4[r13]
            r20 = r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r21 = r6
            java.lang.String r6 = "it_f"
            r4.append(r6)
            r4.append(r15)
            java.lang.String r6 = "_ord"
            r4.append(r6)
            java.lang.String r4 = r4.toString()
            r6 = 0
            int r4 = r5.getInt(r4, r6)
            int[][] r6 = r14.f17740J
            r16 = 1
            int r4 = r4 + -1
            r6 = r6[r4]
            int r16 = java.lang.Integer.parseInt(r15)
            r17 = 0
            r6[r17] = r16
            int[][] r6 = r14.f17740J
            r6 = r6[r4]
            r22 = r8
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r2 = "it_f"
            r8.append(r2)
            r8.append(r15)
            java.lang.String r2 = "_modif"
            r8.append(r2)
            java.lang.String r2 = r8.toString()
            r8 = 1
            int r2 = r5.getInt(r2, r8)
            r6[r8] = r2
            java.lang.String[] r2 = r14.f17741K
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r8 = "it_f"
            r6.append(r8)
            r6.append(r15)
            java.lang.String r8 = "_url"
            r6.append(r8)
            java.lang.String r6 = r6.toString()
            java.lang.String r8 = ""
            java.lang.String r6 = r5.getString(r6, r8)
            r2[r4] = r6
            int r13 = r13 + 1
            r4 = r20
            r6 = r21
            r8 = r22
            r2 = r26
            goto L_0x1e79
        L_0x1efc:
            r21 = r6
            r22 = r8
            goto L_0x1f14
        L_0x1f01:
            r21 = r6
            r22 = r8
            r2 = 0
            int[] r4 = new int[]{r2, r2}
            java.lang.Class<int> r2 = int.class
            java.lang.Object r2 = java.lang.reflect.Array.newInstance(r2, r4)
            int[][] r2 = (int[][]) r2
            r14.f17740J = r2
        L_0x1f14:
            mega.boicot.b[] r2 = r7.f18261aE
            r4 = 1
            int r9 = r9 - r4
            r2[r9] = r14
            int r10 = r10 + 1
            r4 = r19
            r6 = r21
            r8 = r22
            r2 = r26
            r9 = 5
            goto L_0x1a20
        L_0x1f27:
            r21 = r6
            r22 = r8
            mega.boicot.i[] r2 = r0.f17971bz
            r2[r12] = r7
            java.util.ArrayList<java.lang.Integer> r2 = r0.f17920bA
            int r4 = r7.f18330w
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r2.add(r4)
            boolean r2 = r7.f18333z
            if (r2 != 0) goto L_0x1f44
            int[] r2 = r0.f17922bC
            r2[r11] = r12
            int r11 = r11 + 1
        L_0x1f44:
            int r3 = r3 + 1
            r6 = r21
            r8 = r22
            r2 = r26
            r4 = 0
            r7 = 9997(0x270d, float:1.4009E-41)
            r9 = 2
            r10 = 3
            r12 = 6
            r13 = 5
            r15 = 4
            goto L_0x0cf8
        L_0x1f56:
            java.lang.String r2 = "www.appcreator24.com/open718963/"
            java.lang.String r3 = "www.androidcreator.com/open718963/"
            if (r28 == 0) goto L_0x1fe5
            java.lang.String r7 = r28.getDataString()
            if (r7 == 0) goto L_0x1fe5
            java.lang.String r7 = r28.getDataString()
            boolean r7 = r7.contains(r2)
            if (r7 != 0) goto L_0x1f76
            java.lang.String r7 = r28.getDataString()
            boolean r7 = r7.contains(r3)
            if (r7 == 0) goto L_0x1fe5
        L_0x1f76:
            java.lang.String r7 = r28.getDataString()
            boolean r7 = r7.contains(r3)
            if (r7 == 0) goto L_0x1f81
            r2 = r3
        L_0x1f81:
            java.lang.String r3 = r28.getDataString()
            java.lang.String r4 = "http://"
            java.lang.String r7 = ""
            java.lang.String r3 = r3.replace(r4, r7)
            java.lang.String r4 = "https://"
            java.lang.String r7 = ""
            java.lang.String r3 = r3.replace(r4, r7)
            int r4 = r3.length()
            int r2 = r2.length()
            if (r4 <= r2) goto L_0x1fe5
            java.lang.String r2 = "/"
            java.lang.String[] r2 = r3.split(r2)
            int r3 = r2.length
            r4 = 1
            int r3 = r3 - r4
            r2 = r2[r3]
            r3 = 0
        L_0x1fab:
            int r4 = r1.length
            if (r3 >= r4) goto L_0x1fe5
            mega.boicot.i[] r4 = r0.f17971bz
            r4 = r4[r3]
            java.lang.String r4 = r4.f18316i
            boolean r4 = r4.equalsIgnoreCase(r2)
            if (r4 == 0) goto L_0x1fe2
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "s"
            r1.append(r2)
            mega.boicot.i[] r2 = r0.f17971bz
            r2 = r2[r3]
            int r2 = r2.f18330w
            r1.append(r2)
            java.lang.String r2 = "_ord"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r2 = 0
            int r1 = r5.getInt(r1, r2)
            r2 = 1
            int r1 = r1 - r2
            r2 = -1
            if (r1 == r2) goto L_0x1fe5
            r4 = r1
            goto L_0x1fe6
        L_0x1fe2:
            int r3 = r3 + 1
            goto L_0x1fab
        L_0x1fe5:
            r4 = r6
        L_0x1fe6:
            int[] r1 = r0.f17922bC
            int[] r2 = new int[r11]
            r0.f17922bC = r2
            r2 = 0
        L_0x1fed:
            if (r2 >= r11) goto L_0x1ff8
            int[] r3 = r0.f17922bC
            r6 = r1[r2]
            r3[r2] = r6
            int r2 = r2 + 1
            goto L_0x1fed
        L_0x1ff8:
            r2 = 9996(0x270c, float:1.4007E-41)
            if (r4 != r2) goto L_0x2000
            r1 = r26
            r4 = 0
            goto L_0x2002
        L_0x2000:
            r1 = r26
        L_0x2002:
            int r2 = r1.length
            mega.boicot.g[] r2 = new mega.boicot.C5661g[r2]
            r0.f17921bB = r2
            r2 = 0
        L_0x2008:
            int r3 = r1.length
            if (r2 >= r3) goto L_0x2314
            r3 = r1[r2]
            mega.boicot.g r6 = new mega.boicot.g
            r6.<init>()
            int r7 = java.lang.Integer.parseInt(r3)
            r6.f18211l = r7
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "o"
            r7.append(r8)
            r7.append(r3)
            java.lang.String r8 = "_tit"
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            java.lang.String r8 = ""
            java.lang.String r7 = r5.getString(r7, r8)
            r6.f18200a = r7
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "o"
            r7.append(r8)
            r7.append(r3)
            java.lang.String r8 = "_dir1"
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            java.lang.String r8 = ""
            java.lang.String r7 = r5.getString(r7, r8)
            r6.f18206g = r7
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "o"
            r7.append(r8)
            r7.append(r3)
            java.lang.String r8 = "_dir2"
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            java.lang.String r8 = ""
            java.lang.String r7 = r5.getString(r7, r8)
            r6.f18207h = r7
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "o"
            r7.append(r8)
            r7.append(r3)
            java.lang.String r8 = "_cp"
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            java.lang.String r8 = ""
            java.lang.String r7 = r5.getString(r7, r8)
            r6.f18208i = r7
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "o"
            r7.append(r8)
            r7.append(r3)
            java.lang.String r8 = "_pob"
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            java.lang.String r8 = ""
            java.lang.String r7 = r5.getString(r7, r8)
            r6.f18209j = r7
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "o"
            r7.append(r8)
            r7.append(r3)
            java.lang.String r8 = "_prov"
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            java.lang.String r8 = ""
            java.lang.String r7 = r5.getString(r7, r8)
            r6.f18210k = r7
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "o"
            r7.append(r8)
            r7.append(r3)
            java.lang.String r8 = "_tel1"
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            java.lang.String r8 = ""
            java.lang.String r7 = r5.getString(r7, r8)
            r6.f18201b = r7
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "o"
            r7.append(r8)
            r7.append(r3)
            java.lang.String r8 = "_tel2"
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            java.lang.String r8 = ""
            java.lang.String r7 = r5.getString(r7, r8)
            r6.f18202c = r7
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "o"
            r7.append(r8)
            r7.append(r3)
            java.lang.String r8 = "_horario"
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            java.lang.String r8 = ""
            java.lang.String r7 = r5.getString(r7, r8)
            r6.f18203d = r7
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "o"
            r7.append(r8)
            r7.append(r3)
            java.lang.String r8 = "_nfotos"
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            r8 = 0
            int r7 = r5.getInt(r7, r8)
            r6.f18212m = r7
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r9 = "o"
            r7.append(r9)
            r7.append(r3)
            java.lang.String r9 = "_x"
            r7.append(r9)
            java.lang.String r7 = r7.toString()
            int r7 = r5.getInt(r7, r8)
            r6.f18217r = r7
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r9 = "o"
            r7.append(r9)
            r7.append(r3)
            java.lang.String r9 = "_y"
            r7.append(r9)
            java.lang.String r7 = r7.toString()
            int r7 = r5.getInt(r7, r8)
            r6.f18218s = r7
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r9 = "o"
            r7.append(r9)
            r7.append(r3)
            java.lang.String r9 = "_z"
            r7.append(r9)
            java.lang.String r7 = r7.toString()
            int r7 = r5.getInt(r7, r8)
            r6.f18219t = r7
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "o"
            r7.append(r8)
            r7.append(r3)
            java.lang.String r8 = "_email"
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            java.lang.String r8 = ""
            java.lang.String r7 = r5.getString(r7, r8)
            r6.f18204e = r7
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "o"
            r7.append(r8)
            r7.append(r3)
            java.lang.String r8 = "_t_email"
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            r8 = 0
            int r7 = r5.getInt(r7, r8)
            if (r7 != 0) goto L_0x21d5
            r6.f18224y = r8
            goto L_0x21d8
        L_0x21d5:
            r7 = 1
            r6.f18224y = r7
        L_0x21d8:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "o"
            r7.append(r8)
            r7.append(r3)
            java.lang.String r8 = "_web"
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            java.lang.String r8 = ""
            java.lang.String r7 = r5.getString(r7, r8)
            r6.f18205f = r7
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "o"
            r7.append(r8)
            r7.append(r3)
            java.lang.String r8 = "_wp"
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            r8 = 1
            int r7 = r5.getInt(r7, r8)
            if (r7 != 0) goto L_0x2217
            r7 = 0
            r6.f18199B = r7
            goto L_0x2219
        L_0x2217:
            r6.f18199B = r8
        L_0x2219:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "o"
            r7.append(r8)
            r7.append(r3)
            java.lang.String r8 = "_chat"
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            r8 = 0
            int r7 = r5.getInt(r7, r8)
            if (r7 != 0) goto L_0x223a
            r6.f18225z = r8
            r7 = 1
            goto L_0x223d
        L_0x223a:
            r7 = 1
            r6.f18225z = r7
        L_0x223d:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "o"
            r8.append(r9)
            r8.append(r3)
            java.lang.String r9 = "_zoo"
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            int r8 = r5.getInt(r8, r7)
            if (r8 != r7) goto L_0x225b
            r7 = 1
            goto L_0x225c
        L_0x225b:
            r7 = 0
        L_0x225c:
            r6.f18198A = r7
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "o"
            r7.append(r8)
            r7.append(r3)
            java.lang.String r8 = "_idfotos"
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            java.lang.String r8 = ""
            java.lang.String r7 = r5.getString(r7, r8)
            java.lang.String r8 = ""
            boolean r8 = r7.equals(r8)
            if (r8 != 0) goto L_0x22ec
            java.lang.String r8 = ","
            java.lang.String[] r7 = r7.split(r8)
            r8 = 0
        L_0x2289:
            int r9 = r7.length
            if (r8 >= r9) goto L_0x22ec
            r9 = r7[r8]
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "o_f"
            r10.append(r11)
            r10.append(r9)
            java.lang.String r11 = "_ord"
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            r11 = 0
            int r10 = r5.getInt(r10, r11)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "o_f"
            r11.append(r12)
            r11.append(r9)
            java.lang.String r12 = "_modif"
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            r12 = 1
            boolean r11 = r5.getBoolean(r11, r12)
            int r9 = java.lang.Integer.parseInt(r9)
            if (r10 != r12) goto L_0x22d2
            r6.f18213n = r9
            r6.f18220u = r11
            r12 = 2
        L_0x22cf:
            r13 = 3
        L_0x22d0:
            r14 = 4
            goto L_0x22e9
        L_0x22d2:
            r12 = 2
            if (r10 != r12) goto L_0x22da
            r6.f18214o = r9
            r6.f18221v = r11
            goto L_0x22cf
        L_0x22da:
            r13 = 3
            if (r10 != r13) goto L_0x22e2
            r6.f18215p = r9
            r6.f18222w = r11
            goto L_0x22d0
        L_0x22e2:
            r14 = 4
            if (r10 != r14) goto L_0x22e9
            r6.f18216q = r9
            r6.f18223x = r11
        L_0x22e9:
            int r8 = r8 + 1
            goto L_0x2289
        L_0x22ec:
            r12 = 2
            r13 = 3
            r14 = 4
            mega.boicot.g[] r7 = r0.f17921bB
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "o"
            r8.append(r9)
            r8.append(r3)
            java.lang.String r3 = "_ord"
            r8.append(r3)
            java.lang.String r3 = r8.toString()
            r8 = 0
            int r3 = r5.getInt(r3, r8)
            r9 = 1
            int r3 = r3 - r9
            r7[r3] = r6
            int r2 = r2 + 1
            goto L_0x2008
        L_0x2314:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: mega.boicot.config.mo20755a(java.lang.String[], java.lang.String[], android.os.Bundle, android.content.Intent):int");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public void mo20786e(Context context) {
        if (f17829dh == 1 || f17830di == 1) {
            f17825dd = new C2979f(context);
            f17825dd.mo12245a(f17819cn);
            f17825dd.mo12241a((C2960a) new C2960a() {
                /* renamed from: a */
                public void mo9641a(int i) {
                    if (config.f17816ck.equals("")) {
                        config.f17829dh = 0;
                        config.f17830di = 0;
                    }
                }
            });
            f17825dd.mo12242a(new C2972a().mo12209a());
        } else if (f17829dh != 2 && f17830di != 2) {
            if (f17829dh == 3 || f17830di == 3) {
                f17827df = new InterstitialAd(context, f17820co);
                f17827df.setAdListener(new InterstitialAdListener() {
                    public void onAdClicked(C1514Ad ad) {
                    }

                    public void onAdLoaded(C1514Ad ad) {
                    }

                    public void onInterstitialDismissed(C1514Ad ad) {
                    }

                    public void onInterstitialDisplayed(C1514Ad ad) {
                    }

                    public void onLoggingImpression(C1514Ad ad) {
                    }

                    public void onError(C1514Ad ad, AdError adError) {
                        config.f17829dh = 0;
                        config.f17830di = 0;
                    }
                });
                f17827df.loadAd();
            } else if (f17829dh == 4 || f17830di == 4) {
                f17828dg = new StartAppAd(getApplicationContext());
                f17828dg.loadAd((AdEventListener) new AdEventListener() {
                    public void onReceiveAd(C5286Ad ad) {
                    }

                    public void onFailedToReceiveAd(C5286Ad ad) {
                        config.f17829dh = 0;
                        config.f17830di = 0;
                    }
                });
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public void mo20787f(Context context) {
        if (f17829dh == 1 && f17825dd != null && f17825dd.mo12247a()) {
            f17825dd.mo12248b();
            f17829dh = 0;
            f17830di = 0;
        } else if (f17829dh == 2 || (f17829dh == 1 && !f17816ck.equals(""))) {
            if (f17826de == null) {
                f17826de = new Interstitial(getApplicationContext(), f17818cm);
                if (f17822cq.booleanValue()) {
                    f17826de.setMute(true);
                }
                if (!f17823cr.booleanValue()) {
                    f17826de.setAutoPlay(false);
                }
                f17826de.setBackButtonCanClose(true);
                f17826de.setSkipText(getResources().getString(R.string.ad_saltar));
                f17826de.setOnAdLoadedCallback(new OnAdLoaded() {
                    public void adLoaded(String str) {
                        config.f17826de.showAd();
                    }
                });
                f17826de.setOnAdErrorCallback(new OnAdError() {
                    public void adError(String str) {
                        config.f17826de = null;
                    }
                });
                f17826de.setOnAdClosedCallback(new OnAdClosed() {
                    public void onAdClosed() {
                        config.f17826de = null;
                    }
                });
                f17826de.loadAd();
            }
            f17829dh = 0;
            f17830di = 0;
        } else if (f17829dh == 3 && f17827df != null && f17827df.isAdLoaded()) {
            f17827df.show();
            f17829dh = 0;
            f17830di = 0;
        } else if (f17829dh == 4 && f17828dg != null && f17828dg.isReady()) {
            String str = "INTERSTITIAL";
            if (f17831dj == 1) {
                str = "Intersticial normal";
            }
            f17828dg.showAd(str);
            f17829dh = 0;
            f17830di = 0;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public void mo20788g(Context context) {
        if (f17830di == 1 && f17825dd != null && f17825dd.mo12247a()) {
            f17825dd.mo12248b();
            f17829dh = 0;
            f17830di = 0;
        } else if (f17830di == 2 || (f17830di == 1 && !f17816ck.equals(""))) {
            if (f17826de == null) {
                f17826de = new Interstitial(getApplicationContext(), f17818cm);
                if (f17822cq.booleanValue()) {
                    f17826de.setMute(true);
                }
                if (!f17823cr.booleanValue()) {
                    f17826de.setAutoPlay(false);
                }
                f17826de.setBackButtonCanClose(true);
                f17826de.setSkipText(getResources().getString(R.string.ad_saltar));
                f17826de.setOnAdLoadedCallback(new OnAdLoaded() {
                    public void adLoaded(String str) {
                        config.f17826de.showAd();
                    }
                });
                f17826de.setOnAdErrorCallback(new OnAdError() {
                    public void adError(String str) {
                        config.f17826de = null;
                    }
                });
                f17826de.setOnAdClosedCallback(new OnAdClosed() {
                    public void onAdClosed() {
                        config.f17826de = null;
                    }
                });
                f17826de.loadAd();
            }
            f17829dh = 0;
            f17830di = 0;
        } else if (f17830di == 3 && f17827df != null && f17827df.isAdLoaded()) {
            f17827df.show();
            f17829dh = 0;
            f17830di = 0;
        } else if (f17830di == 4 && f17828dg != null && f17828dg.isReady()) {
            String str = "INTERSTITIAL";
            if (f17831dj == 1) {
                str = "Intersticial chat";
            }
            f17828dg.showAd(str);
            f17829dh = 0;
            f17830di = 0;
        }
    }

    /* renamed from: a */
    public void mo20770a(Context context, boolean z, boolean z2) {
        mo20787f(context);
        if (f17829dh <= 0) {
            if (!z && !z2) {
                if (this.f18014cy > 0) {
                    SharedPreferences sharedPreferences = getSharedPreferences("sh", 0);
                    int i = sharedPreferences.getInt("n_imp", 0) + 1;
                    Editor edit = sharedPreferences.edit();
                    edit.putInt("n_imp", i);
                    edit.commit();
                    if (i % this.f18014cy == 0) {
                        edit.putInt("n_imp_chat", 0);
                        edit.commit();
                        ArrayList arrayList = new ArrayList();
                        if (!f17819cn.equals("")) {
                            arrayList.add(Integer.valueOf(1));
                        }
                        if (!f17816ck.equals("") && (f17819cn.equals("") || !f17833dl)) {
                            arrayList.add(Integer.valueOf(2));
                        }
                        if (!f17820co.equals("")) {
                            arrayList.add(Integer.valueOf(3));
                        }
                        if (!f17821cp.equals("")) {
                            arrayList.add(Integer.valueOf(4));
                        }
                        if (!arrayList.isEmpty()) {
                            if (arrayList.size() <= 1) {
                                f17829dh = ((Integer) arrayList.get(0)).intValue();
                            } else if (f17830di > 0) {
                                f17829dh = f17830di;
                            } else {
                                f17829dh = ((Integer) arrayList.get(new Random().nextInt(((arrayList.size() - 1) - 0) + 1) + 0)).intValue();
                            }
                            if (f17830di == 0) {
                                mo20786e(context);
                            }
                            return;
                        }
                        return;
                    }
                }
                f17829dh = 0;
            } else if (f17830di != 2) {
                if (z) {
                    f17829dh = 1;
                } else if (z2) {
                    f17829dh = 3;
                } else {
                    return;
                }
                if (f17830di == 0) {
                    mo20786e(context);
                }
                Editor edit2 = getSharedPreferences("sh", 0).edit();
                edit2.putInt("n_imp", 0);
                edit2.putInt("n_imp_chat", 0);
                edit2.commit();
            }
        }
    }

    /* renamed from: h */
    public void mo20789h(Context context) {
        mo20788g(context);
        if (f17830di <= 0) {
            if (this.f17972cA > 0) {
                SharedPreferences sharedPreferences = getSharedPreferences("sh", 0);
                int i = sharedPreferences.getInt("n_imp_chat", 0) + 1;
                Editor edit = sharedPreferences.edit();
                edit.putInt("n_imp_chat", i);
                edit.commit();
                if (i % this.f17972cA == 0) {
                    edit.putInt("n_imp", 0);
                    edit.commit();
                    ArrayList arrayList = new ArrayList();
                    if (!f17819cn.equals("")) {
                        arrayList.add(Integer.valueOf(1));
                    }
                    if (!f17816ck.equals("") && (f17819cn.equals("") || !f17833dl)) {
                        arrayList.add(Integer.valueOf(2));
                    }
                    if (!f17820co.equals("")) {
                        arrayList.add(Integer.valueOf(3));
                    }
                    if (!f17821cp.equals("")) {
                        arrayList.add(Integer.valueOf(4));
                    }
                    if (!arrayList.isEmpty()) {
                        if (arrayList.size() <= 1) {
                            f17830di = ((Integer) arrayList.get(0)).intValue();
                        } else if (f17829dh > 0) {
                            f17830di = f17829dh;
                        } else {
                            f17830di = ((Integer) arrayList.get(new Random().nextInt(((arrayList.size() - 1) - 0) + 1) + 0)).intValue();
                        }
                        if (f17829dh == 0) {
                            mo20786e(context);
                        }
                        return;
                    }
                    return;
                }
            }
            f17830di = 0;
        }
    }

    /* renamed from: c */
    public int mo20781c() {
        f17829dh = 0;
        f17830di = 0;
        if (!this.f17998ca.equals("")) {
            return 5;
        }
        if (this.f18015cz <= 0) {
            return 0;
        }
        SharedPreferences sharedPreferences = getSharedPreferences("sh", 0);
        int i = sharedPreferences.getInt("n_impentrada", 0) + 1;
        Editor edit = sharedPreferences.edit();
        edit.putInt("n_impentrada", i);
        edit.commit();
        if (i % this.f18015cz != 0 && i != 1) {
            return 0;
        }
        edit.putInt("n_imp", 0);
        edit.putInt("n_imp_chat", 0);
        edit.commit();
        ArrayList arrayList = new ArrayList();
        if (!f17819cn.equals("")) {
            arrayList.add(Integer.valueOf(1));
        }
        if (!f17816ck.equals("") && (f17819cn.equals("") || !f17833dl)) {
            arrayList.add(Integer.valueOf(2));
        }
        if (!f17820co.equals("")) {
            arrayList.add(Integer.valueOf(3));
        }
        if (!f17821cp.equals("")) {
            arrayList.add(Integer.valueOf(4));
        }
        if (arrayList.isEmpty()) {
            return 0;
        }
        if (arrayList.size() > 1) {
            return ((Integer) arrayList.get(new Random().nextInt(((arrayList.size() - 1) - 0) + 1) + 0)).intValue();
        }
        return ((Integer) arrayList.get(0)).intValue();
    }

    /* JADX WARNING: Removed duplicated region for block: B:106:0x04a7 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x04a8  */
    /* JADX WARNING: Removed duplicated region for block: B:215:0x09a0  */
    /* JADX WARNING: Removed duplicated region for block: B:258:0x0baf  */
    /* JADX WARNING: Removed duplicated region for block: B:259:0x0bb1  */
    /* JADX WARNING: Removed duplicated region for block: B:262:0x0bb8  */
    /* JADX WARNING: Removed duplicated region for block: B:264:0x0bc9  */
    /* JADX WARNING: Removed duplicated region for block: B:267:0x0be7  */
    /* JADX WARNING: Removed duplicated region for block: B:270:0x0bfa  */
    /* JADX WARNING: Removed duplicated region for block: B:278:0x0cc4  */
    /* JADX WARNING: Removed duplicated region for block: B:279:0x0cda  */
    /* JADX WARNING: Removed duplicated region for block: B:282:0x0cfd  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0364  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m23849b(android.content.Context r98, java.lang.String r99) {
        /*
            r8 = r98
            java.lang.String r0 = "sh"
            r1 = 0
            android.content.SharedPreferences r0 = r8.getSharedPreferences(r0, r1)
            android.content.SharedPreferences$Editor r2 = r0.edit()
            java.lang.String r3 = "\\\""
            java.lang.String r4 = "\""
            r5 = r99
            java.lang.String r3 = r5.replace(r3, r4)
            java.lang.String r4 = "@"
            int r4 = r3.indexOf(r4)
            r5 = 1
            int r4 = r4 + r5
            java.lang.String r6 = "@"
            int r6 = r3.indexOf(r6, r4)
            java.lang.String r4 = r3.substring(r4, r6)
            java.lang.String r6 = "0"
            java.lang.String r7 = ""
            java.lang.String r9 = ""
            java.lang.String r10 = ""
            java.lang.String r11 = "PRIVADO"
            boolean r11 = r4.equals(r11)
            if (r11 == 0) goto L_0x003b
            goto L_0x0d1d
        L_0x003b:
            java.lang.String r11 = ""
            java.lang.String r12 = ""
            java.lang.String r13 = ""
            java.lang.String r14 = ""
            java.lang.String r15 = ""
            java.lang.String r16 = ""
            java.lang.String r17 = ""
            java.lang.String r18 = ""
            java.lang.String r19 = ""
            java.lang.String r20 = ""
            java.lang.String r21 = ""
            java.lang.String r22 = ""
            java.lang.String r23 = ""
            java.lang.String r24 = ""
            java.lang.String r25 = ""
            java.lang.String r26 = ""
            java.lang.String r27 = ""
            java.lang.String r28 = ""
            java.lang.String r29 = ""
            java.lang.String r30 = ""
            java.lang.String r31 = ""
            java.lang.String r32 = ""
            java.lang.String r33 = ""
            java.lang.String r34 = ""
            java.lang.String r35 = ""
            java.lang.String r36 = ""
            java.lang.String r37 = ""
            java.lang.String r38 = ""
            java.lang.String r39 = ""
            java.lang.String r40 = ""
            java.lang.String r5 = "RESP:"
            boolean r5 = r4.startsWith(r5)
            r41 = 7
            r42 = 6
            r43 = 4
            r1 = 5
            if (r5 == 0) goto L_0x00d4
            java.lang.String r5 = "@"
            java.lang.String[] r3 = r3.split(r5)
            r5 = r3[r43]
            r36 = r3[r1]
            r37 = r3[r42]
            r38 = r3[r41]
            r71 = r7
            r68 = r9
            r56 = r14
            r55 = r15
            r57 = r16
            r69 = r17
            r70 = r18
            r66 = r19
            r65 = r20
            r64 = r21
            r63 = r22
            r48 = r23
            r53 = r24
            r49 = r25
            r50 = r26
            r51 = r27
            r54 = r28
            r52 = r29
            r1 = r31
            r3 = r32
            r14 = r33
            r67 = r34
            r7 = r35
            r58 = r36
            r59 = r37
            r60 = r38
            r61 = r39
            r62 = r40
            r9 = r5
            r15 = r10
            r10 = r11
            r11 = r13
            r5 = r30
            goto L_0x0358
        L_0x00d4:
            java.lang.String r5 = "COMENT:"
            boolean r5 = r4.startsWith(r5)
            if (r5 == 0) goto L_0x0139
            java.lang.String r5 = "@"
            java.lang.String[] r3 = r3.split(r5)
            r5 = r3[r43]
            r36 = r3[r1]
            r1 = r3[r42]
            r44 = r5
            java.lang.String r5 = "-"
            java.lang.String[] r1 = r1.split(r5)
            r5 = 0
            r37 = r1[r5]
            r5 = 1
            r39 = r1[r5]
            r40 = r3[r41]
            r71 = r7
            r68 = r9
            r56 = r14
            r55 = r15
            r57 = r16
            r69 = r17
            r70 = r18
            r66 = r19
            r65 = r20
            r64 = r21
            r63 = r22
            r48 = r23
            r53 = r24
            r49 = r25
            r50 = r26
            r51 = r27
            r54 = r28
            r52 = r29
            r5 = r30
            r1 = r31
            r3 = r32
            r14 = r33
            r67 = r34
            r7 = r35
            r58 = r36
            r59 = r37
            r60 = r38
            r61 = r39
            r62 = r40
            r9 = r44
            r15 = r10
            r10 = r11
            r11 = r13
            goto L_0x0358
        L_0x0139:
            r5 = 1
            java.lang.String r1 = "-"
            int r1 = r3.indexOf(r1)
            int r1 = r1 + r5
            java.lang.String r11 = "-"
            int r11 = r3.indexOf(r11, r1)
            java.lang.String r1 = r3.substring(r1, r11)
            int r11 = r11 + r5
            java.lang.String r12 = "-"
            int r12 = r3.indexOf(r12, r11)
            java.lang.String r11 = r3.substring(r11, r12)
            int r12 = r12 + r5
            java.lang.String r13 = "-"
            int r13 = r3.indexOf(r13, r12)
            java.lang.String r12 = r3.substring(r12, r13)
            int r13 = r13 + r5
            java.lang.String r14 = "-"
            int r14 = r3.indexOf(r14, r13)
            java.lang.String r13 = r3.substring(r13, r14)
            int r14 = r14 + r5
            java.lang.String r15 = "-"
            int r15 = r3.indexOf(r15, r14)
            java.lang.String r14 = r3.substring(r14, r15)
            int r15 = r15 + r5
            java.lang.String r5 = "-"
            int r5 = r3.indexOf(r5, r15)
            java.lang.String r16 = r3.substring(r15, r5)
            r15 = 1
            int r5 = r5 + r15
            java.lang.String r15 = "-"
            int r15 = r3.indexOf(r15, r5)
            java.lang.String r17 = r3.substring(r5, r15)
            r5 = 1
            int r15 = r15 + r5
            java.lang.String r5 = "-"
            int r5 = r3.indexOf(r5, r15)
            java.lang.String r18 = r3.substring(r15, r5)
            r15 = 1
            int r5 = r5 + r15
            java.lang.String r15 = "-"
            int r15 = r3.indexOf(r15, r5)
            java.lang.String r19 = r3.substring(r5, r15)
            r5 = 1
            int r15 = r15 + r5
            java.lang.String r5 = "-"
            int r5 = r3.indexOf(r5, r15)
            java.lang.String r20 = r3.substring(r15, r5)
            r15 = 1
            int r5 = r5 + r15
            java.lang.String r15 = "-"
            int r15 = r3.indexOf(r15, r5)
            java.lang.String r21 = r3.substring(r5, r15)
            r5 = 1
            int r15 = r15 + r5
            java.lang.String r5 = "-"
            int r5 = r3.indexOf(r5, r15)
            java.lang.String r22 = r3.substring(r15, r5)
            r15 = 1
            int r5 = r5 + r15
            java.lang.String r15 = "-"
            int r15 = r3.indexOf(r15, r5)
            java.lang.String r23 = r3.substring(r5, r15)
            r5 = 1
            int r15 = r15 + r5
            java.lang.String r5 = "-"
            int r5 = r3.indexOf(r5, r15)
            java.lang.String r24 = r3.substring(r15, r5)
            r15 = 1
            int r5 = r5 + r15
            java.lang.String r15 = "-"
            int r15 = r3.indexOf(r15, r5)
            java.lang.String r25 = r3.substring(r5, r15)
            r5 = 1
            int r15 = r15 + r5
            java.lang.String r5 = "-"
            int r5 = r3.indexOf(r5, r15)
            java.lang.String r26 = r3.substring(r15, r5)
            r15 = 1
            int r5 = r5 + r15
            java.lang.String r15 = "-"
            int r15 = r3.indexOf(r15, r5)
            java.lang.String r27 = r3.substring(r5, r15)
            r5 = 1
            int r15 = r15 + r5
            java.lang.String r5 = "-"
            int r5 = r3.indexOf(r5, r15)
            java.lang.String r28 = r3.substring(r15, r5)
            r15 = 1
            int r5 = r5 + r15
            java.lang.String r15 = "-"
            int r15 = r3.indexOf(r15, r5)
            java.lang.String r29 = r3.substring(r5, r15)
            java.lang.String r5 = "@"
            int r5 = r3.indexOf(r5)
            java.lang.String r15 = "@"
            r30 = 1
            int r5 = r5 + 1
            int r5 = r3.indexOf(r15, r5)
            int r5 = r5 + 1
            java.lang.String r15 = "@"
            int r15 = r3.indexOf(r15, r5)
            java.lang.String r5 = r3.substring(r5, r15)
            r45 = r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r46 = r6
            java.lang.String r6 = "ban_"
            r1.append(r6)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            boolean r1 = r0.contains(r1)
            if (r1 == 0) goto L_0x0256
            return
        L_0x0256:
            r1 = 1
            int r15 = r15 + r1
            java.lang.String r6 = "@"
            int r6 = r3.indexOf(r6, r15)
            java.lang.String r31 = r3.substring(r15, r6)
            int r6 = r6 + r1
            java.lang.String r15 = "@"
            int r15 = r3.indexOf(r15, r6)
            java.lang.String r6 = r3.substring(r6, r15)
            java.lang.String r1 = "\\'"
            r47 = r5
            java.lang.String r5 = "'"
            java.lang.String r32 = r6.replace(r1, r5)
            r1 = 1
            int r15 = r15 + r1
            java.lang.String r5 = "@"
            int r5 = r3.indexOf(r5, r15)
            java.lang.String r33 = r3.substring(r15, r5)
            int r5 = r5 + r1
            java.lang.String r6 = "@"
            int r6 = r3.indexOf(r6, r5)
            java.lang.String r5 = r3.substring(r5, r6)
            int r6 = r6 + r1
            java.lang.String r15 = "@"
            int r15 = r3.indexOf(r15, r6)
            java.lang.String r34 = r3.substring(r6, r15)
            java.lang.String r6 = ""
            int r15 = r15 + r1
            java.lang.String r1 = "@"
            int r1 = r3.indexOf(r1, r15)     // Catch:{ Exception -> 0x0311 }
            java.lang.String r30 = r3.substring(r15, r1)     // Catch:{ Exception -> 0x0311 }
            r15 = 1
            int r1 = r1 + r15
            java.lang.String r6 = "@"
            int r6 = r3.indexOf(r6, r1)     // Catch:{ Exception -> 0x0313 }
            java.lang.String r1 = r3.substring(r1, r6)     // Catch:{ Exception -> 0x0313 }
            java.lang.String r15 = "1"
            boolean r15 = r1.equals(r15)     // Catch:{ Exception -> 0x030f }
            if (r15 == 0) goto L_0x02e9
            r15 = 1
            int r6 = r6 + r15
            java.lang.String r15 = "@"
            int r15 = r3.indexOf(r15, r6)     // Catch:{ Exception -> 0x030f }
            java.lang.String r6 = r3.substring(r6, r15)     // Catch:{ Exception -> 0x030f }
            r35 = 1
            int r15 = r15 + 1
            java.lang.String r10 = "@"
            int r10 = r3.indexOf(r10, r15)     // Catch:{ Exception -> 0x02e7 }
            java.lang.String r15 = r3.substring(r15, r10)     // Catch:{ Exception -> 0x02e7 }
            int r10 = r10 + 1
            java.lang.String r7 = "@"
            int r7 = r3.indexOf(r7, r10)     // Catch:{ Exception -> 0x02e4 }
            java.lang.String r3 = r3.substring(r10, r7)     // Catch:{ Exception -> 0x02e4 }
            r9 = r3
            r10 = r6
            r7 = r15
            goto L_0x030f
        L_0x02e4:
            r10 = r6
            r7 = r15
            goto L_0x030f
        L_0x02e7:
            r10 = r6
            goto L_0x030f
        L_0x02e9:
            java.lang.String r15 = "2"
            boolean r15 = r1.equals(r15)     // Catch:{ Exception -> 0x030f }
            if (r15 == 0) goto L_0x030f
            r15 = 1
            int r6 = r6 + r15
            java.lang.String r15 = "@"
            int r15 = r3.indexOf(r15, r6)     // Catch:{ Exception -> 0x030f }
            java.lang.String r6 = r3.substring(r6, r15)     // Catch:{ Exception -> 0x030f }
            r35 = 1
            int r15 = r15 + 1
            java.lang.String r7 = "@"
            int r7 = r3.indexOf(r7, r15)     // Catch:{ Exception -> 0x030e }
            java.lang.String r3 = r3.substring(r15, r7)     // Catch:{ Exception -> 0x030e }
            r9 = r3
            r7 = r6
            goto L_0x030f
        L_0x030e:
            r7 = r6
        L_0x030f:
            r6 = r1
            goto L_0x0315
        L_0x0311:
            r30 = r6
        L_0x0313:
            r6 = r46
        L_0x0315:
            r71 = r7
            r68 = r9
            r15 = r10
            r56 = r13
            r55 = r14
            r57 = r16
            r69 = r17
            r70 = r18
            r66 = r19
            r65 = r20
            r64 = r21
            r63 = r22
            r48 = r23
            r53 = r24
            r49 = r25
            r50 = r26
            r51 = r27
            r54 = r28
            r52 = r29
            r1 = r31
            r3 = r32
            r14 = r33
            r67 = r34
            r58 = r36
            r59 = r37
            r60 = r38
            r61 = r39
            r62 = r40
            r10 = r45
            r7 = r47
            r9 = r5
            r5 = r30
            r97 = r12
            r12 = r11
            r11 = r97
        L_0x0358:
            java.lang.String r13 = "COMSELF:"
            boolean r13 = r4.startsWith(r13)
            r72 = r15
            r16 = 0
            if (r13 != 0) goto L_0x0970
            java.lang.String r13 = "COMSELFV:"
            boolean r13 = r4.startsWith(r13)
            if (r13 != 0) goto L_0x0970
            java.lang.String r13 = "COMFAV:"
            boolean r13 = r4.startsWith(r13)
            if (r13 != 0) goto L_0x0970
            java.lang.String r13 = "FGALFAV:"
            boolean r13 = r4.startsWith(r13)
            if (r13 != 0) goto L_0x0970
            java.lang.String r13 = "FGALVFAV:"
            boolean r13 = r4.startsWith(r13)
            if (r13 != 0) goto L_0x0970
            java.lang.String r13 = "FPERFAV:"
            boolean r13 = r4.startsWith(r13)
            if (r13 != 0) goto L_0x0970
            java.lang.String r13 = "DESCRFAV:"
            boolean r13 = r4.startsWith(r13)
            if (r13 != 0) goto L_0x0970
            java.lang.String r13 = "RESP:"
            boolean r13 = r4.startsWith(r13)
            if (r13 != 0) goto L_0x0970
            java.lang.String r13 = "COMENT:"
            boolean r13 = r4.startsWith(r13)
            if (r13 == 0) goto L_0x03ca
            r77 = r9
            r2 = r48
            r3 = r49
            r6 = r50
            r10 = r51
            r85 = r52
            r81 = r53
            r82 = r54
            r83 = r55
            r80 = r56
            r84 = r57
            r5 = r63
            r11 = r64
            r9 = r65
            r15 = r66
            r13 = r67
            r78 = r68
            r79 = r71
            goto L_0x0994
        L_0x03ca:
            java.lang.String r13 = ""
            boolean r13 = r3.equals(r13)
            if (r13 == 0) goto L_0x03e3
            java.lang.String r13 = ""
            boolean r13 = r5.equals(r13)
            if (r13 == 0) goto L_0x03e3
            java.lang.String r13 = "0"
            boolean r13 = r6.equals(r13)
            if (r13 == 0) goto L_0x03e3
            return
        L_0x03e3:
            java.lang.String r13 = "0"
            boolean r13 = r7.equals(r13)
            if (r13 != 0) goto L_0x0414
            java.lang.String r13 = ""
            boolean r13 = r7.equals(r13)
            if (r13 != 0) goto L_0x0414
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r15 = "idusu"
            r73 = r6
            r6 = 0
            int r15 = r0.getInt(r15, r6)
            r13.append(r15)
            java.lang.String r6 = ""
            r13.append(r6)
            java.lang.String r6 = r13.toString()
            boolean r6 = r7.equals(r6)
            if (r6 == 0) goto L_0x0416
            return
        L_0x0414:
            r73 = r6
        L_0x0416:
            java.lang.String r6 = "0"
            boolean r6 = r7.equals(r6)
            if (r6 != 0) goto L_0x04ec
            java.lang.String r6 = ""
            boolean r6 = r7.equals(r6)
            if (r6 != 0) goto L_0x04ec
            java.lang.String r6 = ""
            boolean r6 = r3.equals(r6)
            if (r6 == 0) goto L_0x0430
            r15 = r5
            goto L_0x0431
        L_0x0430:
            r15 = r3
        L_0x0431:
            java.lang.String r6 = ""
            boolean r6 = r15.equals(r6)
            if (r6 == 0) goto L_0x043b
            r15 = r72
        L_0x043b:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r14)
            java.lang.String r13 = "_idremit_ult"
            r6.append(r13)
            java.lang.String r6 = r6.toString()
            java.lang.String r13 = ""
            java.lang.String r6 = r0.getString(r6, r13)
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L_0x04a0
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r14)
            java.lang.String r13 = "_mensaje_ult"
            r6.append(r13)
            java.lang.String r6 = r6.toString()
            java.lang.String r13 = ""
            java.lang.String r6 = r0.getString(r6, r13)
            boolean r6 = r6.equals(r15)
            if (r6 == 0) goto L_0x04a0
            long r17 = java.lang.System.currentTimeMillis()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r14)
            java.lang.String r13 = "_f_ult"
            r6.append(r13)
            java.lang.String r6 = r6.toString()
            r75 = r11
            r74 = r12
            long r11 = java.lang.System.currentTimeMillis()
            long r11 = r0.getLong(r6, r11)
            long r19 = r17 - r11
            r11 = 30000(0x7530, double:1.4822E-319)
            int r6 = (r19 > r11 ? 1 : (r19 == r11 ? 0 : -1))
            if (r6 >= 0) goto L_0x04a4
            r6 = 1
            goto L_0x04a5
        L_0x04a0:
            r75 = r11
            r74 = r12
        L_0x04a4:
            r6 = 0
        L_0x04a5:
            if (r6 == 0) goto L_0x04a8
            return
        L_0x04a8:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r14)
            java.lang.String r11 = "_f_ult"
            r6.append(r11)
            java.lang.String r6 = r6.toString()
            long r11 = java.lang.System.currentTimeMillis()
            r2.putLong(r6, r11)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r14)
            java.lang.String r11 = "_idremit_ult"
            r6.append(r11)
            java.lang.String r6 = r6.toString()
            r2.putString(r6, r7)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r14)
            java.lang.String r11 = "_mensaje_ult"
            r6.append(r11)
            java.lang.String r6 = r6.toString()
            r2.putString(r6, r15)
            r2.commit()
            goto L_0x04f0
        L_0x04ec:
            r75 = r11
            r74 = r12
        L_0x04f0:
            java.lang.String r6 = "1"
            boolean r6 = r10.equals(r6)
            if (r6 == 0) goto L_0x04fd
            m23834a(r8, r7, r1)
            r6 = 1
            goto L_0x0532
        L_0x04fd:
            java.lang.String r6 = "idprivado"
            java.lang.String r11 = "0"
            java.lang.String r6 = r0.getString(r6, r11)
            java.lang.String r11 = "0"
            boolean r6 = r6.equals(r11)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "chat"
            r11.append(r12)
            r11.append(r9)
            java.lang.String r12 = "_validado"
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            r12 = 1
            boolean r11 = r0.getBoolean(r11, r12)
            if (r11 == 0) goto L_0x096f
            java.lang.String r11 = "pwd_validado"
            boolean r11 = r0.getBoolean(r11, r12)
            if (r11 != 0) goto L_0x0532
            goto L_0x096f
        L_0x0532:
            if (r6 != 0) goto L_0x0535
            return
        L_0x0535:
            java.lang.String r6 = "0"
            boolean r6 = r10.equals(r6)
            if (r6 != 0) goto L_0x0561
            java.lang.String r6 = "1"
            boolean r6 = r10.equals(r6)
            if (r6 == 0) goto L_0x055d
            java.lang.String r6 = "activa"
            r11 = 0
            boolean r6 = r0.getBoolean(r6, r11)
            if (r6 == 0) goto L_0x055d
            java.lang.String r6 = "idprivado"
            java.lang.String r11 = "0"
            java.lang.String r6 = r0.getString(r6, r11)
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L_0x055d
            goto L_0x0561
        L_0x055d:
            r6 = r73
            goto L_0x05f6
        L_0x0561:
            java.lang.String r6 = "f2_idfrase"
            r2.putString(r6, r4)
            java.lang.String r4 = "f2_id"
            r2.putString(r4, r7)
            java.lang.String r4 = "f2_nombre"
            r2.putString(r4, r1)
            java.lang.String r4 = "f2_privados"
            r12 = r74
            r2.putString(r4, r12)
            java.lang.String r4 = "f2_frase"
            r2.putString(r4, r3)
            java.lang.String r4 = "f2_fcrea"
            r12 = r75
            r2.putString(r4, r12)
            java.lang.String r4 = "f2_b64"
            r2.putString(r4, r5)
            java.lang.String r4 = "f2_tipo"
            r6 = r73
            r2.putString(r4, r6)
            java.lang.String r4 = "f2_b64_th"
            r5 = r72
            r2.putString(r4, r5)
            java.lang.String r4 = "f2_idvideo"
            r5 = r71
            r2.putString(r4, r5)
            java.lang.String r4 = "f2_formato"
            r11 = r68
            r2.putString(r4, r11)
            java.lang.String r4 = "f2_idtema"
            r2.putString(r4, r14)
            java.lang.String r4 = "f2_vfoto"
            r13 = r67
            r2.putString(r4, r13)
            java.lang.String r4 = "f2_fnac_d"
            r15 = r66
            r2.putString(r4, r15)
            java.lang.String r4 = "f2_fnac_m"
            r5 = r65
            r2.putString(r4, r5)
            java.lang.String r4 = "f2_fnac_a"
            r5 = r64
            r2.putString(r4, r5)
            java.lang.String r4 = "f2_sexo"
            r5 = r63
            r2.putString(r4, r5)
            java.lang.String r4 = "f2_coments"
            r5 = r48
            r2.putString(r4, r5)
            java.lang.String r4 = "f2_ultimas"
            r5 = 0
            r2.putBoolean(r4, r5)
            java.lang.String r4 = "f2_ts"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            long r11 = java.lang.System.currentTimeMillis()
            r5.append(r11)
            java.lang.String r11 = ""
            r5.append(r11)
            java.lang.String r5 = r5.toString()
            r2.putString(r4, r5)
            r2.commit()
        L_0x05f6:
            java.lang.String r4 = "0"
            boolean r4 = r10.equals(r4)
            r11 = 0
            if (r4 == 0) goto L_0x0806
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "activa"
            r4.append(r5)
            r4.append(r14)
            java.lang.String r4 = r4.toString()
            r5 = 0
            boolean r4 = r0.getBoolean(r4, r5)
            if (r4 != 0) goto L_0x0806
            java.lang.String r4 = "avisos"
            int r4 = r0.getInt(r4, r5)
            r13 = 2
            if (r4 >= r13) goto L_0x0806
            java.lang.String r4 = "notif_int"
            int r4 = r0.getInt(r4, r5)
            r7 = 9999(0x270f, float:1.4012E-41)
            if (r4 != r7) goto L_0x062e
            r76 = r6
            goto L_0x0669
        L_0x062e:
            java.lang.String r4 = "f_ult_notif"
            r76 = r6
            long r5 = r0.getLong(r4, r11)
            java.lang.Long r4 = java.lang.Long.valueOf(r5)
            long r5 = r4.longValue()
            int r7 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r7 <= 0) goto L_0x0668
            java.lang.String r5 = "notif_int"
            r6 = 0
            int r5 = r0.getInt(r5, r6)
            int r5 = r5 * 60
            int r5 = r5 * 60
            int r5 = r5 * 1000
            long r5 = (long) r5
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            long r6 = java.lang.System.currentTimeMillis()
            long r10 = r4.longValue()
            long r12 = r6 - r10
            long r4 = r5.longValue()
            int r6 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r6 >= 0) goto L_0x0668
            r5 = 0
            goto L_0x0669
        L_0x0668:
            r5 = 1
        L_0x0669:
            if (r5 == 0) goto L_0x0d1d
            java.lang.String r4 = "f_ult_notif"
            long r5 = java.lang.System.currentTimeMillis()
            r2.putLong(r4, r5)
            r2.commit()
            java.lang.String r2 = "notification"
            java.lang.Object r2 = r8.getSystemService(r2)
            android.app.NotificationManager r2 = (android.app.NotificationManager) r2
            java.lang.String r4 = ""
            boolean r4 = r3.equals(r4)
            if (r4 != 0) goto L_0x06ac
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r1)
            java.lang.String r1 = " "
            r4.append(r1)
            android.content.res.Resources r1 = r98.getResources()
            r5 = 2131558563(0x7f0d00a3, float:1.8742445E38)
            java.lang.String r1 = r1.getString(r5)
            r4.append(r1)
            java.lang.String r1 = ":"
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            goto L_0x0713
        L_0x06ac:
            java.lang.String r3 = "0"
            r6 = r76
            boolean r3 = r6.equals(r3)
            if (r3 == 0) goto L_0x06e1
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r1)
            java.lang.String r1 = " "
            r3.append(r1)
            android.content.res.Resources r1 = r98.getResources()
            r4 = 2131558578(0x7f0d00b2, float:1.8742476E38)
            java.lang.String r1 = r1.getString(r4)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            android.content.res.Resources r3 = r98.getResources()
            r4 = 2131558717(0x7f0d013d, float:1.8742758E38)
            java.lang.String r3 = r3.getString(r4)
            goto L_0x0713
        L_0x06e1:
            java.lang.String r3 = "1"
            boolean r3 = r6.equals(r3)
            if (r3 == 0) goto L_0x0805
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r1)
            java.lang.String r1 = " "
            r3.append(r1)
            android.content.res.Resources r1 = r98.getResources()
            r4 = 2131558579(0x7f0d00b3, float:1.8742478E38)
            java.lang.String r1 = r1.getString(r4)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            android.content.res.Resources r3 = r98.getResources()
            r4 = 2131558718(0x7f0d013e, float:1.874276E38)
            java.lang.String r3 = r3.getString(r4)
        L_0x0713:
            java.lang.String r4 = "icohome"
            java.io.FileInputStream r4 = r8.openFileInput(r4)     // Catch:{ Exception | OutOfMemoryError -> 0x0725 }
            java.io.FileDescriptor r5 = r4.getFD()     // Catch:{ Exception | OutOfMemoryError -> 0x0725 }
            android.graphics.Bitmap r5 = android.graphics.BitmapFactory.decodeFileDescriptor(r5)     // Catch:{ Exception | OutOfMemoryError -> 0x0725 }
            r4.close()     // Catch:{ Exception | OutOfMemoryError -> 0x0727 }
            goto L_0x0727
        L_0x0725:
            r5 = r16
        L_0x0727:
            java.lang.String r4 = "avisos"
            r6 = 1
            int r0 = r0.getInt(r4, r6)
            if (r0 != 0) goto L_0x0732
            r0 = 1
            goto L_0x0733
        L_0x0732:
            r0 = 0
        L_0x0733:
            int r4 = android.os.Build.VERSION.SDK_INT
            r6 = 26
            if (r4 < r6) goto L_0x074a
            android.support.v4.app.u$c r4 = new android.support.v4.app.u$c
            android.app.NotificationChannel r6 = m23850c(r8, r0)
            java.lang.String r6 = r6.getId()
            r4.<init>(r8, r6)
        L_0x0746:
            r6 = 2131165492(0x7f070134, float:1.7945203E38)
            goto L_0x0750
        L_0x074a:
            android.support.v4.app.u$c r4 = new android.support.v4.app.u$c
            r4.<init>(r8)
            goto L_0x0746
        L_0x0750:
            android.support.v4.app.u$c r6 = r4.mo1056a(r6)
            android.support.v4.app.u$c r1 = r6.mo1065a(r1)
            android.support.v4.app.u$c r1 = r1.mo1071b(r3)
            r3 = 1
            android.support.v4.app.u$c r1 = r1.mo1082e(r3)
            r1.mo1061a(r5)
            if (r0 != r3) goto L_0x076a
            r0 = 5
            r4.mo1069b(r0)
        L_0x076a:
            android.content.Intent r0 = new android.content.Intent
            java.lang.Class<mega.boicot.preinicio> r1 = mega.boicot.preinicio.class
            r0.<init>(r8, r1)
            java.lang.String r1 = "notif_idtema"
            r0.putExtra(r1, r14)
            java.lang.String r1 = "notif_idsecc"
            r0.putExtra(r1, r9)
            java.lang.String r1 = "fotos_perfil"
            r14 = r56
            int r3 = java.lang.Integer.parseInt(r14)
            r0.putExtra(r1, r3)
            java.lang.String r1 = "fnac"
            r3 = r49
            int r3 = java.lang.Integer.parseInt(r3)
            r0.putExtra(r1, r3)
            java.lang.String r1 = "sexo"
            r6 = r50
            int r3 = java.lang.Integer.parseInt(r6)
            r0.putExtra(r1, r3)
            java.lang.String r1 = "descr"
            r10 = r51
            int r3 = java.lang.Integer.parseInt(r10)
            r0.putExtra(r1, r3)
            java.lang.String r1 = "dist"
            r3 = r52
            int r3 = java.lang.Integer.parseInt(r3)
            r0.putExtra(r1, r3)
            java.lang.String r1 = "privados"
            java.lang.String r3 = "1"
            r5 = r55
            boolean r3 = r5.equals(r3)
            r0.putExtra(r1, r3)
            java.lang.String r1 = "coments"
            java.lang.String r3 = "1"
            r5 = r53
            boolean r3 = r5.equals(r3)
            r0.putExtra(r1, r3)
            java.lang.String r1 = "galeria"
            java.lang.String r3 = "1"
            r5 = r54
            boolean r3 = r5.equals(r3)
            r0.putExtra(r1, r3)
            java.lang.String r1 = "fotos_chat"
            r3 = r57
            int r3 = java.lang.Integer.parseInt(r3)
            r0.putExtra(r1, r3)
            java.lang.String r1 = "c1"
            r3 = r69
            r0.putExtra(r1, r3)
            java.lang.String r1 = "c2"
            r3 = r70
            r0.putExtra(r1, r3)
            r1 = 1
            r3 = 134217728(0x8000000, float:3.85186E-34)
            android.app.PendingIntent r0 = android.app.PendingIntent.getActivity(r8, r1, r0, r3)
            r4.mo1060a(r0)
            android.app.Notification r0 = r4.mo1068b()
            r2.notify(r1, r0)
            goto L_0x0d1d
        L_0x0805:
            return
        L_0x0806:
            java.lang.String r2 = "1"
            boolean r2 = r10.equals(r2)
            if (r2 == 0) goto L_0x0870
            java.lang.String r2 = "privados"
            r3 = 1
            int r2 = r0.getInt(r2, r3)
            if (r2 != r3) goto L_0x0870
            java.lang.String r2 = "activa"
            r3 = 0
            boolean r2 = r0.getBoolean(r2, r3)
            if (r2 == 0) goto L_0x0870
            java.lang.String r2 = "idprivado"
            java.lang.String r3 = "0"
            java.lang.String r2 = r0.getString(r2, r3)
            boolean r2 = r2.equals(r7)
            if (r2 != 0) goto L_0x0870
            long r2 = java.lang.System.currentTimeMillis()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "f_ult_"
            r4.append(r5)
            r4.append(r7)
            java.lang.String r4 = r4.toString()
            long r4 = r0.getLong(r4, r11)
            long r9 = r2 - r4
            r2 = 300000(0x493e0, double:1.482197E-318)
            int r0 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x0d1d
            java.lang.String r0 = "accion"
            r2 = 0
            android.content.SharedPreferences r0 = r8.getSharedPreferences(r0, r2)
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.String r2 = "accion"
            r3 = 1
            r0.putInt(r2, r3)
            java.lang.String r2 = "id_remit"
            r0.putString(r2, r7)
            java.lang.String r2 = "nombre_remit"
            r0.putString(r2, r1)
            r0.commit()
            goto L_0x0d1d
        L_0x0870:
            java.lang.String r2 = "1"
            boolean r2 = r10.equals(r2)
            if (r2 == 0) goto L_0x0d1d
            java.lang.String r2 = "privados"
            r3 = 1
            int r2 = r0.getInt(r2, r3)
            if (r2 != r3) goto L_0x0d1d
            java.lang.String r2 = "activa"
            r3 = 0
            boolean r2 = r0.getBoolean(r2, r3)
            if (r2 != 0) goto L_0x0d1d
            long r2 = java.lang.System.currentTimeMillis()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "f_ult_"
            r4.append(r5)
            r4.append(r7)
            java.lang.String r4 = r4.toString()
            long r4 = r0.getLong(r4, r11)
            long r9 = r2 - r4
            r2 = 300000(0x493e0, double:1.482197E-318)
            int r0 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x0d1d
            java.lang.String r0 = "icohome"
            java.io.FileInputStream r0 = r8.openFileInput(r0)     // Catch:{ Exception | OutOfMemoryError -> 0x08be }
            java.io.FileDescriptor r2 = r0.getFD()     // Catch:{ Exception | OutOfMemoryError -> 0x08be }
            android.graphics.Bitmap r2 = android.graphics.BitmapFactory.decodeFileDescriptor(r2)     // Catch:{ Exception | OutOfMemoryError -> 0x08be }
            r0.close()     // Catch:{ Exception | OutOfMemoryError -> 0x08c0 }
            goto L_0x08c0
        L_0x08be:
            r2 = r16
        L_0x08c0:
            java.lang.String r0 = "notification"
            java.lang.Object r0 = r8.getSystemService(r0)
            r9 = r0
            android.app.NotificationManager r9 = (android.app.NotificationManager) r9
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            java.lang.String r3 = " "
            r0.append(r3)
            android.content.res.Resources r3 = r98.getResources()
            r4 = 2131558723(0x7f0d0143, float:1.874277E38)
            java.lang.String r3 = r3.getString(r4)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            int r0 = android.os.Build.VERSION.SDK_INT
            r4 = 26
            if (r0 < r4) goto L_0x0901
            android.support.v4.app.u$c r0 = new android.support.v4.app.u$c
            r4 = 1
            android.app.NotificationChannel r5 = m23850c(r8, r4)
            java.lang.String r4 = r5.getId()
            r0.<init>(r8, r4)
        L_0x08fc:
            r10 = r0
            r0 = 2131165492(0x7f070134, float:1.7945203E38)
            goto L_0x0907
        L_0x0901:
            android.support.v4.app.u$c r0 = new android.support.v4.app.u$c
            r0.<init>(r8)
            goto L_0x08fc
        L_0x0907:
            android.support.v4.app.u$c r0 = r10.mo1056a(r0)
            android.content.res.Resources r4 = r98.getResources()
            r5 = 2131558738(0x7f0d0152, float:1.87428E38)
            java.lang.String r4 = r4.getString(r5)
            android.support.v4.app.u$c r0 = r0.mo1065a(r4)
            android.support.v4.app.u$c r0 = r0.mo1071b(r3)
            r4 = 1
            android.support.v4.app.u$c r0 = r0.mo1082e(r4)
            r0.mo1061a(r2)
            r0 = 5
            r10.mo1069b(r0)
            android.content.Intent r11 = new android.content.Intent
            java.lang.Class<mega.boicot.preinicio> r0 = mega.boicot.preinicio.class
            r11.<init>(r8, r0)
            java.lang.String r0 = "id_remit"
            r11.putExtra(r0, r7)
            java.lang.String r0 = "nombre_remit"
            r11.putExtra(r0, r1)
            java.lang.String r0 = "0"
            r1 = 2
            boolean r0 = m23843a(r8, r1, r7, r0)
            if (r0 != 0) goto L_0x095b
            android.content.res.Resources r0 = r98.getResources()
            r1 = 2131558738(0x7f0d0152, float:1.87428E38)
            java.lang.String r1 = r0.getString(r1)
            r4 = 3
            r5 = 2
            java.lang.String r12 = "0"
            r0 = r8
            r2 = r3
            r3 = r11
            r6 = r7
            r7 = r12
            m23825a(r0, r1, r2, r3, r4, r5, r6, r7)
        L_0x095b:
            r0 = 3
            r1 = 134217728(0x8000000, float:3.85186E-34)
            android.app.PendingIntent r0 = android.app.PendingIntent.getActivity(r8, r0, r11, r1)
            r10.mo1060a(r0)
            r0 = 3
            android.app.Notification r1 = r10.mo1068b()
            r9.notify(r0, r1)
            goto L_0x0d1d
        L_0x096f:
            return
        L_0x0970:
            r77 = r9
            r2 = r48
            r3 = r49
            r6 = r50
            r10 = r51
            r81 = r53
            r82 = r54
            r83 = r55
            r80 = r56
            r84 = r57
            r5 = r63
            r11 = r64
            r9 = r65
            r15 = r66
            r13 = r67
            r78 = r68
            r79 = r71
            r85 = r52
        L_0x0994:
            java.lang.String r14 = "avisos"
            r86 = r10
            r10 = 0
            int r14 = r0.getInt(r14, r10)
            r10 = 2
            if (r14 >= r10) goto L_0x0d1d
            java.lang.String r14 = ":"
            java.lang.String[] r14 = r4.split(r14)
            r87 = r6
            r17 = 1
            r6 = r14[r17]
            r10 = r14[r10]
            java.lang.String r14 = "notification"
            java.lang.Object r14 = r8.getSystemService(r14)
            android.app.NotificationManager r14 = (android.app.NotificationManager) r14
            r88 = r10
            java.lang.String r10 = "COMFAV:"
            boolean r10 = r4.startsWith(r10)
            if (r10 == 0) goto L_0x09f1
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r6)
            java.lang.String r6 = " "
            r10.append(r6)
            android.content.res.Resources r6 = r98.getResources()
            r89 = r14
            r14 = 2131558649(0x7f0d00f9, float:1.874262E38)
            java.lang.String r6 = r6.getString(r14)
            r10.append(r6)
            java.lang.String r6 = " "
            r10.append(r6)
            r10.append(r1)
            java.lang.String r6 = r10.toString()
            r14 = r43
        L_0x09eb:
            r10 = r88
        L_0x09ed:
            r92 = 5
            goto L_0x0b8a
        L_0x09f1:
            r89 = r14
            java.lang.String r10 = "FGALFAV:"
            boolean r10 = r4.startsWith(r10)
            if (r10 == 0) goto L_0x0a27
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r6)
            java.lang.String r6 = " "
            r10.append(r6)
            android.content.res.Resources r6 = r98.getResources()
            r14 = 2131558645(0x7f0d00f5, float:1.8742612E38)
            java.lang.String r6 = r6.getString(r14)
            r10.append(r6)
            java.lang.String r6 = r10.toString()
            android.content.res.Resources r10 = r98.getResources()
            r14 = 2131558717(0x7f0d013d, float:1.8742758E38)
            java.lang.String r10 = r10.getString(r14)
            r14 = 5
            goto L_0x09ed
        L_0x0a27:
            java.lang.String r10 = "FGALVFAV:"
            boolean r10 = r4.startsWith(r10)
            if (r10 == 0) goto L_0x0a5c
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r6)
            java.lang.String r6 = " "
            r10.append(r6)
            android.content.res.Resources r6 = r98.getResources()
            r14 = 2131558646(0x7f0d00f6, float:1.8742614E38)
            java.lang.String r6 = r6.getString(r14)
            r10.append(r6)
            java.lang.String r6 = r10.toString()
            android.content.res.Resources r10 = r98.getResources()
            r14 = 2131558718(0x7f0d013e, float:1.874276E38)
            java.lang.String r10 = r10.getString(r14)
            r14 = 10
            goto L_0x09ed
        L_0x0a5c:
            java.lang.String r10 = "FPERFAV:"
            boolean r10 = r4.startsWith(r10)
            if (r10 == 0) goto L_0x0a92
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r6)
            java.lang.String r6 = " "
            r10.append(r6)
            android.content.res.Resources r6 = r98.getResources()
            r14 = 2131558653(0x7f0d00fd, float:1.8742628E38)
            java.lang.String r6 = r6.getString(r14)
            r10.append(r6)
            java.lang.String r6 = r10.toString()
            android.content.res.Resources r10 = r98.getResources()
            r14 = 2131558717(0x7f0d013d, float:1.8742758E38)
            java.lang.String r10 = r10.getString(r14)
            r14 = r42
            goto L_0x09ed
        L_0x0a92:
            java.lang.String r10 = "DESCRFAV:"
            boolean r10 = r4.startsWith(r10)
            if (r10 == 0) goto L_0x0abd
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r6)
            java.lang.String r6 = " "
            r10.append(r6)
            android.content.res.Resources r6 = r98.getResources()
            r14 = 2131558652(0x7f0d00fc, float:1.8742626E38)
            java.lang.String r6 = r6.getString(r14)
            r10.append(r6)
            java.lang.String r6 = r10.toString()
            r14 = r41
            goto L_0x09eb
        L_0x0abd:
            java.lang.String r10 = "COMSELFV:"
            boolean r10 = r4.startsWith(r10)
            if (r10 == 0) goto L_0x0aed
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r6)
            java.lang.String r6 = " "
            r10.append(r6)
            android.content.res.Resources r6 = r98.getResources()
            r14 = 2131558648(0x7f0d00f8, float:1.8742618E38)
            java.lang.String r6 = r6.getString(r14)
            r10.append(r6)
            java.lang.String r6 = r10.toString()
            r10 = 9
        L_0x0ae6:
            r14 = r10
            r92 = r43
            r10 = r88
            goto L_0x0b8a
        L_0x0aed:
            java.lang.String r10 = "RESP:"
            boolean r10 = r4.startsWith(r10)
            if (r10 == 0) goto L_0x0b2a
            android.content.res.Resources r10 = r98.getResources()
            r14 = 2131558679(0x7f0d0117, float:1.874268E38)
            java.lang.String r10 = r10.getString(r14)
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            r14.append(r6)
            java.lang.String r6 = " "
            r14.append(r6)
            android.content.res.Resources r6 = r98.getResources()
            r90 = r10
            r10 = 2131558650(0x7f0d00fa, float:1.8742622E38)
            java.lang.String r6 = r6.getString(r10)
            r14.append(r6)
            java.lang.String r6 = r14.toString()
            r10 = 11
            r14 = r10
            r92 = r42
            r10 = r6
            r6 = r90
            goto L_0x0b8a
        L_0x0b2a:
            java.lang.String r10 = "COMENT:"
            boolean r10 = r4.startsWith(r10)
            if (r10 == 0) goto L_0x0b67
            android.content.res.Resources r10 = r98.getResources()
            r14 = 2131558681(0x7f0d0119, float:1.8742685E38)
            java.lang.String r10 = r10.getString(r14)
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            r14.append(r6)
            java.lang.String r6 = " "
            r14.append(r6)
            android.content.res.Resources r6 = r98.getResources()
            r91 = r10
            r10 = 2131558651(0x7f0d00fb, float:1.8742624E38)
            java.lang.String r6 = r6.getString(r10)
            r14.append(r6)
            java.lang.String r6 = r14.toString()
            r10 = 12
            r14 = r10
            r92 = r42
            r10 = r6
            r6 = r91
            goto L_0x0b8a
        L_0x0b67:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r6)
            java.lang.String r6 = " "
            r10.append(r6)
            android.content.res.Resources r6 = r98.getResources()
            r14 = 2131558647(0x7f0d00f7, float:1.8742616E38)
            java.lang.String r6 = r6.getString(r14)
            r10.append(r6)
            java.lang.String r6 = r10.toString()
            r10 = 8
            goto L_0x0ae6
        L_0x0b8a:
            r93 = r14
            java.lang.String r14 = "icohome"
            java.io.FileInputStream r14 = r8.openFileInput(r14)     // Catch:{ Exception | OutOfMemoryError -> 0x0ba0 }
            r94 = r3
            java.io.FileDescriptor r3 = r14.getFD()     // Catch:{ Exception | OutOfMemoryError -> 0x0ba2 }
            android.graphics.Bitmap r3 = android.graphics.BitmapFactory.decodeFileDescriptor(r3)     // Catch:{ Exception | OutOfMemoryError -> 0x0ba2 }
            r14.close()     // Catch:{ Exception | OutOfMemoryError -> 0x0ba4 }
            goto L_0x0ba4
        L_0x0ba0:
            r94 = r3
        L_0x0ba2:
            r3 = r16
        L_0x0ba4:
            java.lang.String r14 = "avisos"
            r95 = r13
            r13 = 1
            int r0 = r0.getInt(r14, r13)
            if (r0 != 0) goto L_0x0bb1
            r0 = 1
            goto L_0x0bb2
        L_0x0bb1:
            r0 = 0
        L_0x0bb2:
            int r13 = android.os.Build.VERSION.SDK_INT
            r14 = 26
            if (r13 < r14) goto L_0x0bc9
            android.support.v4.app.u$c r13 = new android.support.v4.app.u$c
            android.app.NotificationChannel r14 = m23850c(r8, r0)
            java.lang.String r14 = r14.getId()
            r13.<init>(r8, r14)
        L_0x0bc5:
            r14 = 2131165492(0x7f070134, float:1.7945203E38)
            goto L_0x0bcf
        L_0x0bc9:
            android.support.v4.app.u$c r13 = new android.support.v4.app.u$c
            r13.<init>(r8)
            goto L_0x0bc5
        L_0x0bcf:
            android.support.v4.app.u$c r14 = r13.mo1056a(r14)
            android.support.v4.app.u$c r14 = r14.mo1065a(r6)
            android.support.v4.app.u$c r14 = r14.mo1071b(r10)
            r96 = r10
            r10 = 1
            android.support.v4.app.u$c r14 = r14.mo1082e(r10)
            r14.mo1061a(r3)
            if (r0 != r10) goto L_0x0beb
            r0 = 5
            r13.mo1069b(r0)
        L_0x0beb:
            android.content.Intent r10 = new android.content.Intent
            java.lang.Class<mega.boicot.preinicio> r0 = mega.boicot.preinicio.class
            r10.<init>(r8, r0)
            java.lang.String r0 = "RESP:"
            boolean r0 = r4.startsWith(r0)
            if (r0 != 0) goto L_0x0cb5
            java.lang.String r0 = "COMENT:"
            boolean r0 = r4.startsWith(r0)
            if (r0 == 0) goto L_0x0c04
            goto L_0x0cb5
        L_0x0c04:
            java.lang.String r0 = "abrir_perfil"
            r10.putExtra(r0, r7)
            java.lang.String r0 = "privados"
            r10.putExtra(r0, r12)
            java.lang.String r0 = "nombre"
            r10.putExtra(r0, r1)
            java.lang.String r0 = "coments"
            r10.putExtra(r0, r2)
            java.lang.String r0 = "fnac_d"
            r10.putExtra(r0, r15)
            java.lang.String r0 = "fnac_m"
            r10.putExtra(r0, r9)
            java.lang.String r0 = "fnac_a"
            r10.putExtra(r0, r11)
            java.lang.String r0 = "sexo"
            r10.putExtra(r0, r5)
            java.lang.String r0 = "vfoto"
            r1 = r95
            r10.putExtra(r0, r1)
            java.lang.String r0 = "p_fnac"
            r1 = r94
            int r1 = java.lang.Integer.parseInt(r1)
            r10.putExtra(r0, r1)
            java.lang.String r0 = "p_sexo"
            r1 = r87
            int r1 = java.lang.Integer.parseInt(r1)
            r10.putExtra(r0, r1)
            java.lang.String r0 = "p_descr"
            r1 = r86
            int r1 = java.lang.Integer.parseInt(r1)
            r10.putExtra(r0, r1)
            java.lang.String r0 = "p_dist"
            r1 = r85
            int r1 = java.lang.Integer.parseInt(r1)
            r10.putExtra(r0, r1)
            java.lang.String r0 = "coments_chat"
            java.lang.String r1 = "1"
            r2 = r81
            boolean r1 = r2.equals(r1)
            r10.putExtra(r0, r1)
            java.lang.String r0 = "galeria"
            java.lang.String r1 = "1"
            r2 = r82
            boolean r1 = r2.equals(r1)
            r10.putExtra(r0, r1)
            java.lang.String r0 = "privados_chat"
            java.lang.String r1 = "1"
            r14 = r83
            boolean r1 = r14.equals(r1)
            r10.putExtra(r0, r1)
            java.lang.String r0 = "fotos_perfil"
            r14 = r80
            int r1 = java.lang.Integer.parseInt(r14)
            r10.putExtra(r0, r1)
            java.lang.String r0 = "fotos_chat"
            r1 = r84
            int r1 = java.lang.Integer.parseInt(r1)
            r10.putExtra(r0, r1)
            java.lang.String r0 = "COMSELFV:"
            boolean r0 = r4.startsWith(r0)
            if (r0 == 0) goto L_0x0cb2
            java.lang.String r0 = "abrir_perfilv"
            r1 = r79
            r10.putExtra(r0, r1)
            java.lang.String r0 = "abrir_perfilv_formato"
            r9 = r78
            r10.putExtra(r0, r9)
        L_0x0cb2:
            r14 = r93
            goto L_0x0cf7
        L_0x0cb5:
            java.lang.String r0 = "abrir_idsecc"
            r5 = r77
            r10.putExtra(r0, r5)
            java.lang.String r0 = "RESP:"
            boolean r0 = r4.startsWith(r0)
            if (r0 == 0) goto L_0x0cda
            java.lang.String r0 = "abrir_idcat"
            r1 = r58
            r10.putExtra(r0, r1)
            java.lang.String r0 = "abrir_idtema"
            r2 = r59
            r10.putExtra(r0, r2)
            java.lang.String r0 = "idresp_ir"
            r1 = r60
            r10.putExtra(r0, r1)
            goto L_0x0cb2
        L_0x0cda:
            r1 = r58
            r2 = r59
            java.lang.String r0 = "abrir_idcat"
            r10.putExtra(r0, r1)
            java.lang.String r0 = "abrir_idtema"
            r10.putExtra(r0, r2)
            java.lang.String r0 = "abrir_idresp"
            r1 = r61
            r10.putExtra(r0, r1)
            java.lang.String r0 = "idcoment_ir"
            r1 = r62
            r10.putExtra(r0, r1)
            goto L_0x0cb2
        L_0x0cf7:
            boolean r0 = m23843a(r8, r14, r7, r7)
            if (r0 != 0) goto L_0x0d09
            r0 = r8
            r1 = r6
            r2 = r96
            r3 = r10
            r4 = r92
            r5 = r14
            r6 = r7
            m23825a(r0, r1, r2, r3, r4, r5, r6, r7)
        L_0x0d09:
            r0 = r92
            r1 = 134217728(0x8000000, float:3.85186E-34)
            android.app.PendingIntent r1 = android.app.PendingIntent.getActivity(r8, r0, r10, r1)
            r13.mo1060a(r1)
            android.app.Notification r1 = r13.mo1068b()
            r14 = r89
            r14.notify(r0, r1)
        L_0x0d1d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: mega.boicot.config.m23849b(android.content.Context, java.lang.String):void");
    }

    /* renamed from: a */
    static void m23835a(Context context, String str, String str2, final String str3) {
        Builder builder = new Builder(context);
        builder.setCancelable(true).setPositiveButton(context.getString(R.string.cerrar), null).setMessage(str2);
        if (!str.equals("")) {
            builder.setTitle(str);
        }
        final AlertDialog create = builder.create();
        if (!str3.equals("")) {
            create.setOnShowListener(new OnShowListener() {
                public void onShow(DialogInterface dialogInterface) {
                    Button button = create.getButton(-1);
                    StringBuilder sb = new StringBuilder();
                    sb.append("#");
                    sb.append(str3);
                    button.setTextColor(Color.parseColor(sb.toString()));
                }
            });
        }
        create.show();
        try {
            ((TextView) create.findViewById(16908299)).setTypeface(Typeface.MONOSPACE);
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public static void m23834a(Context context, String str, String str2) {
        int i = 0;
        SharedPreferences sharedPreferences = context.getSharedPreferences("sh", 0);
        boolean z = false;
        int i2 = 0;
        while (!z && i2 < 100) {
            StringBuilder sb = new StringBuilder();
            sb.append("privado");
            sb.append(i2);
            sb.append("_id");
            z = sharedPreferences.getString(sb.toString(), "").equals(str);
            i2++;
        }
        Editor edit = sharedPreferences.edit();
        if (!z) {
            while (!z && i < 100) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("privado");
                sb2.append(i);
                sb2.append("_id");
                if (!sharedPreferences.contains(sb2.toString())) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("privado");
                    sb3.append(i);
                    sb3.append("_id");
                    edit.putString(sb3.toString(), str);
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("privado");
                    sb4.append(i);
                    sb4.append("_nombre");
                    edit.putString(sb4.toString(), str2);
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append("privado");
                    sb5.append(i);
                    sb5.append("_fultconex");
                    edit.putLong(sb5.toString(), System.currentTimeMillis());
                    z = true;
                }
                i++;
            }
        } else {
            int i3 = i2 - 1;
            StringBuilder sb6 = new StringBuilder();
            sb6.append("privado");
            sb6.append(i3);
            sb6.append("_id");
            edit.putString(sb6.toString(), str);
            StringBuilder sb7 = new StringBuilder();
            sb7.append("privado");
            sb7.append(i3);
            sb7.append("_nombre");
            edit.putString(sb7.toString(), str2);
            StringBuilder sb8 = new StringBuilder();
            sb8.append("privado");
            sb8.append(i3);
            sb8.append("_fultconex");
            edit.putLong(sb8.toString(), System.currentTimeMillis());
        }
        edit.commit();
    }

    /* renamed from: c */
    public static void m23852c(Context context, String str) {
        boolean z = false;
        SharedPreferences sharedPreferences = context.getSharedPreferences("sh", 0);
        int i = 0;
        while (!z && i < 100) {
            StringBuilder sb = new StringBuilder();
            sb.append("privado");
            sb.append(i);
            sb.append("_id");
            if (sharedPreferences.getString(sb.toString(), "").equals(str)) {
                Editor edit = sharedPreferences.edit();
                StringBuilder sb2 = new StringBuilder();
                sb2.append("privado");
                sb2.append(i);
                sb2.append("_id");
                edit.remove(sb2.toString());
                edit.commit();
                z = true;
            }
            i++;
        }
    }

    /* renamed from: b */
    public static String m23848b(String str) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("ddMMyyHHmm");
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("Europe/Madrid"));
        try {
            Date parse = simpleDateFormat.parse(str);
            SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("ddMMyyHHmm");
            simpleDateFormat2.setTimeZone(TimeZone.getDefault());
            return simpleDateFormat2.format(parse);
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    /* renamed from: c */
    public static String m23851c(String str) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("ddMMyyHHmm");
        simpleDateFormat.setTimeZone(TimeZone.getDefault());
        try {
            Date parse = simpleDateFormat.parse(str);
            SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("ddMMyyHHmm");
            simpleDateFormat2.setTimeZone(TimeZone.getTimeZone("Europe/Madrid"));
            return simpleDateFormat2.format(parse);
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    /* renamed from: i */
    public static int m23856i(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (NameNotFoundException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Could not get package name: ");
            sb.append(e);
            throw new RuntimeException(sb.toString());
        }
    }

    /* renamed from: j */
    public static String m23857j(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (NameNotFoundException unused) {
            return "";
        }
    }

    @TargetApi(21)
    /* renamed from: a */
    public static void m23838a(ProgressBar progressBar, String str) {
        if (VERSION.SDK_INT >= 21 && str != null && !str.equals("") && !str.equals("#")) {
            int[][] iArr = {new int[]{16842910}, new int[]{-16842910}, new int[]{-16842912}, new int[]{16842919}};
            StringBuilder sb = new StringBuilder();
            sb.append("#");
            sb.append(str);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("#");
            sb2.append(str);
            StringBuilder sb3 = new StringBuilder();
            sb3.append("#");
            sb3.append(str);
            StringBuilder sb4 = new StringBuilder();
            sb4.append("#");
            sb4.append(str);
            progressBar.setIndeterminateTintList(new ColorStateList(iArr, new int[]{Color.parseColor(sb.toString()), Color.parseColor(sb2.toString()), Color.parseColor(sb3.toString()), Color.parseColor(sb4.toString())}));
        }
    }

    @TargetApi(21)
    /* renamed from: a */
    public static void m23837a(EditText editText, Boolean bool, String str) {
        if (VERSION.SDK_INT >= 21 && str != null && !str.equals("") && !str.equals("#")) {
            String str2 = "000000";
            String str3 = "212121";
            if (bool.booleanValue()) {
                str2 = "FFFFFF";
                str3 = "FAFAFA";
            }
            StringBuilder sb = new StringBuilder();
            sb.append("#");
            sb.append(str2);
            editText.setTextColor(Color.parseColor(sb.toString()));
            int[][] iArr = {new int[]{16842908}, new int[]{-16842908}};
            StringBuilder sb2 = new StringBuilder();
            sb2.append("#");
            sb2.append(str);
            StringBuilder sb3 = new StringBuilder();
            sb3.append("#");
            sb3.append(str3);
            editText.setBackgroundTintList(new ColorStateList(iArr, new int[]{Color.parseColor(sb2.toString()), Color.parseColor(sb3.toString())}));
        }
    }

    @TargetApi(21)
    /* renamed from: a */
    public static void m23836a(CheckBox checkBox, String str) {
        if (VERSION.SDK_INT >= 21 && str != null && !str.equals("") && !str.equals("#")) {
            int[][] iArr = {new int[]{16842908}, new int[]{-16842908}};
            StringBuilder sb = new StringBuilder();
            sb.append("#");
            sb.append(str);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("#");
            sb2.append(str);
            checkBox.setButtonTintList(new ColorStateList(iArr, new int[]{Color.parseColor(sb.toString()), Color.parseColor(sb2.toString())}));
        }
    }

    @TargetApi(21)
    /* renamed from: a */
    public static void m23833a(Activity activity, String str) {
        if (VERSION.SDK_INT > 20) {
            float[] fArr = new float[3];
            StringBuilder sb = new StringBuilder();
            sb.append("#");
            sb.append(str);
            Color.colorToHSV(Color.parseColor(sb.toString()), fArr);
            fArr[2] = fArr[2] * 0.8f;
            int HSVToColor = Color.HSVToColor(fArr);
            activity.getWindow().addFlags(Integer.MIN_VALUE);
            activity.getWindow().setStatusBarColor(HSVToColor);
        }
    }

    /* renamed from: k */
    public static boolean m23858k(Context context) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    /* JADX WARNING: Removed duplicated region for block: B:99:0x01c6 A[Catch:{ MalformedURLException -> 0x023a, IOException -> 0x0234, XmlPullParserException -> 0x022e, ParseException -> 0x0228 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.ArrayList<mega.boicot.C5728q> m23832a(java.io.InputStream r17) {
        /*
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            org.xmlpull.v1.XmlPullParserFactory r2 = org.xmlpull.v1.XmlPullParserFactory.newInstance()     // Catch:{ MalformedURLException -> 0x023a, IOException -> 0x0234, XmlPullParserException -> 0x022e, ParseException -> 0x0228 }
            r3 = 1
            r2.setNamespaceAware(r3)     // Catch:{ MalformedURLException -> 0x023a, IOException -> 0x0234, XmlPullParserException -> 0x022e, ParseException -> 0x0228 }
            org.xmlpull.v1.XmlPullParser r2 = r2.newPullParser()     // Catch:{ MalformedURLException -> 0x023a, IOException -> 0x0234, XmlPullParserException -> 0x022e, ParseException -> 0x0228 }
            r4 = 0
            r5 = r17
            r2.setInput(r5, r4)     // Catch:{ MalformedURLException -> 0x023a, IOException -> 0x0234, XmlPullParserException -> 0x022e, ParseException -> 0x0228 }
            int r5 = r2.getEventType()     // Catch:{ MalformedURLException -> 0x023a, IOException -> 0x0234, XmlPullParserException -> 0x022e, ParseException -> 0x0228 }
            java.text.SimpleDateFormat r6 = new java.text.SimpleDateFormat     // Catch:{ MalformedURLException -> 0x023a, IOException -> 0x0234, XmlPullParserException -> 0x022e, ParseException -> 0x0228 }
            java.lang.String r7 = "EEE, dd MMM yyyy HH:mm:ss Z"
            java.util.Locale r8 = java.util.Locale.US     // Catch:{ MalformedURLException -> 0x023a, IOException -> 0x0234, XmlPullParserException -> 0x022e, ParseException -> 0x0228 }
            r6.<init>(r7, r8)     // Catch:{ MalformedURLException -> 0x023a, IOException -> 0x0234, XmlPullParserException -> 0x022e, ParseException -> 0x0228 }
            r7 = 3
            java.text.DateFormat r8 = java.text.SimpleDateFormat.getDateTimeInstance(r7, r7)     // Catch:{ MalformedURLException -> 0x023a, IOException -> 0x0234, XmlPullParserException -> 0x022e, ParseException -> 0x0228 }
            java.text.DateFormat r9 = java.text.SimpleDateFormat.getDateInstance(r7)     // Catch:{ MalformedURLException -> 0x023a, IOException -> 0x0234, XmlPullParserException -> 0x022e, ParseException -> 0x0228 }
            java.util.Calendar r10 = java.util.Calendar.getInstance()     // Catch:{ MalformedURLException -> 0x023a, IOException -> 0x0234, XmlPullParserException -> 0x022e, ParseException -> 0x0228 }
            r12 = -1
            r13 = r4
            r14 = r12
            r15 = 0
        L_0x0035:
            if (r5 == r3) goto L_0x023f
            r11 = 2
            r3 = 4
            if (r5 != 0) goto L_0x003d
            goto L_0x021f
        L_0x003d:
            if (r5 != r11) goto L_0x00ae
            java.lang.String r5 = r2.getName()     // Catch:{ MalformedURLException -> 0x023a, IOException -> 0x0234, XmlPullParserException -> 0x022e, ParseException -> 0x0228 }
            java.lang.String r14 = "item"
            boolean r5 = r5.equalsIgnoreCase(r14)     // Catch:{ MalformedURLException -> 0x023a, IOException -> 0x0234, XmlPullParserException -> 0x022e, ParseException -> 0x0228 }
            if (r5 == 0) goto L_0x0055
            mega.boicot.q r3 = new mega.boicot.q     // Catch:{ MalformedURLException -> 0x023a, IOException -> 0x0234, XmlPullParserException -> 0x022e, ParseException -> 0x0228 }
            r3.<init>()     // Catch:{ MalformedURLException -> 0x023a, IOException -> 0x0234, XmlPullParserException -> 0x022e, ParseException -> 0x0228 }
            r13 = r3
            r14 = 0
            r15 = 0
            goto L_0x021f
        L_0x0055:
            java.lang.String r5 = r2.getName()     // Catch:{ MalformedURLException -> 0x023a, IOException -> 0x0234, XmlPullParserException -> 0x022e, ParseException -> 0x0228 }
            java.lang.String r14 = "title"
            boolean r5 = r5.equalsIgnoreCase(r14)     // Catch:{ MalformedURLException -> 0x023a, IOException -> 0x0234, XmlPullParserException -> 0x022e, ParseException -> 0x0228 }
            if (r5 == 0) goto L_0x0064
            r14 = 1
            goto L_0x021f
        L_0x0064:
            java.lang.String r5 = r2.getName()     // Catch:{ MalformedURLException -> 0x023a, IOException -> 0x0234, XmlPullParserException -> 0x022e, ParseException -> 0x0228 }
            java.lang.String r14 = "link"
            boolean r5 = r5.equalsIgnoreCase(r14)     // Catch:{ MalformedURLException -> 0x023a, IOException -> 0x0234, XmlPullParserException -> 0x022e, ParseException -> 0x0228 }
            if (r5 == 0) goto L_0x0073
            r14 = r11
            goto L_0x021f
        L_0x0073:
            java.lang.String r5 = r2.getName()     // Catch:{ MalformedURLException -> 0x023a, IOException -> 0x0234, XmlPullParserException -> 0x022e, ParseException -> 0x0228 }
            java.lang.String r11 = "pubDate"
            boolean r5 = r5.equalsIgnoreCase(r11)     // Catch:{ MalformedURLException -> 0x023a, IOException -> 0x0234, XmlPullParserException -> 0x022e, ParseException -> 0x0228 }
            if (r5 == 0) goto L_0x0082
            r14 = r7
            goto L_0x021f
        L_0x0082:
            java.lang.String r5 = r2.getName()     // Catch:{ MalformedURLException -> 0x023a, IOException -> 0x0234, XmlPullParserException -> 0x022e, ParseException -> 0x0228 }
            java.lang.String r11 = "description"
            boolean r5 = r5.equalsIgnoreCase(r11)     // Catch:{ MalformedURLException -> 0x023a, IOException -> 0x0234, XmlPullParserException -> 0x022e, ParseException -> 0x0228 }
            if (r5 == 0) goto L_0x0091
        L_0x008e:
            r14 = r3
            goto L_0x021f
        L_0x0091:
            java.lang.String r3 = r2.getName()     // Catch:{ MalformedURLException -> 0x023a, IOException -> 0x0234, XmlPullParserException -> 0x022e, ParseException -> 0x0228 }
            java.lang.String r5 = "encoded"
            boolean r3 = r3.equalsIgnoreCase(r5)     // Catch:{ MalformedURLException -> 0x023a, IOException -> 0x0234, XmlPullParserException -> 0x022e, ParseException -> 0x0228 }
            if (r3 == 0) goto L_0x00ac
            java.lang.String r3 = r2.getPrefix()     // Catch:{ MalformedURLException -> 0x023a, IOException -> 0x0234, XmlPullParserException -> 0x022e, ParseException -> 0x0228 }
            java.lang.String r5 = "content"
            boolean r3 = r3.equalsIgnoreCase(r5)     // Catch:{ MalformedURLException -> 0x023a, IOException -> 0x0234, XmlPullParserException -> 0x022e, ParseException -> 0x0228 }
            if (r3 == 0) goto L_0x00ac
            r14 = 6
            goto L_0x021f
        L_0x00ac:
            r3 = 5
            goto L_0x008e
        L_0x00ae:
            if (r5 != r7) goto L_0x00fe
            java.lang.String r3 = r2.getName()     // Catch:{ MalformedURLException -> 0x023a, IOException -> 0x0234, XmlPullParserException -> 0x022e, ParseException -> 0x0228 }
            java.lang.String r5 = "item"
            boolean r3 = r3.equalsIgnoreCase(r5)     // Catch:{ MalformedURLException -> 0x023a, IOException -> 0x0234, XmlPullParserException -> 0x022e, ParseException -> 0x0228 }
            if (r3 == 0) goto L_0x00fb
            java.lang.String r3 = r13.f18491e     // Catch:{ MalformedURLException -> 0x023a, IOException -> 0x0234, XmlPullParserException -> 0x022e, ParseException -> 0x0228 }
            if (r3 == 0) goto L_0x00f6
            java.lang.String r3 = r13.f18491e     // Catch:{ ParseException -> 0x00ef }
            java.lang.String r5 = "\\p{Cntrl}"
            java.lang.String r11 = ""
            java.lang.String r3 = r3.replaceAll(r5, r11)     // Catch:{ ParseException -> 0x00ef }
            java.util.Date r3 = r6.parse(r3)     // Catch:{ ParseException -> 0x00ef }
            r10.setTime(r3)     // Catch:{ ParseException -> 0x00ef }
            r5 = 11
            int r5 = r10.get(r5)     // Catch:{ ParseException -> 0x00ef }
            if (r5 != 0) goto L_0x00e8
            r5 = 12
            int r5 = r10.get(r5)     // Catch:{ ParseException -> 0x00ef }
            if (r5 != 0) goto L_0x00e8
            java.lang.String r3 = r9.format(r3)     // Catch:{ ParseException -> 0x00ef }
            r13.f18491e = r3     // Catch:{ ParseException -> 0x00ef }
            goto L_0x00f6
        L_0x00e8:
            java.lang.String r3 = r8.format(r3)     // Catch:{ ParseException -> 0x00ef }
            r13.f18491e = r3     // Catch:{ ParseException -> 0x00ef }
            goto L_0x00f6
        L_0x00ef:
            r0 = move-exception
            r3 = r0
            r13.f18491e = r4     // Catch:{ MalformedURLException -> 0x023a, IOException -> 0x0234, XmlPullParserException -> 0x022e, ParseException -> 0x0228 }
            r3.printStackTrace()     // Catch:{ MalformedURLException -> 0x023a, IOException -> 0x0234, XmlPullParserException -> 0x022e, ParseException -> 0x0228 }
        L_0x00f6:
            r1.add(r13)     // Catch:{ MalformedURLException -> 0x023a, IOException -> 0x0234, XmlPullParserException -> 0x022e, ParseException -> 0x0228 }
            goto L_0x021f
        L_0x00fb:
            r14 = 0
            goto L_0x021f
        L_0x00fe:
            if (r5 != r3) goto L_0x021f
            java.lang.String r3 = r2.getText()     // Catch:{ MalformedURLException -> 0x023a, IOException -> 0x0234, XmlPullParserException -> 0x022e, ParseException -> 0x0228 }
            java.lang.String r3 = r3.trim()     // Catch:{ MalformedURLException -> 0x023a, IOException -> 0x0234, XmlPullParserException -> 0x022e, ParseException -> 0x0228 }
            if (r13 == 0) goto L_0x021f
            switch(r14) {
                case 1: goto L_0x0202;
                case 2: goto L_0x01ec;
                case 3: goto L_0x01d6;
                case 4: goto L_0x0115;
                case 5: goto L_0x010f;
                case 6: goto L_0x011d;
                default: goto L_0x010d;
            }     // Catch:{ MalformedURLException -> 0x023a, IOException -> 0x0234, XmlPullParserException -> 0x022e, ParseException -> 0x0228 }
        L_0x010d:
            goto L_0x021f
        L_0x010f:
            java.lang.String r5 = r13.f18487a     // Catch:{ MalformedURLException -> 0x023a, IOException -> 0x0234, XmlPullParserException -> 0x022e, ParseException -> 0x0228 }
            if (r5 == 0) goto L_0x0115
            goto L_0x021f
        L_0x0115:
            java.lang.String r5 = r13.f18487a     // Catch:{ MalformedURLException -> 0x023a, IOException -> 0x0234, XmlPullParserException -> 0x022e, ParseException -> 0x0228 }
            if (r5 == 0) goto L_0x011d
            if (r15 == 0) goto L_0x011d
            goto L_0x021f
        L_0x011d:
            int r5 = r3.length()     // Catch:{ MalformedURLException -> 0x023a, IOException -> 0x0234, XmlPullParserException -> 0x022e, ParseException -> 0x0228 }
            if (r5 == 0) goto L_0x021f
            java.lang.String r5 = ".jpg"
            int r5 = r3.indexOf(r5)     // Catch:{ MalformedURLException -> 0x023a, IOException -> 0x0234, XmlPullParserException -> 0x022e, ParseException -> 0x0228 }
            java.lang.String r11 = ".png"
            int r11 = r3.indexOf(r11)     // Catch:{ MalformedURLException -> 0x023a, IOException -> 0x0234, XmlPullParserException -> 0x022e, ParseException -> 0x0228 }
            r4 = 999999(0xf423f, float:1.401297E-39)
            if (r5 != r12) goto L_0x0135
            r5 = r4
        L_0x0135:
            if (r11 != r12) goto L_0x0138
            r11 = r4
        L_0x0138:
            int r5 = java.lang.Math.min(r5, r11)     // Catch:{ MalformedURLException -> 0x023a, IOException -> 0x0234, XmlPullParserException -> 0x022e, ParseException -> 0x0228 }
            if (r5 == r4) goto L_0x01d3
            int r11 = r5 + 1
            java.lang.String r11 = r3.substring(r5, r11)     // Catch:{ MalformedURLException -> 0x023a, IOException -> 0x0234, XmlPullParserException -> 0x022e, ParseException -> 0x0228 }
            r7 = r11
            r4 = 1
            r11 = r5
        L_0x0147:
            if (r11 <= r4) goto L_0x016c
            java.lang.String r4 = "'"
            boolean r4 = r7.equals(r4)     // Catch:{ MalformedURLException -> 0x023a, IOException -> 0x0234, XmlPullParserException -> 0x022e, ParseException -> 0x0228 }
            if (r4 != 0) goto L_0x016b
            java.lang.String r4 = "\""
            boolean r4 = r7.equals(r4)     // Catch:{ MalformedURLException -> 0x023a, IOException -> 0x0234, XmlPullParserException -> 0x022e, ParseException -> 0x0228 }
            if (r4 != 0) goto L_0x016b
            java.lang.String r4 = "="
            boolean r4 = r7.equals(r4)     // Catch:{ MalformedURLException -> 0x023a, IOException -> 0x0234, XmlPullParserException -> 0x022e, ParseException -> 0x0228 }
            if (r4 != 0) goto L_0x016b
            int r11 = r11 + -1
            int r4 = r11 + 1
            java.lang.String r7 = r3.substring(r11, r4)     // Catch:{ MalformedURLException -> 0x023a, IOException -> 0x0234, XmlPullParserException -> 0x022e, ParseException -> 0x0228 }
            r4 = 1
            goto L_0x0147
        L_0x016b:
            r4 = 1
        L_0x016c:
            if (r11 <= r4) goto L_0x01d3
            int r11 = r11 + 1
            int r5 = r5 + 4
            java.lang.String r7 = r3.substring(r11, r5)     // Catch:{ MalformedURLException -> 0x023a, IOException -> 0x0234, XmlPullParserException -> 0x022e, ParseException -> 0x0228 }
            java.lang.String r11 = "http"
            boolean r11 = r7.startsWith(r11)     // Catch:{ MalformedURLException -> 0x023a, IOException -> 0x0234, XmlPullParserException -> 0x022e, ParseException -> 0x0228 }
            if (r11 == 0) goto L_0x01d3
            java.lang.String r11 = "&gt;"
            int r11 = r3.indexOf(r11, r5)     // Catch:{ MalformedURLException -> 0x023a, IOException -> 0x0234, XmlPullParserException -> 0x022e, ParseException -> 0x0228 }
            java.lang.String r4 = ">"
            int r4 = r3.indexOf(r4, r5)     // Catch:{ MalformedURLException -> 0x023a, IOException -> 0x0234, XmlPullParserException -> 0x022e, ParseException -> 0x0228 }
            if (r11 != r12) goto L_0x018f
            r11 = 999999(0xf423f, float:1.401297E-39)
        L_0x018f:
            if (r4 != r12) goto L_0x0194
            r4 = 999999(0xf423f, float:1.401297E-39)
        L_0x0194:
            int r4 = java.lang.Math.min(r11, r4)     // Catch:{ MalformedURLException -> 0x023a, IOException -> 0x0234, XmlPullParserException -> 0x022e, ParseException -> 0x0228 }
            r11 = 999999(0xf423f, float:1.401297E-39)
            if (r4 == r11) goto L_0x01c3
            java.lang.String r3 = r3.substring(r5, r4)     // Catch:{ MalformedURLException -> 0x023a, IOException -> 0x0234, XmlPullParserException -> 0x022e, ParseException -> 0x0228 }
            java.lang.String r4 = "width=\"1\""
            int r4 = r3.indexOf(r4)     // Catch:{ MalformedURLException -> 0x023a, IOException -> 0x0234, XmlPullParserException -> 0x022e, ParseException -> 0x0228 }
            if (r4 == r12) goto L_0x01b1
            java.lang.String r4 = "height=\"1\""
            int r4 = r3.indexOf(r4)     // Catch:{ MalformedURLException -> 0x023a, IOException -> 0x0234, XmlPullParserException -> 0x022e, ParseException -> 0x0228 }
            if (r4 != r12) goto L_0x01c1
        L_0x01b1:
            java.lang.String r4 = "width='1'"
            int r4 = r3.indexOf(r4)     // Catch:{ MalformedURLException -> 0x023a, IOException -> 0x0234, XmlPullParserException -> 0x022e, ParseException -> 0x0228 }
            if (r4 == r12) goto L_0x01c3
            java.lang.String r4 = "height='1'"
            int r3 = r3.indexOf(r4)     // Catch:{ MalformedURLException -> 0x023a, IOException -> 0x0234, XmlPullParserException -> 0x022e, ParseException -> 0x0228 }
            if (r3 == r12) goto L_0x01c3
        L_0x01c1:
            r3 = 0
            goto L_0x01c4
        L_0x01c3:
            r3 = 1
        L_0x01c4:
            if (r3 == 0) goto L_0x01d3
            java.lang.String r3 = "UTF-8"
            java.lang.String r3 = java.net.URLDecoder.decode(r7, r3)     // Catch:{ MalformedURLException -> 0x023a, IOException -> 0x0234, XmlPullParserException -> 0x022e, ParseException -> 0x0228 }
            r13.f18487a = r3     // Catch:{ MalformedURLException -> 0x023a, IOException -> 0x0234, XmlPullParserException -> 0x022e, ParseException -> 0x0228 }
            r3 = 6
            if (r14 != r3) goto L_0x01d3
            r11 = 1
            goto L_0x01d4
        L_0x01d3:
            r11 = r15
        L_0x01d4:
            r15 = r11
            goto L_0x021f
        L_0x01d6:
            int r4 = r3.length()     // Catch:{ MalformedURLException -> 0x023a, IOException -> 0x0234, XmlPullParserException -> 0x022e, ParseException -> 0x0228 }
            if (r4 == 0) goto L_0x021f
            java.lang.String r4 = r13.f18491e     // Catch:{ MalformedURLException -> 0x023a, IOException -> 0x0234, XmlPullParserException -> 0x022e, ParseException -> 0x0228 }
            if (r4 == 0) goto L_0x01e9
            java.lang.String r4 = r13.f18491e     // Catch:{ MalformedURLException -> 0x023a, IOException -> 0x0234, XmlPullParserException -> 0x022e, ParseException -> 0x0228 }
            int r4 = r4.length()     // Catch:{ MalformedURLException -> 0x023a, IOException -> 0x0234, XmlPullParserException -> 0x022e, ParseException -> 0x0228 }
            if (r4 <= 0) goto L_0x01e9
            goto L_0x021f
        L_0x01e9:
            r13.f18491e = r3     // Catch:{ MalformedURLException -> 0x023a, IOException -> 0x0234, XmlPullParserException -> 0x022e, ParseException -> 0x0228 }
            goto L_0x021f
        L_0x01ec:
            int r4 = r3.length()     // Catch:{ MalformedURLException -> 0x023a, IOException -> 0x0234, XmlPullParserException -> 0x022e, ParseException -> 0x0228 }
            if (r4 == 0) goto L_0x021f
            java.lang.String r4 = r13.f18492f     // Catch:{ MalformedURLException -> 0x023a, IOException -> 0x0234, XmlPullParserException -> 0x022e, ParseException -> 0x0228 }
            if (r4 == 0) goto L_0x01ff
            java.lang.String r4 = r13.f18492f     // Catch:{ MalformedURLException -> 0x023a, IOException -> 0x0234, XmlPullParserException -> 0x022e, ParseException -> 0x0228 }
            int r4 = r4.length()     // Catch:{ MalformedURLException -> 0x023a, IOException -> 0x0234, XmlPullParserException -> 0x022e, ParseException -> 0x0228 }
            if (r4 <= 0) goto L_0x01ff
            goto L_0x021f
        L_0x01ff:
            r13.f18492f = r3     // Catch:{ MalformedURLException -> 0x023a, IOException -> 0x0234, XmlPullParserException -> 0x022e, ParseException -> 0x0228 }
            goto L_0x021f
        L_0x0202:
            int r4 = r3.length()     // Catch:{ MalformedURLException -> 0x023a, IOException -> 0x0234, XmlPullParserException -> 0x022e, ParseException -> 0x0228 }
            if (r4 == 0) goto L_0x021f
            java.lang.String r4 = r13.f18490d     // Catch:{ MalformedURLException -> 0x023a, IOException -> 0x0234, XmlPullParserException -> 0x022e, ParseException -> 0x0228 }
            if (r4 == 0) goto L_0x0215
            java.lang.String r4 = r13.f18490d     // Catch:{ MalformedURLException -> 0x023a, IOException -> 0x0234, XmlPullParserException -> 0x022e, ParseException -> 0x0228 }
            int r4 = r4.length()     // Catch:{ MalformedURLException -> 0x023a, IOException -> 0x0234, XmlPullParserException -> 0x022e, ParseException -> 0x0228 }
            if (r4 <= 0) goto L_0x0215
            goto L_0x021f
        L_0x0215:
            android.text.Spanned r3 = android.text.Html.fromHtml(r3)     // Catch:{ MalformedURLException -> 0x023a, IOException -> 0x0234, XmlPullParserException -> 0x022e, ParseException -> 0x0228 }
            java.lang.String r3 = r3.toString()     // Catch:{ MalformedURLException -> 0x023a, IOException -> 0x0234, XmlPullParserException -> 0x022e, ParseException -> 0x0228 }
            r13.f18490d = r3     // Catch:{ MalformedURLException -> 0x023a, IOException -> 0x0234, XmlPullParserException -> 0x022e, ParseException -> 0x0228 }
        L_0x021f:
            int r5 = r2.next()     // Catch:{ MalformedURLException -> 0x023a, IOException -> 0x0234, XmlPullParserException -> 0x022e, ParseException -> 0x0228 }
            r3 = 1
            r4 = 0
            r7 = 3
            goto L_0x0035
        L_0x0228:
            r0 = move-exception
            r2 = r0
            r2.printStackTrace()
            goto L_0x023f
        L_0x022e:
            r0 = move-exception
            r2 = r0
            r2.printStackTrace()
            goto L_0x023f
        L_0x0234:
            r0 = move-exception
            r2 = r0
            r2.printStackTrace()
            goto L_0x023f
        L_0x023a:
            r0 = move-exception
            r2 = r0
            r2.printStackTrace()
        L_0x023f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: mega.boicot.config.m23832a(java.io.InputStream):java.util.ArrayList");
    }

    /* renamed from: a */
    public static Intent m23827a(Intent intent, Bundle bundle) {
        intent.putExtra("externo", true);
        intent.putExtra("idchat", bundle.getInt("idchat"));
        intent.putExtra("idtema", bundle.getInt("idtema"));
        intent.putExtra("fotos_perfil", bundle.getInt("fotos_perfil"));
        intent.putExtra("fnac", bundle.getInt("fnac"));
        intent.putExtra("sexo", bundle.getInt("sexo"));
        intent.putExtra("descr", bundle.getInt("descr"));
        intent.putExtra("dist", bundle.getInt("dist"));
        intent.putExtra("privados", bundle.getBoolean("privados"));
        intent.putExtra("coments", bundle.getBoolean("coments"));
        intent.putExtra("galeria", bundle.getBoolean("galeria"));
        intent.putExtra("fotos_chat", bundle.getInt("fotos_chat"));
        intent.putExtra("c1", bundle.getString("c1"));
        intent.putExtra("c2", bundle.getString("c2"));
        return intent;
    }

    /* renamed from: a */
    public static Bitmap m23828a(Bitmap bitmap, int i) {
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        Rect rect = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
        RectF rectF = new RectF(0.0f, 0.0f, (float) bitmap.getWidth(), (float) bitmap.getHeight());
        paint.setAntiAlias(true);
        canvas.drawARGB(0, 0, 0, 0);
        paint.setColor(-12434878);
        if (i == 1) {
            i = 5;
        } else if (i == 2) {
            i = 10;
        } else if (i == 3) {
            i = 20;
        }
        float f = (float) i;
        canvas.drawRoundRect(rectF, f, f, paint);
        paint.setXfermode(new PorterDuffXfermode(Mode.SRC_IN));
        canvas.drawBitmap(bitmap, rect, rect, paint);
        return createBitmap;
    }

    /* renamed from: b */
    public static Bitmap m23846b(Bitmap bitmap, int i) {
        int i2;
        if (bitmap == null || bitmap.isRecycled()) {
            return null;
        }
        try {
            int min = Math.min(bitmap.getWidth(), bitmap.getHeight());
            int i3 = 0;
            if (bitmap.getWidth() > bitmap.getHeight()) {
                i2 = (bitmap.getWidth() / 2) - (min / 2);
            } else {
                i3 = (bitmap.getHeight() / 2) - (min / 2);
                i2 = 0;
            }
            Bitmap createBitmap = Bitmap.createBitmap(bitmap, i2, i3, min, min);
            int width = createBitmap.getWidth() + i;
            int height = createBitmap.getHeight() + i;
            Bitmap createBitmap2 = Bitmap.createBitmap(width, height, Config.ARGB_8888);
            BitmapShader bitmapShader = new BitmapShader(createBitmap, TileMode.CLAMP, TileMode.CLAMP);
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            paint.setShader(bitmapShader);
            Canvas canvas = new Canvas(createBitmap2);
            float f = (width > height ? (float) height : (float) width) / 2.0f;
            canvas.drawCircle((float) (width / 2), (float) (height / 2), f, paint);
            paint.setShader(null);
            paint.setStyle(Style.STROKE);
            paint.setColor(-12303292);
            paint.setStrokeWidth((float) i);
            canvas.drawCircle((float) (width / 2), (float) (height / 2), f - ((float) (i / 2)), paint);
            return createBitmap2;
        } catch (OutOfMemoryError unused) {
            return null;
        }
    }

    /* renamed from: l */
    static void m23859l(Context context) {
        m23839a(Toast.makeText(context, R.string.confirm_exit, 0));
    }

    /* renamed from: m */
    static void m23860m(Context context) {
        if (f17841i) {
            ((Activity) context).finish();
        }
        Activity activity = (Activity) context;
        if (activity.findViewById(R.id.ad_pb) != null) {
            activity.findViewById(R.id.ad_pb).setVisibility(8);
        }
        m23865r(context);
    }

    /* renamed from: a */
    static String m23831a(String str, String str2) {
        if (str == null || str2 == null || str.equals("") || str2.equals("")) {
            return "";
        }
        if (VERSION.SDK_INT <= 20) {
            return "";
        }
        if (str2.equals("FFFFFFFF")) {
            StringBuilder sb = new StringBuilder();
            sb.append("#");
            sb.append(str);
            if (m23844a(sb.toString())) {
                return "FF000000";
            }
        }
        if (str2.equals("FF000000")) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("#");
            sb2.append(str);
            if (!m23844a(sb2.toString())) {
                return "FFFFFFFF";
            }
        }
        return str2;
    }

    /* renamed from: o */
    static boolean m23862o(Context context) {
        NetworkInfo networkInfo;
        try {
            networkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getNetworkInfo(1);
        } catch (Exception unused) {
            networkInfo = null;
        }
        if (networkInfo == null || !networkInfo.isConnected()) {
            return false;
        }
        return true;
    }

    /* renamed from: p */
    static boolean m23863p(Context context) {
        return ((TelephonyManager) context.getSystemService("phone")).getNetworkType() == 13;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo20769a(Context context, String str, int i) {
        Typeface typeface;
        if (i == 0) {
            typeface = Typeface.defaultFromStyle(0);
        } else if (i == 1) {
            try {
                typeface = Typeface.createFromFile(new File(getFilesDir(), "font"));
            } catch (Exception unused) {
                typeface = Typeface.defaultFromStyle(0);
            }
        } else {
            String b = mo20779b(i);
            if (b.equals("")) {
                typeface = Typeface.defaultFromStyle(0);
            } else {
                AssetManager assets = context.getAssets();
                StringBuilder sb = new StringBuilder();
                sb.append("fonts/");
                sb.append(b);
                typeface = Typeface.createFromAsset(assets, sb.toString());
            }
        }
        mo20772a(str, typeface);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo20772a(String str, Typeface typeface) {
        try {
            Field declaredField = Typeface.class.getDeclaredField(str);
            declaredField.setAccessible(true);
            declaredField.set(null, typeface);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e2) {
            e2.printStackTrace();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo20783c(int i) {
        if (f17837eo == null) {
            f17837eo = Typeface.create(Typeface.MONOSPACE, 0);
            f17836en = Typeface.create(Typeface.SERIF, 0);
            f17835em = Typeface.create(Typeface.SANS_SERIF, 0);
        }
        mo20769a((Context) this, "DEFAULT", i);
        mo20769a((Context) this, "MONOSPACE", i);
        mo20769a((Context) this, "SERIF", i);
        mo20769a((Context) this, "SANS_SERIF", i);
    }

    /* renamed from: a */
    static void m23839a(Toast toast) {
        try {
            ((TextView) ((ViewGroup) toast.getView()).getChildAt(0)).setTypeface(Typeface.MONOSPACE);
        } catch (Exception unused) {
        }
        toast.show();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public Intent mo20784d(String str) {
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String lowerCase = str.toLowerCase();
        String str9 = "";
        int lastIndexOf = str.lastIndexOf(".");
        if (lastIndexOf != -1) {
            str9 = lowerCase.substring(lastIndexOf);
        }
        str9.replace(".", "");
        if (lowerCase.startsWith("tel:") || lowerCase.startsWith("http://tel:")) {
            if (lowerCase.startsWith("tel:")) {
                str2 = str.substring(4);
            } else {
                str2 = str.substring(11);
            }
            if (str2.endsWith("/")) {
                str2 = str2.substring(0, str2.length() - 1);
            }
            StringBuilder sb = new StringBuilder();
            sb.append("tel:");
            sb.append(str2);
            return new Intent("android.intent.action.DIAL", Uri.parse(sb.toString()));
        } else if (lowerCase.startsWith("mailto:") || lowerCase.startsWith("http://mailto:")) {
            String str10 = "";
            String str11 = "";
            if (lowerCase.startsWith("mailto:")) {
                str3 = str.substring(7).trim();
            } else {
                str3 = str.substring(14).trim();
            }
            if (!str3.equals("")) {
                int indexOf = str3.indexOf("?");
                if (indexOf > 0) {
                    int indexOf2 = str3.indexOf("?subject=");
                    if (indexOf2 != -1) {
                        str10 = str3.substring(indexOf2 + 9).trim();
                        int indexOf3 = str10.indexOf("&body=");
                        if (indexOf3 != -1) {
                            String trim = str10.substring(indexOf3 + 6).trim();
                            str10 = str10.substring(0, indexOf3).trim();
                            str11 = trim;
                        }
                    }
                    str3 = str3.substring(0, indexOf).trim();
                }
                if (str3.endsWith("/")) {
                    str3 = str3.substring(0, str3.length() - 1);
                }
                Intent intent = new Intent("android.intent.action.SENDTO", Uri.fromParts("mailto", str3, null));
                if (!str10.equals("")) {
                    try {
                        str5 = URLDecoder.decode(str10, C2793C.UTF8_NAME);
                    } catch (Exception unused) {
                        str5 = str10;
                    }
                    intent.putExtra("android.intent.extra.SUBJECT", str5);
                }
                if (!str11.equals("")) {
                    try {
                        str4 = URLDecoder.decode(str11, C2793C.UTF8_NAME);
                    } catch (Exception unused2) {
                        str4 = str11;
                    }
                    intent.putExtra("android.intent.extra.TEXT", str4);
                }
                return Intent.createChooser(intent, getResources().getString(R.string.enviar_email));
            }
            return new Intent("android.intent.action.SENDTO", Uri.parse(str));
        } else if (lowerCase.startsWith("smsto:") || lowerCase.startsWith("http://smsto:")) {
            String str12 = "";
            if (lowerCase.startsWith("smsto:")) {
                str6 = str.substring(6).trim();
            } else {
                str6 = str.substring(13).trim();
            }
            if (!str6.equals("")) {
                int indexOf4 = str6.indexOf("?");
                if (indexOf4 > 0) {
                    int indexOf5 = str6.indexOf("?body=");
                    if (indexOf5 != -1) {
                        str12 = str6.substring(indexOf5 + 6).trim();
                    }
                    str6 = str6.substring(0, indexOf4).trim();
                }
                if (str6.endsWith("/")) {
                    str6 = str6.substring(0, str6.length() - 1);
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("smsto:");
                sb2.append(str6);
                Intent intent2 = new Intent("android.intent.action.SENDTO", Uri.parse(sb2.toString()));
                if (!str12.equals("")) {
                    try {
                        str7 = URLDecoder.decode(str12, C2793C.UTF8_NAME);
                    } catch (Exception unused3) {
                        str7 = str12;
                    }
                    intent2.putExtra("sms_body", str7);
                }
                return intent2;
            }
            return new Intent("android.intent.action.SENDTO", Uri.parse(str));
        } else if (lowerCase.startsWith("vnd.youtube:")) {
            int indexOf6 = str.indexOf("?");
            if (indexOf6 > 0) {
                str8 = str.substring(12, indexOf6);
            } else {
                str8 = str.substring(12);
            }
            StringBuilder sb3 = new StringBuilder();
            sb3.append("http://www.youtube.com/watch?v=");
            sb3.append(str8);
            return new Intent("android.intent.action.VIEW", Uri.parse(sb3.toString()));
        } else if (lowerCase.endsWith(DefaultHlsExtractorFactory.MP3_FILE_EXTENSION)) {
            Intent intent3 = new Intent("android.intent.action.VIEW");
            intent3.setDataAndType(Uri.parse(str), "audio/*");
            return intent3;
        } else if (lowerCase.endsWith(".mp4") || lowerCase.endsWith(".3gp")) {
            Intent intent4 = new Intent("android.intent.action.VIEW");
            intent4.setDataAndType(Uri.parse(str), "video/*");
            return intent4;
        } else {
            return new Intent("android.intent.action.VIEW", Uri.parse(str));
        }
    }

    /* renamed from: a */
    static int m23825a(Context context, String str, String str2, Intent intent, int i, int i2, String str3, String str4) {
        if (str3.equals(null) || str3.equals("")) {
            str3 = "0";
        }
        if (str4.equals(null) || str4.equals("")) {
            str4 = "0";
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences("sh", 0);
        Editor edit = sharedPreferences.edit();
        int i3 = sharedPreferences.getInt("id_ultnotif", 0) + 1;
        intent.putExtra("idnotif_marcar", i3);
        edit.putInt("id_ultnotif", i3);
        edit.putBoolean("hatenidonotif", true);
        StringBuilder sb = new StringBuilder();
        sb.append("notif_");
        sb.append(i3);
        sb.append("_fcrea");
        edit.putLong(sb.toString(), System.currentTimeMillis());
        StringBuilder sb2 = new StringBuilder();
        sb2.append("notif_");
        sb2.append(i3);
        sb2.append("_title");
        edit.putString(sb2.toString(), str);
        StringBuilder sb3 = new StringBuilder();
        sb3.append("notif_");
        sb3.append(i3);
        sb3.append("_text");
        edit.putString(sb3.toString(), str2);
        StringBuilder sb4 = new StringBuilder();
        sb4.append("notif_");
        sb4.append(i3);
        sb4.append("_intent");
        edit.putString(sb4.toString(), intent.toUri(0));
        StringBuilder sb5 = new StringBuilder();
        sb5.append("notif_");
        sb5.append(i3);
        sb5.append("_numnotif");
        edit.putInt(sb5.toString(), i);
        StringBuilder sb6 = new StringBuilder();
        sb6.append("notif_");
        sb6.append(i3);
        sb6.append("_leida");
        edit.putBoolean(sb6.toString(), false);
        StringBuilder sb7 = new StringBuilder();
        sb7.append("notif_");
        sb7.append(i3);
        sb7.append("_tipo");
        edit.putInt(sb7.toString(), i2);
        StringBuilder sb8 = new StringBuilder();
        sb8.append("notif_");
        sb8.append(i3);
        sb8.append("_idusu1");
        edit.putString(sb8.toString(), str3);
        StringBuilder sb9 = new StringBuilder();
        sb9.append("notif_");
        sb9.append(i3);
        sb9.append("_idusu2");
        edit.putString(sb9.toString(), str4);
        if (i3 > 100) {
            StringBuilder sb10 = new StringBuilder();
            sb10.append("notif_");
            int i4 = i3 - 100;
            sb10.append(i4);
            sb10.append("_fcrea");
            edit.remove(sb10.toString());
            StringBuilder sb11 = new StringBuilder();
            sb11.append("notif_");
            sb11.append(i4);
            sb11.append("_title");
            edit.remove(sb11.toString());
            StringBuilder sb12 = new StringBuilder();
            sb12.append("notif_");
            sb12.append(i4);
            sb12.append("_text");
            edit.remove(sb12.toString());
            StringBuilder sb13 = new StringBuilder();
            sb13.append("notif_");
            sb13.append(i4);
            sb13.append("_intent");
            edit.remove(sb13.toString());
            StringBuilder sb14 = new StringBuilder();
            sb14.append("notif_");
            sb14.append(i4);
            sb14.append("_numnotif");
            edit.remove(sb14.toString());
            StringBuilder sb15 = new StringBuilder();
            sb15.append("notif_");
            sb15.append(i4);
            sb15.append("_leida");
            edit.remove(sb15.toString());
            StringBuilder sb16 = new StringBuilder();
            sb16.append("notif_");
            sb16.append(i4);
            sb16.append("_tipo");
            edit.remove(sb16.toString());
            StringBuilder sb17 = new StringBuilder();
            sb17.append("notif_");
            sb17.append(i4);
            sb17.append("_idusu1");
            edit.remove(sb17.toString());
            StringBuilder sb18 = new StringBuilder();
            sb18.append("notif_");
            sb18.append(i4);
            sb18.append("_idusu2");
            edit.remove(sb18.toString());
        }
        edit.commit();
        m23864q(context);
        return i3;
    }

    /* renamed from: q */
    static void m23864q(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("sh", 0);
        Editor edit = sharedPreferences.edit();
        int i = 0;
        int i2 = 0;
        for (int i3 = sharedPreferences.getInt("id_ultnotif", 0); i3 > 0; i3--) {
            StringBuilder sb = new StringBuilder();
            sb.append("notif_");
            sb.append(i3);
            sb.append("_leida");
            if (!sharedPreferences.getBoolean(sb.toString(), false)) {
                i++;
            }
            i2++;
            if (i2 > 99) {
                break;
            }
        }
        edit.putInt("notif_noleidas", i);
        edit.commit();
    }

    /* renamed from: r */
    static void m23865r(Context context) {
        int i;
        SharedPreferences sharedPreferences = context.getSharedPreferences("sh", 0);
        int i2 = sharedPreferences.getInt("ico_notif_ord", 0);
        int i3 = i2 == 1 ? R.id.ico_tv_1 : i2 == 2 ? R.id.ico_tv_2 : i2 == 3 ? R.id.ico_tv_3 : i2 == 4 ? R.id.ico_tv_4 : 0;
        if (i3 > 0) {
            try {
                TextView textView = (TextView) ((Activity) context).findViewById(i3);
                int i4 = sharedPreferences.getInt("notif_noleidas", 0);
                if (i4 > 99) {
                    i4 = 99;
                }
                if (i4 <= 0 || sharedPreferences.getInt("ico_notif_idsec", 0) != 0) {
                    textView.setVisibility(8);
                    return;
                }
                int b = m23845b(context, 3);
                if (i4 < 10) {
                    i = m23845b(context, 8);
                } else {
                    i = m23845b(context, 4);
                }
                textView.setPadding(i, b, i, b);
                StringBuilder sb = new StringBuilder();
                sb.append("");
                sb.append(i4);
                textView.setText(sb.toString());
                textView.setVisibility(0);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    static boolean m23843a(Context context, int i, String str, String str2) {
        if (str.equals(null) || str.equals("")) {
            str = "0";
        }
        if (str2.equals(null) || str2.equals("")) {
            str2 = "0";
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences("sh", 0);
        int i2 = 0;
        for (int i3 = sharedPreferences.getInt("id_ultnotif", 0); i3 > 0; i3--) {
            StringBuilder sb = new StringBuilder();
            sb.append("notif_");
            sb.append(i3);
            sb.append("_leida");
            if (!sharedPreferences.getBoolean(sb.toString(), false)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("notif_");
                sb2.append(i3);
                sb2.append("_tipo");
                if (sharedPreferences.getInt(sb2.toString(), 0) == i) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("notif_");
                    sb3.append(i3);
                    sb3.append("_idusu1");
                    if (sharedPreferences.getString(sb3.toString(), "").equals(str)) {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("notif_");
                        sb4.append(i3);
                        sb4.append("_idusu2");
                        if (sharedPreferences.getString(sb4.toString(), "").equals(str2)) {
                            return true;
                        }
                    }
                }
            }
            i2++;
            if (i2 > 99) {
                return false;
            }
        }
        return false;
    }

    /* renamed from: s */
    static void m23866s(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("sh", 0);
        Editor edit = sharedPreferences.edit();
        int i = 0;
        for (int i2 = sharedPreferences.getInt("id_ultnotif", 0); i2 > 0; i2--) {
            StringBuilder sb = new StringBuilder();
            sb.append("notif_");
            sb.append(i2);
            sb.append("_fcrea");
            edit.remove(sb.toString());
            StringBuilder sb2 = new StringBuilder();
            sb2.append("notif_");
            sb2.append(i2);
            sb2.append("_title");
            edit.remove(sb2.toString());
            StringBuilder sb3 = new StringBuilder();
            sb3.append("notif_");
            sb3.append(i2);
            sb3.append("_text");
            edit.remove(sb3.toString());
            StringBuilder sb4 = new StringBuilder();
            sb4.append("notif_");
            sb4.append(i2);
            sb4.append("_intent");
            edit.remove(sb4.toString());
            StringBuilder sb5 = new StringBuilder();
            sb5.append("notif_");
            sb5.append(i2);
            sb5.append("_numnotif");
            edit.remove(sb5.toString());
            StringBuilder sb6 = new StringBuilder();
            sb6.append("notif_");
            sb6.append(i2);
            sb6.append("_leida");
            edit.remove(sb6.toString());
            StringBuilder sb7 = new StringBuilder();
            sb7.append("notif_");
            sb7.append(i2);
            sb7.append("_tipo");
            edit.remove(sb7.toString());
            StringBuilder sb8 = new StringBuilder();
            sb8.append("notif_");
            sb8.append(i2);
            sb8.append("_idusu1");
            edit.remove(sb8.toString());
            StringBuilder sb9 = new StringBuilder();
            sb9.append("notif_");
            sb9.append(i2);
            sb9.append("_idusu2");
            edit.remove(sb9.toString());
            i++;
            if (i > 99) {
                break;
            }
        }
        edit.putInt("id_ultnotif", 0);
        edit.putInt("notif_noleidas", 0);
        edit.commit();
        m23864q(context);
    }

    /* renamed from: b */
    static int m23845b(Context context, int i) {
        return (int) (((double) (((float) i) * context.getResources().getDisplayMetrics().density)) + 0.5d);
    }

    /* renamed from: a */
    static float m23822a(Context context, float f) {
        return f / (((float) context.getResources().getDisplayMetrics().densityDpi) / 160.0f);
    }

    /* renamed from: e */
    static String m23855e(String str) {
        return Normalizer.normalize(str, Form.NFD).replaceAll("[\\p{InCombiningDiacriticalMarks}]", "");
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0098, code lost:
        if ((java.lang.System.currentTimeMillis() - r0.longValue()) > ((long) ((((r2 * 24) * 60) * 60) * com.facebook.ads.AdError.NETWORK_ERROR_CODE))) goto L_0x0058;
     */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x009d A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x009e  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo20774a(android.content.Context r16, android.view.View r17, java.lang.String r18, android.app.ProgressDialog r19, com.google.android.gms.ads.reward.C3166b r20, com.appnext.ads.fullscreen.RewardedVideo r21, com.facebook.ads.RewardedVideoAd r22, com.startapp.android.publish.adsCommon.StartAppAd r23) {
        /*
            r15 = this;
            r8 = r15
            r9 = r18
            java.lang.String r0 = "sh"
            r1 = 0
            android.content.SharedPreferences r0 = r8.getSharedPreferences(r0, r1)
            java.lang.String r2 = r8.f17986cO
            r10 = 1
            if (r2 == 0) goto L_0x0019
            java.lang.String r2 = r8.f17986cO
            java.lang.String r3 = ""
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0044
        L_0x0019:
            java.lang.String r2 = r8.f17985cN
            if (r2 == 0) goto L_0x0027
            java.lang.String r2 = r8.f17985cN
            java.lang.String r3 = ""
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0044
        L_0x0027:
            java.lang.String r2 = r8.f17988cQ
            if (r2 == 0) goto L_0x0035
            java.lang.String r2 = r8.f17988cQ
            java.lang.String r3 = ""
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0044
        L_0x0035:
            java.lang.String r2 = r8.f17989cR
            if (r2 == 0) goto L_0x005e
            java.lang.String r2 = r8.f17989cR
            java.lang.String r3 = ""
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0044
            goto L_0x005e
        L_0x0044:
            java.lang.String r2 = "fult_rew"
            r3 = 0
            long r5 = r0.getLong(r2, r3)
            java.lang.Long r0 = java.lang.Long.valueOf(r5)
            long r5 = r0.longValue()
            int r2 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r2 != 0) goto L_0x005a
        L_0x0058:
            r0 = r10
            goto L_0x009b
        L_0x005a:
            int r2 = r8.f17994cW
            if (r2 != 0) goto L_0x0060
        L_0x005e:
            r0 = r1
            goto L_0x009b
        L_0x0060:
            int r2 = r8.f17994cW
            if (r2 != r10) goto L_0x0065
            goto L_0x0058
        L_0x0065:
            r2 = 30
            int r3 = r8.f17994cW
            r4 = 2
            r5 = 3
            if (r3 != r4) goto L_0x006f
            r2 = r10
            goto L_0x0083
        L_0x006f:
            int r3 = r8.f17994cW
            if (r3 != r5) goto L_0x0075
            r2 = r5
            goto L_0x0083
        L_0x0075:
            int r3 = r8.f17994cW
            r4 = 4
            if (r3 != r4) goto L_0x007c
            r2 = 7
            goto L_0x0083
        L_0x007c:
            int r3 = r8.f17994cW
            r4 = 5
            if (r3 != r4) goto L_0x0083
            r2 = 15
        L_0x0083:
            long r3 = java.lang.System.currentTimeMillis()
            long r5 = r0.longValue()
            long r11 = r3 - r5
            int r2 = r2 * 24
            int r2 = r2 * 60
            int r2 = r2 * 60
            int r2 = r2 * 1000
            long r2 = (long) r2
            int r0 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x005e
            goto L_0x0058
        L_0x009b:
            if (r0 != 0) goto L_0x009e
            return r1
        L_0x009e:
            r0 = 2131230733(0x7f08000d, float:1.8077527E38)
            r2 = r17
            java.lang.Object r0 = r2.getTag(r0)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r2 = r0.intValue()
            int r3 = r8.f18079p
            int r3 = r3 + 10000
            r4 = -1
            if (r2 != r3) goto L_0x00d0
            int r0 = r8.f17855N
            if (r0 <= r10) goto L_0x00ca
            java.util.ArrayList<java.lang.Integer> r0 = r8.f17920bA
            int r2 = r8.f17855N
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            int r0 = r0.indexOf(r2)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x01c3
        L_0x00ca:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            goto L_0x01c3
        L_0x00d0:
            int r2 = r0.intValue()
            int r3 = r8.f18080q
            int r3 = r3 + 10000
            if (r2 != r3) goto L_0x00f6
            int r0 = r8.f17859R
            if (r0 <= r10) goto L_0x00f0
            java.util.ArrayList<java.lang.Integer> r0 = r8.f17920bA
            int r2 = r8.f17859R
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            int r0 = r0.indexOf(r2)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x01c3
        L_0x00f0:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            goto L_0x01c3
        L_0x00f6:
            int r2 = r0.intValue()
            int r3 = r8.f18083t
            int r3 = r3 + 10000
            if (r2 != r3) goto L_0x011c
            int r0 = r8.f17897ad
            if (r0 <= r10) goto L_0x0116
            java.util.ArrayList<java.lang.Integer> r0 = r8.f17920bA
            int r2 = r8.f17897ad
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            int r0 = r0.indexOf(r2)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x01c3
        L_0x0116:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            goto L_0x01c3
        L_0x011c:
            int r2 = r0.intValue()
            int r3 = r8.f18084u
            int r3 = r3 + 10000
            if (r2 != r3) goto L_0x0142
            int r0 = r8.f17901ah
            if (r0 <= r10) goto L_0x013c
            java.util.ArrayList<java.lang.Integer> r0 = r8.f17920bA
            int r2 = r8.f17901ah
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            int r0 = r0.indexOf(r2)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x01c3
        L_0x013c:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            goto L_0x01c3
        L_0x0142:
            int r2 = r0.intValue()
            int r3 = r8.f18082s
            int r3 = r3 + 10000
            if (r2 != r3) goto L_0x0171
            int r0 = r8.f17867Z
            if (r0 <= r10) goto L_0x0161
            java.util.ArrayList<java.lang.Integer> r0 = r8.f17920bA
            int r2 = r8.f17867Z
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            int r0 = r0.indexOf(r2)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x01c3
        L_0x0161:
            int r0 = r8.f17867Z
            if (r0 != 0) goto L_0x016c
            int r0 = r8.f17844C
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x01c3
        L_0x016c:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            goto L_0x01c3
        L_0x0171:
            int r2 = r0.intValue()
            int r3 = r8.f18081r
            int r3 = r3 + 10000
            if (r2 != r3) goto L_0x01a0
            int r0 = r8.f17863V
            if (r0 <= r10) goto L_0x0190
            java.util.ArrayList<java.lang.Integer> r0 = r8.f17920bA
            int r2 = r8.f17863V
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            int r0 = r0.indexOf(r2)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x01c3
        L_0x0190:
            int r0 = r8.f17863V
            if (r0 != 0) goto L_0x019b
            int r0 = r8.f17843B
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x01c3
        L_0x019b:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            goto L_0x01c3
        L_0x01a0:
            int r2 = r0.intValue()
            int r3 = r8.f18085v
            int r3 = r3 + 10000
            if (r2 != r3) goto L_0x01c3
            int r0 = r8.f17905al
            if (r0 <= r10) goto L_0x01bf
            java.util.ArrayList<java.lang.Integer> r0 = r8.f17920bA
            int r2 = r8.f17905al
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            int r0 = r0.indexOf(r2)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x01c3
        L_0x01bf:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
        L_0x01c3:
            int r2 = r0.intValue()
            if (r2 < 0) goto L_0x0247
            int r2 = r0.intValue()
            mega.boicot.i[] r3 = r8.f17971bz
            int r3 = r3.length
            if (r2 >= r3) goto L_0x0247
            mega.boicot.i[] r2 = r8.f17971bz
            int r0 = r0.intValue()
            r0 = r2[r0]
            boolean r0 = r0.f18235F
            if (r0 == 0) goto L_0x0247
            android.content.res.Resources r0 = r8.getResources()
            r1 = 2131558706(0x7f0d0132, float:1.8742735E38)
            java.lang.String r0 = r0.getString(r1)
            java.lang.String r1 = r8.f17987cP
            java.lang.String r2 = ""
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x01f5
            java.lang.String r0 = r8.f17987cP
        L_0x01f5:
            r11 = r0
            android.app.AlertDialog$Builder r0 = new android.app.AlertDialog$Builder
            r4 = r16
            r0.<init>(r4)
            r1 = 2131558471(0x7f0d0047, float:1.8742259E38)
            r2 = 0
            android.app.AlertDialog$Builder r12 = r0.setNegativeButton(r1, r2)
            r13 = 2131558439(0x7f0d0027, float:1.8742194E38)
            mega.boicot.config$9 r14 = new mega.boicot.config$9
            r0 = r14
            r1 = r8
            r2 = r19
            r3 = r21
            r5 = r20
            r6 = r22
            r7 = r23
            r0.<init>(r2, r3, r4, r5, r6, r7)
            android.app.AlertDialog$Builder r0 = r12.setPositiveButton(r13, r14)
            android.app.AlertDialog$Builder r0 = r0.setMessage(r11)
            android.app.AlertDialog r0 = r0.create()
            java.lang.String r1 = ""
            boolean r1 = r9.equals(r1)
            if (r1 != 0) goto L_0x0235
            mega.boicot.config$10 r1 = new mega.boicot.config$10
            r1.<init>(r0, r9)
            r0.setOnShowListener(r1)
        L_0x0235:
            r0.show()
            r1 = 16908299(0x102000b, float:2.387726E-38)
            android.view.View r0 = r0.findViewById(r1)     // Catch:{ Exception -> 0x0246 }
            android.widget.TextView r0 = (android.widget.TextView) r0     // Catch:{ Exception -> 0x0246 }
            android.graphics.Typeface r1 = android.graphics.Typeface.MONOSPACE     // Catch:{ Exception -> 0x0246 }
            r0.setTypeface(r1)     // Catch:{ Exception -> 0x0246 }
        L_0x0246:
            return r10
        L_0x0247:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: mega.boicot.config.mo20774a(android.content.Context, android.view.View, java.lang.String, android.app.ProgressDialog, com.google.android.gms.ads.reward.b, com.appnext.ads.fullscreen.RewardedVideo, com.facebook.ads.RewardedVideoAd, com.startapp.android.publish.adsCommon.StartAppAd):boolean");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo20775a(Context context, RewardedVideo rewardedVideo) {
        if (rewardedVideo != null) {
            try {
                rewardedVideo.setOnAdLoadedCallback((OnAdLoaded) context);
                rewardedVideo.setOnAdClosedCallback((OnAdClosed) context);
                rewardedVideo.setOnAdErrorCallback((OnAdError) context);
                rewardedVideo.setOnVideoEndedCallback((OnVideoEnded) context);
                rewardedVideo.loadAd();
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    @TargetApi(11)
    /* renamed from: a */
    public void mo20773a(String str, String str2, String str3, Context context) {
        String str4;
        if (!str.equals("")) {
            if (!m23853d() || getPackageManager().checkPermission("android.permission.WRITE_EXTERNAL_STORAGE", getPackageName()) == 0) {
                String lowerCase = str.toLowerCase(Locale.getDefault());
                try {
                    Request request = new Request(Uri.parse(str));
                    if (VERSION.SDK_INT > 10) {
                        request.allowScanningByMediaScanner();
                        request.setNotificationVisibility(1);
                    }
                    if (str2 == null || str2.equals("")) {
                        if (lowerCase.endsWith(DefaultHlsExtractorFactory.MP3_FILE_EXTENSION)) {
                            str2 = MimeTypes.AUDIO_MPEG;
                        } else if (lowerCase.endsWith(".mp4")) {
                            str2 = MimeTypes.VIDEO_MP4;
                        } else if (lowerCase.endsWith(".apk")) {
                            str2 = "application/vnd.android.package-archive";
                        }
                    }
                    if (str2 != null && !str2.equals("")) {
                        try {
                            request.setMimeType(str2);
                        } catch (Exception unused) {
                        }
                    }
                    if (str3.equals("") && (lowerCase.endsWith(DefaultHlsExtractorFactory.MP3_FILE_EXTENSION) || lowerCase.endsWith(".mp4") || lowerCase.endsWith(".apk"))) {
                        try {
                            str4 = str.substring(str.lastIndexOf(47) + 1);
                        } catch (Exception unused2) {
                        }
                        if (!str4.equals("") && m23853d()) {
                            request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, str4);
                        }
                        ((DownloadManager) getSystemService("download")).enqueue(request);
                        Toast.makeText(getApplicationContext(), getResources().getString(R.string.downloading), 1).show();
                    }
                    str4 = str3;
                    try {
                        request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, str4);
                    } catch (Exception unused3) {
                    }
                    try {
                        ((DownloadManager) getSystemService("download")).enqueue(request);
                        Toast.makeText(getApplicationContext(), getResources().getString(R.string.downloading), 1).show();
                    } catch (Exception unused4) {
                    }
                } catch (Exception unused5) {
                }
            } else {
                Editor edit = getSharedPreferences("sh", 0).edit();
                edit.putString("descarga_url", str);
                edit.putString("descarga_mimetype", str2);
                edit.putString("descarga_nombre", str3);
                edit.commit();
                C0236a.m717a((Activity) context, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 102);
            }
        }
    }

    /* renamed from: t */
    static void m23867t(Context context) {
        Editor edit = context.getSharedPreferences("sh", 0).edit();
        edit.putLong("fult_rew", System.currentTimeMillis());
        edit.putInt("n_imp", 0);
        edit.putInt("n_imp_chat", 0);
        edit.commit();
        f17829dh = 0;
        f17830di = 0;
    }

    /* renamed from: a */
    public static Bitmap m23829a(Bitmap bitmap, Bitmap bitmap2) {
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, null);
        canvas.drawBitmap(bitmap2, (float) ((bitmap.getWidth() - bitmap2.getWidth()) / 2), (float) ((bitmap.getHeight() - bitmap2.getHeight()) / 2), null);
        return createBitmap;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo20767a(Context context, int i, final String str, Bundle bundle) {
        if (i != -1 && bundle == null) {
            SharedPreferences sharedPreferences = getSharedPreferences("sh", 0);
            C5663i iVar = this.f17971bz[i];
            if (!iVar.f18320m.equals("")) {
                StringBuilder sb = new StringBuilder();
                sb.append("popup_nomas_");
                sb.append(iVar.f18330w);
                if (!sharedPreferences.getBoolean(sb.toString(), false)) {
                    Builder builder = new Builder(context);
                    if (!iVar.f18319l.equals("")) {
                        builder.setTitle(iVar.f18319l);
                    }
                    if (iVar.f18321n) {
                        View inflate = ((Activity) context).getLayoutInflater().inflate(R.layout.bienvenida, null);
                        TextView textView = (TextView) inflate.findViewById(R.id.message);
                        textView.setMovementMethod(new ScrollingMovementMethod());
                        textView.setText(Html.fromHtml(iVar.f18320m));
                        CheckBox checkBox = (CheckBox) inflate.findViewById(R.id.skip);
                        if (!str.equals("")) {
                            m23836a(checkBox, str);
                        }
                        checkBox.setChecked(iVar.f18322o);
                        checkBox.setTag(Integer.valueOf(i));
                        builder.setView(inflate);
                    } else {
                        builder.setMessage(Html.fromHtml(iVar.f18320m));
                    }
                    builder.setCancelable(false);
                    if (iVar.f18321n) {
                        builder.setPositiveButton(getString(R.string.aceptar), new OnClickListener() {
                            public void onClick(DialogInterface dialogInterface, int i) {
                                CheckBox checkBox = (CheckBox) ((AlertDialog) dialogInterface).findViewById(R.id.skip);
                                if (checkBox.isChecked()) {
                                    Editor edit = config.this.getSharedPreferences("sh", 0).edit();
                                    StringBuilder sb = new StringBuilder();
                                    sb.append("popup_nomas_");
                                    sb.append(config.this.f17971bz[((Integer) checkBox.getTag()).intValue()].f18330w);
                                    edit.putBoolean(sb.toString(), true);
                                    edit.commit();
                                }
                            }
                        });
                    } else {
                        builder.setPositiveButton(getString(R.string.aceptar), null);
                    }
                    final AlertDialog create = builder.create();
                    if (!str.equals("")) {
                        create.setOnShowListener(new OnShowListener() {
                            public void onShow(DialogInterface dialogInterface) {
                                Button button = create.getButton(-1);
                                StringBuilder sb = new StringBuilder();
                                sb.append("#");
                                sb.append(str);
                                button.setTextColor(Color.parseColor(sb.toString()));
                            }
                        });
                    }
                    try {
                        create.show();
                        if (!iVar.f18321n) {
                            ((TextView) create.findViewById(16908299)).setTypeface(Typeface.MONOSPACE);
                        }
                    } catch (Exception unused) {
                    }
                }
            }
        }
    }

    /* renamed from: a */
    static void m23841a(String str, Context context) {
        if (str != null) {
            String str2 = "image/*";
            String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(str);
            if (fileExtensionFromUrl != null) {
                str2 = MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtensionFromUrl);
            }
            String str3 = str2;
            String str4 = "";
            try {
                str4 = URLUtil.guessFileName(str, null, str3);
            } catch (Exception unused) {
            }
            if (!str4.equals("")) {
                if (str4.indexOf(".") != -1) {
                    String substring = str4.substring(str4.lastIndexOf("."));
                    Random random = new Random();
                    StringBuilder sb = new StringBuilder();
                    sb.append("img");
                    sb.append(random.nextInt(9000) + AdError.NETWORK_ERROR_CODE);
                    sb.append(substring);
                    str4 = sb.toString();
                }
                String str5 = str4;
                try {
                    File file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS), str5);
                    m23840a(new File(str.replace("file://", "")), file);
                    ((DownloadManager) context.getSystemService("download")).addCompletedDownload(str5, str5, true, str3, file.getAbsolutePath(), file.length(), true);
                } catch (Exception unused2) {
                }
            }
        }
    }

    @TargetApi(26)
    /* renamed from: c */
    public static NotificationChannel m23850c(Context context, int i) {
        if (VERSION.SDK_INT < 26) {
            return null;
        }
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        StringBuilder sb = new StringBuilder();
        sb.append("channel_");
        sb.append(i);
        String sb2 = sb.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append("channel ");
        sb3.append(i);
        NotificationChannel notificationChannel = new NotificationChannel(sb2, sb3.toString(), 3);
        if (i == 0) {
            notificationChannel.setSound(null, null);
        }
        notificationManager.createNotificationChannel(notificationChannel);
        return notificationChannel;
    }

    /* renamed from: a */
    public static String m23830a(Uri uri, Context context) {
        String b = VERSION.SDK_INT >= 19 ? m23847b(uri, context) : null;
        if (b != null) {
            return b;
        }
        Cursor query = context.getContentResolver().query(uri, new String[]{"_data"}, null, null, null);
        if (query != null) {
            if (query.moveToFirst()) {
                b = query.getString(query.getColumnIndexOrThrow("_data"));
            }
            query.close();
        }
        if (b == null) {
            b = uri.getPath();
        }
        return b;
    }

    @TargetApi(19)
    /* renamed from: b */
    private static String m23847b(Uri uri, Context context) {
        String str = null;
        if (DocumentsContract.isDocumentUri(context, uri)) {
            String str2 = DocumentsContract.getDocumentId(uri).split(":")[1];
            String[] strArr = {"_data"};
            String[] strArr2 = strArr;
            Cursor query = context.getContentResolver().query(Media.EXTERNAL_CONTENT_URI, strArr2, "_id=?", new String[]{str2}, null);
            int columnIndex = query.getColumnIndex(strArr[0]);
            if (query.moveToFirst()) {
                str = query.getString(columnIndex);
            }
            query.close();
        }
        return str;
    }

    /* renamed from: u */
    public static boolean m23868u(Context context) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), MpegAudioHeader.MAX_FRAME_SIZE_BYTES);
            String[] strArr = null;
            if (packageInfo != null) {
                strArr = packageInfo.requestedPermissions;
            }
            if (strArr != null && strArr.length > 0) {
                List asList = Arrays.asList(strArr);
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(asList);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (((String) it.next()).contains("ACCESS_FINE_LOCATION")) {
                        return true;
                    }
                }
            }
        } catch (NameNotFoundException e) {
            e.printStackTrace();
        }
        return false;
    }
}
