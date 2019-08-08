package mega.boicot;

import android.annotation.TargetApi;
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
import android.content.SharedPreferences.OnSharedPreferenceChangeListener;
import android.content.pm.ResolveInfo;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.Color;
import android.graphics.Point;
import android.graphics.PorterDuff.Mode;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.GradientDrawable.Orientation;
import android.media.ThumbnailUtils;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.AsyncTask.Status;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore.Images.Media;
import android.support.p017v4.content.FileProvider;
import android.text.SpannableStringBuilder;
import android.text.format.DateFormat;
import android.text.style.ImageSpan;
import android.view.Display;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnKeyListener;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import com.appnext.ads.fullscreen.RewardedVideo;
import com.appnext.base.p046b.C1245d;
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
import java.io.FileInputStream;
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
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import mega.boicot.config.C5644f;
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

public class t_chat extends Activity implements OnSharedPreferenceChangeListener, OnClickListener, OnKeyListener, OnAdClosed, OnAdError, OnAdLoaded, OnVideoEnded, RewardedVideoAdListener, C3167c, VideoListener, AdEventListener, C5599a {

    /* renamed from: A */
    ListView f20356A;

    /* renamed from: B */
    Bundle f20357B;

    /* renamed from: C */
    Bitmap f20358C;

    /* renamed from: D */
    Map<String, Bitmap> f20359D;

    /* renamed from: E */
    Map<String, String> f20360E;

    /* renamed from: F */
    Map<String, String> f20361F;

    /* renamed from: G */
    File f20362G;

    /* renamed from: H */
    C6174k f20363H;

    /* renamed from: I */
    C6175l f20364I;

    /* renamed from: J */
    C6176m f20365J;

    /* renamed from: K */
    C6177n f20366K;

    /* renamed from: L */
    C6163f f20367L;

    /* renamed from: M */
    LinearLayout f20368M;

    /* renamed from: N */
    ProgressBar f20369N;

    /* renamed from: O */
    ProgressBar f20370O;

    /* renamed from: P */
    private int f20371P;

    /* renamed from: Q */
    private int f20372Q;

    /* renamed from: R */
    private int f20373R;
    /* access modifiers changed from: private */

    /* renamed from: S */
    public String f20374S;
    /* access modifiers changed from: private */

    /* renamed from: T */
    public String f20375T;
    /* access modifiers changed from: private */

    /* renamed from: U */
    public String f20376U;
    /* access modifiers changed from: private */

    /* renamed from: V */
    public String f20377V;
    /* access modifiers changed from: private */

    /* renamed from: W */
    public String f20378W;
    /* access modifiers changed from: private */

    /* renamed from: X */
    public String f20379X;
    /* access modifiers changed from: private */

    /* renamed from: Y */
    public String f20380Y;
    /* access modifiers changed from: private */

    /* renamed from: Z */
    public String f20381Z;

    /* renamed from: a */
    float f20382a;
    /* access modifiers changed from: private */

    /* renamed from: aa */
    public String f20383aa;
    /* access modifiers changed from: private */

    /* renamed from: ab */
    public int f20384ab;
    /* access modifiers changed from: private */

    /* renamed from: ac */
    public int f20385ac;

    /* renamed from: ad */
    private int f20386ad;

    /* renamed from: ae */
    private int f20387ae;
    /* access modifiers changed from: private */

    /* renamed from: af */
    public int f20388af;
    /* access modifiers changed from: private */

    /* renamed from: ag */
    public int f20389ag;
    /* access modifiers changed from: private */

    /* renamed from: ah */
    public int f20390ah;
    /* access modifiers changed from: private */

    /* renamed from: ai */
    public int f20391ai;
    /* access modifiers changed from: private */

    /* renamed from: aj */
    public int f20392aj;

    /* renamed from: ak */
    private int f20393ak;

    /* renamed from: al */
    private int f20394al;

    /* renamed from: am */
    private int f20395am;

    /* renamed from: an */
    private int f20396an;
    /* access modifiers changed from: private */

    /* renamed from: ao */
    public int f20397ao;
    /* access modifiers changed from: private */

    /* renamed from: ap */
    public boolean f20398ap;

    /* renamed from: aq */
    private boolean f20399aq;
    /* access modifiers changed from: private */

    /* renamed from: ar */
    public SharedPreferences f20400ar;
    /* access modifiers changed from: private */

    /* renamed from: as */
    public SharedPreferences f20401as;
    /* access modifiers changed from: private */

    /* renamed from: at */
    public config f20402at;
    /* access modifiers changed from: private */

    /* renamed from: au */
    public AlertDialog f20403au;

    /* renamed from: av */
    private Dialog f20404av;

    /* renamed from: aw */
    private C5602c f20405aw;

    /* renamed from: b */
    C3166b f20406b;

    /* renamed from: c */
    RewardedVideo f20407c;

    /* renamed from: d */
    RewardedVideoAd f20408d;

    /* renamed from: e */
    StartAppAd f20409e;

    /* renamed from: f */
    boolean f20410f = false;

    /* renamed from: g */
    boolean f20411g = false;

    /* renamed from: h */
    View f20412h;

    /* renamed from: i */
    ProgressDialog f20413i;

    /* renamed from: j */
    int f20414j;

    /* renamed from: k */
    C5663i f20415k;

    /* renamed from: l */
    ImageView f20416l;

    /* renamed from: m */
    long f20417m;

    /* renamed from: n */
    boolean f20418n = false;

    /* renamed from: o */
    boolean f20419o;

    /* renamed from: p */
    boolean f20420p;

    /* renamed from: q */
    boolean f20421q;

    /* renamed from: r */
    boolean f20422r = false;

    /* renamed from: s */
    boolean f20423s;

    /* renamed from: t */
    boolean f20424t;

    /* renamed from: u */
    boolean f20425u;

    /* renamed from: v */
    boolean f20426v;

    /* renamed from: w */
    boolean f20427w;

    /* renamed from: x */
    boolean f20428x;

    /* renamed from: y */
    boolean f20429y;

    /* renamed from: z */
    boolean f20430z;

    /* renamed from: mega.boicot.t_chat$a */
    private class C6156a extends Dialog implements OnClickListener {

        /* renamed from: b */
        private EditText f20467b;

        public C6156a(EditText editText) {
            super(t_chat.this);
            this.f20467b = editText;
        }

        /* access modifiers changed from: protected */
        public void onStart() {
            super.onStart();
            requestWindowFeature(1);
            setContentView(R.layout.emojis);
            getWindow().setBackgroundDrawable(new ColorDrawable(0));
            int[] iArr = {128512, 128513, 128514, 128515, 128516, 128517, 128518, 128521, 128522, 128523, 128526, 128525, 128536, 128529, 128566, 128547, 128549, 128558, 128559, 128554, 128555, 128564, 128524, 128539, 128540, 128541, 128530, 128533, 128562, 128534, 128542, 128536, 128543, 128548, 128546, 128557, 128550, 128551, 128552, 128553, 128556, 128560, 128561, 128563, 128565, 128545, 128544, 128567, 128519, 128520, 128127, 128121, 128122, 128128, 128123, 128125, 128126, 128586, 128584, 128585, 128116, 128117, 128104, 128105, 128084, 128110, 128130, 128119, 128120, 128112, 128124, 128118, 128694, 127939, 128131, 128111, 128107, 128143, 128106, 127968, 128072, 128073, 128070, 128071, 9757, 9996, 128076, 128170, 128077, 128078, 9994, 128074, 128075, 128079, 128588, 128591, 128066, 128069, 128064, 128139, 128149, 128152, 10084, 128148, 128166, 128168, 127769, 9728, 128054, 128052, 128014, 128055, 128017, 128024, 128048, 128020, 128035, 128056, 128034, 128051, 128044, 128031, 128012, 128029, 127801, 127804, 127796, 127808, 127828, 127831, 127829, 127848, 127849, 127874, 127856, 127853, 128663, 128690, 128674, 9992, 128640, 8986, 9200, 8987, 9924, 127877, 127875, 127876, 127881, 127882, 127886, 127873, 127926, 127908, 127911, 128251, 127942, 128176, 128184, 128179, 9917, 9918, 127936, 127944, 127934, 9971, 127938, 127946, 127927, 127928, 127929, 127930};
            LinearLayout linearLayout = (LinearLayout) findViewById(R.id.ll_emojis);
            int b = config.m23845b((Context) t_chat.this, 10);
            LayoutParams layoutParams = new LayoutParams(-1, -1);
            LayoutParams layoutParams2 = new LayoutParams(-2, -2);
            int i = 0;
            LinearLayout linearLayout2 = null;
            for (int i2 : iArr) {
                i++;
                if (i == 1) {
                    linearLayout2 = new LinearLayout(t_chat.this);
                    linearLayout2.setBackgroundColor(Color.parseColor("#dddddd"));
                    linearLayout2.setPadding(b, b, b, b);
                    linearLayout2.setLayoutParams(layoutParams);
                }
                TextView textView = new TextView(t_chat.this);
                textView.setLayoutParams(layoutParams2);
                textView.setPadding(b, b, b, b);
                textView.setTextColor(-16777216);
                textView.setTextSize(24.0f);
                textView.setText(new String(Character.toChars(i2)));
                textView.setTag(Integer.valueOf(i2));
                textView.setOnClickListener(this);
                linearLayout2.addView(textView);
                if (i == 4) {
                    linearLayout.addView(linearLayout2);
                    i = 0;
                }
            }
            if (i > 0) {
                linearLayout.addView(linearLayout2);
            }
        }

        public void onClick(View view) {
            int intValue = ((Integer) view.getTag()).intValue();
            if (intValue != 0) {
                int max = Math.max(this.f20467b.getSelectionStart(), 0);
                int max2 = Math.max(this.f20467b.getSelectionEnd(), 0);
                String str = new String(Character.toChars(intValue));
                this.f20467b.getText().replace(Math.min(max, max2), Math.max(max, max2), str, 0, str.length());
            }
            dismiss();
        }
    }

    /* renamed from: mega.boicot.t_chat$b */
    public static class C6157b extends AsyncTask<String, Void, String> {

        /* renamed from: a */
        private String f20468a;

        /* renamed from: b */
        private String f20469b;

        /* renamed from: c */
        private int f20470c;

        /* renamed from: d */
        private int f20471d;

