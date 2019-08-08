package mega.boicot;

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
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.GradientDrawable.Orientation;
import android.os.AsyncTask;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.ProgressBar;
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
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import org.apache.p199a.p202b.C6279d;
import org.apache.p199a.p202b.p203a.C6268a;
import org.apache.p199a.p202b.p204b.C6274e;
import org.apache.p199a.p218f.p220b.C6409h;
import org.apache.p199a.p226h.C6517l;

public class t_chat_contra extends Activity implements OnClickListener, OnAdClosed, OnAdError, OnAdLoaded, OnVideoEnded, RewardedVideoAdListener, C3167c, VideoListener, AdEventListener, C5599a {

    /* renamed from: A */
    CheckBox f18999A;

    /* renamed from: B */
    Builder f19000B;

    /* renamed from: C */
    String f19001C;

    /* renamed from: D */
    EditText f19002D;
    /* access modifiers changed from: private */

    /* renamed from: E */
    public ProgressDialog f19003E;

    /* renamed from: a */
    config f19004a;

    /* renamed from: b */
    Bundle f19005b;

    /* renamed from: c */
    boolean f19006c = false;

    /* renamed from: d */
    boolean f19007d = false;

    /* renamed from: e */
    boolean f19008e = false;

    /* renamed from: f */
    boolean f19009f;

    /* renamed from: g */
    boolean f19010g;

    /* renamed from: h */
    boolean f19011h = false;

    /* renamed from: i */
    String f19012i;

    /* renamed from: j */
    String f19013j;

    /* renamed from: k */
    String f19014k;

    /* renamed from: l */
    boolean f19015l;

    /* renamed from: m */
    C5602c f19016m;

    /* renamed from: n */
    C3166b f19017n;

    /* renamed from: o */
    RewardedVideo f19018o;

    /* renamed from: p */
    RewardedVideoAd f19019p;

    /* renamed from: q */
    StartAppAd f19020q;

    /* renamed from: r */
    boolean f19021r = false;

    /* renamed from: s */
    boolean f19022s = false;

    /* renamed from: t */
    View f19023t;

    /* renamed from: u */
    ProgressDialog f19024u;

    /* renamed from: v */
    ListView f19025v;

    /* renamed from: w */
    SharedPreferences f19026w;

    /* renamed from: x */
    int f19027x;

    /* renamed from: y */
    int f19028y;

    /* renamed from: z */
    int f19029z;

