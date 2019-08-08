package com.google.android.gms.p138c;

import android.content.Context;
import android.content.res.Resources.NotFoundException;
import android.util.Log;
import com.google.android.gms.common.C3407d;
import com.google.android.gms.common.C3412e;
import com.google.android.gms.common.C3413f;
import com.google.android.gms.common.C3415h;
import com.google.android.gms.common.internal.C3513t;
import com.google.android.gms.common.util.C3555g;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.DynamiteModule.C3606a;
import java.lang.reflect.Method;

/* renamed from: com.google.android.gms.c.a */
public class C3241a {

    /* renamed from: a */
    private static final C3407d f9431a = C3407d.m12253b();

    /* renamed from: b */
    private static final Object f9432b = new Object();

    /* renamed from: c */
    private static Method f9433c;

    /* renamed from: a */
    public static void m11577a(Context context) throws C3413f, C3412e {
        C3513t.m12626a(context, (Object) "Context must not be null");
        f9431a.mo13417c(context, 11925000);
        Context b = m11578b(context);
        if (b == null) {
            b = m11579c(context);
        }
        if (b == null) {
            Log.e("ProviderInstaller", "Failed to get remote context");
            throw new C3412e(8);
        }
        synchronized (f9432b) {
            try {
                if (f9433c == null) {
                    f9433c = b.getClassLoader().loadClass("com.google.android.gms.common.security.ProviderInstallerImpl").getMethod("insertProvider", new Class[]{Context.class});
                }
                f9433c.invoke(null, new Object[]{b});
            } catch (Exception e) {
                Throwable cause = e.getCause();
                if (Log.isLoggable("ProviderInstaller", 6)) {
                    String str = "ProviderInstaller";
                    String str2 = "Failed to install provider: ";
                    String valueOf = String.valueOf(cause == 0 ? e.getMessage() : cause.getMessage());
                    Log.e(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
                }
                C3555g.m12743a(context, cause == 0 ? e : cause);
                throw new C3412e(8);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: b */
    private static Context m11578b(Context context) {
        try {
            return DynamiteModule.m12874a(context, DynamiteModule.f10252d, "providerinstaller").mo13743a();
        } catch (C3606a e) {
            String str = "ProviderInstaller";
            String str2 = "Failed to load providerinstaller module: ";
            String valueOf = String.valueOf(e.getMessage());
            Log.w(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
            return null;
        }
    }

    /* renamed from: c */
    private static Context m11579c(Context context) {
        try {
            return C3415h.m12287e(context);
        } catch (NotFoundException e) {
            String str = "ProviderInstaller";
            String str2 = "Failed to load GMS Core context for providerinstaller: ";
            String valueOf = String.valueOf(e.getMessage());
            Log.w(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
            C3555g.m12743a(context, e);
            return null;
        }
    }
}
