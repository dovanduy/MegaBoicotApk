package com.appnext.base.p046b;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import java.util.Set;

@SuppressLint({"CommitPrefEdits"})
/* renamed from: com.appnext.base.b.i */
public final class C1251i {
    private static final String TAG = "LibrarySettings";

    /* renamed from: jA */
    public static final String f3978jA = "generated";

    /* renamed from: jB */
    public static final String f3979jB = "apps_category_saved";

    /* renamed from: jC */
    public static final String f3980jC = "lat";

    /* renamed from: jD */
    public static final String f3981jD = "lib_shared_preferences";
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: jE */
    private static final C1251i f3982jE = new C1251i();

    /* renamed from: jv */
    public static final String f3983jv = "_lastupdate";

    /* renamed from: jw */
    public static final String f3984jw = "_lastcollectedtime";

    /* renamed from: jx */
    public static final String f3985jx = "_cycles";

    /* renamed from: jy */
    public static final String f3986jy = "_hash";

    /* renamed from: jz */
    public static final String f3987jz = "google_ads_id";

    /* renamed from: ju */
    private SharedPreferences f3988ju;
    private Context mContext = C1247e.getContext();

    private C1251i() {
        if (this.mContext != null) {
            this.f3988ju = this.mContext.getSharedPreferences(f3981jD, 0);
        }
    }

    /* renamed from: ck */
    public static C1251i m5302ck() {
        return f3982jE;
    }

    public final void clear() {
        this.f3988ju.edit().clear().apply();
    }

    public final void init(Context context) {
        if (context != null) {
            this.mContext = context;
            this.f3988ju = this.mContext.getSharedPreferences(f3981jD, 0);
        }
    }

    public final String getString(String str, String str2) {
        return this.f3988ju != null ? this.f3988ju.getString(str, str2) : str2;
    }

    public final long getLong(String str, long j) {
        return this.f3988ju != null ? this.f3988ju.getLong(str, j) : j;
    }

    public final int getInt(String str, int i) {
        if (this.f3988ju != null) {
            return this.f3988ju.getInt(str, 0);
        }
        return 0;
    }

    public final boolean getBoolean(String str, boolean z) {
        return this.f3988ju != null ? this.f3988ju.getBoolean(str, z) : z;
    }

    public final void putLong(String str, long j) {
        if (this.f3988ju != null) {
            this.f3988ju.edit().putLong(str, j).apply();
        }
    }

    public final void putInt(String str, int i) {
        if (this.f3988ju != null) {
            this.f3988ju.edit().putInt(str, i).apply();
        }
    }

    public final void putBoolean(String str, boolean z) {
        if (this.f3988ju != null) {
            this.f3988ju.edit().putBoolean(str, true).apply();
        }
    }

    public final void putString(String str, String str2) {
        if (this.f3988ju != null) {
            this.f3988ju.edit().putString(str, str2).apply();
        }
    }

    public final Set<String> getStringSet(String str, Set<String> set) {
        return this.f3988ju != null ? this.f3988ju.getStringSet(str, set) : set;
    }

    public final void putStringSet(String str, Set<String> set) {
        if (this.f3988ju != null) {
            this.f3988ju.edit().remove(str);
            this.f3988ju.edit().putStringSet(str, set).apply();
        }
    }
}
