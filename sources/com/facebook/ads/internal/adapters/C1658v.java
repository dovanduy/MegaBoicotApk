package com.facebook.ads.internal.adapters;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.p017v4.content.C0362f;
import com.facebook.ads.internal.view.C2267p;
import com.facebook.ads.internal.view.p110i.p111a.C2116a;
import com.facebook.ads.internal.view.p110i.p112b.C2135c;
import com.facebook.ads.internal.view.p110i.p112b.C2139g;
import com.facebook.ads.internal.view.p110i.p112b.C2140h;
import com.facebook.ads.internal.view.p110i.p112b.C2141i;
import com.facebook.ads.internal.view.p110i.p112b.C2143k;
import com.facebook.ads.internal.view.p110i.p112b.C2149q;
import java.io.Serializable;

/* renamed from: com.facebook.ads.internal.adapters.v */
public class C1658v extends BroadcastReceiver {

    /* renamed from: a */
    private Context f5195a;

    /* renamed from: b */
    private C2267p f5196b;

    /* renamed from: c */
    private boolean f5197c = false;

    public C1658v(C2267p pVar, Context context) {
        this.f5196b = pVar;
        this.f5195a = context.getApplicationContext();
    }

    /* renamed from: a */
    public void mo7361a() {
        IntentFilter intentFilter = new IntentFilter();
        StringBuilder sb = new StringBuilder();
        sb.append("com.facebook.ads.interstitial.displayed:");
        sb.append(this.f5196b.getUniqueId());
        intentFilter.addAction(sb.toString());
        StringBuilder sb2 = new StringBuilder();
        sb2.append("videoInterstitalEvent:");
        sb2.append(this.f5196b.getUniqueId());
        intentFilter.addAction(sb2.toString());
        StringBuilder sb3 = new StringBuilder();
        sb3.append("performCtaClick:");
        sb3.append(this.f5196b.getUniqueId());
        intentFilter.addAction(sb3.toString());
        C0362f.m1362a(this.f5195a).mo1251a(this, intentFilter);
    }

    /* renamed from: b */
    public void mo7362b() {
        try {
            C0362f.m1362a(this.f5195a).mo1250a((BroadcastReceiver) this);
        } catch (Exception unused) {
        }
    }

    public void onReceive(Context context, Intent intent) {
        String[] split = intent.getAction().split(":");
        if (split.length == 2 && split[1].equals(this.f5196b.getUniqueId())) {
            if (split[0].equals("com.facebook.ads.interstitial.displayed")) {
                if (this.f5196b.getListener() != null) {
                    this.f5196b.getListener().mo6857g();
                    this.f5196b.getListener().mo6851a();
                }
            } else if (split[0].equals("videoInterstitalEvent")) {
                Serializable serializableExtra = intent.getSerializableExtra("event");
                if (serializableExtra instanceof C2149q) {
                    if (this.f5196b.getListener() != null) {
                        this.f5196b.getListener().mo6856f();
                        this.f5196b.getListener().mo6851a();
                    }
                    if (this.f5197c) {
                        this.f5196b.mo8378a(1);
                    } else {
                        this.f5196b.mo8378a(((C2149q) serializableExtra).mo8446b());
                    }
                    this.f5196b.setVisibility(0);
                    this.f5196b.mo8380a(C2116a.USER_STARTED);
                } else if (serializableExtra instanceof C2139g) {
                    if (this.f5196b.getListener() != null) {
                        this.f5196b.getListener().mo6854d();
                    }
                } else if (serializableExtra instanceof C2140h) {
                    if (this.f5196b.getListener() != null) {
                        this.f5196b.getListener().mo6855e();
                    }
                } else if (serializableExtra instanceof C2135c) {
                    if (this.f5196b.getListener() != null) {
                        this.f5196b.getListener().mo6858h();
                    }
                    this.f5197c = true;
                } else if (serializableExtra instanceof C2143k) {
                    if (this.f5196b.getListener() != null) {
                        this.f5196b.getListener().mo6853c();
                    }
                    this.f5197c = false;
                } else if ((serializableExtra instanceof C2141i) && this.f5196b.getListener() != null) {
                    this.f5196b.getListener().mo6852b();
                }
            } else if (split[0].equals("performCtaClick")) {
                this.f5196b.mo8651b();
            }
        }
    }
}
