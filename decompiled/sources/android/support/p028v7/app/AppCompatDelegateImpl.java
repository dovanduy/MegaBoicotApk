package android.support.p028v7.app;

import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.support.p017v4.app.C0299s;
import android.support.p017v4.view.C0580d;
import android.support.p017v4.view.C0580d.C0581a;
import android.support.p017v4.view.C0582e;
import android.support.p017v4.view.C0592o;
import android.support.p017v4.view.C0595r;
import android.support.p017v4.view.C0602v;
import android.support.p017v4.view.C0606w;
import android.support.p017v4.view.C0607x;
import android.support.p017v4.view.C0609z;
import android.support.p028v7.p029a.C0672a.C0673a;
import android.support.p028v7.p029a.C0672a.C0675c;
import android.support.p028v7.p029a.C0672a.C0678f;
import android.support.p028v7.p029a.C0672a.C0679g;
import android.support.p028v7.p029a.C0672a.C0681i;
import android.support.p028v7.p029a.C0672a.C0682j;
import android.support.p028v7.p031c.p032a.C0740a;
import android.support.p028v7.view.C0762b;
import android.support.p028v7.view.C0762b.C0763a;
import android.support.p028v7.view.C0765d;
import android.support.p028v7.view.C0767f.C0768a;
import android.support.p028v7.view.C0769g;
import android.support.p028v7.view.C0774i;
import android.support.p028v7.view.menu.C0787f;
import android.support.p028v7.view.menu.C0790h;
import android.support.p028v7.view.menu.C0790h.C0791a;
import android.support.p028v7.view.menu.C0806o;
import android.support.p028v7.view.menu.C0806o.C0807a;
import android.support.p028v7.view.menu.C0808p;
import android.support.p028v7.widget.ActionBarContextView;
import android.support.p028v7.widget.C0977ay;
import android.support.p028v7.widget.C0987bd;
import android.support.p028v7.widget.C0994bg;
import android.support.p028v7.widget.C1007g;
import android.support.p028v7.widget.C1030t;
import android.support.p028v7.widget.C1052z;
import android.support.p028v7.widget.C1052z.C1053a;
import android.support.p028v7.widget.ContentFrameLayout;
import android.support.p028v7.widget.ContentFrameLayout.C0849a;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.LayoutInflater;
import android.view.LayoutInflater.Factory2;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewParent;
import android.view.Window;
import android.view.Window.Callback;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.facebook.ads.AdError;
import com.google.android.exoplayer2.extractor.MpegAudioHeader;
import java.lang.Thread.UncaughtExceptionHandler;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: android.support.v7.app.AppCompatDelegateImpl */
class AppCompatDelegateImpl extends C0719c implements C0791a, Factory2 {

    /* renamed from: u */
    private static final boolean f1897u = (VERSION.SDK_INT < 21);

    /* renamed from: v */
    private static final int[] f1898v = {16842836};

    /* renamed from: w */
    private static boolean f1899w = true;

    /* renamed from: A */
    private C0714f f1900A;

    /* renamed from: B */
    private boolean f1901B = true;

    /* renamed from: C */
    private boolean f1902C;

    /* renamed from: D */
    private ViewGroup f1903D;

    /* renamed from: E */
    private TextView f1904E;

    /* renamed from: F */
    private View f1905F;

    /* renamed from: G */
    private boolean f1906G;

    /* renamed from: H */
    private boolean f1907H;

    /* renamed from: I */
    private boolean f1908I;

    /* renamed from: J */
    private PanelFeatureState[] f1909J;

    /* renamed from: K */
    private PanelFeatureState f1910K;

    /* renamed from: L */
    private boolean f1911L;

    /* renamed from: M */
    private int f1912M = -100;

    /* renamed from: N */
    private boolean f1913N;

    /* renamed from: O */
    private C0711d f1914O;

    /* renamed from: P */
    private final Runnable f1915P = new Runnable() {
        public void run() {
            if ((AppCompatDelegateImpl.this.f1939t & 1) != 0) {
                AppCompatDelegateImpl.this.mo2687g(0);
            }
            if ((AppCompatDelegateImpl.this.f1939t & MpegAudioHeader.MAX_FRAME_SIZE_BYTES) != 0) {
                AppCompatDelegateImpl.this.mo2687g(108);
            }
            AppCompatDelegateImpl.this.f1938s = false;
            AppCompatDelegateImpl.this.f1939t = 0;
        }
    };

    /* renamed from: Q */
    private boolean f1916Q;

    /* renamed from: R */
    private Rect f1917R;

    /* renamed from: S */
    private Rect f1918S;

    /* renamed from: T */
    private AppCompatViewInflater f1919T;

    /* renamed from: a */
    final Context f1920a;

    /* renamed from: b */
    final Window f1921b;

    /* renamed from: c */
    final Callback f1922c;

    /* renamed from: d */
    final Callback f1923d;

    /* renamed from: e */
    final C0718b f1924e;

    /* renamed from: f */
    ActionBar f1925f;

    /* renamed from: g */
    MenuInflater f1926g;

    /* renamed from: h */
    C0762b f1927h;

    /* renamed from: i */
    ActionBarContextView f1928i;

    /* renamed from: j */
    PopupWindow f1929j;

    /* renamed from: k */
    Runnable f1930k;

    /* renamed from: l */
    C0602v f1931l = null;

    /* renamed from: m */
    boolean f1932m;

    /* renamed from: n */
    boolean f1933n;

    /* renamed from: o */
    boolean f1934o;

    /* renamed from: p */
    boolean f1935p;

    /* renamed from: q */
    boolean f1936q;

    /* renamed from: r */
    boolean f1937r;

    /* renamed from: s */
    boolean f1938s;

    /* renamed from: t */
    int f1939t;

    /* renamed from: x */
    private CharSequence f1940x;

    /* renamed from: y */
    private C1030t f1941y;

    /* renamed from: z */
    private C0707a f1942z;

    /* renamed from: android.support.v7.app.AppCompatDelegateImpl$PanelFeatureState */
    protected static final class PanelFeatureState {

        /* renamed from: a */
        int f1951a;

        /* renamed from: b */
        int f1952b;

        /* renamed from: c */
        int f1953c;

        /* renamed from: d */
        int f1954d;

        /* renamed from: e */
        int f1955e;

        /* renamed from: f */
        int f1956f;

        /* renamed from: g */
        ViewGroup f1957g;

        /* renamed from: h */
        View f1958h;

        /* renamed from: i */
        View f1959i;

        /* renamed from: j */
        C0790h f1960j;

        /* renamed from: k */
        C0787f f1961k;

        /* renamed from: l */
        Context f1962l;

        /* renamed from: m */
        boolean f1963m;

        /* renamed from: n */
        boolean f1964n;

        /* renamed from: o */
        boolean f1965o;

        /* renamed from: p */
        public boolean f1966p;

        /* renamed from: q */
        boolean f1967q = false;

        /* renamed from: r */
        boolean f1968r;

        /* renamed from: s */
        Bundle f1969s;

        /* renamed from: android.support.v7.app.AppCompatDelegateImpl$PanelFeatureState$SavedState */
        private static class SavedState implements Parcelable {
            public static final Creator<SavedState> CREATOR = new ClassLoaderCreator<SavedState>() {
                /* renamed from: a */
                public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                    return SavedState.m2835a(parcel, classLoader);
                }

                /* renamed from: a */
                public SavedState createFromParcel(Parcel parcel) {
                    return SavedState.m2835a(parcel, null);
                }

                /* renamed from: a */
                public SavedState[] newArray(int i) {
                    return new SavedState[i];
                }
            };

            /* renamed from: a */
            int f1970a;

            /* renamed from: b */
            boolean f1971b;

            /* renamed from: c */
            Bundle f1972c;

            public int describeContents() {
                return 0;
            }

            SavedState() {
            }

            public void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(this.f1970a);
                parcel.writeInt(this.f1971b ? 1 : 0);
                if (this.f1971b) {
                    parcel.writeBundle(this.f1972c);
                }
            }

