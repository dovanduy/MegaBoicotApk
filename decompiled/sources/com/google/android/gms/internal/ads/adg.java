package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

final class adg {

    /* renamed from: a */
    private static final Class<?> f10559a = m13644d();

    /* renamed from: b */
    private static final adx<?, ?> f10560b = m13618a(false);

    /* renamed from: c */
    private static final adx<?, ?> f10561c = m13618a(true);

    /* renamed from: d */
    private static final adx<?, ?> f10562d = new adz();

    /* renamed from: a */
    static int m13612a(int i, Object obj, ade ade) {
        return obj instanceof abs ? aak.m13052a(i, (abs) obj) : aak.m13062b(i, (acl) obj, ade);
    }

    /* renamed from: a */
    static int m13613a(int i, List<?> list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        int e = aak.m13077e(i) * size;
        if (list instanceof abu) {
            abu abu = (abu) list;
            while (i2 < size) {
                Object b = abu.mo14025b(i2);
                e += b instanceof C4386zw ? aak.m13066b((C4386zw) b) : aak.m13067b((String) b);
                i2++;
            }
        } else {
            while (i2 < size) {
                Object obj = list.get(i2);
                e += obj instanceof C4386zw ? aak.m13066b((C4386zw) obj) : aak.m13067b((String) obj);
                i2++;
            }
        }
        return e;
    }

