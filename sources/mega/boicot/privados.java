package mega.boicot;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.app.ProgressDialog;
import android.app.SearchManager;
import android.app.SearchManager.OnCancelListener;
import android.app.SearchManager.OnDismissListener;
import android.content.ContentResolver;
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
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore.Images.Media;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.LayoutInflater;
import android.view.MenuItem;
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
import java.io.File;
import java.text.DateFormat;
import java.util.Date;
import mega.boicot.t_chat.C6157b;

public class privados extends Activity implements OnClickListener, OnAdClosed, OnAdError, OnAdLoaded, OnVideoEnded, RewardedVideoAdListener, C3167c, VideoListener, AdEventListener, C5599a {

    /* renamed from: a */
    C3166b f19963a;

    /* renamed from: b */
    RewardedVideo f19964b;

    /* renamed from: c */
    RewardedVideoAd f19965c;

    /* renamed from: d */
    StartAppAd f19966d;

    /* renamed from: e */
    boolean f19967e = false;

    /* renamed from: f */
    boolean f19968f = false;

    /* renamed from: g */
    View f19969g;

    /* renamed from: h */
    ProgressDialog f19970h;

    /* renamed from: i */
    ListView f19971i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public int f19972j;

    /* renamed from: k */
    private int f19973k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public String f19974l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public String f19975m;

    /* renamed from: n */
    private SharedPreferences f19976n;

    /* renamed from: o */
    private config f19977o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public View f19978p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public boolean f19979q = false;

    /* renamed from: r */
    private boolean f19980r = false;

    /* renamed from: s */
    private boolean f19981s;

    /* renamed from: t */
    private boolean f19982t;

    /* renamed from: u */
    private Bundle f19983u;

