package com.google.android.gms.internal.p148e;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.Log;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.Nullable;

/* renamed from: com.google.android.gms.internal.e.as */
public abstract class C4451as<T> {

    /* renamed from: a */
    private static final Object f14668a = new Object();
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: b */
    private static Context f14669b = null;

    /* renamed from: c */
    private static boolean f14670c = false;

    /* renamed from: g */
    private static final AtomicInteger f14671g = new AtomicInteger();

    /* renamed from: d */
    private final C4457ay f14672d;

    /* renamed from: e */
    private final String f14673e;

    /* renamed from: f */
    private final T f14674f;

    /* renamed from: h */
    private volatile int f14675h;

    /* renamed from: i */
    private volatile T f14676i;

    /* renamed from: a */
    public static void m18908a(Context context) {
        synchronized (f14668a) {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
            if (f14669b != context) {
                synchronized (C4439ag.class) {
                    C4439ag.f14654a.clear();
                }
                synchronized (C4458az.class) {
                    C4458az.f14684a.clear();
                }
                synchronized (C4447ao.class) {
                    C4447ao.f14664a = null;
                }
                f14671g.incrementAndGet();
                f14669b = context;
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract T mo16348a(Object obj);

    /* renamed from: a */
    static void m18907a() {
        f14671g.incrementAndGet();
    }

    private C4451as(C4457ay ayVar, String str, T t) {
        this.f14675h = -1;
        if (ayVar.f14678b == null) {
            throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
        }
        this.f14672d = ayVar;
        this.f14673e = str;
        this.f14674f = t;
    }

    /* renamed from: a */
    private final String m18906a(String str) {
        if (str != null && str.isEmpty()) {
            return this.f14673e;
        }
        String valueOf = String.valueOf(str);
        String valueOf2 = String.valueOf(this.f14673e);
        return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
    }

    /* renamed from: b */
    public final String mo16349b() {
        return m18906a(this.f14672d.f14680d);
    }

    /* renamed from: c */
    public final T mo16350c() {
        return this.f14674f;
    }

    /* renamed from: d */
    public final T mo16351d() {
        int i = f14671g.get();
        if (this.f14675h < i) {
            synchronized (this) {
                if (this.f14675h < i) {
                    if (f14669b == null) {
                        throw new IllegalStateException("Must call PhenotypeFlag.init() first");
                    }
                    C4457ay ayVar = this.f14672d;
                    T e = m18914e();
                    if (e == null) {
                        e = m18915f();
                        if (e == null) {
                            e = this.f14674f;
                        }
                    }
                    this.f14676i = e;
                    this.f14675h = i;
                }
            }
        }
        return this.f14676i;
    }

    @Nullable
    /* renamed from: e */
    private final T m18914e() {
        C4444al alVar;
        C4457ay ayVar = this.f14672d;
        String str = (String) C4447ao.m18895a(f14669b).mo16339a("gms:phenotype:phenotype_flag:debug_bypass_phenotype");
        if (!(str != null && C4436ad.f14640b.matcher(str).matches())) {
            if (this.f14672d.f14678b != null) {
                alVar = C4439ag.m18880a(f14669b.getContentResolver(), this.f14672d.f14678b);
            } else {
                Context context = f14669b;
                C4457ay ayVar2 = this.f14672d;
                alVar = C4458az.m18936a(context, (String) null);
            }
            if (alVar != null) {
                Object a = alVar.mo16339a(mo16349b());
                if (a != null) {
                    return mo16348a(a);
                }
            }
        } else {
            String str2 = "PhenotypeFlag";
            String str3 = "Bypass reading Phenotype values for flag: ";
            String valueOf = String.valueOf(mo16349b());
            Log.w(str2, valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
        }
        return null;
    }

    @Nullable
    /* renamed from: f */
    private final T m18915f() {
        C4457ay ayVar = this.f14672d;
        C4447ao a = C4447ao.m18895a(f14669b);
        C4457ay ayVar2 = this.f14672d;
        Object a2 = a.mo16339a(m18906a(this.f14672d.f14679c));
        if (a2 != null) {
            return mo16348a(a2);
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static C4451as<Long> m18911b(C4457ay ayVar, String str, long j) {
        return new C4452at(ayVar, str, Long.valueOf(j));
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static C4451as<Integer> m18910b(C4457ay ayVar, String str, int i) {
        return new C4453au(ayVar, str, Integer.valueOf(i));
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static C4451as<Boolean> m18913b(C4457ay ayVar, String str, boolean z) {
        return new C4454av(ayVar, str, Boolean.valueOf(z));
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static C4451as<Double> m18909b(C4457ay ayVar, String str, double d) {
        return new C4455aw(ayVar, str, Double.valueOf(d));
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static C4451as<String> m18912b(C4457ay ayVar, String str, String str2) {
        return new C4456ax(ayVar, str, str2);
    }

    /* synthetic */ C4451as(C4457ay ayVar, String str, Object obj, C4452at atVar) {
        this(ayVar, str, obj);
    }
}
