package com.google.android.gms.common.images;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.ParcelFileDescriptor;
import android.os.ResultReceiver;
import android.os.SystemClock;
import android.support.p017v4.p023d.C0384g;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.internal.C3468c;
import com.google.android.gms.internal.p145b.C4414e;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;

public final class ImageManager {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final Object f9885a = new Object();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static HashSet<Uri> f9886b = new HashSet<>();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final Context f9887c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final Handler f9888d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final ExecutorService f9889e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C3418b f9890f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C4414e f9891g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final Map<C3421a, ImageReceiver> f9892h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final Map<Uri, ImageReceiver> f9893i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final Map<Uri, Long> f9894j;

    @KeepName
    private final class ImageReceiver extends ResultReceiver {

        /* renamed from: a */
        private final Uri f9895a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final ArrayList<C3421a> f9896b;

        /* renamed from: c */
        private final /* synthetic */ ImageManager f9897c;

        public final void onReceiveResult(int i, Bundle bundle) {
            this.f9897c.f9889e.execute(new C3419c(this.f9895a, (ParcelFileDescriptor) bundle.getParcelable("com.google.android.gms.extra.fileDescriptor")));
        }
    }

    /* renamed from: com.google.android.gms.common.images.ImageManager$a */
    public interface C3417a {
        /* renamed from: a */
        void mo13435a(Uri uri, Drawable drawable, boolean z);
    }

    /* renamed from: com.google.android.gms.common.images.ImageManager$b */
    private static final class C3418b extends C0384g<C3422b, Bitmap> {
        /* access modifiers changed from: protected */
        /* renamed from: b */
        public final /* synthetic */ int mo1323b(Object obj, Object obj2) {
            Bitmap bitmap = (Bitmap) obj2;
            return bitmap.getHeight() * bitmap.getRowBytes();
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final /* synthetic */ void mo1322a(boolean z, Object obj, Object obj2, Object obj3) {
            super.mo1322a(z, (C3422b) obj, (Bitmap) obj2, (Bitmap) obj3);
        }
    }

    /* renamed from: com.google.android.gms.common.images.ImageManager$c */
    private final class C3419c implements Runnable {

        /* renamed from: a */
        private final Uri f9898a;

        /* renamed from: b */
        private final ParcelFileDescriptor f9899b;

        public C3419c(Uri uri, ParcelFileDescriptor parcelFileDescriptor) {
            this.f9898a = uri;
            this.f9899b = parcelFileDescriptor;
        }

        public final void run() {
            C3468c.m12395b("LoadBitmapFromDiskRunnable can't be executed in the main thread");
            boolean z = false;
            Bitmap bitmap = null;
            if (this.f9899b != null) {
                try {
                    bitmap = BitmapFactory.decodeFileDescriptor(this.f9899b.getFileDescriptor());
                } catch (OutOfMemoryError e) {
                    String valueOf = String.valueOf(this.f9898a);
                    StringBuilder sb = new StringBuilder(34 + String.valueOf(valueOf).length());
                    sb.append("OOM while loading bitmap for uri: ");
                    sb.append(valueOf);
                    Log.e("ImageManager", sb.toString(), e);
                    z = true;
                }
                try {
                    this.f9899b.close();
                } catch (IOException e2) {
                    Log.e("ImageManager", "closed failed", e2);
                }
            }
            boolean z2 = z;
            Bitmap bitmap2 = bitmap;
            CountDownLatch countDownLatch = new CountDownLatch(1);
            Handler g = ImageManager.this.f9888d;
            C3420d dVar = new C3420d(this.f9898a, bitmap2, z2, countDownLatch);
            g.post(dVar);
            try {
                countDownLatch.await();
            } catch (InterruptedException unused) {
                String valueOf2 = String.valueOf(this.f9898a);
                StringBuilder sb2 = new StringBuilder(32 + String.valueOf(valueOf2).length());
                sb2.append("Latch interrupted while posting ");
                sb2.append(valueOf2);
                Log.w("ImageManager", sb2.toString());
            }
        }
    }

    /* renamed from: com.google.android.gms.common.images.ImageManager$d */
    private final class C3420d implements Runnable {

        /* renamed from: a */
        private final Uri f9901a;

        /* renamed from: b */
        private final Bitmap f9902b;

        /* renamed from: c */
        private final CountDownLatch f9903c;

        /* renamed from: d */
        private boolean f9904d;

        public C3420d(Uri uri, Bitmap bitmap, boolean z, CountDownLatch countDownLatch) {
            this.f9901a = uri;
            this.f9902b = bitmap;
            this.f9904d = z;
            this.f9903c = countDownLatch;
        }

        public final void run() {
            C3468c.m12394a("OnBitmapLoadedRunnable must be executed in the main thread");
            boolean z = this.f9902b != null;
            if (ImageManager.this.f9890f != null) {
                if (this.f9904d) {
                    ImageManager.this.f9890f.mo1320a();
                    System.gc();
                    this.f9904d = false;
                    ImageManager.this.f9888d.post(this);
                    return;
                } else if (z) {
                    ImageManager.this.f9890f.mo1319a(new C3422b(this.f9901a), this.f9902b);
                }
            }
            ImageReceiver imageReceiver = (ImageReceiver) ImageManager.this.f9893i.remove(this.f9901a);
            if (imageReceiver != null) {
                ArrayList a = imageReceiver.f9896b;
                int size = a.size();
                for (int i = 0; i < size; i++) {
                    C3421a aVar = (C3421a) a.get(i);
                    if (z) {
                        aVar.mo13445a(ImageManager.this.f9887c, this.f9902b, false);
                    } else {
                        ImageManager.this.f9894j.put(this.f9901a, Long.valueOf(SystemClock.elapsedRealtime()));
                        aVar.mo13446a(ImageManager.this.f9887c, ImageManager.this.f9891g, false);
                    }
                    if (!(aVar instanceof C3423c)) {
                        ImageManager.this.f9892h.remove(aVar);
                    }
                }
            }
            this.f9903c.countDown();
            synchronized (ImageManager.f9885a) {
                ImageManager.f9886b.remove(this.f9901a);
            }
        }
    }
}
