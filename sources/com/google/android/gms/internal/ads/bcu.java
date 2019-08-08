package com.google.android.gms.internal.ads;

public abstract class bcu extends aja implements bct {
    public bcu() {
        super("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x004a, code lost:
        r3.writeNoException();
        com.google.android.gms.internal.ads.ajb.m14217a(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0099, code lost:
        r3.writeNoException();
        com.google.android.gms.internal.ads.ajb.m14215a(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00b4, code lost:
        r3.writeNoException();
        r3.writeString(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00bb, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x003c, code lost:
        r3.writeNoException();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean dispatchTransaction(int r1, android.os.Parcel r2, android.os.Parcel r3, int r4) throws android.os.RemoteException {
        /*
            r0 = this;
            switch(r1) {
                case 2: goto L_0x00b0;
                case 3: goto L_0x00a5;
                case 4: goto L_0x00a0;
                case 5: goto L_0x0095;
                case 6: goto L_0x0090;
                case 7: goto L_0x008b;
                case 8: goto L_0x0080;
                case 9: goto L_0x007b;
                case 10: goto L_0x0076;
                case 11: goto L_0x0071;
                case 12: goto L_0x006c;
                case 13: goto L_0x0067;
                case 14: goto L_0x0062;
                case 15: goto L_0x005d;
                case 16: goto L_0x0052;
                case 17: goto L_0x0046;
                case 18: goto L_0x0041;
                case 19: goto L_0x0039;
                case 20: goto L_0x002d;
                case 21: goto L_0x0011;
                case 22: goto L_0x0005;
                default: goto L_0x0003;
            }
        L_0x0003:
            r1 = 0
            return r1
        L_0x0005:
            android.os.IBinder r1 = r2.readStrongBinder()
            com.google.android.gms.b.a r1 = com.google.android.gms.p137b.C3235a.C3236a.m11572a(r1)
            r0.mo15155b(r1)
            goto L_0x003c
        L_0x0011:
            android.os.IBinder r1 = r2.readStrongBinder()
            com.google.android.gms.b.a r1 = com.google.android.gms.p137b.C3235a.C3236a.m11572a(r1)
            android.os.IBinder r4 = r2.readStrongBinder()
            com.google.android.gms.b.a r4 = com.google.android.gms.p137b.C3235a.C3236a.m11572a(r4)
            android.os.IBinder r2 = r2.readStrongBinder()
            com.google.android.gms.b.a r2 = com.google.android.gms.p137b.C3235a.C3236a.m11572a(r2)
            r0.mo15153a(r1, r4, r2)
            goto L_0x003c
        L_0x002d:
            android.os.IBinder r1 = r2.readStrongBinder()
            com.google.android.gms.b.a r1 = com.google.android.gms.p137b.C3235a.C3236a.m11572a(r1)
            r0.mo15152a(r1)
            goto L_0x003c
        L_0x0039:
            r0.mo15171r()
        L_0x003c:
            r3.writeNoException()
            goto L_0x00ba
        L_0x0041:
            boolean r1 = r0.mo15170q()
            goto L_0x004a
        L_0x0046:
            boolean r1 = r0.mo15169p()
        L_0x004a:
            r3.writeNoException()
            com.google.android.gms.internal.ads.ajb.m14217a(r3, r1)
            goto L_0x00ba
        L_0x0052:
            android.os.Bundle r1 = r0.mo15168o()
            r3.writeNoException()
            com.google.android.gms.internal.ads.ajb.m14220b(r3, r1)
            goto L_0x00ba
        L_0x005d:
            com.google.android.gms.b.a r1 = r0.mo15167n()
            goto L_0x0099
        L_0x0062:
            com.google.android.gms.b.a r1 = r0.mo15166m()
            goto L_0x0099
        L_0x0067:
            com.google.android.gms.b.a r1 = r0.mo15165l()
            goto L_0x0099
        L_0x006c:
            com.google.android.gms.internal.ads.aud r1 = r0.mo15164k()
            goto L_0x0099
        L_0x0071:
            com.google.android.gms.internal.ads.aqe r1 = r0.mo15163j()
            goto L_0x0099
        L_0x0076:
            java.lang.String r1 = r0.mo15162i()
            goto L_0x00b4
        L_0x007b:
            java.lang.String r1 = r0.mo15161h()
            goto L_0x00b4
        L_0x0080:
            double r1 = r0.mo15160g()
            r3.writeNoException()
            r3.writeDouble(r1)
            goto L_0x00ba
        L_0x008b:
            java.lang.String r1 = r0.mo15159f()
            goto L_0x00b4
        L_0x0090:
            java.lang.String r1 = r0.mo15158e()
            goto L_0x00b4
        L_0x0095:
            com.google.android.gms.internal.ads.auh r1 = r0.mo15157d()
        L_0x0099:
            r3.writeNoException()
            com.google.android.gms.internal.ads.ajb.m14215a(r3, r1)
            goto L_0x00ba
        L_0x00a0:
            java.lang.String r1 = r0.mo15156c()
            goto L_0x00b4
        L_0x00a5:
            java.util.List r1 = r0.mo15154b()
            r3.writeNoException()
            r3.writeList(r1)
            goto L_0x00ba
        L_0x00b0:
            java.lang.String r1 = r0.mo15151a()
        L_0x00b4:
            r3.writeNoException()
            r3.writeString(r1)
        L_0x00ba:
            r1 = 1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.bcu.dispatchTransaction(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
