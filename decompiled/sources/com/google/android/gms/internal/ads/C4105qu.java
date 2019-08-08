package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.appnext.base.p046b.C1245d;
import com.google.android.gms.common.util.C3554f;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;

@C3718cm
/* renamed from: com.google.android.gms.internal.ads.qu */
public final class C4105qu extends aqf {

    /* renamed from: a */
    private final C4061pd f13918a;

    /* renamed from: b */
    private final Object f13919b = new Object();

    /* renamed from: c */
    private final boolean f13920c;

    /* renamed from: d */
    private final boolean f13921d;

    /* renamed from: e */
    private final float f13922e;
    @GuardedBy("lock")

    /* renamed from: f */
    private int f13923f;
    @GuardedBy("lock")

    /* renamed from: g */
    private aqh f13924g;
    @GuardedBy("lock")

    /* renamed from: h */
    private boolean f13925h;
    @GuardedBy("lock")

    /* renamed from: i */
    private boolean f13926i = true;
    @GuardedBy("lock")

    /* renamed from: j */
    private float f13927j;
    @GuardedBy("lock")

    /* renamed from: k */
    private float f13928k;
    @GuardedBy("lock")

    /* renamed from: l */
    private boolean f13929l = true;
    @GuardedBy("lock")

    /* renamed from: m */
    private boolean f13930m;
    @GuardedBy("lock")

    /* renamed from: n */
    private boolean f13931n;

    public C4105qu(C4061pd pdVar, float f, boolean z, boolean z2) {
        this.f13918a = pdVar;
        this.f13922e = f;
        this.f13920c = z;
        this.f13921d = z2;
    }

    /* renamed from: a */
    private final void m17907a(String str, Map<String, String> map) {
        HashMap hashMap = map == null ? new HashMap() : new HashMap(map);
        hashMap.put(C1245d.f3959jb, str);
        C4014nk.f13617a.execute(new C4106qv(this, hashMap));
    }

    /* renamed from: a */
    public final void mo14564a() {
        m17907a("play", null);
    }

    /* renamed from: a */
    public final void mo15983a(float f, int i, boolean z, float f2) {
        boolean z2;
        int i2;
        synchronized (this.f13919b) {
            this.f13927j = f;
            z2 = this.f13926i;
            this.f13926i = z;
            i2 = this.f13923f;
            this.f13923f = i;
            float f3 = this.f13928k;
            this.f13928k = f2;
            if (Math.abs(this.f13928k - f3) > 1.0E-4f) {
                this.f13918a.getView().invalidate();
            }
        }
        Executor executor = C4014nk.f13617a;
        C4107qw qwVar = new C4107qw(this, i2, i, z2, z);
        executor.execute(qwVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo15984a(int i, int i2, boolean z, boolean z2) {
        synchronized (this.f13919b) {
            boolean z3 = false;
            boolean z4 = i != i2;
            boolean z5 = !this.f13925h && i2 == 1;
            boolean z6 = z4 && i2 == 1;
            boolean z7 = z4 && i2 == 2;
            boolean z8 = z4 && i2 == 3;
            boolean z9 = z != z2;
            if (this.f13925h || z5) {
                z3 = true;
            }
            this.f13925h = z3;
            if (this.f13924g != null) {
                if (z5) {
                    try {
                        this.f13924g.mo14576a();
                    } catch (RemoteException e) {
                        C3900je.m17432c("Unable to call onVideoStart()", e);
                    }
                }
                if (z6) {
                    try {
                        this.f13924g.mo14578b();
                    } catch (RemoteException e2) {
                        C3900je.m17432c("Unable to call onVideoPlay()", e2);
                    }
                }
                if (z7) {
                    try {
                        this.f13924g.mo14579c();
                    } catch (RemoteException e3) {
                        C3900je.m17432c("Unable to call onVideoPause()", e3);
                    }
                }
                if (z8) {
                    try {
                        this.f13924g.mo14580d();
                    } catch (RemoteException e4) {
                        C3900je.m17432c("Unable to call onVideoEnd()", e4);
                    }
                }
                if (z9) {
                    try {
                        this.f13924g.mo14577a(z2);
                    } catch (RemoteException e5) {
                        C3900je.m17432c("Unable to call onVideoMute()", e5);
                    }
                }
            } else {
                return;
            }
        }
        return;
    }

    /* renamed from: a */
    public final void mo14565a(aqh aqh) {
        synchronized (this.f13919b) {
            this.f13924g = aqh;
        }
    }

    /* renamed from: a */
    public final void mo15985a(zzmu zzmu) {
        synchronized (this.f13919b) {
            this.f13929l = zzmu.f14557a;
            this.f13930m = zzmu.f14558b;
            this.f13931n = zzmu.f14559c;
        }
        m17907a("initialState", C3554f.m12737a("muteStart", zzmu.f14557a ? "1" : "0", "customControlsRequested", zzmu.f14558b ? "1" : "0", "clickToExpandRequested", zzmu.f14559c ? "1" : "0"));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo15986a(Map map) {
        this.f13918a.mo14986a("pubVideoCmd", map);
    }

    /* renamed from: a */
    public final void mo14566a(boolean z) {
        m17907a(z ? "mute" : "unmute", null);
    }

    /* renamed from: b */
    public final void mo14567b() {
        m17907a("pause", null);
    }

    /* renamed from: c */
    public final boolean mo14568c() {
        boolean z;
        synchronized (this.f13919b) {
            z = this.f13926i;
        }
        return z;
    }

    /* renamed from: d */
    public final int mo14569d() {
        int i;
        synchronized (this.f13919b) {
            i = this.f13923f;
        }
        return i;
    }

    /* renamed from: e */
    public final float mo14570e() {
        float f;
        synchronized (this.f13919b) {
            f = this.f13928k;
        }
        return f;
    }

    /* renamed from: f */
    public final float mo14571f() {
        return this.f13922e;
    }

    /* renamed from: g */
    public final float mo14572g() {
        float f;
        synchronized (this.f13919b) {
            f = this.f13927j;
        }
        return f;
    }

    /* renamed from: h */
    public final aqh mo14573h() throws RemoteException {
        aqh aqh;
        synchronized (this.f13919b) {
            aqh = this.f13924g;
        }
        return aqh;
    }

    /* renamed from: i */
    public final boolean mo14574i() {
        boolean z;
        synchronized (this.f13919b) {
            z = this.f13920c && this.f13930m;
        }
        return z;
    }

    /* renamed from: j */
    public final boolean mo14575j() {
        boolean z;
        boolean i = mo14574i();
        synchronized (this.f13919b) {
            if (!i) {
                try {
                    if (this.f13931n && this.f13921d) {
                        z = true;
                    }
                } finally {
                }
            }
            z = false;
        }
        return z;
    }
}
