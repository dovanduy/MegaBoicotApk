package mega.boicot;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
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
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.GradientDrawable.Orientation;
import android.os.AsyncTask;
import android.os.AsyncTask.Status;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ProgressBar;
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
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Locale;

public class t_buscusus extends Activity implements OnClickListener, OnItemClickListener, OnAdClosed, OnAdError, OnAdLoaded, OnVideoEnded, RewardedVideoAdListener, C3167c, VideoListener, AdEventListener, C5599a {

    /* renamed from: A */
    int f18690A;

    /* renamed from: B */
    int f18691B;

    /* renamed from: C */
    int f18692C;

    /* renamed from: D */
    String f18693D;

    /* renamed from: E */
    String f18694E;

    /* renamed from: F */
    String f18695F;

    /* renamed from: G */
    String f18696G;

    /* renamed from: H */
    Bitmap f18697H;

    /* renamed from: I */
    ArrayList<C5774b> f18698I;

    /* renamed from: J */
    GridView f18699J;

    /* renamed from: K */
    C5772a f18700K;

    /* renamed from: L */
    C5776d f18701L;

    /* renamed from: M */
    C5775c f18702M;

    /* renamed from: N */
    Dialog f18703N;

    /* renamed from: O */
    File f18704O;

    /* renamed from: P */
    TextView f18705P;

    /* renamed from: Q */
    TextView f18706Q;

    /* renamed from: R */
    TextView f18707R;

    /* renamed from: S */
    TextView f18708S;

    /* renamed from: T */
    TextView f18709T;

    /* renamed from: U */
    C5602c f18710U;

    /* renamed from: V */
    C3166b f18711V;

    /* renamed from: W */
    RewardedVideo f18712W;

    /* renamed from: X */
    RewardedVideoAd f18713X;

    /* renamed from: Y */
    StartAppAd f18714Y;

    /* renamed from: Z */
    boolean f18715Z = false;

    /* renamed from: a */
    int f18716a;

    /* renamed from: aa */
    boolean f18717aa = false;

    /* renamed from: ab */
    View f18718ab;

    /* renamed from: ac */
    ProgressDialog f18719ac;

    /* renamed from: ad */
    Bundle f18720ad;

    /* renamed from: ae */
    ListView f18721ae;

    /* renamed from: af */
    SharedPreferences f18722af;

    /* renamed from: b */
    int f18723b;

    /* renamed from: c */
    int f18724c;

    /* renamed from: d */
    int f18725d;

    /* renamed from: e */
    int f18726e;

    /* renamed from: f */
    int f18727f;

    /* renamed from: g */
    int f18728g;

    /* renamed from: h */
    config f18729h;

    /* renamed from: i */
    boolean f18730i = false;

    /* renamed from: j */
    boolean f18731j = false;

    /* renamed from: k */
    boolean f18732k = false;

    /* renamed from: l */
    boolean f18733l;

    /* renamed from: m */
    boolean f18734m;

    /* renamed from: n */
    boolean f18735n;

    /* renamed from: o */
    boolean f18736o;

    /* renamed from: p */
    boolean f18737p;

    /* renamed from: q */
    boolean f18738q = false;

    /* renamed from: r */
    boolean f18739r;

    /* renamed from: s */
    boolean f18740s;

    /* renamed from: t */
    boolean f18741t;

    /* renamed from: u */
    boolean f18742u;

    /* renamed from: v */
    boolean f18743v;

    /* renamed from: w */
    boolean f18744w;

    /* renamed from: x */
    int f18745x;

    /* renamed from: y */
    int f18746y;

    /* renamed from: z */
    int f18747z;

    /* renamed from: mega.boicot.t_buscusus$a */
    public class C5772a extends ArrayAdapter<C5774b> {

        /* renamed from: b */
        private Context f18753b;

        /* renamed from: c */
        private int f18754c;

        /* renamed from: d */
        private ArrayList<C5774b> f18755d = new ArrayList<>();

        /* renamed from: mega.boicot.t_buscusus$a$a */
        class C5773a {

            /* renamed from: a */
            TextView f18756a;

            /* renamed from: b */
            TextView f18757b;

            /* renamed from: c */
            ImageView f18758c;

            /* renamed from: d */
            ProgressBar f18759d;

            /* renamed from: e */
            ProgressBar f18760e;

            /* renamed from: f */
            LinearLayout f18761f;

            /* renamed from: g */
            LinearLayout f18762g;

            /* renamed from: h */
            LinearLayout f18763h;

            /* renamed from: i */
            LinearLayout f18764i;

            C5773a() {
            }
        }

