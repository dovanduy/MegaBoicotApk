package android.support.p028v7.view.menu;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.p017v4.graphics.drawable.C0407a;
import android.support.p017v4.p018a.p019a.C0206b;
import android.support.p017v4.view.C0572b;
import android.support.p017v4.view.C0572b.C0574b;
import android.support.p028v7.p029a.C0672a.C0680h;
import android.support.p028v7.p031c.p032a.C0740a;
import android.support.p028v7.view.menu.C0808p.C0809a;
import android.util.Log;
import android.view.ActionProvider;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MenuItem.OnActionExpandListener;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewDebug.CapturedViewProperty;
import android.widget.LinearLayout;
import com.google.android.exoplayer2.C2793C;
import com.google.android.exoplayer2.extractor.MpegAudioHeader;

/* renamed from: android.support.v7.view.menu.j */
/* compiled from: MenuItemImpl */
public final class C0794j implements C0206b {

    /* renamed from: A */
    private View f2376A;

    /* renamed from: B */
    private C0572b f2377B;

    /* renamed from: C */
    private OnActionExpandListener f2378C;

    /* renamed from: D */
    private boolean f2379D = false;

    /* renamed from: E */
    private ContextMenuInfo f2380E;

    /* renamed from: a */
    C0790h f2381a;

    /* renamed from: b */
    private final int f2382b;

    /* renamed from: c */
    private final int f2383c;

    /* renamed from: d */
    private final int f2384d;

    /* renamed from: e */
    private final int f2385e;

    /* renamed from: f */
    private CharSequence f2386f;

    /* renamed from: g */
    private CharSequence f2387g;

    /* renamed from: h */
    private Intent f2388h;

    /* renamed from: i */
    private char f2389i;

    /* renamed from: j */
    private int f2390j = MpegAudioHeader.MAX_FRAME_SIZE_BYTES;

    /* renamed from: k */
    private char f2391k;

    /* renamed from: l */
    private int f2392l = MpegAudioHeader.MAX_FRAME_SIZE_BYTES;

    /* renamed from: m */
    private Drawable f2393m;

    /* renamed from: n */
    private int f2394n = 0;

    /* renamed from: o */
    private C0816u f2395o;

    /* renamed from: p */
    private Runnable f2396p;

    /* renamed from: q */
    private OnMenuItemClickListener f2397q;

    /* renamed from: r */
    private CharSequence f2398r;

    /* renamed from: s */
    private CharSequence f2399s;

    /* renamed from: t */
    private ColorStateList f2400t = null;

    /* renamed from: u */
    private Mode f2401u = null;

    /* renamed from: v */
    private boolean f2402v = false;

    /* renamed from: w */
    private boolean f2403w = false;

    /* renamed from: x */
    private boolean f2404x = false;

    /* renamed from: y */
    private int f2405y = 16;

    /* renamed from: z */
    private int f2406z = 0;

    C0794j(C0790h hVar, int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        this.f2381a = hVar;
        this.f2382b = i2;
        this.f2383c = i;
        this.f2384d = i3;
        this.f2385e = i4;
        this.f2386f = charSequence;
        this.f2406z = i5;
    }

