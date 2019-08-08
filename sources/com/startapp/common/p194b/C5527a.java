package com.startapp.common.p194b;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobInfo.Builder;
import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.pm.ServiceInfo;
import android.os.Build.VERSION;
import android.os.PersistableBundle;
import android.os.SystemClock;
import com.startapp.android.publish.common.metaData.InfoEventService;
import com.startapp.android.publish.common.metaData.PeriodicJobService;
import com.startapp.common.p194b.C5537b.C5539a;
import com.startapp.common.p194b.p195a.C5532a;
import com.startapp.common.p194b.p195a.C5533b;
import com.startapp.common.p194b.p195a.C5533b.C5534a;
import com.startapp.common.p194b.p195a.C5533b.C5535b;
import com.startapp.common.p194b.p195a.C5536c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.startapp.common.b.a */
/* compiled from: StartAppSDK */
public class C5527a {
    /* access modifiers changed from: private */
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: a */
    public static volatile C5527a f17587a = null;

    /* renamed from: b */
    private static volatile C5536c f17588b = null;

    /* renamed from: c */
    private static volatile Integer f17589c = null;

    /* renamed from: d */
    private static volatile int f17590d = 60000;

    /* renamed from: j */
    private static final ExecutorService f17591j = Executors.newSingleThreadExecutor();

    /* renamed from: k */
    private static final ScheduledExecutorService f17592k = Executors.newScheduledThreadPool(1);
    /* access modifiers changed from: private */

    /* renamed from: e */
    public Context f17593e;

    /* renamed from: f */
    private List<C5532a> f17594f = Collections.synchronizedList(new ArrayList());
    /* access modifiers changed from: private */

    /* renamed from: g */
    public Map<Integer, Integer> f17595g = new ConcurrentHashMap();

    /* renamed from: h */
    private AtomicInteger f17596h = new AtomicInteger(0);

    /* renamed from: i */
    private boolean f17597i;

    /* renamed from: b */
    private static int m23610b(int i) {
        return i & Integer.MAX_VALUE;
    }

    /* renamed from: b */
    private static int m23611b(int i, boolean z) {
        return z ? i | Integer.MIN_VALUE : i;
    }

    private C5527a(Context context) {
        this.f17593e = context.getApplicationContext();
        this.f17597i = m23620d(context);
    }

    /* renamed from: a */
    public static C5527a m23595a(Context context) {
        if (f17587a == null) {
            synchronized (C5527a.class) {
                if (f17587a == null) {
                    if (context.getApplicationContext() != null) {
                        context = context.getApplicationContext();
                    }
                    f17587a = new C5527a(context);
                    try {
                        SharedPreferences sharedPreferences = context.getSharedPreferences("RunnerManager", 0);
                        String str = null;
                        String string = sharedPreferences.getString("RegisteredClassesNames", null);
                        if (string != null) {
                            String[] split = string.split(",");
                            StringBuilder sb = new StringBuilder(string.length());
                            for (String str2 : split) {
                                String str3 = "RunnerManager";
                                try {
                                    StringBuilder sb2 = new StringBuilder();
                                    sb2.append("create CLS: ");
                                    sb2.append(str2);
                                    m23599a(3, str3, sb2.toString());
                                    Class cls = Class.forName(str2);
                                    if (C5532a.class.isAssignableFrom(cls)) {
                                        f17587a.f17594f.add((C5532a) cls.newInstance());
                                        if (sb.length() > 0) {
                                            sb.append(',');
                                        }
                                        sb.append(str2);
                                    }
                                } catch (ClassNotFoundException unused) {
                                } catch (Throwable th) {
                                    String str4 = "RunnerManager";
                                    StringBuilder sb3 = new StringBuilder();
                                    sb3.append("create :");
                                    sb3.append(str2);
                                    m23600a(6, str4, sb3.toString(), th);
                                }
                            }
                            if (!sb.toString().equals(string)) {
                                Editor edit = sharedPreferences.edit();
                                String str5 = "RegisteredClassesNames";
                                if (sb.length() > 0) {
                                    str = sb.toString();
                                }
                                edit.putString(str5, str).commit();
                            }
                        }
                    } catch (Exception e) {
                        m23600a(6, "RunnerManager", "create", (Throwable) e);
                    }
                }
            }
        }
        return f17587a;
    }

