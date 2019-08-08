package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.abe;
import com.google.android.gms.internal.ads.abe.C3636a;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public abstract class abe<MessageType extends abe<MessageType, BuilderType>, BuilderType extends C3636a<MessageType, BuilderType>> extends C4375zl<MessageType, BuilderType> {
    private static Map<Object, abe<?, ?>> zzdtv = new ConcurrentHashMap();
    protected ady zzdtt = ady.m13723a();
    private int zzdtu = -1;

    /* renamed from: com.google.android.gms.internal.ads.abe$a */
    public static abstract class C3636a<MessageType extends abe<MessageType, BuilderType>, BuilderType extends C3636a<MessageType, BuilderType>> extends C4376zm<MessageType, BuilderType> {

        /* renamed from: a */
        protected MessageType f10414a;

        /* renamed from: b */
        private final MessageType f10415b;

        /* renamed from: c */
        private boolean f10416c = false;

        protected C3636a(MessageType messagetype) {
            this.f10415b = messagetype;
            this.f10414a = (abe) messagetype.mo13979a(C3640e.f10421d, (Object) null, (Object) null);
        }

        /* renamed from: a */
        private static void m13300a(MessageType messagetype, MessageType messagetype2) {
            acy.m13511a().mo14083a(messagetype).mo14077b(messagetype, messagetype2);
        }

        /* renamed from: a */
        public final BuilderType mo13993a(MessageType messagetype) {
            mo13994b();
            m13300a(this.f10414a, messagetype);
            return this;
        }

        /* renamed from: a */
        public final /* synthetic */ C4376zm mo13992a() {
            return (C3636a) clone();
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public final void mo13994b() {
            if (this.f10416c) {
                MessageType messagetype = (abe) this.f10414a.mo13979a(C3640e.f10421d, (Object) null, (Object) null);
                m13300a(messagetype, this.f10414a);
                this.f10414a = messagetype;
                this.f10416c = false;
            }
        }

        /* renamed from: c */
        public final MessageType mo13995c() {
            boolean z = true;
            if (!this.f10416c) {
                MessageType messagetype = this.f10414a;
                acy.m13511a().mo14083a(messagetype).mo14078c(messagetype);
                this.f10416c = true;
            }
            MessageType messagetype2 = (abe) this.f10414a;
            boolean booleanValue = Boolean.TRUE.booleanValue();
            byte byteValue = ((Byte) messagetype2.mo13979a(C3640e.f10418a, (Object) null, (Object) null)).byteValue();
            if (byteValue != 1) {
                if (byteValue == 0) {
                    z = false;
                } else {
                    z = acy.m13511a().mo14083a(messagetype2).mo14079d(messagetype2);
                    if (booleanValue) {
                        messagetype2.mo13979a(C3640e.f10419b, (Object) z ? messagetype2 : null, (Object) null);
                    }
                }
            }
            if (z) {
                return messagetype2;
            }
            throw new adw(messagetype2);
        }

        public /* synthetic */ Object clone() throws CloneNotSupportedException {
            C3636a aVar = (C3636a) ((abe) this.f10415b).mo13979a(C3640e.f10422e, (Object) null, (Object) null);
            if (!this.f10416c) {
                MessageType messagetype = this.f10414a;
                acy.m13511a().mo14083a(messagetype).mo14078c(messagetype);
                this.f10416c = true;
            }
            aVar.mo13993a((MessageType) (abe) this.f10414a);
            return aVar;
        }

        /* renamed from: d */
        public final /* synthetic */ acl mo13997d() {
            if (this.f10416c) {
                return this.f10414a;
            }
            MessageType messagetype = this.f10414a;
            acy.m13511a().mo14083a(messagetype).mo14078c(messagetype);
            this.f10416c = true;
            return this.f10414a;
        }

        /* renamed from: e */
        public final /* synthetic */ acl mo13998e() {
            boolean z = true;
            if (!this.f10416c) {
                MessageType messagetype = this.f10414a;
                acy.m13511a().mo14083a(messagetype).mo14078c(messagetype);
                this.f10416c = true;
            }
            abe abe = (abe) this.f10414a;
            boolean booleanValue = Boolean.TRUE.booleanValue();
            byte byteValue = ((Byte) abe.mo13979a(C3640e.f10418a, (Object) null, (Object) null)).byteValue();
            if (byteValue != 1) {
                if (byteValue == 0) {
                    z = false;
                } else {
                    z = acy.m13511a().mo14083a(abe).mo14079d(abe);
                    if (booleanValue) {
                        abe.mo13979a(C3640e.f10419b, (Object) z ? abe : null, (Object) null);
                    }
                }
            }
            if (z) {
                return abe;
            }
            throw new adw(abe);
        }

        /* renamed from: k */
        public final boolean mo13985k() {
            return abe.m13288a(this.f10414a, false);
        }

        /* renamed from: p */
        public final /* synthetic */ acl mo13989p() {
            return this.f10415b;
        }
    }

    /* renamed from: com.google.android.gms.internal.ads.abe$b */
    public static class C3637b<T extends abe<T, ?>> extends C4379zp<T> {

        /* renamed from: a */
        private T f10417a;

        public C3637b(T t) {
            this.f10417a = t;
        }
    }

    /* renamed from: com.google.android.gms.internal.ads.abe$c */
    public static abstract class C3638c<MessageType extends C3638c<MessageType, BuilderType>, BuilderType> extends abe<MessageType, BuilderType> implements acn {
        protected aaw<Object> zzdtz = aaw.m13244a();
    }

    /* renamed from: com.google.android.gms.internal.ads.abe$d */
    public static class C3639d<ContainingType extends acl, Type> extends aao<ContainingType, Type> {
    }

    /* 'enum' access flag removed */
    /* renamed from: com.google.android.gms.internal.ads.abe$e */
    public static final class C3640e {

        /* renamed from: a */
        public static final int f10418a = 1;

        /* renamed from: b */
        public static final int f10419b = 2;

        /* renamed from: c */
        public static final int f10420c = 3;

        /* renamed from: d */
        public static final int f10421d = 4;

        /* renamed from: e */
        public static final int f10422e = 5;

        /* renamed from: f */
        public static final int f10423f = 6;

        /* renamed from: g */
        public static final int f10424g = 7;

        /* renamed from: h */
        public static final int f10425h = 1;

        /* renamed from: i */
        public static final int f10426i = 2;

        /* renamed from: j */
        public static final int f10427j = 1;

        /* renamed from: k */
        public static final int f10428k = 2;

        /* renamed from: l */
        private static final /* synthetic */ int[] f10429l = {f10418a, f10419b, f10420c, f10421d, f10422e, f10423f, f10424g};

        /* renamed from: m */
        private static final /* synthetic */ int[] f10430m = {f10425h, f10426i};

        /* renamed from: n */
        private static final /* synthetic */ int[] f10431n = {f10427j, f10428k};

        /* renamed from: a */
        public static int[] m13310a() {
            return (int[]) f10429l.clone();
        }
    }

    /* renamed from: a */
    private static <T extends abe<T, ?>> T m13280a(T t, aaf aaf, aar aar) throws abk {
        T t2 = (abe) t.mo13979a(C3640e.f10421d, (Object) null, (Object) null);
        try {
            acy.m13511a().mo14083a(t2).mo14072a(t2, aai.m13001a(aaf), aar);
            acy.m13511a().mo14083a(t2).mo14078c(t2);
            return t2;
        } catch (IOException e) {
            if (e.getCause() instanceof abk) {
                throw ((abk) e.getCause());
            }
            throw new abk(e.getMessage()).mo14008a(t2);
        } catch (RuntimeException e2) {
            if (e2.getCause() instanceof abk) {
                throw ((abk) e2.getCause());
            }
            throw e2;
        }
    }

    /* renamed from: a */
    protected static <T extends abe<T, ?>> T m13281a(T t, C4386zw zwVar) throws abk {
        boolean z;
        T a = m13282a(t, zwVar, aar.m13215a());
        boolean z2 = false;
        if (a != null) {
            boolean booleanValue = Boolean.TRUE.booleanValue();
            byte byteValue = ((Byte) a.mo13979a(C3640e.f10418a, (Object) null, (Object) null)).byteValue();
            if (byteValue == 1) {
                z = true;
            } else if (byteValue == 0) {
                z = false;
            } else {
                z = acy.m13511a().mo14083a(a).mo14079d(a);
                if (booleanValue) {
                    a.mo13979a(C3640e.f10419b, (Object) z ? a : null, (Object) null);
                }
            }
            if (!z) {
                throw new adw(a).mo14153a().mo14008a(a);
            }
        }
        if (a != null) {
            boolean booleanValue2 = Boolean.TRUE.booleanValue();
            byte byteValue2 = ((Byte) a.mo13979a(C3640e.f10418a, (Object) null, (Object) null)).byteValue();
            if (byteValue2 == 1) {
                z2 = true;
            } else if (byteValue2 != 0) {
                z2 = acy.m13511a().mo14083a(a).mo14079d(a);
                if (booleanValue2) {
                    a.mo13979a(C3640e.f10419b, (Object) z2 ? a : null, (Object) null);
                }
            }
            if (!z2) {
                throw new adw(a).mo14153a().mo14008a(a);
            }
        }
        return a;
    }

    /* renamed from: a */
    private static <T extends abe<T, ?>> T m13282a(T t, C4386zw zwVar, aar aar) throws abk {
        T a;
        try {
            aaf e = zwVar.mo13776e();
            a = m13280a(t, e, aar);
            e.mo13780a(0);
            return a;
        } catch (abk e2) {
            throw e2.mo14008a(a);
        } catch (abk e3) {
            throw e3;
        }
    }

    /* renamed from: a */
    protected static <T extends abe<T, ?>> T m13283a(T t, byte[] bArr) throws abk {
        T b = m13289b(t, bArr);
        if (b != null) {
            boolean booleanValue = Boolean.TRUE.booleanValue();
            byte byteValue = ((Byte) b.mo13979a(C3640e.f10418a, (Object) null, (Object) null)).byteValue();
            boolean z = true;
            if (byteValue != 1) {
                if (byteValue == 0) {
                    z = false;
                } else {
                    z = acy.m13511a().mo14083a(b).mo14079d(b);
                    if (booleanValue) {
                        b.mo13979a(C3640e.f10419b, (Object) z ? b : null, (Object) null);
                    }
                }
            }
            if (!z) {
                throw new adw(b).mo14153a().mo14008a(b);
            }
        }
        return b;
    }

    /* renamed from: a */
    static <T extends abe<?, ?>> T m13284a(Class<T> cls) {
        T t = (abe) zzdtv.get(cls);
        if (t == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                t = (abe) zzdtv.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (t != null) {
            return t;
        }
        String str = "Unable to get default instance for: ";
        String valueOf = String.valueOf(cls.getName());
        throw new IllegalStateException(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
    }

    /* renamed from: a */
    protected static Object m13285a(acl acl, String str, Object[] objArr) {
        return new ada(acl, str, objArr);
    }

    /* renamed from: a */
    static Object m13286a(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else if (cause instanceof Error) {
                throw ((Error) cause);
            } else {
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
            }
        }
    }

    /* renamed from: a */
    protected static <T extends abe<?, ?>> void m13287a(Class<T> cls, T t) {
        zzdtv.put(cls, t);
    }

    /* renamed from: a */
    protected static final <T extends abe<T, ?>> boolean m13288a(T t, boolean z) {
        byte byteValue = ((Byte) t.mo13979a(C3640e.f10418a, (Object) null, (Object) null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        return acy.m13511a().mo14083a(t).mo14079d(t);
    }

    /* renamed from: b */
    private static <T extends abe<T, ?>> T m13289b(T t, byte[] bArr) throws abk {
        T t2 = (abe) t.mo13979a(C3640e.f10421d, (Object) null, (Object) null);
        try {
            acy.m13511a().mo14083a(t2).mo14074a(t2, bArr, 0, bArr.length, new C4383zt());
            acy.m13511a().mo14083a(t2).mo14078c(t2);
            if (t2.zzdpf == 0) {
                return t2;
            }
            throw new RuntimeException();
        } catch (IOException e) {
            if (e.getCause() instanceof abk) {
                throw ((abk) e.getCause());
            }
            throw new abk(e.getMessage()).mo14008a(t2);
        } catch (IndexOutOfBoundsException unused) {
            throw abk.m13332a().mo14008a(t2);
        }
    }

    /* renamed from: m */
    protected static <E> abj<E> m13290m() {
        return acz.m13515d();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Object mo13979a(int i, Object obj, Object obj2);

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo13980a(int i) {
        this.zzdtu = i;
    }

    /* renamed from: a */
    public final void mo13981a(aak aak) throws IOException {
        acy.m13511a().mo14082a(getClass()).mo14073a(this, (aer) aam.m13161a(aak));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!((abe) mo13979a(C3640e.f10423f, (Object) null, (Object) null)).getClass().isInstance(obj)) {
            return false;
        }
        return acy.m13511a().mo14083a(this).mo14075a(this, (abe) obj);
    }

    public int hashCode() {
        if (this.zzdpf != 0) {
            return this.zzdpf;
        }
        this.zzdpf = acy.m13511a().mo14083a(this).mo14070a(this);
        return this.zzdpf;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public final int mo13984j() {
        return this.zzdtu;
    }

    /* renamed from: k */
    public final boolean mo13985k() {
        boolean booleanValue = Boolean.TRUE.booleanValue();
        byte byteValue = ((Byte) mo13979a(C3640e.f10418a, (Object) null, (Object) null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean d = acy.m13511a().mo14083a(this).mo14079d(this);
        if (booleanValue) {
            mo13979a(C3640e.f10419b, (Object) d ? this : null, (Object) null);
        }
        return d;
    }

    /* renamed from: l */
    public final int mo13986l() {
        if (this.zzdtu == -1) {
            this.zzdtu = acy.m13511a().mo14083a(this).mo14076b(this);
        }
        return this.zzdtu;
    }

    /* renamed from: n */
    public final /* synthetic */ acm mo13987n() {
        C3636a aVar = (C3636a) mo13979a(C3640e.f10422e, (Object) null, (Object) null);
        aVar.mo13993a(this);
        return aVar;
    }

    /* renamed from: o */
    public final /* synthetic */ acm mo13988o() {
        return (C3636a) mo13979a(C3640e.f10422e, (Object) null, (Object) null);
    }

    /* renamed from: p */
    public final /* synthetic */ acl mo13989p() {
        return (abe) mo13979a(C3640e.f10423f, (Object) null, (Object) null);
    }

    public String toString() {
        return aco.m13436a(this, super.toString());
    }
}
