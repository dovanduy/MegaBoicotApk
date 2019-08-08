package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.C3000i;
import com.google.android.gms.ads.formats.C2980a.C2981a;
import com.google.android.gms.ads.formats.C2980a.C2982b;
import com.google.android.gms.ads.formats.C2986d;
import com.google.android.gms.p137b.C3235a;
import java.util.ArrayList;
import java.util.List;

@C3718cm
public final class auz extends C2986d {

    /* renamed from: a */
    private final auw f12272a;

    /* renamed from: b */
    private final List<C2982b> f12273b = new ArrayList();

    /* renamed from: c */
    private final auk f12274c;

    /* renamed from: d */
    private final C3000i f12275d = new C3000i();

    /* renamed from: e */
    private final C2981a f12276e;

    /* JADX WARNING: Removed duplicated region for block: B:17:0x004a A[Catch:{ RemoteException -> 0x0055 }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x007a A[Catch:{ RemoteException -> 0x0087 }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0020 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public auz(com.google.android.gms.internal.ads.auw r5) {
        /*
            r4 = this;
            r4.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r4.f12273b = r0
            com.google.android.gms.ads.i r0 = new com.google.android.gms.ads.i
            r0.<init>()
            r4.f12275d = r0
            r4.f12272a = r5
            r5 = 0
            com.google.android.gms.internal.ads.auw r0 = r4.f12272a     // Catch:{ RemoteException -> 0x0055 }
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
            java.util.List<com.google.android.gms.ads.formats.a$b> r2 = r4.f12273b     // Catch:{ RemoteException -> 0x0055 }
            com.google.android.gms.internal.ads.auk r3 = new com.google.android.gms.internal.ads.auk     // Catch:{ RemoteException -> 0x0055 }
            r3.<init>(r1)     // Catch:{ RemoteException -> 0x0055 }
            r2.add(r3)     // Catch:{ RemoteException -> 0x0055 }
            goto L_0x0020
        L_0x0055:
            r0 = move-exception
            java.lang.String r1 = ""
            com.google.android.gms.internal.ads.C3987mk.m17430b(r1, r0)
        L_0x005b:
            com.google.android.gms.internal.ads.auw r0 = r4.f12272a     // Catch:{ RemoteException -> 0x0069 }
            com.google.android.gms.internal.ads.auh r0 = r0.mo14763d()     // Catch:{ RemoteException -> 0x0069 }
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
            r4.f12274c = r1
            com.google.android.gms.internal.ads.auw r0 = r4.f12272a     // Catch:{ RemoteException -> 0x0087 }
            com.google.android.gms.internal.ads.aud r0 = r0.mo14777r()     // Catch:{ RemoteException -> 0x0087 }
            if (r0 == 0) goto L_0x008d
            com.google.android.gms.internal.ads.aug r0 = new com.google.android.gms.internal.ads.aug     // Catch:{ RemoteException -> 0x0087 }
            com.google.android.gms.internal.ads.auw r1 = r4.f12272a     // Catch:{ RemoteException -> 0x0087 }
            com.google.android.gms.internal.ads.aud r1 = r1.mo14777r()     // Catch:{ RemoteException -> 0x0087 }
            r0.<init>(r1)     // Catch:{ RemoteException -> 0x0087 }
            r5 = r0
            goto L_0x008d
        L_0x0087:
            r0 = move-exception
            java.lang.String r1 = ""
            com.google.android.gms.internal.ads.C3987mk.m17430b(r1, r0)
        L_0x008d:
            r4.f12276e = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.auz.<init>(com.google.android.gms.internal.ads.auw):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public final C3235a mo12325a() {
        try {
            return this.f12272a.mo14769j();
        } catch (RemoteException e) {
            C3987mk.m17430b("", e);
            return null;
        }
    }

    /* renamed from: b */
    public final CharSequence mo12342b() {
        try {
            return this.f12272a.mo14756a();
        } catch (RemoteException e) {
            C3987mk.m17430b("", e);
            return null;
        }
    }

    /* renamed from: c */
    public final List<C2982b> mo12343c() {
        return this.f12273b;
    }

    /* renamed from: d */
    public final CharSequence mo12344d() {
        try {
            return this.f12272a.mo14761c();
        } catch (RemoteException e) {
            C3987mk.m17430b("", e);
            return null;
        }
    }

    /* renamed from: e */
    public final C2982b mo12345e() {
        return this.f12274c;
    }

    /* renamed from: f */
    public final CharSequence mo12346f() {
        try {
            return this.f12272a.mo14764e();
        } catch (RemoteException e) {
            C3987mk.m17430b("", e);
            return null;
        }
    }

    /* renamed from: g */
    public final Double mo12347g() {
        try {
            double f = this.f12272a.mo14765f();
            if (f == -1.0d) {
                return null;
            }
            return Double.valueOf(f);
        } catch (RemoteException e) {
            C3987mk.m17430b("", e);
            return null;
        }
    }

    /* renamed from: h */
    public final CharSequence mo12348h() {
        try {
            return this.f12272a.mo14766g();
        } catch (RemoteException e) {
            C3987mk.m17430b("", e);
            return null;
        }
    }

    /* renamed from: i */
    public final CharSequence mo12349i() {
        try {
            return this.f12272a.mo14767h();
        } catch (RemoteException e) {
            C3987mk.m17430b("", e);
            return null;
        }
    }

    /* renamed from: j */
    public final C3000i mo12350j() {
        try {
            if (this.f12272a.mo14768i() != null) {
                this.f12275d.mo12375a(this.f12272a.mo14768i());
            }
        } catch (RemoteException e) {
            C3987mk.m17430b("Exception occurred while getting video controller", e);
        }
        return this.f12275d;
    }
}
