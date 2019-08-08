package com.startapp.android.publish.ads.video;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.startapp.android.publish.ads.video.C5229c.C5232a;
import com.startapp.android.publish.adsCommon.C5344b;
import java.net.URL;

/* renamed from: com.startapp.android.publish.ads.video.g */
/* compiled from: StartAppSDK */
public class C5281g {

    /* renamed from: a */
    protected Context f16987a;

    /* renamed from: b */
    protected URL f16988b;

    /* renamed from: c */
    protected String f16989c;

    /* renamed from: d */
    protected C5283a f16990d;

    /* renamed from: e */
    protected C5232a f16991e;

    /* renamed from: com.startapp.android.publish.ads.video.g$a */
    /* compiled from: StartAppSDK */
    public interface C5283a {
        /* renamed from: a */
        void mo19255a(String str);
    }

    public C5281g(Context context, URL url, String str, C5283a aVar, C5232a aVar2) {
        this.f16987a = context;
        this.f16988b = url;
        this.f16989c = str;
        this.f16990d = aVar;
        this.f16991e = aVar2;
    }

    /* renamed from: a */
    public void mo19408a() {
        final String str;
        try {
            str = C5344b.m22784a().mo19756H().mo20042i() ? C5229c.m22374a().mo19284a(this.f16987a, this.f16988b, this.f16989c, this.f16991e) : C5284h.m22595a(this.f16987a, this.f16988b, this.f16989c);
        } catch (Exception unused) {
            str = null;
        }
        new Handler(Looper.getMainLooper()).post(new Runnable() {
            public void run() {
                if (C5281g.this.f16990d != null) {
                    C5281g.this.f16990d.mo19255a(str);
                }
            }
        });
    }
}
