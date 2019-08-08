package android.support.p028v7.view.menu;

import android.content.Context;
import android.support.p028v7.view.menu.C0806o.C0807a;
import android.support.p028v7.view.menu.C0808p.C0809a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* renamed from: android.support.v7.view.menu.b */
/* compiled from: BaseMenuPresenter */
public abstract class C0778b implements C0806o {

    /* renamed from: a */
    protected Context f2277a;

    /* renamed from: b */
    protected Context f2278b;

    /* renamed from: c */
    protected C0790h f2279c;

    /* renamed from: d */
    protected LayoutInflater f2280d;

    /* renamed from: e */
    protected LayoutInflater f2281e;

    /* renamed from: f */
    protected C0808p f2282f;

    /* renamed from: g */
    private C0807a f2283g;

    /* renamed from: h */
    private int f2284h;

    /* renamed from: i */
    private int f2285i;

    /* renamed from: j */
    private int f2286j;

    /* renamed from: a */
    public abstract void mo3098a(C0794j jVar, C0809a aVar);

    /* renamed from: a */
    public boolean mo3101a(int i, C0794j jVar) {
        return true;
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

    public C0778b(Context context, int i, int i2) {
        this.f2277a = context;
        this.f2280d = LayoutInflater.from(context);
        this.f2284h = i;
        this.f2285i = i2;
    }

    /* renamed from: a */
    public void mo3096a(Context context, C0790h hVar) {
        this.f2278b = context;
        this.f2281e = LayoutInflater.from(this.f2278b);
        this.f2279c = hVar;
    }

    /* renamed from: a */
    public C0808p mo3093a(ViewGroup viewGroup) {
        if (this.f2282f == null) {
            this.f2282f = (C0808p) this.f2280d.inflate(this.f2284h, viewGroup, false);
            this.f2282f.mo3039a(this.f2279c);
            mo3106b(true);
        }
        return this.f2282f;
    }

    /* renamed from: b */
    public void mo3106b(boolean z) {
        ViewGroup viewGroup = (ViewGroup) this.f2282f;
        if (viewGroup != null) {
            int i = 0;
            if (this.f2279c != null) {
                this.f2279c.mo3210k();
                ArrayList j = this.f2279c.mo3209j();
                int size = j.size();
                int i2 = 0;
                for (int i3 = 0; i3 < size; i3++) {
                    C0794j jVar = (C0794j) j.get(i3);
                    if (mo3101a(i2, jVar)) {
                        View childAt = viewGroup.getChildAt(i2);
                        C0794j itemData = childAt instanceof C0809a ? ((C0809a) childAt).getItemData() : null;
                        View a = mo3094a(jVar, childAt, viewGroup);
                        if (jVar != itemData) {
                            a.setPressed(false);
                            a.jumpDrawablesToCurrentState();
                        }
                        if (a != childAt) {
                            mo3100a(a, i2);
                        }
                        i2++;
                    }
                }
                i = i2;
            }
            while (i < viewGroup.getChildCount()) {
                if (!mo3104a(viewGroup, i)) {
                    i++;
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo3100a(View view, int i) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
        ((ViewGroup) this.f2282f).addView(view, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo3104a(ViewGroup viewGroup, int i) {
        viewGroup.removeViewAt(i);
        return true;
    }

    /* renamed from: a */
    public void mo3099a(C0807a aVar) {
        this.f2283g = aVar;
    }

    /* renamed from: a */
    public C0807a mo3092a() {
        return this.f2283g;
    }

    /* renamed from: b */
    public C0809a mo3105b(ViewGroup viewGroup) {
        return (C0809a) this.f2280d.inflate(this.f2285i, viewGroup, false);
    }

    /* renamed from: a */
    public View mo3094a(C0794j jVar, View view, ViewGroup viewGroup) {
        C0809a aVar;
        if (view instanceof C0809a) {
            aVar = (C0809a) view;
        } else {
            aVar = mo3105b(viewGroup);
        }
        mo3098a(jVar, aVar);
        return (View) aVar;
    }

    /* renamed from: a */
    public void mo3097a(C0790h hVar, boolean z) {
        if (this.f2283g != null) {
            this.f2283g.mo2721a(hVar, z);
        }
    }

    /* renamed from: a */
    public boolean mo3103a(C0816u uVar) {
        if (this.f2283g != null) {
            return this.f2283g.mo2722a(uVar);
        }
        return false;
    }

    /* renamed from: a */
    public void mo3095a(int i) {
        this.f2286j = i;
    }
}
