package com.google.firebase.components;

import com.google.android.gms.common.internal.C3513t;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.firebase.components.a */
/* compiled from: com.google.firebase:firebase-common@@16.0.2 */
public final class C4937a<T> {

    /* renamed from: a */
    private final Set<Class<? super T>> f16112a;

    /* renamed from: b */
    private final Set<C4943e> f16113b;

    /* renamed from: c */
    private final int f16114c;

    /* renamed from: d */
    private final C4941c<T> f16115d;

    /* renamed from: e */
    private final Set<Class<?>> f16116e;

    /* renamed from: com.google.firebase.components.a$a */
    /* compiled from: com.google.firebase:firebase-common@@16.0.2 */
    public static class C4939a<T> {

        /* renamed from: a */
        private final Set<Class<? super T>> f16119a;

        /* renamed from: b */
        private final Set<C4943e> f16120b;

        /* renamed from: c */
        private int f16121c;

        /* renamed from: d */
        private C4941c<T> f16122d;

        /* renamed from: e */
        private Set<Class<?>> f16123e;

        /* synthetic */ C4939a(Class cls, Class[] clsArr, byte b) {
            this(cls, clsArr);
        }

        private C4939a(Class<T> cls, Class<? super T>... clsArr) {
            this.f16119a = new HashSet();
            this.f16120b = new HashSet();
            this.f16121c = 0;
            this.f16123e = new HashSet();
            C3513t.m12626a(cls, (Object) "Null interface");
            this.f16119a.add(cls);
            for (Class<? super T> a : clsArr) {
                C3513t.m12626a(a, (Object) "Null interface");
            }
            Collections.addAll(this.f16119a, clsArr);
        }

        /* renamed from: a */
        public C4939a<T> mo17858a(C4943e eVar) {
            C3513t.m12626a(eVar, (Object) "Null dependency");
            C3513t.m12636b(!this.f16119a.contains(eVar.mo17863a()), "Components are not allowed to depend on interfaces they themselves provide.");
            this.f16120b.add(eVar);
            return this;
        }

        /* renamed from: a */
        public C4939a<T> mo17856a() {
            return m21533a(1);
        }

        /* renamed from: b */
        public C4939a<T> mo17859b() {
            return m21533a(2);
        }

        /* renamed from: a */
        private C4939a<T> m21533a(int i) {
            C3513t.m12632a(this.f16121c == 0, (Object) "Instantiation type has already been set.");
            this.f16121c = i;
            return this;
        }

        /* renamed from: a */
        public C4939a<T> mo17857a(C4941c<T> cVar) {
            this.f16122d = (C4941c) C3513t.m12626a(cVar, (Object) "Null factory");
            return this;
        }

        /* renamed from: c */
        public C4937a<T> mo17860c() {
            C3513t.m12632a(this.f16122d != null, (Object) "Missing required property: factory.");
            C4937a aVar = new C4937a(new HashSet(this.f16119a), new HashSet(this.f16120b), this.f16121c, this.f16122d, this.f16123e, 0);
            return aVar;
        }
    }

    /* renamed from: a */
    static /* synthetic */ Object m21521a(Object obj) {
        return obj;
    }

    /* synthetic */ C4937a(Set set, Set set2, int i, C4941c cVar, Set set3, byte b) {
        this(set, set2, i, cVar, set3);
    }

    private C4937a(Set<Class<? super T>> set, Set<C4943e> set2, int i, C4941c<T> cVar, Set<Class<?>> set3) {
        this.f16112a = Collections.unmodifiableSet(set);
        this.f16113b = Collections.unmodifiableSet(set2);
        this.f16114c = i;
        this.f16115d = cVar;
        this.f16116e = Collections.unmodifiableSet(set3);
    }

    /* renamed from: a */
    public final Set<Class<? super T>> mo17848a() {
        return this.f16112a;
    }

    /* renamed from: b */
    public final Set<C4943e> mo17849b() {
        return this.f16113b;
    }

    /* renamed from: c */
    public final C4941c<T> mo17850c() {
        return this.f16115d;
    }

    /* renamed from: d */
    public final Set<Class<?>> mo17851d() {
        return this.f16116e;
    }

    /* renamed from: e */
    public final boolean mo17852e() {
        return this.f16114c == 1;
    }

    /* renamed from: f */
    public final boolean mo17853f() {
        return this.f16114c == 2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Component<");
        sb.append(Arrays.toString(this.f16112a.toArray()));
        sb.append(">{");
        sb.append(this.f16114c);
        sb.append(", deps=");
        sb.append(Arrays.toString(this.f16113b.toArray()));
        sb.append("}");
        return sb.toString();
    }

    /* renamed from: a */
    public static <T> C4939a<T> m21518a(Class<T> cls) {
        return new C4939a<>(cls, new Class[0], 0);
    }

    /* renamed from: a */
    public static <T> C4939a<T> m21519a(Class<T> cls, Class<? super T>... clsArr) {
        return new C4939a<>(cls, clsArr, 0);
    }

    @SafeVarargs
    /* renamed from: a */
    public static <T> C4937a<T> m21520a(T t, Class<T> cls, Class<? super T>... clsArr) {
        return m21519a(cls, clsArr).mo17857a(C4948j.m21547a((Object) t)).mo17860c();
    }
}
