package com.google.android.gms.internal.p148e;

import com.google.android.gms.internal.p148e.C4513cu.C4514a;
import com.google.android.gms.internal.p148e.C4513cu.C4515b;
import com.google.android.gms.internal.p148e.C4513cu.C4518e;

/* renamed from: com.google.android.gms.internal.e.f */
public final class C4578f {

    /* renamed from: com.google.android.gms.internal.e.f$a */
    public static final class C4579a extends C4513cu<C4579a, C4580a> implements C4556ee {
        /* access modifiers changed from: private */
        public static final C4579a zzauw = new C4579a();
        private static volatile C4565en<C4579a> zznw;
        private String zzauu = "";
        private long zzauv;
        private int zznr;

        /* renamed from: com.google.android.gms.internal.e.f$a$a */
        public static final class C4580a extends C4514a<C4579a, C4580a> implements C4556ee {
            private C4580a() {
                super(C4579a.zzauw);
            }

            /* renamed from: a */
            public final C4580a mo16722a(String str) {
                mo16618b();
                ((C4579a) this.f14841a).m19759a(str);
                return this;
            }

            /* renamed from: a */
            public final C4580a mo16721a(long j) {
                mo16618b();
                ((C4579a) this.f14841a).m19756a(j);
                return this;
            }

            /* synthetic */ C4580a(C4614g gVar) {
                this();
            }
        }

        private C4579a() {
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public final void m19759a(String str) {
            if (str == null) {
                throw new NullPointerException();
            }
            this.zznr |= 1;
            this.zzauu = str;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public final void m19756a(long j) {
            this.zznr |= 2;
            this.zzauv = j;
        }

        /* renamed from: a */
        public static C4580a m19755a() {
            return (C4580a) ((C4514a) zzauw.mo16606a(C4518e.f14849e, (Object) null, (Object) null));
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final Object mo16606a(int i, Object obj, Object obj2) {
            switch (C4614g.f15013a[i - 1]) {
                case 1:
                    return new C4579a();
                case 2:
                    return new C4580a(null);
                case 3:
                    Object[] objArr = {"zznr", "zzauu", "zzauv"};
                    return m19409a((C4554ec) zzauw, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\b\u0000\u0002\u0002\u0001", objArr);
                case 4:
                    return zzauw;
                case 5:
                    C4565en<C4579a> enVar = zznw;
                    if (enVar == null) {
                        synchronized (C4579a.class) {
                            enVar = zznw;
                            if (enVar == null) {
                                enVar = new C4515b<>(zzauw);
                                zznw = enVar;
                            }
                        }
                    }
                    return enVar;
                case 6:
                    return Byte.valueOf(1);
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        static {
            C4513cu.m19411a(C4579a.class, zzauw);
        }
    }

    /* renamed from: com.google.android.gms.internal.e.f$b */
    public static final class C4581b extends C4513cu<C4581b, C4582a> implements C4556ee {
        /* access modifiers changed from: private */
        public static final C4581b zzauz = new C4581b();
        private static volatile C4565en<C4581b> zznw;
        private int zzaux = 1;
        private C4525da<C4579a> zzauy = m19413i();
        private int zznr;

        /* renamed from: com.google.android.gms.internal.e.f$b$a */
        public static final class C4582a extends C4514a<C4581b, C4582a> implements C4556ee {
            private C4582a() {
                super(C4581b.zzauz);
            }

            /* renamed from: a */
            public final C4582a mo16723a(C4579a aVar) {
                mo16618b();
                ((C4581b) this.f14841a).m19765a(aVar);
                return this;
            }

            /* synthetic */ C4582a(C4614g gVar) {
                this();
            }
        }

        /* renamed from: com.google.android.gms.internal.e.f$b$b */
        public enum C4583b implements C4521cx {
            RADS(1),
            PROVISIONING(2);
            

            /* renamed from: c */
            private static final C4522cy<C4583b> f14960c = null;

            /* renamed from: d */
            private final int f14962d;

            /* renamed from: a */
            public final int mo16629a() {
                return this.f14962d;
            }

            /* renamed from: a */
            public static C4583b m19771a(int i) {
                switch (i) {
                    case 1:
                        return RADS;
                    case 2:
                        return PROVISIONING;
                    default:
                        return null;
                }
            }

            /* renamed from: b */
            public static C4523cz m19772b() {
                return C4636i.f15092a;
            }

            private C4583b(int i) {
                this.f14962d = i;
            }

            static {
                f14960c = new C4635h();
            }
        }

        private C4581b() {
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public final void m19765a(C4579a aVar) {
            if (aVar == null) {
                throw new NullPointerException();
            }
            if (!this.zzauy.mo16367a()) {
                C4525da<C4579a> daVar = this.zzauy;
                int size = daVar.size();
                this.zzauy = daVar.mo16382a(size == 0 ? 10 : size << 1);
            }
            this.zzauy.add(aVar);
        }

        /* renamed from: a */
        public static C4582a m19764a() {
            return (C4582a) ((C4514a) zzauz.mo16606a(C4518e.f14849e, (Object) null, (Object) null));
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final Object mo16606a(int i, Object obj, Object obj2) {
            switch (C4614g.f15013a[i - 1]) {
                case 1:
                    return new C4581b();
                case 2:
                    return new C4582a(null);
                case 3:
                    Object[] objArr = {"zznr", "zzaux", C4583b.m19772b(), "zzauy", C4579a.class};
                    return m19409a((C4554ec) zzauz, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\f\u0000\u0002\u001b", objArr);
                case 4:
                    return zzauz;
                case 5:
                    C4565en<C4581b> enVar = zznw;
                    if (enVar == null) {
                        synchronized (C4581b.class) {
                            enVar = zznw;
                            if (enVar == null) {
                                enVar = new C4515b<>(zzauz);
                                zznw = enVar;
                            }
                        }
                    }
                    return enVar;
                case 6:
                    return Byte.valueOf(1);
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        /* renamed from: b */
        public static C4565en<C4581b> m19767b() {
            return (C4565en) zzauz.mo16606a(C4518e.f14851g, (Object) null, (Object) null);
        }

        static {
            C4513cu.m19411a(C4581b.class, zzauz);
        }
    }
}
