package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;

/* renamed from: com.google.android.gms.measurement.internal.o */
final class C4890o extends SQLiteOpenHelper {

    /* renamed from: a */
    private final /* synthetic */ C4889n f15953a;

    C4890o(C4889n nVar, Context context, String str) {
        this.f15953a = nVar;
        super(context, str, null, 1);
    }

    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    public final SQLiteDatabase getWritableDatabase() throws SQLiteException {
        try {
            return super.getWritableDatabase();
        } catch (SQLiteDatabaseLockedException e) {
            throw e;
        } catch (SQLiteException unused) {
            this.f15953a.mo17158r().mo17761y_().mo17763a("Opening the local database failed, dropping and recreating it");
            String str = "google_app_measurement_local.db";
            if (!this.f15953a.mo17154n().getDatabasePath(str).delete()) {
                this.f15953a.mo17158r().mo17761y_().mo17764a("Failed to delete corrupted local db file", str);
            }
            try {
                return super.getWritableDatabase();
            } catch (SQLiteException e2) {
                this.f15953a.mo17158r().mo17761y_().mo17764a("Failed to open local database. Events will bypass local storage", e2);
                return null;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x001c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onOpen(android.database.sqlite.SQLiteDatabase r8) {
        /*
            r7 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 15
            if (r0 >= r1) goto L_0x0020
            r0 = 0
            java.lang.String r1 = "PRAGMA journal_mode=memory"
            android.database.Cursor r1 = r8.rawQuery(r1, r0)     // Catch:{ all -> 0x0019 }
            r1.moveToFirst()     // Catch:{ all -> 0x0016 }
            if (r1 == 0) goto L_0x0020
            r1.close()
            goto L_0x0020
        L_0x0016:
            r8 = move-exception
            r0 = r1
            goto L_0x001a
        L_0x0019:
            r8 = move-exception
        L_0x001a:
            if (r0 == 0) goto L_0x001f
            r0.close()
        L_0x001f:
            throw r8
        L_0x0020:
            com.google.android.gms.measurement.internal.n r0 = r7.f15953a
            com.google.android.gms.measurement.internal.r r1 = r0.mo17158r()
            java.lang.String r3 = "messages"
            java.lang.String r4 = "create table if not exists messages ( type INTEGER NOT NULL, entry BLOB NOT NULL)"
            java.lang.String r5 = "type,entry"
            r6 = 0
            r2 = r8
            com.google.android.gms.measurement.internal.C4878fa.m21211a(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C4890o.onOpen(android.database.sqlite.SQLiteDatabase):void");
    }

    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        C4878fa.m21210a(this.f15953a.mo17158r(), sQLiteDatabase);
    }
}
