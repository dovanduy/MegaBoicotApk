package org.apache.p199a.p215e.p216a.p217a;

import java.io.IOException;
import java.io.OutputStream;

/* renamed from: org.apache.a.e.a.a.b */
/* compiled from: ByteArrayBody */
public class C6359b extends C6358a {

    /* renamed from: a */
    private final byte[] f20889a;

    /* renamed from: b */
    private final String f20890b;

    /* renamed from: c */
    public String mo22632c() {
        return null;
    }

    /* renamed from: d */
    public String mo22633d() {
        return "binary";
    }

    public C6359b(byte[] bArr, String str, String str2) {
        super(str);
        if (bArr == null) {
            throw new IllegalArgumentException("byte[] may not be null");
        }
        this.f20889a = bArr;
        this.f20890b = str2;
    }

    public C6359b(byte[] bArr, String str) {
        this(bArr, "application/octet-stream", str);
    }

    /* renamed from: b */
    public String mo22631b() {
        return this.f20890b;
    }

    /* renamed from: a */
    public void mo22630a(OutputStream outputStream) throws IOException {
        outputStream.write(this.f20889a);
    }

    /* renamed from: e */
    public long mo22634e() {
        return (long) this.f20889a.length;
    }
}
