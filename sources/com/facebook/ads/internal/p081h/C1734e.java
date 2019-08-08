package com.facebook.ads.internal.p081h;

import android.content.Context;
import android.util.Log;
import com.facebook.ads.internal.p095v.p097b.C1890f;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: com.facebook.ads.internal.h.e */
public class C1734e {

    /* renamed from: a */
    private static final String f5423a = "e";

    /* renamed from: b */
    private static C1734e f5424b;

    /* renamed from: c */
    private final Future<C1890f> f5425c;

    private C1734e(final Context context) {
        this.f5425c = Executors.newSingleThreadExecutor().submit(new Callable<C1890f>() {
            /* renamed from: a */
            public C1890f call() {
                return new C1890f(context);
            }
        });
    }

    /* renamed from: a */
    public static C1734e m7210a(Context context) {
        if (f5424b == null) {
            Context applicationContext = context.getApplicationContext();
            synchronized (C1734e.class) {
                if (f5424b == null) {
                    f5424b = new C1734e(applicationContext);
                }
            }
        }
        return f5424b;
    }

    /* renamed from: a */
    private C1890f m7211a() {
        try {
            return (C1890f) this.f5425c.get(500, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            Log.e(f5423a, "Timed out waiting for cache server.", e);
            return null;
        }
    }

    /* renamed from: a */
    public boolean mo7513a(String str) {
        C1890f a = m7211a();
        return a != null && a.mo7930a(str);
    }

    /* renamed from: b */
    public String mo7514b(String str) {
        C1890f a = m7211a();
        if (a == null) {
            return null;
        }
        return a.mo7931b(str);
    }
}
