package android.support.p017v4.content.p022a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.graphics.Shader;
import android.util.Log;

/* renamed from: android.support.v4.content.a.b */
/* compiled from: ComplexColorCompat */
public final class C0341b {

    /* renamed from: a */
    private final Shader f872a;

    /* renamed from: b */
    private final ColorStateList f873b;

    /* renamed from: c */
    private int f874c;

    private C0341b(Shader shader, ColorStateList colorStateList, int i) {
        this.f872a = shader;
        this.f873b = colorStateList;
        this.f874c = i;
    }

    /* renamed from: a */
    static C0341b m1259a(Shader shader) {
        return new C0341b(shader, null, 0);
    }

    /* renamed from: a */
    static C0341b m1257a(ColorStateList colorStateList) {
        return new C0341b(null, colorStateList, colorStateList.getDefaultColor());
    }

    /* renamed from: a */
    static C0341b m1256a(int i) {
        return new C0341b(null, null, i);
    }

    /* renamed from: a */
    public Shader mo1196a() {
        return this.f872a;
    }

    /* renamed from: b */
    public int mo1198b() {
        return this.f874c;
    }

    /* renamed from: b */
    public void mo1199b(int i) {
        this.f874c = i;
    }

    /* renamed from: c */
    public boolean mo1200c() {
        return this.f872a != null;
    }

    /* renamed from: d */
    public boolean mo1201d() {
        return this.f872a == null && this.f873b != null && this.f873b.isStateful();
    }

    /* renamed from: a */
    public boolean mo1197a(int[] iArr) {
        if (mo1201d()) {
            int colorForState = this.f873b.getColorForState(iArr, this.f873b.getDefaultColor());
            if (colorForState != this.f874c) {
                this.f874c = colorForState;
                return true;
            }
        }
        return false;
    }

    /* renamed from: e */
    public boolean mo1202e() {
        return mo1200c() || this.f874c != 0;
    }

    /* renamed from: a */
    public static C0341b m1258a(Resources resources, int i, Theme theme) {
        try {
            return m1260b(resources, i, theme);
        } catch (Exception e) {
            Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", e);
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0041, code lost:
        if (r1.equals("gradient") != false) goto L_0x0045;
     */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x006f  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.support.p017v4.content.p022a.C0341b m1260b(android.content.res.Resources r6, int r7, android.content.res.Resources.Theme r8) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException {
        /*
            android.content.res.XmlResourceParser r7 = r6.getXml(r7)
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r7)
        L_0x0008:
            int r1 = r7.next()
            r2 = 1
            r3 = 2
            if (r1 == r3) goto L_0x0013
            if (r1 == r2) goto L_0x0013
            goto L_0x0008
        L_0x0013:
            if (r1 == r3) goto L_0x001d
            org.xmlpull.v1.XmlPullParserException r6 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r7 = "No start tag found"
            r6.<init>(r7)
            throw r6
        L_0x001d:
            java.lang.String r1 = r7.getName()
            r3 = -1
            int r4 = r1.hashCode()
            r5 = 89650992(0x557f730, float:1.01546526E-35)
            if (r4 == r5) goto L_0x003b
            r2 = 1191572447(0x4705f3df, float:34291.87)
            if (r4 == r2) goto L_0x0031
            goto L_0x0044
        L_0x0031:
            java.lang.String r2 = "selector"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0044
            r2 = 0
            goto L_0x0045
        L_0x003b:
            java.lang.String r4 = "gradient"
            boolean r4 = r1.equals(r4)
            if (r4 == 0) goto L_0x0044
            goto L_0x0045
        L_0x0044:
            r2 = r3
        L_0x0045:
            switch(r2) {
                case 0: goto L_0x006f;
                case 1: goto L_0x0066;
                default: goto L_0x0048;
            }
        L_0x0048:
            org.xmlpull.v1.XmlPullParserException r6 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r7 = r7.getPositionDescription()
            r8.append(r7)
            java.lang.String r7 = ": unsupported complex color tag "
            r8.append(r7)
            r8.append(r1)
            java.lang.String r7 = r8.toString()
            r6.<init>(r7)
            throw r6
        L_0x0066:
            android.graphics.Shader r6 = android.support.p017v4.content.p022a.C0347d.m1287a(r6, r7, r0, r8)
            android.support.v4.content.a.b r6 = m1259a(r6)
            return r6
        L_0x006f:
            android.content.res.ColorStateList r6 = android.support.p017v4.content.p022a.C0340a.m1253a(r6, r7, r0, r8)
            android.support.v4.content.a.b r6 = m1257a(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p017v4.content.p022a.C0341b.m1260b(android.content.res.Resources, int, android.content.res.Resources$Theme):android.support.v4.content.a.b");
    }
}
