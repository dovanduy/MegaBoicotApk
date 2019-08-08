package com.google.firebase.iid;

import android.support.annotation.Keep;
import com.google.firebase.C4928b;
import com.google.firebase.components.C4937a;
import com.google.firebase.components.C4942d;
import com.google.firebase.components.C4943e;
import com.google.firebase.iid.p152a.C4962a;
import com.google.firebase.p149a.C4921d;
import java.util.Arrays;
import java.util.List;

@Keep
public final class Registrar implements C4942d {

    /* renamed from: com.google.firebase.iid.Registrar$a */
    private static class C4960a implements C4962a {

        /* renamed from: a */
        private final FirebaseInstanceId f16170a;

        public C4960a(FirebaseInstanceId firebaseInstanceId) {
            this.f16170a = firebaseInstanceId;
        }
    }

    @Keep
    public final List<C4937a<?>> getComponents() {
        return Arrays.asList(new C4937a[]{C4937a.m21518a(FirebaseInstanceId.class).mo17858a(C4943e.m21542a(C4928b.class)).mo17858a(C4943e.m21542a(C4921d.class)).mo17857a(C5006r.f16262a).mo17856a().mo17860c(), C4937a.m21518a(C4962a.class).mo17858a(C4943e.m21542a(FirebaseInstanceId.class)).mo17857a(C5007s.f16263a).mo17860c()});
    }
}
