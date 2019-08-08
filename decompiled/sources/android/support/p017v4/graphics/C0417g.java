package android.support.p017v4.graphics;

import android.graphics.Typeface;
import com.google.android.exoplayer2.C2793C;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: android.support.v4.graphics.g */
/* compiled from: TypefaceCompatApi28Impl */
public class C0417g extends C0416f {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Typeface mo1477a(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.f1049a, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f1055g.invoke(null, new Object[]{newInstance, C2793C.SANS_SERIF_NAME, Integer.valueOf(-1), Integer.valueOf(-1)});
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public Method mo1484f(Class cls) throws NoSuchMethodException {
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", new Class[]{Array.newInstance(cls, 1).getClass(), String.class, Integer.TYPE, Integer.TYPE});
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
