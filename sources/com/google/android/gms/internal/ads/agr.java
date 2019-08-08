package com.google.android.gms.internal.ads;

final class agr implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ agq f10997a;

    agr(agq agq) {
        this.f10997a = agq;
    }

    public final void run() {
        if (this.f10997a.f10995b == null) {
            synchronized (agq.f10993d) {
                if (this.f10997a.f10995b == null) {
                    boolean booleanValue = ((Boolean) aoq.m14620f().mo14695a(aru.f11831bC)).booleanValue();
                    if (booleanValue) {
                        try {
                            agq.f10992a = new amo(this.f10997a.f10996c.f11057a, "ADSHIELD", null);
                        } catch (Throwable unused) {
                            booleanValue = false;
                        }
                    }
                    this.f10997a.f10995b = Boolean.valueOf(booleanValue);
                    agq.f10993d.open();
                }
            }
        }
    }
}
