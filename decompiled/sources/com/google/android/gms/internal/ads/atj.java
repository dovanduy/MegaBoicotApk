package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import com.google.android.gms.common.internal.C3513t;
import com.google.android.gms.p137b.C3235a;
import com.google.android.gms.p137b.C3238b;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
@C3718cm
public final class atj extends atp {

    /* renamed from: c */
    private bcm f12186c;

    /* renamed from: d */
    private bcq f12187d;

    /* renamed from: e */
    private bct f12188e;

    /* renamed from: f */
    private final atm f12189f;

    /* renamed from: g */
    private atk f12190g;

    /* renamed from: h */
    private boolean f12191h;

    /* renamed from: i */
    private Object f12192i;

    private atj(Context context, atm atm, agw agw, atn atn) {
        super(context, atm, null, agw, null, atn, null, null);
        this.f12191h = false;
        this.f12192i = new Object();
        this.f12189f = atm;
    }

    public atj(Context context, atm atm, agw agw, bcm bcm, atn atn) {
        this(context, atm, agw, atn);
        this.f12186c = bcm;
    }

    public atj(Context context, atm atm, agw agw, bcq bcq, atn atn) {
        this(context, atm, agw, atn);
        this.f12187d = bcq;
    }

    public atj(Context context, atm atm, agw agw, bct bct, atn atn) {
        this(context, atm, agw, atn);
        this.f12188e = bct;
    }

    /* renamed from: b */
    private static HashMap<String, View> m15208b(Map<String, WeakReference<View>> map) {
        HashMap<String, View> hashMap = new HashMap<>();
        if (map == null) {
            return hashMap;
        }
        synchronized (map) {
            for (Entry entry : map.entrySet()) {
                View view = (View) ((WeakReference) entry.getValue()).get();
                if (view != null) {
                    hashMap.put((String) entry.getKey(), view);
                }
            }
        }
        return hashMap;
    }

    /* renamed from: a */
    public final View mo14830a(OnClickListener onClickListener, boolean z) {
        C3235a aVar;
        synchronized (this.f12192i) {
            if (this.f12190g != null) {
                View a = this.f12190g.mo14830a(onClickListener, z);
                return a;
            }
            try {
                if (this.f12188e != null) {
                    aVar = this.f12188e.mo15165l();
                } else if (this.f12186c != null) {
                    aVar = this.f12186c.mo15127n();
                } else {
                    if (this.f12187d != null) {
                        aVar = this.f12187d.mo15146k();
                    }
                    aVar = null;
                }
            } catch (RemoteException e) {
                C3900je.m17432c("Failed to call getAdChoicesContent", e);
            }
            if (aVar == null) {
                return null;
            }
            View view = (View) C3238b.m11574a(aVar);
            return view;
        }
    }

    /* renamed from: a */
    public final void mo14831a(View view) {
        synchronized (this.f12192i) {
            if (this.f12190g != null) {
                this.f12190g.mo14831a(view);
            }
        }
    }

