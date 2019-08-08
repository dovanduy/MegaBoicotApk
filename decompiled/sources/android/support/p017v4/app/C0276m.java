package android.support.p017v4.app;

import android.graphics.Rect;
import android.os.Build.VERSION;
import android.support.p017v4.p023d.C0376a;
import android.support.p017v4.view.C0595r;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* renamed from: android.support.v4.app.m */
/* compiled from: FragmentTransition */
class C0276m {

    /* renamed from: a */
    private static final int[] f605a = {0, 3, 0, 1, 5, 4, 7, 6, 9, 8};

    /* renamed from: b */
    private static final C0287o f606b = (VERSION.SDK_INT >= 21 ? new C0282n() : null);

    /* renamed from: c */
    private static final C0287o f607c = m976a();

    /* renamed from: android.support.v4.app.m$a */
    /* compiled from: FragmentTransition */
    static class C0281a {

        /* renamed from: a */
        public Fragment f636a;

        /* renamed from: b */
        public boolean f637b;

        /* renamed from: c */
        public C0246c f638c;

        /* renamed from: d */
        public Fragment f639d;

        /* renamed from: e */
        public boolean f640e;

        /* renamed from: f */
        public C0246c f641f;

        C0281a() {
        }
    }

    /* renamed from: a */
    private static C0287o m976a() {
        try {
            return (C0287o) Class.forName("android.support.transition.FragmentTransitionSupport").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    static void m991a(C0257j jVar, ArrayList<C0246c> arrayList, ArrayList<Boolean> arrayList2, int i, int i2, boolean z) {
        if (jVar.f554l >= 1) {
            SparseArray sparseArray = new SparseArray();
            for (int i3 = i; i3 < i2; i3++) {
                C0246c cVar = (C0246c) arrayList.get(i3);
                if (((Boolean) arrayList2.get(i3)).booleanValue()) {
                    m1002b(cVar, sparseArray, z);
                } else {
                    m989a(cVar, sparseArray, z);
                }
            }
            if (sparseArray.size() != 0) {
                View view = new View(jVar.f555m.mo862g());
                int size = sparseArray.size();
                for (int i4 = 0; i4 < size; i4++) {
                    int keyAt = sparseArray.keyAt(i4);
                    C0376a a = m978a(keyAt, arrayList, arrayList2, i, i2);
                    C0281a aVar = (C0281a) sparseArray.valueAt(i4);
                    if (z) {
                        m990a(jVar, keyAt, aVar, view, a);
                    } else {
                        m1003b(jVar, keyAt, aVar, view, a);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private static C0376a<String, String> m978a(int i, ArrayList<C0246c> arrayList, ArrayList<Boolean> arrayList2, int i2, int i3) {
        ArrayList<String> arrayList3;
        ArrayList arrayList4;
        C0376a<String, String> aVar = new C0376a<>();
        for (int i4 = i3 - 1; i4 >= i2; i4--) {
            C0246c cVar = (C0246c) arrayList.get(i4);
            if (cVar.mo819b(i)) {
                boolean booleanValue = ((Boolean) arrayList2.get(i4)).booleanValue();
                if (cVar.f503r != null) {
                    int size = cVar.f503r.size();
                    if (booleanValue) {
                        arrayList3 = cVar.f503r;
                        arrayList4 = cVar.f504s;
                    } else {
                        ArrayList arrayList5 = cVar.f503r;
                        arrayList3 = cVar.f504s;
                        arrayList4 = arrayList5;
                    }
                    for (int i5 = 0; i5 < size; i5++) {
                        String str = (String) arrayList4.get(i5);
                        String str2 = (String) arrayList3.get(i5);
                        String str3 = (String) aVar.remove(str2);
                        if (str3 != null) {
                            aVar.put(str, str3);
                        } else {
                            aVar.put(str, str2);
                        }
                    }
                }
            }
        }
        return aVar;
    }

    /* renamed from: a */
    private static void m990a(C0257j jVar, int i, C0281a aVar, View view, C0376a<String, String> aVar2) {
        Object obj;
        C0257j jVar2 = jVar;
        C0281a aVar3 = aVar;
        View view2 = view;
        ViewGroup viewGroup = jVar2.f556n.mo650a() ? (ViewGroup) jVar2.f556n.mo649a(i) : null;
        if (viewGroup != null) {
            Fragment fragment = aVar3.f636a;
            Fragment fragment2 = aVar3.f639d;
            C0287o a = m977a(fragment2, fragment);
            if (a != null) {
                boolean z = aVar3.f637b;
                boolean z2 = aVar3.f640e;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                Object a2 = m982a(a, fragment, z);
                Object b = m1000b(a, fragment2, z2);
                Object obj2 = a2;
                ViewGroup viewGroup2 = viewGroup;
                ArrayList arrayList3 = arrayList2;
                Object a3 = m983a(a, viewGroup, view2, aVar2, aVar3, arrayList2, arrayList, a2, b);
                Object obj3 = obj2;
                if (obj3 == null && a3 == null) {
                    obj = b;
                    if (obj == null) {
                        return;
                    }
                } else {
                    obj = b;
                }
                ArrayList a4 = m986a(a, obj, fragment2, arrayList3, view2);
                ArrayList a5 = m986a(a, obj3, fragment, arrayList, view2);
                m996a(a5, 4);
                Fragment fragment3 = fragment;
                ArrayList arrayList4 = a4;
                Object a6 = m984a(a, obj3, obj, a3, fragment3, z);
                if (a6 != null) {
                    m993a(a, obj, fragment2, arrayList4);
                    ArrayList a7 = a.mo1017a(arrayList);
                    a.mo994a(a6, obj3, a5, obj, arrayList4, a3, arrayList);
                    ViewGroup viewGroup3 = viewGroup2;
                    a.mo990a(viewGroup3, a6);
                    a.mo1019a(viewGroup3, arrayList3, arrayList, a7, aVar2);
                    m996a(a5, 0);
                    a.mo996a(a3, arrayList3, arrayList);
                }
            }
        }
    }

    /* renamed from: a */
    private static void m993a(C0287o oVar, Object obj, Fragment fragment, final ArrayList<View> arrayList) {
        if (fragment != null && obj != null && fragment.f370u && fragment.f338K && fragment.f352Y) {
            fragment.mo620j(true);
            oVar.mo1001b(obj, fragment.mo645y(), arrayList);
            C0316y.m1167a(fragment.f345R, new Runnable() {
                public void run() {
                    C0276m.m996a(arrayList, 4);
                }
            });
        }
    }

    /* renamed from: b */
    private static void m1003b(C0257j jVar, int i, C0281a aVar, View view, C0376a<String, String> aVar2) {
        Object obj;
        C0257j jVar2 = jVar;
        C0281a aVar3 = aVar;
        View view2 = view;
        C0376a<String, String> aVar4 = aVar2;
        ViewGroup viewGroup = jVar2.f556n.mo650a() ? (ViewGroup) jVar2.f556n.mo649a(i) : null;
        if (viewGroup != null) {
            Fragment fragment = aVar3.f636a;
            Fragment fragment2 = aVar3.f639d;
            C0287o a = m977a(fragment2, fragment);
            if (a != null) {
                boolean z = aVar3.f637b;
                boolean z2 = aVar3.f640e;
                Object a2 = m982a(a, fragment, z);
                Object b = m1000b(a, fragment2, z2);
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = arrayList;
                Object obj2 = b;
                Object obj3 = a2;
                C0287o oVar = a;
                Object b2 = m1001b(a, viewGroup, view2, aVar4, aVar3, arrayList, arrayList2, a2, obj2);
                Object obj4 = obj3;
                if (obj4 == null && b2 == null) {
                    obj = obj2;
                    if (obj == null) {
                        return;
                    }
                } else {
                    obj = obj2;
                }
                ArrayList a3 = m986a(oVar, obj, fragment2, arrayList3, view2);
                Object obj5 = (a3 == null || a3.isEmpty()) ? null : obj;
                oVar.mo1000b(obj4, view2);
                Object a4 = m984a(oVar, obj4, obj5, b2, fragment, aVar3.f637b);
                if (a4 != null) {
                    ArrayList arrayList4 = new ArrayList();
                    C0287o oVar2 = oVar;
                    ArrayList arrayList5 = arrayList4;
                    oVar2.mo994a(a4, obj4, arrayList4, obj5, a3, b2, arrayList2);
                    m992a(oVar2, viewGroup, fragment, view2, arrayList2, obj4, arrayList5, obj5, a3);
                    ArrayList arrayList6 = arrayList2;
                    oVar.mo1020a((View) viewGroup, arrayList6, (Map<String, String>) aVar4);
                    oVar.mo990a(viewGroup, a4);
                    oVar.mo1021a(viewGroup, arrayList6, (Map<String, String>) aVar4);
                }
            }
        }
    }

    /* renamed from: a */
    private static void m992a(C0287o oVar, ViewGroup viewGroup, Fragment fragment, View view, ArrayList<View> arrayList, Object obj, ArrayList<View> arrayList2, Object obj2, ArrayList<View> arrayList3) {
        final Object obj3 = obj;
        final C0287o oVar2 = oVar;
        final View view2 = view;
        final Fragment fragment2 = fragment;
        final ArrayList<View> arrayList4 = arrayList;
        final ArrayList<View> arrayList5 = arrayList2;
        final ArrayList<View> arrayList6 = arrayList3;
        final Object obj4 = obj2;
        C02782 r0 = new Runnable() {
            public void run() {
                if (obj3 != null) {
                    oVar2.mo1004c(obj3, view2);
                    arrayList5.addAll(C0276m.m986a(oVar2, obj3, fragment2, arrayList4, view2));
                }
                if (arrayList6 != null) {
                    if (obj4 != null) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(view2);
                        oVar2.mo1002b(obj4, arrayList6, arrayList);
                    }
                    arrayList6.clear();
                    arrayList6.add(view2);
                }
            }
        };
        C0316y.m1167a(viewGroup, r0);
    }

    /* renamed from: a */
    private static C0287o m977a(Fragment fragment, Fragment fragment2) {
        ArrayList arrayList = new ArrayList();
        if (fragment != null) {
            Object G = fragment.mo534G();
            if (G != null) {
                arrayList.add(G);
            }
            Object F = fragment.mo533F();
            if (F != null) {
                arrayList.add(F);
            }
            Object J = fragment.mo537J();
            if (J != null) {
                arrayList.add(J);
            }
        }
        if (fragment2 != null) {
            Object E = fragment2.mo532E();
            if (E != null) {
                arrayList.add(E);
            }
            Object H = fragment2.mo535H();
            if (H != null) {
                arrayList.add(H);
            }
            Object I = fragment2.mo536I();
            if (I != null) {
                arrayList.add(I);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        if (f606b != null && m998a(f606b, (List<Object>) arrayList)) {
            return f606b;
        }
        if (f607c != null && m998a(f607c, (List<Object>) arrayList)) {
            return f607c;
        }
        if (f606b == null && f607c == null) {
            return null;
        }
        throw new IllegalArgumentException("Invalid Transition types");
    }

    /* renamed from: a */
    private static boolean m998a(C0287o oVar, List<Object> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (!oVar.mo997a(list.get(i))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    private static Object m981a(C0287o oVar, Fragment fragment, Fragment fragment2, boolean z) {
        Object obj;
        if (fragment == null || fragment2 == null) {
            return null;
        }
        if (z) {
            obj = fragment2.mo537J();
        } else {
            obj = fragment.mo536I();
        }
        return oVar.mo1003c(oVar.mo998b(obj));
    }

    /* renamed from: a */
    private static Object m982a(C0287o oVar, Fragment fragment, boolean z) {
        Object obj;
        if (fragment == null) {
            return null;
        }
        if (z) {
            obj = fragment.mo535H();
        } else {
            obj = fragment.mo532E();
        }
        return oVar.mo998b(obj);
    }

    /* renamed from: b */
    private static Object m1000b(C0287o oVar, Fragment fragment, boolean z) {
        Object obj;
        if (fragment == null) {
            return null;
        }
        if (z) {
            obj = fragment.mo533F();
        } else {
            obj = fragment.mo534G();
        }
        return oVar.mo998b(obj);
    }

    /* renamed from: a */
    private static Object m983a(C0287o oVar, ViewGroup viewGroup, View view, C0376a<String, String> aVar, C0281a aVar2, ArrayList<View> arrayList, ArrayList<View> arrayList2, Object obj, Object obj2) {
        Object obj3;
        Object obj4;
        final Rect rect;
        final View view2;
        final C0287o oVar2 = oVar;
        View view3 = view;
        C0376a<String, String> aVar3 = aVar;
        C0281a aVar4 = aVar2;
        ArrayList<View> arrayList3 = arrayList;
        ArrayList<View> arrayList4 = arrayList2;
        Object obj5 = obj;
        Fragment fragment = aVar4.f636a;
        Fragment fragment2 = aVar4.f639d;
        if (fragment != null) {
            fragment.mo645y().setVisibility(0);
        }
        if (fragment == null || fragment2 == null) {
            return null;
        }
        boolean z = aVar4.f637b;
        if (aVar.isEmpty()) {
            obj3 = null;
        } else {
            obj3 = m981a(oVar2, fragment, fragment2, z);
        }
        C0376a b = m999b(oVar2, aVar3, obj3, aVar4);
        C0376a a = m979a(oVar2, aVar3, obj3, aVar4);
        if (aVar.isEmpty()) {
            if (b != null) {
                b.clear();
            }
            if (a != null) {
                a.clear();
            }
            obj4 = null;
        } else {
            m997a(arrayList3, b, (Collection<String>) aVar.keySet());
            m997a(arrayList4, a, aVar.values());
            obj4 = obj3;
        }
        if (obj5 == null && obj2 == null && obj4 == null) {
            return null;
        }
        m987a(fragment, fragment2, z, b, true);
        if (obj4 != null) {
            arrayList4.add(view3);
            oVar2.mo993a(obj4, view3, arrayList3);
            m994a(oVar2, obj4, obj2, b, aVar4.f640e, aVar4.f641f);
            Rect rect2 = new Rect();
            View a2 = m980a(a, aVar4, obj5, z);
            if (a2 != null) {
                oVar2.mo991a(obj5, rect2);
            }
            rect = rect2;
            view2 = a2;
        } else {
            view2 = null;
            rect = null;
        }
        final Fragment fragment3 = fragment;
        final Fragment fragment4 = fragment2;
        final boolean z2 = z;
        final C0376a aVar5 = a;
        C02793 r0 = new Runnable() {
            public void run() {
                C0276m.m987a(fragment3, fragment4, z2, aVar5, false);
                if (view2 != null) {
                    oVar2.mo1018a(view2, rect);
                }
            }
        };
        C0316y.m1167a(viewGroup, r0);
        return obj4;
    }

    /* renamed from: a */
    private static void m997a(ArrayList<View> arrayList, C0376a<String, View> aVar, Collection<String> collection) {
        for (int size = aVar.size() - 1; size >= 0; size--) {
            View view = (View) aVar.mo1400c(size);
            if (collection.contains(C0595r.m2265n(view))) {
                arrayList.add(view);
            }
        }
    }

    /* renamed from: b */
    private static Object m1001b(C0287o oVar, ViewGroup viewGroup, View view, C0376a<String, String> aVar, C0281a aVar2, ArrayList<View> arrayList, ArrayList<View> arrayList2, Object obj, Object obj2) {
        C0376a<String, String> aVar3;
        Object obj3;
        Object obj4;
        Rect rect;
        C0287o oVar2 = oVar;
        C0281a aVar4 = aVar2;
        final ArrayList<View> arrayList3 = arrayList;
        final Object obj5 = obj;
        Fragment fragment = aVar4.f636a;
        Fragment fragment2 = aVar4.f639d;
        if (fragment == null || fragment2 == null) {
            return null;
        }
        boolean z = aVar4.f637b;
        if (aVar.isEmpty()) {
            aVar3 = aVar;
            obj3 = null;
        } else {
            obj3 = m981a(oVar2, fragment, fragment2, z);
            aVar3 = aVar;
        }
        C0376a b = m999b(oVar2, aVar3, obj3, aVar4);
        if (aVar.isEmpty()) {
            obj4 = null;
        } else {
            arrayList3.addAll(b.values());
            obj4 = obj3;
        }
        if (obj5 == null && obj2 == null && obj4 == null) {
            return null;
        }
        m987a(fragment, fragment2, z, b, true);
        if (obj4 != null) {
            rect = new Rect();
            oVar2.mo993a(obj4, view, arrayList3);
            m994a(oVar2, obj4, obj2, b, aVar4.f640e, aVar4.f641f);
            if (obj5 != null) {
                oVar2.mo991a(obj5, rect);
            }
        } else {
            rect = null;
        }
        final C0287o oVar3 = oVar2;
        final C0376a<String, String> aVar5 = aVar3;
        final Object obj6 = obj4;
        final C0281a aVar6 = aVar4;
        C02804 r13 = r0;
        final ArrayList<View> arrayList4 = arrayList2;
        final View view2 = view;
        final Fragment fragment3 = fragment;
        final Fragment fragment4 = fragment2;
        final boolean z2 = z;
        final Rect rect2 = rect;
        C02804 r0 = new Runnable() {
            public void run() {
                C0376a a = C0276m.m979a(oVar3, aVar5, obj6, aVar6);
                if (a != null) {
                    arrayList4.addAll(a.values());
                    arrayList4.add(view2);
                }
                C0276m.m987a(fragment3, fragment4, z2, a, false);
                if (obj6 != null) {
                    oVar3.mo996a(obj6, arrayList3, arrayList4);
                    View a2 = C0276m.m980a(a, aVar6, obj5, z2);
                    if (a2 != null) {
                        oVar3.mo1018a(a2, rect2);
                    }
                }
            }
        };
        C0316y.m1167a(viewGroup, r13);
        return obj4;
    }

    /* renamed from: b */
    private static C0376a<String, View> m999b(C0287o oVar, C0376a<String, String> aVar, Object obj, C0281a aVar2) {
        C0241aa aaVar;
        ArrayList<String> arrayList;
        if (aVar.isEmpty() || obj == null) {
            aVar.clear();
            return null;
        }
        Fragment fragment = aVar2.f639d;
        C0376a<String, View> aVar3 = new C0376a<>();
        oVar.mo1023a((Map<String, View>) aVar3, fragment.mo645y());
        C0246c cVar = aVar2.f641f;
        if (aVar2.f640e) {
            aaVar = fragment.mo581ab();
            arrayList = cVar.f504s;
        } else {
            aaVar = fragment.mo582ac();
            arrayList = cVar.f503r;
        }
        aVar3.mo1268a(arrayList);
        if (aaVar != null) {
            aaVar.mo793a(arrayList, aVar3);
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                String str = (String) arrayList.get(size);
                View view = (View) aVar3.get(str);
                if (view == null) {
                    aVar.remove(str);
                } else if (!str.equals(C0595r.m2265n(view))) {
                    aVar.put(C0595r.m2265n(view), (String) aVar.remove(str));
                }
            }
        } else {
            aVar.mo1268a(aVar3.keySet());
        }
        return aVar3;
    }

    /* renamed from: a */
    static C0376a<String, View> m979a(C0287o oVar, C0376a<String, String> aVar, Object obj, C0281a aVar2) {
        C0241aa aaVar;
        ArrayList<String> arrayList;
        Fragment fragment = aVar2.f636a;
        View y = fragment.mo645y();
        if (aVar.isEmpty() || obj == null || y == null) {
            aVar.clear();
            return null;
        }
        C0376a<String, View> aVar3 = new C0376a<>();
        oVar.mo1023a((Map<String, View>) aVar3, y);
        C0246c cVar = aVar2.f638c;
        if (aVar2.f637b) {
            aaVar = fragment.mo582ac();
            arrayList = cVar.f503r;
        } else {
            aaVar = fragment.mo581ab();
            arrayList = cVar.f504s;
        }
        if (arrayList != null) {
            aVar3.mo1268a(arrayList);
            aVar3.mo1268a(aVar.values());
        }
        if (aaVar != null) {
            aaVar.mo793a(arrayList, aVar3);
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                String str = (String) arrayList.get(size);
                View view = (View) aVar3.get(str);
                if (view == null) {
                    String a = m985a(aVar, str);
                    if (a != null) {
                        aVar.remove(a);
                    }
                } else if (!str.equals(C0595r.m2265n(view))) {
                    String a2 = m985a(aVar, str);
                    if (a2 != null) {
                        aVar.put(a2, C0595r.m2265n(view));
                    }
                }
            }
        } else {
            m995a(aVar, aVar3);
        }
        return aVar3;
    }

    /* renamed from: a */
    private static String m985a(C0376a<String, String> aVar, String str) {
        int size = aVar.size();
        for (int i = 0; i < size; i++) {
            if (str.equals(aVar.mo1400c(i))) {
                return (String) aVar.mo1399b(i);
            }
        }
        return null;
    }

    /* renamed from: a */
    static View m980a(C0376a<String, View> aVar, C0281a aVar2, Object obj, boolean z) {
        String str;
        C0246c cVar = aVar2.f638c;
        if (obj == null || aVar == null || cVar.f503r == null || cVar.f503r.isEmpty()) {
            return null;
        }
        if (z) {
            str = (String) cVar.f503r.get(0);
        } else {
            str = (String) cVar.f504s.get(0);
        }
        return (View) aVar.get(str);
    }

    /* renamed from: a */
    private static void m994a(C0287o oVar, Object obj, Object obj2, C0376a<String, View> aVar, boolean z, C0246c cVar) {
        String str;
        if (cVar.f503r != null && !cVar.f503r.isEmpty()) {
            if (z) {
                str = (String) cVar.f504s.get(0);
            } else {
                str = (String) cVar.f503r.get(0);
            }
            View view = (View) aVar.get(str);
            oVar.mo992a(obj, view);
            if (obj2 != null) {
                oVar.mo992a(obj2, view);
            }
        }
    }

    /* renamed from: a */
    private static void m995a(C0376a<String, String> aVar, C0376a<String, View> aVar2) {
        for (int size = aVar.size() - 1; size >= 0; size--) {
            if (!aVar2.containsKey((String) aVar.mo1400c(size))) {
                aVar.mo1404d(size);
            }
        }
    }

    /* renamed from: a */
    static void m987a(Fragment fragment, Fragment fragment2, boolean z, C0376a<String, View> aVar, boolean z2) {
        C0241aa aaVar;
        int i;
        if (z) {
            aaVar = fragment2.mo581ab();
        } else {
            aaVar = fragment.mo581ab();
        }
        if (aaVar != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            if (aVar == null) {
                i = 0;
            } else {
                i = aVar.size();
            }
            for (int i2 = 0; i2 < i; i2++) {
                arrayList2.add(aVar.mo1399b(i2));
                arrayList.add(aVar.mo1400c(i2));
            }
            if (z2) {
                aaVar.mo792a(arrayList2, arrayList, null);
            } else {
                aaVar.mo794b(arrayList2, arrayList, null);
            }
        }
    }

    /* renamed from: a */
    static ArrayList<View> m986a(C0287o oVar, Object obj, Fragment fragment, ArrayList<View> arrayList, View view) {
        if (obj == null) {
            return null;
        }
        ArrayList<View> arrayList2 = new ArrayList<>();
        View y = fragment.mo645y();
        if (y != null) {
            oVar.mo1022a(arrayList2, y);
        }
        if (arrayList != null) {
            arrayList2.removeAll(arrayList);
        }
        if (arrayList2.isEmpty()) {
            return arrayList2;
        }
        arrayList2.add(view);
        oVar.mo995a(obj, arrayList2);
        return arrayList2;
    }

    /* renamed from: a */
    static void m996a(ArrayList<View> arrayList, int i) {
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((View) arrayList.get(size)).setVisibility(i);
            }
        }
    }

    /* renamed from: a */
    private static Object m984a(C0287o oVar, Object obj, Object obj2, Object obj3, Fragment fragment, boolean z) {
        boolean z2 = (obj == null || obj2 == null || fragment == null) ? true : z ? fragment.mo539L() : fragment.mo538K();
        if (z2) {
            return oVar.mo989a(obj2, obj, obj3);
        }
        return oVar.mo999b(obj2, obj, obj3);
    }

    /* renamed from: a */
    public static void m989a(C0246c cVar, SparseArray<C0281a> sparseArray, boolean z) {
        int size = cVar.f487b.size();
        for (int i = 0; i < size; i++) {
            m988a(cVar, (C0247a) cVar.f487b.get(i), sparseArray, false, z);
        }
    }

    /* renamed from: b */
    public static void m1002b(C0246c cVar, SparseArray<C0281a> sparseArray, boolean z) {
        if (cVar.f486a.f556n.mo650a()) {
            for (int size = cVar.f487b.size() - 1; size >= 0; size--) {
                m988a(cVar, (C0247a) cVar.f487b.get(size), sparseArray, true, z);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0035, code lost:
        if (r10.f370u != false) goto L_0x008b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x006d, code lost:
        r1 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x006f, code lost:
        r1 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x007a, code lost:
        r13 = r1;
        r1 = false;
        r12 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0089, code lost:
        if (r10.f338K == false) goto L_0x008b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x008b, code lost:
        r1 = true;
     */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x009a  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m988a(android.support.p017v4.app.C0246c r16, android.support.p017v4.app.C0246c.C0247a r17, android.util.SparseArray<android.support.p017v4.app.C0276m.C0281a> r18, boolean r19, boolean r20) {
        /*
            r0 = r16
            r1 = r17
            r2 = r18
            r3 = r19
            android.support.v4.app.Fragment r10 = r1.f508b
            if (r10 != 0) goto L_0x000d
            return
        L_0x000d:
            int r11 = r10.f336I
            if (r11 != 0) goto L_0x0012
            return
        L_0x0012:
            if (r3 == 0) goto L_0x001b
            int[] r4 = f605a
            int r1 = r1.f507a
            r1 = r4[r1]
            goto L_0x001d
        L_0x001b:
            int r1 = r1.f507a
        L_0x001d:
            r4 = 0
            r5 = 1
            if (r1 == r5) goto L_0x007e
            switch(r1) {
                case 3: goto L_0x0054;
                case 4: goto L_0x003c;
                case 5: goto L_0x0029;
                case 6: goto L_0x0054;
                case 7: goto L_0x007e;
                default: goto L_0x0024;
            }
        L_0x0024:
            r1 = r4
            r12 = r1
            r13 = r12
            goto L_0x0092
        L_0x0029:
            if (r20 == 0) goto L_0x0038
            boolean r1 = r10.f352Y
            if (r1 == 0) goto L_0x008d
            boolean r1 = r10.f338K
            if (r1 != 0) goto L_0x008d
            boolean r1 = r10.f370u
            if (r1 == 0) goto L_0x008d
            goto L_0x008b
        L_0x0038:
            boolean r1 = r10.f338K
            goto L_0x008e
        L_0x003c:
            if (r20 == 0) goto L_0x004b
            boolean r1 = r10.f352Y
            if (r1 == 0) goto L_0x006f
            boolean r1 = r10.f370u
            if (r1 == 0) goto L_0x006f
            boolean r1 = r10.f338K
            if (r1 == 0) goto L_0x006f
        L_0x004a:
            goto L_0x006d
        L_0x004b:
            boolean r1 = r10.f370u
            if (r1 == 0) goto L_0x006f
            boolean r1 = r10.f338K
            if (r1 != 0) goto L_0x006f
            goto L_0x004a
        L_0x0054:
            if (r20 == 0) goto L_0x0071
            boolean r1 = r10.f370u
            if (r1 != 0) goto L_0x006f
            android.view.View r1 = r10.f346S
            if (r1 == 0) goto L_0x006f
            android.view.View r1 = r10.f346S
            int r1 = r1.getVisibility()
            if (r1 != 0) goto L_0x006f
            float r1 = r10.f353Z
            r6 = 0
            int r1 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r1 < 0) goto L_0x006f
        L_0x006d:
            r1 = r5
            goto L_0x007a
        L_0x006f:
            r1 = r4
            goto L_0x007a
        L_0x0071:
            boolean r1 = r10.f370u
            if (r1 == 0) goto L_0x006f
            boolean r1 = r10.f338K
            if (r1 != 0) goto L_0x006f
            goto L_0x006d
        L_0x007a:
            r13 = r1
            r1 = r4
            r12 = r5
            goto L_0x0092
        L_0x007e:
            if (r20 == 0) goto L_0x0083
            boolean r1 = r10.f351X
            goto L_0x008e
        L_0x0083:
            boolean r1 = r10.f370u
            if (r1 != 0) goto L_0x008d
            boolean r1 = r10.f338K
            if (r1 != 0) goto L_0x008d
        L_0x008b:
            r1 = r5
            goto L_0x008e
        L_0x008d:
            r1 = r4
        L_0x008e:
            r12 = r4
            r13 = r12
            r4 = r1
            r1 = r5
        L_0x0092:
            java.lang.Object r6 = r2.get(r11)
            android.support.v4.app.m$a r6 = (android.support.p017v4.app.C0276m.C0281a) r6
            if (r4 == 0) goto L_0x00a4
            android.support.v4.app.m$a r6 = m975a(r6, r2, r11)
            r6.f636a = r10
            r6.f637b = r3
            r6.f638c = r0
        L_0x00a4:
            r14 = r6
            r9 = 0
            if (r20 != 0) goto L_0x00cc
            if (r1 == 0) goto L_0x00cc
            if (r14 == 0) goto L_0x00b2
            android.support.v4.app.Fragment r1 = r14.f639d
            if (r1 != r10) goto L_0x00b2
            r14.f639d = r9
        L_0x00b2:
            android.support.v4.app.j r4 = r0.f486a
            int r1 = r10.f360k
            if (r1 >= r5) goto L_0x00cc
            int r1 = r4.f554l
            if (r1 < r5) goto L_0x00cc
            boolean r1 = r0.f505t
            if (r1 != 0) goto L_0x00cc
            r4.mo931f(r10)
            r6 = 1
            r7 = 0
            r8 = 0
            r1 = 0
            r5 = r10
            r9 = r1
            r4.mo898a(r5, r6, r7, r8, r9)
        L_0x00cc:
            if (r13 == 0) goto L_0x00de
            if (r14 == 0) goto L_0x00d4
            android.support.v4.app.Fragment r1 = r14.f639d
            if (r1 != 0) goto L_0x00de
        L_0x00d4:
            android.support.v4.app.m$a r14 = m975a(r14, r2, r11)
            r14.f639d = r10
            r14.f640e = r3
            r14.f641f = r0
        L_0x00de:
            if (r20 != 0) goto L_0x00eb
            if (r12 == 0) goto L_0x00eb
            if (r14 == 0) goto L_0x00eb
            android.support.v4.app.Fragment r0 = r14.f636a
            if (r0 != r10) goto L_0x00eb
            r0 = 0
            r14.f636a = r0
        L_0x00eb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p017v4.app.C0276m.m988a(android.support.v4.app.c, android.support.v4.app.c$a, android.util.SparseArray, boolean, boolean):void");
    }

    /* renamed from: a */
    private static C0281a m975a(C0281a aVar, SparseArray<C0281a> sparseArray, int i) {
        if (aVar != null) {
            return aVar;
        }
        C0281a aVar2 = new C0281a();
        sparseArray.put(i, aVar2);
        return aVar2;
    }
}
