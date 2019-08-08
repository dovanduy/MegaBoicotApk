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
import android.content.res.Configuration;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.GradientDrawable.Orientation;
import android.os.AsyncTask;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;

public class preperfil extends Activity implements OnClickListener, C5599a {

    /* renamed from: a */
    String f18463a;

    /* renamed from: b */
    int f18464b;

    /* renamed from: c */
    int f18465c;

    /* renamed from: d */
    int f18466d;

    /* renamed from: e */
    config f18467e;

    /* renamed from: f */
    boolean f18468f = false;

    /* renamed from: g */
    boolean f18469g = false;

    /* renamed from: h */
    boolean f18470h = false;

    /* renamed from: i */
    boolean f18471i = false;

    /* renamed from: j */
    boolean f18472j = false;

    /* renamed from: k */
    boolean f18473k;

    /* renamed from: l */
    boolean f18474l;

    /* renamed from: m */
    boolean f18475m;

    /* renamed from: n */
    boolean f18476n = false;

    /* renamed from: o */
    ListView f18477o;

    /* renamed from: p */
    SharedPreferences f18478p;

    /* renamed from: q */
    Bundle f18479q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public ProgressDialog f18480r;

    /* renamed from: mega.boicot.preperfil$a */
    private class C5727a extends AsyncTask<String, Void, Byte> {
        private C5727a() {
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Can't wrap try/catch for region: R(6:35|34|38|39|(0)|42) */
        /* JADX WARNING: Code restructure failed: missing block: B:36:0x0194, code lost:
            r15 = th;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:37:0x0195, code lost:
            r1 = r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:41:0x019d, code lost:
            r0.disconnect();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:44:0x01a3, code lost:
            r1.disconnect();
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:38:0x0197 */
        /* JADX WARNING: Removed duplicated region for block: B:41:0x019d  */
        /* JADX WARNING: Removed duplicated region for block: B:44:0x01a3  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Byte doInBackground(java.lang.String... r15) {
            /*
                r14 = this;
                r15 = 2
                r0 = 0
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0197 }
                r1.<init>()     // Catch:{ Exception -> 0x0197 }
                java.lang.String r2 = "http://"
                r1.append(r2)     // Catch:{ Exception -> 0x0197 }
                java.lang.String r2 = mega.boicot.config.f17839g     // Catch:{ Exception -> 0x0197 }
                r1.append(r2)     // Catch:{ Exception -> 0x0197 }
                java.lang.String r2 = "/srv/obtener_perfil.php?v=1&idusu="
                r1.append(r2)     // Catch:{ Exception -> 0x0197 }
                mega.boicot.preperfil r2 = mega.boicot.preperfil.this     // Catch:{ Exception -> 0x0197 }
                int r2 = r2.f18464b     // Catch:{ Exception -> 0x0197 }
                r1.append(r2)     // Catch:{ Exception -> 0x0197 }
                java.lang.String r2 = "&c="
                r1.append(r2)     // Catch:{ Exception -> 0x0197 }
                mega.boicot.preperfil r2 = mega.boicot.preperfil.this     // Catch:{ Exception -> 0x0197 }
                android.content.SharedPreferences r2 = r2.f18478p     // Catch:{ Exception -> 0x0197 }
                java.lang.String r3 = "cod"
                java.lang.String r4 = ""
                java.lang.String r2 = r2.getString(r3, r4)     // Catch:{ Exception -> 0x0197 }
                r1.append(r2)     // Catch:{ Exception -> 0x0197 }
                java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x0197 }
                java.net.URL r2 = new java.net.URL     // Catch:{ Exception -> 0x0197 }
                r2.<init>(r1)     // Catch:{ Exception -> 0x0197 }
                java.net.URLConnection r1 = r2.openConnection()     // Catch:{ Exception -> 0x0197 }
                java.net.HttpURLConnection r1 = (java.net.HttpURLConnection) r1     // Catch:{ Exception -> 0x0197 }
                r0 = 1
                r1.setDoInput(r0)     // Catch:{ Exception -> 0x0192, all -> 0x0190 }
                r2 = 10000(0x2710, float:1.4013E-41)
                r1.setConnectTimeout(r2)     // Catch:{ Exception -> 0x0192, all -> 0x0190 }
                r1.setReadTimeout(r2)     // Catch:{ Exception -> 0x0192, all -> 0x0190 }
                java.lang.String r2 = "User-Agent"
                java.lang.String r3 = "Android Vinebre Software"
                r1.setRequestProperty(r2, r3)     // Catch:{ Exception -> 0x0192, all -> 0x0190 }
                java.io.InputStream r2 = r1.getInputStream()     // Catch:{ Exception -> 0x0192, all -> 0x0190 }
                java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch:{ Exception -> 0x0192, all -> 0x0190 }
                java.io.InputStreamReader r4 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x0192, all -> 0x0190 }
                r4.<init>(r2)     // Catch:{ Exception -> 0x0192, all -> 0x0190 }
                r3.<init>(r4)     // Catch:{ Exception -> 0x0192, all -> 0x0190 }
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0192, all -> 0x0190 }
                r2.<init>()     // Catch:{ Exception -> 0x0192, all -> 0x0190 }
            L_0x0066:
                java.lang.String r4 = r3.readLine()     // Catch:{ Exception -> 0x0192, all -> 0x0190 }
                if (r4 == 0) goto L_0x0081
                java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0192, all -> 0x0190 }
                r5.<init>()     // Catch:{ Exception -> 0x0192, all -> 0x0190 }
                r5.append(r4)     // Catch:{ Exception -> 0x0192, all -> 0x0190 }
                java.lang.String r4 = "\n"
                r5.append(r4)     // Catch:{ Exception -> 0x0192, all -> 0x0190 }
                java.lang.String r4 = r5.toString()     // Catch:{ Exception -> 0x0192, all -> 0x0190 }
                r2.append(r4)     // Catch:{ Exception -> 0x0192, all -> 0x0190 }
                goto L_0x0066
            L_0x0081:
                java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x0192, all -> 0x0190 }
                java.lang.String r3 = "ANDROID:PERFILKO"
                int r3 = r2.indexOf(r3)     // Catch:{ Exception -> 0x0192, all -> 0x0190 }
                r4 = -1
                if (r3 == r4) goto L_0x0099
                r0 = 3
                java.lang.Byte r0 = java.lang.Byte.valueOf(r0)     // Catch:{ Exception -> 0x0192, all -> 0x0190 }
                if (r1 == 0) goto L_0x0098
                r1.disconnect()
            L_0x0098:
                return r0
            L_0x0099:
                java.lang.String r3 = "ANDROID:OK"
                int r3 = r2.indexOf(r3)     // Catch:{ Exception -> 0x0192, all -> 0x0190 }
                if (r3 != r4) goto L_0x00ab
                java.lang.Byte r0 = java.lang.Byte.valueOf(r15)     // Catch:{ Exception -> 0x0192, all -> 0x0190 }
                if (r1 == 0) goto L_0x00aa
                r1.disconnect()
            L_0x00aa:
                return r0
            L_0x00ab:
                java.lang.String r3 = "DATOSUSU:"
                int r3 = r2.indexOf(r3)     // Catch:{ Exception -> 0x0192, all -> 0x0190 }
                int r3 = r3 + 9
                java.lang.String r4 = ";"
                int r4 = r2.indexOf(r4, r3)     // Catch:{ Exception -> 0x0192, all -> 0x0190 }
                java.lang.String r3 = r2.substring(r3, r4)     // Catch:{ Exception -> 0x0192, all -> 0x0190 }
                int r4 = r4 + r0
                java.lang.String r5 = ";"
                int r5 = r2.indexOf(r5, r4)     // Catch:{ Exception -> 0x0192, all -> 0x0190 }
                java.lang.String r4 = r2.substring(r4, r5)     // Catch:{ Exception -> 0x0192, all -> 0x0190 }
                int r5 = r5 + r0
                java.lang.String r6 = ";"
                int r6 = r2.indexOf(r6, r5)     // Catch:{ Exception -> 0x0192, all -> 0x0190 }
                java.lang.String r5 = r2.substring(r5, r6)     // Catch:{ Exception -> 0x0192, all -> 0x0190 }
                int r5 = java.lang.Integer.parseInt(r5)     // Catch:{ Exception -> 0x0192, all -> 0x0190 }
                int r6 = r6 + r0
                java.lang.String r7 = ";"
                int r7 = r2.indexOf(r7, r6)     // Catch:{ Exception -> 0x0192, all -> 0x0190 }
                java.lang.String r6 = r2.substring(r6, r7)     // Catch:{ Exception -> 0x0192, all -> 0x0190 }
                int r6 = java.lang.Integer.parseInt(r6)     // Catch:{ Exception -> 0x0192, all -> 0x0190 }
                int r7 = r7 + r0
                java.lang.String r8 = ";"
                int r8 = r2.indexOf(r8, r7)     // Catch:{ Exception -> 0x0192, all -> 0x0190 }
                java.lang.String r7 = r2.substring(r7, r8)     // Catch:{ Exception -> 0x0192, all -> 0x0190 }
                int r7 = java.lang.Integer.parseInt(r7)     // Catch:{ Exception -> 0x0192, all -> 0x0190 }
                int r8 = r8 + r0
                java.lang.String r9 = ";"
                int r9 = r2.indexOf(r9, r8)     // Catch:{ Exception -> 0x0192, all -> 0x0190 }
                java.lang.String r8 = r2.substring(r8, r9)     // Catch:{ Exception -> 0x0192, all -> 0x0190 }
                int r8 = java.lang.Integer.parseInt(r8)     // Catch:{ Exception -> 0x0192, all -> 0x0190 }
                int r9 = r9 + r0
                java.lang.String r10 = ";"
                int r10 = r2.indexOf(r10, r9)     // Catch:{ Exception -> 0x0192, all -> 0x0190 }
                java.lang.String r9 = r2.substring(r9, r10)     // Catch:{ Exception -> 0x0192, all -> 0x0190 }
                int r9 = java.lang.Integer.parseInt(r9)     // Catch:{ Exception -> 0x0192, all -> 0x0190 }
                int r10 = r10 + r0
                java.lang.String r11 = ";"
                int r11 = r2.indexOf(r11, r10)     // Catch:{ Exception -> 0x0192, all -> 0x0190 }
                java.lang.String r10 = r2.substring(r10, r11)     // Catch:{ Exception -> 0x0192, all -> 0x0190 }
                int r10 = java.lang.Integer.parseInt(r10)     // Catch:{ Exception -> 0x0192, all -> 0x0190 }
                int r11 = r11 + r0
                java.lang.String r12 = ";"
                int r12 = r2.indexOf(r12, r11)     // Catch:{ Exception -> 0x0192, all -> 0x0190 }
                java.lang.String r11 = r2.substring(r11, r12)     // Catch:{ Exception -> 0x0192, all -> 0x0190 }
                int r12 = r12 + r0
                java.lang.String r13 = ";"
                int r13 = r2.indexOf(r13, r12)     // Catch:{ Exception -> 0x0192, all -> 0x0190 }
                java.lang.String r2 = r2.substring(r12, r13)     // Catch:{ Exception -> 0x0192, all -> 0x0190 }
                mega.boicot.preperfil r12 = mega.boicot.preperfil.this     // Catch:{ Exception -> 0x0192, all -> 0x0190 }
                android.content.SharedPreferences r12 = r12.f18478p     // Catch:{ Exception -> 0x0192, all -> 0x0190 }
                android.content.SharedPreferences$Editor r12 = r12.edit()     // Catch:{ Exception -> 0x0192, all -> 0x0190 }
                java.lang.String r13 = "nick"
                r12.putString(r13, r3)     // Catch:{ Exception -> 0x0192, all -> 0x0190 }
                java.lang.String r3 = "privados"
                r12.putInt(r3, r5)     // Catch:{ Exception -> 0x0192, all -> 0x0190 }
                java.lang.String r3 = "fnac_d"
                r12.putInt(r3, r6)     // Catch:{ Exception -> 0x0192, all -> 0x0190 }
                java.lang.String r3 = "fnac_m"
                r12.putInt(r3, r7)     // Catch:{ Exception -> 0x0192, all -> 0x0190 }
                java.lang.String r3 = "fnac_a"
                r12.putInt(r3, r8)     // Catch:{ Exception -> 0x0192, all -> 0x0190 }
                java.lang.String r3 = "sexo"
                r12.putInt(r3, r9)     // Catch:{ Exception -> 0x0192, all -> 0x0190 }
                java.lang.String r3 = "coments"
                r12.putInt(r3, r10)     // Catch:{ Exception -> 0x0192, all -> 0x0190 }
                java.lang.String r3 = "descr"
                r12.putString(r3, r11)     // Catch:{ Exception -> 0x0192, all -> 0x0190 }
                r12.commit()     // Catch:{ Exception -> 0x0192, all -> 0x0190 }
                java.lang.String r3 = "1"
                boolean r3 = r4.equals(r3)     // Catch:{ Exception -> 0x0192, all -> 0x0190 }
                if (r3 == 0) goto L_0x0179
                mega.boicot.preperfil r3 = mega.boicot.preperfil.this     // Catch:{ Exception -> 0x0192, all -> 0x0190 }
                r3.m23991a(r0, r2)     // Catch:{ Exception -> 0x0192, all -> 0x0190 }
                goto L_0x0186
            L_0x0179:
                mega.boicot.preperfil r2 = mega.boicot.preperfil.this     // Catch:{ Exception -> 0x0192, all -> 0x0190 }
                mega.boicot.config r2 = r2.f18467e     // Catch:{ Exception -> 0x0192, all -> 0x0190 }
                mega.boicot.preperfil r3 = mega.boicot.preperfil.this     // Catch:{ Exception -> 0x0192, all -> 0x0190 }
                java.io.File r2 = r2.mo20757a(r3, r0)     // Catch:{ Exception -> 0x0192, all -> 0x0190 }
                r2.delete()     // Catch:{ Exception -> 0x0192, all -> 0x0190 }
            L_0x0186:
                java.lang.Byte r0 = java.lang.Byte.valueOf(r0)     // Catch:{ Exception -> 0x0192, all -> 0x0190 }
                if (r1 == 0) goto L_0x018f
                r1.disconnect()
            L_0x018f:
                return r0
            L_0x0190:
                r15 = move-exception
                goto L_0x01a1
            L_0x0192:
                r0 = r1
                goto L_0x0197
            L_0x0194:
                r15 = move-exception
                r1 = r0
                goto L_0x01a1
            L_0x0197:
                java.lang.Byte r15 = java.lang.Byte.valueOf(r15)     // Catch:{ all -> 0x0194 }
                if (r0 == 0) goto L_0x01a0
                r0.disconnect()
            L_0x01a0:
                return r15
            L_0x01a1:
                if (r1 == 0) goto L_0x01a6
                r1.disconnect()
            L_0x01a6:
                throw r15
            */
            throw new UnsupportedOperationException("Method not decompiled: mega.boicot.preperfil.C5727a.doInBackground(java.lang.String[]):java.lang.Byte");
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void onPostExecute(Byte b) {
            try {
                preperfil.this.f18480r.dismiss();
            } catch (Exception unused) {
            }
            if (b.byteValue() == 1) {
                Intent intent = new Intent(preperfil.this, chat_perfil.class);
                if (preperfil.this.f18473k) {
                    intent = config.m23827a(intent, preperfil.this.f18479q);
                } else {
                    intent.putExtra("idsecc", preperfil.this.f18466d);
                }
                intent.putExtra("nocompletar", preperfil.this.f18469g);
                intent.putExtra("desde_buscusus", preperfil.this.f18470h);
                intent.putExtra("desde_buscvideos", preperfil.this.f18471i);
                intent.putExtra("desde_foro", preperfil.this.f18472j);
                intent.putExtra("desde_main", preperfil.this.f18475m);
                preperfil.this.startActivityForResult(intent, 0);
            } else if (b.byteValue() == 3) {
                preperfil.this.mo20952a(3);
            } else {
                preperfil.this.mo20952a(2);
            }
        }
    }

