package com.google.firebase.iid;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Parcelable;
import android.support.p017v4.content.WakefulBroadcastReceiver;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.common.util.C3563o;
import javax.annotation.concurrent.GuardedBy;

public final class FirebaseInstanceIdReceiver extends WakefulBroadcastReceiver {

    /* renamed from: a */
    private static boolean f16167a = false;
    @GuardedBy("FirebaseInstanceIdReceiver.class")

    /* renamed from: b */
    private static C4972aj f16168b;
    @GuardedBy("FirebaseInstanceIdReceiver.class")

    /* renamed from: c */
    private static C4972aj f16169c;

    public final void onReceive(Context context, Intent intent) {
        if (intent != null) {
            Parcelable parcelableExtra = intent.getParcelableExtra("wrapped_intent");
            Intent intent2 = parcelableExtra instanceof Intent ? (Intent) parcelableExtra : null;
            if (intent2 != null) {
                m21612a(context, intent2, intent.getAction());
            } else {
                m21612a(context, intent, intent.getAction());
            }
        }
    }

    /* renamed from: a */
    private final void m21612a(Context context, Intent intent, String str) {
        String str2 = null;
        intent.setComponent(null);
        intent.setPackage(context.getPackageName());
        if (VERSION.SDK_INT <= 18) {
            intent.removeCategory(context.getPackageName());
        }
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        if ("google.com/iid".equals(intent.getStringExtra("from")) || "com.google.firebase.INSTANCE_ID_EVENT".equals(str)) {
            str2 = "com.google.firebase.INSTANCE_ID_EVENT";
        } else if ("com.google.android.c2dm.intent.RECEIVE".equals(str) || "com.google.firebase.MESSAGING_EVENT".equals(str)) {
            str2 = "com.google.firebase.MESSAGING_EVENT";
        } else {
            Log.d("FirebaseInstanceId", "Unexpected intent");
        }
        int i = -1;
        if (str2 != null) {
            i = m21610a(this, context, str2, intent);
        }
        if (isOrderedBroadcast()) {
            setResultCode(i);
        }
    }

    @SuppressLint({"InlinedApi"})
    /* renamed from: a */
    public static int m21610a(BroadcastReceiver broadcastReceiver, Context context, String str, Intent intent) {
        boolean z = false;
        boolean z2 = C3563o.m12773l() && context.getApplicationInfo().targetSdkVersion >= 26;
        if ((intent.getFlags() & 268435456) != 0) {
            z = true;
        }
        if (z2 && !z) {
            return m21613b(broadcastReceiver, context, str, intent);
        }
        int a = C5013y.m21739a().mo17971a(context, str, intent);
        if (!C3563o.m12773l() || a != 402) {
            return a;
        }
        m21613b(broadcastReceiver, context, str, intent);
        return 403;
    }

    /* renamed from: b */
    private static int m21613b(BroadcastReceiver broadcastReceiver, Context context, String str, Intent intent) {
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            String str2 = "FirebaseInstanceId";
            String str3 = "Binding to service: ";
            String valueOf = String.valueOf(str);
            Log.d(str2, valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
        }
        if (broadcastReceiver.isOrderedBroadcast()) {
            broadcastReceiver.setResultCode(-1);
        }
        m21611a(context, str).mo17918a(intent, broadcastReceiver.goAsync());
        return -1;
    }

    /* renamed from: a */
    private static synchronized C4972aj m21611a(Context context, String str) {
        synchronized (FirebaseInstanceIdReceiver.class) {
            if ("com.google.firebase.MESSAGING_EVENT".equals(str)) {
                if (f16169c == null) {
                    f16169c = new C4972aj(context, str);
                }
                C4972aj ajVar = f16169c;
                return ajVar;
            }
            if (f16168b == null) {
                f16168b = new C4972aj(context, str);
            }
            C4972aj ajVar2 = f16168b;
            return ajVar2;
        }
    }
}
