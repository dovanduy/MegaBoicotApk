package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Parcelable;
import android.text.TextUtils;
import com.appnext.base.p046b.C1245d;
import com.google.android.gms.common.internal.C3513t;
import com.google.android.gms.internal.p148e.C4623gi;
import com.google.android.gms.internal.p148e.C4637j;
import com.google.android.gms.internal.p148e.C4638k;
import com.google.android.gms.internal.p148e.C4641n;
import com.google.android.gms.internal.p148e.C4648u;
import com.google.android.gms.internal.p148e.C4649v;
import com.google.android.gms.internal.p148e.C4651x;
import java.io.IOException;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.measurement.internal.ew */
final class C4873ew extends C4851eb {
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final String[] f15830b = {"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_bundled_day", "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;"};
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final String[] f15831c = {TtmlNode.ATTR_TTS_ORIGIN, "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static final String[] f15832d = {"app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", C1245d.f3954iW, "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;", "admob_app_id", "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;", "linked_admob_app_id", "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;"};
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static final String[] f15833e = {"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;"};
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final String[] f15834f = {"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"};
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final String[] f15835g = {"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};

    /* renamed from: h */
    private final C4876ez f15836h = new C4876ez(this, mo17154n(), "google_app_measurement.db");
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final C4846dx f15837i = new C4846dx(mo17153m());

    C4873ew(C4852ec ecVar) {
        super(ecVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final boolean mo17212e() {
        return false;
    }

    /* renamed from: f */
    public final void mo17704f() {
        mo17430k();
        mo17709y().beginTransaction();
    }

    /* renamed from: w */
    public final void mo17707w() {
        mo17430k();
        mo17709y().setTransactionSuccessful();
    }

    /* renamed from: x */
    public final void mo17708x() {
        mo17430k();
        mo17709y().endTransaction();
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x003b  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final long m21162b(java.lang.String r4, java.lang.String[] r5) {
        /*
            r3 = this;
            android.database.sqlite.SQLiteDatabase r0 = r3.mo17709y()
            r1 = 0
            android.database.Cursor r5 = r0.rawQuery(r4, r5)     // Catch:{ SQLiteException -> 0x002a }
            boolean r0 = r5.moveToFirst()     // Catch:{ SQLiteException -> 0x0024, all -> 0x0022 }
            if (r0 == 0) goto L_0x001a
            r0 = 0
            long r0 = r5.getLong(r0)     // Catch:{ SQLiteException -> 0x0024, all -> 0x0022 }
            if (r5 == 0) goto L_0x0019
            r5.close()
        L_0x0019:
            return r0
        L_0x001a:
            android.database.sqlite.SQLiteException r0 = new android.database.sqlite.SQLiteException     // Catch:{ SQLiteException -> 0x0024, all -> 0x0022 }
            java.lang.String r1 = "Database returned empty set"
            r0.<init>(r1)     // Catch:{ SQLiteException -> 0x0024, all -> 0x0022 }
            throw r0     // Catch:{ SQLiteException -> 0x0024, all -> 0x0022 }
        L_0x0022:
            r4 = move-exception
            goto L_0x0039
        L_0x0024:
            r0 = move-exception
            r1 = r5
            goto L_0x002b
        L_0x0027:
            r4 = move-exception
            r5 = r1
            goto L_0x0039
        L_0x002a:
            r0 = move-exception
        L_0x002b:
            com.google.android.gms.measurement.internal.r r5 = r3.mo17158r()     // Catch:{ all -> 0x0027 }
            com.google.android.gms.measurement.internal.t r5 = r5.mo17761y_()     // Catch:{ all -> 0x0027 }
            java.lang.String r2 = "Database error"
            r5.mo17765a(r2, r4, r0)     // Catch:{ all -> 0x0027 }
            throw r0     // Catch:{ all -> 0x0027 }
        L_0x0039:
            if (r5 == 0) goto L_0x003e
            r5.close()
        L_0x003e:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C4873ew.m21162b(java.lang.String, java.lang.String[]):long");
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0039  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final long m21155a(java.lang.String r3, java.lang.String[] r4, long r5) {
        /*
            r2 = this;
            android.database.sqlite.SQLiteDatabase r0 = r2.mo17709y()
            r1 = 0
            android.database.Cursor r4 = r0.rawQuery(r3, r4)     // Catch:{ SQLiteException -> 0x0028 }
            boolean r0 = r4.moveToFirst()     // Catch:{ SQLiteException -> 0x0023, all -> 0x0020 }
            if (r0 == 0) goto L_0x001a
            r5 = 0
            long r5 = r4.getLong(r5)     // Catch:{ SQLiteException -> 0x0023, all -> 0x0020 }
            if (r4 == 0) goto L_0x0019
            r4.close()
        L_0x0019:
            return r5
        L_0x001a:
            if (r4 == 0) goto L_0x001f
            r4.close()
        L_0x001f:
            return r5
        L_0x0020:
            r3 = move-exception
            r1 = r4
            goto L_0x0037
        L_0x0023:
            r5 = move-exception
            r1 = r4
            goto L_0x0029
        L_0x0026:
            r3 = move-exception
            goto L_0x0037
        L_0x0028:
            r5 = move-exception
        L_0x0029:
            com.google.android.gms.measurement.internal.r r4 = r2.mo17158r()     // Catch:{ all -> 0x0026 }
            com.google.android.gms.measurement.internal.t r4 = r4.mo17761y_()     // Catch:{ all -> 0x0026 }
            java.lang.String r6 = "Database error"
            r4.mo17765a(r6, r3, r5)     // Catch:{ all -> 0x0026 }
            throw r5     // Catch:{ all -> 0x0026 }
        L_0x0037:
            if (r1 == 0) goto L_0x003c
            r1.close()
        L_0x003c:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C4873ew.m21155a(java.lang.String, java.lang.String[], long):long");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: y */
    public final SQLiteDatabase mo17709y() {
        mo17144d();
        try {
            return this.f15836h.getWritableDatabase();
        } catch (SQLiteException e) {
            mo17158r().mo17754i().mo17764a("Error opening database", e);
            throw e;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:72:0x0145  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x014d  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.measurement.internal.C4822d mo17677a(java.lang.String r25, java.lang.String r26) {
        /*
            r24 = this;
            r15 = r26
            com.google.android.gms.common.internal.C3513t.m12627a(r25)
            com.google.android.gms.common.internal.C3513t.m12627a(r26)
            r24.mo17144d()
            r24.mo17430k()
            r16 = 0
            android.database.sqlite.SQLiteDatabase r1 = r24.mo17709y()     // Catch:{ SQLiteException -> 0x0124, all -> 0x011f }
            java.lang.String r2 = "events"
            r3 = 8
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch:{ SQLiteException -> 0x0124, all -> 0x011f }
            java.lang.String r4 = "lifetime_count"
            r9 = 0
            r3[r9] = r4     // Catch:{ SQLiteException -> 0x0124, all -> 0x011f }
            java.lang.String r4 = "current_bundle_count"
            r10 = 1
            r3[r10] = r4     // Catch:{ SQLiteException -> 0x0124, all -> 0x011f }
            java.lang.String r4 = "last_fire_timestamp"
            r11 = 2
            r3[r11] = r4     // Catch:{ SQLiteException -> 0x0124, all -> 0x011f }
            java.lang.String r4 = "last_bundled_timestamp"
            r12 = 3
            r3[r12] = r4     // Catch:{ SQLiteException -> 0x0124, all -> 0x011f }
            java.lang.String r4 = "last_bundled_day"
            r13 = 4
            r3[r13] = r4     // Catch:{ SQLiteException -> 0x0124, all -> 0x011f }
            java.lang.String r4 = "last_sampled_complex_event_id"
            r14 = 5
            r3[r14] = r4     // Catch:{ SQLiteException -> 0x0124, all -> 0x011f }
            java.lang.String r4 = "last_sampling_rate"
            r8 = 6
            r3[r8] = r4     // Catch:{ SQLiteException -> 0x0124, all -> 0x011f }
            java.lang.String r4 = "last_exempt_from_sampling"
            r7 = 7
            r3[r7] = r4     // Catch:{ SQLiteException -> 0x0124, all -> 0x011f }
            java.lang.String r4 = "app_id=? and name=?"
            java.lang.String[] r5 = new java.lang.String[r11]     // Catch:{ SQLiteException -> 0x0124, all -> 0x011f }
            r5[r9] = r25     // Catch:{ SQLiteException -> 0x0124, all -> 0x011f }
            r5[r10] = r15     // Catch:{ SQLiteException -> 0x0124, all -> 0x011f }
            r6 = 0
            r17 = 0
            r18 = 0
            r7 = r17
            r8 = r18
            android.database.Cursor r8 = r1.query(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ SQLiteException -> 0x0124, all -> 0x011f }
            boolean r1 = r8.moveToFirst()     // Catch:{ SQLiteException -> 0x011b, all -> 0x0118 }
            if (r1 != 0) goto L_0x0063
            if (r8 == 0) goto L_0x0062
            r8.close()
        L_0x0062:
            return r16
        L_0x0063:
            long r4 = r8.getLong(r9)     // Catch:{ SQLiteException -> 0x011b, all -> 0x0118 }
            long r6 = r8.getLong(r10)     // Catch:{ SQLiteException -> 0x011b, all -> 0x0118 }
            long r17 = r8.getLong(r11)     // Catch:{ SQLiteException -> 0x011b, all -> 0x0118 }
            boolean r1 = r8.isNull(r12)     // Catch:{ SQLiteException -> 0x011b, all -> 0x0118 }
            if (r1 == 0) goto L_0x0079
            r1 = 0
        L_0x0077:
            r11 = r1
            goto L_0x007e
        L_0x0079:
            long r1 = r8.getLong(r12)     // Catch:{ SQLiteException -> 0x011b, all -> 0x0118 }
            goto L_0x0077
        L_0x007e:
            boolean r1 = r8.isNull(r13)     // Catch:{ SQLiteException -> 0x011b, all -> 0x0118 }
            if (r1 == 0) goto L_0x0087
            r13 = r16
            goto L_0x0090
        L_0x0087:
            long r1 = r8.getLong(r13)     // Catch:{ SQLiteException -> 0x011b, all -> 0x0118 }
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch:{ SQLiteException -> 0x011b, all -> 0x0118 }
            r13 = r1
        L_0x0090:
            boolean r1 = r8.isNull(r14)     // Catch:{ SQLiteException -> 0x011b, all -> 0x0118 }
            if (r1 == 0) goto L_0x009a
            r14 = r16
        L_0x0098:
            r1 = 6
            goto L_0x00a4
        L_0x009a:
            long r1 = r8.getLong(r14)     // Catch:{ SQLiteException -> 0x011b, all -> 0x0118 }
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch:{ SQLiteException -> 0x011b, all -> 0x0118 }
            r14 = r1
            goto L_0x0098
        L_0x00a4:
            boolean r2 = r8.isNull(r1)     // Catch:{ SQLiteException -> 0x011b, all -> 0x0118 }
            if (r2 == 0) goto L_0x00ae
            r19 = r16
        L_0x00ac:
            r1 = 7
            goto L_0x00b9
        L_0x00ae:
            long r1 = r8.getLong(r1)     // Catch:{ SQLiteException -> 0x011b, all -> 0x0118 }
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch:{ SQLiteException -> 0x011b, all -> 0x0118 }
            r19 = r1
            goto L_0x00ac
        L_0x00b9:
            boolean r2 = r8.isNull(r1)     // Catch:{ SQLiteException -> 0x011b, all -> 0x0118 }
            if (r2 != 0) goto L_0x00d3
            long r1 = r8.getLong(r1)     // Catch:{ SQLiteException -> 0x00d1 }
            r20 = 1
            int r3 = (r1 > r20 ? 1 : (r1 == r20 ? 0 : -1))
            if (r3 != 0) goto L_0x00ca
            r9 = r10
        L_0x00ca:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r9)     // Catch:{ SQLiteException -> 0x00d1 }
            r20 = r1
            goto L_0x00d5
        L_0x00d1:
            r0 = move-exception
            goto L_0x011d
        L_0x00d3:
            r20 = r16
        L_0x00d5:
            com.google.android.gms.measurement.internal.d r21 = new com.google.android.gms.measurement.internal.d     // Catch:{ SQLiteException -> 0x011b, all -> 0x0118 }
            r1 = r21
            r2 = r25
            r3 = r15
            r10 = r8
            r8 = r17
            r22 = r10
            r10 = r11
            r12 = r13
            r13 = r14
            r14 = r19
            r15 = r20
            r1.<init>(r2, r3, r4, r6, r8, r10, r12, r13, r14, r15)     // Catch:{ SQLiteException -> 0x0113, all -> 0x010e }
            r1 = r22
            boolean r2 = r1.moveToNext()     // Catch:{ SQLiteException -> 0x010c, all -> 0x010a }
            if (r2 == 0) goto L_0x0104
            com.google.android.gms.measurement.internal.r r2 = r24.mo17158r()     // Catch:{ SQLiteException -> 0x010c, all -> 0x010a }
            com.google.android.gms.measurement.internal.t r2 = r2.mo17761y_()     // Catch:{ SQLiteException -> 0x010c, all -> 0x010a }
            java.lang.String r3 = "Got multiple records for event aggregates, expected one. appId"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C4893r.m21360a(r25)     // Catch:{ SQLiteException -> 0x010c, all -> 0x010a }
            r2.mo17764a(r3, r4)     // Catch:{ SQLiteException -> 0x010c, all -> 0x010a }
        L_0x0104:
            if (r1 == 0) goto L_0x0109
            r1.close()
        L_0x0109:
            return r21
        L_0x010a:
            r0 = move-exception
            goto L_0x0111
        L_0x010c:
            r0 = move-exception
            goto L_0x0116
        L_0x010e:
            r0 = move-exception
            r1 = r22
        L_0x0111:
            r8 = r1
            goto L_0x014a
        L_0x0113:
            r0 = move-exception
            r1 = r22
        L_0x0116:
            r8 = r1
            goto L_0x011d
        L_0x0118:
            r0 = move-exception
            r1 = r8
            goto L_0x014a
        L_0x011b:
            r0 = move-exception
            r1 = r8
        L_0x011d:
            r1 = r0
            goto L_0x0128
        L_0x011f:
            r0 = move-exception
            r1 = r0
            r8 = r16
            goto L_0x014b
        L_0x0124:
            r0 = move-exception
            r1 = r0
            r8 = r16
        L_0x0128:
            com.google.android.gms.measurement.internal.r r2 = r24.mo17158r()     // Catch:{ all -> 0x0149 }
            com.google.android.gms.measurement.internal.t r2 = r2.mo17761y_()     // Catch:{ all -> 0x0149 }
            java.lang.String r3 = "Error querying events. appId"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C4893r.m21360a(r25)     // Catch:{ all -> 0x0149 }
            com.google.android.gms.measurement.internal.p r5 = r24.mo17155o()     // Catch:{ all -> 0x0149 }
            r6 = r26
            java.lang.String r5 = r5.mo17746a(r6)     // Catch:{ all -> 0x0149 }
            r2.mo17766a(r3, r4, r5, r1)     // Catch:{ all -> 0x0149 }
            if (r8 == 0) goto L_0x0148
            r8.close()
        L_0x0148:
            return r16
        L_0x0149:
            r0 = move-exception
        L_0x014a:
            r1 = r0
        L_0x014b:
            if (r8 == 0) goto L_0x0150
            r8.close()
        L_0x0150:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C4873ew.mo17677a(java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.d");
    }

    /* renamed from: a */
    public final void mo17684a(C4822d dVar) {
        C3513t.m12625a(dVar);
        mo17144d();
        mo17430k();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", dVar.f15661a);
        contentValues.put("name", dVar.f15662b);
        contentValues.put("lifetime_count", Long.valueOf(dVar.f15663c));
        contentValues.put("current_bundle_count", Long.valueOf(dVar.f15664d));
        contentValues.put("last_fire_timestamp", Long.valueOf(dVar.f15665e));
        contentValues.put("last_bundled_timestamp", Long.valueOf(dVar.f15666f));
        contentValues.put("last_bundled_day", dVar.f15667g);
        contentValues.put("last_sampled_complex_event_id", dVar.f15668h);
        contentValues.put("last_sampling_rate", dVar.f15669i);
        contentValues.put("last_exempt_from_sampling", (dVar.f15670j == null || !dVar.f15670j.booleanValue()) ? null : Long.valueOf(1));
        try {
            if (mo17709y().insertWithOnConflict("events", null, contentValues, 5) == -1) {
                mo17158r().mo17761y_().mo17764a("Failed to insert/update event aggregates (got -1). appId", C4893r.m21360a(dVar.f15661a));
            }
        } catch (SQLiteException e) {
            mo17158r().mo17761y_().mo17765a("Error storing event aggregates. appId", C4893r.m21360a(dVar.f15661a), e);
        }
    }

    /* renamed from: b */
    public final void mo17695b(String str, String str2) {
        C3513t.m12627a(str);
        C3513t.m12627a(str2);
        mo17144d();
        mo17430k();
        try {
            mo17158r().mo17759x().mo17764a("Deleted user attribute rows", Integer.valueOf(mo17709y().delete("user_attributes", "app_id=? and name=?", new String[]{str, str2})));
        } catch (SQLiteException e) {
            mo17158r().mo17761y_().mo17766a("Error deleting user attribute. appId", C4893r.m21360a(str), mo17155o().mo17748c(str2), e);
        }
    }

    /* renamed from: a */
    public final boolean mo17690a(C4861ek ekVar) {
        C3513t.m12625a(ekVar);
        mo17144d();
        mo17430k();
        if (mo17697c(ekVar.f15784a, ekVar.f15786c) == null) {
            if (C4862el.m20968a(ekVar.f15786c)) {
                if (m21162b("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new String[]{ekVar.f15784a}) >= 25) {
                    return false;
                }
            } else {
                if (m21162b("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[]{ekVar.f15784a, ekVar.f15785b}) >= 25) {
                    return false;
                }
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", ekVar.f15784a);
        contentValues.put(TtmlNode.ATTR_TTS_ORIGIN, ekVar.f15785b);
        contentValues.put("name", ekVar.f15786c);
        contentValues.put("set_timestamp", Long.valueOf(ekVar.f15787d));
        m21158a(contentValues, "value", ekVar.f15788e);
        try {
            if (mo17709y().insertWithOnConflict("user_attributes", null, contentValues, 5) == -1) {
                mo17158r().mo17761y_().mo17764a("Failed to insert/update user property (got -1). appId", C4893r.m21360a(ekVar.f15784a));
            }
        } catch (SQLiteException e) {
            mo17158r().mo17761y_().mo17765a("Error storing user property. appId", C4893r.m21360a(ekVar.f15784a), e);
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00b1  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.measurement.internal.C4861ek mo17697c(java.lang.String r20, java.lang.String r21) {
        /*
            r19 = this;
            r8 = r21
            com.google.android.gms.common.internal.C3513t.m12627a(r20)
            com.google.android.gms.common.internal.C3513t.m12627a(r21)
            r19.mo17144d()
            r19.mo17430k()
            r9 = 0
            android.database.sqlite.SQLiteDatabase r10 = r19.mo17709y()     // Catch:{ SQLiteException -> 0x0089, all -> 0x0083 }
            java.lang.String r11 = "user_attributes"
            r1 = 3
            java.lang.String[] r12 = new java.lang.String[r1]     // Catch:{ SQLiteException -> 0x0089, all -> 0x0083 }
            java.lang.String r1 = "set_timestamp"
            r2 = 0
            r12[r2] = r1     // Catch:{ SQLiteException -> 0x0089, all -> 0x0083 }
            java.lang.String r1 = "value"
            r3 = 1
            r12[r3] = r1     // Catch:{ SQLiteException -> 0x0089, all -> 0x0083 }
            java.lang.String r1 = "origin"
            r4 = 2
            r12[r4] = r1     // Catch:{ SQLiteException -> 0x0089, all -> 0x0083 }
            java.lang.String r13 = "app_id=? and name=?"
            java.lang.String[] r14 = new java.lang.String[r4]     // Catch:{ SQLiteException -> 0x0089, all -> 0x0083 }
            r14[r2] = r20     // Catch:{ SQLiteException -> 0x0089, all -> 0x0083 }
            r14[r3] = r8     // Catch:{ SQLiteException -> 0x0089, all -> 0x0083 }
            r15 = 0
            r16 = 0
            r17 = 0
            android.database.Cursor r10 = r10.query(r11, r12, r13, r14, r15, r16, r17)     // Catch:{ SQLiteException -> 0x0089, all -> 0x0083 }
            boolean r1 = r10.moveToFirst()     // Catch:{ SQLiteException -> 0x007e, all -> 0x007a }
            if (r1 != 0) goto L_0x0044
            if (r10 == 0) goto L_0x0043
            r10.close()
        L_0x0043:
            return r9
        L_0x0044:
            long r5 = r10.getLong(r2)     // Catch:{ SQLiteException -> 0x007e, all -> 0x007a }
            r11 = r19
            java.lang.Object r7 = r11.m21157a(r10, r3)     // Catch:{ SQLiteException -> 0x0078 }
            java.lang.String r3 = r10.getString(r4)     // Catch:{ SQLiteException -> 0x0078 }
            com.google.android.gms.measurement.internal.ek r12 = new com.google.android.gms.measurement.internal.ek     // Catch:{ SQLiteException -> 0x0078 }
            r1 = r12
            r2 = r20
            r4 = r8
            r1.<init>(r2, r3, r4, r5, r7)     // Catch:{ SQLiteException -> 0x0078 }
            boolean r1 = r10.moveToNext()     // Catch:{ SQLiteException -> 0x0078 }
            if (r1 == 0) goto L_0x0072
            com.google.android.gms.measurement.internal.r r1 = r19.mo17158r()     // Catch:{ SQLiteException -> 0x0078 }
            com.google.android.gms.measurement.internal.t r1 = r1.mo17761y_()     // Catch:{ SQLiteException -> 0x0078 }
            java.lang.String r2 = "Got multiple records for user property, expected one. appId"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.C4893r.m21360a(r20)     // Catch:{ SQLiteException -> 0x0078 }
            r1.mo17764a(r2, r3)     // Catch:{ SQLiteException -> 0x0078 }
        L_0x0072:
            if (r10 == 0) goto L_0x0077
            r10.close()
        L_0x0077:
            return r12
        L_0x0078:
            r0 = move-exception
            goto L_0x0081
        L_0x007a:
            r0 = move-exception
            r11 = r19
            goto L_0x00ae
        L_0x007e:
            r0 = move-exception
            r11 = r19
        L_0x0081:
            r1 = r0
            goto L_0x008e
        L_0x0083:
            r0 = move-exception
            r11 = r19
            r1 = r0
            r10 = r9
            goto L_0x00af
        L_0x0089:
            r0 = move-exception
            r11 = r19
            r1 = r0
            r10 = r9
        L_0x008e:
            com.google.android.gms.measurement.internal.r r2 = r19.mo17158r()     // Catch:{ all -> 0x00ad }
            com.google.android.gms.measurement.internal.t r2 = r2.mo17761y_()     // Catch:{ all -> 0x00ad }
            java.lang.String r3 = "Error querying user property. appId"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C4893r.m21360a(r20)     // Catch:{ all -> 0x00ad }
            com.google.android.gms.measurement.internal.p r5 = r19.mo17155o()     // Catch:{ all -> 0x00ad }
            java.lang.String r5 = r5.mo17748c(r8)     // Catch:{ all -> 0x00ad }
            r2.mo17766a(r3, r4, r5, r1)     // Catch:{ all -> 0x00ad }
            if (r10 == 0) goto L_0x00ac
            r10.close()
        L_0x00ac:
            return r9
        L_0x00ad:
            r0 = move-exception
        L_0x00ae:
            r1 = r0
        L_0x00af:
            if (r10 == 0) goto L_0x00b4
            r10.close()
        L_0x00b4:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C4873ew.mo17697c(java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.ek");
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00bd  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<com.google.android.gms.measurement.internal.C4861ek> mo17680a(java.lang.String r25) {
        /*
            r24 = this;
            com.google.android.gms.common.internal.C3513t.m12627a(r25)
            r24.mo17144d()
            r24.mo17430k()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2 = 0
            android.database.sqlite.SQLiteDatabase r3 = r24.mo17709y()     // Catch:{ SQLiteException -> 0x009d, all -> 0x0097 }
            java.lang.String r4 = "user_attributes"
            r5 = 4
            java.lang.String[] r5 = new java.lang.String[r5]     // Catch:{ SQLiteException -> 0x009d, all -> 0x0097 }
            java.lang.String r6 = "name"
            r12 = 0
            r5[r12] = r6     // Catch:{ SQLiteException -> 0x009d, all -> 0x0097 }
            java.lang.String r6 = "origin"
            r13 = 1
            r5[r13] = r6     // Catch:{ SQLiteException -> 0x009d, all -> 0x0097 }
            java.lang.String r6 = "set_timestamp"
            r14 = 2
            r5[r14] = r6     // Catch:{ SQLiteException -> 0x009d, all -> 0x0097 }
            java.lang.String r6 = "value"
            r15 = 3
            r5[r15] = r6     // Catch:{ SQLiteException -> 0x009d, all -> 0x0097 }
            java.lang.String r6 = "app_id=?"
            java.lang.String[] r7 = new java.lang.String[r13]     // Catch:{ SQLiteException -> 0x009d, all -> 0x0097 }
            r7[r12] = r25     // Catch:{ SQLiteException -> 0x009d, all -> 0x0097 }
            r8 = 0
            r9 = 0
            java.lang.String r10 = "rowid"
            java.lang.String r11 = "1000"
            android.database.Cursor r3 = r3.query(r4, r5, r6, r7, r8, r9, r10, r11)     // Catch:{ SQLiteException -> 0x009d, all -> 0x0097 }
            boolean r4 = r3.moveToFirst()     // Catch:{ SQLiteException -> 0x0092, all -> 0x008e }
            if (r4 != 0) goto L_0x0048
            if (r3 == 0) goto L_0x0047
            r3.close()
        L_0x0047:
            return r1
        L_0x0048:
            java.lang.String r19 = r3.getString(r12)     // Catch:{ SQLiteException -> 0x0092, all -> 0x008e }
            java.lang.String r4 = r3.getString(r13)     // Catch:{ SQLiteException -> 0x0092, all -> 0x008e }
            if (r4 != 0) goto L_0x0054
            java.lang.String r4 = ""
        L_0x0054:
            r18 = r4
            long r20 = r3.getLong(r14)     // Catch:{ SQLiteException -> 0x0092, all -> 0x008e }
            r4 = r24
            java.lang.Object r22 = r4.m21157a(r3, r15)     // Catch:{ SQLiteException -> 0x008c }
            if (r22 != 0) goto L_0x0074
            com.google.android.gms.measurement.internal.r r5 = r24.mo17158r()     // Catch:{ SQLiteException -> 0x008c }
            com.google.android.gms.measurement.internal.t r5 = r5.mo17761y_()     // Catch:{ SQLiteException -> 0x008c }
            java.lang.String r6 = "Read invalid user property value, ignoring it. appId"
            java.lang.Object r7 = com.google.android.gms.measurement.internal.C4893r.m21360a(r25)     // Catch:{ SQLiteException -> 0x008c }
            r5.mo17764a(r6, r7)     // Catch:{ SQLiteException -> 0x008c }
            goto L_0x0080
        L_0x0074:
            com.google.android.gms.measurement.internal.ek r5 = new com.google.android.gms.measurement.internal.ek     // Catch:{ SQLiteException -> 0x008c }
            r16 = r5
            r17 = r25
            r16.<init>(r17, r18, r19, r20, r22)     // Catch:{ SQLiteException -> 0x008c }
            r1.add(r5)     // Catch:{ SQLiteException -> 0x008c }
        L_0x0080:
            boolean r5 = r3.moveToNext()     // Catch:{ SQLiteException -> 0x008c }
            if (r5 != 0) goto L_0x0048
            if (r3 == 0) goto L_0x008b
            r3.close()
        L_0x008b:
            return r1
        L_0x008c:
            r0 = move-exception
            goto L_0x0095
        L_0x008e:
            r0 = move-exception
            r4 = r24
            goto L_0x00ba
        L_0x0092:
            r0 = move-exception
            r4 = r24
        L_0x0095:
            r1 = r0
            goto L_0x00a2
        L_0x0097:
            r0 = move-exception
            r4 = r24
            r1 = r0
            r3 = r2
            goto L_0x00bb
        L_0x009d:
            r0 = move-exception
            r4 = r24
            r1 = r0
            r3 = r2
        L_0x00a2:
            com.google.android.gms.measurement.internal.r r5 = r24.mo17158r()     // Catch:{ all -> 0x00b9 }
            com.google.android.gms.measurement.internal.t r5 = r5.mo17761y_()     // Catch:{ all -> 0x00b9 }
            java.lang.String r6 = "Error querying user properties. appId"
            java.lang.Object r7 = com.google.android.gms.measurement.internal.C4893r.m21360a(r25)     // Catch:{ all -> 0x00b9 }
            r5.mo17765a(r6, r7, r1)     // Catch:{ all -> 0x00b9 }
            if (r3 == 0) goto L_0x00b8
            r3.close()
        L_0x00b8:
            return r2
        L_0x00b9:
            r0 = move-exception
        L_0x00ba:
            r1 = r0
        L_0x00bb:
            if (r3 == 0) goto L_0x00c0
            r3.close()
        L_0x00c0:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C4873ew.mo17680a(java.lang.String):java.util.List");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0032, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0033, code lost:
        r15 = r23;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0129, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x012a, code lost:
        r15 = r23;
        r1 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x012e, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x012f, code lost:
        r15 = r23;
        r12 = r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0153, code lost:
        r2.close();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0129 A[ExcHandler: all (r0v5 'th' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:1:0x000f] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x014a  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0153  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<com.google.android.gms.measurement.internal.C4861ek> mo17682a(java.lang.String r24, java.lang.String r25, java.lang.String r26) {
        /*
            r23 = this;
            com.google.android.gms.common.internal.C3513t.m12627a(r24)
            r23.mo17144d()
            r23.mo17430k()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2 = 0
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x012e, all -> 0x0129 }
            r4 = 3
            r3.<init>(r4)     // Catch:{ SQLiteException -> 0x012e, all -> 0x0129 }
            r12 = r24
            r3.add(r12)     // Catch:{ SQLiteException -> 0x0125, all -> 0x0129 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x0125, all -> 0x0129 }
            java.lang.String r6 = "app_id=?"
            r5.<init>(r6)     // Catch:{ SQLiteException -> 0x0125, all -> 0x0129 }
            boolean r6 = android.text.TextUtils.isEmpty(r25)     // Catch:{ SQLiteException -> 0x0125, all -> 0x0129 }
            if (r6 != 0) goto L_0x0037
            r6 = r25
            r3.add(r6)     // Catch:{ SQLiteException -> 0x0032, all -> 0x0129 }
            java.lang.String r7 = " and origin=?"
            r5.append(r7)     // Catch:{ SQLiteException -> 0x0032, all -> 0x0129 }
            goto L_0x0039
        L_0x0032:
            r0 = move-exception
            r15 = r23
            goto L_0x0135
        L_0x0037:
            r6 = r25
        L_0x0039:
            boolean r7 = android.text.TextUtils.isEmpty(r26)     // Catch:{ SQLiteException -> 0x0032, all -> 0x0129 }
            if (r7 != 0) goto L_0x0051
            java.lang.String r7 = java.lang.String.valueOf(r26)     // Catch:{ SQLiteException -> 0x0032, all -> 0x0129 }
            java.lang.String r8 = "*"
            java.lang.String r7 = r7.concat(r8)     // Catch:{ SQLiteException -> 0x0032, all -> 0x0129 }
            r3.add(r7)     // Catch:{ SQLiteException -> 0x0032, all -> 0x0129 }
            java.lang.String r7 = " and name glob ?"
            r5.append(r7)     // Catch:{ SQLiteException -> 0x0032, all -> 0x0129 }
        L_0x0051:
            int r7 = r3.size()     // Catch:{ SQLiteException -> 0x0032, all -> 0x0129 }
            java.lang.String[] r7 = new java.lang.String[r7]     // Catch:{ SQLiteException -> 0x0032, all -> 0x0129 }
            java.lang.Object[] r3 = r3.toArray(r7)     // Catch:{ SQLiteException -> 0x0032, all -> 0x0129 }
            r17 = r3
            java.lang.String[] r17 = (java.lang.String[]) r17     // Catch:{ SQLiteException -> 0x0032, all -> 0x0129 }
            android.database.sqlite.SQLiteDatabase r13 = r23.mo17709y()     // Catch:{ SQLiteException -> 0x0032, all -> 0x0129 }
            java.lang.String r14 = "user_attributes"
            r3 = 4
            java.lang.String[] r15 = new java.lang.String[r3]     // Catch:{ SQLiteException -> 0x0032, all -> 0x0129 }
            java.lang.String r3 = "name"
            r11 = 0
            r15[r11] = r3     // Catch:{ SQLiteException -> 0x0032, all -> 0x0129 }
            java.lang.String r3 = "set_timestamp"
            r9 = 1
            r15[r9] = r3     // Catch:{ SQLiteException -> 0x0032, all -> 0x0129 }
            java.lang.String r3 = "value"
            r10 = 2
            r15[r10] = r3     // Catch:{ SQLiteException -> 0x0032, all -> 0x0129 }
            java.lang.String r3 = "origin"
            r15[r4] = r3     // Catch:{ SQLiteException -> 0x0032, all -> 0x0129 }
            java.lang.String r16 = r5.toString()     // Catch:{ SQLiteException -> 0x0032, all -> 0x0129 }
            r18 = 0
            r19 = 0
            java.lang.String r20 = "rowid"
            java.lang.String r21 = "1001"
            android.database.Cursor r3 = r13.query(r14, r15, r16, r17, r18, r19, r20, r21)     // Catch:{ SQLiteException -> 0x0032, all -> 0x0129 }
            boolean r5 = r3.moveToFirst()     // Catch:{ SQLiteException -> 0x0120, all -> 0x011c }
            if (r5 != 0) goto L_0x0097
            if (r3 == 0) goto L_0x0096
            r3.close()
        L_0x0096:
            return r1
        L_0x0097:
            int r5 = r1.size()     // Catch:{ SQLiteException -> 0x0120, all -> 0x011c }
            r7 = 1000(0x3e8, float:1.401E-42)
            if (r5 < r7) goto L_0x00b3
            com.google.android.gms.measurement.internal.r r4 = r23.mo17158r()     // Catch:{ SQLiteException -> 0x0120, all -> 0x011c }
            com.google.android.gms.measurement.internal.t r4 = r4.mo17761y_()     // Catch:{ SQLiteException -> 0x0120, all -> 0x011c }
            java.lang.String r5 = "Read more than the max allowed user properties, ignoring excess"
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ SQLiteException -> 0x0120, all -> 0x011c }
            r4.mo17764a(r5, r7)     // Catch:{ SQLiteException -> 0x0120, all -> 0x011c }
            r15 = r23
            goto L_0x0102
        L_0x00b3:
            java.lang.String r8 = r3.getString(r11)     // Catch:{ SQLiteException -> 0x0120, all -> 0x011c }
            long r13 = r3.getLong(r9)     // Catch:{ SQLiteException -> 0x0120, all -> 0x011c }
            r15 = r23
            java.lang.Object r16 = r15.m21157a(r3, r10)     // Catch:{ SQLiteException -> 0x011a }
            java.lang.String r7 = r3.getString(r4)     // Catch:{ SQLiteException -> 0x011a }
            if (r16 != 0) goto L_0x00e7
            com.google.android.gms.measurement.internal.r r5 = r23.mo17158r()     // Catch:{ SQLiteException -> 0x00e2 }
            com.google.android.gms.measurement.internal.t r5 = r5.mo17761y_()     // Catch:{ SQLiteException -> 0x00e2 }
            java.lang.String r6 = "(2)Read invalid user property value, ignoring it"
            java.lang.Object r8 = com.google.android.gms.measurement.internal.C4893r.m21360a(r24)     // Catch:{ SQLiteException -> 0x00e2 }
            r13 = r26
            r5.mo17766a(r6, r8, r7, r13)     // Catch:{ SQLiteException -> 0x00e2 }
            r17 = r7
            r18 = r9
            r19 = r10
            r13 = r11
            goto L_0x00fc
        L_0x00e2:
            r0 = move-exception
            r1 = r0
            r6 = r7
            goto L_0x0137
        L_0x00e7:
            com.google.android.gms.measurement.internal.ek r6 = new com.google.android.gms.measurement.internal.ek     // Catch:{ SQLiteException -> 0x0113 }
            r5 = r6
            r4 = r6
            r6 = r12
            r17 = r7
            r18 = r9
            r19 = r10
            r9 = r13
            r13 = r11
            r11 = r16
            r5.<init>(r6, r7, r8, r9, r11)     // Catch:{ SQLiteException -> 0x0111 }
            r1.add(r4)     // Catch:{ SQLiteException -> 0x0111 }
        L_0x00fc:
            boolean r4 = r3.moveToNext()     // Catch:{ SQLiteException -> 0x0111 }
            if (r4 != 0) goto L_0x0108
        L_0x0102:
            if (r3 == 0) goto L_0x0107
            r3.close()
        L_0x0107:
            return r1
        L_0x0108:
            r11 = r13
            r6 = r17
            r9 = r18
            r10 = r19
            r4 = 3
            goto L_0x0097
        L_0x0111:
            r0 = move-exception
            goto L_0x0116
        L_0x0113:
            r0 = move-exception
            r17 = r7
        L_0x0116:
            r1 = r0
            r6 = r17
            goto L_0x0137
        L_0x011a:
            r0 = move-exception
            goto L_0x0123
        L_0x011c:
            r0 = move-exception
            r15 = r23
            goto L_0x014f
        L_0x0120:
            r0 = move-exception
            r15 = r23
        L_0x0123:
            r1 = r0
            goto L_0x0137
        L_0x0125:
            r0 = move-exception
            r15 = r23
            goto L_0x0133
        L_0x0129:
            r0 = move-exception
            r15 = r23
            r1 = r0
            goto L_0x0151
        L_0x012e:
            r0 = move-exception
            r15 = r23
            r12 = r24
        L_0x0133:
            r6 = r25
        L_0x0135:
            r1 = r0
            r3 = r2
        L_0x0137:
            com.google.android.gms.measurement.internal.r r4 = r23.mo17158r()     // Catch:{ all -> 0x014e }
            com.google.android.gms.measurement.internal.t r4 = r4.mo17761y_()     // Catch:{ all -> 0x014e }
            java.lang.String r5 = "(2)Error querying user properties"
            java.lang.Object r7 = com.google.android.gms.measurement.internal.C4893r.m21360a(r24)     // Catch:{ all -> 0x014e }
            r4.mo17766a(r5, r7, r6, r1)     // Catch:{ all -> 0x014e }
            if (r3 == 0) goto L_0x014d
            r3.close()
        L_0x014d:
            return r2
        L_0x014e:
            r0 = move-exception
        L_0x014f:
            r1 = r0
            r2 = r3
        L_0x0151:
            if (r2 == 0) goto L_0x0156
            r2.close()
        L_0x0156:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C4873ew.mo17682a(java.lang.String, java.lang.String, java.lang.String):java.util.List");
    }

    /* renamed from: a */
    public final boolean mo17691a(zzo zzo) {
        C3513t.m12625a(zzo);
        mo17144d();
        mo17430k();
        if (mo17697c(zzo.f16021a, zzo.f16023c.f15995a) == null) {
            if (m21162b("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[]{zzo.f16021a}) >= 1000) {
                return false;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", zzo.f16021a);
        contentValues.put(TtmlNode.ATTR_TTS_ORIGIN, zzo.f16022b);
        contentValues.put("name", zzo.f16023c.f15995a);
        m21158a(contentValues, "value", zzo.f16023c.mo17782a());
        contentValues.put("active", Boolean.valueOf(zzo.f16025e));
        contentValues.put("trigger_event_name", zzo.f16026f);
        contentValues.put("trigger_timeout", Long.valueOf(zzo.f16028h));
        mo17156p();
        contentValues.put("timed_out_event", C4862el.m20971a((Parcelable) zzo.f16027g));
        contentValues.put("creation_timestamp", Long.valueOf(zzo.f16024d));
        mo17156p();
        contentValues.put("triggered_event", C4862el.m20971a((Parcelable) zzo.f16029i));
        contentValues.put("triggered_timestamp", Long.valueOf(zzo.f16023c.f15996b));
        contentValues.put("time_to_live", Long.valueOf(zzo.f16030j));
        mo17156p();
        contentValues.put("expired_event", C4862el.m20971a((Parcelable) zzo.f16031k));
        try {
            if (mo17709y().insertWithOnConflict("conditional_properties", null, contentValues, 5) == -1) {
                mo17158r().mo17761y_().mo17764a("Failed to insert/update conditional user property (got -1)", C4893r.m21360a(zzo.f16021a));
            }
        } catch (SQLiteException e) {
            mo17158r().mo17761y_().mo17765a("Error storing conditional user property", C4893r.m21360a(zzo.f16021a), e);
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x014d  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0155  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.measurement.internal.zzo mo17698d(java.lang.String r34, java.lang.String r35) {
        /*
            r33 = this;
            r7 = r35
            com.google.android.gms.common.internal.C3513t.m12627a(r34)
            com.google.android.gms.common.internal.C3513t.m12627a(r35)
            r33.mo17144d()
            r33.mo17430k()
            r8 = 0
            android.database.sqlite.SQLiteDatabase r9 = r33.mo17709y()     // Catch:{ SQLiteException -> 0x012d, all -> 0x0127 }
            java.lang.String r10 = "conditional_properties"
            r1 = 11
            java.lang.String[] r11 = new java.lang.String[r1]     // Catch:{ SQLiteException -> 0x012d, all -> 0x0127 }
            java.lang.String r1 = "origin"
            r2 = 0
            r11[r2] = r1     // Catch:{ SQLiteException -> 0x012d, all -> 0x0127 }
            java.lang.String r1 = "value"
            r3 = 1
            r11[r3] = r1     // Catch:{ SQLiteException -> 0x012d, all -> 0x0127 }
            java.lang.String r1 = "active"
            r4 = 2
            r11[r4] = r1     // Catch:{ SQLiteException -> 0x012d, all -> 0x0127 }
            java.lang.String r1 = "trigger_event_name"
            r5 = 3
            r11[r5] = r1     // Catch:{ SQLiteException -> 0x012d, all -> 0x0127 }
            java.lang.String r1 = "trigger_timeout"
            r6 = 4
            r11[r6] = r1     // Catch:{ SQLiteException -> 0x012d, all -> 0x0127 }
            java.lang.String r1 = "timed_out_event"
            r15 = 5
            r11[r15] = r1     // Catch:{ SQLiteException -> 0x012d, all -> 0x0127 }
            java.lang.String r1 = "creation_timestamp"
            r14 = 6
            r11[r14] = r1     // Catch:{ SQLiteException -> 0x012d, all -> 0x0127 }
            java.lang.String r1 = "triggered_event"
            r13 = 7
            r11[r13] = r1     // Catch:{ SQLiteException -> 0x012d, all -> 0x0127 }
            java.lang.String r1 = "triggered_timestamp"
            r12 = 8
            r11[r12] = r1     // Catch:{ SQLiteException -> 0x012d, all -> 0x0127 }
            java.lang.String r1 = "time_to_live"
            r6 = 9
            r11[r6] = r1     // Catch:{ SQLiteException -> 0x012d, all -> 0x0127 }
            java.lang.String r1 = "expired_event"
            r6 = 10
            r11[r6] = r1     // Catch:{ SQLiteException -> 0x012d, all -> 0x0127 }
            java.lang.String r1 = "app_id=? and name=?"
            java.lang.String[] r13 = new java.lang.String[r4]     // Catch:{ SQLiteException -> 0x012d, all -> 0x0127 }
            r13[r2] = r34     // Catch:{ SQLiteException -> 0x012d, all -> 0x0127 }
            r13[r3] = r7     // Catch:{ SQLiteException -> 0x012d, all -> 0x0127 }
            r16 = 0
            r17 = 0
            r18 = 0
            r6 = r12
            r12 = r1
            r1 = 7
            r6 = r14
            r14 = r16
            r1 = r15
            r15 = r17
            r16 = r18
            android.database.Cursor r9 = r9.query(r10, r11, r12, r13, r14, r15, r16)     // Catch:{ SQLiteException -> 0x012d, all -> 0x0127 }
            boolean r10 = r9.moveToFirst()     // Catch:{ SQLiteException -> 0x0122, all -> 0x011e }
            if (r10 != 0) goto L_0x007c
            if (r9 == 0) goto L_0x007b
            r9.close()
        L_0x007b:
            return r8
        L_0x007c:
            java.lang.String r19 = r9.getString(r2)     // Catch:{ SQLiteException -> 0x0122, all -> 0x011e }
            r10 = r33
            java.lang.Object r11 = r10.m21157a(r9, r3)     // Catch:{ SQLiteException -> 0x011c }
            int r4 = r9.getInt(r4)     // Catch:{ SQLiteException -> 0x011c }
            if (r4 == 0) goto L_0x008f
            r23 = r3
            goto L_0x0091
        L_0x008f:
            r23 = r2
        L_0x0091:
            java.lang.String r24 = r9.getString(r5)     // Catch:{ SQLiteException -> 0x011c }
            r2 = 4
            long r26 = r9.getLong(r2)     // Catch:{ SQLiteException -> 0x011c }
            com.google.android.gms.measurement.internal.ei r2 = r33.mo17214g()     // Catch:{ SQLiteException -> 0x011c }
            byte[] r1 = r9.getBlob(r1)     // Catch:{ SQLiteException -> 0x011c }
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.zzag> r3 = com.google.android.gms.measurement.internal.zzag.CREATOR     // Catch:{ SQLiteException -> 0x011c }
            android.os.Parcelable r1 = r2.mo17468a(r1, r3)     // Catch:{ SQLiteException -> 0x011c }
            r25 = r1
            com.google.android.gms.measurement.internal.zzag r25 = (com.google.android.gms.measurement.internal.zzag) r25     // Catch:{ SQLiteException -> 0x011c }
            long r21 = r9.getLong(r6)     // Catch:{ SQLiteException -> 0x011c }
            com.google.android.gms.measurement.internal.ei r1 = r33.mo17214g()     // Catch:{ SQLiteException -> 0x011c }
            r2 = 7
            byte[] r2 = r9.getBlob(r2)     // Catch:{ SQLiteException -> 0x011c }
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.zzag> r3 = com.google.android.gms.measurement.internal.zzag.CREATOR     // Catch:{ SQLiteException -> 0x011c }
            android.os.Parcelable r1 = r1.mo17468a(r2, r3)     // Catch:{ SQLiteException -> 0x011c }
            r28 = r1
            com.google.android.gms.measurement.internal.zzag r28 = (com.google.android.gms.measurement.internal.zzag) r28     // Catch:{ SQLiteException -> 0x011c }
            r1 = 8
            long r3 = r9.getLong(r1)     // Catch:{ SQLiteException -> 0x011c }
            r1 = 9
            long r29 = r9.getLong(r1)     // Catch:{ SQLiteException -> 0x011c }
            com.google.android.gms.measurement.internal.ei r1 = r33.mo17214g()     // Catch:{ SQLiteException -> 0x011c }
            r2 = 10
            byte[] r2 = r9.getBlob(r2)     // Catch:{ SQLiteException -> 0x011c }
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.zzag> r5 = com.google.android.gms.measurement.internal.zzag.CREATOR     // Catch:{ SQLiteException -> 0x011c }
            android.os.Parcelable r1 = r1.mo17468a(r2, r5)     // Catch:{ SQLiteException -> 0x011c }
            r31 = r1
            com.google.android.gms.measurement.internal.zzag r31 = (com.google.android.gms.measurement.internal.zzag) r31     // Catch:{ SQLiteException -> 0x011c }
            com.google.android.gms.measurement.internal.zzfv r20 = new com.google.android.gms.measurement.internal.zzfv     // Catch:{ SQLiteException -> 0x011c }
            r1 = r20
            r2 = r7
            r5 = r11
            r6 = r19
            r1.<init>(r2, r3, r5, r6)     // Catch:{ SQLiteException -> 0x011c }
            com.google.android.gms.measurement.internal.zzo r1 = new com.google.android.gms.measurement.internal.zzo     // Catch:{ SQLiteException -> 0x011c }
            r17 = r1
            r18 = r34
            r17.<init>(r18, r19, r20, r21, r23, r24, r25, r26, r28, r29, r31)     // Catch:{ SQLiteException -> 0x011c }
            boolean r2 = r9.moveToNext()     // Catch:{ SQLiteException -> 0x011c }
            if (r2 == 0) goto L_0x0116
            com.google.android.gms.measurement.internal.r r2 = r33.mo17158r()     // Catch:{ SQLiteException -> 0x011c }
            com.google.android.gms.measurement.internal.t r2 = r2.mo17761y_()     // Catch:{ SQLiteException -> 0x011c }
            java.lang.String r3 = "Got multiple records for conditional property, expected one"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C4893r.m21360a(r34)     // Catch:{ SQLiteException -> 0x011c }
            com.google.android.gms.measurement.internal.p r5 = r33.mo17155o()     // Catch:{ SQLiteException -> 0x011c }
            java.lang.String r5 = r5.mo17748c(r7)     // Catch:{ SQLiteException -> 0x011c }
            r2.mo17765a(r3, r4, r5)     // Catch:{ SQLiteException -> 0x011c }
        L_0x0116:
            if (r9 == 0) goto L_0x011b
            r9.close()
        L_0x011b:
            return r1
        L_0x011c:
            r0 = move-exception
            goto L_0x0125
        L_0x011e:
            r0 = move-exception
            r10 = r33
            goto L_0x0152
        L_0x0122:
            r0 = move-exception
            r10 = r33
        L_0x0125:
            r1 = r0
            goto L_0x0132
        L_0x0127:
            r0 = move-exception
            r10 = r33
            r1 = r0
            r9 = r8
            goto L_0x0153
        L_0x012d:
            r0 = move-exception
            r10 = r33
            r1 = r0
            r9 = r8
        L_0x0132:
            com.google.android.gms.measurement.internal.r r2 = r33.mo17158r()     // Catch:{ all -> 0x0151 }
            com.google.android.gms.measurement.internal.t r2 = r2.mo17761y_()     // Catch:{ all -> 0x0151 }
            java.lang.String r3 = "Error querying conditional property"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C4893r.m21360a(r34)     // Catch:{ all -> 0x0151 }
            com.google.android.gms.measurement.internal.p r5 = r33.mo17155o()     // Catch:{ all -> 0x0151 }
            java.lang.String r5 = r5.mo17748c(r7)     // Catch:{ all -> 0x0151 }
            r2.mo17766a(r3, r4, r5, r1)     // Catch:{ all -> 0x0151 }
            if (r9 == 0) goto L_0x0150
            r9.close()
        L_0x0150:
            return r8
        L_0x0151:
            r0 = move-exception
        L_0x0152:
            r1 = r0
        L_0x0153:
            if (r9 == 0) goto L_0x0158
            r9.close()
        L_0x0158:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C4873ew.mo17698d(java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.zzo");
    }

    /* renamed from: e */
    public final int mo17700e(String str, String str2) {
        C3513t.m12627a(str);
        C3513t.m12627a(str2);
        mo17144d();
        mo17430k();
        try {
            return mo17709y().delete("conditional_properties", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e) {
            mo17158r().mo17761y_().mo17766a("Error deleting conditional property", C4893r.m21360a(str), mo17155o().mo17748c(str2), e);
            return 0;
        }
    }

    /* renamed from: b */
    public final List<zzo> mo17694b(String str, String str2, String str3) {
        C3513t.m12627a(str);
        mo17144d();
        mo17430k();
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(str);
        StringBuilder sb = new StringBuilder("app_id=?");
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(str2);
            sb.append(" and origin=?");
        }
        if (!TextUtils.isEmpty(str3)) {
            arrayList.add(String.valueOf(str3).concat("*"));
            sb.append(" and name glob ?");
        }
        return mo17683a(sb.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x016d  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0176  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<com.google.android.gms.measurement.internal.zzo> mo17683a(java.lang.String r39, java.lang.String[] r40) {
        /*
            r38 = this;
            r38.mo17144d()
            r38.mo17430k()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            android.database.sqlite.SQLiteDatabase r3 = r38.mo17709y()     // Catch:{ SQLiteException -> 0x0157, all -> 0x0153 }
            java.lang.String r4 = "conditional_properties"
            r5 = 13
            java.lang.String[] r5 = new java.lang.String[r5]     // Catch:{ SQLiteException -> 0x0157, all -> 0x0153 }
            java.lang.String r6 = "app_id"
            r12 = 0
            r5[r12] = r6     // Catch:{ SQLiteException -> 0x0157, all -> 0x0153 }
            java.lang.String r6 = "origin"
            r13 = 1
            r5[r13] = r6     // Catch:{ SQLiteException -> 0x0157, all -> 0x0153 }
            java.lang.String r6 = "name"
            r14 = 2
            r5[r14] = r6     // Catch:{ SQLiteException -> 0x0157, all -> 0x0153 }
            java.lang.String r6 = "value"
            r15 = 3
            r5[r15] = r6     // Catch:{ SQLiteException -> 0x0157, all -> 0x0153 }
            java.lang.String r6 = "active"
            r11 = 4
            r5[r11] = r6     // Catch:{ SQLiteException -> 0x0157, all -> 0x0153 }
            java.lang.String r6 = "trigger_event_name"
            r10 = 5
            r5[r10] = r6     // Catch:{ SQLiteException -> 0x0157, all -> 0x0153 }
            java.lang.String r6 = "trigger_timeout"
            r9 = 6
            r5[r9] = r6     // Catch:{ SQLiteException -> 0x0157, all -> 0x0153 }
            java.lang.String r6 = "timed_out_event"
            r8 = 7
            r5[r8] = r6     // Catch:{ SQLiteException -> 0x0157, all -> 0x0153 }
            java.lang.String r6 = "creation_timestamp"
            r7 = 8
            r5[r7] = r6     // Catch:{ SQLiteException -> 0x0157, all -> 0x0153 }
            java.lang.String r6 = "triggered_event"
            r2 = 9
            r5[r2] = r6     // Catch:{ SQLiteException -> 0x0157, all -> 0x0153 }
            java.lang.String r6 = "triggered_timestamp"
            r2 = 10
            r5[r2] = r6     // Catch:{ SQLiteException -> 0x0157, all -> 0x0153 }
            java.lang.String r6 = "time_to_live"
            r2 = 11
            r5[r2] = r6     // Catch:{ SQLiteException -> 0x0157, all -> 0x0153 }
            java.lang.String r6 = "expired_event"
            r2 = 12
            r5[r2] = r6     // Catch:{ SQLiteException -> 0x0157, all -> 0x0153 }
            r20 = 0
            r21 = 0
            java.lang.String r22 = "rowid"
            java.lang.String r23 = "1001"
            r6 = r39
            r2 = r7
            r7 = r40
            r2 = r8
            r8 = r20
            r2 = r9
            r9 = r21
            r2 = r10
            r10 = r22
            r2 = r11
            r11 = r23
            android.database.Cursor r3 = r3.query(r4, r5, r6, r7, r8, r9, r10, r11)     // Catch:{ SQLiteException -> 0x0157, all -> 0x0153 }
            boolean r4 = r3.moveToFirst()     // Catch:{ SQLiteException -> 0x014f, all -> 0x014c }
            if (r4 != 0) goto L_0x0084
            if (r3 == 0) goto L_0x0083
            r3.close()
        L_0x0083:
            return r1
        L_0x0084:
            int r4 = r1.size()     // Catch:{ SQLiteException -> 0x014f, all -> 0x014c }
            r5 = 1000(0x3e8, float:1.401E-42)
            if (r4 < r5) goto L_0x009f
            com.google.android.gms.measurement.internal.r r2 = r38.mo17158r()     // Catch:{ SQLiteException -> 0x014f, all -> 0x014c }
            com.google.android.gms.measurement.internal.t r2 = r2.mo17761y_()     // Catch:{ SQLiteException -> 0x014f, all -> 0x014c }
            java.lang.String r4 = "Read more than the max allowed conditional properties, ignoring extra"
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ SQLiteException -> 0x014f, all -> 0x014c }
            r2.mo17764a(r4, r5)     // Catch:{ SQLiteException -> 0x014f, all -> 0x014c }
            goto L_0x0142
        L_0x009f:
            java.lang.String r4 = r3.getString(r12)     // Catch:{ SQLiteException -> 0x014f, all -> 0x014c }
            java.lang.String r11 = r3.getString(r13)     // Catch:{ SQLiteException -> 0x014f, all -> 0x014c }
            java.lang.String r6 = r3.getString(r14)     // Catch:{ SQLiteException -> 0x014f, all -> 0x014c }
            r10 = r38
            java.lang.Object r9 = r10.m21157a(r3, r15)     // Catch:{ SQLiteException -> 0x014f, all -> 0x014c }
            int r5 = r3.getInt(r2)     // Catch:{ SQLiteException -> 0x014f, all -> 0x014c }
            if (r5 == 0) goto L_0x00bb
            r22 = r13
        L_0x00b9:
            r7 = 5
            goto L_0x00be
        L_0x00bb:
            r22 = r12
            goto L_0x00b9
        L_0x00be:
            java.lang.String r23 = r3.getString(r7)     // Catch:{ SQLiteException -> 0x014f, all -> 0x014c }
            r8 = 6
            long r27 = r3.getLong(r8)     // Catch:{ SQLiteException -> 0x014f, all -> 0x014c }
            com.google.android.gms.measurement.internal.ei r5 = r38.mo17214g()     // Catch:{ SQLiteException -> 0x014f, all -> 0x014c }
            r2 = 7
            byte[] r7 = r3.getBlob(r2)     // Catch:{ SQLiteException -> 0x014f, all -> 0x014c }
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.zzag> r2 = com.google.android.gms.measurement.internal.zzag.CREATOR     // Catch:{ SQLiteException -> 0x014f, all -> 0x014c }
            android.os.Parcelable r2 = r5.mo17468a(r7, r2)     // Catch:{ SQLiteException -> 0x014f, all -> 0x014c }
            com.google.android.gms.measurement.internal.zzag r2 = (com.google.android.gms.measurement.internal.zzag) r2     // Catch:{ SQLiteException -> 0x014f, all -> 0x014c }
            r7 = 8
            long r20 = r3.getLong(r7)     // Catch:{ SQLiteException -> 0x014f, all -> 0x014c }
            com.google.android.gms.measurement.internal.ei r5 = r38.mo17214g()     // Catch:{ SQLiteException -> 0x014f, all -> 0x014c }
            r12 = 9
            byte[] r7 = r3.getBlob(r12)     // Catch:{ SQLiteException -> 0x014f, all -> 0x014c }
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.zzag> r8 = com.google.android.gms.measurement.internal.zzag.CREATOR     // Catch:{ SQLiteException -> 0x014f, all -> 0x014c }
            android.os.Parcelable r5 = r5.mo17468a(r7, r8)     // Catch:{ SQLiteException -> 0x014f, all -> 0x014c }
            r29 = r5
            com.google.android.gms.measurement.internal.zzag r29 = (com.google.android.gms.measurement.internal.zzag) r29     // Catch:{ SQLiteException -> 0x014f, all -> 0x014c }
            r7 = 10
            long r16 = r3.getLong(r7)     // Catch:{ SQLiteException -> 0x014f, all -> 0x014c }
            r8 = 11
            long r34 = r3.getLong(r8)     // Catch:{ SQLiteException -> 0x014f, all -> 0x014c }
            com.google.android.gms.measurement.internal.ei r5 = r38.mo17214g()     // Catch:{ SQLiteException -> 0x014f, all -> 0x014c }
            r12 = 12
            byte[] r7 = r3.getBlob(r12)     // Catch:{ SQLiteException -> 0x014f, all -> 0x014c }
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.zzag> r8 = com.google.android.gms.measurement.internal.zzag.CREATOR     // Catch:{ SQLiteException -> 0x014f, all -> 0x014c }
            android.os.Parcelable r5 = r5.mo17468a(r7, r8)     // Catch:{ SQLiteException -> 0x014f, all -> 0x014c }
            r30 = r5
            com.google.android.gms.measurement.internal.zzag r30 = (com.google.android.gms.measurement.internal.zzag) r30     // Catch:{ SQLiteException -> 0x014f, all -> 0x014c }
            com.google.android.gms.measurement.internal.zzfv r19 = new com.google.android.gms.measurement.internal.zzfv     // Catch:{ SQLiteException -> 0x014f, all -> 0x014c }
            r5 = r19
            r31 = 5
            r32 = 6
            r33 = 8
            r36 = 10
            r37 = 11
            r7 = r16
            r10 = r11
            r5.<init>(r6, r7, r9, r10)     // Catch:{ SQLiteException -> 0x014f, all -> 0x014c }
            com.google.android.gms.measurement.internal.zzo r5 = new com.google.android.gms.measurement.internal.zzo     // Catch:{ SQLiteException -> 0x014f, all -> 0x014c }
            r16 = r5
            r17 = r4
            r18 = r11
            r24 = r2
            r25 = r27
            r27 = r29
            r28 = r34
            r16.<init>(r17, r18, r19, r20, r22, r23, r24, r25, r27, r28, r30)     // Catch:{ SQLiteException -> 0x014f, all -> 0x014c }
            r1.add(r5)     // Catch:{ SQLiteException -> 0x014f, all -> 0x014c }
            boolean r2 = r3.moveToNext()     // Catch:{ SQLiteException -> 0x014f, all -> 0x014c }
            if (r2 != 0) goto L_0x0148
        L_0x0142:
            if (r3 == 0) goto L_0x0147
            r3.close()
        L_0x0147:
            return r1
        L_0x0148:
            r2 = 4
            r12 = 0
            goto L_0x0084
        L_0x014c:
            r0 = move-exception
            r1 = r0
            goto L_0x0174
        L_0x014f:
            r0 = move-exception
            r1 = r0
            r2 = r3
            goto L_0x015a
        L_0x0153:
            r0 = move-exception
            r1 = r0
            r3 = 0
            goto L_0x0174
        L_0x0157:
            r0 = move-exception
            r1 = r0
            r2 = 0
        L_0x015a:
            com.google.android.gms.measurement.internal.r r3 = r38.mo17158r()     // Catch:{ all -> 0x0171 }
            com.google.android.gms.measurement.internal.t r3 = r3.mo17761y_()     // Catch:{ all -> 0x0171 }
            java.lang.String r4 = "Error querying conditional user property value"
            r3.mo17764a(r4, r1)     // Catch:{ all -> 0x0171 }
            java.util.List r1 = java.util.Collections.emptyList()     // Catch:{ all -> 0x0171 }
            if (r2 == 0) goto L_0x0170
            r2.close()
        L_0x0170:
            return r1
        L_0x0171:
            r0 = move-exception
            r1 = r0
            r3 = r2
        L_0x0174:
            if (r3 == 0) goto L_0x0179
            r3.close()
        L_0x0179:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C4873ew.mo17683a(java.lang.String, java.lang.String[]):java.util.List");
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x017e A[Catch:{ SQLiteException -> 0x0213, all -> 0x0211 }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0182 A[Catch:{ SQLiteException -> 0x0213, all -> 0x0211 }] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x01b6 A[Catch:{ SQLiteException -> 0x0213, all -> 0x0211 }] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x01b9 A[Catch:{ SQLiteException -> 0x0213, all -> 0x0211 }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x01c8 A[Catch:{ SQLiteException -> 0x0213, all -> 0x0211 }] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x01dd A[Catch:{ SQLiteException -> 0x0213, all -> 0x0211 }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x01fa A[Catch:{ SQLiteException -> 0x0213, all -> 0x0211 }] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x020d  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x023e  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0247  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.measurement.internal.C4864en mo17693b(java.lang.String r21) {
        /*
            r20 = this;
            r1 = r21
            com.google.android.gms.common.internal.C3513t.m12627a(r21)
            r20.mo17144d()
            r20.mo17430k()
            r2 = 0
            android.database.sqlite.SQLiteDatabase r3 = r20.mo17709y()     // Catch:{ SQLiteException -> 0x0226, all -> 0x0220 }
            java.lang.String r4 = "apps"
            r5 = 26
            java.lang.String[] r5 = new java.lang.String[r5]     // Catch:{ SQLiteException -> 0x0226, all -> 0x0220 }
            java.lang.String r6 = "app_instance_id"
            r11 = 0
            r5[r11] = r6     // Catch:{ SQLiteException -> 0x0226, all -> 0x0220 }
            java.lang.String r6 = "gmp_app_id"
            r12 = 1
            r5[r12] = r6     // Catch:{ SQLiteException -> 0x0226, all -> 0x0220 }
            java.lang.String r6 = "resettable_device_id_hash"
            r13 = 2
            r5[r13] = r6     // Catch:{ SQLiteException -> 0x0226, all -> 0x0220 }
            java.lang.String r6 = "last_bundle_index"
            r14 = 3
            r5[r14] = r6     // Catch:{ SQLiteException -> 0x0226, all -> 0x0220 }
            java.lang.String r6 = "last_bundle_start_timestamp"
            r15 = 4
            r5[r15] = r6     // Catch:{ SQLiteException -> 0x0226, all -> 0x0220 }
            java.lang.String r6 = "last_bundle_end_timestamp"
            r10 = 5
            r5[r10] = r6     // Catch:{ SQLiteException -> 0x0226, all -> 0x0220 }
            java.lang.String r6 = "app_version"
            r9 = 6
            r5[r9] = r6     // Catch:{ SQLiteException -> 0x0226, all -> 0x0220 }
            java.lang.String r6 = "app_store"
            r8 = 7
            r5[r8] = r6     // Catch:{ SQLiteException -> 0x0226, all -> 0x0220 }
            java.lang.String r6 = "gmp_version"
            r7 = 8
            r5[r7] = r6     // Catch:{ SQLiteException -> 0x0226, all -> 0x0220 }
            r6 = 9
            java.lang.String r16 = "dev_cert_hash"
            r5[r6] = r16     // Catch:{ SQLiteException -> 0x0226, all -> 0x0220 }
            java.lang.String r6 = "measurement_enabled"
            r15 = 10
            r5[r15] = r6     // Catch:{ SQLiteException -> 0x0226, all -> 0x0220 }
            r6 = 11
            java.lang.String r16 = "day"
            r5[r6] = r16     // Catch:{ SQLiteException -> 0x0226, all -> 0x0220 }
            r6 = 12
            java.lang.String r16 = "daily_public_events_count"
            r5[r6] = r16     // Catch:{ SQLiteException -> 0x0226, all -> 0x0220 }
            r6 = 13
            java.lang.String r16 = "daily_events_count"
            r5[r6] = r16     // Catch:{ SQLiteException -> 0x0226, all -> 0x0220 }
            r6 = 14
            java.lang.String r16 = "daily_conversions_count"
            r5[r6] = r16     // Catch:{ SQLiteException -> 0x0226, all -> 0x0220 }
            r6 = 15
            java.lang.String r16 = "config_fetched_time"
            r5[r6] = r16     // Catch:{ SQLiteException -> 0x0226, all -> 0x0220 }
            r6 = 16
            java.lang.String r16 = "failed_config_fetch_time"
            r5[r6] = r16     // Catch:{ SQLiteException -> 0x0226, all -> 0x0220 }
            java.lang.String r6 = "app_version_int"
            r15 = 17
            r5[r15] = r6     // Catch:{ SQLiteException -> 0x0226, all -> 0x0220 }
            r6 = 18
            java.lang.String r16 = "firebase_instance_id"
            r5[r6] = r16     // Catch:{ SQLiteException -> 0x0226, all -> 0x0220 }
            r6 = 19
            java.lang.String r16 = "daily_error_events_count"
            r5[r6] = r16     // Catch:{ SQLiteException -> 0x0226, all -> 0x0220 }
            r6 = 20
            java.lang.String r16 = "daily_realtime_events_count"
            r5[r6] = r16     // Catch:{ SQLiteException -> 0x0226, all -> 0x0220 }
            r6 = 21
            java.lang.String r16 = "health_monitor_sample"
            r5[r6] = r16     // Catch:{ SQLiteException -> 0x0226, all -> 0x0220 }
            java.lang.String r6 = "android_id"
            r15 = 22
            r5[r15] = r6     // Catch:{ SQLiteException -> 0x0226, all -> 0x0220 }
            java.lang.String r6 = "adid_reporting_enabled"
            r15 = 23
            r5[r15] = r6     // Catch:{ SQLiteException -> 0x0226, all -> 0x0220 }
            java.lang.String r6 = "ssaid_reporting_enabled"
            r15 = 24
            r5[r15] = r6     // Catch:{ SQLiteException -> 0x0226, all -> 0x0220 }
            r6 = 25
            java.lang.String r16 = "admob_app_id"
            r5[r6] = r16     // Catch:{ SQLiteException -> 0x0226, all -> 0x0220 }
            java.lang.String r6 = "app_id=?"
            java.lang.String[] r7 = new java.lang.String[r12]     // Catch:{ SQLiteException -> 0x0226, all -> 0x0220 }
            r7[r11] = r1     // Catch:{ SQLiteException -> 0x0226, all -> 0x0220 }
            r16 = 0
            r17 = 0
            r18 = 0
            r15 = 8
            r15 = r8
            r8 = r16
            r15 = r9
            r9 = r17
            r15 = r10
            r10 = r18
            android.database.Cursor r3 = r3.query(r4, r5, r6, r7, r8, r9, r10)     // Catch:{ SQLiteException -> 0x0226, all -> 0x0220 }
            boolean r4 = r3.moveToFirst()     // Catch:{ SQLiteException -> 0x021a, all -> 0x0215 }
            if (r4 != 0) goto L_0x00d1
            if (r3 == 0) goto L_0x00d0
            r3.close()
        L_0x00d0:
            return r2
        L_0x00d1:
            com.google.android.gms.measurement.internal.en r4 = new com.google.android.gms.measurement.internal.en     // Catch:{ SQLiteException -> 0x021a, all -> 0x0215 }
            r5 = r20
            com.google.android.gms.measurement.internal.ec r6 = r5.f15744a     // Catch:{ SQLiteException -> 0x0213, all -> 0x0211 }
            com.google.android.gms.measurement.internal.aw r6 = r6.mo17462p()     // Catch:{ SQLiteException -> 0x0213, all -> 0x0211 }
            r4.<init>(r6, r1)     // Catch:{ SQLiteException -> 0x0213, all -> 0x0211 }
            java.lang.String r6 = r3.getString(r11)     // Catch:{ SQLiteException -> 0x0213, all -> 0x0211 }
            r4.mo17521a(r6)     // Catch:{ SQLiteException -> 0x0213, all -> 0x0211 }
            java.lang.String r6 = r3.getString(r12)     // Catch:{ SQLiteException -> 0x0213, all -> 0x0211 }
            r4.mo17525b(r6)     // Catch:{ SQLiteException -> 0x0213, all -> 0x0211 }
            java.lang.String r6 = r3.getString(r13)     // Catch:{ SQLiteException -> 0x0213, all -> 0x0211 }
            r4.mo17533d(r6)     // Catch:{ SQLiteException -> 0x0213, all -> 0x0211 }
            long r6 = r3.getLong(r14)     // Catch:{ SQLiteException -> 0x0213, all -> 0x0211 }
            r4.mo17538f(r6)     // Catch:{ SQLiteException -> 0x0213, all -> 0x0211 }
            r6 = 4
            long r6 = r3.getLong(r6)     // Catch:{ SQLiteException -> 0x0213, all -> 0x0211 }
            r4.mo17520a(r6)     // Catch:{ SQLiteException -> 0x0213, all -> 0x0211 }
            long r6 = r3.getLong(r15)     // Catch:{ SQLiteException -> 0x0213, all -> 0x0211 }
            r4.mo17524b(r6)     // Catch:{ SQLiteException -> 0x0213, all -> 0x0211 }
            r6 = 6
            java.lang.String r6 = r3.getString(r6)     // Catch:{ SQLiteException -> 0x0213, all -> 0x0211 }
            r4.mo17539f(r6)     // Catch:{ SQLiteException -> 0x0213, all -> 0x0211 }
            r6 = 7
            java.lang.String r6 = r3.getString(r6)     // Catch:{ SQLiteException -> 0x0213, all -> 0x0211 }
            r4.mo17542g(r6)     // Catch:{ SQLiteException -> 0x0213, all -> 0x0211 }
            r6 = 8
            long r6 = r3.getLong(r6)     // Catch:{ SQLiteException -> 0x0213, all -> 0x0211 }
            r4.mo17532d(r6)     // Catch:{ SQLiteException -> 0x0213, all -> 0x0211 }
            r6 = 9
            long r6 = r3.getLong(r6)     // Catch:{ SQLiteException -> 0x0213, all -> 0x0211 }
            r4.mo17535e(r6)     // Catch:{ SQLiteException -> 0x0213, all -> 0x0211 }
            r6 = 10
            boolean r7 = r3.isNull(r6)     // Catch:{ SQLiteException -> 0x0213, all -> 0x0211 }
            if (r7 != 0) goto L_0x013c
            int r6 = r3.getInt(r6)     // Catch:{ SQLiteException -> 0x0213, all -> 0x0211 }
            if (r6 == 0) goto L_0x013a
            goto L_0x013c
        L_0x013a:
            r6 = r11
            goto L_0x013d
        L_0x013c:
            r6 = r12
        L_0x013d:
            r4.mo17522a(r6)     // Catch:{ SQLiteException -> 0x0213, all -> 0x0211 }
            r6 = 11
            long r6 = r3.getLong(r6)     // Catch:{ SQLiteException -> 0x0213, all -> 0x0211 }
            r4.mo17547i(r6)     // Catch:{ SQLiteException -> 0x0213, all -> 0x0211 }
            r6 = 12
            long r6 = r3.getLong(r6)     // Catch:{ SQLiteException -> 0x0213, all -> 0x0211 }
            r4.mo17549j(r6)     // Catch:{ SQLiteException -> 0x0213, all -> 0x0211 }
            r6 = 13
            long r6 = r3.getLong(r6)     // Catch:{ SQLiteException -> 0x0213, all -> 0x0211 }
            r4.mo17551k(r6)     // Catch:{ SQLiteException -> 0x0213, all -> 0x0211 }
            r6 = 14
            long r6 = r3.getLong(r6)     // Catch:{ SQLiteException -> 0x0213, all -> 0x0211 }
            r4.mo17553l(r6)     // Catch:{ SQLiteException -> 0x0213, all -> 0x0211 }
            r6 = 15
            long r6 = r3.getLong(r6)     // Catch:{ SQLiteException -> 0x0213, all -> 0x0211 }
            r4.mo17541g(r6)     // Catch:{ SQLiteException -> 0x0213, all -> 0x0211 }
            r6 = 16
            long r6 = r3.getLong(r6)     // Catch:{ SQLiteException -> 0x0213, all -> 0x0211 }
            r4.mo17544h(r6)     // Catch:{ SQLiteException -> 0x0213, all -> 0x0211 }
            r6 = 17
            boolean r7 = r3.isNull(r6)     // Catch:{ SQLiteException -> 0x0213, all -> 0x0211 }
            if (r7 == 0) goto L_0x0182
            r6 = -2147483648(0xffffffff80000000, double:NaN)
            goto L_0x0187
        L_0x0182:
            int r6 = r3.getInt(r6)     // Catch:{ SQLiteException -> 0x0213, all -> 0x0211 }
            long r6 = (long) r6     // Catch:{ SQLiteException -> 0x0213, all -> 0x0211 }
        L_0x0187:
            r4.mo17528c(r6)     // Catch:{ SQLiteException -> 0x0213, all -> 0x0211 }
            r6 = 18
            java.lang.String r6 = r3.getString(r6)     // Catch:{ SQLiteException -> 0x0213, all -> 0x0211 }
            r4.mo17536e(r6)     // Catch:{ SQLiteException -> 0x0213, all -> 0x0211 }
            r6 = 19
            long r6 = r3.getLong(r6)     // Catch:{ SQLiteException -> 0x0213, all -> 0x0211 }
            r4.mo17557n(r6)     // Catch:{ SQLiteException -> 0x0213, all -> 0x0211 }
            r6 = 20
            long r6 = r3.getLong(r6)     // Catch:{ SQLiteException -> 0x0213, all -> 0x0211 }
            r4.mo17555m(r6)     // Catch:{ SQLiteException -> 0x0213, all -> 0x0211 }
            r6 = 21
            java.lang.String r6 = r3.getString(r6)     // Catch:{ SQLiteException -> 0x0213, all -> 0x0211 }
            r4.mo17545h(r6)     // Catch:{ SQLiteException -> 0x0213, all -> 0x0211 }
            r6 = 22
            boolean r7 = r3.isNull(r6)     // Catch:{ SQLiteException -> 0x0213, all -> 0x0211 }
            if (r7 == 0) goto L_0x01b9
            r6 = 0
            goto L_0x01bd
        L_0x01b9:
            long r6 = r3.getLong(r6)     // Catch:{ SQLiteException -> 0x0213, all -> 0x0211 }
        L_0x01bd:
            r4.mo17558o(r6)     // Catch:{ SQLiteException -> 0x0213, all -> 0x0211 }
            r6 = 23
            boolean r7 = r3.isNull(r6)     // Catch:{ SQLiteException -> 0x0213, all -> 0x0211 }
            if (r7 != 0) goto L_0x01d1
            int r6 = r3.getInt(r6)     // Catch:{ SQLiteException -> 0x0213, all -> 0x0211 }
            if (r6 == 0) goto L_0x01cf
            goto L_0x01d1
        L_0x01cf:
            r6 = r11
            goto L_0x01d2
        L_0x01d1:
            r6 = r12
        L_0x01d2:
            r4.mo17526b(r6)     // Catch:{ SQLiteException -> 0x0213, all -> 0x0211 }
            r6 = 24
            boolean r7 = r3.isNull(r6)     // Catch:{ SQLiteException -> 0x0213, all -> 0x0211 }
            if (r7 != 0) goto L_0x01e5
            int r6 = r3.getInt(r6)     // Catch:{ SQLiteException -> 0x0213, all -> 0x0211 }
            if (r6 == 0) goto L_0x01e4
            goto L_0x01e5
        L_0x01e4:
            r12 = r11
        L_0x01e5:
            r4.mo17530c(r12)     // Catch:{ SQLiteException -> 0x0213, all -> 0x0211 }
            r6 = 25
            java.lang.String r6 = r3.getString(r6)     // Catch:{ SQLiteException -> 0x0213, all -> 0x0211 }
            r4.mo17529c(r6)     // Catch:{ SQLiteException -> 0x0213, all -> 0x0211 }
            r4.mo17519a()     // Catch:{ SQLiteException -> 0x0213, all -> 0x0211 }
            boolean r6 = r3.moveToNext()     // Catch:{ SQLiteException -> 0x0213, all -> 0x0211 }
            if (r6 == 0) goto L_0x020b
            com.google.android.gms.measurement.internal.r r6 = r20.mo17158r()     // Catch:{ SQLiteException -> 0x0213, all -> 0x0211 }
            com.google.android.gms.measurement.internal.t r6 = r6.mo17761y_()     // Catch:{ SQLiteException -> 0x0213, all -> 0x0211 }
            java.lang.String r7 = "Got multiple records for app, expected one. appId"
            java.lang.Object r8 = com.google.android.gms.measurement.internal.C4893r.m21360a(r21)     // Catch:{ SQLiteException -> 0x0213, all -> 0x0211 }
            r6.mo17764a(r7, r8)     // Catch:{ SQLiteException -> 0x0213, all -> 0x0211 }
        L_0x020b:
            if (r3 == 0) goto L_0x0210
            r3.close()
        L_0x0210:
            return r4
        L_0x0211:
            r0 = move-exception
            goto L_0x0218
        L_0x0213:
            r0 = move-exception
            goto L_0x021d
        L_0x0215:
            r0 = move-exception
            r5 = r20
        L_0x0218:
            r1 = r0
            goto L_0x0245
        L_0x021a:
            r0 = move-exception
            r5 = r20
        L_0x021d:
            r4 = r3
            r3 = r0
            goto L_0x022b
        L_0x0220:
            r0 = move-exception
            r5 = r20
            r1 = r0
            r3 = r2
            goto L_0x0245
        L_0x0226:
            r0 = move-exception
            r5 = r20
            r3 = r0
            r4 = r2
        L_0x022b:
            com.google.android.gms.measurement.internal.r r6 = r20.mo17158r()     // Catch:{ all -> 0x0242 }
            com.google.android.gms.measurement.internal.t r6 = r6.mo17761y_()     // Catch:{ all -> 0x0242 }
            java.lang.String r7 = "Error querying app. appId"
            java.lang.Object r1 = com.google.android.gms.measurement.internal.C4893r.m21360a(r21)     // Catch:{ all -> 0x0242 }
            r6.mo17765a(r7, r1, r3)     // Catch:{ all -> 0x0242 }
            if (r4 == 0) goto L_0x0241
            r4.close()
        L_0x0241:
            return r2
        L_0x0242:
            r0 = move-exception
            r1 = r0
            r3 = r4
        L_0x0245:
            if (r3 == 0) goto L_0x024a
            r3.close()
        L_0x024a:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C4873ew.mo17693b(java.lang.String):com.google.android.gms.measurement.internal.en");
    }

    /* renamed from: a */
    public final void mo17685a(C4864en enVar) {
        C3513t.m12625a(enVar);
        mo17144d();
        mo17430k();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", enVar.mo17523b());
        contentValues.put("app_instance_id", enVar.mo17527c());
        contentValues.put("gmp_app_id", enVar.mo17531d());
        contentValues.put("resettable_device_id_hash", enVar.mo17537f());
        contentValues.put("last_bundle_index", Long.valueOf(enVar.mo17560p()));
        contentValues.put("last_bundle_start_timestamp", Long.valueOf(enVar.mo17543h()));
        contentValues.put("last_bundle_end_timestamp", Long.valueOf(enVar.mo17546i()));
        contentValues.put("app_version", enVar.mo17548j());
        contentValues.put("app_store", enVar.mo17552l());
        contentValues.put("gmp_version", Long.valueOf(enVar.mo17554m()));
        contentValues.put("dev_cert_hash", Long.valueOf(enVar.mo17556n()));
        contentValues.put("measurement_enabled", Boolean.valueOf(enVar.mo17559o()));
        contentValues.put(C1245d.f3954iW, Long.valueOf(enVar.mo17564t()));
        contentValues.put("daily_public_events_count", Long.valueOf(enVar.mo17565u()));
        contentValues.put("daily_events_count", Long.valueOf(enVar.mo17566v()));
        contentValues.put("daily_conversions_count", Long.valueOf(enVar.mo17567w()));
        contentValues.put("config_fetched_time", Long.valueOf(enVar.mo17561q()));
        contentValues.put("failed_config_fetch_time", Long.valueOf(enVar.mo17562r()));
        contentValues.put("app_version_int", Long.valueOf(enVar.mo17550k()));
        contentValues.put("firebase_instance_id", enVar.mo17540g());
        contentValues.put("daily_error_events_count", Long.valueOf(enVar.mo17569y()));
        contentValues.put("daily_realtime_events_count", Long.valueOf(enVar.mo17568x()));
        contentValues.put("health_monitor_sample", enVar.mo17570z());
        contentValues.put("android_id", Long.valueOf(enVar.mo17516B()));
        contentValues.put("adid_reporting_enabled", Boolean.valueOf(enVar.mo17517C()));
        contentValues.put("ssaid_reporting_enabled", Boolean.valueOf(enVar.mo17518D()));
        contentValues.put("admob_app_id", enVar.mo17534e());
        try {
            SQLiteDatabase y = mo17709y();
            if (((long) y.update("apps", contentValues, "app_id = ?", new String[]{enVar.mo17523b()})) == 0 && y.insertWithOnConflict("apps", null, contentValues, 5) == -1) {
                mo17158r().mo17761y_().mo17764a("Failed to insert/update app (got -1). appId", C4893r.m21360a(enVar.mo17523b()));
            }
        } catch (SQLiteException e) {
            mo17158r().mo17761y_().mo17765a("Error storing app. appId", C4893r.m21360a(enVar.mo17523b()), e);
        }
    }

    /* renamed from: c */
    public final long mo17696c(String str) {
        C3513t.m12627a(str);
        mo17144d();
        mo17430k();
        try {
            return (long) mo17709y().delete("raw_events", "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)", new String[]{str, String.valueOf(Math.max(0, Math.min(1000000, mo17160t().mo17640b(str, C4882h.f15926x))))});
        } catch (SQLiteException e) {
            mo17158r().mo17761y_().mo17765a("Error deleting over the limit events. appId", C4893r.m21360a(str), e);
            return 0;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x013b  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0144  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.measurement.internal.C4874ex mo17678a(long r22, java.lang.String r24, boolean r25, boolean r26, boolean r27, boolean r28, boolean r29) {
        /*
            r21 = this;
            com.google.android.gms.common.internal.C3513t.m12627a(r24)
            r21.mo17144d()
            r21.mo17430k()
            r2 = 1
            java.lang.String[] r3 = new java.lang.String[r2]
            r4 = 0
            r3[r4] = r24
            com.google.android.gms.measurement.internal.ex r5 = new com.google.android.gms.measurement.internal.ex
            r5.<init>()
            android.database.sqlite.SQLiteDatabase r15 = r21.mo17709y()     // Catch:{ SQLiteException -> 0x0125, all -> 0x0121 }
            java.lang.String r8 = "apps"
            r7 = 6
            java.lang.String[] r9 = new java.lang.String[r7]     // Catch:{ SQLiteException -> 0x0125, all -> 0x0121 }
            java.lang.String r7 = "day"
            r9[r4] = r7     // Catch:{ SQLiteException -> 0x0125, all -> 0x0121 }
            java.lang.String r7 = "daily_events_count"
            r9[r2] = r7     // Catch:{ SQLiteException -> 0x0125, all -> 0x0121 }
            java.lang.String r7 = "daily_public_events_count"
            r14 = 2
            r9[r14] = r7     // Catch:{ SQLiteException -> 0x0125, all -> 0x0121 }
            java.lang.String r7 = "daily_conversions_count"
            r13 = 3
            r9[r13] = r7     // Catch:{ SQLiteException -> 0x0125, all -> 0x0121 }
            java.lang.String r7 = "daily_error_events_count"
            r12 = 4
            r9[r12] = r7     // Catch:{ SQLiteException -> 0x0125, all -> 0x0121 }
            java.lang.String r7 = "daily_realtime_events_count"
            r11 = 5
            r9[r11] = r7     // Catch:{ SQLiteException -> 0x0125, all -> 0x0121 }
            java.lang.String r10 = "app_id=?"
            java.lang.String[] r7 = new java.lang.String[r2]     // Catch:{ SQLiteException -> 0x0125, all -> 0x0121 }
            r7[r4] = r24     // Catch:{ SQLiteException -> 0x0125, all -> 0x0121 }
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = r7
            r7 = r15
            r6 = r11
            r11 = r19
            r6 = r12
            r12 = r16
            r6 = r13
            r13 = r17
            r6 = r14
            r14 = r18
            android.database.Cursor r7 = r7.query(r8, r9, r10, r11, r12, r13, r14)     // Catch:{ SQLiteException -> 0x0125, all -> 0x0121 }
            boolean r8 = r7.moveToFirst()     // Catch:{ SQLiteException -> 0x011d, all -> 0x011a }
            if (r8 != 0) goto L_0x0075
            com.google.android.gms.measurement.internal.r r2 = r21.mo17158r()     // Catch:{ SQLiteException -> 0x011d, all -> 0x011a }
            com.google.android.gms.measurement.internal.t r2 = r2.mo17754i()     // Catch:{ SQLiteException -> 0x011d, all -> 0x011a }
            java.lang.String r3 = "Not updating daily counts, app is not known. appId"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C4893r.m21360a(r24)     // Catch:{ SQLiteException -> 0x011d, all -> 0x011a }
            r2.mo17764a(r3, r4)     // Catch:{ SQLiteException -> 0x011d, all -> 0x011a }
            if (r7 == 0) goto L_0x0074
            r7.close()
        L_0x0074:
            return r5
        L_0x0075:
            long r8 = r7.getLong(r4)     // Catch:{ SQLiteException -> 0x011d, all -> 0x011a }
            int r4 = (r8 > r22 ? 1 : (r8 == r22 ? 0 : -1))
            if (r4 != 0) goto L_0x009e
            long r8 = r7.getLong(r2)     // Catch:{ SQLiteException -> 0x011d, all -> 0x011a }
            r5.f15839b = r8     // Catch:{ SQLiteException -> 0x011d, all -> 0x011a }
            long r8 = r7.getLong(r6)     // Catch:{ SQLiteException -> 0x011d, all -> 0x011a }
            r5.f15838a = r8     // Catch:{ SQLiteException -> 0x011d, all -> 0x011a }
            r2 = 3
            long r8 = r7.getLong(r2)     // Catch:{ SQLiteException -> 0x011d, all -> 0x011a }
            r5.f15840c = r8     // Catch:{ SQLiteException -> 0x011d, all -> 0x011a }
            r2 = 4
            long r8 = r7.getLong(r2)     // Catch:{ SQLiteException -> 0x011d, all -> 0x011a }
            r5.f15841d = r8     // Catch:{ SQLiteException -> 0x011d, all -> 0x011a }
            r2 = 5
            long r8 = r7.getLong(r2)     // Catch:{ SQLiteException -> 0x011d, all -> 0x011a }
            r5.f15842e = r8     // Catch:{ SQLiteException -> 0x011d, all -> 0x011a }
        L_0x009e:
            r8 = 1
            if (r25 == 0) goto L_0x00a8
            long r12 = r5.f15839b     // Catch:{ SQLiteException -> 0x011d, all -> 0x011a }
            long r1 = r12 + r8
            r5.f15839b = r1     // Catch:{ SQLiteException -> 0x011d, all -> 0x011a }
        L_0x00a8:
            if (r26 == 0) goto L_0x00b0
            long r1 = r5.f15838a     // Catch:{ SQLiteException -> 0x011d, all -> 0x011a }
            long r12 = r1 + r8
            r5.f15838a = r12     // Catch:{ SQLiteException -> 0x011d, all -> 0x011a }
        L_0x00b0:
            if (r27 == 0) goto L_0x00b8
            long r1 = r5.f15840c     // Catch:{ SQLiteException -> 0x011d, all -> 0x011a }
            long r12 = r1 + r8
            r5.f15840c = r12     // Catch:{ SQLiteException -> 0x011d, all -> 0x011a }
        L_0x00b8:
            if (r28 == 0) goto L_0x00c0
            long r1 = r5.f15841d     // Catch:{ SQLiteException -> 0x011d, all -> 0x011a }
            long r12 = r1 + r8
            r5.f15841d = r12     // Catch:{ SQLiteException -> 0x011d, all -> 0x011a }
        L_0x00c0:
            if (r29 == 0) goto L_0x00c8
            long r1 = r5.f15842e     // Catch:{ SQLiteException -> 0x011d, all -> 0x011a }
            long r12 = r1 + r8
            r5.f15842e = r12     // Catch:{ SQLiteException -> 0x011d, all -> 0x011a }
        L_0x00c8:
            android.content.ContentValues r1 = new android.content.ContentValues     // Catch:{ SQLiteException -> 0x011d, all -> 0x011a }
            r1.<init>()     // Catch:{ SQLiteException -> 0x011d, all -> 0x011a }
            java.lang.String r2 = "day"
            java.lang.Long r4 = java.lang.Long.valueOf(r22)     // Catch:{ SQLiteException -> 0x011d, all -> 0x011a }
            r1.put(r2, r4)     // Catch:{ SQLiteException -> 0x011d, all -> 0x011a }
            java.lang.String r2 = "daily_public_events_count"
            long r8 = r5.f15838a     // Catch:{ SQLiteException -> 0x011d, all -> 0x011a }
            java.lang.Long r4 = java.lang.Long.valueOf(r8)     // Catch:{ SQLiteException -> 0x011d, all -> 0x011a }
            r1.put(r2, r4)     // Catch:{ SQLiteException -> 0x011d, all -> 0x011a }
            java.lang.String r2 = "daily_events_count"
            long r8 = r5.f15839b     // Catch:{ SQLiteException -> 0x011d, all -> 0x011a }
            java.lang.Long r4 = java.lang.Long.valueOf(r8)     // Catch:{ SQLiteException -> 0x011d, all -> 0x011a }
            r1.put(r2, r4)     // Catch:{ SQLiteException -> 0x011d, all -> 0x011a }
            java.lang.String r2 = "daily_conversions_count"
            long r8 = r5.f15840c     // Catch:{ SQLiteException -> 0x011d, all -> 0x011a }
            java.lang.Long r4 = java.lang.Long.valueOf(r8)     // Catch:{ SQLiteException -> 0x011d, all -> 0x011a }
            r1.put(r2, r4)     // Catch:{ SQLiteException -> 0x011d, all -> 0x011a }
            java.lang.String r2 = "daily_error_events_count"
            long r8 = r5.f15841d     // Catch:{ SQLiteException -> 0x011d, all -> 0x011a }
            java.lang.Long r4 = java.lang.Long.valueOf(r8)     // Catch:{ SQLiteException -> 0x011d, all -> 0x011a }
            r1.put(r2, r4)     // Catch:{ SQLiteException -> 0x011d, all -> 0x011a }
            java.lang.String r2 = "daily_realtime_events_count"
            long r8 = r5.f15842e     // Catch:{ SQLiteException -> 0x011d, all -> 0x011a }
            java.lang.Long r4 = java.lang.Long.valueOf(r8)     // Catch:{ SQLiteException -> 0x011d, all -> 0x011a }
            r1.put(r2, r4)     // Catch:{ SQLiteException -> 0x011d, all -> 0x011a }
            java.lang.String r2 = "apps"
            java.lang.String r4 = "app_id=?"
            r15.update(r2, r1, r4, r3)     // Catch:{ SQLiteException -> 0x011d, all -> 0x011a }
            if (r7 == 0) goto L_0x0119
            r7.close()
        L_0x0119:
            return r5
        L_0x011a:
            r0 = move-exception
            r1 = r0
            goto L_0x0142
        L_0x011d:
            r0 = move-exception
            r1 = r0
            r6 = r7
            goto L_0x0128
        L_0x0121:
            r0 = move-exception
            r1 = r0
            r7 = 0
            goto L_0x0142
        L_0x0125:
            r0 = move-exception
            r1 = r0
            r6 = 0
        L_0x0128:
            com.google.android.gms.measurement.internal.r r2 = r21.mo17158r()     // Catch:{ all -> 0x013f }
            com.google.android.gms.measurement.internal.t r2 = r2.mo17761y_()     // Catch:{ all -> 0x013f }
            java.lang.String r3 = "Error updating daily counts. appId"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C4893r.m21360a(r24)     // Catch:{ all -> 0x013f }
            r2.mo17765a(r3, r4, r1)     // Catch:{ all -> 0x013f }
            if (r6 == 0) goto L_0x013e
            r6.close()
        L_0x013e:
            return r5
        L_0x013f:
            r0 = move-exception
            r1 = r0
            r7 = r6
        L_0x0142:
            if (r7 == 0) goto L_0x0147
            r7.close()
        L_0x0147:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C4873ew.mo17678a(long, java.lang.String, boolean, boolean, boolean, boolean, boolean):com.google.android.gms.measurement.internal.ex");
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0079  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final byte[] mo17699d(java.lang.String r12) {
        /*
            r11 = this;
            com.google.android.gms.common.internal.C3513t.m12627a(r12)
            r11.mo17144d()
            r11.mo17430k()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r11.mo17709y()     // Catch:{ SQLiteException -> 0x005d, all -> 0x005a }
            java.lang.String r2 = "apps"
            r3 = 1
            java.lang.String[] r4 = new java.lang.String[r3]     // Catch:{ SQLiteException -> 0x005d, all -> 0x005a }
            java.lang.String r5 = "remote_config"
            r9 = 0
            r4[r9] = r5     // Catch:{ SQLiteException -> 0x005d, all -> 0x005a }
            java.lang.String r5 = "app_id=?"
            java.lang.String[] r6 = new java.lang.String[r3]     // Catch:{ SQLiteException -> 0x005d, all -> 0x005a }
            r6[r9] = r12     // Catch:{ SQLiteException -> 0x005d, all -> 0x005a }
            r7 = 0
            r8 = 0
            r10 = 0
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r8
            r8 = r10
            android.database.Cursor r1 = r1.query(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ SQLiteException -> 0x005d, all -> 0x005a }
            boolean r2 = r1.moveToFirst()     // Catch:{ SQLiteException -> 0x0058 }
            if (r2 != 0) goto L_0x0037
            if (r1 == 0) goto L_0x0036
            r1.close()
        L_0x0036:
            return r0
        L_0x0037:
            byte[] r2 = r1.getBlob(r9)     // Catch:{ SQLiteException -> 0x0058 }
            boolean r3 = r1.moveToNext()     // Catch:{ SQLiteException -> 0x0058 }
            if (r3 == 0) goto L_0x0052
            com.google.android.gms.measurement.internal.r r3 = r11.mo17158r()     // Catch:{ SQLiteException -> 0x0058 }
            com.google.android.gms.measurement.internal.t r3 = r3.mo17761y_()     // Catch:{ SQLiteException -> 0x0058 }
            java.lang.String r4 = "Got multiple records for app config, expected one. appId"
            java.lang.Object r5 = com.google.android.gms.measurement.internal.C4893r.m21360a(r12)     // Catch:{ SQLiteException -> 0x0058 }
            r3.mo17764a(r4, r5)     // Catch:{ SQLiteException -> 0x0058 }
        L_0x0052:
            if (r1 == 0) goto L_0x0057
            r1.close()
        L_0x0057:
            return r2
        L_0x0058:
            r2 = move-exception
            goto L_0x005f
        L_0x005a:
            r12 = move-exception
            r1 = r0
            goto L_0x0077
        L_0x005d:
            r2 = move-exception
            r1 = r0
        L_0x005f:
            com.google.android.gms.measurement.internal.r r3 = r11.mo17158r()     // Catch:{ all -> 0x0076 }
            com.google.android.gms.measurement.internal.t r3 = r3.mo17761y_()     // Catch:{ all -> 0x0076 }
            java.lang.String r4 = "Error querying remote config. appId"
            java.lang.Object r12 = com.google.android.gms.measurement.internal.C4893r.m21360a(r12)     // Catch:{ all -> 0x0076 }
            r3.mo17765a(r4, r12, r2)     // Catch:{ all -> 0x0076 }
            if (r1 == 0) goto L_0x0075
            r1.close()
        L_0x0075:
            return r0
        L_0x0076:
            r12 = move-exception
        L_0x0077:
            if (r1 == 0) goto L_0x007c
            r1.close()
        L_0x007c:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C4873ew.mo17699d(java.lang.String):byte[]");
    }

    /* renamed from: a */
    public final boolean mo17688a(C4651x xVar, boolean z) {
        mo17144d();
        mo17430k();
        C3513t.m12625a(xVar);
        C3513t.m12627a(xVar.f15194o);
        C3513t.m12625a(xVar.f15185f);
        mo17669B();
        long a = mo17153m().mo13694a();
        if (xVar.f15185f.longValue() < a - C4870et.m21096j() || xVar.f15185f.longValue() > a + C4870et.m21096j()) {
            mo17158r().mo17754i().mo17766a("Storing bundle outside of the max uploading time span. appId, now, timestamp", C4893r.m21360a(xVar.f15194o), Long.valueOf(a), xVar.f15185f);
        }
        try {
            byte[] bArr = new byte[xVar.mo16867e()];
            C4623gi a2 = C4623gi.m20047a(bArr, 0, bArr.length);
            xVar.mo16327a(a2);
            a2.mo16830a();
            byte[] b = mo17214g().mo17478b(bArr);
            mo17158r().mo17759x().mo17764a("Saving bundle, size", Integer.valueOf(b.length));
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", xVar.f15194o);
            contentValues.put("bundle_end_timestamp", xVar.f15185f);
            contentValues.put("data", b);
            contentValues.put("has_realtime", Integer.valueOf(z ? 1 : 0));
            if (xVar.f15172H != null) {
                contentValues.put("retry_count", xVar.f15172H);
            }
            try {
                if (mo17709y().insert("queue", null, contentValues) != -1) {
                    return true;
                }
                mo17158r().mo17761y_().mo17764a("Failed to insert bundle (got -1). appId", C4893r.m21360a(xVar.f15194o));
                return false;
            } catch (SQLiteException e) {
                mo17158r().mo17761y_().mo17765a("Error storing bundle. appId", C4893r.m21360a(xVar.f15194o), e);
                return false;
            }
        } catch (IOException e2) {
            mo17158r().mo17761y_().mo17765a("Data loss. Failed to serialize bundle. appId", C4893r.m21360a(xVar.f15194o), e2);
            return false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0041  */
    /* renamed from: z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo17710z() {
        /*
            r6 = this;
            android.database.sqlite.SQLiteDatabase r0 = r6.mo17709y()
            r1 = 0
            java.lang.String r2 = "select app_id from queue order by has_realtime desc, rowid asc limit 1;"
            android.database.Cursor r0 = r0.rawQuery(r2, r1)     // Catch:{ SQLiteException -> 0x0029, all -> 0x0024 }
            boolean r2 = r0.moveToFirst()     // Catch:{ SQLiteException -> 0x0022 }
            if (r2 == 0) goto L_0x001c
            r2 = 0
            java.lang.String r2 = r0.getString(r2)     // Catch:{ SQLiteException -> 0x0022 }
            if (r0 == 0) goto L_0x001b
            r0.close()
        L_0x001b:
            return r2
        L_0x001c:
            if (r0 == 0) goto L_0x0021
            r0.close()
        L_0x0021:
            return r1
        L_0x0022:
            r2 = move-exception
            goto L_0x002b
        L_0x0024:
            r0 = move-exception
            r5 = r1
            r1 = r0
            r0 = r5
            goto L_0x003f
        L_0x0029:
            r2 = move-exception
            r0 = r1
        L_0x002b:
            com.google.android.gms.measurement.internal.r r3 = r6.mo17158r()     // Catch:{ all -> 0x003e }
            com.google.android.gms.measurement.internal.t r3 = r3.mo17761y_()     // Catch:{ all -> 0x003e }
            java.lang.String r4 = "Database error getting next bundle app id"
            r3.mo17764a(r4, r2)     // Catch:{ all -> 0x003e }
            if (r0 == 0) goto L_0x003d
            r0.close()
        L_0x003d:
            return r1
        L_0x003e:
            r1 = move-exception
        L_0x003f:
            if (r0 == 0) goto L_0x0044
            r0.close()
        L_0x0044:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C4873ew.mo17710z():java.lang.String");
    }

    /* renamed from: A */
    public final boolean mo17668A() {
        return m21162b("select count(1) > 0 from queue where has_realtime = 1", (String[]) null) != 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:57:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00ff  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<android.util.Pair<com.google.android.gms.internal.p148e.C4651x, java.lang.Long>> mo17681a(java.lang.String r18, int r19, int r20) {
        /*
            r17 = this;
            r1 = r20
            r17.mo17144d()
            r17.mo17430k()
            r2 = 1
            r3 = 0
            if (r19 <= 0) goto L_0x000e
            r5 = r2
            goto L_0x000f
        L_0x000e:
            r5 = r3
        L_0x000f:
            com.google.android.gms.common.internal.C3513t.m12635b(r5)
            if (r1 <= 0) goto L_0x0016
            r5 = r2
            goto L_0x0017
        L_0x0016:
            r5 = r3
        L_0x0017:
            com.google.android.gms.common.internal.C3513t.m12635b(r5)
            com.google.android.gms.common.internal.C3513t.m12627a(r18)
            r5 = 0
            android.database.sqlite.SQLiteDatabase r6 = r17.mo17709y()     // Catch:{ SQLiteException -> 0x00e0 }
            java.lang.String r7 = "queue"
            r8 = 3
            java.lang.String[] r8 = new java.lang.String[r8]     // Catch:{ SQLiteException -> 0x00e0 }
            java.lang.String r9 = "rowid"
            r8[r3] = r9     // Catch:{ SQLiteException -> 0x00e0 }
            java.lang.String r9 = "data"
            r8[r2] = r9     // Catch:{ SQLiteException -> 0x00e0 }
            java.lang.String r9 = "retry_count"
            r15 = 2
            r8[r15] = r9     // Catch:{ SQLiteException -> 0x00e0 }
            java.lang.String r9 = "app_id=?"
            java.lang.String[] r10 = new java.lang.String[r2]     // Catch:{ SQLiteException -> 0x00e0 }
            r10[r3] = r18     // Catch:{ SQLiteException -> 0x00e0 }
            r11 = 0
            r12 = 0
            java.lang.String r13 = "rowid"
            java.lang.String r14 = java.lang.String.valueOf(r19)     // Catch:{ SQLiteException -> 0x00e0 }
            android.database.Cursor r4 = r6.query(r7, r8, r9, r10, r11, r12, r13, r14)     // Catch:{ SQLiteException -> 0x00e0 }
            boolean r5 = r4.moveToFirst()     // Catch:{ SQLiteException -> 0x00d8, all -> 0x00d5 }
            if (r5 != 0) goto L_0x0056
            java.util.List r1 = java.util.Collections.emptyList()     // Catch:{ SQLiteException -> 0x00d8, all -> 0x00d5 }
            if (r4 == 0) goto L_0x0055
            r4.close()
        L_0x0055:
            return r1
        L_0x0056:
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x00d8, all -> 0x00d5 }
            r5.<init>()     // Catch:{ SQLiteException -> 0x00d8, all -> 0x00d5 }
            r6 = r3
        L_0x005c:
            long r7 = r4.getLong(r3)     // Catch:{ SQLiteException -> 0x00d8, all -> 0x00d5 }
            byte[] r9 = r4.getBlob(r2)     // Catch:{ IOException -> 0x00b4 }
            com.google.android.gms.measurement.internal.ei r10 = r17.mo17214g()     // Catch:{ IOException -> 0x00b4 }
            byte[] r9 = r10.mo17476a(r9)     // Catch:{ IOException -> 0x00b4 }
            boolean r10 = r5.isEmpty()     // Catch:{ SQLiteException -> 0x00d8, all -> 0x00d5 }
            if (r10 != 0) goto L_0x0076
            int r10 = r9.length     // Catch:{ SQLiteException -> 0x00d8, all -> 0x00d5 }
            int r10 = r10 + r6
            if (r10 > r1) goto L_0x00cf
        L_0x0076:
            int r10 = r9.length     // Catch:{ SQLiteException -> 0x00d8, all -> 0x00d5 }
            com.google.android.gms.internal.e.gh r10 = com.google.android.gms.internal.p148e.C4622gh.m20018a(r9, r3, r10)     // Catch:{ SQLiteException -> 0x00d8, all -> 0x00d5 }
            com.google.android.gms.internal.e.x r11 = new com.google.android.gms.internal.e.x     // Catch:{ SQLiteException -> 0x00d8, all -> 0x00d5 }
            r11.<init>()     // Catch:{ SQLiteException -> 0x00d8, all -> 0x00d5 }
            r11.mo16326a(r10)     // Catch:{ IOException -> 0x00a1 }
            boolean r10 = r4.isNull(r15)     // Catch:{ SQLiteException -> 0x00d8, all -> 0x00d5 }
            if (r10 != 0) goto L_0x0093
            int r10 = r4.getInt(r15)     // Catch:{ SQLiteException -> 0x00d8, all -> 0x00d5 }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ SQLiteException -> 0x00d8, all -> 0x00d5 }
            r11.f15172H = r10     // Catch:{ SQLiteException -> 0x00d8, all -> 0x00d5 }
        L_0x0093:
            int r9 = r9.length     // Catch:{ SQLiteException -> 0x00d8, all -> 0x00d5 }
            int r6 = r6 + r9
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch:{ SQLiteException -> 0x00d8, all -> 0x00d5 }
            android.util.Pair r7 = android.util.Pair.create(r11, r7)     // Catch:{ SQLiteException -> 0x00d8, all -> 0x00d5 }
            r5.add(r7)     // Catch:{ SQLiteException -> 0x00d8, all -> 0x00d5 }
            goto L_0x00c7
        L_0x00a1:
            r0 = move-exception
            com.google.android.gms.measurement.internal.r r7 = r17.mo17158r()     // Catch:{ SQLiteException -> 0x00d8, all -> 0x00d5 }
            com.google.android.gms.measurement.internal.t r7 = r7.mo17761y_()     // Catch:{ SQLiteException -> 0x00d8, all -> 0x00d5 }
            java.lang.String r8 = "Failed to merge queued bundle. appId"
            java.lang.Object r9 = com.google.android.gms.measurement.internal.C4893r.m21360a(r18)     // Catch:{ SQLiteException -> 0x00d8, all -> 0x00d5 }
            r7.mo17765a(r8, r9, r0)     // Catch:{ SQLiteException -> 0x00d8, all -> 0x00d5 }
            goto L_0x00c7
        L_0x00b4:
            r0 = move-exception
            r7 = r0
            com.google.android.gms.measurement.internal.r r8 = r17.mo17158r()     // Catch:{ SQLiteException -> 0x00d8, all -> 0x00d5 }
            com.google.android.gms.measurement.internal.t r8 = r8.mo17761y_()     // Catch:{ SQLiteException -> 0x00d8, all -> 0x00d5 }
            java.lang.String r9 = "Failed to unzip queued bundle. appId"
            java.lang.Object r10 = com.google.android.gms.measurement.internal.C4893r.m21360a(r18)     // Catch:{ SQLiteException -> 0x00d8, all -> 0x00d5 }
            r8.mo17765a(r9, r10, r7)     // Catch:{ SQLiteException -> 0x00d8, all -> 0x00d5 }
        L_0x00c7:
            boolean r7 = r4.moveToNext()     // Catch:{ SQLiteException -> 0x00d8, all -> 0x00d5 }
            if (r7 == 0) goto L_0x00cf
            if (r6 <= r1) goto L_0x005c
        L_0x00cf:
            if (r4 == 0) goto L_0x00d4
            r4.close()
        L_0x00d4:
            return r5
        L_0x00d5:
            r0 = move-exception
            r1 = r0
            goto L_0x00fd
        L_0x00d8:
            r0 = move-exception
            r1 = r0
            r5 = r4
            goto L_0x00e2
        L_0x00dc:
            r0 = move-exception
            r1 = r0
            r4 = r5
            goto L_0x00fd
        L_0x00e0:
            r0 = move-exception
            r1 = r0
        L_0x00e2:
            com.google.android.gms.measurement.internal.r r2 = r17.mo17158r()     // Catch:{ all -> 0x00dc }
            com.google.android.gms.measurement.internal.t r2 = r2.mo17761y_()     // Catch:{ all -> 0x00dc }
            java.lang.String r3 = "Error querying bundles. appId"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C4893r.m21360a(r18)     // Catch:{ all -> 0x00dc }
            r2.mo17765a(r3, r4, r1)     // Catch:{ all -> 0x00dc }
            java.util.List r1 = java.util.Collections.emptyList()     // Catch:{ all -> 0x00dc }
            if (r5 == 0) goto L_0x00fc
            r5.close()
        L_0x00fc:
            return r1
        L_0x00fd:
            if (r4 == 0) goto L_0x0102
            r4.close()
        L_0x0102:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C4873ew.mo17681a(java.lang.String, int, int):java.util.List");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: B */
    public final void mo17669B() {
        mo17144d();
        mo17430k();
        if (m21154N()) {
            long a = mo17159s().f15389f.mo17188a();
            long b = mo17153m().mo13695b();
            if (Math.abs(b - a) > ((Long) C4882h.f15856G.mo17726b()).longValue()) {
                mo17159s().f15389f.mo17189a(b);
                mo17144d();
                mo17430k();
                if (m21154N()) {
                    int delete = mo17709y().delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[]{String.valueOf(mo17153m().mo13694a()), String.valueOf(C4870et.m21096j())});
                    if (delete > 0) {
                        mo17158r().mo17759x().mo17764a("Deleted stale rows. rowsDeleted", Integer.valueOf(delete));
                    }
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo17687a(List<Long> list) {
        mo17144d();
        mo17430k();
        C3513t.m12625a(list);
        C3513t.m12624a(list.size());
        if (m21154N()) {
            String join = TextUtils.join(",", list);
            StringBuilder sb = new StringBuilder(2 + String.valueOf(join).length());
            sb.append("(");
            sb.append(join);
            sb.append(")");
            String sb2 = sb.toString();
            StringBuilder sb3 = new StringBuilder(80 + String.valueOf(sb2).length());
            sb3.append("SELECT COUNT(1) FROM queue WHERE rowid IN ");
            sb3.append(sb2);
            sb3.append(" AND retry_count =  2147483647 LIMIT 1");
            if (m21162b(sb3.toString(), (String[]) null) > 0) {
                mo17158r().mo17754i().mo17763a("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                SQLiteDatabase y = mo17709y();
                StringBuilder sb4 = new StringBuilder(127 + String.valueOf(sb2).length());
                sb4.append("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN ");
                sb4.append(sb2);
                sb4.append(" AND (retry_count IS NULL OR retry_count < 2147483647)");
                y.execSQL(sb4.toString());
            } catch (SQLiteException e) {
                mo17158r().mo17761y_().mo17764a("Error incrementing retry count. error", e);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo17686a(String str, C4637j[] jVarArr) {
        boolean z;
        mo17430k();
        mo17144d();
        C3513t.m12627a(str);
        C3513t.m12625a(jVarArr);
        SQLiteDatabase y = mo17709y();
        y.beginTransaction();
        try {
            mo17430k();
            mo17144d();
            C3513t.m12627a(str);
            SQLiteDatabase y2 = mo17709y();
            y2.delete("property_filters", "app_id=?", new String[]{str});
            y2.delete("event_filters", "app_id=?", new String[]{str});
            for (C4637j jVar : jVarArr) {
                mo17430k();
                mo17144d();
                C3513t.m12627a(str);
                C3513t.m12625a(jVar);
                C3513t.m12625a(jVar.f15096c);
                C3513t.m12625a(jVar.f15095b);
                if (jVar.f15094a == null) {
                    mo17158r().mo17754i().mo17764a("Audience with no ID. appId", C4893r.m21360a(str));
                } else {
                    int intValue = jVar.f15094a.intValue();
                    C4638k[] kVarArr = jVar.f15096c;
                    int length = kVarArr.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            C4641n[] nVarArr = jVar.f15095b;
                            int length2 = nVarArr.length;
                            int i2 = 0;
                            while (true) {
                                if (i2 >= length2) {
                                    C4638k[] kVarArr2 = jVar.f15096c;
                                    int length3 = kVarArr2.length;
                                    int i3 = 0;
                                    while (true) {
                                        if (i3 >= length3) {
                                            z = true;
                                            break;
                                        } else if (!m21159a(str, intValue, kVarArr2[i3])) {
                                            z = false;
                                            break;
                                        } else {
                                            i3++;
                                        }
                                    }
                                    if (z) {
                                        C4641n[] nVarArr2 = jVar.f15095b;
                                        int length4 = nVarArr2.length;
                                        int i4 = 0;
                                        while (true) {
                                            if (i4 >= length4) {
                                                break;
                                            } else if (!m21160a(str, intValue, nVarArr2[i4])) {
                                                z = false;
                                                break;
                                            } else {
                                                i4++;
                                            }
                                        }
                                    }
                                    if (!z) {
                                        mo17430k();
                                        mo17144d();
                                        C3513t.m12627a(str);
                                        SQLiteDatabase y3 = mo17709y();
                                        y3.delete("property_filters", "app_id=? and audience_id=?", new String[]{str, String.valueOf(intValue)});
                                        y3.delete("event_filters", "app_id=? and audience_id=?", new String[]{str, String.valueOf(intValue)});
                                    }
                                } else if (nVarArr[i2].f15118a == null) {
                                    mo17158r().mo17754i().mo17765a("Property filter with no ID. Audience definition ignored. appId, audienceId", C4893r.m21360a(str), jVar.f15094a);
                                    break;
                                } else {
                                    i2++;
                                }
                            }
                        } else if (kVarArr[i].f15100a == null) {
                            mo17158r().mo17754i().mo17765a("Event filter with no ID. Audience definition ignored. appId, audienceId", C4893r.m21360a(str), jVar.f15094a);
                            break;
                        } else {
                            i++;
                        }
                    }
                }
            }
            ArrayList arrayList = new ArrayList();
            for (C4637j jVar2 : jVarArr) {
                arrayList.add(jVar2.f15094a);
            }
            m21161a(str, (List<Integer>) arrayList);
            y.setTransactionSuccessful();
        } finally {
            y.endTransaction();
        }
    }

    /* renamed from: a */
    private final boolean m21159a(String str, int i, C4638k kVar) {
        mo17430k();
        mo17144d();
        C3513t.m12627a(str);
        C3513t.m12625a(kVar);
        if (TextUtils.isEmpty(kVar.f15101b)) {
            mo17158r().mo17754i().mo17766a("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", C4893r.m21360a(str), Integer.valueOf(i), String.valueOf(kVar.f15100a));
            return false;
        }
        try {
            byte[] bArr = new byte[kVar.mo16867e()];
            C4623gi a = C4623gi.m20047a(bArr, 0, bArr.length);
            kVar.mo16327a(a);
            a.mo16830a();
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", str);
            contentValues.put("audience_id", Integer.valueOf(i));
            contentValues.put("filter_id", kVar.f15100a);
            contentValues.put("event_name", kVar.f15101b);
            contentValues.put("data", bArr);
            try {
                if (mo17709y().insertWithOnConflict("event_filters", null, contentValues, 5) == -1) {
                    mo17158r().mo17761y_().mo17764a("Failed to insert event filter (got -1). appId", C4893r.m21360a(str));
                }
                return true;
            } catch (SQLiteException e) {
                mo17158r().mo17761y_().mo17765a("Error storing event filter. appId", C4893r.m21360a(str), e);
                return false;
            }
        } catch (IOException e2) {
            mo17158r().mo17761y_().mo17765a("Configuration loss. Failed to serialize event filter. appId", C4893r.m21360a(str), e2);
            return false;
        }
    }

    /* renamed from: a */
    private final boolean m21160a(String str, int i, C4641n nVar) {
        mo17430k();
        mo17144d();
        C3513t.m12627a(str);
        C3513t.m12625a(nVar);
        if (TextUtils.isEmpty(nVar.f15119b)) {
            mo17158r().mo17754i().mo17766a("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", C4893r.m21360a(str), Integer.valueOf(i), String.valueOf(nVar.f15118a));
            return false;
        }
        try {
            byte[] bArr = new byte[nVar.mo16867e()];
            C4623gi a = C4623gi.m20047a(bArr, 0, bArr.length);
            nVar.mo16327a(a);
            a.mo16830a();
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", str);
            contentValues.put("audience_id", Integer.valueOf(i));
            contentValues.put("filter_id", nVar.f15118a);
            contentValues.put("property_name", nVar.f15119b);
            contentValues.put("data", bArr);
            try {
                if (mo17709y().insertWithOnConflict("property_filters", null, contentValues, 5) != -1) {
                    return true;
                }
                mo17158r().mo17761y_().mo17764a("Failed to insert property filter (got -1). appId", C4893r.m21360a(str));
                return false;
            } catch (SQLiteException e) {
                mo17158r().mo17761y_().mo17765a("Error storing property filter. appId", C4893r.m21360a(str), e);
                return false;
            }
        } catch (IOException e2) {
            mo17158r().mo17761y_().mo17765a("Configuration loss. Failed to serialize property filter. appId", C4893r.m21360a(str), e2);
            return false;
        }
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00b8  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Map<java.lang.Integer, java.util.List<com.google.android.gms.internal.p148e.C4638k>> mo17703f(java.lang.String r13, java.lang.String r14) {
        /*
            r12 = this;
            r12.mo17430k()
            r12.mo17144d()
            com.google.android.gms.common.internal.C3513t.m12627a(r13)
            com.google.android.gms.common.internal.C3513t.m12627a(r14)
            android.support.v4.d.a r0 = new android.support.v4.d.a
            r0.<init>()
            android.database.sqlite.SQLiteDatabase r1 = r12.mo17709y()
            r9 = 0
            java.lang.String r2 = "event_filters"
            r3 = 2
            java.lang.String[] r4 = new java.lang.String[r3]     // Catch:{ SQLiteException -> 0x009c, all -> 0x0099 }
            java.lang.String r5 = "audience_id"
            r10 = 0
            r4[r10] = r5     // Catch:{ SQLiteException -> 0x009c, all -> 0x0099 }
            java.lang.String r5 = "data"
            r11 = 1
            r4[r11] = r5     // Catch:{ SQLiteException -> 0x009c, all -> 0x0099 }
            java.lang.String r5 = "app_id=? AND event_name=?"
            java.lang.String[] r6 = new java.lang.String[r3]     // Catch:{ SQLiteException -> 0x009c, all -> 0x0099 }
            r6[r10] = r13     // Catch:{ SQLiteException -> 0x009c, all -> 0x0099 }
            r6[r11] = r14     // Catch:{ SQLiteException -> 0x009c, all -> 0x0099 }
            r14 = 0
            r7 = 0
            r8 = 0
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r14
            android.database.Cursor r14 = r1.query(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ SQLiteException -> 0x009c, all -> 0x0099 }
            boolean r1 = r14.moveToFirst()     // Catch:{ SQLiteException -> 0x0097 }
            if (r1 != 0) goto L_0x0048
            java.util.Map r0 = java.util.Collections.emptyMap()     // Catch:{ SQLiteException -> 0x0097 }
            if (r14 == 0) goto L_0x0047
            r14.close()
        L_0x0047:
            return r0
        L_0x0048:
            byte[] r1 = r14.getBlob(r11)     // Catch:{ SQLiteException -> 0x0097 }
            int r2 = r1.length     // Catch:{ SQLiteException -> 0x0097 }
            com.google.android.gms.internal.e.gh r1 = com.google.android.gms.internal.p148e.C4622gh.m20018a(r1, r10, r2)     // Catch:{ SQLiteException -> 0x0097 }
            com.google.android.gms.internal.e.k r2 = new com.google.android.gms.internal.e.k     // Catch:{ SQLiteException -> 0x0097 }
            r2.<init>()     // Catch:{ SQLiteException -> 0x0097 }
            r2.mo16326a(r1)     // Catch:{ IOException -> 0x0079 }
            int r1 = r14.getInt(r10)     // Catch:{ SQLiteException -> 0x0097 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)     // Catch:{ SQLiteException -> 0x0097 }
            java.lang.Object r3 = r0.get(r3)     // Catch:{ SQLiteException -> 0x0097 }
            java.util.List r3 = (java.util.List) r3     // Catch:{ SQLiteException -> 0x0097 }
            if (r3 != 0) goto L_0x0075
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x0097 }
            r3.<init>()     // Catch:{ SQLiteException -> 0x0097 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ SQLiteException -> 0x0097 }
            r0.put(r1, r3)     // Catch:{ SQLiteException -> 0x0097 }
        L_0x0075:
            r3.add(r2)     // Catch:{ SQLiteException -> 0x0097 }
            goto L_0x008b
        L_0x0079:
            r1 = move-exception
            com.google.android.gms.measurement.internal.r r2 = r12.mo17158r()     // Catch:{ SQLiteException -> 0x0097 }
            com.google.android.gms.measurement.internal.t r2 = r2.mo17761y_()     // Catch:{ SQLiteException -> 0x0097 }
            java.lang.String r3 = "Failed to merge filter. appId"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C4893r.m21360a(r13)     // Catch:{ SQLiteException -> 0x0097 }
            r2.mo17765a(r3, r4, r1)     // Catch:{ SQLiteException -> 0x0097 }
        L_0x008b:
            boolean r1 = r14.moveToNext()     // Catch:{ SQLiteException -> 0x0097 }
            if (r1 != 0) goto L_0x0048
            if (r14 == 0) goto L_0x0096
            r14.close()
        L_0x0096:
            return r0
        L_0x0097:
            r0 = move-exception
            goto L_0x009e
        L_0x0099:
            r13 = move-exception
            r14 = r9
            goto L_0x00b6
        L_0x009c:
            r0 = move-exception
            r14 = r9
        L_0x009e:
            com.google.android.gms.measurement.internal.r r1 = r12.mo17158r()     // Catch:{ all -> 0x00b5 }
            com.google.android.gms.measurement.internal.t r1 = r1.mo17761y_()     // Catch:{ all -> 0x00b5 }
            java.lang.String r2 = "Database error querying filters. appId"
            java.lang.Object r13 = com.google.android.gms.measurement.internal.C4893r.m21360a(r13)     // Catch:{ all -> 0x00b5 }
            r1.mo17765a(r2, r13, r0)     // Catch:{ all -> 0x00b5 }
            if (r14 == 0) goto L_0x00b4
            r14.close()
        L_0x00b4:
            return r9
        L_0x00b5:
            r13 = move-exception
        L_0x00b6:
            if (r14 == 0) goto L_0x00bb
            r14.close()
        L_0x00bb:
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C4873ew.mo17703f(java.lang.String, java.lang.String):java.util.Map");
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00b8  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Map<java.lang.Integer, java.util.List<com.google.android.gms.internal.p148e.C4641n>> mo17705g(java.lang.String r13, java.lang.String r14) {
        /*
            r12 = this;
            r12.mo17430k()
            r12.mo17144d()
            com.google.android.gms.common.internal.C3513t.m12627a(r13)
            com.google.android.gms.common.internal.C3513t.m12627a(r14)
            android.support.v4.d.a r0 = new android.support.v4.d.a
            r0.<init>()
            android.database.sqlite.SQLiteDatabase r1 = r12.mo17709y()
            r9 = 0
            java.lang.String r2 = "property_filters"
            r3 = 2
            java.lang.String[] r4 = new java.lang.String[r3]     // Catch:{ SQLiteException -> 0x009c, all -> 0x0099 }
            java.lang.String r5 = "audience_id"
            r10 = 0
            r4[r10] = r5     // Catch:{ SQLiteException -> 0x009c, all -> 0x0099 }
            java.lang.String r5 = "data"
            r11 = 1
            r4[r11] = r5     // Catch:{ SQLiteException -> 0x009c, all -> 0x0099 }
            java.lang.String r5 = "app_id=? AND property_name=?"
            java.lang.String[] r6 = new java.lang.String[r3]     // Catch:{ SQLiteException -> 0x009c, all -> 0x0099 }
            r6[r10] = r13     // Catch:{ SQLiteException -> 0x009c, all -> 0x0099 }
            r6[r11] = r14     // Catch:{ SQLiteException -> 0x009c, all -> 0x0099 }
            r14 = 0
            r7 = 0
            r8 = 0
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r14
            android.database.Cursor r14 = r1.query(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ SQLiteException -> 0x009c, all -> 0x0099 }
            boolean r1 = r14.moveToFirst()     // Catch:{ SQLiteException -> 0x0097 }
            if (r1 != 0) goto L_0x0048
            java.util.Map r0 = java.util.Collections.emptyMap()     // Catch:{ SQLiteException -> 0x0097 }
            if (r14 == 0) goto L_0x0047
            r14.close()
        L_0x0047:
            return r0
        L_0x0048:
            byte[] r1 = r14.getBlob(r11)     // Catch:{ SQLiteException -> 0x0097 }
            int r2 = r1.length     // Catch:{ SQLiteException -> 0x0097 }
            com.google.android.gms.internal.e.gh r1 = com.google.android.gms.internal.p148e.C4622gh.m20018a(r1, r10, r2)     // Catch:{ SQLiteException -> 0x0097 }
            com.google.android.gms.internal.e.n r2 = new com.google.android.gms.internal.e.n     // Catch:{ SQLiteException -> 0x0097 }
            r2.<init>()     // Catch:{ SQLiteException -> 0x0097 }
            r2.mo16326a(r1)     // Catch:{ IOException -> 0x0079 }
            int r1 = r14.getInt(r10)     // Catch:{ SQLiteException -> 0x0097 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)     // Catch:{ SQLiteException -> 0x0097 }
            java.lang.Object r3 = r0.get(r3)     // Catch:{ SQLiteException -> 0x0097 }
            java.util.List r3 = (java.util.List) r3     // Catch:{ SQLiteException -> 0x0097 }
            if (r3 != 0) goto L_0x0075
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x0097 }
            r3.<init>()     // Catch:{ SQLiteException -> 0x0097 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ SQLiteException -> 0x0097 }
            r0.put(r1, r3)     // Catch:{ SQLiteException -> 0x0097 }
        L_0x0075:
            r3.add(r2)     // Catch:{ SQLiteException -> 0x0097 }
            goto L_0x008b
        L_0x0079:
            r1 = move-exception
            com.google.android.gms.measurement.internal.r r2 = r12.mo17158r()     // Catch:{ SQLiteException -> 0x0097 }
            com.google.android.gms.measurement.internal.t r2 = r2.mo17761y_()     // Catch:{ SQLiteException -> 0x0097 }
            java.lang.String r3 = "Failed to merge filter"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C4893r.m21360a(r13)     // Catch:{ SQLiteException -> 0x0097 }
            r2.mo17765a(r3, r4, r1)     // Catch:{ SQLiteException -> 0x0097 }
        L_0x008b:
            boolean r1 = r14.moveToNext()     // Catch:{ SQLiteException -> 0x0097 }
            if (r1 != 0) goto L_0x0048
            if (r14 == 0) goto L_0x0096
            r14.close()
        L_0x0096:
            return r0
        L_0x0097:
            r0 = move-exception
            goto L_0x009e
        L_0x0099:
            r13 = move-exception
            r14 = r9
            goto L_0x00b6
        L_0x009c:
            r0 = move-exception
            r14 = r9
        L_0x009e:
            com.google.android.gms.measurement.internal.r r1 = r12.mo17158r()     // Catch:{ all -> 0x00b5 }
            com.google.android.gms.measurement.internal.t r1 = r1.mo17761y_()     // Catch:{ all -> 0x00b5 }
            java.lang.String r2 = "Database error querying filters. appId"
            java.lang.Object r13 = com.google.android.gms.measurement.internal.C4893r.m21360a(r13)     // Catch:{ all -> 0x00b5 }
            r1.mo17765a(r2, r13, r0)     // Catch:{ all -> 0x00b5 }
            if (r14 == 0) goto L_0x00b4
            r14.close()
        L_0x00b4:
            return r9
        L_0x00b5:
            r13 = move-exception
        L_0x00b6:
            if (r14 == 0) goto L_0x00bb
            r14.close()
        L_0x00bb:
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C4873ew.mo17705g(java.lang.String, java.lang.String):java.util.Map");
    }

    /* renamed from: a */
    private final boolean m21161a(String str, List<Integer> list) {
        C3513t.m12627a(str);
        mo17430k();
        mo17144d();
        SQLiteDatabase y = mo17709y();
        try {
            long b = m21162b("select count(1) from audience_filter_values where app_id=?", new String[]{str});
            int max = Math.max(0, Math.min(2000, mo17160t().mo17640b(str, C4882h.f15863N)));
            if (b <= ((long) max)) {
                return false;
            }
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < list.size(); i++) {
                Integer num = (Integer) list.get(i);
                if (num == null || !(num instanceof Integer)) {
                    return false;
                }
                arrayList.add(Integer.toString(num.intValue()));
            }
            String join = TextUtils.join(",", arrayList);
            StringBuilder sb = new StringBuilder(String.valueOf(join).length() + 2);
            sb.append("(");
            sb.append(join);
            sb.append(")");
            String sb2 = sb.toString();
            StringBuilder sb3 = new StringBuilder(140 + String.valueOf(sb2).length());
            sb3.append("audience_id in (select audience_id from audience_filter_values where app_id=? and audience_id not in ");
            sb3.append(sb2);
            sb3.append(" order by rowid desc limit -1 offset ?)");
            return y.delete("audience_filter_values", sb3.toString(), new String[]{str, Integer.toString(max)}) > 0;
        } catch (SQLiteException e) {
            mo17158r().mo17761y_().mo17765a("Database error querying filters. appId", C4893r.m21360a(str), e);
            return false;
        }
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x009b  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Map<java.lang.Integer, com.google.android.gms.internal.p148e.C4652y> mo17701e(java.lang.String r12) {
        /*
            r11 = this;
            r11.mo17430k()
            r11.mo17144d()
            com.google.android.gms.common.internal.C3513t.m12627a(r12)
            android.database.sqlite.SQLiteDatabase r0 = r11.mo17709y()
            r8 = 0
            java.lang.String r1 = "audience_filter_values"
            r2 = 2
            java.lang.String[] r2 = new java.lang.String[r2]     // Catch:{ SQLiteException -> 0x007f, all -> 0x007c }
            java.lang.String r3 = "audience_id"
            r9 = 0
            r2[r9] = r3     // Catch:{ SQLiteException -> 0x007f, all -> 0x007c }
            java.lang.String r3 = "current_results"
            r10 = 1
            r2[r10] = r3     // Catch:{ SQLiteException -> 0x007f, all -> 0x007c }
            java.lang.String r3 = "app_id=?"
            java.lang.String[] r4 = new java.lang.String[r10]     // Catch:{ SQLiteException -> 0x007f, all -> 0x007c }
            r4[r9] = r12     // Catch:{ SQLiteException -> 0x007f, all -> 0x007c }
            r5 = 0
            r6 = 0
            r7 = 0
            android.database.Cursor r0 = r0.query(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ SQLiteException -> 0x007f, all -> 0x007c }
            boolean r1 = r0.moveToFirst()     // Catch:{ SQLiteException -> 0x007a }
            if (r1 != 0) goto L_0x0036
            if (r0 == 0) goto L_0x0035
            r0.close()
        L_0x0035:
            return r8
        L_0x0036:
            android.support.v4.d.a r1 = new android.support.v4.d.a     // Catch:{ SQLiteException -> 0x007a }
            r1.<init>()     // Catch:{ SQLiteException -> 0x007a }
        L_0x003b:
            int r2 = r0.getInt(r9)     // Catch:{ SQLiteException -> 0x007a }
            byte[] r3 = r0.getBlob(r10)     // Catch:{ SQLiteException -> 0x007a }
            int r4 = r3.length     // Catch:{ SQLiteException -> 0x007a }
            com.google.android.gms.internal.e.gh r3 = com.google.android.gms.internal.p148e.C4622gh.m20018a(r3, r9, r4)     // Catch:{ SQLiteException -> 0x007a }
            com.google.android.gms.internal.e.y r4 = new com.google.android.gms.internal.e.y     // Catch:{ SQLiteException -> 0x007a }
            r4.<init>()     // Catch:{ SQLiteException -> 0x007a }
            r4.mo16326a(r3)     // Catch:{ IOException -> 0x0058 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ SQLiteException -> 0x007a }
            r1.put(r2, r4)     // Catch:{ SQLiteException -> 0x007a }
            goto L_0x006e
        L_0x0058:
            r3 = move-exception
            com.google.android.gms.measurement.internal.r r4 = r11.mo17158r()     // Catch:{ SQLiteException -> 0x007a }
            com.google.android.gms.measurement.internal.t r4 = r4.mo17761y_()     // Catch:{ SQLiteException -> 0x007a }
            java.lang.String r5 = "Failed to merge filter results. appId, audienceId, error"
            java.lang.Object r6 = com.google.android.gms.measurement.internal.C4893r.m21360a(r12)     // Catch:{ SQLiteException -> 0x007a }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ SQLiteException -> 0x007a }
            r4.mo17766a(r5, r6, r2, r3)     // Catch:{ SQLiteException -> 0x007a }
        L_0x006e:
            boolean r2 = r0.moveToNext()     // Catch:{ SQLiteException -> 0x007a }
            if (r2 != 0) goto L_0x003b
            if (r0 == 0) goto L_0x0079
            r0.close()
        L_0x0079:
            return r1
        L_0x007a:
            r1 = move-exception
            goto L_0x0081
        L_0x007c:
            r12 = move-exception
            r0 = r8
            goto L_0x0099
        L_0x007f:
            r1 = move-exception
            r0 = r8
        L_0x0081:
            com.google.android.gms.measurement.internal.r r2 = r11.mo17158r()     // Catch:{ all -> 0x0098 }
            com.google.android.gms.measurement.internal.t r2 = r2.mo17761y_()     // Catch:{ all -> 0x0098 }
            java.lang.String r3 = "Database error querying filter results. appId"
            java.lang.Object r12 = com.google.android.gms.measurement.internal.C4893r.m21360a(r12)     // Catch:{ all -> 0x0098 }
            r2.mo17765a(r3, r12, r1)     // Catch:{ all -> 0x0098 }
            if (r0 == 0) goto L_0x0097
            r0.close()
        L_0x0097:
            return r8
        L_0x0098:
            r12 = move-exception
        L_0x0099:
            if (r0 == 0) goto L_0x009e
            r0.close()
        L_0x009e:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C4873ew.mo17701e(java.lang.String):java.util.Map");
    }

    /* renamed from: a */
    private static void m21158a(ContentValues contentValues, String str, Object obj) {
        C3513t.m12627a(str);
        C3513t.m12625a(obj);
        if (obj instanceof String) {
            contentValues.put(str, (String) obj);
        } else if (obj instanceof Long) {
            contentValues.put(str, (Long) obj);
        } else if (obj instanceof Double) {
            contentValues.put(str, (Double) obj);
        } else {
            throw new IllegalArgumentException("Invalid value type");
        }
    }

    /* renamed from: a */
    private final Object m21157a(Cursor cursor, int i) {
        int type = cursor.getType(i);
        switch (type) {
            case 0:
                mo17158r().mo17761y_().mo17763a("Loaded invalid null value from database");
                return null;
            case 1:
                return Long.valueOf(cursor.getLong(i));
            case 2:
                return Double.valueOf(cursor.getDouble(i));
            case 3:
                return cursor.getString(i);
            case 4:
                mo17158r().mo17761y_().mo17763a("Loaded invalid blob type value, ignoring it");
                return null;
            default:
                mo17158r().mo17761y_().mo17764a("Loaded invalid unknown value type, ignoring it", Integer.valueOf(type));
                return null;
        }
    }

    /* renamed from: C */
    public final long mo17670C() {
        return m21155a("select max(bundle_end_timestamp) from queue", (String[]) null, 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final long mo17706h(String str, String str2) {
        long j;
        Object obj;
        String str3 = str;
        String str4 = str2;
        C3513t.m12627a(str);
        C3513t.m12627a(str2);
        mo17144d();
        mo17430k();
        SQLiteDatabase y = mo17709y();
        y.beginTransaction();
        try {
            StringBuilder sb = new StringBuilder(32 + String.valueOf(str2).length());
            sb.append("select ");
            sb.append(str4);
            sb.append(" from app2 where app_id=?");
            try {
                j = m21155a(sb.toString(), new String[]{str3}, -1);
                if (j == -1) {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("app_id", str3);
                    contentValues.put("first_open_count", Integer.valueOf(0));
                    contentValues.put("previous_install_count", Integer.valueOf(0));
                    if (y.insertWithOnConflict("app2", null, contentValues, 5) == -1) {
                        mo17158r().mo17761y_().mo17765a("Failed to insert column (got -1). appId", C4893r.m21360a(str), str4);
                        y.endTransaction();
                        return -1;
                    }
                    j = 0;
                }
            } catch (SQLiteException e) {
                e = e;
                obj = e;
                j = 0;
                try {
                    mo17158r().mo17761y_().mo17766a("Error inserting column. appId", C4893r.m21360a(str), str4, obj);
                    y.endTransaction();
                    return j;
                } catch (Throwable th) {
                    th = th;
                    Throwable th2 = th;
                    y.endTransaction();
                    throw th2;
                }
            }
            try {
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("app_id", str3);
                contentValues2.put(str4, Long.valueOf(j + 1));
                if (((long) y.update("app2", contentValues2, "app_id = ?", new String[]{str3})) == 0) {
                    mo17158r().mo17761y_().mo17765a("Failed to update column (got 0). appId", C4893r.m21360a(str), str4);
                    y.endTransaction();
                    return -1;
                }
                y.setTransactionSuccessful();
                y.endTransaction();
                return j;
            } catch (SQLiteException e2) {
                obj = e2;
                mo17158r().mo17761y_().mo17766a("Error inserting column. appId", C4893r.m21360a(str), str4, obj);
                y.endTransaction();
                return j;
            }
        } catch (SQLiteException e3) {
            e = e3;
            obj = e;
            j = 0;
            mo17158r().mo17761y_().mo17766a("Error inserting column. appId", C4893r.m21360a(str), str4, obj);
            y.endTransaction();
            return j;
        } catch (Throwable th3) {
            th = th3;
            Throwable th22 = th;
            y.endTransaction();
            throw th22;
        }
    }

    /* renamed from: D */
    public final long mo17671D() {
        return m21155a("select max(timestamp) from raw_events", (String[]) null, 0);
    }

    /* renamed from: a */
    public final long mo17675a(C4651x xVar) throws IOException {
        long j;
        mo17144d();
        mo17430k();
        C3513t.m12625a(xVar);
        C3513t.m12627a(xVar.f15194o);
        try {
            byte[] bArr = new byte[xVar.mo16867e()];
            C4623gi a = C4623gi.m20047a(bArr, 0, bArr.length);
            xVar.mo16327a(a);
            a.mo16830a();
            C4859ei g = mo17214g();
            C3513t.m12625a(bArr);
            g.mo17156p().mo17144d();
            MessageDigest i = C4862el.m20981i();
            if (i == null) {
                g.mo17158r().mo17761y_().mo17763a("Failed to get MD5");
                j = 0;
            } else {
                j = C4862el.m20961a(i.digest(bArr));
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", xVar.f15194o);
            contentValues.put("metadata_fingerprint", Long.valueOf(j));
            contentValues.put(TtmlNode.TAG_METADATA, bArr);
            try {
                mo17709y().insertWithOnConflict("raw_events_metadata", null, contentValues, 4);
                return j;
            } catch (SQLiteException e) {
                mo17158r().mo17761y_().mo17765a("Error storing raw event metadata. appId", C4893r.m21360a(xVar.f15194o), e);
                throw e;
            }
        } catch (IOException e2) {
            mo17158r().mo17761y_().mo17765a("Data loss. Failed to serialize event metadata. appId", C4893r.m21360a(xVar.f15194o), e2);
            throw e2;
        }
    }

    /* renamed from: E */
    public final boolean mo17672E() {
        return m21162b("select count(1) > 0 from raw_events", (String[]) null) != 0;
    }

    /* renamed from: F */
    public final boolean mo17673F() {
        return m21162b("select count(1) > 0 from raw_events where realtime = 1", (String[]) null) != 0;
    }

    /* renamed from: f */
    public final long mo17702f(String str) {
        C3513t.m12627a(str);
        return m21155a("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[]{str}, 0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x005b  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo17679a(long r5) {
        /*
            r4 = this;
            r4.mo17144d()
            r4.mo17430k()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r4.mo17709y()     // Catch:{ SQLiteException -> 0x0043, all -> 0x0040 }
            java.lang.String r2 = "select app_id from apps where app_id in (select distinct app_id from raw_events) and config_fetched_time < ? order by failed_config_fetch_time limit 1;"
            r3 = 1
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch:{ SQLiteException -> 0x0043, all -> 0x0040 }
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ SQLiteException -> 0x0043, all -> 0x0040 }
            r6 = 0
            r3[r6] = r5     // Catch:{ SQLiteException -> 0x0043, all -> 0x0040 }
            android.database.Cursor r5 = r1.rawQuery(r2, r3)     // Catch:{ SQLiteException -> 0x0043, all -> 0x0040 }
            boolean r1 = r5.moveToFirst()     // Catch:{ SQLiteException -> 0x003e }
            if (r1 != 0) goto L_0x0034
            com.google.android.gms.measurement.internal.r r6 = r4.mo17158r()     // Catch:{ SQLiteException -> 0x003e }
            com.google.android.gms.measurement.internal.t r6 = r6.mo17759x()     // Catch:{ SQLiteException -> 0x003e }
            java.lang.String r1 = "No expired configs for apps with pending events"
            r6.mo17763a(r1)     // Catch:{ SQLiteException -> 0x003e }
            if (r5 == 0) goto L_0x0033
            r5.close()
        L_0x0033:
            return r0
        L_0x0034:
            java.lang.String r6 = r5.getString(r6)     // Catch:{ SQLiteException -> 0x003e }
            if (r5 == 0) goto L_0x003d
            r5.close()
        L_0x003d:
            return r6
        L_0x003e:
            r6 = move-exception
            goto L_0x0045
        L_0x0040:
            r6 = move-exception
            r5 = r0
            goto L_0x0059
        L_0x0043:
            r6 = move-exception
            r5 = r0
        L_0x0045:
            com.google.android.gms.measurement.internal.r r1 = r4.mo17158r()     // Catch:{ all -> 0x0058 }
            com.google.android.gms.measurement.internal.t r1 = r1.mo17761y_()     // Catch:{ all -> 0x0058 }
            java.lang.String r2 = "Error selecting expired configs"
            r1.mo17764a(r2, r6)     // Catch:{ all -> 0x0058 }
            if (r5 == 0) goto L_0x0057
            r5.close()
        L_0x0057:
            return r0
        L_0x0058:
            r6 = move-exception
        L_0x0059:
            if (r5 == 0) goto L_0x005e
            r5.close()
        L_0x005e:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C4873ew.mo17679a(long):java.lang.String");
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0044  */
    /* renamed from: G */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long mo17674G() {
        /*
            r7 = this;
            r0 = -1
            r2 = 0
            android.database.sqlite.SQLiteDatabase r3 = r7.mo17709y()     // Catch:{ SQLiteException -> 0x002e }
            java.lang.String r4 = "select rowid from raw_events order by rowid desc limit 1;"
            android.database.Cursor r3 = r3.rawQuery(r4, r2)     // Catch:{ SQLiteException -> 0x002e }
            boolean r2 = r3.moveToFirst()     // Catch:{ SQLiteException -> 0x0027, all -> 0x0024 }
            if (r2 != 0) goto L_0x0019
            if (r3 == 0) goto L_0x0018
            r3.close()
        L_0x0018:
            return r0
        L_0x0019:
            r2 = 0
            long r4 = r3.getLong(r2)     // Catch:{ SQLiteException -> 0x0027, all -> 0x0024 }
            if (r3 == 0) goto L_0x0023
            r3.close()
        L_0x0023:
            return r4
        L_0x0024:
            r0 = move-exception
            r2 = r3
            goto L_0x0042
        L_0x0027:
            r2 = move-exception
            r6 = r3
            r3 = r2
            r2 = r6
            goto L_0x002f
        L_0x002c:
            r0 = move-exception
            goto L_0x0042
        L_0x002e:
            r3 = move-exception
        L_0x002f:
            com.google.android.gms.measurement.internal.r r4 = r7.mo17158r()     // Catch:{ all -> 0x002c }
            com.google.android.gms.measurement.internal.t r4 = r4.mo17761y_()     // Catch:{ all -> 0x002c }
            java.lang.String r5 = "Error querying raw events"
            r4.mo17764a(r5, r3)     // Catch:{ all -> 0x002c }
            if (r2 == 0) goto L_0x0041
            r2.close()
        L_0x0041:
            return r0
        L_0x0042:
            if (r2 == 0) goto L_0x0047
            r2.close()
        L_0x0047:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C4873ew.mo17674G():long");
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x008f  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.util.Pair<com.google.android.gms.internal.p148e.C4648u, java.lang.Long> mo17676a(java.lang.String r8, java.lang.Long r9) {
        /*
            r7 = this;
            r7.mo17144d()
            r7.mo17430k()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r7.mo17709y()     // Catch:{ SQLiteException -> 0x0077, all -> 0x0074 }
            java.lang.String r2 = "select main_event, children_to_process from main_event_params where app_id=? and event_id=?"
            r3 = 2
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch:{ SQLiteException -> 0x0077, all -> 0x0074 }
            r4 = 0
            r3[r4] = r8     // Catch:{ SQLiteException -> 0x0077, all -> 0x0074 }
            java.lang.String r5 = java.lang.String.valueOf(r9)     // Catch:{ SQLiteException -> 0x0077, all -> 0x0074 }
            r6 = 1
            r3[r6] = r5     // Catch:{ SQLiteException -> 0x0077, all -> 0x0074 }
            android.database.Cursor r1 = r1.rawQuery(r2, r3)     // Catch:{ SQLiteException -> 0x0077, all -> 0x0074 }
            boolean r2 = r1.moveToFirst()     // Catch:{ SQLiteException -> 0x0072 }
            if (r2 != 0) goto L_0x0037
            com.google.android.gms.measurement.internal.r r8 = r7.mo17158r()     // Catch:{ SQLiteException -> 0x0072 }
            com.google.android.gms.measurement.internal.t r8 = r8.mo17759x()     // Catch:{ SQLiteException -> 0x0072 }
            java.lang.String r9 = "Main event not found"
            r8.mo17763a(r9)     // Catch:{ SQLiteException -> 0x0072 }
            if (r1 == 0) goto L_0x0036
            r1.close()
        L_0x0036:
            return r0
        L_0x0037:
            byte[] r2 = r1.getBlob(r4)     // Catch:{ SQLiteException -> 0x0072 }
            long r5 = r1.getLong(r6)     // Catch:{ SQLiteException -> 0x0072 }
            java.lang.Long r3 = java.lang.Long.valueOf(r5)     // Catch:{ SQLiteException -> 0x0072 }
            int r5 = r2.length     // Catch:{ SQLiteException -> 0x0072 }
            com.google.android.gms.internal.e.gh r2 = com.google.android.gms.internal.p148e.C4622gh.m20018a(r2, r4, r5)     // Catch:{ SQLiteException -> 0x0072 }
            com.google.android.gms.internal.e.u r4 = new com.google.android.gms.internal.e.u     // Catch:{ SQLiteException -> 0x0072 }
            r4.<init>()     // Catch:{ SQLiteException -> 0x0072 }
            r4.mo16326a(r2)     // Catch:{ IOException -> 0x005a }
            android.util.Pair r8 = android.util.Pair.create(r4, r3)     // Catch:{ SQLiteException -> 0x0072 }
            if (r1 == 0) goto L_0x0059
            r1.close()
        L_0x0059:
            return r8
        L_0x005a:
            r2 = move-exception
            com.google.android.gms.measurement.internal.r r3 = r7.mo17158r()     // Catch:{ SQLiteException -> 0x0072 }
            com.google.android.gms.measurement.internal.t r3 = r3.mo17761y_()     // Catch:{ SQLiteException -> 0x0072 }
            java.lang.String r4 = "Failed to merge main event. appId, eventId"
            java.lang.Object r8 = com.google.android.gms.measurement.internal.C4893r.m21360a(r8)     // Catch:{ SQLiteException -> 0x0072 }
            r3.mo17766a(r4, r8, r9, r2)     // Catch:{ SQLiteException -> 0x0072 }
            if (r1 == 0) goto L_0x0071
            r1.close()
        L_0x0071:
            return r0
        L_0x0072:
            r8 = move-exception
            goto L_0x0079
        L_0x0074:
            r8 = move-exception
            r1 = r0
            goto L_0x008d
        L_0x0077:
            r8 = move-exception
            r1 = r0
        L_0x0079:
            com.google.android.gms.measurement.internal.r r9 = r7.mo17158r()     // Catch:{ all -> 0x008c }
            com.google.android.gms.measurement.internal.t r9 = r9.mo17761y_()     // Catch:{ all -> 0x008c }
            java.lang.String r2 = "Error selecting main event"
            r9.mo17764a(r2, r8)     // Catch:{ all -> 0x008c }
            if (r1 == 0) goto L_0x008b
            r1.close()
        L_0x008b:
            return r0
        L_0x008c:
            r8 = move-exception
        L_0x008d:
            if (r1 == 0) goto L_0x0092
            r1.close()
        L_0x0092:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C4873ew.mo17676a(java.lang.String, java.lang.Long):android.util.Pair");
    }

    /* renamed from: a */
    public final boolean mo17692a(String str, Long l, long j, C4648u uVar) {
        mo17144d();
        mo17430k();
        C3513t.m12625a(uVar);
        C3513t.m12627a(str);
        C3513t.m12625a(l);
        try {
            byte[] bArr = new byte[uVar.mo16867e()];
            C4623gi a = C4623gi.m20047a(bArr, 0, bArr.length);
            uVar.mo16327a(a);
            a.mo16830a();
            mo17158r().mo17759x().mo17765a("Saving complex main event, appId, data size", mo17155o().mo17746a(str), Integer.valueOf(bArr.length));
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", str);
            contentValues.put("event_id", l);
            contentValues.put("children_to_process", Long.valueOf(j));
            contentValues.put("main_event", bArr);
            try {
                if (mo17709y().insertWithOnConflict("main_event_params", null, contentValues, 5) != -1) {
                    return true;
                }
                mo17158r().mo17761y_().mo17764a("Failed to insert complex main event (got -1). appId", C4893r.m21360a(str));
                return false;
            } catch (SQLiteException e) {
                mo17158r().mo17761y_().mo17765a("Error storing complex main event. appId", C4893r.m21360a(str), e);
                return false;
            }
        } catch (IOException e2) {
            mo17158r().mo17761y_().mo17766a("Data loss. Failed to serialize event params/data. appId, eventId", C4893r.m21360a(str), l, e2);
            return false;
        }
    }

    /* renamed from: a */
    public final boolean mo17689a(C4795c cVar, long j, boolean z) {
        mo17144d();
        mo17430k();
        C3513t.m12625a(cVar);
        C3513t.m12627a(cVar.f15572a);
        C4648u uVar = new C4648u();
        uVar.f15155d = Long.valueOf(cVar.f15575d);
        uVar.f15152a = new C4649v[cVar.f15576e.mo17771a()];
        Iterator it = cVar.f15576e.iterator();
        int i = 0;
        while (it.hasNext()) {
            String str = (String) it.next();
            C4649v vVar = new C4649v();
            int i2 = i + 1;
            uVar.f15152a[i] = vVar;
            vVar.f15158a = str;
            mo17214g().mo17472a(vVar, cVar.f15576e.mo17772a(str));
            i = i2;
        }
        try {
            byte[] bArr = new byte[uVar.mo16867e()];
            C4623gi a = C4623gi.m20047a(bArr, 0, bArr.length);
            uVar.mo16327a(a);
            a.mo16830a();
            mo17158r().mo17759x().mo17765a("Saving event, name, data size", mo17155o().mo17746a(cVar.f15573b), Integer.valueOf(bArr.length));
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", cVar.f15572a);
            contentValues.put("name", cVar.f15573b);
            contentValues.put("timestamp", Long.valueOf(cVar.f15574c));
            contentValues.put("metadata_fingerprint", Long.valueOf(j));
            contentValues.put("data", bArr);
            contentValues.put("realtime", Integer.valueOf(z ? 1 : 0));
            try {
                if (mo17709y().insert("raw_events", null, contentValues) != -1) {
                    return true;
                }
                mo17158r().mo17761y_().mo17764a("Failed to insert raw event (got -1). appId", C4893r.m21360a(cVar.f15572a));
                return false;
            } catch (SQLiteException e) {
                mo17158r().mo17761y_().mo17765a("Error storing raw event. appId", C4893r.m21360a(cVar.f15572a), e);
                return false;
            }
        } catch (IOException e2) {
            mo17158r().mo17761y_().mo17765a("Data loss. Failed to serialize event params/data. appId", C4893r.m21360a(cVar.f15572a), e2);
            return false;
        }
    }

    /* renamed from: N */
    private final boolean m21154N() {
        return mo17154n().getDatabasePath("google_app_measurement.db").exists();
    }
}