    /* renamed from: a */
    public static void m23603a(C5532a aVar) {
        f17587a.f17594f.add(aVar);
        String name = aVar.getClass().getName();
        SharedPreferences sharedPreferences = f17587a.f17593e.getSharedPreferences("RunnerManager", 0);
        String string = sharedPreferences.getString("RegisteredClassesNames", null);
        if (string == null) {
            sharedPreferences.edit().putString("RegisteredClassesNames", name).commit();
        } else if (!string.contains(name)) {
            StringBuilder sb = new StringBuilder();
            sb.append(string);
            sb.append(",");
            sb.append(name);
            sharedPreferences.edit().putString("RegisteredClassesNames", sb.toString()).commit();
        }
    }

    /* renamed from: a */
    public static void m23604a(C5536c cVar) {
        f17588b = cVar;
    }

    /* renamed from: a */
    public static boolean m23608a(C5537b bVar) {
        try {
            int b = m23611b(bVar.mo20511a(), bVar.mo20515e());
            StringBuilder sb = new StringBuilder();
            sb.append("schedule ");
            sb.append(b);
            sb.append(" ");
            sb.append(bVar);
            m23599a(3, "RunnerManager", sb.toString());
            if (!m23618c()) {
                return m23619c(b, bVar);
            }
            if (m23614b()) {
                return m23605a(b, bVar);
            }
            return m23615b(b, bVar);
        } catch (Exception e) {
            m23600a(6, "RunnerManager", "schedule error", (Throwable) e);
            return false;
        }
    }

    @TargetApi(21)
    /* renamed from: a */
    private static boolean m23605a(int i, C5537b bVar) {
        JobScheduler c = m23617c(f17587a.f17593e);
        if (c == null) {
            return false;
        }
        PersistableBundle persistableBundle = new PersistableBundle();
        Map b = bVar.mo20512b();
        for (String str : b.keySet()) {
            persistableBundle.putString(str, (String) b.get(str));
        }
        persistableBundle.putInt("__RUNNER_RECURRING_ID__", bVar.mo20515e() ? 1 : 0);
        persistableBundle.putLong("__RUNNER_TRIGGER_ID__", bVar.mo20513c());
        Builder builder = new Builder(i, new ComponentName(f17587a.f17593e, PeriodicJobService.class));
        builder.setExtras(persistableBundle);
        if (bVar.mo20515e()) {
            builder.setPeriodic(bVar.mo20513c());
        } else {
            builder.setMinimumLatency(bVar.mo20513c()).setOverrideDeadline(bVar.mo20513c() + ((long) f17590d));
        }
        builder.setRequiredNetworkType(bVar.mo20516f() ? 1 : 0);
        int schedule = c.schedule(builder.build());
        StringBuilder sb = new StringBuilder();
        sb.append("jobScheduler.schedule ");
        sb.append(schedule);
        m23599a(3, "RunnerManager", sb.toString());
        boolean z = true;
        if (schedule != 1) {
            z = false;
        }
        return z;
    }

    /* renamed from: b */
    private static boolean m23615b(int i, C5537b bVar) {
        AlarmManager b = m23612b(f17587a.f17593e);
        if (b == null) {
            return false;
        }
        Intent intent = new Intent(f17587a.f17593e, InfoEventService.class);
        Map b2 = bVar.mo20512b();
        for (String str : b2.keySet()) {
            intent.putExtra(str, (String) b2.get(str));
        }
        intent.putExtra("__RUNNER_TASK_ID__", i);
        intent.putExtra("__RUNNER_RECURRING_ID__", bVar.mo20515e());
        intent.putExtra("__RUNNER_TRIGGER_ID__", bVar.mo20513c());
        PendingIntent service = PendingIntent.getService(f17587a.f17593e, i, intent, 134217728);
        b.cancel(service);
        if (bVar.mo20515e()) {
            b.setRepeating(0, System.currentTimeMillis() + bVar.mo20514d(), bVar.mo20513c(), service);
        } else {
            b.set(3, SystemClock.elapsedRealtime() + bVar.mo20513c(), service);
        }
        return true;
    }

