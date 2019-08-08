package android.support.p028v7.app;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnDismissListener;
import android.content.DialogInterface.OnKeyListener;
import android.content.DialogInterface.OnMultiChoiceClickListener;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Message;
import android.support.p017v4.view.C0595r;
import android.support.p017v4.widget.NestedScrollView;
import android.support.p017v4.widget.NestedScrollView.C0621b;
import android.support.p028v7.p029a.C0672a.C0673a;
import android.support.p028v7.p029a.C0672a.C0678f;
import android.support.p028v7.p029a.C0672a.C0682j;
import android.support.p028v7.widget.LinearLayoutCompat;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* renamed from: android.support.v7.app.AlertController */
class AlertController {

    /* renamed from: A */
    private int f1779A;

    /* renamed from: B */
    private boolean f1780B = false;

    /* renamed from: C */
    private CharSequence f1781C;

    /* renamed from: D */
    private Drawable f1782D;

    /* renamed from: E */
    private CharSequence f1783E;

    /* renamed from: F */
    private Drawable f1784F;

    /* renamed from: G */
    private CharSequence f1785G;

    /* renamed from: H */
    private Drawable f1786H;

    /* renamed from: I */
    private int f1787I = 0;

    /* renamed from: J */
    private Drawable f1788J;

    /* renamed from: K */
    private ImageView f1789K;

    /* renamed from: L */
    private TextView f1790L;

    /* renamed from: M */
    private TextView f1791M;

    /* renamed from: N */
    private View f1792N;

    /* renamed from: O */
    private int f1793O;

    /* renamed from: P */
    private int f1794P;

    /* renamed from: Q */
    private boolean f1795Q;

    /* renamed from: R */
    private int f1796R = 0;

    /* renamed from: S */
    private final OnClickListener f1797S = new OnClickListener() {
        public void onClick(View view) {
            Message message = (view != AlertController.this.f1800c || AlertController.this.f1801d == null) ? (view != AlertController.this.f1802e || AlertController.this.f1803f == null) ? (view != AlertController.this.f1804g || AlertController.this.f1805h == null) ? null : Message.obtain(AlertController.this.f1805h) : Message.obtain(AlertController.this.f1803f) : Message.obtain(AlertController.this.f1801d);
            if (message != null) {
                message.sendToTarget();
            }
            AlertController.this.f1813p.obtainMessage(1, AlertController.this.f1798a).sendToTarget();
        }
    };

    /* renamed from: a */
    final C0720d f1798a;

    /* renamed from: b */
    ListView f1799b;

    /* renamed from: c */
    Button f1800c;

    /* renamed from: d */
    Message f1801d;

    /* renamed from: e */
    Button f1802e;

    /* renamed from: f */
    Message f1803f;

    /* renamed from: g */
    Button f1804g;

    /* renamed from: h */
    Message f1805h;

    /* renamed from: i */
    NestedScrollView f1806i;

    /* renamed from: j */
    ListAdapter f1807j;

    /* renamed from: k */
    int f1808k = -1;

    /* renamed from: l */
    int f1809l;

    /* renamed from: m */
    int f1810m;

    /* renamed from: n */
    int f1811n;

    /* renamed from: o */
    int f1812o;

    /* renamed from: p */
    Handler f1813p;

    /* renamed from: q */
    private final Context f1814q;

    /* renamed from: r */
    private final Window f1815r;

    /* renamed from: s */
    private final int f1816s;

    /* renamed from: t */
    private CharSequence f1817t;

    /* renamed from: u */
    private CharSequence f1818u;

    /* renamed from: v */
    private View f1819v;

    /* renamed from: w */
    private int f1820w;

    /* renamed from: x */
    private int f1821x;

    /* renamed from: y */
    private int f1822y;

    /* renamed from: z */
    private int f1823z;

    /* renamed from: android.support.v7.app.AlertController$RecycleListView */
    public static class RecycleListView extends ListView {

        /* renamed from: a */
        private final int f1837a;

        /* renamed from: b */
        private final int f1838b;

        public RecycleListView(Context context) {
            this(context, null);
        }

