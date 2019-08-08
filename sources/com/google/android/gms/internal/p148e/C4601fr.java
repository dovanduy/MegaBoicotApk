package com.google.android.gms.internal.p148e;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import libcore.io.Memory;
import sun.misc.Unsafe;

/* renamed from: com.google.android.gms.internal.e.fr */
final class C4601fr {

    /* renamed from: a */
    private static final Logger f14987a = Logger.getLogger(C4601fr.class.getName());

    /* renamed from: b */
    private static final Unsafe f14988b = m19862c();

    /* renamed from: c */
    private static final Class<?> f14989c = C4466bg.m18951b();

    /* renamed from: d */
    private static final boolean f14990d = m19870d(Long.TYPE);

    /* renamed from: e */
    private static final boolean f14991e = m19870d(Integer.TYPE);

    /* renamed from: f */
    private static final C4605d f14992f;

    /* renamed from: g */
    private static final boolean f14993g = m19877g();

    /* renamed from: h */
    private static final boolean f14994h = m19875f();
    /* access modifiers changed from: private */

    /* renamed from: i */
    public static final long f14995i = ((long) m19856b(byte[].class));

    /* renamed from: j */
    private static final long f14996j = ((long) m19856b(boolean[].class));

    /* renamed from: k */
    private static final long f14997k = ((long) m19861c(boolean[].class));

    /* renamed from: l */
    private static final long f14998l = ((long) m19856b(int[].class));

    /* renamed from: m */
    private static final long f14999m = ((long) m19861c(int[].class));

    /* renamed from: n */
    private static final long f15000n = ((long) m19856b(long[].class));

    /* renamed from: o */
    private static final long f15001o = ((long) m19861c(long[].class));

    /* renamed from: p */
    private static final long f15002p = ((long) m19856b(float[].class));

    /* renamed from: q */
    private static final long f15003q = ((long) m19861c(float[].class));

    /* renamed from: r */
    private static final long f15004r = ((long) m19856b(double[].class));

    /* renamed from: s */
    private static final long f15005s = ((long) m19861c(double[].class));

    /* renamed from: t */
    private static final long f15006t = ((long) m19856b(Object[].class));

    /* renamed from: u */
    private static final long f15007u = ((long) m19861c(Object[].class));

    /* renamed from: v */
    private static final long f15008v;
    /* access modifiers changed from: private */

    /* renamed from: w */
    public static final boolean f15009w = (ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN);

    /* renamed from: com.google.android.gms.internal.e.fr$a */
    static final class C4602a extends C4605d {
        C4602a(Unsafe unsafe) {
            super(unsafe);
        }

        /* renamed from: a */
        public final void mo16790a(long j, byte b) {
            Memory.pokeByte((int) (-1 & j), b);
        }

        /* renamed from: a */
        public final byte mo16789a(Object obj, long j) {
            if (C4601fr.f15009w) {
                return C4601fr.m19882k(obj, j);
            }
            return C4601fr.m19883l(obj, j);
        }

        /* renamed from: a */
        public final void mo16791a(Object obj, long j, byte b) {
            if (C4601fr.f15009w) {
                C4601fr.m19863c(obj, j, b);
            } else {
                C4601fr.m19868d(obj, j, b);
            }
        }

        /* renamed from: b */
        public final boolean mo16796b(Object obj, long j) {
            if (C4601fr.f15009w) {
                return C4601fr.m19884m(obj, j);
            }
            return C4601fr.m19885n(obj, j);
        }

        /* renamed from: a */
        public final void mo16794a(Object obj, long j, boolean z) {
            if (C4601fr.f15009w) {
                C4601fr.m19869d(obj, j, z);
            } else {
                C4601fr.m19872e(obj, j, z);
            }
        }

        /* renamed from: c */
        public final float mo16797c(Object obj, long j) {
            return Float.intBitsToFloat(mo16801e(obj, j));
        }

        /* renamed from: a */
        public final void mo16793a(Object obj, long j, float f) {
            mo16799a(obj, j, Float.floatToIntBits(f));
        }

