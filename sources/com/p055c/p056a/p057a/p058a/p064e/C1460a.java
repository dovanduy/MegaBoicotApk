package com.p055c.p056a.p057a.p058a.p064e;

import android.os.Build;
import android.os.Build.VERSION;
import org.json.JSONObject;

/* renamed from: com.c.a.a.a.e.a */
public final class C1460a {
    /* renamed from: a */
    public static String m6045a() {
        StringBuilder sb = new StringBuilder();
        sb.append(Build.MANUFACTURER);
        sb.append("; ");
        sb.append(Build.MODEL);
        return sb.toString();
    }

    /* renamed from: b */
    public static String m6046b() {
        return Integer.toString(VERSION.SDK_INT);
    }

    /* renamed from: c */
    public static String m6047c() {
        return "Android";
    }

    /* renamed from: d */
    public static JSONObject m6048d() {
        JSONObject jSONObject = new JSONObject();
        C1461b.m6054a(jSONObject, "deviceType", m6045a());
        C1461b.m6054a(jSONObject, "osVersion", m6046b());
        C1461b.m6054a(jSONObject, "os", m6047c());
        return jSONObject;
    }
}
