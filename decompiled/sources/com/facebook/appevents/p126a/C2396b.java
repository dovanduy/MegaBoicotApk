package com.facebook.appevents.p126a;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.View.AccessibilityDelegate;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import com.facebook.C2579j;
import com.facebook.C2649m;
import com.facebook.appevents.p126a.C2385a.C2387a;
import com.facebook.appevents.p126a.p127a.C2389a;
import com.facebook.appevents.p126a.p127a.C2392b;
import com.facebook.appevents.p126a.p127a.C2393c;
import com.facebook.appevents.p126a.p127a.C2393c.C2394a;
import com.facebook.appevents.p126a.p127a.C2395d;
import com.facebook.internal.C2527k;
import com.facebook.internal.C2529l;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: com.facebook.appevents.a.b */
/* compiled from: CodelessMatcher */
public class C2396b {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final String f7615a = C2396b.class.getCanonicalName();

    /* renamed from: b */
    private final Handler f7616b = new Handler(Looper.getMainLooper());

    /* renamed from: c */
    private Set<Activity> f7617c = new HashSet();

    /* renamed from: d */
    private Set<C2399b> f7618d = new HashSet();

    /* renamed from: e */
    private HashMap<String, String> f7619e = new HashMap<>();

    /* renamed from: com.facebook.appevents.a.b$a */
    /* compiled from: CodelessMatcher */
    public static class C2398a {

        /* renamed from: a */
        private WeakReference<View> f7621a;

        /* renamed from: b */
        private String f7622b;

        public C2398a(View view, String str) {
            this.f7621a = new WeakReference<>(view);
            this.f7622b = str;
        }

        /* renamed from: a */
        public View mo8805a() {
            if (this.f7621a == null) {
                return null;
            }
            return (View) this.f7621a.get();
        }

        /* renamed from: b */
        public String mo8806b() {
            return this.f7622b;
        }
    }

    /* renamed from: com.facebook.appevents.a.b$b */
    /* compiled from: CodelessMatcher */
    protected static class C2399b implements OnGlobalLayoutListener, OnScrollChangedListener, Runnable {

        /* renamed from: a */
        private WeakReference<View> f7623a;

        /* renamed from: b */
        private List<C2389a> f7624b;

        /* renamed from: c */
        private final Handler f7625c;

        /* renamed from: d */
        private HashMap<String, String> f7626d;

        /* renamed from: e */
        private final String f7627e;

        public C2399b(View view, Handler handler, HashMap<String, String> hashMap, String str) {
            this.f7623a = new WeakReference<>(view);
            this.f7625c = handler;
            this.f7626d = hashMap;
            this.f7627e = str;
            this.f7625c.postDelayed(this, 200);
        }

        public void run() {
            C2527k a = C2529l.m9632a(C2649m.m10137j());
            if (a != null && a.mo9004j()) {
                this.f7624b = C2389a.m9201a(a.mo9005k());
                if (this.f7624b != null) {
                    View view = (View) this.f7623a.get();
                    if (view != null) {
                        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                        if (viewTreeObserver.isAlive()) {
                            viewTreeObserver.addOnGlobalLayoutListener(this);
                            viewTreeObserver.addOnScrollChangedListener(this);
                        }
                        m9222a();
                    }
                }
            }
        }

        public void onGlobalLayout() {
            m9222a();
        }

        public void onScrollChanged() {
            m9222a();
        }

        /* renamed from: a */
        private void m9222a() {
            if (this.f7624b != null && this.f7623a.get() != null) {
                for (int i = 0; i < this.f7624b.size(); i++) {
                    mo8807a((C2389a) this.f7624b.get(i), (View) this.f7623a.get());
                }
            }
        }

        /* renamed from: a */
        public void mo8807a(C2389a aVar, View view) {
            if (aVar != null && view != null) {
                if (TextUtils.isEmpty(aVar.mo8800e()) || aVar.mo8800e().equals(this.f7627e)) {
                    List a = aVar.mo8796a();
                    if (a.size() <= 25) {
                        for (C2398a a2 : m9221a(aVar, view, a, 0, -1, this.f7627e)) {
                            m9223a(a2, view, aVar);
                        }
                    }
                }
            }
        }

