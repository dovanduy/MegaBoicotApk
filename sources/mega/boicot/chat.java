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
import android.content.SharedPreferences.OnSharedPreferenceChangeListener;
import android.graphics.Color;
import android.graphics.Point;
import android.graphics.PorterDuff.Mode;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.GradientDrawable.Orientation;
import android.os.AsyncTask;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.Display;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnKeyListener;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.ScrollView;
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
import com.google.android.exoplayer2.C2793C;
import com.google.android.exoplayer2.extractor.p132ts.TsExtractor;
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
import java.io.InputStreamReader;
import java.net.URLEncoder;
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

public class chat extends Activity implements OnSharedPreferenceChangeListener, OnClickListener, OnKeyListener, OnAdClosed, OnAdError, OnAdLoaded, OnVideoEnded, RewardedVideoAdListener, C3167c, VideoListener, AdEventListener, C5599a {

    /* renamed from: a */
    boolean f17771a = false;

    /* renamed from: b */
    boolean f17772b = false;

    /* renamed from: c */
    boolean f17773c;

    /* renamed from: d */
    Bundle f17774d;

    /* renamed from: e */
    C5602c f17775e;

    /* renamed from: f */
    C3166b f17776f;

    /* renamed from: g */
    RewardedVideo f17777g;

    /* renamed from: h */
    RewardedVideoAd f17778h;

    /* renamed from: i */
    StartAppAd f17779i;

    /* renamed from: j */
    boolean f17780j = false;

    /* renamed from: k */
    boolean f17781k = false;

    /* renamed from: l */
    View f17782l;

    /* renamed from: m */
    ProgressDialog f17783m;

    /* renamed from: n */
    ListView f17784n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public int f17785o;

    /* renamed from: p */
    private int f17786p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public String f17787q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public String f17788r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public SharedPreferences f17789s;

    /* renamed from: t */
    private config f17790t;

    /* renamed from: mega.boicot.chat$a */
    private class C5611a extends AsyncTask<String, Void, String> {

        /* renamed from: a */
        String f17803a;

