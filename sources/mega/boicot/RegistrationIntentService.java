package mega.boicot;

import android.app.IntentService;
import android.content.Intent;
import android.content.SharedPreferences;
import com.google.firebase.iid.FirebaseInstanceId;

public class RegistrationIntentService extends IntentService {

    /* renamed from: a */
    String f19561a = "A";

    /* renamed from: b */
    int f19562b;

    public RegistrationIntentService() {
        super("RegistrationIntentService");
    }

    /* access modifiers changed from: protected */
    public void onHandleIntent(Intent intent) {
        SharedPreferences sharedPreferences = getSharedPreferences("sh", 0);
        this.f19562b = sharedPreferences.getInt("idusu", 0);
        if (this.f19562b > 0) {
            try {
                m24368a(FirebaseInstanceId.m21578a().mo17891d());
            } catch (Exception unused) {
                sharedPreferences.edit().putBoolean("SENT_TOKEN_TO_SERVER", false).apply();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m24368a(java.lang.String r6) {
        /*
            r5 = this;
            int r0 = r5.f19562b
            if (r0 <= 0) goto L_0x00b7
            java.lang.String r0 = ""
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L_0x00b7
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "http://"
            r0.append(r1)
            java.lang.String r1 = mega.boicot.config.f17839g
            r0.append(r1)
            java.lang.String r1 = "/srv/guardargcmid.php?idusu="
            r0.append(r1)
            int r1 = r5.f19562b
            r0.append(r1)
            java.lang.String r1 = "&gcmid="
            r0.append(r1)
            r0.append(r6)
            java.lang.String r6 = "&accion="
            r0.append(r6)
            java.lang.String r6 = r5.f19561a
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            r0 = 0
            java.net.URL r1 = new java.net.URL     // Catch:{ Exception -> 0x00b1, all -> 0x00a7 }
            r1.<init>(r6)     // Catch:{ Exception -> 0x00b1, all -> 0x00a7 }
            java.net.URLConnection r6 = r1.openConnection()     // Catch:{ Exception -> 0x00b1, all -> 0x00a7 }
            java.net.HttpURLConnection r6 = (java.net.HttpURLConnection) r6     // Catch:{ Exception -> 0x00b1, all -> 0x00a7 }
            r0 = 1
            r6.setDoInput(r0)     // Catch:{ Exception -> 0x00b2, all -> 0x00a5 }
            r1 = 10000(0x2710, float:1.4013E-41)
            r6.setConnectTimeout(r1)     // Catch:{ Exception -> 0x00b2, all -> 0x00a5 }
            r6.setReadTimeout(r1)     // Catch:{ Exception -> 0x00b2, all -> 0x00a5 }
            java.lang.String r1 = "User-Agent"
            java.lang.String r2 = "Android Vinebre Software"
            r6.setRequestProperty(r1, r2)     // Catch:{ Exception -> 0x00b2, all -> 0x00a5 }
            java.io.InputStream r1 = r6.getInputStream()     // Catch:{ Exception -> 0x00b2, all -> 0x00a5 }
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ Exception -> 0x00b2, all -> 0x00a5 }
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x00b2, all -> 0x00a5 }
            r3.<init>(r1)     // Catch:{ Exception -> 0x00b2, all -> 0x00a5 }
            r2.<init>(r3)     // Catch:{ Exception -> 0x00b2, all -> 0x00a5 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00b2, all -> 0x00a5 }
            r1.<init>()     // Catch:{ Exception -> 0x00b2, all -> 0x00a5 }
        L_0x006d:
            java.lang.String r3 = r2.readLine()     // Catch:{ Exception -> 0x00b2, all -> 0x00a5 }
            if (r3 == 0) goto L_0x0077
            r1.append(r3)     // Catch:{ Exception -> 0x00b2, all -> 0x00a5 }
            goto L_0x006d
        L_0x0077:
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x00b2, all -> 0x00a5 }
            java.lang.String r2 = "ANDROID:OK"
            int r1 = r1.indexOf(r2)     // Catch:{ Exception -> 0x00b2, all -> 0x00a5 }
            r2 = -1
            if (r1 == r2) goto L_0x00a2
            java.lang.String r1 = r5.f19561a     // Catch:{ Exception -> 0x00b2, all -> 0x00a5 }
            java.lang.String r2 = "A"
            boolean r1 = r1.equals(r2)     // Catch:{ Exception -> 0x00b2, all -> 0x00a5 }
            if (r1 == 0) goto L_0x00a2
            java.lang.String r1 = "sh"
            r2 = 0
            android.content.SharedPreferences r1 = r5.getSharedPreferences(r1, r2)     // Catch:{ Exception -> 0x00b2, all -> 0x00a5 }
            android.content.SharedPreferences$Editor r1 = r1.edit()     // Catch:{ Exception -> 0x00b2, all -> 0x00a5 }
            java.lang.String r2 = "SENT_TOKEN_TO_SERVER"
            android.content.SharedPreferences$Editor r0 = r1.putBoolean(r2, r0)     // Catch:{ Exception -> 0x00b2, all -> 0x00a5 }
            r0.apply()     // Catch:{ Exception -> 0x00b2, all -> 0x00a5 }
        L_0x00a2:
            if (r6 == 0) goto L_0x00b7
            goto L_0x00b4
        L_0x00a5:
            r0 = move-exception
            goto L_0x00ab
        L_0x00a7:
            r6 = move-exception
            r4 = r0
            r0 = r6
            r6 = r4
        L_0x00ab:
            if (r6 == 0) goto L_0x00b0
            r6.disconnect()
        L_0x00b0:
            throw r0
        L_0x00b1:
            r6 = r0
        L_0x00b2:
            if (r6 == 0) goto L_0x00b7
        L_0x00b4:
            r6.disconnect()
        L_0x00b7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: mega.boicot.RegistrationIntentService.m24368a(java.lang.String):void");
    }
}
