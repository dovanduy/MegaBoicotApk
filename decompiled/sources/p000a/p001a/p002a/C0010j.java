package p000a.p001a.p002a;

import java.util.Collection;
import org.jetbrains.annotations.NotNull;
import p000a.p001a.p003b.p005b.C0032h;

/* renamed from: a.a.a.j */
/* compiled from: StartAppSDK */
class C0010j extends C0009i {
    /* renamed from: a */
    public static final <T> int m9a(@NotNull Iterable<? extends T> iterable, int i) {
        C0032h.m45b(iterable, "receiver$0");
        return iterable instanceof Collection ? ((Collection) iterable).size() : i;
    }
}
