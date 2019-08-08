package mega.boicot;

import android.app.Activity;
import android.app.ProgressDialog;
import android.app.SearchManager;
import android.app.SearchManager.OnCancelListener;
import android.app.SearchManager.OnDismissListener;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.GradientDrawable.Orientation;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.AsyncTask.Status;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.provider.MediaStore.Images.Media;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ProgressBar;
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
import java.util.Iterator;

public class t_gal extends Activity implements OnClickListener, OnItemClickListener, OnAdClosed, OnAdError, OnAdLoaded, OnVideoEnded, RewardedVideoAdListener, C3167c, VideoListener, AdEventListener, C5599a {

    /* renamed from: A */
    Bundle f19040A;

    /* renamed from: B */
    ListView f19041B;

    /* renamed from: C */
    SharedPreferences f19042C;

    /* renamed from: a */
    int f19043a;

    /* renamed from: b */
    int f19044b;

    /* renamed from: c */
    int f19045c = -1;

    /* renamed from: d */
    config f19046d;

    /* renamed from: e */
    boolean f19047e = false;

    /* renamed from: f */
    boolean f19048f = false;

    /* renamed from: g */
    boolean f19049g;

    /* renamed from: h */
    boolean f19050h;

    /* renamed from: i */
    boolean f19051i = false;

    /* renamed from: j */
    boolean f19052j;

    /* renamed from: k */
    String f19053k;

    /* renamed from: l */
    ArrayList<C5834b> f19054l;

    /* renamed from: m */
    GridView f19055m;

    /* renamed from: n */
    C5832a f19056n;

    /* renamed from: o */
    C5836d f19057o;

    /* renamed from: p */
    C5835c f19058p;

    /* renamed from: q */
    C5837e f19059q;

    /* renamed from: r */
    C5602c f19060r;

    /* renamed from: s */
    C3166b f19061s;

    /* renamed from: t */
    RewardedVideo f19062t;

    /* renamed from: u */
    RewardedVideoAd f19063u;

    /* renamed from: v */
    StartAppAd f19064v;

    /* renamed from: w */
    boolean f19065w = false;

    /* renamed from: x */
    boolean f19066x = false;

    /* renamed from: y */
    View f19067y;

    /* renamed from: z */
    ProgressDialog f19068z;

    /* renamed from: mega.boicot.t_gal$a */
    public class C5832a extends ArrayAdapter<C5834b> {

        /* renamed from: b */
        private Context f19073b;

        /* renamed from: c */
        private int f19074c;

        /* renamed from: d */
        private ArrayList<C5834b> f19075d = new ArrayList<>();

        /* renamed from: mega.boicot.t_gal$a$a */
        class C5833a {

            /* renamed from: a */
            ImageView f19076a;

            /* renamed from: b */
            ProgressBar f19077b;

            /* renamed from: c */
            ProgressBar f19078c;

            C5833a() {
            }
        }

        public C5832a(Context context, int i, ArrayList<C5834b> arrayList) {
            super(context, i, arrayList);
            this.f19074c = i;
            this.f19073b = context;
            this.f19075d = arrayList;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            C5833a aVar;
            if (!t_gal.this.f19050h && t_gal.this.f19054l.size() - i < 10 && (t_gal.this.f19057o == null || t_gal.this.f19057o.getStatus() != Status.RUNNING)) {
                t_gal.this.f19057o = new C5836d(t_gal.this.f19054l.size());
                t_gal.this.f19057o.execute(new String[0]);
            }
            Bitmap bitmap = null;
            if (t_gal.this.f19051i && (t_gal.this.f19058p == null || t_gal.this.f19058p.getStatus() != Status.RUNNING)) {
                t_gal.this.f19058p = new C5835c();
                t_gal.this.f19058p.execute(new String[0]);
            }
            if (view == null) {
                view = ((Activity) this.f19073b).getLayoutInflater().inflate(this.f19074c, viewGroup, false);
                aVar = new C5833a();
                aVar.f19076a = (ImageView) view.findViewById(R.id.iv_usugrid);
                aVar.f19077b = (ProgressBar) view.findViewById(R.id.pb_foto);
                aVar.f19078c = (ProgressBar) view.findViewById(R.id.pb_foto_inv);
                if (VERSION.SDK_INT > 20) {
                    config.m23838a(aVar.f19077b, t_gal.this.f19046d.f17890aW);
                    config.m23838a(aVar.f19078c, t_gal.this.f19046d.f17890aW);
                }
                view.setTag(aVar);
            } else {
                aVar = (C5833a) view.getTag();
            }
            C5834b bVar = (C5834b) this.f19075d.get(i);
            if (bVar.f19080a.equals("-1")) {
                aVar.f19076a.setImageBitmap(null);
                aVar.f19077b.setVisibility(8);
                aVar.f19078c.setVisibility(8);
                if (t_gal.this.f19052j) {
                    aVar.f19078c.setVisibility(0);
                } else {
                    aVar.f19077b.setVisibility(0);
                }
                return view;
            }
            aVar.f19077b.setVisibility(8);
            aVar.f19078c.setVisibility(8);
            if (bVar.f19085f || bVar.f19084e) {
                aVar.f19076a.setImageBitmap(null);
                if (t_gal.this.f19052j) {
                    aVar.f19078c.setVisibility(0);
                } else {
                    aVar.f19077b.setVisibility(0);
                }
            } else {
                try {
                    File filesDir = t_gal.this.getApplicationContext().getFilesDir();
                    StringBuilder sb = new StringBuilder();
                    sb.append("gal_");
                    sb.append(bVar.f19080a);
                    sb.append(".jpg");
                    File file = new File(filesDir, sb.toString());
                    if (file.exists()) {
                        bitmap = Media.getBitmap(t_gal.this.getContentResolver(), Uri.fromFile(file));
                    }
                } catch (Exception unused) {
                }
                aVar.f19076a.setImageBitmap(bitmap);
            }
            if (bVar.f19086g) {
                if (t_gal.this.f19052j) {
                    aVar.f19078c.setVisibility(0);
                } else {
                    aVar.f19077b.setVisibility(0);
                }
            }
            return view;
        }
    }

