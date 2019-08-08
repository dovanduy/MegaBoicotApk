package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri.Builder;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings.Secure;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Display;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.TextView;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.C2967b;
import com.google.android.gms.ads.C2979f;
import com.google.android.gms.ads.doubleclick.C2977d;
import com.google.android.gms.ads.doubleclick.PublisherAdView;
import com.google.android.gms.ads.search.SearchAdView;
import com.google.android.gms.common.C3407d;
import com.google.android.gms.common.C3415h;
import com.google.android.gms.common.util.C3563o;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import java.math.BigInteger;
import java.net.HttpURLConnection;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Locale;
import java.util.StringTokenizer;
import java.util.UUID;

@C3718cm
/* renamed from: com.google.android.gms.internal.ads.lz */
public final class C3975lz {

    /* renamed from: a */
    public static final Handler f13539a = new Handler(Looper.getMainLooper());

    /* renamed from: b */
    private static final String f13540b = AdView.class.getName();

    /* renamed from: c */
    private static final String f13541c = C2979f.class.getName();

    /* renamed from: d */
    private static final String f13542d = PublisherAdView.class.getName();

    /* renamed from: e */
    private static final String f13543e = C2977d.class.getName();

    /* renamed from: f */
    private static final String f13544f = SearchAdView.class.getName();

    /* renamed from: g */
    private static final String f13545g = C2967b.class.getName();

    /* renamed from: a */
    public static int m17369a(Context context, int i) {
        return m17370a(context.getResources().getDisplayMetrics(), i);
    }

    /* renamed from: a */
    public static int m17370a(DisplayMetrics displayMetrics, int i) {
        return (int) TypedValue.applyDimension(1, (float) i, displayMetrics);
    }

    /* renamed from: a */
    public static String m17371a(Context context) {
        ContentResolver contentResolver = context.getContentResolver();
        String string = contentResolver == null ? null : Secure.getString(contentResolver, "android_id");
        if (string == null || m17378a()) {
            string = "emulator";
        }
        return m17372a(string);
    }

    /* renamed from: a */
    public static String m17372a(String str) {
        int i = 0;
        while (i < 2) {
            try {
                MessageDigest instance = MessageDigest.getInstance("MD5");
                instance.update(str.getBytes());
                return String.format(Locale.US, "%032X", new Object[]{new BigInteger(1, instance.digest())});
            } catch (NoSuchAlgorithmException unused) {
                i++;
            } catch (ArithmeticException unused2) {
                return null;
            }
        }
        return null;
    }

    /* renamed from: a */
    public static String m17373a(StackTraceElement[] stackTraceElementArr, String str) {
        int i;
        String str2;
        int i2 = 0;
        while (true) {
            i = i2 + 1;
            if (i >= stackTraceElementArr.length) {
                str2 = null;
                break;
            }
            StackTraceElement stackTraceElement = stackTraceElementArr[i2];
            String className = stackTraceElement.getClassName();
            if (!"loadAd".equalsIgnoreCase(stackTraceElement.getMethodName()) || (!f13540b.equalsIgnoreCase(className) && !f13541c.equalsIgnoreCase(className) && !f13542d.equalsIgnoreCase(className) && !f13543e.equalsIgnoreCase(className) && !f13544f.equalsIgnoreCase(className) && !f13545g.equalsIgnoreCase(className))) {
                i2 = i;
            }
        }
        str2 = stackTraceElementArr[i].getClassName();
        if (str != null) {
            StringTokenizer stringTokenizer = new StringTokenizer(str, ".");
            StringBuilder sb = new StringBuilder();
            int i3 = 2;
            if (stringTokenizer.hasMoreElements()) {
                sb.append(stringTokenizer.nextToken());
                while (true) {
                    int i4 = i3 - 1;
                    if (i3 <= 0 || !stringTokenizer.hasMoreElements()) {
                        str = sb.toString();
                    } else {
                        sb.append(".");
                        sb.append(stringTokenizer.nextToken());
                        i3 = i4;
                    }
                }
                str = sb.toString();
            }
            if (str2 == null || str2.contains(str)) {
                return null;
            }
            return str2;
        }
        return null;
    }

