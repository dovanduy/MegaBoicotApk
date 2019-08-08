package com.facebook.internal;

import android.content.Context;
import android.net.Uri;
import com.facebook.C2757u;
import com.facebook.internal.C2533m.C2542d;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URLConnection;

/* renamed from: com.facebook.internal.r */
/* compiled from: ImageResponseCache */
class C2558r {

    /* renamed from: a */
    static final String f8006a = "r";

    /* renamed from: b */
    private static C2533m f8007b;

    /* renamed from: com.facebook.internal.r$a */
    /* compiled from: ImageResponseCache */
    private static class C2559a extends BufferedInputStream {

        /* renamed from: a */
        HttpURLConnection f8008a;

        C2559a(InputStream inputStream, HttpURLConnection httpURLConnection) {
            super(inputStream, 8192);
            this.f8008a = httpURLConnection;
        }

        public void close() throws IOException {
            super.close();
            C2479ad.m9449a((URLConnection) this.f8008a);
        }
    }

    C2558r() {
    }

    /* renamed from: a */
    static synchronized C2533m m9709a(Context context) throws IOException {
        C2533m mVar;
        synchronized (C2558r.class) {
            if (f8007b == null) {
                f8007b = new C2533m(f8006a, new C2542d());
            }
            mVar = f8007b;
        }
        return mVar;
    }

    /* renamed from: a */
    static InputStream m9711a(Uri uri, Context context) {
        if (uri != null && m9712a(uri)) {
            try {
                return m9709a(context).mo9011a(uri.toString());
            } catch (IOException e) {
                C2563u.m9719a(C2757u.CACHE, 5, f8006a, e.toString());
            }
        }
        return null;
    }

    /* renamed from: a */
    static InputStream m9710a(Context context, HttpURLConnection httpURLConnection) throws IOException {
        if (httpURLConnection.getResponseCode() != 200) {
            return null;
        }
        Uri parse = Uri.parse(httpURLConnection.getURL().toString());
        InputStream inputStream = httpURLConnection.getInputStream();
        try {
            return m9712a(parse) ? m9709a(context).mo9012a(parse.toString(), (InputStream) new C2559a(inputStream, httpURLConnection)) : inputStream;
        } catch (IOException unused) {
            return inputStream;
        }
    }

    /* renamed from: a */
    private static boolean m9712a(Uri uri) {
        if (uri != null) {
            String host = uri.getHost();
            if (host.endsWith("fbcdn.net")) {
                return true;
            }
            if (host.startsWith("fbcdn") && host.endsWith("akamaihd.net")) {
                return true;
            }
        }
        return false;
    }
}
