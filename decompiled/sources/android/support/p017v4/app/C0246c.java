package android.support.p017v4.app;

import android.support.p017v4.p023d.C0382e;
import android.util.Log;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/* renamed from: android.support.v4.app.c */
/* compiled from: BackStackRecord */
final class C0246c extends C0275l implements C0271h {

    /* renamed from: a */
    final C0257j f486a;

    /* renamed from: b */
    ArrayList<C0247a> f487b = new ArrayList<>();

    /* renamed from: c */
    int f488c;

    /* renamed from: d */
    int f489d;

    /* renamed from: e */
    int f490e;

    /* renamed from: f */
    int f491f;

    /* renamed from: g */
    int f492g;

    /* renamed from: h */
    int f493h;

    /* renamed from: i */
    boolean f494i;

    /* renamed from: j */
    boolean f495j = true;

    /* renamed from: k */
    String f496k;

    /* renamed from: l */
    boolean f497l;

    /* renamed from: m */
    int f498m = -1;

    /* renamed from: n */
    int f499n;

    /* renamed from: o */
    CharSequence f500o;

    /* renamed from: p */
    int f501p;

    /* renamed from: q */
    CharSequence f502q;

    /* renamed from: r */
    ArrayList<String> f503r;

    /* renamed from: s */
    ArrayList<String> f504s;

    /* renamed from: t */
    boolean f505t = false;

    /* renamed from: u */
    ArrayList<Runnable> f506u;

    /* renamed from: android.support.v4.app.c$a */
    /* compiled from: BackStackRecord */
    static final class C0247a {

        /* renamed from: a */
        int f507a;

        /* renamed from: b */
        Fragment f508b;

        /* renamed from: c */
        int f509c;

        /* renamed from: d */
        int f510d;

        /* renamed from: e */
        int f511e;

        /* renamed from: f */
        int f512f;

        C0247a() {
        }

        C0247a(int i, Fragment fragment) {
            this.f507a = i;
            this.f508b = fragment;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f498m >= 0) {
            sb.append(" #");
            sb.append(this.f498m);
        }
        if (this.f496k != null) {
            sb.append(" ");
            sb.append(this.f496k);
        }
        sb.append("}");
        return sb.toString();
    }

