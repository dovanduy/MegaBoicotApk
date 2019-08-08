package mega.boicot;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnShowListener;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.AsyncTask;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

public class guardarprimeravez extends Activity {

    /* renamed from: a */
    ProgressDialog f19832a;

    /* renamed from: b */
    SharedPreferences f19833b;

    /* renamed from: c */
    Bundle f19834c;

    /* renamed from: d */
    String f19835d;

    /* renamed from: e */
    int f19836e;

    /* renamed from: f */
    int f19837f;

    /* renamed from: g */
    boolean f19838g;

    /* renamed from: h */
    boolean f19839h;

    /* renamed from: i */
    config f19840i;

    /* renamed from: j */
    Activity f19841j;

    /* renamed from: mega.boicot.guardarprimeravez$a */
    private class C6014a extends AsyncTask<String, Void, Byte> {
        private C6014a() {
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Can't wrap try/catch for region: R(6:35|36|40|41|42|43) */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x02e9, code lost:
            r6 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
            r6.printStackTrace();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:39:0x0312, code lost:
            r0 = th;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:42:0x0316 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:44:0x0317 */
        /* JADX WARNING: Removed duplicated region for block: B:39:0x0312 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:21:0x02c6] */
        /* JADX WARNING: Removed duplicated region for block: B:51:0x0322 A[Catch:{ Exception -> 0x0379 }] */
        /* JADX WARNING: Removed duplicated region for block: B:57:0x034c A[Catch:{ Exception -> 0x0379 }] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Byte doInBackground(java.lang.String... r12) {
            /*
                r11 = this;
                r12 = 2
                org.apache.a.i.b r0 = new org.apache.a.i.b     // Catch:{ Exception -> 0x0379 }
                r0.<init>()     // Catch:{ Exception -> 0x0379 }
                r1 = 10000(0x2710, float:1.4013E-41)
                org.apache.p199a.p227i.C6530c.m25865c(r0, r1)     // Catch:{ Exception -> 0x0379 }
                r1 = 20000(0x4e20, float:2.8026E-41)
                org.apache.p199a.p227i.C6530c.m25861a(r0, r1)     // Catch:{ Exception -> 0x0379 }
                org.apache.a.f.b.h r1 = new org.apache.a.f.b.h     // Catch:{ Exception -> 0x0379 }
                r1.<init>(r0)     // Catch:{ Exception -> 0x0379 }
                org.apache.a.b.b.e r0 = new org.apache.a.b.b.e     // Catch:{ Exception -> 0x0379 }
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0379 }
                r2.<init>()     // Catch:{ Exception -> 0x0379 }
                java.lang.String r3 = "http://"
                r2.append(r3)     // Catch:{ Exception -> 0x0379 }
                java.lang.String r3 = mega.boicot.config.f17839g     // Catch:{ Exception -> 0x0379 }
                r2.append(r3)     // Catch:{ Exception -> 0x0379 }
                java.lang.String r3 = "/srv/guardar_primeravez.php?idusu="
                r2.append(r3)     // Catch:{ Exception -> 0x0379 }
                mega.boicot.guardarprimeravez r3 = mega.boicot.guardarprimeravez.this     // Catch:{ Exception -> 0x0379 }
                int r3 = r3.f19837f     // Catch:{ Exception -> 0x0379 }
                r2.append(r3)     // Catch:{ Exception -> 0x0379 }
                java.lang.String r3 = "&idapp="
                r2.append(r3)     // Catch:{ Exception -> 0x0379 }
                r3 = 718963(0xaf873, float:1.007482E-39)
                r2.append(r3)     // Catch:{ Exception -> 0x0379 }
                java.lang.String r3 = "&idl="
                r2.append(r3)     // Catch:{ Exception -> 0x0379 }
                java.util.Locale r3 = java.util.Locale.getDefault()     // Catch:{ Exception -> 0x0379 }
                java.lang.String r3 = r3.getLanguage()     // Catch:{ Exception -> 0x0379 }
                r2.append(r3)     // Catch:{ Exception -> 0x0379 }
                java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x0379 }
                r0.<init>(r2)     // Catch:{ Exception -> 0x0379 }
                org.apache.a.e.a.g r2 = new org.apache.a.e.a.g     // Catch:{ Exception -> 0x0379 }
                org.apache.a.e.a.d r3 = org.apache.p199a.p215e.p216a.C6367d.BROWSER_COMPATIBLE     // Catch:{ Exception -> 0x0379 }
                r2.<init>(r3)     // Catch:{ Exception -> 0x0379 }
                mega.boicot.guardarprimeravez r3 = mega.boicot.guardarprimeravez.this     // Catch:{ Exception -> 0x0379 }
                android.content.SharedPreferences r3 = r3.f19833b     // Catch:{ Exception -> 0x0379 }
                java.lang.String r4 = "nick"
                java.lang.String r5 = ""
                java.lang.String r3 = r3.getString(r4, r5)     // Catch:{ Exception -> 0x0379 }
                java.lang.String r4 = "UTF-8"
                java.lang.String r3 = java.net.URLEncoder.encode(r3, r4)     // Catch:{ Exception -> 0x0379 }
                java.lang.String r4 = "nombre"
                org.apache.a.e.a.a.f r5 = new org.apache.a.e.a.a.f     // Catch:{ Exception -> 0x0379 }
                r5.<init>(r3)     // Catch:{ Exception -> 0x0379 }
                r2.mo22648a(r4, r5)     // Catch:{ Exception -> 0x0379 }
                mega.boicot.guardarprimeravez r3 = mega.boicot.guardarprimeravez.this     // Catch:{ Exception -> 0x0379 }
                mega.boicot.config r3 = r3.f19840i     // Catch:{ Exception -> 0x0379 }
                int r3 = r3.f18062ed     // Catch:{ Exception -> 0x0379 }
                r4 = 3
                r5 = 0
                if (r3 != r4) goto L_0x00c5
                mega.boicot.guardarprimeravez r3 = mega.boicot.guardarprimeravez.this     // Catch:{ Exception -> 0x0379 }
                android.content.SharedPreferences r3 = r3.f19833b     // Catch:{ Exception -> 0x0379 }
                java.lang.String r6 = "email_confirmado"
                boolean r3 = r3.getBoolean(r6, r5)     // Catch:{ Exception -> 0x0379 }
                if (r3 != 0) goto L_0x00c5
                mega.boicot.guardarprimeravez r3 = mega.boicot.guardarprimeravez.this     // Catch:{ Exception -> 0x0379 }
                android.content.SharedPreferences r3 = r3.f19833b     // Catch:{ Exception -> 0x0379 }
                java.lang.String r6 = "email"
                java.lang.String r7 = ""
                java.lang.String r3 = r3.getString(r6, r7)     // Catch:{ Exception -> 0x0379 }
                java.lang.String r6 = "UTF-8"
                java.lang.String r3 = java.net.URLEncoder.encode(r3, r6)     // Catch:{ Exception -> 0x0379 }
                java.lang.String r6 = "email"
                org.apache.a.e.a.a.f r7 = new org.apache.a.e.a.a.f     // Catch:{ Exception -> 0x0379 }
                r7.<init>(r3)     // Catch:{ Exception -> 0x0379 }
                r2.mo22648a(r6, r7)     // Catch:{ Exception -> 0x0379 }
                mega.boicot.guardarprimeravez r3 = mega.boicot.guardarprimeravez.this     // Catch:{ Exception -> 0x0379 }
                android.os.Bundle r3 = r3.f19834c     // Catch:{ Exception -> 0x0379 }
                java.lang.String r6 = "contra"
                java.lang.String r7 = ""
                java.lang.String r3 = r3.getString(r6, r7)     // Catch:{ Exception -> 0x0379 }
                java.lang.String r6 = "UTF-8"
                java.lang.String r3 = java.net.URLEncoder.encode(r3, r6)     // Catch:{ Exception -> 0x0379 }
                java.lang.String r6 = "contra"
                org.apache.a.e.a.a.f r7 = new org.apache.a.e.a.a.f     // Catch:{ Exception -> 0x0379 }
                r7.<init>(r3)     // Catch:{ Exception -> 0x0379 }
                r2.mo22648a(r6, r7)     // Catch:{ Exception -> 0x0379 }
            L_0x00c5:
                mega.boicot.guardarprimeravez r3 = mega.boicot.guardarprimeravez.this     // Catch:{ Exception -> 0x0379 }
                android.content.SharedPreferences r3 = r3.f19833b     // Catch:{ Exception -> 0x0379 }
                java.lang.String r6 = "descr"
                java.lang.String r7 = ""
                java.lang.String r3 = r3.getString(r6, r7)     // Catch:{ Exception -> 0x0379 }
                java.lang.String r6 = "UTF-8"
                java.lang.String r3 = java.net.URLEncoder.encode(r3, r6)     // Catch:{ Exception -> 0x0379 }
                java.lang.String r6 = "descr"
                org.apache.a.e.a.a.f r7 = new org.apache.a.e.a.a.f     // Catch:{ Exception -> 0x0379 }
                r7.<init>(r3)     // Catch:{ Exception -> 0x0379 }
                r2.mo22648a(r6, r7)     // Catch:{ Exception -> 0x0379 }
                java.lang.String r3 = "privados"
                org.apache.a.e.a.a.f r6 = new org.apache.a.e.a.a.f     // Catch:{ Exception -> 0x0379 }
                java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0379 }
                r7.<init>()     // Catch:{ Exception -> 0x0379 }
                mega.boicot.guardarprimeravez r8 = mega.boicot.guardarprimeravez.this     // Catch:{ Exception -> 0x0379 }
                android.content.SharedPreferences r8 = r8.f19833b     // Catch:{ Exception -> 0x0379 }
                java.lang.String r9 = "privados"
                r10 = 1
                int r8 = r8.getInt(r9, r10)     // Catch:{ Exception -> 0x0379 }
                r7.append(r8)     // Catch:{ Exception -> 0x0379 }
                java.lang.String r8 = ""
                r7.append(r8)     // Catch:{ Exception -> 0x0379 }
                java.lang.String r7 = r7.toString()     // Catch:{ Exception -> 0x0379 }
                r6.<init>(r7)     // Catch:{ Exception -> 0x0379 }
                r2.mo22648a(r3, r6)     // Catch:{ Exception -> 0x0379 }
                java.lang.String r3 = "fnac_d"
                org.apache.a.e.a.a.f r6 = new org.apache.a.e.a.a.f     // Catch:{ Exception -> 0x0379 }
                java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0379 }
                r7.<init>()     // Catch:{ Exception -> 0x0379 }
                mega.boicot.guardarprimeravez r8 = mega.boicot.guardarprimeravez.this     // Catch:{ Exception -> 0x0379 }
                android.content.SharedPreferences r8 = r8.f19833b     // Catch:{ Exception -> 0x0379 }
                java.lang.String r9 = "fnac_d"
                int r8 = r8.getInt(r9, r5)     // Catch:{ Exception -> 0x0379 }
                r7.append(r8)     // Catch:{ Exception -> 0x0379 }
                java.lang.String r8 = ""
                r7.append(r8)     // Catch:{ Exception -> 0x0379 }
                java.lang.String r7 = r7.toString()     // Catch:{ Exception -> 0x0379 }
                r6.<init>(r7)     // Catch:{ Exception -> 0x0379 }
                r2.mo22648a(r3, r6)     // Catch:{ Exception -> 0x0379 }
                java.lang.String r3 = "fnac_m"
                org.apache.a.e.a.a.f r6 = new org.apache.a.e.a.a.f     // Catch:{ Exception -> 0x0379 }
                java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0379 }
                r7.<init>()     // Catch:{ Exception -> 0x0379 }
                mega.boicot.guardarprimeravez r8 = mega.boicot.guardarprimeravez.this     // Catch:{ Exception -> 0x0379 }
                android.content.SharedPreferences r8 = r8.f19833b     // Catch:{ Exception -> 0x0379 }
                java.lang.String r9 = "fnac_m"
                int r8 = r8.getInt(r9, r5)     // Catch:{ Exception -> 0x0379 }
                r7.append(r8)     // Catch:{ Exception -> 0x0379 }
                java.lang.String r8 = ""
                r7.append(r8)     // Catch:{ Exception -> 0x0379 }
                java.lang.String r7 = r7.toString()     // Catch:{ Exception -> 0x0379 }
                r6.<init>(r7)     // Catch:{ Exception -> 0x0379 }
                r2.mo22648a(r3, r6)     // Catch:{ Exception -> 0x0379 }
                java.lang.String r3 = "fnac_a"
                org.apache.a.e.a.a.f r6 = new org.apache.a.e.a.a.f     // Catch:{ Exception -> 0x0379 }
                java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0379 }
                r7.<init>()     // Catch:{ Exception -> 0x0379 }
                mega.boicot.guardarprimeravez r8 = mega.boicot.guardarprimeravez.this     // Catch:{ Exception -> 0x0379 }
                android.content.SharedPreferences r8 = r8.f19833b     // Catch:{ Exception -> 0x0379 }
                java.lang.String r9 = "fnac_a"
                int r8 = r8.getInt(r9, r5)     // Catch:{ Exception -> 0x0379 }
                r7.append(r8)     // Catch:{ Exception -> 0x0379 }
                java.lang.String r8 = ""
                r7.append(r8)     // Catch:{ Exception -> 0x0379 }
                java.lang.String r7 = r7.toString()     // Catch:{ Exception -> 0x0379 }
                r6.<init>(r7)     // Catch:{ Exception -> 0x0379 }
                r2.mo22648a(r3, r6)     // Catch:{ Exception -> 0x0379 }
                java.lang.String r3 = "sexo"
                org.apache.a.e.a.a.f r6 = new org.apache.a.e.a.a.f     // Catch:{ Exception -> 0x0379 }
                java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0379 }
                r7.<init>()     // Catch:{ Exception -> 0x0379 }
                mega.boicot.guardarprimeravez r8 = mega.boicot.guardarprimeravez.this     // Catch:{ Exception -> 0x0379 }
                android.content.SharedPreferences r8 = r8.f19833b     // Catch:{ Exception -> 0x0379 }
                java.lang.String r9 = "sexo"
                int r8 = r8.getInt(r9, r5)     // Catch:{ Exception -> 0x0379 }
                r7.append(r8)     // Catch:{ Exception -> 0x0379 }
                java.lang.String r8 = ""
                r7.append(r8)     // Catch:{ Exception -> 0x0379 }
                java.lang.String r7 = r7.toString()     // Catch:{ Exception -> 0x0379 }
                r6.<init>(r7)     // Catch:{ Exception -> 0x0379 }
                r2.mo22648a(r3, r6)     // Catch:{ Exception -> 0x0379 }
                java.lang.String r3 = "coments"
                org.apache.a.e.a.a.f r6 = new org.apache.a.e.a.a.f     // Catch:{ Exception -> 0x0379 }
                java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0379 }
                r7.<init>()     // Catch:{ Exception -> 0x0379 }
                mega.boicot.guardarprimeravez r8 = mega.boicot.guardarprimeravez.this     // Catch:{ Exception -> 0x0379 }
                android.content.SharedPreferences r8 = r8.f19833b     // Catch:{ Exception -> 0x0379 }
                java.lang.String r9 = "coments"
                int r8 = r8.getInt(r9, r10)     // Catch:{ Exception -> 0x0379 }
                r7.append(r8)     // Catch:{ Exception -> 0x0379 }
                java.lang.String r8 = ""
                r7.append(r8)     // Catch:{ Exception -> 0x0379 }
                java.lang.String r7 = r7.toString()     // Catch:{ Exception -> 0x0379 }
                r6.<init>(r7)     // Catch:{ Exception -> 0x0379 }
                r2.mo22648a(r3, r6)     // Catch:{ Exception -> 0x0379 }
                mega.boicot.guardarprimeravez r3 = mega.boicot.guardarprimeravez.this     // Catch:{ Exception -> 0x0379 }
                android.content.SharedPreferences r3 = r3.f19833b     // Catch:{ Exception -> 0x0379 }
                java.lang.String r6 = "x"
                java.lang.String r7 = ""
                java.lang.String r3 = r3.getString(r6, r7)     // Catch:{ Exception -> 0x0379 }
                java.lang.String r6 = ""
                boolean r3 = r3.equals(r6)     // Catch:{ Exception -> 0x0379 }
                if (r3 != 0) goto L_0x0200
                java.lang.String r3 = "x"
                org.apache.a.e.a.a.f r6 = new org.apache.a.e.a.a.f     // Catch:{ Exception -> 0x0379 }
                mega.boicot.guardarprimeravez r7 = mega.boicot.guardarprimeravez.this     // Catch:{ Exception -> 0x0379 }
                android.content.SharedPreferences r7 = r7.f19833b     // Catch:{ Exception -> 0x0379 }
                java.lang.String r8 = "x"
                java.lang.String r9 = ""
                java.lang.String r7 = r7.getString(r8, r9)     // Catch:{ Exception -> 0x0379 }
                r6.<init>(r7)     // Catch:{ Exception -> 0x0379 }
                r2.mo22648a(r3, r6)     // Catch:{ Exception -> 0x0379 }
                java.lang.String r3 = "y"
                org.apache.a.e.a.a.f r6 = new org.apache.a.e.a.a.f     // Catch:{ Exception -> 0x0379 }
                mega.boicot.guardarprimeravez r7 = mega.boicot.guardarprimeravez.this     // Catch:{ Exception -> 0x0379 }
                android.content.SharedPreferences r7 = r7.f19833b     // Catch:{ Exception -> 0x0379 }
                java.lang.String r8 = "y"
                java.lang.String r9 = ""
                java.lang.String r7 = r7.getString(r8, r9)     // Catch:{ Exception -> 0x0379 }
                r6.<init>(r7)     // Catch:{ Exception -> 0x0379 }
                r2.mo22648a(r3, r6)     // Catch:{ Exception -> 0x0379 }
            L_0x0200:
                r0.mo22444a(r2)     // Catch:{ Exception -> 0x0379 }
                java.lang.String r2 = "User-Agent"
                java.lang.String r3 = "Android Vinebre Software"
                r0.mo22909b(r2, r3)     // Catch:{ Exception -> 0x0379 }
                org.apache.a.q r0 = r1.mo22459a(r0)     // Catch:{ Exception -> 0x0379 }
                java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch:{ Exception -> 0x0379 }
                java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x0379 }
                org.apache.a.i r0 = r0.mo22939b()     // Catch:{ Exception -> 0x0379 }
                java.io.InputStream r0 = r0.mo22473f()     // Catch:{ Exception -> 0x0379 }
                java.lang.String r3 = "UTF-8"
                r2.<init>(r0, r3)     // Catch:{ Exception -> 0x0379 }
                r1.<init>(r2)     // Catch:{ Exception -> 0x0379 }
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0379 }
                r0.<init>()     // Catch:{ Exception -> 0x0379 }
            L_0x0227:
                java.lang.String r2 = r1.readLine()     // Catch:{ Exception -> 0x0379 }
                if (r2 == 0) goto L_0x0231
                r0.append(r2)     // Catch:{ Exception -> 0x0379 }
                goto L_0x0227
            L_0x0231:
                java.lang.String r1 = " EMAIL:"
                int r1 = r0.indexOf(r1)     // Catch:{ Exception -> 0x0379 }
                r2 = -1
                if (r1 == r2) goto L_0x0261
                java.lang.String r1 = " EMAIL:"
                int r1 = r0.indexOf(r1)     // Catch:{ Exception -> 0x0379 }
                int r1 = r1 + 7
                java.lang.String r3 = "@FINEMAIL@"
                int r3 = r0.indexOf(r3, r1)     // Catch:{ Exception -> 0x0379 }
                java.lang.String r1 = r0.substring(r1, r3)     // Catch:{ Exception -> 0x0379 }
                mega.boicot.guardarprimeravez r3 = mega.boicot.guardarprimeravez.this     // Catch:{ Exception -> 0x0379 }
                android.content.SharedPreferences r3 = r3.f19833b     // Catch:{ Exception -> 0x0379 }
                android.content.SharedPreferences$Editor r3 = r3.edit()     // Catch:{ Exception -> 0x0379 }
                java.lang.String r6 = "email"
                r3.putString(r6, r1)     // Catch:{ Exception -> 0x0379 }
                java.lang.String r1 = "email_confirmado"
                r3.putBoolean(r1, r10)     // Catch:{ Exception -> 0x0379 }
                r3.commit()     // Catch:{ Exception -> 0x0379 }
            L_0x0261:
                java.lang.String r1 = " TRANS:"
                int r1 = r0.indexOf(r1)     // Catch:{ Exception -> 0x0379 }
                if (r1 == r2) goto L_0x031a
                mega.boicot.guardarprimeravez r1 = mega.boicot.guardarprimeravez.this     // Catch:{ Exception -> 0x0379 }
                java.lang.String r3 = "sh"
                android.content.SharedPreferences r1 = r1.getSharedPreferences(r3, r5)     // Catch:{ Exception -> 0x0379 }
                android.content.SharedPreferences$Editor r1 = r1.edit()     // Catch:{ Exception -> 0x0379 }
                java.lang.String r3 = " TRANS:"
                int r3 = r0.indexOf(r3)     // Catch:{ Exception -> 0x0379 }
                int r3 = r3 + 7
                java.lang.String r6 = "-"
                int r6 = r0.indexOf(r6, r3)     // Catch:{ Exception -> 0x0379 }
                java.lang.String r3 = r0.substring(r3, r6)     // Catch:{ Exception -> 0x0379 }
                java.lang.String r6 = "@"
                java.lang.String[] r3 = r3.split(r6)     // Catch:{ Exception -> 0x0379 }
                r5 = r3[r5]     // Catch:{ Exception -> 0x0379 }
                r6 = r3[r10]     // Catch:{ Exception -> 0x0379 }
                r3 = r3[r12]     // Catch:{ Exception -> 0x0379 }
                java.lang.String r7 = "idusu"
                int r8 = java.lang.Integer.parseInt(r5)     // Catch:{ Exception -> 0x0379 }
                r1.putInt(r7, r8)     // Catch:{ Exception -> 0x0379 }
                java.lang.String r7 = "cod"
                r1.putString(r7, r6)     // Catch:{ Exception -> 0x0379 }
                java.lang.String r6 = "cod_g"
                r1.putString(r6, r3)     // Catch:{ Exception -> 0x0379 }
                r1.commit()     // Catch:{ Exception -> 0x0379 }
                mega.boicot.guardarprimeravez r1 = mega.boicot.guardarprimeravez.this     // Catch:{ Exception -> 0x0379 }
                int r6 = java.lang.Integer.parseInt(r5)     // Catch:{ Exception -> 0x0379 }
                r1.f19837f = r6     // Catch:{ Exception -> 0x0379 }
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0379 }
                r1.<init>()     // Catch:{ Exception -> 0x0379 }
                r1.append(r5)     // Catch:{ Exception -> 0x0379 }
                java.lang.String r5 = "@"
                r1.append(r5)     // Catch:{ Exception -> 0x0379 }
                r1.append(r3)     // Catch:{ Exception -> 0x0379 }
                java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x0379 }
                r3 = 0
                java.io.File r5 = new java.io.File     // Catch:{ Exception -> 0x0317, all -> 0x0312 }
                java.io.File r6 = android.os.Environment.getExternalStorageDirectory()     // Catch:{ Exception -> 0x0317, all -> 0x0312 }
                mega.boicot.guardarprimeravez r7 = mega.boicot.guardarprimeravez.this     // Catch:{ Exception -> 0x0317, all -> 0x0312 }
                java.lang.String r7 = r7.getPackageName()     // Catch:{ Exception -> 0x0317, all -> 0x0312 }
                r5.<init>(r6, r7)     // Catch:{ Exception -> 0x0317, all -> 0x0312 }
                boolean r6 = r5.exists()     // Catch:{ Exception -> 0x0317, all -> 0x0312 }
                if (r6 != 0) goto L_0x02ed
                r5.mkdir()     // Catch:{ Exception -> 0x0317, all -> 0x0312 }
                java.io.File r6 = new java.io.File     // Catch:{ Exception -> 0x0317, all -> 0x0312 }
                java.lang.String r7 = ".nomedia"
                r6.<init>(r5, r7)     // Catch:{ Exception -> 0x0317, all -> 0x0312 }
                r6.createNewFile()     // Catch:{ Exception -> 0x02e9, all -> 0x0312 }
                goto L_0x02ed
            L_0x02e9:
                r6 = move-exception
                r6.printStackTrace()     // Catch:{ Exception -> 0x0317, all -> 0x0312 }
            L_0x02ed:
                java.io.File r6 = new java.io.File     // Catch:{ Exception -> 0x0317, all -> 0x0312 }
                java.lang.String r7 = "vinebre_ac.txt"
                r6.<init>(r5, r7)     // Catch:{ Exception -> 0x0317, all -> 0x0312 }
                java.io.FileOutputStream r5 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x0317, all -> 0x0312 }
                r5.<init>(r6)     // Catch:{ Exception -> 0x0317, all -> 0x0312 }
                java.io.BufferedWriter r3 = new java.io.BufferedWriter     // Catch:{ Exception -> 0x0310, all -> 0x030d }
                java.io.OutputStreamWriter r6 = new java.io.OutputStreamWriter     // Catch:{ Exception -> 0x0310, all -> 0x030d }
                r6.<init>(r5)     // Catch:{ Exception -> 0x0310, all -> 0x030d }
                r3.<init>(r6)     // Catch:{ Exception -> 0x0310, all -> 0x030d }
                r3.write(r1)     // Catch:{ Exception -> 0x0310, all -> 0x030d }
                r3.close()     // Catch:{ Exception -> 0x0310, all -> 0x030d }
                r5.close()     // Catch:{ Exception -> 0x031a }
                goto L_0x031a
            L_0x030d:
                r0 = move-exception
                r3 = r5
                goto L_0x0313
            L_0x0310:
                r3 = r5
                goto L_0x0317
            L_0x0312:
                r0 = move-exception
            L_0x0313:
                r3.close()     // Catch:{ Exception -> 0x0316 }
            L_0x0316:
                throw r0     // Catch:{ Exception -> 0x0379 }
            L_0x0317:
                r3.close()     // Catch:{ Exception -> 0x031a }
            L_0x031a:
                java.lang.String r1 = "ANDROID:OK COD:"
                int r1 = r0.indexOf(r1)     // Catch:{ Exception -> 0x0379 }
                if (r1 == r2) goto L_0x034c
                r1 = 15
                r3 = 21
                java.lang.String r1 = r0.substring(r1, r3)     // Catch:{ Exception -> 0x0379 }
                mega.boicot.guardarprimeravez r3 = mega.boicot.guardarprimeravez.this     // Catch:{ Exception -> 0x0379 }
                android.content.SharedPreferences r3 = r3.f19833b     // Catch:{ Exception -> 0x0379 }
                android.content.SharedPreferences$Editor r3 = r3.edit()     // Catch:{ Exception -> 0x0379 }
                java.lang.String r5 = "cod"
                r3.putString(r5, r1)     // Catch:{ Exception -> 0x0379 }
                r3.commit()     // Catch:{ Exception -> 0x0379 }
                java.lang.String r1 = "PEND:1"
                int r0 = r0.indexOf(r1)     // Catch:{ Exception -> 0x0379 }
                if (r0 == r2) goto L_0x0347
                java.lang.Byte r0 = java.lang.Byte.valueOf(r4)     // Catch:{ Exception -> 0x0379 }
                return r0
            L_0x0347:
                java.lang.Byte r0 = java.lang.Byte.valueOf(r10)     // Catch:{ Exception -> 0x0379 }
                return r0
            L_0x034c:
                java.lang.String r1 = "ANDROID:OK"
                int r1 = r0.indexOf(r1)     // Catch:{ Exception -> 0x0379 }
                if (r1 == r2) goto L_0x0366
                java.lang.String r1 = "PEND:1"
                int r0 = r0.indexOf(r1)     // Catch:{ Exception -> 0x0379 }
                if (r0 == r2) goto L_0x0361
                java.lang.Byte r0 = java.lang.Byte.valueOf(r4)     // Catch:{ Exception -> 0x0379 }
                return r0
            L_0x0361:
                java.lang.Byte r0 = java.lang.Byte.valueOf(r10)     // Catch:{ Exception -> 0x0379 }
                return r0
            L_0x0366:
                java.lang.String r1 = "ANDROID:KO -CONTRA-"
                int r0 = r0.indexOf(r1)     // Catch:{ Exception -> 0x0379 }
                if (r0 == r2) goto L_0x0374
                r0 = 4
                java.lang.Byte r0 = java.lang.Byte.valueOf(r0)     // Catch:{ Exception -> 0x0379 }
                return r0
            L_0x0374:
                java.lang.Byte r0 = java.lang.Byte.valueOf(r12)     // Catch:{ Exception -> 0x0379 }
                return r0
            L_0x0379:
                java.lang.Byte r12 = java.lang.Byte.valueOf(r12)
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: mega.boicot.guardarprimeravez.C6014a.doInBackground(java.lang.String[]):java.lang.Byte");
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void onPostExecute(Byte b) {
            Intent intent;
            try {
                guardarprimeravez.this.f19832a.dismiss();
            } catch (Exception unused) {
            }
            boolean z = false;
            if (b.byteValue() == 1) {
                if (guardarprimeravez.this.f19840i.f18062ed == 3) {
                    Editor edit = guardarprimeravez.this.f19833b.edit();
                    edit.putBoolean("email_confirmado", true);
                    edit.commit();
                }
                Intent intent2 = new Intent(guardarprimeravez.this, s_guardarperfil.class);
                intent2.putExtra("foto1_modif", guardarprimeravez.this.f19833b.getString("foto1_modif", "0"));
                guardarprimeravez.this.startService(intent2);
                if (!guardarprimeravez.this.f19839h) {
                    if (guardarprimeravez.this.f19834c != null && guardarprimeravez.this.f19834c.getBoolean("desde_buscusus", false)) {
                        intent = new Intent(guardarprimeravez.this, t_buscusus.class);
                    } else if (guardarprimeravez.this.f19834c != null && guardarprimeravez.this.f19834c.getBoolean("desde_buscvideos", false)) {
                        intent = new Intent(guardarprimeravez.this, t_buscvideos.class);
                    } else if (guardarprimeravez.this.f19834c == null || !guardarprimeravez.this.f19834c.getBoolean("desde_foro", false)) {
                        intent = new Intent(guardarprimeravez.this, t_chat.class);
                    } else {
                        intent = new Intent(guardarprimeravez.this, t_url.class);
                    }
                    if (guardarprimeravez.this.f19838g) {
                        intent = config.m23827a(intent, guardarprimeravez.this.f19834c);
                    } else {
                        intent.putExtra("idsecc", guardarprimeravez.this.f19836e);
                    }
                    if (guardarprimeravez.this.f19840i.f18045dm != 2) {
                        intent.putExtra("es_root", true);
                    }
                    guardarprimeravez.this.startActivity(intent);
                } else if (guardarprimeravez.this.f19840i.f18045dm == 2) {
                    guardarprimeravez.this.f19841j.finish();
                } else {
                    int i = 0;
                    while (!z && i < guardarprimeravez.this.f19840i.f17971bz.length) {
                        if (!guardarprimeravez.this.f19840i.f17971bz[i].f18333z) {
                            z = true;
                        } else {
                            i++;
                        }
                    }
                    if (z) {
                        C5662h a = guardarprimeravez.this.f19840i.mo20762a(Integer.valueOf(i), (Context) guardarprimeravez.this);
                        a.f18226a.putExtra("es_root", true);
                        guardarprimeravez.this.startActivity(a.f18226a);
                        return;
                    }
                    guardarprimeravez.this.f19841j.finish();
                }
            } else if (b.byteValue() == 3) {
                if (guardarprimeravez.this.f19840i.f18062ed == 3) {
                    Editor edit2 = guardarprimeravez.this.f19833b.edit();
                    edit2.putBoolean("email_confirmado", false);
                    edit2.commit();
                }
                try {
                    final AlertDialog create = new Builder(guardarprimeravez.this).setCancelable(false).setPositiveButton(guardarprimeravez.this.getString(R.string.aceptar), new OnClickListener() {
                        public void onClick(DialogInterface dialogInterface, int i) {
                            Intent intent = new Intent(guardarprimeravez.this, chat_perfil.class);
                            if (guardarprimeravez.this.f19838g) {
                                intent = config.m23827a(intent, guardarprimeravez.this.f19834c);
                            } else {
                                intent.putExtra("idsecc", guardarprimeravez.this.f19836e);
                            }
                            if (guardarprimeravez.this.f19840i.f18045dm != 2) {
                                intent.putExtra("es_root", true);
                            }
                            intent.putExtra("desde_main", guardarprimeravez.this.f19839h);
                            if (guardarprimeravez.this.f19834c != null) {
                                intent.putExtra("desde_buscusus", guardarprimeravez.this.f19834c.getBoolean("desde_buscusus", false));
                                intent.putExtra("desde_buscvideos", guardarprimeravez.this.f19834c.getBoolean("desde_buscvideos", false));
                                intent.putExtra("desde_foro", guardarprimeravez.this.f19834c.getBoolean("desde_foro", false));
                            }
                            intent.putExtra("nocompletar", true);
                            guardarprimeravez.this.startActivity(intent);
                        }
                    }).setMessage(R.string.contra_faltaconfirm).create();
                    if (!guardarprimeravez.this.f19835d.equals("")) {
                        create.setOnShowListener(new OnShowListener() {
                            public void onShow(DialogInterface dialogInterface) {
                                Button button = create.getButton(-1);
                                StringBuilder sb = new StringBuilder();
                                sb.append("#");
                                sb.append(guardarprimeravez.this.f19835d);
                                button.setTextColor(Color.parseColor(sb.toString()));
                            }
                        });
                    }
                    create.show();
                    try {
                        ((TextView) create.findViewById(16908299)).setTypeface(Typeface.MONOSPACE);
                    } catch (Exception unused2) {
                    }
                } catch (Exception unused3) {
                    Intent intent3 = new Intent(guardarprimeravez.this, chat_perfil.class);
                    if (guardarprimeravez.this.f19838g) {
                        intent3 = config.m23827a(intent3, guardarprimeravez.this.f19834c);
                    } else {
                        intent3.putExtra("idsecc", guardarprimeravez.this.f19836e);
                    }
                    if (guardarprimeravez.this.f19840i.f18045dm != 2) {
                        intent3.putExtra("es_root", true);
                    }
                    intent3.putExtra("desde_main", guardarprimeravez.this.f19839h);
                    if (guardarprimeravez.this.f19834c != null) {
                        intent3.putExtra("desde_buscusus", guardarprimeravez.this.f19834c.getBoolean("desde_buscusus", false));
                        intent3.putExtra("desde_buscvideos", guardarprimeravez.this.f19834c.getBoolean("desde_buscvideos", false));
                        intent3.putExtra("desde_foro", guardarprimeravez.this.f19834c.getBoolean("desde_foro", false));
                    }
                    intent3.putExtra("nocompletar", true);
                    guardarprimeravez.this.startActivity(intent3);
                }
            } else {
                if (b.byteValue() == 2) {
                    Editor edit3 = guardarprimeravez.this.f19833b.edit();
                    edit3.remove("nick");
                    edit3.commit();
                }
                try {
                    final AlertDialog create2 = new Builder(guardarprimeravez.this).setCancelable(false).setPositiveButton(guardarprimeravez.this.getString(R.string.aceptar), new OnClickListener() {
                        public void onClick(DialogInterface dialogInterface, int i) {
                            Intent intent = new Intent(guardarprimeravez.this, chat_perfil.class);
                            if (guardarprimeravez.this.f19838g) {
                                intent = config.m23827a(intent, guardarprimeravez.this.f19834c);
                            } else {
                                intent.putExtra("idsecc", guardarprimeravez.this.f19836e);
                            }
                            if (guardarprimeravez.this.f19840i.f18045dm != 2) {
                                intent.putExtra("es_root", true);
                            }
                            intent.putExtra("desde_main", guardarprimeravez.this.f19839h);
                            if (guardarprimeravez.this.f19834c != null) {
                                intent.putExtra("desde_buscusus", guardarprimeravez.this.f19834c.getBoolean("desde_buscusus", false));
                                intent.putExtra("desde_buscvideos", guardarprimeravez.this.f19834c.getBoolean("desde_buscvideos", false));
                                intent.putExtra("desde_foro", guardarprimeravez.this.f19834c.getBoolean("desde_foro", false));
                            }
                            guardarprimeravez.this.startActivity(intent);
                        }
                    }).create();
                    if (b.byteValue() == 4) {
                        create2.setMessage(guardarprimeravez.this.getResources().getString(R.string.contra_ko));
                        Editor edit4 = guardarprimeravez.this.f19833b.edit();
                        edit4.putBoolean("mostrar_recordarcontra", true);
                        edit4.commit();
                    } else {
                        create2.setMessage(guardarprimeravez.this.getResources().getString(R.string.error_http));
                    }
                    if (!guardarprimeravez.this.f19835d.equals("")) {
                        create2.setOnShowListener(new OnShowListener() {
                            public void onShow(DialogInterface dialogInterface) {
                                Button button = create2.getButton(-1);
                                StringBuilder sb = new StringBuilder();
                                sb.append("#");
                                sb.append(guardarprimeravez.this.f19835d);
                                button.setTextColor(Color.parseColor(sb.toString()));
                            }
                        });
                    }
                    create2.show();
                    ((TextView) create2.findViewById(16908299)).setTypeface(Typeface.MONOSPACE);
                } catch (Exception unused4) {
                    Intent intent4 = new Intent(guardarprimeravez.this, chat_perfil.class);
                    if (guardarprimeravez.this.f19838g) {
                        intent4 = config.m23827a(intent4, guardarprimeravez.this.f19834c);
                    } else {
                        intent4.putExtra("idsecc", guardarprimeravez.this.f19836e);
                    }
                    if (guardarprimeravez.this.f19840i.f18045dm != 2) {
                        intent4.putExtra("es_root", true);
                    }
                    intent4.putExtra("desde_main", guardarprimeravez.this.f19839h);
                    if (guardarprimeravez.this.f19834c != null) {
                        intent4.putExtra("desde_buscusus", guardarprimeravez.this.f19834c.getBoolean("desde_buscusus", false));
                        intent4.putExtra("desde_buscvideos", guardarprimeravez.this.f19834c.getBoolean("desde_buscvideos", false));
                        intent4.putExtra("desde_foro", guardarprimeravez.this.f19834c.getBoolean("desde_foro", false));
                    }
                    guardarprimeravez.this.startActivity(intent4);
                }
            }
        }
    }

    public void onCreate(Bundle bundle) {
        String str;
        this.f19840i = (config) getApplicationContext();
        if (this.f19840i.f17881aN == null) {
            this.f19840i.mo20780b();
        }
        this.f19841j = this;
        this.f19834c = getIntent().getExtras();
        this.f19838g = this.f19834c != null && this.f19834c.containsKey("externo");
        this.f19839h = this.f19834c != null && this.f19834c.getBoolean("desde_main", false);
        if (this.f19839h) {
            str = this.f19840i.f17881aN;
            this.f19836e = 0;
        } else if (this.f19838g) {
            str = this.f19840i.f17971bz[this.f19840i.f18075l].f18314g;
        } else {
            str = this.f19840i.f17971bz[this.f19840i.f18075l].f18314g;
            this.f19836e = this.f19834c.getInt("idsecc");
        }
        this.f19835d = config.m23831a(str, this.f19840i.f17890aW);
        if (VERSION.SDK_INT > 12) {
            StringBuilder sb = new StringBuilder();
            sb.append("#");
            sb.append(str);
            if (!config.m23844a(sb.toString())) {
                setTheme(R.style.holonolight);
            }
        }
        super.onCreate(bundle);
        this.f19833b = getSharedPreferences("sh", 0);
        this.f19837f = this.f19833b.getInt("idusu", 0);
        this.f19832a = new ProgressDialog(this);
        this.f19832a.setMessage(getString(R.string.guardando));
        this.f19832a.setIndeterminate(true);
        if (VERSION.SDK_INT > 20) {
            this.f19832a.setOnShowListener(new OnShowListener() {
                public void onShow(DialogInterface dialogInterface) {
                    config.m23838a((ProgressBar) guardarprimeravez.this.f19832a.findViewById(16908301), guardarprimeravez.this.f19840i.f17890aW);
                }
            });
        }
        this.f19832a.show();
        new C6014a().execute(new String[0]);
    }

    public void onStop() {
        super.onStop();
        finish();
    }
}
