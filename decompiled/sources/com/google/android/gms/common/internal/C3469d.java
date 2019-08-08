package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.exoplayer2.extractor.p132ts.TsExtractor;
import com.google.android.gms.common.C3407d;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.C3262d;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.C3498o.C3499a;
import com.google.android.gms.internal.p146c.C4421e;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.concurrent.GuardedBy;

/* renamed from: com.google.android.gms.common.internal.d */
public abstract class C3469d<T extends IInterface> {

    /* renamed from: d */
    public static final String[] f9988d = {"service_esmobile", "service_googleme"};

    /* renamed from: e */
    private static final Feature[] f9989e = new Feature[0];
    /* access modifiers changed from: private */

    /* renamed from: A */
    public ConnectionResult f9990A;
    /* access modifiers changed from: private */

    /* renamed from: B */
    public boolean f9991B;

    /* renamed from: C */
    private volatile zzb f9992C;

    /* renamed from: a */
    final Handler f9993a;

    /* renamed from: b */
    protected C3472c f9994b;

    /* renamed from: c */
    protected AtomicInteger f9995c;

    /* renamed from: f */
    private int f9996f;

    /* renamed from: g */
    private long f9997g;

    /* renamed from: h */
    private long f9998h;

    /* renamed from: i */
    private int f9999i;

    /* renamed from: j */
    private long f10000j;

    /* renamed from: k */
    private C3456aq f10001k;

    /* renamed from: l */
    private final Context f10002l;

    /* renamed from: m */
    private final Looper f10003m;

    /* renamed from: n */
    private final C3490j f10004n;

    /* renamed from: o */
    private final C3407d f10005o;

    /* renamed from: p */
    private final Object f10006p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public final Object f10007q;
    /* access modifiers changed from: private */
    @GuardedBy("mServiceBrokerLock")

    /* renamed from: r */
    public C3500p f10008r;
    @GuardedBy("mLock")

    /* renamed from: s */
    private T f10009s;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public final ArrayList<C3477h<?>> f10010t;
    @GuardedBy("mLock")

    /* renamed from: u */
    private C3479j f10011u;
    @GuardedBy("mLock")

    /* renamed from: v */
    private int f10012v;
    /* access modifiers changed from: private */

    /* renamed from: w */
    public final C3470a f10013w;
    /* access modifiers changed from: private */

    /* renamed from: x */
    public final C3471b f10014x;

    /* renamed from: y */
    private final int f10015y;

    /* renamed from: z */
    private final String f10016z;

    /* renamed from: com.google.android.gms.common.internal.d$a */
    public interface C3470a {
        /* renamed from: a */
        void mo13483a(int i);

        /* renamed from: a */
        void mo13484a(Bundle bundle);
    }

    /* renamed from: com.google.android.gms.common.internal.d$b */
    public interface C3471b {
        /* renamed from: a */
        void mo13485a(ConnectionResult connectionResult);
    }

    /* renamed from: com.google.android.gms.common.internal.d$c */
    public interface C3472c {
        /* renamed from: a */
        void mo13180a(ConnectionResult connectionResult);
    }

    /* renamed from: com.google.android.gms.common.internal.d$d */
    protected class C3473d implements C3472c {
        public C3473d() {
        }

        /* renamed from: a */
        public void mo13180a(ConnectionResult connectionResult) {
            if (connectionResult.mo13042b()) {
                C3469d.this.mo13538a((C3494m) null, C3469d.this.mo13559y());
                return;
            }
            if (C3469d.this.f10014x != null) {
                C3469d.this.f10014x.mo13485a(connectionResult);
            }
        }
    }

    /* renamed from: com.google.android.gms.common.internal.d$e */
    public interface C3474e {
        /* renamed from: a */
        void mo13243a();
    }

    /* renamed from: com.google.android.gms.common.internal.d$f */
    private abstract class C3475f extends C3477h<Boolean> {

        /* renamed from: a */
        private final int f10018a;

        /* renamed from: b */
        private final Bundle f10019b;

