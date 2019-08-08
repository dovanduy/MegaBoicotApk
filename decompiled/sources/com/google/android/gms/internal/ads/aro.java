package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import org.json.JSONObject;

final class aro extends ark<Float> {
    aro(int i, String str, Float f) {
        super(i, str, f, null);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo14683a(SharedPreferences sharedPreferences) {
        return Float.valueOf(sharedPreferences.getFloat(mo14685a(), ((Float) mo14687b()).floatValue()));
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo14684a(JSONObject jSONObject) {
        return Float.valueOf((float) jSONObject.optDouble(mo14685a(), (double) ((Float) mo14687b()).floatValue()));
    }

    /* renamed from: a */
    public final /* synthetic */ void mo14686a(Editor editor, Object obj) {
        editor.putFloat(mo14685a(), ((Float) obj).floatValue());
    }
}
