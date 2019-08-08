package android.support.customtabs;

import android.content.ComponentName;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import java.util.List;

/* renamed from: android.support.customtabs.e */
/* compiled from: CustomTabsSession */
public final class C0167e {

    /* renamed from: a */
    private final Object f242a = new Object();

    /* renamed from: b */
    private final C0173h f243b;

    /* renamed from: c */
    private final C0170g f244c;

    /* renamed from: d */
    private final ComponentName f245d;

    C0167e(C0173h hVar, C0170g gVar, ComponentName componentName) {
        this.f243b = hVar;
        this.f244c = gVar;
        this.f245d = componentName;
    }

    /* renamed from: a */
    public boolean mo355a(Uri uri, Bundle bundle, List<Bundle> list) {
        try {
            return this.f243b.mo327a(this.f244c, uri, bundle, list);
        } catch (RemoteException unused) {
            return false;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public IBinder mo354a() {
        return this.f244c.asBinder();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public ComponentName mo356b() {
        return this.f245d;
    }
}
