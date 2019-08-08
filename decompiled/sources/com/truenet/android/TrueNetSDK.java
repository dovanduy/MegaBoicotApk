package com.truenet.android;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.util.Log;
import com.startapp.common.p194b.C5527a;
import com.startapp.common.p194b.C5537b.C5539a;
import com.startapp.common.p194b.p195a.C5532a;
import com.startapp.common.p194b.p195a.C5533b;
import com.startapp.common.p194b.p195a.C5533b.C5534a;
import com.startapp.common.p194b.p195a.C5533b.C5535b;
import com.startapp.common.p196c.C5544b;
import com.truenet.android.C5585b.C5587b;
import com.truenet.android.p198a.C5572a;
import com.truenet.android.p198a.C5578g;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.p001a.C0075j;
import p000a.p001a.p002a.C0007g;
import p000a.p001a.p003b.p004a.C0022a;
import p000a.p001a.p003b.p004a.C0023b;
import p000a.p001a.p003b.p005b.C0032h;
import p000a.p001a.p003b.p005b.C0033i;
import p000a.p001a.p003b.p005b.C0037m.C0038a;
import p000a.p001a.p003b.p005b.C0039n;
import p000a.p001a.p006c.C0042a;
import p000a.p001a.p007d.C0049c;

public final class TrueNetSDK implements C5532a {
    private static final String BASE_INIT_URL = new String("https://validation-engine.truenet.ai");
    private static final String BASE_RESULT_URL = new String("https://result-api.truenet.ai");
    public static final C5560a Companion = new C5560a(null);
    private static final String INIT_URL;
    private static final int JOB_ID = 97764;
    @NotNull
    public static final String JOB_TAG = "TruenetCheckLinksJob";
    private static final String PREFS_ENABLED = "PrefsEnabled";
    private static final String PREFS_PUBLISHER_ID = "PrefsPublisherId";
    @NotNull
    public static final String PREFS_TAG = "TruenetJobKey";
    private static final String RESULT_URL;
    /* access modifiers changed from: private */
    public static final URL initUrl = new URL(INIT_URL);
    /* access modifiers changed from: private */
    public static int intervalPosition;
    /* access modifiers changed from: private */
    public static final List<Long> intervals = C0007g.m6a((T[]) new Long[]{Long.valueOf(15), Long.valueOf(30), Long.valueOf(60), Long.valueOf(120), Long.valueOf(240), Long.valueOf(480)});
    /* access modifiers changed from: private */
    public static long requestDelay;
    /* access modifiers changed from: private */
    public static final URL resultUrl = new URL(RESULT_URL);
    /* access modifiers changed from: private */
    public static ThreadFactory threadFactory = C5567b.f17659a;
    /* access modifiers changed from: private */
    public static boolean wasInitCalled;

    /* renamed from: com.truenet.android.TrueNetSDK$a */
    public static final class C5560a {

        /* renamed from: com.truenet.android.TrueNetSDK$a$a */
        static final class C5561a extends C0033i implements C0022a<C0075j> {

            /* renamed from: a */
            final /* synthetic */ LinksData f17645a;

            /* renamed from: b */
            final /* synthetic */ ConcurrentLinkedQueue f17646b;

            /* renamed from: c */
            final /* synthetic */ Context f17647c;

            /* renamed from: d */
            final /* synthetic */ C0022a f17648d;

            C5561a(LinksData linksData, ConcurrentLinkedQueue concurrentLinkedQueue, Context context, C0022a aVar) {
                this.f17645a = linksData;
                this.f17646b = concurrentLinkedQueue;
                this.f17647c = context;
                this.f17648d = aVar;
                super(0);
            }

            /* renamed from: a */
            public /* synthetic */ Object mo45a() {
                mo20643b();
                return C0075j.f30a;
            }

