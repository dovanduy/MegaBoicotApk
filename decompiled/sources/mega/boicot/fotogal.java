package mega.boicot;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.app.ProgressDialog;
import android.app.SearchManager;
import android.app.SearchManager.OnCancelListener;
import android.app.SearchManager.OnDismissListener;
import android.content.ContentValues;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnShowListener;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.GradientDrawable.Orientation;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.AsyncTask.Status;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.provider.MediaStore.Images.Media;
import android.support.p017v4.app.C0236a;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ProgressBar;
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
import com.google.android.gms.ads.C2997g;
import com.google.android.gms.ads.reward.C3165a;
import com.google.android.gms.ads.reward.C3166b;
import com.google.android.gms.ads.reward.C3167c;
import com.startapp.android.publish.adsCommon.C5286Ad;
import com.startapp.android.publish.adsCommon.StartAppAd;
import com.startapp.android.publish.adsCommon.VideoListener;
import com.startapp.android.publish.adsCommon.adListeners.AdDisplayListener;
import com.startapp.android.publish.adsCommon.adListeners.AdEventListener;
import java.io.OutputStream;
import java.util.ArrayList;
import org.apache.p199a.p202b.p204b.C6274e;
import org.apache.p199a.p202b.p204b.C6276g;
import org.apache.p199a.p215e.p216a.C6367d;
import org.apache.p199a.p215e.p216a.C6370g;
import org.apache.p199a.p218f.p220b.C6409h;
import org.apache.p199a.p227i.C6529b;
import org.apache.p199a.p227i.C6530c;
import org.apache.p199a.p227i.C6531d;

public class fotogal extends Activity implements OnClickListener, OnAdClosed, OnAdError, OnAdLoaded, OnVideoEnded, RewardedVideoAdListener, C3167c, VideoListener, AdEventListener, C5599a {

    /* renamed from: A */
    Builder f19783A;

    /* renamed from: B */
    View f19784B;

    /* renamed from: C */
    ListView f19785C;
    /* access modifiers changed from: private */

    /* renamed from: D */
    public ArrayList<C6029o> f19786D;
    /* access modifiers changed from: private */

    /* renamed from: E */
    public C6021n f19787E;

    /* renamed from: a */
    config f19788a;

    /* renamed from: b */
    Bundle f19789b;

    /* renamed from: c */
    int f19790c;

    /* renamed from: d */
    int f19791d;

    /* renamed from: e */
    int f19792e = 0;

    /* renamed from: f */
    boolean f19793f = false;

    /* renamed from: g */
    boolean f19794g;

    /* renamed from: h */
    boolean f19795h = true;

    /* renamed from: i */
    String f19796i;

    /* renamed from: j */
    String f19797j;

    /* renamed from: k */
    String f19798k;

    /* renamed from: l */
    String f19799l;

    /* renamed from: m */
    String f19800m;

    /* renamed from: n */
    String f19801n;

    /* renamed from: o */
    SharedPreferences f19802o;

    /* renamed from: p */
    WebView f19803p;

    /* renamed from: q */
    C5602c f19804q;

    /* renamed from: r */
    C3166b f19805r;

    /* renamed from: s */
    RewardedVideo f19806s;

    /* renamed from: t */
    RewardedVideoAd f19807t;

    /* renamed from: u */
    StartAppAd f19808u;

    /* renamed from: v */
    boolean f19809v = false;

    /* renamed from: w */
    boolean f19810w = false;

    /* renamed from: x */
    View f19811x;

    /* renamed from: y */
    ProgressDialog f19812y;

    /* renamed from: z */
    C6009a f19813z;

