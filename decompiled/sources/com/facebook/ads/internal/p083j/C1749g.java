package com.facebook.ads.internal.p083j;

import android.database.sqlite.SQLiteDatabase;

/* renamed from: com.facebook.ads.internal.j.g */
public abstract class C1749g {

    /* renamed from: k */
    protected final C1743d f5483k;

    protected C1749g(C1743d dVar) {
        this.f5483k = dVar;
    }

    /* renamed from: a */
    public static String m7256a(String str, C1741b[] bVarArr) {
        StringBuilder sb = new StringBuilder("SELECT ");
        for (int i = 0; i < bVarArr.length - 1; i++) {
            sb.append(bVarArr[i].f5439b);
            sb.append(", ");
        }
        sb.append(bVarArr[bVarArr.length - 1].f5439b);
        sb.append(" FROM ");
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: c */
    private String mo7534c() {
        C1741b[] b = mo7533b();
        if (b.length < 1) {
            return null;
        }
        String str = "";
        for (int i = 0; i < b.length - 1; i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(b[i].mo7529a());
            sb.append(", ");
            str = sb.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(b[b.length - 1].mo7529a());
        return sb2.toString();
    }

    /* renamed from: a */
    public abstract String mo7530a();

    /* renamed from: a */
    public void mo7562a(SQLiteDatabase sQLiteDatabase) {
        StringBuilder sb = new StringBuilder();
        sb.append("CREATE TABLE ");
        sb.append(mo7530a());
        sb.append(" (");
        sb.append(mo7534c());
        sb.append(")");
        sQLiteDatabase.execSQL(sb.toString());
    }

    /* renamed from: b */
    public void mo7563b(SQLiteDatabase sQLiteDatabase) {
        StringBuilder sb = new StringBuilder();
        sb.append("DROP TABLE IF EXISTS ");
        sb.append(mo7530a());
        sQLiteDatabase.execSQL(sb.toString());
    }

    /* renamed from: b */
    public abstract C1741b[] mo7533b();

    /* renamed from: e */
    public void mo7564e() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public SQLiteDatabase mo7565f() {
        return this.f5483k.mo7537a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public boolean mo7566g() {
        return mo7565f().delete(mo7530a(), null, null) > 0;
    }
}
