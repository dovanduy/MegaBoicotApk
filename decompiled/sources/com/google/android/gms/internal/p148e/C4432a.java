package com.google.android.gms.internal.p148e;

import android.annotation.TargetApi;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.UserHandle;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@TargetApi(24)
/* renamed from: com.google.android.gms.internal.e.a */
public final class C4432a {

    /* renamed from: b */
    private static final Method f14625b = m18860b();

    /* renamed from: c */
    private static final Method f14626c = m18861c();

    /* renamed from: d */
    private static volatile C4486c f14627d = C4459b.f14690a;

    /* renamed from: a */
    private final JobScheduler f14628a;

    /* renamed from: a */
    static final /* synthetic */ boolean m18859a() {
        return false;
    }

    /* renamed from: b */
    private static Method m18860b() {
        if (VERSION.SDK_INT >= 24) {
            try {
                return JobScheduler.class.getDeclaredMethod("scheduleAsPackage", new Class[]{JobInfo.class, String.class, Integer.TYPE, String.class});
            } catch (NoSuchMethodException unused) {
                if (Log.isLoggable("JobSchedulerCompat", 6)) {
                    Log.e("JobSchedulerCompat", "No scheduleAsPackage method available, falling back to schedule");
                }
            }
        }
        return null;
    }

    /* renamed from: c */
    private static Method m18861c() {
        if (VERSION.SDK_INT >= 24) {
            try {
                return UserHandle.class.getDeclaredMethod("myUserId", null);
            } catch (NoSuchMethodException unused) {
                if (Log.isLoggable("JobSchedulerCompat", 6)) {
                    Log.e("JobSchedulerCompat", "No myUserId method available");
                }
            }
        }
        return null;
    }

    /* renamed from: d */
    private static int m18862d() {
        if (f14626c != null) {
            try {
                return ((Integer) f14626c.invoke(null, new Object[0])).intValue();
            } catch (IllegalAccessException | InvocationTargetException e) {
                if (Log.isLoggable("JobSchedulerCompat", 6)) {
                    Log.e("JobSchedulerCompat", "myUserId invocation illegal", e);
                }
            }
        }
        return 0;
    }

    private C4432a(JobScheduler jobScheduler) {
        this.f14628a = jobScheduler;
    }

    /* renamed from: a */
    private final int m18857a(JobInfo jobInfo, String str, int i, String str2) {
        if (f14625b != null) {
            try {
                return ((Integer) f14625b.invoke(this.f14628a, new Object[]{jobInfo, str, Integer.valueOf(i), str2})).intValue();
            } catch (IllegalAccessException | InvocationTargetException e) {
                Log.e(str2, "error calling scheduleAsPackage", e);
            }
        }
        return this.f14628a.schedule(jobInfo);
    }

    /* renamed from: a */
    public static int m18858a(Context context, JobInfo jobInfo, String str, String str2) {
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        if (f14625b == null || !f14627d.mo16358a() || context.checkSelfPermission("android.permission.UPDATE_DEVICE_STATS") != 0) {
            return jobScheduler.schedule(jobInfo);
        }
        return new C4432a(jobScheduler).m18857a(jobInfo, str, m18862d(), str2);
    }
}
