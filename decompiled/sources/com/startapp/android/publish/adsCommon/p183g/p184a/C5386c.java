package com.startapp.android.publish.adsCommon.p183g.p184a;

import android.content.Context;
import android.webkit.WebView;
import com.startapp.android.publish.adsCommon.Utils.C5306h;
import com.startapp.android.publish.adsCommon.Utils.C5307i;
import com.startapp.common.p193a.C5518g;

/* renamed from: com.startapp.android.publish.adsCommon.g.a.c */
/* compiled from: StartAppSDK */
public final class C5386c {
    /* renamed from: a */
    public static void m23033a(String str, WebView webView) {
        StringBuilder sb = new StringBuilder();
        sb.append("setPlacementType: ");
        sb.append(str);
        C5518g.m23563a("MraidJsFunctions", 3, sb.toString());
        C5307i.m22668a(webView, "mraid.setPlacementType", str);
    }

    /* renamed from: a */
    public static void m23032a(C5387d dVar, WebView webView) {
        StringBuilder sb = new StringBuilder();
        sb.append("fireStateChangeEvent: ");
        sb.append(dVar);
        C5518g.m23563a("MraidJsFunctions", 3, sb.toString());
        C5307i.m22668a(webView, "mraid.fireStateChangeEvent", dVar.toString());
    }

    /* renamed from: a */
    public static void m23027a(Context context, int i, int i2, WebView webView) {
        StringBuilder sb = new StringBuilder();
        sb.append("setScreenSize ");
        sb.append(i);
        sb.append("x");
        sb.append(i2);
        C5518g.m23563a("MraidJsFunctions", 3, sb.toString());
        C5307i.m22668a(webView, "mraid.setScreenSize", Integer.valueOf(C5306h.m22650b(context, i)), Integer.valueOf(C5306h.m22650b(context, i2)));
    }

    /* renamed from: b */
    public static void m23035b(Context context, int i, int i2, WebView webView) {
        StringBuilder sb = new StringBuilder();
        sb.append("setMaxSize ");
        sb.append(i);
        sb.append("x");
        sb.append(i2);
        C5518g.m23563a("MraidJsFunctions", 3, sb.toString());
        C5307i.m22668a(webView, "mraid.setMaxSize", Integer.valueOf(C5306h.m22650b(context, i)), Integer.valueOf(C5306h.m22650b(context, i2)));
    }

    /* renamed from: a */
    public static void m23026a(Context context, int i, int i2, int i3, int i4, WebView webView) {
        StringBuilder sb = new StringBuilder();
        sb.append("setCurrentPosition [");
        sb.append(i);
        sb.append(",");
        sb.append(i2);
        sb.append("] (");
        sb.append(i3);
        sb.append("x");
        sb.append(i4);
        sb.append(")");
        C5518g.m23563a("MraidJsFunctions", 3, sb.toString());
        C5307i.m22668a(webView, "mraid.setCurrentPosition", Integer.valueOf(C5306h.m22650b(context, i)), Integer.valueOf(C5306h.m22650b(context, i2)), Integer.valueOf(C5306h.m22650b(context, i3)), Integer.valueOf(C5306h.m22650b(context, i4)));
    }

    /* renamed from: b */
    public static void m23034b(Context context, int i, int i2, int i3, int i4, WebView webView) {
        StringBuilder sb = new StringBuilder();
        sb.append("setDefaultPosition [");
        sb.append(i);
        sb.append(",");
        sb.append(i2);
        sb.append("] (");
        sb.append(i3);
        sb.append("x");
        sb.append(i4);
        sb.append(")");
        C5518g.m23563a("MraidJsFunctions", 3, sb.toString());
        C5307i.m22668a(webView, "mraid.setDefaultPosition", Integer.valueOf(C5306h.m22650b(context, i)), Integer.valueOf(C5306h.m22650b(context, i2)), Integer.valueOf(C5306h.m22650b(context, i3)), Integer.valueOf(C5306h.m22650b(context, i4)));
    }

    /* renamed from: a */
    public static void m23028a(WebView webView) {
        C5518g.m23563a("MraidJsFunctions", 3, "fireReadyEvent");
        C5307i.m22668a(webView, "mraid.fireReadyEvent", new Object[0]);
    }

    /* renamed from: a */
    public static void m23031a(WebView webView, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("fireViewableChangeEvent ");
        sb.append(z);
        C5518g.m23563a("MraidJsFunctions", 3, sb.toString());
        C5307i.m22668a(webView, "mraid.fireViewableChangeEvent", Boolean.valueOf(z));
    }

    /* renamed from: a */
    public static void m23029a(WebView webView, String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append("fireErrorEvent message: ");
        sb.append(str);
        sb.append(", action:");
        sb.append(str2);
        C5518g.m23563a("MraidJsFunctions", 3, sb.toString());
        C5307i.m22668a(webView, "mraid.fireErrorEvent", str, str2);
    }

    /* renamed from: a */
    public static void m23030a(WebView webView, String str, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("setSupports feature: ");
        sb.append(str);
        sb.append(", isSupported:");
        sb.append(z);
        C5518g.m23563a("MraidJsFunctions", 3, sb.toString());
        C5307i.m22669a(webView, false, "mraid.setSupports", str, Boolean.valueOf(z));
    }
}
