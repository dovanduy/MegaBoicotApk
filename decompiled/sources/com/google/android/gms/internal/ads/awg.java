package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.C3000i;
import com.google.android.gms.ads.formats.C2980a.C2981a;
import com.google.android.gms.ads.formats.C2980a.C2982b;
import com.google.android.gms.ads.formats.C2993g;
import com.google.android.gms.p137b.C3235a;
import com.google.android.gms.p137b.C3238b;
import java.util.ArrayList;
import java.util.List;

@C3718cm
public final class awg extends C2993g {

    /* renamed from: a */
    private final awd f12309a;

    /* renamed from: b */
    private final List<C2982b> f12310b = new ArrayList();

    /* renamed from: c */
    private final auk f12311c;

    /* renamed from: d */
    private final C3000i f12312d = new C3000i();

    /* renamed from: e */
    private final C2981a f12313e;

    /* JADX WARNING: Removed duplicated region for block: B:17:0x004a A[Catch:{ RemoteException -> 0x0055 }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x007a A[Catch:{ RemoteException -> 0x0087 }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0020 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public awg(com.google.android.gms.internal.ads.awd r5) {
        /*
            r4 = this;
            r4.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r4.f12310b = r0
            com.google.android.gms.ads.i r0 = new com.google.android.gms.ads.i
            r0.<init>()
            r4.f12312d = r0
            r4.f12309a = r5
            r5 = 0
            com.google.android.gms.internal.ads.awd r0 = r4.f12309a     // Catch:{ RemoteException -> 0x0055 }
            java.util.List r0 = r0.mo14759b()     // Catch:{ RemoteException -> 0x0055 }
            if (r0 == 0) goto L_0x005b
            java.util.Iterator r0 = r0.iterator()     // Catch:{ RemoteException -> 0x0055 }
        L_0x0020:
            boolean r1 = r0.hasNext()     // Catch:{ RemoteException -> 0x0055 }
            if (r1 == 0) goto L_0x005b
            java.lang.Object r1 = r0.next()     // Catch:{ RemoteException -> 0x0055 }
            boolean r2 = r1 instanceof android.os.IBinder     // Catch:{ RemoteException -> 0x0055 }
            if (r2 == 0) goto L_0x0047
            android.os.IBinder r1 = (android.os.IBinder) r1     // Catch:{ RemoteException -> 0x0055 }
            if (r1 == 0) goto L_0x0047
            java.lang.String r2 = "com.google.android.gms.ads.internal.formats.client.INativeAdImage"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)     // Catch:{ RemoteException -> 0x0055 }
            boolean r3 = r2 instanceof com.google.android.gms.internal.ads.auh     // Catch:{ RemoteException -> 0x0055 }
            if (r3 == 0) goto L_0x0040
            r1 = r2
            com.google.android.gms.internal.ads.auh r1 = (com.google.android.gms.internal.ads.auh) r1     // Catch:{ RemoteException -> 0x0055 }
            goto L_0x0048
        L_0x0040:
            com.google.android.gms.internal.ads.auj r2 = new com.google.android.gms.internal.ads.auj     // Catch:{ RemoteException -> 0x0055 }
            r2.<init>(r1)     // Catch:{ RemoteException -> 0x0055 }
            r1 = r2
            goto L_0x0048
        L_0x0047:
            r1 = r5
        L_0x0048:
            if (r1 == 0) goto L_0x0020
            java.util.List<com.google.android.gms.ads.formats.a$b> r2 = r4.f12310b     // Catch:{ RemoteException -> 0x0055 }
            com.google.android.gms.internal.ads.auk r3 = new com.google.android.gms.internal.ads.auk     // Catch:{ RemoteException -> 0x0055 }
            r3.<init>(r1)     // Catch:{ RemoteException -> 0x0055 }
            r2.add(r3)     // Catch:{ RemoteException -> 0x0055 }
            goto L_0x0020
        L_0x0055:
            r0 = move-exception
            java.lang.String r1 = ""
            com.google.android.gms.internal.ads.C3987mk.m17430b(r1, r0)
        L_0x005b:
            com.google.android.gms.internal.ads.awd r0 = r4.f12309a     // Catch:{ RemoteException -> 0x0069 }
            com.google.android.gms.internal.ads.auh r0 = r0.mo14815d()     // Catch:{ RemoteException -> 0x0069 }
            if (r0 == 0) goto L_0x006f
            com.google.android.gms.internal.ads.auk r1 = new com.google.android.gms.internal.ads.auk     // Catch:{ RemoteException -> 0x0069 }
            r1.<init>(r0)     // Catch:{ RemoteException -> 0x0069 }
            goto L_0x0070
        L_0x0069:
            r0 = move-exception
            java.lang.String r1 = ""
            com.google.android.gms.internal.ads.C3987mk.m17430b(r1, r0)
        L_0x006f:
            r1 = r5
        L_0x0070:
            r4.f12311c = r1
            com.google.android.gms.internal.ads.awd r0 = r4.f12309a     // Catch:{ RemoteException -> 0x0087 }
            com.google.android.gms.internal.ads.aud r0 = r0.mo14826s()     // Catch:{ RemoteException -> 0x0087 }
            if (r0 == 0) goto L_0x008d
            com.google.android.gms.internal.ads.aug r0 = new com.google.android.gms.internal.ads.aug     // Catch:{ RemoteException -> 0x0087 }
            com.google.android.gms.internal.ads.awd r1 = r4.f12309a     // Catch:{ RemoteException -> 0x0087 }
            com.google.android.gms.internal.ads.aud r1 = r1.mo14826s()     // Catch:{ RemoteException -> 0x0087 }
            r0.<init>(r1)     // Catch:{ RemoteException -> 0x0087 }
            r5 = r0
            goto L_0x008d
        L_0x0087:
            r0 = move-exception
            java.lang.String r1 = ""
            com.google.android.gms.internal.ads.C3987mk.m17430b(r1, r0)
        L_0x008d:
            r4.f12313e = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.awg.<init>(com.google.android.gms.internal.ads.awd):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public final C3235a mo12369k() {
        try {
            return this.f12309a.mo14822n();
        } catch (RemoteException e) {
            C3987mk.m17430b("", e);
            return null;
        }
    }

    /* renamed from: a */
    public final String mo12359a() {
        try {
            return this.f12309a.mo14809a();
        } catch (RemoteException e) {
            C3987mk.m17430b("", e);
            return null;
        }
    }

