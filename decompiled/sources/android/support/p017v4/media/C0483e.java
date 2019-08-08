package android.support.p017v4.media;

import android.media.browse.MediaBrowser.MediaItem;
import android.os.Bundle;
import android.support.p017v4.media.session.MediaSessionCompat;
import java.util.List;

/* renamed from: android.support.v4.media.e */
/* compiled from: MediaBrowserCompatApi26 */
class C0483e {

    /* renamed from: android.support.v4.media.e$a */
    /* compiled from: MediaBrowserCompatApi26 */
    interface C0484a extends C0481d {
        /* renamed from: a */
        void mo1557a(String str, Bundle bundle);

        /* renamed from: a */
        void mo1558a(String str, List<?> list, Bundle bundle);
    }

    /* renamed from: android.support.v4.media.e$b */
    /* compiled from: MediaBrowserCompatApi26 */
    static class C0485b<T extends C0484a> extends C0482e<T> {
        C0485b(T t) {
            super(t);
        }

        public void onChildrenLoaded(String str, List<MediaItem> list, Bundle bundle) {
            MediaSessionCompat.m1872a(bundle);
            ((C0484a) this.f1231a).mo1558a(str, list, bundle);
        }

        public void onError(String str, Bundle bundle) {
            MediaSessionCompat.m1872a(bundle);
            ((C0484a) this.f1231a).mo1557a(str, bundle);
        }
    }

    /* renamed from: a */
    static Object m1793a(C0484a aVar) {
        return new C0485b(aVar);
    }
}
