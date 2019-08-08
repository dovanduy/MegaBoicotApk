package com.startapp.common.p193a;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.startapp.common.C5554g;
import com.startapp.common.C5554g.C5558a;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.TimeUnit;

/* renamed from: com.startapp.common.a.b */
/* compiled from: StartAppSDK */
public class C5504b {

    /* renamed from: a */
    private static C5504b f17550a = new C5504b();

    /* renamed from: b */
    private volatile C5507b f17551b;

    /* renamed from: com.startapp.common.a.b$a */
    /* compiled from: StartAppSDK */
    protected static final class C5506a implements ServiceConnection {

        /* renamed from: a */
        boolean f17555a = false;

        /* renamed from: b */
        private final LinkedBlockingQueue<IBinder> f17556b = new LinkedBlockingQueue<>(1);

        public void onServiceDisconnected(ComponentName componentName) {
        }

        protected C5506a() {
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                this.f17556b.put(iBinder);
            } catch (InterruptedException unused) {
            }
        }

        /* renamed from: a */
        public IBinder mo20474a() {
            if (this.f17555a) {
                throw new IllegalStateException();
            }
            this.f17555a = true;
            return (IBinder) this.f17556b.take();
        }
    }

    /* renamed from: com.startapp.common.a.b$b */
    /* compiled from: StartAppSDK */
    public static class C5507b {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public String f17557a;

        /* renamed from: b */
        private String f17558b;

        /* renamed from: c */
        private boolean f17559c;

        /* renamed from: d */
        private String f17560d;

        private C5507b(String str, String str2, boolean z) {
            this.f17558b = "";
            this.f17559c = false;
            this.f17560d = null;
            this.f17557a = str;
            this.f17558b = str2;
            this.f17559c = z;
        }

        private C5507b(String str) {
            this.f17558b = "";
            this.f17559c = false;
            this.f17560d = null;
            this.f17557a = "0";
            this.f17560d = str;
        }

        /* renamed from: a */
        public String mo20477a() {
            return this.f17557a;
        }

        /* renamed from: b */
        public boolean mo20478b() {
            return this.f17559c;
        }

        /* renamed from: c */
        public String mo20479c() {
            return this.f17558b;
        }

        /* renamed from: d */
        public String mo20480d() {
            return this.f17560d;
        }
    }

    /* renamed from: com.startapp.common.a.b$c */
    /* compiled from: StartAppSDK */
    private static final class C5508c implements IInterface {

        /* renamed from: a */
        private IBinder f17561a;

        public C5508c(IBinder iBinder) {
            this.f17561a = iBinder;
        }

        public IBinder asBinder() {
            return this.f17561a;
        }

        /* renamed from: a */
        public String mo20481a() {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                this.f17561a.transact(1, obtain, obtain2, 0);
                obtain2.readException();
                return obtain2.readString();
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }

        /* renamed from: a */
        public boolean mo20482a(boolean z) {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                obtain.writeInt(z ? 1 : 0);
                boolean z2 = false;
                this.f17561a.transact(2, obtain, obtain2, 0);
                obtain2.readException();
                if (obtain2.readInt() != 0) {
                    z2 = true;
                }
                return z2;
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }
    }

    private C5504b() {
    }

    /* renamed from: a */
    public static C5504b m23480a() {
        return f17550a;
    }

    /* renamed from: a */
    private static boolean m23481a(String str) {
        try {
            Class.forName(str);
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* renamed from: a */
    public C5507b mo20472a(final Context context) {
        if (this.f17551b == null || this.f17551b.f17557a.equals("0")) {
            synchronized (C5504b.class) {
                if (this.f17551b == null || this.f17551b.f17557a.equals("0")) {
                    final SynchronousQueue synchronousQueue = new SynchronousQueue();
                    C5554g.m23702a(C5558a.HIGH, (Runnable) new Runnable() {
                        public void run() {
                            C5507b bVar = null;
                            try {
                                bVar = C5504b.m23484c(context);
                            } catch (Exception e) {
                                bVar = new C5507b(e.getMessage());
                            } finally {
                                synchronousQueue.offer(bVar);
                            }
                        }
                    });
                    try {
                        this.f17551b = (C5507b) synchronousQueue.poll(1, TimeUnit.SECONDS);
                        if (this.f17551b == null) {
                            this.f17551b = new C5507b("Getting advertisingId took too much time.");
                        }
                    } catch (InterruptedException e) {
                        this.f17551b = new C5507b(e.getMessage());
                    }
                }
            }
        }
        return this.f17551b;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static C5507b m23484c(Context context) {
        if (!m23483b()) {
            return m23486e(context);
        }
        try {
            return m23485d(context);
        } catch (Exception unused) {
            return m23486e(context);
        }
    }

    /* renamed from: d */
    private static C5507b m23485d(Context context) {
        Object invoke = Class.forName("com.google.android.gms.ads.a.a").getMethod("getAdvertisingIdInfo", new Class[]{Context.class}).invoke(null, new Object[]{context.getApplicationContext()});
        return new C5507b((String) invoke.getClass().getMethod("getId", new Class[0]).invoke(invoke, new Object[0]), "APP", ((Boolean) invoke.getClass().getMethod("isLimitAdTrackingEnabled", new Class[0]).invoke(invoke, new Object[0])).booleanValue());
    }

    /* renamed from: e */
    private static C5507b m23486e(Context context) {
        C5507b bVar;
        try {
            context.getPackageManager().getPackageInfo("com.android.vending", 0);
            C5506a aVar = new C5506a();
            Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
            intent.setPackage("com.google.android.gms");
            try {
                if (context.getApplicationContext().bindService(intent, aVar, 1)) {
                    C5508c cVar = new C5508c(aVar.mo20474a());
                    bVar = new C5507b(cVar.mo20481a(), "DEVICE", cVar.mo20482a(true));
                    context.getApplicationContext().unbindService(aVar);
                    return bVar;
                }
                context.getApplicationContext().unbindService(aVar);
                return new C5507b("Google Play connection failed");
            } catch (Exception e) {
                bVar = new C5507b(e.getMessage());
            } catch (Throwable th) {
                context.getApplicationContext().unbindService(aVar);
                throw th;
            }
        } catch (Exception e2) {
            return new C5507b(e2.getMessage());
        }
    }

    /* renamed from: b */
    public static boolean m23483b() {
        return m23481a("com.google.android.gms.ads.a.a");
    }
}
