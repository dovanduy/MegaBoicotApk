package android.support.p017v4.media.session;

import android.content.Context;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.IBinder.DeathRecipient;
import android.os.Message;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.support.p017v4.app.C0248d;
import android.support.p017v4.media.MediaMetadataCompat;
import android.support.p017v4.media.session.C0517a.C0518a;
import android.support.p017v4.media.session.C0520b.C0521a;
import android.support.p017v4.media.session.C0523c.C0524a;
import android.support.p017v4.media.session.MediaSessionCompat.QueueItem;
import android.support.p017v4.media.session.MediaSessionCompat.Token;
import android.util.Log;
import android.view.KeyEvent;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* renamed from: android.support.v4.media.session.MediaControllerCompat */
public final class MediaControllerCompat {

    /* renamed from: a */
    private final C0506b f1244a;

    /* renamed from: b */
    private final Token f1245b;

    /* renamed from: c */
    private final HashSet<C0502a> f1246c = new HashSet<>();

    /* renamed from: android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21 */
    static class MediaControllerImplApi21 implements C0506b {

        /* renamed from: a */
        protected final Object f1247a;

        /* renamed from: b */
        final Object f1248b = new Object();

        /* renamed from: c */
        final Token f1249c;

        /* renamed from: d */
        private final List<C0502a> f1250d = new ArrayList();

        /* renamed from: e */
        private HashMap<C0502a, C0501a> f1251e = new HashMap<>();

        /* renamed from: android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
        private static class ExtraBinderRequestResultReceiver extends ResultReceiver {

            /* renamed from: a */
            private WeakReference<MediaControllerImplApi21> f1252a;

            ExtraBinderRequestResultReceiver(MediaControllerImplApi21 mediaControllerImplApi21) {
                super(null);
                this.f1252a = new WeakReference<>(mediaControllerImplApi21);
            }

            /* access modifiers changed from: protected */
            public void onReceiveResult(int i, Bundle bundle) {
                MediaControllerImplApi21 mediaControllerImplApi21 = (MediaControllerImplApi21) this.f1252a.get();
                if (mediaControllerImplApi21 != null && bundle != null) {
                    synchronized (mediaControllerImplApi21.f1248b) {
                        mediaControllerImplApi21.f1249c.mo1735a(C0521a.m1971a(C0248d.m758a(bundle, "android.support.v4.media.session.EXTRA_BINDER")));
                        mediaControllerImplApi21.f1249c.mo1734a(bundle.getBundle("android.support.v4.media.session.SESSION_TOKEN2_BUNDLE"));
                        mediaControllerImplApi21.mo1681a();
                    }
                }
            }
        }

        /* renamed from: android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21$a */
        private static class C0501a extends C0505c {
            C0501a(C0502a aVar) {
                super(aVar);
            }

            /* renamed from: a */
            public void mo1685a() throws RemoteException {
                throw new AssertionError();
            }

            /* renamed from: a */
            public void mo1687a(MediaMetadataCompat mediaMetadataCompat) throws RemoteException {
                throw new AssertionError();
            }

            /* renamed from: a */
            public void mo1690a(List<QueueItem> list) throws RemoteException {
                throw new AssertionError();
            }

            /* renamed from: a */
            public void mo1689a(CharSequence charSequence) throws RemoteException {
                throw new AssertionError();
            }

            /* renamed from: a */
            public void mo1686a(Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }

            /* renamed from: a */
            public void mo1688a(ParcelableVolumeInfo parcelableVolumeInfo) throws RemoteException {
                throw new AssertionError();
            }
        }

        public MediaControllerImplApi21(Context context, Token token) throws RemoteException {
            this.f1249c = token;
            this.f1247a = C0523c.m2021a(context, this.f1249c.mo1733a());
            if (this.f1247a == null) {
                throw new RemoteException();
            } else if (this.f1249c.mo1736b() == null) {
                m1826b();
            }
        }

        /* renamed from: a */
        public boolean mo1683a(KeyEvent keyEvent) {
            return C0523c.m2024a(this.f1247a, keyEvent);
        }

        /* renamed from: a */
        public void mo1682a(String str, Bundle bundle, ResultReceiver resultReceiver) {
            C0523c.m2023a(this.f1247a, str, bundle, resultReceiver);
        }

