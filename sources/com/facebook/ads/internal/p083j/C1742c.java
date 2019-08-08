package com.facebook.ads.internal.p083j;

import android.content.ContentValues;
import android.database.Cursor;
import com.appnext.base.p046b.C1245d;
import com.startapp.android.publish.common.model.AdPreferences;
import java.util.Map;
import java.util.UUID;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.internal.j.c */
public class C1742c extends C1749g {

    /* renamed from: a */
    public static final C1741b f5441a = new C1741b(0, "event_id", "TEXT PRIMARY KEY");

    /* renamed from: b */
    public static final C1741b f5442b = new C1741b(1, "token_id", "TEXT REFERENCES tokens ON UPDATE CASCADE ON DELETE RESTRICT");

    /* renamed from: c */
    public static final C1741b f5443c = new C1741b(2, "priority", "INTEGER");

    /* renamed from: d */
    public static final C1741b f5444d = new C1741b(3, C1245d.f3961jd, AdPreferences.TYPE_TEXT);

    /* renamed from: e */
    public static final C1741b f5445e = new C1741b(4, C1245d.f3955iX, "REAL");

    /* renamed from: f */
    public static final C1741b f5446f = new C1741b(5, "session_time", "REAL");

    /* renamed from: g */
    public static final C1741b f5447g = new C1741b(6, "session_id", AdPreferences.TYPE_TEXT);

    /* renamed from: h */
    public static final C1741b f5448h = new C1741b(7, "data", AdPreferences.TYPE_TEXT);

    /* renamed from: i */
    public static final C1741b f5449i = new C1741b(8, "attempt", "INTEGER");

    /* renamed from: j */
    public static final C1741b[] f5450j = {f5441a, f5442b, f5443c, f5444d, f5445e, f5446f, f5447g, f5448h, f5449i};

    /* renamed from: l */
    private static final String f5451l = m7256a("events", f5450j);

    public C1742c(C1743d dVar) {
        super(dVar);
    }

    /* renamed from: a */
    public String mo7530a() {
        return "events";
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public String mo7531a(String str, int i, String str2, double d, double d2, String str3, Map<String, String> map) {
        String uuid = UUID.randomUUID().toString();
        ContentValues contentValues = new ContentValues(9);
        contentValues.put(f5441a.f5439b, uuid);
        contentValues.put(f5442b.f5439b, str);
        contentValues.put(f5443c.f5439b, Integer.valueOf(i));
        contentValues.put(f5444d.f5439b, str2);
        contentValues.put(f5445e.f5439b, Double.valueOf(d));
        contentValues.put(f5446f.f5439b, Double.valueOf(d2));
        contentValues.put(f5447g.f5439b, str3);
        contentValues.put(f5448h.f5439b, map != null ? new JSONObject(map).toString() : null);
        contentValues.put(f5449i.f5439b, Integer.valueOf(0));
        mo7565f().insertOrThrow("events", null, contentValues);
        return uuid;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo7532a(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(f5441a.f5439b);
        sb.append(" = ?");
        return mo7565f().delete("events", sb.toString(), new String[]{str}) > 0;
    }

    /* renamed from: b */
    public C1741b[] mo7533b() {
        return f5450j;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public Cursor mo7534c() {
        return mo7565f().rawQuery("SELECT count(*) FROM events", null);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public Cursor mo7535d() {
        return mo7565f().rawQuery(f5451l, null);
    }
}
