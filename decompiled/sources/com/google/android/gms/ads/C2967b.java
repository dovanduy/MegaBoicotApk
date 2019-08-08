package com.google.android.gms.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.C2983b;
import com.google.android.gms.ads.formats.C2986d.C2987a;
import com.google.android.gms.ads.formats.C2988e.C2989a;
import com.google.android.gms.ads.formats.C2990f.C2991a;
import com.google.android.gms.ads.formats.C2990f.C2992b;
import com.google.android.gms.ads.formats.C2993g.C2994a;
import com.google.android.gms.common.internal.C3513t;
import com.google.android.gms.internal.ads.C3987mk;
import com.google.android.gms.internal.ads.any;
import com.google.android.gms.internal.ads.aoe;
import com.google.android.gms.internal.ads.aoq;
import com.google.android.gms.internal.ads.aow;
import com.google.android.gms.internal.ads.aoz;
import com.google.android.gms.internal.ads.apc;
import com.google.android.gms.internal.ads.aql;
import com.google.android.gms.internal.ads.avi;
import com.google.android.gms.internal.ads.avl;
import com.google.android.gms.internal.ads.avy;
import com.google.android.gms.internal.ads.awj;
import com.google.android.gms.internal.ads.awk;
import com.google.android.gms.internal.ads.awl;
import com.google.android.gms.internal.ads.awn;
import com.google.android.gms.internal.ads.awo;
import com.google.android.gms.internal.ads.bbz;
import com.google.android.gms.internal.ads.bca;
import com.google.android.gms.internal.ads.zzpl;

/* renamed from: com.google.android.gms.ads.b */
public class C2967b {

    /* renamed from: a */
    private final aoe f8677a;

    /* renamed from: b */
    private final Context f8678b;

    /* renamed from: c */
    private final aoz f8679c;

    /* renamed from: com.google.android.gms.ads.b$a */
    public static class C2968a {

        /* renamed from: a */
        private final Context f8680a;

        /* renamed from: b */
        private final apc f8681b;

        private C2968a(Context context, apc apc) {
            this.f8680a = context;
            this.f8681b = apc;
        }

        public C2968a(Context context, String str) {
            this((Context) C3513t.m12626a(context, (Object) "context cannot be null"), aoq.m14616b().mo14546a(context, str, (bca) new bbz()));
        }

        /* renamed from: a */
        public C2968a mo12195a(C2960a aVar) {
            try {
                this.f8681b.mo12640a((aow) new any(aVar));
                return this;
            } catch (RemoteException e) {
                C3987mk.m17432c("Failed to set AdListener.", e);
                return this;
            }
        }

        /* renamed from: a */
        public C2968a mo12196a(C2983b bVar) {
            try {
                this.f8681b.mo12646a(new zzpl(bVar));
                return this;
            } catch (RemoteException e) {
                C3987mk.m17432c("Failed to specify native ad options", e);
                return this;
            }
        }

        /* renamed from: a */
        public C2968a mo12197a(C2987a aVar) {
            try {
                this.f8681b.mo12642a((avi) new awj(aVar));
                return this;
            } catch (RemoteException e) {
                C3987mk.m17432c("Failed to add app install ad listener", e);
                return this;
            }
        }

        /* renamed from: a */
        public C2968a mo12198a(C2989a aVar) {
            try {
                this.f8681b.mo12643a((avl) new awk(aVar));
                return this;
            } catch (RemoteException e) {
                C3987mk.m17432c("Failed to add content ad listener", e);
                return this;
            }
        }

        /* renamed from: a */
        public C2968a mo12199a(C2994a aVar) {
            try {
                this.f8681b.mo12645a((avy) new awo(aVar));
                return this;
            } catch (RemoteException e) {
                C3987mk.m17432c("Failed to add google native ad listener", e);
                return this;
            }
        }

        /* renamed from: a */
        public C2968a mo12200a(String str, C2992b bVar, C2991a aVar) {
            try {
                this.f8681b.mo12647a(str, new awn(bVar), aVar == null ? null : new awl(aVar));
                return this;
            } catch (RemoteException e) {
                C3987mk.m17432c("Failed to add custom template ad listener", e);
                return this;
            }
        }

        /* renamed from: a */
        public C2967b mo12201a() {
            try {
                return new C2967b(this.f8680a, this.f8681b.mo12638a());
            } catch (RemoteException e) {
                C3987mk.m17430b("Failed to build AdLoader.", e);
                return null;
            }
        }
    }

    C2967b(Context context, aoz aoz) {
        this(context, aoz, aoe.f11598a);
    }

    private C2967b(Context context, aoz aoz, aoe aoe) {
        this.f8678b = context;
        this.f8679c = aoz;
        this.f8677a = aoe;
    }

    /* renamed from: a */
    private final void m10611a(aql aql) {
        try {
            this.f8679c.mo12632a(aoe.m14581a(this.f8678b, aql));
        } catch (RemoteException e) {
            C3987mk.m17430b("Failed to load ad.", e);
        }
    }

    /* renamed from: a */
    public void mo12194a(C2971c cVar) {
        m10611a(cVar.mo12202a());
    }
}
