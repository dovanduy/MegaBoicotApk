package org.apache.p199a.p208c;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: org.apache.a.c.j */
/* compiled from: EofSensorInputStream */
public class C6335j extends InputStream implements C6334i {

    /* renamed from: a */
    protected InputStream f20871a;

    /* renamed from: b */
    private boolean f20872b;

    /* renamed from: c */
    private final C6336k f20873c;

    public C6335j(InputStream inputStream, C6336k kVar) {
        if (inputStream == null) {
            throw new IllegalArgumentException("Wrapped stream may not be null.");
        }
        this.f20871a = inputStream;
        this.f20872b = false;
        this.f20873c = kVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo22546a() throws IOException {
        if (!this.f20872b) {
            return this.f20871a != null;
        }
        throw new IOException("Attempted read on closed stream.");
    }

    public int read() throws IOException {
        if (!mo22546a()) {
            return -1;
        }
        try {
            int read = this.f20871a.read();
            mo22545a(read);
            return read;
        } catch (IOException e) {
            mo22549c();
            throw e;
        }
    }

    public int read(byte[] bArr, int i, int i2) throws IOException {
        if (!mo22546a()) {
            return -1;
        }
        try {
            int read = this.f20871a.read(bArr, i, i2);
            mo22545a(read);
            return read;
        } catch (IOException e) {
            mo22549c();
            throw e;
        }
    }

    public int read(byte[] bArr) throws IOException {
        if (!mo22546a()) {
            return -1;
        }
        try {
            int read = this.f20871a.read(bArr);
            mo22545a(read);
            return read;
        } catch (IOException e) {
            mo22549c();
            throw e;
        }
    }

    public int available() throws IOException {
        if (!mo22546a()) {
            return 0;
        }
        try {
            return this.f20871a.available();
        } catch (IOException e) {
            mo22549c();
            throw e;
        }
    }

    public void close() throws IOException {
        this.f20872b = true;
        mo22548b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo22545a(int i) throws IOException {
        if (this.f20871a != null && i < 0) {
            boolean z = true;
            try {
                if (this.f20873c != null) {
                    z = this.f20873c.mo22470a(this.f20871a);
                }
                if (z) {
                    this.f20871a.close();
                }
            } finally {
                this.f20871a = null;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo22548b() throws IOException {
        if (this.f20871a != null) {
            boolean z = true;
            try {
                if (this.f20873c != null) {
                    z = this.f20873c.mo22471b(this.f20871a);
                }
                if (z) {
                    this.f20871a.close();
                }
            } finally {
                this.f20871a = null;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo22549c() throws IOException {
        if (this.f20871a != null) {
            boolean z = true;
            try {
                if (this.f20873c != null) {
                    z = this.f20873c.mo22472c(this.f20871a);
                }
                if (z) {
                    this.f20871a.close();
                }
            } finally {
                this.f20871a = null;
            }
        }
    }

    /* renamed from: i */
    public void mo22475i() throws IOException {
        close();
    }

    /* renamed from: j */
    public void mo22476j() throws IOException {
        this.f20872b = true;
        mo22549c();
    }
}
