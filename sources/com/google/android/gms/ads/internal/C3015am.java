package com.google.android.gms.ads.internal;

import com.google.android.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import com.google.android.gms.internal.ads.C3718cm;
import com.google.android.gms.internal.ads.C3900je;
import com.google.android.gms.internal.ads.C3909jn;
import com.google.android.gms.internal.ads.zzjj;
import java.lang.ref.WeakReference;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
@C3718cm
/* renamed from: com.google.android.gms.ads.internal.am */
public final class C3015am {

    /* renamed from: a */
    private final C3017ao f8777a;

    /* renamed from: b */
    private final Runnable f8778b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public zzjj f8779c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public boolean f8780d;

    /* renamed from: e */
    private boolean f8781e;

    /* renamed from: f */
    private long f8782f;

    public C3015am(C3002a aVar) {
        this(aVar, new C3017ao(C3909jn.f13411a));
    }

    private C3015am(C3002a aVar, C3017ao aoVar) {
        this.f8780d = false;
        this.f8781e = false;
        this.f8782f = 0;
        this.f8777a = aoVar;
        this.f8778b = new C3016an(this, new WeakReference(aVar));
    }

    /* renamed from: a */
    public final void mo12491a() {
        this.f8780d = false;
        this.f8777a.mo12500a(this.f8778b);
    }

    /* renamed from: a */
    public final void mo12492a(zzjj zzjj) {
        this.f8779c = zzjj;
    }

    /* renamed from: a */
    public final void mo12493a(zzjj zzjj, long j) {
        if (this.f8780d) {
            C3900je.m17435e("An ad refresh is already scheduled.");
            return;
        }
        this.f8779c = zzjj;
        this.f8780d = true;
        this.f8782f = j;
        if (!this.f8781e) {
            StringBuilder sb = new StringBuilder(65);
            sb.append("Scheduling ad refresh ");
            sb.append(j);
            sb.append(" milliseconds from now.");
            C3900je.m17433d(sb.toString());
            this.f8777a.mo12501a(this.f8778b, j);
        }
    }

    /* renamed from: b */
    public final void mo12494b() {
        this.f8781e = true;
        if (this.f8780d) {
            this.f8777a.mo12500a(this.f8778b);
        }
    }

    /* renamed from: b */
    public final void mo12495b(zzjj zzjj) {
        mo12493a(zzjj, (long) ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS);
    }

    /* renamed from: c */
    public final void mo12496c() {
        this.f8781e = false;
        if (this.f8780d) {
            this.f8780d = false;
            mo12493a(this.f8779c, this.f8782f);
        }
    }

    /* renamed from: d */
    public final void mo12497d() {
        this.f8781e = false;
        this.f8780d = false;
        if (!(this.f8779c == null || this.f8779c.f14527c == null)) {
            this.f8779c.f14527c.remove("_ad");
        }
        mo12493a(this.f8779c, 0);
    }

    /* renamed from: e */
    public final boolean mo12498e() {
        return this.f8780d;
    }
}
