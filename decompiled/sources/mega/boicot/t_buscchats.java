package mega.boicot;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.ProgressDialog;
import android.app.SearchManager;
import android.app.SearchManager.OnCancelListener;
import android.app.SearchManager.OnDismissListener;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.Color;
import android.graphics.Point;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.GradientDrawable.Orientation;
import android.os.AsyncTask;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.Display;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
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
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Locale;

public class t_buscchats extends Activity implements OnClickListener, OnAdClosed, OnAdError, OnAdLoaded, OnVideoEnded, RewardedVideoAdListener, C3167c, VideoListener, AdEventListener, C5599a {

    /* renamed from: A */
    GridView f18587A;

    /* renamed from: B */
    ListView f18588B;

    /* renamed from: C */
    SharedPreferences f18589C;

    /* renamed from: a */
    int f18590a;

    /* renamed from: b */
    int f18591b;

    /* renamed from: c */
    int f18592c;

    /* renamed from: d */
    int f18593d;

    /* renamed from: e */
    config f18594e;

    /* renamed from: f */
    String f18595f;

    /* renamed from: g */
    boolean f18596g = false;

    /* renamed from: h */
    boolean f18597h = false;

    /* renamed from: i */
    boolean f18598i;

    /* renamed from: j */
    boolean f18599j;

    /* renamed from: k */
    Bundle f18600k;

    /* renamed from: l */
    C5602c f18601l;

    /* renamed from: m */
    C3166b f18602m;

    /* renamed from: n */
    RewardedVideo f18603n;

    /* renamed from: o */
    RewardedVideoAd f18604o;

    /* renamed from: p */
    StartAppAd f18605p;

    /* renamed from: q */
    boolean f18606q = false;

    /* renamed from: r */
    boolean f18607r = false;

    /* renamed from: s */
    View f18608s;

    /* renamed from: t */
    ProgressDialog f18609t;

    /* renamed from: u */
    int f18610u;

    /* renamed from: v */
    int f18611v;

    /* renamed from: w */
    int f18612w;

    /* renamed from: x */
    int f18613x;

    /* renamed from: y */
    int f18614y = 1;

    /* renamed from: z */
    int f18615z;

    /* renamed from: mega.boicot.t_buscchats$a */
    public class C5752a extends BaseAdapter {

        /* renamed from: b */
        private Context f18623b;

        /* renamed from: c */
        private int[] f18624c = {R.drawable.bg_1, R.drawable.bg_2, R.drawable.bg_3, R.drawable.bg_4, R.drawable.bg_5, R.drawable.bg_6, R.drawable.bg_7, R.drawable.bg_8, R.drawable.bg_9, R.drawable.bg_10, R.drawable.bg_11, R.drawable.bg_12, R.drawable.bg_13, R.drawable.bg_14, R.drawable.bg_1, R.drawable.bg_2, R.drawable.bg_3, R.drawable.bg_4, R.drawable.bg_5, R.drawable.bg_6, R.drawable.bg_7, R.drawable.bg_8, R.drawable.bg_9, R.drawable.bg_10, R.drawable.bg_11, R.drawable.bg_12, R.drawable.bg_13, R.drawable.bg_14, R.drawable.bg_1, R.drawable.bg_2, R.drawable.bg_3, R.drawable.bg_4};

        public Object getItem(int i) {
            return null;
        }

        public long getItemId(int i) {
            return 0;
        }

        public C5752a(Context context) {
            this.f18623b = context;
        }

        public int getCount() {
            if (t_buscchats.this.f18615z == 0) {
                return t_buscchats.this.getResources().getStringArray(R.array.cats_menu_a).length;
            }
            return t_buscchats.this.getResources().getStringArray(t_buscchats.this.f18592c).length;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            TextView textView;
            if (view == null) {
                textView = new TextView(this.f18623b);
                textView.setSingleLine(true);
                textView.setHeight(t_buscchats.this.f18610u);
                textView.setBackgroundResource(this.f18624c[i]);
                textView.setTextColor(-1);
                textView.setPadding(t_buscchats.this.f18611v, 0, t_buscchats.this.f18611v, 0);
                textView.setGravity(16);
                if (VERSION.SDK_INT >= 17 && t_buscchats.this.getResources().getBoolean(R.bool.es_rtl)) {
                    textView.setTextDirection(4);
                }
            } else {
                textView = (TextView) view;
            }
            if (t_buscchats.this.f18615z == 0) {
                textView.setText(t_buscchats.this.getResources().getStringArray(R.array.cats_menu_a)[i].toUpperCase(Locale.getDefault()));
            } else {
                textView.setText(t_buscchats.this.getResources().getStringArray(t_buscchats.this.f18592c)[i].toUpperCase(Locale.getDefault()));
            }
            return textView;
        }
    }

