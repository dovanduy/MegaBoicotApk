package com.facebook.appevents.p128b;

import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import com.appnext.base.p046b.C1245d;
import com.facebook.C2649m;
import com.facebook.appevents.C2436g;
import com.facebook.internal.C2479ad;
import com.facebook.internal.C2484ae;
import com.facebook.internal.C2527k;
import com.facebook.internal.C2529l;
import java.math.BigDecimal;
import java.util.Currency;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.appevents.b.d */
/* compiled from: AutomaticAnalyticsLogger */
public class C2412d {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final String f7657a = C2412d.class.getCanonicalName();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static Object f7658b;

    /* renamed from: a */
    public static void m9253a() {
        Context f = C2649m.m10133f();
        String j = C2649m.m10137j();
        boolean l = C2649m.m10139l();
        C2484ae.m9489a((Object) f, "context");
        if (!l) {
            return;
        }
        if (f instanceof Application) {
            C2436g.m9319a((Application) f, j);
        } else {
            Log.w(f7657a, "Automatic logging of basic events will not happen, because FacebookSdk.getApplicationContext() returns object that is not instance of android.app.Application. Make sure you call FacebookSdk.sdkInitialize() from Application class and pass application context.");
        }
    }

    /* renamed from: a */
    public static void m9254a(String str, long j) {
        Context f = C2649m.m10133f();
        String j2 = C2649m.m10137j();
        C2484ae.m9489a((Object) f, "context");
        C2527k a = C2529l.m9634a(j2, false);
        if (a != null && a.mo9000f() && j > 0) {
            C2436g a2 = C2436g.m9318a(f);
            Bundle bundle = new Bundle(1);
            bundle.putCharSequence("fb_aa_time_spent_view_name", str);
            a2.mo8853a("fb_aa_time_spent_on_view", (double) j, bundle);
        }
    }

    /* renamed from: a */
    public static boolean m9255a(final Context context, int i, Intent intent) {
        if (intent == null || !m9256b()) {
            return false;
        }
        final String stringExtra = intent.getStringExtra("INAPP_PURCHASE_DATA");
        if (i == -1) {
            C24131 r3 = new ServiceConnection() {
                public void onServiceDisconnected(ComponentName componentName) {
                    C2412d.f7658b = null;
                    C2479ad.m9463b(C2412d.f7657a, "In-app billing service disconnected");
                }

                public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                    C2412d.f7658b = C2415f.m9260a(context, iBinder);
                    try {
                        JSONObject jSONObject = new JSONObject(stringExtra);
                        String string = jSONObject.getString("productId");
                        String a = C2415f.m9261a(context, string, C2412d.f7658b, jSONObject.has("autoRenewing"));
                        if (a.equals("")) {
                            context.unbindService(this);
                            return;
                        }
                        JSONObject jSONObject2 = new JSONObject(a);
                        C2436g a2 = C2436g.m9318a(context);
                        Bundle bundle = new Bundle(1);
                        bundle.putCharSequence("fb_iap_product_id", string);
                        bundle.putCharSequence("fb_iap_purchase_time", jSONObject.getString("purchaseTime"));
                        bundle.putCharSequence("fb_iap_purchase_state", jSONObject.getString("purchaseState"));
                        bundle.putCharSequence("fb_iap_purchase_token", jSONObject.getString("purchaseToken"));
                        bundle.putCharSequence("fb_iap_package_name", jSONObject.getString("packageName"));
                        bundle.putCharSequence("fb_iap_product_type", jSONObject2.getString(C1245d.f3961jd));
                        bundle.putCharSequence("fb_iap_product_title", jSONObject2.getString("title"));
                        bundle.putCharSequence("fb_iap_product_description", jSONObject2.getString("description"));
                        bundle.putCharSequence("fb_iap_subs_auto_renewing", Boolean.toString(jSONObject.optBoolean("autoRenewing", false)));
                        bundle.putCharSequence("fb_iap_subs_period", jSONObject2.optString("subscriptionPeriod"));
                        bundle.putCharSequence("fb_free_trial_period", jSONObject2.optString("freeTrialPeriod"));
                        bundle.putCharSequence("fb_intro_price_amount_micros", jSONObject2.optString("introductoryPriceAmountMicros"));
                        bundle.putCharSequence("fb_intro_price_cycles", jSONObject2.optString("introductoryPriceCycles"));
                        a2.mo8856a(new BigDecimal(((double) jSONObject2.getLong("price_amount_micros")) / 1000000.0d), Currency.getInstance(jSONObject2.getString("price_currency_code")), bundle);
                        context.unbindService(this);
                    } catch (JSONException e) {
                        Log.e(C2412d.f7657a, "Error parsing in-app purchase data.", e);
                    } catch (Throwable th) {
                        context.unbindService(this);
                        throw th;
                    }
                }
            };
            Intent intent2 = new Intent("com.android.vending.billing.InAppBillingService.BIND");
            intent2.setPackage("com.android.vending");
            context.bindService(intent2, r3, 1);
        }
        return true;
    }

    /* renamed from: b */
    public static boolean m9256b() {
        C2527k a = C2529l.m9632a(C2649m.m10137j());
        boolean z = false;
        if (a == null) {
            return false;
        }
        if (C2649m.m10139l() && a.mo9003i()) {
            z = true;
        }
        return z;
    }
}
