package android.support.p028v7.widget;

import android.support.p028v7.widget.RecyclerView.C0881i;
import android.support.p028v7.widget.RecyclerView.C0887k;
import android.support.p028v7.widget.RecyclerView.C0889m;
import android.support.p028v7.widget.RecyclerView.C0895r;
import android.support.p028v7.widget.RecyclerView.C0895r.C0896a;
import android.support.p028v7.widget.RecyclerView.C0895r.C0897b;
import android.support.p028v7.widget.RecyclerView.C0898s;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;

/* renamed from: android.support.v7.widget.ar */
/* compiled from: SnapHelper */
public abstract class C0967ar extends C0887k {

    /* renamed from: a */
    RecyclerView f3181a;

    /* renamed from: b */
    private Scroller f3182b;

    /* renamed from: c */
    private final C0889m f3183c = new C0889m() {

        /* renamed from: a */
        boolean f3184a = false;

        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            super.onScrollStateChanged(recyclerView, i);
            if (i == 0 && this.f3184a) {
                this.f3184a = false;
                C0967ar.this.mo5067a();
            }
        }

        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            if (i != 0 || i2 != 0) {
                this.f3184a = true;
            }
        }
    };

    /* renamed from: a */
    public abstract int mo4929a(C0881i iVar, int i, int i2);

    /* renamed from: a */
    public abstract View mo4930a(C0881i iVar);

    /* renamed from: a */
    public abstract int[] mo4931a(C0881i iVar, View view);

    /* renamed from: a */
    public boolean mo4401a(int i, int i2) {
        C0881i layoutManager = this.f3181a.getLayoutManager();
        boolean z = false;
        if (layoutManager == null || this.f3181a.getAdapter() == null) {
            return false;
        }
        int minFlingVelocity = this.f3181a.getMinFlingVelocity();
        if ((Math.abs(i2) > minFlingVelocity || Math.abs(i) > minFlingVelocity) && m4322b(layoutManager, i, i2)) {
            z = true;
        }
        return z;
    }

    /* renamed from: a */
    public void mo5068a(RecyclerView recyclerView) throws IllegalStateException {
        if (this.f3181a != recyclerView) {
            if (this.f3181a != null) {
                m4323c();
            }
            this.f3181a = recyclerView;
            if (this.f3181a != null) {
                m4321b();
                this.f3182b = new Scroller(this.f3181a.getContext(), new DecelerateInterpolator());
                mo5067a();
            }
        }
    }

    /* renamed from: b */
    private void m4321b() throws IllegalStateException {
        if (this.f3181a.getOnFlingListener() != null) {
            throw new IllegalStateException("An instance of OnFlingListener already set.");
        }
        this.f3181a.addOnScrollListener(this.f3183c);
        this.f3181a.setOnFlingListener(this);
    }

    /* renamed from: c */
    private void m4323c() {
        this.f3181a.removeOnScrollListener(this.f3183c);
        this.f3181a.setOnFlingListener(null);
    }

    /* renamed from: b */
    private boolean m4322b(C0881i iVar, int i, int i2) {
        if (!(iVar instanceof C0897b)) {
            return false;
        }
        C0895r c = mo5069c(iVar);
        if (c == null) {
            return false;
        }
        int a = mo4929a(iVar, i, i2);
        if (a == -1) {
            return false;
        }
        c.setTargetPosition(a);
        iVar.startSmoothScroll(c);
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5067a() {
        if (this.f3181a != null) {
            C0881i layoutManager = this.f3181a.getLayoutManager();
            if (layoutManager != null) {
                View a = mo4930a(layoutManager);
                if (a != null) {
                    int[] a2 = mo4931a(layoutManager, a);
                    if (!(a2[0] == 0 && a2[1] == 0)) {
                        this.f3181a.smoothScrollBy(a2[0], a2[1]);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public C0895r mo5069c(C0881i iVar) {
        return mo4932b(iVar);
    }

    /* access modifiers changed from: protected */
    @Deprecated
    /* renamed from: b */
    public C0942ad mo4932b(C0881i iVar) {
        if (!(iVar instanceof C0897b)) {
            return null;
        }
        return new C0942ad(this.f3181a.getContext()) {
            /* access modifiers changed from: protected */
            public void onTargetFound(View view, C0898s sVar, C0896a aVar) {
                if (C0967ar.this.f3181a != null) {
                    int[] a = C0967ar.this.mo4931a(C0967ar.this.f3181a.getLayoutManager(), view);
                    int i = a[0];
                    int i2 = a[1];
                    int calculateTimeForDeceleration = calculateTimeForDeceleration(Math.max(Math.abs(i), Math.abs(i2)));
                    if (calculateTimeForDeceleration > 0) {
                        aVar.mo4475a(i, i2, calculateTimeForDeceleration, this.mDecelerateInterpolator);
                    }
                }
            }

            /* access modifiers changed from: protected */
            public float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
                return 100.0f / ((float) displayMetrics.densityDpi);
            }
        };
    }
}
