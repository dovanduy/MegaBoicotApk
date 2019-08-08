package mega.boicot;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
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
import android.net.Uri;
import android.os.AsyncTask;
import android.os.AsyncTask.Status;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.p017v4.app.C0294q;
import android.support.p017v4.app.C0297r.C0298a;
import android.support.p017v4.content.C0357d;
import android.support.p017v4.content.C0358e;
import android.support.p017v4.widget.C0660o;
import android.support.p017v4.widget.C0660o.C0662b;
import android.text.Html;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.util.Currency;
import java.util.Date;
import java.util.Locale;

public class t_buscador_fr extends C0294q implements C0298a<Cursor> {

    /* renamed from: ag */
    int f20230ag;

    /* renamed from: ah */
    int f20231ah;

    /* renamed from: ai */
    String f20232ai = "0";

    /* renamed from: aj */
    boolean f20233aj;

    /* renamed from: ak */
    boolean f20234ak;

    /* renamed from: al */
    boolean f20235al;

    /* renamed from: am */
    boolean f20236am;

    /* renamed from: an */
    config f20237an;

    /* renamed from: ao */
    SharedPreferences f20238ao;

    /* renamed from: ap */
    C6095b f20239ap;

    /* renamed from: aq */
    C6096c f20240aq;

    /* renamed from: ar */
    Bundle f20241ar;

    /* renamed from: as */
    GradientDrawable f20242as;

    /* renamed from: at */
    Drawable f20243at;

    /* renamed from: au */
    Drawable f20244au;

    /* renamed from: av */
    int f20245av = -1;

    /* renamed from: aw */
    View f20246aw;

    /* renamed from: ax */
    private C5745a f20247ax;

    /* renamed from: ay */
    private C0660o f20248ay;

    /* renamed from: i */
    int f20249i;

    /* renamed from: mega.boicot.t_buscador_fr$a */
    public interface C5745a {
        /* renamed from: a */
        void mo20994a(String str, long j);
    }

    /* renamed from: mega.boicot.t_buscador_fr$b */
    private class C6095b extends AsyncTask<String, Void, Byte> {

        /* renamed from: a */
        int f20251a;

        /* renamed from: b */
        String f20252b;