    /* renamed from: c */
    private static boolean m23619c(final int i, final C5537b bVar) {
        final int incrementAndGet = f17587a.f17596h.incrementAndGet();
        C55281 r2 = new Runnable() {
            public void run() {
                Integer num = (Integer) C5527a.f17587a.f17595g.get(Integer.valueOf(i));
                if (num != null && num.intValue() == incrementAndGet) {
                    if (!bVar.mo20515e()) {
                        C5527a.f17587a.f17595g.remove(Integer.valueOf(i));
                    }
                    C5527a.m23616b(bVar, (C5535b) new C5535b() {
                        /* renamed from: a */
                        public void mo20155a(C5534a aVar) {
                        }
                    });
                }
            }
        };
        if (bVar.mo20515e()) {
            f17592k.scheduleAtFixedRate(r2, bVar.mo20514d(), bVar.mo20514d(), TimeUnit.MILLISECONDS);
        } else {
            f17592k.schedule(r2, bVar.mo20513c(), TimeUnit.MILLISECONDS);
        }
        f17587a.f17595g.put(Integer.valueOf(i), Integer.valueOf(incrementAndGet));
        return true;
    }

    @SuppressLint({"NewApi"})
    /* renamed from: a */
    public static void m23601a(int i, boolean z) {
        int i2;
        Throwable e;
        StringBuilder sb = new StringBuilder();
        sb.append("cancelAlarm ");
        sb.append(i);
        m23599a(3, "RunnerManager", sb.toString());
        try {
            i2 = m23611b(i, z);
            try {
                if (!f17587a.f17597i) {
                    f17587a.f17595g.remove(Integer.valueOf(i2));
                } else if (m23614b()) {
                    JobScheduler c = m23617c(f17587a.f17593e);
                    if (c != null) {
                        c.cancel(i2);
                    }
                } else {
                    AlarmManager b = m23612b(f17587a.f17593e);
                    if (b != null) {
                        m23602a(f17587a.f17593e, new Intent(f17587a.f17593e, InfoEventService.class), b, i2);
                    }
                }
            } catch (Exception e2) {
                e = e2;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("cancelAlarm ");
                sb2.append(i2);
                m23600a(6, "RunnerManager", sb2.toString(), e);
            }
        } catch (Exception e3) {
            Throwable th = e3;
            i2 = i;
            e = th;
            StringBuilder sb22 = new StringBuilder();
            sb22.append("cancelAlarm ");
            sb22.append(i2);
            m23600a(6, "RunnerManager", sb22.toString(), e);
        }
    }

    /* renamed from: a */
    public static void m23599a(int i, String str, String str2) {
        m23600a(i, str, str2, (Throwable) null);
    }

    /* renamed from: a */
    public static void m23600a(int i, String str, String str2, Throwable th) {
        if (f17588b != null) {
            f17588b.mo19618a(i, str, str2, th);
        }
    }

    /* renamed from: a */
    public static boolean m23607a(Intent intent, C5535b bVar) {
        String str = "RunnerManager";
        StringBuilder sb = new StringBuilder();
        sb.append("runJob ");
        sb.append(intent != 0 ? intent : "NULL");
        m23599a(3, str, sb.toString());
        return intent != 0 && m23616b(m23597a(intent), bVar);
    }

