package android.support.p017v4.media;

import android.app.Service;
import android.os.Binder;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.IBinder.DeathRecipient;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.os.RemoteException;
import android.support.p017v4.app.C0248d;
import android.support.p017v4.media.C0492j.C0493a;
import android.support.p017v4.media.MediaBrowserCompat.MediaItem;
import android.support.p017v4.media.session.MediaSessionCompat;
import android.support.p017v4.media.session.MediaSessionCompat.Token;
import android.support.p017v4.p023d.C0376a;
import android.support.p017v4.p023d.C0392j;
import android.support.p017v4.p025os.ResultReceiver;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: android.support.v4.media.MediaBrowserServiceCompat */
public abstract class MediaBrowserServiceCompat extends Service {

    /* renamed from: a */
    static final boolean f1119a = Log.isLoggable("MBServiceCompat", 3);

    /* renamed from: b */
    final C0376a<IBinder, C0452b> f1120b = new C0376a<>();

    /* renamed from: c */
    C0452b f1121c;

    /* renamed from: d */
    final C0467g f1122d = new C0467g();

    /* renamed from: e */
    Token f1123e;

    /* renamed from: android.support.v4.media.MediaBrowserServiceCompat$a */
    public static final class C0451a {

        /* renamed from: a */
        private final String f1135a;

        /* renamed from: b */
        private final Bundle f1136b;

        /* renamed from: a */
        public String mo1581a() {
            return this.f1135a;
        }

