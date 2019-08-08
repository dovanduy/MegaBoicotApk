package com.google.android.gms.common.api;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.api.C3244a.C3246b;
import com.google.android.gms.common.api.C3244a.C3248d;
import com.google.android.gms.common.api.C3244a.C3255f;
import com.google.android.gms.common.api.internal.C3277a;
import com.google.android.gms.common.api.internal.C3311bf;
import com.google.android.gms.common.api.internal.C3320bo;
import com.google.android.gms.common.api.internal.C3332c.C3333a;
import com.google.android.gms.common.api.internal.C3337cc;
import com.google.android.gms.common.api.internal.C3360d;
import com.google.android.gms.common.api.internal.C3360d.C3361a;
import com.google.android.gms.common.api.internal.C3377n;
import com.google.android.gms.common.api.internal.C3383t;
import com.google.android.gms.common.internal.C3513t;

/* renamed from: com.google.android.gms.common.api.e */
public class C3263e<O extends C3248d> {

    /* renamed from: a */
    protected final C3360d f9473a;

    /* renamed from: b */
    private final Context f9474b;

    /* renamed from: c */
    private final C3244a<O> f9475c;

    /* renamed from: d */
    private final O f9476d;

    /* renamed from: e */
    private final C3337cc<O> f9477e;

    /* renamed from: f */
    private final Looper f9478f;

    /* renamed from: g */
    private final int f9479g;

    /* renamed from: h */
    private final C3266f f9480h;

    /* renamed from: i */
    private final C3377n f9481i;

    /* renamed from: com.google.android.gms.common.api.e$a */
    public static class C3264a {

        /* renamed from: a */
        public static final C3264a f9482a = new C3265a().mo13127a();

        /* renamed from: b */
        public final C3377n f9483b;

        /* renamed from: c */
        public final Looper f9484c;

        /* renamed from: com.google.android.gms.common.api.e$a$a */
        public static class C3265a {

            /* renamed from: a */
            private C3377n f9485a;

            /* renamed from: b */
            private Looper f9486b;

            /* renamed from: a */
            public C3265a mo13126a(C3377n nVar) {
                C3513t.m12626a(nVar, (Object) "StatusExceptionMapper must not be null.");
                this.f9485a = nVar;
                return this;
            }

            /* renamed from: a */
            public C3265a mo13125a(Looper looper) {
                C3513t.m12626a(looper, (Object) "Looper must not be null.");
                this.f9486b = looper;
                return this;
            }

            /* renamed from: a */
            public C3264a mo13127a() {
                if (this.f9485a == null) {
                    this.f9485a = new C3277a();
                }
                if (this.f9486b == null) {
                    this.f9486b = Looper.getMainLooper();
                }
                return new C3264a(this.f9485a, this.f9486b);
            }
        }

        private C3264a(C3377n nVar, Account account, Looper looper) {
            this.f9483b = nVar;
            this.f9484c = looper;
        }
    }

    protected C3263e(Context context, C3244a<O> aVar, Looper looper) {
        C3513t.m12626a(context, (Object) "Null context is not permitted.");
        C3513t.m12626a(aVar, (Object) "Api must not be null.");
        C3513t.m12626a(looper, (Object) "Looper must not be null.");
        this.f9474b = context.getApplicationContext();
        this.f9475c = aVar;
        this.f9476d = null;
        this.f9478f = looper;
        this.f9477e = C3337cc.m11900a(aVar);
        this.f9480h = new C3311bf(this);
        this.f9473a = C3360d.m12032a(this.f9474b);
        this.f9479g = this.f9473a.mo13317c();
        this.f9481i = new C3277a();
    }

