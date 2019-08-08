package com.google.android.gms.internal.p148e;

import android.content.Context;
import android.support.p017v4.content.C0375h;
import android.util.Log;

/* renamed from: com.google.android.gms.internal.e.ao */
final class C4447ao implements C4444al {

    /* renamed from: a */
    static C4447ao f14664a;

    /* renamed from: b */
    private final Context f14665b;

    /* renamed from: a */
    static C4447ao m18895a(Context context) {
        C4447ao aoVar;
        synchronized (C4447ao.class) {
            if (f14664a == null) {
                f14664a = C0375h.m1380a(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0 ? new C4447ao(context) : new C4447ao();
            }
            aoVar = f14664a;
        }
        return aoVar;
    }

    private C4447ao(Context context) {
        this.f14665b = context;
        this.f14665b.getContentResolver().registerContentObserver(C4436ad.f14639a, true, new C4449aq(this, null));
    }

    private C4447ao() {
        this.f14665b = null;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public final String mo16339a(String str) {
        if (this.f14665b == null) {
            return null;
        }
        try {
            return (String) C4445am.m18893a(new C4448ap(this, str));
        } catch (SecurityException e) {
            String str2 = "GservicesLoader";
            String str3 = "Unable to read GServices for: ";
            String valueOf = String.valueOf(str);
            Log.e(str2, valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3), e);
            return null;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ String mo16346b(String str) {
        return C4436ad.m18871a(this.f14665b.getContentResolver(), str, (String) null);
    }
}