    public void onCreate(Bundle bundle) {
        String str;
        String str2;
        this.f18467e = (config) getApplicationContext();
        if (this.f18467e.f17881aN == null) {
            this.f18467e.mo20780b();
        }
        this.f18465c = this.f18467e.f18075l;
        this.f18479q = getIntent().getExtras();
        if (bundle == null) {
            this.f18474l = this.f18479q != null && this.f18479q.containsKey("es_root") && this.f18479q.getBoolean("es_root", false);
        } else {
            this.f18474l = bundle.containsKey("es_root") && bundle.getBoolean("es_root", false);
        }
        this.f18473k = this.f18479q.containsKey("externo");
        this.f18475m = this.f18479q.getBoolean("desde_main", false);
        if (this.f18475m) {
            str2 = this.f18467e.f17881aN;
            str = this.f18467e.f17882aO;
            this.f18466d = 0;
        } else if (this.f18473k) {
            str2 = this.f18467e.f17971bz[this.f18465c].f18314g;
            str = this.f18467e.f17971bz[this.f18465c].f18315h;
        } else {
            this.f18466d = this.f18479q.getInt("idsecc");
            str2 = this.f18467e.f17971bz[this.f18465c].f18314g;
            str = this.f18467e.f17971bz[this.f18465c].f18315h;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("#");
        sb.append(str2);
        boolean a = config.m23844a(sb.toString());
        this.f18463a = config.m23831a(str2, this.f18467e.f17890aW);
        if (VERSION.SDK_INT > 12 && !a) {
            setTheme(R.style.holonolight);
        }
        super.onCreate(bundle);
        setContentView(R.layout.preperfil);
        mo20951a();
        if (this.f18467e.f18080q > 0) {
            SearchManager searchManager = (SearchManager) getSystemService("search");
            searchManager.setOnCancelListener(new OnCancelListener() {
                public void onCancel() {
                    preperfil.this.f18468f = false;
                    preperfil.this.setResult(0);
                }
            });
            searchManager.setOnDismissListener(new OnDismissListener() {
                public void onDismiss() {
                    preperfil.this.f18476n = false;
                }
            });
        }
        this.f18469g = this.f18479q.getBoolean("nocompletar", false);
        this.f18470h = this.f18479q.getBoolean("desde_buscusus", false);
        this.f18471i = this.f18479q.getBoolean("desde_buscvideos", false);
        this.f18472j = this.f18479q.getBoolean("desde_foro", false);
        this.f18478p = getSharedPreferences("sh", 0);
        this.f18464b = this.f18478p.getInt("idusu", 0);
        if (!str2.equals("")) {
            Orientation orientation = Orientation.TOP_BOTTOM;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("#");
            sb2.append(str2);
            StringBuilder sb3 = new StringBuilder();
            sb3.append("#");
            sb3.append(str);
            findViewById(R.id.ll_princ).setBackgroundDrawable(new GradientDrawable(orientation, new int[]{Color.parseColor(sb2.toString()), Color.parseColor(sb3.toString())}));
        }
        if (!this.f18478p.getString("nick", "").equals("")) {
            this.f18480r = new ProgressDialog(this);
            this.f18480r.setMessage(getString(R.string.recuperando));
            this.f18480r.setIndeterminate(true);
            if (VERSION.SDK_INT > 20) {
                this.f18480r.setOnShowListener(new OnShowListener() {
                    public void onShow(DialogInterface dialogInterface) {
                        config.m23838a((ProgressBar) preperfil.this.f18480r.findViewById(16908301), preperfil.this.f18467e.f17890aW);
                    }
                });
            }
            this.f18480r.show();
            new C5727a().execute(new String[0]);
            return;
        }
        Intent intent = new Intent(this, chat_perfil.class);
        if (this.f18473k) {
            intent = config.m23827a(intent, this.f18479q);
        } else {
            intent.putExtra("idsecc", this.f18466d);
        }
        intent.putExtra("nocompletar", this.f18469g);
        intent.putExtra("desde_buscusus", this.f18470h);
        intent.putExtra("desde_buscvideos", this.f18471i);
        intent.putExtra("desde_foro", this.f18472j);
        if (!this.f18475m && this.f18467e.f18045dm != 2) {
            intent.putExtra("es_root", true);
        }
        this.f18474l = false;
        intent.putExtra("desde_main", this.f18475m);
        this.f18468f = true;
        Intent intent2 = new Intent();
        intent2.putExtra("finalizar", true);
        setResult(-1, intent2);
        startActivityForResult(intent, 0);
        finish();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo20952a(int i) {
        int i2 = i == 3 ? R.string.perfil_desactivado : R.string.error_http;
        Builder builder = new Builder(this);
        builder.setCancelable(false).setPositiveButton(getString(R.string.aceptar), null).setMessage(i2);
        try {
            final AlertDialog create = builder.create();
            if (!this.f18463a.equals("")) {
                create.setOnShowListener(new OnShowListener() {
                    public void onShow(DialogInterface dialogInterface) {
                        Button button = create.getButton(-1);
                        StringBuilder sb = new StringBuilder();
                        sb.append("#");
                        sb.append(preperfil.this.f18463a);
                        button.setTextColor(Color.parseColor(sb.toString()));
                    }
                });
            }
            create.show();
            ((TextView) create.findViewById(16908299)).setTypeface(Typeface.MONOSPACE);
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m23991a(int r4, java.lang.String r5) {
        /*
            r3 = this;
            java.net.URL r0 = new java.net.URL     // Catch:{ MalformedURLException -> 0x0029 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ MalformedURLException -> 0x0029 }
            r1.<init>()     // Catch:{ MalformedURLException -> 0x0029 }
            java.lang.String r2 = "http://imgs1.e-droid.net/srv/imgs/usus/"
            r1.append(r2)     // Catch:{ MalformedURLException -> 0x0029 }
            int r2 = r3.f18464b     // Catch:{ MalformedURLException -> 0x0029 }
            r1.append(r2)     // Catch:{ MalformedURLException -> 0x0029 }
            java.lang.String r2 = "_"
            r1.append(r2)     // Catch:{ MalformedURLException -> 0x0029 }
            r1.append(r4)     // Catch:{ MalformedURLException -> 0x0029 }
            java.lang.String r2 = ".jpg?v="
            r1.append(r2)     // Catch:{ MalformedURLException -> 0x0029 }
            r1.append(r5)     // Catch:{ MalformedURLException -> 0x0029 }
            java.lang.String r5 = r1.toString()     // Catch:{ MalformedURLException -> 0x0029 }
            r0.<init>(r5)     // Catch:{ MalformedURLException -> 0x0029 }
            goto L_0x002a
        L_0x0029:
            r0 = 0
        L_0x002a:
            java.net.URLConnection r5 = r0.openConnection()     // Catch:{  }
            java.net.HttpURLConnection r5 = (java.net.HttpURLConnection) r5     // Catch:{  }
            r0 = 1
            r5.setDoInput(r0)     // Catch:{  }
            r0 = 10000(0x2710, float:1.4013E-41)
            r5.setConnectTimeout(r0)     // Catch:{  }
            r0 = 20000(0x4e20, float:2.8026E-41)
            r5.setReadTimeout(r0)     // Catch:{  }
            r5.connect()     // Catch:{  }
            java.io.InputStream r0 = r5.getInputStream()     // Catch:{  }
            android.graphics.Bitmap r1 = android.graphics.BitmapFactory.decodeStream(r0)     // Catch:{  }
            r0.close()     // Catch:{  }
            r5.disconnect()     // Catch:{  }
            mega.boicot.config r5 = r3.f18467e     // Catch:{  }
            java.io.File r4 = r5.mo20757a(r3, r4)     // Catch:{  }
            java.io.FileOutputStream r5 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0061 }
            r5.<init>(r4)     // Catch:{ IOException -> 0x0061 }
            android.graphics.Bitmap$CompressFormat r4 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ IOException -> 0x0061 }
            r0 = 100
            r1.compress(r4, r0, r5)     // Catch:{ IOException -> 0x0061 }
        L_0x0061:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: mega.boicot.preperfil.m23991a(int, java.lang.String):void");
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i2 != -1) {
            finish();
        } else if (intent != null && intent.hasExtra("finalizar") && intent.getExtras().getBoolean("finalizar")) {
            if (!intent.getExtras().getBoolean("finalizar_app")) {
                this.f18474l = false;
            }
            setResult(-1, intent);
            finish();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo20951a() {
        int b = this.f18467e.mo20778b((Context) this);
        if (this.f18467e.f18045dm == 1) {
            this.f18477o = (ListView) findViewById(R.id.left_drawer);
            this.f18467e.mo20771a(this.f18477o);
        } else if (this.f18467e.f18045dm == 0) {
            int i = 0;
            for (int i2 = 0; i2 < this.f18467e.f17971bz.length; i2++) {
                if (!this.f18467e.f17971bz[i2].f18333z) {
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
        for (int i3 = 0; i3 < this.f18467e.f17923bD.length; i3++) {
            if (this.f18467e.f17923bD[i3] > 0) {
                findViewById(this.f18467e.f17923bD[i3]).setOnClickListener(this);
            }
        }
    }

    public void onClick(View view) {
        C5662h a = this.f18467e.mo20761a(view, (Context) this);
        if (a.f18227b) {
            this.f18468f = true;
            Intent intent = new Intent();
            intent.putExtra("finalizar", true);
            intent.putExtra("finalizar_app", a.f18228c);
            setResult(-1, intent);
        }
        if (a.f18229d) {
            startActivityForResult(a.f18226a, 0);
        } else if (a.f18226a != null) {
            if (a.f18227b && this.f18467e.f18045dm != 2) {
                a.f18226a.putExtra("es_root", true);
            }
            this.f18474l = false;
            startActivity(a.f18226a);
        }
        if (this.f18468f && !this.f18476n) {
            finish();
        }
    }

    public boolean onSearchRequested() {
        if (this.f18467e.f18080q == 0) {
            return false;
        }
        this.f18468f = true;
        this.f18476n = true;
        return super.onSearchRequested();
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getWindow().setFormat(1);
    }

    public void onStop() {
        super.onStop();
        if (this.f18468f && !this.f18476n) {
            finish();
        }
    }

    public void onDestroy() {
        if ((this.f18474l && isFinishing()) || config.f17841i) {
            config.m23861n(this);
        }
        super.onDestroy();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ((LinearLayout) findViewById(R.id.ll_princ)).removeViewAt(0);
        mo20951a();
    }
}
