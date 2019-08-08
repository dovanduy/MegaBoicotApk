package mega.boicot;

import android.app.IntentService;

public class s_guardarpos extends IntentService {

    /* renamed from: a */
    String f20194a;

    /* renamed from: b */
    String f20195b;

    /* renamed from: c */
    String f20196c;

    /* renamed from: d */
    int f20197d;

    public s_guardarpos() {
        super("s_guardarpos");
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onHandleIntent(android.content.Intent r6) {
        /*
            r5 = this;
            java.lang.String r6 = "sh"
            r0 = 0
            android.content.SharedPreferences r6 = r5.getSharedPreferences(r6, r0)
            java.lang.String r1 = "idusu"
            int r0 = r6.getInt(r1, r0)
            r5.f20197d = r0
            java.lang.String r0 = "cod"
            java.lang.String r1 = ""
            java.lang.String r0 = r6.getString(r0, r1)
            r5.f20194a = r0
            java.lang.String r0 = "x"
            java.lang.String r1 = ""
            java.lang.String r0 = r6.getString(r0, r1)
            r5.f20195b = r0
            java.lang.String r0 = "y"
            java.lang.String r1 = ""
            java.lang.String r6 = r6.getString(r0, r1)
            r5.f20196c = r6
            int r6 = r5.f20197d
            if (r6 <= 0) goto L_0x00e6
            java.lang.String r6 = r5.f20195b
            java.lang.String r0 = ""
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x00e6
            java.lang.String r6 = r5.f20196c
            java.lang.String r0 = ""
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x00e6
            r6 = 0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00e1, all -> 0x00da }
            r0.<init>()     // Catch:{ Exception -> 0x00e1, all -> 0x00da }
            java.lang.String r1 = "http://"
            r0.append(r1)     // Catch:{ Exception -> 0x00e1, all -> 0x00da }
            java.lang.String r1 = mega.boicot.config.f17839g     // Catch:{ Exception -> 0x00e1, all -> 0x00da }
            r0.append(r1)     // Catch:{ Exception -> 0x00e1, all -> 0x00da }
            java.lang.String r1 = "/srv/guardarpos.php?idusu="
            r0.append(r1)     // Catch:{ Exception -> 0x00e1, all -> 0x00da }
            int r1 = r5.f20197d     // Catch:{ Exception -> 0x00e1, all -> 0x00da }
            r0.append(r1)     // Catch:{ Exception -> 0x00e1, all -> 0x00da }
            java.lang.String r1 = "&c="
            r0.append(r1)     // Catch:{ Exception -> 0x00e1, all -> 0x00da }
            java.lang.String r1 = r5.f20194a     // Catch:{ Exception -> 0x00e1, all -> 0x00da }
            r0.append(r1)     // Catch:{ Exception -> 0x00e1, all -> 0x00da }
            java.lang.String r1 = "&x="
            r0.append(r1)     // Catch:{ Exception -> 0x00e1, all -> 0x00da }
            java.lang.String r1 = r5.f20195b     // Catch:{ Exception -> 0x00e1, all -> 0x00da }
            r0.append(r1)     // Catch:{ Exception -> 0x00e1, all -> 0x00da }
            java.lang.String r1 = "&y="
            r0.append(r1)     // Catch:{ Exception -> 0x00e1, all -> 0x00da }
            java.lang.String r1 = r5.f20196c     // Catch:{ Exception -> 0x00e1, all -> 0x00da }
            r0.append(r1)     // Catch:{ Exception -> 0x00e1, all -> 0x00da }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x00e1, all -> 0x00da }
            java.net.URL r1 = new java.net.URL     // Catch:{ Exception -> 0x00e1, all -> 0x00da }
            r1.<init>(r0)     // Catch:{ Exception -> 0x00e1, all -> 0x00da }
            java.net.URLConnection r0 = r1.openConnection()     // Catch:{ Exception -> 0x00e1, all -> 0x00da }
            java.net.HttpURLConnection r0 = (java.net.HttpURLConnection) r0     // Catch:{ Exception -> 0x00e1, all -> 0x00da }
            r6 = 1
            r0.setDoInput(r6)     // Catch:{ Exception -> 0x00d8, all -> 0x00d3 }
            r6 = 10000(0x2710, float:1.4013E-41)
            r0.setConnectTimeout(r6)     // Catch:{ Exception -> 0x00d8, all -> 0x00d3 }
            r0.setReadTimeout(r6)     // Catch:{ Exception -> 0x00d8, all -> 0x00d3 }
            java.lang.String r6 = "User-Agent"
            java.lang.String r1 = "Android Vinebre Software"
            r0.setRequestProperty(r6, r1)     // Catch:{ Exception -> 0x00d8, all -> 0x00d3 }
            java.io.InputStream r6 = r0.getInputStream()     // Catch:{ Exception -> 0x00d8, all -> 0x00d3 }
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch:{ Exception -> 0x00d8, all -> 0x00d3 }
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x00d8, all -> 0x00d3 }
            r2.<init>(r6)     // Catch:{ Exception -> 0x00d8, all -> 0x00d3 }
            r1.<init>(r2)     // Catch:{ Exception -> 0x00d8, all -> 0x00d3 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00d8, all -> 0x00d3 }
            r6.<init>()     // Catch:{ Exception -> 0x00d8, all -> 0x00d3 }
        L_0x00b2:
            java.lang.String r2 = r1.readLine()     // Catch:{ Exception -> 0x00d8, all -> 0x00d3 }
            if (r2 == 0) goto L_0x00cd
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00d8, all -> 0x00d3 }
            r3.<init>()     // Catch:{ Exception -> 0x00d8, all -> 0x00d3 }
            r3.append(r2)     // Catch:{ Exception -> 0x00d8, all -> 0x00d3 }
            java.lang.String r2 = "\n"
            r3.append(r2)     // Catch:{ Exception -> 0x00d8, all -> 0x00d3 }
            java.lang.String r2 = r3.toString()     // Catch:{ Exception -> 0x00d8, all -> 0x00d3 }
            r6.append(r2)     // Catch:{ Exception -> 0x00d8, all -> 0x00d3 }
            goto L_0x00b2
        L_0x00cd:
            if (r0 == 0) goto L_0x00e6
            r0.disconnect()
            goto L_0x00e6
        L_0x00d3:
            r6 = move-exception
            r4 = r0
            r0 = r6
            r6 = r4
            goto L_0x00db
        L_0x00d8:
            r6 = r0
            goto L_0x00e1
        L_0x00da:
            r0 = move-exception
        L_0x00db:
            if (r6 == 0) goto L_0x00e0
            r6.disconnect()
        L_0x00e0:
            throw r0
        L_0x00e1:
            if (r6 == 0) goto L_0x00e6
            r6.disconnect()
        L_0x00e6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: mega.boicot.s_guardarpos.onHandleIntent(android.content.Intent):void");
    }
}
