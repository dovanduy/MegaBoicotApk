package com.google.android.gms.ads.internal;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

/* renamed from: com.google.android.gms.ads.internal.bk */
final class C3040bk implements OnTouchListener {

    /* renamed from: a */
    private final /* synthetic */ C3050bu f8903a;

    /* renamed from: b */
    private final /* synthetic */ C3038bi f8904b;

    C3040bk(C3038bi biVar, C3050bu buVar) {
        this.f8904b = biVar;
        this.f8903a = buVar;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        this.f8903a.mo12585a();
        if (this.f8904b.f8899b != null) {
            this.f8904b.f8899b.mo15373c();
        }
        return false;
    }
}
