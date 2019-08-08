package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri.Builder;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.common.p140b.C3404c;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
@C3718cm
/* renamed from: com.google.android.gms.internal.ads.cg */
public final class C3712cg implements C3716ck {

    /* renamed from: a */
    private static final Object f12791a = new Object();

    /* renamed from: b */
    private static C3716ck f12792b;

    /* renamed from: c */
    private static C3716ck f12793c;

    /* renamed from: d */
    private final Object f12794d;

    /* renamed from: e */
    private final Context f12795e;

    /* renamed from: f */
    private final WeakHashMap<Thread, Boolean> f12796f;

    /* renamed from: g */
    private final ExecutorService f12797g;

    /* renamed from: h */
    private final zzang f12798h;

    private C3712cg(Context context) {
        this(context, zzang.m18792a());
    }

    private C3712cg(Context context, zzang zzang) {
        this.f12794d = new Object();
        this.f12796f = new WeakHashMap<>();
        this.f12797g = Executors.newCachedThreadPool();
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        this.f12795e = context;
        this.f12798h = zzang;
    }

    /* renamed from: a */
    private final Builder m16478a(String str, String str2, String str3, int i) {
        boolean z;
        try {
            z = C3404c.m12230a(this.f12795e).mo13392a();
        } catch (Throwable th) {
            C3987mk.m17430b("Error fetching instant app info", th);
            z = false;
        }
        String str4 = "unknown";
        try {
            str4 = this.f12795e.getPackageName();
        } catch (Throwable unused) {
            C3987mk.m17435e("Cannot obtain package name, proceeding.");
        }
        Builder appendQueryParameter = new Builder().scheme("https").path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("is_aia", Boolean.toString(z)).appendQueryParameter(TtmlNode.ATTR_ID, "gmob-apps-report-exception").appendQueryParameter("os", VERSION.RELEASE).appendQueryParameter("api", String.valueOf(VERSION.SDK_INT));
        String str5 = "device";
        String str6 = Build.MANUFACTURER;
        String str7 = Build.MODEL;
        if (!str7.startsWith(str6)) {
            StringBuilder sb = new StringBuilder(1 + String.valueOf(str6).length() + String.valueOf(str7).length());
            sb.append(str6);
            sb.append(" ");
            sb.append(str7);
            str7 = sb.toString();
        }
        return appendQueryParameter.appendQueryParameter(str5, str7).appendQueryParameter("js", this.f12798h.f14505a).appendQueryParameter("appid", str4).appendQueryParameter("exceptiontype", str).appendQueryParameter("stacktrace", str2).appendQueryParameter("eids", TextUtils.join(",", aru.m15023a())).appendQueryParameter("exceptionkey", str3).appendQueryParameter("cl", "193400285").appendQueryParameter("rc", "dev").appendQueryParameter("session_id", aoq.m14617c()).appendQueryParameter("sampling_rate", Integer.toString(i)).appendQueryParameter("pb_tm", String.valueOf(aoq.m14620f().mo14695a(aru.f11970dj)));
    }

    /* renamed from: a */
    public static C3716ck m16479a(Context context) {
        synchronized (f12791a) {
            if (f12792b == null) {
                if (((Boolean) aoq.m14620f().mo14695a(aru.f11828b)).booleanValue()) {
                    f12792b = new C3712cg(context);
                } else {
                    f12792b = new C3717cl();
                }
            }
        }
        return f12792b;
    }

    /* renamed from: a */
    public static C3716ck m16480a(Context context, zzang zzang) {
        synchronized (f12791a) {
            if (f12793c == null) {
                if (((Boolean) aoq.m14620f().mo14695a(aru.f11828b)).booleanValue()) {
                    C3712cg cgVar = new C3712cg(context, zzang);
                    Thread thread = Looper.getMainLooper().getThread();
                    if (thread != null) {
                        synchronized (cgVar.f12794d) {
                            cgVar.f12796f.put(thread, Boolean.valueOf(true));
                        }
                        thread.setUncaughtExceptionHandler(new C3714ci(cgVar, thread.getUncaughtExceptionHandler()));
                    }
                    Thread.setDefaultUncaughtExceptionHandler(new C3713ch(cgVar, Thread.getDefaultUncaughtExceptionHandler()));
                    f12793c = cgVar;
                } else {
                    f12793c = new C3717cl();
                }
            }
        }
        return f12793c;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003f, code lost:
        if (r3 == false) goto L_0x0043;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo15220a(java.lang.Thread r10, java.lang.Throwable r11) {
        /*
            r9 = this;
            r10 = 1
            r0 = 0
            if (r11 == 0) goto L_0x0042
            r1 = r11
            r2 = r0
            r3 = r2
        L_0x0007:
            if (r1 == 0) goto L_0x003d
            java.lang.StackTraceElement[] r4 = r1.getStackTrace()
            int r5 = r4.length
            r6 = r3
            r3 = r2
            r2 = r0
        L_0x0011:
            if (r2 >= r5) goto L_0x0036
            r7 = r4[r2]
            java.lang.String r8 = r7.getClassName()
            boolean r8 = com.google.android.gms.internal.ads.C3975lz.m17383b(r8)
            if (r8 == 0) goto L_0x0020
            r3 = r10
        L_0x0020:
            java.lang.Class r8 = r9.getClass()
            java.lang.String r8 = r8.getName()
            java.lang.String r7 = r7.getClassName()
            boolean r7 = r8.equals(r7)
            if (r7 == 0) goto L_0x0033
            r6 = r10
        L_0x0033:
            int r2 = r2 + 1
            goto L_0x0011
        L_0x0036:
            java.lang.Throwable r1 = r1.getCause()
            r2 = r3
            r3 = r6
            goto L_0x0007
        L_0x003d:
            if (r2 == 0) goto L_0x0042
            if (r3 != 0) goto L_0x0042
            goto L_0x0043
        L_0x0042:
            r10 = r0
        L_0x0043:
            if (r10 == 0) goto L_0x004c
            java.lang.String r10 = ""
            r0 = 1065353216(0x3f800000, float:1.0)
            r9.mo15222a(r11, r10, r0)
        L_0x004c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C3712cg.mo15220a(java.lang.Thread, java.lang.Throwable):void");
    }

    /* renamed from: a */
    public final void mo15221a(Throwable th, String str) {
        mo15222a(th, str, 1.0f);
    }

    /* renamed from: a */
    public final void mo15222a(Throwable th, String str, float f) {
        if (C3975lz.m17374a(th) != null) {
            String name = th.getClass().getName();
            StringWriter stringWriter = new StringWriter();
            C4367ze.m18714a(th, new PrintWriter(stringWriter));
            String stringWriter2 = stringWriter.toString();
            int i = 0;
            int i2 = 1;
            boolean z = Math.random() < ((double) f);
            if (f > 0.0f) {
                i2 = (int) (1.0f / f);
            }
            if (z) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(m16478a(name, stringWriter2, str, i2).toString());
                ArrayList arrayList2 = arrayList;
                int size = arrayList2.size();
                while (i < size) {
                    Object obj = arrayList2.get(i);
                    i++;
                    this.f12797g.submit(new C3715cj(this, new C3988ml(), (String) obj));
                }
            }
        }
    }
}
