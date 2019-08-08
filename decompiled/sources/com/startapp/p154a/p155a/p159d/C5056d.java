package com.startapp.p154a.p155a.p159d;

import java.util.regex.Pattern;

/* renamed from: com.startapp.a.a.d.d */
/* compiled from: StartAppSDK */
public class C5056d implements C5055c {

    /* renamed from: a */
    private final Pattern f16370a = Pattern.compile("\\+");

    /* renamed from: b */
    private final Pattern f16371b = Pattern.compile("/");

    /* renamed from: c */
    private final Pattern f16372c = Pattern.compile("=");

    /* renamed from: d */
    private final Pattern f16373d = Pattern.compile("_");

    /* renamed from: e */
    private final Pattern f16374e = Pattern.compile("\\*");

    /* renamed from: f */
    private final Pattern f16375f = Pattern.compile("#");

    /* renamed from: a */
    public String mo18663a(String str) {
        return this.f16372c.matcher(this.f16371b.matcher(this.f16370a.matcher(str).replaceAll("_")).replaceAll("*")).replaceAll("#");
    }
}