    /* renamed from: b */
    public boolean mo3242b() {
        if ((this.f2397q != null && this.f2397q.onMenuItemClick(this)) || this.f2381a.mo3171a(this.f2381a, (MenuItem) this)) {
            return true;
        }
        if (this.f2396p != null) {
            this.f2396p.run();
            return true;
        }
        if (this.f2388h != null) {
            try {
                this.f2381a.mo3201f().startActivity(this.f2388h);
                return true;
            } catch (ActivityNotFoundException e) {
                Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e);
            }
        }
        if (this.f2377B == null || !this.f2377B.mo2061d()) {
            return false;
        }
        return true;
    }

    public boolean isEnabled() {
        return (this.f2405y & 16) != 0;
    }

    public MenuItem setEnabled(boolean z) {
        if (z) {
            this.f2405y |= 16;
        } else {
            this.f2405y &= -17;
        }
        this.f2381a.mo3187b(false);
        return this;
    }

    public int getGroupId() {
        return this.f2383c;
    }

    @CapturedViewProperty
    public int getItemId() {
        return this.f2382b;
    }

    public int getOrder() {
        return this.f2384d;
    }

    /* renamed from: c */
    public int mo3243c() {
        return this.f2385e;
    }

    public Intent getIntent() {
        return this.f2388h;
    }

    public MenuItem setIntent(Intent intent) {
        this.f2388h = intent;
        return this;
    }

    public char getAlphabeticShortcut() {
        return this.f2391k;
    }

    public MenuItem setAlphabeticShortcut(char c) {
        if (this.f2391k == c) {
            return this;
        }
        this.f2391k = Character.toLowerCase(c);
        this.f2381a.mo3187b(false);
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c, int i) {
        if (this.f2391k == c && this.f2392l == i) {
            return this;
        }
        this.f2391k = Character.toLowerCase(c);
        this.f2392l = KeyEvent.normalizeMetaState(i);
        this.f2381a.mo3187b(false);
        return this;
    }

    public int getAlphabeticModifiers() {
        return this.f2392l;
    }

    public char getNumericShortcut() {
        return this.f2389i;
    }

    public int getNumericModifiers() {
        return this.f2390j;
    }

    public MenuItem setNumericShortcut(char c) {
        if (this.f2389i == c) {
            return this;
        }
        this.f2389i = c;
        this.f2381a.mo3187b(false);
        return this;
    }

    public MenuItem setNumericShortcut(char c, int i) {
        if (this.f2389i == c && this.f2390j == i) {
            return this;
        }
        this.f2389i = c;
        this.f2390j = KeyEvent.normalizeMetaState(i);
        this.f2381a.mo3187b(false);
        return this;
    }

    public MenuItem setShortcut(char c, char c2) {
        this.f2389i = c;
        this.f2391k = Character.toLowerCase(c2);
        this.f2381a.mo3187b(false);
        return this;
    }

    public MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f2389i = c;
        this.f2390j = KeyEvent.normalizeMetaState(i);
        this.f2391k = Character.toLowerCase(c2);
        this.f2392l = KeyEvent.normalizeMetaState(i2);
        this.f2381a.mo3187b(false);
        return this;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public char mo3245d() {
        return this.f2381a.mo3191c() ? this.f2391k : this.f2389i;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public String mo3247e() {
        char d = mo3245d();
        if (d == 0) {
            return "";
        }
        Resources resources = this.f2381a.mo3201f().getResources();
        StringBuilder sb = new StringBuilder();
        if (ViewConfiguration.get(this.f2381a.mo3201f()).hasPermanentMenuKey()) {
            sb.append(resources.getString(C0680h.abc_prepend_shortcut_label));
        }
        int i = this.f2381a.mo3191c() ? this.f2392l : this.f2390j;
        m3335a(sb, i, C2793C.DEFAULT_BUFFER_SEGMENT_SIZE, resources.getString(C0680h.abc_menu_meta_shortcut_label));
        m3335a(sb, i, MpegAudioHeader.MAX_FRAME_SIZE_BYTES, resources.getString(C0680h.abc_menu_ctrl_shortcut_label));
        m3335a(sb, i, 2, resources.getString(C0680h.abc_menu_alt_shortcut_label));
        m3335a(sb, i, 1, resources.getString(C0680h.abc_menu_shift_shortcut_label));
        m3335a(sb, i, 4, resources.getString(C0680h.abc_menu_sym_shortcut_label));
        m3335a(sb, i, 8, resources.getString(C0680h.abc_menu_function_shortcut_label));
        if (d == 8) {
            sb.append(resources.getString(C0680h.abc_menu_delete_shortcut_label));
        } else if (d == 10) {
            sb.append(resources.getString(C0680h.abc_menu_enter_shortcut_label));
        } else if (d != ' ') {
            sb.append(d);
        } else {
            sb.append(resources.getString(C0680h.abc_menu_space_shortcut_label));
        }
        return sb.toString();
    }

    /* renamed from: a */
    private static void m3335a(StringBuilder sb, int i, int i2, String str) {
        if ((i & i2) == i2) {
            sb.append(str);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public boolean mo3249f() {
        return this.f2381a.mo3197d() && mo3245d() != 0;
    }

    public SubMenu getSubMenu() {
        return this.f2395o;
    }

    public boolean hasSubMenu() {
        return this.f2395o != null;
    }

    /* renamed from: a */
    public void mo3237a(C0816u uVar) {
        this.f2395o = uVar;
        uVar.setHeaderTitle(getTitle());
    }

    @CapturedViewProperty
    public CharSequence getTitle() {
        return this.f2386f;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public CharSequence mo3236a(C0809a aVar) {
        if (aVar == null || !aVar.mo3018a()) {
            return getTitle();
        }
        return getTitleCondensed();
    }

    public MenuItem setTitle(CharSequence charSequence) {
        this.f2386f = charSequence;
        this.f2381a.mo3187b(false);
        if (this.f2395o != null) {
            this.f2395o.setHeaderTitle(charSequence);
        }
        return this;
    }

    public MenuItem setTitle(int i) {
        return setTitle((CharSequence) this.f2381a.mo3201f().getString(i));
    }

    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f2387g != null ? this.f2387g : this.f2386f;
        return (VERSION.SDK_INT >= 18 || charSequence == null || (charSequence instanceof String)) ? charSequence : charSequence.toString();
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f2387g = charSequence;
        if (charSequence == null) {
            CharSequence charSequence2 = this.f2386f;
        }
        this.f2381a.mo3187b(false);
        return this;
    }

    public Drawable getIcon() {
        if (this.f2393m != null) {
            return m3334a(this.f2393m);
        }
        if (this.f2394n == 0) {
            return null;
        }
        Drawable b = C0740a.m3008b(this.f2381a.mo3201f(), this.f2394n);
        this.f2394n = 0;
        this.f2393m = b;
        return m3334a(b);
    }

    public MenuItem setIcon(Drawable drawable) {
        this.f2394n = 0;
        this.f2393m = drawable;
        this.f2404x = true;
        this.f2381a.mo3187b(false);
        return this;
    }

    public MenuItem setIcon(int i) {
        this.f2393m = null;
        this.f2394n = i;
        this.f2404x = true;
        this.f2381a.mo3187b(false);
        return this;
    }

    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f2400t = colorStateList;
        this.f2402v = true;
        this.f2404x = true;
        this.f2381a.mo3187b(false);
        return this;
    }

    public ColorStateList getIconTintList() {
        return this.f2400t;
    }

    public MenuItem setIconTintMode(Mode mode) {
        this.f2401u = mode;
        this.f2403w = true;
        this.f2404x = true;
        this.f2381a.mo3187b(false);
        return this;
    }

    public Mode getIconTintMode() {
        return this.f2401u;
    }

    /* renamed from: a */
    private Drawable m3334a(Drawable drawable) {
        if (drawable != null && this.f2404x && (this.f2402v || this.f2403w)) {
            drawable = C0407a.m1550f(drawable).mutate();
            if (this.f2402v) {
                C0407a.m1540a(drawable, this.f2400t);
            }
            if (this.f2403w) {
                C0407a.m1543a(drawable, this.f2401u);
            }
            this.f2404x = false;
        }
        return drawable;
    }

    public boolean isCheckable() {
        return (this.f2405y & 1) == 1;
    }

    public MenuItem setCheckable(boolean z) {
        int i = this.f2405y;
        this.f2405y = z | (this.f2405y & true) ? 1 : 0;
        if (i != this.f2405y) {
            this.f2381a.mo3187b(false);
        }
        return this;
    }

    /* renamed from: a */
    public void mo3239a(boolean z) {
        this.f2405y = (z ? 4 : 0) | (this.f2405y & -5);
    }

    /* renamed from: g */
    public boolean mo3250g() {
        return (this.f2405y & 4) != 0;
    }

    public boolean isChecked() {
        return (this.f2405y & 2) == 2;
    }

    public MenuItem setChecked(boolean z) {
        if ((this.f2405y & 4) != 0) {
            this.f2381a.mo3168a((MenuItem) this);
        } else {
            mo3241b(z);
        }
        return this;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo3241b(boolean z) {
        int i = this.f2405y;
        this.f2405y = (z ? 2 : 0) | (this.f2405y & -3);
        if (i != this.f2405y) {
            this.f2381a.mo3187b(false);
        }
    }

    public boolean isVisible() {
        boolean z = false;
        if (this.f2377B == null || !this.f2377B.mo2059b()) {
            if ((this.f2405y & 8) == 0) {
                z = true;
            }
            return z;
        }
        if ((this.f2405y & 8) == 0 && this.f2377B.mo2060c()) {
            z = true;
        }
        return z;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public boolean mo3244c(boolean z) {
        int i = this.f2405y;
        this.f2405y = (z ? 0 : 8) | (this.f2405y & -9);
        if (i != this.f2405y) {
            return true;
        }
        return false;
    }

    public MenuItem setVisible(boolean z) {
        if (mo3244c(z)) {
            this.f2381a.mo3165a(this);
        }
        return this;
    }

    public MenuItem setOnMenuItemClickListener(OnMenuItemClickListener onMenuItemClickListener) {
        this.f2397q = onMenuItemClickListener;
        return this;
    }

    public String toString() {
        if (this.f2386f != null) {
            return this.f2386f.toString();
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo3238a(ContextMenuInfo contextMenuInfo) {
        this.f2380E = contextMenuInfo;
    }

    public ContextMenuInfo getMenuInfo() {
        return this.f2380E;
    }

    /* renamed from: h */
    public void mo3263h() {
        this.f2381a.mo3185b(this);
    }

    /* renamed from: i */
    public boolean mo3265i() {
        return this.f2381a.mo3219r();
    }

    /* renamed from: j */
    public boolean mo3270j() {
        return (this.f2405y & 32) == 32;
    }

    /* renamed from: k */
    public boolean mo3271k() {
        return (this.f2406z & 1) == 1;
    }

    /* renamed from: l */
    public boolean mo3272l() {
        return (this.f2406z & 2) == 2;
    }

    /* renamed from: d */
    public void mo3246d(boolean z) {
        if (z) {
            this.f2405y |= 32;
        } else {
            this.f2405y &= -33;
        }
    }

    /* renamed from: m */
    public boolean mo3273m() {
        return (this.f2406z & 4) == 4;
    }

    public void setShowAsAction(int i) {
        switch (i & 3) {
            case 0:
            case 1:
            case 2:
                this.f2406z = i;
                this.f2381a.mo3185b(this);
                return;
            default:
                throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
    }

    /* renamed from: a */
    public C0206b setActionView(View view) {
        this.f2376A = view;
        this.f2377B = null;
        if (view != null && view.getId() == -1 && this.f2382b > 0) {
            view.setId(this.f2382b);
        }
        this.f2381a.mo3185b(this);
        return this;
    }

    /* renamed from: a */
    public C0206b setActionView(int i) {
        Context f = this.f2381a.mo3201f();
        setActionView(LayoutInflater.from(f).inflate(i, new LinearLayout(f), false));
        return this;
    }

    public View getActionView() {
        if (this.f2376A != null) {
            return this.f2376A;
        }
        if (this.f2377B == null) {
            return null;
        }
        this.f2376A = this.f2377B.mo2054a((MenuItem) this);
        return this.f2376A;
    }

    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    /* renamed from: a */
    public C0572b mo494a() {
        return this.f2377B;
    }

    /* renamed from: a */
    public C0206b mo492a(C0572b bVar) {
        if (this.f2377B != null) {
            this.f2377B.mo2063f();
        }
        this.f2376A = null;
        this.f2377B = bVar;
        this.f2381a.mo3187b(true);
        if (this.f2377B != null) {
            this.f2377B.mo2056a((C0574b) new C0574b() {
                /* renamed from: a */
                public void mo2065a(boolean z) {
                    C0794j.this.f2381a.mo3165a(C0794j.this);
                }
            });
        }
        return this;
    }

    /* renamed from: b */
    public C0206b setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    public boolean expandActionView() {
        if (!mo3274n()) {
            return false;
        }
        if (this.f2378C == null || this.f2378C.onMenuItemActionExpand(this)) {
            return this.f2381a.mo3192c(this);
        }
        return false;
    }

    public boolean collapseActionView() {
        if ((this.f2406z & 8) == 0) {
            return false;
        }
        if (this.f2376A == null) {
            return true;
        }
        if (this.f2378C == null || this.f2378C.onMenuItemActionCollapse(this)) {
            return this.f2381a.mo3198d(this);
        }
        return false;
    }

    /* renamed from: n */
    public boolean mo3274n() {
        boolean z = false;
        if ((this.f2406z & 8) == 0) {
            return false;
        }
        if (this.f2376A == null && this.f2377B != null) {
            this.f2376A = this.f2377B.mo2054a((MenuItem) this);
        }
        if (this.f2376A != null) {
            z = true;
        }
        return z;
    }

    /* renamed from: e */
    public void mo3248e(boolean z) {
        this.f2379D = z;
        this.f2381a.mo3187b(false);
    }

    public boolean isActionViewExpanded() {
        return this.f2379D;
    }

    public MenuItem setOnActionExpandListener(OnActionExpandListener onActionExpandListener) {
        this.f2378C = onActionExpandListener;
        return this;
    }

    /* renamed from: a */
    public C0206b setContentDescription(CharSequence charSequence) {
        this.f2398r = charSequence;
        this.f2381a.mo3187b(false);
        return this;
    }

    public CharSequence getContentDescription() {
        return this.f2398r;
    }

    /* renamed from: b */
    public C0206b setTooltipText(CharSequence charSequence) {
        this.f2399s = charSequence;
        this.f2381a.mo3187b(false);
        return this;
    }

    public CharSequence getTooltipText() {
        return this.f2399s;
    }
}
