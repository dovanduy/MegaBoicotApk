package com.facebook.ads.internal.view.p101c;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.facebook.ads.internal.p081h.C1733d;
import com.facebook.ads.internal.p088o.C1774a;
import com.facebook.ads.internal.p088o.C1775b;
import com.facebook.ads.internal.p115w.p117b.C2328p;
import com.facebook.ads.internal.p115w.p117b.C2342x;
import com.facebook.ads.internal.p115w.p118c.C2352f;
import java.lang.ref.WeakReference;

/* renamed from: com.facebook.ads.internal.view.c.d */
public class C1980d extends AsyncTask<String, Void, Bitmap[]> {

    /* renamed from: b */
    private static final String f6247b = "d";

    /* renamed from: a */
    public boolean f6248a = false;

    /* renamed from: c */
    private final WeakReference<Context> f6249c;

    /* renamed from: d */
    private final int f6250d;

    /* renamed from: e */
    private final WeakReference<ImageView> f6251e;

    /* renamed from: f */
    private final WeakReference<C1977b> f6252f;

    /* renamed from: g */
    private final WeakReference<ViewGroup> f6253g;

    /* renamed from: h */
    private C1981e f6254h;

    /* renamed from: i */
    private int f6255i = -1;

    /* renamed from: j */
    private int f6256j = -1;

    public C1980d(ViewGroup viewGroup, int i) {
        this.f6249c = new WeakReference<>(viewGroup.getContext());
        this.f6252f = null;
        this.f6251e = null;
        this.f6253g = new WeakReference<>(viewGroup);
        this.f6250d = i;
    }

    public C1980d(ImageView imageView) {
        this.f6249c = new WeakReference<>(imageView.getContext());
        this.f6252f = null;
        this.f6251e = new WeakReference<>(imageView);
        this.f6253g = null;
        this.f6250d = 0;
    }

    public C1980d(C1977b bVar) {
        this.f6249c = new WeakReference<>(bVar.getContext());
        this.f6252f = new WeakReference<>(bVar);
        this.f6251e = null;
        this.f6253g = null;
        this.f6250d = 0;
    }

    /* renamed from: a */
    public C1980d mo8114a() {
        this.f6255i = -1;
        this.f6256j = -1;
        return this;
    }

    /* renamed from: a */
    public C1980d mo8115a(int i, int i2) {
        this.f6255i = i;
        this.f6256j = i2;
        return this;
    }

    /* renamed from: a */
    public C1980d mo8116a(C1981e eVar) {
        this.f6254h = eVar;
        return this;
    }

    /* renamed from: a */
    public C1980d mo8117a(boolean z) {
        this.f6248a = z;
        return this;
    }

    /* renamed from: a */
    public void mo8118a(String str) {
        if (TextUtils.isEmpty(str)) {
            if (this.f6254h != null) {
                this.f6254h.mo6849a(false);
            }
            return;
        }
        executeOnExecutor(C2328p.f7322a, new String[]{str});
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void onPostExecute(Bitmap[] bitmapArr) {
        boolean z = false;
        if (this.f6251e != null) {
            ImageView imageView = (ImageView) this.f6251e.get();
            if (imageView != null) {
                imageView.setImageBitmap(bitmapArr[0]);
            }
        }
        if (this.f6252f != null) {
            C1977b bVar = (C1977b) this.f6252f.get();
            if (bVar != null) {
                bVar.mo8098a(bitmapArr[0], bitmapArr[1]);
            }
        }
        if (!(this.f6253g == null || this.f6253g.get() == null || bitmapArr[1] == null)) {
            C2342x.m9083a((View) this.f6253g.get(), (Drawable) new BitmapDrawable(((Context) this.f6249c.get()).getResources(), bitmapArr[1]));
        }
        if (this.f6254h != null) {
            C1981e eVar = this.f6254h;
            if (bitmapArr[0] != null) {
                z = true;
            }
            eVar.mo6849a(z);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Bitmap[] doInBackground(String... strArr) {
        Bitmap bitmap;
        String str = strArr[0];
        Context context = (Context) this.f6249c.get();
        Bitmap bitmap2 = null;
        if (context == null) {
            return new Bitmap[]{null, null};
        }
        try {
            bitmap = C1733d.m7202a(context).mo7512a(str, this.f6255i, this.f6256j);
            try {
                boolean z = (this.f6252f == null || this.f6252f.get() == null) ? false : true;
                boolean z2 = (this.f6253g == null || this.f6253g.get() == null) ? false : true;
                if ((z || z2) && bitmap != null && !this.f6248a) {
                    C2352f fVar = new C2352f(bitmap);
                    fVar.mo8758a(this.f6250d != 0 ? this.f6250d : Math.round(((float) bitmap.getWidth()) / 40.0f));
                    bitmap2 = fVar.mo8757a();
                }
            } catch (Throwable th) {
                th = th;
                String str2 = f6247b;
                StringBuilder sb = new StringBuilder();
                sb.append("Error downloading image: ");
                sb.append(str);
                Log.e(str2, sb.toString(), th);
                C1775b.m7365a(C1774a.m7362a(th, null));
                return new Bitmap[]{bitmap, bitmap2};
            }
        } catch (Throwable th2) {
            th = th2;
            bitmap = null;
            String str22 = f6247b;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Error downloading image: ");
            sb2.append(str);
            Log.e(str22, sb2.toString(), th);
            C1775b.m7365a(C1774a.m7362a(th, null));
            return new Bitmap[]{bitmap, bitmap2};
        }
        return new Bitmap[]{bitmap, bitmap2};
    }
}
