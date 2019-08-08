package android.support.p028v7.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.support.p017v4.view.C0595r;
import android.support.p028v7.widget.RecyclerView.C0901v;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: android.support.v7.widget.v */
/* compiled from: DefaultItemAnimator */
public class C1032v extends C0966aq {

    /* renamed from: i */
    private static TimeInterpolator f3395i;

    /* renamed from: a */
    ArrayList<ArrayList<C0901v>> f3396a = new ArrayList<>();

    /* renamed from: b */
    ArrayList<ArrayList<C1042b>> f3397b = new ArrayList<>();

    /* renamed from: c */
    ArrayList<ArrayList<C1041a>> f3398c = new ArrayList<>();

    /* renamed from: d */
    ArrayList<C0901v> f3399d = new ArrayList<>();

    /* renamed from: e */
    ArrayList<C0901v> f3400e = new ArrayList<>();

    /* renamed from: f */
    ArrayList<C0901v> f3401f = new ArrayList<>();

    /* renamed from: g */
    ArrayList<C0901v> f3402g = new ArrayList<>();

    /* renamed from: j */
    private ArrayList<C0901v> f3403j = new ArrayList<>();

    /* renamed from: k */
    private ArrayList<C0901v> f3404k = new ArrayList<>();

    /* renamed from: l */
    private ArrayList<C1042b> f3405l = new ArrayList<>();

    /* renamed from: m */
    private ArrayList<C1041a> f3406m = new ArrayList<>();

    /* renamed from: android.support.v7.widget.v$a */
    /* compiled from: DefaultItemAnimator */
    private static class C1041a {

        /* renamed from: a */
        public C0901v f3435a;

        /* renamed from: b */
        public C0901v f3436b;

        /* renamed from: c */
        public int f3437c;

        /* renamed from: d */
        public int f3438d;

        /* renamed from: e */
        public int f3439e;

        /* renamed from: f */
        public int f3440f;

        private C1041a(C0901v vVar, C0901v vVar2) {
            this.f3435a = vVar;
            this.f3436b = vVar2;
        }

