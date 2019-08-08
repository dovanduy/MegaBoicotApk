package android.support.p017v4.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build.VERSION;
import android.os.CancellationSignal;
import android.os.Handler;
import android.support.p017v4.content.p022a.C0342c.C0343a;
import android.support.p017v4.content.p022a.C0342c.C0344b;
import android.support.p017v4.content.p022a.C0342c.C0346d;
import android.support.p017v4.content.p022a.C0350f.C0351a;
import android.support.p017v4.p020b.C0319b;
import android.support.p017v4.p020b.C0319b.C0325b;
import android.support.p017v4.p023d.C0384g;

/* renamed from: android.support.v4.graphics.c */
/* compiled from: TypefaceCompat */
public class C0405c {

    /* renamed from: a */
    private static final C0418h f1017a;

    /* renamed from: b */
    private static final C0384g<String, Typeface> f1018b = new C0384g<>(16);

    static {
        if (VERSION.SDK_INT >= 28) {
            f1017a = new C0417g();
        } else if (VERSION.SDK_INT >= 26) {
            f1017a = new C0416f();
        } else if (VERSION.SDK_INT >= 24 && C0415e.m1566a()) {
            f1017a = new C0415e();
        } else if (VERSION.SDK_INT >= 21) {
            f1017a = new C0406d();
        } else {
            f1017a = new C0418h();
        }
    }

    /* renamed from: a */
    public static Typeface m1525a(Resources resources, int i, int i2) {
        return (Typeface) f1018b.mo1318a(m1526b(resources, i, i2));
    }

    /* renamed from: b */
    private static String m1526b(Resources resources, int i, int i2) {
        StringBuilder sb = new StringBuilder();
        sb.append(resources.getResourcePackageName(i));
        sb.append("-");
        sb.append(i);
        sb.append("-");
        sb.append(i2);
        return sb.toString();
    }

    /* renamed from: a */
    public static Typeface m1524a(Context context, C0343a aVar, Resources resources, int i, int i2, C0351a aVar2, Handler handler, boolean z) {
        Typeface typeface;
        if (aVar instanceof C0346d) {
            C0346d dVar = (C0346d) aVar;
            boolean z2 = false;
            if (!z ? aVar2 == null : dVar.mo1211b() == 0) {
                z2 = true;
            }
            typeface = C0319b.m1185a(context, dVar.mo1210a(), aVar2, handler, z2, z ? dVar.mo1212c() : -1, i2);
        } else {
            typeface = f1017a.mo1475a(context, (C0344b) aVar, resources, i2);
            if (aVar2 != null) {
                if (typeface != null) {
                    aVar2.mo1216a(typeface, handler);
                } else {
                    aVar2.mo1214a(-3, handler);
                }
            }
        }
        if (typeface != null) {
            f1018b.mo1319a(m1526b(resources, i, i2), typeface);
        }
        return typeface;
    }

    /* renamed from: a */
    public static Typeface m1522a(Context context, Resources resources, int i, String str, int i2) {
        Typeface a = f1017a.mo1476a(context, resources, i, str, i2);
        if (a != null) {
            f1018b.mo1319a(m1526b(resources, i, i2), a);
        }
        return a;
    }

    /* renamed from: a */
    public static Typeface m1523a(Context context, CancellationSignal cancellationSignal, C0325b[] bVarArr, int i) {
        return f1017a.mo1428a(context, cancellationSignal, bVarArr, i);
    }
}
