package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.C3142l;
import com.google.android.gms.ads.mediation.C3164m;
import com.google.android.gms.p137b.C3235a;
import com.google.android.gms.p137b.C3238b;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

public final class bdv extends bdq {

    /* renamed from: a */
    private final C4156sr f12696a;

    public bdv(C4156sr srVar) {
        this.f12696a = srVar;
    }

    /* renamed from: a */
    private static Bundle m16409a(String str) throws RemoteException {
        String str2 = "Server parameters: ";
        String valueOf = String.valueOf(str);
        C3987mk.m17435e(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
        try {
            Bundle bundle = new Bundle();
            if (str == null) {
                return bundle;
            }
            JSONObject jSONObject = new JSONObject(str);
            Bundle bundle2 = new Bundle();
            Iterator keys = jSONObject.keys();
            while (keys.hasNext()) {
                String str3 = (String) keys.next();
                bundle2.putString(str3, jSONObject.getString(str3));
            }
            return bundle2;
        } catch (JSONException e) {
            C3987mk.m17430b("", e);
            throw new RemoteException();
        }
    }

    /* renamed from: a */
    public final zzzt mo15180a() throws RemoteException {
        return zzzt.m18811a(this.f12696a.mo16058b());
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.google.android.gms.internal.ads.su, com.google.android.gms.internal.ads.bdy] */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r0v0, types: [com.google.android.gms.internal.ads.su, com.google.android.gms.internal.ads.bdy]
      assigns: [com.google.android.gms.internal.ads.bdy]
      uses: [com.google.android.gms.internal.ads.su]
      mth insns count: 52
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
    	at jadx.core.ProcessClass.process(ProcessClass.java:35)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo15181a(com.google.android.gms.p137b.C3235a r6, java.lang.String r7, android.os.Bundle r8, com.google.android.gms.internal.ads.bds r9) throws android.os.RemoteException {
        /*
            r5 = this;
            com.google.android.gms.internal.ads.bdy r0 = new com.google.android.gms.internal.ads.bdy     // Catch:{ Throwable -> 0x006e }
            r0.<init>(r5, r9)     // Catch:{ Throwable -> 0x006e }
            com.google.android.gms.internal.ads.sr r9 = r5.f12696a     // Catch:{ Throwable -> 0x006e }
            com.google.android.gms.internal.ads.st r1 = new com.google.android.gms.internal.ads.st     // Catch:{ Throwable -> 0x006e }
            java.lang.Object r6 = com.google.android.gms.p137b.C3238b.m11574a(r6)     // Catch:{ Throwable -> 0x006e }
            android.content.Context r6 = (android.content.Context) r6     // Catch:{ Throwable -> 0x006e }
            r2 = -1
            int r3 = r7.hashCode()     // Catch:{ Throwable -> 0x006e }
            r4 = -1396342996(0xffffffffacc57f2c, float:-5.6131957E-12)
            if (r3 == r4) goto L_0x0047
            r4 = -1052618729(0xffffffffc1425017, float:-12.144553)
            if (r3 == r4) goto L_0x003d
            r4 = -239580146(0xfffffffff1b84c0e, float:-1.82519E30)
            if (r3 == r4) goto L_0x0033
            r4 = 604727084(0x240b672c, float:3.022821E-17)
            if (r3 == r4) goto L_0x0029
            goto L_0x0050
        L_0x0029:
            java.lang.String r3 = "interstitial"
            boolean r7 = r7.equals(r3)     // Catch:{ Throwable -> 0x006e }
            if (r7 == 0) goto L_0x0050
            r2 = 1
            goto L_0x0050
        L_0x0033:
            java.lang.String r3 = "rewarded"
            boolean r7 = r7.equals(r3)     // Catch:{ Throwable -> 0x006e }
            if (r7 == 0) goto L_0x0050
            r2 = 2
            goto L_0x0050
        L_0x003d:
            java.lang.String r3 = "native"
            boolean r7 = r7.equals(r3)     // Catch:{ Throwable -> 0x006e }
            if (r7 == 0) goto L_0x0050
            r2 = 3
            goto L_0x0050
        L_0x0047:
            java.lang.String r3 = "banner"
            boolean r7 = r7.equals(r3)     // Catch:{ Throwable -> 0x006e }
            if (r7 == 0) goto L_0x0050
            r2 = 0
        L_0x0050:
            switch(r2) {
                case 0: goto L_0x005f;
                case 1: goto L_0x005c;
                case 2: goto L_0x0059;
                case 3: goto L_0x0056;
                default: goto L_0x0053;
            }     // Catch:{ Throwable -> 0x006e }
        L_0x0053:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException     // Catch:{ Throwable -> 0x006e }
            goto L_0x0068
        L_0x0056:
            int r7 = com.google.android.gms.internal.ads.C4157ss.f14063d     // Catch:{ Throwable -> 0x006e }
            goto L_0x0061
        L_0x0059:
            int r7 = com.google.android.gms.internal.ads.C4157ss.f14062c     // Catch:{ Throwable -> 0x006e }
            goto L_0x0061
        L_0x005c:
            int r7 = com.google.android.gms.internal.ads.C4157ss.f14061b     // Catch:{ Throwable -> 0x006e }
            goto L_0x0061
        L_0x005f:
            int r7 = com.google.android.gms.internal.ads.C4157ss.f14060a     // Catch:{ Throwable -> 0x006e }
        L_0x0061:
            r1.<init>(r6, r7, r8)     // Catch:{ Throwable -> 0x006e }
            r9.mo16057a(r1, r0)     // Catch:{ Throwable -> 0x006e }
            return
        L_0x0068:
            java.lang.String r7 = "Internal Error"
            r6.<init>(r7)     // Catch:{ Throwable -> 0x006e }
            throw r6     // Catch:{ Throwable -> 0x006e }
        L_0x006e:
            r6 = move-exception
            java.lang.String r7 = "Error generating signals for RTB"
            com.google.android.gms.internal.ads.C3987mk.m17430b(r7, r6)
            android.os.RemoteException r6 = new android.os.RemoteException
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.bdv.mo15181a(com.google.android.gms.b.a, java.lang.String, android.os.Bundle, com.google.android.gms.internal.ads.bds):void");
    }

    /* renamed from: a */
    public final void mo15182a(byte[] bArr, String str, Bundle bundle, C3235a aVar, bdl bdl, bcg bcg, zzjn zzjn) throws RemoteException {
        try {
            bdw bdw = new bdw(this, bdl, bcg);
            C4156sr srVar = this.f12696a;
            new C4155sq((Context) C3238b.m11574a(aVar), bArr, m16409a(str), bundle);
            C3142l.m11259a(zzjn.f14547e, zzjn.f14544b, zzjn.f14543a);
            bdw.mo15187a(String.valueOf(srVar.getClass().getSimpleName()).concat(" does not support banner."));
        } catch (Throwable th) {
            C3987mk.m17430b("Adapter failed to render banner ad.", th);
            throw new RemoteException();
        }
    }

    /* renamed from: a */
    public final void mo15183a(byte[] bArr, String str, Bundle bundle, C3235a aVar, bdn bdn, bcg bcg) throws RemoteException {
        try {
            bdx bdx = new bdx(this, bdn, bcg);
            C4156sr srVar = this.f12696a;
            new C4155sq((Context) C3238b.m11574a(aVar), bArr, m16409a(str), bundle);
            bdx.mo15187a(String.valueOf(srVar.getClass().getSimpleName()).concat(" does not support interstitial."));
        } catch (Throwable th) {
            C3987mk.m17430b("Adapter failed to render interstitial ad.", th);
            throw new RemoteException();
        }
    }

    /* renamed from: b */
    public final zzzt mo15184b() throws RemoteException {
        return zzzt.m18811a(this.f12696a.mo16056a());
    }

    /* renamed from: c */
    public final aqe mo15185c() {
        if (!(this.f12696a instanceof C3164m)) {
            return null;
        }
        try {
            return ((C3164m) this.f12696a).getVideoController();
        } catch (Throwable th) {
            C3987mk.m17430b("", th);
            return null;
        }
    }

    /* renamed from: d */
    public final void mo15186d() throws RemoteException {
        C4154sp spVar = null;
        try {
            spVar.mo16055a();
        } catch (Throwable th) {
            C3987mk.m17430b("", th);
            throw new RemoteException();
        }
    }
}
