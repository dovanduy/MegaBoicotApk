package com.facebook.appevents.p128b;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.preference.PreferenceManager;
import com.facebook.C2649m;
import p037b.C1058a;

/* renamed from: com.facebook.appevents.b.j */
/* compiled from: SourceApplicationInfo */
class C2419j {

    /* renamed from: a */
    private String f7672a;

    /* renamed from: b */
    private boolean f7673b;

    /* renamed from: com.facebook.appevents.b.j$a */
    /* compiled from: SourceApplicationInfo */
    public static class C2421a {
        /* renamed from: a */
        public static C2419j m9281a(Activity activity) {
            String str = "";
            ComponentName callingActivity = activity.getCallingActivity();
            if (callingActivity != null) {
                str = callingActivity.getPackageName();
                if (str.equals(activity.getPackageName())) {
                    return null;
                }
            }
            Intent intent = activity.getIntent();
            boolean z = false;
            if (intent != null && !intent.getBooleanExtra("_fbSourceApplicationHasBeenSet", false)) {
                intent.putExtra("_fbSourceApplicationHasBeenSet", true);
                Bundle a = C1058a.m4916a(intent);
                if (a != null) {
                    Bundle bundle = a.getBundle("referer_app_link");
                    if (bundle != null) {
                        str = bundle.getString("package");
                    }
                    z = true;
                }
            }
            intent.putExtra("_fbSourceApplicationHasBeenSet", true);
            return new C2419j(str, z);
        }
    }

    private C2419j(String str, boolean z) {
        this.f7672a = str;
        this.f7673b = z;
    }

    /* renamed from: a */
    public static C2419j m9278a() {
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(C2649m.m10133f());
        if (!defaultSharedPreferences.contains("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage")) {
            return null;
        }
        return new C2419j(defaultSharedPreferences.getString("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage", null), defaultSharedPreferences.getBoolean("com.facebook.appevents.SourceApplicationInfo.openedByApplink", false));
    }

    /* renamed from: b */
    public static void m9279b() {
        Editor edit = PreferenceManager.getDefaultSharedPreferences(C2649m.m10133f()).edit();
        edit.remove("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage");
        edit.remove("com.facebook.appevents.SourceApplicationInfo.openedByApplink");
        edit.apply();
    }

    public String toString() {
        String str = "Unclassified";
        if (this.f7673b) {
            str = "Applink";
        }
        if (this.f7672a == null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("(");
        sb.append(this.f7672a);
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: c */
    public void mo8835c() {
        Editor edit = PreferenceManager.getDefaultSharedPreferences(C2649m.m10133f()).edit();
        edit.putString("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage", this.f7672a);
        edit.putBoolean("com.facebook.appevents.SourceApplicationInfo.openedByApplink", this.f7673b);
        edit.apply();
    }
}
