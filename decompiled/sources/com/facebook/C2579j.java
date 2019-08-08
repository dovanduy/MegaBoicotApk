package com.facebook;

/* renamed from: com.facebook.j */
/* compiled from: FacebookException */
public class C2579j extends RuntimeException {
    public C2579j() {
    }

    public C2579j(String str) {
        super(str);
    }

    public C2579j(String str, Object... objArr) {
        this(String.format(str, objArr));
    }

    public C2579j(String str, Throwable th) {
        super(str, th);
    }

    public C2579j(Throwable th) {
        super(th);
    }

    public String toString() {
        return getMessage();
    }
}
