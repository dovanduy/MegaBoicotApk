package android.support.p017v4.media;

import android.content.ComponentName;
import android.content.Context;
import android.media.browse.MediaBrowser;
import android.media.browse.MediaBrowser.ConnectionCallback;
import android.media.browse.MediaBrowser.MediaItem;
import android.media.browse.MediaBrowser.SubscriptionCallback;
import android.os.Bundle;
import java.util.List;

/* renamed from: android.support.v4.media.d */
/* compiled from: MediaBrowserCompatApi21 */
class C0477d {

    /* renamed from: android.support.v4.media.d$a */
    /* compiled from: MediaBrowserCompatApi21 */
    interface C0478a {
        /* renamed from: a */
        void mo1516a();

        /* renamed from: b */
        void mo1517b();

        /* renamed from: c */
        void mo1518c();
    }

    /* renamed from: android.support.v4.media.d$b */
    /* compiled from: MediaBrowserCompatApi21 */
    static class C0479b<T extends C0478a> extends ConnectionCallback {

        /* renamed from: a */
        protected final T f1230a;

        public C0479b(T t) {
            this.f1230a = t;
        }

        public void onConnected() {
            this.f1230a.mo1516a();
        }

        public void onConnectionSuspended() {
            this.f1230a.mo1517b();
        }

        public void onConnectionFailed() {
            this.f1230a.mo1518c();
        }
    }

    /* renamed from: android.support.v4.media.d$c */
    /* compiled from: MediaBrowserCompatApi21 */
    static class C0480c {
        /* renamed from: a */
        public static int m1789a(Object obj) {
            return ((MediaItem) obj).getFlags();
        }

        /* renamed from: b */
        public static Object m1790b(Object obj) {
            return ((MediaItem) obj).getDescription();
        }
    }

    /* renamed from: android.support.v4.media.d$d */
    /* compiled from: MediaBrowserCompatApi21 */
    interface C0481d {
        /* renamed from: a */
        void mo1555a(String str);

        /* renamed from: a */
        void mo1556a(String str, List<?> list);
    }

    /* renamed from: android.support.v4.media.d$e */
    /* compiled from: MediaBrowserCompatApi21 */
    static class C0482e<T extends C0481d> extends SubscriptionCallback {

        /* renamed from: a */
        protected final T f1231a;

        public C0482e(T t) {
            this.f1231a = t;
        }

        public void onChildrenLoaded(String str, List<MediaItem> list) {
            this.f1231a.mo1556a(str, list);
        }

        public void onError(String str) {
            this.f1231a.mo1555a(str);
        }
    }

    /* renamed from: a */
    public static Object m1780a(C0478a aVar) {
        return new C0479b(aVar);
    }

    /* renamed from: a */
    public static Object m1779a(Context context, ComponentName componentName, Object obj, Bundle bundle) {
        return new MediaBrowser(context, componentName, (ConnectionCallback) obj, bundle);
    }

    /* renamed from: a */
    public static void m1782a(Object obj) {
        ((MediaBrowser) obj).connect();
    }

    /* renamed from: b */
    public static void m1783b(Object obj) {
        ((MediaBrowser) obj).disconnect();
    }

    /* renamed from: c */
    public static Bundle m1784c(Object obj) {
        return ((MediaBrowser) obj).getExtras();
    }

    /* renamed from: d */
    public static Object m1785d(Object obj) {
        return ((MediaBrowser) obj).getSessionToken();
    }

    /* renamed from: a */
    public static Object m1781a(C0481d dVar) {
        return new C0482e(dVar);
    }
}
