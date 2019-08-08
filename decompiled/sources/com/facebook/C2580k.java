package com.facebook;

/* renamed from: com.facebook.k */
/* compiled from: FacebookGraphResponseException */
public class C2580k extends C2579j {

    /* renamed from: a */
    private final C2661r f8044a;

    public C2580k(C2661r rVar, String str) {
        super(str);
        this.f8044a = rVar;
    }

    public final String toString() {
        FacebookRequestError a = this.f8044a != null ? this.f8044a.mo9370a() : null;
        StringBuilder sb = new StringBuilder();
        sb.append("{FacebookGraphResponseException: ");
        String message = getMessage();
        if (message != null) {
            sb.append(message);
            sb.append(" ");
        }
        if (a != null) {
            sb.append("httpResponseCode: ");
            sb.append(a.mo6656a());
            sb.append(", facebookErrorCode: ");
            sb.append(a.mo6657b());
            sb.append(", facebookErrorType: ");
            sb.append(a.mo6659d());
            sb.append(", message: ");
            sb.append(a.mo6661e());
            sb.append("}");
        }
        return sb.toString();
    }
}
