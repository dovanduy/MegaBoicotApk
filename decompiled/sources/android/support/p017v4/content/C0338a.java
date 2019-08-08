package android.support.p017v4.content;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import android.support.p017v4.p023d.C0400o;
import android.support.p017v4.p025os.C0540c;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;

/* renamed from: android.support.v4.content.a */
/* compiled from: AsyncTaskLoader */
public abstract class C0338a<D> extends C0358e<D> {

    /* renamed from: a */
    volatile C0339a f863a;

    /* renamed from: b */
    volatile C0339a f864b;

    /* renamed from: c */
    long f865c;

    /* renamed from: d */
    long f866d;

    /* renamed from: e */
    Handler f867e;

    /* renamed from: f */
    private final Executor f868f;

    /* renamed from: android.support.v4.content.a$a */
    /* compiled from: AsyncTaskLoader */
    final class C0339a extends C0366g<Void, Void, D> implements Runnable {

        /* renamed from: a */
        boolean f869a;

        /* renamed from: f */
        private final CountDownLatch f871f = new CountDownLatch(1);

        C0339a() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public D mo1191a(Void... voidArr) {
            try {
                return C0338a.this.mo1188e();
            } catch (C0540c e) {
                if (mo1261c()) {
                    return null;
                }
                throw e;
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo1193a(D d) {
            try {
                C0338a.this.mo1184b(this, d);
            } finally {
                this.f871f.countDown();
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void mo1194b(D d) {
            try {
                C0338a.this.mo1181a(this, d);
            } finally {
                this.f871f.countDown();
            }
        }

        public void run() {
            this.f869a = false;
            C0338a.this.mo1186c();
        }
    }

    /* renamed from: a */
    public void mo1182a(D d) {
    }

    /* renamed from: d */
    public abstract D mo1187d();

    /* renamed from: f */
    public void mo1189f() {
    }

    public C0338a(Context context) {
        this(context, C0366g.f928c);
    }

    private C0338a(Context context, Executor executor) {
        super(context);
        this.f866d = -10000;
        this.f868f = executor;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo1180a() {
        super.mo1180a();
        mo1236r();
        this.f863a = new C0339a<>();
        mo1186c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo1185b() {
        if (this.f863a == null) {
            return false;
        }
        if (!this.f906r) {
            this.f909u = true;
        }
        if (this.f864b != null) {
            if (this.f863a.f869a) {
                this.f863a.f869a = false;
                this.f867e.removeCallbacks(this.f863a);
            }
            this.f863a = null;
            return false;
        } else if (this.f863a.f869a) {
            this.f863a.f869a = false;
            this.f867e.removeCallbacks(this.f863a);
            this.f863a = null;
            return false;
        } else {
            boolean a = this.f863a.mo1257a(false);
            if (a) {
                this.f864b = this.f863a;
                mo1189f();
            }
            this.f863a = null;
            return a;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo1186c() {
        if (this.f864b == null && this.f863a != null) {
            if (this.f863a.f869a) {
                this.f863a.f869a = false;
                this.f867e.removeCallbacks(this.f863a);
            }
            if (this.f865c <= 0 || SystemClock.uptimeMillis() >= this.f866d + this.f865c) {
                this.f863a.mo1255a(this.f868f, null);
            } else {
                this.f863a.f869a = true;
                this.f867e.postAtTime(this.f863a, this.f866d + this.f865c);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo1181a(C0339a aVar, D d) {
        mo1182a(d);
        if (this.f864b == aVar) {
            mo1245z();
            this.f866d = SystemClock.uptimeMillis();
            this.f864b = null;
            mo1230l();
            mo1186c();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo1184b(C0339a aVar, D d) {
        if (this.f863a != aVar) {
            mo1181a(aVar, d);
        } else if (mo1233o()) {
            mo1182a(d);
        } else {
            mo1244y();
            this.f866d = SystemClock.uptimeMillis();
            this.f863a = null;
            mo1221b(d);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public D mo1188e() {
        return mo1187d();
    }

    /* renamed from: g */
    public boolean mo1190g() {
        return this.f864b != null;
    }

    @Deprecated
    /* renamed from: a */
    public void mo1183a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.mo1183a(str, fileDescriptor, printWriter, strArr);
        if (this.f863a != null) {
            printWriter.print(str);
            printWriter.print("mTask=");
            printWriter.print(this.f863a);
            printWriter.print(" waiting=");
            printWriter.println(this.f863a.f869a);
        }
        if (this.f864b != null) {
            printWriter.print(str);
            printWriter.print("mCancellingTask=");
            printWriter.print(this.f864b);
            printWriter.print(" waiting=");
            printWriter.println(this.f864b.f869a);
        }
        if (this.f865c != 0) {
            printWriter.print(str);
            printWriter.print("mUpdateThrottle=");
            C0400o.m1500a(this.f865c, printWriter);
            printWriter.print(" mLastLoadCompleteTime=");
            C0400o.m1499a(this.f866d, SystemClock.uptimeMillis(), printWriter);
            printWriter.println();
        }
    }
}
