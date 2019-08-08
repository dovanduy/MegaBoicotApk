package com.facebook.login;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.facebook.internal.C2566x;
import com.facebook.login.LoginClient.Request;

class KatanaProxyLoginMethodHandler extends NativeAppLoginMethodHandler {
    public static final Creator<KatanaProxyLoginMethodHandler> CREATOR = new Creator<KatanaProxyLoginMethodHandler>() {
        /* renamed from: a */
        public KatanaProxyLoginMethodHandler createFromParcel(Parcel parcel) {
            return new KatanaProxyLoginMethodHandler(parcel);
        }

        /* renamed from: a */
        public KatanaProxyLoginMethodHandler[] newArray(int i) {
            return new KatanaProxyLoginMethodHandler[i];
        }
    };

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public String mo9091a() {
        return "katana_proxy_auth";
    }

    public int describeContents() {
        return 0;
    }

    KatanaProxyLoginMethodHandler(LoginClient loginClient) {
        super(loginClient);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo9094a(Request request) {
        String m = LoginClient.m9886m();
        Intent b = C2566x.m9751b(this.f8112b.mo9158b(), request.mo9184d(), request.mo9178a(), m, request.mo9187f(), request.mo9190i(), request.mo9183c(), mo9206a(request.mo9186e()), request.mo9189h());
        mo9208a("e2e", m);
        return mo9211a(b, LoginClient.m9884d());
    }

    KatanaProxyLoginMethodHandler(Parcel parcel) {
        super(parcel);
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
    }
}