    /* renamed from: v */
    private C5602c f19984v;

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
        this.f19977o = (config) getApplicationContext();
        if (this.f19977o.f17881aN == null) {
            this.f19977o.mo20780b();
        }
        int i = this.f19977o.f18075l;
        this.f19975m = config.m23831a(this.f19977o.f17971bz[i].f18314g, this.f19977o.f17890aW);
        if (VERSION.SDK_INT > 12) {
            StringBuilder sb = new StringBuilder();
            sb.append("#");
            sb.append(this.f19977o.f17971bz[i].f18314g);
            if (!config.m23844a(sb.toString())) {
                setTheme(R.style.holonolight);
            }
        }
        super.onCreate(bundle);
        setContentView(R.layout.privados);
        mo21827f();
        if (this.f19977o.f18080q > 0) {
            SearchManager searchManager = (SearchManager) getSystemService("search");
            searchManager.setOnCancelListener(new OnCancelListener() {
                public void onCancel() {
                    privados.this.f19979q = false;
                    privados.this.setResult(0);
                }
            });
            searchManager.setOnDismissListener(new OnDismissListener() {
                public void onDismiss() {
                    privados.this.f19968f = false;
                }
            });
        }
        this.f19977o.mo20770a((Context) this, false, false);
        this.f19984v = this.f19977o.mo20760a((Context) this, false);
        this.f19983u = getIntent().getExtras();
        if (bundle == null) {
            this.f19982t = this.f19983u != null && this.f19983u.containsKey("es_root") && this.f19983u.getBoolean("es_root", false);
        } else {
            this.f19982t = bundle.containsKey("es_root") && bundle.getBoolean("es_root", false);
        }
        this.f19976n = getSharedPreferences("sh", 0);
        this.f19972j = this.f19976n.getInt("idusu", 0);
        this.f19974l = this.f19976n.getString("cod", "");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("#");
        sb2.append(this.f19977o.f17971bz[i].f18314g);
        this.f19981s = config.m23844a(sb2.toString());
        if (!this.f19977o.f17971bz[i].f18314g.equals("")) {
            Orientation orientation = Orientation.TOP_BOTTOM;
            StringBuilder sb3 = new StringBuilder();
            sb3.append("#");
            sb3.append(this.f19977o.f17971bz[i].f18314g);
            StringBuilder sb4 = new StringBuilder();
            sb4.append("#");
            sb4.append(this.f19977o.f17971bz[i].f18315h);
            findViewById(R.id.ll_princ).setBackgroundDrawable(new GradientDrawable(orientation, new int[]{Color.parseColor(sb3.toString()), Color.parseColor(sb4.toString())}));
        }
        int i2 = -16777216;
        if (!this.f19981s) {
            i2 = -1;
        }
        ((TextView) findViewById(R.id.tv_listaprivados)).setTextColor(i2);
        findViewById(R.id.v_listaprivados).setBackgroundColor(i2);
        ((TextView) findViewById(R.id.tv_sinprivados)).setTextColor(i2);
        this.f19973k = 1;
        m24494g();
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i2 == -1 && intent != null && intent.hasExtra("finalizar") && intent.getExtras().getBoolean("finalizar")) {
            if (!intent.getExtras().getBoolean("finalizar_app")) {
                this.f19982t = false;
            }
            setResult(-1, intent);
            finish();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public void mo21827f() {
        int b = this.f19977o.mo20778b((Context) this);
        if (this.f19977o.f18045dm == 1) {
            this.f19971i = (ListView) findViewById(R.id.left_drawer);
            this.f19977o.mo20771a(this.f19971i);
        } else if (this.f19977o.f18045dm == 0) {
            int i = 0;
            for (int i2 = 0; i2 < this.f19977o.f17971bz.length; i2++) {
                if (!this.f19977o.f17971bz[i2].f18333z) {
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
        for (int i3 = 0; i3 < this.f19977o.f17923bD.length; i3++) {
            if (this.f19977o.f17923bD[i3] > 0) {
                findViewById(this.f19977o.f17923bD[i3]).setOnClickListener(this);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public void m24494g() {
        File file = new File(Environment.getExternalStorageDirectory(), getPackageName());
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.llprivados);
        linearLayout.removeAllViews();
        LayoutInflater layoutInflater = (LayoutInflater) getSystemService("layout_inflater");
        boolean z = false;
        for (int i = 0; i < 100; i++) {
            SharedPreferences sharedPreferences = this.f19976n;
            StringBuilder sb = new StringBuilder();
            sb.append("privado");
            sb.append(i);
            sb.append("_id");
            if (sharedPreferences.contains(sb.toString())) {
                int i2 = -16777216;
                SharedPreferences sharedPreferences2 = this.f19976n;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("privado");
                sb2.append(i);
                sb2.append("_id");
                String string = sharedPreferences2.getString(sb2.toString(), "");
                if (!string.equals("")) {
                    string = string.substring(string.length() - 1, string.length());
                }
                if (this.f19981s) {
                    if (string.equals("0") || string.equals("5")) {
                        i2 = Color.parseColor("#FF00698C");
                    } else if (string.equals("1") || string.equals("6")) {
                        i2 = Color.parseColor("#FF9933CC");
                    } else if (string.equals("2") || string.equals("7")) {
                        i2 = Color.parseColor("#FF3D5C00");
                    } else if (string.equals("3") || string.equals("8")) {
                        i2 = Color.parseColor("#FF9E5400");
                    } else if (string.equals("4") || string.equals("9")) {
                        i2 = Color.parseColor("#FFCC0000");
                    }
                } else if (string.equals("0") || string.equals("5")) {
                    i2 = Color.parseColor("#FFFF6633");
                } else if (string.equals("1") || string.equals("6")) {
                    i2 = Color.parseColor("#FF66CC33");
                } else if (string.equals("2") || string.equals("7")) {
                    i2 = Color.parseColor("#FFC9ADFF");
                } else if (string.equals("3") || string.equals("8")) {
                    i2 = Color.parseColor("#FF87BFFF");
                } else if (string.equals("4") || string.equals("9")) {
                    i2 = Color.parseColor("#FF33FFFF");
                }
                LinearLayout linearLayout2 = (LinearLayout) layoutInflater.inflate(R.layout.privado, null);
                ImageView imageView = (ImageView) linearLayout2.findViewById(R.id.iv_avatar_f);
                if (this.f19973k == 0) {
                    imageView.setVisibility(8);
                    linearLayout2.findViewById(R.id.v_foto).setBackgroundColor(i2);
                    linearLayout2.findViewById(R.id.v_foto).setVisibility(0);
                } else {
                    imageView.setBackgroundColor(i2);
                    try {
                        ContentResolver contentResolver = getContentResolver();
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("fperfil_");
                        SharedPreferences sharedPreferences3 = this.f19976n;
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("privado");
                        sb4.append(i);
                        sb4.append("_id");
                        sb3.append(sharedPreferences3.getString(sb4.toString(), ""));
                        sb3.append(".jpg");
                        imageView.setImageBitmap(Media.getBitmap(contentResolver, Uri.fromFile(new File(file, sb3.toString()))));
                    } catch (Exception unused) {
                        if (this.f19981s) {
                            imageView.setImageDrawable(getResources().getDrawable(R.drawable.sinfoto_light));
                        } else {
                            imageView.setImageDrawable(getResources().getDrawable(R.drawable.sinfoto));
                        }
                    }
                }
                TextView textView = (TextView) linearLayout2.findViewById(R.id.tv_nombre_f);
                SharedPreferences sharedPreferences4 = this.f19976n;
                StringBuilder sb5 = new StringBuilder();
                sb5.append("privado");
                sb5.append(i);
                sb5.append("_nombre");
                textView.setText(sharedPreferences4.getString(sb5.toString(), ""));
                TextView textView2 = (TextView) linearLayout2.findViewById(R.id.tv_nombre_2_f);
                SharedPreferences sharedPreferences5 = this.f19976n;
                StringBuilder sb6 = new StringBuilder();
                sb6.append("privado");
                sb6.append(i);
                sb6.append("_fultconex");
                Date date = new Date(sharedPreferences5.getLong(sb6.toString(), 0));
                DateFormat dateFormat = android.text.format.DateFormat.getDateFormat(getApplicationContext());
                DateFormat timeFormat = android.text.format.DateFormat.getTimeFormat(getApplicationContext());
                StringBuilder sb7 = new StringBuilder();
                sb7.append(dateFormat.format(date));
                sb7.append(" ");
                sb7.append(timeFormat.format(date));
                textView2.setText(sb7.toString());
                textView.setTextColor(i2);
                textView2.setTextColor(i2);
                SharedPreferences sharedPreferences6 = this.f19976n;
                StringBuilder sb8 = new StringBuilder();
                sb8.append("privado");
                sb8.append(i);
                sb8.append("_id");
                linearLayout2.setTag(R.id.idaux1, sharedPreferences6.getString(sb8.toString(), ""));
                SharedPreferences sharedPreferences7 = this.f19976n;
                StringBuilder sb9 = new StringBuilder();
                sb9.append("privado");
                sb9.append(i);
                sb9.append("_nombre");
                linearLayout2.setTag(R.id.idaux3, sharedPreferences7.getString(sb9.toString(), ""));
                registerForContextMenu(linearLayout2);
                linearLayout2.setOnClickListener(this);
                linearLayout.addView(linearLayout2);
                z = true;
            }
        }
        if (!z) {
            if (VERSION.SDK_INT >= 17 && getResources().getBoolean(R.bool.es_rtl)) {
                findViewById(R.id.tv_sinprivados).setTextDirection(4);
            }
            findViewById(R.id.tv_sinprivados).setVisibility(0);
        }
    }

    public void onClick(View view) {
        if (view.getTag(R.id.idaux1) != null) {
            openContextMenu(view);
        } else if ((this.f19977o.f17986cO == null || this.f19977o.f17986cO.equals("")) && ((this.f19977o.f17985cN == null || this.f19977o.f17985cN.equals("")) && ((this.f19977o.f17988cQ == null || this.f19977o.f17988cQ.equals("")) && (this.f19977o.f17989cR == null || this.f19977o.f17989cR.equals(""))))) {
            abrir_secc(view);
        } else {
            if (this.f19977o.f17986cO != null && !this.f19977o.f17986cO.equals("")) {
                this.f19964b = new RewardedVideo((Context) this, this.f19977o.f17986cO);
            }
            if (this.f19977o.f17985cN != null && !this.f19977o.f17985cN.equals("")) {
                this.f19963a = C2997g.m10716a(this);
            }
            if (this.f19977o.f17988cQ != null && !this.f19977o.f17988cQ.equals("")) {
                this.f19965c = new RewardedVideoAd(this, this.f19977o.f17988cQ);
            }
            if (this.f19977o.f17989cR != null && !this.f19977o.f17989cR.equals("")) {
                this.f19966d = new StartAppAd(this);
            }
            this.f19970h = new ProgressDialog(this);
            this.f19969g = view;
            if (!this.f19977o.mo20774a((Context) this, view, this.f19975m, this.f19970h, this.f19963a, this.f19964b, this.f19965c, this.f19966d)) {
                abrir_secc(view);
            }
        }
    }

    public void abrir_secc(View view) {
        C5662h a = this.f19977o.mo20761a(view, (Context) this);
        if (a.f18227b) {
            this.f19979q = true;
            Intent intent = new Intent();
            intent.putExtra("finalizar", true);
            intent.putExtra("finalizar_app", a.f18228c);
            setResult(-1, intent);
        }
        if (a.f18229d) {
            startActivityForResult(a.f18226a, 0);
        } else if (a.f18226a != null) {
            if (a.f18227b && this.f19977o.f18045dm != 2) {
                a.f18226a.putExtra("es_root", true);
            }
            this.f19982t = false;
            startActivity(a.f18226a);
        }
        if (this.f19979q && !this.f19968f) {
            finish();
        }
    }

    public boolean onSearchRequested() {
        if (this.f19977o.f18080q == 0) {
            return false;
        }
        this.f19979q = true;
        this.f19968f = true;
        return super.onSearchRequested();
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getWindow().setFormat(1);
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenuInfo contextMenuInfo) {
        super.onCreateContextMenu(contextMenu, view, contextMenuInfo);
        this.f19978p = view;
        contextMenu.setHeaderTitle((String) view.getTag(R.id.idaux3));
        getMenuInflater().inflate(R.menu.m1_privado, contextMenu);
    }

    public boolean onContextItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == R.id.eliminar) {
            final AlertDialog create = new Builder(this).setNegativeButton(R.string.no, null).setPositiveButton(R.string.si, new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialogInterface, int i) {
                    new C6157b((String) privados.this.f19978p.getTag(R.id.idaux1), 1, privados.this.f19972j, privados.this.f19974l).execute(new String[0]);
                }
            }).setMessage(R.string.confirmar_bloquearprivado).create();
            if (!this.f19975m.equals("")) {
                create.setOnShowListener(new OnShowListener() {
                    public void onShow(DialogInterface dialogInterface) {
                        Button button = create.getButton(-1);
                        StringBuilder sb = new StringBuilder();
                        sb.append("#");
                        sb.append(privados.this.f19975m);
                        button.setTextColor(Color.parseColor(sb.toString()));
                        Button button2 = create.getButton(-2);
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("#");
                        sb2.append(privados.this.f19975m);
                        button2.setTextColor(Color.parseColor(sb2.toString()));
                    }
                });
            }
            final AlertDialog create2 = new Builder(this).setNegativeButton(R.string.no, null).setPositiveButton(R.string.si, new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialogInterface, int i) {
                    config.m23852c((Context) privados.this, (String) privados.this.f19978p.getTag(R.id.idaux1));
                    privados.this.m24494g();
                    create.show();
                    try {
                        ((TextView) create.findViewById(16908299)).setTypeface(Typeface.MONOSPACE);
                    } catch (Exception unused) {
                    }
                }
            }).setMessage(R.string.confirmar_elimprivado).create();
            if (!this.f19975m.equals("")) {
                create2.setOnShowListener(new OnShowListener() {
                    public void onShow(DialogInterface dialogInterface) {
                        Button button = create2.getButton(-1);
                        StringBuilder sb = new StringBuilder();
                        sb.append("#");
                        sb.append(privados.this.f19975m);
                        button.setTextColor(Color.parseColor(sb.toString()));
                        Button button2 = create2.getButton(-2);
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("#");
                        sb2.append(privados.this.f19975m);
                        button2.setTextColor(Color.parseColor(sb2.toString()));
                    }
                });
            }
            create2.show();
            try {
                ((TextView) create2.findViewById(16908299)).setTypeface(Typeface.MONOSPACE);
            } catch (Exception unused) {
            }
            return true;
        } else if (itemId != R.id.pedirprivado) {
            return super.onContextItemSelected(menuItem);
        } else {
            config.m23834a((Context) this, (String) this.f19978p.getTag(R.id.idaux1), (String) this.f19978p.getTag(R.id.idaux3));
            Editor edit = getSharedPreferences("accion", 0).edit();
            edit.putString("id_remit", (String) this.f19978p.getTag(R.id.idaux1));
            edit.putString("nombre_remit", (String) this.f19978p.getTag(R.id.idaux3));
            edit.commit();
            Intent intent = new Intent();
            intent.putExtra("abrir_privado", true);
            setResult(-1, intent);
            finish();
            return true;
        }
    }

    public void onResume() {
        super.onResume();
        config.m23860m(this);
        Editor edit = getSharedPreferences("accion", 0).edit();
        edit.putInt("accion", 0);
        edit.commit();
        Editor edit2 = getSharedPreferences("sh", 0).edit();
        edit2.putBoolean("activa", true);
        edit2.commit();
        if (this.f19977o.f18013cx != 0 && this.f19984v != null && this.f19984v.f17768a != null) {
            this.f19984v.f17768a.mo12165a();
        }
    }

    /* renamed from: h */
    private void m24495h() {
        Editor edit = getSharedPreferences("sh", 0).edit();
        edit.putBoolean("activa", false);
        edit.commit();
    }

    public void onPause() {
        if (!(this.f19977o.f18013cx == 0 || this.f19984v == null || this.f19984v.f17768a == null)) {
            this.f19984v.f17768a.mo12167b();
        }
        super.onPause();
        if (isFinishing()) {
            m24495h();
        }
    }

    public void onStop() {
        super.onStop();
        if (this.f19979q && !this.f19968f) {
            finish();
        }
    }

    public void onDestroy() {
        if (!(this.f19977o.f18013cx == 0 || this.f19984v == null || this.f19984v.f17768a == null)) {
            this.f19984v.f17768a.mo12168c();
        }
        if (!(this.f19977o.f18013cx == 0 || this.f19984v == null || this.f19984v.f17769b == null)) {
            this.f19984v.f17769b.destroy();
        }
        if ((this.f19982t && isFinishing()) || config.f17841i) {
            config.m23861n(this);
        }
        super.onDestroy();
    }

    public void onBackPressed() {
        if (!this.f19982t || this.f19980r || !this.f19977o.f18059ea) {
            super.onBackPressed();
            return;
        }
        this.f19980r = true;
        config.m23859l(this);
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ((LinearLayout) findViewById(R.id.ll_princ)).removeViewAt(0);
        mo21827f();
        ((LinearLayout) findViewById(R.id.ll_ad)).removeAllViews();
        if (!(this.f19984v == null || this.f19984v.f17768a == null)) {
            try {
                this.f19984v.f17768a.mo12168c();
            } catch (Exception unused) {
            }
        }
        if (!(this.f19984v == null || this.f19984v.f17769b == null)) {
            try {
                this.f19984v.f17769b.destroy();
            } catch (Exception unused2) {
            }
        }
        this.f19984v = this.f19977o.mo20760a((Context) this, false);
    }

    public void adLoaded(String str) {
        this.f19970h.cancel();
        this.f19964b.showAd();
    }

    public void onAdClosed() {
        if (this.f19967e) {
            abrir_secc(this.f19969g);
        }
    }

    public void adError(String str) {
        this.f19970h.cancel();
        abrir_secc(this.f19969g);
    }

    public void videoEnded() {
        this.f19967e = true;
        config.m23867t(this);
    }

    /* renamed from: z_ */
    public void mo9678z_() {
        this.f19970h.cancel();
        this.f19963a.mo12836a();
    }

    /* renamed from: a */
    public void mo9675a(C3165a aVar) {
        this.f19967e = true;
        config.m23867t(this);
    }

    /* renamed from: A_ */
    public void mo9671A_() {
        if (this.f19967e) {
            abrir_secc(this.f19969g);
        }
    }

    /* renamed from: e */
    public void mo9676e() {
        this.f19967e = false;
    }

    /* renamed from: a */
    public void mo9674a(int i) {
        if (!this.f19977o.mo20775a((Context) this, this.f19964b)) {
            this.f19970h.cancel();
            abrir_secc(this.f19969g);
        }
    }

    public void onError(C1514Ad ad, AdError adError) {
        this.f19970h.cancel();
        abrir_secc(this.f19969g);
    }

    public void onAdLoaded(C1514Ad ad) {
        this.f19970h.cancel();
        this.f19965c.show();
    }

    public void onRewardedVideoCompleted() {
        this.f19967e = true;
        config.m23867t(this);
    }

    public void onRewardedVideoClosed() {
        if (this.f19967e) {
            abrir_secc(this.f19969g);
        }
    }

    public void onVideoCompleted() {
        this.f19967e = true;
        config.m23867t(this);
    }

    public void onReceiveAd(C5286Ad ad) {
        this.f19970h.cancel();
        this.f19966d.showAd("REWARDED VIDEO", new AdDisplayListener() {
            public void adClicked(C5286Ad ad) {
            }

            public void adDisplayed(C5286Ad ad) {
            }

            public void adNotDisplayed(C5286Ad ad) {
            }

            public void adHidden(C5286Ad ad) {
                if (privados.this.f19967e) {
                    privados.this.abrir_secc(privados.this.f19969g);
                }
            }
        });
    }

    public void onFailedToReceiveAd(C5286Ad ad) {
        this.f19970h.cancel();
        abrir_secc(this.f19969g);
    }
}
