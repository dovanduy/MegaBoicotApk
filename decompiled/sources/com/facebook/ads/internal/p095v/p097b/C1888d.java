package com.facebook.ads.internal.p095v.p097b;

import android.text.TextUtils;
import com.google.android.exoplayer2.C2793C;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.facebook.ads.internal.v.b.d */
class C1888d {

    /* renamed from: d */
    private static final Pattern f5947d = Pattern.compile("[R,r]ange:[ ]?bytes=(\\d*)-");

    /* renamed from: e */
    private static final Pattern f5948e = Pattern.compile("GET /(.*) HTTP");

    /* renamed from: a */
    public final String f5949a;

    /* renamed from: b */
    public final long f5950b;

    /* renamed from: c */
    public final boolean f5951c;

    public C1888d(String str) {
        C1901j.m7935a(str);
        Matcher matcher = f5947d.matcher(str);
        long parseLong = matcher.find() ? Long.parseLong(matcher.group(1)) : -1;
        this.f5950b = Math.max(0, parseLong);
        this.f5951c = parseLong >= 0;
        Matcher matcher2 = f5948e.matcher(str);
        if (matcher2.find()) {
            this.f5949a = matcher2.group(1);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Invalid request `");
        sb.append(str);
        sb.append("`: url not found!");
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    public static C1888d m7898a(InputStream inputStream) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, C2793C.UTF8_NAME));
        StringBuilder sb = new StringBuilder();
        while (true) {
            String readLine = bufferedReader.readLine();
            if (TextUtils.isEmpty(readLine)) {
                return new C1888d(sb.toString());
            }
            sb.append(readLine);
            sb.append(10);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("GetRequest{rangeOffset=");
        sb.append(this.f5950b);
        sb.append(", partial=");
        sb.append(this.f5951c);
        sb.append(", uri='");
        sb.append(this.f5949a);
        sb.append('\'');
        sb.append('}');
        return sb.toString();
    }
}
