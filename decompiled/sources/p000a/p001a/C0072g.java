package p000a.p001a;

import java.io.Serializable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.p001a.p003b.p004a.C0022a;
import p000a.p001a.p003b.p005b.C0032h;

/* renamed from: a.a.g */
/* compiled from: StartAppSDK */
final class C0072g<T> implements C0041c<T>, Serializable {

    /* renamed from: a */
    private C0022a<? extends T> f26a;

    /* renamed from: b */
    private volatile Object f27b;

    /* renamed from: c */
    private final Object f28c;

    public C0072g(@NotNull C0022a<? extends T> aVar, @Nullable Object obj) {
        C0032h.m45b(aVar, "initializer");
        this.f26a = aVar;
        this.f27b = C0074i.f29a;
        if (obj == 0) {
            obj = this;
        }
        this.f28c = obj;
    }

    public /* synthetic */ C0072g(C0022a aVar, Object obj, int i, C0029e eVar) {
        if ((i & 2) != 0) {
            obj = null;
        }
        this(aVar, obj);
    }

    /* renamed from: a */
    public T mo1a() {
        T t;
        T t2 = this.f27b;
        if (t2 != C0074i.f29a) {
            return t2;
        }
        synchronized (this.f28c) {
            t = this.f27b;
            if (t == C0074i.f29a) {
                C0022a<? extends T> aVar = this.f26a;
                if (aVar == null) {
                    C0032h.m41a();
                }
                t = aVar.mo45a();
                this.f27b = t;
                this.f26a = null;
            }
        }
        return t;
    }

    /* renamed from: b */
    public boolean mo72b() {
        return this.f27b != C0074i.f29a;
    }

    @NotNull
    public String toString() {
        return mo72b() ? String.valueOf(mo1a()) : "Lazy value not initialized yet.";
    }

    private final Object writeReplace() {
        return new C0000a(mo1a());
    }
}
