package mega.boicot;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
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
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.provider.MediaStore.Images.Media;
import android.support.p017v4.content.FileProvider;
import android.text.Html;
import android.util.Patterns;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
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
import com.facebook.C2468e;
import com.facebook.ads.AdError;
import com.facebook.ads.C1514Ad;
import com.facebook.ads.RewardedVideoAd;
import com.facebook.ads.RewardedVideoAdListener;
import com.facebook.login.widget.LoginButton;
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
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Locale;
import org.apache.p199a.C6527i;
import org.apache.p199a.p202b.p204b.C6274e;
import org.apache.p199a.p202b.p204b.C6276g;
import org.apache.p199a.p215e.p216a.C6367d;
import org.apache.p199a.p215e.p216a.C6370g;
import org.apache.p199a.p215e.p216a.p217a.C6360c;
import org.apache.p199a.p215e.p216a.p217a.C6363f;
import org.apache.p199a.p218f.p220b.C6409h;
import org.apache.p199a.p227i.C6529b;
import org.apache.p199a.p227i.C6530c;
import org.apache.p199a.p227i.C6531d;
import org.apache.p199a.p229k.C6551d;

public class chat_perfil extends Activity implements OnClickListener, OnAdClosed, OnAdError, OnAdLoaded, OnVideoEnded, RewardedVideoAdListener, C3167c, VideoListener, AdEventListener, C5599a {

    /* renamed from: A */
    LoginButton f19609A;

    /* renamed from: B */
    private int f19610B = 0;

    /* renamed from: C */
    private int f19611C;
    /* access modifiers changed from: private */

    /* renamed from: D */
    public int f19612D;

    /* renamed from: E */
    private int f19613E;

    /* renamed from: F */
    private int f19614F;

    /* renamed from: G */
    private int f19615G;

    /* renamed from: H */
    private int f19616H;

    /* renamed from: I */
    private int f19617I;

    /* renamed from: J */
    private int f19618J;

    /* renamed from: K */
    private int f19619K;
    /* access modifiers changed from: private */

    /* renamed from: L */
    public int f19620L;

    /* renamed from: M */
    private boolean f19621M;

    /* renamed from: N */
    private ImageView f19622N;

    /* renamed from: O */
    private ImageView f19623O;

    /* renamed from: P */
    private ImageView f19624P;

    /* renamed from: Q */
    private String f19625Q;
    /* access modifiers changed from: private */

    /* renamed from: R */
    public String f19626R;
    /* access modifiers changed from: private */

    /* renamed from: S */
    public String f19627S;

    /* renamed from: T */
    private String f19628T;

    /* renamed from: U */
    private String f19629U;
    /* access modifiers changed from: private */

    /* renamed from: V */
    public String f19630V;

    /* renamed from: W */
    private Spinner f19631W;

    /* renamed from: X */
    private Spinner f19632X;

    /* renamed from: Y */
    private Spinner f19633Y;

    /* renamed from: Z */
    private Spinner f19634Z;

    /* renamed from: a */
    config f19635a;

    /* renamed from: aa */
    private Spinner f19636aa;

    /* renamed from: ab */
    private Spinner f19637ab;

    /* renamed from: ac */
    private Spinner f19638ac;
    /* access modifiers changed from: private */

    /* renamed from: ad */
    public SharedPreferences f19639ad;

    /* renamed from: b */
    boolean f19640b = false;

    /* renamed from: c */
    boolean f19641c = false;

    /* renamed from: d */
    boolean f19642d;

    /* renamed from: e */
    boolean f19643e;

    /* renamed from: f */
    boolean f19644f;

    /* renamed from: g */
    boolean f19645g;

    /* renamed from: h */
    boolean f19646h;

    /* renamed from: i */
    ProgressDialog f19647i;

    /* renamed from: j */
    ProgressDialog f19648j;

    /* renamed from: k */
    ProgressDialog f19649k;

    /* renamed from: l */
    Dialog f19650l;

    /* renamed from: m */
    C5602c f19651m;

    /* renamed from: n */
    C3166b f19652n;

    /* renamed from: o */
    RewardedVideo f19653o;

    /* renamed from: p */
    RewardedVideoAd f19654p;

    /* renamed from: q */
    StartAppAd f19655q;

    /* renamed from: r */
    boolean f19656r = false;

    /* renamed from: s */
    boolean f19657s = false;

    /* renamed from: t */
    View f19658t;

    /* renamed from: u */
    ProgressDialog f19659u;

    /* renamed from: v */
    ProgressBar f19660v;

    /* renamed from: w */
    ListView f19661w;

    /* renamed from: x */
    Bundle f19662x;

    /* renamed from: y */
    Long f19663y;

    /* renamed from: z */
    C2468e f19664z;

    /* renamed from: mega.boicot.chat_perfil$a */
    private class C5972a extends AsyncTask<String, Void, Byte> {

        /* renamed from: a */
        Uri f19717a;