        /* renamed from: b */
        private void m1826b() {
            mo1682a("android.support.v4.media.session.command.GET_EXTRA_BINDER", null, new ExtraBinderRequestResultReceiver(this));
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo1681a() {
            if (this.f1249c.mo1736b() != null) {
                for (C0502a aVar : this.f1250d) {
                    C0501a aVar2 = new C0501a(aVar);
                    this.f1251e.put(aVar, aVar2);
                    aVar.f1255c = aVar2;
                    try {
                        this.f1249c.mo1736b().mo1776a((C0517a) aVar2);
                        aVar.mo1693a(13, null, null);
                    } catch (RemoteException e) {
                        Log.e("MediaControllerCompat", "Dead object in registerCallback.", e);
                    }
                }
                this.f1250d.clear();
            }
        }
    }

    /* renamed from: android.support.v4.media.session.MediaControllerCompat$a */
    public static abstract class C0502a implements DeathRecipient {

        /* renamed from: a */
        final Object f1253a;

        /* renamed from: b */
        C0503a f1254b;

        /* renamed from: c */
        C0517a f1255c;

        /* renamed from: android.support.v4.media.session.MediaControllerCompat$a$a */
        private class C0503a extends Handler {

            /* renamed from: a */
            boolean f1256a;

            /* renamed from: b */
            final /* synthetic */ C0502a f1257b;

            public void handleMessage(Message message) {
                if (this.f1256a) {
                    switch (message.what) {
                        case 1:
                            Bundle data = message.getData();
                            MediaSessionCompat.m1872a(data);
                            this.f1257b.mo1699a((String) message.obj, data);
                            break;
                        case 2:
                            this.f1257b.mo1697a((PlaybackStateCompat) message.obj);
                            break;
                        case 3:
                            this.f1257b.mo1695a((MediaMetadataCompat) message.obj);
                            break;
                        case 4:
                            this.f1257b.mo1696a((C0510f) message.obj);
                            break;
                        case 5:
                            this.f1257b.mo1700a((List) message.obj);
                            break;
                        case 6:
                            this.f1257b.mo1698a((CharSequence) message.obj);
                            break;
                        case 7:
                            Bundle bundle = (Bundle) message.obj;
                            MediaSessionCompat.m1872a(bundle);
                            this.f1257b.mo1694a(bundle);
                            break;
                        case 8:
                            this.f1257b.mo1702b();
                            break;
                        case 9:
                            this.f1257b.mo1692a(((Integer) message.obj).intValue());
                            break;
                        case 11:
                            this.f1257b.mo1701a(((Boolean) message.obj).booleanValue());
                            break;
                        case 12:
                            this.f1257b.mo1703b(((Integer) message.obj).intValue());
                            break;
                        case 13:
                            this.f1257b.mo1691a();
                            break;
                    }
                }
            }
        }

        /* renamed from: android.support.v4.media.session.MediaControllerCompat$a$b */
        private static class C0504b implements C0524a {

            /* renamed from: a */
            private final WeakReference<C0502a> f1258a;

            C0504b(C0502a aVar) {
                this.f1258a = new WeakReference<>(aVar);
            }

            /* renamed from: a */
            public void mo1705a() {
                C0502a aVar = (C0502a) this.f1258a.get();
                if (aVar != null) {
                    aVar.mo1702b();
                }
            }

            /* renamed from: a */
            public void mo1710a(String str, Bundle bundle) {
                C0502a aVar = (C0502a) this.f1258a.get();
                if (aVar == null) {
                    return;
                }
                if (aVar.f1255c == null || VERSION.SDK_INT >= 23) {
                    aVar.mo1699a(str, bundle);
                }
            }

            /* renamed from: a */
            public void mo1709a(Object obj) {
                C0502a aVar = (C0502a) this.f1258a.get();
                if (aVar != null && aVar.f1255c == null) {
                    aVar.mo1697a(PlaybackStateCompat.m1889a(obj));
                }
            }

            /* renamed from: b */
            public void mo1712b(Object obj) {
                C0502a aVar = (C0502a) this.f1258a.get();
                if (aVar != null) {
                    aVar.mo1695a(MediaMetadataCompat.m1757a(obj));
                }
            }

            /* renamed from: a */
            public void mo1711a(List<?> list) {
                C0502a aVar = (C0502a) this.f1258a.get();
                if (aVar != null) {
                    aVar.mo1700a(QueueItem.m1874a(list));
                }
            }

            /* renamed from: a */
            public void mo1708a(CharSequence charSequence) {
                C0502a aVar = (C0502a) this.f1258a.get();
                if (aVar != null) {
                    aVar.mo1698a(charSequence);
                }
            }

