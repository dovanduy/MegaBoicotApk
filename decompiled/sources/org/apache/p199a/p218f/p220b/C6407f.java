package org.apache.p199a.p218f.p220b;

import org.apache.p199a.p227i.C6528a;
import org.apache.p199a.p227i.C6531d;

/* renamed from: org.apache.a.f.b.f */
/* compiled from: ClientParamsStack */
public class C6407f extends C6528a {

    /* renamed from: a */
    protected final C6531d f21014a;

    /* renamed from: b */
    protected final C6531d f21015b;

    /* renamed from: c */
    protected final C6531d f21016c;

    /* renamed from: d */
    protected final C6531d f21017d;

    public C6407f(C6531d dVar, C6531d dVar2, C6531d dVar3, C6531d dVar4) {
        this.f21014a = dVar;
        this.f21015b = dVar2;
        this.f21016c = dVar3;
        this.f21017d = dVar4;
    }

    /* renamed from: a */
    public Object mo22751a(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Parameter name must not be null.");
        }
        Object obj = null;
        if (this.f21017d != null) {
            obj = this.f21017d.mo22751a(str);
        }
        if (obj == null && this.f21016c != null) {
            obj = this.f21016c.mo22751a(str);
        }
        if (obj == null && this.f21015b != null) {
            obj = this.f21015b.mo22751a(str);
        }
        return (obj != null || this.f21014a == null) ? obj : this.f21014a.mo22751a(str);
    }

    /* renamed from: a */
    public C6531d mo22752a(String str, Object obj) throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Setting parameters in a stack is not supported.");
    }
}
