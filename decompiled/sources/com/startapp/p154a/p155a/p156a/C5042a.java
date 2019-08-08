package com.startapp.p154a.p155a.p156a;

import java.nio.ByteBuffer;
import java.util.List;

/* renamed from: com.startapp.a.a.a.a */
/* compiled from: StartAppSDK */
public class C5042a {

    /* renamed from: a */
    private final int f16328a;

    /* renamed from: b */
    private final int f16329b;

    public C5042a(int i, int i2) {
        this.f16328a = i;
        this.f16329b = i2;
    }

    /* renamed from: a */
    public C5044c mo18635a(List<String> list) {
        C5044c cVar = new C5044c((long) (this.f16328a * this.f16329b));
        mo18636a(list, cVar);
        return cVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo18636a(List<String> list, C5044c cVar) {
        for (String bytes : list) {
            m21791a(ByteBuffer.wrap(bytes.getBytes()), cVar);
        }
    }

    /* renamed from: a */
    private void m21791a(ByteBuffer byteBuffer, C5044c cVar) {
        for (long a : m21792a(byteBuffer, cVar.mo18637a())) {
            cVar.mo18638a(a);
        }
    }

    /* renamed from: a */
    private long[] m21792a(ByteBuffer byteBuffer, long j) {
        long[] jArr = new long[this.f16328a];
        long j2 = j / ((long) this.f16328a);
        long a = C5043b.m21795a(byteBuffer, byteBuffer.position(), byteBuffer.remaining(), 0);
        long a2 = C5043b.m21795a(byteBuffer, byteBuffer.position(), byteBuffer.remaining(), a);
        for (int i = 0; i < this.f16328a; i++) {
            long j3 = (long) i;
            jArr[i] = (j3 * j2) + Math.abs((a + (j3 * a2)) % j2);
        }
        return jArr;
    }
}
