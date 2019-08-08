package android.support.p017v4.widget;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.FilterQueryProvider;
import android.widget.Filterable;

/* renamed from: android.support.v4.widget.f */
/* compiled from: CursorAdapter */
public abstract class C0648f extends BaseAdapter implements C0652a, Filterable {

    /* renamed from: a */
    protected boolean f1715a;

    /* renamed from: b */
    protected boolean f1716b;

    /* renamed from: c */
    protected Cursor f1717c;

    /* renamed from: d */
    protected Context f1718d;

    /* renamed from: e */
    protected int f1719e;

    /* renamed from: f */
    protected C0649a f1720f;

    /* renamed from: g */
    protected DataSetObserver f1721g;

    /* renamed from: h */
    protected C0651g f1722h;

    /* renamed from: i */
    protected FilterQueryProvider f1723i;

    /* renamed from: android.support.v4.widget.f$a */
    /* compiled from: CursorAdapter */
    private class C0649a extends ContentObserver {
        public boolean deliverSelfNotifications() {
            return true;
        }

        C0649a() {
            super(new Handler());
        }

        public void onChange(boolean z) {
            C0648f.this.mo2508b();
        }
    }

    /* renamed from: android.support.v4.widget.f$b */
    /* compiled from: CursorAdapter */
    private class C0650b extends DataSetObserver {
        C0650b() {
        }

        public void onChanged() {
            C0648f.this.f1715a = true;
            C0648f.this.notifyDataSetChanged();
        }

        public void onInvalidated() {
            C0648f.this.f1715a = false;
            C0648f.this.notifyDataSetInvalidated();
        }
    }

    /* renamed from: a */
    public abstract View mo2502a(Context context, Cursor cursor, ViewGroup viewGroup);

    /* renamed from: a */
    public abstract void mo2505a(View view, Context context, Cursor cursor);

    public boolean hasStableIds() {
        return true;
    }

    public C0648f(Context context, Cursor cursor, boolean z) {
        mo2503a(context, cursor, z ? 1 : 2);
    }

    public C0648f(Context context, Cursor cursor, int i) {
        mo2503a(context, cursor, i);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2503a(Context context, Cursor cursor, int i) {
        boolean z = false;
        if ((i & 1) == 1) {
            i |= 2;
            this.f1716b = true;
        } else {
            this.f1716b = false;
        }
        if (cursor != null) {
            z = true;
        }
        this.f1717c = cursor;
        this.f1715a = z;
        this.f1718d = context;
        this.f1719e = z ? cursor.getColumnIndexOrThrow("_id") : -1;
        if ((i & 2) == 2) {
            this.f1720f = new C0649a();
            this.f1721g = new C0650b();
        } else {
            this.f1720f = null;
            this.f1721g = null;
        }
        if (z) {
            if (this.f1720f != null) {
                cursor.registerContentObserver(this.f1720f);
            }
            if (this.f1721g != null) {
                cursor.registerDataSetObserver(this.f1721g);
            }
        }
    }

    /* renamed from: a */
    public Cursor mo2500a() {
        return this.f1717c;
    }

    public int getCount() {
        if (!this.f1715a || this.f1717c == null) {
            return 0;
        }
        return this.f1717c.getCount();
    }

    public Object getItem(int i) {
        if (!this.f1715a || this.f1717c == null) {
            return null;
        }
        this.f1717c.moveToPosition(i);
        return this.f1717c;
    }

    public long getItemId(int i) {
        if (!this.f1715a || this.f1717c == null || !this.f1717c.moveToPosition(i)) {
            return 0;
        }
        return this.f1717c.getLong(this.f1719e);
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        if (!this.f1715a) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        } else if (!this.f1717c.moveToPosition(i)) {
            StringBuilder sb = new StringBuilder();
            sb.append("couldn't move cursor to position ");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        } else {
            if (view == null) {
                view = mo2502a(this.f1718d, this.f1717c, viewGroup);
            }
            mo2505a(view, this.f1718d, this.f1717c);
            return view;
        }
    }

    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        if (!this.f1715a) {
            return null;
        }
        this.f1717c.moveToPosition(i);
        if (view == null) {
            view = mo2507b(this.f1718d, this.f1717c, viewGroup);
        }
        mo2505a(view, this.f1718d, this.f1717c);
        return view;
    }

    /* renamed from: b */
    public View mo2507b(Context context, Cursor cursor, ViewGroup viewGroup) {
        return mo2502a(context, cursor, viewGroup);
    }

    /* renamed from: a */
    public void mo2504a(Cursor cursor) {
        Cursor b = mo2506b(cursor);
        if (b != null) {
            b.close();
        }
    }

    /* renamed from: b */
    public Cursor mo2506b(Cursor cursor) {
        if (cursor == this.f1717c) {
            return null;
        }
        Cursor cursor2 = this.f1717c;
        if (cursor2 != null) {
            if (this.f1720f != null) {
                cursor2.unregisterContentObserver(this.f1720f);
            }
            if (this.f1721g != null) {
                cursor2.unregisterDataSetObserver(this.f1721g);
            }
        }
        this.f1717c = cursor;
        if (cursor != null) {
            if (this.f1720f != null) {
                cursor.registerContentObserver(this.f1720f);
            }
            if (this.f1721g != null) {
                cursor.registerDataSetObserver(this.f1721g);
            }
            this.f1719e = cursor.getColumnIndexOrThrow("_id");
            this.f1715a = true;
            notifyDataSetChanged();
        } else {
            this.f1719e = -1;
            this.f1715a = false;
            notifyDataSetInvalidated();
        }
        return cursor2;
    }

    /* renamed from: c */
    public CharSequence mo2509c(Cursor cursor) {
        return cursor == null ? "" : cursor.toString();
    }

    /* renamed from: a */
    public Cursor mo2501a(CharSequence charSequence) {
        if (this.f1723i != null) {
            return this.f1723i.runQuery(charSequence);
        }
        return this.f1717c;
    }

    public Filter getFilter() {
        if (this.f1722h == null) {
            this.f1722h = new C0651g(this);
        }
        return this.f1722h;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo2508b() {
        if (this.f1716b && this.f1717c != null && !this.f1717c.isClosed()) {
            this.f1715a = this.f1717c.requery();
        }
    }
}
