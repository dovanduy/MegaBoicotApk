package com.startapp.android.publish.omsdk;

import android.content.Context;
import android.webkit.WebView;
import com.p055c.p056a.p057a.p058a.C1428a;
import com.p055c.p056a.p057a.p058a.p060b.C1437b;
import com.p055c.p056a.p057a.p058a.p060b.C1438c;
import com.p055c.p056a.p057a.p058a.p060b.C1439d;
import com.p055c.p056a.p057a.p058a.p060b.C1441f;
import com.p055c.p056a.p057a.p058a.p060b.C1442g;
import com.p055c.p056a.p057a.p058a.p060b.C1443h;
import com.startapp.android.publish.GeneratedConstants;
import com.startapp.android.publish.adsCommon.p182f.C5376d;
import com.startapp.android.publish.adsCommon.p182f.C5378f;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.startapp.android.publish.omsdk.a */
/* compiled from: StartAppSDK */
public class C5497a {
    /* renamed from: a */
    private static String m23463a() {
        return "";
    }

    /* renamed from: a */
    public static C1437b m23461a(WebView webView) {
        if (!m23465a(webView.getContext())) {
            return null;
        }
        return m23462a(C1439d.m5941a(m23466b(), webView, m23463a()), false);
    }

    /* renamed from: a */
    public static C1437b m23460a(Context context, AdVerification adVerification) {
        if (!m23465a(context)) {
            return null;
        }
        if (adVerification == null) {
            C5378f.m23016a(context, C5376d.EXCEPTION, "OMSDK: Verification details can't be null!", "", "");
            return null;
        }
        String a = C5498b.m23467a();
        List<VerificationDetails> adVerification2 = adVerification.getAdVerification();
        ArrayList arrayList = new ArrayList(adVerification2.size());
        for (VerificationDetails verificationDetails : adVerification2) {
            URL a2 = m23464a(context, verificationDetails.getVerificationScriptUrl());
            if (a2 != null) {
                arrayList.add(C1443h.m5952a(verificationDetails.getVendorKey(), a2, verificationDetails.getVerificationParameters()));
            }
        }
        return m23462a(C1439d.m5942a(m23466b(), a, arrayList, m23463a()), true);
    }

    /* renamed from: a */
    private static C1437b m23462a(C1439d dVar, boolean z) {
        return C1437b.m5932a(C1438c.m5937a(C1441f.NATIVE, z ? C1441f.NATIVE : C1441f.NONE, false), dVar);
    }

    /* renamed from: b */
    private static C1442g m23466b() {
        return C1442g.m5949a("StartApp", GeneratedConstants.INAPP_VERSION);
    }

    /* renamed from: a */
    private static URL m23464a(Context context, String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e) {
            C5376d dVar = C5376d.EXCEPTION;
            StringBuilder sb = new StringBuilder();
            sb.append("OMSDK: can't create URL - ");
            sb.append(str);
            C5378f.m23016a(context, dVar, sb.toString(), e.getMessage(), "");
            return null;
        }
    }

    /* renamed from: a */
    private static boolean m23465a(Context context) {
        try {
            if (C1428a.m5906b() || C1428a.m5905a(C1428a.m5904a(), context)) {
                return true;
            }
            C5378f.m23016a(context, C5376d.EXCEPTION, "OMSDK: Failed to activate sdk.", "", "");
            return false;
        } catch (Exception e) {
            C5378f.m23016a(context, C5376d.EXCEPTION, "OMSDK: Failed to activate sdk.", e.getMessage(), "");
            return false;
        }
    }
}
