package android.support.p017v4.content;

import android.os.Binder;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.util.Log;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: android.support.v4.content.g */
/* compiled from: ModernAsyncTask */
abstract class C0366g<Params, Progress, Result> {

    /* renamed from: a */
    private static final ThreadFactory f926a = new ThreadFactory() {

        /* renamed from: a */
        private final AtomicInteger f936a = new AtomicInteger(1);

        public Thread newThread(Runnable runnable) {
            StringBuilder sb = new StringBuilder();
            sb.append("ModernAsyncTask #");
            sb.append(this.f936a.getAndIncrement());
            return new Thread(runnable, sb.toString());
        }
    };

    /* renamed from: b */
    private static final BlockingQueue<Runnable> f927b = new LinkedBlockingQueue(10);

    /* renamed from: c */
    public static final Executor f928c;

    /* renamed from: f */
    private static C0372b f929f;

    /* renamed from: g */
    private static volatile Executor f930g = f928c;

    /* renamed from: d */
    final AtomicBoolean f931d = new AtomicBoolean();

    /* renamed from: e */
    final AtomicBoolean f932e = new AtomicBoolean();

    /* renamed from: h */
    private final C0374d<Params, Result> f933h = new C0374d<Params, Result>() {
        public Result call() throws Exception {
            C0366g.this.f932e.set(true);
            Object obj = null;
            try {
                Process.setThreadPriority(10);
                Result a = C0366g.this.mo1191a((Params[]) this.f946b);
                try {
                    Binder.flushPendingCommands();
                    C0366g.this.mo1262d(a);
                    return a;
                } catch (Throwable th) {
                    th = th;
                    obj = a;
                    C0366g.this.mo1262d(obj);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                C0366g.this.f931d.set(true);
                throw th;
            }
        }
    };

    /* renamed from: i */
    private final FutureTask<Result> f934i = new FutureTask<Result>(this.f933h) {
        /* access modifiers changed from: protected */
        public void done() {
            try {
                C0366g.this.mo1260c(get());
            } catch (InterruptedException e) {
                Log.w("AsyncTask", e);
            } catch (ExecutionException e2) {
                throw new RuntimeException("An error occurred while executing doInBackground()", e2.getCause());
            } catch (CancellationException unused) {
                C0366g.this.mo1260c(null);
            } catch (Throwable th) {
                throw new RuntimeException("An error occurred while executing doInBackground()", th);
            }
        }
    };

    /* renamed from: j */
    private volatile C0373c f935j = C0373c.PENDING;

    /* renamed from: android.support.v4.content.g$a */
    /* compiled from: ModernAsyncTask */
    private static class C0371a<Data> {

        /* renamed from: a */
        final C0366g f940a;

        /* renamed from: b */
        final Data[] f941b;

        C0371a(C0366g gVar, Data... dataArr) {
            this.f940a = gVar;
            this.f941b = dataArr;
        }
    }

    /* renamed from: android.support.v4.content.g$b */
    /* compiled from: ModernAsyncTask */
    private static class C0372b extends Handler {
        C0372b() {
            super(Looper.getMainLooper());
        }

        public void handleMessage(Message message) {
            C0371a aVar = (C0371a) message.obj;
            switch (message.what) {
                case 1:
                    aVar.f940a.mo1263e(aVar.f941b[0]);
                    return;
                case 2:
                    aVar.f940a.mo1259b((Progress[]) aVar.f941b);
                    return;
                default:
                    return;
            }
        }
    }

    /* renamed from: android.support.v4.content.g$c */
    /* compiled from: ModernAsyncTask */
    public enum C0373c {
        PENDING,
        RUNNING,
        FINISHED
    }

    /* renamed from: android.support.v4.content.g$d */
    /* compiled from: ModernAsyncTask */
    private static abstract class C0374d<Params, Result> implements Callable<Result> {

        /* renamed from: b */
        Params[] f946b;

        C0374d() {
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Result mo1191a(Params... paramsArr);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo1256a() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo1193a(Result result) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo1258b() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo1259b(Progress... progressArr) {
    }

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 128, 1, TimeUnit.SECONDS, f927b, f926a);
        f928c = threadPoolExecutor;
    }

    /* renamed from: d */
    private static Handler m1367d() {
        C0372b bVar;
        synchronized (C0366g.class) {
            if (f929f == null) {
                f929f = new C0372b();
            }
            bVar = f929f;
        }
        return bVar;
    }

    C0366g() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo1260c(Result result) {
        if (!this.f932e.get()) {
            mo1262d(result);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public Result mo1262d(Result result) {
        m1367d().obtainMessage(1, new C0371a(this, result)).sendToTarget();
        return result;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo1194b(Result result) {
        mo1258b();
    }

    /* renamed from: c */
    public final boolean mo1261c() {
        return this.f931d.get();
    }

    /* renamed from: a */
    public final boolean mo1257a(boolean z) {
        this.f931d.set(true);
        return this.f934i.cancel(z);
    }

    /* renamed from: a */
    public final C0366g<Params, Progress, Result> mo1255a(Executor executor, Params... paramsArr) {
        if (this.f935j != C0373c.PENDING) {
            switch (this.f935j) {
                case RUNNING:
                    throw new IllegalStateException("Cannot execute task: the task is already running.");
                case FINISHED:
                    throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
                default:
                    throw new IllegalStateException("We should never reach this state");
            }
        } else {
            this.f935j = C0373c.RUNNING;
            mo1256a();
            this.f933h.f946b = paramsArr;
            executor.execute(this.f934i);
            return this;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public void mo1263e(Result result) {
        if (mo1261c()) {
            mo1194b(result);
        } else {
            mo1193a(result);
        }
        this.f935j = C0373c.FINISHED;
    }
}
