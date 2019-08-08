package com.facebook.ads.internal.adapters;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.facebook.ads.AdError;
import com.facebook.ads.internal.view.p110i.p112b.C2133aa;

/* renamed from: com.facebook.ads.internal.adapters.u */
public class C1657u extends BroadcastReceiver {

    /* renamed from: a */
    private String f5192a;

    /* renamed from: b */
    private C1656t f5193b;

    /* renamed from: c */
    private C1655s f5194c;

    public C1657u(String str, C1655s sVar, C1656t tVar) {
        this.f5194c = sVar;
        this.f5193b = tVar;
        this.f5192a = str;
    }

    /* renamed from: a */
    public IntentFilter mo7359a() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(C2133aa.REWARDED_VIDEO_COMPLETE.mo8443a(this.f5192a));
        intentFilter.addAction(C2133aa.REWARDED_VIDEO_ERROR.mo8443a(this.f5192a));
        intentFilter.addAction(C2133aa.REWARDED_VIDEO_AD_CLICK.mo8443a(this.f5192a));
        intentFilter.addAction(C2133aa.REWARDED_VIDEO_IMPRESSION.mo8443a(this.f5192a));
        intentFilter.addAction(C2133aa.REWARDED_VIDEO_CLOSED.mo8443a(this.f5192a));
        intentFilter.addAction(C2133aa.REWARD_SERVER_SUCCESS.mo8443a(this.f5192a));
        intentFilter.addAction(C2133aa.REWARD_SERVER_FAILED.mo8443a(this.f5192a));
        intentFilter.addAction(C2133aa.REWARDED_VIDEO_ACTIVITY_DESTROYED.mo8443a(this.f5192a));
        return intentFilter;
    }

    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if (C2133aa.REWARDED_VIDEO_COMPLETE.mo8443a(this.f5192a).equals(action)) {
            this.f5193b.mo7356d(this.f5194c);
        } else if (C2133aa.REWARDED_VIDEO_ERROR.mo8443a(this.f5192a).equals(action)) {
            this.f5193b.mo7352a(this.f5194c, AdError.INTERNAL_ERROR);
        } else if (C2133aa.REWARDED_VIDEO_AD_CLICK.mo8443a(this.f5192a).equals(action)) {
            this.f5193b.mo7354b(this.f5194c);
        } else if (C2133aa.REWARDED_VIDEO_IMPRESSION.mo8443a(this.f5192a).equals(action)) {
            this.f5193b.mo7355c(this.f5194c);
        } else if (C2133aa.REWARDED_VIDEO_CLOSED.mo8443a(this.f5192a).equals(action)) {
            this.f5193b.mo7350a();
        } else if (C2133aa.REWARD_SERVER_FAILED.mo8443a(this.f5192a).equals(action)) {
            this.f5193b.mo7357e(this.f5194c);
        } else if (C2133aa.REWARD_SERVER_SUCCESS.mo8443a(this.f5192a).equals(action)) {
            this.f5193b.mo7358f(this.f5194c);
        } else {
            if (C2133aa.REWARDED_VIDEO_ACTIVITY_DESTROYED.mo8443a(this.f5192a).equals(action)) {
                this.f5193b.mo7353b();
            }
        }
    }
}
