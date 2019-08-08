package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import org.json.JSONObject;

final class arm extends ark<Integer> {
    arm(int i, String str, Integer num) {
        super(i, str, num, null);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo14683a(SharedPreferences sharedPreferences) {
        return Integer.valueOf(sharedPreferences.getInt(mo14685a(), ((Integer) mo14687b()).intValue()));
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo14684a(JSONObject jSONObject) {
        return Integer.valueOf(jSONObject.optInt(mo14685a(), ((Integer) mo14687b()).intValue()));
    }

    /* renamed from: a */
    public final /* synthetic */ void mo14686a(Editor editor, Object obj) {
        editor.putInt(mo14685a(), ((Integer) obj).intValue());
    }
}
