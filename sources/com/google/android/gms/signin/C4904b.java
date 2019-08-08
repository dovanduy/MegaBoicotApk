package com.google.android.gms.signin;

import com.google.android.gms.common.api.C3244a;
import com.google.android.gms.common.api.C3244a.C3245a;
import com.google.android.gms.common.api.C3244a.C3256g;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.signin.internal.C4908a;

/* renamed from: com.google.android.gms.signin.b */
public final class C4904b {

    /* renamed from: a */
    public static final C3245a<C4908a, C4902a> f16041a = new C4905c();

    /* renamed from: b */
    public static final C3244a<C4902a> f16042b = new C3244a<>("SignIn.API", f16041a, f16043c);

    /* renamed from: c */
    private static final C3256g<C4908a> f16043c = new C3256g<>();

    /* renamed from: d */
    private static final C3256g<C4908a> f16044d = new C3256g<>();

    /* renamed from: e */
    private static final C3245a<C4908a, Object> f16045e = new C4906d();

    /* renamed from: f */
    private static final Scope f16046f = new Scope("profile");

    /* renamed from: g */
    private static final Scope f16047g = new Scope("email");

    /* renamed from: h */
    private static final C3244a<Object> f16048h = new C3244a<>("SignIn.INTERNAL_API", f16045e, f16044d);
}
