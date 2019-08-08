package com.startapp.p154a.p155a.p160e;

import com.startapp.p154a.p155a.p156a.C5044c;
import java.io.DataInput;

/* renamed from: com.startapp.a.a.e.a */
/* compiled from: StartAppSDK */
public class C5058a extends C5061d {

    /* renamed from: a */
    private final int f16376a;

    /* renamed from: b */
    private final int f16377b;

    public C5058a(int i, int i2) {
        this.f16376a = i;
        this.f16377b = i2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C5044c mo18664a(DataInput dataInput) {
        C5044c cVar = new C5044c((long) (this.f16376a * this.f16377b));
        mo18670a(dataInput, cVar, (long) cVar.mo18640b());
        return cVar;
    }
}
