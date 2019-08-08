package android.support.p028v7.widget;

import android.support.p017v4.p023d.C0393k.C0394a;
import android.support.p017v4.p023d.C0393k.C0395b;
import android.support.p028v7.widget.RecyclerView.C0901v;
import java.util.ArrayList;
import java.util.List;

/* renamed from: android.support.v7.widget.d */
/* compiled from: AdapterHelper */
class C1002d implements C0947a {

    /* renamed from: a */
    final ArrayList<C1004b> f3310a;

    /* renamed from: b */
    final ArrayList<C1004b> f3311b;

    /* renamed from: c */
    final C1003a f3312c;

    /* renamed from: d */
    Runnable f3313d;

    /* renamed from: e */
    final boolean f3314e;

    /* renamed from: f */
    final C0946ag f3315f;

    /* renamed from: g */
    private C0394a<C1004b> f3316g;

    /* renamed from: h */
    private int f3317h;

    /* renamed from: android.support.v7.widget.d$a */
    /* compiled from: AdapterHelper */
    interface C1003a {
        /* renamed from: a */
        C0901v mo4183a(int i);

        /* renamed from: a */
        void mo4184a(int i, int i2);

        /* renamed from: a */
        void mo4185a(int i, int i2, Object obj);

        /* renamed from: a */
        void mo4186a(C1004b bVar);

        /* renamed from: b */
        void mo4187b(int i, int i2);

        /* renamed from: b */
        void mo4188b(C1004b bVar);

        /* renamed from: c */
        void mo4189c(int i, int i2);

        /* renamed from: d */
        void mo4191d(int i, int i2);
    }

    /* renamed from: android.support.v7.widget.d$b */
    /* compiled from: AdapterHelper */
    static class C1004b {

        /* renamed from: a */
        int f3318a;

        /* renamed from: b */
        int f3319b;

        /* renamed from: c */
        Object f3320c;

        /* renamed from: d */
        int f3321d;

        C1004b(int i, int i2, int i3, Object obj) {
            this.f3318a = i;
            this.f3319b = i2;
            this.f3321d = i3;
            this.f3320c = obj;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public String mo5217a() {
            int i = this.f3318a;
            if (i == 4) {
                return "up";
            }
            if (i == 8) {
                return "mv";
            }
            switch (i) {
                case 1:
                    return "add";
                case 2:
                    return "rm";
                default:
                    return "??";
            }
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append("[");
            sb.append(mo5217a());
            sb.append(",s:");
            sb.append(this.f3319b);
            sb.append("c:");
            sb.append(this.f3321d);
            sb.append(",p:");
            sb.append(this.f3320c);
            sb.append("]");
            return sb.toString();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C1004b bVar = (C1004b) obj;
            if (this.f3318a != bVar.f3318a) {
                return false;
            }
            if (this.f3318a == 8 && Math.abs(this.f3321d - this.f3319b) == 1 && this.f3321d == bVar.f3319b && this.f3319b == bVar.f3321d) {
                return true;
            }
            if (this.f3321d != bVar.f3321d || this.f3319b != bVar.f3319b) {
                return false;
            }
            if (this.f3320c != null) {
                if (!this.f3320c.equals(bVar.f3320c)) {
                    return false;
                }
            } else if (bVar.f3320c != null) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (31 * ((this.f3318a * 31) + this.f3319b)) + this.f3321d;
        }
    }

    C1002d(C1003a aVar) {
        this(aVar, false);
    }

