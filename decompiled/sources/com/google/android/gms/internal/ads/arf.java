package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.android.gms.common.internal.C3513t;
import com.google.android.gms.common.p140b.C3404c;

@C3718cm
public final class arf {

    /* renamed from: a */
    private final Context f11730a;

    public arf(Context context) {
        C3513t.m12626a(context, (Object) "Context can not be null");
        this.f11730a = context;
    }

    /* renamed from: a */
    private final boolean m14977a(Intent intent) {
        C3513t.m12626a(intent, (Object) "Intent can not be null");
        return !this.f11730a.getPackageManager().queryIntentActivities(intent, 0).isEmpty();
    }

    /* renamed from: a */
    public final boolean mo14675a() {
        Intent intent = new Intent("android.intent.action.DIAL");
        intent.setData(Uri.parse("tel:"));
        return m14977a(intent);
    }

    /* renamed from: b */
    public final boolean mo14676b() {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse("sms:"));
        return m14977a(intent);
    }

    /* renamed from: c */
    public final boolean mo14677c() {
        return ((Boolean) C3966lq.m17350a(this.f11730a, new arg())).booleanValue() && C3404c.m12230a(this.f11730a).mo13388a("android.permission.WRITE_EXTERNAL_STORAGE") == 0;
    }

    @TargetApi(14)
    /* renamed from: d */
    public final boolean mo14678d() {
        return m14977a(new Intent("android.intent.action.INSERT").setType("vnd.android.cursor.dir/event"));
    }
}
