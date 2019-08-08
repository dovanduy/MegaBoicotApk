package com.google.android.gms.internal.p148e;

import com.google.android.gms.internal.p148e.C4461bb;
import com.google.android.gms.internal.p148e.C4462bc;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.e.bb */
public abstract class C4461bb<MessageType extends C4461bb<MessageType, BuilderType>, BuilderType extends C4462bc<MessageType, BuilderType>> implements C4554ec {
    private static boolean zzbtj = false;
    protected int zzbti = 0;

    /* renamed from: d */
    public final C4469bj mo16361d() {
        try {
            C4477br c = C4469bj.m18964c(mo16611h());
            mo16607a(c.mo16410b());
            return c.mo16409a();
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

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public int mo16362e() {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo16360a(int i) {
        throw new UnsupportedOperationException();
    }
}
