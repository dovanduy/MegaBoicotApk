package p000a.p001a.p008e;

import java.io.Serializable;
import java.util.regex.Pattern;
import org.jetbrains.annotations.NotNull;
import p000a.p001a.p003b.p005b.C0032h;

/* renamed from: a.a.e.b */
/* compiled from: StartAppSDK */
public final class C0055b implements Serializable {

    /* renamed from: a */
    public static final C0056a f21a = new C0056a(null);

    /* renamed from: b */
    private final Pattern f22b;

    /* renamed from: a.a.e.b$a */
    /* compiled from: StartAppSDK */
    public static final class C0056a {
        private C0056a() {
        }

        public /* synthetic */ C0056a(C0029e eVar) {
            this();
        }
    }

    /* renamed from: a.a.e.b$b */
    /* compiled from: StartAppSDK */
    private static final class C0057b implements Serializable {

        /* renamed from: a */
        public static final C0058a f23a = new C0058a(null);
        @NotNull

        /* renamed from: b */
        private final String f24b;

        /* renamed from: c */
        private final int f25c;

        /* renamed from: a.a.e.b$b$a */
        /* compiled from: StartAppSDK */
        public static final class C0058a {
            private C0058a() {
            }

            public /* synthetic */ C0058a(C0029e eVar) {
                this();
            }
        }

        public C0057b(@NotNull String str, int i) {
            C0032h.m45b(str, "pattern");
            this.f24b = str;
            this.f25c = i;
        }

        private final Object readResolve() {
            Pattern compile = Pattern.compile(this.f24b, this.f25c);
            C0032h.m42a((Object) compile, "Pattern.compile(pattern, flags)");
            return new C0055b(compile);
        }
    }

    public C0055b(@NotNull Pattern pattern) {
        C0032h.m45b(pattern, "nativePattern");
        this.f22b = pattern;
    }

    public C0055b(@NotNull String str) {
        C0032h.m45b(str, "pattern");
        Pattern compile = Pattern.compile(str);
        C0032h.m42a((Object) compile, "Pattern.compile(pattern)");
        this(compile);
    }

    /* renamed from: a */
    public final boolean mo70a(@NotNull CharSequence charSequence) {
        C0032h.m45b(charSequence, "input");
        return this.f22b.matcher(charSequence).matches();
    }

    @NotNull
    public String toString() {
        String pattern = this.f22b.toString();
        C0032h.m42a((Object) pattern, "nativePattern.toString()");
        return pattern;
    }

    private final Object writeReplace() {
        String pattern = this.f22b.pattern();
        C0032h.m42a((Object) pattern, "nativePattern.pattern()");
        return new C0057b(pattern, this.f22b.flags());
    }
}
