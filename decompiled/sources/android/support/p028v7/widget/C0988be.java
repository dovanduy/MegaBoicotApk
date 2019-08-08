package android.support.p028v7.widget;

import android.view.View;

/* renamed from: android.support.v7.widget.be */
/* compiled from: ViewBoundsCheck */
class C0988be {

    /* renamed from: a */
    final C0990b f3274a;

    /* renamed from: b */
    C0989a f3275b = new C0989a();

    /* renamed from: android.support.v7.widget.be$a */
    /* compiled from: ViewBoundsCheck */
    static class C0989a {

        /* renamed from: a */
        int f3276a = 0;

        /* renamed from: b */
        int f3277b;

        /* renamed from: c */
        int f3278c;

        /* renamed from: d */
        int f3279d;

        /* renamed from: e */
        int f3280e;

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public int mo5160a(int i, int i2) {
            if (i > i2) {
                return 1;
            }
            return i == i2 ? 2 : 4;
        }

        C0989a() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo5163a(int i, int i2, int i3, int i4) {
            this.f3277b = i;
            this.f3278c = i2;
            this.f3279d = i3;
            this.f3280e = i4;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo5162a(int i) {
            this.f3276a = i | this.f3276a;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo5161a() {
            this.f3276a = 0;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public boolean mo5164b() {
            if ((this.f3276a & 7) != 0 && (this.f3276a & (mo5160a(this.f3279d, this.f3277b) << 0)) == 0) {
                return false;
            }
            if ((this.f3276a & 112) != 0 && (this.f3276a & (mo5160a(this.f3279d, this.f3278c) << 4)) == 0) {
                return false;
            }
            if ((this.f3276a & 1792) != 0 && (this.f3276a & (mo5160a(this.f3280e, this.f3277b) << 8)) == 0) {
                return false;
            }
            if ((this.f3276a & 28672) == 0 || (this.f3276a & (mo5160a(this.f3280e, this.f3278c) << 12)) != 0) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: android.support.v7.widget.be$b */
    /* compiled from: ViewBoundsCheck */
    interface C0990b {
        /* renamed from: a */
        int mo4393a();

        /* renamed from: a */
        int mo4394a(View view);

        /* renamed from: a */
        View mo4395a(int i);

        /* renamed from: b */
        int mo4396b();

        /* renamed from: b */
        int mo4397b(View view);
    }

    C0988be(C0990b bVar) {
        this.f3274a = bVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public View mo5158a(int i, int i2, int i3, int i4) {
        int a = this.f3274a.mo4393a();
        int b = this.f3274a.mo4396b();
        int i5 = i2 > i ? 1 : -1;
        View view = null;
        while (i != i2) {
            View a2 = this.f3274a.mo4395a(i);
            this.f3275b.mo5163a(a, b, this.f3274a.mo4394a(a2), this.f3274a.mo4397b(a2));
            if (i3 != 0) {
                this.f3275b.mo5161a();
                this.f3275b.mo5162a(i3);
                if (this.f3275b.mo5164b()) {
                    return a2;
                }
            }
            if (i4 != 0) {
                this.f3275b.mo5161a();
                this.f3275b.mo5162a(i4);
                if (this.f3275b.mo5164b()) {
                    view = a2;
                }
            }
            i += i5;
        }
        return view;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo5159a(View view, int i) {
        this.f3275b.mo5163a(this.f3274a.mo4393a(), this.f3274a.mo4396b(), this.f3274a.mo4394a(view), this.f3274a.mo4397b(view));
        if (i == 0) {
            return false;
        }
        this.f3275b.mo5161a();
        this.f3275b.mo5162a(i);
        return this.f3275b.mo5164b();
    }
}
