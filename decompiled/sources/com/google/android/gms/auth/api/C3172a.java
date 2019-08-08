package com.google.android.gms.auth.api;

import android.os.Bundle;
import com.google.android.gms.auth.api.credentials.C3183a;
import com.google.android.gms.auth.api.proxy.C3193a;
import com.google.android.gms.auth.api.signin.C3198b;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.C3215g;
import com.google.android.gms.auth.api.signin.internal.C3216h;
import com.google.android.gms.common.api.C3244a;
import com.google.android.gms.common.api.C3244a.C3245a;
import com.google.android.gms.common.api.C3244a.C3248d.C3253e;
import com.google.android.gms.common.api.C3244a.C3256g;
import com.google.android.gms.internal.auth-api.C4394e;
import com.google.android.gms.internal.auth-api.C4395f;

/* renamed from: com.google.android.gms.auth.api.a */
public final class C3172a {

    /* renamed from: a */
    public static final C3256g<C4395f> f9237a = new C3256g<>();

    /* renamed from: b */
    public static final C3256g<C3216h> f9238b = new C3256g<>();
    @Deprecated

    /* renamed from: c */
    public static final C3244a<C3181c> f9239c = C3180b.f9283a;

    /* renamed from: d */
    public static final C3244a<C3173a> f9240d = new C3244a<>("Auth.CREDENTIALS_API", f9245i, f9237a);

    /* renamed from: e */
    public static final C3244a<GoogleSignInOptions> f9241e = new C3244a<>("Auth.GOOGLE_SIGN_IN_API", f9246j, f9238b);
    @Deprecated

    /* renamed from: f */
    public static final C3193a f9242f = C3180b.f9284b;

    /* renamed from: g */
    public static final C3183a f9243g = new C4394e();

    /* renamed from: h */
    public static final C3198b f9244h = new C3215g();

    /* renamed from: i */
    private static final C3245a<C4395f, C3173a> f9245i = new C3191e();

    /* renamed from: j */
    private static final C3245a<C3216h, GoogleSignInOptions> f9246j = new C3192f();

    @Deprecated
    /* renamed from: com.google.android.gms.auth.api.a$a */
    public static class C3173a implements C3253e {

        /* renamed from: a */
        private static final C3173a f9247a = new C3174a().mo12871a();

        /* renamed from: b */
        private final String f9248b = null;

        /* renamed from: c */
        private final boolean f9249c;

        @Deprecated
        /* renamed from: com.google.android.gms.auth.api.a$a$a */
        public static class C3174a {

            /* renamed from: a */
            protected Boolean f9250a = Boolean.valueOf(false);

            /* renamed from: a */
            public C3173a mo12871a() {
                return new C3173a(this);
            }
        }

        public C3173a(C3174a aVar) {
            this.f9249c = aVar.f9250a.booleanValue();
        }

        /* renamed from: a */
        public final Bundle mo12870a() {
            Bundle bundle = new Bundle();
            bundle.putString("consumer_package", null);
            bundle.putBoolean("force_save_dialog", this.f9249c);
            return bundle;
        }
    }
}
