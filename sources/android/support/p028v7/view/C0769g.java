package android.support.p028v7.view;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff.Mode;
import android.support.p017v4.view.C0572b;
import android.support.p017v4.view.C0584g;
import android.support.p028v7.p029a.C0672a.C0682j;
import android.support.p028v7.view.menu.C0794j;
import android.support.p028v7.view.menu.C0796k;
import android.support.p028v7.widget.C1043w;
import android.util.AttributeSet;
import android.util.Log;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.SubMenu;
import android.view.View;
import com.google.android.exoplayer2.extractor.MpegAudioHeader;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: android.support.v7.view.g */
/* compiled from: SupportMenuInflater */
public class C0769g extends MenuInflater {

    /* renamed from: a */
    static final Class<?>[] f2171a = {Context.class};

    /* renamed from: b */
    static final Class<?>[] f2172b = f2171a;

    /* renamed from: c */
    final Object[] f2173c;

    /* renamed from: d */
    final Object[] f2174d = this.f2173c;

    /* renamed from: e */
    Context f2175e;

    /* renamed from: f */
    private Object f2176f;

    /* renamed from: android.support.v7.view.g$a */
    /* compiled from: SupportMenuInflater */
    private static class C0770a implements OnMenuItemClickListener {

        /* renamed from: a */
        private static final Class<?>[] f2177a = {MenuItem.class};

        /* renamed from: b */
        private Object f2178b;

        /* renamed from: c */
        private Method f2179c;

        public C0770a(Object obj, String str) {
            this.f2178b = obj;
            Class cls = obj.getClass();
            try {
                this.f2179c = cls.getMethod(str, f2177a);
            } catch (Exception e) {
                StringBuilder sb = new StringBuilder();
                sb.append("Couldn't resolve menu item onClick handler ");
                sb.append(str);
                sb.append(" in class ");
                sb.append(cls.getName());
                InflateException inflateException = new InflateException(sb.toString());
                inflateException.initCause(e);
                throw inflateException;
            }
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            try {
                if (this.f2179c.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) this.f2179c.invoke(this.f2178b, new Object[]{menuItem})).booleanValue();
                }
                this.f2179c.invoke(this.f2178b, new Object[]{menuItem});
                return true;
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* renamed from: android.support.v7.view.g$b */
    /* compiled from: SupportMenuInflater */
    private class C0771b {

        /* renamed from: A */
        private String f2180A;

        /* renamed from: B */
        private String f2181B;

        /* renamed from: C */
        private CharSequence f2182C;

        /* renamed from: D */
        private CharSequence f2183D;

        /* renamed from: E */
        private ColorStateList f2184E = null;

        /* renamed from: F */
        private Mode f2185F = null;

        /* renamed from: a */
        C0572b f2186a;

        /* renamed from: c */
        private Menu f2188c;

        /* renamed from: d */
        private int f2189d;

        /* renamed from: e */
        private int f2190e;

        /* renamed from: f */
        private int f2191f;

        /* renamed from: g */
        private int f2192g;

        /* renamed from: h */
        private boolean f2193h;

        /* renamed from: i */
        private boolean f2194i;

        /* renamed from: j */
        private boolean f2195j;

        /* renamed from: k */
        private int f2196k;

        /* renamed from: l */
        private int f2197l;

        /* renamed from: m */
        private CharSequence f2198m;

        /* renamed from: n */
        private CharSequence f2199n;

        /* renamed from: o */
        private int f2200o;

        /* renamed from: p */
        private char f2201p;

        /* renamed from: q */
        private int f2202q;

        /* renamed from: r */
        private char f2203r;

        /* renamed from: s */
        private int f2204s;

        /* renamed from: t */
        private int f2205t;

        /* renamed from: u */
        private boolean f2206u;

        /* renamed from: v */
        private boolean f2207v;

        /* renamed from: w */
        private boolean f2208w;

        /* renamed from: x */
        private int f2209x;

        /* renamed from: y */
        private int f2210y;

        /* renamed from: z */
        private String f2211z;

        public C0771b(Menu menu) {
            this.f2188c = menu;
            mo2987a();
        }

        /* renamed from: a */
        public void mo2987a() {
            this.f2189d = 0;
            this.f2190e = 0;
            this.f2191f = 0;
            this.f2192g = 0;
            this.f2193h = true;
            this.f2194i = true;
        }

