package com.facebook.ads.internal.p080g;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.text.TextUtils;
import com.facebook.ads.internal.p080g.C1720c.C1721a;
import com.facebook.ads.internal.p115w.p117b.C2306a;
import com.google.android.gms.ads.p135a.C2961a;
import com.google.android.gms.ads.p135a.C2961a.C2962a;
import java.lang.reflect.Method;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.internal.g.a */
public class C1714a {

    /* renamed from: a */
    public static final String f5372a = "a";

    /* renamed from: b */
    private final String f5373b;

    /* renamed from: c */
    private final boolean f5374c;

    /* renamed from: d */
    private final C1718c f5375d;

    /* renamed from: com.facebook.ads.internal.g.a$a */
    private static final class C1716a implements IInterface {

        /* renamed from: a */
        private IBinder f5376a;

        C1716a(IBinder iBinder) {
            this.f5376a = iBinder;
        }

        /* renamed from: a */
        public String mo7486a() {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                this.f5376a.transact(1, obtain, obtain2, 0);
                obtain2.readException();
                return obtain2.readString();
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }

        public IBinder asBinder() {
            return this.f5376a;
        }

        /* renamed from: b */
        public boolean mo7488b() {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                boolean z = true;
                obtain.writeInt(1);
                this.f5376a.transact(2, obtain, obtain2, 0);
                obtain2.readException();
                if (obtain2.readInt() == 0) {
                    z = false;
                }
                return z;
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }
    }

    /* renamed from: com.facebook.ads.internal.g.a$b */
    private static final class C1717b implements ServiceConnection {

        /* renamed from: a */
        private AtomicBoolean f5377a;

        /* renamed from: b */
        private final BlockingQueue<IBinder> f5378b;

        private C1717b() {
            this.f5377a = new AtomicBoolean(false);
            this.f5378b = new LinkedBlockingDeque();
        }

        /* renamed from: a */
        public IBinder mo7489a() {
            if (!this.f5377a.compareAndSet(true, true)) {
                return (IBinder) this.f5378b.take();
            }
            throw new IllegalStateException("Binder already consumed");
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                this.f5378b.put(iBinder);
            } catch (InterruptedException unused) {
            }
        }

        public void onServiceDisconnected(ComponentName componentName) {
        }
    }

    /* renamed from: com.facebook.ads.internal.g.a$c */
    public enum C1718c {
        SHARED_PREFS,
        FB4A,
        DIRECT,
        REFLECTION,
        SERVICE
    }

    private C1714a(String str, boolean z, C1718c cVar) {
        this.f5373b = str;
        this.f5374c = z;
        this.f5375d = cVar;
    }

    /* renamed from: a */
    private static C1714a m7162a(Context context) {
        try {
            C2962a a = C2961a.m10593a(context);
            if (a != null) {
                return new C1714a(a.mo12186a(), a.mo12187b(), C1718c.DIRECT);
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    /* renamed from: a */
    public static C1714a m7163a(Context context, C1721a aVar) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            throw new IllegalStateException("Cannot get advertising info on main thread.");
        } else if (C2306a.m9015a() && C2306a.m9016b("idfa_override")) {
            return new C1714a(C2306a.m9014a("idfa_override"), false, C1718c.DIRECT);
        } else {
            if (aVar != null && !TextUtils.isEmpty(aVar.f5390b)) {
                return new C1714a(aVar.f5390b, aVar.f5391c, C1718c.FB4A);
            }
            C1714a a = m7162a(context);
            if (a == null || TextUtils.isEmpty(a.mo7483a())) {
                Method a2 = C1722d.m7175a("com.google.android.gms.common.GooglePlayServicesUtil", "isGooglePlayServicesAvailable", (Class<?>[]) new Class[]{Context.class});
                if (a2 != null) {
                    Object a3 = C1722d.m7173a((Object) null, a2, context);
                    if (a3 != null && ((Integer) a3).intValue() == 0) {
                        Method a4 = C1722d.m7175a("com.google.android.gms.ads.identifier.AdvertisingIdClient", "getAdvertisingIdInfo", (Class<?>[]) new Class[]{Context.class});
                        if (a4 != null) {
                            Object a5 = C1722d.m7173a((Object) null, a4, context);
                            if (a5 != null) {
                                Method a6 = C1722d.m7174a(a5.getClass(), "getId", (Class<?>[]) new Class[0]);
                                Method a7 = C1722d.m7174a(a5.getClass(), "isLimitAdTrackingEnabled", (Class<?>[]) new Class[0]);
                                if (!(a6 == null || a7 == null)) {
                                    a = new C1714a((String) C1722d.m7173a(a5, a6, new Object[0]), ((Boolean) C1722d.m7173a(a5, a7, new Object[0])).booleanValue(), C1718c.REFLECTION);
                                }
                            }
                        }
                    }
                }
                a = null;
            }
            if (a == null || TextUtils.isEmpty(a.mo7483a())) {
                a = m7164b(context);
            }
            return a;
        }
    }

    /* renamed from: b */
    private static C1714a m7164b(Context context) {
        C1717b bVar = new C1717b();
        Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
        intent.setPackage("com.google.android.gms");
        if (context.bindService(intent, bVar, 1)) {
            try {
                C1716a aVar = new C1716a(bVar.mo7489a());
                return new C1714a(aVar.mo7486a(), aVar.mo7488b(), C1718c.SERVICE);
            } catch (Exception unused) {
            } finally {
                context.unbindService(bVar);
            }
        }
        return null;
    }

    /* renamed from: a */
    public String mo7483a() {
        return this.f5373b;
    }

    /* renamed from: b */
    public boolean mo7484b() {
        return this.f5374c;
    }

    /* renamed from: c */
    public C1718c mo7485c() {
        return this.f5375d;
    }
}
