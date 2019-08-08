package com.google.android.gms.internal.p148e;

import com.google.android.gms.internal.p148e.C4506cn;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;

/* renamed from: com.google.android.gms.internal.e.cl */
final class C4504cl<FieldDescriptorType extends C4506cn<FieldDescriptorType>> {

    /* renamed from: d */
    private static final C4504cl f14762d = new C4504cl(true);

    /* renamed from: a */
    private final C4574ew<FieldDescriptorType, Object> f14763a = C4574ew.m19737a(16);

    /* renamed from: b */
    private boolean f14764b;

    /* renamed from: c */
    private boolean f14765c = false;

    private C4504cl() {
    }

    private C4504cl(boolean z) {
        mo16581c();
    }

    /* renamed from: a */
    public static <T extends C4506cn<T>> C4504cl<T> m19369a() {
        return f14762d;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final boolean mo16580b() {
        return this.f14763a.isEmpty();
    }

    /* renamed from: c */
    public final void mo16581c() {
        if (!this.f14764b) {
            this.f14763a.mo16702a();
            this.f14764b = true;
        }
    }

    /* renamed from: d */
    public final boolean mo16583d() {
        return this.f14764b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4504cl)) {
            return false;
        }
        return this.f14763a.equals(((C4504cl) obj).f14763a);
    }

    public final int hashCode() {
        return this.f14763a.hashCode();
    }

    /* renamed from: e */
    public final Iterator<Entry<FieldDescriptorType, Object>> mo16584e() {
        if (this.f14765c) {
            return new C4533di(this.f14763a.entrySet().iterator());
        }
        return this.f14763a.entrySet().iterator();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public final Iterator<Entry<FieldDescriptorType, Object>> mo16586f() {
        if (this.f14765c) {
            return new C4533di(this.f14763a.mo16709e().iterator());
        }
        return this.f14763a.mo16709e().iterator();
    }

    /* renamed from: a */
    private final Object m19370a(FieldDescriptorType fielddescriptortype) {
        Object obj = this.f14763a.get(fielddescriptortype);
        return obj instanceof C4529de ? C4529de.m19468a() : obj;
    }

    /* renamed from: a */
    private final void m19373a(FieldDescriptorType fielddescriptortype, Object obj) {
        if (!fielddescriptortype.mo16596d()) {
            m19374a(fielddescriptortype.mo16594b(), obj);
            r7 = obj;
        } else if (!(obj instanceof List)) {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        } else {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            ArrayList arrayList2 = arrayList;
            int size = arrayList2.size();
            int i = 0;
            while (i < size) {
                Object obj2 = arrayList2.get(i);
                i++;
                m19374a(fielddescriptortype.mo16594b(), obj2);
            }
            r7 = arrayList;
        }
        if (r7 instanceof C4529de) {
            this.f14765c = true;
        }
        this.f14763a.put(fielddescriptortype, r7);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002e, code lost:
        if ((r3 instanceof byte[]) == false) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001b, code lost:
        if ((r3 instanceof com.google.android.gms.internal.p148e.C4529de) == false) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0024, code lost:
        if ((r3 instanceof com.google.android.gms.internal.p148e.C4521cx) == false) goto L_0x0043;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m19374a(com.google.android.gms.internal.p148e.C4615ga r2, java.lang.Object r3) {
        /*
            com.google.android.gms.internal.p148e.C4520cw.m19446a(r3)
            int[] r0 = com.google.android.gms.internal.p148e.C4505cm.f14766a
            com.google.android.gms.internal.e.gf r2 = r2.mo16809a()
            int r2 = r2.ordinal()
            r2 = r0[r2]
            r0 = 1
            r1 = 0
            switch(r2) {
                case 1: goto L_0x0040;
                case 2: goto L_0x003d;
                case 3: goto L_0x003a;
                case 4: goto L_0x0037;
                case 5: goto L_0x0034;
                case 6: goto L_0x0031;
                case 7: goto L_0x0028;
                case 8: goto L_0x001e;
                case 9: goto L_0x0015;
                default: goto L_0x0014;
            }
        L_0x0014:
            goto L_0x0043
        L_0x0015:
            boolean r2 = r3 instanceof com.google.android.gms.internal.p148e.C4554ec
            if (r2 != 0) goto L_0x0026
            boolean r2 = r3 instanceof com.google.android.gms.internal.p148e.C4529de
            if (r2 == 0) goto L_0x0043
            goto L_0x0026
        L_0x001e:
            boolean r2 = r3 instanceof java.lang.Integer
            if (r2 != 0) goto L_0x0026
            boolean r2 = r3 instanceof com.google.android.gms.internal.p148e.C4521cx
            if (r2 == 0) goto L_0x0043
        L_0x0026:
            r1 = r0
            goto L_0x0043
        L_0x0028:
            boolean r2 = r3 instanceof com.google.android.gms.internal.p148e.C4469bj
            if (r2 != 0) goto L_0x0026
            boolean r2 = r3 instanceof byte[]
            if (r2 == 0) goto L_0x0043
            goto L_0x0026
        L_0x0031:
            boolean r0 = r3 instanceof java.lang.String
            goto L_0x0026
        L_0x0034:
            boolean r0 = r3 instanceof java.lang.Boolean
            goto L_0x0026
        L_0x0037:
            boolean r0 = r3 instanceof java.lang.Double
            goto L_0x0026
        L_0x003a:
            boolean r0 = r3 instanceof java.lang.Float
            goto L_0x0026
        L_0x003d:
            boolean r0 = r3 instanceof java.lang.Long
            goto L_0x0026
        L_0x0040:
            boolean r0 = r3 instanceof java.lang.Integer
            goto L_0x0026
        L_0x0043:
            if (r1 != 0) goto L_0x004d
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Wrong object type used with protocol message reflection."
            r2.<init>(r3)
            throw r2
        L_0x004d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p148e.C4504cl.m19374a(com.google.android.gms.internal.e.ga, java.lang.Object):void");
    }

    /* renamed from: g */
    public final boolean mo16587g() {
        for (int i = 0; i < this.f14763a.mo16705c(); i++) {
            if (!m19375a(this.f14763a.mo16703b(i))) {
                return false;
            }
        }
        for (Entry a : this.f14763a.mo16708d()) {
            if (!m19375a(a)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    private static boolean m19375a(Entry<FieldDescriptorType, Object> entry) {
        C4506cn cnVar = (C4506cn) entry.getKey();
        if (cnVar.mo16595c() == C4620gf.MESSAGE) {
            if (cnVar.mo16596d()) {
                for (C4554ec f : (List) entry.getValue()) {
                    if (!f.mo16609f()) {
                        return false;
                    }
                }
            } else {
                Object value = entry.getValue();
                if (value instanceof C4554ec) {
                    if (!((C4554ec) value).mo16609f()) {
                        return false;
                    }
                } else if (value instanceof C4529de) {
                    return true;
                } else {
                    throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                }
            }
        }
        return true;
    }

    /* renamed from: a */
    public final void mo16579a(C4504cl<FieldDescriptorType> clVar) {
        for (int i = 0; i < clVar.f14763a.mo16705c(); i++) {
            m19378b(clVar.f14763a.mo16703b(i));
        }
        for (Entry b : clVar.f14763a.mo16708d()) {
            m19378b(b);
        }
    }

    /* renamed from: a */
    private static Object m19371a(Object obj) {
        if (obj instanceof C4561ej) {
            return ((C4561ej) obj).mo16693a();
        }
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    /* renamed from: b */
    private final void m19378b(Entry<FieldDescriptorType, Object> entry) {
        Object obj;
        C4506cn cnVar = (C4506cn) entry.getKey();
        Object value = entry.getValue();
        if (value instanceof C4529de) {
            value = C4529de.m19468a();
        }
        if (cnVar.mo16596d()) {
            Object a = m19370a((FieldDescriptorType) cnVar);
            if (a == null) {
                a = new ArrayList();
            }
            for (Object a2 : (List) value) {
                ((List) a).add(m19371a(a2));
            }
            this.f14763a.put(cnVar, a);
        } else if (cnVar.mo16595c() == C4620gf.MESSAGE) {
            Object a3 = m19370a((FieldDescriptorType) cnVar);
            if (a3 == null) {
                this.f14763a.put(cnVar, m19371a(value));
                return;
            }
            if (a3 instanceof C4561ej) {
                obj = cnVar.mo16593a((C4561ej) a3, (C4561ej) value);
            } else {
                obj = cnVar.mo16592a(((C4554ec) a3).mo16613j(), (C4554ec) value).mo16622g();
            }
            this.f14763a.put(cnVar, obj);
        } else {
            this.f14763a.put(cnVar, m19371a(value));
        }
    }

    /* renamed from: a */
    static void m19372a(C4487ca caVar, C4615ga gaVar, int i, Object obj) throws IOException {
        if (gaVar == C4615ga.GROUP) {
            C4554ec ecVar = (C4554ec) obj;
            C4520cw.m19449a(ecVar);
            caVar.mo16489a(i, 3);
            ecVar.mo16607a(caVar);
            caVar.mo16489a(i, 4);
            return;
        }
        caVar.mo16489a(i, gaVar.mo16810b());
        switch (C4505cm.f14767b[gaVar.ordinal()]) {
            case 1:
                caVar.mo16484a(((Double) obj).doubleValue());
                return;
            case 2:
                caVar.mo16485a(((Float) obj).floatValue());
                return;
            case 3:
                caVar.mo16496a(((Long) obj).longValue());
                return;
            case 4:
                caVar.mo16496a(((Long) obj).longValue());
                return;
            case 5:
                caVar.mo16486a(((Integer) obj).intValue());
                return;
            case 6:
                caVar.mo16514c(((Long) obj).longValue());
                return;
            case 7:
                caVar.mo16516d(((Integer) obj).intValue());
                return;
            case 8:
                caVar.mo16502a(((Boolean) obj).booleanValue());
                return;
            case 9:
                ((C4554ec) obj).mo16607a(caVar);
                return;
            case 10:
                caVar.mo16498a((C4554ec) obj);
                return;
            case 11:
                if (obj instanceof C4469bj) {
                    caVar.mo16497a((C4469bj) obj);
                    return;
                } else {
                    caVar.mo16500a((String) obj);
                    return;
                }
            case 12:
                if (obj instanceof C4469bj) {
                    caVar.mo16497a((C4469bj) obj);
                    return;
                }
                byte[] bArr = (byte[]) obj;
                caVar.mo16515c(bArr, 0, bArr.length);
                return;
            case 13:
                caVar.mo16504b(((Integer) obj).intValue());
                return;
            case 14:
                caVar.mo16516d(((Integer) obj).intValue());
                return;
            case 15:
                caVar.mo16514c(((Long) obj).longValue());
                return;
            case 16:
                caVar.mo16511c(((Integer) obj).intValue());
                return;
            case 17:
                caVar.mo16509b(((Long) obj).longValue());
                return;
            case 18:
                if (!(obj instanceof C4521cx)) {
                    caVar.mo16486a(((Integer) obj).intValue());
                    break;
                } else {
                    caVar.mo16486a(((C4521cx) obj).mo16629a());
                    return;
                }
        }
    }

    /* renamed from: h */
    public final int mo16588h() {
        int i = 0;
        for (int i2 = 0; i2 < this.f14763a.mo16705c(); i2++) {
            Entry b = this.f14763a.mo16703b(i2);
            i += m19376b((C4506cn) b.getKey(), b.getValue());
        }
        for (Entry entry : this.f14763a.mo16708d()) {
            i += m19376b((C4506cn) entry.getKey(), entry.getValue());
        }
        return i;
    }

    /* renamed from: i */
    public final int mo16590i() {
        int i = 0;
        for (int i2 = 0; i2 < this.f14763a.mo16705c(); i2++) {
            i += m19379c(this.f14763a.mo16703b(i2));
        }
        for (Entry c : this.f14763a.mo16708d()) {
            i += m19379c(c);
        }
        return i;
    }

    /* renamed from: c */
    private static int m19379c(Entry<FieldDescriptorType, Object> entry) {
        C4506cn cnVar = (C4506cn) entry.getKey();
        Object value = entry.getValue();
        if (cnVar.mo16595c() != C4620gf.MESSAGE || cnVar.mo16596d() || cnVar.mo16597e()) {
            return m19376b(cnVar, value);
        }
        if (value instanceof C4529de) {
            return C4487ca.m19120b(((C4506cn) entry.getKey()).mo16591a(), (C4534dj) (C4529de) value);
        }
        return C4487ca.m19137d(((C4506cn) entry.getKey()).mo16591a(), (C4554ec) value);
    }

    /* renamed from: a */
    static int m19368a(C4615ga gaVar, int i, Object obj) {
        int e = C4487ca.m19139e(i);
        if (gaVar == C4615ga.GROUP) {
            C4520cw.m19449a((C4554ec) obj);
            e <<= 1;
        }
        return e + m19377b(gaVar, obj);
    }

    /* renamed from: b */
    private static int m19377b(C4615ga gaVar, Object obj) {
        switch (C4505cm.f14767b[gaVar.ordinal()]) {
            case 1:
                return C4487ca.m19116b(((Double) obj).doubleValue());
            case 2:
                return C4487ca.m19117b(((Float) obj).floatValue());
            case 3:
                return C4487ca.m19138d(((Long) obj).longValue());
            case 4:
                return C4487ca.m19141e(((Long) obj).longValue());
            case 5:
                return C4487ca.m19142f(((Integer) obj).intValue());
            case 6:
                return C4487ca.m19149g(((Long) obj).longValue());
            case 7:
                return C4487ca.m19154i(((Integer) obj).intValue());
            case 8:
                return C4487ca.m19128b(((Boolean) obj).booleanValue());
            case 9:
                return C4487ca.m19133c((C4554ec) obj);
            case 10:
                if (obj instanceof C4529de) {
                    return C4487ca.m19113a((C4534dj) (C4529de) obj);
                }
                return C4487ca.m19125b((C4554ec) obj);
            case 11:
                if (obj instanceof C4469bj) {
                    return C4487ca.m19124b((C4469bj) obj);
                }
                return C4487ca.m19127b((String) obj);
            case 12:
                if (obj instanceof C4469bj) {
                    return C4487ca.m19124b((C4469bj) obj);
                }
                return C4487ca.m19129b((byte[]) obj);
            case 13:
                return C4487ca.m19146g(((Integer) obj).intValue());
            case 14:
                return C4487ca.m19157j(((Integer) obj).intValue());
            case 15:
                return C4487ca.m19153h(((Long) obj).longValue());
            case 16:
                return C4487ca.m19150h(((Integer) obj).intValue());
            case 17:
                return C4487ca.m19145f(((Long) obj).longValue());
            case 18:
                if (obj instanceof C4521cx) {
                    return C4487ca.m19159k(((C4521cx) obj).mo16629a());
                }
                return C4487ca.m19159k(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    /* renamed from: b */
    private static int m19376b(C4506cn<?> cnVar, Object obj) {
        C4615ga b = cnVar.mo16594b();
        int a = cnVar.mo16591a();
        if (!cnVar.mo16596d()) {
            return m19368a(b, a, obj);
        }
        int i = 0;
        if (cnVar.mo16597e()) {
            for (Object b2 : (List) obj) {
                i += m19377b(b, b2);
            }
            return C4487ca.m19139e(a) + i + C4487ca.m19161l(i);
        }
        for (Object a2 : (List) obj) {
            i += m19368a(b, a, a2);
        }
        return i;
    }

    public final /* synthetic */ Object clone() throws CloneNotSupportedException {
        C4504cl clVar = new C4504cl();
        for (int i = 0; i < this.f14763a.mo16705c(); i++) {
            Entry b = this.f14763a.mo16703b(i);
            clVar.m19373a((FieldDescriptorType) (C4506cn) b.getKey(), b.getValue());
        }
        for (Entry entry : this.f14763a.mo16708d()) {
            clVar.m19373a((FieldDescriptorType) (C4506cn) entry.getKey(), entry.getValue());
        }
        clVar.f14765c = this.f14765c;
        return clVar;
    }
}
