package com.google.android.gms.common.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.view.View;
import com.google.android.gms.p137b.C3238b;
import com.google.android.gms.p137b.C3239c;
import com.google.android.gms.p137b.C3239c.C3240a;

/* renamed from: com.google.android.gms.common.internal.u */
public final class C3514u extends C3239c<C3503q> {

    /* renamed from: a */
    private static final C3514u f10080a = new C3514u();

    private C3514u() {
        super("com.google.android.gms.common.ui.SignInButtonCreatorImpl");
    }

    /* renamed from: a */
    public static View m12639a(Context context, int i, int i2) throws C3240a {
        return f10080a.m12640b(context, i, i2);
    }

    /* renamed from: b */
    private final View m12640b(Context context, int i, int i2) throws C3240a {
        try {
            SignInButtonConfig signInButtonConfig = new SignInButtonConfig(i, i2, null);
            return (View) C3238b.m11574a(((C3503q) mo13039a(context)).mo13486a(C3238b.m11573a(context), signInButtonConfig));
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder(64);
            sb.append("Could not get button with size ");
            sb.append(i);
            sb.append(" and color ");
            sb.append(i2);
            throw new C3240a(sb.toString(), e);
        }
    }

    /* renamed from: a */
    public final C3503q mo13040b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ISignInButtonCreator");
        if (queryLocalInterface instanceof C3503q) {
            return (C3503q) queryLocalInterface;
        }
        return new C3443ad(iBinder);
    }
}
