package com.facebook.appevents;

import com.facebook.AccessToken;
import com.facebook.C2649m;
import com.facebook.internal.C2479ad;
import java.io.Serializable;

/* renamed from: com.facebook.appevents.a */
/* compiled from: AccessTokenAppIdPair */
class C2382a implements Serializable {

    /* renamed from: a */
    private final String f7565a;

    /* renamed from: b */
    private final String f7566b;

    /* renamed from: com.facebook.appevents.a$a */
    /* compiled from: AccessTokenAppIdPair */
    static class C2384a implements Serializable {

        /* renamed from: a */
        private final String f7567a;

        /* renamed from: b */
        private final String f7568b;

        private C2384a(String str, String str2) {
            this.f7567a = str;
            this.f7568b = str2;
        }

        private Object readResolve() {
            return new C2382a(this.f7567a, this.f7568b);
        }
    }

    public C2382a(AccessToken accessToken) {
        this(accessToken.mo6614d(), C2649m.m10137j());
    }

    public C2382a(String str, String str2) {
        if (C2479ad.m9456a(str)) {
            str = null;
        }
        this.f7565a = str;
        this.f7566b = str2;
    }

    /* renamed from: a */
    public String mo8790a() {
        return this.f7565a;
    }

    /* renamed from: b */
    public String mo8791b() {
        return this.f7566b;
    }

    public int hashCode() {
        int i = 0;
        int hashCode = this.f7565a == null ? 0 : this.f7565a.hashCode();
        if (this.f7566b != null) {
            i = this.f7566b.hashCode();
        }
        return hashCode ^ i;
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (!(obj instanceof C2382a)) {
            return false;
        }
        C2382a aVar = (C2382a) obj;
        if (C2479ad.m9455a(aVar.f7565a, this.f7565a) && C2479ad.m9455a(aVar.f7566b, this.f7566b)) {
            z = true;
        }
        return z;
    }

    private Object writeReplace() {
        return new C2384a(this.f7565a, this.f7566b);
    }
}
