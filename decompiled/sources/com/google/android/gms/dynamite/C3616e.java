package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule.C3606a;
import com.google.android.gms.dynamite.DynamiteModule.C3607b;
import com.google.android.gms.dynamite.DynamiteModule.C3607b.C3608a;
import com.google.android.gms.dynamite.DynamiteModule.C3607b.C3609b;

/* renamed from: com.google.android.gms.dynamite.e */
final class C3616e implements C3607b {
    C3616e() {
    }

    /* renamed from: a */
    public final C3609b mo13745a(Context context, String str, C3608a aVar) throws C3606a {
        C3609b bVar = new C3609b();
        bVar.f10263a = aVar.mo13746a(context, str);
        if (bVar.f10263a != 0) {
            bVar.f10264b = aVar.mo13747a(context, str, false);
        } else {
            bVar.f10264b = aVar.mo13747a(context, str, true);
        }
        if (bVar.f10263a == 0 && bVar.f10264b == 0) {
            bVar.f10265c = 0;
        } else if (bVar.f10263a >= bVar.f10264b) {
            bVar.f10265c = -1;
        } else {
            bVar.f10265c = 1;
        }
        return bVar;
    }
}
