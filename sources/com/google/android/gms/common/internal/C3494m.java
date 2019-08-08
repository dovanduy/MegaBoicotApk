package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.p146c.C4417a;
import com.google.android.gms.internal.p146c.C4418b;
import com.google.android.gms.internal.p146c.C4419c;

/* renamed from: com.google.android.gms.common.internal.m */
public interface C3494m extends IInterface {

    /* renamed from: com.google.android.gms.common.internal.m$a */
    public static abstract class C3495a extends C4418b implements C3494m {

        /* renamed from: com.google.android.gms.common.internal.m$a$a */
        public static class C3496a extends C4417a implements C3494m {
            C3496a(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
            }

            /* renamed from: a */
            public final Account mo13477a() throws RemoteException {
                Parcel a = mo16314a(2, mo16317c());
                Account account = (Account) C4419c.m18844a(a, Account.CREATOR);
                a.recycle();
                return account;
            }
        }

        /* renamed from: a */
        public static C3494m m12537a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            if (queryLocalInterface instanceof C3494m) {
                return (C3494m) queryLocalInterface;
            }
            return new C3496a(iBinder);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final boolean mo13521a(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i != 2) {
                return false;
            }
            Account a = mo13477a();
            parcel2.writeNoException();
            C4419c.m18849b(parcel2, a);
            return true;
        }
    }

    /* renamed from: a */
    Account mo13477a() throws RemoteException;
}
