package android.support.p028v7.widget;

import android.support.p017v4.p025os.C0541d;
import android.support.p028v7.widget.RecyclerView.C0881i;
import android.support.p028v7.widget.RecyclerView.C0881i.C0884a;
import android.support.p028v7.widget.RecyclerView.C0892o;
import android.support.p028v7.widget.RecyclerView.C0901v;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

/* renamed from: android.support.v7.widget.ab */
/* compiled from: GapWorker */
final class C0937ab implements Runnable {

    /* renamed from: a */
    static final ThreadLocal<C0937ab> f3082a = new ThreadLocal<>();

    /* renamed from: e */
    static Comparator<C0940b> f3083e = new Comparator<C0940b>() {
        /* renamed from: a */
        public int compare(C0940b bVar, C0940b bVar2) {
            int i = 1;
            if ((bVar.f3095d == null) != (bVar2.f3095d == null)) {
                if (bVar.f3095d != null) {
                    i = -1;
                }
                return i;
            } else if (bVar.f3092a != bVar2.f3092a) {
                if (bVar.f3092a) {
                    i = -1;
                }
                return i;
            } else {
                int i2 = bVar2.f3093b - bVar.f3093b;
                if (i2 != 0) {
                    return i2;
                }
                int i3 = bVar.f3094c - bVar2.f3094c;
                if (i3 != 0) {
                    return i3;
                }
                return 0;
            }
        }
    };

    /* renamed from: b */
    ArrayList<RecyclerView> f3084b = new ArrayList<>();

    /* renamed from: c */
    long f3085c;

    /* renamed from: d */
    long f3086d;

    /* renamed from: f */
    private ArrayList<C0940b> f3087f = new ArrayList<>();

    /* renamed from: android.support.v7.widget.ab$a */
    /* compiled from: GapWorker */
    static class C0939a implements C0884a {

        /* renamed from: a */
        int f3088a;

        /* renamed from: b */
        int f3089b;

        /* renamed from: c */
        int[] f3090c;

        /* renamed from: d */
        int f3091d;

