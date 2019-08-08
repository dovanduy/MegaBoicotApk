package com.google.android.gms.ads;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import com.google.android.gms.internal.ads.C3987mk;
import com.google.android.gms.internal.ads.C4111r;
import com.google.android.gms.internal.ads.aoq;
import com.google.android.gms.p137b.C3238b;

public class AdActivity extends Activity {

    /* renamed from: a */
    private C4111r f8659a;

    /* renamed from: a */
    private final void m10573a() {
        if (this.f8659a != null) {
            try {
                this.f8659a.mo12678l();
            } catch (RemoteException e) {
                C3987mk.m17434d("#007 Could not call remote method.", e);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        try {
            this.f8659a.mo12662a(i, i2, intent);
        } catch (Exception e) {
            C3987mk.m17434d("#007 Could not call remote method.", e);
        }
        super.onActivityResult(i, i2, intent);
    }

    public void onBackPressed() {
        boolean z = true;
        try {
            if (this.f8659a != null) {
                z = this.f8659a.mo12671e();
            }
        } catch (RemoteException e) {
            C3987mk.m17434d("#007 Could not call remote method.", e);
        }
        if (z) {
            super.onBackPressed();
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        try {
            this.f8659a.mo12665a(C3238b.m11573a(configuration));
        } catch (RemoteException e) {
            C3987mk.m17434d("#007 Could not call remote method.", e);
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f8659a = aoq.m14616b().mo14548a((Activity) this);
        if (this.f8659a == null) {
            C3987mk.m17434d("#007 Could not call remote method.", null);
        } else {
            try {
                this.f8659a.mo12663a(bundle);
                return;
            } catch (RemoteException e) {
                C3987mk.m17434d("#007 Could not call remote method.", e);
            }
        }
        finish();
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        try {
            if (this.f8659a != null) {
                this.f8659a.mo12677k();
            }
        } catch (RemoteException e) {
            C3987mk.m17434d("#007 Could not call remote method.", e);
        }
        super.onDestroy();
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        try {
            if (this.f8659a != null) {
                this.f8659a.mo12675i();
            }
        } catch (RemoteException e) {
            C3987mk.m17434d("#007 Could not call remote method.", e);
            finish();
        }
        super.onPause();
    }

    /* access modifiers changed from: protected */
    public void onRestart() {
        super.onRestart();
        try {
            if (this.f8659a != null) {
                this.f8659a.mo12672f();
            }
        } catch (RemoteException e) {
            C3987mk.m17434d("#007 Could not call remote method.", e);
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        try {
            if (this.f8659a != null) {
                this.f8659a.mo12674h();
            }
        } catch (RemoteException e) {
            C3987mk.m17434d("#007 Could not call remote method.", e);
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        try {
            if (this.f8659a != null) {
                this.f8659a.mo12668b(bundle);
            }
        } catch (RemoteException e) {
            C3987mk.m17434d("#007 Could not call remote method.", e);
            finish();
        }
        super.onSaveInstanceState(bundle);
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        try {
            if (this.f8659a != null) {
                this.f8659a.mo12673g();
            }
        } catch (RemoteException e) {
            C3987mk.m17434d("#007 Could not call remote method.", e);
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        try {
            if (this.f8659a != null) {
                this.f8659a.mo12676j();
            }
        } catch (RemoteException e) {
            C3987mk.m17434d("#007 Could not call remote method.", e);
            finish();
        }
        super.onStop();
    }

    public void setContentView(int i) {
        super.setContentView(i);
        m10573a();
    }

    public void setContentView(View view) {
        super.setContentView(view);
        m10573a();
    }

    public void setContentView(View view, LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        m10573a();
    }
}
