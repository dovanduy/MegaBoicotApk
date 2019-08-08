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
import android.graphics.Color;
import android.graphics.PorterDuff.Mode;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.GradientDrawable.Orientation;
import android.os.AsyncTask;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
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
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import org.apache.p199a.p202b.C6279d;
import org.apache.p199a.p202b.p203a.C6268a;
import org.apache.p199a.p202b.p204b.C6274e;
import org.apache.p199a.p218f.p220b.C6409h;
import org.apache.p199a.p226h.C6517l;

public class contactar extends Activity implements OnClickListener, OnAdClosed, OnAdError, OnAdLoaded, OnVideoEnded, RewardedVideoAdListener, C3167c, VideoListener, AdEventListener, C5599a {

    /* renamed from: a */
    int f18149a;

    /* renamed from: b */
    int f18150b;

    /* renamed from: c */
    boolean f18151c = false;

    /* renamed from: d */
    boolean f18152d = false;

    /* renamed from: e */
    boolean f18153e;

    /* renamed from: f */
    config f18154f;

    /* renamed from: g */
    C5602c f18155g;

    /* renamed from: h */
    C3166b f18156h;

    /* renamed from: i */
    RewardedVideo f18157i;

    /* renamed from: j */
    RewardedVideoAd f18158j;

    /* renamed from: k */
    StartAppAd f18159k;

    /* renamed from: l */
    boolean f18160l = false;

    /* renamed from: m */
    boolean f18161m = false;

    /* renamed from: n */
    View f18162n;

    /* renamed from: o */
    ProgressDialog f18163o;

    /* renamed from: p */
    ListView f18164p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public ProgressDialog f18165q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public String f18166r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public String f18167s;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public String f18168t;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public String f18169u;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public String f18170v;