        /* renamed from: a */
        public static List<C2398a> m9221a(C2389a aVar, View view, List<C2393c> list, int i, int i2, String str) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(".");
            sb.append(String.valueOf(i2));
            String sb2 = sb.toString();
            ArrayList arrayList = new ArrayList();
            if (view == null) {
                return arrayList;
            }
            if (i >= list.size()) {
                arrayList.add(new C2398a(view, sb2));
            } else {
                C2393c cVar = (C2393c) list.get(i);
                if (cVar.f7599a.equals("..")) {
                    ViewParent parent = view.getParent();
                    if (parent instanceof ViewGroup) {
                        List a = m9220a((ViewGroup) parent);
                        int size = a.size();
                        for (int i3 = 0; i3 < size; i3++) {
                            arrayList.addAll(m9221a(aVar, (View) a.get(i3), list, i + 1, i3, sb2));
                        }
                    }
                    return arrayList;
                } else if (cVar.f7599a.equals(".")) {
                    arrayList.add(new C2398a(view, sb2));
                    return arrayList;
                } else if (!m9224a(view, cVar, i2)) {
                    return arrayList;
                } else {
                    if (i == list.size() - 1) {
                        arrayList.add(new C2398a(view, sb2));
                    }
                }
            }
            if (view instanceof ViewGroup) {
                List a2 = m9220a((ViewGroup) view);
                int size2 = a2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    arrayList.addAll(m9221a(aVar, (View) a2.get(i4), list, i + 1, i4, sb2));
                }
            }
            return arrayList;
        }

        /* renamed from: a */
        private static boolean m9224a(View view, C2393c cVar, int i) {
            String str;
            String str2;
            if (cVar.f7600b != -1 && i != cVar.f7600b) {
                return false;
            }
            if (!view.getClass().getCanonicalName().equals(cVar.f7599a)) {
                if (!cVar.f7599a.matches(".*android\\..*")) {
                    return false;
                }
                String[] split = cVar.f7599a.split("\\.");
                if (split.length <= 0) {
                    return false;
                }
                if (!view.getClass().getSimpleName().equals(split[split.length - 1])) {
                    return false;
                }
            }
            if ((cVar.f7606h & C2394a.ID.mo8801a()) > 0 && cVar.f7601c != view.getId()) {
                return false;
            }
            if ((cVar.f7606h & C2394a.TEXT.mo8801a()) > 0 && !cVar.f7602d.equals(C2395d.m9208a(view))) {
                return false;
            }
            if ((cVar.f7606h & C2394a.DESCRIPTION.mo8801a()) > 0) {
                String str3 = cVar.f7604f;
                if (view.getContentDescription() == null) {
                    str2 = "";
                } else {
                    str2 = String.valueOf(view.getContentDescription());
                }
                if (!str3.equals(str2)) {
                    return false;
                }
            }
            if ((cVar.f7606h & C2394a.HINT.mo8801a()) > 0 && !cVar.f7605g.equals(C2395d.m9209b(view))) {
                return false;
            }
            if ((cVar.f7606h & C2394a.TAG.mo8801a()) > 0) {
                String str4 = cVar.f7603e;
                if (view.getTag() == null) {
                    str = "";
                } else {
                    str = String.valueOf(view.getTag());
                }
                if (!str4.equals(str)) {
                    return false;
                }
            }
            return true;
        }

        /* renamed from: a */
        private static List<View> m9220a(ViewGroup viewGroup) {
            ArrayList arrayList = new ArrayList();
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt.getVisibility() == 0) {
                    arrayList.add(childAt);
                }
            }
            return arrayList;
        }

        /* renamed from: a */
        private void m9223a(C2398a aVar, View view, C2389a aVar2) {
            if (aVar2 != null) {
                try {
                    View a = aVar.mo8805a();
                    if (a != null) {
                        String b = aVar.mo8806b();
                        AccessibilityDelegate c = C2395d.m9210c(a);
                        if (!this.f7626d.containsKey(b) && (c == null || !(c instanceof C2387a))) {
                            a.setAccessibilityDelegate(C2385a.m9197a(aVar2, view, a));
                            this.f7626d.put(b, aVar2.mo8798c());
                        }
                    }
                } catch (C2579j e) {
                    Log.e(C2396b.f7615a, "Failed to attach auto logging event listener.", e);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo8802a(Activity activity) {
        if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
            throw new C2579j("Can't add activity to CodelessMatcher on non-UI thread");
        }
        this.f7617c.add(activity);
        this.f7619e.clear();
        m9214b();
    }

    /* renamed from: b */
    public void mo8803b(Activity activity) {
        if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
            throw new C2579j("Can't remove activity from CodelessMatcher on non-UI thread");
        }
        this.f7617c.remove(activity);
        this.f7618d.clear();
        this.f7619e.clear();
    }

    /* renamed from: a */
    public static Bundle m9211a(C2389a aVar, View view, View view2) {
        List list;
        Bundle bundle = new Bundle();
        if (aVar == null) {
            return bundle;
        }
        List<C2392b> b = aVar.mo8797b();
        if (b != null) {
            for (C2392b bVar : b) {
                if (bVar.f7596b == null || bVar.f7596b.length() <= 0) {
                    if (bVar.f7597c.size() > 0) {
                        if (bVar.f7598d.equals("relative")) {
                            list = C2399b.m9221a(aVar, view2, bVar.f7597c, 0, -1, view2.getClass().getSimpleName());
                        } else {
                            list = C2399b.m9221a(aVar, view, bVar.f7597c, 0, -1, view.getClass().getSimpleName());
                        }
                        Iterator it = list.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            C2398a aVar2 = (C2398a) it.next();
                            if (aVar2.mo8805a() != null) {
                                String a = C2395d.m9208a(aVar2.mo8805a());
                                if (a.length() > 0) {
                                    bundle.putString(bVar.f7595a, a);
                                    break;
                                }
                            }
                        }
                    }
                } else {
                    bundle.putString(bVar.f7595a, bVar.f7596b);
                }
            }
        }
        return bundle;
    }

    /* renamed from: b */
    private void m9214b() {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            m9215c();
        } else {
            this.f7616b.post(new Runnable() {
                public void run() {
                    C2396b.this.m9215c();
                }
            });
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m9215c() {
        for (Activity activity : this.f7617c) {
            this.f7618d.add(new C2399b(activity.getWindow().getDecorView().getRootView(), this.f7616b, this.f7619e, activity.getClass().getSimpleName()));
        }
    }
}