            /* renamed from: a */
            public void mo1707a(Bundle bundle) {
                C0502a aVar = (C0502a) this.f1258a.get();
                if (aVar != null) {
                    aVar.mo1694a(bundle);
                }
            }

            /* renamed from: a */
            public void mo1706a(int i, int i2, int i3, int i4, int i5) {
                C0502a aVar = (C0502a) this.f1258a.get();
                if (aVar != null) {
                    C0510f fVar = new C0510f(i, i2, i3, i4, i5);
                    aVar.mo1696a(fVar);
                }
            }
        }

        /* renamed from: android.support.v4.media.session.MediaControllerCompat$a$c */
        private static class C0505c extends C0518a {

            /* renamed from: a */
            private final WeakReference<C0502a> f1259a;

            /* renamed from: a */
            public void mo1716a(boolean z) throws RemoteException {
            }

            C0505c(C0502a aVar) {
                this.f1259a = new WeakReference<>(aVar);
            }

            /* renamed from: a */
            public void mo1715a(String str, Bundle bundle) throws RemoteException {
                C0502a aVar = (C0502a) this.f1259a.get();
                if (aVar != null) {
                    aVar.mo1693a(1, str, bundle);
                }
            }

            /* renamed from: a */
            public void mo1685a() throws RemoteException {
                C0502a aVar = (C0502a) this.f1259a.get();
                if (aVar != null) {
                    aVar.mo1693a(8, null, null);
                }
            }

            /* renamed from: a */
            public void mo1714a(PlaybackStateCompat playbackStateCompat) throws RemoteException {
                C0502a aVar = (C0502a) this.f1259a.get();
                if (aVar != null) {
                    aVar.mo1693a(2, playbackStateCompat, null);
                }
            }

            /* renamed from: a */
            public void mo1687a(MediaMetadataCompat mediaMetadataCompat) throws RemoteException {
                C0502a aVar = (C0502a) this.f1259a.get();
                if (aVar != null) {
                    aVar.mo1693a(3, mediaMetadataCompat, null);
                }
            }

            /* renamed from: a */
            public void mo1690a(List<QueueItem> list) throws RemoteException {
                C0502a aVar = (C0502a) this.f1259a.get();
                if (aVar != null) {
                    aVar.mo1693a(5, list, null);
                }
            }

            /* renamed from: a */
            public void mo1689a(CharSequence charSequence) throws RemoteException {
                C0502a aVar = (C0502a) this.f1259a.get();
                if (aVar != null) {
                    aVar.mo1693a(6, charSequence, null);
                }
            }

            /* renamed from: b */
            public void mo1719b(boolean z) throws RemoteException {
                C0502a aVar = (C0502a) this.f1259a.get();
                if (aVar != null) {
                    aVar.mo1693a(11, Boolean.valueOf(z), null);
                }
            }

            /* renamed from: a */
            public void mo1713a(int i) throws RemoteException {
                C0502a aVar = (C0502a) this.f1259a.get();
                if (aVar != null) {
                    aVar.mo1693a(9, Integer.valueOf(i), null);
                }
            }

            /* renamed from: b */
            public void mo1718b(int i) throws RemoteException {
                C0502a aVar = (C0502a) this.f1259a.get();
                if (aVar != null) {
                    aVar.mo1693a(12, Integer.valueOf(i), null);
                }
            }

            /* renamed from: a */
            public void mo1686a(Bundle bundle) throws RemoteException {
                C0502a aVar = (C0502a) this.f1259a.get();
                if (aVar != null) {
                    aVar.mo1693a(7, bundle, null);
                }
            }

            /* renamed from: a */
            public void mo1688a(ParcelableVolumeInfo parcelableVolumeInfo) throws RemoteException {
                C0502a aVar = (C0502a) this.f1259a.get();
                if (aVar != null) {
                    aVar.mo1693a(4, parcelableVolumeInfo != null ? new C0510f(parcelableVolumeInfo.f1273a, parcelableVolumeInfo.f1274b, parcelableVolumeInfo.f1275c, parcelableVolumeInfo.f1276d, parcelableVolumeInfo.f1277e) : null, null);
                }
            }

            /* renamed from: b */
            public void mo1717b() throws RemoteException {
                C0502a aVar = (C0502a) this.f1259a.get();
                if (aVar != null) {
                    aVar.mo1693a(13, null, null);
                }
            }
        }

