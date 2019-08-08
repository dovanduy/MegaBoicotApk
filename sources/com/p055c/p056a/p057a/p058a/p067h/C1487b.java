package com.p055c.p056a.p057a.p058a.p067h;

import android.view.View;
import android.view.ViewParent;
import com.p055c.p056a.p057a.p058a.p060b.C1444i;
import com.p055c.p056a.p057a.p058a.p062c.C1446a;
import com.p055c.p056a.p057a.p058a.p064e.C1466f;
import com.p055c.p056a.p057a.p058a.p065f.C1467a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

/* renamed from: com.c.a.a.a.h.b */
public class C1487b {

    /* renamed from: a */
    private final HashMap<View, String> f4481a = new HashMap<>();

    /* renamed from: b */
    private final HashMap<View, ArrayList<String>> f4482b = new HashMap<>();

    /* renamed from: c */
    private final HashSet<View> f4483c = new HashSet<>();

    /* renamed from: d */
    private final HashSet<String> f4484d = new HashSet<>();

    /* renamed from: e */
    private final HashSet<String> f4485e = new HashSet<>();

    /* renamed from: f */
    private boolean f4486f;

    /* renamed from: a */
    private void m6145a(View view, C1444i iVar) {
        ArrayList arrayList = (ArrayList) this.f4482b.get(view);
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.f4482b.put(view, arrayList);
        }
        arrayList.add(iVar.mo6508g());
    }

    /* renamed from: a */
    private void m6146a(C1444i iVar) {
        for (C1467a aVar : iVar.mo6505d()) {
            View view = (View) aVar.get();
            if (view != null) {
                m6145a(view, iVar);
            }
        }
    }

    /* renamed from: d */
    private boolean m6147d(View view) {
        if (!view.hasWindowFocus()) {
            return false;
        }
        HashSet hashSet = new HashSet();
        while (view != null) {
            if (!C1466f.m6083d(view)) {
                return false;
            }
            hashSet.add(view);
            ViewParent parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        this.f4483c.addAll(hashSet);
        return true;
    }

    /* renamed from: a */
    public String mo6603a(View view) {
        if (this.f4481a.size() == 0) {
            return null;
        }
        String str = (String) this.f4481a.get(view);
        if (str != null) {
            this.f4481a.remove(view);
        }
        return str;
    }

    /* renamed from: a */
    public HashSet<String> mo6604a() {
        return this.f4484d;
    }

    /* renamed from: b */
    public ArrayList<String> mo6605b(View view) {
        if (this.f4482b.size() == 0) {
            return null;
        }
        ArrayList<String> arrayList = (ArrayList) this.f4482b.get(view);
        if (arrayList != null) {
            this.f4482b.remove(view);
            Collections.sort(arrayList);
        }
        return arrayList;
    }

    /* renamed from: b */
    public HashSet<String> mo6606b() {
        return this.f4485e;
    }

    /* renamed from: c */
    public C1489d mo6607c(View view) {
        return this.f4483c.contains(view) ? C1489d.PARENT_VIEW : this.f4486f ? C1489d.OBSTRUCTION_VIEW : C1489d.UNDERLYING_VIEW;
    }

    /* renamed from: c */
    public void mo6608c() {
        C1446a a = C1446a.m5984a();
        if (a != null) {
            for (C1444i iVar : a.mo6524c()) {
                View h = iVar.mo6509h();
                if (iVar.mo6510i()) {
                    if (h == null || !m6147d(h)) {
                        this.f4485e.add(iVar.mo6508g());
                    } else {
                        this.f4484d.add(iVar.mo6508g());
                        this.f4481a.put(h, iVar.mo6508g());
                        m6146a(iVar);
                    }
                }
            }
        }
    }

    /* renamed from: d */
    public void mo6609d() {
        this.f4481a.clear();
        this.f4482b.clear();
        this.f4483c.clear();
        this.f4484d.clear();
        this.f4485e.clear();
        this.f4486f = false;
    }

    /* renamed from: e */
    public void mo6610e() {
        this.f4486f = true;
    }
}
