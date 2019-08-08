package android.support.p028v7.view.menu;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow.OnDismissListener;

/* renamed from: android.support.v7.view.menu.m */
/* compiled from: MenuPopup */
abstract class C0803m implements C0806o, C0812s, OnItemClickListener {

    /* renamed from: a */
    private Rect f2416a;

    /* renamed from: a */
    public abstract void mo3115a(int i);

    /* renamed from: a */
    public void mo3096a(Context context, C0790h hVar) {
    }

    /* renamed from: a */
    public abstract void mo3116a(C0790h hVar);

    /* renamed from: a */
    public abstract void mo3117a(View view);

    /* renamed from: a */
    public abstract void mo3118a(OnDismissListener onDismissListener);

    /* renamed from: a */
    public abstract void mo3119a(boolean z);

    /* renamed from: a */
    public boolean mo3102a(C0790h hVar, C0794j jVar) {
        return false;
    }

    /* renamed from: b */
    public abstract void mo3120b(int i);

    /* renamed from: b */
    public boolean mo3108b(C0790h hVar, C0794j jVar) {
        return false;
    }

    /* renamed from: c */
    public abstract void mo3122c(int i);

    /* renamed from: c */
    public abstract void mo3123c(boolean z);

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public boolean mo3126f() {
        return true;
    }

    C0803m() {
    }

    /* renamed from: a */
    public void mo3355a(Rect rect) {
        this.f2416a = rect;
    }

    /* renamed from: g */
    public Rect mo3356g() {
        return this.f2416a;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        m3380a(listAdapter).f2339a.mo3173a((MenuItem) listAdapter.getItem(i), (C0806o) this, mo3126f() ? 0 : 4);
    }

    /* renamed from: a */
    protected static int m3379a(ListAdapter listAdapter, ViewGroup viewGroup, Context context, int i) {
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        ViewGroup viewGroup2 = viewGroup;
        int i2 = 0;
        int i3 = 0;
        View view = null;
        for (int i4 = 0; i4 < count; i4++) {
            int itemViewType = listAdapter.getItemViewType(i4);
            if (itemViewType != i2) {
                view = null;
                i2 = itemViewType;
            }
            if (viewGroup2 == null) {
                viewGroup2 = new FrameLayout(context);
            }
            view = listAdapter.getView(i4, view, viewGroup2);
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i) {
                return i;
            }
            if (measuredWidth > i3) {
                i3 = measuredWidth;
            }
        }
        return i3;
    }

    /* renamed from: a */
    protected static C0789g m3380a(ListAdapter listAdapter) {
        if (listAdapter instanceof HeaderViewListAdapter) {
            return (C0789g) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter();
        }
        return (C0789g) listAdapter;
    }

    /* renamed from: b */
    protected static boolean m3381b(C0790h hVar) {
        int size = hVar.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = hVar.getItem(i);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
    }
}
