package com.google.android.gms.internal.ads;

public abstract class apa extends aja implements aoz {
    public apa() {
        super("com.google.android.gms.ads.internal.client.IAdLoader");
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003f, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0029, code lost:
        r3.writeNoException();
        r3.writeString(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x003b, code lost:
        r3.writeNoException();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean dispatchTransaction(int r1, android.os.Parcel r2, android.os.Parcel r3, int r4) throws android.os.RemoteException {
        /*
            r0 = this;
            switch(r1) {
                case 1: goto L_0x0030;
                case 2: goto L_0x0025;
                case 3: goto L_0x001a;
                case 4: goto L_0x0015;
                case 5: goto L_0x0005;
                default: goto L_0x0003;
            }
        L_0x0003:
            r1 = 0
            return r1
        L_0x0005:
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzjj> r1 = com.google.android.gms.internal.ads.zzjj.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.internal.ads.ajb.m14214a(r2, r1)
            com.google.android.gms.internal.ads.zzjj r1 = (com.google.android.gms.internal.ads.zzjj) r1
            int r2 = r2.readInt()
            r0.mo12633a(r1, r2)
            goto L_0x003b
        L_0x0015:
            java.lang.String r1 = r0.mo12634b()
            goto L_0x0029
        L_0x001a:
            boolean r1 = r0.mo12635c()
            r3.writeNoException()
            com.google.android.gms.internal.ads.ajb.m14217a(r3, r1)
            goto L_0x003e
        L_0x0025:
            java.lang.String r1 = r0.mo12631a()
        L_0x0029:
            r3.writeNoException()
            r3.writeString(r1)
            goto L_0x003e
        L_0x0030:
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzjj> r1 = com.google.android.gms.internal.ads.zzjj.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.internal.ads.ajb.m14214a(r2, r1)
            com.google.android.gms.internal.ads.zzjj r1 = (com.google.android.gms.internal.ads.zzjj) r1
            r0.mo12632a(r1)
        L_0x003b:
            r3.writeNoException()
        L_0x003e:
            r1 = 1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.apa.dispatchTransaction(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}