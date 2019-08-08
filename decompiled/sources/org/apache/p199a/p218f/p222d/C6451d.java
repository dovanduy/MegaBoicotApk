package org.apache.p199a.p218f.p222d;

import java.io.Serializable;
import java.util.Date;
import org.apache.p199a.p214d.C6354m;

/* renamed from: org.apache.a.f.d.d */
/* compiled from: BasicClientCookie2 */
public class C6451d extends C6450c implements Serializable, C6354m {

    /* renamed from: a */
    private String f21116a;

    /* renamed from: b */
    private int[] f21117b;

    /* renamed from: c */
    private boolean f21118c;

    public C6451d(String str, String str2) {
        super(str, str2);
    }

    /* renamed from: e */
    public int[] mo22580e() {
        return this.f21117b;
    }

    /* renamed from: a */
    public void mo22610a(int[] iArr) {
        this.f21117b = iArr;
    }

    /* renamed from: a_ */
    public void mo22611a_(String str) {
        this.f21116a = str;
    }

    /* renamed from: b */
    public void mo22612b(boolean z) {
        this.f21118c = z;
    }

    /* renamed from: a */
    public boolean mo22576a(Date date) {
        return this.f21118c || super.mo22576a(date);
    }

    public Object clone() throws CloneNotSupportedException {
        C6451d dVar = (C6451d) super.clone();
        if (this.f21117b != null) {
            dVar.f21117b = (int[]) this.f21117b.clone();
        }
        return dVar;
    }
}