        C1041a(C0901v vVar, C0901v vVar2, int i, int i2, int i3, int i4) {
            this(vVar, vVar2);
            this.f3437c = i;
            this.f3438d = i2;
            this.f3439e = i3;
            this.f3440f = i4;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("ChangeInfo{oldHolder=");
            sb.append(this.f3435a);
            sb.append(", newHolder=");
            sb.append(this.f3436b);
            sb.append(", fromX=");
            sb.append(this.f3437c);
            sb.append(", fromY=");
            sb.append(this.f3438d);
            sb.append(", toX=");
            sb.append(this.f3439e);
            sb.append(", toY=");
            sb.append(this.f3440f);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: android.support.v7.widget.v$b */
    /* compiled from: DefaultItemAnimator */
    private static class C1042b {

        /* renamed from: a */
        public C0901v f3441a;

        /* renamed from: b */
        public int f3442b;

        /* renamed from: c */
        public int f3443c;

        /* renamed from: d */
        public int f3444d;

        /* renamed from: e */
        public int f3445e;

        C1042b(C0901v vVar, int i, int i2, int i3, int i4) {
            this.f3441a = vVar;
            this.f3442b = i;
            this.f3443c = i2;
            this.f3444d = i3;
            this.f3445e = i4;
        }
    }

    /* renamed from: a */
    public void mo4249a() {
        boolean z = !this.f3403j.isEmpty();
        boolean z2 = !this.f3405l.isEmpty();
        boolean z3 = !this.f3406m.isEmpty();
        boolean z4 = !this.f3404k.isEmpty();
        if (z || z2 || z4 || z3) {
            Iterator it = this.f3403j.iterator();
            while (it.hasNext()) {
                m4808u((C0901v) it.next());
            }
            this.f3403j.clear();
            if (z2) {
                final ArrayList arrayList = new ArrayList();
                arrayList.addAll(this.f3405l);
                this.f3397b.add(arrayList);
                this.f3405l.clear();
                C10331 r6 = new Runnable() {
                    public void run() {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            C1042b bVar = (C1042b) it.next();
                            C1032v.this.mo5333b(bVar.f3441a, bVar.f3442b, bVar.f3443c, bVar.f3444d, bVar.f3445e);
                        }
                        arrayList.clear();
                        C1032v.this.f3397b.remove(arrayList);
                    }
                };
                if (z) {
                    C0595r.m2243a(((C1042b) arrayList.get(0)).f3441a.itemView, (Runnable) r6, mo4262g());
                } else {
                    r6.run();
                }
            }
            if (z3) {
                final ArrayList arrayList2 = new ArrayList();
                arrayList2.addAll(this.f3406m);
                this.f3398c.add(arrayList2);
                this.f3406m.clear();
                C10342 r62 = new Runnable() {
                    public void run() {
                        Iterator it = arrayList2.iterator();
                        while (it.hasNext()) {
                            C1032v.this.mo5331a((C1041a) it.next());
                        }
                        arrayList2.clear();
                        C1032v.this.f3398c.remove(arrayList2);
                    }
                };
                if (z) {
                    C0595r.m2243a(((C1041a) arrayList2.get(0)).f3435a.itemView, (Runnable) r62, mo4262g());
                } else {
                    r62.run();
                }
            }
            if (z4) {
                final ArrayList arrayList3 = new ArrayList();
                arrayList3.addAll(this.f3404k);
                this.f3396a.add(arrayList3);
                this.f3404k.clear();
                C10353 r5 = new Runnable() {
                    public void run() {
                        Iterator it = arrayList3.iterator();
                        while (it.hasNext()) {
                            C1032v.this.mo5335c((C0901v) it.next());
                        }
                        arrayList3.clear();
                        C1032v.this.f3396a.remove(arrayList3);
                    }
                };
                if (z || z2 || z3) {
                    long j = 0;
                    long g = z ? mo4262g() : 0;
                    long e = z2 ? mo4259e() : 0;
                    if (z3) {
                        j = mo4264h();
                    }
                    C0595r.m2243a(((C0901v) arrayList3.get(0)).itemView, (Runnable) r5, g + Math.max(e, j));
                } else {
                    r5.run();
                }
            }
        }
    }

    /* renamed from: a */
    public boolean mo5048a(C0901v vVar) {
        m4809v(vVar);
        this.f3403j.add(vVar);
        return true;
    }

    /* renamed from: u */
    private void m4808u(final C0901v vVar) {
        final View view = vVar.itemView;
        final ViewPropertyAnimator animate = view.animate();
        this.f3401f.add(vVar);
        animate.setDuration(mo4262g()).alpha(0.0f).setListener(new AnimatorListenerAdapter() {
            public void onAnimationStart(Animator animator) {
                C1032v.this.mo5058l(vVar);
            }

            public void onAnimationEnd(Animator animator) {
                animate.setListener(null);
                view.setAlpha(1.0f);
                C1032v.this.mo5055i(vVar);
                C1032v.this.f3401f.remove(vVar);
                C1032v.this.mo5334c();
            }
        }).start();
    }

