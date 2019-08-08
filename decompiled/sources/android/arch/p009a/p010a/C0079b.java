package android.arch.p009a.p010a;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: android.arch.a.a.b */
/* compiled from: DefaultTaskExecutor */
public class C0079b extends C0080c {

    /* renamed from: a */
    private final Object f36a = new Object();

    /* renamed from: b */
    private ExecutorService f37b = Executors.newFixedThreadPool(2);

    /* renamed from: c */
    private volatile Handler f38c;

    /* renamed from: a */
    public void mo75a(Runnable runnable) {
        this.f37b.execute(runnable);
    }

    /* renamed from: b */
    public void mo76b(Runnable runnable) {
        if (this.f38c == null) {
            synchronized (this.f36a) {
                if (this.f38c == null) {
                    this.f38c = new Handler(Looper.getMainLooper());
                }
            }
        }
        this.f38c.post(runnable);
    }

    /* renamed from: b */
    public boolean mo77b() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }
}
