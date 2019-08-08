package com.startapp.android.publish.adsCommon.activities;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.KeyEvent;
import com.appnext.base.p046b.C1245d;
import com.startapp.android.publish.ads.p166a.C5082b;
import com.startapp.android.publish.adsCommon.C5349c;
import com.startapp.android.publish.adsCommon.Utils.C5307i;
import com.startapp.android.publish.common.model.AdPreferences.Placement;
import com.startapp.common.C5523b;
import com.startapp.common.p193a.C5509c;
import com.startapp.common.p193a.C5518g;

/* compiled from: StartAppSDK */
public class OverlayActivity extends Activity {

    /* renamed from: a */
    private C5082b f17067a;

    /* renamed from: b */
    private boolean f17068b;

    /* renamed from: c */
    private int f17069c;

    /* renamed from: d */
    private boolean f17070d;

    /* renamed from: e */
    private Bundle f17071e;

    /* renamed from: f */
    private boolean f17072f = false;

    /* renamed from: g */
    private int f17073g = -1;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        boolean z = false;
        overridePendingTransition(0, 0);
        super.onCreate(bundle);
        boolean booleanExtra = getIntent().getBooleanExtra("videoAd", false);
        requestWindowFeature(1);
        if (getIntent().getBooleanExtra("fullscreen", false) || booleanExtra) {
            getWindow().setFlags(C1245d.f3947iP, C1245d.f3947iP);
        }
        C5518g.m23563a("AppWallActivity", 2, "AppWallActivity::onCreate");
        this.f17070d = getIntent().getBooleanExtra("activityShouldLockOrientation", true);
        if (bundle == null && !booleanExtra) {
            C5523b.m23588a((Context) this).mo20506a(new Intent("com.startapp.android.ShowDisplayBroadcastListener"));
        }
        if (bundle != null) {
            this.f17073g = bundle.getInt("activityLockedOrientation", -1);
            this.f17070d = bundle.getBoolean("activityShouldLockOrientation", true);
        }
        this.f17069c = getIntent().getIntExtra("orientation", getResources().getConfiguration().orientation);
        if (getResources().getConfiguration().orientation != this.f17069c) {
            z = true;
        }
        this.f17068b = z;
        if (!this.f17068b) {
            m22716a();
            this.f17067a.mo18697a(bundle);
            return;
        }
        this.f17071e = bundle;
    }

    /* renamed from: a */
    private void m22716a() {
        this.f17067a = C5082b.m21897a(this, getIntent(), Placement.getByIndex(getIntent().getIntExtra("placement", 0)));
        if (this.f17067a == null) {
            finish();
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.f17068b) {
            m22716a();
            this.f17067a.mo18697a(this.f17071e);
            this.f17067a.mo18728u();
            this.f17068b = false;
        }
        this.f17067a.mo18696a(configuration);
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (this.f17067a == null || this.f17067a.mo18704a(i, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        C5518g.m23563a("AppWallActivity", 2, "OverlayActivity::onPause");
        super.onPause();
        if (!this.f17068b) {
            this.f17067a.mo18726s();
            C5349c.m22851a((Context) this);
        }
        overridePendingTransition(0, 0);
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        C5518g.m23563a("AppWallActivity", 2, "AppWallActivity::onSaveInstanceState");
        super.onSaveInstanceState(bundle);
        if (!this.f17068b) {
            this.f17067a.mo18707b(bundle);
            bundle.putInt("activityLockedOrientation", this.f17073g);
            bundle.putBoolean("activityShouldLockOrientation", this.f17070d);
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        C5518g.m23563a("AppWallActivity", 2, "AppWallActivity::onResume");
        super.onResume();
        if (this.f17072f) {
            this.f17067a.mo18709c();
        }
        if (this.f17073g == -1) {
            this.f17073g = C5307i.m22651a((Activity) this, this.f17069c, this.f17070d);
        } else {
            C5509c.m23506a((Activity) this, this.f17073g);
        }
        if (!this.f17068b) {
            this.f17067a.mo18728u();
        }
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        C5518g.m23563a("AppWallActivity", 2, "AppWallActivity::onStop");
        super.onStop();
        if (!this.f17068b) {
            this.f17067a.mo18727t();
        }
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        C5518g.m23563a("AppWallActivity", 2, "AppWallActivity::onDestroy");
        if (!this.f17068b) {
            this.f17067a.mo18729v();
            this.f17067a = null;
            C5307i.m22662a((Activity) this, false);
        }
        super.onDestroy();
    }

    public void onBackPressed() {
        if (!this.f17067a.mo18725r()) {
            super.onBackPressed();
        }
    }

    public void finish() {
        if (this.f17067a != null) {
            this.f17067a.mo18724q();
        }
        super.finish();
    }
}
