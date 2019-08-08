package com.facebook.login.widget;

import android.content.Context;
import android.net.Uri;
import android.util.AttributeSet;
import com.facebook.login.C2607b;
import com.facebook.login.C2609d;
import com.facebook.login.C2614g;

public class DeviceLoginButton extends LoginButton {

    /* renamed from: a */
    private Uri f8167a;

    /* renamed from: com.facebook.login.widget.DeviceLoginButton$a */
    private class C2632a extends C2638b {
        private C2632a() {
            super();
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public C2614g mo9264a() {
            C2607b a = C2607b.m9979a();
            a.mo9244a(DeviceLoginButton.this.getDefaultAudience());
            a.mo9245a(C2609d.DEVICE_AUTH);
            a.mo9226a(DeviceLoginButton.this.getDeviceRedirectUri());
            return a;
        }
    }

    public DeviceLoginButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public DeviceLoginButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void setDeviceRedirectUri(Uri uri) {
        this.f8167a = uri;
    }

    public Uri getDeviceRedirectUri() {
        return this.f8167a;
    }

    /* access modifiers changed from: protected */
    public C2638b getNewLoginClickListener() {
        return new C2632a();
    }
}
