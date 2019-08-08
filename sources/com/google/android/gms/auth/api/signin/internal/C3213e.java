package com.google.android.gms.auth.api.signin.internal;

import com.google.android.gms.common.api.C3270g;
import com.google.android.gms.common.api.C3272h;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C3378o;
import com.google.android.gms.common.internal.C3513t;
import com.google.android.gms.common.p139a.C3243a;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/* renamed from: com.google.android.gms.auth.api.signin.internal.e */
public final class C3213e implements Runnable {

    /* renamed from: a */
    private static final C3243a f9415a = new C3243a("RevokeAccessOperation", new String[0]);

    /* renamed from: b */
    private final String f9416b;

    /* renamed from: c */
    private final C3378o f9417c = new C3378o(null);

    private C3213e(String str) {
        C3513t.m12627a(str);
        this.f9416b = str;
    }

    public final void run() {
        Status status = Status.f9457c;
        try {
            String valueOf = String.valueOf("https://accounts.google.com/o/oauth2/revoke?token=");
            String valueOf2 = String.valueOf(this.f9416b);
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf)).openConnection();
            httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == 200) {
                status = Status.f9455a;
            } else {
                f9415a.mo13068b("Unable to revoke access!", new Object[0]);
            }
            C3243a aVar = f9415a;
            StringBuilder sb = new StringBuilder(26);
            sb.append("Response Code: ");
            sb.append(responseCode);
            aVar.mo13066a(sb.toString(), new Object[0]);
        } catch (IOException e) {
            C3243a aVar2 = f9415a;
            String str = "IOException when revoking access: ";
            String valueOf3 = String.valueOf(e.toString());
            aVar2.mo13068b(valueOf3.length() != 0 ? str.concat(valueOf3) : new String(str), new Object[0]);
        } catch (Exception e2) {
            C3243a aVar3 = f9415a;
            String str2 = "Exception when revoking access: ";
            String valueOf4 = String.valueOf(e2.toString());
            aVar3.mo13068b(valueOf4.length() != 0 ? str2.concat(valueOf4) : new String(str2), new Object[0]);
        }
        this.f9417c.mo13162b(status);
    }

    /* renamed from: a */
    public static C3270g<Status> m11534a(String str) {
        if (str == null) {
            return C3272h.m11684a(new Status(4), null);
        }
        C3213e eVar = new C3213e(str);
        new Thread(eVar).start();
        return eVar.f9417c;
    }
}