        /* renamed from: a */
        public void mo2988a(AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = C0769g.this.f2175e.obtainStyledAttributes(attributeSet, C0682j.MenuGroup);
            this.f2189d = obtainStyledAttributes.getResourceId(C0682j.MenuGroup_android_id, 0);
            this.f2190e = obtainStyledAttributes.getInt(C0682j.MenuGroup_android_menuCategory, 0);
            this.f2191f = obtainStyledAttributes.getInt(C0682j.MenuGroup_android_orderInCategory, 0);
            this.f2192g = obtainStyledAttributes.getInt(C0682j.MenuGroup_android_checkableBehavior, 0);
            this.f2193h = obtainStyledAttributes.getBoolean(C0682j.MenuGroup_android_visible, true);
            this.f2194i = obtainStyledAttributes.getBoolean(C0682j.MenuGroup_android_enabled, true);
            obtainStyledAttributes.recycle();
        }

        /* renamed from: b */
        public void mo2990b(AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = C0769g.this.f2175e.obtainStyledAttributes(attributeSet, C0682j.MenuItem);
            this.f2196k = obtainStyledAttributes.getResourceId(C0682j.MenuItem_android_id, 0);
            this.f2197l = (obtainStyledAttributes.getInt(C0682j.MenuItem_android_menuCategory, this.f2190e) & -65536) | (obtainStyledAttributes.getInt(C0682j.MenuItem_android_orderInCategory, this.f2191f) & 65535);
            this.f2198m = obtainStyledAttributes.getText(C0682j.MenuItem_android_title);
            this.f2199n = obtainStyledAttributes.getText(C0682j.MenuItem_android_titleCondensed);
            this.f2200o = obtainStyledAttributes.getResourceId(C0682j.MenuItem_android_icon, 0);
            this.f2201p = m3157a(obtainStyledAttributes.getString(C0682j.MenuItem_android_alphabeticShortcut));
            this.f2202q = obtainStyledAttributes.getInt(C0682j.MenuItem_alphabeticModifiers, MpegAudioHeader.MAX_FRAME_SIZE_BYTES);
            this.f2203r = m3157a(obtainStyledAttributes.getString(C0682j.MenuItem_android_numericShortcut));
            this.f2204s = obtainStyledAttributes.getInt(C0682j.MenuItem_numericModifiers, MpegAudioHeader.MAX_FRAME_SIZE_BYTES);
            if (obtainStyledAttributes.hasValue(C0682j.MenuItem_android_checkable)) {
                this.f2205t = obtainStyledAttributes.getBoolean(C0682j.MenuItem_android_checkable, false) ? 1 : 0;
            } else {
                this.f2205t = this.f2192g;
            }
            this.f2206u = obtainStyledAttributes.getBoolean(C0682j.MenuItem_android_checked, false);
            this.f2207v = obtainStyledAttributes.getBoolean(C0682j.MenuItem_android_visible, this.f2193h);
            this.f2208w = obtainStyledAttributes.getBoolean(C0682j.MenuItem_android_enabled, this.f2194i);
            this.f2209x = obtainStyledAttributes.getInt(C0682j.MenuItem_showAsAction, -1);
            this.f2181B = obtainStyledAttributes.getString(C0682j.MenuItem_android_onClick);
            this.f2210y = obtainStyledAttributes.getResourceId(C0682j.MenuItem_actionLayout, 0);
            this.f2211z = obtainStyledAttributes.getString(C0682j.MenuItem_actionViewClass);
            this.f2180A = obtainStyledAttributes.getString(C0682j.MenuItem_actionProviderClass);
            boolean z = this.f2180A != null;
            if (z && this.f2210y == 0 && this.f2211z == null) {
                this.f2186a = (C0572b) m3158a(this.f2180A, C0769g.f2172b, C0769g.this.f2174d);
            } else {
                if (z) {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                }
                this.f2186a = null;
            }
            this.f2182C = obtainStyledAttributes.getText(C0682j.MenuItem_contentDescription);
            this.f2183D = obtainStyledAttributes.getText(C0682j.MenuItem_tooltipText);
            if (obtainStyledAttributes.hasValue(C0682j.MenuItem_iconTintMode)) {
                this.f2185F = C1043w.m4824a(obtainStyledAttributes.getInt(C0682j.MenuItem_iconTintMode, -1), this.f2185F);
            } else {
                this.f2185F = null;
            }
            if (obtainStyledAttributes.hasValue(C0682j.MenuItem_iconTint)) {
                this.f2184E = obtainStyledAttributes.getColorStateList(C0682j.MenuItem_iconTint);
            } else {
                this.f2184E = null;
            }
            obtainStyledAttributes.recycle();
            this.f2195j = false;
        }

