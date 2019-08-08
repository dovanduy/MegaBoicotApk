package com.google.android.gms.ads.p135a;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import com.google.android.gms.common.C3415h;

/* renamed from: com.google.android.gms.ads.a.c */
public final class C2965c {

    /* renamed from: a */
    private SharedPreferences f8676a;

    public C2965c(Context context) {
        try {
            Context e = C3415h.m12287e(context);
            this.f8676a = e == null ? null : e.getSharedPreferences("google_ads_flags", 0);
        } catch (Throwable th) {
            Log.w("GmscoreFlag", "Error while getting SharedPreferences ", th);
            this.f8676a = null;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final float mo12191a(String str, float f) {
        try {
            if (this.f8676a == null) {
                return 0.0f;
            }
            return this.f8676a.getFloat(str, 0.0f);
        } catch (Throwable th) {
            Log.w("GmscoreFlag", "Error while reading from SharedPreferences ", th);
            return 0.0f;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final String mo12192a(String str, String str2) {
        try {
            return this.f8676a == null ? str2 : this.f8676a.getString(str, str2);
        } catch (Throwable th) {
            Log.w("GmscoreFlag", "Error while reading from SharedPreferences ", th);
            return str2;
        }
    }

    /* renamed from: a */
    public final boolean mo12193a(String str, boolean z) {
        try {
            if (this.f8676a == null) {
                return false;
            }
            return this.f8676a.getBoolean(str, false);
        } catch (Throwable th) {
            Log.w("GmscoreFlag", "Error while reading from SharedPreferences ", th);
            return false;
        }
    }
}
