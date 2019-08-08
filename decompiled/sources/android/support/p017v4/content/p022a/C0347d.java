package android.support.p017v4.content.p022a;

import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.Shader.TileMode;
import android.graphics.SweepGradient;
import android.support.p012a.C0118a.C0125g;
import android.util.AttributeSet;
import com.appnext.base.p046b.C1245d;
import java.io.IOException;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: android.support.v4.content.a.d */
/* compiled from: GradientColorInflaterCompat */
final class C0347d {

    /* renamed from: android.support.v4.content.a.d$a */
    /* compiled from: GradientColorInflaterCompat */
    static final class C0348a {

        /* renamed from: a */
        final int[] f885a;

        /* renamed from: b */
        final float[] f886b;

        C0348a(List<Integer> list, List<Float> list2) {
            int size = list.size();
            this.f885a = new int[size];
            this.f886b = new float[size];
            for (int i = 0; i < size; i++) {
                this.f885a[i] = ((Integer) list.get(i)).intValue();
                this.f886b[i] = ((Float) list2.get(i)).floatValue();
            }
        }

        C0348a(int i, int i2) {
            this.f885a = new int[]{i, i2};
            this.f886b = new float[]{0.0f, 1.0f};
        }

        C0348a(int i, int i2, int i3) {
            this.f885a = new int[]{i, i2, i3};
            this.f886b = new float[]{0.0f, 0.5f, 1.0f};
        }
    }

