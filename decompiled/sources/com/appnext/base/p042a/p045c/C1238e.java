package com.appnext.base.p042a.p045c;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteFullException;
import com.appnext.base.p042a.p043a.C1225a;
import com.appnext.base.p042a.p043a.C1225a.C1227a;
import com.appnext.base.p042a.p044b.C1232d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.appnext.base.a.c.e */
public abstract class C1238e<MODEL extends C1232d> {

    /* renamed from: gZ */
    private static final int f3930gZ = -1;

    /* renamed from: ha */
    private static final String f3931ha = " DESC";

    /* renamed from: com.appnext.base.a.c.e$a */
    protected enum C1239a {
        Equals(" = ? "),
        GreaterThan(" >= ? "),
        LessThan(" <= ? ");
        
        private String mOperator;

        private C1239a(String str) {
            this.mOperator = str;
        }

        /* renamed from: bo */
        public final String mo5951bo() {
            return this.mOperator;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract MODEL mo5922b(Cursor cursor);

    /* access modifiers changed from: protected */
    /* renamed from: bn */
    public abstract String[] mo5924bn();

    /* renamed from: a */
    protected static long m5231a(String str, ContentValues contentValues) {
        try {
            long insert = C1225a.m5168aT().mo5890aU().insert(str, null, contentValues);
            C1225a.m5168aT().mo5891aV();
            return insert;
        } catch (SQLiteFullException e) {
            C1225a.m5168aT();
            C1225a.m5167a(C1227a.DatabaseOrDiskFull$53629b42, new Exception(e.getMessage()));
            return -1;
        } catch (Throwable th) {
            C1225a.m5168aT();
            C1225a.m5167a(C1227a.Global$53629b42, th);
            return -1;
        }
    }

    /* renamed from: b */
    protected static long m5235b(String str, ContentValues contentValues) {
        try {
            long insertWithOnConflict = C1225a.m5168aT().mo5890aU().insertWithOnConflict(str, null, contentValues, 5);
            C1225a.m5168aT().mo5891aV();
            return insertWithOnConflict;
        } catch (SQLiteFullException e) {
            C1225a.m5168aT();
            C1225a.m5167a(C1227a.DatabaseOrDiskFull$53629b42, new Exception(e.getMessage()));
            return -1;
        } catch (Throwable th) {
            C1225a.m5168aT();
            C1225a.m5167a(C1227a.Global$53629b42, th);
            return -1;
        }
    }

    /* renamed from: a */
    protected static long m5230a(SQLiteDatabase sQLiteDatabase, String str, ContentValues contentValues) {
        try {
            return sQLiteDatabase.insertWithOnConflict(str, null, contentValues, 5);
        } catch (SQLiteFullException e) {
            C1225a.m5168aT();
            C1225a.m5167a(C1227a.DatabaseOrDiskFull$53629b42, new Exception(e.getMessage()));
            return -1;
        } catch (Throwable th) {
            C1225a.m5168aT();
            C1225a.m5167a(C1227a.Global$53629b42, th);
            return -1;
        }
    }

    /* renamed from: b */
    protected static long m5234b(SQLiteDatabase sQLiteDatabase, String str, ContentValues contentValues) {
        try {
            return sQLiteDatabase.insert(str, null, contentValues);
        } catch (SQLiteFullException e) {
            C1225a.m5168aT();
            C1225a.m5167a(C1227a.DatabaseOrDiskFull$53629b42, new Exception(e.getMessage()));
            return -1;
        } catch (Throwable th) {
            C1225a.m5168aT();
            C1225a.m5167a(C1227a.Global$53629b42, th);
            return -1;
        }
    }

    /* renamed from: b */
    private static ContentValues m5236b(JSONObject jSONObject) {
        try {
            ContentValues contentValues = new ContentValues();
            Iterator keys = jSONObject.keys();
            while (keys.hasNext()) {
                String str = (String) keys.next();
                contentValues.put(str, jSONObject.getString(str));
            }
            return contentValues;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final long mo5946a(String str, JSONObject jSONObject) {
        try {
            long insertWithOnConflict = C1225a.m5168aT().mo5890aU().insertWithOnConflict(str, null, m5236b(jSONObject), 5);
            C1225a.m5168aT().mo5891aV();
            return insertWithOnConflict;
        } catch (SQLiteFullException e) {
            C1225a.m5168aT();
            C1225a.m5167a(C1227a.DatabaseOrDiskFull$53629b42, new Exception(e.getMessage()));
            return -1;
        } catch (Throwable th) {
            C1225a.m5168aT();
            C1225a.m5167a(C1227a.Global$53629b42, th);
            return -1;
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002a, code lost:
        if (r4 != null) goto L_0x002c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002c, code lost:
        r4.endTransaction();
        com.appnext.base.p042a.p043a.C1225a.m5168aT().mo5891aV();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0049, code lost:
        if (r4 != null) goto L_0x002c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x003d  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long mo5945a(java.lang.String r8, org.json.JSONArray r9) {
        /*
            r7 = this;
            r0 = -1
            if (r9 == 0) goto L_0x004c
            r2 = 0
            int r3 = r9.length()     // Catch:{ Throwable -> 0x0048, all -> 0x0039 }
            com.appnext.base.a.a.a r4 = com.appnext.base.p042a.p043a.C1225a.m5168aT()     // Catch:{ Throwable -> 0x0048, all -> 0x0039 }
            android.database.sqlite.SQLiteDatabase r4 = r4.mo5890aU()     // Catch:{ Throwable -> 0x0048, all -> 0x0039 }
            r4.beginTransaction()     // Catch:{ Throwable -> 0x0049, all -> 0x0037 }
            r2 = 0
        L_0x0015:
            if (r2 >= r3) goto L_0x0027
            org.json.JSONObject r5 = r9.getJSONObject(r2)     // Catch:{ Throwable -> 0x0049, all -> 0x0037 }
            android.content.ContentValues r5 = m5236b(r5)     // Catch:{ Throwable -> 0x0049, all -> 0x0037 }
            long r5 = m5230a(r4, r8, r5)     // Catch:{ Throwable -> 0x0049, all -> 0x0037 }
            int r2 = r2 + 1
            r0 = r5
            goto L_0x0015
        L_0x0027:
            r4.setTransactionSuccessful()     // Catch:{ Throwable -> 0x0049, all -> 0x0037 }
            if (r4 == 0) goto L_0x004c
        L_0x002c:
            r4.endTransaction()
            com.appnext.base.a.a.a r8 = com.appnext.base.p042a.p043a.C1225a.m5168aT()
            r8.mo5891aV()
            goto L_0x004c
        L_0x0037:
            r8 = move-exception
            goto L_0x003b
        L_0x0039:
            r8 = move-exception
            r4 = r2
        L_0x003b:
            if (r4 == 0) goto L_0x0047
            r4.endTransaction()
            com.appnext.base.a.a.a r9 = com.appnext.base.p042a.p043a.C1225a.m5168aT()
            r9.mo5891aV()
        L_0x0047:
            throw r8
        L_0x0048:
            r4 = r2
        L_0x0049:
            if (r4 == 0) goto L_0x004c
            goto L_0x002c
        L_0x004c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appnext.base.p042a.p045c.C1238e.mo5945a(java.lang.String, org.json.JSONArray):long");
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002a, code lost:
        if (r4 != null) goto L_0x002c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002c, code lost:
        r4.endTransaction();
        com.appnext.base.p042a.p043a.C1225a.m5168aT().mo5891aV();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0049, code lost:
        if (r4 != null) goto L_0x002c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x003d  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long mo5949b(java.lang.String r8, org.json.JSONArray r9) {
        /*
            r7 = this;
            r0 = -1
            if (r9 == 0) goto L_0x004c
            r2 = 0
            int r3 = r9.length()     // Catch:{ Throwable -> 0x0048, all -> 0x0039 }
            com.appnext.base.a.a.a r4 = com.appnext.base.p042a.p043a.C1225a.m5168aT()     // Catch:{ Throwable -> 0x0048, all -> 0x0039 }
            android.database.sqlite.SQLiteDatabase r4 = r4.mo5890aU()     // Catch:{ Throwable -> 0x0048, all -> 0x0039 }
            r4.beginTransaction()     // Catch:{ Throwable -> 0x0049, all -> 0x0037 }
            r2 = 0
        L_0x0015:
            if (r2 >= r3) goto L_0x0027
            org.json.JSONObject r5 = r9.getJSONObject(r2)     // Catch:{ Throwable -> 0x0049, all -> 0x0037 }
            android.content.ContentValues r5 = m5236b(r5)     // Catch:{ Throwable -> 0x0049, all -> 0x0037 }
            long r5 = m5234b(r4, r8, r5)     // Catch:{ Throwable -> 0x0049, all -> 0x0037 }
            int r2 = r2 + 1
            r0 = r5
            goto L_0x0015
        L_0x0027:
            r4.setTransactionSuccessful()     // Catch:{ Throwable -> 0x0049, all -> 0x0037 }
            if (r4 == 0) goto L_0x004c
        L_0x002c:
            r4.endTransaction()
            com.appnext.base.a.a.a r8 = com.appnext.base.p042a.p043a.C1225a.m5168aT()
            r8.mo5891aV()
            goto L_0x004c
        L_0x0037:
            r8 = move-exception
            goto L_0x003b
        L_0x0039:
            r8 = move-exception
            r4 = r2
        L_0x003b:
            if (r4 == 0) goto L_0x0047
            r4.endTransaction()
            com.appnext.base.a.a.a r9 = com.appnext.base.p042a.p043a.C1225a.m5168aT()
            r9.mo5891aV()
        L_0x0047:
            throw r8
        L_0x0048:
            r4 = r2
        L_0x0049:
            if (r4 == 0) goto L_0x004c
            goto L_0x002c
        L_0x004c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appnext.base.p042a.p045c.C1238e.mo5949b(java.lang.String, org.json.JSONArray):long");
    }

    /* access modifiers changed from: protected */
    public final void delete(String str) {
        mo5944a(str, null, null, null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo5944a(String str, String[] strArr, String[] strArr2, List<C1239a> list) {
        int i = 0;
        try {
            SQLiteDatabase aU = C1225a.m5168aT().mo5890aU();
            String str2 = null;
            if (strArr != null) {
                str2 = m5232a(strArr, list);
            }
            int delete = aU.delete(str, str2, strArr2);
            try {
                C1225a.m5168aT().mo5891aV();
                return delete;
            } catch (SQLiteFullException e) {
                i = delete;
                e = e;
                C1225a.m5168aT();
                C1225a.m5167a(C1227a.DatabaseOrDiskFull$53629b42, new Exception(e.getMessage()));
                return i;
            } catch (Throwable th) {
                i = delete;
                th = th;
                C1225a.m5168aT();
                C1225a.m5167a(C1227a.Global$53629b42, new Exception(th.getMessage()));
                return i;
            }
        } catch (SQLiteFullException e2) {
            e = e2;
            C1225a.m5168aT();
            C1225a.m5167a(C1227a.DatabaseOrDiskFull$53629b42, new Exception(e.getMessage()));
            return i;
        } catch (Throwable th2) {
            th = th2;
            C1225a.m5168aT();
            C1225a.m5167a(C1227a.Global$53629b42, new Exception(th.getMessage()));
            return i;
        }
    }

    /* renamed from: f */
    protected static void m5238f(String str, String str2) {
        try {
            C1225a.m5168aT().mo5890aU().delete(str, str2, null);
            C1225a.m5168aT().mo5891aV();
        } catch (SQLiteFullException e) {
            C1225a.m5168aT();
            C1225a.m5167a(C1227a.DatabaseOrDiskFull$53629b42, new Exception(e.getMessage()));
        } catch (Throwable th) {
            C1225a.m5168aT();
            C1225a.m5167a(C1227a.Global$53629b42, new Exception(th.getMessage()));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: ah */
    public final List<MODEL> mo5948ah(String str) {
        try {
            List<MODEL> e = m5237e(C1225a.m5168aT().mo5890aU().query(str, mo5924bn(), null, null, null, null, null));
            C1225a.m5168aT().mo5891aV();
            return e;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final List<MODEL> mo5947a(String str, String[] strArr, String[] strArr2, String str2, List<C1239a> list) {
        try {
            List<MODEL> e = m5237e(C1225a.m5168aT().mo5890aU().query(str, mo5924bn(), m5232a(strArr, list), strArr2, null, null, str2));
            C1225a.m5168aT().mo5891aV();
            return e;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: ai */
    protected static String m5233ai(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(f3931ha);
        return sb.toString();
    }

    /* renamed from: e */
    private List<MODEL> m5237e(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        try {
            cursor.moveToFirst();
            while (!cursor.isAfterLast()) {
                arrayList.add(mo5922b(cursor));
                cursor.moveToNext();
            }
            cursor.close();
        } catch (Throwable unused) {
        }
        return arrayList;
    }

    /* renamed from: a */
    private static String m5232a(String[] strArr, List<C1239a> list) {
        if (strArr == null || strArr.length == 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        try {
            int length = strArr.length;
            for (int i = 0; i < length; i++) {
                if (i > 0) {
                    sb.append(" AND ");
                }
                sb.append(strArr[i]);
                sb.append(((C1239a) list.get(i)).mo5951bo());
            }
        } catch (Throwable unused) {
        }
        return sb.toString();
    }
}
