package android.support.p017v4.media;

import android.os.Build.VERSION;
import android.util.Log;

/* renamed from: android.support.v4.media.j */
/* compiled from: MediaSessionManager */
public final class C0492j {

    /* renamed from: a */
    static final boolean f1232a = Log.isLoggable("MediaSessionManager", 3);

    /* renamed from: b */
    private static final Object f1233b = new Object();

    /* renamed from: android.support.v4.media.j$a */
    /* compiled from: MediaSessionManager */
    public static final class C0493a {

        /* renamed from: a */
        C0494b f1234a;

        public C0493a(String str, int i, int i2) {
            if (VERSION.SDK_INT >= 28) {
                this.f1234a = new C0497a(str, i, i2);
            } else {
                this.f1234a = new C0499a(str, i, i2);
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0493a)) {
                return false;
            }
            return this.f1234a.equals(((C0493a) obj).f1234a);
        }

        public int hashCode() {
            return this.f1234a.hashCode();
        }
    }

    /* renamed from: android.support.v4.media.j$b */
    /* compiled from: MediaSessionManager */
    interface C0494b {
    }
}
