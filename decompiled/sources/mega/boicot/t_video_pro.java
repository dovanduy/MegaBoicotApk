package mega.boicot;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
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
import android.graphics.BitmapFactory.Options;
import android.graphics.Color;
import android.graphics.PorterDuff.Mode;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.GradientDrawable.Orientation;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnErrorListener;
import android.media.MediaPlayer.OnPreparedListener;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.AsyncTask.Status;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore.Images.Media;
import android.support.p017v4.widget.DrawerLayout;
import android.view.View;
import android.view.View.OnClickListener;
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
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
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

public class t_video_pro extends Activity implements OnClickListener, OnAdClosed, OnAdError, OnAdLoaded, OnVideoEnded, RewardedVideoAdListener, C3167c, VideoListener, AdEventListener, C5599a {

    /* renamed from: A */
    SharedPreferences f20707A;

    /* renamed from: B */
    LinearLayout f20708B;

    /* renamed from: C */
    Bitmap f20709C;

    /* renamed from: D */
    File f20710D;

    /* renamed from: E */
    C6235c f20711E;

    /* renamed from: F */
    C6239g f20712F;

    /* renamed from: G */
    C6236d f20713G;

    /* renamed from: H */
    Builder f20714H;

    /* renamed from: I */
    View f20715I;

    /* renamed from: J */
    ListView f20716J;

    /* renamed from: K */
    boolean f20717K = false;

    /* renamed from: L */
    boolean f20718L = false;

    /* renamed from: M */
    boolean f20719M = false;

    /* renamed from: N */
    boolean f20720N;

    /* renamed from: O */
    FullscreenVideoLayout_pro f20721O;

    /* renamed from: P */
    int f20722P = 0;
    /* access modifiers changed from: private */

    /* renamed from: Q */
    public ArrayList<C6029o> f20723Q;
    /* access modifiers changed from: private */

    /* renamed from: R */
    public C6021n f20724R;

    /* renamed from: a */
    config f20725a;

    /* renamed from: b */
    Bundle f20726b;

    /* renamed from: c */
    int f20727c;

    /* renamed from: d */
    int f20728d;

    /* renamed from: e */
    int f20729e = 0;

    /* renamed from: f */
    int f20730f;

    /* renamed from: g */
    C5602c f20731g;

    /* renamed from: h */
    C3166b f20732h;

    /* renamed from: i */
    RewardedVideo f20733i;

    /* renamed from: j */
    RewardedVideoAd f20734j;

    /* renamed from: k */
    StartAppAd f20735k;

    /* renamed from: l */
    boolean f20736l = false;

    /* renamed from: m */
    boolean f20737m = false;

    /* renamed from: n */
    boolean f20738n;

    /* renamed from: o */
    String f20739o;

    /* renamed from: p */
    String f20740p;

    /* renamed from: q */
    String f20741q;

    /* renamed from: r */
    String f20742r;

    /* renamed from: s */
    String f20743s;

    /* renamed from: t */
    String f20744t;

    /* renamed from: u */
    String f20745u;

    /* renamed from: v */
    String f20746v;

    /* renamed from: w */
    String f20747w;

    /* renamed from: x */
    View f20748x;

    /* renamed from: y */
    ProgressDialog f20749y;

    /* renamed from: z */
    ProgressBar f20750z;

