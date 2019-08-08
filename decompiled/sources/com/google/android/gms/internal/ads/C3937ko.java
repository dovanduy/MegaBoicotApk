package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Handler;
import android.text.TextUtils;
import com.appnext.base.p046b.C1244c;
import com.google.android.gms.ads.internal.C3025aw;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONException;
import org.json.JSONObject;

@C3718cm
/* renamed from: com.google.android.gms.internal.ads.ko */
public final class C3937ko {

    /* renamed from: a */
    private final Object f13458a = new Object();
    @GuardedBy("mLock")

    /* renamed from: b */
    private String f13459b = "";
    @GuardedBy("mLock")

    /* renamed from: c */
    private String f13460c = "";
    @GuardedBy("mLock")

    /* renamed from: d */
    private boolean f13461d = false;

    /* renamed from: e */
    private String f13462e = "";

    /* renamed from: a */
    private final String m17269a(Context context) {
        String str;
        synchronized (this.f13458a) {
            if (TextUtils.isEmpty(this.f13459b)) {
                C3025aw.m10917e();
                this.f13459b = C3909jn.m17158c(context, "debug_signals_id.txt");
                if (TextUtils.isEmpty(this.f13459b)) {
                    C3025aw.m10917e();
                    this.f13459b = C3909jn.m17128a();
                    C3025aw.m10917e();
                    C3909jn.m17155b(context, "debug_signals_id.txt", this.f13459b);
                }
            }
            str = this.f13459b;
        }
        return str;
    }

    /* renamed from: a */
    private final void m17270a(Context context, String str, boolean z, boolean z2) {
        if (!(context instanceof Activity)) {
            C3900je.m17433d("Can not create dialog without Activity Context");
            return;
        }
        Handler handler = C3909jn.f13411a;
        C3938kp kpVar = new C3938kp(this, context, str, z, z2);
        handler.post(kpVar);
    }

    /* renamed from: b */
    private final boolean m17271b(Context context, String str, String str2) {
        String d = m17274d(context, m17272c(context, (String) aoq.m14620f().mo14695a(aru.f11901cT), str, str2).toString(), str2);
        if (TextUtils.isEmpty(d)) {
            C3900je.m17429b("Not linked for in app preview.");
            return false;
        }
        try {
            JSONObject jSONObject = new JSONObject(d.trim());
            String optString = jSONObject.optString("gct");
            this.f13462e = jSONObject.optString(C1244c.STATUS);
            synchronized (this.f13458a) {
                this.f13460c = optString;
            }
            return true;
        } catch (JSONException e) {
            C3900je.m17432c("Fail to get in app preview response json.", e);
            return false;
        }
    }

    /* renamed from: c */
    private final Uri m17272c(Context context, String str, String str2, String str3) {
        Builder buildUpon = Uri.parse(str).buildUpon();
        buildUpon.appendQueryParameter("linkedDeviceId", m17269a(context));
        buildUpon.appendQueryParameter("adSlotPath", str2);
        buildUpon.appendQueryParameter("afmaVersion", str3);
        return buildUpon.build();
    }

    /* renamed from: c */
    private final boolean m17273c(Context context, String str, String str2) {
        String d = m17274d(context, m17272c(context, (String) aoq.m14620f().mo14695a(aru.f11902cU), str, str2).toString(), str2);
        if (TextUtils.isEmpty(d)) {
            C3900je.m17429b("Not linked for debug signals.");
            return false;
        }
        try {
            boolean equals = "1".equals(new JSONObject(d.trim()).optString("debug_mode"));
            synchronized (this.f13458a) {
                this.f13461d = equals;
            }
            return equals;
        } catch (JSONException e) {
            C3900je.m17432c("Fail to get debug mode response json.", e);
            return false;
        }
    }

    /* renamed from: d */
    private static String m17274d(Context context, String str, String str2) {
        String str3;
        Throwable e;
        String str4;
        String str5;
        HashMap hashMap = new HashMap();
        hashMap.put("User-Agent", C3025aw.m10917e().mo15521b(context, str2));
        C4008ne a = new C3946kx(context).mo15593a(str, (Map<String, String>) hashMap);
        try {
            return (String) a.get((long) ((Integer) aoq.m14620f().mo14695a(aru.f11904cW)).intValue(), TimeUnit.MILLISECONDS);
        } catch (TimeoutException e2) {
            e = e2;
            str5 = "Timeout while retriving a response from: ";
            str4 = String.valueOf(str);
            if (str4.length() == 0) {
                str3 = new String(str5);
                C3900je.m17430b(str3, e);
                a.cancel(true);
                return null;
            }
            str3 = str5.concat(str4);
            C3900je.m17430b(str3, e);
            a.cancel(true);
            return null;
        } catch (InterruptedException e3) {
            e = e3;
            str5 = "Interrupted while retriving a response from: ";
            str4 = String.valueOf(str);
            if (str4.length() == 0) {
                str3 = new String(str5);
                C3900je.m17430b(str3, e);
                a.cancel(true);
                return null;
            }
            str3 = str5.concat(str4);
            C3900je.m17430b(str3, e);
            a.cancel(true);
            return null;
        } catch (Exception e4) {
            String str6 = "Error retriving a response from: ";
            String valueOf = String.valueOf(str);
            C3900je.m17430b(valueOf.length() != 0 ? str6.concat(valueOf) : new String(str6), e4);
            return null;
        }
    }

    /* renamed from: e */
    private final void m17275e(Context context, String str, String str2) {
        C3025aw.m10917e();
        C3909jn.m17137a(context, m17272c(context, (String) aoq.m14620f().mo14695a(aru.f11900cS), str, str2));
    }

    /* renamed from: a */
    public final String mo15577a() {
        String str;
        synchronized (this.f13458a) {
            str = this.f13460c;
        }
        return str;
    }

    /* renamed from: a */
    public final void mo15578a(Context context, String str, String str2) {
        if (!m17271b(context, str, str2)) {
            m17270a(context, "In-app preview failed to load because of a system error. Please try again later.", true, true);
        } else if ("2".equals(this.f13462e)) {
            C3900je.m17429b("Creative is not pushed for this device.");
            m17270a(context, "There was no creative pushed from DFP to the device.", false, false);
        } else if ("1".equals(this.f13462e)) {
            C3900je.m17429b("The app is not linked for creative preview.");
            m17275e(context, str, str2);
        } else {
            if ("0".equals(this.f13462e)) {
                C3900je.m17429b("Device is linked for in app preview.");
                m17270a(context, "The device is successfully linked for creative preview.", false, true);
            }
        }
    }

    /* renamed from: a */
    public final void mo15579a(Context context, String str, String str2, @Nullable String str3) {
        boolean b = mo15581b();
        if (m17273c(context, str, str2)) {
            if (!b && !TextUtils.isEmpty(str3)) {
                mo15580b(context, str2, str3, str);
            }
            C3900je.m17429b("Device is linked for debug signals.");
            m17270a(context, "The device is successfully linked for troubleshooting.", false, true);
            return;
        }
        m17275e(context, str, str2);
    }

    /* renamed from: b */
    public final void mo15580b(Context context, String str, String str2, String str3) {
        Builder buildUpon = m17272c(context, (String) aoq.m14620f().mo14695a(aru.f11903cV), str3, str).buildUpon();
        buildUpon.appendQueryParameter("debugData", str2);
        C3025aw.m10917e();
        C3909jn.m17138a(context, str, buildUpon.build().toString());
    }

    /* renamed from: b */
    public final boolean mo15581b() {
        boolean z;
        synchronized (this.f13458a) {
            z = this.f13461d;
        }
        return z;
    }
}
