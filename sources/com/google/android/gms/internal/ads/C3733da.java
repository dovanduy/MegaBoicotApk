package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

@C3718cm
/* renamed from: com.google.android.gms.internal.ads.da */
public final class C3733da {
    /* access modifiers changed from: private */
    /* renamed from: b */
    public static boolean m16517b(Context context, boolean z) {
        if (!z) {
            return true;
        }
        int b = DynamiteModule.m12878b(context, ModuleDescriptor.MODULE_ID);
        return b != 0 && b <= DynamiteModule.m12872a(context, ModuleDescriptor.MODULE_ID);
    }
}
