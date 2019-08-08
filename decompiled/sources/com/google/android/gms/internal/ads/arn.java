package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import org.json.JSONObject;

final class arn extends ark<Long> {
    arn(int i, String str, Long l) {
        super(i, str, l, null);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo14683a(SharedPreferences sharedPreferences) {
        return Long.valueOf(sharedPreferences.getLong(mo14685a(), ((Long) mo14687b()).longValue()));
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo14684a(JSONObject jSONObject) {
        return Long.valueOf(jSONObject.optLong(mo14685a(), ((Long) mo14687b()).longValue()));
    }

    /* renamed from: a */
    public final /* synthetic */ void mo14686a(Editor editor, Object obj) {
        editor.putLong(mo14685a(), ((Long) obj).longValue());
    }
}
