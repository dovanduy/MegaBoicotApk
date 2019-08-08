package com.startapp.android.publish.ads.splash;

import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.Toast;
import com.startapp.android.publish.ads.p166a.C5082b;
import com.startapp.android.publish.common.model.AdPreferences;
import com.startapp.common.p193a.C5518g;
import java.io.Serializable;

/* renamed from: com.startapp.android.publish.ads.splash.g */
/* compiled from: StartAppSDK */
public class C5195g extends C5082b {

    /* renamed from: d */
    private SplashConfig f16696d = null;

    /* renamed from: e */
    private C5196h f16697e;

    /* renamed from: f */
    private boolean f16698f = false;

    /* renamed from: g */
    private boolean f16699g = false;

    /* renamed from: q */
    public void mo18724q() {
    }

    /* renamed from: a */
    public void mo18697a(Bundle bundle) {
        C5518g.m23563a("SplashMode", 3, "onCreate");
        this.f16696d = (SplashConfig) mo18695a().getSerializableExtra("SplashConfig");
    }

    /* renamed from: a */
    public boolean mo18704a(int i, KeyEvent keyEvent) {
        C5518g.m23563a("SplashMode", 3, "onKeyDown");
        if (this.f16698f) {
            if (i == 25) {
                if (!this.f16699g) {
                    this.f16699g = true;
                    this.f16697e.mo19213g();
                    Toast.makeText(mo18705b(), "Test Mode", 0).show();
                    return true;
                }
            } else if (i == 24 && this.f16699g) {
                mo18705b().finish();
                return true;
            }
        }
        return i == 4;
    }

    /* renamed from: s */
    public void mo18726s() {
        C5518g.m23563a("SplashMode", 3, "onPause");
        if (this.f16697e != null) {
            this.f16697e.mo19206a();
        }
    }

    /* renamed from: t */
    public void mo18727t() {
        C5518g.m23563a("SplashMode", 3, "onStop");
        if (this.f16697e != null) {
            this.f16697e.mo19208b();
        }
    }

    /* renamed from: u */
    public void mo18728u() {
        AdPreferences adPreferences;
        C5518g.m23563a("SplashMode", 3, "onResume");
        if (this.f16696d != null) {
            Serializable serializableExtra = mo18695a().getSerializableExtra("AdPreference");
            if (serializableExtra != null) {
                adPreferences = (AdPreferences) serializableExtra;
            } else {
                adPreferences = new AdPreferences();
            }
            this.f16698f = mo18695a().getBooleanExtra("testMode", false);
            this.f16697e = new C5196h(mo18705b(), this.f16696d, adPreferences);
            this.f16697e.mo19207a(null);
        }
    }

    /* renamed from: v */
    public void mo18729v() {
        C5518g.m23563a("SplashMode", 3, "onDestroy");
    }
}
