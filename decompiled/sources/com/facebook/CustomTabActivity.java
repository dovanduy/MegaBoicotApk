package com.facebook;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.support.p017v4.content.C0362f;

public class CustomTabActivity extends Activity {

    /* renamed from: a */
    public static final String f4505a;

    /* renamed from: b */
    public static final String f4506b;

    /* renamed from: c */
    private BroadcastReceiver f4507c;

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(CustomTabActivity.class.getSimpleName());
        sb.append(".action_customTabRedirect");
        f4505a = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(CustomTabActivity.class.getSimpleName());
        sb2.append(".action_destroy");
        f4506b = sb2.toString();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = new Intent(this, CustomTabMainActivity.class);
        intent.setAction(f4505a);
        intent.putExtra(CustomTabMainActivity.f4511c, getIntent().getDataString());
        intent.addFlags(603979776);
        startActivityForResult(intent, 2);
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == 0) {
            Intent intent2 = new Intent(f4505a);
            intent2.putExtra(CustomTabMainActivity.f4511c, getIntent().getDataString());
            C0362f.m1362a((Context) this).mo1252a(intent2);
            this.f4507c = new BroadcastReceiver() {
                public void onReceive(Context context, Intent intent) {
                    CustomTabActivity.this.finish();
                }
            };
            C0362f.m1362a((Context) this).mo1251a(this.f4507c, new IntentFilter(f4506b));
        }
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        C0362f.m1362a((Context) this).mo1250a(this.f4507c);
        super.onDestroy();
    }
}