    /* renamed from: mega.boicot.t_chat_contra$a */
    private class C5828a extends AsyncTask<String, Void, Byte> {
        private C5828a() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Byte doInBackground(String... strArr) {
            C6409h hVar = new C6409h();
            StringBuilder sb = new StringBuilder();
            sb.append("http://");
            sb.append(config.f17839g);
            sb.append("/srv/comprobar_contra.php?v=1&idapp=");
            sb.append(718963);
            sb.append("&idusu=");
            sb.append(t_chat_contra.this.f19029z);
            sb.append("&idchat=");
            sb.append(t_chat_contra.this.f19028y);
            C6274e eVar = new C6274e(sb.toString());
            StringBuilder sb2 = new StringBuilder();
            try {
                ArrayList arrayList = new ArrayList(2);
                arrayList.add(new C6517l("contra", t_chat_contra.this.f19001C));
                eVar.mo22444a(new C6268a(arrayList));
                eVar.mo22909b("User-Agent", "Android Vinebre Software");
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(hVar.mo22459a(eVar).mo22939b().mo22473f()));
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    sb2.append(readLine);
                }
                if (sb2.indexOf("ANDROID:KO") != -1) {
                    return Byte.valueOf(2);
                }
                if (sb2.indexOf("ANDROID:OK") != -1) {
                    return Byte.valueOf(1);
                }
                return Byte.valueOf(0);
            } catch (C6279d unused) {
                return Byte.valueOf(0);
            } catch (IOException unused2) {
                return Byte.valueOf(0);
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void onPostExecute(Byte b) {
            try {
                t_chat_contra.this.f19003E.dismiss();
            } catch (Exception unused) {
            }
            if (b.byteValue() == 1) {
                SharedPreferences sharedPreferences = t_chat_contra.this.f19026w;
                StringBuilder sb = new StringBuilder();
                sb.append("chat");
                sb.append(t_chat_contra.this.f19028y);
                sb.append("_nomostrarmas_def");
                if (sharedPreferences.getBoolean(sb.toString(), true)) {
                    Editor edit = t_chat_contra.this.f19026w.edit();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("chat");
                    sb2.append(t_chat_contra.this.f19028y);
                    sb2.append("_validado");
                    edit.putBoolean(sb2.toString(), true);
                    edit.commit();
                }
                t_chat_contra.this.mo21197g();
            } else if (b.byteValue() == 2) {
                t_chat_contra.this.f19008e = true;
                t_chat_contra.this.mo21196f();
            } else {
                t_chat_contra.this.mo21195b(1);
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
        if (bundle != null) {
            this.f19007d = bundle.getBoolean("finalizar_2", false);
        }
        this.f19004a = (config) getApplicationContext();
        if (this.f19004a.f17881aN == null) {
            this.f19004a.mo20780b();
        }
        this.f19005b = getIntent().getExtras();
        if (bundle == null) {
            this.f19010g = this.f19005b != null && this.f19005b.containsKey("es_root") && this.f19005b.getBoolean("es_root", false);
        } else {
            this.f19010g = bundle.containsKey("es_root") && bundle.getBoolean("es_root", false);
        }
        this.f19009f = this.f19005b != null && this.f19005b.containsKey("externo");
        if (this.f19009f) {
            this.f19012i = this.f19005b.getString("c1");
            this.f19013j = this.f19005b.getString("c2");
        } else {
            this.f19027x = this.f19005b.getInt("ind");
            this.f19012i = this.f19004a.f17971bz[this.f19027x].f18314g;
            this.f19013j = this.f19004a.f17971bz[this.f19027x].f18315h;
            this.f19028y = this.f19004a.f17971bz[this.f19027x].f18330w;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("#");
        sb.append(this.f19012i);
        this.f19015l = config.m23844a(sb.toString());
        this.f19014k = config.m23831a(this.f19012i, this.f19004a.f17890aW);
        if (VERSION.SDK_INT > 12 && !this.f19015l) {
            setTheme(R.style.holonolight);
        }
        super.onCreate(bundle);
        setContentView(R.layout.t_chat_contra);
        mo21198h();
        if (this.f19004a.f18080q > 0) {
            SearchManager searchManager = (SearchManager) getSystemService("search");
            searchManager.setOnCancelListener(new OnCancelListener() {
                public void onCancel() {
                    t_chat_contra.this.f19006c = false;
                    t_chat_contra.this.setResult(0);
                }
            });
            searchManager.setOnDismissListener(new OnDismissListener() {
                public void onDismiss() {
                    t_chat_contra.this.f19022s = false;
                }
            });
        }
        this.f19016m = this.f19004a.mo20760a((Context) this, false);
        this.f19026w = getSharedPreferences("sh", 0);
        this.f19029z = this.f19026w.getInt("idusu", 0);
        if (!this.f19012i.equals("")) {
            Orientation orientation = Orientation.TOP_BOTTOM;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("#");
            sb2.append(this.f19012i);
            StringBuilder sb3 = new StringBuilder();
            sb3.append("#");
            sb3.append(this.f19013j);
            findViewById(R.id.ll_princ).setBackgroundDrawable(new GradientDrawable(orientation, new int[]{Color.parseColor(sb2.toString()), Color.parseColor(sb3.toString())}));
            StringBuilder sb4 = new StringBuilder();
            sb4.append("#");
            sb4.append(this.f19012i);
            if (config.m23844a(sb4.toString())) {
                ((TextView) findViewById(R.id.message_text)).setTextColor(-16777216);
            } else {
                ((TextView) findViewById(R.id.message_text)).setTextColor(-1);
            }
        }
        if (!this.f19009f) {
            SharedPreferences sharedPreferences = this.f19026w;
            StringBuilder sb5 = new StringBuilder();
            sb5.append("chat");
            sb5.append(this.f19028y);
            sb5.append("_validado");
            if (!sharedPreferences.getBoolean(sb5.toString(), true)) {
                mo21196f();
                return;
            }
        }
        if (bundle == null) {
            mo21197g();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public void mo21196f() {
        this.f19000B = new Builder(this);
        this.f19000B.setTitle(getResources().getString(R.string.chat_acceso));
        View inflate = getLayoutInflater().inflate(R.layout.contra, null);
        ((TextView) inflate.findViewById(R.id.message)).setText(getResources().getString(R.string.chat_introduce_contra));
        this.f19002D = (EditText) inflate.findViewById(R.id.et_contra);
        if (this.f19008e) {
            inflate.findViewById(R.id.message_error).setVisibility(0);
        }
        this.f18999A = (CheckBox) inflate.findViewById(R.id.skip);
        if (!this.f19014k.equals("")) {
            EditText editText = this.f19002D;
            StringBuilder sb = new StringBuilder();
            sb.append("#");
            sb.append(this.f19012i);
            config.m23837a(editText, Boolean.valueOf(!config.m23844a(sb.toString())), this.f19014k);
            config.m23836a(this.f18999A, this.f19014k);
        }
        CheckBox checkBox = this.f18999A;
        SharedPreferences sharedPreferences = this.f19026w;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("chat");
        sb2.append(this.f19028y);
        sb2.append("_nomostrarmas_def");
        checkBox.setChecked(sharedPreferences.getBoolean(sb2.toString(), true));
        this.f19000B.setView(inflate);
        this.f19000B.setCancelable(true);
        this.f19000B.setPositiveButton(getString(R.string.aceptar), new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                Editor edit = t_chat_contra.this.f19026w.edit();
                if (t_chat_contra.this.f18999A.isChecked()) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("chat");
                    sb.append(t_chat_contra.this.f19028y);
                    sb.append("_nomostrarmas_def");
                    edit.putBoolean(sb.toString(), true);
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("chat");
                    sb2.append(t_chat_contra.this.f19028y);
                    sb2.append("_nomostrarmas_def");
                    edit.putBoolean(sb2.toString(), false);
                }
                edit.commit();
                t_chat_contra.this.f19003E = new ProgressDialog(t_chat_contra.this);
                t_chat_contra.this.f19003E.setMessage(t_chat_contra.this.getString(R.string.comprobando));
                t_chat_contra.this.f19003E.setIndeterminate(true);
                if (VERSION.SDK_INT > 20) {
                    t_chat_contra.this.f19003E.setOnShowListener(new OnShowListener() {
                        public void onShow(DialogInterface dialogInterface) {
                            config.m23838a((ProgressBar) t_chat_contra.this.f19003E.findViewById(16908301), t_chat_contra.this.f19004a.f17890aW);
                        }
                    });
                }
                t_chat_contra.this.f19003E.show();
                t_chat_contra.this.f19001C = t_chat_contra.this.f19002D.getText().toString();
                new C5828a().execute(new String[0]);
            }
        });
        this.f19000B.setNegativeButton(getString(R.string.cancelar), new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                t_chat_contra.this.mo21195b(0);
            }
        });
        this.f19000B.setOnCancelListener(new DialogInterface.OnCancelListener() {
            public void onCancel(DialogInterface dialogInterface) {
                t_chat_contra.this.mo21195b(0);
            }
        });
        final AlertDialog create = this.f19000B.create();
        if (!this.f19014k.equals("")) {
            create.setOnShowListener(new OnShowListener() {
                public void onShow(DialogInterface dialogInterface) {
                    Button button = create.getButton(-1);
                    StringBuilder sb = new StringBuilder();
                    sb.append("#");
                    sb.append(t_chat_contra.this.f19014k);
                    button.setTextColor(Color.parseColor(sb.toString()));
                    Button button2 = create.getButton(-2);
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("#");
                    sb2.append(t_chat_contra.this.f19014k);
                    button2.setTextColor(Color.parseColor(sb2.toString()));
                }
            });
        }
        create.show();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public void mo21197g() {
        Intent intent;
        if (this.f19005b != null && this.f19005b.containsKey("clase")) {
            Class cls = null;
            int i = this.f19005b.getInt("clase");
            if (i == 1) {
                cls = t_url.class;
            } else if (i == 2) {
                cls = t_html.class;
            } else if (i == 3) {
                cls = t_and.class;
            } else if (i == 4) {
                cls = t_oficinas.class;
            } else if (i == 5) {
                cls = t_buscador.class;
            } else if (i == 6) {
                if (this.f19004a.f17971bz[this.f19027x].f18238I == 0) {
                    cls = t_video.class;
                } else {
                    cls = t_video_exoplayer.class;
                }
            } else if (i == 7) {
                cls = t_radio.class;
            } else if (i == 8) {
                cls = t_rss.class;
            } else if (i == 10) {
                if (this.f19004a.f17971bz[this.f19027x].f18260aD > 0) {
                    cls = t_buscchats_lista.class;
                } else {
                    cls = t_buscchats.class;
                }
            } else if (i == 11) {
                cls = t_buscusus.class;
            } else if (i == 12) {
                cls = t_submenu.class;
            } else if (i == 13) {
                cls = t_gal.class;
            } else if (i == 14) {
                cls = t_card.class;
            } else if (i == 16) {
                cls = t_buscvideos.class;
            }
            if (cls != null) {
                if (i == 4) {
                    intent = this.f19004a.mo20785d((Context) this).f18226a;
                } else if (i == 5) {
                    intent = this.f19004a.mo20782c((Context) this).f18226a;
                } else {
                    Intent intent2 = new Intent(this, cls);
                    intent2.putExtras(this.f19005b);
                    intent = intent2;
                }
                this.f19010g = false;
                this.f19007d = true;
                startActivityForResult(intent, 0);
            }
        } else if (this.f19026w.getString("nick", "").equals("") || (this.f19004a.f18062ed == 3 && !this.f19026w.getBoolean("email_confirmado", false))) {
            Intent intent3 = new Intent(this, chat_perfil.class);
            if (this.f19009f) {
                intent3 = config.m23827a(intent3, this.f19005b);
            } else {
                intent3.putExtra("idsecc", this.f19028y);
            }
            if (this.f19010g) {
                intent3.putExtra("es_root", this.f19010g);
            }
            this.f19010g = false;
            this.f19007d = true;
            startActivityForResult(intent3, 0);
        } else if ((((!this.f19009f || this.f19005b.getInt("fotos_perfil") != 2) && (this.f19009f || this.f19004a.f17971bz[this.f19027x].f18305aw != 2)) || this.f19004a.mo20757a((Context) this, 1).exists()) && ((((!this.f19009f || this.f19005b.getInt("fnac") != 2) && (this.f19009f || this.f19004a.f17971bz[this.f19027x].f18306ax != 2)) || !(this.f19026w.getInt("fnac_d", 0) == 0 || this.f19026w.getInt("fnac_m", 0) == 0 || this.f19026w.getInt("fnac_a", 0) == 0)) && ((((!this.f19009f || this.f19005b.getInt("sexo") != 2) && (this.f19009f || this.f19004a.f17971bz[this.f19027x].f18307ay != 2)) || this.f19026w.getInt("sexo", 0) != 0) && (((!this.f19009f || this.f19005b.getInt("descr") != 2) && (this.f19009f || this.f19004a.f17971bz[this.f19027x].f18308az != 2)) || !this.f19026w.getString("descr", "").equals(""))))) {
            Intent intent4 = new Intent(this, t_chat.class);
            if (this.f19009f) {
                intent4 = config.m23827a(intent4, this.f19005b);
                if (this.f19005b.containsKey("tit_cab")) {
                    intent4.putExtra("tit_cab", this.f19005b.getString("tit_cab"));
                }
            } else {
                intent4.putExtra("idsecc", this.f19028y);
            }
            if (this.f19010g) {
                intent4.putExtra("es_root", this.f19010g);
            }
            this.f19010g = false;
            if (!(this.f19005b == null || this.f19005b.getString("id_remit") == null)) {
                intent4.putExtra("id_remit", this.f19005b.getString("id_remit"));
                intent4.putExtra("nombre_remit", this.f19005b.getString("nombre_remit"));
                if (this.f19005b.containsKey("empezar_privado")) {
                    intent4.putExtra("empezar_privado", true);
                }
            }
            this.f19007d = true;
            startActivityForResult(intent4, 0);
        } else {
            Intent intent5 = new Intent(this, preperfil.class);
            if (this.f19009f) {
                intent5 = config.m23827a(intent5, this.f19005b);
            } else {
                intent5.putExtra("idsecc", this.f19028y);
            }
            if (this.f19010g) {
                intent5.putExtra("es_root", this.f19010g);
            }
            this.f19010g = false;
            this.f19007d = true;
            startActivityForResult(intent5, 0);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo21195b(int i) {
        TextView textView = (TextView) findViewById(R.id.message_text);
        if (i == 0) {
            textView.setText(R.string.chat_contra_necesaria);
        } else if (i == 1) {
            textView.setText(R.string.error_http);
        }
        textView.setVisibility(0);
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        boolean z;
        if (i2 != -1 || intent == null || !intent.hasExtra("finalizar") || !intent.getExtras().getBoolean("finalizar")) {
            z = false;
        } else {
            z = true;
            if (!intent.getExtras().getBoolean("finalizar_app")) {
                this.f19010g = false;
            }
            setResult(-1, intent);
            finish();
        }
        if (!z && this.f19007d) {
            finish();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public void mo21198h() {
        int b = this.f19004a.mo20778b((Context) this);
        if (this.f19004a.f18045dm == 1) {
            this.f19025v = (ListView) findViewById(R.id.left_drawer);
            this.f19004a.mo20771a(this.f19025v);
        } else if (this.f19004a.f18045dm == 0) {
            int i = 0;
            for (int i2 = 0; i2 < this.f19004a.f17971bz.length; i2++) {
                if (!this.f19004a.f17971bz[i2].f18333z) {
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
        for (int i3 = 0; i3 < this.f19004a.f17923bD.length; i3++) {
            if (this.f19004a.f17923bD[i3] > 0) {
                findViewById(this.f19004a.f17923bD[i3]).setOnClickListener(this);
            }
        }
    }

    public void onClick(View view) {
        if ((this.f19004a.f17986cO == null || this.f19004a.f17986cO.equals("")) && ((this.f19004a.f17985cN == null || this.f19004a.f17985cN.equals("")) && ((this.f19004a.f17988cQ == null || this.f19004a.f17988cQ.equals("")) && (this.f19004a.f17989cR == null || this.f19004a.f17989cR.equals(""))))) {
            abrir_secc(view);
            return;
        }
        if (this.f19004a.f17986cO != null && !this.f19004a.f17986cO.equals("")) {
            this.f19018o = new RewardedVideo((Context) this, this.f19004a.f17986cO);
        }
        if (this.f19004a.f17985cN != null && !this.f19004a.f17985cN.equals("")) {
            this.f19017n = C2997g.m10716a(this);
        }
        if (this.f19004a.f17988cQ != null && !this.f19004a.f17988cQ.equals("")) {
            this.f19019p = new RewardedVideoAd(this, this.f19004a.f17988cQ);
        }
        if (this.f19004a.f17989cR != null && !this.f19004a.f17989cR.equals("")) {
            this.f19020q = new StartAppAd(this);
        }
        this.f19024u = new ProgressDialog(this);
        this.f19023t = view;
        if (!this.f19004a.mo20774a((Context) this, view, this.f19014k, this.f19024u, this.f19017n, this.f19018o, this.f19019p, this.f19020q)) {
            abrir_secc(view);
        }
    }

    public void abrir_secc(View view) {
        C5662h a = this.f19004a.mo20761a(view, (Context) this);
        if (a.f18227b) {
            this.f19006c = true;
            Intent intent = new Intent();
            intent.putExtra("finalizar", true);
            intent.putExtra("finalizar_app", a.f18228c);
            setResult(-1, intent);
        }
        if (a.f18229d) {
            startActivityForResult(a.f18226a, 0);
        } else if (a.f18226a != null) {
            if (a.f18227b && this.f19004a.f18045dm != 2) {
                a.f18226a.putExtra("es_root", true);
            }
            this.f19010g = false;
            startActivity(a.f18226a);
        }
        if (this.f19006c && !this.f19022s) {
            finish();
        }
    }

    public boolean onSearchRequested() {
        if (this.f19004a.f18080q == 0) {
            return false;
        }
        this.f19006c = true;
        this.f19022s = true;
        return super.onSearchRequested();
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getWindow().setFormat(1);
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("finalizar_2", this.f19007d);
        bundle.putBoolean("es_root", this.f19010g);
    }

    public void onStop() {
        super.onStop();
        if (this.f19006c && !this.f19022s) {
            finish();
        }
    }

    public void onPause() {
        if (!(this.f19004a.f18013cx == 0 || this.f19016m == null || this.f19016m.f17768a == null)) {
            this.f19016m.f17768a.mo12167b();
        }
        super.onPause();
    }

    public void onResume() {
        super.onResume();
        config.m23860m(this);
        if (this.f19004a.f18013cx != 0 && this.f19016m != null && this.f19016m.f17768a != null) {
            this.f19016m.f17768a.mo12165a();
        }
    }

    public void onDestroy() {
        if (!(this.f19004a.f18013cx == 0 || this.f19016m == null || this.f19016m.f17768a == null)) {
            this.f19016m.f17768a.mo12168c();
        }
        if (!(this.f19004a.f18013cx == 0 || this.f19016m == null || this.f19016m.f17769b == null)) {
            this.f19016m.f17769b.destroy();
        }
        if ((this.f19010g && isFinishing()) || config.f17841i) {
            config.m23861n(this);
        }
        super.onDestroy();
    }

    public void onBackPressed() {
        if (!this.f19010g || this.f19011h || !this.f19004a.f18059ea) {
            super.onBackPressed();
            return;
        }
        this.f19011h = true;
        config.m23859l(this);
    }

    public void adLoaded(String str) {
        this.f19024u.cancel();
        this.f19018o.showAd();
    }

    public void onAdClosed() {
        if (this.f19021r) {
            abrir_secc(this.f19023t);
        }
    }

    public void adError(String str) {
        this.f19024u.cancel();
        abrir_secc(this.f19023t);
    }

    public void videoEnded() {
        this.f19021r = true;
        config.m23867t(this);
    }

    /* renamed from: z_ */
    public void mo9678z_() {
        this.f19024u.cancel();
        this.f19017n.mo12836a();
    }

    /* renamed from: a */
    public void mo9675a(C3165a aVar) {
        this.f19021r = true;
        config.m23867t(this);
    }

    /* renamed from: A_ */
    public void mo9671A_() {
        if (this.f19021r) {
            abrir_secc(this.f19023t);
        }
    }

    /* renamed from: e */
    public void mo9676e() {
        this.f19021r = false;
    }

    /* renamed from: a */
    public void mo9674a(int i) {
        if (!this.f19004a.mo20775a((Context) this, this.f19018o)) {
            this.f19024u.cancel();
            abrir_secc(this.f19023t);
        }
    }

    public void onError(C1514Ad ad, AdError adError) {
        this.f19024u.cancel();
        abrir_secc(this.f19023t);
    }

    public void onAdLoaded(C1514Ad ad) {
        this.f19024u.cancel();
        this.f19019p.show();
    }

    public void onRewardedVideoCompleted() {
        this.f19021r = true;
        config.m23867t(this);
    }

    public void onRewardedVideoClosed() {
        if (this.f19021r) {
            abrir_secc(this.f19023t);
        }
    }

    public void onVideoCompleted() {
        this.f19021r = true;
        config.m23867t(this);
    }

    public void onReceiveAd(C5286Ad ad) {
        this.f19024u.cancel();
        this.f19020q.showAd("REWARDED VIDEO", new AdDisplayListener() {
            public void adClicked(C5286Ad ad) {
            }

            public void adDisplayed(C5286Ad ad) {
            }

            public void adNotDisplayed(C5286Ad ad) {
            }

            public void adHidden(C5286Ad ad) {
                if (t_chat_contra.this.f19021r) {
                    t_chat_contra.this.abrir_secc(t_chat_contra.this.f19023t);
                }
            }
        });
    }

    public void onFailedToReceiveAd(C5286Ad ad) {
        this.f19024u.cancel();
        abrir_secc(this.f19023t);
    }
}