    /* renamed from: a */
    public static Throwable m17374a(Throwable th) {
        if (((Boolean) aoq.m14620f().mo14695a(aru.f11934d)).booleanValue()) {
            return th;
        }
        LinkedList linkedList = new LinkedList();
        while (th != null) {
            linkedList.push(th);
            th = th.getCause();
        }
        Throwable th2 = null;
        while (!linkedList.isEmpty()) {
            Throwable th3 = (Throwable) linkedList.pop();
            StackTraceElement[] stackTrace = th3.getStackTrace();
            ArrayList arrayList = new ArrayList();
            arrayList.add(new StackTraceElement(th3.getClass().getName(), "<filtered>", "<filtered>", 1));
            boolean z = false;
            for (StackTraceElement stackTraceElement : stackTrace) {
                if (m17383b(stackTraceElement.getClassName())) {
                    arrayList.add(stackTraceElement);
                    z = true;
                } else {
                    String className = stackTraceElement.getClassName();
                    if (!(!TextUtils.isEmpty(className) && (className.startsWith("android.") || className.startsWith("java.")))) {
                        stackTraceElement = new StackTraceElement("<filtered>", "<filtered>", "<filtered>", 1);
                    }
                    arrayList.add(stackTraceElement);
                }
            }
            if (z) {
                th2 = th2 == null ? new Throwable(th3.getMessage()) : new Throwable(th3.getMessage(), th2);
                th2.setStackTrace((StackTraceElement[]) arrayList.toArray(new StackTraceElement[0]));
            }
        }
        return th2;
    }

