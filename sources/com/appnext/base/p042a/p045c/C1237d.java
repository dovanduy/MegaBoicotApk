package com.appnext.base.p042a.p045c;

import android.content.ContentValues;
import android.database.Cursor;
import com.appnext.base.p042a.p044b.C1230b;
import com.appnext.base.p042a.p044b.C1232d;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.ListIterator;
import org.json.JSONArray;

/* renamed from: com.appnext.base.a.c.d */
public class C1237d extends C1238e<C1230b> {
    public static final String COLUMN_TYPE = "t";

    /* renamed from: gU */
    public static final String f3924gU = "pk";

    /* renamed from: gV */
    public static final String f3925gV = "cd";

    /* renamed from: gW */
    public static final String f3926gW = "cdd";

    /* renamed from: gX */
    public static final String f3927gX = "cdt";

    /* renamed from: gM */
    private String[] f3928gM = {f3924gU, COLUMN_TYPE, f3925gV, f3926gW, f3927gX};

    /* renamed from: gY */
    private String f3929gY;

    /* renamed from: c */
    private static String m5216c(boolean z) {
        return z ? "primary key" : "";
    }

    public C1237d(String str) {
        this.f3929gY = str;
    }

    /* renamed from: a */
    public final long mo5933a(C1230b bVar) {
        return C1238e.m5231a(this.f3929gY, m5215c(bVar));
    }

    /* renamed from: a */
    public long mo5934a(JSONArray jSONArray) {
        return super.mo5949b(this.f3929gY, jSONArray);
    }

    /* renamed from: b */
    public final long mo5940b(C1230b bVar) {
        mo5935ad(bVar.getType());
        return C1238e.m5231a(this.f3929gY, m5215c(bVar));
    }

    /* renamed from: ad */
    public final void mo5935ad(String str) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(C1239a.Equals);
        super.mo5944a(this.f3929gY, new String[]{COLUMN_TYPE}, new String[]{str}, arrayList);
    }

    /* renamed from: b */
    public final int mo5939b(String str, long j) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(C1239a.Equals);
        arrayList.add(C1239a.LessThan);
        return super.mo5944a(this.f3929gY, new String[]{COLUMN_TYPE, f3926gW}, new String[]{str, String.valueOf(j)}, arrayList);
    }

    public final void delete() {
        super.delete(this.f3929gY);
    }

    /* renamed from: bm */
    public final List<C1230b> mo5941bm() {
        return super.mo5948ah(this.f3929gY);
    }

    /* renamed from: ae */
    public final List<C1230b> mo5936ae(String str) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(C1239a.Equals);
        return super.mo5947a(this.f3929gY, new String[]{COLUMN_TYPE}, new String[]{str}, null, arrayList);
    }

    /* renamed from: af */
    public final List<C1230b> mo5937af(String str) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(C1239a.Equals);
        return super.mo5947a(this.f3929gY, new String[]{f3924gU}, new String[]{str}, null, arrayList);
    }

    /* renamed from: c */
    public final List<C1230b> mo5942c(String str, long j) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(C1239a.Equals);
        arrayList.add(C1239a.GreaterThan);
        return super.mo5947a(this.f3929gY, new String[]{COLUMN_TYPE, f3926gW}, new String[]{str, String.valueOf(j)}, null, arrayList);
    }

    /* renamed from: ag */
    public final List<C1230b> mo5938ag(String str) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(C1239a.Equals);
        String str2 = this.f3929gY;
        String[] strArr = {COLUMN_TYPE};
        String[] strArr2 = {str};
        String str3 = f3926gW;
        StringBuilder sb = new StringBuilder();
        sb.append(str3);
        sb.append(" DESC");
        List<C1230b> a = super.mo5947a(str2, strArr, strArr2, sb.toString(), arrayList);
        if (a == null || a.isEmpty()) {
            return null;
        }
        ListIterator listIterator = a.listIterator();
        listIterator.next();
        while (listIterator.hasNext()) {
            listIterator.next();
            listIterator.remove();
        }
        return a;
    }

    /* renamed from: c */
    private static ContentValues m5215c(C1230b bVar) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(f3924gU, bVar.mo5897aY());
        contentValues.put(COLUMN_TYPE, bVar.getType());
        contentValues.put(f3925gV, bVar.mo5898aZ());
        contentValues.put(f3927gX, bVar.getDataType());
        return contentValues;
    }

    /* access modifiers changed from: protected */
    /* renamed from: bn */
    public final String[] mo5924bn() {
        return this.f3928gM;
    }

    /* renamed from: d */
    protected static C1230b m5217d(Cursor cursor) {
        String string = cursor.getString(cursor.getColumnIndex(f3924gU));
        String string2 = cursor.getString(cursor.getColumnIndex(COLUMN_TYPE));
        String string3 = cursor.getString(cursor.getColumnIndex(f3925gV));
        long j = cursor.getLong(cursor.getColumnIndex(f3926gW)) * 1000;
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(j);
        C1230b bVar = new C1230b(string, string2, string3, instance.getTime(), cursor.getString(cursor.getColumnIndex(f3927gX)));
        return bVar;
    }

    /* renamed from: b */
    protected static String m5214b(String str, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("create table ");
        sb.append(str);
        StringBuilder sb2 = new StringBuilder(" ( pk text not null, t text not null ");
        sb2.append(z ? "primary key" : "");
        sb2.append(", cd");
        sb2.append(" text not null, cdd");
        sb2.append(" text default (strftime('%s','now')), cdt");
        sb2.append(" text)");
        sb.append(sb2.toString());
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C1232d mo5922b(Cursor cursor) {
        String string = cursor.getString(cursor.getColumnIndex(f3924gU));
        String string2 = cursor.getString(cursor.getColumnIndex(COLUMN_TYPE));
        String string3 = cursor.getString(cursor.getColumnIndex(f3925gV));
        long j = cursor.getLong(cursor.getColumnIndex(f3926gW)) * 1000;
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(j);
        C1230b bVar = new C1230b(string, string2, string3, instance.getTime(), cursor.getString(cursor.getColumnIndex(f3927gX)));
        return bVar;
    }
}
