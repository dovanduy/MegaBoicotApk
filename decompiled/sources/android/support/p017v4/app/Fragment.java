package android.support.p017v4.app;

import android.animation.Animator;
import android.app.Activity;
import android.arch.lifecycle.C0097c;
import android.arch.lifecycle.C0097c.C0098a;
import android.arch.lifecycle.C0101e;
import android.arch.lifecycle.C0102f;
import android.arch.lifecycle.C0108j;
import android.arch.lifecycle.C0116p;
import android.arch.lifecycle.C0117q;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.support.p017v4.p023d.C0381d;
import android.support.p017v4.p023d.C0398m;
import android.support.p017v4.view.C0582e;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnCreateContextMenuListener;
import android.view.ViewGroup;
import android.view.animation.Animation;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;

/* renamed from: android.support.v4.app.Fragment */
public class Fragment implements C0101e, C0117q, ComponentCallbacks, OnCreateContextMenuListener {

    /* renamed from: a */
    private static final C0398m<String, Class<?>> f326a = new C0398m<>();

    /* renamed from: j */
    static final Object f327j = new Object();

    /* renamed from: A */
    int f328A;

    /* renamed from: B */
    C0257j f329B;

    /* renamed from: C */
    C0253h f330C;

    /* renamed from: D */
    C0257j f331D;

    /* renamed from: E */
    C0274k f332E;

    /* renamed from: F */
    C0116p f333F;

    /* renamed from: G */
    Fragment f334G;

    /* renamed from: H */
    int f335H;

    /* renamed from: I */
    int f336I;

    /* renamed from: J */
    String f337J;

    /* renamed from: K */
    boolean f338K;

    /* renamed from: L */
    boolean f339L;

    /* renamed from: M */
    boolean f340M;

    /* renamed from: N */
    boolean f341N;

    /* renamed from: O */
    boolean f342O;

    /* renamed from: P */
    boolean f343P = true;

    /* renamed from: Q */
    boolean f344Q;

    /* renamed from: R */
    ViewGroup f345R;

    /* renamed from: S */
    View f346S;

    /* renamed from: T */
    View f347T;

    /* renamed from: U */
    boolean f348U;

    /* renamed from: V */
    boolean f349V = true;

    /* renamed from: W */
    C0214a f350W;

    /* renamed from: X */
    boolean f351X;

    /* renamed from: Y */
    boolean f352Y;

    /* renamed from: Z */
    float f353Z;

    /* renamed from: aa */
    LayoutInflater f354aa;

    /* renamed from: ab */
    boolean f355ab;

    /* renamed from: ac */
    C0102f f356ac = new C0102f(this);

    /* renamed from: ad */
    C0102f f357ad;

    /* renamed from: ae */
    C0101e f358ae;

    /* renamed from: af */
    C0108j<C0101e> f359af = new C0108j<>();

    /* renamed from: k */
    int f360k = 0;

    /* renamed from: l */
    Bundle f361l;

    /* renamed from: m */
    SparseArray<Parcelable> f362m;

    /* renamed from: n */
    Boolean f363n;

    /* renamed from: o */
    int f364o = -1;

    /* renamed from: p */
    String f365p;

    /* renamed from: q */
    Bundle f366q;

    /* renamed from: r */
    Fragment f367r;

    /* renamed from: s */
    int f368s = -1;

    /* renamed from: t */
    int f369t;

    /* renamed from: u */
    boolean f370u;

    /* renamed from: v */
    boolean f371v;

    /* renamed from: w */
    boolean f372w;

    /* renamed from: x */
    boolean f373x;

    /* renamed from: y */
    boolean f374y;

    /* renamed from: z */
    boolean f375z;

    /* renamed from: android.support.v4.app.Fragment$SavedState */
    public static class SavedState implements Parcelable {
        public static final Creator<SavedState> CREATOR = new ClassLoaderCreator<SavedState>() {
            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            /* renamed from: a */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        };

        /* renamed from: a */
        final Bundle f379a;

        public int describeContents() {
            return 0;
        }

        SavedState(Parcel parcel, ClassLoader classLoader) {
            this.f379a = parcel.readBundle();
            if (classLoader != null && this.f379a != null) {
                this.f379a.setClassLoader(classLoader);
            }
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeBundle(this.f379a);
        }
    }

