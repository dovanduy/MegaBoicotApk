package com.facebook.ads.internal.p089p;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;
import android.util.Log;
import com.facebook.ads.internal.p091r.C1795a;
import com.facebook.ads.internal.p095v.p096a.C1855a;
import com.facebook.ads.internal.p095v.p096a.C1858b;
import com.facebook.ads.internal.p095v.p096a.C1872p;
import com.facebook.ads.internal.p115w.p120e.C2357d;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.internal.p.a */
public abstract class C1780a {

    /* renamed from: a */
    private static final String f5577a = "a";

    /* renamed from: b */
    private static final AtomicBoolean f5578b = new AtomicBoolean();

    /* renamed from: c */
    private static C1858b f5579c;

    /* renamed from: d */
    private static String f5580d;

    /* renamed from: e */
    private static LinkedHashMap<String, String> f5581e;

    /* renamed from: f */
    private static String f5582f;

    /* renamed from: a */
    public static String m7378a(int i) {
        StringBuilder sb = new StringBuilder(i);
        String str = "bbbbbbbbbb";
        for (int i2 = 0; i2 < i / str.length(); i2++) {
            sb.append(str);
        }
        return sb.toString();
    }

    @SuppressLint({"CatchGeneralException"})
    /* renamed from: a */
    public static void m7379a(Context context, C1858b bVar) {
        if (!f5578b.get() && (context instanceof Application)) {
            f5582f = context.getPackageName();
            f5579c = bVar;
            f5580d = UUID.randomUUID().toString();
            f5578b.compareAndSet(false, true);
        }
    }

    @SuppressLint({"CatchGeneralException"})
    /* renamed from: a */
    public static void m7380a(Context context, String str, String str2) {
        if (f5578b.get() && C1795a.m7467z(context) && Math.random() <= C1795a.m7408B(context)) {
            f5581e = new LinkedHashMap<>();
            f5581e.put(C1781b.ti.toString(), str2);
            f5581e.put(C1781b.bt.toString(), "AN_ANDROID");
            f5581e.put(C1781b.sn.toString(), str);
            f5581e.put(C1781b.ap.toString(), f5582f);
            f5581e.put(C1781b.r1.toString(), f5580d);
            String a = new C1872p().mo7891a((Map<? extends String, ? extends String>) f5581e).mo7892a();
            if (C1795a.m7409C(context) && Math.random() <= C1795a.m7411E(context)) {
                String a2 = m7378a(C1795a.m7410D(context));
                StringBuilder sb = new StringBuilder();
                sb.append(a);
                sb.append("&");
                sb.append(C1781b._p.toString());
                sb.append("=");
                sb.append(a2);
                a = sb.toString();
            }
            C1855a aVar = null;
            try {
                C1855a aVar2 = C2357d.m9115a(context);
                try {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(C1795a.m7407A(context));
                    sb2.append("&");
                    sb2.append(a);
                    String sb3 = sb2.toString();
                    if (sb3 != null && !sb3.isEmpty()) {
                        aVar2.mo7847a(sb3, (C1872p) null, f5579c);
                    }
                    aVar2.mo7854b();
                } catch (Exception e) {
                    e = e;
                    aVar = aVar2;
                    try {
                        Log.e(f5577a, "Bot Detection Network Signal Error", e);
                        aVar.mo7854b();
                    } catch (Throwable th) {
                        th = th;
                        aVar2 = aVar;
                        aVar2.mo7854b();
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    aVar2.mo7854b();
                    throw th;
                }
            } catch (Exception e2) {
                e = e2;
                Log.e(f5577a, "Bot Detection Network Signal Error", e);
                aVar.mo7854b();
            }
        }
    }
}