    C1002d(C1003a aVar, boolean z) {
        this.f3316g = new C0395b(30);
        this.f3310a = new ArrayList<>();
        this.f3311b = new ArrayList<>();
        this.f3317h = 0;
        this.f3312c = aVar;
        this.f3314e = z;
        this.f3315f = new C0946ag(this);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5202a() {
        mo5204a((List<C1004b>) this.f3310a);
        mo5204a((List<C1004b>) this.f3311b);
        this.f3317h = 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo5209b() {
        this.f3315f.mo4908a(this.f3310a);
        int size = this.f3310a.size();
        for (int i = 0; i < size; i++) {
            C1004b bVar = (C1004b) this.f3310a.get(i);
            int i2 = bVar.f3318a;
            if (i2 == 4) {
                m4511d(bVar);
            } else if (i2 != 8) {
                switch (i2) {
                    case 1:
                        m4514f(bVar);
                        break;
                    case 2:
                        m4509c(bVar);
                        break;
                }
            } else {
                m4508b(bVar);
            }
            if (this.f3313d != null) {
                this.f3313d.run();
            }
        }
        this.f3310a.clear();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo5212c() {
        int size = this.f3311b.size();
        for (int i = 0; i < size; i++) {
            this.f3312c.mo4188b((C1004b) this.f3311b.get(i));
        }
        mo5204a((List<C1004b>) this.f3311b);
        this.f3317h = 0;
    }

    /* renamed from: b */
    private void m4508b(C1004b bVar) {
        m4515g(bVar);
    }

    /* renamed from: c */
    private void m4509c(C1004b bVar) {
        boolean z;
        boolean z2;
        boolean z3;
        int i = bVar.f3319b;
        int i2 = bVar.f3319b + bVar.f3321d;
        int i3 = bVar.f3319b;
        boolean z4 = true;
        int i4 = 0;
        while (i3 < i2) {
            if (this.f3312c.mo4183a(i3) != null || m4512d(i3)) {
                if (!z4) {
                    m4513e(mo4911a(2, i, i4, null));
                    z3 = true;
                } else {
                    z3 = false;
                }
                z = true;
            } else {
                if (z4) {
                    m4515g(mo4911a(2, i, i4, null));
                    z2 = true;
                } else {
                    z2 = false;
                }
                z = false;
            }
            if (z2) {
                i3 -= i4;
                i2 -= i4;
                i4 = 1;
            } else {
                i4++;
            }
            i3++;
            z4 = z;
        }
        if (i4 != bVar.f3321d) {
            mo4912a(bVar);
            bVar = mo4911a(2, i, i4, null);
        }
        if (!z4) {
            m4513e(bVar);
        } else {
            m4515g(bVar);
        }
    }

    /* renamed from: d */
    private void m4511d(C1004b bVar) {
        int i = bVar.f3319b;
        int i2 = bVar.f3319b + bVar.f3321d;
        char c = 65535;
        int i3 = i;
        int i4 = 0;
        for (int i5 = bVar.f3319b; i5 < i2; i5++) {
            if (this.f3312c.mo4183a(i5) != null || m4512d(i5)) {
                if (c == 0) {
                    m4513e(mo4911a(4, i3, i4, bVar.f3320c));
                    i3 = i5;
                    i4 = 0;
                }
                c = 1;
            } else {
                if (c == 1) {
                    m4515g(mo4911a(4, i3, i4, bVar.f3320c));
                    i3 = i5;
                    i4 = 0;
                }
                c = 0;
            }
            i4++;
        }
        if (i4 != bVar.f3321d) {
            Object obj = bVar.f3320c;
            mo4912a(bVar);
            bVar = mo4911a(4, i3, i4, obj);
        }
        if (c == 0) {
            m4513e(bVar);
        } else {
            m4515g(bVar);
        }
    }

    /* renamed from: e */
    private void m4513e(C1004b bVar) {
        int i;
        if (bVar.f3318a == 1 || bVar.f3318a == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int d = m4510d(bVar.f3319b, bVar.f3318a);
        int i2 = bVar.f3319b;
        int i3 = bVar.f3318a;
        if (i3 == 2) {
            i = 0;
        } else if (i3 != 4) {
            StringBuilder sb = new StringBuilder();
            sb.append("op should be remove or update.");
            sb.append(bVar);
            throw new IllegalArgumentException(sb.toString());
        } else {
            i = 1;
        }
        int i4 = d;
        int i5 = i2;
        int i6 = 1;
        for (int i7 = 1; i7 < bVar.f3321d; i7++) {
            int d2 = m4510d(bVar.f3319b + (i * i7), bVar.f3318a);
            int i8 = bVar.f3318a;
            if (i8 == 2 ? d2 == i4 : i8 == 4 && d2 == i4 + 1) {
                i6++;
            } else {
                C1004b a = mo4911a(bVar.f3318a, i4, i6, bVar.f3320c);
                mo5203a(a, i5);
                mo4912a(a);
                if (bVar.f3318a == 4) {
                    i5 += i6;
                }
                i6 = 1;
                i4 = d2;
            }
        }
        Object obj = bVar.f3320c;
        mo4912a(bVar);
        if (i6 > 0) {
            C1004b a2 = mo4911a(bVar.f3318a, i4, i6, obj);
            mo5203a(a2, i5);
            mo4912a(a2);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5203a(C1004b bVar, int i) {
        this.f3312c.mo4186a(bVar);
        int i2 = bVar.f3318a;
        if (i2 == 2) {
            this.f3312c.mo4184a(i, bVar.f3321d);
        } else if (i2 != 4) {
            throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
        } else {
            this.f3312c.mo4185a(i, bVar.f3321d, bVar.f3320c);
        }
    }

    /* renamed from: d */
    private int m4510d(int i, int i2) {
        int i3;
        int i4;
        for (int size = this.f3311b.size() - 1; size >= 0; size--) {
            C1004b bVar = (C1004b) this.f3311b.get(size);
            if (bVar.f3318a == 8) {
                if (bVar.f3319b < bVar.f3321d) {
                    i4 = bVar.f3319b;
                    i3 = bVar.f3321d;
                } else {
                    i4 = bVar.f3321d;
                    i3 = bVar.f3319b;
                }
                if (i < i4 || i > i3) {
                    if (i < bVar.f3319b) {
                        if (i2 == 1) {
                            bVar.f3319b++;
                            bVar.f3321d++;
                        } else if (i2 == 2) {
                            bVar.f3319b--;
                            bVar.f3321d--;
                        }
                    }
                } else if (i4 == bVar.f3319b) {
                    if (i2 == 1) {
                        bVar.f3321d++;
                    } else if (i2 == 2) {
                        bVar.f3321d--;
                    }
                    i++;
                } else {
                    if (i2 == 1) {
                        bVar.f3319b++;
                    } else if (i2 == 2) {
                        bVar.f3319b--;
                    }
                    i--;
                }
            } else if (bVar.f3319b <= i) {
                if (bVar.f3318a == 1) {
                    i -= bVar.f3321d;
                } else if (bVar.f3318a == 2) {
                    i += bVar.f3321d;
                }
            } else if (i2 == 1) {
                bVar.f3319b++;
            } else if (i2 == 2) {
                bVar.f3319b--;
            }
        }
        for (int size2 = this.f3311b.size() - 1; size2 >= 0; size2--) {
            C1004b bVar2 = (C1004b) this.f3311b.get(size2);
            if (bVar2.f3318a == 8) {
                if (bVar2.f3321d == bVar2.f3319b || bVar2.f3321d < 0) {
                    this.f3311b.remove(size2);
                    mo4912a(bVar2);
                }
            } else if (bVar2.f3321d <= 0) {
                this.f3311b.remove(size2);
                mo4912a(bVar2);
            }
        }
        return i;
    }

    /* renamed from: d */
    private boolean m4512d(int i) {
        int size = this.f3311b.size();
        for (int i2 = 0; i2 < size; i2++) {
            C1004b bVar = (C1004b) this.f3311b.get(i2);
            if (bVar.f3318a == 8) {
                if (mo5201a(bVar.f3321d, i2 + 1) == i) {
                    return true;
                }
            } else if (bVar.f3318a == 1) {
                int i3 = bVar.f3319b + bVar.f3321d;
                for (int i4 = bVar.f3319b; i4 < i3; i4++) {
                    if (mo5201a(i4, i2 + 1) == i) {
                        return true;
                    }
                }
                continue;
            } else {
                continue;
            }
        }
        return false;
    }

    /* renamed from: f */
    private void m4514f(C1004b bVar) {
        m4515g(bVar);
    }

    /* renamed from: g */
    private void m4515g(C1004b bVar) {
        this.f3311b.add(bVar);
        int i = bVar.f3318a;
        if (i == 4) {
            this.f3312c.mo4185a(bVar.f3319b, bVar.f3321d, bVar.f3320c);
        } else if (i != 8) {
            switch (i) {
                case 1:
                    this.f3312c.mo4189c(bVar.f3319b, bVar.f3321d);
                    return;
                case 2:
                    this.f3312c.mo4187b(bVar.f3319b, bVar.f3321d);
                    return;
                default:
                    StringBuilder sb = new StringBuilder();
                    sb.append("Unknown update op type for ");
                    sb.append(bVar);
                    throw new IllegalArgumentException(sb.toString());
            }
        } else {
            this.f3312c.mo4191d(bVar.f3319b, bVar.f3321d);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public boolean mo5214d() {
        return this.f3310a.size() > 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo5205a(int i) {
        return (i & this.f3317h) != 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public int mo5208b(int i) {
        return mo5201a(i, 0);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo5201a(int i, int i2) {
        int size = this.f3311b.size();
        while (i2 < size) {
            C1004b bVar = (C1004b) this.f3311b.get(i2);
            if (bVar.f3318a == 8) {
                if (bVar.f3319b == i) {
                    i = bVar.f3321d;
                } else {
                    if (bVar.f3319b < i) {
                        i--;
                    }
                    if (bVar.f3321d <= i) {
                        i++;
                    }
                }
            } else if (bVar.f3319b > i) {
                continue;
            } else if (bVar.f3318a == 2) {
                if (i < bVar.f3319b + bVar.f3321d) {
                    return -1;
                }
                i -= bVar.f3321d;
            } else if (bVar.f3318a == 1) {
                i += bVar.f3321d;
            }
            i2++;
        }
        return i;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo5207a(int i, int i2, Object obj) {
        boolean z = false;
        if (i2 < 1) {
            return false;
        }
        this.f3310a.add(mo4911a(4, i, i2, obj));
        this.f3317h |= 4;
        if (this.f3310a.size() == 1) {
            z = true;
        }
        return z;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public boolean mo5210b(int i, int i2) {
        boolean z = false;
        if (i2 < 1) {
            return false;
        }
        this.f3310a.add(mo4911a(1, i, i2, null));
        this.f3317h |= 1;
        if (this.f3310a.size() == 1) {
            z = true;
        }
        return z;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public boolean mo5213c(int i, int i2) {
        boolean z = false;
        if (i2 < 1) {
            return false;
        }
        this.f3310a.add(mo4911a(2, i, i2, null));
        this.f3317h |= 2;
        if (this.f3310a.size() == 1) {
            z = true;
        }
        return z;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo5206a(int i, int i2, int i3) {
        boolean z = false;
        if (i == i2) {
            return false;
        }
        if (i3 != 1) {
            throw new IllegalArgumentException("Moving more than 1 item is not supported yet");
        }
        this.f3310a.add(mo4911a(8, i, i2, null));
        this.f3317h |= 8;
        if (this.f3310a.size() == 1) {
            z = true;
        }
        return z;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public void mo5215e() {
        mo5212c();
        int size = this.f3310a.size();
        for (int i = 0; i < size; i++) {
            C1004b bVar = (C1004b) this.f3310a.get(i);
            int i2 = bVar.f3318a;
            if (i2 == 4) {
                this.f3312c.mo4188b(bVar);
                this.f3312c.mo4185a(bVar.f3319b, bVar.f3321d, bVar.f3320c);
            } else if (i2 != 8) {
                switch (i2) {
                    case 1:
                        this.f3312c.mo4188b(bVar);
                        this.f3312c.mo4189c(bVar.f3319b, bVar.f3321d);
                        break;
                    case 2:
                        this.f3312c.mo4188b(bVar);
                        this.f3312c.mo4184a(bVar.f3319b, bVar.f3321d);
                        break;
                }
            } else {
                this.f3312c.mo4188b(bVar);
                this.f3312c.mo4191d(bVar.f3319b, bVar.f3321d);
            }
            if (this.f3313d != null) {
                this.f3313d.run();
            }
        }
        mo5204a((List<C1004b>) this.f3310a);
        this.f3317h = 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0047, code lost:
        continue;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo5211c(int r6) {
        /*
            r5 = this;
            java.util.ArrayList<android.support.v7.widget.d$b> r0 = r5.f3310a
            int r0 = r0.size()
            r1 = 0
        L_0x0007:
            if (r1 >= r0) goto L_0x004a
            java.util.ArrayList<android.support.v7.widget.d$b> r2 = r5.f3310a
            java.lang.Object r2 = r2.get(r1)
            android.support.v7.widget.d$b r2 = (android.support.p028v7.widget.C1002d.C1004b) r2
            int r3 = r2.f3318a
            r4 = 8
            if (r3 == r4) goto L_0x0034
            switch(r3) {
                case 1: goto L_0x002c;
                case 2: goto L_0x001b;
                default: goto L_0x001a;
            }
        L_0x001a:
            goto L_0x0047
        L_0x001b:
            int r3 = r2.f3319b
            if (r3 > r6) goto L_0x0047
            int r3 = r2.f3319b
            int r4 = r2.f3321d
            int r3 = r3 + r4
            if (r3 <= r6) goto L_0x0028
            r6 = -1
            return r6
        L_0x0028:
            int r2 = r2.f3321d
            int r6 = r6 - r2
            goto L_0x0047
        L_0x002c:
            int r3 = r2.f3319b
            if (r3 > r6) goto L_0x0047
            int r2 = r2.f3321d
            int r6 = r6 + r2
            goto L_0x0047
        L_0x0034:
            int r3 = r2.f3319b
            if (r3 != r6) goto L_0x003b
            int r6 = r2.f3321d
            goto L_0x0047
        L_0x003b:
            int r3 = r2.f3319b
            if (r3 >= r6) goto L_0x0041
            int r6 = r6 + -1
        L_0x0041:
            int r2 = r2.f3321d
            if (r2 > r6) goto L_0x0047
            int r6 = r6 + 1
        L_0x0047:
            int r1 = r1 + 1
            goto L_0x0007
        L_0x004a:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p028v7.widget.C1002d.mo5211c(int):int");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public boolean mo5216f() {
        return !this.f3311b.isEmpty() && !this.f3310a.isEmpty();
    }

    /* renamed from: a */
    public C1004b mo4911a(int i, int i2, int i3, Object obj) {
        C1004b bVar = (C1004b) this.f3316g.mo1391a();
        if (bVar == null) {
            return new C1004b(i, i2, i3, obj);
        }
        bVar.f3318a = i;
        bVar.f3319b = i2;
        bVar.f3321d = i3;
        bVar.f3320c = obj;
        return bVar;
    }

    /* renamed from: a */
    public void mo4912a(C1004b bVar) {
        if (!this.f3314e) {
            bVar.f3320c = null;
            this.f3316g.mo1392a(bVar);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5204a(List<C1004b> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            mo4912a((C1004b) list.get(i));
        }
        list.clear();
    }
}
