package com.facebook.appevents.p128b;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import com.facebook.internal.C2479ad;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: com.facebook.appevents.b.f */
/* compiled from: InAppPurchaseEventManager */
public class C2415f {

    /* renamed from: a */
    private static final HashMap<String, Method> f7661a = new HashMap<>();

    /* renamed from: b */
    private static final HashMap<String, Class<?>> f7662b = new HashMap<>();

    /* renamed from: c */
    private static final String f7663c = C2415f.class.getCanonicalName();

    /* renamed from: a */
    public static Object m9260a(Context context, IBinder iBinder) {
        try {
            Method method = (Method) f7661a.get("iap_get_interface");
            if (method == null) {
                method = context.getClassLoader().loadClass("com.android.vending.billing.IInAppBillingService$Stub").getDeclaredMethod("asInterface", new Class[]{IBinder.class});
                f7661a.put("iap_get_interface", method);
            }
            Object[] objArr = {iBinder};
            C2479ad.m9463b(f7663c, "In-app billing service connected");
            return method.invoke(null, objArr);
        } catch (ClassNotFoundException e) {
            Log.e(f7663c, "com.android.vending.billing.IInAppBillingService$Stub is not available, please add com.android.vending.billing.IInAppBillingService to the project.", e);
            return null;
        } catch (NoSuchMethodException e2) {
            Log.e(f7663c, "com.android.vending.billing.IInAppBillingService$Stub.asInterface method not found", e2);
            return null;
        } catch (IllegalAccessException e3) {
            Log.e(f7663c, "Illegal access to method com.android.vending.billing.IInAppBillingService$Stub.asInterface", e3);
            return null;
        } catch (InvocationTargetException e4) {
            Log.e(f7663c, "Invocation target exception in com.android.vending.billing.IInAppBillingService$Stub.asInterface", e4);
            return null;
        }
    }

    /* renamed from: a */
    public static String m9261a(Context context, String str, Object obj, boolean z) {
        if (obj == null || str == "") {
            return "";
        }
        try {
            Method method = (Method) f7661a.get("iap_get_sku_details");
            Class cls = (Class) f7662b.get("com.android.vending.billing.IInAppBillingService");
            if (method == null || cls == null) {
                cls = context.getClassLoader().loadClass("com.android.vending.billing.IInAppBillingService");
                method = cls.getDeclaredMethod("getSkuDetails", new Class[]{Integer.TYPE, String.class, String.class, Bundle.class});
                f7661a.put("iap_get_sku_details", method);
                f7662b.put("com.android.vending.billing.IInAppBillingService", cls);
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(str);
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("ITEM_ID_LIST", arrayList);
            Object cast = cls.cast(obj);
            Object[] objArr = new Object[4];
            objArr[0] = Integer.valueOf(3);
            objArr[1] = context.getPackageName();
            objArr[2] = z ? "subs" : "inapp";
            objArr[3] = bundle;
            Bundle bundle2 = (Bundle) method.invoke(cast, objArr);
            if (bundle2.getInt("RESPONSE_CODE") == 0) {
                ArrayList stringArrayList = bundle2.getStringArrayList("DETAILS_LIST");
                return stringArrayList.size() < 1 ? "" : (String) stringArrayList.get(0);
            }
        } catch (ClassNotFoundException e) {
            Log.e(f7663c, "com.android.vending.billing.IInAppBillingService is not available, please add com.android.vending.billing.IInAppBillingService to the project, and import the IInAppBillingService.aidl file into this package", e);
        } catch (NoSuchMethodException e2) {
            Log.e(f7663c, "com.android.vending.billing.IInAppBillingService.getSkuDetails method is not available", e2);
        } catch (InvocationTargetException e3) {
            Log.e(f7663c, "Invocation target exception in com.android.vending.billing.IInAppBillingService.getSkuDetails", e3);
        } catch (IllegalAccessException e4) {
            Log.e(f7663c, "Illegal access to method com.android.vending.billing.IInAppBillingService.getSkuDetails", e4);
        }
        return "";
    }
}
