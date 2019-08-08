package com.google.android.gms.auth.api.signin;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.auth.api.C3172a;
import com.google.android.gms.auth.api.signin.internal.C3217i;
import com.google.android.gms.common.C3405c;
import com.google.android.gms.common.C3415h;
import com.google.android.gms.common.api.C3263e;
import com.google.android.gms.common.api.C3391k;
import com.google.android.gms.common.api.internal.C3277a;
import com.google.android.gms.common.api.internal.C3377n;
import com.google.android.gms.common.internal.C3506s.C3507a;
import com.google.android.gms.dynamite.DynamiteModule;

/* renamed from: com.google.android.gms.auth.api.signin.c */
public class C3199c extends C3263e<GoogleSignInOptions> {

    /* renamed from: b */
    private static final C3200a f9386b = new C3200a(null);

    /* renamed from: c */
    private static int f9387c = C3201b.f9388a;

    /* renamed from: com.google.android.gms.auth.api.signin.c$a */
    private static class C3200a implements C3507a<C3202d, GoogleSignInAccount> {
        private C3200a() {
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo12982a(C3391k kVar) {
            return ((C3202d) kVar).mo12983a();
        }

        /* synthetic */ C3200a(C3207i iVar) {
            this();
        }
    }

    /* 'enum' access flag removed */
    /* renamed from: com.google.android.gms.auth.api.signin.c$b */
    static final class C3201b {

        /* renamed from: a */
        public static final int f9388a = 1;

        /* renamed from: b */
        public static final int f9389b = 2;

        /* renamed from: c */
        public static final int f9390c = 3;

        /* renamed from: d */
        public static final int f9391d = 4;

        /* renamed from: e */
        private static final /* synthetic */ int[] f9392e = {f9388a, f9389b, f9390c, f9391d};

        /* renamed from: a */
        public static int[] m11503a() {
            return (int[]) f9392e.clone();
        }
    }

    C3199c(Activity activity, GoogleSignInOptions googleSignInOptions) {
        super(activity, C3172a.f9241e, googleSignInOptions, (C3377n) new C3277a());
    }

    /* renamed from: j */
    private final synchronized int m11500j() {
        if (f9387c == C3201b.f9388a) {
            Context h = mo13123h();
            C3405c a = C3405c.m12234a();
            int b = a.mo13408b(h, C3415h.f9877b);
            if (b == 0) {
                f9387c = C3201b.f9391d;
            } else if (a.mo13402a(h, b, (String) null) != null || DynamiteModule.m12872a(h, "com.google.android.gms.auth.api.fallback") == 0) {
                f9387c = C3201b.f9389b;
            } else {
                f9387c = C3201b.f9390c;
            }
        }
        return f9387c;
    }

    /* renamed from: a */
    public Intent mo12981a() {
        Context h = mo13123h();
        switch (C3207i.f9396a[m11500j() - 1]) {
            case 1:
                return C3217i.m11551b(h, (GoogleSignInOptions) mo13118c());
            case 2:
                return C3217i.m11547a(h, (GoogleSignInOptions) mo13118c());
            default:
                return C3217i.m11552c(h, (GoogleSignInOptions) mo13118c());
        }
    }
}
