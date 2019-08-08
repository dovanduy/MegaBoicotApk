package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Build.VERSION;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import com.appnext.base.p046b.C1244c;
import com.google.android.exoplayer2.C2793C;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.gms.ads.internal.C3025aw;
import com.google.android.gms.common.p140b.C3404c;
import com.google.android.gms.common.util.C3557i;
import com.google.android.gms.common.util.C3563o;
import java.util.Locale;

/* renamed from: com.google.android.gms.internal.ads.fd */
public final class C3791fd {

    /* renamed from: A */
    private String f13074A;

    /* renamed from: B */
    private boolean f13075B;

    /* renamed from: a */
    private int f13076a;

    /* renamed from: b */
    private boolean f13077b;

    /* renamed from: c */
    private boolean f13078c;

    /* renamed from: d */
    private int f13079d;

    /* renamed from: e */
    private int f13080e;

    /* renamed from: f */
    private int f13081f;

    /* renamed from: g */
    private String f13082g;

    /* renamed from: h */
    private int f13083h;

    /* renamed from: i */
    private int f13084i;

    /* renamed from: j */
    private int f13085j;

    /* renamed from: k */
    private boolean f13086k;

    /* renamed from: l */
    private int f13087l;

    /* renamed from: m */
    private double f13088m;

    /* renamed from: n */
    private boolean f13089n;

    /* renamed from: o */
    private String f13090o;

    /* renamed from: p */
    private String f13091p;

    /* renamed from: q */
    private boolean f13092q;

    /* renamed from: r */
    private boolean f13093r;

    /* renamed from: s */
    private String f13094s;

    /* renamed from: t */
    private boolean f13095t;

    /* renamed from: u */
    private boolean f13096u;

    /* renamed from: v */
    private String f13097v;

    /* renamed from: w */
    private String f13098w;

    /* renamed from: x */
    private float f13099x;

    /* renamed from: y */
    private int f13100y;

    /* renamed from: z */
    private int f13101z;

    public C3791fd(Context context) {
        PackageManager packageManager = context.getPackageManager();
        m16622a(context);
        m16624b(context);
        m16625c(context);
        Locale locale = Locale.getDefault();
        boolean z = false;
        this.f13092q = m16620a(packageManager, "geo:0,0?q=donuts") != null;
        if (m16620a(packageManager, "http://www.google.com") != null) {
            z = true;
        }
        this.f13093r = z;
        this.f13094s = locale.getCountry();
        aoq.m14615a();
        this.f13095t = C3975lz.m17378a();
        this.f13096u = C3557i.m12752c(context);
        this.f13097v = locale.getLanguage();
        this.f13098w = m16623b(context, packageManager);
        this.f13074A = m16621a(context, packageManager);
        Resources resources = context.getResources();
        if (resources != null) {
            DisplayMetrics displayMetrics = resources.getDisplayMetrics();
            if (displayMetrics != null) {
                this.f13099x = displayMetrics.density;
                this.f13100y = displayMetrics.widthPixels;
                this.f13101z = displayMetrics.heightPixels;
            }
        }
    }

    public C3791fd(Context context, C3790fc fcVar) {
        context.getPackageManager();
        m16622a(context);
        m16624b(context);
        m16625c(context);
        this.f13090o = Build.FINGERPRINT;
        this.f13091p = Build.DEVICE;
        this.f13075B = C3563o.m12764c() && ass.m15081a(context);
        this.f13092q = fcVar.f13049b;
        this.f13093r = fcVar.f13050c;
        this.f13094s = fcVar.f13052e;
        this.f13095t = fcVar.f13053f;
        this.f13096u = fcVar.f13054g;
        this.f13097v = fcVar.f13057j;
        this.f13098w = fcVar.f13058k;
        this.f13074A = fcVar.f13059l;
        this.f13099x = fcVar.f13066s;
        this.f13100y = fcVar.f13067t;
        this.f13101z = fcVar.f13068u;
    }