    /* renamed from: mega.boicot.t_video_pro$a */
    private class C6232a extends AsyncTask<String, Void, String> {
        private C6232a() {
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x0082  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.String doInBackground(java.lang.String... r6) {
            /*
                r5 = this;
                r6 = 0
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x007e }
                r0.<init>()     // Catch:{ Exception -> 0x007e }
                java.lang.String r1 = "https://global.appnext.com/offerWallApi.aspx?id="
                r0.append(r1)     // Catch:{ Exception -> 0x007e }
                mega.boicot.t_video_pro r1 = mega.boicot.t_video_pro.this     // Catch:{ Exception -> 0x007e }
                mega.boicot.config r1 = r1.f20725a     // Catch:{ Exception -> 0x007e }
                java.lang.String r1 = r1.f18005ch     // Catch:{ Exception -> 0x007e }
                r0.append(r1)     // Catch:{ Exception -> 0x007e }
                java.lang.String r1 = "&type=vast&vast_ver=3.0&duration=all&packageId="
                r0.append(r1)     // Catch:{ Exception -> 0x007e }
                mega.boicot.t_video_pro r1 = mega.boicot.t_video_pro.this     // Catch:{ Exception -> 0x007e }
                java.lang.String r1 = r1.getPackageName()     // Catch:{ Exception -> 0x007e }
                r0.append(r1)     // Catch:{ Exception -> 0x007e }
                java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x007e }
                java.net.URL r1 = new java.net.URL     // Catch:{ Exception -> 0x007e }
                r1.<init>(r0)     // Catch:{ Exception -> 0x007e }
                java.net.URLConnection r0 = r1.openConnection()     // Catch:{ Exception -> 0x007e }
                java.net.HttpURLConnection r0 = (java.net.HttpURLConnection) r0     // Catch:{ Exception -> 0x007e }
                r6 = 1
                r0.setDoInput(r6)     // Catch:{ Exception -> 0x0077, all -> 0x0075 }
                r6 = 10000(0x2710, float:1.4013E-41)
                r0.setConnectTimeout(r6)     // Catch:{ Exception -> 0x0077, all -> 0x0075 }
                r0.setReadTimeout(r6)     // Catch:{ Exception -> 0x0077, all -> 0x0075 }
                java.io.InputStream r6 = r0.getInputStream()     // Catch:{ Exception -> 0x0077, all -> 0x0075 }
                java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch:{ Exception -> 0x0077, all -> 0x0075 }
                java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x0077, all -> 0x0075 }
                r2.<init>(r6)     // Catch:{ Exception -> 0x0077, all -> 0x0075 }
                r1.<init>(r2)     // Catch:{ Exception -> 0x0077, all -> 0x0075 }
                java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0077, all -> 0x0075 }
                r6.<init>()     // Catch:{ Exception -> 0x0077, all -> 0x0075 }
            L_0x0050:
                java.lang.String r2 = r1.readLine()     // Catch:{ Exception -> 0x0077, all -> 0x0075 }
                if (r2 == 0) goto L_0x006b
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0077, all -> 0x0075 }
                r3.<init>()     // Catch:{ Exception -> 0x0077, all -> 0x0075 }
                r3.append(r2)     // Catch:{ Exception -> 0x0077, all -> 0x0075 }
                java.lang.String r2 = "\n"
                r3.append(r2)     // Catch:{ Exception -> 0x0077, all -> 0x0075 }
                java.lang.String r2 = r3.toString()     // Catch:{ Exception -> 0x0077, all -> 0x0075 }
                r6.append(r2)     // Catch:{ Exception -> 0x0077, all -> 0x0075 }
                goto L_0x0050
            L_0x006b:
                java.lang.String r6 = r6.toString()     // Catch:{ Exception -> 0x0077, all -> 0x0075 }
                if (r0 == 0) goto L_0x0074
                r0.disconnect()
            L_0x0074:
                return r6
            L_0x0075:
                r6 = move-exception
                goto L_0x0086
            L_0x0077:
                r6 = r0
                goto L_0x007e
            L_0x0079:
                r0 = move-exception
                r4 = r0
                r0 = r6
                r6 = r4
                goto L_0x0086
            L_0x007e:
                java.lang.String r0 = ""
                if (r6 == 0) goto L_0x0085
                r6.disconnect()
            L_0x0085:
                return r0
            L_0x0086:
                if (r0 == 0) goto L_0x008b
                r0.disconnect()
            L_0x008b:
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: mega.boicot.t_video_pro.C6232a.doInBackground(java.lang.String[]):java.lang.String");
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Removed duplicated region for block: B:13:0x0061  */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x0091  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onPostExecute(java.lang.String r7) {
            /*
                r6 = this;
                java.lang.String r0 = ""
                java.lang.String r1 = "<Ad id="
                boolean r1 = r7.contains(r1)
                r2 = 0
                if (r1 == 0) goto L_0x005e
                java.lang.String r1 = "<Impression><![CDATA["
                int r1 = r7.indexOf(r1)
                r3 = -1
                if (r1 == r3) goto L_0x005e
                int r1 = r1 + 21
                java.lang.String r4 = "]"
                int r4 = r7.indexOf(r4, r1)
                mega.boicot.t_video_pro r5 = mega.boicot.t_video_pro.this
                mega.boicot.FullscreenVideoLayout_pro r5 = r5.f20721O
                java.lang.String r1 = r7.substring(r1, r4)
                r5.f19475b = r1
                java.lang.String r1 = "<ClickThrough><![CDATA["
                int r1 = r7.indexOf(r1)
                if (r1 == r3) goto L_0x005e
                int r1 = r1 + 23
                java.lang.String r4 = "]"
                int r4 = r7.indexOf(r4, r1)
                mega.boicot.t_video_pro r5 = mega.boicot.t_video_pro.this
                mega.boicot.FullscreenVideoLayout_pro r5 = r5.f20721O
                java.lang.String r1 = r7.substring(r1, r4)
                r5.f19476c = r1
                java.lang.String r1 = "width=\"320\" height=\"180\""
                int r1 = r7.indexOf(r1)
                if (r1 == r3) goto L_0x005e
                java.lang.String r4 = "><![CDATA["
                int r1 = r7.indexOf(r4, r1)
                if (r1 == r3) goto L_0x005e
                int r1 = r1 + 10
                java.lang.String r0 = "]"
                int r0 = r7.indexOf(r0, r1)
                java.lang.String r0 = r7.substring(r1, r0)
                r7 = 1
                goto L_0x005f
            L_0x005e:
                r7 = r2
            L_0x005f:
                if (r7 == 0) goto L_0x0091
                android.net.Uri r7 = android.net.Uri.parse(r0)
                mega.boicot.t_video_pro r0 = mega.boicot.t_video_pro.this
                r1 = 2131230817(0x7f080061, float:1.8077697E38)
                android.view.View r0 = r0.findViewById(r1)
                mega.boicot.t_video_pro$a$1 r1 = new mega.boicot.t_video_pro$a$1
                r1.<init>()
                r0.setOnClickListener(r1)
                mega.boicot.t_video_pro r0 = mega.boicot.t_video_pro.this
                mega.boicot.FullscreenVideoLayout_pro r0 = r0.f20721O
                r0.f19486n = r2
                mega.boicot.t_video_pro r0 = mega.boicot.t_video_pro.this
                mega.boicot.FullscreenVideoLayout_pro r0 = r0.f20721O
                r0.mo21518m()
                mega.boicot.t_video_pro r0 = mega.boicot.t_video_pro.this     // Catch:{ IOException -> 0x008c }
                mega.boicot.FullscreenVideoLayout_pro r0 = r0.f20721O     // Catch:{ IOException -> 0x008c }
                r1 = 0
                r0.mo21557a(r7, r1)     // Catch:{ IOException -> 0x008c }
                goto L_0x0096
            L_0x008c:
                r7 = move-exception
                r7.printStackTrace()
                goto L_0x0096
            L_0x0091:
                mega.boicot.t_video_pro r7 = mega.boicot.t_video_pro.this
                r7.m24786h()
            L_0x0096:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: mega.boicot.t_video_pro.C6232a.onPostExecute(java.lang.String):void");
        }
    }

    /* renamed from: mega.boicot.t_video_pro$b */
    private class C6234b extends AsyncTask<String, Void, String> {

        /* renamed from: a */
        boolean f20774a;

        C6234b(boolean z) {
            this.f20774a = z;
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
            t_video_pro.this.findViewById(R.id.fl_mascoments).setVisibility(8);
            if (t_video_pro.this.f20738n) {
                t_video_pro.this.findViewById(R.id.pb_mascoments_inv).setVisibility(0);
            } else {
                t_video_pro.this.findViewById(R.id.pb_mascoments).setVisibility(0);
            }
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x00c3  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.String doInBackground(java.lang.String... r5) {
            /*
                r4 = this;
                mega.boicot.t_video_pro r5 = mega.boicot.t_video_pro.this
                java.lang.String r5 = r5.f20745u
                java.lang.String r0 = "0"
                boolean r1 = r4.f20774a
                if (r1 == 0) goto L_0x000e
                java.lang.String r5 = "0"
                java.lang.String r0 = "1"
            L_0x000e:
                r1 = 0
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00bf }
                r2.<init>()     // Catch:{ Exception -> 0x00bf }
                java.lang.String r3 = "http://"
                r2.append(r3)     // Catch:{ Exception -> 0x00bf }
                java.lang.String r3 = mega.boicot.config.f17839g     // Catch:{ Exception -> 0x00bf }
                r2.append(r3)     // Catch:{ Exception -> 0x00bf }
                java.lang.String r3 = "/srv/coments_video.php?idusu="
                r2.append(r3)     // Catch:{ Exception -> 0x00bf }
                mega.boicot.t_video_pro r3 = mega.boicot.t_video_pro.this     // Catch:{ Exception -> 0x00bf }
                int r3 = r3.f20727c     // Catch:{ Exception -> 0x00bf }
                r2.append(r3)     // Catch:{ Exception -> 0x00bf }
                java.lang.String r3 = "&c="
                r2.append(r3)     // Catch:{ Exception -> 0x00bf }
                mega.boicot.t_video_pro r3 = mega.boicot.t_video_pro.this     // Catch:{ Exception -> 0x00bf }
                java.lang.String r3 = r3.f20739o     // Catch:{ Exception -> 0x00bf }
                r2.append(r3)     // Catch:{ Exception -> 0x00bf }
                java.lang.String r3 = "&idusu_pro="
                r2.append(r3)     // Catch:{ Exception -> 0x00bf }
                mega.boicot.t_video_pro r3 = mega.boicot.t_video_pro.this     // Catch:{ Exception -> 0x00bf }
                java.lang.String r3 = r3.f20743s     // Catch:{ Exception -> 0x00bf }
                r2.append(r3)     // Catch:{ Exception -> 0x00bf }
                java.lang.String r3 = "&idv="
                r2.append(r3)     // Catch:{ Exception -> 0x00bf }
                mega.boicot.t_video_pro r3 = mega.boicot.t_video_pro.this     // Catch:{ Exception -> 0x00bf }
                java.lang.String r3 = r3.f20741q     // Catch:{ Exception -> 0x00bf }
                r2.append(r3)     // Catch:{ Exception -> 0x00bf }
                java.lang.String r3 = "&idc="
                r2.append(r3)     // Catch:{ Exception -> 0x00bf }
                r2.append(r5)     // Catch:{ Exception -> 0x00bf }
                java.lang.String r5 = "&es_ini="
                r2.append(r5)     // Catch:{ Exception -> 0x00bf }
                r2.append(r0)     // Catch:{ Exception -> 0x00bf }
                java.lang.String r5 = r2.toString()     // Catch:{ Exception -> 0x00bf }
                java.net.URL r0 = new java.net.URL     // Catch:{ Exception -> 0x00bf }
                r0.<init>(r5)     // Catch:{ Exception -> 0x00bf }
                java.net.URLConnection r5 = r0.openConnection()     // Catch:{ Exception -> 0x00bf }
                java.net.HttpURLConnection r5 = (java.net.HttpURLConnection) r5     // Catch:{ Exception -> 0x00bf }
                r0 = 1
                r5.setDoInput(r0)     // Catch:{ Exception -> 0x00bb, all -> 0x00b8 }
                r0 = 10000(0x2710, float:1.4013E-41)
                r5.setConnectTimeout(r0)     // Catch:{ Exception -> 0x00bb, all -> 0x00b8 }
                r5.setReadTimeout(r0)     // Catch:{ Exception -> 0x00bb, all -> 0x00b8 }
                java.lang.String r0 = "User-Agent"
                java.lang.String r1 = "Android Vinebre Software"
                r5.setRequestProperty(r0, r1)     // Catch:{ Exception -> 0x00bb, all -> 0x00b8 }
                java.io.InputStream r0 = r5.getInputStream()     // Catch:{ Exception -> 0x00bb, all -> 0x00b8 }
                java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch:{ Exception -> 0x00bb, all -> 0x00b8 }
                java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x00bb, all -> 0x00b8 }
                r2.<init>(r0)     // Catch:{ Exception -> 0x00bb, all -> 0x00b8 }
                r1.<init>(r2)     // Catch:{ Exception -> 0x00bb, all -> 0x00b8 }
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00bb, all -> 0x00b8 }
                r0.<init>()     // Catch:{ Exception -> 0x00bb, all -> 0x00b8 }
            L_0x0093:
                java.lang.String r2 = r1.readLine()     // Catch:{ Exception -> 0x00bb, all -> 0x00b8 }
                if (r2 == 0) goto L_0x00ae
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00bb, all -> 0x00b8 }
                r3.<init>()     // Catch:{ Exception -> 0x00bb, all -> 0x00b8 }
                r3.append(r2)     // Catch:{ Exception -> 0x00bb, all -> 0x00b8 }
                java.lang.String r2 = "\n"
                r3.append(r2)     // Catch:{ Exception -> 0x00bb, all -> 0x00b8 }
                java.lang.String r2 = r3.toString()     // Catch:{ Exception -> 0x00bb, all -> 0x00b8 }
                r0.append(r2)     // Catch:{ Exception -> 0x00bb, all -> 0x00b8 }
                goto L_0x0093
            L_0x00ae:
                java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x00bb, all -> 0x00b8 }
                if (r5 == 0) goto L_0x00b7
                r5.disconnect()
            L_0x00b7:
                return r0
            L_0x00b8:
                r0 = move-exception
                r1 = r5
                goto L_0x00c7
            L_0x00bb:
                r1 = r5
                goto L_0x00bf
            L_0x00bd:
                r0 = move-exception
                goto L_0x00c7
            L_0x00bf:
                java.lang.String r5 = ""
                if (r1 == 0) goto L_0x00c6
                r1.disconnect()
            L_0x00c6:
                return r5
            L_0x00c7:
                if (r1 == 0) goto L_0x00cc
                r1.disconnect()
            L_0x00cc:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: mega.boicot.t_video_pro.C6234b.doInBackground(java.lang.String[]):java.lang.String");
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void onPostExecute(String str) {
            int i;
            int i2;
            String str2 = str;
            try {
                t_video_pro.this.findViewById(R.id.pb_mascoments).setVisibility(8);
                t_video_pro.this.findViewById(R.id.pb_mascoments_inv).setVisibility(8);
            } catch (Exception unused) {
            }
            if (str2.contains("ANDROID:OK DATOS:")) {
                int indexOf = str2.indexOf("DATOS:") + 6;
                String[] split = str2.substring(indexOf, str2.indexOf(";", indexOf)).split(",");
                char c = 1;
                char c2 = 0;
                if (this.f20774a) {
                    Editor edit = t_video_pro.this.f20707A.edit();
                    for (int i3 = 0; i3 < 4; i3++) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("idcomv");
                        sb.append(i3);
                        sb.append("_");
                        sb.append(t_video_pro.this.f20741q);
                        edit.remove(sb.toString());
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("comv");
                        sb2.append(i3);
                        sb2.append("_");
                        sb2.append(t_video_pro.this.f20741q);
                        edit.remove(sb2.toString());
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("comv");
                        sb3.append(i3);
                        sb3.append("_fcrea_");
                        sb3.append(t_video_pro.this.f20741q);
                        edit.remove(sb3.toString());
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("comv");
                        sb4.append(i3);
                        sb4.append("_idusucrea_");
                        sb4.append(t_video_pro.this.f20741q);
                        edit.remove(sb4.toString());
                        StringBuilder sb5 = new StringBuilder();
                        sb5.append("comv");
                        sb5.append(i3);
                        sb5.append("_nombre_");
                        sb5.append(t_video_pro.this.f20741q);
                        edit.remove(sb5.toString());
                        StringBuilder sb6 = new StringBuilder();
                        sb6.append("comv");
                        sb6.append(i3);
                        sb6.append("_vfoto_");
                        sb6.append(t_video_pro.this.f20741q);
                        edit.remove(sb6.toString());
                        StringBuilder sb7 = new StringBuilder();
                        sb7.append("comv");
                        sb7.append(i3);
                        sb7.append("_privados_");
                        sb7.append(t_video_pro.this.f20741q);
                        edit.remove(sb7.toString());
                        StringBuilder sb8 = new StringBuilder();
                        sb8.append("comv");
                        sb8.append(i3);
                        sb8.append("_fnacd_");
                        sb8.append(t_video_pro.this.f20741q);
                        edit.remove(sb8.toString());
                        StringBuilder sb9 = new StringBuilder();
                        sb9.append("comv");
                        sb9.append(i3);
                        sb9.append("_fnacm_");
                        sb9.append(t_video_pro.this.f20741q);
                        edit.remove(sb9.toString());
                        StringBuilder sb10 = new StringBuilder();
                        sb10.append("comv");
                        sb10.append(i3);
                        sb10.append("_fnaca_");
                        sb10.append(t_video_pro.this.f20741q);
                        edit.remove(sb10.toString());
                        StringBuilder sb11 = new StringBuilder();
                        sb11.append("comv");
                        sb11.append(i3);
                        sb11.append("_sexo_");
                        sb11.append(t_video_pro.this.f20741q);
                        edit.remove(sb11.toString());
                        StringBuilder sb12 = new StringBuilder();
                        sb12.append("comv");
                        sb12.append(i3);
                        sb12.append("_coments_");
                        sb12.append(t_video_pro.this.f20741q);
                        edit.remove(sb12.toString());
                    }
                    i = 0;
                    while (!split[i].equals("S") && !split[i].equals("N")) {
                        String[] split2 = split[i].split("-");
                        StringBuilder sb13 = new StringBuilder();
                        sb13.append("idcomv");
                        sb13.append(i);
                        sb13.append("_");
                        sb13.append(t_video_pro.this.f20741q);
                        edit.putString(sb13.toString(), split2[c2]);
                        StringBuilder sb14 = new StringBuilder();
                        sb14.append("comv");
                        sb14.append(i);
                        sb14.append("_");
                        sb14.append(t_video_pro.this.f20741q);
                        edit.putString(sb14.toString(), split2[c].replace("@X@", "-").replace("@Y@", ","));
                        StringBuilder sb15 = new StringBuilder();
                        sb15.append("comv");
                        sb15.append(i);
                        sb15.append("_fcrea_");
                        sb15.append(t_video_pro.this.f20741q);
                        edit.putString(sb15.toString(), split2[2]);
                        StringBuilder sb16 = new StringBuilder();
                        sb16.append("comv");
                        sb16.append(i);
                        sb16.append("_idusucrea_");
                        sb16.append(t_video_pro.this.f20741q);
                        edit.putString(sb16.toString(), split2[3]);
                        StringBuilder sb17 = new StringBuilder();
                        sb17.append("comv");
                        sb17.append(i);
                        sb17.append("_nombre_");
                        sb17.append(t_video_pro.this.f20741q);
                        edit.putString(sb17.toString(), split2[4]);
                        StringBuilder sb18 = new StringBuilder();
                        sb18.append("comv");
                        sb18.append(i);
                        sb18.append("_vfoto_");
                        sb18.append(t_video_pro.this.f20741q);
                        edit.putString(sb18.toString(), split2[5]);
                        StringBuilder sb19 = new StringBuilder();
                        sb19.append("comv");
                        sb19.append(i);
                        sb19.append("_privados_");
                        sb19.append(t_video_pro.this.f20741q);
                        edit.putString(sb19.toString(), split2[6]);
                        StringBuilder sb20 = new StringBuilder();
                        sb20.append("comv");
                        sb20.append(i);
                        sb20.append("_fnacd_");
                        sb20.append(t_video_pro.this.f20741q);
                        edit.putString(sb20.toString(), split2[7]);
                        StringBuilder sb21 = new StringBuilder();
                        sb21.append("comv");
                        sb21.append(i);
                        sb21.append("_fnacm_");
                        sb21.append(t_video_pro.this.f20741q);
                        edit.putString(sb21.toString(), split2[8]);
                        StringBuilder sb22 = new StringBuilder();
                        sb22.append("comv");
                        sb22.append(i);
                        sb22.append("_fnaca_");
                        sb22.append(t_video_pro.this.f20741q);
                        edit.putString(sb22.toString(), split2[9]);
                        StringBuilder sb23 = new StringBuilder();
                        sb23.append("comv");
                        sb23.append(i);
                        sb23.append("_sexo_");
                        sb23.append(t_video_pro.this.f20741q);
                        edit.putString(sb23.toString(), split2[10]);
                        StringBuilder sb24 = new StringBuilder();
                        sb24.append("comv");
                        sb24.append(i);
                        sb24.append("_coments_");
                        sb24.append(t_video_pro.this.f20741q);
                        edit.putString(sb24.toString(), split2[11]);
                        i++;
                        c = 1;
                        c2 = 0;
                    }
                    edit.commit();
                    t_video_pro.this.mo22313a(false);
                } else {
                    int i4 = 0;
                    while (!split[i].equals("S") && !split[i].equals("N")) {
                        String[] split3 = split[i].split("-");
                        String replace = split3[1].replace("@X@", "-").replace("@Y@", ",");
                        t_video_pro.this.mo22312a(Boolean.valueOf(false), Boolean.valueOf(false), split3[0], split3[3], split3[4], split3[2], replace, split3[5], split3[6], split3[7], split3[8], split3[9], split3[10], split3[11]);
                        i4 = i + 1;
                    }
                }
                if (t_video_pro.this.f20711E == null || t_video_pro.this.f20711E.getStatus() != Status.RUNNING) {
                    t_video_pro.this.f20711E = new C6235c();
                    i2 = 0;
                    t_video_pro.this.f20711E.execute(new String[0]);
                } else {
                    i2 = 0;
                }
                if (split[i].equals("S")) {
                    t_video_pro.this.findViewById(R.id.fl_mascoments).setVisibility(i2);
                }
                if (this.f20774a && !t_video_pro.this.f20726b.containsKey("nlikes")) {
                    t_video_pro.this.f20740p = split[i + 1];
                    t_video_pro.this.f20742r = split[i + 2];
                    t_video_pro.this.m24787i();
                }
            }
        }
    }

    /* renamed from: mega.boicot.t_video_pro$c */
    private class C6235c extends AsyncTask<String, Void, String> {

        /* renamed from: a */
        String f20776a;

        /* renamed from: b */
        String f20777b;

        /* renamed from: c */
        Bitmap f20778c;

        private C6235c() {
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
            for (int i = 0; i < t_video_pro.this.f20708B.getChildCount(); i++) {
                LinearLayout linearLayout = (LinearLayout) t_video_pro.this.f20708B.getChildAt(i);
                String str = (String) linearLayout.findViewById(R.id.iv_usucoment).getTag(R.id.idaux1);
                this.f20777b = (String) linearLayout.findViewById(R.id.iv_usucoment).getTag(R.id.idaux2);
                if (this.f20777b != null && !this.f20777b.equals("0")) {
                    String str2 = this.f20777b;
                    SharedPreferences sharedPreferences = t_video_pro.this.f20707A;
                    StringBuilder sb = new StringBuilder();
                    sb.append("fperfil_");
                    sb.append(str);
                    if (!str2.equals(sharedPreferences.getString(sb.toString(), "0"))) {
                        this.f20776a = str;
                        return;
                    }
                }
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public String doInBackground(String... strArr) {
            if (this.f20776a == null) {
                return "-1";
            }
            try {
                StringBuilder sb = new StringBuilder();
                sb.append("http://imgs1.e-droid.net/srv/imgs/usus/");
                sb.append(this.f20776a);
                sb.append("_1_p.jpg?v=");
                sb.append(this.f20777b);
                try {
                    HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(sb.toString()).openConnection();
                    httpURLConnection.setDoInput(true);
                    httpURLConnection.setConnectTimeout(10000);
                    httpURLConnection.setReadTimeout(20000);
                    httpURLConnection.connect();
                    InputStream inputStream = httpURLConnection.getInputStream();
                    try {
                        this.f20778c = BitmapFactory.decodeStream(inputStream);
                        inputStream.close();
                        httpURLConnection.disconnect();
                        File file = t_video_pro.this.f20710D;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("fperfil_");
                        sb2.append(this.f20776a);
                        sb2.append(".jpg");
                        try {
                            this.f20778c.compress(CompressFormat.JPEG, 70, new FileOutputStream(new File(file, sb2.toString())));
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
            if (t_video_pro.this.f20708B != null && this.f20776a != null && !str.equals("-1")) {
                if (str == "1") {
                    Editor edit = t_video_pro.this.f20707A.edit();
                    StringBuilder sb = new StringBuilder();
                    sb.append("fperfil_");
                    sb.append(this.f20776a);
                    edit.putString(sb.toString(), this.f20777b);
                    edit.commit();
                }
                int childCount = t_video_pro.this.f20708B.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    String str2 = (String) t_video_pro.this.f20708B.getChildAt(i).findViewById(R.id.iv_usucoment).getTag(R.id.idaux1);
                    if (str2 != null && str2.equals(this.f20776a)) {
                        t_video_pro.this.f20708B.getChildAt(i).findViewById(R.id.iv_usucoment).setTag(R.id.idaux2, this.f20777b);
                        if (str == "1") {
                            ((ImageView) t_video_pro.this.f20708B.getChildAt(i).findViewById(R.id.iv_usucoment)).setImageBitmap(this.f20778c);
                        }
                    }
                }
                new C6235c().execute(new String[0]);
            }
        }
    }

    /* renamed from: mega.boicot.t_video_pro$d */
    private class C6236d extends AsyncTask<String, Void, String> {
        private C6236d() {
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
            t_video_pro.this.f20715I.findViewById(R.id.likes_pb).setVisibility(0);
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
                mega.boicot.t_video_pro r1 = mega.boicot.t_video_pro.this     // Catch:{ Exception -> 0x00a3 }
                int r1 = r1.f20727c     // Catch:{ Exception -> 0x00a3 }
                r0.append(r1)     // Catch:{ Exception -> 0x00a3 }
                java.lang.String r1 = "&c="
                r0.append(r1)     // Catch:{ Exception -> 0x00a3 }
                mega.boicot.t_video_pro r1 = mega.boicot.t_video_pro.this     // Catch:{ Exception -> 0x00a3 }
                java.lang.String r1 = r1.f20739o     // Catch:{ Exception -> 0x00a3 }
                r0.append(r1)     // Catch:{ Exception -> 0x00a3 }
                java.lang.String r1 = "&id_videogal="
                r0.append(r1)     // Catch:{ Exception -> 0x00a3 }
                mega.boicot.t_video_pro r1 = mega.boicot.t_video_pro.this     // Catch:{ Exception -> 0x00a3 }
                java.lang.String r1 = r1.f20741q     // Catch:{ Exception -> 0x00a3 }
                r0.append(r1)     // Catch:{ Exception -> 0x00a3 }
                java.lang.String r1 = "&n="
                r0.append(r1)     // Catch:{ Exception -> 0x00a3 }
                mega.boicot.t_video_pro r1 = mega.boicot.t_video_pro.this     // Catch:{ Exception -> 0x00a3 }
                int r1 = r1.f20729e     // Catch:{ Exception -> 0x00a3 }
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
            throw new UnsupportedOperationException("Method not decompiled: mega.boicot.t_video_pro.C6236d.doInBackground(java.lang.String[]):java.lang.String");
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void onPostExecute(String str) {
            boolean z;
            try {
                t_video_pro.this.f20715I.findViewById(R.id.likes_pb).setVisibility(8);
            } catch (Exception unused) {
            }
            if (str.contains("ANDROID:OK DATOS:")) {
                int indexOf = str.indexOf("DATOS:") + 6;
                String[] split = str.substring(indexOf, str.indexOf(";", indexOf)).split(",");
                if (t_video_pro.this.f20723Q.size() == 0) {
                    if (t_video_pro.this.f20742r.equals("1")) {
                        C6029o oVar = new C6029o();
                        StringBuilder sb = new StringBuilder();
                        sb.append(t_video_pro.this.f20727c);
                        sb.append("");
                        oVar.f19938f = sb.toString();
                        oVar.f19937e = t_video_pro.this.getResources().getString(R.string.tu);
                        oVar.f19934b = t_video_pro.this.f20725a.mo20757a((Context) t_video_pro.this, 1).exists();
                        t_video_pro.this.f20723Q.add(oVar);
                    }
                } else if (((C6029o) t_video_pro.this.f20723Q.get(t_video_pro.this.f20723Q.size() - 1)).f19935c) {
                    t_video_pro.this.f20723Q.remove(t_video_pro.this.f20723Q.size() - 1);
                }
                int i = 0;
                while (!split[i].equals("S") && !split[i].equals("N")) {
                    String[] split2 = split[i].split("-");
                    int i2 = 0;
                    while (true) {
                        if (i2 >= t_video_pro.this.f20723Q.size()) {
                            z = false;
                            break;
                        } else if (((C6029o) t_video_pro.this.f20723Q.get(i2)).f19938f.equals(split2[0])) {
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
                        t_video_pro.this.f20723Q.add(oVar2);
                        t_video_pro.this.f20729e++;
                    }
                    i++;
                }
                if (split[i].equals("S")) {
                    C6029o oVar3 = new C6029o();
                    oVar3.f19935c = true;
                    t_video_pro.this.f20723Q.add(oVar3);
                }
                t_video_pro.this.f20724R.notifyDataSetChanged();
            }
        }
    }

    /* renamed from: mega.boicot.t_video_pro$e */
    private class C6237e extends AsyncTask<String, Void, Byte> {

        /* renamed from: a */
        String f20781a;

        C6237e(String str) {
            this.f20781a = str;
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
                java.lang.String r1 = "/srv/eliminar_coment_video.php?idusu="
                r0.append(r1)     // Catch:{ Exception -> 0x0095 }
                mega.boicot.t_video_pro r1 = mega.boicot.t_video_pro.this     // Catch:{ Exception -> 0x0095 }
                int r1 = r1.f20727c     // Catch:{ Exception -> 0x0095 }
                r0.append(r1)     // Catch:{ Exception -> 0x0095 }
                java.lang.String r1 = "&c="
                r0.append(r1)     // Catch:{ Exception -> 0x0095 }
                mega.boicot.t_video_pro r1 = mega.boicot.t_video_pro.this     // Catch:{ Exception -> 0x0095 }
                java.lang.String r1 = r1.f20739o     // Catch:{ Exception -> 0x0095 }
                r0.append(r1)     // Catch:{ Exception -> 0x0095 }
                java.lang.String r1 = "&idc="
                r0.append(r1)     // Catch:{ Exception -> 0x0095 }
                java.lang.String r1 = r6.f20781a     // Catch:{ Exception -> 0x0095 }
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
            throw new UnsupportedOperationException("Method not decompiled: mega.boicot.t_video_pro.C6237e.doInBackground(java.lang.String[]):java.lang.Byte");
        }
    }

    /* renamed from: mega.boicot.t_video_pro$f */
    private class C6238f extends AsyncTask<String, Void, Byte> {

        /* renamed from: a */
        String f20783a;

        C6238f(String str) {
            this.f20783a = str;
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
                java.lang.String r1 = "/srv/eliminar_videogal.php?idusu="
                r0.append(r1)     // Catch:{ Exception -> 0x0095 }
                mega.boicot.t_video_pro r1 = mega.boicot.t_video_pro.this     // Catch:{ Exception -> 0x0095 }
                int r1 = r1.f20727c     // Catch:{ Exception -> 0x0095 }
                r0.append(r1)     // Catch:{ Exception -> 0x0095 }
                java.lang.String r1 = "&c="
                r0.append(r1)     // Catch:{ Exception -> 0x0095 }
                mega.boicot.t_video_pro r1 = mega.boicot.t_video_pro.this     // Catch:{ Exception -> 0x0095 }
                java.lang.String r1 = r1.f20739o     // Catch:{ Exception -> 0x0095 }
                r0.append(r1)     // Catch:{ Exception -> 0x0095 }
                java.lang.String r1 = "&idv="
                r0.append(r1)     // Catch:{ Exception -> 0x0095 }
                java.lang.String r1 = r6.f20783a     // Catch:{ Exception -> 0x0095 }
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
            throw new UnsupportedOperationException("Method not decompiled: mega.boicot.t_video_pro.C6238f.doInBackground(java.lang.String[]):java.lang.Byte");
        }
    }

    /* renamed from: mega.boicot.t_video_pro$g */
    private class C6239g extends AsyncTask<String, Void, String> {

        /* renamed from: a */
        String f20785a;

        public C6239g(String str) {
            this.f20785a = str;
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
                sb.append("/srv/enviar_coment_video.php?idusu=");
                sb.append(t_video_pro.this.f20727c);
                sb.append("&c=");
                sb.append(t_video_pro.this.f20739o);
                sb.append("&idusu_pro=");
                sb.append(t_video_pro.this.f20743s);
                sb.append("&idv=");
                sb.append(t_video_pro.this.f20741q);
                C6274e eVar = new C6274e(sb.toString());
                C6370g gVar = new C6370g(C6367d.BROWSER_COMPATIBLE);
                gVar.mo22648a("m", (C6360c) new C6363f(URLEncoder.encode(this.f20785a, C2793C.UTF8_NAME)));
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
            Builder builder = new Builder(t_video_pro.this);
            try {
                t_video_pro.this.f20750z.setVisibility(8);
                if (t_video_pro.this.f20738n || VERSION.SDK_INT <= 12) {
                    ((TextView) t_video_pro.this.findViewById(R.id.et_coment_self)).setTextColor(-16777216);
                } else {
                    ((TextView) t_video_pro.this.findViewById(R.id.et_coment_self)).setTextColor(-1);
                }
            } catch (Exception unused) {
            }
            if (str2.indexOf("ANDROID:OK ID:") != -1) {
                int indexOf = str2.indexOf("ANDROID:OK ID:") + 14;
                String substring = str2.substring(indexOf, str2.indexOf("-", indexOf));
                ((EditText) t_video_pro.this.findViewById(R.id.et_coment_self)).setText("");
                String c = config.m23851c(new SimpleDateFormat("ddMMyyHHmm").format(new Date()));
                t_video_pro t_video_pro = t_video_pro.this;
                Boolean valueOf = Boolean.valueOf(false);
                Boolean valueOf2 = Boolean.valueOf(true);
                StringBuilder sb = new StringBuilder();
                sb.append(t_video_pro.this.f20727c);
                sb.append("");
                t_video_pro.mo22312a(valueOf, valueOf2, substring, sb.toString(), t_video_pro.this.getResources().getString(R.string.tu), c, this.f20785a, "0", "", "", "", "", "", "");
                Editor edit = t_video_pro.this.f20707A.edit();
                for (int i = 3; i > 0; i--) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("idcomv");
                    sb2.append(i);
                    sb2.append("_");
                    sb2.append(t_video_pro.this.f20741q);
                    String sb3 = sb2.toString();
                    SharedPreferences sharedPreferences = t_video_pro.this.f20707A;
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("idcomv");
                    int i2 = i - 1;
                    sb4.append(i2);
                    sb4.append("_");
                    sb4.append(t_video_pro.this.f20741q);
                    edit.putString(sb3, sharedPreferences.getString(sb4.toString(), ""));
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append("comv");
                    sb5.append(i);
                    sb5.append("_");
                    sb5.append(t_video_pro.this.f20741q);
                    String sb6 = sb5.toString();
                    SharedPreferences sharedPreferences2 = t_video_pro.this.f20707A;
                    StringBuilder sb7 = new StringBuilder();
                    sb7.append("comv");
                    sb7.append(i2);
                    sb7.append("_");
                    sb7.append(t_video_pro.this.f20741q);
                    edit.putString(sb6, sharedPreferences2.getString(sb7.toString(), ""));
                    StringBuilder sb8 = new StringBuilder();
                    sb8.append("comv");
                    sb8.append(i);
                    sb8.append("_fcrea_");
                    sb8.append(t_video_pro.this.f20741q);
                    String sb9 = sb8.toString();
                    SharedPreferences sharedPreferences3 = t_video_pro.this.f20707A;
                    StringBuilder sb10 = new StringBuilder();
                    sb10.append("comv");
                    sb10.append(i2);
                    sb10.append("_fcrea_");
                    sb10.append(t_video_pro.this.f20741q);
                    edit.putString(sb9, sharedPreferences3.getString(sb10.toString(), ""));
                    StringBuilder sb11 = new StringBuilder();
                    sb11.append("comv");
                    sb11.append(i);
                    sb11.append("_idusucrea_");
                    sb11.append(t_video_pro.this.f20741q);
                    String sb12 = sb11.toString();
                    SharedPreferences sharedPreferences4 = t_video_pro.this.f20707A;
                    StringBuilder sb13 = new StringBuilder();
                    sb13.append("comv");
                    sb13.append(i2);
                    sb13.append("_idusucrea_");
                    sb13.append(t_video_pro.this.f20741q);
                    edit.putString(sb12, sharedPreferences4.getString(sb13.toString(), ""));
                    StringBuilder sb14 = new StringBuilder();
                    sb14.append("comv");
                    sb14.append(i);
                    sb14.append("_nombre_");
                    sb14.append(t_video_pro.this.f20741q);
                    String sb15 = sb14.toString();
                    SharedPreferences sharedPreferences5 = t_video_pro.this.f20707A;
                    StringBuilder sb16 = new StringBuilder();
                    sb16.append("comv");
                    sb16.append(i2);
                    sb16.append("_nombre_");
                    sb16.append(t_video_pro.this.f20741q);
                    edit.putString(sb15, sharedPreferences5.getString(sb16.toString(), ""));
                    StringBuilder sb17 = new StringBuilder();
                    sb17.append("comv");
                    sb17.append(i);
                    sb17.append("_vfoto_");
                    sb17.append(t_video_pro.this.f20741q);
                    String sb18 = sb17.toString();
                    SharedPreferences sharedPreferences6 = t_video_pro.this.f20707A;
                    StringBuilder sb19 = new StringBuilder();
                    sb19.append("comv");
                    sb19.append(i2);
                    sb19.append("_vfoto_");
                    sb19.append(t_video_pro.this.f20741q);
                    edit.putString(sb18, sharedPreferences6.getString(sb19.toString(), "0"));
                    StringBuilder sb20 = new StringBuilder();
                    sb20.append("comv");
                    sb20.append(i);
                    sb20.append("_privados_");
                    sb20.append(t_video_pro.this.f20741q);
                    String sb21 = sb20.toString();
                    SharedPreferences sharedPreferences7 = t_video_pro.this.f20707A;
                    StringBuilder sb22 = new StringBuilder();
                    sb22.append("comv");
                    sb22.append(i2);
                    sb22.append("_privados_");
                    sb22.append(t_video_pro.this.f20741q);
                    edit.putString(sb21, sharedPreferences7.getString(sb22.toString(), "0"));
                    StringBuilder sb23 = new StringBuilder();
                    sb23.append("comv");
                    sb23.append(i);
                    sb23.append("_fnacd_");
                    sb23.append(t_video_pro.this.f20741q);
                    String sb24 = sb23.toString();
                    SharedPreferences sharedPreferences8 = t_video_pro.this.f20707A;
                    StringBuilder sb25 = new StringBuilder();
                    sb25.append("comv");
                    sb25.append(i2);
                    sb25.append("_fnacd_");
                    sb25.append(t_video_pro.this.f20741q);
                    edit.putString(sb24, sharedPreferences8.getString(sb25.toString(), "0"));
                    StringBuilder sb26 = new StringBuilder();
                    sb26.append("comv");
                    sb26.append(i);
                    sb26.append("_fnacm_");
                    sb26.append(t_video_pro.this.f20741q);
                    String sb27 = sb26.toString();
                    SharedPreferences sharedPreferences9 = t_video_pro.this.f20707A;
                    StringBuilder sb28 = new StringBuilder();
                    sb28.append("comv");
                    sb28.append(i2);
                    sb28.append("_fnacm_");
                    sb28.append(t_video_pro.this.f20741q);
                    edit.putString(sb27, sharedPreferences9.getString(sb28.toString(), "0"));
                    StringBuilder sb29 = new StringBuilder();
                    sb29.append("comv");
                    sb29.append(i);
                    sb29.append("_fnaca_");
                    sb29.append(t_video_pro.this.f20741q);
                    String sb30 = sb29.toString();
                    SharedPreferences sharedPreferences10 = t_video_pro.this.f20707A;
                    StringBuilder sb31 = new StringBuilder();
                    sb31.append("comv");
                    sb31.append(i2);
                    sb31.append("_fnaca_");
                    sb31.append(t_video_pro.this.f20741q);
                    edit.putString(sb30, sharedPreferences10.getString(sb31.toString(), "0"));
                    StringBuilder sb32 = new StringBuilder();
                    sb32.append("comv");
                    sb32.append(i);
                    sb32.append("_sexo_");
                    sb32.append(t_video_pro.this.f20741q);
                    String sb33 = sb32.toString();
                    SharedPreferences sharedPreferences11 = t_video_pro.this.f20707A;
                    StringBuilder sb34 = new StringBuilder();
                    sb34.append("comv");
                    sb34.append(i2);
                    sb34.append("_sexo_");
                    sb34.append(t_video_pro.this.f20741q);
                    edit.putString(sb33, sharedPreferences11.getString(sb34.toString(), "0"));
                    StringBuilder sb35 = new StringBuilder();
                    sb35.append("comv");
                    sb35.append(i);
                    sb35.append("_coments_");
                    sb35.append(t_video_pro.this.f20741q);
                    String sb36 = sb35.toString();
                    SharedPreferences sharedPreferences12 = t_video_pro.this.f20707A;
                    StringBuilder sb37 = new StringBuilder();
                    sb37.append("comv");
                    sb37.append(i2);
                    sb37.append("_coments_");
                    sb37.append(t_video_pro.this.f20741q);
                    edit.putString(sb36, sharedPreferences12.getString(sb37.toString(), "0"));
                }
                StringBuilder sb38 = new StringBuilder();
                sb38.append("idcomv0_");
                sb38.append(t_video_pro.this.f20741q);
                edit.putString(sb38.toString(), substring);
                StringBuilder sb39 = new StringBuilder();
                sb39.append("comv0_");
                sb39.append(t_video_pro.this.f20741q);
                edit.putString(sb39.toString(), this.f20785a);
                StringBuilder sb40 = new StringBuilder();
                sb40.append("comv0_fcrea_");
                sb40.append(t_video_pro.this.f20741q);
                edit.putString(sb40.toString(), c);
                StringBuilder sb41 = new StringBuilder();
                sb41.append("comv0_idusucrea_");
                sb41.append(t_video_pro.this.f20741q);
                String sb42 = sb41.toString();
                StringBuilder sb43 = new StringBuilder();
                sb43.append(t_video_pro.this.f20727c);
                sb43.append("");
                edit.putString(sb42, sb43.toString());
                StringBuilder sb44 = new StringBuilder();
                sb44.append("comv0_nombre_");
                sb44.append(t_video_pro.this.f20741q);
                edit.putString(sb44.toString(), t_video_pro.this.getResources().getString(R.string.tu));
                StringBuilder sb45 = new StringBuilder();
                sb45.append("comv0_vfoto_");
                sb45.append(t_video_pro.this.f20741q);
                edit.putString(sb45.toString(), "0");
                edit.commit();
                try {
                    t_video_pro.this.findViewById(R.id.sc_pro).post(new Runnable() {
                        public void run() {
                            try {
                                ((ScrollView) t_video_pro.this.findViewById(R.id.sc_pro)).smoothScrollTo(0, t_video_pro.this.findViewById(R.id.tv_coments).getTop());
                            } catch (Exception unused) {
                            }
                        }
                    });
                } catch (Exception unused2) {
                }
            } else if (str2.indexOf("ANDROID:KO MOTIVO:NOADMITE") != -1) {
                final AlertDialog create = builder.setCancelable(false).setPositiveButton(t_video_pro.this.getString(R.string.aceptar), null).setMessage(R.string.noadmitecoments).create();
                if (!t_video_pro.this.f20744t.equals("")) {
                    create.setOnShowListener(new OnShowListener() {
                        public void onShow(DialogInterface dialogInterface) {
                            Button button = create.getButton(-1);
                            StringBuilder sb = new StringBuilder();
                            sb.append("#");
                            sb.append(t_video_pro.this.f20744t);
                            button.setTextColor(Color.parseColor(sb.toString()));
                        }
                    });
                }
                create.show();
                ((TextView) create.findViewById(16908299)).setTypeface(Typeface.MONOSPACE);
            } else {
                final AlertDialog create2 = builder.setCancelable(false).setPositiveButton(t_video_pro.this.getString(R.string.aceptar), null).setMessage(R.string.error_http).create();
                if (!t_video_pro.this.f20744t.equals("")) {
                    create2.setOnShowListener(new OnShowListener() {
                        public void onShow(DialogInterface dialogInterface) {
                            Button button = create2.getButton(-1);
                            StringBuilder sb = new StringBuilder();
                            sb.append("#");
                            sb.append(t_video_pro.this.f20744t);
                            button.setTextColor(Color.parseColor(sb.toString()));
                        }
                    });
                }
                create2.show();
                ((TextView) create2.findViewById(16908299)).setTypeface(Typeface.MONOSPACE);
            }
        }
    }

    /* renamed from: mega.boicot.t_video_pro$h */
    private class C6243h extends AsyncTask<String, Void, String> {
        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void onPostExecute(String str) {
        }

        private C6243h() {
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
                sb.append("/srv/like_videogal.php?idusu=");
                sb.append(t_video_pro.this.f20727c);
                sb.append("&c=");
                sb.append(t_video_pro.this.f20739o);
                sb.append("&idusu_pro=");
                sb.append(t_video_pro.this.f20743s);
                sb.append("&idv=");
                sb.append(t_video_pro.this.f20741q);
                sb.append("&modo=");
                sb.append(t_video_pro.this.f20742r);
                C6274e eVar = new C6274e(sb.toString());
                eVar.mo22444a(new C6370g(C6367d.BROWSER_COMPATIBLE));
                eVar.mo22909b("User-Agent", "Android Vinebre Software");
                hVar.mo22459a((C6276g) eVar);
                return "1";
            } catch (Exception unused) {
                return "ANDROID:KO";
            }
        }
    }

    /* renamed from: mega.boicot.t_video_pro$i */
    private class C6244i extends AsyncTask<String, Void, String> {
        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void onPostExecute(String str) {
        }

        private C6244i() {
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
                sb.append("/srv/reportar_videogal.php?idusu=");
                sb.append(t_video_pro.this.f20727c);
                sb.append("&c=");
                sb.append(t_video_pro.this.f20739o);
                sb.append("&idusu_pro=");
                sb.append(t_video_pro.this.f20743s);
                sb.append("&idv=");
                sb.append(t_video_pro.this.f20741q);
                C6274e eVar = new C6274e(sb.toString());
                eVar.mo22444a(new C6370g(C6367d.BROWSER_COMPATIBLE));
                eVar.mo22909b("User-Agent", "Android Vinebre Software");
                hVar.mo22459a((C6276g) eVar);
                return "1";
            } catch (Exception unused) {
                return "ANDROID:KO";
            }
        }
    }

    /* renamed from: mega.boicot.t_video_pro$j */
    private class C6245j extends AsyncTask<String, Void, String> {
        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void onPostExecute(String str) {
        }

        private C6245j() {
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
                sb.append("/srv/video_visto.php?idusu=");
                sb.append(t_video_pro.this.f20727c);
                sb.append("&c=");
                sb.append(t_video_pro.this.f20739o);
                sb.append("&idv=");
                sb.append(t_video_pro.this.f20741q);
                C6274e eVar = new C6274e(sb.toString());
                eVar.mo22444a(new C6370g(C6367d.BROWSER_COMPATIBLE));
                eVar.mo22909b("User-Agent", "Android Vinebre Software");
                hVar.mo22459a((C6276g) eVar);
                return "1";
            } catch (Exception unused) {
                return "ANDROID:KO";
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

    @TargetApi(14)
    public void onCreate(Bundle bundle) {
        this.f20725a = (config) getApplicationContext();
        if (this.f20725a.f17881aN == null) {
            this.f20725a.mo20780b();
        }
        this.f20726b = getIntent().getExtras();
        this.f20746v = this.f20725a.f17881aN;
        this.f20747w = this.f20725a.f17882aO;
        if (this.f20725a.f18075l != -1) {
            this.f20746v = this.f20725a.f17971bz[this.f20725a.f18075l].f18314g;
            this.f20747w = this.f20725a.f17971bz[this.f20725a.f18075l].f18315h;
        }
        if (this.f20726b.containsKey("bg1")) {
            this.f20746v = this.f20726b.getString("bg1");
            this.f20747w = this.f20726b.getString("bg2");
        }
        this.f20738n = true;
        if (bundle == null) {
            this.f20720N = this.f20726b != null && this.f20726b.containsKey("es_root") && this.f20726b.getBoolean("es_root", false);
        } else {
            this.f20720N = bundle.containsKey("es_root") && bundle.getBoolean("es_root", false);
        }
        this.f20730f = this.f20726b.getInt("fotos_perfil");
        this.f20744t = config.m23831a(this.f20746v, this.f20725a.f17890aW);
        if (VERSION.SDK_INT > 12) {
            StringBuilder sb = new StringBuilder();
            sb.append("#");
            sb.append(this.f20746v);
            if (!config.m23844a(sb.toString())) {
                setTheme(R.style.holonolight);
            }
        }
        super.onCreate(bundle);
        setContentView(R.layout.t_video_pro);
        mo22315f();
        if (this.f20725a.f18080q > 0) {
            SearchManager searchManager = (SearchManager) getSystemService("search");
            searchManager.setOnCancelListener(new OnCancelListener() {
                public void onCancel() {
                    t_video_pro.this.f20717K = false;
                    t_video_pro.this.setResult(0);
                }
            });
            searchManager.setOnDismissListener(new OnDismissListener() {
                public void onDismiss() {
                    t_video_pro.this.f20737m = false;
                }
            });
        }
        this.f20707A = getSharedPreferences("sh", 0);
        this.f20727c = this.f20707A.getInt("idusu", 0);
        this.f20739o = this.f20707A.getString("cod", "");
        if (this.f20726b.containsKey("nlikes")) {
            this.f20740p = this.f20726b.getString("nlikes");
            this.f20742r = this.f20726b.getString("liked");
            m24787i();
        }
        this.f20741q = this.f20726b.getString("idv");
        this.f20728d = this.f20726b.getInt("indv");
        this.f20743s = this.f20726b.getString("idusu_profile");
        this.f20710D = new File(Environment.getExternalStorageDirectory(), getPackageName());
        this.f20723Q = new ArrayList<>();
        this.f20750z = (ProgressBar) findViewById(R.id.pb_chat_env_inv);
        if (!this.f20738n && VERSION.SDK_INT > 12) {
            this.f20750z = (ProgressBar) findViewById(R.id.pb_chat_env);
        }
        String str = this.f20743s;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f20727c);
        sb2.append("");
        if (str.equals(sb2.toString())) {
            findViewById(R.id.iv_reportar).setVisibility(8);
            findViewById(R.id.iv_elim).setOnClickListener(this);
            findViewById(R.id.iv_elim).setVisibility(0);
        } else {
            findViewById(R.id.iv_reportar).setOnClickListener(this);
        }
        if (this.f20725a.f18045dm == 1) {
            ImageView imageView = (ImageView) findViewById(R.id.icohome);
            ((ImageView) findViewById(R.id.iv_drawer)).setOnClickListener(new OnClickListener() {
                public void onClick(View view) {
                    ((DrawerLayout) ((Activity) view.getContext()).findViewById(R.id.drawer_layout)).mo2178e(8388611);
                }
            });
            imageView.setOnClickListener(new OnClickListener() {
                public void onClick(View view) {
                    ((DrawerLayout) ((Activity) view.getContext()).findViewById(R.id.drawer_layout)).mo2178e(8388611);
                }
            });
        }
        this.f20731g = this.f20725a.mo20760a((Context) this, false);
        if (!this.f20746v.equals("")) {
            Orientation orientation = Orientation.TOP_BOTTOM;
            StringBuilder sb3 = new StringBuilder();
            sb3.append("#");
            sb3.append(this.f20746v);
            StringBuilder sb4 = new StringBuilder();
            sb4.append("#");
            sb4.append(this.f20747w);
            findViewById(R.id.ll_princ).setBackgroundDrawable(new GradientDrawable(orientation, new int[]{Color.parseColor(sb3.toString()), Color.parseColor(sb4.toString())}));
        }
        if (VERSION.SDK_INT > 20) {
            config.m23838a((ProgressBar) findViewById(R.id.pb_mascoments), this.f20725a.f17890aW);
            config.m23838a((ProgressBar) findViewById(R.id.pb_mascoments_inv), this.f20725a.f17890aW);
            config.m23838a((ProgressBar) findViewById(R.id.pb_chat_env), this.f20725a.f17890aW);
            config.m23838a((ProgressBar) findViewById(R.id.pb_chat_env_inv), this.f20725a.f17890aW);
        }
        if (this.f20738n) {
            this.f20709C = BitmapFactory.decodeResource(getResources(), R.drawable.sinfoto);
        } else {
            this.f20709C = BitmapFactory.decodeResource(getResources(), R.drawable.sinfoto_light);
        }
        if (this.f20730f > 0) {
            File a = this.f20725a.mo20757a((Context) this, 1);
            try {
                Options options = new Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeFile(a.getPath(), options);
                int i = options.outWidth;
                int i2 = options.outWidth;
                int i3 = options.outHeight;
                if (!(i2 <= 75 && i3 <= 100)) {
                    int round = Math.round(((float) i2) / ((float) config.m23824a(i2, i3, 75, 100)));
                    Options options2 = new Options();
                    options2.inSampleSize = round;
                    this.f20709C = BitmapFactory.decodeFile(a.getPath(), options2);
                } else {
                    this.f20709C = Media.getBitmap(getContentResolver(), Uri.fromFile(a));
                }
            } catch (Exception | OutOfMemoryError unused) {
            }
        }
        this.f20721O = (FullscreenVideoLayout_pro) findViewById(R.id.vv);
        this.f20708B = (LinearLayout) findViewById(R.id.ll_coments);
        if (!this.f20726b.getString("coments").equals("1") || !this.f20726b.getBoolean("coments_chat")) {
            this.f20721O.f19524B = false;
            findViewById(R.id.sc_coments).setVisibility(8);
            new C6245j().execute(new String[0]);
        } else {
            this.f20721O.f19524B = true;
            int i4 = -16777216;
            if (!this.f20738n) {
                i4 = -1;
            }
            ((TextView) findViewById(R.id.tv_coments)).setTextColor(i4);
            StringBuilder sb5 = new StringBuilder();
            sb5.append("#");
            sb5.append(this.f20725a.f17890aW);
            if (config.m23844a(sb5.toString())) {
                findViewById(R.id.iv_enviarcom_fondo_n).setVisibility(0);
            } else {
                findViewById(R.id.iv_enviarcom_fondo_b).setVisibility(0);
            }
            Drawable drawable = getResources().getDrawable(R.drawable.btn_enviar);
            StringBuilder sb6 = new StringBuilder();
            sb6.append("#");
            sb6.append(this.f20725a.f17890aW);
            drawable.setColorFilter(Color.parseColor(sb6.toString()), Mode.MULTIPLY);
            ((ImageView) findViewById(R.id.iv_enviarcoment)).setImageDrawable(drawable);
            StringBuilder sb7 = new StringBuilder();
            sb7.append("#");
            sb7.append(this.f20725a.f17890aW);
            if (config.m23844a(sb7.toString())) {
                findViewById(R.id.iv_mascoments_fondo_n).setVisibility(0);
            } else {
                findViewById(R.id.iv_mascoments_fondo_b).setVisibility(0);
            }
            Drawable drawable2 = getResources().getDrawable(R.drawable.mas_btn);
            StringBuilder sb8 = new StringBuilder();
            sb8.append("#");
            sb8.append(this.f20725a.f17890aW);
            drawable2.setColorFilter(Color.parseColor(sb8.toString()), Mode.MULTIPLY);
            ((ImageView) findViewById(R.id.iv_mascoments)).setImageDrawable(drawable2);
            if (VERSION.SDK_INT > 20) {
                config.m23837a((EditText) findViewById(R.id.et_coment_self), Boolean.valueOf(!this.f20738n), this.f20725a.f17890aW);
            } else if (VERSION.SDK_INT > 12) {
                ((EditText) findViewById(R.id.et_coment_self)).setTextColor(i4);
            }
            findViewById(R.id.iv_enviarcoment).setOnClickListener(this);
            findViewById(R.id.iv_mascoments).setOnClickListener(this);
            ((ImageView) findViewById(R.id.iv_usucoment_self)).setImageBitmap(this.f20709C);
            mo22313a(true);
            new C6234b(true).execute(new String[0]);
        }
        if (this.f20738n) {
            ((TextView) findViewById(R.id.tv_tu)).setTextColor(config.f17813a);
        } else {
            ((TextView) findViewById(R.id.tv_tu)).setTextColor(-1);
        }
        String str2 = this.f20743s;
        StringBuilder sb9 = new StringBuilder();
        sb9.append(this.f20727c);
        sb9.append("");
        if (str2.equals(sb9.toString())) {
            m24786h();
            return;
        }
        SharedPreferences sharedPreferences = getSharedPreferences("sh", 0);
        int i5 = sharedPreferences.getInt("appnext_video_n", 0) + 1;
        Editor edit = sharedPreferences.edit();
        edit.putInt("appnext_video_n", i5);
        edit.commit();
        if (this.f20725a.f18005ch.equals("") || i5 < this.f20725a.f18007cj || (i5 - this.f20725a.f18007cj) % this.f20725a.f18006ci != 0) {
            m24786h();
            return;
        }
        this.f20721O.f19474a = true;
        new C6232a().execute(new String[0]);
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public void m24786h() {
        this.f20721O.f19474a = false;
        this.f20718L = false;
        this.f20721O.mo21506a(false);
        this.f20721O.f19486n = this.f20718L;
        if (this.f20718L) {
            this.f20721O.mo21517l();
        }
        this.f20721O.setOnPreparedListener(new OnPreparedListener() {
            public void onPrepared(MediaPlayer mediaPlayer) {
            }
        });
        this.f20721O.setOnErrorListener(new OnErrorListener() {
            public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
                return false;
            }
        });
        try {
            this.f20721O.mo21557a(Uri.parse(this.f20726b.getString("url")), "Android Vinebre Software");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void onClick(View view) {
        if (view.getId() == R.id.iv_enviarcoment) {
            m24783b(false);
        } else if (view.getId() == R.id.iv_elimcoment) {
            final View view2 = (View) view.getParent().getParent();
            final String str = (String) view2.getTag(R.id.idaux2);
            if (str != null) {
                final AlertDialog create = new Builder(this).setNegativeButton(R.string.no, null).setPositiveButton(R.string.si, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialogInterface, int i) {
                        view2.setVisibility(8);
                        int indexOfChild = ((LinearLayout) view2.getParent()).indexOfChild(view2);
                        Editor edit = t_video_pro.this.f20707A.edit();
                        while (indexOfChild < 4) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("idcomv");
                            sb.append(indexOfChild);
                            sb.append("_");
                            sb.append(t_video_pro.this.f20741q);
                            String sb2 = sb.toString();
                            SharedPreferences sharedPreferences = t_video_pro.this.f20707A;
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append("idcomv");
                            int i2 = indexOfChild + 1;
                            sb3.append(i2);
                            sb3.append("_");
                            sb3.append(t_video_pro.this.f20741q);
                            edit.putString(sb2, sharedPreferences.getString(sb3.toString(), ""));
                            StringBuilder sb4 = new StringBuilder();
                            sb4.append("comv");
                            sb4.append(indexOfChild);
                            sb4.append("_");
                            sb4.append(t_video_pro.this.f20741q);
                            String sb5 = sb4.toString();
                            SharedPreferences sharedPreferences2 = t_video_pro.this.f20707A;
                            StringBuilder sb6 = new StringBuilder();
                            sb6.append("comv");
                            sb6.append(i2);
                            sb6.append("_");
                            sb6.append(t_video_pro.this.f20741q);
                            edit.putString(sb5, sharedPreferences2.getString(sb6.toString(), ""));
                            StringBuilder sb7 = new StringBuilder();
                            sb7.append("comv");
                            sb7.append(indexOfChild);
                            sb7.append("_fcrea_");
                            sb7.append(t_video_pro.this.f20741q);
                            String sb8 = sb7.toString();
                            SharedPreferences sharedPreferences3 = t_video_pro.this.f20707A;
                            StringBuilder sb9 = new StringBuilder();
                            sb9.append("comv");
                            sb9.append(i2);
                            sb9.append("_fcrea_");
                            sb9.append(t_video_pro.this.f20741q);
                            edit.putString(sb8, sharedPreferences3.getString(sb9.toString(), ""));
                            StringBuilder sb10 = new StringBuilder();
                            sb10.append("comv");
                            sb10.append(indexOfChild);
                            sb10.append("_idusucrea_");
                            sb10.append(t_video_pro.this.f20741q);
                            String sb11 = sb10.toString();
                            SharedPreferences sharedPreferences4 = t_video_pro.this.f20707A;
                            StringBuilder sb12 = new StringBuilder();
                            sb12.append("comv");
                            sb12.append(i2);
                            sb12.append("_idusucrea_");
                            sb12.append(t_video_pro.this.f20741q);
                            edit.putString(sb11, sharedPreferences4.getString(sb12.toString(), ""));
                            StringBuilder sb13 = new StringBuilder();
                            sb13.append("comv");
                            sb13.append(indexOfChild);
                            sb13.append("_nombre_");
                            sb13.append(t_video_pro.this.f20741q);
                            String sb14 = sb13.toString();
                            SharedPreferences sharedPreferences5 = t_video_pro.this.f20707A;
                            StringBuilder sb15 = new StringBuilder();
                            sb15.append("comv");
                            sb15.append(i2);
                            sb15.append("_nombre_");
                            sb15.append(t_video_pro.this.f20741q);
                            edit.putString(sb14, sharedPreferences5.getString(sb15.toString(), ""));
                            StringBuilder sb16 = new StringBuilder();
                            sb16.append("comv");
                            sb16.append(indexOfChild);
                            sb16.append("_vfoto_");
                            sb16.append(t_video_pro.this.f20741q);
                            String sb17 = sb16.toString();
                            SharedPreferences sharedPreferences6 = t_video_pro.this.f20707A;
                            StringBuilder sb18 = new StringBuilder();
                            sb18.append("comv");
                            sb18.append(i2);
                            sb18.append("_vfoto_");
                            sb18.append(t_video_pro.this.f20741q);
                            edit.putString(sb17, sharedPreferences6.getString(sb18.toString(), "0"));
                            StringBuilder sb19 = new StringBuilder();
                            sb19.append("comv");
                            sb19.append(indexOfChild);
                            sb19.append("_privados_");
                            sb19.append(t_video_pro.this.f20741q);
                            String sb20 = sb19.toString();
                            SharedPreferences sharedPreferences7 = t_video_pro.this.f20707A;
                            StringBuilder sb21 = new StringBuilder();
                            sb21.append("comv");
                            sb21.append(i2);
                            sb21.append("_privados_");
                            sb21.append(t_video_pro.this.f20741q);
                            edit.putString(sb20, sharedPreferences7.getString(sb21.toString(), "0"));
                            StringBuilder sb22 = new StringBuilder();
                            sb22.append("comv");
                            sb22.append(indexOfChild);
                            sb22.append("_fnacd_");
                            sb22.append(t_video_pro.this.f20741q);
                            String sb23 = sb22.toString();
                            SharedPreferences sharedPreferences8 = t_video_pro.this.f20707A;
                            StringBuilder sb24 = new StringBuilder();
                            sb24.append("comv");
                            sb24.append(i2);
                            sb24.append("_fnacd_");
                            sb24.append(t_video_pro.this.f20741q);
                            edit.putString(sb23, sharedPreferences8.getString(sb24.toString(), "0"));
                            StringBuilder sb25 = new StringBuilder();
                            sb25.append("comv");
                            sb25.append(indexOfChild);
                            sb25.append("_fnacm_");
                            sb25.append(t_video_pro.this.f20741q);
                            String sb26 = sb25.toString();
                            SharedPreferences sharedPreferences9 = t_video_pro.this.f20707A;
                            StringBuilder sb27 = new StringBuilder();
                            sb27.append("comv");
                            sb27.append(i2);
                            sb27.append("_fnacm_");
                            sb27.append(t_video_pro.this.f20741q);
                            edit.putString(sb26, sharedPreferences9.getString(sb27.toString(), "0"));
                            StringBuilder sb28 = new StringBuilder();
                            sb28.append("comv");
                            sb28.append(indexOfChild);
                            sb28.append("_fnaca_");
                            sb28.append(t_video_pro.this.f20741q);
                            String sb29 = sb28.toString();
                            SharedPreferences sharedPreferences10 = t_video_pro.this.f20707A;
                            StringBuilder sb30 = new StringBuilder();
                            sb30.append("comv");
                            sb30.append(i2);
                            sb30.append("_fnaca_");
                            sb30.append(t_video_pro.this.f20741q);
                            edit.putString(sb29, sharedPreferences10.getString(sb30.toString(), "0"));
                            StringBuilder sb31 = new StringBuilder();
                            sb31.append("comv");
                            sb31.append(indexOfChild);
                            sb31.append("_sexo_");
                            sb31.append(t_video_pro.this.f20741q);
                            String sb32 = sb31.toString();
                            SharedPreferences sharedPreferences11 = t_video_pro.this.f20707A;
                            StringBuilder sb33 = new StringBuilder();
                            sb33.append("comv");
                            sb33.append(i2);
                            sb33.append("_sexo_");
                            sb33.append(t_video_pro.this.f20741q);
                            edit.putString(sb32, sharedPreferences11.getString(sb33.toString(), "0"));
                            StringBuilder sb34 = new StringBuilder();
                            sb34.append("comv");
                            sb34.append(indexOfChild);
                            sb34.append("_coments_");
                            sb34.append(t_video_pro.this.f20741q);
                            String sb35 = sb34.toString();
                            SharedPreferences sharedPreferences12 = t_video_pro.this.f20707A;
                            StringBuilder sb36 = new StringBuilder();
                            sb36.append("comv");
                            sb36.append(i2);
                            sb36.append("_coments_");
                            sb36.append(t_video_pro.this.f20741q);
                            edit.putString(sb35, sharedPreferences12.getString(sb36.toString(), "0"));
                            indexOfChild = i2;
                        }
                        edit.commit();
                        new C6237e(str).execute(new String[0]);
                    }
                }).setMessage(R.string.confirmar_elimcoment).create();
                if (!this.f20744t.equals("")) {
                    create.setOnShowListener(new OnShowListener() {
                        public void onShow(DialogInterface dialogInterface) {
                            Button button = create.getButton(-1);
                            StringBuilder sb = new StringBuilder();
                            sb.append("#");
                            sb.append(t_video_pro.this.f20744t);
                            button.setTextColor(Color.parseColor(sb.toString()));
                            Button button2 = create.getButton(-2);
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("#");
                            sb2.append(t_video_pro.this.f20744t);
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
        } else if (view.getId() == R.id.iv_mascoments) {
            new C6234b(false).execute(new String[0]);
        } else if (view.getTag(R.id.idaux1) != null && view.getTag(R.id.idaux1).equals("ESCOMENT")) {
            Intent intent = new Intent(this, profile.class);
            intent.putExtra(TtmlNode.ATTR_ID, (String) view.getTag(R.id.idaux2));
            intent.putExtra("privados", (String) view.getTag(R.id.idaux5));
            intent.putExtra("nombre", (String) view.getTag(R.id.idaux3));
            intent.putExtra("coments", (String) view.getTag(R.id.idaux10));
            intent.putExtra("fnac_d", (String) view.getTag(R.id.idaux6));
            intent.putExtra("fnac_m", (String) view.getTag(R.id.idaux7));
            intent.putExtra("fnac_a", (String) view.getTag(R.id.idaux8));
            intent.putExtra("sexo", (String) view.getTag(R.id.idaux9));
            intent.putExtra("vfoto", (String) view.getTag(R.id.idaux4));
            if (this.f20726b.containsKey("desdepriv")) {
                intent.putExtra("desdepriv", "1");
            }
            intent.putExtra("p_fnac", this.f20726b.getInt("p_fnac"));
            intent.putExtra("p_sexo", this.f20726b.getInt("p_sexo"));
            intent.putExtra("p_descr", this.f20726b.getInt("p_descr"));
            intent.putExtra("p_dist", this.f20726b.getInt("p_dist"));
            intent.putExtra("coments_chat", this.f20726b.getBoolean("coments_chat"));
            intent.putExtra("galeria", this.f20726b.getBoolean("galeria"));
            intent.putExtra("privados_chat", this.f20726b.getBoolean("privados_chat"));
            intent.putExtra("fotos_perfil", this.f20730f);
            intent.putExtra("fotos_chat", this.f20726b.getInt("fotos_chat"));
            startActivityForResult(intent, 0);
        } else if (view.getId() == R.id.tv_likes_n) {
            if (!this.f20740p.equals("0")) {
                this.f20714H = new Builder(this);
                this.f20715I = getLayoutInflater().inflate(R.layout.likes_list, null);
                if (VERSION.SDK_INT > 20) {
                    config.m23838a((ProgressBar) this.f20715I.findViewById(R.id.likes_pb), this.f20725a.f17890aW);
                }
                this.f20714H.setView(this.f20715I);
                this.f20714H.setCancelable(true);
                ListView listView = (ListView) this.f20715I.findViewById(R.id.lv);
                listView.setCacheColorHint(0);
                this.f20724R = new C6021n(this, R.layout.likes_item, this.f20723Q, this.f20727c);
                listView.setAdapter(this.f20724R);
                listView.setOnItemClickListener(new OnItemClickListener() {
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                        C6029o oVar = (C6029o) t_video_pro.this.f20723Q.get(i);
                        if (!oVar.f19935c) {
                            String str = oVar.f19938f;
                            StringBuilder sb = new StringBuilder();
                            sb.append(t_video_pro.this.f20727c);
                            sb.append("");
                            if (!str.equals(sb.toString())) {
                                String str2 = oVar.f19938f;
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append(t_video_pro.this.f20743s);
                                sb2.append("");
                                if (!str2.equals(sb2.toString())) {
                                    Intent intent = new Intent(t_video_pro.this, profile.class);
                                    intent.putExtra(TtmlNode.ATTR_ID, oVar.f19938f);
                                    intent.putExtra("privados", oVar.f19940h);
                                    intent.putExtra("nombre", oVar.f19937e);
                                    intent.putExtra("coments", oVar.f19942j);
                                    intent.putExtra("fnac_d", oVar.f19943k);
                                    intent.putExtra("fnac_m", oVar.f19944l);
                                    intent.putExtra("fnac_a", oVar.f19945m);
                                    intent.putExtra("sexo", oVar.f19941i);
                                    intent.putExtra("vfoto", oVar.f19939g);
                                    if (t_video_pro.this.f20726b.containsKey("desdepriv")) {
                                        intent.putExtra("desdepriv", "1");
                                    }
                                    intent.putExtra("p_fnac", t_video_pro.this.f20726b.getInt("p_fnac"));
                                    intent.putExtra("p_sexo", t_video_pro.this.f20726b.getInt("p_sexo"));
                                    intent.putExtra("p_descr", t_video_pro.this.f20726b.getInt("p_descr"));
                                    intent.putExtra("p_dist", t_video_pro.this.f20726b.getInt("p_dist"));
                                    intent.putExtra("coments_chat", t_video_pro.this.f20726b.getBoolean("coments_chat"));
                                    intent.putExtra("galeria", t_video_pro.this.f20726b.getBoolean("galeria"));
                                    intent.putExtra("privados_chat", t_video_pro.this.f20726b.getBoolean("privados_chat"));
                                    intent.putExtra("fotos_perfil", t_video_pro.this.f20726b.getInt("fotos_perfil"));
                                    intent.putExtra("fotos_chat", t_video_pro.this.f20726b.getInt("fotos_chat"));
                                    t_video_pro.this.startActivityForResult(intent, 0);
                                }
                            }
                        } else if (t_video_pro.this.f20713G == null || t_video_pro.this.f20713G.getStatus() != Status.RUNNING) {
                            t_video_pro.this.f20713G = new C6236d();
                            t_video_pro.this.f20713G.execute(new String[0]);
                        }
                    }
                });
                this.f20714H.show();
                if (this.f20723Q.size() == 0 && (this.f20713G == null || this.f20713G.getStatus() != Status.RUNNING)) {
                    this.f20713G = new C6236d();
                    this.f20713G.execute(new String[0]);
                }
            }
        } else if (view.getId() == R.id.iv_like) {
            if (this.f20742r.equals("0")) {
                StringBuilder sb = new StringBuilder();
                sb.append(Integer.parseInt(this.f20740p) + 1);
                sb.append("");
                this.f20740p = sb.toString();
                this.f20742r = "1";
                String str2 = this.f20743s;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(this.f20727c);
                sb2.append("");
                if (!str2.equals(sb2.toString())) {
                    SharedPreferences sharedPreferences = this.f20707A;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("usufav_");
                    sb3.append(this.f20743s);
                    if (!sharedPreferences.contains(sb3.toString())) {
                        SharedPreferences sharedPreferences2 = this.f20707A;
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("usufav_noactivar_");
                        sb4.append(this.f20743s);
                        if (!sharedPreferences2.contains(sb4.toString())) {
                            Editor edit = this.f20707A.edit();
                            StringBuilder sb5 = new StringBuilder();
                            sb5.append("usufav_");
                            sb5.append(this.f20743s);
                            edit.putBoolean(sb5.toString(), true);
                            edit.commit();
                        }
                    }
                }
                if (this.f20723Q.size() > 0) {
                    String str3 = ((C6029o) this.f20723Q.get(0)).f19938f;
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append(this.f20727c);
                    sb6.append("");
                    if (!str3.equals(sb6.toString())) {
                        C6029o oVar = new C6029o();
                        StringBuilder sb7 = new StringBuilder();
                        sb7.append(this.f20727c);
                        sb7.append("");
                        oVar.f19938f = sb7.toString();
                        oVar.f19937e = getResources().getString(R.string.tu);
                        oVar.f19934b = this.f20725a.mo20757a((Context) this, 1).exists();
                        this.f20723Q.add(0, oVar);
                        this.f20724R.notifyDataSetChanged();
                    }
                }
            } else {
                StringBuilder sb8 = new StringBuilder();
                sb8.append(Integer.parseInt(this.f20740p) - 1);
                sb8.append("");
                this.f20740p = sb8.toString();
                this.f20742r = "0";
                if (this.f20723Q.size() > 0) {
                    String str4 = ((C6029o) this.f20723Q.get(0)).f19938f;
                    StringBuilder sb9 = new StringBuilder();
                    sb9.append(this.f20727c);
                    sb9.append("");
                    if (str4.equals(sb9.toString())) {
                        this.f20723Q.remove(0);
                        this.f20724R.notifyDataSetChanged();
                    }
                }
            }
            ((TextView) findViewById(R.id.tv_likes_n)).setText(this.f20740p);
            String str5 = "";
            if (this.f20742r.equals("1")) {
                str5 = getResources().getString(R.string.tegusta);
            }
            ((TextView) findViewById(R.id.tv_likes)).setText(str5);
            new C6243h().execute(new String[0]);
        } else if (view.getId() == R.id.iv_reportar) {
            final AlertDialog create2 = new Builder(this).setNegativeButton(R.string.cancelar, null).setPositiveButton(R.string.aceptar, new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialogInterface, int i) {
                    t_video_pro.this.findViewById(R.id.iv_reportar).setVisibility(8);
                    config.m23839a(Toast.makeText(t_video_pro.this, t_video_pro.this.getResources().getString(R.string.enviando), 0));
                    new C6244i().execute(new String[0]);
                }
            }).setMessage(R.string.confirmar_reportarvideo).create();
            if (!this.f20744t.equals("")) {
                create2.setOnShowListener(new OnShowListener() {
                    public void onShow(DialogInterface dialogInterface) {
                        Button button = create2.getButton(-1);
                        StringBuilder sb = new StringBuilder();
                        sb.append("#");
                        sb.append(t_video_pro.this.f20744t);
                        button.setTextColor(Color.parseColor(sb.toString()));
                        Button button2 = create2.getButton(-2);
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("#");
                        sb2.append(t_video_pro.this.f20744t);
                        button2.setTextColor(Color.parseColor(sb2.toString()));
                    }
                });
            }
            create2.show();
            ((TextView) create2.findViewById(16908299)).setTypeface(Typeface.MONOSPACE);
        } else if (view.getId() == R.id.iv_elim) {
            final AlertDialog create3 = new Builder(this).setNegativeButton(R.string.no, null).setPositiveButton(R.string.si, new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialogInterface, int i) {
                    new C6238f(t_video_pro.this.f20741q).execute(new String[0]);
                    Intent intent = new Intent();
                    intent.putExtra("elim_video", t_video_pro.this.f20741q);
                    intent.putExtra("indv", t_video_pro.this.f20728d);
                    t_video_pro.this.setResult(-1, intent);
                    t_video_pro.this.finish();
                }
            }).setMessage(R.string.confirmar_elimvideo).create();
            if (!this.f20744t.equals("")) {
                create3.setOnShowListener(new OnShowListener() {
                    public void onShow(DialogInterface dialogInterface) {
                        Button button = create3.getButton(-1);
                        StringBuilder sb = new StringBuilder();
                        sb.append("#");
                        sb.append(t_video_pro.this.f20744t);
                        button.setTextColor(Color.parseColor(sb.toString()));
                        Button button2 = create3.getButton(-2);
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("#");
                        sb2.append(t_video_pro.this.f20744t);
                        button2.setTextColor(Color.parseColor(sb2.toString()));
                    }
                });
            }
            create3.show();
            ((TextView) create3.findViewById(16908299)).setTypeface(Typeface.MONOSPACE);
        } else if ((this.f20725a.f17986cO == null || this.f20725a.f17986cO.equals("")) && ((this.f20725a.f17985cN == null || this.f20725a.f17985cN.equals("")) && ((this.f20725a.f17988cQ == null || this.f20725a.f17988cQ.equals("")) && (this.f20725a.f17989cR == null || this.f20725a.f17989cR.equals(""))))) {
            abrir_secc(view);
        } else {
            if (this.f20725a.f17986cO != null && !this.f20725a.f17986cO.equals("")) {
                this.f20733i = new RewardedVideo((Context) this, this.f20725a.f17986cO);
            }
            if (this.f20725a.f17985cN != null && !this.f20725a.f17985cN.equals("")) {
                this.f20732h = C2997g.m10716a(this);
            }
            if (this.f20725a.f17988cQ != null && !this.f20725a.f17988cQ.equals("")) {
                this.f20734j = new RewardedVideoAd(this, this.f20725a.f17988cQ);
            }
            if (this.f20725a.f17989cR != null && !this.f20725a.f17989cR.equals("")) {
                this.f20735k = new StartAppAd(this);
            }
            this.f20749y = new ProgressDialog(this);
            this.f20748x = view;
            if (!this.f20725a.mo20774a((Context) this, view, this.f20744t, this.f20749y, this.f20732h, this.f20733i, this.f20734j, this.f20735k)) {
                abrir_secc(view);
            }
        }
    }

    public void abrir_secc(View view) {
        C5662h a = this.f20725a.mo20761a(view, (Context) this);
        if (a.f18227b) {
            this.f20717K = true;
            Intent intent = new Intent();
            intent.putExtra("finalizar", true);
            intent.putExtra("finalizar_app", a.f18228c);
            setResult(-1, intent);
        }
        if (a.f18229d) {
            startActivityForResult(a.f18226a, 0);
        } else if (a.f18226a != null) {
            if (a.f18227b && this.f20725a.f18045dm != 2) {
                a.f18226a.putExtra("es_root", true);
            }
            this.f20720N = false;
            startActivity(a.f18226a);
        }
        if (this.f20717K && !this.f20737m) {
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i2 == -1) {
            if (intent == null || !intent.hasExtra("finalizar")) {
                if (intent != null && intent.hasExtra("accion_usu_fav_id")) {
                    for (int i3 = 0; i3 < this.f20723Q.size(); i3++) {
                        if (((C6029o) this.f20723Q.get(i3)).f19938f.equals(intent.getStringExtra("accion_usu_fav_id"))) {
                            ((C6029o) this.f20723Q.get(i3)).f19936d = intent.getBooleanExtra("accion_usu_fav_accion", false);
                            this.f20724R.notifyDataSetChanged();
                            return;
                        }
                    }
                }
            } else if (intent.getExtras().getBoolean("finalizar")) {
                if (!intent.getExtras().getBoolean("finalizar_app")) {
                    this.f20720N = false;
                }
                setResult(-1, intent);
                finish();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public void mo22315f() {
        int b = this.f20725a.mo20778b((Context) this);
        if (this.f20725a.f18045dm == 1) {
            this.f20716J = (ListView) findViewById(R.id.left_drawer);
            this.f20725a.mo20771a(this.f20716J);
        } else if (this.f20725a.f18045dm == 0) {
            int i = 0;
            for (int i2 = 0; i2 < this.f20725a.f17971bz.length; i2++) {
                if (!this.f20725a.f17971bz[i2].f18333z) {
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
        for (int i3 = 0; i3 < this.f20725a.f17923bD.length; i3++) {
            if (this.f20725a.f17923bD[i3] > 0) {
                findViewById(this.f20725a.f17923bD[i3]).setOnClickListener(this);
            }
        }
    }

    public boolean onSearchRequested() {
        if (this.f20725a.f18080q == 0) {
            return false;
        }
        this.f20717K = true;
        this.f20737m = true;
        return super.onSearchRequested();
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getWindow().setFormat(1);
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public void m24787i() {
        TextView textView = (TextView) findViewById(R.id.tv_likes_n);
        findViewById(R.id.tv_likes_n).setBackgroundDrawable(getResources().getDrawable(R.drawable.likes_izq_p));
        textView.setTextColor(config.f17813a);
        textView.setText(this.f20740p);
        String str = "";
        if (this.f20742r.equals("1")) {
            str = getResources().getString(R.string.tegusta);
        }
        ((TextView) findViewById(R.id.tv_likes)).setText(str);
        findViewById(R.id.iv_like).setOnClickListener(this);
        findViewById(R.id.tv_likes_n).setOnClickListener(this);
        findViewById(R.id.ll_likes).setVisibility(0);
    }

    /* renamed from: b */
    private void m24783b(boolean z) {
        String trim = ((TextView) findViewById(R.id.et_coment_self)).getText().toString().replace("@", "").trim();
        if (!trim.equals("")) {
            ((TextView) findViewById(R.id.et_coment_self)).setTextColor(-7829368);
            this.f20750z.setVisibility(0);
            if (this.f20712F == null || this.f20712F.getStatus() != Status.RUNNING) {
                this.f20712F = new C6239g(trim);
                this.f20712F.execute(new String[0]);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x00a8, code lost:
        if (r12.equals(r14.toString()) != false) goto L_0x00aa;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo22312a(java.lang.Boolean r18, java.lang.Boolean r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, java.lang.String r26, java.lang.String r27, java.lang.String r28, java.lang.String r29, java.lang.String r30, java.lang.String r31) {
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
            boolean r12 = r0.f20738n
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
            int r14 = r0.f20727c
            r12.append(r14)
            java.lang.String r14 = ""
            r12.append(r14)
            java.lang.String r12 = r12.toString()
            boolean r12 = r2.equals(r12)
            if (r12 != 0) goto L_0x00aa
            java.lang.String r12 = r0.f20743s
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            int r15 = r0.f20727c
            r14.append(r15)
            java.lang.String r15 = ""
            r14.append(r15)
            java.lang.String r14 = r14.toString()
            boolean r12 = r12.equals(r14)
            if (r12 == 0) goto L_0x00c2
        L_0x00aa:
            boolean r12 = r0.f20738n
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
            int r12 = r0.f20727c
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
            int r6 = r0.f20730f
            if (r6 <= 0) goto L_0x0272
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            int r8 = r0.f20727c
            r6.append(r8)
            java.lang.String r8 = ""
            r6.append(r8)
            java.lang.String r6 = r6.toString()
            boolean r6 = r2.equals(r6)
            if (r6 == 0) goto L_0x01a2
            java.lang.String r6 = "0"
            r8 = 2131231019(0x7f08012b, float:1.8078107E38)
            r7.setTag(r8, r6)
            android.graphics.Bitmap r6 = r0.f20709C
            r7.setImageBitmap(r6)
            goto L_0x0277
        L_0x01a2:
            r8 = 2131231019(0x7f08012b, float:1.8078107E38)
            r7.setTag(r8, r4)
            java.lang.String r6 = "0"
            boolean r6 = r4.equals(r6)
            r8 = 2131165535(0x7f07015f, float:1.794529E38)
            r9 = 2131165533(0x7f07015d, float:1.7945286E38)
            if (r6 == 0) goto L_0x01d4
            boolean r6 = r0.f20738n
            if (r6 == 0) goto L_0x01c7
            android.content.res.Resources r6 = r17.getResources()
            android.graphics.drawable.Drawable r6 = r6.getDrawable(r9)
            r7.setImageDrawable(r6)
            goto L_0x0277
        L_0x01c7:
            android.content.res.Resources r6 = r17.getResources()
            android.graphics.drawable.Drawable r6 = r6.getDrawable(r8)
            r7.setImageDrawable(r6)
            goto L_0x0277
        L_0x01d4:
            java.io.File r6 = new java.io.File     // Catch:{ Exception -> 0x0256, OutOfMemoryError -> 0x0277 }
            java.io.File r10 = r0.f20710D     // Catch:{ Exception -> 0x0256, OutOfMemoryError -> 0x0277 }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0256, OutOfMemoryError -> 0x0277 }
            r11.<init>()     // Catch:{ Exception -> 0x0256, OutOfMemoryError -> 0x0277 }
            java.lang.String r13 = "fperfil_"
            r11.append(r13)     // Catch:{ Exception -> 0x0256, OutOfMemoryError -> 0x0277 }
            r11.append(r2)     // Catch:{ Exception -> 0x0256, OutOfMemoryError -> 0x0277 }
            java.lang.String r13 = ".jpg"
            r11.append(r13)     // Catch:{ Exception -> 0x0256, OutOfMemoryError -> 0x0277 }
            java.lang.String r11 = r11.toString()     // Catch:{ Exception -> 0x0256, OutOfMemoryError -> 0x0277 }
            r6.<init>(r10, r11)     // Catch:{ Exception -> 0x0256, OutOfMemoryError -> 0x0277 }
            android.graphics.BitmapFactory$Options r10 = new android.graphics.BitmapFactory$Options     // Catch:{ Exception -> 0x0256, OutOfMemoryError -> 0x0277 }
            r10.<init>()     // Catch:{ Exception -> 0x0256, OutOfMemoryError -> 0x0277 }
            r10.inJustDecodeBounds = r12     // Catch:{ Exception -> 0x0256, OutOfMemoryError -> 0x0277 }
            java.lang.String r11 = r6.getPath()     // Catch:{ Exception -> 0x0256, OutOfMemoryError -> 0x0277 }
            android.graphics.BitmapFactory.decodeFile(r11, r10)     // Catch:{ Exception -> 0x0256, OutOfMemoryError -> 0x0277 }
            int r11 = r10.outWidth     // Catch:{ Exception -> 0x0256, OutOfMemoryError -> 0x0277 }
            android.content.res.Resources r11 = r17.getResources()     // Catch:{ Exception -> 0x0256, OutOfMemoryError -> 0x0277 }
            android.util.DisplayMetrics r11 = r11.getDisplayMetrics()     // Catch:{ Exception -> 0x0256, OutOfMemoryError -> 0x0277 }
            float r11 = r11.density     // Catch:{ Exception -> 0x0256, OutOfMemoryError -> 0x0277 }
            r13 = 1111490560(0x42400000, float:48.0)
            float r11 = r11 * r13
            r14 = 1056964608(0x3f000000, float:0.5)
            float r11 = r11 + r14
            int r11 = (int) r11     // Catch:{ Exception -> 0x0256, OutOfMemoryError -> 0x0277 }
            android.content.res.Resources r15 = r17.getResources()     // Catch:{ Exception -> 0x0256, OutOfMemoryError -> 0x0277 }
            android.util.DisplayMetrics r15 = r15.getDisplayMetrics()     // Catch:{ Exception -> 0x0256, OutOfMemoryError -> 0x0277 }
            float r15 = r15.density     // Catch:{ Exception -> 0x0256, OutOfMemoryError -> 0x0277 }
            float r13 = r13 * r15
            float r13 = r13 + r14
            int r13 = (int) r13     // Catch:{ Exception -> 0x0256, OutOfMemoryError -> 0x0277 }
            int r14 = r10.outWidth     // Catch:{ Exception -> 0x0256, OutOfMemoryError -> 0x0277 }
            int r10 = r10.outHeight     // Catch:{ Exception -> 0x0256, OutOfMemoryError -> 0x0277 }
            if (r14 > r11) goto L_0x0228
            if (r10 > r13) goto L_0x0228
            goto L_0x0229
        L_0x0228:
            r12 = 0
        L_0x0229:
            if (r12 != 0) goto L_0x0246
            int r10 = mega.boicot.config.m23824a(r14, r10, r11, r13)     // Catch:{ Exception -> 0x0256, OutOfMemoryError -> 0x0277 }
            float r11 = (float) r14     // Catch:{ Exception -> 0x0256, OutOfMemoryError -> 0x0277 }
            float r10 = (float) r10     // Catch:{ Exception -> 0x0256, OutOfMemoryError -> 0x0277 }
            float r11 = r11 / r10
            int r10 = java.lang.Math.round(r11)     // Catch:{ Exception -> 0x0256, OutOfMemoryError -> 0x0277 }
            android.graphics.BitmapFactory$Options r11 = new android.graphics.BitmapFactory$Options     // Catch:{ Exception -> 0x0256, OutOfMemoryError -> 0x0277 }
            r11.<init>()     // Catch:{ Exception -> 0x0256, OutOfMemoryError -> 0x0277 }
            r11.inSampleSize = r10     // Catch:{ Exception -> 0x0256, OutOfMemoryError -> 0x0277 }
            java.lang.String r6 = r6.getPath()     // Catch:{ Exception -> 0x0256, OutOfMemoryError -> 0x0277 }
            android.graphics.Bitmap r6 = android.graphics.BitmapFactory.decodeFile(r6, r11)     // Catch:{ Exception -> 0x0256, OutOfMemoryError -> 0x0277 }
            goto L_0x0252
        L_0x0246:
            android.content.ContentResolver r10 = r17.getContentResolver()     // Catch:{ Exception -> 0x0256, OutOfMemoryError -> 0x0277 }
            android.net.Uri r6 = android.net.Uri.fromFile(r6)     // Catch:{ Exception -> 0x0256, OutOfMemoryError -> 0x0277 }
            android.graphics.Bitmap r6 = android.provider.MediaStore.Images.Media.getBitmap(r10, r6)     // Catch:{ Exception -> 0x0256, OutOfMemoryError -> 0x0277 }
        L_0x0252:
            r7.setImageBitmap(r6)     // Catch:{ Exception -> 0x0256, OutOfMemoryError -> 0x0277 }
            goto L_0x0277
        L_0x0256:
            boolean r6 = r0.f20738n
            if (r6 == 0) goto L_0x0266
            android.content.res.Resources r6 = r17.getResources()
            android.graphics.drawable.Drawable r6 = r6.getDrawable(r9)
            r7.setImageDrawable(r6)
            goto L_0x0277
        L_0x0266:
            android.content.res.Resources r6 = r17.getResources()
            android.graphics.drawable.Drawable r6 = r6.getDrawable(r8)
            r7.setImageDrawable(r6)
            goto L_0x0277
        L_0x0272:
            r6 = 8
            r7.setVisibility(r6)
        L_0x0277:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            int r7 = r0.f20727c
            r6.append(r7)
            java.lang.String r7 = ""
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            boolean r6 = r2.equals(r6)
            if (r6 != 0) goto L_0x02da
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
        L_0x02da:
            boolean r1 = r19.booleanValue()
            if (r1 == 0) goto L_0x02e9
            android.widget.LinearLayout r1 = r0.f20708B
            r2 = 0
            r1.addView(r5, r2)
        L_0x02e6:
            r1 = r20
            goto L_0x02ef
        L_0x02e9:
            android.widget.LinearLayout r1 = r0.f20708B
            r1.addView(r5)
            goto L_0x02e6
        L_0x02ef:
            r0.f20745u = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: mega.boicot.t_video_pro.mo22312a(java.lang.Boolean, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo22313a(boolean z) {
        this.f20708B.removeAllViews();
        boolean z2 = false;
        int i = 0;
        while (i < 4) {
            SharedPreferences sharedPreferences = this.f20707A;
            StringBuilder sb = new StringBuilder();
            sb.append("idcomv");
            sb.append(i);
            sb.append("_");
            sb.append(this.f20741q);
            if (!sharedPreferences.getString(sb.toString(), "").equals("")) {
                Boolean valueOf = Boolean.valueOf(z);
                Boolean valueOf2 = Boolean.valueOf(z2);
                SharedPreferences sharedPreferences2 = this.f20707A;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("idcomv");
                sb2.append(i);
                sb2.append("_");
                sb2.append(this.f20741q);
                String string = sharedPreferences2.getString(sb2.toString(), "");
                SharedPreferences sharedPreferences3 = this.f20707A;
                StringBuilder sb3 = new StringBuilder();
                sb3.append("comv");
                sb3.append(i);
                sb3.append("_idusucrea_");
                sb3.append(this.f20741q);
                String string2 = sharedPreferences3.getString(sb3.toString(), "");
                SharedPreferences sharedPreferences4 = this.f20707A;
                StringBuilder sb4 = new StringBuilder();
                sb4.append("comv");
                sb4.append(i);
                sb4.append("_nombre_");
                sb4.append(this.f20741q);
                String string3 = sharedPreferences4.getString(sb4.toString(), "");
                SharedPreferences sharedPreferences5 = this.f20707A;
                StringBuilder sb5 = new StringBuilder();
                sb5.append("comv");
                sb5.append(i);
                sb5.append("_fcrea_");
                sb5.append(this.f20741q);
                String string4 = sharedPreferences5.getString(sb5.toString(), "");
                SharedPreferences sharedPreferences6 = this.f20707A;
                StringBuilder sb6 = new StringBuilder();
                sb6.append("comv");
                sb6.append(i);
                sb6.append("_");
                sb6.append(this.f20741q);
                String string5 = sharedPreferences6.getString(sb6.toString(), "");
                SharedPreferences sharedPreferences7 = this.f20707A;
                StringBuilder sb7 = new StringBuilder();
                sb7.append("comv");
                sb7.append(i);
                sb7.append("_vfoto_");
                sb7.append(this.f20741q);
                String string6 = sharedPreferences7.getString(sb7.toString(), "");
                SharedPreferences sharedPreferences8 = this.f20707A;
                StringBuilder sb8 = new StringBuilder();
                sb8.append("comv");
                sb8.append(i);
                sb8.append("_privados_");
                sb8.append(this.f20741q);
                String string7 = sharedPreferences8.getString(sb8.toString(), "");
                SharedPreferences sharedPreferences9 = this.f20707A;
                StringBuilder sb9 = new StringBuilder();
                sb9.append("comv");
                sb9.append(i);
                sb9.append("_fnacd_");
                sb9.append(this.f20741q);
                String string8 = sharedPreferences9.getString(sb9.toString(), "");
                SharedPreferences sharedPreferences10 = this.f20707A;
                StringBuilder sb10 = new StringBuilder();
                sb10.append("comv");
                sb10.append(i);
                sb10.append("_fnacm_");
                sb10.append(this.f20741q);
                String string9 = sharedPreferences10.getString(sb10.toString(), "");
                SharedPreferences sharedPreferences11 = this.f20707A;
                StringBuilder sb11 = new StringBuilder();
                sb11.append("comv");
                sb11.append(i);
                sb11.append("_fnaca_");
                sb11.append(this.f20741q);
                String string10 = sharedPreferences11.getString(sb11.toString(), "");
                SharedPreferences sharedPreferences12 = this.f20707A;
                StringBuilder sb12 = new StringBuilder();
                String str = string10;
                sb12.append("comv");
                sb12.append(i);
                sb12.append("_sexo_");
                sb12.append(this.f20741q);
                String string11 = sharedPreferences12.getString(sb12.toString(), "");
                SharedPreferences sharedPreferences13 = this.f20707A;
                StringBuilder sb13 = new StringBuilder();
                String str2 = string11;
                sb13.append("comv");
                sb13.append(i);
                sb13.append("_coments_");
                sb13.append(this.f20741q);
                String string12 = sharedPreferences13.getString(sb13.toString(), "");
                String str3 = str;
                int i2 = i;
                mo22312a(valueOf, valueOf2, string, string2, string3, string4, string5, string6, string7, string8, string9, str3, str2, string12);
                i = i2 + 1;
                z2 = false;
            } else {
                return;
            }
        }
    }

    /* renamed from: g */
    public void mo22316g() {
        Intent intent = new Intent();
        intent.putExtra("nlikesv", this.f20740p);
        intent.putExtra("liked", this.f20742r);
        intent.putExtra("idv", this.f20741q);
        setResult(-1, intent);
        finish();
    }

    public void onPause() {
        if (!(this.f20725a.f18013cx == 0 || this.f20731g == null || this.f20731g.f17768a == null)) {
            this.f20731g.f17768a.mo12167b();
        }
        super.onPause();
        this.f20722P = this.f20721O.getCurrentPosition();
        this.f20721O.mo21514i();
    }

    public void onStop() {
        super.onStop();
        if (this.f20717K && !this.f20737m) {
            finish();
        }
    }

    public void onResume() {
        super.onResume();
        config.m23860m(this);
        if (this.f20721O != null && this.f20721O.f19536s) {
            this.f20721O.mo21556a(this.f20722P);
            this.f20721O.mo21513h();
        }
        if (this.f20725a.f18013cx != 0 && this.f20731g != null && this.f20731g.f17768a != null) {
            this.f20731g.f17768a.mo12165a();
        }
    }

    public void onDestroy() {
        if (!(this.f20725a.f18013cx == 0 || this.f20731g == null || this.f20731g.f17768a == null)) {
            this.f20731g.f17768a.mo12168c();
        }
        if (!(this.f20725a.f18013cx == 0 || this.f20731g == null || this.f20731g.f17769b == null)) {
            this.f20731g.f17769b.destroy();
        }
        if ((this.f20720N && isFinishing()) || config.f17841i) {
            config.m23861n(this);
        }
        super.onDestroy();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ((LinearLayout) findViewById(R.id.ll_princ)).removeViewAt(0);
        mo22315f();
        if (this.f20725a.f18045dm == 1) {
            ImageView imageView = (ImageView) findViewById(R.id.icohome);
            ((ImageView) findViewById(R.id.iv_drawer)).setOnClickListener(new OnClickListener() {
                public void onClick(View view) {
                    ((DrawerLayout) ((Activity) view.getContext()).findViewById(R.id.drawer_layout)).mo2178e(8388611);
                }
            });
            imageView.setOnClickListener(new OnClickListener() {
                public void onClick(View view) {
                    ((DrawerLayout) ((Activity) view.getContext()).findViewById(R.id.drawer_layout)).mo2178e(8388611);
                }
            });
        }
        ((LinearLayout) findViewById(R.id.ll_ad)).removeAllViews();
        if (!(this.f20731g == null || this.f20731g.f17768a == null)) {
            try {
                this.f20731g.f17768a.mo12168c();
            } catch (Exception unused) {
            }
        }
        if (!(this.f20731g == null || this.f20731g.f17769b == null)) {
            try {
                this.f20731g.f17769b.destroy();
            } catch (Exception unused2) {
            }
        }
        this.f20731g = this.f20725a.mo20760a((Context) this, false);
        if (configuration.orientation == 2) {
            if (!this.f20721O.mo21570r()) {
                this.f20721O.setFullscreen(true);
            } else {
                this.f20721O.mo21571s();
            }
        } else if (this.f20721O.mo21570r()) {
            this.f20721O.setFullscreen(false);
        } else {
            this.f20721O.mo21571s();
        }
    }

    public void onBackPressed() {
        if (this.f20721O.mo21570r()) {
            this.f20721O.setFullscreen(false);
        } else if (!this.f20720N || this.f20719M || !this.f20725a.f18059ea) {
            mo22316g();
            super.onBackPressed();
        } else {
            this.f20719M = true;
            config.m23859l(this);
        }
    }

    public void adLoaded(String str) {
        this.f20749y.cancel();
        this.f20733i.showAd();
    }

    public void onAdClosed() {
        if (this.f20736l) {
            abrir_secc(this.f20748x);
        }
    }

    public void adError(String str) {
        this.f20749y.cancel();
        abrir_secc(this.f20748x);
    }

    public void videoEnded() {
        this.f20736l = true;
        config.m23867t(this);
    }

    /* renamed from: z_ */
    public void mo9678z_() {
        this.f20749y.cancel();
        this.f20732h.mo12836a();
    }

    /* renamed from: a */
    public void mo9675a(C3165a aVar) {
        this.f20736l = true;
        config.m23867t(this);
    }

    /* renamed from: A_ */
    public void mo9671A_() {
        if (this.f20736l) {
            abrir_secc(this.f20748x);
        }
    }

    /* renamed from: e */
    public void mo9676e() {
        this.f20736l = false;
    }

    /* renamed from: a */
    public void mo9674a(int i) {
        if (!this.f20725a.mo20775a((Context) this, this.f20733i)) {
            this.f20749y.cancel();
            abrir_secc(this.f20748x);
        }
    }

    public void onError(C1514Ad ad, AdError adError) {
        this.f20749y.cancel();
        abrir_secc(this.f20748x);
    }

    public void onAdLoaded(C1514Ad ad) {
        this.f20749y.cancel();
        this.f20734j.show();
    }

    public void onRewardedVideoCompleted() {
        this.f20736l = true;
        config.m23867t(this);
    }

    public void onRewardedVideoClosed() {
        if (this.f20736l) {
            abrir_secc(this.f20748x);
        }
    }

    public void onVideoCompleted() {
        this.f20736l = true;
        config.m23867t(this);
    }

    public void onReceiveAd(C5286Ad ad) {
        this.f20749y.cancel();
        this.f20735k.showAd("REWARDED VIDEO", new AdDisplayListener() {
            public void adClicked(C5286Ad ad) {
            }

            public void adDisplayed(C5286Ad ad) {
            }

            public void adNotDisplayed(C5286Ad ad) {
            }

            public void adHidden(C5286Ad ad) {
                if (t_video_pro.this.f20736l) {
                    t_video_pro.this.abrir_secc(t_video_pro.this.f20748x);
                }
            }
        });
    }

    public void onFailedToReceiveAd(C5286Ad ad) {
        this.f20749y.cancel();
        abrir_secc(this.f20748x);
    }
}