            /* renamed from: b */
            public final void mo20643b() {
                if (this.f17645a.getBulkResponse()) {
                    String a = C5544b.m23667a(new ValidationResults(C0007g.m11a((Iterable<? extends T>) this.f17646b)));
                    URL access$getResultUrl$cp = TrueNetSDK.resultUrl;
                    C0032h.m42a((Object) a, "json");
                    C5578g.m23751b(access$getResultUrl$cp, a, this.f17647c);
                }
                TrueNetSDK.Companion.m23706a(this.f17647c, this.f17645a.getSleep());
                if (this.f17645a.getSleep() != 0) {
                    this.f17648d.mo45a();
                }
            }
        }

        /* renamed from: com.truenet.android.TrueNetSDK$a$b */
        static final class C5562b extends C0033i implements C0023b<C5585b, Integer, C0075j> {

            /* renamed from: a */
            final /* synthetic */ LinksData f17649a;

            /* renamed from: b */
            final /* synthetic */ Context f17650b;

            /* renamed from: c */
            final /* synthetic */ ConcurrentLinkedQueue f17651c;

            C5562b(LinksData linksData, Context context, ConcurrentLinkedQueue concurrentLinkedQueue) {
                this.f17649a = linksData;
                this.f17650b = context;
                this.f17651c = concurrentLinkedQueue;
                super(2);
            }

            /* renamed from: a */
            public /* synthetic */ Object mo46a(Object obj, Object obj2) {
                mo20644a((C5585b) obj, ((Number) obj2).intValue());
                return C0075j.f30a;
            }

            /* renamed from: a */
            public final void mo20644a(@NotNull C5585b bVar, int i) {
                C0032h.m45b(bVar, "info");
                Iterable<C5587b> d = bVar.mo20690d();
                Collection arrayList = new ArrayList(C0007g.m9a(d, 10));
                String str = "";
                for (C5587b bVar2 : d) {
                    String f = bVar2.mo20701f();
                    if (f != null) {
                        str = f;
                    }
                    String a = bVar2.mo20695a();
                    long b = bVar2.mo20696b();
                    int c = bVar2.mo20697c();
                    List d2 = bVar2.mo20698d();
                    if (d2 == null) {
                        d2 = C0007g.m5a();
                    }
                    RedirectsResult redirectsResult = new RedirectsResult(a, b, c, d2);
                    arrayList.add(redirectsResult);
                }
                List list = (List) arrayList;
                Link link = (Link) this.f17649a.getValidation().get(i);
                String instanceId = link.getInstanceId();
                int b2 = bVar.mo20688b();
                long c2 = bVar.mo20689c();
                String e = bVar.mo20691e();
                String f2 = bVar.mo20692f();
                String htmlStorage = (f2 == null || !C5578g.m23750a(new URL(link.getHtmlStorage()), f2, this.f17650b)) ? "" : link.getHtmlStorage();
                Bitmap a2 = bVar.mo20687a();
                ValidationResult validationResult = new ValidationResult(instanceId, b2, c2, list, e, htmlStorage, (a2 == null || !C5572a.m23739a(a2, link.getImageStorage())) ? "" : link.getImageStorage(), TrueNetSDK.Companion.m23717c(this.f17650b), str, link.getMetaData());
                if (this.f17649a.getBulkResponse()) {
                    this.f17651c.add(validationResult);
                    return;
                }
                String a3 = C5544b.m23667a(new ValidationResults(C0007g.m3a(validationResult)));
                URL access$getResultUrl$cp = TrueNetSDK.resultUrl;
                C0032h.m42a((Object) a3, "json");
                C5578g.m23751b(access$getResultUrl$cp, a3, this.f17650b);
            }
        }

        /* renamed from: com.truenet.android.TrueNetSDK$a$c */
        static final class C5563c implements Runnable {

            /* renamed from: a */
            final /* synthetic */ Context f17652a;

            /* renamed from: b */
            final /* synthetic */ C0022a f17653b;

            C5563c(Context context, C0022a aVar) {
                this.f17652a = context;
                this.f17653b = aVar;
            }

            public final void run() {
                boolean z = TrueNetSDK.requestDelay != 0;
                Log.d("JobManager", "sending initial request");
                String b = C5578g.m23751b(TrueNetSDK.initUrl, TrueNetSDK.Companion.m23715b(this.f17652a), this.f17652a);
                if (b != null) {
                    TrueNetSDK.Companion.m23708a(this.f17652a, b, this.f17653b);
                    return;
                }
                TrueNetSDK.Companion.m23704a(z ? TrueNetSDK.intervalPosition : 1 + TrueNetSDK.intervalPosition, 0);
                this.f17653b.mo45a();
            }
        }

