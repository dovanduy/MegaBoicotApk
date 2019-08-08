package com.google.android.gms.internal.ads;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

final class aed {

    /* renamed from: a */
    private static final Logger f10602a = Logger.getLogger(aed.class.getName());

    /* renamed from: b */
    private static final Unsafe f10603b = m13778c();

    /* renamed from: c */
    private static final Class<?> f10604c = C4381zr.m18740b();

    /* renamed from: d */
    private static final boolean f10605d = m13781c(Long.TYPE);

    /* renamed from: e */
    private static final boolean f10606e = m13781c(Integer.TYPE);

    /* renamed from: f */
    private static final C3648d f10607f;

    /* renamed from: g */
    private static final boolean f10608g = m13791f();

    /* renamed from: h */
    private static final boolean f10609h = m13789e();

    /* renamed from: i */
    private static final long f10610i = ((long) m13759a(byte[].class));

    /* renamed from: j */
    private static final long f10611j = ((long) m13759a(boolean[].class));

    /* renamed from: k */
    private static final long f10612k = ((long) m13772b(boolean[].class));

    /* renamed from: l */
    private static final long f10613l = ((long) m13759a(int[].class));

    /* renamed from: m */
    private static final long f10614m = ((long) m13772b(int[].class));

    /* renamed from: n */
    private static final long f10615n = ((long) m13759a(long[].class));

    /* renamed from: o */
    private static final long f10616o = ((long) m13772b(long[].class));

    /* renamed from: p */
    private static final long f10617p = ((long) m13759a(float[].class));

    /* renamed from: q */
    private static final long f10618q = ((long) m13772b(float[].class));

    /* renamed from: r */
    private static final long f10619r = ((long) m13759a(double[].class));

    /* renamed from: s */
    private static final long f10620s = ((long) m13772b(double[].class));

    /* renamed from: t */
    private static final long f10621t = ((long) m13759a(Object[].class));

    /* renamed from: u */
    private static final long f10622u = ((long) m13772b(Object[].class));

    /* renamed from: v */
    private static final long f10623v = m13774b(m13793g());

    /* renamed from: w */
    private static final long f10624w;
    /* access modifiers changed from: private */

    /* renamed from: x */
    public static final boolean f10625x = (ByteOrder.nativeOrder() != ByteOrder.BIG_ENDIAN);

    /* renamed from: com.google.android.gms.internal.ads.aed$a */
    static final class C3645a extends C3648d {
        C3645a(Unsafe unsafe) {
            super(unsafe);
        }

        /* renamed from: a */
        public final byte mo14198a(Object obj, long j) {
            return aed.f10625x ? aed.m13797k(obj, j) : aed.m13798l(obj, j);
        }

        /* renamed from: a */
        public final void mo14199a(Object obj, long j, byte b) {
            if (aed.f10625x) {
                aed.m13779c(obj, j, b);
            } else {
                aed.m13784d(obj, j, b);
            }
        }

        /* renamed from: a */
        public final void mo14200a(Object obj, long j, double d) {
            mo14208a(obj, j, Double.doubleToLongBits(d));
        }

        /* renamed from: a */
        public final void mo14201a(Object obj, long j, float f) {
            mo14207a(obj, j, Float.floatToIntBits(f));
        }

        /* renamed from: a */
        public final void mo14202a(Object obj, long j, boolean z) {
            if (aed.f10625x) {
                aed.m13785d(obj, j, z);
            } else {
                aed.m13788e(obj, j, z);
            }
        }

        /* renamed from: b */
        public final boolean mo14203b(Object obj, long j) {
            return aed.f10625x ? aed.m13799m(obj, j) : aed.m13800n(obj, j);
        }

        /* renamed from: c */
        public final float mo14204c(Object obj, long j) {
            return Float.intBitsToFloat(mo14209e(obj, j));
        }

        /* renamed from: d */
        public final double mo14205d(Object obj, long j) {
            return Double.longBitsToDouble(mo14210f(obj, j));
        }
    }

