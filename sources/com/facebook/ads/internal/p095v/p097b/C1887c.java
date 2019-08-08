package com.facebook.ads.internal.p095v.p097b;

import com.facebook.ads.internal.p095v.p097b.p098a.C1876a;
import com.facebook.ads.internal.p095v.p097b.p098a.C1878c;
import java.io.File;

/* renamed from: com.facebook.ads.internal.v.b.c */
class C1887c {

    /* renamed from: a */
    public final File f5944a;

    /* renamed from: b */
    public final C1878c f5945b;

    /* renamed from: c */
    public final C1876a f5946c;

    C1887c(File file, C1878c cVar, C1876a aVar) {
        this.f5944a = file;
        this.f5945b = cVar;
        this.f5946c = aVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public File mo7924a(String str) {
        return new File(this.f5944a, this.f5945b.mo7917a(str));
    }
}
