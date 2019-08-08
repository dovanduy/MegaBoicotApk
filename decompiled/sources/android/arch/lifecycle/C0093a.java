package android.arch.lifecycle;

import android.arch.lifecycle.C0097c.C0098a;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: android.arch.lifecycle.a */
/* compiled from: ClassesInfoCache */
class C0093a {

    /* renamed from: a */
    static C0093a f76a = new C0093a();

    /* renamed from: b */
    private final Map<Class, C0094a> f77b = new HashMap();

    /* renamed from: c */
    private final Map<Class, Boolean> f78c = new HashMap();

    /* renamed from: android.arch.lifecycle.a$a */
    /* compiled from: ClassesInfoCache */
    static class C0094a {

        /* renamed from: a */
        final Map<C0098a, List<C0095b>> f79a = new HashMap();

        /* renamed from: b */
        final Map<C0095b, C0098a> f80b;

        C0094a(Map<C0095b, C0098a> map) {
            this.f80b = map;
            for (Entry entry : map.entrySet()) {
                C0098a aVar = (C0098a) entry.getValue();
                List list = (List) this.f79a.get(aVar);
                if (list == null) {
                    list = new ArrayList();
                    this.f79a.put(aVar, list);
                }
                list.add(entry.getKey());
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo130a(C0101e eVar, C0098a aVar, Object obj) {
            m147a((List) this.f79a.get(aVar), eVar, aVar, obj);
            m147a((List) this.f79a.get(C0098a.ON_ANY), eVar, aVar, obj);
        }

        /* renamed from: a */
        private static void m147a(List<C0095b> list, C0101e eVar, C0098a aVar, Object obj) {
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    ((C0095b) list.get(size)).mo131a(eVar, aVar, obj);
                }
            }
        }
    }

    /* renamed from: android.arch.lifecycle.a$b */
    /* compiled from: ClassesInfoCache */
    static class C0095b {

        /* renamed from: a */
        final int f81a;

        /* renamed from: b */
        final Method f82b;

        C0095b(int i, Method method) {
            this.f81a = i;
            this.f82b = method;
            this.f82b.setAccessible(true);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo131a(C0101e eVar, C0098a aVar, Object obj) {
            try {
                switch (this.f81a) {
                    case 0:
                        this.f82b.invoke(obj, new Object[0]);
                        return;
                    case 1:
                        this.f82b.invoke(obj, new Object[]{eVar});
                        return;
                    case 2:
                        this.f82b.invoke(obj, new Object[]{eVar, aVar});
                        return;
                    default:
                        return;
                }
            } catch (InvocationTargetException e) {
                throw new RuntimeException("Failed to call observer method", e.getCause());
            } catch (IllegalAccessException e2) {
                throw new RuntimeException(e2);
            }
        }

        public boolean equals(Object obj) {
            boolean z = true;
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C0095b bVar = (C0095b) obj;
            if (this.f81a != bVar.f81a || !this.f82b.getName().equals(bVar.f82b.getName())) {
                z = false;
            }
            return z;
        }

        public int hashCode() {
            return (31 * this.f81a) + this.f82b.getName().hashCode();
        }
    }

    C0093a() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo128a(Class cls) {
        if (this.f78c.containsKey(cls)) {
            return ((Boolean) this.f78c.get(cls)).booleanValue();
        }
        Method[] c = m144c(cls);
        for (Method annotation : c) {
            if (((C0110l) annotation.getAnnotation(C0110l.class)) != null) {
                m142a(cls, c);
                return true;
            }
        }
        this.f78c.put(cls, Boolean.valueOf(false));
        return false;
    }

    /* renamed from: c */
    private Method[] m144c(Class cls) {
        try {
            return cls.getDeclaredMethods();
        } catch (NoClassDefFoundError e) {
            throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public C0094a mo129b(Class cls) {
        C0094a aVar = (C0094a) this.f77b.get(cls);
        if (aVar != null) {
            return aVar;
        }
        return m142a(cls, null);
    }

    /* renamed from: a */
    private void m143a(Map<C0095b, C0098a> map, C0095b bVar, C0098a aVar, Class cls) {
        C0098a aVar2 = (C0098a) map.get(bVar);
        if (aVar2 != null && aVar != aVar2) {
            Method method = bVar.f82b;
            StringBuilder sb = new StringBuilder();
            sb.append("Method ");
            sb.append(method.getName());
            sb.append(" in ");
            sb.append(cls.getName());
            sb.append(" already declared with different @OnLifecycleEvent value: previous value ");
            sb.append(aVar2);
            sb.append(", new value ");
            sb.append(aVar);
            throw new IllegalArgumentException(sb.toString());
        } else if (aVar2 == null) {
            map.put(bVar, aVar);
        }
    }

    /* renamed from: a */
    private C0094a m142a(Class cls, Method[] methodArr) {
        int i;
        Class superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        if (superclass != null) {
            C0094a b = mo129b(superclass);
            if (b != null) {
                hashMap.putAll(b.f80b);
            }
        }
        for (Class b2 : cls.getInterfaces()) {
            for (Entry entry : mo129b(b2).f80b.entrySet()) {
                m143a(hashMap, (C0095b) entry.getKey(), (C0098a) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            methodArr = m144c(cls);
        }
        boolean z = false;
        for (Method method : methodArr) {
            C0110l lVar = (C0110l) method.getAnnotation(C0110l.class);
            if (lVar != null) {
                Class[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i = 0;
                } else if (!parameterTypes[0].isAssignableFrom(C0101e.class)) {
                    throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                } else {
                    i = 1;
                }
                C0098a a = lVar.mo145a();
                if (parameterTypes.length > 1) {
                    if (!parameterTypes[1].isAssignableFrom(C0098a.class)) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    } else if (a != C0098a.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    } else {
                        i = 2;
                    }
                }
                if (parameterTypes.length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                m143a(hashMap, new C0095b(i, method), a, cls);
                z = true;
            }
        }
        C0094a aVar = new C0094a(hashMap);
        this.f77b.put(cls, aVar);
        this.f78c.put(cls, Boolean.valueOf(z));
        return aVar;
    }
}
