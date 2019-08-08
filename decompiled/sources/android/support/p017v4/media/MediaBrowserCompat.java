package android.support.p017v4.media;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.BadParcelableException;
import android.os.Binder;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.os.RemoteException;
import android.support.p017v4.app.C0248d;
import android.support.p017v4.media.session.C0520b;
import android.support.p017v4.media.session.C0520b.C0521a;
import android.support.p017v4.media.session.MediaSessionCompat;
import android.support.p017v4.media.session.MediaSessionCompat.Token;
import android.support.p017v4.p023d.C0376a;
import android.support.p017v4.p025os.ResultReceiver;
import android.text.TextUtils;
import android.util.Log;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map.Entry;

/* renamed from: android.support.v4.media.MediaBrowserCompat */
public final class MediaBrowserCompat {

    /* renamed from: a */
    static final boolean f1061a = Log.isLoggable("MediaBrowserCompat", 3);

    /* renamed from: b */
    private final C0430e f1062b;

    /* renamed from: android.support.v4.media.MediaBrowserCompat$CustomActionResultReceiver */
    private static class CustomActionResultReceiver extends ResultReceiver {

        /* renamed from: d */
        private final String f1063d;

        /* renamed from: e */
        private final Bundle f1064e;

        /* renamed from: f */
        private final C0428c f1065f;

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo1499a(int i, Bundle bundle) {
            if (this.f1065f != null) {
                MediaSessionCompat.m1872a(bundle);
                switch (i) {
                    case -1:
                        this.f1065f.mo1521c(this.f1063d, this.f1064e, bundle);
                        break;
                    case 0:
                        this.f1065f.mo1520b(this.f1063d, this.f1064e, bundle);
                        break;
                    case 1:
                        this.f1065f.mo1519a(this.f1063d, this.f1064e, bundle);
                        break;
                    default:
                        StringBuilder sb = new StringBuilder();
                        sb.append("Unknown result code: ");
                        sb.append(i);
                        sb.append(" (extras=");
                        sb.append(this.f1064e);
                        sb.append(", resultData=");
                        sb.append(bundle);
                        sb.append(")");
                        Log.w("MediaBrowserCompat", sb.toString());
                        break;
                }
            }
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$ItemReceiver */
    private static class ItemReceiver extends ResultReceiver {

        /* renamed from: d */
        private final String f1066d;

        /* renamed from: e */
        private final C0429d f1067e;

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo1499a(int i, Bundle bundle) {
            MediaSessionCompat.m1872a(bundle);
            if (i != 0 || bundle == null || !bundle.containsKey("media_item")) {
                this.f1067e.mo1523a(this.f1066d);
                return;
            }
            Parcelable parcelable = bundle.getParcelable("media_item");
            if (parcelable == null || (parcelable instanceof MediaItem)) {
                this.f1067e.mo1522a((MediaItem) parcelable);
            } else {
                this.f1067e.mo1523a(this.f1066d);
            }
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$MediaItem */
    public static class MediaItem implements Parcelable {
        public static final Creator<MediaItem> CREATOR = new Creator<MediaItem>() {
            /* renamed from: a */
            public MediaItem createFromParcel(Parcel parcel) {
                return new MediaItem(parcel);
            }

            /* renamed from: a */
            public MediaItem[] newArray(int i) {
                return new MediaItem[i];
            }
        };

        /* renamed from: a */
        private final int f1068a;

        /* renamed from: b */
        private final MediaDescriptionCompat f1069b;

        public int describeContents() {
            return 0;
        }

        /* renamed from: a */
        public static MediaItem m1621a(Object obj) {
            if (obj == null || VERSION.SDK_INT < 21) {
                return null;
            }
            return new MediaItem(MediaDescriptionCompat.m1743a(C0480c.m1790b(obj)), C0480c.m1789a(obj));
        }

        /* renamed from: a */
        public static List<MediaItem> m1622a(List<?> list) {
            if (list == null || VERSION.SDK_INT < 21) {
                return null;
            }
            ArrayList arrayList = new ArrayList(list.size());
            for (Object a : list) {
                arrayList.add(m1621a(a));
            }
            return arrayList;
        }

        public MediaItem(MediaDescriptionCompat mediaDescriptionCompat, int i) {
            if (mediaDescriptionCompat == null) {
                throw new IllegalArgumentException("description cannot be null");
            } else if (TextUtils.isEmpty(mediaDescriptionCompat.mo1615a())) {
                throw new IllegalArgumentException("description must have a non-empty media id");
            } else {
                this.f1068a = i;
                this.f1069b = mediaDescriptionCompat;
            }
        }

        MediaItem(Parcel parcel) {
            this.f1068a = parcel.readInt();
            this.f1069b = (MediaDescriptionCompat) MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f1068a);
            this.f1069b.writeToParcel(parcel, i);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("MediaItem{");
            sb.append("mFlags=");
            sb.append(this.f1068a);
            sb.append(", mDescription=");
            sb.append(this.f1069b);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$SearchResultReceiver */
    private static class SearchResultReceiver extends ResultReceiver {

        /* renamed from: d */
        private final String f1070d;

        /* renamed from: e */
        private final Bundle f1071e;

        /* renamed from: f */
        private final C0441k f1072f;

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo1499a(int i, Bundle bundle) {
            MediaSessionCompat.m1872a(bundle);
            if (i != 0 || bundle == null || !bundle.containsKey("search_results")) {
                this.f1072f.mo1540a(this.f1070d, this.f1071e);
                return;
            }
            Parcelable[] parcelableArray = bundle.getParcelableArray("search_results");
            ArrayList arrayList = null;
            if (parcelableArray != null) {
                arrayList = new ArrayList();
                for (Parcelable parcelable : parcelableArray) {
                    arrayList.add((MediaItem) parcelable);
                }
            }
            this.f1072f.mo1541a(this.f1070d, this.f1071e, arrayList);
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$a */
    private static class C0424a extends Handler {

        /* renamed from: a */
        private final WeakReference<C0440j> f1073a;

        /* renamed from: b */
        private WeakReference<Messenger> f1074b;

        C0424a(C0440j jVar) {
            this.f1073a = new WeakReference<>(jVar);
        }

        public void handleMessage(Message message) {
            if (this.f1074b != null && this.f1074b.get() != null && this.f1073a.get() != null) {
                Bundle data = message.getData();
                MediaSessionCompat.m1872a(data);
                C0440j jVar = (C0440j) this.f1073a.get();
                Messenger messenger = (Messenger) this.f1074b.get();
                try {
                    switch (message.what) {
                        case 1:
                            Bundle bundle = data.getBundle("data_root_hints");
                            MediaSessionCompat.m1872a(bundle);
                            jVar.mo1528a(messenger, data.getString("data_media_item_id"), (Token) data.getParcelable("data_media_session_token"), bundle);
                            break;
                        case 2:
                            jVar.mo1527a(messenger);
                            break;
                        case 3:
                            Bundle bundle2 = data.getBundle("data_options");
                            MediaSessionCompat.m1872a(bundle2);
                            Bundle bundle3 = data.getBundle("data_notify_children_changed_options");
                            MediaSessionCompat.m1872a(bundle3);
                            jVar.mo1529a(messenger, data.getString("data_media_item_id"), data.getParcelableArrayList("data_media_item_list"), bundle2, bundle3);
                            break;
                        default:
                            String str = "MediaBrowserCompat";
                            StringBuilder sb = new StringBuilder();
                            sb.append("Unhandled message: ");
                            sb.append(message);
                            sb.append("\n  Client version: ");
                            sb.append(1);
                            sb.append("\n  Service version: ");
                            sb.append(message.arg1);
                            Log.w(str, sb.toString());
                            break;
                    }
                } catch (BadParcelableException unused) {
                    Log.e("MediaBrowserCompat", "Could not unparcel the data.");
                    if (message.what == 1) {
                        jVar.mo1527a(messenger);
                    }
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo1507a(Messenger messenger) {
            this.f1074b = new WeakReference<>(messenger);
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$b */
    public static class C0425b {

        /* renamed from: a */
        final Object f1075a;

        /* renamed from: b */
        C0426a f1076b;

        /* renamed from: android.support.v4.media.MediaBrowserCompat$b$a */
        interface C0426a {
            /* renamed from: a */
            void mo1513a();

            /* renamed from: b */
            void mo1514b();

            /* renamed from: c */
            void mo1515c();
        }

        /* renamed from: android.support.v4.media.MediaBrowserCompat$b$b */
        private class C0427b implements C0478a {
            C0427b() {
            }

            /* renamed from: a */
            public void mo1516a() {
                if (C0425b.this.f1076b != null) {
                    C0425b.this.f1076b.mo1513a();
                }
                C0425b.this.mo1509a();
            }

            /* renamed from: b */
            public void mo1517b() {
                if (C0425b.this.f1076b != null) {
                    C0425b.this.f1076b.mo1514b();
                }
                C0425b.this.mo1511b();
            }

            /* renamed from: c */
            public void mo1518c() {
                if (C0425b.this.f1076b != null) {
                    C0425b.this.f1076b.mo1515c();
                }
                C0425b.this.mo1512c();
            }
        }

        /* renamed from: a */
        public void mo1509a() {
        }

        /* renamed from: b */
        public void mo1511b() {
        }

        /* renamed from: c */
        public void mo1512c() {
        }

        public C0425b() {
            if (VERSION.SDK_INT >= 21) {
                this.f1075a = C0477d.m1780a((C0478a) new C0427b());
            } else {
                this.f1075a = null;
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo1510a(C0426a aVar) {
            this.f1076b = aVar;
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$c */
    public static abstract class C0428c {
        /* renamed from: a */
        public void mo1519a(String str, Bundle bundle, Bundle bundle2) {
        }

        /* renamed from: b */
        public void mo1520b(String str, Bundle bundle, Bundle bundle2) {
        }

        /* renamed from: c */
        public void mo1521c(String str, Bundle bundle, Bundle bundle2) {
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$d */
    public static abstract class C0429d {
        /* renamed from: a */
        public void mo1522a(MediaItem mediaItem) {
        }

        /* renamed from: a */
        public void mo1523a(String str) {
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$e */
    interface C0430e {
        /* renamed from: d */
        void mo1524d();

        /* renamed from: e */
        void mo1525e();

        /* renamed from: f */
        Token mo1526f();
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$f */
    static class C0431f implements C0426a, C0430e, C0440j {

        /* renamed from: a */
        final Context f1078a;

        /* renamed from: b */
        protected final Object f1079b;

        /* renamed from: c */
        protected final Bundle f1080c;

        /* renamed from: d */
        protected final C0424a f1081d = new C0424a(this);

        /* renamed from: e */
        protected int f1082e;

        /* renamed from: f */
        protected C0442l f1083f;

        /* renamed from: g */
        protected Messenger f1084g;

        /* renamed from: h */
        private final C0376a<String, C0443m> f1085h = new C0376a<>();

        /* renamed from: i */
        private Token f1086i;

        /* renamed from: j */
        private Bundle f1087j;

        /* renamed from: a */
        public void mo1527a(Messenger messenger) {
        }

        /* renamed from: a */
        public void mo1528a(Messenger messenger, String str, Token token, Bundle bundle) {
        }

        /* renamed from: c */
        public void mo1515c() {
        }

        C0431f(Context context, ComponentName componentName, C0425b bVar, Bundle bundle) {
            this.f1078a = context;
            this.f1080c = bundle != null ? new Bundle(bundle) : new Bundle();
            this.f1080c.putInt("extra_client_version", 1);
            bVar.mo1510a(this);
            this.f1079b = C0477d.m1779a(context, componentName, bVar.f1075a, this.f1080c);
        }

        /* renamed from: d */
        public void mo1524d() {
            C0477d.m1782a(this.f1079b);
        }

        /* renamed from: e */
        public void mo1525e() {
            if (!(this.f1083f == null || this.f1084g == null)) {
                try {
                    this.f1083f.mo1546b(this.f1084g);
                } catch (RemoteException unused) {
                    Log.i("MediaBrowserCompat", "Remote error unregistering client messenger.");
                }
            }
            C0477d.m1783b(this.f1079b);
        }

        /* renamed from: f */
        public Token mo1526f() {
            if (this.f1086i == null) {
                this.f1086i = Token.m1879a(C0477d.m1785d(this.f1079b));
            }
            return this.f1086i;
        }

        /* renamed from: a */
        public void mo1513a() {
            Bundle c = C0477d.m1784c(this.f1079b);
            if (c != null) {
                this.f1082e = c.getInt("extra_service_version", 0);
                IBinder a = C0248d.m758a(c, "extra_messenger");
                if (a != null) {
                    this.f1083f = new C0442l(a, this.f1080c);
                    this.f1084g = new Messenger(this.f1081d);
                    this.f1081d.mo1507a(this.f1084g);
                    try {
                        this.f1083f.mo1545b(this.f1078a, this.f1084g);
                    } catch (RemoteException unused) {
                        Log.i("MediaBrowserCompat", "Remote error registering client messenger.");
                    }
                }
                C0520b a2 = C0521a.m1971a(C0248d.m758a(c, "extra_session_binder"));
                if (a2 != null) {
                    this.f1086i = Token.m1880a(C0477d.m1785d(this.f1079b), a2);
                }
            }
        }

        /* renamed from: b */
        public void mo1514b() {
            this.f1083f = null;
            this.f1084g = null;
            this.f1086i = null;
            this.f1081d.mo1507a(null);
        }

        /* renamed from: a */
        public void mo1529a(Messenger messenger, String str, List list, Bundle bundle, Bundle bundle2) {
            if (this.f1084g == messenger) {
                C0443m mVar = (C0443m) this.f1085h.get(str);
                if (mVar == null) {
                    if (MediaBrowserCompat.f1061a) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("onLoadChildren for id that isn't subscribed id=");
                        sb.append(str);
                        Log.d("MediaBrowserCompat", sb.toString());
                    }
                    return;
                }
                C0444n a = mVar.mo1547a(bundle);
                if (a != null) {
                    if (bundle == null) {
                        if (list == null) {
                            a.mo1550a(str);
                        } else {
                            this.f1087j = bundle2;
                            a.mo1552a(str, list);
                            this.f1087j = null;
                        }
                    } else if (list == null) {
                        a.mo1551a(str, bundle);
                    } else {
                        this.f1087j = bundle2;
                        a.mo1553a(str, list, bundle);
                        this.f1087j = null;
                    }
                }
            }
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$g */
    static class C0432g extends C0431f {
        C0432g(Context context, ComponentName componentName, C0425b bVar, Bundle bundle) {
            super(context, componentName, bVar, bundle);
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$h */
    static class C0433h extends C0432g {
        C0433h(Context context, ComponentName componentName, C0425b bVar, Bundle bundle) {
            super(context, componentName, bVar, bundle);
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$i */
    static class C0434i implements C0430e, C0440j {

        /* renamed from: a */
        final Context f1088a;

        /* renamed from: b */
        final ComponentName f1089b;

        /* renamed from: c */
        final C0425b f1090c;

        /* renamed from: d */
        final Bundle f1091d;

        /* renamed from: e */
        final C0424a f1092e = new C0424a(this);

        /* renamed from: f */
        int f1093f = 1;

        /* renamed from: g */
        C0437a f1094g;

        /* renamed from: h */
        C0442l f1095h;

        /* renamed from: i */
        Messenger f1096i;

        /* renamed from: j */
        private final C0376a<String, C0443m> f1097j = new C0376a<>();

        /* renamed from: k */
        private String f1098k;

        /* renamed from: l */
        private Token f1099l;

        /* renamed from: m */
        private Bundle f1100m;

        /* renamed from: n */
        private Bundle f1101n;

        /* renamed from: android.support.v4.media.MediaBrowserCompat$i$a */
        private class C0437a implements ServiceConnection {
            C0437a() {
            }

            public void onServiceConnected(final ComponentName componentName, final IBinder iBinder) {
                m1665a((Runnable) new Runnable() {
                    public void run() {
                        if (MediaBrowserCompat.f1061a) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("MediaServiceConnection.onServiceConnected name=");
                            sb.append(componentName);
                            sb.append(" binder=");
                            sb.append(iBinder);
                            Log.d("MediaBrowserCompat", sb.toString());
                            C0434i.this.mo1532c();
                        }
                        if (C0437a.this.mo1535a("onServiceConnected")) {
                            C0434i.this.f1095h = new C0442l(iBinder, C0434i.this.f1091d);
                            C0434i.this.f1096i = new Messenger(C0434i.this.f1092e);
                            C0434i.this.f1092e.mo1507a(C0434i.this.f1096i);
                            C0434i.this.f1093f = 2;
                            try {
                                if (MediaBrowserCompat.f1061a) {
                                    Log.d("MediaBrowserCompat", "ServiceCallbacks.onConnect...");
                                    C0434i.this.mo1532c();
                                }
                                C0434i.this.f1095h.mo1542a(C0434i.this.f1088a, C0434i.this.f1096i);
                            } catch (RemoteException unused) {
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append("RemoteException during connect for ");
                                sb2.append(C0434i.this.f1089b);
                                Log.w("MediaBrowserCompat", sb2.toString());
                                if (MediaBrowserCompat.f1061a) {
                                    Log.d("MediaBrowserCompat", "ServiceCallbacks.onConnect...");
                                    C0434i.this.mo1532c();
                                }
                            }
                        }
                    }
                });
            }

            public void onServiceDisconnected(final ComponentName componentName) {
                m1665a((Runnable) new Runnable() {
                    public void run() {
                        if (MediaBrowserCompat.f1061a) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("MediaServiceConnection.onServiceDisconnected name=");
                            sb.append(componentName);
                            sb.append(" this=");
                            sb.append(this);
                            sb.append(" mServiceConnection=");
                            sb.append(C0434i.this.f1094g);
                            Log.d("MediaBrowserCompat", sb.toString());
                            C0434i.this.mo1532c();
                        }
                        if (C0437a.this.mo1535a("onServiceDisconnected")) {
                            C0434i.this.f1095h = null;
                            C0434i.this.f1096i = null;
                            C0434i.this.f1092e.mo1507a(null);
                            C0434i.this.f1093f = 4;
                            C0434i.this.f1090c.mo1511b();
                        }
                    }
                });
            }

            /* renamed from: a */
            private void m1665a(Runnable runnable) {
                if (Thread.currentThread() == C0434i.this.f1092e.getLooper().getThread()) {
                    runnable.run();
                } else {
                    C0434i.this.f1092e.post(runnable);
                }
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public boolean mo1535a(String str) {
                if (C0434i.this.f1094g == this && C0434i.this.f1093f != 0 && C0434i.this.f1093f != 1) {
                    return true;
                }
                if (!(C0434i.this.f1093f == 0 || C0434i.this.f1093f == 1)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str);
                    sb.append(" for ");
                    sb.append(C0434i.this.f1089b);
                    sb.append(" with mServiceConnection=");
                    sb.append(C0434i.this.f1094g);
                    sb.append(" this=");
                    sb.append(this);
                    Log.i("MediaBrowserCompat", sb.toString());
                }
                return false;
            }
        }

        public C0434i(Context context, ComponentName componentName, C0425b bVar, Bundle bundle) {
            Bundle bundle2;
            if (context == null) {
                throw new IllegalArgumentException("context must not be null");
            } else if (componentName == null) {
                throw new IllegalArgumentException("service component must not be null");
            } else if (bVar == null) {
                throw new IllegalArgumentException("connection callback must not be null");
            } else {
                this.f1088a = context;
                this.f1089b = componentName;
                this.f1090c = bVar;
                if (bundle == null) {
                    bundle2 = null;
                } else {
                    bundle2 = new Bundle(bundle);
                }
                this.f1091d = bundle2;
            }
        }

        /* renamed from: d */
        public void mo1524d() {
            if (this.f1093f == 0 || this.f1093f == 1) {
                this.f1093f = 2;
                this.f1092e.post(new Runnable() {
                    public void run() {
                        boolean z;
                        if (C0434i.this.f1093f != 0) {
                            C0434i.this.f1093f = 2;
                            if (MediaBrowserCompat.f1061a && C0434i.this.f1094g != null) {
                                StringBuilder sb = new StringBuilder();
                                sb.append("mServiceConnection should be null. Instead it is ");
                                sb.append(C0434i.this.f1094g);
                                throw new RuntimeException(sb.toString());
                            } else if (C0434i.this.f1095h != null) {
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append("mServiceBinderWrapper should be null. Instead it is ");
                                sb2.append(C0434i.this.f1095h);
                                throw new RuntimeException(sb2.toString());
                            } else if (C0434i.this.f1096i != null) {
                                StringBuilder sb3 = new StringBuilder();
                                sb3.append("mCallbacksMessenger should be null. Instead it is ");
                                sb3.append(C0434i.this.f1096i);
                                throw new RuntimeException(sb3.toString());
                            } else {
                                Intent intent = new Intent("android.media.browse.MediaBrowserService");
                                intent.setComponent(C0434i.this.f1089b);
                                C0434i.this.f1094g = new C0437a();
                                try {
                                    z = C0434i.this.f1088a.bindService(intent, C0434i.this.f1094g, 1);
                                } catch (Exception unused) {
                                    StringBuilder sb4 = new StringBuilder();
                                    sb4.append("Failed binding to service ");
                                    sb4.append(C0434i.this.f1089b);
                                    Log.e("MediaBrowserCompat", sb4.toString());
                                    z = false;
                                }
                                if (!z) {
                                    C0434i.this.mo1530a();
                                    C0434i.this.f1090c.mo1512c();
                                }
                                if (MediaBrowserCompat.f1061a) {
                                    Log.d("MediaBrowserCompat", "connect...");
                                    C0434i.this.mo1532c();
                                }
                            }
                        }
                    }
                });
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("connect() called while neigther disconnecting nor disconnected (state=");
            sb.append(m1654a(this.f1093f));
            sb.append(")");
            throw new IllegalStateException(sb.toString());
        }

        /* renamed from: e */
        public void mo1525e() {
            this.f1093f = 0;
            this.f1092e.post(new Runnable() {
                public void run() {
                    if (C0434i.this.f1096i != null) {
                        try {
                            C0434i.this.f1095h.mo1543a(C0434i.this.f1096i);
                        } catch (RemoteException unused) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("RemoteException during connect for ");
                            sb.append(C0434i.this.f1089b);
                            Log.w("MediaBrowserCompat", sb.toString());
                        }
                    }
                    int i = C0434i.this.f1093f;
                    C0434i.this.mo1530a();
                    if (i != 0) {
                        C0434i.this.f1093f = i;
                    }
                    if (MediaBrowserCompat.f1061a) {
                        Log.d("MediaBrowserCompat", "disconnect...");
                        C0434i.this.mo1532c();
                    }
                }
            });
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo1530a() {
            if (this.f1094g != null) {
                this.f1088a.unbindService(this.f1094g);
            }
            this.f1093f = 1;
            this.f1094g = null;
            this.f1095h = null;
            this.f1096i = null;
            this.f1092e.mo1507a(null);
            this.f1098k = null;
            this.f1099l = null;
        }

        /* renamed from: b */
        public boolean mo1531b() {
            return this.f1093f == 3;
        }

        /* renamed from: f */
        public Token mo1526f() {
            if (mo1531b()) {
                return this.f1099l;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("getSessionToken() called while not connected(state=");
            sb.append(this.f1093f);
            sb.append(")");
            throw new IllegalStateException(sb.toString());
        }

        /* renamed from: a */
        public void mo1528a(Messenger messenger, String str, Token token, Bundle bundle) {
            if (m1655a(messenger, "onConnect")) {
                if (this.f1093f != 2) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("onConnect from service while mState=");
                    sb.append(m1654a(this.f1093f));
                    sb.append("... ignoring");
                    Log.w("MediaBrowserCompat", sb.toString());
                    return;
                }
                this.f1098k = str;
                this.f1099l = token;
                this.f1100m = bundle;
                this.f1093f = 3;
                if (MediaBrowserCompat.f1061a) {
                    Log.d("MediaBrowserCompat", "ServiceCallbacks.onConnect...");
                    mo1532c();
                }
                this.f1090c.mo1509a();
                try {
                    for (Entry entry : this.f1097j.entrySet()) {
                        String str2 = (String) entry.getKey();
                        C0443m mVar = (C0443m) entry.getValue();
                        List b = mVar.mo1549b();
                        List a = mVar.mo1548a();
                        for (int i = 0; i < b.size(); i++) {
                            this.f1095h.mo1544a(str2, ((C0444n) b.get(i)).f1115b, (Bundle) a.get(i), this.f1096i);
                        }
                    }
                } catch (RemoteException unused) {
                    Log.d("MediaBrowserCompat", "addSubscription failed with RemoteException.");
                }
            }
        }

        /* renamed from: a */
        public void mo1527a(Messenger messenger) {
            StringBuilder sb = new StringBuilder();
            sb.append("onConnectFailed for ");
            sb.append(this.f1089b);
            Log.e("MediaBrowserCompat", sb.toString());
            if (m1655a(messenger, "onConnectFailed")) {
                if (this.f1093f != 2) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("onConnect from service while mState=");
                    sb2.append(m1654a(this.f1093f));
                    sb2.append("... ignoring");
                    Log.w("MediaBrowserCompat", sb2.toString());
                    return;
                }
                mo1530a();
                this.f1090c.mo1512c();
            }
        }

        /* renamed from: a */
        public void mo1529a(Messenger messenger, String str, List list, Bundle bundle, Bundle bundle2) {
            if (m1655a(messenger, "onLoadChildren")) {
                if (MediaBrowserCompat.f1061a) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("onLoadChildren for ");
                    sb.append(this.f1089b);
                    sb.append(" id=");
                    sb.append(str);
                    Log.d("MediaBrowserCompat", sb.toString());
                }
                C0443m mVar = (C0443m) this.f1097j.get(str);
                if (mVar == null) {
                    if (MediaBrowserCompat.f1061a) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("onLoadChildren for id that isn't subscribed id=");
                        sb2.append(str);
                        Log.d("MediaBrowserCompat", sb2.toString());
                    }
                    return;
                }
                C0444n a = mVar.mo1547a(bundle);
                if (a != null) {
                    if (bundle == null) {
                        if (list == null) {
                            a.mo1550a(str);
                        } else {
                            this.f1101n = bundle2;
                            a.mo1552a(str, list);
                            this.f1101n = null;
                        }
                    } else if (list == null) {
                        a.mo1551a(str, bundle);
                    } else {
                        this.f1101n = bundle2;
                        a.mo1553a(str, list, bundle);
                        this.f1101n = null;
                    }
                }
            }
        }

        /* renamed from: a */
        private static String m1654a(int i) {
            switch (i) {
                case 0:
                    return "CONNECT_STATE_DISCONNECTING";
                case 1:
                    return "CONNECT_STATE_DISCONNECTED";
                case 2:
                    return "CONNECT_STATE_CONNECTING";
                case 3:
                    return "CONNECT_STATE_CONNECTED";
                case 4:
                    return "CONNECT_STATE_SUSPENDED";
                default:
                    StringBuilder sb = new StringBuilder();
                    sb.append("UNKNOWN/");
                    sb.append(i);
                    return sb.toString();
            }
        }

        /* renamed from: a */
        private boolean m1655a(Messenger messenger, String str) {
            if (this.f1096i == messenger && this.f1093f != 0 && this.f1093f != 1) {
                return true;
            }
            if (!(this.f1093f == 0 || this.f1093f == 1)) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" for ");
                sb.append(this.f1089b);
                sb.append(" with mCallbacksMessenger=");
                sb.append(this.f1096i);
                sb.append(" this=");
                sb.append(this);
                Log.i("MediaBrowserCompat", sb.toString());
            }
            return false;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public void mo1532c() {
            Log.d("MediaBrowserCompat", "MediaBrowserCompat...");
            StringBuilder sb = new StringBuilder();
            sb.append("  mServiceComponent=");
            sb.append(this.f1089b);
            Log.d("MediaBrowserCompat", sb.toString());
            StringBuilder sb2 = new StringBuilder();
            sb2.append("  mCallback=");
            sb2.append(this.f1090c);
            Log.d("MediaBrowserCompat", sb2.toString());
            StringBuilder sb3 = new StringBuilder();
            sb3.append("  mRootHints=");
            sb3.append(this.f1091d);
            Log.d("MediaBrowserCompat", sb3.toString());
            StringBuilder sb4 = new StringBuilder();
            sb4.append("  mState=");
            sb4.append(m1654a(this.f1093f));
            Log.d("MediaBrowserCompat", sb4.toString());
            StringBuilder sb5 = new StringBuilder();
            sb5.append("  mServiceConnection=");
            sb5.append(this.f1094g);
            Log.d("MediaBrowserCompat", sb5.toString());
            StringBuilder sb6 = new StringBuilder();
            sb6.append("  mServiceBinderWrapper=");
            sb6.append(this.f1095h);
            Log.d("MediaBrowserCompat", sb6.toString());
            StringBuilder sb7 = new StringBuilder();
            sb7.append("  mCallbacksMessenger=");
            sb7.append(this.f1096i);
            Log.d("MediaBrowserCompat", sb7.toString());
            StringBuilder sb8 = new StringBuilder();
            sb8.append("  mRootId=");
            sb8.append(this.f1098k);
            Log.d("MediaBrowserCompat", sb8.toString());
            StringBuilder sb9 = new StringBuilder();
            sb9.append("  mMediaSessionToken=");
            sb9.append(this.f1099l);
            Log.d("MediaBrowserCompat", sb9.toString());
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$j */
    interface C0440j {
        /* renamed from: a */
        void mo1527a(Messenger messenger);

        /* renamed from: a */
        void mo1528a(Messenger messenger, String str, Token token, Bundle bundle);

        /* renamed from: a */
        void mo1529a(Messenger messenger, String str, List list, Bundle bundle, Bundle bundle2);
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$k */
    public static abstract class C0441k {
        /* renamed from: a */
        public void mo1540a(String str, Bundle bundle) {
        }

        /* renamed from: a */
        public void mo1541a(String str, Bundle bundle, List<MediaItem> list) {
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$l */
    private static class C0442l {

        /* renamed from: a */
        private Messenger f1110a;

        /* renamed from: b */
        private Bundle f1111b;

        public C0442l(IBinder iBinder, Bundle bundle) {
            this.f1110a = new Messenger(iBinder);
            this.f1111b = bundle;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo1542a(Context context, Messenger messenger) throws RemoteException {
            Bundle bundle = new Bundle();
            bundle.putString("data_package_name", context.getPackageName());
            bundle.putBundle("data_root_hints", this.f1111b);
            m1672a(1, bundle, messenger);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo1543a(Messenger messenger) throws RemoteException {
            m1672a(2, null, messenger);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo1544a(String str, IBinder iBinder, Bundle bundle, Messenger messenger) throws RemoteException {
            Bundle bundle2 = new Bundle();
            bundle2.putString("data_media_item_id", str);
            C0248d.m759a(bundle2, "data_callback_token", iBinder);
            bundle2.putBundle("data_options", bundle);
            m1672a(3, bundle2, messenger);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo1545b(Context context, Messenger messenger) throws RemoteException {
            Bundle bundle = new Bundle();
            bundle.putString("data_package_name", context.getPackageName());
            bundle.putBundle("data_root_hints", this.f1111b);
            m1672a(6, bundle, messenger);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo1546b(Messenger messenger) throws RemoteException {
            m1672a(7, null, messenger);
        }

        /* renamed from: a */
        private void m1672a(int i, Bundle bundle, Messenger messenger) throws RemoteException {
            Message obtain = Message.obtain();
            obtain.what = i;
            obtain.arg1 = 1;
            obtain.setData(bundle);
            obtain.replyTo = messenger;
            this.f1110a.send(obtain);
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$m */
    private static class C0443m {

        /* renamed from: a */
        private final List<C0444n> f1112a = new ArrayList();

        /* renamed from: b */
        private final List<Bundle> f1113b = new ArrayList();

        /* renamed from: a */
        public List<Bundle> mo1548a() {
            return this.f1113b;
        }

        /* renamed from: b */
        public List<C0444n> mo1549b() {
            return this.f1112a;
        }

        /* renamed from: a */
        public C0444n mo1547a(Bundle bundle) {
            for (int i = 0; i < this.f1113b.size(); i++) {
                if (C0486f.m1796a((Bundle) this.f1113b.get(i), bundle)) {
                    return (C0444n) this.f1112a.get(i);
                }
            }
            return null;
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$n */
    public static abstract class C0444n {

        /* renamed from: a */
        final Object f1114a;

        /* renamed from: b */
        final IBinder f1115b = new Binder();

        /* renamed from: c */
        WeakReference<C0443m> f1116c;

        /* renamed from: android.support.v4.media.MediaBrowserCompat$n$a */
        private class C0445a implements C0481d {
            C0445a() {
            }

            /* renamed from: a */
            public void mo1556a(String str, List<?> list) {
                C0443m mVar = C0444n.this.f1116c == null ? null : (C0443m) C0444n.this.f1116c.get();
                if (mVar == null) {
                    C0444n.this.mo1552a(str, MediaItem.m1622a(list));
                    return;
                }
                List a = MediaItem.m1622a(list);
                List b = mVar.mo1549b();
                List a2 = mVar.mo1548a();
                for (int i = 0; i < b.size(); i++) {
                    Bundle bundle = (Bundle) a2.get(i);
                    if (bundle == null) {
                        C0444n.this.mo1552a(str, a);
                    } else {
                        C0444n.this.mo1553a(str, mo1554a(a, bundle), bundle);
                    }
                }
            }

            /* renamed from: a */
            public void mo1555a(String str) {
                C0444n.this.mo1550a(str);
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public List<MediaItem> mo1554a(List<MediaItem> list, Bundle bundle) {
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
        }

        /* renamed from: android.support.v4.media.MediaBrowserCompat$n$b */
        private class C0446b extends C0445a implements C0484a {
            C0446b() {
                super();
            }

            /* renamed from: a */
            public void mo1558a(String str, List<?> list, Bundle bundle) {
                C0444n.this.mo1553a(str, MediaItem.m1622a(list), bundle);
            }

            /* renamed from: a */
            public void mo1557a(String str, Bundle bundle) {
                C0444n.this.mo1551a(str, bundle);
            }
        }

        /* renamed from: a */
        public void mo1550a(String str) {
        }

        /* renamed from: a */
        public void mo1551a(String str, Bundle bundle) {
        }

        /* renamed from: a */
        public void mo1552a(String str, List<MediaItem> list) {
        }

        /* renamed from: a */
        public void mo1553a(String str, List<MediaItem> list, Bundle bundle) {
        }

        public C0444n() {
            if (VERSION.SDK_INT >= 26) {
                this.f1114a = C0483e.m1793a(new C0446b());
            } else if (VERSION.SDK_INT >= 21) {
                this.f1114a = C0477d.m1781a((C0481d) new C0445a());
            } else {
                this.f1114a = null;
            }
        }
    }

    public MediaBrowserCompat(Context context, ComponentName componentName, C0425b bVar, Bundle bundle) {
        if (VERSION.SDK_INT >= 26) {
            this.f1062b = new C0433h(context, componentName, bVar, bundle);
        } else if (VERSION.SDK_INT >= 23) {
            this.f1062b = new C0432g(context, componentName, bVar, bundle);
        } else if (VERSION.SDK_INT >= 21) {
            this.f1062b = new C0431f(context, componentName, bVar, bundle);
        } else {
            this.f1062b = new C0434i(context, componentName, bVar, bundle);
        }
    }

    /* renamed from: a */
    public void mo1496a() {
        this.f1062b.mo1524d();
    }

    /* renamed from: b */
    public void mo1497b() {
        this.f1062b.mo1525e();
    }

    /* renamed from: c */
    public Token mo1498c() {
        return this.f1062b.mo1526f();
    }
}
