package android.support.p028v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.p028v7.view.menu.C0789g;
import android.support.p028v7.view.menu.C0790h;
import android.support.p028v7.view.menu.C0794j;
import android.support.p028v7.view.menu.ListMenuItemView;
import android.transition.Transition;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* renamed from: android.support.v7.widget.af */
/* compiled from: MenuPopupWindow */
public class C0944af extends ListPopupWindow implements C0943ae {

    /* renamed from: a */
    private static Method f3106a;

    /* renamed from: b */
    private C0943ae f3107b;

    /* renamed from: android.support.v7.widget.af$a */
    /* compiled from: MenuPopupWindow */
    public static class C0945a extends C1044x {

        /* renamed from: b */
        final int f3108b;

        /* renamed from: c */
        final int f3109c;

        /* renamed from: d */
        private C0943ae f3110d;

        /* renamed from: e */
        private MenuItem f3111e;

        /* renamed from: a */
        public /* bridge */ /* synthetic */ int mo4897a(int i, int i2, int i3, int i4, int i5) {
            return super.mo4897a(i, i2, i3, i4, i5);
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ boolean mo4898a(MotionEvent motionEvent, int i) {
            return super.mo4898a(motionEvent, i);
        }

        public /* bridge */ /* synthetic */ boolean hasFocus() {
            return super.hasFocus();
        }

        public /* bridge */ /* synthetic */ boolean hasWindowFocus() {
            return super.hasWindowFocus();
        }

        public /* bridge */ /* synthetic */ boolean isFocused() {
            return super.isFocused();
        }

        public /* bridge */ /* synthetic */ boolean isInTouchMode() {
            return super.isInTouchMode();
        }

        public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
            return super.onTouchEvent(motionEvent);
        }

        public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
            super.setSelector(drawable);
        }

        public C0945a(Context context, boolean z) {
            super(context, z);
            Configuration configuration = context.getResources().getConfiguration();
            if (VERSION.SDK_INT < 17 || 1 != configuration.getLayoutDirection()) {
                this.f3108b = 22;
                this.f3109c = 21;
                return;
            }
            this.f3108b = 21;
            this.f3109c = 22;
        }

        public void setHoverListener(C0943ae aeVar) {
            this.f3110d = aeVar;
        }

        public boolean onKeyDown(int i, KeyEvent keyEvent) {
            ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
            if (listMenuItemView != null && i == this.f3108b) {
                if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                    performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
                }
                return true;
            } else if (listMenuItemView == null || i != this.f3109c) {
                return super.onKeyDown(i, keyEvent);
            } else {
                setSelection(-1);
                ((C0789g) getAdapter()).mo3146a().mo3170a(false);
                return true;
            }
        }

        public boolean onHoverEvent(MotionEvent motionEvent) {
            int i;
            C0789g gVar;
            if (this.f3110d != null) {
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    i = headerViewListAdapter.getHeadersCount();
                    gVar = (C0789g) headerViewListAdapter.getWrappedAdapter();
                } else {
                    i = 0;
                    gVar = (C0789g) adapter;
                }
                C0794j jVar = null;
                if (motionEvent.getAction() != 10) {
                    int pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
                    if (pointToPosition != -1) {
                        int i2 = pointToPosition - i;
                        if (i2 >= 0 && i2 < gVar.getCount()) {
                            jVar = gVar.getItem(i2);
                        }
                    }
                }
                MenuItem menuItem = this.f3111e;
                if (menuItem != jVar) {
                    C0790h a = gVar.mo3146a();
                    if (menuItem != null) {
                        this.f3110d.mo3132a(a, menuItem);
                    }
                    this.f3111e = jVar;
                    if (jVar != null) {
                        this.f3110d.mo3133b(a, jVar);
                    }
                }
            }
            return super.onHoverEvent(motionEvent);
        }
    }

    static {
        try {
            f3106a = PopupWindow.class.getDeclaredMethod("setTouchModal", new Class[]{Boolean.TYPE});
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    public C0944af(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C1044x mo3949a(Context context, boolean z) {
        C0945a aVar = new C0945a(context, z);
        aVar.setHoverListener(this);
        return aVar;
    }

    /* renamed from: a */
    public void mo4894a(Object obj) {
        if (VERSION.SDK_INT >= 23) {
            this.f2733g.setEnterTransition((Transition) obj);
        }
    }

    /* renamed from: b */
    public void mo4895b(Object obj) {
        if (VERSION.SDK_INT >= 23) {
            this.f2733g.setExitTransition((Transition) obj);
        }
    }

    /* renamed from: a */
    public void mo4893a(C0943ae aeVar) {
        this.f3107b = aeVar;
    }

    /* renamed from: c */
    public void mo4896c(boolean z) {
        if (f3106a != null) {
            try {
                f3106a.invoke(this.f2733g, new Object[]{Boolean.valueOf(z)});
            } catch (Exception unused) {
                Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
            }
        }
    }

    /* renamed from: b */
    public void mo3133b(C0790h hVar, MenuItem menuItem) {
        if (this.f3107b != null) {
            this.f3107b.mo3133b(hVar, menuItem);
        }
    }

    /* renamed from: a */
    public void mo3132a(C0790h hVar, MenuItem menuItem) {
        if (this.f3107b != null) {
            this.f3107b.mo3132a(hVar, menuItem);
        }
    }
}
