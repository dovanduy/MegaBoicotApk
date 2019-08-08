package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.api.C3266f.C3268b;
import com.google.android.gms.common.api.C3266f.C3269c;
import com.google.android.gms.internal.p145b.C4415f;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.gms.common.internal.i */
public final class C3488i implements Callback {

    /* renamed from: a */
    private final C3489a f10055a;

    /* renamed from: b */
    private final ArrayList<C3268b> f10056b = new ArrayList<>();

    /* renamed from: c */
    private final ArrayList<C3268b> f10057c = new ArrayList<>();

    /* renamed from: d */
    private final ArrayList<C3269c> f10058d = new ArrayList<>();

    /* renamed from: e */
    private volatile boolean f10059e = false;

    /* renamed from: f */
    private final AtomicInteger f10060f = new AtomicInteger(0);

    /* renamed from: g */
    private boolean f10061g = false;

    /* renamed from: h */
    private final Handler f10062h;

    /* renamed from: i */
    private final Object f10063i = new Object();

    /* renamed from: com.google.android.gms.common.internal.i$a */
    public interface C3489a {
        /* renamed from: a */
        Bundle mo13199a();

        /* renamed from: h */
        boolean mo13200h();
    }

    public C3488i(Looper looper, C3489a aVar) {
        this.f10055a = aVar;
        this.f10062h = new C4415f(looper, this);
    }

    /* renamed from: a */
    public final void mo13590a() {
        this.f10059e = false;
        this.f10060f.incrementAndGet();
    }

    /* renamed from: b */
    public final void mo13596b() {
        this.f10059e = true;
    }

