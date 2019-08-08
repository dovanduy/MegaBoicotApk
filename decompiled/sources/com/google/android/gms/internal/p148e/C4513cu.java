package com.google.android.gms.internal.p148e;

import com.google.android.gms.internal.p148e.C4513cu;
import com.google.android.gms.internal.p148e.C4513cu.C4514a;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.gms.internal.e.cu */
public abstract class C4513cu<MessageType extends C4513cu<MessageType, BuilderType>, BuilderType extends C4514a<MessageType, BuilderType>> extends C4461bb<MessageType, BuilderType> {
    private static Map<Object, C4513cu<?, ?>> zzbyf = new ConcurrentHashMap();
    protected C4596fm zzbyd = C4596fm.m19805a();
    private int zzbye = -1;

    /* renamed from: com.google.android.gms.internal.e.cu$a */
    public static abstract class C4514a<MessageType extends C4513cu<MessageType, BuilderType>, BuilderType extends C4514a<MessageType, BuilderType>> extends C4462bc<MessageType, BuilderType> {

        /* renamed from: a */
        protected MessageType f14841a;

        /* renamed from: b */
        private final MessageType f14842b;

        /* renamed from: c */
        private boolean f14843c = false;

        protected C4514a(MessageType messagetype) {
            this.f14842b = messagetype;
            this.f14841a = (C4513cu) messagetype.mo16606a(C4518e.f14848d, (Object) null, (Object) null);
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public final void mo16618b() {
            if (this.f14843c) {
                MessageType messagetype = (C4513cu) this.f14841a.mo16606a(C4518e.f14848d, (Object) null, (Object) null);
                m19424a(messagetype, this.f14841a);
                this.f14841a = messagetype;
                this.f14843c = false;
            }
        }

        /* renamed from: f */
        public final boolean mo16609f() {
            return C4513cu.m19412a(this.f14841a, false);
        }

        /* renamed from: c */
        public MessageType mo16621e() {
            if (this.f14843c) {
                return this.f14841a;
            }
            MessageType messagetype = this.f14841a;
            C4567ep.m19618a().mo16696a(messagetype).mo16691c(messagetype);
            this.f14843c = true;
            return this.f14841a;
        }

        /* renamed from: d */
        public final MessageType mo16622g() {
            MessageType messagetype = (C4513cu) mo16621e();
            boolean booleanValue = Boolean.TRUE.booleanValue();
            byte byteValue = ((Byte) messagetype.mo16606a(C4518e.f14845a, (Object) null, (Object) null)).byteValue();
            boolean z = true;
            if (byteValue != 1) {
                if (byteValue == 0) {
                    z = false;
                } else {
                    z = C4567ep.m19618a().mo16696a(messagetype).mo16692d(messagetype);
                    if (booleanValue) {
                        messagetype.mo16606a(C4518e.f14846b, (Object) z ? messagetype : null, (Object) null);
                    }
                }
            }
            if (z) {
                return messagetype;
            }
            throw new C4594fk(messagetype);
        }

        /* renamed from: a */
        public final BuilderType mo16364a(MessageType messagetype) {
            mo16618b();
            m19424a(this.f14841a, messagetype);
            return this;
        }

        /* renamed from: a */
        private static void m19424a(MessageType messagetype, MessageType messagetype2) {
            C4567ep.m19618a().mo16696a(messagetype).mo16690b(messagetype, messagetype2);
        }

        /* renamed from: a */
        public final /* synthetic */ C4462bc mo16363a() {
            return (C4514a) clone();
        }

        /* renamed from: l */
        public final /* synthetic */ C4554ec mo16615l() {
            return this.f14842b;
        }

        public /* synthetic */ Object clone() throws CloneNotSupportedException {
            C4514a aVar = (C4514a) ((C4513cu) this.f14842b).mo16606a(C4518e.f14849e, (Object) null, (Object) null);
            aVar.mo16364a((MessageType) (C4513cu) mo16621e());
            return aVar;
        }
    }

    /* renamed from: com.google.android.gms.internal.e.cu$b */
    public static class C4515b<T extends C4513cu<T, ?>> extends C4463bd<T> {

        /* renamed from: a */
        private final T f14844a;

        public C4515b(T t) {
            this.f14844a = t;
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo16623a(C4481bv bvVar, C4499ch chVar) throws C4526db {
            return C4513cu.m19407a(this.f14844a, bvVar, chVar);
        }
    }

    /* renamed from: com.google.android.gms.internal.e.cu$c */
    public static abstract class C4516c<MessageType extends C4516c<MessageType, BuilderType>, BuilderType> extends C4513cu<MessageType, BuilderType> implements C4556ee {
        protected C4504cl<Object> zzbyj = C4504cl.m19369a();
    }

    /* renamed from: com.google.android.gms.internal.e.cu$d */
    public static class C4517d<ContainingType extends C4554ec, Type> extends C4496ce<ContainingType, Type> {
    }

    /* 'enum' access flag removed */
    /* renamed from: com.google.android.gms.internal.e.cu$e */
    public static final class C4518e {

        /* renamed from: a */
        public static final int f14845a = 1;

        /* renamed from: b */
        public static final int f14846b = 2;

        /* renamed from: c */
        public static final int f14847c = 3;

        /* renamed from: d */
        public static final int f14848d = 4;

        /* renamed from: e */
        public static final int f14849e = 5;

        /* renamed from: f */
        public static final int f14850f = 6;

        /* renamed from: g */
        public static final int f14851g = 7;

