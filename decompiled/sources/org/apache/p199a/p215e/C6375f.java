package org.apache.p199a.p215e;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;

/* renamed from: org.apache.a.e.f */
/* compiled from: StringEntity */
public class C6375f extends C6356a implements Cloneable {

    /* renamed from: d */
    protected final byte[] f20922d;

    /* renamed from: a */
    public boolean mo22469a() {
        return true;
    }

    /* renamed from: g */
    public boolean mo22651g() {
        return false;
    }

    public C6375f(String str, String str2, String str3) throws UnsupportedEncodingException {
        if (str == null) {
            throw new IllegalArgumentException("Source string may not be null");
        }
        if (str2 == null) {
            str2 = "text/plain";
        }
        if (str3 == null) {
            str3 = "ISO-8859-1";
        }
        this.f20922d = str.getBytes(str3);
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(str2);
        stringBuffer.append("; charset=");
        stringBuffer.append(str3);
        mo22615a(stringBuffer.toString());
    }

    public C6375f(String str, String str2) throws UnsupportedEncodingException {
        this(str, null, str2);
    }

    /* renamed from: c */
    public long mo22650c() {
        return (long) this.f20922d.length;
    }

    /* renamed from: f */
    public InputStream mo22473f() throws IOException {
        return new ByteArrayInputStream(this.f20922d);
    }

    /* renamed from: a */
    public void mo22468a(OutputStream outputStream) throws IOException {
        if (outputStream == null) {
            throw new IllegalArgumentException("Output stream may not be null");
        }
        outputStream.write(this.f20922d);
        outputStream.flush();
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
