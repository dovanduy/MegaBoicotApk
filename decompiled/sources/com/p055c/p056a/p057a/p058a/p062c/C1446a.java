package com.p055c.p056a.p057a.p058a.p062c;

import com.p055c.p056a.p057a.p058a.p060b.C1444i;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* renamed from: com.c.a.a.a.c.a */
public class C1446a {

    /* renamed from: a */
    private static C1446a f4409a = new C1446a();

    /* renamed from: b */
    private final ArrayList<C1444i> f4410b = new ArrayList<>();

    /* renamed from: c */
    private final ArrayList<C1444i> f4411c = new ArrayList<>();

    private C1446a() {
    }

    /* renamed from: a */
    public static C1446a m5984a() {
        return f4409a;
    }

    /* renamed from: a */
    public void mo6521a(C1444i iVar) {
        this.f4410b.add(iVar);
    }

    /* renamed from: b */
    public Collection<C1444i> mo6522b() {
        return Collections.unmodifiableCollection(this.f4410b);
    }

    /* renamed from: b */
    public void mo6523b(C1444i iVar) {
        boolean d = mo6526d();
        this.f4411c.add(iVar);
        if (!d) {
            C1453e.m6020a().mo6551b();
        }
    }

    /* renamed from: c */
    public Collection<C1444i> mo6524c() {
        return Collections.unmodifiableCollection(this.f4411c);
    }

    /* renamed from: c */
    public void mo6525c(C1444i iVar) {
        boolean d = mo6526d();
        this.f4410b.remove(iVar);
        this.f4411c.remove(iVar);
        if (d && !mo6526d()) {
            C1453e.m6020a().mo6552c();
        }
    }

    /* renamed from: d */
    public boolean mo6526d() {
        return this.f4411c.size() > 0;
    }
}
