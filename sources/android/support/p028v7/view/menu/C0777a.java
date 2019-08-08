package android.support.p028v7.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.support.p017v4.content.C0356c;
import android.support.p017v4.graphics.drawable.C0407a;
import android.support.p017v4.p018a.p019a.C0206b;
import android.support.p017v4.view.C0572b;
import android.view.ActionProvider;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MenuItem.OnActionExpandListener;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.SubMenu;
import android.view.View;
import com.google.android.exoplayer2.extractor.MpegAudioHeader;

/* renamed from: android.support.v7.view.menu.a */
/* compiled from: ActionMenuItem */
public class C0777a implements C0206b {

    /* renamed from: a */
    private final int f2255a;

    /* renamed from: b */
    private final int f2256b;

    /* renamed from: c */
    private final int f2257c;

    /* renamed from: d */
    private final int f2258d;

    /* renamed from: e */
    private CharSequence f2259e;

    /* renamed from: f */
    private CharSequence f2260f;

    /* renamed from: g */
    private Intent f2261g;

    /* renamed from: h */
    private char f2262h;

    /* renamed from: i */
    private int f2263i = MpegAudioHeader.MAX_FRAME_SIZE_BYTES;

    /* renamed from: j */
    private char f2264j;

    /* renamed from: k */
    private int f2265k = MpegAudioHeader.MAX_FRAME_SIZE_BYTES;

    /* renamed from: l */
    private Drawable f2266l;

    /* renamed from: m */
    private int f2267m = 0;

    /* renamed from: n */
    private Context f2268n;

    /* renamed from: o */
    private OnMenuItemClickListener f2269o;

    /* renamed from: p */
    private CharSequence f2270p;

    /* renamed from: q */
    private CharSequence f2271q;

    /* renamed from: r */
    private ColorStateList f2272r = null;

    /* renamed from: s */
    private Mode f2273s = null;

    /* renamed from: t */
    private boolean f2274t = false;

    /* renamed from: u */
    private boolean f2275u = false;

    /* renamed from: v */
    private int f2276v = 16;

    /* renamed from: a */
    public C0572b mo494a() {
        return null;
    }

    public boolean collapseActionView() {
        return false;
    }

    public boolean expandActionView() {
        return false;
    }

    public View getActionView() {
        return null;
    }

    public ContextMenuInfo getMenuInfo() {
        return null;
    }

    public SubMenu getSubMenu() {
        return null;
    }

    public boolean hasSubMenu() {
        return false;
    }

    public boolean isActionViewExpanded() {
        return false;
    }

    public void setShowAsAction(int i) {
    }

    public C0777a(Context context, int i, int i2, int i3, int i4, CharSequence charSequence) {
        this.f2268n = context;
        this.f2255a = i2;
        this.f2256b = i;
        this.f2257c = i3;
        this.f2258d = i4;
        this.f2259e = charSequence;
    }

    public char getAlphabeticShortcut() {
        return this.f2264j;
    }

    public int getAlphabeticModifiers() {
        return this.f2265k;
    }

    public int getGroupId() {
        return this.f2256b;
    }

    public Drawable getIcon() {
        return this.f2266l;
    }

    public Intent getIntent() {
        return this.f2261g;
    }

    public int getItemId() {
        return this.f2255a;
    }

    public char getNumericShortcut() {
        return this.f2262h;
    }

    public int getNumericModifiers() {
        return this.f2263i;
    }

    public int getOrder() {
        return this.f2258d;
    }

    public CharSequence getTitle() {
        return this.f2259e;
    }

    public CharSequence getTitleCondensed() {
        return this.f2260f != null ? this.f2260f : this.f2259e;
    }

    public boolean isCheckable() {
        return (this.f2276v & 1) != 0;
    }

    public boolean isChecked() {
        return (this.f2276v & 2) != 0;
    }

    public boolean isEnabled() {
        return (this.f2276v & 16) != 0;
    }

    public boolean isVisible() {
        return (this.f2276v & 8) == 0;
    }

