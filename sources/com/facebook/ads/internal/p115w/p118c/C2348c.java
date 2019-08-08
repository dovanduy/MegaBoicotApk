package com.facebook.ads.internal.p115w.p118c;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.os.Build.VERSION;
import android.util.Base64;
import com.facebook.ads.internal.p115w.p117b.C2342x;
import java.io.InputStream;

/* renamed from: com.facebook.ads.internal.w.c.c */
public class C2348c {
    /* renamed from: a */
    private static int m9099a(Options options, int i, int i2) {
        int i3 = options.outHeight;
        int i4 = options.outWidth;
        int i5 = 1;
        if (i3 > i2 || i4 > i) {
            int i6 = i3 / 2;
            int i7 = i4 / 2;
            while (i6 / i5 >= i2 && i7 / i5 >= i) {
                i5 *= 2;
            }
        }
        return i5;
    }

    /* renamed from: a */
    public static Bitmap m9100a(C2347b bVar) {
        byte[] decode = Base64.decode(bVar.mo8747a(C2342x.f7369b), 0);
        return BitmapFactory.decodeByteArray(decode, 0, decode.length);
    }

    /* renamed from: a */
    public static Bitmap m9101a(InputStream inputStream, int i, int i2) {
        if (VERSION.SDK_INT < 19) {
            return BitmapFactory.decodeStream(inputStream);
        }
        C2351e eVar = new C2351e(inputStream);
        eVar.mark(8192);
        Options options = new Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeStream(eVar, null, options);
        eVar.reset();
        if (eVar.mo8750a()) {
            return BitmapFactory.decodeStream(eVar);
        }
        options.inSampleSize = m9099a(options, i2, i);
        options.inJustDecodeBounds = false;
        return BitmapFactory.decodeStream(eVar, null, options);
    }

    /* renamed from: a */
    public static Bitmap m9102a(String str, int i, int i2) {
        Options options = new Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(str, options);
        options.inSampleSize = m9099a(options, i2, i);
        options.inJustDecodeBounds = false;
        return BitmapFactory.decodeFile(str, options);
    }
}
