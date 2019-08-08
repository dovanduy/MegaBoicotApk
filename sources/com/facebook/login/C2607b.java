package com.facebook.login;

import android.net.Uri;
import com.facebook.login.LoginClient.Request;
import java.util.Collection;

/* renamed from: com.facebook.login.b */
/* compiled from: DeviceLoginManager */
public class C2607b extends C2614g {

    /* renamed from: b */
    private static volatile C2607b f8127b;

    /* renamed from: a */
    private Uri f8128a;

    /* renamed from: a */
    public static C2607b m9979a() {
        if (f8127b == null) {
            synchronized (C2607b.class) {
                if (f8127b == null) {
                    f8127b = new C2607b();
                }
            }
        }
        return f8127b;
    }

    /* renamed from: a */
    public void mo9226a(Uri uri) {
        this.f8128a = uri;
    }

    /* renamed from: b */
    public Uri mo9227b() {
        return this.f8128a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Request mo9225a(Collection<String> collection) {
        Request a = super.mo9225a(collection);
        Uri b = mo9227b();
        if (b != null) {
            a.mo9179a(b.toString());
        }
        return a;
    }
}
