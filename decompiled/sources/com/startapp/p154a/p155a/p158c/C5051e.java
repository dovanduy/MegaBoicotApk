package com.startapp.p154a.p155a.p158c;

import java.io.Serializable;
import java.io.Writer;

/* renamed from: com.startapp.a.a.c.e */
/* compiled from: StartAppSDK */
public class C5051e extends Writer implements Serializable {

    /* renamed from: b */
    private final StringBuilder f16368b;

    public void close() {
    }

    public void flush() {
    }

    public C5051e() {
        this.f16368b = new StringBuilder();
    }

    public C5051e(int i) {
        this.f16368b = new StringBuilder(i);
    }

    public Writer append(char c) {
        this.f16368b.append(c);
        return this;
    }

    public Writer append(CharSequence charSequence) {
        this.f16368b.append(charSequence);
        return this;
    }

    public Writer append(CharSequence charSequence, int i, int i2) {
        this.f16368b.append(charSequence, i, i2);
        return this;
    }

    public void write(String str) {
        if (str != null) {
            this.f16368b.append(str);
        }
    }

    public void write(char[] cArr, int i, int i2) {
        if (cArr != null) {
            this.f16368b.append(cArr, i, i2);
        }
    }

    public String toString() {
        return this.f16368b.toString();
    }
}
