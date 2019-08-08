package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

final class aez implements Cloneable {

    /* renamed from: a */
    private aex<?, ?> f10683a;

    /* renamed from: b */
    private Object f10684b;

    /* renamed from: c */
    private List<afe> f10685c = new ArrayList();

    aez() {
    }

    /* renamed from: b */
    private final byte[] m13965b() throws IOException {
        byte[] bArr = new byte[mo14258a()];
        mo14259a(aeu.m13930a(bArr));
        return bArr;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public final aez clone() {
        Object clone;
        aez aez = new aez();
        try {
            aez.f10683a = this.f10683a;
            if (this.f10685c == null) {
                aez.f10685c = null;
            } else {
                aez.f10685c.addAll(this.f10685c);
            }
            if (this.f10684b != null) {
                if (this.f10684b instanceof afc) {
                    clone = (afc) ((afc) this.f10684b).clone();
                } else if (this.f10684b instanceof byte[]) {
                    clone = ((byte[]) this.f10684b).clone();
                } else {
                    int i = 0;
                    if (this.f10684b instanceof byte[][]) {
                        byte[][] bArr = (byte[][]) this.f10684b;
                        byte[][] bArr2 = new byte[bArr.length][];
                        aez.f10684b = bArr2;
                        while (i < bArr.length) {
                            bArr2[i] = (byte[]) bArr[i].clone();
                            i++;
                        }
                    } else if (this.f10684b instanceof boolean[]) {
                        clone = ((boolean[]) this.f10684b).clone();
                    } else if (this.f10684b instanceof int[]) {
                        clone = ((int[]) this.f10684b).clone();
                    } else if (this.f10684b instanceof long[]) {
                        clone = ((long[]) this.f10684b).clone();
                    } else if (this.f10684b instanceof float[]) {
                        clone = ((float[]) this.f10684b).clone();
                    } else if (this.f10684b instanceof double[]) {
                        clone = ((double[]) this.f10684b).clone();
                    } else if (this.f10684b instanceof afc[]) {
                        afc[] afcArr = (afc[]) this.f10684b;
                        afc[] afcArr2 = new afc[afcArr.length];
                        aez.f10684b = afcArr2;
                        while (i < afcArr.length) {
                            afcArr2[i] = (afc) afcArr[i].clone();
                            i++;
                        }
                    }
                }
                aez.f10684b = clone;
                return aez;
            }
            return aez;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final int mo14258a() {
        if (this.f10684b != null) {
            throw new NoSuchMethodError();
        }
        int i = 0;
        for (afe afe : this.f10685c) {
            i += aeu.m13941d(afe.f10690a) + 0 + afe.f10691b.length;
        }
        return i;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo14259a(aeu aeu) throws IOException {
        if (this.f10684b != null) {
            throw new NoSuchMethodError();
        }
        for (afe afe : this.f10685c) {
            aeu.mo14243c(afe.f10690a);
            aeu.mo14245c(afe.f10691b);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo14260a(afe afe) throws IOException {
        if (this.f10685c != null) {
            this.f10685c.add(afe);
        } else if (this.f10684b instanceof afc) {
            byte[] bArr = afe.f10691b;
            aes a = aes.m13901a(bArr, 0, bArr.length);
            int g = a.mo14231g();
            if (g != bArr.length - aeu.m13926a(g)) {
                throw afb.m13971a();
            }
            afc a2 = ((afc) this.f10684b).mo13937a(a);
            this.f10683a = this.f10683a;
            this.f10684b = a2;
            this.f10685c = null;
        } else if (this.f10684b instanceof afc[]) {
            Collections.singletonList(afe);
            throw new NoSuchMethodError();
        } else {
            Collections.singletonList(afe);
            throw new NoSuchMethodError();
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof aez)) {
            return false;
        }
        aez aez = (aez) obj;
        if (this.f10684b == null || aez.f10684b == null) {
            if (this.f10685c != null && aez.f10685c != null) {
                return this.f10685c.equals(aez.f10685c);
            }
            try {
                return Arrays.equals(m13965b(), aez.m13965b());
            } catch (IOException e) {
                throw new IllegalStateException(e);
            }
        } else if (this.f10683a != aez.f10683a) {
            return false;
        } else {
            return !this.f10683a.f10677a.isArray() ? this.f10684b.equals(aez.f10684b) : this.f10684b instanceof byte[] ? Arrays.equals((byte[]) this.f10684b, (byte[]) aez.f10684b) : this.f10684b instanceof int[] ? Arrays.equals((int[]) this.f10684b, (int[]) aez.f10684b) : this.f10684b instanceof long[] ? Arrays.equals((long[]) this.f10684b, (long[]) aez.f10684b) : this.f10684b instanceof float[] ? Arrays.equals((float[]) this.f10684b, (float[]) aez.f10684b) : this.f10684b instanceof double[] ? Arrays.equals((double[]) this.f10684b, (double[]) aez.f10684b) : this.f10684b instanceof boolean[] ? Arrays.equals((boolean[]) this.f10684b, (boolean[]) aez.f10684b) : Arrays.deepEquals((Object[]) this.f10684b, (Object[]) aez.f10684b);
        }
    }

    public final int hashCode() {
        try {
            return 527 + Arrays.hashCode(m13965b());
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }
}
