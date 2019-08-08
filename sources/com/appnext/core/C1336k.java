package com.appnext.core;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Handler;
import android.os.Looper;
import android.widget.ImageView;

/* renamed from: com.appnext.core.k */
public final class C1336k {
    /* renamed from: a */
    public static void m5715a(final Context context, final ImageView imageView) {
        new Thread(new Runnable() {
            public final void run() {
                try {
                    final Bitmap aL = C1326f.m5671aL("https://cdn.appnext.com/tools/sdk/adchoices/adchoices_big.png");
                    new Handler(Looper.getMainLooper()).post(new Runnable() {
                        public final void run() {
                            try {
                                if (aL != null) {
                                    imageView.setImageDrawable(new BitmapDrawable(context.getResources(), aL));
                                    return;
                                }
                                imageView.setImageResource(C1297R.C1298drawable.apnxt_adchoices);
                            } catch (Throwable unused) {
                            }
                        }
                    });
                } catch (Throwable unused) {
                    new Handler(Looper.getMainLooper()).post(new Runnable() {
                        public final void run() {
                            imageView.setImageResource(C1297R.C1298drawable.apnxt_adchoices);
                        }
                    });
                }
            }
        }).start();
    }

    /* renamed from: a */
    public static boolean m5716a(AppnextAd appnextAd, C1345p pVar) {
        return appnextAd.isGdpr() && Boolean.parseBoolean(pVar.get("gdpr"));
    }
}
