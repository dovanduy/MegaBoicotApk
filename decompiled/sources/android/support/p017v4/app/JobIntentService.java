package android.support.p017v4.app;

import android.app.Service;
import android.app.job.JobInfo;
import android.app.job.JobInfo.Builder;
import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.app.job.JobServiceEngine;
import android.app.job.JobWorkItem;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Build.VERSION;
import android.os.IBinder;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import com.google.android.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: android.support.v4.app.JobIntentService */
public abstract class JobIntentService extends Service {
    static final boolean DEBUG = false;
    static final String TAG = "JobIntentService";
    static final HashMap<ComponentName, C0232h> sClassWorkEnqueuer = new HashMap<>();
    static final Object sLock = new Object();
    final ArrayList<C0227d> mCompatQueue;
    C0232h mCompatWorkEnqueuer;
    C0224a mCurProcessor;
    boolean mDestroyed = false;
    boolean mInterruptIfStopped = false;
    C0225b mJobImpl;
    boolean mStopped = false;

    /* renamed from: android.support.v4.app.JobIntentService$a */
    final class C0224a extends AsyncTask<Void, Void, Void> {
        C0224a() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Void doInBackground(Void... voidArr) {
            while (true) {
                C0228e dequeueWork = JobIntentService.this.dequeueWork();
                if (dequeueWork == null) {
                    return null;
                }
                JobIntentService.this.onHandleWork(dequeueWork.mo759a());
                dequeueWork.mo760b();
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void onCancelled(Void voidR) {
            JobIntentService.this.processorFinished();
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void onPostExecute(Void voidR) {
            JobIntentService.this.processorFinished();
        }
    }

    /* renamed from: android.support.v4.app.JobIntentService$b */
    interface C0225b {
        /* renamed from: a */
        IBinder mo753a();

        /* renamed from: b */
        C0228e mo754b();
    }

    /* renamed from: android.support.v4.app.JobIntentService$c */
    static final class C0226c extends C0232h {

        /* renamed from: a */
        boolean f445a;

        /* renamed from: b */
        boolean f446b;

        /* renamed from: f */
        private final Context f447f;

        /* renamed from: g */
        private final WakeLock f448g;

        /* renamed from: h */
        private final WakeLock f449h;

        C0226c(Context context, ComponentName componentName) {
            super(context, componentName);
            this.f447f = context.getApplicationContext();
            PowerManager powerManager = (PowerManager) context.getSystemService("power");
            StringBuilder sb = new StringBuilder();
            sb.append(componentName.getClassName());
            sb.append(":launch");
            this.f448g = powerManager.newWakeLock(1, sb.toString());
            this.f448g.setReferenceCounted(false);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(componentName.getClassName());
            sb2.append(":run");
            this.f449h = powerManager.newWakeLock(1, sb2.toString());
            this.f449h.setReferenceCounted(false);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo756a(Intent intent) {
            Intent intent2 = new Intent(intent);
            intent2.setComponent(this.f460c);
            if (this.f447f.startService(intent2) != null) {
                synchronized (this) {
                    if (!this.f445a) {
                        this.f445a = true;
                        if (!this.f446b) {
                            this.f448g.acquire(ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS);
                        }
                    }
                }
            }
        }

        /* renamed from: a */
        public void mo755a() {
            synchronized (this) {
                this.f445a = false;
            }
        }

        /* renamed from: b */
        public void mo757b() {
            synchronized (this) {
                if (!this.f446b) {
                    this.f446b = true;
                    this.f449h.acquire(600000);
                    this.f448g.release();
                }
            }
        }

        /* renamed from: c */
        public void mo758c() {
            synchronized (this) {
                if (this.f446b) {
                    if (this.f445a) {
                        this.f448g.acquire(ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS);
                    }
                    this.f446b = false;
                    this.f449h.release();
                }
            }
        }
    }

    /* renamed from: android.support.v4.app.JobIntentService$d */
    final class C0227d implements C0228e {

        /* renamed from: a */
        final Intent f450a;

        /* renamed from: b */
        final int f451b;

        C0227d(Intent intent, int i) {
            this.f450a = intent;
            this.f451b = i;
        }

        /* renamed from: a */
        public Intent mo759a() {
            return this.f450a;
        }

        /* renamed from: b */
        public void mo760b() {
            JobIntentService.this.stopSelf(this.f451b);
        }
    }

    /* renamed from: android.support.v4.app.JobIntentService$e */
    interface C0228e {
        /* renamed from: a */
        Intent mo759a();

        /* renamed from: b */
        void mo760b();
    }

    /* renamed from: android.support.v4.app.JobIntentService$f */
    static final class C0229f extends JobServiceEngine implements C0225b {

        /* renamed from: a */
        final JobIntentService f453a;

        /* renamed from: b */
        final Object f454b = new Object();

        /* renamed from: c */
        JobParameters f455c;

        /* renamed from: android.support.v4.app.JobIntentService$f$a */
        final class C0230a implements C0228e {

            /* renamed from: a */
            final JobWorkItem f456a;

            C0230a(JobWorkItem jobWorkItem) {
                this.f456a = jobWorkItem;
            }

            /* renamed from: a */
            public Intent mo759a() {
                return this.f456a.getIntent();
            }

            /* renamed from: b */
            public void mo760b() {
                synchronized (C0229f.this.f454b) {
                    if (C0229f.this.f455c != null) {
                        C0229f.this.f455c.completeWork(this.f456a);
                    }
                }
            }
        }

        C0229f(JobIntentService jobIntentService) {
            super(jobIntentService);
            this.f453a = jobIntentService;
        }

        /* renamed from: a */
        public IBinder mo753a() {
            return getBinder();
        }

        public boolean onStartJob(JobParameters jobParameters) {
            this.f455c = jobParameters;
            this.f453a.ensureProcessorRunningLocked(false);
            return true;
        }

        public boolean onStopJob(JobParameters jobParameters) {
            boolean doStopCurrentWork = this.f453a.doStopCurrentWork();
            synchronized (this.f454b) {
                this.f455c = null;
            }
            return doStopCurrentWork;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0013, code lost:
            r1.getIntent().setExtrasClassLoader(r3.f453a.getClassLoader());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0025, code lost:
            return new android.support.p017v4.app.JobIntentService.C0229f.C0230a(r3, r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0026, code lost:
            return null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0011, code lost:
            if (r1 == null) goto L_0x0026;
         */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public android.support.p017v4.app.JobIntentService.C0228e mo754b() {
            /*
                r3 = this;
                java.lang.Object r0 = r3.f454b
                monitor-enter(r0)
                android.app.job.JobParameters r1 = r3.f455c     // Catch:{ all -> 0x0027 }
                r2 = 0
                if (r1 != 0) goto L_0x000a
                monitor-exit(r0)     // Catch:{ all -> 0x0027 }
                return r2
            L_0x000a:
                android.app.job.JobParameters r1 = r3.f455c     // Catch:{ all -> 0x0027 }
                android.app.job.JobWorkItem r1 = r1.dequeueWork()     // Catch:{ all -> 0x0027 }
                monitor-exit(r0)     // Catch:{ all -> 0x0027 }
                if (r1 == 0) goto L_0x0026
                android.content.Intent r0 = r1.getIntent()
                android.support.v4.app.JobIntentService r2 = r3.f453a
                java.lang.ClassLoader r2 = r2.getClassLoader()
                r0.setExtrasClassLoader(r2)
                android.support.v4.app.JobIntentService$f$a r0 = new android.support.v4.app.JobIntentService$f$a
                r0.<init>(r1)
                return r0
            L_0x0026:
                return r2
            L_0x0027:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0027 }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.p017v4.app.JobIntentService.C0229f.mo754b():android.support.v4.app.JobIntentService$e");
        }
    }

    /* renamed from: android.support.v4.app.JobIntentService$g */
    static final class C0231g extends C0232h {

        /* renamed from: a */
        private final JobInfo f458a;

        /* renamed from: b */
        private final JobScheduler f459b;

        C0231g(Context context, ComponentName componentName, int i) {
            super(context, componentName);
            mo763a(i);
            this.f458a = new Builder(i, this.f460c).setOverrideDeadline(0).build();
            this.f459b = (JobScheduler) context.getApplicationContext().getSystemService("jobscheduler");
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo756a(Intent intent) {
            this.f459b.enqueue(this.f458a, new JobWorkItem(intent));
        }
    }

    /* renamed from: android.support.v4.app.JobIntentService$h */
    static abstract class C0232h {

        /* renamed from: c */
        final ComponentName f460c;

        /* renamed from: d */
        boolean f461d;

        /* renamed from: e */
        int f462e;

        /* renamed from: a */
        public void mo755a() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public abstract void mo756a(Intent intent);

        /* renamed from: b */
        public void mo757b() {
        }

        /* renamed from: c */
        public void mo758c() {
        }

        C0232h(Context context, ComponentName componentName) {
            this.f460c = componentName;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo763a(int i) {
            if (!this.f461d) {
                this.f461d = true;
                this.f462e = i;
            } else if (this.f462e != i) {
                StringBuilder sb = new StringBuilder();
                sb.append("Given job ID ");
                sb.append(i);
                sb.append(" is different than previous ");
                sb.append(this.f462e);
                throw new IllegalArgumentException(sb.toString());
            }
        }
    }

    /* access modifiers changed from: protected */
    public abstract void onHandleWork(Intent intent);

    public boolean onStopCurrentWork() {
        return true;
    }

    public JobIntentService() {
        if (VERSION.SDK_INT >= 26) {
            this.mCompatQueue = null;
        } else {
            this.mCompatQueue = new ArrayList<>();
        }
    }

    public void onCreate() {
        super.onCreate();
        if (VERSION.SDK_INT >= 26) {
            this.mJobImpl = new C0229f(this);
            this.mCompatWorkEnqueuer = null;
            return;
        }
        this.mJobImpl = null;
        this.mCompatWorkEnqueuer = getWorkEnqueuer(this, new ComponentName(this, getClass()), false, 0);
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        if (this.mCompatQueue == null) {
            return 2;
        }
        this.mCompatWorkEnqueuer.mo755a();
        synchronized (this.mCompatQueue) {
            ArrayList<C0227d> arrayList = this.mCompatQueue;
            if (intent == null) {
                intent = new Intent();
            }
            arrayList.add(new C0227d(intent, i2));
            ensureProcessorRunningLocked(true);
        }
        return 3;
    }

    public IBinder onBind(Intent intent) {
        if (this.mJobImpl != null) {
            return this.mJobImpl.mo753a();
        }
        return null;
    }

    public void onDestroy() {
        super.onDestroy();
        if (this.mCompatQueue != null) {
            synchronized (this.mCompatQueue) {
                this.mDestroyed = true;
                this.mCompatWorkEnqueuer.mo758c();
            }
        }
    }

    public static void enqueueWork(Context context, Class cls, int i, Intent intent) {
        enqueueWork(context, new ComponentName(context, cls), i, intent);
    }

    public static void enqueueWork(Context context, ComponentName componentName, int i, Intent intent) {
        if (intent == null) {
            throw new IllegalArgumentException("work must not be null");
        }
        synchronized (sLock) {
            C0232h workEnqueuer = getWorkEnqueuer(context, componentName, true, i);
            workEnqueuer.mo763a(i);
            workEnqueuer.mo756a(intent);
        }
    }

    static C0232h getWorkEnqueuer(Context context, ComponentName componentName, boolean z, int i) {
        C0232h hVar;
        C0232h hVar2 = (C0232h) sClassWorkEnqueuer.get(componentName);
        if (hVar2 != null) {
            return hVar2;
        }
        if (VERSION.SDK_INT < 26) {
            hVar = new C0226c(context, componentName);
        } else if (!z) {
            throw new IllegalArgumentException("Can't be here without a job id");
        } else {
            hVar = new C0231g(context, componentName, i);
        }
        C0232h hVar3 = hVar;
        sClassWorkEnqueuer.put(componentName, hVar3);
        return hVar3;
    }

    public void setInterruptIfStopped(boolean z) {
        this.mInterruptIfStopped = z;
    }

    public boolean isStopped() {
        return this.mStopped;
    }

    /* access modifiers changed from: 0000 */
    public boolean doStopCurrentWork() {
        if (this.mCurProcessor != null) {
            this.mCurProcessor.cancel(this.mInterruptIfStopped);
        }
        this.mStopped = true;
        return onStopCurrentWork();
    }

    /* access modifiers changed from: 0000 */
    public void ensureProcessorRunningLocked(boolean z) {
        if (this.mCurProcessor == null) {
            this.mCurProcessor = new C0224a();
            if (this.mCompatWorkEnqueuer != null && z) {
                this.mCompatWorkEnqueuer.mo757b();
            }
            this.mCurProcessor.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }

    /* access modifiers changed from: 0000 */
    public void processorFinished() {
        if (this.mCompatQueue != null) {
            synchronized (this.mCompatQueue) {
                this.mCurProcessor = null;
                if (this.mCompatQueue != null && this.mCompatQueue.size() > 0) {
                    ensureProcessorRunningLocked(false);
                } else if (!this.mDestroyed) {
                    this.mCompatWorkEnqueuer.mo758c();
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public C0228e dequeueWork() {
        if (this.mJobImpl != null) {
            return this.mJobImpl.mo754b();
        }
        synchronized (this.mCompatQueue) {
            if (this.mCompatQueue.size() <= 0) {
                return null;
            }
            C0228e eVar = (C0228e) this.mCompatQueue.remove(0);
            return eVar;
        }
    }
}
