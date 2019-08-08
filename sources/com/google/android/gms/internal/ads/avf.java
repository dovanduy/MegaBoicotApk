package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

public abstract class avf extends aja implements ave {
    public avf() {
        super("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
    }

    /* renamed from: a */
    public static ave m15484a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
        return queryLocalInterface instanceof ave ? (ave) queryLocalInterface : new avg(iBinder);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0036, code lost:
        r3.writeNoException();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0052, code lost:
        r3.writeNoException();
        com.google.android.gms.internal.ads.ajb.m14215a(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0061, code lost:
        r3.writeNoException();
        r3.writeString(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0068, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean dispatchTransaction(int r1, android.os.Parcel r2, android.os.Parcel r3, int r4) throws android.os.RemoteException {
        /*
            r0 = this;
            switch(r1) {
                case 1: goto L_0x0059;
                case 2: goto L_0x004a;
                case 3: goto L_0x003f;
                case 4: goto L_0x003a;
                case 5: goto L_0x002f;
                case 6: goto L_0x002b;
                case 7: goto L_0x0026;
                case 8: goto L_0x0022;
                case 9: goto L_0x001d;
                case 10: goto L_0x000a;
                case 11: goto L_0x0005;
                default: goto L_0x0003;
            }
        L_0x0003:
            r1 = 0
            return r1
        L_0x0005:
            com.google.android.gms.b.a r1 = r0.mo14799b()
            goto L_0x0052
        L_0x000a:
            android.os.IBinder r1 = r2.readStrongBinder()
            com.google.android.gms.b.a r1 = com.google.android.gms.p137b.C3235a.C3236a.m11572a(r1)
            boolean r1 = r0.mo14798a(r1)
            r3.writeNoException()
            com.google.android.gms.internal.ads.ajb.m14217a(r3, r1)
            goto L_0x0067
        L_0x001d:
            com.google.android.gms.b.a r1 = r0.mo14804e()
            goto L_0x0052
        L_0x0022:
            r0.mo14805f()
            goto L_0x0036
        L_0x0026:
            com.google.android.gms.internal.ads.aqe r1 = r0.mo14801c()
            goto L_0x0052
        L_0x002b:
            r0.mo14803d()
            goto L_0x0036
        L_0x002f:
            java.lang.String r1 = r2.readString()
            r0.mo14802c(r1)
        L_0x0036:
            r3.writeNoException()
            goto L_0x0067
        L_0x003a:
            java.lang.String r1 = r0.mo14771l()
            goto L_0x0061
        L_0x003f:
            java.util.List r1 = r0.mo14797a()
            r3.writeNoException()
            r3.writeStringList(r1)
            goto L_0x0067
        L_0x004a:
            java.lang.String r1 = r2.readString()
            com.google.android.gms.internal.ads.auh r1 = r0.mo14800b(r1)
        L_0x0052:
            r3.writeNoException()
            com.google.android.gms.internal.ads.ajb.m14215a(r3, r1)
            goto L_0x0067
        L_0x0059:
            java.lang.String r1 = r2.readString()
            java.lang.String r1 = r0.mo14796a(r1)
        L_0x0061:
            r3.writeNoException()
            r3.writeString(r1)
        L_0x0067:
            r1 = 1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.avf.dispatchTransaction(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
