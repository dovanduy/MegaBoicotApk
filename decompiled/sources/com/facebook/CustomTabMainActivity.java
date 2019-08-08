package com.facebook;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.support.p017v4.content.C0362f;
import com.facebook.internal.C2515e;

public class CustomTabMainActivity extends Activity {

    /* renamed from: a */
    public static final String f4509a;

    /* renamed from: b */
    public static final String f4510b;

    /* renamed from: c */
    public static final String f4511c;

    /* renamed from: d */
    public static final String f4512d;

    /* renamed from: e */
    private boolean f4513e = true;

    /* renamed from: f */
    private BroadcastReceiver f4514f;

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(CustomTabMainActivity.class.getSimpleName());
        sb.append(".extra_params");
        f4509a = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(CustomTabMainActivity.class.getSimpleName());
        sb2.append(".extra_chromePackage");
        f4510b = sb2.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(CustomTabMainActivity.class.getSimpleName());
        sb3.append(".extra_url");
        f4511c = sb3.toString();
        StringBuilder sb4 = new StringBuilder();
        sb4.append(CustomTabMainActivity.class.getSimpleName());
        sb4.append(".action_refresh");
        f4512d = sb4.toString();
    }

    /* renamed from: a */
    public static final String m6185a() {
        StringBuilder sb = new StringBuilder();
        sb.append("fb");
        sb.append(C2649m.m10137j());
        sb.append("://authorize");
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (CustomTabActivity.f4505a.equals(getIntent().getAction())) {
            setResult(0);
            finish();
            return;
        }
        if (bundle == null) {
            Bundle bundleExtra = getIntent().getBundleExtra(f4509a);
            new C2515e("oauth", bundleExtra).mo8990a(this, getIntent().getStringExtra(f4510b));
            this.f4513e = false;
            this.f4514f = new BroadcastReceiver() {
                public void onReceive(Context context, Intent intent) {
                    Intent intent2 = new Intent(CustomTabMainActivity.this, CustomTabMainActivity.class);
                    intent2.setAction(CustomTabMainActivity.f4512d);
                    intent2.putExtra(CustomTabMainActivity.f4511c, intent.getStringExtra(CustomTabMainActivity.f4511c));
                    intent2.addFlags(603979776);
                    CustomTabMainActivity.this.startActivity(intent2);
                }
            };
            C0362f.m1362a((Context) this).mo1251a(this.f4514f, new IntentFilter(CustomTabActivity.f4505a));
        }
    }

    /* access modifiers changed from: protected */
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (f4512d.equals(intent.getAction())) {
            C0362f.m1362a((Context) this).mo1252a(new Intent(CustomTabActivity.f4506b));
            m6186a(-1, intent);
        } else if (CustomTabActivity.f4505a.equals(intent.getAction())) {
            m6186a(-1, intent);
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        if (this.f4513e) {
            m6186a(0, null);
        }
        this.f4513e = true;
    }

    /* renamed from: a */
    private void m6186a(int i, Intent intent) {
        C0362f.m1362a((Context) this).mo1250a(this.f4514f);
        if (intent != null) {
            setResult(i, intent);
        } else {
            setResult(i);
        }
        finish();
    }
}
