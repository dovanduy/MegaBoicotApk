package p000a.p001a.p002a;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.NoSuchElementException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.p001a.p003b.p005b.C0032h;

/* renamed from: a.a.a.q */
/* compiled from: StartAppSDK */
class C0017q extends C0016p {
    /* renamed from: c */
    public static final <T> T m14c(@NotNull List<? extends T> list) {
        C0032h.m45b(list, "receiver$0");
        if (!list.isEmpty()) {
            return list.get(0);
        }
        throw new NoSuchElementException("List is empty.");
    }

    @Nullable
    /* renamed from: d */
    public static final <T> T m15d(@NotNull List<? extends T> list) {
        C0032h.m45b(list, "receiver$0");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    /* renamed from: e */
    public static final <T> T m16e(@NotNull List<? extends T> list) {
        C0032h.m45b(list, "receiver$0");
        if (!list.isEmpty()) {
            return list.get(C0007g.m4a(list));
        }
        throw new NoSuchElementException("List is empty.");
    }

    @NotNull
    /* renamed from: a */
    public static final <T, C extends Collection<? super T>> C m10a(@NotNull Iterable<? extends T> iterable, @NotNull C c) {
        C0032h.m45b(iterable, "receiver$0");
        C0032h.m45b(c, "destination");
        for (Object add : iterable) {
            c.add(add);
        }
        return c;
    }

    @NotNull
    /* renamed from: a */
    public static final <T> List<T> m11a(@NotNull Iterable<? extends T> iterable) {
        List<T> list;
        C0032h.m45b(iterable, "receiver$0");
        if (!(iterable instanceof Collection)) {
            return C0007g.m7b(C0007g.m13b(iterable));
        }
        Collection collection = (Collection) iterable;
        switch (collection.size()) {
            case 0:
                list = C0007g.m5a();
                break;
            case 1:
                list = C0007g.m3a(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
                break;
            default:
                list = C0007g.m12a(collection);
                break;
        }
        return list;
    }

    @NotNull
    /* renamed from: b */
    public static final <T> List<T> m13b(@NotNull Iterable<? extends T> iterable) {
        C0032h.m45b(iterable, "receiver$0");
        if (iterable instanceof Collection) {
            return C0007g.m12a((Collection) iterable);
        }
        return (List) C0007g.m10a(iterable, new ArrayList());
    }

    @NotNull
    /* renamed from: a */
    public static final <T> List<T> m12a(@NotNull Collection<? extends T> collection) {
        C0032h.m45b(collection, "receiver$0");
        return new ArrayList<>(collection);
    }
}
