package com.startapp.android.publish.adsCommon.Utils;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.Typeface;
import android.os.Build.VERSION;
import android.text.TextUtils.TruncateAt;
import android.util.TypedValue;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import java.util.Set;

/* renamed from: com.startapp.android.publish.adsCommon.Utils.h */
/* compiled from: StartAppSDK */
public class C5306h {
    /* renamed from: a */
    public static int m22641a(Context context, int i) {
        return Math.round(TypedValue.applyDimension(1, (float) i, context.getResources().getDisplayMetrics()));
    }

    /* renamed from: b */
    public static int m22650b(Context context, int i) {
        return Math.round(((float) i) / context.getResources().getDisplayMetrics().density);
    }

    /* renamed from: a */
    public static void m22649a(TextView textView, Set<String> set) {
        if (set.contains("UNDERLINE")) {
            textView.setPaintFlags(textView.getPaintFlags() | 8);
        }
        int i = 0;
        if (set.contains("BOLD") && set.contains("ITALIC")) {
            i = 3;
        } else if (set.contains("BOLD")) {
            i = 1;
        } else if (set.contains("ITALIC")) {
            i = 2;
        }
        textView.setTypeface(null, i);
    }

    /* renamed from: a */
    public static TextView m22646a(Context context, TextView textView, Typeface typeface, int i, float f, int i2, int i3) {
        TextView textView2 = new TextView(context);
        textView2.setTypeface(typeface, i);
        textView2.setTextSize(1, f);
        textView2.setSingleLine(true);
        textView2.setEllipsize(TruncateAt.END);
        textView2.setTextColor(i2);
        textView2.setId(i3);
        return textView2;
    }

    /* renamed from: a */
    public static LayoutParams m22644a(Context context, int[] iArr, int[] iArr2) {
        LayoutParams layoutParams = new LayoutParams(-2, -2);
        for (int addRule : iArr2) {
            layoutParams.addRule(addRule);
        }
        for (int i = 0; i < iArr.length; i++) {
            iArr[i] = iArr[i] == 0 ? 0 : m22641a(context, iArr[i]);
        }
        layoutParams.setMargins(iArr[0], iArr[1], iArr[2], iArr[3]);
        return layoutParams;
    }

    /* renamed from: a */
    public static LayoutParams m22645a(Context context, int[] iArr, int[] iArr2, int i, int i2) {
        LayoutParams a = m22644a(context, iArr, iArr2);
        a.addRule(i, i2);
        return a;
    }

    /* renamed from: a */
    public static Bitmap m22642a(Context context, String str) {
        return C5295a.m22608a(context, str);
    }

    /* renamed from: a */
    public static ImageView m22643a(Context context, ImageView imageView, Bitmap bitmap, int i) {
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageBitmap(bitmap);
        imageView2.setId(i);
        return imageView2;
    }

    /* renamed from: a */
    public static void m22647a(Context context, WindowManager windowManager, Point point) {
        if (VERSION.SDK_INT >= 13) {
            windowManager.getDefaultDisplay().getSize(point);
        } else {
            point.x = windowManager.getDefaultDisplay().getWidth();
            point.y = windowManager.getDefaultDisplay().getHeight();
        }
        point.x = m22650b(context, point.x);
        point.y = m22650b(context, point.y);
    }

    /* renamed from: a */
    public static void m22648a(WindowManager windowManager, Point point) {
        if (VERSION.SDK_INT >= 13) {
            windowManager.getDefaultDisplay().getSize(point);
            return;
        }
        point.x = windowManager.getDefaultDisplay().getWidth();
        point.y = windowManager.getDefaultDisplay().getHeight();
    }
}
