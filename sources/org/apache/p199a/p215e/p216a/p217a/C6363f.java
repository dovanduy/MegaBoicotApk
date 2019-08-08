package org.apache.p199a.p215e.p216a.p217a;

import com.google.android.exoplayer2.C2793C;
import com.google.android.exoplayer2.extractor.MpegAudioHeader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/* renamed from: org.apache.a.e.a.a.f */
/* compiled from: StringBody */
public class C6363f extends C6358a {

    /* renamed from: a */
    private final byte[] f20894a;

    /* renamed from: b */
    private final Charset f20895b;

    /* renamed from: b */
    public String mo22631b() {
        return null;
    }

    /* renamed from: d */
    public String mo22633d() {
        return "8bit";
    }

    public C6363f(String str, String str2, Charset charset) throws UnsupportedEncodingException {
        super(str2);
        if (str == null) {
            throw new IllegalArgumentException("Text may not be null");
        }
        if (charset == null) {
            charset = Charset.forName(C2793C.ASCII_NAME);
        }
        this.f20894a = str.getBytes(charset.name());
        this.f20895b = charset;
    }

    public C6363f(String str) throws UnsupportedEncodingException {
        this(str, "text/plain", null);
    }

    /* renamed from: a */
    public void mo22630a(OutputStream outputStream) throws IOException {
        if (outputStream == null) {
            throw new IllegalArgumentException("Output stream may not be null");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(this.f20894a);
        byte[] bArr = new byte[MpegAudioHeader.MAX_FRAME_SIZE_BYTES];
        while (true) {
            int read = byteArrayInputStream.read(bArr);
            if (read != -1) {
                outputStream.write(bArr, 0, read);
            } else {
                outputStream.flush();
                return;
            }
        }
    }

    /* renamed from: c */
    public String mo22632c() {
        return this.f20895b.name();
    }

    /* renamed from: e */
    public long mo22634e() {
        return (long) this.f20894a.length;
    }
}
