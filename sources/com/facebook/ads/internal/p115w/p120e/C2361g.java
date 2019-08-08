package com.facebook.ads.internal.p115w.p120e;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build.VERSION;
import com.facebook.ads.AudienceNetworkActivity;
import com.facebook.ads.internal.p091r.C1795a;
import com.facebook.ads.internal.settings.AdInternalSettings;
import com.facebook.ads.internal.settings.C1810a.C1811a;
import java.util.Iterator;

/* renamed from: com.facebook.ads.internal.w.e.g */
public class C2361g {
    /* renamed from: a */
    public static void m9129a(C2361g gVar, Context context, Uri uri, String str) {
        boolean z = m9130a(uri.getScheme()) && uri.getHost().equals("play.google.com");
        if (uri.getScheme().equals("market") || z) {
            try {
                gVar.mo8767a(context, uri);
                return;
            } catch (C2356c unused) {
            }
        }
        gVar.mo8768a(context, uri, str);
    }

    /* renamed from: a */
    private static boolean m9130a(String str) {
        return "http".equalsIgnoreCase(str) || "https".equalsIgnoreCase(str);
    }

    /* renamed from: b */
    private void m9131b(Context context, Uri uri) {
        context.startActivity(m9132c(context, uri));
    }

    /* renamed from: c */
    private Intent m9132c(Context context, Uri uri) {
        Intent intent = new Intent("android.intent.action.VIEW", uri);
        intent.setComponent(null);
        if (VERSION.SDK_INT >= 15) {
            intent.setSelector(null);
        }
        intent.addCategory("android.intent.category.BROWSABLE");
        intent.addFlags(268435456);
        intent.putExtra("com.android.browser.application_id", context.getPackageName());
        intent.putExtra("create_new_tab", false);
        return intent;
    }

    /* renamed from: a */
    public void mo8767a(Context context, Uri uri) {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://play.google.com/store/apps/"));
        boolean z = false;
        Iterator it = context.getPackageManager().queryIntentActivities(intent, 0).iterator();
        while (true) {
            if (it.hasNext()) {
                if (((ResolveInfo) it.next()).activityInfo.applicationInfo.packageName.equals("com.android.vending")) {
                    z = true;
                    break;
                }
            } else {
                break;
            }
        }
        if (!z) {
            throw new C2356c();
        }
        Intent c = m9132c(context, uri);
        c.setPackage("com.android.vending");
        context.startActivity(c);
    }

    /* renamed from: a */
    public void mo8768a(Context context, Uri uri, String str) {
        if (m9130a(uri.getScheme()) && C1795a.m7456o(context)) {
            Intent intent = new Intent();
            intent.setClassName(context.getPackageName(), AdInternalSettings.f5734d ? "com.facebook.ads.internal.ipc.RemoteANActivity" : "com.facebook.ads.AudienceNetworkActivity");
            intent.addFlags(268435456);
            intent.putExtra(AudienceNetworkActivity.VIEW_TYPE, C1811a.BROWSER);
            intent.putExtra(AudienceNetworkActivity.BROWSER_URL, uri.toString());
            intent.putExtra(AudienceNetworkActivity.CLIENT_TOKEN, str);
            intent.putExtra(AudienceNetworkActivity.HANDLER_TIME, System.currentTimeMillis());
            try {
                context.startActivity(intent);
                return;
            } catch (ActivityNotFoundException unused) {
                intent.setClassName(context.getPackageName(), "com.facebook.ads.InterstitialAdActivity");
                try {
                    context.startActivity(intent);
                    return;
                } catch (ActivityNotFoundException unused2) {
                }
            }
        }
        m9131b(context, uri);
    }
}
