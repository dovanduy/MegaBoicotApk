package com.google.android.gms.internal.ads;

import android.os.RemoteException;

@C3718cm
public class bdu {
    /* renamed from: a */
    public static bdp m16408a(String str) throws RemoteException {
        try {
            return new bdv((C4156sr) Class.forName(str, false, bdu.class.getClassLoader()).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
        } catch (Throwable unused) {
            throw new RemoteException();
        }
    }
}
