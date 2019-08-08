package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.support.customtabs.C0156b;
import android.support.customtabs.C0165d;
import java.lang.ref.WeakReference;

public final class afr extends C0165d {

    /* renamed from: a */
    private WeakReference<afs> f10760a;

    public afr(afs afs) {
        this.f10760a = new WeakReference<>(afs);
    }

    /* renamed from: a */
    public final void mo352a(ComponentName componentName, C0156b bVar) {
        afs afs = (afs) this.f10760a.get();
        if (afs != null) {
            afs.mo14270a(bVar);
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        afs afs = (afs) this.f10760a.get();
        if (afs != null) {
            afs.mo14269a();
        }
    }
}
