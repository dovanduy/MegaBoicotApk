package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.ads.C3900je;
import com.google.android.gms.internal.ads.zzjj;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.ads.internal.an */
final class C3016an implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ WeakReference f8783a;

    /* renamed from: b */
    private final /* synthetic */ C3015am f8784b;

    C3016an(C3015am amVar, WeakReference weakReference) {
        this.f8784b = amVar;
        this.f8783a = weakReference;
    }

    public final void run() {
        this.f8784b.f8780d = false;
        C3002a aVar = (C3002a) this.f8783a.get();
        if (aVar != null) {
            zzjj a = this.f8784b.f8779c;
            if (aVar.mo12433c(a)) {
                aVar.mo12431b(a);
            } else {
                C3900je.m17433d("Ad is not visible. Not refreshing ad.");
                aVar.f8732d.mo12495b(a);
            }
        }
    }
}