        public C6095b(int i) {
            this.f20251a = i;
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
            if (this.f20251a > 1 && t_buscador_fr.this.f20246aw != null) {
                t_buscador_fr.this.mo830c().addFooterView(t_buscador_fr.this.f20246aw);
            }
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Removed duplicated region for block: B:45:0x01ed  */
        /* JADX WARNING: Removed duplicated region for block: B:48:0x01f3  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Byte doInBackground(java.lang.String... r7) {
            /*
                r6 = this;
                java.lang.String r7 = ""
                mega.boicot.t_buscador_fr r0 = mega.boicot.t_buscador_fr.this
                android.os.Bundle r0 = r0.f20241ar
                java.lang.String r1 = "texto"
                java.lang.String r0 = r0.getString(r1)
                if (r0 == 0) goto L_0x0033
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0033 }
                r0.<init>()     // Catch:{ Exception -> 0x0033 }
                r0.append(r7)     // Catch:{ Exception -> 0x0033 }
                java.lang.String r1 = "&texto="
                r0.append(r1)     // Catch:{ Exception -> 0x0033 }
                mega.boicot.t_buscador_fr r1 = mega.boicot.t_buscador_fr.this     // Catch:{ Exception -> 0x0033 }
                android.os.Bundle r1 = r1.f20241ar     // Catch:{ Exception -> 0x0033 }
                java.lang.String r2 = "texto"
                java.lang.String r1 = r1.getString(r2)     // Catch:{ Exception -> 0x0033 }
                java.lang.String r2 = "UTF-8"
                java.lang.String r1 = java.net.URLEncoder.encode(r1, r2)     // Catch:{ Exception -> 0x0033 }
                r0.append(r1)     // Catch:{ Exception -> 0x0033 }
                java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0033 }
                r7 = r0
            L_0x0033:
                mega.boicot.t_buscador_fr r0 = mega.boicot.t_buscador_fr.this
                android.os.Bundle r0 = r0.f20241ar
                java.lang.String r1 = "idcat"
                r2 = 0
                int r0 = r0.getInt(r1, r2)
                if (r0 == 0) goto L_0x005e
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r7)
                java.lang.String r7 = "&idcat="
                r0.append(r7)
                mega.boicot.t_buscador_fr r7 = mega.boicot.t_buscador_fr.this
                android.os.Bundle r7 = r7.f20241ar
                java.lang.String r1 = "idcat"
                int r7 = r7.getInt(r1)
                r0.append(r7)
                java.lang.String r7 = r0.toString()
            L_0x005e:
                mega.boicot.t_buscador_fr r0 = mega.boicot.t_buscador_fr.this
                android.os.Bundle r0 = r0.f20241ar
                java.lang.String r1 = "precio"
                java.lang.String r0 = r0.getString(r1)
                if (r0 == 0) goto L_0x008f
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x008f }
                r0.<init>()     // Catch:{ Exception -> 0x008f }
                r0.append(r7)     // Catch:{ Exception -> 0x008f }
                java.lang.String r1 = "&precio="
                r0.append(r1)     // Catch:{ Exception -> 0x008f }
                mega.boicot.t_buscador_fr r1 = mega.boicot.t_buscador_fr.this     // Catch:{ Exception -> 0x008f }
                android.os.Bundle r1 = r1.f20241ar     // Catch:{ Exception -> 0x008f }
                java.lang.String r3 = "precio"
                java.lang.String r1 = r1.getString(r3)     // Catch:{ Exception -> 0x008f }
                java.lang.String r3 = "UTF-8"
                java.lang.String r1 = java.net.URLEncoder.encode(r1, r3)     // Catch:{ Exception -> 0x008f }
                r0.append(r1)     // Catch:{ Exception -> 0x008f }
                java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x008f }
                r7 = r0
            L_0x008f:
                mega.boicot.t_buscador_fr r0 = mega.boicot.t_buscador_fr.this
                android.os.Bundle r0 = r0.f20241ar
                java.lang.String r1 = "dia"
                int r0 = r0.getInt(r1, r2)
                if (r0 == 0) goto L_0x00f5
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r7)
                java.lang.String r7 = "&dia="
                r0.append(r7)
                mega.boicot.t_buscador_fr r7 = mega.boicot.t_buscador_fr.this
                android.os.Bundle r7 = r7.f20241ar
                java.lang.String r1 = "dia"
                int r7 = r7.getInt(r1)
                r0.append(r7)
                java.lang.String r7 = r0.toString()
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r7)
                java.lang.String r7 = "&mes="
                r0.append(r7)
                mega.boicot.t_buscador_fr r7 = mega.boicot.t_buscador_fr.this
                android.os.Bundle r7 = r7.f20241ar
                java.lang.String r1 = "mes"
                int r7 = r7.getInt(r1)
                r0.append(r7)
                java.lang.String r7 = r0.toString()
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r7)
                java.lang.String r7 = "&anyo="
                r0.append(r7)
                mega.boicot.t_buscador_fr r7 = mega.boicot.t_buscador_fr.this
                android.os.Bundle r7 = r7.f20241ar
                java.lang.String r1 = "anyo"
                int r7 = r7.getInt(r1)
                r0.append(r7)
                java.lang.String r7 = r0.toString()
            L_0x00f5:
                mega.boicot.t_buscador_fr r0 = mega.boicot.t_buscador_fr.this
                android.os.Bundle r0 = r0.f20241ar
                java.lang.String r1 = "orden"
                int r0 = r0.getInt(r1, r2)
                if (r0 == 0) goto L_0x013d
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r7)
                java.lang.String r7 = "&orden="
                r0.append(r7)
                mega.boicot.t_buscador_fr r7 = mega.boicot.t_buscador_fr.this
                android.os.Bundle r7 = r7.f20241ar
                java.lang.String r1 = "orden"
                int r7 = r7.getInt(r1)
                r0.append(r7)
                java.lang.String r7 = r0.toString()
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r7)
                java.lang.String r7 = "&orden_tipo="
                r0.append(r7)
                mega.boicot.t_buscador_fr r7 = mega.boicot.t_buscador_fr.this
                android.os.Bundle r7 = r7.f20241ar
                java.lang.String r1 = "orden_tipo"
                boolean r7 = r7.getBoolean(r1)
                r0.append(r7)
                java.lang.String r7 = r0.toString()
            L_0x013d:
                r0 = 0
                java.net.URL r1 = new java.net.URL     // Catch:{ Exception -> 0x01e6 }
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01e6 }
                r3.<init>()     // Catch:{ Exception -> 0x01e6 }
                java.lang.String r4 = "http://"
                r3.append(r4)     // Catch:{ Exception -> 0x01e6 }
                java.lang.String r4 = mega.boicot.config.f17839g     // Catch:{ Exception -> 0x01e6 }
                r3.append(r4)     // Catch:{ Exception -> 0x01e6 }
                java.lang.String r4 = "/srv/result.php?v=2&idapp="
                r3.append(r4)     // Catch:{ Exception -> 0x01e6 }
                r4 = 718963(0xaf873, float:1.007482E-39)
                r3.append(r4)     // Catch:{ Exception -> 0x01e6 }
                java.lang.String r4 = "&idusu="
                r3.append(r4)     // Catch:{ Exception -> 0x01e6 }
                mega.boicot.t_buscador_fr r4 = mega.boicot.t_buscador_fr.this     // Catch:{ Exception -> 0x01e6 }
                int r4 = r4.f20230ag     // Catch:{ Exception -> 0x01e6 }
                r3.append(r4)     // Catch:{ Exception -> 0x01e6 }
                java.lang.String r4 = "&fila="
                r3.append(r4)     // Catch:{ Exception -> 0x01e6 }
                int r4 = r6.f20251a     // Catch:{ Exception -> 0x01e6 }
                r3.append(r4)     // Catch:{ Exception -> 0x01e6 }
                r3.append(r7)     // Catch:{ Exception -> 0x01e6 }
                java.lang.String r7 = r3.toString()     // Catch:{ Exception -> 0x01e6 }
                r1.<init>(r7)     // Catch:{ Exception -> 0x01e6 }
                java.net.URLConnection r7 = r1.openConnection()     // Catch:{ Exception -> 0x01e6 }
                java.net.HttpURLConnection r7 = (java.net.HttpURLConnection) r7     // Catch:{ Exception -> 0x01e6 }
                r0 = 1
                r7.setDoInput(r0)     // Catch:{ Exception -> 0x01df, all -> 0x01dd }
                r0 = 10000(0x2710, float:1.4013E-41)
                r7.setConnectTimeout(r0)     // Catch:{ Exception -> 0x01df, all -> 0x01dd }
                r7.setReadTimeout(r0)     // Catch:{ Exception -> 0x01df, all -> 0x01dd }
                java.lang.String r0 = "User-Agent"
                java.lang.String r1 = "Android Vinebre Software"
                r7.setRequestProperty(r0, r1)     // Catch:{ Exception -> 0x01df, all -> 0x01dd }
                java.io.InputStream r0 = r7.getInputStream()     // Catch:{ Exception -> 0x01df, all -> 0x01dd }
                java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch:{ Exception -> 0x01df, all -> 0x01dd }
                java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x01df, all -> 0x01dd }
                r3.<init>(r0)     // Catch:{ Exception -> 0x01df, all -> 0x01dd }
                r1.<init>(r3)     // Catch:{ Exception -> 0x01df, all -> 0x01dd }
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01df, all -> 0x01dd }
                r0.<init>()     // Catch:{ Exception -> 0x01df, all -> 0x01dd }
            L_0x01a6:
                java.lang.String r3 = r1.readLine()     // Catch:{ Exception -> 0x01df, all -> 0x01dd }
                if (r3 == 0) goto L_0x01c1
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01df, all -> 0x01dd }
                r4.<init>()     // Catch:{ Exception -> 0x01df, all -> 0x01dd }
                r4.append(r3)     // Catch:{ Exception -> 0x01df, all -> 0x01dd }
                java.lang.String r3 = "\n"
                r4.append(r3)     // Catch:{ Exception -> 0x01df, all -> 0x01dd }
                java.lang.String r3 = r4.toString()     // Catch:{ Exception -> 0x01df, all -> 0x01dd }
                r0.append(r3)     // Catch:{ Exception -> 0x01df, all -> 0x01dd }
                goto L_0x01a6
            L_0x01c1:
                java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x01df, all -> 0x01dd }
                r6.f20252b = r0     // Catch:{ Exception -> 0x01df, all -> 0x01dd }
                java.lang.String r0 = r6.f20252b     // Catch:{ Exception -> 0x01df, all -> 0x01dd }
                java.lang.String r1 = "@EURO@"
                java.lang.String r3 = "€"
                java.lang.String r0 = r0.replace(r1, r3)     // Catch:{ Exception -> 0x01df, all -> 0x01dd }
                r6.f20252b = r0     // Catch:{ Exception -> 0x01df, all -> 0x01dd }
                if (r7 == 0) goto L_0x01d8
                r7.disconnect()
            L_0x01d8:
                java.lang.Byte r7 = java.lang.Byte.valueOf(r2)
                return r7
            L_0x01dd:
                r0 = move-exception
                goto L_0x01f1
            L_0x01df:
                r0 = r7
                goto L_0x01e6
            L_0x01e1:
                r7 = move-exception
                r5 = r0
                r0 = r7
                r7 = r5
                goto L_0x01f1
            L_0x01e6:
                r7 = -1
                java.lang.Byte r7 = java.lang.Byte.valueOf(r7)     // Catch:{ all -> 0x01e1 }
                if (r0 == 0) goto L_0x01f0
                r0.disconnect()
            L_0x01f0:
                return r7
            L_0x01f1:
                if (r7 == 0) goto L_0x01f6
                r7.disconnect()
            L_0x01f6:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: mega.boicot.t_buscador_fr.C6095b.doInBackground(java.lang.String[]):java.lang.Byte");
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void onPostExecute(Byte b) {
            if (t_buscador_fr.this.mo626m() != null) {
                t_buscador_fr.this.f20236am = false;
                t_buscador_fr.this.mo1036a(true);
                t_buscador_fr.this.mo830c().removeFooterView(t_buscador_fr.this.f20246aw);
                if (b.byteValue() == 0 && !this.f20252b.contains("ANDROID:ERROR")) {
                    if (this.f20252b.contains("ANDROID:VACIO")) {
                        t_buscador_fr.this.mo1035a((CharSequence) t_buscador_fr.this.mo628n().getString(R.string.sin_resultados));
                        return;
                    }
                    String[] split = this.f20252b.split(";");
                    for (int i = 0; i < split.length; i++) {
                        if (split[i].trim().equals("SIHAYFOTOS")) {
                            t_buscador_fr.this.f20235al = true;
                        } else if (split[i].trim().equals("NOHAYFOTOS")) {
                            t_buscador_fr.this.f20235al = false;
                        } else if (split[i].trim().equals("FIN")) {
                            t_buscador_fr.this.f20234ak = true;
                        } else if (!split[i].trim().equals("")) {
                            t_buscador_fr.this.f20249i++;
                            String[] split2 = split[i].split(",");
                            ContentValues contentValues = new ContentValues();
                            contentValues.put("_id", split2[0].trim());
                            contentValues.put("ref", "");
                            contentValues.put("titulo", split2[1].trim());
                            contentValues.put("descr", "");
                            contentValues.put("idcat", "0");
                            contentValues.put("precio_descr", "");
                            contentValues.put("url_detalle", split2[4].trim());
                            contentValues.put("url_compra", "");
                            contentValues.put("img1_id", split2[2].trim());
                            String trim = split2[3].trim();
                            if (trim.equals("0")) {
                                contentValues.put("img1_url", "");
                            } else {
                                contentValues.put("img1_url", trim);
                            }
                            contentValues.put("det_cargado", Integer.valueOf(0));
                            String trim2 = split2[5].trim();
                            if (!trim2.equals("-1")) {
                                contentValues.put("precio", trim2);
                            }
                            contentValues.put("anyo", split2[6].trim());
                            contentValues.put("mes", split2[7].trim());
                            contentValues.put("dia", split2[8].trim());
                            t_buscador_fr.this.mo626m().getContentResolver().insert(bd_provider.f19599a, contentValues);
                            t_buscador_fr.this.f20231ah++;
                        }
                    }
                    if (t_buscador_fr.this.f20240aq == null || t_buscador_fr.this.f20240aq.getStatus() != Status.RUNNING) {
                        t_buscador_fr.this.f20240aq = new C6096c();
                        t_buscador_fr.this.f20240aq.execute(new String[0]);
                    }
                }
            }
        }
    }

    /* renamed from: mega.boicot.t_buscador_fr$c */
    private class C6096c extends AsyncTask<String, Void, Byte> {

        /* renamed from: a */
        byte[] f20254a;

        /* renamed from: b */
        String f20255b;

        /* access modifiers changed from: protected */
        public void onPreExecute() {
        }

        private C6096c() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Byte doInBackground(String... strArr) {
            int i;
            if (t_buscador_fr.this.mo626m() == null) {
                return Byte.valueOf(-1);
            }
            this.f20255b = "0";
            String str = "";
            SQLiteDatabase readableDatabase = new C5665k(t_buscador_fr.this.mo626m()).getReadableDatabase();
            if (readableDatabase != null) {
                String[] strArr2 = {"_id", "img1_id", "img1_url"};
                StringBuilder sb = new StringBuilder();
                sb.append("(img1_id NOT IN (");
                sb.append(t_buscador_fr.this.f20232ai);
                sb.append(")) AND (img1_p IS NULL)");
                Cursor query = readableDatabase.query("productos", strArr2, sb.toString(), null, null, null, "_id", "1");
                if (query.moveToFirst()) {
                    this.f20255b = query.getString(query.getColumnIndex("img1_id"));
                    StringBuilder sb2 = new StringBuilder();
                    t_buscador_fr t_buscador_fr = t_buscador_fr.this;
                    sb2.append(t_buscador_fr.f20232ai);
                    sb2.append(",");
                    sb2.append(this.f20255b);
                    t_buscador_fr.f20232ai = sb2.toString();
                    int i2 = query.getInt(query.getColumnIndex("_id"));
                    i = i2;
                    str = query.getString(query.getColumnIndex("img1_url"));
                } else {
                    i = 0;
                }
                query.close();
            } else {
                i = 0;
            }
            readableDatabase.close();
            if (this.f20255b.equals("0")) {
                return Byte.valueOf(1);
            }
            if (str.equals("")) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("http://");
                sb3.append(config.f17839g);
                sb3.append("/srv/imgs/prods/");
                sb3.append(this.f20255b);
                sb3.append("_");
                sb3.append(i);
                sb3.append("_p.png");
                str = sb3.toString();
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
                    config config = t_buscador_fr.this.f20237an;
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
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        decodeStream.compress(CompressFormat.JPEG, 100, byteArrayOutputStream);
                        this.f20254a = byteArrayOutputStream.toByteArray();
                        try {
                            byteArrayOutputStream.close();
                        } catch (IOException unused) {
                        }
                        return Byte.valueOf(0);
                    } catch (Exception unused2) {
                        return Byte.valueOf(-1);
                    }
                } catch (IOException unused3) {
                    return Byte.valueOf(-1);
                }
            } catch (MalformedURLException unused4) {
                return Byte.valueOf(-1);
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void onPostExecute(Byte b) {
            if (t_buscador_fr.this.mo626m() != null) {
                if (b.byteValue() == 0) {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("img1_p", this.f20254a);
                    ContentResolver contentResolver = t_buscador_fr.this.mo626m().getContentResolver();
                    Uri uri = bd_provider.f19599a;
                    StringBuilder sb = new StringBuilder();
                    sb.append("img1_id='");
                    sb.append(this.f20255b);
                    sb.append("'");
                    contentResolver.update(uri, contentValues, sb.toString(), null);
                }
                if (b.byteValue() != 1) {
                    t_buscador_fr.this.f20240aq = new C6096c();
                    t_buscador_fr.this.f20240aq.execute(new String[0]);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo1034a(ListView listView, View view, int i, long j) {
        if (!this.f20237an.f17964bs.equals("")) {
            int i2 = this.f20245av;
            this.f20245av = i;
            this.f20248ay.notifyDataSetChanged();
        }
        Cursor query = mo626m().getContentResolver().query(Uri.withAppendedPath(bd_provider.f19599a, String.valueOf(j)), new String[]{"url_detalle"}, null, null, null);
        if (query.moveToFirst()) {
            this.f20247ax.mo20994a(query.getString(0), j);
        }
        query.close();
    }

    @TargetApi(13)
    /* renamed from: a */
    public void mo571a(Bundle bundle) {
        int i;
        super.mo571a(bundle);
        this.f20237an = (config) mo626m().getApplicationContext();
        if (this.f20237an.f17881aN == null) {
            this.f20237an.mo20780b();
        }
        String[] strArr = {"titulo", "img1_p", "precio", "anyo", "dia"};
        int[] iArr = {R.id.title, R.id.iv_item, R.id.precio, R.id.antiguedad, R.id.tv_aux};
        this.f20238ao = mo626m().getSharedPreferences("sh", 0);
        this.f20230ag = this.f20238ao.getInt("idusu", 0);
        this.f20241ar = mo626m().getIntent().getExtras();
        this.f20233aj = false;
        Display defaultDisplay = mo626m().getWindowManager().getDefaultDisplay();
        if (VERSION.SDK_INT >= 13) {
            Point point = new Point();
            defaultDisplay.getSize(point);
            i = point.x;
        } else {
            i = defaultDisplay.getWidth();
        }
        if (i > ((int) ((500.0f * mo628n().getDisplayMetrics().density) + 0.5f))) {
            this.f20233aj = true;
        }
        this.f20243at = mo628n().getDrawable(R.drawable.item_sel);
        Drawable drawable = this.f20243at;
        StringBuilder sb = new StringBuilder();
        sb.append("#");
        sb.append(this.f20237an.f17964bs);
        drawable.setColorFilter(Color.parseColor(sb.toString()), Mode.MULTIPLY);
        if (!this.f20237an.f17962bq.equals("")) {
            this.f20244au = mo628n().getDrawable(R.drawable.precio);
            Drawable drawable2 = this.f20244au;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("#");
            sb2.append(this.f20237an.f17962bq);
            drawable2.setColorFilter(Color.parseColor(sb2.toString()), Mode.MULTIPLY);
        }
        if (bundle == null) {
            this.f20234ak = false;
            this.f20236am = true;
            this.f20231ah = 0;
            SQLiteDatabase writableDatabase = new C5665k(mo626m()).getWritableDatabase();
            if (writableDatabase != null) {
                writableDatabase.execSQL("DELETE FROM productos");
                writableDatabase.execSQL("DELETE FROM fotos");
            }
            writableDatabase.close();
        } else {
            this.f20235al = bundle.getBoolean("hayfotos", true);
            this.f20236am = bundle.getBoolean("mostrar_loader", false);
            this.f20234ak = bundle.getBoolean("fin", false);
            this.f20231ah = bundle.getInt("ncargados", 0);
        }
        if (!this.f20237an.f17959bn.equals("") && !this.f20237an.f17960bo.equals("")) {
            Orientation orientation = Orientation.TOP_BOTTOM;
            StringBuilder sb3 = new StringBuilder();
            sb3.append("#");
            sb3.append(this.f20237an.f17959bn);
            StringBuilder sb4 = new StringBuilder();
            sb4.append("#");
            sb4.append(this.f20237an.f17960bo);
            this.f20242as = new GradientDrawable(orientation, new int[]{Color.parseColor(sb3.toString()), Color.parseColor(sb4.toString())});
        }
        mo644x().mo764a(1, null, this);
        C0660o oVar = new C0660o(mo626m().getApplicationContext(), R.layout.list_item, null, strArr, iArr, 2);
        this.f20248ay = oVar;
        this.f20248ay.mo2530a(new C0662b() {
            /* renamed from: a */
            public boolean mo2534a(View view, Cursor cursor, int i) {
                boolean z;
                String str;
                LinearLayout linearLayout;
                boolean z2;
                Date date = null;
                if (view.getId() == R.id.iv_item) {
                    if (t_buscador_fr.this.f20237an.f17967bv == 1 && !t_buscador_fr.this.f20237an.f17959bn.equals("") && !t_buscador_fr.this.f20237an.f17960bo.equals("")) {
                        try {
                            linearLayout = (LinearLayout) view.getParent().getParent().getParent().getParent();
                            z2 = true;
                        } catch (Exception unused) {
                            linearLayout = null;
                            z2 = false;
                        }
                        if (z2) {
                            linearLayout.setBackgroundDrawable(t_buscador_fr.this.f20242as);
                        }
                    }
                    FrameLayout frameLayout = (FrameLayout) view.getParent().getParent().getParent();
                    if (t_buscador_fr.this.f20233aj) {
                        ImageView imageView = (ImageView) frameLayout.findViewById(R.id.iv_item_sel);
                        if (cursor.getPosition() == t_buscador_fr.this.f20245av) {
                            imageView.setImageDrawable(t_buscador_fr.this.f20243at);
                            imageView.setVisibility(0);
                        } else {
                            imageView.setVisibility(8);
                        }
                    } else {
                        frameLayout.findViewById(R.id.ll_item_der).setVisibility(8);
                    }
                    ImageView imageView2 = (ImageView) view;
                    if (cursor.getInt(cursor.getColumnIndex("img1_id")) == 0 && cursor.getString(cursor.getColumnIndex("img1_url")).equals("")) {
                        imageView2.setImageDrawable(null);
                    } else if (!cursor.isNull(i)) {
                        byte[] blob = cursor.getBlob(i);
                        imageView2.setImageBitmap(BitmapFactory.decodeByteArray(blob, 0, blob.length));
                    } else {
                        imageView2.setImageDrawable(t_buscador_fr.this.mo628n().getDrawable(R.drawable.loader_g));
                    }
                    if (!t_buscador_fr.this.f20235al) {
                        imageView2.setVisibility(8);
                    }
                    return true;
                } else if (view.getId() == R.id.title) {
                    TextView textView = (TextView) view;
                    textView.setTypeface(Typeface.MONOSPACE);
                    if (!t_buscador_fr.this.f20237an.f17961bp.equals("")) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("#");
                        sb.append(t_buscador_fr.this.f20237an.f17961bp);
                        textView.setTextColor(Color.parseColor(sb.toString()));
                    }
                    return false;
                } else if (view.getId() == R.id.precio) {
                    view.setVisibility(8);
                    if (cursor.isNull(cursor.getColumnIndex("precio"))) {
                        return false;
                    }
                    DecimalFormat decimalFormat = new DecimalFormat();
                    decimalFormat.setCurrency(Currency.getInstance(Locale.getDefault()));
                    String format = decimalFormat.format(cursor.getDouble(cursor.getColumnIndex("precio")));
                    if (format.length() > 1) {
                        String substring = format.substring(format.length() - 2, format.length() - 1);
                        if (substring.equals(",") || substring.equals(".")) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(format);
                            sb2.append("0");
                            format = sb2.toString();
                        }
                    }
                    TextView textView2 = (TextView) view;
                    textView2.setTypeface(Typeface.MONOSPACE);
                    if (t_buscador_fr.this.f20237an.f17919az.equals("")) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(format);
                        sb3.append(".");
                        textView2.setText(sb3.toString());
                    } else {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append(format);
                        sb4.append(" ");
                        sb4.append(Html.fromHtml(t_buscador_fr.this.f20237an.f17919az));
                        textView2.setText(sb4.toString());
                    }
                    if (!t_buscador_fr.this.f20237an.f17962bq.equals("")) {
                        StringBuilder sb5 = new StringBuilder();
                        sb5.append("#");
                        sb5.append(t_buscador_fr.this.f20237an.f17962bq);
                        textView2.setTextColor(Color.parseColor(sb5.toString()));
                    }
                    textView2.setVisibility(0);
                    return true;
                } else if (view.getId() == R.id.antiguedad) {
                    view.setVisibility(8);
                    int i2 = cursor.getInt(cursor.getColumnIndex("anyo"));
                    if (i2 != 0) {
                        StringBuilder sb6 = new StringBuilder();
                        sb6.append(i2);
                        sb6.append("");
                        String sb7 = sb6.toString();
                        int i3 = cursor.getInt(cursor.getColumnIndex("mes"));
                        StringBuilder sb8 = new StringBuilder();
                        sb8.append(i3);
                        sb8.append("");
                        String sb9 = sb8.toString();
                        if (sb9.equals("0")) {
                            sb9 = "1";
                        }
                        int i4 = cursor.getInt(cursor.getColumnIndex("dia"));
                        StringBuilder sb10 = new StringBuilder();
                        sb10.append(i4);
                        sb10.append("");
                        String sb11 = sb10.toString();
                        if (sb11.equals("0")) {
                            sb11 = "1";
                        }
                        try {
                            DateFormat dateInstance = DateFormat.getDateInstance(3, Locale.US);
                            StringBuilder sb12 = new StringBuilder();
                            sb12.append(sb9);
                            sb12.append("/");
                            sb12.append(sb11);
                            sb12.append("/");
                            sb12.append(sb7);
                            date = dateInstance.parse(sb12.toString());
                            z = true;
                        } catch (Exception unused2) {
                            z = false;
                        }
                        if (z) {
                            if (i3 == 0) {
                                StringBuilder sb13 = new StringBuilder();
                                sb13.append(i2);
                                sb13.append("");
                                str = sb13.toString();
                            } else if (i4 == 0) {
                                String format2 = String.format(Locale.getDefault(), "%tB", new Object[]{date});
                                StringBuilder sb14 = new StringBuilder();
                                sb14.append(format2.substring(0, 1).toUpperCase());
                                sb14.append(format2.substring(1));
                                String sb15 = sb14.toString();
                                StringBuilder sb16 = new StringBuilder();
                                sb16.append(sb15);
                                sb16.append(", ");
                                sb16.append(i2);
                                str = sb16.toString();
                            } else {
                                str = DateFormat.getDateInstance().format(date);
                            }
                            TextView textView3 = (TextView) view;
                            textView3.setTypeface(Typeface.MONOSPACE);
                            textView3.setText(str);
                            if (!t_buscador_fr.this.f20237an.f17963br.equals("")) {
                                StringBuilder sb17 = new StringBuilder();
                                sb17.append("#");
                                sb17.append(t_buscador_fr.this.f20237an.f17963br);
                                textView3.setTextColor(Color.parseColor(sb17.toString()));
                            }
                            textView3.setVisibility(0);
                            return true;
                        }
                    }
                    return false;
                } else {
                    if (view.getId() == R.id.tv_aux && cursor.getPosition() == cursor.getCount() - 1 && !t_buscador_fr.this.f20234ak && (t_buscador_fr.this.f20239ap == null || t_buscador_fr.this.f20239ap.getStatus() != Status.RUNNING)) {
                        t_buscador_fr.this.f20249i = cursor.getCount();
                        t_buscador_fr.this.f20239ap = new C6095b(cursor.getCount() + 1);
                        t_buscador_fr.this.f20239ap.execute(new String[0]);
                    }
                    return false;
                }
            }
        });
    }

    /* renamed from: d */
    public void mo598d(Bundle bundle) {
        super.mo598d(bundle);
        this.f20246aw = ((LayoutInflater) mo626m().getSystemService("layout_inflater")).inflate(R.layout.list_footer, null, false);
        this.f20246aw.findViewById(R.id.tv_footer).setBackgroundColor(-1);
        if (!this.f20233aj) {
            LayoutParams layoutParams = new LayoutParams(-1, -2);
            layoutParams.setMargins(0, 0, 0, 0);
            ((TextView) this.f20246aw.findViewById(R.id.tv_footer)).setLayoutParams(layoutParams);
        }
        mo830c().addFooterView(this.f20246aw);
        mo1033a((ListAdapter) this.f20248ay);
        mo830c().removeFooterView(this.f20246aw);
        if (this.f20236am) {
            mo1036a(false);
        }
        mo830c().setCacheColorHint(0);
        if (this.f20237an.f17967bv == 0 && !this.f20237an.f17959bn.equals("") && !this.f20237an.f17960bo.equals("")) {
            mo830c().setBackgroundDrawable(this.f20242as);
        }
        if (!this.f20234ak && (this.f20239ap == null || this.f20239ap.getStatus() != Status.RUNNING)) {
            this.f20239ap = new C6095b(this.f20231ah + 1);
            this.f20239ap.execute(new String[0]);
        }
        if (this.f20231ah <= 0) {
            return;
        }
        if (this.f20240aq == null || this.f20240aq.getStatus() != Status.RUNNING) {
            this.f20240aq = new C6096c();
            this.f20240aq.execute(new String[0]);
        }
    }

    /* renamed from: e */
    public void mo603e(Bundle bundle) {
        super.mo603e(bundle);
        bundle.putBoolean("hayfotos", this.f20235al);
        bundle.putBoolean("mostrar_loader", this.f20236am);
        bundle.putBoolean("fin", this.f20234ak);
        bundle.putInt("ncargados", this.f20231ah);
    }

    /* renamed from: a */
    public void mo563a(Activity activity) {
        super.mo563a(activity);
        try {
            this.f20247ax = (C5745a) activity;
        } catch (ClassCastException unused) {
            StringBuilder sb = new StringBuilder();
            sb.append(activity.toString());
            sb.append(" must implement OnTutSelectedListener");
            throw new ClassCastException(sb.toString());
        }
    }

    /* renamed from: a */
    public C0358e<Cursor> mo1039a(int i, Bundle bundle) {
        C0357d dVar = new C0357d(mo626m(), bd_provider.f19599a, new String[]{"_id", "titulo", "precio", "anyo", "mes", "dia", "url_detalle", "img1_p", "img1_id", "img1_url"}, null, null, "orden");
        return dVar;
    }

    /* renamed from: a */
    public void mo1041a(C0358e<Cursor> eVar, Cursor cursor) {
        this.f20248ay.mo2506b(cursor);
    }

    /* renamed from: a */
    public void mo1040a(C0358e<Cursor> eVar) {
        this.f20248ay.mo2506b(null);
    }
}
