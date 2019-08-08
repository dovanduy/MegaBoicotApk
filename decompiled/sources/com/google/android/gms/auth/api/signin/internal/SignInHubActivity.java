package com.google.android.gms.auth.api.signin.internal;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.support.p017v4.app.C0297r.C0298a;
import android.support.p017v4.app.FragmentActivity;
import android.support.p017v4.content.C0358e;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.C3266f;
import com.google.android.gms.common.api.Status;

@KeepName
public class SignInHubActivity extends FragmentActivity {

    /* renamed from: k */
    private static boolean f9402k = false;

    /* renamed from: l */
    private boolean f9403l = false;

    /* renamed from: m */
    private SignInConfiguration f9404m;

    /* renamed from: n */
    private boolean f9405n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public int f9406o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public Intent f9407p;

    /* renamed from: com.google.android.gms.auth.api.signin.internal.SignInHubActivity$a */
    private class C3208a implements C0298a<Void> {
        private C3208a() {
        }

        /* renamed from: a */
        public final void mo1040a(C0358e<Void> eVar) {
        }

        /* renamed from: a */
        public final C0358e<Void> mo1039a(int i, Bundle bundle) {
            return new C3214f(SignInHubActivity.this, C3266f.m11650a());
        }

        /* renamed from: a */
        public final /* synthetic */ void mo1041a(C0358e eVar, Object obj) {
            SignInHubActivity.this.setResult(SignInHubActivity.this.f9406o, SignInHubActivity.this.f9407p);
            SignInHubActivity.this.finish();
        }
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return true;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        String action = intent.getAction();
        if ("com.google.android.gms.auth.NO_IMPL".equals(action)) {
            m11510c(12500);
        } else if (action.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN") || action.equals("com.google.android.gms.auth.APPAUTH_SIGN_IN")) {
            this.f9404m = (SignInConfiguration) intent.getBundleExtra("config").getParcelable("config");
            if (this.f9404m == null) {
                Log.e("AuthSignInClient", "Activity started with invalid configuration.");
                setResult(0);
                finish();
                return;
            }
            if (!(bundle == null)) {
                this.f9405n = bundle.getBoolean("signingInGoogleApiClients");
                if (this.f9405n) {
                    this.f9406o = bundle.getInt("signInResultCode");
                    this.f9407p = (Intent) bundle.getParcelable("signInResultData");
                    m11511h();
                }
            } else if (f9402k) {
                setResult(0);
                m11510c(12502);
            } else {
                f9402k = true;
                Intent intent2 = new Intent(action);
                if (action.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN")) {
                    intent2.setPackage("com.google.android.gms");
                } else {
                    intent2.setPackage(getPackageName());
                }
                intent2.putExtra("config", this.f9404m);
                try {
                    startActivityForResult(intent2, 40962);
                } catch (ActivityNotFoundException unused) {
                    this.f9403l = true;
                    Log.w("AuthSignInClient", "Could not launch sign in Intent. Google Play Service is probably being updated...");
                    m11510c(17);
                }
            }
        } else {
            String str = "AuthSignInClient";
            String str2 = "Unknown action: ";
            String valueOf = String.valueOf(intent.getAction());
            Log.e(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("signingInGoogleApiClients", this.f9405n);
        if (this.f9405n) {
            bundle.putInt("signInResultCode", this.f9406o);
            bundle.putParcelable("signInResultData", this.f9407p);
        }
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        if (!this.f9403l) {
            setResult(0);
            if (i == 40962) {
                if (intent != null) {
                    SignInAccount signInAccount = (SignInAccount) intent.getParcelableExtra("signInAccount");
                    if (signInAccount != null && signInAccount.mo12978a() != null) {
                        GoogleSignInAccount a = signInAccount.mo12978a();
                        C3221m.m11556a(this).mo13024a(this.f9404m.mo12993a(), a);
                        intent.removeExtra("signInAccount");
                        intent.putExtra("googleSignInAccount", a);
                        this.f9405n = true;
                        this.f9406o = i2;
                        this.f9407p = intent;
                        m11511h();
                        return;
                    } else if (intent.hasExtra("errorCode")) {
                        int intExtra = intent.getIntExtra("errorCode", 8);
                        if (intExtra == 13) {
                            intExtra = 12501;
                        }
                        m11510c(intExtra);
                        return;
                    }
                }
                m11510c(8);
            }
        }
    }

    /* renamed from: h */
    private final void m11511h() {
        mo671g().mo764a(0, null, new C3208a());
        f9402k = false;
    }

    /* renamed from: c */
    private final void m11510c(int i) {
        Status status = new Status(i);
        Intent intent = new Intent();
        intent.putExtra("googleSignInStatus", status);
        setResult(0, intent);
        finish();
        f9402k = false;
    }
}
