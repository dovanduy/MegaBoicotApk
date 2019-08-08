package com.facebook.ads.internal.view.p110i;

import android.database.ContentObserver;
import android.os.Handler;

/* renamed from: com.facebook.ads.internal.view.i.e */
class C2242e extends ContentObserver {

    /* renamed from: a */
    private final C2159c f7060a;

    C2242e(Handler handler, C2159c cVar) {
        super(handler);
        this.f7060a = cVar;
    }

    public boolean deliverSelfNotifications() {
        return false;
    }

    public void onChange(boolean z) {
        this.f7060a.mo8455e();
    }
}
