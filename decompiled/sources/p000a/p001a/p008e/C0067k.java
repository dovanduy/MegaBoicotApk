package p000a.p001a.p008e;

import org.jetbrains.annotations.NotNull;
import p000a.p001a.p003b.p005b.C0032h;

/* renamed from: a.a.e.k */
/* compiled from: StartAppSDK */
class C0067k extends C0066j {
    /* renamed from: a */
    public static /* synthetic */ boolean m65a(String str, String str2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return C0059c.m64a(str, str2, z);
    }

    /* renamed from: a */
    public static final boolean m64a(@NotNull String str, @NotNull String str2, boolean z) {
        C0032h.m45b(str, "receiver$0");
        C0032h.m45b(str2, "prefix");
        if (!z) {
            return str.startsWith(str2);
        }
        return C0059c.m63a(str, 0, str2, 0, str2.length(), z);
    }

    /* renamed from: a */
    public static final boolean m63a(@NotNull String str, int i, @NotNull String str2, int i2, int i3, boolean z) {
        C0032h.m45b(str, "receiver$0");
        C0032h.m45b(str2, "other");
        if (!z) {
            return str.regionMatches(i, str2, i2, i3);
        }
        return str.regionMatches(z, i, str2, i2, i3);
    }
}
