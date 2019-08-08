package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.MutableContextWrapper;

@C3718cm
/* renamed from: com.google.android.gms.internal.ads.rr */
public final class C4129rr extends MutableContextWrapper {

    /* renamed from: a */
    private Activity f13946a;

    /* renamed from: b */
    private Context f13947b;

    /* renamed from: c */
    private Context f13948c;

    public C4129rr(Context context) {
        super(context);
        setBaseContext(context);
    }

    /* renamed from: a */
    public final Activity mo15991a() {
        return this.f13946a;
    }

    /* renamed from: b */
    public final Context mo15992b() {
        return this.f13948c;
    }

    public final Object getSystemService(String str) {
        return this.f13948c.getSystemService(str);
    }

    public final void setBaseContext(Context context) {
        this.f13947b = context.getApplicationContext();
        this.f13946a = context instanceof Activity ? (Activity) context : null;
        this.f13948c = context;
        super.setBaseContext(this.f13947b);
    }

    public final void startActivity(Intent intent) {
        if (this.f13946a != null) {
            this.f13946a.startActivity(intent);
            return;
        }
        intent.setFlags(268435456);
        this.f13947b.startActivity(intent);
    }
}
