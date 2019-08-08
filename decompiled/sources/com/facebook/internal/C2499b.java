package com.facebook.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import com.facebook.C2579j;
import java.lang.reflect.Method;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.internal.b */
/* compiled from: AttributionIdentifiers */
public class C2499b {

    /* renamed from: a */
    private static final String f7868a = C2499b.class.getCanonicalName();

    /* renamed from: g */
    private static C2499b f7869g;

    /* renamed from: b */
    private String f7870b;

    /* renamed from: c */
    private String f7871c;

    /* renamed from: d */
    private String f7872d;

    /* renamed from: e */
    private boolean f7873e;

    /* renamed from: f */
    private long f7874f;

    /* renamed from: com.facebook.internal.b$a */
    /* compiled from: AttributionIdentifiers */
    private static final class C2501a implements IInterface {

        /* renamed from: a */
        private IBinder f7875a;

        C2501a(IBinder iBinder) {
            this.f7875a = iBinder;
        }

        public IBinder asBinder() {
            return this.f7875a;
        }

        /* renamed from: a */
        public String mo8979a() throws RemoteException {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                this.f7875a.transact(1, obtain, obtain2, 0);
                obtain2.readException();
                return obtain2.readString();
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }

        /* renamed from: b */
        public boolean mo8981b() throws RemoteException {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                boolean z = true;
                obtain.writeInt(1);
                this.f7875a.transact(2, obtain, obtain2, 0);
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

    /* renamed from: com.facebook.internal.b$b */
    /* compiled from: AttributionIdentifiers */
    private static final class C2502b implements ServiceConnection {

        /* renamed from: a */
        private AtomicBoolean f7876a;

        /* renamed from: b */
        private final BlockingQueue<IBinder> f7877b;

        public void onServiceDisconnected(ComponentName componentName) {
        }

        private C2502b() {
            this.f7876a = new AtomicBoolean(false);
            this.f7877b = new LinkedBlockingDeque();
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (iBinder != null) {
                try {
                    this.f7877b.put(iBinder);
                } catch (InterruptedException unused) {
                }
            }
        }

        /* renamed from: a */
        public IBinder mo8982a() throws InterruptedException {
            if (!this.f7876a.compareAndSet(true, true)) {
                return (IBinder) this.f7877b.take();
            }
            throw new IllegalStateException("Binder already consumed");
        }
    }

    /* renamed from: b */
    private static C2499b m9556b(Context context) {
        C2499b c = m9557c(context);
        if (c != null) {
            return c;
        }
        C2499b d = m9558d(context);
        return d == null ? new C2499b() : d;
    }

    /* renamed from: c */
    private static C2499b m9557c(Context context) {
        try {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                throw new C2579j("getAndroidId cannot be called on the main thread.");
            }
            Method a = C2479ad.m9434a("com.google.android.gms.common.GooglePlayServicesUtil", "isGooglePlayServicesAvailable", (Class<?>[]) new Class[]{Context.class});
            if (a == null) {
                return null;
            }
            Object a2 = C2479ad.m9423a((Object) null, a, context);
            if (a2 instanceof Integer) {
                if (((Integer) a2).intValue() == 0) {
                    Method a3 = C2479ad.m9434a("com.google.android.gms.ads.identifier.AdvertisingIdClient", "getAdvertisingIdInfo", (Class<?>[]) new Class[]{Context.class});
                    if (a3 == null) {
                        return null;
                    }
                    Object a4 = C2479ad.m9423a((Object) null, a3, context);
                    if (a4 == null) {
                        return null;
                    }
                    Method a5 = C2479ad.m9433a(a4.getClass(), "getId", (Class<?>[]) new Class[0]);
                    Method a6 = C2479ad.m9433a(a4.getClass(), "isLimitAdTrackingEnabled", (Class<?>[]) new Class[0]);
                    if (a5 != null) {
                        if (a6 != null) {
                            C2499b bVar = new C2499b();
                            bVar.f7871c = (String) C2479ad.m9423a(a4, a5, new Object[0]);
                            bVar.f7873e = ((Boolean) C2479ad.m9423a(a4, a6, new Object[0])).booleanValue();
                            return bVar;
                        }
                    }
                    return null;
                }
            }
            return null;
        } catch (Exception e) {
            C2479ad.m9447a("android_id", e);
            return null;
        }
    }