    /* renamed from: a */
    public void mo811a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        mo812a(str, printWriter, true);
    }

    /* renamed from: a */
    public void mo812a(String str, PrintWriter printWriter, boolean z) {
        String str2;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f496k);
            printWriter.print(" mIndex=");
            printWriter.print(this.f498m);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f497l);
            if (this.f492g != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f492g));
                printWriter.print(" mTransitionStyle=#");
                printWriter.println(Integer.toHexString(this.f493h));
            }
            if (!(this.f488c == 0 && this.f489d == 0)) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f488c));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f489d));
            }
            if (!(this.f490e == 0 && this.f491f == 0)) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f490e));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f491f));
            }
            if (!(this.f499n == 0 && this.f500o == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f499n));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f500o);
            }
            if (!(this.f501p == 0 && this.f502q == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f501p));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f502q);
            }
        }
        if (!this.f487b.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Operations:");
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("    ");
            sb.toString();
            int size = this.f487b.size();
            for (int i = 0; i < size; i++) {
                C0247a aVar = (C0247a) this.f487b.get(i);
                switch (aVar.f507a) {
                    case 0:
                        str2 = "NULL";
                        break;
                    case 1:
                        str2 = "ADD";
                        break;
                    case 2:
                        str2 = "REPLACE";
                        break;
                    case 3:
                        str2 = "REMOVE";
                        break;
                    case 4:
                        str2 = "HIDE";
                        break;
                    case 5:
                        str2 = "SHOW";
                        break;
                    case 6:
                        str2 = "DETACH";
                        break;
                    case 7:
                        str2 = "ATTACH";
                        break;
                    case 8:
                        str2 = "SET_PRIMARY_NAV";
                        break;
                    case 9:
                        str2 = "UNSET_PRIMARY_NAV";
                        break;
                    default:
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("cmd=");
                        sb2.append(aVar.f507a);
                        str2 = sb2.toString();
                        break;
                }
                printWriter.print(str);
                printWriter.print("  Op #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.print(str2);
                printWriter.print(" ");
                printWriter.println(aVar.f508b);
                if (z) {
                    if (!(aVar.f509c == 0 && aVar.f510d == 0)) {
                        printWriter.print(str);
                        printWriter.print("enterAnim=#");
                        printWriter.print(Integer.toHexString(aVar.f509c));
                        printWriter.print(" exitAnim=#");
                        printWriter.println(Integer.toHexString(aVar.f510d));
                    }
                    if (aVar.f511e != 0 || aVar.f512f != 0) {
                        printWriter.print(str);
                        printWriter.print("popEnterAnim=#");
                        printWriter.print(Integer.toHexString(aVar.f511e));
                        printWriter.print(" popExitAnim=#");
                        printWriter.println(Integer.toHexString(aVar.f512f));
                    }
                }
            }
        }
    }

    public C0246c(C0257j jVar) {
        this.f486a = jVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo810a(C0247a aVar) {
        this.f487b.add(aVar);
        aVar.f509c = this.f488c;
        aVar.f510d = this.f489d;
        aVar.f511e = this.f490e;
        aVar.f512f = this.f491f;
    }

    /* renamed from: a */
    public C0275l mo806a(Fragment fragment, String str) {
        m733a(0, fragment, str, 1);
        return this;
    }

    /* renamed from: a */
    public C0275l mo804a(int i, Fragment fragment, String str) {
        m733a(i, fragment, str, 1);
        return this;
    }

    /* renamed from: a */
    private void m733a(int i, Fragment fragment, String str, int i2) {
        Class cls = fragment.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            StringBuilder sb = new StringBuilder();
            sb.append("Fragment ");
            sb.append(cls.getCanonicalName());
            sb.append(" must be a public static class to be  properly recreated from");
            sb.append(" instance state.");
            throw new IllegalStateException(sb.toString());
        }
        fragment.f329B = this.f486a;
        if (str != null) {
            if (fragment.f337J == null || str.equals(fragment.f337J)) {
                fragment.f337J = str;
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Can't change tag of fragment ");
                sb2.append(fragment);
                sb2.append(": was ");
                sb2.append(fragment.f337J);
                sb2.append(" now ");
                sb2.append(str);
                throw new IllegalStateException(sb2.toString());
            }
        }
        if (i != 0) {
            if (i == -1) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Can't add fragment ");
                sb3.append(fragment);
                sb3.append(" with tag ");
                sb3.append(str);
                sb3.append(" to container view with no id");
                throw new IllegalArgumentException(sb3.toString());
            } else if (fragment.f335H == 0 || fragment.f335H == i) {
                fragment.f335H = i;
                fragment.f336I = i;
            } else {
                StringBuilder sb4 = new StringBuilder();
                sb4.append("Can't change container ID of fragment ");
                sb4.append(fragment);
                sb4.append(": was ");
                sb4.append(fragment.f335H);
                sb4.append(" now ");
                sb4.append(i);
                throw new IllegalStateException(sb4.toString());
            }
        }
        mo810a(new C0247a(i2, fragment));
    }

    /* renamed from: a */
    public C0275l mo805a(Fragment fragment) {
        mo810a(new C0247a(3, fragment));
        return this;
    }

    /* renamed from: b */
    public C0275l mo817b(Fragment fragment) {
        mo810a(new C0247a(6, fragment));
        return this;
    }

    /* renamed from: c */
    public C0275l mo821c(Fragment fragment) {
        mo810a(new C0247a(7, fragment));
        return this;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo808a(int i) {
        if (this.f494i) {
            if (C0257j.f536a) {
                StringBuilder sb = new StringBuilder();
                sb.append("Bump nesting in ");
                sb.append(this);
                sb.append(" by ");
                sb.append(i);
                Log.v("FragmentManager", sb.toString());
            }
            int size = this.f487b.size();
            for (int i2 = 0; i2 < size; i2++) {
                C0247a aVar = (C0247a) this.f487b.get(i2);
                if (aVar.f508b != null) {
                    aVar.f508b.f328A += i;
                    if (C0257j.f536a) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Bump nesting of ");
                        sb2.append(aVar.f508b);
                        sb2.append(" to ");
                        sb2.append(aVar.f508b.f328A);
                        Log.v("FragmentManager", sb2.toString());
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public void mo807a() {
        if (this.f506u != null) {
            int size = this.f506u.size();
            for (int i = 0; i < size; i++) {
                ((Runnable) this.f506u.get(i)).run();
            }
            this.f506u = null;
        }
    }

    /* renamed from: b */
    public int mo815b() {
        return mo802a(false);
    }

    /* renamed from: c */
    public int mo820c() {
        return mo802a(true);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo802a(boolean z) {
        if (this.f497l) {
            throw new IllegalStateException("commit already called");
        }
        if (C0257j.f536a) {
            StringBuilder sb = new StringBuilder();
            sb.append("Commit: ");
            sb.append(this);
            Log.v("FragmentManager", sb.toString());
            PrintWriter printWriter = new PrintWriter(new C0382e("FragmentManager"));
            mo811a("  ", (FileDescriptor) null, printWriter, (String[]) null);
            printWriter.close();
        }
        this.f497l = true;
        if (this.f494i) {
            this.f498m = this.f486a.mo889a(this);
        } else {
            this.f498m = -1;
        }
        this.f486a.mo905a((C0271h) this, z);
        return this.f498m;
    }

    /* renamed from: a */
    public boolean mo814a(ArrayList<C0246c> arrayList, ArrayList<Boolean> arrayList2) {
        if (C0257j.f536a) {
            StringBuilder sb = new StringBuilder();
            sb.append("Run: ");
            sb.append(this);
            Log.v("FragmentManager", sb.toString());
        }
        arrayList.add(this);
        arrayList2.add(Boolean.valueOf(false));
        if (this.f494i) {
            this.f486a.mo916b(this);
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public boolean mo819b(int i) {
        int size = this.f487b.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0247a aVar = (C0247a) this.f487b.get(i2);
            int i3 = aVar.f508b != null ? aVar.f508b.f336I : 0;
            if (i3 != 0 && i3 == i) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo813a(ArrayList<C0246c> arrayList, int i, int i2) {
        if (i2 == i) {
            return false;
        }
        int size = this.f487b.size();
        int i3 = -1;
        for (int i4 = 0; i4 < size; i4++) {
            C0247a aVar = (C0247a) this.f487b.get(i4);
            int i5 = aVar.f508b != null ? aVar.f508b.f336I : 0;
            if (!(i5 == 0 || i5 == i3)) {
                for (int i6 = i; i6 < i2; i6++) {
                    C0246c cVar = (C0246c) arrayList.get(i6);
                    int size2 = cVar.f487b.size();
                    for (int i7 = 0; i7 < size2; i7++) {
                        C0247a aVar2 = (C0247a) cVar.f487b.get(i7);
                        if ((aVar2.f508b != null ? aVar2.f508b.f336I : 0) == i5) {
                            return true;
                        }
                    }
                }
                i3 = i5;
            }
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public void mo822d() {
        int size = this.f487b.size();
        for (int i = 0; i < size; i++) {
            C0247a aVar = (C0247a) this.f487b.get(i);
            Fragment fragment = aVar.f508b;
            if (fragment != null) {
                fragment.mo558a(this.f492g, this.f493h);
            }
            int i2 = aVar.f507a;
            if (i2 != 1) {
                switch (i2) {
                    case 3:
                        fragment.mo590b(aVar.f510d);
                        this.f486a.mo936h(fragment);
                        break;
                    case 4:
                        fragment.mo590b(aVar.f510d);
                        this.f486a.mo940i(fragment);
                        break;
                    case 5:
                        fragment.mo590b(aVar.f509c);
                        this.f486a.mo942j(fragment);
                        break;
                    case 6:
                        fragment.mo590b(aVar.f510d);
                        this.f486a.mo944k(fragment);
                        break;
                    case 7:
                        fragment.mo590b(aVar.f509c);
                        this.f486a.mo946l(fragment);
                        break;
                    case 8:
                        this.f486a.mo952o(fragment);
                        break;
                    case 9:
                        this.f486a.mo952o(null);
                        break;
                    default:
                        StringBuilder sb = new StringBuilder();
                        sb.append("Unknown cmd: ");
                        sb.append(aVar.f507a);
                        throw new IllegalArgumentException(sb.toString());
                }
            } else {
                fragment.mo590b(aVar.f509c);
                this.f486a.mo902a(fragment, false);
            }
            if (!(this.f505t || aVar.f507a == 1 || fragment == null)) {
                this.f486a.mo928e(fragment);
            }
        }
        if (!this.f505t) {
            this.f486a.mo893a(this.f486a.f554l, true);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo818b(boolean z) {
        for (int size = this.f487b.size() - 1; size >= 0; size--) {
            C0247a aVar = (C0247a) this.f487b.get(size);
            Fragment fragment = aVar.f508b;
            if (fragment != null) {
                fragment.mo558a(C0257j.m871d(this.f492g), this.f493h);
            }
            int i = aVar.f507a;
            if (i != 1) {
                switch (i) {
                    case 3:
                        fragment.mo590b(aVar.f511e);
                        this.f486a.mo902a(fragment, false);
                        break;
                    case 4:
                        fragment.mo590b(aVar.f511e);
                        this.f486a.mo942j(fragment);
                        break;
                    case 5:
                        fragment.mo590b(aVar.f512f);
                        this.f486a.mo940i(fragment);
                        break;
                    case 6:
                        fragment.mo590b(aVar.f511e);
                        this.f486a.mo946l(fragment);
                        break;
                    case 7:
                        fragment.mo590b(aVar.f512f);
                        this.f486a.mo944k(fragment);
                        break;
                    case 8:
                        this.f486a.mo952o(null);
                        break;
                    case 9:
                        this.f486a.mo952o(fragment);
                        break;
                    default:
                        StringBuilder sb = new StringBuilder();
                        sb.append("Unknown cmd: ");
                        sb.append(aVar.f507a);
                        throw new IllegalArgumentException(sb.toString());
                }
            } else {
                fragment.mo590b(aVar.f512f);
                this.f486a.mo936h(fragment);
            }
            if (!(this.f505t || aVar.f507a == 3 || fragment == null)) {
                this.f486a.mo928e(fragment);
            }
        }
        if (!this.f505t && z) {
            this.f486a.mo893a(this.f486a.f554l, true);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public Fragment mo803a(ArrayList<Fragment> arrayList, Fragment fragment) {
        Fragment fragment2 = fragment;
        int i = 0;
        while (i < this.f487b.size()) {
            C0247a aVar = (C0247a) this.f487b.get(i);
            switch (aVar.f507a) {
                case 1:
                case 7:
                    arrayList.add(aVar.f508b);
                    break;
                case 2:
                    Fragment fragment3 = aVar.f508b;
                    int i2 = fragment3.f336I;
                    Fragment fragment4 = fragment2;
                    int i3 = i;
                    boolean z = false;
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        Fragment fragment5 = (Fragment) arrayList.get(size);
                        if (fragment5.f336I == i2) {
                            if (fragment5 == fragment3) {
                                z = true;
                            } else {
                                if (fragment5 == fragment4) {
                                    this.f487b.add(i3, new C0247a(9, fragment5));
                                    i3++;
                                    fragment4 = null;
                                }
                                C0247a aVar2 = new C0247a(3, fragment5);
                                aVar2.f509c = aVar.f509c;
                                aVar2.f511e = aVar.f511e;
                                aVar2.f510d = aVar.f510d;
                                aVar2.f512f = aVar.f512f;
                                this.f487b.add(i3, aVar2);
                                arrayList.remove(fragment5);
                                i3++;
                            }
                        }
                    }
                    if (z) {
                        this.f487b.remove(i3);
                        i3--;
                    } else {
                        aVar.f507a = 1;
                        arrayList.add(fragment3);
                    }
                    i = i3;
                    fragment2 = fragment4;
                    break;
                case 3:
                case 6:
                    arrayList.remove(aVar.f508b);
                    if (aVar.f508b != fragment2) {
                        break;
                    } else {
                        this.f487b.add(i, new C0247a(9, aVar.f508b));
                        i++;
                        fragment2 = null;
                        break;
                    }
                case 8:
                    this.f487b.add(i, new C0247a(9, fragment2));
                    i++;
                    fragment2 = aVar.f508b;
                    break;
            }
            i++;
        }
        return fragment2;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public Fragment mo816b(ArrayList<Fragment> arrayList, Fragment fragment) {
        for (int i = 0; i < this.f487b.size(); i++) {
            C0247a aVar = (C0247a) this.f487b.get(i);
            int i2 = aVar.f507a;
            if (i2 != 1) {
                if (i2 != 3) {
                    switch (i2) {
                        case 6:
                            break;
                        case 7:
                            break;
                        case 8:
                            fragment = null;
                            break;
                        case 9:
                            fragment = aVar.f508b;
                            break;
                    }
                }
                arrayList.add(aVar.f508b);
            }
            arrayList.remove(aVar.f508b);
        }
        return fragment;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public boolean mo823e() {
        for (int i = 0; i < this.f487b.size(); i++) {
            if (m734b((C0247a) this.f487b.get(i))) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo809a(C0216c cVar) {
        for (int i = 0; i < this.f487b.size(); i++) {
            C0247a aVar = (C0247a) this.f487b.get(i);
            if (m734b(aVar)) {
                aVar.f508b.mo572a(cVar);
            }
        }
    }

    /* renamed from: b */
    private static boolean m734b(C0247a aVar) {
        Fragment fragment = aVar.f508b;
        return fragment != null && fragment.f370u && fragment.f346S != null && !fragment.f339L && !fragment.f338K && fragment.mo586ag();
    }

    /* renamed from: f */
    public String mo824f() {
        return this.f496k;
    }
}
