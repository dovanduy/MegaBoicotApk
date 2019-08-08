package com.facebook;

/* renamed from: com.facebook.i */
/* compiled from: FacebookDialogException */
public class C2474i extends C2579j {

    /* renamed from: a */
    private int f7787a;

    /* renamed from: b */
    private String f7788b;

    public C2474i(String str, int i, String str2) {
        super(str);
        this.f7787a = i;
        this.f7788b = str2;
    }

    /* renamed from: a */
    public int mo8909a() {
        return this.f7787a;
    }

    /* renamed from: b */
    public String mo8910b() {
        return this.f7788b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{FacebookDialogException: ");
        sb.append("errorCode: ");
        sb.append(mo8909a());
        sb.append(", message: ");
        sb.append(getMessage());
        sb.append(", url: ");
        sb.append(mo8910b());
        sb.append("}");
        return sb.toString();
    }
}
