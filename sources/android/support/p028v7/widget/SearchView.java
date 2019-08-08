package android.support.p028v7.widget;

import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.support.p017v4.view.AbsSavedState;
import android.support.p017v4.view.C0595r;
import android.support.p017v4.widget.C0648f;
import android.support.p028v7.p029a.C0672a.C0673a;
import android.support.p028v7.p029a.C0672a.C0676d;
import android.support.p028v7.p029a.C0672a.C0678f;
import android.support.p028v7.p029a.C0672a.C0679g;
import android.support.p028v7.p029a.C0672a.C0680h;
import android.support.p028v7.p029a.C0672a.C0682j;
import android.support.p028v7.view.C0764c;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.KeyEvent.DispatcherState;
import android.view.LayoutInflater;
import android.view.TouchDelegate;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.view.View.OnKeyListener;
import android.view.View.OnLayoutChangeListener;
import android.view.ViewConfiguration;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import com.google.android.exoplayer2.C2793C;
import com.google.android.exoplayer2.extractor.p132ts.PsExtractor;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* renamed from: android.support.v7.widget.SearchView */
public class SearchView extends LinearLayoutCompat implements C0764c {

    /* renamed from: i */
    static final C0914a f2833i = new C0914a();

    /* renamed from: A */
    private C0916c f2834A;

    /* renamed from: B */
    private C0915b f2835B;

    /* renamed from: C */
    private C0917d f2836C;

    /* renamed from: D */
    private OnClickListener f2837D;

    /* renamed from: E */
    private boolean f2838E;

    /* renamed from: F */
    private boolean f2839F;

    /* renamed from: G */
    private boolean f2840G;

    /* renamed from: H */
    private CharSequence f2841H;

    /* renamed from: I */
    private boolean f2842I;

    /* renamed from: J */
    private boolean f2843J;

    /* renamed from: K */
    private int f2844K;

    /* renamed from: L */
    private boolean f2845L;

    /* renamed from: M */
    private CharSequence f2846M;

    /* renamed from: N */
    private CharSequence f2847N;

    /* renamed from: O */
    private boolean f2848O;

    /* renamed from: P */
    private int f2849P;

    /* renamed from: Q */
    private Bundle f2850Q;

    /* renamed from: R */
    private final Runnable f2851R;

    /* renamed from: S */
    private Runnable f2852S;

    /* renamed from: T */
    private final WeakHashMap<String, ConstantState> f2853T;

    /* renamed from: U */
    private final OnClickListener f2854U;

    /* renamed from: V */
    private final OnEditorActionListener f2855V;

    /* renamed from: W */
    private final OnItemClickListener f2856W;

    /* renamed from: a */
    final SearchAutoComplete f2857a;

    /* renamed from: aa */
    private final OnItemSelectedListener f2858aa;

    /* renamed from: ab */
    private TextWatcher f2859ab;

    /* renamed from: b */
    final ImageView f2860b;

    /* renamed from: c */
    final ImageView f2861c;

    /* renamed from: d */
    final ImageView f2862d;

    /* renamed from: e */
    final ImageView f2863e;

    /* renamed from: f */
    OnFocusChangeListener f2864f;

    /* renamed from: g */
    C0648f f2865g;

    /* renamed from: h */
    SearchableInfo f2866h;

    /* renamed from: j */
    OnKeyListener f2867j;

    /* renamed from: k */
    private final View f2868k;

    /* renamed from: l */
    private final View f2869l;

    /* renamed from: m */
    private final View f2870m;

    /* renamed from: n */
    private final View f2871n;

    /* renamed from: o */
    private C0918e f2872o;

    /* renamed from: p */
    private Rect f2873p;

    /* renamed from: q */
    private Rect f2874q;

    /* renamed from: r */
    private int[] f2875r;

    /* renamed from: s */
    private int[] f2876s;

    /* renamed from: t */
    private final ImageView f2877t;

    /* renamed from: u */
    private final Drawable f2878u;

    /* renamed from: v */
    private final int f2879v;

    /* renamed from: w */
    private final int f2880w;

    /* renamed from: x */
    private final Intent f2881x;

    /* renamed from: y */
    private final Intent f2882y;

    /* renamed from: z */
    private final CharSequence f2883z;

    /* renamed from: android.support.v7.widget.SearchView$SavedState */
    static class SavedState extends AbsSavedState {
        public static final Creator<SavedState> CREATOR = new ClassLoaderCreator<SavedState>() {
            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            /* renamed from: a */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        };

        /* renamed from: a */
        boolean f2894a;

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f2894a = ((Boolean) parcel.readValue(null)).booleanValue();
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeValue(Boolean.valueOf(this.f2894a));
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("SearchView.SavedState{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" isIconified=");
            sb.append(this.f2894a);
            sb.append("}");
            return sb.toString();
        }
    }

    /* renamed from: android.support.v7.widget.SearchView$SearchAutoComplete */
    public static class SearchAutoComplete extends AppCompatAutoCompleteTextView {

        /* renamed from: a */
        final Runnable f2895a;

        /* renamed from: b */
        private int f2896b;

        /* renamed from: c */
        private SearchView f2897c;

        /* renamed from: d */
        private boolean f2898d;

