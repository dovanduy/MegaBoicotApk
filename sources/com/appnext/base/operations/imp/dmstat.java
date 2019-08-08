package com.appnext.base.operations.imp;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.appnext.base.operations.C1269d;
import com.appnext.base.p042a.p044b.C1230b;
import com.appnext.base.p042a.p044b.C1231c;
import com.appnext.base.p046b.C1245d;
import com.appnext.base.p046b.C1245d.C1246a;
import com.appnext.base.p046b.C1247e;
import com.appnext.base.p046b.C1248f;
import com.appnext.base.p046b.C1259k;
import com.appnext.base.receivers.EventsReceiver;
import com.google.android.gms.location.ActivityTransition;
import com.google.android.gms.location.ActivityTransition.C4696a;
import com.google.android.gms.location.ActivityTransitionEvent;
import com.google.android.gms.location.ActivityTransitionRequest;
import com.google.android.gms.location.ActivityTransitionResult;
import com.google.android.gms.location.C4698a;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public class dmstat extends C1269d {

    /* renamed from: hA */
    public static final String f4032hA = "driving_state";

    /* renamed from: hB */
    public static final String f4033hB = "callbackFromActivityRecognation";

    /* renamed from: hC */
    private static final String f4034hC = "com.google.android.gms.permission.ACTIVITY_RECOGNITION";

    /* renamed from: hD */
    private static final Integer[] f4035hD = {Integer.valueOf(0), Integer.valueOf(8), Integer.valueOf(1), Integer.valueOf(3)};

    /* renamed from: hE */
    private static final String f4036hE = "value";

    /* renamed from: hF */
    private static final String f4037hF = "transition";

    /* renamed from: hG */
    private Object f4038hG;

    public dmstat(C1231c cVar, Bundle bundle, Object obj) {
        super(cVar, bundle, obj);
        this.f4038hG = obj;
    }

    /* access modifiers changed from: protected */
    public List<C1230b> getData() {
        if (this.f4038hG == null) {
            m5421bH();
            return null;
        } else if (!(this.f4038hG instanceof Intent)) {
            m5421bH();
            return null;
        } else {
            Intent intent = (Intent) this.f4038hG;
            String action = intent.getAction();
            if (TextUtils.isEmpty(action) || !action.equals(f4033hB)) {
                m5421bH();
                return null;
            }
            if (ActivityTransitionResult.m20267a(intent)) {
                ActivityTransitionResult b = ActivityTransitionResult.m20268b(intent);
                if (b != null) {
                    List<ActivityTransitionEvent> a = b.mo16992a();
                    if (a != null) {
                        JSONArray jSONArray = new JSONArray();
                        for (ActivityTransitionEvent activityTransitionEvent : a) {
                            jSONArray.put(m5419a(activityTransitionEvent.mo16981a(), activityTransitionEvent.mo16982b()));
                            if (activityTransitionEvent.mo16981a() == 0) {
                                C1259k.m5337b(f4032hA, String.valueOf(activityTransitionEvent.mo16982b() == 0), C1246a.Boolean);
                            }
                        }
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(new C1230b(dmstat.class.getSimpleName(), jSONArray.toString(), C1246a.JSONArray.getType()));
                        return arrayList;
                    }
                }
            }
            return null;
        }
    }

    @SuppressLint({"MissingPermission"})
    /* renamed from: bH */
    private void m5421bH() {
        C4698a.m20291a(C1247e.getContext()).mo17043a(m5422bI(), m5424g(134217728));
    }

    /* renamed from: bI */
    private ActivityTransitionRequest m5422bI() {
        ArrayList arrayList = new ArrayList();
        for (Integer intValue : f4035hD) {
            arrayList.addAll(m5423f(intValue.intValue()));
        }
        return new ActivityTransitionRequest(arrayList);
    }

    /* renamed from: f */
    private static List<ActivityTransition> m5423f(int i) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C4696a().mo16978a(i).mo16980b(0).mo16979a());
        arrayList.add(new C4696a().mo16978a(i).mo16980b(1).mo16979a());
        return arrayList;
    }

    /* renamed from: b */
    private List<C1230b> m5420b(Intent intent) {
        if (ActivityTransitionResult.m20267a(intent)) {
            ActivityTransitionResult b = ActivityTransitionResult.m20268b(intent);
            if (b != null) {
                List<ActivityTransitionEvent> a = b.mo16992a();
                if (a != null) {
                    JSONArray jSONArray = new JSONArray();
                    for (ActivityTransitionEvent activityTransitionEvent : a) {
                        jSONArray.put(m5419a(activityTransitionEvent.mo16981a(), activityTransitionEvent.mo16982b()));
                        if (activityTransitionEvent.mo16981a() == 0) {
                            C1259k.m5337b(f4032hA, String.valueOf(activityTransitionEvent.mo16982b() == 0), C1246a.Boolean);
                        }
                    }
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(new C1230b(dmstat.class.getSimpleName(), jSONArray.toString(), C1246a.JSONArray.getType()));
                    return arrayList;
                }
            }
        }
        return null;
    }

    /* renamed from: g */
    private static PendingIntent m5424g(int i) {
        Intent intent = new Intent(C1247e.getContext(), EventsReceiver.class);
        intent.setAction(f4033hB);
        intent.putExtra(C1245d.f3950iS, dmstat.class.getSimpleName());
        return PendingIntent.getBroadcast(C1247e.getContext(), dmstat.class.hashCode(), intent, i);
    }

    /* renamed from: a */
    private static JSONObject m5419a(int i, int i2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(f4036hE, i);
            jSONObject.put(f4037hF, i2);
            return jSONObject;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    @SuppressLint({"MissingPermission"})
    public final void cancel() {
        super.cancel();
        if (mo5999bA()) {
            C4698a.m20291a(C1247e.getContext()).mo17042a(m5424g(268435456));
        }
    }

    /* renamed from: bA */
    public final boolean mo5999bA() {
        return C1248f.m5280g(C1247e.getContext(), f4034hC);
    }

    /* access modifiers changed from: protected */
    public final String getKey() {
        return dmstat.class.getSimpleName();
    }
}
