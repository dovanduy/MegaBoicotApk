package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import org.json.JSONObject;

@C3718cm
public abstract class ark<T> {

    /* renamed from: a */
    private final int f11736a;

    /* renamed from: b */
    private final String f11737b;

    /* renamed from: c */
    private final T f11738c;

    private ark(int i, String str, T t) {
        this.f11736a = i;
        this.f11737b = str;
        this.f11738c = t;
        aoq.m14619e().mo14691a(this);
    }

    /* synthetic */ ark(int i, String str, Object obj, arl arl) {
        this(i, str, obj);
    }

    /* renamed from: a */
    public static ark<String> m14986a(int i, String str) {
        ark<String> a = m14991a(i, str, (String) null);
        aoq.m14619e().mo14693b(a);
        return a;
    }

    /* renamed from: a */
    public static ark<Float> m14987a(int i, String str, float f) {
        return new aro(i, str, Float.valueOf(f));
    }

    /* renamed from: a */
    public static ark<Integer> m14988a(int i, String str, int i2) {
        return new arm(i, str, Integer.valueOf(i2));
    }

    /* renamed from: a */
    public static ark<Long> m14989a(int i, String str, long j) {
        return new arn(i, str, Long.valueOf(j));
    }

    /* renamed from: a */
    public static ark<Boolean> m14990a(int i, String str, Boolean bool) {
        return new arl(i, str, bool);
    }

    /* renamed from: a */
    public static ark<String> m14991a(int i, String str, String str2) {
        return new arp(i, str, str2);
    }

    /* renamed from: b */
    public static ark<String> m14992b(int i, String str) {
        ark<String> a = m14991a(i, str, (String) null);
        aoq.m14619e().mo14694c(a);
        return a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract T mo14683a(SharedPreferences sharedPreferences);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract T mo14684a(JSONObject jSONObject);

    /* renamed from: a */
    public final String mo14685a() {
        return this.f11737b;
    }

    /* renamed from: a */
    public abstract void mo14686a(Editor editor, T t);

    /* renamed from: b */
    public final T mo14687b() {
        return this.f11738c;
    }

    /* renamed from: c */
    public final int mo14688c() {
        return this.f11736a;
    }
}