        /* renamed from: com.truenet.android.TrueNetSDK$a$d */
        static final class C5564d implements Runnable {

            /* renamed from: a */
            final /* synthetic */ long f17654a;

            /* renamed from: b */
            final /* synthetic */ Context f17655b;

            C5564d(long j, Context context) {
                this.f17654a = j;
                this.f17655b = context;
            }

            public final void run() {
                final C0038a aVar = new C0038a();
                aVar.f11a = (String) null;
                if (this.f17654a != 0 || new C0022a<String>(this) {

                    /* renamed from: a */
                    final /* synthetic */ C5564d f17656a;

                    {
                        this.f17656a = r1;
                    }

                    @Nullable
                    /* renamed from: b */
                    public final String mo45a() {
                        aVar.f11a = C5578g.m23751b(TrueNetSDK.initUrl, TrueNetSDK.Companion.m23715b(this.f17656a.f17655b), this.f17656a.f17655b);
                        return (String) aVar.f11a;
                    }
                }.mo45a() == null) {
                    TrueNetSDK.Companion.m23704a(0, this.f17654a);
                    return;
                }
                C5560a aVar2 = TrueNetSDK.Companion;
                Context context = this.f17655b;
                String str = (String) aVar.f11a;
                if (str == null) {
                    C0032h.m41a();
                }
                aVar2.m23708a(context, str, (C0022a<C0075j>) C55662.f17658a);
            }
        }

        private C5560a() {
        }

