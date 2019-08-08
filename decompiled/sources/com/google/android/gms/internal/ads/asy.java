package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.p137b.C3235a;
import com.google.android.gms.p137b.C3238b;

@C3718cm
public final class asy extends aui {

    /* renamed from: a */
    private final Drawable f12120a;

    /* renamed from: b */
    private final Uri f12121b;

    /* renamed from: c */
    private final double f12122c;

    public asy(Drawable drawable, Uri uri, double d) {
        this.f12120a = drawable;
        this.f12121b = uri;
        this.f12122c = d;
    }

    /* renamed from: a */
    public final C3235a mo14753a() throws RemoteException {
        return C3238b.m11573a(this.f12120a);
    }

    /* renamed from: b */
    public final Uri mo14754b() throws RemoteException {
        return this.f12121b;
    }

    /* renamed from: c */
    public final double mo14755c() {
        return this.f12122c;
    }
}
