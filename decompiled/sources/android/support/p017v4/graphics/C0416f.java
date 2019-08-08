package android.support.p017v4.graphics;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.Typeface.Builder;
import android.graphics.fonts.FontVariationAxis;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.support.p017v4.content.p022a.C0342c.C0344b;
import android.support.p017v4.content.p022a.C0342c.C0345c;
import android.support.p017v4.p020b.C0319b;
import android.support.p017v4.p020b.C0319b.C0325b;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Map;

/* renamed from: android.support.v4.graphics.f */
/* compiled from: TypefaceCompatApi26Impl */
public class C0416f extends C0406d {

    /* renamed from: a */
    protected final Class f1049a;

    /* renamed from: b */
    protected final Constructor f1050b;

    /* renamed from: c */
    protected final Method f1051c;

    /* renamed from: d */
    protected final Method f1052d;

    /* renamed from: e */
    protected final Method f1053e;

    /* renamed from: f */
    protected final Method f1054f;

    /* renamed from: g */
    protected final Method f1055g;

    public C0416f() {
        Method method;
        Method method2;
        Method method3;
        Method method4;
        Method method5;
        Constructor constructor;
        Class cls = null;
        try {
            Class a = mo1478a();
            constructor = mo1479a(a);
            method5 = mo1480b(a);
            method4 = mo1481c(a);
            method3 = mo1482d(a);
            method2 = mo1483e(a);
            method = mo1484f(a);
            cls = a;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Unable to collect necessary methods for class ");
            sb.append(e.getClass().getName());
            Log.e("TypefaceCompatApi26Impl", sb.toString(), e);
            constructor = null;
            method5 = null;
            method4 = null;
            method3 = null;
            method2 = null;
            method = null;
        }
        this.f1049a = cls;
        this.f1050b = constructor;
        this.f1051c = method5;
        this.f1052d = method4;
        this.f1053e = method3;
        this.f1054f = method2;
        this.f1055g = method;
    }

    /* renamed from: b */
    private boolean m1573b() {
        if (this.f1051c == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        return this.f1051c != null;
    }

    /* renamed from: c */
    private Object m1575c() {
        try {
            return this.f1050b.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    private boolean m1571a(Context context, Object obj, String str, int i, int i2, int i3, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f1051c.invoke(obj, new Object[]{context.getAssets(), str, Integer.valueOf(0), Boolean.valueOf(false), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), fontVariationAxisArr})).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    private boolean m1572a(Object obj, ByteBuffer byteBuffer, int i, int i2, int i3) {
        try {
            return ((Boolean) this.f1052d.invoke(obj, new Object[]{byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Integer.valueOf(i3)})).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Typeface mo1477a(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.f1049a, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f1055g.invoke(null, new Object[]{newInstance, Integer.valueOf(-1), Integer.valueOf(-1)});
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: b */
    private boolean m1574b(Object obj) {
        try {
            return ((Boolean) this.f1053e.invoke(obj, new Object[0])).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: c */
    private void m1576c(Object obj) {
        try {
            this.f1054f.invoke(obj, new Object[0]);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    public Typeface mo1475a(Context context, C0344b bVar, Resources resources, int i) {
        C0345c[] a;
        if (!m1573b()) {
            return super.mo1475a(context, bVar, resources, i);
        }
        Object c = m1575c();
        for (C0345c cVar : bVar.mo1203a()) {
            if (!m1571a(context, c, cVar.mo1204a(), cVar.mo1208e(), cVar.mo1205b(), cVar.mo1206c() ? 1 : 0, FontVariationAxis.fromFontVariationSettings(cVar.mo1207d()))) {
                m1576c(c);
                return null;
            }
        }
        if (!m1574b(c)) {
            return null;
        }
        return mo1477a(c);
    }

    /* renamed from: a */
    public Typeface mo1428a(Context context, CancellationSignal cancellationSignal, C0325b[] bVarArr, int i) {
        ParcelFileDescriptor openFileDescriptor;
        Throwable th;
        Throwable th2;
        if (bVarArr.length < 1) {
            return null;
        }
        if (!m1573b()) {
            C0325b a = mo1486a(bVarArr, i);
            try {
                openFileDescriptor = context.getContentResolver().openFileDescriptor(a.mo1132a(), "r", cancellationSignal);
                if (openFileDescriptor == null) {
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                    }
                    return null;
                }
                try {
                    Typeface build = new Builder(openFileDescriptor.getFileDescriptor()).setWeight(a.mo1134c()).setItalic(a.mo1135d()).build();
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                    }
                    return build;
                } catch (Throwable th3) {
                    Throwable th4 = th3;
                    th = r13;
                    th2 = th4;
                }
            } catch (IOException unused) {
                return null;
            }
        } else {
            Map a2 = C0319b.m1190a(context, bVarArr, cancellationSignal);
            Object c = m1575c();
            boolean z = false;
            for (C0325b bVar : bVarArr) {
                ByteBuffer byteBuffer = (ByteBuffer) a2.get(bVar.mo1132a());
                if (byteBuffer != null) {
                    if (!m1572a(c, byteBuffer, bVar.mo1133b(), bVar.mo1134c(), bVar.mo1135d() ? 1 : 0)) {
                        m1576c(c);
                        return null;
                    }
                    z = true;
                }
            }
            if (!z) {
                m1576c(c);
                return null;
            } else if (!m1574b(c)) {
                return null;
            } else {
                return Typeface.create(mo1477a(c), i);
            }
        }
        if (openFileDescriptor != null) {
            if (th != null) {
                try {
                    openFileDescriptor.close();
                } catch (Throwable th5) {
                    th.addSuppressed(th5);
                }
            } else {
                openFileDescriptor.close();
            }
        }
        throw th2;
        throw th2;
    }

    /* renamed from: a */
    public Typeface mo1476a(Context context, Resources resources, int i, String str, int i2) {
        if (!m1573b()) {
            return super.mo1476a(context, resources, i, str, i2);
        }
        Object c = m1575c();
        if (!m1571a(context, c, str, 0, -1, -1, null)) {
            m1576c(c);
            return null;
        } else if (!m1574b(c)) {
            return null;
        } else {
            return mo1477a(c);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Class mo1478a() throws ClassNotFoundException {
        return Class.forName("android.graphics.FontFamily");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Constructor mo1479a(Class cls) throws NoSuchMethodException {
        return cls.getConstructor(new Class[0]);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public Method mo1480b(Class cls) throws NoSuchMethodException {
        return cls.getMethod("addFontFromAssetManager", new Class[]{AssetManager.class, String.class, Integer.TYPE, Boolean.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, FontVariationAxis[].class});
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public Method mo1481c(Class cls) throws NoSuchMethodException {
        return cls.getMethod("addFontFromBuffer", new Class[]{ByteBuffer.class, Integer.TYPE, FontVariationAxis[].class, Integer.TYPE, Integer.TYPE});
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public Method mo1482d(Class cls) throws NoSuchMethodException {
        return cls.getMethod("freeze", new Class[0]);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public Method mo1483e(Class cls) throws NoSuchMethodException {
        return cls.getMethod("abortCreation", new Class[0]);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public Method mo1484f(Class cls) throws NoSuchMethodException {
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", new Class[]{Array.newInstance(cls, 1).getClass(), Integer.TYPE, Integer.TYPE});
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
