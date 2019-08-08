package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.C4375zl;
import com.google.android.gms.internal.ads.C4376zm;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.zl */
public abstract class C4375zl<MessageType extends C4375zl<MessageType, BuilderType>, BuilderType extends C4376zm<MessageType, BuilderType>> implements acl {
    private static boolean zzdpg = false;
    protected int zzdpf = 0;

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo13980a(int i) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: h */
    public final C4386zw mo14067h() {
        try {
            aab b = C4386zw.m18765b(mo13986l());
            mo13981a(b.mo13766b());
            return b.mo13765a();
        } catch (IOException e) {
            String str = "ByteString";
            String name = getClass().getName();
            StringBuilder sb = new StringBuilder(62 + String.valueOf(name).length() + String.valueOf(str).length());
            sb.append("Serializing ");
            sb.append(name);
            sb.append(" to a ");
            sb.append(str);
            sb.append(" threw an IOException (should never happen).");
            throw new RuntimeException(sb.toString(), e);
        }
    }

    /* renamed from: i */
    public final byte[] mo14068i() {
        try {
            byte[] bArr = new byte[mo13986l()];
            aak a = aak.m13055a(bArr);
            mo13981a(a);
            a.mo13867b();
            return bArr;
        } catch (IOException e) {
            String str = "byte array";
            String name = getClass().getName();
            StringBuilder sb = new StringBuilder(62 + String.valueOf(name).length() + String.valueOf(str).length());
            sb.append("Serializing ");
            sb.append(name);
            sb.append(" to a ");
            sb.append(str);
            sb.append(" threw an IOException (should never happen).");
            throw new RuntimeException(sb.toString(), e);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public int mo13984j() {
        throw new UnsupportedOperationException();
    }
}