    /* renamed from: com.google.android.gms.internal.ads.aed$b */
    static final class C3646b extends C3648d {
        C3646b(Unsafe unsafe) {
            super(unsafe);
        }

        /* renamed from: a */
        public final byte mo14198a(Object obj, long j) {
            return aed.f10625x ? aed.m13797k(obj, j) : aed.m13798l(obj, j);
        }

        /* renamed from: a */
        public final void mo14199a(Object obj, long j, byte b) {
            if (aed.f10625x) {
                aed.m13779c(obj, j, b);
            } else {
                aed.m13784d(obj, j, b);
            }
        }

        /* renamed from: a */
        public final void mo14200a(Object obj, long j, double d) {
            mo14208a(obj, j, Double.doubleToLongBits(d));
        }

        /* renamed from: a */
        public final void mo14201a(Object obj, long j, float f) {
            mo14207a(obj, j, Float.floatToIntBits(f));
        }

        /* renamed from: a */
        public final void mo14202a(Object obj, long j, boolean z) {
            if (aed.f10625x) {
                aed.m13785d(obj, j, z);
            } else {
                aed.m13788e(obj, j, z);
            }
        }

        /* renamed from: b */
        public final boolean mo14203b(Object obj, long j) {
            return aed.f10625x ? aed.m13799m(obj, j) : aed.m13800n(obj, j);
        }

        /* renamed from: c */
        public final float mo14204c(Object obj, long j) {
            return Float.intBitsToFloat(mo14209e(obj, j));
        }

        /* renamed from: d */
        public final double mo14205d(Object obj, long j) {
            return Double.longBitsToDouble(mo14210f(obj, j));
        }
    }

    /* renamed from: com.google.android.gms.internal.ads.aed$c */
    static final class C3647c extends C3648d {
        C3647c(Unsafe unsafe) {
            super(unsafe);
        }

        /* renamed from: a */
        public final byte mo14198a(Object obj, long j) {
            return this.f10626a.getByte(obj, j);
        }

        /* renamed from: a */
        public final void mo14199a(Object obj, long j, byte b) {
            this.f10626a.putByte(obj, j, b);
        }

        /* renamed from: a */
        public final void mo14200a(Object obj, long j, double d) {
            this.f10626a.putDouble(obj, j, d);
        }

        /* renamed from: a */
        public final void mo14201a(Object obj, long j, float f) {
            this.f10626a.putFloat(obj, j, f);
        }

        /* renamed from: a */
        public final void mo14202a(Object obj, long j, boolean z) {
            this.f10626a.putBoolean(obj, j, z);
        }

        /* renamed from: b */
        public final boolean mo14203b(Object obj, long j) {
            return this.f10626a.getBoolean(obj, j);
        }

        /* renamed from: c */
        public final float mo14204c(Object obj, long j) {
            return this.f10626a.getFloat(obj, j);
        }

        /* renamed from: d */
        public final double mo14205d(Object obj, long j) {
            return this.f10626a.getDouble(obj, j);
        }
    }

    /* renamed from: com.google.android.gms.internal.ads.aed$d */
    static abstract class C3648d {

        /* renamed from: a */
        Unsafe f10626a;

        C3648d(Unsafe unsafe) {
            this.f10626a = unsafe;
        }

        /* renamed from: a */
        public abstract byte mo14198a(Object obj, long j);

        /* renamed from: a */
        public final long mo14206a(Field field) {
            return this.f10626a.objectFieldOffset(field);
        }

        /* renamed from: a */
        public abstract void mo14199a(Object obj, long j, byte b);

        /* renamed from: a */
        public abstract void mo14200a(Object obj, long j, double d);

        /* renamed from: a */
        public abstract void mo14201a(Object obj, long j, float f);

        /* renamed from: a */
        public final void mo14207a(Object obj, long j, int i) {
            this.f10626a.putInt(obj, j, i);
        }

        /* renamed from: a */
        public final void mo14208a(Object obj, long j, long j2) {
            this.f10626a.putLong(obj, j, j2);
        }

        /* renamed from: a */
        public abstract void mo14202a(Object obj, long j, boolean z);