        protected C3475f(int i, Bundle bundle) {
            super(Boolean.valueOf(true));
            this.f10018a = i;
            this.f10019b = bundle;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract void mo13560a(ConnectionResult connectionResult);

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract boolean mo13562a();

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public final void mo13563b() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final /* synthetic */ void mo13561a(Object obj) {
            PendingIntent pendingIntent = null;
            if (((Boolean) obj) == null) {
                C3469d.this.m12406b(1, null);
                return;
            }
            int i = this.f10018a;
            if (i != 0) {
                if (i != 10) {
                    C3469d.this.m12406b(1, null);
                    if (this.f10019b != null) {
                        pendingIntent = (PendingIntent) this.f10019b.getParcelable("pendingIntent");
                    }
                    mo13560a(new ConnectionResult(this.f10018a, pendingIntent));
                } else {
                    C3469d.this.m12406b(1, null);
                    throw new IllegalStateException(String.format("A fatal developer error has occurred. Class name: %s. Start service action: %s. Service Descriptor: %s. ", new Object[]{getClass().getSimpleName(), C3469d.this.mo13020n_(), C3469d.this.mo13015b()}));
                }
            } else if (!mo13562a()) {
                C3469d.this.m12406b(1, null);
                mo13560a(new ConnectionResult(8, null));
            }
        }
    }

    /* renamed from: com.google.android.gms.common.internal.d$g */
    final class C3476g extends C4421e {
        public C3476g(Looper looper) {
            super(looper);
        }

        public final void handleMessage(Message message) {
            ConnectionResult connectionResult;
            ConnectionResult connectionResult2;
            if (C3469d.this.f9995c.get() != message.arg1) {
                if (m12465b(message)) {
                    m12464a(message);
                }
            } else if ((message.what == 1 || message.what == 7 || message.what == 4 || message.what == 5) && !C3469d.this.mo13543i()) {
                m12464a(message);
            } else {
                PendingIntent pendingIntent = null;
                if (message.what == 4) {
                    C3469d.this.f9990A = new ConnectionResult(message.arg2);
                    if (!C3469d.this.mo17794A() || C3469d.this.f9991B) {
                        if (C3469d.this.f9990A != null) {
                            connectionResult2 = C3469d.this.f9990A;
                        } else {
                            connectionResult2 = new ConnectionResult(8);
                        }
                        C3469d.this.f9994b.mo13180a(connectionResult2);
                        C3469d.this.mo13534a(connectionResult2);
                        return;
                    }
                    C3469d.this.m12406b(3, null);
                } else if (message.what == 5) {
                    if (C3469d.this.f9990A != null) {
                        connectionResult = C3469d.this.f9990A;
                    } else {
                        connectionResult = new ConnectionResult(8);
                    }
                    C3469d.this.f9994b.mo13180a(connectionResult);
                    C3469d.this.mo13534a(connectionResult);
                } else if (message.what == 3) {
                    if (message.obj instanceof PendingIntent) {
                        pendingIntent = (PendingIntent) message.obj;
                    }
                    ConnectionResult connectionResult3 = new ConnectionResult(message.arg2, pendingIntent);
                    C3469d.this.f9994b.mo13180a(connectionResult3);
                    C3469d.this.mo13534a(connectionResult3);
                } else if (message.what == 6) {
                    C3469d.this.m12406b(5, null);
                    if (C3469d.this.f10013w != null) {
                        C3469d.this.f10013w.mo13483a(message.arg2);
                    }
                    C3469d.this.mo13529a(message.arg2);
                    C3469d.this.m12404a(5, 1, null);
                } else if (message.what == 2 && !C3469d.this.mo13542h()) {
                    m12464a(message);
                } else if (m12465b(message)) {
                    ((C3477h) message.obj).mo13565c();
                } else {
                    int i = message.what;
                    StringBuilder sb = new StringBuilder(45);
                    sb.append("Don't know how to handle message: ");
                    sb.append(i);
                    Log.wtf("GmsClient", sb.toString(), new Exception());
                }
            }
        }

        /* renamed from: a */
        private static void m12464a(Message message) {
            C3477h hVar = (C3477h) message.obj;
            hVar.mo13563b();
            hVar.mo13566d();
        }

