package com.google.android.gms.common.stats;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.util.Log;
import com.google.android.gms.common.util.C3552d;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.common.stats.a */
public class C3541a {

    /* renamed from: a */
    private static final Object f10158a = new Object();

    /* renamed from: b */
    private static volatile C3541a f10159b = null;

    /* renamed from: c */
    private static boolean f10160c = false;

    /* renamed from: d */
    private final List<String> f10161d = Collections.EMPTY_LIST;

    /* renamed from: e */
    private final List<String> f10162e = Collections.EMPTY_LIST;

    /* renamed from: f */
    private final List<String> f10163f = Collections.EMPTY_LIST;

    /* renamed from: g */
    private final List<String> f10164g = Collections.EMPTY_LIST;

    /* renamed from: a */
    public static C3541a m12711a() {
        if (f10159b == null) {
            synchronized (f10158a) {
                if (f10159b == null) {
                    f10159b = new C3541a();
                }
            }
        }
        return f10159b;
    }

    private C3541a() {
    }

    /* renamed from: a */
    public final boolean mo13687a(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i) {
        boolean z;
        ComponentName component = intent.getComponent();
        if (component == null) {
            z = false;
        } else {
            z = C3552d.m12730a(context, component.getPackageName());
        }
        if (!z) {
            return context.bindService(intent, serviceConnection, i);
        }
        Log.w("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
        return false;
    }

    /* renamed from: a */
    public boolean mo13686a(Context context, Intent intent, ServiceConnection serviceConnection, int i) {
        return mo13687a(context, context.getClass().getName(), intent, serviceConnection, i);
    }

    @SuppressLint({"UntrackedBindService"})
    /* renamed from: a */
    public void mo13685a(Context context, ServiceConnection serviceConnection) {
        context.unbindService(serviceConnection);
    }
}
