package com.google.android.gms.internal.p148e;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.e.ev */
final class C4573ev {

    /* renamed from: a */
    private static final Class<?> f14943a = m19711d();

    /* renamed from: b */
    private static final C4595fl<?, ?> f14944b = m19686a(false);

    /* renamed from: c */
    private static final C4595fl<?, ?> f14945c = m19686a(true);

    /* renamed from: d */
    private static final C4595fl<?, ?> f14946d = new C4597fn();

    /* renamed from: a */
    public static void m19695a(Class<?> cls) {
        if (!C4513cu.class.isAssignableFrom(cls) && f14943a != null && !f14943a.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    /* renamed from: a */
    public static void m19691a(int i, List<Double> list, C4621gg ggVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            ggVar.mo16553g(i, list, z);
        }
    }

    /* renamed from: b */
    public static void m19704b(int i, List<Float> list, C4621gg ggVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            ggVar.mo16552f(i, list, z);
        }
    }

    /* renamed from: c */
    public static void m19708c(int i, List<Long> list, C4621gg ggVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            ggVar.mo16544c(i, list, z);
        }
    }

    /* renamed from: d */
    public static void m19712d(int i, List<Long> list, C4621gg ggVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            ggVar.mo16547d(i, list, z);
        }
    }

    /* renamed from: e */
    public static void m19716e(int i, List<Long> list, C4621gg ggVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            ggVar.mo16560n(i, list, z);
        }
    }

    /* renamed from: f */
    public static void m19719f(int i, List<Long> list, C4621gg ggVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            ggVar.mo16550e(i, list, z);
        }
    }

    /* renamed from: g */
    public static void m19722g(int i, List<Long> list, C4621gg ggVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            ggVar.mo16558l(i, list, z);
        }
    }

    /* renamed from: h */
    public static void m19725h(int i, List<Integer> list, C4621gg ggVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            ggVar.mo16533a(i, list, z);
        }
    }

    /* renamed from: i */
    public static void m19728i(int i, List<Integer> list, C4621gg ggVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            ggVar.mo16556j(i, list, z);
        }
    }

    /* renamed from: j */
    public static void m19731j(int i, List<Integer> list, C4621gg ggVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            ggVar.mo16559m(i, list, z);
        }
    }

    /* renamed from: k */
    public static void m19732k(int i, List<Integer> list, C4621gg ggVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            ggVar.mo16541b(i, list, z);
        }
    }

    /* renamed from: l */
    public static void m19733l(int i, List<Integer> list, C4621gg ggVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            ggVar.mo16557k(i, list, z);
        }
    }

    /* renamed from: m */
    public static void m19734m(int i, List<Integer> list, C4621gg ggVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            ggVar.mo16554h(i, list, z);
        }
    }

    /* renamed from: n */
    public static void m19735n(int i, List<Boolean> list, C4621gg ggVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            ggVar.mo16555i(i, list, z);
        }
    }

    /* renamed from: a */
    public static void m19689a(int i, List<String> list, C4621gg ggVar) throws IOException {
        if (list != null && !list.isEmpty()) {
            ggVar.mo16531a(i, list);
        }
    }

    /* renamed from: b */
    public static void m19702b(int i, List<C4469bj> list, C4621gg ggVar) throws IOException {
        if (list != null && !list.isEmpty()) {
            ggVar.mo16539b(i, list);
        }
    }

    /* renamed from: a */
    public static void m19690a(int i, List<?> list, C4621gg ggVar, C4571et etVar) throws IOException {
        if (list != null && !list.isEmpty()) {
            ggVar.mo16532a(i, list, etVar);
        }
    }

    /* renamed from: b */
    public static void m19703b(int i, List<?> list, C4621gg ggVar, C4571et etVar) throws IOException {
        if (list != null && !list.isEmpty()) {
            ggVar.mo16540b(i, list, etVar);
        }
    }

    /* renamed from: a */
    static int m19684a(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C4541dq) {
            C4541dq dqVar = (C4541dq) list;
            i = 0;
            while (i2 < size) {
                i += C4487ca.m19138d(dqVar.mo16657b(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C4487ca.m19138d(((Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: a */
    static int m19683a(int i, List<Long> list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        return m19684a(list) + (list.size() * C4487ca.m19139e(i));
    }

    /* renamed from: b */
    static int m19700b(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C4541dq) {
            C4541dq dqVar = (C4541dq) list;
            i = 0;
            while (i2 < size) {
                i += C4487ca.m19141e(dqVar.mo16657b(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C4487ca.m19141e(((Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: b */
    static int m19699b(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m19700b(list) + (size * C4487ca.m19139e(i));
    }

    /* renamed from: c */
    static int m19706c(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C4541dq) {
            C4541dq dqVar = (C4541dq) list;
            i = 0;
            while (i2 < size) {
                i += C4487ca.m19145f(dqVar.mo16657b(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C4487ca.m19145f(((Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: c */
    static int m19705c(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m19706c(list) + (size * C4487ca.m19139e(i));
    }

    /* renamed from: d */
    static int m19710d(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C4519cv) {
            C4519cv cvVar = (C4519cv) list;
            i = 0;
            while (i2 < size) {
                i += C4487ca.m19159k(cvVar.mo16624b(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C4487ca.m19159k(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: d */
    static int m19709d(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m19710d(list) + (size * C4487ca.m19139e(i));
    }

    /* renamed from: e */
    static int m19714e(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C4519cv) {
            C4519cv cvVar = (C4519cv) list;
            i = 0;
            while (i2 < size) {
                i += C4487ca.m19142f(cvVar.mo16624b(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C4487ca.m19142f(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: e */
    static int m19713e(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m19714e(list) + (size * C4487ca.m19139e(i));
    }

    /* renamed from: f */
    static int m19718f(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C4519cv) {
            C4519cv cvVar = (C4519cv) list;
            i = 0;
            while (i2 < size) {
                i += C4487ca.m19146g(cvVar.mo16624b(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C4487ca.m19146g(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: f */
    static int m19717f(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m19718f(list) + (size * C4487ca.m19139e(i));
    }

    /* renamed from: g */
    static int m19721g(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C4519cv) {
            C4519cv cvVar = (C4519cv) list;
            i = 0;
            while (i2 < size) {
                i += C4487ca.m19150h(cvVar.mo16624b(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C4487ca.m19150h(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: g */
    static int m19720g(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m19721g(list) + (size * C4487ca.m19139e(i));
    }

    /* renamed from: h */
    static int m19724h(List<?> list) {
        return list.size() << 2;
    }

    /* renamed from: h */
    static int m19723h(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * C4487ca.m19155i(i, 0);
    }

    /* renamed from: i */
    static int m19727i(List<?> list) {
        return list.size() << 3;
    }

    /* renamed from: i */
    static int m19726i(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * C4487ca.m19148g(i, 0);
    }

    /* renamed from: j */
    static int m19730j(List<?> list) {
        return list.size();
    }

    /* renamed from: j */
    static int m19729j(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * C4487ca.m19123b(i, true);
    }

    /* renamed from: a */
    static int m19681a(int i, List<?> list) {
        int i2;
        int i3;
        int size = list.size();
        int i4 = 0;
        if (size == 0) {
            return 0;
        }
        int e = C4487ca.m19139e(i) * size;
        if (list instanceof C4536dl) {
            C4536dl dlVar = (C4536dl) list;
            while (i4 < size) {
                Object b = dlVar.mo16648b(i4);
                if (b instanceof C4469bj) {
                    i3 = C4487ca.m19124b((C4469bj) b);
                } else {
                    i3 = C4487ca.m19127b((String) b);
                }
                e += i3;
                i4++;
            }
        } else {
            while (i4 < size) {
                Object obj = list.get(i4);
                if (obj instanceof C4469bj) {
                    i2 = C4487ca.m19124b((C4469bj) obj);
                } else {
                    i2 = C4487ca.m19127b((String) obj);
                }
                e += i2;
                i4++;
            }
        }
        return e;
    }

    /* renamed from: a */
    static int m19680a(int i, Object obj, C4571et etVar) {
        if (obj instanceof C4534dj) {
            return C4487ca.m19112a(i, (C4534dj) obj);
        }
        return C4487ca.m19121b(i, (C4554ec) obj, etVar);
    }

    /* renamed from: a */
    static int m19682a(int i, List<?> list, C4571et etVar) {
        int i2;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int e = C4487ca.m19139e(i) * size;
        for (int i3 = 0; i3 < size; i3++) {
            Object obj = list.get(i3);
            if (obj instanceof C4534dj) {
                i2 = C4487ca.m19113a((C4534dj) obj);
            } else {
                i2 = C4487ca.m19126b((C4554ec) obj, etVar);
            }
            e += i2;
        }
        return e;
    }

    /* renamed from: b */
    static int m19697b(int i, List<C4469bj> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int e = size * C4487ca.m19139e(i);
        for (int i2 = 0; i2 < list.size(); i2++) {
            e += C4487ca.m19124b((C4469bj) list.get(i2));
        }
        return e;
    }

    /* renamed from: b */
    static int m19698b(int i, List<C4554ec> list, C4571et etVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += C4487ca.m19132c(i, (C4554ec) list.get(i3), etVar);
        }
        return i2;
    }

    /* renamed from: a */
    public static C4595fl<?, ?> m19685a() {
        return f14944b;
    }

    /* renamed from: b */
    public static C4595fl<?, ?> m19701b() {
        return f14945c;
    }

    /* renamed from: c */
    public static C4595fl<?, ?> m19707c() {
        return f14946d;
    }

    /* renamed from: a */
    private static C4595fl<?, ?> m19686a(boolean z) {
        try {
            Class e = m19715e();
            if (e == null) {
                return null;
            }
            return (C4595fl) e.getConstructor(new Class[]{Boolean.TYPE}).newInstance(new Object[]{Boolean.valueOf(z)});
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: d */
    private static Class<?> m19711d() {
        try {
            return Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: e */
    private static Class<?> m19715e() {
        try {
            return Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    static boolean m19696a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: a */
    static <T> void m19693a(C4548dx dxVar, T t, T t2, long j) {
        C4601fr.m19851a((Object) t, j, dxVar.mo16674a(C4601fr.m19874f(t, j), C4601fr.m19874f(t2, j)));
    }

    /* renamed from: a */
    static <T, FT extends C4506cn<FT>> void m19692a(C4501ci<FT> ciVar, T t, T t2) {
        C4504cl a = ciVar.mo16570a((Object) t2);
        if (!a.mo16580b()) {
            ciVar.mo16577b(t).mo16579a(a);
        }
    }

    /* renamed from: a */
    static <T, UT, UB> void m19694a(C4595fl<UT, UB> flVar, T t, T t2) {
        flVar.mo16752a((Object) t, flVar.mo16760c(flVar.mo16755b(t), flVar.mo16755b(t2)));
    }

    /* renamed from: a */
    static <UT, UB> UB m19688a(int i, List<Integer> list, C4523cz czVar, UB ub, C4595fl<UT, UB> flVar) {
        UB ub2;
        if (czVar == null) {
            return ub;
        }
        if (!(list instanceof RandomAccess)) {
            Iterator it = list.iterator();
            loop1:
            while (true) {
                ub2 = ub;
                while (it.hasNext()) {
                    int intValue = ((Integer) it.next()).intValue();
                    if (!czVar.mo16630a(intValue)) {
                        ub = m19687a(i, intValue, ub2, flVar);
                        it.remove();
                    }
                }
                break loop1;
            }
        } else {
            int size = list.size();
            ub2 = ub;
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                int intValue2 = ((Integer) list.get(i3)).intValue();
                if (czVar.mo16630a(intValue2)) {
                    if (i3 != i2) {
                        list.set(i2, Integer.valueOf(intValue2));
                    }
                    i2++;
                } else {
                    ub2 = m19687a(i, intValue2, ub2, flVar);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
            }
        }
        return ub2;
    }

    /* renamed from: a */
    static <UT, UB> UB m19687a(int i, int i2, UB ub, C4595fl<UT, UB> flVar) {
        if (ub == null) {
            ub = flVar.mo16745a();
        }
        flVar.mo16748a(ub, i, (long) i2);
        return ub;
    }
}