    /* renamed from: mega.boicot.fotogal$a */
    private class C6009a extends AsyncTask<String, Void, String> {
        private C6009a() {
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
            fotogal.this.f19784B.findViewById(R.id.likes_pb).setVisibility(0);
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
                mega.boicot.fotogal r1 = mega.boicot.fotogal.this     // Catch:{ Exception -> 0x00a3 }
                int r1 = r1.f19790c     // Catch:{ Exception -> 0x00a3 }
                r0.append(r1)     // Catch:{ Exception -> 0x00a3 }
                java.lang.String r1 = "&c="
                r0.append(r1)     // Catch:{ Exception -> 0x00a3 }
                mega.boicot.fotogal r1 = mega.boicot.fotogal.this     // Catch:{ Exception -> 0x00a3 }
                java.lang.String r1 = r1.f19796i     // Catch:{ Exception -> 0x00a3 }
                r0.append(r1)     // Catch:{ Exception -> 0x00a3 }
                java.lang.String r1 = "&id_fotogal="
                r0.append(r1)     // Catch:{ Exception -> 0x00a3 }
                mega.boicot.fotogal r1 = mega.boicot.fotogal.this     // Catch:{ Exception -> 0x00a3 }
                java.lang.String r1 = r1.f19798k     // Catch:{ Exception -> 0x00a3 }
                r0.append(r1)     // Catch:{ Exception -> 0x00a3 }
                java.lang.String r1 = "&n="
                r0.append(r1)     // Catch:{ Exception -> 0x00a3 }
                mega.boicot.fotogal r1 = mega.boicot.fotogal.this     // Catch:{ Exception -> 0x00a3 }
                int r1 = r1.f19792e     // Catch:{ Exception -> 0x00a3 }
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
            throw new UnsupportedOperationException("Method not decompiled: mega.boicot.fotogal.C6009a.doInBackground(java.lang.String[]):java.lang.String");
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void onPostExecute(String str) {
            boolean z;
            try {
                fotogal.this.f19784B.findViewById(R.id.likes_pb).setVisibility(8);
            } catch (Exception unused) {
            }
            if (str.contains("ANDROID:OK DATOS:")) {
                int indexOf = str.indexOf("DATOS:") + 6;
                String[] split = str.substring(indexOf, str.indexOf(";", indexOf)).split(",");
                if (fotogal.this.f19786D.size() == 0) {
                    if (fotogal.this.f19799l.equals("1")) {
                        C6029o oVar = new C6029o();
                        StringBuilder sb = new StringBuilder();
                        sb.append(fotogal.this.f19790c);
                        sb.append("");
                        oVar.f19938f = sb.toString();
                        oVar.f19937e = fotogal.this.getResources().getString(R.string.tu);
                        oVar.f19934b = fotogal.this.f19788a.mo20757a((Context) fotogal.this, 1).exists();
                        fotogal.this.f19786D.add(oVar);
                    }
                } else if (((C6029o) fotogal.this.f19786D.get(fotogal.this.f19786D.size() - 1)).f19935c) {
                    fotogal.this.f19786D.remove(fotogal.this.f19786D.size() - 1);
                }
                int i = 0;
                while (!split[i].equals("S") && !split[i].equals("N")) {
                    String[] split2 = split[i].split("-");
                    int i2 = 0;
                    while (true) {
                        if (i2 >= fotogal.this.f19786D.size()) {
                            z = false;
                            break;
                        } else if (((C6029o) fotogal.this.f19786D.get(i2)).f19938f.equals(split2[0])) {
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
                        fotogal.this.f19786D.add(oVar2);
                        fotogal.this.f19792e++;
                    }
                    i++;
                }
                if (split[i].equals("S")) {
                    C6029o oVar3 = new C6029o();
                    oVar3.f19935c = true;
                    fotogal.this.f19786D.add(oVar3);
                }
                fotogal.this.f19787E.notifyDataSetChanged();
            }
        }
    }

    /* renamed from: mega.boicot.fotogal$b */
    private class C6010b extends AsyncTask<String, Void, Byte> {

        /* renamed from: a */
        String f19828a;

        C6010b(String str) {
            this.f19828a = str;
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
                java.lang.String r1 = "/srv/eliminar_fotogal.php?idusu="
                r0.append(r1)     // Catch:{ Exception -> 0x0095 }
                mega.boicot.fotogal r1 = mega.boicot.fotogal.this     // Catch:{ Exception -> 0x0095 }
                int r1 = r1.f19790c     // Catch:{ Exception -> 0x0095 }
                r0.append(r1)     // Catch:{ Exception -> 0x0095 }
                java.lang.String r1 = "&c="
                r0.append(r1)     // Catch:{ Exception -> 0x0095 }
                mega.boicot.fotogal r1 = mega.boicot.fotogal.this     // Catch:{ Exception -> 0x0095 }
                java.lang.String r1 = r1.f19796i     // Catch:{ Exception -> 0x0095 }
                r0.append(r1)     // Catch:{ Exception -> 0x0095 }
                java.lang.String r1 = "&idf="
                r0.append(r1)     // Catch:{ Exception -> 0x0095 }
                java.lang.String r1 = r6.f19828a     // Catch:{ Exception -> 0x0095 }
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
            throw new UnsupportedOperationException("Method not decompiled: mega.boicot.fotogal.C6010b.doInBackground(java.lang.String[]):java.lang.Byte");
        }
    }

    /* renamed from: mega.boicot.fotogal$c */
    private class C6011c extends AsyncTask<String, Void, String> {
        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void onPostExecute(String str) {
        }

        private C6011c() {
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
                sb.append("/srv/like_fotogal.php?idusu=");
                sb.append(fotogal.this.f19790c);
                sb.append("&c=");
                sb.append(fotogal.this.f19796i);
                sb.append("&idusu_pro=");
                sb.append(fotogal.this.f19800m);
                sb.append("&idf=");
                sb.append(fotogal.this.f19798k);
                sb.append("&modo=");
                sb.append(fotogal.this.f19799l);
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

    /* renamed from: mega.boicot.fotogal$d */
    private class C6012d extends AsyncTask<String, Void, String> {
        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void onPostExecute(String str) {
        }

        private C6012d() {
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
                sb.append("/srv/reportar_fotogal.php?idusu=");
                sb.append(fotogal.this.f19790c);
                sb.append("&c=");
                sb.append(fotogal.this.f19796i);
                sb.append("&idusu_pro=");
                sb.append(fotogal.this.f19800m);
                sb.append("&idf=");
                sb.append(fotogal.this.f19798k);
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

    public void onCreate(Bundle bundle) {
        this.f19788a = (config) getApplicationContext();
        if (this.f19788a.f17881aN == null) {
            this.f19788a.mo20780b();
        }
        this.f19801n = config.m23831a("FFFFFFFF", this.f19788a.f17890aW);
        super.onCreate(bundle);
        setContentView(R.layout.fotogal);
        this.f19789b = getIntent().getExtras();
        if (bundle == null) {
            this.f19794g = this.f19789b != null && this.f19789b.containsKey("es_root") && this.f19789b.getBoolean("es_root", false);
        } else {
            this.f19794g = bundle.containsKey("es_root") && bundle.getBoolean("es_root", false);
        }
        mo21741g();
        if (this.f19788a.f18080q > 0) {
            SearchManager searchManager = (SearchManager) getSystemService("search");
            searchManager.setOnCancelListener(new OnCancelListener() {
                public void onCancel() {
                    fotogal.this.f19793f = false;
                    fotogal.this.setResult(0);
                }
            });
            searchManager.setOnDismissListener(new OnDismissListener() {
                public void onDismiss() {
                    fotogal.this.f19810w = false;
                }
            });
        }
        this.f19804q = this.f19788a.mo20760a((Context) this, false);
        this.f19802o = getSharedPreferences("sh", 0);
        this.f19790c = this.f19802o.getInt("idusu", 0);
        this.f19796i = this.f19802o.getString("cod", "");
        this.f19797j = this.f19789b.getString("nlikes");
        this.f19798k = this.f19789b.getString("idf");
        this.f19791d = this.f19789b.getInt("indf");
        this.f19799l = this.f19789b.getString("liked");
        this.f19800m = this.f19789b.getString("idusu_profile");
        this.f19786D = new ArrayList<>();
        TextView textView = (TextView) findViewById(R.id.tv_likes_n);
        findViewById(R.id.tv_likes_n).setBackgroundDrawable(getResources().getDrawable(R.drawable.likes_izq));
        textView.setTextColor(config.f17813a);
        textView.setText(this.f19797j);
        String str = "";
        if (this.f19799l.equals("1")) {
            str = getResources().getString(R.string.tegusta);
        }
        ((TextView) findViewById(R.id.tv_likes)).setText(str);
        findViewById(R.id.iv_cerrar).setOnClickListener(this);
        findViewById(R.id.iv_like).setOnClickListener(this);
        findViewById(R.id.tv_likes_n).setOnClickListener(this);
        String str2 = this.f19800m;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f19790c);
        sb.append("");
        if (str2.equals(sb.toString())) {
            findViewById(R.id.iv_reportar).setVisibility(8);
            findViewById(R.id.iv_elim).setOnClickListener(this);
            findViewById(R.id.iv_elim).setVisibility(0);
        } else {
            findViewById(R.id.iv_reportar).setOnClickListener(this);
        }
        this.f19803p = (WebView) findViewById(R.id.webview);
        if (this.f19789b.getString("url").startsWith("file://")) {
            registerForContextMenu(this.f19803p);
            String str3 = this.f19788a.f17881aN;
            String str4 = this.f19788a.f17882aO;
            if (this.f19788a.f18075l != -1) {
                str3 = this.f19788a.f17971bz[this.f19788a.f18075l].f18314g;
                str4 = this.f19788a.f17971bz[this.f19788a.f18075l].f18315h;
            }
            if (this.f19789b.containsKey("bg1")) {
                str3 = this.f19789b.getString("bg1");
                str4 = this.f19789b.getString("bg2");
            }
            if (!str3.equals("")) {
                Orientation orientation = Orientation.TOP_BOTTOM;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("#");
                sb2.append(str3);
                StringBuilder sb3 = new StringBuilder();
                sb3.append("#");
                sb3.append(str4);
                findViewById(R.id.ll_princ).setBackgroundDrawable(new GradientDrawable(orientation, new int[]{Color.parseColor(sb2.toString()), Color.parseColor(sb3.toString())}));
                this.f19803p.setBackgroundColor(0);
            }
        }
        this.f19803p.setWebChromeClient(new WebChromeClient() {
        });
        this.f19803p.getSettings().setBuiltInZoomControls(true);
        this.f19803p.getSettings().setSupportZoom(true);
        this.f19803p.setOnTouchListener(new OnTouchListener() {
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
        this.f19803p.getSettings().setUseWideViewPort(true);
        this.f19803p.getSettings().setLoadWithOverviewMode(true);
        this.f19803p.setWebViewClient(new WebViewClient() {
            public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
                boolean z;
                if (!fotogal.this.f19793f && !fotogal.this.isFinishing() && !fotogal.this.f19789b.getString("url").contains("youtube.com") && !fotogal.this.f19789b.getString("url").contains("youtu.be")) {
                    boolean z2 = false;
                    if (fotogal.this.f19795h) {
                        boolean z3 = true;
                        z = fotogal.this.f19789b != null && fotogal.this.f19789b.containsKey("ad_entrar");
                        if (fotogal.this.f19789b == null || !fotogal.this.f19789b.containsKey("fb_entrar")) {
                            z3 = false;
                        }
                        fotogal.this.f19795h = false;
                        z2 = z3;
                    } else {
                        z = false;
                    }
                    fotogal.this.f19788a.mo20770a((Context) fotogal.this, z, z2);
                }
            }
        });
        if (bundle == null) {
            this.f19803p.loadUrl(this.f19789b.getString("url"));
        }
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (i == 104 && config.m23853d() && iArr.length > 0 && strArr[0].equals("android.permission.WRITE_EXTERNAL_STORAGE") && iArr[0] == 0 && getPackageManager().checkPermission("android.permission.WRITE_EXTERNAL_STORAGE", getPackageName()) == 0) {
            config.m23841a(this.f19789b.getString("url"), (Context) this);
        }
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenuInfo contextMenuInfo) {
        super.onCreateContextMenu(contextMenu, view, contextMenuInfo);
        getMenuInflater().inflate(R.menu.m3, contextMenu);
        if (config.m23853d()) {
            MenuItem findItem = contextMenu.findItem(R.id.guardar);
            StringBuilder sb = new StringBuilder();
            sb.append(findItem.getTitle());
            sb.append("");
            String sb2 = sb.toString();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(sb2.substring(0, 1).toUpperCase());
            sb3.append(sb2.substring(1).toLowerCase());
            findItem.setTitle(sb3.toString());
            return;
        }
        contextMenu.removeItem(R.id.guardar);
    }

    public boolean onContextItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == R.id.compartir) {
            Intent intent = new Intent("android.intent.action.SEND");
            intent.setType("image/jpeg");
            ContentValues contentValues = new ContentValues();
            contentValues.put("mime_type", "image/jpeg");
            Uri insert = getContentResolver().insert(Media.EXTERNAL_CONTENT_URI, contentValues);
            try {
                OutputStream openOutputStream = getContentResolver().openOutputStream(insert);
                Options options = new Options();
                options.inPreferredConfig = Config.ARGB_8888;
                BitmapFactory.decodeFile(this.f19789b.getString("url").replace("file://", ""), options).compress(CompressFormat.JPEG, 100, openOutputStream);
                openOutputStream.close();
                intent.putExtra("android.intent.extra.STREAM", insert);
                startActivity(Intent.createChooser(intent, getResources().getString(R.string.compartir)));
            } catch (Exception e) {
                System.err.println(e.toString());
            }
            return true;
        } else if (itemId != R.id.guardar) {
            return super.onContextItemSelected(menuItem);
        } else {
            if (!config.m23853d() || getPackageManager().checkPermission("android.permission.WRITE_EXTERNAL_STORAGE", getPackageName()) != 0) {
                C0236a.m717a(this, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 104);
            } else {
                config.m23841a(this.f19789b.getString("url"), (Context) this);
            }
            return true;
        }
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return super.onKeyDown(i, keyEvent);
        }
        if (this.f19803p.canGoBack()) {
            this.f19803p.goBack();
            return true;
        }
        mo21740f();
        return true;
    }

    public boolean onSearchRequested() {
        if (this.f19788a.f18080q == 0) {
            return false;
        }
        this.f19793f = true;
        this.f19810w = true;
        return super.onSearchRequested();
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getWindow().setFormat(1);
    }

    /* renamed from: f */
    public void mo21740f() {
        Intent intent = new Intent();
        intent.putExtra("nlikes", this.f19797j);
        intent.putExtra("liked", this.f19799l);
        intent.putExtra("idf", this.f19798k);
        setResult(-1, intent);
        finish();
    }

    public void onClick(View view) {
        if (view.getId() == R.id.iv_cerrar) {
            mo21740f();
        } else if (view.getId() == R.id.tv_likes_n) {
            if (!this.f19797j.equals("0")) {
                this.f19783A = new Builder(this);
                this.f19784B = getLayoutInflater().inflate(R.layout.likes_list, null);
                if (VERSION.SDK_INT > 20) {
                    config.m23838a((ProgressBar) this.f19784B.findViewById(R.id.likes_pb), this.f19788a.f17890aW);
                }
                this.f19783A.setView(this.f19784B);
                this.f19783A.setCancelable(true);
                ListView listView = (ListView) this.f19784B.findViewById(R.id.lv);
                listView.setCacheColorHint(0);
                this.f19787E = new C6021n(this, R.layout.likes_item, this.f19786D, this.f19790c);
                listView.setAdapter(this.f19787E);
                listView.setOnItemClickListener(new OnItemClickListener() {
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                        C6029o oVar = (C6029o) fotogal.this.f19786D.get(i);
                        if (!oVar.f19935c) {
                            String str = oVar.f19938f;
                            StringBuilder sb = new StringBuilder();
                            sb.append(fotogal.this.f19790c);
                            sb.append("");
                            if (!str.equals(sb.toString())) {
                                String str2 = oVar.f19938f;
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append(fotogal.this.f19800m);
                                sb2.append("");
                                if (!str2.equals(sb2.toString())) {
                                    Intent intent = new Intent(fotogal.this, profile.class);
                                    intent.putExtra(TtmlNode.ATTR_ID, oVar.f19938f);
                                    intent.putExtra("privados", oVar.f19940h);
                                    intent.putExtra("nombre", oVar.f19937e);
                                    intent.putExtra("coments", oVar.f19942j);
                                    intent.putExtra("fnac_d", oVar.f19943k);
                                    intent.putExtra("fnac_m", oVar.f19944l);
                                    intent.putExtra("fnac_a", oVar.f19945m);
                                    intent.putExtra("sexo", oVar.f19941i);
                                    intent.putExtra("vfoto", oVar.f19939g);
                                    if (fotogal.this.f19789b.containsKey("desdepriv")) {
                                        intent.putExtra("desdepriv", "1");
                                    }
                                    intent.putExtra("p_fnac", fotogal.this.f19789b.getInt("p_fnac"));
                                    intent.putExtra("p_sexo", fotogal.this.f19789b.getInt("p_sexo"));
                                    intent.putExtra("p_descr", fotogal.this.f19789b.getInt("p_descr"));
                                    intent.putExtra("p_dist", fotogal.this.f19789b.getInt("p_dist"));
                                    intent.putExtra("coments_chat", fotogal.this.f19789b.getBoolean("coments_chat"));
                                    intent.putExtra("galeria", fotogal.this.f19789b.getBoolean("galeria"));
                                    intent.putExtra("privados_chat", fotogal.this.f19789b.getBoolean("privados_chat"));
                                    intent.putExtra("fotos_perfil", fotogal.this.f19789b.getInt("fotos_perfil"));
                                    intent.putExtra("fotos_chat", fotogal.this.f19789b.getInt("fotos_chat"));
                                    fotogal.this.startActivityForResult(intent, 0);
                                }
                            }
                        } else if (fotogal.this.f19813z == null || fotogal.this.f19813z.getStatus() != Status.RUNNING) {
                            fotogal.this.f19813z = new C6009a();
                            fotogal.this.f19813z.execute(new String[0]);
                        }
                    }
                });
                this.f19783A.show();
                if (this.f19786D.size() == 0 && (this.f19813z == null || this.f19813z.getStatus() != Status.RUNNING)) {
                    this.f19813z = new C6009a();
                    this.f19813z.execute(new String[0]);
                }
            }
        } else if (view.getId() == R.id.iv_like) {
            if (this.f19799l.equals("0")) {
                StringBuilder sb = new StringBuilder();
                sb.append(Integer.parseInt(this.f19797j) + 1);
                sb.append("");
                this.f19797j = sb.toString();
                this.f19799l = "1";
                String str = this.f19800m;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(this.f19790c);
                sb2.append("");
                if (!str.equals(sb2.toString())) {
                    SharedPreferences sharedPreferences = this.f19802o;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("usufav_");
                    sb3.append(this.f19800m);
                    if (!sharedPreferences.contains(sb3.toString())) {
                        SharedPreferences sharedPreferences2 = this.f19802o;
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("usufav_noactivar_");
                        sb4.append(this.f19800m);
                        if (!sharedPreferences2.contains(sb4.toString())) {
                            Editor edit = this.f19802o.edit();
                            StringBuilder sb5 = new StringBuilder();
                            sb5.append("usufav_");
                            sb5.append(this.f19800m);
                            edit.putBoolean(sb5.toString(), true);
                            edit.commit();
                        }
                    }
                }
                if (this.f19786D.size() > 0) {
                    String str2 = ((C6029o) this.f19786D.get(0)).f19938f;
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append(this.f19790c);
                    sb6.append("");
                    if (!str2.equals(sb6.toString())) {
                        C6029o oVar = new C6029o();
                        StringBuilder sb7 = new StringBuilder();
                        sb7.append(this.f19790c);
                        sb7.append("");
                        oVar.f19938f = sb7.toString();
                        oVar.f19937e = getResources().getString(R.string.tu);
                        oVar.f19934b = this.f19788a.mo20757a((Context) this, 1).exists();
                        this.f19786D.add(0, oVar);
                        this.f19787E.notifyDataSetChanged();
                    }
                }
            } else {
                StringBuilder sb8 = new StringBuilder();
                sb8.append(Integer.parseInt(this.f19797j) - 1);
                sb8.append("");
                this.f19797j = sb8.toString();
                this.f19799l = "0";
                if (this.f19786D.size() > 0) {
                    String str3 = ((C6029o) this.f19786D.get(0)).f19938f;
                    StringBuilder sb9 = new StringBuilder();
                    sb9.append(this.f19790c);
                    sb9.append("");
                    if (str3.equals(sb9.toString())) {
                        this.f19786D.remove(0);
                        this.f19787E.notifyDataSetChanged();
                    }
                }
            }
            ((TextView) findViewById(R.id.tv_likes_n)).setText(this.f19797j);
            String str4 = "";
            if (this.f19799l.equals("1")) {
                str4 = getResources().getString(R.string.tegusta);
            }
            ((TextView) findViewById(R.id.tv_likes)).setText(str4);
            new C6011c().execute(new String[0]);
        } else if (view.getId() == R.id.iv_reportar) {
            final AlertDialog create = new Builder(this).setNegativeButton(R.string.cancelar, null).setPositiveButton(R.string.aceptar, new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialogInterface, int i) {
                    fotogal.this.findViewById(R.id.iv_reportar).setVisibility(8);
                    config.m23839a(Toast.makeText(fotogal.this, fotogal.this.getResources().getString(R.string.enviando), 0));
                    new C6012d().execute(new String[0]);
                }
            }).setMessage(R.string.confirmar_reportarfoto).create();
            if (!this.f19801n.equals("")) {
                create.setOnShowListener(new OnShowListener() {
                    public void onShow(DialogInterface dialogInterface) {
                        Button button = create.getButton(-1);
                        StringBuilder sb = new StringBuilder();
                        sb.append("#");
                        sb.append(fotogal.this.f19801n);
                        button.setTextColor(Color.parseColor(sb.toString()));
                        Button button2 = create.getButton(-2);
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("#");
                        sb2.append(fotogal.this.f19801n);
                        button2.setTextColor(Color.parseColor(sb2.toString()));
                    }
                });
            }
            create.show();
            try {
                ((TextView) create.findViewById(16908299)).setTypeface(Typeface.MONOSPACE);
            } catch (Exception unused) {
            }
        } else if (view.getId() == R.id.iv_elim) {
            final AlertDialog create2 = new Builder(this).setNegativeButton(R.string.no, null).setPositiveButton(R.string.si, new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialogInterface, int i) {
                    new C6010b(fotogal.this.f19798k).execute(new String[0]);
                    Intent intent = new Intent();
                    intent.putExtra("elim_foto", fotogal.this.f19798k);
                    intent.putExtra("indf", fotogal.this.f19791d);
                    fotogal.this.setResult(-1, intent);
                    fotogal.this.finish();
                }
            }).setMessage(R.string.confirmar_elimfoto).create();
            if (!this.f19801n.equals("")) {
                create2.setOnShowListener(new OnShowListener() {
                    public void onShow(DialogInterface dialogInterface) {
                        Button button = create2.getButton(-1);
                        StringBuilder sb = new StringBuilder();
                        sb.append("#");
                        sb.append(fotogal.this.f19801n);
                        button.setTextColor(Color.parseColor(sb.toString()));
                        Button button2 = create2.getButton(-2);
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("#");
                        sb2.append(fotogal.this.f19801n);
                        button2.setTextColor(Color.parseColor(sb2.toString()));
                    }
                });
            }
            create2.show();
            ((TextView) create2.findViewById(16908299)).setTypeface(Typeface.MONOSPACE);
        } else if ((this.f19788a.f17986cO == null || this.f19788a.f17986cO.equals("")) && ((this.f19788a.f17985cN == null || this.f19788a.f17985cN.equals("")) && ((this.f19788a.f17988cQ == null || this.f19788a.f17988cQ.equals("")) && (this.f19788a.f17989cR == null || this.f19788a.f17989cR.equals(""))))) {
            abrir_secc(view);
        } else {
            if (this.f19788a.f17986cO != null && !this.f19788a.f17986cO.equals("")) {
                this.f19806s = new RewardedVideo((Context) this, this.f19788a.f17986cO);
            }
            if (this.f19788a.f17985cN != null && !this.f19788a.f17985cN.equals("")) {
                this.f19805r = C2997g.m10716a(this);
            }
            if (this.f19788a.f17988cQ != null && !this.f19788a.f17988cQ.equals("")) {
                this.f19807t = new RewardedVideoAd(this, this.f19788a.f17988cQ);
            }
            if (this.f19788a.f17989cR != null && !this.f19788a.f17989cR.equals("")) {
                this.f19808u = new StartAppAd(this);
            }
            this.f19812y = new ProgressDialog(this);
            this.f19811x = view;
            if (!this.f19788a.mo20774a((Context) this, view, this.f19801n, this.f19812y, this.f19805r, this.f19806s, this.f19807t, this.f19808u)) {
                abrir_secc(view);
            }
        }
    }

    public void abrir_secc(View view) {
        C5662h a = this.f19788a.mo20761a(view, (Context) this);
        if (a.f18227b) {
            this.f19793f = true;
            Intent intent = new Intent();
            intent.putExtra("finalizar", true);
            intent.putExtra("finalizar_app", a.f18228c);
            setResult(-1, intent);
        }
        if (a.f18229d) {
            startActivityForResult(a.f18226a, 0);
        } else if (a.f18226a != null) {
            if (a.f18227b && this.f19788a.f18045dm != 2) {
                a.f18226a.putExtra("es_root", true);
            }
            this.f19794g = false;
            startActivity(a.f18226a);
        }
        if (this.f19793f && !this.f19810w) {
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i2 == -1) {
            if (intent == null || !intent.hasExtra("finalizar")) {
                if (intent != null && intent.hasExtra("accion_usu_fav_id")) {
                    for (int i3 = 0; i3 < this.f19786D.size(); i3++) {
                        if (((C6029o) this.f19786D.get(i3)).f19938f.equals(intent.getStringExtra("accion_usu_fav_id"))) {
                            ((C6029o) this.f19786D.get(i3)).f19936d = intent.getBooleanExtra("accion_usu_fav_accion", false);
                            this.f19787E.notifyDataSetChanged();
                            return;
                        }
                    }
                }
            } else if (intent.getExtras().getBoolean("finalizar")) {
                if (!intent.getExtras().getBoolean("finalizar_app")) {
                    this.f19794g = false;
                }
                setResult(-1, intent);
                finish();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public void mo21741g() {
        int b = this.f19788a.mo20778b((Context) this);
        if (this.f19788a.f18045dm == 1) {
            this.f19785C = (ListView) findViewById(R.id.left_drawer);
            this.f19788a.mo20771a(this.f19785C);
        } else if (this.f19788a.f18045dm == 0) {
            int i = 0;
            for (int i2 = 0; i2 < this.f19788a.f17971bz.length; i2++) {
                if (!this.f19788a.f17971bz[i2].f18333z) {
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
        for (int i3 = 0; i3 < this.f19788a.f17923bD.length; i3++) {
            if (this.f19788a.f17923bD[i3] > 0) {
                findViewById(this.f19788a.f17923bD[i3]).setOnClickListener(this);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.f19803p.saveState(bundle);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        this.f19803p.restoreState(bundle);
    }

    public void onStop() {
        super.onStop();
        if (this.f19793f && !this.f19810w) {
            finish();
        }
    }

    public void onPause() {
        if (!(this.f19788a.f18013cx == 0 || this.f19804q == null || this.f19804q.f17768a == null)) {
            this.f19804q.f17768a.mo12167b();
        }
        super.onPause();
    }

    public void onResume() {
        super.onResume();
        config.m23860m(this);
        if (!(this.f19788a.f18013cx == 0 || this.f19804q == null || this.f19804q.f17768a == null)) {
            this.f19804q.f17768a.mo12165a();
        }
        this.f19803p.onResume();
    }

    public void onDestroy() {
        if (!(this.f19788a.f18013cx == 0 || this.f19804q == null || this.f19804q.f17768a == null)) {
            this.f19804q.f17768a.mo12168c();
        }
        if (!(this.f19788a.f18013cx == 0 || this.f19804q == null || this.f19804q.f17769b == null)) {
            this.f19804q.f17769b.destroy();
        }
        if ((this.f19794g && isFinishing()) || config.f17841i) {
            config.m23861n(this);
        }
        super.onDestroy();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ((LinearLayout) findViewById(R.id.ll_princ)).removeViewAt(0);
        mo21741g();
        ((LinearLayout) findViewById(R.id.ll_ad)).removeAllViews();
        if (!(this.f19804q == null || this.f19804q.f17768a == null)) {
            try {
                this.f19804q.f17768a.mo12168c();
            } catch (Exception unused) {
            }
        }
        if (!(this.f19804q == null || this.f19804q.f17769b == null)) {
            try {
                this.f19804q.f17769b.destroy();
            } catch (Exception unused2) {
            }
        }
        this.f19804q = this.f19788a.mo20760a((Context) this, false);
    }

    public void adLoaded(String str) {
        this.f19812y.cancel();
        this.f19806s.showAd();
    }

    public void onAdClosed() {
        if (this.f19809v) {
            abrir_secc(this.f19811x);
        }
    }

    public void adError(String str) {
        this.f19812y.cancel();
        abrir_secc(this.f19811x);
    }

    public void videoEnded() {
        this.f19809v = true;
        config.m23867t(this);
    }

    /* renamed from: z_ */
    public void mo9678z_() {
        this.f19812y.cancel();
        this.f19805r.mo12836a();
    }

    /* renamed from: a */
    public void mo9675a(C3165a aVar) {
        this.f19809v = true;
        config.m23867t(this);
    }

    /* renamed from: A_ */
    public void mo9671A_() {
        if (this.f19809v) {
            abrir_secc(this.f19811x);
        }
    }

    /* renamed from: e */
    public void mo9676e() {
        this.f19809v = false;
    }

    /* renamed from: a */
    public void mo9674a(int i) {
        if (!this.f19788a.mo20775a((Context) this, this.f19806s)) {
            this.f19812y.cancel();
            abrir_secc(this.f19811x);
        }
    }

    public void onError(C1514Ad ad, AdError adError) {
        this.f19812y.cancel();
        abrir_secc(this.f19811x);
    }

    public void onAdLoaded(C1514Ad ad) {
        this.f19812y.cancel();
        this.f19807t.show();
    }

    public void onRewardedVideoCompleted() {
        this.f19809v = true;
        config.m23867t(this);
    }

    public void onRewardedVideoClosed() {
        if (this.f19809v) {
            abrir_secc(this.f19811x);
        }
    }

    public void onVideoCompleted() {
        this.f19809v = true;
        config.m23867t(this);
    }

    public void onReceiveAd(C5286Ad ad) {
        this.f19812y.cancel();
        this.f19808u.showAd("REWARDED VIDEO", new AdDisplayListener() {
            public void adClicked(C5286Ad ad) {
            }

            public void adDisplayed(C5286Ad ad) {
            }

            public void adNotDisplayed(C5286Ad ad) {
            }

            public void adHidden(C5286Ad ad) {
                if (fotogal.this.f19809v) {
                    fotogal.this.abrir_secc(fotogal.this.f19811x);
                }
            }
        });
    }

    public void onFailedToReceiveAd(C5286Ad ad) {
        this.f19812y.cancel();
        abrir_secc(this.f19811x);
    }
}
