package mega.boicot;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.app.NotificationManager;
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
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.GradientDrawable.Orientation;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
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
import java.net.URISyntaxException;
import java.text.DateFormat;
import java.util.Calendar;

public class notifs extends Activity implements OnClickListener, OnAdClosed, OnAdError, OnAdLoaded, OnVideoEnded, RewardedVideoAdListener, C3167c, VideoListener, AdEventListener, C5599a {

    /* renamed from: a */
    C3166b f18335a;

    /* renamed from: b */
    RewardedVideo f18336b;

    /* renamed from: c */
    RewardedVideoAd f18337c;

    /* renamed from: d */
    StartAppAd f18338d;

    /* renamed from: e */
    boolean f18339e = false;

    /* renamed from: f */
    boolean f18340f = false;

    /* renamed from: g */
    View f18341g;

    /* renamed from: h */
    ProgressDialog f18342h;

    /* renamed from: i */
    ListView f18343i;

    /* renamed from: j */
    private SharedPreferences f18344j;

    /* renamed from: k */
    private config f18345k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public boolean f18346l = false;

    /* renamed from: m */
    private boolean f18347m = false;

    /* renamed from: n */
    private boolean f18348n;

    /* renamed from: o */
    private boolean f18349o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public String f18350p;

    /* renamed from: q */
    private Bundle f18351q;

