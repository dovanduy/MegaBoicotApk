package mega.boicot;

import android.app.IntentService;
import android.graphics.Bitmap;

public class s_cargar_sliderheader extends IntentService {

    /* renamed from: a */
    config f20183a;

    /* renamed from: b */
    Bitmap f20184b;

    public s_cargar_sliderheader() {
        super("s_cargar_sliderheader");
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onHandleIntent(android.content.Intent r6) {
        /*
            r5 = this;
            android.content.Context r6 = r5.getApplicationContext()
            mega.boicot.config r6 = (mega.boicot.config) r6
            r5.f20183a = r6
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r0 = "http://imgs1.e-droid.net/srv/imgs/gen/718963_slider.png?v="
            r6.append(r0)
            mega.boicot.config r0 = r5.f20183a
            int r0 = r0.f17847F
            r6.append(r0)
            java.lang.String r6 = r6.toString()
            r0 = 1
            r1 = 0
            java.net.URL r2 = new java.net.URL     // Catch:{ MalformedURLException -> 0x0026 }
            r2.<init>(r6)     // Catch:{ MalformedURLException -> 0x0026 }
            r6 = r0
            goto L_0x0028
        L_0x0026:
            r2 = 0
            r6 = r1
        L_0x0028:
            if (r6 == 0) goto L_0x0080
            java.net.URLConnection r2 = r2.openConnection()     // Catch:{  }
            java.net.HttpURLConnection r2 = (java.net.HttpURLConnection) r2     // Catch:{  }
            r2.setDoInput(r0)     // Catch:{  }
            r0 = 5000(0x1388, float:7.006E-42)
            r2.setConnectTimeout(r0)     // Catch:{  }
            r0 = 7000(0x1b58, float:9.809E-42)
            r2.setReadTimeout(r0)     // Catch:{  }
            r2.connect()     // Catch:{  }
            java.io.InputStream r0 = r2.getInputStream()     // Catch:{  }
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeStream(r0)     // Catch:{  }
            r5.f20184b = r0     // Catch:{  }
            java.lang.String r0 = "slider_header"
            java.io.FileOutputStream r0 = r5.openFileOutput(r0, r1)     // Catch:{ IOException -> 0x005d }
            android.graphics.Bitmap r2 = r5.f20184b     // Catch:{ IOException -> 0x005d }
            android.graphics.Bitmap$CompressFormat r3 = android.graphics.Bitmap.CompressFormat.PNG     // Catch:{ IOException -> 0x005d }
            r4 = 100
            r2.compress(r3, r4, r0)     // Catch:{ IOException -> 0x005d }
            r0.close()     // Catch:{ IOException -> 0x005d }
            goto L_0x005e
        L_0x005d:
            r6 = r1
        L_0x005e:
            mega.boicot.config r0 = r5.f20183a
            if (r0 == 0) goto L_0x0080
            mega.boicot.config r0 = r5.f20183a
            java.lang.String r0 = r0.f17881aN
            if (r0 == 0) goto L_0x0080
            if (r6 == 0) goto L_0x0080
            java.lang.String r6 = "sh"
            android.content.SharedPreferences r6 = r5.getSharedPreferences(r6, r1)
            android.content.SharedPreferences$Editor r6 = r6.edit()
            java.lang.String r0 = "slider_v_act"
            mega.boicot.config r1 = r5.f20183a
            int r1 = r1.f17847F
            r6.putInt(r0, r1)
            r6.commit()
        L_0x0080:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: mega.boicot.s_cargar_sliderheader.onHandleIntent(android.content.Intent):void");
    }
}
