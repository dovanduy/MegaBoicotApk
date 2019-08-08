package com.facebook;

/* renamed from: com.facebook.o */
/* compiled from: FacebookServiceException */
public class C2656o extends C2579j {

    /* renamed from: a */
    private final FacebookRequestError f8258a;

    public C2656o(FacebookRequestError facebookRequestError, String str) {
        super(str);
        this.f8258a = facebookRequestError;
    }

    /* renamed from: a */
    public final FacebookRequestError mo9338a() {
        return this.f8258a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{FacebookServiceException: ");
        sb.append("httpResponseCode: ");
        sb.append(this.f8258a.mo6656a());
        sb.append(", facebookErrorCode: ");
        sb.append(this.f8258a.mo6657b());
        sb.append(", facebookErrorType: ");
        sb.append(this.f8258a.mo6659d());
        sb.append(", message: ");
        sb.append(this.f8258a.mo6661e());
        sb.append("}");
        return sb.toString();
    }
}