    /* renamed from: r */
    private C5602c f18352r;

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
        this.f18345k = (config) getApplicationContext();
        if (this.f18345k.f17881aN == null) {
            this.f18345k.mo20780b();
        }
        this.f18350p = config.m23831a(this.f18345k.f17881aN, this.f18345k.f17890aW);
        if (VERSION.SDK_INT > 12) {
            StringBuilder sb = new StringBuilder();
            sb.append("#");
            sb.append(this.f18345k.f17881aN);
            if (!config.m23844a(sb.toString())) {
                setTheme(R.style.holonolight);
            }
        }
        super.onCreate(bundle);
        setContentView(R.layout.notifs);
        mo20850f();
        if (this.f18345k.f18080q > 0) {
            SearchManager searchManager = (SearchManager) getSystemService("search");
            searchManager.setOnCancelListener(new OnCancelListener() {
                public void onCancel() {
                    notifs.this.f18346l = false;
                    notifs.this.setResult(0);
                }
            });
            searchManager.setOnDismissListener(new OnDismissListener() {
                public void onDismiss() {
                    notifs.this.f18340f = false;
                }
            });
        }
        this.f18345k.mo20770a((Context) this, false, false);
        this.f18352r = this.f18345k.mo20760a((Context) this, false);
        this.f18351q = getIntent().getExtras();
        if (bundle == null) {
            this.f18349o = this.f18351q != null && this.f18351q.containsKey("es_root") && this.f18351q.getBoolean("es_root", false);
        } else {
            this.f18349o = bundle.containsKey("es_root") && bundle.getBoolean("es_root", false);
        }
        this.f18344j = getSharedPreferences("sh", 0);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("#");
        sb2.append(this.f18345k.f17881aN);
        this.f18348n = config.m23844a(sb2.toString());
        if (!this.f18345k.f17881aN.equals("")) {
            Orientation orientation = Orientation.TOP_BOTTOM;
            StringBuilder sb3 = new StringBuilder();
            sb3.append("#");
            sb3.append(this.f18345k.f17881aN);
            StringBuilder sb4 = new StringBuilder();
            sb4.append("#");
            sb4.append(this.f18345k.f17882aO);
            findViewById(R.id.ll_princ).setBackgroundDrawable(new GradientDrawable(orientation, new int[]{Color.parseColor(sb3.toString()), Color.parseColor(sb4.toString())}));
        }
        int i = -16777216;
        if (!this.f18348n) {
            i = -1;
        }
        ((TextView) findViewById(R.id.tv_listanotifs)).setTextColor(i);
        findViewById(R.id.v_listanotifs).setBackgroundColor(i);
        ((TextView) findViewById(R.id.tv_sinnotifs)).setTextColor(i);
        if (this.f18348n) {
            ((ImageView) findViewById(R.id.btntrash)).setImageDrawable(getResources().getDrawable(R.drawable.trash));
            ((ImageView) findViewById(R.id.btnsettings)).setImageDrawable(getResources().getDrawable(R.drawable.settings));
        } else {
            ((ImageView) findViewById(R.id.btntrash)).setImageDrawable(getResources().getDrawable(R.drawable.trash_light));
            ((ImageView) findViewById(R.id.btnsettings)).setImageDrawable(getResources().getDrawable(R.drawable.settings_light));
        }
        findViewById(R.id.btntrash).setOnClickListener(this);
        if (this.f18345k.f18067ei) {
            findViewById(R.id.btnsettings).setOnClickListener(this);
            findViewById(R.id.btnsettings).setVisibility(0);
        }
        m23934g();
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i2 == -1 && intent != null && intent.hasExtra("finalizar") && intent.getExtras().getBoolean("finalizar")) {
            if (!intent.getExtras().getBoolean("finalizar_app")) {
                this.f18349o = false;
            }
            setResult(-1, intent);
            finish();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public void mo20850f() {
        int b = this.f18345k.mo20778b((Context) this);
        if (this.f18345k.f18045dm == 1) {
            this.f18343i = (ListView) findViewById(R.id.left_drawer);
            this.f18345k.mo20771a(this.f18343i);
        } else if (this.f18345k.f18045dm == 0) {
            int i = 0;
            for (int i2 = 0; i2 < this.f18345k.f17971bz.length; i2++) {
                if (!this.f18345k.f17971bz[i2].f18333z) {
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
        for (int i3 = 0; i3 < this.f18345k.f17923bD.length; i3++) {
            if (this.f18345k.f17923bD[i3] > 0) {
                findViewById(this.f18345k.f17923bD[i3]).setOnClickListener(this);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public void m23934g() {
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.llnotifs);
        linearLayout.removeAllViews();
        LayoutInflater layoutInflater = (LayoutInflater) getSystemService("layout_inflater");
        boolean z = false;
        int i = this.f18344j.getInt("id_ultnotif", 0);
        int i2 = 0;
        while (i > 0) {
            SharedPreferences sharedPreferences = this.f18344j;
            StringBuilder sb = new StringBuilder();
            sb.append("notif_");
            sb.append(i);
            sb.append("_title");
            if (sharedPreferences.contains(sb.toString())) {
                int i3 = config.f17813a;
                int i4 = config.f17838f;
                if (!this.f18348n) {
                    i3 = config.f17815c;
                    i4 = config.f17834e;
                }
                LinearLayout linearLayout2 = (LinearLayout) layoutInflater.inflate(R.layout.notif, null);
                TextView textView = (TextView) linearLayout2.findViewById(R.id.tv_title);
                SharedPreferences sharedPreferences2 = this.f18344j;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("notif_");
                sb2.append(i);
                sb2.append("_title");
                textView.setText(sharedPreferences2.getString(sb2.toString(), ""));
                TextView textView2 = (TextView) linearLayout2.findViewById(R.id.tv_text);
                SharedPreferences sharedPreferences3 = this.f18344j;
                StringBuilder sb3 = new StringBuilder();
                sb3.append("notif_");
                sb3.append(i);
                sb3.append("_text");
                textView2.setText(sharedPreferences3.getString(sb3.toString(), ""));
                textView.setTextColor(i3);
                textView2.setTextColor(i3);
                linearLayout2.findViewById(R.id.v_sepnotifs).setBackgroundColor(i4);
                SharedPreferences sharedPreferences4 = this.f18344j;
                StringBuilder sb4 = new StringBuilder();
                sb4.append("notif_");
                sb4.append(i);
                sb4.append("_leida");
                if (!sharedPreferences4.getBoolean(sb4.toString(), z)) {
                    linearLayout2.findViewById(R.id.tv_nuevo).setVisibility(z ? 1 : 0);
                }
                DateFormat dateFormat = android.text.format.DateFormat.getDateFormat(this);
                DateFormat timeFormat = android.text.format.DateFormat.getTimeFormat(this);
                TextView textView3 = (TextView) linearLayout2.findViewById(R.id.tv_f);
                long currentTimeMillis = System.currentTimeMillis();
                SharedPreferences sharedPreferences5 = this.f18344j;
                StringBuilder sb5 = new StringBuilder();
                sb5.append("notif_");
                sb5.append(i);
                sb5.append("_fcrea");
                if (currentTimeMillis - sharedPreferences5.getLong(sb5.toString(), 0) < 300000) {
                    textView3.setText(getResources().getString(R.string.ahora));
                } else {
                    Calendar instance = Calendar.getInstance();
                    Calendar instance2 = Calendar.getInstance();
                    SharedPreferences sharedPreferences6 = this.f18344j;
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append("notif_");
                    sb6.append(i);
                    sb6.append("_fcrea");
                    instance2.setTimeInMillis(sharedPreferences6.getLong(sb6.toString(), 0));
                    if (instance2.get(1) == instance.get(1) && instance2.get(6) == instance.get(6)) {
                        StringBuilder sb7 = new StringBuilder();
                        sb7.append(getResources().getString(R.string.hoy));
                        sb7.append(" ");
                        sb7.append(timeFormat.format(Long.valueOf(instance2.getTimeInMillis())));
                        textView3.setText(sb7.toString());
                    } else {
                        StringBuilder sb8 = new StringBuilder();
                        sb8.append(dateFormat.format(Long.valueOf(instance2.getTimeInMillis())));
                        sb8.append(" ");
                        sb8.append(timeFormat.format(Long.valueOf(instance2.getTimeInMillis())));
                        textView3.setText(sb8.toString());
                    }
                }
                linearLayout2.setTag(R.id.idaux1, Integer.valueOf(i));
                linearLayout2.setOnClickListener(this);
                linearLayout.addView(linearLayout2);
                i2++;
                if (i2 > 99) {
                    break;
                }
            }
            i--;
            z = false;
        }
        if (i2 == 0) {
            findViewById(R.id.tv_sinnotifs).setVisibility(0);
        }
    }

    public void onClick(View view) {
        Intent intent;
        boolean z = false;
        if (view.getId() == R.id.btntrash) {
            if (this.f18344j.getInt("id_ultnotif", 0) != 0) {
                final AlertDialog create = new Builder(this).setNegativeButton(R.string.cancelar, null).setPositiveButton(R.string.aceptar, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialogInterface, int i) {
                        config.m23866s(notifs.this);
                        notifs.this.m23934g();
                        config.m23865r(notifs.this);
                    }
                }).setMessage(R.string.confirmar_elimnotifs).create();
                if (!this.f18350p.equals("")) {
                    create.setOnShowListener(new OnShowListener() {
                        public void onShow(DialogInterface dialogInterface) {
                            Button button = create.getButton(-1);
                            StringBuilder sb = new StringBuilder();
                            sb.append("#");
                            sb.append(notifs.this.f18350p);
                            button.setTextColor(Color.parseColor(sb.toString()));
                            Button button2 = create.getButton(-2);
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("#");
                            sb2.append(notifs.this.f18350p);
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
        } else if (view.getId() == R.id.btnsettings) {
            startActivityForResult(new Intent(this, notifs_cats.class), 0);
        } else if (view.getTag(R.id.idaux1) != null) {
            SharedPreferences sharedPreferences = this.f18344j;
            StringBuilder sb = new StringBuilder();
            sb.append("notif_");
            sb.append(view.getTag(R.id.idaux1));
            sb.append("_numnotif");
            int i = sharedPreferences.getInt(sb.toString(), 0);
            if (i != 0) {
                ((NotificationManager) getSystemService("notification")).cancel(i);
            }
            Editor edit = this.f18344j.edit();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("notif_");
            sb2.append(view.getTag(R.id.idaux1));
            sb2.append("_leida");
            edit.putBoolean(sb2.toString(), true);
            edit.commit();
            config.m23864q(this);
            SharedPreferences sharedPreferences2 = this.f18344j;
            StringBuilder sb3 = new StringBuilder();
            sb3.append("notif_");
            sb3.append(view.getTag(R.id.idaux1));
            sb3.append("_intent");
            String string = sharedPreferences2.getString(sb3.toString(), "");
            if (!string.equals("")) {
                try {
                    intent = Intent.parseUri(string, 0);
                    z = true;
                } catch (URISyntaxException unused2) {
                    intent = null;
                }
                if (z) {
                    intent.putExtra("directo", true);
                    startActivity(intent);
                    Intent intent2 = new Intent();
                    intent2.putExtra("finalizar", true);
                    intent2.putExtra("finalizar_app", true);
                    config.f17841i = true;
                    this.f18346l = true;
                    setResult(-1, intent2);
                }
            }
        } else if ((this.f18345k.f17986cO == null || this.f18345k.f17986cO.equals("")) && ((this.f18345k.f17985cN == null || this.f18345k.f17985cN.equals("")) && ((this.f18345k.f17988cQ == null || this.f18345k.f17988cQ.equals("")) && (this.f18345k.f17989cR == null || this.f18345k.f17989cR.equals(""))))) {
            abrir_secc(view);
        } else {
            if (this.f18345k.f17986cO != null && !this.f18345k.f17986cO.equals("")) {
                this.f18336b = new RewardedVideo((Context) this, this.f18345k.f17986cO);
            }
            if (this.f18345k.f17985cN != null && !this.f18345k.f17985cN.equals("")) {
                this.f18335a = C2997g.m10716a(this);
            }
            if (this.f18345k.f17988cQ != null && !this.f18345k.f17988cQ.equals("")) {
                this.f18337c = new RewardedVideoAd(this, this.f18345k.f17988cQ);
            }
            if (this.f18345k.f17989cR != null && !this.f18345k.f17989cR.equals("")) {
                this.f18338d = new StartAppAd(this);
            }
            this.f18342h = new ProgressDialog(this);
            this.f18341g = view;
            if (!this.f18345k.mo20774a((Context) this, view, this.f18350p, this.f18342h, this.f18335a, this.f18336b, this.f18337c, this.f18338d)) {
                abrir_secc(view);
            }
        }
    }

    public void abrir_secc(View view) {
        C5662h a = this.f18345k.mo20761a(view, (Context) this);
        try {
            if (a.f18226a != null && a.f18226a.getComponent().getClassName().endsWith(".notifs")) {
                return;
            }
        } catch (Exception unused) {
        }
        if (a.f18227b) {
            this.f18346l = true;
            Intent intent = new Intent();
            intent.putExtra("finalizar", true);
            intent.putExtra("finalizar_app", a.f18228c);
            setResult(-1, intent);
        }
        if (a.f18229d) {
            startActivityForResult(a.f18226a, 0);
        } else if (a.f18226a != null) {
            if (a.f18227b && this.f18345k.f18045dm != 2) {
                a.f18226a.putExtra("es_root", true);
            }
            this.f18349o = false;
            startActivity(a.f18226a);
        }
        if (this.f18346l && !this.f18340f) {
            finish();
        }
    }

    public boolean onSearchRequested() {
        if (this.f18345k.f18080q == 0) {
            return false;
        }
        this.f18346l = true;
        this.f18340f = true;
        return super.onSearchRequested();
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getWindow().setFormat(1);
    }

    public void onResume() {
        super.onResume();
        config.m23860m(this);
        if (this.f18345k.f18013cx != 0 && this.f18352r != null && this.f18352r.f17768a != null) {
            this.f18352r.f17768a.mo12165a();
        }
    }

    public void onPause() {
        if (!(this.f18345k.f18013cx == 0 || this.f18352r == null || this.f18352r.f17768a == null)) {
            this.f18352r.f17768a.mo12167b();
        }
        super.onPause();
    }

    public void onStop() {
        super.onStop();
        if (this.f18346l && !this.f18340f) {
            finish();
        }
    }

    public void onDestroy() {
        if (!(this.f18345k.f18013cx == 0 || this.f18352r == null || this.f18352r.f17768a == null)) {
            this.f18352r.f17768a.mo12168c();
        }
        if (!(this.f18345k.f18013cx == 0 || this.f18352r == null || this.f18352r.f17769b == null)) {
            this.f18352r.f17769b.destroy();
        }
        if ((this.f18349o && isFinishing()) || config.f17841i) {
            config.m23861n(this);
        }
        super.onDestroy();
    }

    public void onBackPressed() {
        if (!this.f18349o || this.f18347m || !this.f18345k.f18059ea) {
            super.onBackPressed();
            return;
        }
        this.f18347m = true;
        config.m23859l(this);
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ((LinearLayout) findViewById(R.id.ll_princ)).removeViewAt(0);
        mo20850f();
        ((LinearLayout) findViewById(R.id.ll_ad)).removeAllViews();
        if (!(this.f18352r == null || this.f18352r.f17768a == null)) {
            try {
                this.f18352r.f17768a.mo12168c();
            } catch (Exception unused) {
            }
        }
        if (!(this.f18352r == null || this.f18352r.f17769b == null)) {
            try {
                this.f18352r.f17769b.destroy();
            } catch (Exception unused2) {
            }
        }
        this.f18352r = this.f18345k.mo20760a((Context) this, false);
    }

    public void adLoaded(String str) {
        this.f18342h.cancel();
        this.f18336b.showAd();
    }

    public void onAdClosed() {
        if (this.f18339e) {
            abrir_secc(this.f18341g);
        }
    }

    public void adError(String str) {
        this.f18342h.cancel();
        abrir_secc(this.f18341g);
    }

    public void videoEnded() {
        this.f18339e = true;
        config.m23867t(this);
    }

    /* renamed from: z_ */
    public void mo9678z_() {
        this.f18342h.cancel();
        this.f18335a.mo12836a();
    }

    /* renamed from: a */
    public void mo9675a(C3165a aVar) {
        this.f18339e = true;
        config.m23867t(this);
    }

    /* renamed from: A_ */
    public void mo9671A_() {
        if (this.f18339e) {
            abrir_secc(this.f18341g);
        }
    }

    /* renamed from: e */
    public void mo9676e() {
        this.f18339e = false;
    }

    /* renamed from: a */
    public void mo9674a(int i) {
        if (!this.f18345k.mo20775a((Context) this, this.f18336b)) {
            this.f18342h.cancel();
            abrir_secc(this.f18341g);
        }
    }

    public void onError(C1514Ad ad, AdError adError) {
        this.f18342h.cancel();
        abrir_secc(this.f18341g);
    }

    public void onAdLoaded(C1514Ad ad) {
        this.f18342h.cancel();
        this.f18337c.show();
    }

    public void onRewardedVideoCompleted() {
        this.f18339e = true;
        config.m23867t(this);
    }

    public void onRewardedVideoClosed() {
        if (this.f18339e) {
            abrir_secc(this.f18341g);
        }
    }

    public void onVideoCompleted() {
        this.f18339e = true;
        config.m23867t(this);
    }

    public void onReceiveAd(C5286Ad ad) {
        this.f18342h.cancel();
        this.f18338d.showAd("REWARDED VIDEO", new AdDisplayListener() {
            public void adClicked(C5286Ad ad) {
            }

            public void adDisplayed(C5286Ad ad) {
            }

            public void adNotDisplayed(C5286Ad ad) {
            }

            public void adHidden(C5286Ad ad) {
                if (notifs.this.f18339e) {
                    notifs.this.abrir_secc(notifs.this.f18341g);
                }
            }
        });
    }

    public void onFailedToReceiveAd(C5286Ad ad) {
        this.f18342h.cancel();
        abrir_secc(this.f18341g);
    }
}