    /* renamed from: b */
    public boolean mo5052b(C0901v vVar) {
        m4809v(vVar);
        vVar.itemView.setAlpha(0.0f);
        this.f3404k.add(vVar);
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo5335c(final C0901v vVar) {
        final View view = vVar.itemView;
        final ViewPropertyAnimator animate = view.animate();
        this.f3399d.add(vVar);
        animate.alpha(1.0f).setDuration(mo4260f()).setListener(new AnimatorListenerAdapter() {
            public void onAnimationStart(Animator animator) {
                C1032v.this.mo5060n(vVar);
            }

            public void onAnimationCancel(Animator animator) {
                view.setAlpha(1.0f);
            }

            public void onAnimationEnd(Animator animator) {
                animate.setListener(null);
                C1032v.this.mo5057k(vVar);
                C1032v.this.f3399d.remove(vVar);
                C1032v.this.mo5334c();
            }
        }).start();
    }

    /* renamed from: a */
    public boolean mo5049a(C0901v vVar, int i, int i2, int i3, int i4) {
        View view = vVar.itemView;
        int translationX = i + ((int) vVar.itemView.getTranslationX());
        int translationY = i2 + ((int) vVar.itemView.getTranslationY());
        m4809v(vVar);
        int i5 = i3 - translationX;
        int i6 = i4 - translationY;
        if (i5 == 0 && i6 == 0) {
            mo5056j(vVar);
            return false;
        }
        if (i5 != 0) {
            view.setTranslationX((float) (-i5));
        }
        if (i6 != 0) {
            view.setTranslationY((float) (-i6));
        }
        ArrayList<C1042b> arrayList = this.f3405l;
        C1042b bVar = new C1042b(vVar, translationX, translationY, i3, i4);
        arrayList.add(bVar);
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo5333b(C0901v vVar, int i, int i2, int i3, int i4) {
        final View view = vVar.itemView;
        final int i5 = i3 - i;
        final int i6 = i4 - i2;
        if (i5 != 0) {
            view.animate().translationX(0.0f);
        }
        if (i6 != 0) {
            view.animate().translationY(0.0f);
        }
        final ViewPropertyAnimator animate = view.animate();
        this.f3400e.add(vVar);
        ViewPropertyAnimator duration = animate.setDuration(mo4259e());
        final C0901v vVar2 = vVar;
        C10386 r0 = new AnimatorListenerAdapter() {
            public void onAnimationStart(Animator animator) {
                C1032v.this.mo5059m(vVar2);
            }

            public void onAnimationCancel(Animator animator) {
                if (i5 != 0) {
                    view.setTranslationX(0.0f);
                }
                if (i6 != 0) {
                    view.setTranslationY(0.0f);
                }
            }

            public void onAnimationEnd(Animator animator) {
                animate.setListener(null);
                C1032v.this.mo5056j(vVar2);
                C1032v.this.f3400e.remove(vVar2);
                C1032v.this.mo5334c();
            }
        };
        duration.setListener(r0).start();
    }

    /* renamed from: a */
    public boolean mo5050a(C0901v vVar, C0901v vVar2, int i, int i2, int i3, int i4) {
        if (vVar == vVar2) {
            return mo5049a(vVar, i, i2, i3, i4);
        }
        float translationX = vVar.itemView.getTranslationX();
        float translationY = vVar.itemView.getTranslationY();
        float alpha = vVar.itemView.getAlpha();
        m4809v(vVar);
        int i5 = (int) (((float) (i3 - i)) - translationX);
        int i6 = (int) (((float) (i4 - i2)) - translationY);
        vVar.itemView.setTranslationX(translationX);
        vVar.itemView.setTranslationY(translationY);
        vVar.itemView.setAlpha(alpha);
        if (vVar2 != null) {
            m4809v(vVar2);
            vVar2.itemView.setTranslationX((float) (-i5));
            vVar2.itemView.setTranslationY((float) (-i6));
            vVar2.itemView.setAlpha(0.0f);
        }
        ArrayList<C1041a> arrayList = this.f3406m;
        C1041a aVar = new C1041a(vVar, vVar2, i, i2, i3, i4);
        arrayList.add(aVar);
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5331a(final C1041a aVar) {
        final View view;
        C0901v vVar = aVar.f3435a;
        final View view2 = null;
        if (vVar == null) {
            view = null;
        } else {
            view = vVar.itemView;
        }
        C0901v vVar2 = aVar.f3436b;
        if (vVar2 != null) {
            view2 = vVar2.itemView;
        }
        if (view != null) {
            final ViewPropertyAnimator duration = view.animate().setDuration(mo4264h());
            this.f3402g.add(aVar.f3435a);
            duration.translationX((float) (aVar.f3439e - aVar.f3437c));
            duration.translationY((float) (aVar.f3440f - aVar.f3438d));
            duration.alpha(0.0f).setListener(new AnimatorListenerAdapter() {
                public void onAnimationStart(Animator animator) {
                    C1032v.this.mo5051b(aVar.f3435a, true);
                }

                public void onAnimationEnd(Animator animator) {
                    duration.setListener(null);
                    view.setAlpha(1.0f);
                    view.setTranslationX(0.0f);
                    view.setTranslationY(0.0f);
                    C1032v.this.mo5047a(aVar.f3435a, true);
                    C1032v.this.f3402g.remove(aVar.f3435a);
                    C1032v.this.mo5334c();
                }
            }).start();
        }
        if (view2 != null) {
            final ViewPropertyAnimator animate = view2.animate();
            this.f3402g.add(aVar.f3436b);
            animate.translationX(0.0f).translationY(0.0f).setDuration(mo4264h()).alpha(1.0f).setListener(new AnimatorListenerAdapter() {
                public void onAnimationStart(Animator animator) {
                    C1032v.this.mo5051b(aVar.f3436b, false);
                }

                public void onAnimationEnd(Animator animator) {
                    animate.setListener(null);
                    view2.setAlpha(1.0f);
                    view2.setTranslationX(0.0f);
                    view2.setTranslationY(0.0f);
                    C1032v.this.mo5047a(aVar.f3436b, false);
                    C1032v.this.f3402g.remove(aVar.f3436b);
                    C1032v.this.mo5334c();
                }
            }).start();
        }
    }

    /* renamed from: a */
    private void m4805a(List<C1041a> list, C0901v vVar) {
        for (int size = list.size() - 1; size >= 0; size--) {
            C1041a aVar = (C1041a) list.get(size);
            if (m4806a(aVar, vVar) && aVar.f3435a == null && aVar.f3436b == null) {
                list.remove(aVar);
            }
        }
    }

    /* renamed from: b */
    private void m4807b(C1041a aVar) {
        if (aVar.f3435a != null) {
            m4806a(aVar, aVar.f3435a);
        }
        if (aVar.f3436b != null) {
            m4806a(aVar, aVar.f3436b);
        }
    }

    /* renamed from: a */
    private boolean m4806a(C1041a aVar, C0901v vVar) {
        boolean z = false;
        if (aVar.f3436b == vVar) {
            aVar.f3436b = null;
        } else if (aVar.f3435a != vVar) {
            return false;
        } else {
            aVar.f3435a = null;
            z = true;
        }
        vVar.itemView.setAlpha(1.0f);
        vVar.itemView.setTranslationX(0.0f);
        vVar.itemView.setTranslationY(0.0f);
        mo5047a(vVar, z);
        return true;
    }

    /* renamed from: d */
    public void mo4258d(C0901v vVar) {
        View view = vVar.itemView;
        view.animate().cancel();
        int size = this.f3405l.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else if (((C1042b) this.f3405l.get(size)).f3441a == vVar) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                mo5056j(vVar);
                this.f3405l.remove(size);
            }
        }
        m4805a((List<C1041a>) this.f3406m, vVar);
        if (this.f3403j.remove(vVar)) {
            view.setAlpha(1.0f);
            mo5055i(vVar);
        }
        if (this.f3404k.remove(vVar)) {
            view.setAlpha(1.0f);
            mo5057k(vVar);
        }
        for (int size2 = this.f3398c.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList = (ArrayList) this.f3398c.get(size2);
            m4805a((List<C1041a>) arrayList, vVar);
            if (arrayList.isEmpty()) {
                this.f3398c.remove(size2);
            }
        }
        for (int size3 = this.f3397b.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList2 = (ArrayList) this.f3397b.get(size3);
            int size4 = arrayList2.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                } else if (((C1042b) arrayList2.get(size4)).f3441a == vVar) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    mo5056j(vVar);
                    arrayList2.remove(size4);
                    if (arrayList2.isEmpty()) {
                        this.f3397b.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        for (int size5 = this.f3396a.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList3 = (ArrayList) this.f3396a.get(size5);
            if (arrayList3.remove(vVar)) {
                view.setAlpha(1.0f);
                mo5057k(vVar);
                if (arrayList3.isEmpty()) {
                    this.f3396a.remove(size5);
                }
            }
        }
        this.f3401f.remove(vVar);
        this.f3399d.remove(vVar);
        this.f3402g.remove(vVar);
        this.f3400e.remove(vVar);
        mo5334c();
    }

    /* renamed from: v */
    private void m4809v(C0901v vVar) {
        if (f3395i == null) {
            f3395i = new ValueAnimator().getInterpolator();
        }
        vVar.itemView.animate().setInterpolator(f3395i);
        mo4258d(vVar);
    }

    /* renamed from: b */
    public boolean mo4254b() {
        return !this.f3404k.isEmpty() || !this.f3406m.isEmpty() || !this.f3405l.isEmpty() || !this.f3403j.isEmpty() || !this.f3400e.isEmpty() || !this.f3401f.isEmpty() || !this.f3399d.isEmpty() || !this.f3402g.isEmpty() || !this.f3397b.isEmpty() || !this.f3396a.isEmpty() || !this.f3398c.isEmpty();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo5334c() {
        if (!mo4254b()) {
            mo4266i();
        }
    }

    /* renamed from: d */
    public void mo4257d() {
        int size = this.f3405l.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            C1042b bVar = (C1042b) this.f3405l.get(size);
            View view = bVar.f3441a.itemView;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            mo5056j(bVar.f3441a);
            this.f3405l.remove(size);
        }
        for (int size2 = this.f3403j.size() - 1; size2 >= 0; size2--) {
            mo5055i((C0901v) this.f3403j.get(size2));
            this.f3403j.remove(size2);
        }
        int size3 = this.f3404k.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            C0901v vVar = (C0901v) this.f3404k.get(size3);
            vVar.itemView.setAlpha(1.0f);
            mo5057k(vVar);
            this.f3404k.remove(size3);
        }
        for (int size4 = this.f3406m.size() - 1; size4 >= 0; size4--) {
            m4807b((C1041a) this.f3406m.get(size4));
        }
        this.f3406m.clear();
        if (mo4254b()) {
            for (int size5 = this.f3397b.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList = (ArrayList) this.f3397b.get(size5);
                for (int size6 = arrayList.size() - 1; size6 >= 0; size6--) {
                    C1042b bVar2 = (C1042b) arrayList.get(size6);
                    View view2 = bVar2.f3441a.itemView;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    mo5056j(bVar2.f3441a);
                    arrayList.remove(size6);
                    if (arrayList.isEmpty()) {
                        this.f3397b.remove(arrayList);
                    }
                }
            }
            for (int size7 = this.f3396a.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList2 = (ArrayList) this.f3396a.get(size7);
                for (int size8 = arrayList2.size() - 1; size8 >= 0; size8--) {
                    C0901v vVar2 = (C0901v) arrayList2.get(size8);
                    vVar2.itemView.setAlpha(1.0f);
                    mo5057k(vVar2);
                    arrayList2.remove(size8);
                    if (arrayList2.isEmpty()) {
                        this.f3396a.remove(arrayList2);
                    }
                }
            }
            for (int size9 = this.f3398c.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList3 = (ArrayList) this.f3398c.get(size9);
                for (int size10 = arrayList3.size() - 1; size10 >= 0; size10--) {
                    m4807b((C1041a) arrayList3.get(size10));
                    if (arrayList3.isEmpty()) {
                        this.f3398c.remove(arrayList3);
                    }
                }
            }
            mo5332a((List<C0901v>) this.f3401f);
            mo5332a((List<C0901v>) this.f3400e);
            mo5332a((List<C0901v>) this.f3399d);
            mo5332a((List<C0901v>) this.f3402g);
            mo4266i();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5332a(List<C0901v> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            ((C0901v) list.get(size)).itemView.animate().cancel();
        }
    }

    /* renamed from: a */
    public boolean mo4253a(C0901v vVar, List<Object> list) {
        return !list.isEmpty() || super.mo4253a(vVar, list);
    }
}
