package org.apache.p199a.p229k;

import com.appnext.base.p046b.C1245d;
import com.google.android.exoplayer2.extractor.MpegAudioHeader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import org.apache.p199a.C6341d;
import org.apache.p199a.C6527i;
import org.apache.p199a.C6565v;
import org.apache.p199a.C6567x;

/* renamed from: org.apache.a.k.d */
/* compiled from: EntityUtils */
public final class C6551d {
    /* renamed from: a */
    public static void m25958a(C6527i iVar) throws IOException {
        if (iVar != null && iVar.mo22651g()) {
            InputStream f = iVar.mo22473f();
            if (f != null) {
                f.close();
            }
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: b */
    public static byte[] m25959b(C6527i iVar) throws IOException {
        if (iVar == null) {
            throw new IllegalArgumentException("HTTP entity may not be null");
        }
        InputStream f = iVar.mo22473f();
        if (f == null) {
            return null;
        }
        if (iVar.mo22650c() > 2147483647L) {
            throw new IllegalArgumentException("HTTP entity too large to be buffered in memory");
        }
        int c = (int) iVar.mo22650c();
        if (c < 0) {
            c = 4096;
        }
        C6548a aVar = new C6548a(c);
        try {
            byte[] bArr = new byte[MpegAudioHeader.MAX_FRAME_SIZE_BYTES];
            while (true) {
                int read = f.read(bArr);
                if (read != -1) {
                    aVar.mo23028a(bArr, 0, read);
                } else {
                    f.close();
                    return aVar.mo23031b();
                }
            }
        } catch (Throwable th) {
            f.close();
            throw th;
        }
    }

    /* renamed from: c */
    public static String m25960c(C6527i iVar) throws C6567x {
        if (iVar == null) {
            throw new IllegalArgumentException("HTTP entity may not be null");
        } else if (iVar.mo22620d() == null) {
            return null;
        } else {
            C6341d[] e = iVar.mo22620d().mo22467e();
            if (e.length <= 0) {
                return null;
            }
            C6565v a = e[0].mo22570a("charset");
            if (a != null) {
                return a.mo22962b();
            }
            return null;
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public static String m25957a(C6527i iVar, String str) throws IOException, C6567x {
        if (iVar == null) {
            throw new IllegalArgumentException("HTTP entity may not be null");
        }
        InputStream f = iVar.mo22473f();
        if (f == null) {
            return null;
        }
        if (iVar.mo22650c() > 2147483647L) {
            throw new IllegalArgumentException("HTTP entity too large to be buffered in memory");
        }
        int c = (int) iVar.mo22650c();
        if (c < 0) {
            c = MpegAudioHeader.MAX_FRAME_SIZE_BYTES;
        }
        String c2 = m25960c(iVar);
        if (c2 == null) {
            c2 = str;
        }
        if (c2 == null) {
            c2 = "ISO-8859-1";
        }
        InputStreamReader inputStreamReader = new InputStreamReader(f, c2);
        C6549b bVar = new C6549b(c);
        try {
            char[] cArr = new char[C1245d.f3947iP];
            while (true) {
                int read = inputStreamReader.read(cArr);
                if (read != -1) {
                    bVar.mo23048a(cArr, 0, read);
                } else {
                    inputStreamReader.close();
                    return bVar.toString();
                }
            }
        } catch (Throwable th) {
            inputStreamReader.close();
            throw th;
        }
    }

    /* renamed from: d */
    public static String m25961d(C6527i iVar) throws IOException, C6567x {
        return m25957a(iVar, null);
    }
}
