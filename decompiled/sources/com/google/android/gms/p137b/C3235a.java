package com.google.android.gms.p137b;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.internal.p146c.C4417a;
import com.google.android.gms.internal.p146c.C4418b;

/* renamed from: com.google.android.gms.b.a */
public interface C3235a extends IInterface {

    /* renamed from: com.google.android.gms.b.a$a */
    public static abstract class C3236a extends C4418b implements C3235a {

        /* renamed from: com.google.android.gms.b.a$a$a */
        public static class C3237a extends C4417a implements C3235a {
            C3237a(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.dynamic.IObjectWrapper");
            }
        }

        public C3236a() {
            super("com.google.android.gms.dynamic.IObjectWrapper");
        }

        /* renamed from: a */
        public static C3235a m11572a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            if (queryLocalInterface instanceof C3235a) {
                return (C3235a) queryLocalInterface;
            }
            return new C3237a(iBinder);
        }
    }
}
