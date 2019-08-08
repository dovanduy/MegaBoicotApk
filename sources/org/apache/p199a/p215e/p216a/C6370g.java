package org.apache.p199a.p215e.p216a;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.Random;
import org.apache.p199a.C6301c;
import org.apache.p199a.C6527i;
import org.apache.p199a.p215e.p216a.p217a.C6360c;
import org.apache.p199a.p226h.C6507b;

/* renamed from: org.apache.a.e.a.g */
/* compiled from: MultipartEntity */
public class C6370g implements C6527i {

    /* renamed from: a */
    private static final char[] f20913a = "-_1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();

    /* renamed from: b */
    private final C6365c f20914b;

    /* renamed from: c */
    private final C6301c f20915c;

    /* renamed from: d */
    private long f20916d;

    /* renamed from: e */
    private volatile boolean f20917e;

    /* renamed from: e */
    public C6301c mo22621e() {
        return null;
    }

    public C6370g(C6367d dVar, String str, Charset charset) {
        if (str == null) {
            str = mo22652i();
        }
        if (dVar == null) {
            dVar = C6367d.STRICT;
        }
        this.f20914b = new C6365c("form-data", charset, str, dVar);
        this.f20915c = new C6507b("Content-Type", mo22647a(str, charset));
        this.f20917e = true;
    }

    public C6370g(C6367d dVar) {
        this(dVar, null, null);
    }

    public C6370g() {
        this(C6367d.STRICT, null, null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo22647a(String str, Charset charset) {
        StringBuilder sb = new StringBuilder();
        sb.append("multipart/form-data; boundary=");
        sb.append(str);
        if (charset != null) {
            sb.append("; charset=");
            sb.append(charset.name());
        }
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public String mo22652i() {
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        int nextInt = random.nextInt(11) + 30;
        for (int i = 0; i < nextInt; i++) {
            sb.append(f20913a[random.nextInt(f20913a.length)]);
        }
        return sb.toString();
    }

    /* renamed from: a */
    public void mo22649a(C6357a aVar) {
        this.f20914b.mo22641a(aVar);
        this.f20917e = true;
    }

    /* renamed from: a */
    public void mo22648a(String str, C6360c cVar) {
        mo22649a(new C6357a(str, cVar));
    }

    /* renamed from: a */
    public boolean mo22469a() {
        for (C6357a b : this.f20914b.mo22639a()) {
            if (b.mo22625b().mo22634e() < 0) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public boolean mo22619b() {
        return !mo22469a();
    }

    /* renamed from: g */
    public boolean mo22651g() {
        return !mo22469a();
    }

    /* renamed from: c */
    public long mo22650c() {
        if (this.f20917e) {
            this.f20916d = this.f20914b.mo22643c();
            this.f20917e = false;
        }
        return this.f20916d;
    }

    /* renamed from: d */
    public C6301c mo22620d() {
        return this.f20915c;
    }

    /* renamed from: h */
    public void mo22474h() throws IOException, UnsupportedOperationException {
        if (mo22651g()) {
            throw new UnsupportedOperationException("Streaming entity does not implement #consumeContent()");
        }
    }

    /* renamed from: f */
    public InputStream mo22473f() throws IOException, UnsupportedOperationException {
        throw new UnsupportedOperationException("Multipart form entity does not implement #getContent()");
    }

    /* renamed from: a */
    public void mo22468a(OutputStream outputStream) throws IOException {
        this.f20914b.mo22640a(outputStream);
    }
}
