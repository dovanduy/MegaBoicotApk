package android.support.p028v7.widget;

import android.support.p028v7.widget.RecyclerView.C0901v;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import java.util.ArrayList;
import java.util.List;

/* renamed from: android.support.v7.widget.s */
/* compiled from: ChildHelper */
class C1027s {

    /* renamed from: a */
    final C1029b f3390a;

    /* renamed from: b */
    final C1028a f3391b = new C1028a();

    /* renamed from: c */
    final List<View> f3392c = new ArrayList();

    /* renamed from: android.support.v7.widget.s$a */
    /* compiled from: ChildHelper */
    static class C1028a {

        /* renamed from: a */
        long f3393a = 0;

        /* renamed from: b */
        C1028a f3394b;

        C1028a() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo5324a(int i) {
            if (i >= 64) {
                m4747b();
                this.f3394b.mo5324a(i - 64);
                return;
            }
            this.f3393a |= 1 << i;
        }

        /* renamed from: b */
        private void m4747b() {
            if (this.f3394b == null) {
                this.f3394b = new C1028a();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo5326b(int i) {
            if (i < 64) {
                this.f3393a &= (1 << i) ^ -1;
            } else if (this.f3394b != null) {
                this.f3394b.mo5326b(i - 64);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public boolean mo5327c(int i) {
            if (i >= 64) {
                m4747b();
                return this.f3394b.mo5327c(i - 64);
            }
            return (this.f3393a & (1 << i)) != 0;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo5323a() {
            this.f3393a = 0;
            if (this.f3394b != null) {
                this.f3394b.mo5323a();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo5325a(int i, boolean z) {
            if (i >= 64) {
                m4747b();
                this.f3394b.mo5325a(i - 64, z);
                return;
            }
            boolean z2 = (this.f3393a & Long.MIN_VALUE) != 0;
            long j = (1 << i) - 1;
            this.f3393a = (this.f3393a & j) | ((this.f3393a & (j ^ -1)) << 1);
            if (z) {
                mo5324a(i);
            } else {
                mo5326b(i);
            }
            if (z2 || this.f3394b != null) {
                m4747b();
                this.f3394b.mo5325a(0, z2);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public boolean mo5328d(int i) {
            if (i >= 64) {
                m4747b();
                return this.f3394b.mo5328d(i - 64);
            }
            long j = 1 << i;
            boolean z = (this.f3393a & j) != 0;
            this.f3393a &= j ^ -1;
            long j2 = j - 1;
            this.f3393a = (this.f3393a & j2) | Long.rotateRight(this.f3393a & (j2 ^ -1), 1);
            if (this.f3394b != null) {
                if (this.f3394b.mo5327c(0)) {
                    mo5324a(63);
                }
                this.f3394b.mo5328d(0);
            }
            return z;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public int mo5329e(int i) {
            if (this.f3394b == null) {
                if (i >= 64) {
                    return Long.bitCount(this.f3393a);
                }
                return Long.bitCount(this.f3393a & ((1 << i) - 1));
            } else if (i < 64) {
                return Long.bitCount(this.f3393a & ((1 << i) - 1));
            } else {
                return this.f3394b.mo5329e(i - 64) + Long.bitCount(this.f3393a);
            }
        }

        public String toString() {
            if (this.f3394b == null) {
                return Long.toBinaryString(this.f3393a);
            }
            StringBuilder sb = new StringBuilder();
            sb.append(this.f3394b.toString());
            sb.append("xx");
            sb.append(Long.toBinaryString(this.f3393a));
            return sb.toString();
        }
    }

    /* renamed from: android.support.v7.widget.s$b */
    /* compiled from: ChildHelper */
    interface C1029b {
        /* renamed from: a */
        int mo4172a();

        /* renamed from: a */
        int mo4173a(View view);

        /* renamed from: a */
        void mo4174a(int i);

        /* renamed from: a */
        void mo4175a(View view, int i);

        /* renamed from: a */
        void mo4176a(View view, int i, LayoutParams layoutParams);

        /* renamed from: b */
        C0901v mo4177b(View view);

        /* renamed from: b */
        View mo4178b(int i);

        /* renamed from: b */
        void mo4179b();

        /* renamed from: c */
        void mo4180c(int i);

        /* renamed from: c */
        void mo4181c(View view);

        /* renamed from: d */
        void mo4182d(View view);
    }

    C1027s(C1029b bVar) {
        this.f3390a = bVar;
    }

    /* renamed from: g */
    private void m4728g(View view) {
        this.f3392c.add(view);
        this.f3390a.mo4181c(view);
    }

    /* renamed from: h */
    private boolean m4729h(View view) {
        if (!this.f3392c.remove(view)) {
            return false;
        }
        this.f3390a.mo4182d(view);
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5310a(View view, boolean z) {
        mo5309a(view, -1, z);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5309a(View view, int i, boolean z) {
        int i2;
        if (i < 0) {
            i2 = this.f3390a.mo4172a();
        } else {
            i2 = m4727f(i);
        }
        this.f3391b.mo5325a(i2, z);
        if (z) {
            m4728g(view);
        }
        this.f3390a.mo4175a(view, i2);
    }

    /* renamed from: f */
    private int m4727f(int i) {
        if (i < 0) {
            return -1;
        }
        int a = this.f3390a.mo4172a();
        int i2 = i;
        while (i2 < a) {
            int e = i - (i2 - this.f3391b.mo5329e(i2));
            if (e == 0) {
                while (this.f3391b.mo5327c(i2)) {
                    i2++;
                }
                return i2;
            }
            i2 += e;
        }
        return -1;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5307a(View view) {
        int a = this.f3390a.mo4173a(view);
        if (a >= 0) {
            if (this.f3391b.mo5328d(a)) {
                m4729h(view);
            }
            this.f3390a.mo4174a(a);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5306a(int i) {
        int f = m4727f(i);
        View b = this.f3390a.mo4178b(f);
        if (b != null) {
            if (this.f3391b.mo5328d(f)) {
                m4729h(b);
            }
            this.f3390a.mo4174a(f);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public View mo5313b(int i) {
        return this.f3390a.mo4178b(m4727f(i));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5305a() {
        this.f3391b.mo5323a();
        for (int size = this.f3392c.size() - 1; size >= 0; size--) {
            this.f3390a.mo4182d((View) this.f3392c.get(size));
            this.f3392c.remove(size);
        }
        this.f3390a.mo4179b();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public View mo5315c(int i) {
        int size = this.f3392c.size();
        for (int i2 = 0; i2 < size; i2++) {
            View view = (View) this.f3392c.get(i2);
            C0901v b = this.f3390a.mo4177b(view);
            if (b.getLayoutPosition() == i && !b.isInvalid() && !b.isRemoved()) {
                return view;
            }
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5308a(View view, int i, LayoutParams layoutParams, boolean z) {
        int i2;
        if (i < 0) {
            i2 = this.f3390a.mo4172a();
        } else {
            i2 = m4727f(i);
        }
        this.f3391b.mo5325a(i2, z);
        if (z) {
            m4728g(view);
        }
        this.f3390a.mo4176a(view, i2, layoutParams);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public int mo5311b() {
        return this.f3390a.mo4172a() - this.f3392c.size();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public int mo5314c() {
        return this.f3390a.mo4172a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public View mo5317d(int i) {
        return this.f3390a.mo4178b(i);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public void mo5319e(int i) {
        int f = m4727f(i);
        this.f3391b.mo5328d(f);
        this.f3390a.mo4180c(f);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public int mo5312b(View view) {
        int a = this.f3390a.mo4173a(view);
        if (a != -1 && !this.f3391b.mo5327c(a)) {
            return a - this.f3391b.mo5329e(a);
        }
        return -1;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public boolean mo5316c(View view) {
        return this.f3392c.contains(view);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public void mo5318d(View view) {
        int a = this.f3390a.mo4173a(view);
        if (a < 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("view is not a child, cannot hide ");
            sb.append(view);
            throw new IllegalArgumentException(sb.toString());
        }
        this.f3391b.mo5324a(a);
        m4728g(view);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public void mo5320e(View view) {
        int a = this.f3390a.mo4173a(view);
        if (a < 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("view is not a child, cannot hide ");
            sb.append(view);
            throw new IllegalArgumentException(sb.toString());
        } else if (!this.f3391b.mo5327c(a)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("trying to unhide a view that was not hidden");
            sb2.append(view);
            throw new RuntimeException(sb2.toString());
        } else {
            this.f3391b.mo5326b(a);
            m4729h(view);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f3391b.toString());
        sb.append(", hidden list:");
        sb.append(this.f3392c.size());
        return sb.toString();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public boolean mo5321f(View view) {
        int a = this.f3390a.mo4173a(view);
        if (a == -1) {
            m4729h(view);
            return true;
        } else if (!this.f3391b.mo5327c(a)) {
            return false;
        } else {
            this.f3391b.mo5328d(a);
            m4729h(view);
            this.f3390a.mo4174a(a);
            return true;
        }
    }
}
