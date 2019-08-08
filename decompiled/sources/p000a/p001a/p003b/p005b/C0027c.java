package p000a.p001a.p003b.p005b;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.p001a.p003b.C0021a;
import p000a.p001a.p007d.C0048b;

/* renamed from: a.a.b.b.c */
/* compiled from: StartAppSDK */
public final class C0027c implements C0026b, C0048b<Object> {
    @NotNull

    /* renamed from: a */
    private final Class<?> f6a;

    public C0027c(@NotNull Class<?> cls) {
        C0032h.m45b(cls, "jClass");
        this.f6a = cls;
    }

    @NotNull
    /* renamed from: a */
    public Class<?> mo53a() {
        return this.f6a;
    }

    public boolean equals(@Nullable Object obj) {
        return (obj instanceof C0027c) && C0032h.m44a((Object) C0021a.m24a(this), (Object) C0021a.m24a((C0048b) obj));
    }

    public int hashCode() {
        return C0021a.m24a(this).hashCode();
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(mo53a().toString());
        sb.append(" (Kotlin reflection is not available)");
        return sb.toString();
    }
}
