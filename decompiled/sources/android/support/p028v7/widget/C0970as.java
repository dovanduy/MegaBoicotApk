package android.support.p028v7.widget;

import android.app.SearchManager;
import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Bundle;
import android.support.p017v4.content.C0356c;
import android.support.p017v4.widget.C0659n;
import android.support.p028v7.p029a.C0672a.C0673a;
import android.support.p028v7.p029a.C0672a.C0678f;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.WeakHashMap;

/* renamed from: android.support.v7.widget.as */
/* compiled from: SuggestionsAdapter */
class C0970as extends C0659n implements OnClickListener {

    /* renamed from: j */
    private final SearchManager f3187j = ((SearchManager) this.f1718d.getSystemService("search"));

    /* renamed from: k */
    private final SearchView f3188k;

    /* renamed from: l */
    private final SearchableInfo f3189l;

    /* renamed from: m */
    private final Context f3190m;

    /* renamed from: n */
    private final WeakHashMap<String, ConstantState> f3191n;

    /* renamed from: o */
    private final int f3192o;

    /* renamed from: p */
    private boolean f3193p = false;

    /* renamed from: q */
    private int f3194q = 1;

    /* renamed from: r */
    private ColorStateList f3195r;

    /* renamed from: s */
    private int f3196s = -1;

    /* renamed from: t */
    private int f3197t = -1;

    /* renamed from: u */
    private int f3198u = -1;

    /* renamed from: v */
    private int f3199v = -1;

    /* renamed from: w */
    private int f3200w = -1;

    /* renamed from: x */
    private int f3201x = -1;

    /* renamed from: android.support.v7.widget.as$a */
    /* compiled from: SuggestionsAdapter */
    private static final class C0971a {

        /* renamed from: a */
        public final TextView f3202a;

        /* renamed from: b */
        public final TextView f3203b;

        /* renamed from: c */
        public final ImageView f3204c;

        /* renamed from: d */
        public final ImageView f3205d;

        /* renamed from: e */
        public final ImageView f3206e;

        public C0971a(View view) {
            this.f3202a = (TextView) view.findViewById(16908308);
            this.f3203b = (TextView) view.findViewById(16908309);
            this.f3204c = (ImageView) view.findViewById(16908295);
            this.f3205d = (ImageView) view.findViewById(16908296);
            this.f3206e = (ImageView) view.findViewById(C0678f.edit_query);
        }
    }

    public boolean hasStableIds() {
        return false;
    }

    public C0970as(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap<String, ConstantState> weakHashMap) {
        super(context, searchView.getSuggestionRowLayout(), (Cursor) null, true);
        this.f3188k = searchView;
        this.f3189l = searchableInfo;
        this.f3192o = searchView.getSuggestionCommitIconResId();
        this.f3190m = context;
        this.f3191n = weakHashMap;
    }

    /* renamed from: a */
    public void mo5072a(int i) {
        this.f3194q = i;
    }

