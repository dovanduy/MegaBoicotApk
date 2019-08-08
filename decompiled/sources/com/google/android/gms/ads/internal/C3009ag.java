package com.google.android.gms.ads.internal;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.C3900je;
import com.google.android.gms.internal.ads.asz;
import com.google.android.gms.internal.ads.atb;
import com.google.android.gms.internal.ads.atg;
import com.google.android.gms.internal.ads.atn;
import java.util.List;

/* renamed from: com.google.android.gms.ads.internal.ag */
final class C3009ag implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ atn f8762a;

    /* renamed from: b */
    private final /* synthetic */ int f8763b;

    /* renamed from: c */
    private final /* synthetic */ List f8764c;

    /* renamed from: d */
    private final /* synthetic */ C3006ad f8765d;

    C3009ag(C3006ad adVar, atn atn, int i, List list) {
        this.f8765d = adVar;
        this.f8762a = atn;
        this.f8763b = i;
        this.f8764c = list;
    }

    public final void run() {
        try {
            boolean z = false;
            if ((this.f8762a instanceof atb) && this.f8765d.f8733e.f8875t != null) {
                C3006ad adVar = this.f8765d;
                if (this.f8763b != this.f8764c.size() - 1) {
                    z = true;
                }
                adVar.f8731c = z;
                atg a = C3006ad.m10799b(this.f8762a);
                this.f8765d.f8733e.f8875t.mo14917a(a);
                this.f8765d.mo12471a(a.mo14822n());
            } else if ((this.f8762a instanceof atb) && this.f8765d.f8733e.f8874s != null) {
                C3006ad adVar2 = this.f8765d;
                if (this.f8763b != this.f8764c.size() - 1) {
                    z = true;
                }
                adVar2.f8731c = z;
                atb atb = (atb) this.f8762a;
                this.f8765d.f8733e.f8874s.mo14888a(atb);
                this.f8765d.mo12471a(atb.mo14791j());
            } else if ((this.f8762a instanceof asz) && this.f8765d.f8733e.f8875t != null) {
                C3006ad adVar3 = this.f8765d;
                if (this.f8763b != this.f8764c.size() - 1) {
                    z = true;
                }
                adVar3.f8731c = z;
                atg a2 = C3006ad.m10799b(this.f8762a);
                this.f8765d.f8733e.f8875t.mo14917a(a2);
                this.f8765d.mo12471a(a2.mo14822n());
            } else if (!(this.f8762a instanceof asz) || this.f8765d.f8733e.f8873r == null) {
                C3006ad adVar4 = this.f8765d;
                if (this.f8763b != this.f8764c.size() - 1) {
                    z = true;
                }
                adVar4.mo12402a(3, z);
            } else {
                C3006ad adVar5 = this.f8765d;
                if (this.f8763b != this.f8764c.size() - 1) {
                    z = true;
                }
                adVar5.f8731c = z;
                asz asz = (asz) this.f8762a;
                this.f8765d.f8733e.f8873r.mo14887a(asz);
                this.f8765d.mo12471a(asz.mo14769j());
            }
        } catch (RemoteException e) {
            C3900je.m17434d("#007 Could not call remote method.", e);
        }
    }
}
