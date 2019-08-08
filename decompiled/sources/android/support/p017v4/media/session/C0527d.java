package android.support.p017v4.media.session;

import android.media.session.MediaSession.QueueItem;
import android.media.session.MediaSession.Token;

/* renamed from: android.support.v4.media.session.d */
/* compiled from: MediaSessionCompatApi21 */
class C0527d {

    /* renamed from: android.support.v4.media.session.d$a */
    /* compiled from: MediaSessionCompatApi21 */
    static class C0528a {
        /* renamed from: a */
        public static Object m2037a(Object obj) {
            return ((QueueItem) obj).getDescription();
        }

        /* renamed from: b */
        public static long m2038b(Object obj) {
            return ((QueueItem) obj).getQueueId();
        }
    }

    /* renamed from: a */
    public static Object m2036a(Object obj) {
        if (obj instanceof Token) {
            return obj;
        }
        throw new IllegalArgumentException("token is not a valid MediaSession.Token object");
    }
}
