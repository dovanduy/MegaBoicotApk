package android.support.customtabs;

import android.app.Service;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IBinder.DeathRecipient;
import android.os.RemoteException;
import android.support.customtabs.C0173h.C0174a;
import android.support.p017v4.p023d.C0376a;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

public abstract class CustomTabsService extends Service {

    /* renamed from: a */
    final Map<IBinder, DeathRecipient> f206a = new C0376a();

    /* renamed from: b */
    private C0174a f207b = new C0174a() {
        /* renamed from: a */
        public boolean mo323a(long j) {
            return CustomTabsService.this.mo314a(j);
        }

        /* renamed from: a */
        public boolean mo324a(C0170g gVar) {
            final C0168f fVar = new C0168f(gVar);
            try {
                C01531 r2 = new DeathRecipient() {
                    public void binderDied() {
                        CustomTabsService.this.mo315a(fVar);
                    }
                };
                synchronized (CustomTabsService.this.f206a) {
                    gVar.asBinder().linkToDeath(r2, 0);
                    CustomTabsService.this.f206a.put(gVar.asBinder(), r2);
                }
                return CustomTabsService.this.mo320b(fVar);
            } catch (RemoteException unused) {
                return false;
            }
        }

        /* renamed from: a */
        public boolean mo327a(C0170g gVar, Uri uri, Bundle bundle, List<Bundle> list) {
            return CustomTabsService.this.mo318a(new C0168f(gVar), uri, bundle, list);
        }

        /* renamed from: a */
        public Bundle mo322a(String str, Bundle bundle) {
            return CustomTabsService.this.mo313a(str, bundle);
        }

        /* renamed from: a */
        public boolean mo328a(C0170g gVar, Bundle bundle) {
            return CustomTabsService.this.mo319a(new C0168f(gVar), bundle);
        }

        /* renamed from: a */
        public boolean mo326a(C0170g gVar, Uri uri) {
            return CustomTabsService.this.mo317a(new C0168f(gVar), uri);
        }

        /* renamed from: a */
        public int mo321a(C0170g gVar, String str, Bundle bundle) {
            return CustomTabsService.this.mo312a(new C0168f(gVar), str, bundle);
        }

        /* renamed from: a */
        public boolean mo325a(C0170g gVar, int i, Uri uri, Bundle bundle) {
            return CustomTabsService.this.mo316a(new C0168f(gVar), i, uri, bundle);
        }
    };

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract int mo312a(C0168f fVar, String str, Bundle bundle);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Bundle mo313a(String str, Bundle bundle);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract boolean mo314a(long j);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract boolean mo316a(C0168f fVar, int i, Uri uri, Bundle bundle);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract boolean mo317a(C0168f fVar, Uri uri);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract boolean mo318a(C0168f fVar, Uri uri, Bundle bundle, List<Bundle> list);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract boolean mo319a(C0168f fVar, Bundle bundle);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract boolean mo320b(C0168f fVar);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo315a(C0168f fVar) {
        try {
            synchronized (this.f206a) {
                IBinder a = fVar.mo357a();
                a.unlinkToDeath((DeathRecipient) this.f206a.get(a), 0);
                this.f206a.remove(a);
            }
            return true;
        } catch (NoSuchElementException unused) {
            return false;
        }
    }
}
