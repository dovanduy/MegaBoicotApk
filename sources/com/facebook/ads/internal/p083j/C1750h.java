package com.facebook.ads.internal.p083j;

import android.database.Cursor;
import android.database.SQLException;
import com.startapp.android.publish.common.model.AdPreferences;

/* renamed from: com.facebook.ads.internal.j.h */
public class C1750h extends C1749g {

    /* renamed from: a */
    public static final C1741b f5484a = new C1741b(0, "token_id", "TEXT PRIMARY KEY");

    /* renamed from: b */
    public static final C1741b f5485b = new C1741b(1, "token", AdPreferences.TYPE_TEXT);

    /* renamed from: c */
    public static final C1741b[] f5486c = {f5484a, f5485b};

    /* renamed from: d */
    private static final String f5487d = "h";

    /* renamed from: e */
    private static final String f5488e = m7256a("tokens", f5486c);

    /* renamed from: f */
    private static final String f5489f;

    /* renamed from: g */
    private static final String f5490g;

    static {
        C1741b[] bVarArr = f5486c;
        C1741b bVar = f5485b;
        StringBuilder sb = new StringBuilder(C1749g.m7256a("tokens", bVarArr));
        sb.append(" WHERE ");
        sb.append(bVar.f5439b);
        sb.append(" = ?");
        f5489f = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("DELETE FROM tokens WHERE NOT EXISTS (SELECT 1 FROM events WHERE tokens.");
        sb2.append(f5484a.f5439b);
        sb2.append(" = ");
        sb2.append("events");
        sb2.append(".");
        sb2.append(C1742c.f5442b.f5439b);
        sb2.append(")");
        f5490g = sb2.toString();
    }

    public C1750h(C1743d dVar) {
        super(dVar);
    }

    /* renamed from: a */
    public String mo7530a() {
        return "tokens";
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x006c  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String mo7567a(java.lang.String r6) {
        /*
            r5 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 == 0) goto L_0x000e
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Invalid token."
            r6.<init>(r0)
            throw r6
        L_0x000e:
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r5.mo7565f()     // Catch:{ all -> 0x0068 }
            java.lang.String r2 = f5489f     // Catch:{ all -> 0x0068 }
            r3 = 1
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch:{ all -> 0x0068 }
            r4 = 0
            r3[r4] = r6     // Catch:{ all -> 0x0068 }
            android.database.Cursor r1 = r1.rawQuery(r2, r3)     // Catch:{ all -> 0x0068 }
            boolean r2 = r1.moveToNext()     // Catch:{ all -> 0x0066 }
            if (r2 == 0) goto L_0x002e
            com.facebook.ads.internal.j.b r2 = f5484a     // Catch:{ all -> 0x0066 }
            int r2 = r2.f5438a     // Catch:{ all -> 0x0066 }
            java.lang.String r2 = r1.getString(r2)     // Catch:{ all -> 0x0066 }
            goto L_0x002f
        L_0x002e:
            r2 = r0
        L_0x002f:
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x0066 }
            if (r3 != 0) goto L_0x003b
            if (r1 == 0) goto L_0x003a
            r1.close()
        L_0x003a:
            return r2
        L_0x003b:
            java.util.UUID r2 = java.util.UUID.randomUUID()     // Catch:{ all -> 0x0066 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0066 }
            android.content.ContentValues r3 = new android.content.ContentValues     // Catch:{ all -> 0x0066 }
            r4 = 2
            r3.<init>(r4)     // Catch:{ all -> 0x0066 }
            com.facebook.ads.internal.j.b r4 = f5484a     // Catch:{ all -> 0x0066 }
            java.lang.String r4 = r4.f5439b     // Catch:{ all -> 0x0066 }
            r3.put(r4, r2)     // Catch:{ all -> 0x0066 }
            com.facebook.ads.internal.j.b r4 = f5485b     // Catch:{ all -> 0x0066 }
            java.lang.String r4 = r4.f5439b     // Catch:{ all -> 0x0066 }
            r3.put(r4, r6)     // Catch:{ all -> 0x0066 }
            android.database.sqlite.SQLiteDatabase r6 = r5.mo7565f()     // Catch:{ all -> 0x0066 }
            java.lang.String r4 = "tokens"
            r6.insertOrThrow(r4, r0, r3)     // Catch:{ all -> 0x0066 }
            if (r1 == 0) goto L_0x0065
            r1.close()
        L_0x0065:
            return r2
        L_0x0066:
            r6 = move-exception
            goto L_0x006a
        L_0x0068:
            r6 = move-exception
            r1 = r0
        L_0x006a:
            if (r1 == 0) goto L_0x006f
            r1.close()
        L_0x006f:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.p083j.C1750h.mo7567a(java.lang.String):java.lang.String");
    }

    /* renamed from: b */
    public C1741b[] mo7533b() {
        return f5486c;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public Cursor mo7534c() {
        return mo7565f().rawQuery(f5488e, null);
    }

    /* renamed from: d */
    public void mo7568d() {
        try {
            mo7565f().execSQL(f5490g);
        } catch (SQLException unused) {
        }
    }
}
