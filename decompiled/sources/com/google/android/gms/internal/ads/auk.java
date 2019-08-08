package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.C2980a.C2982b;
import com.google.android.gms.p137b.C3235a;
import com.google.android.gms.p137b.C3238b;

@C3718cm
public final class auk extends C2982b {

    /* renamed from: a */
    private final auh f12268a;

    /* renamed from: b */
    private final Drawable f12269b;

    /* renamed from: c */
    private final Uri f12270c;

    /* renamed from: d */
    private final double f12271d;

    public auk(auh auh) {
        Drawable drawable;
        this.f12268a = auh;
        Uri uri = null;
        try {
            C3235a a = this.f12268a.mo14753a();
            if (a != null) {
                drawable = (Drawable) C3238b.m11574a(a);
                this.f12269b = drawable;
                uri = this.f12268a.mo14754b();
                this.f12270c = uri;
                double d = 1.0d;
                d = this.f12268a.mo14755c();
                this.f12271d = d;
            }
        } catch (RemoteException e) {
            C3987mk.m17430b("", e);
        }
        drawable = null;
        this.f12269b = drawable;
        try {
            uri = this.f12268a.mo14754b();
        } catch (RemoteException e2) {
            C3987mk.m17430b("", e2);
        }
        this.f12270c = uri;
        double d2 = 1.0d;
        try {
            d2 = this.f12268a.mo14755c();
        } catch (RemoteException e3) {
            C3987mk.m17430b("", e3);
        }
        this.f12271d = d2;
    }

    /* renamed from: a */
    public final Drawable mo12326a() {
        return this.f12269b;
    }

    /* renamed from: b */
    public final Uri mo12327b() {
        return this.f12270c;
    }

    /* renamed from: c */
    public final double mo12328c() {
        return this.f12271d;
    }
}