        public void performCompletion() {
        }

        /* access modifiers changed from: protected */
        public void replaceText(CharSequence charSequence) {
        }

        public SearchAutoComplete(Context context) {
            this(context, null);
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, C0673a.autoCompleteTextViewStyle);
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            this.f2895a = new Runnable() {
                public void run() {
                    SearchAutoComplete.this.mo4602b();
                }
            };
            this.f2896b = getThreshold();
        }

        /* access modifiers changed from: protected */
        public void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, (float) getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        /* access modifiers changed from: 0000 */
        public void setSearchView(SearchView searchView) {
            this.f2897c = searchView;
        }

        public void setThreshold(int i) {
            super.setThreshold(i);
            this.f2896b = i;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo4601a() {
            return TextUtils.getTrimmedLength(getText()) == 0;
        }

        public void onWindowFocusChanged(boolean z) {
            super.onWindowFocusChanged(z);
            if (z && this.f2897c.hasFocus() && getVisibility() == 0) {
                this.f2898d = true;
                if (SearchView.m3900a(getContext())) {
                    SearchView.f2833i.mo4615a(this, true);
                }
            }
        }

        /* access modifiers changed from: protected */
        public void onFocusChanged(boolean z, int i, Rect rect) {
            super.onFocusChanged(z, i, rect);
            this.f2897c.mo4557i();
        }

        public boolean enoughToFilter() {
            return this.f2896b <= 0 || super.enoughToFilter();
        }

        public boolean onKeyPreIme(int i, KeyEvent keyEvent) {
            if (i == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                } else if (keyEvent.getAction() == 1) {
                    DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.f2897c.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i, keyEvent);
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i = configuration.screenWidthDp;
            int i2 = configuration.screenHeightDp;
            if (i >= 960 && i2 >= 720 && configuration.orientation == 2) {
                return 256;
            }
            if (i >= 600 || (i >= 640 && i2 >= 480)) {
                return PsExtractor.AUDIO_STREAM;
            }
            return 160;
        }

        public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f2898d) {
                removeCallbacks(this.f2895a);
                post(this.f2895a);
            }
            return onCreateInputConnection;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo4602b() {
            if (this.f2898d) {
                ((InputMethodManager) getContext().getSystemService("input_method")).showSoftInput(this, 0);
                this.f2898d = false;
            }
        }

