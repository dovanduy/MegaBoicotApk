package android.support.p028v7.widget;

import java.util.List;

/* renamed from: android.support.v7.widget.ag */
/* compiled from: OpReorderer */
class C0946ag {

    /* renamed from: a */
    final C0947a f3112a;

    /* renamed from: android.support.v7.widget.ag$a */
    /* compiled from: OpReorderer */
    interface C0947a {
        /* renamed from: a */
        C1004b mo4911a(int i, int i2, int i3, Object obj);

        /* renamed from: a */
        void mo4912a(C1004b bVar);
    }

    C0946ag(C0947a aVar) {
        this.f3112a = aVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo4908a(List<C1004b> list) {
        while (true) {
            int b = m4177b(list);
            if (b != -1) {
                m4176a(list, b, b + 1);
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    private void m4176a(List<C1004b> list, int i, int i2) {
        C1004b bVar = (C1004b) list.get(i);
        C1004b bVar2 = (C1004b) list.get(i2);
        int i3 = bVar2.f3318a;
        if (i3 != 4) {
            switch (i3) {
                case 1:
                    m4178c(list, i, bVar, i2, bVar2);
                    return;
                case 2:
                    mo4909a(list, i, bVar, i2, bVar2);
                    return;
                default:
                    return;
            }
        } else {
            mo4910b(list, i, bVar, i2, bVar2);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo4909a(List<C1004b> list, int i, C1004b bVar, int i2, C1004b bVar2) {
        boolean z;
        boolean z2 = false;
        if (bVar.f3319b < bVar.f3321d) {
            if (bVar2.f3319b == bVar.f3319b && bVar2.f3321d == bVar.f3321d - bVar.f3319b) {
                z = false;
                z2 = true;
            } else {
                z = false;
            }
        } else if (bVar2.f3319b == bVar.f3321d + 1 && bVar2.f3321d == bVar.f3319b - bVar.f3321d) {
            z = true;
            z2 = true;
        } else {
            z = true;
        }
        if (bVar.f3321d < bVar2.f3319b) {
            bVar2.f3319b--;
        } else if (bVar.f3321d < bVar2.f3319b + bVar2.f3321d) {
            bVar2.f3321d--;
            bVar.f3318a = 2;
            bVar.f3321d = 1;
            if (bVar2.f3321d == 0) {
                list.remove(i2);
                this.f3112a.mo4912a(bVar2);
            }
            return;
        }
        C1004b bVar3 = null;
        if (bVar.f3319b <= bVar2.f3319b) {
            bVar2.f3319b++;
        } else if (bVar.f3319b < bVar2.f3319b + bVar2.f3321d) {
            bVar3 = this.f3112a.mo4911a(2, bVar.f3319b + 1, (bVar2.f3319b + bVar2.f3321d) - bVar.f3319b, null);
            bVar2.f3321d = bVar.f3319b - bVar2.f3319b;
        }
        if (z2) {
            list.set(i, bVar2);
            list.remove(i2);
            this.f3112a.mo4912a(bVar);
            return;
        }
        if (z) {
            if (bVar3 != null) {
                if (bVar.f3319b > bVar3.f3319b) {
                    bVar.f3319b -= bVar3.f3321d;
                }
                if (bVar.f3321d > bVar3.f3319b) {
                    bVar.f3321d -= bVar3.f3321d;
                }
            }
            if (bVar.f3319b > bVar2.f3319b) {
                bVar.f3319b -= bVar2.f3321d;
            }
            if (bVar.f3321d > bVar2.f3319b) {
                bVar.f3321d -= bVar2.f3321d;
            }
        } else {
            if (bVar3 != null) {
                if (bVar.f3319b >= bVar3.f3319b) {
                    bVar.f3319b -= bVar3.f3321d;
                }
                if (bVar.f3321d >= bVar3.f3319b) {
                    bVar.f3321d -= bVar3.f3321d;
                }
            }
            if (bVar.f3319b >= bVar2.f3319b) {
                bVar.f3319b -= bVar2.f3321d;
            }
            if (bVar.f3321d >= bVar2.f3319b) {
                bVar.f3321d -= bVar2.f3321d;
            }
        }
        list.set(i, bVar2);
        if (bVar.f3319b != bVar.f3321d) {
            list.set(i2, bVar);
        } else {
            list.remove(i2);
        }
        if (bVar3 != null) {
            list.add(i, bVar3);
        }
    }

    /* renamed from: c */
    private void m4178c(List<C1004b> list, int i, C1004b bVar, int i2, C1004b bVar2) {
        int i3 = bVar.f3321d < bVar2.f3319b ? -1 : 0;
        if (bVar.f3319b < bVar2.f3319b) {
            i3++;
        }
        if (bVar2.f3319b <= bVar.f3319b) {
            bVar.f3319b += bVar2.f3321d;
        }
        if (bVar2.f3319b <= bVar.f3321d) {
            bVar.f3321d += bVar2.f3321d;
        }
        bVar2.f3319b += i3;
        list.set(i, bVar2);
        list.set(i2, bVar);
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002f  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo4910b(java.util.List<android.support.p028v7.widget.C1002d.C1004b> r8, int r9, android.support.p028v7.widget.C1002d.C1004b r10, int r11, android.support.p028v7.widget.C1002d.C1004b r12) {
        /*
            r7 = this;
            int r0 = r10.f3321d
            int r1 = r12.f3319b
            r2 = 4
            r3 = 0
            r4 = 1
            if (r0 >= r1) goto L_0x000f
            int r0 = r12.f3319b
            int r0 = r0 - r4
            r12.f3319b = r0
            goto L_0x0028
        L_0x000f:
            int r0 = r10.f3321d
            int r1 = r12.f3319b
            int r5 = r12.f3321d
            int r1 = r1 + r5
            if (r0 >= r1) goto L_0x0028
            int r0 = r12.f3321d
            int r0 = r0 - r4
            r12.f3321d = r0
            android.support.v7.widget.ag$a r0 = r7.f3112a
            int r1 = r10.f3319b
            java.lang.Object r5 = r12.f3320c
            android.support.v7.widget.d$b r0 = r0.mo4911a(r2, r1, r4, r5)
            goto L_0x0029
        L_0x0028:
            r0 = r3
        L_0x0029:
            int r1 = r10.f3319b
            int r5 = r12.f3319b
            if (r1 > r5) goto L_0x0035
            int r1 = r12.f3319b
            int r1 = r1 + r4
            r12.f3319b = r1
            goto L_0x0056
        L_0x0035:
            int r1 = r10.f3319b
            int r5 = r12.f3319b
            int r6 = r12.f3321d
            int r5 = r5 + r6
            if (r1 >= r5) goto L_0x0056
            int r1 = r12.f3319b
            int r3 = r12.f3321d
            int r1 = r1 + r3
            int r3 = r10.f3319b
            int r1 = r1 - r3
            android.support.v7.widget.ag$a r3 = r7.f3112a
            int r5 = r10.f3319b
            int r5 = r5 + r4
            java.lang.Object r4 = r12.f3320c
            android.support.v7.widget.d$b r3 = r3.mo4911a(r2, r5, r1, r4)
            int r2 = r12.f3321d
            int r2 = r2 - r1
            r12.f3321d = r2
        L_0x0056:
            r8.set(r11, r10)
            int r10 = r12.f3321d
            if (r10 <= 0) goto L_0x0061
            r8.set(r9, r12)
            goto L_0x0069
        L_0x0061:
            r8.remove(r9)
            android.support.v7.widget.ag$a r10 = r7.f3112a
            r10.mo4912a(r12)
        L_0x0069:
            if (r0 == 0) goto L_0x006e
            r8.add(r9, r0)
        L_0x006e:
            if (r3 == 0) goto L_0x0073
            r8.add(r9, r3)
        L_0x0073:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p028v7.widget.C0946ag.mo4910b(java.util.List, int, android.support.v7.widget.d$b, int, android.support.v7.widget.d$b):void");
    }

    /* renamed from: b */
    private int m4177b(List<C1004b> list) {
        boolean z = false;
        for (int size = list.size() - 1; size >= 0; size--) {
            if (((C1004b) list.get(size)).f3318a != 8) {
                z = true;
            } else if (z) {
                return size;
            }
        }
        return -1;
    }
}
