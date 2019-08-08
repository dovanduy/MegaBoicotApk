package android.support.p017v4.app;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Message;
import android.os.RemoteException;
import android.provider.Settings.Secure;
import android.support.p017v4.app.C0291p.C0292a;
import android.util.Log;
import com.facebook.ads.AdError;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/* renamed from: android.support.v4.app.x */
/* compiled from: NotificationManagerCompat */
public final class C0309x {

    /* renamed from: a */
    private static final Object f757a = new Object();

    /* renamed from: b */
    private static String f758b;

    /* renamed from: c */
    private static Set<String> f759c = new HashSet();

    /* renamed from: f */
    private static final Object f760f = new Object();

    /* renamed from: g */
    private static C0313d f761g;

    /* renamed from: d */
    private final Context f762d;

    /* renamed from: e */
    private final NotificationManager f763e = ((NotificationManager) this.f762d.getSystemService("notification"));

    /* renamed from: android.support.v4.app.x$a */
    /* compiled from: NotificationManagerCompat */
    private static class C0310a implements C0315e {

        /* renamed from: a */
        final String f764a;

        /* renamed from: b */
        final int f765b;

        /* renamed from: c */
        final String f766c;

        /* renamed from: d */
        final boolean f767d = false;

        C0310a(String str, int i, String str2) {
            this.f764a = str;
            this.f765b = i;
            this.f766c = str2;
        }

        /* renamed from: a */
        public void mo1098a(C0291p pVar) throws RemoteException {
            if (this.f767d) {
                pVar.mo1027a(this.f764a);
            } else {
                pVar.mo1028a(this.f764a, this.f765b, this.f766c);
            }
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("CancelTask[");
            sb.append("packageName:");
            sb.append(this.f764a);
            sb.append(", id:");
            sb.append(this.f765b);
            sb.append(", tag:");
            sb.append(this.f766c);
            sb.append(", all:");
            sb.append(this.f767d);
            sb.append("]");
            return sb.toString();
        }
    }

    /* renamed from: android.support.v4.app.x$b */
    /* compiled from: NotificationManagerCompat */
    private static class C0311b implements C0315e {

        /* renamed from: a */
        final String f768a;

        /* renamed from: b */
        final int f769b;

        /* renamed from: c */
        final String f770c;

        /* renamed from: d */
        final Notification f771d;

        C0311b(String str, int i, String str2, Notification notification) {
            this.f768a = str;
            this.f769b = i;
            this.f770c = str2;
            this.f771d = notification;
        }

        /* renamed from: a */
        public void mo1098a(C0291p pVar) throws RemoteException {
            pVar.mo1029a(this.f768a, this.f769b, this.f770c, this.f771d);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("NotifyTask[");
            sb.append("packageName:");
            sb.append(this.f768a);
            sb.append(", id:");
            sb.append(this.f769b);
            sb.append(", tag:");
            sb.append(this.f770c);
            sb.append("]");
            return sb.toString();
        }
    }

    /* renamed from: android.support.v4.app.x$c */
    /* compiled from: NotificationManagerCompat */
    private static class C0312c {

        /* renamed from: a */
        final ComponentName f772a;

        /* renamed from: b */
        final IBinder f773b;

        C0312c(ComponentName componentName, IBinder iBinder) {
            this.f772a = componentName;
            this.f773b = iBinder;
        }
    }

    /* renamed from: android.support.v4.app.x$d */
    /* compiled from: NotificationManagerCompat */
    private static class C0313d implements ServiceConnection, Callback {

        /* renamed from: a */
        private final Context f774a;

        /* renamed from: b */
        private final HandlerThread f775b;

        /* renamed from: c */
        private final Handler f776c;

        /* renamed from: d */
        private final Map<ComponentName, C0314a> f777d = new HashMap();

        /* renamed from: e */
        private Set<String> f778e = new HashSet();

        /* renamed from: android.support.v4.app.x$d$a */
        /* compiled from: NotificationManagerCompat */
        private static class C0314a {

            /* renamed from: a */
            final ComponentName f779a;

            /* renamed from: b */
            boolean f780b = false;

            /* renamed from: c */
            C0291p f781c;

            /* renamed from: d */
            ArrayDeque<C0315e> f782d = new ArrayDeque<>();

            /* renamed from: e */
            int f783e = 0;

            C0314a(ComponentName componentName) {
                this.f779a = componentName;
            }
        }

        C0313d(Context context) {
            this.f774a = context;
            this.f775b = new HandlerThread("NotificationManagerCompat");
            this.f775b.start();
            this.f776c = new Handler(this.f775b.getLooper(), this);
        }