    @TargetApi(21)
    /* renamed from: a */
    public static boolean m23606a(JobParameters jobParameters, C5535b bVar) {
        StringBuilder sb = new StringBuilder();
        sb.append("runJob ");
        sb.append(jobParameters);
        m23599a(3, "RunnerManager", sb.toString());
        return m23616b(m23596a(jobParameters), bVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static boolean m23616b(final C5537b bVar, final C5535b bVar2) {
        StringBuilder sb = new StringBuilder();
        sb.append("RunnerJob ");
        sb.append(bVar.mo20511a());
        sb.append(" ");
        sb.append(m23610b(bVar.mo20511a()));
        m23599a(3, "RunnerManager", sb.toString());
        final int b = m23610b(bVar.mo20511a());
        final C5533b a = m23593a(b);
        if (a != null) {
            f17591j.execute(new Runnable() {
                public void run() {
                    a.mo19861a(C5527a.f17587a.f17593e, b, bVar.mo20512b(), new C5535b() {
                        /* renamed from: a */
                        public void mo20155a(C5534a aVar) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("job.execute ");
                            sb.append(bVar.mo20511a());
                            sb.append(" ");
                            sb.append(aVar);
                            C5527a.m23599a(3, "RunnerManager", sb.toString());
                            if (aVar == C5534a.RESCHEDULE && !bVar.mo20515e()) {
                                C5527a.m23608a(bVar);
                            }
                            bVar2.mo20155a(aVar);
                        }
                    });
                }
            });
            return true;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("runJob: failed to get job for ID ");
        sb2.append(bVar.mo20511a());
        m23599a(5, "RunnerManager", sb2.toString());
        bVar2.mo20155a(C5534a.FAILED);
        return false;
    }

    /* renamed from: a */
    private static C5533b m23593a(int i) {
        C5533b bVar = null;
        for (C5532a create : f17587a.f17594f) {
            bVar = create.create(i);
            if (bVar != null) {
                break;
            }
        }
        return bVar;
    }

    /* renamed from: a */
    private static void m23602a(Context context, Intent intent, AlarmManager alarmManager, int i) {
        PendingIntent service = PendingIntent.getService(context, i, intent, 134217728);
        if (PendingIntent.getService(context, 0, intent, 268435456) != null) {
            alarmManager.cancel(service);
            service.cancel();
        }
    }

    /* renamed from: a */
    private static C5537b m23597a(Intent intent) {
        HashMap hashMap;
        int intExtra = intent.getIntExtra("__RUNNER_TASK_ID__", -1);
        boolean booleanExtra = intent.getBooleanExtra("__RUNNER_RECURRING_ID__", false);
        long longExtra = intent.getLongExtra("__RUNNER_TRIGGER_ID__", 0);
        if (intent.getExtras() != null) {
            hashMap = new HashMap(intent.getExtras().keySet().size());
            for (String str : intent.getExtras().keySet()) {
                Object obj = intent.getExtras().get(str);
                if (obj instanceof String) {
                    hashMap.put(str, (String) obj);
                }
            }
        } else {
            hashMap = null;
        }
        return new C5539a(intExtra).mo20520a((Map<String, String>) hashMap).mo20521a(booleanExtra).mo20518a(longExtra).mo20522a();
    }

    @TargetApi(21)
    /* renamed from: a */
    private static C5537b m23596a(JobParameters jobParameters) {
        PersistableBundle extras = jobParameters.getExtras();
        boolean z = true;
        if (extras.getInt("__RUNNER_RECURRING_ID__") != 1) {
            z = false;
        }
        long j = extras.getLong("__RUNNER_TRIGGER_ID__", 0);
        HashMap hashMap = new HashMap(extras.keySet().size());
        for (String str : extras.keySet()) {
            Object obj = extras.get(str);
            if (obj instanceof String) {
                hashMap.put(str, (String) obj);
            }
        }
        return new C5539a(jobParameters.getJobId()).mo20520a((Map<String, String>) hashMap).mo20521a(z).mo20518a(j).mo20522a();
    }

    /* renamed from: b */
    private static AlarmManager m23612b(Context context) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        if (alarmManager == null) {
            m23599a(6, "RunnerManager", "failed to get AlarmManager");
        }
        return alarmManager;
    }

    @TargetApi(21)
    /* renamed from: c */
    private static JobScheduler m23617c(Context context) {
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        if (jobScheduler == null) {
            m23599a(6, "RunnerManager", "failed to get JobScheduler");
        }
        return jobScheduler;
    }

    /* renamed from: b */
    private static boolean m23614b() {
        int i = VERSION.SDK_INT;
        if (f17589c != null) {
            i = f17589c.intValue();
        }
        return i >= 21;
    }

    /* renamed from: d */
    private boolean m23620d(Context context) {
        try {
            for (ServiceInfo serviceInfo : context.getPackageManager().getPackageInfo(context.getPackageName(), 4).services) {
                if (serviceInfo.name.equals(InfoEventService.class.getName())) {
                    return true;
                }
            }
        } catch (Throwable th) {
            m23600a(6, "RunnerManager", "servicesDefined", th);
        }
        return false;
    }

    /* renamed from: c */
    private static boolean m23618c() {
        return f17587a.f17597i;
    }
}
