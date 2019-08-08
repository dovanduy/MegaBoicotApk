package mega.boicot;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.app.ProgressDialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnShowListener;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.pm.ResolveInfo;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.Color;
import android.graphics.Typeface;
import android.media.ThumbnailUtils;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.AsyncTask.Status;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.provider.MediaStore.Images.Media;
import android.support.p017v4.content.FileProvider;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import com.appnext.ads.fullscreen.RewardedVideo;
import com.appnext.base.p046b.C1248f;
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
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import mega.boicot.t_chat.C6162e;
import org.apache.p199a.C6527i;
import org.apache.p199a.p202b.p204b.C6274e;
import org.apache.p199a.p202b.p204b.C6276g;
import org.apache.p199a.p215e.p216a.C6367d;
import org.apache.p199a.p215e.p216a.C6370g;
import org.apache.p199a.p215e.p216a.p217a.C6359b;
import org.apache.p199a.p215e.p216a.p217a.C6360c;
import org.apache.p199a.p215e.p216a.p217a.C6362e;
import org.apache.p199a.p215e.p216a.p217a.C6363f;
import org.apache.p199a.p218f.p220b.C6409h;
import org.apache.p199a.p227i.C6529b;
import org.apache.p199a.p227i.C6530c;
import org.apache.p199a.p227i.C6531d;
import org.apache.p199a.p229k.C6551d;

public class profile extends Activity implements OnClickListener, OnAdClosed, OnAdError, OnAdLoaded, OnVideoEnded, RewardedVideoAdListener, C3167c, VideoListener, AdEventListener, C5599a {

    /* renamed from: A */
    ImageView f19995A;

    /* renamed from: B */
    ImageView f19996B;

    /* renamed from: C */
    ImageView f19997C;

    /* renamed from: D */
    ImageView f19998D;

    /* renamed from: E */
    ImageView f19999E;

    /* renamed from: F */
    ImageView f20000F;

    /* renamed from: G */
    ProgressBar f20001G;

    /* renamed from: H */
    ProgressBar f20002H;

    /* renamed from: I */
    ProgressBar f20003I;

    /* renamed from: J */
    ProgressBar f20004J;

    /* renamed from: K */
    ProgressBar f20005K;

    /* renamed from: L */
    ProgressBar f20006L;

    /* renamed from: M */
    ProgressBar f20007M;

    /* renamed from: N */
    ProgressBar f20008N;

    /* renamed from: O */
    ProgressBar f20009O;

    /* renamed from: P */
    TextView f20010P;

    /* renamed from: Q */
    LinearLayout f20011Q;

    /* renamed from: R */
    LinearLayout f20012R;

    /* renamed from: S */
    LinearLayout f20013S;

    /* renamed from: T */
    LinearLayout f20014T;

    /* renamed from: U */
    LinearLayout f20015U;

    /* renamed from: V */
    LinearLayout f20016V;

    /* renamed from: W */
    LinearLayout f20017W;

    /* renamed from: X */
    LinearLayout f20018X;

    /* renamed from: Y */
    LinearLayout f20019Y;

    /* renamed from: Z */
    TextView f20020Z;

    /* renamed from: a */
    long f20021a;

    /* renamed from: aA */
    boolean f20022aA = false;

    /* renamed from: aB */
    boolean f20023aB = false;

    /* renamed from: aC */
    View f20024aC;

    /* renamed from: aD */
    ProgressDialog f20025aD;

    /* renamed from: aE */
    AlertDialog f20026aE;

    /* renamed from: aF */
    C6068h f20027aF;

    /* renamed from: aG */
    Builder f20028aG;

    /* renamed from: aH */
    View f20029aH;

    /* renamed from: aI */
    ListView f20030aI;

    /* renamed from: aJ */
    SharedPreferences f20031aJ;
    /* access modifiers changed from: private */

    /* renamed from: aK */
    public ArrayList<C6029o> f20032aK = new ArrayList<>();
    /* access modifiers changed from: private */

    /* renamed from: aL */
    public C6021n f20033aL;

    /* renamed from: aa */
    TextView f20034aa;

    /* renamed from: ab */
    TextView f20035ab;

    /* renamed from: ac */
    TextView f20036ac;

    /* renamed from: ad */
    TextView f20037ad;

    /* renamed from: ae */
    TextView f20038ae;

    /* renamed from: af */
    TextView f20039af;

    /* renamed from: ag */
    TextView f20040ag;

    /* renamed from: ah */
    boolean f20041ah = false;

    /* renamed from: ai */
    boolean f20042ai = false;

    /* renamed from: aj */
    boolean f20043aj;

    /* renamed from: ak */
    boolean f20044ak;

    /* renamed from: al */
    boolean f20045al;

    /* renamed from: am */
    boolean f20046am;

    /* renamed from: an */
    boolean f20047an = false;

    /* renamed from: ao */
    C5602c f20048ao;

    /* renamed from: ap */
    Bundle f20049ap;

    /* renamed from: aq */
    Bitmap f20050aq;

    /* renamed from: ar */
    C6067g f20051ar;

    /* renamed from: as */
    C6066f f20052as;

    /* renamed from: at */
    C6070j f20053at;

    /* renamed from: au */
    C6084r f20054au;

    /* renamed from: av */
    C6073m f20055av;

    /* renamed from: aw */
    C3166b f20056aw;

    /* renamed from: ax */
    RewardedVideo f20057ax;

    /* renamed from: ay */
    RewardedVideoAd f20058ay;

    /* renamed from: az */
    StartAppAd f20059az;

    /* renamed from: b */
    int f20060b;

    /* renamed from: c */
    int f20061c;

    /* renamed from: d */
    int f20062d;

    /* renamed from: e */
    int f20063e;

    /* renamed from: f */
    int f20064f;

    /* renamed from: g */
    int f20065g = -1;

    /* renamed from: h */
    int f20066h = 0;

    /* renamed from: i */
    int f20067i = 0;

    /* renamed from: j */
    int f20068j = 0;

    /* renamed from: k */
    String f20069k;

    /* renamed from: l */
    String f20070l;

    /* renamed from: m */
    String f20071m;

    /* renamed from: n */
    String f20072n;

    /* renamed from: o */
    String f20073o;

    /* renamed from: p */
    String f20074p;

    /* renamed from: q */
    String f20075q;

    /* renamed from: r */
    String f20076r;

    /* renamed from: s */
    ArrayList<C6061a> f20077s = new ArrayList<>();

    /* renamed from: t */
    ArrayList<C6062b> f20078t = new ArrayList<>();

    /* renamed from: u */
    config f20079u;

    /* renamed from: v */
    File f20080v;

    /* renamed from: w */
    ImageView f20081w;

    /* renamed from: x */
    ImageView f20082x;

    /* renamed from: y */
    ImageView f20083y;

    /* renamed from: z */
    ImageView f20084z;

    /* renamed from: mega.boicot.profile$a */
    private class C6061a {

        /* renamed from: a */
        public String f20116a;

        /* renamed from: b */
        public String f20117b;

        /* renamed from: c */
        public String f20118c;

        /* renamed from: d */
        public String f20119d;

        /* renamed from: e */
        public boolean f20120e;

        private C6061a() {
            this.f20120e = false;
        }
    }

    /* renamed from: mega.boicot.profile$b */
    private class C6062b {

        /* renamed from: a */
        public String f20122a;

        /* renamed from: b */
        public String f20123b;

        /* renamed from: c */
        public String f20124c;

        /* renamed from: d */
        public String f20125d;

        /* renamed from: e */
        public String f20126e;

        /* renamed from: f */
        public boolean f20127f;

        private C6062b() {
            this.f20127f = false;
        }
    }

    /* renamed from: mega.boicot.profile$c */
    private class C6063c extends AsyncTask<String, Void, Byte> {

        /* renamed from: a */
        String f20129a;

        C6063c(Boolean bool) {
            this.f20129a = bool.booleanValue() ? "1" : "0";
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x00a8  */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x00ae  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Byte doInBackground(java.lang.String... r7) {
            /*
                r6 = this;
                r7 = 0
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00a1 }
                r0.<init>()     // Catch:{ Exception -> 0x00a1 }
                java.lang.String r1 = "http://"
                r0.append(r1)     // Catch:{ Exception -> 0x00a1 }
                java.lang.String r1 = mega.boicot.config.f17839g     // Catch:{ Exception -> 0x00a1 }
                r0.append(r1)     // Catch:{ Exception -> 0x00a1 }
                java.lang.String r1 = "/srv/favorito_usu.php?idusu="
                r0.append(r1)     // Catch:{ Exception -> 0x00a1 }
                mega.boicot.profile r1 = mega.boicot.profile.this     // Catch:{ Exception -> 0x00a1 }
                int r1 = r1.f20060b     // Catch:{ Exception -> 0x00a1 }
                r0.append(r1)     // Catch:{ Exception -> 0x00a1 }
                java.lang.String r1 = "&c="
                r0.append(r1)     // Catch:{ Exception -> 0x00a1 }
                mega.boicot.profile r1 = mega.boicot.profile.this     // Catch:{ Exception -> 0x00a1 }
                java.lang.String r1 = r1.f20069k     // Catch:{ Exception -> 0x00a1 }
                r0.append(r1)     // Catch:{ Exception -> 0x00a1 }
                java.lang.String r1 = "&idusu_pro="
                r0.append(r1)     // Catch:{ Exception -> 0x00a1 }
                mega.boicot.profile r1 = mega.boicot.profile.this     // Catch:{ Exception -> 0x00a1 }
                java.lang.String r1 = r1.f20070l     // Catch:{ Exception -> 0x00a1 }
                r0.append(r1)     // Catch:{ Exception -> 0x00a1 }
                java.lang.String r1 = "&modo="
                r0.append(r1)     // Catch:{ Exception -> 0x00a1 }
                java.lang.String r1 = r6.f20129a     // Catch:{ Exception -> 0x00a1 }
                r0.append(r1)     // Catch:{ Exception -> 0x00a1 }
                java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x00a1 }
                java.net.URL r1 = new java.net.URL     // Catch:{ Exception -> 0x00a1 }
                r1.<init>(r0)     // Catch:{ Exception -> 0x00a1 }
                java.net.URLConnection r0 = r1.openConnection()     // Catch:{ Exception -> 0x00a1 }
                java.net.HttpURLConnection r0 = (java.net.HttpURLConnection) r0     // Catch:{ Exception -> 0x00a1 }
                r7 = 1
                r0.setDoInput(r7)     // Catch:{ Exception -> 0x009d, all -> 0x0098 }
                r1 = 10000(0x2710, float:1.4013E-41)
                r0.setConnectTimeout(r1)     // Catch:{ Exception -> 0x009d, all -> 0x0098 }
                r0.setReadTimeout(r1)     // Catch:{ Exception -> 0x009d, all -> 0x0098 }
                java.lang.String r1 = "User-Agent"
                java.lang.String r2 = "Android Vinebre Software"
                r0.setRequestProperty(r1, r2)     // Catch:{ Exception -> 0x009d, all -> 0x0098 }
                java.io.InputStream r1 = r0.getInputStream()     // Catch:{ Exception -> 0x009d, all -> 0x0098 }
                java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ Exception -> 0x009d, all -> 0x0098 }
                java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x009d, all -> 0x0098 }
                r3.<init>(r1)     // Catch:{ Exception -> 0x009d, all -> 0x0098 }
                r2.<init>(r3)     // Catch:{ Exception -> 0x009d, all -> 0x0098 }
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x009d, all -> 0x0098 }
                r1.<init>()     // Catch:{ Exception -> 0x009d, all -> 0x0098 }
            L_0x0073:
                java.lang.String r3 = r2.readLine()     // Catch:{ Exception -> 0x009d, all -> 0x0098 }
                if (r3 == 0) goto L_0x008e
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x009d, all -> 0x0098 }
                r4.<init>()     // Catch:{ Exception -> 0x009d, all -> 0x0098 }
                r4.append(r3)     // Catch:{ Exception -> 0x009d, all -> 0x0098 }
                java.lang.String r3 = "\n"
                r4.append(r3)     // Catch:{ Exception -> 0x009d, all -> 0x0098 }
                java.lang.String r3 = r4.toString()     // Catch:{ Exception -> 0x009d, all -> 0x0098 }
                r1.append(r3)     // Catch:{ Exception -> 0x009d, all -> 0x0098 }
                goto L_0x0073
            L_0x008e:
                java.lang.Byte r7 = java.lang.Byte.valueOf(r7)     // Catch:{ Exception -> 0x009d, all -> 0x0098 }
                if (r0 == 0) goto L_0x0097
                r0.disconnect()
            L_0x0097:
                return r7
            L_0x0098:
                r7 = move-exception
                r5 = r0
                r0 = r7
                r7 = r5
                goto L_0x00ac
            L_0x009d:
                r7 = r0
                goto L_0x00a1
            L_0x009f:
                r0 = move-exception
                goto L_0x00ac
            L_0x00a1:
                r0 = 2
                java.lang.Byte r0 = java.lang.Byte.valueOf(r0)     // Catch:{ all -> 0x009f }
                if (r7 == 0) goto L_0x00ab
                r7.disconnect()
            L_0x00ab:
                return r0
            L_0x00ac:
                if (r7 == 0) goto L_0x00b1
                r7.disconnect()
            L_0x00b1:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: mega.boicot.profile.C6063c.doInBackground(java.lang.String[]):java.lang.Byte");
        }
    }

    /* renamed from: mega.boicot.profile$d */
    private class C6064d extends AsyncTask<String, Void, String> {
        private C6064d() {
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
            profile.this.findViewById(R.id.fl_mascoments).setVisibility(8);
            if (profile.this.f20046am) {
                profile.this.findViewById(R.id.pb_mascoments_inv).setVisibility(0);
            } else {
                profile.this.findViewById(R.id.pb_mascoments).setVisibility(0);
            }
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x00a7  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.String doInBackground(java.lang.String... r6) {
            /*
                r5 = this;
                r6 = 0
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00a3 }
                r0.<init>()     // Catch:{ Exception -> 0x00a3 }
                java.lang.String r1 = "http://"
                r0.append(r1)     // Catch:{ Exception -> 0x00a3 }
                java.lang.String r1 = mega.boicot.config.f17839g     // Catch:{ Exception -> 0x00a3 }
                r0.append(r1)     // Catch:{ Exception -> 0x00a3 }
                java.lang.String r1 = "/srv/coments_profile.php?idusu="
                r0.append(r1)     // Catch:{ Exception -> 0x00a3 }
                mega.boicot.profile r1 = mega.boicot.profile.this     // Catch:{ Exception -> 0x00a3 }
                int r1 = r1.f20060b     // Catch:{ Exception -> 0x00a3 }
                r0.append(r1)     // Catch:{ Exception -> 0x00a3 }
                java.lang.String r1 = "&c="
                r0.append(r1)     // Catch:{ Exception -> 0x00a3 }
                mega.boicot.profile r1 = mega.boicot.profile.this     // Catch:{ Exception -> 0x00a3 }
                java.lang.String r1 = r1.f20069k     // Catch:{ Exception -> 0x00a3 }
                r0.append(r1)     // Catch:{ Exception -> 0x00a3 }
                java.lang.String r1 = "&idusu_pro="
                r0.append(r1)     // Catch:{ Exception -> 0x00a3 }
                mega.boicot.profile r1 = mega.boicot.profile.this     // Catch:{ Exception -> 0x00a3 }
                java.lang.String r1 = r1.f20070l     // Catch:{ Exception -> 0x00a3 }
                r0.append(r1)     // Catch:{ Exception -> 0x00a3 }
                java.lang.String r1 = "&idc="
                r0.append(r1)     // Catch:{ Exception -> 0x00a3 }
                mega.boicot.profile r1 = mega.boicot.profile.this     // Catch:{ Exception -> 0x00a3 }
                java.lang.String r1 = r1.f20072n     // Catch:{ Exception -> 0x00a3 }
                r0.append(r1)     // Catch:{ Exception -> 0x00a3 }
                java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x00a3 }
                java.net.URL r1 = new java.net.URL     // Catch:{ Exception -> 0x00a3 }
                r1.<init>(r0)     // Catch:{ Exception -> 0x00a3 }
                java.net.URLConnection r0 = r1.openConnection()     // Catch:{ Exception -> 0x00a3 }
                java.net.HttpURLConnection r0 = (java.net.HttpURLConnection) r0     // Catch:{ Exception -> 0x00a3 }
                r6 = 1
                r0.setDoInput(r6)     // Catch:{ Exception -> 0x009f, all -> 0x009a }
                r6 = 10000(0x2710, float:1.4013E-41)
                r0.setConnectTimeout(r6)     // Catch:{ Exception -> 0x009f, all -> 0x009a }
                r0.setReadTimeout(r6)     // Catch:{ Exception -> 0x009f, all -> 0x009a }
                java.lang.String r6 = "User-Agent"
                java.lang.String r1 = "Android Vinebre Software"
                r0.setRequestProperty(r6, r1)     // Catch:{ Exception -> 0x009f, all -> 0x009a }
                java.io.InputStream r6 = r0.getInputStream()     // Catch:{ Exception -> 0x009f, all -> 0x009a }
                java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch:{ Exception -> 0x009f, all -> 0x009a }
                java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x009f, all -> 0x009a }
                r2.<init>(r6)     // Catch:{ Exception -> 0x009f, all -> 0x009a }
                r1.<init>(r2)     // Catch:{ Exception -> 0x009f, all -> 0x009a }
                java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x009f, all -> 0x009a }
                r6.<init>()     // Catch:{ Exception -> 0x009f, all -> 0x009a }
            L_0x0075:
                java.lang.String r2 = r1.readLine()     // Catch:{ Exception -> 0x009f, all -> 0x009a }
                if (r2 == 0) goto L_0x0090
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x009f, all -> 0x009a }
                r3.<init>()     // Catch:{ Exception -> 0x009f, all -> 0x009a }
                r3.append(r2)     // Catch:{ Exception -> 0x009f, all -> 0x009a }
                java.lang.String r2 = "\n"
                r3.append(r2)     // Catch:{ Exception -> 0x009f, all -> 0x009a }
                java.lang.String r2 = r3.toString()     // Catch:{ Exception -> 0x009f, all -> 0x009a }
                r6.append(r2)     // Catch:{ Exception -> 0x009f, all -> 0x009a }
                goto L_0x0075
            L_0x0090:
                java.lang.String r6 = r6.toString()     // Catch:{ Exception -> 0x009f, all -> 0x009a }
                if (r0 == 0) goto L_0x0099
                r0.disconnect()
            L_0x0099:
                return r6
            L_0x009a:
                r6 = move-exception
                r4 = r0
                r0 = r6
                r6 = r4
                goto L_0x00ab
            L_0x009f:
                r6 = r0
                goto L_0x00a3
            L_0x00a1:
                r0 = move-exception
                goto L_0x00ab
            L_0x00a3:
                java.lang.String r0 = ""
                if (r6 == 0) goto L_0x00aa
                r6.disconnect()
            L_0x00aa:
                return r0
            L_0x00ab:
                if (r6 == 0) goto L_0x00b0
                r6.disconnect()
            L_0x00b0:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: mega.boicot.profile.C6064d.doInBackground(java.lang.String[]):java.lang.String");
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void onPostExecute(String str) {
            String str2 = str;
            try {
                profile.this.findViewById(R.id.pb_mascoments).setVisibility(8);
                profile.this.findViewById(R.id.pb_mascoments_inv).setVisibility(8);
            } catch (Exception unused) {
            }
            if (str2.contains("ANDROID:OK DATOS:")) {
                int indexOf = str2.indexOf("DATOS:") + 6;
                String[] split = str2.substring(indexOf, str2.indexOf(";", indexOf)).split(",");
                int i = 0;
                while (!split[i].equals("S") && !split[i].equals("N")) {
                    String[] split2 = split[i].split("-");
                    profile.this.mo21847a(Boolean.valueOf(false), Boolean.valueOf(false), split2[0], split2[3], split2[4], split2[2], split2[1].replace("@X@", "-").replace("@Y@", ","), split2[5], split2[6], split2[7], split2[8], split2[9], split2[10], split2[11]);
                    i++;
                }
                if (profile.this.f20051ar == null || profile.this.f20051ar.getStatus() != Status.RUNNING) {
                    profile.this.f20051ar = new C6067g();
                    profile.this.f20051ar.execute(new String[0]);
                }
                if (split[i].equals("S")) {
                    profile.this.findViewById(R.id.fl_mascoments).setVisibility(0);
                }
            }
        }
    }

    /* renamed from: mega.boicot.profile$e */
    private class C6065e extends AsyncTask<String, Void, String> {

        /* renamed from: a */
        boolean f20132a;

        private C6065e() {
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
            profile.this.findViewById(R.id.fl_masfotos).setVisibility(4);
            profile.this.findViewById(R.id.fl_menosfotos).setVisibility(4);
            this.f20132a = true;
            if (profile.this.f20077s.size() > profile.this.f20062d) {
                profile.this.mo21856i();
                this.f20132a = false;
            } else if (profile.this.f20046am) {
                profile.this.findViewById(R.id.pb_masfotos_inv).setVisibility(0);
            } else {
                profile.this.findViewById(R.id.pb_masfotos).setVisibility(0);
            }
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x00c7  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.String doInBackground(java.lang.String... r6) {
            /*
                r5 = this;
                boolean r6 = r5.f20132a
                if (r6 != 0) goto L_0x0007
                java.lang.String r6 = ""
                return r6
            L_0x0007:
                r6 = 0
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00c3 }
                r0.<init>()     // Catch:{ Exception -> 0x00c3 }
                java.lang.String r1 = "http://"
                r0.append(r1)     // Catch:{ Exception -> 0x00c3 }
                java.lang.String r1 = mega.boicot.config.f17839g     // Catch:{ Exception -> 0x00c3 }
                r0.append(r1)     // Catch:{ Exception -> 0x00c3 }
                java.lang.String r1 = "/srv/fotos_profile.php?idusu="
                r0.append(r1)     // Catch:{ Exception -> 0x00c3 }
                mega.boicot.profile r1 = mega.boicot.profile.this     // Catch:{ Exception -> 0x00c3 }
                int r1 = r1.f20060b     // Catch:{ Exception -> 0x00c3 }
                r0.append(r1)     // Catch:{ Exception -> 0x00c3 }
                java.lang.String r1 = "&c="
                r0.append(r1)     // Catch:{ Exception -> 0x00c3 }
                mega.boicot.profile r1 = mega.boicot.profile.this     // Catch:{ Exception -> 0x00c3 }
                java.lang.String r1 = r1.f20069k     // Catch:{ Exception -> 0x00c3 }
                r0.append(r1)     // Catch:{ Exception -> 0x00c3 }
                java.lang.String r1 = "&idusu_pro="
                r0.append(r1)     // Catch:{ Exception -> 0x00c3 }
                mega.boicot.profile r1 = mega.boicot.profile.this     // Catch:{ Exception -> 0x00c3 }
                java.lang.String r1 = r1.f20070l     // Catch:{ Exception -> 0x00c3 }
                r0.append(r1)     // Catch:{ Exception -> 0x00c3 }
                java.lang.String r1 = "&idf="
                r0.append(r1)     // Catch:{ Exception -> 0x00c3 }
                mega.boicot.profile r1 = mega.boicot.profile.this     // Catch:{ Exception -> 0x00c3 }
                int r1 = r1.f20062d     // Catch:{ Exception -> 0x00c3 }
                r2 = 1
                if (r1 <= 0) goto L_0x0059
                mega.boicot.profile r1 = mega.boicot.profile.this     // Catch:{ Exception -> 0x00c3 }
                java.util.ArrayList<mega.boicot.profile$a> r1 = r1.f20077s     // Catch:{ Exception -> 0x00c3 }
                mega.boicot.profile r3 = mega.boicot.profile.this     // Catch:{ Exception -> 0x00c3 }
                int r3 = r3.f20062d     // Catch:{ Exception -> 0x00c3 }
                int r3 = r3 - r2
                java.lang.Object r1 = r1.get(r3)     // Catch:{ Exception -> 0x00c3 }
                mega.boicot.profile$a r1 = (mega.boicot.profile.C6061a) r1     // Catch:{ Exception -> 0x00c3 }
                java.lang.String r1 = r1.f20116a     // Catch:{ Exception -> 0x00c3 }
                goto L_0x005e
            L_0x0059:
                r1 = 0
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ Exception -> 0x00c3 }
            L_0x005e:
                r0.append(r1)     // Catch:{ Exception -> 0x00c3 }
                java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x00c3 }
                java.net.URL r1 = new java.net.URL     // Catch:{ Exception -> 0x00c3 }
                r1.<init>(r0)     // Catch:{ Exception -> 0x00c3 }
                java.net.URLConnection r0 = r1.openConnection()     // Catch:{ Exception -> 0x00c3 }
                java.net.HttpURLConnection r0 = (java.net.HttpURLConnection) r0     // Catch:{ Exception -> 0x00c3 }
                r0.setDoInput(r2)     // Catch:{ Exception -> 0x00bf, all -> 0x00ba }
                r6 = 10000(0x2710, float:1.4013E-41)
                r0.setConnectTimeout(r6)     // Catch:{ Exception -> 0x00bf, all -> 0x00ba }
                r0.setReadTimeout(r6)     // Catch:{ Exception -> 0x00bf, all -> 0x00ba }
                java.lang.String r6 = "User-Agent"
                java.lang.String r1 = "Android Vinebre Software"
                r0.setRequestProperty(r6, r1)     // Catch:{ Exception -> 0x00bf, all -> 0x00ba }
                java.io.InputStream r6 = r0.getInputStream()     // Catch:{ Exception -> 0x00bf, all -> 0x00ba }
                java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch:{ Exception -> 0x00bf, all -> 0x00ba }
                java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x00bf, all -> 0x00ba }
                r2.<init>(r6)     // Catch:{ Exception -> 0x00bf, all -> 0x00ba }
                r1.<init>(r2)     // Catch:{ Exception -> 0x00bf, all -> 0x00ba }
                java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00bf, all -> 0x00ba }
                r6.<init>()     // Catch:{ Exception -> 0x00bf, all -> 0x00ba }
            L_0x0095:
                java.lang.String r2 = r1.readLine()     // Catch:{ Exception -> 0x00bf, all -> 0x00ba }
                if (r2 == 0) goto L_0x00b0
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00bf, all -> 0x00ba }
                r3.<init>()     // Catch:{ Exception -> 0x00bf, all -> 0x00ba }
                r3.append(r2)     // Catch:{ Exception -> 0x00bf, all -> 0x00ba }
                java.lang.String r2 = "\n"
                r3.append(r2)     // Catch:{ Exception -> 0x00bf, all -> 0x00ba }
                java.lang.String r2 = r3.toString()     // Catch:{ Exception -> 0x00bf, all -> 0x00ba }
                r6.append(r2)     // Catch:{ Exception -> 0x00bf, all -> 0x00ba }
                goto L_0x0095
            L_0x00b0:
                java.lang.String r6 = r6.toString()     // Catch:{ Exception -> 0x00bf, all -> 0x00ba }
                if (r0 == 0) goto L_0x00b9
                r0.disconnect()
            L_0x00b9:
                return r6
            L_0x00ba:
                r6 = move-exception
                r4 = r0
                r0 = r6
                r6 = r4
                goto L_0x00cb
            L_0x00bf:
                r6 = r0
                goto L_0x00c3
            L_0x00c1:
                r0 = move-exception
                goto L_0x00cb
            L_0x00c3:
                java.lang.String r0 = ""
                if (r6 == 0) goto L_0x00ca
                r6.disconnect()
            L_0x00ca:
                return r0
            L_0x00cb:
                if (r6 == 0) goto L_0x00d0
                r6.disconnect()
            L_0x00d0:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: mega.boicot.profile.C6065e.doInBackground(java.lang.String[]):java.lang.String");
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void onPostExecute(String str) {
            if (profile.this.findViewById(R.id.pb_masfotos_inv) != null) {
                profile.this.findViewById(R.id.pb_masfotos_inv).setVisibility(4);
                profile.this.findViewById(R.id.pb_masfotos).setVisibility(4);
            }
            if (str.contains("ANDROID:OK DATOS:")) {
                int indexOf = str.indexOf("DATOS:") + 6;
                String[] split = str.substring(indexOf, str.indexOf(";", indexOf)).split(",");
                int i = 0;
                while (!split[i].equals("S") && !split[i].equals("N")) {
                    String[] split2 = split[i].split("-");
                    C6061a aVar = new C6061a();
                    aVar.f20116a = split2[0];
                    aVar.f20118c = split2[1];
                    aVar.f20117b = split2[2];
                    aVar.f20119d = split2[3];
                    profile.this.f20077s.add(aVar);
                    i++;
                }
                if (split[i].equals("N")) {
                    profile.this.f20044ak = true;
                }
                profile.this.mo21856i();
            }
        }
    }

    /* renamed from: mega.boicot.profile$f */
    private class C6066f extends AsyncTask<String, Void, String> {

        /* renamed from: a */
        ProgressBar f20134a;

        /* renamed from: b */
        String f20135b;

        /* renamed from: c */
        ImageView f20136c;

        /* renamed from: d */
        Bitmap f20137d;

        private C6066f() {
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
            if (profile.this.f20082x.getVisibility() == 0 && profile.this.f20082x.getTag(R.id.idaux2).equals("N")) {
                this.f20136c = profile.this.f20082x;
                this.f20134a = profile.this.f20001G;
            } else if (profile.this.f20083y.getVisibility() == 0 && profile.this.f20083y.getTag(R.id.idaux2).equals("N")) {
                this.f20136c = profile.this.f20083y;
                this.f20134a = profile.this.f20002H;
            } else if (profile.this.f20084z.getVisibility() == 0 && profile.this.f20084z.getTag(R.id.idaux2).equals("N")) {
                this.f20136c = profile.this.f20084z;
                this.f20134a = profile.this.f20003I;
            } else if (profile.this.f19995A.getVisibility() == 0 && profile.this.f19995A.getTag(R.id.idaux2).equals("N")) {
                this.f20136c = profile.this.f19995A;
                this.f20134a = profile.this.f20004J;
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public String doInBackground(String... strArr) {
            if (this.f20136c == null) {
                return "-1";
            }
            this.f20135b = (String) this.f20136c.getTag(R.id.idaux1);
            try {
                StringBuilder sb = new StringBuilder();
                sb.append("http://imgs1.e-droid.net/srv/imgs/ususgal/");
                sb.append(profile.this.f20070l);
                sb.append("_");
                sb.append(this.f20135b);
                sb.append("_p.jpg");
                try {
                    HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(sb.toString()).openConnection();
                    httpURLConnection.setDoInput(true);
                    httpURLConnection.setConnectTimeout(10000);
                    httpURLConnection.setReadTimeout(20000);
                    httpURLConnection.connect();
                    InputStream inputStream = httpURLConnection.getInputStream();
                    try {
                        this.f20137d = BitmapFactory.decodeStream(inputStream);
                        inputStream.close();
                        httpURLConnection.disconnect();
                        File file = profile.this.f20080v;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("fperfilgal_");
                        sb2.append(this.f20135b);
                        sb2.append(".jpg");
                        try {
                            this.f20137d.compress(CompressFormat.JPEG, 70, new FileOutputStream(new File(file, sb2.toString())));
                            return "1";
                        } catch (Exception unused) {
                            return "0";
                        }
                    } catch (OutOfMemoryError unused2) {
                        return "0";
                    }
                } catch (IOException unused3) {
                    return "0";
                }
            } catch (MalformedURLException unused4) {
                return "0";
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void onPostExecute(String str) {
            if (this.f20136c != null && !str.equals("-1") && ((String) this.f20136c.getTag(R.id.idaux1)).equals(this.f20135b)) {
                if (this.f20134a != null) {
                    this.f20134a.setVisibility(8);
                }
                this.f20136c.setTag(R.id.idaux2, "S");
                if (str == "1") {
                    this.f20136c.setImageBitmap(this.f20137d);
                }
                new C6066f().execute(new String[0]);
            }
        }
    }

    /* renamed from: mega.boicot.profile$g */
    private class C6067g extends AsyncTask<String, Void, String> {

        /* renamed from: a */
        String f20139a;

        /* renamed from: b */
        String f20140b;

        /* renamed from: c */
        Bitmap f20141c;

        private C6067g() {
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
            for (int i = 0; i < profile.this.f20011Q.getChildCount(); i++) {
                LinearLayout linearLayout = (LinearLayout) profile.this.f20011Q.getChildAt(i);
                String str = (String) linearLayout.findViewById(R.id.iv_usucoment).getTag(R.id.idaux1);
                this.f20140b = (String) linearLayout.findViewById(R.id.iv_usucoment).getTag(R.id.idaux2);
                if (this.f20140b != null && !this.f20140b.equals("0")) {
                    String str2 = this.f20140b;
                    SharedPreferences sharedPreferences = profile.this.f20031aJ;
                    StringBuilder sb = new StringBuilder();
                    sb.append("fperfil_");
                    sb.append(str);
                    if (!str2.equals(sharedPreferences.getString(sb.toString(), "0"))) {
                        this.f20139a = str;
                        return;
                    }
                }
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public String doInBackground(String... strArr) {
            if (this.f20139a == null) {
                return "-1";
            }
            try {
                StringBuilder sb = new StringBuilder();
                sb.append("http://imgs1.e-droid.net/srv/imgs/usus/");
                sb.append(this.f20139a);
                sb.append("_1_p.jpg?v=");
                sb.append(this.f20140b);
                try {
                    HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(sb.toString()).openConnection();
                    httpURLConnection.setDoInput(true);
                    httpURLConnection.setConnectTimeout(10000);
                    httpURLConnection.setReadTimeout(20000);
                    httpURLConnection.connect();
                    InputStream inputStream = httpURLConnection.getInputStream();
                    try {
                        this.f20141c = BitmapFactory.decodeStream(inputStream);
                        inputStream.close();
                        httpURLConnection.disconnect();
                        File file = profile.this.f20080v;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("fperfil_");
                        sb2.append(this.f20139a);
                        sb2.append(".jpg");
                        try {
                            this.f20141c.compress(CompressFormat.JPEG, 70, new FileOutputStream(new File(file, sb2.toString())));
                            return "1";
                        } catch (Exception unused) {
                            return "0";
                        }
                    } catch (OutOfMemoryError unused2) {
                        return "0";
                    }
                } catch (IOException unused3) {
                    return "0";
                }
            } catch (MalformedURLException unused4) {
                return "0";
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void onPostExecute(String str) {
            if (profile.this.f20011Q != null && this.f20139a != null && !str.equals("-1")) {
                if (str == "1") {
                    Editor edit = profile.this.f20031aJ.edit();
                    StringBuilder sb = new StringBuilder();
                    sb.append("fperfil_");
                    sb.append(this.f20139a);
                    edit.putString(sb.toString(), this.f20140b);
                    edit.commit();
                }
                int childCount = profile.this.f20011Q.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    String str2 = (String) profile.this.f20011Q.getChildAt(i).findViewById(R.id.iv_usucoment).getTag(R.id.idaux1);
                    if (str2 != null && str2.equals(this.f20139a)) {
                        profile.this.f20011Q.getChildAt(i).findViewById(R.id.iv_usucoment).setTag(R.id.idaux2, this.f20140b);
                        if (str == "1") {
                            ((ImageView) profile.this.f20011Q.getChildAt(i).findViewById(R.id.iv_usucoment)).setImageBitmap(this.f20141c);
                        }
                    }
                }
                new C6067g().execute(new String[0]);
            }
        }
    }

    /* renamed from: mega.boicot.profile$h */
    private class C6068h extends AsyncTask<String, Void, String> {
        private C6068h() {
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
            profile.this.f20029aH.findViewById(R.id.likes_pb).setVisibility(0);
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x00a7  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.String doInBackground(java.lang.String... r6) {
            /*
                r5 = this;
                r6 = 0
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00a3 }
                r0.<init>()     // Catch:{ Exception -> 0x00a3 }
                java.lang.String r1 = "http://"
                r0.append(r1)     // Catch:{ Exception -> 0x00a3 }
                java.lang.String r1 = mega.boicot.config.f17839g     // Catch:{ Exception -> 0x00a3 }
                r0.append(r1)     // Catch:{ Exception -> 0x00a3 }
                java.lang.String r1 = "/srv/likes.php?idusu="
                r0.append(r1)     // Catch:{ Exception -> 0x00a3 }
                mega.boicot.profile r1 = mega.boicot.profile.this     // Catch:{ Exception -> 0x00a3 }
                int r1 = r1.f20060b     // Catch:{ Exception -> 0x00a3 }
                r0.append(r1)     // Catch:{ Exception -> 0x00a3 }
                java.lang.String r1 = "&c="
                r0.append(r1)     // Catch:{ Exception -> 0x00a3 }
                mega.boicot.profile r1 = mega.boicot.profile.this     // Catch:{ Exception -> 0x00a3 }
                java.lang.String r1 = r1.f20069k     // Catch:{ Exception -> 0x00a3 }
                r0.append(r1)     // Catch:{ Exception -> 0x00a3 }
                java.lang.String r1 = "&idusu_pro="
                r0.append(r1)     // Catch:{ Exception -> 0x00a3 }
                mega.boicot.profile r1 = mega.boicot.profile.this     // Catch:{ Exception -> 0x00a3 }
                java.lang.String r1 = r1.f20070l     // Catch:{ Exception -> 0x00a3 }
                r0.append(r1)     // Catch:{ Exception -> 0x00a3 }
                java.lang.String r1 = "&n="
                r0.append(r1)     // Catch:{ Exception -> 0x00a3 }
                mega.boicot.profile r1 = mega.boicot.profile.this     // Catch:{ Exception -> 0x00a3 }
                int r1 = r1.f20066h     // Catch:{ Exception -> 0x00a3 }
                r0.append(r1)     // Catch:{ Exception -> 0x00a3 }
                java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x00a3 }
                java.net.URL r1 = new java.net.URL     // Catch:{ Exception -> 0x00a3 }
                r1.<init>(r0)     // Catch:{ Exception -> 0x00a3 }
                java.net.URLConnection r0 = r1.openConnection()     // Catch:{ Exception -> 0x00a3 }
                java.net.HttpURLConnection r0 = (java.net.HttpURLConnection) r0     // Catch:{ Exception -> 0x00a3 }
                r6 = 1
                r0.setDoInput(r6)     // Catch:{ Exception -> 0x009f, all -> 0x009a }
                r6 = 10000(0x2710, float:1.4013E-41)
                r0.setConnectTimeout(r6)     // Catch:{ Exception -> 0x009f, all -> 0x009a }
                r0.setReadTimeout(r6)     // Catch:{ Exception -> 0x009f, all -> 0x009a }
                java.lang.String r6 = "User-Agent"
                java.lang.String r1 = "Android Vinebre Software"
                r0.setRequestProperty(r6, r1)     // Catch:{ Exception -> 0x009f, all -> 0x009a }
                java.io.InputStream r6 = r0.getInputStream()     // Catch:{ Exception -> 0x009f, all -> 0x009a }
                java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch:{ Exception -> 0x009f, all -> 0x009a }
                java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x009f, all -> 0x009a }
                r2.<init>(r6)     // Catch:{ Exception -> 0x009f, all -> 0x009a }
                r1.<init>(r2)     // Catch:{ Exception -> 0x009f, all -> 0x009a }
                java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x009f, all -> 0x009a }
                r6.<init>()     // Catch:{ Exception -> 0x009f, all -> 0x009a }
            L_0x0075:
                java.lang.String r2 = r1.readLine()     // Catch:{ Exception -> 0x009f, all -> 0x009a }
                if (r2 == 0) goto L_0x0090
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x009f, all -> 0x009a }
                r3.<init>()     // Catch:{ Exception -> 0x009f, all -> 0x009a }
                r3.append(r2)     // Catch:{ Exception -> 0x009f, all -> 0x009a }
                java.lang.String r2 = "\n"
                r3.append(r2)     // Catch:{ Exception -> 0x009f, all -> 0x009a }
                java.lang.String r2 = r3.toString()     // Catch:{ Exception -> 0x009f, all -> 0x009a }
                r6.append(r2)     // Catch:{ Exception -> 0x009f, all -> 0x009a }
                goto L_0x0075
            L_0x0090:
                java.lang.String r6 = r6.toString()     // Catch:{ Exception -> 0x009f, all -> 0x009a }
                if (r0 == 0) goto L_0x0099
                r0.disconnect()
            L_0x0099:
                return r6
            L_0x009a:
                r6 = move-exception
                r4 = r0
                r0 = r6
                r6 = r4
                goto L_0x00ab
            L_0x009f:
                r6 = r0
                goto L_0x00a3
            L_0x00a1:
                r0 = move-exception
                goto L_0x00ab
            L_0x00a3:
                java.lang.String r0 = ""
                if (r6 == 0) goto L_0x00aa
                r6.disconnect()
            L_0x00aa:
                return r0
            L_0x00ab:
                if (r6 == 0) goto L_0x00b0
                r6.disconnect()
            L_0x00b0:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: mega.boicot.profile.C6068h.doInBackground(java.lang.String[]):java.lang.String");
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void onPostExecute(String str) {
            boolean z;
            try {
                profile.this.f20029aH.findViewById(R.id.likes_pb).setVisibility(8);
            } catch (Exception unused) {
            }
            if (str.contains("ANDROID:OK DATOS:")) {
                int indexOf = str.indexOf("DATOS:") + 6;
                String[] split = str.substring(indexOf, str.indexOf(";", indexOf)).split(",");
                if (profile.this.f20032aK.size() == 0) {
                    if (profile.this.f20047an) {
                        C6029o oVar = new C6029o();
                        StringBuilder sb = new StringBuilder();
                        sb.append(profile.this.f20060b);
                        sb.append("");
                        oVar.f19938f = sb.toString();
                        oVar.f19937e = profile.this.getResources().getString(R.string.tu);
                        oVar.f19934b = profile.this.f20079u.mo20757a((Context) profile.this, 1).exists();
                        profile.this.f20032aK.add(oVar);
                    }
                } else if (((C6029o) profile.this.f20032aK.get(profile.this.f20032aK.size() - 1)).f19935c) {
                    profile.this.f20032aK.remove(profile.this.f20032aK.size() - 1);
                }
                int i = 0;
                while (!split[i].equals("S") && !split[i].equals("N")) {
                    String[] split2 = split[i].split("-");
                    int i2 = 0;
                    while (true) {
                        if (i2 >= profile.this.f20032aK.size()) {
                            z = false;
                            break;
                        } else if (((C6029o) profile.this.f20032aK.get(i2)).f19938f.equals(split2[0])) {
                            z = true;
                            break;
                        } else {
                            i2++;
                        }
                    }
                    if (!z) {
                        C6029o oVar2 = new C6029o();
                        oVar2.f19938f = split2[0];
                        oVar2.f19937e = split2[1].replace("@X@", ",").replace("@Y@", "-");
                        oVar2.f19939g = split2[2];
                        if (!oVar2.f19939g.equals("0")) {
                            oVar2.f19934b = true;
                        }
                        oVar2.f19940h = split2[3];
                        oVar2.f19943k = split2[4];
                        oVar2.f19944l = split2[5];
                        oVar2.f19945m = split2[6];
                        oVar2.f19941i = split2[7];
                        oVar2.f19942j = split2[8];
                        oVar2.f19936d = split2[9].equals("1");
                        profile.this.f20032aK.add(oVar2);
                        profile.this.f20066h++;
                    }
                    i++;
                }
                if (split[i].equals("S")) {
                    C6029o oVar3 = new C6029o();
                    oVar3.f19935c = true;
                    profile.this.f20032aK.add(oVar3);
                }
                profile.this.f20033aL.notifyDataSetChanged();
            }
        }
    }

    /* renamed from: mega.boicot.profile$i */
    private class C6069i extends AsyncTask<String, Void, String> {

        /* renamed from: a */
        boolean f20144a;

        private C6069i() {
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
            profile.this.findViewById(R.id.fl_masvideos).setVisibility(4);
            profile.this.findViewById(R.id.fl_menosvideos).setVisibility(4);
            this.f20144a = true;
            if (profile.this.f20078t.size() > profile.this.f20063e) {
                profile.this.mo21858k();
                this.f20144a = false;
            } else if (profile.this.f20046am) {
                profile.this.findViewById(R.id.pb_masvideos_inv).setVisibility(0);
            } else {
                profile.this.findViewById(R.id.pb_masvideos).setVisibility(0);
            }
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x00c7  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.String doInBackground(java.lang.String... r6) {
            /*
                r5 = this;
                boolean r6 = r5.f20144a
                if (r6 != 0) goto L_0x0007
                java.lang.String r6 = ""
                return r6
            L_0x0007:
                r6 = 0
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00c3 }
                r0.<init>()     // Catch:{ Exception -> 0x00c3 }
                java.lang.String r1 = "http://"
                r0.append(r1)     // Catch:{ Exception -> 0x00c3 }
                java.lang.String r1 = mega.boicot.config.f17839g     // Catch:{ Exception -> 0x00c3 }
                r0.append(r1)     // Catch:{ Exception -> 0x00c3 }
                java.lang.String r1 = "/srv/videos_profile.php?idusu="
                r0.append(r1)     // Catch:{ Exception -> 0x00c3 }
                mega.boicot.profile r1 = mega.boicot.profile.this     // Catch:{ Exception -> 0x00c3 }
                int r1 = r1.f20060b     // Catch:{ Exception -> 0x00c3 }
                r0.append(r1)     // Catch:{ Exception -> 0x00c3 }
                java.lang.String r1 = "&c="
                r0.append(r1)     // Catch:{ Exception -> 0x00c3 }
                mega.boicot.profile r1 = mega.boicot.profile.this     // Catch:{ Exception -> 0x00c3 }
                java.lang.String r1 = r1.f20069k     // Catch:{ Exception -> 0x00c3 }
                r0.append(r1)     // Catch:{ Exception -> 0x00c3 }
                java.lang.String r1 = "&idusu_pro="
                r0.append(r1)     // Catch:{ Exception -> 0x00c3 }
                mega.boicot.profile r1 = mega.boicot.profile.this     // Catch:{ Exception -> 0x00c3 }
                java.lang.String r1 = r1.f20070l     // Catch:{ Exception -> 0x00c3 }
                r0.append(r1)     // Catch:{ Exception -> 0x00c3 }
                java.lang.String r1 = "&idv="
                r0.append(r1)     // Catch:{ Exception -> 0x00c3 }
                mega.boicot.profile r1 = mega.boicot.profile.this     // Catch:{ Exception -> 0x00c3 }
                int r1 = r1.f20063e     // Catch:{ Exception -> 0x00c3 }
                r2 = 1
                if (r1 <= 0) goto L_0x0059
                mega.boicot.profile r1 = mega.boicot.profile.this     // Catch:{ Exception -> 0x00c3 }
                java.util.ArrayList<mega.boicot.profile$b> r1 = r1.f20078t     // Catch:{ Exception -> 0x00c3 }
                mega.boicot.profile r3 = mega.boicot.profile.this     // Catch:{ Exception -> 0x00c3 }
                int r3 = r3.f20063e     // Catch:{ Exception -> 0x00c3 }
                int r3 = r3 - r2
                java.lang.Object r1 = r1.get(r3)     // Catch:{ Exception -> 0x00c3 }
                mega.boicot.profile$b r1 = (mega.boicot.profile.C6062b) r1     // Catch:{ Exception -> 0x00c3 }
                java.lang.String r1 = r1.f20122a     // Catch:{ Exception -> 0x00c3 }
                goto L_0x005e
            L_0x0059:
                r1 = 0
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ Exception -> 0x00c3 }
            L_0x005e:
                r0.append(r1)     // Catch:{ Exception -> 0x00c3 }
                java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x00c3 }
                java.net.URL r1 = new java.net.URL     // Catch:{ Exception -> 0x00c3 }
                r1.<init>(r0)     // Catch:{ Exception -> 0x00c3 }
                java.net.URLConnection r0 = r1.openConnection()     // Catch:{ Exception -> 0x00c3 }
                java.net.HttpURLConnection r0 = (java.net.HttpURLConnection) r0     // Catch:{ Exception -> 0x00c3 }
                r0.setDoInput(r2)     // Catch:{ Exception -> 0x00bf, all -> 0x00ba }
                r6 = 10000(0x2710, float:1.4013E-41)
                r0.setConnectTimeout(r6)     // Catch:{ Exception -> 0x00bf, all -> 0x00ba }
                r0.setReadTimeout(r6)     // Catch:{ Exception -> 0x00bf, all -> 0x00ba }
                java.lang.String r6 = "User-Agent"
                java.lang.String r1 = "Android Vinebre Software"
                r0.setRequestProperty(r6, r1)     // Catch:{ Exception -> 0x00bf, all -> 0x00ba }
                java.io.InputStream r6 = r0.getInputStream()     // Catch:{ Exception -> 0x00bf, all -> 0x00ba }
                java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch:{ Exception -> 0x00bf, all -> 0x00ba }
                java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x00bf, all -> 0x00ba }
                r2.<init>(r6)     // Catch:{ Exception -> 0x00bf, all -> 0x00ba }
                r1.<init>(r2)     // Catch:{ Exception -> 0x00bf, all -> 0x00ba }
                java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00bf, all -> 0x00ba }
                r6.<init>()     // Catch:{ Exception -> 0x00bf, all -> 0x00ba }
            L_0x0095:
                java.lang.String r2 = r1.readLine()     // Catch:{ Exception -> 0x00bf, all -> 0x00ba }
                if (r2 == 0) goto L_0x00b0
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00bf, all -> 0x00ba }
                r3.<init>()     // Catch:{ Exception -> 0x00bf, all -> 0x00ba }
                r3.append(r2)     // Catch:{ Exception -> 0x00bf, all -> 0x00ba }
                java.lang.String r2 = "\n"
                r3.append(r2)     // Catch:{ Exception -> 0x00bf, all -> 0x00ba }
                java.lang.String r2 = r3.toString()     // Catch:{ Exception -> 0x00bf, all -> 0x00ba }
                r6.append(r2)     // Catch:{ Exception -> 0x00bf, all -> 0x00ba }
                goto L_0x0095
            L_0x00b0:
                java.lang.String r6 = r6.toString()     // Catch:{ Exception -> 0x00bf, all -> 0x00ba }
                if (r0 == 0) goto L_0x00b9
                r0.disconnect()
            L_0x00b9:
                return r6
            L_0x00ba:
                r6 = move-exception
                r4 = r0
                r0 = r6
                r6 = r4
                goto L_0x00cb
            L_0x00bf:
                r6 = r0
                goto L_0x00c3
            L_0x00c1:
                r0 = move-exception
                goto L_0x00cb
            L_0x00c3:
                java.lang.String r0 = ""
                if (r6 == 0) goto L_0x00ca
                r6.disconnect()
            L_0x00ca:
                return r0
            L_0x00cb:
                if (r6 == 0) goto L_0x00d0
                r6.disconnect()
            L_0x00d0:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: mega.boicot.profile.C6069i.doInBackground(java.lang.String[]):java.lang.String");
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void onPostExecute(String str) {
            if (profile.this.findViewById(R.id.pb_masvideos_inv) != null) {
                profile.this.findViewById(R.id.pb_masvideos_inv).setVisibility(4);
                profile.this.findViewById(R.id.pb_masvideos).setVisibility(4);
            }
            if (str.contains("ANDROID:OK DATOS:")) {
                int indexOf = str.indexOf("DATOS:") + 6;
                String[] split = str.substring(indexOf, str.indexOf(";", indexOf)).split(",");
                int i = 0;
                while (!split[i].equals("S") && !split[i].equals("N")) {
                    String[] split2 = split[i].split("-");
                    C6062b bVar = new C6062b();
                    bVar.f20122a = split2[0];
                    bVar.f20123b = split2[1];
                    bVar.f20125d = split2[2];
                    bVar.f20124c = split2[3];
                    bVar.f20126e = split2[4];
                    profile.this.f20078t.add(bVar);
                    i++;
                }
                if (split[i].equals("N")) {
                    profile.this.f20045al = true;
                }
                profile.this.mo21858k();
            }
        }
    }

    /* renamed from: mega.boicot.profile$j */
    private class C6070j extends AsyncTask<String, Void, String> {

        /* renamed from: a */
        ProgressBar f20146a;

        /* renamed from: b */
        String f20147b;

        /* renamed from: c */
        ImageView f20148c;

        /* renamed from: d */
        Bitmap f20149d;

        private C6070j() {
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
            if (profile.this.f19996B.getVisibility() == 0 && profile.this.f19996B.getTag(R.id.idaux2).equals("N")) {
                this.f20148c = profile.this.f19996B;
                this.f20146a = profile.this.f20005K;
            } else if (profile.this.f19997C.getVisibility() == 0 && profile.this.f19997C.getTag(R.id.idaux2).equals("N")) {
                this.f20148c = profile.this.f19997C;
                this.f20146a = profile.this.f20006L;
            } else if (profile.this.f19998D.getVisibility() == 0 && profile.this.f19998D.getTag(R.id.idaux2).equals("N")) {
                this.f20148c = profile.this.f19998D;
                this.f20146a = profile.this.f20007M;
            } else if (profile.this.f19999E.getVisibility() == 0 && profile.this.f19999E.getTag(R.id.idaux2).equals("N")) {
                this.f20148c = profile.this.f19999E;
                this.f20146a = profile.this.f20008N;
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public String doInBackground(String... strArr) {
            if (this.f20148c == null) {
                return "-1";
            }
            this.f20147b = (String) this.f20148c.getTag(R.id.idaux1);
            try {
                StringBuilder sb = new StringBuilder();
                sb.append("http://imgs1.e-droid.net/srv/imgs/videos_pro/v");
                sb.append(this.f20147b);
                sb.append("_");
                sb.append(profile.this.f20070l);
                sb.append("_th.jpg");
                try {
                    HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(sb.toString()).openConnection();
                    httpURLConnection.setDoInput(true);
                    httpURLConnection.setConnectTimeout(10000);
                    httpURLConnection.setReadTimeout(20000);
                    httpURLConnection.connect();
                    InputStream inputStream = httpURLConnection.getInputStream();
                    try {
                        this.f20149d = BitmapFactory.decodeStream(inputStream);
                        inputStream.close();
                        httpURLConnection.disconnect();
                        File file = profile.this.f20080v;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("fperfilgalv_");
                        sb2.append(this.f20147b);
                        sb2.append(".jpg");
                        try {
                            this.f20149d.compress(CompressFormat.JPEG, 70, new FileOutputStream(new File(file, sb2.toString())));
                            return "1";
                        } catch (Exception unused) {
                            return "0";
                        }
                    } catch (OutOfMemoryError unused2) {
                        return "0";
                    }
                } catch (IOException unused3) {
                    return "0";
                }
            } catch (MalformedURLException unused4) {
                return "0";
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void onPostExecute(String str) {
            if (this.f20148c != null && !str.equals("-1") && ((String) this.f20148c.getTag(R.id.idaux1)).equals(this.f20147b)) {
                if (this.f20146a != null) {
                    this.f20146a.setVisibility(8);
                }
                this.f20148c.setTag(R.id.idaux2, "S");
                if (str == "1") {
                    this.f20149d = config.m23829a(this.f20149d, BitmapFactory.decodeResource(profile.this.getResources(), R.drawable.play_ppp));
                    this.f20148c.setImageBitmap(this.f20149d);
                }
                new C6070j().execute(new String[0]);
            }
        }
    }

    /* renamed from: mega.boicot.profile$k */
    private class C6071k extends AsyncTask<String, Void, String> {

        /* renamed from: a */
        String f20151a;

        private C6071k() {
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
            this.f20151a = "0";
            if (profile.this.f20049ap.getInt("p_dist") > 0 && !profile.this.f20049ap.containsKey("dist")) {
                this.f20151a = "1";
            }
            if (profile.this.f20046am) {
                profile.this.findViewById(R.id.pb_masfotos_inv).setVisibility(0);
                profile.this.findViewById(R.id.pb_masvideos_inv).setVisibility(0);
                profile.this.findViewById(R.id.pb_mascoments_inv).setVisibility(0);
                return;
            }
            profile.this.findViewById(R.id.pb_masfotos).setVisibility(0);
            profile.this.findViewById(R.id.pb_masvideos).setVisibility(0);
            profile.this.findViewById(R.id.pb_mascoments).setVisibility(0);
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x018c  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.String doInBackground(java.lang.String... r7) {
            /*
                r6 = this;
                mega.boicot.profile r7 = mega.boicot.profile.this
                android.content.SharedPreferences r7 = r7.f20031aJ
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "idcom0_"
                r0.append(r1)
                mega.boicot.profile r1 = mega.boicot.profile.this
                java.lang.String r1 = r1.f20070l
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                java.lang.String r1 = ""
                java.lang.String r7 = r7.getString(r0, r1)
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r7)
                java.lang.String r7 = ","
                r0.append(r7)
                mega.boicot.profile r7 = mega.boicot.profile.this
                android.content.SharedPreferences r7 = r7.f20031aJ
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "idcom1_"
                r1.append(r2)
                mega.boicot.profile r2 = mega.boicot.profile.this
                java.lang.String r2 = r2.f20070l
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                java.lang.String r2 = ""
                java.lang.String r7 = r7.getString(r1, r2)
                r0.append(r7)
                java.lang.String r7 = r0.toString()
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r7)
                java.lang.String r7 = ","
                r0.append(r7)
                mega.boicot.profile r7 = mega.boicot.profile.this
                android.content.SharedPreferences r7 = r7.f20031aJ
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "idcom2_"
                r1.append(r2)
                mega.boicot.profile r2 = mega.boicot.profile.this
                java.lang.String r2 = r2.f20070l
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                java.lang.String r2 = ""
                java.lang.String r7 = r7.getString(r1, r2)
                r0.append(r7)
                java.lang.String r7 = r0.toString()
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r7)
                java.lang.String r7 = ","
                r0.append(r7)
                mega.boicot.profile r7 = mega.boicot.profile.this
                android.content.SharedPreferences r7 = r7.f20031aJ
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "idcom3_"
                r1.append(r2)
                mega.boicot.profile r2 = mega.boicot.profile.this
                java.lang.String r2 = r2.f20070l
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                java.lang.String r2 = ""
                java.lang.String r7 = r7.getString(r1, r2)
                r0.append(r7)
                java.lang.String r7 = r0.toString()
                r0 = 0
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0188 }
                r1.<init>()     // Catch:{ Exception -> 0x0188 }
                java.lang.String r2 = "http://"
                r1.append(r2)     // Catch:{ Exception -> 0x0188 }
                java.lang.String r2 = mega.boicot.config.f17839g     // Catch:{ Exception -> 0x0188 }
                r1.append(r2)     // Catch:{ Exception -> 0x0188 }
                java.lang.String r2 = "/srv/obtener_profile.php?idusu="
                r1.append(r2)     // Catch:{ Exception -> 0x0188 }
                mega.boicot.profile r2 = mega.boicot.profile.this     // Catch:{ Exception -> 0x0188 }
                int r2 = r2.f20060b     // Catch:{ Exception -> 0x0188 }
                r1.append(r2)     // Catch:{ Exception -> 0x0188 }
                java.lang.String r2 = "&c="
                r1.append(r2)     // Catch:{ Exception -> 0x0188 }
                mega.boicot.profile r2 = mega.boicot.profile.this     // Catch:{ Exception -> 0x0188 }
                java.lang.String r2 = r2.f20069k     // Catch:{ Exception -> 0x0188 }
                r1.append(r2)     // Catch:{ Exception -> 0x0188 }
                java.lang.String r2 = "&idusu_pro="
                r1.append(r2)     // Catch:{ Exception -> 0x0188 }
                mega.boicot.profile r2 = mega.boicot.profile.this     // Catch:{ Exception -> 0x0188 }
                java.lang.String r2 = r2.f20070l     // Catch:{ Exception -> 0x0188 }
                r1.append(r2)     // Catch:{ Exception -> 0x0188 }
                java.lang.String r2 = "&vdescr="
                r1.append(r2)     // Catch:{ Exception -> 0x0188 }
                mega.boicot.profile r2 = mega.boicot.profile.this     // Catch:{ Exception -> 0x0188 }
                android.content.SharedPreferences r2 = r2.f20031aJ     // Catch:{ Exception -> 0x0188 }
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0188 }
                r3.<init>()     // Catch:{ Exception -> 0x0188 }
                java.lang.String r4 = "vdescr_"
                r3.append(r4)     // Catch:{ Exception -> 0x0188 }
                mega.boicot.profile r4 = mega.boicot.profile.this     // Catch:{ Exception -> 0x0188 }
                java.lang.String r4 = r4.f20070l     // Catch:{ Exception -> 0x0188 }
                r3.append(r4)     // Catch:{ Exception -> 0x0188 }
                java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x0188 }
                java.lang.String r4 = "0"
                java.lang.String r2 = r2.getString(r3, r4)     // Catch:{ Exception -> 0x0188 }
                r1.append(r2)     // Catch:{ Exception -> 0x0188 }
                java.lang.String r2 = "&idcoments="
                r1.append(r2)     // Catch:{ Exception -> 0x0188 }
                r1.append(r7)     // Catch:{ Exception -> 0x0188 }
                java.lang.String r7 = "&condist="
                r1.append(r7)     // Catch:{ Exception -> 0x0188 }
                java.lang.String r7 = r6.f20151a     // Catch:{ Exception -> 0x0188 }
                r1.append(r7)     // Catch:{ Exception -> 0x0188 }
                java.lang.String r7 = r1.toString()     // Catch:{ Exception -> 0x0188 }
                java.net.URL r1 = new java.net.URL     // Catch:{ Exception -> 0x0188 }
                r1.<init>(r7)     // Catch:{ Exception -> 0x0188 }
                java.net.URLConnection r7 = r1.openConnection()     // Catch:{ Exception -> 0x0188 }
                java.net.HttpURLConnection r7 = (java.net.HttpURLConnection) r7     // Catch:{ Exception -> 0x0188 }
                r0 = 1
                r7.setDoInput(r0)     // Catch:{ Exception -> 0x0184, all -> 0x017f }
                r0 = 10000(0x2710, float:1.4013E-41)
                r7.setConnectTimeout(r0)     // Catch:{ Exception -> 0x0184, all -> 0x017f }
                r7.setReadTimeout(r0)     // Catch:{ Exception -> 0x0184, all -> 0x017f }
                java.lang.String r0 = "User-Agent"
                java.lang.String r1 = "Android Vinebre Software"
                r7.setRequestProperty(r0, r1)     // Catch:{ Exception -> 0x0184, all -> 0x017f }
                java.io.InputStream r0 = r7.getInputStream()     // Catch:{ Exception -> 0x0184, all -> 0x017f }
                java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch:{ Exception -> 0x0184, all -> 0x017f }
                java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x0184, all -> 0x017f }
                r2.<init>(r0)     // Catch:{ Exception -> 0x0184, all -> 0x017f }
                r1.<init>(r2)     // Catch:{ Exception -> 0x0184, all -> 0x017f }
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0184, all -> 0x017f }
                r0.<init>()     // Catch:{ Exception -> 0x0184, all -> 0x017f }
            L_0x015a:
                java.lang.String r2 = r1.readLine()     // Catch:{ Exception -> 0x0184, all -> 0x017f }
                if (r2 == 0) goto L_0x0175
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0184, all -> 0x017f }
                r3.<init>()     // Catch:{ Exception -> 0x0184, all -> 0x017f }
                r3.append(r2)     // Catch:{ Exception -> 0x0184, all -> 0x017f }
                java.lang.String r2 = "\n"
                r3.append(r2)     // Catch:{ Exception -> 0x0184, all -> 0x017f }
                java.lang.String r2 = r3.toString()     // Catch:{ Exception -> 0x0184, all -> 0x017f }
                r0.append(r2)     // Catch:{ Exception -> 0x0184, all -> 0x017f }
                goto L_0x015a
            L_0x0175:
                java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0184, all -> 0x017f }
                if (r7 == 0) goto L_0x017e
                r7.disconnect()
            L_0x017e:
                return r0
            L_0x017f:
                r0 = move-exception
                r5 = r0
                r0 = r7
                r7 = r5
                goto L_0x0190
            L_0x0184:
                r0 = r7
                goto L_0x0188
            L_0x0186:
                r7 = move-exception
                goto L_0x0190
            L_0x0188:
                java.lang.String r7 = ""
                if (r0 == 0) goto L_0x018f
                r0.disconnect()
            L_0x018f:
                return r7
            L_0x0190:
                if (r0 == 0) goto L_0x0195
                r0.disconnect()
            L_0x0195:
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: mega.boicot.profile.C6071k.doInBackground(java.lang.String[]):java.lang.String");
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void onPostExecute(String str) {
            int i;
            int i2;
            boolean z;
            String str2 = str;
            char c = 8;
            try {
                profile.this.findViewById(R.id.pb_masfotos_inv).setVisibility(4);
                profile.this.findViewById(R.id.pb_masfotos).setVisibility(4);
                profile.this.findViewById(R.id.pb_masvideos_inv).setVisibility(4);
                profile.this.findViewById(R.id.pb_masvideos).setVisibility(4);
                profile.this.findViewById(R.id.pb_mascoments_inv).setVisibility(8);
                profile.this.findViewById(R.id.pb_mascoments).setVisibility(8);
            } catch (Exception unused) {
            }
            if (str2.contains("ANDROID:OK DATOSUSU:")) {
                Editor edit = profile.this.f20031aJ.edit();
                int indexOf = str2.indexOf("DATOSUSU:") + 9;
                int indexOf2 = str2.indexOf(";", indexOf);
                if (this.f20151a.equals("1")) {
                    String substring = str2.substring(indexOf, indexOf2);
                    if (substring.equals("-1")) {
                        profile.this.f20073o = null;
                    } else {
                        profile.this.f20073o = substring;
                    }
                    profile.this.mo21854g();
                }
                int i3 = 1;
                int i4 = indexOf2 + 1;
                int indexOf3 = str2.indexOf(";", i4);
                char c2 = 0;
                if (profile.this.f20049ap.getInt("p_descr") > 0) {
                    String substring2 = str2.substring(i4, indexOf3);
                    if (!substring2.equals("")) {
                        int indexOf4 = substring2.indexOf(",");
                        String substring3 = substring2.substring(0, indexOf4);
                        String replace = substring2.substring(indexOf4 + 1).replace("@X@", ",");
                        StringBuilder sb = new StringBuilder();
                        sb.append("vdescr_");
                        sb.append(profile.this.f20070l);
                        edit.putString(sb.toString(), substring3);
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("descr_");
                        sb2.append(profile.this.f20070l);
                        edit.putString(sb2.toString(), replace);
                        edit.commit();
                        profile.this.f20010P.setText(replace);
                        profile.this.f20010P.setVisibility(0);
                    }
                }
                if (profile.this.f20061c == 0 || profile.this.f20071m.equals("0")) {
                    profile.this.mo21855h();
                }
                int i5 = indexOf3 + 1;
                int indexOf5 = str2.indexOf(";", i5);
                if (profile.this.f20049ap.getBoolean("galeria")) {
                    String[] split = str2.substring(i5, indexOf5).split(",");
                    for (int i6 = 0; i6 < 4; i6++) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("idf");
                        sb3.append(i6);
                        sb3.append("_");
                        sb3.append(profile.this.f20070l);
                        edit.remove(sb3.toString());
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append(C1248f.TAG);
                        sb4.append(i6);
                        sb4.append("_fcrea_");
                        sb4.append(profile.this.f20070l);
                        edit.remove(sb4.toString());
                        StringBuilder sb5 = new StringBuilder();
                        sb5.append(C1248f.TAG);
                        sb5.append(i6);
                        sb5.append("_nlikes_");
                        sb5.append(profile.this.f20070l);
                        edit.remove(sb5.toString());
                        StringBuilder sb6 = new StringBuilder();
                        sb6.append(C1248f.TAG);
                        sb6.append(i6);
                        sb6.append("_liked_");
                        sb6.append(profile.this.f20070l);
                        edit.remove(sb6.toString());
                    }
                    int i7 = 0;
                    while (!split[i7].equals("S") && !split[i7].equals("N")) {
                        String[] split2 = split[i7].split("-");
                        StringBuilder sb7 = new StringBuilder();
                        sb7.append("idf");
                        sb7.append(i7);
                        sb7.append("_");
                        sb7.append(profile.this.f20070l);
                        edit.putString(sb7.toString(), split2[0]);
                        StringBuilder sb8 = new StringBuilder();
                        sb8.append(C1248f.TAG);
                        sb8.append(i7);
                        sb8.append("_fcrea_");
                        sb8.append(profile.this.f20070l);
                        edit.putString(sb8.toString(), split2[1]);
                        StringBuilder sb9 = new StringBuilder();
                        sb9.append(C1248f.TAG);
                        sb9.append(i7);
                        sb9.append("_nlikes_");
                        sb9.append(profile.this.f20070l);
                        edit.putString(sb9.toString(), split2[2]);
                        StringBuilder sb10 = new StringBuilder();
                        sb10.append(C1248f.TAG);
                        sb10.append(i7);
                        sb10.append("_liked_");
                        sb10.append(profile.this.f20070l);
                        edit.putString(sb10.toString(), split2[3]);
                        C6061a aVar = new C6061a();
                        aVar.f20116a = split2[0];
                        aVar.f20118c = split2[1];
                        aVar.f20117b = split2[2];
                        aVar.f20119d = split2[3];
                        profile.this.f20077s.add(aVar);
                        i7++;
                    }
                    edit.commit();
                    profile.this.mo21857j();
                    profile.this.f20082x.setOnClickListener(profile.this);
                    profile.this.f20083y.setOnClickListener(profile.this);
                    profile.this.f20084z.setOnClickListener(profile.this);
                    profile.this.f19995A.setOnClickListener(profile.this);
                    profile.this.f20052as = new C6066f();
                    profile.this.f20052as.execute(new String[0]);
                    if (split[i7].equals("S")) {
                        profile.this.findViewById(R.id.fl_masfotos).setVisibility(0);
                    } else {
                        profile.this.f20044ak = true;
                    }
                }
                int i8 = indexOf5 + 1;
                int indexOf6 = str2.indexOf(";", i8);
                if (!profile.this.f20049ap.getString("coments").equals("1") || !profile.this.f20049ap.getBoolean("coments_chat")) {
                    i = 1;
                } else {
                    String[] split3 = str2.substring(i8, indexOf6).split(",");
                    for (int i9 = 0; i9 < 4; i9++) {
                        StringBuilder sb11 = new StringBuilder();
                        sb11.append("idcom");
                        sb11.append(i9);
                        sb11.append("_");
                        sb11.append(profile.this.f20070l);
                        sb11.append("_copia");
                        String sb12 = sb11.toString();
                        SharedPreferences sharedPreferences = profile.this.f20031aJ;
                        StringBuilder sb13 = new StringBuilder();
                        sb13.append("idcom");
                        sb13.append(i9);
                        sb13.append("_");
                        sb13.append(profile.this.f20070l);
                        edit.putString(sb12, sharedPreferences.getString(sb13.toString(), ""));
                        StringBuilder sb14 = new StringBuilder();
                        sb14.append("com");
                        sb14.append(i9);
                        sb14.append("_");
                        sb14.append(profile.this.f20070l);
                        sb14.append("_copia");
                        String sb15 = sb14.toString();
                        SharedPreferences sharedPreferences2 = profile.this.f20031aJ;
                        StringBuilder sb16 = new StringBuilder();
                        sb16.append("com");
                        sb16.append(i9);
                        sb16.append("_");
                        sb16.append(profile.this.f20070l);
                        edit.putString(sb15, sharedPreferences2.getString(sb16.toString(), ""));
                        StringBuilder sb17 = new StringBuilder();
                        sb17.append("com");
                        sb17.append(i9);
                        sb17.append("_fcrea_");
                        sb17.append(profile.this.f20070l);
                        sb17.append("_copia");
                        String sb18 = sb17.toString();
                        SharedPreferences sharedPreferences3 = profile.this.f20031aJ;
                        StringBuilder sb19 = new StringBuilder();
                        sb19.append("com");
                        sb19.append(i9);
                        sb19.append("_fcrea_");
                        sb19.append(profile.this.f20070l);
                        edit.putString(sb18, sharedPreferences3.getString(sb19.toString(), ""));
                        StringBuilder sb20 = new StringBuilder();
                        sb20.append("com");
                        sb20.append(i9);
                        sb20.append("_idusucrea_");
                        sb20.append(profile.this.f20070l);
                        sb20.append("_copia");
                        String sb21 = sb20.toString();
                        SharedPreferences sharedPreferences4 = profile.this.f20031aJ;
                        StringBuilder sb22 = new StringBuilder();
                        sb22.append("com");
                        sb22.append(i9);
                        sb22.append("_idusucrea_");
                        sb22.append(profile.this.f20070l);
                        edit.putString(sb21, sharedPreferences4.getString(sb22.toString(), ""));
                        StringBuilder sb23 = new StringBuilder();
                        sb23.append("com");
                        sb23.append(i9);
                        sb23.append("_nombre_");
                        sb23.append(profile.this.f20070l);
                        sb23.append("_copia");
                        String sb24 = sb23.toString();
                        SharedPreferences sharedPreferences5 = profile.this.f20031aJ;
                        StringBuilder sb25 = new StringBuilder();
                        sb25.append("com");
                        sb25.append(i9);
                        sb25.append("_nombre_");
                        sb25.append(profile.this.f20070l);
                        edit.putString(sb24, sharedPreferences5.getString(sb25.toString(), ""));
                        StringBuilder sb26 = new StringBuilder();
                        sb26.append("com");
                        sb26.append(i9);
                        sb26.append("_vfoto_");
                        sb26.append(profile.this.f20070l);
                        sb26.append("_copia");
                        String sb27 = sb26.toString();
                        SharedPreferences sharedPreferences6 = profile.this.f20031aJ;
                        StringBuilder sb28 = new StringBuilder();
                        sb28.append("com");
                        sb28.append(i9);
                        sb28.append("_vfoto_");
                        sb28.append(profile.this.f20070l);
                        edit.putString(sb27, sharedPreferences6.getString(sb28.toString(), "0"));
                        StringBuilder sb29 = new StringBuilder();
                        sb29.append("com");
                        sb29.append(i9);
                        sb29.append("_privados_");
                        sb29.append(profile.this.f20070l);
                        sb29.append("_copia");
                        String sb30 = sb29.toString();
                        SharedPreferences sharedPreferences7 = profile.this.f20031aJ;
                        StringBuilder sb31 = new StringBuilder();
                        sb31.append("com");
                        sb31.append(i9);
                        sb31.append("_privados_");
                        sb31.append(profile.this.f20070l);
                        edit.putString(sb30, sharedPreferences7.getString(sb31.toString(), "0"));
                        StringBuilder sb32 = new StringBuilder();
                        sb32.append("com");
                        sb32.append(i9);
                        sb32.append("_fnacd_");
                        sb32.append(profile.this.f20070l);
                        sb32.append("_copia");
                        String sb33 = sb32.toString();
                        SharedPreferences sharedPreferences8 = profile.this.f20031aJ;
                        StringBuilder sb34 = new StringBuilder();
                        sb34.append("com");
                        sb34.append(i9);
                        sb34.append("_fnacd_");
                        sb34.append(profile.this.f20070l);
                        edit.putString(sb33, sharedPreferences8.getString(sb34.toString(), "0"));
                        StringBuilder sb35 = new StringBuilder();
                        sb35.append("com");
                        sb35.append(i9);
                        sb35.append("_fnacm_");
                        sb35.append(profile.this.f20070l);
                        sb35.append("_copia");
                        String sb36 = sb35.toString();
                        SharedPreferences sharedPreferences9 = profile.this.f20031aJ;
                        StringBuilder sb37 = new StringBuilder();
                        sb37.append("com");
                        sb37.append(i9);
                        sb37.append("_fnacm_");
                        sb37.append(profile.this.f20070l);
                        edit.putString(sb36, sharedPreferences9.getString(sb37.toString(), "0"));
                        StringBuilder sb38 = new StringBuilder();
                        sb38.append("com");
                        sb38.append(i9);
                        sb38.append("_fnaca_");
                        sb38.append(profile.this.f20070l);
                        sb38.append("_copia");
                        String sb39 = sb38.toString();
                        SharedPreferences sharedPreferences10 = profile.this.f20031aJ;
                        StringBuilder sb40 = new StringBuilder();
                        sb40.append("com");
                        sb40.append(i9);
                        sb40.append("_fnaca_");
                        sb40.append(profile.this.f20070l);
                        edit.putString(sb39, sharedPreferences10.getString(sb40.toString(), "0"));
                        StringBuilder sb41 = new StringBuilder();
                        sb41.append("com");
                        sb41.append(i9);
                        sb41.append("_sexo_");
                        sb41.append(profile.this.f20070l);
                        sb41.append("_copia");
                        String sb42 = sb41.toString();
                        SharedPreferences sharedPreferences11 = profile.this.f20031aJ;
                        StringBuilder sb43 = new StringBuilder();
                        sb43.append("com");
                        sb43.append(i9);
                        sb43.append("_sexo_");
                        sb43.append(profile.this.f20070l);
                        edit.putString(sb42, sharedPreferences11.getString(sb43.toString(), "0"));
                        StringBuilder sb44 = new StringBuilder();
                        sb44.append("com");
                        sb44.append(i9);
                        sb44.append("_coments_");
                        sb44.append(profile.this.f20070l);
                        sb44.append("_copia");
                        String sb45 = sb44.toString();
                        SharedPreferences sharedPreferences12 = profile.this.f20031aJ;
                        StringBuilder sb46 = new StringBuilder();
                        sb46.append("com");
                        sb46.append(i9);
                        sb46.append("_coments_");
                        sb46.append(profile.this.f20070l);
                        edit.putString(sb45, sharedPreferences12.getString(sb46.toString(), "0"));
                        StringBuilder sb47 = new StringBuilder();
                        sb47.append("idcom");
                        sb47.append(i9);
                        sb47.append("_");
                        sb47.append(profile.this.f20070l);
                        edit.remove(sb47.toString());
                        StringBuilder sb48 = new StringBuilder();
                        sb48.append("com");
                        sb48.append(i9);
                        sb48.append("_");
                        sb48.append(profile.this.f20070l);
                        edit.remove(sb48.toString());
                        StringBuilder sb49 = new StringBuilder();
                        sb49.append("com");
                        sb49.append(i9);
                        sb49.append("_fcrea_");
                        sb49.append(profile.this.f20070l);
                        edit.remove(sb49.toString());
                        StringBuilder sb50 = new StringBuilder();
                        sb50.append("com");
                        sb50.append(i9);
                        sb50.append("_idusucrea_");
                        sb50.append(profile.this.f20070l);
                        edit.remove(sb50.toString());
                        StringBuilder sb51 = new StringBuilder();
                        sb51.append("com");
                        sb51.append(i9);
                        sb51.append("_nombre_");
                        sb51.append(profile.this.f20070l);
                        edit.remove(sb51.toString());
                        StringBuilder sb52 = new StringBuilder();
                        sb52.append("com");
                        sb52.append(i9);
                        sb52.append("_vfoto_");
                        sb52.append(profile.this.f20070l);
                        edit.remove(sb52.toString());
                        StringBuilder sb53 = new StringBuilder();
                        sb53.append("com");
                        sb53.append(i9);
                        sb53.append("_privados_");
                        sb53.append(profile.this.f20070l);
                        edit.remove(sb53.toString());
                        StringBuilder sb54 = new StringBuilder();
                        sb54.append("com");
                        sb54.append(i9);
                        sb54.append("_fnacd_");
                        sb54.append(profile.this.f20070l);
                        edit.remove(sb54.toString());
                        StringBuilder sb55 = new StringBuilder();
                        sb55.append("com");
                        sb55.append(i9);
                        sb55.append("_fnacm_");
                        sb55.append(profile.this.f20070l);
                        edit.remove(sb55.toString());
                        StringBuilder sb56 = new StringBuilder();
                        sb56.append("com");
                        sb56.append(i9);
                        sb56.append("_fnaca_");
                        sb56.append(profile.this.f20070l);
                        edit.remove(sb56.toString());
                        StringBuilder sb57 = new StringBuilder();
                        sb57.append("com");
                        sb57.append(i9);
                        sb57.append("_sexo_");
                        sb57.append(profile.this.f20070l);
                        edit.remove(sb57.toString());
                        StringBuilder sb58 = new StringBuilder();
                        sb58.append("com");
                        sb58.append(i9);
                        sb58.append("_coments_");
                        sb58.append(profile.this.f20070l);
                        edit.remove(sb58.toString());
                    }
                    edit.commit();
                    int i10 = 0;
                    while (!split3[i10].equals("S") && !split3[i10].equals("N")) {
                        String[] split4 = split3[i10].split("-");
                        if (split4.length > i3) {
                            StringBuilder sb59 = new StringBuilder();
                            sb59.append("idcom");
                            sb59.append(i10);
                            sb59.append("_");
                            sb59.append(profile.this.f20070l);
                            edit.putString(sb59.toString(), split4[c2]);
                            StringBuilder sb60 = new StringBuilder();
                            sb60.append("com");
                            sb60.append(i10);
                            sb60.append("_");
                            sb60.append(profile.this.f20070l);
                            edit.putString(sb60.toString(), split4[i3].replace("@X@", "-").replace("@Y@", ","));
                            StringBuilder sb61 = new StringBuilder();
                            sb61.append("com");
                            sb61.append(i10);
                            sb61.append("_fcrea_");
                            sb61.append(profile.this.f20070l);
                            edit.putString(sb61.toString(), split4[2]);
                            StringBuilder sb62 = new StringBuilder();
                            sb62.append("com");
                            sb62.append(i10);
                            sb62.append("_idusucrea_");
                            sb62.append(profile.this.f20070l);
                            edit.putString(sb62.toString(), split4[3]);
                            StringBuilder sb63 = new StringBuilder();
                            sb63.append("com");
                            sb63.append(i10);
                            sb63.append("_nombre_");
                            sb63.append(profile.this.f20070l);
                            edit.putString(sb63.toString(), split4[4]);
                            StringBuilder sb64 = new StringBuilder();
                            sb64.append("com");
                            sb64.append(i10);
                            sb64.append("_vfoto_");
                            sb64.append(profile.this.f20070l);
                            edit.putString(sb64.toString(), split4[5]);
                            StringBuilder sb65 = new StringBuilder();
                            sb65.append("com");
                            sb65.append(i10);
                            sb65.append("_privados_");
                            sb65.append(profile.this.f20070l);
                            edit.putString(sb65.toString(), split4[6]);
                            StringBuilder sb66 = new StringBuilder();
                            sb66.append("com");
                            sb66.append(i10);
                            sb66.append("_fnacd_");
                            sb66.append(profile.this.f20070l);
                            edit.putString(sb66.toString(), split4[7]);
                            StringBuilder sb67 = new StringBuilder();
                            sb67.append("com");
                            sb67.append(i10);
                            sb67.append("_fnacm_");
                            sb67.append(profile.this.f20070l);
                            edit.putString(sb67.toString(), split4[c]);
                            StringBuilder sb68 = new StringBuilder();
                            sb68.append("com");
                            sb68.append(i10);
                            sb68.append("_fnaca_");
                            sb68.append(profile.this.f20070l);
                            edit.putString(sb68.toString(), split4[9]);
                            StringBuilder sb69 = new StringBuilder();
                            sb69.append("com");
                            sb69.append(i10);
                            sb69.append("_sexo_");
                            sb69.append(profile.this.f20070l);
                            edit.putString(sb69.toString(), split4[10]);
                            StringBuilder sb70 = new StringBuilder();
                            sb70.append("com");
                            sb70.append(i10);
                            sb70.append("_coments_");
                            sb70.append(profile.this.f20070l);
                            edit.putString(sb70.toString(), split4[11]);
                        } else {
                            int i11 = 0;
                            while (true) {
                                if (i11 >= 5) {
                                    z = false;
                                    break;
                                }
                                SharedPreferences sharedPreferences13 = profile.this.f20031aJ;
                                StringBuilder sb71 = new StringBuilder();
                                sb71.append("idcom");
                                sb71.append(i11);
                                sb71.append("_");
                                sb71.append(profile.this.f20070l);
                                sb71.append("_copia");
                                if (sharedPreferences13.getString(sb71.toString(), "").equals(split4[0])) {
                                    z = true;
                                    break;
                                }
                                i11++;
                            }
                            if (z) {
                                StringBuilder sb72 = new StringBuilder();
                                sb72.append("idcom");
                                sb72.append(i10);
                                sb72.append("_");
                                sb72.append(profile.this.f20070l);
                                String sb73 = sb72.toString();
                                SharedPreferences sharedPreferences14 = profile.this.f20031aJ;
                                StringBuilder sb74 = new StringBuilder();
                                sb74.append("idcom");
                                sb74.append(i11);
                                sb74.append("_");
                                sb74.append(profile.this.f20070l);
                                sb74.append("_copia");
                                edit.putString(sb73, sharedPreferences14.getString(sb74.toString(), ""));
                                StringBuilder sb75 = new StringBuilder();
                                sb75.append("com");
                                sb75.append(i10);
                                sb75.append("_");
                                sb75.append(profile.this.f20070l);
                                String sb76 = sb75.toString();
                                SharedPreferences sharedPreferences15 = profile.this.f20031aJ;
                                StringBuilder sb77 = new StringBuilder();
                                sb77.append("com");
                                sb77.append(i11);
                                sb77.append("_");
                                sb77.append(profile.this.f20070l);
                                sb77.append("_copia");
                                edit.putString(sb76, sharedPreferences15.getString(sb77.toString(), ""));
                                StringBuilder sb78 = new StringBuilder();
                                sb78.append("com");
                                sb78.append(i10);
                                sb78.append("_fcrea_");
                                sb78.append(profile.this.f20070l);
                                String sb79 = sb78.toString();
                                SharedPreferences sharedPreferences16 = profile.this.f20031aJ;
                                StringBuilder sb80 = new StringBuilder();
                                sb80.append("com");
                                sb80.append(i11);
                                sb80.append("_fcrea_");
                                sb80.append(profile.this.f20070l);
                                sb80.append("_copia");
                                edit.putString(sb79, sharedPreferences16.getString(sb80.toString(), ""));
                                StringBuilder sb81 = new StringBuilder();
                                sb81.append("com");
                                sb81.append(i10);
                                sb81.append("_idusucrea_");
                                sb81.append(profile.this.f20070l);
                                String sb82 = sb81.toString();
                                SharedPreferences sharedPreferences17 = profile.this.f20031aJ;
                                StringBuilder sb83 = new StringBuilder();
                                sb83.append("com");
                                sb83.append(i11);
                                sb83.append("_idusucrea_");
                                sb83.append(profile.this.f20070l);
                                sb83.append("_copia");
                                edit.putString(sb82, sharedPreferences17.getString(sb83.toString(), ""));
                                StringBuilder sb84 = new StringBuilder();
                                sb84.append("com");
                                sb84.append(i10);
                                sb84.append("_nombre_");
                                sb84.append(profile.this.f20070l);
                                String sb85 = sb84.toString();
                                SharedPreferences sharedPreferences18 = profile.this.f20031aJ;
                                StringBuilder sb86 = new StringBuilder();
                                sb86.append("com");
                                sb86.append(i11);
                                sb86.append("_nombre_");
                                sb86.append(profile.this.f20070l);
                                sb86.append("_copia");
                                edit.putString(sb85, sharedPreferences18.getString(sb86.toString(), ""));
                                StringBuilder sb87 = new StringBuilder();
                                sb87.append("com");
                                sb87.append(i10);
                                sb87.append("_vfoto_");
                                sb87.append(profile.this.f20070l);
                                String sb88 = sb87.toString();
                                SharedPreferences sharedPreferences19 = profile.this.f20031aJ;
                                StringBuilder sb89 = new StringBuilder();
                                sb89.append("com");
                                sb89.append(i11);
                                sb89.append("_vfoto_");
                                sb89.append(profile.this.f20070l);
                                sb89.append("_copia");
                                edit.putString(sb88, sharedPreferences19.getString(sb89.toString(), "0"));
                                StringBuilder sb90 = new StringBuilder();
                                sb90.append("com");
                                sb90.append(i10);
                                sb90.append("_privados_");
                                sb90.append(profile.this.f20070l);
                                String sb91 = sb90.toString();
                                SharedPreferences sharedPreferences20 = profile.this.f20031aJ;
                                StringBuilder sb92 = new StringBuilder();
                                sb92.append("com");
                                sb92.append(i11);
                                sb92.append("_privados_");
                                sb92.append(profile.this.f20070l);
                                sb92.append("_copia");
                                edit.putString(sb91, sharedPreferences20.getString(sb92.toString(), "0"));
                                StringBuilder sb93 = new StringBuilder();
                                sb93.append("com");
                                sb93.append(i10);
                                sb93.append("_fnacd_");
                                sb93.append(profile.this.f20070l);
                                String sb94 = sb93.toString();
                                SharedPreferences sharedPreferences21 = profile.this.f20031aJ;
                                StringBuilder sb95 = new StringBuilder();
                                sb95.append("com");
                                sb95.append(i11);
                                sb95.append("_fnacd_");
                                sb95.append(profile.this.f20070l);
                                sb95.append("_copia");
                                edit.putString(sb94, sharedPreferences21.getString(sb95.toString(), "0"));
                                StringBuilder sb96 = new StringBuilder();
                                sb96.append("com");
                                sb96.append(i10);
                                sb96.append("_fnacm_");
                                sb96.append(profile.this.f20070l);
                                String sb97 = sb96.toString();
                                SharedPreferences sharedPreferences22 = profile.this.f20031aJ;
                                StringBuilder sb98 = new StringBuilder();
                                sb98.append("com");
                                sb98.append(i11);
                                sb98.append("_fnacm_");
                                sb98.append(profile.this.f20070l);
                                sb98.append("_copia");
                                edit.putString(sb97, sharedPreferences22.getString(sb98.toString(), "0"));
                                StringBuilder sb99 = new StringBuilder();
                                sb99.append("com");
                                sb99.append(i10);
                                sb99.append("_fnaca_");
                                sb99.append(profile.this.f20070l);
                                String sb100 = sb99.toString();
                                SharedPreferences sharedPreferences23 = profile.this.f20031aJ;
                                StringBuilder sb101 = new StringBuilder();
                                sb101.append("com");
                                sb101.append(i11);
                                sb101.append("_fnaca_");
                                sb101.append(profile.this.f20070l);
                                sb101.append("_copia");
                                edit.putString(sb100, sharedPreferences23.getString(sb101.toString(), "0"));
                                StringBuilder sb102 = new StringBuilder();
                                sb102.append("com");
                                sb102.append(i10);
                                sb102.append("_sexo_");
                                sb102.append(profile.this.f20070l);
                                String sb103 = sb102.toString();
                                SharedPreferences sharedPreferences24 = profile.this.f20031aJ;
                                StringBuilder sb104 = new StringBuilder();
                                sb104.append("com");
                                sb104.append(i11);
                                sb104.append("_sexo_");
                                sb104.append(profile.this.f20070l);
                                sb104.append("_copia");
                                edit.putString(sb103, sharedPreferences24.getString(sb104.toString(), "0"));
                                StringBuilder sb105 = new StringBuilder();
                                sb105.append("com");
                                sb105.append(i10);
                                sb105.append("_coments_");
                                sb105.append(profile.this.f20070l);
                                String sb106 = sb105.toString();
                                SharedPreferences sharedPreferences25 = profile.this.f20031aJ;
                                StringBuilder sb107 = new StringBuilder();
                                sb107.append("com");
                                sb107.append(i11);
                                sb107.append("_coments_");
                                sb107.append(profile.this.f20070l);
                                sb107.append("_copia");
                                edit.putString(sb106, sharedPreferences25.getString(sb107.toString(), "0"));
                            }
                        }
                        i10++;
                        c = 8;
                        i3 = 1;
                        c2 = 0;
                    }
                    edit.commit();
                    profile.this.mo21852b(false);
                    new C6067g().execute(new String[0]);
                    if (split3[i10].equals("S")) {
                        profile.this.findViewById(R.id.fl_mascoments).setVisibility(0);
                    }
                    i = 1;
                }
                int i12 = indexOf6 + i;
                int indexOf7 = str2.indexOf(";", i12);
                profile.this.mo21848a(str2.substring(i12, indexOf7).equals("1"));
                int i13 = indexOf7 + i;
                int indexOf8 = str2.indexOf(";", i13);
                String str3 = profile.this.f20070l;
                StringBuilder sb108 = new StringBuilder();
                sb108.append(profile.this.f20060b);
                sb108.append("");
                if (!str3.equals(sb108.toString()) && str2.substring(i13, indexOf8).equals("1")) {
                    profile.this.findViewById(R.id.iv_conectado).setVisibility(0);
                }
                int i14 = indexOf8 + 1;
                int indexOf9 = str2.indexOf(";", i14);
                try {
                    profile.this.f20067i = Integer.parseInt(str2.substring(i14, indexOf9));
                    String str4 = profile.this.f20070l;
                    StringBuilder sb109 = new StringBuilder();
                    sb109.append(profile.this.f20060b);
                    sb109.append("");
                    if (!str4.equals(sb109.toString())) {
                        TextView textView = (TextView) profile.this.findViewById(R.id.tv_likes_n);
                        StringBuilder sb110 = new StringBuilder();
                        sb110.append(profile.this.f20067i);
                        sb110.append("");
                        textView.setText(sb110.toString());
                        profile.this.findViewById(R.id.tv_likes_n).setVisibility(0);
                    } else {
                        TextView textView2 = (TextView) profile.this.findViewById(R.id.tv_likes_self);
                        StringBuilder sb111 = new StringBuilder();
                        sb111.append(profile.this.f20067i);
                        sb111.append("");
                        textView2.setText(sb111.toString());
                        profile.this.findViewById(R.id.tv_likes_self).setVisibility(0);
                    }
                } catch (Exception unused2) {
                }
                int i15 = indexOf9 + 1;
                int indexOf10 = str2.indexOf(";", i15);
                if (profile.this.f20079u.f17932bM) {
                    String[] split5 = str2.substring(i15, indexOf10).split(",");
                    for (int i16 = 0; i16 < 4; i16++) {
                        StringBuilder sb112 = new StringBuilder();
                        sb112.append("idv");
                        sb112.append(i16);
                        sb112.append("_");
                        sb112.append(profile.this.f20070l);
                        edit.remove(sb112.toString());
                        StringBuilder sb113 = new StringBuilder();
                        sb113.append("v");
                        sb113.append(i16);
                        sb113.append("_formato_");
                        sb113.append(profile.this.f20070l);
                        edit.remove(sb113.toString());
                        StringBuilder sb114 = new StringBuilder();
                        sb114.append("v");
                        sb114.append(i16);
                        sb114.append("_fcrea_");
                        sb114.append(profile.this.f20070l);
                        edit.remove(sb114.toString());
                        StringBuilder sb115 = new StringBuilder();
                        sb115.append("v");
                        sb115.append(i16);
                        sb115.append("_nlikes_");
                        sb115.append(profile.this.f20070l);
                        edit.remove(sb115.toString());
                        StringBuilder sb116 = new StringBuilder();
                        sb116.append("v");
                        sb116.append(i16);
                        sb116.append("_liked_");
                        sb116.append(profile.this.f20070l);
                        edit.remove(sb116.toString());
                    }
                    int i17 = 0;
                    while (!split5[i17].equals("S") && !split5[i17].equals("N")) {
                        String[] split6 = split5[i17].split("-");
                        StringBuilder sb117 = new StringBuilder();
                        sb117.append("idv");
                        sb117.append(i17);
                        sb117.append("_");
                        sb117.append(profile.this.f20070l);
                        edit.putString(sb117.toString(), split6[0]);
                        StringBuilder sb118 = new StringBuilder();
                        sb118.append("v");
                        sb118.append(i17);
                        sb118.append("_formato_");
                        sb118.append(profile.this.f20070l);
                        edit.putString(sb118.toString(), split6[1]);
                        StringBuilder sb119 = new StringBuilder();
                        sb119.append("v");
                        sb119.append(i17);
                        sb119.append("_fcrea_");
                        sb119.append(profile.this.f20070l);
                        edit.putString(sb119.toString(), split6[2]);
                        StringBuilder sb120 = new StringBuilder();
                        sb120.append("v");
                        sb120.append(i17);
                        sb120.append("_nlikes_");
                        sb120.append(profile.this.f20070l);
                        edit.putString(sb120.toString(), split6[3]);
                        StringBuilder sb121 = new StringBuilder();
                        sb121.append("v");
                        sb121.append(i17);
                        sb121.append("_liked_");
                        sb121.append(profile.this.f20070l);
                        edit.putString(sb121.toString(), split6[4]);
                        C6062b bVar = new C6062b();
                        bVar.f20122a = split6[0];
                        bVar.f20123b = split6[1];
                        bVar.f20125d = split6[2];
                        bVar.f20124c = split6[3];
                        bVar.f20126e = split6[4];
                        profile.this.f20078t.add(bVar);
                        i17++;
                    }
                    edit.commit();
                    profile.this.mo21859l();
                    profile.this.f19996B.setOnClickListener(profile.this);
                    profile.this.f19997C.setOnClickListener(profile.this);
                    profile.this.f19998D.setOnClickListener(profile.this);
                    profile.this.f19999E.setOnClickListener(profile.this);
                    profile.this.f20053at = new C6070j();
                    profile.this.f20053at.execute(new String[0]);
                    if (split5[i17].equals("S")) {
                        profile.this.findViewById(R.id.fl_masvideos).setVisibility(0);
                        i2 = 1;
                    } else {
                        i2 = 1;
                        profile.this.f20045al = true;
                    }
                    profile.this.f20068j = Integer.parseInt(split5[i17 + i2]);
                }
            }
        }
    }

    /* renamed from: mega.boicot.profile$l */
    private class C6072l extends AsyncTask<String, Void, Byte> {

        /* renamed from: a */
        String f20153a;

        C6072l(String str) {
            this.f20153a = str;
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x009c  */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x00a2  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Byte doInBackground(java.lang.String... r7) {
            /*
                r6 = this;
                r7 = 0
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0095 }
                r0.<init>()     // Catch:{ Exception -> 0x0095 }
                java.lang.String r1 = "http://"
                r0.append(r1)     // Catch:{ Exception -> 0x0095 }
                java.lang.String r1 = mega.boicot.config.f17839g     // Catch:{ Exception -> 0x0095 }
                r0.append(r1)     // Catch:{ Exception -> 0x0095 }
                java.lang.String r1 = "/srv/eliminar_coment.php?idusu="
                r0.append(r1)     // Catch:{ Exception -> 0x0095 }
                mega.boicot.profile r1 = mega.boicot.profile.this     // Catch:{ Exception -> 0x0095 }
                int r1 = r1.f20060b     // Catch:{ Exception -> 0x0095 }
                r0.append(r1)     // Catch:{ Exception -> 0x0095 }
                java.lang.String r1 = "&c="
                r0.append(r1)     // Catch:{ Exception -> 0x0095 }
                mega.boicot.profile r1 = mega.boicot.profile.this     // Catch:{ Exception -> 0x0095 }
                java.lang.String r1 = r1.f20069k     // Catch:{ Exception -> 0x0095 }
                r0.append(r1)     // Catch:{ Exception -> 0x0095 }
                java.lang.String r1 = "&idc="
                r0.append(r1)     // Catch:{ Exception -> 0x0095 }
                java.lang.String r1 = r6.f20153a     // Catch:{ Exception -> 0x0095 }
                r0.append(r1)     // Catch:{ Exception -> 0x0095 }
                java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0095 }
                java.net.URL r1 = new java.net.URL     // Catch:{ Exception -> 0x0095 }
                r1.<init>(r0)     // Catch:{ Exception -> 0x0095 }
                java.net.URLConnection r0 = r1.openConnection()     // Catch:{ Exception -> 0x0095 }
                java.net.HttpURLConnection r0 = (java.net.HttpURLConnection) r0     // Catch:{ Exception -> 0x0095 }
                r7 = 1
                r0.setDoInput(r7)     // Catch:{ Exception -> 0x0091, all -> 0x008c }
                r1 = 10000(0x2710, float:1.4013E-41)
                r0.setConnectTimeout(r1)     // Catch:{ Exception -> 0x0091, all -> 0x008c }
                r0.setReadTimeout(r1)     // Catch:{ Exception -> 0x0091, all -> 0x008c }
                java.lang.String r1 = "User-Agent"
                java.lang.String r2 = "Android Vinebre Software"
                r0.setRequestProperty(r1, r2)     // Catch:{ Exception -> 0x0091, all -> 0x008c }
                java.io.InputStream r1 = r0.getInputStream()     // Catch:{ Exception -> 0x0091, all -> 0x008c }
                java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ Exception -> 0x0091, all -> 0x008c }
                java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x0091, all -> 0x008c }
                r3.<init>(r1)     // Catch:{ Exception -> 0x0091, all -> 0x008c }
                r2.<init>(r3)     // Catch:{ Exception -> 0x0091, all -> 0x008c }
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0091, all -> 0x008c }
                r1.<init>()     // Catch:{ Exception -> 0x0091, all -> 0x008c }
            L_0x0067:
                java.lang.String r3 = r2.readLine()     // Catch:{ Exception -> 0x0091, all -> 0x008c }
                if (r3 == 0) goto L_0x0082
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0091, all -> 0x008c }
                r4.<init>()     // Catch:{ Exception -> 0x0091, all -> 0x008c }
                r4.append(r3)     // Catch:{ Exception -> 0x0091, all -> 0x008c }
                java.lang.String r3 = "\n"
                r4.append(r3)     // Catch:{ Exception -> 0x0091, all -> 0x008c }
                java.lang.String r3 = r4.toString()     // Catch:{ Exception -> 0x0091, all -> 0x008c }
                r1.append(r3)     // Catch:{ Exception -> 0x0091, all -> 0x008c }
                goto L_0x0067
            L_0x0082:
                java.lang.Byte r7 = java.lang.Byte.valueOf(r7)     // Catch:{ Exception -> 0x0091, all -> 0x008c }
                if (r0 == 0) goto L_0x008b
                r0.disconnect()
            L_0x008b:
                return r7
            L_0x008c:
                r7 = move-exception
                r5 = r0
                r0 = r7
                r7 = r5
                goto L_0x00a0
            L_0x0091:
                r7 = r0
                goto L_0x0095
            L_0x0093:
                r0 = move-exception
                goto L_0x00a0
            L_0x0095:
                r0 = 2
                java.lang.Byte r0 = java.lang.Byte.valueOf(r0)     // Catch:{ all -> 0x0093 }
                if (r7 == 0) goto L_0x009f
                r7.disconnect()
            L_0x009f:
                return r0
            L_0x00a0:
                if (r7 == 0) goto L_0x00a5
                r7.disconnect()
            L_0x00a5:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: mega.boicot.profile.C6072l.doInBackground(java.lang.String[]):java.lang.Byte");
        }
    }

    /* renamed from: mega.boicot.profile$m */
    private class C6073m extends AsyncTask<String, Void, String> {

        /* renamed from: a */
        String f20155a;

        public C6073m(String str) {
            this.f20155a = str;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public String doInBackground(String... strArr) {
            try {
                C6529b bVar = new C6529b();
                C6530c.m25865c(bVar, 10000);
                C6530c.m25861a((C6531d) bVar, 20000);
                C6409h hVar = new C6409h(bVar);
                StringBuilder sb = new StringBuilder();
                sb.append("http://");
                sb.append(config.f17839g);
                sb.append("/srv/enviar_coment.php?idusu=");
                sb.append(profile.this.f20060b);
                sb.append("&c=");
                sb.append(profile.this.f20069k);
                sb.append("&idusu_pro=");
                sb.append(profile.this.f20070l);
                C6274e eVar = new C6274e(sb.toString());
                C6370g gVar = new C6370g(C6367d.BROWSER_COMPATIBLE);
                gVar.mo22648a("m", (C6360c) new C6363f(URLEncoder.encode(this.f20155a, C2793C.UTF8_NAME)));
                eVar.mo22444a(gVar);
                eVar.mo22909b("User-Agent", "Android Vinebre Software");
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(hVar.mo22459a((C6276g) eVar).mo22939b().mo22473f(), C2793C.UTF8_NAME));
                StringBuilder sb2 = new StringBuilder();
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        return sb2.toString();
                    }
                    sb2.append(readLine);
                }
            } catch (Exception unused) {
                return "ANDROID:KO";
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void onPostExecute(String str) {
            String str2 = str;
            Builder builder = new Builder(profile.this);
            try {
                profile.this.f20009O.setVisibility(8);
                if (profile.this.f20046am || VERSION.SDK_INT <= 12) {
                    ((TextView) profile.this.findViewById(R.id.et_coment_self)).setTextColor(-16777216);
                } else {
                    ((TextView) profile.this.findViewById(R.id.et_coment_self)).setTextColor(-1);
                }
            } catch (Exception unused) {
            }
            if (str2.indexOf("ANDROID:OK ID:") != -1) {
                int indexOf = str2.indexOf("ANDROID:OK ID:") + 14;
                String substring = str2.substring(indexOf, str2.indexOf("-", indexOf));
                ((EditText) profile.this.findViewById(R.id.et_coment_self)).setText("");
                String c = config.m23851c(new SimpleDateFormat("ddMMyyHHmm").format(new Date()));
                profile profile = profile.this;
                Boolean valueOf = Boolean.valueOf(false);
                Boolean valueOf2 = Boolean.valueOf(true);
                StringBuilder sb = new StringBuilder();
                sb.append(profile.this.f20060b);
                sb.append("");
                profile.mo21847a(valueOf, valueOf2, substring, sb.toString(), profile.this.getResources().getString(R.string.tu), c, this.f20155a, "0", "", "", "", "", "", "");
                Editor edit = profile.this.f20031aJ.edit();
                for (int i = 3; i > 0; i--) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("idcom");
                    sb2.append(i);
                    sb2.append("_");
                    sb2.append(profile.this.f20070l);
                    String sb3 = sb2.toString();
                    SharedPreferences sharedPreferences = profile.this.f20031aJ;
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("idcom");
                    int i2 = i - 1;
                    sb4.append(i2);
                    sb4.append("_");
                    sb4.append(profile.this.f20070l);
                    edit.putString(sb3, sharedPreferences.getString(sb4.toString(), ""));
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append("com");
                    sb5.append(i);
                    sb5.append("_");
                    sb5.append(profile.this.f20070l);
                    String sb6 = sb5.toString();
                    SharedPreferences sharedPreferences2 = profile.this.f20031aJ;
                    StringBuilder sb7 = new StringBuilder();
                    sb7.append("com");
                    sb7.append(i2);
                    sb7.append("_");
                    sb7.append(profile.this.f20070l);
                    edit.putString(sb6, sharedPreferences2.getString(sb7.toString(), ""));
                    StringBuilder sb8 = new StringBuilder();
                    sb8.append("com");
                    sb8.append(i);
                    sb8.append("_fcrea_");
                    sb8.append(profile.this.f20070l);
                    String sb9 = sb8.toString();
                    SharedPreferences sharedPreferences3 = profile.this.f20031aJ;
                    StringBuilder sb10 = new StringBuilder();
                    sb10.append("com");
                    sb10.append(i2);
                    sb10.append("_fcrea_");
                    sb10.append(profile.this.f20070l);
                    edit.putString(sb9, sharedPreferences3.getString(sb10.toString(), ""));
                    StringBuilder sb11 = new StringBuilder();
                    sb11.append("com");
                    sb11.append(i);
                    sb11.append("_idusucrea_");
                    sb11.append(profile.this.f20070l);
                    String sb12 = sb11.toString();
                    SharedPreferences sharedPreferences4 = profile.this.f20031aJ;
                    StringBuilder sb13 = new StringBuilder();
                    sb13.append("com");
                    sb13.append(i2);
                    sb13.append("_idusucrea_");
                    sb13.append(profile.this.f20070l);
                    edit.putString(sb12, sharedPreferences4.getString(sb13.toString(), ""));
                    StringBuilder sb14 = new StringBuilder();
                    sb14.append("com");
                    sb14.append(i);
                    sb14.append("_nombre_");
                    sb14.append(profile.this.f20070l);
                    String sb15 = sb14.toString();
                    SharedPreferences sharedPreferences5 = profile.this.f20031aJ;
                    StringBuilder sb16 = new StringBuilder();
                    sb16.append("com");
                    sb16.append(i2);
                    sb16.append("_nombre_");
                    sb16.append(profile.this.f20070l);
                    edit.putString(sb15, sharedPreferences5.getString(sb16.toString(), ""));
                    StringBuilder sb17 = new StringBuilder();
                    sb17.append("com");
                    sb17.append(i);
                    sb17.append("_vfoto_");
                    sb17.append(profile.this.f20070l);
                    String sb18 = sb17.toString();
                    SharedPreferences sharedPreferences6 = profile.this.f20031aJ;
                    StringBuilder sb19 = new StringBuilder();
                    sb19.append("com");
                    sb19.append(i2);
                    sb19.append("_vfoto_");
                    sb19.append(profile.this.f20070l);
                    edit.putString(sb18, sharedPreferences6.getString(sb19.toString(), "0"));
                    StringBuilder sb20 = new StringBuilder();
                    sb20.append("com");
                    sb20.append(i);
                    sb20.append("_privados_");
                    sb20.append(profile.this.f20070l);
                    String sb21 = sb20.toString();
                    SharedPreferences sharedPreferences7 = profile.this.f20031aJ;
                    StringBuilder sb22 = new StringBuilder();
                    sb22.append("com");
                    sb22.append(i2);
                    sb22.append("_privados_");
                    sb22.append(profile.this.f20070l);
                    edit.putString(sb21, sharedPreferences7.getString(sb22.toString(), "0"));
                    StringBuilder sb23 = new StringBuilder();
                    sb23.append("com");
                    sb23.append(i);
                    sb23.append("_fnacd_");
                    sb23.append(profile.this.f20070l);
                    String sb24 = sb23.toString();
                    SharedPreferences sharedPreferences8 = profile.this.f20031aJ;
                    StringBuilder sb25 = new StringBuilder();
                    sb25.append("com");
                    sb25.append(i2);
                    sb25.append("_fnacd_");
                    sb25.append(profile.this.f20070l);
                    edit.putString(sb24, sharedPreferences8.getString(sb25.toString(), "0"));
                    StringBuilder sb26 = new StringBuilder();
                    sb26.append("com");
                    sb26.append(i);
                    sb26.append("_fnacm_");
                    sb26.append(profile.this.f20070l);
                    String sb27 = sb26.toString();
                    SharedPreferences sharedPreferences9 = profile.this.f20031aJ;
                    StringBuilder sb28 = new StringBuilder();
                    sb28.append("com");
                    sb28.append(i2);
                    sb28.append("_fnacm_");
                    sb28.append(profile.this.f20070l);
                    edit.putString(sb27, sharedPreferences9.getString(sb28.toString(), "0"));
                    StringBuilder sb29 = new StringBuilder();
                    sb29.append("com");
                    sb29.append(i);
                    sb29.append("_fnaca_");
                    sb29.append(profile.this.f20070l);
                    String sb30 = sb29.toString();
                    SharedPreferences sharedPreferences10 = profile.this.f20031aJ;
                    StringBuilder sb31 = new StringBuilder();
                    sb31.append("com");
                    sb31.append(i2);
                    sb31.append("_fnaca_");
                    sb31.append(profile.this.f20070l);
                    edit.putString(sb30, sharedPreferences10.getString(sb31.toString(), "0"));
                    StringBuilder sb32 = new StringBuilder();
                    sb32.append("com");
                    sb32.append(i);
                    sb32.append("_sexo_");
                    sb32.append(profile.this.f20070l);
                    String sb33 = sb32.toString();
                    SharedPreferences sharedPreferences11 = profile.this.f20031aJ;
                    StringBuilder sb34 = new StringBuilder();
                    sb34.append("com");
                    sb34.append(i2);
                    sb34.append("_sexo_");
                    sb34.append(profile.this.f20070l);
                    edit.putString(sb33, sharedPreferences11.getString(sb34.toString(), "0"));
                    StringBuilder sb35 = new StringBuilder();
                    sb35.append("com");
                    sb35.append(i);
                    sb35.append("_coments_");
                    sb35.append(profile.this.f20070l);
                    String sb36 = sb35.toString();
                    SharedPreferences sharedPreferences12 = profile.this.f20031aJ;
                    StringBuilder sb37 = new StringBuilder();
                    sb37.append("com");
                    sb37.append(i2);
                    sb37.append("_coments_");
                    sb37.append(profile.this.f20070l);
                    edit.putString(sb36, sharedPreferences12.getString(sb37.toString(), "0"));
                }
                StringBuilder sb38 = new StringBuilder();
                sb38.append("idcom0_");
                sb38.append(profile.this.f20070l);
                edit.putString(sb38.toString(), substring);
                StringBuilder sb39 = new StringBuilder();
                sb39.append("com0_");
                sb39.append(profile.this.f20070l);
                edit.putString(sb39.toString(), this.f20155a);
                StringBuilder sb40 = new StringBuilder();
                sb40.append("com0_fcrea_");
                sb40.append(profile.this.f20070l);
                edit.putString(sb40.toString(), c);
                StringBuilder sb41 = new StringBuilder();
                sb41.append("com0_idusucrea_");
                sb41.append(profile.this.f20070l);
                String sb42 = sb41.toString();
                StringBuilder sb43 = new StringBuilder();
                sb43.append(profile.this.f20060b);
                sb43.append("");
                edit.putString(sb42, sb43.toString());
                StringBuilder sb44 = new StringBuilder();
                sb44.append("com0_nombre_");
                sb44.append(profile.this.f20070l);
                edit.putString(sb44.toString(), profile.this.getResources().getString(R.string.tu));
                StringBuilder sb45 = new StringBuilder();
                sb45.append("com0_vfoto_");
                sb45.append(profile.this.f20070l);
                edit.putString(sb45.toString(), "0");
                edit.commit();
                try {
                    profile.this.findViewById(R.id.sc_pro).post(new Runnable() {
                        public void run() {
                            try {
                                ((ScrollView) profile.this.findViewById(R.id.sc_pro)).smoothScrollTo(0, profile.this.findViewById(R.id.tv_coments).getTop());
                            } catch (Exception unused) {
                            }
                        }
                    });
                } catch (Exception unused2) {
                }
            } else if (str2.indexOf("ANDROID:KO MOTIVO:NOADMITE") != -1) {
                final AlertDialog create = builder.setCancelable(false).setPositiveButton(profile.this.getString(R.string.aceptar), null).setMessage(R.string.noadmitecoments).create();
                if (!profile.this.f20074p.equals("")) {
                    create.setOnShowListener(new OnShowListener() {
                        public void onShow(DialogInterface dialogInterface) {
                            Button button = create.getButton(-1);
                            StringBuilder sb = new StringBuilder();
                            sb.append("#");
                            sb.append(profile.this.f20074p);
                            button.setTextColor(Color.parseColor(sb.toString()));
                        }
                    });
                }
                create.show();
                ((TextView) create.findViewById(16908299)).setTypeface(Typeface.MONOSPACE);
            } else {
                final AlertDialog create2 = builder.setCancelable(false).setPositiveButton(profile.this.getString(R.string.aceptar), null).setMessage(R.string.error_http).create();
                if (!profile.this.f20074p.equals("")) {
                    create2.setOnShowListener(new OnShowListener() {
                        public void onShow(DialogInterface dialogInterface) {
                            Button button = create2.getButton(-1);
                            StringBuilder sb = new StringBuilder();
                            sb.append("#");
                            sb.append(profile.this.f20074p);
                            button.setTextColor(Color.parseColor(sb.toString()));
                        }
                    });
                }
                create2.show();
                ((TextView) create2.findViewById(16908299)).setTypeface(Typeface.MONOSPACE);
            }
        }
    }

    /* renamed from: mega.boicot.profile$n */
    private class C6077n extends AsyncTask<String, Void, String> {

        /* renamed from: a */
        AlertDialog f20162a;

        private C6077n() {
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
            this.f20162a = new Builder(profile.this).setCancelable(false).setMessage(R.string.subiendo).create();
            this.f20162a.show();
            try {
                ((TextView) this.f20162a.findViewById(16908299)).setTypeface(Typeface.MONOSPACE);
            } catch (Exception unused) {
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public String doInBackground(String... strArr) {
            Bitmap bitmap;
            try {
                C6529b bVar = new C6529b();
                C6530c.m25865c(bVar, 10000);
                C6530c.m25861a((C6531d) bVar, 60000);
                C6409h hVar = new C6409h(bVar);
                StringBuilder sb = new StringBuilder();
                sb.append("http://");
                sb.append(config.f17839g);
                sb.append("/srv/guardar_fotogal.php?idusu=");
                sb.append(profile.this.f20060b);
                sb.append("&c=");
                sb.append(profile.this.f20031aJ.getString("cod", ""));
                C6274e eVar = new C6274e(sb.toString());
                C6370g gVar = new C6370g(C6367d.BROWSER_COMPATIBLE);
                File a = profile.this.f20079u.mo20759a((Context) profile.this, "fperfilgal_temp");
                Options options = new Options();
                boolean z = true;
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeFile(a.getPath(), options);
                int i = options.outWidth;
                int i2 = options.outWidth;
                int i3 = options.outHeight;
                if (i2 > 600 || i3 > 600) {
                    z = false;
                }
                if (!z) {
                    config config = profile.this.f20079u;
                    int round = Math.round(((float) i2) / ((float) config.m23824a(i2, i3, 600, 600)));
                    Options options2 = new Options();
                    options2.inSampleSize = round;
                    bitmap = BitmapFactory.decodeFile(a.getPath(), options2);
                } else {
                    bitmap = Media.getBitmap(profile.this.getContentResolver(), Uri.fromFile(a));
                }
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                bitmap.compress(CompressFormat.JPEG, 90, byteArrayOutputStream);
                gVar.mo22648a("foto1", (C6360c) new C6359b(byteArrayOutputStream.toByteArray(), "temporal.jpg"));
                eVar.mo22444a(gVar);
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
                return sb2.indexOf("ANDROID:OK") != -1 ? sb2.toString() : "";
            } catch (Exception unused) {
                return "";
            } catch (OutOfMemoryError unused2) {
                return "";
            }
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x0261  */
        /* JADX WARNING: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onPostExecute(java.lang.String r10) {
            /*
                r9 = this;
                android.app.AlertDialog r0 = r9.f20162a
                if (r0 == 0) goto L_0x0011
                android.app.AlertDialog r0 = r9.f20162a
                boolean r0 = r0.isShowing()
                if (r0 == 0) goto L_0x0011
                android.app.AlertDialog r0 = r9.f20162a
                r0.cancel()
            L_0x0011:
                java.lang.String r0 = "ANDROID:OK ID:"
                int r0 = r10.indexOf(r0)
                r1 = 0
                r2 = -1
                r3 = 0
                if (r0 == r2) goto L_0x025e
                int r0 = r0 + 14
                java.lang.String r4 = "-"
                int r4 = r10.indexOf(r4, r0)
                if (r4 == r2) goto L_0x025e
                mega.boicot.profile$a r2 = new mega.boicot.profile$a
                mega.boicot.profile r5 = mega.boicot.profile.this
                r2.<init>()
                java.lang.String r10 = r10.substring(r0, r4)
                r2.f20116a = r10
                java.lang.String r10 = "ddMMyyHHmm"
                java.util.Date r0 = new java.util.Date
                r0.<init>()
                java.lang.CharSequence r10 = android.text.format.DateFormat.format(r10, r0)
                java.lang.String r10 = r10.toString()
                r2.f20118c = r10
                java.lang.String r10 = "0"
                r2.f20117b = r10
                java.lang.String r10 = "0"
                r2.f20119d = r10
                mega.boicot.profile r10 = mega.boicot.profile.this
                java.util.ArrayList<mega.boicot.profile$a> r10 = r10.f20077s
                r10.add(r3, r2)
                mega.boicot.profile r10 = mega.boicot.profile.this
                r10.f20062d = r3
                mega.boicot.profile r10 = mega.boicot.profile.this     // Catch:{ Exception -> 0x00bf }
                mega.boicot.config r10 = r10.f20079u     // Catch:{ Exception -> 0x00bf }
                mega.boicot.profile r10 = mega.boicot.profile.this     // Catch:{ Exception -> 0x00bf }
                mega.boicot.config r10 = r10.f20079u     // Catch:{ Exception -> 0x00bf }
                mega.boicot.profile r0 = mega.boicot.profile.this     // Catch:{ Exception -> 0x00bf }
                java.lang.String r4 = "fperfilgal_temp"
                java.io.File r10 = r10.mo20759a(r0, r4)     // Catch:{ Exception -> 0x00bf }
                java.io.File r0 = new java.io.File     // Catch:{ Exception -> 0x00bf }
                mega.boicot.profile r4 = mega.boicot.profile.this     // Catch:{ Exception -> 0x00bf }
                java.io.File r4 = r4.f20080v     // Catch:{ Exception -> 0x00bf }
                java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00bf }
                r5.<init>()     // Catch:{ Exception -> 0x00bf }
                java.lang.String r6 = "fperfilgal_"
                r5.append(r6)     // Catch:{ Exception -> 0x00bf }
                java.lang.String r6 = r2.f20116a     // Catch:{ Exception -> 0x00bf }
                r5.append(r6)     // Catch:{ Exception -> 0x00bf }
                java.lang.String r6 = ".jpg"
                r5.append(r6)     // Catch:{ Exception -> 0x00bf }
                java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x00bf }
                r0.<init>(r4, r5)     // Catch:{ Exception -> 0x00bf }
                mega.boicot.config.m23840a(r10, r0)     // Catch:{ Exception -> 0x00bf }
                mega.boicot.profile r10 = mega.boicot.profile.this     // Catch:{ Exception -> 0x00bf }
                mega.boicot.config r10 = r10.f20079u     // Catch:{ Exception -> 0x00bf }
                mega.boicot.profile r10 = mega.boicot.profile.this     // Catch:{ Exception -> 0x00bf }
                mega.boicot.config r10 = r10.f20079u     // Catch:{ Exception -> 0x00bf }
                mega.boicot.profile r0 = mega.boicot.profile.this     // Catch:{ Exception -> 0x00bf }
                java.lang.String r4 = "fperfilgal_temp"
                java.io.File r10 = r10.mo20759a(r0, r4)     // Catch:{ Exception -> 0x00bf }
                java.io.File r0 = new java.io.File     // Catch:{ Exception -> 0x00bf }
                mega.boicot.profile r4 = mega.boicot.profile.this     // Catch:{ Exception -> 0x00bf }
                java.io.File r4 = r4.f20080v     // Catch:{ Exception -> 0x00bf }
                java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00bf }
                r5.<init>()     // Catch:{ Exception -> 0x00bf }
                java.lang.String r6 = "fperfilgal_"
                r5.append(r6)     // Catch:{ Exception -> 0x00bf }
                java.lang.String r6 = r2.f20116a     // Catch:{ Exception -> 0x00bf }
                r5.append(r6)     // Catch:{ Exception -> 0x00bf }
                java.lang.String r6 = "_g.jpg"
                r5.append(r6)     // Catch:{ Exception -> 0x00bf }
                java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x00bf }
                r0.<init>(r4, r5)     // Catch:{ Exception -> 0x00bf }
                mega.boicot.config.m23840a(r10, r0)     // Catch:{ Exception -> 0x00bf }
            L_0x00bf:
                mega.boicot.profile r10 = mega.boicot.profile.this
                r10.mo21856i()
                mega.boicot.profile r10 = mega.boicot.profile.this
                android.content.SharedPreferences r10 = r10.f20031aJ
                android.content.SharedPreferences$Editor r10 = r10.edit()
                r0 = 3
            L_0x00cd:
                if (r0 <= 0) goto L_0x01f1
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r5 = "idf"
                r4.append(r5)
                r4.append(r0)
                java.lang.String r5 = "_"
                r4.append(r5)
                mega.boicot.profile r5 = mega.boicot.profile.this
                java.lang.String r5 = r5.f20070l
                r4.append(r5)
                java.lang.String r4 = r4.toString()
                mega.boicot.profile r5 = mega.boicot.profile.this
                android.content.SharedPreferences r5 = r5.f20031aJ
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                java.lang.String r7 = "idf"
                r6.append(r7)
                int r7 = r0 + -1
                r6.append(r7)
                java.lang.String r8 = "_"
                r6.append(r8)
                mega.boicot.profile r8 = mega.boicot.profile.this
                java.lang.String r8 = r8.f20070l
                r6.append(r8)
                java.lang.String r6 = r6.toString()
                java.lang.String r8 = ""
                java.lang.String r5 = r5.getString(r6, r8)
                r10.putString(r4, r5)
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r5 = "f"
                r4.append(r5)
                r4.append(r0)
                java.lang.String r5 = "_fcrea_"
                r4.append(r5)
                mega.boicot.profile r5 = mega.boicot.profile.this
                java.lang.String r5 = r5.f20070l
                r4.append(r5)
                java.lang.String r4 = r4.toString()
                mega.boicot.profile r5 = mega.boicot.profile.this
                android.content.SharedPreferences r5 = r5.f20031aJ
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                java.lang.String r8 = "f"
                r6.append(r8)
                r6.append(r7)
                java.lang.String r8 = "_fcrea_"
                r6.append(r8)
                mega.boicot.profile r8 = mega.boicot.profile.this
                java.lang.String r8 = r8.f20070l
                r6.append(r8)
                java.lang.String r6 = r6.toString()
                java.lang.String r8 = ""
                java.lang.String r5 = r5.getString(r6, r8)
                r10.putString(r4, r5)
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r5 = "f"
                r4.append(r5)
                r4.append(r0)
                java.lang.String r5 = "_nlikes_"
                r4.append(r5)
                mega.boicot.profile r5 = mega.boicot.profile.this
                java.lang.String r5 = r5.f20070l
                r4.append(r5)
                java.lang.String r4 = r4.toString()
                mega.boicot.profile r5 = mega.boicot.profile.this
                android.content.SharedPreferences r5 = r5.f20031aJ
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                java.lang.String r8 = "f"
                r6.append(r8)
                r6.append(r7)
                java.lang.String r8 = "_nlikes_"
                r6.append(r8)
                mega.boicot.profile r8 = mega.boicot.profile.this
                java.lang.String r8 = r8.f20070l
                r6.append(r8)
                java.lang.String r6 = r6.toString()
                java.lang.String r8 = ""
                java.lang.String r5 = r5.getString(r6, r8)
                r10.putString(r4, r5)
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r5 = "f"
                r4.append(r5)
                r4.append(r0)
                java.lang.String r5 = "_liked_"
                r4.append(r5)
                mega.boicot.profile r5 = mega.boicot.profile.this
                java.lang.String r5 = r5.f20070l
                r4.append(r5)
                java.lang.String r4 = r4.toString()
                mega.boicot.profile r5 = mega.boicot.profile.this
                android.content.SharedPreferences r5 = r5.f20031aJ
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                java.lang.String r8 = "f"
                r6.append(r8)
                r6.append(r7)
                java.lang.String r7 = "_liked_"
                r6.append(r7)
                mega.boicot.profile r7 = mega.boicot.profile.this
                java.lang.String r7 = r7.f20070l
                r6.append(r7)
                java.lang.String r6 = r6.toString()
                java.lang.String r7 = ""
                java.lang.String r5 = r5.getString(r6, r7)
                r10.putString(r4, r5)
                int r0 = r0 + -1
                goto L_0x00cd
            L_0x01f1:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r4 = "idf0_"
                r0.append(r4)
                mega.boicot.profile r4 = mega.boicot.profile.this
                java.lang.String r4 = r4.f20070l
                r0.append(r4)
                java.lang.String r0 = r0.toString()
                java.lang.String r4 = r2.f20116a
                r10.putString(r0, r4)
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r4 = "f0_fcrea_"
                r0.append(r4)
                mega.boicot.profile r4 = mega.boicot.profile.this
                java.lang.String r4 = r4.f20070l
                r0.append(r4)
                java.lang.String r0 = r0.toString()
                java.lang.String r4 = r2.f20118c
                r10.putString(r0, r4)
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r4 = "f0_nlikes_"
                r0.append(r4)
                mega.boicot.profile r4 = mega.boicot.profile.this
                java.lang.String r4 = r4.f20070l
                r0.append(r4)
                java.lang.String r0 = r0.toString()
                java.lang.String r4 = r2.f20117b
                r10.putString(r0, r4)
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r4 = "f0_liked_"
                r0.append(r4)
                mega.boicot.profile r4 = mega.boicot.profile.this
                java.lang.String r4 = r4.f20070l
                r0.append(r4)
                java.lang.String r0 = r0.toString()
                java.lang.String r2 = r2.f20119d
                r10.putString(r0, r2)
                r10.commit()
                r10 = 1
                goto L_0x025f
            L_0x025e:
                r10 = r3
            L_0x025f:
                if (r10 != 0) goto L_0x02a9
                android.app.AlertDialog$Builder r10 = new android.app.AlertDialog$Builder
                mega.boicot.profile r0 = mega.boicot.profile.this
                r10.<init>(r0)
                android.app.AlertDialog$Builder r10 = r10.setCancelable(r3)
                mega.boicot.profile r0 = mega.boicot.profile.this
                r2 = 2131558439(0x7f0d0027, float:1.8742194E38)
                java.lang.String r0 = r0.getString(r2)
                android.app.AlertDialog$Builder r10 = r10.setPositiveButton(r0, r1)
                r0 = 2131558581(0x7f0d00b5, float:1.8742482E38)
                android.app.AlertDialog$Builder r10 = r10.setMessage(r0)
                android.app.AlertDialog r10 = r10.create()
                mega.boicot.profile r0 = mega.boicot.profile.this
                java.lang.String r0 = r0.f20074p
                java.lang.String r1 = ""
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L_0x0298
                mega.boicot.profile$n$1 r0 = new mega.boicot.profile$n$1
                r0.<init>(r10)
                r10.setOnShowListener(r0)
            L_0x0298:
                r10.show()
                r0 = 16908299(0x102000b, float:2.387726E-38)
                android.view.View r10 = r10.findViewById(r0)     // Catch:{ Exception -> 0x02a9 }
                android.widget.TextView r10 = (android.widget.TextView) r10     // Catch:{ Exception -> 0x02a9 }
                android.graphics.Typeface r0 = android.graphics.Typeface.MONOSPACE     // Catch:{ Exception -> 0x02a9 }
                r10.setTypeface(r0)     // Catch:{ Exception -> 0x02a9 }
            L_0x02a9:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: mega.boicot.profile.C6077n.onPostExecute(java.lang.String):void");
        }
    }

    /* renamed from: mega.boicot.profile$o */
    private class C6079o extends AsyncTask<String, Void, String> {

        /* renamed from: a */
        int f20166a;

        /* renamed from: b */
        String f20167b;

        /* renamed from: c */
        String f20168c;

        public C6079o(int i, String str, String str2) {
            this.f20166a = i;
            this.f20167b = str;
            this.f20168c = str2;
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
            sb.append("/srv/guardar_videogal.php");
            C6274e eVar = new C6274e(sb.toString());
            C6370g gVar = new C6370g();
            try {
                bitmap = Media.getBitmap(profile.this.getContentResolver(), Uri.fromFile(profile.this.f20079u.mo20757a((Context) profile.this, this.f20166a)));
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
                sb2.append(profile.this.f20060b);
                sb2.append("");
                gVar.mo22648a(str2, (C6360c) new C6363f(sb2.toString()));
                gVar.mo22648a("c", (C6360c) new C6363f(profile.this.f20069k));
                gVar.mo22648a("idvideo", (C6360c) new C6363f(this.f20167b));
                gVar.mo22648a("formato", (C6360c) new C6363f(this.f20168c));
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
        /* JADX WARNING: Removed duplicated region for block: B:17:0x028f  */
        /* JADX WARNING: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onPostExecute(java.lang.String r11) {
            /*
                r10 = this;
                mega.boicot.profile r0 = mega.boicot.profile.this     // Catch:{ Exception -> 0x0007 }
                android.app.AlertDialog r0 = r0.f20026aE     // Catch:{ Exception -> 0x0007 }
                r0.cancel()     // Catch:{ Exception -> 0x0007 }
            L_0x0007:
                java.lang.String r0 = "ANDROID:OK ID:"
                int r0 = r11.indexOf(r0)
                r1 = 0
                r2 = 1
                r3 = -1
                r4 = 0
                if (r0 == r3) goto L_0x028c
                int r0 = r0 + 14
                java.lang.String r5 = "-"
                int r5 = r11.indexOf(r5, r0)
                if (r5 == r3) goto L_0x028c
                mega.boicot.profile$b r3 = new mega.boicot.profile$b
                mega.boicot.profile r6 = mega.boicot.profile.this
                r3.<init>()
                java.lang.String r11 = r11.substring(r0, r5)
                r3.f20122a = r11
                java.lang.String r11 = r10.f20168c
                r3.f20123b = r11
                java.lang.String r11 = "ddMMyyHHmm"
                java.util.Date r0 = new java.util.Date
                r0.<init>()
                java.lang.CharSequence r11 = android.text.format.DateFormat.format(r11, r0)
                java.lang.String r11 = r11.toString()
                r3.f20125d = r11
                java.lang.String r11 = "0"
                r3.f20124c = r11
                java.lang.String r11 = "0"
                r3.f20126e = r11
                mega.boicot.profile r11 = mega.boicot.profile.this
                java.util.ArrayList<mega.boicot.profile$b> r11 = r11.f20078t
                r11.add(r4, r3)
                mega.boicot.profile r11 = mega.boicot.profile.this
                int r0 = r11.f20068j
                int r0 = r0 + r2
                r11.f20068j = r0
                mega.boicot.profile r11 = mega.boicot.profile.this
                r11.f20063e = r4
                mega.boicot.profile r11 = mega.boicot.profile.this     // Catch:{ Exception -> 0x008d }
                mega.boicot.config r11 = r11.f20079u     // Catch:{ Exception -> 0x008d }
                mega.boicot.profile r11 = mega.boicot.profile.this     // Catch:{ Exception -> 0x008d }
                mega.boicot.config r11 = r11.f20079u     // Catch:{ Exception -> 0x008d }
                mega.boicot.profile r0 = mega.boicot.profile.this     // Catch:{ Exception -> 0x008d }
                int r5 = r10.f20166a     // Catch:{ Exception -> 0x008d }
                java.io.File r11 = r11.mo20757a(r0, r5)     // Catch:{ Exception -> 0x008d }
                java.io.File r0 = new java.io.File     // Catch:{ Exception -> 0x008d }
                mega.boicot.profile r5 = mega.boicot.profile.this     // Catch:{ Exception -> 0x008d }
                java.io.File r5 = r5.f20080v     // Catch:{ Exception -> 0x008d }
                java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x008d }
                r6.<init>()     // Catch:{ Exception -> 0x008d }
                java.lang.String r7 = "fperfilgalv_"
                r6.append(r7)     // Catch:{ Exception -> 0x008d }
                java.lang.String r7 = r3.f20122a     // Catch:{ Exception -> 0x008d }
                r6.append(r7)     // Catch:{ Exception -> 0x008d }
                java.lang.String r7 = ".jpg"
                r6.append(r7)     // Catch:{ Exception -> 0x008d }
                java.lang.String r6 = r6.toString()     // Catch:{ Exception -> 0x008d }
                r0.<init>(r5, r6)     // Catch:{ Exception -> 0x008d }
                mega.boicot.config.m23840a(r11, r0)     // Catch:{ Exception -> 0x008d }
            L_0x008d:
                mega.boicot.profile r11 = mega.boicot.profile.this
                r11.mo21858k()
                mega.boicot.profile r11 = mega.boicot.profile.this
                android.content.SharedPreferences r11 = r11.f20031aJ
                android.content.SharedPreferences$Editor r11 = r11.edit()
                r0 = 3
            L_0x009b:
                if (r0 <= 0) goto L_0x0206
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r6 = "idv"
                r5.append(r6)
                r5.append(r0)
                java.lang.String r6 = "_"
                r5.append(r6)
                mega.boicot.profile r6 = mega.boicot.profile.this
                java.lang.String r6 = r6.f20070l
                r5.append(r6)
                java.lang.String r5 = r5.toString()
                mega.boicot.profile r6 = mega.boicot.profile.this
                android.content.SharedPreferences r6 = r6.f20031aJ
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                java.lang.String r8 = "idv"
                r7.append(r8)
                int r8 = r0 + -1
                r7.append(r8)
                java.lang.String r9 = "_"
                r7.append(r9)
                mega.boicot.profile r9 = mega.boicot.profile.this
                java.lang.String r9 = r9.f20070l
                r7.append(r9)
                java.lang.String r7 = r7.toString()
                java.lang.String r9 = ""
                java.lang.String r6 = r6.getString(r7, r9)
                r11.putString(r5, r6)
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r6 = "v"
                r5.append(r6)
                r5.append(r0)
                java.lang.String r6 = "_formato_"
                r5.append(r6)
                mega.boicot.profile r6 = mega.boicot.profile.this
                java.lang.String r6 = r6.f20070l
                r5.append(r6)
                java.lang.String r5 = r5.toString()
                mega.boicot.profile r6 = mega.boicot.profile.this
                android.content.SharedPreferences r6 = r6.f20031aJ
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                java.lang.String r9 = "v"
                r7.append(r9)
                r7.append(r8)
                java.lang.String r9 = "_formato_"
                r7.append(r9)
                mega.boicot.profile r9 = mega.boicot.profile.this
                java.lang.String r9 = r9.f20070l
                r7.append(r9)
                java.lang.String r7 = r7.toString()
                java.lang.String r9 = ""
                java.lang.String r6 = r6.getString(r7, r9)
                r11.putString(r5, r6)
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r6 = "v"
                r5.append(r6)
                r5.append(r0)
                java.lang.String r6 = "_fcrea_"
                r5.append(r6)
                mega.boicot.profile r6 = mega.boicot.profile.this
                java.lang.String r6 = r6.f20070l
                r5.append(r6)
                java.lang.String r5 = r5.toString()
                mega.boicot.profile r6 = mega.boicot.profile.this
                android.content.SharedPreferences r6 = r6.f20031aJ
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                java.lang.String r9 = "v"
                r7.append(r9)
                r7.append(r8)
                java.lang.String r9 = "_fcrea_"
                r7.append(r9)
                mega.boicot.profile r9 = mega.boicot.profile.this
                java.lang.String r9 = r9.f20070l
                r7.append(r9)
                java.lang.String r7 = r7.toString()
                java.lang.String r9 = ""
                java.lang.String r6 = r6.getString(r7, r9)
                r11.putString(r5, r6)
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r6 = "v"
                r5.append(r6)
                r5.append(r0)
                java.lang.String r6 = "_nlikes_"
                r5.append(r6)
                mega.boicot.profile r6 = mega.boicot.profile.this
                java.lang.String r6 = r6.f20070l
                r5.append(r6)
                java.lang.String r5 = r5.toString()
                mega.boicot.profile r6 = mega.boicot.profile.this
                android.content.SharedPreferences r6 = r6.f20031aJ
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                java.lang.String r9 = "v"
                r7.append(r9)
                r7.append(r8)
                java.lang.String r9 = "_nlikes_"
                r7.append(r9)
                mega.boicot.profile r9 = mega.boicot.profile.this
                java.lang.String r9 = r9.f20070l
                r7.append(r9)
                java.lang.String r7 = r7.toString()
                java.lang.String r9 = ""
                java.lang.String r6 = r6.getString(r7, r9)
                r11.putString(r5, r6)
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r6 = "v"
                r5.append(r6)
                r5.append(r0)
                java.lang.String r6 = "_liked_"
                r5.append(r6)
                mega.boicot.profile r6 = mega.boicot.profile.this
                java.lang.String r6 = r6.f20070l
                r5.append(r6)
                java.lang.String r5 = r5.toString()
                mega.boicot.profile r6 = mega.boicot.profile.this
                android.content.SharedPreferences r6 = r6.f20031aJ
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                java.lang.String r9 = "v"
                r7.append(r9)
                r7.append(r8)
                java.lang.String r8 = "_liked_"
                r7.append(r8)
                mega.boicot.profile r8 = mega.boicot.profile.this
                java.lang.String r8 = r8.f20070l
                r7.append(r8)
                java.lang.String r7 = r7.toString()
                java.lang.String r8 = ""
                java.lang.String r6 = r6.getString(r7, r8)
                r11.putString(r5, r6)
                int r0 = r0 + -1
                goto L_0x009b
            L_0x0206:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r5 = "idv0_"
                r0.append(r5)
                mega.boicot.profile r5 = mega.boicot.profile.this
                java.lang.String r5 = r5.f20070l
                r0.append(r5)
                java.lang.String r0 = r0.toString()
                java.lang.String r5 = r3.f20122a
                r11.putString(r0, r5)
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r5 = "v0_formato_"
                r0.append(r5)
                mega.boicot.profile r5 = mega.boicot.profile.this
                java.lang.String r5 = r5.f20070l
                r0.append(r5)
                java.lang.String r0 = r0.toString()
                java.lang.String r5 = r3.f20123b
                r11.putString(r0, r5)
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r5 = "v0_fcrea_"
                r0.append(r5)
                mega.boicot.profile r5 = mega.boicot.profile.this
                java.lang.String r5 = r5.f20070l
                r0.append(r5)
                java.lang.String r0 = r0.toString()
                java.lang.String r5 = r3.f20125d
                r11.putString(r0, r5)
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r5 = "v0_nlikes_"
                r0.append(r5)
                mega.boicot.profile r5 = mega.boicot.profile.this
                java.lang.String r5 = r5.f20070l
                r0.append(r5)
                java.lang.String r0 = r0.toString()
                java.lang.String r5 = r3.f20124c
                r11.putString(r0, r5)
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r5 = "v0_liked_"
                r0.append(r5)
                mega.boicot.profile r5 = mega.boicot.profile.this
                java.lang.String r5 = r5.f20070l
                r0.append(r5)
                java.lang.String r0 = r0.toString()
                java.lang.String r3 = r3.f20126e
                r11.putString(r0, r3)
                r11.commit()
                goto L_0x028d
            L_0x028c:
                r2 = r4
            L_0x028d:
                if (r2 != 0) goto L_0x02d7
                android.app.AlertDialog$Builder r11 = new android.app.AlertDialog$Builder
                mega.boicot.profile r0 = mega.boicot.profile.this
                r11.<init>(r0)
                android.app.AlertDialog$Builder r11 = r11.setCancelable(r4)
                mega.boicot.profile r0 = mega.boicot.profile.this
                r2 = 2131558439(0x7f0d0027, float:1.8742194E38)
                java.lang.String r0 = r0.getString(r2)
                android.app.AlertDialog$Builder r11 = r11.setPositiveButton(r0, r1)
                r0 = 2131558581(0x7f0d00b5, float:1.8742482E38)
                android.app.AlertDialog$Builder r11 = r11.setMessage(r0)
                android.app.AlertDialog r11 = r11.create()
                mega.boicot.profile r0 = mega.boicot.profile.this
                java.lang.String r0 = r0.f20074p
                java.lang.String r1 = ""
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L_0x02c6
                mega.boicot.profile$o$1 r0 = new mega.boicot.profile$o$1
                r0.<init>(r11)
                r11.setOnShowListener(r0)
            L_0x02c6:
                r11.show()
                r0 = 16908299(0x102000b, float:2.387726E-38)
                android.view.View r11 = r11.findViewById(r0)     // Catch:{ Exception -> 0x02d7 }
                android.widget.TextView r11 = (android.widget.TextView) r11     // Catch:{ Exception -> 0x02d7 }
                android.graphics.Typeface r0 = android.graphics.Typeface.MONOSPACE     // Catch:{ Exception -> 0x02d7 }
                r11.setTypeface(r0)     // Catch:{ Exception -> 0x02d7 }
            L_0x02d7:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: mega.boicot.profile.C6079o.onPostExecute(java.lang.String):void");
        }
    }

    /* renamed from: mega.boicot.profile$p */
    private class C6081p extends AsyncTask<String, Void, String> {

        /* renamed from: a */
        String f20172a;

        /* renamed from: b */
        int f20173b;

        public C6081p(int i, String str) {
            this.f20172a = str;
            this.f20173b = i;
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
            Builder builder = new Builder(profile.this);
            profile.this.f20026aE = builder.setCancelable(false).setMessage(R.string.subiendo).create();
            profile.this.f20026aE.show();
            try {
                ((TextView) profile.this.f20026aE.findViewById(16908299)).setTypeface(Typeface.MONOSPACE);
            } catch (Exception unused) {
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public String doInBackground(String... strArr) {
            C6409h hVar = new C6409h();
            C6274e eVar = new C6274e("http://video-upload.e-droid.net/upload.php?pro=1");
            C6362e eVar2 = new C6362e(new File(this.f20172a));
            C6370g gVar = new C6370g();
            gVar.mo22648a("videoFile", (C6360c) eVar2);
            String str = "idusu";
            try {
                StringBuilder sb = new StringBuilder();
                sb.append(profile.this.f20060b);
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
        /* JADX WARNING: Removed duplicated region for block: B:24:0x00af A[SYNTHETIC, Splitter:B:24:0x00af] */
        /* JADX WARNING: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onPostExecute(java.lang.String r11) {
            /*
                r10 = this;
                java.lang.String r0 = "ANDROID:OK:-"
                int r0 = r11.indexOf(r0)
                r1 = -1
                r2 = 1
                r3 = 0
                if (r0 == r1) goto L_0x00ac
                int r0 = r0 + 12
                java.lang.String r4 = "-"
                int r5 = r0 + 1
                int r4 = r11.indexOf(r4, r5)
                java.lang.String r0 = r11.substring(r0, r4)
                int r4 = r4 + r2
                java.lang.String r5 = "-"
                int r5 = r11.indexOf(r5, r4)
                java.lang.String r11 = r11.substring(r4, r5)
                java.lang.String r4 = ""
                java.lang.String r5 = "1"
                boolean r5 = r11.equals(r5)
                if (r5 == 0) goto L_0x0031
                java.lang.String r4 = "mp4"
                goto L_0x0046
            L_0x0031:
                java.lang.String r5 = "2"
                boolean r5 = r11.equals(r5)
                if (r5 == 0) goto L_0x003c
                java.lang.String r4 = "3gp"
                goto L_0x0046
            L_0x003c:
                java.lang.String r5 = "3"
                boolean r5 = r11.equals(r5)
                if (r5 == 0) goto L_0x0046
                java.lang.String r4 = "webm"
            L_0x0046:
                boolean r5 = r4.isEmpty()
                if (r5 != 0) goto L_0x00ac
                java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch:{ Exception -> 0x0099 }
                java.lang.String r6 = r10.f20172a     // Catch:{ Exception -> 0x0099 }
                r5.<init>(r6)     // Catch:{ Exception -> 0x0099 }
                mega.boicot.profile r6 = mega.boicot.profile.this     // Catch:{ Exception -> 0x0099 }
                mega.boicot.config r6 = r6.f20079u     // Catch:{ Exception -> 0x0099 }
                mega.boicot.profile r7 = mega.boicot.profile.this     // Catch:{ Exception -> 0x0099 }
                java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0099 }
                r8.<init>()     // Catch:{ Exception -> 0x0099 }
                java.lang.String r9 = "vp"
                r8.append(r9)     // Catch:{ Exception -> 0x0099 }
                r8.append(r0)     // Catch:{ Exception -> 0x0099 }
                java.lang.String r9 = "."
                r8.append(r9)     // Catch:{ Exception -> 0x0099 }
                r8.append(r4)     // Catch:{ Exception -> 0x0099 }
                java.lang.String r4 = r8.toString()     // Catch:{ Exception -> 0x0099 }
                java.io.File r4 = r6.mo20759a(r7, r4)     // Catch:{ Exception -> 0x0099 }
                java.lang.String r4 = r4.getAbsolutePath()     // Catch:{ Exception -> 0x0099 }
                java.io.FileOutputStream r6 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x0099 }
                r6.<init>(r4)     // Catch:{ Exception -> 0x0099 }
                r7 = 1024(0x400, float:1.435E-42)
                byte[] r7 = new byte[r7]     // Catch:{ Exception -> 0x0099 }
            L_0x0083:
                int r8 = r5.read(r7)     // Catch:{ Exception -> 0x0099 }
                if (r8 == r1) goto L_0x008d
                r6.write(r7, r3, r8)     // Catch:{ Exception -> 0x0099 }
                goto L_0x0083
            L_0x008d:
                r5.close()     // Catch:{ Exception -> 0x0099 }
                r6.flush()     // Catch:{ Exception -> 0x0099 }
                r6.close()     // Catch:{ Exception -> 0x0099 }
                r10.f20172a = r4     // Catch:{ Exception -> 0x0099 }
                goto L_0x009d
            L_0x0099:
                r1 = move-exception
                r1.printStackTrace()
            L_0x009d:
                mega.boicot.profile$o r1 = new mega.boicot.profile$o
                mega.boicot.profile r4 = mega.boicot.profile.this
                int r5 = r10.f20173b
                r1.<init>(r5, r0, r11)
                java.lang.String[] r11 = new java.lang.String[r3]
                r1.execute(r11)
                goto L_0x00ad
            L_0x00ac:
                r2 = r3
            L_0x00ad:
                if (r2 != 0) goto L_0x00b6
                mega.boicot.profile r11 = mega.boicot.profile.this     // Catch:{ Exception -> 0x00b6 }
                android.app.AlertDialog r11 = r11.f20026aE     // Catch:{ Exception -> 0x00b6 }
                r11.dismiss()     // Catch:{ Exception -> 0x00b6 }
            L_0x00b6:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: mega.boicot.profile.C6081p.onPostExecute(java.lang.String):void");
        }
    }

    /* renamed from: mega.boicot.profile$q */
    private class C6082q extends AsyncTask<String, Void, String> {

        /* renamed from: a */
        String f20175a;

        /* renamed from: b */
        Bitmap f20176b;

        private C6082q() {
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
            this.f20175a = profile.this.f20070l;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public String doInBackground(String... strArr) {
            if (this.f20175a == null) {
                return "0";
            }
            try {
                StringBuilder sb = new StringBuilder();
                sb.append("http://imgs1.e-droid.net/srv/imgs/usus/");
                sb.append(this.f20175a);
                sb.append("_1.jpg?v=");
                sb.append(profile.this.f20071m);
                try {
                    HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(sb.toString()).openConnection();
                    httpURLConnection.setDoInput(true);
                    httpURLConnection.setConnectTimeout(10000);
                    httpURLConnection.setReadTimeout(20000);
                    httpURLConnection.connect();
                    InputStream inputStream = httpURLConnection.getInputStream();
                    try {
                        this.f20176b = BitmapFactory.decodeStream(inputStream);
                        inputStream.close();
                        httpURLConnection.disconnect();
                        File file = profile.this.f20080v;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("fperfil_");
                        sb2.append(this.f20175a);
                        sb2.append("_g.jpg");
                        try {
                            this.f20176b.compress(CompressFormat.JPEG, 100, new FileOutputStream(new File(file, sb2.toString())));
                            return "1";
                        } catch (Exception unused) {
                            return "0";
                        }
                    } catch (OutOfMemoryError unused2) {
                        return "0";
                    }
                } catch (IOException unused3) {
                    return "0";
                }
            } catch (MalformedURLException unused4) {
                return "0";
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void onPostExecute(String str) {
            if (str.equals("1")) {
                Editor edit = profile.this.f20031aJ.edit();
                StringBuilder sb = new StringBuilder();
                sb.append("fperfil_");
                sb.append(this.f20175a);
                sb.append("_g");
                edit.putString(sb.toString(), profile.this.f20071m);
                edit.commit();
            }
            profile.this.findViewById(R.id.pb_foto).setVisibility(8);
            profile.this.findViewById(R.id.pb_foto_inv).setVisibility(8);
            if (str.equals("1")) {
                profile.this.f20081w.setImageBitmap(this.f20176b);
                profile.this.f20081w.setOnClickListener(new OnClickListener() {
                    public void onClick(View view) {
                        Intent intent = new Intent(profile.this, t_url.class);
                        File file = profile.this.f20080v;
                        StringBuilder sb = new StringBuilder();
                        sb.append("fperfil_");
                        sb.append(profile.this.f20070l);
                        sb.append("_g.jpg");
                        File file2 = new File(file, sb.toString());
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("file://");
                        sb2.append(file2.getAbsolutePath());
                        intent.putExtra("url", sb2.toString());
                        profile.this.startActivityForResult(intent, 0);
                    }
                });
            }
        }
    }

    /* renamed from: mega.boicot.profile$r */
    private class C6084r extends AsyncTask<String, Void, String> {

        /* renamed from: a */
        String f20179a;

        /* renamed from: b */
        int f20180b;

        /* renamed from: c */
        Bitmap f20181c;

        public C6084r(String str, int i) {
            this.f20179a = str;
            this.f20180b = i;
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
            int i;
            int i2;
            int i3 = this.f20180b % 4;
            if (i3 == 0) {
                i2 = R.id.pb_1;
                i = R.id.pb_1_inv;
            } else if (i3 == 1) {
                i2 = R.id.pb_2;
                i = R.id.pb_2_inv;
            } else if (i3 == 2) {
                i2 = R.id.pb_3;
                i = R.id.pb_3_inv;
            } else if (i3 == 3) {
                i2 = R.id.pb_4;
                i = R.id.pb_4_inv;
            } else {
                return;
            }
            if (profile.this.f20046am) {
                profile.this.findViewById(i).setVisibility(0);
            } else {
                profile.this.findViewById(i2).setVisibility(0);
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public String doInBackground(String... strArr) {
            try {
                StringBuilder sb = new StringBuilder();
                sb.append("http://imgs1.e-droid.net/srv/imgs/ususgal/");
                sb.append(profile.this.f20070l);
                sb.append("_");
                sb.append(this.f20179a);
                sb.append(".jpg");
                try {
                    HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(sb.toString()).openConnection();
                    httpURLConnection.setDoInput(true);
                    httpURLConnection.setConnectTimeout(10000);
                    httpURLConnection.setReadTimeout(60000);
                    httpURLConnection.connect();
                    InputStream inputStream = httpURLConnection.getInputStream();
                    try {
                        this.f20181c = BitmapFactory.decodeStream(inputStream);
                        inputStream.close();
                        httpURLConnection.disconnect();
                        config config = profile.this.f20079u;
                        profile profile = profile.this;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("fperfilgal_");
                        sb2.append(this.f20179a);
                        sb2.append("_g.jpg");
                        try {
                            this.f20181c.compress(CompressFormat.JPEG, 100, new FileOutputStream(config.mo20759a((Context) profile, sb2.toString())));
                            return "1";
                        } catch (Exception unused) {
                            return "0";
                        }
                    } catch (OutOfMemoryError unused2) {
                        return "0";
                    }
                } catch (IOException unused3) {
                    return "0";
                }
            } catch (MalformedURLException unused4) {
                return "0";
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void onPostExecute(String str) {
            try {
                profile.this.findViewById(R.id.pb_1).setVisibility(8);
                profile.this.findViewById(R.id.pb_1_inv).setVisibility(8);
                profile.this.findViewById(R.id.pb_2).setVisibility(8);
                profile.this.findViewById(R.id.pb_2_inv).setVisibility(8);
                profile.this.findViewById(R.id.pb_3).setVisibility(8);
                profile.this.findViewById(R.id.pb_3_inv).setVisibility(8);
                profile.this.findViewById(R.id.pb_4).setVisibility(8);
                profile.this.findViewById(R.id.pb_4_inv).setVisibility(8);
            } catch (Exception unused) {
            }
            if (str.equals("1")) {
                Intent intent = new Intent(profile.this, fotogal.class);
                StringBuilder sb = new StringBuilder();
                sb.append("file://");
                config config = profile.this.f20079u;
                profile profile = profile.this;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("fperfilgal_");
                sb2.append(this.f20179a);
                sb2.append("_g.jpg");
                sb.append(config.mo20759a((Context) profile, sb2.toString()).getAbsolutePath());
                intent.putExtra("url", sb.toString());
                intent.putExtra("nlikes", ((C6061a) profile.this.f20077s.get(this.f20180b)).f20117b);
                intent.putExtra("liked", ((C6061a) profile.this.f20077s.get(this.f20180b)).f20119d);
                intent.putExtra("fcrea", ((C6061a) profile.this.f20077s.get(this.f20180b)).f20118c);
                intent.putExtra("idf", this.f20179a);
                intent.putExtra("indf", this.f20180b);
                intent.putExtra("idusu_profile", profile.this.f20070l);
                intent.putExtra("p_fnac", profile.this.f20049ap.getInt("p_fnac"));
                intent.putExtra("p_sexo", profile.this.f20049ap.getInt("p_sexo"));
                intent.putExtra("p_descr", profile.this.f20049ap.getInt("p_descr"));
                intent.putExtra("p_dist", profile.this.f20049ap.getInt("p_dist"));
                intent.putExtra("coments_chat", profile.this.f20049ap.getBoolean("coments_chat"));
                intent.putExtra("galeria", profile.this.f20049ap.getBoolean("galeria"));
                intent.putExtra("privados_chat", profile.this.f20049ap.getBoolean("privados_chat"));
                intent.putExtra("fotos_perfil", profile.this.f20061c);
                intent.putExtra("fotos_chat", profile.this.f20049ap.getInt("fotos_chat"));
                profile.this.startActivityForResult(intent, 0);
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

    /* JADX WARNING: Removed duplicated region for block: B:211:0x0e28  */
    /* JADX WARNING: Removed duplicated region for block: B:218:0x0ebf  */
    @android.annotation.TargetApi(13)
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            android.content.Context r2 = r17.getApplicationContext()
            mega.boicot.config r2 = (mega.boicot.config) r2
            r0.f20079u = r2
            mega.boicot.config r2 = r0.f20079u
            java.lang.String r2 = r2.f17881aN
            if (r2 != 0) goto L_0x0017
            mega.boicot.config r2 = r0.f20079u
            r2.mo20780b()
        L_0x0017:
            android.content.Intent r2 = r17.getIntent()
            android.os.Bundle r2 = r2.getExtras()
            r0.f20049ap = r2
            android.os.Bundle r2 = r0.f20049ap
            java.lang.String r3 = "desde_main"
            r4 = 0
            boolean r2 = r2.getBoolean(r3, r4)
            if (r2 == 0) goto L_0x0039
            mega.boicot.config r2 = r0.f20079u
            java.lang.String r2 = r2.f17881aN
            r0.f20075q = r2
            mega.boicot.config r2 = r0.f20079u
            java.lang.String r2 = r2.f17882aO
            r0.f20076r = r2
            goto L_0x0055
        L_0x0039:
            mega.boicot.config r2 = r0.f20079u
            mega.boicot.i[] r2 = r2.f17971bz
            mega.boicot.config r3 = r0.f20079u
            int r3 = r3.f18075l
            r2 = r2[r3]
            java.lang.String r2 = r2.f18314g
            r0.f20075q = r2
            mega.boicot.config r2 = r0.f20079u
            mega.boicot.i[] r2 = r2.f17971bz
            mega.boicot.config r3 = r0.f20079u
            int r3 = r3.f18075l
            r2 = r2[r3]
            java.lang.String r2 = r2.f18315h
            r0.f20076r = r2
        L_0x0055:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "#"
            r2.append(r3)
            java.lang.String r3 = r0.f20075q
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            boolean r2 = mega.boicot.config.m23844a(r2)
            r0.f20046am = r2
            java.lang.String r2 = r0.f20075q
            mega.boicot.config r3 = r0.f20079u
            java.lang.String r3 = r3.f17890aW
            java.lang.String r2 = mega.boicot.config.m23831a(r2, r3)
            r0.f20074p = r2
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 12
            if (r2 <= r3) goto L_0x008a
            boolean r2 = r0.f20046am
            if (r2 != 0) goto L_0x008a
            r2 = 2131624309(0x7f0e0175, float:1.8875794E38)
            r0.setTheme(r2)
        L_0x008a:
            r2 = 1
            if (r1 != 0) goto L_0x00ab
            android.os.Bundle r5 = r0.f20049ap
            if (r5 == 0) goto L_0x00a7
            android.os.Bundle r5 = r0.f20049ap
            java.lang.String r6 = "es_root"
            boolean r5 = r5.containsKey(r6)
            if (r5 == 0) goto L_0x00a7
            android.os.Bundle r5 = r0.f20049ap
            java.lang.String r6 = "es_root"
            boolean r5 = r5.getBoolean(r6, r4)
            if (r5 == 0) goto L_0x00a7
            r5 = r2
            goto L_0x00a8
        L_0x00a7:
            r5 = r4
        L_0x00a8:
            r0.f20043aj = r5
            goto L_0x00c0
        L_0x00ab:
            java.lang.String r5 = "es_root"
            boolean r5 = r1.containsKey(r5)
            if (r5 == 0) goto L_0x00bd
            java.lang.String r5 = "es_root"
            boolean r5 = r1.getBoolean(r5, r4)
            if (r5 == 0) goto L_0x00bd
            r5 = r2
            goto L_0x00be
        L_0x00bd:
            r5 = r4
        L_0x00be:
            r0.f20043aj = r5
        L_0x00c0:
            super.onCreate(r18)
            r1 = 2131361906(0x7f0a0072, float:1.8343578E38)
            r0.setContentView(r1)
            r17.mo21853f()
            mega.boicot.config r1 = r0.f20079u
            int r1 = r1.f18080q
            if (r1 <= 0) goto L_0x00ea
            java.lang.String r1 = "search"
            java.lang.Object r1 = r0.getSystemService(r1)
            android.app.SearchManager r1 = (android.app.SearchManager) r1
            mega.boicot.profile$1 r5 = new mega.boicot.profile$1
            r5.<init>()
            r1.setOnCancelListener(r5)
            mega.boicot.profile$12 r5 = new mega.boicot.profile$12
            r5.<init>()
            r1.setOnDismissListener(r5)
        L_0x00ea:
            mega.boicot.config r1 = r0.f20079u
            android.os.Bundle r5 = r0.f20049ap
            if (r5 == 0) goto L_0x00fc
            android.os.Bundle r5 = r0.f20049ap
            java.lang.String r6 = "ad_entrar"
            boolean r5 = r5.containsKey(r6)
            if (r5 == 0) goto L_0x00fc
            r5 = r2
            goto L_0x00fd
        L_0x00fc:
            r5 = r4
        L_0x00fd:
            android.os.Bundle r6 = r0.f20049ap
            if (r6 == 0) goto L_0x010d
            android.os.Bundle r6 = r0.f20049ap
            java.lang.String r7 = "fb_entrar"
            boolean r6 = r6.containsKey(r7)
            if (r6 == 0) goto L_0x010d
            r6 = r2
            goto L_0x010e
        L_0x010d:
            r6 = r4
        L_0x010e:
            r1.mo20770a(r0, r5, r6)
            java.lang.String r1 = "sh"
            android.content.SharedPreferences r1 = r0.getSharedPreferences(r1, r4)
            r0.f20031aJ = r1
            android.content.SharedPreferences r1 = r0.f20031aJ
            java.lang.String r5 = "idusu"
            int r1 = r1.getInt(r5, r4)
            r0.f20060b = r1
            android.content.SharedPreferences r1 = r0.f20031aJ
            java.lang.String r5 = "cod"
            java.lang.String r6 = ""
            java.lang.String r1 = r1.getString(r5, r6)
            r0.f20069k = r1
            android.os.Bundle r1 = r0.f20049ap
            java.lang.String r5 = "id"
            java.lang.String r1 = r1.getString(r5)
            r0.f20070l = r1
            java.io.File r1 = new java.io.File
            java.io.File r5 = android.os.Environment.getExternalStorageDirectory()
            java.lang.String r6 = r17.getPackageName()
            r1.<init>(r5, r6)
            r0.f20080v = r1
            r17.m24507m()
            java.lang.String r1 = r0.f20075q
            java.lang.String r5 = ""
            boolean r1 = r1.equals(r5)
            r5 = 2
            if (r1 != 0) goto L_0x019b
            android.graphics.drawable.GradientDrawable r1 = new android.graphics.drawable.GradientDrawable
            android.graphics.drawable.GradientDrawable$Orientation r6 = android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM
            int[] r7 = new int[r5]
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "#"
            r8.append(r9)
            java.lang.String r9 = r0.f20075q
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            int r8 = android.graphics.Color.parseColor(r8)
            r7[r4] = r8
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "#"
            r8.append(r9)
            java.lang.String r9 = r0.f20076r
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            int r8 = android.graphics.Color.parseColor(r8)
            r7[r2] = r8
            r1.<init>(r6, r7)
            r6 = 2131231221(0x7f0801f5, float:1.8078517E38)
            android.view.View r6 = r0.findViewById(r6)
            r6.setBackgroundDrawable(r1)
        L_0x019b:
            android.view.WindowManager r1 = r17.getWindowManager()
            android.view.Display r1 = r1.getDefaultDisplay()
            int r6 = android.os.Build.VERSION.SDK_INT
            r7 = 13
            if (r6 < r7) goto L_0x01b6
            android.graphics.Point r6 = new android.graphics.Point
            r6.<init>()
            r1.getSize(r6)
            int r1 = r6.y
            r0.f20064f = r1
            goto L_0x01bc
        L_0x01b6:
            int r1 = r1.getHeight()
            r0.f20064f = r1
        L_0x01bc:
            int r1 = android.os.Build.VERSION.SDK_INT
            r6 = 2131231304(0x7f080248, float:1.8078685E38)
            r7 = 2131231301(0x7f080245, float:1.807868E38)
            r8 = 20
            if (r1 <= r8) goto L_0x0342
            android.view.View r1 = r0.findViewById(r7)
            android.widget.ProgressBar r1 = (android.widget.ProgressBar) r1
            mega.boicot.config r9 = r0.f20079u
            java.lang.String r9 = r9.f17890aW
            mega.boicot.config.m23838a(r1, r9)
            android.view.View r1 = r0.findViewById(r6)
            android.widget.ProgressBar r1 = (android.widget.ProgressBar) r1
            mega.boicot.config r9 = r0.f20079u
            java.lang.String r9 = r9.f17890aW
            mega.boicot.config.m23838a(r1, r9)
            r1 = 2131231313(0x7f080251, float:1.8078703E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.ProgressBar r1 = (android.widget.ProgressBar) r1
            mega.boicot.config r9 = r0.f20079u
            java.lang.String r9 = r9.f17890aW
            mega.boicot.config.m23838a(r1, r9)
            r1 = 2131231314(0x7f080252, float:1.8078706E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.ProgressBar r1 = (android.widget.ProgressBar) r1
            mega.boicot.config r9 = r0.f20079u
            java.lang.String r9 = r9.f17890aW
            mega.boicot.config.m23838a(r1, r9)
            r1 = 2131231311(0x7f08024f, float:1.80787E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.ProgressBar r1 = (android.widget.ProgressBar) r1
            mega.boicot.config r9 = r0.f20079u
            java.lang.String r9 = r9.f17890aW
            mega.boicot.config.m23838a(r1, r9)
            r1 = 2131231312(0x7f080250, float:1.8078701E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.ProgressBar r1 = (android.widget.ProgressBar) r1
            mega.boicot.config r9 = r0.f20079u
            java.lang.String r9 = r9.f17890aW
            mega.boicot.config.m23838a(r1, r9)
            r1 = 2131231292(0x7f08023c, float:1.807866E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.ProgressBar r1 = (android.widget.ProgressBar) r1
            mega.boicot.config r9 = r0.f20079u
            java.lang.String r9 = r9.f17890aW
            mega.boicot.config.m23838a(r1, r9)
            r1 = 2131231293(0x7f08023d, float:1.8078663E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.ProgressBar r1 = (android.widget.ProgressBar) r1
            mega.boicot.config r9 = r0.f20079u
            java.lang.String r9 = r9.f17890aW
            mega.boicot.config.m23838a(r1, r9)
            r1 = 2131231277(0x7f08022d, float:1.807863E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.ProgressBar r1 = (android.widget.ProgressBar) r1
            mega.boicot.config r9 = r0.f20079u
            java.lang.String r9 = r9.f17890aW
            mega.boicot.config.m23838a(r1, r9)
            r1 = 2131231278(0x7f08022e, float:1.8078633E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.ProgressBar r1 = (android.widget.ProgressBar) r1
            mega.boicot.config r9 = r0.f20079u
            java.lang.String r9 = r9.f17890aW
            mega.boicot.config.m23838a(r1, r9)
            r1 = 2131231279(0x7f08022f, float:1.8078635E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.ProgressBar r1 = (android.widget.ProgressBar) r1
            mega.boicot.config r9 = r0.f20079u
            java.lang.String r9 = r9.f17890aW
            mega.boicot.config.m23838a(r1, r9)
            r1 = 2131231280(0x7f080230, float:1.8078637E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.ProgressBar r1 = (android.widget.ProgressBar) r1
            mega.boicot.config r9 = r0.f20079u
            java.lang.String r9 = r9.f17890aW
            mega.boicot.config.m23838a(r1, r9)
            r1 = 2131231281(0x7f080231, float:1.8078639E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.ProgressBar r1 = (android.widget.ProgressBar) r1
            mega.boicot.config r9 = r0.f20079u
            java.lang.String r9 = r9.f17890aW
            mega.boicot.config.m23838a(r1, r9)
            r1 = 2131231282(0x7f080232, float:1.807864E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.ProgressBar r1 = (android.widget.ProgressBar) r1
            mega.boicot.config r9 = r0.f20079u
            java.lang.String r9 = r9.f17890aW
            mega.boicot.config.m23838a(r1, r9)
            r1 = 2131231283(0x7f080233, float:1.8078643E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.ProgressBar r1 = (android.widget.ProgressBar) r1
            mega.boicot.config r9 = r0.f20079u
            java.lang.String r9 = r9.f17890aW
            mega.boicot.config.m23838a(r1, r9)
            r1 = 2131231284(0x7f080234, float:1.8078645E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.ProgressBar r1 = (android.widget.ProgressBar) r1
            mega.boicot.config r9 = r0.f20079u
            java.lang.String r9 = r9.f17890aW
            mega.boicot.config.m23838a(r1, r9)
            r1 = 2131231329(0x7f080261, float:1.8078736E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.ProgressBar r1 = (android.widget.ProgressBar) r1
            mega.boicot.config r9 = r0.f20079u
            java.lang.String r9 = r9.f17890aW
            mega.boicot.config.m23838a(r1, r9)
            r1 = 2131231330(0x7f080262, float:1.8078738E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.ProgressBar r1 = (android.widget.ProgressBar) r1
            mega.boicot.config r9 = r0.f20079u
            java.lang.String r9 = r9.f17890aW
            mega.boicot.config.m23838a(r1, r9)
            r1 = 2131231331(0x7f080263, float:1.807874E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.ProgressBar r1 = (android.widget.ProgressBar) r1
            mega.boicot.config r9 = r0.f20079u
            java.lang.String r9 = r9.f17890aW
            mega.boicot.config.m23838a(r1, r9)
            r1 = 2131231332(0x7f080264, float:1.8078742E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.ProgressBar r1 = (android.widget.ProgressBar) r1
            mega.boicot.config r9 = r0.f20079u
            java.lang.String r9 = r9.f17890aW
            mega.boicot.config.m23838a(r1, r9)
            r1 = 2131231333(0x7f080265, float:1.8078744E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.ProgressBar r1 = (android.widget.ProgressBar) r1
            mega.boicot.config r9 = r0.f20079u
            java.lang.String r9 = r9.f17890aW
            mega.boicot.config.m23838a(r1, r9)
            r1 = 2131231334(0x7f080266, float:1.8078746E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.ProgressBar r1 = (android.widget.ProgressBar) r1
            mega.boicot.config r9 = r0.f20079u
            java.lang.String r9 = r9.f17890aW
            mega.boicot.config.m23838a(r1, r9)
            r1 = 2131231335(0x7f080267, float:1.8078748E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.ProgressBar r1 = (android.widget.ProgressBar) r1
            mega.boicot.config r9 = r0.f20079u
            java.lang.String r9 = r9.f17890aW
            mega.boicot.config.m23838a(r1, r9)
            r1 = 2131231336(0x7f080268, float:1.807875E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.ProgressBar r1 = (android.widget.ProgressBar) r1
            mega.boicot.config r9 = r0.f20079u
            java.lang.String r9 = r9.f17890aW
            mega.boicot.config.m23838a(r1, r9)
        L_0x0342:
            r1 = 2131231612(0x7f08037c, float:1.807931E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            android.os.Bundle r9 = r0.f20049ap
            java.lang.String r10 = "nombre"
            java.lang.String r9 = r9.getString(r10)
            r1.setText(r9)
            r1 = 2131231293(0x7f08023d, float:1.8078663E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.ProgressBar r1 = (android.widget.ProgressBar) r1
            r0.f20009O = r1
            boolean r1 = r0.f20046am
            if (r1 != 0) goto L_0x0374
            int r1 = android.os.Build.VERSION.SDK_INT
            if (r1 <= r3) goto L_0x0374
            r1 = 2131231292(0x7f08023c, float:1.807866E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.ProgressBar r1 = (android.widget.ProgressBar) r1
            r0.f20009O = r1
        L_0x0374:
            android.os.Bundle r1 = r0.f20049ap
            java.lang.String r9 = "fnac_d"
            java.lang.String r1 = r1.getString(r9)
            int r1 = java.lang.Integer.parseInt(r1)
            android.os.Bundle r9 = r0.f20049ap
            java.lang.String r10 = "fnac_m"
            java.lang.String r9 = r9.getString(r10)
            int r9 = java.lang.Integer.parseInt(r9)
            android.os.Bundle r10 = r0.f20049ap
            java.lang.String r11 = "fnac_a"
            java.lang.String r10 = r10.getString(r11)
            int r10 = java.lang.Integer.parseInt(r10)
            android.os.Bundle r11 = r0.f20049ap
            java.lang.String r12 = "p_fnac"
            int r11 = r11.getInt(r12)
            if (r11 <= 0) goto L_0x03e4
            if (r1 <= 0) goto L_0x03e4
            if (r9 <= 0) goto L_0x03e4
            if (r10 <= 0) goto L_0x03e4
            java.util.Calendar r11 = java.util.Calendar.getInstance()
            int r9 = r9 - r2
            r11.set(r10, r9, r1)
            java.util.Calendar r1 = java.util.Calendar.getInstance()
            int r9 = r1.get(r2)
            int r10 = r11.get(r2)
            int r9 = r9 - r10
            r0.f20065g = r9
            int r9 = r11.get(r5)
            int r10 = r1.get(r5)
            if (r9 > r10) goto L_0x03df
            int r9 = r11.get(r5)
            int r10 = r1.get(r5)
            if (r9 != r10) goto L_0x03e4
            r9 = 5
            int r9 = r11.get(r9)
            r10 = 5
            int r1 = r1.get(r10)
            if (r9 <= r1) goto L_0x03e4
        L_0x03df:
            int r1 = r0.f20065g
            int r1 = r1 - r2
            r0.f20065g = r1
        L_0x03e4:
            android.os.Bundle r1 = r0.f20049ap
            java.lang.String r9 = "p_dist"
            int r1 = r1.getInt(r9)
            if (r1 <= 0) goto L_0x0412
            android.os.Bundle r1 = r0.f20049ap
            java.lang.String r9 = "dist"
            boolean r1 = r1.containsKey(r9)
            if (r1 == 0) goto L_0x0412
            android.os.Bundle r1 = r0.f20049ap
            java.lang.String r9 = "dist"
            java.lang.String r1 = r1.getString(r9)
            java.lang.String r9 = ""
            boolean r1 = r1.equals(r9)
            if (r1 != 0) goto L_0x0412
            android.os.Bundle r1 = r0.f20049ap
            java.lang.String r9 = "dist"
            java.lang.String r1 = r1.getString(r9)
            r0.f20073o = r1
        L_0x0412:
            java.lang.String r1 = r0.f20070l
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            int r10 = r0.f20060b
            r9.append(r10)
            java.lang.String r10 = ""
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            boolean r1 = r1.equals(r9)
            if (r1 != 0) goto L_0x044b
            android.os.Bundle r1 = r0.f20049ap
            java.lang.String r9 = "conectado"
            boolean r1 = r1.containsKey(r9)
            if (r1 == 0) goto L_0x044b
            android.os.Bundle r1 = r0.f20049ap
            java.lang.String r9 = "conectado"
            boolean r1 = r1.getBoolean(r9)
            if (r1 == 0) goto L_0x044b
            r1 = 2131231065(0x7f080159, float:1.80782E38)
            android.view.View r1 = r0.findViewById(r1)
            r1.setVisibility(r4)
        L_0x044b:
            r17.mo21854g()
            r1 = 2131230913(0x7f0800c1, float:1.8077892E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.f20010P = r1
            android.os.Bundle r1 = r0.f20049ap
            java.lang.String r9 = "p_descr"
            int r1 = r1.getInt(r9)
            if (r1 <= 0) goto L_0x04ab
            android.content.SharedPreferences r1 = r0.f20031aJ
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "descr_"
            r9.append(r10)
            java.lang.String r10 = r0.f20070l
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            java.lang.String r10 = ""
            java.lang.String r1 = r1.getString(r9, r10)
            java.lang.String r9 = ""
            boolean r1 = r1.equals(r9)
            if (r1 != 0) goto L_0x04ab
            android.widget.TextView r1 = r0.f20010P
            android.content.SharedPreferences r9 = r0.f20031aJ
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "descr_"
            r10.append(r11)
            java.lang.String r11 = r0.f20070l
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            java.lang.String r11 = ""
            java.lang.String r9 = r9.getString(r10, r11)
            r1.setText(r9)
            android.widget.TextView r1 = r0.f20010P
            r1.setVisibility(r4)
        L_0x04ab:
            android.os.Bundle r1 = r0.f20049ap
            java.lang.String r9 = "vfoto"
            java.lang.String r1 = r1.getString(r9)
            r0.f20071m = r1
            android.os.Bundle r1 = r0.f20049ap
            java.lang.String r9 = "fotos_perfil"
            int r1 = r1.getInt(r9)
            r0.f20061c = r1
            r1 = 2131231130(0x7f08019a, float:1.8078332E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r0.f20081w = r1
            int r1 = r0.f20061c
            r9 = 1056964608(0x3f000000, float:0.5)
            r10 = 8
            if (r1 == 0) goto L_0x05f5
            java.lang.String r1 = r0.f20071m
            java.lang.String r11 = "0"
            boolean r1 = r1.equals(r11)
            if (r1 == 0) goto L_0x04de
            goto L_0x05f5
        L_0x04de:
            java.lang.String r1 = r0.f20070l
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            int r12 = r0.f20060b
            r11.append(r12)
            java.lang.String r12 = ""
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            boolean r1 = r1.equals(r11)
            if (r1 == 0) goto L_0x051c
            android.widget.ImageView r1 = r0.f20081w     // Catch:{ Exception -> 0x05fd }
            android.content.ContentResolver r6 = r17.getContentResolver()     // Catch:{ Exception -> 0x05fd }
            mega.boicot.config r7 = r0.f20079u     // Catch:{ Exception -> 0x05fd }
            java.io.File r7 = r7.mo20757a(r0, r2)     // Catch:{ Exception -> 0x05fd }
            android.net.Uri r7 = android.net.Uri.fromFile(r7)     // Catch:{ Exception -> 0x05fd }
            android.graphics.Bitmap r6 = android.provider.MediaStore.Images.Media.getBitmap(r6, r7)     // Catch:{ Exception -> 0x05fd }
            r1.setImageBitmap(r6)     // Catch:{ Exception -> 0x05fd }
            android.widget.ImageView r1 = r0.f20081w     // Catch:{ Exception -> 0x05fd }
            mega.boicot.profile$14 r6 = new mega.boicot.profile$14     // Catch:{ Exception -> 0x05fd }
            r6.<init>()     // Catch:{ Exception -> 0x05fd }
            r1.setOnClickListener(r6)     // Catch:{ Exception -> 0x05fd }
            goto L_0x05fd
        L_0x051c:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r11 = "fperfil_"
            r1.append(r11)
            java.lang.String r11 = r0.f20070l
            r1.append(r11)
            java.lang.String r11 = "_g.jpg"
            r1.append(r11)
            java.lang.String r1 = r1.toString()
            java.io.File r11 = new java.io.File     // Catch:{ Exception | OutOfMemoryError -> 0x05ae }
            java.io.File r12 = r0.f20080v     // Catch:{ Exception | OutOfMemoryError -> 0x05ae }
            r11.<init>(r12, r1)     // Catch:{ Exception | OutOfMemoryError -> 0x05ae }
            android.graphics.BitmapFactory$Options r12 = new android.graphics.BitmapFactory$Options     // Catch:{ Exception | OutOfMemoryError -> 0x05ae }
            r12.<init>()     // Catch:{ Exception | OutOfMemoryError -> 0x05ae }
            r12.inJustDecodeBounds = r2     // Catch:{ Exception | OutOfMemoryError -> 0x05ae }
            java.lang.String r13 = r11.getPath()     // Catch:{ Exception | OutOfMemoryError -> 0x05ae }
            android.graphics.BitmapFactory.decodeFile(r13, r12)     // Catch:{ Exception | OutOfMemoryError -> 0x05ae }
            int r13 = r12.outWidth     // Catch:{ Exception | OutOfMemoryError -> 0x05ae }
            r13 = 1142292480(0x44160000, float:600.0)
            android.content.res.Resources r14 = r17.getResources()     // Catch:{ Exception | OutOfMemoryError -> 0x05ae }
            android.util.DisplayMetrics r14 = r14.getDisplayMetrics()     // Catch:{ Exception | OutOfMemoryError -> 0x05ae }
            float r14 = r14.density     // Catch:{ Exception | OutOfMemoryError -> 0x05ae }
            float r13 = r13 * r14
            float r13 = r13 + r9
            int r13 = (int) r13     // Catch:{ Exception | OutOfMemoryError -> 0x05ae }
            r14 = 1142292480(0x44160000, float:600.0)
            android.content.res.Resources r15 = r17.getResources()     // Catch:{ Exception | OutOfMemoryError -> 0x05ae }
            android.util.DisplayMetrics r15 = r15.getDisplayMetrics()     // Catch:{ Exception | OutOfMemoryError -> 0x05ae }
            float r15 = r15.density     // Catch:{ Exception | OutOfMemoryError -> 0x05ae }
            float r14 = r14 * r15
            float r14 = r14 + r9
            int r14 = (int) r14     // Catch:{ Exception | OutOfMemoryError -> 0x05ae }
            int r15 = r12.outWidth     // Catch:{ Exception | OutOfMemoryError -> 0x05ae }
            int r12 = r12.outHeight     // Catch:{ Exception | OutOfMemoryError -> 0x05ae }
            if (r15 > r13) goto L_0x0574
            if (r12 > r14) goto L_0x0574
            r16 = r2
            goto L_0x0576
        L_0x0574:
            r16 = r4
        L_0x0576:
            if (r16 != 0) goto L_0x0593
            int r12 = mega.boicot.config.m23824a(r15, r12, r13, r14)     // Catch:{ Exception | OutOfMemoryError -> 0x05ae }
            float r13 = (float) r15     // Catch:{ Exception | OutOfMemoryError -> 0x05ae }
            float r12 = (float) r12     // Catch:{ Exception | OutOfMemoryError -> 0x05ae }
            float r13 = r13 / r12
            int r12 = java.lang.Math.round(r13)     // Catch:{ Exception | OutOfMemoryError -> 0x05ae }
            android.graphics.BitmapFactory$Options r13 = new android.graphics.BitmapFactory$Options     // Catch:{ Exception | OutOfMemoryError -> 0x05ae }
            r13.<init>()     // Catch:{ Exception | OutOfMemoryError -> 0x05ae }
            r13.inSampleSize = r12     // Catch:{ Exception | OutOfMemoryError -> 0x05ae }
            java.lang.String r11 = r11.getPath()     // Catch:{ Exception | OutOfMemoryError -> 0x05ae }
            android.graphics.Bitmap r11 = android.graphics.BitmapFactory.decodeFile(r11, r13)     // Catch:{ Exception | OutOfMemoryError -> 0x05ae }
            goto L_0x059f
        L_0x0593:
            android.content.ContentResolver r12 = r17.getContentResolver()     // Catch:{ Exception | OutOfMemoryError -> 0x05ae }
            android.net.Uri r11 = android.net.Uri.fromFile(r11)     // Catch:{ Exception | OutOfMemoryError -> 0x05ae }
            android.graphics.Bitmap r11 = android.provider.MediaStore.Images.Media.getBitmap(r12, r11)     // Catch:{ Exception | OutOfMemoryError -> 0x05ae }
        L_0x059f:
            android.widget.ImageView r12 = r0.f20081w     // Catch:{ Exception | OutOfMemoryError -> 0x05ae }
            r12.setImageBitmap(r11)     // Catch:{ Exception | OutOfMemoryError -> 0x05ae }
            android.widget.ImageView r11 = r0.f20081w     // Catch:{ Exception | OutOfMemoryError -> 0x05ae }
            mega.boicot.profile$15 r12 = new mega.boicot.profile$15     // Catch:{ Exception | OutOfMemoryError -> 0x05ae }
            r12.<init>(r1)     // Catch:{ Exception | OutOfMemoryError -> 0x05ae }
            r11.setOnClickListener(r12)     // Catch:{ Exception | OutOfMemoryError -> 0x05ae }
        L_0x05ae:
            android.content.SharedPreferences r1 = r0.f20031aJ
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "fperfil_"
            r11.append(r12)
            java.lang.String r12 = r0.f20070l
            r11.append(r12)
            java.lang.String r12 = "_g"
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            java.lang.String r12 = ""
            java.lang.String r1 = r1.getString(r11, r12)
            java.lang.String r11 = r0.f20071m
            boolean r1 = r1.equals(r11)
            if (r1 != 0) goto L_0x05fd
            boolean r1 = r0.f20046am
            if (r1 == 0) goto L_0x05e2
            android.view.View r1 = r0.findViewById(r6)
            r1.setVisibility(r4)
            goto L_0x05e9
        L_0x05e2:
            android.view.View r1 = r0.findViewById(r7)
            r1.setVisibility(r4)
        L_0x05e9:
            mega.boicot.profile$q r1 = new mega.boicot.profile$q
            r6 = 0
            r1.<init>()
            java.lang.String[] r6 = new java.lang.String[r4]
            r1.execute(r6)
            goto L_0x05fd
        L_0x05f5:
            android.widget.ImageView r1 = r0.f20081w
            r1.setVisibility(r10)
            r17.mo21855h()
        L_0x05fd:
            int r1 = r0.f20061c
            if (r1 <= 0) goto L_0x0653
            mega.boicot.config r1 = r0.f20079u
            java.io.File r1 = r1.mo20757a(r0, r2)
            android.graphics.BitmapFactory$Options r6 = new android.graphics.BitmapFactory$Options     // Catch:{ Exception | OutOfMemoryError -> 0x0653 }
            r6.<init>()     // Catch:{ Exception | OutOfMemoryError -> 0x0653 }
            r6.inJustDecodeBounds = r2     // Catch:{ Exception | OutOfMemoryError -> 0x0653 }
            java.lang.String r7 = r1.getPath()     // Catch:{ Exception | OutOfMemoryError -> 0x0653 }
            android.graphics.BitmapFactory.decodeFile(r7, r6)     // Catch:{ Exception | OutOfMemoryError -> 0x0653 }
            int r7 = r6.outWidth     // Catch:{ Exception | OutOfMemoryError -> 0x0653 }
            r7 = 75
            r11 = 100
            int r12 = r6.outWidth     // Catch:{ Exception | OutOfMemoryError -> 0x0653 }
            int r6 = r6.outHeight     // Catch:{ Exception | OutOfMemoryError -> 0x0653 }
            if (r12 > r7) goto L_0x0625
            if (r6 > r11) goto L_0x0625
            r13 = r2
            goto L_0x0626
        L_0x0625:
            r13 = r4
        L_0x0626:
            if (r13 != 0) goto L_0x0645
            int r6 = mega.boicot.config.m23824a(r12, r6, r7, r11)     // Catch:{ Exception | OutOfMemoryError -> 0x0653 }
            float r7 = (float) r12     // Catch:{ Exception | OutOfMemoryError -> 0x0653 }
            float r6 = (float) r6     // Catch:{ Exception | OutOfMemoryError -> 0x0653 }
            float r7 = r7 / r6
            int r6 = java.lang.Math.round(r7)     // Catch:{ Exception | OutOfMemoryError -> 0x0653 }
            android.graphics.BitmapFactory$Options r7 = new android.graphics.BitmapFactory$Options     // Catch:{ Exception | OutOfMemoryError -> 0x0653 }
            r7.<init>()     // Catch:{ Exception | OutOfMemoryError -> 0x0653 }
            r7.inSampleSize = r6     // Catch:{ Exception | OutOfMemoryError -> 0x0653 }
            java.lang.String r1 = r1.getPath()     // Catch:{ Exception | OutOfMemoryError -> 0x0653 }
            android.graphics.Bitmap r1 = android.graphics.BitmapFactory.decodeFile(r1, r7)     // Catch:{ Exception | OutOfMemoryError -> 0x0653 }
            r0.f20050aq = r1     // Catch:{ Exception | OutOfMemoryError -> 0x0653 }
            goto L_0x0653
        L_0x0645:
            android.content.ContentResolver r6 = r17.getContentResolver()     // Catch:{ Exception | OutOfMemoryError -> 0x0653 }
            android.net.Uri r1 = android.net.Uri.fromFile(r1)     // Catch:{ Exception | OutOfMemoryError -> 0x0653 }
            android.graphics.Bitmap r1 = android.provider.MediaStore.Images.Media.getBitmap(r6, r1)     // Catch:{ Exception | OutOfMemoryError -> 0x0653 }
            r0.f20050aq = r1     // Catch:{ Exception | OutOfMemoryError -> 0x0653 }
        L_0x0653:
            r1 = 2131231175(0x7f0801c7, float:1.8078424E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            r0.f20011Q = r1
            android.os.Bundle r1 = r0.f20049ap
            java.lang.String r6 = "coments"
            java.lang.String r1 = r1.getString(r6)
            java.lang.String r6 = "1"
            boolean r1 = r1.equals(r6)
            r6 = -1
            if (r1 == 0) goto L_0x07a8
            android.os.Bundle r1 = r0.f20049ap
            java.lang.String r7 = "coments_chat"
            boolean r1 = r1.getBoolean(r7)
            if (r1 == 0) goto L_0x07a8
            r1 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            boolean r7 = r0.f20046am
            if (r7 != 0) goto L_0x0680
            r1 = r6
        L_0x0680:
            r7 = 2131231543(0x7f080337, float:1.807917E38)
            android.view.View r7 = r0.findViewById(r7)
            android.widget.TextView r7 = (android.widget.TextView) r7
            r7.setTextColor(r1)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r11 = "#"
            r7.append(r11)
            mega.boicot.config r11 = r0.f20079u
            java.lang.String r11 = r11.f17890aW
            r7.append(r11)
            java.lang.String r7 = r7.toString()
            boolean r7 = mega.boicot.config.m23844a(r7)
            if (r7 == 0) goto L_0x06b2
            r7 = 2131231073(0x7f080161, float:1.8078217E38)
            android.view.View r7 = r0.findViewById(r7)
            r7.setVisibility(r4)
            goto L_0x06bc
        L_0x06b2:
            r7 = 2131231072(0x7f080160, float:1.8078215E38)
            android.view.View r7 = r0.findViewById(r7)
            r7.setVisibility(r4)
        L_0x06bc:
            android.content.res.Resources r7 = r17.getResources()
            r11 = 2131165322(0x7f07008a, float:1.7944858E38)
            android.graphics.drawable.Drawable r7 = r7.getDrawable(r11)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "#"
            r11.append(r12)
            mega.boicot.config r12 = r0.f20079u
            java.lang.String r12 = r12.f17890aW
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            int r11 = android.graphics.Color.parseColor(r11)
            android.graphics.PorterDuff$Mode r12 = android.graphics.PorterDuff.Mode.MULTIPLY
            r7.setColorFilter(r11, r12)
            r11 = 2131231074(0x7f080162, float:1.8078219E38)
            android.view.View r11 = r0.findViewById(r11)
            android.widget.ImageView r11 = (android.widget.ImageView) r11
            r11.setImageDrawable(r7)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r11 = "#"
            r7.append(r11)
            mega.boicot.config r11 = r0.f20079u
            java.lang.String r11 = r11.f17890aW
            r7.append(r11)
            java.lang.String r7 = r7.toString()
            boolean r7 = mega.boicot.config.m23844a(r7)
            if (r7 == 0) goto L_0x0717
            r7 = 2131231098(0x7f08017a, float:1.8078267E38)
            android.view.View r7 = r0.findViewById(r7)
            r7.setVisibility(r4)
            goto L_0x0721
        L_0x0717:
            r7 = 2131231097(0x7f080179, float:1.8078265E38)
            android.view.View r7 = r0.findViewById(r7)
            r7.setVisibility(r4)
        L_0x0721:
            android.content.res.Resources r7 = r17.getResources()
            r11 = 2131165488(0x7f070130, float:1.7945195E38)
            android.graphics.drawable.Drawable r7 = r7.getDrawable(r11)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "#"
            r11.append(r12)
            mega.boicot.config r12 = r0.f20079u
            java.lang.String r12 = r12.f17890aW
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            int r11 = android.graphics.Color.parseColor(r11)
            android.graphics.PorterDuff$Mode r12 = android.graphics.PorterDuff.Mode.MULTIPLY
            r7.setColorFilter(r11, r12)
            r11 = 2131231096(0x7f080178, float:1.8078263E38)
            android.view.View r11 = r0.findViewById(r11)
            android.widget.ImageView r11 = (android.widget.ImageView) r11
            r11.setImageDrawable(r7)
            int r7 = android.os.Build.VERSION.SDK_INT
            if (r7 <= r8) goto L_0x0772
            r1 = 2131230927(0x7f0800cf, float:1.807792E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.EditText r1 = (android.widget.EditText) r1
            boolean r3 = r0.f20046am
            r3 = r3 ^ r2
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            mega.boicot.config r7 = r0.f20079u
            java.lang.String r7 = r7.f17890aW
            mega.boicot.config.m23837a(r1, r3, r7)
            goto L_0x0782
        L_0x0772:
            int r7 = android.os.Build.VERSION.SDK_INT
            if (r7 <= r3) goto L_0x0782
            r3 = 2131230927(0x7f0800cf, float:1.807792E38)
            android.view.View r3 = r0.findViewById(r3)
            android.widget.EditText r3 = (android.widget.EditText) r3
            r3.setTextColor(r1)
        L_0x0782:
            r1 = 2131231074(0x7f080162, float:1.8078219E38)
            android.view.View r1 = r0.findViewById(r1)
            r1.setOnClickListener(r0)
            r1 = 2131231096(0x7f080178, float:1.8078263E38)
            android.view.View r1 = r0.findViewById(r1)
            r1.setOnClickListener(r0)
            r1 = 2131231132(0x7f08019c, float:1.8078336E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            android.graphics.Bitmap r3 = r0.f20050aq
            r1.setImageBitmap(r3)
            r0.mo21852b(r2)
            goto L_0x07c1
        L_0x07a8:
            r1 = 2131231543(0x7f080337, float:1.807917E38)
            android.view.View r1 = r0.findViewById(r1)
            r1.setVisibility(r10)
            r1 = 2131231393(0x7f0802a1, float:1.8078866E38)
            android.view.View r1 = r0.findViewById(r1)
            r1.setVisibility(r10)
            android.widget.LinearLayout r1 = r0.f20011Q
            r1.setVisibility(r10)
        L_0x07c1:
            r0.f20062d = r4
            r0.f20044ak = r4
            r1 = 2131231075(0x7f080163, float:1.807822E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r0.f20082x = r1
            r1 = 2131231077(0x7f080165, float:1.8078225E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r0.f20083y = r1
            r1 = 2131231079(0x7f080167, float:1.8078229E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r0.f20084z = r1
            r1 = 2131231081(0x7f080169, float:1.8078233E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r0.f19995A = r1
            r1 = 2131231203(0x7f0801e3, float:1.807848E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            r0.f20012R = r1
            r1 = 2131231205(0x7f0801e5, float:1.8078484E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            r0.f20013S = r1
            r1 = 2131231207(0x7f0801e7, float:1.8078488E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            r0.f20014T = r1
            r1 = 2131231209(0x7f0801e9, float:1.8078493E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            r0.f20015U = r1
            r1 = 2131231573(0x7f080355, float:1.807923E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.f20020Z = r1
            r1 = 2131231575(0x7f080357, float:1.8079235E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.f20034aa = r1
            r1 = 2131231577(0x7f080359, float:1.8079239E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.f20035ab = r1
            r1 = 2131231579(0x7f08035b, float:1.8079243E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.f20036ac = r1
            boolean r1 = r0.f20046am
            r2 = 2131231494(0x7f080306, float:1.807907E38)
            if (r1 == 0) goto L_0x08b4
            r1 = 2131231278(0x7f08022e, float:1.8078633E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.ProgressBar r1 = (android.widget.ProgressBar) r1
            r0.f20001G = r1
            r1 = 2131231280(0x7f080230, float:1.8078637E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.ProgressBar r1 = (android.widget.ProgressBar) r1
            r0.f20002H = r1
            r1 = 2131231282(0x7f080232, float:1.807864E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.ProgressBar r1 = (android.widget.ProgressBar) r1
            r0.f20003I = r1
            r1 = 2131231284(0x7f080234, float:1.8078645E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.ProgressBar r1 = (android.widget.ProgressBar) r1
            r0.f20004J = r1
            r1 = 2131231389(0x7f08029d, float:1.8078858E38)
            android.view.View r1 = r0.findViewById(r1)
            java.lang.String r3 = "#FFEEEEEE"
            int r3 = android.graphics.Color.parseColor(r3)
            r1.setBackgroundColor(r3)
            r1 = 2131231570(0x7f080352, float:1.8079225E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            int r3 = mega.boicot.config.f17813a
            r1.setTextColor(r3)
            r1 = 2131231616(0x7f080380, float:1.8079318E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            int r3 = mega.boicot.config.f17813a
            r1.setTextColor(r3)
            android.view.View r1 = r0.findViewById(r2)
            android.widget.RelativeLayout r1 = (android.widget.RelativeLayout) r1
            int r3 = mega.boicot.config.f17824d
            r1.setBackgroundColor(r3)
            goto L_0x090f
        L_0x08b4:
            r1 = 2131231277(0x7f08022d, float:1.807863E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.ProgressBar r1 = (android.widget.ProgressBar) r1
            r0.f20001G = r1
            r1 = 2131231279(0x7f08022f, float:1.8078635E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.ProgressBar r1 = (android.widget.ProgressBar) r1
            r0.f20002H = r1
            r1 = 2131231281(0x7f080231, float:1.8078639E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.ProgressBar r1 = (android.widget.ProgressBar) r1
            r0.f20003I = r1
            r1 = 2131231283(0x7f080233, float:1.8078643E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.ProgressBar r1 = (android.widget.ProgressBar) r1
            r0.f20004J = r1
            r1 = 2131231389(0x7f08029d, float:1.8078858E38)
            android.view.View r1 = r0.findViewById(r1)
            int r3 = mega.boicot.config.f17838f
            r1.setBackgroundColor(r3)
            r1 = 2131231570(0x7f080352, float:1.8079225E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r1.setTextColor(r6)
            r1 = 2131231616(0x7f080380, float:1.8079318E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r1.setTextColor(r6)
            android.view.View r1 = r0.findViewById(r2)
            android.widget.RelativeLayout r1 = (android.widget.RelativeLayout) r1
            int r3 = mega.boicot.config.f17813a
            r1.setBackgroundColor(r3)
        L_0x090f:
            android.os.Bundle r1 = r0.f20049ap
            java.lang.String r3 = "galeria"
            boolean r1 = r1.getBoolean(r3)
            if (r1 == 0) goto L_0x0a70
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "#"
            r1.append(r2)
            mega.boicot.config r2 = r0.f20079u
            java.lang.String r2 = r2.f17890aW
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            boolean r1 = mega.boicot.config.m23844a(r1)
            if (r1 == 0) goto L_0x0949
            r1 = 2131231101(0x7f08017d, float:1.8078274E38)
            android.view.View r1 = r0.findViewById(r1)
            r1.setVisibility(r4)
            r1 = 2131231107(0x7f080183, float:1.8078286E38)
            android.view.View r1 = r0.findViewById(r1)
            r1.setVisibility(r4)
            goto L_0x095d
        L_0x0949:
            r1 = 2131231100(0x7f08017c, float:1.8078271E38)
            android.view.View r1 = r0.findViewById(r1)
            r1.setVisibility(r4)
            r1 = 2131231106(0x7f080182, float:1.8078284E38)
            android.view.View r1 = r0.findViewById(r1)
            r1.setVisibility(r4)
        L_0x095d:
            android.content.res.Resources r1 = r17.getResources()
            r2 = 2131165532(0x7f07015c, float:1.7945284E38)
            android.graphics.drawable.Drawable r1 = r1.getDrawable(r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "#"
            r2.append(r3)
            mega.boicot.config r3 = r0.f20079u
            java.lang.String r3 = r3.f17890aW
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            int r2 = android.graphics.Color.parseColor(r2)
            android.graphics.PorterDuff$Mode r3 = android.graphics.PorterDuff.Mode.MULTIPLY
            r1.setColorFilter(r2, r3)
            r2 = 2131231099(0x7f08017b, float:1.807827E38)
            android.view.View r2 = r0.findViewById(r2)
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            r2.setImageDrawable(r1)
            r1 = 2131231099(0x7f08017b, float:1.807827E38)
            android.view.View r1 = r0.findViewById(r1)
            r1.setOnClickListener(r0)
            android.content.res.Resources r1 = r17.getResources()
            r2 = 2131165268(0x7f070054, float:1.7944748E38)
            android.graphics.drawable.Drawable r1 = r1.getDrawable(r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "#"
            r2.append(r3)
            mega.boicot.config r3 = r0.f20079u
            java.lang.String r3 = r3.f17890aW
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            int r2 = android.graphics.Color.parseColor(r2)
            android.graphics.PorterDuff$Mode r3 = android.graphics.PorterDuff.Mode.MULTIPLY
            r1.setColorFilter(r2, r3)
            r2 = 2131231105(0x7f080181, float:1.8078282E38)
            android.view.View r2 = r0.findViewById(r2)
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            r2.setImageDrawable(r1)
            r1 = 2131231105(0x7f080181, float:1.8078282E38)
            android.view.View r1 = r0.findViewById(r1)
            r1.setOnClickListener(r0)
            r17.mo21857j()
            java.lang.String r1 = r0.f20070l
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            int r3 = r0.f20060b
            r2.append(r3)
            java.lang.String r3 = ""
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0a77
            r1 = 2131230826(0x7f08006a, float:1.8077716E38)
            android.view.View r2 = r0.findViewById(r1)
            android.widget.TextView r2 = (android.widget.TextView) r2
            android.content.res.Resources r3 = r17.getResources()
            r7 = 2131558446(0x7f0d002e, float:1.8742208E38)
            java.lang.String r3 = r3.getString(r7)
            java.lang.String r3 = r3.toUpperCase()
            r2.setText(r3)
            android.view.View r2 = r0.findViewById(r1)
            android.widget.TextView r2 = (android.widget.TextView) r2
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r7 = "#"
            r3.append(r7)
            mega.boicot.config r7 = r0.f20079u
            java.lang.String r7 = r7.f17890aW
            r3.append(r7)
            java.lang.String r3 = r3.toString()
            int r3 = android.graphics.Color.parseColor(r3)
            r2.setBackgroundColor(r3)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "#"
            r2.append(r3)
            mega.boicot.config r3 = r0.f20079u
            java.lang.String r3 = r3.f17890aW
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            boolean r2 = mega.boicot.config.m23844a(r2)
            if (r2 == 0) goto L_0x0a54
            int r2 = mega.boicot.config.f17813a
            goto L_0x0a55
        L_0x0a54:
            r2 = r6
        L_0x0a55:
            android.view.View r3 = r0.findViewById(r1)
            android.widget.TextView r3 = (android.widget.TextView) r3
            r3.setTextColor(r2)
            android.view.View r1 = r0.findViewById(r1)
            r1.setOnClickListener(r0)
            r1 = 2131231161(0x7f0801b9, float:1.8078395E38)
            android.view.View r1 = r0.findViewById(r1)
            r1.setVisibility(r4)
            goto L_0x0a77
        L_0x0a70:
            android.view.View r1 = r0.findViewById(r2)
            r1.setVisibility(r10)
        L_0x0a77:
            r0.f20063e = r4
            r0.f20045al = r4
            r1 = 2131231076(0x7f080164, float:1.8078223E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r0.f19996B = r1
            r1 = 2131231078(0x7f080166, float:1.8078227E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r0.f19997C = r1
            r1 = 2131231080(0x7f080168, float:1.807823E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r0.f19998D = r1
            r1 = 2131231082(0x7f08016a, float:1.8078235E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r0.f19999E = r1
            r1 = 2131231204(0x7f0801e4, float:1.8078482E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            r0.f20016V = r1
            r1 = 2131231206(0x7f0801e6, float:1.8078486E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            r0.f20017W = r1
            r1 = 2131231208(0x7f0801e8, float:1.807849E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            r0.f20018X = r1
            r1 = 2131231210(0x7f0801ea, float:1.8078495E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            r0.f20019Y = r1
            r1 = 2131231574(0x7f080356, float:1.8079233E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.f20037ad = r1
            r1 = 2131231576(0x7f080358, float:1.8079237E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.f20038ae = r1
            r1 = 2131231578(0x7f08035a, float:1.807924E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.f20039af = r1
            r1 = 2131231580(0x7f08035c, float:1.8079245E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.f20040ag = r1
            boolean r1 = r0.f20046am
            r2 = 2131231496(0x7f080308, float:1.8079075E38)
            if (r1 == 0) goto L_0x0b5c
            r1 = 2131231330(0x7f080262, float:1.8078738E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.ProgressBar r1 = (android.widget.ProgressBar) r1
            r0.f20005K = r1
            r1 = 2131231332(0x7f080264, float:1.8078742E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.ProgressBar r1 = (android.widget.ProgressBar) r1
            r0.f20006L = r1
            r1 = 2131231334(0x7f080266, float:1.8078746E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.ProgressBar r1 = (android.widget.ProgressBar) r1
            r0.f20007M = r1
            r1 = 2131231336(0x7f080268, float:1.807875E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.ProgressBar r1 = (android.widget.ProgressBar) r1
            r0.f20008N = r1
            r1 = 2131231390(0x7f08029e, float:1.807886E38)
            android.view.View r1 = r0.findViewById(r1)
            java.lang.String r3 = "#FFEEEEEE"
            int r3 = android.graphics.Color.parseColor(r3)
            r1.setBackgroundColor(r3)
            r1 = 2131231620(0x7f080384, float:1.8079326E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            int r3 = mega.boicot.config.f17813a
            r1.setTextColor(r3)
            android.view.View r1 = r0.findViewById(r2)
            android.widget.RelativeLayout r1 = (android.widget.RelativeLayout) r1
            int r3 = mega.boicot.config.f17824d
            r1.setBackgroundColor(r3)
            goto L_0x0bab
        L_0x0b5c:
            r1 = 2131231329(0x7f080261, float:1.8078736E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.ProgressBar r1 = (android.widget.ProgressBar) r1
            r0.f20005K = r1
            r1 = 2131231331(0x7f080263, float:1.807874E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.ProgressBar r1 = (android.widget.ProgressBar) r1
            r0.f20006L = r1
            r1 = 2131231333(0x7f080265, float:1.8078744E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.ProgressBar r1 = (android.widget.ProgressBar) r1
            r0.f20007M = r1
            r1 = 2131231335(0x7f080267, float:1.8078748E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.ProgressBar r1 = (android.widget.ProgressBar) r1
            r0.f20008N = r1
            r1 = 2131231390(0x7f08029e, float:1.807886E38)
            android.view.View r1 = r0.findViewById(r1)
            int r3 = mega.boicot.config.f17838f
            r1.setBackgroundColor(r3)
            r1 = 2131231620(0x7f080384, float:1.8079326E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r1.setTextColor(r6)
            android.view.View r1 = r0.findViewById(r2)
            android.widget.RelativeLayout r1 = (android.widget.RelativeLayout) r1
            int r3 = mega.boicot.config.f17813a
            r1.setBackgroundColor(r3)
        L_0x0bab:
            mega.boicot.config r1 = r0.f20079u
            boolean r1 = r1.f17932bM
            if (r1 == 0) goto L_0x0d06
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "#"
            r1.append(r2)
            mega.boicot.config r2 = r0.f20079u
            java.lang.String r2 = r2.f17890aW
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            boolean r1 = mega.boicot.config.m23844a(r1)
            if (r1 == 0) goto L_0x0be1
            r1 = 2131231104(0x7f080180, float:1.807828E38)
            android.view.View r1 = r0.findViewById(r1)
            r1.setVisibility(r4)
            r1 = 2131231110(0x7f080186, float:1.8078292E38)
            android.view.View r1 = r0.findViewById(r1)
            r1.setVisibility(r4)
            goto L_0x0bf5
        L_0x0be1:
            r1 = 2131231103(0x7f08017f, float:1.8078278E38)
            android.view.View r1 = r0.findViewById(r1)
            r1.setVisibility(r4)
            r1 = 2131231109(0x7f080185, float:1.807829E38)
            android.view.View r1 = r0.findViewById(r1)
            r1.setVisibility(r4)
        L_0x0bf5:
            android.content.res.Resources r1 = r17.getResources()
            r2 = 2131165532(0x7f07015c, float:1.7945284E38)
            android.graphics.drawable.Drawable r1 = r1.getDrawable(r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "#"
            r2.append(r3)
            mega.boicot.config r3 = r0.f20079u
            java.lang.String r3 = r3.f17890aW
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            int r2 = android.graphics.Color.parseColor(r2)
            android.graphics.PorterDuff$Mode r3 = android.graphics.PorterDuff.Mode.MULTIPLY
            r1.setColorFilter(r2, r3)
            r2 = 2131231102(0x7f08017e, float:1.8078276E38)
            android.view.View r2 = r0.findViewById(r2)
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            r2.setImageDrawable(r1)
            r1 = 2131231102(0x7f08017e, float:1.8078276E38)
            android.view.View r1 = r0.findViewById(r1)
            r1.setOnClickListener(r0)
            android.content.res.Resources r1 = r17.getResources()
            r2 = 2131165268(0x7f070054, float:1.7944748E38)
            android.graphics.drawable.Drawable r1 = r1.getDrawable(r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "#"
            r2.append(r3)
            mega.boicot.config r3 = r0.f20079u
            java.lang.String r3 = r3.f17890aW
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            int r2 = android.graphics.Color.parseColor(r2)
            android.graphics.PorterDuff$Mode r3 = android.graphics.PorterDuff.Mode.MULTIPLY
            r1.setColorFilter(r2, r3)
            r2 = 2131231108(0x7f080184, float:1.8078288E38)
            android.view.View r2 = r0.findViewById(r2)
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            r2.setImageDrawable(r1)
            r1 = 2131231108(0x7f080184, float:1.8078288E38)
            android.view.View r1 = r0.findViewById(r1)
            r1.setOnClickListener(r0)
            r17.mo21859l()
            java.lang.String r1 = r0.f20070l
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            int r3 = r0.f20060b
            r2.append(r3)
            java.lang.String r3 = ""
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0d0d
            r1 = 2131230835(0x7f080073, float:1.8077734E38)
            android.view.View r2 = r0.findViewById(r1)
            android.widget.TextView r2 = (android.widget.TextView) r2
            android.content.res.Resources r3 = r17.getResources()
            r7 = 2131558446(0x7f0d002e, float:1.8742208E38)
            java.lang.String r3 = r3.getString(r7)
            java.lang.String r3 = r3.toUpperCase()
            r2.setText(r3)
            android.view.View r2 = r0.findViewById(r1)
            android.widget.TextView r2 = (android.widget.TextView) r2
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r7 = "#"
            r3.append(r7)
            mega.boicot.config r7 = r0.f20079u
            java.lang.String r7 = r7.f17890aW
            r3.append(r7)
            java.lang.String r3 = r3.toString()
            int r3 = android.graphics.Color.parseColor(r3)
            r2.setBackgroundColor(r3)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "#"
            r2.append(r3)
            mega.boicot.config r3 = r0.f20079u
            java.lang.String r3 = r3.f17890aW
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            boolean r2 = mega.boicot.config.m23844a(r2)
            if (r2 == 0) goto L_0x0ceb
            int r6 = mega.boicot.config.f17813a
        L_0x0ceb:
            android.view.View r2 = r0.findViewById(r1)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r2.setTextColor(r6)
            android.view.View r1 = r0.findViewById(r1)
            r1.setOnClickListener(r0)
            r1 = 2131231162(0x7f0801ba, float:1.8078397E38)
            android.view.View r1 = r0.findViewById(r1)
            r1.setVisibility(r4)
            goto L_0x0d0d
        L_0x0d06:
            android.view.View r1 = r0.findViewById(r2)
            r1.setVisibility(r10)
        L_0x0d0d:
            java.lang.String r1 = r0.f20070l
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            int r3 = r0.f20060b
            r2.append(r3)
            java.lang.String r3 = ""
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0d33
            r1 = 2131231044(0x7f080144, float:1.8078158E38)
            android.view.View r1 = r0.findViewById(r1)
            r1.setVisibility(r10)
            goto L_0x0d3d
        L_0x0d33:
            r1 = 2131231044(0x7f080144, float:1.8078158E38)
            android.view.View r1 = r0.findViewById(r1)
            r1.setOnClickListener(r0)
        L_0x0d3d:
            android.os.Bundle r1 = r0.f20049ap
            java.lang.String r2 = "privados_chat"
            boolean r1 = r1.getBoolean(r2)
            r2 = 2131231117(0x7f08018d, float:1.8078306E38)
            if (r1 == 0) goto L_0x0de9
            android.os.Bundle r1 = r0.f20049ap
            java.lang.String r3 = "privados"
            java.lang.String r1 = r1.getString(r3)
            java.lang.String r3 = "1"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0de9
            java.lang.String r1 = r0.f20070l
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            int r6 = r0.f20060b
            r3.append(r6)
            java.lang.String r6 = ""
            r3.append(r6)
            java.lang.String r3 = r3.toString()
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x0de9
            android.os.Bundle r1 = r0.f20049ap
            java.lang.String r3 = "desdepriv"
            boolean r1 = r1.containsKey(r3)
            if (r1 != 0) goto L_0x0de9
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "#"
            r1.append(r3)
            mega.boicot.config r3 = r0.f20079u
            java.lang.String r3 = r3.f17890aW
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            boolean r1 = mega.boicot.config.m23844a(r1)
            if (r1 == 0) goto L_0x0da5
            r1 = 2131231047(0x7f080147, float:1.8078164E38)
            android.view.View r1 = r0.findViewById(r1)
            r1.setVisibility(r4)
            goto L_0x0daf
        L_0x0da5:
            r1 = 2131231046(0x7f080146, float:1.8078162E38)
            android.view.View r1 = r0.findViewById(r1)
            r1.setVisibility(r4)
        L_0x0daf:
            android.content.res.Resources r1 = r17.getResources()
            r3 = 2131165467(0x7f07011b, float:1.7945152E38)
            android.graphics.drawable.Drawable r1 = r1.getDrawable(r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r6 = "#"
            r3.append(r6)
            mega.boicot.config r6 = r0.f20079u
            java.lang.String r6 = r6.f17890aW
            r3.append(r6)
            java.lang.String r3 = r3.toString()
            int r3 = android.graphics.Color.parseColor(r3)
            android.graphics.PorterDuff$Mode r6 = android.graphics.PorterDuff.Mode.MULTIPLY
            r1.setColorFilter(r3, r6)
            android.view.View r3 = r0.findViewById(r2)
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            r3.setImageDrawable(r1)
            android.view.View r1 = r0.findViewById(r2)
            r1.setOnClickListener(r0)
            goto L_0x0df0
        L_0x0de9:
            android.view.View r1 = r0.findViewById(r2)
            r1.setVisibility(r10)
        L_0x0df0:
            r1 = 2131231582(0x7f08035e, float:1.807925E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r3 = 2131231583(0x7f08035f, float:1.8079251E38)
            android.view.View r3 = r0.findViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            r6 = 2131231083(0x7f08016b, float:1.8078237E38)
            android.view.View r6 = r0.findViewById(r6)
            android.widget.ImageView r6 = (android.widget.ImageView) r6
            r0.f20000F = r6
            java.lang.String r6 = r0.f20070l
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            int r8 = r0.f20060b
            r7.append(r8)
            java.lang.String r8 = ""
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto L_0x0ebf
            android.view.View r2 = r0.findViewById(r2)
            int r2 = r2.getVisibility()
            if (r2 != r10) goto L_0x0e6a
            android.widget.ImageView r2 = r0.f20000F
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            android.widget.RelativeLayout$LayoutParams r2 = (android.widget.RelativeLayout.LayoutParams) r2
            r3 = 1092616192(0x41200000, float:10.0)
            android.content.res.Resources r6 = r17.getResources()
            android.util.DisplayMetrics r6 = r6.getDisplayMetrics()
            float r6 = r6.density
            float r3 = r3 * r6
            float r3 = r3 + r9
            int r3 = (int) r3
            r2.rightMargin = r3
            android.widget.ImageView r3 = r0.f20000F
            r3.setLayoutParams(r2)
            android.view.ViewGroup$LayoutParams r2 = r1.getLayoutParams()
            android.widget.RelativeLayout$LayoutParams r2 = (android.widget.RelativeLayout.LayoutParams) r2
            r3 = 1116471296(0x428c0000, float:70.0)
            android.content.res.Resources r6 = r17.getResources()
            android.util.DisplayMetrics r6 = r6.getDisplayMetrics()
            float r6 = r6.density
            float r3 = r3 * r6
            float r3 = r3 + r9
            int r3 = (int) r3
            r2.rightMargin = r3
            r1.setLayoutParams(r2)
        L_0x0e6a:
            android.content.res.Resources r2 = r17.getResources()
            r3 = 2131165481(0x7f070129, float:1.794518E38)
            android.graphics.drawable.Drawable r2 = r2.getDrawable(r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r6 = "#"
            r3.append(r6)
            mega.boicot.config r6 = r0.f20079u
            java.lang.String r6 = r6.f17890aW
            r3.append(r6)
            java.lang.String r3 = r3.toString()
            int r3 = android.graphics.Color.parseColor(r3)
            android.graphics.PorterDuff$Mode r6 = android.graphics.PorterDuff.Mode.MULTIPLY
            r2.setColorFilter(r3, r6)
            r1.setBackgroundDrawable(r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "#"
            r2.append(r3)
            mega.boicot.config r3 = r0.f20079u
            java.lang.String r3 = r3.f17890aW
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            boolean r2 = mega.boicot.config.m23844a(r2)
            if (r2 == 0) goto L_0x0eb6
            int r2 = mega.boicot.config.f17813a
            r1.setTextColor(r2)
        L_0x0eb6:
            r1.setOnClickListener(r0)
            android.widget.ImageView r1 = r0.f20000F
            r1.setOnClickListener(r0)
            goto L_0x0f13
        L_0x0ebf:
            android.content.res.Resources r1 = r17.getResources()
            r2 = 2131165484(0x7f07012c, float:1.7945186E38)
            android.graphics.drawable.Drawable r1 = r1.getDrawable(r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r6 = "#"
            r2.append(r6)
            mega.boicot.config r6 = r0.f20079u
            java.lang.String r6 = r6.f17890aW
            r2.append(r6)
            java.lang.String r2 = r2.toString()
            int r2 = android.graphics.Color.parseColor(r2)
            android.graphics.PorterDuff$Mode r6 = android.graphics.PorterDuff.Mode.MULTIPLY
            r1.setColorFilter(r2, r6)
            r3.setBackgroundDrawable(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "#"
            r1.append(r2)
            mega.boicot.config r2 = r0.f20079u
            java.lang.String r2 = r2.f17890aW
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            boolean r1 = mega.boicot.config.m23844a(r1)
            if (r1 == 0) goto L_0x0f0b
            int r1 = mega.boicot.config.f17813a
            r3.setTextColor(r1)
        L_0x0f0b:
            r3.setOnClickListener(r0)
            android.widget.ImageView r1 = r0.f20000F
            r1.setVisibility(r10)
        L_0x0f13:
            android.view.Window r1 = r17.getWindow()
            r1.setSoftInputMode(r5)
            mega.boicot.profile$k r1 = new mega.boicot.profile$k
            r2 = 0
            r1.<init>()
            java.lang.String[] r2 = new java.lang.String[r4]
            r1.execute(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: mega.boicot.profile.onCreate(android.os.Bundle):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:49:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x012c  */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m24507m() {
        /*
            r9 = this;
            java.lang.String r0 = r9.f20070l
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            int r2 = r9.f20060b
            r1.append(r2)
            java.lang.String r2 = ""
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            boolean r0 = r0.equals(r1)
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x006e
            mega.boicot.config r0 = r9.f20079u
            java.lang.String r0 = r0.f18010cu
            java.lang.String r3 = ""
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L_0x0037
            mega.boicot.config r0 = r9.f20079u
            int r0 = r0.f17990cS
            if (r0 == 0) goto L_0x0037
            mega.boicot.config r0 = r9.f20079u
            int r0 = r0.f17991cT
            if (r0 == 0) goto L_0x0037
            r0 = r1
            goto L_0x0038
        L_0x0037:
            r0 = r2
        L_0x0038:
            mega.boicot.config r3 = r9.f20079u
            java.lang.String r3 = r3.f17978cG
            java.lang.String r4 = ""
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x0056
            mega.boicot.config r3 = r9.f20079u
            java.util.ArrayList<com.appnext.nativeads.NativeAd> r3 = r3.f18072eq
            if (r3 == 0) goto L_0x0056
            mega.boicot.config r3 = r9.f20079u
            java.util.ArrayList<com.appnext.nativeads.NativeAd> r3 = r3.f18072eq
            int r3 = r3.size()
            if (r3 <= 0) goto L_0x0056
            r3 = r1
            goto L_0x0057
        L_0x0056:
            r3 = r2
        L_0x0057:
            mega.boicot.config r4 = r9.f20079u
            java.lang.String r4 = r4.f17981cJ
            java.lang.String r5 = ""
            boolean r4 = r4.equals(r5)
            r4 = r4 ^ r1
            mega.boicot.config r5 = r9.f20079u
            java.lang.String r5 = r5.f17983cL
            java.lang.String r6 = ""
            boolean r5 = r5.equals(r6)
            r5 = r5 ^ r1
            goto L_0x0072
        L_0x006e:
            r0 = r2
            r3 = r0
            r4 = r3
            r5 = r4
        L_0x0072:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            if (r0 == 0) goto L_0x0080
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r6.add(r0)
        L_0x0080:
            r0 = 2
            if (r3 == 0) goto L_0x008a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            r6.add(r3)
        L_0x008a:
            r3 = 3
            if (r4 == 0) goto L_0x0094
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            r6.add(r4)
        L_0x0094:
            r4 = 4
            if (r5 == 0) goto L_0x009e
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            r6.add(r5)
        L_0x009e:
            boolean r5 = r6.isEmpty()
            if (r5 != 0) goto L_0x00c0
            java.util.Random r5 = new java.util.Random
            r5.<init>()
            int r7 = r6.size()
            int r7 = r7 - r1
            int r7 = r7 - r2
            int r7 = r7 + r1
            int r5 = r5.nextInt(r7)
            int r5 = r5 + r2
            java.lang.Object r5 = r6.get(r5)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            goto L_0x00c1
        L_0x00c0:
            r5 = r2
        L_0x00c1:
            if (r5 != r1) goto L_0x00c7
            r0 = r2
            r3 = r0
        L_0x00c5:
            r4 = r3
            goto L_0x00de
        L_0x00c7:
            if (r5 != r0) goto L_0x00cd
            r0 = r1
            r1 = r2
        L_0x00cb:
            r3 = r1
            goto L_0x00c5
        L_0x00cd:
            if (r5 != r3) goto L_0x00d4
            r3 = r1
            r0 = r2
            r1 = r0
            r4 = r1
            goto L_0x00de
        L_0x00d4:
            if (r5 != r4) goto L_0x00db
            r4 = r1
            r0 = r2
            r1 = r0
            r3 = r1
            goto L_0x00de
        L_0x00db:
            r0 = r2
            r1 = r0
            goto L_0x00cb
        L_0x00de:
            r5 = 2131231215(0x7f0801ef, float:1.8078505E38)
            r6 = 8
            r7 = 2131231216(0x7f0801f0, float:1.8078507E38)
            r8 = 2131231517(0x7f08031d, float:1.8079117E38)
            if (r1 == 0) goto L_0x012c
            com.google.android.gms.ads.AdView r0 = new com.google.android.gms.ads.AdView
            r0.<init>(r9)
            com.google.android.gms.ads.d r1 = com.google.android.gms.ads.C2973d.f8693c
            r0.setAdSize(r1)
            mega.boicot.config r1 = r9.f20079u
            java.lang.String r1 = r1.f18010cu
            r0.setAdUnitId(r1)
            android.view.View r1 = r9.findViewById(r8)
            r1.setVisibility(r6)
            android.view.View r1 = r9.findViewById(r5)
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            r1.setVisibility(r2)
            android.view.View r1 = r9.findViewById(r7)
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            r1.removeAllViews()
            android.view.View r1 = r9.findViewById(r7)
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            r1.addView(r0)
            com.google.android.gms.ads.c$a r1 = new com.google.android.gms.ads.c$a
            r1.<init>()
            com.google.android.gms.ads.c r1 = r1.mo12209a()
            r0.mo12166a(r1)
            goto L_0x01c9
        L_0x012c:
            if (r0 == 0) goto L_0x015d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "#"
            r0.append(r1)
            java.lang.String r1 = r9.f20075q
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            boolean r0 = mega.boicot.config.m23844a(r0)
            if (r0 == 0) goto L_0x0152
            android.view.View r0 = r9.findViewById(r8)
            android.widget.TextView r0 = (android.widget.TextView) r0
            int r1 = mega.boicot.config.f17813a
            r0.setTextColor(r1)
        L_0x0152:
            mega.boicot.config r2 = r9.f20079u
            r4 = 1
            r5 = 2
            r6 = -1
            r7 = 0
            r3 = r9
            r2.mo20765a(r3, r4, r5, r6, r7)
            goto L_0x01c9
        L_0x015d:
            if (r3 == 0) goto L_0x017b
            com.facebook.ads.NativeBannerAd r0 = new com.facebook.ads.NativeBannerAd
            mega.boicot.config r1 = r9.f20079u
            java.lang.String r1 = r1.f17981cJ
            r0.<init>(r9, r1)
            mega.boicot.profile$16 r1 = new mega.boicot.profile$16
            r1.<init>(r0)
            r0.setAdListener(r1)
            android.view.View r1 = r9.findViewById(r8)
            r1.setVisibility(r6)
            r0.loadAd()
            goto L_0x01c9
        L_0x017b:
            if (r4 == 0) goto L_0x01c1
            com.startapp.android.publish.ads.banner.Banner r0 = new com.startapp.android.publish.ads.banner.Banner
            r0.<init>(r9)
            java.lang.String r1 = "BANNER PROFILE"
            r0.setAdTag(r1)
            android.widget.RelativeLayout$LayoutParams r1 = new android.widget.RelativeLayout$LayoutParams
            r3 = -2
            r1.<init>(r3, r3)
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 17
            if (r3 < r4) goto L_0x0199
            r3 = 20
            r1.addRule(r3)
            goto L_0x019e
        L_0x0199:
            r3 = 9
            r1.addRule(r3)
        L_0x019e:
            android.view.View r3 = r9.findViewById(r8)
            r3.setVisibility(r6)
            android.view.View r3 = r9.findViewById(r5)
            android.widget.LinearLayout r3 = (android.widget.LinearLayout) r3
            r3.setVisibility(r2)
            android.view.View r2 = r9.findViewById(r7)
            android.widget.LinearLayout r2 = (android.widget.LinearLayout) r2
            r2.removeAllViews()
            android.view.View r2 = r9.findViewById(r7)
            android.widget.LinearLayout r2 = (android.widget.LinearLayout) r2
            r2.addView(r0, r1)
            goto L_0x01c9
        L_0x01c1:
            mega.boicot.config r0 = r9.f20079u
            mega.boicot.c r0 = r0.mo20760a(r9, r2)
            r9.f20048ao = r0
        L_0x01c9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: mega.boicot.profile.m24507m():void");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo21849a(String str) {
        Bitmap bitmap;
        File file = new File(str);
        boolean z = false;
        if (file.length() == 0) {
            return false;
        }
        if (file.length() > 55574528) {
            final AlertDialog create = new Builder(this).setCancelable(false).setPositiveButton(getString(R.string.aceptar), null).setMessage(R.string.vidlargo).create();
            if (!this.f20074p.equals("")) {
                create.setOnShowListener(new OnShowListener() {
                    public void onShow(DialogInterface dialogInterface) {
                        Button button = create.getButton(-1);
                        StringBuilder sb = new StringBuilder();
                        sb.append("#");
                        sb.append(profile.this.f20074p);
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
        Bitmap createVideoThumbnail = ThumbnailUtils.createVideoThumbnail(str, 3);
        try {
            createVideoThumbnail.compress(CompressFormat.JPEG, 100, new FileOutputStream(this.f20079u.mo20757a((Context) this, 99)));
        } catch (Exception unused2) {
        }
        try {
            File a = this.f20079u.mo20757a((Context) this, 99);
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
            bitmap.compress(CompressFormat.JPEG, 75, new FileOutputStream(this.f20079u.mo20757a((Context) this, 99)));
        } catch (Exception unused3) {
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Can't wrap try/catch for region: R(8:90|91|(1:95)|96|97|98|99|100) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:99:0x026d */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x011b A[SYNTHETIC, Splitter:B:48:0x011b] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0163 A[Catch:{ Exception -> 0x019f }] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x017e A[Catch:{ Exception -> 0x019f }] */
    /* JADX WARNING: Removed duplicated region for block: B:68:? A[ExcHandler: OutOfMemoryError (unused java.lang.OutOfMemoryError), SYNTHETIC, Splitter:B:63:0x0192] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x01a6  */
    /* JADX WARNING: Removed duplicated region for block: B:87:? A[ExcHandler: OutOfMemoryError (unused java.lang.OutOfMemoryError), SYNTHETIC, Splitter:B:82:0x01ec] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onActivityResult(int r20, int r21, android.content.Intent r22) {
        /*
            r19 = this;
            r1 = r19
            r2 = r20
            r3 = r22
            r4 = -1
            r5 = r21
            if (r5 != r4) goto L_0x0753
            r5 = 99
            r7 = 3
            r8 = 0
            if (r2 != r7) goto L_0x005a
            android.net.Uri r2 = r22.getData()
            android.content.Context r3 = r19.getApplicationContext()
            java.lang.String r2 = mega.boicot.config.m23830a(r2, r3)
            if (r2 == 0) goto L_0x0753
            java.lang.String r3 = ""
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto L_0x0753
            boolean r3 = r1.mo21849a(r2)
            if (r3 != 0) goto L_0x002e
            return
        L_0x002e:
            r6 = 100
        L_0x0030:
            mega.boicot.config r3 = r1.f20079u
            java.io.File r3 = r3.mo20757a(r1, r6)
            boolean r3 = r3.exists()
            if (r3 == 0) goto L_0x003f
            int r6 = r6 + 1
            goto L_0x0030
        L_0x003f:
            mega.boicot.config r3 = r1.f20079u
            java.io.File r3 = r3.mo20757a(r1, r5)
            mega.boicot.config r4 = r1.f20079u
            java.io.File r4 = r4.mo20757a(r1, r6)
            r3.renameTo(r4)
            mega.boicot.profile$p r3 = new mega.boicot.profile$p
            r3.<init>(r6, r2)
            java.lang.String[] r2 = new java.lang.String[r8]
            r3.execute(r2)
            goto L_0x0753
        L_0x005a:
            r9 = 4
            if (r2 != r9) goto L_0x00a6
            android.net.Uri r2 = r22.getData()
            android.content.Context r3 = r19.getApplicationContext()
            java.lang.String r2 = mega.boicot.config.m23830a(r2, r3)
            if (r2 == 0) goto L_0x0753
            java.lang.String r3 = ""
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto L_0x0753
            boolean r3 = r1.mo21849a(r2)
            if (r3 != 0) goto L_0x007a
            return
        L_0x007a:
            r6 = 100
        L_0x007c:
            mega.boicot.config r3 = r1.f20079u
            java.io.File r3 = r3.mo20757a(r1, r6)
            boolean r3 = r3.exists()
            if (r3 == 0) goto L_0x008b
            int r6 = r6 + 1
            goto L_0x007c
        L_0x008b:
            mega.boicot.config r3 = r1.f20079u
            java.io.File r3 = r3.mo20757a(r1, r5)
            mega.boicot.config r4 = r1.f20079u
            java.io.File r4 = r4.mo20757a(r1, r6)
            r3.renameTo(r4)
            mega.boicot.profile$p r3 = new mega.boicot.profile$p
            r3.<init>(r6, r2)
            java.lang.String[] r2 = new java.lang.String[r8]
            r3.execute(r2)
            goto L_0x0753
        L_0x00a6:
            r5 = 2
            r10 = 1
            if (r2 != r10) goto L_0x020b
            java.io.File r2 = new java.io.File     // Catch:{ Exception -> 0x0113 }
            mega.boicot.config r3 = r1.f20079u     // Catch:{ Exception -> 0x0113 }
            java.lang.String r11 = "fperfilgal_temp"
            java.io.File r3 = r3.mo20759a(r1, r11)     // Catch:{ Exception -> 0x0113 }
            java.lang.String r3 = r3.getAbsolutePath()     // Catch:{ Exception -> 0x0113 }
            r2.<init>(r3)     // Catch:{ Exception -> 0x0113 }
            long r2 = r2.length()     // Catch:{ Exception -> 0x0113 }
            android.content.Context r11 = r19.getApplicationContext()     // Catch:{ Exception -> 0x0113 }
            android.content.ContentResolver r12 = r11.getContentResolver()     // Catch:{ Exception -> 0x0113 }
            android.net.Uri r13 = android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI     // Catch:{ Exception -> 0x0113 }
            java.lang.String[] r14 = new java.lang.String[r5]     // Catch:{ Exception -> 0x0113 }
            java.lang.String r5 = "orientation"
            r14[r8] = r5     // Catch:{ Exception -> 0x0113 }
            java.lang.String r5 = "_size"
            r14[r10] = r5     // Catch:{ Exception -> 0x0113 }
            java.lang.String r15 = "date_added>=?"
            java.lang.String[] r5 = new java.lang.String[r10]     // Catch:{ Exception -> 0x0113 }
            long r6 = r1.f20021a     // Catch:{ Exception -> 0x0113 }
            r16 = 1000(0x3e8, double:4.94E-321)
            long r6 = r6 / r16
            r16 = 1
            long r9 = r6 - r16
            java.lang.String r6 = java.lang.String.valueOf(r9)     // Catch:{ Exception -> 0x0113 }
            r5[r8] = r6     // Catch:{ Exception -> 0x0113 }
            java.lang.String r17 = "date_added desc"
            r16 = r5
            android.database.Cursor r5 = r12.query(r13, r14, r15, r16, r17)     // Catch:{ Exception -> 0x0113 }
            if (r5 == 0) goto L_0x0118
            long r6 = r1.f20021a     // Catch:{ Exception -> 0x0113 }
            r9 = 0
            int r11 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r11 == 0) goto L_0x0118
            int r6 = r5.getCount()     // Catch:{ Exception -> 0x0113 }
            if (r6 == 0) goto L_0x0118
        L_0x00ff:
            boolean r6 = r5.moveToNext()     // Catch:{ Exception -> 0x0113 }
            if (r6 == 0) goto L_0x0118
            r6 = 1
            long r9 = r5.getLong(r6)     // Catch:{ Exception -> 0x0113 }
            int r6 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r6 != 0) goto L_0x00ff
            int r2 = r5.getInt(r8)     // Catch:{ Exception -> 0x0113 }
            goto L_0x0119
        L_0x0113:
            r0 = move-exception
            r2 = r0
            r2.printStackTrace()
        L_0x0118:
            r2 = r4
        L_0x0119:
            if (r2 != r4) goto L_0x0139
            android.media.ExifInterface r3 = new android.media.ExifInterface     // Catch:{ IOException -> 0x0134 }
            mega.boicot.config r5 = r1.f20079u     // Catch:{ IOException -> 0x0134 }
            java.lang.String r6 = "fperfilgal_temp"
            java.io.File r5 = r5.mo20759a(r1, r6)     // Catch:{ IOException -> 0x0134 }
            java.lang.String r5 = r5.getAbsolutePath()     // Catch:{ IOException -> 0x0134 }
            r3.<init>(r5)     // Catch:{ IOException -> 0x0134 }
            java.lang.String r5 = "Orientation"
            int r3 = r3.getAttributeInt(r5, r4)     // Catch:{ IOException -> 0x0134 }
            r2 = r3
            goto L_0x0139
        L_0x0134:
            r0 = move-exception
            r3 = r0
            r3.printStackTrace()
        L_0x0139:
            mega.boicot.config r3 = r1.f20079u     // Catch:{ Exception -> 0x019f }
            java.lang.String r5 = "fperfilgal_temp"
            java.io.File r3 = r3.mo20759a(r1, r5)     // Catch:{ Exception -> 0x019f }
            android.graphics.BitmapFactory$Options r5 = new android.graphics.BitmapFactory$Options     // Catch:{ Exception -> 0x019f }
            r5.<init>()     // Catch:{ Exception -> 0x019f }
            r6 = 1
            r5.inJustDecodeBounds = r6     // Catch:{ Exception -> 0x019f }
            java.lang.String r6 = r3.getPath()     // Catch:{ Exception -> 0x019f }
            android.graphics.BitmapFactory.decodeFile(r6, r5)     // Catch:{ Exception -> 0x019f }
            int r6 = r5.outWidth     // Catch:{ Exception -> 0x019f }
            int r6 = r5.outWidth     // Catch:{ Exception -> 0x019f }
            int r5 = r5.outHeight     // Catch:{ Exception -> 0x019f }
            r7 = 600(0x258, float:8.41E-43)
            if (r6 > r7) goto L_0x015f
            if (r5 > r7) goto L_0x015f
            r18 = 1
            goto L_0x0161
        L_0x015f:
            r18 = r8
        L_0x0161:
            if (r18 != 0) goto L_0x017e
            int r5 = mega.boicot.config.m23824a(r6, r5, r7, r7)     // Catch:{ Exception -> 0x019f }
            float r6 = (float) r6     // Catch:{ Exception -> 0x019f }
            float r5 = (float) r5     // Catch:{ Exception -> 0x019f }
            float r6 = r6 / r5
            int r5 = java.lang.Math.round(r6)     // Catch:{ Exception -> 0x019f }
            android.graphics.BitmapFactory$Options r6 = new android.graphics.BitmapFactory$Options     // Catch:{ Exception -> 0x019f }
            r6.<init>()     // Catch:{ Exception -> 0x019f }
            r6.inSampleSize = r5     // Catch:{ Exception -> 0x019f }
            java.lang.String r3 = r3.getPath()     // Catch:{ Exception -> 0x019f }
            android.graphics.Bitmap r3 = android.graphics.BitmapFactory.decodeFile(r3, r6)     // Catch:{ Exception -> 0x019f }
            goto L_0x018a
        L_0x017e:
            android.content.ContentResolver r5 = r19.getContentResolver()     // Catch:{ Exception -> 0x019f }
            android.net.Uri r3 = android.net.Uri.fromFile(r3)     // Catch:{ Exception -> 0x019f }
            android.graphics.Bitmap r3 = android.provider.MediaStore.Images.Media.getBitmap(r5, r3)     // Catch:{ Exception -> 0x019f }
        L_0x018a:
            mega.boicot.config r5 = r1.f20079u     // Catch:{ Exception -> 0x019f }
            java.lang.String r6 = "fperfilgal_temp"
            java.io.File r5 = r5.mo20759a(r1, r6)     // Catch:{ Exception -> 0x019f }
            java.io.FileOutputStream r6 = new java.io.FileOutputStream     // Catch:{ OutOfMemoryError -> 0x01a4, OutOfMemoryError -> 0x01a4 }
            r6.<init>(r5)     // Catch:{ OutOfMemoryError -> 0x01a4, OutOfMemoryError -> 0x01a4 }
            android.graphics.Bitmap$CompressFormat r5 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ OutOfMemoryError -> 0x01a4, OutOfMemoryError -> 0x01a4 }
            r7 = 100
            r3.compress(r5, r7, r6)     // Catch:{ OutOfMemoryError -> 0x01a4, OutOfMemoryError -> 0x01a4 }
            goto L_0x01a4
        L_0x019f:
            r0 = move-exception
            r3 = r0
            r3.printStackTrace()
        L_0x01a4:
            if (r2 == r4) goto L_0x01fe
            android.graphics.Matrix r14 = new android.graphics.Matrix
            r14.<init>()
            r3 = 3
            if (r2 != r3) goto L_0x01b1
            r2 = 180(0xb4, float:2.52E-43)
            goto L_0x01bf
        L_0x01b1:
            r3 = 8
            if (r2 != r3) goto L_0x01b8
            r2 = 270(0x10e, float:3.78E-43)
            goto L_0x01bf
        L_0x01b8:
            r3 = 6
            if (r2 != r3) goto L_0x01be
            r2 = 90
            goto L_0x01bf
        L_0x01be:
            r2 = r8
        L_0x01bf:
            if (r2 <= 0) goto L_0x01fe
            mega.boicot.config r3 = r1.f20079u     // Catch:{ Exception -> 0x01f9 }
            java.lang.String r4 = "fperfilgal_temp"
            java.io.File r3 = r3.mo20759a(r1, r4)     // Catch:{ Exception -> 0x01f9 }
            java.lang.String r3 = r3.getAbsolutePath()     // Catch:{ Exception -> 0x01f9 }
            android.graphics.Bitmap r9 = android.graphics.BitmapFactory.decodeFile(r3)     // Catch:{ Exception -> 0x01f9 }
            float r2 = (float) r2     // Catch:{ Exception -> 0x01f9 }
            r14.postRotate(r2)     // Catch:{ Exception -> 0x01f9 }
            r10 = 0
            r11 = 0
            int r12 = r9.getWidth()     // Catch:{ Exception -> 0x01f9 }
            int r13 = r9.getHeight()     // Catch:{ Exception -> 0x01f9 }
            r15 = 1
            android.graphics.Bitmap r2 = android.graphics.Bitmap.createBitmap(r9, r10, r11, r12, r13, r14, r15)     // Catch:{ Exception -> 0x01f9 }
            mega.boicot.config r3 = r1.f20079u     // Catch:{ Exception -> 0x01f9 }
            java.lang.String r4 = "fperfilgal_temp"
            java.io.File r3 = r3.mo20759a(r1, r4)     // Catch:{ Exception -> 0x01f9 }
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch:{ OutOfMemoryError -> 0x01fe, OutOfMemoryError -> 0x01fe }
            r4.<init>(r3)     // Catch:{ OutOfMemoryError -> 0x01fe, OutOfMemoryError -> 0x01fe }
            android.graphics.Bitmap$CompressFormat r3 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ OutOfMemoryError -> 0x01fe, OutOfMemoryError -> 0x01fe }
            r5 = 100
            r2.compress(r3, r5, r4)     // Catch:{ OutOfMemoryError -> 0x01fe, OutOfMemoryError -> 0x01fe }
            goto L_0x01fe
        L_0x01f9:
            r0 = move-exception
            r2 = r0
            r2.printStackTrace()
        L_0x01fe:
            mega.boicot.profile$n r2 = new mega.boicot.profile$n
            r3 = 0
            r2.<init>()
            java.lang.String[] r3 = new java.lang.String[r8]
            r2.execute(r3)
            goto L_0x0753
        L_0x020b:
            if (r2 != r5) goto L_0x027d
            android.net.Uri r2 = r22.getData()
            r3 = 1
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch:{ Exception | OutOfMemoryError -> 0x0753 }
            java.lang.String r5 = "orientation"
            r3[r8] = r5     // Catch:{ Exception | OutOfMemoryError -> 0x0753 }
            android.content.ContentResolver r9 = r19.getContentResolver()     // Catch:{ Exception | OutOfMemoryError -> 0x0753 }
            r12 = 0
            r13 = 0
            r14 = 0
            r10 = r2
            r11 = r3
            android.database.Cursor r5 = r9.query(r10, r11, r12, r13, r14)     // Catch:{ Exception | OutOfMemoryError -> 0x0753 }
            if (r5 == 0) goto L_0x0237
            boolean r6 = r5.moveToFirst()     // Catch:{ Exception | OutOfMemoryError -> 0x0753 }
            if (r6 == 0) goto L_0x0237
            r3 = r3[r8]     // Catch:{ Exception | OutOfMemoryError -> 0x0753 }
            int r3 = r5.getColumnIndex(r3)     // Catch:{ Exception | OutOfMemoryError -> 0x0753 }
            int r4 = r5.getInt(r3)     // Catch:{ Exception | OutOfMemoryError -> 0x0753 }
        L_0x0237:
            android.graphics.Matrix r14 = new android.graphics.Matrix     // Catch:{ Exception | OutOfMemoryError -> 0x0753 }
            r14.<init>()     // Catch:{ Exception | OutOfMemoryError -> 0x0753 }
            float r3 = (float) r4     // Catch:{ Exception | OutOfMemoryError -> 0x0753 }
            r14.postRotate(r3)     // Catch:{ Exception | OutOfMemoryError -> 0x0753 }
            mega.boicot.config r3 = r1.f20079u     // Catch:{ Exception | OutOfMemoryError -> 0x0753 }
            r4 = 300(0x12c, float:4.2E-43)
            r5 = 400(0x190, float:5.6E-43)
            android.graphics.Bitmap r9 = r3.mo20756a(r2, r4, r5)     // Catch:{ Exception | OutOfMemoryError -> 0x0753 }
            r10 = 0
            r11 = 0
            int r12 = r9.getWidth()     // Catch:{ Exception | OutOfMemoryError -> 0x0753 }
            int r13 = r9.getHeight()     // Catch:{ Exception | OutOfMemoryError -> 0x0753 }
            r15 = 1
            android.graphics.Bitmap r2 = android.graphics.Bitmap.createBitmap(r9, r10, r11, r12, r13, r14, r15)     // Catch:{ Exception | OutOfMemoryError -> 0x0753 }
            mega.boicot.config r3 = r1.f20079u     // Catch:{ Exception | OutOfMemoryError -> 0x0753 }
            java.lang.String r4 = "fperfilgal_temp"
            java.io.File r3 = r3.mo20759a(r1, r4)     // Catch:{ Exception | OutOfMemoryError -> 0x0753 }
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch:{ Exception | OutOfMemoryError -> 0x026d }
            r4.<init>(r3)     // Catch:{ Exception | OutOfMemoryError -> 0x026d }
            android.graphics.Bitmap$CompressFormat r3 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ Exception | OutOfMemoryError -> 0x026d }
            r5 = 100
            r2.compress(r3, r5, r4)     // Catch:{ Exception | OutOfMemoryError -> 0x026d }
        L_0x026d:
            r2.recycle()     // Catch:{ Exception | OutOfMemoryError -> 0x0753 }
            mega.boicot.profile$n r2 = new mega.boicot.profile$n     // Catch:{ Exception | OutOfMemoryError -> 0x0753 }
            r6 = 0
            r2.<init>()     // Catch:{ Exception | OutOfMemoryError -> 0x0753 }
            java.lang.String[] r3 = new java.lang.String[r8]     // Catch:{ Exception | OutOfMemoryError -> 0x0753 }
            r2.execute(r3)     // Catch:{ Exception | OutOfMemoryError -> 0x0753 }
            goto L_0x0753
        L_0x027d:
            r6 = 0
            if (r3 == 0) goto L_0x02c0
            java.lang.String r2 = "accion_usu_fav_id"
            boolean r2 = r3.hasExtra(r2)
            if (r2 == 0) goto L_0x02c0
            r2 = r8
        L_0x0289:
            java.util.ArrayList<mega.boicot.o> r4 = r1.f20032aK
            int r4 = r4.size()
            if (r2 >= r4) goto L_0x0753
            java.util.ArrayList<mega.boicot.o> r4 = r1.f20032aK
            java.lang.Object r4 = r4.get(r2)
            mega.boicot.o r4 = (mega.boicot.C6029o) r4
            java.lang.String r4 = r4.f19938f
            java.lang.String r5 = "accion_usu_fav_id"
            java.lang.String r5 = r3.getStringExtra(r5)
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x02bd
            java.util.ArrayList<mega.boicot.o> r4 = r1.f20032aK
            java.lang.Object r2 = r4.get(r2)
            mega.boicot.o r2 = (mega.boicot.C6029o) r2
            java.lang.String r4 = "accion_usu_fav_accion"
            boolean r3 = r3.getBooleanExtra(r4, r8)
            r2.f19936d = r3
            mega.boicot.n r2 = r1.f20033aL
            r2.notifyDataSetChanged()
            return
        L_0x02bd:
            int r2 = r2 + 1
            goto L_0x0289
        L_0x02c0:
            if (r3 == 0) goto L_0x0354
            java.lang.String r2 = "nlikes"
            boolean r2 = r3.hasExtra(r2)
            if (r2 == 0) goto L_0x0354
            r2 = r8
        L_0x02cb:
            java.util.ArrayList<mega.boicot.profile$a> r4 = r1.f20077s
            int r4 = r4.size()
            if (r2 >= r4) goto L_0x031a
            java.util.ArrayList<mega.boicot.profile$a> r4 = r1.f20077s
            java.lang.Object r4 = r4.get(r2)
            mega.boicot.profile$a r4 = (mega.boicot.profile.C6061a) r4
            java.lang.String r4 = r4.f20116a
            android.os.Bundle r7 = r22.getExtras()
            java.lang.String r9 = "idf"
            java.lang.String r7 = r7.getString(r9)
            boolean r4 = r4.equals(r7)
            if (r4 == 0) goto L_0x0317
            java.util.ArrayList<mega.boicot.profile$a> r4 = r1.f20077s
            java.lang.Object r4 = r4.get(r2)
            mega.boicot.profile$a r4 = (mega.boicot.profile.C6061a) r4
            android.os.Bundle r7 = r22.getExtras()
            java.lang.String r9 = "nlikes"
            java.lang.String r7 = r7.getString(r9)
            r4.f20117b = r7
            java.util.ArrayList<mega.boicot.profile$a> r4 = r1.f20077s
            java.lang.Object r4 = r4.get(r2)
            mega.boicot.profile$a r4 = (mega.boicot.profile.C6061a) r4
            android.os.Bundle r7 = r22.getExtras()
            java.lang.String r9 = "liked"
            java.lang.String r7 = r7.getString(r9)
            r4.f20119d = r7
            r4 = 1
            goto L_0x031b
        L_0x0317:
            int r2 = r2 + 1
            goto L_0x02cb
        L_0x031a:
            r4 = r8
        L_0x031b:
            if (r4 == 0) goto L_0x0753
            int r4 = r1.f20062d
            int r2 = r2 - r4
            if (r2 != 0) goto L_0x0327
            android.widget.LinearLayout r9 = r1.f20012R
            android.widget.TextView r2 = r1.f20020Z
            goto L_0x0340
        L_0x0327:
            r4 = 1
            if (r2 != r4) goto L_0x032f
            android.widget.LinearLayout r9 = r1.f20013S
            android.widget.TextView r2 = r1.f20034aa
            goto L_0x0340
        L_0x032f:
            if (r2 != r5) goto L_0x0336
            android.widget.LinearLayout r9 = r1.f20014T
            android.widget.TextView r2 = r1.f20035ab
            goto L_0x0340
        L_0x0336:
            r4 = 3
            if (r2 != r4) goto L_0x033e
            android.widget.LinearLayout r9 = r1.f20015U
            android.widget.TextView r2 = r1.f20036ac
            goto L_0x0340
        L_0x033e:
            r2 = r6
            r9 = r2
        L_0x0340:
            if (r9 == 0) goto L_0x0753
            android.os.Bundle r3 = r22.getExtras()
            java.lang.String r4 = "nlikes"
            java.lang.String r3 = r3.getString(r4)
            r2.setText(r3)
            r9.setVisibility(r8)
            goto L_0x0753
        L_0x0354:
            if (r3 == 0) goto L_0x04e5
            java.lang.String r2 = "elim_foto"
            boolean r2 = r3.hasExtra(r2)
            if (r2 == 0) goto L_0x04e5
            java.lang.String r2 = "elim_foto"
            java.lang.String r2 = r3.getStringExtra(r2)
            java.lang.String r5 = "indf"
            int r3 = r3.getIntExtra(r5, r4)
            java.lang.String r5 = ""
            boolean r5 = r2.equals(r5)
            if (r5 != 0) goto L_0x0753
            if (r3 == r4) goto L_0x0753
            java.io.File r4 = new java.io.File
            java.io.File r5 = r1.f20080v
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "fperfilgal_"
            r6.append(r7)
            r6.append(r2)
            java.lang.String r7 = ".jpg"
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            r4.<init>(r5, r6)
            boolean r5 = r4.exists()
            if (r5 == 0) goto L_0x039a
            r4.delete()
        L_0x039a:
            java.io.File r4 = new java.io.File
            java.io.File r5 = r1.f20080v
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "fperfilgal_"
            r6.append(r7)
            r6.append(r2)
            java.lang.String r2 = "_g.jpg"
            r6.append(r2)
            java.lang.String r2 = r6.toString()
            r4.<init>(r5, r2)
            boolean r2 = r4.exists()
            if (r2 == 0) goto L_0x03c0
            r4.delete()
        L_0x03c0:
            java.util.ArrayList<mega.boicot.profile$a> r2 = r1.f20077s
            java.lang.Object r2 = r2.get(r3)
            mega.boicot.profile$a r2 = (mega.boicot.profile.C6061a) r2
            r4 = 1
            r2.f20120e = r4
            r1.mo21846a(r3, r4)
            android.content.SharedPreferences r2 = r1.f20031aJ
            android.content.SharedPreferences$Editor r2 = r2.edit()
        L_0x03d4:
            r4 = 3
            if (r3 > r4) goto L_0x04e0
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "idf"
            r4.append(r5)
            r4.append(r3)
            java.lang.String r5 = "_"
            r4.append(r5)
            java.lang.String r5 = r1.f20070l
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            android.content.SharedPreferences r5 = r1.f20031aJ
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "idf"
            r6.append(r7)
            int r7 = r3 + 1
            r6.append(r7)
            java.lang.String r8 = "_"
            r6.append(r8)
            java.lang.String r8 = r1.f20070l
            r6.append(r8)
            java.lang.String r6 = r6.toString()
            java.lang.String r8 = ""
            java.lang.String r5 = r5.getString(r6, r8)
            r2.putString(r4, r5)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "f"
            r4.append(r5)
            r4.append(r3)
            java.lang.String r5 = "_fcrea_"
            r4.append(r5)
            java.lang.String r5 = r1.f20070l
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            android.content.SharedPreferences r5 = r1.f20031aJ
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r8 = "f"
            r6.append(r8)
            r6.append(r7)
            java.lang.String r8 = "_fcrea_"
            r6.append(r8)
            java.lang.String r8 = r1.f20070l
            r6.append(r8)
            java.lang.String r6 = r6.toString()
            java.lang.String r8 = ""
            java.lang.String r5 = r5.getString(r6, r8)
            r2.putString(r4, r5)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "f"
            r4.append(r5)
            r4.append(r3)
            java.lang.String r5 = "_nlikes_"
            r4.append(r5)
            java.lang.String r5 = r1.f20070l
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            android.content.SharedPreferences r5 = r1.f20031aJ
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r8 = "f"
            r6.append(r8)
            r6.append(r7)
            java.lang.String r8 = "_nlikes_"
            r6.append(r8)
            java.lang.String r8 = r1.f20070l
            r6.append(r8)
            java.lang.String r6 = r6.toString()
            java.lang.String r8 = ""
            java.lang.String r5 = r5.getString(r6, r8)
            r2.putString(r4, r5)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "f"
            r4.append(r5)
            r4.append(r3)
            java.lang.String r3 = "_liked_"
            r4.append(r3)
            java.lang.String r3 = r1.f20070l
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            android.content.SharedPreferences r4 = r1.f20031aJ
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "f"
            r5.append(r6)
            r5.append(r7)
            java.lang.String r6 = "_liked_"
            r5.append(r6)
            java.lang.String r6 = r1.f20070l
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            java.lang.String r6 = ""
            java.lang.String r4 = r4.getString(r5, r6)
            r2.putString(r3, r4)
            r3 = r7
            goto L_0x03d4
        L_0x04e0:
            r2.commit()
            goto L_0x0753
        L_0x04e5:
            if (r3 == 0) goto L_0x0579
            java.lang.String r2 = "nlikesv"
            boolean r2 = r3.hasExtra(r2)
            if (r2 == 0) goto L_0x0579
            r2 = r8
        L_0x04f0:
            java.util.ArrayList<mega.boicot.profile$b> r4 = r1.f20078t
            int r4 = r4.size()
            if (r2 >= r4) goto L_0x053f
            java.util.ArrayList<mega.boicot.profile$b> r4 = r1.f20078t
            java.lang.Object r4 = r4.get(r2)
            mega.boicot.profile$b r4 = (mega.boicot.profile.C6062b) r4
            java.lang.String r4 = r4.f20122a
            android.os.Bundle r7 = r22.getExtras()
            java.lang.String r9 = "idv"
            java.lang.String r7 = r7.getString(r9)
            boolean r4 = r4.equals(r7)
            if (r4 == 0) goto L_0x053c
            java.util.ArrayList<mega.boicot.profile$b> r4 = r1.f20078t
            java.lang.Object r4 = r4.get(r2)
            mega.boicot.profile$b r4 = (mega.boicot.profile.C6062b) r4
            android.os.Bundle r7 = r22.getExtras()
            java.lang.String r9 = "nlikesv"
            java.lang.String r7 = r7.getString(r9)
            r4.f20124c = r7
            java.util.ArrayList<mega.boicot.profile$b> r4 = r1.f20078t
            java.lang.Object r4 = r4.get(r2)
            mega.boicot.profile$b r4 = (mega.boicot.profile.C6062b) r4
            android.os.Bundle r7 = r22.getExtras()
            java.lang.String r9 = "liked"
            java.lang.String r7 = r7.getString(r9)
            r4.f20126e = r7
            r4 = 1
            goto L_0x0540
        L_0x053c:
            int r2 = r2 + 1
            goto L_0x04f0
        L_0x053f:
            r4 = r8
        L_0x0540:
            if (r4 == 0) goto L_0x0753
            int r4 = r1.f20063e
            int r2 = r2 - r4
            if (r2 != 0) goto L_0x054c
            android.widget.LinearLayout r9 = r1.f20016V
            android.widget.TextView r2 = r1.f20037ad
            goto L_0x0565
        L_0x054c:
            r4 = 1
            if (r2 != r4) goto L_0x0554
            android.widget.LinearLayout r9 = r1.f20017W
            android.widget.TextView r2 = r1.f20038ae
            goto L_0x0565
        L_0x0554:
            if (r2 != r5) goto L_0x055b
            android.widget.LinearLayout r9 = r1.f20018X
            android.widget.TextView r2 = r1.f20039af
            goto L_0x0565
        L_0x055b:
            r4 = 3
            if (r2 != r4) goto L_0x0563
            android.widget.LinearLayout r9 = r1.f20019Y
            android.widget.TextView r2 = r1.f20040ag
            goto L_0x0565
        L_0x0563:
            r2 = r6
            r9 = r2
        L_0x0565:
            if (r9 == 0) goto L_0x0753
            android.os.Bundle r3 = r22.getExtras()
            java.lang.String r4 = "nlikesv"
            java.lang.String r3 = r3.getString(r4)
            r2.setText(r3)
            r9.setVisibility(r8)
            goto L_0x0753
        L_0x0579:
            if (r3 == 0) goto L_0x0729
            java.lang.String r2 = "elim_video"
            boolean r2 = r3.hasExtra(r2)
            if (r2 == 0) goto L_0x0729
            java.lang.String r2 = "elim_video"
            java.lang.String r2 = r3.getStringExtra(r2)
            java.lang.String r5 = "indv"
            int r3 = r3.getIntExtra(r5, r4)
            java.lang.String r5 = ""
            boolean r5 = r2.equals(r5)
            if (r5 != 0) goto L_0x0753
            if (r3 == r4) goto L_0x0753
            java.io.File r4 = new java.io.File
            java.io.File r5 = r1.f20080v
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "fperfilgalv_"
            r6.append(r7)
            r6.append(r2)
            java.lang.String r2 = ".jpg"
            r6.append(r2)
            java.lang.String r2 = r6.toString()
            r4.<init>(r5, r2)
            boolean r2 = r4.exists()
            if (r2 == 0) goto L_0x05bf
            r4.delete()
        L_0x05bf:
            java.util.ArrayList<mega.boicot.profile$b> r2 = r1.f20078t
            java.lang.Object r2 = r2.get(r3)
            mega.boicot.profile$b r2 = (mega.boicot.profile.C6062b) r2
            r4 = 1
            r2.f20127f = r4
            int r2 = r1.f20068j
            int r2 = r2 - r4
            r1.f20068j = r2
            r1.mo21851b(r3, r4)
            android.content.SharedPreferences r2 = r1.f20031aJ
            android.content.SharedPreferences$Editor r2 = r2.edit()
            r4 = 3
        L_0x05d9:
            if (r3 > r4) goto L_0x0725
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "idv"
            r5.append(r6)
            r5.append(r3)
            java.lang.String r6 = "_"
            r5.append(r6)
            java.lang.String r6 = r1.f20070l
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            android.content.SharedPreferences r6 = r1.f20031aJ
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "idv"
            r7.append(r8)
            int r8 = r3 + 1
            r7.append(r8)
            java.lang.String r9 = "_"
            r7.append(r9)
            java.lang.String r9 = r1.f20070l
            r7.append(r9)
            java.lang.String r7 = r7.toString()
            java.lang.String r9 = ""
            java.lang.String r6 = r6.getString(r7, r9)
            r2.putString(r5, r6)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "v"
            r5.append(r6)
            r5.append(r3)
            java.lang.String r6 = "_formato_"
            r5.append(r6)
            java.lang.String r6 = r1.f20070l
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            android.content.SharedPreferences r6 = r1.f20031aJ
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r9 = "v"
            r7.append(r9)
            r7.append(r8)
            java.lang.String r9 = "_formato_"
            r7.append(r9)
            java.lang.String r9 = r1.f20070l
            r7.append(r9)
            java.lang.String r7 = r7.toString()
            java.lang.String r9 = ""
            java.lang.String r6 = r6.getString(r7, r9)
            r2.putString(r5, r6)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "v"
            r5.append(r6)
            r5.append(r3)
            java.lang.String r6 = "_fcrea_"
            r5.append(r6)
            java.lang.String r6 = r1.f20070l
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            android.content.SharedPreferences r6 = r1.f20031aJ
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r9 = "v"
            r7.append(r9)
            r7.append(r8)
            java.lang.String r9 = "_fcrea_"
            r7.append(r9)
            java.lang.String r9 = r1.f20070l
            r7.append(r9)
            java.lang.String r7 = r7.toString()
            java.lang.String r9 = ""
            java.lang.String r6 = r6.getString(r7, r9)
            r2.putString(r5, r6)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "v"
            r5.append(r6)
            r5.append(r3)
            java.lang.String r6 = "_nlikes_"
            r5.append(r6)
            java.lang.String r6 = r1.f20070l
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            android.content.SharedPreferences r6 = r1.f20031aJ
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r9 = "v"
            r7.append(r9)
            r7.append(r8)
            java.lang.String r9 = "_nlikes_"
            r7.append(r9)
            java.lang.String r9 = r1.f20070l
            r7.append(r9)
            java.lang.String r7 = r7.toString()
            java.lang.String r9 = ""
            java.lang.String r6 = r6.getString(r7, r9)
            r2.putString(r5, r6)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "v"
            r5.append(r6)
            r5.append(r3)
            java.lang.String r3 = "_liked_"
            r5.append(r3)
            java.lang.String r3 = r1.f20070l
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            android.content.SharedPreferences r5 = r1.f20031aJ
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "v"
            r6.append(r7)
            r6.append(r8)
            java.lang.String r7 = "_liked_"
            r6.append(r7)
            java.lang.String r7 = r1.f20070l
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            java.lang.String r7 = ""
            java.lang.String r5 = r5.getString(r6, r7)
            r2.putString(r3, r5)
            r3 = r8
            goto L_0x05d9
        L_0x0725:
            r2.commit()
            goto L_0x0753
        L_0x0729:
            if (r3 == 0) goto L_0x0753
            java.lang.String r2 = "finalizar"
            boolean r2 = r3.hasExtra(r2)
            if (r2 == 0) goto L_0x0753
            android.os.Bundle r2 = r22.getExtras()
            java.lang.String r5 = "finalizar"
            boolean r2 = r2.getBoolean(r5)
            if (r2 == 0) goto L_0x0753
            android.os.Bundle r2 = r22.getExtras()
            java.lang.String r5 = "finalizar_app"
            boolean r2 = r2.getBoolean(r5)
            if (r2 != 0) goto L_0x074d
            r1.f20043aj = r8
        L_0x074d:
            r1.setResult(r4, r3)
            r19.finish()
        L_0x0753:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: mega.boicot.profile.onActivityResult(int, int, android.content.Intent):void");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public void mo21853f() {
        int b = this.f20079u.mo20778b((Context) this);
        if (this.f20079u.f18045dm == 1) {
            this.f20030aI = (ListView) findViewById(R.id.left_drawer);
            this.f20079u.mo20771a(this.f20030aI);
        } else if (this.f20079u.f18045dm == 0) {
            int i = 0;
            for (int i2 = 0; i2 < this.f20079u.f17971bz.length; i2++) {
                if (!this.f20079u.f17971bz[i2].f18333z) {
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
        for (int i3 = 0; i3 < this.f20079u.f17923bD.length; i3++) {
            if (this.f20079u.f17923bD[i3] > 0) {
                findViewById(this.f20079u.f17923bD[i3]).setOnClickListener(this);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo21848a(boolean z) {
        String str = this.f20070l;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f20060b);
        sb.append("");
        if (!str.equals(sb.toString())) {
            Editor edit = this.f20031aJ.edit();
            if (z) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("usufav_");
                sb2.append(this.f20070l);
                edit.putBoolean(sb2.toString(), true);
                if (!this.f20047an) {
                    this.f20067i++;
                }
                this.f20047an = true;
                if (this.f20046am) {
                    this.f20000F.setImageDrawable(getResources().getDrawable(R.drawable.favorito_activ_n));
                } else {
                    this.f20000F.setImageDrawable(getResources().getDrawable(R.drawable.favorito_activ_b));
                }
                if (this.f20032aK.size() > 0) {
                    String str2 = ((C6029o) this.f20032aK.get(0)).f19938f;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(this.f20060b);
                    sb3.append("");
                    if (!str2.equals(sb3.toString())) {
                        C6029o oVar = new C6029o();
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append(this.f20060b);
                        sb4.append("");
                        oVar.f19938f = sb4.toString();
                        oVar.f19937e = getResources().getString(R.string.tu);
                        oVar.f19934b = this.f20079u.mo20757a((Context) this, 1).exists();
                        this.f20032aK.add(0, oVar);
                        this.f20033aL.notifyDataSetChanged();
                    }
                }
            } else {
                StringBuilder sb5 = new StringBuilder();
                sb5.append("usufav_");
                sb5.append(this.f20070l);
                edit.remove(sb5.toString());
                if (this.f20047an) {
                    this.f20067i--;
                }
                if (this.f20067i < 0) {
                    this.f20067i = 0;
                }
                this.f20047an = false;
                if (this.f20046am) {
                    this.f20000F.setImageDrawable(getResources().getDrawable(R.drawable.favorito_noactiv_n));
                } else {
                    this.f20000F.setImageDrawable(getResources().getDrawable(R.drawable.favorito_noactiv_b));
                }
                if (this.f20032aK.size() > 0) {
                    String str3 = ((C6029o) this.f20032aK.get(0)).f19938f;
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append(this.f20060b);
                    sb6.append("");
                    if (str3.equals(sb6.toString())) {
                        this.f20032aK.remove(0);
                        this.f20033aL.notifyDataSetChanged();
                    }
                }
            }
            edit.commit();
            TextView textView = (TextView) findViewById(R.id.tv_likes_n);
            StringBuilder sb7 = new StringBuilder();
            sb7.append(this.f20067i);
            sb7.append("");
            textView.setText(sb7.toString());
            Intent intent = new Intent();
            intent.putExtra("accion_usu_fav_id", this.f20070l);
            intent.putExtra("accion_usu_fav_accion", z);
            setResult(-1, intent);
        }
    }

    public void onClick(View view) {
        String str;
        if (view.getId() == R.id.iv_ban) {
            final AlertDialog create = new Builder(this).setNegativeButton(R.string.cancelar, null).setPositiveButton(R.string.aceptar, new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialogInterface, int i) {
                    config.m23839a(Toast.makeText(profile.this, profile.this.getResources().getString(R.string.eliminando), 0));
                    config.m23852c((Context) profile.this, profile.this.f20070l);
                    new C6162e(profile.this.f20070l, profile.this.f20060b, profile.this.f20069k, profile.this).execute(new String[0]);
                    Editor edit = profile.this.f20031aJ.edit();
                    StringBuilder sb = new StringBuilder();
                    sb.append("ban_");
                    sb.append(profile.this.f20070l);
                    edit.putBoolean(sb.toString(), true);
                    edit.commit();
                }
            }).setMessage(R.string.confirmar_elimusu).create();
            if (!this.f20074p.equals("")) {
                create.setOnShowListener(new OnShowListener() {
                    public void onShow(DialogInterface dialogInterface) {
                        Button button = create.getButton(-1);
                        StringBuilder sb = new StringBuilder();
                        sb.append("#");
                        sb.append(profile.this.f20074p);
                        button.setTextColor(Color.parseColor(sb.toString()));
                        Button button2 = create.getButton(-2);
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("#");
                        sb2.append(profile.this.f20074p);
                        button2.setTextColor(Color.parseColor(sb2.toString()));
                    }
                });
            }
            create.show();
            try {
                ((TextView) create.findViewById(16908299)).setTypeface(Typeface.MONOSPACE);
            } catch (Exception unused) {
            }
        } else if (view.getId() == R.id.tv_likes_n || view.getId() == R.id.tv_likes_self) {
            if (this.f20067i != 0) {
                this.f20028aG = new Builder(this);
                this.f20029aH = getLayoutInflater().inflate(R.layout.likes_list, null);
                if (VERSION.SDK_INT > 20) {
                    config.m23838a((ProgressBar) this.f20029aH.findViewById(R.id.likes_pb), this.f20079u.f17890aW);
                }
                this.f20028aG.setView(this.f20029aH);
                this.f20028aG.setCancelable(true);
                ListView listView = (ListView) this.f20029aH.findViewById(R.id.lv);
                listView.setCacheColorHint(0);
                this.f20033aL = new C6021n(this, R.layout.likes_item, this.f20032aK, this.f20060b);
                listView.setAdapter(this.f20033aL);
                listView.setOnItemClickListener(new OnItemClickListener() {
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                        C6029o oVar = (C6029o) profile.this.f20032aK.get(i);
                        if (!oVar.f19935c) {
                            String str = oVar.f19938f;
                            StringBuilder sb = new StringBuilder();
                            sb.append(profile.this.f20060b);
                            sb.append("");
                            if (!str.equals(sb.toString())) {
                                String str2 = oVar.f19938f;
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append(profile.this.f20070l);
                                sb2.append("");
                                if (!str2.equals(sb2.toString())) {
                                    Intent intent = new Intent(profile.this, profile.class);
                                    intent.putExtra(TtmlNode.ATTR_ID, oVar.f19938f);
                                    intent.putExtra("privados", oVar.f19940h);
                                    intent.putExtra("nombre", oVar.f19937e);
                                    intent.putExtra("coments", oVar.f19942j);
                                    intent.putExtra("fnac_d", oVar.f19943k);
                                    intent.putExtra("fnac_m", oVar.f19944l);
                                    intent.putExtra("fnac_a", oVar.f19945m);
                                    intent.putExtra("sexo", oVar.f19941i);
                                    intent.putExtra("vfoto", oVar.f19939g);
                                    if (profile.this.f20049ap.containsKey("desdepriv")) {
                                        intent.putExtra("desdepriv", "1");
                                    }
                                    intent.putExtra("p_fnac", profile.this.f20049ap.getInt("p_fnac"));
                                    intent.putExtra("p_sexo", profile.this.f20049ap.getInt("p_sexo"));
                                    intent.putExtra("p_descr", profile.this.f20049ap.getInt("p_descr"));
                                    intent.putExtra("p_dist", profile.this.f20049ap.getInt("p_dist"));
                                    intent.putExtra("coments_chat", profile.this.f20049ap.getBoolean("coments_chat"));
                                    intent.putExtra("galeria", profile.this.f20049ap.getBoolean("galeria"));
                                    intent.putExtra("privados_chat", profile.this.f20049ap.getBoolean("privados_chat"));
                                    intent.putExtra("fotos_perfil", profile.this.f20061c);
                                    intent.putExtra("fotos_chat", profile.this.f20049ap.getInt("fotos_chat"));
                                    profile.this.startActivityForResult(intent, 0);
                                }
                            }
                        } else if (profile.this.f20027aF == null || profile.this.f20027aF.getStatus() != Status.RUNNING) {
                            profile.this.f20027aF = new C6068h();
                            profile.this.f20027aF.execute(new String[0]);
                        }
                    }
                });
                this.f20028aG.show();
                if (this.f20032aK.size() == 0 && (this.f20027aF == null || this.f20027aF.getStatus() != Status.RUNNING)) {
                    this.f20027aF = new C6068h();
                    this.f20027aF.execute(new String[0]);
                }
            }
        } else if (view.getId() == R.id.iv_favorito) {
            SharedPreferences sharedPreferences = this.f20031aJ;
            StringBuilder sb = new StringBuilder();
            sb.append("usufav_");
            sb.append(this.f20070l);
            if (sharedPreferences.contains(sb.toString())) {
                mo21848a(false);
                Editor edit = this.f20031aJ.edit();
                StringBuilder sb2 = new StringBuilder();
                sb2.append("usufav_noactivar_");
                sb2.append(this.f20070l);
                edit.putBoolean(sb2.toString(), true);
                edit.commit();
                new C6063c(Boolean.valueOf(false)).execute(new String[0]);
            } else {
                mo21848a(true);
                new C6063c(Boolean.valueOf(true)).execute(new String[0]);
                if (!this.f20031aJ.contains("usufav_msgmostrado")) {
                    Editor edit2 = this.f20031aJ.edit();
                    edit2.putBoolean("usufav_msgmostrado", true);
                    edit2.commit();
                    final AlertDialog create2 = new Builder(this).setCancelable(false).setPositiveButton(R.string.aceptar, null).setMessage(R.string.favorito_activar).create();
                    if (!this.f20074p.equals("")) {
                        create2.setOnShowListener(new OnShowListener() {
                            public void onShow(DialogInterface dialogInterface) {
                                Button button = create2.getButton(-1);
                                StringBuilder sb = new StringBuilder();
                                sb.append("#");
                                sb.append(profile.this.f20074p);
                                button.setTextColor(Color.parseColor(sb.toString()));
                            }
                        });
                    }
                    create2.show();
                    ((TextView) create2.findViewById(16908299)).setTypeface(Typeface.MONOSPACE);
                }
            }
        } else if (view.getId() == R.id.iv_privado) {
            Intent intent = new Intent(this, t_chat.class);
            intent.putExtra("empezar_privado", true);
            intent.putExtra("externo", true);
            intent.putExtra("id_remit", this.f20070l);
            intent.putExtra("nombre_remit", this.f20049ap.getString("nombre"));
            intent.putExtra("idchat", 0);
            intent.putExtra("idtema", 0);
            intent.putExtra("fotos_perfil", this.f20049ap.getInt("fotos_perfil"));
            intent.putExtra("fotos_chat", this.f20049ap.getInt("fotos_chat"));
            intent.putExtra("fnac", this.f20049ap.getInt("p_fnac"));
            intent.putExtra("sexo", this.f20049ap.getInt("p_sexo"));
            intent.putExtra("descr", this.f20049ap.getInt("p_descr"));
            intent.putExtra("dist", this.f20049ap.getInt("p_dist"));
            intent.putExtra("privados", this.f20049ap.getBoolean("privados_chat"));
            intent.putExtra("coments", this.f20049ap.getBoolean("coments_chat"));
            intent.putExtra("galeria", this.f20049ap.getBoolean("galeria"));
            intent.putExtra("c1", this.f20079u.f17971bz[this.f20079u.f18075l].f18314g);
            intent.putExtra("c2", this.f20079u.f17971bz[this.f20079u.f18075l].f18315h);
            startActivityForResult(intent, 0);
        } else if (view.getId() == R.id.iv_enviarcoment) {
            m24506c(false);
        } else if (view.getId() == R.id.iv_elimcoment) {
            final View view2 = (View) view.getParent().getParent();
            final String str2 = (String) view2.getTag(R.id.idaux2);
            if (str2 != null) {
                final AlertDialog create3 = new Builder(this).setNegativeButton(R.string.no, null).setPositiveButton(R.string.si, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialogInterface, int i) {
                        view2.setVisibility(8);
                        int indexOfChild = ((LinearLayout) view2.getParent()).indexOfChild(view2);
                        Editor edit = profile.this.f20031aJ.edit();
                        while (indexOfChild < 4) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("idcom");
                            sb.append(indexOfChild);
                            sb.append("_");
                            sb.append(profile.this.f20070l);
                            String sb2 = sb.toString();
                            SharedPreferences sharedPreferences = profile.this.f20031aJ;
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append("idcom");
                            int i2 = indexOfChild + 1;
                            sb3.append(i2);
                            sb3.append("_");
                            sb3.append(profile.this.f20070l);
                            edit.putString(sb2, sharedPreferences.getString(sb3.toString(), ""));
                            StringBuilder sb4 = new StringBuilder();
                            sb4.append("com");
                            sb4.append(indexOfChild);
                            sb4.append("_");
                            sb4.append(profile.this.f20070l);
                            String sb5 = sb4.toString();
                            SharedPreferences sharedPreferences2 = profile.this.f20031aJ;
                            StringBuilder sb6 = new StringBuilder();
                            sb6.append("com");
                            sb6.append(i2);
                            sb6.append("_");
                            sb6.append(profile.this.f20070l);
                            edit.putString(sb5, sharedPreferences2.getString(sb6.toString(), ""));
                            StringBuilder sb7 = new StringBuilder();
                            sb7.append("com");
                            sb7.append(indexOfChild);
                            sb7.append("_fcrea_");
                            sb7.append(profile.this.f20070l);
                            String sb8 = sb7.toString();
                            SharedPreferences sharedPreferences3 = profile.this.f20031aJ;
                            StringBuilder sb9 = new StringBuilder();
                            sb9.append("com");
                            sb9.append(i2);
                            sb9.append("_fcrea_");
                            sb9.append(profile.this.f20070l);
                            edit.putString(sb8, sharedPreferences3.getString(sb9.toString(), ""));
                            StringBuilder sb10 = new StringBuilder();
                            sb10.append("com");
                            sb10.append(indexOfChild);
                            sb10.append("_idusucrea_");
                            sb10.append(profile.this.f20070l);
                            String sb11 = sb10.toString();
                            SharedPreferences sharedPreferences4 = profile.this.f20031aJ;
                            StringBuilder sb12 = new StringBuilder();
                            sb12.append("com");
                            sb12.append(i2);
                            sb12.append("_idusucrea_");
                            sb12.append(profile.this.f20070l);
                            edit.putString(sb11, sharedPreferences4.getString(sb12.toString(), ""));
                            StringBuilder sb13 = new StringBuilder();
                            sb13.append("com");
                            sb13.append(indexOfChild);
                            sb13.append("_nombre_");
                            sb13.append(profile.this.f20070l);
                            String sb14 = sb13.toString();
                            SharedPreferences sharedPreferences5 = profile.this.f20031aJ;
                            StringBuilder sb15 = new StringBuilder();
                            sb15.append("com");
                            sb15.append(i2);
                            sb15.append("_nombre_");
                            sb15.append(profile.this.f20070l);
                            edit.putString(sb14, sharedPreferences5.getString(sb15.toString(), ""));
                            StringBuilder sb16 = new StringBuilder();
                            sb16.append("com");
                            sb16.append(indexOfChild);
                            sb16.append("_vfoto_");
                            sb16.append(profile.this.f20070l);
                            String sb17 = sb16.toString();
                            SharedPreferences sharedPreferences6 = profile.this.f20031aJ;
                            StringBuilder sb18 = new StringBuilder();
                            sb18.append("com");
                            sb18.append(i2);
                            sb18.append("_vfoto_");
                            sb18.append(profile.this.f20070l);
                            edit.putString(sb17, sharedPreferences6.getString(sb18.toString(), "0"));
                            StringBuilder sb19 = new StringBuilder();
                            sb19.append("com");
                            sb19.append(indexOfChild);
                            sb19.append("_privados_");
                            sb19.append(profile.this.f20070l);
                            String sb20 = sb19.toString();
                            SharedPreferences sharedPreferences7 = profile.this.f20031aJ;
                            StringBuilder sb21 = new StringBuilder();
                            sb21.append("com");
                            sb21.append(i2);
                            sb21.append("_privados_");
                            sb21.append(profile.this.f20070l);
                            edit.putString(sb20, sharedPreferences7.getString(sb21.toString(), "0"));
                            StringBuilder sb22 = new StringBuilder();
                            sb22.append("com");
                            sb22.append(indexOfChild);
                            sb22.append("_fnacd_");
                            sb22.append(profile.this.f20070l);
                            String sb23 = sb22.toString();
                            SharedPreferences sharedPreferences8 = profile.this.f20031aJ;
                            StringBuilder sb24 = new StringBuilder();
                            sb24.append("com");
                            sb24.append(i2);
                            sb24.append("_fnacd_");
                            sb24.append(profile.this.f20070l);
                            edit.putString(sb23, sharedPreferences8.getString(sb24.toString(), "0"));
                            StringBuilder sb25 = new StringBuilder();
                            sb25.append("com");
                            sb25.append(indexOfChild);
                            sb25.append("_fnacm_");
                            sb25.append(profile.this.f20070l);
                            String sb26 = sb25.toString();
                            SharedPreferences sharedPreferences9 = profile.this.f20031aJ;
                            StringBuilder sb27 = new StringBuilder();
                            sb27.append("com");
                            sb27.append(i2);
                            sb27.append("_fnacm_");
                            sb27.append(profile.this.f20070l);
                            edit.putString(sb26, sharedPreferences9.getString(sb27.toString(), "0"));
                            StringBuilder sb28 = new StringBuilder();
                            sb28.append("com");
                            sb28.append(indexOfChild);
                            sb28.append("_fnaca_");
                            sb28.append(profile.this.f20070l);
                            String sb29 = sb28.toString();
                            SharedPreferences sharedPreferences10 = profile.this.f20031aJ;
                            StringBuilder sb30 = new StringBuilder();
                            sb30.append("com");
                            sb30.append(i2);
                            sb30.append("_fnaca_");
                            sb30.append(profile.this.f20070l);
                            edit.putString(sb29, sharedPreferences10.getString(sb30.toString(), "0"));
                            StringBuilder sb31 = new StringBuilder();
                            sb31.append("com");
                            sb31.append(indexOfChild);
                            sb31.append("_sexo_");
                            sb31.append(profile.this.f20070l);
                            String sb32 = sb31.toString();
                            SharedPreferences sharedPreferences11 = profile.this.f20031aJ;
                            StringBuilder sb33 = new StringBuilder();
                            sb33.append("com");
                            sb33.append(i2);
                            sb33.append("_sexo_");
                            sb33.append(profile.this.f20070l);
                            edit.putString(sb32, sharedPreferences11.getString(sb33.toString(), "0"));
                            StringBuilder sb34 = new StringBuilder();
                            sb34.append("com");
                            sb34.append(indexOfChild);
                            sb34.append("_coments_");
                            sb34.append(profile.this.f20070l);
                            String sb35 = sb34.toString();
                            SharedPreferences sharedPreferences12 = profile.this.f20031aJ;
                            StringBuilder sb36 = new StringBuilder();
                            sb36.append("com");
                            sb36.append(i2);
                            sb36.append("_coments_");
                            sb36.append(profile.this.f20070l);
                            edit.putString(sb35, sharedPreferences12.getString(sb36.toString(), "0"));
                            indexOfChild = i2;
                        }
                        edit.commit();
                        new C6072l(str2).execute(new String[0]);
                    }
                }).setMessage(R.string.confirmar_elimcoment).create();
                if (!this.f20074p.equals("")) {
                    create3.setOnShowListener(new OnShowListener() {
                        public void onShow(DialogInterface dialogInterface) {
                            Button button = create3.getButton(-1);
                            StringBuilder sb = new StringBuilder();
                            sb.append("#");
                            sb.append(profile.this.f20074p);
                            button.setTextColor(Color.parseColor(sb.toString()));
                            Button button2 = create3.getButton(-2);
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("#");
                            sb2.append(profile.this.f20074p);
                            button2.setTextColor(Color.parseColor(sb2.toString()));
                        }
                    });
                }
                create3.show();
                ((TextView) create3.findViewById(16908299)).setTypeface(Typeface.MONOSPACE);
            }
        } else if (view.getId() == R.id.iv_mascoments) {
            new C6064d().execute(new String[0]);
        } else if (view.getId() == R.id.iv_masfotos) {
            this.f20062d += 4;
            new C6065e().execute(new String[0]);
        } else if (view.getId() == R.id.iv_menosfotos) {
            this.f20062d -= 4;
            new C6065e().execute(new String[0]);
        } else if (view.getId() == R.id.iv_masvideos) {
            this.f20063e += 4;
            new C6069i().execute(new String[0]);
        } else if (view.getId() == R.id.iv_menosvideos) {
            this.f20063e -= 4;
            new C6069i().execute(new String[0]);
        } else if (view.getId() == R.id.iv_f1_v || view.getId() == R.id.iv_f2_v || view.getId() == R.id.iv_f3_v || view.getId() == R.id.iv_f4_v) {
            String str3 = (String) view.getTag(R.id.idaux1);
            int parseInt = Integer.parseInt((String) view.getTag(R.id.idaux3));
            if (str3 != null && !((C6062b) this.f20078t.get(parseInt)).f20127f) {
                C6062b bVar = (C6062b) this.f20078t.get(parseInt);
                Intent intent2 = new Intent(this, t_video_pro.class);
                if (bVar.f20123b.equals("1")) {
                    str = "mp4";
                } else if (bVar.f20123b.equals("2")) {
                    str = "3gp";
                } else if (bVar.f20123b.equals("3")) {
                    str = "webm";
                } else {
                    return;
                }
                StringBuilder sb3 = new StringBuilder();
                sb3.append("http://video.e-droid.net/files_pro/v");
                sb3.append(bVar.f20122a);
                sb3.append("_");
                sb3.append(this.f20070l);
                sb3.append(".");
                sb3.append(str);
                intent2.putExtra("url", sb3.toString());
                intent2.putExtra("ind", this.f20079u.f18075l);
                intent2.putExtra("nlikes", ((C6062b) this.f20078t.get(parseInt)).f20124c);
                intent2.putExtra("liked", ((C6062b) this.f20078t.get(parseInt)).f20126e);
                intent2.putExtra("idv", bVar.f20122a);
                intent2.putExtra("indv", parseInt);
                intent2.putExtra("idusu_profile", this.f20070l);
                intent2.putExtra("coments", this.f20049ap.getString("coments"));
                intent2.putExtra("p_fnac", this.f20049ap.getInt("p_fnac"));
                intent2.putExtra("p_sexo", this.f20049ap.getInt("p_sexo"));
                intent2.putExtra("p_descr", this.f20049ap.getInt("p_descr"));
                intent2.putExtra("p_dist", this.f20049ap.getInt("p_dist"));
                intent2.putExtra("coments_chat", this.f20049ap.getBoolean("coments_chat"));
                intent2.putExtra("galeria", this.f20049ap.getBoolean("galeria"));
                intent2.putExtra("privados_chat", this.f20049ap.getBoolean("privados_chat"));
                intent2.putExtra("fotos_perfil", this.f20061c);
                intent2.putExtra("fotos_chat", this.f20049ap.getInt("fotos_chat"));
                startActivityForResult(intent2, 0);
            }
        } else if (view.getId() == R.id.iv_f1 || view.getId() == R.id.iv_f2 || view.getId() == R.id.iv_f3 || view.getId() == R.id.iv_f4) {
            String str4 = (String) view.getTag(R.id.idaux1);
            int parseInt2 = Integer.parseInt((String) view.getTag(R.id.idaux3));
            if (str4 != null && !((C6061a) this.f20077s.get(parseInt2)).f20120e) {
                config config = this.f20079u;
                StringBuilder sb4 = new StringBuilder();
                sb4.append("fperfilgal_");
                sb4.append(str4);
                sb4.append("_g.jpg");
                File a = config.mo20759a((Context) this, sb4.toString());
                if (a.exists()) {
                    Intent intent3 = new Intent(this, fotogal.class);
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append("file://");
                    sb5.append(a.getAbsolutePath());
                    intent3.putExtra("url", sb5.toString());
                    intent3.putExtra("nlikes", ((C6061a) this.f20077s.get(parseInt2)).f20117b);
                    intent3.putExtra("liked", ((C6061a) this.f20077s.get(parseInt2)).f20119d);
                    intent3.putExtra("fcrea", ((C6061a) this.f20077s.get(parseInt2)).f20118c);
                    intent3.putExtra("idf", str4);
                    intent3.putExtra("indf", parseInt2);
                    intent3.putExtra("idusu_profile", this.f20070l);
                    intent3.putExtra("p_fnac", this.f20049ap.getInt("p_fnac"));
                    intent3.putExtra("p_sexo", this.f20049ap.getInt("p_sexo"));
                    intent3.putExtra("p_descr", this.f20049ap.getInt("p_descr"));
                    intent3.putExtra("p_dist", this.f20049ap.getInt("p_dist"));
                    intent3.putExtra("coments_chat", this.f20049ap.getBoolean("coments_chat"));
                    intent3.putExtra("galeria", this.f20049ap.getBoolean("galeria"));
                    intent3.putExtra("privados_chat", this.f20049ap.getBoolean("privados_chat"));
                    intent3.putExtra("fotos_perfil", this.f20061c);
                    intent3.putExtra("fotos_chat", this.f20049ap.getInt("fotos_chat"));
                    startActivityForResult(intent3, 0);
                } else if (this.f20054au == null || this.f20054au.getStatus() != Status.RUNNING) {
                    this.f20054au = new C6084r(str4, parseInt2);
                    this.f20054au.execute(new String[0]);
                }
            }
        } else if (view.getId() == R.id.btnfotos) {
            final AlertDialog create4 = new Builder(this).setCancelable(true).setPositiveButton(getString(R.string.tomardecamara), new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialogInterface, int i) {
                    profile.this.f20021a = System.currentTimeMillis();
                    Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
                    Uri a = FileProvider.m1223a(profile.this, "mega.boicot.fileprovider", profile.this.f20079u.mo20759a((Context) profile.this, "fperfilgal_temp"));
                    intent.putExtra("output", a);
                    intent.addFlags(1);
                    intent.addFlags(2);
                    if (VERSION.SDK_INT < 21) {
                        for (ResolveInfo resolveInfo : profile.this.getPackageManager().queryIntentActivities(intent, C2793C.DEFAULT_BUFFER_SEGMENT_SIZE)) {
                            profile.this.grantUriPermission(resolveInfo.activityInfo.packageName, a, 3);
                        }
                    }
                    try {
                        profile.this.startActivityForResult(intent, 1);
                    } catch (ActivityNotFoundException unused) {
                    }
                }
            }).setNegativeButton(getString(R.string.tomardesd), new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialogInterface, int i) {
                    Intent intent = new Intent("android.intent.action.PICK");
                    intent.setType("image/*");
                    profile.this.startActivityForResult(intent, 2);
                }
            }).setMessage(R.string.tomarfoto).create();
            if (!this.f20074p.equals("")) {
                create4.setOnShowListener(new OnShowListener() {
                    public void onShow(DialogInterface dialogInterface) {
                        Button button = create4.getButton(-1);
                        StringBuilder sb = new StringBuilder();
                        sb.append("#");
                        sb.append(profile.this.f20074p);
                        button.setTextColor(Color.parseColor(sb.toString()));
                        Button button2 = create4.getButton(-2);
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("#");
                        sb2.append(profile.this.f20074p);
                        button2.setTextColor(Color.parseColor(sb2.toString()));
                    }
                });
            }
            create4.show();
            ((TextView) create4.findViewById(16908299)).setTypeface(Typeface.MONOSPACE);
        } else if (view.getId() == R.id.btnvideos) {
            if (this.f20068j >= this.f20079u.f17935bP) {
                final AlertDialog create5 = new Builder(this).setCancelable(true).setPositiveButton(getString(R.string.aceptar), null).setMessage(R.string.demasiados_videos).create();
                if (!this.f20074p.equals("")) {
                    create5.setOnShowListener(new OnShowListener() {
                        public void onShow(DialogInterface dialogInterface) {
                            Button button = create5.getButton(-1);
                            StringBuilder sb = new StringBuilder();
                            sb.append("#");
                            sb.append(profile.this.f20074p);
                            button.setTextColor(Color.parseColor(sb.toString()));
                            Button button2 = create5.getButton(-2);
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("#");
                            sb2.append(profile.this.f20074p);
                            button2.setTextColor(Color.parseColor(sb2.toString()));
                        }
                    });
                }
                create5.show();
                ((TextView) create5.findViewById(16908299)).setTypeface(Typeface.MONOSPACE);
            } else {
                final AlertDialog create6 = new Builder(this).setCancelable(true).setPositiveButton(getString(R.string.tomardecamara), new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Intent intent = new Intent("android.media.action.VIDEO_CAPTURE");
                        intent.putExtra("android.intent.extra.videoQuality", 0);
                        intent.putExtra("android.intent.extra.durationLimit", 20);
                        intent.putExtra("android.intent.extra.sizeLimit", 55574528);
                        intent.putExtra("android.intent.extra.videoQuality", 0);
                        intent.putExtra("android.intent.extra.durationLimit", 20);
                        intent.putExtra("android.intent.extra.sizeLimit", 55574528);
                        try {
                            profile.this.startActivityForResult(intent, 3);
                        } catch (ActivityNotFoundException unused) {
                        }
                    }
                }).setNegativeButton(getString(R.string.selvideo), new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Intent intent = new Intent("android.intent.action.PICK");
                        intent.setType("video/*");
                        profile.this.startActivityForResult(intent, 4);
                    }
                }).setMessage(R.string.enviarvideo).create();
                if (!this.f20074p.equals("")) {
                    create6.setOnShowListener(new OnShowListener() {
                        public void onShow(DialogInterface dialogInterface) {
                            Button button = create6.getButton(-1);
                            StringBuilder sb = new StringBuilder();
                            sb.append("#");
                            sb.append(profile.this.f20074p);
                            button.setTextColor(Color.parseColor(sb.toString()));
                            Button button2 = create6.getButton(-2);
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("#");
                            sb2.append(profile.this.f20074p);
                            button2.setTextColor(Color.parseColor(sb2.toString()));
                        }
                    });
                }
                create6.show();
                ((TextView) create6.findViewById(16908299)).setTypeface(Typeface.MONOSPACE);
            }
        } else if (view.getTag(R.id.idaux1) != null && view.getTag(R.id.idaux1).equals("ESCOMENT")) {
            Intent intent4 = new Intent(this, profile.class);
            intent4.putExtra(TtmlNode.ATTR_ID, (String) view.getTag(R.id.idaux2));
            intent4.putExtra("privados", (String) view.getTag(R.id.idaux5));
            intent4.putExtra("nombre", (String) view.getTag(R.id.idaux3));
            intent4.putExtra("coments", (String) view.getTag(R.id.idaux10));
            intent4.putExtra("fnac_d", (String) view.getTag(R.id.idaux6));
            intent4.putExtra("fnac_m", (String) view.getTag(R.id.idaux7));
            intent4.putExtra("fnac_a", (String) view.getTag(R.id.idaux8));
            intent4.putExtra("sexo", (String) view.getTag(R.id.idaux9));
            intent4.putExtra("vfoto", (String) view.getTag(R.id.idaux4));
            if (this.f20049ap.containsKey("desdepriv")) {
                intent4.putExtra("desdepriv", "1");
            }
            intent4.putExtra("p_fnac", this.f20049ap.getInt("p_fnac"));
            intent4.putExtra("p_sexo", this.f20049ap.getInt("p_sexo"));
            intent4.putExtra("p_descr", this.f20049ap.getInt("p_descr"));
            intent4.putExtra("p_dist", this.f20049ap.getInt("p_dist"));
            intent4.putExtra("coments_chat", this.f20049ap.getBoolean("coments_chat"));
            intent4.putExtra("galeria", this.f20049ap.getBoolean("galeria"));
            intent4.putExtra("privados_chat", this.f20049ap.getBoolean("privados_chat"));
            intent4.putExtra("fotos_perfil", this.f20061c);
            intent4.putExtra("fotos_chat", this.f20049ap.getInt("fotos_chat"));
            startActivityForResult(intent4, 0);
        } else if ((this.f20079u.f17986cO == null || this.f20079u.f17986cO.equals("")) && ((this.f20079u.f17985cN == null || this.f20079u.f17985cN.equals("")) && ((this.f20079u.f17988cQ == null || this.f20079u.f17988cQ.equals("")) && (this.f20079u.f17989cR == null || this.f20079u.f17989cR.equals(""))))) {
            abrir_secc(view);
        } else {
            if (this.f20079u.f17986cO != null && !this.f20079u.f17986cO.equals("")) {
                this.f20057ax = new RewardedVideo((Context) this, this.f20079u.f17986cO);
            }
            if (this.f20079u.f17985cN != null && !this.f20079u.f17985cN.equals("")) {
                this.f20056aw = C2997g.m10716a(this);
            }
            if (this.f20079u.f17988cQ != null && !this.f20079u.f17988cQ.equals("")) {
                this.f20058ay = new RewardedVideoAd(this, this.f20079u.f17988cQ);
            }
            if (this.f20079u.f17989cR != null && !this.f20079u.f17989cR.equals("")) {
                this.f20059az = new StartAppAd(this);
            }
            this.f20025aD = new ProgressDialog(this);
            this.f20024aC = view;
            if (!this.f20079u.mo20774a((Context) this, view, this.f20074p, this.f20025aD, this.f20056aw, this.f20057ax, this.f20058ay, this.f20059az)) {
                abrir_secc(view);
            }
        }
    }

    public void abrir_secc(View view) {
        C5662h a = this.f20079u.mo20761a(view, (Context) this);
        try {
            String str = this.f20070l;
            StringBuilder sb = new StringBuilder();
            sb.append(this.f20060b);
            sb.append("");
            if (str.equals(sb.toString()) && a.f18226a != null && a.f18226a.getComponent().getClassName().endsWith(".preperfil")) {
                return;
            }
        } catch (Exception unused) {
        }
        if (a.f18227b) {
            this.f20041ah = true;
            Intent intent = new Intent();
            intent.putExtra("finalizar", true);
            intent.putExtra("finalizar_app", a.f18228c);
            setResult(-1, intent);
        }
        if (a.f18229d) {
            startActivityForResult(a.f18226a, 0);
        } else if (a.f18226a != null) {
            if (a.f18227b && this.f20079u.f18045dm != 2) {
                a.f18226a.putExtra("es_root", true);
            }
            this.f20043aj = false;
            startActivity(a.f18226a);
        }
        if (this.f20041ah && !this.f20023aB) {
            finish();
        }
    }

    /* renamed from: g */
    public void mo21854g() {
        String str = "";
        if (this.f20065g != -1) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f20065g);
            sb.append(getResources().getString(R.string.anyos_abrev));
            str = sb.toString();
        }
        if (this.f20073o != null) {
            String country = Locale.getDefault().getCountry();
            long parseLong = Long.parseLong(this.f20073o);
            String str2 = "m.";
            if (country.equals("US") || country.equals("GB") || country.equals("MM")) {
                if (parseLong > 1600) {
                    parseLong = (long) Math.round((float) (parseLong / 1600));
                    str2 = "mi.";
                } else {
                    parseLong = Math.round(((double) parseLong) * 1.09d);
                    str2 = "yd.";
                }
            } else if (parseLong > 999) {
                parseLong = (long) Math.round((float) (parseLong / 1000));
                str2 = "km.";
            }
            if (!str.isEmpty()) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(", ");
                str = sb2.toString();
            }
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str);
            sb3.append(parseLong);
            sb3.append(str2);
            str = sb3.toString();
        }
        if (!str.isEmpty()) {
            ((TextView) findViewById(R.id.tv_subtit)).setText(str);
            ((TextView) findViewById(R.id.tv_subtit)).setVisibility(0);
            return;
        }
        ((TextView) findViewById(R.id.tv_subtit)).setVisibility(8);
    }

    /* renamed from: h */
    public void mo21855h() {
        if (((TextView) findViewById(R.id.tv_subtit)).getVisibility() == 8) {
            findViewById(R.id.v_aux1).setVisibility(0);
        } else {
            findViewById(R.id.v_aux1).setVisibility(8);
        }
        if (((TextView) findViewById(R.id.descr)).getVisibility() == 8) {
            findViewById(R.id.v_aux2).setVisibility(0);
        } else {
            findViewById(R.id.v_aux2).setVisibility(8);
        }
    }

    /* renamed from: c */
    private void m24506c(boolean z) {
        String trim = ((TextView) findViewById(R.id.et_coment_self)).getText().toString().replace("@", "").trim();
        if (!trim.equals("")) {
            if (z && this.f20064f < 600) {
                ((InputMethodManager) getSystemService("input_method")).hideSoftInputFromWindow(((TextView) findViewById(R.id.c_mensaje)).getWindowToken(), 0);
            }
            ((TextView) findViewById(R.id.et_coment_self)).setTextColor(-7829368);
            this.f20009O.setVisibility(0);
            if (this.f20055av == null || this.f20055av.getStatus() != Status.RUNNING) {
                SharedPreferences sharedPreferences = this.f20031aJ;
                StringBuilder sb = new StringBuilder();
                sb.append("usufav_");
                sb.append(this.f20070l);
                if (!sharedPreferences.contains(sb.toString())) {
                    SharedPreferences sharedPreferences2 = this.f20031aJ;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("usufav_noactivar_");
                    sb2.append(this.f20070l);
                    if (!sharedPreferences2.contains(sb2.toString())) {
                        mo21848a(true);
                    }
                }
                this.f20055av = new C6073m(trim);
                this.f20055av.execute(new String[0]);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x00a8, code lost:
        if (r12.equals(r14.toString()) != false) goto L_0x00aa;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo21847a(java.lang.Boolean r18, java.lang.Boolean r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, java.lang.String r26, java.lang.String r27, java.lang.String r28, java.lang.String r29, java.lang.String r30, java.lang.String r31) {
        /*
            r17 = this;
            r0 = r17
            r1 = r20
            r2 = r21
            r3 = r22
            r4 = r25
            java.lang.String r5 = "layout_inflater"
            java.lang.Object r5 = r0.getSystemService(r5)
            android.view.LayoutInflater r5 = (android.view.LayoutInflater) r5
            r6 = 2131361857(0x7f0a0041, float:1.8343478E38)
            r7 = 0
            android.view.View r5 = r5.inflate(r6, r7)
            android.widget.LinearLayout r5 = (android.widget.LinearLayout) r5
            r6 = 2131231019(0x7f08012b, float:1.8078107E38)
            r5.setTag(r6, r1)
            r7 = 2131231131(0x7f08019b, float:1.8078334E38)
            android.view.View r7 = r5.findViewById(r7)
            android.widget.ImageView r7 = (android.widget.ImageView) r7
            r8 = 2131231595(0x7f08036b, float:1.8079275E38)
            android.view.View r8 = r5.findViewById(r8)
            android.widget.TextView r8 = (android.widget.TextView) r8
            r9 = 2131231558(0x7f080346, float:1.80792E38)
            android.view.View r9 = r5.findViewById(r9)
            android.widget.TextView r9 = (android.widget.TextView) r9
            r10 = 2131231542(0x7f080336, float:1.8079168E38)
            android.view.View r10 = r5.findViewById(r10)
            android.widget.TextView r10 = (android.widget.TextView) r10
            r11 = 2131231068(0x7f08015c, float:1.8078207E38)
            android.view.View r11 = r5.findViewById(r11)
            android.widget.ImageView r11 = (android.widget.ImageView) r11
            boolean r12 = r0.f20046am
            if (r12 == 0) goto L_0x0063
            int r12 = mega.boicot.config.f17813a
            r8.setTextColor(r12)
            int r12 = mega.boicot.config.f17838f
            r9.setTextColor(r12)
            int r12 = mega.boicot.config.f17813a
            r10.setTextColor(r12)
            goto L_0x006f
        L_0x0063:
            r12 = -1
            r8.setTextColor(r12)
            int r13 = mega.boicot.config.f17834e
            r9.setTextColor(r13)
            r10.setTextColor(r12)
        L_0x006f:
            boolean r12 = r18.booleanValue()
            r13 = 0
            if (r12 != 0) goto L_0x00c2
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            int r14 = r0.f20060b
            r12.append(r14)
            java.lang.String r14 = ""
            r12.append(r14)
            java.lang.String r12 = r12.toString()
            boolean r12 = r2.equals(r12)
            if (r12 != 0) goto L_0x00aa
            java.lang.String r12 = r0.f20070l
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            int r15 = r0.f20060b
            r14.append(r15)
            java.lang.String r15 = ""
            r14.append(r15)
            java.lang.String r14 = r14.toString()
            boolean r12 = r12.equals(r14)
            if (r12 == 0) goto L_0x00c2
        L_0x00aa:
            boolean r12 = r0.f20046am
            if (r12 == 0) goto L_0x00bc
            android.content.res.Resources r12 = r17.getResources()
            r14 = 2131165388(0x7f0700cc, float:1.7944992E38)
            android.graphics.drawable.Drawable r12 = r12.getDrawable(r14)
            r11.setImageDrawable(r12)
        L_0x00bc:
            r11.setOnClickListener(r0)
            r11.setVisibility(r13)
        L_0x00c2:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            int r12 = r0.f20060b
            r11.append(r12)
            java.lang.String r12 = ""
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            boolean r11 = r2.equals(r11)
            if (r11 == 0) goto L_0x00ea
            android.content.res.Resources r11 = r17.getResources()
            r12 = 2131558744(0x7f0d0158, float:1.8742812E38)
            java.lang.String r11 = r11.getString(r12)
            r8.setText(r11)
            goto L_0x00ed
        L_0x00ea:
            r8.setText(r3)
        L_0x00ed:
            java.lang.String r8 = mega.boicot.config.m23848b(r23)
            java.text.SimpleDateFormat r11 = new java.text.SimpleDateFormat
            java.lang.String r12 = "ddMMyyHHmm"
            r11.<init>(r12)
            r12 = 1
            java.text.DateFormat r14 = android.text.format.DateFormat.getDateFormat(r17)     // Catch:{ Exception -> 0x016b }
            java.text.DateFormat r15 = android.text.format.DateFormat.getTimeFormat(r17)     // Catch:{ Exception -> 0x016b }
            java.util.Date r8 = r11.parse(r8)     // Catch:{ Exception -> 0x016b }
            java.util.Calendar r11 = java.util.Calendar.getInstance()     // Catch:{ Exception -> 0x016b }
            java.util.Calendar r13 = java.util.Calendar.getInstance()     // Catch:{ Exception -> 0x016b }
            r13.setTime(r8)     // Catch:{ Exception -> 0x016b }
            int r6 = r13.get(r12)     // Catch:{ Exception -> 0x016b }
            int r1 = r11.get(r12)     // Catch:{ Exception -> 0x016b }
            if (r6 != r1) goto L_0x014c
            r1 = 6
            int r6 = r13.get(r1)     // Catch:{ Exception -> 0x016b }
            int r1 = r11.get(r1)     // Catch:{ Exception -> 0x016b }
            if (r6 != r1) goto L_0x014c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x016b }
            r1.<init>()     // Catch:{ Exception -> 0x016b }
            android.content.res.Resources r6 = r17.getResources()     // Catch:{ Exception -> 0x016b }
            r11 = 2131558655(0x7f0d00ff, float:1.8742632E38)
            java.lang.String r6 = r6.getString(r11)     // Catch:{ Exception -> 0x016b }
            r1.append(r6)     // Catch:{ Exception -> 0x016b }
            java.lang.String r6 = " "
            r1.append(r6)     // Catch:{ Exception -> 0x016b }
            java.lang.String r6 = r15.format(r8)     // Catch:{ Exception -> 0x016b }
            r1.append(r6)     // Catch:{ Exception -> 0x016b }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x016b }
            r9.setText(r1)     // Catch:{ Exception -> 0x016b }
            goto L_0x016b
        L_0x014c:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x016b }
            r1.<init>()     // Catch:{ Exception -> 0x016b }
            java.lang.String r6 = r14.format(r8)     // Catch:{ Exception -> 0x016b }
            r1.append(r6)     // Catch:{ Exception -> 0x016b }
            java.lang.String r6 = " "
            r1.append(r6)     // Catch:{ Exception -> 0x016b }
            java.lang.String r6 = r15.format(r8)     // Catch:{ Exception -> 0x016b }
            r1.append(r6)     // Catch:{ Exception -> 0x016b }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x016b }
            r9.setText(r1)     // Catch:{ Exception -> 0x016b }
        L_0x016b:
            r1 = r24
            r10.setText(r1)
            r1 = 2131231017(0x7f080129, float:1.8078103E38)
            r7.setTag(r1, r2)
            int r6 = r0.f20061c
            if (r6 <= 0) goto L_0x022a
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            int r8 = r0.f20060b
            r6.append(r8)
            java.lang.String r8 = ""
            r6.append(r8)
            java.lang.String r6 = r6.toString()
            boolean r6 = r2.equals(r6)
            if (r6 == 0) goto L_0x01a2
            java.lang.String r6 = "0"
            r8 = 2131231019(0x7f08012b, float:1.8078107E38)
            r7.setTag(r8, r6)
            android.graphics.Bitmap r6 = r0.f20050aq
            r7.setImageBitmap(r6)
            goto L_0x022f
        L_0x01a2:
            r8 = 2131231019(0x7f08012b, float:1.8078107E38)
            r7.setTag(r8, r4)
            java.io.File r6 = new java.io.File     // Catch:{ Exception | OutOfMemoryError -> 0x022f }
            java.io.File r8 = r0.f20080v     // Catch:{ Exception | OutOfMemoryError -> 0x022f }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ Exception | OutOfMemoryError -> 0x022f }
            r9.<init>()     // Catch:{ Exception | OutOfMemoryError -> 0x022f }
            java.lang.String r10 = "fperfil_"
            r9.append(r10)     // Catch:{ Exception | OutOfMemoryError -> 0x022f }
            r9.append(r2)     // Catch:{ Exception | OutOfMemoryError -> 0x022f }
            java.lang.String r10 = ".jpg"
            r9.append(r10)     // Catch:{ Exception | OutOfMemoryError -> 0x022f }
            java.lang.String r9 = r9.toString()     // Catch:{ Exception | OutOfMemoryError -> 0x022f }
            r6.<init>(r8, r9)     // Catch:{ Exception | OutOfMemoryError -> 0x022f }
            android.graphics.BitmapFactory$Options r8 = new android.graphics.BitmapFactory$Options     // Catch:{ Exception | OutOfMemoryError -> 0x022f }
            r8.<init>()     // Catch:{ Exception | OutOfMemoryError -> 0x022f }
            r8.inJustDecodeBounds = r12     // Catch:{ Exception | OutOfMemoryError -> 0x022f }
            java.lang.String r9 = r6.getPath()     // Catch:{ Exception | OutOfMemoryError -> 0x022f }
            android.graphics.BitmapFactory.decodeFile(r9, r8)     // Catch:{ Exception | OutOfMemoryError -> 0x022f }
            int r9 = r8.outWidth     // Catch:{ Exception | OutOfMemoryError -> 0x022f }
            android.content.res.Resources r9 = r17.getResources()     // Catch:{ Exception | OutOfMemoryError -> 0x022f }
            android.util.DisplayMetrics r9 = r9.getDisplayMetrics()     // Catch:{ Exception | OutOfMemoryError -> 0x022f }
            float r9 = r9.density     // Catch:{ Exception | OutOfMemoryError -> 0x022f }
            r10 = 1111490560(0x42400000, float:48.0)
            float r9 = r9 * r10
            r11 = 1056964608(0x3f000000, float:0.5)
            float r9 = r9 + r11
            int r9 = (int) r9     // Catch:{ Exception | OutOfMemoryError -> 0x022f }
            android.content.res.Resources r13 = r17.getResources()     // Catch:{ Exception | OutOfMemoryError -> 0x022f }
            android.util.DisplayMetrics r13 = r13.getDisplayMetrics()     // Catch:{ Exception | OutOfMemoryError -> 0x022f }
            float r13 = r13.density     // Catch:{ Exception | OutOfMemoryError -> 0x022f }
            float r10 = r10 * r13
            float r10 = r10 + r11
            int r10 = (int) r10     // Catch:{ Exception | OutOfMemoryError -> 0x022f }
            int r11 = r8.outWidth     // Catch:{ Exception | OutOfMemoryError -> 0x022f }
            int r8 = r8.outHeight     // Catch:{ Exception | OutOfMemoryError -> 0x022f }
            if (r11 > r9) goto L_0x01fc
            if (r8 > r10) goto L_0x01fc
            goto L_0x01fd
        L_0x01fc:
            r12 = 0
        L_0x01fd:
            if (r12 != 0) goto L_0x021a
            int r8 = mega.boicot.config.m23824a(r11, r8, r9, r10)     // Catch:{ Exception | OutOfMemoryError -> 0x022f }
            float r9 = (float) r11     // Catch:{ Exception | OutOfMemoryError -> 0x022f }
            float r8 = (float) r8     // Catch:{ Exception | OutOfMemoryError -> 0x022f }
            float r9 = r9 / r8
            int r8 = java.lang.Math.round(r9)     // Catch:{ Exception | OutOfMemoryError -> 0x022f }
            android.graphics.BitmapFactory$Options r9 = new android.graphics.BitmapFactory$Options     // Catch:{ Exception | OutOfMemoryError -> 0x022f }
            r9.<init>()     // Catch:{ Exception | OutOfMemoryError -> 0x022f }
            r9.inSampleSize = r8     // Catch:{ Exception | OutOfMemoryError -> 0x022f }
            java.lang.String r6 = r6.getPath()     // Catch:{ Exception | OutOfMemoryError -> 0x022f }
            android.graphics.Bitmap r6 = android.graphics.BitmapFactory.decodeFile(r6, r9)     // Catch:{ Exception | OutOfMemoryError -> 0x022f }
            goto L_0x0226
        L_0x021a:
            android.content.ContentResolver r8 = r17.getContentResolver()     // Catch:{ Exception | OutOfMemoryError -> 0x022f }
            android.net.Uri r6 = android.net.Uri.fromFile(r6)     // Catch:{ Exception | OutOfMemoryError -> 0x022f }
            android.graphics.Bitmap r6 = android.provider.MediaStore.Images.Media.getBitmap(r8, r6)     // Catch:{ Exception | OutOfMemoryError -> 0x022f }
        L_0x0226:
            r7.setImageBitmap(r6)     // Catch:{ Exception | OutOfMemoryError -> 0x022f }
            goto L_0x022f
        L_0x022a:
            r6 = 8
            r7.setVisibility(r6)
        L_0x022f:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            int r7 = r0.f20060b
            r6.append(r7)
            java.lang.String r7 = ""
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            boolean r6 = r2.equals(r6)
            if (r6 != 0) goto L_0x0292
            java.lang.String r6 = "ESCOMENT"
            r5.setTag(r1, r6)
            r1 = 2131231019(0x7f08012b, float:1.8078107E38)
            r5.setTag(r1, r2)
            r1 = 2131231020(0x7f08012c, float:1.807811E38)
            r5.setTag(r1, r3)
            r1 = 2131231021(0x7f08012d, float:1.8078111E38)
            r5.setTag(r1, r4)
            r1 = 2131231022(0x7f08012e, float:1.8078113E38)
            r2 = r26
            r5.setTag(r1, r2)
            r1 = 2131231023(0x7f08012f, float:1.8078115E38)
            r2 = r27
            r5.setTag(r1, r2)
            r1 = 2131231024(0x7f080130, float:1.8078117E38)
            r2 = r28
            r5.setTag(r1, r2)
            r1 = 2131231025(0x7f080131, float:1.807812E38)
            r2 = r29
            r5.setTag(r1, r2)
            r1 = 2131231026(0x7f080132, float:1.8078121E38)
            r2 = r30
            r5.setTag(r1, r2)
            r1 = 2131231018(0x7f08012a, float:1.8078105E38)
            r2 = r31
            r5.setTag(r1, r2)
            r5.setOnClickListener(r0)
        L_0x0292:
            boolean r1 = r19.booleanValue()
            if (r1 == 0) goto L_0x02a1
            android.widget.LinearLayout r1 = r0.f20011Q
            r2 = 0
            r1.addView(r5, r2)
        L_0x029e:
            r1 = r20
            goto L_0x02a7
        L_0x02a1:
            android.widget.LinearLayout r1 = r0.f20011Q
            r1.addView(r5)
            goto L_0x029e
        L_0x02a7:
            r0.f20072n = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: mega.boicot.profile.mo21847a(java.lang.Boolean, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo21852b(boolean z) {
        this.f20011Q.removeAllViews();
        boolean z2 = false;
        int i = 0;
        while (i < 4) {
            SharedPreferences sharedPreferences = this.f20031aJ;
            StringBuilder sb = new StringBuilder();
            sb.append("idcom");
            sb.append(i);
            sb.append("_");
            sb.append(this.f20070l);
            if (!sharedPreferences.getString(sb.toString(), "").equals("")) {
                Boolean valueOf = Boolean.valueOf(z);
                Boolean valueOf2 = Boolean.valueOf(z2);
                SharedPreferences sharedPreferences2 = this.f20031aJ;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("idcom");
                sb2.append(i);
                sb2.append("_");
                sb2.append(this.f20070l);
                String string = sharedPreferences2.getString(sb2.toString(), "");
                SharedPreferences sharedPreferences3 = this.f20031aJ;
                StringBuilder sb3 = new StringBuilder();
                sb3.append("com");
                sb3.append(i);
                sb3.append("_idusucrea_");
                sb3.append(this.f20070l);
                String string2 = sharedPreferences3.getString(sb3.toString(), "");
                SharedPreferences sharedPreferences4 = this.f20031aJ;
                StringBuilder sb4 = new StringBuilder();
                sb4.append("com");
                sb4.append(i);
                sb4.append("_nombre_");
                sb4.append(this.f20070l);
                String string3 = sharedPreferences4.getString(sb4.toString(), "");
                SharedPreferences sharedPreferences5 = this.f20031aJ;
                StringBuilder sb5 = new StringBuilder();
                sb5.append("com");
                sb5.append(i);
                sb5.append("_fcrea_");
                sb5.append(this.f20070l);
                String string4 = sharedPreferences5.getString(sb5.toString(), "");
                SharedPreferences sharedPreferences6 = this.f20031aJ;
                StringBuilder sb6 = new StringBuilder();
                sb6.append("com");
                sb6.append(i);
                sb6.append("_");
                sb6.append(this.f20070l);
                String string5 = sharedPreferences6.getString(sb6.toString(), "");
                SharedPreferences sharedPreferences7 = this.f20031aJ;
                StringBuilder sb7 = new StringBuilder();
                sb7.append("com");
                sb7.append(i);
                sb7.append("_vfoto_");
                sb7.append(this.f20070l);
                String string6 = sharedPreferences7.getString(sb7.toString(), "");
                SharedPreferences sharedPreferences8 = this.f20031aJ;
                StringBuilder sb8 = new StringBuilder();
                sb8.append("com");
                sb8.append(i);
                sb8.append("_privados_");
                sb8.append(this.f20070l);
                String string7 = sharedPreferences8.getString(sb8.toString(), "");
                SharedPreferences sharedPreferences9 = this.f20031aJ;
                StringBuilder sb9 = new StringBuilder();
                sb9.append("com");
                sb9.append(i);
                sb9.append("_fnacd_");
                sb9.append(this.f20070l);
                String string8 = sharedPreferences9.getString(sb9.toString(), "");
                SharedPreferences sharedPreferences10 = this.f20031aJ;
                StringBuilder sb10 = new StringBuilder();
                sb10.append("com");
                sb10.append(i);
                sb10.append("_fnacm_");
                sb10.append(this.f20070l);
                String string9 = sharedPreferences10.getString(sb10.toString(), "");
                SharedPreferences sharedPreferences11 = this.f20031aJ;
                StringBuilder sb11 = new StringBuilder();
                sb11.append("com");
                sb11.append(i);
                sb11.append("_fnaca_");
                sb11.append(this.f20070l);
                String string10 = sharedPreferences11.getString(sb11.toString(), "");
                SharedPreferences sharedPreferences12 = this.f20031aJ;
                StringBuilder sb12 = new StringBuilder();
                String str = string10;
                sb12.append("com");
                sb12.append(i);
                sb12.append("_sexo_");
                sb12.append(this.f20070l);
                String string11 = sharedPreferences12.getString(sb12.toString(), "");
                SharedPreferences sharedPreferences13 = this.f20031aJ;
                StringBuilder sb13 = new StringBuilder();
                String str2 = string11;
                sb13.append("com");
                sb13.append(i);
                sb13.append("_coments_");
                sb13.append(this.f20070l);
                String string12 = sharedPreferences13.getString(sb13.toString(), "");
                String str3 = str;
                int i2 = i;
                mo21847a(valueOf, valueOf2, string, string2, string3, string4, string5, string6, string7, string8, string9, str3, str2, string12);
                i = i2 + 1;
                z2 = false;
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public void mo21856i() {
        this.f20082x.setVisibility(8);
        this.f20083y.setVisibility(8);
        this.f20084z.setVisibility(8);
        this.f19995A.setVisibility(8);
        this.f20001G.setVisibility(8);
        this.f20002H.setVisibility(8);
        this.f20003I.setVisibility(8);
        this.f20004J.setVisibility(8);
        this.f20012R.setVisibility(8);
        this.f20013S.setVisibility(8);
        this.f20014T.setVisibility(8);
        this.f20015U.setVisibility(8);
        int i = 0;
        while (i < 4 && this.f20062d + i <= this.f20077s.size() - 1) {
            mo21846a(this.f20062d + i, true);
            i++;
        }
        if (this.f20077s.isEmpty()) {
            String str = this.f20070l;
            StringBuilder sb = new StringBuilder();
            sb.append(this.f20060b);
            sb.append("");
            if (!str.equals(sb.toString())) {
                findViewById(R.id.tl_fotos).setVisibility(8);
                this.f20052as = new C6066f();
                this.f20052as.execute(new String[0]);
            }
        }
        if (this.f20062d + i <= this.f20077s.size() - 1 || !this.f20044ak) {
            findViewById(R.id.fl_masfotos).setVisibility(0);
        } else {
            findViewById(R.id.fl_masfotos).setVisibility(4);
        }
        if (this.f20062d > 0) {
            findViewById(R.id.fl_menosfotos).setVisibility(0);
        } else {
            findViewById(R.id.fl_menosfotos).setVisibility(4);
        }
        findViewById(R.id.tl_fotos).setVisibility(0);
        this.f20052as = new C6066f();
        this.f20052as.execute(new String[0]);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public void mo21857j() {
        this.f20082x.setVisibility(8);
        this.f20083y.setVisibility(8);
        this.f20084z.setVisibility(8);
        this.f19995A.setVisibility(8);
        this.f20001G.setVisibility(8);
        this.f20002H.setVisibility(8);
        this.f20003I.setVisibility(8);
        this.f20004J.setVisibility(8);
        this.f20012R.setVisibility(8);
        this.f20013S.setVisibility(8);
        this.f20014T.setVisibility(8);
        this.f20015U.setVisibility(8);
        int i = 0;
        boolean z = false;
        while (i < 4) {
            SharedPreferences sharedPreferences = this.f20031aJ;
            StringBuilder sb = new StringBuilder();
            sb.append("idf");
            sb.append(i);
            sb.append("_");
            sb.append(this.f20070l);
            if (sharedPreferences.getString(sb.toString(), "").equals("")) {
                break;
            }
            mo21846a(i, false);
            i++;
            z = true;
        }
        if (!z) {
            String str = this.f20070l;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f20060b);
            sb2.append("");
            if (!str.equals(sb2.toString())) {
                findViewById(R.id.tl_fotos).setVisibility(8);
                return;
            }
        }
        findViewById(R.id.tl_fotos).setVisibility(0);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo21846a(int i, boolean z) {
        ProgressBar progressBar;
        TextView textView;
        LinearLayout linearLayout;
        ImageView imageView;
        String str;
        String str2;
        Bitmap bitmap;
        int i2 = i % 4;
        boolean z2 = true;
        if (i2 == 0) {
            imageView = this.f20082x;
            linearLayout = this.f20012R;
            textView = this.f20020Z;
            progressBar = this.f20001G;
        } else if (i2 == 1) {
            imageView = this.f20083y;
            linearLayout = this.f20013S;
            textView = this.f20034aa;
            progressBar = this.f20002H;
        } else if (i2 == 2) {
            imageView = this.f20084z;
            linearLayout = this.f20014T;
            textView = this.f20035ab;
            progressBar = this.f20003I;
        } else if (i2 == 3) {
            imageView = this.f19995A;
            linearLayout = this.f20015U;
            textView = this.f20036ac;
            progressBar = this.f20004J;
        } else {
            return;
        }
        Boolean valueOf = Boolean.valueOf(false);
        if (z) {
            str = ((C6061a) this.f20077s.get(i)).f20116a;
            String str3 = ((C6061a) this.f20077s.get(i)).f20117b;
            str2 = str3;
            valueOf = Boolean.valueOf(((C6061a) this.f20077s.get(i)).f20120e);
        } else {
            SharedPreferences sharedPreferences = this.f20031aJ;
            StringBuilder sb = new StringBuilder();
            sb.append("idf");
            sb.append(i);
            sb.append("_");
            sb.append(this.f20070l);
            str = sharedPreferences.getString(sb.toString(), "");
            SharedPreferences sharedPreferences2 = this.f20031aJ;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(C1248f.TAG);
            sb2.append(i);
            sb2.append("_nlikes_");
            sb2.append(this.f20070l);
            str2 = sharedPreferences2.getString(sb2.toString(), "");
        }
        progressBar.setVisibility(8);
        imageView.setTag(R.id.idaux1, str);
        imageView.setTag(R.id.idaux2, "N");
        StringBuilder sb3 = new StringBuilder();
        sb3.append(i);
        sb3.append("");
        imageView.setTag(R.id.idaux3, sb3.toString());
        if (valueOf.booleanValue()) {
            imageView.setImageDrawable(null);
            imageView.setTag(R.id.idaux2, "S");
            linearLayout.setVisibility(8);
        } else {
            if (str2.equals("0")) {
                linearLayout.setVisibility(8);
            } else {
                textView.setText(str2);
                linearLayout.setVisibility(0);
            }
            try {
                File file = this.f20080v;
                StringBuilder sb4 = new StringBuilder();
                sb4.append("fperfilgal_");
                sb4.append(str);
                sb4.append(".jpg");
                File file2 = new File(file, sb4.toString());
                Options options = new Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeFile(file2.getPath(), options);
                int i3 = options.outWidth;
                int i4 = (int) ((getResources().getDisplayMetrics().density * 48.0f) + 0.5f);
                int i5 = (int) ((48.0f * getResources().getDisplayMetrics().density) + 0.5f);
                int i6 = options.outWidth;
                int i7 = options.outHeight;
                if (i6 > i4 || i7 > i5) {
                    z2 = false;
                }
                if (!z2) {
                    int round = Math.round(((float) i6) / ((float) config.m23824a(i6, i7, i4, i5)));
                    Options options2 = new Options();
                    options2.inSampleSize = round;
                    bitmap = BitmapFactory.decodeFile(file2.getPath(), options2);
                } else {
                    bitmap = Media.getBitmap(getContentResolver(), Uri.fromFile(file2));
                }
                imageView.setImageBitmap(bitmap);
                imageView.setTag(R.id.idaux2, "S");
            } catch (Exception unused) {
                imageView.setImageDrawable(getResources().getDrawable(R.drawable.sinfoto_chat));
                progressBar.setVisibility(0);
            } catch (OutOfMemoryError unused2) {
            }
        }
        imageView.setVisibility(0);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: k */
    public void mo21858k() {
        this.f19996B.setVisibility(8);
        this.f19997C.setVisibility(8);
        this.f19998D.setVisibility(8);
        this.f19999E.setVisibility(8);
        this.f20005K.setVisibility(8);
        this.f20006L.setVisibility(8);
        this.f20007M.setVisibility(8);
        this.f20008N.setVisibility(8);
        this.f20016V.setVisibility(8);
        this.f20017W.setVisibility(8);
        this.f20018X.setVisibility(8);
        this.f20019Y.setVisibility(8);
        int i = 0;
        while (i < 4 && this.f20063e + i <= this.f20078t.size() - 1) {
            mo21851b(this.f20063e + i, true);
            i++;
        }
        if (this.f20078t.isEmpty()) {
            String str = this.f20070l;
            StringBuilder sb = new StringBuilder();
            sb.append(this.f20060b);
            sb.append("");
            if (!str.equals(sb.toString())) {
                findViewById(R.id.tl_videos).setVisibility(8);
                this.f20053at = new C6070j();
                this.f20053at.execute(new String[0]);
            }
        }
        if (this.f20063e + i <= this.f20078t.size() - 1 || !this.f20045al) {
            findViewById(R.id.fl_masvideos).setVisibility(0);
        } else {
            findViewById(R.id.fl_masvideos).setVisibility(4);
        }
        if (this.f20063e > 0) {
            findViewById(R.id.fl_menosvideos).setVisibility(0);
        } else {
            findViewById(R.id.fl_menosvideos).setVisibility(4);
        }
        findViewById(R.id.tl_videos).setVisibility(0);
        this.f20053at = new C6070j();
        this.f20053at.execute(new String[0]);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: l */
    public void mo21859l() {
        this.f19996B.setVisibility(8);
        this.f19997C.setVisibility(8);
        this.f19998D.setVisibility(8);
        this.f19999E.setVisibility(8);
        this.f20005K.setVisibility(8);
        this.f20006L.setVisibility(8);
        this.f20007M.setVisibility(8);
        this.f20008N.setVisibility(8);
        this.f20016V.setVisibility(8);
        this.f20017W.setVisibility(8);
        this.f20018X.setVisibility(8);
        this.f20019Y.setVisibility(8);
        int i = 0;
        boolean z = false;
        while (i < 4) {
            SharedPreferences sharedPreferences = this.f20031aJ;
            StringBuilder sb = new StringBuilder();
            sb.append("idv");
            sb.append(i);
            sb.append("_");
            sb.append(this.f20070l);
            if (sharedPreferences.getString(sb.toString(), "").equals("")) {
                break;
            }
            mo21851b(i, false);
            i++;
            z = true;
        }
        if (!z) {
            String str = this.f20070l;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f20060b);
            sb2.append("");
            if (!str.equals(sb2.toString())) {
                findViewById(R.id.tl_videos).setVisibility(8);
                return;
            }
        }
        findViewById(R.id.tl_videos).setVisibility(0);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo21851b(int i, boolean z) {
        ProgressBar progressBar;
        TextView textView;
        LinearLayout linearLayout;
        ImageView imageView;
        String str;
        String str2;
        Bitmap bitmap;
        int i2 = i % 4;
        boolean z2 = true;
        if (i2 == 0) {
            imageView = this.f19996B;
            linearLayout = this.f20016V;
            textView = this.f20037ad;
            progressBar = this.f20005K;
        } else if (i2 == 1) {
            imageView = this.f19997C;
            linearLayout = this.f20017W;
            textView = this.f20038ae;
            progressBar = this.f20006L;
        } else if (i2 == 2) {
            imageView = this.f19998D;
            linearLayout = this.f20018X;
            textView = this.f20039af;
            progressBar = this.f20007M;
        } else if (i2 == 3) {
            imageView = this.f19999E;
            linearLayout = this.f20019Y;
            textView = this.f20040ag;
            progressBar = this.f20008N;
        } else {
            return;
        }
        Boolean valueOf = Boolean.valueOf(false);
        if (z) {
            str = ((C6062b) this.f20078t.get(i)).f20122a;
            String str3 = ((C6062b) this.f20078t.get(i)).f20124c;
            str2 = str3;
            valueOf = Boolean.valueOf(((C6062b) this.f20078t.get(i)).f20127f);
        } else {
            SharedPreferences sharedPreferences = this.f20031aJ;
            StringBuilder sb = new StringBuilder();
            sb.append("idv");
            sb.append(i);
            sb.append("_");
            sb.append(this.f20070l);
            str = sharedPreferences.getString(sb.toString(), "");
            SharedPreferences sharedPreferences2 = this.f20031aJ;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("v");
            sb2.append(i);
            sb2.append("_nlikes_");
            sb2.append(this.f20070l);
            str2 = sharedPreferences2.getString(sb2.toString(), "");
        }
        progressBar.setVisibility(8);
        imageView.setTag(R.id.idaux1, str);
        imageView.setTag(R.id.idaux2, "N");
        StringBuilder sb3 = new StringBuilder();
        sb3.append(i);
        sb3.append("");
        imageView.setTag(R.id.idaux3, sb3.toString());
        if (valueOf.booleanValue()) {
            imageView.setImageDrawable(null);
            imageView.setTag(R.id.idaux2, "S");
            linearLayout.setVisibility(8);
        } else {
            if (str2.equals("0")) {
                linearLayout.setVisibility(8);
            } else {
                textView.setText(str2);
                linearLayout.setVisibility(0);
            }
            try {
                File file = this.f20080v;
                StringBuilder sb4 = new StringBuilder();
                sb4.append("fperfilgalv_");
                sb4.append(str);
                sb4.append(".jpg");
                File file2 = new File(file, sb4.toString());
                Options options = new Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeFile(file2.getPath(), options);
                int i3 = options.outWidth;
                int i4 = (int) ((getResources().getDisplayMetrics().density * 48.0f) + 0.5f);
                int i5 = (int) ((48.0f * getResources().getDisplayMetrics().density) + 0.5f);
                int i6 = options.outWidth;
                int i7 = options.outHeight;
                if (i6 > i4 || i7 > i5) {
                    z2 = false;
                }
                if (!z2) {
                    int round = Math.round(((float) i6) / ((float) config.m23824a(i6, i7, i4, i5)));
                    Options options2 = new Options();
                    options2.inSampleSize = round;
                    bitmap = BitmapFactory.decodeFile(file2.getPath(), options2);
                } else {
                    bitmap = Media.getBitmap(getContentResolver(), Uri.fromFile(file2));
                }
                imageView.setImageBitmap(config.m23829a(bitmap, BitmapFactory.decodeResource(getResources(), R.drawable.play_ppp)));
                imageView.setTag(R.id.idaux2, "S");
            } catch (Exception unused) {
                imageView.setImageDrawable(getResources().getDrawable(R.drawable.sinfoto_chat));
                progressBar.setVisibility(0);
            } catch (OutOfMemoryError unused2) {
            }
        }
        imageView.setVisibility(0);
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ((LinearLayout) findViewById(R.id.ll_princ)).removeViewAt(0);
        mo21853f();
        ((LinearLayout) findViewById(R.id.ll_ad)).removeAllViews();
        if (!(this.f20048ao == null || this.f20048ao.f17768a == null)) {
            try {
                this.f20048ao.f17768a.mo12168c();
            } catch (Exception unused) {
            }
        }
        if (!(this.f20048ao == null || this.f20048ao.f17769b == null)) {
            try {
                this.f20048ao.f17769b.destroy();
            } catch (Exception unused2) {
            }
        }
        m24507m();
    }

    public boolean onSearchRequested() {
        if (this.f20079u.f18080q == 0) {
            return false;
        }
        this.f20041ah = true;
        this.f20023aB = true;
        return super.onSearchRequested();
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getWindow().setFormat(1);
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("es_root", this.f20043aj);
    }

    public void onStop() {
        super.onStop();
        if (this.f20041ah && !this.f20023aB) {
            finish();
        }
    }

    public void onPause() {
        if (!(this.f20079u.f18013cx == 0 || this.f20048ao == null || this.f20048ao.f17768a == null)) {
            this.f20048ao.f17768a.mo12167b();
        }
        super.onPause();
    }

    public void onResume() {
        super.onResume();
        config.m23860m(this);
        SharedPreferences sharedPreferences = this.f20031aJ;
        StringBuilder sb = new StringBuilder();
        sb.append("usufav_");
        sb.append(this.f20070l);
        mo21848a(sharedPreferences.contains(sb.toString()));
        if (this.f20079u.f18013cx != 0 && this.f20048ao != null && this.f20048ao.f17768a != null) {
            this.f20048ao.f17768a.mo12165a();
        }
    }

    public void onDestroy() {
        if (!(this.f20079u.f18013cx == 0 || this.f20048ao == null || this.f20048ao.f17768a == null)) {
            this.f20048ao.f17768a.mo12168c();
        }
        if (!(this.f20079u.f18013cx == 0 || this.f20048ao == null || this.f20048ao.f17769b == null)) {
            this.f20048ao.f17769b.destroy();
        }
        if ((this.f20043aj && isFinishing()) || config.f17841i) {
            config.m23861n(this);
        }
        super.onDestroy();
    }

    public void onBackPressed() {
        if (!this.f20043aj || this.f20042ai || !this.f20079u.f18059ea) {
            super.onBackPressed();
            return;
        }
        this.f20042ai = true;
        config.m23859l(this);
    }

    public void adLoaded(String str) {
        this.f20025aD.cancel();
        this.f20057ax.showAd();
    }

    public void onAdClosed() {
        if (this.f20022aA) {
            abrir_secc(this.f20024aC);
        }
    }

    public void adError(String str) {
        this.f20025aD.cancel();
        abrir_secc(this.f20024aC);
    }

    public void videoEnded() {
        this.f20022aA = true;
        config.m23867t(this);
    }

    /* renamed from: z_ */
    public void mo9678z_() {
        this.f20025aD.cancel();
        this.f20056aw.mo12836a();
    }

    /* renamed from: a */
    public void mo9675a(C3165a aVar) {
        this.f20022aA = true;
        config.m23867t(this);
    }

    /* renamed from: A_ */
    public void mo9671A_() {
        if (this.f20022aA) {
            abrir_secc(this.f20024aC);
        }
    }

    /* renamed from: e */
    public void mo9676e() {
        this.f20022aA = false;
    }

    /* renamed from: a */
    public void mo9674a(int i) {
        if (!this.f20079u.mo20775a((Context) this, this.f20057ax)) {
            this.f20025aD.cancel();
            abrir_secc(this.f20024aC);
        }
    }

    public void onError(C1514Ad ad, AdError adError) {
        this.f20025aD.cancel();
        abrir_secc(this.f20024aC);
    }

    public void onAdLoaded(C1514Ad ad) {
        this.f20025aD.cancel();
        this.f20058ay.show();
    }

    public void onRewardedVideoCompleted() {
        this.f20022aA = true;
        config.m23867t(this);
    }

    public void onRewardedVideoClosed() {
        if (this.f20022aA) {
            abrir_secc(this.f20024aC);
        }
    }

    public void onVideoCompleted() {
        this.f20022aA = true;
        config.m23867t(this);
    }

    public void onReceiveAd(C5286Ad ad) {
        this.f20025aD.cancel();
        this.f20059az.showAd("REWARDED VIDEO", new AdDisplayListener() {
            public void adClicked(C5286Ad ad) {
            }

            public void adDisplayed(C5286Ad ad) {
            }

            public void adNotDisplayed(C5286Ad ad) {
            }

            public void adHidden(C5286Ad ad) {
                if (profile.this.f20022aA) {
                    profile.this.abrir_secc(profile.this.f20024aC);
                }
            }
        });
    }

    public void onFailedToReceiveAd(C5286Ad ad) {
        this.f20025aD.cancel();
        abrir_secc(this.f20024aC);
    }
}