            /* renamed from: a */
            static SavedState m2835a(Parcel parcel, ClassLoader classLoader) {
                SavedState savedState = new SavedState();
                savedState.f1970a = parcel.readInt();
                boolean z = true;
                if (parcel.readInt() != 1) {
                    z = false;
                }
                savedState.f1971b = z;
                if (savedState.f1971b) {
                    savedState.f1972c = parcel.readBundle(classLoader);
                }
                return savedState;
            }
        }

        PanelFeatureState(int i) {
            this.f1951a = i;
        }

        /* renamed from: a */
        public boolean mo2712a() {
            boolean z = false;
            if (this.f1958h == null) {
                return false;
            }
            if (this.f1959i != null) {
                return true;
            }
            if (this.f1961k.mo3137a().getCount() > 0) {
                z = true;
            }
            return z;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo2710a(Context context) {
            TypedValue typedValue = new TypedValue();
            Theme newTheme = context.getResources().newTheme();
            newTheme.setTo(context.getTheme());
            newTheme.resolveAttribute(C0673a.actionBarPopupTheme, typedValue, true);
            if (typedValue.resourceId != 0) {
                newTheme.applyStyle(typedValue.resourceId, true);
            }
            newTheme.resolveAttribute(C0673a.panelMenuListTheme, typedValue, true);
            if (typedValue.resourceId != 0) {
                newTheme.applyStyle(typedValue.resourceId, true);
            } else {
                newTheme.applyStyle(C0681i.Theme_AppCompat_CompactMenu, true);
            }
            C0765d dVar = new C0765d(context, 0);
            dVar.getTheme().setTo(newTheme);
            this.f1962l = dVar;
            TypedArray obtainStyledAttributes = dVar.obtainStyledAttributes(C0682j.AppCompatTheme);
            this.f1952b = obtainStyledAttributes.getResourceId(C0682j.AppCompatTheme_panelBackground, 0);
            this.f1956f = obtainStyledAttributes.getResourceId(C0682j.AppCompatTheme_android_windowAnimationStyle, 0);
            obtainStyledAttributes.recycle();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo2711a(C0790h hVar) {
            if (hVar != this.f1960j) {
                if (this.f1960j != null) {
                    this.f1960j.mo3186b((C0806o) this.f1961k);
                }
                this.f1960j = hVar;
                if (!(hVar == null || this.f1961k == null)) {
                    hVar.mo3166a((C0806o) this.f1961k);
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public C0808p mo2709a(C0807a aVar) {
            if (this.f1960j == null) {
                return null;
            }
            if (this.f1961k == null) {
                this.f1961k = new C0787f(this.f1962l, C0679g.abc_list_menu_item_layout);
                this.f1961k.mo3099a(aVar);
                this.f1960j.mo3166a((C0806o) this.f1961k);
            }
            return this.f1961k.mo3136a(this.f1957g);
        }
    }

    /* renamed from: android.support.v7.app.AppCompatDelegateImpl$a */
    private final class C0707a implements C0807a {
        C0707a() {
        }

        /* renamed from: a */
        public boolean mo2722a(C0790h hVar) {
            Callback l = AppCompatDelegateImpl.this.mo2693l();
            if (l != null) {
                l.onMenuOpened(108, hVar);
            }
            return true;
        }

        /* renamed from: a */
        public void mo2721a(C0790h hVar, boolean z) {
            AppCompatDelegateImpl.this.mo2673b(hVar);
        }
    }

    /* renamed from: android.support.v7.app.AppCompatDelegateImpl$b */
    class C0708b implements C0763a {

        /* renamed from: b */
        private C0763a f1975b;

        public C0708b(C0763a aVar) {
            this.f1975b = aVar;
        }

        /* renamed from: a */
        public boolean mo2724a(C0762b bVar, Menu menu) {
            return this.f1975b.mo2724a(bVar, menu);
        }

        /* renamed from: b */
        public boolean mo2726b(C0762b bVar, Menu menu) {
            return this.f1975b.mo2726b(bVar, menu);
        }

        /* renamed from: a */
        public boolean mo2725a(C0762b bVar, MenuItem menuItem) {
            return this.f1975b.mo2725a(bVar, menuItem);
        }

        /* renamed from: a */
        public void mo2723a(C0762b bVar) {
            this.f1975b.mo2723a(bVar);
            if (AppCompatDelegateImpl.this.f1929j != null) {
                AppCompatDelegateImpl.this.f1921b.getDecorView().removeCallbacks(AppCompatDelegateImpl.this.f1930k);
            }
            if (AppCompatDelegateImpl.this.f1928i != null) {
                AppCompatDelegateImpl.this.mo2700q();
                AppCompatDelegateImpl.this.f1931l = C0595r.m2263l(AppCompatDelegateImpl.this.f1928i).mo2118a(0.0f);
                AppCompatDelegateImpl.this.f1931l.mo2120a((C0606w) new C0607x() {
                    /* renamed from: b */
                    public void mo2132b(View view) {
                        AppCompatDelegateImpl.this.f1928i.setVisibility(8);
                        if (AppCompatDelegateImpl.this.f1929j != null) {
                            AppCompatDelegateImpl.this.f1929j.dismiss();
                        } else if (AppCompatDelegateImpl.this.f1928i.getParent() instanceof View) {
                            C0595r.m2267p((View) AppCompatDelegateImpl.this.f1928i.getParent());
                        }
                        AppCompatDelegateImpl.this.f1928i.removeAllViews();
                        AppCompatDelegateImpl.this.f1931l.mo2120a((C0606w) null);
                        AppCompatDelegateImpl.this.f1931l = null;
                    }
                });
            }
            if (AppCompatDelegateImpl.this.f1924e != null) {
                AppCompatDelegateImpl.this.f1924e.mo2631b(AppCompatDelegateImpl.this.f1927h);
            }
            AppCompatDelegateImpl.this.f1927h = null;
        }
    }

    /* renamed from: android.support.v7.app.AppCompatDelegateImpl$c */
    class C0710c extends C0774i {
        public void onContentChanged() {
        }

        C0710c(Callback callback) {
            super(callback);
        }

        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return AppCompatDelegateImpl.this.mo2668a(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
            return super.dispatchKeyShortcutEvent(keyEvent) || AppCompatDelegateImpl.this.mo2666a(keyEvent.getKeyCode(), keyEvent);
        }

        public boolean onCreatePanelMenu(int i, Menu menu) {
            if (i != 0 || (menu instanceof C0790h)) {
                return super.onCreatePanelMenu(i, menu);
            }
            return false;
        }

        public boolean onPreparePanel(int i, View view, Menu menu) {
            C0790h hVar = menu instanceof C0790h ? (C0790h) menu : null;
            if (i == 0 && hVar == null) {
                return false;
            }
            if (hVar != null) {
                hVar.mo3190c(true);
            }
            boolean onPreparePanel = super.onPreparePanel(i, view, menu);
            if (hVar != null) {
                hVar.mo3190c(false);
            }
            return onPreparePanel;
        }

        public boolean onMenuOpened(int i, Menu menu) {
            super.onMenuOpened(i, menu);
            AppCompatDelegateImpl.this.mo2683e(i);
            return true;
        }

        public void onPanelClosed(int i, Menu menu) {
            super.onPanelClosed(i, menu);
            AppCompatDelegateImpl.this.mo2681d(i);
        }

        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            if (VERSION.SDK_INT >= 23) {
                return null;
            }
            if (AppCompatDelegateImpl.this.mo2699p()) {
                return mo2727a(callback);
            }
            return super.onWindowStartingActionMode(callback);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final ActionMode mo2727a(ActionMode.Callback callback) {
            C0768a aVar = new C0768a(AppCompatDelegateImpl.this.f1920a, callback);
            C0762b a = AppCompatDelegateImpl.this.mo2654a((C0763a) aVar);
            if (a != null) {
                return aVar.mo2983b(a);
            }
            return null;
        }

        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
            if (!AppCompatDelegateImpl.this.mo2699p() || i != 0) {
                return super.onWindowStartingActionMode(callback, i);
            }
            return mo2727a(callback);
        }

        public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i) {
            PanelFeatureState a = AppCompatDelegateImpl.this.mo2652a(0, true);
            if (a == null || a.f1960j == null) {
                super.onProvideKeyboardShortcuts(list, menu, i);
            } else {
                super.onProvideKeyboardShortcuts(list, a.f1960j, i);
            }
        }
    }

    /* renamed from: android.support.v7.app.AppCompatDelegateImpl$d */
    final class C0711d {

        /* renamed from: b */
        private C0727h f1979b;

        /* renamed from: c */
        private boolean f1980c;

        /* renamed from: d */
        private BroadcastReceiver f1981d;

        /* renamed from: e */
        private IntentFilter f1982e;

        C0711d(C0727h hVar) {
            this.f1979b = hVar;
            this.f1980c = hVar.mo2786a();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public int mo2738a() {
            this.f1980c = this.f1979b.mo2786a();
            return this.f1980c ? 2 : 1;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo2739b() {
            boolean a = this.f1979b.mo2786a();
            if (a != this.f1980c) {
                this.f1980c = a;
                AppCompatDelegateImpl.this.mo2691i();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public void mo2740c() {
            mo2741d();
            if (this.f1981d == null) {
                this.f1981d = new BroadcastReceiver() {
                    public void onReceive(Context context, Intent intent) {
                        C0711d.this.mo2739b();
                    }
                };
            }
            if (this.f1982e == null) {
                this.f1982e = new IntentFilter();
                this.f1982e.addAction("android.intent.action.TIME_SET");
                this.f1982e.addAction("android.intent.action.TIMEZONE_CHANGED");
                this.f1982e.addAction("android.intent.action.TIME_TICK");
            }
            AppCompatDelegateImpl.this.f1920a.registerReceiver(this.f1981d, this.f1982e);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public void mo2741d() {
            if (this.f1981d != null) {
                AppCompatDelegateImpl.this.f1920a.unregisterReceiver(this.f1981d);
                this.f1981d = null;
            }
        }
    }

    /* renamed from: android.support.v7.app.AppCompatDelegateImpl$e */
    private class C0713e extends ContentFrameLayout {
        public C0713e(Context context) {
            super(context);
        }

        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return AppCompatDelegateImpl.this.mo2668a(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() != 0 || !m2851a((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return super.onInterceptTouchEvent(motionEvent);
            }
            AppCompatDelegateImpl.this.mo2685f(0);
            return true;
        }

        public void setBackgroundResource(int i) {
            setBackgroundDrawable(C0740a.m3008b(getContext(), i));
        }

        /* renamed from: a */
        private boolean m2851a(int i, int i2) {
            return i < -5 || i2 < -5 || i > getWidth() + 5 || i2 > getHeight() + 5;
        }
    }

    /* renamed from: android.support.v7.app.AppCompatDelegateImpl$f */
    private final class C0714f implements C0807a {
        C0714f() {
        }

        /* renamed from: a */
        public void mo2721a(C0790h hVar, boolean z) {
            C0790h q = hVar.mo3218q();
            boolean z2 = q != hVar;
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            if (z2) {
                hVar = q;
            }
            PanelFeatureState a = appCompatDelegateImpl.mo2653a((Menu) hVar);
            if (a == null) {
                return;
            }
            if (z2) {
                AppCompatDelegateImpl.this.mo2657a(a.f1951a, a, q);
                AppCompatDelegateImpl.this.mo2660a(a, true);
                return;
            }
            AppCompatDelegateImpl.this.mo2660a(a, z);
        }

        /* renamed from: a */
        public boolean mo2722a(C0790h hVar) {
            if (hVar == null && AppCompatDelegateImpl.this.f1932m) {
                Callback l = AppCompatDelegateImpl.this.mo2693l();
                if (l != null && !AppCompatDelegateImpl.this.f1937r) {
                    l.onMenuOpened(108, hVar);
                }
            }
            return true;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2664a(ViewGroup viewGroup) {
    }

    static {
        if (f1897u && !f1899w) {
            final UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
            Thread.setDefaultUncaughtExceptionHandler(new UncaughtExceptionHandler() {
                public void uncaughtException(Thread thread, Throwable th) {
                    if (m2822a(th)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(th.getMessage());
                        sb.append(". If the resource you are trying to use is a vector resource, you may be referencing it in an unsupported way. See AppCompatDelegate.setCompatVectorFromResourcesEnabled() for more info.");
                        NotFoundException notFoundException = new NotFoundException(sb.toString());
                        notFoundException.initCause(th.getCause());
                        notFoundException.setStackTrace(th.getStackTrace());
                        defaultUncaughtExceptionHandler.uncaughtException(thread, notFoundException);
                        return;
                    }
                    defaultUncaughtExceptionHandler.uncaughtException(thread, th);
                }

                /* renamed from: a */
                private boolean m2822a(Throwable th) {
                    boolean z = false;
                    if (!(th instanceof NotFoundException)) {
                        return false;
                    }
                    String message = th.getMessage();
                    if (message != null && (message.contains("drawable") || message.contains("Drawable"))) {
                        z = true;
                    }
                    return z;
                }
            });
        }
    }

    AppCompatDelegateImpl(Context context, Window window, C0718b bVar) {
        this.f1920a = context;
        this.f1921b = window;
        this.f1924e = bVar;
        this.f1922c = this.f1921b.getCallback();
        if (this.f1922c instanceof C0710c) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        this.f1923d = new C0710c(this.f1922c);
        this.f1921b.setCallback(this.f1923d);
        C0977ay a = C0977ay.m4366a(context, (AttributeSet) null, f1898v);
        Drawable b = a.mo5090b(0);
        if (b != null) {
            this.f1921b.setBackgroundDrawable(b);
        }
        a.mo5087a();
    }

    /* renamed from: a */
    public void mo2659a(Bundle bundle) {
        if (this.f1922c instanceof Activity) {
            String str = null;
            try {
                str = C0299s.m1075b((Activity) this.f1922c);
            } catch (IllegalArgumentException unused) {
            }
            if (str != null) {
                ActionBar k = mo2692k();
                if (k == null) {
                    this.f1916Q = true;
                } else {
                    k.mo2581c(true);
                }
            }
        }
        if (bundle != null && this.f1912M == -100) {
            this.f1912M = bundle.getInt("appcompat:local_night_mode", -100);
        }
    }

    /* renamed from: b */
    public void mo2672b(Bundle bundle) {
        m2766u();
    }

    /* renamed from: a */
    public ActionBar mo2651a() {
        m2765t();
        return this.f1925f;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: k */
    public final ActionBar mo2692k() {
        return this.f1925f;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: l */
    public final Callback mo2693l() {
        return this.f1921b.getCallback();
    }

    /* renamed from: t */
    private void m2765t() {
        m2766u();
        if (this.f1932m && this.f1925f == null) {
            if (this.f1922c instanceof Activity) {
                this.f1925f = new C0729i((Activity) this.f1922c, this.f1933n);
            } else if (this.f1922c instanceof Dialog) {
                this.f1925f = new C0729i((Dialog) this.f1922c);
            }
            if (this.f1925f != null) {
                this.f1925f.mo2581c(this.f1916Q);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: m */
    public final Context mo2694m() {
        ActionBar a = mo2651a();
        Context b = a != null ? a.mo2579b() : null;
        return b == null ? this.f1920a : b;
    }

    /* renamed from: b */
    public MenuInflater mo2670b() {
        if (this.f1926g == null) {
            m2765t();
            this.f1926g = new C0769g(this.f1925f != null ? this.f1925f.mo2579b() : this.f1920a);
        }
        return this.f1926g;
    }

    /* renamed from: a */
    public <T extends View> T mo2655a(int i) {
        m2766u();
        return this.f1921b.findViewById(i);
    }

    /* renamed from: a */
    public void mo2658a(Configuration configuration) {
        if (this.f1932m && this.f1902C) {
            ActionBar a = mo2651a();
            if (a != null) {
                a.mo2574a(configuration);
            }
        }
        C1007g.m4568a().mo5241a(this.f1920a);
        mo2691i();
    }

    /* renamed from: c */
    public void mo2676c() {
        mo2691i();
    }

    /* renamed from: d */
    public void mo2680d() {
        ActionBar a = mo2651a();
        if (a != null) {
            a.mo2583d(false);
        }
        if (this.f1914O != null) {
            this.f1914O.mo2741d();
        }
    }

    /* renamed from: e */
    public void mo2682e() {
        ActionBar a = mo2651a();
        if (a != null) {
            a.mo2583d(true);
        }
    }

    /* renamed from: a */
    public void mo2662a(View view) {
        m2766u();
        ViewGroup viewGroup = (ViewGroup) this.f1903D.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f1922c.onContentChanged();
    }

    /* renamed from: b */
    public void mo2671b(int i) {
        m2766u();
        ViewGroup viewGroup = (ViewGroup) this.f1903D.findViewById(16908290);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f1920a).inflate(i, viewGroup);
        this.f1922c.onContentChanged();
    }

    /* renamed from: a */
    public void mo2663a(View view, LayoutParams layoutParams) {
        m2766u();
        ViewGroup viewGroup = (ViewGroup) this.f1903D.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f1922c.onContentChanged();
    }

    /* renamed from: b */
    public void mo2674b(View view, LayoutParams layoutParams) {
        m2766u();
        ((ViewGroup) this.f1903D.findViewById(16908290)).addView(view, layoutParams);
        this.f1922c.onContentChanged();
    }

    /* renamed from: c */
    public void mo2677c(Bundle bundle) {
        if (this.f1912M != -100) {
            bundle.putInt("appcompat:local_night_mode", this.f1912M);
        }
    }

    /* renamed from: g */
    public void mo2686g() {
        if (this.f1938s) {
            this.f1921b.getDecorView().removeCallbacks(this.f1915P);
        }
        this.f1937r = true;
        if (this.f1925f != null) {
            this.f1925f.mo2588g();
        }
        if (this.f1914O != null) {
            this.f1914O.mo2741d();
        }
    }

    /* renamed from: u */
    private void m2766u() {
        if (!this.f1902C) {
            this.f1903D = m2767v();
            CharSequence n = mo2695n();
            if (!TextUtils.isEmpty(n)) {
                if (this.f1941y != null) {
                    this.f1941y.setWindowTitle(n);
                } else if (mo2692k() != null) {
                    mo2692k().mo2575a(n);
                } else if (this.f1904E != null) {
                    this.f1904E.setText(n);
                }
            }
            m2768w();
            mo2664a(this.f1903D);
            this.f1902C = true;
            PanelFeatureState a = mo2652a(0, false);
            if (this.f1937r) {
                return;
            }
            if (a == null || a.f1960j == null) {
                m2762j(108);
            }
        }
    }

    /* renamed from: v */
    private ViewGroup m2767v() {
        ViewGroup viewGroup;
        Context context;
        TypedArray obtainStyledAttributes = this.f1920a.obtainStyledAttributes(C0682j.AppCompatTheme);
        if (!obtainStyledAttributes.hasValue(C0682j.AppCompatTheme_windowActionBar)) {
            obtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        if (obtainStyledAttributes.getBoolean(C0682j.AppCompatTheme_windowNoTitle, false)) {
            mo2678c(1);
        } else if (obtainStyledAttributes.getBoolean(C0682j.AppCompatTheme_windowActionBar, false)) {
            mo2678c(108);
        }
        if (obtainStyledAttributes.getBoolean(C0682j.AppCompatTheme_windowActionBarOverlay, false)) {
            mo2678c(109);
        }
        if (obtainStyledAttributes.getBoolean(C0682j.AppCompatTheme_windowActionModeOverlay, false)) {
            mo2678c(10);
        }
        this.f1935p = obtainStyledAttributes.getBoolean(C0682j.AppCompatTheme_android_windowIsFloating, false);
        obtainStyledAttributes.recycle();
        this.f1921b.getDecorView();
        LayoutInflater from = LayoutInflater.from(this.f1920a);
        if (this.f1936q) {
            if (this.f1934o) {
                viewGroup = (ViewGroup) from.inflate(C0679g.abc_screen_simple_overlay_action_mode, null);
            } else {
                viewGroup = (ViewGroup) from.inflate(C0679g.abc_screen_simple, null);
            }
            if (VERSION.SDK_INT >= 21) {
                C0595r.m2241a((View) viewGroup, (C0592o) new C0592o() {
                    /* renamed from: a */
                    public C0609z mo427a(View view, C0609z zVar) {
                        int b = zVar.mo2137b();
                        int h = AppCompatDelegateImpl.this.mo2688h(b);
                        if (b != h) {
                            zVar = zVar.mo2136a(zVar.mo2135a(), h, zVar.mo2138c(), zVar.mo2139d());
                        }
                        return C0595r.m2231a(view, zVar);
                    }
                });
            } else {
                ((C1052z) viewGroup).setOnFitSystemWindowsListener(new C1053a() {
                    /* renamed from: a */
                    public void mo2705a(Rect rect) {
                        rect.top = AppCompatDelegateImpl.this.mo2688h(rect.top);
                    }
                });
            }
        } else if (this.f1935p) {
            viewGroup = (ViewGroup) from.inflate(C0679g.abc_dialog_title_material, null);
            this.f1933n = false;
            this.f1932m = false;
        } else if (this.f1932m) {
            TypedValue typedValue = new TypedValue();
            this.f1920a.getTheme().resolveAttribute(C0673a.actionBarTheme, typedValue, true);
            if (typedValue.resourceId != 0) {
                context = new C0765d(this.f1920a, typedValue.resourceId);
            } else {
                context = this.f1920a;
            }
            viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(C0679g.abc_screen_toolbar, null);
            this.f1941y = (C1030t) viewGroup.findViewById(C0678f.decor_content_parent);
            this.f1941y.setWindowCallback(mo2693l());
            if (this.f1933n) {
                this.f1941y.mo3464a(109);
            }
            if (this.f1906G) {
                this.f1941y.mo3464a(2);
            }
            if (this.f1907H) {
                this.f1941y.mo3464a(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("AppCompat does not support the current theme features: { windowActionBar: ");
            sb.append(this.f1932m);
            sb.append(", windowActionBarOverlay: ");
            sb.append(this.f1933n);
            sb.append(", android:windowIsFloating: ");
            sb.append(this.f1935p);
            sb.append(", windowActionModeOverlay: ");
            sb.append(this.f1934o);
            sb.append(", windowNoTitle: ");
            sb.append(this.f1936q);
            sb.append(" }");
            throw new IllegalArgumentException(sb.toString());
        }
        if (this.f1941y == null) {
            this.f1904E = (TextView) viewGroup.findViewById(C0678f.title);
        }
        C0994bg.m4487b(viewGroup);
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(C0678f.action_bar_activity_content);
        ViewGroup viewGroup2 = (ViewGroup) this.f1921b.findViewById(16908290);
        if (viewGroup2 != null) {
            while (viewGroup2.getChildCount() > 0) {
                View childAt = viewGroup2.getChildAt(0);
                viewGroup2.removeViewAt(0);
                contentFrameLayout.addView(childAt);
            }
            viewGroup2.setId(-1);
            contentFrameLayout.setId(16908290);
            if (viewGroup2 instanceof FrameLayout) {
                ((FrameLayout) viewGroup2).setForeground(null);
            }
        }
        this.f1921b.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new C0849a() {
            /* renamed from: a */
            public void mo2706a() {
            }

            /* renamed from: b */
            public void mo2707b() {
                AppCompatDelegateImpl.this.mo2702s();
            }
        });
        return viewGroup;
    }

    /* renamed from: w */
    private void m2768w() {
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) this.f1903D.findViewById(16908290);
        View decorView = this.f1921b.getDecorView();
        contentFrameLayout.mo3789a(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        TypedArray obtainStyledAttributes = this.f1920a.obtainStyledAttributes(C0682j.AppCompatTheme);
        obtainStyledAttributes.getValue(C0682j.AppCompatTheme_windowMinWidthMajor, contentFrameLayout.getMinWidthMajor());
        obtainStyledAttributes.getValue(C0682j.AppCompatTheme_windowMinWidthMinor, contentFrameLayout.getMinWidthMinor());
        if (obtainStyledAttributes.hasValue(C0682j.AppCompatTheme_windowFixedWidthMajor)) {
            obtainStyledAttributes.getValue(C0682j.AppCompatTheme_windowFixedWidthMajor, contentFrameLayout.getFixedWidthMajor());
        }
        if (obtainStyledAttributes.hasValue(C0682j.AppCompatTheme_windowFixedWidthMinor)) {
            obtainStyledAttributes.getValue(C0682j.AppCompatTheme_windowFixedWidthMinor, contentFrameLayout.getFixedWidthMinor());
        }
        if (obtainStyledAttributes.hasValue(C0682j.AppCompatTheme_windowFixedHeightMajor)) {
            obtainStyledAttributes.getValue(C0682j.AppCompatTheme_windowFixedHeightMajor, contentFrameLayout.getFixedHeightMajor());
        }
        if (obtainStyledAttributes.hasValue(C0682j.AppCompatTheme_windowFixedHeightMinor)) {
            obtainStyledAttributes.getValue(C0682j.AppCompatTheme_windowFixedHeightMinor, contentFrameLayout.getFixedHeightMinor());
        }
        obtainStyledAttributes.recycle();
        contentFrameLayout.requestLayout();
    }

    /* renamed from: c */
    public boolean mo2678c(int i) {
        int k = m2763k(i);
        if (this.f1936q && k == 108) {
            return false;
        }
        if (this.f1932m && k == 1) {
            this.f1932m = false;
        }
        switch (k) {
            case 1:
                m2769x();
                this.f1936q = true;
                return true;
            case 2:
                m2769x();
                this.f1906G = true;
                return true;
            case 5:
                m2769x();
                this.f1907H = true;
                return true;
            case 10:
                m2769x();
                this.f1934o = true;
                return true;
            case 108:
                m2769x();
                this.f1932m = true;
                return true;
            case 109:
                m2769x();
                this.f1933n = true;
                return true;
            default:
                return this.f1921b.requestFeature(k);
        }
    }

    /* renamed from: a */
    public final void mo2665a(CharSequence charSequence) {
        this.f1940x = charSequence;
        if (this.f1941y != null) {
            this.f1941y.setWindowTitle(charSequence);
        } else if (mo2692k() != null) {
            mo2692k().mo2575a(charSequence);
        } else if (this.f1904E != null) {
            this.f1904E.setText(charSequence);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: n */
    public final CharSequence mo2695n() {
        if (this.f1922c instanceof Activity) {
            return ((Activity) this.f1922c).getTitle();
        }
        return this.f1940x;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public void mo2681d(int i) {
        if (i == 108) {
            ActionBar a = mo2651a();
            if (a != null) {
                a.mo2585e(false);
            }
        } else if (i == 0) {
            PanelFeatureState a2 = mo2652a(i, true);
            if (a2.f1965o) {
                mo2660a(a2, false);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public void mo2683e(int i) {
        if (i == 108) {
            ActionBar a = mo2651a();
            if (a != null) {
                a.mo2585e(true);
            }
        }
    }

    /* renamed from: a */
    public boolean mo2667a(C0790h hVar, MenuItem menuItem) {
        Callback l = mo2693l();
        if (l != null && !this.f1937r) {
            PanelFeatureState a = mo2653a((Menu) hVar.mo3218q());
            if (a != null) {
                return l.onMenuItemSelected(a.f1951a, menuItem);
            }
        }
        return false;
    }

    /* renamed from: a */
    public void mo2661a(C0790h hVar) {
        m2753a(hVar, true);
    }

    /* renamed from: a */
    public C0762b mo2654a(C0763a aVar) {
        if (aVar == null) {
            throw new IllegalArgumentException("ActionMode callback can not be null.");
        }
        if (this.f1927h != null) {
            this.f1927h.mo2808c();
        }
        C0708b bVar = new C0708b(aVar);
        ActionBar a = mo2651a();
        if (a != null) {
            this.f1927h = a.mo2572a((C0763a) bVar);
            if (!(this.f1927h == null || this.f1924e == null)) {
                this.f1924e.mo2626a(this.f1927h);
            }
        }
        if (this.f1927h == null) {
            this.f1927h = mo2669b((C0763a) bVar);
        }
        return this.f1927h;
    }

    /* renamed from: f */
    public void mo2684f() {
        ActionBar a = mo2651a();
        if (a == null || !a.mo2586e()) {
            m2762j(0);
        }
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x002d  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.support.p028v7.view.C0762b mo2669b(android.support.p028v7.view.C0762b.C0763a r8) {
        /*
            r7 = this;
            r7.mo2700q()
            android.support.v7.view.b r0 = r7.f1927h
            if (r0 == 0) goto L_0x000c
            android.support.v7.view.b r0 = r7.f1927h
            r0.mo2808c()
        L_0x000c:
            boolean r0 = r8 instanceof android.support.p028v7.app.AppCompatDelegateImpl.C0708b
            if (r0 != 0) goto L_0x0016
            android.support.v7.app.AppCompatDelegateImpl$b r0 = new android.support.v7.app.AppCompatDelegateImpl$b
            r0.<init>(r8)
            r8 = r0
        L_0x0016:
            android.support.v7.app.b r0 = r7.f1924e
            r1 = 0
            if (r0 == 0) goto L_0x0026
            boolean r0 = r7.f1937r
            if (r0 != 0) goto L_0x0026
            android.support.v7.app.b r0 = r7.f1924e     // Catch:{ AbstractMethodError -> 0x0026 }
            android.support.v7.view.b r0 = r0.mo2624a(r8)     // Catch:{ AbstractMethodError -> 0x0026 }
            goto L_0x0027
        L_0x0026:
            r0 = r1
        L_0x0027:
            if (r0 == 0) goto L_0x002d
            r7.f1927h = r0
            goto L_0x016a
        L_0x002d:
            android.support.v7.widget.ActionBarContextView r0 = r7.f1928i
            r2 = 0
            r3 = 1
            if (r0 != 0) goto L_0x00da
            boolean r0 = r7.f1935p
            if (r0 == 0) goto L_0x00bb
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            android.content.Context r4 = r7.f1920a
            android.content.res.Resources$Theme r4 = r4.getTheme()
            int r5 = android.support.p028v7.p029a.C0672a.C0673a.actionBarTheme
            r4.resolveAttribute(r5, r0, r3)
            int r5 = r0.resourceId
            if (r5 == 0) goto L_0x006c
            android.content.Context r5 = r7.f1920a
            android.content.res.Resources r5 = r5.getResources()
            android.content.res.Resources$Theme r5 = r5.newTheme()
            r5.setTo(r4)
            int r4 = r0.resourceId
            r5.applyStyle(r4, r3)
            android.support.v7.view.d r4 = new android.support.v7.view.d
            android.content.Context r6 = r7.f1920a
            r4.<init>(r6, r2)
            android.content.res.Resources$Theme r6 = r4.getTheme()
            r6.setTo(r5)
            goto L_0x006e
        L_0x006c:
            android.content.Context r4 = r7.f1920a
        L_0x006e:
            android.support.v7.widget.ActionBarContextView r5 = new android.support.v7.widget.ActionBarContextView
            r5.<init>(r4)
            r7.f1928i = r5
            android.widget.PopupWindow r5 = new android.widget.PopupWindow
            int r6 = android.support.p028v7.p029a.C0672a.C0673a.actionModePopupWindowStyle
            r5.<init>(r4, r1, r6)
            r7.f1929j = r5
            android.widget.PopupWindow r5 = r7.f1929j
            r6 = 2
            android.support.p017v4.widget.C0658m.m2605a(r5, r6)
            android.widget.PopupWindow r5 = r7.f1929j
            android.support.v7.widget.ActionBarContextView r6 = r7.f1928i
            r5.setContentView(r6)
            android.widget.PopupWindow r5 = r7.f1929j
            r6 = -1
            r5.setWidth(r6)
            android.content.res.Resources$Theme r5 = r4.getTheme()
            int r6 = android.support.p028v7.p029a.C0672a.C0673a.actionBarSize
            r5.resolveAttribute(r6, r0, r3)
            int r0 = r0.data
            android.content.res.Resources r4 = r4.getResources()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            int r0 = android.util.TypedValue.complexToDimensionPixelSize(r0, r4)
            android.support.v7.widget.ActionBarContextView r4 = r7.f1928i
            r4.setContentHeight(r0)
            android.widget.PopupWindow r0 = r7.f1929j
            r4 = -2
            r0.setHeight(r4)
            android.support.v7.app.AppCompatDelegateImpl$6 r0 = new android.support.v7.app.AppCompatDelegateImpl$6
            r0.<init>()
            r7.f1930k = r0
            goto L_0x00da
        L_0x00bb:
            android.view.ViewGroup r0 = r7.f1903D
            int r4 = android.support.p028v7.p029a.C0672a.C0678f.action_mode_bar_stub
            android.view.View r0 = r0.findViewById(r4)
            android.support.v7.widget.ViewStubCompat r0 = (android.support.p028v7.widget.ViewStubCompat) r0
            if (r0 == 0) goto L_0x00da
            android.content.Context r4 = r7.mo2694m()
            android.view.LayoutInflater r4 = android.view.LayoutInflater.from(r4)
            r0.setLayoutInflater(r4)
            android.view.View r0 = r0.mo4846a()
            android.support.v7.widget.ActionBarContextView r0 = (android.support.p028v7.widget.ActionBarContextView) r0
            r7.f1928i = r0
        L_0x00da:
            android.support.v7.widget.ActionBarContextView r0 = r7.f1928i
            if (r0 == 0) goto L_0x016a
            r7.mo2700q()
            android.support.v7.widget.ActionBarContextView r0 = r7.f1928i
            r0.mo3441c()
            android.support.v7.view.e r0 = new android.support.v7.view.e
            android.support.v7.widget.ActionBarContextView r4 = r7.f1928i
            android.content.Context r4 = r4.getContext()
            android.support.v7.widget.ActionBarContextView r5 = r7.f1928i
            android.widget.PopupWindow r6 = r7.f1929j
            if (r6 != 0) goto L_0x00f5
            goto L_0x00f6
        L_0x00f5:
            r3 = r2
        L_0x00f6:
            r0.<init>(r4, r5, r8, r3)
            android.view.Menu r3 = r0.mo2805b()
            boolean r8 = r8.mo2724a(r0, r3)
            if (r8 == 0) goto L_0x0168
            r0.mo2809d()
            android.support.v7.widget.ActionBarContextView r8 = r7.f1928i
            r8.mo3438a(r0)
            r7.f1927h = r0
            boolean r8 = r7.mo2696o()
            r0 = 1065353216(0x3f800000, float:1.0)
            if (r8 == 0) goto L_0x0132
            android.support.v7.widget.ActionBarContextView r8 = r7.f1928i
            r1 = 0
            r8.setAlpha(r1)
            android.support.v7.widget.ActionBarContextView r8 = r7.f1928i
            android.support.v4.view.v r8 = android.support.p017v4.view.C0595r.m2263l(r8)
            android.support.v4.view.v r8 = r8.mo2118a(r0)
            r7.f1931l = r8
            android.support.v4.view.v r8 = r7.f1931l
            android.support.v7.app.AppCompatDelegateImpl$7 r0 = new android.support.v7.app.AppCompatDelegateImpl$7
            r0.<init>()
            r8.mo2120a(r0)
            goto L_0x0158
        L_0x0132:
            android.support.v7.widget.ActionBarContextView r8 = r7.f1928i
            r8.setAlpha(r0)
            android.support.v7.widget.ActionBarContextView r8 = r7.f1928i
            r8.setVisibility(r2)
            android.support.v7.widget.ActionBarContextView r8 = r7.f1928i
            r0 = 32
            r8.sendAccessibilityEvent(r0)
            android.support.v7.widget.ActionBarContextView r8 = r7.f1928i
            android.view.ViewParent r8 = r8.getParent()
            boolean r8 = r8 instanceof android.view.View
            if (r8 == 0) goto L_0x0158
            android.support.v7.widget.ActionBarContextView r8 = r7.f1928i
            android.view.ViewParent r8 = r8.getParent()
            android.view.View r8 = (android.view.View) r8
            android.support.p017v4.view.C0595r.m2267p(r8)
        L_0x0158:
            android.widget.PopupWindow r8 = r7.f1929j
            if (r8 == 0) goto L_0x016a
            android.view.Window r8 = r7.f1921b
            android.view.View r8 = r8.getDecorView()
            java.lang.Runnable r0 = r7.f1930k
            r8.post(r0)
            goto L_0x016a
        L_0x0168:
            r7.f1927h = r1
        L_0x016a:
            android.support.v7.view.b r8 = r7.f1927h
            if (r8 == 0) goto L_0x0179
            android.support.v7.app.b r8 = r7.f1924e
            if (r8 == 0) goto L_0x0179
            android.support.v7.app.b r8 = r7.f1924e
            android.support.v7.view.b r0 = r7.f1927h
            r8.mo2626a(r0)
        L_0x0179:
            android.support.v7.view.b r8 = r7.f1927h
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p028v7.app.AppCompatDelegateImpl.mo2669b(android.support.v7.view.b$a):android.support.v7.view.b");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: o */
    public final boolean mo2696o() {
        return this.f1902C && this.f1903D != null && C0595r.m2274w(this.f1903D);
    }

    /* renamed from: p */
    public boolean mo2699p() {
        return this.f1901B;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: q */
    public void mo2700q() {
        if (this.f1931l != null) {
            this.f1931l.mo2125b();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: r */
    public boolean mo2701r() {
        if (this.f1927h != null) {
            this.f1927h.mo2808c();
            return true;
        }
        ActionBar a = mo2651a();
        if (a == null || !a.mo2587f()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo2666a(int i, KeyEvent keyEvent) {
        ActionBar a = mo2651a();
        if (a != null && a.mo2577a(i, keyEvent)) {
            return true;
        }
        if (this.f1910K == null || !m2755a(this.f1910K, keyEvent.getKeyCode(), keyEvent, 1)) {
            if (this.f1910K == null) {
                PanelFeatureState a2 = mo2652a(0, true);
                m2758b(a2, keyEvent);
                boolean a3 = m2755a(a2, keyEvent.getKeyCode(), keyEvent, 1);
                a2.f1963m = false;
                if (a3) {
                    return true;
                }
            }
            return false;
        }
        if (this.f1910K != null) {
            this.f1910K.f1964n = true;
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo2668a(KeyEvent keyEvent) {
        boolean z = true;
        if ((this.f1922c instanceof C0581a) || (this.f1922c instanceof C0720d)) {
            View decorView = this.f1921b.getDecorView();
            if (decorView != null && C0580d.m2186a(decorView, keyEvent)) {
                return true;
            }
        }
        if (keyEvent.getKeyCode() == 82 && this.f1922c.dispatchKeyEvent(keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyEvent.getAction() != 0) {
            z = false;
        }
        return z ? mo2679c(keyCode, keyEvent) : mo2675b(keyCode, keyEvent);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public boolean mo2675b(int i, KeyEvent keyEvent) {
        if (i == 4) {
            boolean z = this.f1911L;
            this.f1911L = false;
            PanelFeatureState a = mo2652a(0, false);
            if (a != null && a.f1965o) {
                if (!z) {
                    mo2660a(a, true);
                }
                return true;
            } else if (mo2701r()) {
                return true;
            }
        } else if (i == 82) {
            m2761e(0, keyEvent);
            return true;
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public boolean mo2679c(int i, KeyEvent keyEvent) {
        boolean z = true;
        if (i == 4) {
            if ((keyEvent.getFlags() & 128) == 0) {
                z = false;
            }
            this.f1911L = z;
        } else if (i == 82) {
            m2760d(0, keyEvent);
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public View mo2656a(View view, String str, Context context, AttributeSet attributeSet) {
        boolean z = false;
        if (this.f1919T == null) {
            String string = this.f1920a.obtainStyledAttributes(C0682j.AppCompatTheme).getString(C0682j.AppCompatTheme_viewInflaterClass);
            if (string == null || AppCompatViewInflater.class.getName().equals(string)) {
                this.f1919T = new AppCompatViewInflater();
            } else {
                try {
                    this.f1919T = (AppCompatViewInflater) Class.forName(string).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (Throwable th) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Failed to instantiate custom view inflater ");
                    sb.append(string);
                    sb.append(". Falling back to default.");
                    Log.i("AppCompatDelegate", sb.toString(), th);
                    this.f1919T = new AppCompatViewInflater();
                }
            }
        }
        if (f1897u) {
            if (!(attributeSet instanceof XmlPullParser)) {
                z = m2756a((ViewParent) view);
            } else if (((XmlPullParser) attributeSet).getDepth() > 1) {
                z = true;
            }
        }
        return this.f1919T.mo2748a(view, str, context, attributeSet, z, f1897u, true, C0987bd.m4446a());
    }

    /* renamed from: a */
    private boolean m2756a(ViewParent viewParent) {
        if (viewParent == null) {
            return false;
        }
        View decorView = this.f1921b.getDecorView();
        while (viewParent != null) {
            if (viewParent == decorView || !(viewParent instanceof View) || C0595r.m2276y((View) viewParent)) {
                return false;
            }
            viewParent = viewParent.getParent();
        }
        return true;
    }

    /* renamed from: h */
    public void mo2689h() {
        LayoutInflater from = LayoutInflater.from(this.f1920a);
        if (from.getFactory() == null) {
            C0582e.m2188a(from, this);
        } else if (!(from.getFactory2() instanceof AppCompatDelegateImpl)) {
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return mo2656a(view, str, context, attributeSet);
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    /* renamed from: a */
    private void m2752a(PanelFeatureState panelFeatureState, KeyEvent keyEvent) {
        int i;
        if (!panelFeatureState.f1965o && !this.f1937r) {
            if (panelFeatureState.f1951a == 0) {
                if ((this.f1920a.getResources().getConfiguration().screenLayout & 15) == 4) {
                    return;
                }
            }
            Callback l = mo2693l();
            if (l == null || l.onMenuOpened(panelFeatureState.f1951a, panelFeatureState.f1960j)) {
                WindowManager windowManager = (WindowManager) this.f1920a.getSystemService("window");
                if (windowManager != null && m2758b(panelFeatureState, keyEvent)) {
                    if (panelFeatureState.f1957g == null || panelFeatureState.f1967q) {
                        if (panelFeatureState.f1957g == null) {
                            if (!m2754a(panelFeatureState) || panelFeatureState.f1957g == null) {
                                return;
                            }
                        } else if (panelFeatureState.f1967q && panelFeatureState.f1957g.getChildCount() > 0) {
                            panelFeatureState.f1957g.removeAllViews();
                        }
                        if (m2759c(panelFeatureState) && panelFeatureState.mo2712a()) {
                            LayoutParams layoutParams = panelFeatureState.f1958h.getLayoutParams();
                            if (layoutParams == null) {
                                layoutParams = new LayoutParams(-2, -2);
                            }
                            panelFeatureState.f1957g.setBackgroundResource(panelFeatureState.f1952b);
                            ViewParent parent = panelFeatureState.f1958h.getParent();
                            if (parent != null && (parent instanceof ViewGroup)) {
                                ((ViewGroup) parent).removeView(panelFeatureState.f1958h);
                            }
                            panelFeatureState.f1957g.addView(panelFeatureState.f1958h, layoutParams);
                            if (!panelFeatureState.f1958h.hasFocus()) {
                                panelFeatureState.f1958h.requestFocus();
                            }
                        } else {
                            return;
                        }
                    } else if (panelFeatureState.f1959i != null) {
                        LayoutParams layoutParams2 = panelFeatureState.f1959i.getLayoutParams();
                        if (layoutParams2 != null && layoutParams2.width == -1) {
                            i = -1;
                            panelFeatureState.f1964n = false;
                            WindowManager.LayoutParams layoutParams3 = new WindowManager.LayoutParams(i, -2, panelFeatureState.f1954d, panelFeatureState.f1955e, AdError.LOAD_TOO_FREQUENTLY_ERROR_CODE, 8519680, -3);
                            layoutParams3.gravity = panelFeatureState.f1953c;
                            layoutParams3.windowAnimations = panelFeatureState.f1956f;
                            windowManager.addView(panelFeatureState.f1957g, layoutParams3);
                            panelFeatureState.f1965o = true;
                            return;
                        }
                    }
                    i = -2;
                    panelFeatureState.f1964n = false;
                    WindowManager.LayoutParams layoutParams32 = new WindowManager.LayoutParams(i, -2, panelFeatureState.f1954d, panelFeatureState.f1955e, AdError.LOAD_TOO_FREQUENTLY_ERROR_CODE, 8519680, -3);
                    layoutParams32.gravity = panelFeatureState.f1953c;
                    layoutParams32.windowAnimations = panelFeatureState.f1956f;
                    windowManager.addView(panelFeatureState.f1957g, layoutParams32);
                    panelFeatureState.f1965o = true;
                    return;
                }
                return;
            }
            mo2660a(panelFeatureState, true);
        }
    }

    /* renamed from: a */
    private boolean m2754a(PanelFeatureState panelFeatureState) {
        panelFeatureState.mo2710a(mo2694m());
        panelFeatureState.f1957g = new C0713e(panelFeatureState.f1962l);
        panelFeatureState.f1953c = 81;
        return true;
    }

    /* renamed from: a */
    private void m2753a(C0790h hVar, boolean z) {
        if (this.f1941y == null || !this.f1941y.mo3472e() || (ViewConfiguration.get(this.f1920a).hasPermanentMenuKey() && !this.f1941y.mo3475g())) {
            PanelFeatureState a = mo2652a(0, true);
            a.f1967q = true;
            mo2660a(a, false);
            m2752a(a, (KeyEvent) null);
            return;
        }
        Callback l = mo2693l();
        if (this.f1941y.mo3473f() && z) {
            this.f1941y.mo3483i();
            if (!this.f1937r) {
                l.onPanelClosed(108, mo2652a(0, true).f1960j);
            }
        } else if (l != null && !this.f1937r) {
            if (this.f1938s && (this.f1939t & 1) != 0) {
                this.f1921b.getDecorView().removeCallbacks(this.f1915P);
                this.f1915P.run();
            }
            PanelFeatureState a2 = mo2652a(0, true);
            if (a2.f1960j != null && !a2.f1968r && l.onPreparePanel(0, a2.f1959i, a2.f1960j)) {
                l.onMenuOpened(108, a2.f1960j);
                this.f1941y.mo3482h();
            }
        }
    }

    /* renamed from: b */
    private boolean m2757b(PanelFeatureState panelFeatureState) {
        Context context = this.f1920a;
        if ((panelFeatureState.f1951a == 0 || panelFeatureState.f1951a == 108) && this.f1941y != null) {
            TypedValue typedValue = new TypedValue();
            Theme theme = context.getTheme();
            theme.resolveAttribute(C0673a.actionBarTheme, typedValue, true);
            Theme theme2 = null;
            if (typedValue.resourceId != 0) {
                theme2 = context.getResources().newTheme();
                theme2.setTo(theme);
                theme2.applyStyle(typedValue.resourceId, true);
                theme2.resolveAttribute(C0673a.actionBarWidgetTheme, typedValue, true);
            } else {
                theme.resolveAttribute(C0673a.actionBarWidgetTheme, typedValue, true);
            }
            if (typedValue.resourceId != 0) {
                if (theme2 == null) {
                    theme2 = context.getResources().newTheme();
                    theme2.setTo(theme);
                }
                theme2.applyStyle(typedValue.resourceId, true);
            }
            if (theme2 != null) {
                Context dVar = new C0765d(context, 0);
                dVar.getTheme().setTo(theme2);
                context = dVar;
            }
        }
        C0790h hVar = new C0790h(context);
        hVar.mo3164a((C0791a) this);
        panelFeatureState.mo2711a(hVar);
        return true;
    }

    /* renamed from: c */
    private boolean m2759c(PanelFeatureState panelFeatureState) {
        boolean z = true;
        if (panelFeatureState.f1959i != null) {
            panelFeatureState.f1958h = panelFeatureState.f1959i;
            return true;
        } else if (panelFeatureState.f1960j == null) {
            return false;
        } else {
            if (this.f1900A == null) {
                this.f1900A = new C0714f();
            }
            panelFeatureState.f1958h = (View) panelFeatureState.mo2709a((C0807a) this.f1900A);
            if (panelFeatureState.f1958h == null) {
                z = false;
            }
            return z;
        }
    }

    /* renamed from: b */
    private boolean m2758b(PanelFeatureState panelFeatureState, KeyEvent keyEvent) {
        if (this.f1937r) {
            return false;
        }
        if (panelFeatureState.f1963m) {
            return true;
        }
        if (!(this.f1910K == null || this.f1910K == panelFeatureState)) {
            mo2660a(this.f1910K, false);
        }
        Callback l = mo2693l();
        if (l != null) {
            panelFeatureState.f1959i = l.onCreatePanelView(panelFeatureState.f1951a);
        }
        boolean z = panelFeatureState.f1951a == 0 || panelFeatureState.f1951a == 108;
        if (z && this.f1941y != null) {
            this.f1941y.mo3484j();
        }
        if (panelFeatureState.f1959i == null && (!z || !(mo2692k() instanceof C0723f))) {
            if (panelFeatureState.f1960j == null || panelFeatureState.f1968r) {
                if (panelFeatureState.f1960j == null && (!m2757b(panelFeatureState) || panelFeatureState.f1960j == null)) {
                    return false;
                }
                if (z && this.f1941y != null) {
                    if (this.f1942z == null) {
                        this.f1942z = new C0707a();
                    }
                    this.f1941y.mo3465a(panelFeatureState.f1960j, this.f1942z);
                }
                panelFeatureState.f1960j.mo3205h();
                if (!l.onCreatePanelMenu(panelFeatureState.f1951a, panelFeatureState.f1960j)) {
                    panelFeatureState.mo2711a((C0790h) null);
                    if (z && this.f1941y != null) {
                        this.f1941y.mo3465a(null, this.f1942z);
                    }
                    return false;
                }
                panelFeatureState.f1968r = false;
            }
            panelFeatureState.f1960j.mo3205h();
            if (panelFeatureState.f1969s != null) {
                panelFeatureState.f1960j.mo3184b(panelFeatureState.f1969s);
                panelFeatureState.f1969s = null;
            }
            if (!l.onPreparePanel(0, panelFeatureState.f1959i, panelFeatureState.f1960j)) {
                if (z && this.f1941y != null) {
                    this.f1941y.mo3465a(null, this.f1942z);
                }
                panelFeatureState.f1960j.mo3207i();
                return false;
            }
            panelFeatureState.f1966p = KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1;
            panelFeatureState.f1960j.setQwertyMode(panelFeatureState.f1966p);
            panelFeatureState.f1960j.mo3207i();
        }
        panelFeatureState.f1963m = true;
        panelFeatureState.f1964n = false;
        this.f1910K = panelFeatureState;
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo2673b(C0790h hVar) {
        if (!this.f1908I) {
            this.f1908I = true;
            this.f1941y.mo3485k();
            Callback l = mo2693l();
            if (l != null && !this.f1937r) {
                l.onPanelClosed(108, hVar);
            }
            this.f1908I = false;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public void mo2685f(int i) {
        mo2660a(mo2652a(i, true), true);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2660a(PanelFeatureState panelFeatureState, boolean z) {
        if (!z || panelFeatureState.f1951a != 0 || this.f1941y == null || !this.f1941y.mo3473f()) {
            WindowManager windowManager = (WindowManager) this.f1920a.getSystemService("window");
            if (!(windowManager == null || !panelFeatureState.f1965o || panelFeatureState.f1957g == null)) {
                windowManager.removeView(panelFeatureState.f1957g);
                if (z) {
                    mo2657a(panelFeatureState.f1951a, panelFeatureState, null);
                }
            }
            panelFeatureState.f1963m = false;
            panelFeatureState.f1964n = false;
            panelFeatureState.f1965o = false;
            panelFeatureState.f1958h = null;
            panelFeatureState.f1967q = true;
            if (this.f1910K == panelFeatureState) {
                this.f1910K = null;
            }
            return;
        }
        mo2673b(panelFeatureState.f1960j);
    }

    /* renamed from: d */
    private boolean m2760d(int i, KeyEvent keyEvent) {
        if (keyEvent.getRepeatCount() == 0) {
            PanelFeatureState a = mo2652a(i, true);
            if (!a.f1965o) {
                return m2758b(a, keyEvent);
            }
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x006e  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m2761e(int r4, android.view.KeyEvent r5) {
        /*
            r3 = this;
            android.support.v7.view.b r0 = r3.f1927h
            r1 = 0
            if (r0 == 0) goto L_0x0006
            return r1
        L_0x0006:
            r0 = 1
            android.support.v7.app.AppCompatDelegateImpl$PanelFeatureState r2 = r3.mo2652a(r4, r0)
            if (r4 != 0) goto L_0x0045
            android.support.v7.widget.t r4 = r3.f1941y
            if (r4 == 0) goto L_0x0045
            android.support.v7.widget.t r4 = r3.f1941y
            boolean r4 = r4.mo3472e()
            if (r4 == 0) goto L_0x0045
            android.content.Context r4 = r3.f1920a
            android.view.ViewConfiguration r4 = android.view.ViewConfiguration.get(r4)
            boolean r4 = r4.hasPermanentMenuKey()
            if (r4 != 0) goto L_0x0045
            android.support.v7.widget.t r4 = r3.f1941y
            boolean r4 = r4.mo3473f()
            if (r4 != 0) goto L_0x003e
            boolean r4 = r3.f1937r
            if (r4 != 0) goto L_0x0065
            boolean r4 = r3.m2758b(r2, r5)
            if (r4 == 0) goto L_0x0065
            android.support.v7.widget.t r4 = r3.f1941y
            boolean r4 = r4.mo3482h()
            goto L_0x006c
        L_0x003e:
            android.support.v7.widget.t r4 = r3.f1941y
            boolean r4 = r4.mo3483i()
            goto L_0x006c
        L_0x0045:
            boolean r4 = r2.f1965o
            if (r4 != 0) goto L_0x0067
            boolean r4 = r2.f1964n
            if (r4 == 0) goto L_0x004e
            goto L_0x0067
        L_0x004e:
            boolean r4 = r2.f1963m
            if (r4 == 0) goto L_0x0065
            boolean r4 = r2.f1968r
            if (r4 == 0) goto L_0x005d
            r2.f1963m = r1
            boolean r4 = r3.m2758b(r2, r5)
            goto L_0x005e
        L_0x005d:
            r4 = r0
        L_0x005e:
            if (r4 == 0) goto L_0x0065
            r3.m2752a(r2, r5)
            r4 = r0
            goto L_0x006c
        L_0x0065:
            r4 = r1
            goto L_0x006c
        L_0x0067:
            boolean r4 = r2.f1965o
            r3.mo2660a(r2, r0)
        L_0x006c:
            if (r4 == 0) goto L_0x0085
            android.content.Context r5 = r3.f1920a
            java.lang.String r0 = "audio"
            java.lang.Object r5 = r5.getSystemService(r0)
            android.media.AudioManager r5 = (android.media.AudioManager) r5
            if (r5 == 0) goto L_0x007e
            r5.playSoundEffect(r1)
            goto L_0x0085
        L_0x007e:
            java.lang.String r5 = "AppCompatDelegate"
            java.lang.String r0 = "Couldn't get audio manager"
            android.util.Log.w(r5, r0)
        L_0x0085:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p028v7.app.AppCompatDelegateImpl.m2761e(int, android.view.KeyEvent):boolean");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2657a(int i, PanelFeatureState panelFeatureState, Menu menu) {
        if (menu == null) {
            if (panelFeatureState == null && i >= 0 && i < this.f1909J.length) {
                panelFeatureState = this.f1909J[i];
            }
            if (panelFeatureState != null) {
                menu = panelFeatureState.f1960j;
            }
        }
        if ((panelFeatureState == null || panelFeatureState.f1965o) && !this.f1937r) {
            this.f1922c.onPanelClosed(i, menu);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public PanelFeatureState mo2653a(Menu menu) {
        PanelFeatureState[] panelFeatureStateArr = this.f1909J;
        int length = panelFeatureStateArr != null ? panelFeatureStateArr.length : 0;
        for (int i = 0; i < length; i++) {
            PanelFeatureState panelFeatureState = panelFeatureStateArr[i];
            if (panelFeatureState != null && panelFeatureState.f1960j == menu) {
                return panelFeatureState;
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public PanelFeatureState mo2652a(int i, boolean z) {
        PanelFeatureState[] panelFeatureStateArr = this.f1909J;
        if (panelFeatureStateArr == null || panelFeatureStateArr.length <= i) {
            PanelFeatureState[] panelFeatureStateArr2 = new PanelFeatureState[(i + 1)];
            if (panelFeatureStateArr != null) {
                System.arraycopy(panelFeatureStateArr, 0, panelFeatureStateArr2, 0, panelFeatureStateArr.length);
            }
            this.f1909J = panelFeatureStateArr2;
            panelFeatureStateArr = panelFeatureStateArr2;
        }
        PanelFeatureState panelFeatureState = panelFeatureStateArr[i];
        if (panelFeatureState != null) {
            return panelFeatureState;
        }
        PanelFeatureState panelFeatureState2 = new PanelFeatureState(i);
        panelFeatureStateArr[i] = panelFeatureState2;
        return panelFeatureState2;
    }

    /* renamed from: a */
    private boolean m2755a(PanelFeatureState panelFeatureState, int i, KeyEvent keyEvent, int i2) {
        boolean z = false;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((panelFeatureState.f1963m || m2758b(panelFeatureState, keyEvent)) && panelFeatureState.f1960j != null) {
            z = panelFeatureState.f1960j.performShortcut(i, keyEvent, i2);
        }
        if (z && (i2 & 1) == 0 && this.f1941y == null) {
            mo2660a(panelFeatureState, true);
        }
        return z;
    }

    /* renamed from: j */
    private void m2762j(int i) {
        this.f1939t = (1 << i) | this.f1939t;
        if (!this.f1938s) {
            C0595r.m2242a(this.f1921b.getDecorView(), this.f1915P);
            this.f1938s = true;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public void mo2687g(int i) {
        PanelFeatureState a = mo2652a(i, true);
        if (a.f1960j != null) {
            Bundle bundle = new Bundle();
            a.f1960j.mo3163a(bundle);
            if (bundle.size() > 0) {
                a.f1969s = bundle;
            }
            a.f1960j.mo3205h();
            a.f1960j.clear();
        }
        a.f1968r = true;
        a.f1967q = true;
        if ((i == 108 || i == 0) && this.f1941y != null) {
            PanelFeatureState a2 = mo2652a(0, false);
            if (a2 != null) {
                a2.f1963m = false;
                m2758b(a2, (KeyEvent) null);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public int mo2688h(int i) {
        boolean z;
        boolean z2;
        int i2 = 0;
        if (this.f1928i == null || !(this.f1928i.getLayoutParams() instanceof MarginLayoutParams)) {
            z = false;
        } else {
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.f1928i.getLayoutParams();
            z = true;
            if (this.f1928i.isShown()) {
                if (this.f1917R == null) {
                    this.f1917R = new Rect();
                    this.f1918S = new Rect();
                }
                Rect rect = this.f1917R;
                Rect rect2 = this.f1918S;
                rect.set(0, i, 0, 0);
                C0994bg.m4485a(this.f1903D, rect, rect2);
                if (marginLayoutParams.topMargin != (rect2.top == 0 ? i : 0)) {
                    marginLayoutParams.topMargin = i;
                    if (this.f1905F == null) {
                        this.f1905F = new View(this.f1920a);
                        this.f1905F.setBackgroundColor(this.f1920a.getResources().getColor(C0675c.abc_input_method_navigation_guard));
                        this.f1903D.addView(this.f1905F, -1, new LayoutParams(-1, i));
                    } else {
                        LayoutParams layoutParams = this.f1905F.getLayoutParams();
                        if (layoutParams.height != i) {
                            layoutParams.height = i;
                            this.f1905F.setLayoutParams(layoutParams);
                        }
                    }
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (this.f1905F == null) {
                    z = false;
                }
                if (!this.f1934o && z) {
                    i = 0;
                }
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z2 = true;
                z = false;
            } else {
                z2 = false;
                z = false;
            }
            if (z2) {
                this.f1928i.setLayoutParams(marginLayoutParams);
            }
        }
        if (this.f1905F != null) {
            View view = this.f1905F;
            if (!z) {
                i2 = 8;
            }
            view.setVisibility(i2);
        }
        return i;
    }

    /* renamed from: x */
    private void m2769x() {
        if (this.f1902C) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    /* renamed from: k */
    private int m2763k(int i) {
        if (i == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            return 108;
        } else if (i != 9) {
            return i;
        } else {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            return 109;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: s */
    public void mo2702s() {
        if (this.f1941y != null) {
            this.f1941y.mo3485k();
        }
        if (this.f1929j != null) {
            this.f1921b.getDecorView().removeCallbacks(this.f1930k);
            if (this.f1929j.isShowing()) {
                try {
                    this.f1929j.dismiss();
                } catch (IllegalArgumentException unused) {
                }
            }
            this.f1929j = null;
        }
        mo2700q();
        PanelFeatureState a = mo2652a(0, false);
        if (a != null && a.f1960j != null) {
            a.f1960j.close();
        }
    }

    /* renamed from: i */
    public boolean mo2691i() {
        int y = m2770y();
        int i = mo2690i(y);
        boolean l = i != -1 ? m2764l(i) : false;
        if (y == 0) {
            m2771z();
            this.f1914O.mo2740c();
        }
        this.f1913N = true;
        return l;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public int mo2690i(int i) {
        if (i == -100) {
            return -1;
        }
        if (i != 0) {
            return i;
        }
        if (VERSION.SDK_INT >= 23 && ((UiModeManager) this.f1920a.getSystemService(UiModeManager.class)).getNightMode() == 0) {
            return -1;
        }
        m2771z();
        return this.f1914O.mo2738a();
    }

    /* renamed from: y */
    private int m2770y() {
        return this.f1912M != -100 ? this.f1912M : m2888j();
    }

    /* renamed from: l */
    private boolean m2764l(int i) {
        Resources resources = this.f1920a.getResources();
        Configuration configuration = resources.getConfiguration();
        int i2 = configuration.uiMode & 48;
        int i3 = i == 2 ? 32 : 16;
        if (i2 == i3) {
            return false;
        }
        if (m2751A()) {
            ((Activity) this.f1920a).recreate();
        } else {
            Configuration configuration2 = new Configuration(configuration);
            DisplayMetrics displayMetrics = resources.getDisplayMetrics();
            configuration2.uiMode = i3 | (configuration2.uiMode & -49);
            resources.updateConfiguration(configuration2, displayMetrics);
            if (VERSION.SDK_INT < 26) {
                C0722e.m2917a(resources);
            }
        }
        return true;
    }

    /* renamed from: z */
    private void m2771z() {
        if (this.f1914O == null) {
            this.f1914O = new C0711d(C0727h.m2946a(this.f1920a));
        }
    }

    /* renamed from: A */
    private boolean m2751A() {
        boolean z = false;
        if (!this.f1913N || !(this.f1920a instanceof Activity)) {
            return false;
        }
        try {
            if ((this.f1920a.getPackageManager().getActivityInfo(new ComponentName(this.f1920a, this.f1920a.getClass()), 0).configChanges & 512) == 0) {
                z = true;
            }
            return z;
        } catch (NameNotFoundException e) {
            Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e);
            return true;
        }
    }
}