        public C5972a(Uri uri) {
            this.f19717a = uri;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Byte doInBackground(String... strArr) {
            URL url;
            try {
                if (!this.f19717a.getQueryParameter("idfb").equals("")) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("https://graph.facebook.com/");
                    sb.append(this.f19717a.getQueryParameter("idfb"));
                    sb.append("/picture?type=large");
                    url = new URL(sb.toString());
                } else if (this.f19717a.getQueryParameter("idgoogle").equals("")) {
                    return Byte.valueOf(0);
                } else {
                    url = new URL(this.f19717a.getQueryParameter("tfoto"));
                }
            } catch (MalformedURLException unused) {
                url = null;
            }
            try {
                HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                httpURLConnection.setDoInput(true);
                httpURLConnection.setConnectTimeout(10000);
                httpURLConnection.setReadTimeout(20000);
                httpURLConnection.connect();
                InputStream inputStream = httpURLConnection.getInputStream();
                Bitmap decodeStream = BitmapFactory.decodeStream(inputStream);
                inputStream.close();
                httpURLConnection.disconnect();
                try {
                    decodeStream.compress(CompressFormat.JPEG, 100, new FileOutputStream(chat_perfil.this.f19635a.mo20757a((Context) chat_perfil.this, 2)));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } catch (IOException e2) {
                e2.printStackTrace();
            } catch (OutOfMemoryError e3) {
                e3.printStackTrace();
            }
            return Byte.valueOf(1);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void onPostExecute(Byte b) {
            chat_perfil.this.mo21632i();
        }
    }

    /* renamed from: mega.boicot.chat_perfil$b */
    private class C5973b extends AsyncTask<String, Void, Byte> {

        /* renamed from: a */
        String f19719a;

        /* renamed from: b */
        boolean f19720b;

        public C5973b(boolean z) {
            this.f19720b = z;
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
                r5.f19719a = r6     // Catch:{ Exception -> 0x0086, all -> 0x0084 }
                java.lang.String r6 = r5.f19719a     // Catch:{ Exception -> 0x0086, all -> 0x0084 }
                java.lang.String r2 = "@EURO@"
                java.lang.String r3 = "€"
                java.lang.String r6 = r6.replace(r2, r3)     // Catch:{ Exception -> 0x0086, all -> 0x0084 }
                r5.f19719a = r6     // Catch:{ Exception -> 0x0086, all -> 0x0084 }
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
            throw new UnsupportedOperationException("Method not decompiled: mega.boicot.chat_perfil.C5973b.doInBackground(java.lang.String[]):java.lang.Byte");
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
            chat_perfil.this.f19647i = new ProgressDialog(chat_perfil.this);
            chat_perfil.this.f19647i.setMessage(chat_perfil.this.getString(R.string.cargando));
            chat_perfil.this.f19647i.setIndeterminate(true);
            if (VERSION.SDK_INT > 20 && !chat_perfil.this.f19635a.f17890aW.equals("")) {
                chat_perfil.this.f19647i.setOnShowListener(new OnShowListener() {
                    public void onShow(DialogInterface dialogInterface) {
                        config.m23838a((ProgressBar) chat_perfil.this.f19647i.findViewById(16908301), chat_perfil.this.f19635a.f17890aW);
                    }
                });
            }
            chat_perfil.this.f19647i.show();
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void onPostExecute(Byte b) {
            try {
                chat_perfil.this.f19647i.dismiss();
            } catch (Exception unused) {
            }
            if (b.byteValue() != 0) {
                config.m23835a((Context) chat_perfil.this, chat_perfil.this.getString(R.string.error_http_tit), chat_perfil.this.getString(R.string.error_http), chat_perfil.this.f19626R);
                return;
            }
            Builder builder = new Builder(chat_perfil.this);
            builder.setMessage(Html.fromHtml(this.f19719a));
            if (this.f19720b) {
                builder.setCancelable(false);
                builder.setNegativeButton(R.string.cancelar, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialogInterface, int i) {
                        chat_perfil.this.finish();
                    }
                });
                builder.setPositiveButton(R.string.aceptar, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Editor edit = chat_perfil.this.f19639ad.edit();
                        edit.putBoolean("pp_aceptada", true);
                        edit.commit();
                        chat_perfil.this.mo21630g();
                    }
                });
            } else {
                builder.setCancelable(true);
                builder.setPositiveButton(chat_perfil.this.getString(R.string.cerrar), null);
            }
            final AlertDialog create = builder.create();
            if (!chat_perfil.this.f19626R.equals("")) {
                create.setOnShowListener(new OnShowListener() {
                    public void onShow(DialogInterface dialogInterface) {
                        Button button = create.getButton(-1);
                        StringBuilder sb = new StringBuilder();
                        sb.append("#");
                        sb.append(chat_perfil.this.f19626R);
                        button.setTextColor(Color.parseColor(sb.toString()));
                        if (C5973b.this.f19720b) {
                            Button button2 = create.getButton(-2);
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("#");
                            sb2.append(chat_perfil.this.f19626R);
                            button2.setTextColor(Color.parseColor(sb2.toString()));
                        }
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

    /* renamed from: mega.boicot.chat_perfil$c */
    private class C5978c extends AsyncTask<String, Void, String> {

        /* renamed from: a */
        String f19727a;

        /* renamed from: b */
        String f19728b;

        /* renamed from: c */
        String f19729c;

        /* renamed from: d */
        String f19730d;

        /* renamed from: e */
        String f19731e;

        /* renamed from: f */
        String f19732f;

        public C5978c(String str, String str2, String str3, String str4, String str5, String str6) {
            this.f19727a = str;
            this.f19728b = str2;
            this.f19729c = str3;
            this.f19730d = str4;
            this.f19731e = str5;
            this.f19732f = str6;
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
            chat_perfil.this.f19648j = new ProgressDialog(chat_perfil.this);
            chat_perfil.this.f19648j.setMessage(chat_perfil.this.getString(R.string.guardando));
            chat_perfil.this.f19648j.setIndeterminate(true);
            if (VERSION.SDK_INT > 20 && !chat_perfil.this.f19635a.f17890aW.equals("")) {
                chat_perfil.this.f19648j.setOnShowListener(new OnShowListener() {
                    public void onShow(DialogInterface dialogInterface) {
                        config.m23838a((ProgressBar) chat_perfil.this.f19648j.findViewById(16908301), chat_perfil.this.f19635a.f17890aW);
                    }
                });
            }
            chat_perfil.this.f19648j.show();
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public String doInBackground(String... strArr) {
            try {
                C6529b bVar = new C6529b();
                C6530c.m25865c(bVar, 10000);
                C6530c.m25861a((C6531d) bVar, 20000);
                C6409h hVar = new C6409h(bVar);
                C6274e eVar = new C6274e("https://mysocialapp.net/guardar_token.php?desde_app=1");
                C6370g gVar = new C6370g(C6367d.BROWSER_COMPATIBLE);
                StringBuilder sb = new StringBuilder();
                sb.append(chat_perfil.this.f19620L);
                sb.append("");
                gVar.mo22648a("u", (C6360c) new C6363f(sb.toString()));
                gVar.mo22648a("cod_g", (C6360c) new C6363f(chat_perfil.this.f19630V));
                gVar.mo22648a("codigo", (C6360c) new C6363f(chat_perfil.this.f19627S));
                gVar.mo22648a("idapp", (C6360c) new C6363f("718963"));
                gVar.mo22648a("x", (C6360c) new C6363f(chat_perfil.this.f19639ad.getString("x", "")));
                gVar.mo22648a("y", (C6360c) new C6363f(chat_perfil.this.f19639ad.getString("y", "")));
                gVar.mo22648a("tk", (C6360c) new C6363f(this.f19727a));
                if (!this.f19729c.equals("")) {
                    gVar.mo22648a("idgoogle_param", (C6360c) new C6363f(this.f19729c));
                } else {
                    gVar.mo22648a("idfb_param", (C6360c) new C6363f(this.f19728b));
                }
                gVar.mo22648a("nombre", (C6360c) new C6363f(this.f19730d));
                gVar.mo22648a("gender", (C6360c) new C6363f(this.f19731e));
                gVar.mo22648a("tfoto", (C6360c) new C6363f(this.f19732f));
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
            int indexOf = str.indexOf("OK COD:");
            if (indexOf == -1) {
                try {
                    chat_perfil.this.f19648j.dismiss();
                } catch (Exception unused) {
                }
                config.m23835a((Context) chat_perfil.this, chat_perfil.this.getString(R.string.error_http_tit), chat_perfil.this.getString(R.string.error_http), chat_perfil.this.f19626R);
                return;
            }
            String str2 = "";
            String str3 = "";
            String str4 = "";
            int i = indexOf + 7;
            String substring = str.substring(i, i + 6);
            int indexOf2 = str.indexOf(" IDUSU:");
            if (indexOf2 != -1) {
                int i2 = indexOf2 + 7;
                str2 = str.substring(i2, str.indexOf("@", i2));
                int indexOf3 = str.indexOf(" COD_G:");
                if (indexOf3 != -1) {
                    int i3 = indexOf3 + 7;
                    str4 = str.substring(i3, str.indexOf("@", i3));
                }
                int indexOf4 = str.indexOf(" DATOS_USU:");
                if (indexOf4 != -1) {
                    str3 = str.substring(indexOf4 + 11);
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append("appac://fb_718963?action=ok&nombre=");
            sb.append(this.f19730d);
            sb.append("&tfoto=");
            sb.append(this.f19732f);
            sb.append("&gender=");
            sb.append(this.f19731e);
            sb.append("&idfb=");
            sb.append(this.f19728b);
            sb.append("&idgoogle=");
            sb.append(this.f19729c);
            sb.append("&codigo=");
            sb.append(substring);
            sb.append("&idusu=");
            sb.append(str2);
            sb.append("&cod_g=");
            sb.append(str4);
            sb.append("&datos_usu=");
            sb.append(str3);
            chat_perfil.this.mo21627a(Uri.parse(sb.toString()));
        }
    }

    /* renamed from: mega.boicot.chat_perfil$d */
    private class C5980d extends AsyncTask<String, Void, String> {
        private C5980d() {
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
            chat_perfil.this.f19650l.findViewById(R.id.ll_contenido).setVisibility(4);
            chat_perfil.this.f19660v.setVisibility(0);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public String doInBackground(String... strArr) {
            C6409h hVar = new C6409h();
            StringBuilder sb = new StringBuilder();
            sb.append("http://");
            sb.append(config.f17839g);
            sb.append("/srv/modif_contra.php?idusu=");
            sb.append(chat_perfil.this.f19620L);
            sb.append("&c=");
            sb.append(chat_perfil.this.f19627S);
            C6274e eVar = new C6274e(sb.toString());
            C6370g gVar = new C6370g();
            try {
                gVar.mo22648a("contra_act", (C6360c) new C6363f(((EditText) chat_perfil.this.f19650l.findViewById(R.id.et_contra_act)).getText().toString().trim()));
                gVar.mo22648a("contra_nueva", (C6360c) new C6363f(((EditText) chat_perfil.this.f19650l.findViewById(R.id.et_contra_nueva)).getText().toString().trim()));
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
            eVar.mo22444a(gVar);
            eVar.mo22909b("User-Agent", "Android Vinebre Software");
            String str = "";
            try {
                C6527i b = hVar.mo22459a(eVar).mo22939b();
                if (b != null) {
                    str = C6551d.m25961d(b);
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
            return str;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void onPostExecute(String str) {
            chat_perfil.this.f19660v.setVisibility(8);
            Builder builder = new Builder(chat_perfil.this);
            builder.setCancelable(false).setPositiveButton(chat_perfil.this.getString(R.string.aceptar), null);
            if (str.indexOf("ANDROID:OK") != -1) {
                chat_perfil.this.f19650l.dismiss();
                builder.setMessage(R.string.contra_modificada);
                final AlertDialog create = builder.create();
                if (!chat_perfil.this.f19626R.equals("")) {
                    create.setOnShowListener(new OnShowListener() {
                        public void onShow(DialogInterface dialogInterface) {
                            Button button = create.getButton(-1);
                            StringBuilder sb = new StringBuilder();
                            sb.append("#");
                            sb.append(chat_perfil.this.f19626R);
                            button.setTextColor(Color.parseColor(sb.toString()));
                        }
                    });
                }
                create.show();
                try {
                    ((TextView) create.findViewById(16908299)).setTypeface(Typeface.MONOSPACE);
                } catch (Exception unused) {
                }
            } else if (str.indexOf("ANDROID:KO -CONTRA-") != -1) {
                chat_perfil.this.f19650l.findViewById(R.id.ll_contenido).setVisibility(0);
                builder.setMessage(R.string.contra_ko);
                final AlertDialog create2 = builder.create();
                if (!chat_perfil.this.f19626R.equals("")) {
                    create2.setOnShowListener(new OnShowListener() {
                        public void onShow(DialogInterface dialogInterface) {
                            Button button = create2.getButton(-1);
                            StringBuilder sb = new StringBuilder();
                            sb.append("#");
                            sb.append(chat_perfil.this.f19626R);
                            button.setTextColor(Color.parseColor(sb.toString()));
                        }
                    });
                }
                create2.show();
                ((TextView) create2.findViewById(16908299)).setTypeface(Typeface.MONOSPACE);
            } else {
                chat_perfil.this.f19650l.findViewById(R.id.ll_contenido).setVisibility(0);
                builder.setMessage(R.string.error_http);
                final AlertDialog create3 = builder.create();
                if (!chat_perfil.this.f19626R.equals("")) {
                    create3.setOnShowListener(new OnShowListener() {
                        public void onShow(DialogInterface dialogInterface) {
                            Button button = create3.getButton(-1);
                            StringBuilder sb = new StringBuilder();
                            sb.append("#");
                            sb.append(chat_perfil.this.f19626R);
                            button.setTextColor(Color.parseColor(sb.toString()));
                        }
                    });
                }
                create3.show();
                ((TextView) create3.findViewById(16908299)).setTypeface(Typeface.MONOSPACE);
            }
        }
    }

    /* renamed from: mega.boicot.chat_perfil$e */
    private class C5984e extends AsyncTask<String, Void, String> {
        private C5984e() {
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
            try {
                chat_perfil.this.f19650l.dismiss();
            } catch (Exception unused) {
            }
            chat_perfil.this.f19649k = new ProgressDialog(chat_perfil.this);
            chat_perfil.this.f19649k.setMessage(chat_perfil.this.getString(R.string.enviando));
            chat_perfil.this.f19649k.setIndeterminate(true);
            if (VERSION.SDK_INT > 20) {
                chat_perfil.this.f19649k.setOnShowListener(new OnShowListener() {
                    public void onShow(DialogInterface dialogInterface) {
                        config.m23838a((ProgressBar) chat_perfil.this.f19649k.findViewById(16908301), chat_perfil.this.f19635a.f17890aW);
                    }
                });
            }
            chat_perfil.this.f19649k.show();
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public String doInBackground(String... strArr) {
            C6409h hVar = new C6409h();
            StringBuilder sb = new StringBuilder();
            sb.append("http://");
            sb.append(config.f17839g);
            sb.append("/srv/recordar_contra.php?idapp=");
            sb.append(718963);
            sb.append("&idl=");
            sb.append(Locale.getDefault().getLanguage());
            C6274e eVar = new C6274e(sb.toString());
            C6370g gVar = new C6370g();
            try {
                gVar.mo22648a("email", (C6360c) new C6363f(((EditText) chat_perfil.this.findViewById(R.id.c_email)).getText().toString().trim()));
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
            eVar.mo22444a(gVar);
            eVar.mo22909b("User-Agent", "Android Vinebre Software");
            String str = "";
            try {
                C6527i b = hVar.mo22459a(eVar).mo22939b();
                if (b != null) {
                    str = C6551d.m25961d(b);
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
            return str;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void onPostExecute(String str) {
            try {
                chat_perfil.this.f19649k.dismiss();
            } catch (Exception unused) {
            }
            Builder builder = new Builder(chat_perfil.this);
            builder.setCancelable(false).setPositiveButton(chat_perfil.this.getString(R.string.aceptar), null);
            if (str.indexOf("ANDROID:OK") != -1) {
                builder.setMessage(R.string.contra_enviada);
                final AlertDialog create = builder.create();
                if (!chat_perfil.this.f19626R.equals("")) {
                    create.setOnShowListener(new OnShowListener() {
                        public void onShow(DialogInterface dialogInterface) {
                            Button button = create.getButton(-1);
                            StringBuilder sb = new StringBuilder();
                            sb.append("#");
                            sb.append(chat_perfil.this.f19626R);
                            button.setTextColor(Color.parseColor(sb.toString()));
                        }
                    });
                }
                create.show();
                try {
                    ((TextView) create.findViewById(16908299)).setTypeface(Typeface.MONOSPACE);
                } catch (Exception unused2) {
                }
            } else if (str.indexOf("ANDROID:KO -ESPERA-") != -1) {
                builder.setMessage(R.string.contra_espera);
                final AlertDialog create2 = builder.create();
                if (!chat_perfil.this.f19626R.equals("")) {
                    create2.setOnShowListener(new OnShowListener() {
                        public void onShow(DialogInterface dialogInterface) {
                            Button button = create2.getButton(-1);
                            StringBuilder sb = new StringBuilder();
                            sb.append("#");
                            sb.append(chat_perfil.this.f19626R);
                            button.setTextColor(Color.parseColor(sb.toString()));
                        }
                    });
                }
                create2.show();
                ((TextView) create2.findViewById(16908299)).setTypeface(Typeface.MONOSPACE);
            } else if (str.indexOf("ANDROID:KO -NOTFOUND-") != -1) {
                builder.setMessage(R.string.email_noencontrado);
                final AlertDialog create3 = builder.create();
                if (!chat_perfil.this.f19626R.equals("")) {
                    create3.setOnShowListener(new OnShowListener() {
                        public void onShow(DialogInterface dialogInterface) {
                            Button button = create3.getButton(-1);
                            StringBuilder sb = new StringBuilder();
                            sb.append("#");
                            sb.append(chat_perfil.this.f19626R);
                            button.setTextColor(Color.parseColor(sb.toString()));
                        }
                    });
                }
                create3.show();
                ((TextView) create3.findViewById(16908299)).setTypeface(Typeface.MONOSPACE);
            } else {
                builder.setMessage(R.string.error_http);
                final AlertDialog create4 = builder.create();
                if (!chat_perfil.this.f19626R.equals("")) {
                    create4.setOnShowListener(new OnShowListener() {
                        public void onShow(DialogInterface dialogInterface) {
                            Button button = create4.getButton(-1);
                            StringBuilder sb = new StringBuilder();
                            sb.append("#");
                            sb.append(chat_perfil.this.f19626R);
                            button.setTextColor(Color.parseColor(sb.toString()));
                        }
                    });
                }
                create4.show();
                ((TextView) create4.findViewById(16908299)).setTypeface(Typeface.MONOSPACE);
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

    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00c5, code lost:
        if (r15.f18305aw == 2) goto L_0x00cb;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            android.content.Context r2 = r18.getApplicationContext()
            mega.boicot.config r2 = (mega.boicot.config) r2
            r0.f19635a = r2
            mega.boicot.config r2 = r0.f19635a
            java.lang.String r2 = r2.f17881aN
            if (r2 != 0) goto L_0x0017
            mega.boicot.config r2 = r0.f19635a
            r2.mo20780b()
        L_0x0017:
            mega.boicot.config r2 = r0.f19635a
            int r2 = r2.f18075l
            r0.f19611C = r2
            android.content.Intent r2 = r18.getIntent()
            android.os.Bundle r2 = r2.getExtras()
            r0.f19662x = r2
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L_0x0049
            android.os.Bundle r4 = r0.f19662x
            if (r4 == 0) goto L_0x0045
            android.os.Bundle r4 = r0.f19662x
            java.lang.String r5 = "es_root"
            boolean r4 = r4.containsKey(r5)
            if (r4 == 0) goto L_0x0045
            android.os.Bundle r4 = r0.f19662x
            java.lang.String r5 = "es_root"
            boolean r4 = r4.getBoolean(r5, r3)
            if (r4 == 0) goto L_0x0045
            r4 = r2
            goto L_0x0046
        L_0x0045:
            r4 = r3
        L_0x0046:
            r0.f19644f = r4
            goto L_0x005e
        L_0x0049:
            java.lang.String r4 = "es_root"
            boolean r4 = r1.containsKey(r4)
            if (r4 == 0) goto L_0x005b
            java.lang.String r4 = "es_root"
            boolean r4 = r1.getBoolean(r4, r3)
            if (r4 == 0) goto L_0x005b
            r4 = r2
            goto L_0x005c
        L_0x005b:
            r4 = r3
        L_0x005c:
            r0.f19644f = r4
        L_0x005e:
            android.os.Bundle r4 = r0.f19662x
            java.lang.String r5 = "externo"
            boolean r4 = r4.containsKey(r5)
            r0.f19643e = r4
            android.os.Bundle r4 = r0.f19662x
            java.lang.String r5 = "desde_main"
            boolean r4 = r4.getBoolean(r5, r3)
            r0.f19645g = r4
            boolean r4 = r0.f19645g
            if (r4 == 0) goto L_0x0144
            r4 = r3
            r6 = r4
            r7 = r6
            r8 = r7
            r9 = r8
            r10 = r9
            r11 = r10
            r12 = r11
            r13 = r12
            r14 = r13
        L_0x0080:
            mega.boicot.config r15 = r0.f19635a
            mega.boicot.i[] r15 = r15.f17971bz
            int r15 = r15.length
            if (r4 >= r15) goto L_0x00f6
            mega.boicot.config r15 = r0.f19635a
            mega.boicot.i[] r15 = r15.f17971bz
            r15 = r15[r4]
            int r3 = r15.f18325r
            r5 = 10
            if (r3 != r5) goto L_0x0094
            r12 = r2
        L_0x0094:
            int r3 = r15.f18325r
            r5 = 9
            if (r3 == r5) goto L_0x00a0
            int r3 = r15.f18325r
            r5 = 11
            if (r3 != r5) goto L_0x00f2
        L_0x00a0:
            if (r11 != 0) goto L_0x00a9
            boolean r3 = r15.f18246Q
            if (r3 == 0) goto L_0x00a7
            goto L_0x00a9
        L_0x00a7:
            r3 = 0
            goto L_0x00aa
        L_0x00a9:
            r3 = r2
        L_0x00aa:
            if (r13 != 0) goto L_0x00b3
            boolean r5 = r15.f18245P
            if (r5 == 0) goto L_0x00b1
            goto L_0x00b3
        L_0x00b1:
            r5 = 0
            goto L_0x00b4
        L_0x00b3:
            r5 = r2
        L_0x00b4:
            if (r14 != 0) goto L_0x00bd
            boolean r6 = r15.f18244O
            if (r6 == 0) goto L_0x00bb
            goto L_0x00bd
        L_0x00bb:
            r6 = 0
            goto L_0x00be
        L_0x00bd:
            r6 = r2
        L_0x00be:
            if (r7 == 0) goto L_0x00ca
            if (r7 != r2) goto L_0x00c8
            int r11 = r15.f18305aw
            r13 = 2
            if (r11 != r13) goto L_0x00cd
            goto L_0x00cb
        L_0x00c8:
            r13 = 2
            goto L_0x00cd
        L_0x00ca:
            r13 = 2
        L_0x00cb:
            int r7 = r15.f18305aw
        L_0x00cd:
            if (r8 == 0) goto L_0x00d5
            if (r8 != r2) goto L_0x00d7
            int r11 = r15.f18306ax
            if (r11 != r13) goto L_0x00d7
        L_0x00d5:
            int r8 = r15.f18306ax
        L_0x00d7:
            if (r9 == 0) goto L_0x00df
            if (r9 != r2) goto L_0x00e1
            int r11 = r15.f18307ay
            if (r11 != r13) goto L_0x00e1
        L_0x00df:
            int r9 = r15.f18307ay
        L_0x00e1:
            if (r10 == 0) goto L_0x00ef
            if (r10 != r2) goto L_0x00ea
            int r11 = r15.f18308az
            if (r11 != r13) goto L_0x00ea
            goto L_0x00ef
        L_0x00ea:
            r11 = r3
            r13 = r5
            r14 = r6
            r6 = r2
            goto L_0x00f2
        L_0x00ef:
            int r10 = r15.f18308az
            goto L_0x00ea
        L_0x00f2:
            int r4 = r4 + 1
            r3 = 0
            goto L_0x0080
        L_0x00f6:
            mega.boicot.config r3 = r0.f19635a
            java.lang.String r3 = r3.f17881aN
            r0.f19628T = r3
            mega.boicot.config r3 = r0.f19635a
            java.lang.String r3 = r3.f17882aO
            r0.f19629U = r3
            r3 = 0
            r0.f19613E = r3
            r0.f19614F = r3
            r0.f19615G = r3
            r0.f19616H = r3
            if (r6 != 0) goto L_0x0117
            r0.f19613E = r2
            r0.f19614F = r2
            r0.f19615G = r2
            r0.f19616H = r2
        L_0x0115:
            r3 = 0
            goto L_0x0120
        L_0x0117:
            r0.f19613E = r7
            r0.f19614F = r8
            r0.f19615G = r9
            r0.f19616H = r10
            goto L_0x0115
        L_0x0120:
            r0.f19619K = r3
            r0.f19617I = r3
            r0.f19618J = r3
            if (r6 != 0) goto L_0x012d
            if (r12 == 0) goto L_0x012b
            goto L_0x012d
        L_0x012b:
            r3 = 0
            goto L_0x0140
        L_0x012d:
            if (r6 == 0) goto L_0x0131
            if (r11 == 0) goto L_0x0133
        L_0x0131:
            r0.f19619K = r2
        L_0x0133:
            if (r6 == 0) goto L_0x0137
            if (r13 == 0) goto L_0x0139
        L_0x0137:
            r0.f19617I = r2
        L_0x0139:
            if (r6 == 0) goto L_0x013d
            if (r14 == 0) goto L_0x012b
        L_0x013d:
            r0.f19618J = r2
            goto L_0x012b
        L_0x0140:
            r0.f19612D = r3
            goto L_0x021d
        L_0x0144:
            boolean r3 = r0.f19643e
            if (r3 == 0) goto L_0x01a7
            mega.boicot.config r3 = r0.f19635a
            mega.boicot.i[] r3 = r3.f17971bz
            int r4 = r0.f19611C
            r3 = r3[r4]
            java.lang.String r3 = r3.f18314g
            r0.f19628T = r3
            mega.boicot.config r3 = r0.f19635a
            mega.boicot.i[] r3 = r3.f17971bz
            int r4 = r0.f19611C
            r3 = r3[r4]
            java.lang.String r3 = r3.f18315h
            r0.f19629U = r3
            android.os.Bundle r3 = r0.f19662x
            java.lang.String r4 = "fotos_perfil"
            int r3 = r3.getInt(r4)
            r0.f19613E = r3
            android.os.Bundle r3 = r0.f19662x
            java.lang.String r4 = "fnac"
            int r3 = r3.getInt(r4)
            r0.f19614F = r3
            android.os.Bundle r3 = r0.f19662x
            java.lang.String r4 = "sexo"
            int r3 = r3.getInt(r4)
            r0.f19615G = r3
            android.os.Bundle r3 = r0.f19662x
            java.lang.String r4 = "descr"
            int r3 = r3.getInt(r4)
            r0.f19616H = r3
            android.os.Bundle r3 = r0.f19662x
            java.lang.String r4 = "galeria"
            boolean r3 = r3.getBoolean(r4)
            r0.f19619K = r3
            android.os.Bundle r3 = r0.f19662x
            java.lang.String r4 = "coments"
            boolean r3 = r3.getBoolean(r4)
            r0.f19617I = r3
            android.os.Bundle r3 = r0.f19662x
            java.lang.String r4 = "privados"
            boolean r3 = r3.getBoolean(r4)
            r0.f19618J = r3
            goto L_0x021d
        L_0x01a7:
            mega.boicot.config r3 = r0.f19635a
            mega.boicot.i[] r3 = r3.f17971bz
            int r4 = r0.f19611C
            r3 = r3[r4]
            java.lang.String r3 = r3.f18314g
            r0.f19628T = r3
            mega.boicot.config r3 = r0.f19635a
            mega.boicot.i[] r3 = r3.f17971bz
            int r4 = r0.f19611C
            r3 = r3[r4]
            java.lang.String r3 = r3.f18315h
            r0.f19629U = r3
            mega.boicot.config r3 = r0.f19635a
            mega.boicot.i[] r3 = r3.f17971bz
            int r4 = r0.f19611C
            r3 = r3[r4]
            int r3 = r3.f18305aw
            r0.f19613E = r3
            mega.boicot.config r3 = r0.f19635a
            mega.boicot.i[] r3 = r3.f17971bz
            int r4 = r0.f19611C
            r3 = r3[r4]
            int r3 = r3.f18306ax
            r0.f19614F = r3
            mega.boicot.config r3 = r0.f19635a
            mega.boicot.i[] r3 = r3.f17971bz
            int r4 = r0.f19611C
            r3 = r3[r4]
            int r3 = r3.f18307ay
            r0.f19615G = r3
            mega.boicot.config r3 = r0.f19635a
            mega.boicot.i[] r3 = r3.f17971bz
            int r4 = r0.f19611C
            r3 = r3[r4]
            int r3 = r3.f18308az
            r0.f19616H = r3
            mega.boicot.config r3 = r0.f19635a
            mega.boicot.i[] r3 = r3.f17971bz
            int r4 = r0.f19611C
            r3 = r3[r4]
            boolean r3 = r3.f18246Q
            r0.f19619K = r3
            mega.boicot.config r3 = r0.f19635a
            mega.boicot.i[] r3 = r3.f17971bz
            int r4 = r0.f19611C
            r3 = r3[r4]
            boolean r3 = r3.f18245P
            r0.f19617I = r3
            mega.boicot.config r3 = r0.f19635a
            mega.boicot.i[] r3 = r3.f17971bz
            int r4 = r0.f19611C
            r3 = r3[r4]
            boolean r3 = r3.f18244O
            r0.f19618J = r3
            android.os.Bundle r3 = r0.f19662x
            java.lang.String r4 = "idsecc"
            int r3 = r3.getInt(r4)
            r0.f19612D = r3
        L_0x021d:
            java.lang.String r3 = r0.f19628T
            mega.boicot.config r4 = r0.f19635a
            java.lang.String r4 = r4.f17890aW
            java.lang.String r3 = mega.boicot.config.m23831a(r3, r4)
            r0.f19626R = r3
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 12
            if (r3 <= r4) goto L_0x024e
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "#"
            r3.append(r5)
            java.lang.String r5 = r0.f19628T
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            boolean r3 = mega.boicot.config.m23844a(r3)
            if (r3 != 0) goto L_0x024e
            r3 = 2131624309(0x7f0e0175, float:1.8875794E38)
            r0.setTheme(r3)
        L_0x024e:
            super.onCreate(r19)
            boolean r3 = mega.boicot.config.m23853d()
            if (r3 != 0) goto L_0x0258
            return
        L_0x0258:
            r3 = 2131361851(0x7f0a003b, float:1.8343466E38)
            r0.setContentView(r3)
            r18.mo21631h()
            mega.boicot.config r3 = r0.f19635a
            int r3 = r3.f18080q
            if (r3 <= 0) goto L_0x027f
            java.lang.String r3 = "search"
            java.lang.Object r3 = r0.getSystemService(r3)
            android.app.SearchManager r3 = (android.app.SearchManager) r3
            mega.boicot.chat_perfil$1 r5 = new mega.boicot.chat_perfil$1
            r5.<init>()
            r3.setOnCancelListener(r5)
            mega.boicot.chat_perfil$12 r5 = new mega.boicot.chat_perfil$12
            r5.<init>()
            r3.setOnDismissListener(r5)
        L_0x027f:
            mega.boicot.config r3 = r0.f19635a
            r5 = 0
            mega.boicot.c r3 = r3.mo20760a(r0, r5)
            r0.f19651m = r3
            java.lang.String r3 = "sh"
            android.content.SharedPreferences r3 = r0.getSharedPreferences(r3, r5)
            r0.f19639ad = r3
            android.content.SharedPreferences r3 = r0.f19639ad
            java.lang.String r6 = "idusu"
            int r3 = r3.getInt(r6, r5)
            r0.f19620L = r3
            android.content.SharedPreferences r3 = r0.f19639ad
            java.lang.String r5 = "cod"
            java.lang.String r6 = ""
            java.lang.String r3 = r3.getString(r5, r6)
            r0.f19627S = r3
            android.content.SharedPreferences r3 = r0.f19639ad
            java.lang.String r5 = "cod_g"
            java.lang.String r6 = ""
            java.lang.String r3 = r3.getString(r5, r6)
            r0.f19630V = r3
            android.content.SharedPreferences r3 = r0.f19639ad
            java.lang.String r5 = "email_confirmado"
            r6 = 0
            boolean r3 = r3.getBoolean(r5, r6)
            r0.f19621M = r3
            android.content.SharedPreferences r3 = r0.f19639ad
            java.lang.String r5 = "nick"
            java.lang.String r6 = ""
            java.lang.String r3 = r3.getString(r5, r6)
            java.lang.String r5 = ""
            boolean r3 = r3.equals(r5)
            r0.f19642d = r3
            java.lang.String r3 = r0.f19628T
            java.lang.String r5 = ""
            boolean r3 = r3.equals(r5)
            r5 = 2131230854(0x7f080086, float:1.8077773E38)
            r6 = 2131230991(0x7f08010f, float:1.807805E38)
            r7 = 2131230859(0x7f08008b, float:1.8077783E38)
            r8 = 2131231422(0x7f0802be, float:1.8078925E38)
            r9 = 2131230905(0x7f0800b9, float:1.8077876E38)
            r10 = 2131230855(0x7f080087, float:1.8077775E38)
            r11 = 2131230849(0x7f080081, float:1.8077762E38)
            if (r3 != 0) goto L_0x049a
            android.graphics.drawable.GradientDrawable r3 = new android.graphics.drawable.GradientDrawable
            android.graphics.drawable.GradientDrawable$Orientation r12 = android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM
            r13 = 2
            int[] r14 = new int[r13]
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r15 = "#"
            r13.append(r15)
            java.lang.String r15 = r0.f19628T
            r13.append(r15)
            java.lang.String r13 = r13.toString()
            int r13 = android.graphics.Color.parseColor(r13)
            r15 = 0
            r14[r15] = r13
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r15 = "#"
            r13.append(r15)
            java.lang.String r15 = r0.f19629U
            r13.append(r15)
            java.lang.String r13 = r13.toString()
            int r13 = android.graphics.Color.parseColor(r13)
            r14[r2] = r13
            r3.<init>(r12, r14)
            r12 = 2131231221(0x7f0801f5, float:1.8078517E38)
            android.view.View r12 = r0.findViewById(r12)
            r12.setBackgroundDrawable(r3)
            r3 = -1
            int r12 = mega.boicot.config.f17824d
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r14 = "#"
            r13.append(r14)
            java.lang.String r14 = r0.f19628T
            r13.append(r14)
            java.lang.String r13 = r13.toString()
            boolean r13 = mega.boicot.config.m23844a(r13)
            if (r13 == 0) goto L_0x0355
            r3 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            int r12 = mega.boicot.config.f17814b
        L_0x0355:
            r13 = 2131231260(0x7f08021c, float:1.8078596E38)
            android.view.View r13 = r0.findViewById(r13)
            android.widget.TextView r13 = (android.widget.TextView) r13
            r13.setTextColor(r3)
            r13 = 2131231261(0x7f08021d, float:1.8078598E38)
            android.view.View r13 = r0.findViewById(r13)
            android.widget.TextView r13 = (android.widget.TextView) r13
            r13.setTextColor(r3)
            android.view.View r13 = r0.findViewById(r10)
            android.widget.TextView r13 = (android.widget.TextView) r13
            r13.setTextColor(r3)
            r13 = 2131230923(0x7f0800cb, float:1.8077912E38)
            android.view.View r13 = r0.findViewById(r13)
            android.widget.TextView r13 = (android.widget.TextView) r13
            r13.setTextColor(r3)
            android.view.View r13 = r0.findViewById(r11)
            android.widget.TextView r13 = (android.widget.TextView) r13
            r13.setTextColor(r3)
            r13 = 2131230902(0x7f0800b6, float:1.807787E38)
            android.view.View r13 = r0.findViewById(r13)
            android.widget.TextView r13 = (android.widget.TextView) r13
            r13.setTextColor(r3)
            r13 = 2131230903(0x7f0800b7, float:1.8077872E38)
            android.view.View r13 = r0.findViewById(r13)
            android.widget.TextView r13 = (android.widget.TextView) r13
            r13.setTextColor(r3)
            r13 = 2131230904(0x7f0800b8, float:1.8077874E38)
            android.view.View r13 = r0.findViewById(r13)
            android.widget.TextView r13 = (android.widget.TextView) r13
            r13.setTextColor(r12)
            android.view.View r13 = r0.findViewById(r9)
            android.widget.TextView r13 = (android.widget.TextView) r13
            r13.setTextColor(r12)
            r12 = 2131230913(0x7f0800c1, float:1.8077892E38)
            android.view.View r12 = r0.findViewById(r12)
            android.widget.TextView r12 = (android.widget.TextView) r12
            r12.setTextColor(r3)
            r12 = 2131230914(0x7f0800c2, float:1.8077894E38)
            android.view.View r12 = r0.findViewById(r12)
            android.widget.TextView r12 = (android.widget.TextView) r12
            r12.setTextColor(r3)
            r12 = 2131230986(0x7f08010a, float:1.807804E38)
            android.view.View r12 = r0.findViewById(r12)
            android.widget.TextView r12 = (android.widget.TextView) r12
            r12.setTextColor(r3)
            r12 = 2131230987(0x7f08010b, float:1.8078042E38)
            android.view.View r12 = r0.findViewById(r12)
            android.widget.TextView r12 = (android.widget.TextView) r12
            r12.setTextColor(r3)
            r12 = 2131231421(0x7f0802bd, float:1.8078923E38)
            android.view.View r12 = r0.findViewById(r12)
            android.widget.TextView r12 = (android.widget.TextView) r12
            r12.setTextColor(r3)
            android.view.View r12 = r0.findViewById(r8)
            android.widget.TextView r12 = (android.widget.TextView) r12
            r12.setTextColor(r3)
            android.view.View r12 = r0.findViewById(r7)
            android.widget.TextView r12 = (android.widget.TextView) r12
            r12.setTextColor(r3)
            r12 = 2131230989(0x7f08010d, float:1.8078046E38)
            android.view.View r12 = r0.findViewById(r12)
            android.widget.TextView r12 = (android.widget.TextView) r12
            r12.setTextColor(r3)
            android.view.View r12 = r0.findViewById(r6)
            android.widget.TextView r12 = (android.widget.TextView) r12
            r12.setTextColor(r3)
            r12 = 2131231543(0x7f080337, float:1.807917E38)
            android.view.View r12 = r0.findViewById(r12)
            android.widget.TextView r12 = (android.widget.TextView) r12
            r12.setTextColor(r3)
            r12 = 2131231599(0x7f08036f, float:1.8079284E38)
            android.view.View r12 = r0.findViewById(r12)
            android.widget.TextView r12 = (android.widget.TextView) r12
            r12.setTextColor(r3)
            r12 = 2131231521(0x7f080321, float:1.8079125E38)
            android.view.View r12 = r0.findViewById(r12)
            android.widget.TextView r12 = (android.widget.TextView) r12
            r12.setTextColor(r3)
            int r3 = android.os.Build.VERSION.SDK_INT
            r12 = 20
            if (r3 <= r12) goto L_0x049a
            android.view.View r3 = r0.findViewById(r5)
            android.widget.EditText r3 = (android.widget.EditText) r3
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "#"
            r12.append(r13)
            java.lang.String r13 = r0.f19628T
            r12.append(r13)
            java.lang.String r12 = r12.toString()
            boolean r12 = mega.boicot.config.m23844a(r12)
            r12 = r12 ^ r2
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r12)
            mega.boicot.config r13 = r0.f19635a
            java.lang.String r13 = r13.f17949bd
            mega.boicot.config.m23837a(r3, r12, r13)
            r3 = 2131230848(0x7f080080, float:1.807776E38)
            android.view.View r3 = r0.findViewById(r3)
            android.widget.EditText r3 = (android.widget.EditText) r3
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "#"
            r12.append(r13)
            java.lang.String r13 = r0.f19628T
            r12.append(r13)
            java.lang.String r12 = r12.toString()
            boolean r12 = mega.boicot.config.m23844a(r12)
            r12 = r12 ^ r2
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r12)
            mega.boicot.config r13 = r0.f19635a
            java.lang.String r13 = r13.f17949bd
            mega.boicot.config.m23837a(r3, r12, r13)
        L_0x049a:
            mega.boicot.config r3 = r0.f19635a
            java.io.File r3 = r3.mo20757a(r0, r2)
            boolean r3 = r3.exists()
            if (r3 != 0) goto L_0x04b1
            mega.boicot.config r3 = r0.f19635a     // Catch:{ Exception -> 0x04c1 }
            r12 = 2
            java.io.File r3 = r3.mo20757a(r0, r12)     // Catch:{ Exception -> 0x04c1 }
            r3.delete()     // Catch:{ Exception -> 0x04c1 }
            goto L_0x04c1
        L_0x04b1:
            mega.boicot.config r3 = r0.f19635a     // Catch:{ Exception -> 0x04c1 }
            java.io.File r3 = r3.mo20757a(r0, r2)     // Catch:{ Exception -> 0x04c1 }
            mega.boicot.config r12 = r0.f19635a     // Catch:{ Exception -> 0x04c1 }
            r13 = 2
            java.io.File r12 = r12.mo20757a(r0, r13)     // Catch:{ Exception -> 0x04c1 }
            mega.boicot.config.m23840a(r3, r12)     // Catch:{ Exception -> 0x04c1 }
        L_0x04c1:
            mega.boicot.config r3 = r0.f19635a
            int r3 = r3.f18062ed
            r12 = 8
            if (r3 == r2) goto L_0x04d0
            mega.boicot.config r3 = r0.f19635a
            int r3 = r3.f18062ed
            r13 = 2
            if (r3 != r13) goto L_0x0588
        L_0x04d0:
            android.content.SharedPreferences r3 = r0.f19639ad
            java.lang.String r13 = "logineado_fb"
            r14 = 0
            boolean r3 = r3.getBoolean(r13, r14)
            if (r3 != 0) goto L_0x0588
            mega.boicot.config r3 = r0.f19635a
            int r3 = r3.f18063ee
            if (r3 == r2) goto L_0x0526
            r3 = 2131231084(0x7f08016c, float:1.807824E38)
            android.view.View r3 = r0.findViewById(r3)
            android.widget.Button r3 = (android.widget.Button) r3
            com.facebook.e r13 = com.facebook.C2468e.C2469a.m9383a()     // Catch:{ Exception -> 0x0518 }
            r0.f19664z = r13     // Catch:{ Exception -> 0x0518 }
            com.facebook.login.widget.LoginButton r13 = new com.facebook.login.widget.LoginButton     // Catch:{ Exception -> 0x0518 }
            r13.<init>(r0)     // Catch:{ Exception -> 0x0518 }
            r0.f19609A = r13     // Catch:{ Exception -> 0x0518 }
            com.facebook.login.widget.LoginButton r13 = r0.f19609A     // Catch:{ Exception -> 0x0518 }
            java.lang.String[] r14 = new java.lang.String[r2]     // Catch:{ Exception -> 0x0518 }
            java.lang.String r15 = "public_profile"
            r16 = 0
            r14[r16] = r15     // Catch:{ Exception -> 0x0518 }
            r13.setReadPermissions(r14)     // Catch:{ Exception -> 0x0518 }
            com.facebook.login.widget.LoginButton r13 = r0.f19609A     // Catch:{ Exception -> 0x0518 }
            com.facebook.e r14 = r0.f19664z     // Catch:{ Exception -> 0x0518 }
            mega.boicot.chat_perfil$23 r15 = new mega.boicot.chat_perfil$23     // Catch:{ Exception -> 0x0518 }
            r15.<init>()     // Catch:{ Exception -> 0x0518 }
            r13.mo9266a(r14, r15)     // Catch:{ Exception -> 0x0518 }
            mega.boicot.chat_perfil$24 r13 = new mega.boicot.chat_perfil$24     // Catch:{ Exception -> 0x0518 }
            r13.<init>()     // Catch:{ Exception -> 0x0518 }
            r3.setOnClickListener(r13)     // Catch:{ Exception -> 0x0518 }
        L_0x0518:
            r13 = 0
            r3.setVisibility(r13)
            r3 = 2131231630(0x7f08038e, float:1.8079346E38)
            android.view.View r3 = r0.findViewById(r3)
            r3.setVisibility(r13)
        L_0x0526:
            mega.boicot.config r3 = r0.f19635a
            int r3 = r3.f18063ee
            if (r3 == 0) goto L_0x055f
            com.google.android.gms.auth.api.signin.GoogleSignInOptions$a r3 = new com.google.android.gms.auth.api.signin.GoogleSignInOptions$a
            com.google.android.gms.auth.api.signin.GoogleSignInOptions r13 = com.google.android.gms.auth.api.signin.GoogleSignInOptions.f9362f
            r3.<init>(r13)
            com.google.android.gms.auth.api.signin.GoogleSignInOptions r3 = r3.mo12976c()
            com.google.android.gms.auth.api.signin.c r3 = com.google.android.gms.auth.api.signin.C3197a.m11497a(r0, r3)
            r13 = 2131231088(0x7f080170, float:1.8078247E38)
            android.view.View r13 = r0.findViewById(r13)
            mega.boicot.chat_perfil$25 r14 = new mega.boicot.chat_perfil$25
            r14.<init>(r3)
            r13.setOnClickListener(r14)
            r3 = 2131231088(0x7f080170, float:1.8078247E38)
            android.view.View r3 = r0.findViewById(r3)
            r13 = 0
            r3.setVisibility(r13)
            r3 = 2131231630(0x7f08038e, float:1.8079346E38)
            android.view.View r3 = r0.findViewById(r3)
            r3.setVisibility(r13)
        L_0x055f:
            mega.boicot.config r3 = r0.f19635a
            int r3 = r3.f18062ed
            r13 = 2
            if (r3 != r13) goto L_0x0588
            boolean r3 = r0.f19642d
            if (r3 == 0) goto L_0x0588
            r3 = 2131231630(0x7f08038e, float:1.8079346E38)
            android.view.View r3 = r0.findViewById(r3)
            r3.setVisibility(r12)
            r3 = 2131231455(0x7f0802df, float:1.8078991E38)
            android.view.View r3 = r0.findViewById(r3)
            r3.setVisibility(r12)
            r3 = 2131231165(0x7f0801bd, float:1.8078403E38)
            android.view.View r3 = r0.findViewById(r3)
            r3.setVisibility(r12)
        L_0x0588:
            mega.boicot.config r3 = r0.f19635a
            int r3 = r3.f18062ed
            r13 = 3
            r14 = 5
            if (r3 != r13) goto L_0x066b
            boolean r3 = r0.f19621M
            if (r3 == 0) goto L_0x062b
            r3 = 2131231505(0x7f080311, float:1.8079093E38)
            android.view.View r3 = r0.findViewById(r3)
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r3 = (android.view.ViewGroup.MarginLayoutParams) r3
            int r9 = mega.boicot.config.m23845b(r0, r14)
            r13 = 0
            r3.setMargins(r13, r9, r13, r13)
            r3 = 2131231505(0x7f080311, float:1.8079093E38)
            android.view.View r3 = r0.findViewById(r3)
            r3.requestLayout()
            r3 = 2131231503(0x7f08030f, float:1.8079089E38)
            android.view.View r3 = r0.findViewById(r3)
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r3 = (android.view.ViewGroup.MarginLayoutParams) r3
            int r9 = mega.boicot.config.m23845b(r0, r14)
            r3.setMargins(r13, r9, r13, r13)
            r3 = 2131231503(0x7f08030f, float:1.8079089E38)
            android.view.View r3 = r0.findViewById(r3)
            r3.requestLayout()
            android.view.View r3 = r0.findViewById(r11)
            r3.setVisibility(r12)
            r3 = 2131230924(0x7f0800cc, float:1.8077915E38)
            android.view.View r3 = r0.findViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            android.content.SharedPreferences r9 = r0.f19639ad
            java.lang.String r13 = "email"
            java.lang.String r15 = ""
            java.lang.String r9 = r9.getString(r13, r15)
            r3.setText(r9)
            android.view.View r3 = r0.findViewById(r11)
            android.widget.EditText r3 = (android.widget.EditText) r3
            android.content.SharedPreferences r9 = r0.f19639ad
            java.lang.String r11 = "email"
            java.lang.String r13 = ""
            java.lang.String r9 = r9.getString(r11, r13)
            r3.setText(r9)
            r3 = 2131230924(0x7f0800cc, float:1.8077915E38)
            android.view.View r3 = r0.findViewById(r3)
            r13 = 0
            r3.setVisibility(r13)
            r3 = 2131230847(0x7f08007f, float:1.8077758E38)
            android.view.View r3 = r0.findViewById(r3)
            r3.setVisibility(r12)
            r3 = 2131230904(0x7f0800b8, float:1.8077874E38)
            android.view.View r3 = r0.findViewById(r3)
            r3.setOnClickListener(r0)
            r3 = 2131231179(0x7f0801cb, float:1.8078432E38)
            android.view.View r3 = r0.findViewById(r3)
            r3.setVisibility(r13)
            goto L_0x0657
        L_0x062b:
            r13 = 0
            android.view.View r3 = r0.findViewById(r11)
            android.widget.TextView r3 = (android.widget.TextView) r3
            android.content.SharedPreferences r11 = r0.f19639ad
            java.lang.String r15 = "email"
            java.lang.String r10 = ""
            java.lang.String r10 = r11.getString(r15, r10)
            r3.setText(r10)
            android.content.SharedPreferences r3 = r0.f19639ad
            java.lang.String r10 = "mostrar_recordarcontra"
            boolean r3 = r3.getBoolean(r10, r13)
            if (r3 == 0) goto L_0x0657
            android.view.View r3 = r0.findViewById(r9)
            r3.setOnClickListener(r0)
            android.view.View r3 = r0.findViewById(r9)
            r3.setVisibility(r13)
        L_0x0657:
            r3 = 2131231505(0x7f080311, float:1.8079093E38)
            android.view.View r3 = r0.findViewById(r3)
            r3.setVisibility(r13)
            r3 = 2131231503(0x7f08030f, float:1.8079089E38)
            android.view.View r3 = r0.findViewById(r3)
            r3.setVisibility(r13)
        L_0x066b:
            int r3 = r0.f19613E
            if (r3 != 0) goto L_0x067a
            r3 = 2131231507(0x7f080313, float:1.8079097E38)
            android.view.View r3 = r0.findViewById(r3)
            r3.setVisibility(r12)
            goto L_0x0686
        L_0x067a:
            int r3 = r0.f19613E
            r9 = 2
            if (r3 != r9) goto L_0x0686
            android.view.View r3 = r0.findViewById(r6)
            r3.setVisibility(r12)
        L_0x0686:
            int r3 = r0.f19616H
            if (r3 != 0) goto L_0x0695
            r3 = 2131231504(0x7f080310, float:1.807909E38)
            android.view.View r3 = r0.findViewById(r3)
            r3.setVisibility(r12)
            goto L_0x06a4
        L_0x0695:
            int r3 = r0.f19616H
            r9 = 2
            if (r3 != r9) goto L_0x06a4
            r3 = 2131230914(0x7f0800c2, float:1.8077894E38)
            android.view.View r3 = r0.findViewById(r3)
            r3.setVisibility(r12)
        L_0x06a4:
            int r3 = r0.f19614F
            if (r3 != 0) goto L_0x06b3
            r3 = 2131231506(0x7f080312, float:1.8079095E38)
            android.view.View r3 = r0.findViewById(r3)
            r3.setVisibility(r12)
            goto L_0x06c2
        L_0x06b3:
            int r3 = r0.f19614F
            r9 = 2
            if (r3 != r9) goto L_0x06c2
            r3 = 2131230987(0x7f08010b, float:1.8078042E38)
            android.view.View r3 = r0.findViewById(r3)
            r3.setVisibility(r12)
        L_0x06c2:
            mega.boicot.config r3 = r0.f19635a
            boolean r3 = r3.f17933bN
            if (r3 == 0) goto L_0x06dd
            r3 = 2131230851(0x7f080083, float:1.8077766E38)
            android.view.View r3 = r0.findViewById(r3)
            r9 = 0
            r3.setVisibility(r9)
            r3 = 2131230852(0x7f080084, float:1.8077768E38)
            android.view.View r3 = r0.findViewById(r3)
            r3.setVisibility(r9)
        L_0x06dd:
            int r3 = r0.f19615G
            if (r3 != 0) goto L_0x06ec
            r3 = 2131231512(0x7f080318, float:1.8079107E38)
            android.view.View r3 = r0.findViewById(r3)
            r3.setVisibility(r12)
            goto L_0x06f8
        L_0x06ec:
            int r3 = r0.f19615G
            r9 = 2
            if (r3 != r9) goto L_0x06f8
            android.view.View r3 = r0.findViewById(r8)
            r3.setVisibility(r12)
        L_0x06f8:
            int r3 = r0.f19617I
            if (r3 != 0) goto L_0x0707
            r3 = 2131231502(0x7f08030e, float:1.8079087E38)
            android.view.View r3 = r0.findViewById(r3)
            r3.setVisibility(r12)
            goto L_0x072f
        L_0x0707:
            r3 = 2131231543(0x7f080337, float:1.807917E38)
            android.view.View r3 = r0.findViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            android.content.res.Resources r10 = r18.getResources()
            r11 = 2131558508(0x7f0d006c, float:1.8742334E38)
            java.lang.String r10 = r10.getString(r11)
            r9.append(r10)
            java.lang.String r10 = ":"
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            r3.setText(r9)
        L_0x072f:
            int r3 = r0.f19618J
            if (r3 != 0) goto L_0x073d
            r3 = 2131231511(0x7f080317, float:1.8079105E38)
            android.view.View r3 = r0.findViewById(r3)
            r3.setVisibility(r12)
        L_0x073d:
            r3 = 2131230826(0x7f08006a, float:1.8077716E38)
            android.view.View r3 = r0.findViewById(r3)
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            r0.f19623O = r3
            android.widget.ImageView r3 = r0.f19623O
            r3.setOnClickListener(r0)
            r3 = 2131230823(0x7f080067, float:1.807771E38)
            android.view.View r3 = r0.findViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            mega.boicot.config r9 = r0.f19635a
            java.lang.String r9 = r9.f17890aW
            java.lang.String r10 = ""
            boolean r9 = r9.equals(r10)
            if (r9 != 0) goto L_0x079e
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "#"
            r9.append(r10)
            mega.boicot.config r10 = r0.f19635a
            java.lang.String r10 = r10.f17890aW
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            int r9 = android.graphics.Color.parseColor(r9)
            r3.setBackgroundColor(r9)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "#"
            r9.append(r10)
            mega.boicot.config r10 = r0.f19635a
            java.lang.String r10 = r10.f17890aW
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            boolean r9 = mega.boicot.config.m23844a(r9)
            if (r9 == 0) goto L_0x079e
            r9 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r3.setTextColor(r9)
        L_0x079e:
            r3.setOnClickListener(r0)
            r3 = 2131230830(0x7f08006e, float:1.8077724E38)
            android.view.View r3 = r0.findViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            int r9 = r0.f19619K
            if (r9 == r2) goto L_0x07c8
            int r9 = r0.f19617I
            if (r9 == r2) goto L_0x07c8
            mega.boicot.config r9 = r0.f19635a
            boolean r9 = r9.f17932bM
            if (r9 == 0) goto L_0x07b9
            goto L_0x07c8
        L_0x07b9:
            r3.setVisibility(r12)
            r3 = 2131230831(0x7f08006f, float:1.8077726E38)
            android.view.View r3 = r0.findViewById(r3)
            r3.setVisibility(r12)
            goto L_0x0850
        L_0x07c8:
            int r9 = r0.f19619K
            if (r9 == r2) goto L_0x07d2
            mega.boicot.config r9 = r0.f19635a
            boolean r9 = r9.f17932bM
            if (r9 == 0) goto L_0x080c
        L_0x07d2:
            int r9 = r0.f19617I
            if (r9 != r2) goto L_0x080c
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            android.content.res.Resources r10 = r18.getResources()
            r11 = 2131558656(0x7f0d0100, float:1.8742634E38)
            java.lang.String r10 = r10.getString(r11)
            java.lang.String r10 = r10.toUpperCase()
            r9.append(r10)
            java.lang.String r10 = "/"
            r9.append(r10)
            android.content.res.Resources r10 = r18.getResources()
            r11 = 2131558684(0x7f0d011c, float:1.874269E38)
            java.lang.String r10 = r10.getString(r11)
            java.lang.String r10 = r10.toUpperCase()
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            r3.setText(r9)
            goto L_0x084d
        L_0x080c:
            int r9 = r0.f19619K
            if (r9 == r2) goto L_0x0816
            mega.boicot.config r9 = r0.f19635a
            boolean r9 = r9.f17932bM
            if (r9 == 0) goto L_0x082d
        L_0x0816:
            int r9 = r0.f19617I
            if (r9 != 0) goto L_0x082d
            android.content.res.Resources r9 = r18.getResources()
            r10 = 2131558656(0x7f0d0100, float:1.8742634E38)
            java.lang.String r9 = r9.getString(r10)
            java.lang.String r9 = r9.toUpperCase()
            r3.setText(r9)
            goto L_0x084d
        L_0x082d:
            int r9 = r0.f19619K
            if (r9 != 0) goto L_0x084d
            mega.boicot.config r9 = r0.f19635a
            boolean r9 = r9.f17932bM
            if (r9 != 0) goto L_0x084d
            int r9 = r0.f19617I
            if (r9 != r2) goto L_0x084d
            android.content.res.Resources r9 = r18.getResources()
            r10 = 2131558508(0x7f0d006c, float:1.8742334E38)
            java.lang.String r9 = r9.getString(r10)
            java.lang.String r9 = r9.toUpperCase()
            r3.setText(r9)
        L_0x084d:
            r3.setOnClickListener(r0)
        L_0x0850:
            r3 = 2131230819(0x7f080063, float:1.8077702E38)
            android.view.View r3 = r0.findViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            boolean r9 = r0.f19642d
            if (r9 != 0) goto L_0x0885
            r3.setOnClickListener(r0)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "#"
            r9.append(r10)
            java.lang.String r10 = r0.f19629U
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            boolean r9 = mega.boicot.config.m23844a(r9)
            if (r9 == 0) goto L_0x087f
            int r9 = mega.boicot.config.f17838f
            r3.setTextColor(r9)
            goto L_0x0888
        L_0x087f:
            int r9 = mega.boicot.config.f17834e
            r3.setTextColor(r9)
            goto L_0x0888
        L_0x0885:
            r3.setVisibility(r12)
        L_0x0888:
            r3 = 0
            r0.f19646h = r3
            mega.boicot.config r9 = r0.f19635a
            boolean r9 = r9.f17878aK
            if (r9 == 0) goto L_0x0964
            java.util.Locale r9 = java.util.Locale.getDefault()
            java.lang.String r9 = r9.getCountry()
            if (r9 == 0) goto L_0x0964
            r10 = 33
            java.lang.String[] r10 = new java.lang.String[r10]
            java.lang.String r11 = "BE"
            r10[r3] = r11
            java.lang.String r3 = "LT"
            r10[r2] = r3
            java.lang.String r3 = "PT"
            r11 = 2
            r10[r11] = r3
            r3 = 3
            java.lang.String r11 = "BG"
            r10[r3] = r11
            r3 = 4
            java.lang.String r11 = "ES"
            r10[r3] = r11
            java.lang.String r3 = "LU"
            r10[r14] = r3
            r3 = 6
            java.lang.String r11 = "RO"
            r10[r3] = r11
            r3 = 7
            java.lang.String r11 = "CZ"
            r10[r3] = r11
            java.lang.String r3 = "FR"
            r10[r12] = r3
            r3 = 9
            java.lang.String r11 = "HU"
            r10[r3] = r11
            r3 = 10
            java.lang.String r11 = "SI"
            r10[r3] = r11
            r3 = 11
            java.lang.String r11 = "DK"
            r10[r3] = r11
            java.lang.String r3 = "MT"
            r10[r4] = r3
            r3 = 13
            java.lang.String r11 = "SK"
            r10[r3] = r11
            r3 = 14
            java.lang.String r11 = "DE"
            r10[r3] = r11
            r3 = 15
            java.lang.String r11 = "IT"
            r10[r3] = r11
            r3 = 16
            java.lang.String r11 = "NL"
            r10[r3] = r11
            r3 = 17
            java.lang.String r11 = "FI"
            r10[r3] = r11
            r3 = 18
            java.lang.String r11 = "EE"
            r10[r3] = r11
            r3 = 19
            java.lang.String r11 = "CY"
            r10[r3] = r11
            r3 = 20
            java.lang.String r11 = "AT"
            r10[r3] = r11
            r3 = 21
            java.lang.String r11 = "SE"
            r10[r3] = r11
            r3 = 22
            java.lang.String r11 = "IE"
            r10[r3] = r11
            r3 = 23
            java.lang.String r11 = "LV"
            r10[r3] = r11
            r3 = 24
            java.lang.String r11 = "PL"
            r10[r3] = r11
            r3 = 25
            java.lang.String r11 = "CH"
            r10[r3] = r11
            r3 = 26
            java.lang.String r11 = "NO"
            r10[r3] = r11
            r3 = 27
            java.lang.String r11 = "IS"
            r10[r3] = r11
            r3 = 28
            java.lang.String r11 = "LI"
            r10[r3] = r11
            r3 = 29
            java.lang.String r11 = "HR"
            r10[r3] = r11
            r3 = 30
            java.lang.String r11 = "GR"
            r10[r3] = r11
            r3 = 31
            java.lang.String r11 = "GB"
            r10[r3] = r11
            r3 = 32
            java.lang.String r11 = "UK"
            r10[r3] = r11
            java.util.List r3 = java.util.Arrays.asList(r10)
            java.lang.String r9 = r9.toUpperCase()
            boolean r3 = r3.contains(r9)
            r0.f19646h = r3
        L_0x0964:
            r3 = 2131230828(0x7f08006c, float:1.807772E38)
            android.view.View r3 = r0.findViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            r9 = 2131230829(0x7f08006d, float:1.8077722E38)
            android.view.View r9 = r0.findViewById(r9)
            android.widget.TextView r9 = (android.widget.TextView) r9
            mega.boicot.config r10 = r0.f19635a
            boolean r10 = r10.f18060eb
            if (r10 != 0) goto L_0x0985
            boolean r10 = r0.f19646h
            if (r10 == 0) goto L_0x0981
            goto L_0x0985
        L_0x0981:
            r3.setVisibility(r12)
            goto L_0x09e4
        L_0x0985:
            mega.boicot.config r10 = r0.f19635a
            int r10 = r10.f18062ed
            r11 = 2
            if (r10 != r11) goto L_0x09bd
            boolean r10 = r0.f19642d
            if (r10 == 0) goto L_0x09bd
            r9.setOnClickListener(r0)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r10 = "#"
            r3.append(r10)
            java.lang.String r10 = r0.f19629U
            r3.append(r10)
            java.lang.String r3 = r3.toString()
            boolean r3 = mega.boicot.config.m23844a(r3)
            if (r3 == 0) goto L_0x09b3
            int r3 = mega.boicot.config.f17838f
            r9.setTextColor(r3)
        L_0x09b1:
            r3 = 0
            goto L_0x09b9
        L_0x09b3:
            int r3 = mega.boicot.config.f17834e
            r9.setTextColor(r3)
            goto L_0x09b1
        L_0x09b9:
            r9.setVisibility(r3)
            goto L_0x09e4
        L_0x09bd:
            r3.setOnClickListener(r0)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "#"
            r9.append(r10)
            java.lang.String r10 = r0.f19629U
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            boolean r9 = mega.boicot.config.m23844a(r9)
            if (r9 == 0) goto L_0x09df
            int r9 = mega.boicot.config.f17838f
            r3.setTextColor(r9)
            goto L_0x09e4
        L_0x09df:
            int r9 = mega.boicot.config.f17834e
            r3.setTextColor(r9)
        L_0x09e4:
            r3 = 2131230990(0x7f08010e, float:1.8078048E38)
            android.view.View r3 = r0.findViewById(r3)
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            r0.f19622N = r3
            r3 = 2131230921(0x7f0800c9, float:1.8077908E38)
            android.view.View r3 = r0.findViewById(r3)
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            r0.f19624P = r3
            android.widget.ImageView r3 = r0.f19624P
            r3.setOnClickListener(r0)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            android.content.res.Resources r9 = r18.getResources()
            r10 = 2131558562(0x7f0d00a2, float:1.8742443E38)
            java.lang.String r9 = r9.getString(r10)
            r3.add(r9)
            r9 = r2
        L_0x0a13:
            r10 = 32
            if (r9 >= r10) goto L_0x0a2e
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r9)
            java.lang.String r11 = ""
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            r3.add(r10)
            int r9 = r9 + 1
            goto L_0x0a13
        L_0x0a2e:
            r9 = 2131230851(0x7f080083, float:1.8077766E38)
            android.view.View r9 = r0.findViewById(r9)
            android.widget.Spinner r9 = (android.widget.Spinner) r9
            r0.f19633Y = r9
            android.widget.ArrayAdapter r9 = new android.widget.ArrayAdapter
            r10 = 17367048(0x1090008, float:2.5162948E-38)
            r9.<init>(r0, r10, r3)
            r3 = 17367049(0x1090009, float:2.516295E-38)
            r9.setDropDownViewResource(r3)
            android.widget.Spinner r11 = r0.f19633Y
            r11.setAdapter(r9)
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            android.content.res.Resources r11 = r18.getResources()
            r13 = 2131558668(0x7f0d010c, float:1.8742658E38)
            java.lang.String r11 = r11.getString(r13)
            r9.add(r11)
            java.util.Calendar r11 = java.util.Calendar.getInstance()
            r11.set(r14, r2)
            r13 = 0
        L_0x0a67:
            if (r13 >= r4) goto L_0x0aa1
            r14 = 2
            r11.set(r14, r13)
            java.util.Locale r15 = java.util.Locale.getDefault()
            java.lang.String r15 = r11.getDisplayName(r14, r2, r15)
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0a96 }
            r14.<init>()     // Catch:{ Exception -> 0x0a96 }
            r4 = 0
            java.lang.String r6 = r15.substring(r4, r2)     // Catch:{ Exception -> 0x0a96 }
            java.util.Locale r4 = java.util.Locale.getDefault()     // Catch:{ Exception -> 0x0a96 }
            java.lang.String r4 = r6.toUpperCase(r4)     // Catch:{ Exception -> 0x0a96 }
            r14.append(r4)     // Catch:{ Exception -> 0x0a96 }
            java.lang.String r4 = r15.substring(r2)     // Catch:{ Exception -> 0x0a96 }
            r14.append(r4)     // Catch:{ Exception -> 0x0a96 }
            java.lang.String r4 = r14.toString()     // Catch:{ Exception -> 0x0a96 }
            r15 = r4
        L_0x0a96:
            r9.add(r15)
            int r13 = r13 + 1
            r4 = 12
            r6 = 2131230991(0x7f08010f, float:1.807805E38)
            goto L_0x0a67
        L_0x0aa1:
            r4 = 2131230852(0x7f080084, float:1.8077768E38)
            android.view.View r4 = r0.findViewById(r4)
            android.widget.Spinner r4 = (android.widget.Spinner) r4
            r0.f19634Z = r4
            android.widget.ArrayAdapter r4 = new android.widget.ArrayAdapter
            r4.<init>(r0, r10, r9)
            r4.setDropDownViewResource(r3)
            android.widget.Spinner r6 = r0.f19634Z
            r6.setAdapter(r4)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            android.content.res.Resources r6 = r18.getResources()
            r9 = 2131558447(0x7f0d002f, float:1.874221E38)
            java.lang.String r6 = r6.getString(r9)
            r4.add(r6)
            java.util.Calendar r6 = java.util.Calendar.getInstance()
            r9 = 14
        L_0x0ad2:
            r11 = 100
            if (r9 >= r11) goto L_0x0af2
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            int r13 = r6.get(r2)
            int r13 = r13 - r9
            r11.append(r13)
            java.lang.String r13 = ""
            r11.append(r13)
            java.lang.String r11 = r11.toString()
            r4.add(r11)
            int r9 = r9 + 1
            goto L_0x0ad2
        L_0x0af2:
            r6 = 2131230850(0x7f080082, float:1.8077764E38)
            android.view.View r6 = r0.findViewById(r6)
            android.widget.Spinner r6 = (android.widget.Spinner) r6
            r0.f19636aa = r6
            android.widget.ArrayAdapter r6 = new android.widget.ArrayAdapter
            r6.<init>(r0, r10, r4)
            r6.setDropDownViewResource(r3)
            android.widget.Spinner r4 = r0.f19636aa
            r4.setAdapter(r6)
            r4 = 2131230858(0x7f08008a, float:1.807778E38)
            android.view.View r4 = r0.findViewById(r4)
            android.widget.Spinner r4 = (android.widget.Spinner) r4
            r0.f19637ab = r4
            r4 = 2130837542(0x7f020026, float:1.7280041E38)
            android.widget.ArrayAdapter r4 = android.widget.ArrayAdapter.createFromResource(r0, r4, r10)
            r4.setDropDownViewResource(r3)
            android.widget.Spinner r9 = r0.f19637ab
            r9.setAdapter(r4)
            r4 = 2131230846(0x7f08007e, float:1.8077756E38)
            android.view.View r4 = r0.findViewById(r4)
            android.widget.Spinner r4 = (android.widget.Spinner) r4
            r0.f19638ac = r4
            r4 = 2130837520(0x7f020010, float:1.7279996E38)
            android.widget.ArrayAdapter r4 = android.widget.ArrayAdapter.createFromResource(r0, r4, r10)
            r4.setDropDownViewResource(r3)
            android.widget.Spinner r9 = r0.f19638ac
            r9.setAdapter(r4)
            r4 = 2131230857(0x7f080089, float:1.8077779E38)
            android.view.View r4 = r0.findViewById(r4)
            android.widget.Spinner r4 = (android.widget.Spinner) r4
            r0.f19632X = r4
            r4 = 2130837541(0x7f020025, float:1.728004E38)
            android.widget.ArrayAdapter r4 = android.widget.ArrayAdapter.createFromResource(r0, r4, r10)
            r4.setDropDownViewResource(r3)
            android.widget.Spinner r9 = r0.f19632X
            r9.setAdapter(r4)
            r4 = 2131230840(0x7f080078, float:1.8077744E38)
            android.view.View r4 = r0.findViewById(r4)
            android.widget.Spinner r4 = (android.widget.Spinner) r4
            r0.f19631W = r4
            r4 = 2130837504(0x7f020000, float:1.7279964E38)
            android.widget.ArrayAdapter r4 = android.widget.ArrayAdapter.createFromResource(r0, r4, r10)
            r4.setDropDownViewResource(r3)
            android.widget.Spinner r3 = r0.f19631W
            r3.setAdapter(r4)
            android.content.SharedPreferences r3 = r0.f19639ad
            java.lang.String r4 = "fnac_d"
            r9 = 0
            int r3 = r3.getInt(r4, r9)
            mega.boicot.config r4 = r0.f19635a
            boolean r4 = r4.f17933bN
            if (r4 != 0) goto L_0x0b83
            if (r3 != 0) goto L_0x0b83
            r3 = r2
        L_0x0b83:
            android.widget.Spinner r4 = r0.f19633Y
            r4.setSelection(r3)
            android.content.SharedPreferences r3 = r0.f19639ad
            java.lang.String r4 = "fnac_m"
            r9 = 0
            int r3 = r3.getInt(r4, r9)
            mega.boicot.config r4 = r0.f19635a
            boolean r4 = r4.f17933bN
            if (r4 != 0) goto L_0x0b9a
            if (r3 != 0) goto L_0x0b9a
            r3 = r2
        L_0x0b9a:
            android.widget.Spinner r4 = r0.f19634Z
            r4.setSelection(r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            android.content.SharedPreferences r4 = r0.f19639ad
            java.lang.String r9 = "fnac_a"
            r11 = 0
            int r4 = r4.getInt(r9, r11)
            r3.append(r4)
            java.lang.String r4 = ""
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            int r3 = r6.getPosition(r3)
            r4 = -1
            if (r3 != r4) goto L_0x0bc6
            android.widget.Spinner r3 = r0.f19636aa
            r3.setSelection(r11)
            goto L_0x0bcb
        L_0x0bc6:
            android.widget.Spinner r4 = r0.f19636aa
            r4.setSelection(r3)
        L_0x0bcb:
            r3 = 2130837539(0x7f020023, float:1.7280035E38)
            android.widget.ArrayAdapter r3 = android.widget.ArrayAdapter.createFromResource(r0, r3, r10)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            android.content.SharedPreferences r6 = r0.f19639ad
            java.lang.String r9 = "sexo"
            int r6 = r6.getInt(r9, r11)
            r4.append(r6)
            java.lang.String r6 = ""
            r4.append(r6)
            java.lang.String r4 = r4.toString()
            int r3 = r3.getPosition(r4)
            android.widget.Spinner r4 = r0.f19637ab
            r4.setSelection(r3)
            android.view.View r3 = r0.findViewById(r7)
            android.widget.TextView r3 = (android.widget.TextView) r3
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r6 = "  "
            r4.append(r6)
            android.widget.Spinner r6 = r0.f19637ab
            java.lang.Object r6 = r6.getSelectedItem()
            java.lang.String r6 = r6.toString()
            r4.append(r6)
            java.lang.String r4 = r4.toString()
            r3.setText(r4)
            r3 = 2130837537(0x7f020021, float:1.728003E38)
            android.widget.ArrayAdapter r3 = android.widget.ArrayAdapter.createFromResource(r0, r3, r10)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            android.content.SharedPreferences r6 = r0.f19639ad
            java.lang.String r9 = "coments"
            int r6 = r6.getInt(r9, r2)
            r4.append(r6)
            java.lang.String r6 = ""
            r4.append(r6)
            java.lang.String r4 = r4.toString()
            int r3 = r3.getPosition(r4)
            android.widget.Spinner r4 = r0.f19638ac
            r4.setSelection(r3)
            r3 = 2130837538(0x7f020022, float:1.7280033E38)
            android.widget.ArrayAdapter r3 = android.widget.ArrayAdapter.createFromResource(r0, r3, r10)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            android.content.SharedPreferences r6 = r0.f19639ad
            java.lang.String r9 = "privados"
            int r6 = r6.getInt(r9, r2)
            r4.append(r6)
            java.lang.String r6 = ""
            r4.append(r6)
            java.lang.String r4 = r4.toString()
            int r3 = r3.getPosition(r4)
            android.widget.Spinner r4 = r0.f19632X
            r4.setSelection(r3)
            r3 = 2130837521(0x7f020011, float:1.7279998E38)
            android.widget.ArrayAdapter r3 = android.widget.ArrayAdapter.createFromResource(r0, r3, r10)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            android.content.SharedPreferences r6 = r0.f19639ad
            java.lang.String r9 = "avisos"
            int r6 = r6.getInt(r9, r2)
            r4.append(r6)
            java.lang.String r6 = ""
            r4.append(r6)
            java.lang.String r4 = r4.toString()
            int r3 = r3.getPosition(r4)
            android.widget.Spinner r4 = r0.f19631W
            r4.setSelection(r3)
            android.view.View r3 = r0.findViewById(r5)
            android.widget.TextView r3 = (android.widget.TextView) r3
            android.content.SharedPreferences r4 = r0.f19639ad
            java.lang.String r6 = "nick"
            java.lang.String r9 = ""
            java.lang.String r4 = r4.getString(r6, r9)
            r3.setText(r4)
            r3 = 2131230855(0x7f080087, float:1.8077775E38)
            android.view.View r4 = r0.findViewById(r3)
            android.widget.TextView r4 = (android.widget.TextView) r4
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r6 = "  "
            r3.append(r6)
            android.content.SharedPreferences r6 = r0.f19639ad
            java.lang.String r9 = "nick"
            java.lang.String r10 = ""
            java.lang.String r6 = r6.getString(r9, r10)
            r3.append(r6)
            java.lang.String r3 = r3.toString()
            r4.setText(r3)
            r3 = 2131230848(0x7f080080, float:1.807776E38)
            android.view.View r3 = r0.findViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            android.content.SharedPreferences r4 = r0.f19639ad
            java.lang.String r6 = "descr"
            java.lang.String r9 = ""
            java.lang.String r4 = r4.getString(r6, r9)
            r3.setText(r4)
            mega.boicot.config r3 = r0.f19635a
            int r3 = r3.f18062ed
            if (r3 == r2) goto L_0x0cf0
            mega.boicot.config r3 = r0.f19635a
            int r3 = r3.f18062ed
            r4 = 2
            if (r3 != r4) goto L_0x0d71
        L_0x0cf0:
            mega.boicot.config r3 = r0.f19635a
            boolean r3 = r3.f18064ef
            if (r3 == 0) goto L_0x0d71
            android.content.SharedPreferences r3 = r0.f19639ad
            java.lang.String r4 = "logineado_fb"
            r6 = 0
            boolean r3 = r3.getBoolean(r4, r6)
            if (r3 == 0) goto L_0x0d71
            r3 = 2131231261(0x7f08021d, float:1.8078598E38)
            android.view.View r3 = r0.findViewById(r3)
            r3.setVisibility(r12)
            android.view.View r3 = r0.findViewById(r5)
            r3.setVisibility(r12)
            r3 = 2131230855(0x7f080087, float:1.8077775E38)
            android.view.View r3 = r0.findViewById(r3)
            r3.setVisibility(r6)
            android.widget.Spinner r3 = r0.f19637ab
            int r3 = r3.getSelectedItemPosition()
            if (r3 <= 0) goto L_0x0d3c
            android.view.View r3 = r0.findViewById(r8)
            r3.setVisibility(r12)
            r3 = 2131230858(0x7f08008a, float:1.807778E38)
            android.view.View r3 = r0.findViewById(r3)
            r3.setVisibility(r12)
            android.view.View r3 = r0.findViewById(r7)
            r3.setVisibility(r6)
        L_0x0d3c:
            mega.boicot.config r3 = r0.f19635a
            java.io.File r3 = r3.mo20757a(r0, r2)
            boolean r3 = r3.exists()
            if (r3 != 0) goto L_0x0d53
            r3 = 2131231507(0x7f080313, float:1.8079097E38)
            android.view.View r3 = r0.findViewById(r3)
            r3.setVisibility(r12)
            goto L_0x0d71
        L_0x0d53:
            r3 = 2131230991(0x7f08010f, float:1.807805E38)
            android.view.View r3 = r0.findViewById(r3)
            r3.setVisibility(r12)
            r3 = 2131230921(0x7f0800c9, float:1.8077908E38)
            android.view.View r3 = r0.findViewById(r3)
            r3.setVisibility(r12)
            r3 = 2131230826(0x7f08006a, float:1.8077716E38)
            android.view.View r3 = r0.findViewById(r3)
            r3.setVisibility(r12)
        L_0x0d71:
            java.lang.String r3 = "0"
            r0.f19625Q = r3
            if (r1 == 0) goto L_0x0d87
            java.lang.String r3 = "foto1_modif_saved"
            boolean r3 = r1.containsKey(r3)
            if (r3 == 0) goto L_0x0d87
            java.lang.String r3 = "foto1_modif_saved"
            java.lang.String r1 = r1.getString(r3)
            r0.f19625Q = r1
        L_0x0d87:
            mega.boicot.config r1 = r0.f19635a
            r3 = 2
            java.io.File r1 = r1.mo20757a(r0, r3)
            boolean r1 = r1.exists()
            if (r1 == 0) goto L_0x0d9f
            r0.m24385a(r3, r2)
            boolean r1 = r0.f19642d
            if (r1 == 0) goto L_0x0d9f
            java.lang.String r1 = "1"
            r0.f19625Q = r1
        L_0x0d9f:
            int r1 = r18.m24391k()
            r0.f19610B = r1
            android.os.Bundle r1 = r0.f19662x
            java.lang.String r2 = "nocompletar"
            r3 = 0
            boolean r1 = r1.getBoolean(r2, r3)
            if (r1 != 0) goto L_0x0e04
            mega.boicot.config r1 = r0.f19635a
            int r1 = r1.f18062ed
            r2 = 2
            if (r1 != r2) goto L_0x0dbb
            boolean r1 = r0.f19642d
            if (r1 != 0) goto L_0x0e04
        L_0x0dbb:
            android.app.AlertDialog$Builder r1 = new android.app.AlertDialog$Builder
            r1.<init>(r0)
            r2 = 0
            android.app.AlertDialog$Builder r1 = r1.setCancelable(r2)
            r2 = 2131558439(0x7f0d0027, float:1.8742194E38)
            java.lang.String r2 = r0.getString(r2)
            mega.boicot.chat_perfil$26 r3 = new mega.boicot.chat_perfil$26
            r3.<init>()
            android.app.AlertDialog$Builder r1 = r1.setPositiveButton(r2, r3)
            r2 = 2131558529(0x7f0d0081, float:1.8742376E38)
            android.app.AlertDialog$Builder r1 = r1.setMessage(r2)
            android.app.AlertDialog r1 = r1.create()
            java.lang.String r2 = r0.f19626R
            java.lang.String r3 = ""
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x0df2
            mega.boicot.chat_perfil$27 r2 = new mega.boicot.chat_perfil$27
            r2.<init>(r1)
            r1.setOnShowListener(r2)
        L_0x0df2:
            r1.show()
            r2 = 16908299(0x102000b, float:2.387726E-38)
            android.view.View r1 = r1.findViewById(r2)     // Catch:{ Exception -> 0x0e0f }
            android.widget.TextView r1 = (android.widget.TextView) r1     // Catch:{ Exception -> 0x0e0f }
            android.graphics.Typeface r2 = android.graphics.Typeface.MONOSPACE     // Catch:{ Exception -> 0x0e0f }
            r1.setTypeface(r2)     // Catch:{ Exception -> 0x0e0f }
            goto L_0x0e0f
        L_0x0e04:
            android.view.Window r1 = r18.getWindow()
            r2 = 2
            r1.setSoftInputMode(r2)
            r18.mo21629f()
        L_0x0e0f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: mega.boicot.chat_perfil.onCreate(android.os.Bundle):void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo21629f() {
        if (this.f19639ad.contains("pp_aceptada")) {
            mo21630g();
        } else if (this.f19646h) {
            new C5973b(true).execute(new String[0]);
        } else {
            mo21630g();
        }
    }

    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r3v1, types: [boolean] */
    /* JADX WARNING: type inference failed for: r3v2 */
    /* JADX WARNING: type inference failed for: r3v3, types: [int] */
    /* JADX WARNING: type inference failed for: r3v4, types: [int] */
    /* JADX WARNING: type inference failed for: r3v5 */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r3v0
      assigns: [?[int, float, boolean, short, byte, char, OBJECT, ARRAY], int]
      uses: [boolean, ?[int, byte, short, char], ?[int, short, byte, char], int]
      mth insns count: 46
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
    /* JADX WARNING: Unknown variable types count: 2 */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo21630g() {
        /*
            r6 = this;
            boolean r0 = mega.boicot.config.m23868u(r6)
            boolean r1 = mega.boicot.config.m23853d()
            r2 = 2
            java.lang.String[] r2 = new java.lang.String[r2]
            r3 = 0
            r4 = 1
            if (r0 == 0) goto L_0x001d
            java.lang.String r0 = "android.permission.ACCESS_FINE_LOCATION"
            int r0 = android.support.p017v4.content.C0356c.m1318b(r6, r0)
            if (r0 == 0) goto L_0x001d
            java.lang.String r0 = "android.permission.ACCESS_FINE_LOCATION"
            r2[r3] = r0
            r0 = r4
            goto L_0x001e
        L_0x001d:
            r0 = r3
        L_0x001e:
            if (r1 == 0) goto L_0x002e
            java.lang.String r1 = "android.permission.WRITE_EXTERNAL_STORAGE"
            int r1 = android.support.p017v4.content.C0356c.m1318b(r6, r1)
            if (r1 == 0) goto L_0x002e
            java.lang.String r1 = "android.permission.WRITE_EXTERNAL_STORAGE"
            r2[r0] = r1
            int r0 = r0 + 1
        L_0x002e:
            if (r0 <= 0) goto L_0x0040
            java.lang.String[] r1 = new java.lang.String[r0]
        L_0x0032:
            if (r3 >= r0) goto L_0x003b
            r4 = r2[r3]
            r1[r3] = r4
            int r3 = r3 + 1
            goto L_0x0032
        L_0x003b:
            r0 = 3
            android.support.p017v4.app.C0236a.m717a(r6, r1, r0)
            goto L_0x0065
        L_0x0040:
            mega.boicot.config r0 = r6.f19635a
            android.os.Bundle r1 = r6.f19662x
            if (r1 == 0) goto L_0x0052
            android.os.Bundle r1 = r6.f19662x
            java.lang.String r2 = "ad_entrar"
            boolean r1 = r1.containsKey(r2)
            if (r1 == 0) goto L_0x0052
            r1 = r4
            goto L_0x0053
        L_0x0052:
            r1 = r3
        L_0x0053:
            android.os.Bundle r2 = r6.f19662x
            if (r2 == 0) goto L_0x0062
            android.os.Bundle r2 = r6.f19662x
            java.lang.String r5 = "fb_entrar"
            boolean r2 = r2.containsKey(r5)
            if (r2 == 0) goto L_0x0062
            r3 = r4
        L_0x0062:
            r0.mo20770a(r6, r1, r3)
        L_0x0065:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: mega.boicot.chat_perfil.mo21630g():void");
    }

    /* renamed from: k */
    private int m24391k() {
        return this.f19635a.mo20757a((Context) this, 2).exists() ? 1 : 0;
    }

    /* renamed from: l */
    private void m24392l() {
        this.f19625Q = "1";
        final AlertDialog create = new Builder(this).setCancelable(true).setPositiveButton(getString(R.string.tomardecamara), new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                chat_perfil.this.f19663y = Long.valueOf(System.currentTimeMillis());
                Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
                Uri a = FileProvider.m1223a(chat_perfil.this, "mega.boicot.fileprovider", chat_perfil.this.f19635a.mo20757a((Context) chat_perfil.this, 2));
                intent.putExtra("output", a);
                intent.addFlags(1);
                intent.addFlags(2);
                if (VERSION.SDK_INT < 21) {
                    for (ResolveInfo resolveInfo : chat_perfil.this.getPackageManager().queryIntentActivities(intent, C2793C.DEFAULT_BUFFER_SEGMENT_SIZE)) {
                        chat_perfil.this.grantUriPermission(resolveInfo.activityInfo.packageName, a, 3);
                    }
                }
                try {
                    chat_perfil.this.startActivityForResult(intent, 1);
                } catch (ActivityNotFoundException unused) {
                }
            }
        }).setNegativeButton(getString(R.string.tomardesd), new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                Intent intent = new Intent("android.intent.action.PICK");
                intent.setType("image/*");
                chat_perfil.this.startActivityForResult(intent, 2);
            }
        }).setMessage(R.string.tomarfoto).create();
        if (!this.f19626R.equals("")) {
            create.setOnShowListener(new OnShowListener() {
                public void onShow(DialogInterface dialogInterface) {
                    Button button = create.getButton(-1);
                    StringBuilder sb = new StringBuilder();
                    sb.append("#");
                    sb.append(chat_perfil.this.f19626R);
                    button.setTextColor(Color.parseColor(sb.toString()));
                    Button button2 = create.getButton(-2);
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("#");
                    sb2.append(chat_perfil.this.f19626R);
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

    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00c4, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:?, code lost:
        r2.printStackTrace();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x011d, code lost:
        r8 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x011e, code lost:
        r5 = r8;
        r8 = null;
        r7 = r5;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:57:0x0117 */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x011d A[ExcHandler: all (r8v26 'th' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:42:0x00a3] */
    /* JADX WARNING: Removed duplicated region for block: B:74:? A[ExcHandler: Exception (unused java.lang.Exception), SYNTHETIC, Splitter:B:68:0x0127] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onRequestPermissionsResult(int r7, java.lang.String[] r8, int[] r9) {
        /*
            r6 = this;
            r0 = 3
            if (r7 == r0) goto L_0x0004
            return
        L_0x0004:
            boolean r7 = mega.boicot.config.m23868u(r6)
            r0 = 0
            r1 = 1
            if (r7 == 0) goto L_0x001d
            int r2 = r9.length
            if (r2 <= 0) goto L_0x001d
            r2 = r8[r0]
            java.lang.String r3 = "android.permission.ACCESS_FINE_LOCATION"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x001d
            r2 = r9[r0]
            if (r2 == 0) goto L_0x0030
        L_0x001d:
            if (r7 == 0) goto L_0x004a
            int r7 = r9.length
            if (r7 <= r1) goto L_0x004a
            r7 = r8[r1]
            java.lang.String r2 = "android.permission.ACCESS_FINE_LOCATION"
            boolean r7 = r7.equals(r2)
            if (r7 == 0) goto L_0x004a
            r7 = r9[r1]
            if (r7 != 0) goto L_0x004a
        L_0x0030:
            android.content.pm.PackageManager r7 = r6.getPackageManager()
            java.lang.String r2 = "android.permission.ACCESS_FINE_LOCATION"
            java.lang.String r3 = r6.getPackageName()
            int r7 = r7.checkPermission(r2, r3)
            if (r7 != 0) goto L_0x004a
            android.content.Intent r7 = new android.content.Intent
            java.lang.Class<mega.boicot.s_obtenerpos> r2 = mega.boicot.s_obtenerpos.class
            r7.<init>(r6, r2)
            r6.startService(r7)
        L_0x004a:
            boolean r7 = mega.boicot.config.m23853d()
            if (r7 == 0) goto L_0x0061
            int r7 = r9.length
            if (r7 <= 0) goto L_0x0061
            r7 = r8[r0]
            java.lang.String r2 = "android.permission.WRITE_EXTERNAL_STORAGE"
            boolean r7 = r7.equals(r2)
            if (r7 == 0) goto L_0x0061
            r7 = r9[r0]
            if (r7 == 0) goto L_0x0078
        L_0x0061:
            boolean r7 = mega.boicot.config.m23853d()
            if (r7 == 0) goto L_0x016d
            int r7 = r9.length
            if (r7 <= r1) goto L_0x016d
            r7 = r8[r1]
            java.lang.String r8 = "android.permission.WRITE_EXTERNAL_STORAGE"
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L_0x016d
            r7 = r9[r1]
            if (r7 != 0) goto L_0x016d
        L_0x0078:
            android.content.pm.PackageManager r7 = r6.getPackageManager()
            java.lang.String r8 = "android.permission.WRITE_EXTERNAL_STORAGE"
            java.lang.String r2 = r6.getPackageName()
            int r7 = r7.checkPermission(r8, r2)
            if (r7 != 0) goto L_0x016d
            java.io.File r7 = new java.io.File
            java.io.File r8 = android.os.Environment.getExternalStorageDirectory()
            java.lang.String r2 = r6.getPackageName()
            r7.<init>(r8, r2)
            java.io.File r8 = new java.io.File
            java.lang.String r2 = "vinebre_ac.txt"
            r8.<init>(r7, r2)
            boolean r7 = r8.exists()
            if (r7 != 0) goto L_0x0127
            r7 = 0
            java.io.File r8 = new java.io.File     // Catch:{ Exception -> 0x0125, all -> 0x011d }
            java.io.File r2 = android.os.Environment.getExternalStorageDirectory()     // Catch:{ Exception -> 0x0125, all -> 0x011d }
            java.lang.String r3 = r6.getPackageName()     // Catch:{ Exception -> 0x0125, all -> 0x011d }
            r8.<init>(r2, r3)     // Catch:{ Exception -> 0x0125, all -> 0x011d }
            boolean r2 = r8.exists()     // Catch:{ Exception -> 0x0125, all -> 0x011d }
            if (r2 != 0) goto L_0x00c8
            r8.mkdir()     // Catch:{ Exception -> 0x0125, all -> 0x011d }
            java.io.File r2 = new java.io.File     // Catch:{ Exception -> 0x0125, all -> 0x011d }
            java.lang.String r3 = ".nomedia"
            r2.<init>(r8, r3)     // Catch:{ Exception -> 0x0125, all -> 0x011d }
            r2.createNewFile()     // Catch:{ Exception -> 0x00c4, all -> 0x011d }
            goto L_0x00c8
        L_0x00c4:
            r2 = move-exception
            r2.printStackTrace()     // Catch:{ Exception -> 0x0125, all -> 0x011d }
        L_0x00c8:
            java.io.File r2 = new java.io.File     // Catch:{ Exception -> 0x0125, all -> 0x011d }
            java.lang.String r3 = "vinebre_ac.txt"
            r2.<init>(r8, r3)     // Catch:{ Exception -> 0x0125, all -> 0x011d }
            java.io.FileOutputStream r8 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x0125, all -> 0x011d }
            r8.<init>(r2)     // Catch:{ Exception -> 0x0125, all -> 0x011d }
            java.io.BufferedWriter r7 = new java.io.BufferedWriter     // Catch:{ Exception -> 0x0117, all -> 0x011b }
            java.io.OutputStreamWriter r2 = new java.io.OutputStreamWriter     // Catch:{ Exception -> 0x0117, all -> 0x011b }
            r2.<init>(r8)     // Catch:{ Exception -> 0x0117, all -> 0x011b }
            r7.<init>(r2)     // Catch:{ Exception -> 0x0117, all -> 0x011b }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0117, all -> 0x011b }
            r2.<init>()     // Catch:{ Exception -> 0x0117, all -> 0x011b }
            int r3 = r6.f19620L     // Catch:{ Exception -> 0x0117, all -> 0x011b }
            r2.append(r3)     // Catch:{ Exception -> 0x0117, all -> 0x011b }
            java.lang.String r3 = ""
            r2.append(r3)     // Catch:{ Exception -> 0x0117, all -> 0x011b }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x0117, all -> 0x011b }
            java.lang.String r3 = r6.f19630V     // Catch:{ Exception -> 0x0117, all -> 0x011b }
            java.lang.String r4 = ""
            boolean r3 = r3.equals(r4)     // Catch:{ Exception -> 0x0117, all -> 0x011b }
            if (r3 != 0) goto L_0x0111
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0117, all -> 0x011b }
            r3.<init>()     // Catch:{ Exception -> 0x0117, all -> 0x011b }
            r3.append(r2)     // Catch:{ Exception -> 0x0117, all -> 0x011b }
            java.lang.String r2 = "@"
            r3.append(r2)     // Catch:{ Exception -> 0x0117, all -> 0x011b }
            java.lang.String r2 = r6.f19630V     // Catch:{ Exception -> 0x0117, all -> 0x011b }
            r3.append(r2)     // Catch:{ Exception -> 0x0117, all -> 0x011b }
            java.lang.String r2 = r3.toString()     // Catch:{ Exception -> 0x0117, all -> 0x011b }
        L_0x0111:
            r7.write(r2)     // Catch:{ Exception -> 0x0117, all -> 0x011b }
            r7.close()     // Catch:{ Exception -> 0x0117, all -> 0x011b }
        L_0x0117:
            r8.close()     // Catch:{  }
            goto L_0x016d
        L_0x011b:
            r7 = move-exception
            goto L_0x0121
        L_0x011d:
            r8 = move-exception
            r5 = r8
            r8 = r7
            r7 = r5
        L_0x0121:
            r8.close()     // Catch:{ Exception -> 0x0124 }
        L_0x0124:
            throw r7
        L_0x0125:
            r8 = r7
            goto L_0x0117
        L_0x0127:
            java.io.FileInputStream r7 = new java.io.FileInputStream     // Catch:{ Exception -> 0x016d, Exception -> 0x016d }
            r7.<init>(r8)     // Catch:{ Exception -> 0x016d, Exception -> 0x016d }
            java.io.BufferedReader r8 = new java.io.BufferedReader     // Catch:{ Exception -> 0x016d, Exception -> 0x016d }
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x016d, Exception -> 0x016d }
            r2.<init>(r7)     // Catch:{ Exception -> 0x016d, Exception -> 0x016d }
            r8.<init>(r2)     // Catch:{ Exception -> 0x016d, Exception -> 0x016d }
            java.lang.String r8 = r8.readLine()     // Catch:{ Exception -> 0x016d, Exception -> 0x016d }
            r7.close()     // Catch:{ Exception -> 0x016d, Exception -> 0x016d }
            java.lang.String r7 = "@"
            java.lang.String[] r7 = r8.split(r7)     // Catch:{ Exception -> 0x016d, Exception -> 0x016d }
            r8 = r7[r0]     // Catch:{ Exception -> 0x016d, Exception -> 0x016d }
            int r8 = java.lang.Integer.parseInt(r8)     // Catch:{ Exception -> 0x016d, Exception -> 0x016d }
            r6.f19620L = r8     // Catch:{ Exception -> 0x016d, Exception -> 0x016d }
            java.lang.String r8 = ""
            r6.f19630V = r8     // Catch:{ Exception -> 0x016d, Exception -> 0x016d }
            int r8 = r7.length     // Catch:{ Exception -> 0x016d, Exception -> 0x016d }
            if (r8 <= r1) goto L_0x0156
            r7 = r7[r1]     // Catch:{ Exception -> 0x016d, Exception -> 0x016d }
            r6.f19630V = r7     // Catch:{ Exception -> 0x016d, Exception -> 0x016d }
        L_0x0156:
            android.content.SharedPreferences r7 = r6.f19639ad     // Catch:{ Exception -> 0x016d, Exception -> 0x016d }
            android.content.SharedPreferences$Editor r7 = r7.edit()     // Catch:{ Exception -> 0x016d, Exception -> 0x016d }
            java.lang.String r8 = "idusu"
            int r2 = r6.f19620L     // Catch:{ Exception -> 0x016d, Exception -> 0x016d }
            r7.putInt(r8, r2)     // Catch:{ Exception -> 0x016d, Exception -> 0x016d }
            java.lang.String r8 = "cod_g"
            java.lang.String r2 = r6.f19630V     // Catch:{ Exception -> 0x016d, Exception -> 0x016d }
            r7.putString(r8, r2)     // Catch:{ Exception -> 0x016d, Exception -> 0x016d }
            r7.commit()     // Catch:{ Exception -> 0x016d, Exception -> 0x016d }
        L_0x016d:
            int r7 = r9.length
            if (r7 == 0) goto L_0x017f
            r7 = -1
            int r8 = r9.length
            if (r8 <= 0) goto L_0x0178
            r8 = r9[r0]
            if (r8 == r7) goto L_0x017f
        L_0x0178:
            int r8 = r9.length
            if (r8 <= r1) goto L_0x01c6
            r8 = r9[r1]
            if (r8 != r7) goto L_0x01c6
        L_0x017f:
            android.app.AlertDialog$Builder r7 = new android.app.AlertDialog$Builder
            r7.<init>(r6)
            android.app.AlertDialog$Builder r7 = r7.setCancelable(r0)
            r8 = 2131558439(0x7f0d0027, float:1.8742194E38)
            java.lang.String r8 = r6.getString(r8)
            mega.boicot.chat_perfil$3 r9 = new mega.boicot.chat_perfil$3
            r9.<init>()
            android.app.AlertDialog$Builder r7 = r7.setPositiveButton(r8, r9)
            r8 = 2131558687(0x7f0d011f, float:1.8742697E38)
            android.app.AlertDialog$Builder r7 = r7.setMessage(r8)
            android.app.AlertDialog r7 = r7.create()
            java.lang.String r8 = r6.f19626R
            java.lang.String r9 = ""
            boolean r8 = r8.equals(r9)
            if (r8 != 0) goto L_0x01b5
            mega.boicot.chat_perfil$4 r8 = new mega.boicot.chat_perfil$4
            r8.<init>(r7)
            r7.setOnShowListener(r8)
        L_0x01b5:
            r7.show()
            r8 = 16908299(0x102000b, float:2.387726E-38)
            android.view.View r7 = r7.findViewById(r8)     // Catch:{ Exception -> 0x01c6 }
            android.widget.TextView r7 = (android.widget.TextView) r7     // Catch:{ Exception -> 0x01c6 }
            android.graphics.Typeface r8 = android.graphics.Typeface.MONOSPACE     // Catch:{ Exception -> 0x01c6 }
            r7.setTypeface(r8)     // Catch:{ Exception -> 0x01c6 }
        L_0x01c6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: mega.boicot.chat_perfil.onRequestPermissionsResult(int, java.lang.String[], int[]):void");
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Can't wrap try/catch for region: R(9:76|77|(1:81)|82|83|84|85|86|108) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:85:0x021e */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00d8 A[SYNTHETIC, Splitter:B:34:0x00d8] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0118 A[Catch:{ Exception -> 0x0152 }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0133 A[Catch:{ Exception -> 0x0152 }] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0159  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onActivityResult(int r22, int r23, android.content.Intent r24) {
        /*
            r21 = this;
            r9 = r21
            r1 = r22
            r2 = r23
            r3 = r24
            r4 = 64206(0xface, float:8.9972E-41)
            if (r1 != r4) goto L_0x0014
            com.facebook.e r4 = r9.f19664z
            r4.mo8887a(r1, r2, r3)
            goto L_0x0255
        L_0x0014:
            r4 = 104(0x68, float:1.46E-43)
            r10 = 0
            if (r1 != r4) goto L_0x005d
            com.google.android.gms.d.g r1 = com.google.android.gms.auth.api.signin.C3197a.m11498a(r24)
            java.lang.Class<com.google.android.gms.common.api.b> r2 = com.google.android.gms.common.api.C3260b.class
            java.lang.Object r1 = r1.mo13713a(r2)     // Catch:{  }
            com.google.android.gms.auth.api.signin.GoogleSignInAccount r1 = (com.google.android.gms.auth.api.signin.GoogleSignInAccount) r1     // Catch:{  }
            java.lang.String r2 = ""
            java.lang.String r3 = ""
            android.net.Uri r4 = r1.mo12955h()     // Catch:{  }
            if (r4 == 0) goto L_0x0037
            android.net.Uri r2 = r1.mo12955h()     // Catch:{  }
            java.lang.String r2 = r2.toString()     // Catch:{  }
        L_0x0037:
            r8 = r2
            java.lang.String r2 = r1.mo12948b()     // Catch:{  }
            if (r2 == 0) goto L_0x0043
            java.lang.String r2 = r1.mo12948b()     // Catch:{  }
            r3 = r2
        L_0x0043:
            mega.boicot.chat_perfil$c r11 = new mega.boicot.chat_perfil$c     // Catch:{  }
            java.lang.String r4 = ""
            java.lang.String r5 = r1.mo12947a()     // Catch:{  }
            java.lang.String r6 = r1.mo12951e()     // Catch:{  }
            java.lang.String r7 = "0"
            r1 = r11
            r2 = r9
            r1.<init>(r3, r4, r5, r6, r7, r8)     // Catch:{  }
            java.lang.String[] r1 = new java.lang.String[r10]     // Catch:{  }
            r11.execute(r1)     // Catch:{  }
            goto L_0x0255
        L_0x005d:
            r4 = -1
            if (r2 != r4) goto L_0x0255
            r5 = 1
            r6 = 2
            if (r1 != r5) goto L_0x01bb
            java.io.File r1 = new java.io.File     // Catch:{ Exception -> 0x00d0 }
            mega.boicot.config r3 = r9.f19635a     // Catch:{ Exception -> 0x00d0 }
            java.io.File r3 = r3.mo20757a(r9, r6)     // Catch:{ Exception -> 0x00d0 }
            java.lang.String r3 = r3.getAbsolutePath()     // Catch:{ Exception -> 0x00d0 }
            r1.<init>(r3)     // Catch:{ Exception -> 0x00d0 }
            long r7 = r1.length()     // Catch:{ Exception -> 0x00d0 }
            android.content.Context r1 = r21.getApplicationContext()     // Catch:{ Exception -> 0x00d0 }
            android.content.ContentResolver r11 = r1.getContentResolver()     // Catch:{ Exception -> 0x00d0 }
            android.net.Uri r12 = android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI     // Catch:{ Exception -> 0x00d0 }
            java.lang.String[] r13 = new java.lang.String[r6]     // Catch:{ Exception -> 0x00d0 }
            java.lang.String r1 = "orientation"
            r13[r10] = r1     // Catch:{ Exception -> 0x00d0 }
            java.lang.String r1 = "_size"
            r13[r5] = r1     // Catch:{ Exception -> 0x00d0 }
            java.lang.String r14 = "date_added>=?"
            java.lang.String[] r15 = new java.lang.String[r5]     // Catch:{ Exception -> 0x00d0 }
            java.lang.Long r1 = r9.f19663y     // Catch:{ Exception -> 0x00d0 }
            long r16 = r1.longValue()     // Catch:{ Exception -> 0x00d0 }
            r18 = 1000(0x3e8, double:4.94E-321)
            long r16 = r16 / r18
            r18 = 1
            long r2 = r16 - r18
            java.lang.String r1 = java.lang.String.valueOf(r2)     // Catch:{ Exception -> 0x00d0 }
            r15[r10] = r1     // Catch:{ Exception -> 0x00d0 }
            java.lang.String r16 = "date_added desc"
            android.database.Cursor r1 = r11.query(r12, r13, r14, r15, r16)     // Catch:{ Exception -> 0x00d0 }
            if (r1 == 0) goto L_0x00d5
            java.lang.Long r2 = r9.f19663y     // Catch:{ Exception -> 0x00d0 }
            long r2 = r2.longValue()     // Catch:{ Exception -> 0x00d0 }
            r11 = 0
            int r13 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r13 == 0) goto L_0x00d5
            int r2 = r1.getCount()     // Catch:{ Exception -> 0x00d0 }
            if (r2 == 0) goto L_0x00d5
        L_0x00bd:
            boolean r2 = r1.moveToNext()     // Catch:{ Exception -> 0x00d0 }
            if (r2 == 0) goto L_0x00d5
            long r2 = r1.getLong(r5)     // Catch:{ Exception -> 0x00d0 }
            int r11 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r11 != 0) goto L_0x00bd
            int r1 = r1.getInt(r10)     // Catch:{ Exception -> 0x00d0 }
            goto L_0x00d6
        L_0x00d0:
            r0 = move-exception
            r1 = r0
            r1.printStackTrace()
        L_0x00d5:
            r1 = r4
        L_0x00d6:
            if (r1 != r4) goto L_0x00f4
            android.media.ExifInterface r2 = new android.media.ExifInterface     // Catch:{ IOException -> 0x00ef }
            mega.boicot.config r3 = r9.f19635a     // Catch:{ IOException -> 0x00ef }
            java.io.File r3 = r3.mo20757a(r9, r6)     // Catch:{ IOException -> 0x00ef }
            java.lang.String r3 = r3.getAbsolutePath()     // Catch:{ IOException -> 0x00ef }
            r2.<init>(r3)     // Catch:{ IOException -> 0x00ef }
            java.lang.String r3 = "Orientation"
            int r2 = r2.getAttributeInt(r3, r4)     // Catch:{ IOException -> 0x00ef }
            r1 = r2
            goto L_0x00f4
        L_0x00ef:
            r0 = move-exception
            r2 = r0
            r2.printStackTrace()
        L_0x00f4:
            mega.boicot.config r2 = r9.f19635a     // Catch:{ Exception -> 0x0152 }
            java.io.File r2 = r2.mo20757a(r9, r6)     // Catch:{ Exception -> 0x0152 }
            android.graphics.BitmapFactory$Options r3 = new android.graphics.BitmapFactory$Options     // Catch:{ Exception -> 0x0152 }
            r3.<init>()     // Catch:{ Exception -> 0x0152 }
            r3.inJustDecodeBounds = r5     // Catch:{ Exception -> 0x0152 }
            java.lang.String r7 = r2.getPath()     // Catch:{ Exception -> 0x0152 }
            android.graphics.BitmapFactory.decodeFile(r7, r3)     // Catch:{ Exception -> 0x0152 }
            int r7 = r3.outWidth     // Catch:{ Exception -> 0x0152 }
            int r7 = r3.outWidth     // Catch:{ Exception -> 0x0152 }
            int r3 = r3.outHeight     // Catch:{ Exception -> 0x0152 }
            r8 = 600(0x258, float:8.41E-43)
            if (r7 > r8) goto L_0x0115
            if (r3 > r8) goto L_0x0115
            goto L_0x0116
        L_0x0115:
            r5 = r10
        L_0x0116:
            if (r5 != 0) goto L_0x0133
            int r3 = mega.boicot.config.m23824a(r7, r3, r8, r8)     // Catch:{ Exception -> 0x0152 }
            float r5 = (float) r7     // Catch:{ Exception -> 0x0152 }
            float r3 = (float) r3     // Catch:{ Exception -> 0x0152 }
            float r5 = r5 / r3
            int r3 = java.lang.Math.round(r5)     // Catch:{ Exception -> 0x0152 }
            android.graphics.BitmapFactory$Options r5 = new android.graphics.BitmapFactory$Options     // Catch:{ Exception -> 0x0152 }
            r5.<init>()     // Catch:{ Exception -> 0x0152 }
            r5.inSampleSize = r3     // Catch:{ Exception -> 0x0152 }
            java.lang.String r2 = r2.getPath()     // Catch:{ Exception -> 0x0152 }
            android.graphics.Bitmap r2 = android.graphics.BitmapFactory.decodeFile(r2, r5)     // Catch:{ Exception -> 0x0152 }
            goto L_0x013f
        L_0x0133:
            android.content.ContentResolver r3 = r21.getContentResolver()     // Catch:{ Exception -> 0x0152 }
            android.net.Uri r2 = android.net.Uri.fromFile(r2)     // Catch:{ Exception -> 0x0152 }
            android.graphics.Bitmap r2 = android.provider.MediaStore.Images.Media.getBitmap(r3, r2)     // Catch:{ Exception -> 0x0152 }
        L_0x013f:
            mega.boicot.config r3 = r9.f19635a     // Catch:{ Exception -> 0x0152 }
            java.io.File r3 = r3.mo20757a(r9, r6)     // Catch:{ Exception -> 0x0152 }
            java.io.FileOutputStream r5 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x0157 }
            r5.<init>(r3)     // Catch:{ Exception -> 0x0157 }
            android.graphics.Bitmap$CompressFormat r3 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ Exception -> 0x0157 }
            r7 = 100
            r2.compress(r3, r7, r5)     // Catch:{ Exception -> 0x0157 }
            goto L_0x0157
        L_0x0152:
            r0 = move-exception
            r2 = r0
            r2.printStackTrace()
        L_0x0157:
            if (r1 == r4) goto L_0x01b0
            android.graphics.Matrix r2 = new android.graphics.Matrix
            r2.<init>()
            r3 = 3
            if (r1 != r3) goto L_0x0164
            r1 = 180(0xb4, float:2.52E-43)
            goto L_0x0172
        L_0x0164:
            r3 = 8
            if (r1 != r3) goto L_0x016b
            r1 = 270(0x10e, float:3.78E-43)
            goto L_0x0172
        L_0x016b:
            r3 = 6
            if (r1 != r3) goto L_0x0171
            r1 = 90
            goto L_0x0172
        L_0x0171:
            r1 = r10
        L_0x0172:
            if (r1 <= 0) goto L_0x01b0
            mega.boicot.config r3 = r9.f19635a     // Catch:{ Exception -> 0x01ab }
            java.io.File r3 = r3.mo20757a(r9, r6)     // Catch:{ Exception -> 0x01ab }
            java.lang.String r3 = r3.getAbsolutePath()     // Catch:{ Exception -> 0x01ab }
            android.graphics.Bitmap r11 = android.graphics.BitmapFactory.decodeFile(r3)     // Catch:{ Exception -> 0x01ab }
            float r1 = (float) r1     // Catch:{ Exception -> 0x01ab }
            r2.postRotate(r1)     // Catch:{ Exception -> 0x01ab }
            r12 = 0
            r13 = 0
            int r14 = r11.getWidth()     // Catch:{ Exception -> 0x01ab }
            int r15 = r11.getHeight()     // Catch:{ Exception -> 0x01ab }
            r17 = 1
            r16 = r2
            android.graphics.Bitmap r1 = android.graphics.Bitmap.createBitmap(r11, r12, r13, r14, r15, r16, r17)     // Catch:{ Exception -> 0x01ab }
            mega.boicot.config r2 = r9.f19635a     // Catch:{ Exception -> 0x01ab }
            java.io.File r2 = r2.mo20757a(r9, r6)     // Catch:{ Exception -> 0x01ab }
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x01b0 }
            r3.<init>(r2)     // Catch:{ Exception -> 0x01b0 }
            android.graphics.Bitmap$CompressFormat r2 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ Exception -> 0x01b0 }
            r4 = 100
            r1.compress(r2, r4, r3)     // Catch:{ Exception -> 0x01b0 }
            goto L_0x01b0
        L_0x01ab:
            r0 = move-exception
            r1 = r0
            r1.printStackTrace()
        L_0x01b0:
            r9.m24385a(r6, r10)
            int r1 = r21.m24391k()
            r9.f19610B = r1
            goto L_0x0255
        L_0x01bb:
            if (r1 != r6) goto L_0x022b
            android.net.Uri r1 = r24.getData()
            java.lang.String[] r2 = new java.lang.String[r5]     // Catch:{ b -> 0x0255 }
            java.lang.String r3 = "orientation"
            r2[r10] = r3     // Catch:{ b -> 0x0255 }
            android.content.ContentResolver r11 = r21.getContentResolver()     // Catch:{ b -> 0x0255 }
            r14 = 0
            r15 = 0
            r16 = 0
            r12 = r1
            r13 = r2
            android.database.Cursor r3 = r11.query(r12, r13, r14, r15, r16)     // Catch:{ b -> 0x0255 }
            if (r3 == 0) goto L_0x01e7
            boolean r5 = r3.moveToFirst()     // Catch:{ b -> 0x0255 }
            if (r5 == 0) goto L_0x01e7
            r2 = r2[r10]     // Catch:{ b -> 0x0255 }
            int r2 = r3.getColumnIndex(r2)     // Catch:{ b -> 0x0255 }
            int r4 = r3.getInt(r2)     // Catch:{ b -> 0x0255 }
        L_0x01e7:
            android.graphics.Matrix r2 = new android.graphics.Matrix     // Catch:{ b -> 0x0255 }
            r2.<init>()     // Catch:{ b -> 0x0255 }
            float r3 = (float) r4     // Catch:{ b -> 0x0255 }
            r2.postRotate(r3)     // Catch:{ b -> 0x0255 }
            mega.boicot.config r3 = r9.f19635a     // Catch:{ b -> 0x0255 }
            r4 = 300(0x12c, float:4.2E-43)
            r5 = 400(0x190, float:5.6E-43)
            android.graphics.Bitmap r11 = r3.mo20756a(r1, r4, r5)     // Catch:{ b -> 0x0255 }
            r12 = 0
            r13 = 0
            int r14 = r11.getWidth()     // Catch:{ b -> 0x0255 }
            int r15 = r11.getHeight()     // Catch:{ b -> 0x0255 }
            r17 = 1
            r16 = r2
            android.graphics.Bitmap r1 = android.graphics.Bitmap.createBitmap(r11, r12, r13, r14, r15, r16, r17)     // Catch:{ b -> 0x0255 }
            mega.boicot.config r2 = r9.f19635a     // Catch:{ b -> 0x0255 }
            java.io.File r2 = r2.mo20757a(r9, r6)     // Catch:{ b -> 0x0255 }
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ Exception | OutOfMemoryError -> 0x021e }
            r3.<init>(r2)     // Catch:{ Exception | OutOfMemoryError -> 0x021e }
            android.graphics.Bitmap$CompressFormat r2 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ Exception | OutOfMemoryError -> 0x021e }
            r4 = 100
            r1.compress(r2, r4, r3)     // Catch:{ Exception | OutOfMemoryError -> 0x021e }
        L_0x021e:
            r1.recycle()     // Catch:{ b -> 0x0255 }
            r9.m24385a(r6, r10)     // Catch:{ b -> 0x0255 }
            int r1 = r21.m24391k()     // Catch:{ b -> 0x0255 }
            r9.f19610B = r1     // Catch:{ b -> 0x0255 }
            goto L_0x0255
        L_0x022b:
            if (r3 == 0) goto L_0x0255
            java.lang.String r1 = "finalizar"
            boolean r1 = r3.hasExtra(r1)
            if (r1 == 0) goto L_0x0255
            android.os.Bundle r1 = r24.getExtras()
            java.lang.String r2 = "finalizar"
            boolean r1 = r1.getBoolean(r2)
            if (r1 == 0) goto L_0x0255
            android.os.Bundle r1 = r24.getExtras()
            java.lang.String r2 = "finalizar_app"
            boolean r1 = r1.getBoolean(r2)
            if (r1 != 0) goto L_0x024f
            r9.f19644f = r10
        L_0x024f:
            r9.setResult(r4, r3)
            r21.finish()
        L_0x0255:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: mega.boicot.chat_perfil.onActivityResult(int, int, android.content.Intent):void");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public void mo21631h() {
        int b = this.f19635a.mo20778b((Context) this);
        if (this.f19635a.f18045dm == 1) {
            this.f19661w = (ListView) findViewById(R.id.left_drawer);
            this.f19635a.mo20771a(this.f19661w);
        } else if (this.f19635a.f18045dm == 0) {
            int i = 0;
            for (int i2 = 0; i2 < this.f19635a.f17971bz.length; i2++) {
                if (!this.f19635a.f17971bz[i2].f18333z) {
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
        for (int i3 = 0; i3 < this.f19635a.f17923bD.length; i3++) {
            if (this.f19635a.f17923bD[i3] > 0) {
                findViewById(this.f19635a.f17923bD[i3]).setOnClickListener(this);
            }
        }
    }

    public void onClick(View view) {
        if (view.getId() == R.id.btnbaja) {
            final AlertDialog create = new Builder(this).setCancelable(true).setPositiveButton(getString(R.string.si), new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialogInterface, int i) {
                    Intent intent = new Intent(chat_perfil.this, eliminarperfil.class);
                    if (chat_perfil.this.f19643e) {
                        intent = config.m23827a(intent, chat_perfil.this.f19662x);
                    } else {
                        intent.putExtra("idsecc", chat_perfil.this.f19612D);
                    }
                    if (chat_perfil.this.f19635a.f18045dm != 2) {
                        intent.putExtra("es_root", true);
                    }
                    intent.putExtra("desde_main", chat_perfil.this.f19645g);
                    chat_perfil.this.f19644f = false;
                    chat_perfil.this.f19640b = true;
                    Intent intent2 = new Intent();
                    intent2.putExtra("finalizar", true);
                    chat_perfil.this.setResult(-1, intent2);
                    chat_perfil.this.startActivity(intent);
                    chat_perfil.this.finish();
                }
            }).setNegativeButton(getString(R.string.no), null).setMessage(R.string.confirmarbaja).create();
            if (!this.f19626R.equals("")) {
                create.setOnShowListener(new OnShowListener() {
                    public void onShow(DialogInterface dialogInterface) {
                        Button button = create.getButton(-1);
                        StringBuilder sb = new StringBuilder();
                        sb.append("#");
                        sb.append(chat_perfil.this.f19626R);
                        button.setTextColor(Color.parseColor(sb.toString()));
                        Button button2 = create.getButton(-2);
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("#");
                        sb2.append(chat_perfil.this.f19626R);
                        button2.setTextColor(Color.parseColor(sb2.toString()));
                    }
                });
            }
            create.show();
            try {
                ((TextView) create.findViewById(16908299)).setTypeface(Typeface.MONOSPACE);
            } catch (Exception unused) {
            }
        } else if (view.getId() == R.id.btnprivacidad || view.getId() == R.id.btnprivacidad_fb) {
            new C5973b(false).execute(new String[0]);
        } else if (view.getId() == R.id.btnfotos) {
            m24392l();
        } else if (view.getId() == R.id.elim1) {
            this.f19622N.setImageBitmap(null);
            this.f19622N.setVisibility(8);
            this.f19624P.setVisibility(8);
            this.f19635a.mo20757a((Context) this, 2).delete();
            this.f19610B--;
            this.f19625Q = "1";
            if (this.f19610B < 4) {
                this.f19623O.setVisibility(0);
            }
        } else if (view.getId() == R.id.contra_modif) {
            this.f19650l = mo21633j();
            this.f19650l.show();
        } else if (view.getId() == R.id.contra_recordar || view.getId() == R.id.iv_help) {
            Builder builder = new Builder(this);
            String trim = ((TextView) findViewById(R.id.c_email)).getText().toString().trim();
            if (trim.isEmpty() || !Patterns.EMAIL_ADDRESS.matcher(trim).matches()) {
                builder.setCancelable(false).setPositiveButton(getString(R.string.aceptar), null);
                builder.setMessage(R.string.falta_email);
                final AlertDialog create2 = builder.create();
                if (!this.f19626R.equals("")) {
                    create2.setOnShowListener(new OnShowListener() {
                        public void onShow(DialogInterface dialogInterface) {
                            Button button = create2.getButton(-1);
                            StringBuilder sb = new StringBuilder();
                            sb.append("#");
                            sb.append(chat_perfil.this.f19626R);
                            button.setTextColor(Color.parseColor(sb.toString()));
                        }
                    });
                }
                create2.show();
                ((TextView) create2.findViewById(16908299)).setTypeface(Typeface.MONOSPACE);
                return;
            }
            builder.setCancelable(true).setNegativeButton(getString(R.string.cancelar), null).setPositiveButton("OK", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialogInterface, int i) {
                    new C5984e().execute(new String[0]);
                }
            });
            StringBuilder sb = new StringBuilder();
            sb.append(getResources().getString(R.string.confirm_enviarcontra_a));
            sb.append(" ");
            sb.append(trim);
            builder.setMessage(sb.toString());
            final AlertDialog create3 = builder.create();
            if (!this.f19626R.equals("")) {
                create3.setOnShowListener(new OnShowListener() {
                    public void onShow(DialogInterface dialogInterface) {
                        Button button = create3.getButton(-1);
                        StringBuilder sb = new StringBuilder();
                        sb.append("#");
                        sb.append(chat_perfil.this.f19626R);
                        button.setTextColor(Color.parseColor(sb.toString()));
                        Button button2 = create3.getButton(-2);
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("#");
                        sb2.append(chat_perfil.this.f19626R);
                        button2.setTextColor(Color.parseColor(sb2.toString()));
                    }
                });
            }
            create3.show();
            ((TextView) create3.findViewById(16908299)).setTypeface(Typeface.MONOSPACE);
        } else if (view.getId() == R.id.btnenv) {
            Builder builder2 = new Builder(this);
            builder2.setCancelable(false).setPositiveButton(getString(R.string.aceptar), null);
            if (((TextView) findViewById(R.id.c_nombre)).getText().toString().trim().length() < 3) {
                builder2.setMessage(R.string.falta_nombre);
                final AlertDialog create4 = builder2.create();
                if (!this.f19626R.equals("")) {
                    create4.setOnShowListener(new OnShowListener() {
                        public void onShow(DialogInterface dialogInterface) {
                            Button button = create4.getButton(-1);
                            StringBuilder sb = new StringBuilder();
                            sb.append("#");
                            sb.append(chat_perfil.this.f19626R);
                            button.setTextColor(Color.parseColor(sb.toString()));
                        }
                    });
                }
                create4.show();
                ((TextView) create4.findViewById(16908299)).setTypeface(Typeface.MONOSPACE);
            } else if (findViewById(R.id.tr_email).getVisibility() == 0 && findViewById(R.id.c_email).getVisibility() == 0 && (((TextView) findViewById(R.id.c_email)).getText().toString().trim().isEmpty() || !Patterns.EMAIL_ADDRESS.matcher(((TextView) findViewById(R.id.c_email)).getText().toString().trim()).matches())) {
                builder2.setMessage(R.string.falta_email);
                final AlertDialog create5 = builder2.create();
                if (!this.f19626R.equals("")) {
                    create5.setOnShowListener(new OnShowListener() {
                        public void onShow(DialogInterface dialogInterface) {
                            Button button = create5.getButton(-1);
                            StringBuilder sb = new StringBuilder();
                            sb.append("#");
                            sb.append(chat_perfil.this.f19626R);
                            button.setTextColor(Color.parseColor(sb.toString()));
                        }
                    });
                }
                create5.show();
                ((TextView) create5.findViewById(16908299)).setTypeface(Typeface.MONOSPACE);
            } else if (findViewById(R.id.tr_contra).getVisibility() == 0 && findViewById(R.id.ll_c_contra).getVisibility() == 0 && findViewById(R.id.c_contra).getVisibility() == 0 && ((TextView) findViewById(R.id.c_contra)).getText().toString().trim().isEmpty()) {
                builder2.setMessage(R.string.chat_contra_necesaria);
                final AlertDialog create6 = builder2.create();
                if (!this.f19626R.equals("")) {
                    create6.setOnShowListener(new OnShowListener() {
                        public void onShow(DialogInterface dialogInterface) {
                            Button button = create6.getButton(-1);
                            StringBuilder sb = new StringBuilder();
                            sb.append("#");
                            sb.append(chat_perfil.this.f19626R);
                            button.setTextColor(Color.parseColor(sb.toString()));
                        }
                    });
                }
                create6.show();
                ((TextView) create6.findViewById(16908299)).setTypeface(Typeface.MONOSPACE);
            } else if (((TextView) findViewById(R.id.c_descr)).getText().toString().trim().length() < 3 && this.f19616H == 2) {
                builder2.setMessage(R.string.falta_descr);
                final AlertDialog create7 = builder2.create();
                if (!this.f19626R.equals("")) {
                    create7.setOnShowListener(new OnShowListener() {
                        public void onShow(DialogInterface dialogInterface) {
                            Button button = create7.getButton(-1);
                            StringBuilder sb = new StringBuilder();
                            sb.append("#");
                            sb.append(chat_perfil.this.f19626R);
                            button.setTextColor(Color.parseColor(sb.toString()));
                        }
                    });
                }
                create7.show();
                ((TextView) create7.findViewById(16908299)).setTypeface(Typeface.MONOSPACE);
            } else if ((this.f19633Y.getSelectedItemPosition() == 0 || this.f19634Z.getSelectedItemPosition() == 0 || this.f19636aa.getSelectedItemPosition() == 0) && this.f19614F == 2) {
                builder2.setMessage(R.string.falta_fnac);
                final AlertDialog create8 = builder2.create();
                if (!this.f19626R.equals("")) {
                    create8.setOnShowListener(new OnShowListener() {
                        public void onShow(DialogInterface dialogInterface) {
                            Button button = create8.getButton(-1);
                            StringBuilder sb = new StringBuilder();
                            sb.append("#");
                            sb.append(chat_perfil.this.f19626R);
                            button.setTextColor(Color.parseColor(sb.toString()));
                        }
                    });
                }
                create8.show();
                ((TextView) create8.findViewById(16908299)).setTypeface(Typeface.MONOSPACE);
            } else if (this.f19637ab.getSelectedItemPosition() == 0 && this.f19615G == 2) {
                builder2.setMessage(R.string.falta_sexo);
                final AlertDialog create9 = builder2.create();
                if (!this.f19626R.equals("")) {
                    create9.setOnShowListener(new OnShowListener() {
                        public void onShow(DialogInterface dialogInterface) {
                            Button button = create9.getButton(-1);
                            StringBuilder sb = new StringBuilder();
                            sb.append("#");
                            sb.append(chat_perfil.this.f19626R);
                            button.setTextColor(Color.parseColor(sb.toString()));
                        }
                    });
                }
                create9.show();
                ((TextView) create9.findViewById(16908299)).setTypeface(Typeface.MONOSPACE);
            } else if (this.f19610B == 0 && this.f19613E == 2) {
                builder2.setMessage(R.string.falta_fotos);
                final AlertDialog create10 = builder2.create();
                if (!this.f19626R.equals("")) {
                    create10.setOnShowListener(new OnShowListener() {
                        public void onShow(DialogInterface dialogInterface) {
                            Button button = create10.getButton(-1);
                            StringBuilder sb = new StringBuilder();
                            sb.append("#");
                            sb.append(chat_perfil.this.f19626R);
                            button.setTextColor(Color.parseColor(sb.toString()));
                        }
                    });
                }
                create10.show();
                ((TextView) create10.findViewById(16908299)).setTypeface(Typeface.MONOSPACE);
            } else {
                Editor edit = this.f19639ad.edit();
                edit.putString("nick", ((TextView) findViewById(R.id.c_nombre)).getText().toString().trim());
                edit.putString("email", ((TextView) findViewById(R.id.c_email)).getText().toString().trim());
                edit.putString("descr", ((TextView) findViewById(R.id.c_descr)).getText().toString().trim());
                edit.putInt("privados", Integer.parseInt(getResources().getStringArray(R.array.idprivados_a)[this.f19632X.getSelectedItemPosition()]));
                edit.putInt("fnac_d", this.f19633Y.getSelectedItemPosition());
                edit.putInt("fnac_m", this.f19634Z.getSelectedItemPosition());
                if (this.f19636aa.getSelectedItemPosition() == 0) {
                    edit.putInt("fnac_a", 0);
                } else {
                    edit.putInt("fnac_a", Integer.parseInt(this.f19636aa.getSelectedItem().toString()));
                }
                edit.putInt("sexo", Integer.parseInt(getResources().getStringArray(R.array.idsexo_a)[this.f19637ab.getSelectedItemPosition()]));
                edit.putInt("coments", Integer.parseInt(getResources().getStringArray(R.array.idcoments_a)[this.f19638ac.getSelectedItemPosition()]));
                edit.putInt("avisos", Integer.parseInt(getResources().getStringArray(R.array.idavisos_a)[this.f19631W.getSelectedItemPosition()]));
                try {
                    if (this.f19635a.mo20757a((Context) this, 2).exists()) {
                        config.m23840a(this.f19635a.mo20757a((Context) this, 2), this.f19635a.mo20757a((Context) this, 1));
                    } else {
                        this.f19635a.mo20757a((Context) this, 1).delete();
                    }
                } catch (Exception unused2) {
                }
                if (this.f19642d || (this.f19635a.f18062ed == 3 && !this.f19621M)) {
                    edit.putString("foto1_modif", this.f19625Q);
                    edit.commit();
                    Intent intent = new Intent(this, guardarprimeravez.class);
                    intent.putExtra("contra", ((TextView) findViewById(R.id.c_contra)).getText().toString().trim());
                    if (this.f19643e) {
                        intent = config.m23827a(intent, this.f19662x);
                    } else {
                        intent.putExtra("idsecc", this.f19612D);
                        intent.putExtra("desde_buscusus", this.f19662x.getBoolean("desde_buscusus", false));
                        intent.putExtra("desde_buscvideos", this.f19662x.getBoolean("desde_buscvideos", false));
                        intent.putExtra("desde_foro", this.f19662x.getBoolean("desde_foro", false));
                        intent.putExtra("desde_main", this.f19645g);
                    }
                    if (this.f19635a.f18045dm != 2) {
                        intent.putExtra("es_root", true);
                    }
                    this.f19644f = false;
                    this.f19640b = true;
                    Intent intent2 = new Intent();
                    intent2.putExtra("finalizar", true);
                    setResult(-1, intent2);
                    startActivity(intent);
                    finish();
                } else {
                    edit.commit();
                    Intent intent3 = new Intent(this, s_guardarperfil.class);
                    intent3.putExtra("foto1_modif", this.f19625Q);
                    startService(intent3);
                    mo21632i();
                }
                finish();
            }
        } else if (view.getId() == R.id.btnprofile) {
            if (this.f19642d) {
                final AlertDialog create11 = new Builder(this).setCancelable(false).setPositiveButton(getString(R.string.aceptar), new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialogInterface, int i) {
                    }
                }).setMessage(R.string.guardaprimero).create();
                if (!this.f19626R.equals("")) {
                    create11.setOnShowListener(new OnShowListener() {
                        public void onShow(DialogInterface dialogInterface) {
                            Button button = create11.getButton(-1);
                            StringBuilder sb = new StringBuilder();
                            sb.append("#");
                            sb.append(chat_perfil.this.f19626R);
                            button.setTextColor(Color.parseColor(sb.toString()));
                        }
                    });
                }
                create11.show();
                ((TextView) create11.findViewById(16908299)).setTypeface(Typeface.MONOSPACE);
                return;
            }
            Intent intent4 = new Intent(this, profile.class);
            String str = TtmlNode.ATTR_ID;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f19639ad.getInt("idusu", 0));
            sb2.append("");
            intent4.putExtra(str, sb2.toString());
            intent4.putExtra("privados", "0");
            intent4.putExtra("nombre", this.f19639ad.getString("nick", ""));
            StringBuilder sb3 = new StringBuilder();
            sb3.append(this.f19639ad.getInt("coments", 1));
            sb3.append("");
            intent4.putExtra("coments", sb3.toString());
            StringBuilder sb4 = new StringBuilder();
            sb4.append(this.f19639ad.getInt("fnac_d", 0));
            sb4.append("");
            intent4.putExtra("fnac_d", sb4.toString());
            StringBuilder sb5 = new StringBuilder();
            sb5.append(this.f19639ad.getInt("fnac_m", 0));
            sb5.append("");
            intent4.putExtra("fnac_m", sb5.toString());
            StringBuilder sb6 = new StringBuilder();
            sb6.append(this.f19639ad.getInt("fnac_a", 0));
            sb6.append("");
            intent4.putExtra("fnac_a", sb6.toString());
            StringBuilder sb7 = new StringBuilder();
            sb7.append(this.f19639ad.getInt("sexo", 0));
            sb7.append("");
            intent4.putExtra("sexo", sb7.toString());
            intent4.putExtra("vfoto", "99999999");
            intent4.putExtra("dist", "0");
            intent4.putExtra("p_fnac", this.f19614F);
            intent4.putExtra("p_sexo", this.f19615G);
            intent4.putExtra("p_descr", this.f19616H);
            intent4.putExtra("p_dist", 0);
            intent4.putExtra("coments_chat", this.f19617I == 1);
            intent4.putExtra("galeria", this.f19619K == 1);
            intent4.putExtra("privados_chat", this.f19618J == 1);
            intent4.putExtra("fotos_perfil", this.f19613E);
            intent4.putExtra("fotos_chat", 1);
            intent4.putExtra("desde_main", this.f19645g);
            startActivityForResult(intent4, 0);
        } else if ((this.f19635a.f17986cO == null || this.f19635a.f17986cO.equals("")) && ((this.f19635a.f17985cN == null || this.f19635a.f17985cN.equals("")) && ((this.f19635a.f17988cQ == null || this.f19635a.f17988cQ.equals("")) && (this.f19635a.f17989cR == null || this.f19635a.f17989cR.equals(""))))) {
            abrir_secc(view);
        } else {
            if (this.f19635a.f17986cO != null && !this.f19635a.f17986cO.equals("")) {
                this.f19653o = new RewardedVideo((Context) this, this.f19635a.f17986cO);
            }
            if (this.f19635a.f17985cN != null && !this.f19635a.f17985cN.equals("")) {
                this.f19652n = C2997g.m10716a(this);
            }
            if (this.f19635a.f17988cQ != null && !this.f19635a.f17988cQ.equals("")) {
                this.f19654p = new RewardedVideoAd(this, this.f19635a.f17988cQ);
            }
            if (this.f19635a.f17989cR != null && !this.f19635a.f17989cR.equals("")) {
                this.f19655q = new StartAppAd(this);
            }
            this.f19659u = new ProgressDialog(this);
            this.f19658t = view;
            if (!this.f19635a.mo20774a((Context) this, view, this.f19626R, this.f19659u, this.f19652n, this.f19653o, this.f19654p, this.f19655q)) {
                abrir_secc(view);
            }
        }
    }

    /* renamed from: a */
    private void m24385a(int i, boolean z) {
        Bitmap bitmap;
        File a = this.f19635a.mo20757a((Context) this, i);
        try {
            Options options = new Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(a.getPath(), options);
            int i2 = options.outWidth;
            int i3 = options.outWidth;
            int i4 = options.outHeight;
            if (!(i3 <= 200 && i4 <= 200)) {
                int round = Math.round(((float) i3) / ((float) config.m23824a(i3, i4, 200, 200)));
                Options options2 = new Options();
                options2.inSampleSize = round;
                bitmap = BitmapFactory.decodeFile(a.getPath(), options2);
            } else {
                bitmap = Media.getBitmap(getContentResolver(), Uri.fromFile(a));
            }
            ImageView imageView = this.f19622N;
            ImageView imageView2 = this.f19624P;
            if (!z) {
                this.f19625Q = "1";
            }
            imageView.setImageBitmap(bitmap);
            imageView.setVisibility(0);
            if ((this.f19635a.f18062ed != 1 && this.f19635a.f18062ed != 2) || !this.f19635a.f18064ef || !this.f19639ad.getBoolean("logineado_fb", false)) {
                imageView2.setVisibility(0);
            }
            imageView.setBackgroundColor(0);
        } catch (FileNotFoundException | IOException unused) {
        }
    }

    public void abrir_secc(View view) {
        C5662h a = this.f19635a.mo20761a(view, (Context) this);
        try {
            if (a.f18226a != null && a.f18226a.getComponent().getClassName().endsWith(".preperfil")) {
                return;
            }
        } catch (Exception unused) {
        }
        if (a.f18227b) {
            this.f19640b = true;
            Intent intent = new Intent();
            intent.putExtra("finalizar", true);
            intent.putExtra("finalizar_app", a.f18228c);
            setResult(-1, intent);
        }
        if (a.f18229d) {
            startActivityForResult(a.f18226a, 0);
        } else if (a.f18226a != null) {
            if (a.f18227b && this.f19635a.f18045dm != 2) {
                a.f18226a.putExtra("es_root", true);
            }
            this.f19644f = false;
            startActivity(a.f18226a);
        }
        if (this.f19640b && !this.f19657s) {
            finish();
        }
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00db, code lost:
        r8 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        r8.printStackTrace();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0104, code lost:
        r11 = th;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x0109 */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0104 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:18:0x00ba] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x012a  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0183  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo21627a(android.net.Uri r11) {
        /*
            r10 = this;
            java.lang.String r0 = "sh"
            r1 = 0
            android.content.SharedPreferences r0 = r10.getSharedPreferences(r0, r1)
            android.content.SharedPreferences$Editor r2 = r0.edit()
            java.lang.String r3 = "logineado_fb"
            r4 = 1
            r2.putBoolean(r3, r4)
            java.lang.String r3 = "gender"
            java.lang.String r3 = r11.getQueryParameter(r3)
            java.lang.String r5 = "male"
            boolean r3 = r3.equals(r5)
            r5 = 2
            if (r3 == 0) goto L_0x0022
            r3 = r4
            goto L_0x0033
        L_0x0022:
            java.lang.String r3 = "gender"
            java.lang.String r3 = r11.getQueryParameter(r3)
            java.lang.String r6 = "female"
            boolean r3 = r3.equals(r6)
            if (r3 == 0) goto L_0x0032
            r3 = r5
            goto L_0x0033
        L_0x0032:
            r3 = r1
        L_0x0033:
            java.lang.String r6 = "codigo"
            java.lang.String r6 = r11.getQueryParameter(r6)
            java.lang.String r7 = ""
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto L_0x004c
            java.lang.String r6 = "cod"
            java.lang.String r7 = "codigo"
            java.lang.String r7 = r11.getQueryParameter(r7)
            r2.putString(r6, r7)
        L_0x004c:
            java.lang.String r6 = "idusu"
            java.lang.String r6 = r11.getQueryParameter(r6)
            java.lang.String r7 = ""
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto L_0x010c
            java.lang.String r6 = "idusu"
            java.lang.String r6 = r11.getQueryParameter(r6)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "idusu"
            int r0 = r0.getInt(r8, r1)
            r7.append(r0)
            java.lang.String r0 = ""
            r7.append(r0)
            java.lang.String r0 = r7.toString()
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L_0x010c
            java.lang.String r0 = "idusu"
            java.lang.String r6 = "idusu"
            java.lang.String r6 = r11.getQueryParameter(r6)
            int r6 = java.lang.Integer.parseInt(r6)
            r2.putInt(r0, r6)
            java.lang.String r0 = "cod_g"
            java.lang.String r0 = r11.getQueryParameter(r0)
            java.lang.String r6 = "cod_g"
            r2.putString(r6, r0)
            java.lang.String r6 = "idusu"
            java.lang.String r6 = r11.getQueryParameter(r6)
            java.lang.String r7 = ""
            boolean r7 = r0.equals(r7)
            if (r7 != 0) goto L_0x00b9
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r6)
            java.lang.String r6 = "@"
            r7.append(r6)
            r7.append(r0)
            java.lang.String r6 = r7.toString()
        L_0x00b9:
            r0 = 0
            java.io.File r7 = new java.io.File     // Catch:{ Exception -> 0x0109, all -> 0x0104 }
            java.io.File r8 = android.os.Environment.getExternalStorageDirectory()     // Catch:{ Exception -> 0x0109, all -> 0x0104 }
            java.lang.String r9 = r10.getPackageName()     // Catch:{ Exception -> 0x0109, all -> 0x0104 }
            r7.<init>(r8, r9)     // Catch:{ Exception -> 0x0109, all -> 0x0104 }
            boolean r8 = r7.exists()     // Catch:{ Exception -> 0x0109, all -> 0x0104 }
            if (r8 != 0) goto L_0x00df
            r7.mkdir()     // Catch:{ Exception -> 0x0109, all -> 0x0104 }
            java.io.File r8 = new java.io.File     // Catch:{ Exception -> 0x0109, all -> 0x0104 }
            java.lang.String r9 = ".nomedia"
            r8.<init>(r7, r9)     // Catch:{ Exception -> 0x0109, all -> 0x0104 }
            r8.createNewFile()     // Catch:{ Exception -> 0x00db, all -> 0x0104 }
            goto L_0x00df
        L_0x00db:
            r8 = move-exception
            r8.printStackTrace()     // Catch:{ Exception -> 0x0109, all -> 0x0104 }
        L_0x00df:
            java.io.File r8 = new java.io.File     // Catch:{ Exception -> 0x0109, all -> 0x0104 }
            java.lang.String r9 = "vinebre_ac.txt"
            r8.<init>(r7, r9)     // Catch:{ Exception -> 0x0109, all -> 0x0104 }
            java.io.FileOutputStream r7 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x0109, all -> 0x0104 }
            r7.<init>(r8)     // Catch:{ Exception -> 0x0109, all -> 0x0104 }
            java.io.BufferedWriter r0 = new java.io.BufferedWriter     // Catch:{ Exception -> 0x0102, all -> 0x00ff }
            java.io.OutputStreamWriter r8 = new java.io.OutputStreamWriter     // Catch:{ Exception -> 0x0102, all -> 0x00ff }
            r8.<init>(r7)     // Catch:{ Exception -> 0x0102, all -> 0x00ff }
            r0.<init>(r8)     // Catch:{ Exception -> 0x0102, all -> 0x00ff }
            r0.write(r6)     // Catch:{ Exception -> 0x0102, all -> 0x00ff }
            r0.close()     // Catch:{ Exception -> 0x0102, all -> 0x00ff }
            r7.close()     // Catch:{ Exception -> 0x010c }
            goto L_0x010c
        L_0x00ff:
            r11 = move-exception
            r0 = r7
            goto L_0x0105
        L_0x0102:
            r0 = r7
            goto L_0x0109
        L_0x0104:
            r11 = move-exception
        L_0x0105:
            r0.close()     // Catch:{ Exception -> 0x0108 }
        L_0x0108:
            throw r11
        L_0x0109:
            r0.close()     // Catch:{ Exception -> 0x010c }
        L_0x010c:
            java.lang.String r0 = "nick"
            java.lang.String r6 = "nombre"
            java.lang.String r6 = r11.getQueryParameter(r6)
            r2.putString(r0, r6)
            java.lang.String r0 = "sexo"
            r2.putInt(r0, r3)
            java.lang.String r0 = "datos_usu"
            java.lang.String r0 = r11.getQueryParameter(r0)
            java.lang.String r3 = ""
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L_0x0183
            java.lang.String r0 = "datos_usu"
            java.lang.String r0 = r11.getQueryParameter(r0)
            java.lang.String r3 = "@"
            java.lang.String[] r0 = r0.split(r3)
            java.lang.String r3 = "privados"
            r6 = r0[r1]
            int r6 = java.lang.Integer.parseInt(r6)
            r2.putInt(r3, r6)
            java.lang.String r3 = "fnac_d"
            r4 = r0[r4]
            int r4 = java.lang.Integer.parseInt(r4)
            r2.putInt(r3, r4)
            java.lang.String r3 = "fnac_m"
            r4 = r0[r5]
            int r4 = java.lang.Integer.parseInt(r4)
            r2.putInt(r3, r4)
            java.lang.String r3 = "fnac_a"
            r4 = 3
            r4 = r0[r4]
            int r4 = java.lang.Integer.parseInt(r4)
            r2.putInt(r3, r4)
            java.lang.String r3 = "coments"
            r4 = 4
            r4 = r0[r4]
            int r4 = java.lang.Integer.parseInt(r4)
            r2.putInt(r3, r4)
            r3 = 5
            int r4 = r0.length
            if (r4 <= r3) goto L_0x017b
            java.lang.String r4 = "descr"
            r0 = r0[r3]
            r2.putString(r4, r0)
            goto L_0x01a3
        L_0x017b:
            java.lang.String r0 = "descr"
            java.lang.String r3 = ""
            r2.putString(r0, r3)
            goto L_0x01a3
        L_0x0183:
            java.lang.String r0 = "privados"
            r2.putInt(r0, r4)
            java.lang.String r0 = "fnac_d"
            r2.putInt(r0, r1)
            java.lang.String r0 = "fnac_m"
            r2.putInt(r0, r1)
            java.lang.String r0 = "fnac_a"
            r2.putInt(r0, r1)
            java.lang.String r0 = "coments"
            r2.putInt(r0, r4)
            java.lang.String r0 = "descr"
            java.lang.String r3 = ""
            r2.putString(r0, r3)
        L_0x01a3:
            r2.commit()
            java.lang.String r0 = "idfb"
            java.lang.String r0 = r11.getQueryParameter(r0)
            java.lang.String r2 = ""
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x01c2
            java.lang.String r0 = "tfoto"
            java.lang.String r0 = r11.getQueryParameter(r0)
            java.lang.String r2 = "1"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x01de
        L_0x01c2:
            java.lang.String r0 = "idgoogle"
            java.lang.String r0 = r11.getQueryParameter(r0)
            java.lang.String r2 = ""
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x01e9
            java.lang.String r0 = "tfoto"
            java.lang.String r0 = r11.getQueryParameter(r0)
            java.lang.String r2 = ""
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x01e9
        L_0x01de:
            mega.boicot.chat_perfil$a r0 = new mega.boicot.chat_perfil$a
            r0.<init>(r11)
            java.lang.String[] r11 = new java.lang.String[r1]
            r0.execute(r11)
            goto L_0x01ec
        L_0x01e9:
            r10.mo21632i()
        L_0x01ec:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: mega.boicot.chat_perfil.mo21627a(android.net.Uri):void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public void mo21632i() {
        Intent intent;
        try {
            this.f19648j.dismiss();
        } catch (Exception unused) {
        }
        try {
            if (this.f19635a.mo20757a((Context) this, 2).exists()) {
                config.m23840a(this.f19635a.mo20757a((Context) this, 2), this.f19635a.mo20757a((Context) this, 1));
            } else {
                this.f19635a.mo20757a((Context) this, 1).delete();
            }
        } catch (Exception unused2) {
        }
        boolean z = false;
        if (this.f19645g) {
            this.f19644f = false;
            this.f19640b = true;
            Intent intent2 = new Intent();
            intent2.putExtra("finalizar", true);
            setResult(-1, intent2);
            if (this.f19635a.f18045dm == 2) {
                finish();
                return;
            }
            int i = 0;
            while (!z && i < this.f19635a.f17971bz.length) {
                if (!this.f19635a.f17971bz[i].f18333z) {
                    z = true;
                } else {
                    i++;
                }
            }
            if (z) {
                C5662h a = this.f19635a.mo20762a(Integer.valueOf(i), (Context) this);
                a.f18226a.putExtra("es_root", true);
                startActivity(a.f18226a);
                finish();
                return;
            }
            finish();
            return;
        }
        if (this.f19662x.getBoolean("desde_buscusus", false)) {
            intent = new Intent(this, t_buscusus.class);
        } else if (this.f19662x.getBoolean("desde_buscvideos", false)) {
            intent = new Intent(this, t_buscvideos.class);
        } else if (this.f19662x.getBoolean("desde_foro", false)) {
            intent = new Intent(this, t_url.class);
        } else {
            intent = new Intent(this, t_chat_contra.class);
        }
        intent.putExtra("desdeperfil", 1);
        if (this.f19643e) {
            intent = config.m23827a(intent, this.f19662x);
        } else {
            intent.putExtra("idsecc", this.f19612D);
            intent.putExtra("ind", this.f19611C);
        }
        if (this.f19635a.f18045dm != 2) {
            intent.putExtra("es_root", true);
        }
        this.f19644f = false;
        this.f19640b = true;
        Intent intent3 = new Intent();
        intent3.putExtra("finalizar", true);
        setResult(-1, intent3);
        startActivity(intent);
        finish();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public Dialog mo21633j() {
        Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.dialog_contra);
        dialog.setTitle(getResources().getString(R.string.contra));
        ((TextView) dialog.findViewById(R.id.btn_cancel)).setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                chat_perfil.this.f19650l.dismiss();
            }
        });
        TextView textView = (TextView) dialog.findViewById(R.id.btn_aceptar);
        textView.setOnClickListener(new OnClickListener() {
            /* JADX WARNING: Removed duplicated region for block: B:13:0x008b  */
            /* JADX WARNING: Removed duplicated region for block: B:19:0x00ba  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void onClick(android.view.View r7) {
                /*
                    r6 = this;
                    android.app.AlertDialog$Builder r7 = new android.app.AlertDialog$Builder
                    mega.boicot.chat_perfil r0 = mega.boicot.chat_perfil.this
                    r7.<init>(r0)
                    r0 = 0
                    android.app.AlertDialog$Builder r1 = r7.setCancelable(r0)
                    mega.boicot.chat_perfil r2 = mega.boicot.chat_perfil.this
                    r3 = 2131558439(0x7f0d0027, float:1.8742194E38)
                    java.lang.String r2 = r2.getString(r3)
                    r3 = 0
                    r1.setPositiveButton(r2, r3)
                    mega.boicot.chat_perfil r1 = mega.boicot.chat_perfil.this
                    android.app.Dialog r1 = r1.f19650l
                    r2 = 2131230929(0x7f0800d1, float:1.8077925E38)
                    android.view.View r1 = r1.findViewById(r2)
                    android.widget.EditText r1 = (android.widget.EditText) r1
                    android.text.Editable r1 = r1.getText()
                    java.lang.String r1 = r1.toString()
                    java.lang.String r1 = r1.trim()
                    mega.boicot.chat_perfil r2 = mega.boicot.chat_perfil.this
                    android.app.Dialog r2 = r2.f19650l
                    r4 = 2131230930(0x7f0800d2, float:1.8077927E38)
                    android.view.View r2 = r2.findViewById(r4)
                    android.widget.EditText r2 = (android.widget.EditText) r2
                    android.text.Editable r2 = r2.getText()
                    java.lang.String r2 = r2.toString()
                    java.lang.String r2 = r2.trim()
                    mega.boicot.chat_perfil r4 = mega.boicot.chat_perfil.this
                    android.app.Dialog r4 = r4.f19650l
                    r5 = 2131230931(0x7f0800d3, float:1.8077929E38)
                    android.view.View r4 = r4.findViewById(r5)
                    android.widget.EditText r4 = (android.widget.EditText) r4
                    android.text.Editable r4 = r4.getText()
                    java.lang.String r4 = r4.toString()
                    java.lang.String r4 = r4.trim()
                    boolean r1 = r1.isEmpty()
                    if (r1 != 0) goto L_0x0084
                    boolean r1 = r2.isEmpty()
                    if (r1 != 0) goto L_0x0084
                    boolean r1 = r4.isEmpty()
                    if (r1 == 0) goto L_0x0077
                    goto L_0x0084
                L_0x0077:
                    boolean r1 = r2.equals(r4)
                    if (r1 != 0) goto L_0x0081
                    r1 = 2131558553(0x7f0d0099, float:1.8742425E38)
                    goto L_0x0087
                L_0x0081:
                    r1 = 1
                    r2 = r0
                    goto L_0x0089
                L_0x0084:
                    r1 = 2131558617(0x7f0d00d9, float:1.8742555E38)
                L_0x0087:
                    r2 = r1
                    r1 = r0
                L_0x0089:
                    if (r1 != 0) goto L_0x00ba
                    r7.setMessage(r2)
                    android.app.AlertDialog r7 = r7.create()
                    mega.boicot.chat_perfil r0 = mega.boicot.chat_perfil.this
                    java.lang.String r0 = r0.f19626R
                    java.lang.String r1 = ""
                    boolean r0 = r0.equals(r1)
                    if (r0 != 0) goto L_0x00a8
                    mega.boicot.chat_perfil$21$1 r0 = new mega.boicot.chat_perfil$21$1
                    r0.<init>(r7)
                    r7.setOnShowListener(r0)
                L_0x00a8:
                    r7.show()
                    r0 = 16908299(0x102000b, float:2.387726E-38)
                    android.view.View r7 = r7.findViewById(r0)     // Catch:{ Exception -> 0x00c6 }
                    android.widget.TextView r7 = (android.widget.TextView) r7     // Catch:{ Exception -> 0x00c6 }
                    android.graphics.Typeface r0 = android.graphics.Typeface.MONOSPACE     // Catch:{ Exception -> 0x00c6 }
                    r7.setTypeface(r0)     // Catch:{ Exception -> 0x00c6 }
                    goto L_0x00c6
                L_0x00ba:
                    mega.boicot.chat_perfil$d r7 = new mega.boicot.chat_perfil$d
                    mega.boicot.chat_perfil r1 = mega.boicot.chat_perfil.this
                    r7.<init>()
                    java.lang.String[] r0 = new java.lang.String[r0]
                    r7.execute(r0)
                L_0x00c6:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: mega.boicot.chat_perfil.C595321.onClick(android.view.View):void");
            }
        });
        if (VERSION.SDK_INT > 20) {
            StringBuilder sb = new StringBuilder();
            sb.append("#");
            sb.append(this.f19635a.f17890aW);
            textView.setTextColor(Color.parseColor(sb.toString()));
        }
        dialog.findViewById(R.id.iv_help).setOnClickListener(this);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("#");
        sb2.append(this.f19628T);
        if (config.m23844a(sb2.toString())) {
            this.f19660v = (ProgressBar) dialog.findViewById(R.id.pb_contra_inv);
        } else {
            this.f19660v = (ProgressBar) dialog.findViewById(R.id.pb_contra);
            ((ImageView) dialog.findViewById(R.id.iv_help)).setImageDrawable(getResources().getDrawable(R.drawable.help_b));
        }
        if (VERSION.SDK_INT > 20) {
            config.m23838a(this.f19660v, this.f19635a.f17890aW);
        }
        return dialog;
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putString("foto1_modif_saved", this.f19625Q);
    }

    public boolean onSearchRequested() {
        if (this.f19635a.f18080q == 0) {
            return false;
        }
        this.f19640b = true;
        this.f19657s = true;
        return super.onSearchRequested();
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getWindow().setFormat(1);
    }

    public void onStop() {
        super.onStop();
        if (this.f19640b && !this.f19657s) {
            finish();
        }
    }

    public void onPause() {
        if (!(this.f19635a.f18013cx == 0 || this.f19651m == null || this.f19651m.f17768a == null)) {
            this.f19651m.f17768a.mo12167b();
        }
        super.onPause();
    }

    public void onResume() {
        super.onResume();
        config.m23860m(this);
        if (this.f19635a.f18013cx != 0 && this.f19651m != null && this.f19651m.f17768a != null) {
            this.f19651m.f17768a.mo12165a();
        }
    }

    public void onDestroy() {
        if (!(this.f19635a.f18013cx == 0 || this.f19651m == null || this.f19651m.f17768a == null)) {
            this.f19651m.f17768a.mo12168c();
        }
        if (!(this.f19635a.f18013cx == 0 || this.f19651m == null || this.f19651m.f17769b == null)) {
            this.f19651m.f17769b.destroy();
        }
        if ((this.f19644f && isFinishing()) || config.f17841i) {
            config.m23861n(this);
        }
        super.onDestroy();
    }

    public void onBackPressed() {
        if (!this.f19644f || this.f19641c || !this.f19635a.f18059ea) {
            super.onBackPressed();
            return;
        }
        this.f19641c = true;
        config.m23859l(this);
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ((LinearLayout) findViewById(R.id.ll_princ)).removeViewAt(0);
        mo21631h();
        ((LinearLayout) findViewById(R.id.ll_ad)).removeAllViews();
        if (!(this.f19651m == null || this.f19651m.f17768a == null)) {
            try {
                this.f19651m.f17768a.mo12168c();
            } catch (Exception unused) {
            }
        }
        if (!(this.f19651m == null || this.f19651m.f17769b == null)) {
            try {
                this.f19651m.f17769b.destroy();
            } catch (Exception unused2) {
            }
        }
        this.f19651m = this.f19635a.mo20760a((Context) this, false);
    }

    public void adLoaded(String str) {
        this.f19659u.cancel();
        this.f19653o.showAd();
    }

    public void onAdClosed() {
        if (this.f19656r) {
            abrir_secc(this.f19658t);
        }
    }

    public void adError(String str) {
        this.f19659u.cancel();
        abrir_secc(this.f19658t);
    }

    public void videoEnded() {
        this.f19656r = true;
        config.m23867t(this);
    }

    /* renamed from: z_ */
    public void mo9678z_() {
        this.f19659u.cancel();
        this.f19652n.mo12836a();
    }

    /* renamed from: a */
    public void mo9675a(C3165a aVar) {
        this.f19656r = true;
        config.m23867t(this);
    }

    /* renamed from: A_ */
    public void mo9671A_() {
        if (this.f19656r) {
            abrir_secc(this.f19658t);
        }
    }

    /* renamed from: e */
    public void mo9676e() {
        this.f19656r = false;
    }

    /* renamed from: a */
    public void mo9674a(int i) {
        if (!this.f19635a.mo20775a((Context) this, this.f19653o)) {
            this.f19659u.cancel();
            abrir_secc(this.f19658t);
        }
    }

    public void onError(C1514Ad ad, AdError adError) {
        this.f19659u.cancel();
        abrir_secc(this.f19658t);
    }

    public void onAdLoaded(C1514Ad ad) {
        this.f19659u.cancel();
        this.f19654p.show();
    }

    public void onRewardedVideoCompleted() {
        this.f19656r = true;
        config.m23867t(this);
    }

    public void onRewardedVideoClosed() {
        if (this.f19656r) {
            abrir_secc(this.f19658t);
        }
    }

    public void onVideoCompleted() {
        this.f19656r = true;
        config.m23867t(this);
    }

    public void onReceiveAd(C5286Ad ad) {
        this.f19659u.cancel();
        this.f19655q.showAd("REWARDED VIDEO", new AdDisplayListener() {
            public void adClicked(C5286Ad ad) {
            }

            public void adDisplayed(C5286Ad ad) {
            }

            public void adNotDisplayed(C5286Ad ad) {
            }

            public void adHidden(C5286Ad ad) {
                if (chat_perfil.this.f19656r) {
                    chat_perfil.this.abrir_secc(chat_perfil.this.f19658t);
                }
            }
        });
    }

    public void onFailedToReceiveAd(C5286Ad ad) {
        this.f19659u.cancel();
        abrir_secc(this.f19658t);
    }
}