        public C6157b(String str, int i, int i2, String str2) {
            this.f20468a = str;
            this.f20470c = i;
            this.f20471d = i2;
            this.f20469b = str2;
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
                sb.append("/srv/cancelar_solicitud.php");
                C6274e eVar = new C6274e(sb.toString());
                C6370g gVar = new C6370g(C6367d.BROWSER_COMPATIBLE);
                gVar.mo22648a("v", (C6360c) new C6363f("2"));
                StringBuilder sb2 = new StringBuilder();
                sb2.append(this.f20471d);
                sb2.append("");
                gVar.mo22648a("idusu", (C6360c) new C6363f(sb2.toString()));
                gVar.mo22648a("codigo", (C6360c) new C6363f(this.f20469b));
                gVar.mo22648a("idusu_conversante", (C6360c) new C6363f(this.f20468a));
                StringBuilder sb3 = new StringBuilder();
                sb3.append(this.f20470c);
                sb3.append("");
                gVar.mo22648a("modo", (C6360c) new C6363f(sb3.toString()));
                eVar.mo22444a(gVar);
                eVar.mo22909b("User-Agent", "Android Vinebre Software");
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(hVar.mo22459a((C6276g) eVar).mo22939b().mo22473f(), C2793C.UTF8_NAME));
                StringBuilder sb4 = new StringBuilder();
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        return sb4.toString();
                    }
                    sb4.append(readLine);
                }
            } catch (Exception e) {
                e.printStackTrace();
                return "ANDROID:KO 99";
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void onPostExecute(String str) {
            if (str.indexOf("ANDROID:OK") != -1 || str.indexOf("ANDROID:KO") != -1) {
                str.indexOf("ANDROID:OK");
            }
        }
    }

    /* renamed from: mega.boicot.t_chat$c */
    private class C6158c extends AsyncTask<String, Void, String> {

        /* renamed from: b */
        private String f20473b;

        /* renamed from: c */
        private String f20474c;

        /* renamed from: d */
        private int f20475d;

        /* renamed from: e */
        private int f20476e;

        public C6158c(String str, String str2, int i) {
            this.f20473b = str;
            this.f20474c = str2;
            this.f20475d = i;
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
            if (this.f20475d > -1) {
                this.f20476e = t_chat.this.findViewById(R.id.btncargarmas).getVisibility();
                t_chat.this.findViewById(R.id.btncargarmas).setVisibility(8);
                t_chat.this.f20370O.setVisibility(0);
            }
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
                sb.append("/srv/ultimas_frases.php");
                C6274e eVar = new C6274e(sb.toString());
                C6370g gVar = new C6370g(C6367d.BROWSER_COMPATIBLE);
                gVar.mo22648a("ver", (C6360c) new C6363f("1"));
                StringBuilder sb2 = new StringBuilder();
                sb2.append(t_chat.this.f20384ab);
                sb2.append("");
                gVar.mo22648a("idusu", (C6360c) new C6363f(sb2.toString()));
                gVar.mo22648a("c", (C6360c) new C6363f(t_chat.this.f20374S));
                StringBuilder sb3 = new StringBuilder();
                sb3.append(t_chat.this.f20389ag);
                sb3.append("");
                gVar.mo22648a("idtema", (C6360c) new C6363f(sb3.toString()));
                StringBuilder sb4 = new StringBuilder();
                sb4.append(this.f20475d);
                sb4.append("");
                gVar.mo22648a("idf", (C6360c) new C6363f(sb4.toString()));
                gVar.mo22648a("idprivado_finalizar", (C6360c) new C6363f(this.f20473b));
                gVar.mo22648a("idconversante", (C6360c) new C6363f(this.f20474c));
                StringBuilder sb5 = new StringBuilder();
                sb5.append(t_chat.this.f20426v);
                sb5.append("");
                gVar.mo22648a("externo", (C6360c) new C6363f(sb5.toString()));
                eVar.mo22444a(gVar);
                eVar.mo22909b("User-Agent", "Android Vinebre Software");
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(hVar.mo22459a((C6276g) eVar).mo22939b().mo22473f(), C2793C.UTF8_NAME));
                StringBuilder sb6 = new StringBuilder();
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        return sb6.toString();
                    }
                    sb6.append(readLine);
                }
            } catch (Exception unused) {
                return "ANDROID:KO";
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void onPostExecute(String str) {
            int i;
            String str2 = str;
            if (this.f20475d != -1) {
                try {
                    t_chat.this.f20370O.setVisibility(8);
                } catch (Exception unused) {
                }
                if (str2.indexOf("ANDROID:OK") == -1 && str2.indexOf("ANDROID:KO") == -1 && str2.indexOf("ANDROID:PERFILKO") == -1) {
                    t_chat.this.findViewById(R.id.btncargarmas).setVisibility(this.f20476e);
                } else if (str2.indexOf("ANDROID:PERFILKO") != -1) {
                    final AlertDialog create = new Builder(t_chat.this).setPositiveButton(R.string.aceptar, new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialogInterface, int i) {
                        }
                    }).setMessage(R.string.perfil_desactivado).create();
                    if (!t_chat.this.f20380Y.equals("")) {
                        create.setOnShowListener(new OnShowListener() {
                            public void onShow(DialogInterface dialogInterface) {
                                Button button = create.getButton(-1);
                                StringBuilder sb = new StringBuilder();
                                sb.append("#");
                                sb.append(t_chat.this.f20380Y);
                                button.setTextColor(Color.parseColor(sb.toString()));
                                Button button2 = create.getButton(-2);
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append("#");
                                sb2.append(t_chat.this.f20380Y);
                                button2.setTextColor(Color.parseColor(sb2.toString()));
                            }
                        });
                    }
                    create.show();
                    try {
                        ((TextView) create.findViewById(16908299)).setTypeface(Typeface.MONOSPACE);
                    } catch (Exception unused2) {
                    }
                } else if (str2.indexOf("ANDROID:OK") != -1) {
                    int indexOf = str2.indexOf("@XYY53@");
                    String str3 = "";
                    String str4 = "";
                    for (int i2 = -1; indexOf != i2; i2 = -1) {
                        int indexOf2 = str2.indexOf("@", indexOf + 1) + 1;
                        int indexOf3 = str2.indexOf("@", indexOf2);
                        String substring = str2.substring(indexOf2, indexOf3);
                        t_chat.this.f20390ah = Integer.parseInt(substring);
                        int i3 = indexOf3 + 1;
                        int indexOf4 = str2.indexOf("@", i3);
                        String substring2 = str2.substring(i3, indexOf4);
                        int i4 = indexOf4 + 1;
                        int indexOf5 = str2.indexOf("@", i4);
                        String substring3 = str2.substring(i4, indexOf5);
                        int i5 = indexOf5 + 1;
                        int indexOf6 = str2.indexOf("@", i5);
                        String substring4 = str2.substring(i5, indexOf6);
                        int i6 = indexOf6 + 1;
                        int indexOf7 = str2.indexOf("@", i6);
                        String substring5 = str2.substring(i6, indexOf7);
                        int i7 = indexOf7 + 1;
                        int indexOf8 = str2.indexOf("@", i7);
                        String substring6 = str2.substring(i7, indexOf8);
                        int i8 = indexOf8 + 1;
                        int indexOf9 = str2.indexOf("@", i8);
                        String substring7 = str2.substring(i8, indexOf9);
                        int i9 = indexOf9 + 1;
                        int indexOf10 = str2.indexOf("@", i9);
                        String substring8 = str2.substring(i9, indexOf10);
                        int i10 = indexOf10 + 1;
                        int indexOf11 = str2.indexOf("@", i10);
                        String substring9 = str2.substring(i10, indexOf11);
                        int i11 = indexOf11 + 1;
                        int indexOf12 = str2.indexOf("@", i11);
                        String substring10 = str2.substring(i11, indexOf12);
                        int i12 = indexOf12 + 1;
                        int indexOf13 = str2.indexOf("@", i12);
                        String substring11 = str2.substring(i12, indexOf13);
                        int i13 = indexOf13 + 1;
                        String str5 = substring11;
                        int indexOf14 = str2.indexOf("@", i13);
                        String substring12 = str2.substring(i13, indexOf14);
                        int i14 = indexOf14 + 1;
                        String str6 = substring12;
                        int indexOf15 = str2.indexOf("@", i14);
                        String substring13 = str2.substring(i14, indexOf15);
                        String str7 = "";
                        String str8 = "";
                        String str9 = substring10;
                        if (substring13.equals("1")) {
                            int i15 = indexOf15 + 1;
                            int indexOf16 = str2.indexOf("@", i15);
                            str7 = str2.substring(i15, indexOf16);
                            int i16 = indexOf16 + 1;
                            indexOf15 = str2.indexOf("@", i16);
                            str8 = str2.substring(i16, indexOf15);
                        }
                        String str10 = substring9;
                        String str11 = substring8;
                        String str12 = str7;
                        String str13 = str8;
                        if (str3.equals("") || substring4.equals("") || !str3.equals(substring4) || str4.equals("") || substring2.equals("") || !str4.equals(substring2)) {
                            String str14 = "";
                            int indexOf17 = str2.indexOf("@XYY53@", indexOf15);
                            if (indexOf17 != -1) {
                                int indexOf18 = str2.indexOf("@", str2.indexOf("@", indexOf17 + 1) + 1) + 1;
                                str14 = str2.substring(indexOf18, str2.indexOf("@", indexOf18));
                            }
                            Editor edit = t_chat.this.f20400ar.edit();
                            edit.putString("f2_idfrase", substring);
                            edit.putString("f2_id", substring2);
                            edit.putString("f2_idusu_prev", str14);
                            edit.putString("f2_nombre", substring3);
                            edit.putString("f2_privados", substring6);
                            edit.putString("f2_frase", substring4);
                            edit.putString("f2_fcrea", config.m23848b(substring7));
                            edit.putString("f2_b64", "");
                            edit.putString("f2_tipo", substring13);
                            edit.putString("f2_b64_th", "");
                            edit.putString("f2_idvideo", str12);
                            edit.putString("f2_formato", str13);
                            StringBuilder sb = new StringBuilder();
                            sb.append(t_chat.this.f20389ag);
                            sb.append("");
                            edit.putString("f2_idtema", sb.toString());
                            edit.putString("f2_vfoto", substring5);
                            edit.putString("f2_fnac_d", str11);
                            edit.putString("f2_fnac_m", str10);
                            edit.putString("f2_fnac_a", str9);
                            edit.putString("f2_sexo", str5);
                            edit.putString("f2_coments", str6);
                            edit.putBoolean("f2_ultimas", true);
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(System.currentTimeMillis());
                            sb2.append("");
                            edit.putString("f2_ts", sb2.toString());
                            edit.commit();
                            str4 = substring2;
                            str3 = substring4;
                        }
                        indexOf = str2.indexOf("@XYY53@", indexOf15);
                    }
                    if (str2.indexOf("ZXRT4@1@") != -1) {
                        t_chat.this.findViewById(R.id.btncargarmas).setVisibility(0);
                        i = 8;
                    } else {
                        t_chat.this.mo22082g();
                        i = 8;
                        t_chat.this.findViewById(R.id.btncargarmas).setVisibility(8);
                    }
                    if (t_chat.this.f20426v) {
                        int indexOf19 = str2.indexOf("ZXRT4@");
                        if (indexOf19 != -1) {
                            int i17 = indexOf19 + i;
                            int indexOf20 = str2.indexOf("@", i17);
                            int parseInt = Integer.parseInt(str2.substring(i17, indexOf20));
                            int i18 = indexOf20 + 1;
                            int indexOf21 = str2.indexOf("@", i18);
                            boolean equals = str2.substring(i18, indexOf21).equals("1");
                            int i19 = indexOf21 + 1;
                            int parseInt2 = Integer.parseInt(str2.substring(i19, str2.indexOf("@", i19)));
                            if (parseInt > 0) {
                                if (!equals) {
                                    config a = t_chat.this.f20402at;
                                    StringBuilder sb3 = new StringBuilder();
                                    sb3.append("fondo_");
                                    sb3.append(parseInt);
                                    a.mo20776a(sb3.toString(), (ImageView) t_chat.this.findViewById(R.id.iv_fondo));
                                } else {
                                    C6161d dVar = new C6161d();
                                    StringBuilder sb4 = new StringBuilder();
                                    sb4.append(parseInt);
                                    sb4.append("");
                                    StringBuilder sb5 = new StringBuilder();
                                    sb5.append(parseInt2);
                                    sb5.append("");
                                    dVar.execute(new String[]{sb4.toString(), "", sb5.toString()});
                                }
                            }
                        }
                    }
                } else {
                    t_chat.this.findViewById(R.id.btncargarmas).setVisibility(this.f20476e);
                }
            }
        }
    }

    /* renamed from: mega.boicot.t_chat$d */
    private class C6161d extends AsyncTask<String, Void, Byte> {

        /* renamed from: a */
        String f20480a;

        /* renamed from: b */
        String f20481b;

        /* renamed from: c */
        String f20482c;

        /* access modifiers changed from: protected */
        public void onPreExecute() {
        }

        private C6161d() {
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
                r5.f20480a = r1
                r1 = 1
                r2 = r6[r1]
                r5.f20481b = r2
                r2 = 2
                r6 = r6[r2]
                r5.f20482c = r6
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                java.lang.String r2 = "http://imgs1.e-droid.net/srv/imgs/chat/"
                r6.append(r2)
                java.lang.String r2 = r5.f20480a
                r6.append(r2)
                java.lang.String r2 = "_fondo.png?v="
                r6.append(r2)
                java.lang.String r2 = r5.f20482c
                r6.append(r2)
                java.lang.String r6 = r6.toString()
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "fondo_"
                r2.append(r3)
                java.lang.String r3 = r5.f20480a
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
                r1 = 10000(0x2710, float:1.4013E-41)
                r6.setReadTimeout(r1)     // Catch:{ IOException -> 0x007d }
                r6.connect()     // Catch:{ IOException -> 0x007d }
                java.io.InputStream r6 = r6.getInputStream()     // Catch:{ IOException -> 0x007d }
                android.graphics.Bitmap r6 = android.graphics.BitmapFactory.decodeStream(r6)     // Catch:{ IOException -> 0x007d }
                mega.boicot.t_chat r1 = mega.boicot.t_chat.this     // Catch:{ Exception -> 0x0078 }
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
            throw new UnsupportedOperationException("Method not decompiled: mega.boicot.t_chat.C6161d.doInBackground(java.lang.String[]):java.lang.Byte");
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void onPostExecute(Byte b) {
            if (b.byteValue() == 0) {
                try {
                    config a = t_chat.this.f20402at;
                    StringBuilder sb = new StringBuilder();
                    sb.append("fondo_");
                    sb.append(this.f20480a);
                    a.mo20776a(sb.toString(), (ImageView) t_chat.this.findViewById(R.id.iv_fondo));
                } catch (Exception unused) {
                }
                if (!t_chat.this.f20426v) {
                    Editor edit = t_chat.this.getSharedPreferences("sh", 0).edit();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("s");
                    sb2.append(this.f20480a);
                    sb2.append("_fondo_modif");
                    edit.putInt(sb2.toString(), 0);
                    edit.commit();
                    t_chat.this.f20402at.f17971bz[Integer.parseInt(this.f20481b)].f18242M = false;
                    return;
                }
                new C6173j().execute(new String[]{this.f20480a});
            }
        }
    }

    /* renamed from: mega.boicot.t_chat$e */
    public static class C6162e extends AsyncTask<String, Void, String> {

        /* renamed from: a */
        private int f20484a;

        /* renamed from: b */
        private String f20485b;

        /* renamed from: c */
        private String f20486c;

        /* renamed from: d */
        private Context f20487d;

        public C6162e(String str, int i, String str2, Context context) {
            this.f20485b = str;
            this.f20484a = i;
            this.f20486c = str2;
            this.f20487d = context;
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
                sb.append("/srv/eliminar_usu.php");
                C6274e eVar = new C6274e(sb.toString());
                C6370g gVar = new C6370g(C6367d.BROWSER_COMPATIBLE);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(this.f20484a);
                sb2.append("");
                gVar.mo22648a("idusu", (C6360c) new C6363f(sb2.toString()));
                gVar.mo22648a("c", (C6360c) new C6363f(this.f20486c));
                gVar.mo22648a("idusu_elim", (C6360c) new C6363f(this.f20485b));
                eVar.mo22444a(gVar);
                eVar.mo22909b("User-Agent", "Android Vinebre Software");
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(hVar.mo22459a((C6276g) eVar).mo22939b().mo22473f(), C2793C.UTF8_NAME));
                StringBuilder sb3 = new StringBuilder();
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        return sb3.toString();
                    }
                    sb3.append(readLine);
                }
            } catch (Exception unused) {
                return "ANDROID:KO";
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void onPostExecute(String str) {
            if ((str.indexOf("ANDROID:OK") != -1 || str.indexOf("ANDROID:KO") != -1) && str.indexOf("ANDROID:OK") != -1) {
                config.m23839a(Toast.makeText(this.f20487d, this.f20487d.getString(R.string.usu_eliminado), 0));
            }
        }
    }

    /* renamed from: mega.boicot.t_chat$f */
    private class C6163f extends AsyncTask<String, Void, String> {

        /* renamed from: a */
        String f20488a;

        public C6163f(String str) {
            this.f20488a = str;
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
            if (!t_chat.this.f20428x) {
                Drawable drawable = t_chat.this.getResources().getDrawable(R.drawable.notif_blanco);
                drawable.setColorFilter(t_chat.this.f20414j, Mode.MULTIPLY);
                t_chat.this.f20416l.setImageDrawable(drawable);
                t_chat.this.f20428x = true;
                Editor edit = t_chat.this.f20400ar.edit();
                StringBuilder sb = new StringBuilder();
                sb.append("notif");
                sb.append(t_chat.this.f20388af);
                edit.putBoolean(sb.toString(), true);
                edit.commit();
                C5644f fVar = new C5644f(t_chat.this.f20384ab, t_chat.this.f20374S, t_chat.this.f20388af, "notif", 1);
                fVar.execute(new String[0]);
            }
            if (t_chat.this.f20400ar.getString("idprivado", "0").equals("0")) {
                t_chat.this.f20402at.mo20789h(t_chat.this);
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public String doInBackground(String... strArr) {
            try {
                C6529b bVar = new C6529b();
                C6530c.m25865c(bVar, 10000);
                C6530c.m25861a((C6531d) bVar, 20000);
                C6409h hVar = new C6409h(bVar);
                C6274e eVar = new C6274e("http://gcm.e-droid.net/enviar_mensaje.php");
                C6370g gVar = new C6370g(C6367d.BROWSER_COMPATIBLE);
                gVar.mo22648a("v", (C6360c) new C6363f("4"));
                gVar.mo22648a("idapp", (C6360c) new C6363f("718963"));
                StringBuilder sb = new StringBuilder();
                sb.append(t_chat.this.f20384ab);
                sb.append("");
                gVar.mo22648a("idusu", (C6360c) new C6363f(sb.toString()));
                gVar.mo22648a("c", (C6360c) new C6363f(t_chat.this.f20374S));
                StringBuilder sb2 = new StringBuilder();
                sb2.append(t_chat.this.f20389ag);
                sb2.append("");
                gVar.mo22648a("idtema", (C6360c) new C6363f(sb2.toString()));
                gVar.mo22648a("idusudest", (C6360c) new C6363f(t_chat.this.f20400ar.getString("idprivado", "0")));
                StringBuilder sb3 = new StringBuilder();
                sb3.append(t_chat.this.f20426v);
                sb3.append("");
                gVar.mo22648a("externo", (C6360c) new C6363f(sb3.toString()));
                gVar.mo22648a("m", (C6360c) new C6363f(URLEncoder.encode(this.f20488a, C2793C.UTF8_NAME)));
                eVar.mo22444a(gVar);
                eVar.mo22909b("User-Agent", "Android Vinebre Software");
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(hVar.mo22459a((C6276g) eVar).mo22939b().mo22473f(), C2793C.UTF8_NAME));
                StringBuilder sb4 = new StringBuilder();
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        return sb4.toString();
                    }
                    sb4.append(readLine);
                }
            } catch (Exception unused) {
                return "ANDROID:KO";
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void onPostExecute(String str) {
            Builder builder = new Builder(t_chat.this);
            try {
                t_chat.this.f20369N.setVisibility(8);
                if (t_chat.this.f20419o || VERSION.SDK_INT <= 12) {
                    ((TextView) t_chat.this.findViewById(R.id.c_mensaje)).setTextColor(-16777216);
                } else {
                    ((TextView) t_chat.this.findViewById(R.id.c_mensaje)).setTextColor(-1);
                }
            } catch (Exception unused) {
            }
            if (str.indexOf("ANDROID:OK IDFRASE:") != -1 || str.indexOf("ANDROID:KO") != -1) {
                if (str.indexOf("ANDROID:OK IDFRASE:") != -1) {
                    ((EditText) t_chat.this.findViewById(R.id.c_mensaje)).setText("");
                    int indexOf = str.indexOf("ANDROID:OK IDFRASE:") + 19;
                    int indexOf2 = str.indexOf("@", indexOf);
                    Editor edit = t_chat.this.f20400ar.edit();
                    StringBuilder sb = new StringBuilder();
                    sb.append(t_chat.this.f20384ab);
                    sb.append("");
                    edit.putString("f2_id", sb.toString());
                    edit.putString("f2_frase", this.f20488a);
                    edit.putString("f2_fcrea", new SimpleDateFormat("ddMMyyHHmm").format(new Date()));
                    edit.putString("f2_b64", "");
                    edit.putString("f2_idfrase", str.substring(indexOf, indexOf2));
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(t_chat.this.f20389ag);
                    sb2.append("");
                    edit.putString("f2_idtema", sb2.toString());
                    edit.putString("f2_vfoto", "0");
                    edit.putBoolean("f2_ultimas", false);
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(System.currentTimeMillis());
                    sb3.append("");
                    edit.putString("f2_ts", sb3.toString());
                    edit.commit();
                } else if (str.indexOf("ANDROID:KO MOTIVO:NOGCM") != -1) {
                    final AlertDialog create = builder.setCancelable(false).setPositiveButton(t_chat.this.getString(R.string.aceptar), null).setMessage(R.string.nogcm).create();
                    if (!t_chat.this.f20380Y.equals("")) {
                        create.setOnShowListener(new OnShowListener() {
                            public void onShow(DialogInterface dialogInterface) {
                                Button button = create.getButton(-1);
                                StringBuilder sb = new StringBuilder();
                                sb.append("#");
                                sb.append(t_chat.this.f20380Y);
                                button.setTextColor(Color.parseColor(sb.toString()));
                            }
                        });
                    }
                    create.show();
                    try {
                        ((TextView) create.findViewById(16908299)).setTypeface(Typeface.MONOSPACE);
                    } catch (Exception unused2) {
                    }
                } else if ((str.indexOf("ANDROID:KO MOTIVO:ABANDONADO") == -1 || t_chat.this.f20400ar.getString("idprivado", "0").equals("0")) && str.indexOf("ANDROID:KO MOTIVO:NOADMITE") != -1 && !t_chat.this.f20400ar.getString("idprivado", "0").equals("0")) {
                    final AlertDialog create2 = builder.setCancelable(false).setPositiveButton(t_chat.this.getString(R.string.aceptar), null).setMessage(R.string.noadmiteprivados).create();
                    if (!t_chat.this.f20380Y.equals("")) {
                        create2.setOnShowListener(new OnShowListener() {
                            public void onShow(DialogInterface dialogInterface) {
                                Button button = create2.getButton(-1);
                                StringBuilder sb = new StringBuilder();
                                sb.append("#");
                                sb.append(t_chat.this.f20380Y);
                                button.setTextColor(Color.parseColor(sb.toString()));
                            }
                        });
                    }
                    create2.show();
                    ((TextView) create2.findViewById(16908299)).setTypeface(Typeface.MONOSPACE);
                }
            }
        }
    }

    /* renamed from: mega.boicot.t_chat$g */
    private class C6166g extends AsyncTask<String, Void, String> {

        /* renamed from: a */
        int f20494a;

        public C6166g(int i) {
            this.f20494a = i;
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
            if (!t_chat.this.f20428x) {
                Drawable drawable = t_chat.this.getResources().getDrawable(R.drawable.notif_blanco);
                drawable.setColorFilter(t_chat.this.f20414j, Mode.MULTIPLY);
                t_chat.this.f20416l.setImageDrawable(drawable);
                t_chat.this.f20428x = true;
                Editor edit = t_chat.this.f20400ar.edit();
                StringBuilder sb = new StringBuilder();
                sb.append("notif");
                sb.append(t_chat.this.f20388af);
                edit.putBoolean(sb.toString(), true);
                edit.commit();
                C5644f fVar = new C5644f(t_chat.this.f20384ab, t_chat.this.f20374S, t_chat.this.f20388af, "notif", 1);
                fVar.execute(new String[0]);
            }
            if (t_chat.this.f20400ar.getString("idprivado", "0").equals("0")) {
                t_chat.this.f20402at.mo20789h(t_chat.this);
            }
            Editor edit2 = t_chat.this.f20400ar.edit();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(t_chat.this.f20384ab);
            sb2.append("");
            edit2.putString("f2_id", sb2.toString());
            StringBuilder sb3 = new StringBuilder();
            sb3.append("@@idfoto_temp:");
            sb3.append(this.f20494a);
            sb3.append("@@");
            edit2.putString("f2_frase", sb3.toString());
            edit2.putString("f2_fcrea", new SimpleDateFormat("ddMMyyHHmm").format(new Date()));
            edit2.putString("f2_b64", "");
            edit2.putString("f2_idfrase", "");
            StringBuilder sb4 = new StringBuilder();
            sb4.append(t_chat.this.f20389ag);
            sb4.append("");
            edit2.putString("f2_idtema", sb4.toString());
            edit2.putString("f2_vfoto", "0");
            edit2.putString("f2_tipo", "0");
            edit2.putBoolean("f2_ultimas", false);
            StringBuilder sb5 = new StringBuilder();
            sb5.append(System.currentTimeMillis());
            sb5.append("");
            edit2.putString("f2_ts", sb5.toString());
            edit2.commit();
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public String doInBackground(String... strArr) {
            try {
                C6529b bVar = new C6529b();
                C6530c.m25865c(bVar, 10000);
                C6530c.m25861a((C6531d) bVar, 60000);
                C6409h hVar = new C6409h(bVar);
                StringBuilder sb = new StringBuilder();
                sb.append("http://");
                sb.append(config.f17839g);
                sb.append("/srv/enviar_foto.php");
                C6274e eVar = new C6274e(sb.toString());
                C6370g gVar = new C6370g(C6367d.BROWSER_COMPATIBLE);
                Bitmap bitmap = Media.getBitmap(t_chat.this.getContentResolver(), Uri.fromFile(t_chat.this.f20402at.mo20757a((Context) t_chat.this, this.f20494a)));
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                bitmap.compress(CompressFormat.JPEG, 100, byteArrayOutputStream);
                gVar.mo22648a("foto", (C6360c) new C6359b(byteArrayOutputStream.toByteArray(), "temporal.jpg"));
                gVar.mo22648a("v", (C6360c) new C6363f("2"));
                StringBuilder sb2 = new StringBuilder();
                sb2.append(t_chat.this.f20384ab);
                sb2.append("");
                gVar.mo22648a("idusu", (C6360c) new C6363f(sb2.toString()));
                gVar.mo22648a("c", (C6360c) new C6363f(t_chat.this.f20374S));
                StringBuilder sb3 = new StringBuilder();
                sb3.append(t_chat.this.f20389ag);
                sb3.append("");
                gVar.mo22648a("idtema", (C6360c) new C6363f(sb3.toString()));
                gVar.mo22648a("idusudest", (C6360c) new C6363f(t_chat.this.f20400ar.getString("idprivado", "0")));
                StringBuilder sb4 = new StringBuilder();
                sb4.append(t_chat.this.f20426v);
                sb4.append("");
                gVar.mo22648a("externo", (C6360c) new C6363f(sb4.toString()));
                eVar.mo22444a(gVar);
                eVar.mo22909b("User-Agent", "Android Vinebre Software");
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(hVar.mo22459a((C6276g) eVar).mo22939b().mo22473f(), C2793C.UTF8_NAME));
                StringBuilder sb5 = new StringBuilder();
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        return sb5.toString();
                    }
                    sb5.append(readLine);
                }
            } catch (Exception e) {
                e.printStackTrace();
                return "ANDROID:KO";
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void onPostExecute(String str) {
            Builder builder = new Builder(t_chat.this);
            try {
                LinearLayout linearLayout = t_chat.this.f20368M;
                StringBuilder sb = new StringBuilder();
                sb.append(this.f20494a);
                sb.append("");
                linearLayout.findViewWithTag(sb.toString()).setVisibility(8);
                LinearLayout linearLayout2 = t_chat.this.f20368M;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(this.f20494a);
                sb2.append("");
                linearLayout2.findViewWithTag(sb2.toString()).setTag(null);
            } catch (Exception unused) {
            }
            if (str.indexOf("ANDROID:OK IDFRASE:") != -1 || str.indexOf("ANDROID:KO") != -1) {
                if (str.indexOf("ANDROID:OK IDFRASE:") != -1) {
                    int indexOf = str.indexOf("ANDROID:OK IDFRASE:") + 19;
                    int indexOf2 = str.indexOf("@", indexOf);
                    t_chat.this.f20402at.mo20757a((Context) t_chat.this, this.f20494a).renameTo(t_chat.this.f20402at.mo20758a((Context) t_chat.this, Integer.parseInt(str.substring(indexOf, indexOf2)), false));
                    try {
                        LinearLayout linearLayout3 = t_chat.this.f20368M;
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("imgtemp");
                        sb3.append(this.f20494a);
                        View findViewWithTag = linearLayout3.findViewWithTag(sb3.toString());
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("img");
                        sb4.append(str.substring(indexOf, indexOf2));
                        findViewWithTag.setTag(sb4.toString());
                        LinearLayout linearLayout4 = t_chat.this.f20368M;
                        StringBuilder sb5 = new StringBuilder();
                        sb5.append("img");
                        sb5.append(str.substring(indexOf, indexOf2));
                        linearLayout4.findViewWithTag(sb5.toString()).setOnClickListener(t_chat.this);
                    } catch (Exception unused2) {
                    }
                } else if (str.indexOf("ANDROID:KO MOTIVO:NOGCM") != -1) {
                    final AlertDialog create = builder.setCancelable(false).setPositiveButton(t_chat.this.getString(R.string.aceptar), null).setMessage(R.string.nogcm).create();
                    if (!t_chat.this.f20380Y.equals("")) {
                        create.setOnShowListener(new OnShowListener() {
                            public void onShow(DialogInterface dialogInterface) {
                                Button button = create.getButton(-1);
                                StringBuilder sb = new StringBuilder();
                                sb.append("#");
                                sb.append(t_chat.this.f20380Y);
                                button.setTextColor(Color.parseColor(sb.toString()));
                            }
                        });
                    }
                    create.show();
                    ((TextView) create.findViewById(16908299)).setTypeface(Typeface.MONOSPACE);
                } else if ((str.indexOf("ANDROID:KO MOTIVO:ABANDONADO") == -1 || t_chat.this.f20400ar.getString("idprivado", "0").equals("0")) && str.indexOf("ANDROID:KO MOTIVO:NOADMITE") != -1 && !t_chat.this.f20400ar.getString("idprivado", "0").equals("0")) {
                    final AlertDialog create2 = builder.setCancelable(false).setPositiveButton(t_chat.this.getString(R.string.aceptar), null).setMessage(R.string.noadmiteprivados).create();
                    if (!t_chat.this.f20380Y.equals("")) {
                        create2.setOnShowListener(new OnShowListener() {
                            public void onShow(DialogInterface dialogInterface) {
                                Button button = create2.getButton(-1);
                                StringBuilder sb = new StringBuilder();
                                sb.append("#");
                                sb.append(t_chat.this.f20380Y);
                                button.setTextColor(Color.parseColor(sb.toString()));
                            }
                        });
                    }
                    create2.show();
                    ((TextView) create2.findViewById(16908299)).setTypeface(Typeface.MONOSPACE);
                }
            }
        }
    }

    /* renamed from: mega.boicot.t_chat$h */
    private class C6169h extends AsyncTask<String, Void, String> {

        /* renamed from: a */
        int f20500a;

        /* renamed from: b */
        String f20501b;

        /* renamed from: c */
        String f20502c;

        public C6169h(int i, String str, String str2) {
            this.f20500a = i;
            this.f20501b = str;
            this.f20502c = str2;
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
            sb.append("/srv/enviar_video.php");
            C6274e eVar = new C6274e(sb.toString());
            C6370g gVar = new C6370g();
            try {
                bitmap = Media.getBitmap(t_chat.this.getContentResolver(), Uri.fromFile(t_chat.this.f20402at.mo20757a((Context) t_chat.this, this.f20500a)));
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
            try {
                gVar.mo22648a("v", (C6360c) new C6363f("2"));
                StringBuilder sb2 = new StringBuilder();
                sb2.append(t_chat.this.f20384ab);
                sb2.append("");
                gVar.mo22648a("idusu", (C6360c) new C6363f(sb2.toString()));
                gVar.mo22648a("c", (C6360c) new C6363f(t_chat.this.f20374S));
                gVar.mo22648a("idvideo", (C6360c) new C6363f(this.f20501b));
                gVar.mo22648a("formato", (C6360c) new C6363f(this.f20502c));
                StringBuilder sb3 = new StringBuilder();
                sb3.append(t_chat.this.f20389ag);
                sb3.append("");
                gVar.mo22648a("idtema", (C6360c) new C6363f(sb3.toString()));
                gVar.mo22648a("idusudest", (C6360c) new C6363f(t_chat.this.f20400ar.getString("idprivado", "0")));
                StringBuilder sb4 = new StringBuilder();
                sb4.append(t_chat.this.f20426v);
                sb4.append("");
                gVar.mo22648a("externo", (C6360c) new C6363f(sb4.toString()));
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
            Builder builder = new Builder(t_chat.this);
            try {
                LinearLayout linearLayout = t_chat.this.f20368M;
                StringBuilder sb = new StringBuilder();
                sb.append(this.f20500a);
                sb.append("");
                linearLayout.findViewWithTag(sb.toString()).setVisibility(8);
                LinearLayout linearLayout2 = t_chat.this.f20368M;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(this.f20500a);
                sb2.append("");
                linearLayout2.findViewWithTag(sb2.toString()).setTag(null);
            } catch (Exception unused) {
            }
            if (str.indexOf("ANDROID:OK IDFRASE:") != -1 || str.indexOf("ANDROID:KO") != -1) {
                if (str.indexOf("ANDROID:OK IDFRASE:") != -1) {
                    int indexOf = str.indexOf("ANDROID:OK IDFRASE:") + 19;
                    int indexOf2 = str.indexOf("@", indexOf);
                    t_chat.this.f20402at.mo20757a((Context) t_chat.this, this.f20500a).renameTo(t_chat.this.f20402at.mo20758a((Context) t_chat.this, Integer.parseInt(str.substring(indexOf, indexOf2)), false));
                    try {
                        LinearLayout linearLayout3 = t_chat.this.f20368M;
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("imgtemp");
                        sb3.append(this.f20500a);
                        View findViewWithTag = linearLayout3.findViewWithTag(sb3.toString());
                        findViewWithTag.setTag(R.id.idaux2, this.f20501b);
                        findViewWithTag.setTag(R.id.idaux3, this.f20502c);
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("img");
                        sb4.append(str.substring(indexOf, indexOf2));
                        findViewWithTag.setTag(sb4.toString());
                        LinearLayout linearLayout4 = t_chat.this.f20368M;
                        StringBuilder sb5 = new StringBuilder();
                        sb5.append("img");
                        sb5.append(str.substring(indexOf, indexOf2));
                        linearLayout4.findViewWithTag(sb5.toString()).setOnClickListener(t_chat.this);
                    } catch (Exception unused2) {
                    }
                } else if (str.indexOf("ANDROID:KO MOTIVO:NOGCM") != -1) {
                    final AlertDialog create = builder.setCancelable(false).setPositiveButton(t_chat.this.getString(R.string.aceptar), null).setMessage(R.string.nogcm).create();
                    if (!t_chat.this.f20380Y.equals("")) {
                        create.setOnShowListener(new OnShowListener() {
                            public void onShow(DialogInterface dialogInterface) {
                                Button button = create.getButton(-1);
                                StringBuilder sb = new StringBuilder();
                                sb.append("#");
                                sb.append(t_chat.this.f20380Y);
                                button.setTextColor(Color.parseColor(sb.toString()));
                            }
                        });
                    }
                    create.show();
                    ((TextView) create.findViewById(16908299)).setTypeface(Typeface.MONOSPACE);
                } else if ((str.indexOf("ANDROID:KO MOTIVO:ABANDONADO") == -1 || t_chat.this.f20400ar.getString("idprivado", "0").equals("0")) && str.indexOf("ANDROID:KO MOTIVO:NOADMITE") != -1 && !t_chat.this.f20400ar.getString("idprivado", "0").equals("0")) {
                    final AlertDialog create2 = builder.setCancelable(false).setPositiveButton(t_chat.this.getString(R.string.aceptar), null).setMessage(R.string.noadmiteprivados).create();
                    if (!t_chat.this.f20380Y.equals("")) {
                        create2.setOnShowListener(new OnShowListener() {
                            public void onShow(DialogInterface dialogInterface) {
                                Button button = create2.getButton(-1);
                                StringBuilder sb = new StringBuilder();
                                sb.append("#");
                                sb.append(t_chat.this.f20380Y);
                                button.setTextColor(Color.parseColor(sb.toString()));
                            }
                        });
                    }
                    create2.show();
                    ((TextView) create2.findViewById(16908299)).setTypeface(Typeface.MONOSPACE);
                }
            }
        }
    }

    /* renamed from: mega.boicot.t_chat$i */
    private class C6172i extends AsyncTask<String, Void, String> {

        /* renamed from: a */
        String f20508a;

        /* renamed from: b */
        int f20509b;

        public C6172i(int i, String str) {
            this.f20508a = str;
            this.f20509b = i;
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
            if (!t_chat.this.f20428x) {
                Drawable drawable = t_chat.this.getResources().getDrawable(R.drawable.notif_blanco);
                drawable.setColorFilter(t_chat.this.f20414j, Mode.MULTIPLY);
                t_chat.this.f20416l.setImageDrawable(drawable);
                t_chat.this.f20428x = true;
                Editor edit = t_chat.this.f20400ar.edit();
                StringBuilder sb = new StringBuilder();
                sb.append("notif");
                sb.append(t_chat.this.f20388af);
                edit.putBoolean(sb.toString(), true);
                edit.commit();
                C5644f fVar = new C5644f(t_chat.this.f20384ab, t_chat.this.f20374S, t_chat.this.f20388af, "notif", 1);
                fVar.execute(new String[0]);
            }
            if (t_chat.this.f20400ar.getString("idprivado", "0").equals("0")) {
                t_chat.this.f20402at.mo20789h(t_chat.this);
            }
            Editor edit2 = t_chat.this.f20400ar.edit();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(t_chat.this.f20384ab);
            sb2.append("");
            edit2.putString("f2_id", sb2.toString());
            StringBuilder sb3 = new StringBuilder();
            sb3.append("@@idfoto_temp:");
            sb3.append(this.f20509b);
            sb3.append("@@");
            edit2.putString("f2_frase", sb3.toString());
            edit2.putString("f2_fcrea", new SimpleDateFormat("ddMMyyHHmm").format(new Date()));
            edit2.putString("f2_b64", "");
            edit2.putString("f2_idfrase", "");
            StringBuilder sb4 = new StringBuilder();
            sb4.append(t_chat.this.f20389ag);
            sb4.append("");
            edit2.putString("f2_idtema", sb4.toString());
            edit2.putString("f2_vfoto", "0");
            edit2.putString("f2_tipo", "1");
            edit2.putString("f2_idvideo", "");
            edit2.putString("f2_formato", "");
            edit2.putBoolean("f2_ultimas", false);
            StringBuilder sb5 = new StringBuilder();
            sb5.append(System.currentTimeMillis());
            sb5.append("");
            edit2.putString("f2_ts", sb5.toString());
            edit2.commit();
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public String doInBackground(String... strArr) {
            C6409h hVar = new C6409h();
            C6274e eVar = new C6274e("http://video-upload.e-droid.net/upload.php");
            C6362e eVar2 = new C6362e(new File(this.f20508a));
            C6370g gVar = new C6370g();
            gVar.mo22648a("videoFile", (C6360c) eVar2);
            String str = "idusu";
            try {
                StringBuilder sb = new StringBuilder();
                sb.append(t_chat.this.f20384ab);
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
        /* renamed from: a */
        public void onPostExecute(String str) {
            String str2;
            int indexOf = str.indexOf("ANDROID:OK:-");
            if (indexOf != -1) {
                int i = indexOf + 12;
                int indexOf2 = str.indexOf("-", i + 1);
                String substring = str.substring(i, indexOf2);
                int i2 = indexOf2 + 1;
                String substring2 = str.substring(i2, str.indexOf("-", i2));
                if (substring2.equals("1")) {
                    str2 = "mp4";
                } else if (substring2.equals("2")) {
                    str2 = "3gp";
                } else if (substring2.equals("3")) {
                    str2 = "webm";
                } else {
                    return;
                }
                try {
                    FileInputStream fileInputStream = new FileInputStream(this.f20508a);
                    config a = t_chat.this.f20402at;
                    t_chat t_chat = t_chat.this;
                    StringBuilder sb = new StringBuilder();
                    sb.append("v");
                    sb.append(substring);
                    sb.append(".");
                    sb.append(str2);
                    String absolutePath = a.mo20759a((Context) t_chat, sb.toString()).getAbsolutePath();
                    FileOutputStream fileOutputStream = new FileOutputStream(absolutePath);
                    byte[] bArr = new byte[C1245d.f3947iP];
                    while (true) {
                        int read = fileInputStream.read(bArr);
                        if (read == -1) {
                            break;
                        }
                        fileOutputStream.write(bArr, 0, read);
                    }
                    fileInputStream.close();
                    fileOutputStream.flush();
                    fileOutputStream.close();
                    this.f20508a = absolutePath;
                } catch (Exception e) {
                    e.printStackTrace();
                }
                new C6169h(this.f20509b, substring, substring2).execute(new String[0]);
            }
        }
    }

    /* renamed from: mega.boicot.t_chat$j */
    private class C6173j extends AsyncTask<String, Void, Byte> {

        /* renamed from: a */
        String f20511a;

        private C6173j() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Byte doInBackground(String... strArr) {
            this.f20511a = strArr[0];
            try {
                C6529b bVar = new C6529b();
                C6530c.m25865c(bVar, 10000);
                C6530c.m25861a((C6531d) bVar, 20000);
                C6409h hVar = new C6409h(bVar);
                StringBuilder sb = new StringBuilder();
                sb.append("http://");
                sb.append(config.f17839g);
                sb.append("/srv/fondo_guardado.php");
                C6274e eVar = new C6274e(sb.toString());
                C6370g gVar = new C6370g(C6367d.BROWSER_COMPATIBLE);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(t_chat.this.f20384ab);
                sb2.append("");
                gVar.mo22648a("idusu", (C6360c) new C6363f(sb2.toString()));
                gVar.mo22648a("c", (C6360c) new C6363f(t_chat.this.f20374S));
                StringBuilder sb3 = new StringBuilder();
                sb3.append(this.f20511a);
                sb3.append("");
                gVar.mo22648a("idfoto", (C6360c) new C6363f(sb3.toString()));
                eVar.mo22444a(gVar);
                eVar.mo22909b("User-Agent", "Android Vinebre Software");
                hVar.mo22459a((C6276g) eVar);
                return Byte.valueOf(0);
            } catch (Exception unused) {
                return Byte.valueOf(-1);
            }
        }
    }

    /* renamed from: mega.boicot.t_chat$k */
    private class C6174k extends AsyncTask<String, Void, String> {

        /* renamed from: a */
        String f20513a;

        /* renamed from: b */
        String f20514b;

        /* renamed from: c */
        Bitmap f20515c;

        private C6174k() {
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
            if (t_chat.this.f20360E.equals("")) {
                cancel(false);
                return;
            }
            try {
                this.f20513a = (String) t_chat.this.f20360E.keySet().toArray()[0];
            } catch (Exception unused) {
                cancel(false);
            }
            if (this.f20513a != null) {
                this.f20514b = (String) t_chat.this.f20360E.get(this.f20513a);
                t_chat.this.f20361F.put(this.f20513a, t_chat.this.f20360E.get(this.f20513a));
                t_chat.this.f20360E.remove(this.f20513a);
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public String doInBackground(String... strArr) {
            if (this.f20513a == null || this.f20514b == null) {
                return "0";
            }
            try {
                StringBuilder sb = new StringBuilder();
                sb.append("http://imgs1.e-droid.net/srv/imgs/usus/");
                sb.append(this.f20513a);
                sb.append("_1_p.jpg?v=");
                sb.append(this.f20514b);
                try {
                    HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(sb.toString()).openConnection();
                    httpURLConnection.setDoInput(true);
                    httpURLConnection.setConnectTimeout(10000);
                    httpURLConnection.setReadTimeout(20000);
                    httpURLConnection.connect();
                    InputStream inputStream = httpURLConnection.getInputStream();
                    this.f20515c = BitmapFactory.decodeStream(inputStream);
                    inputStream.close();
                    httpURLConnection.disconnect();
                    File file = t_chat.this.f20362G;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("fperfil_");
                    sb2.append(this.f20513a);
                    sb2.append(".jpg");
                    try {
                        this.f20515c.compress(CompressFormat.JPEG, 70, new FileOutputStream(new File(file, sb2.toString())));
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
            if (t_chat.this.f20359D != null) {
                if (str == "1") {
                    t_chat.this.f20359D.put(this.f20513a, this.f20515c);
                    Editor edit = t_chat.this.f20400ar.edit();
                    StringBuilder sb = new StringBuilder();
                    sb.append("fperfil_");
                    sb.append(this.f20513a);
                    edit.putString(sb.toString(), (String) t_chat.this.f20361F.get(this.f20513a));
                    edit.commit();
                }
                int childCount = t_chat.this.f20368M.getChildCount();
                int i = 0;
                while (i < childCount) {
                    try {
                        String str2 = (String) t_chat.this.f20368M.getChildAt(i).getTag();
                        if (str2 != null && str2.equals(this.f20513a)) {
                            t_chat.this.f20368M.getChildAt(i).findViewById(R.id.pb_foto).setVisibility(8);
                            t_chat.this.f20368M.getChildAt(i).findViewById(R.id.pb_foto_inv).setVisibility(8);
                            if (str == "1") {
                                ((ImageView) t_chat.this.f20368M.getChildAt(i).findViewById(R.id.iv_avatar_f)).setImageBitmap(this.f20515c);
                            }
                        }
                        i++;
                    } catch (Exception unused) {
                    }
                }
                if (!t_chat.this.f20360E.equals("")) {
                    t_chat.this.f20363H = new C6174k();
                    t_chat.this.f20363H.execute(new String[0]);
                }
            }
        }
    }

    /* renamed from: mega.boicot.t_chat$l */
    private class C6175l extends AsyncTask<String, Void, String> {

        /* renamed from: a */
        String f20517a;

        /* renamed from: b */
        String f20518b;

        /* renamed from: c */
        String f20519c;

        /* renamed from: d */
        String f20520d;

        /* renamed from: e */
        Bitmap f20521e;

        private C6175l() {
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
            if (t_chat.this.f20378W.equals("")) {
                cancel(false);
                return;
            }
            int indexOf = t_chat.this.f20378W.indexOf(",");
            if (indexOf == -1) {
                cancel(false);
                return;
            }
            int i = indexOf + 1;
            int indexOf2 = t_chat.this.f20378W.indexOf(",", i);
            if (indexOf2 == -1) {
                cancel(false);
                return;
            }
            this.f20517a = t_chat.this.f20378W.substring(i, indexOf2);
            if (this.f20517a.equals("")) {
                cancel(false);
                return;
            }
            String[] split = this.f20517a.split("@");
            if ((!split[1].equals("0") || split.length == 2) && (!split[1].equals("1") || split.length == 4)) {
                this.f20517a = split[0];
                this.f20518b = split[1];
                if (this.f20518b.equals("1")) {
                    this.f20519c = split[2];
                    this.f20520d = split[3];
                    return;
                }
                return;
            }
            cancel(false);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public String doInBackground(String... strArr) {
            if (this.f20517a == null || this.f20517a.equals("")) {
                return "0";
            }
            URL url = null;
            try {
                if (this.f20518b.equals("0")) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("http://imgs1.e-droid.net/srv/imgs/frases/f");
                    sb.append(this.f20517a);
                    sb.append("_p.jpg");
                    url = new URL(sb.toString());
                } else if (this.f20518b.equals("1")) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("http://imgs1.e-droid.net/srv/imgs/videos/v");
                    sb2.append(this.f20519c);
                    sb2.append("_");
                    sb2.append(this.f20520d);
                    sb2.append("_th.jpg");
                    url = new URL(sb2.toString());
                }
                try {
                    HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                    httpURLConnection.setDoInput(true);
                    httpURLConnection.setConnectTimeout(10000);
                    httpURLConnection.setReadTimeout(20000);
                    httpURLConnection.connect();
                    InputStream inputStream = httpURLConnection.getInputStream();
                    this.f20521e = BitmapFactory.decodeStream(inputStream);
                    inputStream.close();
                    httpURLConnection.disconnect();
                    try {
                        this.f20521e.compress(CompressFormat.JPEG, 100, new FileOutputStream(t_chat.this.f20402at.mo20758a((Context) t_chat.this, Integer.parseInt(this.f20517a), false)));
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
            if (t_chat.this.f20378W != null) {
                if (this.f20518b.equals("0")) {
                    t_chat t_chat = t_chat.this;
                    String r = t_chat.this.f20378W;
                    StringBuilder sb = new StringBuilder();
                    sb.append(",");
                    sb.append(this.f20517a);
                    sb.append("@");
                    sb.append(this.f20518b);
                    sb.append(",");
                    t_chat.f20378W = r.replace(sb.toString(), "");
                } else if (this.f20518b.equals("1")) {
                    t_chat t_chat2 = t_chat.this;
                    String r2 = t_chat.this.f20378W;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(",");
                    sb2.append(this.f20517a);
                    sb2.append("@");
                    sb2.append(this.f20518b);
                    sb2.append("@");
                    sb2.append(this.f20519c);
                    sb2.append("@");
                    sb2.append(this.f20520d);
                    sb2.append(",");
                    t_chat2.f20378W = r2.replace(sb2.toString(), "");
                }
                try {
                    LinearLayout linearLayout = t_chat.this.f20368M;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("pb");
                    sb3.append(this.f20517a);
                    linearLayout.findViewWithTag(sb3.toString()).setVisibility(8);
                } catch (Exception unused) {
                }
                t_chat t_chat3 = t_chat.this;
                int parseInt = Integer.parseInt(this.f20517a);
                LinearLayout linearLayout2 = t_chat.this.f20368M;
                StringBuilder sb4 = new StringBuilder();
                sb4.append("img");
                sb4.append(this.f20517a);
                t_chat3.m24632a(parseInt, false, (ImageView) linearLayout2.findViewWithTag(sb4.toString()));
                try {
                    LinearLayout linearLayout3 = t_chat.this.f20368M;
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append("img");
                    sb5.append(this.f20517a);
                    linearLayout3.findViewWithTag(sb5.toString()).setOnClickListener(t_chat.this);
                } catch (Exception unused2) {
                }
                if (!t_chat.this.f20378W.equals("")) {
                    t_chat.this.f20364I = new C6175l();
                    t_chat.this.f20364I.execute(new String[0]);
                }
            }
        }
    }

    /* renamed from: mega.boicot.t_chat$m */
    private class C6176m extends AsyncTask<String, Void, String> {

        /* renamed from: a */
        String f20523a;

        /* renamed from: b */
        Bitmap f20524b;

        public C6176m(String str) {
            this.f20523a = str;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public String doInBackground(String... strArr) {
            try {
                StringBuilder sb = new StringBuilder();
                sb.append("http://imgs1.e-droid.net/srv/imgs/frases/f");
                sb.append(this.f20523a);
                sb.append(".jpg");
                try {
                    HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(sb.toString()).openConnection();
                    httpURLConnection.setDoInput(true);
                    httpURLConnection.setConnectTimeout(10000);
                    httpURLConnection.setReadTimeout(60000);
                    httpURLConnection.connect();
                    InputStream inputStream = httpURLConnection.getInputStream();
                    this.f20524b = BitmapFactory.decodeStream(inputStream);
                    inputStream.close();
                    httpURLConnection.disconnect();
                    try {
                        this.f20524b.compress(CompressFormat.JPEG, 100, new FileOutputStream(t_chat.this.f20402at.mo20758a((Context) t_chat.this, Integer.parseInt(this.f20523a), true)));
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
            try {
                LinearLayout linearLayout = t_chat.this.f20368M;
                StringBuilder sb = new StringBuilder();
                sb.append("pb");
                sb.append(this.f20523a);
                linearLayout.findViewWithTag(sb.toString()).setVisibility(8);
            } catch (Exception unused) {
            }
            Intent intent = new Intent(t_chat.this, t_url.class);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("file://");
            sb2.append(t_chat.this.f20402at.mo20758a((Context) t_chat.this, Integer.parseInt(this.f20523a), true).getAbsolutePath());
            intent.putExtra("url", sb2.toString());
            t_chat.this.startActivityForResult(intent, 0);
        }
    }

    /* renamed from: mega.boicot.t_chat$n */
    private class C6177n extends AsyncTask<String, Void, String> {

        /* renamed from: a */
        String f20526a;

        /* renamed from: b */
        String f20527b;

        /* renamed from: c */
        String f20528c = "";

        /* renamed from: d */
        String f20529d;

        public C6177n(String str, String str2, String str3, String str4) {
            this.f20526a = str;
            this.f20527b = str2;
            if (str3.equals("1")) {
                this.f20528c = "mp4";
            } else if (str3.equals("2")) {
                this.f20528c = "3gp";
            } else if (str3.equals("3")) {
                this.f20528c = "webm";
            }
            this.f20529d = str4;
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
            if (this.f20528c.equals("")) {
                cancel(false);
            }
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Removed duplicated region for block: B:35:0x00ad  */
        /* JADX WARNING: Removed duplicated region for block: B:37:0x00b0  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.String doInBackground(java.lang.String... r9) {
            /*
                r8 = this;
                java.net.URL r9 = new java.net.URL     // Catch:{ MalformedURLException -> 0x00b3 }
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ MalformedURLException -> 0x00b3 }
                r0.<init>()     // Catch:{ MalformedURLException -> 0x00b3 }
                java.lang.String r1 = "http://video.e-droid.net/files/v"
                r0.append(r1)     // Catch:{ MalformedURLException -> 0x00b3 }
                java.lang.String r1 = r8.f20527b     // Catch:{ MalformedURLException -> 0x00b3 }
                r0.append(r1)     // Catch:{ MalformedURLException -> 0x00b3 }
                java.lang.String r1 = "_"
                r0.append(r1)     // Catch:{ MalformedURLException -> 0x00b3 }
                java.lang.String r1 = r8.f20529d     // Catch:{ MalformedURLException -> 0x00b3 }
                r0.append(r1)     // Catch:{ MalformedURLException -> 0x00b3 }
                java.lang.String r1 = "."
                r0.append(r1)     // Catch:{ MalformedURLException -> 0x00b3 }
                java.lang.String r1 = r8.f20528c     // Catch:{ MalformedURLException -> 0x00b3 }
                r0.append(r1)     // Catch:{ MalformedURLException -> 0x00b3 }
                java.lang.String r0 = r0.toString()     // Catch:{ MalformedURLException -> 0x00b3 }
                r9.<init>(r0)     // Catch:{ MalformedURLException -> 0x00b3 }
                r0 = 0
                java.net.URLConnection r9 = r9.openConnection()     // Catch:{ Exception -> 0x00ab }
                java.net.HttpURLConnection r9 = (java.net.HttpURLConnection) r9     // Catch:{ Exception -> 0x00ab }
                r1 = 1
                r9.setDoInput(r1)     // Catch:{ Exception -> 0x00ab }
                r2 = 10000(0x2710, float:1.4013E-41)
                r9.setConnectTimeout(r2)     // Catch:{ Exception -> 0x00ab }
                r2 = 60000(0xea60, float:8.4078E-41)
                r9.setReadTimeout(r2)     // Catch:{ Exception -> 0x00ab }
                r9.connect()     // Catch:{ Exception -> 0x00ab }
                java.io.InputStream r2 = r9.getInputStream()     // Catch:{ Exception -> 0x00ab }
                mega.boicot.t_chat r3 = mega.boicot.t_chat.this     // Catch:{ all -> 0x00a6 }
                mega.boicot.config r3 = r3.f20402at     // Catch:{ all -> 0x00a6 }
                mega.boicot.t_chat r4 = mega.boicot.t_chat.this     // Catch:{ all -> 0x00a6 }
                java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x00a6 }
                r5.<init>()     // Catch:{ all -> 0x00a6 }
                java.lang.String r6 = "v"
                r5.append(r6)     // Catch:{ all -> 0x00a6 }
                java.lang.String r6 = r8.f20527b     // Catch:{ all -> 0x00a6 }
                r5.append(r6)     // Catch:{ all -> 0x00a6 }
                java.lang.String r6 = "."
                r5.append(r6)     // Catch:{ all -> 0x00a6 }
                java.lang.String r6 = r8.f20528c     // Catch:{ all -> 0x00a6 }
                r5.append(r6)     // Catch:{ all -> 0x00a6 }
                java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x00a6 }
                java.io.File r3 = r3.mo20759a(r4, r5)     // Catch:{ all -> 0x00a6 }
                java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch:{ all -> 0x00a6 }
                r4.<init>(r3)     // Catch:{ all -> 0x00a6 }
                r3 = 4096(0x1000, float:5.74E-42)
                byte[] r3 = new byte[r3]     // Catch:{ all -> 0x0096 }
            L_0x007b:
                int r5 = r2.read(r3)     // Catch:{ all -> 0x0096 }
                r6 = -1
                if (r5 == r6) goto L_0x0086
                r4.write(r3, r0, r5)     // Catch:{ all -> 0x0096 }
                goto L_0x007b
            L_0x0086:
                r4.flush()     // Catch:{ all -> 0x0096 }
                r4.close()     // Catch:{ Exception -> 0x0091, all -> 0x008e }
                r0 = r1
                goto L_0x009f
            L_0x008e:
                r9 = move-exception
                r0 = r1
                goto L_0x00a7
            L_0x0091:
                r0 = move-exception
                r7 = r1
                r1 = r0
                r0 = r7
                goto L_0x009c
            L_0x0096:
                r1 = move-exception
                r4.close()     // Catch:{ Exception -> 0x009b }
                throw r1     // Catch:{ Exception -> 0x009b }
            L_0x009b:
                r1 = move-exception
            L_0x009c:
                r1.printStackTrace()     // Catch:{ all -> 0x00a6 }
            L_0x009f:
                r2.close()     // Catch:{ Exception -> 0x00ab }
                r9.disconnect()     // Catch:{ Exception -> 0x00ab }
                goto L_0x00ab
            L_0x00a6:
                r9 = move-exception
            L_0x00a7:
                r2.close()     // Catch:{ Exception -> 0x00ab }
                throw r9     // Catch:{ Exception -> 0x00ab }
            L_0x00ab:
                if (r0 == 0) goto L_0x00b0
                java.lang.String r9 = "1"
                return r9
            L_0x00b0:
                java.lang.String r9 = "0"
                return r9
            L_0x00b3:
                java.lang.String r9 = "0"
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: mega.boicot.t_chat.C6177n.doInBackground(java.lang.String[]):java.lang.String");
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void onPostExecute(String str) {
            try {
                LinearLayout linearLayout = t_chat.this.f20368M;
                StringBuilder sb = new StringBuilder();
                sb.append("pb");
                sb.append(this.f20526a);
                linearLayout.findViewWithTag(sb.toString()).setVisibility(8);
            } catch (Exception unused) {
            }
            Intent intent = new Intent(t_chat.this, t_video.class);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("file://");
            config a = t_chat.this.f20402at;
            t_chat t_chat = t_chat.this;
            StringBuilder sb3 = new StringBuilder();
            sb3.append("v");
            sb3.append(this.f20527b);
            sb3.append(".");
            sb3.append(this.f20528c);
            sb2.append(a.mo20759a((Context) t_chat, sb3.toString()).getAbsolutePath());
            intent.putExtra("url", sb2.toString());
            intent.putExtra("desde_chat", true);
            t_chat.this.startActivityForResult(intent, 0);
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
        String str;
        String str2;
        int i;
        boolean z;
        Bundle bundle2 = bundle;
        this.f20402at = (config) getApplicationContext();
        if (this.f20402at.f17881aN == null) {
            this.f20402at.mo20780b();
        }
        this.f20357B = getIntent().getExtras();
        boolean z2 = true;
        if (bundle2 == null) {
            this.f20430z = this.f20357B != null && this.f20357B.containsKey("es_root") && this.f20357B.getBoolean("es_root", false);
        } else {
            this.f20430z = bundle2.containsKey("es_root") && bundle2.getBoolean("es_root", false);
        }
        this.f20426v = this.f20357B != null && this.f20357B.containsKey("externo");
        this.f20415k = this.f20402at.f17971bz[this.f20402at.f18075l];
        this.f20399aq = this.f20430z && this.f20426v && this.f20357B.containsKey("id_remit");
        if (this.f20426v) {
            this.f20381Z = this.f20357B.getString("c1");
            this.f20383aa = this.f20357B.getString("c2");
        } else {
            this.f20381Z = this.f20415k.f18314g;
            this.f20383aa = this.f20415k.f18315h;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("#");
        sb.append(this.f20381Z);
        this.f20419o = config.m23844a(sb.toString());
        StringBuilder sb2 = new StringBuilder();
        sb2.append("#");
        sb2.append(this.f20383aa);
        this.f20421q = config.m23844a(sb2.toString());
        if (this.f20402at.f17934bO > 0) {
            this.f20420p = true;
            if (!this.f20402at.f17937bR.equals("")) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("#");
                sb3.append(this.f20402at.f17937bR);
                this.f20420p = config.m23844a(sb3.toString());
            }
        } else {
            this.f20420p = this.f20419o;
        }
        this.f20380Y = config.m23831a(this.f20381Z, this.f20402at.f17890aW);
        if (VERSION.SDK_INT > 12 && !this.f20419o) {
            setTheme(R.style.holonolight);
        }
        super.onCreate(bundle);
        if (config.m23853d()) {
            setContentView(R.layout.t_chat);
            mo22081f();
            if (this.f20402at.f18080q > 0) {
                SearchManager searchManager = (SearchManager) getSystemService("search");
                searchManager.setOnCancelListener(new OnCancelListener() {
                    public void onCancel() {
                        t_chat.this.f20418n = false;
                        t_chat.this.setResult(0);
                    }
                });
                searchManager.setOnDismissListener(new OnDismissListener() {
                    public void onDismiss() {
                        t_chat.this.f20411g = false;
                    }
                });
            }
            this.f20402at.mo20770a((Context) this, this.f20357B != null && this.f20357B.containsKey("ad_entrar"), this.f20357B != null && this.f20357B.containsKey("fb_entrar"));
            if (this.f20402at.f18013cx != 0) {
                this.f20382a = getResources().getDisplayMetrics().density;
                final View findViewById = findViewById(R.id.sv_chat);
                findViewById.getViewTreeObserver().addOnGlobalLayoutListener(new OnGlobalLayoutListener() {
                    public void onGlobalLayout() {
                        int height = (int) ((((float) findViewById.getHeight()) - 0.5f) / t_chat.this.f20382a);
                        if (height <= 270 || t_chat.this.f20402at.f18071ep) {
                            if (height <= 213 && t_chat.this.f20402at.f18071ep) {
                                if (t_chat.this.f20402at.f18013cx == 1) {
                                    View findViewWithTag = t_chat.this.findViewById(R.id.ll_princ).findViewWithTag(Integer.valueOf(R.id.TAG_ESBANNER));
                                    if (findViewWithTag != null) {
                                        findViewWithTag.setVisibility(8);
                                        t_chat.this.f20402at.f18071ep = false;
                                    }
                                } else if (t_chat.this.f20402at.f18013cx == 2) {
                                    t_chat.this.findViewById(R.id.ll_ad).setVisibility(8);
                                    t_chat.this.f20402at.f18071ep = false;
                                }
                            }
                        } else if (t_chat.this.f20402at.f18013cx == 1) {
                            View findViewWithTag2 = t_chat.this.findViewById(R.id.ll_princ).findViewWithTag(Integer.valueOf(R.id.TAG_ESBANNER));
                            if (findViewWithTag2 != null) {
                                findViewWithTag2.setVisibility(0);
                                t_chat.this.f20402at.f18071ep = true;
                            }
                        } else if (t_chat.this.f20402at.f18013cx == 2) {
                            t_chat.this.findViewById(R.id.ll_ad).setVisibility(0);
                            t_chat.this.f20402at.f18071ep = true;
                        }
                    }
                });
            }
            this.f20405aw = null;
            if (this.f20402at.f17928bI) {
                this.f20405aw = this.f20402at.mo20760a((Context) this, false);
            }
            if (!this.f20426v) {
                this.f20402at.mo20767a((Context) this, this.f20402at.f18075l, this.f20380Y, bundle2);
            }
            int i2 = this.f20402at.f18075l;
            if (this.f20426v) {
                this.f20388af = this.f20357B.getInt("idchat");
                this.f20389ag = this.f20357B.getInt("idtema");
                this.f20391ai = this.f20357B.getInt("fotos_perfil");
                this.f20423s = this.f20357B.getBoolean("privados");
                this.f20424t = this.f20357B.getBoolean("coments");
                this.f20425u = this.f20357B.getBoolean("galeria");
                this.f20393ak = this.f20357B.getInt("fnac");
                this.f20394al = this.f20357B.getInt("sexo");
                this.f20396an = this.f20357B.getInt("dist");
                this.f20395am = this.f20357B.getInt("descr");
            } else {
                this.f20387ae = this.f20357B.getInt("idsecc");
                this.f20388af = this.f20387ae;
                try {
                    this.f20389ag = this.f20402at.f17971bz[i2].f18262aF[0].f18334a;
                } catch (Exception unused) {
                    this.f20389ag = 0;
                }
                this.f20391ai = this.f20402at.f17971bz[i2].f18305aw;
                this.f20423s = this.f20402at.f17971bz[i2].f18244O;
                this.f20424t = this.f20402at.f17971bz[i2].f18245P;
                this.f20425u = this.f20402at.f17971bz[i2].f18246Q;
                this.f20393ak = this.f20402at.f17971bz[i2].f18306ax;
                this.f20394al = this.f20402at.f17971bz[i2].f18307ay;
                this.f20396an = this.f20402at.f17971bz[i2].f18257aA;
                this.f20395am = this.f20402at.f17971bz[i2].f18308az;
            }
            if (!this.f20423s) {
                findViewById(R.id.btnfavoritos).setVisibility(8);
            }
            if (this.f20419o) {
                this.f20414j = Color.parseColor("#B71C1C");
            } else {
                this.f20414j = Color.parseColor("#FF5252");
            }
            this.f20392aj = 1;
            if ((this.f20426v && this.f20357B.getInt("fotos_chat") == 0) || (!this.f20426v && this.f20402at.f17971bz[i2].f18258aB == 0)) {
                this.f20392aj = 0;
            }
            if (this.f20392aj == 0) {
                findViewById(R.id.btnfoto).setVisibility(8);
            }
            if (this.f20426v || this.f20402at.f17936bQ == 0 || this.f20402at.f17936bQ == 1) {
                findViewById(R.id.btnvideo).setVisibility(8);
            }
            if (!this.f20402at.f17930bK) {
                findViewById(R.id.btnemotic).setVisibility(8);
            }
            this.f20371P = (int) ((100.0f * getResources().getDisplayMetrics().density) + 0.5f);
            this.f20372Q = (int) ((3.0f * getResources().getDisplayMetrics().density) + 0.5f);
            this.f20373R = (int) ((3.0f * getResources().getDisplayMetrics().density) + 0.5f);
            this.f20362G = new File(Environment.getExternalStorageDirectory(), getPackageName());
            this.f20397ao = 0;
            this.f20379X = "";
            this.f20400ar = getSharedPreferences("sh", 0);
            this.f20384ab = this.f20400ar.getInt("idusu", 0);
            this.f20374S = this.f20400ar.getString("cod", "");
            this.f20401as = getSharedPreferences("accion", 0);
            this.f20368M = (LinearLayout) findViewById(R.id.llchat);
            this.f20429y = false;
            if (this.f20357B != null && this.f20357B.containsKey("tit_cab")) {
                ((TextView) findViewById(R.id.tv_cabe)).setText(this.f20357B.getString("tit_cab"));
                findViewById(R.id.tv_cabe).setOnClickListener(new OnClickListener() {
                    public void onClick(View view) {
                        t_chat.this.finish();
                    }
                });
                findViewById(R.id.iv_cabe).setOnClickListener(new OnClickListener() {
                    public void onClick(View view) {
                        t_chat.this.finish();
                    }
                });
                findViewById(R.id.ll_cabe).setVisibility(0);
                this.f20429y = true;
                if (this.f20426v) {
                    Editor edit = this.f20400ar.edit();
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("tit_chat");
                    sb4.append(this.f20388af);
                    edit.putString(sb4.toString(), this.f20357B.getString("tit_cab"));
                    edit.commit();
                }
            } else if (!this.f20426v && this.f20402at.f17971bz[i2].f18247R) {
                findViewById(R.id.tv_cabe_der).setOnClickListener(new OnClickListener() {
                    public void onClick(View view) {
                        t_chat.this.m24649i();
                    }
                });
                findViewById(R.id.iv_cabe_der).setOnClickListener(new OnClickListener() {
                    public void onClick(View view) {
                        t_chat.this.m24649i();
                    }
                });
                findViewById(R.id.ll_cabe_der).setVisibility(0);
            } else if (this.f20426v) {
                SharedPreferences sharedPreferences = this.f20400ar;
                StringBuilder sb5 = new StringBuilder();
                sb5.append("tit_chat");
                sb5.append(this.f20388af);
                if (!sharedPreferences.getString(sb5.toString(), "").equals("")) {
                    TextView textView = (TextView) findViewById(R.id.tv_cabe);
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append("  ");
                    SharedPreferences sharedPreferences2 = this.f20400ar;
                    StringBuilder sb7 = new StringBuilder();
                    sb7.append("tit_chat");
                    sb7.append(this.f20388af);
                    sb6.append(sharedPreferences2.getString(sb7.toString(), ""));
                    textView.setText(sb6.toString());
                    findViewById(R.id.iv_cabe).setVisibility(8);
                    findViewById(R.id.ll_cabe).setVisibility(0);
                    this.f20429y = true;
                }
            }
            for (int i3 = 0; i3 < this.f20402at.f17971bz.length; i3++) {
                if (this.f20402at.f17971bz[i3].f18325r == 10 || (this.f20402at.f17971bz[i3].f18325r == 9 && this.f20402at.f17971bz[i3].f18247R)) {
                    findViewById(R.id.fav_noactiv).setVisibility(0);
                }
            }
            if (this.f20357B == null || !this.f20357B.containsKey("fav")) {
                SharedPreferences sharedPreferences3 = this.f20400ar;
                StringBuilder sb8 = new StringBuilder();
                sb8.append("fav");
                sb8.append(this.f20388af);
                this.f20427w = sharedPreferences3.getBoolean(sb8.toString(), false);
            } else {
                this.f20427w = this.f20357B.getBoolean("fav");
            }
            ImageView imageView = (ImageView) findViewById(R.id.fav_noactiv);
            imageView.setOnClickListener(new OnClickListener() {
                public void onClick(View view) {
                    int i;
                    if (t_chat.this.f20427w) {
                        if (!t_chat.this.f20419o) {
                            ((ImageView) view).setImageDrawable(t_chat.this.getResources().getDrawable(R.drawable.fav_noactiv_light));
                        } else {
                            ((ImageView) view).setImageDrawable(t_chat.this.getResources().getDrawable(R.drawable.fav_noactiv));
                        }
                        t_chat.this.f20427w = false;
                        i = 0;
                    } else {
                        Drawable drawable = t_chat.this.getResources().getDrawable(R.drawable.fav_blanco);
                        drawable.setColorFilter(t_chat.this.f20414j, Mode.MULTIPLY);
                        ((ImageView) view).setImageDrawable(drawable);
                        t_chat.this.f20427w = true;
                        i = 1;
                    }
                    Editor edit = t_chat.this.f20400ar.edit();
                    StringBuilder sb = new StringBuilder();
                    sb.append("fav");
                    sb.append(t_chat.this.f20388af);
                    edit.putBoolean(sb.toString(), t_chat.this.f20427w);
                    edit.commit();
                    C5644f fVar = new C5644f(t_chat.this.f20384ab, t_chat.this.f20374S, t_chat.this.f20388af, "fav", i);
                    fVar.execute(new String[0]);
                }
            });
            if (this.f20427w) {
                Drawable drawable = getResources().getDrawable(R.drawable.fav_blanco);
                drawable.setColorFilter(this.f20414j, Mode.MULTIPLY);
                imageView.setImageDrawable(drawable);
            } else if (this.f20419o) {
                imageView.setImageDrawable(getResources().getDrawable(R.drawable.fav_noactiv));
            } else {
                imageView.setImageDrawable(getResources().getDrawable(R.drawable.fav_noactiv_light));
            }
            if (this.f20357B == null || !this.f20357B.containsKey("notif")) {
                if (this.f20426v) {
                    SharedPreferences sharedPreferences4 = this.f20400ar;
                    StringBuilder sb9 = new StringBuilder();
                    sb9.append("notif");
                    sb9.append(this.f20388af);
                    if (!sharedPreferences4.contains(sb9.toString())) {
                        int i4 = 0;
                        while (true) {
                            if (i4 >= this.f20402at.f17971bz.length) {
                                break;
                            } else if (this.f20402at.f17971bz[i4].f18330w == this.f20388af) {
                                break;
                            } else {
                                i4++;
                            }
                        }
                    }
                    z = false;
                    SharedPreferences sharedPreferences5 = this.f20400ar;
                    StringBuilder sb10 = new StringBuilder();
                    sb10.append("notif");
                    sb10.append(this.f20388af);
                    this.f20428x = sharedPreferences5.getBoolean(sb10.toString(), z);
                }
                z = true;
                SharedPreferences sharedPreferences52 = this.f20400ar;
                StringBuilder sb102 = new StringBuilder();
                sb102.append("notif");
                sb102.append(this.f20388af);
                this.f20428x = sharedPreferences52.getBoolean(sb102.toString(), z);
            } else {
                this.f20428x = this.f20357B.getBoolean("notif");
            }
            this.f20416l = (ImageView) findViewById(R.id.notif_noactiv);
            this.f20416l.setOnClickListener(new OnClickListener() {
                public void onClick(View view) {
                    int i;
                    if (t_chat.this.f20428x) {
                        if (!t_chat.this.f20419o) {
                            ((ImageView) view).setImageDrawable(t_chat.this.getResources().getDrawable(R.drawable.notif_noactiv_light));
                        } else {
                            ((ImageView) view).setImageDrawable(t_chat.this.getResources().getDrawable(R.drawable.notif_noactiv));
                        }
                        t_chat.this.f20428x = false;
                        i = 0;
                    } else {
                        Drawable drawable = t_chat.this.getResources().getDrawable(R.drawable.notif_blanco);
                        drawable.setColorFilter(t_chat.this.f20414j, Mode.MULTIPLY);
                        ((ImageView) view).setImageDrawable(drawable);
                        t_chat.this.f20428x = true;
                        i = 1;
                    }
                    Editor edit = t_chat.this.f20400ar.edit();
                    StringBuilder sb = new StringBuilder();
                    sb.append("notif");
                    sb.append(t_chat.this.f20388af);
                    edit.putBoolean(sb.toString(), t_chat.this.f20428x);
                    edit.commit();
                    C5644f fVar = new C5644f(t_chat.this.f20384ab, t_chat.this.f20374S, t_chat.this.f20388af, "notif", i);
                    fVar.execute(new String[0]);
                }
            });
            if (this.f20428x) {
                Drawable drawable2 = getResources().getDrawable(R.drawable.notif_blanco);
                drawable2.setColorFilter(this.f20414j, Mode.MULTIPLY);
                this.f20416l.setImageDrawable(drawable2);
            } else if (this.f20419o) {
                this.f20416l.setImageDrawable(getResources().getDrawable(R.drawable.notif_noactiv));
            } else {
                this.f20416l.setImageDrawable(getResources().getDrawable(R.drawable.notif_noactiv_light));
            }
            this.f20370O = (ProgressBar) findViewById(R.id.pb_chat_inv);
            this.f20369N = (ProgressBar) findViewById(R.id.pb_chat_env_inv);
            if (this.f20426v) {
                str2 = this.f20357B.getString("c1");
                str = this.f20357B.getString("c2");
            } else {
                str2 = this.f20402at.f17971bz[i2].f18314g;
                str = this.f20402at.f17971bz[i2].f18315h;
            }
            if (!str2.equals("")) {
                Orientation orientation = Orientation.TOP_BOTTOM;
                StringBuilder sb11 = new StringBuilder();
                sb11.append("#");
                sb11.append(str2);
                StringBuilder sb12 = new StringBuilder();
                sb12.append("#");
                sb12.append(str);
                findViewById(R.id.ll_princ).setBackgroundDrawable(new GradientDrawable(orientation, new int[]{Color.parseColor(sb11.toString()), Color.parseColor(sb12.toString())}));
                int i5 = -16777216;
                if (!this.f20419o) {
                    ((ImageView) findViewById(R.id.btnperfil)).setImageDrawable(getResources().getDrawable(R.drawable.perfil_light));
                    ((ImageView) findViewById(R.id.btnfavoritos)).setImageDrawable(getResources().getDrawable(R.drawable.privados_light));
                    ((ImageView) findViewById(R.id.btnfoto)).setImageDrawable(getResources().getDrawable(R.drawable.photo_camera_light));
                    ((ImageView) findViewById(R.id.btnvideo)).setImageDrawable(getResources().getDrawable(R.drawable.videocam_light));
                    this.f20370O = (ProgressBar) findViewById(R.id.pb_chat);
                    findViewById(R.id.ll_cabe_der).setBackgroundColor(config.f17838f);
                    ((TextView) findViewById(R.id.tv_cabe_der)).setTextColor(-1);
                    findViewById(R.id.ll_cabe).setBackgroundColor(config.f17838f);
                    ((TextView) findViewById(R.id.tv_cabe)).setTextColor(-1);
                    findViewById(R.id.ll_cabe_priv).setBackgroundColor(config.f17838f);
                    ((TextView) findViewById(R.id.tv_cabe_priv)).setTextColor(-1);
                    i5 = -1;
                } else {
                    findViewById(R.id.ll_cabe_der).setBackgroundColor(config.f17834e);
                    ((TextView) findViewById(R.id.tv_cabe_der)).setTextColor(config.f17813a);
                    findViewById(R.id.ll_cabe).setBackgroundColor(config.f17834e);
                    ((TextView) findViewById(R.id.tv_cabe)).setTextColor(config.f17813a);
                    findViewById(R.id.ll_cabe_priv).setBackgroundColor(config.f17834e);
                    ((TextView) findViewById(R.id.tv_cabe_priv)).setTextColor(config.f17813a);
                }
                if (VERSION.SDK_INT > 20) {
                    config.m23837a((EditText) findViewById(R.id.c_mensaje), Boolean.valueOf(!this.f20419o), this.f20402at.f17890aW);
                } else if (VERSION.SDK_INT > 12) {
                    ((EditText) findViewById(R.id.c_mensaje)).setTextColor(i5);
                }
                if (!this.f20421q) {
                    ((ImageView) findViewById(R.id.btnemotic)).setImageDrawable(getResources().getDrawable(R.drawable.emoticono_sel_light));
                    if (VERSION.SDK_INT > 12) {
                        this.f20369N = (ProgressBar) findViewById(R.id.pb_chat_env);
                    }
                }
                if (VERSION.SDK_INT > 20) {
                    config.m23838a(this.f20370O, this.f20402at.f17890aW);
                    config.m23838a(this.f20369N, this.f20402at.f17890aW);
                }
                StringBuilder sb13 = new StringBuilder();
                sb13.append("#");
                sb13.append(this.f20402at.f17890aW);
                if (config.m23844a(sb13.toString())) {
                    findViewById(R.id.iv_btn_fondo_n).setVisibility(0);
                } else {
                    findViewById(R.id.iv_btn_fondo_b).setVisibility(0);
                }
                Drawable drawable3 = getResources().getDrawable(R.drawable.btn_enviar);
                StringBuilder sb14 = new StringBuilder();
                sb14.append("#");
                sb14.append(this.f20402at.f17890aW);
                drawable3.setColorFilter(Color.parseColor(sb14.toString()), Mode.MULTIPLY);
                ((ImageView) findViewById(R.id.btnenv)).setImageDrawable(drawable3);
            }
            if (!this.f20426v) {
                int i6 = this.f20402at.f17971bz[i2].f18327t;
                int i7 = this.f20402at.f17971bz[i2].f18328u;
                boolean z3 = this.f20402at.f17971bz[i2].f18242M;
                if (i6 > 0) {
                    if (!z3) {
                        try {
                            config config = this.f20402at;
                            StringBuilder sb15 = new StringBuilder();
                            sb15.append("fondo_");
                            sb15.append(i6);
                            config.mo20776a(sb15.toString(), (ImageView) findViewById(R.id.iv_fondo));
                        } catch (Exception unused2) {
                        }
                    } else {
                        C6161d dVar = new C6161d();
                        StringBuilder sb16 = new StringBuilder();
                        sb16.append(i6);
                        sb16.append("");
                        StringBuilder sb17 = new StringBuilder();
                        sb17.append(i2);
                        sb17.append("");
                        StringBuilder sb18 = new StringBuilder();
                        sb18.append(i7);
                        sb18.append("");
                        dVar.execute(new String[]{sb16.toString(), sb17.toString(), sb18.toString()});
                    }
                }
            }
            Display defaultDisplay = getWindowManager().getDefaultDisplay();
            if (VERSION.SDK_INT >= 13) {
                Point point = new Point();
                defaultDisplay.getSize(point);
                this.f20386ad = point.y;
            } else {
                this.f20386ad = defaultDisplay.getHeight();
            }
            this.f20398ap = false;
            if (!this.f20400ar.getString("idprivado", "0").equals("0")) {
                this.f20398ap = true;
                findViewById(R.id.btnfavoritos).setVisibility(8);
                findViewById(R.id.btnperfil).setVisibility(8);
                if (this.f20402at.f17929bJ) {
                    findViewById(R.id.btnfoto).setVisibility(0);
                } else {
                    findViewById(R.id.btnfoto).setVisibility(8);
                }
                if (this.f20402at.f17936bQ == 1 || this.f20402at.f17936bQ == 3) {
                    findViewById(R.id.btnvideo).setVisibility(0);
                } else {
                    findViewById(R.id.btnvideo).setVisibility(8);
                }
                TextView textView2 = (TextView) findViewById(R.id.tv_cabe_priv);
                StringBuilder sb19 = new StringBuilder();
                sb19.append(getResources().getString(R.string.chatprivadocon));
                sb19.append(" ");
                sb19.append(this.f20400ar.getString("nombreprivado", ""));
                textView2.setText(sb19.toString());
                if (this.f20399aq) {
                    i = 8;
                    findViewById(R.id.iv_cabe_priv).setVisibility(8);
                } else {
                    i = 8;
                    findViewById(R.id.iv_cabe_priv).setVisibility(0);
                }
                findViewById(R.id.ll_cabe_priv).setVisibility(0);
                findViewById(R.id.ll_favnotif).setVisibility(i);
                findViewById(R.id.ll_cabe).setVisibility(i);
                findViewById(R.id.ll_cabe_der).setVisibility(i);
            }
            findViewById(R.id.btnperfil).setOnClickListener(this);
            findViewById(R.id.btnfavoritos).setOnClickListener(this);
            findViewById(R.id.btnfoto).setOnClickListener(this);
            findViewById(R.id.btnvideo).setOnClickListener(this);
            findViewById(R.id.iv_cabe_priv).setOnClickListener(this);
            findViewById(R.id.btncargarmas).setOnClickListener(this);
            findViewById(R.id.btnemotic).setOnClickListener(this);
            findViewById(R.id.btnenv).setOnClickListener(this);
            findViewById(R.id.c_mensaje).setOnKeyListener(this);
            this.f20359D = new HashMap();
            this.f20360E = new HashMap();
            this.f20361F = new HashMap();
            this.f20358C = null;
            try {
                if (this.f20420p) {
                    this.f20358C = BitmapFactory.decodeResource(getResources(), R.drawable.sinfoto_light);
                } else {
                    this.f20358C = BitmapFactory.decodeResource(getResources(), R.drawable.sinfoto);
                }
            } catch (OutOfMemoryError unused3) {
            }
            if (this.f20391ai > 0) {
                File a = this.f20402at.mo20757a((Context) this, 1);
                try {
                    Options options = new Options();
                    options.inJustDecodeBounds = true;
                    BitmapFactory.decodeFile(a.getPath(), options);
                    int i8 = options.outWidth;
                    int i9 = options.outWidth;
                    int i10 = options.outHeight;
                    if (i9 > 75 || i10 > 100) {
                        z2 = false;
                    }
                    if (!z2) {
                        int round = Math.round(((float) i9) / ((float) config.m23824a(i9, i10, 75, 100)));
                        Options options2 = new Options();
                        options2.inSampleSize = round;
                        this.f20358C = BitmapFactory.decodeFile(a.getPath(), options2);
                    } else {
                        this.f20358C = Media.getBitmap(getContentResolver(), Uri.fromFile(a));
                    }
                } catch (Exception unused4) {
                }
            }
            if (this.f20357B == null || !this.f20357B.containsKey("empezar_privado")) {
                this.f20390ah = 0;
                if (!this.f20426v || this.f20357B == null || !this.f20357B.containsKey("id_remit")) {
                    new C6158c("0", this.f20400ar.getString("idprivado", "0"), this.f20390ah).execute(new String[0]);
                }
                if (!(this.f20357B == null || this.f20357B.getString("id_remit") == null)) {
                    mo22078a(this.f20357B.getString("id_remit"), this.f20357B.getString("nombre_remit"));
                }
            } else {
                m24640b(this.f20357B.getString("id_remit"), this.f20357B.getString("nombre_remit"));
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public void m24649i() {
        Intent intent;
        Intent intent2 = new Intent();
        intent2.putExtra("finalizar", true);
        setResult(-1, intent2);
        if (this.f20415k.f18260aD > 0) {
            intent = new Intent(this, t_buscchats_lista.class);
            intent.putExtra("ind", this.f20402at.f18075l);
            intent.putExtra("idcat", this.f20415k.f18259aC);
            intent.putExtra("idsubcat", this.f20415k.f18260aD);
        } else {
            intent = new Intent(this, t_buscchats.class);
            intent.putExtra("ind", this.f20402at.f18075l);
            intent.putExtra("idcat", this.f20415k.f18259aC);
        }
        if (this.f20402at.f18045dm != 2) {
            intent.putExtra("es_root", true);
        }
        this.f20430z = false;
        this.f20418n = true;
        mo22083h();
        finish();
        startActivity(intent);
    }

    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 0 || i != 66) {
            return false;
        }
        m24635a(true);
        return true;
    }

    /* renamed from: a */
    private void m24635a(boolean z) {
        String trim = ((TextView) findViewById(R.id.c_mensaje)).getText().toString().replace("@", "").trim();
        if (!trim.equals("")) {
            if (z && this.f20386ad < 600) {
                ((InputMethodManager) getSystemService("input_method")).hideSoftInputFromWindow(((TextView) findViewById(R.id.c_mensaje)).getWindowToken(), 0);
            }
            ((TextView) findViewById(R.id.c_mensaje)).setTextColor(-7829368);
            this.f20369N.setVisibility(0);
            if (this.f20367L == null || this.f20367L.getStatus() != Status.RUNNING) {
                String string = this.f20400ar.getString("idprivado", "0");
                if (!string.equals("0")) {
                    SharedPreferences sharedPreferences = this.f20400ar;
                    StringBuilder sb = new StringBuilder();
                    sb.append("usufav_");
                    sb.append(string);
                    if (!sharedPreferences.contains(sb.toString())) {
                        SharedPreferences sharedPreferences2 = this.f20400ar;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("usufav_noactivar_");
                        sb2.append(string);
                        if (!sharedPreferences2.contains(sb2.toString())) {
                            Editor edit = this.f20400ar.edit();
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append("usufav_");
                            sb3.append(string);
                            edit.putBoolean(sb3.toString(), true);
                            edit.commit();
                        }
                    }
                }
                this.f20367L = new C6163f(trim);
                this.f20367L.execute(new String[0]);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo22079a(String str) {
        Bitmap bitmap;
        File file = new File(str);
        boolean z = false;
        if (file.length() == 0) {
            return false;
        }
        if (file.length() > 55574528) {
            final AlertDialog create = new Builder(this).setCancelable(false).setPositiveButton(getString(R.string.aceptar), null).setMessage(R.string.vidlargo).create();
            if (!this.f20380Y.equals("")) {
                create.setOnShowListener(new OnShowListener() {
                    public void onShow(DialogInterface dialogInterface) {
                        Button button = create.getButton(-1);
                        StringBuilder sb = new StringBuilder();
                        sb.append("#");
                        sb.append(t_chat.this.f20380Y);
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
            createVideoThumbnail.compress(CompressFormat.JPEG, 100, new FileOutputStream(this.f20402at.mo20757a((Context) this, 99)));
        } catch (Exception unused2) {
        }
        try {
            File a = this.f20402at.mo20757a((Context) this, 99);
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
            bitmap.compress(CompressFormat.JPEG, 75, new FileOutputStream(this.f20402at.mo20757a((Context) this, 99)));
        } catch (Exception unused3) {
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Can't wrap try/catch for region: R(11:95|96|(1:100)|101|(2:104|102)|130|105|106|107|108|109) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:108:0x028f */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x011d A[SYNTHETIC, Splitter:B:48:0x011d] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0161 A[Catch:{ Exception -> 0x019b }] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x017c A[Catch:{ Exception -> 0x019b }] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x01a2  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0203 A[LOOP:3: B:89:0x01f7->B:91:0x0203, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onActivityResult(int r22, int r23, android.content.Intent r24) {
        /*
            r21 = this;
            r1 = r21
            r2 = r22
            r3 = r24
            r4 = -1
            r5 = r23
            if (r5 != r4) goto L_0x02ec
            r5 = 3
            r7 = 99
            r8 = 0
            if (r2 != r5) goto L_0x005a
            android.net.Uri r2 = r24.getData()
            android.content.Context r3 = r21.getApplicationContext()
            java.lang.String r2 = mega.boicot.config.m23830a(r2, r3)
            if (r2 == 0) goto L_0x02ec
            java.lang.String r3 = ""
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto L_0x02ec
            boolean r3 = r1.mo22079a(r2)
            if (r3 != 0) goto L_0x002e
            return
        L_0x002e:
            r6 = 100
        L_0x0030:
            mega.boicot.config r3 = r1.f20402at
            java.io.File r3 = r3.mo20757a(r1, r6)
            boolean r3 = r3.exists()
            if (r3 == 0) goto L_0x003f
            int r6 = r6 + 1
            goto L_0x0030
        L_0x003f:
            mega.boicot.config r3 = r1.f20402at
            java.io.File r3 = r3.mo20757a(r1, r7)
            mega.boicot.config r4 = r1.f20402at
            java.io.File r4 = r4.mo20757a(r1, r6)
            r3.renameTo(r4)
            mega.boicot.t_chat$i r3 = new mega.boicot.t_chat$i
            r3.<init>(r6, r2)
            java.lang.String[] r2 = new java.lang.String[r8]
            r3.execute(r2)
            goto L_0x02ec
        L_0x005a:
            r9 = 4
            if (r2 != r9) goto L_0x00a6
            android.net.Uri r2 = r24.getData()
            android.content.Context r3 = r21.getApplicationContext()
            java.lang.String r2 = mega.boicot.config.m23830a(r2, r3)
            if (r2 == 0) goto L_0x02ec
            java.lang.String r3 = ""
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto L_0x02ec
            boolean r3 = r1.mo22079a(r2)
            if (r3 != 0) goto L_0x007a
            return
        L_0x007a:
            r6 = 100
        L_0x007c:
            mega.boicot.config r3 = r1.f20402at
            java.io.File r3 = r3.mo20757a(r1, r6)
            boolean r3 = r3.exists()
            if (r3 == 0) goto L_0x008b
            int r6 = r6 + 1
            goto L_0x007c
        L_0x008b:
            mega.boicot.config r3 = r1.f20402at
            java.io.File r3 = r3.mo20757a(r1, r7)
            mega.boicot.config r4 = r1.f20402at
            java.io.File r4 = r4.mo20757a(r1, r6)
            r3.renameTo(r4)
            mega.boicot.t_chat$i r3 = new mega.boicot.t_chat$i
            r3.<init>(r6, r2)
            java.lang.String[] r2 = new java.lang.String[r8]
            r3.execute(r2)
            goto L_0x02ec
        L_0x00a6:
            r9 = 75
            r10 = 2
            r12 = 1
            if (r2 != r12) goto L_0x0221
            java.io.File r2 = new java.io.File     // Catch:{ Exception -> 0x0115 }
            mega.boicot.config r3 = r1.f20402at     // Catch:{ Exception -> 0x0115 }
            java.io.File r3 = r3.mo20757a(r1, r7)     // Catch:{ Exception -> 0x0115 }
            java.lang.String r3 = r3.getAbsolutePath()     // Catch:{ Exception -> 0x0115 }
            r2.<init>(r3)     // Catch:{ Exception -> 0x0115 }
            long r2 = r2.length()     // Catch:{ Exception -> 0x0115 }
            android.content.Context r13 = r21.getApplicationContext()     // Catch:{ Exception -> 0x0115 }
            android.content.ContentResolver r14 = r13.getContentResolver()     // Catch:{ Exception -> 0x0115 }
            android.net.Uri r15 = android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI     // Catch:{ Exception -> 0x0115 }
            java.lang.String[] r10 = new java.lang.String[r10]     // Catch:{ Exception -> 0x0115 }
            java.lang.String r13 = "orientation"
            r10[r8] = r13     // Catch:{ Exception -> 0x0115 }
            java.lang.String r13 = "_size"
            r10[r12] = r13     // Catch:{ Exception -> 0x0115 }
            java.lang.String r17 = "date_added>=?"
            java.lang.String[] r13 = new java.lang.String[r12]     // Catch:{ Exception -> 0x0115 }
            long r5 = r1.f20417m     // Catch:{ Exception -> 0x0115 }
            r18 = 1000(0x3e8, double:4.94E-321)
            long r5 = r5 / r18
            r18 = 1
            long r11 = r5 - r18
            java.lang.String r5 = java.lang.String.valueOf(r11)     // Catch:{ Exception -> 0x0115 }
            r13[r8] = r5     // Catch:{ Exception -> 0x0115 }
            java.lang.String r19 = "date_added desc"
            r16 = r10
            r18 = r13
            android.database.Cursor r5 = r14.query(r15, r16, r17, r18, r19)     // Catch:{ Exception -> 0x0115 }
            if (r5 == 0) goto L_0x011a
            long r10 = r1.f20417m     // Catch:{ Exception -> 0x0115 }
            r12 = 0
            int r6 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r6 == 0) goto L_0x011a
            int r6 = r5.getCount()     // Catch:{ Exception -> 0x0115 }
            if (r6 == 0) goto L_0x011a
        L_0x0101:
            boolean r6 = r5.moveToNext()     // Catch:{ Exception -> 0x0115 }
            if (r6 == 0) goto L_0x011a
            r6 = 1
            long r10 = r5.getLong(r6)     // Catch:{ Exception -> 0x0115 }
            int r6 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r6 != 0) goto L_0x0101
            int r2 = r5.getInt(r8)     // Catch:{ Exception -> 0x0115 }
            goto L_0x011b
        L_0x0115:
            r0 = move-exception
            r2 = r0
            r2.printStackTrace()
        L_0x011a:
            r2 = r4
        L_0x011b:
            if (r2 != r4) goto L_0x0139
            android.media.ExifInterface r3 = new android.media.ExifInterface     // Catch:{ IOException -> 0x0134 }
            mega.boicot.config r5 = r1.f20402at     // Catch:{ IOException -> 0x0134 }
            java.io.File r5 = r5.mo20757a(r1, r7)     // Catch:{ IOException -> 0x0134 }
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
            mega.boicot.config r3 = r1.f20402at     // Catch:{ Exception -> 0x019b }
            java.io.File r3 = r3.mo20757a(r1, r7)     // Catch:{ Exception -> 0x019b }
            android.graphics.BitmapFactory$Options r5 = new android.graphics.BitmapFactory$Options     // Catch:{ Exception -> 0x019b }
            r5.<init>()     // Catch:{ Exception -> 0x019b }
            r6 = 1
            r5.inJustDecodeBounds = r6     // Catch:{ Exception -> 0x019b }
            java.lang.String r6 = r3.getPath()     // Catch:{ Exception -> 0x019b }
            android.graphics.BitmapFactory.decodeFile(r6, r5)     // Catch:{ Exception -> 0x019b }
            int r6 = r5.outWidth     // Catch:{ Exception -> 0x019b }
            int r6 = r5.outWidth     // Catch:{ Exception -> 0x019b }
            int r5 = r5.outHeight     // Catch:{ Exception -> 0x019b }
            r10 = 800(0x320, float:1.121E-42)
            if (r6 > r10) goto L_0x015d
            if (r5 > r10) goto L_0x015d
            r20 = 1
            goto L_0x015f
        L_0x015d:
            r20 = r8
        L_0x015f:
            if (r20 != 0) goto L_0x017c
            int r5 = mega.boicot.config.m23824a(r6, r5, r10, r10)     // Catch:{ Exception -> 0x019b }
            float r6 = (float) r6     // Catch:{ Exception -> 0x019b }
            float r5 = (float) r5     // Catch:{ Exception -> 0x019b }
            float r6 = r6 / r5
            int r5 = java.lang.Math.round(r6)     // Catch:{ Exception -> 0x019b }
            android.graphics.BitmapFactory$Options r6 = new android.graphics.BitmapFactory$Options     // Catch:{ Exception -> 0x019b }
            r6.<init>()     // Catch:{ Exception -> 0x019b }
            r6.inSampleSize = r5     // Catch:{ Exception -> 0x019b }
            java.lang.String r3 = r3.getPath()     // Catch:{ Exception -> 0x019b }
            android.graphics.Bitmap r3 = android.graphics.BitmapFactory.decodeFile(r3, r6)     // Catch:{ Exception -> 0x019b }
            goto L_0x0188
        L_0x017c:
            android.content.ContentResolver r5 = r21.getContentResolver()     // Catch:{ Exception -> 0x019b }
            android.net.Uri r3 = android.net.Uri.fromFile(r3)     // Catch:{ Exception -> 0x019b }
            android.graphics.Bitmap r3 = android.provider.MediaStore.Images.Media.getBitmap(r5, r3)     // Catch:{ Exception -> 0x019b }
        L_0x0188:
            mega.boicot.config r5 = r1.f20402at     // Catch:{ Exception -> 0x019b }
            java.io.File r5 = r5.mo20757a(r1, r7)     // Catch:{ Exception -> 0x019b }
            java.io.FileOutputStream r6 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x01a0 }
            r6.<init>(r5)     // Catch:{ Exception -> 0x01a0 }
            android.graphics.Bitmap$CompressFormat r5 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ Exception -> 0x01a0 }
            r3.compress(r5, r9, r6)     // Catch:{ Exception -> 0x01a0 }
            r9 = 100
            goto L_0x01a0
        L_0x019b:
            r0 = move-exception
            r3 = r0
            r3.printStackTrace()
        L_0x01a0:
            if (r2 == r4) goto L_0x01f5
            android.graphics.Matrix r15 = new android.graphics.Matrix
            r15.<init>()
            r3 = 3
            if (r2 != r3) goto L_0x01ad
            r2 = 180(0xb4, float:2.52E-43)
            goto L_0x01bb
        L_0x01ad:
            r3 = 8
            if (r2 != r3) goto L_0x01b4
            r2 = 270(0x10e, float:3.78E-43)
            goto L_0x01bb
        L_0x01b4:
            r3 = 6
            if (r2 != r3) goto L_0x01ba
            r2 = 90
            goto L_0x01bb
        L_0x01ba:
            r2 = r8
        L_0x01bb:
            if (r2 <= 0) goto L_0x01f5
            mega.boicot.config r3 = r1.f20402at     // Catch:{ Exception -> 0x01f0 }
            java.io.File r3 = r3.mo20757a(r1, r7)     // Catch:{ Exception -> 0x01f0 }
            java.lang.String r3 = r3.getAbsolutePath()     // Catch:{ Exception -> 0x01f0 }
            android.graphics.Bitmap r10 = android.graphics.BitmapFactory.decodeFile(r3)     // Catch:{ Exception -> 0x01f0 }
            float r2 = (float) r2     // Catch:{ Exception -> 0x01f0 }
            r15.postRotate(r2)     // Catch:{ Exception -> 0x01f0 }
            r11 = 0
            r12 = 0
            int r13 = r10.getWidth()     // Catch:{ Exception -> 0x01f0 }
            int r14 = r10.getHeight()     // Catch:{ Exception -> 0x01f0 }
            r16 = 1
            android.graphics.Bitmap r2 = android.graphics.Bitmap.createBitmap(r10, r11, r12, r13, r14, r15, r16)     // Catch:{ Exception -> 0x01f0 }
            mega.boicot.config r3 = r1.f20402at     // Catch:{ Exception -> 0x01f0 }
            java.io.File r3 = r3.mo20757a(r1, r7)     // Catch:{ Exception -> 0x01f0 }
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x01f5 }
            r4.<init>(r3)     // Catch:{ Exception -> 0x01f5 }
            android.graphics.Bitmap$CompressFormat r3 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ Exception -> 0x01f5 }
            r2.compress(r3, r9, r4)     // Catch:{ Exception -> 0x01f5 }
            goto L_0x01f5
        L_0x01f0:
            r0 = move-exception
            r2 = r0
            r2.printStackTrace()
        L_0x01f5:
            r2 = 100
        L_0x01f7:
            mega.boicot.config r3 = r1.f20402at
            java.io.File r3 = r3.mo20757a(r1, r2)
            boolean r3 = r3.exists()
            if (r3 == 0) goto L_0x0206
            int r2 = r2 + 1
            goto L_0x01f7
        L_0x0206:
            mega.boicot.config r3 = r1.f20402at
            java.io.File r3 = r3.mo20757a(r1, r7)
            mega.boicot.config r4 = r1.f20402at
            java.io.File r4 = r4.mo20757a(r1, r2)
            r3.renameTo(r4)
            mega.boicot.t_chat$g r3 = new mega.boicot.t_chat$g
            r3.<init>(r2)
            java.lang.String[] r2 = new java.lang.String[r8]
            r3.execute(r2)
            goto L_0x02ec
        L_0x0221:
            if (r2 != r10) goto L_0x029d
            android.net.Uri r2 = r24.getData()
            r3 = 1
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch:{ Exception | OutOfMemoryError -> 0x02ec }
            java.lang.String r5 = "orientation"
            r3[r8] = r5     // Catch:{ Exception | OutOfMemoryError -> 0x02ec }
            android.content.ContentResolver r10 = r21.getContentResolver()     // Catch:{ Exception | OutOfMemoryError -> 0x02ec }
            r13 = 0
            r14 = 0
            r15 = 0
            r11 = r2
            r12 = r3
            android.database.Cursor r5 = r10.query(r11, r12, r13, r14, r15)     // Catch:{ Exception | OutOfMemoryError -> 0x02ec }
            if (r5 == 0) goto L_0x024d
            boolean r6 = r5.moveToFirst()     // Catch:{ Exception | OutOfMemoryError -> 0x02ec }
            if (r6 == 0) goto L_0x024d
            r3 = r3[r8]     // Catch:{ Exception | OutOfMemoryError -> 0x02ec }
            int r3 = r5.getColumnIndex(r3)     // Catch:{ Exception | OutOfMemoryError -> 0x02ec }
            int r4 = r5.getInt(r3)     // Catch:{ Exception | OutOfMemoryError -> 0x02ec }
        L_0x024d:
            android.graphics.Matrix r15 = new android.graphics.Matrix     // Catch:{ Exception | OutOfMemoryError -> 0x02ec }
            r15.<init>()     // Catch:{ Exception | OutOfMemoryError -> 0x02ec }
            float r3 = (float) r4     // Catch:{ Exception | OutOfMemoryError -> 0x02ec }
            r15.postRotate(r3)     // Catch:{ Exception | OutOfMemoryError -> 0x02ec }
            mega.boicot.config r3 = r1.f20402at     // Catch:{ Exception | OutOfMemoryError -> 0x02ec }
            r4 = 800(0x320, float:1.121E-42)
            android.graphics.Bitmap r10 = r3.mo20756a(r2, r4, r4)     // Catch:{ Exception | OutOfMemoryError -> 0x02ec }
            r11 = 0
            r12 = 0
            int r13 = r10.getWidth()     // Catch:{ Exception | OutOfMemoryError -> 0x02ec }
            int r14 = r10.getHeight()     // Catch:{ Exception | OutOfMemoryError -> 0x02ec }
            r16 = 1
            android.graphics.Bitmap r2 = android.graphics.Bitmap.createBitmap(r10, r11, r12, r13, r14, r15, r16)     // Catch:{ Exception | OutOfMemoryError -> 0x02ec }
            r3 = 100
        L_0x0270:
            mega.boicot.config r4 = r1.f20402at     // Catch:{ Exception | OutOfMemoryError -> 0x02ec }
            java.io.File r4 = r4.mo20757a(r1, r3)     // Catch:{ Exception | OutOfMemoryError -> 0x02ec }
            boolean r4 = r4.exists()     // Catch:{ Exception | OutOfMemoryError -> 0x02ec }
            if (r4 == 0) goto L_0x027f
            int r3 = r3 + 1
            goto L_0x0270
        L_0x027f:
            mega.boicot.config r4 = r1.f20402at     // Catch:{ Exception | OutOfMemoryError -> 0x02ec }
            java.io.File r4 = r4.mo20757a(r1, r3)     // Catch:{ Exception | OutOfMemoryError -> 0x02ec }
            java.io.FileOutputStream r5 = new java.io.FileOutputStream     // Catch:{ Exception | OutOfMemoryError -> 0x028f }
            r5.<init>(r4)     // Catch:{ Exception | OutOfMemoryError -> 0x028f }
            android.graphics.Bitmap$CompressFormat r4 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ Exception | OutOfMemoryError -> 0x028f }
            r2.compress(r4, r9, r5)     // Catch:{ Exception | OutOfMemoryError -> 0x028f }
        L_0x028f:
            r2.recycle()     // Catch:{ Exception | OutOfMemoryError -> 0x02ec }
            mega.boicot.t_chat$g r2 = new mega.boicot.t_chat$g     // Catch:{ Exception | OutOfMemoryError -> 0x02ec }
            r2.<init>(r3)     // Catch:{ Exception | OutOfMemoryError -> 0x02ec }
            java.lang.String[] r3 = new java.lang.String[r8]     // Catch:{ Exception | OutOfMemoryError -> 0x02ec }
            r2.execute(r3)     // Catch:{ Exception | OutOfMemoryError -> 0x02ec }
            goto L_0x02ec
        L_0x029d:
            if (r3 == 0) goto L_0x02bf
            java.lang.String r2 = "abrir_privado"
            boolean r2 = r3.hasExtra(r2)
            if (r2 == 0) goto L_0x02bf
            android.content.SharedPreferences r2 = r1.f20401as
            java.lang.String r3 = "id_remit"
            java.lang.String r4 = ""
            java.lang.String r2 = r2.getString(r3, r4)
            android.content.SharedPreferences r3 = r1.f20401as
            java.lang.String r4 = "nombre_remit"
            java.lang.String r5 = ""
            java.lang.String r3 = r3.getString(r4, r5)
            r1.m24640b(r2, r3)
            goto L_0x02ec
        L_0x02bf:
            if (r3 == 0) goto L_0x02ec
            java.lang.String r2 = "finalizar"
            boolean r2 = r3.hasExtra(r2)
            if (r2 == 0) goto L_0x02ec
            android.os.Bundle r2 = r24.getExtras()
            java.lang.String r5 = "finalizar"
            boolean r2 = r2.getBoolean(r5)
            if (r2 == 0) goto L_0x02ec
            android.os.Bundle r2 = r24.getExtras()
            java.lang.String r5 = "finalizar_app"
            boolean r2 = r2.getBoolean(r5)
            if (r2 != 0) goto L_0x02e3
            r1.f20430z = r8
        L_0x02e3:
            r1.setResult(r4, r3)
            r21.mo22083h()
            r21.finish()
        L_0x02ec:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: mega.boicot.t_chat.onActivityResult(int, int, android.content.Intent):void");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public void mo22081f() {
        int b = this.f20402at.mo20778b((Context) this);
        if (this.f20402at.f18045dm == 1) {
            this.f20356A = (ListView) findViewById(R.id.left_drawer);
            this.f20402at.mo20771a(this.f20356A);
        } else if (this.f20402at.f18045dm == 0) {
            int i = 0;
            for (int i2 = 0; i2 < this.f20402at.f17971bz.length; i2++) {
                if (!this.f20402at.f17971bz[i2].f18333z) {
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
        for (int i3 = 0; i3 < this.f20402at.f17923bD.length; i3++) {
            if (this.f20402at.f17923bD[i3] > 0) {
                findViewById(this.f20402at.f17923bD[i3]).setOnClickListener(this);
            }
        }
    }

    /* renamed from: j */
    private void m24651j() {
        final AlertDialog create = new Builder(this).setCancelable(true).setPositiveButton(getString(R.string.tomardecamara), new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                t_chat.this.f20417m = System.currentTimeMillis();
                Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
                Uri a = FileProvider.m1223a(t_chat.this, "mega.boicot.fileprovider", t_chat.this.f20402at.mo20757a((Context) t_chat.this, 99));
                intent.putExtra("output", a);
                intent.addFlags(1);
                intent.addFlags(2);
                if (VERSION.SDK_INT < 21) {
                    for (ResolveInfo resolveInfo : t_chat.this.getPackageManager().queryIntentActivities(intent, C2793C.DEFAULT_BUFFER_SEGMENT_SIZE)) {
                        t_chat.this.grantUriPermission(resolveInfo.activityInfo.packageName, a, 3);
                    }
                }
                try {
                    t_chat.this.startActivityForResult(intent, 1);
                } catch (ActivityNotFoundException unused) {
                }
            }
        }).setNegativeButton(getString(R.string.selimg), new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                Intent intent = new Intent("android.intent.action.PICK");
                intent.setType("image/*");
                t_chat.this.startActivityForResult(intent, 2);
            }
        }).setMessage(R.string.enviarimg).create();
        if (!this.f20380Y.equals("")) {
            create.setOnShowListener(new OnShowListener() {
                public void onShow(DialogInterface dialogInterface) {
                    Button button = create.getButton(-1);
                    StringBuilder sb = new StringBuilder();
                    sb.append("#");
                    sb.append(t_chat.this.f20380Y);
                    button.setTextColor(Color.parseColor(sb.toString()));
                    Button button2 = create.getButton(-2);
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("#");
                    sb2.append(t_chat.this.f20380Y);
                    button2.setTextColor(Color.parseColor(sb2.toString()));
                }
            });
        }
        create.show();
        try {
            ((TextView) create.findViewById(16908299)).setTypeface(Typeface.MONOSPACE);
        } catch (Exception unused) {
        }
    }

    /* renamed from: k */
    private void m24653k() {
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
                    t_chat.this.startActivityForResult(intent, 3);
                } catch (ActivityNotFoundException unused) {
                }
            }
        }).setNegativeButton(getString(R.string.selvideo), new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                Intent intent = new Intent("android.intent.action.PICK");
                intent.setType("video/*");
                t_chat.this.startActivityForResult(intent, 4);
            }
        }).setMessage(R.string.enviarvideo).create();
        if (!this.f20380Y.equals("")) {
            create.setOnShowListener(new OnShowListener() {
                public void onShow(DialogInterface dialogInterface) {
                    Button button = create.getButton(-1);
                    StringBuilder sb = new StringBuilder();
                    sb.append("#");
                    sb.append(t_chat.this.f20380Y);
                    button.setTextColor(Color.parseColor(sb.toString()));
                    Button button2 = create.getButton(-2);
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("#");
                    sb2.append(t_chat.this.f20380Y);
                    button2.setTextColor(Color.parseColor(sb2.toString()));
                }
            });
        }
        create.show();
        try {
            ((TextView) create.findViewById(16908299)).setTypeface(Typeface.MONOSPACE);
        } catch (Exception unused) {
        }
    }

    public void onClick(View view) {
        String str;
        if (view.getId() == R.id.btnfoto) {
            m24651j();
        } else if (view.getId() == R.id.btnvideo) {
            m24653k();
        } else if (view.getId() == R.id.btnfavoritos) {
            Intent intent = new Intent(this, privados.class);
            mo22083h();
            startActivityForResult(intent, 0);
        } else {
            boolean z = true;
            if (view.getId() == R.id.btnperfil) {
                Intent intent2 = new Intent(this, preperfil.class);
                if (this.f20426v) {
                    intent2 = config.m23827a(intent2, this.f20357B);
                } else {
                    intent2.putExtra("idsecc", this.f20387ae);
                }
                intent2.putExtra("nocompletar", true);
                mo22083h();
                startActivityForResult(intent2, 0);
            } else if (view.getId() == R.id.iv_cabe_priv) {
                m24639b(this.f20400ar.getString("idprivado", "0"));
            } else if (view.getId() == R.id.btncargarmas) {
                new C6158c("0", this.f20400ar.getString("idprivado", "0"), this.f20390ah).execute(new String[0]);
            } else if (view.getId() == R.id.btnemotic) {
                new C6156a((EditText) findViewById(R.id.c_mensaje)).show();
            } else if (view.getId() == R.id.btnenv) {
                m24635a(false);
            } else if (view.getTag(R.id.idaux1) != null && !view.getTag(R.id.idaux1).equals("0") && !view.getTag(R.id.idaux1).equals("1")) {
                Intent intent3 = new Intent(this, profile.class);
                intent3.putExtra(TtmlNode.ATTR_ID, (String) view.getTag(R.id.idaux1));
                intent3.putExtra("privados", (String) view.getTag(R.id.idaux2));
                intent3.putExtra("nombre", (String) view.getTag(R.id.idaux3));
                intent3.putExtra("coments", (String) view.getTag(R.id.idaux4));
                intent3.putExtra("fnac_d", (String) view.getTag(R.id.idaux5));
                intent3.putExtra("fnac_m", (String) view.getTag(R.id.idaux6));
                intent3.putExtra("fnac_a", (String) view.getTag(R.id.idaux7));
                intent3.putExtra("sexo", (String) view.getTag(R.id.idaux8));
                intent3.putExtra("vfoto", (String) view.getTag(R.id.idaux9));
                if (view.getTag(R.id.idaux10) != null && ((String) view.getTag(R.id.idaux10)).equals("1")) {
                    intent3.putExtra("desdepriv", "1");
                }
                intent3.putExtra("p_fnac", this.f20393ak);
                intent3.putExtra("p_sexo", this.f20394al);
                intent3.putExtra("p_descr", this.f20395am);
                intent3.putExtra("p_dist", this.f20396an);
                intent3.putExtra("coments_chat", this.f20424t);
                intent3.putExtra("galeria", this.f20425u);
                intent3.putExtra("privados_chat", this.f20423s);
                intent3.putExtra("fotos_perfil", this.f20391ai);
                intent3.putExtra("fotos_chat", this.f20392aj);
                startActivityForResult(intent3, 0);
            } else if (view.getTag() == null || ((String) view.getTag()).length() <= 3 || !((String) view.getTag()).substring(0, 3).equals("img")) {
                if ((this.f20402at.f17986cO == null || this.f20402at.f17986cO.equals("")) && ((this.f20402at.f17985cN == null || this.f20402at.f17985cN.equals("")) && ((this.f20402at.f17988cQ == null || this.f20402at.f17988cQ.equals("")) && (this.f20402at.f17989cR == null || this.f20402at.f17989cR.equals(""))))) {
                    abrir_secc(view);
                } else {
                    if (this.f20402at.f17986cO != null && !this.f20402at.f17986cO.equals("")) {
                        this.f20407c = new RewardedVideo((Context) this, this.f20402at.f17986cO);
                    }
                    if (this.f20402at.f17985cN != null && !this.f20402at.f17985cN.equals("")) {
                        this.f20406b = C2997g.m10716a(this);
                    }
                    if (this.f20402at.f17988cQ != null && !this.f20402at.f17988cQ.equals("")) {
                        this.f20408d = new RewardedVideoAd(this, this.f20402at.f17988cQ);
                    }
                    if (this.f20402at.f17989cR != null && !this.f20402at.f17989cR.equals("")) {
                        this.f20409e = new StartAppAd(this);
                    }
                    this.f20413i = new ProgressDialog(this);
                    this.f20412h = view;
                    if (!this.f20402at.mo20774a((Context) this, view, this.f20380Y, this.f20413i, this.f20406b, this.f20407c, this.f20408d, this.f20409e)) {
                        abrir_secc(view);
                    }
                }
            } else if (view.getTag(R.id.idaux1).equals("0")) {
                String substring = ((String) view.getTag()).substring(3);
                if (view.getTag(R.id.TAG_ESIMGPROPIA) != null) {
                    z = false;
                }
                if (this.f20402at.mo20758a((Context) this, Integer.parseInt(substring), z).exists()) {
                    Intent intent4 = new Intent(this, t_url.class);
                    StringBuilder sb = new StringBuilder();
                    sb.append("file://");
                    sb.append(this.f20402at.mo20758a((Context) this, Integer.parseInt(substring), z).getAbsolutePath());
                    intent4.putExtra("url", sb.toString());
                    startActivityForResult(intent4, 0);
                } else if (this.f20365J == null || this.f20365J.getStatus() != Status.RUNNING) {
                    try {
                        LinearLayout linearLayout = this.f20368M;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("pb");
                        sb2.append(substring);
                        linearLayout.findViewWithTag(sb2.toString()).setVisibility(0);
                    } catch (Exception unused) {
                    }
                    this.f20365J = new C6176m(substring);
                    this.f20365J.execute(new String[0]);
                }
            } else if (view.getTag(R.id.idaux1).equals("1")) {
                String substring2 = ((String) view.getTag()).substring(3);
                String str2 = (String) view.getTag(R.id.idaux2);
                String str3 = (String) view.getTag(R.id.idaux3);
                if (str3.equals("1")) {
                    str = "mp4";
                } else if (str3.equals("2")) {
                    str = "3gp";
                } else if (str3.equals("3")) {
                    str = "webm";
                } else {
                    return;
                }
                StringBuilder sb3 = new StringBuilder();
                sb3.append("v");
                sb3.append(str2);
                sb3.append(".");
                sb3.append(str);
                String sb4 = sb3.toString();
                String str4 = (String) view.getTag(R.id.idaux4);
                if (this.f20402at.mo20759a((Context) this, sb4).exists()) {
                    Intent intent5 = new Intent(this, t_video.class);
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append("file://");
                    sb5.append(this.f20402at.mo20759a((Context) this, sb4).getAbsolutePath());
                    intent5.putExtra("url", sb5.toString());
                    intent5.putExtra("desde_chat", true);
                    startActivityForResult(intent5, 0);
                } else if (this.f20366K == null || this.f20366K.getStatus() != Status.RUNNING) {
                    try {
                        LinearLayout linearLayout2 = this.f20368M;
                        StringBuilder sb6 = new StringBuilder();
                        sb6.append("pb");
                        sb6.append(substring2);
                        linearLayout2.findViewWithTag(sb6.toString()).setVisibility(0);
                    } catch (Exception unused2) {
                    }
                    C6177n nVar = new C6177n(substring2, str2, str3, str4);
                    this.f20366K = nVar;
                    this.f20366K.execute(new String[0]);
                }
            }
        }
    }

    public void abrir_secc(View view) {
        C5662h a = this.f20402at.mo20761a(view, (Context) this);
        if (a.f18227b) {
            this.f20418n = true;
            Intent intent = new Intent();
            intent.putExtra("finalizar", true);
            intent.putExtra("finalizar_app", a.f18228c);
            setResult(-1, intent);
        }
        if (a.f18229d) {
            startActivityForResult(a.f18226a, 0);
        } else if (a.f18226a != null) {
            if (a.f18227b && this.f20402at.f18045dm != 2) {
                a.f18226a.putExtra("es_root", true);
            }
            this.f20430z = false;
            startActivity(a.f18226a);
        }
        if (this.f20418n && !this.f20411g) {
            mo22083h();
            finish();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo22078a(String str, String str2) {
        this.f20376U = str;
        this.f20377V = str2;
        this.f20385ac = this.f20384ab;
        this.f20375T = this.f20374S;
        Builder builder = new Builder(this);
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        sb.append(" ");
        sb.append(getResources().getString(R.string.solicitaprivado));
        builder.setTitle(sb.toString()).setItems(R.array.privado_opcs, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                if (i == 0) {
                    t_chat.this.m24640b(t_chat.this.f20376U, t_chat.this.f20377V);
                } else if (i == 1) {
                    Editor edit = t_chat.this.f20400ar.edit();
                    StringBuilder sb = new StringBuilder();
                    sb.append("f_ult_");
                    sb.append(t_chat.this.f20376U);
                    edit.putLong(sb.toString(), System.currentTimeMillis());
                    edit.commit();
                    if (t_chat.this.f20426v && t_chat.this.f20357B.containsKey("id_remit")) {
                        t_chat.this.f20418n = true;
                        t_chat.this.mo22083h();
                        t_chat.this.finish();
                    }
                } else if (i == 2) {
                    t_chat.this.f20403au = new Builder(t_chat.this).setCancelable(true).setNegativeButton(t_chat.this.getString(R.string.cancelar), new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialogInterface, int i) {
                            if (t_chat.this.f20426v && t_chat.this.f20357B.containsKey("id_remit")) {
                                t_chat.this.f20418n = true;
                                t_chat.this.mo22083h();
                                t_chat.this.finish();
                            }
                        }
                    }).setPositiveButton(t_chat.this.getString(R.string.aceptar), new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialogInterface, int i) {
                            config.m23852c((Context) t_chat.this, t_chat.this.f20376U);
                            new C6157b(t_chat.this.f20376U, 1, t_chat.this.f20385ac, t_chat.this.f20375T).execute(new String[0]);
                            if (t_chat.this.f20426v && t_chat.this.f20357B.containsKey("id_remit")) {
                                t_chat.this.f20418n = true;
                                t_chat.this.mo22083h();
                                t_chat.this.finish();
                            }
                        }
                    }).setMessage(R.string.avisodenegarprivados).create();
                    if (!t_chat.this.f20380Y.equals("")) {
                        t_chat.this.f20403au.setOnShowListener(new OnShowListener() {
                            public void onShow(DialogInterface dialogInterface) {
                                Button button = t_chat.this.f20403au.getButton(-1);
                                StringBuilder sb = new StringBuilder();
                                sb.append("#");
                                sb.append(t_chat.this.f20380Y);
                                button.setTextColor(Color.parseColor(sb.toString()));
                                Button button2 = t_chat.this.f20403au.getButton(-2);
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append("#");
                                sb2.append(t_chat.this.f20380Y);
                                button2.setTextColor(Color.parseColor(sb2.toString()));
                            }
                        });
                    }
                    t_chat.this.f20403au.show();
                    try {
                        ((TextView) t_chat.this.f20403au.findViewById(16908299)).setTypeface(Typeface.MONOSPACE);
                    } catch (Exception unused) {
                    }
                } else if (i == 3) {
                    t_chat.this.f20403au = new Builder(t_chat.this).setCancelable(true).setNegativeButton(t_chat.this.getString(R.string.cancelar), new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialogInterface, int i) {
                            if (t_chat.this.f20426v && t_chat.this.f20357B.containsKey("id_remit")) {
                                t_chat.this.f20418n = true;
                                t_chat.this.mo22083h();
                                t_chat.this.finish();
                            }
                        }
                    }).setPositiveButton(t_chat.this.getString(R.string.aceptar), new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialogInterface, int i) {
                            new C6157b(t_chat.this.f20376U, 3, t_chat.this.f20385ac, t_chat.this.f20375T).execute(new String[0]);
                            Editor edit = t_chat.this.f20400ar.edit();
                            edit.putInt("privados", 0);
                            edit.commit();
                            if (t_chat.this.f20426v && t_chat.this.f20357B.containsKey("id_remit")) {
                                t_chat.this.f20418n = true;
                                t_chat.this.mo22083h();
                                t_chat.this.finish();
                            }
                        }
                    }).setMessage(R.string.confirmar_ningunprivado).create();
                    if (!t_chat.this.f20380Y.equals("")) {
                        t_chat.this.f20403au.setOnShowListener(new OnShowListener() {
                            public void onShow(DialogInterface dialogInterface) {
                                Button button = t_chat.this.f20403au.getButton(-1);
                                StringBuilder sb = new StringBuilder();
                                sb.append("#");
                                sb.append(t_chat.this.f20380Y);
                                button.setTextColor(Color.parseColor(sb.toString()));
                                Button button2 = t_chat.this.f20403au.getButton(-2);
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append("#");
                                sb2.append(t_chat.this.f20380Y);
                                button2.setTextColor(Color.parseColor(sb2.toString()));
                            }
                        });
                    }
                    t_chat.this.f20403au.show();
                    ((TextView) t_chat.this.f20403au.findViewById(16908299)).setTypeface(Typeface.MONOSPACE);
                }
            }
        }).setCancelable(false);
        try {
            this.f20404av = builder.show();
            ((TextView) this.f20404av.findViewById(16908299)).setTypeface(Typeface.MONOSPACE);
        } catch (Exception unused) {
        }
    }

    public void onSharedPreferenceChanged(final SharedPreferences sharedPreferences, String str) {
        if (!sharedPreferences.contains("accion") || !this.f20423s) {
            if (sharedPreferences.contains("f2_idfrase")) {
                String string = this.f20400ar.getString("idprivado", "0");
                if (!str.equals("f2_ts")) {
                    return;
                }
                if ((string.equals("0") && !this.f20398ap) || (!string.equals("0") && this.f20398ap)) {
                    String string2 = sharedPreferences.getString("f2_idtema", "0");
                    StringBuilder sb = new StringBuilder();
                    sb.append(this.f20389ag);
                    sb.append("");
                    if (string2.equals(sb.toString()) || (!string.equals("0") && this.f20398ap)) {
                        if (!string.equals("0") && !string.equals(sharedPreferences.getString("f2_id", ""))) {
                            String string3 = sharedPreferences.getString("f2_id", "");
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(this.f20384ab);
                            sb2.append("");
                            if (!string3.equals(sb2.toString())) {
                                return;
                            }
                        }
                        runOnUiThread(new Runnable() {
                            /* JADX WARNING: Removed duplicated region for block: B:108:0x03c5  */
                            /* JADX WARNING: Removed duplicated region for block: B:109:0x03ca A[SYNTHETIC, Splitter:B:109:0x03ca] */
                            /* JADX WARNING: Removed duplicated region for block: B:126:0x04a8  */
                            /* JADX WARNING: Removed duplicated region for block: B:90:0x035b  */
                            /* JADX WARNING: Removed duplicated region for block: B:96:0x0377  */
                            /* Code decompiled incorrectly, please refer to instructions dump. */
                            public void run() {
                                /*
                                    r18 = this;
                                    r1 = r18
                                    mega.boicot.t_chat r2 = mega.boicot.t_chat.this
                                    java.lang.String r3 = "layout_inflater"
                                    java.lang.Object r2 = r2.getSystemService(r3)
                                    android.view.LayoutInflater r2 = (android.view.LayoutInflater) r2
                                    android.content.SharedPreferences r3 = r5
                                    java.lang.String r4 = "f2_ultimas"
                                    r5 = 0
                                    boolean r3 = r3.getBoolean(r4, r5)
                                    if (r3 == 0) goto L_0x0044
                                    android.content.SharedPreferences r3 = r5
                                    java.lang.String r4 = "f2_fcrea"
                                    java.lang.String r6 = ""
                                    java.lang.String r3 = r3.getString(r4, r6)
                                    java.lang.String r4 = ""
                                    boolean r4 = r3.equals(r4)
                                    if (r4 != 0) goto L_0x0044
                                    r4 = 6
                                    java.lang.String r3 = r3.substring(r5, r4)
                                    mega.boicot.t_chat r4 = mega.boicot.t_chat.this
                                    java.lang.String r4 = r4.f20379X
                                    boolean r4 = r3.equals(r4)
                                    if (r4 != 0) goto L_0x0044
                                    mega.boicot.t_chat r4 = mega.boicot.t_chat.this
                                    r4.mo22082g()
                                    mega.boicot.t_chat r4 = mega.boicot.t_chat.this
                                    r4.f20379X = r3
                                L_0x0044:
                                    r3 = 2131361877(0x7f0a0055, float:1.8343519E38)
                                    r4 = 0
                                    android.view.View r2 = r2.inflate(r3, r4)
                                    android.widget.LinearLayout r2 = (android.widget.LinearLayout) r2
                                    int r3 = android.os.Build.VERSION.SDK_INT
                                    r6 = 20
                                    r7 = 2131231303(0x7f080247, float:1.8078683E38)
                                    r8 = 2131231302(0x7f080246, float:1.8078681E38)
                                    if (r3 <= r6) goto L_0x00a4
                                    r3 = 2131231301(0x7f080245, float:1.807868E38)
                                    android.view.View r3 = r2.findViewById(r3)
                                    android.widget.ProgressBar r3 = (android.widget.ProgressBar) r3
                                    mega.boicot.t_chat r6 = mega.boicot.t_chat.this
                                    mega.boicot.config r6 = r6.f20402at
                                    java.lang.String r6 = r6.f17890aW
                                    mega.boicot.config.m23838a(r3, r6)
                                    r3 = 2131231304(0x7f080248, float:1.8078685E38)
                                    android.view.View r3 = r2.findViewById(r3)
                                    android.widget.ProgressBar r3 = (android.widget.ProgressBar) r3
                                    mega.boicot.t_chat r6 = mega.boicot.t_chat.this
                                    mega.boicot.config r6 = r6.f20402at
                                    java.lang.String r6 = r6.f17890aW
                                    mega.boicot.config.m23838a(r3, r6)
                                    android.view.View r3 = r2.findViewById(r8)
                                    android.widget.ProgressBar r3 = (android.widget.ProgressBar) r3
                                    mega.boicot.t_chat r6 = mega.boicot.t_chat.this
                                    mega.boicot.config r6 = r6.f20402at
                                    java.lang.String r6 = r6.f17890aW
                                    mega.boicot.config.m23838a(r3, r6)
                                    android.view.View r3 = r2.findViewById(r7)
                                    android.widget.ProgressBar r3 = (android.widget.ProgressBar) r3
                                    mega.boicot.t_chat r6 = mega.boicot.t_chat.this
                                    mega.boicot.config r6 = r6.f20402at
                                    java.lang.String r6 = r6.f17890aW
                                    mega.boicot.config.m23838a(r3, r6)
                                L_0x00a4:
                                    r3 = 2131231043(0x7f080143, float:1.8078156E38)
                                    android.view.View r3 = r2.findViewById(r3)
                                    android.widget.ImageView r3 = (android.widget.ImageView) r3
                                    r6 = 2131231594(0x7f08036a, float:1.8079273E38)
                                    android.view.View r6 = r2.findViewById(r6)
                                    android.widget.TextView r6 = (android.widget.TextView) r6
                                    r9 = 2131231559(0x7f080347, float:1.8079202E38)
                                    android.view.View r9 = r2.findViewById(r9)
                                    android.widget.TextView r9 = (android.widget.TextView) r9
                                    mega.boicot.t_chat r10 = mega.boicot.t_chat.this
                                    java.lang.String r10 = r10.f20381Z
                                    java.lang.String r11 = "FFFFFFFF"
                                    boolean r10 = r10.equals(r11)
                                    if (r10 == 0) goto L_0x00e2
                                    mega.boicot.t_chat r10 = mega.boicot.t_chat.this
                                    java.lang.String r10 = r10.f20383aa
                                    java.lang.String r12 = "FFFFFFFF"
                                    boolean r10 = r10.equals(r12)
                                    if (r10 == 0) goto L_0x00e2
                                    java.lang.String r10 = "#EEEEEE"
                                    int r10 = android.graphics.Color.parseColor(r10)
                                    goto L_0x00e3
                                L_0x00e2:
                                    r10 = -1
                                L_0x00e3:
                                    java.lang.String r12 = "#555555"
                                    int r12 = android.graphics.Color.parseColor(r12)
                                    mega.boicot.t_chat r13 = mega.boicot.t_chat.this
                                    boolean r13 = r13.f20420p
                                    if (r13 != 0) goto L_0x00f5
                                    java.lang.String r12 = "#999999"
                                    int r12 = android.graphics.Color.parseColor(r12)
                                L_0x00f5:
                                    r6.setTextColor(r12)
                                    r9.setTextColor(r12)
                                    android.content.SharedPreferences r12 = r5
                                    java.lang.String r13 = "f2_id"
                                    java.lang.String r14 = ""
                                    java.lang.String r12 = r12.getString(r13, r14)
                                    java.lang.StringBuilder r13 = new java.lang.StringBuilder
                                    r13.<init>()
                                    mega.boicot.t_chat r14 = mega.boicot.t_chat.this
                                    int r14 = r14.f20384ab
                                    r13.append(r14)
                                    java.lang.String r14 = ""
                                    r13.append(r14)
                                    java.lang.String r13 = r13.toString()
                                    boolean r12 = r12.equals(r13)
                                    r13 = 2131231020(0x7f08012c, float:1.807811E38)
                                    r14 = 2131231019(0x7f08012b, float:1.8078107E38)
                                    r11 = 2131231021(0x7f08012d, float:1.8078111E38)
                                    r15 = 1
                                    r8 = 2131231017(0x7f080129, float:1.8078103E38)
                                    if (r12 == 0) goto L_0x0161
                                    mega.boicot.t_chat r12 = mega.boicot.t_chat.this
                                    boolean r12 = r12.f20420p
                                    if (r12 != 0) goto L_0x0137
                                    r12 = -1
                                    goto L_0x0139
                                L_0x0137:
                                    r12 = -16777216(0xffffffffff000000, float:-1.7014118E38)
                                L_0x0139:
                                    mega.boicot.t_chat r7 = mega.boicot.t_chat.this
                                    android.content.res.Resources r7 = r7.getResources()
                                    r4 = 2131558744(0x7f0d0158, float:1.8742812E38)
                                    java.lang.String r4 = r7.getString(r4)
                                    r6.setText(r4)
                                    mega.boicot.t_chat r4 = mega.boicot.t_chat.this
                                    int r4 = r4.f20391ai
                                    if (r4 <= 0) goto L_0x015e
                                    mega.boicot.t_chat r4 = mega.boicot.t_chat.this
                                    android.graphics.Bitmap r4 = r4.f20358C
                                    if (r4 == 0) goto L_0x015e
                                    mega.boicot.t_chat r4 = mega.boicot.t_chat.this
                                    android.graphics.Bitmap r4 = r4.f20358C
                                    r3.setImageBitmap(r4)
                                L_0x015e:
                                    r11 = r12
                                    goto L_0x0516
                                L_0x0161:
                                    android.content.SharedPreferences r4 = r5
                                    java.lang.String r7 = "f2_nombre"
                                    java.lang.String r12 = ""
                                    java.lang.String r4 = r4.getString(r7, r12)
                                    java.lang.String r4 = r4.trim()
                                    r6.setText(r4)
                                    android.content.SharedPreferences r4 = r5
                                    java.lang.String r6 = "f2_id"
                                    java.lang.String r7 = "0"
                                    java.lang.String r4 = r4.getString(r6, r7)
                                    r2.setTag(r8, r4)
                                    android.content.SharedPreferences r4 = r5
                                    java.lang.String r6 = "f2_privados"
                                    java.lang.String r7 = "1"
                                    java.lang.String r4 = r4.getString(r6, r7)
                                    r2.setTag(r14, r4)
                                    android.content.SharedPreferences r4 = r5
                                    java.lang.String r6 = "f2_nombre"
                                    java.lang.String r7 = ""
                                    java.lang.String r4 = r4.getString(r6, r7)
                                    r2.setTag(r13, r4)
                                    android.content.SharedPreferences r4 = r5
                                    java.lang.String r6 = "f2_coments"
                                    java.lang.String r7 = "1"
                                    java.lang.String r4 = r4.getString(r6, r7)
                                    r2.setTag(r11, r4)
                                    r4 = 2131231022(0x7f08012e, float:1.8078113E38)
                                    android.content.SharedPreferences r6 = r5
                                    java.lang.String r7 = "f2_fnac_d"
                                    java.lang.String r12 = "0"
                                    java.lang.String r6 = r6.getString(r7, r12)
                                    r2.setTag(r4, r6)
                                    r4 = 2131231023(0x7f08012f, float:1.8078115E38)
                                    android.content.SharedPreferences r6 = r5
                                    java.lang.String r7 = "f2_fnac_m"
                                    java.lang.String r12 = "0"
                                    java.lang.String r6 = r6.getString(r7, r12)
                                    r2.setTag(r4, r6)
                                    r4 = 2131231024(0x7f080130, float:1.8078117E38)
                                    android.content.SharedPreferences r6 = r5
                                    java.lang.String r7 = "f2_fnac_a"
                                    java.lang.String r12 = "0"
                                    java.lang.String r6 = r6.getString(r7, r12)
                                    r2.setTag(r4, r6)
                                    r4 = 2131231025(0x7f080131, float:1.807812E38)
                                    android.content.SharedPreferences r6 = r5
                                    java.lang.String r7 = "f2_sexo"
                                    java.lang.String r12 = "0"
                                    java.lang.String r6 = r6.getString(r7, r12)
                                    r2.setTag(r4, r6)
                                    r4 = 2131231026(0x7f080132, float:1.8078121E38)
                                    android.content.SharedPreferences r6 = r5
                                    java.lang.String r7 = "f2_vfoto"
                                    java.lang.String r12 = "0"
                                    java.lang.String r6 = r6.getString(r7, r12)
                                    r2.setTag(r4, r6)
                                    mega.boicot.t_chat r4 = mega.boicot.t_chat.this
                                    android.content.SharedPreferences r4 = r4.f20400ar
                                    java.lang.String r6 = "idprivado"
                                    java.lang.String r7 = "0"
                                    java.lang.String r4 = r4.getString(r6, r7)
                                    java.lang.String r6 = "0"
                                    boolean r4 = r4.equals(r6)
                                    if (r4 != 0) goto L_0x021c
                                    r4 = 2131231018(0x7f08012a, float:1.8078105E38)
                                    android.content.SharedPreferences r6 = r5
                                    java.lang.String r7 = "f2_desdepriv"
                                    java.lang.String r12 = "1"
                                    java.lang.String r6 = r6.getString(r7, r12)
                                    r2.setTag(r4, r6)
                                L_0x021c:
                                    mega.boicot.t_chat r4 = mega.boicot.t_chat.this
                                    r2.setOnClickListener(r4)
                                    android.content.SharedPreferences r4 = r5
                                    java.lang.String r6 = "f2_id"
                                    java.lang.String r7 = ""
                                    java.lang.String r4 = r4.getString(r6, r7)
                                    int r6 = r4.length()
                                    int r6 = r6 - r15
                                    int r7 = r4.length()
                                    java.lang.String r6 = r4.substring(r6, r7)
                                    mega.boicot.t_chat r7 = mega.boicot.t_chat.this
                                    boolean r7 = r7.f20420p
                                    if (r7 == 0) goto L_0x02d6
                                    java.lang.String r7 = "0"
                                    boolean r7 = r6.equals(r7)
                                    if (r7 != 0) goto L_0x02c7
                                    java.lang.String r7 = "5"
                                    boolean r7 = r6.equals(r7)
                                    if (r7 == 0) goto L_0x0250
                                    goto L_0x02c7
                                L_0x0250:
                                    java.lang.String r7 = "1"
                                    boolean r7 = r6.equals(r7)
                                    if (r7 != 0) goto L_0x02ba
                                    java.lang.String r7 = "6"
                                    boolean r7 = r6.equals(r7)
                                    if (r7 == 0) goto L_0x0261
                                    goto L_0x02ba
                                L_0x0261:
                                    java.lang.String r7 = "2"
                                    boolean r7 = r6.equals(r7)
                                    if (r7 != 0) goto L_0x02ad
                                    java.lang.String r7 = "7"
                                    boolean r7 = r6.equals(r7)
                                    if (r7 == 0) goto L_0x0272
                                    goto L_0x02ad
                                L_0x0272:
                                    java.lang.String r7 = "3"
                                    boolean r7 = r6.equals(r7)
                                    if (r7 != 0) goto L_0x02a0
                                    java.lang.String r7 = "8"
                                    boolean r7 = r6.equals(r7)
                                    if (r7 == 0) goto L_0x0283
                                    goto L_0x02a0
                                L_0x0283:
                                    java.lang.String r7 = "4"
                                    boolean r7 = r6.equals(r7)
                                    if (r7 != 0) goto L_0x0293
                                    java.lang.String r7 = "9"
                                    boolean r6 = r6.equals(r7)
                                    if (r6 == 0) goto L_0x032c
                                L_0x0293:
                                    java.lang.String r6 = "#FFCC0000"
                                    int r6 = android.graphics.Color.parseColor(r6)
                                    java.lang.String r7 = "#FFFFDFDF"
                                    int r7 = android.graphics.Color.parseColor(r7)
                                    goto L_0x02d3
                                L_0x02a0:
                                    java.lang.String r6 = "#FF9E5400"
                                    int r6 = android.graphics.Color.parseColor(r6)
                                    java.lang.String r7 = "#FFFFF0DF"
                                    int r7 = android.graphics.Color.parseColor(r7)
                                    goto L_0x02d3
                                L_0x02ad:
                                    java.lang.String r6 = "#FF3D5C00"
                                    int r6 = android.graphics.Color.parseColor(r6)
                                    java.lang.String r7 = "#FFF4FFDF"
                                    int r7 = android.graphics.Color.parseColor(r7)
                                    goto L_0x02d3
                                L_0x02ba:
                                    java.lang.String r6 = "#FF9933CC"
                                    int r6 = android.graphics.Color.parseColor(r6)
                                    java.lang.String r7 = "#FFF2E6F9"
                                    int r7 = android.graphics.Color.parseColor(r7)
                                    goto L_0x02d3
                                L_0x02c7:
                                    java.lang.String r6 = "#FF00698C"
                                    int r6 = android.graphics.Color.parseColor(r6)
                                    java.lang.String r7 = "#FFDFF8FF"
                                    int r7 = android.graphics.Color.parseColor(r7)
                                L_0x02d3:
                                    r10 = r7
                                    goto L_0x0351
                                L_0x02d6:
                                    java.lang.String r7 = "0"
                                    boolean r7 = r6.equals(r7)
                                    if (r7 != 0) goto L_0x034b
                                    java.lang.String r7 = "5"
                                    boolean r7 = r6.equals(r7)
                                    if (r7 == 0) goto L_0x02e8
                                    goto L_0x034b
                                L_0x02e8:
                                    java.lang.String r7 = "1"
                                    boolean r7 = r6.equals(r7)
                                    if (r7 != 0) goto L_0x0344
                                    java.lang.String r7 = "6"
                                    boolean r7 = r6.equals(r7)
                                    if (r7 == 0) goto L_0x02f9
                                    goto L_0x0344
                                L_0x02f9:
                                    java.lang.String r7 = "2"
                                    boolean r7 = r6.equals(r7)
                                    if (r7 != 0) goto L_0x033d
                                    java.lang.String r7 = "7"
                                    boolean r7 = r6.equals(r7)
                                    if (r7 == 0) goto L_0x030a
                                    goto L_0x033d
                                L_0x030a:
                                    java.lang.String r7 = "3"
                                    boolean r7 = r6.equals(r7)
                                    if (r7 != 0) goto L_0x0336
                                    java.lang.String r7 = "8"
                                    boolean r7 = r6.equals(r7)
                                    if (r7 == 0) goto L_0x031b
                                    goto L_0x0336
                                L_0x031b:
                                    java.lang.String r7 = "4"
                                    boolean r7 = r6.equals(r7)
                                    if (r7 != 0) goto L_0x032f
                                    java.lang.String r7 = "9"
                                    boolean r6 = r6.equals(r7)
                                    if (r6 == 0) goto L_0x032c
                                    goto L_0x032f
                                L_0x032c:
                                    r6 = -16777216(0xffffffffff000000, float:-1.7014118E38)
                                    goto L_0x0351
                                L_0x032f:
                                    java.lang.String r6 = "#FF33FFFF"
                                    int r6 = android.graphics.Color.parseColor(r6)
                                    goto L_0x0351
                                L_0x0336:
                                    java.lang.String r6 = "#FF87BFFF"
                                    int r6 = android.graphics.Color.parseColor(r6)
                                    goto L_0x0351
                                L_0x033d:
                                    java.lang.String r6 = "#FFC9ADFF"
                                    int r6 = android.graphics.Color.parseColor(r6)
                                    goto L_0x0351
                                L_0x0344:
                                    java.lang.String r6 = "#FF66CC33"
                                    int r6 = android.graphics.Color.parseColor(r6)
                                    goto L_0x0351
                                L_0x034b:
                                    java.lang.String r6 = "#FFFF6633"
                                    int r6 = android.graphics.Color.parseColor(r6)
                                L_0x0351:
                                    mega.boicot.t_chat r7 = mega.boicot.t_chat.this
                                    mega.boicot.config r7 = r7.f20402at
                                    boolean r7 = r7.f17931bL
                                    if (r7 != 0) goto L_0x0365
                                    mega.boicot.t_chat r6 = mega.boicot.t_chat.this
                                    boolean r6 = r6.f20420p
                                    if (r6 == 0) goto L_0x0364
                                    r6 = -16777216(0xffffffffff000000, float:-1.7014118E38)
                                    goto L_0x0365
                                L_0x0364:
                                    r6 = -1
                                L_0x0365:
                                    android.content.SharedPreferences r7 = r5
                                    java.lang.String r12 = "f2_vfoto"
                                    java.lang.String r13 = "0"
                                    java.lang.String r7 = r7.getString(r12, r13)
                                    mega.boicot.t_chat r12 = mega.boicot.t_chat.this
                                    int r12 = r12.f20391ai
                                    if (r12 <= 0) goto L_0x03a9
                                    java.lang.String r12 = "0"
                                    boolean r12 = r7.equals(r12)
                                    if (r12 == 0) goto L_0x03a9
                                    mega.boicot.t_chat r4 = mega.boicot.t_chat.this
                                    boolean r4 = r4.f20420p
                                    if (r4 == 0) goto L_0x0397
                                    mega.boicot.t_chat r4 = mega.boicot.t_chat.this
                                    android.content.res.Resources r4 = r4.getResources()
                                    r7 = 2131165535(0x7f07015f, float:1.794529E38)
                                    android.graphics.drawable.Drawable r4 = r4.getDrawable(r7)
                                    r3.setImageDrawable(r4)
                                    goto L_0x0515
                                L_0x0397:
                                    mega.boicot.t_chat r4 = mega.boicot.t_chat.this
                                    android.content.res.Resources r4 = r4.getResources()
                                    r7 = 2131165533(0x7f07015d, float:1.7945286E38)
                                    android.graphics.drawable.Drawable r4 = r4.getDrawable(r7)
                                    r3.setImageDrawable(r4)
                                    goto L_0x0515
                                L_0x03a9:
                                    mega.boicot.t_chat r12 = mega.boicot.t_chat.this
                                    int r12 = r12.f20391ai
                                    if (r12 <= 0) goto L_0x0515
                                    java.lang.String r12 = "0"
                                    boolean r12 = r7.equals(r12)
                                    if (r12 != 0) goto L_0x0515
                                    mega.boicot.t_chat r12 = mega.boicot.t_chat.this
                                    java.util.Map<java.lang.String, android.graphics.Bitmap> r12 = r12.f20359D
                                    java.lang.Object r12 = r12.get(r4)
                                    android.graphics.Bitmap r12 = (android.graphics.Bitmap) r12
                                    if (r12 == 0) goto L_0x03ca
                                    r3.setImageBitmap(r12)
                                    goto L_0x0489
                                L_0x03ca:
                                    java.io.File r12 = new java.io.File     // Catch:{ Exception -> 0x0462 }
                                    mega.boicot.t_chat r13 = mega.boicot.t_chat.this     // Catch:{ Exception -> 0x0462 }
                                    java.io.File r13 = r13.f20362G     // Catch:{ Exception -> 0x0462 }
                                    java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0462 }
                                    r14.<init>()     // Catch:{ Exception -> 0x0462 }
                                    java.lang.String r11 = "fperfil_"
                                    r14.append(r11)     // Catch:{ Exception -> 0x0462 }
                                    r14.append(r4)     // Catch:{ Exception -> 0x0462 }
                                    java.lang.String r11 = ".jpg"
                                    r14.append(r11)     // Catch:{ Exception -> 0x0462 }
                                    java.lang.String r11 = r14.toString()     // Catch:{ Exception -> 0x0462 }
                                    r12.<init>(r13, r11)     // Catch:{ Exception -> 0x0462 }
                                    android.graphics.BitmapFactory$Options r11 = new android.graphics.BitmapFactory$Options     // Catch:{ Exception -> 0x0462 }
                                    r11.<init>()     // Catch:{ Exception -> 0x0462 }
                                    r11.inJustDecodeBounds = r15     // Catch:{ Exception -> 0x0462 }
                                    java.lang.String r13 = r12.getPath()     // Catch:{ Exception -> 0x0462 }
                                    android.graphics.BitmapFactory.decodeFile(r13, r11)     // Catch:{ Exception -> 0x0462 }
                                    int r13 = r11.outWidth     // Catch:{ Exception -> 0x0462 }
                                    r13 = 1111490560(0x42400000, float:48.0)
                                    mega.boicot.t_chat r14 = mega.boicot.t_chat.this     // Catch:{ Exception -> 0x0462 }
                                    android.content.res.Resources r14 = r14.getResources()     // Catch:{ Exception -> 0x0462 }
                                    android.util.DisplayMetrics r14 = r14.getDisplayMetrics()     // Catch:{ Exception -> 0x0462 }
                                    float r14 = r14.density     // Catch:{ Exception -> 0x0462 }
                                    float r13 = r13 * r14
                                    r14 = 1056964608(0x3f000000, float:0.5)
                                    float r13 = r13 + r14
                                    int r13 = (int) r13     // Catch:{ Exception -> 0x0462 }
                                    r14 = 1111490560(0x42400000, float:48.0)
                                    mega.boicot.t_chat r15 = mega.boicot.t_chat.this     // Catch:{ Exception -> 0x0462 }
                                    android.content.res.Resources r15 = r15.getResources()     // Catch:{ Exception -> 0x0462 }
                                    android.util.DisplayMetrics r15 = r15.getDisplayMetrics()     // Catch:{ Exception -> 0x0462 }
                                    float r15 = r15.density     // Catch:{ Exception -> 0x0462 }
                                    float r14 = r14 * r15
                                    r15 = 1056964608(0x3f000000, float:0.5)
                                    float r14 = r14 + r15
                                    int r14 = (int) r14     // Catch:{ Exception -> 0x0462 }
                                    int r15 = r11.outWidth     // Catch:{ Exception -> 0x0462 }
                                    int r11 = r11.outHeight     // Catch:{ Exception -> 0x0462 }
                                    if (r15 > r13) goto L_0x042a
                                    if (r11 > r14) goto L_0x042a
                                    r16 = 1
                                    goto L_0x042c
                                L_0x042a:
                                    r16 = r5
                                L_0x042c:
                                    if (r16 != 0) goto L_0x0449
                                    int r11 = mega.boicot.config.m23824a(r15, r11, r13, r14)     // Catch:{ Exception -> 0x0462 }
                                    float r13 = (float) r15     // Catch:{ Exception -> 0x0462 }
                                    float r11 = (float) r11     // Catch:{ Exception -> 0x0462 }
                                    float r13 = r13 / r11
                                    int r11 = java.lang.Math.round(r13)     // Catch:{ Exception -> 0x0462 }
                                    android.graphics.BitmapFactory$Options r13 = new android.graphics.BitmapFactory$Options     // Catch:{ Exception -> 0x0462 }
                                    r13.<init>()     // Catch:{ Exception -> 0x0462 }
                                    r13.inSampleSize = r11     // Catch:{ Exception -> 0x0462 }
                                    java.lang.String r11 = r12.getPath()     // Catch:{ Exception -> 0x0462 }
                                    android.graphics.Bitmap r11 = android.graphics.BitmapFactory.decodeFile(r11, r13)     // Catch:{ Exception -> 0x0462 }
                                    goto L_0x0457
                                L_0x0449:
                                    mega.boicot.t_chat r11 = mega.boicot.t_chat.this     // Catch:{ Exception -> 0x0462 }
                                    android.content.ContentResolver r11 = r11.getContentResolver()     // Catch:{ Exception -> 0x0462 }
                                    android.net.Uri r12 = android.net.Uri.fromFile(r12)     // Catch:{ Exception -> 0x0462 }
                                    android.graphics.Bitmap r11 = android.provider.MediaStore.Images.Media.getBitmap(r11, r12)     // Catch:{ Exception -> 0x0462 }
                                L_0x0457:
                                    r3.setImageBitmap(r11)     // Catch:{ Exception -> 0x0462 }
                                    mega.boicot.t_chat r12 = mega.boicot.t_chat.this     // Catch:{ Exception -> 0x0462 }
                                    java.util.Map<java.lang.String, android.graphics.Bitmap> r12 = r12.f20359D     // Catch:{ Exception -> 0x0462 }
                                    r12.put(r4, r11)     // Catch:{ Exception -> 0x0462 }
                                    goto L_0x0489
                                L_0x0462:
                                    mega.boicot.t_chat r11 = mega.boicot.t_chat.this
                                    boolean r11 = r11.f20420p
                                    if (r11 == 0) goto L_0x0479
                                    mega.boicot.t_chat r11 = mega.boicot.t_chat.this
                                    android.content.res.Resources r11 = r11.getResources()
                                    r12 = 2131165535(0x7f07015f, float:1.794529E38)
                                    android.graphics.drawable.Drawable r11 = r11.getDrawable(r12)
                                    r3.setImageDrawable(r11)
                                    goto L_0x0489
                                L_0x0479:
                                    mega.boicot.t_chat r11 = mega.boicot.t_chat.this
                                    android.content.res.Resources r11 = r11.getResources()
                                    r12 = 2131165533(0x7f07015d, float:1.7945286E38)
                                    android.graphics.drawable.Drawable r11 = r11.getDrawable(r12)
                                    r3.setImageDrawable(r11)
                                L_0x0489:
                                    android.content.SharedPreferences r11 = r5
                                    java.lang.StringBuilder r12 = new java.lang.StringBuilder
                                    r12.<init>()
                                    java.lang.String r13 = "fperfil_"
                                    r12.append(r13)
                                    r12.append(r4)
                                    java.lang.String r12 = r12.toString()
                                    java.lang.String r13 = ""
                                    java.lang.String r11 = r11.getString(r12, r13)
                                    boolean r11 = r11.equals(r7)
                                    if (r11 != 0) goto L_0x0515
                                    mega.boicot.t_chat r11 = mega.boicot.t_chat.this
                                    boolean r11 = r11.f20419o
                                    if (r11 == 0) goto L_0x04b9
                                    r11 = 2131231304(0x7f080248, float:1.8078685E38)
                                    android.view.View r11 = r2.findViewById(r11)
                                    r11.setVisibility(r5)
                                    goto L_0x04c3
                                L_0x04b9:
                                    r11 = 2131231301(0x7f080245, float:1.807868E38)
                                    android.view.View r11 = r2.findViewById(r11)
                                    r11.setVisibility(r5)
                                L_0x04c3:
                                    mega.boicot.t_chat r11 = mega.boicot.t_chat.this
                                    java.util.Map<java.lang.String, java.lang.String> r11 = r11.f20360E
                                    boolean r11 = r11.containsKey(r4)
                                    if (r11 != 0) goto L_0x0515
                                    mega.boicot.t_chat r11 = mega.boicot.t_chat.this
                                    java.util.Map<java.lang.String, java.lang.String> r11 = r11.f20361F
                                    boolean r11 = r11.containsKey(r4)
                                    if (r11 == 0) goto L_0x04e7
                                    mega.boicot.t_chat r11 = mega.boicot.t_chat.this
                                    java.util.Map<java.lang.String, java.lang.String> r11 = r11.f20361F
                                    java.lang.Object r11 = r11.get(r4)
                                    java.lang.String r11 = (java.lang.String) r11
                                    boolean r11 = r11.equals(r7)
                                    if (r11 != 0) goto L_0x0515
                                L_0x04e7:
                                    mega.boicot.t_chat r11 = mega.boicot.t_chat.this
                                    java.util.Map<java.lang.String, java.lang.String> r11 = r11.f20360E
                                    r11.put(r4, r7)
                                    mega.boicot.t_chat r4 = mega.boicot.t_chat.this
                                    mega.boicot.t_chat$k r4 = r4.f20363H
                                    if (r4 == 0) goto L_0x0500
                                    mega.boicot.t_chat r4 = mega.boicot.t_chat.this
                                    mega.boicot.t_chat$k r4 = r4.f20363H
                                    android.os.AsyncTask$Status r4 = r4.getStatus()
                                    android.os.AsyncTask$Status r7 = android.os.AsyncTask.Status.RUNNING
                                    if (r4 == r7) goto L_0x0515
                                L_0x0500:
                                    mega.boicot.t_chat r4 = mega.boicot.t_chat.this
                                    mega.boicot.t_chat$k r7 = new mega.boicot.t_chat$k
                                    mega.boicot.t_chat r11 = mega.boicot.t_chat.this
                                    r12 = 0
                                    r7.<init>()
                                    r4.f20363H = r7
                                    mega.boicot.t_chat r4 = mega.boicot.t_chat.this
                                    mega.boicot.t_chat$k r4 = r4.f20363H
                                    java.lang.String[] r7 = new java.lang.String[r5]
                                    r4.execute(r7)
                                L_0x0515:
                                    r11 = r6
                                L_0x0516:
                                    mega.boicot.t_chat r4 = mega.boicot.t_chat.this
                                    mega.boicot.config r4 = r4.f20402at
                                    int r4 = r4.f17934bO
                                    r6 = 2
                                    if (r4 <= 0) goto L_0x0595
                                    mega.boicot.t_chat r4 = mega.boicot.t_chat.this
                                    mega.boicot.config r4 = r4.f20402at
                                    java.lang.String r4 = r4.f17937bR
                                    java.lang.String r7 = ""
                                    boolean r4 = r4.equals(r7)
                                    if (r4 != 0) goto L_0x054e
                                    java.lang.StringBuilder r4 = new java.lang.StringBuilder
                                    r4.<init>()
                                    java.lang.String r7 = "#"
                                    r4.append(r7)
                                    mega.boicot.t_chat r7 = mega.boicot.t_chat.this
                                    mega.boicot.config r7 = r7.f20402at
                                    java.lang.String r7 = r7.f17937bR
                                    r4.append(r7)
                                    java.lang.String r4 = r4.toString()
                                    int r10 = android.graphics.Color.parseColor(r4)
                                L_0x054e:
                                    r4 = 2131165327(0x7f07008f, float:1.7944868E38)
                                    mega.boicot.t_chat r7 = mega.boicot.t_chat.this
                                    mega.boicot.config r7 = r7.f20402at
                                    int r7 = r7.f17934bO
                                    if (r7 != r6) goto L_0x055f
                                    r4 = 2131165328(0x7f070090, float:1.794487E38)
                                    goto L_0x057c
                                L_0x055f:
                                    mega.boicot.t_chat r7 = mega.boicot.t_chat.this
                                    mega.boicot.config r7 = r7.f20402at
                                    int r7 = r7.f17934bO
                                    r12 = 3
                                    if (r7 != r12) goto L_0x056e
                                    r4 = 2131165329(0x7f070091, float:1.7944872E38)
                                    goto L_0x057c
                                L_0x056e:
                                    mega.boicot.t_chat r7 = mega.boicot.t_chat.this
                                    mega.boicot.config r7 = r7.f20402at
                                    int r7 = r7.f17934bO
                                    r12 = 4
                                    if (r7 != r12) goto L_0x057c
                                    r4 = 2131165330(0x7f070092, float:1.7944874E38)
                                L_0x057c:
                                    mega.boicot.t_chat r7 = mega.boicot.t_chat.this
                                    android.content.res.Resources r7 = r7.getResources()
                                    android.graphics.drawable.Drawable r4 = r7.getDrawable(r4)
                                    android.graphics.PorterDuff$Mode r7 = android.graphics.PorterDuff.Mode.MULTIPLY
                                    r4.setColorFilter(r10, r7)
                                    r7 = 2131231196(0x7f0801dc, float:1.8078466E38)
                                    android.view.View r7 = r2.findViewById(r7)
                                    r7.setBackgroundDrawable(r4)
                                L_0x0595:
                                    android.content.SharedPreferences r4 = r5
                                    java.lang.String r7 = "f2_fcrea"
                                    java.lang.String r10 = ""
                                    java.lang.String r4 = r4.getString(r7, r10)
                                    java.lang.String r7 = ""
                                    boolean r7 = r4.equals(r7)
                                    if (r7 != 0) goto L_0x05cc
                                    r7 = 6
                                    r10 = 10
                                    java.lang.String r4 = r4.substring(r7, r10)
                                    java.text.SimpleDateFormat r7 = new java.text.SimpleDateFormat
                                    java.lang.String r10 = "HHmm"
                                    r7.<init>(r10)
                                    java.util.Date r4 = r7.parse(r4)     // Catch:{ Exception -> 0x05c7 }
                                    mega.boicot.t_chat r7 = mega.boicot.t_chat.this     // Catch:{ Exception -> 0x05c7 }
                                    java.text.DateFormat r7 = android.text.format.DateFormat.getTimeFormat(r7)     // Catch:{ Exception -> 0x05c7 }
                                    java.lang.String r4 = r7.format(r4)     // Catch:{ Exception -> 0x05c7 }
                                    r9.setText(r4)     // Catch:{ Exception -> 0x05c7 }
                                    goto L_0x05cc
                                L_0x05c7:
                                    r0 = move-exception
                                    r4 = r0
                                    r4.printStackTrace()
                                L_0x05cc:
                                    mega.boicot.t_chat r4 = mega.boicot.t_chat.this
                                    int r4 = r4.f20391ai
                                    r7 = 8
                                    if (r4 <= 0) goto L_0x05f0
                                    mega.boicot.t_chat r4 = mega.boicot.t_chat.this
                                    mega.boicot.config r4 = r4.f20402at
                                    boolean r4 = r4.f17931bL
                                    if (r4 == 0) goto L_0x05e2
                                    r4 = r11
                                    goto L_0x05ec
                                L_0x05e2:
                                    mega.boicot.t_chat r4 = mega.boicot.t_chat.this
                                    boolean r4 = r4.f20419o
                                    if (r4 == 0) goto L_0x05eb
                                    r4 = -16777216(0xffffffffff000000, float:-1.7014118E38)
                                    goto L_0x05ec
                                L_0x05eb:
                                    r4 = -1
                                L_0x05ec:
                                    r3.setBackgroundColor(r4)
                                    goto L_0x0646
                                L_0x05f0:
                                    r3.setVisibility(r7)
                                    mega.boicot.t_chat r3 = mega.boicot.t_chat.this
                                    mega.boicot.config r3 = r3.f20402at
                                    int r3 = r3.f17934bO
                                    if (r3 <= 0) goto L_0x061c
                                    r3 = 2131230977(0x7f080101, float:1.8078022E38)
                                    android.view.View r3 = r2.findViewById(r3)
                                    r3.setVisibility(r7)
                                    android.widget.LinearLayout$LayoutParams r3 = new android.widget.LinearLayout$LayoutParams
                                    r4 = -2
                                    r9 = -2
                                    r3.<init>(r4, r9)
                                    r3.setMargins(r5, r5, r5, r5)
                                    r4 = 2131231196(0x7f0801dc, float:1.8078466E38)
                                    android.view.View r4 = r2.findViewById(r4)
                                    r4.setLayoutParams(r3)
                                    goto L_0x0646
                                L_0x061c:
                                    mega.boicot.t_chat r3 = mega.boicot.t_chat.this
                                    mega.boicot.config r3 = r3.f20402at
                                    boolean r3 = r3.f17931bL
                                    if (r3 == 0) goto L_0x0628
                                    r3 = r11
                                    goto L_0x0632
                                L_0x0628:
                                    mega.boicot.t_chat r3 = mega.boicot.t_chat.this
                                    boolean r3 = r3.f20419o
                                    if (r3 == 0) goto L_0x0631
                                    r3 = -16777216(0xffffffffff000000, float:-1.7014118E38)
                                    goto L_0x0632
                                L_0x0631:
                                    r3 = -1
                                L_0x0632:
                                    r4 = 2131231631(0x7f08038f, float:1.8079348E38)
                                    android.view.View r4 = r2.findViewById(r4)
                                    r4.setBackgroundColor(r3)
                                    r3 = 2131231631(0x7f08038f, float:1.8079348E38)
                                    android.view.View r3 = r2.findViewById(r3)
                                    r3.setVisibility(r5)
                                L_0x0646:
                                    r3 = 2131231566(0x7f08034e, float:1.8079217E38)
                                    android.view.View r3 = r2.findViewById(r3)
                                    android.widget.TextView r3 = (android.widget.TextView) r3
                                    android.content.SharedPreferences r4 = r5
                                    java.lang.String r9 = "f2_frase"
                                    java.lang.String r10 = ""
                                    java.lang.String r4 = r4.getString(r9, r10)
                                    android.content.SharedPreferences r9 = r5
                                    java.lang.String r10 = "f2_tipo"
                                    java.lang.String r12 = ""
                                    java.lang.String r9 = r9.getString(r10, r12)
                                    java.lang.String r10 = "1"
                                    boolean r9 = r9.equals(r10)
                                    java.lang.String r10 = ""
                                    boolean r10 = r4.equals(r10)
                                    r12 = 2131230976(0x7f080100, float:1.807802E38)
                                    r13 = 2131231087(0x7f08016f, float:1.8078245E38)
                                    if (r10 != 0) goto L_0x073f
                                    int r10 = r4.length()
                                    r14 = 14
                                    if (r10 <= r14) goto L_0x071a
                                    r10 = 14
                                    java.lang.String r10 = r4.substring(r5, r10)
                                    java.lang.String r14 = "@@idfoto_temp:"
                                    boolean r10 = r10.equals(r14)
                                    if (r10 == 0) goto L_0x071a
                                    java.lang.String r10 = "@@"
                                    int r10 = r4.indexOf(r10, r6)
                                    r11 = 14
                                    java.lang.String r4 = r4.substring(r11, r10)
                                    r3.setVisibility(r7)
                                    android.view.View r3 = r2.findViewById(r13)
                                    android.widget.ImageView r3 = (android.widget.ImageView) r3
                                    if (r9 == 0) goto L_0x06ba
                                    java.lang.String r9 = "1"
                                    r3.setTag(r8, r9)
                                    android.content.SharedPreferences r8 = r5
                                    java.lang.String r9 = "f2_id"
                                    java.lang.String r10 = ""
                                    java.lang.String r8 = r8.getString(r9, r10)
                                    r9 = 2131231021(0x7f08012d, float:1.8078111E38)
                                    r3.setTag(r9, r8)
                                    goto L_0x06bf
                                L_0x06ba:
                                    java.lang.String r9 = "0"
                                    r3.setTag(r8, r9)
                                L_0x06bf:
                                    r8 = 2131230729(0x7f080009, float:1.807752E38)
                                    r9 = 1
                                    java.lang.Integer r10 = java.lang.Integer.valueOf(r9)
                                    r3.setTag(r8, r10)
                                    java.lang.StringBuilder r8 = new java.lang.StringBuilder
                                    r8.<init>()
                                    java.lang.String r10 = "imgtemp"
                                    r8.append(r10)
                                    r8.append(r4)
                                    java.lang.String r8 = r8.toString()
                                    r3.setTag(r8)
                                    mega.boicot.t_chat r8 = mega.boicot.t_chat.this
                                    int r10 = java.lang.Integer.parseInt(r4)
                                    r8.m24632a(r10, r9, r3)
                                    android.view.View r3 = r2.findViewById(r12)
                                    r3.setVisibility(r5)
                                    mega.boicot.t_chat r3 = mega.boicot.t_chat.this
                                    boolean r3 = r3.f20419o
                                    if (r3 == 0) goto L_0x0707
                                    r3 = 2131231303(0x7f080247, float:1.8078683E38)
                                    android.view.View r8 = r2.findViewById(r3)
                                    r8.setVisibility(r5)
                                    android.view.View r3 = r2.findViewById(r3)
                                    r3.setTag(r4)
                                    goto L_0x0b6c
                                L_0x0707:
                                    r3 = 2131231302(0x7f080246, float:1.8078681E38)
                                    android.view.View r8 = r2.findViewById(r3)
                                    r8.setVisibility(r5)
                                    android.view.View r3 = r2.findViewById(r3)
                                    r3.setTag(r4)
                                    goto L_0x0b6c
                                L_0x071a:
                                    mega.boicot.t_chat r8 = mega.boicot.t_chat.this
                                    java.lang.CharSequence r4 = mega.boicot.t_chat.m24629a(r8, r4)
                                    mega.boicot.t_chat r8 = mega.boicot.t_chat.this
                                    mega.boicot.config r8 = r8.f20402at
                                    boolean r8 = r8.f17927bH
                                    if (r8 == 0) goto L_0x0737
                                    mega.boicot.t_chat r8 = mega.boicot.t_chat.this
                                    boolean r8 = r8.f20426v
                                    if (r8 != 0) goto L_0x0737
                                    r8 = 1
                                    r3.setAutoLinkMask(r8)
                                    r3.setLinkTextColor(r11)
                                L_0x0737:
                                    r3.setText(r4)
                                    r3.setTextColor(r11)
                                    goto L_0x0b6c
                                L_0x073f:
                                    if (r9 != 0) goto L_0x0753
                                    android.content.SharedPreferences r4 = r5
                                    java.lang.String r10 = "f2_b64"
                                    java.lang.String r11 = ""
                                    java.lang.String r4 = r4.getString(r10, r11)
                                    java.lang.String r10 = ""
                                    boolean r4 = r4.equals(r10)
                                    if (r4 == 0) goto L_0x0767
                                L_0x0753:
                                    if (r9 == 0) goto L_0x0882
                                    android.content.SharedPreferences r4 = r5
                                    java.lang.String r10 = "f2_b64_th"
                                    java.lang.String r11 = ""
                                    java.lang.String r4 = r4.getString(r10, r11)
                                    java.lang.String r10 = ""
                                    boolean r4 = r4.equals(r10)
                                    if (r4 != 0) goto L_0x0882
                                L_0x0767:
                                    android.content.SharedPreferences r4 = r5
                                    java.lang.String r10 = "f2_b64"
                                    java.lang.String r11 = ""
                                    java.lang.String r4 = r4.getString(r10, r11)
                                    if (r9 == 0) goto L_0x077d
                                    android.content.SharedPreferences r4 = r5
                                    java.lang.String r10 = "f2_b64_th"
                                    java.lang.String r11 = ""
                                    java.lang.String r4 = r4.getString(r10, r11)
                                L_0x077d:
                                    byte[] r4 = android.util.Base64.decode(r4, r5)
                                    int r10 = r4.length
                                    android.graphics.Bitmap r4 = android.graphics.BitmapFactory.decodeByteArray(r4, r5, r10)
                                    mega.boicot.t_chat r10 = mega.boicot.t_chat.this
                                    mega.boicot.config r10 = r10.f20402at
                                    mega.boicot.t_chat r11 = mega.boicot.t_chat.this
                                    android.content.SharedPreferences r14 = r5
                                    java.lang.String r15 = "f2_idfrase"
                                    java.lang.String r6 = ""
                                    java.lang.String r6 = r14.getString(r15, r6)
                                    int r6 = java.lang.Integer.parseInt(r6)
                                    java.io.File r6 = r10.mo20758a(r11, r6, r5)
                                    java.io.FileOutputStream r10 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x07ac }
                                    r10.<init>(r6)     // Catch:{ Exception -> 0x07ac }
                                    android.graphics.Bitmap$CompressFormat r6 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ Exception -> 0x07ac }
                                    r11 = 100
                                    r4.compress(r6, r11, r10)     // Catch:{ Exception -> 0x07ac }
                                L_0x07ac:
                                    r3.setVisibility(r7)
                                    android.view.View r3 = r2.findViewById(r13)
                                    android.widget.ImageView r3 = (android.widget.ImageView) r3
                                    java.lang.StringBuilder r4 = new java.lang.StringBuilder
                                    r4.<init>()
                                    java.lang.String r6 = "img"
                                    r4.append(r6)
                                    android.content.SharedPreferences r6 = r5
                                    java.lang.String r10 = "f2_idfrase"
                                    java.lang.String r11 = ""
                                    java.lang.String r6 = r6.getString(r10, r11)
                                    r4.append(r6)
                                    java.lang.String r4 = r4.toString()
                                    r3.setTag(r4)
                                    if (r9 == 0) goto L_0x080b
                                    java.lang.String r4 = "1"
                                    r3.setTag(r8, r4)
                                    android.content.SharedPreferences r4 = r5
                                    java.lang.String r6 = "f2_idvideo"
                                    java.lang.String r8 = ""
                                    java.lang.String r4 = r4.getString(r6, r8)
                                    r6 = 2131231019(0x7f08012b, float:1.8078107E38)
                                    r3.setTag(r6, r4)
                                    android.content.SharedPreferences r4 = r5
                                    java.lang.String r6 = "f2_formato"
                                    java.lang.String r8 = ""
                                    java.lang.String r4 = r4.getString(r6, r8)
                                    r6 = 2131231020(0x7f08012c, float:1.807811E38)
                                    r3.setTag(r6, r4)
                                    android.content.SharedPreferences r4 = r5
                                    java.lang.String r6 = "f2_id"
                                    java.lang.String r8 = ""
                                    java.lang.String r4 = r4.getString(r6, r8)
                                    r6 = 2131231021(0x7f08012d, float:1.8078111E38)
                                    r3.setTag(r6, r4)
                                    goto L_0x0810
                                L_0x080b:
                                    java.lang.String r4 = "0"
                                    r3.setTag(r8, r4)
                                L_0x0810:
                                    mega.boicot.t_chat r4 = mega.boicot.t_chat.this
                                    boolean r4 = r4.f20419o
                                    if (r4 == 0) goto L_0x083c
                                    r4 = 2131231303(0x7f080247, float:1.8078683E38)
                                    android.view.View r4 = r2.findViewById(r4)
                                    java.lang.StringBuilder r6 = new java.lang.StringBuilder
                                    r6.<init>()
                                    java.lang.String r8 = "pb"
                                    r6.append(r8)
                                    android.content.SharedPreferences r8 = r5
                                    java.lang.String r9 = "f2_idfrase"
                                    java.lang.String r10 = ""
                                    java.lang.String r8 = r8.getString(r9, r10)
                                    r6.append(r8)
                                    java.lang.String r6 = r6.toString()
                                    r4.setTag(r6)
                                    goto L_0x0861
                                L_0x083c:
                                    r4 = 2131231302(0x7f080246, float:1.8078681E38)
                                    android.view.View r4 = r2.findViewById(r4)
                                    java.lang.StringBuilder r6 = new java.lang.StringBuilder
                                    r6.<init>()
                                    java.lang.String r8 = "pb"
                                    r6.append(r8)
                                    android.content.SharedPreferences r8 = r5
                                    java.lang.String r9 = "f2_idfrase"
                                    java.lang.String r10 = ""
                                    java.lang.String r8 = r8.getString(r9, r10)
                                    r6.append(r8)
                                    java.lang.String r6 = r6.toString()
                                    r4.setTag(r6)
                                L_0x0861:
                                    mega.boicot.t_chat r4 = mega.boicot.t_chat.this
                                    android.content.SharedPreferences r6 = r5
                                    java.lang.String r8 = "f2_idfrase"
                                    java.lang.String r9 = ""
                                    java.lang.String r6 = r6.getString(r8, r9)
                                    int r6 = java.lang.Integer.parseInt(r6)
                                    r4.m24632a(r6, r5, r3)
                                    mega.boicot.t_chat r4 = mega.boicot.t_chat.this
                                    r3.setOnClickListener(r4)
                                    android.view.View r3 = r2.findViewById(r12)
                                    r3.setVisibility(r5)
                                    goto L_0x0b6c
                                L_0x0882:
                                    mega.boicot.t_chat r4 = mega.boicot.t_chat.this
                                    mega.boicot.config r4 = r4.f20402at
                                    mega.boicot.t_chat r6 = mega.boicot.t_chat.this
                                    android.content.SharedPreferences r10 = r5
                                    java.lang.String r11 = "f2_idfrase"
                                    java.lang.String r14 = ""
                                    java.lang.String r10 = r10.getString(r11, r14)
                                    int r10 = java.lang.Integer.parseInt(r10)
                                    java.io.File r4 = r4.mo20758a(r6, r10, r5)
                                    boolean r4 = r4.exists()
                                    if (r4 == 0) goto L_0x09aa
                                    r3.setVisibility(r7)
                                    android.view.View r3 = r2.findViewById(r13)
                                    android.widget.ImageView r3 = (android.widget.ImageView) r3
                                    java.lang.StringBuilder r4 = new java.lang.StringBuilder
                                    r4.<init>()
                                    java.lang.String r6 = "img"
                                    r4.append(r6)
                                    android.content.SharedPreferences r6 = r5
                                    java.lang.String r10 = "f2_idfrase"
                                    java.lang.String r11 = ""
                                    java.lang.String r6 = r6.getString(r10, r11)
                                    r4.append(r6)
                                    java.lang.String r4 = r4.toString()
                                    r3.setTag(r4)
                                    if (r9 == 0) goto L_0x0901
                                    java.lang.String r4 = "1"
                                    r3.setTag(r8, r4)
                                    android.content.SharedPreferences r4 = r5
                                    java.lang.String r6 = "f2_idvideo"
                                    java.lang.String r8 = ""
                                    java.lang.String r4 = r4.getString(r6, r8)
                                    r6 = 2131231019(0x7f08012b, float:1.8078107E38)
                                    r3.setTag(r6, r4)
                                    android.content.SharedPreferences r4 = r5
                                    java.lang.String r6 = "f2_formato"
                                    java.lang.String r8 = ""
                                    java.lang.String r4 = r4.getString(r6, r8)
                                    r6 = 2131231020(0x7f08012c, float:1.807811E38)
                                    r3.setTag(r6, r4)
                                    android.content.SharedPreferences r4 = r5
                                    java.lang.String r6 = "f2_id"
                                    java.lang.String r8 = ""
                                    java.lang.String r4 = r4.getString(r6, r8)
                                    r6 = 2131231021(0x7f08012d, float:1.8078111E38)
                                    r3.setTag(r6, r4)
                                    goto L_0x0906
                                L_0x0901:
                                    java.lang.String r4 = "0"
                                    r3.setTag(r8, r4)
                                L_0x0906:
                                    android.content.SharedPreferences r4 = r5
                                    java.lang.String r6 = "f2_id"
                                    java.lang.String r8 = ""
                                    java.lang.String r4 = r4.getString(r6, r8)
                                    java.lang.StringBuilder r6 = new java.lang.StringBuilder
                                    r6.<init>()
                                    mega.boicot.t_chat r8 = mega.boicot.t_chat.this
                                    int r8 = r8.f20384ab
                                    r6.append(r8)
                                    java.lang.String r8 = ""
                                    r6.append(r8)
                                    java.lang.String r6 = r6.toString()
                                    boolean r4 = r4.equals(r6)
                                    if (r4 == 0) goto L_0x0938
                                    r4 = 2131230729(0x7f080009, float:1.807752E38)
                                    r6 = 1
                                    java.lang.Integer r8 = java.lang.Integer.valueOf(r6)
                                    r3.setTag(r4, r8)
                                L_0x0938:
                                    mega.boicot.t_chat r4 = mega.boicot.t_chat.this
                                    boolean r4 = r4.f20419o
                                    if (r4 == 0) goto L_0x0964
                                    r4 = 2131231303(0x7f080247, float:1.8078683E38)
                                    android.view.View r4 = r2.findViewById(r4)
                                    java.lang.StringBuilder r6 = new java.lang.StringBuilder
                                    r6.<init>()
                                    java.lang.String r8 = "pb"
                                    r6.append(r8)
                                    android.content.SharedPreferences r8 = r5
                                    java.lang.String r9 = "f2_idfrase"
                                    java.lang.String r10 = ""
                                    java.lang.String r8 = r8.getString(r9, r10)
                                    r6.append(r8)
                                    java.lang.String r6 = r6.toString()
                                    r4.setTag(r6)
                                    goto L_0x0989
                                L_0x0964:
                                    r4 = 2131231302(0x7f080246, float:1.8078681E38)
                                    android.view.View r4 = r2.findViewById(r4)
                                    java.lang.StringBuilder r6 = new java.lang.StringBuilder
                                    r6.<init>()
                                    java.lang.String r8 = "pb"
                                    r6.append(r8)
                                    android.content.SharedPreferences r8 = r5
                                    java.lang.String r9 = "f2_idfrase"
                                    java.lang.String r10 = ""
                                    java.lang.String r8 = r8.getString(r9, r10)
                                    r6.append(r8)
                                    java.lang.String r6 = r6.toString()
                                    r4.setTag(r6)
                                L_0x0989:
                                    mega.boicot.t_chat r4 = mega.boicot.t_chat.this
                                    android.content.SharedPreferences r6 = r5
                                    java.lang.String r8 = "f2_idfrase"
                                    java.lang.String r9 = ""
                                    java.lang.String r6 = r6.getString(r8, r9)
                                    int r6 = java.lang.Integer.parseInt(r6)
                                    r4.m24632a(r6, r5, r3)
                                    mega.boicot.t_chat r4 = mega.boicot.t_chat.this
                                    r3.setOnClickListener(r4)
                                    android.view.View r3 = r2.findViewById(r12)
                                    r3.setVisibility(r5)
                                    goto L_0x0b6c
                                L_0x09aa:
                                    r3.setVisibility(r7)
                                    android.view.View r3 = r2.findViewById(r13)
                                    android.widget.ImageView r3 = (android.widget.ImageView) r3
                                    java.lang.StringBuilder r4 = new java.lang.StringBuilder
                                    r4.<init>()
                                    java.lang.String r6 = "img"
                                    r4.append(r6)
                                    android.content.SharedPreferences r6 = r5
                                    java.lang.String r10 = "f2_idfrase"
                                    java.lang.String r11 = ""
                                    java.lang.String r6 = r6.getString(r10, r11)
                                    r4.append(r6)
                                    java.lang.String r4 = r4.toString()
                                    r3.setTag(r4)
                                    if (r9 == 0) goto L_0x0a09
                                    java.lang.String r4 = "1"
                                    r3.setTag(r8, r4)
                                    android.content.SharedPreferences r4 = r5
                                    java.lang.String r6 = "f2_idvideo"
                                    java.lang.String r8 = ""
                                    java.lang.String r4 = r4.getString(r6, r8)
                                    r6 = 2131231019(0x7f08012b, float:1.8078107E38)
                                    r3.setTag(r6, r4)
                                    android.content.SharedPreferences r4 = r5
                                    java.lang.String r6 = "f2_formato"
                                    java.lang.String r8 = ""
                                    java.lang.String r4 = r4.getString(r6, r8)
                                    r6 = 2131231020(0x7f08012c, float:1.807811E38)
                                    r3.setTag(r6, r4)
                                    android.content.SharedPreferences r4 = r5
                                    java.lang.String r6 = "f2_id"
                                    java.lang.String r8 = ""
                                    java.lang.String r4 = r4.getString(r6, r8)
                                    r6 = 2131231021(0x7f08012d, float:1.8078111E38)
                                    r3.setTag(r6, r4)
                                    goto L_0x0a0e
                                L_0x0a09:
                                    java.lang.String r4 = "0"
                                    r3.setTag(r8, r4)
                                L_0x0a0e:
                                    android.content.SharedPreferences r4 = r5
                                    java.lang.String r6 = "f2_id"
                                    java.lang.String r8 = ""
                                    java.lang.String r4 = r4.getString(r6, r8)
                                    java.lang.StringBuilder r6 = new java.lang.StringBuilder
                                    r6.<init>()
                                    mega.boicot.t_chat r8 = mega.boicot.t_chat.this
                                    int r8 = r8.f20384ab
                                    r6.append(r8)
                                    java.lang.String r8 = ""
                                    r6.append(r8)
                                    java.lang.String r6 = r6.toString()
                                    boolean r4 = r4.equals(r6)
                                    if (r4 == 0) goto L_0x0a40
                                    r4 = 2131230729(0x7f080009, float:1.807752E38)
                                    r6 = 1
                                    java.lang.Integer r8 = java.lang.Integer.valueOf(r6)
                                    r3.setTag(r4, r8)
                                L_0x0a40:
                                    android.view.View r3 = r2.findViewById(r12)
                                    r3.setVisibility(r5)
                                    mega.boicot.t_chat r3 = mega.boicot.t_chat.this
                                    boolean r3 = r3.f20419o
                                    if (r3 == 0) goto L_0x0a7a
                                    r3 = 2131231303(0x7f080247, float:1.8078683E38)
                                    android.view.View r4 = r2.findViewById(r3)
                                    r4.setVisibility(r5)
                                    android.view.View r3 = r2.findViewById(r3)
                                    java.lang.StringBuilder r4 = new java.lang.StringBuilder
                                    r4.<init>()
                                    java.lang.String r6 = "pb"
                                    r4.append(r6)
                                    android.content.SharedPreferences r6 = r5
                                    java.lang.String r8 = "f2_idfrase"
                                    java.lang.String r10 = ""
                                    java.lang.String r6 = r6.getString(r8, r10)
                                    r4.append(r6)
                                    java.lang.String r4 = r4.toString()
                                    r3.setTag(r4)
                                    goto L_0x0aa6
                                L_0x0a7a:
                                    r3 = 2131231302(0x7f080246, float:1.8078681E38)
                                    android.view.View r4 = r2.findViewById(r3)
                                    r4.setVisibility(r5)
                                    android.view.View r3 = r2.findViewById(r3)
                                    java.lang.StringBuilder r4 = new java.lang.StringBuilder
                                    r4.<init>()
                                    java.lang.String r6 = "pb"
                                    r4.append(r6)
                                    android.content.SharedPreferences r6 = r5
                                    java.lang.String r8 = "f2_idfrase"
                                    java.lang.String r10 = ""
                                    java.lang.String r6 = r6.getString(r8, r10)
                                    r4.append(r6)
                                    java.lang.String r4 = r4.toString()
                                    r3.setTag(r4)
                                L_0x0aa6:
                                    mega.boicot.t_chat r3 = mega.boicot.t_chat.this
                                    java.lang.StringBuilder r4 = new java.lang.StringBuilder
                                    r4.<init>()
                                    mega.boicot.t_chat r6 = mega.boicot.t_chat.this
                                    java.lang.String r6 = r6.f20378W
                                    r4.append(r6)
                                    java.lang.String r6 = ","
                                    r4.append(r6)
                                    android.content.SharedPreferences r6 = r5
                                    java.lang.String r8 = "f2_idfrase"
                                    java.lang.String r10 = ""
                                    java.lang.String r6 = r6.getString(r8, r10)
                                    r4.append(r6)
                                    java.lang.String r4 = r4.toString()
                                    r3.f20378W = r4
                                    if (r9 == 0) goto L_0x0b0d
                                    mega.boicot.t_chat r3 = mega.boicot.t_chat.this
                                    java.lang.StringBuilder r4 = new java.lang.StringBuilder
                                    r4.<init>()
                                    mega.boicot.t_chat r6 = mega.boicot.t_chat.this
                                    java.lang.String r6 = r6.f20378W
                                    r4.append(r6)
                                    java.lang.String r6 = "@1@"
                                    r4.append(r6)
                                    android.content.SharedPreferences r6 = r5
                                    java.lang.String r8 = "f2_idvideo"
                                    java.lang.String r9 = ""
                                    java.lang.String r6 = r6.getString(r8, r9)
                                    r4.append(r6)
                                    java.lang.String r6 = "@"
                                    r4.append(r6)
                                    android.content.SharedPreferences r6 = r5
                                    java.lang.String r8 = "f2_id"
                                    java.lang.String r9 = ""
                                    java.lang.String r6 = r6.getString(r8, r9)
                                    r4.append(r6)
                                    java.lang.String r4 = r4.toString()
                                    r3.f20378W = r4
                                    goto L_0x0b29
                                L_0x0b0d:
                                    mega.boicot.t_chat r3 = mega.boicot.t_chat.this
                                    java.lang.StringBuilder r4 = new java.lang.StringBuilder
                                    r4.<init>()
                                    mega.boicot.t_chat r6 = mega.boicot.t_chat.this
                                    java.lang.String r6 = r6.f20378W
                                    r4.append(r6)
                                    java.lang.String r6 = "@0"
                                    r4.append(r6)
                                    java.lang.String r4 = r4.toString()
                                    r3.f20378W = r4
                                L_0x0b29:
                                    mega.boicot.t_chat r3 = mega.boicot.t_chat.this
                                    java.lang.StringBuilder r4 = new java.lang.StringBuilder
                                    r4.<init>()
                                    mega.boicot.t_chat r6 = mega.boicot.t_chat.this
                                    java.lang.String r6 = r6.f20378W
                                    r4.append(r6)
                                    java.lang.String r6 = ","
                                    r4.append(r6)
                                    java.lang.String r4 = r4.toString()
                                    r3.f20378W = r4
                                    mega.boicot.t_chat r3 = mega.boicot.t_chat.this
                                    mega.boicot.t_chat$l r3 = r3.f20364I
                                    if (r3 == 0) goto L_0x0b57
                                    mega.boicot.t_chat r3 = mega.boicot.t_chat.this
                                    mega.boicot.t_chat$l r3 = r3.f20364I
                                    android.os.AsyncTask$Status r3 = r3.getStatus()
                                    android.os.AsyncTask$Status r4 = android.os.AsyncTask.Status.RUNNING
                                    if (r3 == r4) goto L_0x0b6c
                                L_0x0b57:
                                    mega.boicot.t_chat r3 = mega.boicot.t_chat.this
                                    mega.boicot.t_chat$l r4 = new mega.boicot.t_chat$l
                                    mega.boicot.t_chat r6 = mega.boicot.t_chat.this
                                    r8 = 0
                                    r4.<init>()
                                    r3.f20364I = r4
                                    mega.boicot.t_chat r3 = mega.boicot.t_chat.this
                                    mega.boicot.t_chat$l r3 = r3.f20364I
                                    java.lang.String[] r4 = new java.lang.String[r5]
                                    r3.execute(r4)
                                L_0x0b6c:
                                    android.content.SharedPreferences r3 = r5
                                    java.lang.String r4 = "f2_id"
                                    java.lang.String r6 = ""
                                    java.lang.String r3 = r3.getString(r4, r6)
                                    r2.setTag(r3)
                                    android.content.SharedPreferences r3 = r5
                                    java.lang.String r4 = "f2_ultimas"
                                    boolean r3 = r3.getBoolean(r4, r5)
                                    if (r3 == 0) goto L_0x0b8b
                                    mega.boicot.t_chat r3 = mega.boicot.t_chat.this
                                    android.widget.LinearLayout r3 = r3.f20368M
                                    r3.addView(r2, r5)
                                    goto L_0x0b92
                                L_0x0b8b:
                                    mega.boicot.t_chat r3 = mega.boicot.t_chat.this
                                    android.widget.LinearLayout r3 = r3.f20368M
                                    r3.addView(r2)
                                L_0x0b92:
                                    mega.boicot.t_chat r2 = mega.boicot.t_chat.this
                                    r2.f20397ao = r2.f20397ao + 1
                                    mega.boicot.t_chat r2 = mega.boicot.t_chat.this
                                    int r2 = r2.f20397ao
                                    r3 = 1
                                    if (r2 != r3) goto L_0x0bad
                                    mega.boicot.t_chat r2 = mega.boicot.t_chat.this
                                    r3 = 2131231660(0x7f0803ac, float:1.8079407E38)
                                    android.view.View r2 = r2.findViewById(r3)
                                    r2.setVisibility(r7)
                                    goto L_0x0bc2
                                L_0x0bad:
                                    mega.boicot.t_chat r2 = mega.boicot.t_chat.this
                                    int r2 = r2.f20397ao
                                    r3 = 2
                                    if (r2 != r3) goto L_0x0bc2
                                    mega.boicot.t_chat r2 = mega.boicot.t_chat.this
                                    r3 = 2131231661(0x7f0803ad, float:1.807941E38)
                                    android.view.View r2 = r2.findViewById(r3)
                                    r2.setVisibility(r7)
                                L_0x0bc2:
                                    mega.boicot.t_chat r2 = mega.boicot.t_chat.this
                                    r3 = 2131231450(0x7f0802da, float:1.8078981E38)
                                    android.view.View r2 = r2.findViewById(r3)
                                    android.widget.ScrollView r2 = (android.widget.ScrollView) r2
                                    mega.boicot.t_chat r3 = mega.boicot.t_chat.this
                                    android.widget.LinearLayout r3 = r3.f20368M
                                    int r3 = r3.getMeasuredHeight()
                                    int r4 = r2.getScrollY()
                                    int r5 = r2.getHeight()
                                    int r4 = r4 + r5
                                    if (r3 > r4) goto L_0x0be8
                                    mega.boicot.t_chat$11$1 r3 = new mega.boicot.t_chat$11$1
                                    r3.<init>()
                                    r2.post(r3)
                                L_0x0be8:
                                    return
                                */
                                throw new UnsupportedOperationException("Method not decompiled: mega.boicot.t_chat.C612911.run():void");
                            }
                        });
                    }
                }
            }
        } else if (str.equals("accion")) {
            if (sharedPreferences.getInt("accion", 0) == 1) {
                if (this.f20400ar.getString("idprivado", "0").equals("0") && this.f20400ar.getInt("privados", 1) == 1 && ((this.f20404av == null || !this.f20404av.isShowing()) && (this.f20403au == null || !this.f20403au.isShowing()))) {
                    runOnUiThread(new Runnable() {
                        public void run() {
                            t_chat.this.mo22078a(t_chat.this.f20401as.getString("id_remit", ""), t_chat.this.f20401as.getString("nombre_remit", ""));
                        }
                    });
                }
            } else if (!(sharedPreferences.getInt("accion", 0) == 2 || sharedPreferences.getInt("accion", 0) == 3)) {
                sharedPreferences.getInt("accion", 0);
            }
            if (sharedPreferences.getInt("accion", 0) != 0) {
                Editor edit = this.f20401as.edit();
                edit.putInt("accion", 0);
                edit.commit();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m24632a(int i, boolean z, ImageView imageView) {
        File file;
        Bitmap bitmap;
        if (imageView != null) {
            boolean z2 = false;
            if (z) {
                file = this.f20402at.mo20757a((Context) this, i);
            } else {
                file = this.f20402at.mo20758a((Context) this, i, false);
            }
            try {
                Options options = new Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeFile(file.getPath(), options);
                int i2 = options.outWidth;
                int i3 = options.outWidth;
                int i4 = (options.outHeight * this.f20371P) / i3;
                imageView.getLayoutParams().width = this.f20371P;
                imageView.getLayoutParams().height = i4;
                if (i3 <= this.f20371P) {
                    z2 = true;
                }
                if (!z2) {
                    int round = Math.round(((float) i3) / ((float) this.f20371P));
                    Options options2 = new Options();
                    options2.inSampleSize = round;
                    bitmap = BitmapFactory.decodeFile(file.getPath(), options2);
                } else {
                    bitmap = Media.getBitmap(getContentResolver(), Uri.fromFile(file));
                }
                if (imageView.getTag(R.id.idaux1) != null && imageView.getTag(R.id.idaux1).equals("1")) {
                    bitmap = config.m23829a(bitmap, BitmapFactory.decodeResource(getResources(), R.drawable.play_pp));
                }
                imageView.setImageDrawable(new BitmapDrawable(getResources(), bitmap));
            } catch (Exception unused) {
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public void mo22082g() {
        boolean z;
        if (!this.f20379X.equals("")) {
            Date date = null;
            try {
                date = new SimpleDateFormat("ddMMyy").parse(this.f20379X);
                z = true;
            } catch (Exception e) {
                e.printStackTrace();
                z = false;
            }
            if (z) {
                TextView textView = new TextView(this);
                LayoutParams layoutParams = new LayoutParams(-2, -2);
                layoutParams.setMargins(this.f20373R, this.f20373R, this.f20373R, this.f20373R);
                textView.setLayoutParams(layoutParams);
                textView.setPadding(this.f20372Q, this.f20372Q, this.f20372Q, this.f20372Q);
                textView.setBackgroundColor(-3355444);
                textView.setTextSize(1, 13.0f);
                textView.setTypeface(Typeface.DEFAULT, 2);
                textView.setTextColor(-12303292);
                Calendar instance = Calendar.getInstance();
                Calendar instance2 = Calendar.getInstance();
                instance2.setTime(date);
                if (instance2.get(1) == instance.get(1) && instance2.get(6) == instance.get(6)) {
                    textView.setText(getResources().getString(R.string.hoy));
                } else {
                    textView.setText(DateFormat.getDateFormat(this).format(date));
                }
                this.f20368M.addView(textView, 0);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m24640b(String str, String str2) {
        ((LinearLayout) findViewById(R.id.llchat)).removeAllViews();
        findViewById(R.id.btnfavoritos).setVisibility(8);
        findViewById(R.id.btnperfil).setVisibility(8);
        if (this.f20402at.f17929bJ) {
            findViewById(R.id.btnfoto).setVisibility(0);
        } else {
            findViewById(R.id.btnfoto).setVisibility(8);
        }
        if (this.f20402at.f17936bQ == 1 || this.f20402at.f17936bQ == 3) {
            findViewById(R.id.btnvideo).setVisibility(0);
        } else {
            findViewById(R.id.btnvideo).setVisibility(8);
        }
        TextView textView = (TextView) findViewById(R.id.tv_cabe_priv);
        StringBuilder sb = new StringBuilder();
        sb.append(getResources().getString(R.string.chatprivadocon));
        sb.append(" ");
        sb.append(str2);
        textView.setText(sb.toString());
        if (this.f20399aq) {
            findViewById(R.id.iv_cabe_priv).setVisibility(8);
        } else {
            findViewById(R.id.iv_cabe_priv).setVisibility(0);
        }
        findViewById(R.id.ll_cabe_priv).setVisibility(0);
        findViewById(R.id.ll_favnotif).setVisibility(8);
        findViewById(R.id.ll_cabe).setVisibility(8);
        findViewById(R.id.ll_cabe_der).setVisibility(8);
        this.f20390ah = 0;
        new C6158c("0", str, this.f20390ah).execute(new String[0]);
        this.f20397ao = 0;
        this.f20379X = "";
        findViewById(R.id.view_aux_1).setVisibility(0);
        findViewById(R.id.view_aux_2).setVisibility(0);
        this.f20398ap = true;
        Editor edit = this.f20400ar.edit();
        edit.putString("idprivado", str);
        edit.putString("nombreprivado", str2);
        edit.commit();
        config.m23834a((Context) this, str, str2);
    }

    /* renamed from: b */
    private void m24639b(String str) {
        final AlertDialog create = new Builder(this).setNegativeButton(R.string.no, null).setPositiveButton(R.string.si, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                boolean z;
                if (!t_chat.this.f20426v || t_chat.this.f20357B == null || !t_chat.this.f20357B.containsKey("id_remit")) {
                    ((LinearLayout) t_chat.this.findViewById(R.id.llchat)).removeAllViews();
                    t_chat.this.f20397ao = 0;
                    t_chat.this.f20379X = "";
                    t_chat.this.findViewById(R.id.view_aux_1).setVisibility(0);
                    t_chat.this.findViewById(R.id.view_aux_2).setVisibility(0);
                    t_chat.this.findViewById(R.id.btnfavoritos).setVisibility(0);
                    t_chat.this.findViewById(R.id.btnperfil).setVisibility(0);
                    if (t_chat.this.f20392aj == 1) {
                        t_chat.this.findViewById(R.id.btnfoto).setVisibility(0);
                    } else {
                        t_chat.this.findViewById(R.id.btnfoto).setVisibility(8);
                    }
                    if (t_chat.this.f20426v || t_chat.this.f20402at.f17936bQ == 0 || t_chat.this.f20402at.f17936bQ == 1) {
                        t_chat.this.findViewById(R.id.btnvideo).setVisibility(8);
                    } else {
                        t_chat.this.findViewById(R.id.btnvideo).setVisibility(0);
                    }
                    t_chat.this.findViewById(R.id.ll_cabe_priv).setVisibility(8);
                    t_chat.this.findViewById(R.id.ll_favnotif).setVisibility(0);
                    if (t_chat.this.f20429y) {
                        t_chat.this.findViewById(R.id.ll_cabe).setVisibility(0);
                    } else if (!t_chat.this.f20426v && t_chat.this.f20415k.f18247R) {
                        t_chat.this.findViewById(R.id.ll_cabe_der).setVisibility(0);
                    }
                    t_chat.this.f20390ah = 0;
                    z = false;
                } else {
                    t_chat.this.f20390ah = -1;
                    z = true;
                }
                if (t_chat.this.f20390ah != -1) {
                    new C6158c("0", "0", t_chat.this.f20390ah).execute(new String[0]);
                }
                t_chat.this.f20398ap = false;
                Editor edit = t_chat.this.f20400ar.edit();
                edit.putString("idprivado", "0");
                edit.commit();
                if (z) {
                    t_chat.this.f20418n = true;
                    t_chat.this.mo22083h();
                    t_chat.this.finish();
                }
            }
        }).setMessage(R.string.confirmar_salirprivado).create();
        if (!this.f20380Y.equals("")) {
            create.setOnShowListener(new OnShowListener() {
                public void onShow(DialogInterface dialogInterface) {
                    Button button = create.getButton(-1);
                    StringBuilder sb = new StringBuilder();
                    sb.append("#");
                    sb.append(t_chat.this.f20380Y);
                    button.setTextColor(Color.parseColor(sb.toString()));
                    Button button2 = create.getButton(-2);
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("#");
                    sb2.append(t_chat.this.f20380Y);
                    button2.setTextColor(Color.parseColor(sb2.toString()));
                }
            });
        }
        create.show();
        try {
            ((TextView) create.findViewById(16908299)).setTypeface(Typeface.MONOSPACE);
        } catch (Exception unused) {
        }
    }

    public void onBackPressed() {
        String string = this.f20400ar.getString("idprivado", "0");
        if (!string.equals("0") && !this.f20399aq) {
            m24639b(string);
        } else if (!this.f20430z || this.f20422r || !this.f20402at.f18059ea) {
            if (this.f20399aq) {
                mo22083h();
            }
            super.onBackPressed();
        } else {
            this.f20422r = true;
            config.m23859l(this);
        }
    }

    /* renamed from: a */
    public static CharSequence m24629a(Context context, CharSequence charSequence) {
        HashMap hashMap = new HashMap();
        hashMap.put(":-D\\|", Integer.valueOf(R.drawable.smile1));
        hashMap.put(":-O\\|", Integer.valueOf(R.drawable.smile2));
        hashMap.put(":-\\(\\|", Integer.valueOf(R.drawable.smile3));
        hashMap.put(":-\\)\\|", Integer.valueOf(R.drawable.smile4));
        hashMap.put(";-\\)\\|", Integer.valueOf(R.drawable.smile5));
        hashMap.put(":-\\|", Integer.valueOf(R.drawable.smile6));
        hashMap.put("B-D\\|", Integer.valueOf(R.drawable.smile7));
        hashMap.put("8-\\)", Integer.valueOf(R.drawable.smile8));
        hashMap.put(":-p\\|", Integer.valueOf(R.drawable.smile9));
        hashMap.put(":\"\\)", Integer.valueOf(R.drawable.smile10));
        hashMap.put(":'\\(\\|", Integer.valueOf(R.drawable.smile11));
        hashMap.put("X\\(", Integer.valueOf(R.drawable.smile12));
        hashMap.put(":x\\|", Integer.valueOf(R.drawable.smile13));
        hashMap.put(">:\\)\\|", Integer.valueOf(R.drawable.smile14));
        hashMap.put("O:\\)\\|", Integer.valueOf(R.drawable.smile15));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        for (Entry entry : hashMap.entrySet()) {
            Matcher matcher = Pattern.compile((String) entry.getKey(), 2).matcher(charSequence);
            while (matcher.find()) {
                Bitmap decodeResource = BitmapFactory.decodeResource(context.getResources(), ((Integer) entry.getValue()).intValue());
                Object[] spans = spannableStringBuilder.getSpans(matcher.start(), matcher.end(), ImageSpan.class);
                if (spans == null || spans.length == 0) {
                    spannableStringBuilder.setSpan(new ImageSpan(context, decodeResource), matcher.start(), matcher.end(), 33);
                }
            }
        }
        return spannableStringBuilder;
    }

    public void onResume() {
        super.onResume();
        config.m23860m(this);
        Editor edit = this.f20401as.edit();
        edit.putInt("accion", 0);
        edit.commit();
        Editor edit2 = this.f20400ar.edit();
        StringBuilder sb = new StringBuilder();
        sb.append("activa");
        sb.append(this.f20389ag);
        edit2.putBoolean(sb.toString(), true);
        edit2.putBoolean("activa", true);
        edit2.commit();
        this.f20400ar.registerOnSharedPreferenceChangeListener(this);
        this.f20401as.registerOnSharedPreferenceChangeListener(this);
        if (this.f20402at.f18013cx != 0 && this.f20405aw != null && this.f20405aw.f17768a != null) {
            this.f20405aw.f17768a.mo12165a();
        }
    }

    public boolean onSearchRequested() {
        if (this.f20402at.f18080q == 0) {
            return false;
        }
        this.f20418n = true;
        this.f20411g = true;
        return super.onSearchRequested();
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getWindow().setFormat(1);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public void mo22083h() {
        this.f20398ap = false;
        Editor edit = this.f20400ar.edit();
        StringBuilder sb = new StringBuilder();
        sb.append("activa");
        sb.append(this.f20389ag);
        edit.putBoolean(sb.toString(), false);
        edit.putBoolean("activa", false);
        edit.putString("idprivado", "0");
        edit.commit();
        this.f20400ar.unregisterOnSharedPreferenceChangeListener(this);
        this.f20401as.unregisterOnSharedPreferenceChangeListener(this);
    }

    public void onStop() {
        super.onStop();
        if (this.f20418n && !this.f20411g) {
            finish();
        }
    }

    public void onPause() {
        if (!(this.f20402at.f18013cx == 0 || this.f20405aw == null || this.f20405aw.f17768a == null)) {
            this.f20405aw.f17768a.mo12167b();
        }
        super.onPause();
        if (isFinishing()) {
            mo22083h();
        }
    }

    public void onDestroy() {
        if (!(this.f20402at.f18013cx == 0 || this.f20405aw == null || this.f20405aw.f17768a == null)) {
            this.f20405aw.f17768a.mo12168c();
        }
        if (!(this.f20402at.f18013cx == 0 || this.f20405aw == null || this.f20405aw.f17769b == null)) {
            this.f20405aw.f17769b.destroy();
        }
        if ((this.f20430z && isFinishing()) || config.f17841i) {
            config.m23861n(this);
        }
        super.onDestroy();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ((LinearLayout) findViewById(R.id.ll_princ)).removeViewAt(0);
        mo22081f();
        ((LinearLayout) findViewById(R.id.ll_ad)).removeAllViews();
        if (!(this.f20405aw == null || this.f20405aw.f17768a == null)) {
            try {
                this.f20405aw.f17768a.mo12168c();
            } catch (Exception unused) {
            }
        }
        if (!(this.f20405aw == null || this.f20405aw.f17769b == null)) {
            try {
                this.f20405aw.f17769b.destroy();
            } catch (Exception unused2) {
            }
        }
        if (this.f20402at.f17928bI) {
            this.f20405aw = this.f20402at.mo20760a((Context) this, false);
        }
    }

    public void adLoaded(String str) {
        this.f20413i.cancel();
        this.f20407c.showAd();
    }

    public void onAdClosed() {
        if (this.f20410f) {
            abrir_secc(this.f20412h);
        }
    }

    public void adError(String str) {
        this.f20413i.cancel();
        abrir_secc(this.f20412h);
    }

    public void videoEnded() {
        this.f20410f = true;
        config.m23867t(this);
    }

    /* renamed from: z_ */
    public void mo9678z_() {
        this.f20413i.cancel();
        this.f20406b.mo12836a();
    }

    /* renamed from: a */
    public void mo9675a(C3165a aVar) {
        this.f20410f = true;
        config.m23867t(this);
    }

    /* renamed from: A_ */
    public void mo9671A_() {
        if (this.f20410f) {
            abrir_secc(this.f20412h);
        }
    }

    /* renamed from: e */
    public void mo9676e() {
        this.f20410f = false;
    }

    /* renamed from: a */
    public void mo9674a(int i) {
        if (!this.f20402at.mo20775a((Context) this, this.f20407c)) {
            this.f20413i.cancel();
            abrir_secc(this.f20412h);
        }
    }

    public void onError(C1514Ad ad, AdError adError) {
        this.f20413i.cancel();
        abrir_secc(this.f20412h);
    }

    public void onAdLoaded(C1514Ad ad) {
        this.f20413i.cancel();
        this.f20408d.show();
    }

    public void onRewardedVideoCompleted() {
        this.f20410f = true;
        config.m23867t(this);
    }

    public void onRewardedVideoClosed() {
        if (this.f20410f) {
            abrir_secc(this.f20412h);
        }
    }

    public void onVideoCompleted() {
        this.f20410f = true;
        config.m23867t(this);
    }

    public void onReceiveAd(C5286Ad ad) {
        this.f20413i.cancel();
        this.f20409e.showAd("REWARDED VIDEO", new AdDisplayListener() {
            public void adClicked(C5286Ad ad) {
            }

            public void adDisplayed(C5286Ad ad) {
            }

            public void adNotDisplayed(C5286Ad ad) {
            }

            public void adHidden(C5286Ad ad) {
                if (t_chat.this.f20410f) {
                    t_chat.this.abrir_secc(t_chat.this.f20412h);
                }
            }
        });
    }

    public void onFailedToReceiveAd(C5286Ad ad) {
        this.f20413i.cancel();
        abrir_secc(this.f20412h);
    }
}
