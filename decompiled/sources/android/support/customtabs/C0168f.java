package android.support.customtabs;

import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;

/* renamed from: android.support.customtabs.f */
/* compiled from: CustomTabsSessionToken */
public class C0168f {

    /* renamed from: a */
    final C0170g f246a;

    /* renamed from: b */
    private final C0155a f247b = new C0155a() {
        /* renamed from: a */
        public void mo334a(int i, Bundle bundle) {
            try {
                C0168f.this.f246a.mo341a(i, bundle);
            } catch (RemoteException unused) {
                Log.e("CustomTabsSessionToken", "RemoteException during ICustomTabsCallback transaction");
            }
        }

        /* renamed from: a */
        public void mo336a(String str, Bundle bundle) {
            try {
                C0168f.this.f246a.mo343a(str, bundle);
            } catch (RemoteException unused) {
                Log.e("CustomTabsSessionToken", "RemoteException during ICustomTabsCallback transaction");
            }
        }

        /* renamed from: a */
        public void mo335a(Bundle bundle) {
            try {
                C0168f.this.f246a.mo342a(bundle);
            } catch (RemoteException unused) {
                Log.e("CustomTabsSessionToken", "RemoteException during ICustomTabsCallback transaction");
            }
        }

        /* renamed from: b */
        public void mo337b(String str, Bundle bundle) {
            try {
                C0168f.this.f246a.mo344b(str, bundle);
            } catch (RemoteException unused) {
                Log.e("CustomTabsSessionToken", "RemoteException during ICustomTabsCallback transaction");
            }
        }

        /* renamed from: a */
        public void mo333a(int i, Uri uri, boolean z, Bundle bundle) {
            try {
                C0168f.this.f246a.mo340a(i, uri, z, bundle);
            } catch (RemoteException unused) {
                Log.e("CustomTabsSessionToken", "RemoteException during ICustomTabsCallback transaction");
            }
        }
    };

    C0168f(C0170g gVar) {
        this.f246a = gVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public IBinder mo357a() {
        return this.f246a.asBinder();
    }

    public int hashCode() {
        return mo357a().hashCode();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C0168f)) {
            return false;
        }
        return ((C0168f) obj).mo357a().equals(this.f246a.asBinder());
    }
}
