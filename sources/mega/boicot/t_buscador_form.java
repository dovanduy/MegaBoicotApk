package mega.boicot;

import android.app.DatePickerDialog;
import android.app.DatePickerDialog.OnDateSetListener;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.app.SearchManager;
import android.app.SearchManager.OnCancelListener;
import android.app.SearchManager.OnDismissListener;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Color;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.GradientDrawable.Orientation;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.p017v4.app.C0250e;
import android.support.p017v4.app.FragmentActivity;
import android.text.Html;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TableLayout;
import android.widget.TextView;
import android.widget.ToggleButton;
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
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class t_buscador_form extends FragmentActivity implements OnClickListener, OnAdClosed, OnAdError, OnAdLoaded, OnVideoEnded, RewardedVideoAdListener, C3167c, VideoListener, AdEventListener, C5599a {

    /* renamed from: G */
    static TextView f18559G;

    /* renamed from: H */
    static TableLayout f18560H;

    /* renamed from: I */
    static ImageView f18561I;

    /* renamed from: p */
    static int f18562p;

    /* renamed from: q */
    static int f18563q;

    /* renamed from: r */
    static int f18564r;

    /* renamed from: A */
    StartAppAd f18565A;

    /* renamed from: B */
    boolean f18566B = false;

    /* renamed from: C */
    boolean f18567C = false;

    /* renamed from: D */
    View f18568D;

    /* renamed from: E */
    ProgressDialog f18569E;

    /* renamed from: F */
    ListView f18570F;

    /* renamed from: k */
    config f18571k;

    /* renamed from: l */
    boolean f18572l = false;

    /* renamed from: m */
    boolean f18573m = false;

    /* renamed from: n */
    boolean f18574n;

    /* renamed from: o */
    String f18575o;

    /* renamed from: s */
    int f18576s = 0;

    /* renamed from: t */
    int[] f18577t;

    /* renamed from: u */
    int[] f18578u;

    /* renamed from: v */
    Bundle f18579v;

    /* renamed from: w */
    C5602c f18580w;

    /* renamed from: x */
    C3166b f18581x;

    /* renamed from: y */
    RewardedVideo f18582y;

    /* renamed from: z */
    RewardedVideoAd f18583z;

    /* renamed from: mega.boicot.t_buscador_form$a */
    public static class C5744a extends C0250e implements OnDateSetListener {
        /* renamed from: c */
        public Dialog mo831c(Bundle bundle) {
            int i;
            int i2;
            int i3;
            Calendar instance = Calendar.getInstance();
            if (t_buscador_form.f18562p == 0) {
                i = instance.get(1);
                i2 = instance.get(2);
                i3 = instance.get(5);
            } else {
                i = t_buscador_form.f18564r;
                i2 = t_buscador_form.f18563q;
                i3 = t_buscador_form.f18562p;
            }
            DatePickerDialog datePickerDialog = new DatePickerDialog(mo626m(), this, i, i2, i3);
            return datePickerDialog;
        }

        public void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
            Date date;
            t_buscador_form.f18562p = i3;
            t_buscador_form.f18563q = i2;
            t_buscador_form.f18564r = i;
            boolean z = true;
            try {
                DateFormat dateInstance = DateFormat.getDateInstance(3, Locale.US);
                StringBuilder sb = new StringBuilder();
                sb.append(t_buscador_form.f18563q + 1);
                sb.append("/");
                sb.append(t_buscador_form.f18562p);
                sb.append("/");
                sb.append(t_buscador_form.f18564r);
                date = dateInstance.parse(sb.toString());
            } catch (Exception unused) {
                date = null;
                z = false;
            }
            t_buscador_form.f18559G.setText(z ? DateFormat.getDateInstance().format(date) : "");
            t_buscador_form.f18560H.setVisibility(0);
            t_buscador_form.f18561I.setVisibility(0);
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
        int i;
        int i2;
        Bundle bundle2 = bundle;
        this.f18571k = (config) getApplicationContext();
        if (this.f18571k.f17881aN == null) {
            this.f18571k.mo20780b();
        }
        this.f18579v = getIntent().getExtras();
        int i3 = 1;
        if (bundle2 == null) {
            this.f18574n = this.f18579v != null && this.f18579v.containsKey("es_root") && this.f18579v.getBoolean("es_root", false);
        } else {
            this.f18574n = bundle2.containsKey("es_root") && bundle2.getBoolean("es_root", false);
        }
        this.f18575o = config.m23831a(this.f18571k.f17951bf, this.f18571k.f17954bi);
        if (VERSION.SDK_INT > 12) {
            StringBuilder sb = new StringBuilder();
            sb.append("#");
            sb.append(this.f18571k.f17951bf);
            if (!config.m23844a(sb.toString())) {
                setTheme(R.style.holonolight);
            }
        }
        super.onCreate(bundle);
        setContentView(R.layout.t_buscador_form);
        mo2636h();
        if (this.f18571k.f18080q > 0) {
            SearchManager searchManager = (SearchManager) getSystemService("search");
            searchManager.setOnCancelListener(new OnCancelListener() {
                public void onCancel() {
                    t_buscador_form.this.f18572l = false;
                    t_buscador_form.this.setResult(0);
                }
            });
            searchManager.setOnDismissListener(new OnDismissListener() {
                public void onDismiss() {
                    t_buscador_form.this.f18567C = false;
                }
            });
        }
        this.f18571k.mo20770a((Context) this, this.f18579v != null && this.f18579v.containsKey("ad_entrar"), this.f18579v != null && this.f18579v.containsKey("fb_entrar"));
        this.f18580w = this.f18571k.mo20760a((Context) this, false);
        this.f18571k.mo20767a((Context) this, this.f18571k.f18075l, this.f18575o, bundle2);
        getWindow().setSoftInputMode(2);
        f18559G = (TextView) findViewById(R.id.c_busc_antiguedad);
        f18560H = (TableLayout) findViewById(R.id.tl_busc_antiguedad);
        f18561I = (ImageView) findViewById(R.id.iv_antiguedad_limpiar);
        if (!this.f18571k.f17868aA.equals("")) {
            ((TextView) findViewById(R.id.tv_tit)).setText(this.f18571k.f17868aA);
        }
        if (!this.f18571k.f17956bk.equals("")) {
            TextView textView = (TextView) findViewById(R.id.tv_tit);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("#");
            sb2.append(this.f18571k.f17956bk);
            textView.setTextColor(Color.parseColor(sb2.toString()));
        }
        if (!this.f18571k.f17957bl.equals("")) {
            View findViewById = findViewById(R.id.v_sep);
            StringBuilder sb3 = new StringBuilder();
            sb3.append("#");
            sb3.append(this.f18571k.f17957bl);
            findViewById.setBackgroundColor(Color.parseColor(sb3.toString()));
        }
        if (!this.f18571k.f17958bm.equals("")) {
            Drawable drawable = getResources().getDrawable(R.drawable.search_white);
            StringBuilder sb4 = new StringBuilder();
            sb4.append("#");
            sb4.append(this.f18571k.f17958bm);
            drawable.setColorFilter(Color.parseColor(sb4.toString()), Mode.MULTIPLY);
            ((ImageView) findViewById(R.id.iv_search)).setImageDrawable(drawable);
        }
        if (!this.f18571k.f17953bh.equals("")) {
            StringBuilder sb5 = new StringBuilder();
            sb5.append("#");
            sb5.append(this.f18571k.f17953bh);
            int parseColor = Color.parseColor(sb5.toString());
            ((TextView) findViewById(R.id.tv_busc_texto)).setTextColor(parseColor);
            ((TextView) findViewById(R.id.tv_busc_cat)).setTextColor(parseColor);
            ((TextView) findViewById(R.id.c_busc_cat)).setTextColor(parseColor);
            ((TextView) findViewById(R.id.tv_busc_precio)).setTextColor(parseColor);
            ((TextView) findViewById(R.id.tv_busc_antiguedad)).setTextColor(parseColor);
            ((TextView) findViewById(R.id.c_busc_antiguedad)).setTextColor(parseColor);
            ((TextView) findViewById(R.id.tv_busc_orden)).setTextColor(parseColor);
            ((TextView) findViewById(R.id.busc_divisa)).setTextColor(parseColor);
            if (VERSION.SDK_INT > 20) {
                EditText editText = (EditText) findViewById(R.id.c_busc_texto);
                StringBuilder sb6 = new StringBuilder();
                sb6.append("#");
                sb6.append(this.f18571k.f17953bh);
                config.m23837a(editText, Boolean.valueOf(config.m23844a(sb6.toString())), this.f18571k.f17955bj);
                EditText editText2 = (EditText) findViewById(R.id.c_busc_precio);
                StringBuilder sb7 = new StringBuilder();
                sb7.append("#");
                sb7.append(this.f18571k.f17953bh);
                config.m23837a(editText2, Boolean.valueOf(config.m23844a(sb7.toString())), this.f18571k.f17955bj);
            }
        }
        if (this.f18571k.f17908ao) {
            findViewById(R.id.tr_texto).setVisibility(0);
        }
        if (this.f18571k.f17909ap) {
            SQLiteDatabase readableDatabase = new C5665k(getApplicationContext()).getReadableDatabase();
            Cursor rawQuery = readableDatabase.rawQuery("SELECT _id FROM cats WHERE idcat>0 LIMIT 1", null);
            if (rawQuery.moveToFirst()) {
                findViewById(R.id.c_busc_cat).setVisibility(0);
                ImageView imageView = (ImageView) findViewById(R.id.iv_cat);
                Drawable drawable2 = getResources().getDrawable(R.drawable.tree);
                StringBuilder sb8 = new StringBuilder();
                sb8.append("#");
                sb8.append(this.f18571k.f17954bi);
                drawable2.setColorFilter(Color.parseColor(sb8.toString()), Mode.MULTIPLY);
                imageView.setImageDrawable(drawable2);
                imageView.setOnClickListener(this);
                imageView.setVisibility(0);
                ImageView imageView2 = (ImageView) findViewById(R.id.iv_cat_limpiar);
                Drawable drawable3 = getResources().getDrawable(R.drawable.reload);
                StringBuilder sb9 = new StringBuilder();
                sb9.append("#");
                sb9.append(this.f18571k.f17955bj);
                drawable3.setColorFilter(Color.parseColor(sb9.toString()), Mode.MULTIPLY);
                imageView2.setImageDrawable(drawable3);
                imageView2.setOnClickListener(this);
                findViewById(R.id.tl_busc_cat).setOnClickListener(this);
            } else {
                Spinner spinner = (Spinner) findViewById(R.id.sp_busc_cat);
                rawQuery = readableDatabase.rawQuery("SELECT * FROM cats ORDER BY descr", null);
                if (rawQuery.moveToFirst()) {
                    CharSequence[] charSequenceArr = new CharSequence[(rawQuery.getCount() + 1)];
                    charSequenceArr[0] = getResources().getString(R.string.todo);
                    this.f18577t = new int[(rawQuery.getCount() + 1)];
                    this.f18577t[0] = 0;
                    while (!rawQuery.isAfterLast()) {
                        charSequenceArr[rawQuery.getPosition() + i3] = rawQuery.getString(rawQuery.getColumnIndex("descr"));
                        this.f18577t[rawQuery.getPosition() + i3] = rawQuery.getInt(rawQuery.getColumnIndex("_id"));
                        rawQuery.moveToNext();
                        i3 = 1;
                    }
                    ArrayAdapter arrayAdapter = new ArrayAdapter(this, 17367048, new ArrayList(Arrays.asList(charSequenceArr)));
                    arrayAdapter.setDropDownViewResource(17367049);
                    spinner.setAdapter(arrayAdapter);
                    spinner.setVisibility(0);
                    findViewById(R.id.iv_cat).setVisibility(8);
                }
            }
            rawQuery.close();
            readableDatabase.close();
            findViewById(R.id.tr_cat).setVisibility(0);
        }
        if (this.f18571k.f17910aq) {
            ((TextView) findViewById(R.id.busc_divisa)).setText(Html.fromHtml(this.f18571k.f17919az));
            findViewById(R.id.tr_precio).setVisibility(0);
        }
        if (this.f18571k.f17911ar) {
            ImageView imageView3 = (ImageView) findViewById(R.id.iv_antiguedad);
            Drawable drawable4 = getResources().getDrawable(R.drawable.calendar);
            StringBuilder sb10 = new StringBuilder();
            sb10.append("#");
            sb10.append(this.f18571k.f17954bi);
            drawable4.setColorFilter(Color.parseColor(sb10.toString()), Mode.MULTIPLY);
            imageView3.setImageDrawable(drawable4);
            imageView3.setOnClickListener(this);
            ImageView imageView4 = (ImageView) findViewById(R.id.iv_antiguedad_limpiar);
            Drawable drawable5 = getResources().getDrawable(R.drawable.reload);
            StringBuilder sb11 = new StringBuilder();
            sb11.append("#");
            sb11.append(this.f18571k.f17955bj);
            drawable5.setColorFilter(Color.parseColor(sb11.toString()), Mode.MULTIPLY);
            imageView4.setImageDrawable(drawable5);
            imageView4.setOnClickListener(this);
            findViewById(R.id.tl_busc_antiguedad).setOnClickListener(this);
            findViewById(R.id.tr_antiguedad).setVisibility(0);
        }
        if (this.f18571k.f17912as || this.f18571k.f17913at || this.f18571k.f17914au) {
            Spinner spinner2 = (Spinner) findViewById(R.id.c_busc_orden);
            int i4 = this.f18571k.f17912as ? 1 : 0;
            if (this.f18571k.f17913at) {
                i4++;
            }
            if (this.f18571k.f17914au) {
                i4++;
            }
            CharSequence[] charSequenceArr2 = new CharSequence[i4];
            this.f18578u = new int[i4];
            if (this.f18571k.f17912as) {
                charSequenceArr2[0] = getString(R.string.titulo);
                this.f18578u[0] = 1;
                int indexOf = this.f18571k.f17918ay.indexOf("TITULO");
                i = 1;
            } else {
                i = 0;
            }
            if (this.f18571k.f17913at) {
                charSequenceArr2[i] = getString(R.string.precio);
                this.f18578u[i] = 2;
                i2 = this.f18571k.f17918ay.indexOf("PRECIO") != -1 ? i : 0;
                i++;
            } else {
                i2 = 0;
            }
            if (this.f18571k.f17914au) {
                charSequenceArr2[i] = getString(R.string.antiguedad);
                this.f18578u[i] = 3;
                if (this.f18571k.f17918ay.indexOf("FANTIGUEDAD") != -1) {
                    i2 = i;
                }
            }
            ArrayAdapter arrayAdapter2 = new ArrayAdapter(this, 17367048, new ArrayList(Arrays.asList(charSequenceArr2)));
            arrayAdapter2.setDropDownViewResource(17367049);
            spinner2.setAdapter(arrayAdapter2);
            spinner2.setSelection(i2);
            ((ToggleButton) findViewById(R.id.togglebutton)).setChecked(this.f18571k.f17918ay.contains("ASC"));
            findViewById(R.id.tr_orden).setVisibility(0);
        }
        StringBuilder sb12 = new StringBuilder();
        sb12.append("#");
        sb12.append(this.f18571k.f17955bj);
        if (config.m23844a(sb12.toString())) {
            findViewById(R.id.iv_btn_fondo_n).setVisibility(0);
        } else {
            findViewById(R.id.iv_btn_fondo_b).setVisibility(0);
        }
        Drawable drawable6 = getResources().getDrawable(R.drawable.buscar_btn);
        StringBuilder sb13 = new StringBuilder();
        sb13.append("#");
        sb13.append(this.f18571k.f17955bj);
        drawable6.setColorFilter(Color.parseColor(sb13.toString()), Mode.MULTIPLY);
        ImageView imageView5 = (ImageView) findViewById(R.id.button1);
        imageView5.setImageDrawable(drawable6);
        imageView5.setOnClickListener(this);
        if (!this.f18571k.f17951bf.equals("") && !this.f18571k.f17952bg.equals("")) {
            Orientation orientation = Orientation.TOP_BOTTOM;
            StringBuilder sb14 = new StringBuilder();
            sb14.append("#");
            sb14.append(this.f18571k.f17951bf);
            StringBuilder sb15 = new StringBuilder();
            sb15.append("#");
            sb15.append(this.f18571k.f17952bg);
            findViewById(R.id.ll_princ).setBackgroundDrawable(new GradientDrawable(orientation, new int[]{Color.parseColor(sb14.toString()), Color.parseColor(sb15.toString())}));
        }
    }

    public void onClick(View view) {
        int i = 1;
        if (view.getId() == R.id.button1) {
            Intent intent = new Intent(this, t_buscador.class);
            if (this.f18571k.f17908ao) {
                intent.putExtra("texto", ((EditText) findViewById(R.id.c_busc_texto)).getText().toString());
            }
            if (this.f18571k.f17909ap) {
                Spinner spinner = (Spinner) findViewById(R.id.sp_busc_cat);
                if (spinner.getVisibility() == 0) {
                    intent.putExtra("idcat", this.f18577t[spinner.getSelectedItemPosition()]);
                } else {
                    intent.putExtra("idcat", this.f18576s);
                }
            }
            if (this.f18571k.f17910aq) {
                intent.putExtra("precio", ((EditText) findViewById(R.id.c_busc_precio)).getText().toString());
            }
            if (this.f18571k.f17911ar) {
                intent.putExtra("dia", f18562p);
                intent.putExtra("mes", f18563q + 1);
                intent.putExtra("anyo", f18564r);
            }
            if (this.f18571k.f17912as || this.f18571k.f17913at || this.f18571k.f17914au) {
                intent.putExtra("orden", this.f18578u[((Spinner) findViewById(R.id.c_busc_orden)).getSelectedItemPosition()]);
                intent.putExtra("orden_tipo", ((ToggleButton) findViewById(R.id.togglebutton)).isChecked());
            } else {
                if (this.f18571k.f17918ay.indexOf("TITULO") == -1) {
                    i = this.f18571k.f17918ay.indexOf("PRECIO") != -1 ? 2 : 3;
                }
                intent.putExtra("orden", i);
                intent.putExtra("orden_tipo", this.f18571k.f17918ay.contains("ASC"));
            }
            startActivityForResult(intent, 0);
        } else if (view.getId() == R.id.iv_cat || view.getId() == R.id.tl_busc_cat) {
            startActivityForResult(new Intent(this, cats.class), 0);
        } else if (view.getId() == R.id.iv_cat_limpiar) {
            this.f18576s = 0;
            findViewById(R.id.tl_busc_cat).setVisibility(8);
            ((TextView) findViewById(R.id.c_busc_cat)).setText("");
            ((ImageView) findViewById(R.id.iv_cat_limpiar)).setVisibility(8);
        } else if (view.getId() == R.id.iv_antiguedad || view.getId() == R.id.tl_busc_antiguedad) {
            C5744a aVar = new C5744a();
            aVar.mo829b(true);
            aVar.mo827a(mo670f(), "datePicker");
        } else if (view.getId() == R.id.iv_antiguedad_limpiar) {
            f18562p = 0;
            f18563q = 0;
            f18564r = 0;
            findViewById(R.id.tl_busc_antiguedad).setVisibility(8);
            ((TextView) findViewById(R.id.c_busc_antiguedad)).setText("");
            ((ImageView) findViewById(R.id.iv_antiguedad_limpiar)).setVisibility(8);
        } else if ((this.f18571k.f17986cO == null || this.f18571k.f17986cO.equals("")) && ((this.f18571k.f17985cN == null || this.f18571k.f17985cN.equals("")) && ((this.f18571k.f17988cQ == null || this.f18571k.f17988cQ.equals("")) && (this.f18571k.f17989cR == null || this.f18571k.f17989cR.equals(""))))) {
            abrir_secc(view);
        } else {
            if (this.f18571k.f17986cO != null && !this.f18571k.f17986cO.equals("")) {
                this.f18582y = new RewardedVideo((Context) this, this.f18571k.f17986cO);
            }
            if (this.f18571k.f17985cN != null && !this.f18571k.f17985cN.equals("")) {
                this.f18581x = C2997g.m10716a(this);
            }
            if (this.f18571k.f17988cQ != null && !this.f18571k.f17988cQ.equals("")) {
                this.f18583z = new RewardedVideoAd(this, this.f18571k.f17988cQ);
            }
            if (this.f18571k.f17989cR != null && !this.f18571k.f17989cR.equals("")) {
                this.f18565A = new StartAppAd(this);
            }
            this.f18569E = new ProgressDialog(this);
            this.f18568D = view;
            if (!this.f18571k.mo20774a((Context) this, view, this.f18575o, this.f18569E, this.f18581x, this.f18582y, this.f18583z, this.f18565A)) {
                abrir_secc(view);
            }
        }
    }

    public void abrir_secc(View view) {
        C5662h a = this.f18571k.mo20761a(view, (Context) this);
        if (a.f18227b) {
            this.f18572l = true;
            Intent intent = new Intent();
            intent.putExtra("finalizar", true);
            intent.putExtra("finalizar_app", a.f18228c);
            setResult(-1, intent);
        }
        if (a.f18229d) {
            startActivityForResult(a.f18226a, 0);
        } else if (a.f18226a != null) {
            if (a.f18227b && this.f18571k.f18045dm != 2) {
                a.f18226a.putExtra("es_root", true);
            }
            this.f18574n = false;
            startActivity(a.f18226a);
        }
        if (this.f18572l && !this.f18567C) {
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i2 != -1) {
            return;
        }
        if (intent != null && intent.hasExtra("idcat")) {
            Bundle extras = intent.getExtras();
            this.f18576s = extras.getInt("idcat", 0);
            ((TextView) findViewById(R.id.c_busc_cat)).setText(extras.getString("cat"));
            findViewById(R.id.tl_busc_cat).setVisibility(0);
            ((ImageView) findViewById(R.id.iv_cat_limpiar)).setVisibility(0);
        } else if (intent != null && intent.hasExtra("finalizar") && intent.getExtras().getBoolean("finalizar")) {
            if (!intent.getExtras().getBoolean("finalizar_app")) {
                this.f18574n = false;
            }
            setResult(-1, intent);
            finish();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public void mo2636h() {
        int b = this.f18571k.mo20778b((Context) this);
        if (this.f18571k.f18045dm == 1) {
            this.f18570F = (ListView) findViewById(R.id.left_drawer);
            this.f18571k.mo20771a(this.f18570F);
        } else if (this.f18571k.f18045dm == 0) {
            int i = 0;
            for (int i2 = 0; i2 < this.f18571k.f17971bz.length; i2++) {
                if (!this.f18571k.f17971bz[i2].f18333z) {
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
        for (int i3 = 0; i3 < this.f18571k.f17923bD.length; i3++) {
            if (this.f18571k.f17923bD[i3] > 0) {
                findViewById(this.f18571k.f17923bD[i3]).setOnClickListener(this);
            }
        }
    }

    public boolean onSearchRequested() {
        if (this.f18571k.f18080q == 0) {
            return false;
        }
        this.f18572l = true;
        this.f18567C = true;
        return super.onSearchRequested();
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getWindow().setFormat(1);
    }

    public void onStop() {
        super.onStop();
        if (this.f18572l && !this.f18567C) {
            finish();
        }
    }

    public void onPause() {
        if (!(this.f18571k.f18013cx == 0 || this.f18580w == null || this.f18580w.f17768a == null)) {
            this.f18580w.f17768a.mo12167b();
        }
        super.onPause();
    }

    public void onResume() {
        super.onResume();
        config.m23860m(this);
        if (this.f18571k.f18013cx != 0 && this.f18580w != null && this.f18580w.f17768a != null) {
            this.f18580w.f17768a.mo12165a();
        }
    }

    public void onDestroy() {
        if (!(this.f18571k.f18013cx == 0 || this.f18580w == null || this.f18580w.f17768a == null)) {
            this.f18580w.f17768a.mo12168c();
        }
        if (!(this.f18571k.f18013cx == 0 || this.f18580w == null || this.f18580w.f17769b == null)) {
            this.f18580w.f17769b.destroy();
        }
        if ((this.f18574n && isFinishing()) || config.f17841i) {
            config.m23861n(this);
        }
        super.onDestroy();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ((LinearLayout) findViewById(R.id.ll_princ)).removeViewAt(0);
        mo2636h();
        ((LinearLayout) findViewById(R.id.ll_ad)).removeAllViews();
        if (!(this.f18580w == null || this.f18580w.f17768a == null)) {
            try {
                this.f18580w.f17768a.mo12168c();
            } catch (Exception unused) {
            }
        }
        if (!(this.f18580w == null || this.f18580w.f17769b == null)) {
            try {
                this.f18580w.f17769b.destroy();
            } catch (Exception unused2) {
            }
        }
        this.f18580w = this.f18571k.mo20760a((Context) this, false);
    }

    public void onBackPressed() {
        if (!this.f18574n || this.f18573m || !this.f18571k.f18059ea) {
            super.onBackPressed();
            return;
        }
        this.f18573m = true;
        config.m23859l(this);
    }

    public void adLoaded(String str) {
        this.f18569E.cancel();
        this.f18582y.showAd();
    }

    public void onAdClosed() {
        if (this.f18566B) {
            abrir_secc(this.f18568D);
        }
    }

    public void adError(String str) {
        this.f18569E.cancel();
        abrir_secc(this.f18568D);
    }

    public void videoEnded() {
        this.f18566B = true;
        config.m23867t(this);
    }

    /* renamed from: z_ */
    public void mo9678z_() {
        this.f18569E.cancel();
        this.f18581x.mo12836a();
    }

    /* renamed from: a */
    public void mo9675a(C3165a aVar) {
        this.f18566B = true;
        config.m23867t(this);
    }

    /* renamed from: A_ */
    public void mo9671A_() {
        if (this.f18566B) {
            abrir_secc(this.f18568D);
        }
    }

    /* renamed from: e */
    public void mo9676e() {
        this.f18566B = false;
    }

    /* renamed from: a */
    public void mo9674a(int i) {
        if (!this.f18571k.mo20775a((Context) this, this.f18582y)) {
            this.f18569E.cancel();
            abrir_secc(this.f18568D);
        }
    }

    public void onError(C1514Ad ad, AdError adError) {
        this.f18569E.cancel();
        abrir_secc(this.f18568D);
    }

    public void onAdLoaded(C1514Ad ad) {
        this.f18569E.cancel();
        this.f18583z.show();
    }

    public void onRewardedVideoCompleted() {
        this.f18566B = true;
        config.m23867t(this);
    }

    public void onRewardedVideoClosed() {
        if (this.f18566B) {
            abrir_secc(this.f18568D);
        }
    }

    public void onVideoCompleted() {
        this.f18566B = true;
        config.m23867t(this);
    }

    public void onReceiveAd(C5286Ad ad) {
        this.f18569E.cancel();
        this.f18565A.showAd("REWARDED VIDEO", new AdDisplayListener() {
            public void adClicked(C5286Ad ad) {
            }

            public void adDisplayed(C5286Ad ad) {
            }

            public void adNotDisplayed(C5286Ad ad) {
            }

            public void adHidden(C5286Ad ad) {
                if (t_buscador_form.this.f18566B) {
                    t_buscador_form.this.abrir_secc(t_buscador_form.this.f18568D);
                }
            }
        });
    }

    public void onFailedToReceiveAd(C5286Ad ad) {
        this.f18569E.cancel();
        abrir_secc(this.f18568D);
    }
}