    /* renamed from: mega.boicot.t_gal$b */
    private class C5834b {

        /* renamed from: a */
        String f19080a;

        /* renamed from: b */
        String f19081b;

        /* renamed from: c */
        String f19082c;

        /* renamed from: d */
        String f19083d;

        /* renamed from: e */
        boolean f19084e;

        /* renamed from: f */
        boolean f19085f;

        /* renamed from: g */
        boolean f19086g;

        private C5834b() {
            this.f19084e = true;
            this.f19085f = false;
            this.f19086g = false;
        }
    }

    /* renamed from: mega.boicot.t_gal$c */
    private class C5835c extends AsyncTask<String, Void, String> {

        /* renamed from: a */
        String f19088a;

        /* renamed from: b */
        Bitmap f19089b;

        /* renamed from: c */
        int f19090c;

        private C5835c() {
            this.f19090c = -1;
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
            int firstVisiblePosition = t_gal.this.f19055m.getFirstVisiblePosition();
            while (firstVisiblePosition <= Math.max(t_gal.this.f19055m.getLastVisiblePosition(), 30) && t_gal.this.f19054l != null && firstVisiblePosition < t_gal.this.f19054l.size()) {
                if (!((C5834b) t_gal.this.f19054l.get(firstVisiblePosition)).f19084e || ((C5834b) t_gal.this.f19054l.get(firstVisiblePosition)).f19080a.equals("-1")) {
                    firstVisiblePosition++;
                } else {
                    this.f19088a = ((C5834b) t_gal.this.f19054l.get(firstVisiblePosition)).f19080a;
                    ((C5834b) t_gal.this.f19054l.get(firstVisiblePosition)).f19085f = true;
                    ((C5834b) t_gal.this.f19054l.get(firstVisiblePosition)).f19084e = false;
                    this.f19090c = firstVisiblePosition;
                    return;
                }
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public String doInBackground(String... strArr) {
            if (this.f19088a == null) {
                return "-1";
            }
            try {
                StringBuilder sb = new StringBuilder();
                sb.append("http://imgs1.e-droid.net/srv/imgs/gal/");
                sb.append(this.f19088a);
                sb.append("_p.png");
                try {
                    HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(sb.toString()).openConnection();
                    httpURLConnection.setDoInput(true);
                    httpURLConnection.setConnectTimeout(10000);
                    httpURLConnection.setReadTimeout(20000);
                    httpURLConnection.connect();
                    InputStream inputStream = httpURLConnection.getInputStream();
                    this.f19089b = BitmapFactory.decodeStream(inputStream);
                    inputStream.close();
                    httpURLConnection.disconnect();
                    File filesDir = t_gal.this.getApplicationContext().getFilesDir();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("gal_");
                    sb2.append(this.f19088a);
                    sb2.append(".jpg");
                    try {
                        this.f19089b.compress(CompressFormat.JPEG, 70, new FileOutputStream(new File(filesDir, sb2.toString())));
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
            if (!(this.f19090c == -1 || t_gal.this.f19054l == null)) {
                try {
                    ((C5834b) t_gal.this.f19054l.get(this.f19090c)).f19085f = false;
                } catch (Exception unused) {
                    return;
                }
            }
            if (this.f19088a != null) {
                t_gal.this.f19056n.notifyDataSetChanged();
                new C5835c().execute(new String[0]);
            }
        }
    }

    /* renamed from: mega.boicot.t_gal$d */
    private class C5836d extends AsyncTask<String, Void, String> {

        /* renamed from: a */
        int f19092a;

        C5836d(int i) {
            this.f19092a = i;
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
            if (t_gal.this.f19054l.isEmpty() || !((C5834b) t_gal.this.f19054l.get(t_gal.this.f19054l.size() - 1)).f19080a.equals("-1")) {
                C5834b bVar = new C5834b();
                bVar.f19080a = "-1";
                bVar.f19081b = "";
                t_gal.this.f19054l.add(bVar);
                t_gal.this.f19056n.notifyDataSetChanged();
            }
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x00a3  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.String doInBackground(java.lang.String... r6) {
            /*
                r5 = this;
                r6 = 0
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x009f }
                r0.<init>()     // Catch:{ Exception -> 0x009f }
                java.lang.String r1 = "http://"
                r0.append(r1)     // Catch:{ Exception -> 0x009f }
                java.lang.String r1 = mega.boicot.config.f17839g     // Catch:{ Exception -> 0x009f }
                r0.append(r1)     // Catch:{ Exception -> 0x009f }
                java.lang.String r1 = "/srv/obtener_gal.php?idusu="
                r0.append(r1)     // Catch:{ Exception -> 0x009f }
                mega.boicot.t_gal r1 = mega.boicot.t_gal.this     // Catch:{ Exception -> 0x009f }
                int r1 = r1.f19043a     // Catch:{ Exception -> 0x009f }
                r0.append(r1)     // Catch:{ Exception -> 0x009f }
                java.lang.String r1 = "&ind_ini="
                r0.append(r1)     // Catch:{ Exception -> 0x009f }
                int r1 = r5.f19092a     // Catch:{ Exception -> 0x009f }
                r0.append(r1)     // Catch:{ Exception -> 0x009f }
                java.lang.String r1 = "&idsec="
                r0.append(r1)     // Catch:{ Exception -> 0x009f }
                mega.boicot.t_gal r1 = mega.boicot.t_gal.this     // Catch:{ Exception -> 0x009f }
                mega.boicot.config r1 = r1.f19046d     // Catch:{ Exception -> 0x009f }
                mega.boicot.i[] r1 = r1.f17971bz     // Catch:{ Exception -> 0x009f }
                mega.boicot.t_gal r2 = mega.boicot.t_gal.this     // Catch:{ Exception -> 0x009f }
                int r2 = r2.f19044b     // Catch:{ Exception -> 0x009f }
                r1 = r1[r2]     // Catch:{ Exception -> 0x009f }
                int r1 = r1.f18330w     // Catch:{ Exception -> 0x009f }
                r0.append(r1)     // Catch:{ Exception -> 0x009f }
                java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x009f }
                java.net.URL r1 = new java.net.URL     // Catch:{ Exception -> 0x009f }
                r1.<init>(r0)     // Catch:{ Exception -> 0x009f }
                java.net.URLConnection r0 = r1.openConnection()     // Catch:{ Exception -> 0x009f }
                java.net.HttpURLConnection r0 = (java.net.HttpURLConnection) r0     // Catch:{ Exception -> 0x009f }
                r6 = 1
                r0.setDoInput(r6)     // Catch:{ Exception -> 0x009b, all -> 0x0096 }
                r6 = 10000(0x2710, float:1.4013E-41)
                r0.setConnectTimeout(r6)     // Catch:{ Exception -> 0x009b, all -> 0x0096 }
                r0.setReadTimeout(r6)     // Catch:{ Exception -> 0x009b, all -> 0x0096 }
                java.lang.String r6 = "User-Agent"
                java.lang.String r1 = "Android Vinebre Software"
                r0.setRequestProperty(r6, r1)     // Catch:{ Exception -> 0x009b, all -> 0x0096 }
                java.io.InputStream r6 = r0.getInputStream()     // Catch:{ Exception -> 0x009b, all -> 0x0096 }
                java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch:{ Exception -> 0x009b, all -> 0x0096 }
                java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x009b, all -> 0x0096 }
                r2.<init>(r6)     // Catch:{ Exception -> 0x009b, all -> 0x0096 }
                r1.<init>(r2)     // Catch:{ Exception -> 0x009b, all -> 0x0096 }
                java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x009b, all -> 0x0096 }
                r6.<init>()     // Catch:{ Exception -> 0x009b, all -> 0x0096 }
            L_0x0071:
                java.lang.String r2 = r1.readLine()     // Catch:{ Exception -> 0x009b, all -> 0x0096 }
                if (r2 == 0) goto L_0x008c
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x009b, all -> 0x0096 }
                r3.<init>()     // Catch:{ Exception -> 0x009b, all -> 0x0096 }
                r3.append(r2)     // Catch:{ Exception -> 0x009b, all -> 0x0096 }
                java.lang.String r2 = "\n"
                r3.append(r2)     // Catch:{ Exception -> 0x009b, all -> 0x0096 }
                java.lang.String r2 = r3.toString()     // Catch:{ Exception -> 0x009b, all -> 0x0096 }
                r6.append(r2)     // Catch:{ Exception -> 0x009b, all -> 0x0096 }
                goto L_0x0071
            L_0x008c:
                java.lang.String r6 = r6.toString()     // Catch:{ Exception -> 0x009b, all -> 0x0096 }
                if (r0 == 0) goto L_0x0095
                r0.disconnect()
            L_0x0095:
                return r6
            L_0x0096:
                r6 = move-exception
                r4 = r0
                r0 = r6
                r6 = r4
                goto L_0x00a7
            L_0x009b:
                r6 = r0
                goto L_0x009f
            L_0x009d:
                r0 = move-exception
                goto L_0x00a7
            L_0x009f:
                java.lang.String r0 = ""
                if (r6 == 0) goto L_0x00a6
                r6.disconnect()
            L_0x00a6:
                return r0
            L_0x00a7:
                if (r6 == 0) goto L_0x00ac
                r6.disconnect()
            L_0x00ac:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: mega.boicot.t_gal.C5836d.doInBackground(java.lang.String[]):java.lang.String");
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void onPostExecute(String str) {
            if (t_gal.this.f19054l != null && ((C5834b) t_gal.this.f19054l.get(t_gal.this.f19054l.size() - 1)).f19080a.equals("-1")) {
                t_gal.this.f19054l.remove(t_gal.this.f19054l.size() - 1);
                t_gal.this.f19056n.notifyDataSetChanged();
            }
            if (str.contains("ANDROID:OK DATOS:")) {
                String[] split = str.substring(str.indexOf("DATOS:") + 6).split(";");
                int i = 0;
                while (!split[i].equals("S") && !split[i].equals("N")) {
                    String[] split2 = split[i].split(",");
                    C5834b bVar = new C5834b();
                    bVar.f19080a = split2[0];
                    bVar.f19081b = split2[1].replace("@X@", ",").replace("@Y@", ";");
                    bVar.f19082c = split2[2];
                    if (split2.length > 3) {
                        bVar.f19083d = split2[3].replace("@X@", ",").replace("@Y@", ";");
                    } else {
                        bVar.f19083d = "";
                    }
                    File filesDir = t_gal.this.getApplicationContext().getFilesDir();
                    StringBuilder sb = new StringBuilder();
                    sb.append("gal_");
                    sb.append(split2[0]);
                    sb.append(".jpg");
                    if (new File(filesDir, sb.toString()).exists()) {
                        bVar.f19085f = false;
                        bVar.f19084e = false;
                    }
                    t_gal.this.f19054l.add(bVar);
                    i++;
                }
                if (split[i].equals("N")) {
                    t_gal.this.f19050h = true;
                }
                t_gal.this.f19056n.notifyDataSetChanged();
                String str2 = "";
                Iterator it = t_gal.this.f19054l.iterator();
                while (it.hasNext()) {
                    C5834b bVar2 = (C5834b) it.next();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(str2);
                    sb2.append(bVar2.f19080a);
                    sb2.append("@");
                    sb2.append(bVar2.f19084e ? "1" : "0");
                    sb2.append("@");
                    sb2.append(bVar2.f19081b.replace("/", "BARRA98").replace("@", "ARROBA98"));
                    sb2.append("@");
                    sb2.append(bVar2.f19082c);
                    sb2.append("@");
                    sb2.append(bVar2.f19083d.replace("/", "BARRA98").replace("@", "ARROBA98"));
                    sb2.append("/");
                    str2 = sb2.toString();
                }
                Editor edit = t_gal.this.f19042C.edit();
                StringBuilder sb3 = new StringBuilder();
                sb3.append("gal_a_");
                sb3.append(t_gal.this.f19046d.f17971bz[t_gal.this.f19044b].f18330w);
                edit.putString(sb3.toString(), str2);
                edit.commit();
                if (i <= 0) {
                    return;
                }
                if (t_gal.this.f19058p == null || t_gal.this.f19058p.getStatus() != Status.RUNNING) {
                    t_gal.this.f19058p = new C5835c();
                    t_gal.this.f19058p.execute(new String[0]);
                    t_gal.this.f19051i = true;
                }
            }
        }
    }

    /* renamed from: mega.boicot.t_gal$e */
    private class C5837e extends AsyncTask<String, Void, String> {

        /* renamed from: a */
        int f19094a;

        /* renamed from: b */
        String f19095b;

        /* renamed from: c */
        String f19096c;

        /* renamed from: d */
        Bitmap f19097d;

        public C5837e(String str, int i, String str2) {
            this.f19095b = str;
            this.f19096c = str2;
            this.f19094a = i;
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
            ((C5834b) t_gal.this.f19054l.get(this.f19094a)).f19086g = true;
            t_gal.this.f19056n.notifyDataSetChanged();
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public String doInBackground(String... strArr) {
            try {
                StringBuilder sb = new StringBuilder();
                sb.append("http://imgs1.e-droid.net/srv/imgs/gal/");
                sb.append(this.f19095b);
                sb.append(".png");
                try {
                    HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(sb.toString()).openConnection();
                    httpURLConnection.setDoInput(true);
                    httpURLConnection.setConnectTimeout(10000);
                    httpURLConnection.setReadTimeout(60000);
                    httpURLConnection.connect();
                    InputStream inputStream = httpURLConnection.getInputStream();
                    this.f19097d = BitmapFactory.decodeStream(inputStream);
                    inputStream.close();
                    httpURLConnection.disconnect();
                    File filesDir = t_gal.this.getApplicationContext().getFilesDir();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("gal_");
                    sb2.append(this.f19095b);
                    sb2.append("_g.jpg");
                    try {
                        this.f19097d.compress(CompressFormat.JPEG, 100, new FileOutputStream(new File(filesDir, sb2.toString())));
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
            ((C5834b) t_gal.this.f19054l.get(this.f19094a)).f19086g = false;
            t_gal.this.f19056n.notifyDataSetChanged();
            Intent intent = new Intent(t_gal.this, t_gal_foto.class);
            File filesDir = t_gal.this.getApplicationContext().getFilesDir();
            StringBuilder sb = new StringBuilder();
            sb.append("gal_");
            sb.append(this.f19095b);
            sb.append("_g.jpg");
            File file = new File(filesDir, sb.toString());
            StringBuilder sb2 = new StringBuilder();
            sb2.append("file://");
            sb2.append(file.getAbsolutePath());
            intent.putExtra("url", sb2.toString());
            intent.putExtra("descr", this.f19096c);
            t_gal.this.startActivityForResult(intent, 0);
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
        String[] split;
        this.f19046d = (config) getApplicationContext();
        if (this.f19046d.f17881aN == null) {
            this.f19046d.mo20780b();
        }
        String str = this.f19046d.f17971bz[this.f19046d.f18075l].f18314g;
        String str2 = this.f19046d.f17971bz[this.f19046d.f18075l].f18315h;
        StringBuilder sb = new StringBuilder();
        sb.append("#");
        sb.append(str);
        this.f19052j = config.m23844a(sb.toString());
        this.f19053k = config.m23831a(str, this.f19046d.f17890aW);
        if (VERSION.SDK_INT > 12 && !this.f19052j) {
            setTheme(R.style.holonolight);
        }
        this.f19040A = getIntent().getExtras();
        if (bundle == null) {
            this.f19049g = this.f19040A != null && this.f19040A.containsKey("es_root") && this.f19040A.getBoolean("es_root", false);
        } else {
            this.f19049g = bundle.containsKey("es_root") && bundle.getBoolean("es_root", false);
        }
        this.f19044b = this.f19046d.f18075l;
        super.onCreate(bundle);
        this.f19042C = getSharedPreferences("sh", 0);
        this.f19043a = this.f19042C.getInt("idusu", 0);
        setContentView(R.layout.t_gal);
        mo21222f();
        if (this.f19046d.f18080q > 0) {
            SearchManager searchManager = (SearchManager) getSystemService("search");
            searchManager.setOnCancelListener(new OnCancelListener() {
                public void onCancel() {
                    t_gal.this.f19047e = false;
                    t_gal.this.setResult(0);
                }
            });
            searchManager.setOnDismissListener(new OnDismissListener() {
                public void onDismiss() {
                    t_gal.this.f19066x = false;
                }
            });
        }
        this.f19046d.mo20770a((Context) this, this.f19040A != null && this.f19040A.containsKey("ad_entrar"), this.f19040A != null && this.f19040A.containsKey("fb_entrar"));
        this.f19060r = this.f19046d.mo20760a((Context) this, false);
        this.f19046d.mo20767a((Context) this, this.f19046d.f18075l, this.f19053k, bundle);
        if (!str.equals("")) {
            Orientation orientation = Orientation.TOP_BOTTOM;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("#");
            sb2.append(str);
            StringBuilder sb3 = new StringBuilder();
            sb3.append("#");
            sb3.append(str2);
            findViewById(R.id.ll_princ).setBackgroundDrawable(new GradientDrawable(orientation, new int[]{Color.parseColor(sb2.toString()), Color.parseColor(sb3.toString())}));
        }
        this.f19054l = new ArrayList<>();
        this.f19050h = false;
        this.f19055m = (GridView) findViewById(R.id.grid);
        this.f19056n = new C5832a(this, R.layout.t_gal_row, this.f19054l);
        this.f19055m.setAdapter(this.f19056n);
        this.f19055m.setOnItemClickListener(this);
        this.f19051i = false;
        if (config.m23858k(this)) {
            this.f19057o = new C5836d(0);
            this.f19057o.execute(new String[0]);
            return;
        }
        this.f19050h = true;
        SharedPreferences sharedPreferences = this.f19042C;
        StringBuilder sb4 = new StringBuilder();
        sb4.append("gal_a_");
        sb4.append(this.f19046d.f17971bz[this.f19044b].f18330w);
        if (sharedPreferences.contains(sb4.toString())) {
            SharedPreferences sharedPreferences2 = this.f19042C;
            StringBuilder sb5 = new StringBuilder();
            sb5.append("gal_a_");
            sb5.append(this.f19046d.f17971bz[this.f19044b].f18330w);
            for (String str3 : sharedPreferences2.getString(sb5.toString(), "").split("/")) {
                if (!str3.equals("")) {
                    String[] split2 = str3.split("@");
                    if (split2.length == 4 || split2.length == 5) {
                        C5834b bVar = new C5834b();
                        bVar.f19080a = split2[0];
                        File filesDir = getApplicationContext().getFilesDir();
                        StringBuilder sb6 = new StringBuilder();
                        sb6.append("gal_");
                        sb6.append(bVar.f19080a);
                        sb6.append(".jpg");
                        if (new File(filesDir, sb6.toString()).exists()) {
                            bVar.f19084e = false;
                        } else {
                            bVar.f19084e = true;
                        }
                        bVar.f19081b = split2[2].replace("BARRA98", "/").replace("ARROBA98", "@");
                        bVar.f19082c = split2[3];
                        if (split2.length == 5) {
                            bVar.f19083d = split2[4].replace("BARRA98", "/").replace("ARROBA98", "@");
                        } else {
                            bVar.f19083d = "";
                        }
                        this.f19054l.add(bVar);
                    }
                }
            }
            this.f19056n.notifyDataSetChanged();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo21221b(int i) {
        startActivityForResult(this.f19046d.mo20762a(Integer.valueOf(i), (Context) this).f18226a, 0);
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i2 == -1 && intent != null && intent.hasExtra("finalizar") && intent.getExtras().getBoolean("finalizar")) {
            if (!intent.getExtras().getBoolean("finalizar_app")) {
                this.f19049g = false;
            }
            setResult(-1, intent);
            finish();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public void mo21222f() {
        int b = this.f19046d.mo20778b((Context) this);
        if (this.f19046d.f18045dm == 1) {
            this.f19041B = (ListView) findViewById(R.id.left_drawer);
            this.f19046d.mo20771a(this.f19041B);
        } else if (this.f19046d.f18045dm == 0) {
            int i = 0;
            for (int i2 = 0; i2 < this.f19046d.f17971bz.length; i2++) {
                if (!this.f19046d.f17971bz[i2].f18333z) {
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
        for (int i3 = 0; i3 < this.f19046d.f17923bD.length; i3++) {
            if (this.f19046d.f17923bD[i3] > 0) {
                findViewById(this.f19046d.f17923bD[i3]).setOnClickListener(this);
            }
        }
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        C5834b bVar = (C5834b) this.f19054l.get(i);
        if (bVar.f19080a.equals("-1")) {
            return;
        }
        if (this.f19059q != null && this.f19059q.getStatus() == Status.RUNNING) {
            return;
        }
        if (!bVar.f19082c.equals("0")) {
            View view2 = new View(this);
            int indexOf = this.f19046d.f17920bA.indexOf(Integer.valueOf(Integer.parseInt(bVar.f19082c)));
            view2.setId(indexOf);
            view2.setTag(R.id.TAG_IDSECC, Integer.valueOf(indexOf));
            if (this.f19046d.f17986cO != null && !this.f19046d.f17986cO.equals("")) {
                this.f19062t = new RewardedVideo((Context) this, this.f19046d.f17986cO);
            }
            if (this.f19046d.f17985cN != null && !this.f19046d.f17985cN.equals("")) {
                this.f19061s = C2997g.m10716a(this);
            }
            if (this.f19046d.f17988cQ != null && !this.f19046d.f17988cQ.equals("")) {
                this.f19063u = new RewardedVideoAd(this, this.f19046d.f17988cQ);
            }
            if (this.f19046d.f17989cR != null && !this.f19046d.f17989cR.equals("")) {
                this.f19064v = new StartAppAd(this);
            }
            this.f19068z = new ProgressDialog(this);
            this.f19067y = null;
            this.f19045c = indexOf;
            if (!this.f19046d.mo20774a((Context) this, view2, this.f19053k, this.f19068z, this.f19061s, this.f19062t, this.f19063u, this.f19064v)) {
                mo21221b(indexOf);
            }
        } else if (!bVar.f19083d.equals("")) {
            try {
                startActivityForResult(this.f19046d.mo20784d(bVar.f19083d), 0);
            } catch (Exception unused) {
            }
        } else {
            File filesDir = getFilesDir();
            StringBuilder sb = new StringBuilder();
            sb.append("gal_");
            sb.append(bVar.f19080a);
            sb.append("_g.jpg");
            File file = new File(filesDir, sb.toString());
            if (file.exists()) {
                Intent intent = new Intent(this, t_gal_foto.class);
                StringBuilder sb2 = new StringBuilder();
                sb2.append("file://");
                sb2.append(file.getAbsolutePath());
                intent.putExtra("url", sb2.toString());
                intent.putExtra("idf", bVar.f19080a);
                intent.putExtra("descr", bVar.f19081b);
                startActivityForResult(intent, 0);
            } else if (config.m23858k(this)) {
                this.f19059q = new C5837e(bVar.f19080a, i, bVar.f19081b);
                this.f19059q.execute(new String[0]);
            }
        }
    }

    public void onClick(View view) {
        if ((this.f19046d.f17986cO == null || this.f19046d.f17986cO.equals("")) && ((this.f19046d.f17985cN == null || this.f19046d.f17985cN.equals("")) && ((this.f19046d.f17988cQ == null || this.f19046d.f17988cQ.equals("")) && (this.f19046d.f17989cR == null || this.f19046d.f17989cR.equals(""))))) {
            abrir_secc(view);
            return;
        }
        if (this.f19046d.f17986cO != null && !this.f19046d.f17986cO.equals("")) {
            this.f19062t = new RewardedVideo((Context) this, this.f19046d.f17986cO);
        }
        if (this.f19046d.f17985cN != null && !this.f19046d.f17985cN.equals("")) {
            this.f19061s = C2997g.m10716a(this);
        }
        if (this.f19046d.f17988cQ != null && !this.f19046d.f17988cQ.equals("")) {
            this.f19063u = new RewardedVideoAd(this, this.f19046d.f17988cQ);
        }
        if (this.f19046d.f17989cR != null && !this.f19046d.f17989cR.equals("")) {
            this.f19064v = new StartAppAd(this);
        }
        this.f19068z = new ProgressDialog(this);
        this.f19067y = view;
        if (!this.f19046d.mo20774a((Context) this, view, this.f19053k, this.f19068z, this.f19061s, this.f19062t, this.f19063u, this.f19064v)) {
            abrir_secc(view);
        }
    }

    public void abrir_secc(View view) {
        if (view != null) {
            C5662h a = this.f19046d.mo20761a(view, (Context) this);
            if (a.f18227b) {
                this.f19047e = true;
                Intent intent = new Intent();
                intent.putExtra("finalizar", true);
                intent.putExtra("finalizar_app", a.f18228c);
                setResult(-1, intent);
            }
            if (a.f18229d) {
                startActivityForResult(a.f18226a, 0);
            } else if (a.f18226a != null) {
                if (a.f18227b && this.f19046d.f18045dm != 2) {
                    a.f18226a.putExtra("es_root", true);
                }
                this.f19049g = false;
                startActivity(a.f18226a);
            }
            if (this.f19047e && !this.f19066x) {
                finish();
            }
        } else if (this.f19045c != -1) {
            mo21221b(this.f19045c);
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ((LinearLayout) findViewById(R.id.ll_princ)).removeViewAt(0);
        mo21222f();
        ((LinearLayout) findViewById(R.id.ll_ad)).removeAllViews();
        if (!(this.f19060r == null || this.f19060r.f17768a == null)) {
            try {
                this.f19060r.f17768a.mo12168c();
            } catch (Exception unused) {
            }
        }
        if (!(this.f19060r == null || this.f19060r.f17769b == null)) {
            try {
                this.f19060r.f17769b.destroy();
            } catch (Exception unused2) {
            }
        }
        this.f19060r = this.f19046d.mo20760a((Context) this, false);
    }

    public boolean onSearchRequested() {
        if (this.f19046d.f18080q == 0) {
            return false;
        }
        this.f19047e = true;
        this.f19066x = true;
        return super.onSearchRequested();
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getWindow().setFormat(1);
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("es_root", this.f19049g);
    }

    public void onStop() {
        super.onStop();
        if (this.f19047e && !this.f19066x) {
            finish();
        }
    }

    public void onPause() {
        if (!(this.f19046d.f18013cx == 0 || this.f19060r == null || this.f19060r.f17768a == null)) {
            this.f19060r.f17768a.mo12167b();
        }
        super.onPause();
    }

    public void onResume() {
        super.onResume();
        config.m23860m(this);
        if (this.f19056n != null) {
            this.f19056n.notifyDataSetChanged();
        }
        if (this.f19046d.f18013cx != 0 && this.f19060r != null && this.f19060r.f17768a != null) {
            this.f19060r.f17768a.mo12165a();
        }
    }

    public void onDestroy() {
        if (!(this.f19046d.f18013cx == 0 || this.f19060r == null || this.f19060r.f17768a == null)) {
            this.f19060r.f17768a.mo12168c();
        }
        if (!(this.f19046d.f18013cx == 0 || this.f19060r == null || this.f19060r.f17769b == null)) {
            this.f19060r.f17769b.destroy();
        }
        if ((this.f19049g && isFinishing()) || config.f17841i) {
            config.m23861n(this);
        }
        super.onDestroy();
    }

    public void onBackPressed() {
        if (!this.f19049g || this.f19048f || !this.f19046d.f18059ea) {
            super.onBackPressed();
            return;
        }
        this.f19048f = true;
        config.m23859l(this);
    }

    public void adLoaded(String str) {
        this.f19068z.cancel();
        this.f19062t.showAd();
    }

    public void onAdClosed() {
        if (this.f19065w) {
            abrir_secc(this.f19067y);
        }
    }

    public void adError(String str) {
        this.f19068z.cancel();
        abrir_secc(this.f19067y);
    }

    public void videoEnded() {
        this.f19065w = true;
        config.m23867t(this);
    }

    /* renamed from: z_ */
    public void mo9678z_() {
        this.f19068z.cancel();
        this.f19061s.mo12836a();
    }

    /* renamed from: a */
    public void mo9675a(C3165a aVar) {
        this.f19065w = true;
        config.m23867t(this);
    }

    /* renamed from: A_ */
    public void mo9671A_() {
        if (this.f19065w) {
            abrir_secc(this.f19067y);
        }
    }

    /* renamed from: e */
    public void mo9676e() {
        this.f19065w = false;
    }

    /* renamed from: a */
    public void mo9674a(int i) {
        if (!this.f19046d.mo20775a((Context) this, this.f19062t)) {
            this.f19068z.cancel();
            abrir_secc(this.f19067y);
        }
    }

    public void onError(C1514Ad ad, AdError adError) {
        this.f19068z.cancel();
        abrir_secc(this.f19067y);
    }

    public void onAdLoaded(C1514Ad ad) {
        this.f19068z.cancel();
        this.f19063u.show();
    }

    public void onRewardedVideoCompleted() {
        this.f19065w = true;
        config.m23867t(this);
    }

    public void onRewardedVideoClosed() {
        if (this.f19065w) {
            abrir_secc(this.f19067y);
        }
    }

    public void onVideoCompleted() {
        this.f19065w = true;
        config.m23867t(this);
    }

    public void onReceiveAd(C5286Ad ad) {
        this.f19068z.cancel();
        this.f19064v.showAd("REWARDED VIDEO", new AdDisplayListener() {
            public void adClicked(C5286Ad ad) {
            }

            public void adDisplayed(C5286Ad ad) {
            }

            public void adNotDisplayed(C5286Ad ad) {
            }

            public void adHidden(C5286Ad ad) {
                if (t_gal.this.f19065w) {
                    t_gal.this.abrir_secc(t_gal.this.f19067y);
                }
            }
        });
    }

    public void onFailedToReceiveAd(C5286Ad ad) {
        this.f19068z.cancel();
        abrir_secc(this.f19067y);
    }
}
