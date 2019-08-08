package com.appnext.base.operations.imp;

import android.bluetooth.BluetoothAdapter;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.media.AudioManager;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.provider.Settings.Global;
import android.provider.Settings.System;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.appnext.base.operations.C1267b;
import com.appnext.base.p042a.p044b.C1230b;
import com.appnext.base.p042a.p044b.C1231c;
import com.appnext.base.p046b.C1245d.C1246a;
import com.appnext.base.p046b.C1247e;
import com.appnext.base.p046b.C1248f;
import com.appnext.base.p046b.C1259k;
import com.google.android.exoplayer2.C2793C;
import com.google.android.exoplayer2.util.MimeTypes;
import java.util.ArrayList;
import java.util.List;

public class utils extends C1267b {
    private static final String KEY = "utils";

    /* access modifiers changed from: protected */
    /* renamed from: bE */
    public final boolean mo6019bE() {
        return true;
    }

    /* renamed from: by */
    public final void mo6008by() {
    }

    public utils(C1231c cVar, Bundle bundle, Object obj) {
        super(cVar, bundle, obj);
    }

    /* access modifiers changed from: protected */
    public List<C1230b> getData() {
        String str;
        try {
            ArrayList arrayList = new ArrayList();
            String cf = C1248f.m5277cf();
            if (!TextUtils.isEmpty(cf)) {
                arrayList.add(new C1230b(KEY, "dos", cf, C1246a.String.getType()));
            }
            String str2 = Build.MODEL;
            if (!TextUtils.isEmpty(str2)) {
                arrayList.add(new C1230b(KEY, "dmod", str2, C1246a.String.getType()));
            }
            String cg = C1248f.m5278cg();
            if (!TextUtils.isEmpty(cg)) {
                arrayList.add(new C1230b(KEY, "slang", cg, C1246a.String.getType()));
            }
            String h = C1248f.m5281h(C1247e.getContext());
            if (!TextUtils.isEmpty(h)) {
                arrayList.add(new C1230b(KEY, "mop", h, C1246a.String.getType()));
            }
            String deviceName = getDeviceName();
            if (!TextUtils.isEmpty(deviceName)) {
                arrayList.add(new C1230b(KEY, "dname", deviceName, C1246a.String.getType()));
            }
            arrayList.add(new C1230b(KEY, "duse", String.valueOf(m5457bM()), C1246a.Boolean.getType()));
            String cu = C1259k.m5339cu();
            if (!TextUtils.isEmpty(cu)) {
                arrayList.add(new C1230b(KEY, "tzone", cu, C1246a.String.getType()));
            }
            PackageManager packageManager = C1247e.getPackageManager();
            Intent intent = new Intent("android.intent.action.MAIN");
            intent.addCategory("android.intent.category.HOME");
            ResolveInfo resolveActivity = packageManager.resolveActivity(intent, C2793C.DEFAULT_BUFFER_SEGMENT_SIZE);
            if (resolveActivity.activityInfo == null) {
                str = null;
            } else {
                str = resolveActivity.activityInfo.packageName;
            }
            if (!TextUtils.isEmpty(str)) {
                arrayList.add(new C1230b(KEY, "deflun", str, C1246a.String.getType()));
            }
            String bN = m5458bN();
            if (!TextUtils.isEmpty(bN)) {
                arrayList.add(new C1230b(KEY, "inslun", bN, C1246a.String.getType()));
            }
            String bP = m5460bP();
            if (!TextUtils.isEmpty(bP)) {
                arrayList.add(new C1230b(KEY, "dpi", bP, C1246a.String.getType()));
            }
            String bO = m5459bO();
            if (!TextUtils.isEmpty(bO)) {
                arrayList.add(new C1230b(KEY, "res", bO, C1246a.String.getType()));
            }
            String bQ = m5461bQ();
            if (!TextUtils.isEmpty(bQ)) {
                arrayList.add(new C1230b(KEY, "fsc", bQ, C1246a.String.getType()));
            }
            String bR = m5462bR();
            if (!TextUtils.isEmpty(bR)) {
                arrayList.add(new C1230b(KEY, "noa", bR, C1246a.Integer.getType()));
            }
            String bT = m5464bT();
            if (!TextUtils.isEmpty(bT)) {
                arrayList.add(new C1230b(KEY, "rmo", bT, C1246a.Integer.getType()));
            }
            String bS = m5463bS();
            if (!TextUtils.isEmpty(bS)) {
                arrayList.add(new C1230b(KEY, "flm", bS, C1246a.Boolean.getType()));
            }
            if (arrayList.size() == 0) {
                return null;
            }
            return arrayList;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: aY */
    public final String mo6018aY() {
        return utils.class.getSimpleName();
    }

    private static String getDeviceName() {
        String str = null;
        if (C1248f.m5280g(C1247e.getContext().getApplicationContext(), "android.permission.BLUETOOTH")) {
            try {
                BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
                if (defaultAdapter != null) {
                    str = defaultAdapter.getName();
                }
            } catch (Throwable unused) {
            }
        }
        return TextUtils.isEmpty(str) ? Build.BRAND : str;
    }

    /* renamed from: bL */
    private static String m5456bL() {
        PackageManager packageManager = C1247e.getPackageManager();
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.HOME");
        ResolveInfo resolveActivity = packageManager.resolveActivity(intent, C2793C.DEFAULT_BUFFER_SEGMENT_SIZE);
        if (resolveActivity.activityInfo == null) {
            return null;
        }
        return resolveActivity.activityInfo.packageName;
    }

    /* renamed from: bM */
    private static boolean m5457bM() {
        Boolean bool = Boolean.FALSE;
        try {
            bool = Boolean.valueOf(C1248f.m5282i(C1247e.getContext()));
        } catch (Throwable unused) {
        }
        return bool.booleanValue();
    }

    /* renamed from: bN */
    private static String m5458bN() {
        try {
            PackageManager packageManager = C1247e.getPackageManager();
            Intent intent = new Intent("android.intent.action.MAIN");
            intent.addCategory("android.intent.category.HOME");
            return String.valueOf(packageManager.queryIntentActivities(intent, 0).size());
        } catch (Throwable unused) {
            return "0";
        }
    }

    /* renamed from: bO */
    private static String m5459bO() {
        try {
            Display defaultDisplay = ((WindowManager) C1247e.getContext().getSystemService("window")).getDefaultDisplay();
            DisplayMetrics displayMetrics = new DisplayMetrics();
            if (VERSION.SDK_INT >= 17) {
                defaultDisplay.getRealMetrics(displayMetrics);
            } else {
                defaultDisplay.getMetrics(displayMetrics);
            }
            int i = displayMetrics.widthPixels;
            int i2 = displayMetrics.heightPixels;
            StringBuilder sb = new StringBuilder();
            sb.append(i);
            sb.append("x");
            sb.append(i2);
            return sb.toString();
        } catch (Throwable unused) {
            return "";
        }
    }

    /* renamed from: bP */
    private static String m5460bP() {
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(C1247e.getContext().getResources().getDisplayMetrics().densityDpi);
            return sb.toString();
        } catch (Throwable unused) {
            return "";
        }
    }

    /* renamed from: bQ */
    private static String m5461bQ() {
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(C1247e.getContext().getResources().getConfiguration().fontScale);
            return sb.toString();
        } catch (Throwable unused) {
            return "";
        }
    }