        /* renamed from: b */
        private static boolean m12465b(Message message) {
            return message.what == 2 || message.what == 1 || message.what == 7;
        }
    }

    /* renamed from: com.google.android.gms.common.internal.d$h */
    protected abstract class C3477h<TListener> {

        /* renamed from: a */
        private TListener f10022a;

        /* renamed from: b */
        private boolean f10023b = false;

        public C3477h(TListener tlistener) {
            this.f10022a = tlistener;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract void mo13561a(TListener tlistener);

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public abstract void mo13563b();

        /* renamed from: c */
        public final void mo13565c() {
            TListener tlistener;
            synchronized (this) {
                tlistener = this.f10022a;
                if (this.f10023b) {
                    String valueOf = String.valueOf(this);
                    StringBuilder sb = new StringBuilder(47 + String.valueOf(valueOf).length());
                    sb.append("Callback proxy ");
                    sb.append(valueOf);
                    sb.append(" being reused. This is not safe.");
                    Log.w("GmsClient", sb.toString());
                }
            }
            if (tlistener != null) {
                try {
                    mo13561a(tlistener);
                } catch (RuntimeException e) {
                    mo13563b();
                    throw e;
                }
            } else {
                mo13563b();
            }
            synchronized (this) {
                this.f10023b = true;
            }
            mo13566d();
        }

        /* renamed from: d */
        public final void mo13566d() {
            mo13567e();
            synchronized (C3469d.this.f10010t) {
                C3469d.this.f10010t.remove(this);
            }
        }

        /* renamed from: e */
        public final void mo13567e() {
            synchronized (this) {
                this.f10022a = null;
            }
        }
    }

    /* renamed from: com.google.android.gms.common.internal.d$i */
    public static final class C3478i extends C3499a {

        /* renamed from: a */
        private C3469d f10025a;

        /* renamed from: b */
        private final int f10026b;

        public C3478i(C3469d dVar, int i) {
            this.f10025a = dVar;
            this.f10026b = i;
        }

        /* renamed from: a */
        public final void mo13522a(int i, Bundle bundle) {
            Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
        }

        /* renamed from: a */
        public final void mo13523a(int i, IBinder iBinder, Bundle bundle) {
            C3513t.m12626a(this.f10025a, (Object) "onPostInitComplete can be called only once per call to getRemoteService");
            this.f10025a.mo13531a(i, iBinder, bundle, this.f10026b);
            this.f10025a = null;
        }

        /* renamed from: a */
        public final void mo13524a(int i, IBinder iBinder, zzb zzb) {
            C3513t.m12626a(this.f10025a, (Object) "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
            C3513t.m12625a(zzb);
            this.f10025a.m12403a(zzb);
            mo13523a(i, iBinder, zzb.f10087a);
        }
    }

    /* renamed from: com.google.android.gms.common.internal.d$j */
    public final class C3479j implements ServiceConnection {

        /* renamed from: a */
        private final int f10027a;

        public C3479j(int i) {
            this.f10027a = i;
        }

        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            C3500p pVar;
            if (iBinder == null) {
                C3469d.this.m12408c(16);
                return;
            }
            synchronized (C3469d.this.f10007q) {
                C3469d dVar = C3469d.this;
                if (iBinder == null) {
                    pVar = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                    if (queryLocalInterface == null || !(queryLocalInterface instanceof C3500p)) {
                        pVar = new C3502a(iBinder);
                    } else {
                        pVar = (C3500p) queryLocalInterface;
                    }
                }
                dVar.f10008r = pVar;
            }
            C3469d.this.mo13530a(0, (Bundle) null, this.f10027a);
        }

        public final void onServiceDisconnected(ComponentName componentName) {
            synchronized (C3469d.this.f10007q) {
                C3469d.this.f10008r = null;
            }
            C3469d.this.f9993a.sendMessage(C3469d.this.f9993a.obtainMessage(6, this.f10027a, 1));
        }
    }

    /* renamed from: com.google.android.gms.common.internal.d$k */
    protected final class C3480k extends C3475f {

        /* renamed from: a */
        private final IBinder f10029a;

