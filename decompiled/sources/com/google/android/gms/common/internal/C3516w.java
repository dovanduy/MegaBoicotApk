package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.gms.common.C3520j.C3521a;
import javax.annotation.Nullable;

/* renamed from: com.google.android.gms.common.internal.w */
public class C3516w {

    /* renamed from: a */
    private final Resources f10082a;

    /* renamed from: b */
    private final String f10083b = this.f10082a.getResourcePackageName(C3521a.common_google_play_services_unknown_issue);

    public C3516w(Context context) {
        C3513t.m12625a(context);
        this.f10082a = context.getResources();
    }

    @Nullable
    /* renamed from: a */
    public String mo13617a(String str) {
        int identifier = this.f10082a.getIdentifier(str, "string", this.f10083b);
        if (identifier == 0) {
            return null;
        }
        return this.f10082a.getString(identifier);
    }
}
