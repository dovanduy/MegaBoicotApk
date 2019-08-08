package org.apache.p199a.p215e.p216a;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.p199a.p229k.C6548a;

/* renamed from: org.apache.a.e.a.c */
/* compiled from: HttpMultipart */
public class C6365c {

    /* renamed from: a */
    private static final C6548a f20898a = m25134a(C6368e.f20910a, ": ");

    /* renamed from: b */
    private static final C6548a f20899b = m25134a(C6368e.f20910a, "\r\n");

    /* renamed from: c */
    private static final C6548a f20900c = m25134a(C6368e.f20910a, "--");

    /* renamed from: d */
    private final String f20901d;

    /* renamed from: e */
    private final Charset f20902e;

    /* renamed from: f */
    private final String f20903f;

    /* renamed from: g */
    private final List<C6357a> f20904g;

    /* renamed from: h */
    private final C6367d f20905h;

    /* renamed from: a */
    private static C6548a m25134a(Charset charset, String str) {
        ByteBuffer encode = charset.encode(CharBuffer.wrap(str));
        C6548a aVar = new C6548a(encode.remaining());
        aVar.mo23028a(encode.array(), encode.position(), encode.remaining());
        return aVar;
    }

    /* renamed from: a */
    private static void m25140a(C6548a aVar, OutputStream outputStream) throws IOException {
        outputStream.write(aVar.mo23035e(), 0, aVar.mo23034d());
    }

    /* renamed from: a */
    private static void m25136a(String str, Charset charset, OutputStream outputStream) throws IOException {
        m25140a(m25134a(charset, str), outputStream);
    }

    /* renamed from: a */
    private static void m25135a(String str, OutputStream outputStream) throws IOException {
        m25140a(m25134a(C6368e.f20910a, str), outputStream);
    }

    /* renamed from: a */
    private static void m25138a(C6369f fVar, OutputStream outputStream) throws IOException {
        m25135a(fVar.mo22644a(), outputStream);
        m25140a(f20898a, outputStream);
        m25135a(fVar.mo22645b(), outputStream);
        m25140a(f20899b, outputStream);
    }

    /* renamed from: a */
    private static void m25139a(C6369f fVar, Charset charset, OutputStream outputStream) throws IOException {
        m25136a(fVar.mo22644a(), charset, outputStream);
        m25140a(f20898a, outputStream);
        m25136a(fVar.mo22645b(), charset, outputStream);
        m25140a(f20899b, outputStream);
    }

    public C6365c(String str, Charset charset, String str2, C6367d dVar) {
        if (str == null) {
            throw new IllegalArgumentException("Multipart subtype may not be null");
        } else if (str2 == null) {
            throw new IllegalArgumentException("Multipart boundary may not be null");
        } else {
            this.f20901d = str;
            if (charset == null) {
                charset = C6368e.f20910a;
            }
            this.f20902e = charset;
            this.f20903f = str2;
            this.f20904g = new ArrayList();
            this.f20905h = dVar;
        }
    }

    /* renamed from: a */
    public List<C6357a> mo22639a() {
        return this.f20904g;
    }

    /* renamed from: a */
    public void mo22641a(C6357a aVar) {
        if (aVar != null) {
            this.f20904g.add(aVar);
        }
    }

    /* renamed from: b */
    public String mo22642b() {
        return this.f20903f;
    }

    /* renamed from: a */
    private void m25137a(C6367d dVar, OutputStream outputStream, boolean z) throws IOException {
        C6548a a = m25134a(this.f20902e, mo22642b());
        for (C6357a aVar : this.f20904g) {
            m25140a(f20900c, outputStream);
            m25140a(a, outputStream);
            m25140a(f20899b, outputStream);
            C6364b c = aVar.mo22627c();
            switch (dVar) {
                case STRICT:
                    Iterator it = c.iterator();
                    while (it.hasNext()) {
                        m25138a((C6369f) it.next(), outputStream);
                    }
                    break;
                case BROWSER_COMPATIBLE:
                    m25139a(aVar.mo22627c().mo22635a("Content-Disposition"), this.f20902e, outputStream);
                    if (aVar.mo22625b().mo22631b() != null) {
                        m25139a(aVar.mo22627c().mo22635a("Content-Type"), this.f20902e, outputStream);
                        break;
                    }
                    break;
            }
            m25140a(f20899b, outputStream);
            if (z) {
                aVar.mo22625b().mo22630a(outputStream);
            }
            m25140a(f20899b, outputStream);
        }
        m25140a(f20900c, outputStream);
        m25140a(a, outputStream);
        m25140a(f20900c, outputStream);
        m25140a(f20899b, outputStream);
    }

    /* renamed from: a */
    public void mo22640a(OutputStream outputStream) throws IOException {
        m25137a(this.f20905h, outputStream, true);
    }

    /* renamed from: c */
    public long mo22643c() {
        long j = 0;
        for (C6357a b : this.f20904g) {
            long e = b.mo22625b().mo22634e();
            if (e < 0) {
                return -1;
            }
            j += e;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            m25137a(this.f20905h, (OutputStream) byteArrayOutputStream, false);
            return j + ((long) byteArrayOutputStream.toByteArray().length);
        } catch (IOException unused) {
            return -1;
        }
    }
}