        /* renamed from: d */
        public final double mo16798d(Object obj, long j) {
            return Double.longBitsToDouble(mo16802f(obj, j));
        }

        /* renamed from: a */
        public final void mo16792a(Object obj, long j, double d) {
            mo16800a(obj, j, Double.doubleToLongBits(d));
        }

        /* renamed from: a */
        public final void mo16795a(byte[] bArr, long j, long j2, long j3) {
            Memory.pokeByteArray((int) (-1 & j2), bArr, (int) j, (int) j3);
        }
    }

    /* renamed from: com.google.android.gms.internal.e.fr$b */
    static final class C4603b extends C4605d {
        C4603b(Unsafe unsafe) {
            super(unsafe);
        }

        /* renamed from: a */
        public final void mo16790a(long j, byte b) {
            Memory.pokeByte(j, b);
        }

        /* renamed from: a */
        public final byte mo16789a(Object obj, long j) {
            if (C4601fr.f15009w) {
                return C4601fr.m19882k(obj, j);
            }
            return C4601fr.m19883l(obj, j);
        }

        /* renamed from: a */
        public final void mo16791a(Object obj, long j, byte b) {
            if (C4601fr.f15009w) {
                C4601fr.m19863c(obj, j, b);
            } else {
                C4601fr.m19868d(obj, j, b);
            }
        }

        /* renamed from: b */
        public final boolean mo16796b(Object obj, long j) {
            if (C4601fr.f15009w) {
                return C4601fr.m19884m(obj, j);
            }
            return C4601fr.m19885n(obj, j);
        }

        /* renamed from: a */
        public final void mo16794a(Object obj, long j, boolean z) {
            if (C4601fr.f15009w) {
                C4601fr.m19869d(obj, j, z);
            } else {
                C4601fr.m19872e(obj, j, z);
            }
        }

        /* renamed from: c */
        public final float mo16797c(Object obj, long j) {
            return Float.intBitsToFloat(mo16801e(obj, j));
        }

        /* renamed from: a */
        public final void mo16793a(Object obj, long j, float f) {
            mo16799a(obj, j, Float.floatToIntBits(f));
        }

        /* renamed from: d */
        public final double mo16798d(Object obj, long j) {
            return Double.longBitsToDouble(mo16802f(obj, j));
        }

        /* renamed from: a */
        public final void mo16792a(Object obj, long j, double d) {
            mo16800a(obj, j, Double.doubleToLongBits(d));
        }

        /* renamed from: a */
        public final void mo16795a(byte[] bArr, long j, long j2, long j3) {
            Memory.pokeByteArray(j2, bArr, (int) j, (int) j3);
        }
    }

    /* renamed from: com.google.android.gms.internal.e.fr$c */
    static final class C4604c extends C4605d {
        C4604c(Unsafe unsafe) {
            super(unsafe);
        }

        /* renamed from: a */
        public final void mo16790a(long j, byte b) {
            this.f15010a.putByte(j, b);
        }

        /* renamed from: a */
        public final byte mo16789a(Object obj, long j) {
            return this.f15010a.getByte(obj, j);
        }

        /* renamed from: a */
        public final void mo16791a(Object obj, long j, byte b) {
            this.f15010a.putByte(obj, j, b);
        }

        /* renamed from: b */
        public final boolean mo16796b(Object obj, long j) {
            return this.f15010a.getBoolean(obj, j);
        }

        /* renamed from: a */
        public final void mo16794a(Object obj, long j, boolean z) {
            this.f15010a.putBoolean(obj, j, z);
        }

        /* renamed from: c */
        public final float mo16797c(Object obj, long j) {
            return this.f15010a.getFloat(obj, j);
        }

        /* renamed from: a */
        public final void mo16793a(Object obj, long j, float f) {
            this.f15010a.putFloat(obj, j, f);
        }

        /* renamed from: d */
        public final double mo16798d(Object obj, long j) {
            return this.f15010a.getDouble(obj, j);
        }

        /* renamed from: a */
        public final void mo16792a(Object obj, long j, double d) {
            this.f15010a.putDouble(obj, j, d);
        }