        /* renamed from: b */
        public abstract boolean mo14203b(Object obj, long j);

        /* renamed from: c */
        public abstract float mo14204c(Object obj, long j);

        /* renamed from: d */
        public abstract double mo14205d(Object obj, long j);

        /* renamed from: e */
        public final int mo14209e(Object obj, long j) {
            return this.f10626a.getInt(obj, j);
        }

        /* renamed from: f */
        public final long mo14210f(Object obj, long j) {
            return this.f10626a.getLong(obj, j);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0103  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0105  */
    static {
        /*
            java.lang.Class<com.google.android.gms.internal.ads.aed> r0 = com.google.android.gms.internal.ads.aed.class
            java.lang.String r0 = r0.getName()
            java.util.logging.Logger r0 = java.util.logging.Logger.getLogger(r0)
            f10602a = r0
            sun.misc.Unsafe r0 = m13778c()
            f10603b = r0
            java.lang.Class r0 = com.google.android.gms.internal.ads.C4381zr.m18740b()
            f10604c = r0
            java.lang.Class r0 = java.lang.Long.TYPE
            boolean r0 = m13781c(r0)
            f10605d = r0
            java.lang.Class r0 = java.lang.Integer.TYPE
            boolean r0 = m13781c(r0)
            f10606e = r0
            sun.misc.Unsafe r0 = f10603b
            r1 = 0
            if (r0 != 0) goto L_0x002f
        L_0x002d:
            r0 = r1
            goto L_0x0054
        L_0x002f:
            boolean r0 = com.google.android.gms.internal.ads.C4381zr.m18739a()
            if (r0 == 0) goto L_0x004d
            boolean r0 = f10605d
            if (r0 == 0) goto L_0x0041
            com.google.android.gms.internal.ads.aed$b r0 = new com.google.android.gms.internal.ads.aed$b
            sun.misc.Unsafe r2 = f10603b
            r0.<init>(r2)
            goto L_0x0054
        L_0x0041:
            boolean r0 = f10606e
            if (r0 == 0) goto L_0x002d
            com.google.android.gms.internal.ads.aed$a r0 = new com.google.android.gms.internal.ads.aed$a
            sun.misc.Unsafe r2 = f10603b
            r0.<init>(r2)
            goto L_0x0054
        L_0x004d:
            com.google.android.gms.internal.ads.aed$c r0 = new com.google.android.gms.internal.ads.aed$c
            sun.misc.Unsafe r2 = f10603b
            r0.<init>(r2)
        L_0x0054:
            f10607f = r0
            boolean r0 = m13791f()
            f10608g = r0
            boolean r0 = m13789e()
            f10609h = r0
            java.lang.Class<byte[]> r0 = byte[].class
            int r0 = m13759a(r0)
            long r2 = (long) r0
            f10610i = r2
            java.lang.Class<boolean[]> r0 = boolean[].class
            int r0 = m13759a(r0)
            long r2 = (long) r0
            f10611j = r2
            java.lang.Class<boolean[]> r0 = boolean[].class
            int r0 = m13772b(r0)
            long r2 = (long) r0
            f10612k = r2
            java.lang.Class<int[]> r0 = int[].class
            int r0 = m13759a(r0)
            long r2 = (long) r0
            f10613l = r2
            java.lang.Class<int[]> r0 = int[].class
            int r0 = m13772b(r0)
            long r2 = (long) r0
            f10614m = r2
            java.lang.Class<long[]> r0 = long[].class
            int r0 = m13759a(r0)
            long r2 = (long) r0
            f10615n = r2
            java.lang.Class<long[]> r0 = long[].class
            int r0 = m13772b(r0)
            long r2 = (long) r0
            f10616o = r2
            java.lang.Class<float[]> r0 = float[].class
            int r0 = m13759a(r0)
            long r2 = (long) r0
            f10617p = r2
            java.lang.Class<float[]> r0 = float[].class
            int r0 = m13772b(r0)
            long r2 = (long) r0
            f10618q = r2
            java.lang.Class<double[]> r0 = double[].class
            int r0 = m13759a(r0)
            long r2 = (long) r0
            f10619r = r2
            java.lang.Class<double[]> r0 = double[].class
            int r0 = m13772b(r0)
            long r2 = (long) r0
            f10620s = r2
            java.lang.Class<java.lang.Object[]> r0 = java.lang.Object[].class
            int r0 = m13759a(r0)
            long r2 = (long) r0
            f10621t = r2
            java.lang.Class<java.lang.Object[]> r0 = java.lang.Object[].class
            int r0 = m13772b(r0)
            long r2 = (long) r0
            f10622u = r2
            java.lang.reflect.Field r0 = m13793g()
            long r2 = m13774b(r0)
            f10623v = r2
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            java.lang.String r2 = "value"
            java.lang.reflect.Field r0 = m13762a(r0, r2)
            if (r0 == 0) goto L_0x00f4
            java.lang.Class r2 = r0.getType()
            java.lang.Class<char[]> r3 = char[].class
            if (r2 != r3) goto L_0x00f4
            goto L_0x00f5
        L_0x00f4:
            r0 = r1
        L_0x00f5:
            long r0 = m13774b(r0)
            f10624w = r0
            java.nio.ByteOrder r0 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN
            if (r0 != r1) goto L_0x0105
            r0 = 1
            goto L_0x0106
        L_0x0105:
            r0 = 0
        L_0x0106:
            f10625x = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.aed.<clinit>():void");
    }

    private aed() {
    }

    /* renamed from: a */
    static byte m13758a(byte[] bArr, long j) {
        return f10607f.mo14198a(bArr, f10610i + j);
    }

    /* renamed from: a */
    private static int m13759a(Class<?> cls) {
        if (f10609h) {
            return f10607f.f10626a.arrayBaseOffset(cls);
        }
        return -1;
    }

    /* renamed from: a */
    static int m13760a(Object obj, long j) {
        return f10607f.mo14209e(obj, j);
    }

    /* renamed from: a */
    static long m13761a(Field field) {
        return f10607f.mo14206a(field);
    }

    /* renamed from: a */
    private static Field m13762a(Class<?> cls, String str) {
        try {
            Field declaredField = cls.getDeclaredField(str);
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    static void m13764a(Object obj, long j, double d) {
        f10607f.mo14200a(obj, j, d);
    }

    /* renamed from: a */
    static void m13765a(Object obj, long j, float f) {
        f10607f.mo14201a(obj, j, f);
    }

    /* renamed from: a */
    static void m13766a(Object obj, long j, int i) {
        f10607f.mo14207a(obj, j, i);
    }

    /* renamed from: a */
    static void m13767a(Object obj, long j, long j2) {
        f10607f.mo14208a(obj, j, j2);
    }

    /* renamed from: a */
    static void m13768a(Object obj, long j, Object obj2) {
        f10607f.f10626a.putObject(obj, j, obj2);
    }

    /* renamed from: a */
    static void m13769a(Object obj, long j, boolean z) {
        f10607f.mo14202a(obj, j, z);
    }

    /* renamed from: a */
    static void m13770a(byte[] bArr, long j, byte b) {
        f10607f.mo14199a((Object) bArr, f10610i + j, b);
    }

    /* renamed from: a */
    static boolean m13771a() {
        return f10609h;
    }

    /* renamed from: b */
    private static int m13772b(Class<?> cls) {
        if (f10609h) {
            return f10607f.f10626a.arrayIndexScale(cls);
        }
        return -1;
    }

    /* renamed from: b */
    static long m13773b(Object obj, long j) {
        return f10607f.mo14210f(obj, j);
    }

    /* renamed from: b */
    private static long m13774b(Field field) {
        if (field == null || f10607f == null) {
            return -1;
        }
        return f10607f.mo14206a(field);
    }

    /* renamed from: b */
    static boolean m13777b() {
        return f10608g;
    }

    /* renamed from: c */
    static Unsafe m13778c() {
        try {
            return (Unsafe) AccessController.doPrivileged(new aee());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static void m13779c(Object obj, long j, byte b) {
        long j2 = j & -4;
        int i = ((((int) j) ^ -1) & 3) << 3;
        m13766a(obj, j2, ((255 & b) << i) | (m13760a(obj, j2) & ((255 << i) ^ -1)));
    }

    /* renamed from: c */
    private static boolean m13781c(Class<?> cls) {
        if (!C4381zr.m18739a()) {
            return false;
        }
        try {
            Class<?> cls2 = f10604c;
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

    /* renamed from: c */
    static boolean m13782c(Object obj, long j) {
        return f10607f.mo14203b(obj, j);
    }

    /* renamed from: d */
    static float m13783d(Object obj, long j) {
        return f10607f.mo14204c(obj, j);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static void m13784d(Object obj, long j, byte b) {
        long j2 = j & -4;
        int i = (((int) j) & 3) << 3;
        m13766a(obj, j2, ((255 & b) << i) | (m13760a(obj, j2) & ((255 << i) ^ -1)));
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static void m13785d(Object obj, long j, boolean z) {
        m13779c(obj, j, z ? (byte) 1 : 0);
    }

    /* renamed from: e */
    static double m13787e(Object obj, long j) {
        return f10607f.mo14205d(obj, j);
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static void m13788e(Object obj, long j, boolean z) {
        m13784d(obj, j, z ? (byte) 1 : 0);
    }

    /* renamed from: e */
    private static boolean m13789e() {
        if (f10603b == null) {
            return false;
        }
        try {
            Class cls = f10603b.getClass();
            cls.getMethod("objectFieldOffset", new Class[]{Field.class});
            cls.getMethod("arrayBaseOffset", new Class[]{Class.class});
            cls.getMethod("arrayIndexScale", new Class[]{Class.class});
            cls.getMethod("getInt", new Class[]{Object.class, Long.TYPE});
            cls.getMethod("putInt", new Class[]{Object.class, Long.TYPE, Integer.TYPE});
            cls.getMethod("getLong", new Class[]{Object.class, Long.TYPE});
            cls.getMethod("putLong", new Class[]{Object.class, Long.TYPE, Long.TYPE});
            cls.getMethod("getObject", new Class[]{Object.class, Long.TYPE});
            cls.getMethod("putObject", new Class[]{Object.class, Long.TYPE, Object.class});
            if (C4381zr.m18739a()) {
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
            f10602a.logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "supportsUnsafeArrayOperations", sb.toString());
            return false;
        }
    }

    /* renamed from: f */
    static Object m13790f(Object obj, long j) {
        return f10607f.f10626a.getObject(obj, j);
    }

    /* renamed from: f */
    private static boolean m13791f() {
        if (f10603b == null) {
            return false;
        }
        try {
            Class cls = f10603b.getClass();
            cls.getMethod("objectFieldOffset", new Class[]{Field.class});
            cls.getMethod("getLong", new Class[]{Object.class, Long.TYPE});
            if (m13793g() == null) {
                return false;
            }
            if (C4381zr.m18739a()) {
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
            f10602a.logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "supportsUnsafeByteBufferOperations", sb.toString());
            return false;
        }
    }

    /* renamed from: g */
    private static Field m13793g() {
        if (C4381zr.m18739a()) {
            Field a = m13762a(Buffer.class, "effectiveDirectAddress");
            if (a != null) {
                return a;
            }
        }
        Field a2 = m13762a(Buffer.class, "address");
        if (a2 == null || a2.getType() != Long.TYPE) {
            return null;
        }
        return a2;
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public static byte m13797k(Object obj, long j) {
        return (byte) (m13760a(obj, j & -4) >>> ((int) (((j ^ -1) & 3) << 3)));
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public static byte m13798l(Object obj, long j) {
        return (byte) (m13760a(obj, j & -4) >>> ((int) ((j & 3) << 3)));
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public static boolean m13799m(Object obj, long j) {
        return m13797k(obj, j) != 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public static boolean m13800n(Object obj, long j) {
        return m13798l(obj, j) != 0;
    }
}
