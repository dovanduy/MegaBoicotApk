package android.support.p017v4.media;

import android.support.p017v4.p023d.C0391i;
import android.text.TextUtils;

/* renamed from: android.support.v4.media.m */
/* compiled from: MediaSessionManagerImplBase */
class C0498m {

    /* renamed from: a */
    private static final boolean f1236a = C0492j.f1232a;

    /* renamed from: android.support.v4.media.m$a */
    /* compiled from: MediaSessionManagerImplBase */
    static class C0499a implements C0494b {

        /* renamed from: a */
        private String f1237a;

        /* renamed from: b */
        private int f1238b;

        /* renamed from: c */
        private int f1239c;

        C0499a(String str, int i, int i2) {
            this.f1237a = str;
            this.f1238b = i;
            this.f1239c = i2;
        }

        public boolean equals(Object obj) {
            boolean z = true;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0499a)) {
                return false;
            }
            C0499a aVar = (C0499a) obj;
            if (!(TextUtils.equals(this.f1237a, aVar.f1237a) && this.f1238b == aVar.f1238b && this.f1239c == aVar.f1239c)) {
                z = false;
            }
            return z;
        }

        public int hashCode() {
            return C0391i.m1459a(this.f1237a, Integer.valueOf(this.f1238b), Integer.valueOf(this.f1239c));
        }
    }
}
