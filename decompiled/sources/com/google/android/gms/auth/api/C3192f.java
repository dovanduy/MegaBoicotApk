package com.google.android.gms.auth.api;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.C3216h;
import com.google.android.gms.common.api.C3244a.C3245a;
import com.google.android.gms.common.api.C3244a.C3255f;
import com.google.android.gms.common.api.C3266f.C3268b;
import com.google.android.gms.common.api.C3266f.C3269c;
import com.google.android.gms.common.internal.C3482e;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.auth.api.f */
final class C3192f extends C3245a<C3216h, GoogleSignInOptions> {
    C3192f() {
    }

    /* renamed from: a */
    public final /* synthetic */ C3255f mo12938a(Context context, Looper looper, C3482e eVar, Object obj, C3268b bVar, C3269c cVar) {
        C3216h hVar = new C3216h(context, looper, eVar, (GoogleSignInOptions) obj, bVar, cVar);
        return hVar;
    }

    /* renamed from: a */
    public final /* synthetic */ List mo12939a(Object obj) {
        GoogleSignInOptions googleSignInOptions = (GoogleSignInOptions) obj;
        if (googleSignInOptions == null) {
            return Collections.emptyList();
        }
        return googleSignInOptions.mo12962a();
    }
}