        public C3480k(int i, IBinder iBinder, Bundle bundle) {
            super(i, bundle);
            this.f10029a = iBinder;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo13560a(ConnectionResult connectionResult) {
            if (C3469d.this.f10014x != null) {
                C3469d.this.f10014x.mo13485a(connectionResult);
            }
            C3469d.this.mo13534a(connectionResult);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final boolean mo13562a() {
            try {
                String interfaceDescriptor = this.f10029a.getInterfaceDescriptor();
                if (!C3469d.this.mo13015b().equals(interfaceDescriptor)) {
                    String b = C3469d.this.mo13015b();
                    StringBuilder sb = new StringBuilder(34 + String.valueOf(b).length() + String.valueOf(interfaceDescriptor).length());
                    sb.append("service descriptor mismatch: ");
                    sb.append(b);
                    sb.append(" vs. ");
                    sb.append(interfaceDescriptor);
                    Log.e("GmsClient", sb.toString());
                    return false;
                }
                IInterface a = C3469d.this.mo13014a(this.f10029a);
                if (a == null || (!C3469d.this.m12404a(2, 4, a) && !C3469d.this.m12404a(3, 4, a))) {
                    return false;
                }
                C3469d.this.f9990A = null;
                Bundle a2 = C3469d.this.mo13528a();
                if (C3469d.this.f10013w != null) {
                    C3469d.this.f10013w.mo13484a(a2);
                }
                return true;
            } catch (RemoteException unused) {
                Log.w("GmsClient", "service probably died");
                return false;
            }
        }
    }

    /* renamed from: com.google.android.gms.common.internal.d$l */
    protected final class C3481l extends C3475f {
        public C3481l(int i, Bundle bundle) {
            super(i, null);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo13560a(ConnectionResult connectionResult) {
            C3469d.this.f9994b.mo13180a(connectionResult);
            C3469d.this.mo13534a(connectionResult);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final boolean mo13562a() {
            C3469d.this.f9994b.mo13180a(ConnectionResult.f9434a);
            return true;
        }
    }

    /* renamed from: a */
    public Bundle mo13528a() {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract T mo13014a(IBinder iBinder);

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo13532a(int i, T t) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract String mo13015b();

    /* renamed from: c */
    public boolean mo13016c() {
        return false;
    }

    /* renamed from: j */
    public boolean mo13544j() {
        return false;
    }

    /* renamed from: k */
    public boolean mo13545k() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n_ */
    public abstract String mo13020n_();

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public String mo13549o() {
        return "com.google.android.gms";
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public String mo13550p() {
        return null;
    }

    /* renamed from: s */
    public Account mo13553s() {
        return null;
    }

    /* renamed from: x */
    public boolean mo13558x() {
        return false;
    }

    protected C3469d(Context context, Looper looper, int i, C3470a aVar, C3471b bVar, String str) {
        this(context, looper, C3490j.m12526a(context), C3407d.m12253b(), i, (C3470a) C3513t.m12625a(aVar), (C3471b) C3513t.m12625a(bVar), str);
    }

    protected C3469d(Context context, Looper looper, C3490j jVar, C3407d dVar, int i, C3470a aVar, C3471b bVar, String str) {
        this.f10006p = new Object();
        this.f10007q = new Object();
        this.f10010t = new ArrayList<>();
        this.f10012v = 1;
        this.f9990A = null;
        this.f9991B = false;
        this.f9992C = null;
        this.f9995c = new AtomicInteger(0);
        this.f10002l = (Context) C3513t.m12626a(context, (Object) "Context must not be null");
        this.f10003m = (Looper) C3513t.m12626a(looper, (Object) "Looper must not be null");
        this.f10004n = (C3490j) C3513t.m12626a(jVar, (Object) "Supervisor must not be null");
        this.f10005o = (C3407d) C3513t.m12626a(dVar, (Object) "API availability must not be null");
        this.f9993a = new C3476g(looper);
        this.f10015y = i;
        this.f10013w = aVar;
        this.f10014x = bVar;
        this.f10016z = str;
    }

    /* renamed from: e */
    private final String mo13018e() {
        return this.f10016z == null ? this.f10002l.getClass().getName() : this.f10016z;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m12403a(zzb zzb) {
        this.f9992C = zzb;
    }

    /* renamed from: n */
    public final Feature[] mo13548n() {
        zzb zzb = this.f9992C;
        if (zzb == null) {
            return null;
        }
        return zzb.f10088b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo13533a(T t) {
        this.f9998h = System.currentTimeMillis();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo13529a(int i) {
        this.f9996f = i;
        this.f9997g = System.currentTimeMillis();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo13534a(ConnectionResult connectionResult) {
        this.f9999i = connectionResult.mo13043c();
        this.f10000j = System.currentTimeMillis();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m12406b(int i, T t) {
        C3456aq aqVar;
        C3513t.m12635b((i == 4) == (t != null));
        synchronized (this.f10006p) {
            this.f10012v = i;
            this.f10009s = t;
            mo13532a(i, t);
            switch (i) {
                case 1:
                    if (this.f10011u != null) {
                        this.f10004n.mo13599a(this.f10001k.mo13516a(), this.f10001k.mo13517b(), this.f10001k.mo13518c(), this.f10011u, mo13018e());
                        this.f10011u = null;
                        break;
                    }
                    break;
                case 2:
                case 3:
                    if (!(this.f10011u == null || this.f10001k == null)) {
                        String a = this.f10001k.mo13516a();
                        String b = this.f10001k.mo13517b();
                        StringBuilder sb = new StringBuilder(70 + String.valueOf(a).length() + String.valueOf(b).length());
                        sb.append("Calling connect() while still connected, missing disconnect() for ");
                        sb.append(a);
                        sb.append(" on ");
                        sb.append(b);
                        Log.e("GmsClient", sb.toString());
                        this.f10004n.mo13599a(this.f10001k.mo13516a(), this.f10001k.mo13517b(), this.f10001k.mo13518c(), this.f10011u, mo13018e());
                        this.f9995c.incrementAndGet();
                    }
                    this.f10011u = new C3479j(this.f9995c.get());
                    if (this.f10012v != 3 || mo13550p() == null) {
                        aqVar = new C3456aq(mo13549o(), mo13020n_(), false, TsExtractor.TS_STREAM_TYPE_AC3);
                    } else {
                        aqVar = new C3456aq(mo13552r().getPackageName(), mo13550p(), true, TsExtractor.TS_STREAM_TYPE_AC3);
                    }
                    this.f10001k = aqVar;
                    if (!this.f10004n.mo13500a(new C3491a(this.f10001k.mo13516a(), this.f10001k.mo13517b(), this.f10001k.mo13518c()), this.f10011u, mo13018e())) {
                        String a2 = this.f10001k.mo13516a();
                        String b2 = this.f10001k.mo13517b();
                        StringBuilder sb2 = new StringBuilder(34 + String.valueOf(a2).length() + String.valueOf(b2).length());
                        sb2.append("unable to connect to service: ");
                        sb2.append(a2);
                        sb2.append(" on ");
                        sb2.append(b2);
                        Log.e("GmsClient", sb2.toString());
                        mo13530a(16, (Bundle) null, this.f9995c.get());
                        break;
                    }
                    break;
                case 4:
                    mo13533a(t);
                    break;
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final boolean m12404a(int i, int i2, T t) {
        synchronized (this.f10006p) {
            if (this.f10012v != i) {
                return false;
            }
            m12406b(i2, t);
            return true;
        }
    }

    /* renamed from: q */
    public void mo13551q() {
        int b = this.f10005o.mo13408b(this.f10002l, mo13019f());
        if (b != 0) {
            m12406b(1, null);
            mo13536a((C3472c) new C3473d(), b, (PendingIntent) null);
            return;
        }
        mo13535a((C3472c) new C3473d());
    }

    /* renamed from: a */
    public void mo13535a(C3472c cVar) {
        this.f9994b = (C3472c) C3513t.m12626a(cVar, (Object) "Connection progress callbacks cannot be null.");
        m12406b(2, null);
    }

    /* renamed from: h */
    public boolean mo13542h() {
        boolean z;
        synchronized (this.f10006p) {
            z = this.f10012v == 4;
        }
        return z;
    }

    /* renamed from: i */
    public boolean mo13543i() {
        boolean z;
        synchronized (this.f10006p) {
            if (this.f10012v != 2) {
                if (this.f10012v != 3) {
                    z = false;
                }
            }
            z = true;
        }
        return z;
    }

    /* renamed from: z */
    private final boolean mo13589z() {
        boolean z;
        synchronized (this.f10006p) {
            z = this.f10012v == 3;
        }
        return z;
    }

    /* renamed from: g */
    public void mo13541g() {
        this.f9995c.incrementAndGet();
        synchronized (this.f10010t) {
            int size = this.f10010t.size();
            for (int i = 0; i < size; i++) {
                ((C3477h) this.f10010t.get(i)).mo13567e();
            }
            this.f10010t.clear();
        }
        synchronized (this.f10007q) {
            this.f10008r = null;
        }
        m12406b(1, null);
    }

    /* renamed from: b */
    public void mo13540b(int i) {
        this.f9993a.sendMessage(this.f9993a.obtainMessage(6, this.f9995c.get(), i));
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public final void m12408c(int i) {
        int i2;
        if (mo13589z()) {
            i2 = 5;
            this.f9991B = true;
        } else {
            i2 = 4;
        }
        this.f9993a.sendMessage(this.f9993a.obtainMessage(i2, this.f9995c.get(), 16));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo13536a(C3472c cVar, int i, PendingIntent pendingIntent) {
        this.f9994b = (C3472c) C3513t.m12626a(cVar, (Object) "Connection progress callbacks cannot be null.");
        this.f9993a.sendMessage(this.f9993a.obtainMessage(3, this.f9995c.get(), i, pendingIntent));
    }

    /* renamed from: r */
    public final Context mo13552r() {
        return this.f10002l;
    }

    /* renamed from: t */
    public Feature[] mo13554t() {
        return f9989e;
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public Bundle mo13555u() {
        return new Bundle();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo13531a(int i, IBinder iBinder, Bundle bundle, int i2) {
        this.f9993a.sendMessage(this.f9993a.obtainMessage(1, i2, -1, new C3480k(i, iBinder, bundle)));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo13530a(int i, Bundle bundle, int i2) {
        this.f9993a.sendMessage(this.f9993a.obtainMessage(7, i2, -1, new C3481l(i, null)));
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public final void mo13556v() {
        if (!mo13542h()) {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }

    /* renamed from: w */
    public final T mo13557w() throws DeadObjectException {
        T t;
        synchronized (this.f10006p) {
            if (this.f10012v == 5) {
                throw new DeadObjectException();
            }
            mo13556v();
            C3513t.m12632a(this.f10009s != null, (Object) "Client is connected but service is null");
            t = this.f10009s;
        }
        return t;
    }

    /* renamed from: a */
    public void mo13538a(C3494m mVar, Set<Scope> set) {
        Bundle u = mo13555u();
        GetServiceRequest getServiceRequest = new GetServiceRequest(this.f10015y);
        getServiceRequest.f9927a = this.f10002l.getPackageName();
        getServiceRequest.f9930d = u;
        if (set != null) {
            getServiceRequest.f9929c = (Scope[]) set.toArray(new Scope[set.size()]);
        }
        if (mo13544j()) {
            getServiceRequest.f9931e = mo13553s() != null ? mo13553s() : new Account("<<default account>>", "com.google");
            if (mVar != null) {
                getServiceRequest.f9928b = mVar.asBinder();
            }
        } else if (mo13558x()) {
            getServiceRequest.f9931e = mo13553s();
        }
        getServiceRequest.f9932f = f9989e;
        getServiceRequest.f9933g = mo13554t();
        try {
            synchronized (this.f10007q) {
                if (this.f10008r != null) {
                    this.f10008r.mo13610a(new C3478i(this, this.f9995c.get()), getServiceRequest);
                } else {
                    Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                }
            }
        } catch (DeadObjectException e) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            mo13540b(1);
        } catch (SecurityException e2) {
            throw e2;
        } catch (RemoteException | RuntimeException e3) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e3);
            mo13531a(8, (IBinder) null, (Bundle) null, this.f9995c.get());
        }
    }

    /* renamed from: a */
    public void mo13537a(C3474e eVar) {
        eVar.mo13243a();
    }

    /* renamed from: d */
    public Intent mo13017d() {
        throw new UnsupportedOperationException("Not a sign in API");
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public Set<Scope> mo13559y() {
        return Collections.EMPTY_SET;
    }

    /* renamed from: a */
    public void mo13539a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int i;
        T t;
        C3500p pVar;
        synchronized (this.f10006p) {
            i = this.f10012v;
            t = this.f10009s;
        }
        synchronized (this.f10007q) {
            pVar = this.f10008r;
        }
        printWriter.append(str).append("mConnectState=");
        switch (i) {
            case 1:
                printWriter.print("DISCONNECTED");
                break;
            case 2:
                printWriter.print("REMOTE_CONNECTING");
                break;
            case 3:
                printWriter.print("LOCAL_CONNECTING");
                break;
            case 4:
                printWriter.print("CONNECTED");
                break;
            case 5:
                printWriter.print("DISCONNECTING");
                break;
            default:
                printWriter.print("UNKNOWN");
                break;
        }
        printWriter.append(" mService=");
        if (t == null) {
            printWriter.append("null");
        } else {
            printWriter.append(mo13015b()).append("@").append(Integer.toHexString(System.identityHashCode(t.asBinder())));
        }
        printWriter.append(" mServiceBroker=");
        if (pVar == null) {
            printWriter.println("null");
        } else {
            printWriter.append("IGmsServiceBroker@").println(Integer.toHexString(System.identityHashCode(pVar.asBinder())));
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US);
        if (this.f9998h > 0) {
            PrintWriter append = printWriter.append(str).append("lastConnectedTime=");
            long j = this.f9998h;
            String format = simpleDateFormat.format(new Date(this.f9998h));
            StringBuilder sb = new StringBuilder(String.valueOf(format).length() + 21);
            sb.append(j);
            sb.append(" ");
            sb.append(format);
            append.println(sb.toString());
        }
        if (this.f9997g > 0) {
            printWriter.append(str).append("lastSuspendedCause=");
            switch (this.f9996f) {
                case 1:
                    printWriter.append("CAUSE_SERVICE_DISCONNECTED");
                    break;
                case 2:
                    printWriter.append("CAUSE_NETWORK_LOST");
                    break;
                default:
                    printWriter.append(String.valueOf(this.f9996f));
                    break;
            }
            PrintWriter append2 = printWriter.append(" lastSuspendedTime=");
            long j2 = this.f9997g;
            String format2 = simpleDateFormat.format(new Date(this.f9997g));
            StringBuilder sb2 = new StringBuilder(String.valueOf(format2).length() + 21);
            sb2.append(j2);
            sb2.append(" ");
            sb2.append(format2);
            append2.println(sb2.toString());
        }
        if (this.f10000j > 0) {
            printWriter.append(str).append("lastFailedStatus=").append(C3262d.m11633a(this.f9999i));
            PrintWriter append3 = printWriter.append(" lastFailedTime=");
            long j3 = this.f10000j;
            String format3 = simpleDateFormat.format(new Date(this.f10000j));
            StringBuilder sb3 = new StringBuilder(21 + String.valueOf(format3).length());
            sb3.append(j3);
            sb3.append(" ");
            sb3.append(format3);
            append3.println(sb3.toString());
        }
    }

    /* renamed from: l */
    public IBinder mo13546l() {
        synchronized (this.f10007q) {
            if (this.f10008r == null) {
                return null;
            }
            IBinder asBinder = this.f10008r.asBinder();
            return asBinder;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: A */
    public final boolean mo17794A() {
        if (this.f9991B || TextUtils.isEmpty(mo13015b()) || TextUtils.isEmpty(mo13550p())) {
            return false;
        }
        try {
            Class.forName(mo13015b());
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* renamed from: m */
    public String mo13547m() {
        if (mo13542h() && this.f10001k != null) {
            return this.f10001k.mo13517b();
        }
        throw new RuntimeException("Failed to connect when checking package");
    }

    /* renamed from: f */
    public int mo13019f() {
        return C3407d.f9849b;
    }
}