        /* renamed from: a */
        public final void mo16795a(byte[] bArr, long j, long j2, long j3) {
            this.f15010a.copyMemory(bArr, C4601fr.f14995i + j, null, j2, j3);
        }
    }

    /* renamed from: com.google.android.gms.internal.e.fr$d */
    static abstract class C4605d {

        /* renamed from: a */
        Unsafe f15010a;

        C4605d(Unsafe unsafe) {
            this.f15010a = unsafe;
        }

        /* renamed from: a */
        public abstract byte mo16789a(Object obj, long j);

        /* renamed from: a */
        public abstract void mo16790a(long j, byte b);

        /* renamed from: a */
        public abstract void mo16791a(Object obj, long j, byte b);

        /* renamed from: a */
        public abstract void mo16792a(Object obj, long j, double d);

        /* renamed from: a */
        public abstract void mo16793a(Object obj, long j, float f);

        /* renamed from: a */
        public abstract void mo16794a(Object obj, long j, boolean z);

        /* renamed from: a */
        public abstract void mo16795a(byte[] bArr, long j, long j2, long j3);

        /* renamed from: b */
        public abstract boolean mo16796b(Object obj, long j);

        /* renamed from: c */
        public abstract float mo16797c(Object obj, long j);

        /* renamed from: d */
        public abstract double mo16798d(Object obj, long j);

        /* renamed from: e */
        public final int mo16801e(Object obj, long j) {
            return this.f15010a.getInt(obj, j);
        }

        /* renamed from: a */
        public final void mo16799a(Object obj, long j, int i) {
            this.f15010a.putInt(obj, j, i);
        }

        /* renamed from: f */
        public final long mo16802f(Object obj, long j) {
            return this.f15010a.getLong(obj, j);
        }

        /* renamed from: a */
        public final void mo16800a(Object obj, long j, long j2) {
            this.f15010a.putLong(obj, j, j2);
        }
    }

    private C4601fr() {
    }

    /* renamed from: a */
    static boolean m19855a() {
        return f14994h;
    }

    /* renamed from: b */
    static boolean m19860b() {
        return f14993g;
    }

