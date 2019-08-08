package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.support.customtabs.C0155a;
import android.support.customtabs.C0156b;
import android.support.customtabs.C0165d;
import android.support.customtabs.C0167e;
import com.google.android.exoplayer2.C2793C;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
@C3718cm
public final class ass implements afs {

    /* renamed from: a */
    private C0167e f12094a;

    /* renamed from: b */
    private C0156b f12095b;

    /* renamed from: c */
    private C0165d f12096c;

    /* renamed from: d */
    private ast f12097d;

    /* renamed from: a */
    public static boolean m15081a(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            return false;
        }
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
        ResolveInfo resolveActivity = packageManager.resolveActivity(intent, 0);
        List queryIntentActivities = packageManager.queryIntentActivities(intent, C2793C.DEFAULT_BUFFER_SEGMENT_SIZE);
        if (!(queryIntentActivities == null || resolveActivity == null)) {
            for (int i = 0; i < queryIntentActivities.size(); i++) {
                if (resolveActivity.activityInfo.name.equals(((ResolveInfo) queryIntentActivities.get(i)).activityInfo.name)) {
                    return resolveActivity.activityInfo.packageName.equals(afq.m14021a(context));
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public final void mo14269a() {
        this.f12095b = null;
        this.f12094a = null;
        if (this.f12097d != null) {
            this.f12097d.mo14738b();
        }
    }

    /* renamed from: a */
    public final void mo14733a(Activity activity) {
        if (this.f12096c != null) {
            activity.unbindService(this.f12096c);
            this.f12095b = null;
            this.f12094a = null;
            this.f12096c = null;
        }
    }

    /* renamed from: a */
    public final void mo14270a(C0156b bVar) {
        this.f12095b = bVar;
        this.f12095b.mo339a(0);
        if (this.f12097d != null) {
            this.f12097d.mo14737a();
        }
    }

    /* renamed from: a */
    public final void mo14734a(ast ast) {
        this.f12097d = ast;
    }

    /* renamed from: a */
    public final boolean mo14735a(Uri uri, Bundle bundle, List<Bundle> list) {
        if (this.f12095b == null) {
            return false;
        }
        if (this.f12095b == null) {
            this.f12094a = null;
        } else if (this.f12094a == null) {
            this.f12094a = this.f12095b.mo338a((C0155a) null);
        }
        C0167e eVar = this.f12094a;
        if (eVar == null) {
            return false;
        }
        return eVar.mo355a(uri, null, null);
    }

    /* renamed from: b */
    public final void mo14736b(Activity activity) {
        if (this.f12095b == null) {
            String a = afq.m14021a(activity);
            if (a != null) {
                this.f12096c = new afr(this);
                C0156b.m302a(activity, a, this.f12096c);
            }
        }
    }
}
