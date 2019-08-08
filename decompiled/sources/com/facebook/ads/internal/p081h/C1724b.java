package com.facebook.ads.internal.p081h;

import android.content.Context;
import android.os.Handler;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.internal.h.b */
public class C1724b {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final String f5392a = "b";

    /* renamed from: b */
    private static final ExecutorService f5393b = Executors.newSingleThreadExecutor();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final ExecutorService f5394c = Executors.newFixedThreadPool(5);
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final Handler f5395d = new Handler();
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C1733d f5396e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C1734e f5397f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C1730c f5398g;

    /* renamed from: h */
    private final List<Callable<Boolean>> f5399h;

    /* renamed from: com.facebook.ads.internal.h.b$a */
    private class C1727a implements Callable<Boolean> {

        /* renamed from: b */
        private final String f5406b;

        public C1727a(String str) {
            this.f5406b = str;
        }

        /* renamed from: a */
        public Boolean call() {
            return Boolean.valueOf(C1724b.this.f5398g.mo7506a(this.f5406b));
        }
    }

    /* renamed from: com.facebook.ads.internal.h.b$b */
    private class C1728b implements Callable<Boolean> {

        /* renamed from: b */
        private final String f5408b;

        /* renamed from: c */
        private final int f5409c;

        /* renamed from: d */
        private final int f5410d;

        public C1728b(String str, int i, int i2) {
            this.f5408b = str;
            this.f5409c = i;
            this.f5410d = i2;
        }

        /* renamed from: a */
        public Boolean call() {
            return Boolean.valueOf(C1724b.this.f5396e.mo7512a(this.f5408b, this.f5409c, this.f5410d) != null);
        }
    }

    /* renamed from: com.facebook.ads.internal.h.b$c */
    private class C1729c implements Callable<Boolean> {

        /* renamed from: b */
        private final String f5412b;

        public C1729c(String str) {
            this.f5412b = str;
        }

        /* renamed from: a */
        public Boolean call() {
            return Boolean.valueOf(C1724b.this.f5397f.mo7513a(this.f5412b));
        }
    }

    public C1724b(Context context) {
        this.f5396e = C1733d.m7202a(context);
        this.f5397f = C1734e.m7210a(context);
        this.f5398g = C1730c.m7193a(context);
        this.f5399h = new ArrayList();
    }

    /* renamed from: a */
    public void mo7492a(final C1723a aVar) {
        final ArrayList arrayList = new ArrayList(this.f5399h);
        f5393b.execute(new Runnable() {
            public void run() {
                ArrayList<Future> arrayList = new ArrayList<>(arrayList.size());
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList.add(C1724b.f5394c.submit((Callable) it.next()));
                }
                final AtomicBoolean atomicBoolean = new AtomicBoolean(true);
                try {
                    for (Future future : arrayList) {
                        atomicBoolean.set(((Boolean) future.get()).booleanValue() & atomicBoolean.get());
                    }
                } catch (InterruptedException | ExecutionException e) {
                    Log.e(C1724b.f5392a, "Exception while executing cache downloads.", e);
                    atomicBoolean.set(false);
                }
                C1724b.this.f5395d.post(new Runnable() {
                    public void run() {
                        if (aVar != null) {
                            if (atomicBoolean.get()) {
                                aVar.mo7016a();
                                return;
                            }
                            aVar.mo7017b();
                        }
                    }
                });
            }
        });
        this.f5399h.clear();
    }

    /* renamed from: a */
    public void mo7493a(String str) {
        this.f5399h.add(new C1729c(str));
    }

    /* renamed from: a */
    public void mo7494a(String str, int i, int i2) {
        this.f5399h.add(new C1728b(str, i, i2));
    }

    /* renamed from: b */
    public void mo7495b(String str) {
        this.f5399h.add(new C1727a(str));
    }

    /* renamed from: c */
    public String mo7496c(String str) {
        return this.f5397f.mo7514b(str);
    }

    /* renamed from: d */
    public String mo7497d(String str) {
        return this.f5398g.mo7507b(str);
    }
}
