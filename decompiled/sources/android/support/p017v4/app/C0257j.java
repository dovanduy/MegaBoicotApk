package android.support.p017v4.app;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.arch.lifecycle.C0116p;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources.NotFoundException;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.support.p017v4.app.C0254i.C0255a;
import android.support.p017v4.app.C0254i.C0256b;
import android.support.p017v4.p023d.C0378b;
import android.support.p017v4.p023d.C0381d;
import android.support.p017v4.p023d.C0382e;
import android.support.p017v4.view.C0595r;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater.Factory2;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.ScaleAnimation;
import android.view.animation.Transformation;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: android.support.v4.app.j */
/* compiled from: FragmentManager */
final class C0257j extends C0254i implements Factory2 {

    /* renamed from: F */
    static final Interpolator f532F = new DecelerateInterpolator(2.5f);

    /* renamed from: G */
    static final Interpolator f533G = new DecelerateInterpolator(1.5f);

    /* renamed from: H */
    static final Interpolator f534H = new AccelerateInterpolator(2.5f);

    /* renamed from: I */
    static final Interpolator f535I = new AccelerateInterpolator(1.5f);

    /* renamed from: a */
    static boolean f536a = false;

    /* renamed from: q */
    static Field f537q;

    /* renamed from: A */
    Bundle f538A = null;

    /* renamed from: B */
    SparseArray<Parcelable> f539B = null;

    /* renamed from: C */
    ArrayList<C0273j> f540C;

    /* renamed from: D */
    C0274k f541D;

    /* renamed from: E */
    Runnable f542E = new Runnable() {
        public void run() {
            C0257j.this.mo938h();
        }
    };

    /* renamed from: J */
    private final CopyOnWriteArrayList<C0269f> f543J = new CopyOnWriteArrayList<>();

    /* renamed from: b */
    ArrayList<C0271h> f544b;

    /* renamed from: c */
    boolean f545c;

    /* renamed from: d */
    int f546d = 0;

    /* renamed from: e */
    final ArrayList<Fragment> f547e = new ArrayList<>();

    /* renamed from: f */
    SparseArray<Fragment> f548f;

    /* renamed from: g */
    ArrayList<C0246c> f549g;

    /* renamed from: h */
    ArrayList<Fragment> f550h;

    /* renamed from: i */
    ArrayList<C0246c> f551i;

    /* renamed from: j */
    ArrayList<Integer> f552j;

    /* renamed from: k */
    ArrayList<C0256b> f553k;

    /* renamed from: l */
    int f554l = 0;

    /* renamed from: m */
    C0253h f555m;

    /* renamed from: n */
    C0251f f556n;

    /* renamed from: o */
    Fragment f557o;

    /* renamed from: p */
    Fragment f558p;

    /* renamed from: r */
    boolean f559r;

    /* renamed from: s */
    boolean f560s;

    /* renamed from: t */
    boolean f561t;

    /* renamed from: u */
    boolean f562u;

    /* renamed from: v */
    String f563v;

    /* renamed from: w */
    boolean f564w;

    /* renamed from: x */
    ArrayList<C0246c> f565x;

    /* renamed from: y */
    ArrayList<Boolean> f566y;

    /* renamed from: z */
    ArrayList<Fragment> f567z;

    /* renamed from: android.support.v4.app.j$a */
    /* compiled from: FragmentManager */
    private static class C0263a extends C0265b {

        /* renamed from: a */
        View f581a;

        C0263a(View view, AnimationListener animationListener) {
            super(animationListener);
            this.f581a = view;
        }

        public void onAnimationEnd(Animation animation) {
            if (C0595r.m2276y(this.f581a) || VERSION.SDK_INT >= 24) {
                this.f581a.post(new Runnable() {
                    public void run() {
                        C0263a.this.f581a.setLayerType(0, null);
                    }
                });
            } else {
                this.f581a.setLayerType(0, null);
            }
            super.onAnimationEnd(animation);
        }
    }

    /* renamed from: android.support.v4.app.j$b */
    /* compiled from: FragmentManager */
    private static class C0265b implements AnimationListener {

        /* renamed from: a */
        private final AnimationListener f583a;

        C0265b(AnimationListener animationListener) {
            this.f583a = animationListener;
        }

        public void onAnimationStart(Animation animation) {
            if (this.f583a != null) {
                this.f583a.onAnimationStart(animation);
            }
        }

        public void onAnimationEnd(Animation animation) {
            if (this.f583a != null) {
                this.f583a.onAnimationEnd(animation);
            }
        }

        public void onAnimationRepeat(Animation animation) {
            if (this.f583a != null) {
                this.f583a.onAnimationRepeat(animation);
            }
        }
    }

    /* renamed from: android.support.v4.app.j$c */
    /* compiled from: FragmentManager */
    private static class C0266c {

        /* renamed from: a */
        public final Animation f584a;

        /* renamed from: b */
        public final Animator f585b;

        C0266c(Animation animation) {
            this.f584a = animation;
            this.f585b = null;
            if (animation == null) {
                throw new IllegalStateException("Animation cannot be null");
            }
        }

        C0266c(Animator animator) {
            this.f584a = null;
            this.f585b = animator;
            if (animator == null) {
                throw new IllegalStateException("Animator cannot be null");
            }
        }
    }

    /* renamed from: android.support.v4.app.j$d */
    /* compiled from: FragmentManager */
    private static class C0267d extends AnimatorListenerAdapter {

        /* renamed from: a */
        View f586a;

        C0267d(View view) {
            this.f586a = view;
        }

        public void onAnimationStart(Animator animator) {
            this.f586a.setLayerType(2, null);
        }

        public void onAnimationEnd(Animator animator) {
            this.f586a.setLayerType(0, null);
            animator.removeListener(this);
        }
    }

    /* renamed from: android.support.v4.app.j$e */
    /* compiled from: FragmentManager */
    private static class C0268e extends AnimationSet implements Runnable {

        /* renamed from: a */
        private final ViewGroup f587a;

        /* renamed from: b */
        private final View f588b;

        /* renamed from: c */
        private boolean f589c;

        /* renamed from: d */
        private boolean f590d;

        /* renamed from: e */
        private boolean f591e = true;

        C0268e(Animation animation, ViewGroup viewGroup, View view) {
            super(false);
            this.f587a = viewGroup;
            this.f588b = view;
            addAnimation(animation);
            this.f587a.post(this);
        }

        public boolean getTransformation(long j, Transformation transformation) {
            this.f591e = true;
            if (this.f589c) {
                return !this.f590d;
            }
            if (!super.getTransformation(j, transformation)) {
                this.f589c = true;
                C0316y.m1167a(this.f587a, this);
            }
            return true;
        }

        public boolean getTransformation(long j, Transformation transformation, float f) {
            this.f591e = true;
            if (this.f589c) {
                return !this.f590d;
            }
            if (!super.getTransformation(j, transformation, f)) {
                this.f589c = true;
                C0316y.m1167a(this.f587a, this);
            }
            return true;
        }

        public void run() {
            if (this.f589c || !this.f591e) {
                this.f587a.endViewTransition(this.f588b);
                this.f590d = true;
                return;
            }
            this.f591e = false;
            this.f587a.post(this);
        }
    }

    /* renamed from: android.support.v4.app.j$f */
    /* compiled from: FragmentManager */
    private static final class C0269f {

        /* renamed from: a */
        final C0255a f592a;

        /* renamed from: b */
        final boolean f593b;
    }

    /* renamed from: android.support.v4.app.j$g */
    /* compiled from: FragmentManager */
    static class C0270g {

        /* renamed from: a */
        public static final int[] f594a = {16842755, 16842960, 16842961};
    }

    /* renamed from: android.support.v4.app.j$h */
    /* compiled from: FragmentManager */
    interface C0271h {
        /* renamed from: a */
        boolean mo814a(ArrayList<C0246c> arrayList, ArrayList<Boolean> arrayList2);
    }

    /* renamed from: android.support.v4.app.j$i */
    /* compiled from: FragmentManager */
    private class C0272i implements C0271h {

        /* renamed from: a */
        final String f595a;

        /* renamed from: b */
        final int f596b;

        /* renamed from: c */
        final int f597c;

        C0272i(String str, int i, int i2) {
            this.f595a = str;
            this.f596b = i;
            this.f597c = i2;
        }

        /* renamed from: a */
        public boolean mo814a(ArrayList<C0246c> arrayList, ArrayList<Boolean> arrayList2) {
            if (C0257j.this.f558p != null && this.f596b < 0 && this.f595a == null) {
                C0254i q = C0257j.this.f558p.mo635q();
                if (q != null && q.mo871c()) {
                    return false;
                }
            }
            return C0257j.this.mo910a(arrayList, arrayList2, this.f595a, this.f596b, this.f597c);
        }
    }

    /* renamed from: android.support.v4.app.j$j */
    /* compiled from: FragmentManager */
    static class C0273j implements C0216c {

        /* renamed from: a */
        final boolean f599a;

        /* renamed from: b */
        final C0246c f600b;

        /* renamed from: c */
        private int f601c;

        C0273j(C0246c cVar, boolean z) {
            this.f599a = z;
            this.f600b = cVar;
        }

        /* renamed from: a */
        public void mo659a() {
            this.f601c--;
            if (this.f601c == 0) {
                this.f600b.f486a.mo933g();
            }
        }

        /* renamed from: b */
        public void mo660b() {
            this.f601c++;
        }

        /* renamed from: c */
        public boolean mo979c() {
            return this.f601c == 0;
        }

        /* renamed from: d */
        public void mo980d() {
            boolean z = this.f601c > 0;
            C0257j jVar = this.f600b.f486a;
            int size = jVar.f547e.size();
            for (int i = 0; i < size; i++) {
                Fragment fragment = (Fragment) jVar.f547e.get(i);
                fragment.mo572a((C0216c) null);
                if (z && fragment.mo586ag()) {
                    fragment.mo540M();
                }
            }
            this.f600b.f486a.mo903a(this.f600b, this.f599a, !z, true);
        }

        /* renamed from: e */
        public void mo981e() {
            this.f600b.f486a.mo903a(this.f600b, this.f599a, false, false);
        }
    }

    /* renamed from: b */
    public static int m864b(int i, boolean z) {
        if (i == 4097) {
            return z ? 1 : 2;
        }
        if (i == 4099) {
            return z ? 5 : 6;
        }
        if (i != 8194) {
            return -1;
        }
        return z ? 3 : 4;
    }

