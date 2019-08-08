package com.google.android.gms.p137b;

import android.content.Context;
import android.os.IBinder;
import com.google.android.gms.common.C3415h;
import com.google.android.gms.common.internal.C3513t;

/* renamed from: com.google.android.gms.b.c */
public abstract class C3239c<T> {

    /* renamed from: a */
    private final String f9429a;

    /* renamed from: b */
    private T f9430b;

    /* renamed from: com.google.android.gms.b.c$a */
    public static class C3240a extends Exception {
        public C3240a(String str) {
            super(str);
        }

        public C3240a(String str, Throwable th) {
            super(str, th);
        }
    }

    protected C3239c(String str) {
        this.f9429a = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract T mo13040b(IBinder iBinder);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final T mo13039a(Context context) throws C3240a {
        if (this.f9430b == null) {
            C3513t.m12625a(context);
            Context e = C3415h.m12287e(context);
            if (e == null) {
                throw new C3240a("Could not get remote context.");
            }
            try {
                this.f9430b = mo13040b((IBinder) e.getClassLoader().loadClass(this.f9429a).newInstance());
            } catch (ClassNotFoundException e2) {
                throw new C3240a("Could not load creator class.", e2);
            } catch (InstantiationException e3) {
                throw new C3240a("Could not instantiate creator.", e3);
            } catch (IllegalAccessException e4) {
                throw new C3240a("Could not access creator.", e4);
            }
        }
        return this.f9430b;
    }
}
