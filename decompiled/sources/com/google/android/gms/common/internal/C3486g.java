package com.google.android.gms.common.internal;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.util.Log;
import com.google.android.gms.common.api.internal.C3368h;

/* renamed from: com.google.android.gms.common.internal.g */
public abstract class C3486g implements OnClickListener {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo13482a();

    /* renamed from: a */
    public static C3486g m12505a(Activity activity, Intent intent, int i) {
        return new C3519z(intent, activity, i);
    }

    /* renamed from: a */
    public static C3486g m12506a(C3368h hVar, Intent intent, int i) {
        return new C3440aa(intent, hVar, i);
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        try {
            mo13482a();
        } catch (ActivityNotFoundException e) {
            Log.e("DialogRedirect", "Failed to start resolution intent", e);
        } finally {
            dialogInterface.dismiss();
        }
    }
}
