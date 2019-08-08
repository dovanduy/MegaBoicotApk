package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.gms.internal.ads.api */
public abstract class C3666api extends aja implements aph {
    public C3666api() {
        super("com.google.android.gms.ads.internal.client.IAdManager");
    }

    /* renamed from: a */
    public static aph m14711a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
        return queryLocalInterface instanceof aph ? (aph) queryLocalInterface : new apj(iBinder);
    }

    /* JADX WARNING: type inference failed for: r4v1 */
    /* JADX WARNING: type inference failed for: r4v2, types: [com.google.android.gms.internal.ads.aow] */
    /* JADX WARNING: type inference failed for: r4v4, types: [com.google.android.gms.internal.ads.aoy] */
    /* JADX WARNING: type inference failed for: r4v6, types: [com.google.android.gms.internal.ads.aow] */
    /* JADX WARNING: type inference failed for: r4v7, types: [com.google.android.gms.internal.ads.apq] */
    /* JADX WARNING: type inference failed for: r4v9, types: [com.google.android.gms.internal.ads.aps] */
    /* JADX WARNING: type inference failed for: r4v11, types: [com.google.android.gms.internal.ads.apq] */
    /* JADX WARNING: type inference failed for: r4v12, types: [com.google.android.gms.internal.ads.aot] */
    /* JADX WARNING: type inference failed for: r4v14, types: [com.google.android.gms.internal.ads.aov] */
    /* JADX WARNING: type inference failed for: r4v16, types: [com.google.android.gms.internal.ads.aot] */
    /* JADX WARNING: type inference failed for: r4v17, types: [com.google.android.gms.internal.ads.apw] */
    /* JADX WARNING: type inference failed for: r4v19, types: [com.google.android.gms.internal.ads.apy] */
    /* JADX WARNING: type inference failed for: r4v21, types: [com.google.android.gms.internal.ads.apw] */
    /* JADX WARNING: type inference failed for: r4v22, types: [com.google.android.gms.internal.ads.apm] */
    /* JADX WARNING: type inference failed for: r4v24, types: [com.google.android.gms.internal.ads.apo] */
    /* JADX WARNING: type inference failed for: r4v26, types: [com.google.android.gms.internal.ads.apm] */
    /* JADX WARNING: type inference failed for: r4v27 */
    /* JADX WARNING: type inference failed for: r4v28 */
    /* JADX WARNING: type inference failed for: r4v29 */
    /* JADX WARNING: type inference failed for: r4v30 */
    /* JADX WARNING: type inference failed for: r4v31 */
    /* JADX WARNING: type inference failed for: r4v32 */
    /* JADX WARNING: type inference failed for: r4v33 */
    /* JADX WARNING: type inference failed for: r4v34 */
    /* JADX WARNING: type inference failed for: r4v35 */
    /* JADX WARNING: type inference failed for: r4v36 */
    /* JADX INFO: used method not loaded: com.google.android.gms.internal.ads.ajb.a(android.os.Parcel, boolean):null, types can be incorrect */
    /* JADX INFO: used method not loaded: com.google.android.gms.internal.ads.ajb.a(android.os.Parcel, android.os.IInterface):null, types can be incorrect */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00e0, code lost:
        r3.writeNoException();
        r3.writeString(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0117, code lost:
        r3.writeNoException();
        com.google.android.gms.internal.ads.ajb.m14220b(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0182, code lost:
        r3.writeNoException();
        com.google.android.gms.internal.ads.ajb.m14217a(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x018c, code lost:
        r3.writeNoException();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0194, code lost:
        r3.writeNoException();
        com.google.android.gms.internal.ads.ajb.m14215a(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x019b, code lost:
        return true;
     */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r4v1
      assigns: [?[int, float, boolean, short, byte, char, OBJECT, ARRAY], com.google.android.gms.internal.ads.aps, com.google.android.gms.internal.ads.aoy, com.google.android.gms.internal.ads.aow, com.google.android.gms.internal.ads.apq, com.google.android.gms.internal.ads.aov, com.google.android.gms.internal.ads.aot, com.google.android.gms.internal.ads.apy, com.google.android.gms.internal.ads.apw, com.google.android.gms.internal.ads.apo, com.google.android.gms.internal.ads.apm]
      uses: [com.google.android.gms.internal.ads.aow, com.google.android.gms.internal.ads.apq, com.google.android.gms.internal.ads.aot, com.google.android.gms.internal.ads.apw, com.google.android.gms.internal.ads.apm]
      mth insns count: 125
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
    /* JADX WARNING: Unknown variable types count: 11 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean dispatchTransaction(int r1, android.os.Parcel r2, android.os.Parcel r3, int r4) throws android.os.RemoteException {
        /*
            r0 = this;
            r4 = 0
            switch(r1) {
                case 1: goto L_0x0190;
                case 2: goto L_0x0189;
                case 3: goto L_0x017e;
                case 4: goto L_0x0171;
                case 5: goto L_0x016d;
                case 6: goto L_0x0169;
                case 7: goto L_0x014b;
                case 8: goto L_0x012d;
                case 9: goto L_0x0129;
                case 10: goto L_0x0124;
                case 11: goto L_0x011f;
                case 12: goto L_0x0113;
                case 13: goto L_0x0106;
                case 14: goto L_0x00f9;
                case 15: goto L_0x00e8;
                case 16: goto L_0x0004;
                case 17: goto L_0x0004;
                case 18: goto L_0x00dc;
                case 19: goto L_0x00cf;
                case 20: goto L_0x00b0;
                case 21: goto L_0x0091;
                case 22: goto L_0x0088;
                case 23: goto L_0x0082;
                case 24: goto L_0x0075;
                case 25: goto L_0x006c;
                case 26: goto L_0x0066;
                case 27: goto L_0x0004;
                case 28: goto L_0x0004;
                case 29: goto L_0x0059;
                case 30: goto L_0x004c;
                case 31: goto L_0x0046;
                case 32: goto L_0x0040;
                case 33: goto L_0x003a;
                case 34: goto L_0x0031;
                case 35: goto L_0x002b;
                case 36: goto L_0x000c;
                case 37: goto L_0x0006;
                default: goto L_0x0004;
            }
        L_0x0004:
            r1 = 0
            return r1
        L_0x0006:
            android.os.Bundle r1 = r0.mo12444q()
            goto L_0x0117
        L_0x000c:
            android.os.IBinder r1 = r2.readStrongBinder()
            if (r1 != 0) goto L_0x0013
            goto L_0x0026
        L_0x0013:
            java.lang.String r2 = "com.google.android.gms.ads.internal.client.IAdMetadataListener"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r4 = r2 instanceof com.google.android.gms.internal.ads.apm
            if (r4 == 0) goto L_0x0021
            r4 = r2
            com.google.android.gms.internal.ads.apm r4 = (com.google.android.gms.internal.ads.apm) r4
            goto L_0x0026
        L_0x0021:
            com.google.android.gms.internal.ads.apo r4 = new com.google.android.gms.internal.ads.apo
            r4.<init>(r1)
        L_0x0026:
            r0.mo12407a(r4)
            goto L_0x018c
        L_0x002b:
            java.lang.String r1 = r0.mo12509u_()
            goto L_0x00e0
        L_0x0031:
            boolean r1 = com.google.android.gms.internal.ads.ajb.m14218a(r2)
            r0.mo12432c(r1)
            goto L_0x018c
        L_0x003a:
            com.google.android.gms.internal.ads.aow r1 = r0.mo12397F()
            goto L_0x0194
        L_0x0040:
            com.google.android.gms.internal.ads.apq r1 = r0.mo12396E()
            goto L_0x0194
        L_0x0046:
            java.lang.String r1 = r0.mo12395D()
            goto L_0x00e0
        L_0x004c:
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzlu> r1 = com.google.android.gms.internal.ads.zzlu.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.internal.ads.ajb.m14214a(r2, r1)
            com.google.android.gms.internal.ads.zzlu r1 = (com.google.android.gms.internal.ads.zzlu) r1
            r0.mo12418a(r1)
            goto L_0x018c
        L_0x0059:
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzmu> r1 = com.google.android.gms.internal.ads.zzmu.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.internal.ads.ajb.m14214a(r2, r1)
            com.google.android.gms.internal.ads.zzmu r1 = (com.google.android.gms.internal.ads.zzmu) r1
            r0.mo12419a(r1)
            goto L_0x018c
        L_0x0066:
            com.google.android.gms.internal.ads.aqe r1 = r0.mo12447t()
            goto L_0x0194
        L_0x006c:
            java.lang.String r1 = r2.readString()
            r0.mo12420a(r1)
            goto L_0x018c
        L_0x0075:
            android.os.IBinder r1 = r2.readStrongBinder()
            com.google.android.gms.internal.ads.gh r1 = com.google.android.gms.internal.ads.C3823gi.m16747a(r1)
            r0.mo12413a(r1)
            goto L_0x018c
        L_0x0082:
            boolean r1 = r0.mo12446s()
            goto L_0x0182
        L_0x0088:
            boolean r1 = com.google.android.gms.internal.ads.ajb.m14218a(r2)
            r0.mo12430b(r1)
            goto L_0x018c
        L_0x0091:
            android.os.IBinder r1 = r2.readStrongBinder()
            if (r1 != 0) goto L_0x0098
            goto L_0x00ab
        L_0x0098:
            java.lang.String r2 = "com.google.android.gms.ads.internal.client.ICorrelationIdProvider"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r4 = r2 instanceof com.google.android.gms.internal.ads.apw
            if (r4 == 0) goto L_0x00a6
            r4 = r2
            com.google.android.gms.internal.ads.apw r4 = (com.google.android.gms.internal.ads.apw) r4
            goto L_0x00ab
        L_0x00a6:
            com.google.android.gms.internal.ads.apy r4 = new com.google.android.gms.internal.ads.apy
            r4.<init>(r1)
        L_0x00ab:
            r0.mo12409a(r4)
            goto L_0x018c
        L_0x00b0:
            android.os.IBinder r1 = r2.readStrongBinder()
            if (r1 != 0) goto L_0x00b7
            goto L_0x00ca
        L_0x00b7:
            java.lang.String r2 = "com.google.android.gms.ads.internal.client.IAdClickListener"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r4 = r2 instanceof com.google.android.gms.internal.ads.aot
            if (r4 == 0) goto L_0x00c5
            r4 = r2
            com.google.android.gms.internal.ads.aot r4 = (com.google.android.gms.internal.ads.aot) r4
            goto L_0x00ca
        L_0x00c5:
            com.google.android.gms.internal.ads.aov r4 = new com.google.android.gms.internal.ads.aov
            r4.<init>(r1)
        L_0x00ca:
            r0.mo12405a(r4)
            goto L_0x018c
        L_0x00cf:
            android.os.IBinder r1 = r2.readStrongBinder()
            com.google.android.gms.internal.ads.aso r1 = com.google.android.gms.internal.ads.asp.m15078a(r1)
            r0.mo12411a(r1)
            goto L_0x018c
        L_0x00dc:
            java.lang.String r1 = r0.mo12504a()
        L_0x00e0:
            r3.writeNoException()
            r3.writeString(r1)
            goto L_0x019a
        L_0x00e8:
            android.os.IBinder r1 = r2.readStrongBinder()
            com.google.android.gms.internal.ads.af r1 = com.google.android.gms.internal.ads.C3650ag.m14045a(r1)
            java.lang.String r2 = r2.readString()
            r0.mo12404a(r1, r2)
            goto L_0x018c
        L_0x00f9:
            android.os.IBinder r1 = r2.readStrongBinder()
            com.google.android.gms.internal.ads.y r1 = com.google.android.gms.internal.ads.C4362z.m18701a(r1)
            r0.mo12416a(r1)
            goto L_0x018c
        L_0x0106:
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzjn> r1 = com.google.android.gms.internal.ads.zzjn.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.internal.ads.ajb.m14214a(r2, r1)
            com.google.android.gms.internal.ads.zzjn r1 = (com.google.android.gms.internal.ads.zzjn) r1
            r0.mo12417a(r1)
            goto L_0x018c
        L_0x0113:
            com.google.android.gms.internal.ads.zzjn r1 = r0.mo12439l()
        L_0x0117:
            r3.writeNoException()
            com.google.android.gms.internal.ads.ajb.m14220b(r3, r1)
            goto L_0x019a
        L_0x011f:
            r0.mo12441n()
            goto L_0x018c
        L_0x0124:
            r0.mo12445r()
            goto L_0x018c
        L_0x0129:
            r0.mo12456I()
            goto L_0x018c
        L_0x012d:
            android.os.IBinder r1 = r2.readStrongBinder()
            if (r1 != 0) goto L_0x0134
            goto L_0x0147
        L_0x0134:
            java.lang.String r2 = "com.google.android.gms.ads.internal.client.IAppEventListener"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r4 = r2 instanceof com.google.android.gms.internal.ads.apq
            if (r4 == 0) goto L_0x0142
            r4 = r2
            com.google.android.gms.internal.ads.apq r4 = (com.google.android.gms.internal.ads.apq) r4
            goto L_0x0147
        L_0x0142:
            com.google.android.gms.internal.ads.aps r4 = new com.google.android.gms.internal.ads.aps
            r4.<init>(r1)
        L_0x0147:
            r0.mo12408a(r4)
            goto L_0x018c
        L_0x014b:
            android.os.IBinder r1 = r2.readStrongBinder()
            if (r1 != 0) goto L_0x0152
            goto L_0x0165
        L_0x0152:
            java.lang.String r2 = "com.google.android.gms.ads.internal.client.IAdListener"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r4 = r2 instanceof com.google.android.gms.internal.ads.aow
            if (r4 == 0) goto L_0x0160
            r4 = r2
            com.google.android.gms.internal.ads.aow r4 = (com.google.android.gms.internal.ads.aow) r4
            goto L_0x0165
        L_0x0160:
            com.google.android.gms.internal.ads.aoy r4 = new com.google.android.gms.internal.ads.aoy
            r4.<init>(r1)
        L_0x0165:
            r0.mo12406a(r4)
            goto L_0x018c
        L_0x0169:
            r0.mo12443p()
            goto L_0x018c
        L_0x016d:
            r0.mo12442o()
            goto L_0x018c
        L_0x0171:
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzjj> r1 = com.google.android.gms.internal.ads.zzjj.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.internal.ads.ajb.m14214a(r2, r1)
            com.google.android.gms.internal.ads.zzjj r1 = (com.google.android.gms.internal.ads.zzjj) r1
            boolean r1 = r0.mo12431b(r1)
            goto L_0x0182
        L_0x017e:
            boolean r1 = r0.mo12440m()
        L_0x0182:
            r3.writeNoException()
            com.google.android.gms.internal.ads.ajb.m14217a(r3, r1)
            goto L_0x019a
        L_0x0189:
            r0.mo12437j()
        L_0x018c:
            r3.writeNoException()
            goto L_0x019a
        L_0x0190:
            com.google.android.gms.b.a r1 = r0.mo12438k()
        L_0x0194:
            r3.writeNoException()
            com.google.android.gms.internal.ads.ajb.m14215a(r3, r1)
        L_0x019a:
            r1 = 1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C3666api.dispatchTransaction(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