    /* renamed from: a */
    static Shader m1287a(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) throws IOException, XmlPullParserException {
        XmlPullParser xmlPullParser2 = xmlPullParser;
        String name = xmlPullParser.getName();
        if (!name.equals("gradient")) {
            StringBuilder sb = new StringBuilder();
            sb.append(xmlPullParser.getPositionDescription());
            sb.append(": invalid gradient color tag ");
            sb.append(name);
            throw new XmlPullParserException(sb.toString());
        }
        Theme theme2 = theme;
        TypedArray a = C0354g.m1303a(resources, theme2, attributeSet, C0125g.GradientColor);
        float a2 = C0354g.m1301a(a, xmlPullParser2, "startX", C0125g.GradientColor_android_startX, 0.0f);
        float a3 = C0354g.m1301a(a, xmlPullParser2, "startY", C0125g.GradientColor_android_startY, 0.0f);
        float a4 = C0354g.m1301a(a, xmlPullParser2, "endX", C0125g.GradientColor_android_endX, 0.0f);
        float a5 = C0354g.m1301a(a, xmlPullParser2, "endY", C0125g.GradientColor_android_endY, 0.0f);
        float a6 = C0354g.m1301a(a, xmlPullParser2, "centerX", C0125g.GradientColor_android_centerX, 0.0f);
        float a7 = C0354g.m1301a(a, xmlPullParser2, "centerY", C0125g.GradientColor_android_centerY, 0.0f);
        int a8 = C0354g.m1302a(a, xmlPullParser2, C1245d.f3961jd, C0125g.GradientColor_android_type, 0);
        int b = C0354g.m1308b(a, xmlPullParser2, "startColor", C0125g.GradientColor_android_startColor, 0);
        boolean a9 = C0354g.m1307a(xmlPullParser2, "centerColor");
        float f = a5;
        int b2 = C0354g.m1308b(a, xmlPullParser2, "centerColor", C0125g.GradientColor_android_centerColor, 0);
        float f2 = a4;
        int b3 = C0354g.m1308b(a, xmlPullParser2, "endColor", C0125g.GradientColor_android_endColor, 0);
        float f3 = a3;
        int a10 = C0354g.m1302a(a, xmlPullParser2, "tileMode", C0125g.GradientColor_android_tileMode, 0);
        float f4 = a2;
        float a11 = C0354g.m1301a(a, xmlPullParser2, "gradientRadius", C0125g.GradientColor_android_gradientRadius, 0.0f);
        a.recycle();
        C0348a a12 = m1288a(m1289b(resources, xmlPullParser, attributeSet, theme), b, b3, a9, b2);
        switch (a8) {
            case 1:
                if (a11 <= 0.0f) {
                    throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
                }
                int[] iArr = a12.f885a;
                RadialGradient radialGradient = new RadialGradient(a6, a7, a11, iArr, a12.f886b, m1286a(a10));
                return radialGradient;
            case 2:
                return new SweepGradient(a6, a7, a12.f885a, a12.f886b);
            default:
                LinearGradient linearGradient = new LinearGradient(f4, f3, f2, f, a12.f885a, a12.f886b, m1286a(a10));
                return linearGradient;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x008a, code lost:
        throw new org.xmlpull.v1.XmlPullParserException(r10.toString());
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.support.p017v4.content.p022a.C0347d.C0348a m1289b(android.content.res.Resources r8, org.xmlpull.v1.XmlPullParser r9, android.util.AttributeSet r10, android.content.res.Resources.Theme r11) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            int r0 = r9.getDepth()
            r1 = 1
            int r0 = r0 + r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 20
            r2.<init>(r3)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r3)
        L_0x0012:
            int r3 = r9.next()
            if (r3 == r1) goto L_0x008b
            int r5 = r9.getDepth()
            if (r5 >= r0) goto L_0x0021
            r6 = 3
            if (r3 == r6) goto L_0x008b
        L_0x0021:
            r6 = 2
            if (r3 == r6) goto L_0x0025
            goto L_0x0012
        L_0x0025:
            if (r5 > r0) goto L_0x0012
            java.lang.String r3 = r9.getName()
            java.lang.String r5 = "item"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L_0x0034
            goto L_0x0012
        L_0x0034:
            int[] r3 = android.support.p012a.C0118a.C0125g.GradientColorItem
            android.content.res.TypedArray r3 = android.support.p017v4.content.p022a.C0354g.m1303a(r8, r11, r10, r3)
            int r5 = android.support.p012a.C0118a.C0125g.GradientColorItem_android_color
            boolean r5 = r3.hasValue(r5)
            int r6 = android.support.p012a.C0118a.C0125g.GradientColorItem_android_offset
            boolean r6 = r3.hasValue(r6)
            if (r5 == 0) goto L_0x006b
            if (r6 != 0) goto L_0x004b
            goto L_0x006b
        L_0x004b:
            int r5 = android.support.p012a.C0118a.C0125g.GradientColorItem_android_color
            r6 = 0
            int r5 = r3.getColor(r5, r6)
            int r6 = android.support.p012a.C0118a.C0125g.GradientColorItem_android_offset
            r7 = 0
            float r6 = r3.getFloat(r6, r7)
            r3.recycle()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
            r4.add(r3)
            java.lang.Float r3 = java.lang.Float.valueOf(r6)
            r2.add(r3)
            goto L_0x0012
        L_0x006b:
            org.xmlpull.v1.XmlPullParserException r8 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r9 = r9.getPositionDescription()
            r10.append(r9)
            java.lang.String r9 = ": <item> tag requires a 'color' attribute and a 'offset' "
            r10.append(r9)
            java.lang.String r9 = "attribute!"
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            r8.<init>(r9)
            throw r8
        L_0x008b:
            int r8 = r4.size()
            if (r8 <= 0) goto L_0x0097
            android.support.v4.content.a.d$a r8 = new android.support.v4.content.a.d$a
            r8.<init>(r4, r2)
            return r8
        L_0x0097:
            r8 = 0
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p017v4.content.p022a.C0347d.m1289b(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):android.support.v4.content.a.d$a");
    }

    /* renamed from: a */
    private static C0348a m1288a(C0348a aVar, int i, int i2, boolean z, int i3) {
        if (aVar != null) {
            return aVar;
        }
        if (z) {
            return new C0348a(i, i3, i2);
        }
        return new C0348a(i, i2);
    }

    /* renamed from: a */
    private static TileMode m1286a(int i) {
        switch (i) {
            case 1:
                return TileMode.REPEAT;
            case 2:
                return TileMode.MIRROR;
            default:
                return TileMode.CLAMP;
        }
    }
}
