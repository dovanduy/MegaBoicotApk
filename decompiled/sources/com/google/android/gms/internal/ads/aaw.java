package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.aay;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;

final class aaw<FieldDescriptorType extends aay<FieldDescriptorType>> {

    /* renamed from: d */
    private static final aaw f10337d = new aaw(true);

    /* renamed from: a */
    private final adh<FieldDescriptorType, Object> f10338a = adh.m13670a(16);

    /* renamed from: b */
    private boolean f10339b;

    /* renamed from: c */
    private boolean f10340c = false;

    private aaw() {
    }

    private aaw(boolean z) {
        mo13955c();
    }

    /* renamed from: a */
    static int m13243a(ael ael, int i, Object obj) {
        int e = aak.m13077e(i);
        if (ael == ael.GROUP) {
            abg.m13323a((acl) obj);
            e <<= 1;
        }
        return e + m13252b(ael, obj);
    }

    /* renamed from: a */
    public static <T extends aay<T>> aaw<T> m13244a() {
        return f10337d;
    }

    /* renamed from: a */
    private final Object m13245a(FieldDescriptorType fielddescriptortype) {
        Object obj = this.f10338a.get(fielddescriptortype);
        return obj instanceof abn ? abn.m13342a() : obj;
    }

    /* renamed from: a */
    private static Object m13246a(Object obj) {
        if (obj instanceof act) {
            return ((act) obj).mo14080a();
        }
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    /* renamed from: a */
    static void m13247a(aak aak, ael ael, int i, Object obj) throws IOException {
        if (ael == ael.GROUP) {
            acl acl = (acl) obj;
            abg.m13323a(acl);
            aak.mo13854a(i, 3);
            acl.mo13981a(aak);
            aak.mo13854a(i, 4);
            return;
        }
        aak.mo13854a(i, ael.mo14216b());
        switch (aax.f10342b[ael.ordinal()]) {
            case 1:
                aak.mo13849a(((Double) obj).doubleValue());
                return;
            case 2:
                aak.mo13850a(((Float) obj).floatValue());
                return;
            case 3:
                aak.mo13861a(((Long) obj).longValue());
                return;
            case 4:
                aak.mo13861a(((Long) obj).longValue());
                return;
            case 5:
                aak.mo13851a(((Integer) obj).intValue());
                return;
            case 6:
                aak.mo13877c(((Long) obj).longValue());
                return;
            case 7:
                aak.mo13879d(((Integer) obj).intValue());
                return;
            case 8:
                aak.mo13866a(((Boolean) obj).booleanValue());
                return;
            case 9:
                ((acl) obj).mo13981a(aak);
                return;
            case 10:
                aak.mo13862a((acl) obj);
                return;
            case 11:
                if (obj instanceof C4386zw) {
                    aak.mo13863a((C4386zw) obj);
                    return;
                } else {
                    aak.mo13864a((String) obj);
                    return;
                }
            case 12:
                if (obj instanceof C4386zw) {
                    aak.mo13863a((C4386zw) obj);
                    return;
                }
                byte[] bArr = (byte[]) obj;
                aak.mo13878c(bArr, 0, bArr.length);
                return;
            case 13:
                aak.mo13868b(((Integer) obj).intValue());
                return;
            case 14:
                aak.mo13879d(((Integer) obj).intValue());
                return;
            case 15:
                aak.mo13877c(((Long) obj).longValue());
                return;
            case 16:
                aak.mo13874c(((Integer) obj).intValue());
                return;
            case 17:
                aak.mo13872b(((Long) obj).longValue());
                return;
            case 18:
                if (obj instanceof abh) {
                    aak.mo13851a(((abh) obj).mo14004a());
                    return;
                } else {
                    aak.mo13851a(((Integer) obj).intValue());
                    return;
                }
            default:
                return;
        }
    }

    /* renamed from: a */
    private final void m13248a(FieldDescriptorType fielddescriptortype, Object obj) {
        if (!fielddescriptortype.mo13970d()) {
            m13249a(fielddescriptortype.mo13968b(), obj);
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
                m13249a(fielddescriptortype.mo13968b(), obj2);
            }
            r7 = arrayList;
        }
        if (r7 instanceof abn) {
            this.f10340c = true;
        }
        this.f10338a.put(fielddescriptortype, r7);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002e, code lost:
        if ((r3 instanceof byte[]) == false) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001b, code lost:
        if ((r3 instanceof com.google.android.gms.internal.ads.abn) == false) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0024, code lost:
        if ((r3 instanceof com.google.android.gms.internal.ads.abh) == false) goto L_0x0043;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m13249a(com.google.android.gms.internal.ads.ael r2, java.lang.Object r3) {
        /*
            com.google.android.gms.internal.ads.abg.m13320a(r3)
            int[] r0 = com.google.android.gms.internal.ads.aax.f10341a
            com.google.android.gms.internal.ads.aeq r2 = r2.mo14215a()
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
            boolean r2 = r3 instanceof com.google.android.gms.internal.ads.acl
            if (r2 != 0) goto L_0x0026
            boolean r2 = r3 instanceof com.google.android.gms.internal.ads.abn
            if (r2 == 0) goto L_0x0043
            goto L_0x0026
        L_0x001e:
            boolean r2 = r3 instanceof java.lang.Integer
            if (r2 != 0) goto L_0x0026
            boolean r2 = r3 instanceof com.google.android.gms.internal.ads.abh
            if (r2 == 0) goto L_0x0043
        L_0x0026:
            r1 = r0
            goto L_0x0043
        L_0x0028:
            boolean r2 = r3 instanceof com.google.android.gms.internal.ads.C4386zw
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.aaw.m13249a(com.google.android.gms.internal.ads.ael, java.lang.Object):void");
    }

    /* renamed from: a */
    private static boolean m13250a(Entry<FieldDescriptorType, Object> entry) {
        aay aay = (aay) entry.getKey();
        if (aay.mo13969c() == aeq.MESSAGE) {
            if (aay.mo13970d()) {
                for (acl k : (List) entry.getValue()) {
                    if (!k.mo13985k()) {
                        return false;
                    }
                }
            } else {
                Object value = entry.getValue();
                if (value instanceof acl) {
                    if (!((acl) value).mo13985k()) {
                        return false;
                    }
                } else if (value instanceof abn) {
                    return true;
                } else {
                    throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                }
            }
        }
        return true;
    }

    /* renamed from: b */
    private static int m13251b(aay<?> aay, Object obj) {
        ael b = aay.mo13968b();
        int a = aay.mo13965a();
        if (!aay.mo13970d()) {
            return m13243a(b, a, obj);
        }
        int i = 0;
        if (aay.mo13971e()) {
            for (Object b2 : (List) obj) {
                i += m13252b(b, b2);
            }
            return aak.m13077e(a) + i + aak.m13099l(i);
        }
        for (Object a2 : (List) obj) {
            i += m13243a(b, a, a2);
        }
        return i;
    }

    /* renamed from: b */
    private static int m13252b(ael ael, Object obj) {
        switch (aax.f10342b[ael.ordinal()]) {
            case 1:
                return aak.m13056b(((Double) obj).doubleValue());
            case 2:
                return aak.m13057b(((Float) obj).floatValue());
            case 3:
                return aak.m13076d(((Long) obj).longValue());
            case 4:
                return aak.m13079e(((Long) obj).longValue());
            case 5:
                return aak.m13080f(((Integer) obj).intValue());
            case 6:
                return aak.m13087g(((Long) obj).longValue());
            case 7:
                return aak.m13092i(((Integer) obj).intValue());
            case 8:
                return aak.m13068b(((Boolean) obj).booleanValue());
            case 9:
                return aak.m13072c((acl) obj);
            case 10:
                return obj instanceof abn ? aak.m13053a((abs) (abn) obj) : aak.m13065b((acl) obj);
            case 11:
                return obj instanceof C4386zw ? aak.m13066b((C4386zw) obj) : aak.m13067b((String) obj);
            case 12:
                return obj instanceof C4386zw ? aak.m13066b((C4386zw) obj) : aak.m13069b((byte[]) obj);
            case 13:
                return aak.m13084g(((Integer) obj).intValue());
            case 14:
                return aak.m13095j(((Integer) obj).intValue());
            case 15:
                return aak.m13091h(((Long) obj).longValue());
            case 16:
                return aak.m13088h(((Integer) obj).intValue());
            case 17:
                return aak.m13083f(((Long) obj).longValue());
            case 18:
                return obj instanceof abh ? aak.m13097k(((abh) obj).mo14004a()) : aak.m13097k(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    /* renamed from: b */
    private final void m13253b(Entry<FieldDescriptorType, Object> entry) {
        aay aay = (aay) entry.getKey();
        Object value = entry.getValue();
        if (value instanceof abn) {
            value = abn.m13342a();
        }
        if (aay.mo13970d()) {
            Object a = m13245a((FieldDescriptorType) aay);
            if (a == null) {
                a = new ArrayList();
            }
            for (Object a2 : (List) value) {
                ((List) a).add(m13246a(a2));
            }
            this.f10338a.put(aay, a);
        } else if (aay.mo13969c() == aeq.MESSAGE) {
            Object a3 = m13245a((FieldDescriptorType) aay);
            if (a3 == null) {
                this.f10338a.put(aay, m13246a(value));
            } else {
                this.f10338a.put(aay, a3 instanceof act ? aay.mo13967a((act) a3, (act) value) : aay.mo13966a(((acl) a3).mo13987n(), (acl) value).mo13998e());
            }
        } else {
            this.f10338a.put(aay, m13246a(value));
        }
    }

    /* renamed from: c */
    private static int m13254c(Entry<FieldDescriptorType, Object> entry) {
        aay aay = (aay) entry.getKey();
        Object value = entry.getValue();
        return (aay.mo13969c() != aeq.MESSAGE || aay.mo13970d() || aay.mo13971e()) ? m13251b(aay, value) : value instanceof abn ? aak.m13060b(((aay) entry.getKey()).mo13965a(), (abs) (abn) value) : aak.m13061b(((aay) entry.getKey()).mo13965a(), (acl) value);
    }

    /* renamed from: a */
    public final void mo13953a(aaw<FieldDescriptorType> aaw) {
        for (int i = 0; i < aaw.f10338a.mo14116c(); i++) {
            m13253b(aaw.f10338a.mo14114b(i));
        }
        for (Entry b : aaw.f10338a.mo14119d()) {
            m13253b(b);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final boolean mo13954b() {
        return this.f10338a.isEmpty();
    }

    /* renamed from: c */
    public final void mo13955c() {
        if (!this.f10339b) {
            this.f10338a.mo14113a();
            this.f10339b = true;
        }
    }

    public final /* synthetic */ Object clone() throws CloneNotSupportedException {
        aaw aaw = new aaw();
        for (int i = 0; i < this.f10338a.mo14116c(); i++) {
            Entry b = this.f10338a.mo14114b(i);
            aaw.m13248a((FieldDescriptorType) (aay) b.getKey(), b.getValue());
        }
        for (Entry entry : this.f10338a.mo14119d()) {
            aaw.m13248a((FieldDescriptorType) (aay) entry.getKey(), entry.getValue());
        }
        aaw.f10340c = this.f10340c;
        return aaw;
    }

    /* renamed from: d */
    public final boolean mo13957d() {
        return this.f10339b;
    }

    /* renamed from: e */
    public final Iterator<Entry<FieldDescriptorType, Object>> mo13958e() {
        return this.f10340c ? new abr(this.f10338a.entrySet().iterator()) : this.f10338a.entrySet().iterator();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aaw)) {
            return false;
        }
        return this.f10338a.equals(((aaw) obj).f10338a);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public final Iterator<Entry<FieldDescriptorType, Object>> mo13960f() {
        return this.f10340c ? new abr(this.f10338a.mo14120e().iterator()) : this.f10338a.mo14120e().iterator();
    }

    /* renamed from: g */
    public final boolean mo13961g() {
        for (int i = 0; i < this.f10338a.mo14116c(); i++) {
            if (!m13250a(this.f10338a.mo14114b(i))) {
                return false;
            }
        }
        for (Entry a : this.f10338a.mo14119d()) {
            if (!m13250a(a)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: h */
    public final int mo13962h() {
        int i = 0;
        for (int i2 = 0; i2 < this.f10338a.mo14116c(); i2++) {
            Entry b = this.f10338a.mo14114b(i2);
            i += m13251b((aay) b.getKey(), b.getValue());
        }
        for (Entry entry : this.f10338a.mo14119d()) {
            i += m13251b((aay) entry.getKey(), entry.getValue());
        }
        return i;
    }

    public final int hashCode() {
        return this.f10338a.hashCode();
    }

    /* renamed from: i */
    public final int mo13964i() {
        int i = 0;
        for (int i2 = 0; i2 < this.f10338a.mo14116c(); i2++) {
            i += m13254c(this.f10338a.mo14114b(i2));
        }
        for (Entry c : this.f10338a.mo14119d()) {
            i += m13254c(c);
        }
        return i;
    }
}