        C0939a() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo4877a(int i, int i2) {
            this.f3088a = i;
            this.f3089b = i2;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo4878a(RecyclerView recyclerView, boolean z) {
            this.f3091d = 0;
            if (this.f3090c != null) {
                Arrays.fill(this.f3090c, -1);
            }
            C0881i iVar = recyclerView.mLayout;
            if (recyclerView.mAdapter != null && iVar != null && iVar.isItemPrefetchEnabled()) {
                if (z) {
                    if (!recyclerView.mAdapterHelper.mo5214d()) {
                        iVar.collectInitialPrefetchPositions(recyclerView.mAdapter.getItemCount(), this);
                    }
                } else if (!recyclerView.hasPendingAdapterUpdates()) {
                    iVar.collectAdjacentPrefetchPositions(this.f3088a, this.f3089b, recyclerView.mState, this);
                }
                if (this.f3091d > iVar.mPrefetchMaxCountObserved) {
                    iVar.mPrefetchMaxCountObserved = this.f3091d;
                    iVar.mPrefetchMaxObservedInInitialPrefetch = z;
                    recyclerView.mRecycler.mo4433b();
                }
            }
        }

        /* renamed from: b */
        public void mo4398b(int i, int i2) {
            if (i < 0) {
                throw new IllegalArgumentException("Layout positions must be non-negative");
            } else if (i2 < 0) {
                throw new IllegalArgumentException("Pixel distance must be non-negative");
            } else {
                int i3 = this.f3091d * 2;
                if (this.f3090c == null) {
                    this.f3090c = new int[4];
                    Arrays.fill(this.f3090c, -1);
                } else if (i3 >= this.f3090c.length) {
                    int[] iArr = this.f3090c;
                    this.f3090c = new int[(i3 * 2)];
                    System.arraycopy(iArr, 0, this.f3090c, 0, iArr.length);
                }
                this.f3090c[i3] = i;
                this.f3090c[i3 + 1] = i2;
                this.f3091d++;
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo4879a(int i) {
            if (this.f3090c != null) {
                int i2 = this.f3091d * 2;
                for (int i3 = 0; i3 < i2; i3 += 2) {
                    if (this.f3090c[i3] == i) {
                        return true;
                    }
                }
            }
            return false;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo4876a() {
            if (this.f3090c != null) {
                Arrays.fill(this.f3090c, -1);
            }
            this.f3091d = 0;
        }
    }

    /* renamed from: android.support.v7.widget.ab$b */
    /* compiled from: GapWorker */
    static class C0940b {

        /* renamed from: a */
        public boolean f3092a;

        /* renamed from: b */
        public int f3093b;

        /* renamed from: c */
        public int f3094c;

        /* renamed from: d */
        public RecyclerView f3095d;

        /* renamed from: e */
        public int f3096e;

        C0940b() {
        }

        /* renamed from: a */
        public void mo4880a() {
            this.f3092a = false;
            this.f3093b = 0;
            this.f3094c = 0;
            this.f3095d = null;
            this.f3096e = 0;
        }
    }

    C0937ab() {
    }

    /* renamed from: a */
    public void mo4870a(RecyclerView recyclerView) {
        this.f3084b.add(recyclerView);
    }

    /* renamed from: b */
    public void mo4872b(RecyclerView recyclerView) {
        this.f3084b.remove(recyclerView);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo4871a(RecyclerView recyclerView, int i, int i2) {
        if (recyclerView.isAttachedToWindow() && this.f3085c == 0) {
            this.f3085c = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        recyclerView.mPrefetchRegistry.mo4877a(i, i2);
    }

    /* renamed from: a */
    private void m4147a() {
        C0940b bVar;
        int size = this.f3084b.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            RecyclerView recyclerView = (RecyclerView) this.f3084b.get(i2);
            if (recyclerView.getWindowVisibility() == 0) {
                recyclerView.mPrefetchRegistry.mo4878a(recyclerView, false);
                i += recyclerView.mPrefetchRegistry.f3091d;
            }
        }
        this.f3087f.ensureCapacity(i);
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            RecyclerView recyclerView2 = (RecyclerView) this.f3084b.get(i4);
            if (recyclerView2.getWindowVisibility() == 0) {
                C0939a aVar = recyclerView2.mPrefetchRegistry;
                int abs = Math.abs(aVar.f3088a) + Math.abs(aVar.f3089b);
                int i5 = i3;
                for (int i6 = 0; i6 < aVar.f3091d * 2; i6 += 2) {
                    if (i5 >= this.f3087f.size()) {
                        bVar = new C0940b();
                        this.f3087f.add(bVar);
                    } else {
                        bVar = (C0940b) this.f3087f.get(i5);
                    }
                    int i7 = aVar.f3090c[i6 + 1];
                    bVar.f3092a = i7 <= abs;
                    bVar.f3093b = abs;
                    bVar.f3094c = i7;
                    bVar.f3095d = recyclerView2;
                    bVar.f3096e = aVar.f3090c[i6];
                    i5++;
                }
                i3 = i5;
            }
        }
        Collections.sort(this.f3087f, f3083e);
    }

    /* renamed from: a */
    static boolean m4150a(RecyclerView recyclerView, int i) {
        int c = recyclerView.mChildHelper.mo5314c();
        for (int i2 = 0; i2 < c; i2++) {
            C0901v childViewHolderInt = RecyclerView.getChildViewHolderInt(recyclerView.mChildHelper.mo5317d(i2));
            if (childViewHolderInt.mPosition == i && !childViewHolderInt.isInvalid()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    private C0901v m4146a(RecyclerView recyclerView, int i, long j) {
        if (m4150a(recyclerView, i)) {
            return null;
        }
        C0892o oVar = recyclerView.mRecycler;
        try {
            recyclerView.onEnterLayoutOrScroll();
            C0901v a = oVar.mo4418a(i, false, j);
            if (a != null) {
                if (!a.isBound() || a.isInvalid()) {
                    oVar.mo4428a(a, false);
                } else {
                    oVar.mo4429a(a.itemView);
                }
            }
            return a;
        } finally {
            recyclerView.onExitLayoutOrScroll(false);
        }
    }

    /* renamed from: a */
    private void m4148a(RecyclerView recyclerView, long j) {
        if (recyclerView != null) {
            if (recyclerView.mDataSetHasChangedAfterLayout && recyclerView.mChildHelper.mo5314c() != 0) {
                recyclerView.removeAndRecycleViews();
            }
            C0939a aVar = recyclerView.mPrefetchRegistry;
            aVar.mo4878a(recyclerView, true);
            if (aVar.f3091d != 0) {
                try {
                    C0541d.m2067a("RV Nested Prefetch");
                    recyclerView.mState.mo4479a(recyclerView.mAdapter);
                    for (int i = 0; i < aVar.f3091d * 2; i += 2) {
                        m4146a(recyclerView, aVar.f3090c[i], j);
                    }
                } finally {
                    C0541d.m2066a();
                }
            }
        }
    }

    /* renamed from: a */
    private void m4149a(C0940b bVar, long j) {
        C0901v a = m4146a(bVar.f3095d, bVar.f3096e, bVar.f3092a ? Long.MAX_VALUE : j);
        if (a != null && a.mNestedRecyclerView != null && a.isBound() && !a.isInvalid()) {
            m4148a((RecyclerView) a.mNestedRecyclerView.get(), j);
        }
    }

    /* renamed from: b */
    private void m4151b(long j) {
        int i = 0;
        while (i < this.f3087f.size()) {
            C0940b bVar = (C0940b) this.f3087f.get(i);
            if (bVar.f3095d != null) {
                m4149a(bVar, j);
                bVar.mo4880a();
                i++;
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo4869a(long j) {
        m4147a();
        m4151b(j);
    }

    public void run() {
        try {
            C0541d.m2067a("RV Prefetch");
            if (!this.f3084b.isEmpty()) {
                int size = this.f3084b.size();
                long j = 0;
                for (int i = 0; i < size; i++) {
                    RecyclerView recyclerView = (RecyclerView) this.f3084b.get(i);
                    if (recyclerView.getWindowVisibility() == 0) {
                        j = Math.max(recyclerView.getDrawingTime(), j);
                    }
                }
                if (j == 0) {
                    this.f3085c = 0;
                    C0541d.m2066a();
                    return;
                }
                mo4869a(TimeUnit.MILLISECONDS.toNanos(j) + this.f3086d);
                this.f3085c = 0;
                C0541d.m2066a();
            }
        } finally {
            this.f3085c = 0;
            C0541d.m2066a();
        }
    }
}
