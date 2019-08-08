package com.google.android.gms.internal.p148e;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.internal.e.gn */
final class C4628gn implements Cloneable {

    /* renamed from: a */
    private C4626gl<?, ?> f15071a;

    /* renamed from: b */
    private Object f15072b;

    /* renamed from: c */
    private List<C4633gs> f15073c = new ArrayList();

    C4628gn() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo16862a(C4633gs gsVar) throws IOException {
        Object obj;
        Object obj2;
        if (this.f15073c != null) {
            this.f15073c.add(gsVar);
            return;
        }
        if (this.f15072b instanceof C4631gq) {
            byte[] bArr = gsVar.f15079b;
            C4622gh a = C4622gh.m20018a(bArr, 0, bArr.length);
            int d = a.mo16822d();
            if (d != bArr.length - C4623gi.m20042a(d)) {
                throw C4630gp.m20099a();
            }
            obj = ((C4631gq) this.f15072b).mo16326a(a);
        } else {
            if (this.f15072b instanceof C4631gq[]) {
                C4631gq[] gqVarArr = (C4631gq[]) this.f15071a.mo16848a(Collections.singletonList(gsVar));
                C4631gq[] gqVarArr2 = (C4631gq[]) this.f15072b;
                obj2 = (C4631gq[]) Arrays.copyOf(gqVarArr2, gqVarArr2.length + gqVarArr.length);
                System.arraycopy(gqVarArr, 0, obj2, gqVarArr2.length, gqVarArr.length);
            } else if (this.f15072b instanceof C4554ec) {
                obj = ((C4554ec) this.f15072b).mo16613j().mo16365a((C4554ec) this.f15071a.mo16848a(Collections.singletonList(gsVar))).mo16622g();
            } else if (this.f15072b instanceof C4554ec[]) {
                C4554ec[] ecVarArr = (C4554ec[]) this.f15071a.mo16848a(Collections.singletonList(gsVar));
                C4554ec[] ecVarArr2 = (C4554ec[]) this.f15072b;
                obj2 = (C4554ec[]) Arrays.copyOf(ecVarArr2, ecVarArr2.length + ecVarArr.length);
                System.arraycopy(ecVarArr, 0, obj2, ecVarArr2.length, ecVarArr.length);
            } else {
                obj = this.f15071a.mo16848a(Collections.singletonList(gsVar));
            }
            obj = obj2;
        }
        this.f15071a = this.f15071a;
        this.f15072b = obj;
        this.f15073c = null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final int mo16860a() {
        if (this.f15072b != null) {
            C4626gl<?, ?> glVar = this.f15071a;
            Object obj = this.f15072b;
            if (!glVar.f15064c) {
                return glVar.mo16847a(obj);
            }
            int length = Array.getLength(obj);
            int i = 0;
            for (int i2 = 0; i2 < length; i2++) {
                Object obj2 = Array.get(obj, i2);
                if (obj2 != null) {
                    i += glVar.mo16847a(obj2);
                }
            }
            return i;
        }
        int i3 = 0;
        for (C4633gs gsVar : this.f15073c) {
            i3 += C4623gi.m20056d(gsVar.f15078a) + 0 + gsVar.f15079b.length;
        }
        return i3;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo16861a(C4623gi giVar) throws IOException {
        if (this.f15072b != null) {
            C4626gl<?, ?> glVar = this.f15071a;
            Object obj = this.f15072b;
            if (glVar.f15064c) {
                int length = Array.getLength(obj);
                for (int i = 0; i < length; i++) {
                    Object obj2 = Array.get(obj, i);
                    if (obj2 != null) {
                        glVar.mo16849a(obj2, giVar);
                    }
                }
                return;
            }
            glVar.mo16849a(obj, giVar);
            return;
        }
        for (C4633gs gsVar : this.f15073c) {
            giVar.mo16842c(gsVar.f15078a);
            giVar.mo16841b(gsVar.f15079b);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4628gn)) {
            return false;
        }
        C4628gn gnVar = (C4628gn) obj;
        if (this.f15072b == null || gnVar.f15072b == null) {
            if (this.f15073c != null && gnVar.f15073c != null) {
                return this.f15073c.equals(gnVar.f15073c);
            }
            try {
                return Arrays.equals(m20087b(), gnVar.m20087b());
            } catch (IOException e) {
                throw new IllegalStateException(e);
            }
        } else if (this.f15071a != gnVar.f15071a) {
            return false;
        } else {
            if (!this.f15071a.f15062a.isArray()) {
                return this.f15072b.equals(gnVar.f15072b);
            }
            if (this.f15072b instanceof byte[]) {
                return Arrays.equals((byte[]) this.f15072b, (byte[]) gnVar.f15072b);
            }
            if (this.f15072b instanceof int[]) {
                return Arrays.equals((int[]) this.f15072b, (int[]) gnVar.f15072b);
            }
            if (this.f15072b instanceof long[]) {
                return Arrays.equals((long[]) this.f15072b, (long[]) gnVar.f15072b);
            }
            if (this.f15072b instanceof float[]) {
                return Arrays.equals((float[]) this.f15072b, (float[]) gnVar.f15072b);
            }
            if (this.f15072b instanceof double[]) {
                return Arrays.equals((double[]) this.f15072b, (double[]) gnVar.f15072b);
            }
            if (this.f15072b instanceof boolean[]) {
                return Arrays.equals((boolean[]) this.f15072b, (boolean[]) gnVar.f15072b);
            }
            return Arrays.deepEquals((Object[]) this.f15072b, (Object[]) gnVar.f15072b);
        }
    }

    public final int hashCode() {
        try {
            return 527 + Arrays.hashCode(m20087b());
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: b */
    private final byte[] m20087b() throws IOException {
        byte[] bArr = new byte[mo16860a()];
        mo16861a(C4623gi.m20046a(bArr));
        return bArr;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public final C4628gn clone() {
        C4628gn gnVar = new C4628gn();
        try {
            gnVar.f15071a = this.f15071a;
            if (this.f15073c == null) {
                gnVar.f15073c = null;
            } else {
                gnVar.f15073c.addAll(this.f15073c);
            }
            if (this.f15072b != null) {
                if (this.f15072b instanceof C4631gq) {
                    gnVar.f15072b = (C4631gq) ((C4631gq) this.f15072b).clone();
                } else if (this.f15072b instanceof byte[]) {
                    gnVar.f15072b = ((byte[]) this.f15072b).clone();
                } else {
                    int i = 0;
                    if (this.f15072b instanceof byte[][]) {
                        byte[][] bArr = (byte[][]) this.f15072b;
                        byte[][] bArr2 = new byte[bArr.length][];
                        gnVar.f15072b = bArr2;
                        while (i < bArr.length) {
                            bArr2[i] = (byte[]) bArr[i].clone();
                            i++;
                        }
                    } else if (this.f15072b instanceof boolean[]) {
                        gnVar.f15072b = ((boolean[]) this.f15072b).clone();
                    } else if (this.f15072b instanceof int[]) {
                        gnVar.f15072b = ((int[]) this.f15072b).clone();
                    } else if (this.f15072b instanceof long[]) {
                        gnVar.f15072b = ((long[]) this.f15072b).clone();
                    } else if (this.f15072b instanceof float[]) {
                        gnVar.f15072b = ((float[]) this.f15072b).clone();
                    } else if (this.f15072b instanceof double[]) {
                        gnVar.f15072b = ((double[]) this.f15072b).clone();
                    } else if (this.f15072b instanceof C4631gq[]) {
                        C4631gq[] gqVarArr = (C4631gq[]) this.f15072b;
                        C4631gq[] gqVarArr2 = new C4631gq[gqVarArr.length];
                        gnVar.f15072b = gqVarArr2;
                        while (i < gqVarArr.length) {
                            gqVarArr2[i] = (C4631gq) gqVarArr[i].clone();
                            i++;
                        }
                    }
                }
            }
            return gnVar;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }
}
