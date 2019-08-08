package com.facebook;

import android.content.Intent;
import android.support.p017v4.content.C0362f;
import com.facebook.internal.C2479ad;
import com.facebook.internal.C2484ae;

/* renamed from: com.facebook.w */
/* compiled from: ProfileManager */
public final class C2759w {

    /* renamed from: a */
    private static volatile C2759w f8563a;

    /* renamed from: b */
    private final C0362f f8564b;

    /* renamed from: c */
    private final C2758v f8565c;

    /* renamed from: d */
    private Profile f8566d;

    C2759w(C0362f fVar, C2758v vVar) {
        C2484ae.m9489a((Object) fVar, "localBroadcastManager");
        C2484ae.m9489a((Object) vVar, "profileCache");
        this.f8564b = fVar;
        this.f8565c = vVar;
    }

    /* renamed from: a */
    static C2759w m10507a() {
        if (f8563a == null) {
            synchronized (C2759w.class) {
                if (f8563a == null) {
                    f8563a = new C2759w(C0362f.m1362a(C2649m.m10133f()), new C2758v());
                }
            }
        }
        return f8563a;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public Profile mo9601b() {
        return this.f8566d;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public boolean mo9602c() {
        Profile a = this.f8565c.mo9597a();
        if (a == null) {
            return false;
        }
        m10509a(a, false);
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo9600a(Profile profile) {
        m10509a(profile, true);
    }

    /* renamed from: a */
    private void m10509a(Profile profile, boolean z) {
        Profile profile2 = this.f8566d;
        this.f8566d = profile;
        if (z) {
            if (profile != null) {
                this.f8565c.mo9598a(profile);
            } else {
                this.f8565c.mo9599b();
            }
        }
        if (!C2479ad.m9455a(profile2, profile)) {
            m10508a(profile2, profile);
        }
    }

    /* renamed from: a */
    private void m10508a(Profile profile, Profile profile2) {
        Intent intent = new Intent("com.facebook.sdk.ACTION_CURRENT_PROFILE_CHANGED");
        intent.putExtra("com.facebook.sdk.EXTRA_OLD_PROFILE", profile);
        intent.putExtra("com.facebook.sdk.EXTRA_NEW_PROFILE", profile2);
        this.f8564b.mo1252a(intent);
    }
}
