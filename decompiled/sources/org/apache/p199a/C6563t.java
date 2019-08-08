package org.apache.p199a;

import java.io.Serializable;

/* renamed from: org.apache.a.t */
/* compiled from: HttpVersion */
public final class C6563t extends C6569z implements Serializable {

    /* renamed from: a */
    public static final C6563t f21276a = new C6563t(0, 9);

    /* renamed from: b */
    public static final C6563t f21277b = new C6563t(1, 0);

    /* renamed from: c */
    public static final C6563t f21278c = new C6563t(1, 1);

    public C6563t(int i, int i2) {
        super("HTTP", i, i2);
    }

    /* renamed from: a */
    public C6569z mo23067a(int i, int i2) {
        if (i == this.f21280e && i2 == this.f21281f) {
            return this;
        }
        if (i == 1) {
            if (i2 == 0) {
                return f21277b;
            }
            if (i2 == 1) {
                return f21278c;
            }
        }
        if (i == 0 && i2 == 9) {
            return f21276a;
        }
        return new C6563t(i, i2);
    }
}
