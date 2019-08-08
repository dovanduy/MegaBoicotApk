package android.support.p017v4.media;

import android.media.MediaDescription;
import android.media.MediaDescription.Builder;
import android.net.Uri;

/* renamed from: android.support.v4.media.h */
/* compiled from: MediaDescriptionCompatApi23 */
class C0489h {

    /* renamed from: android.support.v4.media.h$a */
    /* compiled from: MediaDescriptionCompatApi23 */
    static class C0490a {
        /* renamed from: a */
        public static void m1816a(Object obj, Uri uri) {
            ((Builder) obj).setMediaUri(uri);
        }
    }

    /* renamed from: a */
    public static Uri m1815a(Object obj) {
        return ((MediaDescription) obj).getMediaUri();
    }
}
