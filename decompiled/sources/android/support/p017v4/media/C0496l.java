package android.support.p017v4.media;

import android.media.session.MediaSessionManager.RemoteUserInfo;
import android.support.p017v4.p023d.C0391i;

/* renamed from: android.support.v4.media.l */
/* compiled from: MediaSessionManagerImplApi28 */
class C0496l extends C0495k {

    /* renamed from: android.support.v4.media.l$a */
    /* compiled from: MediaSessionManagerImplApi28 */
    static final class C0497a implements C0494b {

        /* renamed from: a */
        final RemoteUserInfo f1235a;

        C0497a(String str, int i, int i2) {
            this.f1235a = new RemoteUserInfo(str, i, i2);
        }

        public int hashCode() {
            return C0391i.m1459a(this.f1235a);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0497a)) {
                return false;
            }
            return this.f1235a.equals(((C0497a) obj).f1235a);
        }
    }
}