        /* renamed from: h */
        public static final int f14852h = 1;

        /* renamed from: i */
        public static final int f14853i = 2;

        /* renamed from: j */
        public static final int f14854j = 1;

        /* renamed from: k */
        public static final int f14855k = 2;

        /* renamed from: l */
        private static final /* synthetic */ int[] f14856l = {f14845a, f14846b, f14847c, f14848d, f14849e, f14850f, f14851g};

        /* renamed from: m */
        private static final /* synthetic */ int[] f14857m = {f14852h, f14853i};

        /* renamed from: n */
        private static final /* synthetic */ int[] f14858n = {f14854j, f14855k};

        /* renamed from: a */
        public static int[] m19436a() {
            return (int[]) f14856l.clone();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Object mo16606a(int i, Object obj, Object obj2);

    public String toString() {
        return C4557ef.m19556a(this, super.toString());
    }

    public int hashCode() {
        if (this.zzbti != 0) {
            return this.zzbti;
        }
        this.zzbti = C4567ep.m19618a().mo16696a(this).mo16684a(this);
        return this.zzbti;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!((C4513cu) mo16606a(C4518e.f14850f, (Object) null, (Object) null)).getClass().isInstance(obj)) {
            return false;
        }
        return C4567ep.m19618a().mo16696a(this).mo16688a(this, (C4513cu) obj);
    }

    /* renamed from: f */
    public final boolean mo16609f() {
        boolean booleanValue = Boolean.TRUE.booleanValue();
        byte byteValue = ((Byte) mo16606a(C4518e.f14845a, (Object) null, (Object) null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean d = C4567ep.m19618a().mo16696a(this).mo16692d(this);
        if (booleanValue) {
            mo16606a(C4518e.f14846b, (Object) d ? this : null, (Object) null);
        }
        return d;
    }

    /* renamed from: g */
    public final BuilderType mo16610g() {
        BuilderType buildertype = (C4514a) mo16606a(C4518e.f14849e, (Object) null, (Object) null);
        buildertype.mo16364a(this);
        return buildertype;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final int mo16362e() {
        return this.zzbye;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo16360a(int i) {
        this.zzbye = i;
    }

    /* renamed from: a */
    public final void mo16607a(C4487ca caVar) throws IOException {
        C4567ep.m19618a().mo16695a(getClass()).mo16687a(this, (C4621gg) C4494cc.m19288a(caVar));
    }

    /* renamed from: h */
    public final int mo16611h() {
        if (this.zzbye == -1) {
            this.zzbye = C4567ep.m19618a().mo16696a(this).mo16689b(this);
        }
        return this.zzbye;
    }

    /* renamed from: a */
    static <T extends C4513cu<?, ?>> T m19408a(Class<T> cls) {
        T t = (C4513cu) zzbyf.get(cls);
        if (t == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                t = (C4513cu) zzbyf.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (t == null) {
            t = (C4513cu) ((C4513cu) C4601fr.m19843a(cls)).mo16606a(C4518e.f14850f, (Object) null, (Object) null);
            if (t == null) {
                throw new IllegalStateException();
            }
            zzbyf.put(cls, t);
        }
        return t;
    }

    /* renamed from: a */
    protected static <T extends C4513cu<?, ?>> void m19411a(Class<T> cls, T t) {
        zzbyf.put(cls, t);
    }

    /* renamed from: a */
    protected static Object m19409a(C4554ec ecVar, String str, Object[] objArr) {
        return new C4569er(ecVar, str, objArr);
    }

    /* renamed from: a */
    static Object m19410a(Method method, Object obj, Object... objArr) {
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
    protected static final <T extends C4513cu<T, ?>> boolean m19412a(T t, boolean z) {
        byte byteValue = ((Byte) t.mo16606a(C4518e.f14845a, (Object) null, (Object) null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        return C4567ep.m19618a().mo16696a(t).mo16692d(t);
    }

    /* renamed from: i */
    protected static <E> C4525da<E> m19413i() {
        return C4568eq.m19621d();
    }

    /* renamed from: a */
    static <T extends C4513cu<T, ?>> T m19407a(T t, C4481bv bvVar, C4499ch chVar) throws C4526db {
        T t2 = (C4513cu) t.mo16606a(C4518e.f14848d, (Object) null, (Object) null);
        try {
            C4567ep.m19618a().mo16696a(t2).mo16686a(t2, C4484by.m19060a(bvVar), chVar);
            C4567ep.m19618a().mo16696a(t2).mo16691c(t2);
            return t2;
        } catch (IOException e) {
            if (e.getCause() instanceof C4526db) {
                throw ((C4526db) e.getCause());
            }
            throw new C4526db(e.getMessage()).mo16632a(t2);
        } catch (RuntimeException e2) {
            if (e2.getCause() instanceof C4526db) {
                throw ((C4526db) e2.getCause());
            }
            throw e2;
        }
    }

    /* renamed from: j */
    public final /* synthetic */ C4555ed mo16613j() {
        C4514a aVar = (C4514a) mo16606a(C4518e.f14849e, (Object) null, (Object) null);
        aVar.mo16364a(this);
        return aVar;
    }

    /* renamed from: k */
    public final /* synthetic */ C4555ed mo16614k() {
        return (C4514a) mo16606a(C4518e.f14849e, (Object) null, (Object) null);
    }

    /* renamed from: l */
    public final /* synthetic */ C4554ec mo16615l() {
        return (C4513cu) mo16606a(C4518e.f14850f, (Object) null, (Object) null);
    }
}
