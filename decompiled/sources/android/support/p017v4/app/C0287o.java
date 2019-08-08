package android.support.p017v4.app;

import android.graphics.Rect;
import android.support.p017v4.view.C0595r;
import android.support.p017v4.view.C0600t;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: android.support.v4.app.o */
/* compiled from: FragmentTransitionImpl */
public abstract class C0287o {
    /* renamed from: a */
    public abstract Object mo989a(Object obj, Object obj2, Object obj3);

    /* renamed from: a */
    public abstract void mo990a(ViewGroup viewGroup, Object obj);

    /* renamed from: a */
    public abstract void mo991a(Object obj, Rect rect);

    /* renamed from: a */
    public abstract void mo992a(Object obj, View view);

    /* renamed from: a */
    public abstract void mo993a(Object obj, View view, ArrayList<View> arrayList);

    /* renamed from: a */
    public abstract void mo994a(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3);

    /* renamed from: a */
    public abstract void mo995a(Object obj, ArrayList<View> arrayList);

    /* renamed from: a */
    public abstract void mo996a(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    /* renamed from: a */
    public abstract boolean mo997a(Object obj);

    /* renamed from: b */
    public abstract Object mo998b(Object obj);

    /* renamed from: b */
    public abstract Object mo999b(Object obj, Object obj2, Object obj3);

    /* renamed from: b */
    public abstract void mo1000b(Object obj, View view);

    /* renamed from: b */
    public abstract void mo1001b(Object obj, View view, ArrayList<View> arrayList);

    /* renamed from: b */
    public abstract void mo1002b(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    /* renamed from: c */
    public abstract Object mo1003c(Object obj);

    /* renamed from: c */
    public abstract void mo1004c(Object obj, View view);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo1018a(View view, Rect rect) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        rect.set(iArr[0], iArr[1], iArr[0] + view.getWidth(), iArr[1] + view.getHeight());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public ArrayList<String> mo1017a(ArrayList<View> arrayList) {
        ArrayList<String> arrayList2 = new ArrayList<>();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            View view = (View) arrayList.get(i);
            arrayList2.add(C0595r.m2265n(view));
            C0595r.m2244a(view, (String) null);
        }
        return arrayList2;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo1019a(View view, ArrayList<View> arrayList, ArrayList<View> arrayList2, ArrayList<String> arrayList3, Map<String, String> map) {
        final int size = arrayList2.size();
        final ArrayList arrayList4 = new ArrayList();
        for (int i = 0; i < size; i++) {
            View view2 = (View) arrayList.get(i);
            String n = C0595r.m2265n(view2);
            arrayList4.add(n);
            if (n != null) {
                C0595r.m2244a(view2, (String) null);
                String str = (String) map.get(n);
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        break;
                    } else if (str.equals(arrayList3.get(i2))) {
                        C0595r.m2244a((View) arrayList2.get(i2), n);
                        break;
                    } else {
                        i2++;
                    }
                }
            }
        }
        final ArrayList<View> arrayList5 = arrayList2;
        final ArrayList<String> arrayList6 = arrayList3;
        final ArrayList<View> arrayList7 = arrayList;
        C02881 r0 = new Runnable() {
            public void run() {
                for (int i = 0; i < size; i++) {
                    C0595r.m2244a((View) arrayList5.get(i), (String) arrayList6.get(i));
                    C0595r.m2244a((View) arrayList7.get(i), (String) arrayList4.get(i));
                }
            }
        };
        C0316y.m1167a(view, r0);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo1022a(ArrayList<View> arrayList, View view) {
        if (view.getVisibility() != 0) {
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (C0600t.m2291a(viewGroup)) {
                arrayList.add(viewGroup);
                return;
            }
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                mo1022a(arrayList, viewGroup.getChildAt(i));
            }
            return;
        }
        arrayList.add(view);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo1023a(Map<String, View> map, View view) {
        if (view.getVisibility() == 0) {
            String n = C0595r.m2265n(view);
            if (n != null) {
                map.put(n, view);
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    mo1023a(map, viewGroup.getChildAt(i));
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo1020a(View view, final ArrayList<View> arrayList, final Map<String, String> map) {
        C0316y.m1167a(view, new Runnable() {
            public void run() {
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    View view = (View) arrayList.get(i);
                    String n = C0595r.m2265n(view);
                    if (n != null) {
                        C0595r.m2244a(view, C0287o.m1021a(map, n));
                    }
                }
            }
        });
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo1021a(ViewGroup viewGroup, final ArrayList<View> arrayList, final Map<String, String> map) {
        C0316y.m1167a(viewGroup, new Runnable() {
            public void run() {
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    View view = (View) arrayList.get(i);
                    C0595r.m2244a(view, (String) map.get(C0595r.m2265n(view)));
                }
            }
        });
    }

    /* renamed from: a */
    protected static void m1022a(List<View> list, View view) {
        int size = list.size();
        if (!m1024a(list, view, size)) {
            list.add(view);
            for (int i = size; i < list.size(); i++) {
                View view2 = (View) list.get(i);
                if (view2 instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view2;
                    int childCount = viewGroup.getChildCount();
                    for (int i2 = 0; i2 < childCount; i2++) {
                        View childAt = viewGroup.getChildAt(i2);
                        if (!m1024a(list, childAt, size)) {
                            list.add(childAt);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private static boolean m1024a(List<View> list, View view, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (list.get(i2) == view) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    protected static boolean m1023a(List list) {
        return list == null || list.isEmpty();
    }

    /* renamed from: a */
    static String m1021a(Map<String, String> map, String str) {
        for (Entry entry : map.entrySet()) {
            if (str.equals(entry.getValue())) {
                return (String) entry.getKey();
            }
        }
        return null;
    }
}