        /* renamed from: b */
        public Bundle mo1582b() {
            return this.f1136b;
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserServiceCompat$b */
    private class C0452b implements DeathRecipient {

        /* renamed from: a */
        public final String f1137a;

        /* renamed from: b */
        public final int f1138b;

        /* renamed from: c */
        public final int f1139c;

        /* renamed from: d */
        public final C0493a f1140d;

        /* renamed from: e */
        public final Bundle f1141e;

        /* renamed from: f */
        public final C0465e f1142f;

        /* renamed from: g */
        public final HashMap<String, List<C0392j<IBinder, Bundle>>> f1143g = new HashMap<>();

        /* renamed from: h */
        public C0451a f1144h;

        C0452b(String str, int i, int i2, Bundle bundle, C0465e eVar) {
            this.f1137a = str;
            this.f1138b = i;
            this.f1139c = i2;
            this.f1140d = new C0493a(str, i, i2);
            this.f1141e = bundle;
            this.f1142f = eVar;
        }

        public void binderDied() {
            MediaBrowserServiceCompat.this.f1122d.post(new Runnable() {
                public void run() {
                    MediaBrowserServiceCompat.this.f1120b.remove(C0452b.this.f1142f.mo1608a());
                }
            });
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserServiceCompat$c */
    public static class C0454c<T> {

        /* renamed from: a */
        private final Object f1147a;

        /* renamed from: b */
        private boolean f1148b;

        /* renamed from: c */
        private boolean f1149c;

        /* renamed from: d */
        private boolean f1150d;

        /* renamed from: e */
        private int f1151e;

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo1575a(T t) {
        }

        C0454c(Object obj) {
            this.f1147a = obj;
        }

        /* renamed from: b */
        public void mo1588b(T t) {
            if (this.f1149c || this.f1150d) {
                StringBuilder sb = new StringBuilder();
                sb.append("sendResult() called when either sendResult() or sendError() had already been called for: ");
                sb.append(this.f1147a);
                throw new IllegalStateException(sb.toString());
            }
            this.f1149c = true;
            mo1575a(t);
        }

        /* renamed from: c */
        public void mo1589c(Bundle bundle) {
            if (this.f1149c || this.f1150d) {
                StringBuilder sb = new StringBuilder();
                sb.append("sendError() called when either sendResult() or sendError() had already been called for: ");
                sb.append(this.f1147a);
                throw new IllegalStateException(sb.toString());
            }
            this.f1150d = true;
            mo1580b(bundle);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo1586a() {
            return this.f1148b || this.f1149c || this.f1150d;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo1585a(int i) {
            this.f1151e = i;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public int mo1587b() {
            return this.f1151e;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo1580b(Bundle bundle) {
            StringBuilder sb = new StringBuilder();
            sb.append("It is not supported to send an error for ");
            sb.append(this.f1147a);
            throw new UnsupportedOperationException(sb.toString());
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserServiceCompat$d */
    private class C0455d {
        C0455d() {
        }

        /* renamed from: a */
        public void mo1592a(String str, int i, int i2, Bundle bundle, C0465e eVar) {
            if (!MediaBrowserServiceCompat.this.mo1570a(str, i2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Package/uid mismatch: uid=");
                sb.append(i2);
                sb.append(" package=");
                sb.append(str);
                throw new IllegalArgumentException(sb.toString());
            }
            C0467g gVar = MediaBrowserServiceCompat.this.f1122d;
            final C0465e eVar2 = eVar;
            final String str2 = str;
            final int i3 = i;
            final int i4 = i2;
            final Bundle bundle2 = bundle;
            C04561 r1 = new Runnable() {
                public void run() {
                    IBinder a = eVar2.mo1608a();
                    MediaBrowserServiceCompat.this.f1120b.remove(a);
                    C0452b bVar = new C0452b(str2, i3, i4, bundle2, eVar2);
                    MediaBrowserServiceCompat.this.f1121c = bVar;
                    bVar.f1144h = MediaBrowserServiceCompat.this.mo1559a(str2, i4, bundle2);
                    MediaBrowserServiceCompat.this.f1121c = null;
                    if (bVar.f1144h == null) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("No root for client ");
                        sb.append(str2);
                        sb.append(" from service ");
                        sb.append(getClass().getName());
                        Log.i("MBServiceCompat", sb.toString());
                        try {
                            eVar2.mo1611b();
                        } catch (RemoteException unused) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("Calling onConnectFailed() failed. Ignoring. pkg=");
                            sb2.append(str2);
                            Log.w("MBServiceCompat", sb2.toString());
                        }
                    } else {
                        try {
                            MediaBrowserServiceCompat.this.f1120b.put(a, bVar);
                            a.linkToDeath(bVar, 0);
                            if (MediaBrowserServiceCompat.this.f1123e != null) {
                                eVar2.mo1609a(bVar.f1144h.mo1581a(), MediaBrowserServiceCompat.this.f1123e, bVar.f1144h.mo1582b());
                            }
                        } catch (RemoteException unused2) {
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append("Calling onConnect() failed. Dropping client. pkg=");
                            sb3.append(str2);
                            Log.w("MBServiceCompat", sb3.toString());
                            MediaBrowserServiceCompat.this.f1120b.remove(a);
                        }
                    }
                }
            };
            gVar.mo1612a(r1);
        }

        /* renamed from: a */
        public void mo1590a(final C0465e eVar) {
            MediaBrowserServiceCompat.this.f1122d.mo1612a(new Runnable() {
                public void run() {
                    C0452b bVar = (C0452b) MediaBrowserServiceCompat.this.f1120b.remove(eVar.mo1608a());
                    if (bVar != null) {
                        bVar.f1142f.mo1608a().unlinkToDeath(bVar, 0);
                    }
                }
            });
        }

        /* renamed from: a */
        public void mo1594a(String str, IBinder iBinder, Bundle bundle, C0465e eVar) {
            C0467g gVar = MediaBrowserServiceCompat.this.f1122d;
            final C0465e eVar2 = eVar;
            final String str2 = str;
            final IBinder iBinder2 = iBinder;
            final Bundle bundle2 = bundle;
            C04583 r1 = new Runnable() {
                public void run() {
                    C0452b bVar = (C0452b) MediaBrowserServiceCompat.this.f1120b.get(eVar2.mo1608a());
                    if (bVar == null) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("addSubscription for callback that isn't registered id=");
                        sb.append(str2);
                        Log.w("MBServiceCompat", sb.toString());
                        return;
                    }
                    MediaBrowserServiceCompat.this.mo1566a(str2, bVar, iBinder2, bundle2);
                }
            };
            gVar.mo1612a(r1);
        }

        /* renamed from: a */
        public void mo1595a(final String str, final IBinder iBinder, final C0465e eVar) {
            MediaBrowserServiceCompat.this.f1122d.mo1612a(new Runnable() {
                public void run() {
                    C0452b bVar = (C0452b) MediaBrowserServiceCompat.this.f1120b.get(eVar.mo1608a());
                    if (bVar == null) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("removeSubscription for callback that isn't registered id=");
                        sb.append(str);
                        Log.w("MBServiceCompat", sb.toString());
                        return;
                    }
                    if (!MediaBrowserServiceCompat.this.mo1571a(str, bVar, iBinder)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("removeSubscription called for ");
                        sb2.append(str);
                        sb2.append(" which is not subscribed");
                        Log.w("MBServiceCompat", sb2.toString());
                    }
                }
            });
        }

        /* renamed from: a */
        public void mo1596a(final String str, final ResultReceiver resultReceiver, final C0465e eVar) {
            if (!TextUtils.isEmpty(str) && resultReceiver != null) {
                MediaBrowserServiceCompat.this.f1122d.mo1612a(new Runnable() {
                    public void run() {
                        C0452b bVar = (C0452b) MediaBrowserServiceCompat.this.f1120b.get(eVar.mo1608a());
                        if (bVar == null) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("getMediaItem for callback that isn't registered id=");
                            sb.append(str);
                            Log.w("MBServiceCompat", sb.toString());
                            return;
                        }
                        MediaBrowserServiceCompat.this.mo1567a(str, bVar, resultReceiver);
                    }
                });
            }
        }

        /* renamed from: a */
        public void mo1591a(C0465e eVar, String str, int i, int i2, Bundle bundle) {
            C0467g gVar = MediaBrowserServiceCompat.this.f1122d;
            final C0465e eVar2 = eVar;
            final String str2 = str;
            final int i3 = i;
            final int i4 = i2;
            final Bundle bundle2 = bundle;
            C04616 r1 = new Runnable() {
                public void run() {
                    IBinder a = eVar2.mo1608a();
                    MediaBrowserServiceCompat.this.f1120b.remove(a);
                    C0452b bVar = new C0452b(str2, i3, i4, bundle2, eVar2);
                    MediaBrowserServiceCompat.this.f1120b.put(a, bVar);
                    try {
                        a.linkToDeath(bVar, 0);
                    } catch (RemoteException unused) {
                        Log.w("MBServiceCompat", "IBinder is already dead.");
                    }
                }
            };
            gVar.mo1612a(r1);
        }

        /* renamed from: b */
        public void mo1597b(final C0465e eVar) {
            MediaBrowserServiceCompat.this.f1122d.mo1612a(new Runnable() {
                public void run() {
                    IBinder a = eVar.mo1608a();
                    C0452b bVar = (C0452b) MediaBrowserServiceCompat.this.f1120b.remove(a);
                    if (bVar != null) {
                        a.unlinkToDeath(bVar, 0);
                    }
                }
            });
        }

        /* renamed from: a */
        public void mo1593a(String str, Bundle bundle, ResultReceiver resultReceiver, C0465e eVar) {
            if (!TextUtils.isEmpty(str) && resultReceiver != null) {
                C0467g gVar = MediaBrowserServiceCompat.this.f1122d;
                final C0465e eVar2 = eVar;
                final String str2 = str;
                final Bundle bundle2 = bundle;
                final ResultReceiver resultReceiver2 = resultReceiver;
                C04638 r1 = new Runnable() {
                    public void run() {
                        C0452b bVar = (C0452b) MediaBrowserServiceCompat.this.f1120b.get(eVar2.mo1608a());
                        if (bVar == null) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("search for callback that isn't registered query=");
                            sb.append(str2);
                            Log.w("MBServiceCompat", sb.toString());
                            return;
                        }
                        MediaBrowserServiceCompat.this.mo1563a(str2, bundle2, bVar, resultReceiver2);
                    }
                };
                gVar.mo1612a(r1);
            }
        }

        /* renamed from: b */
        public void mo1598b(String str, Bundle bundle, ResultReceiver resultReceiver, C0465e eVar) {
            if (!TextUtils.isEmpty(str) && resultReceiver != null) {
                C0467g gVar = MediaBrowserServiceCompat.this.f1122d;
                final C0465e eVar2 = eVar;
                final String str2 = str;
                final Bundle bundle2 = bundle;
                final ResultReceiver resultReceiver2 = resultReceiver;
                C04649 r1 = new Runnable() {
                    public void run() {
                        C0452b bVar = (C0452b) MediaBrowserServiceCompat.this.f1120b.get(eVar2.mo1608a());
                        if (bVar == null) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("sendCustomAction for callback that isn't registered action=");
                            sb.append(str2);
                            sb.append(", extras=");
                            sb.append(bundle2);
                            Log.w("MBServiceCompat", sb.toString());
                            return;
                        }
                        MediaBrowserServiceCompat.this.mo1572b(str2, bundle2, bVar, resultReceiver2);
                    }
                };
                gVar.mo1612a(r1);
            }
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserServiceCompat$e */
    private interface C0465e {
        /* renamed from: a */
        IBinder mo1608a();

        /* renamed from: a */
        void mo1609a(String str, Token token, Bundle bundle) throws RemoteException;

        /* renamed from: a */
        void mo1610a(String str, List<MediaItem> list, Bundle bundle, Bundle bundle2) throws RemoteException;

        /* renamed from: b */
        void mo1611b() throws RemoteException;
    }

    /* renamed from: android.support.v4.media.MediaBrowserServiceCompat$f */
    private static class C0466f implements C0465e {

        /* renamed from: a */
        final Messenger f1192a;

        C0466f(Messenger messenger) {
            this.f1192a = messenger;
        }

        /* renamed from: a */
        public IBinder mo1608a() {
            return this.f1192a.getBinder();
        }

        /* renamed from: a */
        public void mo1609a(String str, Token token, Bundle bundle) throws RemoteException {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putInt("extra_service_version", 2);
            Bundle bundle2 = new Bundle();
            bundle2.putString("data_media_item_id", str);
            bundle2.putParcelable("data_media_session_token", token);
            bundle2.putBundle("data_root_hints", bundle);
            m1737a(1, bundle2);
        }

        /* renamed from: b */
        public void mo1611b() throws RemoteException {
            m1737a(2, null);
        }

        /* renamed from: a */
        public void mo1610a(String str, List<MediaItem> list, Bundle bundle, Bundle bundle2) throws RemoteException {
            Bundle bundle3 = new Bundle();
            bundle3.putString("data_media_item_id", str);
            bundle3.putBundle("data_options", bundle);
            bundle3.putBundle("data_notify_children_changed_options", bundle2);
            if (list != null) {
                bundle3.putParcelableArrayList("data_media_item_list", list instanceof ArrayList ? (ArrayList) list : new ArrayList(list));
            }
            m1737a(3, bundle3);
        }

        /* renamed from: a */
        private void m1737a(int i, Bundle bundle) throws RemoteException {
            Message obtain = Message.obtain();
            obtain.what = i;
            obtain.arg1 = 2;
            obtain.setData(bundle);
            this.f1192a.send(obtain);
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserServiceCompat$g */
    private final class C0467g extends Handler {

        /* renamed from: b */
        private final C0455d f1194b = new C0455d();

        C0467g() {
        }

        public void handleMessage(Message message) {
            Bundle data = message.getData();
            switch (message.what) {
                case 1:
                    Bundle bundle = data.getBundle("data_root_hints");
                    MediaSessionCompat.m1872a(bundle);
                    this.f1194b.mo1592a(data.getString("data_package_name"), data.getInt("data_calling_pid"), data.getInt("data_calling_uid"), bundle, (C0465e) new C0466f(message.replyTo));
                    return;
                case 2:
                    this.f1194b.mo1590a(new C0466f(message.replyTo));
                    return;
                case 3:
                    Bundle bundle2 = data.getBundle("data_options");
                    MediaSessionCompat.m1872a(bundle2);
                    this.f1194b.mo1594a(data.getString("data_media_item_id"), C0248d.m758a(data, "data_callback_token"), bundle2, (C0465e) new C0466f(message.replyTo));
                    return;
                case 4:
                    this.f1194b.mo1595a(data.getString("data_media_item_id"), C0248d.m758a(data, "data_callback_token"), (C0465e) new C0466f(message.replyTo));
                    return;
                case 5:
                    this.f1194b.mo1596a(data.getString("data_media_item_id"), (ResultReceiver) data.getParcelable("data_result_receiver"), (C0465e) new C0466f(message.replyTo));
                    return;
                case 6:
                    Bundle bundle3 = data.getBundle("data_root_hints");
                    MediaSessionCompat.m1872a(bundle3);
                    this.f1194b.mo1591a((C0465e) new C0466f(message.replyTo), data.getString("data_package_name"), data.getInt("data_calling_pid"), data.getInt("data_calling_uid"), bundle3);
                    return;
                case 7:
                    this.f1194b.mo1597b(new C0466f(message.replyTo));
                    return;
                case 8:
                    Bundle bundle4 = data.getBundle("data_search_extras");
                    MediaSessionCompat.m1872a(bundle4);
                    this.f1194b.mo1593a(data.getString("data_search_query"), bundle4, (ResultReceiver) data.getParcelable("data_result_receiver"), (C0465e) new C0466f(message.replyTo));
                    return;
                case 9:
                    Bundle bundle5 = data.getBundle("data_custom_action_extras");
                    MediaSessionCompat.m1872a(bundle5);
                    this.f1194b.mo1598b(data.getString("data_custom_action"), bundle5, (ResultReceiver) data.getParcelable("data_result_receiver"), new C0466f(message.replyTo));
                    return;
                default:
                    StringBuilder sb = new StringBuilder();
                    sb.append("Unhandled message: ");
                    sb.append(message);
                    sb.append("\n  Service version: ");
                    sb.append(2);
                    sb.append("\n  Client version: ");
                    sb.append(message.arg1);
                    Log.w("MBServiceCompat", sb.toString());
                    return;
            }
        }

        public boolean sendMessageAtTime(Message message, long j) {
            Bundle data = message.getData();
            data.setClassLoader(MediaBrowserCompat.class.getClassLoader());
            data.putInt("data_calling_uid", Binder.getCallingUid());
            data.putInt("data_calling_pid", Binder.getCallingPid());
            return super.sendMessageAtTime(message, j);
        }

        /* renamed from: a */
        public void mo1612a(Runnable runnable) {
            if (Thread.currentThread() == getLooper().getThread()) {
                runnable.run();
            } else {
                post(runnable);
            }
        }
    }

    /* renamed from: a */
    public abstract C0451a mo1559a(String str, int i, Bundle bundle);

    /* renamed from: a */
    public void mo1561a(String str) {
    }

    /* renamed from: a */
    public void mo1562a(String str, Bundle bundle) {
    }

    /* renamed from: a */
    public abstract void mo1568a(String str, C0454c<List<MediaItem>> cVar);

    /* renamed from: a */
    public void mo1569a(String str, C0454c<List<MediaItem>> cVar, Bundle bundle) {
        cVar.mo1585a(1);
        mo1568a(str, cVar);
    }

    /* renamed from: b */
    public void mo1574b(String str, C0454c<MediaItem> cVar) {
        cVar.mo1585a(2);
        cVar.mo1588b(null);
    }

    /* renamed from: a */
    public void mo1564a(String str, Bundle bundle, C0454c<List<MediaItem>> cVar) {
        cVar.mo1585a(4);
        cVar.mo1588b(null);
    }

    /* renamed from: b */
    public void mo1573b(String str, Bundle bundle, C0454c<Bundle> cVar) {
        cVar.mo1589c(null);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo1570a(String str, int i) {
        if (str == null) {
            return false;
        }
        for (String equals : getPackageManager().getPackagesForUid(i)) {
            if (equals.equals(str)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo1566a(String str, C0452b bVar, IBinder iBinder, Bundle bundle) {
        List<C0392j> list = (List) bVar.f1143g.get(str);
        if (list == null) {
            list = new ArrayList<>();
        }
        for (C0392j jVar : list) {
            if (iBinder == jVar.f993a && C0486f.m1796a(bundle, (Bundle) jVar.f994b)) {
                return;
            }
        }
        list.add(new C0392j(iBinder, bundle));
        bVar.f1143g.put(str, list);
        mo1565a(str, bVar, bundle, (Bundle) null);
        this.f1121c = bVar;
        mo1562a(str, bundle);
        this.f1121c = null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo1571a(String str, C0452b bVar, IBinder iBinder) {
        boolean z = false;
        if (iBinder == null) {
            try {
                if (bVar.f1143g.remove(str) != null) {
                    z = true;
                }
            } catch (Throwable th) {
                this.f1121c = bVar;
                mo1561a(str);
                this.f1121c = null;
                throw th;
            }
        } else {
            List list = (List) bVar.f1143g.get(str);
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (iBinder == ((C0392j) it.next()).f993a) {
                        it.remove();
                        z = true;
                    }
                }
                if (list.size() == 0) {
                    bVar.f1143g.remove(str);
                }
            }
        }
        this.f1121c = bVar;
        mo1561a(str);
        this.f1121c = null;
        return z;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo1565a(String str, C0452b bVar, Bundle bundle, Bundle bundle2) {
        final C0452b bVar2 = bVar;
        final String str2 = str;
        final Bundle bundle3 = bundle;
        final Bundle bundle4 = bundle2;
        C04471 r0 = new C0454c<List<MediaItem>>(str) {
            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public void mo1575a(List<MediaItem> list) {
                if (MediaBrowserServiceCompat.this.f1120b.get(bVar2.f1142f.mo1608a()) != bVar2) {
                    if (MediaBrowserServiceCompat.f1119a) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Not sending onLoadChildren result for connection that has been disconnected. pkg=");
                        sb.append(bVar2.f1137a);
                        sb.append(" id=");
                        sb.append(str2);
                        Log.d("MBServiceCompat", sb.toString());
                    }
                    return;
                }
                if ((mo1587b() & 1) != 0) {
                    list = MediaBrowserServiceCompat.this.mo1560a(list, bundle3);
                }
                try {
                    bVar2.f1142f.mo1610a(str2, list, bundle3, bundle4);
                } catch (RemoteException unused) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Calling onLoadChildren() failed for id=");
                    sb2.append(str2);
                    sb2.append(" package=");
                    sb2.append(bVar2.f1137a);
                    Log.w("MBServiceCompat", sb2.toString());
                }
            }
        };
        this.f1121c = bVar;
        if (bundle == null) {
            mo1568a(str, (C0454c<List<MediaItem>>) r0);
        } else {
            mo1569a(str, (C0454c<List<MediaItem>>) r0, bundle);
        }
        this.f1121c = null;
        if (!r0.mo1586a()) {
            StringBuilder sb = new StringBuilder();
            sb.append("onLoadChildren must call detach() or sendResult() before returning for package=");
            sb.append(bVar.f1137a);
            sb.append(" id=");
            sb.append(str);
            throw new IllegalStateException(sb.toString());
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public List<MediaItem> mo1560a(List<MediaItem> list, Bundle bundle) {
        if (list == null) {
            return null;
        }
        int i = bundle.getInt("android.media.browse.extra.PAGE", -1);
        int i2 = bundle.getInt("android.media.browse.extra.PAGE_SIZE", -1);
        if (i == -1 && i2 == -1) {
            return list;
        }
        int i3 = i2 * i;
        int i4 = i3 + i2;
        if (i < 0 || i2 < 1 || i3 >= list.size()) {
            return Collections.emptyList();
        }
        if (i4 > list.size()) {
            i4 = list.size();
        }
        return list.subList(i3, i4);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo1567a(String str, C0452b bVar, final ResultReceiver resultReceiver) {
        C04482 r0 = new C0454c<MediaItem>(str) {
            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public void mo1575a(MediaItem mediaItem) {
                if ((mo1587b() & 2) != 0) {
                    resultReceiver.mo1828b(-1, null);
                    return;
                }
                Bundle bundle = new Bundle();
                bundle.putParcelable("media_item", mediaItem);
                resultReceiver.mo1828b(0, bundle);
            }
        };
        this.f1121c = bVar;
        mo1574b(str, r0);
        this.f1121c = null;
        if (!r0.mo1586a()) {
            StringBuilder sb = new StringBuilder();
            sb.append("onLoadItem must call detach() or sendResult() before returning for id=");
            sb.append(str);
            throw new IllegalStateException(sb.toString());
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo1563a(String str, Bundle bundle, C0452b bVar, final ResultReceiver resultReceiver) {
        C04493 r0 = new C0454c<List<MediaItem>>(str) {
            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public void mo1575a(List<MediaItem> list) {
                if ((mo1587b() & 4) != 0 || list == null) {
                    resultReceiver.mo1828b(-1, null);
                    return;
                }
                Bundle bundle = new Bundle();
                bundle.putParcelableArray("search_results", (Parcelable[]) list.toArray(new MediaItem[0]));
                resultReceiver.mo1828b(0, bundle);
            }
        };
        this.f1121c = bVar;
        mo1564a(str, bundle, (C0454c<List<MediaItem>>) r0);
        this.f1121c = null;
        if (!r0.mo1586a()) {
            StringBuilder sb = new StringBuilder();
            sb.append("onSearch must call detach() or sendResult() before returning for query=");
            sb.append(str);
            throw new IllegalStateException(sb.toString());
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo1572b(String str, Bundle bundle, C0452b bVar, final ResultReceiver resultReceiver) {
        C04504 r0 = new C0454c<Bundle>(str) {
            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public void mo1575a(Bundle bundle) {
                resultReceiver.mo1828b(0, bundle);
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: b */
            public void mo1580b(Bundle bundle) {
                resultReceiver.mo1828b(-1, bundle);
            }
        };
        this.f1121c = bVar;
        mo1573b(str, bundle, r0);
        this.f1121c = null;
        if (!r0.mo1586a()) {
            StringBuilder sb = new StringBuilder();
            sb.append("onCustomAction must call detach() or sendResult() or sendError() before returning for action=");
            sb.append(str);
            sb.append(" extras=");
            sb.append(bundle);
            throw new IllegalStateException(sb.toString());
        }
    }
}