        public C5772a(Context context, int i, ArrayList<C5774b> arrayList) {
            super(context, i, arrayList);
            this.f18754c = i;
            this.f18753b = context;
            this.f18755d = arrayList;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:79:0x02cc, code lost:
            if (r0.equals(r3.getString(r5.toString(), "0")) == false) goto L_0x02d0;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public android.view.View getView(int r11, android.view.View r12, android.view.ViewGroup r13) {
            /*
                r10 = this;
                mega.boicot.t_buscusus r0 = mega.boicot.t_buscusus.this
                boolean r0 = r0.f18734m
                r1 = 0
                if (r0 != 0) goto L_0x0042
                mega.boicot.t_buscusus r0 = mega.boicot.t_buscusus.this
                java.util.ArrayList<mega.boicot.t_buscusus$b> r0 = r0.f18698I
                int r0 = r0.size()
                int r0 = r0 - r11
                r2 = 10
                if (r0 >= r2) goto L_0x0042
                mega.boicot.t_buscusus r0 = mega.boicot.t_buscusus.this
                mega.boicot.t_buscusus$d r0 = r0.f18701L
                if (r0 == 0) goto L_0x0026
                mega.boicot.t_buscusus r0 = mega.boicot.t_buscusus.this
                mega.boicot.t_buscusus$d r0 = r0.f18701L
                android.os.AsyncTask$Status r0 = r0.getStatus()
                android.os.AsyncTask$Status r2 = android.os.AsyncTask.Status.RUNNING
                if (r0 == r2) goto L_0x0042
            L_0x0026:
                mega.boicot.t_buscusus r0 = mega.boicot.t_buscusus.this
                mega.boicot.t_buscusus$d r2 = new mega.boicot.t_buscusus$d
                mega.boicot.t_buscusus r3 = mega.boicot.t_buscusus.this
                mega.boicot.t_buscusus r4 = mega.boicot.t_buscusus.this
                java.util.ArrayList<mega.boicot.t_buscusus$b> r4 = r4.f18698I
                int r4 = r4.size()
                r2.<init>(r4)
                r0.f18701L = r2
                mega.boicot.t_buscusus r0 = mega.boicot.t_buscusus.this
                mega.boicot.t_buscusus$d r0 = r0.f18701L
                java.lang.String[] r2 = new java.lang.String[r1]
                r0.execute(r2)
            L_0x0042:
                mega.boicot.t_buscusus r0 = mega.boicot.t_buscusus.this
                int r0 = r0.f18728g
                r2 = 0
                if (r0 <= 0) goto L_0x0075
                mega.boicot.t_buscusus r0 = mega.boicot.t_buscusus.this
                boolean r0 = r0.f18738q
                if (r0 == 0) goto L_0x0075
                mega.boicot.t_buscusus r0 = mega.boicot.t_buscusus.this
                mega.boicot.t_buscusus$c r0 = r0.f18702M
                if (r0 == 0) goto L_0x0061
                mega.boicot.t_buscusus r0 = mega.boicot.t_buscusus.this
                mega.boicot.t_buscusus$c r0 = r0.f18702M
                android.os.AsyncTask$Status r0 = r0.getStatus()
                android.os.AsyncTask$Status r3 = android.os.AsyncTask.Status.RUNNING
                if (r0 == r3) goto L_0x0075
            L_0x0061:
                mega.boicot.t_buscusus r0 = mega.boicot.t_buscusus.this
                mega.boicot.t_buscusus$c r3 = new mega.boicot.t_buscusus$c
                mega.boicot.t_buscusus r4 = mega.boicot.t_buscusus.this
                r3.<init>()
                r0.f18702M = r3
                mega.boicot.t_buscusus r0 = mega.boicot.t_buscusus.this
                mega.boicot.t_buscusus$c r0 = r0.f18702M
                java.lang.String[] r3 = new java.lang.String[r1]
                r0.execute(r3)
            L_0x0075:
                if (r12 != 0) goto L_0x010d
                android.content.Context r12 = r10.f18753b
                android.app.Activity r12 = (android.app.Activity) r12
                android.view.LayoutInflater r12 = r12.getLayoutInflater()
                int r0 = r10.f18754c
                android.view.View r12 = r12.inflate(r0, r13, r1)
                mega.boicot.t_buscusus$a$a r13 = new mega.boicot.t_buscusus$a$a
                r13.<init>()
                r0 = 2131231618(0x7f080382, float:1.8079322E38)
                android.view.View r0 = r12.findViewById(r0)
                android.widget.TextView r0 = (android.widget.TextView) r0
                r13.f18756a = r0
                r0 = 2131231619(0x7f080383, float:1.8079324E38)
                android.view.View r0 = r12.findViewById(r0)
                android.widget.TextView r0 = (android.widget.TextView) r0
                r13.f18757b = r0
                r0 = 2131231133(0x7f08019d, float:1.8078338E38)
                android.view.View r0 = r12.findViewById(r0)
                android.widget.ImageView r0 = (android.widget.ImageView) r0
                r13.f18758c = r0
                r0 = 2131231301(0x7f080245, float:1.807868E38)
                android.view.View r0 = r12.findViewById(r0)
                android.widget.ProgressBar r0 = (android.widget.ProgressBar) r0
                r13.f18759d = r0
                r0 = 2131231304(0x7f080248, float:1.8078685E38)
                android.view.View r0 = r12.findViewById(r0)
                android.widget.ProgressBar r0 = (android.widget.ProgressBar) r0
                r13.f18760e = r0
                r0 = 2131231232(0x7f080200, float:1.807854E38)
                android.view.View r0 = r12.findViewById(r0)
                android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
                r13.f18761f = r0
                r0 = 2131231191(0x7f0801d7, float:1.8078456E38)
                android.view.View r0 = r12.findViewById(r0)
                android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
                r13.f18762g = r0
                r0 = 2131231190(0x7f0801d6, float:1.8078454E38)
                android.view.View r0 = r12.findViewById(r0)
                android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
                r13.f18763h = r0
                r0 = 2131231176(0x7f0801c8, float:1.8078426E38)
                android.view.View r0 = r12.findViewById(r0)
                android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
                r13.f18764i = r0
                int r0 = android.os.Build.VERSION.SDK_INT
                r3 = 20
                if (r0 <= r3) goto L_0x0109
                android.widget.ProgressBar r0 = r13.f18759d
                mega.boicot.t_buscusus r3 = mega.boicot.t_buscusus.this
                mega.boicot.config r3 = r3.f18729h
                java.lang.String r3 = r3.f17890aW
                mega.boicot.config.m23838a(r0, r3)
                android.widget.ProgressBar r0 = r13.f18760e
                mega.boicot.t_buscusus r3 = mega.boicot.t_buscusus.this
                mega.boicot.config r3 = r3.f18729h
                java.lang.String r3 = r3.f17890aW
                mega.boicot.config.m23838a(r0, r3)
            L_0x0109:
                r12.setTag(r13)
                goto L_0x0113
            L_0x010d:
                java.lang.Object r13 = r12.getTag()
                mega.boicot.t_buscusus$a$a r13 = (mega.boicot.t_buscusus.C5772a.C5773a) r13
            L_0x0113:
                java.util.ArrayList<mega.boicot.t_buscusus$b> r0 = r10.f18755d
                java.lang.Object r11 = r0.get(r11)
                mega.boicot.t_buscusus$b r11 = (mega.boicot.t_buscusus.C5774b) r11
                java.lang.String r0 = r11.f18766a
                java.lang.String r3 = "-1"
                boolean r0 = r0.equals(r3)
                r3 = 8
                if (r0 == 0) goto L_0x016a
                android.widget.TextView r11 = r13.f18756a
                java.lang.String r0 = ""
                r11.setText(r0)
                android.widget.TextView r11 = r13.f18757b
                java.lang.String r0 = ""
                r11.setText(r0)
                android.widget.ImageView r11 = r13.f18758c
                r11.setImageBitmap(r2)
                android.widget.ProgressBar r11 = r13.f18759d
                r11.setVisibility(r3)
                android.widget.ProgressBar r11 = r13.f18760e
                r11.setVisibility(r3)
                mega.boicot.t_buscusus r11 = mega.boicot.t_buscusus.this
                boolean r11 = r11.f18744w
                if (r11 == 0) goto L_0x0150
                android.widget.ProgressBar r11 = r13.f18760e
                r11.setVisibility(r1)
                goto L_0x0155
            L_0x0150:
                android.widget.ProgressBar r11 = r13.f18759d
                r11.setVisibility(r1)
            L_0x0155:
                android.widget.LinearLayout r11 = r13.f18761f
                r11.setVisibility(r3)
                android.widget.LinearLayout r11 = r13.f18762g
                r11.setVisibility(r3)
                android.widget.LinearLayout r11 = r13.f18763h
                r11.setVisibility(r3)
                android.widget.LinearLayout r11 = r13.f18764i
                r11.setVisibility(r3)
                return r12
            L_0x016a:
                mega.boicot.t_buscusus r0 = mega.boicot.t_buscusus.this
                int r0 = r0.f18728g
                if (r0 != 0) goto L_0x0185
                android.widget.LinearLayout r0 = r13.f18761f
                mega.boicot.t_buscusus r4 = mega.boicot.t_buscusus.this
                int r4 = r4.f18691B
                mega.boicot.t_buscusus r5 = mega.boicot.t_buscusus.this
                int r5 = r5.f18692C
                mega.boicot.t_buscusus r6 = mega.boicot.t_buscusus.this
                int r6 = r6.f18691B
                mega.boicot.t_buscusus r7 = mega.boicot.t_buscusus.this
                int r7 = r7.f18692C
                r0.setPadding(r4, r5, r6, r7)
            L_0x0185:
                android.widget.LinearLayout r0 = r13.f18761f
                r0.setVisibility(r1)
                boolean r0 = r11.f18779n
                if (r0 == 0) goto L_0x0199
                android.widget.LinearLayout r0 = r13.f18763h
                r0.setVisibility(r3)
                android.widget.LinearLayout r0 = r13.f18762g
                r0.setVisibility(r1)
                goto L_0x01a3
            L_0x0199:
                android.widget.LinearLayout r0 = r13.f18762g
                r0.setVisibility(r3)
                android.widget.LinearLayout r0 = r13.f18763h
                r0.setVisibility(r3)
            L_0x01a3:
                boolean r0 = r11.f18780o
                if (r0 == 0) goto L_0x01ad
                android.widget.LinearLayout r0 = r13.f18764i
                r0.setVisibility(r1)
                goto L_0x01b2
            L_0x01ad:
                android.widget.LinearLayout r0 = r13.f18764i
                r0.setVisibility(r3)
            L_0x01b2:
                android.widget.TextView r0 = r13.f18756a
                java.lang.String r4 = r11.f18767b
                r0.setText(r4)
                mega.boicot.t_buscusus r0 = mega.boicot.t_buscusus.this
                int r0 = r0.f18724c
                r4 = 1
                if (r0 > 0) goto L_0x01c6
                mega.boicot.t_buscusus r0 = mega.boicot.t_buscusus.this
                int r0 = r0.f18727f
                if (r0 != r4) goto L_0x0287
            L_0x01c6:
                java.lang.String r0 = ""
                mega.boicot.t_buscusus r5 = mega.boicot.t_buscusus.this
                int r5 = r5.f18724c
                if (r5 <= 0) goto L_0x01f3
                int r5 = r11.f18776k
                if (r5 <= 0) goto L_0x01f3
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                r5.append(r0)
                int r0 = r11.f18776k
                r5.append(r0)
                mega.boicot.t_buscusus r0 = mega.boicot.t_buscusus.this
                android.content.res.Resources r0 = r0.getResources()
                r6 = 2131558448(0x7f0d0030, float:1.8742212E38)
                java.lang.String r0 = r0.getString(r6)
                r5.append(r0)
                java.lang.String r0 = r5.toString()
            L_0x01f3:
                mega.boicot.t_buscusus r5 = mega.boicot.t_buscusus.this
                int r5 = r5.f18727f
                if (r5 != r4) goto L_0x027d
                java.lang.String r5 = r11.f18775j
                java.lang.String r6 = ""
                boolean r5 = r5.equals(r6)
                if (r5 != 0) goto L_0x027d
                java.lang.String r5 = ""
                boolean r5 = r0.equals(r5)
                if (r5 != 0) goto L_0x021c
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                r5.append(r0)
                java.lang.String r0 = ", "
                r5.append(r0)
                java.lang.String r0 = r5.toString()
            L_0x021c:
                java.lang.String r5 = "km."
                java.lang.String r6 = r11.f18775j
                int r6 = java.lang.Integer.parseInt(r6)
                int r6 = r6 / 1000
                mega.boicot.t_buscusus r7 = mega.boicot.t_buscusus.this
                java.lang.String r7 = r7.f18695F
                java.lang.String r8 = "US"
                boolean r7 = r7.equals(r8)
                if (r7 != 0) goto L_0x024a
                mega.boicot.t_buscusus r7 = mega.boicot.t_buscusus.this
                java.lang.String r7 = r7.f18695F
                java.lang.String r8 = "GB"
                boolean r7 = r7.equals(r8)
                if (r7 != 0) goto L_0x024a
                mega.boicot.t_buscusus r7 = mega.boicot.t_buscusus.this
                java.lang.String r7 = r7.f18695F
                java.lang.String r8 = "MM"
                boolean r7 = r7.equals(r8)
                if (r7 == 0) goto L_0x0254
            L_0x024a:
                java.lang.String r5 = "mi."
                double r6 = (double) r6
                r8 = 4609884578576439706(0x3ff999999999999a, double:1.6)
                double r6 = r6 / r8
                int r6 = (int) r6
            L_0x0254:
                if (r6 != 0) goto L_0x026b
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                r6.append(r0)
                java.lang.String r0 = "<1"
                r6.append(r0)
                r6.append(r5)
                java.lang.String r0 = r6.toString()
                goto L_0x027d
            L_0x026b:
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                r7.append(r0)
                r7.append(r6)
                r7.append(r5)
                java.lang.String r0 = r7.toString()
            L_0x027d:
                android.widget.TextView r5 = r13.f18757b
                r5.setText(r0)
                android.widget.TextView r0 = r13.f18757b
                r0.setVisibility(r1)
            L_0x0287:
                android.widget.ProgressBar r0 = r13.f18759d
                r0.setVisibility(r3)
                android.widget.ProgressBar r0 = r13.f18760e
                r0.setVisibility(r3)
                mega.boicot.t_buscusus r0 = mega.boicot.t_buscusus.this
                int r0 = r0.f18728g
                if (r0 <= 0) goto L_0x034d
                boolean r0 = r11.f18778m
                if (r0 != 0) goto L_0x02d0
                boolean r0 = r11.f18777l
                if (r0 == 0) goto L_0x02cf
                java.lang.String r0 = r11.f18768c
                java.lang.String r3 = "0"
                boolean r0 = r0.equals(r3)
                if (r0 != 0) goto L_0x02cf
                java.lang.String r0 = r11.f18768c
                mega.boicot.t_buscusus r3 = mega.boicot.t_buscusus.this
                android.content.SharedPreferences r3 = r3.f18722af
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r6 = "fperfil_"
                r5.append(r6)
                java.lang.String r6 = r11.f18766a
                r5.append(r6)
                java.lang.String r5 = r5.toString()
                java.lang.String r6 = "0"
                java.lang.String r3 = r3.getString(r5, r6)
                boolean r0 = r0.equals(r3)
                if (r0 != 0) goto L_0x02cf
                goto L_0x02d0
            L_0x02cf:
                r4 = r1
            L_0x02d0:
                if (r4 == 0) goto L_0x02e9
                android.widget.ImageView r11 = r13.f18758c
                r11.setImageBitmap(r2)
                mega.boicot.t_buscusus r11 = mega.boicot.t_buscusus.this
                boolean r11 = r11.f18744w
                if (r11 == 0) goto L_0x02e3
                android.widget.ProgressBar r11 = r13.f18760e
                r11.setVisibility(r1)
                goto L_0x0352
            L_0x02e3:
                android.widget.ProgressBar r11 = r13.f18759d
                r11.setVisibility(r1)
                goto L_0x0352
            L_0x02e9:
                mega.boicot.t_buscusus r0 = mega.boicot.t_buscusus.this
                mega.boicot.config r0 = r0.f18729h
                mega.boicot.i[] r0 = r0.f17971bz
                mega.boicot.t_buscusus r1 = mega.boicot.t_buscusus.this
                int r1 = r1.f18723b
                r0 = r0[r1]
                int r0 = r0.f18305aw
                if (r0 <= 0) goto L_0x0343
                java.lang.String r0 = r11.f18768c
                java.lang.String r1 = "0"
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L_0x0343
                java.io.File r0 = new java.io.File     // Catch:{ Exception -> 0x033e }
                mega.boicot.t_buscusus r1 = mega.boicot.t_buscusus.this     // Catch:{ Exception -> 0x033e }
                java.io.File r1 = r1.f18704O     // Catch:{ Exception -> 0x033e }
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x033e }
                r2.<init>()     // Catch:{ Exception -> 0x033e }
                java.lang.String r3 = "fperfil_"
                r2.append(r3)     // Catch:{ Exception -> 0x033e }
                java.lang.String r11 = r11.f18766a     // Catch:{ Exception -> 0x033e }
                r2.append(r11)     // Catch:{ Exception -> 0x033e }
                java.lang.String r11 = ".jpg"
                r2.append(r11)     // Catch:{ Exception -> 0x033e }
                java.lang.String r11 = r2.toString()     // Catch:{ Exception -> 0x033e }
                r0.<init>(r1, r11)     // Catch:{ Exception -> 0x033e }
                boolean r11 = r0.exists()     // Catch:{ Exception -> 0x033e }
                if (r11 == 0) goto L_0x0339
                mega.boicot.t_buscusus r11 = mega.boicot.t_buscusus.this     // Catch:{ Exception -> 0x033e }
                android.content.ContentResolver r11 = r11.getContentResolver()     // Catch:{ Exception -> 0x033e }
                android.net.Uri r0 = android.net.Uri.fromFile(r0)     // Catch:{ Exception -> 0x033e }
                android.graphics.Bitmap r11 = android.provider.MediaStore.Images.Media.getBitmap(r11, r0)     // Catch:{ Exception -> 0x033e }
                goto L_0x0347
            L_0x0339:
                mega.boicot.t_buscusus r11 = mega.boicot.t_buscusus.this     // Catch:{ Exception -> 0x033e }
                android.graphics.Bitmap r11 = r11.f18697H     // Catch:{ Exception -> 0x033e }
                goto L_0x0347
            L_0x033e:
                mega.boicot.t_buscusus r11 = mega.boicot.t_buscusus.this
                android.graphics.Bitmap r11 = r11.f18697H
                goto L_0x0347
            L_0x0343:
                mega.boicot.t_buscusus r11 = mega.boicot.t_buscusus.this
                android.graphics.Bitmap r11 = r11.f18697H
            L_0x0347:
                android.widget.ImageView r13 = r13.f18758c
                r13.setImageBitmap(r11)
                goto L_0x0352
            L_0x034d:
                android.widget.ImageView r11 = r13.f18758c
                r11.setVisibility(r3)
            L_0x0352:
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: mega.boicot.t_buscusus.C5772a.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
        }
    }

    /* renamed from: mega.boicot.t_buscusus$b */
    private class C5774b {

        /* renamed from: a */
        String f18766a;

        /* renamed from: b */
        String f18767b;

        /* renamed from: c */
        String f18768c;

        /* renamed from: d */
        String f18769d;

        /* renamed from: e */
        String f18770e;

        /* renamed from: f */
        String f18771f;

        /* renamed from: g */
        String f18772g;

        /* renamed from: h */
        String f18773h;

        /* renamed from: i */
        String f18774i;

        /* renamed from: j */
        String f18775j;

        /* renamed from: k */
        int f18776k;

        /* renamed from: l */
        boolean f18777l;

        /* renamed from: m */
        boolean f18778m;

        /* renamed from: n */
        boolean f18779n;

        /* renamed from: o */
        boolean f18780o;

        private C5774b() {
            this.f18777l = true;
            this.f18778m = false;
            this.f18779n = false;
            this.f18780o = false;
        }
    }

    /* renamed from: mega.boicot.t_buscusus$c */
    private class C5775c extends AsyncTask<String, Void, String> {

        /* renamed from: a */
        String f18782a;

        /* renamed from: b */
        String f18783b;

        /* renamed from: c */
        Bitmap f18784c;

        /* renamed from: d */
        int f18785d;

        private C5775c() {
            this.f18785d = -1;
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
            int firstVisiblePosition = t_buscusus.this.f18699J.getFirstVisiblePosition();
            while (firstVisiblePosition <= Math.max(t_buscusus.this.f18699J.getLastVisiblePosition(), 30) && t_buscusus.this.f18698I != null && firstVisiblePosition < t_buscusus.this.f18698I.size()) {
                if (((C5774b) t_buscusus.this.f18698I.get(firstVisiblePosition)).f18777l && !((C5774b) t_buscusus.this.f18698I.get(firstVisiblePosition)).f18768c.equals("0")) {
                    String str = ((C5774b) t_buscusus.this.f18698I.get(firstVisiblePosition)).f18768c;
                    SharedPreferences sharedPreferences = t_buscusus.this.f18722af;
                    StringBuilder sb = new StringBuilder();
                    sb.append("fperfil_");
                    sb.append(((C5774b) t_buscusus.this.f18698I.get(firstVisiblePosition)).f18766a);
                    if (!str.equals(sharedPreferences.getString(sb.toString(), "0"))) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(((C5774b) t_buscusus.this.f18698I.get(firstVisiblePosition)).f18766a);
                        sb2.append("");
                        this.f18782a = sb2.toString();
                        this.f18783b = ((C5774b) t_buscusus.this.f18698I.get(firstVisiblePosition)).f18768c;
                        ((C5774b) t_buscusus.this.f18698I.get(firstVisiblePosition)).f18778m = true;
                        ((C5774b) t_buscusus.this.f18698I.get(firstVisiblePosition)).f18777l = false;
                        this.f18785d = firstVisiblePosition;
                        return;
                    }
                }
                firstVisiblePosition++;
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public String doInBackground(String... strArr) {
            if (this.f18782a == null) {
                return "-1";
            }
            try {
                StringBuilder sb = new StringBuilder();
                sb.append("http://imgs1.e-droid.net/srv/imgs/usus/");
                sb.append(this.f18782a);
                sb.append("_1_p.jpg?v=");
                sb.append(this.f18783b);
                try {
                    HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(sb.toString()).openConnection();
                    httpURLConnection.setDoInput(true);
                    httpURLConnection.setConnectTimeout(10000);
                    httpURLConnection.setReadTimeout(20000);
                    httpURLConnection.connect();
                    InputStream inputStream = httpURLConnection.getInputStream();
                    this.f18784c = BitmapFactory.decodeStream(inputStream);
                    inputStream.close();
                    httpURLConnection.disconnect();
                    File file = t_buscusus.this.f18704O;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("fperfil_");
                    sb2.append(this.f18782a);
                    sb2.append(".jpg");
                    try {
                        this.f18784c.compress(CompressFormat.JPEG, 70, new FileOutputStream(new File(file, sb2.toString())));
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
            if (!(this.f18785d == -1 || t_buscusus.this.f18698I == null)) {
                try {
                    ((C5774b) t_buscusus.this.f18698I.get(this.f18785d)).f18778m = false;
                } catch (Exception e) {
                    e.printStackTrace();
                    return;
                }
            }
            if (this.f18782a == null || str.equals("-1")) {
                if (!str.equals("-1")) {
                    t_buscusus.this.f18700K.notifyDataSetChanged();
                }
                return;
            }
            if (str == "1") {
                Editor edit = t_buscusus.this.f18722af.edit();
                StringBuilder sb = new StringBuilder();
                sb.append("fperfil_");
                sb.append(this.f18782a);
                edit.putString(sb.toString(), this.f18783b);
                edit.commit();
            }
            t_buscusus.this.f18700K.notifyDataSetChanged();
            new C5775c().execute(new String[0]);
        }
    }

    /* renamed from: mega.boicot.t_buscusus$d */
    private class C5776d extends AsyncTask<String, Void, String> {

        /* renamed from: a */
        int f18787a;

        C5776d(int i) {
            this.f18787a = i;
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
            if (t_buscusus.this.f18698I.isEmpty() || !((C5774b) t_buscusus.this.f18698I.get(t_buscusus.this.f18698I.size() - 1)).f18766a.equals("-1")) {
                C5774b bVar = new C5774b();
                bVar.f18766a = "-1";
                bVar.f18768c = "0";
                t_buscusus.this.f18698I.add(bVar);
                t_buscusus.this.f18700K.notifyDataSetChanged();
            }
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x013d  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.String doInBackground(java.lang.String... r6) {
            /*
                r5 = this;
                java.lang.String r6 = "km"
                mega.boicot.t_buscusus r0 = mega.boicot.t_buscusus.this
                java.lang.String r0 = r0.f18695F
                java.lang.String r1 = "US"
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L_0x0026
                mega.boicot.t_buscusus r0 = mega.boicot.t_buscusus.this
                java.lang.String r0 = r0.f18695F
                java.lang.String r1 = "GB"
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L_0x0026
                mega.boicot.t_buscusus r0 = mega.boicot.t_buscusus.this
                java.lang.String r0 = r0.f18695F
                java.lang.String r1 = "MM"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L_0x0028
            L_0x0026:
                java.lang.String r6 = "mi"
            L_0x0028:
                r0 = 0
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0139 }
                r1.<init>()     // Catch:{ Exception -> 0x0139 }
                java.lang.String r2 = "http://"
                r1.append(r2)     // Catch:{ Exception -> 0x0139 }
                java.lang.String r2 = mega.boicot.config.f17839g     // Catch:{ Exception -> 0x0139 }
                r1.append(r2)     // Catch:{ Exception -> 0x0139 }
                java.lang.String r2 = "/srv/obtener_usus.php?idusu="
                r1.append(r2)     // Catch:{ Exception -> 0x0139 }
                mega.boicot.t_buscusus r2 = mega.boicot.t_buscusus.this     // Catch:{ Exception -> 0x0139 }
                int r2 = r2.f18716a     // Catch:{ Exception -> 0x0139 }
                r1.append(r2)     // Catch:{ Exception -> 0x0139 }
                java.lang.String r2 = "&c="
                r1.append(r2)     // Catch:{ Exception -> 0x0139 }
                mega.boicot.t_buscusus r2 = mega.boicot.t_buscusus.this     // Catch:{ Exception -> 0x0139 }
                java.lang.String r2 = r2.f18694E     // Catch:{ Exception -> 0x0139 }
                r1.append(r2)     // Catch:{ Exception -> 0x0139 }
                java.lang.String r2 = "&ind_ini="
                r1.append(r2)     // Catch:{ Exception -> 0x0139 }
                int r2 = r5.f18787a     // Catch:{ Exception -> 0x0139 }
                r1.append(r2)     // Catch:{ Exception -> 0x0139 }
                java.lang.String r2 = "&accext="
                r1.append(r2)     // Catch:{ Exception -> 0x0139 }
                mega.boicot.t_buscusus r2 = mega.boicot.t_buscusus.this     // Catch:{ Exception -> 0x0139 }
                mega.boicot.config r2 = r2.f18729h     // Catch:{ Exception -> 0x0139 }
                mega.boicot.i[] r2 = r2.f17971bz     // Catch:{ Exception -> 0x0139 }
                mega.boicot.t_buscusus r3 = mega.boicot.t_buscusus.this     // Catch:{ Exception -> 0x0139 }
                int r3 = r3.f18723b     // Catch:{ Exception -> 0x0139 }
                r2 = r2[r3]     // Catch:{ Exception -> 0x0139 }
                boolean r2 = r2.f18247R     // Catch:{ Exception -> 0x0139 }
                r1.append(r2)     // Catch:{ Exception -> 0x0139 }
                java.lang.String r2 = "&idsec="
                r1.append(r2)     // Catch:{ Exception -> 0x0139 }
                mega.boicot.t_buscusus r2 = mega.boicot.t_buscusus.this     // Catch:{ Exception -> 0x0139 }
                mega.boicot.config r2 = r2.f18729h     // Catch:{ Exception -> 0x0139 }
                mega.boicot.i[] r2 = r2.f17971bz     // Catch:{ Exception -> 0x0139 }
                mega.boicot.t_buscusus r3 = mega.boicot.t_buscusus.this     // Catch:{ Exception -> 0x0139 }
                int r3 = r3.f18723b     // Catch:{ Exception -> 0x0139 }
                r2 = r2[r3]     // Catch:{ Exception -> 0x0139 }
                int r2 = r2.f18330w     // Catch:{ Exception -> 0x0139 }
                r1.append(r2)     // Catch:{ Exception -> 0x0139 }
                java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x0139 }
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0139 }
                r2.<init>()     // Catch:{ Exception -> 0x0139 }
                r2.append(r1)     // Catch:{ Exception -> 0x0139 }
                java.lang.String r1 = "&fdist_v="
                r2.append(r1)     // Catch:{ Exception -> 0x0139 }
                mega.boicot.t_buscusus r1 = mega.boicot.t_buscusus.this     // Catch:{ Exception -> 0x0139 }
                int r1 = r1.f18746y     // Catch:{ Exception -> 0x0139 }
                r2.append(r1)     // Catch:{ Exception -> 0x0139 }
                java.lang.String r1 = "&fdist_u="
                r2.append(r1)     // Catch:{ Exception -> 0x0139 }
                r2.append(r6)     // Catch:{ Exception -> 0x0139 }
                java.lang.String r6 = "&fsexo_v="
                r2.append(r6)     // Catch:{ Exception -> 0x0139 }
                mega.boicot.t_buscusus r6 = mega.boicot.t_buscusus.this     // Catch:{ Exception -> 0x0139 }
                int r6 = r6.f18745x     // Catch:{ Exception -> 0x0139 }
                r2.append(r6)     // Catch:{ Exception -> 0x0139 }
                java.lang.String r6 = "&fedad1_v="
                r2.append(r6)     // Catch:{ Exception -> 0x0139 }
                mega.boicot.t_buscusus r6 = mega.boicot.t_buscusus.this     // Catch:{ Exception -> 0x0139 }
                int r6 = r6.f18747z     // Catch:{ Exception -> 0x0139 }
                r2.append(r6)     // Catch:{ Exception -> 0x0139 }
                java.lang.String r6 = "&fedad2_v="
                r2.append(r6)     // Catch:{ Exception -> 0x0139 }
                mega.boicot.t_buscusus r6 = mega.boicot.t_buscusus.this     // Catch:{ Exception -> 0x0139 }
                int r6 = r6.f18690A     // Catch:{ Exception -> 0x0139 }
                r2.append(r6)     // Catch:{ Exception -> 0x0139 }
                java.lang.String r6 = "&fnick_v="
                r2.append(r6)     // Catch:{ Exception -> 0x0139 }
                mega.boicot.t_buscusus r6 = mega.boicot.t_buscusus.this     // Catch:{ Exception -> 0x0139 }
                java.lang.String r6 = r6.f18693D     // Catch:{ Exception -> 0x0139 }
                r2.append(r6)     // Catch:{ Exception -> 0x0139 }
                java.lang.String r6 = r2.toString()     // Catch:{ Exception -> 0x0139 }
                java.net.URL r1 = new java.net.URL     // Catch:{ Exception -> 0x0139 }
                r1.<init>(r6)     // Catch:{ Exception -> 0x0139 }
                java.net.URLConnection r6 = r1.openConnection()     // Catch:{ Exception -> 0x0139 }
                java.net.HttpURLConnection r6 = (java.net.HttpURLConnection) r6     // Catch:{ Exception -> 0x0139 }
                r0 = 1
                r6.setDoInput(r0)     // Catch:{ Exception -> 0x0135, all -> 0x0130 }
                r0 = 10000(0x2710, float:1.4013E-41)
                r6.setConnectTimeout(r0)     // Catch:{ Exception -> 0x0135, all -> 0x0130 }
                r6.setReadTimeout(r0)     // Catch:{ Exception -> 0x0135, all -> 0x0130 }
                java.lang.String r0 = "User-Agent"
                java.lang.String r1 = "Android Vinebre Software"
                r6.setRequestProperty(r0, r1)     // Catch:{ Exception -> 0x0135, all -> 0x0130 }
                java.io.InputStream r0 = r6.getInputStream()     // Catch:{ Exception -> 0x0135, all -> 0x0130 }
                java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch:{ Exception -> 0x0135, all -> 0x0130 }
                java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x0135, all -> 0x0130 }
                r2.<init>(r0)     // Catch:{ Exception -> 0x0135, all -> 0x0130 }
                r1.<init>(r2)     // Catch:{ Exception -> 0x0135, all -> 0x0130 }
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0135, all -> 0x0130 }
                r0.<init>()     // Catch:{ Exception -> 0x0135, all -> 0x0130 }
            L_0x010b:
                java.lang.String r2 = r1.readLine()     // Catch:{ Exception -> 0x0135, all -> 0x0130 }
                if (r2 == 0) goto L_0x0126
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0135, all -> 0x0130 }
                r3.<init>()     // Catch:{ Exception -> 0x0135, all -> 0x0130 }
                r3.append(r2)     // Catch:{ Exception -> 0x0135, all -> 0x0130 }
                java.lang.String r2 = "\n"
                r3.append(r2)     // Catch:{ Exception -> 0x0135, all -> 0x0130 }
                java.lang.String r2 = r3.toString()     // Catch:{ Exception -> 0x0135, all -> 0x0130 }
                r0.append(r2)     // Catch:{ Exception -> 0x0135, all -> 0x0130 }
                goto L_0x010b
            L_0x0126:
                java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0135, all -> 0x0130 }
                if (r6 == 0) goto L_0x012f
                r6.disconnect()
            L_0x012f:
                return r0
            L_0x0130:
                r0 = move-exception
                r4 = r0
                r0 = r6
                r6 = r4
                goto L_0x0141
            L_0x0135:
                r0 = r6
                goto L_0x0139
            L_0x0137:
                r6 = move-exception
                goto L_0x0141
            L_0x0139:
                java.lang.String r6 = ""
                if (r0 == 0) goto L_0x0140
                r0.disconnect()
            L_0x0140:
                return r6
            L_0x0141:
                if (r0 == 0) goto L_0x0146
                r0.disconnect()
            L_0x0146:
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: mega.boicot.t_buscusus.C5776d.doInBackground(java.lang.String[]):java.lang.String");
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void onPostExecute(String str) {
            int i;
            if (t_buscusus.this.f18698I != null && ((C5774b) t_buscusus.this.f18698I.get(t_buscusus.this.f18698I.size() - 1)).f18766a.equals("-1")) {
                t_buscusus.this.f18698I.remove(t_buscusus.this.f18698I.size() - 1);
                t_buscusus.this.f18700K.notifyDataSetChanged();
            }
            if (str.contains("ANDROID:OK DATOS:")) {
                String[] split = str.substring(str.indexOf("DATOS:") + 6).split(";");
                Editor edit = t_buscusus.this.f18722af.edit();
                int i2 = 0;
                while (!split[i2].equals("S") && !split[i2].equals("N")) {
                    String[] split2 = split[i2].split("@");
                    C5774b bVar = new C5774b();
                    bVar.f18766a = split2[0];
                    bVar.f18767b = split2[1];
                    bVar.f18768c = split2[2];
                    bVar.f18769d = split2[3];
                    bVar.f18771f = split2[4];
                    bVar.f18772g = split2[5];
                    bVar.f18773h = split2[6];
                    if (bVar.f18771f.equals("0") || bVar.f18772g.equals("0") || bVar.f18773h.equals("0")) {
                        i = 0;
                    } else {
                        Calendar instance = Calendar.getInstance();
                        instance.set(Integer.parseInt(bVar.f18773h), Integer.parseInt(bVar.f18772g) - 1, Integer.parseInt(bVar.f18771f));
                        Calendar instance2 = Calendar.getInstance();
                        int i3 = instance2.get(1) - instance.get(1);
                        i = (instance.get(2) > instance2.get(2) || (instance.get(2) == instance2.get(2) && instance.get(5) > instance2.get(5))) ? i3 - 1 : i3;
                    }
                    bVar.f18776k = i;
                    bVar.f18774i = split2[7];
                    bVar.f18770e = split2[8];
                    bVar.f18775j = split2[9].equals("-1") ? "" : split2[9];
                    bVar.f18779n = split2[10].equals("1");
                    if (bVar.f18779n) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("usufav_");
                        sb.append(bVar.f18766a);
                        edit.putBoolean(sb.toString(), true);
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("usufav_");
                        sb2.append(bVar.f18766a);
                        edit.remove(sb2.toString());
                    }
                    bVar.f18780o = split2[11].equals("1");
                    t_buscusus.this.f18698I.add(bVar);
                    i2++;
                }
                edit.commit();
                if (split[i2].equals("N")) {
                    t_buscusus.this.f18734m = true;
                }
                t_buscusus.this.f18700K.notifyDataSetChanged();
                if (i2 > 0 && (t_buscusus.this.f18702M == null || t_buscusus.this.f18702M.getStatus() != Status.RUNNING)) {
                    t_buscusus.this.f18702M = new C5775c();
                    t_buscusus.this.f18702M.execute(new String[0]);
                    t_buscusus.this.f18738q = true;
                }
                if (t_buscusus.this.f18698I.isEmpty()) {
                    final AlertDialog create = new Builder(t_buscusus.this).setPositiveButton(R.string.aceptar, null).setMessage(R.string.sin_usus).create();
                    if (!t_buscusus.this.f18696G.equals("")) {
                        create.setOnShowListener(new OnShowListener() {
                            public void onShow(DialogInterface dialogInterface) {
                                Button button = create.getButton(-1);
                                StringBuilder sb = new StringBuilder();
                                sb.append("#");
                                sb.append(t_buscusus.this.f18696G);
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
        this.f18729h = (config) getApplicationContext();
        if (this.f18729h.f17881aN == null) {
            this.f18729h.mo20780b();
        }
        String str = this.f18729h.f17971bz[this.f18729h.f18075l].f18314g;
        String str2 = this.f18729h.f17971bz[this.f18729h.f18075l].f18315h;
        StringBuilder sb = new StringBuilder();
        sb.append("#");
        sb.append(str);
        this.f18744w = config.m23844a(sb.toString());
        this.f18696G = config.m23831a(str, this.f18729h.f17890aW);
        if (VERSION.SDK_INT > 12 && !this.f18744w) {
            setTheme(R.style.holonolight);
        }
        this.f18720ad = getIntent().getExtras();
        if (bundle == null) {
            this.f18733l = this.f18720ad != null && this.f18720ad.containsKey("es_root") && this.f18720ad.getBoolean("es_root", false);
        } else {
            this.f18733l = bundle.containsKey("es_root") && bundle.getBoolean("es_root", false);
        }
        this.f18723b = this.f18729h.f18075l;
        this.f18704O = new File(Environment.getExternalStorageDirectory(), getPackageName());
        super.onCreate(bundle);
        this.f18722af = getSharedPreferences("sh", 0);
        this.f18716a = this.f18722af.getInt("idusu", 0);
        this.f18694E = this.f18722af.getString("cod", "");
        float f = getResources().getDisplayMetrics().density;
        this.f18691B = (int) ((5.0f * f) + 0.5f);
        this.f18692C = (int) ((15.0f * f) + 0.5f);
        this.f18695F = Locale.getDefault().getCountry();
        this.f18724c = this.f18729h.f17971bz[this.f18723b].f18306ax;
        this.f18725d = this.f18729h.f17971bz[this.f18723b].f18307ay;
        this.f18726e = this.f18729h.f17971bz[this.f18723b].f18308az;
        this.f18727f = this.f18729h.f17971bz[this.f18723b].f18257aA;
        this.f18735n = this.f18729h.f17971bz[this.f18723b].f18245P;
        this.f18736o = this.f18729h.f17971bz[this.f18723b].f18246Q;
        this.f18737p = this.f18729h.f17971bz[this.f18723b].f18244O;
        this.f18728g = this.f18729h.f17971bz[this.f18723b].f18305aw;
        this.f18739r = this.f18729h.f17971bz[this.f18723b].f18249T;
        this.f18740s = this.f18729h.f17971bz[this.f18723b].f18250U;
        this.f18741t = this.f18729h.f17971bz[this.f18723b].f18248S;
        this.f18742u = this.f18729h.f17971bz[this.f18723b].f18251V;
        this.f18743v = this.f18729h.f17971bz[this.f18723b].f18252W;
        this.f18745x = this.f18729h.f17971bz[this.f18723b].f18254Y;
        this.f18693D = "";
        this.f18746y = this.f18729h.f17971bz[this.f18723b].f18253X;
        this.f18747z = this.f18729h.f17971bz[this.f18723b].f18255Z;
        this.f18690A = this.f18729h.f17971bz[this.f18723b].f18283aa;
        if (this.f18741t) {
            SharedPreferences sharedPreferences = this.f18722af;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("fdist_v_");
            sb2.append(this.f18729h.f17971bz[this.f18723b].f18330w);
            this.f18746y = sharedPreferences.getInt(sb2.toString(), this.f18746y);
        }
        if (this.f18739r) {
            SharedPreferences sharedPreferences2 = this.f18722af;
            StringBuilder sb3 = new StringBuilder();
            sb3.append("fsexo_v_");
            sb3.append(this.f18729h.f17971bz[this.f18723b].f18330w);
            this.f18745x = sharedPreferences2.getInt(sb3.toString(), this.f18745x);
        }
        if (this.f18742u) {
            SharedPreferences sharedPreferences3 = this.f18722af;
            StringBuilder sb4 = new StringBuilder();
            sb4.append("fedad1_v_");
            sb4.append(this.f18729h.f17971bz[this.f18723b].f18330w);
            this.f18747z = sharedPreferences3.getInt(sb4.toString(), this.f18747z);
        }
        if (this.f18743v) {
            SharedPreferences sharedPreferences4 = this.f18722af;
            StringBuilder sb5 = new StringBuilder();
            sb5.append("fedad2_v_");
            sb5.append(this.f18729h.f17971bz[this.f18723b].f18330w);
            this.f18690A = sharedPreferences4.getInt(sb5.toString(), this.f18690A);
        }
        if (this.f18722af.getString("nick", "").equals("") || (this.f18729h.f18062ed == 3 && !this.f18722af.getBoolean("email_confirmado", false))) {
            Intent intent = new Intent(this, chat_perfil.class);
            intent.putExtra("idsecc", this.f18723b);
            intent.putExtra("desde_buscusus", true);
            if (this.f18733l) {
                intent.putExtra("es_root", this.f18733l);
            }
            this.f18733l = false;
            this.f18731j = true;
            startActivityForResult(intent, 0);
        } else if ((this.f18728g == 2 && !this.f18729h.mo20757a((Context) this, 1).exists()) || ((this.f18724c == 2 && (this.f18722af.getInt("fnac_d", 0) == 0 || this.f18722af.getInt("fnac_m", 0) == 0 || this.f18722af.getInt("fnac_a", 0) == 0)) || ((this.f18725d == 2 && this.f18722af.getInt("sexo", 0) == 0) || (this.f18726e == 2 && this.f18722af.getString("descr", "").equals(""))))) {
            Intent intent2 = new Intent(this, preperfil.class);
            intent2.putExtra("idsecc", this.f18723b);
            intent2.putExtra("desde_buscusus", true);
            if (this.f18733l) {
                intent2.putExtra("es_root", this.f18733l);
            }
            this.f18733l = false;
            this.f18731j = true;
            startActivityForResult(intent2, 0);
        }
        setContentView(R.layout.t_buscusus);
        mo21070f();
        if (this.f18729h.f18080q > 0) {
            SearchManager searchManager = (SearchManager) getSystemService("search");
            searchManager.setOnCancelListener(new OnCancelListener() {
                public void onCancel() {
                    t_buscusus.this.f18730i = false;
                    t_buscusus.this.setResult(0);
                }
            });
            searchManager.setOnDismissListener(new OnDismissListener() {
                public void onDismiss() {
                    t_buscusus.this.f18717aa = false;
                }
            });
        }
        this.f18729h.mo20770a((Context) this, this.f18720ad != null && this.f18720ad.containsKey("ad_entrar"), this.f18720ad != null && this.f18720ad.containsKey("fb_entrar"));
        this.f18710U = this.f18729h.mo20760a((Context) this, false);
        this.f18729h.mo20767a((Context) this, this.f18729h.f18075l, this.f18696G, bundle);
        if (!str.equals("")) {
            Orientation orientation = Orientation.TOP_BOTTOM;
            StringBuilder sb6 = new StringBuilder();
            sb6.append("#");
            sb6.append(str);
            StringBuilder sb7 = new StringBuilder();
            sb7.append("#");
            sb7.append(str2);
            findViewById(R.id.ll_princ).setBackgroundDrawable(new GradientDrawable(orientation, new int[]{Color.parseColor(sb6.toString()), Color.parseColor(sb7.toString())}));
        }
        if (this.f18744w) {
            this.f18697H = BitmapFactory.decodeResource(getResources(), R.drawable.sinfoto_light);
        } else {
            this.f18697H = BitmapFactory.decodeResource(getResources(), R.drawable.sinfoto);
        }
        findViewById(R.id.btnperfil).setOnClickListener(this);
        this.f18705P = (TextView) findViewById(R.id.tv_fsexo);
        this.f18706Q = (TextView) findViewById(R.id.tv_fnick);
        this.f18707R = (TextView) findViewById(R.id.tv_fdist);
        this.f18708S = (TextView) findViewById(R.id.tv_fedad1);
        this.f18709T = (TextView) findViewById(R.id.tv_fedad2);
        mo21072h();
        this.f18698I = new ArrayList<>();
        this.f18734m = false;
        this.f18699J = (GridView) findViewById(R.id.grid);
        this.f18700K = new C5772a(this, R.layout.t_buscusus_row, this.f18698I);
        this.f18699J.setAdapter(this.f18700K);
        this.f18699J.setOnItemClickListener(this);
        this.f18703N = mo21071g();
        this.f18738q = false;
        this.f18701L = new C5776d(0);
        this.f18701L.execute(new String[0]);
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        boolean z;
        if (i2 != -1 || intent == null || !intent.hasExtra("finalizar") || !intent.getExtras().getBoolean("finalizar")) {
            z = false;
        } else {
            z = true;
            if (!intent.getExtras().getBoolean("finalizar_app")) {
                this.f18733l = false;
            }
            setResult(-1, intent);
            finish();
        }
        if (!z && this.f18731j) {
            finish();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public void mo21070f() {
        int b = this.f18729h.mo20778b((Context) this);
        if (this.f18729h.f18045dm == 1) {
            this.f18721ae = (ListView) findViewById(R.id.left_drawer);
            this.f18729h.mo20771a(this.f18721ae);
        } else if (this.f18729h.f18045dm == 0) {
            int i = 0;
            for (int i2 = 0; i2 < this.f18729h.f17971bz.length; i2++) {
                if (!this.f18729h.f17971bz[i2].f18333z) {
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
        for (int i3 = 0; i3 < this.f18729h.f17923bD.length; i3++) {
            if (this.f18729h.f17923bD[i3] > 0) {
                findViewById(this.f18729h.f17923bD[i3]).setOnClickListener(this);
            }
        }
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        C5774b bVar = (C5774b) this.f18698I.get(i);
        if (!bVar.f18766a.equals("-1")) {
            Intent intent = new Intent(this, profile.class);
            intent.putExtra(TtmlNode.ATTR_ID, bVar.f18766a);
            intent.putExtra("privados", bVar.f18769d);
            intent.putExtra("nombre", bVar.f18767b);
            intent.putExtra("coments", bVar.f18770e);
            intent.putExtra("fnac_d", bVar.f18771f);
            intent.putExtra("fnac_m", bVar.f18772g);
            intent.putExtra("fnac_a", bVar.f18773h);
            intent.putExtra("sexo", bVar.f18774i);
            intent.putExtra("vfoto", bVar.f18768c);
            intent.putExtra("dist", bVar.f18775j);
            intent.putExtra("p_fnac", this.f18724c);
            intent.putExtra("p_sexo", this.f18725d);
            intent.putExtra("p_descr", this.f18726e);
            intent.putExtra("p_dist", this.f18727f);
            intent.putExtra("coments_chat", this.f18735n);
            intent.putExtra("galeria", this.f18736o);
            intent.putExtra("privados_chat", this.f18737p);
            intent.putExtra("fotos_perfil", this.f18728g);
            intent.putExtra("fotos_chat", 1);
            intent.putExtra("conectado", bVar.f18780o);
            startActivityForResult(intent, 0);
        }
    }

    public void onClick(View view) {
        if (view.getId() == R.id.ll_filtros) {
            this.f18703N.show();
        } else if (view.getId() == R.id.btnperfil) {
            Intent intent = new Intent(this, preperfil.class);
            intent.putExtra("idsecc", this.f18723b);
            intent.putExtra("nocompletar", true);
            intent.putExtra("desde_buscusus", true);
            startActivityForResult(intent, 0);
        } else if ((this.f18729h.f17986cO == null || this.f18729h.f17986cO.equals("")) && ((this.f18729h.f17985cN == null || this.f18729h.f17985cN.equals("")) && ((this.f18729h.f17988cQ == null || this.f18729h.f17988cQ.equals("")) && (this.f18729h.f17989cR == null || this.f18729h.f17989cR.equals(""))))) {
            abrir_secc(view);
        } else {
            if (this.f18729h.f17986cO != null && !this.f18729h.f17986cO.equals("")) {
                this.f18712W = new RewardedVideo((Context) this, this.f18729h.f17986cO);
            }
            if (this.f18729h.f17985cN != null && !this.f18729h.f17985cN.equals("")) {
                this.f18711V = C2997g.m10716a(this);
            }
            if (this.f18729h.f17988cQ != null && !this.f18729h.f17988cQ.equals("")) {
                this.f18713X = new RewardedVideoAd(this, this.f18729h.f17988cQ);
            }
            if (this.f18729h.f17989cR != null && !this.f18729h.f17989cR.equals("")) {
                this.f18714Y = new StartAppAd(this);
            }
            this.f18719ac = new ProgressDialog(this);
            this.f18718ab = view;
            if (!this.f18729h.mo20774a((Context) this, view, this.f18696G, this.f18719ac, this.f18711V, this.f18712W, this.f18713X, this.f18714Y)) {
                abrir_secc(view);
            }
        }
    }

    public void abrir_secc(View view) {
        C5662h a = this.f18729h.mo20761a(view, (Context) this);
        if (a.f18227b) {
            this.f18730i = true;
            Intent intent = new Intent();
            intent.putExtra("finalizar", true);
            intent.putExtra("finalizar_app", a.f18228c);
            setResult(-1, intent);
        }
        if (a.f18229d) {
            startActivityForResult(a.f18226a, 0);
        } else if (a.f18226a != null) {
            if (a.f18227b && this.f18729h.f18045dm != 2) {
                a.f18226a.putExtra("es_root", true);
            }
            this.f18733l = false;
            startActivity(a.f18226a);
        }
        if (this.f18730i && !this.f18717aa) {
            finish();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public Dialog mo21071g() {
        Dialog dialog = new Dialog(this);
        if (getResources().getConfiguration().orientation == 2) {
            dialog.setContentView(R.layout.filtros_h);
        } else {
            dialog.setContentView(R.layout.filtros);
        }
        dialog.setTitle(getResources().getString(R.string.selecciona));
        TextView textView = (TextView) dialog.findViewById(R.id.btn_aceptar);
        textView.setOnClickListener(new OnClickListener() {
            /* JADX WARNING: Removed duplicated region for block: B:33:0x0090  */
            /* JADX WARNING: Removed duplicated region for block: B:44:0x00e1  */
            /* JADX WARNING: Removed duplicated region for block: B:49:0x010f  */
            /* JADX WARNING: Removed duplicated region for block: B:60:0x0162  */
            /* JADX WARNING: Removed duplicated region for block: B:70:0x01b2  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void onClick(android.view.View r11) {
                /*
                    r10 = this;
                    mega.boicot.t_buscusus r11 = mega.boicot.t_buscusus.this
                    android.content.SharedPreferences r11 = r11.f18722af
                    android.content.SharedPreferences$Editor r11 = r11.edit()
                    mega.boicot.t_buscusus r0 = mega.boicot.t_buscusus.this
                    boolean r0 = r0.f18741t
                    r1 = 5
                    r2 = 3
                    r3 = 1
                    r4 = 2
                    r5 = 0
                    if (r0 == 0) goto L_0x0089
                    mega.boicot.t_buscusus r0 = mega.boicot.t_buscusus.this
                    android.app.Dialog r0 = r0.f18703N
                    r6 = 2131231432(0x7f0802c8, float:1.8078945E38)
                    android.view.View r0 = r0.findViewById(r6)
                    android.widget.Spinner r0 = (android.widget.Spinner) r0
                    int r0 = r0.getSelectedItemPosition()
                    r6 = 10
                    if (r0 != r4) goto L_0x002a
                    r0 = r3
                    goto L_0x0057
                L_0x002a:
                    if (r0 != r2) goto L_0x002e
                    r0 = r4
                    goto L_0x0057
                L_0x002e:
                    r7 = 4
                    if (r0 != r7) goto L_0x0033
                    r0 = r1
                    goto L_0x0057
                L_0x0033:
                    if (r0 != r1) goto L_0x0037
                    r0 = r6
                    goto L_0x0057
                L_0x0037:
                    r7 = 6
                    if (r0 != r7) goto L_0x003d
                    r0 = 20
                    goto L_0x0057
                L_0x003d:
                    r7 = 7
                    if (r0 != r7) goto L_0x0043
                    r0 = 50
                    goto L_0x0057
                L_0x0043:
                    r7 = 8
                    if (r0 != r7) goto L_0x004a
                    r0 = 100
                    goto L_0x0057
                L_0x004a:
                    r7 = 9
                    if (r0 != r7) goto L_0x0051
                    r0 = 200(0xc8, float:2.8E-43)
                    goto L_0x0057
                L_0x0051:
                    if (r0 != r6) goto L_0x0056
                    r0 = 500(0x1f4, float:7.0E-43)
                    goto L_0x0057
                L_0x0056:
                    r0 = r5
                L_0x0057:
                    mega.boicot.t_buscusus r6 = mega.boicot.t_buscusus.this
                    int r6 = r6.f18746y
                    if (r6 == r0) goto L_0x0089
                    mega.boicot.t_buscusus r6 = mega.boicot.t_buscusus.this
                    r6.f18746y = r0
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    r0.<init>()
                    java.lang.String r6 = "fdist_v_"
                    r0.append(r6)
                    mega.boicot.t_buscusus r6 = mega.boicot.t_buscusus.this
                    mega.boicot.config r6 = r6.f18729h
                    mega.boicot.i[] r6 = r6.f17971bz
                    mega.boicot.t_buscusus r7 = mega.boicot.t_buscusus.this
                    int r7 = r7.f18723b
                    r6 = r6[r7]
                    int r6 = r6.f18330w
                    r0.append(r6)
                    java.lang.String r0 = r0.toString()
                    mega.boicot.t_buscusus r6 = mega.boicot.t_buscusus.this
                    int r6 = r6.f18746y
                    r11.putInt(r0, r6)
                    r0 = r3
                    goto L_0x008a
                L_0x0089:
                    r0 = r5
                L_0x008a:
                    mega.boicot.t_buscusus r6 = mega.boicot.t_buscusus.this
                    boolean r6 = r6.f18739r
                    if (r6 == 0) goto L_0x00db
                    mega.boicot.t_buscusus r6 = mega.boicot.t_buscusus.this
                    android.app.Dialog r6 = r6.f18703N
                    r7 = 2131231435(0x7f0802cb, float:1.807895E38)
                    android.view.View r6 = r6.findViewById(r7)
                    android.widget.Spinner r6 = (android.widget.Spinner) r6
                    int r6 = r6.getSelectedItemPosition()
                    if (r6 != r4) goto L_0x00a5
                    r6 = r3
                    goto L_0x00aa
                L_0x00a5:
                    if (r6 != r2) goto L_0x00a9
                    r6 = r4
                    goto L_0x00aa
                L_0x00a9:
                    r6 = r5
                L_0x00aa:
                    mega.boicot.t_buscusus r7 = mega.boicot.t_buscusus.this
                    int r7 = r7.f18745x
                    if (r7 == r6) goto L_0x00db
                    mega.boicot.t_buscusus r0 = mega.boicot.t_buscusus.this
                    r0.f18745x = r6
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    r0.<init>()
                    java.lang.String r6 = "fsexo_v_"
                    r0.append(r6)
                    mega.boicot.t_buscusus r6 = mega.boicot.t_buscusus.this
                    mega.boicot.config r6 = r6.f18729h
                    mega.boicot.i[] r6 = r6.f17971bz
                    mega.boicot.t_buscusus r7 = mega.boicot.t_buscusus.this
                    int r7 = r7.f18723b
                    r6 = r6[r7]
                    int r6 = r6.f18330w
                    r0.append(r6)
                    java.lang.String r0 = r0.toString()
                    mega.boicot.t_buscusus r6 = mega.boicot.t_buscusus.this
                    int r6 = r6.f18745x
                    r11.putInt(r0, r6)
                    r0 = r3
                L_0x00db:
                    mega.boicot.t_buscusus r6 = mega.boicot.t_buscusus.this
                    boolean r6 = r6.f18740s
                    if (r6 == 0) goto L_0x0105
                    mega.boicot.t_buscusus r6 = mega.boicot.t_buscusus.this
                    android.app.Dialog r6 = r6.f18703N
                    r7 = 2131231591(0x7f080367, float:1.8079267E38)
                    android.view.View r6 = r6.findViewById(r7)
                    android.widget.EditText r6 = (android.widget.EditText) r6
                    android.text.Editable r6 = r6.getText()
                    java.lang.String r6 = r6.toString()
                    mega.boicot.t_buscusus r7 = mega.boicot.t_buscusus.this
                    java.lang.String r7 = r7.f18693D
                    boolean r7 = r7.equals(r6)
                    if (r7 != 0) goto L_0x0105
                    mega.boicot.t_buscusus r0 = mega.boicot.t_buscusus.this
                    r0.f18693D = r6
                    r0 = r3
                L_0x0105:
                    mega.boicot.t_buscusus r6 = mega.boicot.t_buscusus.this
                    boolean r6 = r6.f18742u
                    r7 = 25
                    r8 = 18
                    if (r6 == 0) goto L_0x015c
                    mega.boicot.t_buscusus r6 = mega.boicot.t_buscusus.this
                    android.app.Dialog r6 = r6.f18703N
                    r9 = 2131231433(0x7f0802c9, float:1.8078947E38)
                    android.view.View r6 = r6.findViewById(r9)
                    android.widget.Spinner r6 = (android.widget.Spinner) r6
                    int r6 = r6.getSelectedItemPosition()
                    if (r6 != r4) goto L_0x0124
                    r6 = r8
                    goto L_0x012b
                L_0x0124:
                    if (r6 <= r4) goto L_0x012a
                    int r6 = r6 - r2
                    int r6 = r6 * r1
                    int r6 = r6 + r7
                    goto L_0x012b
                L_0x012a:
                    r6 = r5
                L_0x012b:
                    mega.boicot.t_buscusus r9 = mega.boicot.t_buscusus.this
                    int r9 = r9.f18747z
                    if (r9 == r6) goto L_0x015c
                    mega.boicot.t_buscusus r0 = mega.boicot.t_buscusus.this
                    r0.f18747z = r6
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    r0.<init>()
                    java.lang.String r6 = "fedad1_v_"
                    r0.append(r6)
                    mega.boicot.t_buscusus r6 = mega.boicot.t_buscusus.this
                    mega.boicot.config r6 = r6.f18729h
                    mega.boicot.i[] r6 = r6.f17971bz
                    mega.boicot.t_buscusus r9 = mega.boicot.t_buscusus.this
                    int r9 = r9.f18723b
                    r6 = r6[r9]
                    int r6 = r6.f18330w
                    r0.append(r6)
                    java.lang.String r0 = r0.toString()
                    mega.boicot.t_buscusus r6 = mega.boicot.t_buscusus.this
                    int r6 = r6.f18747z
                    r11.putInt(r0, r6)
                    r0 = r3
                L_0x015c:
                    mega.boicot.t_buscusus r6 = mega.boicot.t_buscusus.this
                    boolean r6 = r6.f18743v
                    if (r6 == 0) goto L_0x01b0
                    mega.boicot.t_buscusus r6 = mega.boicot.t_buscusus.this
                    android.app.Dialog r6 = r6.f18703N
                    r9 = 2131231434(0x7f0802ca, float:1.8078949E38)
                    android.view.View r6 = r6.findViewById(r9)
                    android.widget.Spinner r6 = (android.widget.Spinner) r6
                    int r6 = r6.getSelectedItemPosition()
                    if (r6 != r4) goto L_0x0177
                    r1 = r8
                    goto L_0x017f
                L_0x0177:
                    if (r6 <= r4) goto L_0x017e
                    int r6 = r6 - r2
                    int r6 = r6 * r1
                    int r1 = r7 + r6
                    goto L_0x017f
                L_0x017e:
                    r1 = r5
                L_0x017f:
                    mega.boicot.t_buscusus r2 = mega.boicot.t_buscusus.this
                    int r2 = r2.f18690A
                    if (r2 == r1) goto L_0x01b0
                    mega.boicot.t_buscusus r0 = mega.boicot.t_buscusus.this
                    r0.f18690A = r1
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    r0.<init>()
                    java.lang.String r1 = "fedad2_v_"
                    r0.append(r1)
                    mega.boicot.t_buscusus r1 = mega.boicot.t_buscusus.this
                    mega.boicot.config r1 = r1.f18729h
                    mega.boicot.i[] r1 = r1.f17971bz
                    mega.boicot.t_buscusus r2 = mega.boicot.t_buscusus.this
                    int r2 = r2.f18723b
                    r1 = r1[r2]
                    int r1 = r1.f18330w
                    r0.append(r1)
                    java.lang.String r0 = r0.toString()
                    mega.boicot.t_buscusus r1 = mega.boicot.t_buscusus.this
                    int r1 = r1.f18690A
                    r11.putInt(r0, r1)
                    r0 = r3
                L_0x01b0:
                    if (r0 == 0) goto L_0x01f1
                    r11.commit()
                    mega.boicot.t_buscusus r11 = mega.boicot.t_buscusus.this
                    r11.mo21072h()
                    mega.boicot.t_buscusus r11 = mega.boicot.t_buscusus.this
                    java.util.ArrayList<mega.boicot.t_buscusus$b> r11 = r11.f18698I
                    r11.clear()
                    mega.boicot.t_buscusus r11 = mega.boicot.t_buscusus.this
                    r11.f18734m = r5
                    mega.boicot.t_buscusus r11 = mega.boicot.t_buscusus.this
                    mega.boicot.t_buscusus$a r11 = r11.f18700K
                    r11.notifyDataSetChanged()
                    mega.boicot.t_buscusus r11 = mega.boicot.t_buscusus.this
                    r11.f18738q = r5
                    mega.boicot.t_buscusus r11 = mega.boicot.t_buscusus.this
                    mega.boicot.t_buscusus$d r11 = r11.f18701L
                    if (r11 == 0) goto L_0x01dd
                    mega.boicot.t_buscusus r11 = mega.boicot.t_buscusus.this
                    mega.boicot.t_buscusus$d r11 = r11.f18701L
                    r11.cancel(r3)
                L_0x01dd:
                    mega.boicot.t_buscusus r11 = mega.boicot.t_buscusus.this
                    mega.boicot.t_buscusus$d r0 = new mega.boicot.t_buscusus$d
                    mega.boicot.t_buscusus r1 = mega.boicot.t_buscusus.this
                    r0.<init>(r5)
                    r11.f18701L = r0
                    mega.boicot.t_buscusus r11 = mega.boicot.t_buscusus.this
                    mega.boicot.t_buscusus$d r11 = r11.f18701L
                    java.lang.String[] r0 = new java.lang.String[r5]
                    r11.execute(r0)
                L_0x01f1:
                    mega.boicot.t_buscusus r11 = mega.boicot.t_buscusus.this
                    android.app.Dialog r11 = r11.f18703N
                    r11.dismiss()
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: mega.boicot.t_buscusus.C57703.onClick(android.view.View):void");
            }
        });
        if (VERSION.SDK_INT > 20) {
            StringBuilder sb = new StringBuilder();
            sb.append("#");
            sb.append(this.f18729h.f17890aW);
            textView.setTextColor(Color.parseColor(sb.toString()));
        }
        if (this.f18742u) {
            Spinner spinner = (Spinner) dialog.findViewById(R.id.sp_edad1);
            ArrayList arrayList = new ArrayList();
            arrayList.add(getResources().getString(R.string.edad_min));
            arrayList.add(getResources().getString(R.string.todo));
            StringBuilder sb2 = new StringBuilder();
            sb2.append(">18");
            sb2.append(getResources().getString(R.string.anyos_abrev));
            arrayList.add(sb2.toString());
            int i = -1;
            int i2 = 25;
            for (int i3 = 76; i2 < i3; i3 = 76) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(">");
                sb3.append(i2);
                sb3.append(getResources().getString(R.string.anyos_abrev));
                arrayList.add(sb3.toString());
                if (this.f18747z == i2) {
                    i = arrayList.size() - 1;
                }
                i2 += 5;
            }
            ArrayAdapter arrayAdapter = new ArrayAdapter(this, 17367048, arrayList);
            arrayAdapter.setDropDownViewResource(17367049);
            spinner.setAdapter(arrayAdapter);
            if (i != -1) {
                spinner.setSelection(i);
            } else if (this.f18747z == 18) {
                spinner.setSelection(2);
            } else {
                spinner.setSelection(0);
            }
            spinner.setVisibility(0);
        }
        if (this.f18743v) {
            Spinner spinner2 = (Spinner) dialog.findViewById(R.id.sp_edad2);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(getResources().getString(R.string.edad_max));
            arrayList2.add(getResources().getString(R.string.todo));
            StringBuilder sb4 = new StringBuilder();
            sb4.append("<18");
            sb4.append(getResources().getString(R.string.anyos_abrev));
            arrayList2.add(sb4.toString());
            int i4 = -1;
            for (int i5 = 25; i5 < 76; i5 += 5) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append("<");
                sb5.append(i5);
                sb5.append(getResources().getString(R.string.anyos_abrev));
                arrayList2.add(sb5.toString());
                if (this.f18690A == i5) {
                    i4 = arrayList2.size() - 1;
                }
            }
            ArrayAdapter arrayAdapter2 = new ArrayAdapter(this, 17367048, arrayList2);
            arrayAdapter2.setDropDownViewResource(17367049);
            spinner2.setAdapter(arrayAdapter2);
            if (i4 != -1) {
                spinner2.setSelection(i4);
            } else if (this.f18690A == 18) {
                spinner2.setSelection(2);
            } else {
                spinner2.setSelection(0);
            }
            spinner2.setVisibility(0);
        }
        if (this.f18739r) {
            Spinner spinner3 = (Spinner) dialog.findViewById(R.id.sp_sexo);
            ArrayList arrayList3 = new ArrayList();
            arrayList3.add(getResources().getString(R.string.petic_sexo));
            arrayList3.add(getResources().getString(R.string.todo));
            arrayList3.add(getResources().getString(R.string.hombres));
            arrayList3.add(getResources().getString(R.string.mujeres));
            ArrayAdapter arrayAdapter3 = new ArrayAdapter(this, 17367048, arrayList3);
            arrayAdapter3.setDropDownViewResource(17367049);
            spinner3.setAdapter(arrayAdapter3);
            if (this.f18745x == 1) {
                spinner3.setSelection(2);
            } else if (this.f18745x == 2) {
                spinner3.setSelection(3);
            } else {
                spinner3.setSelection(0);
            }
            spinner3.setVisibility(0);
        }
        if (this.f18740s) {
            dialog.findViewById(R.id.tv_nick).setVisibility(0);
        }
        if (this.f18741t) {
            Spinner spinner4 = (Spinner) dialog.findViewById(R.id.sp_dist);
            ArrayList arrayList4 = new ArrayList();
            arrayList4.add(getResources().getString(R.string.dist));
            arrayList4.add(getResources().getString(R.string.todo));
            String str = "km.";
            if (this.f18695F.equals("US") || this.f18695F.equals("GB") || this.f18695F.equals("MM")) {
                str = "mi.";
            }
            StringBuilder sb6 = new StringBuilder();
            sb6.append("<1");
            sb6.append(str);
            arrayList4.add(sb6.toString());
            StringBuilder sb7 = new StringBuilder();
            sb7.append("<2");
            sb7.append(str);
            arrayList4.add(sb7.toString());
            StringBuilder sb8 = new StringBuilder();
            sb8.append("<5");
            sb8.append(str);
            arrayList4.add(sb8.toString());
            StringBuilder sb9 = new StringBuilder();
            sb9.append("<10");
            sb9.append(str);
            arrayList4.add(sb9.toString());
            StringBuilder sb10 = new StringBuilder();
            sb10.append("<20");
            sb10.append(str);
            arrayList4.add(sb10.toString());
            StringBuilder sb11 = new StringBuilder();
            sb11.append("<50");
            sb11.append(str);
            arrayList4.add(sb11.toString());
            StringBuilder sb12 = new StringBuilder();
            sb12.append("<100");
            sb12.append(str);
            arrayList4.add(sb12.toString());
            StringBuilder sb13 = new StringBuilder();
            sb13.append("<200");
            sb13.append(str);
            arrayList4.add(sb13.toString());
            StringBuilder sb14 = new StringBuilder();
            sb14.append("<500");
            sb14.append(str);
            arrayList4.add(sb14.toString());
            ArrayAdapter arrayAdapter4 = new ArrayAdapter(this, 17367048, arrayList4);
            arrayAdapter4.setDropDownViewResource(17367049);
            spinner4.setAdapter(arrayAdapter4);
            if (this.f18746y == 1) {
                spinner4.setSelection(2);
            } else if (this.f18746y == 2) {
                spinner4.setSelection(3);
            } else if (this.f18746y == 5) {
                spinner4.setSelection(4);
            } else if (this.f18746y == 10) {
                spinner4.setSelection(5);
            } else if (this.f18746y == 20) {
                spinner4.setSelection(6);
            } else if (this.f18746y == 50) {
                spinner4.setSelection(7);
            } else if (this.f18746y == 100) {
                spinner4.setSelection(8);
            } else if (this.f18746y == 200) {
                spinner4.setSelection(9);
            } else if (this.f18746y == 500) {
                spinner4.setSelection(10);
            } else {
                spinner4.setSelection(0);
            }
            spinner4.setVisibility(0);
        }
        return dialog;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public void mo21072h() {
        boolean z;
        if (this.f18739r || this.f18741t || this.f18742u || this.f18743v) {
            findViewById(R.id.ll_filtros).setOnClickListener(this);
            findViewById(R.id.ll_filtros).setVisibility(0);
            if (!this.f18739r || this.f18745x == 0) {
                this.f18705P.setVisibility(8);
                z = false;
            } else {
                if (this.f18745x == 1) {
                    this.f18705P.setText(getResources().getString(R.string.hombres));
                } else {
                    this.f18705P.setText(getResources().getString(R.string.mujeres));
                }
                this.f18705P.setVisibility(0);
                z = true;
            }
            if (!this.f18740s || this.f18693D.equals("")) {
                this.f18706Q.setVisibility(8);
            } else {
                this.f18706Q.setText(this.f18693D);
                this.f18706Q.setVisibility(0);
                z = true;
            }
            if (!this.f18741t || this.f18746y == 0) {
                this.f18707R.setVisibility(8);
            } else {
                long j = (long) this.f18746y;
                String str = "km.";
                if (this.f18695F.equals("US") || this.f18695F.equals("GB") || this.f18695F.equals("MM")) {
                    str = "mi.";
                }
                TextView textView = this.f18707R;
                StringBuilder sb = new StringBuilder();
                sb.append(j);
                sb.append(" ");
                sb.append(str);
                textView.setText(sb.toString());
                this.f18707R.setVisibility(0);
                z = true;
            }
            if (!this.f18742u || this.f18747z == 0) {
                this.f18708S.setVisibility(8);
            } else {
                TextView textView2 = this.f18708S;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(">");
                sb2.append(this.f18747z);
                sb2.append(getResources().getString(R.string.anyos_abrev));
                textView2.setText(sb2.toString());
                this.f18708S.setVisibility(0);
                z = true;
            }
            if (!this.f18743v || this.f18690A == 0) {
                this.f18709T.setVisibility(8);
            } else {
                TextView textView3 = this.f18709T;
                StringBuilder sb3 = new StringBuilder();
                sb3.append("<");
                sb3.append(this.f18690A);
                sb3.append(getResources().getString(R.string.anyos_abrev));
                textView3.setText(sb3.toString());
                this.f18709T.setVisibility(0);
                z = true;
            }
            if (z) {
                findViewById(R.id.tv_filtrar).setVisibility(8);
            } else {
                findViewById(R.id.tv_filtrar).setVisibility(0);
            }
        } else {
            findViewById(R.id.ll_filtros).setVisibility(8);
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ((LinearLayout) findViewById(R.id.ll_princ)).removeViewAt(0);
        mo21070f();
        this.f18703N.dismiss();
        this.f18703N = mo21071g();
        ((LinearLayout) findViewById(R.id.ll_ad)).removeAllViews();
        if (!(this.f18710U == null || this.f18710U.f17768a == null)) {
            try {
                this.f18710U.f17768a.mo12168c();
            } catch (Exception unused) {
            }
        }
        if (!(this.f18710U == null || this.f18710U.f17769b == null)) {
            try {
                this.f18710U.f17769b.destroy();
            } catch (Exception unused2) {
            }
        }
        this.f18710U = this.f18729h.mo20760a((Context) this, false);
    }

    public boolean onSearchRequested() {
        if (this.f18729h.f18080q == 0) {
            return false;
        }
        this.f18730i = true;
        this.f18717aa = true;
        return super.onSearchRequested();
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getWindow().setFormat(1);
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("es_root", this.f18733l);
    }

    public void onStop() {
        super.onStop();
        if (this.f18730i && !this.f18717aa) {
            finish();
        }
    }

    public void onPause() {
        if (!(this.f18729h.f18013cx == 0 || this.f18710U == null || this.f18710U.f17768a == null)) {
            this.f18710U.f17768a.mo12167b();
        }
        super.onPause();
    }

    public void onResume() {
        super.onResume();
        config.m23860m(this);
        if (this.f18700K != null) {
            this.f18700K.notifyDataSetChanged();
        }
        if (this.f18729h.f18013cx != 0 && this.f18710U != null && this.f18710U.f17768a != null) {
            this.f18710U.f17768a.mo12165a();
        }
    }

    public void onDestroy() {
        if (!(this.f18729h.f18013cx == 0 || this.f18710U == null || this.f18710U.f17768a == null)) {
            this.f18710U.f17768a.mo12168c();
        }
        if (!(this.f18729h.f18013cx == 0 || this.f18710U == null || this.f18710U.f17769b == null)) {
            this.f18710U.f17769b.destroy();
        }
        if ((this.f18733l && isFinishing()) || config.f17841i) {
            config.m23861n(this);
        }
        super.onDestroy();
    }

    public void onBackPressed() {
        if (!this.f18733l || this.f18732k || !this.f18729h.f18059ea) {
            super.onBackPressed();
            return;
        }
        this.f18732k = true;
        config.m23859l(this);
    }

    public void adLoaded(String str) {
        this.f18719ac.cancel();
        this.f18712W.showAd();
    }

    public void onAdClosed() {
        if (this.f18715Z) {
            abrir_secc(this.f18718ab);
        }
    }

    public void adError(String str) {
        this.f18719ac.cancel();
        abrir_secc(this.f18718ab);
    }

    public void videoEnded() {
        this.f18715Z = true;
        config.m23867t(this);
    }

    /* renamed from: z_ */
    public void mo9678z_() {
        this.f18719ac.cancel();
        this.f18711V.mo12836a();
    }

    /* renamed from: a */
    public void mo9675a(C3165a aVar) {
        this.f18715Z = true;
        config.m23867t(this);
    }

    /* renamed from: A_ */
    public void mo9671A_() {
        if (this.f18715Z) {
            abrir_secc(this.f18718ab);
        }
    }

    /* renamed from: e */
    public void mo9676e() {
        this.f18715Z = false;
    }

    /* renamed from: a */
    public void mo9674a(int i) {
        if (!this.f18729h.mo20775a((Context) this, this.f18712W)) {
            this.f18719ac.cancel();
            abrir_secc(this.f18718ab);
        }
    }

    public void onError(C1514Ad ad, AdError adError) {
        this.f18719ac.cancel();
        abrir_secc(this.f18718ab);
    }

    public void onAdLoaded(C1514Ad ad) {
        this.f18719ac.cancel();
        this.f18713X.show();
    }

    public void onRewardedVideoCompleted() {
        this.f18715Z = true;
        config.m23867t(this);
    }

    public void onRewardedVideoClosed() {
        if (this.f18715Z) {
            abrir_secc(this.f18718ab);
        }
    }

    public void onVideoCompleted() {
        this.f18715Z = true;
        config.m23867t(this);
    }

    public void onReceiveAd(C5286Ad ad) {
        this.f18719ac.cancel();
        this.f18714Y.showAd("REWARDED VIDEO", new AdDisplayListener() {
            public void adClicked(C5286Ad ad) {
            }

            public void adDisplayed(C5286Ad ad) {
            }

            public void adNotDisplayed(C5286Ad ad) {
            }

            public void adHidden(C5286Ad ad) {
                if (t_buscusus.this.f18715Z) {
                    t_buscusus.this.abrir_secc(t_buscusus.this.f18718ab);
                }
            }
        });
    }

    public void onFailedToReceiveAd(C5286Ad ad) {
        this.f18719ac.cancel();
        abrir_secc(this.f18718ab);
    }
}
