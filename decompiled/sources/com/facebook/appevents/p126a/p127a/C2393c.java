package com.facebook.appevents.p126a.p127a;

import com.google.android.exoplayer2.util.MimeTypes;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.appevents.a.a.c */
/* compiled from: PathComponent */
public final class C2393c {

    /* renamed from: a */
    public final String f7599a;

    /* renamed from: b */
    public final int f7600b;

    /* renamed from: c */
    public final int f7601c;

    /* renamed from: d */
    public final String f7602d;

    /* renamed from: e */
    public final String f7603e;

    /* renamed from: f */
    public final String f7604f;

    /* renamed from: g */
    public final String f7605g;

    /* renamed from: h */
    public final int f7606h;

    /* renamed from: com.facebook.appevents.a.a.c$a */
    /* compiled from: PathComponent */
    public enum C2394a {
        ID(1),
        TEXT(2),
        TAG(4),
        DESCRIPTION(8),
        HINT(16);
        

        /* renamed from: f */
        private final int f7613f;

        private C2394a(int i) {
            this.f7613f = i;
        }

        /* renamed from: a */
        public int mo8801a() {
            return this.f7613f;
        }
    }

    C2393c(JSONObject jSONObject) throws JSONException {
        this.f7599a = jSONObject.getString("class_name");
        this.f7600b = jSONObject.optInt("index", -1);
        this.f7601c = jSONObject.optInt(TtmlNode.ATTR_ID);
        this.f7602d = jSONObject.optString(MimeTypes.BASE_TYPE_TEXT);
        this.f7603e = jSONObject.optString("tag");
        this.f7604f = jSONObject.optString("description");
        this.f7605g = jSONObject.optString("hint");
        this.f7606h = jSONObject.optInt("match_bitmask");
    }
}
