package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.SystemClock;
import com.google.android.gms.ads.internal.C3025aw;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import javax.annotation.concurrent.GuardedBy;

@C3718cm
/* renamed from: com.google.android.gms.internal.ads.il */
public final class C3880il {

    /* renamed from: a */
    private final C3892ix f13301a;
    @GuardedBy("mLock")

    /* renamed from: b */
    private final LinkedList<C3881im> f13302b;

    /* renamed from: c */
    private final Object f13303c;

    /* renamed from: d */
    private final String f13304d;

    /* renamed from: e */
    private final String f13305e;
    @GuardedBy("mLock")

    /* renamed from: f */
    private long f13306f;
    @GuardedBy("mLock")

    /* renamed from: g */
    private long f13307g;
    @GuardedBy("mLock")

    /* renamed from: h */
    private boolean f13308h;
    @GuardedBy("mLock")

    /* renamed from: i */
    private long f13309i;
    @GuardedBy("mLock")

    /* renamed from: j */
    private long f13310j;
    @GuardedBy("mLock")

    /* renamed from: k */
    private long f13311k;
    @GuardedBy("mLock")

    /* renamed from: l */
    private long f13312l;

    private C3880il(C3892ix ixVar, String str, String str2) {
        this.f13303c = new Object();
        this.f13306f = -1;
        this.f13307g = -1;
        this.f13308h = false;
        this.f13309i = -1;
        this.f13310j = 0;
        this.f13311k = -1;
        this.f13312l = -1;
        this.f13301a = ixVar;
        this.f13304d = str;
        this.f13305e = str2;
        this.f13302b = new LinkedList<>();
    }

    public C3880il(String str, String str2) {
        this(C3025aw.m10922j(), str, str2);
    }

    /* renamed from: a */
    public final void mo15413a() {
        synchronized (this.f13303c) {
            if (this.f13312l != -1 && this.f13307g == -1) {
                this.f13307g = SystemClock.elapsedRealtime();
                this.f13301a.mo15470a(this);
            }
            this.f13301a.mo15474b();
        }
    }

    /* renamed from: a */
    public final void mo15414a(long j) {
        synchronized (this.f13303c) {
            this.f13312l = j;
            if (this.f13312l != -1) {
                this.f13301a.mo15470a(this);
            }
        }
    }

    /* renamed from: a */
    public final void mo15415a(zzjj zzjj) {
        synchronized (this.f13303c) {
            this.f13311k = SystemClock.elapsedRealtime();
            this.f13301a.mo15472a(zzjj, this.f13311k);
        }
    }

    /* renamed from: a */
    public final void mo15416a(boolean z) {
        synchronized (this.f13303c) {
            if (this.f13312l != -1) {
                this.f13309i = SystemClock.elapsedRealtime();
                if (!z) {
                    this.f13307g = this.f13309i;
                    this.f13301a.mo15470a(this);
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo15417b() {
        synchronized (this.f13303c) {
            if (this.f13312l != -1) {
                C3881im imVar = new C3881im();
                imVar.mo15424c();
                this.f13302b.add(imVar);
                this.f13310j++;
                this.f13301a.mo15469a();
                this.f13301a.mo15470a(this);
            }
        }
    }

    /* renamed from: b */
    public final void mo15418b(long j) {
        synchronized (this.f13303c) {
            if (this.f13312l != -1) {
                this.f13306f = j;
                this.f13301a.mo15470a(this);
            }
        }
    }

    /* renamed from: b */
    public final void mo15419b(boolean z) {
        synchronized (this.f13303c) {
            if (this.f13312l != -1) {
                this.f13308h = z;
                this.f13301a.mo15470a(this);
            }
        }
    }

    /* renamed from: c */
    public final void mo15420c() {
        synchronized (this.f13303c) {
            if (this.f13312l != -1 && !this.f13302b.isEmpty()) {
                C3881im imVar = (C3881im) this.f13302b.getLast();
                if (imVar.mo15422a() == -1) {
                    imVar.mo15423b();
                    this.f13301a.mo15470a(this);
                }
            }
        }
    }

    /* renamed from: d */
    public final Bundle mo15421d() {
        Bundle bundle;
        synchronized (this.f13303c) {
            bundle = new Bundle();
            bundle.putString("seq_num", this.f13304d);
            bundle.putString("slotid", this.f13305e);
            bundle.putBoolean("ismediation", this.f13308h);
            bundle.putLong("treq", this.f13311k);
            bundle.putLong("tresponse", this.f13312l);
            bundle.putLong("timp", this.f13307g);
            bundle.putLong("tload", this.f13309i);
            bundle.putLong("pcc", this.f13310j);
            bundle.putLong("tfetch", this.f13306f);
            ArrayList arrayList = new ArrayList();
            Iterator it = this.f13302b.iterator();
            while (it.hasNext()) {
                arrayList.add(((C3881im) it.next()).mo15425d());
            }
            bundle.putParcelableArrayList("tclick", arrayList);
        }
        return bundle;
    }
}
