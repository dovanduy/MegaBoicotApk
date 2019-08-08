package com.p055c.p056a.p057a.p058a.p064e;

import android.text.TextUtils;
import com.p055c.p056a.p057a.p058a.C1428a;
import com.p055c.p056a.p057a.p058a.p060b.C1441f;
import com.p055c.p056a.p057a.p058a.p060b.C1444i;

/* renamed from: com.c.a.a.a.e.e */
public class C1465e {
    /* renamed from: a */
    public static void m6067a() {
        if (!C1428a.m5906b()) {
            throw new IllegalStateException("Method called before OMID activation");
        }
    }

    /* renamed from: a */
    public static void m6068a(C1441f fVar) {
        if (fVar.equals(C1441f.NONE)) {
            throw new IllegalArgumentException("Impression owner is none");
        }
    }

    /* renamed from: a */
    public static void m6069a(C1444i iVar) {
        if (iVar.mo6511j()) {
            throw new IllegalStateException("AdSession is started");
        }
    }

    /* renamed from: a */
    public static void m6070a(Object obj, String str) {
        if (obj == null) {
            throw new IllegalArgumentException(str);
        }
    }

    /* renamed from: a */
    public static void m6071a(String str, int i, String str2) {
        if (str.length() > i) {
            throw new IllegalArgumentException(str2);
        }
    }

    /* renamed from: a */
    public static void m6072a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException(str2);
        }
    }

    /* renamed from: b */
    public static void m6073b(C1444i iVar) {
        if (iVar.mo6512k()) {
            throw new IllegalStateException("AdSession is finished");
        }
    }

    /* renamed from: c */
    public static void m6074c(C1444i iVar) {
        m6079h(iVar);
        m6073b(iVar);
    }

    /* renamed from: d */
    public static void m6075d(C1444i iVar) {
        if (iVar.mo6507f().mo6573d() != null) {
            throw new IllegalStateException("AdEvents already exists for AdSession");
        }
    }

    /* renamed from: e */
    public static void m6076e(C1444i iVar) {
        if (iVar.mo6507f().mo6574e() != null) {
            throw new IllegalStateException("VideoEvents already exists for AdSession");
        }
    }

    /* renamed from: f */
    public static void m6077f(C1444i iVar) {
        if (!iVar.mo6513l()) {
            throw new IllegalStateException("Impression event is not expected from the Native AdSession");
        }
    }

    /* renamed from: g */
    public static void m6078g(C1444i iVar) {
        if (!iVar.mo6514m()) {
            throw new IllegalStateException("Cannot create VideoEvents for JavaScript AdSession");
        }
    }

    /* renamed from: h */
    private static void m6079h(C1444i iVar) {
        if (!iVar.mo6511j()) {
            throw new IllegalStateException("AdSession is not started");
        }
    }
}
