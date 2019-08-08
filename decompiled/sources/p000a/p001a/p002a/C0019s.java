package p000a.p001a.p002a;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.p001a.p003b.p005b.C0028d;
import p000a.p001a.p003b.p005b.C0032h;

/* renamed from: a.a.a.s */
/* compiled from: StartAppSDK */
public final class C0019s implements Serializable, List, RandomAccess {

    /* renamed from: a */
    public static final C0019s f2a = new C0019s();

    /* renamed from: a */
    public int mo14a() {
        return 0;
    }

    /* renamed from: a */
    public boolean mo16a(@NotNull Void voidR) {
        C0032h.m45b(voidR, "element");
        return false;
    }

    public /* synthetic */ void add(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: b */
    public int mo21b(@NotNull Void voidR) {
        C0032h.m45b(voidR, "element");
        return -1;
    }

    /* renamed from: c */
    public int mo22c(@NotNull Void voidR) {
        C0032h.m45b(voidR, "element");
        return -1;
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public int hashCode() {
        return 1;
    }

    public boolean isEmpty() {
        return true;
    }

    public /* synthetic */ Object remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* synthetic */ Object set(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public Object[] toArray() {
        return C0028d.m36a(this);
    }

    public <T> T[] toArray(T[] tArr) {
        return C0028d.m37a(this, tArr);
    }

    @NotNull
    public String toString() {
        return "[]";
    }

    private C0019s() {
    }

    public final boolean contains(Object obj) {
        if (obj instanceof Void) {
            return mo16a((Void) obj);
        }
        return false;
    }

    public final int indexOf(Object obj) {
        if (obj instanceof Void) {
            return mo21b((Void) obj);
        }
        return -1;
    }

    public final int lastIndexOf(Object obj) {
        if (obj instanceof Void) {
            return mo22c((Void) obj);
        }
        return -1;
    }

    public final int size() {
        return mo14a();
    }

    public boolean equals(@Nullable Object obj) {
        return (obj instanceof List) && ((List) obj).isEmpty();
    }

    public boolean containsAll(@NotNull Collection collection) {
        C0032h.m45b(collection, "elements");
        return collection.isEmpty();
    }

    @NotNull
    /* renamed from: a */
    public Void get(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("Empty list doesn't contain element at index ");
        sb.append(i);
        sb.append('.');
        throw new IndexOutOfBoundsException(sb.toString());
    }

    @NotNull
    public Iterator iterator() {
        return C0018r.f1a;
    }

    @NotNull
    public ListIterator listIterator() {
        return C0018r.f1a;
    }

    @NotNull
    public ListIterator listIterator(int i) {
        if (i == 0) {
            return C0018r.f1a;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Index: ");
        sb.append(i);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    @NotNull
    public List subList(int i, int i2) {
        if (i == 0 && i2 == 0) {
            return this;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("fromIndex: ");
        sb.append(i);
        sb.append(", toIndex: ");
        sb.append(i2);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    private final Object readResolve() {
        return f2a;
    }
}
