package android.arch.lifecycle;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: android.arch.lifecycle.h */
/* compiled from: Lifecycling */
public class C0106h {

    /* renamed from: a */
    private static Map<Class, Integer> f100a = new HashMap();

    /* renamed from: b */
    private static Map<Class, List<Constructor<? extends C0096b>>> f101b = new HashMap();

    /* renamed from: a */
    static GenericLifecycleObserver m175a(Object obj) {
        if (obj instanceof FullLifecycleObserver) {
            return new FullLifecycleObserverAdapter((FullLifecycleObserver) obj);
        }
        if (obj instanceof GenericLifecycleObserver) {
            return (GenericLifecycleObserver) obj;
        }
        Class cls = obj.getClass();
        if (m179b(cls) != 2) {
            return new ReflectiveGenericLifecycleObserver(obj);
        }
        List list = (List) f101b.get(cls);
        if (list.size() == 1) {
            return new SingleGeneratedAdapterObserver(m176a((Constructor) list.get(0), obj));
        }
        C0096b[] bVarArr = new C0096b[list.size()];
        for (int i = 0; i < list.size(); i++) {
            bVarArr[i] = m176a((Constructor) list.get(i), obj);
        }
        return new CompositeGeneratedAdaptersObserver(bVarArr);
    }

    /* renamed from: a */
    private static C0096b m176a(Constructor<? extends C0096b> constructor, Object obj) {
        try {
            return (C0096b) constructor.newInstance(new Object[]{obj});
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e2) {
            throw new RuntimeException(e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    /* renamed from: a */
    private static Constructor<? extends C0096b> m178a(Class<?> cls) {
        try {
            Package packageR = cls.getPackage();
            String canonicalName = cls.getCanonicalName();
            String name = packageR != null ? packageR.getName() : "";
            if (!name.isEmpty()) {
                canonicalName = canonicalName.substring(name.length() + 1);
            }
            String a = m177a(canonicalName);
            if (!name.isEmpty()) {
                StringBuilder sb = new StringBuilder();
                sb.append(name);
                sb.append(".");
                sb.append(a);
                a = sb.toString();
            }
            Constructor<? extends C0096b> declaredConstructor = Class.forName(a).getDeclaredConstructor(new Class[]{cls});
            if (!declaredConstructor.isAccessible()) {
                declaredConstructor.setAccessible(true);
            }
            return declaredConstructor;
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: b */
    private static int m179b(Class<?> cls) {
        if (f100a.containsKey(cls)) {
            return ((Integer) f100a.get(cls)).intValue();
        }
        int c = m180c(cls);
        f100a.put(cls, Integer.valueOf(c));
        return c;
    }

    /* renamed from: c */
    private static int m180c(Class<?> cls) {
        Class[] interfaces;
        if (cls.getCanonicalName() == null) {
            return 1;
        }
        Constructor a = m178a(cls);
        if (a != null) {
            f101b.put(cls, Collections.singletonList(a));
            return 2;
        } else if (C0093a.f76a.mo128a(cls)) {
            return 1;
        } else {
            Class superclass = cls.getSuperclass();
            ArrayList arrayList = null;
            if (m181d(superclass)) {
                if (m179b(superclass) == 1) {
                    return 1;
                }
                arrayList = new ArrayList((Collection) f101b.get(superclass));
            }
            for (Class cls2 : cls.getInterfaces()) {
                if (m181d(cls2)) {
                    if (m179b(cls2) == 1) {
                        return 1;
                    }
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.addAll((Collection) f101b.get(cls2));
                }
            }
            if (arrayList == null) {
                return 1;
            }
            f101b.put(cls, arrayList);
            return 2;
        }
    }

    /* renamed from: d */
    private static boolean m181d(Class<?> cls) {
        return cls != null && C0100d.class.isAssignableFrom(cls);
    }

    /* renamed from: a */
    public static String m177a(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str.replace(".", "_"));
        sb.append("_LifecycleAdapter");
        return sb.toString();
    }
}
