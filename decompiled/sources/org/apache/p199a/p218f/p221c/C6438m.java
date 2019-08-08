package org.apache.p199a.p218f.p221c;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.apache.commons.logging.Log;

/* renamed from: org.apache.a.f.c.m */
/* compiled from: Wire */
public class C6438m {

    /* renamed from: a */
    private final Log f21103a;

    public C6438m(Log log) {
        this.f21103a = log;
    }

    /* renamed from: a */
    private void m25518a(String str, InputStream inputStream) throws IOException {
        StringBuilder sb = new StringBuilder();
        while (true) {
            int read = inputStream.read();
            if (read == -1) {
                break;
            } else if (read == 13) {
                sb.append("[\\r]");
            } else if (read == 10) {
                sb.append("[\\n]\"");
                sb.insert(0, "\"");
                sb.insert(0, str);
                this.f21103a.debug(sb.toString());
                sb.setLength(0);
            } else if (read < 32 || read > 127) {
                sb.append("[0x");
                sb.append(Integer.toHexString(read));
                sb.append("]");
            } else {
                sb.append((char) read);
            }
        }
        if (sb.length() > 0) {
            sb.append('\"');
            sb.insert(0, '\"');
            sb.insert(0, str);
            this.f21103a.debug(sb.toString());
        }
    }

    /* renamed from: a */
    public boolean mo22828a() {
        return this.f21103a.isDebugEnabled();
    }

    /* renamed from: a */
    public void mo22827a(byte[] bArr, int i, int i2) throws IOException {
        if (bArr == null) {
            throw new IllegalArgumentException("Output may not be null");
        }
        m25518a(">> ", new ByteArrayInputStream(bArr, i, i2));
    }

    /* renamed from: b */
    public void mo22831b(byte[] bArr, int i, int i2) throws IOException {
        if (bArr == null) {
            throw new IllegalArgumentException("Input may not be null");
        }
        m25518a("<< ", new ByteArrayInputStream(bArr, i, i2));
    }

    /* renamed from: a */
    public void mo22826a(byte[] bArr) throws IOException {
        if (bArr == null) {
            throw new IllegalArgumentException("Output may not be null");
        }
        m25518a(">> ", new ByteArrayInputStream(bArr));
    }

    /* renamed from: b */
    public void mo22830b(byte[] bArr) throws IOException {
        if (bArr == null) {
            throw new IllegalArgumentException("Input may not be null");
        }
        m25518a("<< ", new ByteArrayInputStream(bArr));
    }

    /* renamed from: a */
    public void mo22825a(int i) throws IOException {
        mo22826a(new byte[]{(byte) i});
    }

    /* renamed from: b */
    public void mo22829b(int i) throws IOException {
        mo22830b(new byte[]{(byte) i});
    }
}
