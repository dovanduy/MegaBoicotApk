package p000a.p001a.p008e;

import com.google.android.exoplayer2.C2793C;
import java.nio.charset.Charset;
import org.jetbrains.annotations.NotNull;
import p000a.p001a.p003b.p005b.C0032h;

/* renamed from: a.a.e.a */
/* compiled from: StartAppSDK */
public final class C0054a {
    @NotNull

    /* renamed from: a */
    public static final Charset f14a;
    @NotNull

    /* renamed from: b */
    public static final Charset f15b;
    @NotNull

    /* renamed from: c */
    public static final Charset f16c;
    @NotNull

    /* renamed from: d */
    public static final Charset f17d;
    @NotNull

    /* renamed from: e */
    public static final Charset f18e;
    @NotNull

    /* renamed from: f */
    public static final Charset f19f;

    /* renamed from: g */
    public static final C0054a f20g = new C0054a();

    static {
        Charset forName = Charset.forName(C2793C.UTF8_NAME);
        C0032h.m42a((Object) forName, "Charset.forName(\"UTF-8\")");
        f14a = forName;
        Charset forName2 = Charset.forName(C2793C.UTF16_NAME);
        C0032h.m42a((Object) forName2, "Charset.forName(\"UTF-16\")");
        f15b = forName2;
        Charset forName3 = Charset.forName("UTF-16BE");
        C0032h.m42a((Object) forName3, "Charset.forName(\"UTF-16BE\")");
        f16c = forName3;
        Charset forName4 = Charset.forName("UTF-16LE");
        C0032h.m42a((Object) forName4, "Charset.forName(\"UTF-16LE\")");
        f17d = forName4;
        Charset forName5 = Charset.forName(C2793C.ASCII_NAME);
        C0032h.m42a((Object) forName5, "Charset.forName(\"US-ASCII\")");
        f18e = forName5;
        Charset forName6 = Charset.forName("ISO-8859-1");
        C0032h.m42a((Object) forName6, "Charset.forName(\"ISO-8859-1\")");
        f19f = forName6;
    }

    private C0054a() {
    }
}