        /* renamed from: a */
        private char m3157a(String str) {
            if (str == null) {
                return 0;
            }
            return str.charAt(0);
        }

        /* renamed from: a */
        private void m3159a(MenuItem menuItem) {
            boolean z = false;
            menuItem.setChecked(this.f2206u).setVisible(this.f2207v).setEnabled(this.f2208w).setCheckable(this.f2205t >= 1).setTitleCondensed(this.f2199n).setIcon(this.f2200o);
            if (this.f2209x >= 0) {
                menuItem.setShowAsAction(this.f2209x);
            }
            if (this.f2181B != null) {
                if (C0769g.this.f2175e.isRestricted()) {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
                menuItem.setOnMenuItemClickListener(new C0770a(C0769g.this.mo2984a(), this.f2181B));
            }
            boolean z2 = menuItem instanceof C0794j;
            if (z2) {
                C0794j jVar = (C0794j) menuItem;
            }
            if (this.f2205t >= 2) {
                if (z2) {
                    ((C0794j) menuItem).mo3239a(true);
                } else if (menuItem instanceof C0796k) {
                    ((C0796k) menuItem).mo3295a(true);
                }
            }
            if (this.f2211z != null) {
                menuItem.setActionView((View) m3158a(this.f2211z, C0769g.f2171a, C0769g.this.f2173c));
                z = true;
            }
            if (this.f2210y > 0) {
                if (!z) {
                    menuItem.setActionView(this.f2210y);
                } else {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
                }
            }
            if (this.f2186a != null) {
                C0584g.m2192a(menuItem, this.f2186a);
            }
            C0584g.m2196a(menuItem, this.f2182C);
            C0584g.m2198b(menuItem, this.f2183D);
            C0584g.m2197b(menuItem, this.f2201p, this.f2202q);
            C0584g.m2193a(menuItem, this.f2203r, this.f2204s);
            if (this.f2185F != null) {
                C0584g.m2195a(menuItem, this.f2185F);
            }
            if (this.f2184E != null) {
                C0584g.m2194a(menuItem, this.f2184E);
            }
        }

        /* renamed from: b */
        public void mo2989b() {
            this.f2195j = true;
            m3159a(this.f2188c.add(this.f2189d, this.f2196k, this.f2197l, this.f2198m));
        }

        /* renamed from: c */
        public SubMenu mo2991c() {
            this.f2195j = true;
            SubMenu addSubMenu = this.f2188c.addSubMenu(this.f2189d, this.f2196k, this.f2197l, this.f2198m);
            m3159a(addSubMenu.getItem());
            return addSubMenu;
        }

        /* renamed from: d */
        public boolean mo2992d() {
            return this.f2195j;
        }

        /* renamed from: a */
        private <T> T m3158a(String str, Class<?>[] clsArr, Object[] objArr) {
            try {
                Constructor constructor = C0769g.this.f2175e.getClassLoader().loadClass(str).getConstructor(clsArr);
                constructor.setAccessible(true);
                return constructor.newInstance(objArr);
            } catch (Exception e) {
                StringBuilder sb = new StringBuilder();
                sb.append("Cannot instantiate class: ");
                sb.append(str);
                Log.w("SupportMenuInflater", sb.toString(), e);
                return null;
            }
        }
    }

