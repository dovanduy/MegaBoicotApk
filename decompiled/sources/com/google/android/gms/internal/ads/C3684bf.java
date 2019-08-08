package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.Looper;
import android.os.SystemClock;
import com.google.android.gms.common.util.C3563o;
import java.io.InputStream;

/* renamed from: com.google.android.gms.internal.ads.bf */
final class C3684bf implements C3953ld<asy> {

    /* renamed from: a */
    private final /* synthetic */ boolean f12722a;

    /* renamed from: b */
    private final /* synthetic */ double f12723b;

    /* renamed from: c */
    private final /* synthetic */ boolean f12724c;

    /* renamed from: d */
    private final /* synthetic */ String f12725d;

    /* renamed from: e */
    private final /* synthetic */ C3676ay f12726e;

    C3684bf(C3676ay ayVar, boolean z, double d, boolean z2, String str) {
        this.f12726e = ayVar;
        this.f12722a = z;
        this.f12723b = d;
        this.f12724c = z2;
        this.f12725d = str;
    }

    /* access modifiers changed from: private */
    @TargetApi(19)
    /* renamed from: b */
    public final asy mo15196a(InputStream inputStream) {
        Bitmap bitmap;
        Options options = new Options();
        options.inDensity = (int) (160.0d * this.f12723b);
        if (!this.f12724c) {
            options.inPreferredConfig = Config.RGB_565;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        try {
            bitmap = BitmapFactory.decodeStream(inputStream, null, options);
        } catch (Exception e) {
            C3900je.m17430b("Error grabbing image.", e);
            bitmap = null;
        }
        if (bitmap == null) {
            this.f12726e.mo14950a(2, this.f12722a);
            return null;
        }
        long uptimeMillis2 = SystemClock.uptimeMillis();
        if (C3563o.m12768g() && C3900je.m17044a()) {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            int allocationByteCount = bitmap.getAllocationByteCount();
            long j = uptimeMillis2 - uptimeMillis;
            boolean z = Looper.getMainLooper().getThread() == Thread.currentThread();
            StringBuilder sb = new StringBuilder(108);
            sb.append("Decoded image w: ");
            sb.append(width);
            sb.append(" h:");
            sb.append(height);
            sb.append(" bytes: ");
            sb.append(allocationByteCount);
            sb.append(" time: ");
            sb.append(j);
            sb.append(" on ui thread: ");
            sb.append(z);
            C3900je.m17043a(sb.toString());
        }
        return new asy(new BitmapDrawable(Resources.getSystem(), bitmap), Uri.parse(this.f12725d), this.f12723b);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo15195a() {
        this.f12726e.mo14950a(2, this.f12722a);
        return null;
    }
}
