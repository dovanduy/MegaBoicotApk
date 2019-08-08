package mega.boicot;

import android.os.AsyncTask;
import android.os.Build;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.exoplayer2.C2793C;
import java.lang.Thread.UncaughtExceptionHandler;
import java.net.URLEncoder;
import org.apache.p199a.p202b.p204b.C6274e;
import org.apache.p199a.p202b.p204b.C6276g;
import org.apache.p199a.p215e.p216a.C6367d;
import org.apache.p199a.p215e.p216a.C6370g;
import org.apache.p199a.p215e.p216a.p217a.C6360c;
import org.apache.p199a.p215e.p216a.p217a.C6363f;
import org.apache.p199a.p218f.p220b.C6409h;
import org.apache.p199a.p227i.C6529b;
import org.apache.p199a.p227i.C6530c;
import org.apache.p199a.p227i.C6531d;

/* renamed from: mega.boicot.e */
/* compiled from: CustomExceptionHandler */
public class C5659e implements UncaughtExceptionHandler {

    /* renamed from: a */
    private UncaughtExceptionHandler f18194a = Thread.getDefaultUncaughtExceptionHandler();

    /* renamed from: mega.boicot.e$a */
    /* compiled from: CustomExceptionHandler */
    private class C5660a extends AsyncTask<String, Void, Byte> {

        /* renamed from: a */
        String f18195a;

        /* renamed from: b */
        String f18196b;

        C5660a(String str, String str2) {
            this.f18195a = str;
            this.f18196b = str2;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Byte doInBackground(String... strArr) {
            try {
                C6529b bVar = new C6529b();
                C6530c.m25865c(bVar, 10000);
                C6530c.m25861a((C6531d) bVar, 60000);
                C6409h hVar = new C6409h(bVar);
                StringBuilder sb = new StringBuilder();
                sb.append("http://log.e-droid.net/srv/log.php?v=33&vcode=4&idapp=718963&nivelapi=");
                sb.append(VERSION.SDK_INT);
                sb.append("&dispo=");
                sb.append(URLEncoder.encode(this.f18196b, C2793C.UTF8_NAME));
                C6274e eVar = new C6274e(sb.toString());
                C6370g gVar = new C6370g(C6367d.BROWSER_COMPATIBLE);
                gVar.mo22648a("descr", (C6360c) new C6363f(this.f18195a));
                eVar.mo22444a(gVar);
                eVar.mo22909b("User-Agent", "Android Vinebre Software");
                hVar.mo22459a((C6276g) eVar);
            } catch (Exception unused) {
            }
            return Byte.valueOf(0);
        }
    }

    public void uncaughtException(Thread thread, Throwable th) {
        try {
            new C5660a(Log.getStackTraceString(th), m23928a()).execute(new String[0]);
        } catch (Exception unused) {
        }
        this.f18194a.uncaughtException(thread, th);
    }

    /* renamed from: a */
    private static String m23928a() {
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        if (str2.startsWith(str)) {
            return m23929a(str2);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(m23929a(str));
        sb.append(" ");
        sb.append(str2);
        return sb.toString();
    }

    /* renamed from: a */
    private static String m23929a(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        char[] charArray = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (char c : charArray) {
            if (!z || !Character.isLetter(c)) {
                if (Character.isWhitespace(c)) {
                    z = true;
                }
                sb.append(c);
            } else {
                sb.append(Character.toUpperCase(c));
                z = false;
            }
        }
        return sb.toString();
    }
}
