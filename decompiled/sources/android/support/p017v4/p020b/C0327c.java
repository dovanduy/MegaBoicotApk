package android.support.p017v4.p020b;

import android.os.Handler;
import android.os.Handler.Callback;
import android.os.HandlerThread;
import android.os.Message;
import java.util.concurrent.Callable;

/* renamed from: android.support.v4.b.c */
/* compiled from: SelfDestructiveThread */
public class C0327c {

    /* renamed from: a */
    private final Object f820a = new Object();

    /* renamed from: b */
    private HandlerThread f821b;

    /* renamed from: c */
    private Handler f822c;

    /* renamed from: d */
    private int f823d;

    /* renamed from: e */
    private Callback f824e = new Callback() {
        public boolean handleMessage(Message message) {
            switch (message.what) {
                case 0:
                    C0327c.this.mo1138a();
                    return true;
                case 1:
                    C0327c.this.mo1139a((Runnable) message.obj);
                    return true;
                default:
                    return true;
            }
        }
    };

    /* renamed from: f */
    private final int f825f;

    /* renamed from: g */
    private final int f826g;

    /* renamed from: h */
    private final String f827h;

    /* renamed from: android.support.v4.b.c$a */
    /* compiled from: SelfDestructiveThread */
    public interface C0332a<T> {
        /* renamed from: a */
        void mo1126a(T t);
    }

    public C0327c(String str, int i, int i2) {
        this.f827h = str;
        this.f826g = i;
        this.f825f = i2;
        this.f823d = 0;
    }

    /* renamed from: b */
    private void m1206b(Runnable runnable) {
        synchronized (this.f820a) {
            if (this.f821b == null) {
                this.f821b = new HandlerThread(this.f827h, this.f826g);
                this.f821b.start();
                this.f822c = new Handler(this.f821b.getLooper(), this.f824e);
                this.f823d++;
            }
            this.f822c.removeMessages(0);
            this.f822c.sendMessage(this.f822c.obtainMessage(1, runnable));
        }
    }

    /* renamed from: a */
    public <T> void mo1140a(final Callable<T> callable, final C0332a<T> aVar) {
        final Handler handler = new Handler();
        m1206b(new Runnable() {
            public void run() {
                final Object obj;
                try {
                    obj = callable.call();
                } catch (Exception unused) {
                    obj = null;
                }
                handler.post(new Runnable() {
                    public void run() {
                        aVar.mo1126a(obj);
                    }
                });
            }
        });
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:9|10|11|12|13|(4:26|15|16|17)(1:18)) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0040 */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0046 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <T> T mo1137a(java.util.concurrent.Callable<T> r13, int r14) throws java.lang.InterruptedException {
        /*
            r12 = this;
            java.util.concurrent.locks.ReentrantLock r7 = new java.util.concurrent.locks.ReentrantLock
            r7.<init>()
            java.util.concurrent.locks.Condition r8 = r7.newCondition()
            java.util.concurrent.atomic.AtomicReference r9 = new java.util.concurrent.atomic.AtomicReference
            r9.<init>()
            java.util.concurrent.atomic.AtomicBoolean r10 = new java.util.concurrent.atomic.AtomicBoolean
            r0 = 1
            r10.<init>(r0)
            android.support.v4.b.c$3 r11 = new android.support.v4.b.c$3
            r0 = r11
            r1 = r12
            r2 = r9
            r3 = r13
            r4 = r7
            r5 = r10
            r6 = r8
            r0.<init>(r2, r3, r4, r5, r6)
            r12.m1206b(r11)
            r7.lock()
            boolean r13 = r10.get()     // Catch:{ all -> 0x005c }
            if (r13 != 0) goto L_0x0034
            java.lang.Object r13 = r9.get()     // Catch:{ all -> 0x005c }
            r7.unlock()
            return r13
        L_0x0034:
            java.util.concurrent.TimeUnit r13 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ all -> 0x005c }
            long r0 = (long) r14     // Catch:{ all -> 0x005c }
            long r13 = r13.toNanos(r0)     // Catch:{ all -> 0x005c }
        L_0x003b:
            long r0 = r8.awaitNanos(r13)     // Catch:{ InterruptedException -> 0x0040 }
            r13 = r0
        L_0x0040:
            boolean r0 = r10.get()     // Catch:{ all -> 0x005c }
            if (r0 != 0) goto L_0x004e
            java.lang.Object r13 = r9.get()     // Catch:{ all -> 0x005c }
            r7.unlock()
            return r13
        L_0x004e:
            r0 = 0
            int r2 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r2 > 0) goto L_0x003b
            java.lang.InterruptedException r13 = new java.lang.InterruptedException     // Catch:{ all -> 0x005c }
            java.lang.String r14 = "timeout"
            r13.<init>(r14)     // Catch:{ all -> 0x005c }
            throw r13     // Catch:{ all -> 0x005c }
        L_0x005c:
            r13 = move-exception
            r7.unlock()
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p017v4.p020b.C0327c.mo1137a(java.util.concurrent.Callable, int):java.lang.Object");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo1139a(Runnable runnable) {
        runnable.run();
        synchronized (this.f820a) {
            this.f822c.removeMessages(0);
            this.f822c.sendMessageDelayed(this.f822c.obtainMessage(0), (long) this.f825f);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo1138a() {
        synchronized (this.f820a) {
            if (!this.f822c.hasMessages(1)) {
                this.f821b.quit();
                this.f821b = null;
                this.f822c = null;
            }
        }
    }
}
