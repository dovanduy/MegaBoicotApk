package android.support.p017v4.content.p022a;

import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: android.support.v4.content.a.g */
/* compiled from: TypedArrayUtils */
public class C0354g {
    /* renamed from: a */
    public static boolean m1307a(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    /* renamed from: a */
    public static float m1301a(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, float f) {
        if (!m1307a(xmlPullParser, str)) {
            return f;
        }
        return typedArray.getFloat(i, f);
    }

    /* renamed from: a */
    public static boolean m1306a(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, boolean z) {
        if (!m1307a(xmlPullParser, str)) {
            return z;
        }
        return typedArray.getBoolean(i, z);
    }

    /* renamed from: a */
    public static int m1302a(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, int i2) {
        if (!m1307a(xmlPullParser, str)) {
            return i2;
        }
        return typedArray.getInt(i, i2);
    }

    /* renamed from: b */
    public static int m1308b(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, int i2) {
        if (!m1307a(xmlPullParser, str)) {
            return i2;
        }
        return typedArray.getColor(i, i2);
    }

    /* renamed from: a */
    public static C0341b m1304a(TypedArray typedArray, XmlPullParser xmlPullParser, Theme theme, String str, int i, int i2) {
        if (m1307a(xmlPullParser, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i, typedValue);
            if (typedValue.type >= 28 && typedValue.type <= 31) {
                return C0341b.m1256a(typedValue.data);
            }
            C0341b a = C0341b.m1258a(typedArray.getResources(), typedArray.getResourceId(i, 0), theme);
            if (a != null) {
                return a;
            }
        }
        return C0341b.m1256a(i2);
    }

    /* renamed from: c */
    public static int m1310c(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, int i2) {
        if (!m1307a(xmlPullParser, str)) {
            return i2;
        }
        return typedArray.getResourceId(i, i2);
    }

    /* renamed from: a */
    public static String m1305a(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i) {
        if (!m1307a(xmlPullParser, str)) {
            return null;
        }
        return typedArray.getString(i);
    }

    /* renamed from: b */
    public static TypedValue m1309b(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i) {
        if (!m1307a(xmlPullParser, str)) {
            return null;
        }
        return typedArray.peekValue(i);
    }

    /* renamed from: a */
    public static TypedArray m1303a(Resources resources, Theme theme, AttributeSet attributeSet, int[] iArr) {
        if (theme == null) {
            return resources.obtainAttributes(attributeSet, iArr);
        }
        return theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }
}
