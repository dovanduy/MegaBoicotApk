package android.support.customtabs;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.support.customtabs.C0173h.C0174a;

/* renamed from: android.support.customtabs.d */
/* compiled from: CustomTabsServiceConnection */
public abstract class C0165d implements ServiceConnection {
    /* renamed from: a */
    public abstract void mo352a(ComponentName componentName, C0156b bVar);

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        mo352a(componentName, new C0156b(C0174a.m341a(iBinder), componentName) {
        });
    }
}
