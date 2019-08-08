package com.google.android.gms.auth.api.signin;

import com.google.android.gms.common.api.Scope;
import java.util.Comparator;

/* renamed from: com.google.android.gms.auth.api.signin.e */
final /* synthetic */ class C3203e implements Comparator {

    /* renamed from: a */
    static final Comparator f9395a = new C3203e();

    private C3203e() {
    }

    public final int compare(Object obj, Object obj2) {
        return ((Scope) obj).mo13073a().compareTo(((Scope) obj2).mo13073a());
    }
}
