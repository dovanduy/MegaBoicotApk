package com.facebook.ads.internal.p095v.p096a;

import com.google.android.exoplayer2.C2793C;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/* renamed from: com.facebook.ads.internal.v.a.f */
public abstract class C1862f implements C1873q {

    /* renamed from: a */
    private final C1874r f5917a;

    public C1862f() {
        this(new C1863g());
    }

    public C1862f(C1874r rVar) {
        this.f5917a = rVar;
    }

    /* renamed from: a */
    public OutputStream mo7862a(HttpURLConnection httpURLConnection) {
        return httpURLConnection.getOutputStream();
    }

    /* renamed from: a */
    public HttpURLConnection mo7863a(String str) {
        return (HttpURLConnection) new URL(str).openConnection();
    }

    /* renamed from: a */
    public void mo7864a(OutputStream outputStream, byte[] bArr) {
        outputStream.write(bArr);
    }

    /* renamed from: a */
    public void mo7865a(HttpURLConnection httpURLConnection, C1866j jVar, String str) {
        httpURLConnection.setRequestMethod(jVar.mo7880c());
        httpURLConnection.setDoOutput(jVar.mo7879b());
        httpURLConnection.setDoInput(jVar.mo7878a());
        if (str != null) {
            httpURLConnection.setRequestProperty("Content-Type", str);
        }
        httpURLConnection.setRequestProperty("Accept-Charset", C2793C.UTF8_NAME);
    }

    /* renamed from: a */
    public boolean mo7866a(C1869m mVar) {
        C1870n a = mVar.mo7885a();
        if (this.f5917a.mo7872a()) {
            this.f5917a.mo7870a("BasicRequestHandler.onError got");
            mVar.printStackTrace();
        }
        return a != null && a.mo7886a() > 0;
    }

    /* renamed from: a */
    public byte[] mo7867a(InputStream inputStream) {
        byte[] bArr = new byte[16384];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            int read = inputStream.read(bArr);
            if (read != -1) {
                byteArrayOutputStream.write(bArr, 0, read);
            } else {
                byteArrayOutputStream.flush();
                return byteArrayOutputStream.toByteArray();
            }
        }
    }

    /* renamed from: b */
    public InputStream mo7868b(HttpURLConnection httpURLConnection) {
        return httpURLConnection.getInputStream();
    }
}
