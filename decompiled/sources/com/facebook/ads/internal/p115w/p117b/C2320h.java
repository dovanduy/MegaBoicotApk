package com.facebook.ads.internal.p115w.p117b;

import android.app.ActivityManager;
import android.app.ActivityManager.RunningTaskInfo;
import android.content.Context;
import android.util.Log;

/* renamed from: com.facebook.ads.internal.w.b.h */
public class C2320h {
    /* renamed from: a */
    public static boolean m9039a(Context context) {
        boolean z;
        try {
            if (!((RunningTaskInfo) ((ActivityManager) context.getSystemService("activity")).getRunningTasks(2).get(0)).topActivity.getClassName().equals("com.unity3d.player.UnityPlayerActivity")) {
                if (!m9040a("com.unity3d.player.UnityPlayerActivity")) {
                    z = false;
                    Boolean valueOf = Boolean.valueOf(z);
                    Log.d("IS_UNITY", Boolean.toString(valueOf.booleanValue()));
                    return valueOf.booleanValue();
                }
            }
            z = true;
            Boolean valueOf2 = Boolean.valueOf(z);
            Log.d("IS_UNITY", Boolean.toString(valueOf2.booleanValue()));
            return valueOf2.booleanValue();
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: a */
    public static boolean m9040a(String str) {
        try {
            Class.forName(str);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }
}
