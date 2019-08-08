package com.appnext.base.p042a.p045c;

import android.content.ContentValues;
import android.database.Cursor;
import com.appnext.base.p042a.p044b.C1229a;
import com.appnext.base.p042a.p044b.C1232d;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;

/* renamed from: com.appnext.base.a.c.a */
public final class C1234a extends C1238e<C1229a> {
    private static final String COLUMN_PACKAGE_NAME = "p";

    /* renamed from: gK */
    public static final String f3911gK = "ct";

    /* renamed from: gL */
    private static final String f3912gL = "c";

    /* renamed from: gM */
    private String[] f3913gM = {"p", f3912gL};

    /* renamed from: bl */
    public static String m5195bl() {
        return "create table ct ( p text, c integer)";
    }

    /* renamed from: a */
    public final long mo5920a(JSONArray jSONArray) {
        return super.mo5945a(f3911gK, jSONArray);
    }

    public final void delete() {
        super.delete(f3911gK);
    }

    /* renamed from: Z */
    public final void mo5918Z(String str) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(C1239a.Equals);
        super.mo5944a(f3911gK, new String[]{"p"}, new String[]{str}, arrayList);
    }

    /* renamed from: bm */
    public final List<C1229a> mo5923bm() {
        return super.mo5948ah(f3911gK);
    }

    /* renamed from: aa */
    public final List<C1229a> mo5921aa(String str) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(C1239a.Equals);
        return super.mo5947a(f3911gK, new String[]{"p"}, new String[]{str}, null, arrayList);
    }

    /* renamed from: b */
    private static ContentValues m5194b(C1229a aVar) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("p", aVar.getPackageName());
        contentValues.put(f3912gL, aVar.mo5895aX());
        return contentValues;
    }

    /* access modifiers changed from: protected */
    /* renamed from: bn */
    public final String[] mo5924bn() {
        return this.f3913gM;
    }

    /* renamed from: a */
    protected static C1229a m5193a(Cursor cursor) {
        return new C1229a(cursor.getString(cursor.getColumnIndex("p")), Integer.valueOf(cursor.getInt(cursor.getColumnIndex(f3912gL))));
    }

    /* renamed from: a */
    public final long mo5919a(C1229a aVar) {
        String str = f3911gK;
        ContentValues contentValues = new ContentValues();
        contentValues.put("p", aVar.getPackageName());
        contentValues.put(f3912gL, aVar.mo5895aX());
        return C1238e.m5231a(str, contentValues);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C1232d mo5922b(Cursor cursor) {
        return new C1229a(cursor.getString(cursor.getColumnIndex("p")), Integer.valueOf(cursor.getInt(cursor.getColumnIndex(f3912gL))));
    }
}
