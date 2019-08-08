package android.support.p017v4.app;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.p017v4.content.C0356c;

/* renamed from: android.support.v4.app.a */
/* compiled from: ActivityCompat */
public class C0236a extends C0356c {

    /* renamed from: a */
    private static C0239b f480a;

    /* renamed from: android.support.v4.app.a$a */
    /* compiled from: ActivityCompat */
    public interface C0238a {
        void onRequestPermissionsResult(int i, String[] strArr, int[] iArr);
    }

    /* renamed from: android.support.v4.app.a$b */
    /* compiled from: ActivityCompat */
    public interface C0239b {
        /* renamed from: a */
        boolean mo790a(Activity activity, int i, int i2, Intent intent);

        /* renamed from: a */
        boolean mo791a(Activity activity, String[] strArr, int i);
    }

    /* renamed from: android.support.v4.app.a$c */
    /* compiled from: ActivityCompat */
    public interface C0240c {
        /* renamed from: a_ */
        void mo666a_(int i);
    }

    /* renamed from: a */
    public static C0239b m714a() {
        return f480a;
    }

    /* renamed from: a */
    public static void m716a(Activity activity, Intent intent, int i, Bundle bundle) {
        if (VERSION.SDK_INT >= 16) {
            activity.startActivityForResult(intent, i, bundle);
        } else {
            activity.startActivityForResult(intent, i);
        }
    }

    /* renamed from: a */
    public static void m715a(Activity activity) {
        if (VERSION.SDK_INT >= 16) {
            activity.finishAffinity();
        } else {
            activity.finish();
        }
    }

    /* renamed from: a */
    public static void m717a(final Activity activity, final String[] strArr, final int i) {
        if (f480a == null || !f480a.mo791a(activity, strArr, i)) {
            if (VERSION.SDK_INT >= 23) {
                if (activity instanceof C0240c) {
                    ((C0240c) activity).mo666a_(i);
                }
                activity.requestPermissions(strArr, i);
            } else if (activity instanceof C0238a) {
                new Handler(Looper.getMainLooper()).post(new Runnable() {
                    public void run() {
                        int[] iArr = new int[strArr.length];
                        PackageManager packageManager = activity.getPackageManager();
                        String packageName = activity.getPackageName();
                        int length = strArr.length;
                        for (int i = 0; i < length; i++) {
                            iArr[i] = packageManager.checkPermission(strArr[i], packageName);
                        }
                        ((C0238a) activity).onRequestPermissionsResult(i, strArr, iArr);
                    }
                });
            }
        }
    }
}
