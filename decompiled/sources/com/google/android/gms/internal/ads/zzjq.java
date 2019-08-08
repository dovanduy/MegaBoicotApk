package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.google.android.gms.ads.C2973d;
import com.google.android.gms.ads.C2998h.C2999a;
import com.startapp.android.publish.common.model.AdPreferences;

@C3718cm
public final class zzjq {

    /* renamed from: a */
    private final C2973d[] f14553a;

    /* renamed from: b */
    private final String f14554b;

    public zzjq(Context context, AttributeSet attributeSet) {
        C2973d[] a;
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, C2999a.AdsAttrs);
        String string = obtainAttributes.getString(C2999a.AdsAttrs_adSize);
        String string2 = obtainAttributes.getString(C2999a.AdsAttrs_adSizes);
        boolean z = !TextUtils.isEmpty(string);
        boolean z2 = !TextUtils.isEmpty(string2);
        if (z && !z2) {
            a = m18807a(string);
        } else if (!z && z2) {
            a = m18807a(string2);
        } else if (z) {
            throw new IllegalArgumentException("Either XML attribute \"adSize\" or XML attribute \"supportedAdSizes\" should be specified, but not both.");
        } else {
            throw new IllegalArgumentException("Required XML attribute \"adSize\" was missing.");
        }
        this.f14553a = a;
        this.f14554b = obtainAttributes.getString(C2999a.AdsAttrs_adUnitId);
        if (TextUtils.isEmpty(this.f14554b)) {
            throw new IllegalArgumentException("Required XML attribute \"adUnitId\" was missing.");
        }
    }

    /* renamed from: a */
    private static C2973d[] m18807a(String str) {
        String[] split = str.split("\\s*,\\s*");
        C2973d[] dVarArr = new C2973d[split.length];
        for (int i = 0; i < split.length; i++) {
            String trim = split[i].trim();
            if (trim.matches("^(\\d+|FULL_WIDTH)\\s*[xX]\\s*(\\d+|AUTO_HEIGHT)$")) {
                String[] split2 = trim.split("[xX]");
                split2[0] = split2[0].trim();
                split2[1] = split2[1].trim();
                try {
                    dVarArr[i] = new C2973d("FULL_WIDTH".equals(split2[0]) ? -1 : Integer.parseInt(split2[0]), "AUTO_HEIGHT".equals(split2[1]) ? -2 : Integer.parseInt(split2[1]));
                } catch (NumberFormatException unused) {
                    String str2 = "Could not parse XML attribute \"adSize\": ";
                    String valueOf = String.valueOf(trim);
                    throw new IllegalArgumentException(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
                }
            } else if (AdPreferences.TYPE_BANNER.equals(trim)) {
                dVarArr[i] = C2973d.f8691a;
            } else if ("LARGE_BANNER".equals(trim)) {
                dVarArr[i] = C2973d.f8693c;
            } else if ("FULL_BANNER".equals(trim)) {
                dVarArr[i] = C2973d.f8692b;
            } else if ("LEADERBOARD".equals(trim)) {
                dVarArr[i] = C2973d.f8694d;
            } else if ("MEDIUM_RECTANGLE".equals(trim)) {
                dVarArr[i] = C2973d.f8695e;
            } else if ("SMART_BANNER".equals(trim)) {
                dVarArr[i] = C2973d.f8697g;
            } else if ("WIDE_SKYSCRAPER".equals(trim)) {
                dVarArr[i] = C2973d.f8696f;
            } else if ("FLUID".equals(trim)) {
                dVarArr[i] = C2973d.f8698h;
            } else if ("ICON".equals(trim)) {
                dVarArr[i] = C2973d.f8699i;
            } else {
                String str3 = "Could not parse XML attribute \"adSize\": ";
                String valueOf2 = String.valueOf(trim);
                throw new IllegalArgumentException(valueOf2.length() != 0 ? str3.concat(valueOf2) : new String(str3));
            }
        }
        if (dVarArr.length != 0) {
            return dVarArr;
        }
        String str4 = "Could not parse XML attribute \"adSize\": ";
        String valueOf3 = String.valueOf(str);
        throw new IllegalArgumentException(valueOf3.length() != 0 ? str4.concat(valueOf3) : new String(str4));
    }

    /* renamed from: a */
    public final String mo16270a() {
        return this.f14554b;
    }

    /* renamed from: a */
    public final C2973d[] mo16271a(boolean z) {
        if (z || this.f14553a.length == 1) {
            return this.f14553a;
        }
        throw new IllegalArgumentException("The adSizes XML attribute is only allowed on PublisherAdViews.");
    }
}