        /* access modifiers changed from: 0000 */
        public void setImeVisibility(boolean z) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            if (!z) {
                this.f2898d = false;
                removeCallbacks(this.f2895a);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else if (inputMethodManager.isActive(this)) {
                this.f2898d = false;
                removeCallbacks(this.f2895a);
                inputMethodManager.showSoftInput(this, 0);
            } else {
                this.f2898d = true;
            }
        }
    }

    /* renamed from: android.support.v7.widget.SearchView$a */
    private static class C0914a {

        /* renamed from: a */
        private Method f2900a;

        /* renamed from: b */
        private Method f2901b;

        /* renamed from: c */
        private Method f2902c;

        C0914a() {
            try {
                this.f2900a = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", new Class[0]);
                this.f2900a.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                this.f2901b = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", new Class[0]);
                this.f2901b.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            try {
                this.f2902c = AutoCompleteTextView.class.getMethod("ensureImeVisible", new Class[]{Boolean.TYPE});
                this.f2902c.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo4614a(AutoCompleteTextView autoCompleteTextView) {
            if (this.f2900a != null) {
                try {
                    this.f2900a.invoke(autoCompleteTextView, new Object[0]);
                } catch (Exception unused) {
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo4616b(AutoCompleteTextView autoCompleteTextView) {
            if (this.f2901b != null) {
                try {
                    this.f2901b.invoke(autoCompleteTextView, new Object[0]);
                } catch (Exception unused) {
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo4615a(AutoCompleteTextView autoCompleteTextView, boolean z) {
            if (this.f2902c != null) {
                try {
                    this.f2902c.invoke(autoCompleteTextView, new Object[]{Boolean.valueOf(z)});
                } catch (Exception unused) {
                }
            }
        }
    }

    /* renamed from: android.support.v7.widget.SearchView$b */
    public interface C0915b {
        /* renamed from: a */
        boolean mo4617a();
    }

    /* renamed from: android.support.v7.widget.SearchView$c */
    public interface C0916c {
        /* renamed from: a */
        boolean mo4618a(String str);

        /* renamed from: b */
        boolean mo4619b(String str);
    }

    /* renamed from: android.support.v7.widget.SearchView$d */
    public interface C0917d {
        /* renamed from: a */
        boolean mo4620a(int i);

        /* renamed from: b */
        boolean mo4621b(int i);
    }

    /* renamed from: android.support.v7.widget.SearchView$e */
    private static class C0918e extends TouchDelegate {

        /* renamed from: a */
        private final View f2903a;

        /* renamed from: b */
        private final Rect f2904b = new Rect();

        /* renamed from: c */
        private final Rect f2905c = new Rect();

        /* renamed from: d */
        private final Rect f2906d = new Rect();

        /* renamed from: e */
        private final int f2907e;

        /* renamed from: f */
        private boolean f2908f;

        public C0918e(Rect rect, Rect rect2, View view) {
            super(rect, view);
            this.f2907e = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
            mo4622a(rect, rect2);
            this.f2903a = view;
        }

        /* renamed from: a */
        public void mo4622a(Rect rect, Rect rect2) {
            this.f2904b.set(rect);
            this.f2906d.set(rect);
            this.f2906d.inset(-this.f2907e, -this.f2907e);
            this.f2905c.set(rect2);
        }

        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTouchEvent(android.view.MotionEvent r7) {
            /*
                r6 = this;
                float r0 = r7.getX()
                int r0 = (int) r0
                float r1 = r7.getY()
                int r1 = (int) r1
                int r2 = r7.getAction()
                r3 = 1
                r4 = 0
                switch(r2) {
                    case 0: goto L_0x0027;
                    case 1: goto L_0x0019;
                    case 2: goto L_0x0019;
                    case 3: goto L_0x0014;
                    default: goto L_0x0013;
                }
            L_0x0013:
                goto L_0x0033
            L_0x0014:
                boolean r2 = r6.f2908f
                r6.f2908f = r4
                goto L_0x0034
            L_0x0019:
                boolean r2 = r6.f2908f
                if (r2 == 0) goto L_0x0034
                android.graphics.Rect r5 = r6.f2906d
                boolean r5 = r5.contains(r0, r1)
                if (r5 != 0) goto L_0x0034
                r3 = r4
                goto L_0x0034
            L_0x0027:
                android.graphics.Rect r2 = r6.f2904b
                boolean r2 = r2.contains(r0, r1)
                if (r2 == 0) goto L_0x0033
                r6.f2908f = r3
                r2 = r3
                goto L_0x0034
            L_0x0033:
                r2 = r4
            L_0x0034:
                if (r2 == 0) goto L_0x006b
                if (r3 == 0) goto L_0x0056
                android.graphics.Rect r2 = r6.f2905c
                boolean r2 = r2.contains(r0, r1)
                if (r2 != 0) goto L_0x0056
                android.view.View r0 = r6.f2903a
                int r0 = r0.getWidth()
                int r0 = r0 / 2
                float r0 = (float) r0
                android.view.View r1 = r6.f2903a
                int r1 = r1.getHeight()
                int r1 = r1 / 2
                float r1 = (float) r1
                r7.setLocation(r0, r1)
                goto L_0x0065
            L_0x0056:
                android.graphics.Rect r2 = r6.f2905c
                int r2 = r2.left
                int r0 = r0 - r2
                float r0 = (float) r0
                android.graphics.Rect r2 = r6.f2905c
                int r2 = r2.top
                int r1 = r1 - r2
                float r1 = (float) r1
                r7.setLocation(r0, r1)
            L_0x0065:
                android.view.View r0 = r6.f2903a
                boolean r4 = r0.dispatchTouchEvent(r7)
            L_0x006b:
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.p028v7.widget.SearchView.C0918e.onTouchEvent(android.view.MotionEvent):boolean");
        }
    }

    public SearchView(Context context) {
        this(context, null);
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0673a.searchViewStyle);
    }

    public SearchView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2873p = new Rect();
        this.f2874q = new Rect();
        this.f2875r = new int[2];
        this.f2876s = new int[2];
        this.f2851R = new Runnable() {
            public void run() {
                SearchView.this.mo4544d();
            }
        };
        this.f2852S = new Runnable() {
            public void run() {
                if (SearchView.this.f2865g != null && (SearchView.this.f2865g instanceof C0970as)) {
                    SearchView.this.f2865g.mo2504a((Cursor) null);
                }
            }
        };
        this.f2853T = new WeakHashMap<>();
        this.f2854U = new OnClickListener() {
            public void onClick(View view) {
                if (view == SearchView.this.f2860b) {
                    SearchView.this.mo4547g();
                } else if (view == SearchView.this.f2862d) {
                    SearchView.this.mo4546f();
                } else if (view == SearchView.this.f2861c) {
                    SearchView.this.mo4545e();
                } else if (view == SearchView.this.f2863e) {
                    SearchView.this.mo4556h();
                } else if (view == SearchView.this.f2857a) {
                    SearchView.this.mo4559l();
                }
            }
        };
        this.f2867j = new OnKeyListener() {
            public boolean onKey(View view, int i, KeyEvent keyEvent) {
                if (SearchView.this.f2866h == null) {
                    return false;
                }
                if (SearchView.this.f2857a.isPopupShowing() && SearchView.this.f2857a.getListSelection() != -1) {
                    return SearchView.this.mo4540a(view, i, keyEvent);
                }
                if (SearchView.this.f2857a.mo4601a() || !keyEvent.hasNoModifiers() || keyEvent.getAction() != 1 || i != 66) {
                    return false;
                }
                view.cancelLongPress();
                SearchView.this.mo4535a(0, (String) null, SearchView.this.f2857a.getText().toString());
                return true;
            }
        };
        this.f2855V = new OnEditorActionListener() {
            public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                SearchView.this.mo4545e();
                return true;
            }
        };
        this.f2856W = new OnItemClickListener() {
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                SearchView.this.mo4539a(i, 0, (String) null);
            }
        };
        this.f2858aa = new OnItemSelectedListener() {
            public void onNothingSelected(AdapterView<?> adapterView) {
            }

            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
                SearchView.this.mo4538a(i);
            }
        };
        this.f2859ab = new TextWatcher() {
            public void afterTextChanged(Editable editable) {
            }

            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                SearchView.this.mo4541b(charSequence);
            }
        };
        C0977ay a = C0977ay.m4367a(context, attributeSet, C0682j.SearchView, i, 0);
        LayoutInflater.from(context).inflate(a.mo5099g(C0682j.SearchView_layout, C0679g.abc_search_view), this, true);
        this.f2857a = (SearchAutoComplete) findViewById(C0678f.search_src_text);
        this.f2857a.setSearchView(this);
        this.f2868k = findViewById(C0678f.search_edit_frame);
        this.f2869l = findViewById(C0678f.search_plate);
        this.f2870m = findViewById(C0678f.submit_area);
        this.f2860b = (ImageView) findViewById(C0678f.search_button);
        this.f2861c = (ImageView) findViewById(C0678f.search_go_btn);
        this.f2862d = (ImageView) findViewById(C0678f.search_close_btn);
        this.f2863e = (ImageView) findViewById(C0678f.search_voice_btn);
        this.f2877t = (ImageView) findViewById(C0678f.search_mag_icon);
        C0595r.m2239a(this.f2869l, a.mo5086a(C0682j.SearchView_queryBackground));
        C0595r.m2239a(this.f2870m, a.mo5086a(C0682j.SearchView_submitBackground));
        this.f2860b.setImageDrawable(a.mo5086a(C0682j.SearchView_searchIcon));
        this.f2861c.setImageDrawable(a.mo5086a(C0682j.SearchView_goIcon));
        this.f2862d.setImageDrawable(a.mo5086a(C0682j.SearchView_closeIcon));
        this.f2863e.setImageDrawable(a.mo5086a(C0682j.SearchView_voiceIcon));
        this.f2877t.setImageDrawable(a.mo5086a(C0682j.SearchView_searchIcon));
        this.f2878u = a.mo5086a(C0682j.SearchView_searchHintIcon);
        C0982ba.m4432a(this.f2860b, getResources().getString(C0680h.abc_searchview_description_search));
        this.f2879v = a.mo5099g(C0682j.SearchView_suggestionRowLayout, C0679g.abc_search_dropdown_item_icons_2line);
        this.f2880w = a.mo5099g(C0682j.SearchView_commitIcon, 0);
        this.f2860b.setOnClickListener(this.f2854U);
        this.f2862d.setOnClickListener(this.f2854U);
        this.f2861c.setOnClickListener(this.f2854U);
        this.f2863e.setOnClickListener(this.f2854U);
        this.f2857a.setOnClickListener(this.f2854U);
        this.f2857a.addTextChangedListener(this.f2859ab);
        this.f2857a.setOnEditorActionListener(this.f2855V);
        this.f2857a.setOnItemClickListener(this.f2856W);
        this.f2857a.setOnItemSelectedListener(this.f2858aa);
        this.f2857a.setOnKeyListener(this.f2867j);
        this.f2857a.setOnFocusChangeListener(new OnFocusChangeListener() {
            public void onFocusChange(View view, boolean z) {
                if (SearchView.this.f2864f != null) {
                    SearchView.this.f2864f.onFocusChange(SearchView.this, z);
                }
            }
        });
        setIconifiedByDefault(a.mo5088a(C0682j.SearchView_iconifiedByDefault, true));
        int e = a.mo5095e(C0682j.SearchView_android_maxWidth, -1);
        if (e != -1) {
            setMaxWidth(e);
        }
        this.f2883z = a.mo5092c(C0682j.SearchView_defaultQueryHint);
        this.f2841H = a.mo5092c(C0682j.SearchView_queryHint);
        int a2 = a.mo5084a(C0682j.SearchView_android_imeOptions, -1);
        if (a2 != -1) {
            setImeOptions(a2);
        }
        int a3 = a.mo5084a(C0682j.SearchView_android_inputType, -1);
        if (a3 != -1) {
            setInputType(a3);
        }
        setFocusable(a.mo5088a(C0682j.SearchView_android_focusable, true));
        a.mo5087a();
        this.f2881x = new Intent("android.speech.action.WEB_SEARCH");
        this.f2881x.addFlags(268435456);
        this.f2881x.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        this.f2882y = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.f2882y.addFlags(268435456);
        this.f2871n = findViewById(this.f2857a.getDropDownAnchor());
        if (this.f2871n != null) {
            this.f2871n.addOnLayoutChangeListener(new OnLayoutChangeListener() {
                public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                    SearchView.this.mo4558k();
                }
            });
        }
        m3899a(this.f2838E);
        m3912r();
    }

    /* access modifiers changed from: 0000 */
    public int getSuggestionRowLayout() {
        return this.f2879v;
    }

    /* access modifiers changed from: 0000 */
    public int getSuggestionCommitIconResId() {
        return this.f2880w;
    }

    public void setSearchableInfo(SearchableInfo searchableInfo) {
        this.f2866h = searchableInfo;
        if (this.f2866h != null) {
            m3913s();
            m3912r();
        }
        this.f2845L = m3907m();
        if (this.f2845L) {
            this.f2857a.setPrivateImeOptions("nm");
        }
        m3899a(mo4542c());
    }

    public void setAppSearchData(Bundle bundle) {
        this.f2850Q = bundle;
    }

    public void setImeOptions(int i) {
        this.f2857a.setImeOptions(i);
    }

    public int getImeOptions() {
        return this.f2857a.getImeOptions();
    }

    public void setInputType(int i) {
        this.f2857a.setInputType(i);
    }

    public int getInputType() {
        return this.f2857a.getInputType();
    }

    public boolean requestFocus(int i, Rect rect) {
        if (this.f2843J || !isFocusable()) {
            return false;
        }
        if (mo4542c()) {
            return super.requestFocus(i, rect);
        }
        boolean requestFocus = this.f2857a.requestFocus(i, rect);
        if (requestFocus) {
            m3899a(false);
        }
        return requestFocus;
    }

    public void clearFocus() {
        this.f2843J = true;
        super.clearFocus();
        this.f2857a.clearFocus();
        this.f2857a.setImeVisibility(false);
        this.f2843J = false;
    }

    public void setOnQueryTextListener(C0916c cVar) {
        this.f2834A = cVar;
    }

    public void setOnCloseListener(C0915b bVar) {
        this.f2835B = bVar;
    }

    public void setOnQueryTextFocusChangeListener(OnFocusChangeListener onFocusChangeListener) {
        this.f2864f = onFocusChangeListener;
    }

    public void setOnSuggestionListener(C0917d dVar) {
        this.f2836C = dVar;
    }

    public void setOnSearchClickListener(OnClickListener onClickListener) {
        this.f2837D = onClickListener;
    }

    public CharSequence getQuery() {
        return this.f2857a.getText();
    }

    /* renamed from: a */
    public void mo4537a(CharSequence charSequence, boolean z) {
        this.f2857a.setText(charSequence);
        if (charSequence != null) {
            this.f2857a.setSelection(this.f2857a.length());
            this.f2847N = charSequence;
        }
        if (z && !TextUtils.isEmpty(charSequence)) {
            mo4545e();
        }
    }

    public void setQueryHint(CharSequence charSequence) {
        this.f2841H = charSequence;
        m3912r();
    }

    public CharSequence getQueryHint() {
        if (this.f2841H != null) {
            return this.f2841H;
        }
        if (this.f2866h == null || this.f2866h.getHintId() == 0) {
            return this.f2883z;
        }
        return getContext().getText(this.f2866h.getHintId());
    }

    public void setIconifiedByDefault(boolean z) {
        if (this.f2838E != z) {
            this.f2838E = z;
            m3899a(z);
            m3912r();
        }
    }

    public void setIconified(boolean z) {
        if (z) {
            mo4546f();
        } else {
            mo4547g();
        }
    }

    /* renamed from: c */
    public boolean mo4542c() {
        return this.f2839F;
    }

    public void setSubmitButtonEnabled(boolean z) {
        this.f2840G = z;
        m3899a(mo4542c());
    }

    public void setQueryRefinementEnabled(boolean z) {
        this.f2842I = z;
        if (this.f2865g instanceof C0970as) {
            ((C0970as) this.f2865g).mo5072a(z ? 2 : 1);
        }
    }

    public void setSuggestionsAdapter(C0648f fVar) {
        this.f2865g = fVar;
        this.f2857a.setAdapter(this.f2865g);
    }

    public C0648f getSuggestionsAdapter() {
        return this.f2865g;
    }

    public void setMaxWidth(int i) {
        this.f2844K = i;
        requestLayout();
    }

    public int getMaxWidth() {
        return this.f2844K;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        if (mo4542c()) {
            super.onMeasure(i, i2);
            return;
        }
        int mode = MeasureSpec.getMode(i);
        int size = MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE) {
            size = this.f2844K > 0 ? Math.min(this.f2844K, size) : Math.min(getPreferredWidth(), size);
        } else if (mode == 0) {
            size = this.f2844K > 0 ? this.f2844K : getPreferredWidth();
        } else if (mode == 1073741824 && this.f2844K > 0) {
            size = Math.min(this.f2844K, size);
        }
        int mode2 = MeasureSpec.getMode(i2);
        int size2 = MeasureSpec.getSize(i2);
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(getPreferredHeight(), size2);
        } else if (mode2 == 0) {
            size2 = getPreferredHeight();
        }
        super.onMeasure(MeasureSpec.makeMeasureSpec(size, 1073741824), MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            m3898a((View) this.f2857a, this.f2873p);
            this.f2874q.set(this.f2873p.left, 0, this.f2873p.right, i4 - i2);
            if (this.f2872o == null) {
                this.f2872o = new C0918e(this.f2874q, this.f2873p, this.f2857a);
                setTouchDelegate(this.f2872o);
                return;
            }
            this.f2872o.mo4622a(this.f2874q, this.f2873p);
        }
    }

    /* renamed from: a */
    private void m3898a(View view, Rect rect) {
        view.getLocationInWindow(this.f2875r);
        getLocationInWindow(this.f2876s);
        int i = this.f2875r[1] - this.f2876s[1];
        int i2 = this.f2875r[0] - this.f2876s[0];
        rect.set(i2, i, view.getWidth() + i2, view.getHeight() + i);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(C0676d.abc_search_view_preferred_width);
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(C0676d.abc_search_view_preferred_height);
    }

    /* renamed from: a */
    private void m3899a(boolean z) {
        this.f2839F = z;
        int i = 8;
        boolean z2 = false;
        boolean z3 = !TextUtils.isEmpty(this.f2857a.getText());
        this.f2860b.setVisibility(z ? 0 : 8);
        m3902b(z3);
        this.f2868k.setVisibility(z ? 8 : 0);
        if (this.f2877t.getDrawable() != null && !this.f2838E) {
            i = 0;
        }
        this.f2877t.setVisibility(i);
        m3910p();
        if (!z3) {
            z2 = true;
        }
        m3905c(z2);
        m3909o();
    }

    /* renamed from: m */
    private boolean m3907m() {
        boolean z = false;
        if (this.f2866h != null && this.f2866h.getVoiceSearchEnabled()) {
            Intent intent = null;
            if (this.f2866h.getVoiceSearchLaunchWebSearch()) {
                intent = this.f2881x;
            } else if (this.f2866h.getVoiceSearchLaunchRecognizer()) {
                intent = this.f2882y;
            }
            if (intent != null) {
                if (getContext().getPackageManager().resolveActivity(intent, C2793C.DEFAULT_BUFFER_SEGMENT_SIZE) != null) {
                    z = true;
                }
                return z;
            }
        }
        return false;
    }

    /* renamed from: n */
    private boolean m3908n() {
        return (this.f2840G || this.f2845L) && !mo4542c();
    }

    /* renamed from: b */
    private void m3902b(boolean z) {
        this.f2861c.setVisibility((!this.f2840G || !m3908n() || !hasFocus() || (!z && this.f2845L)) ? 8 : 0);
    }

    /* renamed from: o */
    private void m3909o() {
        this.f2870m.setVisibility((!m3908n() || !(this.f2861c.getVisibility() == 0 || this.f2863e.getVisibility() == 0)) ? 8 : 0);
    }

    /* renamed from: p */
    private void m3910p() {
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.f2857a.getText());
        int i = 0;
        if (!z2 && (!this.f2838E || this.f2848O)) {
            z = false;
        }
        ImageView imageView = this.f2862d;
        if (!z) {
            i = 8;
        }
        imageView.setVisibility(i);
        Drawable drawable = this.f2862d.getDrawable();
        if (drawable != null) {
            drawable.setState(z2 ? ENABLED_STATE_SET : EMPTY_STATE_SET);
        }
    }

    /* renamed from: q */
    private void m3911q() {
        post(this.f2851R);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public void mo4544d() {
        int[] iArr = this.f2857a.hasFocus() ? FOCUSED_STATE_SET : EMPTY_STATE_SET;
        Drawable background = this.f2869l.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.f2870m.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        removeCallbacks(this.f2851R);
        post(this.f2852S);
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo4536a(CharSequence charSequence) {
        setQuery(charSequence);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo4540a(View view, int i, KeyEvent keyEvent) {
        int i2;
        if (this.f2866h != null && this.f2865g != null && keyEvent.getAction() == 0 && keyEvent.hasNoModifiers()) {
            if (i == 66 || i == 84 || i == 61) {
                return mo4539a(this.f2857a.getListSelection(), 0, (String) null);
            }
            if (i == 21 || i == 22) {
                if (i == 21) {
                    i2 = 0;
                } else {
                    i2 = this.f2857a.length();
                }
                this.f2857a.setSelection(i2);
                this.f2857a.setListSelection(0);
                this.f2857a.clearListSelection();
                f2833i.mo4615a(this.f2857a, true);
                return true;
            } else if (i != 19 || this.f2857a.getListSelection() == 0) {
                return false;
            }
        }
        return false;
    }

    /* renamed from: c */
    private CharSequence m3904c(CharSequence charSequence) {
        if (!this.f2838E || this.f2878u == null) {
            return charSequence;
        }
        int textSize = (int) (((double) this.f2857a.getTextSize()) * 1.25d);
        this.f2878u.setBounds(0, 0, textSize, textSize);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
        spannableStringBuilder.setSpan(new ImageSpan(this.f2878u), 1, 2, 33);
        spannableStringBuilder.append(charSequence);
        return spannableStringBuilder;
    }

    /* renamed from: r */
    private void m3912r() {
        CharSequence queryHint = getQueryHint();
        SearchAutoComplete searchAutoComplete = this.f2857a;
        if (queryHint == null) {
            queryHint = "";
        }
        searchAutoComplete.setHint(m3904c(queryHint));
    }

    /* renamed from: s */
    private void m3913s() {
        this.f2857a.setThreshold(this.f2866h.getSuggestThreshold());
        this.f2857a.setImeOptions(this.f2866h.getImeOptions());
        int inputType = this.f2866h.getInputType();
        int i = 1;
        if ((inputType & 15) == 1) {
            inputType &= -65537;
            if (this.f2866h.getSuggestAuthority() != null) {
                inputType = inputType | C2793C.DEFAULT_BUFFER_SEGMENT_SIZE | 524288;
            }
        }
        this.f2857a.setInputType(inputType);
        if (this.f2865g != null) {
            this.f2865g.mo2504a((Cursor) null);
        }
        if (this.f2866h.getSuggestAuthority() != null) {
            this.f2865g = new C0970as(getContext(), this, this.f2866h, this.f2853T);
            this.f2857a.setAdapter(this.f2865g);
            C0970as asVar = (C0970as) this.f2865g;
            if (this.f2842I) {
                i = 2;
            }
            asVar.mo5072a(i);
        }
    }

    /* renamed from: c */
    private void m3905c(boolean z) {
        int i;
        if (!this.f2845L || mo4542c() || !z) {
            i = 8;
        } else {
            i = 0;
            this.f2861c.setVisibility(8);
        }
        this.f2863e.setVisibility(i);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo4541b(CharSequence charSequence) {
        Editable text = this.f2857a.getText();
        this.f2847N = text;
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(text);
        m3902b(z2);
        if (z2) {
            z = false;
        }
        m3905c(z);
        m3910p();
        m3909o();
        if (this.f2834A != null && !TextUtils.equals(charSequence, this.f2846M)) {
            this.f2834A.mo4619b(charSequence.toString());
        }
        this.f2846M = charSequence.toString();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public void mo4545e() {
        Editable text = this.f2857a.getText();
        if (text != null && TextUtils.getTrimmedLength(text) > 0) {
            if (this.f2834A == null || !this.f2834A.mo4618a(text.toString())) {
                if (this.f2866h != null) {
                    mo4535a(0, (String) null, text.toString());
                }
                this.f2857a.setImeVisibility(false);
                m3914t();
            }
        }
    }

    /* renamed from: t */
    private void m3914t() {
        this.f2857a.dismissDropDown();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public void mo4546f() {
        if (!TextUtils.isEmpty(this.f2857a.getText())) {
            this.f2857a.setText("");
            this.f2857a.requestFocus();
            this.f2857a.setImeVisibility(true);
        } else if (!this.f2838E) {
        } else {
            if (this.f2835B == null || !this.f2835B.mo4617a()) {
                clearFocus();
                m3899a(true);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public void mo4547g() {
        m3899a(false);
        this.f2857a.requestFocus();
        this.f2857a.setImeVisibility(true);
        if (this.f2837D != null) {
            this.f2837D.onClick(this);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public void mo4556h() {
        if (this.f2866h != null) {
            SearchableInfo searchableInfo = this.f2866h;
            try {
                if (searchableInfo.getVoiceSearchLaunchWebSearch()) {
                    getContext().startActivity(m3894a(this.f2881x, searchableInfo));
                } else if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                    getContext().startActivity(m3901b(this.f2882y, searchableInfo));
                }
            } catch (ActivityNotFoundException unused) {
                Log.w("SearchView", "Could not find voice search activity");
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public void mo4557i() {
        m3899a(mo4542c());
        m3911q();
        if (this.f2857a.hasFocus()) {
            mo4559l();
        }
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        m3911q();
    }

    /* renamed from: b */
    public void mo2957b() {
        mo4537a((CharSequence) "", false);
        clearFocus();
        m3899a(true);
        this.f2857a.setImeOptions(this.f2849P);
        this.f2848O = false;
    }

    /* renamed from: a */
    public void mo2956a() {
        if (!this.f2848O) {
            this.f2848O = true;
            this.f2849P = this.f2857a.getImeOptions();
            this.f2857a.setImeOptions(this.f2849P | 33554432);
            this.f2857a.setText("");
            setIconified(false);
        }
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f2894a = mo4542c();
        return savedState;
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.mo1845a());
        m3899a(savedState.f2894a);
        requestLayout();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: k */
    public void mo4558k() {
        int i;
        if (this.f2871n.getWidth() > 1) {
            Resources resources = getContext().getResources();
            int paddingLeft = this.f2869l.getPaddingLeft();
            Rect rect = new Rect();
            boolean a = C0994bg.m4486a(this);
            int dimensionPixelSize = this.f2838E ? resources.getDimensionPixelSize(C0676d.abc_dropdownitem_icon_width) + resources.getDimensionPixelSize(C0676d.abc_dropdownitem_text_padding_left) : 0;
            this.f2857a.getDropDownBackground().getPadding(rect);
            if (a) {
                i = -rect.left;
            } else {
                i = paddingLeft - (rect.left + dimensionPixelSize);
            }
            this.f2857a.setDropDownHorizontalOffset(i);
            this.f2857a.setDropDownWidth((((this.f2871n.getWidth() + rect.left) + rect.right) + dimensionPixelSize) - paddingLeft);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo4539a(int i, int i2, String str) {
        if (this.f2836C != null && this.f2836C.mo4621b(i)) {
            return false;
        }
        m3903b(i, 0, null);
        this.f2857a.setImeVisibility(false);
        m3914t();
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo4538a(int i) {
        if (this.f2836C != null && this.f2836C.mo4620a(i)) {
            return false;
        }
        m3906e(i);
        return true;
    }

    /* renamed from: e */
    private void m3906e(int i) {
        Editable text = this.f2857a.getText();
        Cursor a = this.f2865g.mo2500a();
        if (a != null) {
            if (a.moveToPosition(i)) {
                CharSequence c = this.f2865g.mo2509c(a);
                if (c != null) {
                    setQuery(c);
                } else {
                    setQuery(text);
                }
            } else {
                setQuery(text);
            }
        }
    }

    /* renamed from: b */
    private boolean m3903b(int i, int i2, String str) {
        Cursor a = this.f2865g.mo2500a();
        if (a == null || !a.moveToPosition(i)) {
            return false;
        }
        m3897a(m3895a(a, i2, str));
        return true;
    }

    /* renamed from: a */
    private void m3897a(Intent intent) {
        if (intent != null) {
            try {
                getContext().startActivity(intent);
            } catch (RuntimeException e) {
                StringBuilder sb = new StringBuilder();
                sb.append("Failed launch activity: ");
                sb.append(intent);
                Log.e("SearchView", sb.toString(), e);
            }
        }
    }

    private void setQuery(CharSequence charSequence) {
        this.f2857a.setText(charSequence);
        this.f2857a.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo4535a(int i, String str, String str2) {
        getContext().startActivity(m3896a("android.intent.action.SEARCH", null, null, str2, i, str));
    }

    /* renamed from: a */
    private Intent m3896a(String str, Uri uri, String str2, String str3, int i, String str4) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.f2847N);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        if (this.f2850Q != null) {
            intent.putExtra("app_data", this.f2850Q);
        }
        if (i != 0) {
            intent.putExtra("action_key", i);
            intent.putExtra("action_msg", str4);
        }
        intent.setComponent(this.f2866h.getSearchActivity());
        return intent;
    }

    /* renamed from: a */
    private Intent m3894a(Intent intent, SearchableInfo searchableInfo) {
        String str;
        Intent intent2 = new Intent(intent);
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        String str2 = "calling_package";
        if (searchActivity == null) {
            str = null;
        } else {
            str = searchActivity.flattenToShortString();
        }
        intent2.putExtra(str2, str);
        return intent2;
    }

    /* renamed from: b */
    private Intent m3901b(Intent intent, SearchableInfo searchableInfo) {
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1073741824);
        Bundle bundle = new Bundle();
        if (this.f2850Q != null) {
            bundle.putParcelable("app_data", this.f2850Q);
        }
        Intent intent3 = new Intent(intent);
        String str = "free_form";
        int i = 1;
        Resources resources = getResources();
        if (searchableInfo.getVoiceLanguageModeId() != 0) {
            str = resources.getString(searchableInfo.getVoiceLanguageModeId());
        }
        String str2 = null;
        String string = searchableInfo.getVoicePromptTextId() != 0 ? resources.getString(searchableInfo.getVoicePromptTextId()) : null;
        String string2 = searchableInfo.getVoiceLanguageId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageId()) : null;
        if (searchableInfo.getVoiceMaxResults() != 0) {
            i = searchableInfo.getVoiceMaxResults();
        }
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", str);
        intent3.putExtra("android.speech.extra.PROMPT", string);
        intent3.putExtra("android.speech.extra.LANGUAGE", string2);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", i);
        String str3 = "calling_package";
        if (searchActivity != null) {
            str2 = searchActivity.flattenToShortString();
        }
        intent3.putExtra(str3, str2);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    /* renamed from: a */
    private Intent m3895a(Cursor cursor, int i, String str) {
        int i2;
        Uri uri;
        try {
            String a = C0970as.m4335a(cursor, "suggest_intent_action");
            if (a == null) {
                a = this.f2866h.getSuggestIntentAction();
            }
            if (a == null) {
                a = "android.intent.action.SEARCH";
            }
            String str2 = a;
            String a2 = C0970as.m4335a(cursor, "suggest_intent_data");
            if (a2 == null) {
                a2 = this.f2866h.getSuggestIntentData();
            }
            if (a2 != null) {
                String a3 = C0970as.m4335a(cursor, "suggest_intent_data_id");
                if (a3 != null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(a2);
                    sb.append("/");
                    sb.append(Uri.encode(a3));
                    a2 = sb.toString();
                }
            }
            if (a2 == null) {
                uri = null;
            } else {
                uri = Uri.parse(a2);
            }
            String a4 = C0970as.m4335a(cursor, "suggest_intent_query");
            return m3896a(str2, uri, C0970as.m4335a(cursor, "suggest_intent_extra_data"), a4, i, str);
        } catch (RuntimeException e) {
            try {
                i2 = cursor.getPosition();
            } catch (RuntimeException unused) {
                i2 = -1;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Search suggestions cursor at row ");
            sb2.append(i2);
            sb2.append(" returned exception.");
            Log.w("SearchView", sb2.toString(), e);
            return null;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: l */
    public void mo4559l() {
        f2833i.mo4614a(this.f2857a);
        f2833i.mo4616b(this.f2857a);
    }

    /* renamed from: a */
    static boolean m3900a(Context context) {
        return context.getResources().getConfiguration().orientation == 2;
    }
}