        /* renamed from: a */
        public void mo1691a() {
        }

        /* renamed from: a */
        public void mo1692a(int i) {
        }

        /* renamed from: a */
        public void mo1694a(Bundle bundle) {
        }

        /* renamed from: a */
        public void mo1695a(MediaMetadataCompat mediaMetadataCompat) {
        }

        /* renamed from: a */
        public void mo1696a(C0510f fVar) {
        }

        /* renamed from: a */
        public void mo1697a(PlaybackStateCompat playbackStateCompat) {
        }

        /* renamed from: a */
        public void mo1698a(CharSequence charSequence) {
        }

        /* renamed from: a */
        public void mo1699a(String str, Bundle bundle) {
        }

        /* renamed from: a */
        public void mo1700a(List<QueueItem> list) {
        }

        /* renamed from: a */
        public void mo1701a(boolean z) {
        }

        /* renamed from: b */
        public void mo1702b() {
        }

        /* renamed from: b */
        public void mo1703b(int i) {
        }

        public C0502a() {
            if (VERSION.SDK_INT >= 21) {
                this.f1253a = C0523c.m2022a(new C0504b(this));
                return;
            }
            C0505c cVar = new C0505c(this);
            this.f1255c = cVar;
            this.f1253a = cVar;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo1693a(int i, Object obj, Bundle bundle) {
            if (this.f1254b != null) {
                Message obtainMessage = this.f1254b.obtainMessage(i, obj);
                obtainMessage.setData(bundle);
                obtainMessage.sendToTarget();
            }
        }
    }

    /* renamed from: android.support.v4.media.session.MediaControllerCompat$b */
    interface C0506b {
        /* renamed from: a */
        boolean mo1683a(KeyEvent keyEvent);
    }

    /* renamed from: android.support.v4.media.session.MediaControllerCompat$c */
    static class C0507c extends MediaControllerImplApi21 {
        public C0507c(Context context, Token token) throws RemoteException {
            super(context, token);
        }
    }

    /* renamed from: android.support.v4.media.session.MediaControllerCompat$d */
    static class C0508d extends C0507c {
        public C0508d(Context context, Token token) throws RemoteException {
            super(context, token);
        }
    }

    /* renamed from: android.support.v4.media.session.MediaControllerCompat$e */
    static class C0509e implements C0506b {

        /* renamed from: a */
        private C0520b f1260a;

        public C0509e(Token token) {
            this.f1260a = C0521a.m1971a((IBinder) token.mo1733a());
        }

        /* renamed from: a */
        public boolean mo1683a(KeyEvent keyEvent) {
            if (keyEvent == null) {
                throw new IllegalArgumentException("event may not be null.");
            }
            try {
                this.f1260a.mo1781a(keyEvent);
            } catch (RemoteException e) {
                Log.e("MediaControllerCompat", "Dead object in dispatchMediaButtonEvent.", e);
            }
            return false;
        }
    }

    /* renamed from: android.support.v4.media.session.MediaControllerCompat$f */
    public static final class C0510f {

        /* renamed from: a */
        private final int f1261a;

        /* renamed from: b */
        private final int f1262b;

        /* renamed from: c */
        private final int f1263c;

        /* renamed from: d */
        private final int f1264d;

        /* renamed from: e */
        private final int f1265e;

        C0510f(int i, int i2, int i3, int i4, int i5) {
            this.f1261a = i;
            this.f1262b = i2;
            this.f1263c = i3;
            this.f1264d = i4;
            this.f1265e = i5;
        }
    }

    public MediaControllerCompat(Context context, Token token) throws RemoteException {
        if (token == null) {
            throw new IllegalArgumentException("sessionToken must not be null");
        }
        this.f1245b = token;
        if (VERSION.SDK_INT >= 24) {
            this.f1244a = new C0508d(context, token);
        } else if (VERSION.SDK_INT >= 23) {
            this.f1244a = new C0507c(context, token);
        } else if (VERSION.SDK_INT >= 21) {
            this.f1244a = new MediaControllerImplApi21(context, token);
        } else {
            this.f1244a = new C0509e(token);
        }
    }

    /* renamed from: a */
    public boolean mo1680a(KeyEvent keyEvent) {
        if (keyEvent != null) {
            return this.f1244a.mo1683a(keyEvent);
        }
        throw new IllegalArgumentException("KeyEvent may not be null");
    }
}