    public MenuItem setAlphabeticShortcut(char c) {
        this.f2264j = Character.toLowerCase(c);
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c, int i) {
        this.f2264j = Character.toLowerCase(c);
        this.f2265k = KeyEvent.normalizeMetaState(i);
        return this;
    }

    public MenuItem setCheckable(boolean z) {
        this.f2276v = z | (this.f2276v & true) ? 1 : 0;
        return this;
    }

    public MenuItem setChecked(boolean z) {
        this.f2276v = (z ? 2 : 0) | (this.f2276v & -3);
        return this;
    }

    public MenuItem setEnabled(boolean z) {
        this.f2276v = (z ? 16 : 0) | (this.f2276v & -17);
        return this;
    }

    public MenuItem setIcon(Drawable drawable) {
        this.f2266l = drawable;
        this.f2267m = 0;
        m3197b();
        return this;
    }

    public MenuItem setIcon(int i) {
        this.f2267m = i;
        this.f2266l = C0356c.m1312a(this.f2268n, i);
        m3197b();
        return this;
    }

    public MenuItem setIntent(Intent intent) {
        this.f2261g = intent;
        return this;
    }

    public MenuItem setNumericShortcut(char c) {
        this.f2262h = c;
        return this;
    }

    public MenuItem setNumericShortcut(char c, int i) {
        this.f2262h = c;
        this.f2263i = KeyEvent.normalizeMetaState(i);
        return this;
    }

    public MenuItem setOnMenuItemClickListener(OnMenuItemClickListener onMenuItemClickListener) {
        this.f2269o = onMenuItemClickListener;
        return this;
    }

    public MenuItem setShortcut(char c, char c2) {
        this.f2262h = c;
        this.f2264j = Character.toLowerCase(c2);
        return this;
    }

    public MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f2262h = c;
        this.f2263i = KeyEvent.normalizeMetaState(i);
        this.f2264j = Character.toLowerCase(c2);
        this.f2265k = KeyEvent.normalizeMetaState(i2);
        return this;
    }

    public MenuItem setTitle(CharSequence charSequence) {
        this.f2259e = charSequence;
        return this;
    }

    public MenuItem setTitle(int i) {
        this.f2259e = this.f2268n.getResources().getString(i);
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f2260f = charSequence;
        return this;
    }

    public MenuItem setVisible(boolean z) {
        int i = 8;
        int i2 = this.f2276v & 8;
        if (z) {
            i = 0;
        }
        this.f2276v = i2 | i;
        return this;
    }

    /* renamed from: a */
    public C0206b setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public C0206b setActionView(int i) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public C0206b mo492a(C0572b bVar) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: b */
    public C0206b setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    public MenuItem setOnActionExpandListener(OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public C0206b setContentDescription(CharSequence charSequence) {
        this.f2270p = charSequence;
        return this;
    }

    public CharSequence getContentDescription() {
        return this.f2270p;
    }

    /* renamed from: b */
    public C0206b setTooltipText(CharSequence charSequence) {
        this.f2271q = charSequence;
        return this;
    }

    public CharSequence getTooltipText() {
        return this.f2271q;
    }

    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f2272r = colorStateList;
        this.f2274t = true;
        m3197b();
        return this;
    }

    public ColorStateList getIconTintList() {
        return this.f2272r;
    }

    public MenuItem setIconTintMode(Mode mode) {
        this.f2273s = mode;
        this.f2275u = true;
        m3197b();
        return this;
    }

    public Mode getIconTintMode() {
        return this.f2273s;
    }

    /* renamed from: b */
    private void m3197b() {
        if (this.f2266l == null) {
            return;
        }
        if (this.f2274t || this.f2275u) {
            this.f2266l = C0407a.m1550f(this.f2266l);
            this.f2266l = this.f2266l.mutate();
            if (this.f2274t) {
                C0407a.m1540a(this.f2266l, this.f2272r);
            }
            if (this.f2275u) {
                C0407a.m1543a(this.f2266l, this.f2273s);
            }
        }
    }
}
