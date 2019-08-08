package com.appnext.base.services.p048b;

import android.content.Context;
import android.os.Build.VERSION;
import android.os.Bundle;
import com.appnext.base.p042a.p044b.C1231c;
import com.appnext.base.services.p047a.C1281a;
import com.appnext.base.services.p047a.C1282b;
import com.appnext.base.services.p047a.C1283c;
import java.util.List;

/* renamed from: com.appnext.base.services.b.a */
public class C1285a {

    /* renamed from: iA */
    private static volatile C1285a f4092iA;

    /* renamed from: iB */
    private C1283c f4093iB;

    public C1285a(Context context) {
        try {
            if (VERSION.SDK_INT >= 21) {
                this.f4093iB = new C1282b(context);
            } else {
                this.f4093iB = new C1281a(context);
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: g */
    public static C1285a m5550g(Context context) {
        if (f4092iA == null) {
            synchronized (C1285a.class) {
                if (f4092iA == null) {
                    f4092iA = new C1285a(context);
                }
            }
        }
        return f4092iA;
    }

    /* renamed from: a */
    public final void mo6051a(C1231c cVar, boolean z) {
        this.f4093iB.mo6047a(cVar, z, (Bundle) null);
    }

    /* renamed from: c */
    public final void mo6052c(C1231c cVar) {
        this.f4093iB.mo6048c(cVar);
    }

    /* renamed from: i */
    public final void mo6053i(List<C1231c> list) {
        this.f4093iB.mo6049i(list);
    }
}
