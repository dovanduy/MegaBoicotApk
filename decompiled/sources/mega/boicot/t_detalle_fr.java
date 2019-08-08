package mega.boicot;

import android.annotation.TargetApi;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.Color;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.AsyncTask.Status;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.p017v4.app.Fragment;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.webkit.CookieManager;
import android.webkit.DownloadListener;
import android.webkit.GeolocationPermissions.Callback;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebSettings.PluginState;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.facebook.ads.AudienceNetworkActivity;
import com.google.android.exoplayer2.C2793C;
import com.google.android.exoplayer2.source.hls.DefaultHlsExtractorFactory;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Arrays;
import java.util.Currency;
import java.util.Date;
import java.util.Locale;

public class t_detalle_fr extends Fragment implements OnClickListener {

    /* renamed from: a */
    config f20548a;

    /* renamed from: ag */
    String f20549ag;

    /* renamed from: ah */
    String f20550ah;

    /* renamed from: ai */
    String f20551ai;

    /* renamed from: aj */
    String f20552aj;

    /* renamed from: ak */
    String f20553ak = "0";

    /* renamed from: al */
    C6188c f20554al;

    /* renamed from: am */
    C6187b f20555am;

    /* renamed from: an */
    C6186a f20556an;

    /* renamed from: ao */
    private View f20557ao = null;

    /* renamed from: ap */
    private WebView f20558ap = null;
    /* access modifiers changed from: private */

    /* renamed from: aq */
    public ProgressBar f20559aq;
    /* access modifiers changed from: private */

    /* renamed from: ar */
    public FrameLayout f20560ar = null;

    /* renamed from: as */
    private RelativeLayout f20561as;
    /* access modifiers changed from: private */

    /* renamed from: at */
    public long f20562at;
    /* access modifiers changed from: private */

    /* renamed from: au */
    public String[] f20563au = {"_id", "ref", "titulo", "descr", "idcat", "precio", "precio_descr", "url_compra", "img1_p", "img1_id", "img1_url", "det_cargado", "anyo", "mes", "dia"};

    /* renamed from: av */
    private boolean f20564av;

    /* renamed from: b */
    int f20565b;

    /* renamed from: c */
    int f20566c;

    /* renamed from: d */
    float f20567d;

    /* renamed from: e */
    boolean f20568e = false;

    /* renamed from: f */
    boolean f20569f = true;

    /* renamed from: g */
    boolean f20570g = true;

    /* renamed from: h */
    boolean f20571h = false;

    /* renamed from: i */
    SharedPreferences f20572i;

    /* renamed from: mega.boicot.t_detalle_fr$a */
    private class C6186a extends AsyncTask<String, Void, Byte> {

        /* renamed from: a */
        String f20580a;

        /* renamed from: b */
        long f20581b;