    /* renamed from: a */
    public final void mo14832a(View view, Map<String, WeakReference<View>> map) {
        atm atm;
        C3513t.m12634b("recordImpression must be called on the main UI thread.");
        synchronized (this.f12192i) {
            this.f12199a = true;
            if (this.f12190g != null) {
                this.f12190g.mo14832a(view, map);
                this.f12189f.mo14861ac();
            } else {
                try {
                    if (this.f12188e != null && !this.f12188e.mo15169p()) {
                        this.f12188e.mo15171r();
                        atm = this.f12189f;
                    } else if (this.f12186c != null && !this.f12186c.mo15123j()) {
                        this.f12186c.mo15122i();
                        atm = this.f12189f;
                    } else if (this.f12187d != null && !this.f12187d.mo15143h()) {
                        this.f12187d.mo15142g();
                        atm = this.f12189f;
                    }
                    atm.mo14861ac();
                } catch (RemoteException e) {
                    C3900je.m17432c("Failed to call recordImpression", e);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo14833a(View view, Map<String, WeakReference<View>> map, Bundle bundle, View view2) {
        atm atm;
        C3513t.m12634b("performClick must be called on the main UI thread.");
        synchronized (this.f12192i) {
            if (this.f12190g != null) {
                this.f12190g.mo14833a(view, map, bundle, view2);
                this.f12189f.mo14862e();
            } else {
                try {
                    if (this.f12188e != null && !this.f12188e.mo15170q()) {
                        this.f12188e.mo15152a(C3238b.m11573a(view));
                        atm = this.f12189f;
                    } else if (this.f12186c != null && !this.f12186c.mo15124k()) {
                        this.f12186c.mo15111a(C3238b.m11573a(view));
                        atm = this.f12189f;
                    } else if (this.f12187d != null && !this.f12187d.mo15144i()) {
                        this.f12187d.mo15133a(C3238b.m11573a(view));
                        atm = this.f12189f;
                    }
                    atm.mo14862e();
                } catch (RemoteException e) {
                    C3900je.m17432c("Failed to call performClick", e);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo14834a(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, OnTouchListener onTouchListener, OnClickListener onClickListener) {
        synchronized (this.f12192i) {
            this.f12191h = true;
            HashMap b = m15208b(map);
            HashMap b2 = m15208b(map2);
            try {
                if (this.f12188e != null) {
                    this.f12188e.mo15153a(C3238b.m11573a(view), C3238b.m11573a(b), C3238b.m11573a(b2));
                } else if (this.f12186c != null) {
                    this.f12186c.mo15112a(C3238b.m11573a(view), C3238b.m11573a(b), C3238b.m11573a(b2));
                    this.f12186c.mo15114b(C3238b.m11573a(view));
                } else if (this.f12187d != null) {
                    this.f12187d.mo15134a(C3238b.m11573a(view), C3238b.m11573a(b), C3238b.m11573a(b2));
                    this.f12187d.mo15136b(C3238b.m11573a(view));
                }
            } catch (RemoteException e) {
                C3900je.m17432c("Failed to call prepareAd", e);
            }
            this.f12191h = false;
        }
    }

    /* renamed from: a */
    public final void mo14835a(atk atk) {
        synchronized (this.f12192i) {
            this.f12190g = atk;
        }
    }

    /* renamed from: a */
    public final void mo14836a(awb awb) {
        synchronized (this.f12192i) {
            if (this.f12190g != null) {
                this.f12190g.mo14836a(awb);
            }
        }
    }

    /* renamed from: a */
    public final boolean mo14837a() {
        synchronized (this.f12192i) {
            if (this.f12190g != null) {
                boolean a = this.f12190g.mo14837a();
                return a;
            }
            boolean S = this.f12189f.mo12466S();
            return S;
        }
    }

    /* renamed from: b */
    public final void mo14838b(View view, Map<String, WeakReference<View>> map) {
        synchronized (this.f12192i) {
            try {
                if (this.f12188e != null) {
                    this.f12188e.mo15155b(C3238b.m11573a(view));
                } else if (this.f12186c != null) {
                    this.f12186c.mo15116c(C3238b.m11573a(view));
                } else if (this.f12187d != null) {
                    this.f12187d.mo15138c(C3238b.m11573a(view));
                }
            } catch (RemoteException e) {
                C3900je.m17432c("Failed to call untrackView", e);
            }
        }
    }

    /* renamed from: b */
    public final boolean mo14839b() {
        synchronized (this.f12192i) {
            if (this.f12190g != null) {
                boolean b = this.f12190g.mo14839b();
                return b;
            }
            boolean T = this.f12189f.mo12467T();
            return T;
        }
    }

    /* renamed from: c */
    public final void mo14840c() {
        synchronized (this.f12192i) {
            if (this.f12190g != null) {
                this.f12190g.mo14840c();
            }
        }
    }

    /* renamed from: d */
    public final void mo14841d() {
        C3513t.m12634b("recordDownloadedImpression must be called on main UI thread.");
        synchronized (this.f12192i) {
            this.f12200b = true;
            if (this.f12190g != null) {
                this.f12190g.mo14841d();
            }
        }
    }

    /* renamed from: e */
    public final boolean mo14842e() {
        boolean z;
        synchronized (this.f12192i) {
            z = this.f12191h;
        }
        return z;
    }

    /* renamed from: f */
    public final atk mo14843f() {
        atk atk;
        synchronized (this.f12192i) {
            atk = this.f12190g;
        }
        return atk;
    }

    /* renamed from: g */
    public final C4089qe mo14844g() {
        return null;
    }

    /* renamed from: h */
    public final void mo14845h() {
    }

    /* renamed from: i */
    public final void mo14846i() {
    }

    /* renamed from: j */
    public final void mo14847j() {
        if (this.f12190g != null) {
            this.f12190g.mo14847j();
        }
    }

    /* renamed from: k */
    public final void mo14848k() {
        if (this.f12190g != null) {
            this.f12190g.mo14848k();
        }
    }
}
