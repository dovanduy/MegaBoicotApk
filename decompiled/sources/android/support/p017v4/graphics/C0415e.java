package android.support.p017v4.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.support.p017v4.content.p022a.C0342c.C0344b;
import android.support.p017v4.content.p022a.C0342c.C0345c;
import android.support.p017v4.p020b.C0319b.C0325b;
import android.support.p017v4.p023d.C0398m;
import android.util.Log;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;

/* renamed from: android.support.v4.graphics.e */
/* compiled from: TypefaceCompatApi24Impl */
class C0415e extends C0418h {

    /* renamed from: a */
    private static final Class f1045a;

    /* renamed from: b */
    private static final Constructor f1046b;

    /* renamed from: c */
    private static final Method f1047c;

    /* renamed from: d */
    private static final Method f1048d;

    C0415e() {
    }

    static {
        Method method;
        Method method2;
        Class cls;
        Constructor constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor constructor2 = cls.getConstructor(new Class[0]);
            method = cls.getMethod("addFontWeightStyle", new Class[]{ByteBuffer.class, Integer.TYPE, List.class, Integer.TYPE, Boolean.TYPE});
            method2 = Typeface.class.getMethod("createFromFamiliesWithDefault", new Class[]{Array.newInstance(cls, 1).getClass()});
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi24Impl", e.getClass().getName(), e);
            cls = null;
            method2 = null;
            method = null;
        }
        f1046b = constructor;
        f1045a = cls;
        f1047c = method;
        f1048d = method2;
    }

    /* renamed from: a */
    public static boolean m1566a() {
        if (f1047c == null) {
            Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
        }
        return f1047c != null;
    }

    /* renamed from: b */
    private static Object m1568b() {
        try {
            return f1046b.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    private static boolean m1567a(Object obj, ByteBuffer byteBuffer, int i, int i2, boolean z) {
        try {
            return ((Boolean) f1047c.invoke(obj, new Object[]{byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Boolean.valueOf(z)})).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    private static Typeface m1565a(Object obj) {
        try {
            Object newInstance = Array.newInstance(f1045a, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) f1048d.invoke(null, new Object[]{newInstance});
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    public Typeface mo1428a(Context context, CancellationSignal cancellationSignal, C0325b[] bVarArr, int i) {
        Object b = m1568b();
        C0398m mVar = new C0398m();
        for (C0325b bVar : bVarArr) {
            Uri a = bVar.mo1132a();
            ByteBuffer byteBuffer = (ByteBuffer) mVar.get(a);
            if (byteBuffer == null) {
                byteBuffer = C0422i.m1609a(context, cancellationSignal, a);
                mVar.put(a, byteBuffer);
            }
            if (!m1567a(b, byteBuffer, bVar.mo1133b(), bVar.mo1134c(), bVar.mo1135d())) {
                return null;
            }
        }
        return Typeface.create(m1565a(b), i);
    }

    /* renamed from: a */
    public Typeface mo1475a(Context context, C0344b bVar, Resources resources, int i) {
        C0345c[] a;
        Object b = m1568b();
        for (C0345c cVar : bVar.mo1203a()) {
            ByteBuffer a2 = C0422i.m1608a(context, resources, cVar.mo1209f());
            if (a2 == null || !m1567a(b, a2, cVar.mo1208e(), cVar.mo1205b(), cVar.mo1206c())) {
                return null;
            }
        }
        return m1565a(b);
    }
}
