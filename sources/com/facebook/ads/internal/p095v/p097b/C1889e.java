package com.facebook.ads.internal.p095v.p097b;

import android.text.TextUtils;
import com.facebook.ads.internal.p095v.p097b.p098a.C1877b;
import com.google.android.exoplayer2.C2793C;
import java.io.BufferedOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Locale;

/* renamed from: com.facebook.ads.internal.v.b.e */
class C1889e extends C1902k {

    /* renamed from: a */
    private final C1899h f5952a;

    /* renamed from: b */
    private final C1877b f5953b;

    /* renamed from: c */
    private C1886b f5954c;

    public C1889e(C1899h hVar, C1877b bVar) {
        super(hVar, bVar);
        this.f5953b = bVar;
        this.f5952a = hVar;
    }

    /* renamed from: a */
    private void m7899a(OutputStream outputStream, long j) {
        byte[] bArr = new byte[8192];
        while (true) {
            int a = mo7948a(bArr, j, bArr.length);
            if (a != -1) {
                outputStream.write(bArr, 0, a);
                j += (long) a;
            } else {
                outputStream.flush();
                return;
            }
        }
    }

    /* renamed from: b */
    private void m7900b(OutputStream outputStream, long j) {
        try {
            C1899h hVar = new C1899h(this.f5952a);
            hVar.mo7944a((int) j);
            byte[] bArr = new byte[8192];
            while (true) {
                int a = hVar.mo7943a(bArr);
                if (a != -1) {
                    outputStream.write(bArr, 0, a);
                } else {
                    outputStream.flush();
                    return;
                }
            }
        } finally {
            this.f5952a.mo7945b();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo7926a(int i) {
        if (this.f5954c != null) {
            this.f5954c.mo7923a(this.f5953b.f5937a, this.f5952a.f5981a, i);
        }
    }

    /* renamed from: a */
    public void mo7927a(C1886b bVar) {
        this.f5954c = bVar;
    }

    /* renamed from: a */
    public void mo7928a(C1888d dVar, Socket socket) {
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(socket.getOutputStream());
        String c = this.f5952a.mo7946c();
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(c);
        int a = this.f5953b.mo7915d() ? this.f5953b.mo7910a() : this.f5952a.mo7942a();
        boolean z3 = a >= 0;
        long j = dVar.f5951c ? ((long) a) - dVar.f5950b : (long) a;
        boolean z4 = z3 && dVar.f5951c;
        StringBuilder sb = new StringBuilder();
        sb.append(dVar.f5951c ? "HTTP/1.1 206 PARTIAL CONTENT\n" : "HTTP/1.1 200 OK\n");
        sb.append("Accept-Ranges: bytes\n");
        sb.append(z3 ? String.format(Locale.US, "Content-Length: %d\n", new Object[]{Long.valueOf(j)}) : "");
        sb.append(z4 ? String.format(Locale.US, "Content-Range: bytes %d-%d/%d\n", new Object[]{Long.valueOf(dVar.f5950b), Integer.valueOf(a - 1), Integer.valueOf(a)}) : "");
        sb.append(z2 ? String.format(Locale.US, "Content-Type: %s\n", new Object[]{c}) : "");
        sb.append("\n");
        bufferedOutputStream.write(sb.toString().getBytes(C2793C.UTF8_NAME));
        long j2 = dVar.f5950b;
        int a2 = this.f5952a.mo7942a();
        boolean z5 = a2 > 0;
        int a3 = this.f5953b.mo7910a();
        if (z5 && dVar.f5951c && ((float) dVar.f5950b) > ((float) a3) + (((float) a2) * 0.2f)) {
            z = false;
        }
        if (z) {
            m7899a((OutputStream) bufferedOutputStream, j2);
        } else {
            m7900b(bufferedOutputStream, j2);
        }
    }
}
