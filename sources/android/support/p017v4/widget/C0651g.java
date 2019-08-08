package android.support.p017v4.widget;

import android.database.Cursor;
import android.widget.Filter;
import android.widget.Filter.FilterResults;

/* renamed from: android.support.v4.widget.g */
/* compiled from: CursorFilter */
class C0651g extends Filter {

    /* renamed from: a */
    C0652a f1726a;

    /* renamed from: android.support.v4.widget.g$a */
    /* compiled from: CursorFilter */
    interface C0652a {
        /* renamed from: a */
        Cursor mo2500a();

        /* renamed from: a */
        Cursor mo2501a(CharSequence charSequence);

        /* renamed from: a */
        void mo2504a(Cursor cursor);

        /* renamed from: c */
        CharSequence mo2509c(Cursor cursor);
    }

    C0651g(C0652a aVar) {
        this.f1726a = aVar;
    }

    public CharSequence convertResultToString(Object obj) {
        return this.f1726a.mo2509c((Cursor) obj);
    }

    /* access modifiers changed from: protected */
    public FilterResults performFiltering(CharSequence charSequence) {
        Cursor a = this.f1726a.mo2501a(charSequence);
        FilterResults filterResults = new FilterResults();
        if (a != null) {
            filterResults.count = a.getCount();
            filterResults.values = a;
        } else {
            filterResults.count = 0;
            filterResults.values = null;
        }
        return filterResults;
    }

    /* access modifiers changed from: protected */
    public void publishResults(CharSequence charSequence, FilterResults filterResults) {
        Cursor a = this.f1726a.mo2500a();
        if (filterResults.values != null && filterResults.values != a) {
            this.f1726a.mo2504a((Cursor) filterResults.values);
        }
    }
}