    /* renamed from: d */
    public static int m871d(int i) {
        if (i == 4097) {
            return 8194;
        }
        if (i != 4099) {
            return i != 8194 ? 0 : 4097;
        }
        return 4099;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: y */
    public Factory2 mo965y() {
        return this;
    }

    C0257j() {
    }

    /* renamed from: a */
    static boolean m861a(C0266c cVar) {
        if (cVar.f584a instanceof AlphaAnimation) {
            return true;
        }
        if (!(cVar.f584a instanceof AnimationSet)) {
            return m860a(cVar.f585b);
        }
        List animations = ((AnimationSet) cVar.f584a).getAnimations();
        for (int i = 0; i < animations.size(); i++) {
            if (animations.get(i) instanceof AlphaAnimation) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    static boolean m860a(Animator animator) {
        if (animator == null) {
            return false;
        }
        if (animator instanceof ValueAnimator) {
            PropertyValuesHolder[] values = ((ValueAnimator) animator).getValues();
            for (PropertyValuesHolder propertyName : values) {
                if ("alpha".equals(propertyName.getPropertyName())) {
                    return true;
                }
            }
        } else if (animator instanceof AnimatorSet) {
            ArrayList childAnimations = ((AnimatorSet) animator).getChildAnimations();
            for (int i = 0; i < childAnimations.size(); i++) {
                if (m860a((Animator) childAnimations.get(i))) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    static boolean m862a(View view, C0266c cVar) {
        boolean z = false;
        if (view == null || cVar == null) {
            return false;
        }
        if (VERSION.SDK_INT >= 19 && view.getLayerType() == 0 && C0595r.m2269r(view) && m861a(cVar)) {
            z = true;
        }
        return z;
    }

    /* renamed from: a */
    private void m857a(RuntimeException runtimeException) {
        Log.e("FragmentManager", runtimeException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new C0382e("FragmentManager"));
        if (this.f555m != null) {
            try {
                this.f555m.mo702a("  ", (FileDescriptor) null, printWriter, new String[0]);
            } catch (Exception e) {
                Log.e("FragmentManager", "Failed dumping state", e);
            }
        } else {
            try {
                mo869a("  ", (FileDescriptor) null, printWriter, new String[0]);
            } catch (Exception e2) {
                Log.e("FragmentManager", "Failed dumping state", e2);
            }
        }
        throw runtimeException;
    }

    /* renamed from: a */
    public C0275l mo867a() {
        return new C0246c(this);
    }

    /* renamed from: b */
    public boolean mo870b() {
        boolean h = mo938h();
        m847B();
        return h;
    }

    /* renamed from: c */
    public boolean mo871c() {
        m874z();
        return m863a((String) null, -1, 0);
    }

    /* renamed from: a */
    public void mo868a(int i, int i2) {
        if (i < 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("Bad id: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
        mo905a((C0271h) new C0272i(null, i, i2), false);
    }

    /* renamed from: a */
    private boolean m863a(String str, int i, int i2) {
        mo938h();
        m869c(true);
        if (this.f558p != null && i < 0 && str == null) {
            C0254i q = this.f558p.mo635q();
            if (q != null && q.mo871c()) {
                return true;
            }
        }
        boolean a = mo910a(this.f565x, this.f566y, str, i, i2);
        if (a) {
            this.f545c = true;
            try {
                m867b(this.f565x, this.f566y);
            } finally {
                m846A();
            }
        }
        mo939i();
        m849D();
        return a;
    }

    /* renamed from: a */
    public void mo895a(Bundle bundle, String str, Fragment fragment) {
        if (fragment.f364o < 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("Fragment ");
            sb.append(fragment);
            sb.append(" is not currently in the FragmentManager");
            m857a((RuntimeException) new IllegalStateException(sb.toString()));
        }
        bundle.putInt(str, fragment.f364o);
    }

    /* renamed from: a */
    public Fragment mo890a(Bundle bundle, String str) {
        int i = bundle.getInt(str, -1);
        if (i == -1) {
            return null;
        }
        Fragment fragment = (Fragment) this.f548f.get(i);
        if (fragment == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("Fragment no longer exists for key ");
            sb.append(str);
            sb.append(": index ");
            sb.append(i);
            m857a((RuntimeException) new IllegalStateException(sb.toString()));
        }
        return fragment;
    }

    /* renamed from: d */
    public List<Fragment> mo872d() {
        List<Fragment> list;
        if (this.f547e.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (this.f547e) {
            list = (List) this.f547e.clone();
        }
        return list;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        if (this.f557o != null) {
            C0381d.m1417a(this.f557o, sb);
        } else {
            C0381d.m1417a(this.f555m, sb);
        }
        sb.append("}}");
        return sb.toString();
    }

    /* renamed from: a */
    public void mo869a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("    ");
        String sb2 = sb.toString();
        if (this.f548f != null) {
            int size = this.f548f.size();
            if (size > 0) {
                printWriter.print(str);
                printWriter.print("Active Fragments in ");
                printWriter.print(Integer.toHexString(System.identityHashCode(this)));
                printWriter.println(":");
                for (int i = 0; i < size; i++) {
                    Fragment fragment = (Fragment) this.f548f.valueAt(i);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i);
                    printWriter.print(": ");
                    printWriter.println(fragment);
                    if (fragment != null) {
                        fragment.mo578a(sb2, fileDescriptor, printWriter, strArr);
                    }
                }
            }
        }
        int size2 = this.f547e.size();
        if (size2 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i2 = 0; i2 < size2; i2++) {
                Fragment fragment2 = (Fragment) this.f547e.get(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(fragment2.toString());
            }
        }
        if (this.f550h != null) {
            int size3 = this.f550h.size();
            if (size3 > 0) {
                printWriter.print(str);
                printWriter.println("Fragments Created Menus:");
                for (int i3 = 0; i3 < size3; i3++) {
                    Fragment fragment3 = (Fragment) this.f550h.get(i3);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i3);
                    printWriter.print(": ");
                    printWriter.println(fragment3.toString());
                }
            }
        }
        if (this.f549g != null) {
            int size4 = this.f549g.size();
            if (size4 > 0) {
                printWriter.print(str);
                printWriter.println("Back Stack:");
                for (int i4 = 0; i4 < size4; i4++) {
                    C0246c cVar = (C0246c) this.f549g.get(i4);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i4);
                    printWriter.print(": ");
                    printWriter.println(cVar.toString());
                    cVar.mo811a(sb2, fileDescriptor, printWriter, strArr);
                }
            }
        }
        synchronized (this) {
            if (this.f551i != null) {
                int size5 = this.f551i.size();
                if (size5 > 0) {
                    printWriter.print(str);
                    printWriter.println("Back Stack Indices:");
                    for (int i5 = 0; i5 < size5; i5++) {
                        C0246c cVar2 = (C0246c) this.f551i.get(i5);
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i5);
                        printWriter.print(": ");
                        printWriter.println(cVar2);
                    }
                }
            }
            if (this.f552j != null && this.f552j.size() > 0) {
                printWriter.print(str);
                printWriter.print("mAvailBackStackIndices: ");
                printWriter.println(Arrays.toString(this.f552j.toArray()));
            }
        }
        if (this.f544b != null) {
            int size6 = this.f544b.size();
            if (size6 > 0) {
                printWriter.print(str);
                printWriter.println("Pending Actions:");
                for (int i6 = 0; i6 < size6; i6++) {
                    C0271h hVar = (C0271h) this.f544b.get(i6);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i6);
                    printWriter.print(": ");
                    printWriter.println(hVar);
                }
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f555m);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f556n);
        if (this.f557o != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f557o);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f554l);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.f560s);
        printWriter.print(" mStopped=");
        printWriter.print(this.f561t);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.f562u);
        if (this.f559r) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.f559r);
        }
        if (this.f563v != null) {
            printWriter.print(str);
            printWriter.print("  mNoTransactionsBecause=");
            printWriter.println(this.f563v);
        }
    }

    /* renamed from: a */
    static C0266c m852a(Context context, float f, float f2, float f3, float f4) {
        AnimationSet animationSet = new AnimationSet(false);
        ScaleAnimation scaleAnimation = new ScaleAnimation(f, f2, f, f2, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setInterpolator(f532F);
        scaleAnimation.setDuration(220);
        animationSet.addAnimation(scaleAnimation);
        AlphaAnimation alphaAnimation = new AlphaAnimation(f3, f4);
        alphaAnimation.setInterpolator(f533G);
        alphaAnimation.setDuration(220);
        animationSet.addAnimation(alphaAnimation);
        return new C0266c((Animation) animationSet);
    }

    /* renamed from: a */
    static C0266c m851a(Context context, float f, float f2) {
        AlphaAnimation alphaAnimation = new AlphaAnimation(f, f2);
        alphaAnimation.setInterpolator(f533G);
        alphaAnimation.setDuration(220);
        return new C0266c((Animation) alphaAnimation);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C0266c mo891a(Fragment fragment, int i, boolean z, int i2) {
        int Y = fragment.mo552Y();
        Animation a = fragment.mo556a(i, z, Y);
        if (a != null) {
            return new C0266c(a);
        }
        Animator b = fragment.mo588b(i, z, Y);
        if (b != null) {
            return new C0266c(b);
        }
        if (Y != 0) {
            boolean equals = "anim".equals(this.f555m.mo862g().getResources().getResourceTypeName(Y));
            boolean z2 = false;
            if (equals) {
                try {
                    Animation loadAnimation = AnimationUtils.loadAnimation(this.f555m.mo862g(), Y);
                    if (loadAnimation != null) {
                        return new C0266c(loadAnimation);
                    }
                    z2 = true;
                } catch (NotFoundException e) {
                    throw e;
                } catch (RuntimeException unused) {
                }
            }
            if (!z2) {
                try {
                    Animator loadAnimator = AnimatorInflater.loadAnimator(this.f555m.mo862g(), Y);
                    if (loadAnimator != null) {
                        return new C0266c(loadAnimator);
                    }
                } catch (RuntimeException e2) {
                    if (equals) {
                        throw e2;
                    }
                    Animation loadAnimation2 = AnimationUtils.loadAnimation(this.f555m.mo862g(), Y);
                    if (loadAnimation2 != null) {
                        return new C0266c(loadAnimation2);
                    }
                }
            }
        }
        if (i == 0) {
            return null;
        }
        int b2 = m864b(i, z);
        if (b2 < 0) {
            return null;
        }
        switch (b2) {
            case 1:
                return m852a(this.f555m.mo862g(), 1.125f, 1.0f, 0.0f, 1.0f);
            case 2:
                return m852a(this.f555m.mo862g(), 1.0f, 0.975f, 1.0f, 0.0f);
            case 3:
                return m852a(this.f555m.mo862g(), 0.975f, 1.0f, 0.0f, 1.0f);
            case 4:
                return m852a(this.f555m.mo862g(), 1.0f, 1.075f, 1.0f, 0.0f);
            case 5:
                return m851a(this.f555m.mo862g(), 0.0f, 1.0f);
            case 6:
                return m851a(this.f555m.mo862g(), 1.0f, 0.0f);
            default:
                if (i2 == 0 && this.f555m.mo707d()) {
                    i2 = this.f555m.mo708e();
                }
                return i2 == 0 ? null : null;
        }
    }

    /* renamed from: a */
    public void mo897a(Fragment fragment) {
        if (fragment.f348U) {
            if (this.f545c) {
                this.f564w = true;
                return;
            }
            fragment.f348U = false;
            mo898a(fragment, this.f554l, 0, 0, false);
        }
    }

    /* renamed from: b */
    private static void m866b(View view, C0266c cVar) {
        if (!(view == null || cVar == null || !m862a(view, cVar))) {
            if (cVar.f585b != null) {
                cVar.f585b.addListener(new C0267d(view));
            } else {
                AnimationListener a = m853a(cVar.f584a);
                view.setLayerType(2, null);
                cVar.f584a.setAnimationListener(new C0263a(view, a));
            }
        }
    }

    /* renamed from: a */
    private static AnimationListener m853a(Animation animation) {
        try {
            if (f537q == null) {
                f537q = Animation.class.getDeclaredField("mListener");
                f537q.setAccessible(true);
            }
            return (AnimationListener) f537q.get(animation);
        } catch (NoSuchFieldException e) {
            Log.e("FragmentManager", "No field with the name mListener is found in Animation class", e);
            return null;
        } catch (IllegalAccessException e2) {
            Log.e("FragmentManager", "Cannot access Animation's mListener field", e2);
            return null;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public boolean mo919b(int i) {
        return this.f554l >= i;
    }

    /* JADX WARNING: type inference failed for: r8v0 */
    /* JADX WARNING: type inference failed for: r8v1, types: [int] */
    /* JADX WARNING: type inference failed for: r11v1 */
    /* JADX WARNING: type inference failed for: r8v2 */
    /* JADX WARNING: type inference failed for: r11v2 */
    /* JADX WARNING: type inference failed for: r11v3 */
    /* JADX WARNING: type inference failed for: r11v4 */
    /* JADX WARNING: type inference failed for: r8v3, types: [boolean] */
    /* JADX WARNING: type inference failed for: r8v4 */
    /* JADX WARNING: type inference failed for: r11v5 */
    /* JADX WARNING: type inference failed for: r11v6 */
    /* JADX WARNING: type inference failed for: r8v5 */
    /* JADX WARNING: type inference failed for: r11v9 */
    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:100:?, code lost:
        r1 = r7.mo628n().getResourceName(r7.f336I);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x020f, code lost:
        r1 = "unknown";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0241, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x031c, code lost:
        if (r11 >= 3) goto L_0x033e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x0320, code lost:
        if (f536a == false) goto L_0x0338;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x0322, code lost:
        r1 = new java.lang.StringBuilder();
        r1.append("movefrom STARTED: ");
        r1.append(r7);
        android.util.Log.v("FragmentManager", r1.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x0338, code lost:
        r7.mo548U();
        mo929e(r7, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x033e, code lost:
        if (r11 >= 2) goto L_0x03c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x0342, code lost:
        if (f536a == false) goto L_0x035a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x0344, code lost:
        r1 = new java.lang.StringBuilder();
        r1.append("movefrom ACTIVITY_CREATED: ");
        r1.append(r7);
        android.util.Log.v("FragmentManager", r1.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x035c, code lost:
        if (r7.f346S == null) goto L_0x036d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x0364, code lost:
        if (r6.f555m.mo703a(r7) == false) goto L_0x036d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x0368, code lost:
        if (r7.f362m != null) goto L_0x036d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x036a, code lost:
        mo948m(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x036d, code lost:
        r7.mo549V();
        mo932f(r7, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x0375, code lost:
        if (r7.f346S == null) goto L_0x03b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x0379, code lost:
        if (r7.f345R == null) goto L_0x03b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x037b, code lost:
        r7.f345R.endViewTransition(r7.f346S);
        r7.f346S.clearAnimation();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x038a, code lost:
        if (r6.f554l <= 0) goto L_0x03a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x038e, code lost:
        if (r6.f562u != false) goto L_0x03a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x0396, code lost:
        if (r7.f346S.getVisibility() != 0) goto L_0x03a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x039c, code lost:
        if (r7.f353Z < 0.0f) goto L_0x03a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x039e, code lost:
        r0 = mo891a(r7, r17, false, r18);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x03a7, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x03a8, code lost:
        r7.f353Z = 0.0f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x03aa, code lost:
        if (r0 == null) goto L_0x03af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x03ac, code lost:
        m854a(r7, r0, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x03af, code lost:
        r7.f345R.removeView(r7.f346S);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x03b6, code lost:
        r7.f345R = null;
        r7.f346S = null;
        r7.f358ae = null;
        r7.f359af.mo120b(null);
        r7.f347T = null;
        r7.f373x = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x03c5, code lost:
        if (r11 >= 1) goto L_0x043b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x03c9, code lost:
        if (r6.f562u == false) goto L_0x03ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x03cf, code lost:
        if (r7.mo583ad() == null) goto L_0x03dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x03d1, code lost:
        r0 = r7.mo583ad();
        r7.mo576a((android.view.View) null);
        r0.clearAnimation();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x03e0, code lost:
        if (r7.mo584ae() == null) goto L_0x03ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x03e2, code lost:
        r0 = r7.mo584ae();
        r7.mo562a((android.animation.Animator) null);
        r0.cancel();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x03f0, code lost:
        if (r7.mo583ad() != null) goto L_0x0437;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x03f6, code lost:
        if (r7.mo584ae() == null) goto L_0x03f9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x03fb, code lost:
        if (f536a == false) goto L_0x0413;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x03fd, code lost:
        r1 = new java.lang.StringBuilder();
        r1.append("movefrom CREATED: ");
        r1.append(r7);
        android.util.Log.v("FragmentManager", r1.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x0415, code lost:
        if (r7.f341N != false) goto L_0x041e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x0417, code lost:
        r7.mo550W();
        mo935g(r7, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x041e, code lost:
        r7.f360k = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x0420, code lost:
        r7.mo551X();
        mo937h(r7, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x0426, code lost:
        if (r19 != false) goto L_0x043b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x042a, code lost:
        if (r7.f341N != false) goto L_0x0430;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x042c, code lost:
        mo934g(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x0430, code lost:
        r7.f330C = null;
        r7.f334G = null;
        r7.f329B = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x0437, code lost:
        r7.mo595c(r11);
        r8 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01aa, code lost:
        mo922c(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x01ad, code lost:
        if (r11 <= 1) goto L_0x02a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x01b1, code lost:
        if (f536a == false) goto L_0x01c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01b3, code lost:
        r1 = new java.lang.StringBuilder();
        r1.append("moveto ACTIVITY_CREATED: ");
        r1.append(r7);
        android.util.Log.v("FragmentManager", r1.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x01cb, code lost:
        if (r7.f372w != false) goto L_0x028f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x01cf, code lost:
        if (r7.f336I == 0) goto L_0x0241;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x01d4, code lost:
        if (r7.f336I != -1) goto L_0x01f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x01d6, code lost:
        r1 = new java.lang.StringBuilder();
        r1.append("Cannot create fragment ");
        r1.append(r7);
        r1.append(" for a container view with no id");
        m857a((java.lang.RuntimeException) new java.lang.IllegalArgumentException(r1.toString()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x01f4, code lost:
        r0 = (android.view.ViewGroup) r6.f556n.mo649a(r7.f336I);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x01fe, code lost:
        if (r0 != null) goto L_0x0242;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0202, code lost:
        if (r7.f374y != false) goto L_0x0242;
     */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r11v5
      assigns: []
      uses: []
      mth insns count: 439
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
    	at jadx.core.ProcessClass.process(ProcessClass.java:35)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Removed duplicated region for block: B:209:0x0440  */
    /* JADX WARNING: Unknown variable types count: 3 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo898a(android.support.p017v4.app.Fragment r15, int r16, int r17, int r18, boolean r19) {
        /*
            r14 = this;
            r6 = r14
            r7 = r15
            boolean r0 = r7.f370u
            r8 = 1
            if (r0 == 0) goto L_0x000f
            boolean r0 = r7.f339L
            if (r0 == 0) goto L_0x000c
            goto L_0x000f
        L_0x000c:
            r0 = r16
            goto L_0x0014
        L_0x000f:
            r0 = r16
            if (r0 <= r8) goto L_0x0014
            r0 = r8
        L_0x0014:
            boolean r1 = r7.f371v
            if (r1 == 0) goto L_0x002a
            int r1 = r7.f360k
            if (r0 <= r1) goto L_0x002a
            int r0 = r7.f360k
            if (r0 != 0) goto L_0x0028
            boolean r0 = r7.mo618i()
            if (r0 == 0) goto L_0x0028
            r0 = r8
            goto L_0x002a
        L_0x0028:
            int r0 = r7.f360k
        L_0x002a:
            boolean r1 = r7.f348U
            r9 = 3
            r10 = 2
            if (r1 == 0) goto L_0x0038
            int r1 = r7.f360k
            if (r1 >= r9) goto L_0x0038
            if (r0 <= r10) goto L_0x0038
            r11 = r10
            goto L_0x0039
        L_0x0038:
            r11 = r0
        L_0x0039:
            int r0 = r7.f360k
            r12 = 0
            r13 = 0
            if (r0 > r11) goto L_0x02ee
            boolean r0 = r7.f372w
            if (r0 == 0) goto L_0x0048
            boolean r0 = r7.f373x
            if (r0 != 0) goto L_0x0048
            return
        L_0x0048:
            android.view.View r0 = r7.mo583ad()
            if (r0 != 0) goto L_0x0054
            android.animation.Animator r0 = r7.mo584ae()
            if (r0 == 0) goto L_0x0066
        L_0x0054:
            r7.mo576a(r12)
            r7.mo562a(r12)
            int r2 = r7.mo585af()
            r3 = 0
            r4 = 0
            r5 = 1
            r0 = r6
            r1 = r7
            r0.mo898a(r1, r2, r3, r4, r5)
        L_0x0066:
            int r0 = r7.f360k
            switch(r0) {
                case 0: goto L_0x006d;
                case 1: goto L_0x01aa;
                case 2: goto L_0x02a4;
                case 3: goto L_0x02c6;
                default: goto L_0x006b;
            }
        L_0x006b:
            goto L_0x043b
        L_0x006d:
            if (r11 <= 0) goto L_0x01aa
            boolean r0 = f536a
            if (r0 == 0) goto L_0x0089
            java.lang.String r0 = "FragmentManager"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "moveto CREATED: "
            r1.append(r2)
            r1.append(r7)
            java.lang.String r1 = r1.toString()
            android.util.Log.v(r0, r1)
        L_0x0089:
            android.os.Bundle r0 = r7.f361l
            if (r0 == 0) goto L_0x00e0
            android.os.Bundle r0 = r7.f361l
            android.support.v4.app.h r1 = r6.f555m
            android.content.Context r1 = r1.mo862g()
            java.lang.ClassLoader r1 = r1.getClassLoader()
            r0.setClassLoader(r1)
            android.os.Bundle r0 = r7.f361l
            java.lang.String r1 = "android:view_state"
            android.util.SparseArray r0 = r0.getSparseParcelableArray(r1)
            r7.f362m = r0
            android.os.Bundle r0 = r7.f361l
            java.lang.String r1 = "android:target_state"
            android.support.v4.app.Fragment r0 = r6.mo890a(r0, r1)
            r7.f367r = r0
            android.support.v4.app.Fragment r0 = r7.f367r
            if (r0 == 0) goto L_0x00be
            android.os.Bundle r0 = r7.f361l
            java.lang.String r1 = "android:target_req_state"
            int r0 = r0.getInt(r1, r13)
            r7.f369t = r0
        L_0x00be:
            java.lang.Boolean r0 = r7.f363n
            if (r0 == 0) goto L_0x00cd
            java.lang.Boolean r0 = r7.f363n
            boolean r0 = r0.booleanValue()
            r7.f349V = r0
            r7.f363n = r12
            goto L_0x00d7
        L_0x00cd:
            android.os.Bundle r0 = r7.f361l
            java.lang.String r1 = "android:user_visible_hint"
            boolean r0 = r0.getBoolean(r1, r8)
            r7.f349V = r0
        L_0x00d7:
            boolean r0 = r7.f349V
            if (r0 != 0) goto L_0x00e0
            r7.f348U = r8
            if (r11 <= r10) goto L_0x00e0
            r11 = r10
        L_0x00e0:
            android.support.v4.app.h r0 = r6.f555m
            r7.f330C = r0
            android.support.v4.app.Fragment r0 = r6.f557o
            r7.f334G = r0
            android.support.v4.app.Fragment r0 = r6.f557o
            if (r0 == 0) goto L_0x00f1
            android.support.v4.app.Fragment r0 = r6.f557o
            android.support.v4.app.j r0 = r0.f331D
            goto L_0x00f7
        L_0x00f1:
            android.support.v4.app.h r0 = r6.f555m
            android.support.v4.app.j r0 = r0.mo864i()
        L_0x00f7:
            r7.f329B = r0
            android.support.v4.app.Fragment r0 = r7.f367r
            if (r0 == 0) goto L_0x0141
            android.util.SparseArray<android.support.v4.app.Fragment> r0 = r6.f548f
            android.support.v4.app.Fragment r1 = r7.f367r
            int r1 = r1.f364o
            java.lang.Object r0 = r0.get(r1)
            android.support.v4.app.Fragment r1 = r7.f367r
            if (r0 == r1) goto L_0x0131
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Fragment "
            r1.append(r2)
            r1.append(r7)
            java.lang.String r2 = " declared target fragment "
            r1.append(r2)
            android.support.v4.app.Fragment r2 = r7.f367r
            r1.append(r2)
            java.lang.String r2 = " that does not belong to this FragmentManager!"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0131:
            android.support.v4.app.Fragment r0 = r7.f367r
            int r0 = r0.f360k
            if (r0 >= r8) goto L_0x0141
            android.support.v4.app.Fragment r1 = r7.f367r
            r2 = 1
            r3 = 0
            r4 = 0
            r5 = 1
            r0 = r6
            r0.mo898a(r1, r2, r3, r4, r5)
        L_0x0141:
            android.support.v4.app.h r0 = r6.f555m
            android.content.Context r0 = r0.mo862g()
            r6.mo899a(r7, r0, r13)
            r7.f344Q = r13
            android.support.v4.app.h r0 = r6.f555m
            android.content.Context r0 = r0.mo862g()
            r7.mo565a(r0)
            boolean r0 = r7.f344Q
            if (r0 != 0) goto L_0x0175
            android.support.v4.app.ab r0 = new android.support.v4.app.ab
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Fragment "
            r1.append(r2)
            r1.append(r7)
            java.lang.String r2 = " did not call through to super.onAttach()"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0175:
            android.support.v4.app.Fragment r0 = r7.f334G
            if (r0 != 0) goto L_0x017f
            android.support.v4.app.h r0 = r6.f555m
            r0.mo705b(r7)
            goto L_0x0184
        L_0x017f:
            android.support.v4.app.Fragment r0 = r7.f334G
            r0.mo573a(r7)
        L_0x0184:
            android.support.v4.app.h r0 = r6.f555m
            android.content.Context r0 = r0.mo862g()
            r6.mo913b(r7, r0, r13)
            boolean r0 = r7.f355ab
            if (r0 != 0) goto L_0x01a1
            android.os.Bundle r0 = r7.f361l
            r6.mo900a(r7, r0, r13)
            android.os.Bundle r0 = r7.f361l
            r7.mo625l(r0)
            android.os.Bundle r0 = r7.f361l
            r6.mo914b(r7, r0, r13)
            goto L_0x01a8
        L_0x01a1:
            android.os.Bundle r0 = r7.f361l
            r7.mo619j(r0)
            r7.f360k = r8
        L_0x01a8:
            r7.f341N = r13
        L_0x01aa:
            r6.mo922c(r7)
            if (r11 <= r8) goto L_0x02a4
            boolean r0 = f536a
            if (r0 == 0) goto L_0x01c9
            java.lang.String r0 = "FragmentManager"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "moveto ACTIVITY_CREATED: "
            r1.append(r2)
            r1.append(r7)
            java.lang.String r1 = r1.toString()
            android.util.Log.v(r0, r1)
        L_0x01c9:
            boolean r0 = r7.f372w
            if (r0 != 0) goto L_0x028f
            int r0 = r7.f336I
            if (r0 == 0) goto L_0x0241
            int r0 = r7.f336I
            r1 = -1
            if (r0 != r1) goto L_0x01f4
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Cannot create fragment "
            r1.append(r2)
            r1.append(r7)
            java.lang.String r2 = " for a container view with no id"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            r6.m857a(r0)
        L_0x01f4:
            android.support.v4.app.f r0 = r6.f556n
            int r1 = r7.f336I
            android.view.View r0 = r0.mo649a(r1)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            if (r0 != 0) goto L_0x0242
            boolean r1 = r7.f374y
            if (r1 != 0) goto L_0x0242
            android.content.res.Resources r1 = r7.mo628n()     // Catch:{ NotFoundException -> 0x020f }
            int r2 = r7.f336I     // Catch:{ NotFoundException -> 0x020f }
            java.lang.String r1 = r1.getResourceName(r2)     // Catch:{ NotFoundException -> 0x020f }
            goto L_0x0211
        L_0x020f:
            java.lang.String r1 = "unknown"
        L_0x0211:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "No view found for id 0x"
            r3.append(r4)
            int r4 = r7.f336I
            java.lang.String r4 = java.lang.Integer.toHexString(r4)
            r3.append(r4)
            java.lang.String r4 = " ("
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = ") for fragment "
            r3.append(r1)
            r3.append(r7)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1)
            r6.m857a(r2)
            goto L_0x0242
        L_0x0241:
            r0 = r12
        L_0x0242:
            r7.f345R = r0
            android.os.Bundle r1 = r7.f361l
            android.view.LayoutInflater r1 = r7.mo612h(r1)
            android.os.Bundle r2 = r7.f361l
            r7.mo591b(r1, r0, r2)
            android.view.View r1 = r7.f346S
            if (r1 == 0) goto L_0x028d
            android.view.View r1 = r7.f346S
            r7.f347T = r1
            android.view.View r1 = r7.f346S
            r1.setSaveFromParentEnabled(r13)
            if (r0 == 0) goto L_0x0263
            android.view.View r1 = r7.f346S
            r0.addView(r1)
        L_0x0263:
            boolean r0 = r7.f338K
            if (r0 == 0) goto L_0x026e
            android.view.View r0 = r7.f346S
            r1 = 8
            r0.setVisibility(r1)
        L_0x026e:
            android.view.View r0 = r7.f346S
            android.os.Bundle r1 = r7.f361l
            r7.mo577a(r0, r1)
            android.view.View r0 = r7.f346S
            android.os.Bundle r1 = r7.f361l
            r6.mo901a(r7, r0, r1, r13)
            android.view.View r0 = r7.f346S
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x0289
            android.view.ViewGroup r0 = r7.f345R
            if (r0 == 0) goto L_0x0289
            goto L_0x028a
        L_0x0289:
            r8 = r13
        L_0x028a:
            r7.f351X = r8
            goto L_0x028f
        L_0x028d:
            r7.f347T = r12
        L_0x028f:
            android.os.Bundle r0 = r7.f361l
            r7.mo627m(r0)
            android.os.Bundle r0 = r7.f361l
            r6.mo923c(r7, r0, r13)
            android.view.View r0 = r7.f346S
            if (r0 == 0) goto L_0x02a2
            android.os.Bundle r0 = r7.f361l
            r7.mo607f(r0)
        L_0x02a2:
            r7.f361l = r12
        L_0x02a4:
            if (r11 <= r10) goto L_0x02c6
            boolean r0 = f536a
            if (r0 == 0) goto L_0x02c0
            java.lang.String r0 = "FragmentManager"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "moveto STARTED: "
            r1.append(r2)
            r1.append(r7)
            java.lang.String r1 = r1.toString()
            android.util.Log.v(r0, r1)
        L_0x02c0:
            r7.mo543P()
            r6.mo915b(r7, r13)
        L_0x02c6:
            if (r11 <= r9) goto L_0x043b
            boolean r0 = f536a
            if (r0 == 0) goto L_0x02e2
            java.lang.String r0 = "FragmentManager"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "moveto RESUMED: "
            r1.append(r2)
            r1.append(r7)
            java.lang.String r1 = r1.toString()
            android.util.Log.v(r0, r1)
        L_0x02e2:
            r7.mo544Q()
            r6.mo924c(r7, r13)
            r7.f361l = r12
            r7.f362m = r12
            goto L_0x043b
        L_0x02ee:
            int r0 = r7.f360k
            if (r0 <= r11) goto L_0x043b
            int r0 = r7.f360k
            switch(r0) {
                case 1: goto L_0x03c5;
                case 2: goto L_0x033e;
                case 3: goto L_0x031c;
                case 4: goto L_0x02f9;
                default: goto L_0x02f7;
            }
        L_0x02f7:
            goto L_0x043b
        L_0x02f9:
            r0 = 4
            if (r11 >= r0) goto L_0x031c
            boolean r0 = f536a
            if (r0 == 0) goto L_0x0316
            java.lang.String r0 = "FragmentManager"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "movefrom RESUMED: "
            r1.append(r2)
            r1.append(r7)
            java.lang.String r1 = r1.toString()
            android.util.Log.v(r0, r1)
        L_0x0316:
            r7.mo547T()
            r6.mo927d(r7, r13)
        L_0x031c:
            if (r11 >= r9) goto L_0x033e
            boolean r0 = f536a
            if (r0 == 0) goto L_0x0338
            java.lang.String r0 = "FragmentManager"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "movefrom STARTED: "
            r1.append(r2)
            r1.append(r7)
            java.lang.String r1 = r1.toString()
            android.util.Log.v(r0, r1)
        L_0x0338:
            r7.mo548U()
            r6.mo929e(r7, r13)
        L_0x033e:
            if (r11 >= r10) goto L_0x03c5
            boolean r0 = f536a
            if (r0 == 0) goto L_0x035a
            java.lang.String r0 = "FragmentManager"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "movefrom ACTIVITY_CREATED: "
            r1.append(r2)
            r1.append(r7)
            java.lang.String r1 = r1.toString()
            android.util.Log.v(r0, r1)
        L_0x035a:
            android.view.View r0 = r7.f346S
            if (r0 == 0) goto L_0x036d
            android.support.v4.app.h r0 = r6.f555m
            boolean r0 = r0.mo703a(r7)
            if (r0 == 0) goto L_0x036d
            android.util.SparseArray<android.os.Parcelable> r0 = r7.f362m
            if (r0 != 0) goto L_0x036d
            r6.mo948m(r7)
        L_0x036d:
            r7.mo549V()
            r6.mo932f(r7, r13)
            android.view.View r0 = r7.f346S
            if (r0 == 0) goto L_0x03b6
            android.view.ViewGroup r0 = r7.f345R
            if (r0 == 0) goto L_0x03b6
            android.view.ViewGroup r0 = r7.f345R
            android.view.View r1 = r7.f346S
            r0.endViewTransition(r1)
            android.view.View r0 = r7.f346S
            r0.clearAnimation()
            int r0 = r6.f554l
            r1 = 0
            if (r0 <= 0) goto L_0x03a7
            boolean r0 = r6.f562u
            if (r0 != 0) goto L_0x03a7
            android.view.View r0 = r7.f346S
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x03a7
            float r0 = r7.f353Z
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x03a7
            r0 = r17
            r2 = r18
            android.support.v4.app.j$c r0 = r6.mo891a(r7, r0, r13, r2)
            goto L_0x03a8
        L_0x03a7:
            r0 = r12
        L_0x03a8:
            r7.f353Z = r1
            if (r0 == 0) goto L_0x03af
            r6.m854a(r7, r0, r11)
        L_0x03af:
            android.view.ViewGroup r0 = r7.f345R
            android.view.View r1 = r7.f346S
            r0.removeView(r1)
        L_0x03b6:
            r7.f345R = r12
            r7.f346S = r12
            r7.f358ae = r12
            android.arch.lifecycle.j<android.arch.lifecycle.e> r0 = r7.f359af
            r0.mo120b(r12)
            r7.f347T = r12
            r7.f373x = r13
        L_0x03c5:
            if (r11 >= r8) goto L_0x043b
            boolean r0 = r6.f562u
            if (r0 == 0) goto L_0x03ec
            android.view.View r0 = r7.mo583ad()
            if (r0 == 0) goto L_0x03dc
            android.view.View r0 = r7.mo583ad()
            r7.mo576a(r12)
            r0.clearAnimation()
            goto L_0x03ec
        L_0x03dc:
            android.animation.Animator r0 = r7.mo584ae()
            if (r0 == 0) goto L_0x03ec
            android.animation.Animator r0 = r7.mo584ae()
            r7.mo562a(r12)
            r0.cancel()
        L_0x03ec:
            android.view.View r0 = r7.mo583ad()
            if (r0 != 0) goto L_0x0437
            android.animation.Animator r0 = r7.mo584ae()
            if (r0 == 0) goto L_0x03f9
            goto L_0x0437
        L_0x03f9:
            boolean r0 = f536a
            if (r0 == 0) goto L_0x0413
            java.lang.String r0 = "FragmentManager"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "movefrom CREATED: "
            r1.append(r2)
            r1.append(r7)
            java.lang.String r1 = r1.toString()
            android.util.Log.v(r0, r1)
        L_0x0413:
            boolean r0 = r7.f341N
            if (r0 != 0) goto L_0x041e
            r7.mo550W()
            r6.mo935g(r7, r13)
            goto L_0x0420
        L_0x041e:
            r7.f360k = r13
        L_0x0420:
            r7.mo551X()
            r6.mo937h(r7, r13)
            if (r19 != 0) goto L_0x043b
            boolean r0 = r7.f341N
            if (r0 != 0) goto L_0x0430
            r6.mo934g(r7)
            goto L_0x043b
        L_0x0430:
            r7.f330C = r12
            r7.f334G = r12
            r7.f329B = r12
            goto L_0x043b
        L_0x0437:
            r7.mo595c(r11)
            goto L_0x043c
        L_0x043b:
            r8 = r11
        L_0x043c:
            int r0 = r7.f360k
            if (r0 == r8) goto L_0x046f
            java.lang.String r0 = "FragmentManager"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "moveToState: Fragment state for "
            r1.append(r2)
            r1.append(r7)
            java.lang.String r2 = " not updated inline; "
            r1.append(r2)
            java.lang.String r2 = "expected state "
            r1.append(r2)
            r1.append(r8)
            java.lang.String r2 = " found "
            r1.append(r2)
            int r2 = r7.f360k
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            android.util.Log.w(r0, r1)
            r7.f360k = r8
        L_0x046f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p017v4.app.C0257j.mo898a(android.support.v4.app.Fragment, int, int, int, boolean):void");
    }

    /* renamed from: a */
    private void m854a(final Fragment fragment, C0266c cVar, int i) {
        final View view = fragment.f346S;
        final ViewGroup viewGroup = fragment.f345R;
        viewGroup.startViewTransition(view);
        fragment.mo595c(i);
        if (cVar.f584a != null) {
            C0268e eVar = new C0268e(cVar.f584a, viewGroup, view);
            fragment.mo576a(fragment.f346S);
            eVar.setAnimationListener(new C0265b(m853a((Animation) eVar)) {
                public void onAnimationEnd(Animation animation) {
                    super.onAnimationEnd(animation);
                    viewGroup.post(new Runnable() {
                        public void run() {
                            if (fragment.mo583ad() != null) {
                                fragment.mo576a((View) null);
                                C0257j.this.mo898a(fragment, fragment.mo585af(), 0, 0, false);
                            }
                        }
                    });
                }
            });
            m866b(view, cVar);
            fragment.f346S.startAnimation(eVar);
            return;
        }
        Animator animator = cVar.f585b;
        fragment.mo562a(cVar.f585b);
        animator.addListener(new AnimatorListenerAdapter() {
            public void onAnimationEnd(Animator animator) {
                viewGroup.endViewTransition(view);
                Animator ae = fragment.mo584ae();
                fragment.mo562a((Animator) null);
                if (ae != null && viewGroup.indexOfChild(view) < 0) {
                    C0257j.this.mo898a(fragment, fragment.mo585af(), 0, 0, false);
                }
            }
        });
        animator.setTarget(fragment.f346S);
        m866b(fragment.f346S, cVar);
        animator.start();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo912b(Fragment fragment) {
        mo898a(fragment, this.f554l, 0, 0, false);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo922c(Fragment fragment) {
        if (fragment.f372w && !fragment.f375z) {
            fragment.mo591b(fragment.mo612h(fragment.f361l), (ViewGroup) null, fragment.f361l);
            if (fragment.f346S != null) {
                fragment.f347T = fragment.f346S;
                fragment.f346S.setSaveFromParentEnabled(false);
                if (fragment.f338K) {
                    fragment.f346S.setVisibility(8);
                }
                fragment.mo577a(fragment.f346S, fragment.f361l);
                mo901a(fragment, fragment.f346S, fragment.f361l, false);
                return;
            }
            fragment.f347T = null;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public void mo925d(final Fragment fragment) {
        if (fragment.f346S != null) {
            C0266c a = mo891a(fragment, fragment.mo553Z(), !fragment.f338K, fragment.mo580aa());
            if (a == null || a.f585b == null) {
                if (a != null) {
                    m866b(fragment.f346S, a);
                    fragment.f346S.startAnimation(a.f584a);
                    a.f584a.start();
                }
                fragment.f346S.setVisibility((!fragment.f338K || fragment.mo587ah()) ? 0 : 8);
                if (fragment.mo587ah()) {
                    fragment.mo620j(false);
                }
            } else {
                a.f585b.setTarget(fragment.f346S);
                if (!fragment.f338K) {
                    fragment.f346S.setVisibility(0);
                } else if (fragment.mo587ah()) {
                    fragment.mo620j(false);
                } else {
                    final ViewGroup viewGroup = fragment.f345R;
                    final View view = fragment.f346S;
                    viewGroup.startViewTransition(view);
                    a.f585b.addListener(new AnimatorListenerAdapter() {
                        public void onAnimationEnd(Animator animator) {
                            viewGroup.endViewTransition(view);
                            animator.removeListener(this);
                            if (fragment.f346S != null) {
                                fragment.f346S.setVisibility(8);
                            }
                        }
                    });
                }
                m866b(fragment.f346S, a);
                a.f585b.start();
            }
        }
        if (fragment.f370u && fragment.f342O && fragment.f343P) {
            this.f559r = true;
        }
        fragment.f352Y = false;
        fragment.mo600d(fragment.f338K);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public void mo928e(Fragment fragment) {
        if (fragment != null) {
            int i = this.f554l;
            if (fragment.f371v) {
                if (fragment.mo618i()) {
                    i = Math.min(i, 1);
                } else {
                    i = Math.min(i, 0);
                }
            }
            mo898a(fragment, i, fragment.mo553Z(), fragment.mo580aa(), false);
            if (fragment.f346S != null) {
                Fragment p = m873p(fragment);
                if (p != null) {
                    View view = p.f346S;
                    ViewGroup viewGroup = fragment.f345R;
                    int indexOfChild = viewGroup.indexOfChild(view);
                    int indexOfChild2 = viewGroup.indexOfChild(fragment.f346S);
                    if (indexOfChild2 < indexOfChild) {
                        viewGroup.removeViewAt(indexOfChild2);
                        viewGroup.addView(fragment.f346S, indexOfChild);
                    }
                }
                if (fragment.f351X && fragment.f345R != null) {
                    if (fragment.f353Z > 0.0f) {
                        fragment.f346S.setAlpha(fragment.f353Z);
                    }
                    fragment.f353Z = 0.0f;
                    fragment.f351X = false;
                    C0266c a = mo891a(fragment, fragment.mo553Z(), true, fragment.mo580aa());
                    if (a != null) {
                        m866b(fragment.f346S, a);
                        if (a.f584a != null) {
                            fragment.f346S.startAnimation(a.f584a);
                        } else {
                            a.f585b.setTarget(fragment.f346S);
                            a.f585b.start();
                        }
                    }
                }
            }
            if (fragment.f352Y) {
                mo925d(fragment);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo893a(int i, boolean z) {
        if (this.f555m == null && i != 0) {
            throw new IllegalStateException("No activity");
        } else if (z || i != this.f554l) {
            this.f554l = i;
            if (this.f548f != null) {
                int size = this.f547e.size();
                for (int i2 = 0; i2 < size; i2++) {
                    mo928e((Fragment) this.f547e.get(i2));
                }
                int size2 = this.f548f.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    Fragment fragment = (Fragment) this.f548f.valueAt(i3);
                    if (fragment != null && ((fragment.f371v || fragment.f339L) && !fragment.f351X)) {
                        mo928e(fragment);
                    }
                }
                mo930f();
                if (this.f559r && this.f555m != null && this.f554l == 4) {
                    this.f555m.mo706c();
                    this.f559r = false;
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public void mo930f() {
        if (this.f548f != null) {
            for (int i = 0; i < this.f548f.size(); i++) {
                Fragment fragment = (Fragment) this.f548f.valueAt(i);
                if (fragment != null) {
                    mo897a(fragment);
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public void mo931f(Fragment fragment) {
        if (fragment.f364o < 0) {
            int i = this.f546d;
            this.f546d = i + 1;
            fragment.mo560a(i, this.f557o);
            if (this.f548f == null) {
                this.f548f = new SparseArray<>();
            }
            this.f548f.put(fragment.f364o, fragment);
            if (f536a) {
                StringBuilder sb = new StringBuilder();
                sb.append("Allocated fragment index ");
                sb.append(fragment);
                Log.v("FragmentManager", sb.toString());
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public void mo934g(Fragment fragment) {
        if (fragment.f364o >= 0) {
            if (f536a) {
                StringBuilder sb = new StringBuilder();
                sb.append("Freeing fragment index ");
                sb.append(fragment);
                Log.v("FragmentManager", sb.toString());
            }
            this.f548f.put(fragment.f364o, null);
            fragment.mo530C();
        }
    }

    /* renamed from: a */
    public void mo902a(Fragment fragment, boolean z) {
        if (f536a) {
            StringBuilder sb = new StringBuilder();
            sb.append("add: ");
            sb.append(fragment);
            Log.v("FragmentManager", sb.toString());
        }
        mo931f(fragment);
        if (fragment.f339L) {
            return;
        }
        if (this.f547e.contains(fragment)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Fragment already added: ");
            sb2.append(fragment);
            throw new IllegalStateException(sb2.toString());
        }
        synchronized (this.f547e) {
            this.f547e.add(fragment);
        }
        fragment.f370u = true;
        fragment.f371v = false;
        if (fragment.f346S == null) {
            fragment.f352Y = false;
        }
        if (fragment.f342O && fragment.f343P) {
            this.f559r = true;
        }
        if (z) {
            mo912b(fragment);
        }
    }

    /* renamed from: h */
    public void mo936h(Fragment fragment) {
        if (f536a) {
            StringBuilder sb = new StringBuilder();
            sb.append("remove: ");
            sb.append(fragment);
            sb.append(" nesting=");
            sb.append(fragment.f328A);
            Log.v("FragmentManager", sb.toString());
        }
        boolean z = !fragment.mo618i();
        if (!fragment.f339L || z) {
            synchronized (this.f547e) {
                this.f547e.remove(fragment);
            }
            if (fragment.f342O && fragment.f343P) {
                this.f559r = true;
            }
            fragment.f370u = false;
            fragment.f371v = true;
        }
    }

    /* renamed from: i */
    public void mo940i(Fragment fragment) {
        if (f536a) {
            StringBuilder sb = new StringBuilder();
            sb.append("hide: ");
            sb.append(fragment);
            Log.v("FragmentManager", sb.toString());
        }
        if (!fragment.f338K) {
            fragment.f338K = true;
            fragment.f352Y = true ^ fragment.f352Y;
        }
    }

    /* renamed from: j */
    public void mo942j(Fragment fragment) {
        if (f536a) {
            StringBuilder sb = new StringBuilder();
            sb.append("show: ");
            sb.append(fragment);
            Log.v("FragmentManager", sb.toString());
        }
        if (fragment.f338K) {
            fragment.f338K = false;
            fragment.f352Y = !fragment.f352Y;
        }
    }

    /* renamed from: k */
    public void mo944k(Fragment fragment) {
        if (f536a) {
            StringBuilder sb = new StringBuilder();
            sb.append("detach: ");
            sb.append(fragment);
            Log.v("FragmentManager", sb.toString());
        }
        if (!fragment.f339L) {
            fragment.f339L = true;
            if (fragment.f370u) {
                if (f536a) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("remove from detach: ");
                    sb2.append(fragment);
                    Log.v("FragmentManager", sb2.toString());
                }
                synchronized (this.f547e) {
                    this.f547e.remove(fragment);
                }
                if (fragment.f342O && fragment.f343P) {
                    this.f559r = true;
                }
                fragment.f370u = false;
            }
        }
    }

    /* renamed from: l */
    public void mo946l(Fragment fragment) {
        if (f536a) {
            StringBuilder sb = new StringBuilder();
            sb.append("attach: ");
            sb.append(fragment);
            Log.v("FragmentManager", sb.toString());
        }
        if (fragment.f339L) {
            fragment.f339L = false;
            if (fragment.f370u) {
                return;
            }
            if (this.f547e.contains(fragment)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Fragment already added: ");
                sb2.append(fragment);
                throw new IllegalStateException(sb2.toString());
            }
            if (f536a) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("add from attach: ");
                sb3.append(fragment);
                Log.v("FragmentManager", sb3.toString());
            }
            synchronized (this.f547e) {
                this.f547e.add(fragment);
            }
            fragment.f370u = true;
            if (fragment.f342O && fragment.f343P) {
                this.f559r = true;
            }
        }
    }

    /* renamed from: a */
    public Fragment mo865a(int i) {
        for (int size = this.f547e.size() - 1; size >= 0; size--) {
            Fragment fragment = (Fragment) this.f547e.get(size);
            if (fragment != null && fragment.f335H == i) {
                return fragment;
            }
        }
        if (this.f548f != null) {
            for (int size2 = this.f548f.size() - 1; size2 >= 0; size2--) {
                Fragment fragment2 = (Fragment) this.f548f.valueAt(size2);
                if (fragment2 != null && fragment2.f335H == i) {
                    return fragment2;
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    public Fragment mo866a(String str) {
        if (str != null) {
            for (int size = this.f547e.size() - 1; size >= 0; size--) {
                Fragment fragment = (Fragment) this.f547e.get(size);
                if (fragment != null && str.equals(fragment.f337J)) {
                    return fragment;
                }
            }
        }
        if (!(this.f548f == null || str == null)) {
            for (int size2 = this.f548f.size() - 1; size2 >= 0; size2--) {
                Fragment fragment2 = (Fragment) this.f548f.valueAt(size2);
                if (fragment2 != null && str.equals(fragment2.f337J)) {
                    return fragment2;
                }
            }
        }
        return null;
    }

    /* renamed from: b */
    public Fragment mo911b(String str) {
        if (!(this.f548f == null || str == null)) {
            for (int size = this.f548f.size() - 1; size >= 0; size--) {
                Fragment fragment = (Fragment) this.f548f.valueAt(size);
                if (fragment != null) {
                    Fragment a = fragment.mo554a(str);
                    if (a != null) {
                        return a;
                    }
                }
            }
        }
        return null;
    }

    /* renamed from: z */
    private void m874z() {
        if (mo873e()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        } else if (this.f563v != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("Can not perform this action inside of ");
            sb.append(this.f563v);
            throw new IllegalStateException(sb.toString());
        }
    }

    /* renamed from: e */
    public boolean mo873e() {
        return this.f560s || this.f561t;
    }

    /* renamed from: a */
    public void mo905a(C0271h hVar, boolean z) {
        if (!z) {
            m874z();
        }
        synchronized (this) {
            if (!this.f562u) {
                if (this.f555m != null) {
                    if (this.f544b == null) {
                        this.f544b = new ArrayList<>();
                    }
                    this.f544b.add(hVar);
                    mo933g();
                    return;
                }
            }
            if (!z) {
                throw new IllegalStateException("Activity has been destroyed");
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public void mo933g() {
        synchronized (this) {
            boolean z = false;
            boolean z2 = this.f540C != null && !this.f540C.isEmpty();
            if (this.f544b != null && this.f544b.size() == 1) {
                z = true;
            }
            if (z2 || z) {
                this.f555m.mo863h().removeCallbacks(this.f542E);
                this.f555m.mo863h().post(this.f542E);
            }
        }
    }

    /* renamed from: a */
    public int mo889a(C0246c cVar) {
        synchronized (this) {
            if (this.f552j != null) {
                if (this.f552j.size() > 0) {
                    int intValue = ((Integer) this.f552j.remove(this.f552j.size() - 1)).intValue();
                    if (f536a) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Adding back stack index ");
                        sb.append(intValue);
                        sb.append(" with ");
                        sb.append(cVar);
                        Log.v("FragmentManager", sb.toString());
                    }
                    this.f551i.set(intValue, cVar);
                    return intValue;
                }
            }
            if (this.f551i == null) {
                this.f551i = new ArrayList<>();
            }
            int size = this.f551i.size();
            if (f536a) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Setting back stack index ");
                sb2.append(size);
                sb2.append(" to ");
                sb2.append(cVar);
                Log.v("FragmentManager", sb2.toString());
            }
            this.f551i.add(cVar);
            return size;
        }
    }

    /* renamed from: a */
    public void mo892a(int i, C0246c cVar) {
        synchronized (this) {
            if (this.f551i == null) {
                this.f551i = new ArrayList<>();
            }
            int size = this.f551i.size();
            if (i < size) {
                if (f536a) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Setting back stack index ");
                    sb.append(i);
                    sb.append(" to ");
                    sb.append(cVar);
                    Log.v("FragmentManager", sb.toString());
                }
                this.f551i.set(i, cVar);
            } else {
                while (size < i) {
                    this.f551i.add(null);
                    if (this.f552j == null) {
                        this.f552j = new ArrayList<>();
                    }
                    if (f536a) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Adding available back stack index ");
                        sb2.append(size);
                        Log.v("FragmentManager", sb2.toString());
                    }
                    this.f552j.add(Integer.valueOf(size));
                    size++;
                }
                if (f536a) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("Adding back stack index ");
                    sb3.append(i);
                    sb3.append(" with ");
                    sb3.append(cVar);
                    Log.v("FragmentManager", sb3.toString());
                }
                this.f551i.add(cVar);
            }
        }
    }

    /* renamed from: c */
    public void mo921c(int i) {
        synchronized (this) {
            this.f551i.set(i, null);
            if (this.f552j == null) {
                this.f552j = new ArrayList<>();
            }
            if (f536a) {
                StringBuilder sb = new StringBuilder();
                sb.append("Freeing back stack index ");
                sb.append(i);
                Log.v("FragmentManager", sb.toString());
            }
            this.f552j.add(Integer.valueOf(i));
        }
    }

    /* renamed from: c */
    private void m869c(boolean z) {
        if (this.f545c) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        } else if (this.f555m == null) {
            throw new IllegalStateException("Fragment host has been destroyed");
        } else if (Looper.myLooper() != this.f555m.mo863h().getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        } else {
            if (!z) {
                m874z();
            }
            if (this.f565x == null) {
                this.f565x = new ArrayList<>();
                this.f566y = new ArrayList<>();
            }
            this.f545c = true;
            try {
                m858a(null, null);
            } finally {
                this.f545c = false;
            }
        }
    }

    /* renamed from: A */
    private void m846A() {
        this.f545c = false;
        this.f566y.clear();
        this.f565x.clear();
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: h */
    public boolean mo938h() {
        m869c(true);
        boolean z = false;
        while (m870c(this.f565x, this.f566y)) {
            this.f545c = true;
            try {
                m867b(this.f565x, this.f566y);
                m846A();
                z = true;
            } catch (Throwable th) {
                m846A();
                throw th;
            }
        }
        mo939i();
        m849D();
        return z;
    }

    /* renamed from: a */
    private void m858a(ArrayList<C0246c> arrayList, ArrayList<Boolean> arrayList2) {
        int size = this.f540C == null ? 0 : this.f540C.size();
        int i = 0;
        while (i < size) {
            C0273j jVar = (C0273j) this.f540C.get(i);
            if (arrayList != null && !jVar.f599a) {
                int indexOf = arrayList.indexOf(jVar.f600b);
                if (indexOf != -1 && ((Boolean) arrayList2.get(indexOf)).booleanValue()) {
                    jVar.mo981e();
                    i++;
                }
            }
            if (jVar.mo979c() || (arrayList != null && jVar.f600b.mo813a(arrayList, 0, arrayList.size()))) {
                this.f540C.remove(i);
                i--;
                size--;
                if (arrayList != null && !jVar.f599a) {
                    int indexOf2 = arrayList.indexOf(jVar.f600b);
                    if (indexOf2 != -1 && ((Boolean) arrayList2.get(indexOf2)).booleanValue()) {
                        jVar.mo981e();
                    }
                }
                jVar.mo980d();
            }
            i++;
        }
    }

    /* renamed from: b */
    private void m867b(ArrayList<C0246c> arrayList, ArrayList<Boolean> arrayList2) {
        if (arrayList != null && !arrayList.isEmpty()) {
            if (arrayList2 == null || arrayList.size() != arrayList2.size()) {
                throw new IllegalStateException("Internal error with the back stack records");
            }
            m858a(arrayList, arrayList2);
            int size = arrayList.size();
            int i = 0;
            int i2 = 0;
            while (i < size) {
                if (!((C0246c) arrayList.get(i)).f505t) {
                    if (i2 != i) {
                        m859a(arrayList, arrayList2, i2, i);
                    }
                    i2 = i + 1;
                    if (((Boolean) arrayList2.get(i)).booleanValue()) {
                        while (i2 < size && ((Boolean) arrayList2.get(i2)).booleanValue() && !((C0246c) arrayList.get(i2)).f505t) {
                            i2++;
                        }
                    }
                    m859a(arrayList, arrayList2, i, i2);
                    i = i2 - 1;
                }
                i++;
            }
            if (i2 != size) {
                m859a(arrayList, arrayList2, i2, size);
            }
        }
    }

    /* renamed from: a */
    private void m859a(ArrayList<C0246c> arrayList, ArrayList<Boolean> arrayList2, int i, int i2) {
        int i3;
        ArrayList<C0246c> arrayList3 = arrayList;
        ArrayList<Boolean> arrayList4 = arrayList2;
        int i4 = i;
        int i5 = i2;
        boolean z = ((C0246c) arrayList3.get(i4)).f505t;
        if (this.f567z == null) {
            this.f567z = new ArrayList<>();
        } else {
            this.f567z.clear();
        }
        this.f567z.addAll(this.f547e);
        Fragment x = mo964x();
        boolean z2 = false;
        for (int i6 = i4; i6 < i5; i6++) {
            C0246c cVar = (C0246c) arrayList3.get(i6);
            if (!((Boolean) arrayList4.get(i6)).booleanValue()) {
                x = cVar.mo803a(this.f567z, x);
            } else {
                x = cVar.mo816b(this.f567z, x);
            }
            z2 = z2 || cVar.f494i;
        }
        this.f567z.clear();
        if (!z) {
            C0276m.m991a(this, arrayList3, arrayList4, i4, i5, false);
        }
        m868b(arrayList, arrayList2, i, i2);
        if (z) {
            C0378b bVar = new C0378b();
            m865b(bVar);
            int a = m850a(arrayList3, arrayList4, i4, i5, bVar);
            m856a(bVar);
            i3 = a;
        } else {
            i3 = i5;
        }
        if (i3 != i4 && z) {
            C0276m.m991a(this, arrayList3, arrayList4, i4, i3, true);
            mo893a(this.f554l, true);
        }
        while (i4 < i5) {
            C0246c cVar2 = (C0246c) arrayList3.get(i4);
            if (((Boolean) arrayList4.get(i4)).booleanValue() && cVar2.f498m >= 0) {
                mo921c(cVar2.f498m);
                cVar2.f498m = -1;
            }
            cVar2.mo807a();
            i4++;
        }
        if (z2) {
            mo941j();
        }
    }

    /* renamed from: a */
    private void m856a(C0378b<Fragment> bVar) {
        int size = bVar.size();
        for (int i = 0; i < size; i++) {
            Fragment fragment = (Fragment) bVar.mo1286b(i);
            if (!fragment.f370u) {
                View y = fragment.mo645y();
                fragment.f353Z = y.getAlpha();
                y.setAlpha(0.0f);
            }
        }
    }

    /* renamed from: a */
    private int m850a(ArrayList<C0246c> arrayList, ArrayList<Boolean> arrayList2, int i, int i2, C0378b<Fragment> bVar) {
        int i3 = i2;
        for (int i4 = i2 - 1; i4 >= i; i4--) {
            C0246c cVar = (C0246c) arrayList.get(i4);
            boolean booleanValue = ((Boolean) arrayList2.get(i4)).booleanValue();
            if (cVar.mo823e() && !cVar.mo813a(arrayList, i4 + 1, i2)) {
                if (this.f540C == null) {
                    this.f540C = new ArrayList<>();
                }
                C0273j jVar = new C0273j(cVar, booleanValue);
                this.f540C.add(jVar);
                cVar.mo809a((C0216c) jVar);
                if (booleanValue) {
                    cVar.mo822d();
                } else {
                    cVar.mo818b(false);
                }
                i3--;
                if (i4 != i3) {
                    arrayList.remove(i4);
                    arrayList.add(i3, cVar);
                }
                m865b(bVar);
            }
        }
        return i3;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo903a(C0246c cVar, boolean z, boolean z2, boolean z3) {
        if (z) {
            cVar.mo818b(z3);
        } else {
            cVar.mo822d();
        }
        ArrayList arrayList = new ArrayList(1);
        ArrayList arrayList2 = new ArrayList(1);
        arrayList.add(cVar);
        arrayList2.add(Boolean.valueOf(z));
        if (z2) {
            C0276m.m991a(this, arrayList, arrayList2, 0, 1, true);
        }
        if (z3) {
            mo893a(this.f554l, true);
        }
        if (this.f548f != null) {
            int size = this.f548f.size();
            for (int i = 0; i < size; i++) {
                Fragment fragment = (Fragment) this.f548f.valueAt(i);
                if (fragment != null && fragment.f346S != null && fragment.f351X && cVar.mo819b(fragment.f336I)) {
                    if (fragment.f353Z > 0.0f) {
                        fragment.f346S.setAlpha(fragment.f353Z);
                    }
                    if (z3) {
                        fragment.f353Z = 0.0f;
                    } else {
                        fragment.f353Z = -1.0f;
                        fragment.f351X = false;
                    }
                }
            }
        }
    }

    /* renamed from: p */
    private Fragment m873p(Fragment fragment) {
        ViewGroup viewGroup = fragment.f345R;
        View view = fragment.f346S;
        if (viewGroup == null || view == null) {
            return null;
        }
        for (int indexOf = this.f547e.indexOf(fragment) - 1; indexOf >= 0; indexOf--) {
            Fragment fragment2 = (Fragment) this.f547e.get(indexOf);
            if (fragment2.f345R == viewGroup && fragment2.f346S != null) {
                return fragment2;
            }
        }
        return null;
    }

    /* renamed from: b */
    private static void m868b(ArrayList<C0246c> arrayList, ArrayList<Boolean> arrayList2, int i, int i2) {
        while (i < i2) {
            C0246c cVar = (C0246c) arrayList.get(i);
            boolean z = true;
            if (((Boolean) arrayList2.get(i)).booleanValue()) {
                cVar.mo808a(-1);
                if (i != i2 - 1) {
                    z = false;
                }
                cVar.mo818b(z);
            } else {
                cVar.mo808a(1);
                cVar.mo822d();
            }
            i++;
        }
    }

    /* renamed from: b */
    private void m865b(C0378b<Fragment> bVar) {
        if (this.f554l >= 1) {
            int min = Math.min(this.f554l, 3);
            int size = this.f547e.size();
            for (int i = 0; i < size; i++) {
                Fragment fragment = (Fragment) this.f547e.get(i);
                if (fragment.f360k < min) {
                    mo898a(fragment, min, fragment.mo552Y(), fragment.mo553Z(), false);
                    if (fragment.f346S != null && !fragment.f338K && fragment.f351X) {
                        bVar.add(fragment);
                    }
                }
            }
        }
    }

    /* renamed from: B */
    private void m847B() {
        if (this.f540C != null) {
            while (!this.f540C.isEmpty()) {
                ((C0273j) this.f540C.remove(0)).mo980d();
            }
        }
    }

    /* renamed from: C */
    private void m848C() {
        int size = this.f548f == null ? 0 : this.f548f.size();
        for (int i = 0; i < size; i++) {
            Fragment fragment = (Fragment) this.f548f.valueAt(i);
            if (fragment != null) {
                if (fragment.mo583ad() != null) {
                    int af = fragment.mo585af();
                    View ad = fragment.mo583ad();
                    Animation animation = ad.getAnimation();
                    if (animation != null) {
                        animation.cancel();
                        ad.clearAnimation();
                    }
                    fragment.mo576a((View) null);
                    mo898a(fragment, af, 0, 0, false);
                } else if (fragment.mo584ae() != null) {
                    fragment.mo584ae().end();
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003b, code lost:
        return false;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m870c(java.util.ArrayList<android.support.p017v4.app.C0246c> r5, java.util.ArrayList<java.lang.Boolean> r6) {
        /*
            r4 = this;
            monitor-enter(r4)
            java.util.ArrayList<android.support.v4.app.j$h> r0 = r4.f544b     // Catch:{ all -> 0x003c }
            r1 = 0
            if (r0 == 0) goto L_0x003a
            java.util.ArrayList<android.support.v4.app.j$h> r0 = r4.f544b     // Catch:{ all -> 0x003c }
            int r0 = r0.size()     // Catch:{ all -> 0x003c }
            if (r0 != 0) goto L_0x000f
            goto L_0x003a
        L_0x000f:
            java.util.ArrayList<android.support.v4.app.j$h> r0 = r4.f544b     // Catch:{ all -> 0x003c }
            int r0 = r0.size()     // Catch:{ all -> 0x003c }
            r2 = r1
        L_0x0016:
            if (r1 >= r0) goto L_0x0028
            java.util.ArrayList<android.support.v4.app.j$h> r3 = r4.f544b     // Catch:{ all -> 0x003c }
            java.lang.Object r3 = r3.get(r1)     // Catch:{ all -> 0x003c }
            android.support.v4.app.j$h r3 = (android.support.p017v4.app.C0257j.C0271h) r3     // Catch:{ all -> 0x003c }
            boolean r3 = r3.mo814a(r5, r6)     // Catch:{ all -> 0x003c }
            r2 = r2 | r3
            int r1 = r1 + 1
            goto L_0x0016
        L_0x0028:
            java.util.ArrayList<android.support.v4.app.j$h> r5 = r4.f544b     // Catch:{ all -> 0x003c }
            r5.clear()     // Catch:{ all -> 0x003c }
            android.support.v4.app.h r5 = r4.f555m     // Catch:{ all -> 0x003c }
            android.os.Handler r5 = r5.mo863h()     // Catch:{ all -> 0x003c }
            java.lang.Runnable r6 = r4.f542E     // Catch:{ all -> 0x003c }
            r5.removeCallbacks(r6)     // Catch:{ all -> 0x003c }
            monitor-exit(r4)     // Catch:{ all -> 0x003c }
            return r2
        L_0x003a:
            monitor-exit(r4)     // Catch:{ all -> 0x003c }
            return r1
        L_0x003c:
            r5 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x003c }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p017v4.app.C0257j.m870c(java.util.ArrayList, java.util.ArrayList):boolean");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public void mo939i() {
        if (this.f564w) {
            this.f564w = false;
            mo930f();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public void mo941j() {
        if (this.f553k != null) {
            for (int i = 0; i < this.f553k.size(); i++) {
                ((C0256b) this.f553k.get(i)).mo888a();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo916b(C0246c cVar) {
        if (this.f549g == null) {
            this.f549g = new ArrayList<>();
        }
        this.f549g.add(cVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo910a(ArrayList<C0246c> arrayList, ArrayList<Boolean> arrayList2, String str, int i, int i2) {
        int i3;
        if (this.f549g == null) {
            return false;
        }
        if (str == null && i < 0 && (i2 & 1) == 0) {
            int size = this.f549g.size() - 1;
            if (size < 0) {
                return false;
            }
            arrayList.add(this.f549g.remove(size));
            arrayList2.add(Boolean.valueOf(true));
        } else {
            if (str != null || i >= 0) {
                int size2 = this.f549g.size() - 1;
                while (i3 >= 0) {
                    C0246c cVar = (C0246c) this.f549g.get(i3);
                    if ((str != null && str.equals(cVar.mo824f())) || (i >= 0 && i == cVar.f498m)) {
                        break;
                    }
                    size2 = i3 - 1;
                }
                if (i3 < 0) {
                    return false;
                }
                if ((i2 & 1) != 0) {
                    i3--;
                    while (i3 >= 0) {
                        C0246c cVar2 = (C0246c) this.f549g.get(i3);
                        if ((str == null || !str.equals(cVar2.mo824f())) && (i < 0 || i != cVar2.f498m)) {
                            break;
                        }
                        i3--;
                    }
                }
            } else {
                i3 = -1;
            }
            if (i3 == this.f549g.size() - 1) {
                return false;
            }
            for (int size3 = this.f549g.size() - 1; size3 > i3; size3--) {
                arrayList.add(this.f549g.remove(size3));
                arrayList2.add(Boolean.valueOf(true));
            }
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: k */
    public C0274k mo943k() {
        m855a(this.f541D);
        return this.f541D;
    }

    /* renamed from: a */
    private static void m855a(C0274k kVar) {
        if (kVar != null) {
            List<Fragment> a = kVar.mo982a();
            if (a != null) {
                for (Fragment fragment : a) {
                    fragment.f341N = true;
                }
            }
            List<C0274k> b = kVar.mo983b();
            if (b != null) {
                for (C0274k a2 : b) {
                    m855a(a2);
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: l */
    public void mo945l() {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        C0274k kVar;
        if (this.f548f != null) {
            arrayList3 = null;
            arrayList2 = null;
            arrayList = null;
            for (int i = 0; i < this.f548f.size(); i++) {
                Fragment fragment = (Fragment) this.f548f.valueAt(i);
                if (fragment != null) {
                    if (fragment.f340M) {
                        if (arrayList3 == null) {
                            arrayList3 = new ArrayList();
                        }
                        arrayList3.add(fragment);
                        fragment.f368s = fragment.f367r != null ? fragment.f367r.f364o : -1;
                        if (f536a) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("retainNonConfig: keeping retained ");
                            sb.append(fragment);
                            Log.v("FragmentManager", sb.toString());
                        }
                    }
                    if (fragment.f331D != null) {
                        fragment.f331D.mo945l();
                        kVar = fragment.f331D.f541D;
                    } else {
                        kVar = fragment.f332E;
                    }
                    if (arrayList2 == null && kVar != null) {
                        arrayList2 = new ArrayList(this.f548f.size());
                        for (int i2 = 0; i2 < i; i2++) {
                            arrayList2.add(null);
                        }
                    }
                    if (arrayList2 != null) {
                        arrayList2.add(kVar);
                    }
                    if (arrayList == null && fragment.f333F != null) {
                        arrayList = new ArrayList(this.f548f.size());
                        for (int i3 = 0; i3 < i; i3++) {
                            arrayList.add(null);
                        }
                    }
                    if (arrayList != null) {
                        arrayList.add(fragment.f333F);
                    }
                }
            }
        } else {
            arrayList3 = null;
            arrayList2 = null;
            arrayList = null;
        }
        if (arrayList3 == null && arrayList2 == null && arrayList == null) {
            this.f541D = null;
        } else {
            this.f541D = new C0274k(arrayList3, arrayList2, arrayList);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: m */
    public void mo948m(Fragment fragment) {
        if (fragment.f347T != null) {
            if (this.f539B == null) {
                this.f539B = new SparseArray<>();
            } else {
                this.f539B.clear();
            }
            fragment.f347T.saveHierarchyState(this.f539B);
            if (this.f539B.size() > 0) {
                fragment.f362m = this.f539B;
                this.f539B = null;
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: n */
    public Bundle mo949n(Fragment fragment) {
        Bundle bundle;
        if (this.f538A == null) {
            this.f538A = new Bundle();
        }
        fragment.mo629n(this.f538A);
        mo926d(fragment, this.f538A, false);
        if (!this.f538A.isEmpty()) {
            bundle = this.f538A;
            this.f538A = null;
        } else {
            bundle = null;
        }
        if (fragment.f346S != null) {
            mo948m(fragment);
        }
        if (fragment.f362m != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putSparseParcelableArray("android:view_state", fragment.f362m);
        }
        if (!fragment.f349V) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android:user_visible_hint", fragment.f349V);
        }
        return bundle;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: m */
    public Parcelable mo947m() {
        int[] iArr;
        m847B();
        m848C();
        mo938h();
        this.f560s = true;
        BackStackState[] backStackStateArr = null;
        this.f541D = null;
        if (this.f548f == null || this.f548f.size() <= 0) {
            return null;
        }
        int size = this.f548f.size();
        FragmentState[] fragmentStateArr = new FragmentState[size];
        boolean z = false;
        for (int i = 0; i < size; i++) {
            Fragment fragment = (Fragment) this.f548f.valueAt(i);
            if (fragment != null) {
                if (fragment.f364o < 0) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Failure saving state: active ");
                    sb.append(fragment);
                    sb.append(" has cleared index: ");
                    sb.append(fragment.f364o);
                    m857a((RuntimeException) new IllegalStateException(sb.toString()));
                }
                FragmentState fragmentState = new FragmentState(fragment);
                fragmentStateArr[i] = fragmentState;
                if (fragment.f360k <= 0 || fragmentState.f430k != null) {
                    fragmentState.f430k = fragment.f361l;
                } else {
                    fragmentState.f430k = mo949n(fragment);
                    if (fragment.f367r != null) {
                        if (fragment.f367r.f364o < 0) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("Failure saving state: ");
                            sb2.append(fragment);
                            sb2.append(" has target not in fragment manager: ");
                            sb2.append(fragment.f367r);
                            m857a((RuntimeException) new IllegalStateException(sb2.toString()));
                        }
                        if (fragmentState.f430k == null) {
                            fragmentState.f430k = new Bundle();
                        }
                        mo895a(fragmentState.f430k, "android:target_state", fragment.f367r);
                        if (fragment.f369t != 0) {
                            fragmentState.f430k.putInt("android:target_req_state", fragment.f369t);
                        }
                    }
                }
                if (f536a) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("Saved state of ");
                    sb3.append(fragment);
                    sb3.append(": ");
                    sb3.append(fragmentState.f430k);
                    Log.v("FragmentManager", sb3.toString());
                }
                z = true;
            }
        }
        if (!z) {
            if (f536a) {
                Log.v("FragmentManager", "saveAllState: no fragments!");
            }
            return null;
        }
        int size2 = this.f547e.size();
        if (size2 > 0) {
            iArr = new int[size2];
            for (int i2 = 0; i2 < size2; i2++) {
                iArr[i2] = ((Fragment) this.f547e.get(i2)).f364o;
                if (iArr[i2] < 0) {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("Failure saving state: active ");
                    sb4.append(this.f547e.get(i2));
                    sb4.append(" has cleared index: ");
                    sb4.append(iArr[i2]);
                    m857a((RuntimeException) new IllegalStateException(sb4.toString()));
                }
                if (f536a) {
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append("saveAllState: adding fragment #");
                    sb5.append(i2);
                    sb5.append(": ");
                    sb5.append(this.f547e.get(i2));
                    Log.v("FragmentManager", sb5.toString());
                }
            }
        } else {
            iArr = null;
        }
        if (this.f549g != null) {
            int size3 = this.f549g.size();
            if (size3 > 0) {
                backStackStateArr = new BackStackState[size3];
                for (int i3 = 0; i3 < size3; i3++) {
                    backStackStateArr[i3] = new BackStackState((C0246c) this.f549g.get(i3));
                    if (f536a) {
                        StringBuilder sb6 = new StringBuilder();
                        sb6.append("saveAllState: adding back stack #");
                        sb6.append(i3);
                        sb6.append(": ");
                        sb6.append(this.f549g.get(i3));
                        Log.v("FragmentManager", sb6.toString());
                    }
                }
            }
        }
        FragmentManagerState fragmentManagerState = new FragmentManagerState();
        fragmentManagerState.f415a = fragmentStateArr;
        fragmentManagerState.f416b = iArr;
        fragmentManagerState.f417c = backStackStateArr;
        if (this.f558p != null) {
            fragmentManagerState.f418d = this.f558p.f364o;
        }
        fragmentManagerState.f419e = this.f546d;
        mo945l();
        return fragmentManagerState;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo896a(Parcelable parcelable, C0274k kVar) {
        List list;
        List list2;
        if (parcelable != null) {
            FragmentManagerState fragmentManagerState = (FragmentManagerState) parcelable;
            if (fragmentManagerState.f415a != null) {
                if (kVar != null) {
                    List a = kVar.mo982a();
                    list2 = kVar.mo983b();
                    list = kVar.mo984c();
                    int size = a != null ? a.size() : 0;
                    for (int i = 0; i < size; i++) {
                        Fragment fragment = (Fragment) a.get(i);
                        if (f536a) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("restoreAllState: re-attaching retained ");
                            sb.append(fragment);
                            Log.v("FragmentManager", sb.toString());
                        }
                        int i2 = 0;
                        while (i2 < fragmentManagerState.f415a.length && fragmentManagerState.f415a[i2].f421b != fragment.f364o) {
                            i2++;
                        }
                        if (i2 == fragmentManagerState.f415a.length) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("Could not find active fragment with index ");
                            sb2.append(fragment.f364o);
                            m857a((RuntimeException) new IllegalStateException(sb2.toString()));
                        }
                        FragmentState fragmentState = fragmentManagerState.f415a[i2];
                        fragmentState.f431l = fragment;
                        fragment.f362m = null;
                        fragment.f328A = 0;
                        fragment.f373x = false;
                        fragment.f370u = false;
                        fragment.f367r = null;
                        if (fragmentState.f430k != null) {
                            fragmentState.f430k.setClassLoader(this.f555m.mo862g().getClassLoader());
                            fragment.f362m = fragmentState.f430k.getSparseParcelableArray("android:view_state");
                            fragment.f361l = fragmentState.f430k;
                        }
                    }
                } else {
                    list2 = null;
                    list = null;
                }
                this.f548f = new SparseArray<>(fragmentManagerState.f415a.length);
                int i3 = 0;
                while (i3 < fragmentManagerState.f415a.length) {
                    FragmentState fragmentState2 = fragmentManagerState.f415a[i3];
                    if (fragmentState2 != null) {
                        Fragment a2 = fragmentState2.mo715a(this.f555m, this.f556n, this.f557o, (list2 == null || i3 >= list2.size()) ? null : (C0274k) list2.get(i3), (list == null || i3 >= list.size()) ? null : (C0116p) list.get(i3));
                        if (f536a) {
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append("restoreAllState: active #");
                            sb3.append(i3);
                            sb3.append(": ");
                            sb3.append(a2);
                            Log.v("FragmentManager", sb3.toString());
                        }
                        this.f548f.put(a2.f364o, a2);
                        fragmentState2.f431l = null;
                    }
                    i3++;
                }
                if (kVar != null) {
                    List a3 = kVar.mo982a();
                    int size2 = a3 != null ? a3.size() : 0;
                    for (int i4 = 0; i4 < size2; i4++) {
                        Fragment fragment2 = (Fragment) a3.get(i4);
                        if (fragment2.f368s >= 0) {
                            fragment2.f367r = (Fragment) this.f548f.get(fragment2.f368s);
                            if (fragment2.f367r == null) {
                                StringBuilder sb4 = new StringBuilder();
                                sb4.append("Re-attaching retained fragment ");
                                sb4.append(fragment2);
                                sb4.append(" target no longer exists: ");
                                sb4.append(fragment2.f368s);
                                Log.w("FragmentManager", sb4.toString());
                            }
                        }
                    }
                }
                this.f547e.clear();
                if (fragmentManagerState.f416b != null) {
                    for (int i5 = 0; i5 < fragmentManagerState.f416b.length; i5++) {
                        Fragment fragment3 = (Fragment) this.f548f.get(fragmentManagerState.f416b[i5]);
                        if (fragment3 == null) {
                            StringBuilder sb5 = new StringBuilder();
                            sb5.append("No instantiated fragment for index #");
                            sb5.append(fragmentManagerState.f416b[i5]);
                            m857a((RuntimeException) new IllegalStateException(sb5.toString()));
                        }
                        fragment3.f370u = true;
                        if (f536a) {
                            StringBuilder sb6 = new StringBuilder();
                            sb6.append("restoreAllState: added #");
                            sb6.append(i5);
                            sb6.append(": ");
                            sb6.append(fragment3);
                            Log.v("FragmentManager", sb6.toString());
                        }
                        if (this.f547e.contains(fragment3)) {
                            throw new IllegalStateException("Already added!");
                        }
                        synchronized (this.f547e) {
                            this.f547e.add(fragment3);
                        }
                    }
                }
                if (fragmentManagerState.f417c != null) {
                    this.f549g = new ArrayList<>(fragmentManagerState.f417c.length);
                    for (int i6 = 0; i6 < fragmentManagerState.f417c.length; i6++) {
                        C0246c a4 = fragmentManagerState.f417c[i6].mo515a(this);
                        if (f536a) {
                            StringBuilder sb7 = new StringBuilder();
                            sb7.append("restoreAllState: back stack #");
                            sb7.append(i6);
                            sb7.append(" (index ");
                            sb7.append(a4.f498m);
                            sb7.append("): ");
                            sb7.append(a4);
                            Log.v("FragmentManager", sb7.toString());
                            PrintWriter printWriter = new PrintWriter(new C0382e("FragmentManager"));
                            a4.mo812a("  ", printWriter, false);
                            printWriter.close();
                        }
                        this.f549g.add(a4);
                        if (a4.f498m >= 0) {
                            mo892a(a4.f498m, a4);
                        }
                    }
                } else {
                    this.f549g = null;
                }
                if (fragmentManagerState.f418d >= 0) {
                    this.f558p = (Fragment) this.f548f.get(fragmentManagerState.f418d);
                }
                this.f546d = fragmentManagerState.f419e;
            }
        }
    }

    /* renamed from: D */
    private void m849D() {
        if (this.f548f != null) {
            for (int size = this.f548f.size() - 1; size >= 0; size--) {
                if (this.f548f.valueAt(size) == null) {
                    this.f548f.delete(this.f548f.keyAt(size));
                }
            }
        }
    }

    /* renamed from: a */
    public void mo904a(C0253h hVar, C0251f fVar, Fragment fragment) {
        if (this.f555m != null) {
            throw new IllegalStateException("Already attached");
        }
        this.f555m = hVar;
        this.f556n = fVar;
        this.f557o = fragment;
    }

    /* renamed from: n */
    public void mo950n() {
        this.f541D = null;
        this.f560s = false;
        this.f561t = false;
        int size = this.f547e.size();
        for (int i = 0; i < size; i++) {
            Fragment fragment = (Fragment) this.f547e.get(i);
            if (fragment != null) {
                fragment.mo545R();
            }
        }
    }

    /* renamed from: o */
    public void mo951o() {
        this.f560s = false;
        this.f561t = false;
        m872e(1);
    }

    /* renamed from: p */
    public void mo955p() {
        this.f560s = false;
        this.f561t = false;
        m872e(2);
    }

    /* renamed from: q */
    public void mo956q() {
        this.f560s = false;
        this.f561t = false;
        m872e(3);
    }

    /* renamed from: r */
    public void mo957r() {
        this.f560s = false;
        this.f561t = false;
        m872e(4);
    }

    /* renamed from: s */
    public void mo958s() {
        m872e(3);
    }

    /* renamed from: t */
    public void mo959t() {
        this.f561t = true;
        m872e(2);
    }

    /* renamed from: u */
    public void mo961u() {
        m872e(1);
    }

    /* renamed from: v */
    public void mo962v() {
        this.f562u = true;
        mo938h();
        m872e(0);
        this.f555m = null;
        this.f556n = null;
        this.f557o = null;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: e */
    private void m872e(int i) {
        try {
            this.f545c = true;
            mo893a(i, false);
            this.f545c = false;
            mo938h();
        } catch (Throwable th) {
            this.f545c = false;
            throw th;
        }
    }

    /* renamed from: a */
    public void mo906a(boolean z) {
        for (int size = this.f547e.size() - 1; size >= 0; size--) {
            Fragment fragment = (Fragment) this.f547e.get(size);
            if (fragment != null) {
                fragment.mo614h(z);
            }
        }
    }

    /* renamed from: b */
    public void mo918b(boolean z) {
        for (int size = this.f547e.size() - 1; size >= 0; size--) {
            Fragment fragment = (Fragment) this.f547e.get(size);
            if (fragment != null) {
                fragment.mo617i(z);
            }
        }
    }

    /* renamed from: a */
    public void mo894a(Configuration configuration) {
        for (int i = 0; i < this.f547e.size(); i++) {
            Fragment fragment = (Fragment) this.f547e.get(i);
            if (fragment != null) {
                fragment.mo570a(configuration);
            }
        }
    }

    /* renamed from: w */
    public void mo963w() {
        for (int i = 0; i < this.f547e.size(); i++) {
            Fragment fragment = (Fragment) this.f547e.get(i);
            if (fragment != null) {
                fragment.mo546S();
            }
        }
    }

    /* renamed from: a */
    public boolean mo908a(Menu menu, MenuInflater menuInflater) {
        if (this.f554l < 1) {
            return false;
        }
        ArrayList<Fragment> arrayList = null;
        boolean z = false;
        for (int i = 0; i < this.f547e.size(); i++) {
            Fragment fragment = (Fragment) this.f547e.get(i);
            if (fragment != null && fragment.mo593b(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(fragment);
                z = true;
            }
        }
        if (this.f550h != null) {
            for (int i2 = 0; i2 < this.f550h.size(); i2++) {
                Fragment fragment2 = (Fragment) this.f550h.get(i2);
                if (arrayList == null || !arrayList.contains(fragment2)) {
                    fragment2.mo531D();
                }
            }
        }
        this.f550h = arrayList;
        return z;
    }

    /* renamed from: a */
    public boolean mo907a(Menu menu) {
        if (this.f554l < 1) {
            return false;
        }
        boolean z = false;
        for (int i = 0; i < this.f547e.size(); i++) {
            Fragment fragment = (Fragment) this.f547e.get(i);
            if (fragment != null && fragment.mo596c(menu)) {
                z = true;
            }
        }
        return z;
    }

    /* renamed from: a */
    public boolean mo909a(MenuItem menuItem) {
        if (this.f554l < 1) {
            return false;
        }
        for (int i = 0; i < this.f547e.size(); i++) {
            Fragment fragment = (Fragment) this.f547e.get(i);
            if (fragment != null && fragment.mo597c(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public boolean mo920b(MenuItem menuItem) {
        if (this.f554l < 1) {
            return false;
        }
        for (int i = 0; i < this.f547e.size(); i++) {
            Fragment fragment = (Fragment) this.f547e.get(i);
            if (fragment != null && fragment.mo601d(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public void mo917b(Menu menu) {
        if (this.f554l >= 1) {
            for (int i = 0; i < this.f547e.size(); i++) {
                Fragment fragment = (Fragment) this.f547e.get(i);
                if (fragment != null) {
                    fragment.mo599d(menu);
                }
            }
        }
    }

    /* renamed from: o */
    public void mo952o(Fragment fragment) {
        if (fragment == null || (this.f548f.get(fragment.f364o) == fragment && (fragment.f330C == null || fragment.mo630o() == this))) {
            this.f558p = fragment;
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append(fragment);
        sb.append(" is not an active fragment of FragmentManager ");
        sb.append(this);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: x */
    public Fragment mo964x() {
        return this.f558p;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo899a(Fragment fragment, Context context, boolean z) {
        if (this.f557o != null) {
            C0254i o = this.f557o.mo630o();
            if (o instanceof C0257j) {
                ((C0257j) o).mo899a(fragment, context, true);
            }
        }
        Iterator it = this.f543J.iterator();
        while (it.hasNext()) {
            C0269f fVar = (C0269f) it.next();
            if (!z || fVar.f593b) {
                fVar.f592a.mo875a((C0254i) this, fragment, context);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo913b(Fragment fragment, Context context, boolean z) {
        if (this.f557o != null) {
            C0254i o = this.f557o.mo630o();
            if (o instanceof C0257j) {
                ((C0257j) o).mo913b(fragment, context, true);
            }
        }
        Iterator it = this.f543J.iterator();
        while (it.hasNext()) {
            C0269f fVar = (C0269f) it.next();
            if (!z || fVar.f593b) {
                fVar.f592a.mo879b((C0254i) this, fragment, context);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo900a(Fragment fragment, Bundle bundle, boolean z) {
        if (this.f557o != null) {
            C0254i o = this.f557o.mo630o();
            if (o instanceof C0257j) {
                ((C0257j) o).mo900a(fragment, bundle, true);
            }
        }
        Iterator it = this.f543J.iterator();
        while (it.hasNext()) {
            C0269f fVar = (C0269f) it.next();
            if (!z || fVar.f593b) {
                fVar.f592a.mo876a((C0254i) this, fragment, bundle);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo914b(Fragment fragment, Bundle bundle, boolean z) {
        if (this.f557o != null) {
            C0254i o = this.f557o.mo630o();
            if (o instanceof C0257j) {
                ((C0257j) o).mo914b(fragment, bundle, true);
            }
        }
        Iterator it = this.f543J.iterator();
        while (it.hasNext()) {
            C0269f fVar = (C0269f) it.next();
            if (!z || fVar.f593b) {
                fVar.f592a.mo880b((C0254i) this, fragment, bundle);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo923c(Fragment fragment, Bundle bundle, boolean z) {
        if (this.f557o != null) {
            C0254i o = this.f557o.mo630o();
            if (o instanceof C0257j) {
                ((C0257j) o).mo923c(fragment, bundle, true);
            }
        }
        Iterator it = this.f543J.iterator();
        while (it.hasNext()) {
            C0269f fVar = (C0269f) it.next();
            if (!z || fVar.f593b) {
                fVar.f592a.mo882c(this, fragment, bundle);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo901a(Fragment fragment, View view, Bundle bundle, boolean z) {
        if (this.f557o != null) {
            C0254i o = this.f557o.mo630o();
            if (o instanceof C0257j) {
                ((C0257j) o).mo901a(fragment, view, bundle, true);
            }
        }
        Iterator it = this.f543J.iterator();
        while (it.hasNext()) {
            C0269f fVar = (C0269f) it.next();
            if (!z || fVar.f593b) {
                fVar.f592a.mo877a(this, fragment, view, bundle);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo915b(Fragment fragment, boolean z) {
        if (this.f557o != null) {
            C0254i o = this.f557o.mo630o();
            if (o instanceof C0257j) {
                ((C0257j) o).mo915b(fragment, true);
            }
        }
        Iterator it = this.f543J.iterator();
        while (it.hasNext()) {
            C0269f fVar = (C0269f) it.next();
            if (!z || fVar.f593b) {
                fVar.f592a.mo874a(this, fragment);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo924c(Fragment fragment, boolean z) {
        if (this.f557o != null) {
            C0254i o = this.f557o.mo630o();
            if (o instanceof C0257j) {
                ((C0257j) o).mo924c(fragment, true);
            }
        }
        Iterator it = this.f543J.iterator();
        while (it.hasNext()) {
            C0269f fVar = (C0269f) it.next();
            if (!z || fVar.f593b) {
                fVar.f592a.mo878b(this, fragment);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public void mo927d(Fragment fragment, boolean z) {
        if (this.f557o != null) {
            C0254i o = this.f557o.mo630o();
            if (o instanceof C0257j) {
                ((C0257j) o).mo927d(fragment, true);
            }
        }
        Iterator it = this.f543J.iterator();
        while (it.hasNext()) {
            C0269f fVar = (C0269f) it.next();
            if (!z || fVar.f593b) {
                fVar.f592a.mo881c(this, fragment);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public void mo929e(Fragment fragment, boolean z) {
        if (this.f557o != null) {
            C0254i o = this.f557o.mo630o();
            if (o instanceof C0257j) {
                ((C0257j) o).mo929e(fragment, true);
            }
        }
        Iterator it = this.f543J.iterator();
        while (it.hasNext()) {
            C0269f fVar = (C0269f) it.next();
            if (!z || fVar.f593b) {
                fVar.f592a.mo883d(this, fragment);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public void mo926d(Fragment fragment, Bundle bundle, boolean z) {
        if (this.f557o != null) {
            C0254i o = this.f557o.mo630o();
            if (o instanceof C0257j) {
                ((C0257j) o).mo926d(fragment, bundle, true);
            }
        }
        Iterator it = this.f543J.iterator();
        while (it.hasNext()) {
            C0269f fVar = (C0269f) it.next();
            if (!z || fVar.f593b) {
                fVar.f592a.mo884d(this, fragment, bundle);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public void mo932f(Fragment fragment, boolean z) {
        if (this.f557o != null) {
            C0254i o = this.f557o.mo630o();
            if (o instanceof C0257j) {
                ((C0257j) o).mo932f(fragment, true);
            }
        }
        Iterator it = this.f543J.iterator();
        while (it.hasNext()) {
            C0269f fVar = (C0269f) it.next();
            if (!z || fVar.f593b) {
                fVar.f592a.mo885e(this, fragment);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public void mo935g(Fragment fragment, boolean z) {
        if (this.f557o != null) {
            C0254i o = this.f557o.mo630o();
            if (o instanceof C0257j) {
                ((C0257j) o).mo935g(fragment, true);
            }
        }
        Iterator it = this.f543J.iterator();
        while (it.hasNext()) {
            C0269f fVar = (C0269f) it.next();
            if (!z || fVar.f593b) {
                fVar.f592a.mo886f(this, fragment);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public void mo937h(Fragment fragment, boolean z) {
        if (this.f557o != null) {
            C0254i o = this.f557o.mo630o();
            if (o instanceof C0257j) {
                ((C0257j) o).mo937h(fragment, true);
            }
        }
        Iterator it = this.f543J.iterator();
        while (it.hasNext()) {
            C0269f fVar = (C0269f) it.next();
            if (!z || fVar.f593b) {
                fVar.f592a.mo887g(this, fragment);
            }
        }
    }

    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        Fragment fragment;
        Context context2 = context;
        AttributeSet attributeSet2 = attributeSet;
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet2.getAttributeValue(null, "class");
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet2, C0270g.f594a);
        int i = 0;
        if (attributeValue == null) {
            attributeValue = obtainStyledAttributes.getString(0);
        }
        String str2 = attributeValue;
        int resourceId = obtainStyledAttributes.getResourceId(1, -1);
        String string = obtainStyledAttributes.getString(2);
        obtainStyledAttributes.recycle();
        if (!Fragment.m500a(this.f555m.mo862g(), str2)) {
            return null;
        }
        if (view != null) {
            i = view.getId();
        }
        if (i == -1 && resourceId == -1 && string == null) {
            StringBuilder sb = new StringBuilder();
            sb.append(attributeSet.getPositionDescription());
            sb.append(": Must specify unique android:id, android:tag, or have a parent with an id for ");
            sb.append(str2);
            throw new IllegalArgumentException(sb.toString());
        }
        Fragment a = resourceId != -1 ? mo865a(resourceId) : null;
        if (a == null && string != null) {
            a = mo866a(string);
        }
        if (a == null && i != -1) {
            a = mo865a(i);
        }
        if (f536a) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("onCreateView: id=0x");
            sb2.append(Integer.toHexString(resourceId));
            sb2.append(" fname=");
            sb2.append(str2);
            sb2.append(" existing=");
            sb2.append(a);
            Log.v("FragmentManager", sb2.toString());
        }
        if (a == null) {
            Fragment a2 = this.f556n.mo648a(context2, str2, null);
            a2.f372w = true;
            a2.f335H = resourceId != 0 ? resourceId : i;
            a2.f336I = i;
            a2.f337J = string;
            a2.f373x = true;
            a2.f329B = this;
            a2.f330C = this.f555m;
            a2.mo566a(this.f555m.mo862g(), attributeSet2, a2.f361l);
            mo902a(a2, true);
            fragment = a2;
        } else if (a.f373x) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(attributeSet.getPositionDescription());
            sb3.append(": Duplicate id 0x");
            sb3.append(Integer.toHexString(resourceId));
            sb3.append(", tag ");
            sb3.append(string);
            sb3.append(", or parent id 0x");
            sb3.append(Integer.toHexString(i));
            sb3.append(" with another fragment for ");
            sb3.append(str2);
            throw new IllegalArgumentException(sb3.toString());
        } else {
            a.f373x = true;
            a.f330C = this.f555m;
            if (!a.f341N) {
                a.mo566a(this.f555m.mo862g(), attributeSet2, a.f361l);
            }
            fragment = a;
        }
        if (this.f554l >= 1 || !fragment.f372w) {
            mo912b(fragment);
        } else {
            mo898a(fragment, 1, 0, 0, false);
        }
        if (fragment.f346S == null) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append("Fragment ");
            sb4.append(str2);
            sb4.append(" did not create a view.");
            throw new IllegalStateException(sb4.toString());
        }
        if (resourceId != 0) {
            fragment.f346S.setId(resourceId);
        }
        if (fragment.f346S.getTag() == null) {
            fragment.f346S.setTag(string);
        }
        return fragment.f346S;
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
