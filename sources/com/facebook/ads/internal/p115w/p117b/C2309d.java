package com.facebook.ads.internal.p115w.p117b;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.XmlResourceParser;
import android.os.Build.VERSION;
import com.facebook.ads.internal.p115w.p121f.C2362a;
import java.io.IOException;
import java.util.concurrent.Executors;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: com.facebook.ads.internal.w.b.d */
public class C2309d {

    /* renamed from: a */
    public static volatile C2311a f7275a = C2311a.NOT_INITIALIZED;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static int f7276b = -1;

    /* renamed from: com.facebook.ads.internal.w.b.d$a */
    enum C2311a {
        NOT_INITIALIZED,
        INITIALIZING,
        INITIALIZED
    }

    /* renamed from: a */
    public static int m9022a(final Context context) {
        if (f7275a == C2311a.NOT_INITIALIZED) {
            if (!(f7275a == C2311a.INITIALIZED) && f7275a == C2311a.NOT_INITIALIZED) {
                f7275a = C2311a.INITIALIZING;
                Executors.newSingleThreadExecutor().execute(new Runnable() {
                    public void run() {
                        if (C2309d.f7275a != C2311a.INITIALIZED) {
                            SharedPreferences sharedPreferences = context.getSharedPreferences(C2362a.m9138a("FBAdPrefs", context), 0);
                            int i = sharedPreferences.getInt("AppMinSdkVersion", -1);
                            if (i != -1) {
                                C2309d.f7276b = i;
                            } else {
                                int c = VERSION.SDK_INT >= 24 ? C2309d.m9025d(context) : C2309d.m9023b(context);
                                C2309d.f7276b = c;
                                sharedPreferences.edit().putInt("AppMinSdkVersion", c).commit();
                            }
                            C2309d.f7275a = C2311a.INITIALIZED;
                        }
                    }
                });
            }
        }
        return f7276b;
    }

    /* renamed from: b */
    public static int m9023b(Context context) {
        try {
            XmlResourceParser openXmlResourceParser = context.getAssets().openXmlResourceParser("AndroidManifest.xml");
            while (openXmlResourceParser.next() != 1) {
                if (openXmlResourceParser.getEventType() == 2 && openXmlResourceParser.getName().equals("uses-sdk")) {
                    for (int i = 0; i < openXmlResourceParser.getAttributeCount(); i++) {
                        if (openXmlResourceParser.getAttributeName(i).equals("minSdkVersion")) {
                            return Integer.parseInt(openXmlResourceParser.getAttributeValue(i));
                        }
                    }
                    continue;
                }
            }
            return 0;
        } catch (IOException | XmlPullParserException unused) {
            return 0;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static int m9025d(Context context) {
        try {
            return context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).minSdkVersion;
        } catch (NameNotFoundException unused) {
            return 0;
        }
    }
}
