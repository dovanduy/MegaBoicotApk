package com.google.android.gms.ads.internal;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

/* renamed from: com.google.android.gms.ads.internal.as */
final class C3021as implements OnTouchListener {

    /* renamed from: a */
    private final /* synthetic */ C3019aq f8796a;

    C3021as(C3019aq aqVar) {
        this.f8796a = aqVar;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (this.f8796a.f8793h != null) {
            this.f8796a.f8793h.mo14287a(motionEvent);
        }
        return false;
    }
}