    /* renamed from: android.support.v4.app.Fragment$a */
    static class C0214a {

        /* renamed from: a */
        View f380a;

        /* renamed from: b */
        Animator f381b;

        /* renamed from: c */
        int f382c;

        /* renamed from: d */
        int f383d;

        /* renamed from: e */
        int f384e;

        /* renamed from: f */
        int f385f;

        /* renamed from: g */
        Object f386g = null;

        /* renamed from: h */
        Object f387h = Fragment.f327j;

        /* renamed from: i */
        Object f388i = null;

        /* renamed from: j */
        Object f389j = Fragment.f327j;

        /* renamed from: k */
        Object f390k = null;

        /* renamed from: l */
        Object f391l = Fragment.f327j;

        /* renamed from: m */
        Boolean f392m;

        /* renamed from: n */
        Boolean f393n;

        /* renamed from: o */
        C0241aa f394o = null;

        /* renamed from: p */
        C0241aa f395p = null;

        /* renamed from: q */
        boolean f396q;

        /* renamed from: r */
        C0216c f397r;

        /* renamed from: s */
        boolean f398s;

        C0214a() {
        }
    }

    /* renamed from: android.support.v4.app.Fragment$b */
    public static class C0215b extends RuntimeException {
        public C0215b(String str, Exception exc) {
            super(str, exc);
        }
    }

    /* renamed from: android.support.v4.app.Fragment$c */
    interface C0216c {
        /* renamed from: a */
        void mo659a();

        /* renamed from: b */
        void mo660b();
    }

    /* renamed from: D */
    public void mo531D() {
    }

