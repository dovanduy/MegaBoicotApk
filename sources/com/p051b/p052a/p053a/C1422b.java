package com.p051b.p052a.p053a;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.p130a.p131a.C2790a;
import com.google.android.p130a.p131a.C2790a.C2791a;
import com.p051b.p052a.p054b.C1427a;
import java.util.List;

/* renamed from: com.b.a.a.b */
/* compiled from: InstallReferrerClientImpl */
class C1422b extends C1419a {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public int f4361a = 0;

    /* renamed from: b */
    private final Context f4362b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C2790a f4363c;

    /* renamed from: d */
    private ServiceConnection f4364d;

    /* renamed from: com.b.a.a.b$a */
    /* compiled from: InstallReferrerClientImpl */
    private final class C1424a implements ServiceConnection {

        /* renamed from: b */
        private final C1425c f4366b;

        private C1424a(C1425c cVar) {
            if (cVar == null) {
                throw new RuntimeException("Please specify a listener to know when setup is done.");
            }
            this.f4366b = cVar;
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            C1427a.m5902a("InstallReferrerClient", "Install Referrer service connected.");
            C1422b.this.f4363c = C2791a.m10570a(iBinder);
            C1422b.this.f4361a = 2;
            this.f4366b.mo6464a(0);
        }

        public void onServiceDisconnected(ComponentName componentName) {
            C1427a.m5903b("InstallReferrerClient", "Install Referrer service disconnected.");
            C1422b.this.f4363c = null;
            C1422b.this.f4361a = 0;
            this.f4366b.mo6463a();
        }
    }

    public C1422b(Context context) {
        this.f4362b = context.getApplicationContext();
    }

    /* renamed from: b */
    public boolean mo6460b() {
        return (this.f4361a != 2 || this.f4363c == null || this.f4364d == null) ? false : true;
    }

    /* renamed from: a */
    public void mo6458a(C1425c cVar) {
        if (mo6460b()) {
            C1427a.m5902a("InstallReferrerClient", "Service connection is valid. No need to re-initialize.");
            cVar.mo6464a(0);
        } else if (this.f4361a == 1) {
            C1427a.m5903b("InstallReferrerClient", "Client is already in the process of connecting to the service.");
            cVar.mo6464a(3);
        } else if (this.f4361a == 3) {
            C1427a.m5903b("InstallReferrerClient", "Client was already closed and can't be reused. Please create another instance.");
            cVar.mo6464a(3);
        } else {
            C1427a.m5902a("InstallReferrerClient", "Starting install referrer service setup.");
            this.f4364d = new C1424a(cVar);
            Intent intent = new Intent("com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE");
            intent.setComponent(new ComponentName("com.android.vending", "com.google.android.finsky.externalreferrer.GetInstallReferrerService"));
            List queryIntentServices = this.f4362b.getPackageManager().queryIntentServices(intent, 0);
            if (queryIntentServices != null && !queryIntentServices.isEmpty()) {
                ResolveInfo resolveInfo = (ResolveInfo) queryIntentServices.get(0);
                if (resolveInfo.serviceInfo != null) {
                    String str = resolveInfo.serviceInfo.packageName;
                    String str2 = resolveInfo.serviceInfo.name;
                    if (!"com.android.vending".equals(str) || str2 == null || !m5895c()) {
                        C1427a.m5903b("InstallReferrerClient", "Play Store missing or incompatible. Version 8.3.73 or later required.");
                        this.f4361a = 0;
                        cVar.mo6464a(2);
                        return;
                    }
                    if (this.f4362b.bindService(new Intent(intent), this.f4364d, 1)) {
                        C1427a.m5902a("InstallReferrerClient", "Service was bonded successfully.");
                        return;
                    }
                    C1427a.m5903b("InstallReferrerClient", "Connection to service is blocked.");
                    this.f4361a = 0;
                    cVar.mo6464a(1);
                    return;
                }
            }
            this.f4361a = 0;
            C1427a.m5902a("InstallReferrerClient", "Install Referrer service unavailable on device.");
            cVar.mo6464a(2);
        }
    }

    /* renamed from: a */
    public C1426d mo6457a() throws RemoteException {
        if (!mo6460b()) {
            throw new IllegalStateException("Service not connected. Please start a connection before using the service.");
        }
        Bundle bundle = new Bundle();
        bundle.putString("package_name", this.f4362b.getPackageName());
        try {
            return new C1426d(this.f4363c.mo9680a(bundle));
        } catch (RemoteException e) {
            C1427a.m5903b("InstallReferrerClient", "RemoteException getting install referrer information");
            this.f4361a = 0;
            throw e;
        }
    }

    /* renamed from: c */
    private boolean m5895c() {
        boolean z = false;
        try {
            if (this.f4362b.getPackageManager().getPackageInfo("com.android.vending", 128).versionCode >= 80837300) {
                z = true;
            }
            return z;
        } catch (NameNotFoundException unused) {
            return false;
        }
    }
}
