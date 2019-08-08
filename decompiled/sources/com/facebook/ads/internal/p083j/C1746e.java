package com.facebook.ads.internal.p083j;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.text.TextUtils;
import com.facebook.ads.internal.p091r.C1795a;
import com.facebook.ads.internal.p115w.p121f.C2362a;
import java.util.Locale;

/* renamed from: com.facebook.ads.internal.j.e */
public class C1746e extends SQLiteOpenHelper {

    /* renamed from: a */
    public static final String f5472a = "e";

    /* renamed from: b */
    private final C1743d f5473b;

    public C1746e(Context context, C1743d dVar) {
        String format = String.format(Locale.US, "ads%s.db", new Object[]{""});
        if (C1795a.m7423Q(context)) {
            String packageName = context.getPackageName();
            String a = C2362a.m9137a(context);
            if (!packageName.equals(a) && !TextUtils.isEmpty(a)) {
                StringBuilder sb = new StringBuilder();
                sb.append('_');
                sb.append(a);
                format = String.format(Locale.US, "ads%s.db", new Object[]{sb.toString()});
            }
        }
        super(context, format, null, 4);
        if (dVar == null) {
            throw new IllegalArgumentException("AdDatabaseHelper can not be null");
        }
        this.f5473b = dVar;
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        for (C1749g a : this.f5473b.mo7543c()) {
            a.mo7562a(sQLiteDatabase);
        }
    }

    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        C1749g[] c;
        for (C1749g gVar : this.f5473b.mo7543c()) {
            gVar.mo7563b(sQLiteDatabase);
            gVar.mo7562a(sQLiteDatabase);
        }
    }

    public void onOpen(SQLiteDatabase sQLiteDatabase) {
        super.onOpen(sQLiteDatabase);
        if (!sQLiteDatabase.isReadOnly()) {
            sQLiteDatabase.execSQL("PRAGMA foreign_keys = ON;");
        }
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if (i == 2 && i2 >= 3) {
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS crashes");
        }
        if (i <= 3 && i2 >= 4) {
            C1741b bVar = C1742c.f5449i;
            StringBuilder sb = new StringBuilder();
            sb.append("ALTER TABLE events ADD COLUMN ");
            sb.append(bVar.f5439b);
            sb.append(" ");
            sb.append(bVar.f5440c);
            sb.append(" DEFAULT 0");
            sQLiteDatabase.execSQL(sb.toString());
        }
    }
}
