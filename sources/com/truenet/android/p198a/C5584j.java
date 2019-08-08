package com.truenet.android.p198a;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build.VERSION;
import android.util.DisplayMetrics;
import android.webkit.WebView;
import org.jetbrains.annotations.NotNull;
import p000a.p001a.p003b.p005b.C0032h;

/* renamed from: com.truenet.android.a.j */
public final class C5584j {
    @NotNull
    /* renamed from: a */
    public static final Bitmap m23759a(@NotNull WebView webView) {
        C0032h.m45b(webView, "receiver$0");
        if (VERSION.SDK_INT >= 21) {
            WebView.enableSlowWholeDocumentDraw();
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        Context context = webView.getContext();
        C0032h.m42a((Object) context, "context");
        C5574c.m23742b(context).getDefaultDisplay().getMetrics(displayMetrics);
        int i = displayMetrics.widthPixels;
        int i2 = displayMetrics.heightPixels;
        webView.measure(i, i2);
        webView.layout(0, 0, i, i2);
        webView.setDrawingCacheEnabled(true);
        webView.buildDrawingCache(true);
        Thread.sleep(500);
        Bitmap createBitmap = Bitmap.createBitmap(webView.getDrawingCache());
        webView.setDrawingCacheEnabled(false);
        C0032h.m42a((Object) createBitmap, "bitmap");
        return createBitmap;
    }
}
