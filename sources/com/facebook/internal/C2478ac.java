package com.facebook.internal;

import android.net.Uri;
import com.facebook.internal.C2533m.C2542d;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;

/* renamed from: com.facebook.internal.ac */
/* compiled from: UrlRedirectCache */
class C2478ac {

    /* renamed from: a */
    static final String f7804a = "ac";

    /* renamed from: b */
    private static final String f7805b;

    /* renamed from: c */
    private static C2533m f7806c;

    C2478ac() {
    }

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(f7804a);
        sb.append("_Redirect");
        f7805b = sb.toString();
    }

    /* renamed from: a */
    static synchronized C2533m m9417a() throws IOException {
        C2533m mVar;
        synchronized (C2478ac.class) {
            if (f7806c == null) {
                f7806c = new C2533m(f7804a, new C2542d());
            }
            mVar = f7806c;
        }
        return mVar;
    }

    /* renamed from: a */
    static Uri m9416a(Uri uri) {
        InputStreamReader inputStreamReader;
        Throwable th;
        if (uri == null) {
            return null;
        }
        String uri2 = uri.toString();
        try {
            C2533m a = m9417a();
            InputStreamReader inputStreamReader2 = null;
            boolean z = false;
            while (true) {
                try {
                    InputStream a2 = a.mo9013a(uri2, f7805b);
                    if (a2 == null) {
                        break;
                    }
                    z = true;
                    inputStreamReader = new InputStreamReader(a2);
                    try {
                        char[] cArr = new char[128];
                        StringBuilder sb = new StringBuilder();
                        while (true) {
                            int read = inputStreamReader.read(cArr, 0, cArr.length);
                            if (read <= 0) {
                                break;
                            }
                            sb.append(cArr, 0, read);
                        }
                        C2479ad.m9444a((Closeable) inputStreamReader);
                        inputStreamReader2 = inputStreamReader;
                        uri2 = sb.toString();
                    } catch (IOException unused) {
                        C2479ad.m9444a((Closeable) inputStreamReader);
                        return null;
                    } catch (Throwable th2) {
                        th = th2;
                        C2479ad.m9444a((Closeable) inputStreamReader);
                        throw th;
                    }
                } catch (IOException unused2) {
                    inputStreamReader = inputStreamReader2;
                    C2479ad.m9444a((Closeable) inputStreamReader);
                    return null;
                } catch (Throwable th3) {
                    th = th3;
                    inputStreamReader = inputStreamReader2;
                    C2479ad.m9444a((Closeable) inputStreamReader);
                    throw th;
                }
            }
            if (z) {
                Uri parse = Uri.parse(uri2);
                C2479ad.m9444a((Closeable) inputStreamReader2);
                return parse;
            }
            C2479ad.m9444a((Closeable) inputStreamReader2);
            return null;
        } catch (IOException unused3) {
            inputStreamReader = null;
            C2479ad.m9444a((Closeable) inputStreamReader);
            return null;
        } catch (Throwable th4) {
            th = th4;
            inputStreamReader = null;
            C2479ad.m9444a((Closeable) inputStreamReader);
            throw th;
        }
    }

    /* renamed from: a */
    static void m9418a(Uri uri, Uri uri2) {
        if (uri != null && uri2 != null) {
            OutputStream outputStream = null;
            try {
                OutputStream b = m9417a().mo9016b(uri.toString(), f7805b);
                try {
                    b.write(uri2.toString().getBytes());
                    C2479ad.m9444a((Closeable) b);
                } catch (IOException unused) {
                    outputStream = b;
                    C2479ad.m9444a((Closeable) outputStream);
                } catch (Throwable th) {
                    th = th;
                    outputStream = b;
                    C2479ad.m9444a((Closeable) outputStream);
                    throw th;
                }
            } catch (IOException unused2) {
                C2479ad.m9444a((Closeable) outputStream);
            } catch (Throwable th2) {
                th = th2;
                C2479ad.m9444a((Closeable) outputStream);
                throw th;
            }
        }
    }
}