    /* renamed from: b */
    public final List<C2982b> mo12360b() {
        return this.f12310b;
    }

    /* renamed from: c */
    public final String mo12361c() {
        try {
            return this.f12309a.mo14813c();
        } catch (RemoteException e) {
            C3987mk.m17430b("", e);
            return null;
        }
    }

    /* renamed from: d */
    public final C2982b mo12362d() {
        return this.f12311c;
    }

    /* renamed from: e */
    public final String mo12363e() {
        try {
            return this.f12309a.mo14816e();
        } catch (RemoteException e) {
            C3987mk.m17430b("", e);
            return null;
        }
    }

    /* renamed from: f */
    public final String mo12364f() {
        try {
            return this.f12309a.mo14817f();
        } catch (RemoteException e) {
            C3987mk.m17430b("", e);
            return null;
        }
    }

    /* renamed from: g */
    public final Double mo12365g() {
        try {
            double g = this.f12309a.mo14818g();
            if (g == -1.0d) {
                return null;
            }
            return Double.valueOf(g);
        } catch (RemoteException e) {
            C3987mk.m17430b("", e);
            return null;
        }
    }

    /* renamed from: h */
    public final String mo12366h() {
        try {
            return this.f12309a.mo14819h();
        } catch (RemoteException e) {
            C3987mk.m17430b("", e);
            return null;
        }
    }

    /* renamed from: i */
    public final String mo12367i() {
        try {
            return this.f12309a.mo14820i();
        } catch (RemoteException e) {
            C3987mk.m17430b("", e);
            return null;
        }
    }

    /* renamed from: j */
    public final C3000i mo12368j() {
        try {
            if (this.f12309a.mo14821j() != null) {
                this.f12312d.mo12375a(this.f12309a.mo14821j());
            }
        } catch (RemoteException e) {
            C3987mk.m17430b("Exception occurred while getting video controller", e);
        }
        return this.f12312d;
    }

    /* renamed from: l */
    public final Object mo12370l() {
        try {
            C3235a p = this.f12309a.mo14823p();
            if (p != null) {
                return C3238b.m11574a(p);
            }
        } catch (RemoteException e) {
            C3987mk.m17430b("", e);
        }
        return null;
    }
}
