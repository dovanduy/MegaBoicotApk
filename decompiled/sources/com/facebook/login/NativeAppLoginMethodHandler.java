package com.facebook.login;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import com.facebook.C2453c;
import com.facebook.C2579j;
import com.facebook.internal.C2476aa;
import com.facebook.internal.C2479ad;
import com.facebook.login.LoginClient.Request;
import com.facebook.login.LoginClient.Result;

abstract class NativeAppLoginMethodHandler extends LoginMethodHandler {
    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract boolean mo9094a(Request request);

    NativeAppLoginMethodHandler(LoginClient loginClient) {
        super(loginClient);
    }

    NativeAppLoginMethodHandler(Parcel parcel) {
        super(parcel);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo9093a(int i, int i2, Intent intent) {
        Result result;
        Request c = this.f8112b.mo9161c();
        if (intent == null) {
            result = Result.m9928a(c, "Operation canceled");
        } else if (i2 == 0) {
            result = m9952b(c, intent);
        } else if (i2 != -1) {
            result = Result.m9929a(c, "Unexpected resultCode from authorization.", null);
        } else {
            result = m9950a(c, intent);
        }
        if (result != null) {
            this.f8112b.mo9154a(result);
        } else {
            this.f8112b.mo9169i();
        }
        return true;
    }

    /* renamed from: a */
    private Result m9950a(Request request, Intent intent) {
        Bundle extras = intent.getExtras();
        String a = m9951a(extras);
        String obj = extras.get("error_code") != null ? extras.get("error_code").toString() : null;
        String b = m9953b(extras);
        String string = extras.getString("e2e");
        if (!C2479ad.m9456a(string)) {
            mo9209b(string);
        }
        if (a == null && obj == null && b == null) {
            try {
                return Result.m9927a(request, m9938a(request.mo9178a(), extras, C2453c.FACEBOOK_APPLICATION_WEB, request.mo9184d()));
            } catch (C2579j e) {
                return Result.m9929a(request, null, e.getMessage());
            }
        } else if (C2476aa.f7795a.contains(a)) {
            return null;
        } else {
            if (C2476aa.f7796b.contains(a)) {
                return Result.m9928a(request, (String) null);
            }
            return Result.m9930a(request, a, b, obj);
        }
    }

    /* renamed from: b */
    private Result m9952b(Request request, Intent intent) {
        Bundle extras = intent.getExtras();
        String a = m9951a(extras);
        String obj = extras.get("error_code") != null ? extras.get("error_code").toString() : null;
        if ("CONNECTION_FAILURE".equals(obj)) {
            return Result.m9930a(request, a, m9953b(extras), obj);
        }
        return Result.m9928a(request, a);
    }

    /* renamed from: a */
    private String m9951a(Bundle bundle) {
        String string = bundle.getString("error");
        return string == null ? bundle.getString("error_type") : string;
    }

    /* renamed from: b */
    private String m9953b(Bundle bundle) {
        String string = bundle.getString("error_message");
        return string == null ? bundle.getString("error_description") : string;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo9211a(Intent intent, int i) {
        if (intent == null) {
            return false;
        }
        try {
            this.f8112b.mo9151a().startActivityForResult(intent, i);
            return true;
        } catch (ActivityNotFoundException unused) {
            return false;
        }
    }
}
