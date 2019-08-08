package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.C3025aw;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
@C3718cm
public final class akx {

    /* renamed from: a */
    private final Object f11312a = new Object();

    /* renamed from: b */
    private int f11313b;

    /* renamed from: c */
    private List<akw> f11314c = new LinkedList();

    /* renamed from: a */
    public final akw mo14456a() {
        synchronized (this.f11312a) {
            akw akw = null;
            if (this.f11314c.size() == 0) {
                C3900je.m17429b("Queue empty");
                return null;
            }
            int i = 0;
            if (this.f11314c.size() >= 2) {
                int i2 = Integer.MIN_VALUE;
                int i3 = 0;
                for (akw akw2 : this.f11314c) {
                    int i4 = akw2.mo14453i();
                    if (i4 > i2) {
                        i = i3;
                        akw = akw2;
                        i2 = i4;
                    }
                    i3++;
                }
                this.f11314c.remove(i);
                return akw;
            }
            akw akw3 = (akw) this.f11314c.get(0);
            akw3.mo14447e();
            return akw3;
        }
    }

    /* renamed from: a */
    public final boolean mo14457a(akw akw) {
        synchronized (this.f11312a) {
            return this.f11314c.contains(akw);
        }
    }

    /* renamed from: b */
    public final boolean mo14458b(akw akw) {
        synchronized (this.f11312a) {
            Iterator it = this.f11314c.iterator();
            while (it.hasNext()) {
                akw akw2 = (akw) it.next();
                if (!((Boolean) aoq.m14620f().mo14695a(aru.f11771W)).booleanValue() || C3025aw.m10921i().mo15449l().mo15494b()) {
                    if (((Boolean) aoq.m14620f().mo14695a(aru.f11773Y)).booleanValue() && !C3025aw.m10921i().mo15449l().mo15500d() && akw != akw2 && akw2.mo14446d().equals(akw.mo14446d())) {
                        it.remove();
                        return true;
                    }
                } else if (akw != akw2 && akw2.mo14443b().equals(akw.mo14443b())) {
                    it.remove();
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: c */
    public final void mo14459c(akw akw) {
        synchronized (this.f11312a) {
            if (this.f11314c.size() >= 10) {
                int size = this.f11314c.size();
                StringBuilder sb = new StringBuilder(41);
                sb.append("Queue is full, current size = ");
                sb.append(size);
                C3900je.m17429b(sb.toString());
                this.f11314c.remove(0);
            }
            int i = this.f11313b;
            this.f11313b = i + 1;
            akw.mo14440a(i);
            this.f11314c.add(akw);
        }
    }
}