    /* renamed from: a */
    public static void m17375a(Context context, String str, String str2, Bundle bundle, boolean z, C3979mc mcVar) {
        if (z) {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext == null) {
                applicationContext = context;
            }
            bundle.putString("os", VERSION.RELEASE);
            bundle.putString("api", String.valueOf(VERSION.SDK_INT));
            bundle.putString("appid", applicationContext.getPackageName());
            if (str == null) {
                int d = C3407d.m12253b().mo13418d(context);
                StringBuilder sb = new StringBuilder(20);
                sb.append(d);
                sb.append(".12451000");
                str = sb.toString();
            }
            bundle.putString("js", str);
        }
        Builder appendQueryParameter = new Builder().scheme("https").path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter(TtmlNode.ATTR_ID, str2);
        for (String str3 : bundle.keySet()) {
            appendQueryParameter.appendQueryParameter(str3, bundle.getString(str3));
        }
        mcVar.mo15530a(appendQueryParameter.toString());
    }

    /* renamed from: a */
    private final void m17376a(ViewGroup viewGroup, zzjn zzjn, String str, int i, int i2) {
        if (viewGroup.getChildCount() == 0) {
            Context context = viewGroup.getContext();
            TextView textView = new TextView(context);
            textView.setGravity(17);
            textView.setText(str);
            textView.setTextColor(i);
            textView.setBackgroundColor(i2);
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setBackgroundColor(i);
            int a = m17369a(context, 3);
            frameLayout.addView(textView, new LayoutParams(zzjn.f14548f - a, zzjn.f14545c - a, 17));
            viewGroup.addView(frameLayout, zzjn.f14548f, zzjn.f14545c);
        }
    }

    /* renamed from: a */
    public static void m17377a(boolean z, HttpURLConnection httpURLConnection, String str) {
        httpURLConnection.setConnectTimeout(60000);
        httpURLConnection.setInstanceFollowRedirects(true);
        httpURLConnection.setReadTimeout(60000);
        if (str != null) {
            httpURLConnection.setRequestProperty("User-Agent", str);
        }
        httpURLConnection.setUseCaches(false);
    }

    /* renamed from: a */
    public static boolean m17378a() {
        return Build.DEVICE.startsWith("generic");
    }

    /* renamed from: b */
    public static int m17379b(Context context, int i) {
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        return m17380b(displayMetrics, i);
    }

    /* renamed from: b */
    public static int m17380b(DisplayMetrics displayMetrics, int i) {
        return Math.round(((float) i) / displayMetrics.density);
    }

    /* renamed from: b */
    public static String m17381b(Context context) {
        ContentResolver contentResolver = context.getContentResolver();
        if (contentResolver == null) {
            return null;
        }
        return Secure.getString(contentResolver, "android_id");
    }

    /* renamed from: b */
    public static boolean m17382b() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    /* renamed from: b */
    public static boolean m17383b(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (str.startsWith((String) aoq.m14620f().mo14695a(aru.f11987e))) {
            return true;
        }
        try {
            return Class.forName(str).isAnnotationPresent(C3718cm.class);
        } catch (Exception e) {
            String str2 = "Fail to check class type for class ";
            String valueOf = String.valueOf(str);
            C3987mk.m17427a(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), e);
            return false;
        }
    }

    /* renamed from: c */
    public static String m17384c() {
        UUID randomUUID = UUID.randomUUID();
        byte[] byteArray = BigInteger.valueOf(randomUUID.getLeastSignificantBits()).toByteArray();
        byte[] byteArray2 = BigInteger.valueOf(randomUUID.getMostSignificantBits()).toByteArray();
        String bigInteger = new BigInteger(1, byteArray).toString();
        for (int i = 0; i < 2; i++) {
            try {
                MessageDigest instance = MessageDigest.getInstance("MD5");
                instance.update(byteArray);
                instance.update(byteArray2);
                byte[] bArr = new byte[8];
                System.arraycopy(instance.digest(), 0, bArr, 0, 8);
                bigInteger = new BigInteger(1, bArr).toString();
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        return bigInteger;
    }

    /* renamed from: c */
    public static boolean m17385c(Context context) {
        return C3407d.m12253b().mo13408b(context, (int) C3415h.f9877b) == 0;
    }

    /* renamed from: d */
    public static int m17386d(Context context) {
        return DynamiteModule.m12878b(context, ModuleDescriptor.MODULE_ID);
    }

    /* renamed from: e */
    public static int m17387e(Context context) {
        return DynamiteModule.m12872a(context, ModuleDescriptor.MODULE_ID);
    }

    /* renamed from: f */
    public static boolean m17388f(Context context) {
        int b = C3407d.m12253b().mo13408b(context, (int) C3415h.f9877b);
        return b == 0 || b == 2;
    }

    /* renamed from: g */
    public static boolean m17389g(Context context) {
        if (context.getResources().getConfiguration().orientation != 2) {
            return false;
        }
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        return ((int) (((float) displayMetrics.heightPixels) / displayMetrics.density)) < 600;
    }

    @TargetApi(17)
    /* renamed from: h */
    public static boolean m17390h(Context context) {
        int i;
        int i2;
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        if (C3563o.m12766e()) {
            defaultDisplay.getRealMetrics(displayMetrics);
            i2 = displayMetrics.heightPixels;
            i = displayMetrics.widthPixels;
        } else {
            try {
                i2 = ((Integer) Display.class.getMethod("getRawHeight", new Class[0]).invoke(defaultDisplay, new Object[0])).intValue();
                i = ((Integer) Display.class.getMethod("getRawWidth", new Class[0]).invoke(defaultDisplay, new Object[0])).intValue();
            } catch (Exception unused) {
            }
        }
        defaultDisplay.getMetrics(displayMetrics);
        int i3 = displayMetrics.heightPixels;
        int i4 = displayMetrics.widthPixels;
        if (i3 == i2 && i4 == i) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public static int m17391i(Context context) {
        int identifier = context.getResources().getIdentifier("navigation_bar_width", "dimen", "android");
        if (identifier > 0) {
            return context.getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    /* renamed from: a */
    public final void mo15622a(Context context, String str, String str2, Bundle bundle, boolean z) {
        m17375a(context, null, str2, bundle, true, new C3977ma(this));
    }

    /* renamed from: a */
    public final void mo15623a(ViewGroup viewGroup, zzjn zzjn, String str) {
        m17376a(viewGroup, zzjn, str, -16777216, -1);
    }

    /* renamed from: a */
    public final void mo15624a(ViewGroup viewGroup, zzjn zzjn, String str, String str2) {
        C3987mk.m17435e(str2);
        m17376a(viewGroup, zzjn, str, -65536, -16777216);
    }
}
