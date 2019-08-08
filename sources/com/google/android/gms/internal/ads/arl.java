package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import org.json.JSONObject;

final class arl extends ark<Boolean> {
    arl(int i, String str, Boolean bool) {
        super(i, str, bool, null);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo14683a(SharedPreferences sharedPreferences) {
        return Boolean.valueOf(sharedPreferences.getBoolean(mo14685a(), ((Boolean) mo14687b()).booleanValue()));
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo14684a(JSONObject jSONObject) {
        return Boolean.valueOf(jSONObject.optBoolean(mo14685a(), ((Boolean) mo14687b()).booleanValue()));
    }

    /* renamed from: a */
    public final /* synthetic */ void mo14686a(Editor editor, Object obj) {
        editor.putBoolean(mo14685a(), ((Boolean) obj).booleanValue());
    }
}
