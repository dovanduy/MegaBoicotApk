package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import com.google.android.gms.common.util.C3563o;

@C3718cm
/* renamed from: com.google.android.gms.internal.ads.ov */
public final class C4052ov extends C4045oo {
    /* renamed from: a */
    public final C4044on mo15747a(Context context, C4061pd pdVar, int i, boolean z, ash ash, C4060pc pcVar) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        if (!(C3563o.m12763b() && (applicationInfo == null || applicationInfo.targetSdkVersion >= 11))) {
            return null;
        }
        boolean d = pdVar.mo15917t().mo15997d();
        C4062pe peVar = new C4062pe(context, pdVar.mo15807k(), pdVar.mo15804g(), ash, pdVar.mo15800c());
        C4032ob obVar = new C4032ob(context, z, d, pcVar, peVar);
        return obVar;
    }
}
