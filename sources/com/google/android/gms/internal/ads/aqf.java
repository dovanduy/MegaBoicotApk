package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

public abstract class aqf extends aja implements aqe {
    public aqf() {
        super("com.google.android.gms.ads.internal.client.IVideoController");
    }

    /* renamed from: a */
    public static aqe m14787a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoController");
        return queryLocalInterface instanceof aqe ? (aqe) queryLocalInterface : new aqg(iBinder);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0048, code lost:
        r3.writeNoException();
        r3.writeFloat(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005e, code lost:
        r3.writeNoException();
        com.google.android.gms.internal.ads.ajb.m14217a(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0074, code lost:
        r3.writeNoException();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0078, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean dispatchTransaction(int r1, android.os.Parcel r2, android.os.Parcel r3, int r4) throws android.os.RemoteException {
        /*
            r0 = this;
            switch(r1) {
                case 1: goto L_0x0071;
                case 2: goto L_0x006d;
                case 3: goto L_0x0065;
                case 4: goto L_0x005a;
                case 5: goto L_0x004f;
                case 6: goto L_0x0044;
                case 7: goto L_0x003f;
                case 8: goto L_0x001f;
                case 9: goto L_0x001a;
                case 10: goto L_0x0015;
                case 11: goto L_0x000a;
                case 12: goto L_0x0005;
                default: goto L_0x0003;
            }
        L_0x0003:
            r1 = 0
            return r1
        L_0x0005:
            boolean r1 = r0.mo14575j()
            goto L_0x005e
        L_0x000a:
            com.google.android.gms.internal.ads.aqh r1 = r0.mo14573h()
            r3.writeNoException()
            com.google.android.gms.internal.ads.ajb.m14215a(r3, r1)
            goto L_0x0077
        L_0x0015:
            boolean r1 = r0.mo14574i()
            goto L_0x005e
        L_0x001a:
            float r1 = r0.mo14570e()
            goto L_0x0048
        L_0x001f:
            android.os.IBinder r1 = r2.readStrongBinder()
            if (r1 != 0) goto L_0x0027
            r1 = 0
            goto L_0x003b
        L_0x0027:
            java.lang.String r2 = "com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r4 = r2 instanceof com.google.android.gms.internal.ads.aqh
            if (r4 == 0) goto L_0x0035
            r1 = r2
            com.google.android.gms.internal.ads.aqh r1 = (com.google.android.gms.internal.ads.aqh) r1
            goto L_0x003b
        L_0x0035:
            com.google.android.gms.internal.ads.aqj r2 = new com.google.android.gms.internal.ads.aqj
            r2.<init>(r1)
            r1 = r2
        L_0x003b:
            r0.mo14565a(r1)
            goto L_0x0074
        L_0x003f:
            float r1 = r0.mo14572g()
            goto L_0x0048
        L_0x0044:
            float r1 = r0.mo14571f()
        L_0x0048:
            r3.writeNoException()
            r3.writeFloat(r1)
            goto L_0x0077
        L_0x004f:
            int r1 = r0.mo14569d()
            r3.writeNoException()
            r3.writeInt(r1)
            goto L_0x0077
        L_0x005a:
            boolean r1 = r0.mo14568c()
        L_0x005e:
            r3.writeNoException()
            com.google.android.gms.internal.ads.ajb.m14217a(r3, r1)
            goto L_0x0077
        L_0x0065:
            boolean r1 = com.google.android.gms.internal.ads.ajb.m14218a(r2)
            r0.mo14566a(r1)
            goto L_0x0074
        L_0x006d:
            r0.mo14567b()
            goto L_0x0074
        L_0x0071:
            r0.mo14564a()
        L_0x0074:
            r3.writeNoException()
        L_0x0077:
            r1 = 1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.aqf.dispatchTransaction(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
