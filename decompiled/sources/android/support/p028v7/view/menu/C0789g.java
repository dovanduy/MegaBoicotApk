package android.support.p028v7.view.menu;

import android.support.p028v7.view.menu.C0808p.C0809a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;

/* renamed from: android.support.v7.view.menu.g */
/* compiled from: MenuAdapter */
public class C0789g extends BaseAdapter {

    /* renamed from: a */
    C0790h f2339a;

    /* renamed from: b */
    private int f2340b = -1;

    /* renamed from: c */
    private boolean f2341c;

    /* renamed from: d */
    private final boolean f2342d;

    /* renamed from: e */
    private final LayoutInflater f2343e;

    /* renamed from: f */
    private final int f2344f;

    public long getItemId(int i) {
        return (long) i;
    }

    public C0789g(C0790h hVar, LayoutInflater layoutInflater, boolean z, int i) {
        this.f2342d = z;
        this.f2343e = layoutInflater;
        this.f2339a = hVar;
        this.f2344f = i;
        mo3149b();
    }

    /* renamed from: a */
    public void mo3148a(boolean z) {
        this.f2341c = z;
    }

    public int getCount() {
        ArrayList m = this.f2342d ? this.f2339a.mo3212m() : this.f2339a.mo3209j();
        if (this.f2340b < 0) {
            return m.size();
        }
        return m.size() - 1;
    }

    /* renamed from: a */
    public C0790h mo3146a() {
        return this.f2339a;
    }

    /* renamed from: a */
    public C0794j getItem(int i) {
        ArrayList m = this.f2342d ? this.f2339a.mo3212m() : this.f2339a.mo3209j();
        if (this.f2340b >= 0 && i >= this.f2340b) {
            i++;
        }
        return (C0794j) m.get(i);
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f2343e.inflate(this.f2344f, viewGroup, false);
        }
        int groupId = getItem(i).getGroupId();
        int i2 = i - 1;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        listMenuItemView.setGroupDividerEnabled(this.f2339a.mo3188b() && groupId != (i2 >= 0 ? getItem(i2).getGroupId() : groupId));
        C0809a aVar = (C0809a) view;
        if (this.f2341c) {
            listMenuItemView.setForceShowIcon(true);
        }
        aVar.mo3017a(getItem(i), 0);
        return view;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo3149b() {
        C0794j s = this.f2339a.mo3222s();
        if (s != null) {
            ArrayList m = this.f2339a.mo3212m();
            int size = m.size();
            for (int i = 0; i < size; i++) {
                if (((C0794j) m.get(i)) == s) {
                    this.f2340b = i;
                    return;
                }
            }
        }
        this.f2340b = -1;
    }

    public void notifyDataSetChanged() {
        mo3149b();
        super.notifyDataSetChanged();
    }
}
