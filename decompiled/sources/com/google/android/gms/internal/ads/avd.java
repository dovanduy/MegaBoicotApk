package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.C3000i;
import com.google.android.gms.ads.formats.C2980a.C2981a;
import com.google.android.gms.ads.formats.C2980a.C2982b;
import com.google.android.gms.ads.formats.C2988e;
import com.google.android.gms.p137b.C3235a;
import java.util.ArrayList;
import java.util.List;

@C3718cm
public final class avd extends C2988e {

    /* renamed from: a */
    private final ava f12279a;

    /* renamed from: b */
    private final List<C2982b> f12280b = new ArrayList();

    /* renamed from: c */
    private final auk f12281c;

    /* renamed from: d */
    private final C3000i f12282d = new C3000i();

    /* renamed from: e */
    private final C2981a f12283e;

    /* JADX WARNING: Removed duplicated region for block: B:17:0x004a A[Catch:{ RemoteException -> 0x0055 }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x007a A[Catch:{ RemoteException -> 0x0087 }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0020 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public avd(com.google.android.gms.internal.ads.ava r5) {
        /*
            r4 = this;
            r4.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r4.f12280b = r0
            com.google.android.gms.ads.i r0 = new com.google.android.gms.ads.i
            r0.<init>()
            r4.f12282d = r0
            r4.f12279a = r5
            r5 = 0
            com.google.android.gms.internal.ads.ava r0 = r4.f12279a     // Catch:{ RemoteException -> 0x0055 }
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
            java.util.List<com.google.android.gms.ads.formats.a$b> r2 = r4.f12280b     // Catch:{ RemoteException -> 0x0055 }
            com.google.android.gms.internal.ads.auk r3 = new com.google.android.gms.internal.ads.auk     // Catch:{ RemoteException -> 0x0055 }
            r3.<init>(r1)     // Catch:{ RemoteException -> 0x0055 }
            r2.add(r3)     // Catch:{ RemoteException -> 0x0055 }
            goto L_0x0020
        L_0x0055:
            r0 = move-exception
            java.lang.String r1 = ""
            com.google.android.gms.internal.ads.C3987mk.m17430b(r1, r0)
        L_0x005b:
            com.google.android.gms.internal.ads.ava r0 = r4.f12279a     // Catch:{ RemoteException -> 0x0069 }
            com.google.android.gms.internal.ads.auh r0 = r0.mo14787f()     // Catch:{ RemoteException -> 0x0069 }
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
            r4.f12281c = r1
            com.google.android.gms.internal.ads.ava r0 = r4.f12279a     // Catch:{ RemoteException -> 0x0087 }
            com.google.android.gms.internal.ads.aud r0 = r0.mo14793p()     // Catch:{ RemoteException -> 0x0087 }
            if (r0 == 0) goto L_0x008d
            com.google.android.gms.internal.ads.aug r0 = new com.google.android.gms.internal.ads.aug     // Catch:{ RemoteException -> 0x0087 }
            com.google.android.gms.internal.ads.ava r1 = r4.f12279a     // Catch:{ RemoteException -> 0x0087 }
            com.google.android.gms.internal.ads.aud r1 = r1.mo14793p()     // Catch:{ RemoteException -> 0x0087 }
            r0.<init>(r1)     // Catch:{ RemoteException -> 0x0087 }
            r5 = r0
            goto L_0x008d
        L_0x0087:
            r0 = move-exception
            java.lang.String r1 = ""
            com.google.android.gms.internal.ads.C3987mk.m17430b(r1, r0)
        L_0x008d:
            r4.f12283e = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.avd.<init>(com.google.android.gms.internal.ads.ava):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public final C3235a mo12325a() {
        try {
            return this.f12279a.mo14791j();
        } catch (RemoteException e) {
            C3987mk.m17430b("", e);
            return null;
        }
    }

    /* renamed from: b */
    public final CharSequence mo12351b() {
        try {
            return this.f12279a.mo14780a();
        } catch (RemoteException e) {
            C3987mk.m17430b("", e);
            return null;
        }
    }

    /* renamed from: c */
    public final List<C2982b> mo12352c() {
        return this.f12280b;
    }

    /* renamed from: d */
    public final CharSequence mo12353d() {
        try {
            return this.f12279a.mo14786e();
        } catch (RemoteException e) {
            C3987mk.m17430b("", e);
            return null;
        }
    }

    /* renamed from: e */
    public final C2982b mo12354e() {
        return this.f12281c;
    }

    /* renamed from: f */
    public final CharSequence mo12355f() {
        try {
            return this.f12279a.mo14788g();
        } catch (RemoteException e) {
            C3987mk.m17430b("", e);
            return null;
        }
    }

    /* renamed from: g */
    public final CharSequence mo12356g() {
        try {
            return this.f12279a.mo14789h();
        } catch (RemoteException e) {
            C3987mk.m17430b("", e);
            return null;
        }
    }

    /* renamed from: h */
    public final C3000i mo12357h() {
        try {
            if (this.f12279a.mo14790i() != null) {
                this.f12282d.mo12375a(this.f12279a.mo14790i());
            }
        } catch (RemoteException e) {
            C3987mk.m17430b("Exception occurred while getting video controller", e);
        }
        return this.f12282d;
    }
}