    /* renamed from: a */
    public Cursor mo2501a(CharSequence charSequence) {
        String charSequence2 = charSequence == null ? "" : charSequence.toString();
        if (this.f3188k.getVisibility() != 0 || this.f3188k.getWindowVisibility() != 0) {
            return null;
        }
        try {
            Cursor a = mo5070a(this.f3189l, charSequence2, 50);
            if (a != null) {
                a.getCount();
                return a;
            }
        } catch (RuntimeException e) {
            Log.w("SuggestionsAdapter", "Search suggestions query threw an exception.", e);
        }
        return null;
    }

    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        m4343d(mo2500a());
    }

    public void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        m4343d(mo2500a());
    }

    /* renamed from: d */
    private void m4343d(Cursor cursor) {
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null && !extras.getBoolean("in_progress")) {
        }
    }

    /* renamed from: a */
    public void mo2504a(Cursor cursor) {
        if (this.f3193p) {
            Log.w("SuggestionsAdapter", "Tried to change cursor after adapter was closed.");
            if (cursor != null) {
                cursor.close();
            }
            return;
        }
        try {
            super.mo2504a(cursor);
            if (cursor != null) {
                this.f3196s = cursor.getColumnIndex("suggest_text_1");
                this.f3197t = cursor.getColumnIndex("suggest_text_2");
                this.f3198u = cursor.getColumnIndex("suggest_text_2_url");
                this.f3199v = cursor.getColumnIndex("suggest_icon_1");
                this.f3200w = cursor.getColumnIndex("suggest_icon_2");
                this.f3201x = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e);
        }
    }

    /* renamed from: a */
    public View mo2502a(Context context, Cursor cursor, ViewGroup viewGroup) {
        View a = super.mo2502a(context, cursor, viewGroup);
        a.setTag(new C0971a(a));
        ((ImageView) a.findViewById(C0678f.edit_query)).setImageResource(this.f3192o);
        return a;
    }

    /* renamed from: a */
    public void mo2505a(View view, Context context, Cursor cursor) {
        CharSequence charSequence;
        C0971a aVar = (C0971a) view.getTag();
        int i = this.f3201x != -1 ? cursor.getInt(this.f3201x) : 0;
        if (aVar.f3202a != null) {
            m4337a(aVar.f3202a, (CharSequence) m4334a(cursor, this.f3196s));
        }
        if (aVar.f3203b != null) {
            String a = m4334a(cursor, this.f3198u);
            if (a != null) {
                charSequence = m4342b((CharSequence) a);
            } else {
                charSequence = m4334a(cursor, this.f3197t);
            }
            if (TextUtils.isEmpty(charSequence)) {
                if (aVar.f3202a != null) {
                    aVar.f3202a.setSingleLine(false);
                    aVar.f3202a.setMaxLines(2);
                }
            } else if (aVar.f3202a != null) {
                aVar.f3202a.setSingleLine(true);
                aVar.f3202a.setMaxLines(1);
            }
            m4337a(aVar.f3203b, charSequence);
        }
        if (aVar.f3204c != null) {
            m4336a(aVar.f3204c, m4344e(cursor), 4);
        }
        if (aVar.f3205d != null) {
            m4336a(aVar.f3205d, m4345f(cursor), 8);
        }
        if (this.f3194q == 2 || (this.f3194q == 1 && (i & 1) != 0)) {
            aVar.f3206e.setVisibility(0);
            aVar.f3206e.setTag(aVar.f3202a.getText());
            aVar.f3206e.setOnClickListener(this);
            return;
        }
        aVar.f3206e.setVisibility(8);
    }

    public void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.f3188k.mo4536a((CharSequence) tag);
        }
    }

    /* renamed from: b */
    private CharSequence m4342b(CharSequence charSequence) {
        if (this.f3195r == null) {
            TypedValue typedValue = new TypedValue();
            this.f1718d.getTheme().resolveAttribute(C0673a.textColorSearchUrl, typedValue, true);
            this.f3195r = this.f1718d.getResources().getColorStateList(typedValue.resourceId);
        }
        SpannableString spannableString = new SpannableString(charSequence);
        TextAppearanceSpan textAppearanceSpan = new TextAppearanceSpan(null, 0, 0, this.f3195r, null);
        spannableString.setSpan(textAppearanceSpan, 0, charSequence.length(), 33);
        return spannableString;
    }

    /* renamed from: a */
    private void m4337a(TextView textView, CharSequence charSequence) {
        textView.setText(charSequence);
        if (TextUtils.isEmpty(charSequence)) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
        }
    }

    /* renamed from: e */
    private Drawable m4344e(Cursor cursor) {
        if (this.f3199v == -1) {
            return null;
        }
        Drawable a = m4333a(cursor.getString(this.f3199v));
        if (a != null) {
            return a;
        }
        return m4346g(cursor);
    }

    /* renamed from: f */
    private Drawable m4345f(Cursor cursor) {
        if (this.f3200w == -1) {
            return null;
        }
        return m4333a(cursor.getString(this.f3200w));
    }

    /* renamed from: a */
    private void m4336a(ImageView imageView, Drawable drawable, int i) {
        imageView.setImageDrawable(drawable);
        if (drawable == null) {
            imageView.setVisibility(i);
            return;
        }
        imageView.setVisibility(0);
        drawable.setVisible(false, false);
        drawable.setVisible(true, false);
    }

    /* renamed from: c */
    public CharSequence mo2509c(Cursor cursor) {
        if (cursor == null) {
            return null;
        }
        String a = m4335a(cursor, "suggest_intent_query");
        if (a != null) {
            return a;
        }
        if (this.f3189l.shouldRewriteQueryFromData()) {
            String a2 = m4335a(cursor, "suggest_intent_data");
            if (a2 != null) {
                return a2;
            }
        }
        if (this.f3189l.shouldRewriteQueryFromText()) {
            String a3 = m4335a(cursor, "suggest_text_1");
            if (a3 != null) {
                return a3;
            }
        }
        return null;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i, view, viewGroup);
        } catch (RuntimeException e) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e);
            View a = mo2502a(this.f1718d, this.f1717c, viewGroup);
            if (a != null) {
                ((C0971a) a.getTag()).f3202a.setText(e.toString());
            }
            return a;
        }
    }

    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i, view, viewGroup);
        } catch (RuntimeException e) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e);
            View b = mo2507b(this.f1718d, this.f1717c, viewGroup);
            if (b != null) {
                ((C0971a) b.getTag()).f3202a.setText(e.toString());
            }
            return b;
        }
    }

    /* renamed from: a */
    private Drawable m4333a(String str) {
        if (str == null || str.isEmpty() || "0".equals(str)) {
            return null;
        }
        try {
            int parseInt = Integer.parseInt(str);
            StringBuilder sb = new StringBuilder();
            sb.append("android.resource://");
            sb.append(this.f3190m.getPackageName());
            sb.append("/");
            sb.append(parseInt);
            String sb2 = sb.toString();
            Drawable b = m4341b(sb2);
            if (b != null) {
                return b;
            }
            Drawable a = C0356c.m1312a(this.f3190m, parseInt);
            m4338a(sb2, a);
            return a;
        } catch (NumberFormatException unused) {
            Drawable b2 = m4341b(str);
            if (b2 != null) {
                return b2;
            }
            Drawable b3 = m4340b(Uri.parse(str));
            m4338a(str, b3);
            return b3;
        } catch (NotFoundException unused2) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Icon resource not found: ");
            sb3.append(str);
            Log.w("SuggestionsAdapter", sb3.toString());
            return null;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:7|8|9) */
    /* JADX WARNING: Code restructure failed: missing block: B:8:?, code lost:
        r2 = new java.lang.StringBuilder();
        r2.append("Resource does not exist: ");
        r2.append(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0028, code lost:
        throw new java.io.FileNotFoundException(r2.toString());
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0012 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.graphics.drawable.Drawable m4340b(android.net.Uri r7) {
        /*
            r6 = this;
            r0 = 0
            java.lang.String r1 = r7.getScheme()     // Catch:{ FileNotFoundException -> 0x0089 }
            java.lang.String r2 = "android.resource"
            boolean r1 = r2.equals(r1)     // Catch:{ FileNotFoundException -> 0x0089 }
            if (r1 == 0) goto L_0x0029
            android.graphics.drawable.Drawable r1 = r6.mo5071a(r7)     // Catch:{ NotFoundException -> 0x0012 }
            return r1
        L_0x0012:
            java.io.FileNotFoundException r1 = new java.io.FileNotFoundException     // Catch:{ FileNotFoundException -> 0x0089 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x0089 }
            r2.<init>()     // Catch:{ FileNotFoundException -> 0x0089 }
            java.lang.String r3 = "Resource does not exist: "
            r2.append(r3)     // Catch:{ FileNotFoundException -> 0x0089 }
            r2.append(r7)     // Catch:{ FileNotFoundException -> 0x0089 }
            java.lang.String r2 = r2.toString()     // Catch:{ FileNotFoundException -> 0x0089 }
            r1.<init>(r2)     // Catch:{ FileNotFoundException -> 0x0089 }
            throw r1     // Catch:{ FileNotFoundException -> 0x0089 }
        L_0x0029:
            android.content.Context r1 = r6.f3190m     // Catch:{ FileNotFoundException -> 0x0089 }
            android.content.ContentResolver r1 = r1.getContentResolver()     // Catch:{ FileNotFoundException -> 0x0089 }
            java.io.InputStream r1 = r1.openInputStream(r7)     // Catch:{ FileNotFoundException -> 0x0089 }
            if (r1 != 0) goto L_0x004c
            java.io.FileNotFoundException r1 = new java.io.FileNotFoundException     // Catch:{ FileNotFoundException -> 0x0089 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x0089 }
            r2.<init>()     // Catch:{ FileNotFoundException -> 0x0089 }
            java.lang.String r3 = "Failed to open "
            r2.append(r3)     // Catch:{ FileNotFoundException -> 0x0089 }
            r2.append(r7)     // Catch:{ FileNotFoundException -> 0x0089 }
            java.lang.String r2 = r2.toString()     // Catch:{ FileNotFoundException -> 0x0089 }
            r1.<init>(r2)     // Catch:{ FileNotFoundException -> 0x0089 }
            throw r1     // Catch:{ FileNotFoundException -> 0x0089 }
        L_0x004c:
            android.graphics.drawable.Drawable r2 = android.graphics.drawable.Drawable.createFromStream(r1, r0)     // Catch:{ all -> 0x006c }
            r1.close()     // Catch:{ IOException -> 0x0054 }
            goto L_0x006b
        L_0x0054:
            r1 = move-exception
            java.lang.String r3 = "SuggestionsAdapter"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x0089 }
            r4.<init>()     // Catch:{ FileNotFoundException -> 0x0089 }
            java.lang.String r5 = "Error closing icon stream for "
            r4.append(r5)     // Catch:{ FileNotFoundException -> 0x0089 }
            r4.append(r7)     // Catch:{ FileNotFoundException -> 0x0089 }
            java.lang.String r4 = r4.toString()     // Catch:{ FileNotFoundException -> 0x0089 }
            android.util.Log.e(r3, r4, r1)     // Catch:{ FileNotFoundException -> 0x0089 }
        L_0x006b:
            return r2
        L_0x006c:
            r2 = move-exception
            r1.close()     // Catch:{ IOException -> 0x0071 }
            goto L_0x0088
        L_0x0071:
            r1 = move-exception
            java.lang.String r3 = "SuggestionsAdapter"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x0089 }
            r4.<init>()     // Catch:{ FileNotFoundException -> 0x0089 }
            java.lang.String r5 = "Error closing icon stream for "
            r4.append(r5)     // Catch:{ FileNotFoundException -> 0x0089 }
            r4.append(r7)     // Catch:{ FileNotFoundException -> 0x0089 }
            java.lang.String r4 = r4.toString()     // Catch:{ FileNotFoundException -> 0x0089 }
            android.util.Log.e(r3, r4, r1)     // Catch:{ FileNotFoundException -> 0x0089 }
        L_0x0088:
            throw r2     // Catch:{ FileNotFoundException -> 0x0089 }
        L_0x0089:
            r1 = move-exception
            java.lang.String r2 = "SuggestionsAdapter"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Icon not found: "
            r3.append(r4)
            r3.append(r7)
            java.lang.String r7 = ", "
            r3.append(r7)
            java.lang.String r7 = r1.getMessage()
            r3.append(r7)
            java.lang.String r7 = r3.toString()
            android.util.Log.w(r2, r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p028v7.widget.C0970as.m4340b(android.net.Uri):android.graphics.drawable.Drawable");
    }

    /* renamed from: b */
    private Drawable m4341b(String str) {
        ConstantState constantState = (ConstantState) this.f3191n.get(str);
        if (constantState == null) {
            return null;
        }
        return constantState.newDrawable();
    }

    /* renamed from: a */
    private void m4338a(String str, Drawable drawable) {
        if (drawable != null) {
            this.f3191n.put(str, drawable.getConstantState());
        }
    }

    /* renamed from: g */
    private Drawable m4346g(Cursor cursor) {
        Drawable a = m4332a(this.f3189l.getSearchActivity());
        if (a != null) {
            return a;
        }
        return this.f1718d.getPackageManager().getDefaultActivityIcon();
    }

    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r2v1, types: [java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v2, types: [android.graphics.drawable.Drawable$ConstantState] */
    /* JADX WARNING: type inference failed for: r2v3, types: [android.graphics.drawable.Drawable] */
    /* JADX WARNING: type inference failed for: r2v4, types: [android.graphics.drawable.Drawable] */
    /* JADX WARNING: type inference failed for: r2v5 */
    /* JADX WARNING: type inference failed for: r2v6 */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r2v0
      assigns: [?[int, float, boolean, short, byte, char, OBJECT, ARRAY], android.graphics.drawable.Drawable, android.graphics.drawable.Drawable$ConstantState]
      uses: [java.lang.Object, android.graphics.drawable.Drawable]
      mth insns count: 21
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
    	at jadx.core.ProcessClass.process(ProcessClass.java:35)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Unknown variable types count: 3 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.graphics.drawable.Drawable m4332a(android.content.ComponentName r4) {
        /*
            r3 = this;
            java.lang.String r0 = r4.flattenToShortString()
            java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable$ConstantState> r1 = r3.f3191n
            boolean r1 = r1.containsKey(r0)
            r2 = 0
            if (r1 == 0) goto L_0x0023
            java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable$ConstantState> r4 = r3.f3191n
            java.lang.Object r4 = r4.get(r0)
            android.graphics.drawable.Drawable$ConstantState r4 = (android.graphics.drawable.Drawable.ConstantState) r4
            if (r4 != 0) goto L_0x0018
            goto L_0x0022
        L_0x0018:
            android.content.Context r0 = r3.f3190m
            android.content.res.Resources r0 = r0.getResources()
            android.graphics.drawable.Drawable r2 = r4.newDrawable(r0)
        L_0x0022:
            return r2
        L_0x0023:
            android.graphics.drawable.Drawable r4 = r3.m4339b(r4)
            if (r4 != 0) goto L_0x002a
            goto L_0x002e
        L_0x002a:
            android.graphics.drawable.Drawable$ConstantState r2 = r4.getConstantState()
        L_0x002e:
            java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable$ConstantState> r1 = r3.f3191n
            r1.put(r0, r2)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p028v7.widget.C0970as.m4332a(android.content.ComponentName):android.graphics.drawable.Drawable");
    }

    /* renamed from: b */
    private Drawable m4339b(ComponentName componentName) {
        PackageManager packageManager = this.f1718d.getPackageManager();
        try {
            ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, 128);
            int iconResource = activityInfo.getIconResource();
            if (iconResource == 0) {
                return null;
            }
            Drawable drawable = packageManager.getDrawable(componentName.getPackageName(), iconResource, activityInfo.applicationInfo);
            if (drawable != null) {
                return drawable;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Invalid icon resource ");
            sb.append(iconResource);
            sb.append(" for ");
            sb.append(componentName.flattenToShortString());
            Log.w("SuggestionsAdapter", sb.toString());
            return null;
        } catch (NameNotFoundException e) {
            Log.w("SuggestionsAdapter", e.toString());
            return null;
        }
    }

    /* renamed from: a */
    public static String m4335a(Cursor cursor, String str) {
        return m4334a(cursor, cursor.getColumnIndex(str));
    }

    /* renamed from: a */
    private static String m4334a(Cursor cursor, int i) {
        if (i == -1) {
            return null;
        }
        try {
            return cursor.getString(i);
        } catch (Exception e) {
            Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e);
            return null;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public Drawable mo5071a(Uri uri) throws FileNotFoundException {
        int i;
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            StringBuilder sb = new StringBuilder();
            sb.append("No authority: ");
            sb.append(uri);
            throw new FileNotFoundException(sb.toString());
        }
        try {
            Resources resourcesForApplication = this.f1718d.getPackageManager().getResourcesForApplication(authority);
            List pathSegments = uri.getPathSegments();
            if (pathSegments == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("No path: ");
                sb2.append(uri);
                throw new FileNotFoundException(sb2.toString());
            }
            int size = pathSegments.size();
            if (size == 1) {
                try {
                    i = Integer.parseInt((String) pathSegments.get(0));
                } catch (NumberFormatException unused) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("Single path segment is not a resource ID: ");
                    sb3.append(uri);
                    throw new FileNotFoundException(sb3.toString());
                }
            } else if (size == 2) {
                i = resourcesForApplication.getIdentifier((String) pathSegments.get(1), (String) pathSegments.get(0), authority);
            } else {
                StringBuilder sb4 = new StringBuilder();
                sb4.append("More than two path segments: ");
                sb4.append(uri);
                throw new FileNotFoundException(sb4.toString());
            }
            if (i != 0) {
                return resourcesForApplication.getDrawable(i);
            }
            StringBuilder sb5 = new StringBuilder();
            sb5.append("No resource found for: ");
            sb5.append(uri);
            throw new FileNotFoundException(sb5.toString());
        } catch (NameNotFoundException unused2) {
            StringBuilder sb6 = new StringBuilder();
            sb6.append("No package found for authority: ");
            sb6.append(uri);
            throw new FileNotFoundException(sb6.toString());
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public Cursor mo5070a(SearchableInfo searchableInfo, String str, int i) {
        String[] strArr = null;
        if (searchableInfo == null) {
            return null;
        }
        String suggestAuthority = searchableInfo.getSuggestAuthority();
        if (suggestAuthority == null) {
            return null;
        }
        Builder fragment = new Builder().scheme("content").authority(suggestAuthority).query("").fragment("");
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            fragment.appendEncodedPath(suggestPath);
        }
        fragment.appendPath("search_suggest_query");
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new String[]{str};
        } else {
            fragment.appendPath(str);
        }
        String[] strArr2 = strArr;
        if (i > 0) {
            fragment.appendQueryParameter("limit", String.valueOf(i));
        }
        return this.f1718d.getContentResolver().query(fragment.build(), null, suggestSelection, strArr2, null);
    }
}