        public RecycleListView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0682j.RecycleListView);
            this.f1838b = obtainStyledAttributes.getDimensionPixelOffset(C0682j.RecycleListView_paddingBottomNoButtons, -1);
            this.f1837a = obtainStyledAttributes.getDimensionPixelOffset(C0682j.RecycleListView_paddingTopNoTitle, -1);
        }

        /* renamed from: a */
        public void mo2613a(boolean z, boolean z2) {
            if (!z2 || !z) {
                setPadding(getPaddingLeft(), z ? getPaddingTop() : this.f1837a, getPaddingRight(), z2 ? getPaddingBottom() : this.f1838b);
            }
        }
    }

    /* renamed from: android.support.v7.app.AlertController$a */
    public static class C0690a {

        /* renamed from: A */
        public int f1839A;

        /* renamed from: B */
        public int f1840B;

        /* renamed from: C */
        public int f1841C;

        /* renamed from: D */
        public int f1842D;

        /* renamed from: E */
        public boolean f1843E = false;

        /* renamed from: F */
        public boolean[] f1844F;

        /* renamed from: G */
        public boolean f1845G;

        /* renamed from: H */
        public boolean f1846H;

        /* renamed from: I */
        public int f1847I = -1;

        /* renamed from: J */
        public OnMultiChoiceClickListener f1848J;

        /* renamed from: K */
        public Cursor f1849K;

        /* renamed from: L */
        public String f1850L;

        /* renamed from: M */
        public String f1851M;

        /* renamed from: N */
        public OnItemSelectedListener f1852N;

        /* renamed from: O */
        public C0695a f1853O;

        /* renamed from: P */
        public boolean f1854P = true;

        /* renamed from: a */
        public final Context f1855a;

        /* renamed from: b */
        public final LayoutInflater f1856b;

        /* renamed from: c */
        public int f1857c = 0;

        /* renamed from: d */
        public Drawable f1858d;

        /* renamed from: e */
        public int f1859e = 0;

        /* renamed from: f */
        public CharSequence f1860f;

        /* renamed from: g */
        public View f1861g;

        /* renamed from: h */
        public CharSequence f1862h;

        /* renamed from: i */
        public CharSequence f1863i;

        /* renamed from: j */
        public Drawable f1864j;

        /* renamed from: k */
        public DialogInterface.OnClickListener f1865k;

        /* renamed from: l */
        public CharSequence f1866l;

        /* renamed from: m */
        public Drawable f1867m;

        /* renamed from: n */
        public DialogInterface.OnClickListener f1868n;

        /* renamed from: o */
        public CharSequence f1869o;

        /* renamed from: p */
        public Drawable f1870p;

        /* renamed from: q */
        public DialogInterface.OnClickListener f1871q;

        /* renamed from: r */
        public boolean f1872r;

        /* renamed from: s */
        public OnCancelListener f1873s;

        /* renamed from: t */
        public OnDismissListener f1874t;

        /* renamed from: u */
        public OnKeyListener f1875u;

        /* renamed from: v */
        public CharSequence[] f1876v;

        /* renamed from: w */
        public ListAdapter f1877w;

        /* renamed from: x */
        public DialogInterface.OnClickListener f1878x;

        /* renamed from: y */
        public int f1879y;

        /* renamed from: z */
        public View f1880z;

        /* renamed from: android.support.v7.app.AlertController$a$a */
        public interface C0695a {
            /* renamed from: a */
            void mo2620a(ListView listView);
        }

        public C0690a(Context context) {
            this.f1855a = context;
            this.f1872r = true;
            this.f1856b = (LayoutInflater) context.getSystemService("layout_inflater");
        }

        /* renamed from: a */
        public void mo2614a(AlertController alertController) {
            if (this.f1861g != null) {
                alertController.mo2603b(this.f1861g);
            } else {
                if (this.f1860f != null) {
                    alertController.mo2600a(this.f1860f);
                }
                if (this.f1858d != null) {
                    alertController.mo2598a(this.f1858d);
                }
                if (this.f1857c != 0) {
                    alertController.mo2602b(this.f1857c);
                }
                if (this.f1859e != 0) {
                    alertController.mo2602b(alertController.mo2606c(this.f1859e));
                }
            }
            if (this.f1862h != null) {
                alertController.mo2604b(this.f1862h);
            }
            if (!(this.f1863i == null && this.f1864j == null)) {
                alertController.mo2597a(-1, this.f1863i, this.f1865k, (Message) null, this.f1864j);
            }
            if (!(this.f1866l == null && this.f1867m == null)) {
                alertController.mo2597a(-2, this.f1866l, this.f1868n, (Message) null, this.f1867m);
            }
            if (!(this.f1869o == null && this.f1870p == null)) {
                alertController.mo2597a(-3, this.f1869o, this.f1871q, (Message) null, this.f1870p);
            }
            if (!(this.f1876v == null && this.f1849K == null && this.f1877w == null)) {
                m2734b(alertController);
            }
            if (this.f1880z != null) {
                if (this.f1843E) {
                    alertController.mo2599a(this.f1880z, this.f1839A, this.f1840B, this.f1841C, this.f1842D);
                    return;
                }
                alertController.mo2607c(this.f1880z);
            } else if (this.f1879y != 0) {
                alertController.mo2596a(this.f1879y);
            }
        }

        /* JADX WARNING: type inference failed for: r9v0, types: [android.widget.ListAdapter] */
        /* JADX WARNING: type inference failed for: r9v1, types: [android.support.v7.app.AlertController$c] */
        /* JADX WARNING: type inference failed for: r9v2, types: [android.widget.ListAdapter] */
        /* JADX WARNING: type inference failed for: r2v2, types: [android.widget.SimpleCursorAdapter] */
        /* JADX WARNING: type inference failed for: r9v4 */
        /* JADX WARNING: type inference failed for: r1v23, types: [android.support.v7.app.AlertController$a$2] */
        /* JADX WARNING: type inference failed for: r1v24, types: [android.support.v7.app.AlertController$a$1] */
        /* JADX WARNING: type inference failed for: r9v7 */
        /* JADX WARNING: type inference failed for: r9v8 */
        /* JADX WARNING: type inference failed for: r1v25, types: [android.support.v7.app.AlertController$a$2] */
        /* JADX WARNING: type inference failed for: r1v26, types: [android.support.v7.app.AlertController$a$1] */
        /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r9v4
          assigns: [?[OBJECT, ARRAY], android.support.v7.app.AlertController$a$2, android.support.v7.app.AlertController$a$1]
          uses: [android.widget.ListAdapter, android.support.v7.app.AlertController$a$2, android.support.v7.app.AlertController$a$1]
          mth insns count: 73
        	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
        	at jadx.core.ProcessClass.process(ProcessClass.java:30)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
         */
        /* JADX WARNING: Unknown variable types count: 6 */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void m2734b(final android.support.p028v7.app.AlertController r11) {
            /*
                r10 = this;
                android.view.LayoutInflater r0 = r10.f1856b
                int r1 = r11.f1809l
                r2 = 0
                android.view.View r0 = r0.inflate(r1, r2)
                android.support.v7.app.AlertController$RecycleListView r0 = (android.support.p028v7.app.AlertController.RecycleListView) r0
                boolean r1 = r10.f1845G
                r8 = 1
                if (r1 == 0) goto L_0x0035
                android.database.Cursor r1 = r10.f1849K
                if (r1 != 0) goto L_0x0026
                android.support.v7.app.AlertController$a$1 r9 = new android.support.v7.app.AlertController$a$1
                android.content.Context r3 = r10.f1855a
                int r4 = r11.f1810m
                r5 = 16908308(0x1020014, float:2.3877285E-38)
                java.lang.CharSequence[] r6 = r10.f1876v
                r1 = r9
                r2 = r10
                r7 = r0
                r1.<init>(r3, r4, r5, r6, r7)
                goto L_0x006e
            L_0x0026:
                android.support.v7.app.AlertController$a$2 r9 = new android.support.v7.app.AlertController$a$2
                android.content.Context r3 = r10.f1855a
                android.database.Cursor r4 = r10.f1849K
                r5 = 0
                r1 = r9
                r2 = r10
                r6 = r0
                r7 = r11
                r1.<init>(r3, r4, r5, r6, r7)
                goto L_0x006e
            L_0x0035:
                boolean r1 = r10.f1846H
                if (r1 == 0) goto L_0x003d
                int r1 = r11.f1811n
            L_0x003b:
                r4 = r1
                goto L_0x0040
            L_0x003d:
                int r1 = r11.f1812o
                goto L_0x003b
            L_0x0040:
                android.database.Cursor r1 = r10.f1849K
                r2 = 16908308(0x1020014, float:2.3877285E-38)
                if (r1 == 0) goto L_0x005e
                android.widget.SimpleCursorAdapter r1 = new android.widget.SimpleCursorAdapter
                android.content.Context r3 = r10.f1855a
                android.database.Cursor r5 = r10.f1849K
                java.lang.String[] r6 = new java.lang.String[r8]
                java.lang.String r7 = r10.f1850L
                r9 = 0
                r6[r9] = r7
                int[] r7 = new int[r8]
                r7[r9] = r2
                r2 = r1
                r2.<init>(r3, r4, r5, r6, r7)
                r9 = r1
                goto L_0x006e
            L_0x005e:
                android.widget.ListAdapter r1 = r10.f1877w
                if (r1 == 0) goto L_0x0065
                android.widget.ListAdapter r9 = r10.f1877w
                goto L_0x006e
            L_0x0065:
                android.support.v7.app.AlertController$c r9 = new android.support.v7.app.AlertController$c
                android.content.Context r1 = r10.f1855a
                java.lang.CharSequence[] r3 = r10.f1876v
                r9.<init>(r1, r4, r2, r3)
            L_0x006e:
                android.support.v7.app.AlertController$a$a r1 = r10.f1853O
                if (r1 == 0) goto L_0x0077
                android.support.v7.app.AlertController$a$a r1 = r10.f1853O
                r1.mo2620a(r0)
            L_0x0077:
                r11.f1807j = r9
                int r1 = r10.f1847I
                r11.f1808k = r1
                android.content.DialogInterface$OnClickListener r1 = r10.f1878x
                if (r1 == 0) goto L_0x008a
                android.support.v7.app.AlertController$a$3 r1 = new android.support.v7.app.AlertController$a$3
                r1.<init>(r11)
                r0.setOnItemClickListener(r1)
                goto L_0x0096
            L_0x008a:
                android.content.DialogInterface$OnMultiChoiceClickListener r1 = r10.f1848J
                if (r1 == 0) goto L_0x0096
                android.support.v7.app.AlertController$a$4 r1 = new android.support.v7.app.AlertController$a$4
                r1.<init>(r0, r11)
                r0.setOnItemClickListener(r1)
            L_0x0096:
                android.widget.AdapterView$OnItemSelectedListener r1 = r10.f1852N
                if (r1 == 0) goto L_0x009f
                android.widget.AdapterView$OnItemSelectedListener r1 = r10.f1852N
                r0.setOnItemSelectedListener(r1)
            L_0x009f:
                boolean r1 = r10.f1846H
                if (r1 == 0) goto L_0x00a7
                r0.setChoiceMode(r8)
                goto L_0x00af
            L_0x00a7:
                boolean r1 = r10.f1845G
                if (r1 == 0) goto L_0x00af
                r1 = 2
                r0.setChoiceMode(r1)
            L_0x00af:
                r11.f1799b = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.p028v7.app.AlertController.C0690a.m2734b(android.support.v7.app.AlertController):void");
        }
    }

    /* renamed from: android.support.v7.app.AlertController$b */
    private static final class C0696b extends Handler {

        /* renamed from: a */
        private WeakReference<DialogInterface> f1893a;

        public C0696b(DialogInterface dialogInterface) {
            this.f1893a = new WeakReference<>(dialogInterface);
        }

        public void handleMessage(Message message) {
            int i = message.what;
            if (i != 1) {
                switch (i) {
                    case -3:
                    case -2:
                    case -1:
                        ((DialogInterface.OnClickListener) message.obj).onClick((DialogInterface) this.f1893a.get(), message.what);
                        return;
                    default:
                        return;
                }
            } else {
                ((DialogInterface) message.obj).dismiss();
            }
        }
    }

    /* renamed from: android.support.v7.app.AlertController$c */
    private static class C0697c extends ArrayAdapter<CharSequence> {
        public long getItemId(int i) {
            return (long) i;
        }

        public boolean hasStableIds() {
            return true;
        }

        public C0697c(Context context, int i, int i2, CharSequence[] charSequenceArr) {
            super(context, i, i2, charSequenceArr);
        }
    }

    /* renamed from: a */
    private static boolean m2712a(Context context) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(C0673a.alertDialogCenterButtons, typedValue, true);
        if (typedValue.data != 0) {
            return true;
        }
        return false;
    }

    public AlertController(Context context, C0720d dVar, Window window) {
        this.f1814q = context;
        this.f1798a = dVar;
        this.f1815r = window;
        this.f1813p = new C0696b(dVar);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, C0682j.AlertDialog, C0673a.alertDialogStyle, 0);
        this.f1793O = obtainStyledAttributes.getResourceId(C0682j.AlertDialog_android_layout, 0);
        this.f1794P = obtainStyledAttributes.getResourceId(C0682j.AlertDialog_buttonPanelSideLayout, 0);
        this.f1809l = obtainStyledAttributes.getResourceId(C0682j.AlertDialog_listLayout, 0);
        this.f1810m = obtainStyledAttributes.getResourceId(C0682j.AlertDialog_multiChoiceItemLayout, 0);
        this.f1811n = obtainStyledAttributes.getResourceId(C0682j.AlertDialog_singleChoiceItemLayout, 0);
        this.f1812o = obtainStyledAttributes.getResourceId(C0682j.AlertDialog_listItemLayout, 0);
        this.f1795Q = obtainStyledAttributes.getBoolean(C0682j.AlertDialog_showTitle, true);
        this.f1816s = obtainStyledAttributes.getDimensionPixelSize(C0682j.AlertDialog_buttonIconDimen, 0);
        obtainStyledAttributes.recycle();
        dVar.mo2774a(1);
    }

    /* renamed from: a */
    static boolean m2713a(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (m2713a(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public void mo2595a() {
        this.f1798a.setContentView(m2714b());
        m2716c();
    }

    /* renamed from: b */
    private int m2714b() {
        if (this.f1794P == 0) {
            return this.f1793O;
        }
        if (this.f1796R == 1) {
            return this.f1794P;
        }
        return this.f1793O;
    }

    /* renamed from: a */
    public void mo2600a(CharSequence charSequence) {
        this.f1817t = charSequence;
        if (this.f1790L != null) {
            this.f1790L.setText(charSequence);
        }
    }

    /* renamed from: b */
    public void mo2603b(View view) {
        this.f1792N = view;
    }

    /* renamed from: b */
    public void mo2604b(CharSequence charSequence) {
        this.f1818u = charSequence;
        if (this.f1791M != null) {
            this.f1791M.setText(charSequence);
        }
    }

    /* renamed from: a */
    public void mo2596a(int i) {
        this.f1819v = null;
        this.f1820w = i;
        this.f1780B = false;
    }

    /* renamed from: c */
    public void mo2607c(View view) {
        this.f1819v = view;
        this.f1820w = 0;
        this.f1780B = false;
    }

    /* renamed from: a */
    public void mo2599a(View view, int i, int i2, int i3, int i4) {
        this.f1819v = view;
        this.f1820w = 0;
        this.f1780B = true;
        this.f1821x = i;
        this.f1822y = i2;
        this.f1823z = i3;
        this.f1779A = i4;
    }

    /* renamed from: a */
    public void mo2597a(int i, CharSequence charSequence, DialogInterface.OnClickListener onClickListener, Message message, Drawable drawable) {
        if (message == null && onClickListener != null) {
            message = this.f1813p.obtainMessage(i, onClickListener);
        }
        switch (i) {
            case -3:
                this.f1785G = charSequence;
                this.f1805h = message;
                this.f1786H = drawable;
                return;
            case -2:
                this.f1783E = charSequence;
                this.f1803f = message;
                this.f1784F = drawable;
                return;
            case -1:
                this.f1781C = charSequence;
                this.f1801d = message;
                this.f1782D = drawable;
                return;
            default:
                throw new IllegalArgumentException("Button does not exist");
        }
    }

    /* renamed from: b */
    public void mo2602b(int i) {
        this.f1788J = null;
        this.f1787I = i;
        if (this.f1789K == null) {
            return;
        }
        if (i != 0) {
            this.f1789K.setVisibility(0);
            this.f1789K.setImageResource(this.f1787I);
            return;
        }
        this.f1789K.setVisibility(8);
    }

    /* renamed from: a */
    public void mo2598a(Drawable drawable) {
        this.f1788J = drawable;
        this.f1787I = 0;
        if (this.f1789K == null) {
            return;
        }
        if (drawable != null) {
            this.f1789K.setVisibility(0);
            this.f1789K.setImageDrawable(drawable);
            return;
        }
        this.f1789K.setVisibility(8);
    }

    /* renamed from: c */
    public int mo2606c(int i) {
        TypedValue typedValue = new TypedValue();
        this.f1814q.getTheme().resolveAttribute(i, typedValue, true);
        return typedValue.resourceId;
    }

    /* renamed from: a */
    public boolean mo2601a(int i, KeyEvent keyEvent) {
        return this.f1806i != null && this.f1806i.mo2244a(keyEvent);
    }

    /* renamed from: b */
    public boolean mo2605b(int i, KeyEvent keyEvent) {
        return this.f1806i != null && this.f1806i.mo2244a(keyEvent);
    }

    /* renamed from: a */
    private ViewGroup m2707a(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    /* renamed from: c */
    private void m2716c() {
        View findViewById = this.f1815r.findViewById(C0678f.parentPanel);
        View findViewById2 = findViewById.findViewById(C0678f.topPanel);
        View findViewById3 = findViewById.findViewById(C0678f.contentPanel);
        View findViewById4 = findViewById.findViewById(C0678f.buttonPanel);
        ViewGroup viewGroup = (ViewGroup) findViewById.findViewById(C0678f.customPanel);
        m2709a(viewGroup);
        View findViewById5 = viewGroup.findViewById(C0678f.topPanel);
        View findViewById6 = viewGroup.findViewById(C0678f.contentPanel);
        View findViewById7 = viewGroup.findViewById(C0678f.buttonPanel);
        ViewGroup a = m2707a(findViewById5, findViewById2);
        ViewGroup a2 = m2707a(findViewById6, findViewById3);
        ViewGroup a3 = m2707a(findViewById7, findViewById4);
        m2717c(a2);
        m2718d(a3);
        m2715b(a);
        char c = 0;
        boolean z = (viewGroup == null || viewGroup.getVisibility() == 8) ? false : true;
        boolean z2 = (a == null || a.getVisibility() == 8) ? false : true;
        boolean z3 = (a3 == null || a3.getVisibility() == 8) ? false : true;
        if (!z3 && a2 != null) {
            View findViewById8 = a2.findViewById(C0678f.textSpacerNoButtons);
            if (findViewById8 != null) {
                findViewById8.setVisibility(0);
            }
        }
        if (z2) {
            if (this.f1806i != null) {
                this.f1806i.setClipToPadding(true);
            }
            View view = null;
            if (!(this.f1818u == null && this.f1799b == null)) {
                view = a.findViewById(C0678f.titleDividerNoCustom);
            }
            if (view != null) {
                view.setVisibility(0);
            }
        } else if (a2 != null) {
            View findViewById9 = a2.findViewById(C0678f.textSpacerNoTitle);
            if (findViewById9 != null) {
                findViewById9.setVisibility(0);
            }
        }
        if (this.f1799b instanceof RecycleListView) {
            ((RecycleListView) this.f1799b).mo2613a(z2, z3);
        }
        if (!z) {
            View view2 = this.f1799b != null ? this.f1799b : this.f1806i;
            if (view2 != null) {
                if (z3) {
                    c = 2;
                }
                m2710a(a2, view2, z2 | c ? 1 : 0, 3);
            }
        }
        ListView listView = this.f1799b;
        if (listView != null && this.f1807j != null) {
            listView.setAdapter(this.f1807j);
            int i = this.f1808k;
            if (i > -1) {
                listView.setItemChecked(i, true);
                listView.setSelection(i);
            }
        }
    }

    /* renamed from: a */
    private void m2710a(ViewGroup viewGroup, View view, int i, int i2) {
        final View findViewById = this.f1815r.findViewById(C0678f.scrollIndicatorUp);
        View findViewById2 = this.f1815r.findViewById(C0678f.scrollIndicatorDown);
        if (VERSION.SDK_INT >= 23) {
            C0595r.m2234a(view, i, i2);
            if (findViewById != null) {
                viewGroup.removeView(findViewById);
            }
            if (findViewById2 != null) {
                viewGroup.removeView(findViewById2);
                return;
            }
            return;
        }
        final View view2 = null;
        if (findViewById != null && (i & 1) == 0) {
            viewGroup.removeView(findViewById);
            findViewById = null;
        }
        if (findViewById2 == null || (i & 2) != 0) {
            view2 = findViewById2;
        } else {
            viewGroup.removeView(findViewById2);
        }
        if (findViewById != null || view2 != null) {
            if (this.f1818u != null) {
                this.f1806i.setOnScrollChangeListener(new C0621b() {
                    /* renamed from: a */
                    public void mo2306a(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4) {
                        AlertController.m2708a(nestedScrollView, findViewById, view2);
                    }
                });
                this.f1806i.post(new Runnable() {
                    public void run() {
                        AlertController.m2708a(AlertController.this.f1806i, findViewById, view2);
                    }
                });
            } else if (this.f1799b != null) {
                this.f1799b.setOnScrollListener(new OnScrollListener() {
                    public void onScrollStateChanged(AbsListView absListView, int i) {
                    }

                    public void onScroll(AbsListView absListView, int i, int i2, int i3) {
                        AlertController.m2708a(absListView, findViewById, view2);
                    }
                });
                this.f1799b.post(new Runnable() {
                    public void run() {
                        AlertController.m2708a(AlertController.this.f1799b, findViewById, view2);
                    }
                });
            } else {
                if (findViewById != null) {
                    viewGroup.removeView(findViewById);
                }
                if (view2 != null) {
                    viewGroup.removeView(view2);
                }
            }
        }
    }

    /* renamed from: a */
    private void m2709a(ViewGroup viewGroup) {
        boolean z = false;
        View view = this.f1819v != null ? this.f1819v : this.f1820w != 0 ? LayoutInflater.from(this.f1814q).inflate(this.f1820w, viewGroup, false) : null;
        if (view != null) {
            z = true;
        }
        if (!z || !m2713a(view)) {
            this.f1815r.setFlags(131072, 131072);
        }
        if (z) {
            FrameLayout frameLayout = (FrameLayout) this.f1815r.findViewById(C0678f.custom);
            frameLayout.addView(view, new LayoutParams(-1, -1));
            if (this.f1780B) {
                frameLayout.setPadding(this.f1821x, this.f1822y, this.f1823z, this.f1779A);
            }
            if (this.f1799b != null) {
                ((LinearLayoutCompat.LayoutParams) viewGroup.getLayoutParams()).f2690g = 0.0f;
                return;
            }
            return;
        }
        viewGroup.setVisibility(8);
    }

    /* renamed from: b */
    private void m2715b(ViewGroup viewGroup) {
        if (this.f1792N != null) {
            viewGroup.addView(this.f1792N, 0, new LayoutParams(-1, -2));
            this.f1815r.findViewById(C0678f.title_template).setVisibility(8);
            return;
        }
        this.f1789K = (ImageView) this.f1815r.findViewById(16908294);
        if (!(!TextUtils.isEmpty(this.f1817t)) || !this.f1795Q) {
            this.f1815r.findViewById(C0678f.title_template).setVisibility(8);
            this.f1789K.setVisibility(8);
            viewGroup.setVisibility(8);
            return;
        }
        this.f1790L = (TextView) this.f1815r.findViewById(C0678f.alertTitle);
        this.f1790L.setText(this.f1817t);
        if (this.f1787I != 0) {
            this.f1789K.setImageResource(this.f1787I);
        } else if (this.f1788J != null) {
            this.f1789K.setImageDrawable(this.f1788J);
        } else {
            this.f1790L.setPadding(this.f1789K.getPaddingLeft(), this.f1789K.getPaddingTop(), this.f1789K.getPaddingRight(), this.f1789K.getPaddingBottom());
            this.f1789K.setVisibility(8);
        }
    }

    /* renamed from: c */
    private void m2717c(ViewGroup viewGroup) {
        this.f1806i = (NestedScrollView) this.f1815r.findViewById(C0678f.scrollView);
        this.f1806i.setFocusable(false);
        this.f1806i.setNestedScrollingEnabled(false);
        this.f1791M = (TextView) viewGroup.findViewById(16908299);
        if (this.f1791M != null) {
            if (this.f1818u != null) {
                this.f1791M.setText(this.f1818u);
            } else {
                this.f1791M.setVisibility(8);
                this.f1806i.removeView(this.f1791M);
                if (this.f1799b != null) {
                    ViewGroup viewGroup2 = (ViewGroup) this.f1806i.getParent();
                    int indexOfChild = viewGroup2.indexOfChild(this.f1806i);
                    viewGroup2.removeViewAt(indexOfChild);
                    viewGroup2.addView(this.f1799b, indexOfChild, new LayoutParams(-1, -1));
                } else {
                    viewGroup.setVisibility(8);
                }
            }
        }
    }

    /* renamed from: a */
    static void m2708a(View view, View view2, View view3) {
        int i = 4;
        if (view2 != null) {
            view2.setVisibility(view.canScrollVertically(-1) ? 0 : 4);
        }
        if (view3 != null) {
            if (view.canScrollVertically(1)) {
                i = 0;
            }
            view3.setVisibility(i);
        }
    }

    /* renamed from: d */
    private void m2718d(ViewGroup viewGroup) {
        boolean z;
        this.f1800c = (Button) viewGroup.findViewById(16908313);
        this.f1800c.setOnClickListener(this.f1797S);
        boolean z2 = true;
        if (!TextUtils.isEmpty(this.f1781C) || this.f1782D != null) {
            this.f1800c.setText(this.f1781C);
            if (this.f1782D != null) {
                this.f1782D.setBounds(0, 0, this.f1816s, this.f1816s);
                this.f1800c.setCompoundDrawables(this.f1782D, null, null, null);
            }
            this.f1800c.setVisibility(0);
            z = true;
        } else {
            this.f1800c.setVisibility(8);
            z = false;
        }
        this.f1802e = (Button) viewGroup.findViewById(16908314);
        this.f1802e.setOnClickListener(this.f1797S);
        if (!TextUtils.isEmpty(this.f1783E) || this.f1784F != null) {
            this.f1802e.setText(this.f1783E);
            if (this.f1784F != null) {
                this.f1784F.setBounds(0, 0, this.f1816s, this.f1816s);
                this.f1802e.setCompoundDrawables(this.f1784F, null, null, null);
            }
            this.f1802e.setVisibility(0);
            z |= true;
        } else {
            this.f1802e.setVisibility(8);
        }
        this.f1804g = (Button) viewGroup.findViewById(16908315);
        this.f1804g.setOnClickListener(this.f1797S);
        if (!TextUtils.isEmpty(this.f1785G) || this.f1786H != null) {
            this.f1804g.setText(this.f1785G);
            if (this.f1782D != null) {
                this.f1782D.setBounds(0, 0, this.f1816s, this.f1816s);
                this.f1800c.setCompoundDrawables(this.f1782D, null, null, null);
            }
            this.f1804g.setVisibility(0);
            z |= true;
        } else {
            this.f1804g.setVisibility(8);
        }
        if (m2712a(this.f1814q)) {
            if (z) {
                m2711a(this.f1800c);
            } else if (z) {
                m2711a(this.f1802e);
            } else if (z) {
                m2711a(this.f1804g);
            }
        }
        if (!z) {
            z2 = false;
        }
        if (!z2) {
            viewGroup.setVisibility(8);
        }
    }

    /* renamed from: a */
    private void m2711a(Button button) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        button.setLayoutParams(layoutParams);
    }
}
