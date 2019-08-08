package com.google.android.gms.ads;

import android.location.Location;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.mediation.C3144b;
import com.google.android.gms.internal.ads.aql;
import com.google.android.gms.internal.ads.aqm;
import java.util.Date;

/* renamed from: com.google.android.gms.ads.c */
public final class C2971c {

    /* renamed from: a */
    private final aql f8689a;

    /* renamed from: com.google.android.gms.ads.c$a */
    public static final class C2972a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final aqm f8690a = new aqm();

        public C2972a() {
            this.f8690a.mo14606b("B3EEABB8EE11C2BE770B684D95219ECB");
        }

        /* renamed from: a */
        public final C2972a mo12203a(int i) {
            this.f8690a.mo14600a(i);
            return this;
        }

        /* renamed from: a */
        public final C2972a mo12204a(Location location) {
            this.f8690a.mo14601a(location);
            return this;
        }

        /* renamed from: a */
        public final C2972a mo12205a(Class<? extends C3144b> cls, Bundle bundle) {
            this.f8690a.mo14602a(cls, bundle);
            if (cls.equals(AdMobAdapter.class) && bundle.getBoolean("_emulatorLiveAds")) {
                this.f8690a.mo14608c("B3EEABB8EE11C2BE770B684D95219ECB");
            }
            return this;
        }

        /* renamed from: a */
        public final C2972a mo12206a(String str) {
            this.f8690a.mo14603a(str);
            return this;
        }

        /* renamed from: a */
        public final C2972a mo12207a(Date date) {
            this.f8690a.mo14604a(date);
            return this;
        }

        /* renamed from: a */
        public final C2972a mo12208a(boolean z) {
            this.f8690a.mo14605a(z);
            return this;
        }

        /* renamed from: a */
        public final C2971c mo12209a() {
            return new C2971c(this);
        }

        /* renamed from: b */
        public final C2972a mo12210b(String str) {
            this.f8690a.mo14606b(str);
            return this;
        }

        /* renamed from: b */
        public final C2972a mo12211b(boolean z) {
            this.f8690a.mo14607b(z);
            return this;
        }
    }

    private C2971c(C2972a aVar) {
        this.f8689a = new aql(aVar.f8690a);
    }

    /* renamed from: a */
    public final aql mo12202a() {
        return this.f8689a;
    }
}
