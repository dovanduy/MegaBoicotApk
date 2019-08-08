package com.facebook.login;

import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.facebook.internal.C2566x;
import com.facebook.login.LoginClient.Request;
import java.util.Collection;

class FacebookLiteLoginMethodHandler extends NativeAppLoginMethodHandler {
    public static final Creator<FacebookLiteLoginMethodHandler> CREATOR = new Creator<FacebookLiteLoginMethodHandler>() {
        /* renamed from: a */
        public FacebookLiteLoginMethodHandler createFromParcel(Parcel parcel) {
            return new FacebookLiteLoginMethodHandler(parcel);
        }

        /* renamed from: a */
        public FacebookLiteLoginMethodHandler[] newArray(int i) {
            return new FacebookLiteLoginMethodHandler[i];
        }
    };

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public String mo9091a() {
        return "fb_lite_login";
    }

    public int describeContents() {
        return 0;
    }

    FacebookLiteLoginMethodHandler(LoginClient loginClient) {
        super(loginClient);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo9094a(Request request) {
        String m = LoginClient.m9886m();
        Intent a = C2566x.m9741a((Context) this.f8112b.mo9158b(), request.mo9184d(), (Collection<String>) request.mo9178a(), m, request.mo9187f(), request.mo9190i(), request.mo9183c(), mo9206a(request.mo9186e()), request.mo9189h());
        mo9208a("e2e", m);
        return mo9211a(a, LoginClient.m9884d());
    }

    FacebookLiteLoginMethodHandler(Parcel parcel) {
        super(parcel);
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
    }
}