    /* renamed from: mega.boicot.contactar$a */
    private class C5655a extends AsyncTask<String, Void, Byte> {
        private C5655a() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Byte doInBackground(String... strArr) {
            C6409h hVar = new C6409h();
            StringBuilder sb = new StringBuilder();
            sb.append("http://");
            sb.append(config.f17839g);
            sb.append("/srv/enviar_petic.php?v=1&idapp=");
            sb.append(718963);
            sb.append("&idusu=");
            sb.append(contactar.this.f18150b);
            sb.append("&idofic=");
            sb.append(contactar.this.f18149a);
            C6274e eVar = new C6274e(sb.toString());
            StringBuilder sb2 = new StringBuilder();
            try {
                ArrayList arrayList = new ArrayList(2);
                arrayList.add(new C6517l("nombre", contactar.this.f18166r));
                arrayList.add(new C6517l("email", contactar.this.f18167s));
                arrayList.add(new C6517l("tel", contactar.this.f18168t));
                arrayList.add(new C6517l("observ", contactar.this.f18169u));
                eVar.mo22444a(new C6268a(arrayList, C2793C.UTF8_NAME));
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
                return Byte.valueOf(2);
            } catch (C6279d unused) {
                return Byte.valueOf(2);
            } catch (IOException unused2) {
                return Byte.valueOf(2);
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void onPostExecute(Byte b) {
            try {
                contactar.this.f18165q.dismiss();
            } catch (Exception unused) {
            }
            if (b.byteValue() == 1) {
                final AlertDialog create = new Builder(contactar.this).setCancelable(false).setPositiveButton(R.string.aceptar, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialogInterface, int i) {
                        contactar.this.finish();
                    }
                }).setMessage(R.string.mensaje_enviado).create();
                if (!contactar.this.f18170v.equals("")) {
                    create.setOnShowListener(new OnShowListener() {
                        public void onShow(DialogInterface dialogInterface) {
                            Button button = create.getButton(-1);
                            StringBuilder sb = new StringBuilder();
                            sb.append("#");
                            sb.append(contactar.this.f18170v);
                            button.setTextColor(Color.parseColor(sb.toString()));
                        }
                    });
                }
                create.show();
                try {
                    ((TextView) create.findViewById(16908299)).setTypeface(Typeface.MONOSPACE);
                } catch (Exception unused2) {
                }
            } else {
                contactar.this.mo20817f();
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
        this.f18154f = (config) getApplicationContext();
        if (this.f18154f.f17881aN == null) {
            this.f18154f.mo20780b();
        }
        this.f18170v = config.m23831a(this.f18154f.f17888aU, this.f18154f.f17949bd);
        if (VERSION.SDK_INT > 12) {
            StringBuilder sb = new StringBuilder();
            sb.append("#");
            sb.append(this.f18154f.f17888aU);
            if (!config.m23844a(sb.toString())) {
                setTheme(R.style.holonolight);
            }
        }
        super.onCreate(bundle);
        setContentView(R.layout.contactar);
        mo20818g();
        if (this.f18154f.f18080q > 0) {
            SearchManager searchManager = (SearchManager) getSystemService("search");
            searchManager.setOnCancelListener(new OnCancelListener() {
                public void onCancel() {
                    contactar.this.f18151c = false;
                    contactar.this.setResult(0);
                }
            });
            searchManager.setOnDismissListener(new OnDismissListener() {
                public void onDismiss() {
                    contactar.this.f18161m = false;
                }
            });
        }
        if (bundle == null) {
            this.f18154f.mo20770a((Context) this, false, false);
        }
        this.f18155g = this.f18154f.mo20760a((Context) this, false);
        Bundle extras = getIntent().getExtras();
        if (bundle == null) {
            this.f18153e = extras != null && extras.containsKey("es_root") && extras.getBoolean("es_root", false);
        } else {
            this.f18153e = bundle.containsKey("es_root") && bundle.getBoolean("es_root", false);
        }
        this.f18149a = extras.getInt("idofic");
        this.f18150b = getSharedPreferences("sh", 0).getInt("idusu", 0);
        if (!this.f18154f.f17892aY.equals("")) {
            TextView textView = (TextView) findViewById(R.id.tv_tit);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("#");
            sb2.append(this.f18154f.f17892aY);
            textView.setTextColor(Color.parseColor(sb2.toString()));
        }
        if (!this.f18154f.f17893aZ.equals("")) {
            View findViewById = findViewById(R.id.v_sep);
            StringBuilder sb3 = new StringBuilder();
            sb3.append("#");
            sb3.append(this.f18154f.f17893aZ);
            findViewById.setBackgroundColor(Color.parseColor(sb3.toString()));
        }
        if (!this.f18154f.f17946ba.equals("")) {
            Drawable drawable = getResources().getDrawable(R.drawable.email_contactar);
            StringBuilder sb4 = new StringBuilder();
            sb4.append("#");
            sb4.append(this.f18154f.f17946ba);
            drawable.setColorFilter(Color.parseColor(sb4.toString()), Mode.MULTIPLY);
            ((ImageView) findViewById(R.id.iv_email)).setImageDrawable(drawable);
        }
        if (!this.f18154f.f17947bb.equals("")) {
            StringBuilder sb5 = new StringBuilder();
            sb5.append("#");
            sb5.append(this.f18154f.f17947bb);
            int parseColor = Color.parseColor(sb5.toString());
            ((TextView) findViewById(R.id.tv_to_lit)).setTextColor(parseColor);
            ((TextView) findViewById(R.id.tv_to)).setTextColor(parseColor);
            ((TextView) findViewById(R.id.tv_nombre)).setTextColor(parseColor);
            ((TextView) findViewById(R.id.opcional_nombre)).setTextColor(parseColor);
            ((TextView) findViewById(R.id.tv_email)).setTextColor(parseColor);
            ((TextView) findViewById(R.id.opcional_email)).setTextColor(parseColor);
            ((TextView) findViewById(R.id.tv_tel)).setTextColor(parseColor);
            ((TextView) findViewById(R.id.opcional_tel)).setTextColor(parseColor);
            ((TextView) findViewById(R.id.tv_msg)).setTextColor(parseColor);
            if (VERSION.SDK_INT > 20) {
                EditText editText = (EditText) findViewById(R.id.c_nombre);
                StringBuilder sb6 = new StringBuilder();
                sb6.append("#");
                sb6.append(this.f18154f.f17947bb);
                config.m23837a(editText, Boolean.valueOf(config.m23844a(sb6.toString())), this.f18154f.f17949bd);
                EditText editText2 = (EditText) findViewById(R.id.c_email);
                StringBuilder sb7 = new StringBuilder();
                sb7.append("#");
                sb7.append(this.f18154f.f17947bb);
                config.m23837a(editText2, Boolean.valueOf(config.m23844a(sb7.toString())), this.f18154f.f17949bd);
                EditText editText3 = (EditText) findViewById(R.id.c_telefono);
                StringBuilder sb8 = new StringBuilder();
                sb8.append("#");
                sb8.append(this.f18154f.f17947bb);
                config.m23837a(editText3, Boolean.valueOf(config.m23844a(sb8.toString())), this.f18154f.f17949bd);
                EditText editText4 = (EditText) findViewById(R.id.c_observ);
                StringBuilder sb9 = new StringBuilder();
                sb9.append("#");
                sb9.append(this.f18154f.f17947bb);
                config.m23837a(editText4, Boolean.valueOf(config.m23844a(sb9.toString())), this.f18154f.f17949bd);
            }
        }
        StringBuilder sb10 = new StringBuilder();
        sb10.append("#");
        sb10.append(this.f18154f.f17949bd);
        if (config.m23844a(sb10.toString())) {
            findViewById(R.id.iv_btn_fondo_n).setVisibility(0);
        } else {
            findViewById(R.id.iv_btn_fondo_b).setVisibility(0);
        }
        Drawable drawable2 = getResources().getDrawable(R.drawable.enviar_btn);
        StringBuilder sb11 = new StringBuilder();
        sb11.append("#");
        sb11.append(this.f18154f.f17949bd);
        drawable2.setColorFilter(Color.parseColor(sb11.toString()), Mode.MULTIPLY);
        ImageView imageView = (ImageView) findViewById(R.id.button1);
        imageView.setImageDrawable(drawable2);
        imageView.setOnClickListener(this);
        int i = 0;
        while (true) {
            if (i < this.f18154f.f17921bB.length) {
                if (this.f18154f.f17921bB[i].f18211l == this.f18149a && this.f18154f.f17921bB[i].f18224y && !this.f18154f.f17921bB[i].f18204e.equals("")) {
                    ((TextView) findViewById(R.id.tv_to)).setText(this.f18154f.f17921bB[i].f18204e);
                    findViewById(R.id.tr_to).setVisibility(0);
                    break;
                }
                i++;
            } else {
                break;
            }
        }
        if (this.f18154f.f18088y > 0) {
            if (this.f18154f.f18088y == 1) {
                findViewById(R.id.opcional_nombre).setVisibility(0);
            }
            findViewById(R.id.tr_nombre).setVisibility(0);
        }
        if (this.f18154f.f18089z > 0) {
            if (this.f18154f.f18089z == 1) {
                findViewById(R.id.opcional_email).setVisibility(0);
            }
            findViewById(R.id.tr_email).setVisibility(0);
        }
        if (this.f18154f.f17842A > 0) {
            if (this.f18154f.f17842A == 1) {
                findViewById(R.id.opcional_tel).setVisibility(0);
            }
            findViewById(R.id.tr_tel).setVisibility(0);
        }
        if (extras.containsKey("msg_predefinido")) {
            EditText editText5 = (EditText) findViewById(R.id.c_observ);
            StringBuilder sb12 = new StringBuilder();
            sb12.append(getResources().getString(R.string.masinfo_sobre));
            sb12.append(" ");
            sb12.append(extras.getString("msg_predefinido"));
            editText5.setText(sb12.toString());
        }
        if (!this.f18154f.f17888aU.equals("")) {
            Orientation orientation = Orientation.TOP_BOTTOM;
            StringBuilder sb13 = new StringBuilder();
            sb13.append("#");
            sb13.append(this.f18154f.f17888aU);
            StringBuilder sb14 = new StringBuilder();
            sb14.append("#");
            sb14.append(this.f18154f.f17889aV);
            findViewById(R.id.ll_princ).setBackgroundDrawable(new GradientDrawable(orientation, new int[]{Color.parseColor(sb13.toString()), Color.parseColor(sb14.toString())}));
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public void mo20817f() {
        final AlertDialog create = new Builder(this).setCancelable(false).setPositiveButton(R.string.cerrar, null).setMessage(R.string.error_http).create();
        if (!this.f18170v.equals("")) {
            create.setOnShowListener(new OnShowListener() {
                public void onShow(DialogInterface dialogInterface) {
                    Button button = create.getButton(-1);
                    StringBuilder sb = new StringBuilder();
                    sb.append("#");
                    sb.append(contactar.this.f18170v);
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

    public void onClick(View view) {
        if (view.getId() == R.id.button1) {
            Builder builder = new Builder(this);
            builder.setCancelable(false).setPositiveButton(getResources().getString(R.string.cerrar), null);
            this.f18166r = ((TextView) findViewById(R.id.c_nombre)).getText().toString();
            this.f18167s = ((TextView) findViewById(R.id.c_email)).getText().toString();
            this.f18168t = ((TextView) findViewById(R.id.c_telefono)).getText().toString();
            this.f18169u = ((TextView) findViewById(R.id.c_observ)).getText().toString();
            if (this.f18166r.length() == 0 && this.f18154f.f18088y == 2) {
                builder.setMessage(R.string.falta_nombre);
                final AlertDialog create = builder.create();
                if (!this.f18170v.equals("")) {
                    create.setOnShowListener(new OnShowListener() {
                        public void onShow(DialogInterface dialogInterface) {
                            Button button = create.getButton(-1);
                            StringBuilder sb = new StringBuilder();
                            sb.append("#");
                            sb.append(contactar.this.f18170v);
                            button.setTextColor(Color.parseColor(sb.toString()));
                        }
                    });
                }
                create.show();
                try {
                    ((TextView) create.findViewById(16908299)).setTypeface(Typeface.MONOSPACE);
                } catch (Exception unused) {
                }
            } else if (this.f18167s.length() == 0 && this.f18154f.f18089z == 2) {
                builder.setMessage(R.string.falta_email);
                final AlertDialog create2 = builder.create();
                if (!this.f18170v.equals("")) {
                    create2.setOnShowListener(new OnShowListener() {
                        public void onShow(DialogInterface dialogInterface) {
                            Button button = create2.getButton(-1);
                            StringBuilder sb = new StringBuilder();
                            sb.append("#");
                            sb.append(contactar.this.f18170v);
                            button.setTextColor(Color.parseColor(sb.toString()));
                        }
                    });
                }
                create2.show();
                ((TextView) create2.findViewById(16908299)).setTypeface(Typeface.MONOSPACE);
            } else if (this.f18168t.length() == 0 && this.f18154f.f17842A == 2) {
                builder.setMessage(R.string.falta_tel);
                final AlertDialog create3 = builder.create();
                if (!this.f18170v.equals("")) {
                    create3.setOnShowListener(new OnShowListener() {
                        public void onShow(DialogInterface dialogInterface) {
                            Button button = create3.getButton(-1);
                            StringBuilder sb = new StringBuilder();
                            sb.append("#");
                            sb.append(contactar.this.f18170v);
                            button.setTextColor(Color.parseColor(sb.toString()));
                        }
                    });
                }
                create3.show();
                ((TextView) create3.findViewById(16908299)).setTypeface(Typeface.MONOSPACE);
            } else if (this.f18169u.length() == 0) {
                builder.setMessage(R.string.falta_msg);
                final AlertDialog create4 = builder.create();
                if (!this.f18170v.equals("")) {
                    create4.setOnShowListener(new OnShowListener() {
                        public void onShow(DialogInterface dialogInterface) {
                            Button button = create4.getButton(-1);
                            StringBuilder sb = new StringBuilder();
                            sb.append("#");
                            sb.append(contactar.this.f18170v);
                            button.setTextColor(Color.parseColor(sb.toString()));
                        }
                    });
                }
                create4.show();
                ((TextView) create4.findViewById(16908299)).setTypeface(Typeface.MONOSPACE);
            } else if (this.f18167s.length() <= 0 || this.f18167s.contains("@")) {
                this.f18165q = new ProgressDialog(this);
                this.f18165q.setMessage(getString(R.string.enviando));
                this.f18165q.setIndeterminate(true);
                if (VERSION.SDK_INT > 20) {
                    this.f18165q.setOnShowListener(new OnShowListener() {
                        public void onShow(DialogInterface dialogInterface) {
                            config.m23838a((ProgressBar) contactar.this.f18165q.findViewById(16908301), contactar.this.f18154f.f17949bd);
                        }
                    });
                }
                this.f18165q.show();
                new C5655a().execute(new String[0]);
            } else {
                builder.setMessage(R.string.email_nook);
                final AlertDialog create5 = builder.create();
                if (!this.f18170v.equals("")) {
                    create5.setOnShowListener(new OnShowListener() {
                        public void onShow(DialogInterface dialogInterface) {
                            Button button = create5.getButton(-1);
                            StringBuilder sb = new StringBuilder();
                            sb.append("#");
                            sb.append(contactar.this.f18170v);
                            button.setTextColor(Color.parseColor(sb.toString()));
                        }
                    });
                }
                create5.show();
                ((TextView) create5.findViewById(16908299)).setTypeface(Typeface.MONOSPACE);
            }
        } else if ((this.f18154f.f17986cO == null || this.f18154f.f17986cO.equals("")) && ((this.f18154f.f17985cN == null || this.f18154f.f17985cN.equals("")) && ((this.f18154f.f17988cQ == null || this.f18154f.f17988cQ.equals("")) && (this.f18154f.f17989cR == null || this.f18154f.f17989cR.equals(""))))) {
            abrir_secc(view);
        } else {
            if (this.f18154f.f17986cO != null && !this.f18154f.f17986cO.equals("")) {
                this.f18157i = new RewardedVideo((Context) this, this.f18154f.f17986cO);
            }
            if (this.f18154f.f17985cN != null && !this.f18154f.f17985cN.equals("")) {
                this.f18156h = C2997g.m10716a(this);
            }
            if (this.f18154f.f17988cQ != null && !this.f18154f.f17988cQ.equals("")) {
                this.f18158j = new RewardedVideoAd(this, this.f18154f.f17988cQ);
            }
            if (this.f18154f.f17989cR != null && !this.f18154f.f17989cR.equals("")) {
                this.f18159k = new StartAppAd(this);
            }
            this.f18163o = new ProgressDialog(this);
            this.f18162n = view;
            if (!this.f18154f.mo20774a((Context) this, view, this.f18170v, this.f18163o, this.f18156h, this.f18157i, this.f18158j, this.f18159k)) {
                abrir_secc(view);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i2 == -1 && intent != null && intent.hasExtra("finalizar") && intent.getExtras().getBoolean("finalizar")) {
            if (!intent.getExtras().getBoolean("finalizar_app")) {
                this.f18153e = false;
            }
            setResult(-1, intent);
            finish();
        }
    }

    public void abrir_secc(View view) {
        C5662h a = this.f18154f.mo20761a(view, (Context) this);
        if (a.f18227b) {
            this.f18151c = true;
            Intent intent = new Intent();
            intent.putExtra("finalizar", true);
            intent.putExtra("finalizar_app", a.f18228c);
            setResult(-1, intent);
        }
        if (a.f18229d) {
            startActivityForResult(a.f18226a, 0);
        } else if (a.f18226a != null) {
            if (a.f18227b && this.f18154f.f18045dm != 2) {
                a.f18226a.putExtra("es_root", true);
            }
            this.f18153e = false;
            startActivity(a.f18226a);
        }
        if (this.f18151c && !this.f18161m) {
            finish();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public void mo20818g() {
        int b = this.f18154f.mo20778b((Context) this);
        if (this.f18154f.f18045dm == 1) {
            this.f18164p = (ListView) findViewById(R.id.left_drawer);
            this.f18154f.mo20771a(this.f18164p);
        } else if (this.f18154f.f18045dm == 0) {
            int i = 0;
            for (int i2 = 0; i2 < this.f18154f.f17971bz.length; i2++) {
                if (!this.f18154f.f17971bz[i2].f18333z) {
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
        for (int i3 = 0; i3 < this.f18154f.f17923bD.length; i3++) {
            if (this.f18154f.f17923bD[i3] > 0) {
                findViewById(this.f18154f.f17923bD[i3]).setOnClickListener(this);
            }
        }
    }

    public boolean onSearchRequested() {
        if (this.f18154f.f18080q == 0) {
            return false;
        }
        this.f18151c = true;
        this.f18161m = true;
        return super.onSearchRequested();
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getWindow().setFormat(1);
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("es_root", this.f18153e);
    }

    public void onStop() {
        super.onStop();
        if (this.f18151c && !this.f18161m) {
            finish();
        }
    }

    public void onPause() {
        if (!(this.f18154f.f18013cx == 0 || this.f18155g == null || this.f18155g.f17768a == null)) {
            this.f18155g.f17768a.mo12167b();
        }
        super.onPause();
    }

    public void onResume() {
        super.onResume();
        config.m23860m(this);
        if (this.f18154f.f18013cx != 0 && this.f18155g != null && this.f18155g.f17768a != null) {
            this.f18155g.f17768a.mo12165a();
        }
    }

    public void onDestroy() {
        if (!(this.f18154f.f18013cx == 0 || this.f18155g == null || this.f18155g.f17768a == null)) {
            this.f18155g.f17768a.mo12168c();
        }
        if (!(this.f18154f.f18013cx == 0 || this.f18155g == null || this.f18155g.f17769b == null)) {
            this.f18155g.f17769b.destroy();
        }
        if ((this.f18153e && isFinishing()) || config.f17841i) {
            config.m23861n(this);
        }
        super.onDestroy();
    }

    public void onBackPressed() {
        if (!this.f18153e || this.f18152d || !this.f18154f.f18059ea) {
            super.onBackPressed();
            return;
        }
        this.f18152d = true;
        config.m23859l(this);
    }

    public void adLoaded(String str) {
        this.f18163o.cancel();
        this.f18157i.showAd();
    }

    public void onAdClosed() {
        if (this.f18160l) {
            abrir_secc(this.f18162n);
        }
    }

    public void adError(String str) {
        this.f18163o.cancel();
        abrir_secc(this.f18162n);
    }

    public void videoEnded() {
        this.f18160l = true;
        config.m23867t(this);
    }

    /* renamed from: z_ */
    public void mo9678z_() {
        this.f18163o.cancel();
        this.f18156h.mo12836a();
    }

    /* renamed from: a */
    public void mo9675a(C3165a aVar) {
        this.f18160l = true;
        config.m23867t(this);
    }

    /* renamed from: A_ */
    public void mo9671A_() {
        if (this.f18160l) {
            abrir_secc(this.f18162n);
        }
    }

    /* renamed from: e */
    public void mo9676e() {
        this.f18160l = false;
    }

    /* renamed from: a */
    public void mo9674a(int i) {
        if (!this.f18154f.mo20775a((Context) this, this.f18157i)) {
            this.f18163o.cancel();
            abrir_secc(this.f18162n);
        }
    }

    public void onError(C1514Ad ad, AdError adError) {
        this.f18163o.cancel();
        abrir_secc(this.f18162n);
    }

    public void onAdLoaded(C1514Ad ad) {
        this.f18163o.cancel();
        this.f18158j.show();
    }

    public void onRewardedVideoCompleted() {
        this.f18160l = true;
        config.m23867t(this);
    }

    public void onRewardedVideoClosed() {
        if (this.f18160l) {
            abrir_secc(this.f18162n);
        }
    }

    public void onVideoCompleted() {
        this.f18160l = true;
        config.m23867t(this);
    }

    public void onReceiveAd(C5286Ad ad) {
        this.f18163o.cancel();
        this.f18159k.showAd("REWARDED VIDEO", new AdDisplayListener() {
            public void adClicked(C5286Ad ad) {
            }

            public void adDisplayed(C5286Ad ad) {
            }

            public void adNotDisplayed(C5286Ad ad) {
            }

            public void adHidden(C5286Ad ad) {
                if (contactar.this.f18160l) {
                    contactar.this.abrir_secc(contactar.this.f18162n);
                }
            }
        });
    }

    public void onFailedToReceiveAd(C5286Ad ad) {
        this.f18163o.cancel();
        abrir_secc(this.f18162n);
    }
}