    /* renamed from: a */
    public final void mo13592a(Bundle bundle) {
        boolean z = true;
        C3513t.m12632a(Looper.myLooper() == this.f10062h.getLooper(), (Object) "onConnectionSuccess must only be called on the Handler thread");
        synchronized (this.f10063i) {
            C3513t.m12631a(!this.f10061g);
            this.f10062h.removeMessages(1);
            this.f10061g = true;
            if (this.f10057c.size() != 0) {
                z = false;
            }
            C3513t.m12631a(z);
            ArrayList arrayList = new ArrayList(this.f10056b);
            int i = this.f10060f.get();
            ArrayList arrayList2 = arrayList;
            int size = arrayList2.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList2.get(i2);
                i2++;
                C3268b bVar = (C3268b) obj;
                if (!this.f10059e || !this.f10055a.mo13200h() || this.f10060f.get() != i) {
                    break;
                } else if (!this.f10057c.contains(bVar)) {
                    bVar.onConnected(bundle);
                }
            }
            this.f10057c.clear();
            this.f10061g = false;
        }
    }

    /* renamed from: a */
    public final void mo13591a(int i) {
        C3513t.m12632a(Looper.myLooper() == this.f10062h.getLooper(), (Object) "onUnintentionalDisconnection must only be called on the Handler thread");
        this.f10062h.removeMessages(1);
        synchronized (this.f10063i) {
            this.f10061g = true;
            ArrayList arrayList = new ArrayList(this.f10056b);
            int i2 = this.f10060f.get();
            ArrayList arrayList2 = arrayList;
            int size = arrayList2.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList2.get(i3);
                i3++;
                C3268b bVar = (C3268b) obj;
                if (!this.f10059e || this.f10060f.get() != i2) {
                    break;
                } else if (this.f10056b.contains(bVar)) {
                    bVar.onConnectionSuspended(i);
                }
            }
            this.f10057c.clear();
            this.f10061g = false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0055, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo13593a(com.google.android.gms.common.ConnectionResult r8) {
        /*
            r7 = this;
            android.os.Looper r0 = android.os.Looper.myLooper()
            android.os.Handler r1 = r7.f10062h
            android.os.Looper r1 = r1.getLooper()
            r2 = 0
            r3 = 1
            if (r0 != r1) goto L_0x0010
            r0 = r3
            goto L_0x0011
        L_0x0010:
            r0 = r2
        L_0x0011:
            java.lang.String r1 = "onConnectionFailure must only be called on the Handler thread"
            com.google.android.gms.common.internal.C3513t.m12632a(r0, r1)
            android.os.Handler r0 = r7.f10062h
            r0.removeMessages(r3)
            java.lang.Object r0 = r7.f10063i
            monitor-enter(r0)
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x0058 }
            java.util.ArrayList<com.google.android.gms.common.api.f$c> r3 = r7.f10058d     // Catch:{ all -> 0x0058 }
            r1.<init>(r3)     // Catch:{ all -> 0x0058 }
            java.util.concurrent.atomic.AtomicInteger r3 = r7.f10060f     // Catch:{ all -> 0x0058 }
            int r3 = r3.get()     // Catch:{ all -> 0x0058 }
            java.util.ArrayList r1 = (java.util.ArrayList) r1     // Catch:{ all -> 0x0058 }
            int r4 = r1.size()     // Catch:{ all -> 0x0058 }
        L_0x0031:
            if (r2 >= r4) goto L_0x0056
            java.lang.Object r5 = r1.get(r2)     // Catch:{ all -> 0x0058 }
            int r2 = r2 + 1
            com.google.android.gms.common.api.f$c r5 = (com.google.android.gms.common.api.C3266f.C3269c) r5     // Catch:{ all -> 0x0058 }
            boolean r6 = r7.f10059e     // Catch:{ all -> 0x0058 }
            if (r6 == 0) goto L_0x0054
            java.util.concurrent.atomic.AtomicInteger r6 = r7.f10060f     // Catch:{ all -> 0x0058 }
            int r6 = r6.get()     // Catch:{ all -> 0x0058 }
            if (r6 == r3) goto L_0x0048
            goto L_0x0054
        L_0x0048:
            java.util.ArrayList<com.google.android.gms.common.api.f$c> r6 = r7.f10058d     // Catch:{ all -> 0x0058 }
            boolean r6 = r6.contains(r5)     // Catch:{ all -> 0x0058 }
            if (r6 == 0) goto L_0x0031
            r5.onConnectionFailed(r8)     // Catch:{ all -> 0x0058 }
            goto L_0x0031
        L_0x0054:
            monitor-exit(r0)     // Catch:{ all -> 0x0058 }
            return
        L_0x0056:
            monitor-exit(r0)     // Catch:{ all -> 0x0058 }
            return
        L_0x0058:
            r8 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0058 }
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.C3488i.mo13593a(com.google.android.gms.common.ConnectionResult):void");
    }

    /* renamed from: a */
    public final void mo13594a(C3268b bVar) {
        C3513t.m12625a(bVar);
        synchronized (this.f10063i) {
            if (this.f10056b.contains(bVar)) {
                String valueOf = String.valueOf(bVar);
                StringBuilder sb = new StringBuilder(62 + String.valueOf(valueOf).length());
                sb.append("registerConnectionCallbacks(): listener ");
                sb.append(valueOf);
                sb.append(" is already registered");
                Log.w("GmsClientEvents", sb.toString());
            } else {
                this.f10056b.add(bVar);
            }
        }
        if (this.f10055a.mo13200h()) {
            this.f10062h.sendMessage(this.f10062h.obtainMessage(1, bVar));
        }
    }

    /* renamed from: a */
    public final void mo13595a(C3269c cVar) {
        C3513t.m12625a(cVar);
        synchronized (this.f10063i) {
            if (this.f10058d.contains(cVar)) {
                String valueOf = String.valueOf(cVar);
                StringBuilder sb = new StringBuilder(67 + String.valueOf(valueOf).length());
                sb.append("registerConnectionFailedListener(): listener ");
                sb.append(valueOf);
                sb.append(" is already registered");
                Log.w("GmsClientEvents", sb.toString());
            } else {
                this.f10058d.add(cVar);
            }
        }
    }

    /* renamed from: b */
    public final void mo13597b(C3269c cVar) {
        C3513t.m12625a(cVar);
        synchronized (this.f10063i) {
            if (!this.f10058d.remove(cVar)) {
                String valueOf = String.valueOf(cVar);
                StringBuilder sb = new StringBuilder(57 + String.valueOf(valueOf).length());
                sb.append("unregisterConnectionFailedListener(): listener ");
                sb.append(valueOf);
                sb.append(" not found");
                Log.w("GmsClientEvents", sb.toString());
            }
        }
    }

    public final boolean handleMessage(Message message) {
        if (message.what == 1) {
            C3268b bVar = (C3268b) message.obj;
            synchronized (this.f10063i) {
                if (this.f10059e && this.f10055a.mo13200h() && this.f10056b.contains(bVar)) {
                    bVar.onConnected(this.f10055a.mo13199a());
                }
            }
            return true;
        }
        int i = message.what;
        StringBuilder sb = new StringBuilder(45);
        sb.append("Don't know how to handle message: ");
        sb.append(i);
        Log.wtf("GmsClientEvents", sb.toString(), new Exception());
        return false;
    }
}
