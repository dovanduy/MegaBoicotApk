package mega.boicot;

import android.app.Activity;
import android.app.ExpandableListActivity;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView.LayoutParams;
import android.widget.BaseExpandableListAdapter;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.TextView;

public class cats extends ExpandableListActivity {

    /* renamed from: a */
    ExpandableListAdapter f19603a;

    /* renamed from: b */
    config f19604b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public String[] f19605c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public String[][] f19606d;

    /* renamed from: e */
    private int[][] f19607e;

    /* renamed from: mega.boicot.cats$a */
    public class C5939a extends BaseExpandableListAdapter {
        public long getChildId(int i, int i2) {
            return (long) i2;
        }

        public long getGroupId(int i) {
            return (long) i;
        }

        public boolean hasStableIds() {
            return true;
        }

        public boolean isChildSelectable(int i, int i2) {
            return true;
        }

        public C5939a() {
        }

        public Object getChild(int i, int i2) {
            return cats.this.f19606d[i][i2];
        }

        public int getChildrenCount(int i) {
            return cats.this.f19606d[i].length;
        }

        /* renamed from: a */
        public TextView mo21616a() {
            LayoutParams layoutParams = new LayoutParams(-1, 64);
            TextView textView = new TextView(cats.this);
            textView.setLayoutParams(layoutParams);
            textView.setGravity(8388627);
            if (VERSION.SDK_INT >= 17 && cats.this.getResources().getBoolean(R.bool.es_rtl)) {
                textView.setTextDirection(4);
            }
            textView.setPadding(80, 0, 80, 0);
            return textView;
        }

        public View getChildView(int i, int i2, boolean z, View view, ViewGroup viewGroup) {
            TextView a = mo21616a();
            a.setText(getChild(i, i2).toString());
            return a;
        }

        public Object getGroup(int i) {
            return cats.this.f19605c[i];
        }

        public int getGroupCount() {
            return cats.this.f19605c.length;
        }

        public View getGroupView(int i, boolean z, View view, ViewGroup viewGroup) {
            TextView a = mo21616a();
            a.setText(getGroup(i).toString());
            return a;
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f19604b = (config) getApplicationContext();
        if (this.f19604b.f17881aN == null) {
            this.f19604b.mo20780b();
        }
        config.m23833a((Activity) this, this.f19604b.f17881aN);
        SQLiteDatabase readableDatabase = new C5665k(getApplicationContext()).getReadableDatabase();
        Cursor rawQuery = readableDatabase.rawQuery("SELECT _id,idcat,descr FROM cats WHERE idcat=0 ORDER BY descr", null);
        this.f19605c = new String[rawQuery.getCount()];
        this.f19606d = new String[rawQuery.getCount()][];
        this.f19607e = new int[rawQuery.getCount()][];
        if (rawQuery.moveToFirst()) {
            while (!rawQuery.isAfterLast()) {
                this.f19605c[rawQuery.getPosition()] = rawQuery.getString(rawQuery.getColumnIndex("descr"));
                int i = rawQuery.getInt(rawQuery.getColumnIndex("_id"));
                StringBuilder sb = new StringBuilder();
                sb.append("SELECT _id,idcat,descr FROM cats WHERE idcat=");
                sb.append(i);
                sb.append(" ORDER BY descr");
                Cursor rawQuery2 = readableDatabase.rawQuery(sb.toString(), null);
                String[] strArr = new String[(rawQuery2.getCount() + 1)];
                strArr[0] = getResources().getString(R.string.todo);
                int[] iArr = new int[(rawQuery2.getCount() + 1)];
                iArr[0] = i;
                if (rawQuery2.moveToFirst()) {
                    while (!rawQuery2.isAfterLast()) {
                        strArr[rawQuery2.getPosition() + 1] = rawQuery2.getString(rawQuery2.getColumnIndex("descr"));
                        iArr[rawQuery2.getPosition() + 1] = rawQuery2.getInt(rawQuery2.getColumnIndex("_id"));
                        rawQuery2.moveToNext();
                    }
                }
                rawQuery2.close();
                this.f19606d[rawQuery.getPosition()] = strArr;
                this.f19607e[rawQuery.getPosition()] = iArr;
                rawQuery.moveToNext();
            }
        }
        rawQuery.close();
        readableDatabase.close();
        if (VERSION.SDK_INT >= 17 && getResources().getBoolean(R.bool.es_rtl)) {
            getExpandableListView().setTextDirection(4);
        }
        this.f19603a = new C5939a();
        setListAdapter(this.f19603a);
    }

    public boolean onChildClick(ExpandableListView expandableListView, View view, int i, int i2, long j) {
        Intent intent = new Intent();
        intent.putExtra("idcat", this.f19607e[i][i2]);
        if (i2 == 0) {
            intent.putExtra("cat", this.f19605c[i]);
        } else {
            intent.putExtra("cat", this.f19606d[i][i2]);
        }
        setResult(-1, intent);
        finish();
        return true;
    }
}