    /* renamed from: mega.boicot.t_buscchats$b */
    private class C5753b extends AsyncTask<String, Void, String> {
        private C5753b() {
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x009b  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.String doInBackground(java.lang.String... r6) {
            /*
                r5 = this;
                r6 = 0
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0097 }
                r0.<init>()     // Catch:{ Exception -> 0x0097 }
                java.lang.String r1 = "http://"
                r0.append(r1)     // Catch:{ Exception -> 0x0097 }
                java.lang.String r1 = mega.boicot.config.f17839g     // Catch:{ Exception -> 0x0097 }
                r0.append(r1)     // Catch:{ Exception -> 0x0097 }
                java.lang.String r1 = "/srv/chats_home.php?idusu="
                r0.append(r1)     // Catch:{ Exception -> 0x0097 }
                mega.boicot.t_buscchats r1 = mega.boicot.t_buscchats.this     // Catch:{ Exception -> 0x0097 }
                int r1 = r1.f18590a     // Catch:{ Exception -> 0x0097 }
                r0.append(r1)     // Catch:{ Exception -> 0x0097 }
                java.lang.String r1 = "&idcat="
                r0.append(r1)     // Catch:{ Exception -> 0x0097 }
                mega.boicot.t_buscchats r1 = mega.boicot.t_buscchats.this     // Catch:{ Exception -> 0x0097 }
                int r1 = r1.f18615z     // Catch:{ Exception -> 0x0097 }
                r0.append(r1)     // Catch:{ Exception -> 0x0097 }
                java.lang.String r1 = "&chats="
                r0.append(r1)     // Catch:{ Exception -> 0x0097 }
                mega.boicot.t_buscchats r1 = mega.boicot.t_buscchats.this     // Catch:{ Exception -> 0x0097 }
                boolean r1 = r1.f18598i     // Catch:{ Exception -> 0x0097 }
                r0.append(r1)     // Catch:{ Exception -> 0x0097 }
                java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0097 }
                java.net.URL r1 = new java.net.URL     // Catch:{ Exception -> 0x0097 }
                r1.<init>(r0)     // Catch:{ Exception -> 0x0097 }
                java.net.URLConnection r0 = r1.openConnection()     // Catch:{ Exception -> 0x0097 }
                java.net.HttpURLConnection r0 = (java.net.HttpURLConnection) r0     // Catch:{ Exception -> 0x0097 }
                r6 = 1
                r0.setDoInput(r6)     // Catch:{ Exception -> 0x0093, all -> 0x008e }
                r6 = 10000(0x2710, float:1.4013E-41)
                r0.setConnectTimeout(r6)     // Catch:{ Exception -> 0x0093, all -> 0x008e }
                r0.setReadTimeout(r6)     // Catch:{ Exception -> 0x0093, all -> 0x008e }
                java.lang.String r6 = "User-Agent"
                java.lang.String r1 = "Android Vinebre Software"
                r0.setRequestProperty(r6, r1)     // Catch:{ Exception -> 0x0093, all -> 0x008e }
                java.io.InputStream r6 = r0.getInputStream()     // Catch:{ Exception -> 0x0093, all -> 0x008e }
                java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch:{ Exception -> 0x0093, all -> 0x008e }
                java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x0093, all -> 0x008e }
                r2.<init>(r6)     // Catch:{ Exception -> 0x0093, all -> 0x008e }
                r1.<init>(r2)     // Catch:{ Exception -> 0x0093, all -> 0x008e }
                java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0093, all -> 0x008e }
                r6.<init>()     // Catch:{ Exception -> 0x0093, all -> 0x008e }
            L_0x0069:
                java.lang.String r2 = r1.readLine()     // Catch:{ Exception -> 0x0093, all -> 0x008e }
                if (r2 == 0) goto L_0x0084
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0093, all -> 0x008e }
                r3.<init>()     // Catch:{ Exception -> 0x0093, all -> 0x008e }
                r3.append(r2)     // Catch:{ Exception -> 0x0093, all -> 0x008e }
                java.lang.String r2 = "\n"
                r3.append(r2)     // Catch:{ Exception -> 0x0093, all -> 0x008e }
                java.lang.String r2 = r3.toString()     // Catch:{ Exception -> 0x0093, all -> 0x008e }
                r6.append(r2)     // Catch:{ Exception -> 0x0093, all -> 0x008e }
                goto L_0x0069
            L_0x0084:
                java.lang.String r6 = r6.toString()     // Catch:{ Exception -> 0x0093, all -> 0x008e }
                if (r0 == 0) goto L_0x008d
                r0.disconnect()
            L_0x008d:
                return r6
            L_0x008e:
                r6 = move-exception
                r4 = r0
                r0 = r6
                r6 = r4
                goto L_0x009f
            L_0x0093:
                r6 = r0
                goto L_0x0097
            L_0x0095:
                r0 = move-exception
                goto L_0x009f
            L_0x0097:
                java.lang.String r0 = "ANDROID:KO"
                if (r6 == 0) goto L_0x009e
                r6.disconnect()
            L_0x009e:
                return r0
            L_0x009f:
                if (r6 == 0) goto L_0x00a4
                r6.disconnect()
            L_0x00a4:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: mega.boicot.t_buscchats.C5753b.doInBackground(java.lang.String[]):java.lang.String");
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x0219  */
        /* JADX WARNING: Removed duplicated region for block: B:50:0x027d A[SYNTHETIC] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onPostExecute(java.lang.String r31) {
            /*
                r30 = this;
                r0 = r30
                r1 = r31
                java.lang.String r2 = "ANDROID:OK RESULT:"
                int r2 = r1.indexOf(r2)
                r3 = -1
                if (r2 != r3) goto L_0x0015
                java.lang.String r2 = "ANDROID:KO"
                int r2 = r1.indexOf(r2)
                if (r2 == r3) goto L_0x031c
            L_0x0015:
                java.lang.String r2 = "ANDROID:OK RESULT:"
                int r2 = r1.indexOf(r2)
                if (r2 == r3) goto L_0x031c
                mega.boicot.t_buscchats r4 = mega.boicot.t_buscchats.this
                android.content.SharedPreferences r4 = r4.f18589C
                android.content.SharedPreferences$Editor r4 = r4.edit()
                java.lang.String r5 = "@y@"
                int r2 = r1.indexOf(r5, r2)
                r5 = 0
                r6 = r5
                r7 = r6
            L_0x002e:
                r8 = 2
                if (r2 == r3) goto L_0x0285
                int r2 = r2 + 3
                java.lang.String r9 = ";"
                int r9 = r1.indexOf(r9, r2)
                java.lang.String r2 = r1.substring(r2, r9)
                int r2 = java.lang.Integer.parseInt(r2)
                r10 = 1
                int r9 = r9 + r10
                java.lang.String r11 = ";"
                int r11 = r1.indexOf(r11, r9)
                java.lang.String r9 = r1.substring(r9, r11)
                int r16 = java.lang.Integer.parseInt(r9)
                int r11 = r11 + r10
                java.lang.String r9 = ";"
                int r9 = r1.indexOf(r9, r11)
                java.lang.String r11 = r1.substring(r11, r9)
                int r14 = java.lang.Integer.parseInt(r11)
                int r9 = r9 + r10
                java.lang.String r11 = ";"
                int r11 = r1.indexOf(r11, r9)
                java.lang.String r9 = r1.substring(r9, r11)
                int r15 = java.lang.Integer.parseInt(r9)
                int r11 = r11 + r10
                java.lang.String r9 = ";"
                int r9 = r1.indexOf(r9, r11)
                java.lang.String r11 = r1.substring(r11, r9)
                int r17 = java.lang.Integer.parseInt(r11)
                int r9 = r9 + r10
                java.lang.String r11 = ";"
                int r11 = r1.indexOf(r11, r9)
                java.lang.String r9 = r1.substring(r9, r11)
                int r22 = java.lang.Integer.parseInt(r9)
                int r11 = r11 + r10
                java.lang.String r9 = ";"
                int r9 = r1.indexOf(r9, r11)
                int r9 = r9 + r10
                java.lang.String r11 = ";"
                int r11 = r1.indexOf(r11, r9)
                java.lang.String r9 = r1.substring(r9, r11)
                int r25 = java.lang.Integer.parseInt(r9)
                int r11 = r11 + r10
                java.lang.String r9 = ";"
                int r9 = r1.indexOf(r9, r11)
                java.lang.String r11 = r1.substring(r11, r9)
                int r9 = r9 + r10
                java.lang.String r12 = ";"
                int r12 = r1.indexOf(r12, r9)
                java.lang.String r27 = r1.substring(r9, r12)
                int r12 = r12 + r10
                java.lang.String r9 = ";"
                int r9 = r1.indexOf(r9, r12)
                java.lang.String r28 = r1.substring(r12, r9)
                int r9 = r9 + r10
                java.lang.String r12 = ";"
                int r12 = r1.indexOf(r12, r9)
                java.lang.String r9 = r1.substring(r9, r12)
                int r9 = java.lang.Integer.parseInt(r9)
                int r12 = r12 + r10
                java.lang.String r13 = ";"
                int r13 = r1.indexOf(r13, r12)
                java.lang.String r12 = r1.substring(r12, r13)
                int r23 = java.lang.Integer.parseInt(r12)
                int r13 = r13 + r10
                java.lang.String r12 = ";"
                int r12 = r1.indexOf(r12, r13)
                java.lang.String r13 = r1.substring(r13, r12)
                int r18 = java.lang.Integer.parseInt(r13)
                int r12 = r12 + r10
                java.lang.String r13 = ";"
                int r13 = r1.indexOf(r13, r12)
                java.lang.String r12 = r1.substring(r12, r13)
                int r19 = java.lang.Integer.parseInt(r12)
                int r13 = r13 + r10
                java.lang.String r12 = ";"
                int r12 = r1.indexOf(r12, r13)
                java.lang.String r13 = r1.substring(r13, r12)
                int r20 = java.lang.Integer.parseInt(r13)
                int r12 = r12 + r10
                java.lang.String r13 = ";"
                int r13 = r1.indexOf(r13, r12)
                java.lang.String r12 = r1.substring(r12, r13)
                int r24 = java.lang.Integer.parseInt(r12)
                int r13 = r13 + r10
                java.lang.String r12 = ";"
                int r12 = r1.indexOf(r12, r13)
                java.lang.String r13 = r1.substring(r13, r12)
                int r21 = java.lang.Integer.parseInt(r13)
                if (r2 != r10) goto L_0x0157
                mega.boicot.t_buscchats r2 = mega.boicot.t_buscchats.this
                r6 = 2131231536(0x7f080330, float:1.8079156E38)
                android.view.View r2 = r2.findViewById(r6)
                android.widget.TextView r2 = (android.widget.TextView) r2
                mega.boicot.t_buscchats r6 = mega.boicot.t_buscchats.this
                r7 = 2131231340(0x7f08026c, float:1.8078758E38)
                android.view.View r6 = r6.findViewById(r7)
                android.widget.TextView r6 = (android.widget.TextView) r6
                mega.boicot.t_buscchats r7 = mega.boicot.t_buscchats.this
                r13 = 2131230869(0x7f080095, float:1.8077803E38)
                r10 = r12
                r12 = r7
                r26 = r11
                r29 = r9
                r12.m24031a(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            L_0x0153:
                r7 = r6
                r6 = r2
                goto L_0x0217
            L_0x0157:
                r10 = r12
                if (r2 != r8) goto L_0x017d
                mega.boicot.t_buscchats r2 = mega.boicot.t_buscchats.this
                r6 = 2131231537(0x7f080331, float:1.8079158E38)
                android.view.View r2 = r2.findViewById(r6)
                android.widget.TextView r2 = (android.widget.TextView) r2
                mega.boicot.t_buscchats r6 = mega.boicot.t_buscchats.this
                r7 = 2131231341(0x7f08026d, float:1.807876E38)
                android.view.View r6 = r6.findViewById(r7)
                android.widget.TextView r6 = (android.widget.TextView) r6
                mega.boicot.t_buscchats r12 = mega.boicot.t_buscchats.this
                r13 = 2131230870(0x7f080096, float:1.8077805E38)
                r26 = r11
                r29 = r9
                r12.m24031a(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
                goto L_0x0153
            L_0x017d:
                r8 = 3
                if (r2 != r8) goto L_0x01a3
                mega.boicot.t_buscchats r2 = mega.boicot.t_buscchats.this
                r6 = 2131231538(0x7f080332, float:1.807916E38)
                android.view.View r2 = r2.findViewById(r6)
                android.widget.TextView r2 = (android.widget.TextView) r2
                mega.boicot.t_buscchats r6 = mega.boicot.t_buscchats.this
                r7 = 2131231342(0x7f08026e, float:1.8078762E38)
                android.view.View r6 = r6.findViewById(r7)
                android.widget.TextView r6 = (android.widget.TextView) r6
                mega.boicot.t_buscchats r12 = mega.boicot.t_buscchats.this
                r13 = 2131230871(0x7f080097, float:1.8077807E38)
                r26 = r11
                r29 = r9
                r12.m24031a(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
                goto L_0x0153
            L_0x01a3:
                r8 = 4
                if (r2 != r8) goto L_0x01c9
                mega.boicot.t_buscchats r2 = mega.boicot.t_buscchats.this
                r6 = 2131231539(0x7f080333, float:1.8079162E38)
                android.view.View r2 = r2.findViewById(r6)
                android.widget.TextView r2 = (android.widget.TextView) r2
                mega.boicot.t_buscchats r6 = mega.boicot.t_buscchats.this
                r7 = 2131231343(0x7f08026f, float:1.8078764E38)
                android.view.View r6 = r6.findViewById(r7)
                android.widget.TextView r6 = (android.widget.TextView) r6
                mega.boicot.t_buscchats r12 = mega.boicot.t_buscchats.this
                r13 = 2131230872(0x7f080098, float:1.807781E38)
                r26 = r11
                r29 = r9
                r12.m24031a(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
                goto L_0x0153
            L_0x01c9:
                r8 = 5
                if (r2 != r8) goto L_0x01f0
                mega.boicot.t_buscchats r2 = mega.boicot.t_buscchats.this
                r6 = 2131231540(0x7f080334, float:1.8079164E38)
                android.view.View r2 = r2.findViewById(r6)
                android.widget.TextView r2 = (android.widget.TextView) r2
                mega.boicot.t_buscchats r6 = mega.boicot.t_buscchats.this
                r7 = 2131231344(0x7f080270, float:1.8078766E38)
                android.view.View r6 = r6.findViewById(r7)
                android.widget.TextView r6 = (android.widget.TextView) r6
                mega.boicot.t_buscchats r12 = mega.boicot.t_buscchats.this
                r13 = 2131230873(0x7f080099, float:1.8077811E38)
                r26 = r11
                r29 = r9
                r12.m24031a(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
                goto L_0x0153
            L_0x01f0:
                r8 = 6
                if (r2 != r8) goto L_0x0217
                mega.boicot.t_buscchats r2 = mega.boicot.t_buscchats.this
                r6 = 2131231541(0x7f080335, float:1.8079166E38)
                android.view.View r2 = r2.findViewById(r6)
                android.widget.TextView r2 = (android.widget.TextView) r2
                mega.boicot.t_buscchats r6 = mega.boicot.t_buscchats.this
                r7 = 2131231345(0x7f080271, float:1.8078768E38)
                android.view.View r6 = r6.findViewById(r7)
                android.widget.TextView r6 = (android.widget.TextView) r6
                mega.boicot.t_buscchats r12 = mega.boicot.t_buscchats.this
                r13 = 2131230874(0x7f08009a, float:1.8077813E38)
                r26 = r11
                r29 = r9
                r12.m24031a(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
                goto L_0x0153
            L_0x0217:
                if (r6 == 0) goto L_0x027d
                int r2 = mega.boicot.config.f17813a
                r6.setTextColor(r2)
                int r2 = mega.boicot.config.f17814b
                r7.setTextColor(r2)
                r2 = 99999(0x1869f, float:1.40128E-40)
                int r2 = java.lang.Math.min(r9, r2)
                r6.setText(r11)
                r8 = 10
                r9 = 2131558748(0x7f0d015c, float:1.874282E38)
                if (r2 >= r8) goto L_0x0253
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r8 = "<10 "
                r2.append(r8)
                mega.boicot.t_buscchats r8 = mega.boicot.t_buscchats.this
                android.content.res.Resources r8 = r8.getResources()
                java.lang.String r8 = r8.getString(r9)
                r2.append(r8)
                java.lang.String r2 = r2.toString()
                r7.setText(r2)
                goto L_0x027d
            L_0x0253:
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                java.text.NumberFormat r11 = java.text.NumberFormat.getInstance()
                long r12 = (long) r2
                java.lang.String r2 = r11.format(r12)
                r8.append(r2)
                java.lang.String r2 = " "
                r8.append(r2)
                mega.boicot.t_buscchats r2 = mega.boicot.t_buscchats.this
                android.content.res.Resources r2 = r2.getResources()
                java.lang.String r2 = r2.getString(r9)
                r8.append(r2)
                java.lang.String r2 = r8.toString()
                r7.setText(r2)
            L_0x027d:
                java.lang.String r2 = "@y@"
                int r2 = r1.indexOf(r2, r10)
                goto L_0x002e
            L_0x0285:
                r4.commit()
                mega.boicot.t_buscchats r2 = mega.boicot.t_buscchats.this
                r2.mo21010g()
                java.lang.String r2 = "@z@"
                int r2 = r1.indexOf(r2)
                r4 = 0
                if (r2 == r3) goto L_0x0310
                int r2 = r2 + r8
                java.lang.String r1 = r1.substring(r2)
                mega.boicot.t_buscchats r2 = mega.boicot.t_buscchats.this
                int r2 = r2.f18615z
                if (r2 != 0) goto L_0x02af
                mega.boicot.t_buscchats r2 = mega.boicot.t_buscchats.this
                android.content.res.Resources r2 = r2.getResources()
                r6 = 2130837536(0x7f020020, float:1.7280029E38)
                java.lang.String[] r2 = r2.getStringArray(r6)
                goto L_0x02bd
            L_0x02af:
                mega.boicot.t_buscchats r2 = mega.boicot.t_buscchats.this
                android.content.res.Resources r2 = r2.getResources()
                mega.boicot.t_buscchats r6 = mega.boicot.t_buscchats.this
                int r6 = r6.f18593d
                java.lang.String[] r2 = r2.getStringArray(r6)
            L_0x02bd:
                r6 = r4
            L_0x02be:
                int r7 = r2.length
                if (r6 >= r7) goto L_0x0310
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                java.lang.String r8 = "@"
                r7.append(r8)
                r8 = r2[r6]
                r7.append(r8)
                java.lang.String r8 = "@"
                r7.append(r8)
                java.lang.String r7 = r7.toString()
                int r7 = r1.indexOf(r7)
                if (r7 != r3) goto L_0x030d
                mega.boicot.t_buscchats r7 = mega.boicot.t_buscchats.this
                android.widget.GridView r7 = r7.f18587A
                android.view.View r7 = r7.getChildAt(r6)
                r8 = -3355444(0xffffffffffcccccc, float:NaN)
                r7.setBackgroundColor(r8)
                mega.boicot.t_buscchats r7 = mega.boicot.t_buscchats.this
                android.widget.GridView r7 = r7.f18587A
                android.view.View r7 = r7.getChildAt(r6)
                android.widget.TextView r7 = (android.widget.TextView) r7
                r8 = -12303292(0xffffffffff444444, float:-2.6088314E38)
                r7.setTextColor(r8)
                mega.boicot.t_buscchats r7 = mega.boicot.t_buscchats.this
                android.widget.GridView r7 = r7.f18587A
                android.view.View r7 = r7.getChildAt(r6)
                mega.boicot.t_buscchats$b$1 r8 = new mega.boicot.t_buscchats$b$1
                r8.<init>()
                r7.setOnClickListener(r8)
            L_0x030d:
                int r6 = r6 + 1
                goto L_0x02be
            L_0x0310:
                mega.boicot.t_buscchats$c r1 = new mega.boicot.t_buscchats$c
                mega.boicot.t_buscchats r2 = mega.boicot.t_buscchats.this
                r1.<init>()
                java.lang.String[] r2 = new java.lang.String[r4]
                r1.execute(r2)
            L_0x031c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: mega.boicot.t_buscchats.C5753b.onPostExecute(java.lang.String):void");
        }
    }

    /* renamed from: mega.boicot.t_buscchats$c */
    private class C5757c extends AsyncTask<String, Void, String> {

        /* renamed from: a */
        int f18630a;

        /* renamed from: b */
        Bitmap f18631b;

        /* renamed from: c */
        ImageView f18632c;

        private C5757c() {
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
            View view = null;
            do {
                if (t_buscchats.this.f18614y == 1) {
                    view = t_buscchats.this.findViewById(R.id.card_view_1);
                    this.f18632c = (ImageView) t_buscchats.this.findViewById(R.id.iv_chat_1);
                } else if (t_buscchats.this.f18614y == 2) {
                    view = t_buscchats.this.findViewById(R.id.card_view_2);
                    this.f18632c = (ImageView) t_buscchats.this.findViewById(R.id.iv_chat_2);
                } else if (t_buscchats.this.f18614y == 3) {
                    view = t_buscchats.this.findViewById(R.id.card_view_3);
                    this.f18632c = (ImageView) t_buscchats.this.findViewById(R.id.iv_chat_3);
                } else if (t_buscchats.this.f18614y == 4) {
                    view = t_buscchats.this.findViewById(R.id.card_view_4);
                    this.f18632c = (ImageView) t_buscchats.this.findViewById(R.id.iv_chat_4);
                } else if (t_buscchats.this.f18614y == 5) {
                    view = t_buscchats.this.findViewById(R.id.card_view_5);
                    this.f18632c = (ImageView) t_buscchats.this.findViewById(R.id.iv_chat_5);
                } else if (t_buscchats.this.f18614y == 6) {
                    view = t_buscchats.this.findViewById(R.id.card_view_6);
                    this.f18632c = (ImageView) t_buscchats.this.findViewById(R.id.iv_chat_6);
                }
                t_buscchats.this.f18614y++;
                if (view.getTag() != null) {
                    break;
                }
            } while (t_buscchats.this.f18614y < 7);
            if (view.getTag() == null) {
                cancel(true);
                return;
            }
            t_buscchats.this.f18614y--;
            StringBuilder sb = new StringBuilder();
            sb.append(view.getTag(R.id.tag_idapp));
            sb.append("");
            this.f18630a = Integer.parseInt(sb.toString());
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public String doInBackground(String... strArr) {
            try {
                StringBuilder sb = new StringBuilder();
                sb.append("http://imgs1.e-droid.net/srv/imgs/gen/");
                sb.append(this.f18630a);
                sb.append("_ico.png");
                URL url = new URL(sb.toString());
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
                int round = Math.round(TypedValue.applyDimension(1, 200.0f, t_buscchats.this.getResources().getDisplayMetrics()));
                options.inSampleSize = config.m23826a(options, round, round);
                HttpURLConnection httpURLConnection2 = (HttpURLConnection) url.openConnection();
                httpURLConnection2.setDoInput(true);
                httpURLConnection2.setConnectTimeout(5000);
                httpURLConnection2.setReadTimeout(7000);
                httpURLConnection2.connect();
                InputStream inputStream2 = httpURLConnection2.getInputStream();
                options.inJustDecodeBounds = false;
                this.f18631b = BitmapFactory.decodeStream(inputStream2, null, options);
                inputStream2.close();
                return "ANDROID:OK";
            } catch (Exception e) {
                e.printStackTrace();
                return "ANDROID:KO";
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void onPostExecute(String str) {
            if (str.indexOf("ANDROID:OK") != -1) {
                this.f18632c.setImageBitmap(this.f18631b);
            }
            if (t_buscchats.this.f18614y < 6) {
                t_buscchats.this.f18614y++;
                new C5757c().execute(new String[0]);
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
        this.f18594e = (config) getApplicationContext();
        if (this.f18594e.f17881aN == null) {
            this.f18594e.mo20780b();
        }
        this.f18600k = getIntent().getExtras();
        if (bundle == null) {
            this.f18599j = this.f18600k != null && this.f18600k.containsKey("es_root") && this.f18600k.getBoolean("es_root", false);
        } else {
            this.f18599j = bundle.containsKey("es_root") && bundle.getBoolean("es_root", false);
        }
        this.f18591b = this.f18600k.getInt("ind");
        this.f18615z = this.f18600k.getInt("idcat", 0);
        this.f18595f = config.m23831a(this.f18594e.f17971bz[this.f18591b].f18314g, this.f18594e.f17890aW);
        if (VERSION.SDK_INT > 12) {
            StringBuilder sb = new StringBuilder();
            sb.append("#");
            sb.append(this.f18594e.f17971bz[this.f18591b].f18314g);
            if (!config.m23844a(sb.toString())) {
                setTheme(R.style.holonolight);
            }
        }
        super.onCreate(bundle);
        setContentView(R.layout.t_buscchats);
        mo21009f();
        if (this.f18594e.f18080q > 0) {
            SearchManager searchManager = (SearchManager) getSystemService("search");
            searchManager.setOnCancelListener(new OnCancelListener() {
                public void onCancel() {
                    t_buscchats.this.f18596g = false;
                    t_buscchats.this.setResult(0);
                }
            });
            searchManager.setOnDismissListener(new OnDismissListener() {
                public void onDismiss() {
                    t_buscchats.this.f18607r = false;
                }
            });
        }
        this.f18594e.mo20770a((Context) this, this.f18600k != null && this.f18600k.containsKey("ad_entrar"), this.f18600k != null && this.f18600k.containsKey("fb_entrar"));
        this.f18601l = this.f18594e.mo20760a((Context) this, false);
        if (this.f18615z == 0) {
            this.f18594e.mo20767a((Context) this, this.f18594e.f18075l, this.f18595f, bundle);
        }
        int i = config.f17813a;
        int i2 = -1;
        if (!this.f18594e.f17971bz[this.f18591b].f18314g.equals("")) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("#");
            sb2.append(this.f18594e.f17971bz[this.f18591b].f18314g);
            if (!config.m23844a(sb2.toString())) {
                findViewById(R.id.ll_cabe).setBackgroundColor(config.f17834e);
                ((TextView) findViewById(R.id.tv_cabe)).setTextColor(config.f17813a);
                i = -1;
            } else {
                findViewById(R.id.ll_cabe).setBackgroundColor(config.f17838f);
                ((TextView) findViewById(R.id.tv_cabe)).setTextColor(-1);
            }
            Orientation orientation = Orientation.TOP_BOTTOM;
            StringBuilder sb3 = new StringBuilder();
            sb3.append("#");
            sb3.append(this.f18594e.f17971bz[this.f18591b].f18314g);
            StringBuilder sb4 = new StringBuilder();
            sb4.append("#");
            sb4.append(this.f18594e.f17971bz[this.f18591b].f18315h);
            findViewById(R.id.ll_princ).setBackgroundDrawable(new GradientDrawable(orientation, new int[]{Color.parseColor(sb3.toString()), Color.parseColor(sb4.toString())}));
        }
        this.f18589C = getSharedPreferences("sh", 0);
        this.f18590a = this.f18589C.getInt("idusu", 0);
        ((TextView) findViewById(R.id.tv_cats)).setTextColor(i);
        ((TextView) findViewById(R.id.tv_nuevos)).setTextColor(i);
        ((TextView) findViewById(R.id.tv_populares)).setTextColor(i);
        TextView textView = (TextView) findViewById(R.id.tv_fav);
        StringBuilder sb5 = new StringBuilder();
        sb5.append("#");
        sb5.append(this.f18594e.f17890aW);
        textView.setBackgroundColor(Color.parseColor(sb5.toString()));
        TextView textView2 = (TextView) findViewById(R.id.tv_mas_nuevos);
        StringBuilder sb6 = new StringBuilder();
        sb6.append("#");
        sb6.append(this.f18594e.f17890aW);
        textView2.setBackgroundColor(Color.parseColor(sb6.toString()));
        TextView textView3 = (TextView) findViewById(R.id.tv_mas_pop);
        StringBuilder sb7 = new StringBuilder();
        sb7.append("#");
        sb7.append(this.f18594e.f17890aW);
        textView3.setBackgroundColor(Color.parseColor(sb7.toString()));
        StringBuilder sb8 = new StringBuilder();
        sb8.append("#");
        sb8.append(this.f18594e.f17890aW);
        if (config.m23844a(sb8.toString())) {
            i2 = config.f17813a;
        }
        ((TextView) findViewById(R.id.tv_fav)).setTextColor(i2);
        ((TextView) findViewById(R.id.tv_mas_nuevos)).setTextColor(i2);
        ((TextView) findViewById(R.id.tv_mas_pop)).setTextColor(i2);
        if (this.f18600k != null && this.f18600k.containsKey("tit_cab")) {
            ((TextView) findViewById(R.id.tv_cabe)).setText(this.f18600k.getString("tit_cab"));
            findViewById(R.id.tv_cabe).setOnClickListener(new OnClickListener() {
                public void onClick(View view) {
                    t_buscchats.this.finish();
                }
            });
            findViewById(R.id.iv_cabe).setOnClickListener(new OnClickListener() {
                public void onClick(View view) {
                    t_buscchats.this.finish();
                }
            });
            findViewById(R.id.ll_cabe).setVisibility(0);
        }
        this.f18598i = true;
        if (this.f18615z > 0) {
            if (this.f18615z == 1) {
                this.f18592c = R.array.cats_1_a;
                this.f18593d = R.array.idcats_1_a;
            } else if (this.f18615z == 2) {
                this.f18592c = R.array.cats_2_a;
                this.f18593d = R.array.idcats_2_a;
            } else if (this.f18615z == 3) {
                this.f18592c = R.array.cats_3_a;
                this.f18593d = R.array.idcats_3_a;
            } else if (this.f18615z == 4) {
                this.f18592c = R.array.cats_4_a;
                this.f18593d = R.array.idcats_4_a;
            } else if (this.f18615z == 5) {
                this.f18592c = R.array.cats_5_a;
                this.f18593d = R.array.idcats_5_a;
            } else if (this.f18615z == 6) {
                this.f18592c = R.array.cats_6_a;
                this.f18593d = R.array.idcats_6_a;
            } else if (this.f18615z == 7) {
                this.f18592c = R.array.cats_7_a;
                this.f18593d = R.array.idcats_7_a;
            } else if (this.f18615z == 9) {
                this.f18592c = R.array.cats_9_a;
                this.f18593d = R.array.idcats_9_a;
            } else if (this.f18615z == 10) {
                this.f18592c = R.array.cats_10_a;
                this.f18593d = R.array.idcats_10_a;
            } else if (this.f18615z == 11) {
                this.f18592c = R.array.cats_11_a;
                this.f18593d = R.array.idcats_11_a;
            } else if (this.f18615z == 12) {
                this.f18592c = R.array.cats_12_a;
                this.f18593d = R.array.idcats_12_a;
            } else if (this.f18615z == 13) {
                this.f18592c = R.array.cats_13_a;
                this.f18593d = R.array.idcats_13_a;
            } else if (this.f18615z == 14) {
                this.f18592c = R.array.cats_14_a;
                this.f18593d = R.array.idcats_14_a;
            } else if (this.f18615z == 15) {
                this.f18592c = R.array.cats_15_a;
                this.f18593d = R.array.idcats_15_a;
            }
            if (this.f18594e.f17971bz[this.f18591b].f18259aC == 0) {
                this.f18598i = false;
                findViewById(R.id.rl_chats_fila1).setVisibility(8);
                findViewById(R.id.ll_chats_fila1).setVisibility(8);
                findViewById(R.id.rl_chats_fila2).setVisibility(8);
                findViewById(R.id.ll_chats_fila2).setVisibility(8);
            }
        }
        this.f18587A = (GridView) findViewById(R.id.gridview);
        this.f18587A.setAdapter(new C5752a(this));
        this.f18587A.setOnItemClickListener(new OnItemClickListener() {
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                Intent intent;
                if (t_buscchats.this.f18615z == 0) {
                    intent = new Intent(t_buscchats.this, t_buscchats.class);
                    intent.putExtra("idcat", Integer.parseInt(t_buscchats.this.getResources().getStringArray(R.array.idcats_menu_a)[i]));
                    intent.putExtra("tit_cab", t_buscchats.this.getResources().getStringArray(R.array.cats_menu_a)[i]);
                } else {
                    intent = new Intent(t_buscchats.this, t_buscchats_lista.class);
                    intent.putExtra("idcat", t_buscchats.this.f18615z);
                    intent.putExtra("idsubcat", Integer.parseInt(t_buscchats.this.getResources().getStringArray(t_buscchats.this.f18593d)[i]));
                    intent.putExtra("tit_cab", t_buscchats.this.getResources().getStringArray(t_buscchats.this.f18592c)[i]);
                }
                intent.putExtra("ind", t_buscchats.this.f18591b);
                t_buscchats.this.startActivityForResult(intent, 0);
            }
        });
        this.f18610u = (int) ((30.0f * getResources().getDisplayMetrics().density) + 0.5f);
        this.f18611v = (int) ((5.0f * getResources().getDisplayMetrics().density) + 0.5f);
        this.f18612w = mo21007a(149.0f, this);
        this.f18613x = mo21007a(10.0f, this);
        mo21011h();
        findViewById(R.id.tv_fav).setOnClickListener(this);
        findViewById(R.id.tv_mas_nuevos).setOnClickListener(this);
        findViewById(R.id.tv_mas_pop).setOnClickListener(this);
        new C5753b().execute(new String[0]);
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i2 == -1 && intent != null && intent.hasExtra("finalizar") && intent.getExtras().getBoolean("finalizar")) {
            if (!intent.getExtras().getBoolean("finalizar_app")) {
                this.f18599j = false;
            }
            setResult(-1, intent);
            finish();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public void mo21009f() {
        int b = this.f18594e.mo20778b((Context) this);
        if (this.f18594e.f18045dm == 1) {
            this.f18588B = (ListView) findViewById(R.id.left_drawer);
            this.f18594e.mo20771a(this.f18588B);
        } else if (this.f18594e.f18045dm == 0) {
            int i = 0;
            for (int i2 = 0; i2 < this.f18594e.f17971bz.length; i2++) {
                if (!this.f18594e.f17971bz[i2].f18333z) {
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
        for (int i3 = 0; i3 < this.f18594e.f17923bD.length; i3++) {
            if (this.f18594e.f17923bD[i3] > 0) {
                findViewById(this.f18594e.f17923bD[i3]).setOnClickListener(this);
            }
        }
    }

    public void onClick(View view) {
        boolean z = true;
        if (view.getId() == R.id.tv_fav) {
            Intent intent = new Intent(this, t_buscchats_lista.class);
            intent.putExtra("ind", this.f18591b);
            intent.putExtra("idcat", 0);
            intent.putExtra("tipo", 3);
            StringBuilder sb = new StringBuilder();
            sb.append(getResources().getString(R.string.favoritos).charAt(0));
            sb.append(getResources().getString(R.string.favoritos).substring(1).toLowerCase());
            intent.putExtra("tit_cab", sb.toString());
            startActivityForResult(intent, 0);
        } else if (view.getId() == R.id.tv_mas_nuevos) {
            Intent intent2 = new Intent(this, t_buscchats_lista.class);
            intent2.putExtra("ind", this.f18591b);
            intent2.putExtra("idcat", this.f18615z);
            intent2.putExtra("tipo", 1);
            intent2.putExtra("tit_cab", getResources().getString(R.string.chats_nuevos));
            startActivityForResult(intent2, 0);
        } else if (view.getId() == R.id.tv_mas_pop) {
            Intent intent3 = new Intent(this, t_buscchats_lista.class);
            intent3.putExtra("ind", this.f18591b);
            intent3.putExtra("idcat", this.f18615z);
            intent3.putExtra("tipo", 2);
            intent3.putExtra("tit_cab", getResources().getString(R.string.chats_maspopulares));
            startActivityForResult(intent3, 0);
        } else if (view.getId() == R.id.card_view_1 || view.getId() == R.id.card_view_2 || view.getId() == R.id.card_view_3 || view.getId() == R.id.card_view_4 || view.getId() == R.id.card_view_5 || view.getId() == R.id.card_view_6) {
            Intent intent4 = new Intent(this, t_chat_contra.class);
            intent4.putExtra("externo", true);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(view.getTag(R.id.tag_idapp));
            sb2.append("");
            intent4.putExtra("idapp", Integer.parseInt(sb2.toString()));
            StringBuilder sb3 = new StringBuilder();
            sb3.append(view.getTag());
            sb3.append("");
            intent4.putExtra("idchat", Integer.parseInt(sb3.toString()));
            StringBuilder sb4 = new StringBuilder();
            sb4.append(view.getTag(R.id.tag_idtema));
            sb4.append("");
            intent4.putExtra("idtema", Integer.parseInt(sb4.toString()));
            StringBuilder sb5 = new StringBuilder();
            sb5.append(view.getTag(R.id.tag_fotos_perfil));
            sb5.append("");
            intent4.putExtra("fotos_perfil", Integer.parseInt(sb5.toString()));
            StringBuilder sb6 = new StringBuilder();
            sb6.append(view.getTag(R.id.tag_fnac));
            sb6.append("");
            intent4.putExtra("fnac", Integer.parseInt(sb6.toString()));
            StringBuilder sb7 = new StringBuilder();
            sb7.append(view.getTag(R.id.tag_sexo));
            sb7.append("");
            intent4.putExtra("sexo", Integer.parseInt(sb7.toString()));
            StringBuilder sb8 = new StringBuilder();
            sb8.append(view.getTag(R.id.tag_descr));
            sb8.append("");
            intent4.putExtra("descr", Integer.parseInt(sb8.toString()));
            StringBuilder sb9 = new StringBuilder();
            sb9.append(view.getTag(R.id.tag_dist));
            sb9.append("");
            intent4.putExtra("dist", Integer.parseInt(sb9.toString()));
            String str = "privados";
            StringBuilder sb10 = new StringBuilder();
            sb10.append(view.getTag(R.id.tag_privados));
            sb10.append("");
            intent4.putExtra(str, Integer.parseInt(sb10.toString()) == 1);
            String str2 = "coments";
            StringBuilder sb11 = new StringBuilder();
            sb11.append(view.getTag(R.id.tag_coments));
            sb11.append("");
            intent4.putExtra(str2, Integer.parseInt(sb11.toString()) == 1);
            String str3 = "galeria";
            StringBuilder sb12 = new StringBuilder();
            sb12.append(view.getTag(R.id.tag_galeria));
            sb12.append("");
            if (Integer.parseInt(sb12.toString()) != 1) {
                z = false;
            }
            intent4.putExtra(str3, z);
            StringBuilder sb13 = new StringBuilder();
            sb13.append(view.getTag(R.id.tag_fotos_chat));
            sb13.append("");
            intent4.putExtra("fotos_chat", Integer.parseInt(sb13.toString()));
            StringBuilder sb14 = new StringBuilder();
            sb14.append(view.getTag(R.id.tag_c1));
            sb14.append("");
            intent4.putExtra("c1", sb14.toString());
            StringBuilder sb15 = new StringBuilder();
            sb15.append(view.getTag(R.id.tag_c2));
            sb15.append("");
            intent4.putExtra("c2", sb15.toString());
            StringBuilder sb16 = new StringBuilder();
            sb16.append(view.getTag(R.id.tag_titulo));
            sb16.append("");
            intent4.putExtra("tit_cab", sb16.toString());
            startActivityForResult(intent4, 0);
        } else if ((this.f18594e.f17986cO == null || this.f18594e.f17986cO.equals("")) && ((this.f18594e.f17985cN == null || this.f18594e.f17985cN.equals("")) && ((this.f18594e.f17988cQ == null || this.f18594e.f17988cQ.equals("")) && (this.f18594e.f17989cR == null || this.f18594e.f17989cR.equals(""))))) {
            abrir_secc(view);
        } else {
            if (this.f18594e.f17986cO != null && !this.f18594e.f17986cO.equals("")) {
                this.f18603n = new RewardedVideo((Context) this, this.f18594e.f17986cO);
            }
            if (this.f18594e.f17985cN != null && !this.f18594e.f17985cN.equals("")) {
                this.f18602m = C2997g.m10716a(this);
            }
            if (this.f18594e.f17988cQ != null && !this.f18594e.f17988cQ.equals("")) {
                this.f18604o = new RewardedVideoAd(this, this.f18594e.f17988cQ);
            }
            if (this.f18594e.f17989cR != null && !this.f18594e.f17989cR.equals("")) {
                this.f18605p = new StartAppAd(this);
            }
            this.f18609t = new ProgressDialog(this);
            this.f18608s = view;
            if (!this.f18594e.mo20774a((Context) this, view, this.f18595f, this.f18609t, this.f18602m, this.f18603n, this.f18604o, this.f18605p)) {
                abrir_secc(view);
            }
        }
    }

    public void abrir_secc(View view) {
        C5662h a = this.f18594e.mo20761a(view, (Context) this);
        if (a.f18227b) {
            this.f18596g = true;
            Intent intent = new Intent();
            intent.putExtra("finalizar", true);
            intent.putExtra("finalizar_app", a.f18228c);
            setResult(-1, intent);
        }
        if (a.f18229d) {
            startActivityForResult(a.f18226a, 0);
        } else if (a.f18226a != null) {
            if (a.f18227b && this.f18594e.f18045dm != 2) {
                a.f18226a.putExtra("es_root", true);
            }
            this.f18599j = false;
            startActivity(a.f18226a);
        }
        if (this.f18596g && !this.f18607r) {
            finish();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m24031a(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, String str, String str2, String str3, int i14) {
        findViewById(i).setTag(Integer.valueOf(i2));
        findViewById(i).setTag(R.id.tag_idtema, Integer.valueOf(i3));
        findViewById(i).setTag(R.id.tag_idapp, Integer.valueOf(i4));
        findViewById(i).setTag(R.id.tag_fotos_perfil, Integer.valueOf(i5));
        findViewById(i).setTag(R.id.tag_fnac, Integer.valueOf(i6));
        findViewById(i).setTag(R.id.tag_sexo, Integer.valueOf(i7));
        findViewById(i).setTag(R.id.tag_descr, Integer.valueOf(i8));
        findViewById(i).setTag(R.id.tag_dist, Integer.valueOf(i9));
        findViewById(i).setTag(R.id.tag_privados, Integer.valueOf(i10));
        findViewById(i).setTag(R.id.tag_coments, Integer.valueOf(i11));
        findViewById(i).setTag(R.id.tag_galeria, Integer.valueOf(i12));
        findViewById(i).setTag(R.id.tag_fotos_chat, Integer.valueOf(i13));
        findViewById(i).setTag(R.id.tag_titulo, str);
        findViewById(i).setTag(R.id.tag_c1, str2);
        findViewById(i).setTag(R.id.tag_c2, str3);
        findViewById(i).setTag(R.id.tag_nusus, Integer.valueOf(i14));
        findViewById(i).setOnClickListener(this);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public void mo21010g() {
        if (this.f18598i) {
            int i = mo21012i();
            int a = mo21007a(10.0f, this);
            int a2 = (i - (a * 2)) / (mo21007a(120.0f, this) + a);
            findViewById(R.id.ll_chats_fila1).setVisibility(0);
            findViewById(R.id.rl_chats_fila1).setVisibility(0);
            findViewById(R.id.ll_chats_fila2).setVisibility(0);
            findViewById(R.id.rl_chats_fila2).setVisibility(0);
            findViewById(R.id.card_view_1).setVisibility(0);
            findViewById(R.id.card_view_2).setVisibility(0);
            findViewById(R.id.card_view_3).setVisibility(0);
            findViewById(R.id.card_view_4).setVisibility(0);
            findViewById(R.id.card_view_5).setVisibility(0);
            findViewById(R.id.card_view_6).setVisibility(0);
            if (a2 < 3) {
                findViewById(R.id.card_view_3).setVisibility(8);
                findViewById(R.id.card_view_6).setVisibility(8);
                if (a2 < 2) {
                    findViewById(R.id.card_view_2).setVisibility(8);
                    findViewById(R.id.card_view_5).setVisibility(8);
                }
            }
            if (findViewById(R.id.card_view_3).getTag() == null) {
                findViewById(R.id.card_view_3).setVisibility(8);
                if (findViewById(R.id.card_view_2).getTag() == null) {
                    findViewById(R.id.card_view_2).setVisibility(8);
                    if (findViewById(R.id.card_view_1).getTag() == null) {
                        findViewById(R.id.ll_chats_fila1).setVisibility(8);
                        findViewById(R.id.rl_chats_fila1).setVisibility(8);
                    }
                }
            }
            if (findViewById(R.id.card_view_6).getTag() == null) {
                findViewById(R.id.card_view_6).setVisibility(8);
                if (findViewById(R.id.card_view_5).getTag() == null) {
                    findViewById(R.id.card_view_5).setVisibility(8);
                    if (findViewById(R.id.card_view_4).getTag() == null) {
                        findViewById(R.id.ll_chats_fila2).setVisibility(8);
                        findViewById(R.id.rl_chats_fila2).setVisibility(8);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public void mo21011h() {
        int ceil = (int) Math.ceil((double) (((float) getResources().getStringArray(this.f18615z > 0 ? this.f18593d : R.array.cats_menu_a).length) / ((float) ((mo21012i() - this.f18613x) / this.f18612w))));
        LayoutParams layoutParams = this.f18587A.getLayoutParams();
        layoutParams.height = mo21007a((float) ((ceil * 40) - 5), this);
        this.f18587A.setLayoutParams(layoutParams);
    }

    /* renamed from: a */
    public int mo21007a(float f, Context context) {
        return (int) TypedValue.applyDimension(1, f, context.getResources().getDisplayMetrics());
    }

    @TargetApi(13)
    /* renamed from: i */
    public int mo21012i() {
        Display defaultDisplay = getWindowManager().getDefaultDisplay();
        if (VERSION.SDK_INT < 13) {
            return defaultDisplay.getWidth();
        }
        Point point = new Point();
        defaultDisplay.getSize(point);
        return point.x;
    }

    public boolean onSearchRequested() {
        if (this.f18594e.f18080q == 0) {
            return false;
        }
        this.f18596g = true;
        this.f18607r = true;
        return super.onSearchRequested();
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getWindow().setFormat(1);
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ((LinearLayout) findViewById(R.id.ll_princ)).removeViewAt(0);
        mo21009f();
        mo21011h();
        mo21010g();
        ((LinearLayout) findViewById(R.id.ll_ad)).removeAllViews();
        if (!(this.f18601l == null || this.f18601l.f17768a == null)) {
            try {
                this.f18601l.f17768a.mo12168c();
            } catch (Exception unused) {
            }
        }
        if (!(this.f18601l == null || this.f18601l.f17769b == null)) {
            try {
                this.f18601l.f17769b.destroy();
            } catch (Exception unused2) {
            }
        }
        this.f18601l = this.f18594e.mo20760a((Context) this, false);
    }

    public void onStop() {
        super.onStop();
        if (this.f18596g && !this.f18607r) {
            finish();
        }
    }

    public void onPause() {
        if (!(this.f18594e.f18013cx == 0 || this.f18601l == null || this.f18601l.f17768a == null)) {
            this.f18601l.f17768a.mo12167b();
        }
        super.onPause();
    }

    public void onResume() {
        super.onResume();
        config.m23860m(this);
        if (this.f18594e.f18013cx != 0 && this.f18601l != null && this.f18601l.f17768a != null) {
            this.f18601l.f17768a.mo12165a();
        }
    }

    public void onDestroy() {
        if (!(this.f18594e.f18013cx == 0 || this.f18601l == null || this.f18601l.f17768a == null)) {
            this.f18601l.f17768a.mo12168c();
        }
        if (!(this.f18594e.f18013cx == 0 || this.f18601l == null || this.f18601l.f17769b == null)) {
            this.f18601l.f17769b.destroy();
        }
        if ((this.f18599j && isFinishing()) || config.f17841i) {
            config.m23861n(this);
        }
        super.onDestroy();
    }

    public void onBackPressed() {
        if (!this.f18599j || this.f18597h || !this.f18594e.f18059ea) {
            super.onBackPressed();
            return;
        }
        this.f18597h = true;
        config.m23859l(this);
    }

    public void adLoaded(String str) {
        this.f18609t.cancel();
        this.f18603n.showAd();
    }

    public void onAdClosed() {
        if (this.f18606q) {
            abrir_secc(this.f18608s);
        }
    }

    public void adError(String str) {
        this.f18609t.cancel();
        abrir_secc(this.f18608s);
    }

    public void videoEnded() {
        this.f18606q = true;
        config.m23867t(this);
    }

    /* renamed from: z_ */
    public void mo9678z_() {
        this.f18609t.cancel();
        this.f18602m.mo12836a();
    }

    /* renamed from: a */
    public void mo9675a(C3165a aVar) {
        this.f18606q = true;
        config.m23867t(this);
    }

    /* renamed from: A_ */
    public void mo9671A_() {
        if (this.f18606q) {
            abrir_secc(this.f18608s);
        }
    }

    /* renamed from: e */
    public void mo9676e() {
        this.f18606q = false;
    }

    /* renamed from: a */
    public void mo9674a(int i) {
        if (!this.f18594e.mo20775a((Context) this, this.f18603n)) {
            this.f18609t.cancel();
            abrir_secc(this.f18608s);
        }
    }

    public void onError(C1514Ad ad, AdError adError) {
        this.f18609t.cancel();
        abrir_secc(this.f18608s);
    }

    public void onAdLoaded(C1514Ad ad) {
        this.f18609t.cancel();
        this.f18604o.show();
    }

    public void onRewardedVideoCompleted() {
        this.f18606q = true;
        config.m23867t(this);
    }

    public void onRewardedVideoClosed() {
        if (this.f18606q) {
            abrir_secc(this.f18608s);
        }
    }

    public void onVideoCompleted() {
        this.f18606q = true;
        config.m23867t(this);
    }

    public void onReceiveAd(C5286Ad ad) {
        this.f18609t.cancel();
        this.f18605p.showAd("REWARDED VIDEO", new AdDisplayListener() {
            public void adClicked(C5286Ad ad) {
            }

            public void adDisplayed(C5286Ad ad) {
            }

            public void adNotDisplayed(C5286Ad ad) {
            }

            public void adHidden(C5286Ad ad) {
                if (t_buscchats.this.f18606q) {
                    t_buscchats.this.abrir_secc(t_buscchats.this.f18608s);
                }
            }
        });
    }

    public void onFailedToReceiveAd(C5286Ad ad) {
        this.f18609t.cancel();
        abrir_secc(this.f18608s);
    }
}
