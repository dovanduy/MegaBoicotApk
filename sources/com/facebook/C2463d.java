package com.facebook;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.p017v4.content.C0362f;
import android.util.Log;
import com.facebook.internal.C2484ae;

/* renamed from: com.facebook.d */
/* compiled from: AccessTokenTracker */
public abstract class C2463d {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final String f7770a = "d";

    /* renamed from: b */
    private final BroadcastReceiver f7771b;

    /* renamed from: c */
    private final C0362f f7772c;

    /* renamed from: d */
    private boolean f7773d = false;

    /* renamed from: com.facebook.d$a */
    /* compiled from: AccessTokenTracker */
    private class C2465a extends BroadcastReceiver {
        private C2465a() {
        }

        public void onReceive(Context context, Intent intent) {
            if ("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED".equals(intent.getAction())) {
                Log.d(C2463d.f7770a, "AccessTokenChanged");
                C2463d.this.mo8879a((AccessToken) intent.getParcelableExtra("com.facebook.sdk.EXTRA_OLD_ACCESS_TOKEN"), (AccessToken) intent.getParcelableExtra("com.facebook.sdk.EXTRA_NEW_ACCESS_TOKEN"));
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo8879a(AccessToken accessToken, AccessToken accessToken2);

    public C2463d() {
        C2484ae.m9487a();
        this.f7771b = new C2465a();
        this.f7772c = C0362f.m1362a(C2649m.m10133f());
        mo8878a();
    }

    /* renamed from: a */
    public void mo8878a() {
        if (!this.f7773d) {
            m9370e();
            this.f7773d = true;
        }
    }

    /* renamed from: b */
    public void mo8880b() {
        if (this.f7773d) {
            this.f7772c.mo1250a(this.f7771b);
            this.f7773d = false;
        }
    }

    /* renamed from: c */
    public boolean mo8881c() {
        return this.f7773d;
    }

    /* renamed from: e */
    private void m9370e() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED");
        this.f7772c.mo1251a(this.f7771b, intentFilter);
    }
}
