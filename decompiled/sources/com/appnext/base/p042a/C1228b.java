package com.appnext.base.p042a;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.appnext.base.p042a.p045c.C1235b;
import com.appnext.base.p042a.p045c.C1240f;

/* renamed from: com.appnext.base.a.b */
public class C1228b extends SQLiteOpenHelper {

    /* renamed from: gl */
    private static final String f3891gl = "appnext_dbs472";

    /* renamed from: gm */
    private static final int f3892gm = 12;

    /* renamed from: gn */
    private static volatile C1228b f3893gn;

    /* renamed from: f */
    public static C1228b m5172f(Context context) {
        if (f3893gn == null) {
            synchronized (C1228b.class) {
                if (f3893gn == null) {
                    f3893gn = new C1228b(context.getApplicationContext());
                }
            }
        }
        return f3893gn;
    }

    private C1228b(Context context) {
        super(context, f3891gl, null, 12);
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        try {
            sQLiteDatabase.execSQL("create table ct ( p text, c integer)");
            sQLiteDatabase.execSQL(C1235b.m5203bl());
            sQLiteDatabase.execSQL(C1240f.m5248bl());
            sQLiteDatabase.execSQL("create table config_table ( key text primary key, status text not null default 'off', sample text not null default '1', sample_type text not null default '',cycle text not null default '1', cycle_type text not null default 'once', service_key text not null default '', data text not null default '')");
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public final void mo5892a(SQLiteDatabase sQLiteDatabase) {
        try {
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS ct");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS collected_data_table");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS offline_data_table");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS config_table");
            onCreate(sQLiteDatabase);
        } catch (Throwable unused) {
        }
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        try {
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS ct");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS collected_data_table");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS offline_data_table");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS config_table");
            onCreate(sQLiteDatabase);
        } catch (Throwable unused) {
        }
    }
}
