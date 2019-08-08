package android.support.p028v7.view.menu;

import android.content.Context;
import android.os.IBinder;
import android.support.p028v7.p029a.C0672a.C0679g;
import android.support.p028v7.view.menu.C0806o.C0807a;
import android.support.p028v7.view.menu.C0808p.C0809a;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import java.util.ArrayList;

/* renamed from: android.support.v7.view.menu.f */
/* compiled from: ListMenuPresenter */
public class C0787f implements C0806o, OnItemClickListener {

    /* renamed from: a */
    Context f2328a;

    /* renamed from: b */
    LayoutInflater f2329b;

    /* renamed from: c */
    C0790h f2330c;

    /* renamed from: d */
    ExpandedMenuView f2331d;

    /* renamed from: e */
    int f2332e;

    /* renamed from: f */
    int f2333f;

    /* renamed from: g */
    int f2334g;

    /* renamed from: h */
    C0788a f2335h;

    /* renamed from: i */
    private C0807a f2336i;

    /* renamed from: android.support.v7.view.menu.f$a */
    /* compiled from: ListMenuPresenter */
    private class C0788a extends BaseAdapter {

        /* renamed from: b */
        private int f2338b = -1;

        public long getItemId(int i) {
            return (long) i;
        }

        public C0788a() {
            mo3140a();
        }

        public int getCount() {
            int size = C0787f.this.f2330c.mo3212m().size() - C0787f.this.f2332e;
            return this.f2338b < 0 ? size : size - 1;
        }

        /* renamed from: a */
        public C0794j getItem(int i) {
            ArrayList m = C0787f.this.f2330c.mo3212m();
            int i2 = i + C0787f.this.f2332e;
            if (this.f2338b >= 0 && i2 >= this.f2338b) {
                i2++;
            }
            return (C0794j) m.get(i2);
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                view = C0787f.this.f2329b.inflate(C0787f.this.f2334g, viewGroup, false);
            }
            ((C0809a) view).mo3017a(getItem(i), 0);
            return view;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo3140a() {
            C0794j s = C0787f.this.f2330c.mo3222s();
            if (s != null) {
                ArrayList m = C0787f.this.f2330c.mo3212m();
                int size = m.size();
                for (int i = 0; i < size; i++) {
                    if (((C0794j) m.get(i)) == s) {
                        this.f2338b = i;
                        return;
                    }
                }
            }
            this.f2338b = -1;
        }

        public void notifyDataSetChanged() {
            mo3140a();
            super.notifyDataSetChanged();
        }
    }

    /* renamed from: a */
    public boolean mo3102a(C0790h hVar, C0794j jVar) {
        return false;
    }

    /* renamed from: b */
    public boolean mo3107b() {
        return false;
    }

    /* renamed from: b */
    public boolean mo3108b(C0790h hVar, C0794j jVar) {
        return false;
    }

    public C0787f(Context context, int i) {
        this(i, 0);
        this.f2328a = context;
        this.f2329b = LayoutInflater.from(this.f2328a);
    }

    public C0787f(int i, int i2) {
        this.f2334g = i;
        this.f2333f = i2;
    }

    /* renamed from: a */
    public void mo3096a(Context context, C0790h hVar) {
        if (this.f2333f != 0) {
            this.f2328a = new ContextThemeWrapper(context, this.f2333f);
            this.f2329b = LayoutInflater.from(this.f2328a);
        } else if (this.f2328a != null) {
            this.f2328a = context;
            if (this.f2329b == null) {
                this.f2329b = LayoutInflater.from(this.f2328a);
            }
        }
        this.f2330c = hVar;
        if (this.f2335h != null) {
            this.f2335h.notifyDataSetChanged();
        }
    }

    /* renamed from: a */
    public C0808p mo3136a(ViewGroup viewGroup) {
        if (this.f2331d == null) {
            this.f2331d = (ExpandedMenuView) this.f2329b.inflate(C0679g.abc_expanded_menu_layout, viewGroup, false);
            if (this.f2335h == null) {
                this.f2335h = new C0788a();
            }
            this.f2331d.setAdapter(this.f2335h);
            this.f2331d.setOnItemClickListener(this);
        }
        return this.f2331d;
    }

    /* renamed from: a */
    public ListAdapter mo3137a() {
        if (this.f2335h == null) {
            this.f2335h = new C0788a();
        }
        return this.f2335h;
    }

    /* renamed from: b */
    public void mo3106b(boolean z) {
        if (this.f2335h != null) {
            this.f2335h.notifyDataSetChanged();
        }
    }

    /* renamed from: a */
    public void mo3099a(C0807a aVar) {
        this.f2336i = aVar;
    }

    /* renamed from: a */
    public boolean mo3103a(C0816u uVar) {
        if (!uVar.hasVisibleItems()) {
            return false;
        }
        new C0793i(uVar).mo3230a((IBinder) null);
        if (this.f2336i != null) {
            this.f2336i.mo2722a(uVar);
        }
        return true;
    }

    /* renamed from: a */
    public void mo3097a(C0790h hVar, boolean z) {
        if (this.f2336i != null) {
            this.f2336i.mo2721a(hVar, z);
        }
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.f2330c.mo3173a((MenuItem) this.f2335h.getItem(i), (C0806o) this, 0);
    }
}
