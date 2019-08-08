package org.apache.p199a.p218f.p221c;

import java.io.IOException;
import java.net.ConnectException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.p199a.C6555l;
import org.apache.p199a.p208c.C6320d;
import org.apache.p199a.p208c.C6337l;
import org.apache.p199a.p208c.C6340o;
import org.apache.p199a.p208c.p211c.C6315b;
import org.apache.p199a.p208c.p211c.C6317d;
import org.apache.p199a.p208c.p211c.C6318e;
import org.apache.p199a.p227i.C6530c;
import org.apache.p199a.p227i.C6531d;
import org.apache.p199a.p228j.C6539e;

/* renamed from: org.apache.a.f.c.f */
/* compiled from: DefaultClientConnectionOperator */
public class C6428f implements C6320d {

    /* renamed from: a */
    protected final C6318e f21075a;

    /* renamed from: b */
    private final Log f21076b = LogFactory.getLog(getClass());

    public C6428f(C6318e eVar) {
        if (eVar == null) {
            throw new IllegalArgumentException("Scheme registry amy not be null");
        }
        this.f21075a = eVar;
    }

    /* renamed from: a */
    public C6340o mo22528a() {
        return new C6427e();
    }

    /* JADX WARNING: Removed duplicated region for block: B:50:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00b5 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00ea A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo22529a(org.apache.p199a.p208c.C6340o r18, org.apache.p199a.C6555l r19, java.net.InetAddress r20, org.apache.p199a.p228j.C6539e r21, org.apache.p199a.p227i.C6531d r22) throws java.io.IOException {
        /*
            r17 = this;
            r1 = r17
            r2 = r18
            r3 = r19
            r4 = r20
            r5 = r22
            if (r2 != 0) goto L_0x0014
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Connection may not be null"
            r2.<init>(r3)
            throw r2
        L_0x0014:
            if (r3 != 0) goto L_0x001e
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Target host may not be null"
            r2.<init>(r3)
            throw r2
        L_0x001e:
            if (r5 != 0) goto L_0x0028
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Parameters may not be null"
            r2.<init>(r3)
            throw r2
        L_0x0028:
            boolean r6 = r18.mo22781d()
            if (r6 == 0) goto L_0x0036
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "Connection must not be open"
            r2.<init>(r3)
            throw r2
        L_0x0036:
            org.apache.a.c.c.e r6 = r1.f21075a
            java.lang.String r7 = r19.mo23060c()
            org.apache.a.c.c.d r6 = r6.mo22524a(r7)
            org.apache.a.c.c.f r7 = r6.mo22518b()
            java.lang.String r8 = r19.mo23058a()
            java.net.InetAddress[] r8 = r1.mo22803a(r8)
            int r9 = r19.mo23059b()
            int r6 = r6.mo22517a(r9)
            r9 = 0
            r10 = r9
        L_0x0056:
            int r11 = r8.length
            if (r10 >= r11) goto L_0x00f1
            r11 = r8[r10]
            r12 = 1
            int r13 = r8.length
            int r13 = r13 - r12
            if (r10 != r13) goto L_0x0061
            goto L_0x0062
        L_0x0061:
            r12 = r9
        L_0x0062:
            java.net.Socket r13 = r7.mo22513a(r5)
            r2.mo22564a(r13, r3)
            java.net.InetSocketAddress r14 = new java.net.InetSocketAddress
            r14.<init>(r11, r6)
            r11 = 0
            if (r4 == 0) goto L_0x0076
            java.net.InetSocketAddress r11 = new java.net.InetSocketAddress
            r11.<init>(r4, r9)
        L_0x0076:
            org.apache.commons.logging.Log r15 = r1.f21076b
            boolean r15 = r15.isDebugEnabled()
            if (r15 == 0) goto L_0x0094
            org.apache.commons.logging.Log r15 = r1.f21076b
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r4 = "Connecting to "
            r9.append(r4)
            r9.append(r14)
            java.lang.String r4 = r9.toString()
            r15.debug(r4)
        L_0x0094:
            java.net.Socket r4 = r7.mo22512a(r13, r14, r11, r5)     // Catch:{ ConnectException -> 0x00b6, f -> 0x00af }
            if (r13 == r4) goto L_0x009e
            r2.mo22564a(r4, r3)     // Catch:{ ConnectException -> 0x00b6, f -> 0x00af }
            r13 = r4
        L_0x009e:
            r4 = r21
            r1.mo22802a(r13, r4, r5)     // Catch:{ ConnectException -> 0x00ad, f -> 0x00ab }
            boolean r9 = r7.mo22514a(r13)     // Catch:{ ConnectException -> 0x00ad, f -> 0x00ab }
            r2.mo22566a(r9, r5)     // Catch:{ ConnectException -> 0x00ad, f -> 0x00ab }
            return
        L_0x00ab:
            r0 = move-exception
            goto L_0x00b2
        L_0x00ad:
            r0 = move-exception
            goto L_0x00b9
        L_0x00af:
            r0 = move-exception
            r4 = r21
        L_0x00b2:
            r9 = r0
            if (r12 == 0) goto L_0x00c2
            throw r9
        L_0x00b6:
            r0 = move-exception
            r4 = r21
        L_0x00b9:
            r9 = r0
            if (r12 == 0) goto L_0x00c2
            org.apache.a.c.l r2 = new org.apache.a.c.l
            r2.<init>(r3, r9)
            throw r2
        L_0x00c2:
            org.apache.commons.logging.Log r9 = r1.f21076b
            boolean r9 = r9.isDebugEnabled()
            if (r9 == 0) goto L_0x00ea
            org.apache.commons.logging.Log r9 = r1.f21076b
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "Connect to "
            r11.append(r12)
            r11.append(r14)
            java.lang.String r12 = " timed out. "
            r11.append(r12)
            java.lang.String r12 = "Connection will be retried using another IP address"
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            r9.debug(r11)
        L_0x00ea:
            int r10 = r10 + 1
            r4 = r20
            r9 = 0
            goto L_0x0056
        L_0x00f1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.p199a.p218f.p221c.C6428f.mo22529a(org.apache.a.c.o, org.apache.a.l, java.net.InetAddress, org.apache.a.j.e, org.apache.a.i.d):void");
    }

    /* renamed from: a */
    public void mo22530a(C6340o oVar, C6555l lVar, C6539e eVar, C6531d dVar) throws IOException {
        if (oVar == null) {
            throw new IllegalArgumentException("Connection may not be null");
        } else if (lVar == null) {
            throw new IllegalArgumentException("Target host may not be null");
        } else if (dVar == null) {
            throw new IllegalArgumentException("Parameters may not be null");
        } else if (!oVar.mo22781d()) {
            throw new IllegalStateException("Connection must be open");
        } else {
            C6317d a = this.f21075a.mo22524a(lVar.mo23060c());
            if (!(a.mo22518b() instanceof C6315b)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Target scheme (");
                sb.append(a.mo22519c());
                sb.append(") must have layered socket factory.");
                throw new IllegalArgumentException(sb.toString());
            }
            C6315b bVar = (C6315b) a.mo22518b();
            try {
                Socket a2 = bVar.mo22511a(oVar.mo22568j(), lVar.mo23058a(), lVar.mo23059b(), true);
                mo22802a(a2, eVar, dVar);
                oVar.mo22565a(a2, lVar, bVar.mo22514a(a2), dVar);
            } catch (ConnectException e) {
                throw new C6337l(lVar, e);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo22802a(Socket socket, C6539e eVar, C6531d dVar) throws IOException {
        socket.setTcpNoDelay(C6530c.m25866c(dVar));
        socket.setSoTimeout(C6530c.m25860a(dVar));
        int e = C6530c.m25868e(dVar);
        if (e >= 0) {
            socket.setSoLinger(e > 0, e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public InetAddress[] mo22803a(String str) throws UnknownHostException {
        return InetAddress.getAllByName(str);
    }
}
