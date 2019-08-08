package com.google.android.gms.ads.p135a;

import android.net.Uri;
import android.net.Uri.Builder;
import android.util.Log;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;

/* renamed from: com.google.android.gms.ads.a.b */
final class C2964b extends Thread {

    /* renamed from: a */
    private final /* synthetic */ Map f8675a;

    C2964b(C2961a aVar, Map map) {
        this.f8675a = map;
    }

    public final void run() {
        String str;
        String message;
        StringBuilder sb;
        String str2;
        HttpURLConnection httpURLConnection;
        new C2966d();
        Map map = this.f8675a;
        Builder buildUpon = Uri.parse("https://pagead2.googlesyndication.com/pagead/gen_204?id=gmob-apps").buildUpon();
        for (String str3 : map.keySet()) {
            buildUpon.appendQueryParameter(str3, (String) map.get(str3));
        }
        String uri = buildUpon.build().toString();
        try {
            httpURLConnection = (HttpURLConnection) new URL(uri).openConnection();
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode < 200 || responseCode >= 300) {
                StringBuilder sb2 = new StringBuilder(65 + String.valueOf(uri).length());
                sb2.append("Received non-success response code ");
                sb2.append(responseCode);
                sb2.append(" from pinging URL: ");
                sb2.append(uri);
                Log.w("HttpUrlPinger", sb2.toString());
            }
            httpURLConnection.disconnect();
        } catch (IndexOutOfBoundsException e) {
            str = "HttpUrlPinger";
            message = e.getMessage();
            sb = new StringBuilder(32 + String.valueOf(uri).length() + String.valueOf(message).length());
            str2 = "Error while parsing ping URL: ";
            r1 = e;
            sb.append(str2);
            sb.append(uri);
            sb.append(". ");
            sb.append(message);
            Log.w(str, sb.toString(), r1);
        } catch (IOException | RuntimeException e2) {
            str = "HttpUrlPinger";
            message = e2.getMessage();
            sb = new StringBuilder(27 + String.valueOf(uri).length() + String.valueOf(message).length());
            str2 = "Error while pinging URL: ";
            r1 = e2;
            sb.append(str2);
            sb.append(uri);
            sb.append(". ");
            sb.append(message);
            Log.w(str, sb.toString(), r1);
        } catch (Throwable th) {
            httpURLConnection.disconnect();
            throw th;
        }
    }
}
