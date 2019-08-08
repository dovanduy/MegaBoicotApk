package org.apache.p199a.p227i;

/* renamed from: org.apache.a.i.a */
/* compiled from: AbstractHttpParams */
public abstract class C6528a implements C6531d {
    protected C6528a() {
    }

    /* renamed from: a */
    public int mo23001a(String str, int i) {
        Object a = mo22751a(str);
        if (a == null) {
            return i;
        }
        return ((Integer) a).intValue();
    }

    /* renamed from: b */
    public C6531d mo23003b(String str, int i) {
        mo22752a(str, (Object) new Integer(i));
        return this;
    }

    /* renamed from: a */
    public boolean mo23002a(String str, boolean z) {
        Object a = mo22751a(str);
        if (a == null) {
            return z;
        }
        return ((Boolean) a).booleanValue();
    }

    /* renamed from: b */
    public C6531d mo23004b(String str, boolean z) {
        mo22752a(str, (Object) z ? Boolean.TRUE : Boolean.FALSE);
        return this;
    }

    /* renamed from: b */
    public boolean mo23005b(String str) {
        return mo23002a(str, false);
    }

    /* renamed from: c */
    public boolean mo23006c(String str) {
        return !mo23002a(str, false);
    }
}
