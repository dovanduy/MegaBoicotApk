package com.google.android.gms.internal.ads;

public abstract class bce extends aja implements bcd {
    public bce() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0070, code lost:
        r11.writeNoException();
        com.google.android.gms.internal.ads.ajb.m14220b(r11, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00cf, code lost:
        r11.writeNoException();
        com.google.android.gms.internal.ads.ajb.m14217a(r11, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x01a2, code lost:
        r11.writeNoException();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x01dc, code lost:
        r11.writeNoException();
        com.google.android.gms.internal.ads.ajb.m14215a(r11, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0223, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean dispatchTransaction(int r9, android.os.Parcel r10, android.os.Parcel r11, int r12) throws android.os.RemoteException {
        /*
            r8 = this;
            r12 = 0
            switch(r9) {
                case 1: goto L_0x01e3;
                case 2: goto L_0x01d8;
                case 3: goto L_0x01a7;
                case 4: goto L_0x019f;
                case 5: goto L_0x019b;
                case 6: goto L_0x0158;
                case 7: goto L_0x011e;
                case 8: goto L_0x0119;
                case 9: goto L_0x0114;
                case 10: goto L_0x00ed;
                case 11: goto L_0x00dc;
                case 12: goto L_0x00d7;
                case 13: goto L_0x00cb;
                case 14: goto L_0x0084;
                case 15: goto L_0x007e;
                case 16: goto L_0x0078;
                case 17: goto L_0x006c;
                case 18: goto L_0x0067;
                case 19: goto L_0x0062;
                case 20: goto L_0x004d;
                case 21: goto L_0x0040;
                case 22: goto L_0x003a;
                case 23: goto L_0x0021;
                case 24: goto L_0x001b;
                case 25: goto L_0x0012;
                case 26: goto L_0x000c;
                case 27: goto L_0x0006;
                default: goto L_0x0004;
            }
        L_0x0004:
            r9 = 0
            return r9
        L_0x0006:
            com.google.android.gms.internal.ads.bct r9 = r8.mo15109p()
            goto L_0x01dc
        L_0x000c:
            com.google.android.gms.internal.ads.aqe r9 = r8.mo15108o()
            goto L_0x01dc
        L_0x0012:
            boolean r9 = com.google.android.gms.internal.ads.ajb.m14218a(r10)
            r8.mo15094a(r9)
            goto L_0x01a2
        L_0x001b:
            com.google.android.gms.internal.ads.ave r9 = r8.mo15107n()
            goto L_0x01dc
        L_0x0021:
            android.os.IBinder r9 = r10.readStrongBinder()
            com.google.android.gms.b.a r9 = com.google.android.gms.p137b.C3235a.C3236a.m11572a(r9)
            android.os.IBinder r12 = r10.readStrongBinder()
            com.google.android.gms.internal.ads.hf r12 = com.google.android.gms.internal.ads.C3848hg.m16848a(r12)
            java.util.ArrayList r10 = r10.createStringArrayList()
            r8.mo15085a(r9, r12, r10)
            goto L_0x01a2
        L_0x003a:
            boolean r9 = r8.mo15106m()
            goto L_0x00cf
        L_0x0040:
            android.os.IBinder r9 = r10.readStrongBinder()
            com.google.android.gms.b.a r9 = com.google.android.gms.p137b.C3235a.C3236a.m11572a(r9)
            r8.mo15084a(r9)
            goto L_0x01a2
        L_0x004d:
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzjj> r9 = com.google.android.gms.internal.ads.zzjj.CREATOR
            android.os.Parcelable r9 = com.google.android.gms.internal.ads.ajb.m14214a(r10, r9)
            com.google.android.gms.internal.ads.zzjj r9 = (com.google.android.gms.internal.ads.zzjj) r9
            java.lang.String r12 = r10.readString()
            java.lang.String r10 = r10.readString()
            r8.mo15093a(r9, r12, r10)
            goto L_0x01a2
        L_0x0062:
            android.os.Bundle r9 = r8.mo15105l()
            goto L_0x0070
        L_0x0067:
            android.os.Bundle r9 = r8.mo15104k()
            goto L_0x0070
        L_0x006c:
            android.os.Bundle r9 = r8.mo15103j()
        L_0x0070:
            r11.writeNoException()
            com.google.android.gms.internal.ads.ajb.m14220b(r11, r9)
            goto L_0x0222
        L_0x0078:
            com.google.android.gms.internal.ads.bcq r9 = r8.mo15102i()
            goto L_0x01dc
        L_0x007e:
            com.google.android.gms.internal.ads.bcm r9 = r8.mo15101h()
            goto L_0x01dc
        L_0x0084:
            android.os.IBinder r9 = r10.readStrongBinder()
            com.google.android.gms.b.a r1 = com.google.android.gms.p137b.C3235a.C3236a.m11572a(r9)
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzjj> r9 = com.google.android.gms.internal.ads.zzjj.CREATOR
            android.os.Parcelable r9 = com.google.android.gms.internal.ads.ajb.m14214a(r10, r9)
            r2 = r9
            com.google.android.gms.internal.ads.zzjj r2 = (com.google.android.gms.internal.ads.zzjj) r2
            java.lang.String r3 = r10.readString()
            java.lang.String r4 = r10.readString()
            android.os.IBinder r9 = r10.readStrongBinder()
            if (r9 != 0) goto L_0x00a5
        L_0x00a3:
            r5 = r12
            goto L_0x00b8
        L_0x00a5:
            java.lang.String r12 = "com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener"
            android.os.IInterface r12 = r9.queryLocalInterface(r12)
            boolean r0 = r12 instanceof com.google.android.gms.internal.ads.bcg
            if (r0 == 0) goto L_0x00b2
            com.google.android.gms.internal.ads.bcg r12 = (com.google.android.gms.internal.ads.bcg) r12
            goto L_0x00a3
        L_0x00b2:
            com.google.android.gms.internal.ads.bci r12 = new com.google.android.gms.internal.ads.bci
            r12.<init>(r9)
            goto L_0x00a3
        L_0x00b8:
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzpl> r9 = com.google.android.gms.internal.ads.zzpl.CREATOR
            android.os.Parcelable r9 = com.google.android.gms.internal.ads.ajb.m14214a(r10, r9)
            r6 = r9
            com.google.android.gms.internal.ads.zzpl r6 = (com.google.android.gms.internal.ads.zzpl) r6
            java.util.ArrayList r7 = r10.createStringArrayList()
            r0 = r8
            r0.mo15089a(r1, r2, r3, r4, r5, r6, r7)
            goto L_0x01a2
        L_0x00cb:
            boolean r9 = r8.mo15100g()
        L_0x00cf:
            r11.writeNoException()
            com.google.android.gms.internal.ads.ajb.m14217a(r11, r9)
            goto L_0x0222
        L_0x00d7:
            r8.mo15099f()
            goto L_0x01a2
        L_0x00dc:
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzjj> r9 = com.google.android.gms.internal.ads.zzjj.CREATOR
            android.os.Parcelable r9 = com.google.android.gms.internal.ads.ajb.m14214a(r10, r9)
            com.google.android.gms.internal.ads.zzjj r9 = (com.google.android.gms.internal.ads.zzjj) r9
            java.lang.String r10 = r10.readString()
            r8.mo15092a(r9, r10)
            goto L_0x01a2
        L_0x00ed:
            android.os.IBinder r9 = r10.readStrongBinder()
            com.google.android.gms.b.a r1 = com.google.android.gms.p137b.C3235a.C3236a.m11572a(r9)
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzjj> r9 = com.google.android.gms.internal.ads.zzjj.CREATOR
            android.os.Parcelable r9 = com.google.android.gms.internal.ads.ajb.m14214a(r10, r9)
            r2 = r9
            com.google.android.gms.internal.ads.zzjj r2 = (com.google.android.gms.internal.ads.zzjj) r2
            java.lang.String r3 = r10.readString()
            android.os.IBinder r9 = r10.readStrongBinder()
            com.google.android.gms.internal.ads.hf r4 = com.google.android.gms.internal.ads.C3848hg.m16848a(r9)
            java.lang.String r5 = r10.readString()
            r0 = r8
            r0.mo15087a(r1, r2, r3, r4, r5)
            goto L_0x01a2
        L_0x0114:
            r8.mo15098e()
            goto L_0x01a2
        L_0x0119:
            r8.mo15097d()
            goto L_0x01a2
        L_0x011e:
            android.os.IBinder r9 = r10.readStrongBinder()
            com.google.android.gms.b.a r1 = com.google.android.gms.p137b.C3235a.C3236a.m11572a(r9)
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzjj> r9 = com.google.android.gms.internal.ads.zzjj.CREATOR
            android.os.Parcelable r9 = com.google.android.gms.internal.ads.ajb.m14214a(r10, r9)
            r2 = r9
            com.google.android.gms.internal.ads.zzjj r2 = (com.google.android.gms.internal.ads.zzjj) r2
            java.lang.String r3 = r10.readString()
            java.lang.String r4 = r10.readString()
            android.os.IBinder r9 = r10.readStrongBinder()
            if (r9 != 0) goto L_0x013f
        L_0x013d:
            r5 = r12
            goto L_0x0153
        L_0x013f:
            java.lang.String r10 = "com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener"
            android.os.IInterface r10 = r9.queryLocalInterface(r10)
            boolean r12 = r10 instanceof com.google.android.gms.internal.ads.bcg
            if (r12 == 0) goto L_0x014d
            r12 = r10
            com.google.android.gms.internal.ads.bcg r12 = (com.google.android.gms.internal.ads.bcg) r12
            goto L_0x013d
        L_0x014d:
            com.google.android.gms.internal.ads.bci r12 = new com.google.android.gms.internal.ads.bci
            r12.<init>(r9)
            goto L_0x013d
        L_0x0153:
            r0 = r8
            r0.mo15088a(r1, r2, r3, r4, r5)
            goto L_0x01a2
        L_0x0158:
            android.os.IBinder r9 = r10.readStrongBinder()
            com.google.android.gms.b.a r1 = com.google.android.gms.p137b.C3235a.C3236a.m11572a(r9)
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzjn> r9 = com.google.android.gms.internal.ads.zzjn.CREATOR
            android.os.Parcelable r9 = com.google.android.gms.internal.ads.ajb.m14214a(r10, r9)
            r2 = r9
            com.google.android.gms.internal.ads.zzjn r2 = (com.google.android.gms.internal.ads.zzjn) r2
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzjj> r9 = com.google.android.gms.internal.ads.zzjj.CREATOR
            android.os.Parcelable r9 = com.google.android.gms.internal.ads.ajb.m14214a(r10, r9)
            r3 = r9
            com.google.android.gms.internal.ads.zzjj r3 = (com.google.android.gms.internal.ads.zzjj) r3
            java.lang.String r4 = r10.readString()
            java.lang.String r5 = r10.readString()
            android.os.IBinder r9 = r10.readStrongBinder()
            if (r9 != 0) goto L_0x0182
        L_0x0180:
            r6 = r12
            goto L_0x0196
        L_0x0182:
            java.lang.String r10 = "com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener"
            android.os.IInterface r10 = r9.queryLocalInterface(r10)
            boolean r12 = r10 instanceof com.google.android.gms.internal.ads.bcg
            if (r12 == 0) goto L_0x0190
            r12 = r10
            com.google.android.gms.internal.ads.bcg r12 = (com.google.android.gms.internal.ads.bcg) r12
            goto L_0x0180
        L_0x0190:
            com.google.android.gms.internal.ads.bci r12 = new com.google.android.gms.internal.ads.bci
            r12.<init>(r9)
            goto L_0x0180
        L_0x0196:
            r0 = r8
            r0.mo15091a(r1, r2, r3, r4, r5, r6)
            goto L_0x01a2
        L_0x019b:
            r8.mo15096c()
            goto L_0x01a2
        L_0x019f:
            r8.mo15095b()
        L_0x01a2:
            r11.writeNoException()
            goto L_0x0222
        L_0x01a7:
            android.os.IBinder r9 = r10.readStrongBinder()
            com.google.android.gms.b.a r9 = com.google.android.gms.p137b.C3235a.C3236a.m11572a(r9)
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzjj> r0 = com.google.android.gms.internal.ads.zzjj.CREATOR
            android.os.Parcelable r0 = com.google.android.gms.internal.ads.ajb.m14214a(r10, r0)
            com.google.android.gms.internal.ads.zzjj r0 = (com.google.android.gms.internal.ads.zzjj) r0
            java.lang.String r1 = r10.readString()
            android.os.IBinder r10 = r10.readStrongBinder()
            if (r10 != 0) goto L_0x01c2
            goto L_0x01d4
        L_0x01c2:
            java.lang.String r12 = "com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener"
            android.os.IInterface r12 = r10.queryLocalInterface(r12)
            boolean r2 = r12 instanceof com.google.android.gms.internal.ads.bcg
            if (r2 == 0) goto L_0x01cf
            com.google.android.gms.internal.ads.bcg r12 = (com.google.android.gms.internal.ads.bcg) r12
            goto L_0x01d4
        L_0x01cf:
            com.google.android.gms.internal.ads.bci r12 = new com.google.android.gms.internal.ads.bci
            r12.<init>(r10)
        L_0x01d4:
            r8.mo15086a(r9, r0, r1, r12)
            goto L_0x01a2
        L_0x01d8:
            com.google.android.gms.b.a r9 = r8.mo15083a()
        L_0x01dc:
            r11.writeNoException()
            com.google.android.gms.internal.ads.ajb.m14215a(r11, r9)
            goto L_0x0222
        L_0x01e3:
            android.os.IBinder r9 = r10.readStrongBinder()
            com.google.android.gms.b.a r1 = com.google.android.gms.p137b.C3235a.C3236a.m11572a(r9)
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzjn> r9 = com.google.android.gms.internal.ads.zzjn.CREATOR
            android.os.Parcelable r9 = com.google.android.gms.internal.ads.ajb.m14214a(r10, r9)
            r2 = r9
            com.google.android.gms.internal.ads.zzjn r2 = (com.google.android.gms.internal.ads.zzjn) r2
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzjj> r9 = com.google.android.gms.internal.ads.zzjj.CREATOR
            android.os.Parcelable r9 = com.google.android.gms.internal.ads.ajb.m14214a(r10, r9)
            r3 = r9
            com.google.android.gms.internal.ads.zzjj r3 = (com.google.android.gms.internal.ads.zzjj) r3
            java.lang.String r4 = r10.readString()
            android.os.IBinder r9 = r10.readStrongBinder()
            if (r9 != 0) goto L_0x0209
        L_0x0207:
            r5 = r12
            goto L_0x021d
        L_0x0209:
            java.lang.String r10 = "com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener"
            android.os.IInterface r10 = r9.queryLocalInterface(r10)
            boolean r12 = r10 instanceof com.google.android.gms.internal.ads.bcg
            if (r12 == 0) goto L_0x0217
            r12 = r10
            com.google.android.gms.internal.ads.bcg r12 = (com.google.android.gms.internal.ads.bcg) r12
            goto L_0x0207
        L_0x0217:
            com.google.android.gms.internal.ads.bci r12 = new com.google.android.gms.internal.ads.bci
            r12.<init>(r9)
            goto L_0x0207
        L_0x021d:
            r0 = r8
            r0.mo15090a(r1, r2, r3, r4, r5)
            goto L_0x01a2
        L_0x0222:
            r9 = 1
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.bce.dispatchTransaction(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
