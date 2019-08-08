package com.facebook.ads.internal.p095v.p097b;

import android.content.Context;
import android.os.SystemClock;
import android.util.Log;
import com.facebook.ads.internal.p095v.p097b.p098a.C1876a;
import com.facebook.ads.internal.p095v.p097b.p098a.C1878c;
import com.facebook.ads.internal.p095v.p097b.p098a.C1884f;
import com.facebook.ads.internal.p095v.p097b.p098a.C1885g;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: com.facebook.ads.internal.v.b.f */
public class C1890f {

    /* renamed from: a */
    private final Object f5955a;

    /* renamed from: b */
    private final ExecutorService f5956b;

    /* renamed from: c */
    private final Map<String, C1897g> f5957c;

    /* renamed from: d */
    private final ServerSocket f5958d;

    /* renamed from: e */
    private final int f5959e;

    /* renamed from: f */
    private final Thread f5960f;

    /* renamed from: g */
    private final C1887c f5961g;

    /* renamed from: h */
    private boolean f5962h;

    /* renamed from: com.facebook.ads.internal.v.b.f$a */
    public static final class C1892a {

        /* renamed from: a */
        private File f5963a;

        /* renamed from: b */
        private C1878c f5964b = new C1884f();

        /* renamed from: c */
        private C1876a f5965c = new C1885g(67108864);

        public C1892a(Context context) {
            this.f5963a = C1908o.m7955a(context);
        }

        /* renamed from: a */
        static /* synthetic */ C1887c m7919a(C1892a aVar) {
            return new C1887c(aVar.f5963a, aVar.f5964b, aVar.f5965c);
        }
    }

    /* renamed from: com.facebook.ads.internal.v.b.f$b */
    private class C1893b implements Callable<Boolean> {
        private C1893b() {
        }

        /* renamed from: a */
        public Boolean call() {
            return Boolean.valueOf(C1890f.this.m7911c());
        }
    }

    /* renamed from: com.facebook.ads.internal.v.b.f$c */
    private class C1894c implements Callable<Boolean> {

        /* renamed from: b */
        private final String f5968b;

        public C1894c(String str) {
            this.f5968b = str;
        }

        /* renamed from: a */
        public Boolean call() {
            return Boolean.valueOf(C1890f.this.m7912c(this.f5968b));
        }
    }

    /* renamed from: com.facebook.ads.internal.v.b.f$d */
    private final class C1895d implements Runnable {

        /* renamed from: b */
        private final Socket f5970b;

        public C1895d(Socket socket) {
            this.f5970b = socket;
        }

        public void run() {
            C1890f.m7905a(C1890f.this, this.f5970b);
        }
    }

    /* renamed from: com.facebook.ads.internal.v.b.f$e */
    private final class C1896e implements Runnable {

        /* renamed from: b */
        private final CountDownLatch f5972b;

        public C1896e(CountDownLatch countDownLatch) {
            this.f5972b = countDownLatch;
        }

        public void run() {
            this.f5972b.countDown();
            C1890f.m7904a(C1890f.this);
        }
    }

    public C1890f(Context context) {
        this(C1892a.m7919a(new C1892a(context)));
    }

