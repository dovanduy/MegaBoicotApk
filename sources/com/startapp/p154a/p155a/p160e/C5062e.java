package com.startapp.p154a.p155a.p160e;

import com.startapp.p154a.p155a.p156a.C5044c;
import java.io.DataInput;
import java.io.IOException;

/* renamed from: com.startapp.a.a.e.e */
/* compiled from: StartAppSDK */
public class C5062e extends C5061d {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public DataInput mo18669a(byte[] bArr) {
        DataInput a = super.mo18669a(bArr);
        m21841b(a);
        return a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C5044c mo18664a(DataInput dataInput) {
        long readInt = (long) dataInput.readInt();
        C5044c cVar = new C5044c(readInt << 6);
        mo18670a(dataInput, cVar, readInt);
        return cVar;
    }

    /* renamed from: b */
    private void m21841b(DataInput dataInput) {
        try {
            dataInput.readInt();
        } catch (IOException e) {
            throw new RuntimeException("problem incrementInputStreamForBackwordCompatability", e);
        }
    }
}
