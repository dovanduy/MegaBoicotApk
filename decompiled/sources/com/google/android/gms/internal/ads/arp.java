package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import org.json.JSONObject;

final class arp extends ark<String> {
    arp(int i, String str, String str2) {
        super(i, str, str2, null);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo14683a(SharedPreferences sharedPreferences) {
        return sharedPreferences.getString(mo14685a(), (String) mo14687b());
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo14684a(JSONObject jSONObject) {
        return jSONObject.optString(mo14685a(), (String) mo14687b());
    }

    /* renamed from: a */
    public final /* synthetic */ void mo14686a(Editor editor, Object obj) {
        editor.putString(mo14685a(), (String) obj);
    }
}
