package com.appnext.base.p042a.p044b;

import android.text.TextUtils;
import org.json.JSONObject;

/* renamed from: com.appnext.base.a.b.c */
public class C1231c extends C1232d {

    /* renamed from: gA */
    private String f3899gA;

    /* renamed from: gB */
    private String f3900gB;

    /* renamed from: gC */
    private String f3901gC;

    /* renamed from: gD */
    private String f3902gD;

    /* renamed from: gE */
    private String f3903gE;

    /* renamed from: gF */
    private JSONObject f3904gF;

    /* renamed from: gy */
    private String f3905gy;

    /* renamed from: gz */
    private String f3906gz;

    public C1231c(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        this.f3905gy = str;
        this.f3906gz = str2;
        this.f3899gA = str3;
        this.f3900gB = str4;
        this.f3901gC = str5;
        this.f3902gD = str6;
        this.f3903gE = str7;
        if (TextUtils.isEmpty(str8)) {
            this.f3904gF = null;
            return;
        }
        try {
            this.f3904gF = new JSONObject(str8);
        } catch (Throwable unused) {
            this.f3904gF = null;
        }
    }

    /* renamed from: bb */
    public final String mo5905bb() {
        return this.f3905gy;
    }

    /* renamed from: bc */
    public final String mo5906bc() {
        return this.f3906gz;
    }

    /* renamed from: bd */
    public final String mo5907bd() {
        return this.f3899gA;
    }

    /* renamed from: be */
    public final String mo5908be() {
        return this.f3900gB;
    }

    /* renamed from: bf */
    public final String mo5909bf() {
        return this.f3901gC;
    }

    public final String getKey() {
        return this.f3902gD;
    }

    /* renamed from: bg */
    public final String mo5910bg() {
        return this.f3903gE;
    }

    /* renamed from: bh */
    public final JSONObject mo5911bh() {
        return this.f3904gF;
    }

    /* renamed from: Y */
    private boolean m5178Y(String str) {
        return this.f3904gF != null && this.f3904gF.has(str) && !this.f3904gF.isNull(str);
    }

    /* renamed from: e */
    public final String mo5912e(String str, String str2) {
        if (!m5178Y(str)) {
            return str2;
        }
        try {
            return this.f3904gF.getString(str);
        } catch (Throwable unused) {
            return str2;
        }
    }

    /* renamed from: a */
    public final long mo5902a(String str, long j) {
        if (!m5178Y(str)) {
            return j;
        }
        try {
            return this.f3904gF.getLong(str);
        } catch (Throwable unused) {
            return j;
        }
    }

    /* renamed from: b */
    public final int mo5904b(String str, int i) {
        if (!m5178Y(str)) {
            return i;
        }
        try {
            return this.f3904gF.getInt(str);
        } catch (Throwable unused) {
            return i;
        }
    }

    /* renamed from: a */
    public final boolean mo5903a(String str, boolean z) {
        if (!m5178Y(str)) {
            return z;
        }
        try {
            return this.f3904gF.getBoolean(str);
        } catch (Throwable unused) {
            return z;
        }
    }
}
