package com.google.android.gms.ads.mediation;

import android.os.Bundle;

/* renamed from: com.google.android.gms.ads.mediation.b */
public interface C3144b {

    /* renamed from: com.google.android.gms.ads.mediation.b$a */
    public static class C3145a {

        /* renamed from: a */
        private int f9165a;

        /* renamed from: a */
        public final Bundle mo12719a() {
            Bundle bundle = new Bundle();
            bundle.putInt("capabilities", this.f9165a);
            return bundle;
        }

        /* renamed from: a */
        public final C3145a mo12720a(int i) {
            this.f9165a = 1;
            return this;
        }
    }

    void onDestroy();

    void onPause();

    void onResume();
}
