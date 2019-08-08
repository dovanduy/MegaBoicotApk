package mega.boicot;

import android.app.IntentService;
import android.content.SharedPreferences.Editor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import mega.boicot.config.C5638c;

public class s_cargar_icos extends IntentService {

    /* renamed from: a */
    config f18493a;

    /* renamed from: b */
    Bitmap f18494b;

    public s_cargar_icos() {
        super("s_cargar_icos");
    }

    /* renamed from: a */
    private void m23997a(int i, Editor editor) {
        if (this.f18493a != null && this.f18493a.f17881aN != null && this.f18493a.f17971bz[i] != null) {
            this.f18493a.f17971bz[i].f18264aH = false;
            if (this.f18493a.f18045dm == 1) {
                ((C5638c) this.f18493a.f17925bF.get(this.f18493a.f17971bz[i].f18331x)).f18126b = BitmapFactory.decodeResource(getResources(), R.drawable.pixel500por1);
                ((C5638c) this.f18493a.f17925bF.get(this.f18493a.f17971bz[i].f18331x)).f18127c = false;
                editor.putLong("ico_cargado", System.currentTimeMillis());
                editor.commit();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Missing exception handler attribute for start block: B:54:0x0226 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onHandleIntent(android.content.Intent r12) {
        /*
            r11 = this;
            android.content.Context r0 = r11.getApplicationContext()
            mega.boicot.config r0 = (mega.boicot.config) r0
            r11.f18493a = r0
            java.lang.String r0 = "sh"
            r1 = 0
            android.content.SharedPreferences r0 = r11.getSharedPreferences(r0, r1)
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.String r2 = "ind_submenu"
            r3 = -1
            int r12 = r12.getIntExtra(r2, r3)
            java.lang.String r2 = ""
            if (r12 <= r3) goto L_0x003c
            mega.boicot.config r2 = r11.f18493a
            mega.boicot.i[] r2 = r2.f17971bz
            r2 = r2[r12]
            java.lang.String r2 = r2.f18282aZ
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = ","
            r4.append(r5)
            r4.append(r2)
            java.lang.String r2 = ","
            r4.append(r2)
            java.lang.String r2 = r4.toString()
        L_0x003c:
            mega.boicot.config r4 = r11.f18493a
            if (r4 == 0) goto L_0x023a
            mega.boicot.config r4 = r11.f18493a
            mega.boicot.i[] r4 = r4.f17971bz
            if (r4 != 0) goto L_0x0048
            goto L_0x023a
        L_0x0048:
            r4 = r1
        L_0x0049:
            mega.boicot.config r5 = r11.f18493a
            mega.boicot.i[] r5 = r5.f17971bz
            int r5 = r5.length
            if (r4 >= r5) goto L_0x009c
            mega.boicot.config r5 = r11.f18493a
            if (r5 == 0) goto L_0x0099
            mega.boicot.config r5 = r11.f18493a
            mega.boicot.i[] r5 = r5.f17971bz
            r5 = r5[r4]
            if (r5 == 0) goto L_0x0099
            mega.boicot.config r5 = r11.f18493a
            mega.boicot.i[] r5 = r5.f17971bz
            r5 = r5[r4]
            boolean r5 = r5.f18264aH
            if (r5 == 0) goto L_0x0099
            if (r12 != r3) goto L_0x0072
            mega.boicot.config r5 = r11.f18493a
            mega.boicot.i[] r5 = r5.f17971bz
            r5 = r5[r4]
            boolean r5 = r5.f18333z
            if (r5 == 0) goto L_0x009c
        L_0x0072:
            if (r12 <= r3) goto L_0x0099
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = ","
            r5.append(r6)
            mega.boicot.config r6 = r11.f18493a
            mega.boicot.i[] r6 = r6.f17971bz
            r6 = r6[r4]
            int r6 = r6.f18330w
            r5.append(r6)
            java.lang.String r6 = ","
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            boolean r5 = r2.contains(r5)
            if (r5 == 0) goto L_0x0099
            goto L_0x009c
        L_0x0099:
            int r4 = r4 + 1
            goto L_0x0049
        L_0x009c:
            mega.boicot.config r5 = r11.f18493a
            if (r5 == 0) goto L_0x023a
            mega.boicot.config r5 = r11.f18493a
            mega.boicot.i[] r5 = r5.f17971bz
            if (r5 != 0) goto L_0x00a8
            goto L_0x023a
        L_0x00a8:
            mega.boicot.config r5 = r11.f18493a
            mega.boicot.i[] r5 = r5.f17971bz
            int r5 = r5.length
            if (r4 < r5) goto L_0x00b7
            if (r12 != r3) goto L_0x023a
            mega.boicot.config r12 = r11.f18493a
            r12.f17969bx = r1
            goto L_0x023a
        L_0x00b7:
            mega.boicot.config r5 = r11.f18493a
            mega.boicot.i[] r5 = r5.f17971bz
            r5 = r5[r4]
            int r5 = r5.f18265aI
            if (r5 != 0) goto L_0x00eb
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "http://imgs1.e-droid.net/srv/imgs/seccs/"
            r5.append(r6)
            mega.boicot.config r6 = r11.f18493a
            mega.boicot.i[] r6 = r6.f17971bz
            r6 = r6[r4]
            int r6 = r6.f18330w
            r5.append(r6)
            java.lang.String r6 = "_ico.png?v="
            r5.append(r6)
            mega.boicot.config r6 = r11.f18493a
            mega.boicot.i[] r6 = r6.f17971bz
            r6 = r6[r4]
            int r6 = r6.f18266aJ
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            goto L_0x0109
        L_0x00eb:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "http://imgs1.e-droid.net/android-app-creator/icos_secc/"
            r5.append(r6)
            mega.boicot.config r6 = r11.f18493a
            mega.boicot.i[] r6 = r6.f17971bz
            r6 = r6[r4]
            int r6 = r6.f18265aI
            r5.append(r6)
            java.lang.String r6 = ".png"
            r5.append(r6)
            java.lang.String r5 = r5.toString()
        L_0x0109:
            java.net.URL r6 = new java.net.URL     // Catch:{ MalformedURLException -> 0x0235 }
            r6.<init>(r5)     // Catch:{ MalformedURLException -> 0x0235 }
            java.net.URLConnection r5 = r6.openConnection()     // Catch:{ IOException -> 0x0230 }
            java.net.HttpURLConnection r5 = (java.net.HttpURLConnection) r5     // Catch:{ IOException -> 0x0230 }
            r6 = 1
            r5.setDoInput(r6)     // Catch:{ IOException -> 0x0230 }
            r7 = 5000(0x1388, float:7.006E-42)
            r5.setConnectTimeout(r7)     // Catch:{ IOException -> 0x0230 }
            r7 = 7000(0x1b58, float:9.809E-42)
            r5.setReadTimeout(r7)     // Catch:{ IOException -> 0x0230 }
            r5.connect()     // Catch:{ IOException -> 0x0230 }
            java.io.InputStream r5 = r5.getInputStream()     // Catch:{ IOException -> 0x0230 }
            android.graphics.Bitmap r5 = android.graphics.BitmapFactory.decodeStream(r5)     // Catch:{ IOException -> 0x0230 }
            r11.f18494b = r5     // Catch:{ IOException -> 0x0230 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x022b, OutOfMemoryError -> 0x0226 }
            r5.<init>()     // Catch:{ Exception -> 0x022b, OutOfMemoryError -> 0x0226 }
            java.lang.String r7 = "img_s"
            r5.append(r7)     // Catch:{ Exception -> 0x022b, OutOfMemoryError -> 0x0226 }
            mega.boicot.config r7 = r11.f18493a     // Catch:{ Exception -> 0x022b, OutOfMemoryError -> 0x0226 }
            mega.boicot.i[] r7 = r7.f17971bz     // Catch:{ Exception -> 0x022b, OutOfMemoryError -> 0x0226 }
            r7 = r7[r4]     // Catch:{ Exception -> 0x022b, OutOfMemoryError -> 0x0226 }
            int r7 = r7.f18330w     // Catch:{ Exception -> 0x022b, OutOfMemoryError -> 0x0226 }
            r5.append(r7)     // Catch:{ Exception -> 0x022b, OutOfMemoryError -> 0x0226 }
            java.lang.String r7 = "_ico"
            r5.append(r7)     // Catch:{ Exception -> 0x022b, OutOfMemoryError -> 0x0226 }
            java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x022b, OutOfMemoryError -> 0x0226 }
            java.io.FileOutputStream r5 = r11.openFileOutput(r5, r1)     // Catch:{ Exception -> 0x022b, OutOfMemoryError -> 0x0226 }
            android.graphics.Bitmap r7 = r11.f18494b     // Catch:{ Exception -> 0x022b, OutOfMemoryError -> 0x0226 }
            android.graphics.Bitmap$CompressFormat r8 = android.graphics.Bitmap.CompressFormat.PNG     // Catch:{ Exception -> 0x022b, OutOfMemoryError -> 0x0226 }
            r9 = 100
            r7.compress(r8, r9, r5)     // Catch:{ Exception -> 0x022b, OutOfMemoryError -> 0x0226 }
            r5.close()     // Catch:{ Exception -> 0x022b, OutOfMemoryError -> 0x0226 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception | OutOfMemoryError -> 0x01a1 }
            r5.<init>()     // Catch:{ Exception | OutOfMemoryError -> 0x01a1 }
            java.lang.String r7 = "img_s"
            r5.append(r7)     // Catch:{ Exception | OutOfMemoryError -> 0x01a1 }
            mega.boicot.config r7 = r11.f18493a     // Catch:{ Exception | OutOfMemoryError -> 0x01a1 }
            mega.boicot.i[] r7 = r7.f17971bz     // Catch:{ Exception | OutOfMemoryError -> 0x01a1 }
            r7 = r7[r4]     // Catch:{ Exception | OutOfMemoryError -> 0x01a1 }
            int r7 = r7.f18330w     // Catch:{ Exception | OutOfMemoryError -> 0x01a1 }
            r5.append(r7)     // Catch:{ Exception | OutOfMemoryError -> 0x01a1 }
            java.lang.String r7 = "_ico_g"
            r5.append(r7)     // Catch:{ Exception | OutOfMemoryError -> 0x01a1 }
            java.lang.String r5 = r5.toString()     // Catch:{ Exception | OutOfMemoryError -> 0x01a1 }
            java.io.FileOutputStream r5 = r11.openFileOutput(r5, r1)     // Catch:{ Exception | OutOfMemoryError -> 0x01a1 }
            android.graphics.Bitmap r7 = r11.f18494b     // Catch:{ Exception | OutOfMemoryError -> 0x01a1 }
            android.graphics.Bitmap r8 = r11.f18494b     // Catch:{ Exception | OutOfMemoryError -> 0x01a1 }
            int r8 = r8.getWidth()     // Catch:{ Exception | OutOfMemoryError -> 0x01a1 }
            int r8 = mega.boicot.config.m23845b(r11, r8)     // Catch:{ Exception | OutOfMemoryError -> 0x01a1 }
            android.graphics.Bitmap r10 = r11.f18494b     // Catch:{ Exception | OutOfMemoryError -> 0x01a1 }
            int r10 = r10.getHeight()     // Catch:{ Exception | OutOfMemoryError -> 0x01a1 }
            int r10 = mega.boicot.config.m23845b(r11, r10)     // Catch:{ Exception | OutOfMemoryError -> 0x01a1 }
            android.graphics.Bitmap r7 = android.graphics.Bitmap.createScaledBitmap(r7, r8, r10, r6)     // Catch:{ Exception | OutOfMemoryError -> 0x01a1 }
            android.graphics.Bitmap$CompressFormat r8 = android.graphics.Bitmap.CompressFormat.PNG     // Catch:{ Exception | OutOfMemoryError -> 0x01a1 }
            r7.compress(r8, r9, r5)     // Catch:{ Exception | OutOfMemoryError -> 0x01a1 }
            r5.close()     // Catch:{ Exception | OutOfMemoryError -> 0x01a1 }
        L_0x01a1:
            mega.boicot.config r5 = r11.f18493a
            if (r5 == 0) goto L_0x023a
            mega.boicot.config r5 = r11.f18493a
            java.lang.String r5 = r5.f17881aN
            if (r5 == 0) goto L_0x023a
            mega.boicot.config r5 = r11.f18493a
            mega.boicot.i[] r5 = r5.f17971bz
            r5 = r5[r4]
            android.graphics.Bitmap r7 = r11.f18494b
            r5.f18263aG = r7
            mega.boicot.config r5 = r11.f18493a
            mega.boicot.i[] r5 = r5.f17971bz
            r5 = r5[r4]
            r5.f18264aH = r1
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r7 = "s"
            r5.append(r7)
            mega.boicot.config r7 = r11.f18493a
            mega.boicot.i[] r7 = r7.f17971bz
            r7 = r7[r4]
            int r7 = r7.f18330w
            r5.append(r7)
            java.lang.String r7 = "_ico"
            r5.append(r7)
            java.lang.String r5 = r5.toString()
            r0.putInt(r5, r1)
            java.lang.String r5 = "ico_cargado"
            long r7 = java.lang.System.currentTimeMillis()
            r0.putLong(r5, r7)
            mega.boicot.config r5 = r11.f18493a
            int r5 = r5.f18045dm
            if (r5 != r6) goto L_0x0221
            mega.boicot.config r5 = r11.f18493a
            mega.boicot.i[] r5 = r5.f17971bz
            r5 = r5[r4]
            boolean r5 = r5.f18333z
            if (r5 != 0) goto L_0x0221
            mega.boicot.config r5 = r11.f18493a
            java.util.ArrayList<mega.boicot.config$c> r5 = r5.f17925bF
            mega.boicot.config r6 = r11.f18493a
            mega.boicot.i[] r6 = r6.f17971bz
            r6 = r6[r4]
            int r6 = r6.f18331x
            java.lang.Object r5 = r5.get(r6)
            mega.boicot.config$c r5 = (mega.boicot.config.C5638c) r5
            android.graphics.Bitmap r6 = r11.f18494b
            r5.f18126b = r6
            mega.boicot.config r5 = r11.f18493a
            java.util.ArrayList<mega.boicot.config$c> r5 = r5.f17925bF
            mega.boicot.config r6 = r11.f18493a
            mega.boicot.i[] r6 = r6.f17971bz
            r4 = r6[r4]
            int r4 = r4.f18331x
            java.lang.Object r4 = r5.get(r4)
            mega.boicot.config$c r4 = (mega.boicot.config.C5638c) r4
            r4.f18127c = r1
        L_0x0221:
            r0.commit()
            goto L_0x003c
        L_0x0226:
            r11.m23997a(r4, r0)     // Catch:{ IOException -> 0x0230 }
            goto L_0x003c
        L_0x022b:
            r11.m23997a(r4, r0)     // Catch:{ IOException -> 0x0230 }
            goto L_0x003c
        L_0x0230:
            r11.m23997a(r4, r0)
            goto L_0x003c
        L_0x0235:
            r11.m23997a(r4, r0)
            goto L_0x003c
        L_0x023a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: mega.boicot.s_cargar_icos.onHandleIntent(android.content.Intent):void");
    }
}