    /* renamed from: a */
    static int m13614a(int i, List<?> list, ade ade) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int e = aak.m13077e(i) * size;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            e += obj instanceof abs ? aak.m13053a((abs) obj) : aak.m13054a((acl) obj, ade);
        }
        return e;
    }

    /* renamed from: a */
    static int m13615a(int i, List<Long> list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        return m13616a(list) + (list.size() * aak.m13077e(i));
    }

    /* renamed from: a */
    static int m13616a(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof abz) {
            abz abz = (abz) list;
            i = 0;
            while (i2 < size) {
                i += aak.m13076d(abz.mo14037b(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + aak.m13076d(((Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: a */
    public static adx<?, ?> m13617a() {
        return f10560b;
    }

    /* renamed from: a */
    private static adx<?, ?> m13618a(boolean z) {
        try {
            Class e = m13648e();
            if (e == null) {
                return null;
            }
            return (adx) e.getConstructor(new Class[]{Boolean.TYPE}).newInstance(new Object[]{Boolean.valueOf(z)});
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    static <UT, UB> UB m13619a(int i, int i2, UB ub, adx<UT, UB> adx) {
        if (ub == null) {
            ub = adx.mo14154a();
        }
        adx.mo14157a(ub, i, (long) i2);
        return ub;
    }

    /* renamed from: a */
    static <UT, UB> UB m13620a(int i, List<Integer> list, abi<?> abi, UB ub, adx<UT, UB> adx) {
        UB ub2;
        if (abi == null) {
            return ub;
        }
        if (!(list instanceof RandomAccess)) {
            Iterator it = list.iterator();
            loop1:
            while (true) {
                ub2 = ub;
                while (it.hasNext()) {
                    int intValue = ((Integer) it.next()).intValue();
                    if (abi.mo14005a(intValue) == null) {
                        ub = m13619a(i, intValue, ub2, adx);
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
                if (abi.mo14005a(intValue2) != null) {
                    if (i3 != i2) {
                        list.set(i2, Integer.valueOf(intValue2));
                    }
                    i2++;
                } else {
                    ub2 = m13619a(i, intValue2, ub2, adx);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
                return ub2;
            }
        }
        return ub2;
    }

    /* renamed from: a */
    public static void m13621a(int i, List<String> list, aer aer) throws IOException {
        if (list != null && !list.isEmpty()) {
            aer.mo13894a(i, list);
        }
    }

    /* renamed from: a */
    public static void m13622a(int i, List<?> list, aer aer, ade ade) throws IOException {
        if (list != null && !list.isEmpty()) {
            aer.mo13895a(i, list, ade);
        }
    }

    /* renamed from: a */
    public static void m13623a(int i, List<Double> list, aer aer, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            aer.mo13916g(i, list, z);
        }
    }

    /* renamed from: a */
    static <T, FT extends aay<FT>> void m13624a(aat<FT> aat, T t, T t2) {
        aaw a = aat.mo13943a((Object) t2);
        if (!a.mo13954b()) {
            aat.mo13951b(t).mo13953a(a);
        }
    }

    /* renamed from: a */
    static <T> void m13625a(acg acg, T t, T t2, long j) {
        aed.m13768a((Object) t, j, acg.mo14057a(aed.m13790f(t, j), aed.m13790f(t2, j)));
    }

    /* renamed from: a */
    static <T, UT, UB> void m13626a(adx<UT, UB> adx, T t, T t2) {
        adx.mo14161a((Object) t, adx.mo14169c(adx.mo14164b(t), adx.mo14164b(t2)));
    }

    /* renamed from: a */
    public static void m13627a(Class<?> cls) {
        if (!abe.class.isAssignableFrom(cls) && f10559a != null && !f10559a.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    /* renamed from: a */
    public static boolean m13628a(int i, int i2, int i3) {
        if (i2 < 40) {
            return true;
        }
        long j = (long) i3;
        return ((((long) i2) - ((long) i)) + 1) + 9 <= (3 + (2 * j)) + (3 * (3 + j));
    }

    /* renamed from: a */
    static boolean m13629a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: b */
    static int m13630b(int i, List<C4386zw> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int e = size * aak.m13077e(i);
        for (int i2 = 0; i2 < list.size(); i2++) {
            e += aak.m13066b((C4386zw) list.get(i2));
        }
        return e;
    }

    /* renamed from: b */
    static int m13631b(int i, List<acl> list, ade ade) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += aak.m13070c(i, (acl) list.get(i3), ade);
        }
        return i2;
    }

    /* renamed from: b */
    static int m13632b(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m13633b(list) + (size * aak.m13077e(i));
    }

    /* renamed from: b */
    static int m13633b(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof abz) {
            abz abz = (abz) list;
            i = 0;
            while (i2 < size) {
                i += aak.m13079e(abz.mo14037b(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + aak.m13079e(((Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: b */
    public static adx<?, ?> m13634b() {
        return f10561c;
    }

    /* renamed from: b */
    public static void m13635b(int i, List<C4386zw> list, aer aer) throws IOException {
        if (list != null && !list.isEmpty()) {
            aer.mo13902b(i, list);
        }
    }

    /* renamed from: b */
    public static void m13636b(int i, List<?> list, aer aer, ade ade) throws IOException {
        if (list != null && !list.isEmpty()) {
            aer.mo13903b(i, list, ade);
        }
    }

    /* renamed from: b */
    public static void m13637b(int i, List<Float> list, aer aer, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            aer.mo13915f(i, list, z);
        }
    }

    /* renamed from: c */
    static int m13638c(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m13639c(list) + (size * aak.m13077e(i));
    }

    /* renamed from: c */
    static int m13639c(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof abz) {
            abz abz = (abz) list;
            i = 0;
            while (i2 < size) {
                i += aak.m13083f(abz.mo14037b(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + aak.m13083f(((Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: c */
    public static adx<?, ?> m13640c() {
        return f10562d;
    }

    /* renamed from: c */
    public static void m13641c(int i, List<Long> list, aer aer, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            aer.mo13907c(i, list, z);
        }
    }

    /* renamed from: d */
    static int m13642d(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m13643d(list) + (size * aak.m13077e(i));
    }

    /* renamed from: d */
    static int m13643d(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof abf) {
            abf abf = (abf) list;
            i = 0;
            while (i2 < size) {
                i += aak.m13097k(abf.mo13999b(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + aak.m13097k(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: d */
    private static Class<?> m13644d() {
        try {
            return Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: d */
    public static void m13645d(int i, List<Long> list, aer aer, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            aer.mo13910d(i, list, z);
        }
    }

    /* renamed from: e */
    static int m13646e(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m13647e(list) + (size * aak.m13077e(i));
    }

    /* renamed from: e */
    static int m13647e(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof abf) {
            abf abf = (abf) list;
            i = 0;
            while (i2 < size) {
                i += aak.m13080f(abf.mo13999b(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + aak.m13080f(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: e */
    private static Class<?> m13648e() {
        try {
            return Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: e */
    public static void m13649e(int i, List<Long> list, aer aer, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            aer.mo13923n(i, list, z);
        }
    }

    /* renamed from: f */
    static int m13650f(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m13651f(list) + (size * aak.m13077e(i));
    }

    /* renamed from: f */
    static int m13651f(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof abf) {
            abf abf = (abf) list;
            i = 0;
            while (i2 < size) {
                i += aak.m13084g(abf.mo13999b(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + aak.m13084g(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: f */
    public static void m13652f(int i, List<Long> list, aer aer, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            aer.mo13913e(i, list, z);
        }
    }

    /* renamed from: g */
    static int m13653g(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m13654g(list) + (size * aak.m13077e(i));
    }

    /* renamed from: g */
    static int m13654g(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof abf) {
            abf abf = (abf) list;
            i = 0;
            while (i2 < size) {
                i += aak.m13088h(abf.mo13999b(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + aak.m13088h(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: g */
    public static void m13655g(int i, List<Long> list, aer aer, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            aer.mo13921l(i, list, z);
        }
    }

    /* renamed from: h */
    static int m13656h(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * aak.m13093i(i, 0);
    }

    /* renamed from: h */
    static int m13657h(List<?> list) {
        return list.size() << 2;
    }

    /* renamed from: h */
    public static void m13658h(int i, List<Integer> list, aer aer, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            aer.mo13896a(i, list, z);
        }
    }

    /* renamed from: i */
    static int m13659i(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * aak.m13086g(i, 0);
    }

    /* renamed from: i */
    static int m13660i(List<?> list) {
        return list.size() << 3;
    }

    /* renamed from: i */
    public static void m13661i(int i, List<Integer> list, aer aer, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            aer.mo13919j(i, list, z);
        }
    }

    /* renamed from: j */
    static int m13662j(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * aak.m13064b(i, true);
    }

    /* renamed from: j */
    static int m13663j(List<?> list) {
        return list.size();
    }

    /* renamed from: j */
    public static void m13664j(int i, List<Integer> list, aer aer, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            aer.mo13922m(i, list, z);
        }
    }

    /* renamed from: k */
    public static void m13665k(int i, List<Integer> list, aer aer, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            aer.mo13904b(i, list, z);
        }
    }

    /* renamed from: l */
    public static void m13666l(int i, List<Integer> list, aer aer, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            aer.mo13920k(i, list, z);
        }
    }

    /* renamed from: m */
    public static void m13667m(int i, List<Integer> list, aer aer, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            aer.mo13917h(i, list, z);
        }
    }

    /* renamed from: n */
    public static void m13668n(int i, List<Boolean> list, aer aer, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            aer.mo13918i(i, list, z);
        }
    }
}
