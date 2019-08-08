package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

final class ach implements acg {
    ach() {
    }

    /* renamed from: a */
    public final int mo14056a(int i, Object obj, Object obj2) {
        acf acf = (acf) obj;
        if (acf.isEmpty()) {
            return 0;
        }
        Iterator it = acf.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        Entry entry = (Entry) it.next();
        entry.getKey();
        entry.getValue();
        throw new NoSuchMethodError();
    }

    /* renamed from: a */
    public final Object mo14057a(Object obj, Object obj2) {
        acf acf = (acf) obj;
        acf acf2 = (acf) obj2;
        if (!acf2.isEmpty()) {
            if (!acf.mo14049d()) {
                acf = acf.mo14046b();
            }
            acf.mo14045a(acf2);
        }
        return acf;
    }

    /* renamed from: a */
    public final Map<?, ?> mo14058a(Object obj) {
        return (acf) obj;
    }

    /* renamed from: b */
    public final Map<?, ?> mo14059b(Object obj) {
        return (acf) obj;
    }

    /* renamed from: c */
    public final boolean mo14060c(Object obj) {
        return !((acf) obj).mo14049d();
    }

    /* renamed from: d */
    public final Object mo14061d(Object obj) {
        ((acf) obj).mo14047c();
        return obj;
    }

    /* renamed from: e */
    public final Object mo14062e(Object obj) {
        return acf.m13395a().mo14046b();
    }

    /* renamed from: f */
    public final ace<?, ?> mo14063f(Object obj) {
        throw new NoSuchMethodError();
    }
}
