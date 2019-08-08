package com.google.android.gms.signin;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.C3244a.C3245a;
import com.google.android.gms.common.api.C3244a.C3255f;
import com.google.android.gms.common.api.C3266f.C3268b;
import com.google.android.gms.common.api.C3266f.C3269c;
import com.google.android.gms.common.internal.C3482e;
import com.google.android.gms.signin.internal.C4908a;

/* renamed from: com.google.android.gms.signin.c */
final class C4905c extends C3245a<C4908a, C4902a> {
    C4905c() {
    }

    /* renamed from: a */
    public final /* synthetic */ C3255f mo12938a(Context context, Looper looper, C3482e eVar, Object obj, C3268b bVar, C3269c cVar) {
        C4902a aVar = (C4902a) obj;
        if (aVar == null) {
            aVar = C4902a.f16032a;
        }
        C4908a aVar2 = new C4908a(context, looper, true, eVar, aVar, bVar, cVar);
        return aVar2;
    }
}
