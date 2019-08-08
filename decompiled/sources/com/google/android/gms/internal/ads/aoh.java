package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.widget.FrameLayout;
import com.appnext.base.p046b.C1245d;
import javax.annotation.concurrent.GuardedBy;

@C3718cm
public class aoh {
    @GuardedBy("mLock")

    /* renamed from: a */
    private apt f11600a;

    /* renamed from: b */
    private final Object f11601b = new Object();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final aoa f11602c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final anz f11603d;

    /* renamed from: e */
    private final aqs f11604e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final awh f11605f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C3826gl f11606g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final C4084q f11607h;

    /* renamed from: i */
    private final awi f11608i;

    /* renamed from: com.google.android.gms.internal.ads.aoh$a */
    abstract class C3664a<T> {
        C3664a() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract T mo14549a() throws RemoteException;

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract T mo14550a(apt apt) throws RemoteException;

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public final T mo14551b() {
            apt a = aoh.this.m14589b();
            if (a == null) {
                C3987mk.m17435e("ClientApi class cannot be loaded.");
                return null;
            }
            try {
                return mo14550a(a);
            } catch (RemoteException e) {
                C3987mk.m17432c("Cannot invoke local loader using ClientApi class", e);
                return null;
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public final T mo14552c() {
            try {
                return mo14549a();
            } catch (RemoteException e) {
                C3987mk.m17432c("Cannot invoke remote loader", e);
                return null;
            }
        }
    }

    public aoh(aoa aoa, anz anz, aqs aqs, awh awh, C3826gl glVar, C4084q qVar, awi awi) {
        this.f11602c = aoa;
        this.f11603d = anz;
        this.f11604e = aqs;
        this.f11605f = awh;
        this.f11606g = glVar;
        this.f11607h = qVar;
        this.f11608i = awi;
    }

    /* renamed from: a */
    private static apt m14583a() {
        try {
            Object newInstance = aoh.class.getClassLoader().loadClass("com.google.android.gms.ads.internal.ClientApi").newInstance();
            if (newInstance instanceof IBinder) {
                return apu.asInterface((IBinder) newInstance);
            }
            C3987mk.m17435e("ClientApi class is not an instance of IBinder");
            return null;
        } catch (Exception e) {
            C3987mk.m17432c("Failed to instantiate ClientApi class.", e);
            return null;
        }
    }

    /* renamed from: a */
    static <T> T m14585a(Context context, boolean z, C3664a<T> aVar) {
        T t;
        if (!z) {
            aoq.m14615a();
            if (!C3975lz.m17385c(context)) {
                C3987mk.m17429b("Google Play Services is not available");
                z = true;
            }
        }
        aoq.m14615a();
        int e = C3975lz.m17387e(context);
        aoq.m14615a();
        if (e > C3975lz.m17386d(context)) {
            z = true;
        }
        aru.m15024a(context);
        if (((Boolean) aoq.m14620f().mo14695a(aru.f11965de)).booleanValue()) {
            z = false;
        }
        if (z) {
            t = aVar.mo14551b();
            if (t == null) {
                return aVar.mo14552c();
            }
        } else {
            t = aVar.mo14552c();
            if (t == null) {
                t = aVar.mo14551b();
            }
        }
        return t;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static void m14586a(Context context, String str) {
        Bundle bundle = new Bundle();
        bundle.putString(C1245d.f3959jb, "no_ads_fallback");
        bundle.putString("flow", str);
        aoq.m14615a().mo15622a(context, (String) null, "gmob-apps", bundle, true);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final apt m14589b() {
        apt apt;
        synchronized (this.f11601b) {
            if (this.f11600a == null) {
                this.f11600a = m14583a();
            }
            apt = this.f11600a;
        }
        return apt;
    }

    /* renamed from: a */
    public final apc mo14546a(Context context, String str, bca bca) {
        return (apc) m14585a(context, false, (C3664a<T>) new aol<T>(this, context, str, bca));
    }

    /* renamed from: a */
    public final aum mo14547a(Context context, FrameLayout frameLayout, FrameLayout frameLayout2) {
        return (aum) m14585a(context, false, (C3664a<T>) new aom<T>(this, frameLayout, frameLayout2, context));
    }

    /* renamed from: a */
    public final C4111r mo14548a(Activity activity) {
        String str = "com.google.android.gms.ads.internal.overlay.useClientJar";
        Intent intent = activity.getIntent();
        boolean z = false;
        if (!intent.hasExtra(str)) {
            C3987mk.m17431c("useClientJar flag not found in activity intent extras.");
        } else {
            z = intent.getBooleanExtra(str, false);
        }
        return (C4111r) m14585a((Context) activity, z, (C3664a<T>) new aop<T>(this, activity));
    }
}
