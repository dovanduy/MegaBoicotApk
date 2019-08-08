package mega.boicot;

import android.app.IntentService;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.provider.MediaStore.Images.Media;
import android.widget.Toast;
import com.google.android.exoplayer2.C2793C;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.InputStreamReader;
import java.net.URLEncoder;
import org.apache.p199a.p202b.p204b.C6274e;
import org.apache.p199a.p202b.p204b.C6276g;
import org.apache.p199a.p215e.p216a.C6367d;
import org.apache.p199a.p215e.p216a.C6370g;
import org.apache.p199a.p215e.p216a.p217a.C6359b;
import org.apache.p199a.p215e.p216a.p217a.C6360c;
import org.apache.p199a.p215e.p216a.p217a.C6363f;
import org.apache.p199a.p218f.p220b.C6409h;
import org.apache.p199a.p227i.C6529b;
import org.apache.p199a.p227i.C6530c;
import org.apache.p199a.p227i.C6531d;

public class s_guardarperfil extends IntentService {

    /* renamed from: a */
    config f20185a;

    /* renamed from: b */
    Handler f20186b = new Handler();

    /* renamed from: c */
    Bundle f20187c;

    /* renamed from: d */
    SharedPreferences f20188d;

    /* renamed from: e */
    int f20189e;

    /* renamed from: mega.boicot.s_guardarperfil$a */
    private class C6086a implements Runnable {

        /* renamed from: a */
        String f20190a;

        /* renamed from: b */
        Integer f20191b;

        public C6086a(Integer num, Integer num2) {
            this.f20190a = s_guardarperfil.this.getString(num.intValue());
            this.f20191b = num2;
        }

        public void run() {
            config.m23839a(Toast.makeText(s_guardarperfil.this.getApplicationContext(), this.f20190a, this.f20191b.intValue()));
        }
    }