    /* renamed from: d */
    private static C2499b m9558d(Context context) {
        C2502b bVar = new C2502b();
        Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
        intent.setPackage("com.google.android.gms");
        if (context.bindService(intent, bVar, 1)) {
            try {
                C2501a aVar = new C2501a(bVar.mo8982a());
                C2499b bVar2 = new C2499b();
                bVar2.f7871c = aVar.mo8979a();
                bVar2.f7873e = aVar.mo8981b();
                return bVar2;
            } catch (Exception e) {
                C2479ad.m9447a("android_id", e);
            } finally {
                context.unbindService(bVar);
            }
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x006e A[Catch:{ Exception -> 0x00dc, all -> 0x00da }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0072 A[Catch:{ Exception -> 0x00dc, all -> 0x00da }] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0077 A[Catch:{ Exception -> 0x00dc, all -> 0x00da }] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00fa  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0102  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.facebook.internal.C2499b m9554a(android.content.Context r10) {
        /*
            android.os.Looper r0 = android.os.Looper.myLooper()
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            if (r0 != r1) goto L_0x0011
            java.lang.String r0 = f7868a
            java.lang.String r1 = "getAttributionIdentifiers should not be called from the main thread"
            android.util.Log.e(r0, r1)
        L_0x0011:
            com.facebook.internal.b r0 = f7869g
            if (r0 == 0) goto L_0x0029
            long r0 = java.lang.System.currentTimeMillis()
            com.facebook.internal.b r2 = f7869g
            long r2 = r2.f7874f
            long r4 = r0 - r2
            r0 = 3600000(0x36ee80, double:1.7786363E-317)
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 >= 0) goto L_0x0029
            com.facebook.internal.b r10 = f7869g
            return r10
        L_0x0029:
            com.facebook.internal.b r0 = m9556b(r10)
            r1 = 3
            r2 = 0
            java.lang.String[] r5 = new java.lang.String[r1]     // Catch:{ Exception -> 0x00dc, all -> 0x00da }
            java.lang.String r1 = "aid"
            r3 = 0
            r5[r3] = r1     // Catch:{ Exception -> 0x00dc, all -> 0x00da }
            r1 = 1
            java.lang.String r4 = "androidid"
            r5[r1] = r4     // Catch:{ Exception -> 0x00dc, all -> 0x00da }
            r1 = 2
            java.lang.String r4 = "limit_tracking"
            r5[r1] = r4     // Catch:{ Exception -> 0x00dc, all -> 0x00da }
            android.content.pm.PackageManager r1 = r10.getPackageManager()     // Catch:{ Exception -> 0x00dc, all -> 0x00da }
            java.lang.String r4 = "com.facebook.katana.provider.AttributionIdProvider"
            android.content.pm.ProviderInfo r1 = r1.resolveContentProvider(r4, r3)     // Catch:{ Exception -> 0x00dc, all -> 0x00da }
            if (r1 == 0) goto L_0x0054
            java.lang.String r1 = "content://com.facebook.katana.provider.AttributionIdProvider"
            android.net.Uri r1 = android.net.Uri.parse(r1)     // Catch:{ Exception -> 0x00dc, all -> 0x00da }
        L_0x0052:
            r4 = r1
            goto L_0x0068
        L_0x0054:
            android.content.pm.PackageManager r1 = r10.getPackageManager()     // Catch:{ Exception -> 0x00dc, all -> 0x00da }
            java.lang.String r4 = "com.facebook.wakizashi.provider.AttributionIdProvider"
            android.content.pm.ProviderInfo r1 = r1.resolveContentProvider(r4, r3)     // Catch:{ Exception -> 0x00dc, all -> 0x00da }
            if (r1 == 0) goto L_0x0067
            java.lang.String r1 = "content://com.facebook.wakizashi.provider.AttributionIdProvider"
            android.net.Uri r1 = android.net.Uri.parse(r1)     // Catch:{ Exception -> 0x00dc, all -> 0x00da }
            goto L_0x0052
        L_0x0067:
            r4 = r2
        L_0x0068:
            java.lang.String r1 = m9559e(r10)     // Catch:{ Exception -> 0x00dc, all -> 0x00da }
            if (r1 == 0) goto L_0x0070
            r0.f7872d = r1     // Catch:{ Exception -> 0x00dc, all -> 0x00da }
        L_0x0070:
            if (r4 != 0) goto L_0x0077
            com.facebook.internal.b r10 = m9555a(r0)     // Catch:{ Exception -> 0x00dc, all -> 0x00da }
            return r10
        L_0x0077:
            android.content.ContentResolver r3 = r10.getContentResolver()     // Catch:{ Exception -> 0x00dc, all -> 0x00da }
            r6 = 0
            r7 = 0
            r8 = 0
            android.database.Cursor r10 = r3.query(r4, r5, r6, r7, r8)     // Catch:{ Exception -> 0x00dc, all -> 0x00da }
            if (r10 == 0) goto L_0x00d0
            boolean r1 = r10.moveToFirst()     // Catch:{ Exception -> 0x00cb, all -> 0x00c7 }
            if (r1 != 0) goto L_0x008b
            goto L_0x00d0
        L_0x008b:
            java.lang.String r1 = "aid"
            int r1 = r10.getColumnIndex(r1)     // Catch:{ Exception -> 0x00cb, all -> 0x00c7 }
            java.lang.String r3 = "androidid"
            int r3 = r10.getColumnIndex(r3)     // Catch:{ Exception -> 0x00cb, all -> 0x00c7 }
            java.lang.String r4 = "limit_tracking"
            int r4 = r10.getColumnIndex(r4)     // Catch:{ Exception -> 0x00cb, all -> 0x00c7 }
            java.lang.String r1 = r10.getString(r1)     // Catch:{ Exception -> 0x00cb, all -> 0x00c7 }
            r0.f7870b = r1     // Catch:{ Exception -> 0x00cb, all -> 0x00c7 }
            if (r3 <= 0) goto L_0x00bd
            if (r4 <= 0) goto L_0x00bd
            java.lang.String r1 = r0.mo8976b()     // Catch:{ Exception -> 0x00cb, all -> 0x00c7 }
            if (r1 != 0) goto L_0x00bd
            java.lang.String r1 = r10.getString(r3)     // Catch:{ Exception -> 0x00cb, all -> 0x00c7 }
            r0.f7871c = r1     // Catch:{ Exception -> 0x00cb, all -> 0x00c7 }
            java.lang.String r1 = r10.getString(r4)     // Catch:{ Exception -> 0x00cb, all -> 0x00c7 }
            boolean r1 = java.lang.Boolean.parseBoolean(r1)     // Catch:{ Exception -> 0x00cb, all -> 0x00c7 }
            r0.f7873e = r1     // Catch:{ Exception -> 0x00cb, all -> 0x00c7 }
        L_0x00bd:
            if (r10 == 0) goto L_0x00c2
            r10.close()
        L_0x00c2:
            com.facebook.internal.b r10 = m9555a(r0)
            return r10
        L_0x00c7:
            r0 = move-exception
            r2 = r10
            r10 = r0
            goto L_0x0100
        L_0x00cb:
            r0 = move-exception
            r9 = r0
            r0 = r10
            r10 = r9
            goto L_0x00de
        L_0x00d0:
            com.facebook.internal.b r0 = m9555a(r0)     // Catch:{ Exception -> 0x00cb, all -> 0x00c7 }
            if (r10 == 0) goto L_0x00d9
            r10.close()
        L_0x00d9:
            return r0
        L_0x00da:
            r10 = move-exception
            goto L_0x0100
        L_0x00dc:
            r10 = move-exception
            r0 = r2
        L_0x00de:
            java.lang.String r1 = f7868a     // Catch:{ all -> 0x00fe }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x00fe }
            r3.<init>()     // Catch:{ all -> 0x00fe }
            java.lang.String r4 = "Caught unexpected exception in getAttributionId(): "
            r3.append(r4)     // Catch:{ all -> 0x00fe }
            java.lang.String r10 = r10.toString()     // Catch:{ all -> 0x00fe }
            r3.append(r10)     // Catch:{ all -> 0x00fe }
            java.lang.String r10 = r3.toString()     // Catch:{ all -> 0x00fe }
            android.util.Log.d(r1, r10)     // Catch:{ all -> 0x00fe }
            if (r0 == 0) goto L_0x00fd
            r0.close()
        L_0x00fd:
            return r2
        L_0x00fe:
            r10 = move-exception
            r2 = r0
        L_0x0100:
            if (r2 == 0) goto L_0x0105
            r2.close()
        L_0x0105:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.C2499b.m9554a(android.content.Context):com.facebook.internal.b");
    }

    /* renamed from: a */
    private static C2499b m9555a(C2499b bVar) {
        bVar.f7874f = System.currentTimeMillis();
        f7869g = bVar;
        return bVar;
    }

    /* renamed from: a */
    public String mo8975a() {
        return this.f7870b;
    }

    /* renamed from: b */
    public String mo8976b() {
        return this.f7871c;
    }

    /* renamed from: c */
    public String mo8977c() {
        return this.f7872d;
    }

    /* renamed from: d */
    public boolean mo8978d() {
        return this.f7873e;
    }

    /* renamed from: e */
    private static String m9559e(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            return packageManager.getInstallerPackageName(context.getPackageName());
        }
        return null;
    }
}