    /* renamed from: a */
    public View mo555a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return null;
    }

    /* renamed from: a */
    public Animation mo556a(int i, boolean z, int i2) {
        return null;
    }

    /* renamed from: a */
    public void mo559a(int i, int i2, Intent intent) {
    }

    /* renamed from: a */
    public void mo561a(int i, String[] strArr, int[] iArr) {
    }

    /* renamed from: a */
    public void mo573a(Fragment fragment) {
    }

    /* renamed from: a */
    public void mo574a(Menu menu) {
    }

    /* renamed from: a */
    public void mo575a(Menu menu, MenuInflater menuInflater) {
    }

    /* renamed from: a */
    public void mo577a(View view, Bundle bundle) {
    }

    /* renamed from: a */
    public boolean mo579a(MenuItem menuItem) {
        return false;
    }

    /* renamed from: b */
    public Animator mo588b(int i, boolean z, int i2) {
        return null;
    }

    /* renamed from: b */
    public void mo592b(Menu menu) {
    }

    /* renamed from: b */
    public boolean mo594b(MenuItem menuItem) {
        return false;
    }

    /* renamed from: d */
    public void mo600d(boolean z) {
    }

    /* renamed from: e */
    public void mo603e(Bundle bundle) {
    }

    /* renamed from: f */
    public void mo608f(boolean z) {
    }

    /* renamed from: g */
    public void mo611g(boolean z) {
    }

    /* renamed from: a */
    public C0097c mo139a() {
        return this.f356ac;
    }

    /* renamed from: b */
    public C0116p mo162b() {
        if (mo622k() == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (this.f333F == null) {
            this.f333F = new C0116p();
        }
        return this.f333F;
    }

    /* renamed from: a */
    public static Fragment m499a(Context context, String str, Bundle bundle) {
        try {
            Class cls = (Class) f326a.get(str);
            if (cls == null) {
                cls = context.getClassLoader().loadClass(str);
                f326a.put(str, cls);
            }
            Fragment fragment = (Fragment) cls.getConstructor(new Class[0]).newInstance(new Object[0]);
            if (bundle != null) {
                bundle.setClassLoader(fragment.getClass().getClassLoader());
                fragment.mo610g(bundle);
            }
            return fragment;
        } catch (ClassNotFoundException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Unable to instantiate fragment ");
            sb.append(str);
            sb.append(": make sure class name exists, is public, and has an");
            sb.append(" empty constructor that is public");
            throw new C0215b(sb.toString(), e);
        } catch (InstantiationException e2) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Unable to instantiate fragment ");
            sb2.append(str);
            sb2.append(": make sure class name exists, is public, and has an");
            sb2.append(" empty constructor that is public");
            throw new C0215b(sb2.toString(), e2);
        } catch (IllegalAccessException e3) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Unable to instantiate fragment ");
            sb3.append(str);
            sb3.append(": make sure class name exists, is public, and has an");
            sb3.append(" empty constructor that is public");
            throw new C0215b(sb3.toString(), e3);
        } catch (NoSuchMethodException e4) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append("Unable to instantiate fragment ");
            sb4.append(str);
            sb4.append(": could not find Fragment constructor");
            throw new C0215b(sb4.toString(), e4);
        } catch (InvocationTargetException e5) {
            StringBuilder sb5 = new StringBuilder();
            sb5.append("Unable to instantiate fragment ");
            sb5.append(str);
            sb5.append(": calling Fragment constructor caused an exception");
            throw new C0215b(sb5.toString(), e5);
        }
    }

    /* renamed from: a */
    static boolean m500a(Context context, String str) {
        try {
            Class cls = (Class) f326a.get(str);
            if (cls == null) {
                cls = context.getClassLoader().loadClass(str);
                f326a.put(str, cls);
            }
            return Fragment.class.isAssignableFrom(cls);
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public final void mo607f(Bundle bundle) {
        if (this.f362m != null) {
            this.f347T.restoreHierarchyState(this.f362m);
            this.f362m = null;
        }
        this.f344Q = false;
        mo623k(bundle);
        if (!this.f344Q) {
            StringBuilder sb = new StringBuilder();
            sb.append("Fragment ");
            sb.append(this);
            sb.append(" did not call through to super.onViewStateRestored()");
            throw new C0242ab(sb.toString());
        } else if (this.f346S != null) {
            this.f357ad.mo140a(C0098a.ON_CREATE);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo560a(int i, Fragment fragment) {
        this.f364o = i;
        if (fragment != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(fragment.f365p);
            sb.append(":");
            sb.append(this.f364o);
            this.f365p = sb.toString();
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("android:fragment:");
        sb2.append(this.f364o);
        this.f365p = sb2.toString();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public final boolean mo618i() {
        return this.f328A > 0;
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        C0381d.m1417a(this, sb);
        if (this.f364o >= 0) {
            sb.append(" #");
            sb.append(this.f364o);
        }
        if (this.f335H != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f335H));
        }
        if (this.f337J != null) {
            sb.append(" ");
            sb.append(this.f337J);
        }
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: g */
    public void mo610g(Bundle bundle) {
        if (this.f364o < 0 || !mo621j()) {
            this.f366q = bundle;
            return;
        }
        throw new IllegalStateException("Fragment already active and state has been saved");
    }

    /* renamed from: j */
    public final boolean mo621j() {
        if (this.f329B == null) {
            return false;
        }
        return this.f329B.mo873e();
    }

    /* renamed from: k */
    public Context mo622k() {
        if (this.f330C == null) {
            return null;
        }
        return this.f330C.mo862g();
    }

    /* renamed from: l */
    public final Context mo624l() {
        Context k = mo622k();
        if (k != null) {
            return k;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append(this);
        sb.append(" not attached to a context.");
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: m */
    public final FragmentActivity mo626m() {
        if (this.f330C == null) {
            return null;
        }
        return (FragmentActivity) this.f330C.mo861f();
    }

    /* renamed from: n */
    public final Resources mo628n() {
        return mo624l().getResources();
    }

    /* renamed from: a */
    public final String mo557a(int i) {
        return mo628n().getString(i);
    }

    /* renamed from: o */
    public final C0254i mo630o() {
        return this.f329B;
    }

    /* renamed from: p */
    public final C0254i mo634p() {
        if (this.f331D == null) {
            mo542O();
            if (this.f360k >= 4) {
                this.f331D.mo957r();
            } else if (this.f360k >= 3) {
                this.f331D.mo956q();
            } else if (this.f360k >= 2) {
                this.f331D.mo955p();
            } else if (this.f360k >= 1) {
                this.f331D.mo951o();
            }
        }
        return this.f331D;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: q */
    public C0254i mo635q() {
        return this.f331D;
    }

    /* renamed from: r */
    public final boolean mo636r() {
        return this.f330C != null && this.f370u;
    }

    /* renamed from: s */
    public final boolean mo637s() {
        return this.f339L;
    }

    /* renamed from: t */
    public final boolean mo639t() {
        return this.f371v;
    }

    /* renamed from: u */
    public final boolean mo641u() {
        return this.f373x;
    }

    /* renamed from: v */
    public final boolean mo642v() {
        return this.f360k >= 4;
    }

    /* renamed from: e */
    public void mo604e(boolean z) {
        this.f340M = z;
    }

    /* renamed from: w */
    public final boolean mo643w() {
        return this.f340M;
    }

    @Deprecated
    /* renamed from: x */
    public C0297r mo644x() {
        return C0297r.m1065a(this);
    }

    /* renamed from: a */
    public void mo567a(Intent intent) {
        mo569a(intent, (Bundle) null);
    }

    /* renamed from: a */
    public void mo569a(Intent intent, Bundle bundle) {
        if (this.f330C == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("Fragment ");
            sb.append(this);
            sb.append(" not attached to Activity");
            throw new IllegalStateException(sb.toString());
        }
        this.f330C.mo701a(this, intent, -1, bundle);
    }

    public void startActivityForResult(Intent intent, int i) {
        mo568a(intent, i, (Bundle) null);
    }

    /* renamed from: a */
    public void mo568a(Intent intent, int i, Bundle bundle) {
        if (this.f330C == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("Fragment ");
            sb.append(this);
            sb.append(" not attached to Activity");
            throw new IllegalStateException(sb.toString());
        }
        this.f330C.mo701a(this, intent, i, bundle);
    }

    /* renamed from: b */
    public LayoutInflater mo589b(Bundle bundle) {
        return mo616i(bundle);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public LayoutInflater mo612h(Bundle bundle) {
        this.f354aa = mo589b(bundle);
        return this.f354aa;
    }

    @Deprecated
    /* renamed from: i */
    public LayoutInflater mo616i(Bundle bundle) {
        if (this.f330C == null) {
            throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
        }
        LayoutInflater b = this.f330C.mo704b();
        mo634p();
        C0582e.m2188a(b, this.f331D.mo965y());
        return b;
    }

    /* renamed from: a */
    public void mo566a(Context context, AttributeSet attributeSet, Bundle bundle) {
        this.f344Q = true;
        Activity f = this.f330C == null ? null : this.f330C.mo861f();
        if (f != null) {
            this.f344Q = false;
            mo564a(f, attributeSet, bundle);
        }
    }

    @Deprecated
    /* renamed from: a */
    public void mo564a(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        this.f344Q = true;
    }

    /* renamed from: a */
    public void mo565a(Context context) {
        this.f344Q = true;
        Activity f = this.f330C == null ? null : this.f330C.mo861f();
        if (f != null) {
            this.f344Q = false;
            mo563a(f);
        }
    }

    @Deprecated
    /* renamed from: a */
    public void mo563a(Activity activity) {
        this.f344Q = true;
    }

    /* renamed from: a */
    public void mo571a(Bundle bundle) {
        this.f344Q = true;
        mo619j(bundle);
        if (this.f331D != null && !this.f331D.mo919b(1)) {
            this.f331D.mo951o();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public void mo619j(Bundle bundle) {
        if (bundle != null) {
            Parcelable parcelable = bundle.getParcelable("android:support:fragments");
            if (parcelable != null) {
                if (this.f331D == null) {
                    mo542O();
                }
                this.f331D.mo896a(parcelable, this.f332E);
                this.f332E = null;
                this.f331D.mo951o();
            }
        }
    }

    /* renamed from: y */
    public View mo645y() {
        return this.f346S;
    }

    /* renamed from: d */
    public void mo598d(Bundle bundle) {
        this.f344Q = true;
    }

    /* renamed from: k */
    public void mo623k(Bundle bundle) {
        this.f344Q = true;
    }

    /* renamed from: f */
    public void mo606f() {
        this.f344Q = true;
    }

    /* renamed from: z */
    public void mo646z() {
        this.f344Q = true;
    }

    public void onConfigurationChanged(Configuration configuration) {
        this.f344Q = true;
    }

    /* renamed from: A */
    public void mo528A() {
        this.f344Q = true;
    }

    /* renamed from: g */
    public void mo609g() {
        this.f344Q = true;
    }

    public void onLowMemory() {
        this.f344Q = true;
    }

    /* renamed from: h */
    public void mo613h() {
        this.f344Q = true;
    }

    /* renamed from: B */
    public void mo529B() {
        boolean z = true;
        this.f344Q = true;
        FragmentActivity m = mo626m();
        if (m == null || !m.isChangingConfigurations()) {
            z = false;
        }
        if (this.f333F != null && !z) {
            this.f333F.mo160a();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: C */
    public void mo530C() {
        this.f364o = -1;
        this.f365p = null;
        this.f370u = false;
        this.f371v = false;
        this.f372w = false;
        this.f373x = false;
        this.f374y = false;
        this.f328A = 0;
        this.f329B = null;
        this.f331D = null;
        this.f330C = null;
        this.f335H = 0;
        this.f336I = 0;
        this.f337J = null;
        this.f338K = false;
        this.f339L = false;
        this.f341N = false;
    }

    /* renamed from: e */
    public void mo602e() {
        this.f344Q = true;
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenuInfo contextMenuInfo) {
        mo626m().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    /* renamed from: E */
    public Object mo532E() {
        if (this.f350W == null) {
            return null;
        }
        return this.f350W.f386g;
    }

    /* renamed from: F */
    public Object mo533F() {
        if (this.f350W == null) {
            return null;
        }
        return this.f350W.f387h == f327j ? mo532E() : this.f350W.f387h;
    }

    /* renamed from: G */
    public Object mo534G() {
        if (this.f350W == null) {
            return null;
        }
        return this.f350W.f388i;
    }

    /* renamed from: H */
    public Object mo535H() {
        if (this.f350W == null) {
            return null;
        }
        return this.f350W.f389j == f327j ? mo534G() : this.f350W.f389j;
    }

    /* renamed from: I */
    public Object mo536I() {
        if (this.f350W == null) {
            return null;
        }
        return this.f350W.f390k;
    }

    /* renamed from: J */
    public Object mo537J() {
        if (this.f350W == null) {
            return null;
        }
        return this.f350W.f391l == f327j ? mo536I() : this.f350W.f391l;
    }

    /* renamed from: K */
    public boolean mo538K() {
        if (this.f350W == null || this.f350W.f393n == null) {
            return true;
        }
        return this.f350W.f393n.booleanValue();
    }

    /* renamed from: L */
    public boolean mo539L() {
        if (this.f350W == null || this.f350W.f392m == null) {
            return true;
        }
        return this.f350W.f392m.booleanValue();
    }

    /* renamed from: M */
    public void mo540M() {
        if (this.f329B == null || this.f329B.f555m == null) {
            mo830c().f396q = false;
        } else if (Looper.myLooper() != this.f329B.f555m.mo863h().getLooper()) {
            this.f329B.f555m.mo863h().postAtFrontOfQueue(new Runnable() {
                public void run() {
                    Fragment.this.mo541N();
                }
            });
        } else {
            mo541N();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: N */
    public void mo541N() {
        C0216c cVar;
        if (this.f350W == null) {
            cVar = null;
        } else {
            this.f350W.f396q = false;
            cVar = this.f350W.f397r;
            this.f350W.f397r = null;
        }
        if (cVar != null) {
            cVar.mo659a();
        }
    }

    /* renamed from: a */
    public void mo578a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.f335H));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.f336I));
        printWriter.print(" mTag=");
        printWriter.println(this.f337J);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.f360k);
        printWriter.print(" mIndex=");
        printWriter.print(this.f364o);
        printWriter.print(" mWho=");
        printWriter.print(this.f365p);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.f328A);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.f370u);
        printWriter.print(" mRemoving=");
        printWriter.print(this.f371v);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.f372w);
        printWriter.print(" mInLayout=");
        printWriter.println(this.f373x);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.f338K);
        printWriter.print(" mDetached=");
        printWriter.print(this.f339L);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.f343P);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.f342O);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.f340M);
        printWriter.print(" mRetaining=");
        printWriter.print(this.f341N);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.f349V);
        if (this.f329B != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.f329B);
        }
        if (this.f330C != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.f330C);
        }
        if (this.f334G != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.f334G);
        }
        if (this.f366q != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.f366q);
        }
        if (this.f361l != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.f361l);
        }
        if (this.f362m != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.f362m);
        }
        if (this.f367r != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(this.f367r);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.f369t);
        }
        if (mo552Y() != 0) {
            printWriter.print(str);
            printWriter.print("mNextAnim=");
            printWriter.println(mo552Y());
        }
        if (this.f345R != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.f345R);
        }
        if (this.f346S != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.f346S);
        }
        if (this.f347T != null) {
            printWriter.print(str);
            printWriter.print("mInnerView=");
            printWriter.println(this.f346S);
        }
        if (mo583ad() != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(mo583ad());
            printWriter.print(str);
            printWriter.print("mStateAfterAnimating=");
            printWriter.println(mo585af());
        }
        if (mo622k() != null) {
            C0297r.m1065a(this).mo766a(str, fileDescriptor, printWriter, strArr);
        }
        if (this.f331D != null) {
            printWriter.print(str);
            StringBuilder sb = new StringBuilder();
            sb.append("Child ");
            sb.append(this.f331D);
            sb.append(":");
            printWriter.println(sb.toString());
            C0257j jVar = this.f331D;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append("  ");
            jVar.mo869a(sb2.toString(), fileDescriptor, printWriter, strArr);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public Fragment mo554a(String str) {
        if (str.equals(this.f365p)) {
            return this;
        }
        if (this.f331D != null) {
            return this.f331D.mo911b(str);
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: O */
    public void mo542O() {
        if (this.f330C == null) {
            throw new IllegalStateException("Fragment has not been attached yet.");
        }
        this.f331D = new C0257j();
        this.f331D.mo904a(this.f330C, (C0251f) new C0251f() {
            /* renamed from: a */
            public View mo649a(int i) {
                if (Fragment.this.f346S != null) {
                    return Fragment.this.f346S.findViewById(i);
                }
                throw new IllegalStateException("Fragment does not have a view");
            }

            /* renamed from: a */
            public boolean mo650a() {
                return Fragment.this.f346S != null;
            }

            /* renamed from: a */
            public Fragment mo648a(Context context, String str, Bundle bundle) {
                return Fragment.this.f330C.mo648a(context, str, bundle);
            }
        }, this);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: l */
    public void mo625l(Bundle bundle) {
        if (this.f331D != null) {
            this.f331D.mo950n();
        }
        this.f360k = 1;
        this.f344Q = false;
        mo571a(bundle);
        this.f355ab = true;
        if (!this.f344Q) {
            StringBuilder sb = new StringBuilder();
            sb.append("Fragment ");
            sb.append(this);
            sb.append(" did not call through to super.onCreate()");
            throw new C0242ab(sb.toString());
        }
        this.f356ac.mo140a(C0098a.ON_CREATE);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo591b(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (this.f331D != null) {
            this.f331D.mo950n();
        }
        this.f375z = true;
        this.f358ae = new C0101e() {
            /* renamed from: a */
            public C0097c mo139a() {
                if (Fragment.this.f357ad == null) {
                    Fragment.this.f357ad = new C0102f(Fragment.this.f358ae);
                }
                return Fragment.this.f357ad;
            }
        };
        this.f357ad = null;
        this.f346S = mo555a(layoutInflater, viewGroup, bundle);
        if (this.f346S != null) {
            this.f358ae.mo139a();
            this.f359af.mo120b(this.f358ae);
        } else if (this.f357ad != null) {
            throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
        } else {
            this.f358ae = null;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: m */
    public void mo627m(Bundle bundle) {
        if (this.f331D != null) {
            this.f331D.mo950n();
        }
        this.f360k = 2;
        this.f344Q = false;
        mo598d(bundle);
        if (!this.f344Q) {
            StringBuilder sb = new StringBuilder();
            sb.append("Fragment ");
            sb.append(this);
            sb.append(" did not call through to super.onActivityCreated()");
            throw new C0242ab(sb.toString());
        } else if (this.f331D != null) {
            this.f331D.mo955p();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: P */
    public void mo543P() {
        if (this.f331D != null) {
            this.f331D.mo950n();
            this.f331D.mo938h();
        }
        this.f360k = 3;
        this.f344Q = false;
        mo606f();
        if (!this.f344Q) {
            StringBuilder sb = new StringBuilder();
            sb.append("Fragment ");
            sb.append(this);
            sb.append(" did not call through to super.onStart()");
            throw new C0242ab(sb.toString());
        }
        if (this.f331D != null) {
            this.f331D.mo956q();
        }
        this.f356ac.mo140a(C0098a.ON_START);
        if (this.f346S != null) {
            this.f357ad.mo140a(C0098a.ON_START);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: Q */
    public void mo544Q() {
        if (this.f331D != null) {
            this.f331D.mo950n();
            this.f331D.mo938h();
        }
        this.f360k = 4;
        this.f344Q = false;
        mo646z();
        if (!this.f344Q) {
            StringBuilder sb = new StringBuilder();
            sb.append("Fragment ");
            sb.append(this);
            sb.append(" did not call through to super.onResume()");
            throw new C0242ab(sb.toString());
        }
        if (this.f331D != null) {
            this.f331D.mo957r();
            this.f331D.mo938h();
        }
        this.f356ac.mo140a(C0098a.ON_RESUME);
        if (this.f346S != null) {
            this.f357ad.mo140a(C0098a.ON_RESUME);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: R */
    public void mo545R() {
        if (this.f331D != null) {
            this.f331D.mo950n();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public void mo614h(boolean z) {
        mo608f(z);
        if (this.f331D != null) {
            this.f331D.mo906a(z);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public void mo617i(boolean z) {
        mo611g(z);
        if (this.f331D != null) {
            this.f331D.mo918b(z);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo570a(Configuration configuration) {
        onConfigurationChanged(configuration);
        if (this.f331D != null) {
            this.f331D.mo894a(configuration);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: S */
    public void mo546S() {
        onLowMemory();
        if (this.f331D != null) {
            this.f331D.mo963w();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public boolean mo593b(Menu menu, MenuInflater menuInflater) {
        boolean z = false;
        if (this.f338K) {
            return false;
        }
        if (this.f342O && this.f343P) {
            z = true;
            mo575a(menu, menuInflater);
        }
        return this.f331D != null ? z | this.f331D.mo908a(menu, menuInflater) : z;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public boolean mo596c(Menu menu) {
        boolean z = false;
        if (this.f338K) {
            return false;
        }
        if (this.f342O && this.f343P) {
            z = true;
            mo574a(menu);
        }
        return this.f331D != null ? z | this.f331D.mo907a(menu) : z;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public boolean mo597c(MenuItem menuItem) {
        if (!this.f338K) {
            if (this.f342O && this.f343P && mo579a(menuItem)) {
                return true;
            }
            if (this.f331D != null && this.f331D.mo909a(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public boolean mo601d(MenuItem menuItem) {
        if (!this.f338K) {
            if (mo594b(menuItem)) {
                return true;
            }
            if (this.f331D != null && this.f331D.mo920b(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public void mo599d(Menu menu) {
        if (!this.f338K) {
            if (this.f342O && this.f343P) {
                mo592b(menu);
            }
            if (this.f331D != null) {
                this.f331D.mo917b(menu);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: n */
    public void mo629n(Bundle bundle) {
        mo603e(bundle);
        if (this.f331D != null) {
            Parcelable m = this.f331D.mo947m();
            if (m != null) {
                bundle.putParcelable("android:support:fragments", m);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: T */
    public void mo547T() {
        if (this.f346S != null) {
            this.f357ad.mo140a(C0098a.ON_PAUSE);
        }
        this.f356ac.mo140a(C0098a.ON_PAUSE);
        if (this.f331D != null) {
            this.f331D.mo958s();
        }
        this.f360k = 3;
        this.f344Q = false;
        mo528A();
        if (!this.f344Q) {
            StringBuilder sb = new StringBuilder();
            sb.append("Fragment ");
            sb.append(this);
            sb.append(" did not call through to super.onPause()");
            throw new C0242ab(sb.toString());
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: U */
    public void mo548U() {
        if (this.f346S != null) {
            this.f357ad.mo140a(C0098a.ON_STOP);
        }
        this.f356ac.mo140a(C0098a.ON_STOP);
        if (this.f331D != null) {
            this.f331D.mo959t();
        }
        this.f360k = 2;
        this.f344Q = false;
        mo609g();
        if (!this.f344Q) {
            StringBuilder sb = new StringBuilder();
            sb.append("Fragment ");
            sb.append(this);
            sb.append(" did not call through to super.onStop()");
            throw new C0242ab(sb.toString());
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: V */
    public void mo549V() {
        if (this.f346S != null) {
            this.f357ad.mo140a(C0098a.ON_DESTROY);
        }
        if (this.f331D != null) {
            this.f331D.mo961u();
        }
        this.f360k = 1;
        this.f344Q = false;
        mo613h();
        if (!this.f344Q) {
            StringBuilder sb = new StringBuilder();
            sb.append("Fragment ");
            sb.append(this);
            sb.append(" did not call through to super.onDestroyView()");
            throw new C0242ab(sb.toString());
        }
        C0297r.m1065a(this).mo765a();
        this.f375z = false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: W */
    public void mo550W() {
        this.f356ac.mo140a(C0098a.ON_DESTROY);
        if (this.f331D != null) {
            this.f331D.mo962v();
        }
        this.f360k = 0;
        this.f344Q = false;
        this.f355ab = false;
        mo529B();
        if (!this.f344Q) {
            StringBuilder sb = new StringBuilder();
            sb.append("Fragment ");
            sb.append(this);
            sb.append(" did not call through to super.onDestroy()");
            throw new C0242ab(sb.toString());
        }
        this.f331D = null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: X */
    public void mo551X() {
        this.f344Q = false;
        mo602e();
        this.f354aa = null;
        if (!this.f344Q) {
            StringBuilder sb = new StringBuilder();
            sb.append("Fragment ");
            sb.append(this);
            sb.append(" did not call through to super.onDetach()");
            throw new C0242ab(sb.toString());
        } else if (this.f331D == null) {
        } else {
            if (!this.f341N) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Child FragmentManager of ");
                sb2.append(this);
                sb2.append(" was not ");
                sb2.append(" destroyed and this fragment is not retaining instance");
                throw new IllegalStateException(sb2.toString());
            }
            this.f331D.mo962v();
            this.f331D = null;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo572a(C0216c cVar) {
        mo830c();
        if (cVar != this.f350W.f397r) {
            if (cVar == null || this.f350W.f397r == null) {
                if (this.f350W.f396q) {
                    this.f350W.f397r = cVar;
                }
                if (cVar != null) {
                    cVar.mo660b();
                }
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Trying to set a replacement startPostponedEnterTransition on ");
            sb.append(this);
            throw new IllegalStateException(sb.toString());
        }
    }

    /* renamed from: c */
    private C0214a mo830c() {
        if (this.f350W == null) {
            this.f350W = new C0214a();
        }
        return this.f350W;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: Y */
    public int mo552Y() {
        if (this.f350W == null) {
            return 0;
        }
        return this.f350W.f383d;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo590b(int i) {
        if (this.f350W != null || i != 0) {
            mo830c().f383d = i;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: Z */
    public int mo553Z() {
        if (this.f350W == null) {
            return 0;
        }
        return this.f350W.f384e;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo558a(int i, int i2) {
        if (this.f350W != null || i != 0 || i2 != 0) {
            mo830c();
            this.f350W.f384e = i;
            this.f350W.f385f = i2;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: aa */
    public int mo580aa() {
        if (this.f350W == null) {
            return 0;
        }
        return this.f350W.f385f;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: ab */
    public C0241aa mo581ab() {
        if (this.f350W == null) {
            return null;
        }
        return this.f350W.f394o;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: ac */
    public C0241aa mo582ac() {
        if (this.f350W == null) {
            return null;
        }
        return this.f350W.f395p;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: ad */
    public View mo583ad() {
        if (this.f350W == null) {
            return null;
        }
        return this.f350W.f380a;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo576a(View view) {
        mo830c().f380a = view;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo562a(Animator animator) {
        mo830c().f381b = animator;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: ae */
    public Animator mo584ae() {
        if (this.f350W == null) {
            return null;
        }
        return this.f350W.f381b;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: af */
    public int mo585af() {
        if (this.f350W == null) {
            return 0;
        }
        return this.f350W.f382c;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo595c(int i) {
        mo830c().f382c = i;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: ag */
    public boolean mo586ag() {
        if (this.f350W == null) {
            return false;
        }
        return this.f350W.f396q;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: ah */
    public boolean mo587ah() {
        if (this.f350W == null) {
            return false;
        }
        return this.f350W.f398s;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public void mo620j(boolean z) {
        mo830c().f398s = z;
    }
}