        public /* synthetic */ C5560a(C0029e eVar) {
            this();
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public final void m23704a(int i, long j) {
            TrueNetSDK.requestDelay = j;
            TrueNetSDK.intervalPosition = C0042a.m60a(i, TrueNetSDK.intervals.size() - 1);
            if (!(j != 0)) {
                j = TimeUnit.MINUTES.toMillis(((Number) TrueNetSDK.intervals.get(TrueNetSDK.intervalPosition)).longValue());
            }
            StringBuilder sb = new StringBuilder();
            sb.append("scheduled millis: ");
            sb.append(String.valueOf(j));
            Log.d("JobManager", sb.toString());
            C5527a.m23601a((int) TrueNetSDK.JOB_ID, false);
            C5527a.m23608a(new C5539a(TrueNetSDK.JOB_ID).mo20518a(j).mo20521a(false).mo20519a(TrueNetSDK.JOB_TAG, TrueNetSDK.PREFS_TAG).mo20523b(true).mo20522a());
        }

        /* renamed from: a */
        private final void m23705a(Context context) {
            C5527a.m23595a(context);
            C5527a.m23603a((C5532a) new TrueNetSDK());
            m23711a(this, context, 0, 2, null);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public final void m23706a(Context context, long j) {
            Executors.newSingleThreadExecutor(TrueNetSDK.threadFactory).execute(new C5564d(j, context));
        }

        /* renamed from: a */
        private final void m23707a(Context context, LinksData linksData, C0022a<C0075j> aVar) {
            Iterable<Link> validation = linksData.getValidation();
            Collection arrayList = new ArrayList(C0007g.m9a(validation, 10));
            for (Link validationUrl : validation) {
                arrayList.add(validationUrl.getValidationUrl());
            }
            C5594c cVar = new C5594c(context, (List) arrayList, TrueNetSDK.threadFactory, linksData.getMaxRedirectTime(), linksData.getNumOfRedirect(), linksData.getValidateParallel());
            ConcurrentLinkedQueue concurrentLinkedQueue = new ConcurrentLinkedQueue();
            cVar.mo20713a((C0022a<C0075j>) new C5561a<C0075j>(linksData, concurrentLinkedQueue, context, aVar));
            cVar.mo20714a((C0023b<? super C5585b, ? super Integer, C0075j>) new C5562b<Object,Object,C0075j>(linksData, context, concurrentLinkedQueue));
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public final void m23708a(Context context, String str, C0022a<C0075j> aVar) {
            TrueNetSDK.intervalPosition = 0;
            TrueNetSDK.requestDelay = 0;
            LinksData linksData = (LinksData) C5544b.m23666a(str, LinksData.class);
            if (linksData.getValidation().size() != 0) {
                C5560a aVar2 = this;
                C0032h.m42a((Object) linksData, "response");
                aVar2.m23707a(context, linksData, aVar);
                return;
            }
            m23706a(context, linksData.getSleep());
            if (linksData.getSleep() != 0) {
                aVar.mo45a();
            }
        }

        /* renamed from: a */
        static /* synthetic */ void m23711a(C5560a aVar, Context context, long j, int i, Object obj) {
            if ((i & 2) != 0) {
                j = 0;
            }
            aVar.m23706a(context, j);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public final void m23714a(Thread thread, Throwable th) {
            StringBuilder sb = new StringBuilder();
            sb.append("Something went wrong in thread: ");
            sb.append(String.valueOf(thread.getId()));
            Log.e("TrueNetSDK", sb.toString(), th);
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public final String m23715b(Context context) {
            DeviceInfo a = new C5571a(context, null, 2, null).mo20682a();
            a.setPublisherId(m23717c(context));
            String a2 = C5544b.m23667a(a);
            C0032h.m42a((Object) a2, "JSONParser.toJson(info)");
            return a2;
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public final String m23717c(Context context) {
            String string = context.getSharedPreferences(TrueNetSDK.PREFS_TAG, 0).getString(TrueNetSDK.PREFS_PUBLISHER_ID, "Undefined");
            return string != null ? string : "Undefined";
        }

        /* renamed from: a */
        public final void mo20640a(@NotNull Context context, @NotNull C0022a<C0075j> aVar) {
            C0032h.m45b(context, "context");
            C0032h.m45b(aVar, "finish");
            try {
                if (!context.getSharedPreferences(TrueNetSDK.PREFS_TAG, 0).getBoolean(TrueNetSDK.PREFS_ENABLED, true)) {
                    C5527a.m23601a((int) TrueNetSDK.JOB_ID, false);
                    aVar.mo45a();
                    return;
                }
                Executors.newSingleThreadExecutor(TrueNetSDK.threadFactory).execute(new C5563c(context, aVar));
            } catch (Throwable th) {
                C5560a aVar2 = this;
                Thread currentThread = Thread.currentThread();
                C0032h.m42a((Object) currentThread, "Thread.currentThread()");
                aVar2.m23714a(currentThread, th);
            }
        }

        /* renamed from: a */
        public final void mo20641a(@NotNull Context context, @NotNull String str) {
            C0032h.m45b(context, "context");
            C0032h.m45b(str, "publisherID");
            try {
                SharedPreferences sharedPreferences = context.getSharedPreferences(TrueNetSDK.PREFS_TAG, 0);
                sharedPreferences.edit().putString(TrueNetSDK.PREFS_PUBLISHER_ID, str).apply();
                if (sharedPreferences.getBoolean(TrueNetSDK.PREFS_ENABLED, true) && !TrueNetSDK.wasInitCalled) {
                    m23705a(context);
                    TrueNetSDK.wasInitCalled = true;
                }
            } catch (Throwable th) {
                C5560a aVar = this;
                Thread currentThread = Thread.currentThread();
                C0032h.m42a((Object) currentThread, "Thread.currentThread()");
                aVar.m23714a(currentThread, th);
            }
        }

        /* renamed from: a */
        public final void mo20642a(@NotNull Context context, boolean z) {
            C0032h.m45b(context, "context");
            try {
                context.getSharedPreferences(TrueNetSDK.PREFS_TAG, 0).edit().putBoolean(TrueNetSDK.PREFS_ENABLED, z).apply();
                if (z && !TrueNetSDK.wasInitCalled) {
                    m23705a(context);
                    TrueNetSDK.wasInitCalled = true;
                }
            } catch (Throwable th) {
                C5560a aVar = this;
                Thread currentThread = Thread.currentThread();
                C0032h.m42a((Object) currentThread, "Thread.currentThread()");
                aVar.m23714a(currentThread, th);
            }
        }
    }

    /* renamed from: com.truenet.android.TrueNetSDK$b */
    static final class C5567b implements ThreadFactory {

        /* renamed from: a */
        public static final C5567b f17659a = new C5567b();

        C5567b() {
        }

        @NotNull
        public final Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setUncaughtExceptionHandler(new C5598d(new C0023b<Thread, Throwable, C0075j>(TrueNetSDK.Companion) {
                /* renamed from: a */
                public final C0049c mo47a() {
                    return C0039n.m50a(C5560a.class);
                }

                /* renamed from: a */
                public /* synthetic */ Object mo46a(Object obj, Object obj2) {
                    mo20650a((Thread) obj, (Throwable) obj2);
                    return C0075j.f30a;
                }

                /* renamed from: a */
                public final void mo20650a(@NotNull Thread thread, @NotNull Throwable th) {
                    C0032h.m45b(thread, "p1");
                    C0032h.m45b(th, "p2");
                    ((C5560a) this.receiver).m23714a(thread, th);
                }

                /* renamed from: b */
                public final String mo48b() {
                    return "uncaughtExceptionHandler";
                }

                /* renamed from: c */
                public final String mo49c() {
                    return "uncaughtExceptionHandler(Ljava/lang/Thread;Ljava/lang/Throwable;)V";
                }
            }));
            return thread;
        }
    }

    /* renamed from: com.truenet.android.TrueNetSDK$c */
    static final class C5569c implements C5533b {

        /* renamed from: a */
        final /* synthetic */ TrueNetSDK f17660a;

        /* renamed from: com.truenet.android.TrueNetSDK$c$a */
        static final class C5570a extends C0033i implements C0022a<C0075j> {

            /* renamed from: a */
            final /* synthetic */ Map f17661a;

            /* renamed from: b */
            final /* synthetic */ Context f17662b;

            /* renamed from: c */
            final /* synthetic */ int f17663c;

            /* renamed from: d */
            final /* synthetic */ C5535b f17664d;

            C5570a(Map map, Context context, int i, C5535b bVar) {
                this.f17661a = map;
                this.f17662b = context;
                this.f17663c = i;
                this.f17664d = bVar;
                super(0);
            }

            /* renamed from: a */
            public /* synthetic */ Object mo45a() {
                mo20651b();
                return C0075j.f30a;
            }

            /* renamed from: b */
            public final void mo20651b() {
                StringBuilder sb = new StringBuilder();
                sb.append("finished ");
                sb.append(String.valueOf(this.f17663c));
                Log.d("JobManager", sb.toString());
                this.f17664d.mo20155a(C5534a.SUCCESS);
            }
        }

        C5569c(TrueNetSDK trueNetSDK) {
            this.f17660a = trueNetSDK;
        }

        /* renamed from: a */
        public final void mo19861a(Context context, int i, Map<String, String> map, C5535b bVar) {
            synchronized (this.f17660a) {
                if (C0032h.m44a((Object) (String) map.get(TrueNetSDK.JOB_TAG), (Object) TrueNetSDK.PREFS_TAG)) {
                    C5560a aVar = TrueNetSDK.Companion;
                    C0032h.m42a((Object) context, "context");
                    aVar.mo20640a(context, (C0022a<C0075j>) new C5570a<C0075j>(map, context, i, bVar));
                }
                C0075j jVar = C0075j.f30a;
            }
        }
    }

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(BASE_INIT_URL);
        sb.append("/api/initial");
        INIT_URL = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(BASE_RESULT_URL);
        sb2.append("/api/result");
        RESULT_URL = sb2.toString();
    }

    public static final void enable(@NotNull Context context, boolean z) {
        Companion.mo20642a(context, z);
    }

    public static final void with(@NotNull Context context, @NotNull String str) {
        Companion.mo20641a(context, str);
    }

    @Nullable
    public C5533b create(int i) {
        if (i != JOB_ID) {
            return null;
        }
        Log.d("JobManager", "addJobCreator");
        return new C5569c(this);
    }
}