    private C1890f(C1887c cVar) {
        this.f5955a = new Object();
        this.f5956b = Executors.newFixedThreadPool(8);
        this.f5957c = new ConcurrentHashMap();
        this.f5961g = (C1887c) C1901j.m7935a(cVar);
        try {
            this.f5958d = new ServerSocket(0, 8, InetAddress.getByName("127.0.0.1"));
            this.f5959e = this.f5958d.getLocalPort();
            CountDownLatch countDownLatch = new CountDownLatch(1);
            this.f5960f = new Thread(new C1896e(countDownLatch));
            this.f5960f.start();
            countDownLatch.await();
            Log.i("ProxyCache", "Proxy cache server started. Ping it...");
            m7909b();
        } catch (IOException | InterruptedException e) {
            this.f5956b.shutdown();
            throw new IllegalStateException("Error starting local proxy server", e);
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m7904a(C1890f fVar) {
        while (!Thread.currentThread().isInterrupted()) {
            try {
                Socket accept = fVar.f5958d.accept();
                StringBuilder sb = new StringBuilder();
                sb.append("Accept new socket ");
                sb.append(accept);
                Log.d("ProxyCache", sb.toString());
                fVar.f5956b.submit(new C1895d(accept));
            } catch (IOException e) {
                fVar.m7906a((Throwable) new C1905l("Error during waiting connection", e));
                return;
            }
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m7905a(C1890f fVar, Socket socket) {
        String str;
        StringBuilder sb;
        try {
            C1888d a = C1888d.m7898a(socket.getInputStream());
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Request to cache proxy:");
            sb2.append(a);
            Log.i("ProxyCache", sb2.toString());
            String b = C1906m.m7949b(a.f5949a);
            if ("ping".equals(b)) {
                OutputStream outputStream = socket.getOutputStream();
                outputStream.write("HTTP/1.1 200 OK\n\n".getBytes());
                outputStream.write("ping ok".getBytes());
            } else {
                fVar.m7915e(b).mo7939a(a, socket);
            }
            fVar.m7907a(socket);
            str = "ProxyCache";
            sb = new StringBuilder();
        } catch (SocketException unused) {
            Log.d("ProxyCache", "Closing socket... Socket is closed by client.");
            fVar.m7907a(socket);
            str = "ProxyCache";
            sb = new StringBuilder();
        } catch (C1905l | IOException e) {
            fVar.m7906a((Throwable) new C1905l("Error processing request", e));
            fVar.m7907a(socket);
            str = "ProxyCache";
            sb = new StringBuilder();
        } catch (Throwable th) {
            fVar.m7907a(socket);
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Opened connections: ");
            sb3.append(fVar.m7913d());
            Log.d("ProxyCache", sb3.toString());
            throw th;
        }
        sb.append("Opened connections: ");
        sb.append(fVar.m7913d());
        Log.d(str, sb.toString());
    }

    /* renamed from: a */
    private void m7906a(Throwable th) {
        Log.e("ProxyCache", "HttpProxyCacheServer error", th);
    }

    /* renamed from: a */
    private void m7907a(Socket socket) {
        try {
            if (!socket.isInputShutdown()) {
                socket.shutdownInput();
            }
        } catch (SocketException unused) {
            Log.d("ProxyCache", "Releasing input stream... Socket is closed by client.");
        } catch (IOException e) {
            m7906a((Throwable) new C1905l("Error closing socket input stream", e));
        }
        try {
            if (socket.isOutputShutdown()) {
                socket.shutdownOutput();
            }
        } catch (IOException e2) {
            m7906a((Throwable) new C1905l("Error closing socket output stream", e2));
        }
        try {
            if (!socket.isClosed()) {
                socket.close();
            }
        } catch (IOException e3) {
            m7906a((Throwable) new C1905l("Error closing socket", e3));
        }
    }

    /* renamed from: b */
    private void m7909b() {
        int i = 300;
        int i2 = 0;
        while (i2 < 3) {
            try {
                Future submit = this.f5956b.submit(new C1893b());
                long j = (long) i;
                this.f5962h = ((Boolean) submit.get(j, TimeUnit.MILLISECONDS)).booleanValue();
                if (!this.f5962h) {
                    SystemClock.sleep(j);
                    i2++;
                    i *= 2;
                } else {
                    return;
                }
            } catch (InterruptedException | ExecutionException | TimeoutException e) {
                StringBuilder sb = new StringBuilder();
                sb.append("Error pinging server [attempt: ");
                sb.append(i2);
                sb.append(", timeout: ");
                sb.append(i);
                sb.append("]. ");
                Log.e("ProxyCache", sb.toString(), e);
            }
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Shutdown server... Error pinging server [attempts: ");
        sb2.append(i2);
        sb2.append(", max timeout: ");
        sb2.append(i / 2);
        sb2.append("].");
        Log.e("ProxyCache", sb2.toString());
        mo7929a();
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public boolean m7911c() {
        C1899h hVar = new C1899h(m7914d("ping"));
        try {
            byte[] bytes = "ping ok".getBytes();
            hVar.mo7944a(0);
            byte[] bArr = new byte[bytes.length];
            hVar.mo7943a(bArr);
            boolean equals = Arrays.equals(bytes, bArr);
            StringBuilder sb = new StringBuilder();
            sb.append("Ping response: `");
            sb.append(new String(bArr));
            sb.append("`, pinged? ");
            sb.append(equals);
            Log.d("ProxyCache", sb.toString());
            return equals;
        } catch (C1905l e) {
            Log.e("ProxyCache", "Error reading ping response", e);
            return false;
        } finally {
            hVar.mo7945b();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public boolean m7912c(String str) {
        C1899h hVar = new C1899h(m7914d(str));
        try {
            hVar.mo7944a(0);
            do {
            } while (hVar.mo7943a(new byte[8192]) != -1);
            hVar.mo7945b();
            return true;
        } catch (C1905l e) {
            Log.e("ProxyCache", "Error reading url", e);
            hVar.mo7945b();
            return false;
        } catch (Throwable th) {
            hVar.mo7945b();
            throw th;
        }
    }

    /* renamed from: d */
    private int m7913d() {
        int i;
        synchronized (this.f5955a) {
            i = 0;
            for (C1897g b : this.f5957c.values()) {
                i += b.mo7940b();
            }
        }
        return i;
    }

    /* renamed from: d */
    private String m7914d(String str) {
        return String.format(Locale.US, "http://%s:%d/%s", new Object[]{"127.0.0.1", Integer.valueOf(this.f5959e), C1906m.m7947a(str)});
    }

    /* renamed from: e */
    private C1897g m7915e(String str) {
        C1897g gVar;
        synchronized (this.f5955a) {
            gVar = (C1897g) this.f5957c.get(str);
            if (gVar == null) {
                gVar = new C1897g(str, this.f5961g);
                this.f5957c.put(str, gVar);
            }
        }
        return gVar;
    }

    /* renamed from: a */
    public void mo7929a() {
        Log.i("ProxyCache", "Shutdown proxy server");
        synchronized (this.f5955a) {
            for (C1897g a : this.f5957c.values()) {
                a.mo7938a();
            }
            this.f5957c.clear();
        }
        this.f5960f.interrupt();
        try {
            if (!this.f5958d.isClosed()) {
                this.f5958d.close();
            }
        } catch (IOException e) {
            m7906a((Throwable) new C1905l("Error shutting down proxy server", e));
        }
    }

    /* renamed from: a */
    public boolean mo7930a(String str) {
        int i = 300;
        int i2 = 0;
        while (i2 < 3) {
            try {
                if (((Boolean) this.f5956b.submit(new C1894c(str)).get()).booleanValue()) {
                    return true;
                }
                SystemClock.sleep((long) i);
                i2++;
                i *= 2;
            } catch (InterruptedException | ExecutionException e) {
                StringBuilder sb = new StringBuilder();
                sb.append("Error precaching url [attempt: ");
                sb.append(i2);
                sb.append(", url: ");
                sb.append(str);
                sb.append("]. ");
                Log.e("ProxyCache", sb.toString(), e);
            }
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Shutdown server... Error precaching url [attempts: ");
        sb2.append(i2);
        sb2.append(", url: ");
        sb2.append(str);
        sb2.append("].");
        Log.e("ProxyCache", sb2.toString());
        mo7929a();
        return false;
    }

    /* renamed from: b */
    public String mo7931b(String str) {
        if (!this.f5962h) {
            Log.e("ProxyCache", "Proxy server isn't pinged. Caching doesn't work.");
        }
        return this.f5962h ? m7914d(str) : str;
    }
}
