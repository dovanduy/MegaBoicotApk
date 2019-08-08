package com.google.android.gms.common.api;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.C3244a.C3248d;
import com.google.android.gms.common.api.C3266f.C3268b;
import com.google.android.gms.common.api.C3266f.C3269c;
import com.google.android.gms.common.internal.C3469d.C3472c;
import com.google.android.gms.common.internal.C3469d.C3474e;
import com.google.android.gms.common.internal.C3482e;
import com.google.android.gms.common.internal.C3494m;
import com.google.android.gms.common.internal.C3513t;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* renamed from: com.google.android.gms.common.api.a */
public final class C3244a<O extends C3248d> {

    /* renamed from: a */
    private final C3245a<?, O> f9466a;

    /* renamed from: b */
    private final C3258i<?, O> f9467b = null;

    /* renamed from: c */
    private final C3256g<?> f9468c;

    /* renamed from: d */
    private final C3259j<?> f9469d;

    /* renamed from: e */
    private final String f9470e;

    /* renamed from: com.google.android.gms.common.api.a$a */
    public static abstract class C3245a<T extends C3255f, O> extends C3254e<T, O> {
        /* renamed from: a */
        public abstract T mo12938a(Context context, Looper looper, C3482e eVar, O o, C3268b bVar, C3269c cVar);
    }

    /* renamed from: com.google.android.gms.common.api.a$b */
    public interface C3246b {
    }

    /* renamed from: com.google.android.gms.common.api.a$c */
    public static class C3247c<C extends C3246b> {
    }

    /* renamed from: com.google.android.gms.common.api.a$d */
    public interface C3248d {

        /* renamed from: com.google.android.gms.common.api.a$d$a */
        public interface C3249a extends C3251c, C3252d {
            /* renamed from: a */
            Account mo13091a();
        }

        /* renamed from: com.google.android.gms.common.api.a$d$b */
        public interface C3250b extends C3251c {
            /* renamed from: a */
            GoogleSignInAccount mo13092a();
        }

        /* renamed from: com.google.android.gms.common.api.a$d$c */
        public interface C3251c extends C3248d {
        }

        /* renamed from: com.google.android.gms.common.api.a$d$d */
        public interface C3252d extends C3248d {
        }

        /* renamed from: com.google.android.gms.common.api.a$d$e */
        public interface C3253e extends C3251c, C3252d {
        }
    }

    /* renamed from: com.google.android.gms.common.api.a$e */
    public static abstract class C3254e<T extends C3246b, O> {
        /* renamed from: a */
        public int mo13093a() {
            return Integer.MAX_VALUE;
        }

        /* renamed from: a */
        public List<Scope> mo12939a(O o) {
            return Collections.emptyList();
        }
    }

    /* renamed from: com.google.android.gms.common.api.a$f */
    public interface C3255f extends C3246b {
        /* renamed from: a */
        void mo13094a(C3472c cVar);

        /* renamed from: a */
        void mo13095a(C3474e eVar);

        /* renamed from: a */
        void mo13096a(C3494m mVar, Set<Scope> set);

        /* renamed from: a */
        void mo13097a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

        /* renamed from: c */
        boolean mo13016c();

        /* renamed from: d */
        Intent mo13017d();

        /* renamed from: f */
        int mo13019f();

        /* renamed from: g */
        void mo13098g();

        /* renamed from: h */
        boolean mo13099h();

        /* renamed from: i */
        boolean mo13100i();

        /* renamed from: j */
        boolean mo13101j();

        /* renamed from: k */
        boolean mo13102k();

        /* renamed from: l */
        IBinder mo13103l();

        /* renamed from: m */
        String mo13104m();

        /* renamed from: n */
        Feature[] mo13105n();
    }

    /* renamed from: com.google.android.gms.common.api.a$g */
    public static final class C3256g<C extends C3255f> extends C3247c<C> {
    }

    /* renamed from: com.google.android.gms.common.api.a$h */
    public interface C3257h<T extends IInterface> extends C3246b {
        /* renamed from: a */
        T mo13106a(IBinder iBinder);

        /* renamed from: a */
        String mo13107a();

        /* renamed from: a */
        void mo13108a(int i, T t);

        /* renamed from: b */
        String mo13109b();
    }

    /* renamed from: com.google.android.gms.common.api.a$i */
    public static abstract class C3258i<T extends C3257h, O> extends C3254e<T, O> {
    }

    /* renamed from: com.google.android.gms.common.api.a$j */
    public static final class C3259j<C extends C3257h> extends C3247c<C> {
    }

    public <C extends C3255f> C3244a(String str, C3245a<C, O> aVar, C3256g<C> gVar) {
        C3513t.m12626a(aVar, (Object) "Cannot construct an Api with a null ClientBuilder");
        C3513t.m12626a(gVar, (Object) "Cannot construct an Api with a null ClientKey");
        this.f9470e = str;
        this.f9466a = aVar;
        this.f9468c = gVar;
        this.f9469d = null;
    }

    /* renamed from: a */
    public final C3254e<?, O> mo13087a() {
        return this.f9466a;
    }

    /* renamed from: b */
    public final C3245a<?, O> mo13088b() {
        C3513t.m12632a(this.f9466a != null, (Object) "This API was constructed with a SimpleClientBuilder. Use getSimpleClientBuilder");
        return this.f9466a;
    }

    /* renamed from: c */
    public final C3247c<?> mo13089c() {
        if (this.f9468c != null) {
            return this.f9468c;
        }
        throw new IllegalStateException("This API was constructed with null client keys. This should not be possible.");
    }

    /* renamed from: d */
    public final String mo13090d() {
        return this.f9470e;
    }
}
