package com.facebook.internal;

import com.facebook.C2649m;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.FutureTask;

/* renamed from: com.facebook.internal.t */
/* compiled from: LockOnGetVariable */
public class C2561t<T> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public T f8010a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public CountDownLatch f8011b = new CountDownLatch(1);

    public C2561t(final Callable<T> callable) {
        C2649m.m10131d().execute(new FutureTask(new Callable<Void>() {
            /* JADX INFO: finally extract failed */
            /* renamed from: a */
            public Void call() throws Exception {
                try {
                    C2561t.this.f8010a = callable.call();
                    C2561t.this.f8011b.countDown();
                    return null;
                } catch (Throwable th) {
                    C2561t.this.f8011b.countDown();
                    throw th;
                }
            }
        }));
    }

    /* renamed from: a */
    public T mo9069a() {
        m9716b();
        return this.f8010a;
    }

    /* renamed from: b */
    private void m9716b() {
        if (this.f8011b != null) {
            try {
                this.f8011b.await();
            } catch (InterruptedException unused) {
            }
        }
    }
}
