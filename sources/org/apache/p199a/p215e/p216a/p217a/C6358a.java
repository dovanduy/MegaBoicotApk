package org.apache.p199a.p215e.p216a.p217a;

/* renamed from: org.apache.a.e.a.a.a */
/* compiled from: AbstractContentBody */
public abstract class C6358a implements C6360c {

    /* renamed from: a */
    private final String f20886a;

    /* renamed from: b */
    private final String f20887b;

    /* renamed from: c */
    private final String f20888c;

    public C6358a(String str) {
        if (str == null) {
            throw new IllegalArgumentException("MIME type may not be null");
        }
        this.f20886a = str;
        int indexOf = str.indexOf(47);
        if (indexOf != -1) {
            this.f20887b = str.substring(0, indexOf);
            this.f20888c = str.substring(indexOf + 1);
            return;
        }
        this.f20887b = str;
        this.f20888c = null;
    }

    /* renamed from: a */
    public String mo22629a() {
        return this.f20886a;
    }
}