    /* renamed from: bR */
    private static String m5462bR() {
        try {
            PackageManager packageManager = C1247e.getContext().getPackageManager();
            Intent intent = new Intent("android.intent.action.MAIN", null);
            intent.addCategory("android.intent.category.LAUNCHER");
            StringBuilder sb = new StringBuilder();
            sb.append(packageManager.queryIntentActivities(intent, 0).size());
            return sb.toString();
        } catch (Throwable unused) {
            return "";
        }
    }

    /* renamed from: bS */
    private static String m5463bS() {
        try {
            boolean z = true;
            if (VERSION.SDK_INT < 17) {
                if (System.getInt(C1247e.getContext().getContentResolver(), "airplane_mode_on", 0) == 0) {
                    z = false;
                }
                return String.valueOf(z);
            }
            if (Global.getInt(C1247e.getContext().getContentResolver(), "airplane_mode_on", 0) == 0) {
                z = false;
            }
            return String.valueOf(z);
        } catch (Throwable unused) {
            return "";
        }
    }

    /* renamed from: bT */
    private static String m5464bT() {
        try {
            AudioManager audioManager = (AudioManager) C1247e.getContext().getSystemService(MimeTypes.BASE_TYPE_AUDIO);
            return audioManager != null ? String.valueOf(audioManager.getRingerMode()) : "";
        } catch (Throwable unused) {
            return "";
        }
    }

    /* access modifiers changed from: protected */
    public final String getKey() {
        return utils.class.getSimpleName();
    }

    /* renamed from: bA */
    public final boolean mo5999bA() {
        return m5382bD();
    }
}