        private C6186a() {
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x00ae  */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x00b4  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Byte doInBackground(java.lang.String... r6) {
            /*
                r5 = this;
                r6 = 0
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00a7 }
                r0.<init>()     // Catch:{ Exception -> 0x00a7 }
                java.lang.String r1 = "http://"
                r0.append(r1)     // Catch:{ Exception -> 0x00a7 }
                java.lang.String r1 = mega.boicot.config.f17839g     // Catch:{ Exception -> 0x00a7 }
                r0.append(r1)     // Catch:{ Exception -> 0x00a7 }
                java.lang.String r1 = "/srv/prod_detalle.php?v=1&idapp="
                r0.append(r1)     // Catch:{ Exception -> 0x00a7 }
                r1 = 718963(0xaf873, float:1.007482E-39)
                r0.append(r1)     // Catch:{ Exception -> 0x00a7 }
                java.lang.String r1 = "&idusu="
                r0.append(r1)     // Catch:{ Exception -> 0x00a7 }
                mega.boicot.t_detalle_fr r1 = mega.boicot.t_detalle_fr.this     // Catch:{ Exception -> 0x00a7 }
                int r1 = r1.f20565b     // Catch:{ Exception -> 0x00a7 }
                r0.append(r1)     // Catch:{ Exception -> 0x00a7 }
                java.lang.String r1 = "&idprod="
                r0.append(r1)     // Catch:{ Exception -> 0x00a7 }
                long r1 = r5.f20581b     // Catch:{ Exception -> 0x00a7 }
                r0.append(r1)     // Catch:{ Exception -> 0x00a7 }
                java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x00a7 }
                java.net.URL r1 = new java.net.URL     // Catch:{ Exception -> 0x00a7 }
                r1.<init>(r0)     // Catch:{ Exception -> 0x00a7 }
                java.net.URLConnection r0 = r1.openConnection()     // Catch:{ Exception -> 0x00a7 }
                java.net.HttpURLConnection r0 = (java.net.HttpURLConnection) r0     // Catch:{ Exception -> 0x00a7 }
                r6 = 1
                r0.setDoInput(r6)     // Catch:{ Exception -> 0x00a0, all -> 0x009e }
                r6 = 10000(0x2710, float:1.4013E-41)
                r0.setConnectTimeout(r6)     // Catch:{ Exception -> 0x00a0, all -> 0x009e }
                r0.setReadTimeout(r6)     // Catch:{ Exception -> 0x00a0, all -> 0x009e }
                java.lang.String r6 = "User-Agent"
                java.lang.String r1 = "Android Vinebre Software"
                r0.setRequestProperty(r6, r1)     // Catch:{ Exception -> 0x00a0, all -> 0x009e }
                java.io.InputStream r6 = r0.getInputStream()     // Catch:{ Exception -> 0x00a0, all -> 0x009e }
                java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch:{ Exception -> 0x00a0, all -> 0x009e }
                java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x00a0, all -> 0x009e }
                r2.<init>(r6)     // Catch:{ Exception -> 0x00a0, all -> 0x009e }
                r1.<init>(r2)     // Catch:{ Exception -> 0x00a0, all -> 0x009e }
                java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00a0, all -> 0x009e }
                r6.<init>()     // Catch:{ Exception -> 0x00a0, all -> 0x009e }
            L_0x0066:
                java.lang.String r2 = r1.readLine()     // Catch:{ Exception -> 0x00a0, all -> 0x009e }
                if (r2 == 0) goto L_0x0081
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00a0, all -> 0x009e }
                r3.<init>()     // Catch:{ Exception -> 0x00a0, all -> 0x009e }
                r3.append(r2)     // Catch:{ Exception -> 0x00a0, all -> 0x009e }
                java.lang.String r2 = "\n"
                r3.append(r2)     // Catch:{ Exception -> 0x00a0, all -> 0x009e }
                java.lang.String r2 = r3.toString()     // Catch:{ Exception -> 0x00a0, all -> 0x009e }
                r6.append(r2)     // Catch:{ Exception -> 0x00a0, all -> 0x009e }
                goto L_0x0066
            L_0x0081:
                java.lang.String r6 = r6.toString()     // Catch:{ Exception -> 0x00a0, all -> 0x009e }
                r5.f20580a = r6     // Catch:{ Exception -> 0x00a0, all -> 0x009e }
                java.lang.String r6 = r5.f20580a     // Catch:{ Exception -> 0x00a0, all -> 0x009e }
                java.lang.String r1 = "@EURO@"
                java.lang.String r2 = "€"
                java.lang.String r6 = r6.replace(r1, r2)     // Catch:{ Exception -> 0x00a0, all -> 0x009e }
                r5.f20580a = r6     // Catch:{ Exception -> 0x00a0, all -> 0x009e }
                if (r0 == 0) goto L_0x0098
                r0.disconnect()
            L_0x0098:
                r6 = 0
                java.lang.Byte r6 = java.lang.Byte.valueOf(r6)
                return r6
            L_0x009e:
                r6 = move-exception
                goto L_0x00b2
            L_0x00a0:
                r6 = r0
                goto L_0x00a7
            L_0x00a2:
                r0 = move-exception
                r4 = r0
                r0 = r6
                r6 = r4
                goto L_0x00b2
            L_0x00a7:
                r0 = -1
                java.lang.Byte r0 = java.lang.Byte.valueOf(r0)     // Catch:{ all -> 0x00a2 }
                if (r6 == 0) goto L_0x00b1
                r6.disconnect()
            L_0x00b1:
                return r0
            L_0x00b2:
                if (r0 == 0) goto L_0x00b7
                r0.disconnect()
            L_0x00b7:
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: mega.boicot.t_detalle_fr.C6186a.doInBackground(java.lang.String[]):java.lang.Byte");
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
            t_detalle_fr.this.f20560ar.findViewById(R.id.sv_det).setVisibility(8);
            t_detalle_fr.this.f20559aq.setVisibility(0);
            this.f20581b = t_detalle_fr.this.f20562at;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void onPostExecute(Byte b) {
            if (t_detalle_fr.this.mo626m() != null) {
                if (b.byteValue() == 0 && !this.f20580a.contains("-KO-")) {
                    String[] split = this.f20580a.split(",");
                    ContentValues contentValues = new ContentValues();
                    if (!split[0].trim().equals("0")) {
                        contentValues.put("ref", split[0].trim().replace("@x@", ","));
                    }
                    if (!split[1].trim().equals("0")) {
                        contentValues.put("descr", split[1].trim().replace("@x@", ","));
                    }
                    contentValues.put("idcat", split[2].trim());
                    if (!split[3].trim().equals("0")) {
                        contentValues.put("precio_descr", split[3].trim().replace("@x@", ","));
                    }
                    if (!split[4].trim().equals("0")) {
                        contentValues.put("url_compra", split[4].trim().replace("@x@", ","));
                    }
                    contentValues.put("det_cargado", Integer.valueOf(1));
                    ContentResolver contentResolver = t_detalle_fr.this.mo626m().getContentResolver();
                    Uri uri = bd_provider.f19599a;
                    StringBuilder sb = new StringBuilder();
                    sb.append("_id=");
                    sb.append(this.f20581b);
                    contentResolver.update(uri, contentValues, sb.toString(), null);
                    if (!split[5].equals("0")) {
                        String[] split2 = split[5].split("@z@");
                        for (int i = 0; i < split2.length; i++) {
                            String[] split3 = split2[i].split(";");
                            contentValues.clear();
                            contentValues.put("_id", split3[0]);
                            contentValues.put("idprod", Long.valueOf(this.f20581b));
                            String replace = split3[1].replace("@y@", ";").replace("@x@", ",");
                            if (replace.equals("0")) {
                                replace = "";
                            }
                            contentValues.put("url", replace);
                            contentValues.put("orden", Integer.valueOf(i));
                            t_detalle_fr.this.mo626m().getContentResolver().insert(bd_provider.f19600b, contentValues);
                        }
                    }
                    if (this.f20581b == t_detalle_fr.this.f20562at) {
                        SQLiteDatabase readableDatabase = new C5665k(t_detalle_fr.this.mo626m()).getReadableDatabase();
                        if (readableDatabase != null) {
                            String[] d = t_detalle_fr.this.f20563au;
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("_id=");
                            sb2.append(this.f20581b);
                            Cursor query = readableDatabase.query("productos", d, sb2.toString(), null, null, null, "_id", "1");
                            if (query.moveToFirst()) {
                                t_detalle_fr.this.m24712a(query);
                            }
                            query.close();
                        }
                        readableDatabase.close();
                    }
                }
                t_detalle_fr.this.f20559aq.setVisibility(8);
                t_detalle_fr.this.f20560ar.findViewById(R.id.sv_det).setVisibility(0);
            }
        }
    }

    /* renamed from: mega.boicot.t_detalle_fr$b */
    private class C6187b extends AsyncTask<String, Void, Byte> {

        /* renamed from: a */
        byte[] f20583a;

        /* renamed from: b */
        String f20584b;

        /* renamed from: c */
        int f20585c;

        /* renamed from: d */
        boolean f20586d = false;

        /* renamed from: e */
        public ProgressBar f20587e;

        public C6187b(ImageView imageView) {
            StringBuilder sb = new StringBuilder();
            sb.append((Integer) imageView.getTag(R.id.TAG_IDFOTO));
            sb.append("");
            this.f20584b = sb.toString();
            this.f20587e = (ProgressBar) ((RelativeLayout) imageView.getParent()).getChildAt(1);
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
            boolean z;
            this.f20583a = null;
            SQLiteDatabase readableDatabase = new C5665k(t_detalle_fr.this.mo626m()).getReadableDatabase();
            if (readableDatabase != null) {
                StringBuilder sb = new StringBuilder();
                sb.append("SELECT 1 AS tipo,img1_url AS url,img1 AS img,img1_p AS img_p FROM productos WHERE img1_id=");
                sb.append(this.f20584b);
                sb.append(" UNION SELECT 2 AS tipo,url,img,img_p FROM fotos WHERE _id=");
                sb.append(this.f20584b);
                Cursor rawQuery = readableDatabase.rawQuery(sb.toString(), null);
                if (rawQuery.moveToFirst()) {
                    if (!rawQuery.isNull(rawQuery.getColumnIndex("img"))) {
                        this.f20583a = rawQuery.getBlob(rawQuery.getColumnIndex("img"));
                    } else if (!rawQuery.getString(rawQuery.getColumnIndex("url")).equals("")) {
                        this.f20583a = rawQuery.getBlob(rawQuery.getColumnIndex("img_p"));
                    } else {
                        this.f20585c = rawQuery.getInt(rawQuery.getColumnIndex("tipo"));
                    }
                }
                rawQuery.close();
            }
            readableDatabase.close();
            if (this.f20583a != null) {
                File file = new File(t_detalle_fr.this.mo626m().getFilesDir(), "temp");
                try {
                    FileOutputStream openFileOutput = t_detalle_fr.this.mo626m().openFileOutput("temp", 0);
                    openFileOutput.write(this.f20583a);
                    openFileOutput.close();
                    z = true;
                } catch (Exception e) {
                    e.printStackTrace();
                    z = false;
                }
                if (z && file != null && file.exists()) {
                    Intent intent = new Intent(t_detalle_fr.this.mo626m(), t_url.class);
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("file://");
                    sb2.append(file);
                    intent.putExtra("url", sb2.toString());
                    intent.putExtra("bg1", t_detalle_fr.this.f20548a.f17964bs);
                    intent.putExtra("bg2", t_detalle_fr.this.f20548a.f17964bs);
                    t_detalle_fr.this.startActivityForResult(intent, 0);
                }
                cancel(true);
                return;
            }
            LayoutParams layoutParams = new LayoutParams(-2, -2);
            layoutParams.addRule(13);
            this.f20587e.setLayoutParams(layoutParams);
            this.f20587e.setVisibility(0);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Byte doInBackground(String... strArr) {
            StringBuilder sb = new StringBuilder();
            sb.append("http://");
            sb.append(config.f17839g);
            sb.append("/srv/imgs/prods/");
            sb.append(this.f20584b);
            sb.append("_");
            sb.append(t_detalle_fr.this.f20562at);
            sb.append(".png");
            try {
                try {
                    HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(sb.toString()).openConnection();
                    httpURLConnection.setDoInput(true);
                    httpURLConnection.setConnectTimeout(5000);
                    httpURLConnection.setReadTimeout(7000);
                    httpURLConnection.connect();
                    InputStream inputStream = httpURLConnection.getInputStream();
                    Bitmap decodeStream = BitmapFactory.decodeStream(inputStream);
                    inputStream.close();
                    if (decodeStream == null) {
                        return Byte.valueOf(-1);
                    }
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    decodeStream.compress(CompressFormat.JPEG, 100, byteArrayOutputStream);
                    this.f20583a = byteArrayOutputStream.toByteArray();
                    try {
                        byteArrayOutputStream.close();
                    } catch (IOException unused) {
                    }
                    this.f20586d = true;
                    return Byte.valueOf(0);
                } catch (IOException unused2) {
                    return Byte.valueOf(-1);
                }
            } catch (MalformedURLException unused3) {
                return Byte.valueOf(-1);
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void onPostExecute(Byte b) {
            if (t_detalle_fr.this.mo626m() != null && b.byteValue() == 0) {
                boolean z = true;
                if (this.f20586d) {
                    ContentValues contentValues = new ContentValues();
                    if (this.f20585c == 1) {
                        contentValues.put("img1", this.f20583a);
                        ContentResolver contentResolver = t_detalle_fr.this.mo626m().getContentResolver();
                        Uri uri = bd_provider.f19599a;
                        StringBuilder sb = new StringBuilder();
                        sb.append("img1_id='");
                        sb.append(this.f20584b);
                        sb.append("'");
                        contentResolver.update(uri, contentValues, sb.toString(), null);
                    } else if (this.f20585c == 2) {
                        contentValues.put("img", this.f20583a);
                        ContentResolver contentResolver2 = t_detalle_fr.this.mo626m().getContentResolver();
                        Uri uri2 = bd_provider.f19600b;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("_id='");
                        sb2.append(this.f20584b);
                        sb2.append("'");
                        contentResolver2.update(uri2, contentValues, sb2.toString(), null);
                    }
                }
                this.f20587e.setVisibility(8);
                File file = new File(t_detalle_fr.this.mo626m().getFilesDir(), "temp");
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file.getPath());
                    fileOutputStream.write(this.f20583a);
                    fileOutputStream.close();
                } catch (Exception e) {
                    e.printStackTrace();
                    z = false;
                }
                if (z && file != null && file.exists()) {
                    Intent intent = new Intent(t_detalle_fr.this.mo626m(), t_url.class);
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("file://");
                    sb3.append(file);
                    intent.putExtra("url", sb3.toString());
                    intent.putExtra("bg1", t_detalle_fr.this.f20548a.f17964bs);
                    intent.putExtra("bg2", t_detalle_fr.this.f20548a.f17964bs);
                    t_detalle_fr.this.startActivityForResult(intent, 0);
                }
            }
        }
    }

    /* renamed from: mega.boicot.t_detalle_fr$c */
    private class C6188c extends AsyncTask<String, Void, Byte> {

        /* renamed from: a */
        byte[] f20589a;

        /* renamed from: b */
        String f20590b;

        /* renamed from: c */
        String f20591c;

        /* renamed from: d */
        int f20592d;

        /* renamed from: e */
        int f20593e;

        /* renamed from: f */
        long f20594f;

        public C6188c(int i) {
            this.f20593e = i;
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
            this.f20594f = t_detalle_fr.this.f20562at;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Byte doInBackground(String... strArr) {
            if (t_detalle_fr.this.mo626m() == null) {
                return Byte.valueOf(-1);
            }
            this.f20590b = "0";
            String str = "";
            SQLiteDatabase readableDatabase = new C5665k(t_detalle_fr.this.mo626m()).getReadableDatabase();
            if (readableDatabase != null) {
                StringBuilder sb = new StringBuilder();
                sb.append("SELECT 1 AS tipo,img1_id AS id,0 AS orden,img1_url AS url FROM productos WHERE (_id=");
                sb.append(t_detalle_fr.this.f20562at);
                sb.append(") AND (img1_id NOT IN (");
                sb.append(t_detalle_fr.this.f20553ak);
                sb.append(")) AND (img1_p IS NULL) UNION SELECT 2 AS tipo,_id AS id,orden,url FROM fotos WHERE (idprod=");
                sb.append(t_detalle_fr.this.f20562at);
                sb.append(") AND (_id NOT IN (");
                sb.append(t_detalle_fr.this.f20553ak);
                sb.append(")) AND (img_p IS NULL) ORDER BY orden");
                Cursor rawQuery = readableDatabase.rawQuery(sb.toString(), null);
                if (rawQuery.moveToFirst()) {
                    this.f20590b = rawQuery.getString(rawQuery.getColumnIndex(TtmlNode.ATTR_ID));
                    this.f20592d = rawQuery.getInt(rawQuery.getColumnIndex("tipo"));
                    str = rawQuery.getString(rawQuery.getColumnIndex("url"));
                }
                rawQuery.close();
            }
            readableDatabase.close();
            if (this.f20590b.equals("0")) {
                return Byte.valueOf(1);
            }
            this.f20591c = str;
            if (str.equals("")) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("http://");
                sb2.append(config.f17839g);
                sb2.append("/srv/imgs/prods/");
                sb2.append(this.f20590b);
                sb2.append("_");
                sb2.append(t_detalle_fr.this.f20562at);
                sb2.append("_p.png");
                str = sb2.toString();
                StringBuilder sb3 = new StringBuilder();
                sb3.append("http://");
                sb3.append(config.f17839g);
                sb3.append("/srv/imgs/prods/");
                sb3.append(this.f20590b);
                sb3.append("_");
                sb3.append(t_detalle_fr.this.f20562at);
                sb3.append(".png");
                this.f20591c = sb3.toString();
            }
            try {
                URL url = new URL(str);
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
                    config config = t_detalle_fr.this.f20548a;
                    options.inSampleSize = config.m23826a(options, 300, 300);
                    HttpURLConnection httpURLConnection2 = (HttpURLConnection) url.openConnection();
                    httpURLConnection2.setDoInput(true);
                    httpURLConnection2.setConnectTimeout(5000);
                    httpURLConnection2.setReadTimeout(7000);
                    httpURLConnection2.connect();
                    InputStream inputStream2 = httpURLConnection2.getInputStream();
                    options.inJustDecodeBounds = false;
                    Bitmap decodeStream = BitmapFactory.decodeStream(inputStream2, null, options);
                    inputStream2.close();
                    if (decodeStream == null) {
                        return Byte.valueOf(-1);
                    }
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    decodeStream.compress(CompressFormat.JPEG, 100, byteArrayOutputStream);
                    this.f20589a = byteArrayOutputStream.toByteArray();
                    try {
                        byteArrayOutputStream.close();
                    } catch (IOException unused) {
                    }
                    return Byte.valueOf(0);
                } catch (IOException unused2) {
                    return Byte.valueOf(-1);
                }
            } catch (MalformedURLException unused3) {
                return Byte.valueOf(-1);
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void onPostExecute(Byte b) {
            if (t_detalle_fr.this.mo626m() != null) {
                if (b.byteValue() == 0) {
                    ContentValues contentValues = new ContentValues();
                    if (this.f20592d == 1) {
                        contentValues.put("img1_p", this.f20589a);
                        ContentResolver contentResolver = t_detalle_fr.this.mo626m().getContentResolver();
                        Uri uri = bd_provider.f19599a;
                        StringBuilder sb = new StringBuilder();
                        sb.append("img1_id='");
                        sb.append(this.f20590b);
                        sb.append("'");
                        contentResolver.update(uri, contentValues, sb.toString(), null);
                    } else if (this.f20592d == 2) {
                        contentValues.put("img_p", this.f20589a);
                        ContentResolver contentResolver2 = t_detalle_fr.this.mo626m().getContentResolver();
                        Uri uri2 = bd_provider.f19600b;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("_id='");
                        sb2.append(this.f20590b);
                        sb2.append("'");
                        contentResolver2.update(uri2, contentValues, sb2.toString(), null);
                    }
                    if (this.f20594f == t_detalle_fr.this.f20562at) {
                        StringBuilder sb3 = new StringBuilder();
                        t_detalle_fr t_detalle_fr = t_detalle_fr.this;
                        sb3.append(t_detalle_fr.f20553ak);
                        sb3.append(",");
                        sb3.append(this.f20590b);
                        t_detalle_fr.f20553ak = sb3.toString();
                        t_detalle_fr.this.mo22199a(this.f20589a, Integer.parseInt(this.f20590b), this.f20591c);
                    }
                }
                if (b.byteValue() != 1 && this.f20594f == t_detalle_fr.this.f20562at) {
                    if (b.byteValue() == -1) {
                        this.f20593e++;
                    } else {
                        this.f20593e = 0;
                    }
                    if (this.f20593e < 3) {
                        t_detalle_fr.this.f20554al = new C6188c(this.f20593e);
                        t_detalle_fr.this.f20554al.execute(new String[0]);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public View mo555a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f20548a = (config) mo626m().getApplicationContext();
        if (this.f20548a.f17881aN == null) {
            this.f20548a.mo20780b();
        }
        this.f20572i = mo626m().getSharedPreferences("sh", 0);
        this.f20565b = this.f20572i.getInt("idusu", 0);
        this.f20564av = false;
        if (!this.f20548a.f17964bs.equals("")) {
            StringBuilder sb = new StringBuilder();
            sb.append("#");
            sb.append(this.f20548a.f17964bs);
            if (config.m23844a(sb.toString())) {
                this.f20564av = true;
            }
        }
        this.f20568e = this.f20548a.f17917ax;
        this.f20567d = mo628n().getDisplayMetrics().density;
        this.f20566c = (int) ((100.0f * this.f20567d) + 0.5f);
        this.f20557ao = layoutInflater.inflate(R.layout.detalle, viewGroup, false);
        this.f20561as = (RelativeLayout) this.f20557ao.findViewById(R.id.rl_web);
        this.f20558ap = (WebView) this.f20557ao.findViewById(R.id.ll_det_web);
        this.f20558ap.setWebChromeClient(new WebChromeClient() {
            public boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
                jsResult.confirm();
                return true;
            }

            public void onGeolocationPermissionsShowPrompt(String str, Callback callback) {
                callback.invoke(str, true, false);
            }
        });
        m24719c();
        this.f20558ap.getSettings().setBuiltInZoomControls(true);
        this.f20558ap.getSettings().setSupportZoom(true);
        this.f20558ap.getSettings().setDomStorageEnabled(true);
        this.f20558ap.setOnTouchListener(new OnTouchListener() {
            public boolean onTouch(View view, MotionEvent motionEvent) {
                switch (motionEvent.getAction()) {
                    case 0:
                    case 1:
                        if (!view.hasFocus()) {
                            view.requestFocus();
                            break;
                        }
                        break;
                }
                return false;
            }
        });
        this.f20558ap.setDownloadListener(new DownloadListener() {
            public void onDownloadStart(String str, String str2, String str3, String str4, long j) {
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(Uri.parse(str));
                t_detalle_fr.this.mo567a(intent);
            }
        });
        if (this.f20548a.f17916aw) {
            this.f20558ap.getSettings().setUseWideViewPort(true);
            this.f20558ap.getSettings().setLoadWithOverviewMode(true);
        }
        final ProgressBar progressBar = (ProgressBar) this.f20557ao.findViewById(R.id.pb_url);
        if (this.f20564av) {
            this.f20559aq = (ProgressBar) this.f20557ao.findViewById(R.id.pb_det_inverse);
        } else {
            this.f20559aq = (ProgressBar) this.f20557ao.findViewById(R.id.pb_det);
        }
        if (VERSION.SDK_INT > 20) {
            config.m23838a(progressBar, this.f20548a.f17890aW);
            config.m23838a(this.f20559aq, this.f20548a.f17890aW);
        }
        this.f20558ap.setWebViewClient(new WebViewClient() {
            public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
                progressBar.setVisibility(0);
            }

            public void onPageFinished(WebView webView, String str) {
                progressBar.setVisibility(8);
                if (t_detalle_fr.this.f20570g) {
                    webView.clearHistory();
                    t_detalle_fr.this.f20570g = false;
                }
            }

            public boolean shouldOverrideUrlLoading(WebView webView, String str) {
                return t_detalle_fr.this.m24715a(str, true);
            }
        });
        this.f20558ap.getSettings().setJavaScriptEnabled(true);
        this.f20558ap.getSettings().setPluginState(PluginState.ON);
        WebSettings settings = this.f20558ap.getSettings();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f20558ap.getSettings().getUserAgentString());
        sb2.append(" Vinebre");
        settings.setUserAgentString(sb2.toString());
        this.f20560ar = (FrameLayout) this.f20557ao.findViewById(R.id.ll_det_cont);
        return this.f20557ao;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public boolean m24715a(String str, boolean z) {
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11 = str;
        String lowerCase = str.toLowerCase();
        boolean z2 = true;
        String[] strArr = {"doc", "docx", "xls", "xlsx", "ppt", "pptx", "pdf", "pages", "ai", "psd", "tiff", "dxf", "svg", "eps", "ps", "ttf", "otf", "xps", "zip", "rar"};
        String str12 = "";
        int lastIndexOf = str11.lastIndexOf(".");
        if (lastIndexOf != -1) {
            str12 = lowerCase.substring(lastIndexOf);
        }
        String replace = str12.replace(".", "");
        if (lowerCase.startsWith("tel:") || lowerCase.startsWith("http://tel:")) {
            if (lowerCase.startsWith("tel:")) {
                str2 = str11.substring(4);
            } else {
                str2 = str11.substring(11);
            }
            if (str2.endsWith("/")) {
                str2 = str2.substring(0, str2.length() - 1);
            }
            StringBuilder sb = new StringBuilder();
            sb.append("tel:");
            sb.append(str2);
            mo567a(new Intent("android.intent.action.DIAL", Uri.parse(sb.toString())));
        } else if (lowerCase.startsWith("mailto:") || lowerCase.startsWith("http://mailto:")) {
            String str13 = "";
            String str14 = "";
            if (lowerCase.startsWith("mailto:")) {
                str3 = str11.substring(7).trim();
            } else {
                str3 = str11.substring(14).trim();
            }
            if (!str3.equals("")) {
                int indexOf = str3.indexOf("?");
                if (indexOf > 0) {
                    int indexOf2 = str3.indexOf("?subject=");
                    if (indexOf2 != -1) {
                        str13 = str3.substring(indexOf2 + 9).trim();
                        int indexOf3 = str13.indexOf("&body=");
                        if (indexOf3 != -1) {
                            str14 = str13.substring(indexOf3 + 6).trim();
                            str13 = str13.substring(0, indexOf3).trim();
                        }
                    }
                    str3 = str3.substring(0, indexOf).trim();
                }
                if (str3.endsWith("/")) {
                    str3 = str3.substring(0, str3.length() - 1);
                }
                Intent intent = new Intent("android.intent.action.SENDTO", Uri.fromParts("mailto", str3, null));
                if (!str13.equals("")) {
                    try {
                        str5 = URLDecoder.decode(str13, C2793C.UTF8_NAME);
                    } catch (Exception unused) {
                        str5 = str13;
                    }
                    intent.putExtra("android.intent.extra.SUBJECT", str5);
                }
                if (!str14.equals("")) {
                    try {
                        str4 = URLDecoder.decode(str14, C2793C.UTF8_NAME);
                    } catch (Exception unused2) {
                        str4 = str14;
                    }
                    intent.putExtra("android.intent.extra.TEXT", str4);
                }
                mo567a(Intent.createChooser(intent, mo628n().getString(R.string.enviar_email)));
            }
        } else if (lowerCase.startsWith("smsto:") || lowerCase.startsWith("http://smsto:")) {
            String str15 = "";
            if (lowerCase.startsWith("smsto:")) {
                str6 = str11.substring(6).trim();
            } else {
                str6 = str11.substring(13).trim();
            }
            if (!str6.equals("")) {
                int indexOf4 = str6.indexOf("?");
                if (indexOf4 > 0) {
                    int indexOf5 = str6.indexOf("?body=");
                    if (indexOf5 != -1) {
                        str15 = str6.substring(indexOf5 + 6).trim();
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
                if (!str15.equals("")) {
                    try {
                        str7 = URLDecoder.decode(str15, C2793C.UTF8_NAME);
                    } catch (Exception unused3) {
                        str7 = str15;
                    }
                    intent2.putExtra("sms_body", str7);
                }
                try {
                    mo567a(intent2);
                } catch (Exception unused4) {
                }
            }
        } else if (lowerCase.startsWith("go:") || lowerCase.startsWith("http://go:")) {
            if (lowerCase.startsWith("go:")) {
                str8 = str11.substring(3);
            } else {
                str8 = str11.substring(10);
            }
            if (str8.endsWith("/")) {
                str8 = str8.substring(0, str8.length() - 1);
            }
            try {
                str8 = URLDecoder.decode(str8, C2793C.UTF8_NAME);
            } catch (Exception unused5) {
            }
            boolean z3 = false;
            for (int i = 0; i < this.f20548a.f17971bz.length; i++) {
                if (this.f20548a.f17971bz[i].f18316i.equalsIgnoreCase(str8)) {
                    startActivityForResult(this.f20548a.mo20762a(Integer.valueOf(i), this.f20558ap.getContext()).f18226a, 0);
                    z3 = true;
                }
            }
            if (!z3) {
                this.f20569f = false;
            }
            z2 = z3;
        } else if (lowerCase.startsWith("vnd.youtube:")) {
            int indexOf6 = str11.indexOf("?");
            if (indexOf6 > 0) {
                str10 = str11.substring(12, indexOf6);
            } else {
                str10 = str11.substring(12);
            }
            StringBuilder sb3 = new StringBuilder();
            sb3.append("http://www.youtube.com/watch?v=");
            sb3.append(str10);
            String sb4 = sb3.toString();
            if (this.f20568e) {
                mo567a(new Intent("android.intent.action.VIEW", Uri.parse(sb4)));
            } else {
                this.f20569f = false;
                Intent intent3 = new Intent(this.f20558ap.getContext(), t_url.class);
                intent3.putExtra("url", sb4);
                startActivityForResult(intent3, 0);
            }
        } else if (lowerCase.endsWith(DefaultHlsExtractorFactory.MP3_FILE_EXTENSION)) {
            Intent intent4 = new Intent("android.intent.action.VIEW");
            intent4.setDataAndType(Uri.parse(str), "audio/*");
            mo567a(intent4);
        } else if (lowerCase.endsWith(".mp4") || lowerCase.endsWith(".3gp")) {
            Intent intent5 = new Intent("android.intent.action.VIEW");
            intent5.setDataAndType(Uri.parse(str), "video/*");
            mo567a(intent5);
        } else if (this.f20568e || lowerCase.startsWith("rtsp://") || lowerCase.startsWith("rtmp://") || lowerCase.startsWith("market://") || lowerCase.endsWith(".apk") || lowerCase.startsWith("whatsapp://") || lowerCase.endsWith(".m3u") || lowerCase.endsWith(".m3u8")) {
            try {
                mo567a(new Intent("android.intent.action.VIEW", Uri.parse(str)));
            } catch (Exception unused6) {
            }
        } else if (!Arrays.asList(strArr).contains(replace) || lowerCase.contains("docs.google.com")) {
            this.f20569f = false;
            z2 = false;
        } else if (!z || !this.f20558ap.getUrl().contains("docs.google.com")) {
            try {
                str9 = URLEncoder.encode(str11, AudienceNetworkActivity.WEBVIEW_ENCODING);
            } catch (Exception unused7) {
                str9 = str11;
            }
            StringBuilder sb5 = new StringBuilder();
            sb5.append("http://docs.google.com/viewer?embedded=true&url=");
            sb5.append(str9);
            String sb6 = sb5.toString();
            if (z) {
                this.f20558ap.loadUrl(sb6);
            } else {
                Intent intent6 = new Intent(this.f20558ap.getContext(), t_url.class);
                intent6.putExtra("url", sb6);
                startActivityForResult(intent6, 0);
            }
            this.f20569f = false;
        } else {
            mo567a(new Intent("android.intent.action.VIEW", Uri.parse(str)));
        }
        if (!z && !z2) {
            Intent intent7 = new Intent(this.f20558ap.getContext(), t_url.class);
            intent7.putExtra("url", str11);
            startActivityForResult(intent7, 0);
        }
        return z2;
    }

    /* renamed from: a */
    public void mo22198a(String str, long j) {
        String str2 = str;
        long j2 = j;
        this.f20562at = j2;
        if (this.f20557ao != null) {
            this.f20569f = true;
            this.f20570g = true;
            if (!str2.equals("")) {
                this.f20560ar.setVisibility(8);
                this.f20558ap.loadUrl(str2);
                this.f20561as.setVisibility(0);
                return;
            }
            this.f20561as.setVisibility(8);
            SQLiteDatabase readableDatabase = new C5665k(mo626m()).getReadableDatabase();
            if (readableDatabase != null) {
                String[] strArr = this.f20563au;
                StringBuilder sb = new StringBuilder();
                sb.append("_id=");
                sb.append(j2);
                Cursor query = readableDatabase.query("productos", strArr, sb.toString(), null, null, null, "_id", "1");
                if (!query.moveToFirst()) {
                    query.close();
                } else if (query.getInt(query.getColumnIndex("det_cargado")) == 1) {
                    m24712a(query);
                    query.close();
                } else {
                    query.close();
                    if (!(this.f20556an == null || this.f20556an.getStatus() == Status.FINISHED)) {
                        this.f20556an.cancel(true);
                    }
                    this.f20556an = new C6186a();
                    this.f20556an.execute(new String[0]);
                }
            }
            readableDatabase.close();
            this.f20560ar.setVisibility(0);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m24712a(Cursor cursor) {
        ProgressBar progressBar;
        double d;
        boolean z;
        String str;
        Date date;
        boolean z2;
        String str2;
        this.f20550ah = cursor.getString(cursor.getColumnIndex("ref"));
        TextView textView = (TextView) this.f20560ar.findViewById(R.id.tv_det_ref);
        textView.setVisibility(8);
        if (!this.f20550ah.equals("")) {
            textView.setText(this.f20550ah);
            if (!this.f20548a.f17953bh.equals("")) {
                StringBuilder sb = new StringBuilder();
                sb.append("#");
                sb.append(this.f20548a.f17953bh);
                textView.setTextColor(Color.parseColor(sb.toString()));
            }
            textView.setVisibility(0);
        }
        this.f20549ag = cursor.getString(cursor.getColumnIndex("titulo"));
        TextView textView2 = (TextView) this.f20560ar.findViewById(R.id.tv_det_tit);
        textView2.setText(this.f20549ag);
        if (!this.f20548a.f17961bp.equals("")) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("#");
            sb2.append(this.f20548a.f17961bp);
            textView2.setTextColor(Color.parseColor(sb2.toString()));
        }
        TextView textView3 = (TextView) this.f20560ar.findViewById(R.id.tv_det_antig);
        textView3.setVisibility(8);
        int i = cursor.getInt(cursor.getColumnIndex("anyo"));
        if (i != 0) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(i);
            sb3.append("");
            String sb4 = sb3.toString();
            int i2 = cursor.getInt(cursor.getColumnIndex("mes"));
            StringBuilder sb5 = new StringBuilder();
            sb5.append(i2);
            sb5.append("");
            String sb6 = sb5.toString();
            if (sb6.equals("0")) {
                sb6 = "1";
            }
            int i3 = cursor.getInt(cursor.getColumnIndex("dia"));
            StringBuilder sb7 = new StringBuilder();
            sb7.append(i3);
            sb7.append("");
            String sb8 = sb7.toString();
            if (sb8.equals("0")) {
                sb8 = "1";
            }
            try {
                DateFormat dateInstance = DateFormat.getDateInstance(3, Locale.US);
                StringBuilder sb9 = new StringBuilder();
                sb9.append(sb6);
                sb9.append("/");
                sb9.append(sb8);
                sb9.append("/");
                sb9.append(sb4);
                date = dateInstance.parse(sb9.toString());
                z2 = true;
            } catch (Exception unused) {
                z2 = false;
                date = null;
            }
            if (z2) {
                if (i2 == 0) {
                    StringBuilder sb10 = new StringBuilder();
                    sb10.append(i);
                    sb10.append("");
                    str2 = sb10.toString();
                } else if (i3 == 0) {
                    String format = String.format(Locale.getDefault(), "%tB", new Object[]{date});
                    StringBuilder sb11 = new StringBuilder();
                    sb11.append(format.substring(0, 1).toUpperCase());
                    sb11.append(format.substring(1));
                    String sb12 = sb11.toString();
                    StringBuilder sb13 = new StringBuilder();
                    sb13.append(sb12);
                    sb13.append(", ");
                    sb13.append(i);
                    str2 = sb13.toString();
                } else {
                    str2 = DateFormat.getDateInstance().format(date);
                }
                textView3.setText(str2);
                if (!this.f20548a.f17963br.equals("")) {
                    StringBuilder sb14 = new StringBuilder();
                    sb14.append("#");
                    sb14.append(this.f20548a.f17963br);
                    textView3.setTextColor(Color.parseColor(sb14.toString()));
                }
                textView3.setVisibility(0);
            }
        }
        TextView textView4 = (TextView) this.f20560ar.findViewById(R.id.tv_det_descr);
        if (!this.f20548a.f17953bh.equals("")) {
            StringBuilder sb15 = new StringBuilder();
            sb15.append("#");
            sb15.append(this.f20548a.f17953bh);
            textView4.setTextColor(Color.parseColor(sb15.toString()));
        }
        if (VERSION.SDK_INT >= 17 && mo628n().getBoolean(R.bool.es_rtl)) {
            textView4.setTextDirection(4);
        }
        m24713a(textView4, cursor.getString(cursor.getColumnIndex("descr")), true);
        String str3 = "";
        TextView textView5 = (TextView) this.f20560ar.findViewById(R.id.tv_det_precio);
        textView5.setVisibility(8);
        if (!cursor.isNull(cursor.getColumnIndex("precio"))) {
            try {
                d = cursor.getDouble(cursor.getColumnIndex("precio"));
                z = true;
            } catch (Exception unused2) {
                z = false;
                d = 0.0d;
            }
            if (z) {
                if (d > 0.0d) {
                    DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols();
                    decimalFormatSymbols.setDecimalSeparator('.');
                    DecimalFormat decimalFormat = new DecimalFormat();
                    decimalFormat.setGroupingUsed(false);
                    decimalFormat.setMinimumFractionDigits(2);
                    decimalFormat.setMaximumFractionDigits(2);
                    decimalFormat.setDecimalFormatSymbols(decimalFormatSymbols);
                    str3 = decimalFormat.format(d);
                }
                DecimalFormat decimalFormat2 = new DecimalFormat();
                decimalFormat2.setCurrency(Currency.getInstance(Locale.getDefault()));
                String format2 = decimalFormat2.format(d);
                if (format2.length() > 1) {
                    String substring = format2.substring(format2.length() - 2, format2.length() - 1);
                    if (substring.equals(",") || substring.equals(".")) {
                        StringBuilder sb16 = new StringBuilder();
                        sb16.append(format2);
                        sb16.append("0");
                        format2 = sb16.toString();
                    }
                }
                if (this.f20548a.f17919az.equals("")) {
                    StringBuilder sb17 = new StringBuilder();
                    sb17.append(format2);
                    sb17.append(".");
                    str = sb17.toString();
                } else {
                    StringBuilder sb18 = new StringBuilder();
                    sb18.append(format2);
                    StringBuilder sb19 = new StringBuilder();
                    sb19.append("&nbsp;");
                    sb19.append(this.f20548a.f17919az);
                    sb18.append(Html.fromHtml(sb19.toString()));
                    str = sb18.toString();
                }
                StringBuilder sb20 = new StringBuilder();
                sb20.append(str);
                sb20.append(" ");
                sb20.append(cursor.getString(cursor.getColumnIndex("precio_descr")));
                textView5.setText(Html.fromHtml(sb20.toString().trim()));
                if (!this.f20548a.f17962bq.equals("")) {
                    StringBuilder sb21 = new StringBuilder();
                    sb21.append("#");
                    sb21.append(this.f20548a.f17962bq);
                    textView5.setTextColor(Color.parseColor(sb21.toString()));
                    Drawable drawable = mo628n().getDrawable(R.drawable.precio);
                    StringBuilder sb22 = new StringBuilder();
                    sb22.append("#");
                    sb22.append(this.f20548a.f17962bq);
                    drawable.setColorFilter(Color.parseColor(sb22.toString()), Mode.MULTIPLY);
                }
                textView5.setVisibility(0);
            }
        }
        this.f20551ai = "";
        if (this.f20548a.f17871aD.equals("") || this.f20548a.f17872aE.equals("")) {
            this.f20551ai = cursor.getString(cursor.getColumnIndex("url_compra"));
        } else if (!str3.equals("")) {
            this.f20571h = true;
            String str4 = this.f20548a.f17871aD;
            try {
                str4 = URLEncoder.encode(this.f20548a.f17871aD, AudienceNetworkActivity.WEBVIEW_ENCODING);
            } catch (Exception unused3) {
            }
            String str5 = this.f20549ag;
            try {
                str5 = URLEncoder.encode(this.f20549ag, AudienceNetworkActivity.WEBVIEW_ENCODING);
            } catch (Exception unused4) {
            }
            String str6 = this.f20550ah;
            try {
                str6 = URLEncoder.encode(this.f20550ah, AudienceNetworkActivity.WEBVIEW_ENCODING);
            } catch (Exception unused5) {
            }
            StringBuilder sb23 = new StringBuilder();
            sb23.append("https://www.paypal.com/cgi-bin/webscr/?rm=2&cmd=_xclick&business=");
            sb23.append(str4);
            sb23.append("&item_name=");
            sb23.append(str5.substring(0, Math.min(str5.length(), 127)));
            sb23.append("&item_number=");
            sb23.append(str6.substring(0, Math.min(str6.length(), 127)));
            sb23.append("&amount=");
            sb23.append(str3);
            sb23.append("&no_shipping=0&no_note=1&currency_code=");
            sb23.append(this.f20548a.f17872aE);
            sb23.append("&bn=PP-BuyNowBF");
            this.f20551ai = sb23.toString();
            if (!this.f20568e && VERSION.SDK_INT >= 15) {
                String str7 = "http://CLOSETHIS";
                try {
                    str7 = URLEncoder.encode(str7, AudienceNetworkActivity.WEBVIEW_ENCODING);
                } catch (Exception unused6) {
                }
                StringBuilder sb24 = new StringBuilder();
                sb24.append(this.f20551ai);
                sb24.append("&return=");
                sb24.append(str7);
                sb24.append("&cancel_return=");
                sb24.append(str7);
                this.f20551ai = sb24.toString();
            }
        }
        TextView textView6 = (TextView) this.f20560ar.findViewById(R.id.btn_det_comprar);
        textView6.setVisibility(8);
        if (!this.f20551ai.equals("")) {
            if (!this.f20548a.f17955bj.equals("")) {
                StringBuilder sb25 = new StringBuilder();
                sb25.append("#");
                sb25.append(this.f20548a.f17955bj);
                textView6.setBackgroundColor(Color.parseColor(sb25.toString()));
                StringBuilder sb26 = new StringBuilder();
                sb26.append("#");
                sb26.append(this.f20548a.f17955bj);
                if (config.m23844a(sb26.toString())) {
                    textView6.setTextColor(-16777216);
                }
            }
            if (!this.f20548a.f17870aC.equals("")) {
                textView6.setText(this.f20548a.f17870aC);
            }
            textView6.setOnClickListener(this);
            textView6.setVisibility(0);
        }
        TextView textView7 = (TextView) this.f20560ar.findViewById(R.id.btn_det_masinfo);
        textView7.setVisibility(8);
        if (this.f20548a.f17921bB.length > 0 && this.f20548a.f17915av) {
            if (!this.f20548a.f17955bj.equals("")) {
                StringBuilder sb27 = new StringBuilder();
                sb27.append("#");
                sb27.append(this.f20548a.f17955bj);
                textView7.setBackgroundColor(Color.parseColor(sb27.toString()));
                StringBuilder sb28 = new StringBuilder();
                sb28.append("#");
                sb28.append(this.f20548a.f17955bj);
                if (config.m23844a(sb28.toString())) {
                    textView7.setTextColor(-16777216);
                }
            }
            if (!this.f20548a.f17869aB.equals("")) {
                textView7.setText(this.f20548a.f17869aB);
            }
            textView7.setOnClickListener(this);
            textView7.setVisibility(0);
        }
        ((LinearLayout) this.f20560ar.findViewById(R.id.ll_det_imgs)).removeAllViews();
        SQLiteDatabase readableDatabase = new C5665k(mo626m()).getReadableDatabase();
        StringBuilder sb29 = new StringBuilder();
        sb29.append("SELECT img1_id AS id FROM productos WHERE (_id=");
        sb29.append(this.f20562at);
        sb29.append(") AND img1_id>0 UNION SELECT _id AS id FROM fotos WHERE (idprod=");
        sb29.append(this.f20562at);
        sb29.append(")");
        Cursor rawQuery = readableDatabase.rawQuery(sb29.toString(), null);
        LayoutParams layoutParams = new LayoutParams(-2, -2);
        LinearLayout linearLayout = (LinearLayout) this.f20560ar.findViewById(R.id.ll_det_imgs);
        for (int i4 = 0; i4 < rawQuery.getCount(); i4++) {
            ImageSwitcher imageSwitcher = new ImageSwitcher(mo626m());
            imageSwitcher.setLayoutParams(layoutParams);
            imageSwitcher.getLayoutParams().width = this.f20566c;
            imageSwitcher.getLayoutParams().height = this.f20566c;
            if (this.f20564av) {
                progressBar = new ProgressBar(mo626m(), null, 16843399);
            } else {
                progressBar = new ProgressBar(mo626m(), null, 16842871);
            }
            if (VERSION.SDK_INT > 20) {
                config.m23838a(progressBar, this.f20548a.f17890aW);
            }
            progressBar.setLayoutParams(layoutParams);
            int i5 = (int) ((20.0f * this.f20567d) + 0.5f);
            progressBar.setPadding(i5, i5, i5, i5);
            imageSwitcher.addView(progressBar);
            linearLayout.addView(imageSwitcher);
            linearLayout.setVisibility(0);
        }
        if (!cursor.isNull(cursor.getColumnIndex("img1_p"))) {
            mo22199a(cursor.getBlob(cursor.getColumnIndex("img1_p")), cursor.getInt(cursor.getColumnIndex("img1_id")), "");
        }
        StringBuilder sb30 = new StringBuilder();
        sb30.append("SELECT _id,img_p FROM fotos WHERE (idprod=");
        sb30.append(this.f20562at);
        sb30.append(") AND (img_p IS NOT NULL) ORDER BY orden");
        Cursor rawQuery2 = readableDatabase.rawQuery(sb30.toString(), null);
        if (rawQuery2.moveToFirst()) {
            while (!rawQuery2.isAfterLast()) {
                mo22199a(rawQuery2.getBlob(rawQuery2.getColumnIndex("img_p")), rawQuery2.getInt(rawQuery2.getColumnIndex("_id")), "");
                rawQuery2.moveToNext();
            }
        }
        rawQuery2.close();
        readableDatabase.close();
        if (!(this.f20554al == null || this.f20554al.getStatus() == Status.FINISHED)) {
            this.f20554al.cancel(true);
        }
        this.f20554al = new C6188c(0);
        this.f20554al.execute(new String[0]);
    }

    /* renamed from: d */
    public void mo598d(Bundle bundle) {
        super.mo598d(bundle);
        if (!this.f20548a.f17964bs.equals("")) {
            View y = mo645y();
            StringBuilder sb = new StringBuilder();
            sb.append("#");
            sb.append(this.f20548a.f17964bs);
            y.setBackgroundColor(Color.parseColor(sb.toString()));
        }
        if (bundle != null) {
            this.f20558ap.restoreState(bundle);
        }
    }

    public void onClick(View view) {
        if (view.getId() == R.id.btn_det_comprar) {
            if (this.f20568e) {
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(Uri.parse(this.f20551ai));
                mo567a(intent);
                return;
            }
            Intent intent2 = new Intent(mo626m(), t_url.class);
            intent2.putExtra("url", this.f20551ai);
            if (this.f20571h) {
                intent2.putExtra("linksexternos", false);
                intent2.putExtra("adaptar_ancho", false);
            } else {
                intent2.putExtra("linksexternos", this.f20548a.f17917ax);
                intent2.putExtra("adaptar_ancho", this.f20548a.f17916aw);
            }
            startActivityForResult(intent2, 0);
        } else if (view.getId() == R.id.btn_det_masinfo) {
            Intent intent3 = this.f20548a.mo20785d((Context) mo626m()).f18226a;
            String str = this.f20549ag;
            if (!this.f20550ah.equals("")) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append("(Ref.");
                sb.append(this.f20550ah);
                sb.append(")");
                str = sb.toString();
            }
            intent3.putExtra("msg_predefinido", str);
            startActivityForResult(intent3, 0);
        } else if (view.getTag(R.id.TAG_IDFOTO) != null) {
            if (!(this.f20555am == null || this.f20555am.getStatus() == Status.FINISHED)) {
                try {
                    this.f20555am.f20587e.setVisibility(8);
                } catch (Exception unused) {
                }
                this.f20555am.cancel(true);
            }
            this.f20555am = new C6187b((ImageView) view);
            this.f20555am.execute(new String[0]);
        }
    }

    /* renamed from: a */
    public void mo559a(int i, int i2, Intent intent) {
        if (i == 0 && i2 == -1 && intent != null && intent.hasExtra("finalizar") && intent.getExtras().getBoolean("finalizar")) {
            mo626m().setResult(-1, intent);
            mo626m().finish();
        }
    }

    /* renamed from: a */
    public boolean mo22200a(int i, KeyEvent keyEvent) {
        if (this.f20561as.getVisibility() != 0 || this.f20569f || i != 4 || !this.f20558ap.canGoBack()) {
            return false;
        }
        this.f20558ap.goBack();
        return true;
    }

    /* renamed from: e */
    public void mo603e(Bundle bundle) {
        super.mo603e(bundle);
        this.f20558ap.saveState(bundle);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo22199a(byte[] bArr, int i, String str) {
        ProgressBar progressBar;
        RelativeLayout relativeLayout = new RelativeLayout(mo626m());
        ImageView imageView = new ImageView(mo626m());
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
        imageView.setImageDrawable(new BitmapDrawable(mo628n(), decodeByteArray));
        imageView.setTag(R.id.TAG_IDFOTO, Integer.valueOf(i));
        imageView.setOnClickListener(this);
        imageView.setAdjustViewBounds(true);
        LayoutParams layoutParams = new LayoutParams(-2, -2);
        layoutParams.addRule(13);
        imageView.setLayoutParams(layoutParams);
        imageView.getLayoutParams().width = this.f20566c;
        int height = (decodeByteArray.getHeight() * this.f20566c) / decodeByteArray.getWidth();
        imageView.getLayoutParams().height = height;
        imageView.setPadding(0, (int) ((this.f20567d * 4.0f) + 0.5f), 0, (int) ((4.0f * this.f20567d) + 0.5f));
        relativeLayout.addView(imageView);
        if (this.f20564av) {
            progressBar = new ProgressBar(mo626m(), null, 16843399);
        } else {
            progressBar = new ProgressBar(mo626m(), null, 16842871);
        }
        if (VERSION.SDK_INT > 20) {
            config.m23838a(progressBar, this.f20548a.f17890aW);
        }
        progressBar.setVisibility(8);
        progressBar.setLayoutParams(layoutParams);
        relativeLayout.addView(progressBar);
        LinearLayout linearLayout = (LinearLayout) this.f20560ar.findViewById(R.id.ll_det_imgs);
        for (int i2 = 0; i2 < linearLayout.getChildCount(); i2++) {
            ImageSwitcher imageSwitcher = (ImageSwitcher) linearLayout.getChildAt(i2);
            if (imageSwitcher.getChildCount() == 1) {
                imageSwitcher.getLayoutParams().height = height;
                imageSwitcher.addView(relativeLayout);
                imageSwitcher.showNext();
                return;
            }
        }
    }

    /* renamed from: a */
    private void m24713a(TextView textView, String str, boolean z) {
        int i;
        int i2;
        if (z) {
            if (str.toUpperCase().indexOf("<BR") == -1) {
                str = str.replace("\n", "<br>");
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(Html.fromHtml(str.replace("<a href", "@AHREF_INI@").replace("<A HREF", "@AHREF_INI@").replace("</a>", "@AHREF_FIN@").replace("</A>", "@AHREF_FIN@").replace("</ a>", "@AHREF_FIN@").replace("</ A>", "@AHREF_FIN@")));
            String spannableStringBuilder2 = spannableStringBuilder.toString();
            int indexOf = spannableStringBuilder2.indexOf("@AHREF_INI@");
            while (indexOf != -1) {
                spannableStringBuilder.replace(indexOf, indexOf + 11, "<a href");
                spannableStringBuilder2 = spannableStringBuilder.toString();
                indexOf = spannableStringBuilder2.indexOf("@AHREF_INI@");
            }
            for (int indexOf2 = spannableStringBuilder2.indexOf("@AHREF_FIN@"); indexOf2 != -1; indexOf2 = spannableStringBuilder.toString().indexOf("@AHREF_FIN@")) {
                spannableStringBuilder.replace(indexOf2, indexOf2 + 11, "</a>");
            }
            String spannableStringBuilder3 = spannableStringBuilder.toString();
            String upperCase = spannableStringBuilder3.toUpperCase();
            for (int indexOf3 = upperCase.indexOf("<A HREF="); indexOf3 != -1; indexOf3 = upperCase.indexOf("<A HREF=", i)) {
                i = indexOf3 + 8;
                int i3 = i + 1;
                String substring = spannableStringBuilder3.substring(i, i3);
                if (substring.equals("\"") || substring.equals("'")) {
                    i = i3;
                }
                if (substring.equals("\"")) {
                    i2 = spannableStringBuilder3.indexOf("\"", i);
                } else if (substring.equals("'")) {
                    i2 = spannableStringBuilder3.indexOf("'", i);
                } else {
                    i2 = spannableStringBuilder3.indexOf(">", i);
                }
                if (i2 != -1) {
                    this.f20552aj = spannableStringBuilder3.substring(i, i2).trim();
                    i2 = spannableStringBuilder3.indexOf(">", i2);
                    if (i2 != -1) {
                        int indexOf4 = upperCase.indexOf("</A>", i2);
                        int i4 = Integer.MAX_VALUE;
                        if (indexOf4 == -1) {
                            indexOf4 = Integer.MAX_VALUE;
                        }
                        int indexOf5 = upperCase.indexOf("</ A>", i2);
                        if (indexOf5 != -1) {
                            i4 = indexOf5;
                        }
                        if (indexOf4 == -1 && i4 == -1) {
                            i = i2;
                        } else {
                            int min = Math.min(indexOf4, i4);
                            int indexOf6 = spannableStringBuilder3.indexOf(">", min);
                            spannableStringBuilder.setSpan(new ClickableSpan() {

                                /* renamed from: a */
                                String f20578a = t_detalle_fr.this.f20552aj;

                                public void onClick(View view) {
                                    t_detalle_fr.this.m24715a(this.f20578a, false);
                                }
                            }, i2, min, 33);
                            int i5 = indexOf6 + 1;
                            spannableStringBuilder.delete(min, i5);
                            int i6 = min - (i5 - min);
                            int i7 = i2 + 1;
                            spannableStringBuilder.delete(indexOf3, i7);
                            int i8 = i6 - (i7 - indexOf3);
                            String spannableStringBuilder4 = spannableStringBuilder.toString();
                            i = i2;
                            i2 = i8;
                            spannableStringBuilder3 = spannableStringBuilder4;
                            upperCase = spannableStringBuilder4.toUpperCase();
                        }
                    }
                }
                if (i2 != -1) {
                    i = i2;
                }
            }
            textView.setText(spannableStringBuilder);
            textView.setMovementMethod(LinkMovementMethod.getInstance());
        }
    }

    @TargetApi(21)
    /* renamed from: c */
    private void m24719c() {
        if (VERSION.SDK_INT > 20) {
            CookieManager.getInstance().setAcceptThirdPartyCookies(this.f20558ap, true);
        }
    }
}