        /* renamed from: a */
        public void mo1101a(C0315e eVar) {
            this.f776c.obtainMessage(0, eVar).sendToTarget();
        }

        public boolean handleMessage(Message message) {
            switch (message.what) {
                case 0:
                    m1162b((C0315e) message.obj);
                    return true;
                case 1:
                    C0312c cVar = (C0312c) message.obj;
                    m1158a(cVar.f772a, cVar.f773b);
                    return true;
                case 2:
                    m1157a((ComponentName) message.obj);
                    return true;
                case 3:
                    m1160b((ComponentName) message.obj);
                    return true;
                default:
                    return false;
            }
        }

        /* renamed from: b */
        private void m1162b(C0315e eVar) {
            m1156a();
            for (C0314a aVar : this.f777d.values()) {
                aVar.f782d.add(eVar);
                m1164d(aVar);
            }
        }

        /* renamed from: a */
        private void m1158a(ComponentName componentName, IBinder iBinder) {
            C0314a aVar = (C0314a) this.f777d.get(componentName);
            if (aVar != null) {
                aVar.f781c = C0292a.m1051a(iBinder);
                aVar.f783e = 0;
                m1164d(aVar);
            }
        }

        /* renamed from: a */
        private void m1157a(ComponentName componentName) {
            C0314a aVar = (C0314a) this.f777d.get(componentName);
            if (aVar != null) {
                m1161b(aVar);
            }
        }

        /* renamed from: b */
        private void m1160b(ComponentName componentName) {
            C0314a aVar = (C0314a) this.f777d.get(componentName);
            if (aVar != null) {
                m1164d(aVar);
            }
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Connected to service ");
                sb.append(componentName);
                Log.d("NotifManCompat", sb.toString());
            }
            this.f776c.obtainMessage(1, new C0312c(componentName, iBinder)).sendToTarget();
        }

