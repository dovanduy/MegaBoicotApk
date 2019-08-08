package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.gms.internal.ads.gd */
public abstract class C3818gd extends aja implements C3816gb {
    public C3818gd() {
        super("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
    }

    /* renamed from: a */
    public static C3816gb m16720a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
        return queryLocalInterface instanceof C3816gb ? (C3816gb) queryLocalInterface : new C3819ge(iBinder);
    }

    /* JADX WARNING: type inference failed for: r4v2 */
    /* JADX WARNING: type inference failed for: r4v3, types: [com.google.android.gms.internal.ads.gh] */
    /* JADX WARNING: type inference failed for: r4v5, types: [com.google.android.gms.internal.ads.gj] */
    /* JADX WARNING: type inference failed for: r4v7, types: [com.google.android.gms.internal.ads.gh] */
    /* JADX WARNING: type inference failed for: r4v8, types: [com.google.android.gms.internal.ads.fz] */
    /* JADX WARNING: type inference failed for: r4v10, types: [com.google.android.gms.internal.ads.ga] */
    /* JADX WARNING: type inference failed for: r4v12, types: [com.google.android.gms.internal.ads.fz] */
    /* JADX WARNING: type inference failed for: r4v13 */
    /* JADX WARNING: type inference failed for: r4v14 */
    /* JADX WARNING: type inference failed for: r4v15 */
    /* JADX WARNING: type inference failed for: r4v16 */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r4v2
      assigns: [?[int, float, boolean, short, byte, char, OBJECT, ARRAY], com.google.android.gms.internal.ads.ga, com.google.android.gms.internal.ads.gj, com.google.android.gms.internal.ads.gh, com.google.android.gms.internal.ads.fz]
      uses: [com.google.android.gms.internal.ads.gh, com.google.android.gms.internal.ads.fz]
      mth insns count: 64
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
    /* JADX WARNING: Unknown variable types count: 5 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean dispatchTransaction(int r1, android.os.Parcel r2, android.os.Parcel r3, int r4) throws android.os.RemoteException {
        /*
            r0 = this;
            r4 = 34
            if (r1 == r4) goto L_0x00c6
            r4 = 0
            switch(r1) {
                case 1: goto L_0x00b7;
                case 2: goto L_0x00b3;
                case 3: goto L_0x0095;
                default: goto L_0x0008;
            }
        L_0x0008:
            switch(r1) {
                case 5: goto L_0x008a;
                case 6: goto L_0x0086;
                case 7: goto L_0x0082;
                case 8: goto L_0x007e;
                case 9: goto L_0x0072;
                case 10: goto L_0x0066;
                case 11: goto L_0x005a;
                case 12: goto L_0x004e;
                case 13: goto L_0x0045;
                case 14: goto L_0x0038;
                case 15: goto L_0x002c;
                case 16: goto L_0x000d;
                default: goto L_0x000b;
            }
        L_0x000b:
            r1 = 0
            return r1
        L_0x000d:
            android.os.IBinder r1 = r2.readStrongBinder()
            if (r1 != 0) goto L_0x0014
            goto L_0x0027
        L_0x0014:
            java.lang.String r2 = "com.google.android.gms.ads.internal.reward.client.IRewardedAdSkuListener"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r4 = r2 instanceof com.google.android.gms.internal.ads.C3813fz
            if (r4 == 0) goto L_0x0022
            r4 = r2
            com.google.android.gms.internal.ads.fz r4 = (com.google.android.gms.internal.ads.C3813fz) r4
            goto L_0x0027
        L_0x0022:
            com.google.android.gms.internal.ads.ga r4 = new com.google.android.gms.internal.ads.ga
            r4.<init>(r1)
        L_0x0027:
            r0.mo14657a(r4)
            goto L_0x00c2
        L_0x002c:
            android.os.Bundle r1 = r0.mo14662b()
            r3.writeNoException()
            com.google.android.gms.internal.ads.ajb.m14220b(r3, r1)
            goto L_0x00ce
        L_0x0038:
            android.os.IBinder r1 = r2.readStrongBinder()
            com.google.android.gms.internal.ads.apm r1 = com.google.android.gms.internal.ads.apn.m14748a(r1)
            r0.mo14656a(r1)
            goto L_0x00c2
        L_0x0045:
            java.lang.String r1 = r2.readString()
            r0.mo14660a(r1)
            goto L_0x00c2
        L_0x004e:
            java.lang.String r1 = r0.mo14669g()
            r3.writeNoException()
            r3.writeString(r1)
            goto L_0x00ce
        L_0x005a:
            android.os.IBinder r1 = r2.readStrongBinder()
            com.google.android.gms.b.a r1 = com.google.android.gms.p137b.C3235a.C3236a.m11572a(r1)
            r0.mo14664c(r1)
            goto L_0x00c2
        L_0x0066:
            android.os.IBinder r1 = r2.readStrongBinder()
            com.google.android.gms.b.a r1 = com.google.android.gms.p137b.C3235a.C3236a.m11572a(r1)
            r0.mo14663b(r1)
            goto L_0x00c2
        L_0x0072:
            android.os.IBinder r1 = r2.readStrongBinder()
            com.google.android.gms.b.a r1 = com.google.android.gms.p137b.C3235a.C3236a.m11572a(r1)
            r0.mo14655a(r1)
            goto L_0x00c2
        L_0x007e:
            r0.mo14668f()
            goto L_0x00c2
        L_0x0082:
            r0.mo14667e()
            goto L_0x00c2
        L_0x0086:
            r0.mo14666d()
            goto L_0x00c2
        L_0x008a:
            boolean r1 = r0.mo14665c()
            r3.writeNoException()
            com.google.android.gms.internal.ads.ajb.m14217a(r3, r1)
            goto L_0x00ce
        L_0x0095:
            android.os.IBinder r1 = r2.readStrongBinder()
            if (r1 != 0) goto L_0x009c
            goto L_0x00af
        L_0x009c:
            java.lang.String r2 = "com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r4 = r2 instanceof com.google.android.gms.internal.ads.C3822gh
            if (r4 == 0) goto L_0x00aa
            r4 = r2
            com.google.android.gms.internal.ads.gh r4 = (com.google.android.gms.internal.ads.C3822gh) r4
            goto L_0x00af
        L_0x00aa:
            com.google.android.gms.internal.ads.gj r4 = new com.google.android.gms.internal.ads.gj
            r4.<init>(r1)
        L_0x00af:
            r0.mo14658a(r4)
            goto L_0x00c2
        L_0x00b3:
            r0.mo14654a()
            goto L_0x00c2
        L_0x00b7:
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzahk> r1 = com.google.android.gms.internal.ads.zzahk.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.internal.ads.ajb.m14214a(r2, r1)
            com.google.android.gms.internal.ads.zzahk r1 = (com.google.android.gms.internal.ads.zzahk) r1
            r0.mo14659a(r1)
        L_0x00c2:
            r3.writeNoException()
            goto L_0x00ce
        L_0x00c6:
            boolean r1 = com.google.android.gms.internal.ads.ajb.m14218a(r2)
            r0.mo14661a(r1)
            goto L_0x00c2
        L_0x00ce:
            r1 = 1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C3818gd.dispatchTransaction(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
