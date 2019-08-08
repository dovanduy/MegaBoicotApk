package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.DynamiteModule.C3606a;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.p137b.C3238b;

@C3718cm
public final class amo {

    /* renamed from: a */
    ajd f11436a;

    /* renamed from: b */
    boolean f11437b;

    public amo() {
    }

    public amo(Context context) {
        aru.m15024a(context);
        if (((Boolean) aoq.m14620f().mo14695a(aru.f11962db)).booleanValue()) {
            try {
                this.f11436a = aje.m14228a(DynamiteModule.m12874a(context, DynamiteModule.f10249a, ModuleDescriptor.MODULE_ID).mo13744a("com.google.android.gms.ads.clearcut.DynamiteClearcutLogger"));
                C3238b.m11573a(context);
                this.f11436a.mo14362a(C3238b.m11573a(context), "GMA_SDK");
                this.f11437b = true;
            } catch (RemoteException | C3606a | NullPointerException unused) {
                C3987mk.m17429b("Cannot dynamite load clearcut");
            }
        }
    }

    public amo(Context context, String str, String str2) {
        aru.m15024a(context);
        try {
            this.f11436a = aje.m14228a(DynamiteModule.m12874a(context, DynamiteModule.f10249a, ModuleDescriptor.MODULE_ID).mo13744a("com.google.android.gms.ads.clearcut.DynamiteClearcutLogger"));
            C3238b.m11573a(context);
            this.f11436a.mo14363a(C3238b.m11573a(context), str, null);
            this.f11437b = true;
        } catch (RemoteException | C3606a | NullPointerException unused) {
            C3987mk.m17429b("Cannot dynamite load clearcut");
        }
    }

    /* renamed from: a */
    public final amq mo14519a(byte[] bArr) {
        return new amq(this, bArr);
    }
}
