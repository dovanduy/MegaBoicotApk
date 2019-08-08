package com.startapp.p154a.p155a.p160e;

import com.startapp.p154a.p155a.p156a.C5044c;
import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.PrintStream;

/* renamed from: com.startapp.a.a.e.d */
/* compiled from: StartAppSDK */
public abstract class C5061d {

    /* renamed from: a */
    private final C5060c f16380a = new C5060c();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract C5044c mo18664a(DataInput dataInput);

    /* renamed from: a */
    public C5044c mo18668a(String str) {
        if (str == null) {
            return null;
        }
        try {
            byte[] a = this.f16380a.mo18667a(str);
            if (a == null) {
                return null;
            }
            return mo18664a(mo18669a(a));
        } catch (Exception e) {
            if (e.getMessage() != null && e.getMessage().contains("HighPageCountException")) {
                PrintStream printStream = System.err;
                StringBuilder sb = new StringBuilder();
                sb.append("HighPageCountException (PLM-2573) ");
                sb.append(e.getMessage());
                sb.append(", bad bloom token: ");
                sb.append(str);
                printStream.println(sb.toString());
            }
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo18670a(DataInput dataInput, C5044c cVar, long j) {
        int c = cVar.mo18641c();
        long j2 = j;
        for (int i = 0; i < c; i++) {
            long[] a = cVar.mo18639a(i);
            long j3 = j2;
            int i2 = 0;
            while (true) {
                if (i2 >= 4096) {
                    j2 = j3;
                    break;
                }
                long j4 = j3 - 1;
                if (j3 <= 0) {
                    j2 = j4;
                    break;
                }
                a[i2] = dataInput.readLong();
                i2++;
                j3 = j4;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public DataInput mo18669a(byte[] bArr) {
        return new DataInputStream(new ByteArrayInputStream(bArr));
    }
}