    /* renamed from: a */
    static <T> T m19843a(Class<T> cls) {
        try {
            return f14988b.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: b */
    private static int m19856b(Class<?> cls) {
        if (f14994h) {
            return f14992f.f15010a.arrayBaseOffset(cls);
        }
        return -1;
    }

    /* renamed from: c */
    private static int m19861c(Class<?> cls) {
        if (f14994h) {
            return f14992f.f15010a.arrayIndexScale(cls);
        }
        return -1;
    }

    /* renamed from: a */
    static int m19841a(Object obj, long j) {
        return f14992f.mo16801e(obj, j);
    }

    /* renamed from: a */
    static void m19849a(Object obj, long j, int i) {
        f14992f.mo16799a(obj, j, i);
    }

    /* renamed from: b */
    static long m19857b(Object obj, long j) {
        return f14992f.mo16802f(obj, j);
    }

    /* renamed from: a */
    static void m19850a(Object obj, long j, long j2) {
        f14992f.mo16800a(obj, j, j2);
    }

    /* renamed from: c */
    static boolean m19865c(Object obj, long j) {
        return f14992f.mo16796b(obj, j);
    }

    /* renamed from: a */
    static void m19852a(Object obj, long j, boolean z) {
        f14992f.mo16794a(obj, j, z);
    }

    /* renamed from: d */
    static float m19866d(Object obj, long j) {
        return f14992f.mo16797c(obj, j);
    }

    /* renamed from: a */
    static void m19848a(Object obj, long j, float f) {
        f14992f.mo16793a(obj, j, f);
    }

    /* renamed from: e */
    static double m19871e(Object obj, long j) {
        return f14992f.mo16798d(obj, j);
    }

    /* renamed from: a */
    static void m19847a(Object obj, long j, double d) {
        f14992f.mo16792a(obj, j, d);
    }

    /* renamed from: f */
    static Object m19874f(Object obj, long j) {
        return f14992f.f15010a.getObject(obj, j);
    }

    /* renamed from: a */
    static void m19851a(Object obj, long j, Object obj2) {
        f14992f.f15010a.putObject(obj, j, obj2);
    }

    /* renamed from: a */
    static byte m19840a(byte[] bArr, long j) {
        return f14992f.mo16789a((Object) bArr, f14995i + j);
    }

    /* renamed from: a */
    static void m19853a(byte[] bArr, long j, byte b) {
        f14992f.mo16791a((Object) bArr, f14995i + j, b);
    }

    /* renamed from: a */
    static void m19854a(byte[] bArr, long j, long j2, long j3) {
        f14992f.mo16795a(bArr, j, j2, j3);
    }

    /* renamed from: a */
    static void m19845a(long j, byte b) {
        f14992f.mo16790a(j, b);
    }

    /* renamed from: a */
    static long m19842a(ByteBuffer byteBuffer) {
        return f14992f.mo16802f(byteBuffer, f15008v);
    }

    /* renamed from: c */
    static Unsafe m19862c() {
        try {
            return (Unsafe) AccessController.doPrivileged(new C4606fs());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: f */
    private static boolean m19875f() {
        if (f14988b == null) {
            return false;
        }
        try {
            Class cls = f14988b.getClass();
            cls.getMethod("objectFieldOffset", new Class[]{Field.class});
            cls.getMethod("arrayBaseOffset", new Class[]{Class.class});
            cls.getMethod("arrayIndexScale", new Class[]{Class.class});
            cls.getMethod("getInt", new Class[]{Object.class, Long.TYPE});
            cls.getMethod("putInt", new Class[]{Object.class, Long.TYPE, Integer.TYPE});
            cls.getMethod("getLong", new Class[]{Object.class, Long.TYPE});
            cls.getMethod("putLong", new Class[]{Object.class, Long.TYPE, Long.TYPE});
            cls.getMethod("getObject", new Class[]{Object.class, Long.TYPE});
            cls.getMethod("putObject", new Class[]{Object.class, Long.TYPE, Object.class});
            if (C4466bg.m18950a()) {
                return true;
            }
            cls.getMethod("getByte", new Class[]{Object.class, Long.TYPE});
            cls.getMethod("putByte", new Class[]{Object.class, Long.TYPE, Byte.TYPE});
            cls.getMethod("getBoolean", new Class[]{Object.class, Long.TYPE});
            cls.getMethod("putBoolean", new Class[]{Object.class, Long.TYPE, Boolean.TYPE});
            cls.getMethod("getFloat", new Class[]{Object.class, Long.TYPE});
            cls.getMethod("putFloat", new Class[]{Object.class, Long.TYPE, Float.TYPE});
            cls.getMethod("getDouble", new Class[]{Object.class, Long.TYPE});
            cls.getMethod("putDouble", new Class[]{Object.class, Long.TYPE, Double.TYPE});
            return true;
        } catch (Throwable th) {
            String valueOf = String.valueOf(th);
            StringBuilder sb = new StringBuilder(71 + String.valueOf(valueOf).length());
            sb.append("platform method missing - proto runtime falling back to safer methods: ");
            sb.append(valueOf);
            f14987a.logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "supportsUnsafeArrayOperations", sb.toString());
            return false;
        }
    }

    /* renamed from: g */
    private static boolean m19877g() {
        if (f14988b == null) {
            return false;
        }
        try {
            Class cls = f14988b.getClass();
            cls.getMethod("objectFieldOffset", new Class[]{Field.class});
            cls.getMethod("getLong", new Class[]{Object.class, Long.TYPE});
            if (m19879h() == null) {
                return false;
            }
            if (C4466bg.m18950a()) {
                return true;
            }
            cls.getMethod("getByte", new Class[]{Long.TYPE});
            cls.getMethod("putByte", new Class[]{Long.TYPE, Byte.TYPE});
            cls.getMethod("getInt", new Class[]{Long.TYPE});
            cls.getMethod("putInt", new Class[]{Long.TYPE, Integer.TYPE});
            cls.getMethod("getLong", new Class[]{Long.TYPE});
            cls.getMethod("putLong", new Class[]{Long.TYPE, Long.TYPE});
            cls.getMethod("copyMemory", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
            cls.getMethod("copyMemory", new Class[]{Object.class, Long.TYPE, Object.class, Long.TYPE, Long.TYPE});
            return true;
        } catch (Throwable th) {
            String valueOf = String.valueOf(th);
            StringBuilder sb = new StringBuilder(71 + String.valueOf(valueOf).length());
            sb.append("platform method missing - proto runtime falling back to safer methods: ");
            sb.append(valueOf);
            f14987a.logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "supportsUnsafeByteBufferOperations", sb.toString());
            return false;
        }
    }

    /* renamed from: d */
    private static boolean m19870d(Class<?> cls) {
        if (!C4466bg.m18950a()) {
            return false;
        }
        try {
            Class<?> cls2 = f14989c;
            cls2.getMethod("peekLong", new Class[]{cls, Boolean.TYPE});
            cls2.getMethod("pokeLong", new Class[]{cls, Long.TYPE, Boolean.TYPE});
            cls2.getMethod("pokeInt", new Class[]{cls, Integer.TYPE, Boolean.TYPE});
            cls2.getMethod("peekInt", new Class[]{cls, Boolean.TYPE});
            cls2.getMethod("pokeByte", new Class[]{cls, Byte.TYPE});
            cls2.getMethod("peekByte", new Class[]{cls});
            cls2.getMethod("pokeByteArray", new Class[]{cls, byte[].class, Integer.TYPE, Integer.TYPE});
            cls2.getMethod("peekByteArray", new Class[]{cls, byte[].class, Integer.TYPE, Integer.TYPE});
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: h */
    private static Field m19879h() {
        if (C4466bg.m18950a()) {
            Field a = m19844a(Buffer.class, "effectiveDirectAddress");
            if (a != null) {
                return a;
            }
        }
        Field a2 = m19844a(Buffer.class, "address");
        if (a2 == null || a2.getType() != Long.TYPE) {
            return null;
        }
        return a2;
    }

    /* renamed from: a */
    private static Field m19844a(Class<?> cls, String str) {
        try {
            Field declaredField = cls.getDeclaredField(str);
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public static byte m19882k(Object obj, long j) {
        return (byte) (m19841a(obj, j & -4) >>> ((int) (((j ^ -1) & 3) << 3)));
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public static byte m19883l(Object obj, long j) {
        return (byte) (m19841a(obj, j & -4) >>> ((int) ((j & 3) << 3)));
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static void m19863c(Object obj, long j, byte b) {
        long j2 = j & -4;
        int i = ((((int) j) ^ -1) & 3) << 3;
        m19849a(obj, j2, ((255 & b) << i) | (m19841a(obj, j2) & ((255 << i) ^ -1)));
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static void m19868d(Object obj, long j, byte b) {
        long j2 = j & -4;
        int i = (((int) j) & 3) << 3;
        m19849a(obj, j2, ((255 & b) << i) | (m19841a(obj, j2) & ((255 << i) ^ -1)));
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public static boolean m19884m(Object obj, long j) {
        return m19882k(obj, j) != 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public static boolean m19885n(Object obj, long j) {
        return m19883l(obj, j) != 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static void m19869d(Object obj, long j, boolean z) {
        m19863c(obj, j, z ? (byte) 1 : 0);
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static void m19872e(Object obj, long j, boolean z) {
        m19868d(obj, j, z ? (byte) 1 : 0);
    }

    static {
        C4605d dVar = null;
        if (f14988b != null) {
            if (!C4466bg.m18950a()) {
                dVar = new C4604c(f14988b);
            } else if (f14990d) {
                dVar = new C4603b(f14988b);
            } else if (f14991e) {
                dVar = new C4602a(f14988b);
            }
        }
        f14992f = dVar;
        Field h = m19879h();
        f15008v = (h == null || f14992f == null) ? -1 : f14992f.f15010a.objectFieldOffset(h);
    }
}
