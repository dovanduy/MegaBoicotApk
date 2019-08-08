package com.facebook.ads.internal.p095v.p097b;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.facebook.ads.internal.p095v.p097b.p098a.C1877b;
import java.io.File;
import java.net.Socket;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.facebook.ads.internal.v.b.g */
final class C1897g {

    /* renamed from: a */
    private final AtomicInteger f5973a = new AtomicInteger(0);

    /* renamed from: b */
    private final String f5974b;

    /* renamed from: c */
    private volatile C1889e f5975c;

    /* renamed from: d */
    private final List<C1886b> f5976d = new CopyOnWriteArrayList();

    /* renamed from: e */
    private final C1886b f5977e;

    /* renamed from: f */
    private final C1887c f5978f;

    /* renamed from: com.facebook.ads.internal.v.b.g$a */
    private static final class C1898a extends Handler implements C1886b {

        /* renamed from: a */
        private final String f5979a;

        /* renamed from: b */
        private final List<C1886b> f5980b;

        public C1898a(String str, List<C1886b> list) {
            super(Looper.getMainLooper());
            this.f5979a = str;
            this.f5980b = list;
        }

        /* renamed from: a */
        public void mo7923a(File file, String str, int i) {
            Message obtainMessage = obtainMessage();
            obtainMessage.arg1 = i;
            obtainMessage.obj = file;
            sendMessage(obtainMessage);
        }

        public void handleMessage(Message message) {
            for (C1886b a : this.f5980b) {
                a.mo7923a((File) message.obj, this.f5979a, message.arg1);
            }
        }
    }

    public C1897g(String str, C1887c cVar) {
        this.f5974b = (String) C1901j.m7935a(str);
        this.f5978f = (C1887c) C1901j.m7935a(cVar);
        this.f5977e = new C1898a(str, this.f5976d);
    }

    /* renamed from: c */
    private synchronized void m7922c() {
        C1889e eVar;
        if (this.f5975c == null) {
            eVar = new C1889e(new C1899h(this.f5974b), new C1877b(this.f5978f.mo7924a(this.f5974b), this.f5978f.f5946c));
            eVar.mo7927a(this.f5977e);
        } else {
            eVar = this.f5975c;
        }
        this.f5975c = eVar;
    }

    /* renamed from: d */
    private synchronized void m7923d() {
        if (this.f5973a.decrementAndGet() <= 0) {
            this.f5975c.mo7949a();
            this.f5975c = null;
        }
    }

    /* renamed from: a */
    public void mo7938a() {
        this.f5976d.clear();
        if (this.f5975c != null) {
            this.f5975c.mo7927a((C1886b) null);
            this.f5975c.mo7949a();
            this.f5975c = null;
        }
        this.f5973a.set(0);
    }

    /* renamed from: a */
    public void mo7939a(C1888d dVar, Socket socket) {
        m7922c();
        try {
            this.f5973a.incrementAndGet();
            this.f5975c.mo7928a(dVar, socket);
        } finally {
            m7923d();
        }
    }

    /* renamed from: b */
    public int mo7940b() {
        return this.f5973a.get();
    }
}
