package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

@C3718cm
/* renamed from: com.google.android.gms.internal.ads.ml */
public final class C3988ml implements C3979mc {

    /* renamed from: a */
    private final String f13582a;

    public C3988ml() {
        this(null);
    }

    public C3988ml(String str) {
        this.f13582a = str;
    }

    /* renamed from: a */
    public final void mo15530a(String str) {
        StringBuilder sb;
        String message;
        HttpURLConnection httpURLConnection;
        String str2 = "Pinging URL: ";
        try {
            String valueOf = String.valueOf(str);
            C3987mk.m17429b(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
            httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            aoq.m14615a();
            C3975lz.m17377a(true, httpURLConnection, this.f13582a);
            C3980md mdVar = new C3980md();
            mdVar.mo15630a(httpURLConnection, (byte[]) null);
            int responseCode = httpURLConnection.getResponseCode();
            mdVar.mo15629a(httpURLConnection, responseCode);
            if (responseCode < 200 || responseCode >= 300) {
                StringBuilder sb2 = new StringBuilder(65 + String.valueOf(str).length());
                sb2.append("Received non-success response code ");
                sb2.append(responseCode);
                sb2.append(" from pinging URL: ");
                sb2.append(str);
                C3987mk.m17435e(sb2.toString());
            }
            httpURLConnection.disconnect();
        } catch (IndexOutOfBoundsException e) {
            String message2 = e.getMessage();
            sb = new StringBuilder(32 + String.valueOf(str).length() + String.valueOf(message2).length());
            sb.append("Error while parsing ping URL: ");
            sb.append(str);
            sb.append(". ");
            sb.append(message2);
            C3987mk.m17435e(sb.toString());
        } catch (IOException e2) {
            message = e2.getMessage();
            sb = new StringBuilder(27 + String.valueOf(str).length() + String.valueOf(message).length());
            sb.append("Error while pinging URL: ");
            sb.append(str);
            sb.append(". ");
            sb.append(message);
            C3987mk.m17435e(sb.toString());
        } catch (RuntimeException e3) {
            message = e3.getMessage();
            sb = new StringBuilder(27 + String.valueOf(str).length() + String.valueOf(message).length());
            sb.append("Error while pinging URL: ");
            sb.append(str);
            sb.append(". ");
            sb.append(message);
            C3987mk.m17435e(sb.toString());
        } catch (Throwable th) {
            httpURLConnection.disconnect();
            throw th;
        }
    }
}