    /* renamed from: a */
    private static ResolveInfo m16620a(PackageManager packageManager, String str) {
        try {
            return packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)), C2793C.DEFAULT_BUFFER_SEGMENT_SIZE);
        } catch (Throwable th) {
            C3025aw.m10921i().mo15436a(th, "DeviceInfo.getResolveInfo");
            return null;
        }
    }

    /* renamed from: a */
    private static String m16621a(Context context, PackageManager packageManager) {
        try {
            PackageInfo b = C3404c.m12230a(context).mo13395b("com.android.vending", 128);
            if (b != null) {
                int i = b.versionCode;
                String str = b.packageName;
                StringBuilder sb = new StringBuilder(12 + String.valueOf(str).length());
                sb.append(i);
                sb.append(".");
                sb.append(str);
                return sb.toString();
            }
        } catch (Exception unused) {
        }
        return null;
    }

    /* renamed from: a */
    private final void m16622a(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService(MimeTypes.BASE_TYPE_AUDIO);
        if (audioManager != null) {
            try {
                this.f13076a = audioManager.getMode();
                this.f13077b = audioManager.isMusicActive();
                this.f13078c = audioManager.isSpeakerphoneOn();
                this.f13079d = audioManager.getStreamVolume(3);
                this.f13080e = audioManager.getRingerMode();
                this.f13081f = audioManager.getStreamVolume(2);
                return;
            } catch (Throwable th) {
                C3025aw.m10921i().mo15436a(th, "DeviceInfo.gatherAudioInfo");
            }
        }
        this.f13076a = -2;
        this.f13077b = false;
        this.f13078c = false;
        this.f13079d = 0;
        this.f13080e = 0;
        this.f13081f = 0;
    }

    /* renamed from: b */
    private static String m16623b(Context context, PackageManager packageManager) {
        ResolveInfo a = m16620a(packageManager, "market://details?id=com.google.android.gms.ads");
        if (a == null) {
            return null;
        }
        ActivityInfo activityInfo = a.activityInfo;
        if (activityInfo == null) {
            return null;
        }
        try {
            PackageInfo b = C3404c.m12230a(context).mo13395b(activityInfo.packageName, 0);
            if (b != null) {
                int i = b.versionCode;
                String str = activityInfo.packageName;
                StringBuilder sb = new StringBuilder(12 + String.valueOf(str).length());
                sb.append(i);
                sb.append(".");
                sb.append(str);
                return sb.toString();
            }
        } catch (NameNotFoundException unused) {
        }
        return null;
    }

    @TargetApi(16)
    /* renamed from: b */
    private final void m16624b(Context context) {
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        this.f13082g = telephonyManager.getNetworkOperator();
        this.f13084i = telephonyManager.getNetworkType();
        this.f13085j = telephonyManager.getPhoneType();
        this.f13083h = -2;
        this.f13086k = false;
        this.f13087l = -1;
        C3025aw.m10917e();
        if (C3909jn.m17147a(context, "android.permission.ACCESS_NETWORK_STATE")) {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                this.f13083h = activeNetworkInfo.getType();
                this.f13087l = activeNetworkInfo.getDetailedState().ordinal();
            } else {
                this.f13083h = -1;
            }
            if (VERSION.SDK_INT >= 16) {
                this.f13086k = connectivityManager.isActiveNetworkMetered();
            }
        }
    }

    /* renamed from: c */
    private final void m16625c(Context context) {
        Intent registerReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        boolean z = false;
        if (registerReceiver != null) {
            int intExtra = registerReceiver.getIntExtra(C1244c.STATUS, -1);
            this.f13088m = (double) (((float) registerReceiver.getIntExtra("level", -1)) / ((float) registerReceiver.getIntExtra("scale", -1)));
            if (intExtra == 2 || intExtra == 5) {
                z = true;
            }
            this.f13089n = z;
            return;
        }
        this.f13088m = -1.0d;
        this.f13089n = false;
    }

    /* renamed from: a */
    public final C3790fc mo15287a() {
        int i = this.f13076a;
        boolean z = this.f13092q;
        boolean z2 = this.f13093r;
        String str = this.f13082g;
        String str2 = this.f13094s;
        boolean z3 = this.f13095t;
        boolean z4 = this.f13096u;
        boolean z5 = this.f13077b;
        boolean z6 = this.f13078c;
        String str3 = this.f13097v;
        String str4 = this.f13098w;
        String str5 = this.f13074A;
        int i2 = this.f13079d;
        int i3 = this.f13083h;
        int i4 = this.f13084i;
        int i5 = i3;
        int i6 = this.f13085j;
        int i7 = this.f13080e;
        int i8 = this.f13081f;
        float f = this.f13099x;
        int i9 = this.f13100y;
        int i10 = i2;
        int i11 = this.f13101z;
        double d = this.f13088m;
        boolean z7 = this.f13089n;
        boolean z8 = this.f13086k;
        boolean z9 = z8;
        int i12 = i10;
        int i13 = i6;
        int i14 = i7;
        int i15 = i8;
        float f2 = f;
        int i16 = i9;
        int i17 = i11;
        int i18 = i5;
        C3790fc fcVar = new C3790fc(i, z, z2, str, str2, z3, z4, z5, z6, str3, str4, str5, i12, i18, i4, i13, i14, i15, f2, i16, i17, d, z7, z9, this.f13087l, this.f13090o, this.f13075B, this.f13091p);
        return fcVar;
    }
}