    public C3263e(Activity activity, C3244a<O> aVar, O o, C3264a aVar2) {
        C3513t.m12626a(activity, (Object) "Null activity is not permitted.");
        C3513t.m12626a(aVar, (Object) "Api must not be null.");
        C3513t.m12626a(aVar2, (Object) "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        this.f9474b = activity.getApplicationContext();
        this.f9475c = aVar;
        this.f9476d = o;
        this.f9478f = aVar2.f9484c;
        this.f9477e = C3337cc.m11901a(this.f9475c, this.f9476d);
        this.f9480h = new C3311bf(this);
        this.f9473a = C3360d.m12032a(this.f9474b);
        this.f9479g = this.f9473a.mo13317c();
        this.f9481i = aVar2.f9483b;
        if (!(activity instanceof GoogleApiActivity)) {
            C3383t.m12143a(activity, this.f9473a, this.f9477e);
        }
        this.f9473a.mo13311a(this);
    }

    public C3263e(Context context, C3244a<O> aVar, O o, C3264a aVar2) {
        C3513t.m12626a(context, (Object) "Null context is not permitted.");
        C3513t.m12626a(aVar, (Object) "Api must not be null.");
        C3513t.m12626a(aVar2, (Object) "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        this.f9474b = context.getApplicationContext();
        this.f9475c = aVar;
        this.f9476d = o;
        this.f9478f = aVar2.f9484c;
        this.f9477e = C3337cc.m11901a(this.f9475c, this.f9476d);
        this.f9480h = new C3311bf(this);
        this.f9473a = C3360d.m12032a(this.f9474b);
        this.f9479g = this.f9473a.mo13317c();
        this.f9481i = aVar2.f9483b;
        this.f9473a.mo13311a(this);
    }

    @Deprecated
    public C3263e(Activity activity, C3244a<O> aVar, O o, C3377n nVar) {
        this(activity, aVar, o, new C3265a().mo13126a(nVar).mo13125a(activity.getMainLooper()).mo13127a());
    }

    @Deprecated
    public C3263e(Context context, C3244a<O> aVar, O o, C3377n nVar) {
        this(context, aVar, o, new C3265a().mo13126a(nVar).mo13127a());
    }

    /* renamed from: a */
    private final <A extends C3246b, T extends C3333a<? extends C3391k, A>> T m11634a(int i, T t) {
        t.mo13166h();
        this.f9473a.mo13312a(this, i, t);
        return t;
    }

    /* renamed from: a */
    public <A extends C3246b, T extends C3333a<? extends C3391k, A>> T mo13115a(T t) {
        return m11634a(0, t);
    }

    /* renamed from: b */
    public <A extends C3246b, T extends C3333a<? extends C3391k, A>> T mo13117b(T t) {
        return m11634a(1, t);
    }

    /* renamed from: a */
    public C3255f mo13113a(Looper looper, C3361a<O> aVar) {
        return this.f9475c.mo13088b().mo12938a(this.f9474b, looper, mo13124i().mo13585a(), this.f9476d, aVar, aVar);
    }

    /* renamed from: b */
    public final C3244a<O> mo13116b() {
        return this.f9475c;
    }

    /* renamed from: c */
    public O mo13118c() {
        return this.f9476d;
    }

    /* renamed from: d */
    public final C3337cc<O> mo13119d() {
        return this.f9477e;
    }

    /* renamed from: e */
    public final int mo13120e() {
        return this.f9479g;
    }

    /* renamed from: f */
    public C3266f mo13121f() {
        return this.f9480h;
    }

    /* renamed from: g */
    public Looper mo13122g() {
        return this.f9478f;
    }

    /* renamed from: h */
    public Context mo13123h() {
        return this.f9474b;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0034  */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.android.gms.common.internal.C3482e.C3483a mo13124i() {
        /*
            r2 = this;
            com.google.android.gms.common.internal.e$a r0 = new com.google.android.gms.common.internal.e$a
            r0.<init>()
            O r1 = r2.f9476d
            boolean r1 = r1 instanceof com.google.android.gms.common.api.C3244a.C3248d.C3250b
            if (r1 == 0) goto L_0x001a
            O r1 = r2.f9476d
            com.google.android.gms.common.api.a$d$b r1 = (com.google.android.gms.common.api.C3244a.C3248d.C3250b) r1
            com.google.android.gms.auth.api.signin.GoogleSignInAccount r1 = r1.mo13092a()
            if (r1 == 0) goto L_0x001a
            android.accounts.Account r1 = r1.mo12950d()
            goto L_0x002a
        L_0x001a:
            O r1 = r2.f9476d
            boolean r1 = r1 instanceof com.google.android.gms.common.api.C3244a.C3248d.C3249a
            if (r1 == 0) goto L_0x0029
            O r1 = r2.f9476d
            com.google.android.gms.common.api.a$d$a r1 = (com.google.android.gms.common.api.C3244a.C3248d.C3249a) r1
            android.accounts.Account r1 = r1.mo13091a()
            goto L_0x002a
        L_0x0029:
            r1 = 0
        L_0x002a:
            com.google.android.gms.common.internal.e$a r0 = r0.mo13582a(r1)
            O r1 = r2.f9476d
            boolean r1 = r1 instanceof com.google.android.gms.common.api.C3244a.C3248d.C3250b
            if (r1 == 0) goto L_0x0043
            O r1 = r2.f9476d
            com.google.android.gms.common.api.a$d$b r1 = (com.google.android.gms.common.api.C3244a.C3248d.C3250b) r1
            com.google.android.gms.auth.api.signin.GoogleSignInAccount r1 = r1.mo13092a()
            if (r1 == 0) goto L_0x0043
            java.util.Set r1 = r1.mo12959k()
            goto L_0x0047
        L_0x0043:
            java.util.Set r1 = java.util.Collections.emptySet()
        L_0x0047:
            com.google.android.gms.common.internal.e$a r0 = r0.mo13584a(r1)
            android.content.Context r1 = r2.f9474b
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            com.google.android.gms.common.internal.e$a r0 = r0.mo13586b(r1)
            android.content.Context r1 = r2.f9474b
            java.lang.String r1 = r1.getPackageName()
            com.google.android.gms.common.internal.e$a r0 = r0.mo13583a(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.C3263e.mo13124i():com.google.android.gms.common.internal.e$a");
    }

    /* renamed from: a */
    public C3320bo mo13114a(Context context, Handler handler) {
        return new C3320bo(context, handler, mo13124i().mo13585a());
    }
}
