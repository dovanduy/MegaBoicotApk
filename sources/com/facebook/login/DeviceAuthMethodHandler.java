package com.facebook.login;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.facebook.AccessToken;
import com.facebook.C2453c;
import com.facebook.login.LoginClient.Request;
import com.facebook.login.LoginClient.Result;
import java.util.Collection;
import java.util.Date;
import java.util.concurrent.ScheduledThreadPoolExecutor;

class DeviceAuthMethodHandler extends LoginMethodHandler {
    public static final Creator<DeviceAuthMethodHandler> CREATOR = new Creator() {
        /* renamed from: a */
        public DeviceAuthMethodHandler createFromParcel(Parcel parcel) {
            return new DeviceAuthMethodHandler(parcel);
        }

        /* renamed from: a */
        public DeviceAuthMethodHandler[] newArray(int i) {
            return new DeviceAuthMethodHandler[i];
        }
    };

    /* renamed from: c */
    private static ScheduledThreadPoolExecutor f8076c;

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public String mo9091a() {
        return "device_auth";
    }

    public int describeContents() {
        return 0;
    }

    DeviceAuthMethodHandler(LoginClient loginClient) {
        super(loginClient);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo9094a(Request request) {
        m9853b(request);
        return true;
    }

    /* renamed from: b */
    private void m9853b(Request request) {
        DeviceAuthDialog deviceAuthDialog = new DeviceAuthDialog();
        deviceAuthDialog.mo827a(this.f8112b.mo9158b().mo670f(), "login_with_facebook");
        deviceAuthDialog.mo9103a(request);
    }

    /* renamed from: d_ */
    public void mo9125d_() {
        this.f8112b.mo9154a(Result.m9928a(this.f8112b.mo9161c(), "User canceled log in."));
    }

    /* renamed from: a */
    public void mo9123a(Exception exc) {
        this.f8112b.mo9154a(Result.m9929a(this.f8112b.mo9161c(), null, exc.getMessage()));
    }

    /* renamed from: a */
    public void mo9124a(String str, String str2, String str3, Collection<String> collection, Collection<String> collection2, C2453c cVar, Date date, Date date2) {
        AccessToken accessToken = new AccessToken(str, str2, str3, collection, collection2, cVar, date, date2);
        this.f8112b.mo9154a(Result.m9927a(this.f8112b.mo9161c(), accessToken));
    }

    /* renamed from: c */
    public static synchronized ScheduledThreadPoolExecutor m9854c() {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor;
        synchronized (DeviceAuthMethodHandler.class) {
            if (f8076c == null) {
                f8076c = new ScheduledThreadPoolExecutor(1);
            }
            scheduledThreadPoolExecutor = f8076c;
        }
        return scheduledThreadPoolExecutor;
    }

    protected DeviceAuthMethodHandler(Parcel parcel) {
        super(parcel);
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
    }
}
