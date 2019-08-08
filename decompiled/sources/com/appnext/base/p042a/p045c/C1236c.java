package com.appnext.base.p042a.p045c;

import android.content.ContentValues;
import android.database.Cursor;
import android.text.TextUtils;
import com.appnext.base.p042a.p044b.C1231c;
import com.appnext.base.p042a.p044b.C1232d;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.appnext.base.a.c.c */
public final class C1236c extends C1238e<C1231c> {
    private static final String COLUMN_STATUS = "status";

    /* renamed from: gK */
    public static final String f3915gK = "config_table";

    /* renamed from: gN */
    public static final String f3916gN = "key";

    /* renamed from: gO */
    private static final String f3917gO = "sample";

    /* renamed from: gP */
    private static final String f3918gP = "sample_type";

    /* renamed from: gQ */
    private static final String f3919gQ = "cycle";

    /* renamed from: gR */
    private static final String f3920gR = "cycle_type";

    /* renamed from: gS */
    private static final String f3921gS = "service_key";

    /* renamed from: gT */
    private static final String f3922gT = "data";

    /* renamed from: gM */
    private String[] f3923gM = {"key", "status", "sample", "sample_type", "cycle", "cycle_type", "service_key", "data"};

    /* renamed from: bl */
    public static String m5204bl() {
        return "create table config_table ( key text primary key, status text not null default 'off', sample text not null default '1', sample_type text not null default '',cycle text not null default '1', cycle_type text not null default 'once', service_key text not null default '', data text not null default '')";
    }

    /* renamed from: b */
    public final long mo5930b(JSONArray jSONArray) {
        return super.mo5945a(f3915gK, jSONArray);
    }

    /* renamed from: a */
    public final long mo5927a(JSONObject jSONObject) {
        return super.mo5946a(f3915gK, jSONObject);
    }

    /* renamed from: a */
    public final long mo5926a(C1231c cVar) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("status", cVar.mo5905bb());
        contentValues.put("sample", cVar.mo5906bc());
        contentValues.put("sample_type", cVar.mo5907bd());
        contentValues.put("cycle", cVar.mo5908be());
        contentValues.put("cycle_type", cVar.mo5909bf());
        contentValues.put("key", cVar.getKey());
        contentValues.put("service_key", cVar.mo5910bg());
        JSONObject bh = cVar.mo5911bh();
        if (bh != null) {
            contentValues.put("data", bh.toString());
        }
        return C1238e.m5235b(f3915gK, contentValues);
    }

    public final void delete() {
        super.delete(f3915gK);
    }

    /* renamed from: ab */
    public final void mo5928ab(String str) {
        if (!TextUtils.isEmpty(str)) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(C1239a.Equals);
            super.mo5944a(f3915gK, new String[]{"key"}, new String[]{str}, arrayList);
        }
    }

    /* renamed from: bm */
    public final List<C1231c> mo5931bm() {
        return super.mo5948ah(f3915gK);
    }

    /* renamed from: ac */
    public final C1231c mo5929ac(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(C1239a.Equals);
        List a = super.mo5947a(f3915gK, new String[]{"key"}, new String[]{str}, null, arrayList);
        if (a == null || a.size() <= 0) {
            return null;
        }
        return (C1231c) a.get(0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: bn */
    public final String[] mo5924bn() {
        return this.f3923gM;
    }

    /* renamed from: c */
    protected static C1231c m5205c(Cursor cursor) {
        C1231c cVar = new C1231c(cursor.getString(cursor.getColumnIndex("status")), cursor.getString(cursor.getColumnIndex("sample")), cursor.getString(cursor.getColumnIndex("sample_type")), cursor.getString(cursor.getColumnIndex("cycle")), cursor.getString(cursor.getColumnIndex("cycle_type")), cursor.getString(cursor.getColumnIndex("key")), cursor.getString(cursor.getColumnIndex("service_key")), cursor.getString(cursor.getColumnIndex("data")));
        return cVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C1232d mo5922b(Cursor cursor) {
        C1231c cVar = new C1231c(cursor.getString(cursor.getColumnIndex("status")), cursor.getString(cursor.getColumnIndex("sample")), cursor.getString(cursor.getColumnIndex("sample_type")), cursor.getString(cursor.getColumnIndex("cycle")), cursor.getString(cursor.getColumnIndex("cycle_type")), cursor.getString(cursor.getColumnIndex("key")), cursor.getString(cursor.getColumnIndex("service_key")), cursor.getString(cursor.getColumnIndex("data")));
        return cVar;
    }
}
