package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import java.io.ByteArrayOutputStream;

/* renamed from: com.google.android.gms.internal.ads.hn */
final class C3855hn implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ Bitmap f13216a;

    /* renamed from: b */
    private final /* synthetic */ C3852hk f13217b;

    C3855hn(C3852hk hkVar, Bitmap bitmap) {
        this.f13217b = hkVar;
        this.f13216a = bitmap;
    }

    public final void run() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        this.f13216a.compress(CompressFormat.PNG, 0, byteArrayOutputStream);
        synchronized (this.f13217b.f13209l) {
            this.f13217b.f13200c.f10710g = new afn();
            this.f13217b.f13200c.f10710g.f10745c = byteArrayOutputStream.toByteArray();
            this.f13217b.f13200c.f10710g.f10744b = "image/png";
            this.f13217b.f13200c.f10710g.f10743a = Integer.valueOf(1);
        }
    }
}
