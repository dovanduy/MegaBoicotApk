package p000a.p001a.p002a;

import java.util.List;
import org.jetbrains.annotations.NotNull;
import p000a.p001a.p003b.p005b.C0032h;

/* renamed from: a.a.a.i */
/* compiled from: StartAppSDK */
class C0009i extends C0008h {
    @NotNull
    /* renamed from: a */
    public static final <T> List<T> m5a() {
        return C0019s.f2a;
    }

    @NotNull
    /* renamed from: a */
    public static final <T> List<T> m6a(@NotNull T... tArr) {
        C0032h.m45b(tArr, "elements");
        return tArr.length > 0 ? C0001a.m1a(tArr) : C0007g.m5a();
    }

    /* renamed from: a */
    public static final <T> int m4a(@NotNull List<? extends T> list) {
        C0032h.m45b(list, "receiver$0");
        return list.size() - 1;
    }

    @NotNull
    /* renamed from: b */
    public static final <T> List<T> m7b(@NotNull List<? extends T> list) {
        C0032h.m45b(list, "receiver$0");
        switch (list.size()) {
            case 0:
                return C0007g.m5a();
            case 1:
                return C0007g.m3a(list.get(0));
            default:
                return list;
        }
    }

    /* renamed from: b */
    public static final void m8b() {
        throw new ArithmeticException("Index overflow has happened.");
    }
}
