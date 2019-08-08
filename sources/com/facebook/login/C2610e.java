package com.facebook.login;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.support.p017v4.app.Fragment;
import android.support.p017v4.app.FragmentActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.common.C2454a.C2458d;
import com.facebook.common.C2454a.C2459e;
import com.facebook.login.LoginClient.C2602b;
import com.facebook.login.LoginClient.Request;
import com.facebook.login.LoginClient.Result;

/* renamed from: com.facebook.login.e */
/* compiled from: LoginFragment */
public class C2610e extends Fragment {

    /* renamed from: a */
    private String f8142a;

    /* renamed from: b */
    private LoginClient f8143b;

    /* renamed from: c */
    private Request f8144c;

    /* renamed from: a */
    public void mo571a(Bundle bundle) {
        super.mo571a(bundle);
        if (bundle != null) {
            this.f8143b = (LoginClient) bundle.getParcelable("loginClient");
            this.f8143b.mo9152a((Fragment) this);
        } else {
            this.f8143b = mo830c();
        }
        this.f8143b.mo9156a((C2602b) new C2602b() {
            /* renamed from: a */
            public void mo9205a(Result result) {
                C2610e.this.m9990a(result);
            }
        });
        FragmentActivity m = mo626m();
        if (m != null) {
            m9992b(m);
            Intent intent = m.getIntent();
            if (intent != null) {
                Bundle bundleExtra = intent.getBundleExtra("com.facebook.LoginFragment:Request");
                if (bundleExtra != null) {
                    this.f8144c = (Request) bundleExtra.getParcelable("request");
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public LoginClient mo830c() {
        return new LoginClient((Fragment) this);
    }

    /* renamed from: B */
    public void mo529B() {
        this.f8143b.mo9166f();
        super.mo529B();
    }

    /* renamed from: a */
    public View mo555a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C2459e.com_facebook_login_fragment, viewGroup, false);
        final View findViewById = inflate.findViewById(C2458d.com_facebook_login_fragment_progress_bar);
        this.f8143b.mo9155a((C2601a) new C2601a() {
            /* renamed from: a */
            public void mo9203a() {
                findViewById.setVisibility(0);
            }

            /* renamed from: b */
            public void mo9204b() {
                findViewById.setVisibility(8);
            }
        });
        return inflate;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m9990a(Result result) {
        this.f8144c = null;
        int i = result.f8100a == C2600a.CANCEL ? 0 : -1;
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.facebook.LoginFragment:Result", result);
        Intent intent = new Intent();
        intent.putExtras(bundle);
        if (mo636r()) {
            mo626m().setResult(i, intent);
            mo626m().finish();
        }
    }

    /* renamed from: z */
    public void mo646z() {
        super.mo646z();
        if (this.f8142a == null) {
            Log.e("LoginFragment", "Cannot call LoginFragment with a null calling package. This can occur if the launchMode of the caller is singleInstance.");
            mo626m().finish();
            return;
        }
        this.f8143b.mo9153a(this.f8144c);
    }

    /* renamed from: A */
    public void mo528A() {
        View view;
        super.mo528A();
        if (mo645y() == null) {
            view = null;
        } else {
            view = mo645y().findViewById(C2458d.com_facebook_login_fragment_progress_bar);
        }
        if (view != null) {
            view.setVisibility(8);
        }
    }

    /* renamed from: a */
    public void mo559a(int i, int i2, Intent intent) {
        super.mo559a(i, i2, intent);
        this.f8143b.mo9157a(i, i2, intent);
    }

    /* renamed from: e */
    public void mo603e(Bundle bundle) {
        super.mo603e(bundle);
        bundle.putParcelable("loginClient", this.f8143b);
    }

    /* renamed from: b */
    private void m9992b(Activity activity) {
        ComponentName callingActivity = activity.getCallingActivity();
        if (callingActivity != null) {
            this.f8142a = callingActivity.getPackageName();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public LoginClient mo9234d() {
        return this.f8143b;
    }
}
