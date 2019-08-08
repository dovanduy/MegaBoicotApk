package com.facebook;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.p017v4.app.C0254i;
import android.support.p017v4.app.Fragment;
import android.support.p017v4.app.FragmentActivity;
import android.util.Log;
import com.facebook.common.C2454a.C2458d;
import com.facebook.common.C2454a.C2459e;
import com.facebook.internal.C2517g;
import com.facebook.internal.C2566x;
import com.facebook.login.C2610e;
import com.facebook.share.internal.DeviceShareDialogFragment;
import com.facebook.share.model.ShareContent;

public class FacebookActivity extends FragmentActivity {

    /* renamed from: k */
    public static String f4516k = "PassThrough";

    /* renamed from: l */
    private static String f4517l = "SingleFragment";

    /* renamed from: m */
    private static final String f4518m = "com.facebook.FacebookActivity";

    /* renamed from: n */
    private Fragment f4519n;

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (!C2649m.m10124a()) {
            Log.d(f4518m, "Facebook SDK not initialized. Make sure you call sdkInitialize inside your Application's onCreate method.");
            C2649m.m10121a(getApplicationContext());
        }
        setContentView(C2459e.com_facebook_activity_layout);
        if (f4516k.equals(intent.getAction())) {
            m6187j();
        } else {
            this.f4519n = mo2636h();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public Fragment mo2636h() {
        Intent intent = getIntent();
        C0254i f = mo670f();
        Fragment a = f.mo866a(f4517l);
        if (a != null) {
            return a;
        }
        if ("FacebookDialogFragment".equals(intent.getAction())) {
            C2517g gVar = new C2517g();
            gVar.mo604e(true);
            gVar.mo827a(f, f4517l);
            return gVar;
        } else if ("DeviceShareDialogFragment".equals(intent.getAction())) {
            DeviceShareDialogFragment deviceShareDialogFragment = new DeviceShareDialogFragment();
            deviceShareDialogFragment.mo604e(true);
            deviceShareDialogFragment.mo9373a((ShareContent) intent.getParcelableExtra("content"));
            deviceShareDialogFragment.mo827a(f, f4517l);
            return deviceShareDialogFragment;
        } else {
            C2610e eVar = new C2610e();
            eVar.mo604e(true);
            f.mo867a().mo804a(C2458d.com_facebook_fragment_container, eVar, f4517l).mo815b();
            return eVar;
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.f4519n != null) {
            this.f4519n.onConfigurationChanged(configuration);
        }
    }

    /* renamed from: i */
    public Fragment mo6644i() {
        return this.f4519n;
    }

    /* renamed from: j */
    private void m6187j() {
        setResult(0, C2566x.m9742a(getIntent(), (Bundle) null, C2566x.m9746a(C2566x.m9758d(getIntent()))));
        finish();
    }
}
