package com.facebook.appevents.p128b;

import com.facebook.internal.C2479ad;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.facebook.appevents.b.b */
/* compiled from: AppEventUtility */
public class C2408b {
    /* renamed from: a */
    public static void m9249a() {
    }

    /* renamed from: b */
    public static void m9250b() {
    }

    /* renamed from: a */
    public static double m9248a(String str) {
        try {
            Matcher matcher = Pattern.compile("[-+]*\\d+([\\,\\.]\\d+)*([\\.\\,]\\d+)?", 8).matcher(str);
            if (!matcher.find()) {
                return 0.0d;
            }
            return NumberFormat.getNumberInstance(C2479ad.m9438a()).parse(matcher.group(0)).doubleValue();
        } catch (ParseException unused) {
            return 0.0d;
        }
    }
}
