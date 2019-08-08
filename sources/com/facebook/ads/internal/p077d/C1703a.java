package com.facebook.ads.internal.p077d;

import android.os.Bundle;
import android.view.View;
import com.facebook.ads.internal.p115w.p117b.C2331r;
import com.facebook.ads.internal.p125x.C2376a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.facebook.ads.internal.d.a */
public final class C1703a implements C2331r<Bundle> {

    /* renamed from: a */
    private final View f5325a;

    /* renamed from: b */
    private final List<C1707d> f5326b;

    /* renamed from: c */
    private C1705c f5327c;

    public C1703a(View view, List<C1704b> list) {
        this.f5325a = view;
        this.f5326b = new ArrayList(list.size());
        for (C1704b dVar : list) {
            this.f5326b.add(new C1707d(dVar));
        }
        this.f5327c = new C1705c();
    }

    public C1703a(View view, List<C1704b> list, Bundle bundle) {
        this.f5325a = view;
        this.f5326b = new ArrayList(list.size());
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("TESTS");
        for (int i = 0; i < list.size(); i++) {
            this.f5326b.add(new C1707d((C1704b) list.get(i), (Bundle) parcelableArrayList.get(i)));
        }
        this.f5327c = (C1705c) bundle.getSerializable("STATISTICS");
    }

    /* renamed from: a */
    public void mo7438a() {
        this.f5327c.mo7442a();
    }

    /* renamed from: a */
    public void mo7439a(double d, double d2) {
        if (d2 >= 0.0d) {
            this.f5327c.mo7445b(d, d2);
        }
        double c = (double) C2376a.m9163a(this.f5325a, 0).mo8787c();
        this.f5327c.mo7443a(d, c);
        for (C1707d a : this.f5326b) {
            a.mo7458a(d, c);
        }
    }

    /* renamed from: b */
    public void mo7440b() {
        this.f5327c.mo7444b();
        for (C1707d a : this.f5326b) {
            a.mo7457a();
        }
    }

    /* renamed from: c */
    public C1705c mo7441c() {
        return this.f5327c;
    }

    /* renamed from: g */
    public Bundle mo7259g() {
        Bundle bundle = new Bundle();
        bundle.putSerializable("STATISTICS", this.f5327c);
        ArrayList arrayList = new ArrayList(this.f5326b.size());
        for (C1707d g : this.f5326b) {
            arrayList.add(g.mo7259g());
        }
        bundle.putParcelableArrayList("TESTS", arrayList);
        return bundle;
    }
}