        public void onServiceDisconnected(ComponentName componentName) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Disconnected from service ");
                sb.append(componentName);
                Log.d("NotifManCompat", sb.toString());
            }
            this.f776c.obtainMessage(2, componentName).sendToTarget();
        }

        /* renamed from: a */
        private void m1156a() {
            Set<String> b = C0309x.m1149b(this.f774a);
            if (!b.equals(this.f778e)) {
                this.f778e = b;
                List<ResolveInfo> queryIntentServices = this.f774a.getPackageManager().queryIntentServices(new Intent().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 0);
                HashSet<ComponentName> hashSet = new HashSet<>();
                for (ResolveInfo resolveInfo : queryIntentServices) {
                    if (b.contains(resolveInfo.serviceInfo.packageName)) {
                        ComponentName componentName = new ComponentName(resolveInfo.serviceInfo.packageName, resolveInfo.serviceInfo.name);
                        if (resolveInfo.serviceInfo.permission != null) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("Permission present on component ");
                            sb.append(componentName);
                            sb.append(", not adding listener record.");
                            Log.w("NotifManCompat", sb.toString());
                        } else {
                            hashSet.add(componentName);
                        }
                    }
                }
                for (ComponentName componentName2 : hashSet) {
                    if (!this.f777d.containsKey(componentName2)) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("Adding listener record for ");
                            sb2.append(componentName2);
                            Log.d("NotifManCompat", sb2.toString());
                        }
                        this.f777d.put(componentName2, new C0314a(componentName2));
                    }
                }
                Iterator it = this.f777d.entrySet().iterator();
                while (it.hasNext()) {
                    Entry entry = (Entry) it.next();
                    if (!hashSet.contains(entry.getKey())) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append("Removing listener record for ");
                            sb3.append(entry.getKey());
                            Log.d("NotifManCompat", sb3.toString());
                        }
                        m1161b((C0314a) entry.getValue());
                        it.remove();
                    }
                }
            }
        }

        /* renamed from: a */
        private boolean m1159a(C0314a aVar) {
            if (aVar.f780b) {
                return true;
            }
            aVar.f780b = this.f774a.bindService(new Intent("android.support.BIND_NOTIFICATION_SIDE_CHANNEL").setComponent(aVar.f779a), this, 33);
            if (aVar.f780b) {
                aVar.f783e = 0;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Unable to bind to listener ");
                sb.append(aVar.f779a);
                Log.w("NotifManCompat", sb.toString());
                this.f774a.unbindService(this);
            }
            return aVar.f780b;
        }

        /* renamed from: b */
        private void m1161b(C0314a aVar) {
            if (aVar.f780b) {
                this.f774a.unbindService(this);
                aVar.f780b = false;
            }
            aVar.f781c = null;
        }

        /* renamed from: c */
        private void m1163c(C0314a aVar) {
            if (!this.f776c.hasMessages(3, aVar.f779a)) {
                aVar.f783e++;
                if (aVar.f783e > 6) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Giving up on delivering ");
                    sb.append(aVar.f782d.size());
                    sb.append(" tasks to ");
                    sb.append(aVar.f779a);
                    sb.append(" after ");
                    sb.append(aVar.f783e);
                    sb.append(" retries");
                    Log.w("NotifManCompat", sb.toString());
                    aVar.f782d.clear();
                    return;
                }
                int i = AdError.NETWORK_ERROR_CODE * (1 << (aVar.f783e - 1));
                if (Log.isLoggable("NotifManCompat", 3)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Scheduling retry for ");
                    sb2.append(i);
                    sb2.append(" ms");
                    Log.d("NotifManCompat", sb2.toString());
                }
                this.f776c.sendMessageDelayed(this.f776c.obtainMessage(3, aVar.f779a), (long) i);
            }
        }

        /* renamed from: d */
        private void m1164d(C0314a aVar) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Processing component ");
                sb.append(aVar.f779a);
                sb.append(", ");
                sb.append(aVar.f782d.size());
                sb.append(" queued tasks");
                Log.d("NotifManCompat", sb.toString());
            }
            if (!aVar.f782d.isEmpty()) {
                if (!m1159a(aVar) || aVar.f781c == null) {
                    m1163c(aVar);
                    return;
                }
                while (true) {
                    C0315e eVar = (C0315e) aVar.f782d.peek();
                    if (eVar == null) {
                        break;
                    }
                    try {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("Sending task ");
                            sb2.append(eVar);
                            Log.d("NotifManCompat", sb2.toString());
                        }
                        eVar.mo1098a(aVar.f781c);
                        aVar.f782d.remove();
                    } catch (DeadObjectException unused) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append("Remote service has died: ");
                            sb3.append(aVar.f779a);
                            Log.d("NotifManCompat", sb3.toString());
                        }
                    } catch (RemoteException e) {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("RemoteException communicating with ");
                        sb4.append(aVar.f779a);
                        Log.w("NotifManCompat", sb4.toString(), e);
                    }
                }
                if (!aVar.f782d.isEmpty()) {
                    m1163c(aVar);
                }
            }
        }
    }

    /* renamed from: android.support.v4.app.x$e */
    /* compiled from: NotificationManagerCompat */
    private interface C0315e {
        /* renamed from: a */
        void mo1098a(C0291p pVar) throws RemoteException;
    }

    /* renamed from: a */
    public static C0309x m1146a(Context context) {
        return new C0309x(context);
    }

    private C0309x(Context context) {
        this.f762d = context;
    }

    /* renamed from: a */
    public void mo1094a(int i) {
        mo1096a((String) null, i);
    }

    /* renamed from: a */
    public void mo1096a(String str, int i) {
        this.f763e.cancel(str, i);
        if (VERSION.SDK_INT <= 19) {
            m1147a((C0315e) new C0310a(this.f762d.getPackageName(), i, str));
        }
    }

    /* renamed from: a */
    public void mo1095a(int i, Notification notification) {
        mo1097a(null, i, notification);
    }

    /* renamed from: a */
    public void mo1097a(String str, int i, Notification notification) {
        if (m1148a(notification)) {
            m1147a((C0315e) new C0311b(this.f762d.getPackageName(), i, str, notification));
            this.f763e.cancel(str, i);
            return;
        }
        this.f763e.notify(str, i, notification);
    }

    /* renamed from: b */
    public static Set<String> m1149b(Context context) {
        Set<String> set;
        String string = Secure.getString(context.getContentResolver(), "enabled_notification_listeners");
        synchronized (f757a) {
            if (string != null) {
                try {
                    if (!string.equals(f758b)) {
                        String[] split = string.split(":", -1);
                        HashSet hashSet = new HashSet(split.length);
                        for (String unflattenFromString : split) {
                            ComponentName unflattenFromString2 = ComponentName.unflattenFromString(unflattenFromString);
                            if (unflattenFromString2 != null) {
                                hashSet.add(unflattenFromString2.getPackageName());
                            }
                        }
                        f759c = hashSet;
                        f758b = string;
                    }
                } finally {
                }
            }
            set = f759c;
        }
        return set;
    }

    /* renamed from: a */
    private static boolean m1148a(Notification notification) {
        Bundle a = C0301u.m1079a(notification);
        return a != null && a.getBoolean("android.support.useSideChannel");
    }

    /* renamed from: a */
    private void m1147a(C0315e eVar) {
        synchronized (f760f) {
            if (f761g == null) {
                f761g = new C0313d(this.f762d.getApplicationContext());
            }
            f761g.mo1101a(eVar);
        }
    }
}
