package android.support.customtabs;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.support.customtabs.C0170g.C0171a;
import android.text.TextUtils;

/* renamed from: android.support.customtabs.b */
/* compiled from: CustomTabsClient */
public class C0156b {

    /* renamed from: a */
    private final C0173h f213a;

    /* renamed from: b */
    private final ComponentName f214b;

    C0156b(C0173h hVar, ComponentName componentName) {
        this.f213a = hVar;
        this.f214b = componentName;
    }

    /* renamed from: a */
    public static boolean m302a(Context context, String str, C0165d dVar) {
        Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
        if (!TextUtils.isEmpty(str)) {
            intent.setPackage(str);
        }
        return context.bindService(intent, dVar, 33);
    }

    /* renamed from: a */
    public boolean mo339a(long j) {
        try {
            return this.f213a.mo323a(j);
        } catch (RemoteException unused) {
            return false;
        }
    }

    /* renamed from: a */
    public C0167e mo338a(final C0155a aVar) {
        C01571 r0 = new C0171a() {

            /* renamed from: c */
            private Handler f217c = new Handler(Looper.getMainLooper());

            /* renamed from: a */
            public void mo341a(final int i, final Bundle bundle) {
                if (aVar != null) {
                    this.f217c.post(new Runnable() {
                        public void run() {
                            aVar.mo334a(i, bundle);
                        }
                    });
                }
            }

            /* renamed from: a */
            public void mo343a(final String str, final Bundle bundle) throws RemoteException {
                if (aVar != null) {
                    this.f217c.post(new Runnable() {
                        public void run() {
                            aVar.mo336a(str, bundle);
                        }
                    });
                }
            }

            /* renamed from: a */
            public void mo342a(final Bundle bundle) throws RemoteException {
                if (aVar != null) {
                    this.f217c.post(new Runnable() {
                        public void run() {
                            aVar.mo335a(bundle);
                        }
                    });
                }
            }

            /* renamed from: b */
            public void mo344b(final String str, final Bundle bundle) throws RemoteException {
                if (aVar != null) {
                    this.f217c.post(new Runnable() {
                        public void run() {
                            aVar.mo337b(str, bundle);
                        }
                    });
                }
            }

            /* renamed from: a */
            public void mo340a(int i, Uri uri, boolean z, Bundle bundle) throws RemoteException {
                if (aVar != null) {
                    Handler handler = this.f217c;
                    final int i2 = i;
                    final Uri uri2 = uri;
                    final boolean z2 = z;
                    final Bundle bundle2 = bundle;
                    C01625 r1 = new Runnable() {
                        public void run() {
                            aVar.mo333a(i2, uri2, z2, bundle2);
                        }
                    };
                    handler.post(r1);
                }
            }
        };
        try {
            if (!this.f213a.mo324a((C0170g) r0)) {
                return null;
            }
            return new C0167e(this.f213a, r0, this.f214b);
        } catch (RemoteException unused) {
            return null;
        }
    }
}
