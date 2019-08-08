package com.facebook.internal;

import android.content.Intent;
import android.util.Log;
import com.facebook.C2468e;
import com.facebook.C2649m;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.internal.d */
/* compiled from: CallbackManagerImpl */
public final class C2512d implements C2468e {

    /* renamed from: a */
    private static final String f7879a = "d";

    /* renamed from: b */
    private static Map<Integer, C2513a> f7880b = new HashMap();

    /* renamed from: c */
    private Map<Integer, C2513a> f7881c = new HashMap();

    /* renamed from: com.facebook.internal.d$a */
    /* compiled from: CallbackManagerImpl */
    public interface C2513a {
        /* renamed from: a */
        boolean mo8988a(int i, Intent intent);
    }

    /* renamed from: com.facebook.internal.d$b */
    /* compiled from: CallbackManagerImpl */
    public enum C2514b {
        Login(0),
        Share(1),
        Message(2),
        Like(3),
        GameRequest(4),
        AppGroupCreate(5),
        AppGroupJoin(6),
        AppInvite(7),
        DeviceShare(8),
        InAppPurchase(9);
        

        /* renamed from: k */
        private final int f7893k;

        private C2514b(int i) {
            this.f7893k = i;
        }

        /* renamed from: a */
        public int mo8989a() {
            return C2649m.m10141n() + this.f7893k;
        }
    }

    /* renamed from: a */
    public static synchronized void m9586a(int i, C2513a aVar) {
        synchronized (C2512d.class) {
            C2484ae.m9489a((Object) aVar, "callback");
            if (!f7880b.containsKey(Integer.valueOf(i))) {
                f7880b.put(Integer.valueOf(i), aVar);
            }
        }
    }

    /* renamed from: a */
    private static synchronized C2513a m9585a(Integer num) {
        C2513a aVar;
        synchronized (C2512d.class) {
            aVar = (C2513a) f7880b.get(num);
        }
        return aVar;
    }

    /* renamed from: b */
    private static boolean m9588b(int i, int i2, Intent intent) {
        C2513a a = m9585a(Integer.valueOf(i));
        if (a != null) {
            return a.mo8988a(i2, intent);
        }
        return false;
    }

    /* renamed from: b */
    public void mo8987b(int i, C2513a aVar) {
        C2484ae.m9489a((Object) aVar, "callback");
        this.f7881c.put(Integer.valueOf(i), aVar);
    }

    /* renamed from: a */
    public boolean mo8887a(int i, int i2, Intent intent) {
        if (m9587a(intent)) {
            i = C2514b.InAppPurchase.mo8989a();
        }
        C2513a aVar = (C2513a) this.f7881c.get(Integer.valueOf(i));
        if (aVar != null) {
            return aVar.mo8988a(i2, intent);
        }
        return m9588b(i, i2, intent);
    }

    /* renamed from: a */
    private static boolean m9587a(Intent intent) {
        boolean z = false;
        if (intent != null) {
            String stringExtra = intent.getStringExtra("INAPP_PURCHASE_DATA");
            if (stringExtra != null) {
                try {
                    JSONObject jSONObject = new JSONObject(stringExtra);
                    if (jSONObject.has("orderId") && jSONObject.has("packageName") && jSONObject.has("productId") && jSONObject.has("purchaseTime") && jSONObject.has("purchaseState") && jSONObject.has("developerPayload") && jSONObject.has("purchaseToken")) {
                        z = true;
                    }
                    return z;
                } catch (JSONException e) {
                    Log.e(f7879a, "Error parsing intent data.", e);
                    return false;
                }
            }
        }
        return false;
    }
}