    public C0769g(Context context) {
        super(context);
        this.f2175e = context;
        this.f2173c = new Object[]{context};
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x003f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void inflate(int r3, android.view.Menu r4) {
        /*
            r2 = this;
            boolean r0 = r4 instanceof android.support.p017v4.p018a.p019a.C0205a
            if (r0 != 0) goto L_0x0008
            super.inflate(r3, r4)
            return
        L_0x0008:
            r0 = 0
            android.content.Context r1 = r2.f2175e     // Catch:{ XmlPullParserException -> 0x0034, IOException -> 0x002b }
            android.content.res.Resources r1 = r1.getResources()     // Catch:{ XmlPullParserException -> 0x0034, IOException -> 0x002b }
            android.content.res.XmlResourceParser r3 = r1.getLayout(r3)     // Catch:{ XmlPullParserException -> 0x0034, IOException -> 0x002b }
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r3)     // Catch:{ XmlPullParserException -> 0x0026, IOException -> 0x0023, all -> 0x0020 }
            r2.m3155a(r3, r0, r4)     // Catch:{ XmlPullParserException -> 0x0026, IOException -> 0x0023, all -> 0x0020 }
            if (r3 == 0) goto L_0x001f
            r3.close()
        L_0x001f:
            return
        L_0x0020:
            r4 = move-exception
            r0 = r3
            goto L_0x003d
        L_0x0023:
            r4 = move-exception
            r0 = r3
            goto L_0x002c
        L_0x0026:
            r4 = move-exception
            r0 = r3
            goto L_0x0035
        L_0x0029:
            r4 = move-exception
            goto L_0x003d
        L_0x002b:
            r4 = move-exception
        L_0x002c:
            android.view.InflateException r3 = new android.view.InflateException     // Catch:{ all -> 0x0029 }
            java.lang.String r1 = "Error inflating menu XML"
            r3.<init>(r1, r4)     // Catch:{ all -> 0x0029 }
            throw r3     // Catch:{ all -> 0x0029 }
        L_0x0034:
            r4 = move-exception
        L_0x0035:
            android.view.InflateException r3 = new android.view.InflateException     // Catch:{ all -> 0x0029 }
            java.lang.String r1 = "Error inflating menu XML"
            r3.<init>(r1, r4)     // Catch:{ all -> 0x0029 }
            throw r3     // Catch:{ all -> 0x0029 }
        L_0x003d:
            if (r0 == 0) goto L_0x0042
            r0.close()
        L_0x0042:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p028v7.view.C0769g.inflate(int, android.view.Menu):void");
    }

    /* renamed from: a */
    private void m3155a(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) throws XmlPullParserException, IOException {
        C0771b bVar = new C0771b(menu);
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType != 2) {
                eventType = xmlPullParser.next();
                if (eventType == 1) {
                    break;
                }
            } else {
                String name = xmlPullParser.getName();
                if (name.equals("menu")) {
                    eventType = xmlPullParser.next();
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Expecting menu, got ");
                    sb.append(name);
                    throw new RuntimeException(sb.toString());
                }
            }
        }
        int i = eventType;
        String str = null;
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            switch (i) {
                case 1:
                    throw new RuntimeException("Unexpected end of document");
                case 2:
                    if (!z2) {
                        String name2 = xmlPullParser.getName();
                        if (!name2.equals("group")) {
                            if (!name2.equals("item")) {
                                if (!name2.equals("menu")) {
                                    z2 = true;
                                    str = name2;
                                    break;
                                } else {
                                    m3155a(xmlPullParser, attributeSet, bVar.mo2991c());
                                    break;
                                }
                            } else {
                                bVar.mo2990b(attributeSet);
                                break;
                            }
                        } else {
                            bVar.mo2988a(attributeSet);
                            break;
                        }
                    } else {
                        break;
                    }
                case 3:
                    String name3 = xmlPullParser.getName();
                    if (!z2 || !name3.equals(str)) {
                        if (!name3.equals("group")) {
                            if (!name3.equals("item")) {
                                if (!name3.equals("menu")) {
                                    break;
                                } else {
                                    z = true;
                                    break;
                                }
                            } else if (!bVar.mo2992d()) {
                                if (bVar.f2186a != null && bVar.f2186a.mo2062e()) {
                                    bVar.mo2991c();
                                    break;
                                } else {
                                    bVar.mo2989b();
                                    break;
                                }
                            } else {
                                break;
                            }
                        } else {
                            bVar.mo2987a();
                            break;
                        }
                    } else {
                        str = null;
                        z2 = false;
                        break;
                    }
            }
            i = xmlPullParser.next();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public Object mo2984a() {
        if (this.f2176f == null) {
            this.f2176f = m3154a(this.f2175e);
        }
        return this.f2176f;
    }

    /* renamed from: a */
    private Object m3154a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? m3154a(((ContextWrapper) obj).getBaseContext()) : obj;
    }
}
