package android.support.p017v4.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.os.Build.VERSION;
import android.view.View;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;

/* renamed from: android.support.v4.view.v */
/* compiled from: ViewPropertyAnimatorCompat */
public final class C0602v {

    /* renamed from: a */
    Runnable f1449a = null;

    /* renamed from: b */
    Runnable f1450b = null;

    /* renamed from: c */
    int f1451c = -1;

    /* renamed from: d */
    private WeakReference<View> f1452d;

    /* renamed from: android.support.v4.view.v$a */
    /* compiled from: ViewPropertyAnimatorCompat */
    static class C0605a implements C0606w {

        /* renamed from: a */
        C0602v f1459a;

        /* renamed from: b */
        boolean f1460b;

        C0605a(C0602v vVar) {
            this.f1459a = vVar;
        }

        /* renamed from: a */
        public void mo2131a(View view) {
            this.f1460b = false;
            C0606w wVar = null;
            if (this.f1459a.f1451c > -1) {
                view.setLayerType(2, null);
            }
            if (this.f1459a.f1449a != null) {
                Runnable runnable = this.f1459a.f1449a;
                this.f1459a.f1449a = null;
                runnable.run();
            }
            Object tag = view.getTag(2113929216);
            if (tag instanceof C0606w) {
                wVar = (C0606w) tag;
            }
            if (wVar != null) {
                wVar.mo2131a(view);
            }
        }

        /* renamed from: b */
        public void mo2132b(View view) {
            C0606w wVar = null;
            if (this.f1459a.f1451c > -1) {
                view.setLayerType(this.f1459a.f1451c, null);
                this.f1459a.f1451c = -1;
            }
            if (VERSION.SDK_INT >= 16 || !this.f1460b) {
                if (this.f1459a.f1450b != null) {
                    Runnable runnable = this.f1459a.f1450b;
                    this.f1459a.f1450b = null;
                    runnable.run();
                }
                Object tag = view.getTag(2113929216);
                if (tag instanceof C0606w) {
                    wVar = (C0606w) tag;
                }
                if (wVar != null) {
                    wVar.mo2132b(view);
                }
                this.f1460b = true;
            }
        }

        /* renamed from: c */
        public void mo2133c(View view) {
            Object tag = view.getTag(2113929216);
            C0606w wVar = tag instanceof C0606w ? (C0606w) tag : null;
            if (wVar != null) {
                wVar.mo2133c(view);
            }
        }
    }

    C0602v(View view) {
        this.f1452d = new WeakReference<>(view);
    }

    /* renamed from: a */
    public C0602v mo2119a(long j) {
        View view = (View) this.f1452d.get();
        if (view != null) {
            view.animate().setDuration(j);
        }
        return this;
    }

    /* renamed from: a */
    public C0602v mo2118a(float f) {
        View view = (View) this.f1452d.get();
        if (view != null) {
            view.animate().alpha(f);
        }
        return this;
    }

    /* renamed from: b */
    public C0602v mo2123b(float f) {
        View view = (View) this.f1452d.get();
        if (view != null) {
            view.animate().translationY(f);
        }
        return this;
    }

    /* renamed from: a */
    public long mo2117a() {
        View view = (View) this.f1452d.get();
        if (view != null) {
            return view.animate().getDuration();
        }
        return 0;
    }

    /* renamed from: a */
    public C0602v mo2122a(Interpolator interpolator) {
        View view = (View) this.f1452d.get();
        if (view != null) {
            view.animate().setInterpolator(interpolator);
        }
        return this;
    }

    /* renamed from: b */
    public C0602v mo2124b(long j) {
        View view = (View) this.f1452d.get();
        if (view != null) {
            view.animate().setStartDelay(j);
        }
        return this;
    }

    /* renamed from: b */
    public void mo2125b() {
        View view = (View) this.f1452d.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    /* renamed from: c */
    public void mo2126c() {
        View view = (View) this.f1452d.get();
        if (view != null) {
            view.animate().start();
        }
    }

    /* renamed from: a */
    public C0602v mo2120a(C0606w wVar) {
        View view = (View) this.f1452d.get();
        if (view != null) {
            if (VERSION.SDK_INT >= 16) {
                m2299a(view, wVar);
            } else {
                view.setTag(2113929216, wVar);
                m2299a(view, new C0605a(this));
            }
        }
        return this;
    }

    /* renamed from: a */
    private void m2299a(final View view, final C0606w wVar) {
        if (wVar != null) {
            view.animate().setListener(new AnimatorListenerAdapter() {
                public void onAnimationCancel(Animator animator) {
                    wVar.mo2133c(view);
                }

                public void onAnimationEnd(Animator animator) {
                    wVar.mo2132b(view);
                }

                public void onAnimationStart(Animator animator) {
                    wVar.mo2131a(view);
                }
            });
        } else {
            view.animate().setListener(null);
        }
    }

    /* renamed from: a */
    public C0602v mo2121a(final C0608y yVar) {
        final View view = (View) this.f1452d.get();
        if (view != null && VERSION.SDK_INT >= 19) {
            C06042 r1 = null;
            if (yVar != null) {
                r1 = new AnimatorUpdateListener() {
                    public void onAnimationUpdate(ValueAnimator valueAnimator) {
                        yVar.mo2134a(view);
                    }
                };
            }
            view.animate().setUpdateListener(r1);
        }
        return this;
    }
}