        public C5611a(String str) {
            this.f17803a = str;
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
                sb.append("/srv/enviarmensaje.php");
                C6274e eVar = new C6274e(sb.toString());
                C6370g gVar = new C6370g(C6367d.BROWSER_COMPATIBLE);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(chat.this.f17785o);
                sb2.append("");
                gVar.mo22648a("idusu", (C6360c) new C6363f(sb2.toString()));
                gVar.mo22648a("idapp", (C6360c) new C6363f("718963"));
                gVar.mo22648a("nombre", (C6360c) new C6363f(URLEncoder.encode(chat.this.f17789s.getString("nombre", ""), C2793C.UTF8_NAME)));
                gVar.mo22648a("m", (C6360c) new C6363f(URLEncoder.encode(this.f17803a, C2793C.UTF8_NAME)));
                eVar.mo22444a(gVar);
                eVar.mo22909b("User-Agent", "Android Vinebre Software");
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(hVar.mo22459a((C6276g) eVar).mo22939b().mo22473f(), C2793C.UTF8_NAME));
                StringBuilder sb3 = new StringBuilder();
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        return sb3.toString();
                    }
                    sb3.append(readLine);
                }
            } catch (Exception unused) {
                return "ANDROID:KO";
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void onPostExecute(String str) {
            Builder builder = new Builder(chat.this);
            try {
                chat.this.findViewById(R.id.pb_chat_env).setVisibility(8);
                ((EditText) chat.this.findViewById(R.id.c_mensaje)).setTextColor(-16777216);
            } catch (Exception unused) {
            }
            if (str.indexOf("ANDROID:OK") == -1 && str.indexOf("ANDROID:KO") == -1) {
                final AlertDialog create = builder.setCancelable(false).setPositiveButton(chat.this.getString(R.string.aceptar), null).setMessage(R.string.error_http).create();
                if (!chat.this.f17788r.equals("")) {
                    create.setOnShowListener(new OnShowListener() {
                        public void onShow(DialogInterface dialogInterface) {
                            Button button = create.getButton(-1);
                            StringBuilder sb = new StringBuilder();
                            sb.append("#");
                            sb.append(chat.this.f17788r);
                            button.setTextColor(Color.parseColor(sb.toString()));
                        }
                    });
                }
                create.show();
                try {
                    ((TextView) create.findViewById(16908299)).setTypeface(Typeface.MONOSPACE);
                } catch (Exception unused2) {
                }
            } else if (str.indexOf("ANDROID:OK") != -1) {
                ((EditText) chat.this.findViewById(R.id.c_mensaje)).setText("");
                Editor edit = chat.this.f17789s.edit();
                String string = chat.this.f17789s.getString("conv", "");
                StringBuilder sb = new StringBuilder();
                sb.append(string);
                sb.append("@");
                sb.append(chat.this.f17785o);
                sb.append("@");
                sb.append(this.f17803a);
                edit.putString("conv", sb.toString());
                StringBuilder sb2 = new StringBuilder();
                sb2.append(chat.this.f17785o);
                sb2.append("");
                edit.putString("f_id", sb2.toString());
                edit.putString("f_frase", this.f17803a);
                StringBuilder sb3 = new StringBuilder();
                sb3.append(config.f17840h);
                sb3.append("");
                edit.putString("f_idfrase", sb3.toString());
                config.f17840h++;
                edit.commit();
                if (chat.this.f17789s.getBoolean("primer_msg_chat", true)) {
                    edit.putBoolean("primer_msg_chat", false);
                    edit.commit();
                    final AlertDialog create2 = builder.setCancelable(false).setPositiveButton(chat.this.getString(R.string.aceptar), null).setMessage(R.string.primer_msg_chat).create();
                    if (!chat.this.f17788r.equals("")) {
                        create2.setOnShowListener(new OnShowListener() {
                            public void onShow(DialogInterface dialogInterface) {
                                Button button = create2.getButton(-1);
                                StringBuilder sb = new StringBuilder();
                                sb.append("#");
                                sb.append(chat.this.f17788r);
                                button.setTextColor(Color.parseColor(sb.toString()));
                            }
                        });
                    }
                    create2.show();
                    ((TextView) create2.findViewById(16908299)).setTypeface(Typeface.MONOSPACE);
                }
            } else if (str.indexOf("ANDROID:KO MOTIVO:NOGCM") != -1) {
                final AlertDialog create3 = builder.setCancelable(false).setPositiveButton(chat.this.getString(R.string.aceptar), null).setMessage(R.string.nogcm).create();
                if (!chat.this.f17788r.equals("")) {
                    create3.setOnShowListener(new OnShowListener() {
                        public void onShow(DialogInterface dialogInterface) {
                            Button button = create3.getButton(-1);
                            StringBuilder sb = new StringBuilder();
                            sb.append("#");
                            sb.append(chat.this.f17788r);
                            button.setTextColor(Color.parseColor(sb.toString()));
                        }
                    });
                }
                create3.show();
                ((TextView) create3.findViewById(16908299)).setTypeface(Typeface.MONOSPACE);
            } else {
                final AlertDialog create4 = builder.setCancelable(false).setPositiveButton(chat.this.getString(R.string.aceptar), null).setMessage(R.string.error_http).create();
                if (!chat.this.f17788r.equals("")) {
                    create4.setOnShowListener(new OnShowListener() {
                        public void onShow(DialogInterface dialogInterface) {
                            Button button = create4.getButton(-1);
                            StringBuilder sb = new StringBuilder();
                            sb.append("#");
                            sb.append(chat.this.f17788r);
                            button.setTextColor(Color.parseColor(sb.toString()));
                        }
                    });
                }
                create4.show();
                ((TextView) create4.findViewById(16908299)).setTypeface(Typeface.MONOSPACE);
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

    @TargetApi(13)
    public void onCreate(Bundle bundle) {
        int indexOf;
        int i;
        String str;
        this.f17790t = (config) getApplicationContext();
        if (this.f17790t.f17881aN == null) {
            this.f17790t.mo20780b();
        }
        this.f17788r = config.m23831a(this.f17790t.f17888aU, this.f17790t.f17949bd);
        if (VERSION.SDK_INT > 12) {
            StringBuilder sb = new StringBuilder();
            sb.append("#");
            sb.append(this.f17790t.f17888aU);
            if (!config.m23844a(sb.toString())) {
                setTheme(R.style.holonolight);
            }
        }
        this.f17774d = getIntent().getExtras();
        if (bundle == null) {
            this.f17773c = this.f17774d != null && this.f17774d.containsKey("es_root") && this.f17774d.getBoolean("es_root", false);
        } else {
            this.f17773c = bundle.containsKey("es_root") && bundle.getBoolean("es_root", false);
        }
        super.onCreate(bundle);
        setContentView(R.layout.chat);
        mo20727g();
        if (this.f17790t.f18080q > 0) {
            SearchManager searchManager = (SearchManager) getSystemService("search");
            searchManager.setOnCancelListener(new OnCancelListener() {
                public void onCancel() {
                    chat.this.f17771a = false;
                    chat.this.setResult(0);
                }
            });
            searchManager.setOnDismissListener(new OnDismissListener() {
                public void onDismiss() {
                    chat.this.f17781k = false;
                }
            });
        }
        if (bundle == null) {
            this.f17790t.mo20770a((Context) this, this.f17774d != null && this.f17774d.containsKey("ad_entrar"), this.f17774d != null && this.f17774d.containsKey("fb_entrar"));
        }
        this.f17775e = this.f17790t.mo20760a((Context) this, false);
        this.f17789s = getSharedPreferences("sh", 0);
        this.f17785o = this.f17789s.getInt("idusu", 0);
        Display defaultDisplay = getWindowManager().getDefaultDisplay();
        if (VERSION.SDK_INT >= 13) {
            Point point = new Point();
            defaultDisplay.getSize(point);
            this.f17786p = point.y;
        } else {
            this.f17786p = defaultDisplay.getHeight();
        }
        if (!this.f17790t.f17888aU.equals("")) {
            Orientation orientation = Orientation.TOP_BOTTOM;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("#");
            sb2.append(this.f17790t.f17888aU);
            StringBuilder sb3 = new StringBuilder();
            sb3.append("#");
            sb3.append(this.f17790t.f17889aV);
            findViewById(R.id.ll_princ).setBackgroundDrawable(new GradientDrawable(orientation, new int[]{Color.parseColor(sb2.toString()), Color.parseColor(sb3.toString())}));
        }
        if (!this.f17790t.f17946ba.equals("")) {
            Drawable drawable = getResources().getDrawable(R.drawable.chat_contactar);
            StringBuilder sb4 = new StringBuilder();
            sb4.append("#");
            sb4.append(this.f17790t.f17946ba);
            drawable.setColorFilter(Color.parseColor(sb4.toString()), Mode.MULTIPLY);
            ((ImageView) findViewById(R.id.iv_chat)).setImageDrawable(drawable);
        }
        if (!this.f17790t.f17892aY.equals("")) {
            TextView textView = (TextView) findViewById(R.id.tv_tit);
            StringBuilder sb5 = new StringBuilder();
            sb5.append("#");
            sb5.append(this.f17790t.f17892aY);
            textView.setTextColor(Color.parseColor(sb5.toString()));
        }
        if (!this.f17790t.f17893aZ.equals("")) {
            View findViewById = findViewById(R.id.v_sep);
            StringBuilder sb6 = new StringBuilder();
            sb6.append("#");
            sb6.append(this.f17790t.f17893aZ);
            findViewById.setBackgroundColor(Color.parseColor(sb6.toString()));
        }
        if (VERSION.SDK_INT > 20) {
            config.m23838a((ProgressBar) findViewById(R.id.pb_chat_env), this.f17790t.f17949bd);
        }
        findViewById(R.id.iv_env).setOnClickListener(this);
        if (VERSION.SDK_INT > 20) {
            config.m23837a((EditText) findViewById(R.id.c_mensaje), Boolean.valueOf(false), this.f17790t.f17949bd);
        } else {
            ((EditText) findViewById(R.id.c_mensaje)).setTextColor(-16777216);
        }
        findViewById(R.id.c_mensaje).setOnKeyListener(this);
        StringBuilder sb7 = new StringBuilder();
        sb7.append("#");
        sb7.append(this.f17790t.f17949bd);
        if (config.m23844a(sb7.toString())) {
            findViewById(R.id.iv_btn_fondo_n).setVisibility(0);
        } else {
            findViewById(R.id.iv_btn_fondo_b).setVisibility(0);
        }
        Drawable drawable2 = getResources().getDrawable(R.drawable.btn_enviar);
        StringBuilder sb8 = new StringBuilder();
        sb8.append("#");
        sb8.append(this.f17790t.f17949bd);
        drawable2.setColorFilter(Color.parseColor(sb8.toString()), Mode.MULTIPLY);
        ((ImageView) findViewById(R.id.iv_env)).setImageDrawable(drawable2);
        this.f17789s.registerOnSharedPreferenceChangeListener(this);
        String string = this.f17789s.getString("conv", "");
        if (!string.equals("")) {
            Editor edit = this.f17789s.edit();
            edit.putString("f_idfrase", "0");
            edit.commit();
            for (int i2 = 0; i2 != -1; i2 = indexOf) {
                int i3 = i2 + 1;
                indexOf = string.indexOf("@0@", i3);
                StringBuilder sb9 = new StringBuilder();
                sb9.append("@");
                sb9.append(this.f17785o);
                sb9.append("@");
                int indexOf2 = string.indexOf(sb9.toString(), i3);
                if (indexOf != -1 && indexOf2 != -1) {
                    indexOf = Math.min(indexOf, indexOf2);
                } else if (indexOf == -1) {
                    indexOf = indexOf2 != -1 ? indexOf2 : -1;
                }
                if (string.substring(i2, i2 + 3).equals("@0@")) {
                    edit.putString("f_id", "0");
                    i = 3;
                } else {
                    StringBuilder sb10 = new StringBuilder();
                    sb10.append(this.f17785o);
                    sb10.append("");
                    edit.putString("f_id", sb10.toString());
                    StringBuilder sb11 = new StringBuilder();
                    sb11.append(this.f17785o);
                    sb11.append("");
                    i = sb11.toString().length() + 2;
                }
                StringBuilder sb12 = new StringBuilder();
                sb12.append(config.f17840h);
                sb12.append("");
                edit.putString("f_idfrase", sb12.toString());
                if (indexOf != -1) {
                    str = string.substring(i2 + i, indexOf);
                } else {
                    str = string.substring(i2 + i);
                }
                edit.putString("f_frase", str);
                edit.commit();
                config.f17840h++;
            }
        }
    }

    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 0 || i != 66) {
            return false;
        }
        m23807a(true);
        return true;
    }

    /* renamed from: a */
    private void m23807a(boolean z) {
        this.f17787q = ((EditText) findViewById(R.id.c_mensaje)).getText().toString();
        this.f17787q = this.f17787q.trim();
        if (!this.f17787q.equals("")) {
            if (z && this.f17786p < 600) {
                ((InputMethodManager) getSystemService("input_method")).hideSoftInputFromWindow(((EditText) findViewById(R.id.c_mensaje)).getWindowToken(), 0);
            }
            if (this.f17789s.getString("nombre", "").equals("")) {
                final EditText editText = new EditText(this);
                editText.setSingleLine();
                editText.setInputType(8193);
                if (!this.f17788r.equals("")) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("#");
                    sb.append(this.f17790t.f17888aU);
                    config.m23837a(editText, Boolean.valueOf(!config.m23844a(sb.toString())), this.f17788r);
                }
                final AlertDialog create = new Builder(this).setNegativeButton(getString(R.string.cancelar), null).setPositiveButton(getString(R.string.aceptar), new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialogInterface, int i) {
                        String obj = editText.getText().toString();
                        if (!obj.equals("")) {
                            Editor edit = chat.this.f17789s.edit();
                            edit.putString("nombre", obj);
                            edit.commit();
                            ((EditText) chat.this.findViewById(R.id.c_mensaje)).setTextColor(-7829368);
                            chat.this.findViewById(R.id.pb_chat_env).setVisibility(0);
                            new C5611a(chat.this.f17787q).execute(new String[0]);
                            return;
                        }
                        final AlertDialog create = new Builder(chat.this).setPositiveButton(chat.this.getString(R.string.aceptar), null).setMessage(R.string.falta_nombre).create();
                        if (!chat.this.f17788r.equals("")) {
                            create.setOnShowListener(new OnShowListener() {
                                public void onShow(DialogInterface dialogInterface) {
                                    Button button = create.getButton(-1);
                                    StringBuilder sb = new StringBuilder();
                                    sb.append("#");
                                    sb.append(chat.this.f17788r);
                                    button.setTextColor(Color.parseColor(sb.toString()));
                                }
                            });
                        }
                        create.show();
                        try {
                            ((TextView) create.findViewById(16908299)).setTypeface(Typeface.MONOSPACE);
                        } catch (Exception unused) {
                        }
                    }
                }).setMessage(R.string.pon_nombre).setView(editText).create();
                if (!this.f17788r.equals("")) {
                    create.setOnShowListener(new OnShowListener() {
                        public void onShow(DialogInterface dialogInterface) {
                            Button button = create.getButton(-1);
                            StringBuilder sb = new StringBuilder();
                            sb.append("#");
                            sb.append(chat.this.f17788r);
                            button.setTextColor(Color.parseColor(sb.toString()));
                            Button button2 = create.getButton(-2);
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("#");
                            sb2.append(chat.this.f17788r);
                            button2.setTextColor(Color.parseColor(sb2.toString()));
                        }
                    });
                }
                create.show();
                try {
                    ((TextView) create.findViewById(16908299)).setTypeface(Typeface.MONOSPACE);
                } catch (Exception unused) {
                }
            } else {
                ((EditText) findViewById(R.id.c_mensaje)).setTextColor(-7829368);
                findViewById(R.id.pb_chat_env).setVisibility(0);
                new C5611a(this.f17787q).execute(new String[0]);
            }
        }
    }

    public void onClick(View view) {
        if (view.getId() == R.id.iv_env) {
            m23807a(false);
        } else if ((this.f17790t.f17986cO == null || this.f17790t.f17986cO.equals("")) && ((this.f17790t.f17985cN == null || this.f17790t.f17985cN.equals("")) && ((this.f17790t.f17988cQ == null || this.f17790t.f17988cQ.equals("")) && (this.f17790t.f17989cR == null || this.f17790t.f17989cR.equals(""))))) {
            abrir_secc(view);
        } else {
            if (this.f17790t.f17986cO != null && !this.f17790t.f17986cO.equals("")) {
                this.f17777g = new RewardedVideo((Context) this, this.f17790t.f17986cO);
            }
            if (this.f17790t.f17985cN != null && !this.f17790t.f17985cN.equals("")) {
                this.f17776f = C2997g.m10716a(this);
            }
            if (this.f17790t.f17988cQ != null && !this.f17790t.f17988cQ.equals("")) {
                this.f17778h = new RewardedVideoAd(this, this.f17790t.f17988cQ);
            }
            if (this.f17790t.f17989cR != null && !this.f17790t.f17989cR.equals("")) {
                this.f17779i = new StartAppAd(this);
            }
            this.f17783m = new ProgressDialog(this);
            this.f17782l = view;
            if (!this.f17790t.mo20774a((Context) this, view, this.f17788r, this.f17783m, this.f17776f, this.f17777g, this.f17778h, this.f17779i)) {
                abrir_secc(view);
            }
        }
    }

    public void abrir_secc(View view) {
        C5662h a = this.f17790t.mo20761a(view, (Context) this);
        if (a.f18227b) {
            this.f17771a = true;
            Intent intent = new Intent();
            intent.putExtra("finalizar", true);
            intent.putExtra("finalizar_app", a.f18228c);
            setResult(-1, intent);
        }
        if (a.f18229d) {
            startActivityForResult(a.f18226a, 0);
        } else if (a.f18226a != null) {
            if (a.f18227b && this.f17790t.f18045dm != 2) {
                a.f18226a.putExtra("es_root", true);
            }
            this.f17773c = false;
            startActivity(a.f18226a);
        }
        if (this.f17771a && !this.f17781k) {
            finish();
        }
    }

    public void onSharedPreferenceChanged(final SharedPreferences sharedPreferences, String str) {
        if (sharedPreferences.contains("f_idfrase") && str.equals("f_idfrase") && !sharedPreferences.getString("f_idfrase", "0").equals("0")) {
            runOnUiThread(new Runnable() {
                public void run() {
                    LinearLayout linearLayout = (LinearLayout) ((LayoutInflater) chat.this.getSystemService("layout_inflater")).inflate(R.layout.frase, null);
                    TextView textView = (TextView) linearLayout.findViewById(R.id.message_text);
                    textView.setText(sharedPreferences.getString("f_frase", "").replace("XYARROBAYX", "@"));
                    String string = sharedPreferences.getString("f_id", "");
                    StringBuilder sb = new StringBuilder();
                    sb.append(chat.this.f17785o);
                    sb.append("");
                    if (string.equals(sb.toString())) {
                        textView.setBackgroundResource(R.drawable.speech_bubble_gray);
                    } else {
                        textView.setBackgroundResource(R.drawable.speech_bubble_green);
                    }
                    LinearLayout linearLayout2 = (LinearLayout) chat.this.findViewById(R.id.llchat);
                    linearLayout2.addView(linearLayout);
                    ScrollView scrollView = (ScrollView) chat.this.findViewById(R.id.sv_chat);
                    if (linearLayout2.getMeasuredHeight() <= scrollView.getScrollY() + scrollView.getHeight()) {
                        scrollView.post(new Runnable() {
                            public void run() {
                                ((ScrollView) chat.this.findViewById(R.id.sv_chat)).fullScroll(TsExtractor.TS_STREAM_TYPE_HDMV_DTS);
                            }
                        });
                    }
                }
            });
        }
    }

    public void onResume() {
        super.onResume();
        config.m23860m(this);
        Editor edit = this.f17789s.edit();
        edit.putBoolean("activa", true);
        edit.commit();
        this.f17789s.registerOnSharedPreferenceChangeListener(this);
        if (this.f17790t.f18013cx != 0 && this.f17775e != null && this.f17775e.f17768a != null) {
            this.f17775e.f17768a.mo12165a();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public void mo20726f() {
        Editor edit = this.f17789s.edit();
        edit.putBoolean("activa", false);
        edit.commit();
        this.f17789s.unregisterOnSharedPreferenceChangeListener(this);
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i2 == -1 && intent != null && intent.hasExtra("finalizar") && intent.getExtras().getBoolean("finalizar")) {
            if (!intent.getExtras().getBoolean("finalizar_app")) {
                this.f17773c = false;
            }
            setResult(-1, intent);
            finish();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public void mo20727g() {
        int b = this.f17790t.mo20778b((Context) this);
        if (this.f17790t.f18045dm == 1) {
            this.f17784n = (ListView) findViewById(R.id.left_drawer);
            this.f17790t.mo20771a(this.f17784n);
        } else if (this.f17790t.f18045dm == 0) {
            int i = 0;
            for (int i2 = 0; i2 < this.f17790t.f17971bz.length; i2++) {
                if (!this.f17790t.f17971bz[i2].f18333z) {
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
        for (int i3 = 0; i3 < this.f17790t.f17923bD.length; i3++) {
            if (this.f17790t.f17923bD[i3] > 0) {
                findViewById(this.f17790t.f17923bD[i3]).setOnClickListener(this);
            }
        }
    }

    public boolean onSearchRequested() {
        if (this.f17790t.f18080q == 0) {
            return false;
        }
        this.f17771a = true;
        this.f17781k = true;
        return super.onSearchRequested();
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getWindow().setFormat(1);
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("es_root", this.f17773c);
    }

    public void onStop() {
        super.onStop();
        if (this.f17771a && !this.f17781k) {
            finish();
        }
    }

    public void onPause() {
        if (!(this.f17790t.f18013cx == 0 || this.f17775e == null || this.f17775e.f17768a == null)) {
            this.f17775e.f17768a.mo12167b();
        }
        super.onPause();
        mo20726f();
    }

    public void onDestroy() {
        if (!(this.f17790t.f18013cx == 0 || this.f17775e == null || this.f17775e.f17768a == null)) {
            this.f17775e.f17768a.mo12168c();
        }
        if (!(this.f17790t.f18013cx == 0 || this.f17775e == null || this.f17775e.f17769b == null)) {
            this.f17775e.f17769b.destroy();
        }
        if ((this.f17773c && isFinishing()) || config.f17841i) {
            config.m23861n(this);
        }
        super.onDestroy();
    }

    public void onBackPressed() {
        if (!this.f17773c || this.f17772b || !this.f17790t.f18059ea) {
            super.onBackPressed();
            return;
        }
        this.f17772b = true;
        config.m23859l(this);
    }

    public void adLoaded(String str) {
        this.f17783m.cancel();
        this.f17777g.showAd();
    }

    public void onAdClosed() {
        if (this.f17780j) {
            abrir_secc(this.f17782l);
        }
    }

    public void adError(String str) {
        this.f17783m.cancel();
        abrir_secc(this.f17782l);
    }

    public void videoEnded() {
        this.f17780j = true;
        config.m23867t(this);
    }

    /* renamed from: z_ */
    public void mo9678z_() {
        this.f17783m.cancel();
        this.f17776f.mo12836a();
    }

    /* renamed from: a */
    public void mo9675a(C3165a aVar) {
        this.f17780j = true;
        config.m23867t(this);
    }

    /* renamed from: A_ */
    public void mo9671A_() {
        if (this.f17780j) {
            abrir_secc(this.f17782l);
        }
    }

    /* renamed from: e */
    public void mo9676e() {
        this.f17780j = false;
    }

    /* renamed from: a */
    public void mo9674a(int i) {
        if (!this.f17790t.mo20775a((Context) this, this.f17777g)) {
            this.f17783m.cancel();
            abrir_secc(this.f17782l);
        }
    }

    public void onError(C1514Ad ad, AdError adError) {
        this.f17783m.cancel();
        abrir_secc(this.f17782l);
    }

    public void onAdLoaded(C1514Ad ad) {
        this.f17783m.cancel();
        this.f17778h.show();
    }

    public void onRewardedVideoCompleted() {
        this.f17780j = true;
        config.m23867t(this);
    }

    public void onRewardedVideoClosed() {
        if (this.f17780j) {
            abrir_secc(this.f17782l);
        }
    }

    public void onVideoCompleted() {
        this.f17780j = true;
        config.m23867t(this);
    }

    public void onReceiveAd(C5286Ad ad) {
        this.f17783m.cancel();
        this.f17779i.showAd("REWARDED VIDEO", new AdDisplayListener() {
            public void adClicked(C5286Ad ad) {
            }

            public void adDisplayed(C5286Ad ad) {
            }

            public void adNotDisplayed(C5286Ad ad) {
            }

            public void adHidden(C5286Ad ad) {
                if (chat.this.f17780j) {
                    chat.this.abrir_secc(chat.this.f17782l);
                }
            }
        });
    }

    public void onFailedToReceiveAd(C5286Ad ad) {
        this.f17783m.cancel();
        abrir_secc(this.f17782l);
    }
}