    /* renamed from: mega.boicot.s_guardarperfil$b */
    private class C6087b extends AsyncTask<String, Void, Byte> {
        private C6087b() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Byte doInBackground(String... strArr) {
            Bitmap bitmap;
            try {
                C6529b bVar = new C6529b();
                C6530c.m25865c(bVar, 10000);
                C6530c.m25861a((C6531d) bVar, 60000);
                C6409h hVar = new C6409h(bVar);
                StringBuilder sb = new StringBuilder();
                sb.append("http://");
                sb.append(config.f17839g);
                sb.append("/srv/guardar_perfil.php?idusu=");
                sb.append(s_guardarperfil.this.f20189e);
                sb.append("&idapp=");
                sb.append(718963);
                sb.append("&c=");
                sb.append(s_guardarperfil.this.f20188d.getString("cod", ""));
                C6274e eVar = new C6274e(sb.toString());
                C6370g gVar = new C6370g(C6367d.BROWSER_COMPATIBLE);
                Bundle bundle = s_guardarperfil.this.f20187c;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("foto");
                sb2.append(1);
                sb2.append("_modif");
                if (bundle.getString(sb2.toString()).equals("1")) {
                    if (s_guardarperfil.this.f20185a.mo20757a((Context) s_guardarperfil.this, 1).exists()) {
                        File a = s_guardarperfil.this.f20185a.mo20757a((Context) s_guardarperfil.this, 1);
                        Options options = new Options();
                        options.inJustDecodeBounds = true;
                        BitmapFactory.decodeFile(a.getPath(), options);
                        int i = options.outWidth;
                        int i2 = options.outWidth;
                        int i3 = options.outHeight;
                        if (!(i2 <= 600 && i3 <= 600)) {
                            config config = s_guardarperfil.this.f20185a;
                            int round = Math.round(((float) i2) / ((float) config.m23824a(i2, i3, 600, 600)));
                            Options options2 = new Options();
                            options2.inSampleSize = round;
                            bitmap = BitmapFactory.decodeFile(a.getPath(), options2);
                        } else {
                            bitmap = Media.getBitmap(s_guardarperfil.this.getContentResolver(), Uri.fromFile(a));
                        }
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        bitmap.compress(CompressFormat.JPEG, 100, byteArrayOutputStream);
                        C6359b bVar2 = new C6359b(byteArrayOutputStream.toByteArray(), "temporal.jpg");
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("foto");
                        sb3.append(1);
                        gVar.mo22648a(sb3.toString(), (C6360c) bVar2);
                    } else {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("foto");
                        sb4.append(1);
                        sb4.append("_elim");
                        gVar.mo22648a(sb4.toString(), (C6360c) new C6363f("1"));
                    }
                }
                gVar.mo22648a("nombre", (C6360c) new C6363f(URLEncoder.encode(s_guardarperfil.this.f20188d.getString("nick", ""), C2793C.UTF8_NAME)));
                gVar.mo22648a("descr", (C6360c) new C6363f(URLEncoder.encode(s_guardarperfil.this.f20188d.getString("descr", ""), C2793C.UTF8_NAME)));
                StringBuilder sb5 = new StringBuilder();
                sb5.append(s_guardarperfil.this.f20188d.getInt("privados", 1));
                sb5.append("");
                gVar.mo22648a("privados", (C6360c) new C6363f(sb5.toString()));
                gVar.mo22648a("foto1_modif", (C6360c) new C6363f(s_guardarperfil.this.f20187c.getString("foto1_modif")));
                StringBuilder sb6 = new StringBuilder();
                sb6.append(s_guardarperfil.this.f20188d.getInt("fnac_d", 0));
                sb6.append("");
                gVar.mo22648a("fnac_d", (C6360c) new C6363f(sb6.toString()));
                StringBuilder sb7 = new StringBuilder();
                sb7.append(s_guardarperfil.this.f20188d.getInt("fnac_m", 0));
                sb7.append("");
                gVar.mo22648a("fnac_m", (C6360c) new C6363f(sb7.toString()));
                StringBuilder sb8 = new StringBuilder();
                sb8.append(s_guardarperfil.this.f20188d.getInt("fnac_a", 0));
                sb8.append("");
                gVar.mo22648a("fnac_a", (C6360c) new C6363f(sb8.toString()));
                StringBuilder sb9 = new StringBuilder();
                sb9.append(s_guardarperfil.this.f20188d.getInt("sexo", 0));
                sb9.append("");
                gVar.mo22648a("sexo", (C6360c) new C6363f(sb9.toString()));
                StringBuilder sb10 = new StringBuilder();
                sb10.append(s_guardarperfil.this.f20188d.getInt("coments", 1));
                sb10.append("");
                gVar.mo22648a("coments", (C6360c) new C6363f(sb10.toString()));
                eVar.mo22444a(gVar);
                eVar.mo22909b("User-Agent", "Android Vinebre Software");
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(hVar.mo22459a((C6276g) eVar).mo22939b().mo22473f(), C2793C.UTF8_NAME));
                StringBuilder sb11 = new StringBuilder();
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    sb11.append(readLine);
                }
                if (sb11.indexOf("ANDROID:OK") != -1) {
                    return Byte.valueOf(1);
                }
                return Byte.valueOf(0);
            } catch (Exception unused) {
                return Byte.valueOf(0);
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void onPostExecute(Byte b) {
            if (b.byteValue() == 1) {
                s_guardarperfil.this.f20186b.post(new C6086a(Integer.valueOf(R.string.guardado), Integer.valueOf(0)));
            } else {
                s_guardarperfil.this.f20186b.post(new C6086a(Integer.valueOf(R.string.error_http), Integer.valueOf(1)));
            }
        }
    }

    public s_guardarperfil() {
        super("s_guardarperfil");
    }

    /* access modifiers changed from: protected */
    public void onHandleIntent(Intent intent) {
        this.f20185a = (config) getApplicationContext();
        this.f20186b.post(new C6086a(Integer.valueOf(R.string.guardando), Integer.valueOf(0)));
        this.f20187c = intent.getExtras();
        this.f20188d = getSharedPreferences("sh", 0);
        this.f20189e = this.f20188d.getInt("idusu", 0);
        try {
            new C6087b().execute(new String[0]);
        } catch (Exception unused) {
        }
    }
}
